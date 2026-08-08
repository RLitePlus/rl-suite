package dev.rl.suite.util;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * The decode multiplier for every obfuscated field in the archive.
 *
 * <p>Numeric fields are stored multiplied by a constant and read back multiplied by that constant's
 * modular inverse. A mapping carrying the wrong half of the pair does not skew a read, it inverts it,
 * and nothing about the value looks wrong until you compare it against the archive's own answer. So
 * the table is produced on every run rather than on request.
 *
 * <p>Three ways of arriving at an entry, strongest first. Each is recorded so a caller can tell a
 * fact from an inference:
 *
 * <ul>
 * <li><b>Stated.</b> RuneLite's injector emits accessors whose entire body is
 *     {@code getfield X; ldc K; imul; ireturn}. K is the decoder, read straight off. Exact, but only
 *     reaches fields the injector chose to expose.
 * <li><b>Proven.</b> Collect every constant multiplied into a field at its reads, and every constant
 *     multiplied at its writes, then look for one pair whose product is 1 modulo the type's width.
 *     Only true inverses satisfy that, so a hit is a proof rather than a guess - two unrelated
 *     constants have about a one in four billion chance of colliding.
 * <li><b>Inferred.</b> Only one side of the pair appears anywhere. The read constant is taken as-is,
 *     or a lone write constant is inverted. Correct in the ordinary case and unproven either way.
 * </ul>
 *
 * <p>A field whose candidates support no consistent answer is left out. An absent decoder is a
 * question; a wrong one is a bug that reads as data.
 */
public final class DecoderTable
{
    private static final BigInteger INT_MODULUS = BigInteger.ONE.shiftLeft(32);
    private static final BigInteger LONG_MODULUS = BigInteger.ONE.shiftLeft(64);

    private DecoderTable()
    {
    }

    /** How an entry was arrived at, weakest last. */
    public enum Confidence
    {
        STATED,
        PROVEN,
        INFERRED
    }

    /** A decode multiplier and how much to trust it. */
    public static final class Decoder
    {
        private final String multiplier;
        private final Confidence confidence;

        Decoder(String multiplier, Confidence confidence)
        {
            this.multiplier = multiplier;
            this.confidence = confidence;
        }

        public String getMultiplier()
        {
            return multiplier;
        }

        public Confidence getConfidence()
        {
            return confidence;
        }
    }

    /** Maps {@code owner.field} to its decode multiplier. */
    public static Map<String, Decoder> extract(JarArchive archive)
    {
        Map<String, List<Candidate>> reads = new TreeMap<>();
        Map<String, List<Candidate>> writes = new TreeMap<>();
        Map<String, String> stated = new TreeMap<>();

        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                collectStated(method, stated);
                collect(method, reads, writes);
            }
        }

        Map<String, Decoder> decoders = new TreeMap<>();
        for (Map.Entry<String, String> entry : stated.entrySet())
        {
            decoders.put(entry.getKey(), new Decoder(entry.getValue(), Confidence.STATED));
        }
        for (String field : union(reads, writes))
        {
            if (decoders.containsKey(field))
            {
                continue;
            }
            Decoder solved = solve(reads.get(field), writes.get(field));
            if (solved != null)
            {
                decoders.put(field, solved);
            }
        }
        return new LinkedHashMap<>(decoders);
    }

    /** Convenience for callers that only want the numbers. */
    public static Map<String, String> multipliers(JarArchive archive)
    {
        Map<String, String> flat = new LinkedHashMap<>();
        for (Map.Entry<String, Decoder> entry : extract(archive).entrySet())
        {
            flat.put(entry.getKey(), entry.getValue().getMultiplier());
        }
        return flat;
    }

    // ---- reading the answer off an injected accessor ---------------------

    private static void collectStated(MethodNode method, Map<String, String> stated)
    {
        List<AbstractInsnNode> body = executable(method);
        int i = body.size() > 0 && body.get(0).getOpcode() == Opcodes.ALOAD ? 1 : 0;
        if (body.size() - i != 4)
        {
            return;
        }
        AbstractInsnNode read = body.get(i);
        AbstractInsnNode constant = body.get(i + 1);
        boolean isInt = body.get(i + 2).getOpcode() == Opcodes.IMUL
            && body.get(i + 3).getOpcode() == Opcodes.IRETURN;
        boolean isLong = body.get(i + 2).getOpcode() == Opcodes.LMUL
            && body.get(i + 3).getOpcode() == Opcodes.LRETURN;
        if ((!isInt && !isLong) || !isFieldRead(read) || !(constant instanceof LdcInsnNode))
        {
            return;
        }
        FieldInsnNode field = (FieldInsnNode) read;
        if (!field.desc.equals(isInt ? "I" : "J"))
        {
            return;
        }
        Object value = ((LdcInsnNode) constant).cst;
        if ((isInt && value instanceof Integer || isLong && value instanceof Long)
            && isOdd(value))
        {
            stated.put(field.owner + "." + field.name, String.valueOf(value));
        }
    }

    // ---- collecting candidates from every arithmetic site ----------------

    private static void collect(MethodNode method, Map<String, List<Candidate>> reads,
        Map<String, List<Candidate>> writes)
    {
        List<AbstractInsnNode> body = executable(method);
        for (int i = 0; i + 2 < body.size(); i++)
        {
            // read: getfield X, ldc K, imul
            if (isFieldRead(body.get(i)) && body.get(i + 1) instanceof LdcInsnNode
                && isMultiply(body.get(i + 2)))
            {
                add(reads, (FieldInsnNode) body.get(i), (LdcInsnNode) body.get(i + 1),
                    body.get(i + 2).getOpcode());
            }
            // write: ldc K, imul, putfield X
            if (body.get(i) instanceof LdcInsnNode && isMultiply(body.get(i + 1))
                && isFieldWrite(body.get(i + 2)))
            {
                add(writes, (FieldInsnNode) body.get(i + 2), (LdcInsnNode) body.get(i),
                    body.get(i + 1).getOpcode());
            }
        }
    }

    private static void add(Map<String, List<Candidate>> into, FieldInsnNode field,
        LdcInsnNode constant, int multiply)
    {
        boolean isLong = multiply == Opcodes.LMUL;
        if (!field.desc.equals(isLong ? "J" : "I"))
        {
            return;
        }
        Object value = constant.cst;
        if (isLong && !(value instanceof Long) || !isLong && !(value instanceof Integer))
        {
            return;
        }
        // Only odd constants have a modular inverse, so an even one was never an encode or
        // decode multiplier - it is ordinary arithmetic that happens to multiply a field.
        if (!isOdd(value))
        {
            return;
        }
        into.computeIfAbsent(field.owner + "." + field.name, key -> new ArrayList<>())
            .add(new Candidate(new BigInteger(String.valueOf(value)), isLong));
    }

    // ---- solving ---------------------------------------------------------

    /**
     * Prefers a read and write constant that multiply to 1, which can only happen if they are the
     * true pair. Falls back to the most frequent read, then to inverting the most frequent write.
     */
    private static Decoder solve(List<Candidate> reads, List<Candidate> writes)
    {
        if (reads != null && writes != null)
        {
            for (Candidate read : reads)
            {
                for (Candidate write : writes)
                {
                    if (read.isLong != write.isLong)
                    {
                        continue;
                    }
                    BigInteger modulus = read.isLong ? LONG_MODULUS : INT_MODULUS;
                    if (read.value.multiply(write.value).mod(modulus).equals(BigInteger.ONE))
                    {
                        return new Decoder(signed(read.value, read.isLong), Confidence.PROVEN);
                    }
                }
            }
        }
        // Two agreeing sites minimum. A field read once can have its decoder folded together with
        // whatever the result was about to be multiplied by - ServerPacket.length is read exactly
        // once, and that site re-encodes it straight into PacketWriter.serverPacketLength, so the
        // constant there is the product of two multipliers and matches neither.
        Candidate read = mostCommon(reads, 2);
        if (read != null)
        {
            return new Decoder(signed(read.value, read.isLong), Confidence.INFERRED);
        }
        Candidate write = mostCommon(writes, 2);
        if (write == null || !write.value.testBit(0))
        {
            // An even constant has no inverse, so it was never an encode multiplier.
            return null;
        }
        BigInteger modulus = write.isLong ? LONG_MODULUS : INT_MODULUS;
        return new Decoder(signed(write.value.modInverse(modulus), write.isLong),
            Confidence.INFERRED);
    }

    private static Candidate mostCommon(List<Candidate> candidates, int minimumSupport)
    {
        if (candidates == null || candidates.size() < minimumSupport)
        {
            return null;
        }
        Map<BigInteger, Integer> counts = new LinkedHashMap<>();
        for (Candidate candidate : candidates)
        {
            counts.merge(candidate.value, 1, Integer::sum);
        }
        BigInteger best = null;
        int bestCount = 0;
        boolean tied = false;
        for (Map.Entry<BigInteger, Integer> entry : counts.entrySet())
        {
            if (entry.getValue() > bestCount)
            {
                best = entry.getKey();
                bestCount = entry.getValue();
                tied = false;
            }
            else if (entry.getValue() == bestCount)
            {
                tied = true;
            }
        }
        if (bestCount < minimumSupport)
        {
            return null;
        }
        if (tied)
        {
            // No majority. Guessing between equally supported constants is how a wrong
            // decoder gets shipped looking like a right one.
            return null;
        }
        for (Candidate candidate : candidates)
        {
            if (candidate.value.equals(best))
            {
                return candidate;
            }
        }
        return null;
    }

    // ---- helpers ---------------------------------------------------------

    private static String signed(BigInteger value, boolean isLong)
    {
        return isLong ? String.valueOf(value.longValue()) : String.valueOf(value.intValue());
    }

    private static List<String> executableKeys(Map<String, List<Candidate>> map)
    {
        return new ArrayList<>(map.keySet());
    }

    private static List<String> union(Map<String, List<Candidate>> a,
        Map<String, List<Candidate>> b)
    {
        List<String> keys = executableKeys(a);
        for (String key : executableKeys(b))
        {
            if (!a.containsKey(key))
            {
                keys.add(key);
            }
        }
        return keys;
    }

    private static List<AbstractInsnNode> executable(MethodNode method)
    {
        List<AbstractInsnNode> body = new ArrayList<>();
        for (AbstractInsnNode insn : method.instructions.toArray())
        {
            if (insn.getOpcode() >= 0)
            {
                body.add(insn);
            }
        }
        return body;
    }

    private static boolean isFieldRead(AbstractInsnNode insn)
    {
        return insn.getOpcode() == Opcodes.GETFIELD || insn.getOpcode() == Opcodes.GETSTATIC;
    }

    private static boolean isFieldWrite(AbstractInsnNode insn)
    {
        return insn.getOpcode() == Opcodes.PUTFIELD || insn.getOpcode() == Opcodes.PUTSTATIC;
    }

    /** A decode multiplier must be invertible modulo a power of two, so it must be odd. */
    private static boolean isOdd(Object value)
    {
        return (((Number) value).longValue() & 1L) == 1L;
    }

    private static boolean isMultiply(AbstractInsnNode insn)
    {
        return insn.getOpcode() == Opcodes.IMUL || insn.getOpcode() == Opcodes.LMUL;
    }

    private static final class Candidate
    {
        private final BigInteger value;
        private final boolean isLong;

        Candidate(BigInteger value, boolean isLong)
        {
            this.value = value;
            this.isLong = isLong;
        }
    }
}
