package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.RecordComponentNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/**
 * Remaps enum-constant names stored in annotation values.
 *
 * <p>ASM's {@code AnnotationRemapper} remaps an enum value's descriptor but deliberately
 * leaves its constant name unchanged. That is normally correct for class-only remapping,
 * but not when enum fields are renamed as well. The tree is already a private staged copy
 * when this helper runs, so updating the two-element {@code String[]} representation is
 * transactional with the rest of the symbol rename.</p>
 */
final class AnnotationEnumValueRemapper
{
    private AnnotationEnumValueRemapper()
    {
    }

    static void remap(ClassNode node, HierarchyAwareRemapper remapper)
    {
        remapAnnotations(node.visibleAnnotations, remapper);
        remapAnnotations(node.invisibleAnnotations, remapper);
        remapAnnotations(node.visibleTypeAnnotations, remapper);
        remapAnnotations(node.invisibleTypeAnnotations, remapper);

        if (node.recordComponents != null)
        {
            for (RecordComponentNode component : node.recordComponents)
            {
                remapAnnotations(component.visibleAnnotations, remapper);
                remapAnnotations(component.invisibleAnnotations, remapper);
                remapAnnotations(component.visibleTypeAnnotations, remapper);
                remapAnnotations(component.invisibleTypeAnnotations, remapper);
            }
        }

        for (FieldNode field : node.fields)
        {
            remapAnnotations(field.visibleAnnotations, remapper);
            remapAnnotations(field.invisibleAnnotations, remapper);
            remapAnnotations(field.visibleTypeAnnotations, remapper);
            remapAnnotations(field.invisibleTypeAnnotations, remapper);
        }

        for (MethodNode method : node.methods)
        {
            remapValue(method.annotationDefault, remapper);
            remapAnnotations(method.visibleAnnotations, remapper);
            remapAnnotations(method.invisibleAnnotations, remapper);
            remapAnnotations(method.visibleTypeAnnotations, remapper);
            remapAnnotations(method.invisibleTypeAnnotations, remapper);
            remapParameterAnnotations(method.visibleParameterAnnotations, remapper);
            remapParameterAnnotations(method.invisibleParameterAnnotations, remapper);
            remapAnnotations(method.visibleLocalVariableAnnotations, remapper);
            remapAnnotations(method.invisibleLocalVariableAnnotations, remapper);

            for (TryCatchBlockNode block : method.tryCatchBlocks)
            {
                remapAnnotations(block.visibleTypeAnnotations, remapper);
                remapAnnotations(block.invisibleTypeAnnotations, remapper);
            }
            for (AbstractInsnNode instruction : method.instructions)
            {
                remapAnnotations(instruction.visibleTypeAnnotations, remapper);
                remapAnnotations(instruction.invisibleTypeAnnotations, remapper);
            }
        }
    }

    private static void remapParameterAnnotations(List<AnnotationNode>[] parameters,
                                                   HierarchyAwareRemapper remapper)
    {
        if (parameters == null)
        {
            return;
        }
        for (List<AnnotationNode> annotations : parameters)
        {
            remapAnnotations(annotations, remapper);
        }
    }

    private static void remapAnnotations(List<? extends AnnotationNode> annotations,
                                         HierarchyAwareRemapper remapper)
    {
        if (annotations == null)
        {
            return;
        }
        for (AnnotationNode annotation : annotations)
        {
            if (annotation.values == null)
            {
                continue;
            }
            for (int index = 1; index < annotation.values.size(); index += 2)
            {
                remapValue(annotation.values.get(index), remapper);
            }
        }
    }

    private static void remapValue(Object value, HierarchyAwareRemapper remapper)
    {
        if (value instanceof String[])
        {
            remapEnumValue((String[]) value, remapper);
        }
        else if (value instanceof AnnotationNode)
        {
            AnnotationNode nested = (AnnotationNode) value;
            if (nested.values != null)
            {
                for (int index = 1; index < nested.values.size(); index += 2)
                {
                    remapValue(nested.values.get(index), remapper);
                }
            }
        }
        else if (value instanceof List)
        {
            for (Object element : (List<?>) value)
            {
                remapValue(element, remapper);
            }
        }
    }

    private static void remapEnumValue(String[] value, HierarchyAwareRemapper remapper)
    {
        if (value.length != 2 || value[0] == null || value[1] == null)
        {
            throw new TransformException("Malformed enum annotation value");
        }

        final Type enumType;
        try
        {
            enumType = Type.getType(value[0]);
        }
        catch (IllegalArgumentException exception)
        {
            throw new TransformException("Malformed enum annotation descriptor: " + value[0]);
        }
        if (enumType.getSort() != Type.OBJECT)
        {
            throw new TransformException("Enum annotation descriptor is not an object type: "
                + value[0]);
        }

        value[1] = remapper.mapFieldName(enumType.getInternalName(), value[1], value[0]);
    }
}
