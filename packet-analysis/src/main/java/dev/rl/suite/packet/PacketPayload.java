package dev.rl.suite.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * The payload structure of one packet: the ordered sequence of buffer
 * read or write calls that the handler executes to process it.
 *
 * <p>Two payloads from different revisions are structurally equivalent if they
 * have the same declared length and the same buffer operations in the same
 * order (matched by type, not obfuscated name).
 */
public final class PacketPayload
{
    private final int packetId;
    private final int declaredLength;
    private final List<ReadCall> reads;
    private final List<String> callDescriptors;
    private final List<String> fieldDescriptors;
    private final List<Integer> constants;
    private final List<String> rawFieldRefs;
    private final List<String> rawCallRefs;
    private final int insnCount;
    private final int branchCount;

    public PacketPayload(int packetId, List<ReadCall> reads)
    {
        this(packetId, Integer.MIN_VALUE, reads,
            Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList(), 0, 0);
    }

    public PacketPayload(int packetId, int declaredLength, List<ReadCall> reads)
    {
        this(packetId, declaredLength, reads,
            Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList(), 0, 0);
    }

    public PacketPayload(int packetId, int declaredLength, List<ReadCall> reads,
        List<String> callDescriptors, List<String> fieldDescriptors,
        int insnCount, int branchCount)
    {
        this(packetId, declaredLength, reads, callDescriptors, fieldDescriptors,
            Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList(), insnCount, branchCount);
    }

    public PacketPayload(int packetId, int declaredLength, List<ReadCall> reads,
        List<String> callDescriptors, List<String> fieldDescriptors,
        List<Integer> constants, int insnCount, int branchCount)
    {
        this(packetId, declaredLength, reads, callDescriptors, fieldDescriptors,
            constants, Collections.emptyList(), Collections.emptyList(),
            insnCount, branchCount);
    }

    public PacketPayload(int packetId, int declaredLength, List<ReadCall> reads,
        List<String> callDescriptors, List<String> fieldDescriptors,
        List<Integer> constants, List<String> rawFieldRefs,
        int insnCount, int branchCount)
    {
        this(packetId, declaredLength, reads, callDescriptors, fieldDescriptors,
            constants, rawFieldRefs, Collections.emptyList(),
            insnCount, branchCount);
    }

    public PacketPayload(int packetId, int declaredLength, List<ReadCall> reads,
        List<String> callDescriptors, List<String> fieldDescriptors,
        List<Integer> constants, List<String> rawFieldRefs,
        List<String> rawCallRefs, int insnCount, int branchCount)
    {
        this.packetId = packetId;
        this.declaredLength = declaredLength;
        this.reads = Collections.unmodifiableList(new ArrayList<>(reads));
        List<String> sortedCalls = new ArrayList<>(callDescriptors);
        Collections.sort(sortedCalls);
        this.callDescriptors = Collections.unmodifiableList(sortedCalls);
        List<String> sortedFields = new ArrayList<>(fieldDescriptors);
        Collections.sort(sortedFields);
        this.fieldDescriptors = Collections.unmodifiableList(sortedFields);
        List<Integer> sortedConsts = new ArrayList<>(constants);
        Collections.sort(sortedConsts);
        this.constants = Collections.unmodifiableList(sortedConsts);
        this.rawFieldRefs = Collections.unmodifiableList(new ArrayList<>(rawFieldRefs));
        this.rawCallRefs = Collections.unmodifiableList(new ArrayList<>(rawCallRefs));
        this.insnCount = insnCount;
        this.branchCount = branchCount;
    }

    public int getPacketId()
    {
        return packetId;
    }

    public List<ReadCall> getReads()
    {
        return reads;
    }

    /**
     * Declared packet length, or {@link Integer#MIN_VALUE} if not set.
     * Fixed-length packets carry their byte count; variable-length packets
     * carry -1 (byte-prefixed) or -2 (short-prefixed).
     */
    public int getDeclaredLength()
    {
        return declaredLength;
    }

    public int readCount()
    {
        return reads.size();
    }

    public List<String> getCallDescriptors()
    {
        return callDescriptors;
    }

    public List<String> getFieldDescriptors()
    {
        return fieldDescriptors;
    }

    public int getInsnCount()
    {
        return insnCount;
    }

    public List<Integer> getConstants()
    {
        return constants;
    }

    public int getBranchCount()
    {
        return branchCount;
    }

    public List<String> getRawFieldRefs()
    {
        return rawFieldRefs;
    }

    public List<String> getRawCallRefs()
    {
        return rawCallRefs;
    }

    /**
     * Structural signature: the sequence of buffer operation types
     * (e.g. ["I4", "I2", "I1"] for reads or ["W4", "W2", "W1"] for writes).
     * When a declared length is present, it is prepended as "L{n}" so that
     * packets with different wire lengths are never matched.
     */
    public List<String> structuralSignature()
    {
        List<String> signature = new ArrayList<>(reads.size() + 1);
        if (declaredLength != Integer.MIN_VALUE)
        {
            signature.add("L" + declaredLength);
        }
        for (ReadCall read : reads)
        {
            signature.add(read.getReadType());
        }
        return signature;
    }

    /**
     * Enriched signature: structural signature plus sorted non-buffer call
     * descriptors and field access descriptors. Used to disambiguate packets
     * that share the same structural signature.
     */
    public String enrichedSignature()
    {
        List<String> readMultiset = new ArrayList<>(structuralSignature());
        Collections.sort(readMultiset);
        return readMultiset + "|" + callDescriptors + "|" + fieldDescriptors;
    }

    /**
     * Signature based on handler body shape: call descriptors, field
     * descriptor counts, instruction count bucket, and branch count.
     * More tolerant than enrichedSignature for cross-revision comparison.
     */
    public String bodySignature()
    {
        TreeMap<String, Integer> fieldCounts = new TreeMap<>();
        for (String fd : fieldDescriptors)
        {
            fieldCounts.merge(fd, 1, Integer::sum);
        }
        int insnBucket = (insnCount / 5) * 5;
        return callDescriptors + "|" + fieldCounts + "|B" + branchCount
            + "|I" + insnBucket;
    }

    /**
     * Coarse shape signature: uses only operation COUNTS, not specific
     * descriptors. Tolerates code restructuring that changes which
     * methods are called but preserves the overall handler shape.
     */
    public String shapeSignature()
    {
        List<String> readMultiset = new ArrayList<>(structuralSignature());
        Collections.sort(readMultiset);

        TreeMap<String, Integer> fieldTypeCounts = new TreeMap<>();
        for (String fd : fieldDescriptors)
        {
            String prefix = fd.contains(":") ? fd.substring(0, fd.indexOf(':')) : fd;
            fieldTypeCounts.merge(prefix, 1, Integer::sum);
        }

        int insnBucket = (insnCount / 10) * 10;
        return readMultiset + "|C" + callDescriptors.size()
            + "|" + fieldTypeCounts
            + "|B" + branchCount
            + "|I" + insnBucket;
    }

    /**
     * Write-agnostic signature for client packets: replaces unstable
     * write types (BASTORE-dependent) with just the write count.
     * Stable across revisions where obfuscation restructures buffer
     * method bodies.
     */
    public String clientStableSignature()
    {
        String lenPrefix = declaredLength != Integer.MIN_VALUE
            ? "L" + declaredLength : "L?";

        TreeMap<String, Integer> fieldTypeCounts = new TreeMap<>();
        for (String fd : fieldDescriptors)
        {
            String prefix = fd.contains(":") ? fd.substring(0, fd.indexOf(':')) : fd;
            fieldTypeCounts.merge(prefix, 1, Integer::sum);
        }

        int insnBucket = (insnCount / 10) * 10;
        return lenPrefix + "|WC" + reads.size()
            + "|" + callDescriptors
            + "|" + fieldTypeCounts
            + "|B" + branchCount
            + "|I" + insnBucket;
    }

    /**
     * Ref-pattern signature: encodes the structural relationships between
     * field/call refs using equivalence classes instead of obfuscated names.
     * Refs that share the same owner.field get the same ID; refs on the
     * same owner but different field get the same owner ID but different
     * field ID. Stable across revisions where names change but structure
     * is preserved.
     */
    public String refPatternSignature()
    {
        Map<String, Integer> ownerIds = new LinkedHashMap<>();
        Map<String, Integer> fullIds = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder();
        sb.append("F[");
        for (int i = 0; i < rawFieldRefs.size(); i++)
        {
            if (i > 0) sb.append(',');
            String ref = rawFieldRefs.get(i);
            String prefix = "";
            String body = ref;
            int colon = ref.indexOf(':');
            if (colon >= 0)
            {
                prefix = ref.substring(0, colon);
                body = ref.substring(colon + 1);
            }
            int dot = body.indexOf('.');
            String owner = dot > 0 ? body.substring(0, dot) : body;

            int oid = ownerIds.computeIfAbsent(owner, k -> ownerIds.size());
            int fid = fullIds.computeIfAbsent(body, k -> fullIds.size());
            sb.append(prefix).append(':').append(oid).append('.').append(fid);
        }
        sb.append("]|R[");
        for (int i = 0; i < rawCallRefs.size(); i++)
        {
            if (i > 0) sb.append(',');
            String ref = rawCallRefs.get(i);
            int dot = ref.indexOf('.');
            String owner = dot > 0 ? ref.substring(0, dot) : ref;

            int oid = ownerIds.computeIfAbsent(owner, k -> ownerIds.size());
            int fid = fullIds.computeIfAbsent(ref, k -> fullIds.size());
            sb.append(oid).append('.').append(fid);
        }
        sb.append(']');
        return sb.toString();
    }

    public String constantSignature()
    {
        return constants.toString();
    }

    /** One buffer method call within a packet handler case. */
    public static final class ReadCall
    {
        private final String methodName;
        private final String descriptor;
        private final String readType;

        public ReadCall(String methodName, String descriptor, String readType)
        {
            this.methodName = Objects.requireNonNull(methodName);
            this.descriptor = Objects.requireNonNull(descriptor);
            this.readType = Objects.requireNonNull(readType);
        }

        /** Obfuscated method name at this revision. */
        public String getMethodName()
        {
            return methodName;
        }

        /** JVM descriptor, e.g. {@code (I)I}. */
        public String getDescriptor()
        {
            return descriptor;
        }

        /** Read-type classification, e.g. {@code "I4"} for readInt. */
        public String getReadType()
        {
            return readType;
        }

        @Override
        public boolean equals(Object object)
        {
            if (this == object) return true;
            if (!(object instanceof ReadCall)) return false;
            return readType.equals(((ReadCall) object).readType);
        }

        @Override
        public int hashCode()
        {
            return readType.hashCode();
        }

        @Override
        public String toString()
        {
            return methodName + descriptor + "[" + readType + "]";
        }
    }
}
