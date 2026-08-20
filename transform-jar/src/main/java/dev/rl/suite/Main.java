package dev.rl.suite;

import dev.rl.suite.packet.PacketProfileMode;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class Main
{
    private static final Set<String> VALUE_OPTIONS = Set.of(
            "input",
            "output",
            "report",
            "expected-malformed-named",
            "expected-packet-handlers",
            "expected-packet-ranges",
            "expected-condy-sites",
            "packet-profile",
            "semantic-map",
            "source-output");

    private Main()
    {
    }

    public static void main(String[] args) throws Exception
    {
        Map<String, String> options = parse(args);
        if (options.containsKey("help"))
        {
            usage();
            return;
        }

        if (options.containsKey("decompile"))
        {
            if (!options.keySet().containsAll(Set.of("input", "source-output")))
            {
                usage();
                System.exit(2);
                return;
            }
            rejectUnexpectedOptions(options, Set.of("decompile", "input", "source-output"));
            new SourceDecompiler().decompile(Paths.get(options.get("input")),
                Paths.get(options.get("source-output")));
            return;
        }

        if (!options.keySet().containsAll(Set.of("input", "output")))
        {
            usage();
            System.exit(2);
            return;
        }
        rejectUnexpectedOptions(options, Set.of("input", "output", "report",
            "expected-malformed-named", "expected-packet-handlers",
            "expected-packet-ranges", "expected-condy-sites", "packet-profile",
            "semantic-map"));

        Path input = Paths.get(options.get("input"));
        Path output = Paths.get(options.get("output"));
        Path report = options.containsKey("report")
            ? Paths.get(options.get("report"))
            : Paths.get(output.toString() + ".audit.json");

        TransformConfig.Builder builder = TransformConfig.builder()
            .input(input)
            .output(output)
            .report(report);
        if (options.containsKey("expected-malformed-named"))
        {
            builder.expectedMalformedNamed(Long.parseLong(options.get("expected-malformed-named")));
        }
        if (options.containsKey("expected-packet-handlers"))
        {
            builder.expectedPacketHandlers(Long.parseLong(options.get("expected-packet-handlers")));
        }
        if (options.containsKey("expected-packet-ranges"))
        {
            builder.expectedPacketRanges(Long.parseLong(options.get("expected-packet-ranges")));
        }
        if (options.containsKey("expected-condy-sites"))
        {
            builder.expectedCondySites(Long.parseLong(options.get("expected-condy-sites")));
        }
        if (options.containsKey("packet-profile"))
        {
            builder.packetProfileMode(PacketProfileMode.parse(options.get("packet-profile")));
        }
        if (options.containsKey("semantic-map"))
        {
            builder.semanticMap(Paths.get(options.get("semantic-map")));
        }

        new Deobfuscator().run(builder.build());
    }

    static Map<String, String> parse(String[] args)
    {
        Map<String, String> options = new LinkedHashMap<>();
        for (int index = 0; index < args.length; index++)
        {
            String argument = args[index];
            if ("--help".equals(argument) || "-h".equals(argument))
            {
                options.put("help", "true");
                continue;
            }
            if ("--decompile".equals(argument))
            {
                options.put("decompile", "true");
                continue;
            }
            if (!argument.startsWith("--") || index + 1 >= args.length)
            {
                throw new IllegalArgumentException("Expected --name value, got: " + argument);
            }
            String name = argument.substring(2);
            if (!VALUE_OPTIONS.contains(name))
            {
                throw new IllegalArgumentException("Unknown option: --" + name);
            }
            if (options.put(name, args[++index]) != null)
            {
                throw new IllegalArgumentException("Duplicate option: --" + name);
            }
        }
        return options;
    }

    private static void rejectUnexpectedOptions(Map<String, String> options,
        Set<String> allowed)
    {
        for (String name : options.keySet())
        {
            if (!allowed.contains(name))
            {
                throw new IllegalArgumentException("Option --" + name
                    + " is not valid in this mode");
            }
        }
    }

    private static void usage()
    {
        System.err.println("Usage: java -jar rl-suite-all.jar --input client.jar --output normalized.jar");
        System.err.println("       [--report audit.json] [--expected-malformed-named count]");
        System.err.println("       [--expected-packet-handlers count]");
        System.err.println("       [--expected-packet-ranges count]");
        System.err.println("       [--expected-condy-sites count]");
        System.err.println("       [--packet-profile osrs-235|osrs-236|osrs-237|osrs-238|osrs-239|osrs-240|");
        System.err.println("                         renamed-client-1.12.31.1|none]");
        System.err.println("       [--semantic-map semantic-map.tsv]");
        System.err.println("Omitting --packet-profile auto-selects osrs-239 only for checksum-pinned inputs.");
        System.err.println("       java -jar rl-suite-all.jar --decompile --input normalized.jar");
        System.err.println("                         --source-output sources");
    }
}
