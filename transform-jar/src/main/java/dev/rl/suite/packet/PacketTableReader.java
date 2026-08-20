package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.rename.FieldKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

/**
 * Reads both packet id/length tables out of an input archive without being told
 * what to expect.
 *
 * <p>{@link PacketNameProfile} validates a jar against a supplied profile; this
 * reads the same structure with no profile in hand, which is what a new revision
 * needs. The shape rules are deliberately identical, so the two cannot disagree
 * about what a packet table is.
 *
 * <p>Direction is decided by which table the packet-reader methods consult.
 * Measured on 1.12.32 the server table's constants are read 147 times inside
 * those methods against the client table's 15, and on 1.12.34 it is 149 against
 * 1. Stated as a fraction of each table's own size that is 98.7% versus 12.8%,
 * and 98.0% versus 0.9% — a wide, stable separation rather than a close call.
 *
 * <p>Every ambiguity aborts. A jar that does not present exactly one server and
 * one client table in the expected shape is rejected rather than guessed at.
 */
public final class PacketTableReader
{
    /**
     * Fewest constants a class must declare to be considered a packet table.
     * The real tables carry 117 to 152; nothing else in the archive comes close,
     * so this only excludes ordinary code.
     */
    private static final int MINIMUM_ENTRIES = 32;

    /**
     * Fraction of a table's own constants that must be read inside the packet
     * readers for it to be the server table. The measured values are 0.98 for
     * server and at most 0.13 for client, so the midpoint is not a tuned
     * threshold.
     */
    private static final double SERVER_READ_FRACTION = 0.5d;

    /** Matches {@code PacketHandlerNormalizer}'s candidate filter. */
    private static final int MINIMUM_HANDLER_TRY_CATCH_BLOCKS = 64;

    private PacketTableReader()
    {
    }

    /** Both tables, keyed by direction. Never returns a partial result. */
    public static Map<PacketDirection, PacketTable> read(JarArchive archive)
    {
        Map<String, List<Candidate>> byOwner = new LinkedHashMap<>();
        Map<String, String> rejected = new LinkedHashMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            Result extracted = extract(unit.getNode());
            if (extracted.entries != null)
            {
                byOwner.put(unit.getNode().name, extracted.entries);
            }
            else if (extracted.reason != null)
            {
                rejected.put(unit.getNode().name, extracted.reason);
            }
        }
        if (byOwner.size() != 2)
        {
            throw new TransformException("Expected exactly two packet tables, found "
                + byOwner.size() + " " + byOwner.keySet()
                + "; near misses: " + rejected);
        }

        Map<String, Integer> reads = countHandlerReads(archive, byOwner.keySet());
        Map<PacketDirection, PacketTable> tables = new EnumMap<>(PacketDirection.class);
        for (Map.Entry<String, List<Candidate>> owner : byOwner.entrySet())
        {
            List<Candidate> entries = owner.getValue();
            int read = reads.getOrDefault(owner.getKey(), 0);
            double fraction = (double) read / entries.size();
            PacketDirection direction = fraction >= SERVER_READ_FRACTION
                ? PacketDirection.SERVER : PacketDirection.CLIENT;
            List<PacketTable.Entry> converted = new ArrayList<>(entries.size());
            for (Candidate candidate : entries)
            {
                converted.add(new PacketTable.Entry(candidate.id, candidate.length,
                    candidate.field));
            }
            PacketTable table = new PacketTable(direction, owner.getKey(), converted);
            if (tables.put(direction, table) != null)
            {
                throw new TransformException("Both packet tables resolved to " + direction
                    + "; handler reads were " + reads);
            }
        }
        if (tables.size() != 2)
        {
            throw new TransformException("Packet tables did not resolve to one of each "
                + "direction: " + tables.keySet());
        }
        return Collections.unmodifiableMap(tables);
    }

    /**
     * The declared constants of {@code node} if it is a packet table, or null if
     * it is anything else. Returning null means "not a table"; a table whose
     * shape is broken throws instead, so a real change cannot be read as absence.
     */
    private static Result extract(ClassNode node)
    {
        String descriptor = "L" + node.name + ";";
        Map<String, FieldNode> constants = new LinkedHashMap<>();
        for (FieldNode field : node.fields)
        {
            if ((field.access & Opcodes.ACC_STATIC) != 0 && descriptor.equals(field.desc))
            {
                if (constants.put(field.name, field) != null)
                {
                    return Result.no("duplicate constant name " + field.name);
                }
            }
        }
        if (constants.size() < MINIMUM_ENTRIES)
        {
            // Ordinary code, not a near miss worth reporting.
            return Result.notATable();
        }

        MethodNode initializer = null;
        for (MethodNode method : node.methods)
        {
            if ("<clinit>".equals(method.name) && "()V".equals(method.desc))
            {
                if (initializer != null)
                {
                    return Result.no("more than one static initializer");
                }
                initializer = method;
            }
        }
        if (initializer == null)
        {
            return Result.no("no static initializer");
        }

        Map<Integer, Candidate> byId = new HashMap<>();
        Set<String> assigned = new HashSet<>();
        for (AbstractInsnNode insn : initializer.instructions)
        {
            if (!(insn instanceof FieldInsnNode) || insn.getOpcode() != Opcodes.PUTSTATIC)
            {
                continue;
            }
            FieldInsnNode put = (FieldInsnNode) insn;
            if (!node.name.equals(put.owner) || !descriptor.equals(put.desc)
                || !constants.containsKey(put.name))
            {
                continue;
            }
            Candidate candidate = parseAssignment(node.name, descriptor, put);
            if (candidate == null)
            {
                // Other enum-like classes construct with a single int, e.g.
                // "new wb(1)". Not a packet table.
                return Result.no("constant " + put.name + " is not built by <init>(II)V");
            }
            if (!assigned.add(put.name))
            {
                return Result.no("constant " + put.name + " assigned more than once");
            }
            if (byId.put(candidate.id, candidate) != null)
            {
                return Result.no("id " + candidate.id + " used more than once");
            }
        }
        if (assigned.size() != constants.size())
        {
            return Result.no("declares " + constants.size() + " constants but assigns "
                + assigned.size());
        }

        // Ids must tile 0..n-1. Every profile indexes entries by id, and a gap
        // would silently shift every name after it.
        List<Candidate> ordered = new ArrayList<>(constants.size());
        for (int id = 0; id < constants.size(); id++)
        {
            Candidate candidate = byId.get(id);
            if (candidate == null)
            {
                return Result.no("no entry for id " + id + " of " + constants.size());
            }
            ordered.add(candidate);
        }
        return Result.table(ordered);
    }

    /**
     * Outcome of classifying one class. A null {@code reason} means the class is
     * ordinary code; a non-null one means it looked like a table and was
     * rejected, which is worth surfacing if the archive then fails to present
     * exactly two.
     */
    private static final class Result
    {
        private final List<Candidate> entries;
        private final String reason;

        private Result(List<Candidate> entries, String reason)
        {
            this.entries = entries;
            this.reason = reason;
        }

        private static Result table(List<Candidate> entries)
        {
            return new Result(entries, null);
        }

        private static Result no(String reason)
        {
            return new Result(null, reason);
        }

        private static Result notATable()
        {
            return new Result(null, null);
        }
    }

    static Candidate parseAssignment(String owner, String descriptor, FieldInsnNode put)
    {
        AbstractInsnNode invokeNode = previousExecutable(put);
        if (!(invokeNode instanceof MethodInsnNode))
        {
            return null;
        }
        MethodInsnNode invoke = (MethodInsnNode) invokeNode;
        if (invoke.getOpcode() != Opcodes.INVOKESPECIAL || !owner.equals(invoke.owner)
            || !"<init>".equals(invoke.name) || !"(II)V".equals(invoke.desc) || invoke.itf)
        {
            return null;
        }
        AbstractInsnNode lengthNode = previousExecutable(invokeNode);
        AbstractInsnNode idNode = previousExecutable(lengthNode);
        AbstractInsnNode dupNode = previousExecutable(idNode);
        AbstractInsnNode newNode = previousExecutable(dupNode);
        Integer length = integerConstant(lengthNode);
        Integer id = integerConstant(idNode);
        if (length == null || id == null || dupNode == null
            || dupNode.getOpcode() != Opcodes.DUP || !(newNode instanceof TypeInsnNode)
            || newNode.getOpcode() != Opcodes.NEW
            || !owner.equals(((TypeInsnNode) newNode).desc))
        {
            return null;
        }
        return new Candidate(id, length, new FieldKey(owner, put.name, descriptor));
    }

    /**
     * How many of each candidate table's constants are read inside the packet
     * reader methods. Counted per distinct field so a loop cannot inflate one
     * table's score.
     */
    private static Map<String, Integer> countHandlerReads(JarArchive archive, Set<String> owners)
    {
        Map<String, Set<String>> readFields = new LinkedHashMap<>();
        int handlers = 0;
        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                if (!method.desc.endsWith(")Z")
                    || method.tryCatchBlocks.size() < MINIMUM_HANDLER_TRY_CATCH_BLOCKS
                    || method.tryCatchBlocks.size() % 2 != 0)
                {
                    continue;
                }
                handlers++;
                for (AbstractInsnNode insn : method.instructions)
                {
                    if (!(insn instanceof FieldInsnNode)
                        || insn.getOpcode() != Opcodes.GETSTATIC)
                    {
                        continue;
                    }
                    FieldInsnNode read = (FieldInsnNode) insn;
                    if (owners.contains(read.owner))
                    {
                        readFields.computeIfAbsent(read.owner, ignored -> new HashSet<>())
                            .add(read.name);
                    }
                }
            }
        }
        if (handlers == 0)
        {
            throw new TransformException("Found no packet-reader methods, so packet "
                + "direction cannot be determined");
        }
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> entry : readFields.entrySet())
        {
            counts.put(entry.getKey(), entry.getValue().size());
        }
        return counts;
    }

    private static AbstractInsnNode previousExecutable(AbstractInsnNode instruction)
    {
        if (instruction == null)
        {
            return null;
        }
        AbstractInsnNode previous = instruction.getPrevious();
        while (previous != null && previous.getOpcode() < 0)
        {
            previous = previous.getPrevious();
        }
        return previous;
    }

    private static Integer integerConstant(AbstractInsnNode instruction)
    {
        if (instruction == null)
        {
            return null;
        }
        int opcode = instruction.getOpcode();
        if (opcode >= Opcodes.ICONST_M1 && opcode <= Opcodes.ICONST_5)
        {
            return opcode - Opcodes.ICONST_0;
        }
        if (instruction instanceof IntInsnNode
            && (opcode == Opcodes.BIPUSH || opcode == Opcodes.SIPUSH))
        {
            return ((IntInsnNode) instruction).operand;
        }
        if (instruction instanceof LdcInsnNode
            && ((LdcInsnNode) instruction).cst instanceof Integer)
        {
            return (Integer) ((LdcInsnNode) instruction).cst;
        }
        return null;
    }

    static final class Candidate
    {
        final int id;
        final int length;
        private final FieldKey field;

        private Candidate(int id, int length, FieldKey field)
        {
            this.id = id;
            this.length = length;
            this.field = field;
        }
    }
}
