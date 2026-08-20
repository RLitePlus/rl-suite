package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.util.Hashing;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Drives the analysis library against a client JAR. Three modes:
 *
 * <pre>
 *   --derive  --jar NEW [--control JAR --control-hooks JSON]
 *   --verify  --jar JAR --mappings JSON
 *   --buffer-infra --jar JAR
 * </pre>
 *
 * <p>All three read the injected client, not a raw gamepack.
 *
 * <p>{@code --derive} refuses to print an answer for a new revision until the
 * same rules have reproduced a known-good result on the control revision, so a
 * rule that has silently stopped working fails loudly instead of returning a
 * plausible wrong name.</p>
 */
public final class HookCli
{
    private HookCli()
    {
    }

    public static void main(String[] args) throws IOException
    {
        Map<String, String> options = parse(args);
        if (options.isEmpty() || options.containsKey("help"))
        {
            usage();
            System.exit(options.containsKey("help") ? 0 : 2);
            return;
        }
        if (options.containsKey("derive"))
        {
            System.exit(derive(options));
        }
        else if (options.containsKey("verify"))
        {
            System.exit(verify(options));
        }
        else if (options.containsKey("buffer-infra"))
        {
            System.exit(bufferInfra(options));
        }
        else if (options.containsKey("extract-semantic-seed"))
        {
            System.exit(extractSemanticSeed(options));
        }
        else if (options.containsKey("update-semantic"))
        {
            System.exit(updateSemantic(options));
        }
        else
        {
            usage();
            System.exit(2);
        }
    }

    // ---- derive ---------------------------------------------------------

    private static int derive(Map<String, String> options) throws IOException
    {
        Path jar = resolveJar(required(options, "jar").toString());
        if (options.containsKey("control") != options.containsKey("control-hooks"))
        {
            System.err.println("--control and --control-hooks must be given together");
            return 2;
        }

        if (options.containsKey("control"))
        {
            Map<String, HookExtractor.Hook> expected =
                readHooks(Paths.get(options.get("control-hooks")));
            Map<String, HookExtractor.Hook> actual =
                HookExtractor.derive(JarArchive.read(resolveJar(options.get("control"))));
            List<String> failures = new ArrayList<>();
            for (Map.Entry<String, HookExtractor.Hook> entry : expected.entrySet())
            {
                HookExtractor.Hook found = actual.get(entry.getKey());
                if (found == null)
                {
                    failures.add(entry.getKey() + ": rule found nothing, expected " + entry.getValue());
                }
                else if (!found.equals(entry.getValue()))
                {
                    failures.add(entry.getKey() + ": rule says " + found
                        + ", control says " + entry.getValue());
                }
            }
            int checked = expected.size() - failures.size();
            System.out.println("control: " + checked + "/" + expected.size()
                + " known hooks reproduced from " + options.get("control"));
            for (String failure : failures)
            {
                System.out.println("  FAIL " + failure);
            }
            if (!failures.isEmpty())
            {
                System.out.println();
                System.out.println("Refusing to derive against " + jar
                    + " while a rule disagrees with the control.");
                return 1;
            }
        }
        else
        {
            System.out.println("control: none given - results below are unchecked");
        }

        Map<String, HookExtractor.Hook> hooks = HookExtractor.derive(JarArchive.read(jar));
        System.out.println();
        System.out.println("derived from " + jar + ":");
        for (Map.Entry<String, HookExtractor.Hook> entry : hooks.entrySet())
        {
            System.out.println("  " + pad(entry.getKey()) + entry.getValue());
        }
        if (options.containsKey("json"))
        {
            Path out = Paths.get(options.get("json"));
            Files.writeString(out, writeJson(hooks, options.get("version")));
            System.out.println();
            System.out.println("wrote " + hooks.size() + " hooks to " + out);
        }
        return 0;
    }

    /**
     * The derived hooks as a tool-neutral JSON document: one entry per hook, each carrying the key,
     * the obfuscated owner class, the member name, its descriptor and any garbage decoder. A consumer
     * decides from the key shape where each belongs - a bare key is a static, {@code Class.member} an
     * instance member, a descriptor beginning {@code (} a method. This does not encode any one
     * launcher's mapping schema.
     */
    private static String writeJson(Map<String, HookExtractor.Hook> hooks, String version)
    {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"runeLiteVersion\": ").append(quote(version)).append(",\n");
        json.append("  \"hooks\": [\n");
        int i = 0;
        for (Map.Entry<String, HookExtractor.Hook> entry : hooks.entrySet())
        {
            HookExtractor.Hook hook = entry.getValue();
            json.append("    {")
                .append("\"key\": ").append(quote(entry.getKey())).append(", ")
                .append("\"owner\": ").append(quote(hook.getOwner())).append(", ")
                .append("\"obf\": ").append(quote(hook.getName())).append(", ")
                .append("\"desc\": ").append(quote(hook.getDesc())).append(", ")
                .append("\"garbage\": ").append(quote(hook.getMultiplier()))
                .append("}");
            json.append(++i < hooks.size() ? ",\n" : "\n");
        }
        json.append("  ]\n}\n");
        return json.toString();
    }

    private static String quote(String value)
    {
        if (value == null)
        {
            return "null";
        }
        StringBuilder out = new StringBuilder("\"");
        for (int i = 0; i < value.length(); i++)
        {
            char c = value.charAt(i);
            if (c == '"' || c == '\\')
            {
                out.append('\\').append(c);
            }
            else
            {
                out.append(c);
            }
        }
        return out.append('"').toString();
    }

    /** Rebuilds the hook map from a supplemental mapping file. */
    private static Map<String, HookExtractor.Hook> readHooks(Path path) throws IOException
    {
        Map<String, Object> root = asObject(Json.parse(read(path)));
        Map<String, Object> garbage = root.containsKey("garbage")
            ? asObject(root.get("garbage")) : new LinkedHashMap<>();
        Map<String, HookExtractor.Hook> hooks = new TreeMap<>();

        for (Object element : asList(root.get("classMappings")))
        {
            Map<String, Object> mapping = asObject(element);
            String name = (String) mapping.get("name");
            String owner = (String) mapping.get("obfName");
            hooks.put(name, new HookExtractor.Hook(owner, null, null, null));
            for (Object fieldElement : asList(mapping.get("fields")))
            {
                Map<String, Object> field = asObject(fieldElement);
                String key = name + "." + field.get("name");
                hooks.put(key, new HookExtractor.Hook(owner, (String) field.get("obfName"),
                    (String) field.get("typeDesc"), (String) garbage.get(key)));
            }
        }
        for (Object element : asList(root.get("staticFields")))
        {
            Map<String, Object> field = asObject(element);
            String key = (String) field.get("name");
            hooks.put(key, new HookExtractor.Hook((String) field.get("owner"),
                (String) field.get("obfName"), (String) field.get("typeDesc"),
                (String) garbage.get(key)));
        }
        // Only compare keys a rule actually claims to derive; the rest of the
        // supplemental is hand-maintained and has nothing to check against.
        hooks.keySet().retainAll(HookExtractor.SUPPORTED_KEYS);
        return hooks;
    }

    // ---- verify ---------------------------------------------------------

    private static int verify(Map<String, String> options) throws IOException
    {
        Path jar = required(options, "jar");
        Path mappings = required(options, "mappings");
        Map<String, ClassNode> classes = new LinkedHashMap<>();
        for (ClassUnit unit : JarArchive.read(jar).getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }

        Object parsed = Json.parse(read(mappings));
        Map<String, Object> root = parsed instanceof List
            ? java.util.Collections.singletonMap("classMappings", parsed) : asObject(parsed);
        List<String> problems = new ArrayList<>();
        int checked = 0;

        for (Object element : asList(root.get("classMappings")))
        {
            Map<String, Object> mapping = asObject(element);
            String label = value(mapping, "name", "name");
            String owner = value(mapping, "obfName", "obfuscatedName");
            if (!classes.containsKey(owner))
            {
                problems.add("missing class " + owner + "   (" + label + ")");
                continue;
            }
            checked++;
            for (Object fieldElement : asList(mapping.get("fields")))
            {
                Map<String, Object> field = asObject(fieldElement);
                checked++;
                if (!hasMember(classes.get(owner), value(field, "obfName", "obfuscatedName"),
                    value(field, "typeDesc", "descriptor")))
                {
                    problems.add("missing " + owner + "." + field.get("obfName") + " "
                        + field.get("typeDesc") + "   (" + label + "." + field.get("name") + ")");
                }
            }
            for (Object methodElement : asList(mapping.get("methods")))
            {
                Map<String, Object> method = asObject(methodElement);
                checked++;
                if (!hasMember(classes.get(owner), value(method, "obfName", "obfuscatedName"),
                    value(method, "typeDesc", "descriptor")))
                {
                    problems.add("missing " + owner + "." + method.get("obfName") + " "
                        + method.get("typeDesc") + "   (" + label + "." + method.get("name") + ")");
                }
            }
        }
        for (String section : new String[] {"staticFields", "staticMethods"})
        {
            for (Object element : asList(root.get(section)))
            {
                Map<String, Object> member = asObject(element);
                String owner = value(member, "owner", "ownerObfuscatedName");
                checked++;
                if (!classes.containsKey(owner))
                {
                    problems.add("missing class " + owner + "   (" + member.get("name") + ")");
                }
                else if (!hasMember(classes.get(owner), value(member, "obfName", "obfuscatedName"),
                    value(member, "typeDesc", "descriptor")))
                {
                    problems.add("missing " + owner + "." + member.get("obfName") + " "
                        + member.get("typeDesc") + "   (" + member.get("name") + ")");
                }
            }
        }

        List<String> contradictions = contradictedNames(JarArchive.read(jar), root);
        for (String problem : problems)
        {
            System.out.println("  " + problem);
        }
        for (String contradiction : contradictions)
        {
            System.out.println("  " + contradiction);
        }
        System.out.println("verified " + (checked - problems.size()) + "/" + checked
            + " entries against " + jar);
        if (!contradictions.isEmpty())
        {
            System.out.println(contradictions.size()
                + " mapped class name(s) contradict the interface the class declares");
        }
        return problems.isEmpty() && contradictions.isEmpty() ? 0 : 1;
    }

    /**
     * Flags a mapped class name that the class itself contradicts.
     *
     * <p>A class declaring {@code net.runelite.api.Preferences} is Preferences, whatever a mapping
     * calls it - the injector cannot rename an interface. Fingerprint-based mapping generators land on
     * a plausible wrong class often enough that this is worth checking mechanically: it catches the
     * error at generation time instead of when something reads the field and gets nonsense.
     *
     * <p>Only names that collide with a declared interface are reported. A mapping is free to name a
     * class something the public API has no word for.
     */
    private static List<String> contradictedNames(JarArchive archive, Map<String, Object> root)
    {
        Map<String, List<String>> declared = ApiInterfaceExtractor.extract(archive);
        List<String> problems = new ArrayList<>();
        for (Object element : asList(root.get("classMappings")))
        {
            Map<String, Object> mapping = asObject(element);
            String name = value(mapping, "name", "name");
            String owner = value(mapping, "obfName", "obfuscatedName");
            List<String> actual = declared.get(owner);
            // An empty name is the canonical file's "not named yet", not a wrong name.
            if (name == null || name.isEmpty() || actual == null || actual.contains(name))
            {
                continue;
            }
            // The class declares an API interface and the mapping calls it something else. A class
            // that declares no interface is skipped above - a mapping may name that whatever it likes.
            problems.add("class " + owner + " is mapped as " + name
                + " but declares net.runelite.api." + String.join("/", actual));
        }
        return problems;
    }

    private static boolean hasMember(ClassNode node, String name, String desc)
    {
        boolean method = desc != null && desc.startsWith("(");
        if (method)
        {
            for (MethodNode candidate : node.methods)
            {
                if (candidate.name.equals(name) && candidate.desc.equals(desc))
                {
                    return true;
                }
            }
            return false;
        }
        for (FieldNode candidate : node.fields)
        {
            if (candidate.name.equals(name) && (desc == null || candidate.desc.equals(desc)))
            {
                return true;
            }
        }
        return false;
    }

    // ---- buffer-infra ---------------------------------------------------

    private static int bufferInfra(Map<String, String> options) throws IOException
    {
        JarArchive archive = JarArchive.read(required(options, "jar"));
        ClientPayloadExtractor.Result client = ClientPayloadExtractor.extract(archive);
        BufferInfraExtractor.Result infra = BufferInfraExtractor.extract(archive,
            client.getBufferClassName(), client.getBufferHierarchy(),
            client.getClientTable().getOwner());

        Map<String, String> out = new LinkedHashMap<>();
        out.put("buffer.class", client.getBufferClassName());
        out.put("buffer.hierarchy", String.join(",", new TreeSet<>(client.getBufferHierarchy())));
        out.put("buffer.arrayField", infra.getBufferArrayField());
        out.put("buffer.offsetField", infra.getBufferOffsetField());
        out.put("buffer.offsetMultiplier", infra.getOffsetMultiplier());
        out.put("buffer.indexMultiplier", infra.getIndexMultiplier());
        out.put("clientPacket.class", infra.getClientPacketClassName());
        out.put("packetBufferNode.class", infra.getPacketBufferNodeClassName());
        out.put("packetBufferNode.bufferField", infra.getPacketBufferFieldName());
        out.put("packetWriter.class", infra.getPacketWriterClassName());
        out.put("packetWriter.field", infra.getPacketWriterFieldName());
        out.put("packetWriter.isaacField", infra.getIsaacCipherFieldName());
        out.put("packetWriter.addNode", infra.getAddNodeMethodName());
        out.put("addNode.garbage", infra.getAddNodeGarbageValue());
        out.put("getPacketBufferNode.owner", infra.getClassContainingGetPacketBufferNodeName());
        out.put("getPacketBufferNode.garbage", infra.getGetPacketBufferNodeGarbageValue());
        for (Map.Entry<String, String> entry : out.entrySet())
        {
            System.out.println("  " + pad(entry.getKey()) + entry.getValue());
        }
        return 0;
    }

    // ---- semantic mappings --------------------------------------------

    private static int extractSemanticSeed(Map<String, String> options) throws IOException
    {
        Path mappedJar = resolveJar(required(options, "jar").toString());
        Path rawJar = resolveJar(required(options, "raw-jar").toString());
        Path output = required(options, "tsv");
        SemanticMap map = SemanticSeedExtractor.extract(mappedJar, rawJar, options.get("revision"),
            options.get("source-commit"));
        map.write(output);
        System.out.println("wrote " + map.entries().size() + " semantic entries to " + output);
        return 0;
    }

    private static int updateSemantic(Map<String, String> options) throws IOException
    {
        Path oldJar = resolveJar(required(options, "old-jar").toString());
        Path newJar = resolveJar(required(options, "new-jar").toString());
        Path output = required(options, "tsv");
        SemanticMap oldMap = SemanticMap.read(required(options, "old-map"));
        Map<String, SemanticOverrides.Override> overrides = options.containsKey("overrides")
            ? SemanticOverrides.read(required(options, "overrides")) : java.util.Collections.emptyMap();
        if (options.containsKey("anchors"))
        {
            SemanticMap anchors = SemanticMap.read(required(options, "anchors"));
            String expected = anchors.metadata().get("input.sha256");
            if (expected == null || !expected.equals(Hashing.sha256(newJar)))
            {
                throw new IOException("anchor map input.sha256 does not match " + newJar);
            }
            overrides = SemanticOverrides.addAnchors(oldMap, anchors, overrides);
        }
        SemanticUpdater.Result result = SemanticUpdater.update(oldJar, newJar, oldMap,
            options.get("revision"), overrides);
        System.out.println("matched " + result.classMatches + " class identities");
        if (result.map == null)
        {
            for (String failure : result.failures)
            {
                System.err.println("  " + failure);
            }
            System.err.println("refusing to publish a partial semantic map ("
                + result.failures.size() + " unresolved entries)");
            return 1;
        }
        result.map.write(output);
        System.out.println("wrote " + result.map.entries().size() + " semantic entries to " + output);
        return 0;
    }

    // ---- shared ---------------------------------------------------------

    /** Reads a key under either mapping schema: the version package's or the canonical file's. */
    private static String value(Map<String, Object> node, String primary, String alternate)
    {
        Object value = node.get(primary);
        if (value == null)
        {
            value = node.get(alternate);
        }
        return value == null ? null : String.valueOf(value);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> asObject(Object value)
    {
        return value instanceof Map ? (Map<String, Object>) value : new LinkedHashMap<>();
    }

    @SuppressWarnings("unchecked")
    private static List<Object> asList(Object value)
    {
        return value instanceof List ? (List<Object>) value : new ArrayList<>();
    }

    private static String read(Path path) throws IOException
    {
        return Files.readString(path);
    }

    /**
     * A jar argument is either a path to an existing file, or a bare RuneLite version like
     * {@code 1.12.35}. A version is downloaded once from the RuneLite maven repository into a local
     * cache and reused. The repository base can be overridden with {@code rlsuite.repo}.
     */
    static Path resolveJar(String value) throws IOException
    {
        Path asPath = Paths.get(value);
        if (Files.exists(asPath))
        {
            return asPath;
        }
        if (!value.matches("\\d+(\\.\\d+)+"))
        {
            throw new IOException("no such jar and not a version number: " + value);
        }
        String repo = System.getProperty("rlsuite.repo", "https://repo.runelite.net");
        Path cacheDir = Paths.get(System.getProperty("user.home"), ".cache", "rl-suite");
        Files.createDirectories(cacheDir);
        Path cached = cacheDir.resolve("injected-client-" + value + ".jar");
        if (!Files.exists(cached))
        {
            String url = repo + "/net/runelite/injected-client/" + value
                + "/injected-client-" + value + ".jar";
            System.out.println("fetching " + url);
            try (java.io.InputStream in = new java.net.URL(url).openStream())
            {
                Files.copy(in, cached, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
            catch (IOException e)
            {
                Files.deleteIfExists(cached);
                throw new IOException("could not download injected-client " + value
                    + " from " + url + " (" + e.getMessage() + ")", e);
            }
        }
        return cached;
    }

    private static Path required(Map<String, String> options, String name)
    {
        String value = options.get(name);
        if (value == null)
        {
            throw new IllegalArgumentException("Missing --" + name);
        }
        return Paths.get(value);
    }

    private static String pad(String key)
    {
        StringBuilder padded = new StringBuilder(key);
        while (padded.length() < 36)
        {
            padded.append(' ');
        }
        return padded.toString();
    }

    static Map<String, String> parse(String[] args)
    {
        Set<String> flags = Set.of("derive", "verify", "buffer-infra",
            "extract-semantic-seed", "update-semantic", "help");
        Map<String, String> options = new LinkedHashMap<>();
        for (int index = 0; index < args.length; index++)
        {
            if (!args[index].startsWith("--"))
            {
                throw new IllegalArgumentException("Expected --name, got: " + args[index]);
            }
            String name = args[index].substring(2);
            if (flags.contains(name))
            {
                options.put(name, "true");
            }
            else if (index + 1 < args.length)
            {
                options.put(name, args[++index]);
            }
            else
            {
                throw new IllegalArgumentException("Missing value for --" + name);
            }
        }
        return options;
    }

    private static void usage()
    {
        System.err.println("Usage:");
        System.err.println("  --derive --jar NEW [--control OLD --control-hooks OLD.json]");
        System.err.println("           [--json OUT.json --version VER]");
        System.err.println("      Re-derives the reflection hooks. With a control, every rule must");
        System.err.println("      first reproduce the known-good answers or nothing is printed.");
        System.err.println("      --jar and --control take a jar path or a bare version (1.12.35),");
        System.err.println("      which is downloaded from the RuneLite repo and cached. --json");
        System.err.println("      writes the derived hooks as a tool-neutral document.");
        System.err.println("  --verify --jar JAR --mappings MAPPINGS.json");
        System.err.println("      Checks every mapped class, field and method exists in the JAR");
        System.err.println("      with the declared descriptor. Exit 1 if any is missing.");
        System.err.println("  --buffer-infra --jar JAR");
        System.err.println("      Prints the packet buffer and writer infrastructure.");
        System.err.println("  --extract-semantic-seed --jar MAPPED --raw-jar RAW --tsv OUT");
        System.err.println("                            [--revision REV --source-commit HASH]");
        System.err.println("      Transcribes Devious-style mapping annotations and binds them to RAW.");
        System.err.println("  --update-semantic --old-jar OLD --new-jar NEW --old-map OLD.tsv");
        System.err.println("                    --tsv OUT [--revision REV --anchors TARGET.tsv]");
        System.err.println("                    [--overrides OVERRIDES.tsv]");
        System.err.println("      Propagates semantic names; publishes nothing on an ambiguous entry.");
    }
}
