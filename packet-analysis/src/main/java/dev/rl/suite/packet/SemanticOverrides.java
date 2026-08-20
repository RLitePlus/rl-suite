package dev.rl.suite.packet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Reviewed exceptions for symbols the structural updater deliberately refuses to guess. */
final class SemanticOverrides
{
    private SemanticOverrides()
    {
    }

    static Map<String, Override> read(Path path) throws IOException
    {
        Map<String, Override> overrides = new LinkedHashMap<>();
        int lineNumber = 0;
        for (String raw : Files.readAllLines(path))
        {
            lineNumber++;
            String line = raw.trim();
            if (line.isEmpty() || line.startsWith("#"))
            {
                continue;
            }
            String[] column = raw.split("\t", -1);
            if (column.length != 8)
            {
                throw new IOException(path + ":" + lineNumber
                    + ": expected 8 tab-separated columns");
            }
            SemanticMap.Entry source;
            try
            {
                source = new SemanticMap.Entry(column[0], column[1], column[2], column[3], "override");
            }
            catch (IllegalArgumentException e)
            {
                throw new IOException(path + ":" + lineNumber + ": " + e.getMessage(), e);
            }
            boolean drop = column[4].equals("drop");
            if (!(drop || column[4].equals("map")))
            {
                throw new IOException(path + ":" + lineNumber + ": action must be map or drop");
            }
            if (drop != (column[5].equals("-") && column[6].equals("-") && column[7].equals("-")))
            {
                throw new IOException(path + ":" + lineNumber
                    + ": drop requires '-', map requires a complete target identity");
            }
            Override value = new Override(drop, column[5], column[6], column[7]);
            if (overrides.put(source.key(), value) != null)
            {
                throw new IOException(path + ":" + lineNumber + ": duplicate override " + source.key());
            }
        }
        return overrides;
    }

    static Map<String, Override> addAnchors(SemanticMap oldMap, SemanticMap anchors,
                                             Map<String, Override> explicit) throws IOException
    {
        Map<String, List<SemanticMap.Entry>> oldBySemantic = bySemantic(oldMap);
        Map<String, List<SemanticMap.Entry>> anchorBySemantic = bySemantic(anchors);
        Map<String, Override> result = new LinkedHashMap<>(explicit);
        for (Map.Entry<String, List<SemanticMap.Entry>> candidate : anchorBySemantic.entrySet())
        {
            List<SemanticMap.Entry> old = oldBySemantic.get(candidate.getKey());
            if (old == null)
            {
                continue;
            }
            if (candidate.getValue().size() != 1 || old.size() != 1)
            {
                if (candidate.getValue().size() != old.size())
                {
                    throw new IOException("asymmetric anchor ambiguity " + candidate.getKey());
                }
                continue;
            }
            SemanticMap.Entry source = old.get(0);
            SemanticMap.Entry target = candidate.getValue().get(0);
            Override anchor = new Override(false, target.owner, target.name, target.descriptor);
            Override existing = result.get(source.key());
            if (existing != null && !sameTarget(existing, anchor))
            {
                throw new IOException("anchor conflicts with explicit override for " + source.key());
            }
            result.putIfAbsent(source.key(), anchor);
        }
        return result;
    }

    private static Map<String, List<SemanticMap.Entry>> bySemantic(SemanticMap map)
    {
        Map<String, String> classSemantics = new LinkedHashMap<>();
        for (SemanticMap.Entry entry : map.entries())
        {
            if (entry.kind.equals("class"))
            {
                classSemantics.put(entry.owner, entry.semantic);
            }
        }
        Map<String, List<SemanticMap.Entry>> entries = new LinkedHashMap<>();
        for (SemanticMap.Entry entry : map.entries())
        {
            String owner = entry.kind.equals("class") ? ""
                : classSemantics.getOrDefault(entry.owner, "@" + entry.owner) + "\t";
            entries.computeIfAbsent(entry.kind + "\t" + owner + entry.semantic,
                ignored -> new ArrayList<>()).add(entry);
        }
        return entries;
    }

    private static boolean sameTarget(Override left, Override right)
    {
        return left.drop == right.drop && left.owner.equals(right.owner)
            && left.name.equals(right.name) && left.descriptor.equals(right.descriptor);
    }

    static final class Override
    {
        final boolean drop;
        final String owner;
        final String name;
        final String descriptor;

        Override(boolean drop, String owner, String name, String descriptor)
        {
            this.drop = drop;
            this.owner = owner;
            this.name = name;
            this.descriptor = descriptor;
        }
    }
}
