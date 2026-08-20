package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Recovers the game action that sends each client packet.
 *
 * <p>Packets such as OPNPC1 through OPNPC6 write identical fields and cannot be
 * told apart by their payload. What separates them is the menu action the player
 * chose, which the client passes in as an argument and tests against a constant
 * before sending. This finds that constant: the value an argument must equal for
 * control to reach the send.
 *
 * <p>Only the value an argument must <em>equal</em> is kept. A send is usually
 * reached after a chain of tests ruling other values out, but which values get
 * ruled out depends on how the compiler ordered the tests and on comparisons the
 * obfuscator adds, and it differs between revisions for the same packet. The
 * value that must match does not: OPNPC3 is action 11 in both revision 239 and
 * revision 240.
 *
 * <p>A test only constrains the send if it dominates it. Plain backwards
 * reachability is useless here: the client's methods are control-flow flattened,
 * so nearly every instruction can reach nearly every other one going backwards,
 * and reachability collects the whole method's tests rather than this send's.
 */
public final class ClientSendGuards
{
    /** Above this a constant is an opaque comparison value, not a game action. */
    private static final int MAX_ACTION_VALUE = 4096;

    /** Dominator solving is iterative; large methods are abandoned, not looped on. */
    private static final int MAX_ROUNDS = 60;

    /** Above this a helper is called from too many places for its callers to mean anything. */
    private static final int MAX_CALLERS = 4;

    /** How many call levels to walk up looking for the action. */
    private static final int MAX_DEPTH = 3;

    private ClientSendGuards()
    {
    }

    /**
     * Packet id to the actions that reach it. Packets sent from no guarded site
     * map to an empty set.
     */
    public static Map<Integer, Set<String>> collect(
        JarArchive archive, PacketTable clientTable)
    {
        String owner = clientTable.getOwner();
        Map<String, Integer> fieldToId = new LinkedHashMap<>();
        for (PacketTable.Entry e : clientTable.getEntries())
        {
            fieldToId.put(e.getField().getName(), e.getId());
        }

        Map<Integer, TreeSet<String>> found = new TreeMap<>();
        for (Integer id : fieldToId.values()) found.put(id, new TreeSet<>());

        // Packet ids sent from each method, so a method whose sends are
        // unguarded can be looked at again from its callers.
        Map<String, Set<Integer>> sendersOf = new LinkedHashMap<>();

        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                List<AbstractInsnNode> sites = new ArrayList<>();
                List<Integer> ids = new ArrayList<>();
                for (AbstractInsnNode insn : method.instructions)
                {
                    if (!(insn instanceof FieldInsnNode)
                        || insn.getOpcode() != Opcodes.GETSTATIC)
                    {
                        continue;
                    }
                    FieldInsnNode fi = (FieldInsnNode) insn;
                    if (!owner.equals(fi.owner)) continue;
                    Integer id = fieldToId.get(fi.name);
                    if (id == null) continue;
                    sites.add(insn);
                    ids.add(id);
                }
                if (sites.isEmpty()) continue;

                String key = unit.getNode().name + "." + method.name + method.desc;
                sendersOf.computeIfAbsent(key, k -> new java.util.LinkedHashSet<>())
                    .addAll(ids);

                Cfg cfg = Cfg.of(method);
                if (cfg == null) continue;
                for (int i = 0; i < sites.size(); i++)
                {
                    found.get(ids.get(i)).addAll(cfg.guardsDominating(sites.get(i)));
                }
            }
        }

        propagateFromCallers(archive, sendersOf, found);

        Map<Integer, Set<String>> result = new TreeMap<>();
        found.forEach((id, set) -> result.put(id, Collections.unmodifiableSet(set)));
        return Collections.unmodifiableMap(result);
    }

    /**
     * A send inside a helper carries no test of its own; the action was checked
     * by whoever called the helper, or by whoever called that. For packets still
     * without an action, walks up the call graph taking the actions that guard
     * the calls, stopping at {@link #MAX_DEPTH} levels.
     *
     * <p>Only methods with few callers are followed. One called from all over
     * gathers actions from unrelated places, which would describe the call graph
     * rather than the packet.
     */
    private static void propagateFromCallers(JarArchive archive,
        Map<String, Set<Integer>> sendersOf, Map<Integer, TreeSet<String>> found)
    {
        CallGraph graph = CallGraph.of(archive);
        for (Map.Entry<String, Set<Integer>> e : sendersOf.entrySet())
        {
            boolean anyEmpty = false;
            for (int id : e.getValue())
            {
                if (found.get(id).isEmpty()) { anyEmpty = true; break; }
            }
            if (!anyEmpty) continue;

            TreeSet<String> inherited = new TreeSet<>();
            graph.guardsAbove(e.getKey(), 0, new java.util.HashSet<>(), inherited);
            if (inherited.isEmpty()) continue;
            for (int id : e.getValue())
            {
                if (found.get(id).isEmpty()) found.get(id).addAll(inherited);
            }
        }
    }

    /** Where each method is called from, with dominator sets computed on demand. */
    private static final class CallGraph
    {
        private final Map<String, List<Call>> callsTo = new LinkedHashMap<>();
        private final Map<MethodNode, Cfg> cfgCache = new HashMap<>();

        private static final class Call
        {
            final String callerKey;
            final MethodNode caller;
            final AbstractInsnNode site;

            Call(String callerKey, MethodNode caller, AbstractInsnNode site)
            {
                this.callerKey = callerKey;
                this.caller = caller;
                this.site = site;
            }
        }

        static CallGraph of(JarArchive archive)
        {
            CallGraph graph = new CallGraph();
            for (ClassUnit unit : archive.getClasses())
            {
                for (MethodNode method : unit.getNode().methods)
                {
                    String callerKey = unit.getNode().name + "." + method.name + method.desc;
                    for (AbstractInsnNode insn : method.instructions)
                    {
                        if (!(insn instanceof org.objectweb.asm.tree.MethodInsnNode)) continue;
                        org.objectweb.asm.tree.MethodInsnNode mi =
                            (org.objectweb.asm.tree.MethodInsnNode) insn;
                        String callee = mi.owner + "." + mi.name + mi.desc;
                        graph.callsTo.computeIfAbsent(callee, k -> new ArrayList<>())
                            .add(new Call(callerKey, method, insn));
                    }
                }
            }
            return graph;
        }

        void guardsAbove(String methodKey, int depth,
            Set<String> visited, TreeSet<String> out)
        {
            if (depth >= MAX_DEPTH || !visited.add(methodKey)) return;
            List<Call> calls = callsTo.get(methodKey);
            if (calls == null || calls.isEmpty() || calls.size() > MAX_CALLERS) return;

            for (Call call : calls)
            {
                Cfg cfg = cfgCache.computeIfAbsent(call.caller, Cfg::of);
                if (cfg == null) continue;
                Set<String> here = cfg.guardsDominating(call.site);
                if (!here.isEmpty()) out.addAll(here);
                else guardsAbove(call.callerKey, depth + 1, visited, out);
            }
        }
    }

    /** A method's instruction-level control-flow graph with its dominator sets. */
    private static final class Cfg
    {
        private final List<AbstractInsnNode> insns;
        private final Map<AbstractInsnNode, Integer> index;
        private final List<List<Integer>> successors;
        private final BitSet[] dominators;

        private Cfg(List<AbstractInsnNode> insns, Map<AbstractInsnNode, Integer> index,
            List<List<Integer>> successors, BitSet[] dominators)
        {
            this.insns = insns;
            this.index = index;
            this.successors = successors;
            this.dominators = dominators;
        }

        static Cfg of(MethodNode method)
        {
            List<AbstractInsnNode> insns = new ArrayList<>();
            Map<AbstractInsnNode, Integer> index = new HashMap<>();
            for (AbstractInsnNode n : method.instructions)
            {
                index.put(n, insns.size());
                insns.add(n);
            }
            int size = insns.size();
            if (size == 0) return null;

            List<List<Integer>> successors = new ArrayList<>(size);
            List<List<Integer>> predecessors = new ArrayList<>(size);
            for (int i = 0; i < size; i++)
            {
                successors.add(new ArrayList<>());
                predecessors.add(new ArrayList<>());
            }
            for (int i = 0; i < size; i++)
            {
                for (AbstractInsnNode target : targetsOf(insns.get(i)))
                {
                    Integer j = target == null ? null : index.get(target);
                    if (j == null) continue;
                    successors.get(i).add(j);
                    predecessors.get(j).add(i);
                }
            }

            BitSet[] dominators = new BitSet[size];
            BitSet everything = new BitSet(size);
            everything.set(0, size);
            for (int i = 0; i < size; i++) dominators[i] = (BitSet) everything.clone();
            dominators[0].clear();
            dominators[0].set(0);

            boolean changed = true;
            int rounds = 0;
            while (changed && rounds++ < MAX_ROUNDS)
            {
                changed = false;
                for (int i = 1; i < size; i++)
                {
                    if (predecessors.get(i).isEmpty()) continue;
                    BitSet next = null;
                    for (int p : predecessors.get(i))
                    {
                        if (next == null) next = (BitSet) dominators[p].clone();
                        else next.and(dominators[p]);
                    }
                    next.set(i);
                    if (!next.equals(dominators[i]))
                    {
                        dominators[i] = next;
                        changed = true;
                    }
                }
            }
            return new Cfg(insns, index, successors, dominators);
        }

        Set<String> guardsDominating(AbstractInsnNode site)
        {
            Set<String> guards = new TreeSet<>();
            Integer siteIdx = index.get(site);
            if (siteIdx == null) return guards;

            BitSet dominatingSite = dominators[siteIdx];
            for (int i = dominatingSite.nextSetBit(0); i >= 0;
                i = dominatingSite.nextSetBit(i + 1))
            {
                AbstractInsnNode branch = insns.get(i);
                for (int s : successors.get(i))
                {
                    // The successor that also dominates the send is the edge
                    // control must take to get there.
                    if (s != siteIdx && !dominatingSite.get(s)) continue;
                    describe(branch, insns.get(s), guards);
                }
            }
            return guards;
        }

        private static void describe(AbstractInsnNode branch,
            AbstractInsnNode target, Set<String> guards)
        {
            if (branch instanceof TableSwitchInsnNode)
            {
                TableSwitchInsnNode ts = (TableSwitchInsnNode) branch;
                for (int k = 0; k < ts.labels.size(); k++)
                {
                    if (ts.labels.get(k) == target) guards.add("case" + (ts.min + k));
                }
            }
            else if (branch instanceof LookupSwitchInsnNode)
            {
                LookupSwitchInsnNode ls = (LookupSwitchInsnNode) branch;
                for (int k = 0; k < ls.labels.size(); k++)
                {
                    if (ls.labels.get(k) == target) guards.add("case" + ls.keys.get(k));
                }
            }
            else if (branch instanceof JumpInsnNode && branch.getOpcode() != Opcodes.GOTO)
            {
                Integer value = comparedArgument((JumpInsnNode) branch);
                if (value == null) return;
                // Zero is not an action. Testing an argument against zero is
                // the ordinary false test and appears all over the client, so
                // it names different packets in different revisions: it is the
                // only value that produced a wrong pairing in revisions 235
                // to 240, and dropping it costs no correct pairing.
                if (value == 0) return;
                boolean tookJump = target == ((JumpInsnNode) branch).label;
                boolean jumpMeansEqual = branch.getOpcode() == Opcodes.IF_ICMPEQ;
                if (tookJump == jumpMeansEqual) guards.add("arg=" + value);
            }
        }
    }

    private static List<AbstractInsnNode> targetsOf(AbstractInsnNode n)
    {
        List<AbstractInsnNode> targets = new ArrayList<>(2);
        int op = n.getOpcode();
        if (n instanceof JumpInsnNode)
        {
            targets.add(((JumpInsnNode) n).label);
            if (op != Opcodes.GOTO) targets.add(n.getNext());
        }
        else if (n instanceof TableSwitchInsnNode)
        {
            TableSwitchInsnNode ts = (TableSwitchInsnNode) n;
            targets.add(ts.dflt);
            targets.addAll(ts.labels);
        }
        else if (n instanceof LookupSwitchInsnNode)
        {
            LookupSwitchInsnNode ls = (LookupSwitchInsnNode) n;
            targets.add(ls.dflt);
            targets.addAll(ls.labels);
        }
        else if (!((op >= Opcodes.IRETURN && op <= Opcodes.RETURN) || op == Opcodes.ATHROW))
        {
            targets.add(n.getNext());
        }
        return targets;
    }

    /** The constant an int argument is compared against, if this is such a test. */
    private static Integer comparedArgument(JumpInsnNode jump)
    {
        int op = jump.getOpcode();
        if (op != Opcodes.IF_ICMPEQ && op != Opcodes.IF_ICMPNE) return null;
        AbstractInsnNode second = Instructions.previousExecutable(jump);
        if (second == null) return null;
        AbstractInsnNode first = Instructions.previousExecutable(second);
        if (first == null) return null;

        Integer value = Instructions.intConstant(second);
        boolean loadThenConstant = value != null && isIntLoad(first);
        if (!loadThenConstant)
        {
            value = Instructions.intConstant(first);
            if (value == null || !isIntLoad(second)) return null;
        }
        return Math.abs(value) <= MAX_ACTION_VALUE ? value : null;
    }

    private static boolean isIntLoad(AbstractInsnNode n)
    {
        return n instanceof VarInsnNode && n.getOpcode() == Opcodes.ILOAD;
    }

}
