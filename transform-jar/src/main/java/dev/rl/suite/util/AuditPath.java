package dev.rl.suite.util;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Renders a path for the audit report without recording where the machine that
 * produced it keeps its files. A path inside the working directory is written
 * relative to it; anything else is reduced to its file name.
 */
public final class AuditPath
{
    private AuditPath()
    {
    }

    public static String forReport(Path path)
    {
        Path absolute = path.toAbsolutePath().normalize();
        Path workingDirectory = Paths.get("").toAbsolutePath().normalize();
        if (absolute.startsWith(workingDirectory))
        {
            return workingDirectory.relativize(absolute).toString();
        }
        Path fileName = absolute.getFileName();
        return fileName == null ? absolute.toString() : fileName.toString();
    }
}
