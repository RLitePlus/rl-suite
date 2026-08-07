package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;

/**
 * Assigns deterministic, unique analysis names while retaining the original
 * names and descriptors as runtime-visible metadata.
 */
public final class SymbolRenamer implements TransformPass
{
    private static final String LAMBDA_METAFACTORY = "java/lang/invoke/LambdaMetafactory";
    private final Map<FieldKey, String> fieldNameOverrides;

    public SymbolRenamer()
    {
        this(Collections.emptyMap());
    }

    public SymbolRenamer(Map<FieldKey, String> fieldNameOverrides)
    {
        if (fieldNameOverrides == null)
        {
            throw new NullPointerException("fieldNameOverrides");
        }
        List<FieldKey> keys = new ArrayList<>(fieldNameOverrides.keySet());
        Collections.sort(keys);
        Map<FieldKey, String> copy = new LinkedHashMap<>();
        for (FieldKey key : keys)
        {
            if (key == null || fieldNameOverrides.get(key) == null)
            {
                throw new NullPointerException("fieldNameOverrides contains a null key or value");
            }
            copy.put(key, fieldNameOverrides.get(key));
        }
        this.fieldNameOverrides = Collections.unmodifiableMap(copy);
    }

    @Override
    public String name()
    {
        return "rename-symbols";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        SymbolTable symbols = SymbolTable.from(context.getArchive());
        AnnotationMetadataEmitter.rejectPreexisting(symbols);
        rejectUnsupportedAttributes(symbols);

        RenamePolicy policy = new RenamePolicy();
        HierarchyIndex hierarchy = new HierarchyIndex(symbols);
        SymbolMapping mapping = SymbolMapping.structural(symbols, hierarchy, policy,
            fieldNameOverrides);
        validateResourceNames(context, symbols, mapping);
        validateInvokeDynamicNames(symbols, mapping, hierarchy);
        CompilerControlResourceRemapper.Result compilerControl =
            CompilerControlResourceRemapper.analyze(context.getArchive().getResources(),
                symbols, mapping, hierarchy);
        return new Plan(symbols.fingerprint(), mapping, compilerControl);
    }

    private static void rejectUnsupportedAttributes(SymbolTable symbols)
    {
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            ClassNode node = entry.node();
            if (node.attrs != null && !node.attrs.isEmpty())
            {
                throw new TransformException("Cannot safely remap custom class attributes on " + node.name);
            }
            if (node.recordComponents != null && !node.recordComponents.isEmpty()
                && new RenamePolicy().isMappingScope(node.name))
            {
                throw new TransformException("Record component naming is unsupported on " + node.name);
            }
            for (FieldNode field : node.fields)
            {
                if (field.attrs != null && !field.attrs.isEmpty())
                {
                    throw new TransformException("Cannot safely remap custom field attributes on "
                        + node.name + "." + field.name);
                }
            }
            for (MethodNode method : node.methods)
            {
                if (method.attrs != null && !method.attrs.isEmpty())
                {
                    throw new TransformException("Cannot safely remap custom method attributes on "
                        + node.name + "." + method.name + method.desc);
                }
            }
        }
    }

    private static void validateResourceNames(PassContext context, SymbolTable symbols,
                                              SymbolMapping mapping)
    {
        Set<String> names = new java.util.HashSet<>(context.getArchive().getResources().keySet());
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            String output = mapping.className(entry.name()) + ".class";
            if (!names.add(output))
            {
                throw new TransformException("Mapped output entry collision: " + output);
            }
        }
    }

    private static void validateInvokeDynamicNames(SymbolTable symbols, SymbolMapping mapping,
                                                   HierarchyIndex hierarchy)
    {
        HierarchyAwareRemapper remapper = new HierarchyAwareRemapper(mapping, hierarchy);
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            for (MethodNode method : entry.node().methods)
            {
                for (AbstractInsnNode instruction : method.instructions)
                {
                    if (!(instruction instanceof InvokeDynamicInsnNode))
                    {
                        continue;
                    }
                    InvokeDynamicInsnNode dynamic = (InvokeDynamicInsnNode) instruction;
                    LambdaTarget target = lambdaTarget(dynamic, hierarchy);
                    if (target == null)
                    {
                        continue;
                    }
                    String mapped = remapper.mapMethodName(target.owner, dynamic.name,
                        target.descriptor);
                    if (!mapped.equals(dynamic.name)
                        && !LAMBDA_METAFACTORY.equals(dynamic.bsm.getOwner()))
                    {
                        throw new TransformException("Unsupported invokedynamic bootstrap for renamed SAM "
                            + entry.name() + "." + method.name + method.desc + ": " + dynamic.bsm);
                    }
                }
            }
        }
    }

    private static LambdaTarget lambdaTarget(InvokeDynamicInsnNode dynamic, HierarchyIndex hierarchy)
    {
        Type returnType = Type.getReturnType(dynamic.desc);
        if (returnType.getSort() != Type.OBJECT || !hierarchy.contains(returnType.getInternalName())
            || dynamic.bsmArgs.length == 0 || !(dynamic.bsmArgs[0] instanceof Type))
        {
            return null;
        }
        Type samType = (Type) dynamic.bsmArgs[0];
        if (samType.getSort() != Type.METHOD)
        {
            return null;
        }
        return new LambdaTarget(returnType.getInternalName(), samType.getDescriptor());
    }

    private static void rewriteLambdaNames(ClassNode node, HierarchyAwareRemapper remapper,
                                           HierarchyIndex hierarchy)
    {
        for (MethodNode method : node.methods)
        {
            for (AbstractInsnNode instruction : method.instructions)
            {
                if (!(instruction instanceof InvokeDynamicInsnNode))
                {
                    continue;
                }
                InvokeDynamicInsnNode dynamic = (InvokeDynamicInsnNode) instruction;
                LambdaTarget target = lambdaTarget(dynamic, hierarchy);
                if (target != null && LAMBDA_METAFACTORY.equals(dynamic.bsm.getOwner()))
                {
                    dynamic.name = remapper.mapMethodName(target.owner, dynamic.name,
                        target.descriptor);
                }
            }
        }
    }

    private static final class Plan implements TransformationPlan
    {
        private final String symbolFingerprint;
        private final SymbolMapping mapping;
        private final CompilerControlResourceRemapper.Result compilerControl;

        private Plan(String symbolFingerprint, SymbolMapping mapping,
                     CompilerControlResourceRemapper.Result compilerControl)
        {
            this.symbolFingerprint = symbolFingerprint;
            this.mapping = mapping;
            this.compilerControl = compilerControl;
        }

        @Override
        public String passName()
        {
            return "rename-symbols";
        }

        @Override
        public void apply(PassContext context)
        {
            SymbolTable current = SymbolTable.from(context.getArchive());
            if (!symbolFingerprint.equals(current.fingerprint()))
            {
                throw new TransformException("Class/member structure changed after rename planning: expected "
                    + symbolFingerprint + ", found " + current.fingerprint());
            }
            HierarchyIndex hierarchy = new HierarchyIndex(current);
            HierarchyAwareRemapper remapper = new HierarchyAwareRemapper(mapping, hierarchy);
            Map<ClassUnit, ClassNode> staged = new LinkedHashMap<>();
            long annotationNames = 0;
            long annotationSignatures = 0;

            for (SymbolTable.ClassEntry entry : current.classes())
            {
                ClassNode metadataStage = new ClassNode();
                entry.node().accept(metadataStage);
                AnnotationMetadataEmitter.Counts counts = AnnotationMetadataEmitter.emit(
                    metadataStage, mapping);
                annotationNames += counts.names;
                annotationSignatures += counts.signatures;
                rewriteLambdaNames(metadataStage, remapper, hierarchy);
                AnnotationEnumValueRemapper.remap(metadataStage, remapper);

                ClassNode remapped = new ClassNode();
                metadataStage.accept(new ClassRemapper(remapped, remapper));
                String mappedClassName = mapping.className(entry.name());
                if (!mappedClassName.equals(entry.name()))
                {
                    int separator = mappedClassName.lastIndexOf('/');
                    remapped.sourceFile = mappedClassName.substring(separator + 1) + ".java";
                }
                staged.put(entry.unit(), remapped);
            }

            long verifiedMethods = verifyStaged(staged.values());
            Map<String, byte[]> resourceReplacements = compilerControl.validatedReplacements(
                context.getArchive().getResources());
            context.getArchive().replaceClassNodesAndResources(staged, resourceReplacements);
            putMetrics(context, mapping.stats(), annotationNames, annotationSignatures,
                verifiedMethods, compilerControl);
        }
    }

    private static long verifyStaged(Iterable<ClassNode> classes)
    {
        long verified = 0;
        List<String> errors = new ArrayList<>();
        for (ClassNode node : classes)
        {
            for (MethodNode method : node.methods)
            {
                if (method.instructions == null || method.instructions.size() == 0)
                {
                    continue;
                }
                try
                {
                    new Analyzer<BasicValue>(new BasicInterpreter()).analyze(node.name, method);
                    verified++;
                }
                catch (AnalyzerException | RuntimeException ex)
                {
                    errors.add(node.name + "." + method.name + method.desc + ": " + ex.getMessage());
                }
            }
        }
        if (!errors.isEmpty())
        {
            StringBuilder message = new StringBuilder("Staged rename verification failed with ")
                .append(errors.size()).append(" error(s)");
            for (int index = 0; index < Math.min(10, errors.size()); index++)
            {
                message.append("\n - ").append(errors.get(index));
            }
            throw new TransformException(message.toString());
        }
        return verified;
    }

    private static void putMetrics(PassContext context, SymbolMapping.Stats stats,
                                   long annotationNames, long annotationSignatures,
                                   long verifiedMethods,
                                   CompilerControlResourceRemapper.Result compilerControl)
    {
        context.getReport().putMetric("rename.classes.scope", stats.scopedClasses);
        context.getReport().putMetric("rename.classes.renamed", stats.renamedClasses);
        context.getReport().putMetric("rename.fields.eligible", stats.renamedFields);
        context.getReport().putMetric("rename.fields.overridden", stats.overriddenFields);
        context.getReport().putMetric("rename.fields.generic",
            stats.renamedFields - stats.overriddenFields);
        context.getReport().putMetric("rename.methods.predicateEligible",
            stats.predicateEligibleMethods);
        context.getReport().putMetric("rename.methods.bridgesPreserved", stats.preservedBridges);
        context.getReport().putMetric("rename.methods.renamed", stats.renamedMethods);
        context.getReport().putMetric("rename.methods.singletonFamilies", stats.singletonFamilies);
        context.getReport().putMetric("rename.methods.virtualFamilies", stats.virtualFamilies);
        context.getReport().putMetric("rename.methods.virtualDeclarations",
            stats.virtualDeclarations);
        context.getReport().putMetric("rename.annotations.obfuscatedName", annotationNames);
        context.getReport().putMetric("rename.annotations.obfuscatedSignature",
            annotationSignatures);
        context.getReport().putMetric("rename.stagedVerifiedMethods", verifiedMethods);
        context.getReport().putMetric("rename.compilerControl.present",
            compilerControl.presentCount());
        context.getReport().putMetric("rename.compilerControl.directives",
            compilerControl.directiveCount());
        context.getReport().putMetric("rename.compilerControl.patterns",
            compilerControl.patternCount());
        context.getReport().putMetric("rename.compilerControl.rewritten",
            compilerControl.rewrittenCount());
        // The complete mapping is still not oracle-exact: singleton and virtual
        // method numbering does not reproduce the oracle's traversal. Field
        // numbering now does, so it is recorded separately rather than being
        // hidden behind the aggregate.
        context.getReport().putMetric("rename.oracleExact", 0L);
        context.getReport().putMetric("rename.fields.oracleExact", 1L);
        context.getReport().putMetric("rename.methods.withLineNumbers",
            stats.methodsWithLineNumbers);
        context.getReport().putMetadata("rename.mode", "structural");
        context.getReport().putMetadata("rename.fields.order", "constructor-scan");
    }

    private static final class LambdaTarget
    {
        private final String owner;
        private final String descriptor;

        private LambdaTarget(String owner, String descriptor)
        {
            this.owner = owner;
            this.descriptor = descriptor;
        }
    }
}
