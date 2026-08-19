package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.rename.FieldKey;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
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
 * A checksum-pinned packet-name profile. The canonical TSV format records a
 * complete id/length fingerprint for both packet directions and an optional
 * field-name override for each id.
 */
public final class PacketNameProfile
{
    public static final String FORMAT = "rl-suite-packet-profile-v1";

    private static final Set<String> JAVA_RESERVED_WORDS = Set.of(
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
        "class", "const", "continue", "default", "do", "double", "else", "enum",
        "extends", "false", "final", "finally", "float", "for", "goto", "if",
        "implements", "import", "instanceof", "int", "interface", "long", "native",
        "new", "null", "package", "private", "protected", "public", "return", "short",
        "static", "strictfp", "super", "switch", "synchronized", "this", "throw",
        "throws", "transient", "true", "try", "void", "volatile", "while", "_");

    private final String contentSha256;
    private final Map<PacketDirection, DirectionProfile> directions;

    private PacketNameProfile(String contentSha256,
        Map<PacketDirection, DirectionProfile> directions)
    {
        this.contentSha256 = contentSha256;
        this.directions = directions;
    }

    /** Loads a local, version-pinned profile after checking its exact bytes. */
    public static PacketNameProfile load(Path path, String expectedSha256) throws IOException
    {
        Objects.requireNonNull(path, "path");
        return parse(Files.readAllBytes(path), expectedSha256, path.toString());
    }

    /** Loads a class-path profile after checking its exact bytes. */
    public static PacketNameProfile loadResource(String resourceName, String expectedSha256)
        throws IOException
    {
        Objects.requireNonNull(resourceName, "resourceName");
        String normalized = resourceName.startsWith("/")
            ? resourceName.substring(1) : resourceName;
        ClassLoader loader = PacketNameProfile.class.getClassLoader();
        try (InputStream input = loader.getResourceAsStream(normalized))
        {
            if (input == null)
            {
                throw new IOException("Packet profile resource does not exist: " + resourceName);
            }
            return parse(input.readAllBytes(), expectedSha256, resourceName);
        }
    }

    public String getContentSha256()
    {
        return contentSha256;
    }

    public int getEntryCount(PacketDirection direction)
    {
        return direction(direction).entries.size();
    }

    public int getNamedEntryCount(PacketDirection direction)
    {
        int count = 0;
        for (ProfileEntry entry : direction(direction).entries)
        {
            if (entry.overrideName != null)
            {
                count++;
            }
        }
        return count;
    }

    /** Resolves semantic names against the original symbols in an archive. */
    public Map<FieldKey, String> resolveOverrides(JarArchive archive)
    {
        Objects.requireNonNull(archive, "archive");
        List<ClassNode> classes = new ArrayList<>();
        for (ClassUnit unit : archive.getClasses())
        {
            classes.add(unit.getNode());
        }
        return resolveOverrides(classes);
    }

    /** Resolves semantic names against a collection of original class nodes. */
    public Map<FieldKey, String> resolveOverrides(Iterable<? extends ClassNode> classNodes)
    {
        Objects.requireNonNull(classNodes, "classNodes");
        List<ClassNode> classes = new ArrayList<>();
        for (ClassNode classNode : classNodes)
        {
            classes.add(Objects.requireNonNull(classNode, "classNode"));
        }
        classes.sort(Comparator.comparing(node -> node.name));

        Map<PacketDirection, PacketClassMatch> matches = new EnumMap<>(PacketDirection.class);
        for (PacketDirection direction : PacketDirection.values())
        {
            matches.put(direction, findUniqueMatch(classes, direction(direction), direction));
        }
        if (matches.get(PacketDirection.SERVER).owner.equals(
            matches.get(PacketDirection.CLIENT).owner))
        {
            throw new TransformException("Packet profile matched one class as both directions: "
                + matches.get(PacketDirection.SERVER).owner);
        }

        Map<FieldKey, String> result = new LinkedHashMap<>();
        for (PacketDirection direction : PacketDirection.values())
        {
            DirectionProfile profile = direction(direction);
            PacketClassMatch match = matches.get(direction);
            for (ProfileEntry entry : profile.entries)
            {
                if (entry.overrideName == null)
                {
                    continue;
                }
                FieldKey previousKey = match.fieldsById.get(entry.id);
                String previousName = result.put(previousKey, entry.overrideName);
                if (previousName != null)
                {
                    throw new TransformException("Packet field matched twice: " + previousKey);
                }
            }
        }
        return Collections.unmodifiableMap(result);
    }

    private DirectionProfile direction(PacketDirection direction)
    {
        DirectionProfile profile = directions.get(Objects.requireNonNull(direction, "direction"));
        if (profile == null)
        {
            throw new IllegalArgumentException("Profile has no " + direction + " direction");
        }
        return profile;
    }

    private static PacketClassMatch findUniqueMatch(List<ClassNode> classes,
        DirectionProfile profile, PacketDirection direction)
    {
        List<PacketClassMatch> matches = new ArrayList<>();
        for (ClassNode classNode : classes)
        {
            PacketClassMatch match = matchClass(classNode, profile);
            if (match != null)
            {
                matches.add(match);
            }
        }
        if (matches.size() != 1)
        {
            List<String> owners = new ArrayList<>();
            for (PacketClassMatch match : matches)
            {
                owners.add(match.owner);
            }
            throw new TransformException("Expected one "
                + direction.name().toLowerCase(Locale.ROOT) + " packet class matching the complete "
                + profile.entries.size() + "-entry id/length fingerprint; found "
                + matches.size() + " " + owners);
        }
        return matches.get(0);
    }

    private static PacketClassMatch matchClass(ClassNode classNode, DirectionProfile profile)
    {
        String descriptor = "L" + classNode.name + ";";
        Map<String, FieldNode> packetFields = new HashMap<>();
        for (FieldNode field : classNode.fields)
        {
            if ((field.access & Opcodes.ACC_STATIC) != 0 && descriptor.equals(field.desc))
            {
                if (packetFields.put(field.name, field) != null)
                {
                    return null;
                }
            }
        }
        if (packetFields.size() != profile.entries.size())
        {
            return null;
        }

        MethodNode initializer = null;
        for (MethodNode method : classNode.methods)
        {
            if ("<clinit>".equals(method.name) && "()V".equals(method.desc))
            {
                if (initializer != null)
                {
                    return null;
                }
                initializer = method;
            }
        }
        if (initializer == null)
        {
            return null;
        }

        Map<String, Assignment> assignmentsByField = new HashMap<>();
        for (AbstractInsnNode instruction : initializer.instructions)
        {
            if (!(instruction instanceof FieldInsnNode)
                || instruction.getOpcode() != Opcodes.PUTSTATIC)
            {
                continue;
            }
            FieldInsnNode put = (FieldInsnNode) instruction;
            if (!classNode.name.equals(put.owner) || !descriptor.equals(put.desc)
                || !packetFields.containsKey(put.name))
            {
                continue;
            }
            Assignment assignment = parseAssignment(classNode.name, put);
            if (assignment == null || assignmentsByField.put(put.name, assignment) != null)
            {
                return null;
            }
        }
        if (assignmentsByField.size() != profile.entries.size())
        {
            return null;
        }

        Map<Integer, FieldKey> fieldsById = new HashMap<>();
        for (Map.Entry<String, Assignment> field : assignmentsByField.entrySet())
        {
            Assignment assignment = field.getValue();
            if (assignment.id < 0 || assignment.id >= profile.entries.size())
            {
                return null;
            }
            ProfileEntry expected = profile.entries.get(assignment.id);
            if (expected.length != assignment.length
                || fieldsById.put(assignment.id,
                    new FieldKey(classNode.name, field.getKey(), descriptor)) != null)
            {
                return null;
            }
        }
        if (fieldsById.size() != profile.entries.size())
        {
            return null;
        }
        return new PacketClassMatch(classNode.name, fieldsById);
    }

    private static Assignment parseAssignment(String owner, FieldInsnNode put)
    {
        AbstractInsnNode invokeNode = previousExecutable(put);
        if (!(invokeNode instanceof MethodInsnNode))
        {
            return null;
        }
        MethodInsnNode invoke = (MethodInsnNode) invokeNode;
        if (invoke.getOpcode() != Opcodes.INVOKESPECIAL || !owner.equals(invoke.owner)
            || !"<init>".equals(invoke.name) || !"(II)V".equals(invoke.desc)
            || invoke.itf)
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
        return new Assignment(id, length);
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

    private static PacketNameProfile parse(byte[] bytes, String expectedSha256, String source)
    {
        String actualSha256 = sha256(bytes);
        String expected = normalizeSha256(expectedSha256);
        if (!expected.equals(actualSha256))
        {
            throw new IllegalArgumentException("Packet profile checksum mismatch for " + source
                + ": expected " + expected + ", got " + actualSha256);
        }

        Map<String, String> metadata = new LinkedHashMap<>();
        Map<PacketDirection, Map<Integer, ProfileEntry>> parsed =
            new EnumMap<>(PacketDirection.class);
        for (PacketDirection direction : PacketDirection.values())
        {
            parsed.put(direction, new HashMap<>());
        }

        String text = new String(bytes, StandardCharsets.UTF_8);
        String[] lines = text.split("\\n", -1);
        for (int index = 0; index < lines.length; index++)
        {
            String line = lines[index];
            if (line.endsWith("\r"))
            {
                line = line.substring(0, line.length() - 1);
            }
            if (line.isEmpty())
            {
                continue;
            }
            if (line.startsWith("#"))
            {
                int equals = line.indexOf('=');
                if (equals > 2)
                {
                    String key = line.substring(1, equals).trim();
                    String value = line.substring(equals + 1).trim();
                    if (metadata.put(key, value) != null)
                    {
                        invalid(source, index, "duplicate metadata key " + key);
                    }
                }
                continue;
            }

            String[] columns = line.split("\\t", -1);
            if (columns.length != 4)
            {
                invalid(source, index, "expected four tab-separated columns");
            }
            PacketDirection direction;
            try
            {
                direction = PacketDirection.valueOf(columns[0].toUpperCase(Locale.ROOT));
            }
            catch (IllegalArgumentException ex)
            {
                invalid(source, index, "unknown direction " + columns[0]);
                return null;
            }
            int id = parseInteger(columns[1], source, index, "id");
            int length = parseInteger(columns[2], source, index, "length");
            if (id < 0 || length < -2)
            {
                invalid(source, index, "id must be nonnegative and length must be at least -2");
            }
            String override = "-".equals(columns[3]) ? null : columns[3];
            if (override != null && !isJavaIdentifier(override))
            {
                invalid(source, index, "invalid Java field name " + override);
            }
            ProfileEntry previous = parsed.get(direction).put(id,
                new ProfileEntry(id, length, override));
            if (previous != null)
            {
                invalid(source, index, "duplicate " + direction + " id " + id);
            }
        }

        if (!FORMAT.equals(metadata.get("format")))
        {
            throw new IllegalArgumentException("Unsupported packet profile format in " + source
                + ": " + metadata.get("format"));
        }

        Map<PacketDirection, DirectionProfile> directions =
            new EnumMap<>(PacketDirection.class);
        for (PacketDirection direction : PacketDirection.values())
        {
            Map<Integer, ProfileEntry> byId = parsed.get(direction);
            if (byId.isEmpty())
            {
                throw new IllegalArgumentException("Packet profile has no " + direction
                    + " entries: " + source);
            }
            List<ProfileEntry> entries = new ArrayList<>();
            Set<String> names = new HashSet<>();
            for (int id = 0; id < byId.size(); id++)
            {
                ProfileEntry entry = byId.get(id);
                if (entry == null)
                {
                    throw new IllegalArgumentException("Packet profile " + direction
                        + " ids are not contiguous at " + id + ": " + source);
                }
                if (entry.overrideName != null && !names.add(entry.overrideName))
                {
                    throw new IllegalArgumentException("Duplicate " + direction
                        + " override name " + entry.overrideName + ": " + source);
                }
                entries.add(entry);
            }
            directions.put(direction,
                new DirectionProfile(Collections.unmodifiableList(entries)));
        }
        return new PacketNameProfile(actualSha256, Collections.unmodifiableMap(directions));
    }

    private static int parseInteger(String value, String source, int line, String label)
    {
        try
        {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException ex)
        {
            invalid(source, line, "invalid " + label + " " + value);
            return 0;
        }
    }

    private static void invalid(String source, int zeroBasedLine, String message)
    {
        throw new IllegalArgumentException("Invalid packet profile " + source + " at line "
            + (zeroBasedLine + 1) + ": " + message);
    }

    private static boolean isJavaIdentifier(String value)
    {
        if (value.isEmpty() || JAVA_RESERVED_WORDS.contains(value)
            || !Character.isJavaIdentifierStart(value.charAt(0)))
        {
            return false;
        }
        for (int index = 1; index < value.length(); index++)
        {
            if (!Character.isJavaIdentifierPart(value.charAt(index)))
            {
                return false;
            }
        }
        return true;
    }

    private static String normalizeSha256(String value)
    {
        Objects.requireNonNull(value, "expectedSha256");
        String normalized = value.toLowerCase(Locale.ROOT);
        if (normalized.length() != 64)
        {
            throw new IllegalArgumentException("Expected SHA-256 must contain 64 hex digits");
        }
        for (int index = 0; index < normalized.length(); index++)
        {
            char character = normalized.charAt(index);
            if ((character < '0' || character > '9')
                && (character < 'a' || character > 'f'))
            {
                throw new IllegalArgumentException("Expected SHA-256 is not hexadecimal");
            }
        }
        return normalized;
    }

    private static String sha256(byte[] bytes)
    {
        MessageDigest digest;
        try
        {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException ex)
        {
            throw new IllegalStateException("SHA-256 is unavailable", ex);
        }
        byte[] hashed = digest.digest(bytes);
        StringBuilder result = new StringBuilder(hashed.length * 2);
        for (byte value : hashed)
        {
            result.append(String.format(Locale.ROOT, "%02x", value & 0xff));
        }
        return result.toString();
    }

    private static final class ProfileEntry
    {
        private final int id;
        private final int length;
        private final String overrideName;

        private ProfileEntry(int id, int length, String overrideName)
        {
            this.id = id;
            this.length = length;
            this.overrideName = overrideName;
        }
    }

    private static final class DirectionProfile
    {
        private final List<ProfileEntry> entries;

        private DirectionProfile(List<ProfileEntry> entries)
        {
            this.entries = entries;
        }
    }

    private static final class Assignment
    {
        private final int id;
        private final int length;

        private Assignment(int id, int length)
        {
            this.id = id;
            this.length = length;
        }
    }

    private static final class PacketClassMatch
    {
        private final String owner;
        private final Map<Integer, FieldKey> fieldsById;

        private PacketClassMatch(String owner, Map<Integer, FieldKey> fieldsById)
        {
            this.owner = owner;
            this.fieldsById = fieldsById;
        }
    }
}
