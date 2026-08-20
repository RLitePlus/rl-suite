package dev.rl.suite.pass;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalLong;
import java.util.Set;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Removes only malformed array-valued javax.inject.Named poison annotations. */
public final class NamedAnnotationStripper implements TransformPass
{
    public static final String NAMED_DESCRIPTOR = "Ljavax/inject/Named;";
    private static final Set<String> KNOWN_LEGITIMATE_VALUES = Set.of(
        "scriptVmMaxOps",
        "scriptVmWarningOps",
        "runeLiteDir",
        "insecureWriteCredentials"
    );

    @Override
    public String name()
    {
        return "strip-malformed-named";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        Counts before = count(context);
        if (before.unknown > 0)
        {
            throw new TransformException("Found " + before.unknown
                + " unknown javax.inject.Named annotation shape(s)");
        }
        OptionalLong expected = context.getConfig().getExpectedMalformedNamed();
        if (expected.isPresent() && expected.getAsLong() != before.malformed)
        {
            throw new TransformException("Expected " + expected.getAsLong()
                + " malformed Named annotations, found " + before.malformed);
        }
        return new Plan(before);
    }

    private static Counts count(PassContext context)
    {
        long malformed = 0;
        long scalar = 0;
        long unknown = 0;
        for (ClassUnit unit : context.getArchive().getClasses())
        {
            ClassNode classNode = unit.getNode();
            Counts counts = count(classNode.visibleAnnotations, true);
            malformed += counts.malformed;
            scalar += counts.scalar;
            unknown += counts.unknown;
            counts = count(classNode.invisibleAnnotations, false);
            malformed += counts.malformed;
            scalar += counts.scalar;
            unknown += counts.unknown;

            for (FieldNode field : classNode.fields)
            {
                counts = count(field.visibleAnnotations, true);
                malformed += counts.malformed;
                scalar += counts.scalar;
                unknown += counts.unknown;
                counts = count(field.invisibleAnnotations, false);
                malformed += counts.malformed;
                scalar += counts.scalar;
                unknown += counts.unknown;
            }
            for (MethodNode method : classNode.methods)
            {
                counts = count(method.visibleAnnotations, true);
                malformed += counts.malformed;
                scalar += counts.scalar;
                unknown += counts.unknown;
                counts = count(method.invisibleAnnotations, false);
                malformed += counts.malformed;
                scalar += counts.scalar;
                unknown += counts.unknown;
            }
        }
        return new Counts(malformed, scalar, unknown);
    }

    private static long strip(List<AnnotationNode> annotations, boolean visible)
    {
        if (annotations == null)
        {
            return 0;
        }
        long removed = 0;
        for (Iterator<AnnotationNode> iterator = annotations.iterator(); iterator.hasNext(); )
        {
            AnnotationNode annotation = iterator.next();
            if (classify(annotation, visible) == Classification.POISON)
            {
                iterator.remove();
                removed++;
            }
        }
        return removed;
    }

    private static Counts count(List<AnnotationNode> annotations, boolean visible)
    {
        long malformed = 0;
        long scalar = 0;
        long unknown = 0;
        for (AnnotationNode annotation : annotations == null ? List.<AnnotationNode>of() : annotations)
        {
            Classification classification = classify(annotation, visible);
            if (classification == Classification.POISON)
            {
                malformed++;
            }
            else if (classification == Classification.LEGITIMATE)
            {
                scalar++;
            }
            else if (classification == Classification.UNKNOWN)
            {
                unknown++;
            }
        }
        return new Counts(malformed, scalar, unknown);
    }

    static Classification classify(AnnotationNode annotation, boolean visible)
    {
        if (!NAMED_DESCRIPTOR.equals(annotation.desc))
        {
            return Classification.NOT_NAMED;
        }
        if (annotation.values == null || annotation.values.size() != 2
            || !"value".equals(annotation.values.get(0)))
        {
            return Classification.UNKNOWN;
        }

        Object value = annotation.values.get(1);
        if (!visible && value instanceof List)
        {
            List<?> values = (List<?>) value;
            if (values.isEmpty())
            {
                return Classification.UNKNOWN;
            }
            for (Object item : values)
            {
                if (!(item instanceof String))
                {
                    return Classification.UNKNOWN;
                }
            }
            return Classification.POISON;
        }
        if (visible && value instanceof String && KNOWN_LEGITIMATE_VALUES.contains(value))
        {
            return Classification.LEGITIMATE;
        }
        return Classification.UNKNOWN;
    }

    enum Classification
    {
        NOT_NAMED,
        POISON,
        LEGITIMATE,
        UNKNOWN
    }

    private static final class Counts
    {
        private final long malformed;
        private final long scalar;
        private final long unknown;

        private Counts(long malformed, long scalar, long unknown)
        {
            this.malformed = malformed;
            this.scalar = scalar;
            this.unknown = unknown;
        }

    }

    private static final class Plan implements TransformationPlan
    {
        private final Counts expectedBefore;

        private Plan(Counts expectedBefore)
        {
            this.expectedBefore = expectedBefore;
        }

        @Override
        public void apply(PassContext context)
        {
            Counts actualBefore = count(context);
            if (actualBefore.malformed != expectedBefore.malformed
                || actualBefore.scalar != expectedBefore.scalar
                || actualBefore.unknown != expectedBefore.unknown)
            {
                throw new TransformException("Named annotation shape changed after planning");
            }

            long removed = 0;
            for (ClassUnit unit : context.getArchive().getClasses())
            {
                ClassNode classNode = unit.getNode();
                removed += strip(classNode.visibleAnnotations, true);
                removed += strip(classNode.invisibleAnnotations, false);

                for (FieldNode field : classNode.fields)
                {
                    removed += strip(field.visibleAnnotations, true);
                    removed += strip(field.invisibleAnnotations, false);
                }
                for (MethodNode method : classNode.methods)
                {
                    removed += strip(method.visibleAnnotations, true);
                    removed += strip(method.invisibleAnnotations, false);
                }
            }

            Counts after = count(context);
            if (expectedBefore.malformed - after.malformed != removed || after.malformed != 0)
            {
                throw new TransformException("Malformed Named accounting mismatch: before="
                    + expectedBefore.malformed + ", removed=" + removed + ", after=" + after.malformed);
            }
            if (expectedBefore.scalar != after.scalar)
            {
                throw new TransformException("Scalar Named annotations changed: before="
                    + expectedBefore.scalar + ", after=" + after.scalar);
            }
            if (expectedBefore.unknown != after.unknown)
            {
                throw new TransformException("Unknown Named annotations changed: before="
                    + expectedBefore.unknown + ", after=" + after.unknown);
            }

            context.getReport().putMetric("named.malformed.before", expectedBefore.malformed);
            context.getReport().putMetric("named.malformed.removed", removed);
            context.getReport().putMetric("named.malformed.after", after.malformed);
            context.getReport().putMetric("named.scalar.preserved", after.scalar);
            context.getReport().putMetric("named.unknown.preserved", after.unknown);
        }
    }
}
