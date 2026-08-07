package dev.rl.suite.rename;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Computes override-equivalent declarations without merging static or private methods. */
final class VirtualMethodFamilies
{
    private VirtualMethodFamilies()
    {
    }

    static List<Family> build(Collection<SymbolTable.MethodEntry> candidates,
                              SymbolTable symbols, HierarchyIndex hierarchy,
                              RenamePolicy policy)
    {
        Map<MethodKey, SymbolTable.MethodEntry> entries = new LinkedHashMap<>();
        List<MethodKey> virtual = new ArrayList<>();
        List<MethodKey> singleton = new ArrayList<>();
        for (SymbolTable.MethodEntry entry : candidates)
        {
            entries.put(entry.key(), entry);
            if (policy.participatesInVirtualFamily(entry.node().access))
            {
                virtual.add(entry.key());
            }
            else
            {
                singleton.add(entry.key());
            }
        }
        // Deliberately NOT sorted: the caller supplies these in the traversal
        // order that decides numbering, and a virtual family takes its number
        // from where its first member appears in that order. Union-find is
        // unaffected because DisjointSet picks its root by MethodKey.

        DisjointSet sets = new DisjointSet(virtual);
        for (MethodKey key : virtual)
        {
            for (String ancestor : hierarchy.ancestors(key.getOwner()))
            {
                MethodKey ancestorKey = new MethodKey(ancestor, key.getName(), key.getDescriptor());
                SymbolTable.MethodEntry ancestorEntry = entries.get(ancestorKey);
                if (ancestorEntry != null
                    && policy.participatesInVirtualFamily(ancestorEntry.node().access))
                {
                    sets.union(key, ancestorKey);
                }
            }
        }

        Map<MethodKey, List<MethodKey>> grouped = new HashMap<>();
        for (MethodKey key : virtual)
        {
            grouped.computeIfAbsent(sets.find(key), ignored -> new ArrayList<>()).add(key);
        }

        List<Family> families = new ArrayList<>();
        Set<MethodKey> emittedRoots = new HashSet<>();
        for (SymbolTable.MethodEntry entry : candidates)
        {
            MethodKey key = entry.key();
            if (!policy.participatesInVirtualFamily(entry.node().access))
            {
                families.add(new Family(Collections.singletonList(key)));
                continue;
            }
            MethodKey root = sets.find(key);
            if (!emittedRoots.add(root))
            {
                continue;
            }
            List<MethodKey> members = new ArrayList<>(grouped.get(root));
            Collections.sort(members);
            families.add(new Family(members));
        }
        return Collections.unmodifiableList(families);
    }

    static final class Family
    {
        private final List<MethodKey> members;

        private Family(List<MethodKey> members)
        {
            this.members = Collections.unmodifiableList(new ArrayList<>(members));
        }

        List<MethodKey> members()
        {
            return members;
        }

        MethodKey minimum()
        {
            return members.get(0);
        }

        boolean isVirtual()
        {
            return members.size() > 1;
        }
    }

    private static final class DisjointSet
    {
        private final Map<MethodKey, MethodKey> parents = new HashMap<>();

        private DisjointSet(Collection<MethodKey> keys)
        {
            for (MethodKey key : keys)
            {
                parents.put(key, key);
            }
        }

        private MethodKey find(MethodKey key)
        {
            MethodKey parent = parents.get(key);
            if (parent == null)
            {
                throw new IllegalArgumentException("Unknown method key: " + key);
            }
            if (!parent.equals(key))
            {
                parent = find(parent);
                parents.put(key, parent);
            }
            return parent;
        }

        private void union(MethodKey left, MethodKey right)
        {
            MethodKey leftRoot = find(left);
            MethodKey rightRoot = find(right);
            if (leftRoot.equals(rightRoot))
            {
                return;
            }
            if (leftRoot.compareTo(rightRoot) <= 0)
            {
                parents.put(rightRoot, leftRoot);
            }
            else
            {
                parents.put(leftRoot, rightRoot);
            }
        }
    }
}
