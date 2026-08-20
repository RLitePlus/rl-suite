package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.objectweb.asm.Type;

/** Exact semantic names for declarations in one checksum-pinned input JAR. */
public final class SemanticMap
{
    private static final SemanticMap EMPTY = new SemanticMap(Collections.emptyMap(),
        Collections.emptyMap(), Collections.emptyMap());

    private final Map<String, String> classes;
    private final Map<FieldKey, String> fields;
    private final Map<MethodKey, String> methods;

    private SemanticMap(Map<String, String> classes, Map<FieldKey, String> fields,
                        Map<MethodKey, String> methods)
    {
        this.classes = Collections.unmodifiableMap(new LinkedHashMap<>(classes));
        this.fields = Collections.unmodifiableMap(new LinkedHashMap<>(fields));
        this.methods = Collections.unmodifiableMap(new LinkedHashMap<>(methods));
    }

    public static SemanticMap empty()
    {
        return EMPTY;
    }

    public static SemanticMap read(Path path, String expectedInputSha256) throws IOException
    {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        Map<String, String> metadata = new LinkedHashMap<>();
        Map<String, String> classes = new LinkedHashMap<>();
        Map<FieldKey, String> fields = new LinkedHashMap<>();
        Map<MethodKey, String> methods = new LinkedHashMap<>();
        for (int index = 0; index < lines.size(); index++)
        {
            String line = lines.get(index);
            if (line.isEmpty())
            {
                continue;
            }
            if (line.charAt(0) == '#')
            {
                parseMetadata(path, index + 1, line.substring(1).trim(), metadata);
                continue;
            }
            String[] columns = line.split("\\t", -1);
            if (columns.length != 5)
            {
                throw invalid(path, index + 1, "expected 5 tab-separated columns");
            }
            String kind = columns[0];
            String owner = columns[1];
            String name = columns[2];
            String descriptor = columns[3];
            String semantic = columns[4];
            validateInternalName(owner, path, index + 1, "owner");
            if ("class".equals(kind))
            {
                if (!"-".equals(name) || !"-".equals(descriptor))
                {
                    throw invalid(path, index + 1, "class name and descriptor must be '-'");
                }
                validateInternalName(semantic, path, index + 1, "semantic class name");
                putUnique(classes, owner, semantic, path, index + 1);
            }
            else if ("field".equals(kind))
            {
                validateMemberName(name, path, index + 1, "field name");
                validateMemberName(semantic, path, index + 1, "semantic field name");
                validateFieldDescriptor(descriptor, path, index + 1);
                putUnique(fields, new FieldKey(owner, name, descriptor), semantic, path,
                    index + 1);
            }
            else if ("method".equals(kind))
            {
                validateMemberName(name, path, index + 1, "method name");
                validateMemberName(semantic, path, index + 1, "semantic method name");
                validateMethodDescriptor(descriptor, path, index + 1);
                putUnique(methods, new MethodKey(owner, name, descriptor), semantic, path,
                    index + 1);
            }
            else
            {
                throw invalid(path, index + 1, "unknown kind: " + kind);
            }
        }

        if (!"rl-suite-semantic-map-v1".equals(metadata.get("format")))
        {
            throw new TransformException("Semantic map has missing or unsupported # format metadata: "
                + path);
        }
        String actualInputSha256 = metadata.get("input.sha256");
        if (actualInputSha256 == null)
        {
            throw new TransformException("Semantic map is missing # input.sha256 metadata: "
                + path);
        }
        if (!actualInputSha256.matches("[0-9a-fA-F]{64}"))
        {
            throw new TransformException("Semantic map has invalid # input.sha256 metadata: "
                + actualInputSha256);
        }
        if (!actualInputSha256.toLowerCase(Locale.ROOT).equals(
            expectedInputSha256.toLowerCase(Locale.ROOT)))
        {
            throw new TransformException("Semantic map input checksum mismatch: expected "
                + expectedInputSha256 + ", found " + actualInputSha256);
        }
        return new SemanticMap(classes, fields, methods);
    }

    public Map<String, String> getClasses()
    {
        return classes;
    }

    public Map<FieldKey, String> getFields()
    {
        return fields;
    }

    public Map<MethodKey, String> getMethods()
    {
        return methods;
    }

    private static void parseMetadata(Path path, int lineNumber, String value,
                                      Map<String, String> metadata)
    {
        int separator = value.indexOf('=');
        if (separator < 1)
        {
            return;
        }
        String key = value.substring(0, separator).trim();
        String item = value.substring(separator + 1).trim();
        if (key.isEmpty() || item.isEmpty() || metadata.put(key, item) != null)
        {
            throw invalid(path, lineNumber, "invalid or duplicate metadata: " + key);
        }
    }

    private static <K> void putUnique(Map<K, String> map, K key, String value, Path path,
                                      int lineNumber)
    {
        if (map.put(key, value) != null)
        {
            throw invalid(path, lineNumber, "duplicate declaration: " + key);
        }
    }

    private static void validateInternalName(String name, Path path, int lineNumber,
                                             String description)
    {
        if (name.isEmpty() || name.startsWith("/") || name.endsWith("/")
            || name.contains("//") || name.indexOf('.') >= 0 || name.indexOf(';') >= 0
            || name.indexOf('[') >= 0)
        {
            throw invalid(path, lineNumber, "invalid " + description + ": " + name);
        }
    }

    private static void validateMemberName(String name, Path path, int lineNumber,
                                           String description)
    {
        if (name.isEmpty() || name.indexOf('.') >= 0 || name.indexOf(';') >= 0
            || name.indexOf('[') >= 0 || name.indexOf('/') >= 0
            || name.indexOf('<') >= 0 || name.indexOf('>') >= 0)
        {
            throw invalid(path, lineNumber, "invalid " + description + ": " + name);
        }
    }

    private static void validateFieldDescriptor(String descriptor, Path path, int lineNumber)
    {
        try
        {
            Type type = Type.getType(descriptor);
            if (type.getSort() == Type.METHOD || type.getSort() == Type.VOID)
            {
                throw new IllegalArgumentException();
            }
            if (!type.getDescriptor().equals(descriptor))
            {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex)
        {
            throw invalid(path, lineNumber, "invalid field descriptor: " + descriptor);
        }
    }

    private static void validateMethodDescriptor(String descriptor, Path path, int lineNumber)
    {
        try
        {
            Type type = Type.getType(descriptor);
            if (type.getSort() != Type.METHOD || !type.getDescriptor().equals(descriptor))
            {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex)
        {
            throw invalid(path, lineNumber, "invalid method descriptor: " + descriptor);
        }
    }

    private static TransformException invalid(Path path, int lineNumber, String message)
    {
        return new TransformException("Invalid semantic map " + path + ":" + lineNumber
            + ": " + message);
    }
}
