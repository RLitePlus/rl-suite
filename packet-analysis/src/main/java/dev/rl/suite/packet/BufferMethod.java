package dev.rl.suite.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * A buffer read/write method classified by its semantic operation rather than
 * its obfuscated name. Two methods from different revisions that read the same
 * number of bytes and return the same type share the same {@link #getReadType()},
 * even though Jagex renamed them and changed their obfuscation parameters.
 *
 * <p>Classification uses two invariants that survive obfuscation:
 * <ol>
 *   <li>The number of BALOAD instructions (= bytes read from the buffer)</li>
 *   <li>The JVM return type (I, J, Z, B, V)</li>
 * </ol>
 *
 * <p>These two values form the method's "read type" string, e.g. {@code "I4"}
 * for a method returning int that reads 4 bytes (readInt), or {@code "I2"} for
 * readShort. Methods with BALOAD count 0 are typically control methods (read
 * from a sub-buffer, or void writes) and get type {@code "X0"}.
 */
public final class BufferMethod
{
    private final String readType;
    private final String writeType;
    private final int byteCount;
    private final int writeByteCount;
    private final List<String> writeEncodings;

    private BufferMethod(String readType, int byteCount,
        String writeType, int writeByteCount,
        List<String> writeEncodings)
    {
        this.readType = readType;
        this.byteCount = byteCount;
        this.writeType = writeType;
        this.writeByteCount = writeByteCount;
        this.writeEncodings = Collections.unmodifiableList(
            new ArrayList<>(writeEncodings));
    }

    /** Classifies one method by its byte-read and byte-write operations. */
    public static BufferMethod of(MethodNode method)
    {
        int baloadCount = 0;
        int bastoreCount = 0;
        for (AbstractInsnNode insn : method.instructions)
        {
            if (insn.getOpcode() == Opcodes.BALOAD) baloadCount++;
            if (insn.getOpcode() == Opcodes.BASTORE) bastoreCount++;
        }

        char returnChar = returnTypeChar(method.desc);
        String readType = "" + returnChar + baloadCount;
        String writeType = "W" + bastoreCount;

        List<String> encodings = extractWriteEncodings(method, bastoreCount);

        return new BufferMethod(readType, baloadCount,
            writeType, bastoreCount, encodings);
    }

    private static List<String> extractWriteEncodings(
        MethodNode method, int bastoreCount)
    {
        if (isStringMethod(method.desc))
        {
            return Collections.singletonList(
                classifyStringMethod(method));
        }

        if (bastoreCount == 0)
        {
            return Collections.emptyList();
        }

        List<String> encodings = new ArrayList<>(bastoreCount);
        for (AbstractInsnNode insn : method.instructions)
        {
            if (insn.getOpcode() == Opcodes.BASTORE)
            {
                encodings.add(classifyBastore(insn));
            }
        }
        return encodings;
    }

    private static boolean isStringMethod(String descriptor)
    {
        return descriptor.contains("Ljava/lang/CharSequence;")
            || descriptor.contains("Ljava/lang/String;");
    }

    private static String classifyStringMethod(MethodNode method)
    {
        int nullStoreCount = 0;
        for (AbstractInsnNode insn : method.instructions)
        {
            if (insn.getOpcode() == Opcodes.BASTORE)
            {
                AbstractInsnNode prev = Instructions.previousExecutable(insn);
                if (prev != null && prev.getOpcode() == Opcodes.I2B)
                {
                    prev = Instructions.previousExecutable(prev);
                }
                if (prev != null && prev.getOpcode() == Opcodes.ICONST_0)
                {
                    nullStoreCount++;
                }
            }
        }
        return nullStoreCount >= 2 ? "strc" : "strn";
    }

    private static String classifyBastore(AbstractInsnNode bastore)
    {
        AbstractInsnNode insn = Instructions.previousExecutable(bastore);

        if (insn != null && insn.getOpcode() == Opcodes.I2B)
        {
            insn = Instructions.previousExecutable(insn);
        }

        if (insn == null) return "v";

        switch (insn.getOpcode())
        {
            case Opcodes.IADD:
            {
                int c = findConstantForAdd(insn);
                return "a " + (c & 0xFF);
            }
            case Opcodes.ISUB:
            {
                int c = findMinuend(insn);
                return "s " + (c & 0xFF);
            }
            case Opcodes.ISHR:
            case Opcodes.IUSHR:
            {
                Integer constant = Instructions.intConstant(
                    Instructions.previousExecutable(insn));
                return constant == null ? "v" : "r " + constant;
            }
            default:
                return "v";
        }
    }

    /**
     * For IADD, one operand is the value (ILOAD) and the other is a
     * constant. Walk backward to find the constant.
     */
    private static int findConstantForAdd(AbstractInsnNode iadd)
    {
        AbstractInsnNode a = Instructions.previousExecutable(iadd);
        Integer constant = Instructions.intConstant(a);
        if (constant != null) return constant;

        if (a != null)
        {
            constant = Instructions.intConstant(
                Instructions.previousExecutable(a));
            if (constant != null) return constant;
        }
        return 0;
    }

    /**
     * For ISUB, the minuend (constant) was pushed before the subtrahend
     * (value). Walk back past the ILOAD to find the constant.
     */
    private static int findMinuend(AbstractInsnNode isub)
    {
        AbstractInsnNode subtrahend = Instructions.previousExecutable(isub);
        if (subtrahend == null) return 0;
        Integer constant = Instructions.intConstant(
            Instructions.previousExecutable(subtrahend));
        if (constant != null) return constant;

        constant = Instructions.intConstant(subtrahend);
        if (constant != null) return constant;
        return 0;
    }

    /**
     * Stable read-type classification: return type + BALOAD count. Examples:
     * "I4" = readInt (4 bytes, returns int), "I2" = readShort (2 bytes),
     * "J8" = readLong (8 bytes, returns long), "V0" = void control method.
     */
    public String getReadType()
    {
        return readType;
    }

    /**
     * Stable write-type classification: "W" + BASTORE count. Examples:
     * "W4" = writeInt (4 bytes), "W2" = writeShort, "W1" = writeByte,
     * "W8" = writeLong, "W0" = no direct byte writes.
     */
    public String getWriteType()
    {
        return writeType;
    }

    /** Number of bytes this method reads from the buffer. */
    public int getByteCount()
    {
        return byteCount;
    }

    /** Number of bytes this method writes to the buffer. */
    public int getWriteByteCount()
    {
        return writeByteCount;
    }

    /**
     * Per-byte encoding for write methods. Each entry describes the
     * transformation applied to produce one byte: "v" (vanilla),
     * "r N" (right-shift by N), "a N" (add N), "s N" (N minus value),
     * "strn" (null-terminated string), "strc" (null-circumfixed string).
     */
    public List<String> getWriteEncodings()
    {
        return writeEncodings;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof BufferMethod)) return false;
        BufferMethod other = (BufferMethod) object;
        return readType.equals(other.readType);
    }

    @Override
    public int hashCode()
    {
        return readType.hashCode();
    }

    private static char returnTypeChar(String descriptor)
    {
        int closeIndex = descriptor.lastIndexOf(')');
        if (closeIndex < 0 || closeIndex + 1 >= descriptor.length()) return 'X';
        char c = descriptor.charAt(closeIndex + 1);
        switch (c)
        {
            case 'I': case 'J': case 'Z': case 'B': case 'V': case 'F':
                return c;
            default:
                return 'X';
        }
    }
}
