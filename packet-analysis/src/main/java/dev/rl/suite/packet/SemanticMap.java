package dev.rl.suite.packet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** The deliberately small, tool-neutral semantic-name interchange format. */
final class SemanticMap
{
    static final String FORMAT = "rl-suite-semantic-map-v1";

    private final Map<String, String> metadata;
    private final List<Entry> entries;

    SemanticMap(Map<String, String> metadata, List<Entry> entries)
    {
        this.metadata = Collections.unmodifiableMap(new LinkedHashMap<>(metadata));
        List<Entry> sorted = new ArrayList<>(entries);
        sorted.sort(Comparator.comparing(Entry::key));
        Map<String, Entry> unique = new LinkedHashMap<>();
        Map<String, Entry> semantic = new LinkedHashMap<>();
        for (Entry entry : sorted)
        {
            Entry previous = unique.put(entry.key(), entry);
            if (previous != null)
            {
                throw new IllegalArgumentException("duplicate semantic entry: " + entry.key());
            }
            String semanticKey = entry.kind.equals("class")
                ? "class\t" + entry.semantic
                : entry.kind + "\t" + entry.owner + "\t" + entry.semantic
                    + (entry.kind.equals("method") ? "\t" + entry.descriptor : "");
            Entry collision = semantic.put(semanticKey, entry);
            if (collision != null && !collision.equals(entry))
            {
                throw new IllegalArgumentException("semantic name collision: " + entry.semantic
                    + " in " + entry.owner);
            }
        }
        this.entries = Collections.unmodifiableList(new ArrayList<>(unique.values()));
    }

    Map<String, String> metadata()
    {
        return metadata;
    }

    List<Entry> entries()
    {
        return entries;
    }

    static SemanticMap read(Path path) throws IOException
    {
        Map<String, String> metadata = new LinkedHashMap<>();
        List<Entry> entries = new ArrayList<>();
        int lineNumber = 0;
        for (String raw : Files.readAllLines(path, StandardCharsets.UTF_8))
        {
            lineNumber++;
            String line = raw.trim();
            if (line.isEmpty())
            {
                continue;
            }
            if (line.startsWith("#"))
            {
                int equals = line.indexOf('=');
                if (equals > 1)
                {
                    metadata.put(line.substring(1, equals).trim(), line.substring(equals + 1).trim());
                }
                continue;
            }
            String[] columns = raw.split("\t", -1);
            if (columns.length != 5)
            {
                throw new IOException(path + ":" + lineNumber + ": expected 5 tab-separated columns");
            }
            try
            {
                entries.add(new Entry(columns[0], columns[1], columns[2], columns[3], columns[4]));
            }
            catch (IllegalArgumentException e)
            {
                throw new IOException(path + ":" + lineNumber + ": " + e.getMessage(), e);
            }
        }
        if (!FORMAT.equals(metadata.get("format")))
        {
            throw new IOException(path + ": missing or unsupported # format=" + metadata.get("format"));
        }
        try
        {
            return new SemanticMap(metadata, entries);
        }
        catch (IllegalArgumentException e)
        {
            throw new IOException(path + ": " + e.getMessage(), e);
        }
    }

    void write(Path path) throws IOException
    {
        Path absolute = path.toAbsolutePath();
        Path parent = absolute.getParent();
        Files.createDirectories(parent);
        StringBuilder text = new StringBuilder();
        appendMetadata(text, "format");
        appendMetadata(text, "revision");
        appendMetadata(text, "input.sha256");
        appendMetadata(text, "parent.sha256");
        appendMetadata(text, "source");
        for (Map.Entry<String, String> entry : metadata.entrySet())
        {
            if (!text.toString().contains("# " + entry.getKey() + "="))
            {
                text.append("# ").append(entry.getKey()).append('=').append(entry.getValue()).append('\n');
            }
        }
        for (Entry entry : entries)
        {
            text.append(entry.kind).append('\t').append(entry.owner).append('\t')
                .append(entry.name).append('\t').append(entry.descriptor).append('\t')
                .append(entry.semantic).append('\n');
        }
        Path temporary = Files.createTempFile(parent, "." + absolute.getFileName(), ".tmp");
        try
        {
            Files.writeString(temporary, text, StandardCharsets.UTF_8);
            try
            {
                Files.move(temporary, absolute, StandardCopyOption.ATOMIC_MOVE,
                    StandardCopyOption.REPLACE_EXISTING);
            }
            catch (AtomicMoveNotSupportedException e)
            {
                Files.move(temporary, absolute, StandardCopyOption.REPLACE_EXISTING);
            }
        }
        finally
        {
            Files.deleteIfExists(temporary);
        }
    }

    private void appendMetadata(StringBuilder text, String key)
    {
        String value = metadata.get(key);
        if (value != null && !value.isEmpty())
        {
            text.append("# ").append(key).append('=').append(value).append('\n');
        }
    }

    static final class Entry
    {
        final String kind;
        final String owner;
        final String name;
        final String descriptor;
        final String semantic;

        Entry(String kind, String owner, String name, String descriptor, String semantic)
        {
            if (!(kind.equals("class") || kind.equals("field") || kind.equals("method")))
            {
                throw new IllegalArgumentException("unknown kind " + kind);
            }
            requireToken(owner, "owner");
            requireToken(semantic, "semantic");
            if (kind.equals("class"))
            {
                if (!name.equals("-") || !descriptor.equals("-"))
                {
                    throw new IllegalArgumentException("class rows require '-' name and descriptor");
                }
            }
            else
            {
                requireToken(name, "name");
                requireToken(descriptor, "descriptor");
                if (kind.equals("method") != descriptor.startsWith("("))
                {
                    throw new IllegalArgumentException(kind + " has incompatible descriptor " + descriptor);
                }
            }
            this.kind = kind;
            this.owner = owner;
            this.name = name;
            this.descriptor = descriptor;
            this.semantic = semantic;
        }

        String key()
        {
            return kind + "\t" + owner + "\t" + name + "\t" + descriptor;
        }

        private static void requireToken(String value, String label)
        {
            if (value == null || value.isEmpty() || value.indexOf('\t') >= 0
                || value.indexOf('\n') >= 0 || value.indexOf('\r') >= 0)
            {
                throw new IllegalArgumentException("invalid " + label);
            }
        }

        @Override
        public boolean equals(Object other)
        {
            return other instanceof Entry && key().equals(((Entry) other).key())
                && semantic.equals(((Entry) other).semantic);
        }

        @Override
        public int hashCode()
        {
            return 31 * key().hashCode() + semantic.hashCode();
        }
    }
}
