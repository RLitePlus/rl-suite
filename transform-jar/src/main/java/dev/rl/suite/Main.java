package dev.rl.suite;

import dev.rl.suite.packet.PacketProfileMode;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class Main
{
    private static final Set<String> VALUE_OPTIONS = Collections.unmodifiableSet(
        new HashSet<>(Arrays.asList(
            "input",
            "output",
            "report",
            "expected-malformed-named",
            "expected-packet-handlers",
            "expected-packet-ranges",
            "expected-condy-sites",
            "packet-profile")));

    private Main()
    {
    }

    public static void main(String[] args) throws Exception
    {
        Map<String, String> options = parse(args);
        if (options.containsKey("help") || !options.containsKey("input") || !options.containsKey("output"))
        {
            usage();
            if (!options.containsKey("help"))
            {
                System.exit(2);
            }
            return;
        }

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

    private static void usage()
    {
        System.err.println("Usage: java -jar rl-suite-all.jar --input client.jar --output normalized.jar");
        System.err.println("       [--report audit.json] [--expected-malformed-named count]");
        System.err.println("       [--expected-packet-handlers count]");
        System.err.println("       [--expected-packet-ranges count]");
        System.err.println("       [--expected-condy-sites count]");
        System.err.println("       [--packet-profile osrs-235|osrs-236|osrs-237|osrs-238|osrs-239|osrs-240|");
        System.err.println("                         renamed-client-1.12.31.1|none]");
        System.err.println("Omitting --packet-profile auto-selects osrs-239 only for checksum-pinned inputs.");
    }
}
