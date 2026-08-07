package dev.rl.suite.rename;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Order in which a class hands out its generic {@code methodN} and
 * {@code vmethodN} numbers.
 *
 * <p>The order is the original Jagex source order, recovered from the
 * {@code LineNumberTable} the obfuscator leaves in place. A method's key is the
 * line of its first line-number entry, which is its declaration line. Methods
 * compiled without debug info have no table at all and sort last; those are
 * exactly the RuneLite-injected members, which is why they appear at the end of
 * every class in the renamed-client sources.
 *
 * <p>The primary key is proven rather than fitted. Over roughly a million
 * ordered pairs per revision across 1.12.31.1, 1.12.32, 1.12.34 and 1.12.34.1,
 * the oracle's order has zero pairs whose first line runs backwards and zero
 * pairs placing a table-less method before one with a table.
 *
 * <p>The tie-break is <em>not</em> proven. Where two methods share a first line,
 * classfile declaration order is right about 65% of the time, and the residual
 * has structure that looks like an unstable sort in the producing tool: every
 * class smaller than 32 methods is perfectly declaration-ordered, and the
 * scrambling starts at exactly 32. Reproducing that was tried and rejected — the
 * reconstruction disagreed with itself across revisions, which is the signature
 * of fitting noise. Declaration order is used because it is the best tie-break
 * that holds up on held-out data.
 *
 * <p>Line numbers are read when the rename pass runs, after the packet-handler
 * and condy passes have rewritten eight method bodies in {@code client}. Those
 * rewrites do not disturb the first line-number entry of the methods they touch.
 * If a future pass ever inserts before one, snapshot the first line of every
 * method from the untouched input archive instead.
 */
final class MethodNumberingOrder
{
    private MethodNumberingOrder()
    {
    }

    /** Every declared method of {@code node}, in the order numbers are assigned. */
    static List<MethodNode> order(ClassNode node)
    {
        // client declares over a thousand methods, so the declaration index has
        // to be a lookup rather than an indexOf scan. Identity keys because
        // overloads share a name and two methods can share name and descriptor
        // only if the classfile is malformed.
        Map<MethodNode, Integer> declarationIndex = new IdentityHashMap<>();
        for (int index = 0; index < node.methods.size(); index++)
        {
            declarationIndex.put(node.methods.get(index), index);
        }

        Map<MethodNode, Integer> firstLines = new IdentityHashMap<>();
        for (MethodNode method : node.methods)
        {
            Integer line = firstLine(method);
            if (line != null)
            {
                firstLines.put(method, line);
            }
        }

        List<MethodNode> ordered = new ArrayList<>(node.methods);
        ordered.sort(Comparator
            .comparingInt((MethodNode method) -> firstLines.containsKey(method) ? 0 : 1)
            .thenComparingInt(method -> firstLines.getOrDefault(method, 0))
            .thenComparingInt(declarationIndex::get));
        return ordered;
    }

    /**
     * Whether {@code method} carries any line-number information. The whole
     * ordering rests on this being present; it is about 90% of methods at every
     * revision measured, and the audit report records the count so a build that
     * strips debug info shows up as a number rather than as silently worse
     * names.
     */
    static boolean hasLineNumbers(MethodNode method)
    {
        return firstLine(method) != null;
    }

    private static Integer firstLine(MethodNode method)
    {
        if (method.instructions == null)
        {
            return null;
        }
        for (AbstractInsnNode insn = method.instructions.getFirst(); insn != null;
             insn = insn.getNext())
        {
            if (insn instanceof LineNumberNode)
            {
                return ((LineNumberNode) insn).line;
            }
        }
        return null;
    }
}
