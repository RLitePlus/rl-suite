package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Extracts the buffer infrastructure constants and class/field names needed to
 * construct and send a client packet by reflection.
 */
public final class BufferInfraExtractor
{
    private BufferInfraExtractor()
    {
    }

    public static Result extract(JarArchive archive,
        String bufferClassName, Set<String> bufferHierarchy,
        String clientPacketClassName)
    {
        ClassNode bufferClass = findClass(archive, bufferClassName);
        if (bufferClass == null)
        {
            throw new IllegalStateException(
                "Buffer class not found: " + bufferClassName);
        }

        String bufferArrayField = findFieldInHierarchy(
            archive, bufferHierarchy, "[B");
        String bufferOffsetField = findOffsetField(
            archive, bufferClass, bufferHierarchy);

        long[] multipliers = extractMultipliers(
            archive, bufferHierarchy, bufferOffsetField);
        long offsetMultiplier = multipliers[0];
        long indexMultiplier = multipliers[1];

        String[] gpbn = findGetPacketBufferNode(
            archive, clientPacketClassName);
        String classContainingGetPacketBufferNode = gpbn[0];
        String getPacketBufferNodeMethod = gpbn[1];
        String getPacketBufferNodeDesc = gpbn[2];
        String packetBufferNodeClassName = gpbn[3];

        String getPacketBufferNodeGarbageValue = "0";
        if (getPacketBufferNodeMethod != null)
        {
            getPacketBufferNodeGarbageValue = extractGarbageValue(
                archive, classContainingGetPacketBufferNode,
                getPacketBufferNodeMethod, getPacketBufferNodeDesc);
        }

        String packetBufferFieldName = null;
        if (packetBufferNodeClassName != null)
        {
            packetBufferFieldName = findFieldByTypePrefix(
                archive, packetBufferNodeClassName, bufferHierarchy);
        }

        String[] writerInfo = findPacketWriter(
            archive, classContainingGetPacketBufferNode,
            getPacketBufferNodeMethod, getPacketBufferNodeDesc);
        String packetWriterFieldName = writerInfo[0];
        String packetWriterClassName = writerInfo[1];
        String isaacCipherFieldName = writerInfo[2];

        String[] addNodeInfo = findAddNode(
            archive, packetBufferNodeClassName, packetWriterClassName);
        String addNodeMethodName = addNodeInfo[0];
        String addNodeGarbageValue = addNodeInfo[1];

        return new Result(
            bufferArrayField, bufferOffsetField,
            Long.toString(offsetMultiplier),
            Long.toString(indexMultiplier),
            clientPacketClassName,
            packetBufferNodeClassName,
            classContainingGetPacketBufferNode,
            getPacketBufferNodeGarbageValue,
            addNodeGarbageValue,
            packetWriterFieldName,
            packetWriterClassName,
            isaacCipherFieldName,
            addNodeMethodName,
            packetBufferFieldName);
    }

    private static String findFieldByDesc(ClassNode cn, String desc)
    {
        for (FieldNode fn : cn.fields)
        {
            if (fn.desc.equals(desc)) return fn.name;
        }
        return null;
    }

    private static String findFieldInHierarchy(JarArchive archive,
        Set<String> hierarchy, String desc)
    {
        for (String className : hierarchy)
        {
            ClassNode cn = findClass(archive, className);
            if (cn == null) continue;
            String name = findFieldByDesc(cn, desc);
            if (name != null) return name;
        }
        return null;
    }

    /**
     * The offset field is the int field that appears in PUTFIELD
     * instructions within buffer write methods.
     */
    private static String findOffsetField(JarArchive archive,
        ClassNode bufferClass, Set<String> bufferHierarchy)
    {
        Map<String, Integer> putfieldCounts = new LinkedHashMap<>();
        for (String className : bufferHierarchy)
        {
            ClassNode cn = findClass(archive, className);
            if (cn == null) continue;
            for (MethodNode mn : cn.methods)
            {
                if ("<init>".equals(mn.name)
                    || "<clinit>".equals(mn.name)) continue;
                for (AbstractInsnNode insn : mn.instructions)
                {
                    if (insn.getOpcode() == Opcodes.PUTFIELD
                        && insn instanceof FieldInsnNode)
                    {
                        FieldInsnNode fi = (FieldInsnNode) insn;
                        if ("I".equals(fi.desc)
                            && bufferHierarchy.contains(fi.owner))
                        {
                            putfieldCounts.merge(
                                fi.name, 1, Integer::sum);
                        }
                    }
                }
            }
        }
        return putfieldCounts.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
    }

    /**
     * Extracts offsetMultiplier and indexMultiplier from buffer methods.
     * offsetMultiplier: LDC constant used with IADD/ISUB near PUTFIELD
     * on the offset field.
     * indexMultiplier: LDC constant used with IMUL after GETFIELD on
     * the offset field.
     */
    private static long[] extractMultipliers(JarArchive archive,
        Set<String> bufferHierarchy, String offsetField)
    {
        Map<Long, Integer> imulConstants = new LinkedHashMap<>();
        Map<Long, Integer> iaddConstants = new LinkedHashMap<>();

        for (String className : bufferHierarchy)
        {
            ClassNode cn = findClass(archive, className);
            if (cn == null) continue;
            for (MethodNode mn : cn.methods)
            {
                if ("<init>".equals(mn.name)
                    || "<clinit>".equals(mn.name)) continue;

                for (AbstractInsnNode insn : mn.instructions)
                {
                    if (insn.getOpcode() == Opcodes.IMUL)
                    {
                        Long c = findLdcNear(insn);
                        if (c != null && Math.abs(c) > 255)
                        {
                            imulConstants.merge(c, 1, Integer::sum);
                        }
                    }
                    else if (insn.getOpcode() == Opcodes.IADD
                        && isNearPutfield(insn, offsetField,
                            bufferHierarchy))
                    {
                        Long c = findLdcNear(insn);
                        if (c != null && Math.abs(c) > 255)
                        {
                            iaddConstants.merge(c, 1, Integer::sum);
                        }
                    }
                }
            }
        }

        long indexMul = imulConstants.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(1L);

        long offsetMul = iaddConstants.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(1L);

        if (offsetMul == 1L && indexMul != 1L)
        {
            offsetMul = modInverse32(indexMul);
        }
        else if (indexMul == 1L && offsetMul != 1L)
        {
            indexMul = modInverse32(offsetMul);
        }

        return new long[]{offsetMul, indexMul};
    }

    private static long modInverse32(long val)
    {
        long mod = 1L << 32;
        val = ((val % mod) + mod) % mod;
        long result = 1;
        long base = val;
        long exp = (mod >> 1) - 1;
        while (exp > 0)
        {
            if ((exp & 1) == 1)
            {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return ((int) result);
    }

    private static boolean isNearPutfield(AbstractInsnNode insn,
        String offsetField, Set<String> bufferHierarchy)
    {
        AbstractInsnNode walk = insn.getNext();
        for (int i = 0; i < 5 && walk != null; i++)
        {
            if (walk.getOpcode() == Opcodes.PUTFIELD
                && walk instanceof FieldInsnNode)
            {
                FieldInsnNode fi = (FieldInsnNode) walk;
                if (offsetField != null
                    && offsetField.equals(fi.name)
                    && bufferHierarchy.contains(fi.owner))
                {
                    return true;
                }
            }
            walk = walk.getNext();
        }
        return false;
    }

    private static Long findLdcNear(AbstractInsnNode arith)
    {
        AbstractInsnNode prev = arith.getPrevious();
        for (int i = 0; i < 3 && prev != null; i++)
        {
            Long c = ldcIntValue(prev);
            if (c != null) return c;
            prev = prev.getPrevious();
        }
        AbstractInsnNode next = arith.getNext();
        for (int i = 0; i < 3 && next != null; i++)
        {
            Long c = ldcIntValue(next);
            if (c != null) return c;
            next = next.getNext();
        }
        return null;
    }

    private static Long ldcIntValue(AbstractInsnNode insn)
    {
        if (insn instanceof LdcInsnNode)
        {
            Object cst = ((LdcInsnNode) insn).cst;
            if (cst instanceof Integer) return (long) (int) cst;
            if (cst instanceof Long) return (Long) cst;
        }
        return null;
    }

    /**
     * Finds the getPacketBufferNode factory method: a static method
     * whose descriptor takes the clientPacketClassName as a parameter.
     * Returns [ownerClass, methodName, descriptor, returnType].
     */
    private static String[] findGetPacketBufferNode(
        JarArchive archive, String clientPacketClassName)
    {
        String paramType = "L" + clientPacketClassName + ";";
        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode mn : unit.getNode().methods)
            {
                if ((mn.access & Opcodes.ACC_STATIC) == 0) continue;
                if (!mn.desc.contains(paramType)) continue;
                Type returnType = Type.getReturnType(mn.desc);
                if (returnType.getSort() != Type.OBJECT) continue;
                if (returnType.getInternalName().startsWith("java/"))
                    continue;

                return new String[]{
                    unit.getNode().name,
                    mn.name,
                    mn.desc,
                    returnType.getInternalName()
                };
            }
        }
        return new String[]{null, null, null, null};
    }

    /**
     * Extracts the garbage value from call sites of a method.
     * The garbage value is the last integer constant pushed before
     * the call.
     */
    private static String extractGarbageValue(JarArchive archive,
        String ownerClass, String methodName, String methodDesc)
    {
        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode mn : unit.getNode().methods)
            {
                for (AbstractInsnNode insn : mn.instructions)
                {
                    if (!(insn instanceof MethodInsnNode)) continue;
                    MethodInsnNode mi = (MethodInsnNode) insn;
                    if (!mi.owner.equals(ownerClass)
                        || !mi.name.equals(methodName)
                        || !mi.desc.equals(methodDesc)) continue;

                    Integer constant = Instructions.intConstant(
                        Instructions.previousExecutable(insn));
                    if (constant != null)
                    {
                        return constant.toString();
                    }
                }
            }
        }
        return "0";
    }

    /**
     * Finds a field on the given class whose type is in the buffer
     * hierarchy.
     */
    private static String findFieldByTypePrefix(JarArchive archive,
        String className, Set<String> bufferHierarchy)
    {
        ClassNode cn = findClass(archive, className);
        if (cn == null) return null;
        for (FieldNode fn : cn.fields)
        {
            if (fn.desc.startsWith("L") && fn.desc.endsWith(";"))
            {
                String type = fn.desc.substring(1, fn.desc.length() - 1);
                if (bufferHierarchy.contains(type))
                {
                    return fn.name;
                }
            }
        }
        // Check superclasses
        String current = cn.superName;
        while (current != null && !"java/lang/Object".equals(current))
        {
            ClassNode parent = findClass(archive, current);
            if (parent == null) break;
            for (FieldNode fn : parent.fields)
            {
                if (fn.desc.startsWith("L") && fn.desc.endsWith(";"))
                {
                    String type = fn.desc.substring(
                        1, fn.desc.length() - 1);
                    if (bufferHierarchy.contains(type))
                    {
                        return fn.name;
                    }
                }
            }
            current = parent.superName;
        }
        return null;
    }

    /**
     * Finds the PacketWriter by tracing the second argument at
     * getPacketBufferNode call sites. The Isaac cipher is loaded via
     * GETFIELD from the PacketWriter, which is loaded via GETSTATIC.
     * Returns [packetWriterFieldName, packetWriterClassName,
     * isaacCipherFieldName].
     */
    private static String[] findPacketWriter(JarArchive archive,
        String gpbnOwner, String gpbnMethod, String gpbnDesc)
    {
        if (gpbnMethod == null)
        {
            return new String[]{null, null, null};
        }

        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode mn : unit.getNode().methods)
            {
                for (AbstractInsnNode insn : mn.instructions)
                {
                    if (!(insn instanceof MethodInsnNode)) continue;
                    MethodInsnNode mi = (MethodInsnNode) insn;
                    if (!mi.owner.equals(gpbnOwner)
                        || !mi.name.equals(gpbnMethod)
                        || !mi.desc.equals(gpbnDesc)) continue;

                    // Walk backward to find the argument pattern:
                    // GETSTATIC packetWriter
                    // GETFIELD isaacCipher
                    // ... (the clientPacket arg) ...
                    // INVOKESTATIC getPacketBufferNode
                    AbstractInsnNode walk = insn.getPrevious();
                    FieldInsnNode isaacField = null;
                    FieldInsnNode writerField = null;
                    int depth = 0;
                    while (walk != null && depth < 15)
                    {
                        if (walk instanceof FieldInsnNode)
                        {
                            FieldInsnNode fi = (FieldInsnNode) walk;
                            if (fi.getOpcode() == Opcodes.GETFIELD
                                && isaacField == null)
                            {
                                isaacField = fi;
                            }
                            else if (fi.getOpcode() == Opcodes.GETSTATIC
                                && isaacField != null
                                && writerField == null)
                            {
                                writerField = fi;
                                break;
                            }
                        }
                        walk = walk.getPrevious();
                        depth++;
                    }

                    if (writerField != null && isaacField != null)
                    {
                        String writerType = writerField.desc;
                        if (writerType.startsWith("L")
                            && writerType.endsWith(";"))
                        {
                            writerType = writerType.substring(
                                1, writerType.length() - 1);
                        }
                        return new String[]{
                            writerField.name,
                            writerType,
                            isaacField.name
                        };
                    }
                }
            }
        }
        return new String[]{null, null, null};
    }

    /**
     * Finds the addNode method on PacketWriter (takes
     * PacketBufferNode as a parameter). Returns [methodName,
     * garbageValue].
     */
    private static String[] findAddNode(JarArchive archive,
        String packetBufferNodeClassName, String packetWriterClassName)
    {
        if (packetBufferNodeClassName == null) return new String[]{null, "0"};

        String paramType = "L" + packetBufferNodeClassName + ";";

        // The real addNode takes (PacketBufferNode, int) where int is
        // the garbage parameter. A static helper may also exist that
        // takes (PacketWriter, PacketBufferNode) but has no garbage
        // param and no call sites. Prefer the method with an int param.
        String[] withGarbageParam = null;
        String[] withoutGarbageParam = null;

        for (ClassUnit unit : archive.getClasses())
        {
            if (packetWriterClassName != null
                && !unit.getNode().name.equals(packetWriterClassName))
            {
                continue;
            }
            for (MethodNode mn : unit.getNode().methods)
            {
                if (!mn.desc.contains(paramType)) continue;
                if ("<init>".equals(mn.name)
                    || "<clinit>".equals(mn.name)) continue;

                Type returnType = Type.getReturnType(mn.desc);
                if (returnType.getSort() != Type.VOID) continue;

                boolean hasIntParam = hasIntOrByteParam(mn.desc, paramType);
                if (hasIntParam && withGarbageParam == null)
                {
                    String garbage = extractGarbageValue(
                        archive, unit.getNode().name, mn.name, mn.desc);
                    withGarbageParam = new String[]{mn.name, garbage};
                }
                else if (!hasIntParam && withoutGarbageParam == null)
                {
                    withoutGarbageParam = new String[]{mn.name, "0"};
                }
            }
        }

        if (withGarbageParam != null) return withGarbageParam;
        if (withoutGarbageParam != null) return withoutGarbageParam;
        return new String[]{null, "0"};
    }

    private static boolean hasIntOrByteParam(String desc, String pbnParam)
    {
        String params = desc.substring(1, desc.indexOf(')'));
        String remaining = params.replace(pbnParam, "");
        remaining = remaining.replaceAll("L[^;]+;", "");
        return remaining.contains("I") || remaining.contains("B");
    }

    private static ClassNode findClass(JarArchive archive, String name)
    {
        for (ClassUnit unit : archive.getClasses())
        {
            if (unit.getNode().name.equals(name)) return unit.getNode();
        }
        return null;
    }

    public static final class Result
    {
        private final String bufferArrayField;
        private final String bufferOffsetField;
        private final String offsetMultiplier;
        private final String indexMultiplier;
        private final String clientPacketClassName;
        private final String packetBufferNodeClassName;
        private final String classContainingGetPacketBufferNodeName;
        private final String getPacketBufferNodeGarbageValue;
        private final String addNodeGarbageValue;
        private final String packetWriterFieldName;
        private final String packetWriterClassName;
        private final String isaacCipherFieldName;
        private final String addNodeMethodName;
        private final String packetBufferFieldName;

        Result(String bufferArrayField, String bufferOffsetField,
            String offsetMultiplier, String indexMultiplier,
            String clientPacketClassName,
            String packetBufferNodeClassName,
            String classContainingGetPacketBufferNodeName,
            String getPacketBufferNodeGarbageValue,
            String addNodeGarbageValue,
            String packetWriterFieldName,
            String packetWriterClassName,
            String isaacCipherFieldName,
            String addNodeMethodName,
            String packetBufferFieldName)
        {
            this.bufferArrayField = bufferArrayField;
            this.bufferOffsetField = bufferOffsetField;
            this.offsetMultiplier = offsetMultiplier;
            this.indexMultiplier = indexMultiplier;
            this.clientPacketClassName = clientPacketClassName;
            this.packetBufferNodeClassName = packetBufferNodeClassName;
            this.classContainingGetPacketBufferNodeName =
                classContainingGetPacketBufferNodeName;
            this.getPacketBufferNodeGarbageValue =
                getPacketBufferNodeGarbageValue;
            this.addNodeGarbageValue = addNodeGarbageValue;
            this.packetWriterFieldName = packetWriterFieldName;
            this.packetWriterClassName = packetWriterClassName;
            this.isaacCipherFieldName = isaacCipherFieldName;
            this.addNodeMethodName = addNodeMethodName;
            this.packetBufferFieldName = packetBufferFieldName;
        }

        public String getBufferArrayField() { return bufferArrayField; }
        public String getBufferOffsetField() { return bufferOffsetField; }
        public String getOffsetMultiplier() { return offsetMultiplier; }
        public String getIndexMultiplier() { return indexMultiplier; }
        public String getClientPacketClassName()
        { return clientPacketClassName; }
        public String getPacketBufferNodeClassName()
        { return packetBufferNodeClassName; }
        public String getClassContainingGetPacketBufferNodeName()
        { return classContainingGetPacketBufferNodeName; }
        public String getGetPacketBufferNodeGarbageValue()
        { return getPacketBufferNodeGarbageValue; }
        public String getAddNodeGarbageValue()
        { return addNodeGarbageValue; }
        public String getPacketWriterFieldName()
        { return packetWriterFieldName; }
        public String getPacketWriterClassName()
        { return packetWriterClassName; }
        public String getIsaacCipherFieldName()
        { return isaacCipherFieldName; }
        public String getAddNodeMethodName()
        { return addNodeMethodName; }
        public String getPacketBufferFieldName()
        { return packetBufferFieldName; }

        @Override
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            sb.append("bufferArrayField=").append(bufferArrayField);
            sb.append("\nbufferOffsetField=").append(bufferOffsetField);
            sb.append("\noffsetMultiplier=").append(offsetMultiplier);
            sb.append("\nindexMultiplier=").append(indexMultiplier);
            sb.append("\nclientPacketClassName=")
                .append(clientPacketClassName);
            sb.append("\npacketBufferNodeClassName=")
                .append(packetBufferNodeClassName);
            sb.append("\nclassContainingGetPacketBufferNodeName=")
                .append(classContainingGetPacketBufferNodeName);
            sb.append("\ngetPacketBufferNodeGarbageValue=")
                .append(getPacketBufferNodeGarbageValue);
            sb.append("\naddNodeGarbageValue=").append(addNodeGarbageValue);
            sb.append("\npacketWriterFieldName=")
                .append(packetWriterFieldName);
            sb.append("\npacketWriterClassName=")
                .append(packetWriterClassName);
            sb.append("\nisaacCipherFieldName=")
                .append(isaacCipherFieldName);
            sb.append("\naddNodeMethodName=").append(addNodeMethodName);
            sb.append("\npacketBufferFieldName=")
                .append(packetBufferFieldName);
            return sb.toString();
        }
    }
}
