package dev.rl.suite.pipeline;

import dev.rl.suite.TransformConfig;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.report.AuditReport;
import java.util.Objects;

public final class PassContext
{
    private final JarArchive archive;
    private final TransformConfig config;
    private final AuditReport report;

    public PassContext(JarArchive archive, TransformConfig config, AuditReport report)
    {
        this.archive = Objects.requireNonNull(archive);
        this.config = Objects.requireNonNull(config);
        this.report = Objects.requireNonNull(report);
    }

    public JarArchive getArchive()
    {
        return archive;
    }

    public TransformConfig getConfig()
    {
        return config;
    }

    public AuditReport getReport()
    {
        return report;
    }
}
