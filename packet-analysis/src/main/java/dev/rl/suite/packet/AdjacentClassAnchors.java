package dev.rl.suite.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Conservative same-name anchors for adjacent injected-client revisions. */
final class AdjacentClassAnchors
{
    private static final int ACCESS_SHAPE = 0x0001 | 0x0002 | 0x0004 | 0x0008
        | 0x0010 | 0x0200 | 0x0400 | 0x2000 | 0x4000;

    private AdjacentClassAnchors()
    {
    }

    static int add(Map<String, ClassNode> oldClasses, Map<String, ClassNode> newClasses,
                   Map<String, String> matches, Set<String> used)
    {
        int added = 0;
        for (Map.Entry<String, ClassNode> entry : oldClasses.entrySet())
        {
            String name = entry.getKey();
            ClassNode candidate = newClasses.get(name);
            if (!matches.containsKey(name) && !used.contains(name) && candidate != null
                && sameStableDeclarations(entry.getValue(), candidate))
            {
                matches.put(name, name);
                used.add(name);
                added++;
            }
        }
        return added;
    }

    private static boolean sameStableDeclarations(ClassNode oldClass, ClassNode newClass)
    {
        if ((oldClass.access & ACCESS_SHAPE) != (newClass.access & ACCESS_SHAPE)
            || !equal(oldClass.superName, newClass.superName)
            || !sorted(oldClass.interfaces).equals(sorted(newClass.interfaces)))
        {
            return false;
        }

        List<String> oldFields = fields(oldClass);
        List<String> newFields = fields(newClass);
        List<String> oldConstructors = constructors(oldClass);
        List<String> oldAbstractMethods = abstractMethods(oldClass);
        if (!oldFields.equals(newFields) || !oldConstructors.equals(constructors(newClass))
            || !oldAbstractMethods.equals(abstractMethods(newClass)))
        {
            return false;
        }

        // A name alone is not evidence. Require a stable state layout, constructor contract,
        // or external interface before ignoring relocated helper methods.
        return !oldFields.isEmpty() || !oldConstructors.isEmpty() || !oldAbstractMethods.isEmpty()
            || oldClass.interfaces.stream().anyMatch(name -> name.indexOf('/') >= 0);
    }

    private static List<String> fields(ClassNode node)
    {
        List<String> keys = new ArrayList<>();
        for (FieldNode field : node.fields)
        {
            keys.add((field.access & ACCESS_SHAPE) + ":" + field.name + ":" + field.desc);
        }
        Collections.sort(keys);
        return keys;
    }

    private static List<String> constructors(ClassNode node)
    {
        List<String> keys = new ArrayList<>();
        for (MethodNode method : node.methods)
        {
            if (method.name.equals("<init>"))
            {
                keys.add((method.access & ACCESS_SHAPE) + ":" + method.desc);
            }
        }
        Collections.sort(keys);
        return keys;
    }

    private static List<String> abstractMethods(ClassNode node)
    {
        List<String> keys = new ArrayList<>();
        for (MethodNode method : node.methods)
        {
            if ((method.access & 0x0400) != 0)
            {
                keys.add((method.access & ACCESS_SHAPE) + ":" + method.name + ":" + method.desc);
            }
        }
        Collections.sort(keys);
        return keys;
    }

    private static List<String> sorted(List<String> values)
    {
        List<String> sorted = new ArrayList<>(values);
        Collections.sort(sorted);
        return sorted;
    }

    private static boolean equal(Object left, Object right)
    {
        return left == null ? right == null : left.equals(right);
    }
}
