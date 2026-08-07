package dev.rl.suite.rename;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Order in which a class hands out its generic {@code fieldN} numbers.
 *
 * <p>Recovered from the renamed-client oracle sources and verified to reproduce their
 * numbering exactly on 1.12.31, 1.12.31.1, 1.12.32, 1.12.34 and 1.12.34.1.
 * Classes are visited in ascending internal name and each class's fields occupy
 * one contiguous block, so only the order inside a class matters here.
 *
 * <p>Stage one scans the class's own constructors in declaration order and
 * claims fields in the order the bytecode first touches them. Stage two appends
 * everything left over, sorted by descriptor then name.
 *
 * <p>Three details of stage one are load-bearing and deliberately odd. An
 * instance initializer only counts instance-field instructions and a static
 * initializer only counts static-field instructions. A write only counts when it
 * targets this class, while a read counts whatever it targets. The claim is
 * matched on the referenced field <em>name</em> alone: the reference's owner and
 * descriptor are ignored, so {@code getfield dp.ae:Leb;} inside {@code dt.<init>}
 * claims {@code dt.ae:I}. Where a class declares several fields sharing one name,
 * the whole group is claimed together, ordered by ascending descriptor.
 */
final class FieldNumberingOrder
{
    private static final Comparator<FieldNode> LEFTOVERS =
        Comparator.<FieldNode, String>comparing(field -> field.desc)
            .thenComparing(field -> field.name);

    private FieldNumberingOrder()
    {
    }

    /** Every declared field of {@code node}, in the order numbers are assigned. */
    static List<FieldNode> order(ClassNode node)
    {
        Map<String, List<FieldNode>> byName = new LinkedHashMap<>();
        for (FieldNode field : node.fields)
        {
            byName.computeIfAbsent(field.name, ignored -> new ArrayList<>()).add(field);
        }

        List<FieldNode> ordered = new ArrayList<>(node.fields.size());
        Set<String> claimed = new LinkedHashSet<>();
        for (MethodNode method : node.methods)
        {
            boolean staticInitializer = "<clinit>".equals(method.name);
            boolean instanceInitializer = "<init>".equals(method.name);
            if (!staticInitializer && !instanceInitializer || method.instructions == null)
            {
                continue;
            }
            for (AbstractInsnNode insn = method.instructions.getFirst(); insn != null;
                 insn = insn.getNext())
            {
                if (!(insn instanceof FieldInsnNode))
                {
                    continue;
                }
                FieldInsnNode reference = (FieldInsnNode) insn;
                int opcode = reference.getOpcode();
                boolean staticAccess = opcode == Opcodes.GETSTATIC || opcode == Opcodes.PUTSTATIC;
                if (staticInitializer != staticAccess)
                {
                    continue;
                }
                boolean write = opcode == Opcodes.PUTSTATIC || opcode == Opcodes.PUTFIELD;
                if (write && !node.name.equals(reference.owner))
                {
                    continue;
                }
                List<FieldNode> group = byName.get(reference.name);
                if (group == null || !claimed.add(reference.name))
                {
                    continue;
                }
                // A claimed group is emitted by ascending descriptor, not by
                // declaration order. Only five classes in the archive declare
                // duplicate obfuscated field names, so this is worth 10 fields
                // and is invisible to any comparison keyed on name alone.
                if (group.size() > 1)
                {
                    group = new ArrayList<>(group);
                    group.sort(LEFTOVERS);
                }
                ordered.addAll(group);
            }
        }

        List<FieldNode> leftovers = new ArrayList<>();
        for (FieldNode field : node.fields)
        {
            if (!claimed.contains(field.name))
            {
                leftovers.add(field);
            }
        }
        leftovers.sort(LEFTOVERS);
        ordered.addAll(leftovers);
        return ordered;
    }
}
