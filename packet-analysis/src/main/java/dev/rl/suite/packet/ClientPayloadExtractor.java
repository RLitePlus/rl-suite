package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Extracts the payload structure (ordered buffer-write sequence) for every
 * client-to-server packet in an injected client jar.
 *
 * <p>Unlike server packets, which are dispatched through centralized handler
 * methods, client packets are written at scattered call sites throughout the
 * codebase. Each site references a ClientPacket field via GETSTATIC, then
 * writes the payload fields to the buffer. The same packet may appear at
 * multiple sites; the longest write sequence is taken as the canonical payload.
 */
public final class ClientPayloadExtractor
{
    private static final int FORWARD_WALK_LIMIT = 80;

    /** How far past the packet constant to look for the builder-creating call. */
    private static final int BUILDER_LOOKAHEAD = 12;

    private ClientPayloadExtractor()
    {
    }

    public static Result extract(JarArchive archive)
    {
        Map<PacketDirection, PacketTable> tables = PacketTableReader.read(archive);
        PacketTable clientTable = tables.get(PacketDirection.CLIENT);
        PacketTable serverTable = tables.get(PacketDirection.SERVER);

        String clientOwner = clientTable.getOwner();
        Map<String, Integer> fieldToId = new LinkedHashMap<>();
        Map<Integer, Integer> idToLength = new LinkedHashMap<>();
        for (PacketTable.Entry entry : clientTable.getEntries())
        {
            fieldToId.put(entry.getField().getName(), entry.getId());
            idToLength.put(entry.getId(), entry.getLength());
        }

        String bufferClassName = PayloadExtractor.findBufferClass(archive);
        Set<String> bufferHierarchy = new HashSet<>();
        Map<String, BufferMethod> bufferMethods = PayloadExtractor.indexBufferMethods(
            archive, bufferClassName, bufferHierarchy);

        Map<Integer, List<SiteData>> sitesByPacket = new TreeMap<>();

        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                scanMethod(method, clientOwner, fieldToId,
                    bufferHierarchy, bufferMethods, sitesByPacket);
            }
        }

        Map<Integer, PacketPayload> payloads = new TreeMap<>();
        Map<Integer, List<PacketPayload>> allVariants = new TreeMap<>();
        for (Map.Entry<Integer, List<SiteData>> entry : sitesByPacket.entrySet())
        {
            int id = entry.getKey();
            int length = idToLength.getOrDefault(id, Integer.MIN_VALUE);

            SiteData best = chooseBest(entry.getValue());
            payloads.put(id, new PacketPayload(length, best.writes,
                best.callDescs, best.fieldDescs, best.constants,
                best.rawFieldRefs, best.rawCallRefs,
                best.insnCount, best.branchCount));

            Set<String> seen = new HashSet<>();
            List<PacketPayload> variants = new ArrayList<>();
            for (SiteData site : entry.getValue())
            {
                if (site.writes.isEmpty()) continue;
                PacketPayload variant = new PacketPayload(length, site.writes,
                    site.callDescs, site.fieldDescs, site.constants,
                    site.rawFieldRefs, site.rawCallRefs,
                    site.insnCount, site.branchCount);
                String sig = variant.structuralSignature().toString();
                if (seen.add(sig))
                {
                    variants.add(variant);
                }
            }
            allVariants.put(id, Collections.unmodifiableList(variants));
        }

        for (Map.Entry<String, Integer> fe : fieldToId.entrySet())
        {
            int id = fe.getValue();
            if (!payloads.containsKey(id))
            {
                int length = idToLength.getOrDefault(id, Integer.MIN_VALUE);
                payloads.put(id, new PacketPayload(length,
                    Collections.emptyList(), Collections.emptyList(),
                    Collections.emptyList(), Collections.emptyList(),
                    Collections.emptyList(), Collections.emptyList(),
                    0, 0));
                allVariants.put(id, Collections.emptyList());
            }
        }

        return new Result(
            Collections.unmodifiableMap(payloads),
            ClientSendGuards.collect(archive, clientTable),
            Collections.unmodifiableMap(allVariants),
            Collections.unmodifiableMap(bufferMethods),
            bufferClassName,
            Collections.unmodifiableSet(bufferHierarchy),
            clientTable,
            serverTable);
    }

    private static void scanMethod(
        MethodNode method, String clientOwner, Map<String, Integer> fieldToId,
        Set<String> bufferHierarchy, Map<String, BufferMethod> bufferMethods,
        Map<Integer, List<SiteData>> sitesByPacket)
    {
        for (AbstractInsnNode insn : method.instructions)
        {
            if (!(insn instanceof FieldInsnNode)
                || insn.getOpcode() != Opcodes.GETSTATIC)
            {
                continue;
            }
            FieldInsnNode fi = (FieldInsnNode) insn;
            if (!clientOwner.equals(fi.owner)) continue;

            Integer packetId = fieldToId.get(fi.name);
            if (packetId == null) continue;

            SiteData site = collectSiteData(
                insn, clientOwner, bufferHierarchy, bufferMethods);

            sitesByPacket.computeIfAbsent(packetId, k -> new ArrayList<>())
                .add(site);
        }
    }

    private static SiteData collectSiteData(
        AbstractInsnNode start, String clientOwner,
        Set<String> bufferHierarchy, Map<String, BufferMethod> bufferMethods)
    {
        List<PacketPayload.ReadCall> writes = new ArrayList<>();
        List<String> callDescs = new ArrayList<>();
        List<String> fieldDescs = new ArrayList<>();
        List<Integer> constants = new ArrayList<>();
        List<String> rawFieldRefs = new ArrayList<>();
        List<String> rawCallRefs = new ArrayList<>();
        int insnCount = 0;
        int branchCount = 0;

        // The write sequence runs from here to the call that hands the packet
        // builder to the network layer. Blocks are laid out in scrambled order,
        // so the sequence has to be followed through jumps rather than read off
        // in address order.
        String builderType = findBuilderType(start, clientOwner);

        Set<AbstractInsnNode> visited = new HashSet<>();
        AbstractInsnNode walk = start.getNext();
        int limit = FORWARD_WALK_LIMIT;
        while (walk != null && limit-- > 0)
        {
            if (!visited.add(walk)) break;
            if (walk instanceof FieldInsnNode
                && walk.getOpcode() == Opcodes.GETSTATIC
                && clientOwner.equals(((FieldInsnNode) walk).owner))
            {
                break;
            }
            int walkOp = walk.getOpcode();
            if ((walkOp >= Opcodes.IRETURN && walkOp <= Opcodes.RETURN)
                || walkOp == Opcodes.ATHROW)
            {
                break;
            }
            if (builderType != null && walk instanceof MethodInsnNode
                && ((MethodInsnNode) walk).desc.startsWith("(")
                && paramsContain(((MethodInsnNode) walk).desc, builderType))
            {
                break;
            }
            if (walk.getOpcode() >= 0) insnCount++;

            if (walk instanceof MethodInsnNode)
            {
                MethodInsnNode mi = (MethodInsnNode) walk;
                int op = mi.getOpcode();
                if ((op == Opcodes.INVOKEVIRTUAL || op == Opcodes.INVOKESTATIC)
                    && bufferHierarchy.contains(mi.owner))
                {
                    BufferMethod bm = bufferMethods.get(mi.name + mi.desc);
                    if (bm != null)
                    {
                        if (bm.getWriteByteCount() > 0)
                        {
                            writes.add(new PacketPayload.ReadCall(
                                mi.name, mi.desc, bm.getWriteType()));
                        }
                        else if (bm.getByteCount() > 0)
                        {
                            writes.add(new PacketPayload.ReadCall(
                                mi.name, mi.desc, bm.getReadType()));
                        }
                    }
                }
                else
                {
                    callDescs.add(
                        PayloadExtractor.normalizeCallDescriptor(mi.getOpcode(), mi.desc));
                    rawCallRefs.add(mi.owner + "." + mi.name);
                }
            }
            else if (walk instanceof FieldInsnNode)
            {
                FieldInsnNode fi = (FieldInsnNode) walk;
                fieldDescs.add(PayloadExtractor.normalizeTypeDesc(fi.desc));
                rawFieldRefs.add(PayloadExtractor.fieldPrefix(walk.getOpcode())
                    + ":" + fi.owner + "." + fi.name);
            }
            else if (walk.getOpcode() >= Opcodes.IFEQ
                && walk.getOpcode() <= Opcodes.IF_ACMPNE)
            {
                branchCount++;
            }

            Integer constant = Instructions.intConstant(walk);
            if (constant != null)
            {
                constants.add(constant);
            }

            walk = walk.getOpcode() == Opcodes.GOTO
                ? ((JumpInsnNode) walk).label
                : walk.getNext();
        }
        return new SiteData(writes, callDescs, fieldDescs, constants,
            rawFieldRefs, rawCallRefs, insnCount, branchCount);
    }

    /**
     * The type the packet builder is created as, taken from the first call after
     * the packet constant that consumes it and returns an object. Calls that
     * take this type back are the send, and end the write sequence. Returns null
     * when the site does not open with such a call.
     */
    private static String findBuilderType(AbstractInsnNode start, String clientOwner)
    {
        AbstractInsnNode walk = start.getNext();
        for (int i = 0; walk != null && i < BUILDER_LOOKAHEAD; i++, walk = walk.getNext())
        {
            if (!(walk instanceof MethodInsnNode)) continue;
            String desc = ((MethodInsnNode) walk).desc;
            if (!paramsContain(desc, clientOwner)) return null;
            String ret = desc.substring(desc.indexOf(')') + 1);
            return ret.startsWith("L") && ret.endsWith(";")
                ? ret.substring(1, ret.length() - 1) : null;
        }
        return null;
    }

    /** True when the descriptor takes the given internal class name as a parameter. */
    private static boolean paramsContain(String desc, String internalName)
    {
        return desc.substring(1, desc.indexOf(')')).contains("L" + internalName + ";");
    }

    private static final class SiteData
    {
        final List<PacketPayload.ReadCall> writes;
        final List<String> callDescs;
        final List<String> fieldDescs;
        final List<Integer> constants;
        final List<String> rawFieldRefs;
        final List<String> rawCallRefs;
        final int insnCount;
        final int branchCount;

        SiteData(List<PacketPayload.ReadCall> writes, List<String> callDescs,
            List<String> fieldDescs, List<Integer> constants,
            List<String> rawFieldRefs, List<String> rawCallRefs,
            int insnCount, int branchCount)
        {
            this.writes = writes;
            this.callDescs = callDescs;
            this.fieldDescs = fieldDescs;
            this.constants = constants;
            this.rawFieldRefs = rawFieldRefs;
            this.rawCallRefs = rawCallRefs;
            this.insnCount = insnCount;
            this.branchCount = branchCount;
        }
    }

    private static SiteData chooseBest(List<SiteData> sites)
    {
        int maxLen = 0;
        for (SiteData site : sites)
        {
            if (site.writes.size() > maxLen) maxLen = site.writes.size();
        }
        List<SiteData> longest = new ArrayList<>();
        for (SiteData site : sites)
        {
            if (site.writes.size() == maxLen) longest.add(site);
        }
        Map<String, List<SiteData>> bySignature = new LinkedHashMap<>();
        for (SiteData site : longest)
        {
            String sig = writeSignature(site.writes);
            bySignature.computeIfAbsent(sig, k -> new ArrayList<>()).add(site);
        }
        List<SiteData> best = null;
        for (List<SiteData> group : bySignature.values())
        {
            if (best == null || group.size() > best.size())
            {
                best = group;
            }
        }
        return best.get(0);
    }

    private static String writeSignature(List<PacketPayload.ReadCall> calls)
    {
        List<String> types = new ArrayList<>(calls.size());
        for (PacketPayload.ReadCall call : calls)
        {
            types.add(call.getReadType());
        }
        return types.toString();
    }

    public static final class Result
    {
        private final Map<Integer, PacketPayload> payloads;
        private final Map<Integer, Set<String>> sendGuards;
        private final Map<Integer, List<PacketPayload>> allVariants;
        private final Map<String, BufferMethod> bufferMethods;
        private final String bufferClassName;
        private final Set<String> bufferHierarchy;
        private final PacketTable clientTable;
        private final PacketTable serverTable;

        Result(Map<Integer, PacketPayload> payloads,
            Map<Integer, Set<String>> sendGuards,
            Map<Integer, List<PacketPayload>> allVariants,
            Map<String, BufferMethod> bufferMethods, String bufferClassName,
            Set<String> bufferHierarchy,
            PacketTable clientTable, PacketTable serverTable)
        {
            this.payloads = payloads;
            this.sendGuards = sendGuards;
            this.allVariants = allVariants;
            this.bufferMethods = bufferMethods;
            this.bufferClassName = bufferClassName;
            this.bufferHierarchy = bufferHierarchy;
            this.clientTable = clientTable;
            this.serverTable = serverTable;
        }

        public Map<Integer, PacketPayload> getPayloads()
        {
            return payloads;
        }

        /**
         * Packet id to the game actions that reach its send site. See
         * ClientSendGuards. Packets sent from no guarded site map to an empty set.
         */
        public Map<Integer, Set<String>> getSendGuards()
        {
            return sendGuards;
        }

        /**
         * All distinct site variants per packet. Each packet may be written at
         * multiple call sites with different subsets of fields; each variant is
         * a distinct observed write sequence.
         */
        public Map<Integer, List<PacketPayload>> getAllVariants()
        {
            return allVariants;
        }

        public Map<String, BufferMethod> getBufferMethods()
        {
            return bufferMethods;
        }

        public String getBufferClassName()
        {
            return bufferClassName;
        }

        public Set<String> getBufferHierarchy()
        {
            return bufferHierarchy;
        }

        public PacketTable getClientTable()
        {
            return clientTable;
        }

        public PacketTable getServerTable()
        {
            return serverTable;
        }
    }
}
