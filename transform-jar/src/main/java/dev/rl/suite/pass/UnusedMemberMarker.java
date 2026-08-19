package dev.rl.suite.pass;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Marks obfuscated fields and static methods which have no bytecode references.
 *
 * <p>This deliberately mirrors the narrow analysis used by the renamed-client source
 * oracle. Fields resolve through the symbolic owner's superclass chain, while
 * method invocations and handles use an owner-exact key. Nothing is deleted.</p>
 */
public final class UnusedMemberMarker implements TransformPass
{
    public static final String TO_REMOVE_DESCRIPTOR = "Lnet/runelite/mapping/ToRemove;";
    private static final int OBFUSCATED_NAME_MAX_LENGTH = 3;

    @Override
    public String name()
    {
        return "mark-unused-members";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        return new Plan(Snapshot.create(context.getArchive()));
    }

    static boolean isObfuscatedName(String name)
    {
        return name.length() <= OBFUSCATED_NAME_MAX_LENGTH
            && !"run".equals(name)
            && !"add".equals(name);
    }

    private static AnnotationNode toRemoveAnnotation()
    {
        AnnotationNode annotation = new AnnotationNode(TO_REMOVE_DESCRIPTOR);
        // ToRemove.unused is a String-valued element in the oracle.
        annotation.values = Arrays.<Object>asList("unused", "true");
        return annotation;
    }

    private static void addAnnotation(FieldNode field)
    {
        if (field.visibleAnnotations == null)
        {
            field.visibleAnnotations = new ArrayList<>();
        }
        field.visibleAnnotations.add(toRemoveAnnotation());
    }

    private static void addAnnotation(MethodNode method)
    {
        if (method.visibleAnnotations == null)
        {
            method.visibleAnnotations = new ArrayList<>();
        }
        method.visibleAnnotations.add(toRemoveAnnotation());
    }

    private static final class Plan implements TransformationPlan
    {
        private final Snapshot planned;

        private Plan(Snapshot planned)
        {
            this.planned = planned;
        }

        @Override
        public void apply(PassContext context)
        {
            Snapshot current = Snapshot.create(context.getArchive());
            planned.requireSameTargets(current);

            long fieldsAdded = 0;
            for (FieldKey key : current.unusedFields)
            {
                if (!current.preMarkedFields.contains(key))
                {
                    addAnnotation(current.fieldCandidates.get(key).node);
                    fieldsAdded++;
                }
            }

            long methodsAdded = 0;
            for (MethodKey key : current.unusedMethods)
            {
                if (!current.preMarkedMethods.contains(key))
                {
                    addAnnotation(current.methodCandidates.get(key).node);
                    methodsAdded++;
                }
            }

            // Reference metrics describe the untouched input snapshot. Earlier
            // planned passes may convert a handle reference into an equivalent
            // direct invocation without changing which members are unused.
            context.getReport().putMetric("unused.fields.candidates", planned.fieldCandidates.size());
            context.getReport().putMetric("unused.fields.referenced", planned.referencedFields.size());
            context.getReport().putMetric("unused.fields.referenceOccurrences",
                planned.fieldReferenceOccurrences);
            context.getReport().putMetric("unused.fields.marked", planned.unusedFields.size());
            context.getReport().putMetric("unused.fields.added", fieldsAdded);
            context.getReport().putMetric("unused.methods.staticCandidates",
                planned.methodCandidates.size());
            context.getReport().putMetric("unused.methods.directReferenced",
                planned.directMethodReferences.size());
            context.getReport().putMetric("unused.methods.handleReferenced",
                planned.handleMethodReferences.size());
            context.getReport().putMetric("unused.methods.handleOnlyReferenced",
                planned.handleOnlyMethods.size());
            context.getReport().putMetric("unused.methods.marked", planned.unusedMethods.size());
            context.getReport().putMetric("unused.methods.added", methodsAdded);
            context.getReport().putMetric("unused.total.marked",
                (long) planned.unusedFields.size() + planned.unusedMethods.size());
            context.getReport().putMetric("unused.total.added", fieldsAdded + methodsAdded);
        }
    }

    private static final class Snapshot
    {
        private final Map<FieldKey, FieldRef> fieldCandidates;
        private final Map<MethodKey, MethodRef> methodCandidates;
        private final Set<FieldKey> referencedFields;
        private final Set<MethodKey> directMethodReferences;
        private final Set<MethodKey> handleMethodReferences;
        private final Set<MethodKey> handleOnlyMethods;
        private final Set<FieldKey> unusedFields;
        private final Set<MethodKey> unusedMethods;
        private final Set<FieldKey> preMarkedFields;
        private final Set<MethodKey> preMarkedMethods;
        private final long fieldReferenceOccurrences;

        private Snapshot(
            Map<FieldKey, FieldRef> fieldCandidates,
            Map<MethodKey, MethodRef> methodCandidates,
            Set<FieldKey> referencedFields,
            Set<MethodKey> directMethodReferences,
            Set<MethodKey> handleMethodReferences,
            Set<FieldKey> unusedFields,
            Set<MethodKey> unusedMethods,
            Set<FieldKey> preMarkedFields,
            Set<MethodKey> preMarkedMethods,
            long fieldReferenceOccurrences)
        {
            this.fieldCandidates = fieldCandidates;
            this.methodCandidates = methodCandidates;
            this.referencedFields = referencedFields;
            this.directMethodReferences = directMethodReferences;
            this.handleMethodReferences = handleMethodReferences;
            Set<MethodKey> handleOnly = new LinkedHashSet<>(handleMethodReferences);
            handleOnly.removeAll(directMethodReferences);
            this.handleOnlyMethods = Collections.unmodifiableSet(handleOnly);
            this.unusedFields = unusedFields;
            this.unusedMethods = unusedMethods;
            this.preMarkedFields = preMarkedFields;
            this.preMarkedMethods = preMarkedMethods;
            this.fieldReferenceOccurrences = fieldReferenceOccurrences;
        }

        private static Snapshot create(JarArchive archive)
        {
            Map<String, ClassNode> classes = classIndex(archive);
            Map<FieldKey, FieldRef> declaredFields = new LinkedHashMap<>();
            Map<MethodKey, MethodRef> declaredMethods = new LinkedHashMap<>();
            Map<FieldKey, FieldRef> fieldCandidates = new LinkedHashMap<>();
            Map<MethodKey, MethodRef> methodCandidates = new LinkedHashMap<>();

            rejectClassAnnotations(classes);
            for (ClassUnit unit : archive.getClasses())
            {
                ClassNode owner = unit.getNode();
                for (FieldNode field : owner.fields)
                {
                    FieldKey key = new FieldKey(owner.name, field.name, field.desc);
                    putUnique(declaredFields, key, new FieldRef(field));
                    if (isObfuscatedName(field.name))
                    {
                        fieldCandidates.put(key, new FieldRef(field));
                    }
                }
                for (MethodNode method : owner.methods)
                {
                    MethodKey key = new MethodKey(owner.name, method.name, method.desc);
                    putUnique(declaredMethods, key, new MethodRef(method));
                    if ((method.access & Opcodes.ACC_STATIC) != 0 && isObfuscatedName(method.name))
                    {
                        methodCandidates.put(key, new MethodRef(method));
                    }
                }
            }

            ReferenceScanner scanner = new ReferenceScanner(classes, declaredFields,
                fieldCandidates.keySet(), methodCandidates.keySet());
            scanner.scan(archive);

            Set<FieldKey> unusedFields = new LinkedHashSet<>(fieldCandidates.keySet());
            unusedFields.removeAll(scanner.referencedFields);
            Set<MethodKey> referencedMethods = new LinkedHashSet<>(scanner.directMethodReferences);
            referencedMethods.addAll(scanner.handleMethodReferences);
            Set<MethodKey> unusedMethods = new LinkedHashSet<>(methodCandidates.keySet());
            unusedMethods.removeAll(referencedMethods);

            ExistingMarks marks = validateExistingMarks(archive, fieldCandidates, methodCandidates,
                unusedFields, unusedMethods);
            return new Snapshot(
                Collections.unmodifiableMap(fieldCandidates),
                Collections.unmodifiableMap(methodCandidates),
                Collections.unmodifiableSet(scanner.referencedFields),
                Collections.unmodifiableSet(scanner.directMethodReferences),
                Collections.unmodifiableSet(scanner.handleMethodReferences),
                Collections.unmodifiableSet(unusedFields),
                Collections.unmodifiableSet(unusedMethods),
                Collections.unmodifiableSet(marks.fields),
                Collections.unmodifiableSet(marks.methods),
                scanner.fieldReferenceOccurrences);
        }

        private void requireSameTargets(Snapshot current)
        {
            if (!fieldCandidates.keySet().equals(current.fieldCandidates.keySet())
                || !methodCandidates.keySet().equals(current.methodCandidates.keySet())
                || !unusedFields.equals(current.unusedFields)
                || !unusedMethods.equals(current.unusedMethods)
                || !preMarkedFields.equals(current.preMarkedFields)
                || !preMarkedMethods.equals(current.preMarkedMethods))
            {
                throw new TransformException("Unused-member targets changed after planning");
            }
        }

        private static Map<String, ClassNode> classIndex(JarArchive archive)
        {
            Map<String, ClassNode> result = new LinkedHashMap<>();
            for (ClassUnit unit : archive.getClasses())
            {
                ClassNode previous = result.put(unit.getNode().name, unit.getNode());
                if (previous != null)
                {
                    throw new TransformException("Duplicate internal class name: " + unit.getNode().name);
                }
            }
            return result;
        }

        private static void rejectClassAnnotations(Map<String, ClassNode> classes)
        {
            for (ClassNode classNode : classes.values())
            {
                int count = countToRemove(classNode.visibleAnnotations)
                    + countToRemove(classNode.invisibleAnnotations);
                if (count > 0)
                {
                    throw new TransformException("Unexpected ToRemove annotation on class " + classNode.name);
                }
            }
        }

        private static ExistingMarks validateExistingMarks(
            JarArchive archive,
            Map<FieldKey, FieldRef> fieldCandidates,
            Map<MethodKey, MethodRef> methodCandidates,
            Set<FieldKey> unusedFields,
            Set<MethodKey> unusedMethods)
        {
            ExistingMarks marks = new ExistingMarks();
            for (ClassUnit unit : archive.getClasses())
            {
                ClassNode owner = unit.getNode();
                for (FieldNode field : owner.fields)
                {
                    FieldKey key = new FieldKey(owner.name, field.name, field.desc);
                    boolean marked = validateAnnotationLists("field " + key,
                        field.visibleAnnotations, field.invisibleAnnotations);
                    if (marked)
                    {
                        if (!fieldCandidates.containsKey(key) || !unusedFields.contains(key))
                        {
                            throw new TransformException("Stale ToRemove annotation on field " + key);
                        }
                        marks.fields.add(key);
                    }
                }
                for (MethodNode method : owner.methods)
                {
                    MethodKey key = new MethodKey(owner.name, method.name, method.desc);
                    boolean marked = validateAnnotationLists("method " + key,
                        method.visibleAnnotations, method.invisibleAnnotations);
                    if (marked)
                    {
                        if (!methodCandidates.containsKey(key) || !unusedMethods.contains(key))
                        {
                            throw new TransformException("Stale ToRemove annotation on method " + key);
                        }
                        marks.methods.add(key);
                    }
                }
            }
            return marks;
        }

        private static boolean validateAnnotationLists(String location,
            List<AnnotationNode> visible, List<AnnotationNode> invisible)
        {
            int visibleCount = 0;
            for (AnnotationNode annotation : annotations(visible))
            {
                if (TO_REMOVE_DESCRIPTOR.equals(annotation.desc))
                {
                    visibleCount++;
                    if (!isExactToRemove(annotation))
                    {
                        throw new TransformException("Malformed ToRemove annotation on " + location);
                    }
                }
            }
            int invisibleCount = countToRemove(invisible);
            if (invisibleCount > 0)
            {
                throw new TransformException("Invisible ToRemove annotation on " + location);
            }
            if (visibleCount > 1)
            {
                throw new TransformException("Duplicate ToRemove annotations on " + location);
            }
            return visibleCount == 1;
        }

        private static boolean isExactToRemove(AnnotationNode annotation)
        {
            return annotation.values != null
                && annotation.values.size() == 2
                && "unused".equals(annotation.values.get(0))
                && "true".equals(annotation.values.get(1));
        }

        private static int countToRemove(List<AnnotationNode> annotations)
        {
            int count = 0;
            for (AnnotationNode annotation : annotations(annotations))
            {
                if (TO_REMOVE_DESCRIPTOR.equals(annotation.desc))
                {
                    count++;
                }
            }
            return count;
        }

        private static List<AnnotationNode> annotations(List<AnnotationNode> annotations)
        {
            return annotations == null ? Collections.<AnnotationNode>emptyList() : annotations;
        }

        private static <K, V> void putUnique(Map<K, V> map, K key, V value)
        {
            if (map.put(key, value) != null)
            {
                throw new TransformException("Duplicate member declaration: " + key);
            }
        }
    }

    private static final class ReferenceScanner
    {
        private final Map<String, ClassNode> classes;
        private final Map<FieldKey, FieldRef> declaredFields;
        private final Set<FieldKey> fieldCandidates;
        private final Set<MethodKey> methodCandidates;
        private final Set<FieldKey> referencedFields = new LinkedHashSet<>();
        private final Set<MethodKey> directMethodReferences = new LinkedHashSet<>();
        private final Set<MethodKey> handleMethodReferences = new LinkedHashSet<>();
        private long fieldReferenceOccurrences;

        private ReferenceScanner(Map<String, ClassNode> classes,
            Map<FieldKey, FieldRef> declaredFields, Set<FieldKey> fieldCandidates,
            Set<MethodKey> methodCandidates)
        {
            this.classes = classes;
            this.declaredFields = declaredFields;
            this.fieldCandidates = fieldCandidates;
            this.methodCandidates = methodCandidates;
        }

        private void scan(JarArchive archive)
        {
            for (ClassUnit unit : archive.getClasses())
            {
                for (MethodNode method : unit.getNode().methods)
                {
                    for (AbstractInsnNode instruction : method.instructions)
                    {
                        if (instruction instanceof FieldInsnNode)
                        {
                            FieldInsnNode field = (FieldInsnNode) instruction;
                            FieldKey resolved = resolveField(field.owner, field.name, field.desc);
                            if (resolved != null && fieldCandidates.contains(resolved))
                            {
                                referencedFields.add(resolved);
                                fieldReferenceOccurrences++;
                            }
                        }
                        else if (instruction instanceof MethodInsnNode)
                        {
                            MethodInsnNode invoke = (MethodInsnNode) instruction;
                            MethodKey key = new MethodKey(invoke.owner, invoke.name, invoke.desc);
                            if (methodCandidates.contains(key))
                            {
                                directMethodReferences.add(key);
                            }
                        }
                        else if (instruction instanceof InvokeDynamicInsnNode)
                        {
                            InvokeDynamicInsnNode invokeDynamic = (InvokeDynamicInsnNode) instruction;
                            Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
                            scanConstant(invokeDynamic.bsm, visited);
                            scanConstant(invokeDynamic.bsmArgs, visited);
                        }
                        else if (instruction instanceof LdcInsnNode)
                        {
                            Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
                            scanConstant(((LdcInsnNode) instruction).cst, visited);
                        }
                    }
                }
            }
        }

        private FieldKey resolveField(String owner, String name, String descriptor)
        {
            Set<String> visited = new HashSet<>();
            String current = owner;
            while (current != null)
            {
                if (!visited.add(current))
                {
                    throw new TransformException("Superclass cycle while resolving field "
                        + owner + "." + name + ":" + descriptor);
                }
                FieldKey key = new FieldKey(current, name, descriptor);
                if (declaredFields.containsKey(key))
                {
                    return key;
                }
                ClassNode classNode = classes.get(current);
                if (classNode == null)
                {
                    return null;
                }
                current = classNode.superName;
            }
            return null;
        }

        private void scanConstant(Object value, Set<Object> visited)
        {
            if (value == null || !visited.add(value))
            {
                return;
            }
            if (value instanceof Handle)
            {
                Handle handle = (Handle) value;
                if (isMethodHandle(handle.getTag()))
                {
                    MethodKey key = new MethodKey(handle.getOwner(), handle.getName(), handle.getDesc());
                    if (methodCandidates.contains(key))
                    {
                        handleMethodReferences.add(key);
                    }
                }
            }
            else if (value instanceof ConstantDynamic)
            {
                ConstantDynamic constant = (ConstantDynamic) value;
                scanConstant(constant.getBootstrapMethod(), visited);
                for (int index = 0; index < constant.getBootstrapMethodArgumentCount(); index++)
                {
                    scanConstant(constant.getBootstrapMethodArgument(index), visited);
                }
            }
            else if (value instanceof Object[])
            {
                for (Object element : (Object[]) value)
                {
                    scanConstant(element, visited);
                }
            }
        }

        private static boolean isMethodHandle(int tag)
        {
            return tag == Opcodes.H_INVOKEVIRTUAL
                || tag == Opcodes.H_INVOKESTATIC
                || tag == Opcodes.H_INVOKESPECIAL
                || tag == Opcodes.H_NEWINVOKESPECIAL
                || tag == Opcodes.H_INVOKEINTERFACE;
        }
    }

    private static final class ExistingMarks
    {
        private final Set<FieldKey> fields = new LinkedHashSet<>();
        private final Set<MethodKey> methods = new LinkedHashSet<>();
    }

    private static final class FieldRef
    {
        private final FieldNode node;

        private FieldRef(FieldNode node)
        {
            this.node = node;
        }
    }

    private static final class MethodRef
    {
        private final MethodNode node;

        private MethodRef(MethodNode node)
        {
            this.node = node;
        }
    }

    private abstract static class MemberKey
    {
        private final String owner;
        private final String name;
        private final String descriptor;

        private MemberKey(String owner, String name, String descriptor)
        {
            this.owner = owner;
            this.name = name;
            this.descriptor = descriptor;
        }

        @Override
        public final boolean equals(Object other)
        {
            if (other == null || other.getClass() != getClass())
            {
                return false;
            }
            MemberKey key = (MemberKey) other;
            return owner.equals(key.owner) && name.equals(key.name) && descriptor.equals(key.descriptor);
        }

        @Override
        public final int hashCode()
        {
            return Objects.hash(owner, name, descriptor);
        }

        @Override
        public final String toString()
        {
            return owner + "." + name + descriptor;
        }
    }

    private static final class FieldKey extends MemberKey
    {
        private FieldKey(String owner, String name, String descriptor)
        {
            super(owner, name, descriptor);
        }
    }

    private static final class MethodKey extends MemberKey
    {
        private MethodKey(String owner, String name, String descriptor)
        {
            super(owner, name, descriptor);
        }
    }
}
