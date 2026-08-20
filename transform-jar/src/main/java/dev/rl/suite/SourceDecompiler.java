package dev.rl.suite;

import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;
import org.jetbrains.java.decompiler.main.Fernflower;
import org.jetbrains.java.decompiler.main.decompiler.DirectoryResultSaver;
import org.jetbrains.java.decompiler.main.decompiler.PrintStreamLogger;
import org.jetbrains.java.decompiler.main.extern.IFernflowerPreferences;
import org.jetbrains.java.decompiler.util.JrtFinder;

final class SourceDecompiler
{
    void decompile(Path inputPath, Path outputPath) throws IOException
    {
        Path input = inputPath.toAbsolutePath().normalize();
        Path output = outputPath.toAbsolutePath().normalize();
        if (!Files.isRegularFile(input))
        {
            throw new IOException("Decompiler input is not a regular file: " + input);
        }
        if (Files.exists(output, LinkOption.NOFOLLOW_LINKS)
            && (!Files.isDirectory(output, LinkOption.NOFOLLOW_LINKS)
                || Files.isSymbolicLink(output)))
        {
            throw new IOException("Source destination is not a directory: " + output);
        }

        Path parent = output.getParent();
        if (parent == null)
        {
            throw new IOException("Source destination has no parent: " + output);
        }
        Files.createDirectories(parent);
        Path staged = Files.createTempDirectory(parent, "." + output.getFileName() + ".stage-");
        try
        {
            runVineflower(input, staged);
            try (Stream<Path> files = Files.walk(staged))
            {
                if (files.noneMatch(path -> path.toString().endsWith(".java")))
                {
                    throw new IOException("Vineflower produced no Java sources for " + input);
                }
            }
            replaceDirectory(staged, output);
            staged = null;
        }
        finally
        {
            deleteTree(staged);
        }
    }

    private static void runVineflower(Path input, Path staged) throws IOException
    {
        PrintStreamLogger logger = new PrintStreamLogger(System.err);
        Fernflower decompiler = new Fernflower(new DirectoryResultSaver(staged.toFile()),
            Map.of(
                IFernflowerPreferences.INCLUDE_JAVA_RUNTIME, JrtFinder.CURRENT,
                IFernflowerPreferences.LOG_LEVEL, "WARN"),
            logger);
        try
        {
            decompiler.addSource(input.toFile());
            decompiler.decompileContext();
        }
        catch (RuntimeException failure)
        {
            throw new IOException("Vineflower failed to decompile " + input, failure);
        }
        finally
        {
            decompiler.clearContext();
        }
    }

    private static void replaceDirectory(Path staged, Path output) throws IOException
    {
        Path backup = null;
        try
        {
            if (Files.exists(output, LinkOption.NOFOLLOW_LINKS))
            {
                backup = Files.createTempDirectory(output.getParent(),
                    "." + output.getFileName() + ".backup-");
                Files.delete(backup);
                move(output, backup);
            }
            move(staged, output);
            try
            {
                deleteTree(backup);
            }
            catch (IOException ignored)
            {
                // The new output is committed; a retained backup is safer than reporting failure.
            }
        }
        catch (IOException | RuntimeException failure)
        {
            if (backup != null && Files.exists(backup, LinkOption.NOFOLLOW_LINKS)
                && !Files.exists(output, LinkOption.NOFOLLOW_LINKS))
            {
                try
                {
                    move(backup, output);
                }
                catch (IOException rollbackFailure)
                {
                    failure.addSuppressed(rollbackFailure);
                }
            }
            throw failure;
        }
    }

    private static void move(Path source, Path target) throws IOException
    {
        try
        {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        }
        catch (AtomicMoveNotSupportedException failure)
        {
            Files.move(source, target);
        }
    }

    private static void deleteTree(Path root) throws IOException
    {
        if (root == null || !Files.exists(root, LinkOption.NOFOLLOW_LINKS))
        {
            return;
        }
        try (Stream<Path> paths = Files.walk(root))
        {
            for (Path path : paths.sorted(Comparator.reverseOrder()).toList())
            {
                Files.deleteIfExists(path);
            }
        }
    }
}
