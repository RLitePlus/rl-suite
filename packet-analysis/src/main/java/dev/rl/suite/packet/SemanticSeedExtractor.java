package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.util.Hashing;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Extracts mapping facts from RuneLite mapping annotations, without external implementation code. */
final class SemanticSeedExtractor
{
    private static final String OBFUSCATED_NAME = "Lnet/runelite/mapping/ObfuscatedName;";
    private static final String OBFUSCATED_SIGNATURE = "Lnet/runelite/mapping/ObfuscatedSignature;";
    private static final String IMPLEMENTS = "Lnet/runelite/mapping/Implements;";
    private static final String EXPORT = "Lnet/runelite/mapping/Export;";

    private SemanticSeedExtractor()
    {
    }

    static SemanticMap extract(Path mappedJar, Path rawJar, String revision, String sourceCommit)
        throws IOException
    {
        JarArchive archive = JarArchive.read(mappedJar);
        Map<String, String> mappedToObfuscated = new LinkedHashMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            String obfuscated = annotationValue(unit.getNode(), OBFUSCATED_NAME, "value");
            if (obfuscated != null)
            {
                mappedToObfuscated.put(unit.getNode().name, obfuscated);
            }
        }

        List<SemanticMap.Entry> entries = new ArrayList<>();
        for (ClassUnit unit : archive.getClasses())
        {
            ClassNode node = unit.getNode();
            String obfuscatedOwner = annotationValue(node, OBFUSCATED_NAME, "value");
            if (obfuscatedOwner == null)
            {
                continue;
            }
            String classSemantic = annotationValue(node, IMPLEMENTS, "value");
            boolean exportedMember = hasExport(node);
            if (classSemantic == null && exportedMember)
            {
                classSemantic = simpleName(node.name);
            }
            if (classSemantic != null && !classSemantic.isEmpty() && obfuscatedClass(obfuscatedOwner))
            {
                entries.add(new SemanticMap.Entry("class", obfuscatedOwner, "-", "-", classSemantic));
            }

            for (FieldNode field : node.fields)
            {
                String semantic = annotationValue(field, EXPORT, "value");
                String obfuscatedName = annotationValue(field, OBFUSCATED_NAME, "value");
                if (semantic == null || !obfuscatedMember(obfuscatedName))
                {
                    continue;
                }
                if (semantic.isEmpty())
                {
                    semantic = field.name;
                }
                entries.add(new SemanticMap.Entry("field", obfuscatedOwner, obfuscatedName,
                    originalDescriptor(field, field.desc, mappedToObfuscated), semantic));
            }
            for (MethodNode method : node.methods)
            {
                String semantic = annotationValue(method, EXPORT, "value");
                String obfuscatedName = annotationValue(method, OBFUSCATED_NAME, "value");
                if (semantic == null || !obfuscatedMember(obfuscatedName)
                    || (method.access & Opcodes.ACC_BRIDGE) != 0)
                {
                    continue;
                }
                if (semantic.isEmpty())
                {
                    semantic = method.name;
                }
                entries.add(new SemanticMap.Entry("method", obfuscatedOwner, obfuscatedName,
                    originalDescriptor(method, method.desc, mappedToObfuscated), semantic));
            }
        }

        Map<String, String> metadata = new LinkedHashMap<>();
        metadata.put("format", SemanticMap.FORMAT);
        if (revision != null)
        {
            metadata.put("revision", revision);
        }
        JarArchive raw = JarArchive.read(rawJar);
        omitExistingSemanticWrappers(entries, raw);
        validateAgainstRaw(entries, raw, rawJar);
        metadata.put("input.sha256", Hashing.sha256(rawJar));
        metadata.put("source.sha256", Hashing.sha256(mappedJar));
        metadata.put("source", "devious-annotations");
        if (sourceCommit != null)
        {
            metadata.put("source.commit", sourceCommit);
        }
        return new SemanticMap(metadata, entries);
    }

    private static void omitExistingSemanticWrappers(List<SemanticMap.Entry> entries, JarArchive raw)
    {
        Map<String, ClassNode> classes = new LinkedHashMap<>();
        for (ClassUnit unit : raw.getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }
        entries.removeIf(entry ->
        {
            ClassNode owner = classes.get(entry.owner);
            if (owner == null || entry.kind.equals("class"))
            {
                return false;
            }
            if (entry.kind.equals("field"))
            {
                return owner.fields.stream().anyMatch(field -> field.name.equals(entry.semantic)
                    && field.desc.equals(entry.descriptor));
            }
            return owner.methods.stream().anyMatch(method -> method.name.equals(entry.semantic)
                && method.desc.equals(entry.descriptor));
        });
    }

    private static void validateAgainstRaw(List<SemanticMap.Entry> entries, JarArchive raw,
                                           Path rawJar) throws IOException
    {
        Map<String, ClassNode> classes = new LinkedHashMap<>();
        for (ClassUnit unit : raw.getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }
        for (SemanticMap.Entry entry : entries)
        {
            ClassNode owner = classes.get(entry.owner);
            if (owner == null)
            {
                throw new IOException("annotation mapping names missing raw class " + entry.owner
                    + " in " + rawJar);
            }
            if (entry.kind.equals("field") && owner.fields.stream().noneMatch(field ->
                field.name.equals(entry.name) && field.desc.equals(entry.descriptor)))
            {
                throw new IOException("annotation mapping names missing raw field " + entry.owner
                    + "." + entry.name + ":" + entry.descriptor);
            }
            if (entry.kind.equals("method") && owner.methods.stream().noneMatch(method ->
                method.name.equals(entry.name) && method.desc.equals(entry.descriptor)))
            {
                throw new IOException("annotation mapping names missing raw method " + entry.owner
                    + "." + entry.name + entry.descriptor);
            }
        }
    }

    private static boolean obfuscatedClass(String name)
    {
        return name.matches("[a-z]{1,3}");
    }

    private static boolean obfuscatedMember(String name)
    {
        return name != null && name.length() <= 3 && !name.equals("run") && !name.equals("add");
    }

    private static boolean hasExport(ClassNode node)
    {
        for (FieldNode field : node.fields)
        {
            if (annotationValue(field, EXPORT, "value") != null)
            {
                return true;
            }
        }
        for (MethodNode method : node.methods)
        {
            if (annotationValue(method, EXPORT, "value") != null)
            {
                return true;
            }
        }
        return false;
    }

    private static String originalDescriptor(Object member, String mappedDescriptor,
                                             Map<String, String> mappedToObfuscated)
    {
        String annotated = annotationValue(member, OBFUSCATED_SIGNATURE, "descriptor");
        return annotated == null ? remapDescriptor(mappedDescriptor, mappedToObfuscated) : annotated;
    }

    private static String remapDescriptor(String descriptor, Map<String, String> names)
    {
        Type type = Type.getType(descriptor);
        return remapType(type, names).getDescriptor();
    }

    private static Type remapType(Type type, Map<String, String> names)
    {
        if (type.getSort() == Type.METHOD)
        {
            Type[] arguments = type.getArgumentTypes();
            for (int i = 0; i < arguments.length; i++)
            {
                arguments[i] = remapType(arguments[i], names);
            }
            return Type.getMethodType(remapType(type.getReturnType(), names), arguments);
        }
        if (type.getSort() == Type.ARRAY)
        {
            Type element = remapType(type.getElementType(), names);
            return Type.getType("[".repeat(type.getDimensions()) + element.getDescriptor());
        }
        if (type.getSort() == Type.OBJECT)
        {
            return Type.getObjectType(names.getOrDefault(type.getInternalName(), type.getInternalName()));
        }
        return type;
    }

    private static String simpleName(String name)
    {
        int slash = name.lastIndexOf('/');
        return slash < 0 ? name : name.substring(slash + 1);
    }

    private static String annotationValue(Object owner, String descriptor, String key)
    {
        List<AnnotationNode> visible;
        List<AnnotationNode> invisible;
        if (owner instanceof ClassNode)
        {
            visible = ((ClassNode) owner).visibleAnnotations;
            invisible = ((ClassNode) owner).invisibleAnnotations;
        }
        else if (owner instanceof FieldNode)
        {
            visible = ((FieldNode) owner).visibleAnnotations;
            invisible = ((FieldNode) owner).invisibleAnnotations;
        }
        else
        {
            visible = ((MethodNode) owner).visibleAnnotations;
            invisible = ((MethodNode) owner).invisibleAnnotations;
        }
        String value = annotationValue(visible, descriptor, key);
        return value == null ? annotationValue(invisible, descriptor, key) : value;
    }

    private static String annotationValue(List<AnnotationNode> annotations,
                                          String descriptor, String key)
    {
        for (AnnotationNode annotation : annotations == null
            ? Collections.<AnnotationNode>emptyList() : annotations)
        {
            if (!descriptor.equals(annotation.desc) || annotation.values == null)
            {
                continue;
            }
            for (int i = 0; i + 1 < annotation.values.size(); i += 2)
            {
                if (key.equals(annotation.values.get(i)))
                {
                    Object value = annotation.values.get(i + 1);
                    return value == null ? null : String.valueOf(value);
                }
            }
        }
        return null;
    }
}
