package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public final class ClassFingerprinter
{
    private ClassFingerprinter()
    {
    }

    public static Map<String, String> deriveClassMapping(
        JarArchive srcArchive, JarArchive tgtArchive)
    {
        Map<String, ClassNode> srcNodes = new LinkedHashMap<>();
        for (ClassUnit u : srcArchive.getClasses())
            srcNodes.put(u.getNode().name, u.getNode());
        Map<String, ClassNode> tgtNodes = new LinkedHashMap<>();
        for (ClassUnit u : tgtArchive.getClasses())
            tgtNodes.put(u.getNode().name, u.getNode());

        Map<String, String> mapping = new LinkedHashMap<>();
        int prevSize;
        do
        {
            prevSize = mapping.size();
            Map<String, String> srcFp = new LinkedHashMap<>();
            for (Map.Entry<String, ClassNode> e : srcNodes.entrySet())
            {
                srcFp.put(e.getKey(), fingerprint(e.getValue(), mapping));
            }
            Map<String, String> tgtFp = new LinkedHashMap<>();
            Map<String, String> tgtReverse = new LinkedHashMap<>();
            for (Map.Entry<String, String> e : mapping.entrySet())
            {
                tgtReverse.put(e.getValue(), e.getKey());
            }
            for (Map.Entry<String, ClassNode> e : tgtNodes.entrySet())
            {
                tgtFp.put(e.getKey(), fingerprint(e.getValue(), tgtReverse));
            }

            Map<String, List<String>> srcByFp = new LinkedHashMap<>();
            for (Map.Entry<String, String> e : srcFp.entrySet())
            {
                if (mapping.containsKey(e.getKey())) continue;
                srcByFp.computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                    .add(e.getKey());
            }
            Map<String, List<String>> tgtByFp = new LinkedHashMap<>();
            for (Map.Entry<String, String> e : tgtFp.entrySet())
            {
                if (tgtReverse.containsKey(e.getKey())) continue;
                tgtByFp.computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                    .add(e.getKey());
            }

            for (Map.Entry<String, List<String>> e : srcByFp.entrySet())
            {
                List<String> srcClasses = e.getValue();
                List<String> tgtClasses = tgtByFp.getOrDefault(
                    e.getKey(), Collections.emptyList());
                if (srcClasses.size() == 1 && tgtClasses.size() == 1)
                {
                    mapping.put(srcClasses.get(0), tgtClasses.get(0));
                }
            }
        }
        while (mapping.size() > prevSize);

        return mapping;
    }

    private static String fingerprint(ClassNode node, Map<String, String> classMap)
    {
        List<String> methodShapes = new ArrayList<>();
        for (MethodNode m : node.methods)
        {
            if ("<init>".equals(m.name) || "<clinit>".equals(m.name))
                continue;
            String desc = PayloadExtractor.normalizeDescriptor(m.desc);
            int acc = m.access & 0x1F;
            int callCount = 0;
            int fieldCount = 0;
            if (m.instructions != null)
            {
                for (AbstractInsnNode insn : m.instructions)
                {
                    if (insn instanceof MethodInsnNode) callCount++;
                    else if (insn instanceof FieldInsnNode) fieldCount++;
                }
            }
            methodShapes.add(desc + ":" + acc + ":" + callCount + ":" + fieldCount);
        }
        Collections.sort(methodShapes);

        List<String> fieldShapes = new ArrayList<>();
        for (FieldNode f : node.fields)
        {
            String type = PayloadExtractor.normalizeTypeDesc(f.desc);
            int acc = f.access & 0x1F;
            fieldShapes.add(type + ":" + acc);
        }
        Collections.sort(fieldShapes);

        String superNorm;
        if (node.superName == null)
        {
            superNorm = "";
        }
        else if (node.superName.startsWith("java/"))
        {
            superNorm = node.superName;
        }
        else
        {
            String mapped = classMap.get(node.superName);
            superNorm = mapped != null ? "=" + mapped : "?";
        }
        List<String> ifaces = new ArrayList<>();
        if (node.interfaces != null)
        {
            for (String iface : node.interfaces)
            {
                if (iface.startsWith("java/"))
                {
                    ifaces.add(iface);
                }
                else
                {
                    String mapped = classMap.get(iface);
                    ifaces.add(mapped != null ? "=" + mapped : "?");
                }
            }
        }
        Collections.sort(ifaces);

        return "S" + superNorm + "|I" + ifaces
            + "|M" + methodShapes + "|F" + fieldShapes;
    }
}
