package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
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
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/**
 * Extracts the payload structure (ordered buffer-read sequence) for every
 * server-to-client packet in an injected client jar.
 *
 * <p>The five packet-handler methods each contain one try-catch range per
 * packet, and within each range the handler reads the packet's fields from the
 * buffer in a fixed order. This class walks those ranges and records the buffer
 * method calls, identifying each method by a content hash so the result can be
 * compared across revisions where the obfuscated names differ.
 */
public final class PayloadExtractor
{
    private static final int MINIMUM_TRY_CATCH_BLOCKS = 64;

    private PayloadExtractor()
    {
    }

    /**
     * Extracts the payload structure for every server packet, keyed by packet
     * id. Only the first handler method is analyzed; the others are verified to
     * agree on range count but their bytecode is not re-walked (the five are
     * generated from the same template).
     */
    public static Result extract(JarArchive archive)
    {
        Map<PacketDirection, PacketTable> tables = PacketTableReader.read(archive);
        PacketTable serverTable = tables.get(PacketDirection.SERVER);

        Map<String, Integer> serverFieldToId = new LinkedHashMap<>();
        Map<Integer, Integer> idToLength = new LinkedHashMap<>();
        for (PacketTable.Entry entry : serverTable.getEntries())
        {
            serverFieldToId.put(entry.getField().getName(), entry.getId());
            idToLength.put(entry.getId(), entry.getLength());
        }

        List<HandlerMethod> handlers = findHandlers(archive);
        if (handlers.isEmpty())
        {
            throw new TransformException("No packet-handler methods found");
        }

        String bufferClassName = findBufferClass(handlers);
        Set<String> bufferHierarchy = new HashSet<>();
        Map<String, BufferMethod> bufferMethods = indexBufferMethods(
            archive, bufferClassName, bufferHierarchy);

        int expectedRangeCount = handlers.get(0).method.tryCatchBlocks.size() / 2;
        for (HandlerMethod h : handlers)
        {
            int ranges = h.method.tryCatchBlocks.size() / 2;
            if (ranges != expectedRangeCount)
            {
                throw new TransformException("Handler " + h.owner + "." + h.method.name
                    + " has " + ranges + " ranges, expected " + expectedRangeCount);
            }
        }

        HandlerMethod primary = handlers.get(0);
        Map<Integer, PacketPayload> payloads = extractPayloads(
            primary.method, serverTable.getOwner(), serverFieldToId,
            idToLength, bufferHierarchy, bufferMethods);

        for (Map.Entry<String, Integer> fe : serverFieldToId.entrySet())
        {
            int id = fe.getValue();
            if (!payloads.containsKey(id))
            {
                int length = idToLength.getOrDefault(id, Integer.MIN_VALUE);
                payloads.put(id, new PacketPayload(id, length,
                    Collections.emptyList(), Collections.emptyList(),
                    Collections.emptyList(), Collections.emptyList(),
                    Collections.emptyList(), Collections.emptyList(),
                    0, 0));
            }
        }

        return new Result(
            Collections.unmodifiableMap(payloads),
            Collections.unmodifiableMap(bufferMethods),
            bufferClassName,
            serverTable,
            tables.get(PacketDirection.CLIENT));
    }

    private static Map<Integer, PacketPayload> extractPayloads(
        MethodNode method, String serverTableOwner, Map<String, Integer> serverFieldToId,
        Map<Integer, Integer> idToLength,
        Set<String> bufferHierarchy, Map<String, BufferMethod> bufferMethods)
    {
        int rangeCount = method.tryCatchBlocks.size() / 2;

        Map<Integer, PacketPayload> payloads = new TreeMap<>();

        for (int r = 0; r < rangeCount; r++)
        {
            TryCatchBlockNode block = method.tryCatchBlocks.get(r);
            if (!"java/io/IOException".equals(block.type)) continue;

            Integer packetId = null;
            List<PacketPayload.ReadCall> reads = new ArrayList<>();
            List<String> callDescs = new ArrayList<>();
            List<String> fieldDescs = new ArrayList<>();
            List<Integer> constants = new ArrayList<>();
            List<String> rawFieldRefs = new ArrayList<>();
            List<String> rawCallRefs = new ArrayList<>();
            int insnCount = 0;
            int branchCount = 0;

            boolean inRange = false;
            for (AbstractInsnNode insn : method.instructions)
            {
                if (insn == block.start) { inRange = true; continue; }
                if (insn == block.end) break;
                if (!inRange) continue;

                if (insn.getOpcode() >= 0) insnCount++;

                if (insn instanceof MethodInsnNode)
                {
                    MethodInsnNode mi = (MethodInsnNode) insn;
                    int op = mi.getOpcode();
                    if ((op == Opcodes.INVOKEVIRTUAL || op == Opcodes.INVOKESTATIC)
                        && bufferHierarchy.contains(mi.owner))
                    {
                        BufferMethod bm = bufferMethods.get(mi.name + mi.desc);
                        if (bm != null)
                        {
                            reads.add(new PacketPayload.ReadCall(
                                mi.name, mi.desc, bm.getReadType()));
                        }
                    }
                    else
                    {
                        callDescs.add(normalizeCallDescriptor(op, mi.desc));
                        rawCallRefs.add(mi.owner + "." + mi.name);
                    }
                }
                else if (insn instanceof FieldInsnNode)
                {
                    FieldInsnNode fi = (FieldInsnNode) insn;
                    if (insn.getOpcode() == Opcodes.GETSTATIC
                        && serverTableOwner.equals(fi.owner))
                    {
                        Integer id = serverFieldToId.get(fi.name);
                        if (id != null) packetId = id;
                    }
                    else
                    {
                        fieldDescs.add(fieldPrefix(insn.getOpcode())
                            + ":" + normalizeTypeDesc(fi.desc));
                        rawFieldRefs.add(fieldPrefix(insn.getOpcode())
                            + ":" + fi.owner + "." + fi.name);
                    }
                }
                else if (insn.getOpcode() >= Opcodes.IFEQ
                    && insn.getOpcode() <= Opcodes.IF_ACMPNE)
                {
                    branchCount++;
                }

                int op = insn.getOpcode();
                if (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5)
                {
                    constants.add(op - Opcodes.ICONST_0);
                }
                else if (insn instanceof IntInsnNode
                    && (op == Opcodes.BIPUSH || op == Opcodes.SIPUSH))
                {
                    constants.add(((IntInsnNode) insn).operand);
                }
                else if (insn instanceof LdcInsnNode
                    && ((LdcInsnNode) insn).cst instanceof Integer)
                {
                    constants.add((Integer) ((LdcInsnNode) insn).cst);
                }
            }

            if (packetId != null)
            {
                int length = idToLength.getOrDefault(packetId, Integer.MIN_VALUE);
                payloads.put(packetId, new PacketPayload(packetId, length, reads,
                    callDescs, fieldDescs, constants, rawFieldRefs,
                    rawCallRefs, insnCount, branchCount));
            }
        }
        return payloads;
    }

    /**
     * Finds all methods in the buffer class hierarchy and indexes them by
     * their obfuscated name + descriptor.
     */
    private static Map<String, BufferMethod> indexBufferMethods(
        JarArchive archive, String bufferClassName, Set<String> hierarchyOut)
    {
        Map<String, BufferMethod> result = new LinkedHashMap<>();
        String current = bufferClassName;
        while (current != null && !"java/lang/Object".equals(current))
        {
            hierarchyOut.add(current);
            ClassNode node = findClass(archive, current);
            if (node == null) break;
            for (MethodNode method : node.methods)
            {
                if ("<init>".equals(method.name) || "<clinit>".equals(method.name)) continue;
                String key = method.name + method.desc;
                if (!result.containsKey(key))
                {
                    result.put(key, BufferMethod.of(method));
                }
            }
            current = node.superName;
        }
        return result;
    }

    private static List<HandlerMethod> findHandlers(JarArchive archive)
    {
        List<HandlerMethod> handlers = new ArrayList<>();
        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                if (method.desc.endsWith(")Z")
                    && method.tryCatchBlocks.size() >= MINIMUM_TRY_CATCH_BLOCKS
                    && method.tryCatchBlocks.size() % 2 == 0)
                {
                    handlers.add(new HandlerMethod(unit.getNode().name, method));
                }
            }
        }
        return handlers;
    }

    private static String findBufferClass(List<HandlerMethod> handlers)
    {
        Map<String, Integer> classCalls = new LinkedHashMap<>();
        for (HandlerMethod h : handlers)
        {
            for (AbstractInsnNode insn : h.method.instructions)
            {
                if (insn instanceof MethodInsnNode
                    && insn.getOpcode() == Opcodes.INVOKEVIRTUAL)
                {
                    classCalls.merge(((MethodInsnNode) insn).owner, 1, Integer::sum);
                }
            }
        }
        return classCalls.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .orElseThrow(() -> new TransformException("No virtual calls in packet handlers"))
            .getKey();
    }

    private static ClassNode findClass(JarArchive archive, String name)
    {
        for (ClassUnit unit : archive.getClasses())
        {
            if (unit.getNode().name.equals(name)) return unit.getNode();
        }
        return null;
    }

    static String normalizeDescriptor(String desc)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < desc.length())
        {
            char c = desc.charAt(i);
            if (c == 'L')
            {
                int semi = desc.indexOf(';', i);
                String cls = desc.substring(i + 1, semi);
                if (cls.startsWith("java/"))
                {
                    sb.append('L').append(cls).append(';');
                }
                else
                {
                    sb.append("L?;");
                }
                i = semi + 1;
            }
            else if (c == 'B' || c == 'S' || c == 'I' || c == 'Z')
            {
                sb.append('N');
                i++;
            }
            else
            {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }

    static String normalizeTypeDesc(String desc)
    {
        if (desc.length() == 1)
        {
            char c = desc.charAt(0);
            if (c == 'B' || c == 'S' || c == 'I' || c == 'Z') return "N";
            return desc;
        }
        if (desc.startsWith("[")) return "[" + normalizeTypeDesc(desc.substring(1));
        if (desc.startsWith("L"))
        {
            String cls = desc.substring(1, desc.length() - 1);
            if (cls.startsWith("java/")) return desc;
            return "L?;";
        }
        return desc;
    }

    static String normalizeCallDescriptor(int opcode, String desc)
    {
        String normalized = normalizeDescriptor(desc);
        if (opcode == Opcodes.INVOKEVIRTUAL
            || opcode == Opcodes.INVOKESPECIAL
            || opcode == Opcodes.INVOKEINTERFACE)
        {
            normalized = "(L?;" + normalized.substring(1);
        }
        return normalized;
    }

    static String fieldPrefix(int opcode)
    {
        switch (opcode)
        {
            case Opcodes.GETFIELD: return "GF";
            case Opcodes.PUTFIELD: return "PF";
            case Opcodes.GETSTATIC: return "GS";
            case Opcodes.PUTSTATIC: return "PS";
            default: return "?";
        }
    }

    private static final class HandlerMethod
    {
        final String owner;
        final MethodNode method;

        HandlerMethod(String owner, MethodNode method)
        {
            this.owner = owner;
            this.method = method;
        }
    }

    /** Extraction result: payloads, buffer method index, and packet tables. */
    public static final class Result
    {
        private final Map<Integer, PacketPayload> payloads;
        private final Map<String, BufferMethod> bufferMethods;
        private final String bufferClassName;
        private final PacketTable serverTable;
        private final PacketTable clientTable;

        Result(Map<Integer, PacketPayload> payloads,
            Map<String, BufferMethod> bufferMethods, String bufferClassName,
            PacketTable serverTable, PacketTable clientTable)
        {
            this.payloads = payloads;
            this.bufferMethods = bufferMethods;
            this.bufferClassName = bufferClassName;
            this.serverTable = serverTable;
            this.clientTable = clientTable;
        }

        /** Payload structure per server packet id. */
        public Map<Integer, PacketPayload> getPayloads()
        {
            return payloads;
        }

        /** All buffer methods indexed by obfuscated name + descriptor. */
        public Map<String, BufferMethod> getBufferMethods()
        {
            return bufferMethods;
        }

        /** Obfuscated internal name of the buffer class. */
        public String getBufferClassName()
        {
            return bufferClassName;
        }

        public PacketTable getServerTable()
        {
            return serverTable;
        }

        public PacketTable getClientTable()
        {
            return clientTable;
        }
    }
}
