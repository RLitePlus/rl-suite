package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Locates the client fields and classes that a launcher has to reach by
 * reflection but that RuneLite does not publish. Every rule here is anchored on
 * something the injector cannot rename - a {@code net.runelite.api} interface a
 * class declares, or an injected public getter - and then reads the answer out
 * of the bytecode.
 *
 * <p>The rules are revision-independent by construction, but that is a claim
 * about them, not a proof. Run {@link #derive} against a revision whose answers
 * are already known and compare before trusting a new one; the CLI does exactly
 * that.</p>
 */
public final class HookExtractor
{
    /**
     * Every key a rule in this class can produce. A control comparison uses this
     * to tell "the rule found nothing" apart from "the control never recorded
     * that hook", which are very different failures.
     */
    public static final Set<String> SUPPORTED_KEYS;

    static
    {
        Set<String> keys = new LinkedHashSet<>();
        keys.add("Actor");
        keys.add("Actor.pathLength");
        keys.add("Scene");
        keys.add("Scene.selectedX");
        keys.add("Scene.selectedY");
        keys.add("Scene.viewportWalking");
        keys.add("Scene.checkClick");
        keys.add("TileItem");
        keys.add("TileItem.worldViewId");
        keys.add("KeyHandler");
        keys.add("KeyHandler.idleTicks");
        keys.add("KeyHandler_instance");
        keys.add("Widgets");
        keys.add("Widgets.Widget_interfaceComponents");
        keys.add("widgets");
        keys.add("username");
        keys.add("password");
        keys.add("otp");
        keys.add("loginIndex");
        keys.add("isMenuOpen");
        keys.add("MouseHandler_lastPressedTimeMillis");
        keys.add("loginResponse1");
        keys.add("loginResponse2");
        keys.add("loginResponse3");
        SUPPORTED_KEYS = java.util.Collections.unmodifiableSet(keys);
    }

    private HookExtractor()
    {
    }

    /** One located symbol. {@code multiplier} is null when the field is not garbage-encoded. */
    public static final class Hook
    {
        private final String owner;
        private final String name;
        private final String desc;
        private final String multiplier;

        Hook(String owner, String name, String desc, String multiplier)
        {
            this.owner = owner;
            this.name = name;
            this.desc = desc;
            this.multiplier = multiplier;
        }

        public String getOwner()
        {
            return owner;
        }

        public String getName()
        {
            return name;
        }

        public String getDesc()
        {
            return desc;
        }

        public String getMultiplier()
        {
            return multiplier;
        }

        @Override
        public String toString()
        {
            String base = name == null ? owner : owner + "." + name + ":" + desc;
            return multiplier == null ? base : base + " *" + multiplier;
        }

        @Override
        public boolean equals(Object other)
        {
            if (!(other instanceof Hook))
            {
                return false;
            }
            return toString().equals(other.toString());
        }

        @Override
        public int hashCode()
        {
            return toString().hashCode();
        }
    }

    /**
     * Derives every hook this class knows how to find. Keys follow the
     * supplemental mapping convention: {@code Class.field} for instance fields,
     * a bare name for statics, and a bare class name for a class identity.
     * A rule that finds nothing leaves its key out rather than guessing.
     */
    public static Map<String, Hook> derive(JarArchive archive)
    {
        Map<String, ClassNode> classes = index(archive);
        Map<String, String> declared = implementorsByInterface(archive);
        Map<String, Hook> hooks = new TreeMap<>();

        String client = "client";
        String actor = declared.get("Actor");
        String scene = declared.get("Scene");
        String worldView = declared.get("WorldView");
        String tileItem = declared.get("TileItem");

        putClass(hooks, "Actor", actor);
        putClass(hooks, "Scene", scene);
        putClass(hooks, "TileItem", tileItem);

        deriveSceneSelection(hooks, classes, worldView, scene);
        deriveSceneFlags(hooks, classes, scene);
        derivePathLength(hooks, classes, actor);
        deriveWorldViewId(hooks, classes, worldView, tileItem);
        deriveKeyHandler(hooks, classes, client);
        deriveWidgets(hooks, classes, client);
        deriveLoginStatics(hooks, classes, client);
        deriveMouseLastPressed(hooks, classes, client);
        deriveLoginResponses(hooks, classes);
        return hooks;
    }

    // ---- class identity -------------------------------------------------

    /**
     * Inverts {@link ApiInterfaceExtractor} into interface simple name to the
     * obfuscated class declaring it. A class declaring
     * {@code net.runelite.api.Player} is Player, so this needs no matching rule
     * of its own. Where two classes declare the same interface the first wins;
     * that does not happen for the types used here.
     */
    public static Map<String, String> implementorsByInterface(JarArchive archive)
    {
        Map<String, String> byInterface = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> entry
            : ApiInterfaceExtractor.extract(archive).entrySet())
        {
            for (String declared : entry.getValue())
            {
                byInterface.putIfAbsent(declared, entry.getKey());
            }
        }
        return byInterface;
    }

    // ---- Scene ----------------------------------------------------------

    /**
     * {@code WorldView.getSelectedSceneTile()} branches on
     * {@code client.isMenuOpen()} and reads a different coordinate pair on each
     * side. The menu-open pair is the one a caller must write; the other is the
     * hovered pair, recomputed from the mouse every frame. First pair read is X,
     * second is Y.
     */
    private static void deriveSceneSelection(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String worldView, String scene)
    {
        MethodNode method = method(classes, worldView, "getSelectedSceneTile", null);
        if (method == null || scene == null)
        {
            return;
        }
        List<String> menuOpenReads = new ArrayList<>();
        AbstractInsnNode[] insns = method.instructions.toArray();
        for (int i = 0; i < insns.length; i++)
        {
            if (!isCall(insns[i], "isMenuOpen", "()Z"))
            {
                continue;
            }
            AbstractInsnNode branch = nextReal(insns, i + 1);
            if (branch == null || branch.getOpcode() != Opcodes.IFEQ)
            {
                continue;
            }
            // The branch first loads the scene reference off the world view, so
            // skip past that and take the first read of the scene's own int.
            for (int j = i + 1; j < Math.min(insns.length, i + 12); j++)
            {
                if (insns[j].getOpcode() == Opcodes.GETFIELD)
                {
                    FieldInsnNode field = (FieldInsnNode) insns[j];
                    if (field.owner.equals(scene) && field.desc.equals("I"))
                    {
                        menuOpenReads.add(field.name);
                        break;
                    }
                }
            }
        }
        if (menuOpenReads.size() >= 2)
        {
            hooks.put("Scene.selectedX", new Hook(scene, menuOpenReads.get(0), "I", null));
            hooks.put("Scene.selectedY", new Hook(scene, menuOpenReads.get(1), "I", null));
        }
    }

    /**
     * viewportWalking is the Scene boolean the client tests together with
     * "selectedX != -1" in its own pending-walk check. checkClick is the other
     * boolean the selection-reset routine writes; the remaining candidate is
     * written only by the constructor.
     */
    private static void deriveSceneFlags(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String scene)
    {
        Hook selectedX = hooks.get("Scene.selectedX");
        if (scene == null || selectedX == null)
        {
            return;
        }
        Map<String, Integer> walkSites = new TreeMap<>();
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                AbstractInsnNode[] insns = method.instructions.toArray();
                for (int i = 0; i < insns.length; i++)
                {
                    if (insns[i].getOpcode() != Opcodes.GETFIELD)
                    {
                        continue;
                    }
                    FieldInsnNode flag = (FieldInsnNode) insns[i];
                    if (!flag.owner.equals(scene) || !flag.desc.equals("Z"))
                    {
                        continue;
                    }
                    boolean sawBranch = false;
                    boolean sawSelectedX = false;
                    boolean sawMinusOne = false;
                    for (int j = i + 1; j < Math.min(insns.length, i + 12); j++)
                    {
                        int op = insns[j].getOpcode();
                        if (op == Opcodes.IFEQ || op == Opcodes.IFNE)
                        {
                            sawBranch = true;
                        }
                        if (op == Opcodes.ICONST_M1)
                        {
                            sawMinusOne = true;
                        }
                        if (insns[j] instanceof FieldInsnNode)
                        {
                            FieldInsnNode other = (FieldInsnNode) insns[j];
                            if (other.owner.equals(scene) && other.name.equals(selectedX.name))
                            {
                                sawSelectedX = true;
                            }
                        }
                        if (sawBranch && sawSelectedX && sawMinusOne)
                        {
                            walkSites.merge(flag.name, 1, Integer::sum);
                            break;
                        }
                    }
                }
            }
        }
        String viewportWalking = single(walkSites);
        if (viewportWalking == null)
        {
            return;
        }
        hooks.put("Scene.viewportWalking", new Hook(scene, viewportWalking, "Z", null));

        Map<String, Set<String>> partnerWrites = new TreeMap<>();
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                Set<String> written = new TreeSet<>();
                boolean writesWalking = false;
                for (AbstractInsnNode insn : method.instructions.toArray())
                {
                    if (insn.getOpcode() != Opcodes.PUTFIELD)
                    {
                        continue;
                    }
                    FieldInsnNode field = (FieldInsnNode) insn;
                    if (!field.owner.equals(scene) || !field.desc.equals("Z"))
                    {
                        continue;
                    }
                    if (field.name.equals(viewportWalking))
                    {
                        writesWalking = true;
                    }
                    else
                    {
                        written.add(field.name);
                    }
                }
                if (writesWalking)
                {
                    for (String name : written)
                    {
                        partnerWrites.computeIfAbsent(name, key -> new TreeSet<>()).add(method.name);
                    }
                }
            }
        }
        // Record every write site, then keep the partner touched outside <init>.
        for (Map.Entry<String, Set<String>> entry : partnerWrites.entrySet())
        {
            Set<String> sites = allWriteSites(classes, scene, entry.getKey());
            sites.remove("<init>");
            if (!sites.isEmpty())
            {
                hooks.put("Scene.checkClick", new Hook(scene, entry.getKey(), "Z", null));
                return;
            }
        }
    }

    private static Set<String> allWriteSites(Map<String, ClassNode> classes, String owner, String field)
    {
        Set<String> sites = new TreeSet<>();
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                for (AbstractInsnNode insn : method.instructions.toArray())
                {
                    if (insn.getOpcode() == Opcodes.PUTFIELD)
                    {
                        FieldInsnNode candidate = (FieldInsnNode) insn;
                        if (candidate.owner.equals(owner) && candidate.name.equals(field))
                        {
                            sites.add(method.name);
                        }
                    }
                }
            }
        }
        return sites;
    }

    // ---- Actor ----------------------------------------------------------

    /**
     * pathLength bounds the loop that shifts the actor's path arrays, so it is
     * both read through its decoder and written inside a method that stores into
     * two or more of those arrays. Methods declared on the actor class itself
     * separate it from unrelated counters that the client's own update loop
     * touches alongside the same arrays.
     */
    private static void derivePathLength(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String actor)
    {
        ClassNode actorNode = actor == null ? null : classes.get(actor);
        if (actorNode == null)
        {
            return;
        }
        Set<String> pathArrays = new LinkedHashSet<>();
        for (FieldNode field : actorNode.fields)
        {
            if (field.desc.equals("[I"))
            {
                pathArrays.add(field.name);
            }
        }
        Map<String, String> multipliers = new HashMap<>();
        Map<String, Integer> ranking = new TreeMap<>();
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                AbstractInsnNode[] insns = method.instructions.toArray();
                if (storedArrays(insns, actor, pathArrays) < 2)
                {
                    continue;
                }
                Map<String, String> read = new LinkedHashMap<>();
                Set<String> written = new TreeSet<>();
                for (int i = 0; i < insns.length; i++)
                {
                    if (!(insns[i] instanceof FieldInsnNode))
                    {
                        continue;
                    }
                    FieldInsnNode field = (FieldInsnNode) insns[i];
                    if (!field.owner.equals(actor) || !field.desc.equals("I"))
                    {
                        continue;
                    }
                    if (field.getOpcode() == Opcodes.PUTFIELD)
                    {
                        written.add(field.name);
                    }
                    String multiplier = multiplierAfter(insns, i);
                    if (multiplier != null)
                    {
                        read.put(field.name, multiplier);
                    }
                }
                for (Map.Entry<String, String> entry : read.entrySet())
                {
                    if (!written.contains(entry.getKey()) || !node.name.equals(actor))
                    {
                        continue;
                    }
                    ranking.merge(entry.getKey(), 1, Integer::sum);
                    multipliers.put(entry.getKey(), entry.getValue());
                }
            }
        }
        String best = ranking.entrySet().stream()
            .max(Comparator.comparingInt(Map.Entry::getValue))
            .map(Map.Entry::getKey).orElse(null);
        if (best != null)
        {
            hooks.put("Actor.pathLength", new Hook(actor, best, "I", multipliers.get(best)));
        }
    }

    private static int storedArrays(AbstractInsnNode[] insns, String owner, Set<String> arrays)
    {
        Set<String> seen = new TreeSet<>();
        for (int i = 0; i < insns.length; i++)
        {
            if (insns[i].getOpcode() != Opcodes.IASTORE)
            {
                continue;
            }
            for (int j = Math.max(0, i - 8); j < i; j++)
            {
                if (insns[j] instanceof FieldInsnNode)
                {
                    FieldInsnNode field = (FieldInsnNode) insns[j];
                    if (field.owner.equals(owner) && arrays.contains(field.name))
                    {
                        seen.add(field.name);
                    }
                }
            }
        }
        return seen.size();
    }

    // ---- TileItem -------------------------------------------------------

    /** The world view stamps its own getId() straight onto each item it owns. */
    private static void deriveWorldViewId(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String worldView, String tileItem)
    {
        if (worldView == null || tileItem == null)
        {
            return;
        }
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                AbstractInsnNode[] insns = method.instructions.toArray();
                for (int i = 0; i < insns.length; i++)
                {
                    if (!(insns[i] instanceof MethodInsnNode))
                    {
                        continue;
                    }
                    MethodInsnNode call = (MethodInsnNode) insns[i];
                    if (!call.owner.equals(worldView) || !call.name.equals("getId")
                        || !call.desc.equals("()I"))
                    {
                        continue;
                    }
                    for (int j = i + 1; j < Math.min(insns.length, i + 8); j++)
                    {
                        if (insns[j].getOpcode() == Opcodes.PUTFIELD)
                        {
                            FieldInsnNode field = (FieldInsnNode) insns[j];
                            if (field.owner.equals(tileItem) && field.desc.equals("I"))
                            {
                                hooks.put("TileItem.worldViewId",
                                    new Hook(tileItem, field.name, "I", null));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    // ---- KeyHandler, Widgets, login statics -----------------------------

    /** getKeyboardIdleTicks() reads the handler instance then calls its decoder. */
    private static void deriveKeyHandler(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String client)
    {
        MethodNode getter = method(classes, client, "getKeyboardIdleTicks", "()I");
        if (getter == null)
        {
            return;
        }
        FieldInsnNode instance = firstField(getter, Opcodes.GETSTATIC);
        MethodInsnNode decoder = firstCall(getter);
        if (instance == null || decoder == null)
        {
            return;
        }
        hooks.put("KeyHandler", new Hook(decoder.owner, null, null, null));
        hooks.put("KeyHandler_instance",
            new Hook(instance.owner, instance.name, instance.desc, null));
        MethodNode body = method(classes, decoder.owner, decoder.name, decoder.desc);
        if (body == null)
        {
            return;
        }
        AbstractInsnNode[] insns = body.instructions.toArray();
        for (int i = 0; i < insns.length; i++)
        {
            if (insns[i].getOpcode() == Opcodes.GETFIELD)
            {
                String multiplier = multiplierAfter(insns, i);
                if (multiplier != null)
                {
                    FieldInsnNode field = (FieldInsnNode) insns[i];
                    hooks.put("KeyHandler.idleTicks",
                        new Hook(field.owner, field.name, field.desc, multiplier));
                    return;
                }
            }
        }
    }

    /**
     * getWidget(int,int) delegates to a method that reads the widget container
     * static and then the component table on it. The static's declared type is a
     * subclass, so the table is declared on the parent.
     */
    private static void deriveWidgets(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String client)
    {
        MethodNode getter = method(classes, client, "getWidget", null);
        if (getter == null)
        {
            return;
        }
        MethodInsnNode delegate = firstCall(getter);
        MethodNode body = delegate == null
            ? null : method(classes, delegate.owner, delegate.name, delegate.desc);
        if (body == null)
        {
            return;
        }
        FieldInsnNode container = firstField(body, Opcodes.GETSTATIC);
        FieldInsnNode table = null;
        for (AbstractInsnNode insn : body.instructions.toArray())
        {
            if (insn.getOpcode() == Opcodes.GETFIELD && ((FieldInsnNode) insn).desc.startsWith("[["))
            {
                table = (FieldInsnNode) insn;
                break;
            }
        }
        if (container != null)
        {
            hooks.put("widgets", new Hook(container.owner, container.name, container.desc, null));
        }
        if (table != null)
        {
            hooks.put("Widgets", new Hook(table.owner, null, null, null));
            hooks.put("Widgets.Widget_interfaceComponents",
                new Hook(table.owner, table.name, table.desc, null));
        }
    }

    /** Each of these is the single field an injected accessor touches. */
    private static void deriveLoginStatics(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String client)
    {
        putAccessorField(hooks, classes, client, "getUsername", "()Ljava/lang/String;",
            Opcodes.GETSTATIC, "username", false);
        putAccessorField(hooks, classes, client, "setPassword", "(Ljava/lang/String;)V",
            Opcodes.PUTSTATIC, "password", false);
        putAccessorField(hooks, classes, client, "setOtp", "(Ljava/lang/String;)V",
            Opcodes.PUTSTATIC, "otp", false);
        putAccessorField(hooks, classes, client, "isMenuOpen", "()Z",
            Opcodes.GETSTATIC, "isMenuOpen", false);
        putAccessorField(hooks, classes, client, "getLoginIndex", "()I",
            Opcodes.GETSTATIC, "loginIndex", true);
    }

    private static void deriveMouseLastPressed(Map<String, Hook> hooks,
        Map<String, ClassNode> classes, String client)
    {
        putAccessorField(hooks, classes, client, "getMouseLastPressedMillis", "()J",
            Opcodes.GETSTATIC, "MouseHandler_lastPressedTimeMillis", true);
    }

    /**
     * The three lines the login screen shows. The setter takes them as three String parameters and
     * stores each straight into a static, in order, which is a shape nothing else in the archive has.
     * Several methods do it - the obfuscator emits duplicates - and they agree, so the first is taken.
     *
     * <p>Without these a failed login reports no reason at all, which is unusable for a client nobody
     * is watching.
     */
    private static void deriveLoginResponses(Map<String, Hook> hooks, Map<String, ClassNode> classes)
    {
        for (ClassNode node : classes.values())
        {
            for (MethodNode method : node.methods)
            {
                if (!method.desc.startsWith("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;"))
                {
                    continue;
                }
                Map<Integer, FieldInsnNode> stores = new TreeMap<>();
                AbstractInsnNode[] insns = method.instructions.toArray();
                for (int i = 0; i + 1 < insns.length; i++)
                {
                    if (insns[i].getOpcode() != Opcodes.ALOAD
                        || insns[i + 1].getOpcode() != Opcodes.PUTSTATIC)
                    {
                        continue;
                    }
                    FieldInsnNode field = (FieldInsnNode) insns[i + 1];
                    if (field.desc.equals("Ljava/lang/String;"))
                    {
                        stores.put(((VarInsnNode) insns[i]).var, field);
                    }
                }
                if (stores.size() != 3)
                {
                    continue;
                }
                int line = 1;
                for (FieldInsnNode field : stores.values())
                {
                    hooks.put("loginResponse" + line++,
                        new Hook(field.owner, field.name, field.desc, null));
                }
                return;
            }
        }
    }

    private static void putAccessorField(Map<String, Hook> hooks, Map<String, ClassNode> classes,
        String owner, String methodName, String methodDesc, int opcode, String key,
        boolean withMultiplier)
    {
        MethodNode method = method(classes, owner, methodName, methodDesc);
        if (method == null)
        {
            return;
        }
        AbstractInsnNode[] insns = method.instructions.toArray();
        for (int i = 0; i < insns.length; i++)
        {
            if (insns[i].getOpcode() != opcode)
            {
                continue;
            }
            FieldInsnNode field = (FieldInsnNode) insns[i];
            String multiplier = withMultiplier ? multiplierAfter(insns, i) : null;
            if (withMultiplier && multiplier == null)
            {
                continue;
            }
            hooks.put(key, new Hook(field.owner, field.name, field.desc, multiplier));
            return;
        }
    }

    // ---- shared helpers -------------------------------------------------

    private static Map<String, ClassNode> index(JarArchive archive)
    {
        Map<String, ClassNode> classes = new LinkedHashMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }
        return classes;
    }

    private static void putClass(Map<String, Hook> hooks, String key, String owner)
    {
        if (owner != null)
        {
            hooks.put(key, new Hook(owner, null, null, null));
        }
    }

    /** The decode constant multiplied into a field read, or null if there is none. */
    private static String multiplierAfter(AbstractInsnNode[] insns, int index)
    {
        if (index + 2 >= insns.length || !(insns[index + 1] instanceof LdcInsnNode))
        {
            return null;
        }
        int op = insns[index + 2].getOpcode();
        if (op != Opcodes.IMUL && op != Opcodes.LMUL)
        {
            return null;
        }
        Object constant = ((LdcInsnNode) insns[index + 1]).cst;
        if (constant instanceof Integer || constant instanceof Long)
        {
            return String.valueOf(constant);
        }
        return null;
    }

    private static MethodNode method(Map<String, ClassNode> classes, String owner,
        String name, String desc)
    {
        ClassNode node = owner == null ? null : classes.get(owner);
        if (node == null)
        {
            return null;
        }
        for (MethodNode method : node.methods)
        {
            if (method.name.equals(name) && (desc == null || method.desc.equals(desc)))
            {
                return method;
            }
        }
        return null;
    }

    private static FieldInsnNode firstField(MethodNode method, int opcode)
    {
        for (AbstractInsnNode insn : method.instructions.toArray())
        {
            if (insn.getOpcode() == opcode)
            {
                return (FieldInsnNode) insn;
            }
        }
        return null;
    }

    private static MethodInsnNode firstCall(MethodNode method)
    {
        for (AbstractInsnNode insn : method.instructions.toArray())
        {
            if (insn instanceof MethodInsnNode)
            {
                return (MethodInsnNode) insn;
            }
        }
        return null;
    }

    private static boolean isCall(AbstractInsnNode insn, String name, String desc)
    {
        return insn instanceof MethodInsnNode
            && ((MethodInsnNode) insn).name.equals(name)
            && ((MethodInsnNode) insn).desc.equals(desc);
    }

    private static AbstractInsnNode nextReal(AbstractInsnNode[] insns, int from)
    {
        for (int i = from; i < insns.length; i++)
        {
            if (insns[i].getOpcode() >= 0)
            {
                return insns[i];
            }
        }
        return null;
    }

    private static String single(Map<String, Integer> counts)
    {
        return counts.size() == 1 ? counts.keySet().iterator().next() : null;
    }
}
