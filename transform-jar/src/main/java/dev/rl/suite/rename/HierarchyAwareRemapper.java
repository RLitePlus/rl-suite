package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import org.objectweb.asm.commons.Remapper;

/** Remaps inherited symbolic owners to the mapped declaration/family name. */
final class HierarchyAwareRemapper extends Remapper
{
    private final SymbolMapping mapping;
    private final HierarchyIndex hierarchy;

    HierarchyAwareRemapper(SymbolMapping mapping, HierarchyIndex hierarchy)
    {
        this.mapping = mapping;
        this.hierarchy = hierarchy;
    }

    @Override
    public String map(String internalName)
    {
        return mapping.className(internalName);
    }

    @Override
    public String mapFieldName(String owner, String name, String descriptor)
    {
        FieldKey direct = new FieldKey(owner, name, descriptor);
        String mapped = mapping.declaredFieldName(direct);
        if (mapped != null)
        {
            return mapped;
        }
        if (hierarchy != null)
        {
            Optional<FieldKey> declaration = hierarchy.resolveField(owner, name, descriptor);
            if (declaration.isPresent())
            {
                mapped = mapping.declaredFieldName(declaration.get());
                if (mapped != null)
                {
                    return mapped;
                }
            }
        }
        return name;
    }

    @Override
    public String mapMethodName(String owner, String name, String descriptor)
    {
        MethodKey direct = new MethodKey(owner, name, descriptor);
        String mapped = mapping.declaredMethodName(direct);
        if (mapped != null)
        {
            return mapped;
        }
        if (hierarchy == null)
        {
            return name;
        }

        Set<String> resolvedNames = new LinkedHashSet<>();
        for (MethodKey declaration : hierarchy.resolveMethods(owner, name, descriptor))
        {
            String resolved = mapping.declaredMethodName(declaration);
            resolvedNames.add(resolved == null ? declaration.getName() : resolved);
        }
        if (resolvedNames.size() > 1)
        {
            throw new TransformException("Symbolic method reference resolves to differently mapped families: "
                + owner + "." + name + descriptor + " -> " + resolvedNames);
        }
        return resolvedNames.isEmpty() ? name : resolvedNames.iterator().next();
    }

    @Override
    public String mapAnnotationAttributeName(String descriptor, String name)
    {
        return mapping.annotationAttributeName(descriptor, name);
    }
}
