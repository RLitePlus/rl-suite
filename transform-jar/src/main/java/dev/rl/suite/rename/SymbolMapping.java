package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Complete immutable declaration mapping produced from an untouched symbol table. */
final class SymbolMapping
{
    private final Set<String> annotationScope;
    private final Map<String, String> classes;
    private final Map<FieldKey, String> fields;
    private final Map<MethodKey, String> methods;
    private final Map<String, String> annotationAttributes;
    private final Stats stats;

    private SymbolMapping(Set<String> annotationScope, Map<String, String> classes,
                          Map<FieldKey, String> fields, Map<MethodKey, String> methods,
                          Map<String, String> annotationAttributes, Stats stats)
    {
        this.annotationScope = Collections.unmodifiableSet(new LinkedHashSet<>(annotationScope));
        this.classes = Collections.unmodifiableMap(new LinkedHashMap<>(classes));
        this.fields = Collections.unmodifiableMap(new LinkedHashMap<>(fields));
        this.methods = Collections.unmodifiableMap(new LinkedHashMap<>(methods));
        this.annotationAttributes = Collections.unmodifiableMap(
            new LinkedHashMap<>(annotationAttributes));
        this.stats = stats;
    }

    static SymbolMapping structural(SymbolTable symbols, HierarchyIndex hierarchy,
                                    RenamePolicy policy, Map<FieldKey, String> fieldOverrides,
                                    SemanticMap semanticMap)
    {
        Set<String> annotationScope = new LinkedHashSet<>();
        Map<String, String> classes = new LinkedHashMap<>();
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            if (policy.isMappingScope(entry.name()))
            {
                annotationScope.add(entry.name());
            }
            if (policy.renameClass(entry.name()))
            {
                String semanticName = semanticMap.getClasses().get(entry.name());
                classes.put(entry.name(), semanticName == null
                    ? policy.className(entry.name()) : semanticName);
            }
        }
        for (String originalName : semanticMap.getClasses().keySet())
        {
            if (!classes.containsKey(originalName))
            {
                throw new TransformException("Semantic class mapping does not identify an eligible declaration: "
                    + originalName);
            }
        }

        // Numbers are handed out class by class in ascending internal name
        // (symbols.classes() is already sorted that way), and inside each class
        // in the order FieldNumberingOrder recovers from the constructors.
        Map<FieldKey, String> fields = new LinkedHashMap<>();
        List<SymbolTable.FieldEntry> eligibleFields = new ArrayList<>();
        for (SymbolTable.ClassEntry classEntry : symbols.classes())
        {
            ClassNode node = classEntry.node();
            for (FieldNode field : FieldNumberingOrder.order(node))
            {
                FieldKey key = new FieldKey(node.name, field.name, field.desc);
                if (!policy.obfuscatedMember(key.getOwner(), key.getName()))
                {
                    continue;
                }
                SymbolTable.FieldEntry entry = symbols.field(key);
                if (entry == null)
                {
                    throw new TransformException("Field declaration missing from symbol table: "
                        + key);
                }
                eligibleFields.add(entry);
            }
        }
        int fieldIndex = 0;
        int overriddenFields = 0;
        for (SymbolTable.FieldEntry entry : eligibleFields)
        {
            FieldKey key = entry.key();
            String generated = "field" + fieldIndex++;
            String packetOverride = fieldOverrides.get(key);
            String semanticOverride = semanticMap.getFields().get(key);
            if (packetOverride != null && semanticOverride != null
                && !packetOverride.equals(semanticOverride))
            {
                throw new TransformException("Conflicting packet and semantic field names for "
                    + key + ": " + packetOverride + " vs " + semanticOverride);
            }
            String override = semanticOverride == null ? packetOverride : semanticOverride;
            if (override != null)
            {
                validateUnqualifiedName(override, "field override for " + key);
                generated = override;
                overriddenFields++;
            }
            fields.put(key, generated);
        }
        for (FieldKey key : fieldOverrides.keySet())
        {
            if (!fields.containsKey(key))
            {
                throw new TransformException("Field-name override does not identify an eligible declaration: "
                    + key);
            }
        }
        for (FieldKey key : semanticMap.getFields().keySet())
        {
            if (!fields.containsKey(key))
            {
                throw new TransformException("Semantic field mapping does not identify an eligible declaration: "
                    + key);
            }
        }

        // Same shape as the field loop above: class by class in ascending
        // internal name, and inside each class in the order
        // MethodNumberingOrder recovers from the line-number tables.
        List<SymbolTable.MethodEntry> renamedMethods = new ArrayList<>();
        int predicateEligibleMethods = 0;
        int preservedBridges = 0;
        int methodsWithLineNumbers = 0;
        for (SymbolTable.ClassEntry classEntry : symbols.classes())
        {
            ClassNode node = classEntry.node();
            for (MethodNode method : MethodNumberingOrder.order(node))
            {
                MethodKey key = new MethodKey(node.name, method.name, method.desc);
                if (!policy.obfuscatedMember(key.getOwner(), key.getName()))
                {
                    continue;
                }
                predicateEligibleMethods++;
                if (MethodNumberingOrder.hasLineNumbers(method))
                {
                    methodsWithLineNumbers++;
                }
                if (policy.preserveMethod(method.access))
                {
                    preservedBridges++;
                    continue;
                }
                SymbolTable.MethodEntry entry = symbols.method(key);
                if (entry == null)
                {
                    throw new TransformException("Method declaration missing from symbol table: "
                        + key);
                }
                renamedMethods.add(entry);
            }
        }

        List<VirtualMethodFamilies.Family> families = VirtualMethodFamilies.build(
            renamedMethods, symbols, hierarchy, policy);
        Map<MethodKey, String> methods = new LinkedHashMap<>();
        int singletonIndex = 0;
        int virtualIndex = 0;
        int virtualDeclarations = 0;
        for (VirtualMethodFamilies.Family family : families)
        {
            String name;
            if (family.isVirtual())
            {
                name = "vmethod" + virtualIndex++;
                virtualDeclarations += family.members().size();
            }
            else
            {
                name = "method" + singletonIndex++;
            }
            String semanticName = null;
            for (MethodKey key : family.members())
            {
                String candidate = semanticMap.getMethods().get(key);
                if (candidate == null)
                {
                    continue;
                }
                validateUnqualifiedName(candidate, "semantic method name for " + key);
                if (semanticName != null && !semanticName.equals(candidate))
                {
                    throw new TransformException("Conflicting semantic names in virtual method family: "
                        + semanticName + " vs " + candidate + " at " + key);
                }
                semanticName = candidate;
            }
            if (semanticName != null)
            {
                name = semanticName;
            }
            for (MethodKey key : family.members())
            {
                methods.put(key, name);
            }
        }
        for (MethodKey key : semanticMap.getMethods().keySet())
        {
            if (!methods.containsKey(key))
            {
                throw new TransformException("Semantic method mapping does not identify an eligible declaration: "
                    + key);
            }
        }

        Map<String, String> annotationAttributes = annotationAttributes(symbols, methods);
        Stats stats = new Stats(annotationScope.size(), classes.size(), fields.size(),
            overriddenFields, predicateEligibleMethods, preservedBridges, methods.size(),
            singletonIndex, virtualIndex, virtualDeclarations, methodsWithLineNumbers);
        SymbolMapping mapping = new SymbolMapping(annotationScope, classes, fields, methods,
            annotationAttributes, stats);
        mapping.validatePreservedBridges(symbols, hierarchy, policy);
        mapping.validateDeclarationCollisions(symbols);
        mapping.validateNoIntroducedOverrides(symbols, hierarchy);
        return mapping;
    }

    boolean annotateClass(String originalName)
    {
        return annotationScope.contains(originalName);
    }

    String className(String originalName)
    {
        return classes.getOrDefault(originalName, originalName);
    }

    String declaredFieldName(FieldKey key)
    {
        return fields.get(key);
    }

    String declaredMethodName(MethodKey key)
    {
        return methods.get(key);
    }

    boolean renamesField(FieldKey key)
    {
        return fields.containsKey(key);
    }

    boolean renamesMethod(MethodKey key)
    {
        return methods.containsKey(key);
    }

    String annotationAttributeName(String descriptor, String name)
    {
        Type type = Type.getType(descriptor);
        if (type.getSort() != Type.OBJECT)
        {
            return name;
        }
        return annotationAttributes.getOrDefault(
            annotationAttributeKey(type.getInternalName(), name), name);
    }

    String mapDescriptor(String descriptor)
    {
        return new HierarchyAwareRemapper(this, null).mapDesc(descriptor);
    }

    boolean descriptorReferencesScope(String descriptor)
    {
        Type type = Type.getType(descriptor);
        while (type.getSort() == Type.ARRAY)
        {
            type = type.getElementType();
        }
        return type.getSort() == Type.OBJECT
            && annotationScope.contains(type.getInternalName());
    }

    Stats stats()
    {
        return stats;
    }

    private static Map<String, String> annotationAttributes(SymbolTable symbols,
                                                             Map<MethodKey, String> methods)
    {
        Map<String, String> attributes = new LinkedHashMap<>();
        for (SymbolTable.ClassEntry classEntry : symbols.classes())
        {
            if ((classEntry.node().access & Opcodes.ACC_ANNOTATION) == 0)
            {
                continue;
            }
            for (org.objectweb.asm.tree.MethodNode method : classEntry.node().methods)
            {
                if (method.name.startsWith("<")
                    || Type.getArgumentTypes(method.desc).length != 0)
                {
                    continue;
                }
                MethodKey methodKey = new MethodKey(classEntry.name(), method.name, method.desc);
                String mappedName = methods.getOrDefault(methodKey, method.name);
                String key = annotationAttributeKey(classEntry.name(), method.name);
                if (attributes.put(key, mappedName) != null)
                {
                    throw new TransformException("Ambiguous annotation attribute declaration: "
                        + classEntry.name() + "." + method.name);
                }
            }
        }
        return attributes;
    }

    private static String annotationAttributeKey(String owner, String name)
    {
        return owner + '\0' + name;
    }

    private void validatePreservedBridges(SymbolTable symbols, HierarchyIndex hierarchy,
                                          RenamePolicy policy)
    {
        for (SymbolTable.MethodEntry entry : symbols.methods())
        {
            if (!policy.obfuscatedMember(entry.key().getOwner(), entry.key().getName())
                || !policy.preserveMethod(entry.node().access))
            {
                continue;
            }
            for (String ancestor : hierarchy.ancestors(entry.key().getOwner()))
            {
                MethodKey ancestorKey = new MethodKey(ancestor, entry.key().getName(),
                    entry.key().getDescriptor());
                if (methods.containsKey(ancestorKey))
                {
                    throw new TransformException("Preserved bridge would split a renamed internal family: "
                        + entry.key() + " vs " + ancestorKey);
                }
            }
        }
    }

    private void validateDeclarationCollisions(SymbolTable symbols)
    {
        Set<String> outputClasses = new LinkedHashSet<>();
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            String output = className(entry.name());
            if (!outputClasses.add(output))
            {
                throw new TransformException("Mapped class-name collision: " + output);
            }
        }

        Map<String, Set<String>> fieldNames = new LinkedHashMap<>();
        for (SymbolTable.FieldEntry entry : symbols.fields())
        {
            FieldKey key = entry.key();
            String owner = className(key.getOwner());
            String name = fields.getOrDefault(key, key.getName());
            if (!fieldNames.computeIfAbsent(owner, ignored -> new LinkedHashSet<>()).add(name))
            {
                throw new TransformException("Mapped field-name collision in " + owner + ": " + name);
            }
        }

        Map<String, Set<String>> methodSignatures = new LinkedHashMap<>();
        for (SymbolTable.MethodEntry entry : symbols.methods())
        {
            MethodKey key = entry.key();
            String owner = className(key.getOwner());
            String name = methods.getOrDefault(key, key.getName());
            String signature = name + mapDescriptor(key.getDescriptor());
            if (!methodSignatures.computeIfAbsent(owner, ignored -> new LinkedHashSet<>()).add(signature))
            {
                throw new TransformException("Mapped method collision in " + owner + ": " + signature);
            }
        }
    }

    private void validateNoIntroducedOverrides(SymbolTable symbols, HierarchyIndex hierarchy)
    {
        Map<String, List<SymbolTable.MethodEntry>> byOwner = new LinkedHashMap<>();
        for (SymbolTable.MethodEntry entry : symbols.methods())
        {
            byOwner.computeIfAbsent(entry.key().getOwner(), ignored -> new ArrayList<>())
                .add(entry);
        }
        for (SymbolTable.MethodEntry entry : symbols.methods())
        {
            MethodKey key = entry.key();
            String outputName = methods.getOrDefault(key, key.getName());
            String outputDescriptor = mapDescriptor(key.getDescriptor());
            for (String ancestor : hierarchy.ancestors(key.getOwner()))
            {
                for (SymbolTable.MethodEntry inherited : byOwner.getOrDefault(ancestor,
                    Collections.emptyList()))
                {
                    MethodKey inheritedKey = inherited.key();
                    if (!outputName.equals(methods.getOrDefault(inheritedKey,
                        inheritedKey.getName()))
                        || !outputDescriptor.equals(mapDescriptor(inheritedKey.getDescriptor())))
                    {
                        continue;
                    }
                    if (!key.getName().equals(inheritedKey.getName())
                        || !key.getDescriptor().equals(inheritedKey.getDescriptor()))
                    {
                        throw new TransformException("Semantic mapping would introduce a new inherited method collision: "
                            + key + " vs " + inheritedKey + " -> " + outputName
                            + outputDescriptor);
                    }
                }
            }
        }
    }

    private static void validateUnqualifiedName(String name, String description)
    {
        if (name.isEmpty() || name.indexOf('.') >= 0 || name.indexOf(';') >= 0
            || name.indexOf('[') >= 0 || name.indexOf('/') >= 0)
        {
            throw new TransformException("Invalid JVM unqualified name " + name + " for " + description);
        }
    }

    static final class Stats
    {
        final int scopedClasses;
        final int renamedClasses;
        final int renamedFields;
        final int overriddenFields;
        final int predicateEligibleMethods;
        final int preservedBridges;
        final int renamedMethods;
        final int singletonFamilies;
        final int virtualFamilies;
        final int virtualDeclarations;
        final int methodsWithLineNumbers;

        private Stats(int scopedClasses, int renamedClasses, int renamedFields,
                      int overriddenFields, int predicateEligibleMethods,
                      int preservedBridges, int renamedMethods, int singletonFamilies,
                      int virtualFamilies, int virtualDeclarations,
                      int methodsWithLineNumbers)
        {
            this.scopedClasses = scopedClasses;
            this.renamedClasses = renamedClasses;
            this.renamedFields = renamedFields;
            this.overriddenFields = overriddenFields;
            this.predicateEligibleMethods = predicateEligibleMethods;
            this.preservedBridges = preservedBridges;
            this.renamedMethods = renamedMethods;
            this.singletonFamilies = singletonFamilies;
            this.virtualFamilies = virtualFamilies;
            this.virtualDeclarations = virtualDeclarations;
            this.methodsWithLineNumbers = methodsWithLineNumbers;
        }
    }
}
