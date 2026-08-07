package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Immutable index of the original class and member declaration identities. */
final class SymbolTable
{
    private final List<ClassEntry> classes;
    private final List<FieldEntry> fields;
    private final List<MethodEntry> methods;
    private final Map<String, ClassEntry> classesByName;
    private final Map<FieldKey, FieldEntry> fieldsByKey;
    private final Map<MethodKey, MethodEntry> methodsByKey;
    private final String fingerprint;

    private SymbolTable(List<ClassEntry> classes, List<FieldEntry> fields,
                        List<MethodEntry> methods, Map<String, ClassEntry> classesByName,
                        Map<FieldKey, FieldEntry> fieldsByKey,
                        Map<MethodKey, MethodEntry> methodsByKey, String fingerprint)
    {
        this.classes = Collections.unmodifiableList(classes);
        this.fields = Collections.unmodifiableList(fields);
        this.methods = Collections.unmodifiableList(methods);
        this.classesByName = Collections.unmodifiableMap(classesByName);
        this.fieldsByKey = Collections.unmodifiableMap(fieldsByKey);
        this.methodsByKey = Collections.unmodifiableMap(methodsByKey);
        this.fingerprint = fingerprint;
    }

    static SymbolTable from(JarArchive archive)
    {
        List<ClassEntry> classes = new ArrayList<>();
        List<FieldEntry> fields = new ArrayList<>();
        List<MethodEntry> methods = new ArrayList<>();
        Map<String, ClassEntry> classesByName = new LinkedHashMap<>();
        Map<FieldKey, FieldEntry> fieldsByKey = new LinkedHashMap<>();
        Map<MethodKey, MethodEntry> methodsByKey = new LinkedHashMap<>();

        for (ClassUnit unit : archive.getClasses())
        {
            ClassNode node = unit.getNode();
            ClassEntry classEntry = new ClassEntry(unit, node);
            if (classesByName.put(node.name, classEntry) != null)
            {
                throw new TransformException("Duplicate class declaration: " + node.name);
            }
            classes.add(classEntry);

            for (FieldNode field : node.fields)
            {
                FieldKey key = new FieldKey(node.name, field.name, field.desc);
                FieldEntry entry = new FieldEntry(key, field);
                if (fieldsByKey.put(key, entry) != null)
                {
                    throw new TransformException("Duplicate field declaration: " + key);
                }
                fields.add(entry);
            }
            for (MethodNode method : node.methods)
            {
                MethodKey key = new MethodKey(node.name, method.name, method.desc);
                MethodEntry entry = new MethodEntry(key, method);
                if (methodsByKey.put(key, entry) != null)
                {
                    throw new TransformException("Duplicate method declaration: " + key);
                }
                methods.add(entry);
            }
        }

        classes.sort((left, right) -> left.name().compareTo(right.name()));
        fields.sort((left, right) -> left.key.compareTo(right.key));
        methods.sort((left, right) -> left.key.compareTo(right.key));
        String fingerprint = fingerprint(classes, fields, methods);
        return new SymbolTable(classes, fields, methods, classesByName, fieldsByKey,
            methodsByKey, fingerprint);
    }

    List<ClassEntry> classes()
    {
        return classes;
    }

    List<FieldEntry> fields()
    {
        return fields;
    }

    List<MethodEntry> methods()
    {
        return methods;
    }

    ClassEntry classEntry(String name)
    {
        return classesByName.get(name);
    }

    FieldEntry field(FieldKey key)
    {
        return fieldsByKey.get(key);
    }

    MethodEntry method(MethodKey key)
    {
        return methodsByKey.get(key);
    }

    boolean containsClass(String name)
    {
        return classesByName.containsKey(name);
    }

    String fingerprint()
    {
        return fingerprint;
    }

    private static String fingerprint(List<ClassEntry> classes, List<FieldEntry> fields,
                                      List<MethodEntry> methods)
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            for (ClassEntry entry : classes)
            {
                update(digest, "C");
                update(digest, entry.node.name);
                update(digest, Integer.toString(entry.node.access));
                update(digest, entry.node.superName == null ? "" : entry.node.superName);
                List<String> interfaces = new ArrayList<>(entry.node.interfaces);
                Collections.sort(interfaces);
                for (String interfaceName : interfaces)
                {
                    update(digest, "I");
                    update(digest, interfaceName);
                }
            }
            for (FieldEntry entry : fields)
            {
                update(digest, "F");
                update(digest, entry.key.getOwner());
                update(digest, entry.key.getName());
                update(digest, entry.key.getDescriptor());
                update(digest, Integer.toString(entry.node.access));
            }
            for (MethodEntry entry : methods)
            {
                update(digest, "M");
                update(digest, entry.key.getOwner());
                update(digest, entry.key.getName());
                update(digest, entry.key.getDescriptor());
                update(digest, Integer.toString(entry.node.access));
            }
            StringBuilder hexadecimal = new StringBuilder(64);
            for (byte value : digest.digest())
            {
                hexadecimal.append(String.format("%02x", value & 0xff));
            }
            return hexadecimal.toString();
        }
        catch (NoSuchAlgorithmException ex)
        {
            throw new IllegalStateException("SHA-256 is unavailable", ex);
        }
    }

    private static void update(MessageDigest digest, String value)
    {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        digest.update(ByteBuffer.allocate(4).putInt(bytes.length).array());
        digest.update(bytes);
    }

    static final class ClassEntry
    {
        private final ClassUnit unit;
        private final ClassNode node;

        private ClassEntry(ClassUnit unit, ClassNode node)
        {
            this.unit = unit;
            this.node = node;
        }

        String name()
        {
            return node.name;
        }

        ClassUnit unit()
        {
            return unit;
        }

        ClassNode node()
        {
            return node;
        }
    }

    static final class FieldEntry
    {
        private final FieldKey key;
        private final FieldNode node;

        private FieldEntry(FieldKey key, FieldNode node)
        {
            this.key = key;
            this.node = node;
        }

        FieldKey key()
        {
            return key;
        }

        FieldNode node()
        {
            return node;
        }
    }

    static final class MethodEntry
    {
        private final MethodKey key;
        private final MethodNode node;

        private MethodEntry(MethodKey key, MethodNode node)
        {
            this.key = key;
            this.node = node;
        }

        MethodKey key()
        {
            return key;
        }

        MethodNode node()
        {
            return node;
        }
    }
}
