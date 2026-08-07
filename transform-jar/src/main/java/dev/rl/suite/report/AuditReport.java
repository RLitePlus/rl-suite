package dev.rl.suite.report;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/** Minimal deterministic JSON report without adding a serialization dependency. */
public final class AuditReport
{
    private final Map<String, String> metadata = new TreeMap<>();
    private final Map<String, Long> metrics = new TreeMap<>();
    private final List<String> completedPasses = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();

    public void putMetadata(String key, String value)
    {
        metadata.put(key, value);
    }

    public void putMetric(String key, long value)
    {
        metrics.put(key, value);
    }

    public long getMetric(String key)
    {
        Long value = metrics.get(key);
        if (value == null)
        {
            throw new IllegalArgumentException("Unknown metric: " + key);
        }
        return value;
    }

    public void passCompleted(String name)
    {
        completedPasses.add(name);
    }

    public void warning(String warning)
    {
        warnings.add(warning);
    }

    public void write(Path path) throws IOException
    {
        Path parent = path.toAbsolutePath().getParent();
        if (parent != null)
        {
            Files.createDirectories(parent);
        }
        Path temporary = Files.createTempFile(parent, "." + path.getFileName(), ".tmp");
        try
        {
            Files.write(temporary, toJson().getBytes(StandardCharsets.UTF_8));
            try
            {
                Files.move(temporary, path.toAbsolutePath(),
                    StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            }
            catch (AtomicMoveNotSupportedException ex)
            {
                Files.move(temporary, path.toAbsolutePath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        finally
        {
            Files.deleteIfExists(temporary);
        }
    }

    public String toJson()
    {
        StringBuilder out = new StringBuilder();
        out.append("{\n");
        appendStringMap(out, "metadata", metadata, 2);
        out.append(",\n");
        appendNumberMap(out, "metrics", metrics, 2);
        out.append(",\n");
        appendStringList(out, "completedPasses", completedPasses, 2);
        out.append(",\n");
        appendStringList(out, "warnings", warnings, 2);
        out.append("\n}\n");
        return out.toString();
    }

    private static void appendStringMap(StringBuilder out, String name, Map<String, String> values, int indent)
    {
        indent(out, indent).append('"').append(escape(name)).append("\": {");
        boolean first = true;
        for (Map.Entry<String, String> entry : values.entrySet())
        {
            if (first)
            {
                first = false;
            }
            else
            {
                out.append(',');
            }
            out.append('\n');
            indent(out, indent + 2).append('"').append(escape(entry.getKey())).append("\": \"")
                .append(escape(entry.getValue())).append('"');
        }
        if (!values.isEmpty())
        {
            out.append('\n');
            indent(out, indent);
        }
        out.append('}');
    }

    private static void appendNumberMap(StringBuilder out, String name, Map<String, Long> values, int indent)
    {
        indent(out, indent).append('"').append(escape(name)).append("\": {");
        boolean first = true;
        for (Map.Entry<String, Long> entry : values.entrySet())
        {
            if (first)
            {
                first = false;
            }
            else
            {
                out.append(',');
            }
            out.append('\n');
            indent(out, indent + 2).append('"').append(escape(entry.getKey())).append("\": ")
                .append(entry.getValue());
        }
        if (!values.isEmpty())
        {
            out.append('\n');
            indent(out, indent);
        }
        out.append('}');
    }

    private static void appendStringList(StringBuilder out, String name, List<String> values, int indent)
    {
        indent(out, indent).append('"').append(escape(name)).append("\": [");
        for (int i = 0; i < values.size(); i++)
        {
            if (i > 0)
            {
                out.append(',');
            }
            out.append('\n');
            indent(out, indent + 2).append('"').append(escape(values.get(i))).append('"');
        }
        if (!values.isEmpty())
        {
            out.append('\n');
            indent(out, indent);
        }
        out.append(']');
    }

    private static StringBuilder indent(StringBuilder out, int count)
    {
        for (int i = 0; i < count; i++)
        {
            out.append(' ');
        }
        return out;
    }

    private static String escape(String value)
    {
        StringBuilder out = new StringBuilder(value.length() + 16);
        for (int i = 0; i < value.length(); i++)
        {
            char character = value.charAt(i);
            switch (character)
            {
                case '\\': out.append("\\\\"); break;
                case '"': out.append("\\\""); break;
                case '\n': out.append("\\n"); break;
                case '\r': out.append("\\r"); break;
                case '\t': out.append("\\t"); break;
                default:
                    if (character < 0x20)
                    {
                        out.append(String.format("\\u%04x", (int) character));
                    }
                    else
                    {
                        out.append(character);
                    }
            }
        }
        return out.toString();
    }
}
