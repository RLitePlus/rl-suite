package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.pass.NamedAnnotationStripper;
import dev.rl.suite.util.Hashing;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

/** Deterministic, conservative cross-revision semantic propagation. */
final class SemanticUpdater
{
    private static final int ACCESS_SHAPE = 0x0001 | 0x0002 | 0x0004 | 0x0008
        | 0x0010 | 0x0200 | 0x0400 | 0x2000 | 0x4000;

    private SemanticUpdater()
    {
    }

    static Result update(Path oldJar, Path newJar, SemanticMap oldMap, String revision)
        throws IOException
    {
        return update(oldJar, newJar, oldMap, revision, Collections.emptyMap());
    }

    static Result update(Path oldJar, Path newJar, SemanticMap oldMap, String revision,
                         Map<String, SemanticOverrides.Override> overrides) throws IOException
    {
        String actualOldHash = Hashing.sha256(oldJar);
        String expectedOldHash = oldMap.metadata().get("input.sha256");
        if (expectedOldHash == null || !expectedOldHash.equals(actualOldHash))
        {
            throw new IOException("old map input.sha256 does not match " + oldJar);
        }

        Map<String, ClassNode> oldClasses = classes(JarArchive.read(oldJar));
        Map<String, ClassNode> newClasses = classes(JarArchive.read(newJar));
        boolean reset = isReset(oldClasses, newClasses);
        Map<String, String> classMatches = matchClasses(oldClasses, newClasses, reset);
        List<String> failures = new ArrayList<>();
        List<SemanticMap.Entry> entries = new ArrayList<>();
        Set<String> unusedOverrides = new TreeSet<>(overrides.keySet());

        // A reviewed class transition is also the owner transition for its members.
        for (SemanticMap.Entry entry : oldMap.entries())
        {
            SemanticOverrides.Override override = overrides.get(entry.key());
            if (entry.kind.equals("class") && override != null && !override.drop
                && validateOverride(entry.kind, override, newClasses) == null)
            {
                classMatches.put(entry.owner, override.owner);
            }
        }
        Map<String, Member> referencedMembers = reset
            ? matchLockstepMembers(oldClasses, newClasses, classMatches) : Collections.emptyMap();

        for (SemanticMap.Entry entry : oldMap.entries())
        {
            SemanticOverrides.Override override = overrides.get(entry.key());
            if (override != null)
            {
                unusedOverrides.remove(entry.key());
                if (!override.drop)
                {
                    String problem = validateOverride(entry.kind, override, newClasses);
                    if (problem == null)
                    {
                        entries.add(new SemanticMap.Entry(entry.kind, override.owner, override.name,
                            override.descriptor, entry.semantic));
                    }
                    else
                    {
                        failures.add(problem + " for " + entry.key());
                    }
                }
                continue;
            }
            String newOwner = classMatches.get(entry.owner);
            if (newOwner == null)
            {
                failures.add("unmatched class " + entry.owner + " (" + entry.semantic + ")");
                continue;
            }
            if (entry.kind.equals("class"))
            {
                entries.add(new SemanticMap.Entry("class", newOwner, "-", "-", entry.semantic));
                continue;
            }
            ClassNode oldClass = oldClasses.get(entry.owner);
            ClassNode newClass = newClasses.get(newOwner);
            Member target = referencedMembers.get(entry.key());
            if (target == null && !reset)
            {
                target = entry.kind.equals("field")
                    ? matchField(entry, oldClass, newClass, classMatches)
                    : matchMethod(entry, oldClass, newClass, classMatches);
            }
            if (target == null)
            {
                failures.add("unmatched or ambiguous " + entry.kind + " " + entry.owner + "."
                    + entry.name + entry.descriptor + " (" + entry.semantic + ")");
                continue;
            }
            entries.add(new SemanticMap.Entry(entry.kind, newOwner, target.name,
                target.descriptor, entry.semantic));
        }
        for (String key : unusedOverrides)
        {
            failures.add("override does not name an old semantic entry: " + key);
        }
        Set<String> targets = new TreeSet<>();
        for (SemanticMap.Entry entry : entries)
        {
            if (!targets.add(entry.key()))
            {
                failures.add("multiple semantic entries target " + entry.key());
            }
        }

        if (!failures.isEmpty())
        {
            return new Result(null, Collections.unmodifiableList(failures), classMatches.size());
        }
        Map<String, String> metadata = new LinkedHashMap<>();
        metadata.put("format", SemanticMap.FORMAT);
        if (revision != null)
        {
            metadata.put("revision", revision);
        }
        metadata.put("input.sha256", Hashing.sha256(newJar));
        metadata.put("parent.sha256", actualOldHash);
        String parentSource = oldMap.metadata().get("source");
        metadata.put("source", parentSource == null ? "structural-update"
            : "structural-update(" + parentSource + ")");
        for (Map.Entry<String, String> source : oldMap.metadata().entrySet())
        {
            if (source.getKey().startsWith("source."))
            {
                metadata.put(source.getKey(), source.getValue());
            }
        }
        return new Result(new SemanticMap(metadata, entries), Collections.emptyList(),
            classMatches.size());
    }

    private static String validateOverride(String kind, SemanticOverrides.Override override,
                                           Map<String, ClassNode> newClasses)
    {
        ClassNode owner = newClasses.get(override.owner);
        if (owner == null)
        {
            return "override target class does not exist: " + override.owner;
        }
        if (kind.equals("class"))
        {
            return override.name.equals("-") && override.descriptor.equals("-") ? null
                : "class override target requires '-' name and descriptor";
        }
        if (kind.equals("field"))
        {
            return owner.fields.stream().anyMatch(field -> field.name.equals(override.name)
                && field.desc.equals(override.descriptor)) ? null : "override target field does not exist";
        }
        return owner.methods.stream().anyMatch(method -> method.name.equals(override.name)
            && method.desc.equals(override.descriptor)) ? null : "override target method does not exist";
    }

    private static Map<String, ClassNode> classes(JarArchive archive)
    {
        Map<String, ClassNode> classes = new TreeMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            classes.put(unit.getNode().name, unit.getNode());
        }
        return classes;
    }

    private static Map<String, String> matchClasses(Map<String, ClassNode> oldClasses,
                                                     Map<String, ClassNode> newClasses)
    {
        return matchClasses(oldClasses, newClasses, isReset(oldClasses, newClasses));
    }

    private static Map<String, String> matchClasses(Map<String, ClassNode> oldClasses,
        Map<String, ClassNode> newClasses, boolean reset)
    {
        Map<String, String> matches = new TreeMap<>();
        Set<String> used = new LinkedHashSet<>();
        if (reset)
        {
            matchExternalInterfaces(oldClasses, newClasses, matches, used);
            matchExternalHierarchy(oldClasses, newClasses, matches, used);
            while (matchResetGraph(oldClasses, newClasses, matches, used) > 0)
            {
                // Each reciprocal match exposes more authoritative type relationships.
            }
            return matches;
        }
        matchExternalInterfaces(oldClasses, newClasses, matches, used);
        matchStablePublicMethods(oldClasses, newClasses, matches, used);
        while (matchLockstepReferences(oldClasses, newClasses, matches, used) > 0)
        {
            // Newly anchored owners make more descriptors and instruction references exact.
        }
        // Unchanged identities are useful anchors, but only when the complete structural key agrees.
        for (Map.Entry<String, ClassNode> old : oldClasses.entrySet())
        {
            ClassNode candidate = newClasses.get(old.getKey());
            if (!matches.containsKey(old.getKey()) && !used.contains(old.getKey())
                && candidate != null && classKey(old.getValue(), Collections.emptyMap(), false)
                .equals(classKey(candidate, Collections.emptyMap(), true)))
            {
                matches.put(old.getKey(), old.getKey());
                used.add(old.getKey());
            }
        }
        AdjacentClassAnchors.add(oldClasses, newClasses, matches, used);

        int previous;
        do
        {
            previous = matches.size();
            matchUnique(oldClasses, newClasses, matches, used, 2);
            matchUnique(oldClasses, newClasses, matches, used, 1);
            matchUnique(oldClasses, newClasses, matches, used, 0);
            matchUnique(oldClasses, newClasses, matches, used, -1);
            matchSimilar(oldClasses, newClasses, matches, used);
        }
        while (matches.size() > previous);
        return matches;
    }

    private static boolean isReset(Map<String, ClassNode> oldClasses,
                                   Map<String, ClassNode> newClasses)
    {
        Map<String, String> stable = new TreeMap<>();
        Set<String> used = new LinkedHashSet<>();
        int count = AdjacentClassAnchors.add(oldClasses, newClasses, stable, used);
        return count * 2 < Math.min(oldClasses.size(), newClasses.size());
    }

    private static void matchExternalInterfaces(Map<String, ClassNode> oldClasses,
                                                Map<String, ClassNode> newClasses,
                                                Map<String, String> matches, Set<String> used)
    {
        Map<String, List<String>> oldByInterfaces = new TreeMap<>();
        Map<String, List<String>> newByInterfaces = new TreeMap<>();
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            String key = externalInterfaces(entry.getValue());
            if (!key.isEmpty())
            {
                add(oldByInterfaces, key, entry.getKey());
            }
        }
        for (Map.Entry<String, ClassNode> entry : newClasses.entrySet())
        {
            String key = externalInterfaces(entry.getValue());
            if (!key.isEmpty())
            {
                add(newByInterfaces, key, entry.getKey());
            }
        }
        for (Map.Entry<String, List<String>> entry : oldByInterfaces.entrySet())
        {
            List<String> targets = newByInterfaces.get(entry.getKey());
            if (entry.getValue().size() == 1 && targets != null && targets.size() == 1)
            {
                matches.put(entry.getValue().get(0), targets.get(0));
                used.add(targets.get(0));
            }
        }
    }

    private static String externalInterfaces(ClassNode node)
    {
        List<String> interfaces = new ArrayList<>();
        for (String name : node.interfaces)
        {
            if (isExternal(name))
            {
                interfaces.add(name);
            }
        }
        Collections.sort(interfaces);
        return String.join(";", interfaces);
    }

    private static void matchExternalHierarchy(Map<String, ClassNode> oldClasses,
                                               Map<String, ClassNode> newClasses,
                                               Map<String, String> matches, Set<String> used)
    {
        matchUniqueKeys(oldClasses, newClasses, matches, used,
            node -> externalHierarchy(node), node -> externalHierarchy(node));
    }

    private static String externalHierarchy(ClassNode node)
    {
        String parent = node.superName != null && !node.superName.equals("java/lang/Object")
            && isExternal(node.superName) ? node.superName : "";
        String interfaces = externalInterfaces(node);
        return parent.isEmpty() && interfaces.isEmpty() ? "" : "S" + parent + "|I" + interfaces;
    }

    private static int matchResetGraph(Map<String, ClassNode> oldClasses,
                                       Map<String, ClassNode> newClasses,
                                       Map<String, String> matches, Set<String> used)
    {
        Map<String, String> inverse = invert(matches);
        return matchUniqueKeys(oldClasses, newClasses, matches, used,
            node -> resetGraphKey(node, matches, false),
            node -> resetGraphKey(node, inverse, true));
    }

    private static int matchUniqueKeys(Map<String, ClassNode> oldClasses,
                                       Map<String, ClassNode> newClasses,
                                       Map<String, String> matches, Set<String> used,
                                       java.util.function.Function<ClassNode, String> oldKey,
                                       java.util.function.Function<ClassNode, String> newKey)
    {
        Map<String, List<String>> oldByKey = new TreeMap<>();
        Map<String, List<String>> newByKey = new TreeMap<>();
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            if (!matches.containsKey(entry.getKey()))
            {
                String key = oldKey.apply(entry.getValue());
                if (!key.isEmpty()) add(oldByKey, key, entry.getKey());
            }
        }
        for (Map.Entry<String, ClassNode> entry : newClasses.entrySet())
        {
            if (!used.contains(entry.getKey()))
            {
                String key = newKey.apply(entry.getValue());
                if (!key.isEmpty()) add(newByKey, key, entry.getKey());
            }
        }
        int added = 0;
        for (Map.Entry<String, List<String>> entry : oldByKey.entrySet())
        {
            List<String> targets = newByKey.get(entry.getKey());
            if (entry.getValue().size() == 1 && targets != null && targets.size() == 1)
            {
                matches.put(entry.getValue().get(0), targets.get(0));
                used.add(targets.get(0));
                added++;
            }
        }
        return added;
    }

    private static String resetGraphKey(ClassNode node, Map<String, String> known,
                                        boolean targetSide)
    {
        List<String> relations = new ArrayList<>();
        Set<String> anchors = new TreeSet<>();
        addResetType(relations, anchors, "S", node.superName, known, targetSide);
        for (String name : node.interfaces)
        {
            addResetType(relations, anchors, "I", name, known, targetSide);
        }
        for (FieldNode field : node.fields)
        {
            addResetDescriptor(relations, anchors, "F" + (field.access & ACCESS_SHAPE) + "D",
                field.desc, known, targetSide);
        }
        for (MethodNode method : node.methods)
        {
            String context = (method.access & ACCESS_SHAPE) + ":"
                + (method.name.length() > 3 && !method.name.startsWith("<") ? method.name : "_")
                + ":";
            addResetDescriptor(relations, anchors, "M" + context, method.desc, known, targetSide);
            for (AbstractInsnNode instruction : method.instructions)
            {
                String owner = null;
                String descriptor = null;
                String kind = null;
                if (instruction instanceof FieldInsnNode)
                {
                    FieldInsnNode field = (FieldInsnNode) instruction;
                    owner = field.owner;
                    descriptor = field.desc;
                    kind = "F";
                }
                else if (instruction instanceof MethodInsnNode)
                {
                    MethodInsnNode called = (MethodInsnNode) instruction;
                    owner = called.owner;
                    descriptor = called.desc;
                    kind = "C";
                }
                else if (instruction instanceof TypeInsnNode)
                {
                    owner = ((TypeInsnNode) instruction).desc;
                    kind = "T";
                }
                if (owner != null)
                {
                    addResetType(relations, anchors,
                        "B" + context + kind + instruction.getOpcode() + ":",
                        owner, known, targetSide);
                }
                if (descriptor != null)
                {
                    addResetDescriptor(relations, anchors,
                        "Q" + context + kind + instruction.getOpcode() + ":",
                        descriptor, known, targetSide);
                }
            }
        }
        if (anchors.isEmpty())
        {
            return "";
        }
        Collections.sort(relations);
        return (node.access & ACCESS_SHAPE) + "|" + relations;
    }

    private static void addResetDescriptor(List<String> relations, Set<String> anchors,
                                           String prefix, String descriptor,
                                           Map<String, String> known, boolean targetSide)
    {
        Type type = Type.getType(descriptor);
        if (type.getSort() == Type.METHOD)
        {
            Type[] arguments = type.getArgumentTypes();
            for (int index = 0; index < arguments.length; index++)
            {
                addResetType(relations, anchors, prefix + "A" + index,
                    arguments[index], known, targetSide);
            }
            addResetType(relations, anchors, prefix + "R", type.getReturnType(), known, targetSide);
        }
        else
        {
            addResetType(relations, anchors, prefix, type, known, targetSide);
        }
    }

    private static void addResetType(List<String> relations, Set<String> anchors, String prefix,
                                     String name, Map<String, String> known, boolean targetSide)
    {
        String key = typeNameKey(name, known, targetSide);
        if (!key.equals("@") && !key.equals("-"))
        {
            relations.add(prefix + key);
            if (key.startsWith("#")) anchors.add(key);
        }
    }

    private static void addResetType(List<String> relations, Set<String> anchors, String prefix,
                                     Type type, Map<String, String> known, boolean targetSide)
    {
        while (type.getSort() == Type.ARRAY)
        {
            type = type.getElementType();
        }
        if (type.getSort() == Type.OBJECT)
        {
            addResetType(relations, anchors, prefix, type.getInternalName(), known, targetSide);
        }
    }

    private static void matchStablePublicMethods(Map<String, ClassNode> oldClasses,
                                                 Map<String, ClassNode> newClasses,
                                                 Map<String, String> matches, Set<String> used)
    {
        Map<String, List<String>> oldByMethods = new TreeMap<>();
        Map<String, List<String>> newByMethods = new TreeMap<>();
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            String key = stablePublicMethods(entry.getValue());
            if (!key.isEmpty())
            {
                add(oldByMethods, key, entry.getKey());
            }
        }
        for (Map.Entry<String, ClassNode> entry : newClasses.entrySet())
        {
            String key = stablePublicMethods(entry.getValue());
            if (!key.isEmpty())
            {
                add(newByMethods, key, entry.getKey());
            }
        }
        for (Map.Entry<String, List<String>> entry : oldByMethods.entrySet())
        {
            List<String> targets = newByMethods.get(entry.getKey());
            String source = entry.getValue().get(0);
            if (entry.getValue().size() != 1 || targets == null || targets.size() != 1)
            {
                continue;
            }
            String target = targets.get(0);
            String previous = matches.get(source);
            if ((previous != null && !previous.equals(target))
                || (previous == null && used.contains(target)))
            {
                continue;
            }
            else if (previous == null)
            {
                matches.put(source, target);
                used.add(target);
            }
        }
    }

    private static String stablePublicMethods(ClassNode node)
    {
        List<String> methods = new ArrayList<>();
        for (MethodNode method : node.methods)
        {
            if ((method.access & 0x0001) != 0 && !method.name.startsWith("<")
                && method.name.length() > 3)
            {
                methods.add(method.name + descriptorKey(method.desc, Collections.emptyMap(), false));
            }
        }
        Collections.sort(methods);
        return String.join(";", methods);
    }

    private static int matchLockstepReferences(Map<String, ClassNode> oldClasses,
                                               Map<String, ClassNode> newClasses,
                                               Map<String, String> matches, Set<String> used)
    {
        Map<String, String> inverse = invert(matches);
        Map<String, Map<String, Integer>> forward = new TreeMap<>();
        Map<String, Map<String, Integer>> reverse = new TreeMap<>();
        for (Map.Entry<String, String> classMatch : new ArrayList<>(matches.entrySet()))
        {
            ClassNode oldClass = oldClasses.get(classMatch.getKey());
            ClassNode newClass = newClasses.get(classMatch.getValue());
            Map<String, List<MethodNode>> oldMethods = methodsByLockstepKey(oldClass, matches, false);
            Map<String, List<MethodNode>> newMethods = methodsByLockstepKey(newClass, inverse, true);
            for (Map.Entry<String, List<MethodNode>> entry : oldMethods.entrySet())
            {
                List<MethodNode> targets = newMethods.get(entry.getKey());
                if (entry.getValue().size() != 1 || targets == null || targets.size() != 1)
                {
                    continue;
                }
                collectAlignedOwners(entry.getValue().get(0), targets.get(0), oldClasses,
                    newClasses, matches, forward, reverse);
            }
        }

        int added = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : forward.entrySet())
        {
            if (entry.getValue().size() != 1)
            {
                continue;
            }
            Map.Entry<String, Integer> proposal = entry.getValue().entrySet().iterator().next();
            String target = proposal.getKey();
            Map<String, Integer> sources = reverse.get(target);
            // ponytail: three aligned references is the conservative reset floor; add scored
            // graph evidence only if reviewed transitions prove this leaves needed coverage.
            if (proposal.getValue() >= 3 && sources != null && sources.size() == 1
                && !used.contains(target))
            {
                matches.put(entry.getKey(), target);
                used.add(target);
                added++;
            }
        }
        return added;
    }

    private static Map<String, List<MethodNode>> methodsByLockstepKey(ClassNode node,
        Map<String, String> known, boolean targetSide)
    {
        Map<String, List<MethodNode>> methods = new TreeMap<>();
        for (MethodNode method : node.methods)
        {
            String key = (method.access & ACCESS_SHAPE) + ":" + special(method.name) + ":"
                + descriptorKey(method.desc, known, targetSide) + ":"
                + bodyKey(method, known, targetSide);
            methods.computeIfAbsent(key, ignored -> new ArrayList<>()).add(method);
        }
        return methods;
    }

    private static void collectAlignedOwners(MethodNode oldMethod, MethodNode newMethod,
        Map<String, ClassNode> oldClasses, Map<String, ClassNode> newClasses,
        Map<String, String> matches,
        Map<String, Map<String, Integer>> forward,
        Map<String, Map<String, Integer>> reverse)
    {
        AbstractInsnNode[] oldInstructions = executable(oldMethod);
        AbstractInsnNode[] newInstructions = executable(newMethod);
        if (oldInstructions.length != newInstructions.length)
        {
            return;
        }
        for (int index = 0; index < oldInstructions.length; index++)
        {
            AbstractInsnNode oldInstruction = oldInstructions[index];
            AbstractInsnNode newInstruction = newInstructions[index];
            if (oldInstruction.getOpcode() != newInstruction.getOpcode())
            {
                return;
            }
            String oldOwner = referencedOwner(oldInstruction);
            String newOwner = referencedOwner(newInstruction);
            if (oldOwner != null && newOwner != null && oldClasses.containsKey(oldOwner)
                && newClasses.containsKey(newOwner) && !matches.containsKey(oldOwner))
            {
                forward.computeIfAbsent(oldOwner, ignored -> new TreeMap<>())
                    .merge(newOwner, 1, Integer::sum);
                reverse.computeIfAbsent(newOwner, ignored -> new TreeMap<>())
                    .merge(oldOwner, 1, Integer::sum);
            }
        }
    }

    private static AbstractInsnNode[] executable(MethodNode method)
    {
        List<AbstractInsnNode> instructions = new ArrayList<>();
        for (AbstractInsnNode instruction : method.instructions)
        {
            if (instruction.getOpcode() >= 0)
            {
                instructions.add(instruction);
            }
        }
        return instructions.toArray(new AbstractInsnNode[0]);
    }

    private static String referencedOwner(AbstractInsnNode instruction)
    {
        if (instruction instanceof FieldInsnNode)
        {
            return ((FieldInsnNode) instruction).owner;
        }
        if (instruction instanceof MethodInsnNode)
        {
            return ((MethodInsnNode) instruction).owner;
        }
        if (instruction instanceof TypeInsnNode)
        {
            String descriptor = ((TypeInsnNode) instruction).desc;
            return descriptor.startsWith("[") ? null : descriptor;
        }
        return null;
    }

    private static Map<String, Member> matchLockstepMembers(Map<String, ClassNode> oldClasses,
        Map<String, ClassNode> newClasses, Map<String, String> matches)
    {
        Map<String, String> inverse = invert(matches);
        Map<String, Map<String, Integer>> forward = new TreeMap<>();
        Map<String, Map<String, Integer>> reverse = new TreeMap<>();
        Map<String, Member> targets = new HashMap<>();
        for (Map.Entry<String, String> classMatch : matches.entrySet())
        {
            ClassNode oldClass = oldClasses.get(classMatch.getKey());
            ClassNode newClass = newClasses.get(classMatch.getValue());
            Map<String, List<MethodNode>> oldMethods = methodsByLockstepKey(oldClass, matches, false);
            Map<String, List<MethodNode>> newMethods = methodsByLockstepKey(newClass, inverse, true);
            for (Map.Entry<String, List<MethodNode>> entry : oldMethods.entrySet())
            {
                List<MethodNode> candidates = newMethods.get(entry.getKey());
                if (entry.getValue().size() == 1 && candidates != null && candidates.size() == 1
                    && (entry.getValue().get(0).access & 0x0001) != 0
                    && !entry.getValue().get(0).name.startsWith("<")
                    && entry.getValue().get(0).name.length() > 3
                    && entry.getValue().get(0).name.equals(candidates.get(0).name))
                {
                    collectAlignedMembers(entry.getValue().get(0), candidates.get(0), matches,
                        inverse, forward, reverse, targets);
                }
            }
        }

        Map<String, Member> members = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : forward.entrySet())
        {
            if (entry.getValue().size() == 1)
            {
                Map.Entry<String, Integer> proposal = entry.getValue().entrySet().iterator().next();
                String target = proposal.getKey();
                Map<String, Integer> sources = reverse.get(target);
                int minimum = entry.getKey().startsWith("method\t") ? 1 : 2;
                if (proposal.getValue() >= minimum && sources != null && sources.size() == 1)
                {
                    members.put(entry.getKey(), targets.get(target));
                }
            }
        }
        return members;
    }

    private static void collectAlignedMembers(MethodNode oldMethod, MethodNode newMethod,
        Map<String, String> matches, Map<String, String> inverse,
        Map<String, Map<String, Integer>> forward,
        Map<String, Map<String, Integer>> reverse,
        Map<String, Member> targets)
    {
        AbstractInsnNode[] oldInstructions = executable(oldMethod);
        AbstractInsnNode[] newInstructions = executable(newMethod);
        if (oldInstructions.length != newInstructions.length)
        {
            return;
        }
        for (int index = 0; index < oldInstructions.length; index++)
        {
            if (oldInstructions[index].getOpcode() != newInstructions[index].getOpcode())
            {
                return;
            }
        }
        Map<String, Set<String>> observations = new HashMap<>();
        for (int index = 0; index < oldInstructions.length; index++)
        {
            String kind;
            String oldOwner;
            String oldName;
            String oldDescriptor;
            String newOwner;
            String newName;
            String newDescriptor;
            if (oldInstructions[index] instanceof FieldInsnNode
                && newInstructions[index] instanceof FieldInsnNode)
            {
                FieldInsnNode oldField = (FieldInsnNode) oldInstructions[index];
                FieldInsnNode newField = (FieldInsnNode) newInstructions[index];
                kind = "field";
                oldOwner = oldField.owner;
                oldName = oldField.name;
                oldDescriptor = oldField.desc;
                newOwner = newField.owner;
                newName = newField.name;
                newDescriptor = newField.desc;
            }
            else if (oldInstructions[index] instanceof MethodInsnNode
                && newInstructions[index] instanceof MethodInsnNode)
            {
                MethodInsnNode oldCall = (MethodInsnNode) oldInstructions[index];
                MethodInsnNode newCall = (MethodInsnNode) newInstructions[index];
                kind = "method";
                oldOwner = oldCall.owner;
                oldName = oldCall.name;
                oldDescriptor = oldCall.desc;
                newOwner = newCall.owner;
                newName = newCall.name;
                newDescriptor = newCall.desc;
            }
            else
            {
                continue;
            }
            if (!newOwner.equals(matches.get(oldOwner))
                || !descriptorKey(oldDescriptor, matches, false)
                .equals(descriptorKey(newDescriptor, inverse, true)))
            {
                continue;
            }
            String source = memberKey(kind, oldOwner, oldName, oldDescriptor);
            String target = memberKey(kind, newOwner, newName, newDescriptor);
            observations.computeIfAbsent(source, ignored -> new TreeSet<>()).add(target);
            targets.put(target, new Member(newName, newDescriptor));
        }
        for (Map.Entry<String, Set<String>> observation : observations.entrySet())
        {
            for (String target : observation.getValue())
            {
                forward.computeIfAbsent(observation.getKey(), ignored -> new TreeMap<>())
                    .merge(target, 1, Integer::sum);
                reverse.computeIfAbsent(target, ignored -> new TreeMap<>())
                    .merge(observation.getKey(), 1, Integer::sum);
            }
        }
    }

    private static String memberKey(String kind, String owner, String name, String descriptor)
    {
        return kind + "\t" + owner + "\t" + name + "\t" + descriptor;
    }

    private static void matchSimilar(Map<String, ClassNode> oldClasses,
                                     Map<String, ClassNode> newClasses,
                                     Map<String, String> matches, Set<String> used)
    {
        Map<String, String> inverse = invert(matches);
        Map<String, Features> oldFeatures = new TreeMap<>();
        Map<String, Features> newFeatures = new TreeMap<>();
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            if (!matches.containsKey(entry.getKey())) oldFeatures.put(entry.getKey(), new Features(entry.getValue()));
        }
        for (Map.Entry<String, ClassNode> entry : newClasses.entrySet())
        {
            if (!used.contains(entry.getKey())) newFeatures.put(entry.getKey(), new Features(entry.getValue()));
        }

        Map<String, Best> oldBest = new TreeMap<>();
        Map<String, Best> newBest = new TreeMap<>();
        // ponytail: O(n^2) is simpler and fast for ~700 client classes; index features if this grows.
        for (Map.Entry<String, Features> old : oldFeatures.entrySet())
        {
            for (Map.Entry<String, Features> target : newFeatures.entrySet())
            {
                double score = similarity(old.getValue(), target.getValue(), matches, inverse);
                oldBest.computeIfAbsent(old.getKey(), ignored -> new Best()).consider(target.getKey(), score);
                newBest.computeIfAbsent(target.getKey(), ignored -> new Best()).consider(old.getKey(), score);
            }
        }
        for (Map.Entry<String, Best> entry : oldBest.entrySet())
        {
            Best forward = entry.getValue();
            Best reverse = newBest.get(forward.name);
            if (forward.confident() && reverse != null && reverse.confident()
                && entry.getKey().equals(reverse.name))
            {
                matches.put(entry.getKey(), forward.name);
                used.add(forward.name);
            }
        }
    }

    private static double similarity(Features old, Features target,
                                     Map<String, String> matches, Map<String, String> inverse)
    {
        if (!old.externalInterfaces.equals(target.externalInterfaces))
        {
            return 0;
        }
        String oldSuper = old.node.superName == null ? null : matches.get(old.node.superName);
        String targetSuper = target.node.superName == null ? null : inverse.get(target.node.superName);
        if (oldSuper != null && targetSuper != null && !old.node.superName.equals(targetSuper))
        {
            return 0;
        }
        double hierarchy = (old.node.access & ACCESS_SHAPE) == (target.node.access & ACCESS_SHAPE)
            ? 1 : 0;
        return .30 * dice(old.methods, target.methods)
            + .25 * dice(old.fields, target.fields)
            + .20 * dice(old.opcodes, target.opcodes)
            + .15 * dice(old.strings, target.strings)
            + .10 * hierarchy;
    }

    private static double dice(Map<?, Integer> left, Map<?, Integer> right)
    {
        int leftSize = left.values().stream().mapToInt(Integer::intValue).sum();
        int rightSize = right.values().stream().mapToInt(Integer::intValue).sum();
        if (leftSize + rightSize == 0)
        {
            return 1;
        }
        int shared = 0;
        for (Map.Entry<?, Integer> entry : left.entrySet())
        {
            Integer other = right.get(entry.getKey());
            shared += Math.min(entry.getValue(), other == null ? 0 : other);
        }
        return 2.0 * shared / (leftSize + rightSize);
    }

    private static void count(Map<Object, Integer> counts, Object value)
    {
        counts.merge(value, 1, Integer::sum);
    }

    private static void matchUnique(Map<String, ClassNode> oldClasses,
                                    Map<String, ClassNode> newClasses,
                                    Map<String, String> matches, Set<String> used, int strength)
    {
        Map<String, String> inverse = invert(matches);
        Map<String, List<String>> oldByKey = new TreeMap<>();
        Map<String, List<String>> newByKey = new TreeMap<>();
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            if (!matches.containsKey(entry.getKey()))
            {
                add(oldByKey, strength < 0 ? legacyClassKey(entry.getValue(), matches, false)
                    : classShapeKey(entry.getValue(), matches, false, strength), entry.getKey());
            }
        }
        for (Map.Entry<String, ClassNode> entry : newClasses.entrySet())
        {
            if (!used.contains(entry.getKey()))
            {
                add(newByKey, strength < 0 ? legacyClassKey(entry.getValue(), inverse, true)
                    : classShapeKey(entry.getValue(), inverse, true, strength), entry.getKey());
            }
        }
        for (Map.Entry<String, List<String>> entry : oldByKey.entrySet())
        {
            List<String> targets = newByKey.get(entry.getKey());
            if (entry.getValue().size() == 1 && targets != null && targets.size() == 1)
            {
                matches.put(entry.getValue().get(0), targets.get(0));
                used.add(targets.get(0));
            }
        }
    }

    private static String classKey(ClassNode node, Map<String, String> known, boolean targetSide)
    {
        return classShapeKey(node, known, targetSide, 2);
    }

    private static String classShapeKey(ClassNode node, Map<String, String> known,
                                        boolean targetSide, int strength)
    {
        List<String> fields = new ArrayList<>();
        for (FieldNode field : node.fields)
        {
            fields.add((field.access & ACCESS_SHAPE) + ":" + descriptorKey(field.desc, known, targetSide));
        }
        Collections.sort(fields);
        List<String> methods = new ArrayList<>();
        for (MethodNode method : node.methods)
        {
            if (method.name.startsWith("<"))
            {
                continue;
            }
            String body = strength == 2 ? bodyKey(method, known, targetSide)
                : strength == 1 ? opcodeKey(method) : countKey(method);
            methods.add((method.access & ACCESS_SHAPE) + ":" + special(method.name) + ":"
                + descriptorKey(method.desc, known, targetSide) + ":" + body);
        }
        Collections.sort(methods);
        List<String> interfaces = new ArrayList<>();
        for (String name : node.interfaces)
        {
            interfaces.add(typeNameKey(name, known, targetSide));
        }
        Collections.sort(interfaces);
        return (node.access & ACCESS_SHAPE) + "|S" + typeNameKey(node.superName, known, targetSide)
            + "|I" + interfaces + "|F" + fields + "|M" + methods;
    }

    private static String legacyClassKey(ClassNode node, Map<String, String> known,
                                         boolean targetSide)
    {
        List<String> fields = new ArrayList<>();
        for (FieldNode field : node.fields)
        {
            fields.add((field.access & 0x1f) + ":" + PayloadExtractor.normalizeTypeDesc(field.desc));
        }
        Collections.sort(fields);
        List<String> methods = new ArrayList<>();
        for (MethodNode method : node.methods)
        {
            if (!method.name.startsWith("<"))
            {
                methods.add((method.access & 0x1f) + ":"
                    + PayloadExtractor.normalizeDescriptor(method.desc) + ":" + countKey(method));
            }
        }
        Collections.sort(methods);
        List<String> interfaces = new ArrayList<>();
        for (String name : node.interfaces)
        {
            interfaces.add(typeNameKey(name, known, targetSide));
        }
        Collections.sort(interfaces);
        return "S" + typeNameKey(node.superName, known, targetSide) + "|I" + interfaces
            + "|F" + fields + "|M" + methods;
    }

    private static Member matchField(SemanticMap.Entry entry, ClassNode oldClass,
                                     ClassNode newClass, Map<String, String> classes)
    {
        if (oldClass == null || newClass == null)
        {
            return null;
        }
        FieldNode source = null;
        for (FieldNode field : oldClass.fields)
        {
            if (field.name.equals(entry.name) && field.desc.equals(entry.descriptor))
            {
                source = field;
                break;
            }
        }
        if (source == null)
        {
            return null;
        }
        String named = SemanticSeedExtractor.annotationValue(source,
            NamedAnnotationStripper.NAMED_DESCRIPTOR, "value");
        if (entry.semantic.equals(named))
        {
            List<FieldNode> namedTargets = newClass.fields.stream()
                .filter(field -> named.equals(SemanticSeedExtractor.annotationValue(field,
                    NamedAnnotationStripper.NAMED_DESCRIPTOR, "value")))
                .toList();
            if (namedTargets.size() == 1)
            {
                FieldNode target = namedTargets.get(0);
                return new Member(target.name, target.desc);
            }
            if (!namedTargets.isEmpty())
            {
                return null;
            }
        }
        if (entry.owner.equals(newClass.name))
        {
            for (FieldNode field : newClass.fields)
            {
                if (field.name.equals(entry.name) && field.desc.equals(entry.descriptor)
                    && (field.access & ACCESS_SHAPE) == (source.access & ACCESS_SHAPE))
                {
                    return new Member(field.name, field.desc);
                }
            }
        }
        String key = (source.access & ACCESS_SHAPE) + ":"
            + descriptorKey(source.desc, classes, false) + ":" + constantKey(source.value);
        List<FieldNode> candidates = new ArrayList<>();
        Map<String, String> inverse = invert(classes);
        for (FieldNode field : newClass.fields)
        {
            String candidateKey = (field.access & ACCESS_SHAPE) + ":"
                + descriptorKey(field.desc, inverse, true) + ":" + constantKey(field.value);
            if (key.equals(candidateKey))
            {
                candidates.add(field);
            }
        }
        FieldNode target = uniqueOrStable(entry.name, candidates, entry.owner.equals(newClass.name));
        return target == null ? null : new Member(target.name, target.desc);
    }

    private static Member matchMethod(SemanticMap.Entry entry, ClassNode oldClass,
                                      ClassNode newClass, Map<String, String> classes)
    {
        if (oldClass == null || newClass == null)
        {
            return null;
        }
        MethodNode source = null;
        for (MethodNode method : oldClass.methods)
        {
            if (method.name.equals(entry.name) && method.desc.equals(entry.descriptor))
            {
                source = method;
                break;
            }
        }
        if (source == null)
        {
            return null;
        }
        if (entry.owner.equals(newClass.name))
        {
            for (MethodNode method : newClass.methods)
            {
                if (method.name.equals(entry.name) && method.desc.equals(entry.descriptor)
                    && (method.access & ACCESS_SHAPE) == (source.access & ACCESS_SHAPE))
                {
                    return new Member(method.name, method.desc);
                }
            }
        }
        String key = methodKey(source, classes, false);
        List<MethodNode> candidates = new ArrayList<>();
        Map<String, String> inverse = invert(classes);
        for (MethodNode method : newClass.methods)
        {
            if (key.equals(methodKey(method, inverse, true)))
            {
                candidates.add(method);
            }
        }
        MethodNode target = uniqueOrStable(entry.name, candidates, entry.owner.equals(newClass.name));
        if (target == null)
        {
            String opcodeKey = (source.access & ACCESS_SHAPE) + ":" + special(source.name) + ":"
                + descriptorKey(source.desc, classes, false) + ":" + opcodeKey(source);
            candidates.clear();
            for (MethodNode method : newClass.methods)
            {
                String candidate = (method.access & ACCESS_SHAPE) + ":" + special(method.name) + ":"
                    + descriptorKey(method.desc, inverse, true) + ":" + opcodeKey(method);
                if (opcodeKey.equals(candidate))
                {
                    candidates.add(method);
                }
            }
            target = uniqueOrStable(entry.name, candidates, entry.owner.equals(newClass.name));
        }
        if (target == null)
        {
            String shape = (source.access & ACCESS_SHAPE) + ":" + special(source.name) + ":"
                + descriptorKey(source.desc, classes, false);
            candidates.clear();
            for (MethodNode method : newClass.methods)
            {
                String candidate = (method.access & ACCESS_SHAPE) + ":" + special(method.name) + ":"
                    + descriptorKey(method.desc, inverse, true);
                if (shape.equals(candidate))
                {
                    candidates.add(method);
                }
            }
            target = uniqueOrStable(entry.name, candidates, entry.owner.equals(newClass.name));
        }
        return target == null ? null : new Member(target.name, target.desc);
    }

    private static String methodKey(MethodNode method, Map<String, String> known, boolean targetSide)
    {
        return (method.access & ACCESS_SHAPE) + ":" + special(method.name) + ":"
            + descriptorKey(method.desc, known, targetSide) + ":" + bodyKey(method, known, targetSide);
    }

    private static <T> T uniqueOrStable(String oldName, List<T> candidates, boolean sameOwner)
    {
        if (candidates.size() == 1)
        {
            return candidates.get(0);
        }
        if (!sameOwner)
        {
            return null;
        }
        T stable = null;
        for (T candidate : candidates)
        {
            String name = candidate instanceof FieldNode
                ? ((FieldNode) candidate).name : ((MethodNode) candidate).name;
            if (name.equals(oldName))
            {
                if (stable != null)
                {
                    return null;
                }
                stable = candidate;
            }
        }
        return stable;
    }

    private static String opcodeKey(MethodNode method)
    {
        StringBuilder out = new StringBuilder();
        for (AbstractInsnNode instruction : method.instructions)
        {
            if (instruction.getOpcode() >= 0)
            {
                out.append(instruction.getOpcode()).append(',');
            }
        }
        return out.toString();
    }

    private static String countKey(MethodNode method)
    {
        int calls = 0;
        int fields = 0;
        for (AbstractInsnNode instruction : method.instructions)
        {
            if (instruction instanceof MethodInsnNode)
            {
                calls++;
            }
            else if (instruction instanceof FieldInsnNode)
            {
                fields++;
            }
        }
        return calls + ":" + fields;
    }

    private static String bodyKey(MethodNode method, Map<String, String> known, boolean targetSide)
    {
        StringBuilder out = new StringBuilder();
        for (AbstractInsnNode instruction : method.instructions)
        {
            int opcode = instruction.getOpcode();
            if (opcode < 0)
            {
                continue;
            }
            out.append(opcode).append(':');
            if (instruction instanceof IntInsnNode)
            {
                out.append(((IntInsnNode) instruction).operand);
            }
            else if (instruction instanceof IincInsnNode)
            {
                out.append(((IincInsnNode) instruction).incr);
            }
            else if (instruction instanceof LdcInsnNode)
            {
                out.append(constantKey(((LdcInsnNode) instruction).cst));
            }
            else if (instruction instanceof TypeInsnNode)
            {
                out.append(typeNameKey(((TypeInsnNode) instruction).desc, known, targetSide));
            }
            else if (instruction instanceof FieldInsnNode)
            {
                FieldInsnNode field = (FieldInsnNode) instruction;
                out.append(typeNameKey(field.owner, known, targetSide)).append(':')
                    .append(descriptorKey(field.desc, known, targetSide));
            }
            else if (instruction instanceof MethodInsnNode)
            {
                MethodInsnNode called = (MethodInsnNode) instruction;
                out.append(typeNameKey(called.owner, known, targetSide)).append(':')
                    .append(special(called.name)).append(':')
                    .append(descriptorKey(called.desc, known, targetSide));
            }
            else if (instruction instanceof InvokeDynamicInsnNode)
            {
                out.append(descriptorKey(((InvokeDynamicInsnNode) instruction).desc, known, targetSide));
            }
            else if (instruction instanceof MultiANewArrayInsnNode)
            {
                MultiANewArrayInsnNode array = (MultiANewArrayInsnNode) instruction;
                out.append(descriptorKey(array.desc, known, targetSide)).append(':').append(array.dims);
            }
            out.append(';');
        }
        return out.toString();
    }

    private static String constantKey(Object value)
    {
        if (value == null)
        {
            return "-";
        }
        if (value instanceof Type)
        {
            return "type:" + ((Type) value).getSort();
        }
        if (value instanceof Handle)
        {
            Handle handle = (Handle) value;
            return "handle:" + handle.getTag() + ':' + handle.getDesc();
        }
        return value.getClass().getSimpleName() + ':' + value;
    }

    private static String descriptorKey(String descriptor, Map<String, String> known,
                                        boolean targetSide)
    {
        Type type = Type.getType(descriptor);
        return typeKey(type, known, targetSide);
    }

    private static String typeKey(Type type, Map<String, String> known, boolean targetSide)
    {
        if (type.getSort() == Type.METHOD)
        {
            StringBuilder out = new StringBuilder("(");
            for (Type argument : type.getArgumentTypes())
            {
                out.append(typeKey(argument, known, targetSide));
            }
            return out.append(')').append(typeKey(type.getReturnType(), known, targetSide)).toString();
        }
        if (type.getSort() == Type.ARRAY)
        {
            return "[".repeat(type.getDimensions()) + typeKey(type.getElementType(), known, targetSide);
        }
        if (type.getSort() == Type.OBJECT)
        {
            return "L" + typeNameKey(type.getInternalName(), known, targetSide) + ";";
        }
        return type.getDescriptor();
    }

    private static String typeNameKey(String name, Map<String, String> known, boolean targetSide)
    {
        if (name == null)
        {
            return "-";
        }
        String mapped = known.get(name);
        if (mapped != null)
        {
            return targetSide ? "#" + mapped : "#" + name;
        }
        return isExternal(name) ? "!" + name : "@";
    }

    private static boolean isExternal(String name)
    {
        return name.indexOf('/') >= 0;
    }

    private static String special(String name)
    {
        return name.startsWith("<") ? name : "_";
    }

    private static Map<String, String> invert(Map<String, String> mapping)
    {
        Map<String, String> inverse = new HashMap<>();
        for (Map.Entry<String, String> entry : mapping.entrySet())
        {
            inverse.put(entry.getValue(), entry.getKey());
        }
        return inverse;
    }

    private static void add(Map<String, List<String>> values, String key, String name)
    {
        values.computeIfAbsent(key, ignored -> new ArrayList<>()).add(name);
    }

    static final class Result
    {
        final SemanticMap map;
        final List<String> failures;
        final int classMatches;

        Result(SemanticMap map, List<String> failures, int classMatches)
        {
            this.map = map;
            this.failures = failures;
            this.classMatches = classMatches;
        }
    }

    private static final class Best
    {
        String name;
        double score = -1;
        double second = -1;

        void consider(String candidate, double candidateScore)
        {
            if (candidateScore > score)
            {
                second = score;
                score = candidateScore;
                name = candidate;
            }
            else if (candidateScore > second)
            {
                second = candidateScore;
            }
        }

        boolean confident()
        {
            return score >= .60 && score - second >= .02;
        }
    }

    private static final class Features
    {
        final ClassNode node;
        final Map<Object, Integer> fields = new HashMap<>();
        final Map<Object, Integer> methods = new HashMap<>();
        final Map<Object, Integer> opcodes = new HashMap<>();
        final Map<Object, Integer> strings = new HashMap<>();
        final Set<String> externalInterfaces = new TreeSet<>();

        Features(ClassNode node)
        {
            this.node = node;
            for (String name : node.interfaces)
            {
                if (isExternal(name)) externalInterfaces.add(name);
            }
            for (FieldNode field : node.fields)
            {
                count(fields, (field.access & 0x1f) + ":"
                    + PayloadExtractor.normalizeTypeDesc(field.desc));
            }
            for (MethodNode method : node.methods)
            {
                if (!method.name.startsWith("<"))
                {
                    count(methods, (method.access & 0x1f) + ":"
                        + PayloadExtractor.normalizeDescriptor(method.desc));
                }
                for (AbstractInsnNode instruction : method.instructions)
                {
                    if (instruction.getOpcode() >= 0) count(opcodes, instruction.getOpcode());
                    if (instruction instanceof LdcInsnNode
                        && ((LdcInsnNode) instruction).cst instanceof String)
                    {
                        count(strings, ((LdcInsnNode) instruction).cst);
                    }
                }
            }
        }
    }

    private static final class Member
    {
        final String name;
        final String descriptor;

        Member(String name, String descriptor)
        {
            this.name = name;
            this.descriptor = descriptor;
        }
    }

}
