package dev.rl.suite.model;

import dev.rl.suite.TransformException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

/** In-memory representation that retains original class bytes for delta auditing. */
public final class JarArchive
{
    private final List<ClassUnit> classes;
    private final Map<String, byte[]> resources;

    private JarArchive(List<ClassUnit> classes, Map<String, byte[]> resources)
    {
        this.classes = classes;
        this.resources = resources;
    }

    public static JarArchive read(Path path) throws IOException
    {
        List<ClassUnit> classes = new ArrayList<>();
        Map<String, byte[]> resources = new LinkedHashMap<>();
        Set<String> seen = new TreeSet<>();

        try (ZipFile zip = new ZipFile(path.toFile()))
        {
            List<? extends ZipEntry> entries = Collections.list(zip.entries());
            entries.sort(Comparator.comparing(ZipEntry::getName));

            for (ZipEntry entry : entries)
            {
                if (entry.isDirectory())
                {
                    continue;
                }
                if (!seen.add(entry.getName()))
                {
                    throw new TransformException("Duplicate JAR entry: " + entry.getName());
                }

                byte[] bytes;
                try (InputStream input = zip.getInputStream(entry))
                {
                    bytes = readAllBytes(input);
                }

                if (entry.getName().endsWith(".class"))
                {
                    ClassNode node = new ClassNode();
                    new ClassReader(bytes).accept(node, 0);
                    classes.add(new ClassUnit(node));
                }
                else
                {
                    resources.put(entry.getName(), bytes);
                }
            }
        }

        classes.sort(Comparator.comparing(ClassUnit::getOriginalClassName));
        return new JarArchive(classes, resources);
    }

    private static byte[] readAllBytes(InputStream input) throws IOException
    {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[64 * 1024];
        int read;
        while ((read = input.read(buffer)) >= 0)
        {
            output.write(buffer, 0, read);
        }
        return output.toByteArray();
    }

    public List<ClassUnit> getClasses()
    {
        return Collections.unmodifiableList(classes);
    }

    public Map<String, byte[]> getResources()
    {
        return Collections.unmodifiableMap(resources);
    }

    /**
     * Atomically swaps a complete set of staged class trees and a selected set
     * of existing resources. All class identities, resource names, values, and
     * output collisions are validated before any live archive state changes.
     */
    public void replaceClassNodesAndResources(Map<ClassUnit, ClassNode> replacements,
                                               Map<String, byte[]> resourceReplacements)
    {
        if (replacements == null || resourceReplacements == null)
        {
            throw new NullPointerException("replacements");
        }
        if (replacements.size() != classes.size())
        {
            throw new TransformException("Expected " + classes.size()
                + " staged class replacements, found " + replacements.size());
        }

        Set<ClassUnit> expected = Collections.newSetFromMap(new IdentityHashMap<>());
        expected.addAll(classes);
        Set<ClassUnit> actual = Collections.newSetFromMap(new IdentityHashMap<>());
        actual.addAll(replacements.keySet());
        if (!actual.equals(expected))
        {
            throw new TransformException("Staged class replacement keys do not match the archive");
        }

        Map<String, byte[]> stagedResources = new LinkedHashMap<>();
        for (Map.Entry<String, byte[]> entry : resourceReplacements.entrySet())
        {
            String name = entry.getKey();
            byte[] bytes = entry.getValue();
            if (name == null || bytes == null)
            {
                throw new TransformException("Staged resource replacement contains a null name or value");
            }
            if (!resources.containsKey(name))
            {
                throw new TransformException("Staged resource does not exist in the archive: " + name);
            }
            stagedResources.put(name, bytes.clone());
        }

        Set<String> outputNames = new TreeSet<>(resources.keySet());
        for (ClassUnit unit : classes)
        {
            ClassNode replacement = replacements.get(unit);
            if (replacement == null || replacement.name == null || replacement.name.isEmpty())
            {
                throw new TransformException("Missing or unnamed staged replacement for "
                    + unit.getOriginalClassName());
            }
            String entryName = replacement.name + ".class";
            if (!outputNames.add(entryName))
            {
                throw new TransformException("Staged output entry collision: " + entryName);
            }
        }

        for (ClassUnit unit : classes)
        {
            unit.replaceNode(replacements.get(unit));
        }
        resources.putAll(stagedResources);
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
            writeStaged(temporary);
            moveAtomically(temporary, path.toAbsolutePath());
        }
        finally
        {
            Files.deleteIfExists(temporary);
        }
    }

    /**
     * Serializes this archive directly to an unpublished staging path.
     * The caller owns publication and cleanup of that path.
     */
    public void writeStaged(Path path) throws IOException
    {
        Map<String, byte[]> outputEntries = new LinkedHashMap<>(resources);
        for (ClassUnit unit : classes)
        {
            ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            unit.getNode().accept(writer);
            String outputName = unit.getNode().name + ".class";
            if (outputEntries.put(outputName, writer.toByteArray()) != null)
            {
                throw new TransformException("Output entry collision: " + outputName);
            }
        }

        List<String> names = new ArrayList<>(outputEntries.keySet());
        Collections.sort(names);
        try (JarOutputStream output = new JarOutputStream(Files.newOutputStream(path)))
        {
            for (String name : names)
            {
                JarEntry entry = new JarEntry(name);
                entry.setTime(0L);
                output.putNextEntry(entry);
                output.write(outputEntries.get(name));
                output.closeEntry();
            }
        }
    }

    private static void moveAtomically(Path source, Path target) throws IOException
    {
        try
        {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (AtomicMoveNotSupportedException ex)
        {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
