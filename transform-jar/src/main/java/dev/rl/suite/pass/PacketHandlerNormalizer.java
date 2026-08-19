package dev.rl.suite.pass;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.ILOAD;
import static org.objectweb.asm.Opcodes.IRETURN;
import static org.objectweb.asm.Opcodes.ISTORE;
import static org.objectweb.asm.Opcodes.POP;
import static org.objectweb.asm.Opcodes.SWAP;
import static org.objectweb.asm.Opcodes.ACC_SYNCHRONIZED;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Coalesces the deliberately fragmented exception table used by the five
 * injected packet-reader variants. The matcher encodes the complete proven
 * 1.12.31/1.12.32 geometry and rejects near misses.
 */
public final class PacketHandlerNormalizer implements TransformPass
{
    /**
     * Smallest exception-table size a method must have before it is even
     * considered. The five readers are isolated by a wide margin at every
     * revision measured: they carry 324 entries at 1.12.31-1.12.33 and 328 at
     * 1.12.34, while the next largest {@code )Z} method in the archive carries
     * 13. The floor only excludes ordinary code; the real matcher below is what
     * rejects a near miss.
     */
    private static final int MINIMUM_TRY_CATCH_BLOCKS = 64;
    private static final String IO_EXCEPTION = "java/io/IOException";
    private static final String EXCEPTION = "java/lang/Exception";

    @Override
    public String name()
    {
        return "normalize-packet-handlers";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        List<MethodPlan> candidates = new ArrayList<>();
        for (ClassUnit unit : context.getArchive().getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                if (!method.desc.endsWith(")Z")
                    || method.tryCatchBlocks.size() < MINIMUM_TRY_CATCH_BLOCKS
                    || method.tryCatchBlocks.size() % 2 != 0)
                {
                    continue;
                }
                candidates.add(analyzeCandidate(unit.getNode().name, method,
                    method.tryCatchBlocks.size() / 2));
            }
        }

        long expected = context.getConfig().getExpectedPacketHandlers();
        if (candidates.size() != expected)
        {
            throw new TransformException("Expected " + expected + " packet-handler shapes, found "
                + candidates.size());
        }

        // Every reader in one archive is generated from the same template, so a
        // disagreement here means the matcher latched onto something else.
        int rangeCount = candidates.isEmpty() ? 0 : candidates.get(0).rangeCount;
        for (MethodPlan candidate : candidates)
        {
            if (candidate.rangeCount != rangeCount)
            {
                throw new TransformException("Packet handlers disagree on range count: found "
                    + rangeCount + " and " + candidate.rangeCount);
            }
        }
        long pinned = context.getConfig().getExpectedPacketRanges();
        if (pinned >= 0 && rangeCount != pinned)
        {
            throw new TransformException("Expected " + pinned
                + " packet-handler ranges, found " + rangeCount);
        }
        context.getReport().putMetric("packet.ranges", rangeCount);
        return new Plan(candidates);
    }

    private static MethodPlan analyzeCandidate(String owner, MethodNode method, int rangeCount)
    {
        if ((method.access & ACC_SYNCHRONIZED) != 0)
        {
            fail(owner, method, "synchronized packet handlers cannot safely extend catch coverage");
        }
        List<TryCatchBlockNode> blocks = method.tryCatchBlocks;
        LabelNode ioHandler = blocks.get(0).handler;
        LabelNode exceptionHandler = blocks.get(rangeCount).handler;
        if (ioHandler == exceptionHandler)
        {
            fail(owner, method, "catch handlers must be distinct");
        }

        Map<AbstractInsnNode, Integer> indexes = instructionIndexes(method);
        int previousEnd = -1;
        GapKind gapKind = null;
        Integer commonFunnelVariable = null;
        LabelNode commonFunnelTarget = null;

        for (int index = 0; index < rangeCount; index++)
        {
            TryCatchBlockNode io = blocks.get(index);
            TryCatchBlockNode general = blocks.get(index + rangeCount);
            requireNoTypeAnnotations(owner, method, io);
            requireNoTypeAnnotations(owner, method, general);

            if (!IO_EXCEPTION.equals(io.type) || io.handler != ioHandler)
            {
                fail(owner, method, "invalid IOException group at index " + index);
            }
            if (!EXCEPTION.equals(general.type) || general.handler != exceptionHandler)
            {
                fail(owner, method, "invalid Exception group at index " + index);
            }
            if (io.start != general.start || io.end != general.end)
            {
                fail(owner, method, "paired ranges do not reuse labels at index " + index);
            }

            Integer startIndex = indexes.get(io.start);
            Integer endIndex = indexes.get(io.end);
            if (startIndex == null || endIndex == null || startIndex >= endIndex || startIndex <= previousEnd)
            {
                fail(owner, method, "ranges are not strictly ordered at index " + index);
            }

            if (index > 0)
            {
                TryCatchBlockNode previous = blocks.get(index - 1);
                Gap gap = analyzeGap(previous.end, io.start, owner, method);
                if (gapKind == null)
                {
                    gapKind = gap.kind;
                }
                else if (gapKind != gap.kind)
                {
                    fail(owner, method, "mixed inter-range gap shapes");
                }

                if (gap.kind == GapKind.FUNNEL)
                {
                    if (commonFunnelVariable == null)
                    {
                        commonFunnelVariable = gap.variable;
                        commonFunnelTarget = gap.target;
                    }
                    else if (commonFunnelVariable.intValue() != gap.variable || commonFunnelTarget != gap.target)
                    {
                        fail(owner, method, "return funnels do not share a local and target");
                    }
                }
            }
            previousEnd = endIndex;
        }

        if (gapKind == null)
        {
            fail(owner, method, "no inter-range gaps found");
        }

        List<FunnelTail> funnelTails = Collections.emptyList();
        if (gapKind == GapKind.FUNNEL)
        {
            funnelTails = analyzeHighFanInFunnel(owner, method, commonFunnelVariable,
                commonFunnelTarget, rangeCount);
        }

        return new MethodPlan(owner, method, blocks.get(0).start, blocks.get(rangeCount - 1).end,
            ioHandler, exceptionHandler, gapKind, funnelTails, rangeCount);
    }

    private static void requireNoTypeAnnotations(String owner, MethodNode method, TryCatchBlockNode block)
    {
        if ((block.visibleTypeAnnotations != null && !block.visibleTypeAnnotations.isEmpty())
            || (block.invisibleTypeAnnotations != null && !block.invisibleTypeAnnotations.isEmpty()))
        {
            fail(owner, method, "try/catch type annotations are unsupported");
        }
    }

    private static Gap analyzeGap(LabelNode from, LabelNode to, String owner, MethodNode method)
    {
        List<AbstractInsnNode> real = new ArrayList<>();
        for (AbstractInsnNode instruction = from.getNext(); instruction != null && instruction != to;
             instruction = instruction.getNext())
        {
            if (instruction.getOpcode() >= 0)
            {
                real.add(instruction);
            }
        }

        if (real.size() == 1 && real.get(0).getOpcode() == IRETURN)
        {
            return Gap.directReturn();
        }

        int cursor = 0;
        if (real.size() != 3 && real.size() != 4)
        {
            fail(owner, method, "unsafe gap opcodes: " + opcodeList(real));
        }
        if (!(real.get(cursor) instanceof VarInsnNode) || real.get(cursor).getOpcode() != ISTORE)
        {
            fail(owner, method, "return funnel gap does not begin with ISTORE");
        }
        int variable = ((VarInsnNode) real.get(cursor++)).var;
        if (real.size() == 4 && real.get(cursor++).getOpcode() != POP)
        {
            fail(owner, method, "only POP is permitted in the four-instruction funnel gap");
        }
        if (!(real.get(cursor) instanceof VarInsnNode) || real.get(cursor).getOpcode() != ILOAD
            || ((VarInsnNode) real.get(cursor)).var != variable)
        {
            fail(owner, method, "return funnel loads a different local");
        }
        cursor++;
        if (!(real.get(cursor) instanceof JumpInsnNode) || real.get(cursor).getOpcode() != GOTO)
        {
            fail(owner, method, "return funnel does not end with GOTO");
        }
        return Gap.funnel(variable, ((JumpInsnNode) real.get(cursor)).label);
    }

    private static List<FunnelTail> analyzeHighFanInFunnel(
        String owner, MethodNode method, int expectedVariable, LabelNode expectedTarget,
        int rangeCount)
    {
        List<JumpInsnNode> incoming = new ArrayList<>();
        Set<LabelNode> switchTargets = Collections.newSetFromMap(new IdentityHashMap<>());

        for (AbstractInsnNode instruction : method.instructions)
        {
            if (instruction instanceof JumpInsnNode)
            {
                JumpInsnNode jump = (JumpInsnNode) instruction;
                if (jump.label == expectedTarget)
                {
                    incoming.add(jump);
                }
            }
            else if (instruction instanceof TableSwitchInsnNode)
            {
                TableSwitchInsnNode table = (TableSwitchInsnNode) instruction;
                switchTargets.add(table.dflt);
                switchTargets.addAll(table.labels);
            }
            else if (instruction instanceof LookupSwitchInsnNode)
            {
                LookupSwitchInsnNode lookup = (LookupSwitchInsnNode) instruction;
                switchTargets.add(lookup.dflt);
                switchTargets.addAll(lookup.labels);
            }
        }

        if (switchTargets.contains(expectedTarget))
        {
            fail(owner, method, "return funnel is also a switch target");
        }
        if (incoming.size() != rangeCount + 1)
        {
            fail(owner, method, "return funnel must have " + (rangeCount + 1)
                + " incoming jumps, found " + incoming.size());
        }
        if (nextReal(expectedTarget) == null || nextReal(expectedTarget).getOpcode() != IRETURN)
        {
            fail(owner, method, "return funnel target is not followed by IRETURN");
        }
        List<FunnelTail> tails = new ArrayList<>();
        int specialCount = 0;
        for (JumpInsnNode jump : incoming)
        {
            if (jump.getOpcode() != GOTO)
            {
                fail(owner, method, "non-GOTO edge enters return funnel");
            }
            AbstractInsnNode load = previousReal(jump);
            if (!(load instanceof VarInsnNode) || load.getOpcode() != ILOAD
                || ((VarInsnNode) load).var != expectedVariable)
            {
                fail(owner, method, "incoming funnel jump is not preceded by the expected ILOAD");
            }
            AbstractInsnNode beforeLoad = previousReal(load);
            boolean special;
            AbstractInsnNode store;
            AbstractInsnNode pop = null;
            if (beforeLoad != null && beforeLoad.getOpcode() == POP)
            {
                special = true;
                pop = beforeLoad;
                store = previousReal(beforeLoad);
                specialCount++;
            }
            else
            {
                special = false;
                store = beforeLoad;
            }
            if (!(store instanceof VarInsnNode) || store.getOpcode() != ISTORE
                || ((VarInsnNode) store).var != expectedVariable)
            {
                fail(owner, method, "incoming funnel tail does not use the expected ISTORE");
            }
            tails.add(new FunnelTail((VarInsnNode) store, pop, (VarInsnNode) load, jump, special));
        }
        if (specialCount != 1)
        {
            fail(owner, method, "return funnel must have exactly one POP-bearing tail, found " + specialCount);
        }
        return tails;
    }

    private static AbstractInsnNode previousReal(AbstractInsnNode instruction)
    {
        for (AbstractInsnNode current = instruction.getPrevious(); current != null; current = current.getPrevious())
        {
            if (current.getOpcode() >= 0)
            {
                return current;
            }
        }
        return null;
    }

    private static AbstractInsnNode nextReal(AbstractInsnNode instruction)
    {
        for (AbstractInsnNode current = instruction.getNext(); current != null; current = current.getNext())
        {
            if (current.getOpcode() >= 0)
            {
                return current;
            }
        }
        return null;
    }

    private static Map<AbstractInsnNode, Integer> instructionIndexes(MethodNode method)
    {
        Map<AbstractInsnNode, Integer> result = new IdentityHashMap<>();
        int index = 0;
        for (AbstractInsnNode instruction : method.instructions)
        {
            result.put(instruction, index++);
        }
        return result;
    }

    private static String opcodeList(List<AbstractInsnNode> instructions)
    {
        List<Integer> opcodes = new ArrayList<>();
        for (AbstractInsnNode instruction : instructions)
        {
            opcodes.add(instruction.getOpcode());
        }
        return opcodes.toString();
    }

    private static void fail(String owner, MethodNode method, String message)
    {
        throw new TransformException(owner + "." + method.name + method.desc + ": " + message);
    }

    private enum GapKind
    {
        DIRECT_RETURN,
        FUNNEL
    }

    private static final class Gap
    {
        private final GapKind kind;
        private final int variable;
        private final LabelNode target;

        private Gap(GapKind kind, int variable, LabelNode target)
        {
            this.kind = kind;
            this.variable = variable;
            this.target = target;
        }

        private static Gap directReturn()
        {
            return new Gap(GapKind.DIRECT_RETURN, -1, null);
        }

        private static Gap funnel(int variable, LabelNode target)
        {
            return new Gap(GapKind.FUNNEL, variable, target);
        }
    }

    private static final class MethodPlan
    {
        private final String owner;
        private final MethodNode method;
        private final LabelNode start;
        private final LabelNode end;
        private final LabelNode ioHandler;
        private final LabelNode exceptionHandler;
        private final GapKind gapKind;
        private final List<FunnelTail> funnelTails;
        private final int rangeCount;

        private MethodPlan(String owner, MethodNode method, LabelNode start, LabelNode end,
                           LabelNode ioHandler, LabelNode exceptionHandler, GapKind gapKind,
                           List<FunnelTail> funnelTails, int rangeCount)
        {
            this.owner = owner;
            this.method = method;
            this.start = start;
            this.end = end;
            this.ioHandler = ioHandler;
            this.exceptionHandler = exceptionHandler;
            this.gapKind = gapKind;
            this.funnelTails = new ArrayList<>(funnelTails);
            this.rangeCount = rangeCount;
        }
    }

    private static final class FunnelTail
    {
        private final VarInsnNode store;
        private final AbstractInsnNode pop;
        private final VarInsnNode load;
        private final JumpInsnNode jump;
        private final boolean special;

        private FunnelTail(VarInsnNode store, AbstractInsnNode pop, VarInsnNode load,
                           JumpInsnNode jump, boolean special)
        {
            this.store = store;
            this.pop = pop;
            this.load = load;
            this.jump = jump;
            this.special = special;
        }
    }

    private static final class Plan implements TransformationPlan
    {
        private final List<MethodPlan> methods;

        private Plan(List<MethodPlan> methods)
        {
            this.methods = new ArrayList<>(methods);
        }

        @Override
        public void apply(PassContext context)
        {
            long tryCatchBefore = 0;
            long tryCatchAfter = 0;
            long flattenedJumps = 0;
            long directGapMethods = 0;
            long funnelGapMethods = 0;
            long executableBefore = 0;
            long executableAfter = 0;

            for (MethodPlan plan : methods)
            {
                if (plan.method.tryCatchBlocks.size() != plan.rangeCount * 2)
                {
                    fail(plan.owner, plan.method, "shape changed after planning");
                }
                executableBefore += executableInstructionCount(plan.method);
                tryCatchBefore += plan.method.tryCatchBlocks.size();
                List<TryCatchBlockNode> replacement = new ArrayList<>(2);
                replacement.add(new TryCatchBlockNode(plan.start, plan.end, plan.ioHandler, IO_EXCEPTION));
                replacement.add(new TryCatchBlockNode(plan.start, plan.end, plan.exceptionHandler, EXCEPTION));
                plan.method.tryCatchBlocks = replacement;
                tryCatchAfter += replacement.size();

                if (plan.gapKind == GapKind.FUNNEL)
                {
                    funnelGapMethods++;
                    for (FunnelTail tail : plan.funnelTails)
                    {
                        if (tail.special)
                        {
                            // Original stack is [junk, boolean]. Preserve the existing POP but
                            // swap first so it discards junk and leaves the boolean for IRETURN.
                            plan.method.instructions.set(tail.store, new InsnNode(SWAP));
                        }
                        else
                        {
                            plan.method.instructions.remove(tail.store);
                        }
                        plan.method.instructions.remove(tail.load);
                        plan.method.instructions.set(tail.jump, new InsnNode(IRETURN));
                        flattenedJumps++;
                    }
                }
                else
                {
                    directGapMethods++;
                }
                executableAfter += executableInstructionCount(plan.method);
            }

            context.getReport().putMetric("packet.handlers.matched", methods.size());
            context.getReport().putMetric("packet.tryCatch.before", tryCatchBefore);
            context.getReport().putMetric("packet.tryCatch.after", tryCatchAfter);
            context.getReport().putMetric("packet.returnJumps.flattened", flattenedJumps);
            context.getReport().putMetric("packet.gaps.directReturnMethods", directGapMethods);
            context.getReport().putMetric("packet.gaps.funnelMethods", funnelGapMethods);
            context.getReport().putMetric("packet.instructions.before", executableBefore);
            context.getReport().putMetric("packet.instructions.after", executableAfter);
            context.getReport().putMetric("packet.instructions.removed", executableBefore - executableAfter);
        }

        private static long executableInstructionCount(MethodNode method)
        {
            long count = 0;
            for (AbstractInsnNode instruction : method.instructions)
            {
                if (instruction.getOpcode() >= 0)
                {
                    count++;
                }
            }
            return count;
        }
    }
}
