package dev.rl.suite.pass;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import dev.rl.suite.util.DecoderTable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

/** Removes proven field encoders and decoders when every archive access has the exact safe shape. */
public final class ProvenDecoderNormalizer implements TransformPass
{
    @Override
    public String name()
    {
        return "normalize-proven-decoders";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        Map<String, Candidate> candidates = candidates(context);
        for (ClassUnit unit : context.getArchive().getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                for (AbstractInsnNode instruction : method.instructions.toArray())
                {
                    if (!(instruction instanceof FieldInsnNode))
                    {
                        continue;
                    }
                    FieldInsnNode field = (FieldInsnNode) instruction;
                    Candidate candidate = candidates.get(key(field.owner, field.name, field.desc));
                    if (candidate != null)
                    {
                        candidate.observe(method, field);
                    }
                }
            }
        }

        List<Edit> edits = new ArrayList<>();
        long fields = 0;
        for (Candidate candidate : candidates.values())
        {
            if (candidate.safe && candidate.accesses > 0)
            {
                fields++;
                edits.addAll(candidate.edits);
            }
        }
        return new Plan(fields, edits);
    }

    private static Map<String, Candidate> candidates(PassContext context)
    {
        Map<String, DecoderTable.Decoder> decoders = DecoderTable.extract(context.getArchive());
        Map<String, Candidate> candidates = new LinkedHashMap<>();
        for (ClassUnit unit : context.getArchive().getClasses())
        {
            for (FieldNode field : unit.getNode().fields)
            {
                DecoderTable.Decoder decoder = decoders.get(unit.getNode().name + "." + field.name);
                if (decoder == null || decoder.getConfidence() == DecoderTable.Confidence.INFERRED
                    || !("I".equals(field.desc) || "J".equals(field.desc)) || field.value != null)
                {
                    continue;
                }
                candidates.put(key(unit.getNode().name, field.name, field.desc),
                    new Candidate(field.desc, decoder.getMultiplier()));
            }
        }
        return candidates;
    }

    private static String key(String owner, String name, String descriptor)
    {
        return owner + '\0' + name + '\0' + descriptor;
    }

    private static AbstractInsnNode previousExecutable(AbstractInsnNode instruction)
    {
        do
        {
            instruction = instruction.getPrevious();
        }
        while (instruction != null && instruction.getOpcode() < 0);
        return instruction;
    }

    private static AbstractInsnNode nextExecutable(AbstractInsnNode instruction)
    {
        do
        {
            instruction = instruction.getNext();
        }
        while (instruction != null && instruction.getOpcode() < 0);
        return instruction;
    }

    private static final class Candidate
    {
        private final boolean isLong;
        private final Number decoder;
        private final Number encoder;
        private final List<Edit> edits = new ArrayList<>();
        private boolean safe = true;
        private int accesses;

        private Candidate(String descriptor, String multiplier)
        {
            isLong = "J".equals(descriptor);
            decoder = isLong ? Long.valueOf(multiplier) : Integer.valueOf(multiplier);
            BigInteger modulus = BigInteger.ONE.shiftLeft(isLong ? 64 : 32);
            BigInteger inverse = new BigInteger(multiplier).mod(modulus).modInverse(modulus);
            encoder = isLong ? Long.valueOf(inverse.longValue()) : Integer.valueOf(inverse.intValue());
        }

        private void observe(MethodNode method, FieldInsnNode field)
        {
            accesses++;
            if (field.getOpcode() == Opcodes.GETFIELD || field.getOpcode() == Opcodes.GETSTATIC)
            {
                AbstractInsnNode constant = nextExecutable(field);
                AbstractInsnNode multiply = constant == null ? null : nextExecutable(constant);
                if (!matches(constant, decoder) || multiply == null
                    || multiply.getOpcode() != (isLong ? Opcodes.LMUL : Opcodes.IMUL))
                {
                    safe = false;
                    return;
                }
                edits.add(new Edit(method, constant, multiply));
                return;
            }
            AbstractInsnNode multiply = previousExecutable(field);
            AbstractInsnNode constant = multiply == null ? null : previousExecutable(multiply);
            if (field.getOpcode() != Opcodes.PUTFIELD && field.getOpcode() != Opcodes.PUTSTATIC
                || !matches(constant, encoder) || multiply == null
                || multiply.getOpcode() != (isLong ? Opcodes.LMUL : Opcodes.IMUL))
            {
                safe = false;
                return;
            }
            edits.add(new Edit(method, constant, multiply));
        }

        private boolean matches(AbstractInsnNode instruction, Number expected)
        {
            if (!(instruction instanceof LdcInsnNode))
            {
                return false;
            }
            Object actual = ((LdcInsnNode) instruction).cst;
            return isLong ? actual instanceof Long && actual.equals(expected)
                : actual instanceof Integer && actual.equals(expected);
        }
    }

    private static final class Edit
    {
        private final MethodNode method;
        private final AbstractInsnNode constant;
        private final AbstractInsnNode multiply;

        private Edit(MethodNode method, AbstractInsnNode constant, AbstractInsnNode multiply)
        {
            this.method = method;
            this.constant = constant;
            this.multiply = multiply;
        }

        private void apply()
        {
            method.instructions.remove(constant);
            method.instructions.remove(multiply);
        }
    }

    private static final class Plan implements TransformationPlan
    {
        private final long fields;
        private final List<Edit> edits;

        private Plan(long fields, List<Edit> edits)
        {
            this.fields = fields;
            this.edits = new ArrayList<>(edits);
        }

        @Override
        public void apply(PassContext context)
        {
            for (Edit edit : edits)
            {
                edit.apply();
            }
            context.getReport().putMetric("decoders.normalizedFields", fields);
            context.getReport().putMetric("decoders.normalizedAccesses", edits.size());
        }
    }
}
