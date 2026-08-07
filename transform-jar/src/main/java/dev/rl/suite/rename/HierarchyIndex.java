package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;

/** Internal-only class/interface graph and symbolic member resolver. */
final class HierarchyIndex
{
    private final SymbolTable symbols;

    HierarchyIndex(SymbolTable symbols)
    {
        this.symbols = symbols;
        validateAcyclic();
    }

    boolean contains(String owner)
    {
        return symbols.containsClass(owner);
    }

    Set<String> ancestors(String owner)
    {
        LinkedHashSet<String> ancestors = new LinkedHashSet<>();
        Deque<String> work = new ArrayDeque<>(directParents(owner));
        while (!work.isEmpty())
        {
            String current = work.removeFirst();
            if (!ancestors.add(current))
            {
                continue;
            }
            work.addAll(directParents(current));
        }
        return Collections.unmodifiableSet(ancestors);
    }

    Optional<FieldKey> resolveField(String owner, String name, String descriptor)
    {
        FieldKey direct = new FieldKey(owner, name, descriptor);
        if (symbols.field(direct) != null)
        {
            return Optional.of(direct);
        }
        Set<FieldKey> candidates = new LinkedHashSet<>();
        for (String ancestor : ancestors(owner))
        {
            FieldKey key = new FieldKey(ancestor, name, descriptor);
            if (symbols.field(key) != null)
            {
                candidates.add(key);
            }
        }
        if (candidates.size() > 1)
        {
            throw new TransformException("Ambiguous internal field resolution for "
                + owner + "." + name + ":" + descriptor + ": " + candidates);
        }
        return candidates.stream().findFirst();
    }

    Set<MethodKey> resolveMethods(String owner, String name, String descriptor)
    {
        MethodKey direct = new MethodKey(owner, name, descriptor);
        if (symbols.method(direct) != null)
        {
            return Collections.singleton(direct);
        }
        Set<MethodKey> candidates = new LinkedHashSet<>();
        for (String ancestor : ancestors(owner))
        {
            MethodKey key = new MethodKey(ancestor, name, descriptor);
            if (symbols.method(key) != null)
            {
                candidates.add(key);
            }
        }
        return Collections.unmodifiableSet(candidates);
    }

    private List<String> directParents(String owner)
    {
        SymbolTable.ClassEntry entry = symbols.classEntry(owner);
        if (entry == null)
        {
            return Collections.emptyList();
        }
        ClassNode node = entry.node();
        List<String> parents = new ArrayList<>();
        if (node.superName != null && symbols.containsClass(node.superName))
        {
            parents.add(node.superName);
        }
        List<String> interfaces = new ArrayList<>();
        for (String interfaceName : node.interfaces)
        {
            if (symbols.containsClass(interfaceName))
            {
                interfaces.add(interfaceName);
            }
        }
        Collections.sort(interfaces);
        parents.addAll(interfaces);
        return parents;
    }

    private void validateAcyclic()
    {
        Map<String, State> states = new HashMap<>();
        Deque<String> path = new ArrayDeque<>();
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            visit(entry.name(), states, path);
        }
    }

    private void visit(String owner, Map<String, State> states, Deque<String> path)
    {
        State state = states.get(owner);
        if (state == State.COMPLETE)
        {
            return;
        }
        if (state == State.ACTIVE)
        {
            throw new TransformException("Cyclic internal hierarchy at " + owner + " via " + path);
        }
        states.put(owner, State.ACTIVE);
        path.addLast(owner);
        for (String parent : directParents(owner))
        {
            visit(parent, states, path);
        }
        path.removeLast();
        states.put(owner, State.COMPLETE);
    }

    private enum State
    {
        ACTIVE,
        COMPLETE
    }
}
