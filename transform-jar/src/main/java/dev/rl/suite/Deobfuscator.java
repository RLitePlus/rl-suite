package dev.rl.suite;

import dev.rl.suite.model.JarArchive;
import dev.rl.suite.pass.NamedAnnotationStripper;
import dev.rl.suite.pass.PacketHandlerNormalizer;
import dev.rl.suite.pass.ProvenDecoderNormalizer;
import dev.rl.suite.pass.CondyConcatNormalizer;
import dev.rl.suite.pass.UnusedMemberMarker;
import dev.rl.suite.packet.PacketProfilePolicy;
import dev.rl.suite.rename.FieldKey;
import dev.rl.suite.rename.SemanticMap;
import dev.rl.suite.rename.SymbolRenamer;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import dev.rl.suite.report.AuditReport;
import dev.rl.suite.util.AuditPath;
import dev.rl.suite.util.DecoderTable;
import dev.rl.suite.util.Hashing;
import dev.rl.suite.verify.ArchiveVerifier;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Deobfuscator
{
    public AuditReport run(TransformConfig config) throws IOException
    {
        validateDistinctPaths(config);
        AuditReport report = new AuditReport();
        report.putMetadata("input.path", AuditPath.forReport(config.getInput()));
        String inputSha256 = Hashing.sha256(config.getInput());
        report.putMetadata("input.sha256", inputSha256);
        PacketProfilePolicy.validate(config.getPacketProfileMode(),
            config.isPacketProfileExplicit(), inputSha256);

        JarArchive archive = JarArchive.read(config.getInput());
        SemanticMap semanticMap = config.getSemanticMap().isPresent()
            ? SemanticMap.read(config.getSemanticMap().get(), inputSha256)
            : SemanticMap.empty();
        report.putMetric("semantic.classes", semanticMap.getClasses().size());
        report.putMetric("semantic.fields", semanticMap.getFields().size());
        report.putMetric("semantic.methods", semanticMap.getMethods().size());
        if (config.getSemanticMap().isPresent())
        {
            report.putMetadata("semantic.map.path", AuditPath.forReport(
                config.getSemanticMap().get()));
            report.putMetadata("semantic.map.sha256", Hashing.sha256(
                config.getSemanticMap().get()));
        }
        // Before any pass runs: the renamer rewrites field names, and a decoder table
        // keyed by the new names would be useless for reading the original client.
        Map<String, DecoderTable.Decoder> decoders = DecoderTable.extract(archive);
        Map<String, String> multipliers = new java.util.LinkedHashMap<>();
        java.util.Map<DecoderTable.Confidence, Long> byConfidence = new java.util.EnumMap<>(
            DecoderTable.Confidence.class);
        Map<String, String> unproven = new java.util.LinkedHashMap<>();
        for (Map.Entry<String, DecoderTable.Decoder> entry : decoders.entrySet())
        {
            if (entry.getValue().getConfidence() == DecoderTable.Confidence.INFERRED)
            {
                unproven.put(entry.getKey(), entry.getValue().getMultiplier());
            }
            else
            {
                multipliers.put(entry.getKey(), entry.getValue().getMultiplier());
            }
            byConfidence.merge(entry.getValue().getConfidence(), 1L, Long::sum);
        }
        report.putDecoders(multipliers);
        report.putUnprovenDecoders(unproven);
        report.putMetric("decoders.count", decoders.size());
        report.putMetric("decoders.stated", byConfidence.getOrDefault(
            DecoderTable.Confidence.STATED, 0L));
        report.putMetric("decoders.proven", byConfidence.getOrDefault(
            DecoderTable.Confidence.PROVEN, 0L));
        report.putMetric("decoders.inferred", byConfidence.getOrDefault(
            DecoderTable.Confidence.INFERRED, 0L));
        report.putMetric("archive.classes", archive.getClasses().size());
        report.putMetric("archive.resources", archive.getResources().size());

        PassContext context = new PassContext(archive, config, report);
        List<TransformationPlan> plans = new ArrayList<>();
        List<TransformPass> activePasses = defaultPasses(archive, config, report, semanticMap);
        for (TransformPass pass : activePasses)
        {
            plans.add(pass.analyze(context));
        }
        for (int index = 0; index < plans.size(); index++)
        {
            plans.get(index).apply(context);
            report.passCompleted(activePasses.get(index).name());
        }

        ArchiveVerifier.Result verification = new ArchiveVerifier().verifyOrThrow(archive);
        report.putMetric("verification.methods", verification.getVerifiedMethods());
        report.putMetric("verification.errors", verification.getErrors().size());

        new ArtifactPublisher().publish(archive, report, config.getOutput(), config.getReport());
        return report;
    }

    private static List<TransformPass> defaultPasses(JarArchive archive,
        TransformConfig config, AuditReport report, SemanticMap semanticMap)
    {
        Map<FieldKey, String> packetOverrides = config.getPacketProfileMode()
            .resolveOverrides(archive);
        report.putMetadata("packet.profile", config.getPacketProfileMode().getOptionName());
        report.putMetadata("packet.profile.sha256",
            config.getPacketProfileMode().getContentSha256());
        report.putMetadata("packet.profile.selection",
            config.isPacketProfileExplicit() ? "explicit" : "implicit-checksum-pinned");
        report.putMetric("packet.profile.names", packetOverrides.size());
        return List.of(
            new NamedAnnotationStripper(),
            new PacketHandlerNormalizer(),
            new CondyConcatNormalizer(),
            new ProvenDecoderNormalizer(),
            new UnusedMemberMarker(),
            new SymbolRenamer(packetOverrides, semanticMap));
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
        if (config.getSemanticMap().isPresent())
        {
            Path semanticMap = config.getSemanticMap().get().toAbsolutePath().normalize();
            if (sameFile(semanticMap, input) || sameFile(semanticMap, output)
                || sameFile(semanticMap, report))
            {
                throw new TransformException("Semantic map, input, output, and report paths must be distinct");
            }
        }
    }

    private static boolean sameFile(Path left, Path right) throws IOException
    {
        return left.equals(right)
            || Files.exists(left) && Files.exists(right) && Files.isSameFile(left, right);
    }
}
