package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.util.Hashing;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Imports a verified runtime mapping package into the native semantic TSV model. */
final class VersionPackageSemanticImporter
{
    private VersionPackageSemanticImporter()
    {
    }

    static SemanticMap extract(Path mappings, Path jar, String sourceCommit) throws IOException
    {
        if (sourceCommit == null || !sourceCommit.matches("[0-9a-fA-F]{7,40}"))
        {
            throw new IOException("--source-commit must be a 7-40 character hexadecimal commit");
        }
        Map<String, Object> root = object(Json.parse(Files.readString(mappings)), mappings + ": root");
        String revision = text(root, "runeLiteVersion", mappings + ": runeLiteVersion");
        Map<String, ClassNode> classes = classes(JarArchive.read(jar));
        Map<String, SemanticMap.Entry> entries = new LinkedHashMap<>();

        for (Object value : list(root.get("classMappings"), mappings + ": classMappings"))
        {
            Map<String, Object> mapping = object(value, mappings + ": class mapping");
            String semantic = text(mapping, "name", mappings + ": class name");
            String owner = text(mapping, "obfName", mappings + ": class obfName");
            add(entries, new SemanticMap.Entry("class", owner, "-", "-", semantic), classes,
                null, SemanticSeedExtractor.obfuscatedClass(owner));
            addMembers(entries, classes, owner, mapping, "fields", false, mappings);
            addMembers(entries, classes, owner, mapping, "methods", true, mappings);
        }
        addStaticMembers(entries, classes, root, "staticFields", false, mappings);
        addStaticMembers(entries, classes, root, "staticMethods", true, mappings);

        Map<String, String> metadata = new LinkedHashMap<>();
        metadata.put("format", SemanticMap.FORMAT);
        metadata.put("revision", revision);
        metadata.put("input.sha256", Hashing.sha256(jar));
        metadata.put("source", "version-package-import");
        metadata.put("source.commit", sourceCommit);
        metadata.put("source.sha256", Hashing.sha256(mappings));
        metadata.put("source.license", "BSD-2-Clause");
        Object runeLiteCommit = root.get("runeLiteCommit");
        if (runeLiteCommit instanceof String && !((String) runeLiteCommit).isBlank())
        {
            metadata.put("source.runelite.commit", (String) runeLiteCommit);
        }
        return new SemanticMap(metadata, new ArrayList<>(entries.values()));
    }

    private static void addMembers(Map<String, SemanticMap.Entry> entries,
                                   Map<String, ClassNode> classes, String owner,
                                   Map<String, Object> mapping, String section,
                                   boolean method, Path path) throws IOException
    {
        for (Object value : list(mapping.get(section), path + ": " + section))
        {
            Map<String, Object> member = object(value, path + ": " + section + " entry");
            SemanticMap.Entry entry = entry(member, owner, method, path);
            add(entries, entry, classes, member.get("isStatic"),
                SemanticSeedExtractor.obfuscatedMember(entry.name));
        }
    }

    private static void addStaticMembers(Map<String, SemanticMap.Entry> entries,
                                         Map<String, ClassNode> classes,
                                         Map<String, Object> root, String section,
                                         boolean method, Path path) throws IOException
    {
        for (Object value : list(root.get(section), path + ": " + section))
        {
            Map<String, Object> member = object(value, path + ": " + section + " entry");
            SemanticMap.Entry entry = entry(member,
                text(member, "owner", path + ": owner"), method, path);
            add(entries, entry, classes, Boolean.TRUE,
                SemanticSeedExtractor.obfuscatedMember(entry.name));
        }
    }

    private static SemanticMap.Entry entry(Map<String, Object> member, String owner,
                                           boolean method, Path path) throws IOException
    {
        String name = text(member, "obfName", path + ": member obfName");
        if (method && (name.equals("<init>") || name.equals("<clinit>")))
        {
            throw new IOException(path + ": constructor cannot be a semantic method");
        }
        return new SemanticMap.Entry(method ? "method" : "field", owner, name,
            text(member, "typeDesc", path + ": member typeDesc"),
            text(member, "name", path + ": member name"));
    }

    private static void add(Map<String, SemanticMap.Entry> entries, SemanticMap.Entry entry,
                            Map<String, ClassNode> classes, Object expectedStatic,
                            boolean eligible) throws IOException
    {
        ClassNode owner = classes.get(entry.owner);
        if (owner == null)
        {
            throw new IOException("mapping package names missing class " + entry.owner);
        }
        if (!entry.kind.equals("class"))
        {
            boolean found = entry.kind.equals("field")
                ? owner.fields.stream().anyMatch(field -> field.name.equals(entry.name)
                    && field.desc.equals(entry.descriptor) && staticMatches(field.access, expectedStatic))
                : owner.methods.stream().anyMatch(method -> method.name.equals(entry.name)
                    && method.desc.equals(entry.descriptor) && staticMatches(method.access, expectedStatic));
            if (!found)
            {
                throw new IOException("mapping package names missing " + entry.kind + " "
                    + entry.owner + "." + entry.name + entry.descriptor);
            }
        }
        if (!eligible)
        {
            return;
        }
        SemanticMap.Entry previous = entries.putIfAbsent(entry.key(), entry);
        if (previous != null && !previous.equals(entry))
        {
            throw new IOException("mapping package entries disagree on " + entry.key());
        }
    }

    private static boolean staticMatches(int access, Object expected)
    {
        return !(expected instanceof Boolean)
            || ((access & Opcodes.ACC_STATIC) != 0) == (Boolean) expected;
    }

    private static Map<String, ClassNode> classes(JarArchive archive)
    {
        Map<String, ClassNode> classes = new LinkedHashMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }
        return classes;
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> object(Object value, String label) throws IOException
    {
        if (!(value instanceof Map))
        {
            throw new IOException(label + " must be an object");
        }
        return (Map<String, Object>) value;
    }

    @SuppressWarnings("unchecked")
    private static List<Object> list(Object value, String label) throws IOException
    {
        if (!(value instanceof List))
        {
            throw new IOException(label + " must be an array");
        }
        return (List<Object>) value;
    }

    private static String text(Map<String, Object> object, String key, String label) throws IOException
    {
        Object value = object.get(key);
        if (!(value instanceof String) || ((String) value).isBlank())
        {
            throw new IOException(label + " must be a non-empty string");
        }
        return (String) value;
    }
}
