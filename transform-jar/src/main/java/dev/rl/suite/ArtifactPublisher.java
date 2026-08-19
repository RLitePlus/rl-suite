package dev.rl.suite;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.report.AuditReport;
import dev.rl.suite.util.AuditPath;
import dev.rl.suite.util.Hashing;
import dev.rl.suite.verify.ArchiveVerifier;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Publishes the output JAR and its audit report as one best-effort transaction.
 * Both artifacts are destination-locally staged and verified before the first
 * destination is changed. Two independent paths cannot be committed atomically;
 * ordinary commit failures are rolled back from destination-local snapshots.
 */
final class ArtifactPublisher
{
    void publish(JarArchive archive, AuditReport report, Path outputPath,
        Path reportPath) throws IOException
    {
        Path output = outputPath.toAbsolutePath().normalize();
        Path audit = reportPath.toAbsolutePath().normalize();
        validateDestination(output);
        validateDestination(audit);

        Path stagedOutput = null;
        Path stagedReport = null;
        DestinationSnapshot outputSnapshot = null;
        DestinationSnapshot reportSnapshot = null;
        Throwable publicationFailure = null;
        try
        {
            stagedOutput = createTemporarySibling(output, ".stage");
            archive.writeStaged(stagedOutput);
            force(stagedOutput);
            verifyStagedArchive(archive, stagedOutput);

            report.putMetadata("output.path", AuditPath.forReport(output));
            report.putMetadata("output.sha256", Hashing.sha256(stagedOutput));
            byte[] reportBytes = report.toJson().getBytes(StandardCharsets.UTF_8);

            stagedReport = createTemporarySibling(audit, ".stage");
            Files.write(stagedReport, reportBytes);
            force(stagedReport);
            if (!Arrays.equals(reportBytes, Files.readAllBytes(stagedReport)))
            {
                throw new IOException("Staged audit report failed read-back verification: "
                    + stagedReport);
            }

            // Snapshot both old destinations only after both new artifacts have
            // passed staging. A snapshot failure therefore cannot publish either.
            outputSnapshot = DestinationSnapshot.capture(output);
            reportSnapshot = DestinationSnapshot.capture(audit);

            commitWithRollback(stagedOutput, output, outputSnapshot,
                stagedReport, audit, reportSnapshot);
        }
        catch (IOException | RuntimeException | Error failure)
        {
            publicationFailure = failure;
            throw failure;
        }
        finally
        {
            IOException cleanupFailure = cleanup(stagedOutput, stagedReport,
                outputSnapshot, reportSnapshot);
            if (cleanupFailure != null)
            {
                if (publicationFailure != null)
                {
                    publicationFailure.addSuppressed(cleanupFailure);
                }
                else
                {
                    throw cleanupFailure;
                }
            }
        }
    }

    private void commitWithRollback(Path stagedOutput, Path output,
        DestinationSnapshot outputSnapshot, Path stagedReport, Path audit,
        DestinationSnapshot reportSnapshot) throws IOException
    {
        boolean outputAttempted = false;
        boolean reportAttempted = false;
        try
        {
            // Output first is intentional. It avoids ever exposing a report that
            // claims a hash for an output that has not yet been installed.
            outputAttempted = true;
            moveReplace(stagedOutput, output);
            reportAttempted = true;
            moveReplace(stagedReport, audit);
        }
        catch (IOException | RuntimeException | Error failure)
        {
            IOException rollbackFailure = null;
            if (reportAttempted)
            {
                rollbackFailure = restore(reportSnapshot, rollbackFailure);
            }
            if (outputAttempted)
            {
                rollbackFailure = restore(outputSnapshot, rollbackFailure);
            }
            if (rollbackFailure != null)
            {
                failure.addSuppressed(rollbackFailure);
            }
            throw failure;
        }
    }

    private static IOException restore(DestinationSnapshot snapshot,
        IOException accumulated)
    {
        try
        {
            snapshot.restore();
        }
        catch (IOException failure)
        {
            if (accumulated == null)
            {
                return failure;
            }
            accumulated.addSuppressed(failure);
        }
        return accumulated;
    }

    private static void verifyStagedArchive(JarArchive expected, Path staged)
        throws IOException
    {
        JarArchive actual = JarArchive.read(staged);
        if (actual.getClasses().size() != expected.getClasses().size())
        {
            throw new IOException("Staged JAR class count changed: expected "
                + expected.getClasses().size() + ", found " + actual.getClasses().size());
        }

        Set<String> expectedClasses = new LinkedHashSet<>();
        for (ClassUnit unit : expected.getClasses())
        {
            expectedClasses.add(unit.getNode().name);
        }
        Set<String> actualClasses = new LinkedHashSet<>();
        for (ClassUnit unit : actual.getClasses())
        {
            actualClasses.add(unit.getNode().name);
        }
        if (!actualClasses.equals(expectedClasses))
        {
            throw new IOException("Staged JAR class names differ from the verified archive");
        }

        if (actual.getResources().size() != expected.getResources().size())
        {
            throw new IOException("Staged JAR resource count changed: expected "
                + expected.getResources().size() + ", found " + actual.getResources().size());
        }
        for (Map.Entry<String, byte[]> entry : expected.getResources().entrySet())
        {
            if (!Arrays.equals(entry.getValue(), actual.getResources().get(entry.getKey())))
            {
                throw new IOException("Staged JAR resource changed: " + entry.getKey());
            }
        }

        new ArchiveVerifier().verifyOrThrow(actual);
    }

    private static Path createTemporarySibling(Path destination, String suffix)
        throws IOException
    {
        Path parent = destination.getParent();
        if (parent == null)
        {
            throw new IOException("Destination has no parent directory: " + destination);
        }
        Files.createDirectories(parent);
        return Files.createTempFile(parent, temporaryPrefix(destination), suffix);
    }

    private static String temporaryPrefix(Path destination)
    {
        Path fileName = destination.getFileName();
        String name = fileName == null ? "artifact" : fileName.toString();
        return "." + name + ".";
    }

    private static void validateDestination(Path destination) throws IOException
    {
        if (!Files.exists(destination, LinkOption.NOFOLLOW_LINKS))
        {
            return;
        }
        BasicFileAttributes attributes = Files.readAttributes(destination,
            BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        if (!attributes.isRegularFile() && !attributes.isSymbolicLink())
        {
            throw new IOException("Artifact destination is not a regular file or symbolic link: "
                + destination);
        }
    }

    private static void force(Path path) throws IOException
    {
        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.WRITE))
        {
            channel.force(true);
        }
    }

    private static void moveReplace(Path source, Path target) throws IOException
    {
        try
        {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE,
                StandardCopyOption.REPLACE_EXISTING);
        }
        catch (AtomicMoveNotSupportedException failure)
        {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static void deleteIfPresent(Path path) throws IOException
    {
        if (path != null)
        {
            Files.deleteIfExists(path);
        }
    }

    private static IOException cleanup(Path stagedOutput, Path stagedReport,
        DestinationSnapshot outputSnapshot, DestinationSnapshot reportSnapshot)
    {
        IOException failure = null;
        failure = cleanupPath(stagedOutput, failure);
        failure = cleanupPath(stagedReport, failure);
        failure = cleanupSnapshot(outputSnapshot, failure);
        return cleanupSnapshot(reportSnapshot, failure);
    }

    private static IOException cleanupPath(Path path, IOException accumulated)
    {
        try
        {
            deleteIfPresent(path);
        }
        catch (IOException failure)
        {
            return accumulate(accumulated, failure);
        }
        return accumulated;
    }

    private static IOException cleanupSnapshot(DestinationSnapshot snapshot,
        IOException accumulated)
    {
        if (snapshot == null)
        {
            return accumulated;
        }
        try
        {
            snapshot.close();
        }
        catch (IOException failure)
        {
            return accumulate(accumulated, failure);
        }
        return accumulated;
    }

    private static IOException accumulate(IOException accumulated, IOException failure)
    {
        if (accumulated == null)
        {
            return failure;
        }
        accumulated.addSuppressed(failure);
        return accumulated;
    }

    private static final class DestinationSnapshot implements AutoCloseable
    {
        private final Path destination;
        private final boolean existed;
        private Path backup;

        private DestinationSnapshot(Path destination, boolean existed, Path backup)
        {
            this.destination = destination;
            this.existed = existed;
            this.backup = backup;
        }

        static DestinationSnapshot capture(Path destination) throws IOException
        {
            if (!Files.exists(destination, LinkOption.NOFOLLOW_LINKS))
            {
                return new DestinationSnapshot(destination, false, null);
            }

            Path backup = createTemporarySibling(destination, ".backup");
            try
            {
                CopyOption[] options = {
                    LinkOption.NOFOLLOW_LINKS,
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES
                };
                Files.copy(destination, backup, options);

                if (Files.isRegularFile(destination, LinkOption.NOFOLLOW_LINKS))
                {
                    if (!Hashing.sha256(destination).equals(Hashing.sha256(backup)))
                    {
                        throw new IOException("Artifact backup failed verification: "
                            + destination);
                    }
                }
                else if (!Files.readSymbolicLink(destination)
                    .equals(Files.readSymbolicLink(backup)))
                {
                    throw new IOException("Symbolic-link backup failed verification: "
                        + destination);
                }
                return new DestinationSnapshot(destination, true, backup);
            }
            catch (IOException | RuntimeException | Error failure)
            {
                try
                {
                    Files.deleteIfExists(backup);
                }
                catch (IOException cleanupFailure)
                {
                    failure.addSuppressed(cleanupFailure);
                }
                throw failure;
            }
        }

        void restore() throws IOException
        {
            if (existed)
            {
                moveReplace(backup, destination);
                backup = null;
            }
            else
            {
                Files.deleteIfExists(destination);
            }
        }

        @Override
        public void close() throws IOException
        {
            deleteIfPresent(backup);
            backup = null;
        }
    }
}
