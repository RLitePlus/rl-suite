package dev.rl.suite;

import dev.rl.suite.model.JarArchive;
import dev.rl.suite.pass.NamedAnnotationStripper;
import dev.rl.suite.pass.PacketHandlerNormalizer;
import dev.rl.suite.pass.CondyConcatNormalizer;
import dev.rl.suite.pass.UnusedMemberMarker;
import dev.rl.suite.packet.PacketProfilePolicy;
import dev.rl.suite.rename.FieldKey;
import dev.rl.suite.rename.SymbolRenamer;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import dev.rl.suite.report.AuditReport;
import dev.rl.suite.util.AuditPath;
import dev.rl.suite.util.Hashing;
import dev.rl.suite.verify.ArchiveVerifier;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Deobfuscator
{
    private final List<TransformPass> passes;

    public Deobfuscator()
    {
        this.passes = null;
    }

    Deobfuscator(List<TransformPass> passes)
    {
        this.passes = passes;
    }

    public AuditReport run(TransformConfig config) throws IOException
    {
        validateDistinctPaths(config);
        AuditReport report = new AuditReport();
        report.putMetadata("input.path", AuditPath.forReport(config.getInput()));
        String inputSha256 = Hashing.sha256(config.getInput());
        report.putMetadata("input.sha256", inputSha256);
        if (passes == null)
        {
            PacketProfilePolicy.validate(config.getPacketProfileMode(),
                config.isPacketProfileExplicit(), inputSha256);
        }

        JarArchive archive = JarArchive.read(config.getInput());
        report.putMetric("archive.classes", archive.getClasses().size());
        report.putMetric("archive.resources", archive.getResources().size());

        PassContext context = new PassContext(archive, config, report);
        List<TransformationPlan> plans = new ArrayList<>();
        List<TransformPass> activePasses = passes == null
            ? defaultPasses(archive, config, report) : passes;
        for (TransformPass pass : activePasses)
        {
            TransformationPlan plan = pass.analyze(context);
            if (!pass.name().equals(plan.passName()))
            {
                throw new TransformException("Pass/plan name mismatch: " + pass.name()
                    + " != " + plan.passName());
            }
            plans.add(plan);
        }
        for (TransformationPlan plan : plans)
        {
            plan.apply(context);
            report.passCompleted(plan.passName());
        }

        ArchiveVerifier.Result verification = new ArchiveVerifier().verifyOrThrow(archive);
        report.putMetric("verification.methods", verification.getVerifiedMethods());
        report.putMetric("verification.errors", verification.getErrors().size());

        new ArtifactPublisher().publish(archive, report, config.getOutput(), config.getReport());
        return report;
    }

    private static List<TransformPass> defaultPasses(JarArchive archive,
        TransformConfig config, AuditReport report)
    {
        Map<FieldKey, String> packetOverrides = config.getPacketProfileMode()
            .resolveOverrides(archive);
        report.putMetadata("packet.profile", config.getPacketProfileMode().getOptionName());
        report.putMetadata("packet.profile.sha256",
            config.getPacketProfileMode().getContentSha256());
        report.putMetadata("packet.profile.selection",
            config.isPacketProfileExplicit() ? "explicit" : "implicit-checksum-pinned");
        report.putMetric("packet.profile.names", packetOverrides.size());
        return Arrays.asList(
            new NamedAnnotationStripper(),
            new PacketHandlerNormalizer(),
            new CondyConcatNormalizer(),
            new UnusedMemberMarker(),
            new SymbolRenamer(packetOverrides));
    }

    private static void validateDistinctPaths(TransformConfig config) throws IOException
    {
        Path input = config.getInput().toAbsolutePath().normalize();
        Path output = config.getOutput().toAbsolutePath().normalize();
        Path report = config.getReport().toAbsolutePath().normalize();
        if (sameFile(input, output) || sameFile(input, report) || sameFile(output, report))
        {
            throw new TransformException("Input, output, and report paths must be distinct");
        }
    }

    private static boolean sameFile(Path left, Path right) throws IOException
    {
        return left.equals(right)
            || Files.exists(left) && Files.exists(right) && Files.isSameFile(left, right);
    }
}
