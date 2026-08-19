package dev.rl.suite.packet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class PayloadMapper
{
    private PayloadMapper()
    {
    }

    public static Result map(PayloadExtractor.Result source, PayloadExtractor.Result target)
    {
        return mapPayloads(source.getPayloads(), target.getPayloads(), false);
    }

    public static Result mapPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads)
    {
        return mapPayloads(srcPayloads, tgtPayloads, false);
    }

    public static Result mapPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        boolean allowPartialGroups)
    {
        return mapPayloads(srcPayloads, tgtPayloads,
            allowPartialGroups, allowPartialGroups);
    }

    static Result mapPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        boolean allowPartialGroups,
        boolean forceMatch)
    {
        Map<Integer, Integer> sourceToTarget = new TreeMap<>();
        Set<Integer> matchedSrc = new HashSet<>();
        Set<Integer> matchedTgt = new HashSet<>();

        // Phase 1: structural-unique matching
        KeyFunction structKey = p -> p.structuralSignature().toString();
        matchByKey(srcPayloads, tgtPayloads, structKey,
            sourceToTarget, matchedSrc, matchedTgt);

        withdrawMultisetCollisions(srcPayloads, tgtPayloads,
            sourceToTarget, matchedSrc, matchedTgt);

        // Method-mapping loop from structural-unique seeds
        int prevSize;
        do
        {
            prevSize = sourceToTarget.size();
            Map<String, String> methodMapping = deriveMethodMapping(
                srcPayloads, tgtPayloads, sourceToTarget);
            if (methodMapping.isEmpty()) break;
            matchByMethodMapping(srcPayloads, tgtPayloads, methodMapping,
                sourceToTarget, matchedSrc, matchedTgt);
        }
        while (sourceToTarget.size() > prevSize);

        // Enriched/body/shape unique + group matching.
        // Body matchByKey excludes multiset-collision packets to
        // prevent cross-packet coincidental body matches.
        KeyFunction[] extPasses = buildPasses();
        Set<Integer> bodyExclude = multisetCollisionSet(
            srcPayloads, matchedSrc);
        for (int i = 1; i < extPasses.length; i++)
        {
            if (i == 2 || i == 4)
            {
                matchByKey(srcPayloads, tgtPayloads, extPasses[i],
                    sourceToTarget, matchedSrc, matchedTgt, bodyExclude);
            }
            else
            {
                matchByKey(srcPayloads, tgtPayloads, extPasses[i],
                    sourceToTarget, matchedSrc, matchedTgt);
            }
        }
        for (KeyFunction fn : extPasses)
        {
            groupMatch(srcPayloads, tgtPayloads, fn,
                sourceToTarget, matchedSrc, matchedTgt);
        }
        int cpPrev;
        do
        {
            cpPrev = sourceToTarget.size();
            bodyExclude = multisetCollisionSet(srcPayloads, matchedSrc);
            for (int i = 0; i < extPasses.length; i++)
            {
                if (i == 2 || i == 4)
                {
                    matchByKey(srcPayloads, tgtPayloads, extPasses[i],
                        sourceToTarget, matchedSrc, matchedTgt,
                        bodyExclude);
                }
                else
                {
                    matchByKey(srcPayloads, tgtPayloads, extPasses[i],
                        sourceToTarget, matchedSrc, matchedTgt);
                }
            }
            Map<String, String> mm = deriveMethodMapping(
                srcPayloads, tgtPayloads, sourceToTarget);
            if (!mm.isEmpty())
            {
                matchByMethodMapping(srcPayloads, tgtPayloads, mm,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
            for (KeyFunction fn : extPasses)
            {
                groupMatch(srcPayloads, tgtPayloads, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
        }
        while (sourceToTarget.size() > cpPrev);

        withdrawShapeMismatch(srcPayloads, tgtPayloads,
            sourceToTarget, matchedSrc, matchedTgt);

        int refPrev;
        do
        {
            refPrev = sourceToTarget.size();
            resolveByRefMapping(srcPayloads, tgtPayloads,
                sourceToTarget, matchedSrc, matchedTgt, Collections.emptyMap());
        }
        while (sourceToTarget.size() > refPrev);

        if (allowPartialGroups)
        {
            KeyFunction[] passes = buildPasses();

            // Re-derive method mapping with all confident matches
            Map<String, String> methodMapping = deriveMethodMapping(
                srcPayloads, tgtPayloads, sourceToTarget);
            if (!methodMapping.isEmpty())
            {
                matchByMethodMapping(srcPayloads, tgtPayloads, methodMapping,
                    sourceToTarget, matchedSrc, matchedTgt);
            }

            // Use multiset key for partial matching (tolerates read reordering)
            matchByKey(srcPayloads, tgtPayloads, MULTISET_KEY,
                sourceToTarget, matchedSrc, matchedTgt);
            groupMatch(srcPayloads, tgtPayloads, MULTISET_KEY,
                sourceToTarget, matchedSrc, matchedTgt);
            for (KeyFunction fn : passes)
            {
                partialGroupMatch(srcPayloads, tgtPayloads, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
            partialGroupMatch(srcPayloads, tgtPayloads, MULTISET_KEY,
                sourceToTarget, matchedSrc, matchedTgt);

            // Cross-structural matching: for remaining unmatched pairs,
            // match by handler body features ignoring structural signature.
            // This catches packets whose read types changed between revisions
            // but whose handler code is otherwise preserved.
            KeyFunction[] aggrCrossStructural = {
                PacketPayload::bodySignature,
                p -> p.getCallDescriptors() + "|" + p.getFieldDescriptors(),
                p -> p.getCallDescriptors().toString(),
            };
            int crossPrev;
            do
            {
                crossPrev = sourceToTarget.size();
                for (KeyFunction fn : aggrCrossStructural)
                {
                    matchByKey(srcPayloads, tgtPayloads, fn,
                        sourceToTarget, matchedSrc, matchedTgt);
                }
                for (KeyFunction fn : aggrCrossStructural)
                {
                    groupMatch(srcPayloads, tgtPayloads, fn,
                        sourceToTarget, matchedSrc, matchedTgt);
                }
                for (KeyFunction fn : aggrCrossStructural)
                {
                    partialGroupMatch(srcPayloads, tgtPayloads, fn,
                        sourceToTarget, matchedSrc, matchedTgt);
                }
            }
            while (sourceToTarget.size() > crossPrev);

            // Final fallback: match remaining by declared length + read count
            KeyFunction lengthAndCount = p ->
                "L" + p.getDeclaredLength() + "|R" + p.readCount();
            matchByKey(srcPayloads, tgtPayloads, lengthAndCount,
                sourceToTarget, matchedSrc, matchedTgt);

            if (forceMatch)
            {
                groupMatch(srcPayloads, tgtPayloads, lengthAndCount,
                    sourceToTarget, matchedSrc, matchedTgt);
                partialGroupMatch(srcPayloads, tgtPayloads, lengthAndCount,
                    sourceToTarget, matchedSrc, matchedTgt);

                KeyFunction lengthOnly = p -> "L" + p.getDeclaredLength();
                matchByKey(srcPayloads, tgtPayloads, lengthOnly,
                    sourceToTarget, matchedSrc, matchedTgt);
                partialGroupMatch(srcPayloads, tgtPayloads, lengthOnly,
                    sourceToTarget, matchedSrc, matchedTgt);

                KeyFunction readCountOnly = p -> "R" + p.readCount();
                matchByKey(srcPayloads, tgtPayloads, readCountOnly,
                    sourceToTarget, matchedSrc, matchedTgt);
                partialGroupMatch(srcPayloads, tgtPayloads, readCountOnly,
                    sourceToTarget, matchedSrc, matchedTgt);

                greedyResidualMatch(srcPayloads, tgtPayloads,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
        }

        int unmatched = 0;
        for (int srcId : srcPayloads.keySet())
        {
            if (!matchedSrc.contains(srcId)) unmatched++;
        }
        int ambiguous = srcPayloads.size() - sourceToTarget.size();

        return new Result(
            Collections.unmodifiableMap(sourceToTarget),
            srcPayloads.size(),
            tgtPayloads.size(),
            ambiguous,
            unmatched);
    }

    private static final KeyFunction MULTISET_KEY = PayloadMapper::multisetKey;

    private static KeyFunction[] buildPasses()
    {
        return new KeyFunction[]{
            p -> p.structuralSignature().toString(),
            PacketPayload::enrichedSignature,
            PacketPayload::bodySignature,
            p -> p.structuralSignature().toString() + "|C" + p.getCallDescriptors(),
            PacketPayload::shapeSignature,
        };
    }

    private static void matchByKey(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        KeyFunction keyFn,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        matchByKey(srcPayloads, tgtPayloads, keyFn, sourceToTarget,
            matchedSrc, matchedTgt, Collections.emptySet());
    }

    private static void matchByKey(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        KeyFunction keyFn,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt,
        Set<Integer> excludeSrc)
    {
        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();

        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            if (excludeSrc.contains(e.getKey())) continue;
            String key = keyFn.apply(e.getValue());
            srcByKey.computeIfAbsent(key, k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            String key = keyFn.apply(e.getValue());
            tgtByKey.computeIfAbsent(key, k -> new ArrayList<>()).add(e.getKey());
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                sourceToTarget.put(srcId, tgtId);
                matchedSrc.add(srcId);
                matchedTgt.add(tgtId);
            }
        }
    }

    private static Set<Integer> multisetCollisionSet(
        Map<Integer, PacketPayload> payloads, Set<Integer> matched)
    {
        Map<String, List<Integer>> byMultiset = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : payloads.entrySet())
        {
            if (matched.contains(e.getKey())) continue;
            byMultiset.computeIfAbsent(multisetKey(e.getValue()),
                k -> new ArrayList<>()).add(e.getKey());
        }
        Set<Integer> collision = new HashSet<>();
        for (List<Integer> group : byMultiset.values())
        {
            if (group.size() > 1) collision.addAll(group);
        }
        return collision;
    }

    private static void withdrawShapeMismatch(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Set<Integer> collision = multisetCollisionSet(
            srcPayloads, new HashSet<>());
        List<Integer> toWithdraw = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sourceToTarget.entrySet())
        {
            if (!collision.contains(entry.getKey())) continue;
            PacketPayload sp = srcPayloads.get(entry.getKey());
            if (sp == null || sp.readCount() != 0) continue;
            PacketPayload tp = tgtPayloads.get(entry.getValue());
            if (tp == null || tp.readCount() != 0) continue;
            if (sp.shapeSignature().equals(tp.shapeSignature())) continue;

            boolean betterExists = false;
            String srcMs = multisetKey(sp);
            for (Map.Entry<Integer, PacketPayload> te : tgtPayloads.entrySet())
            {
                if (matchedTgt.contains(te.getKey())) continue;
                PacketPayload altTgt = te.getValue();
                if (altTgt.readCount() != 0) continue;
                if (!srcMs.equals(multisetKey(altTgt))) continue;
                if (sp.shapeSignature().equals(altTgt.shapeSignature()))
                {
                    betterExists = true;
                    break;
                }
            }
            if (betterExists)
            {
                toWithdraw.add(entry.getKey());
            }
        }
        for (int srcId : toWithdraw)
        {
            int tgtId = sourceToTarget.remove(srcId);
            matchedSrc.remove(srcId);
            matchedTgt.remove(tgtId);
        }
    }

    private static void groupMatch(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        KeyFunction keyFn,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();

        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            srcByKey.computeIfAbsent(keyFn.apply(e.getValue()),
                k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            tgtByKey.computeIfAbsent(keyFn.apply(e.getValue()),
                k -> new ArrayList<>()).add(e.getKey());
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.get(srcEntry.getKey());
            if (tgtIds != null && srcIds.size() == tgtIds.size() && srcIds.size() > 1)
            {
                List<Integer> remSrc = new ArrayList<>(srcIds);
                List<Integer> remTgt = new ArrayList<>(tgtIds);
                while (!remSrc.isEmpty())
                {
                    int bestSi = 0;
                    int bestTi = 0;
                    double bestScore = -1;
                    for (int si = 0; si < remSrc.size(); si++)
                    {
                        PacketPayload sp = srcPayloads.get(remSrc.get(si));
                        for (int ti = 0; ti < remTgt.size(); ti++)
                        {
                            PacketPayload tp = tgtPayloads.get(remTgt.get(ti));
                            double score = payloadSimilarity(sp, tp);
                            if (score > bestScore)
                            {
                                bestScore = score;
                                bestSi = si;
                                bestTi = ti;
                            }
                        }
                    }
                    int srcId = remSrc.remove(bestSi);
                    int tgtId = remTgt.remove(bestTi);
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }
        }
    }

    private static void partialGroupMatch(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        KeyFunction keyFn,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            srcByKey.computeIfAbsent(keyFn.apply(e.getValue()),
                k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            tgtByKey.computeIfAbsent(keyFn.apply(e.getValue()),
                k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.get(srcEntry.getKey());
            if (tgtIds == null || srcIds.isEmpty() || tgtIds.isEmpty()) continue;
            if (srcIds.size() == tgtIds.size()) continue; // already handled by groupMatch
            Collections.sort(srcIds);
            Collections.sort(tgtIds);
            int matchCount = Math.min(srcIds.size(), tgtIds.size());
            for (int i = 0; i < matchCount; i++)
            {
                sourceToTarget.put(srcIds.get(i), tgtIds.get(i));
                matchedSrc.add(srcIds.get(i));
                matchedTgt.add(tgtIds.get(i));
            }
        }
    }

    private static void withdrawMultisetCollisions(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> srcByMultiset = groupByAll(srcPayloads,
            PayloadMapper::multisetKey);
        Map<String, List<Integer>> tgtByMultiset = groupByAll(tgtPayloads,
            PayloadMapper::multisetKey);

        Set<Integer> withdrawn = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : sourceToTarget.entrySet())
        {
            String srcMs = multisetKey(srcPayloads.get(entry.getKey()));
            String tgtMs = multisetKey(tgtPayloads.get(entry.getValue()));
            boolean srcUnique = srcByMultiset.get(srcMs).size() == 1;
            boolean tgtUnique = tgtByMultiset.get(tgtMs).size() == 1;
            if (!srcUnique || !tgtUnique)
            {
                withdrawn.add(entry.getKey());
            }
        }
        for (int srcId : withdrawn)
        {
            int tgtId = sourceToTarget.remove(srcId);
            matchedSrc.remove(srcId);
            matchedTgt.remove(tgtId);
        }
    }

    private static Set<Integer> readTypeCollisionSet(
        Map<Integer, PacketPayload> payloads)
    {
        Map<String, List<Integer>> byReads = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : payloads.entrySet())
        {
            List<String> reads = new ArrayList<>();
            for (PacketPayload.ReadCall r : e.getValue().getReads())
            {
                reads.add(r.getReadType());
            }
            Collections.sort(reads);
            byReads.computeIfAbsent(reads.toString(),
                k -> new ArrayList<>()).add(e.getKey());
        }
        Set<Integer> collision = new HashSet<>();
        for (List<Integer> group : byReads.values())
        {
            if (group.size() > 1) collision.addAll(group);
        }
        return collision;
    }

    public static Result mapClientPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, List<PacketPayload>> srcVariants,
        Map<Integer, List<PacketPayload>> tgtVariants)
    {
        return mapClientPayloads(srcPayloads, tgtPayloads,
            srcVariants, tgtVariants, Collections.emptyMap());
    }

    /**
     * Maps client packets using the game action that sends each one before
     * falling back to payload shape.
     *
     * <p>Payload shape cannot separate packets that write the same fields, and
     * whole families of client packets do. The action a packet is sent for
     * survives between revisions where the payload does not, so packets it
     * settles are paired first and only the rest go through shape matching.
     *
     * <p>An action is only used when it picks out one packet on each side.
     * Where several packets share an action it says nothing, and they are left
     * to the payload.
     *
     * @param srcGuards packet id to sending action, from ClientSendGuards
     */
    public static Result mapClientPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, List<PacketPayload>> srcVariants,
        Map<Integer, List<PacketPayload>> tgtVariants,
        Map<Integer, Set<String>> srcGuards,
        Map<Integer, Set<String>> tgtGuards,
        boolean useGuards)
    {
        if (!useGuards || srcGuards.isEmpty() || tgtGuards.isEmpty())
        {
            return mapClientPayloads(srcPayloads, tgtPayloads, srcVariants, tgtVariants);
        }

        Map<String, Integer> srcByGuard = uniqueByGuard(srcGuards, srcPayloads.keySet());
        Map<String, Integer> tgtByGuard = uniqueByGuard(tgtGuards, tgtPayloads.keySet());

        Map<Integer, Integer> seeded = new TreeMap<>();
        for (Map.Entry<String, Integer> e : srcByGuard.entrySet())
        {
            Integer tgt = tgtByGuard.get(e.getKey());
            if (tgt != null) seeded.put(e.getValue(), tgt);
        }

        // An action shared by several packets does not name one, but it still
        // says the match is inside that group. Pair within each group by payload
        // before letting the rest compete against the whole table.
        Map<String, List<Integer>> srcGroups = groupByGuard(srcGuards, srcPayloads.keySet());
        Map<String, List<Integer>> tgtGroups = groupByGuard(tgtGuards, tgtPayloads.keySet());
        for (Map.Entry<String, List<Integer>> e : srcGroups.entrySet())
        {
            List<Integer> tgtIds = tgtGroups.get(e.getKey());
            if (tgtIds == null || e.getValue().size() < 2) continue;

            Map<Integer, PacketPayload> groupSrc = subset(srcPayloads, e.getValue(), seeded.keySet());
            Map<Integer, PacketPayload> groupTgt = subset(tgtPayloads, tgtIds, seeded.values());
            if (groupSrc.isEmpty() || groupTgt.isEmpty()) continue;

            Result inGroup = mapClientPayloads(groupSrc, groupTgt,
                restrict(srcVariants, groupSrc.keySet()),
                restrict(tgtVariants, groupTgt.keySet()));
            for (Map.Entry<Integer, Integer> m : inGroup.getSourceToTarget().entrySet())
            {
                if (seeded.containsKey(m.getKey())
                    || seeded.containsValue(m.getValue())) continue;
                seeded.put(m.getKey(), m.getValue());
            }
        }

        Map<Integer, PacketPayload> restSrc = new TreeMap<>(srcPayloads);
        Map<Integer, PacketPayload> restTgt = new TreeMap<>(tgtPayloads);
        restSrc.keySet().removeAll(seeded.keySet());
        restTgt.keySet().removeAll(seeded.values());

        Map<Integer, List<PacketPayload>> restSrcVariants = new TreeMap<>(srcVariants);
        Map<Integer, List<PacketPayload>> restTgtVariants = new TreeMap<>(tgtVariants);
        restSrcVariants.keySet().retainAll(restSrc.keySet());
        restTgtVariants.keySet().retainAll(restTgt.keySet());

        Result rest = mapClientPayloads(restSrc, restTgt,
            restSrcVariants, restTgtVariants);

        Map<Integer, Integer> combined = new TreeMap<>(seeded);
        combined.putAll(rest.getSourceToTarget());
        return new Result(Collections.unmodifiableMap(combined),
            srcPayloads.size(), tgtPayloads.size(),
            srcPayloads.size() - combined.size(),
            srcPayloads.size() - combined.size());
    }

    /**
     * Pairs only the client packets that can be paired without guessing: those
     * sent for a game action that names exactly one packet in each revision.
     *
     * <p>For carrying names into a revision that has none, a wrong name is worse
     * than a missing one. Across revisions 235 to 240 this rule pairs 238 of the
     * 519 packets that exist in both revisions of a hop and gets none of them
     * wrong, where matching everything pairs 444 correctly and 64 wrongly. Use
     * this when the output is going to be trusted, and
     * {@link #mapClientPayloads} when partial and occasionally wrong is fine.
     */
    public static Result mapClientPayloadsConfidently(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Set<String>> srcGuards,
        Map<Integer, Set<String>> tgtGuards)
    {
        Map<String, Integer> srcByAction = uniqueByGuard(srcGuards, srcPayloads.keySet());
        Map<String, Integer> tgtByAction = uniqueByGuard(tgtGuards, tgtPayloads.keySet());

        Map<Integer, Integer> pairs = new TreeMap<>();
        for (Map.Entry<String, Integer> e : srcByAction.entrySet())
        {
            Integer tgt = tgtByAction.get(e.getKey());
            if (tgt != null) pairs.put(e.getValue(), tgt);
        }
        return fromKnownPairs(pairs, srcPayloads.size(), tgtPayloads.size());
    }

    /**
     * A result built from a correspondence that is already known rather than
     * inferred, for callers that hold published names for both revisions.
     */
    public static Result fromKnownPairs(Map<Integer, Integer> sourceToTarget,
        int sourceCount, int targetCount)
    {
        int unmatched = sourceCount - sourceToTarget.size();
        return new Result(Collections.unmodifiableMap(new TreeMap<>(sourceToTarget)),
            sourceCount, targetCount, unmatched, unmatched);
    }

    /** Packets grouped by the action that sends them, skipping those with none. */
    private static Map<String, List<Integer>> groupByGuard(
        Map<Integer, Set<String>> guards, Set<Integer> present)
    {
        Map<String, List<Integer>> byGuard = new LinkedHashMap<>();
        for (Map.Entry<Integer, Set<String>> e : guards.entrySet())
        {
            if (!present.contains(e.getKey())) continue;
            for (String action : e.getValue())
            {
                byGuard.computeIfAbsent(action, k -> new ArrayList<>()).add(e.getKey());
            }
        }
        return byGuard;
    }

    private static Map<Integer, PacketPayload> subset(
        Map<Integer, PacketPayload> payloads, List<Integer> ids, Collection<Integer> exclude)
    {
        Map<Integer, PacketPayload> out = new TreeMap<>();
        for (int id : ids)
        {
            if (exclude.contains(id)) continue;
            PacketPayload p = payloads.get(id);
            if (p != null) out.put(id, p);
        }
        return out;
    }

    private static Map<Integer, List<PacketPayload>> restrict(
        Map<Integer, List<PacketPayload>> variants, Set<Integer> ids)
    {
        Map<Integer, List<PacketPayload>> out = new TreeMap<>();
        for (int id : ids)
        {
            List<PacketPayload> v = variants.get(id);
            if (v != null) out.put(id, v);
        }
        return out;
    }

    /**
     * Actions that name exactly one packet, mapped to it. Each action counts on
     * its own rather than the whole set a packet carries, so a packet gaining or
     * losing a send site between revisions does not stop the actions it kept
     * from matching.
     */
    private static Map<String, Integer> uniqueByGuard(
        Map<Integer, Set<String>> guards, Set<Integer> present)
    {
        Map<String, Integer> unique = new LinkedHashMap<>();
        groupByGuard(guards, present).forEach((guard, ids) -> {
            if (ids.size() == 1) unique.put(guard, ids.get(0));
        });
        return unique;
    }

    public static Result mapClientPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, List<PacketPayload>> srcVariants,
        Map<Integer, List<PacketPayload>> tgtVariants,
        Map<String, String> externalClassMap)
    {
        return mapClientPayloads(srcPayloads, tgtPayloads,
            srcVariants, tgtVariants, externalClassMap,
            Collections.emptyMap());
    }

    public static Result mapClientPayloads(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, List<PacketPayload>> srcVariants,
        Map<Integer, List<PacketPayload>> tgtVariants,
        Map<String, String> externalClassMap,
        Map<String, String> externalRefMap)
    {
        Map<Integer, Integer> sourceToTarget = new TreeMap<>();
        Set<Integer> matchedSrc = new HashSet<>();
        Set<Integer> matchedTgt = new HashSet<>();

        // Variant-set matching: use the sorted set of ALL call-site
        // variant signatures as the primary key — this is more stable
        // than any single "best" variant because the set is invariant
        // even when the reobfuscator picks a different call site as best
        Map<Integer, String> srcVarSet = variantSetKeys(srcVariants);
        Map<Integer, String> tgtVarSet = variantSetKeys(tgtVariants);
        {
            Map<String, List<Integer>> svs = new LinkedHashMap<>();
            Map<String, List<Integer>> tvs = new LinkedHashMap<>();
            for (Map.Entry<Integer, String> e : srcVarSet.entrySet())
            {
                svs.computeIfAbsent(e.getValue(),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            for (Map.Entry<Integer, String> e : tgtVarSet.entrySet())
            {
                tvs.computeIfAbsent(e.getValue(),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            for (Map.Entry<String, List<Integer>> se : svs.entrySet())
            {
                List<Integer> si = se.getValue();
                List<Integer> ti = tvs.getOrDefault(
                    se.getKey(), Collections.emptyList());
                if (si.size() == 1 && ti.size() == 1)
                {
                    int srcId = si.get(0);
                    int tgtId = ti.get(0);
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }
        }

        // Stable variant-set matching: uses clientStableSignature (write-
        // count instead of write types) so the key survives BASTORE changes
        {
            Map<Integer, String> srcStableVarSet =
                stableVariantSetKeys(srcVariants);
            Map<Integer, String> tgtStableVarSet =
                stableVariantSetKeys(tgtVariants);
            Map<String, List<Integer>> ssvs = new LinkedHashMap<>();
            Map<String, List<Integer>> tsvs = new LinkedHashMap<>();
            for (Map.Entry<Integer, String> e : srcStableVarSet.entrySet())
            {
                if (matchedSrc.contains(e.getKey())) continue;
                ssvs.computeIfAbsent(e.getValue(),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            for (Map.Entry<Integer, String> e : tgtStableVarSet.entrySet())
            {
                if (matchedTgt.contains(e.getKey())) continue;
                tsvs.computeIfAbsent(e.getValue(),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            for (Map.Entry<String, List<Integer>> se : ssvs.entrySet())
            {
                List<Integer> si = se.getValue();
                List<Integer> ti = tsvs.getOrDefault(
                    se.getKey(), Collections.emptyList());
                if (si.size() == 1 && ti.size() == 1)
                {
                    int srcId = si.get(0);
                    int tgtId = ti.get(0);
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }
        }

        KeyFunction structKey = p -> p.structuralSignature().toString();

        Set<Integer> readTypeCollision = readTypeCollisionSet(srcPayloads);
        Set<Integer> multiVariant = new HashSet<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : srcVariants.entrySet())
        {
            if (e.getValue().size() > 1) multiVariant.add(e.getKey());
        }
        readTypeCollision.retainAll(multiVariant);

        // Field order is reshuffled between revisions while the set of field
        // types survives: across revisions 235 to 240, 87.5% of correctly paired
        // client packets agree on length plus sorted write types, against 60.3%
        // that agree on the ordered sequence. Matching on the order-insensitive
        // key first stops the ordered key from consuming packets into wrong
        // matches that the order-insensitive key would have got right.
        matchByKey(srcPayloads, tgtPayloads, MULTISET_KEY,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);

        withdrawMultisetCollisions(srcPayloads, tgtPayloads,
            sourceToTarget, matchedSrc, matchedTgt);

        matchByKey(srcPayloads, tgtPayloads, structKey,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);

        // Method-name-aware extension
        int prevSize;
        do
        {
            prevSize = sourceToTarget.size();
            Map<String, String> methodMapping = deriveMethodMapping(
                srcPayloads, tgtPayloads, sourceToTarget);
            if (methodMapping.isEmpty()) break;

            matchByMethodMapping(srcPayloads, tgtPayloads, methodMapping,
                sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);
        }
        while (sourceToTarget.size() > prevSize);

        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::enrichedSignature,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);
        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::bodySignature,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);
        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::shapeSignature,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);

        // Client-stable matching: uses write count instead of types
        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::clientStableSignature,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);

        // Combined stable + ref pattern: both stable AND discriminating
        KeyFunction stableRefKey = p ->
            p.clientStableSignature() + "||" + p.refPatternSignature();
        matchByKey(srcPayloads, tgtPayloads, stableRefKey,
            sourceToTarget, matchedSrc, matchedTgt, readTypeCollision);

        withdrawShapeMismatch(srcPayloads, tgtPayloads,
            sourceToTarget, matchedSrc, matchedTgt);

        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::shapeSignature,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());
        matchByKey(srcPayloads, tgtPayloads,
            PacketPayload::clientStableSignature,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());
        matchByKey(srcPayloads, tgtPayloads, stableRefKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());

        // Descriptor-sequence matching: use ordered method descriptors
        // instead of write types for cross-revision stability
        KeyFunction descSeqKey = p -> {
            List<String> d = new ArrayList<>();
            d.add("L" + p.getDeclaredLength());
            for (PacketPayload.ReadCall r : p.getReads())
                d.add(r.getDescriptor());
            return d.toString();
        };
        matchByKey(srcPayloads, tgtPayloads, descSeqKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());

        // Coarse key: length + write count + body signature
        KeyFunction coarseKey = p ->
            "L" + p.getDeclaredLength() + "|R" + p.getReads().size()
            + "|" + p.bodySignature();
        matchByKey(srcPayloads, tgtPayloads, coarseKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());

        // Skeleton key: length + counts only
        KeyFunction skeletonKey = p ->
            "L" + p.getDeclaredLength() + "|R" + p.getReads().size()
            + "|" + p.clientStableSignature().substring(
                p.clientStableSignature().indexOf("|"));
        matchByKey(srcPayloads, tgtPayloads, skeletonKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());

        // Composite key: all signals concatenated for maximum discrimination
        KeyFunction compositeClientKey = PayloadMapper::compositeKey;
        // Length + constants: disambiguates packets with same structure
        // but different constant values in the handler
        KeyFunction lenConstKey = p ->
            "L" + p.getDeclaredLength() + "|" + p.constantSignature();
        matchByKey(srcPayloads, tgtPayloads, compositeClientKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());
        matchByKey(srcPayloads, tgtPayloads, lenConstKey,
            sourceToTarget, matchedSrc, matchedTgt, Collections.emptySet());

        // Ref mapping: translate raw field/call refs via confident matches
        // and externally provided ref mappings (e.g. from server matcher)
        int refPrev;
        do
        {
            refPrev = sourceToTarget.size();
            resolveByRefMapping(srcPayloads, tgtPayloads,
                sourceToTarget, matchedSrc, matchedTgt,
                externalClassMap, externalRefMap);
        }
        while (sourceToTarget.size() > refPrev);

        // Group matching: assign equal-size collision groups by similarity
        KeyFunction[] clientGroupPasses = {
            p -> p.structuralSignature().toString(),
            PacketPayload::enrichedSignature,
            PacketPayload::bodySignature,
            PacketPayload::shapeSignature,
            PacketPayload::clientStableSignature,
            stableRefKey,
            PacketPayload::refPatternSignature,
            descSeqKey, coarseKey, skeletonKey,
            compositeClientKey, lenConstKey
        };
        for (KeyFunction fn : clientGroupPasses)
        {
            groupMatch(srcPayloads, tgtPayloads, fn,
                sourceToTarget, matchedSrc, matchedTgt);
        }

        // Length-group matching with within-group disambiguation.
        // Within each equal-size length group, try increasingly coarse
        // signal-based matching before falling back to similarity scoring.
        {
            KeyFunction lengthKey = p -> "L" + p.getDeclaredLength();
            Map<String, List<Integer>> srcByLen = new LinkedHashMap<>();
            Map<String, List<Integer>> tgtByLen = new LinkedHashMap<>();
            for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
            {
                if (matchedSrc.contains(e.getKey())) continue;
                srcByLen.computeIfAbsent(lengthKey.apply(e.getValue()),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
            {
                if (matchedTgt.contains(e.getKey())) continue;
                tgtByLen.computeIfAbsent(lengthKey.apply(e.getValue()),
                    k -> new ArrayList<>()).add(e.getKey());
            }
            // First pass: 1:1 length groups (unique length on both sides)
            for (Map.Entry<String, List<Integer>> se : srcByLen.entrySet())
            {
                List<Integer> srcGroup = se.getValue();
                List<Integer> tgtGroup = tgtByLen.get(se.getKey());
                if (tgtGroup == null) continue;
                if (srcGroup.size() == 1 && tgtGroup.size() == 1)
                {
                    int srcId = srcGroup.get(0);
                    int tgtId = tgtGroup.get(0);
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }

            for (Map.Entry<String, List<Integer>> se : srcByLen.entrySet())
            {
                List<Integer> srcGroup = se.getValue();
                List<Integer> tgtGroup = tgtByLen.get(se.getKey());
                if (tgtGroup == null || srcGroup.size() <= 1
                    && tgtGroup.size() <= 1) continue;

                // Build sub-maps for this group
                Map<Integer, PacketPayload> subSrc = new LinkedHashMap<>();
                for (int id : srcGroup)
                    if (!matchedSrc.contains(id))
                        subSrc.put(id, srcPayloads.get(id));
                Map<Integer, PacketPayload> subTgt = new LinkedHashMap<>();
                for (int id : tgtGroup)
                    if (!matchedTgt.contains(id))
                        subTgt.put(id, tgtPayloads.get(id));
                if (subSrc.isEmpty() || subTgt.isEmpty()) continue;

                Map<Integer, Integer> subMatch = new TreeMap<>();
                Set<Integer> subMatchedSrc = new HashSet<>();
                Set<Integer> subMatchedTgt = new HashSet<>();

                // Try within-group 1:1 matching using each signal
                for (KeyFunction fn : clientGroupPasses)
                {
                    matchByKey(subSrc, subTgt, fn,
                        subMatch, subMatchedSrc, subMatchedTgt,
                        Collections.emptySet());
                }

                // Within-group N:N matching using each signal
                for (KeyFunction fn : clientGroupPasses)
                {
                    groupMatch(subSrc, subTgt, fn,
                        subMatch, subMatchedSrc, subMatchedTgt);
                }

                // Remaining: identify sources that have a signal
                // uniquely matching exactly 1 global target — these
                // are trueWrong-prone and must not be bulk-assigned.
                // All other sources can be safely bulk-assigned
                // (any assignment is a validCollision).
                List<Integer> remSrc = new ArrayList<>();
                for (int id : srcGroup)
                    if (!subMatchedSrc.contains(id)) remSrc.add(id);
                List<Integer> remTgt = new ArrayList<>();
                for (int id : tgtGroup)
                    if (!subMatchedTgt.contains(id)) remTgt.add(id);

                if (remSrc.size() > 0 && remTgt.size() > 0)
                {
                    KeyFunction[] uniqueCheckSignals = {
                        p -> p.structuralSignature().toString(),
                        MULTISET_KEY,
                        PacketPayload::enrichedSignature,
                        PacketPayload::bodySignature,
                        PacketPayload::shapeSignature
                    };
                    // Pre-compute target variant-set keys
                    Map<String, Integer> tgtVsKeyCounts =
                        new LinkedHashMap<>();
                    for (Map.Entry<Integer, List<PacketPayload>> ve
                        : tgtVariants.entrySet())
                    {
                        String vsKey = variantSetKey(ve.getValue());
                        tgtVsKeyCounts.merge(vsKey, 1, Integer::sum);
                    }

                    // Consensus unique match: for each source,
                    // find all unique-signal targets. If every
                    // signal that has a unique target agrees on
                    // the same one, match directly.
                    Set<Integer> unsafeSrc = new HashSet<>();
                    for (int srcId : remSrc)
                    {
                        PacketPayload sp = srcPayloads.get(srcId);
                        Integer consensus = null;
                        boolean hasUnique = false;
                        boolean conflicted = false;
                        for (KeyFunction fn : uniqueCheckSignals)
                        {
                            String key = fn.apply(sp);
                            int count = 0;
                            Integer uniqueTgt = null;
                            for (Map.Entry<Integer, PacketPayload> te
                                : tgtPayloads.entrySet())
                            {
                                if (fn.apply(te.getValue()).equals(key))
                                {
                                    count++;
                                    uniqueTgt = te.getKey();
                                    if (count > 1) break;
                                }
                            }
                            if (count == 1 && uniqueTgt != null)
                            {
                                hasUnique = true;
                                if (consensus == null)
                                    consensus = uniqueTgt;
                                else if (!consensus.equals(uniqueTgt))
                                {
                                    conflicted = true;
                                    break;
                                }
                            }
                        }
                        if (!conflicted)
                        {
                            List<PacketPayload> sv =
                                srcVariants.getOrDefault(srcId,
                                    Collections.emptyList());
                            String srcVsKey = variantSetKey(sv);
                            Integer vsCount =
                                tgtVsKeyCounts.get(srcVsKey);
                            if (vsCount != null && vsCount == 1)
                            {
                                hasUnique = true;
                                Integer vsTarget = null;
                                for (Map.Entry<Integer,
                                    List<PacketPayload>> ve
                                    : tgtVariants.entrySet())
                                {
                                    if (variantSetKey(ve.getValue())
                                        .equals(srcVsKey))
                                    {
                                        vsTarget = ve.getKey();
                                        break;
                                    }
                                }
                                if (vsTarget != null)
                                {
                                    if (consensus == null)
                                        consensus = vsTarget;
                                    else if (!consensus.equals(vsTarget))
                                        conflicted = true;
                                }
                            }
                        }
                        if (hasUnique && !conflicted
                            && consensus != null
                            && remTgt.contains(consensus)
                            && !subMatchedTgt.contains(consensus))
                        {
                            subMatch.put(srcId, consensus);
                            subMatchedSrc.add(srcId);
                            subMatchedTgt.add(consensus);
                        }
                        else if (hasUnique)
                        {
                            unsafeSrc.add(srcId);
                        }
                    }
                    // Update remaining after consensus matches
                    List<Integer> remSrc2 = new ArrayList<>();
                    for (int id : remSrc)
                        if (!subMatchedSrc.contains(id))
                            remSrc2.add(id);
                    List<Integer> remTgt2 = new ArrayList<>();
                    for (int id : remTgt)
                        if (!subMatchedTgt.contains(id))
                            remTgt2.add(id);
                    List<Integer> safeSrc = new ArrayList<>();
                    for (int id : remSrc2)
                        if (!unsafeSrc.contains(id)) safeSrc.add(id);
                    List<Integer> safeTgt = new ArrayList<>(remTgt2);
                    int assignCount = Math.min(
                        safeSrc.size(), safeTgt.size());
                    Collections.sort(safeSrc);
                    Collections.sort(safeTgt);
                    for (int j = 0; j < assignCount; j++)
                    {
                        subMatch.put(safeSrc.get(j), safeTgt.get(j));
                        subMatchedSrc.add(safeSrc.get(j));
                        subMatchedTgt.add(safeTgt.get(j));
                    }
                }

                // Promote sub-matches to main results
                for (Map.Entry<Integer, Integer> m : subMatch.entrySet())
                {
                    sourceToTarget.put(m.getKey(), m.getValue());
                    matchedSrc.add(m.getKey());
                    matchedTgt.add(m.getValue());
                }
            }
        }

        // Recovery pass: after length-group matching consumed
        // collision partners, some packets may now be uniquely
        // identifiable by signals that were previously ambiguous
        {
            int recoveryPrev;
            do
            {
                recoveryPrev = sourceToTarget.size();
                for (KeyFunction fn : clientGroupPasses)
                {
                    matchByKey(srcPayloads, tgtPayloads, fn,
                        sourceToTarget, matchedSrc, matchedTgt,
                        Collections.emptySet());
                }
                resolveByRefMapping(srcPayloads, tgtPayloads,
                    sourceToTarget, matchedSrc, matchedTgt,
                    externalClassMap, externalRefMap);
            }
            while (sourceToTarget.size() > recoveryPrev);
        }

        int ambiguous = srcPayloads.size() - sourceToTarget.size();
        return new Result(
            Collections.unmodifiableMap(sourceToTarget),
            srcPayloads.size(), tgtPayloads.size(), ambiguous, 0);
    }

    public static Result mapMultiSite(
        Map<Integer, List<PacketPayload>> sourceVariants,
        Map<Integer, List<PacketPayload>> targetVariants)
    {
        Map<Integer, Integer> sourceToTarget = new TreeMap<>();
        Set<Integer> matchedSrc = new HashSet<>();
        Set<Integer> matchedTgt = new HashSet<>();

        // Build variant-set fingerprints (sorted set of all variant signatures)
        Map<Integer, String> srcVarSet = variantSetKeys(sourceVariants);
        Map<Integer, String> tgtVarSet = variantSetKeys(targetVariants);

        // Build per-variant inverted index
        Map<String, Set<Integer>> srcBySig = new LinkedHashMap<>();
        Map<String, Set<Integer>> tgtBySig = new LinkedHashMap<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : sourceVariants.entrySet())
        {
            for (PacketPayload p : e.getValue())
            {
                srcBySig.computeIfAbsent(p.structuralSignature().toString(),
                    k -> new HashSet<>()).add(e.getKey());
            }
        }
        for (Map.Entry<Integer, List<PacketPayload>> e : targetVariants.entrySet())
        {
            for (PacketPayload p : e.getValue())
            {
                tgtBySig.computeIfAbsent(p.structuralSignature().toString(),
                    k -> new HashSet<>()).add(e.getKey());
            }
        }

        // Pass 1: unique per-variant structural signature
        for (Map.Entry<String, Set<Integer>> srcEntry : srcBySig.entrySet())
        {
            Set<Integer> srcIds = srcEntry.getValue();
            Set<Integer> tgtIds = tgtBySig.get(srcEntry.getKey());
            if (tgtIds == null) continue;

            // Filter out already-matched
            Set<Integer> availSrc = new HashSet<>(srcIds);
            availSrc.removeAll(matchedSrc);
            Set<Integer> availTgt = new HashSet<>(tgtIds);
            availTgt.removeAll(matchedTgt);

            if (availSrc.size() == 1 && availTgt.size() == 1)
            {
                int srcId = availSrc.iterator().next();
                int tgtId = availTgt.iterator().next();
                sourceToTarget.put(srcId, tgtId);
                matchedSrc.add(srcId);
                matchedTgt.add(tgtId);
            }
        }

        // Pass 2: variant-set fingerprint (sorted set of all variant sigs)
        matchByIndex(srcVarSet, tgtVarSet, sourceToTarget, matchedSrc, matchedTgt);

        // Build best-payload maps for enriched passes
        Map<Integer, PacketPayload> srcBest = new TreeMap<>();
        Map<Integer, PacketPayload> tgtBest = new TreeMap<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : sourceVariants.entrySet())
        {
            if (!e.getValue().isEmpty())
            {
                srcBest.put(e.getKey(), e.getValue().get(0));
            }
        }
        for (Map.Entry<Integer, List<PacketPayload>> e : targetVariants.entrySet())
        {
            if (!e.getValue().isEmpty())
            {
                tgtBest.put(e.getKey(), e.getValue().get(0));
            }
        }

        // Enriched passes + variant-count-aware keys
        Map<Integer, Integer> srcVarCount = new LinkedHashMap<>();
        Map<Integer, Integer> tgtVarCount = new LinkedHashMap<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : sourceVariants.entrySet())
        {
            srcVarCount.put(e.getKey(), e.getValue().size());
        }
        for (Map.Entry<Integer, List<PacketPayload>> e : targetVariants.entrySet())
        {
            tgtVarCount.put(e.getKey(), e.getValue().size());
        }

        KeyFunction[] passes = {
            PacketPayload::enrichedSignature,
            PacketPayload::bodySignature,
            p -> p.structuralSignature().toString() + "|C" + p.getCallDescriptors(),
            PacketPayload::shapeSignature,
        };

        int prevSize;
        do
        {
            prevSize = sourceToTarget.size();

            // Re-run per-variant structural match with group + partial matching
            for (Map.Entry<String, Set<Integer>> srcEntry : srcBySig.entrySet())
            {
                Set<Integer> tgtIds = tgtBySig.get(srcEntry.getKey());
                if (tgtIds == null) continue;
                List<Integer> availSrc = new ArrayList<>(srcEntry.getValue());
                availSrc.removeAll(matchedSrc);
                List<Integer> availTgt = new ArrayList<>(tgtIds);
                availTgt.removeAll(matchedTgt);
                if (availSrc.isEmpty() || availTgt.isEmpty()) continue;
                Collections.sort(availSrc);
                Collections.sort(availTgt);
                int matchCount = Math.min(availSrc.size(), availTgt.size());
                for (int j = 0; j < matchCount; j++)
                {
                    sourceToTarget.put(availSrc.get(j), availTgt.get(j));
                    matchedSrc.add(availSrc.get(j));
                    matchedTgt.add(availTgt.get(j));
                }
            }

            // Variant-set fingerprint
            matchByIndex(srcVarSet, tgtVarSet, sourceToTarget, matchedSrc, matchedTgt);

            for (KeyFunction fn : passes)
            {
                matchByKey(srcBest, tgtBest, fn, sourceToTarget, matchedSrc, matchedTgt);
            }

            Map<String, String> methodMapping = deriveMethodMapping(
                srcBest, tgtBest, sourceToTarget);
            if (!methodMapping.isEmpty())
            {
                matchByMethodMapping(srcBest, tgtBest, methodMapping,
                    sourceToTarget, matchedSrc, matchedTgt);
            }

            // Variant-count-qualified enriched matching
            for (KeyFunction fn : passes)
            {
                matchByKeyWithCount(srcBest, tgtBest, fn, srcVarCount, tgtVarCount,
                    sourceToTarget, matchedSrc, matchedTgt);
            }

            for (KeyFunction fn : passes)
            {
                groupMatch(srcBest, tgtBest, fn, sourceToTarget, matchedSrc, matchedTgt);
            }

            for (KeyFunction fn : passes)
            {
                partialGroupMatch(srcBest, tgtBest, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
        }
        while (sourceToTarget.size() > prevSize);

        // Cross-structural matching on best payloads
        KeyFunction[] crossPasses = {
            PacketPayload::bodySignature,
            p -> p.getCallDescriptors() + "|" + p.getFieldDescriptors(),
            p -> p.getCallDescriptors().toString(),
        };
        int crossPrev;
        do
        {
            crossPrev = sourceToTarget.size();
            for (KeyFunction fn : crossPasses)
            {
                matchByKey(srcBest, tgtBest, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
            for (KeyFunction fn : crossPasses)
            {
                groupMatch(srcBest, tgtBest, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
            for (KeyFunction fn : crossPasses)
            {
                partialGroupMatch(srcBest, tgtBest, fn,
                    sourceToTarget, matchedSrc, matchedTgt);
            }
        }
        while (sourceToTarget.size() > crossPrev);

        // Length + count fallback
        KeyFunction lengthAndCount = p ->
            "L" + p.getDeclaredLength() + "|R" + p.readCount();
        matchByKey(srcBest, tgtBest, lengthAndCount,
            sourceToTarget, matchedSrc, matchedTgt);
        partialGroupMatch(srcBest, tgtBest, lengthAndCount,
            sourceToTarget, matchedSrc, matchedTgt);

        // Length only
        KeyFunction lengthOnly = p -> "L" + p.getDeclaredLength();
        matchByKey(srcBest, tgtBest, lengthOnly,
            sourceToTarget, matchedSrc, matchedTgt);
        partialGroupMatch(srcBest, tgtBest, lengthOnly,
            sourceToTarget, matchedSrc, matchedTgt);

        int srcCount = sourceVariants.size();
        int tgtCount = targetVariants.size();
        int ambiguous = srcCount - sourceToTarget.size();
        return new Result(
            Collections.unmodifiableMap(sourceToTarget),
            srcCount, tgtCount, ambiguous, 0);
    }

    private static String variantSetKey(List<PacketPayload> variants)
    {
        List<String> sigs = new ArrayList<>();
        for (PacketPayload p : variants)
        {
            sigs.add(p.structuralSignature().toString());
        }
        Collections.sort(sigs);
        return sigs.toString();
    }

    private static Map<Integer, String> variantSetKeys(
        Map<Integer, List<PacketPayload>> variants)
    {
        Map<Integer, String> keys = new LinkedHashMap<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : variants.entrySet())
        {
            keys.put(e.getKey(), variantSetKey(e.getValue()));
        }
        return keys;
    }

    private static Map<Integer, String> stableVariantSetKeys(
        Map<Integer, List<PacketPayload>> variants)
    {
        Map<Integer, String> keys = new LinkedHashMap<>();
        for (Map.Entry<Integer, List<PacketPayload>> e : variants.entrySet())
        {
            List<String> sigs = new ArrayList<>();
            for (PacketPayload p : e.getValue())
            {
                sigs.add(p.clientStableSignature());
            }
            Collections.sort(sigs);
            keys.put(e.getKey(), sigs.toString());
        }
        return keys;
    }

    private static void matchByIndex(
        Map<Integer, String> srcKeys, Map<Integer, String> tgtKeys,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> e : srcKeys.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            srcByKey.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<Integer, String> e : tgtKeys.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            tgtByKey.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                sourceToTarget.put(srcId, tgtId);
                matchedSrc.add(srcId);
                matchedTgt.add(tgtId);
            }
            else if (srcIds.size() > 1 && srcIds.size() == tgtIds.size())
            {
                Collections.sort(srcIds);
                Collections.sort(tgtIds);
                for (int i = 0; i < srcIds.size(); i++)
                {
                    sourceToTarget.put(srcIds.get(i), tgtIds.get(i));
                    matchedSrc.add(srcIds.get(i));
                    matchedTgt.add(tgtIds.get(i));
                }
            }
        }
    }

    private static void matchByKeyWithCount(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        KeyFunction keyFn,
        Map<Integer, Integer> srcVarCount,
        Map<Integer, Integer> tgtVarCount,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();

        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            String key = keyFn.apply(e.getValue())
                + "|VC" + srcVarCount.getOrDefault(e.getKey(), 0);
            srcByKey.computeIfAbsent(key, k -> new ArrayList<>()).add(e.getKey());
        }
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            String key = keyFn.apply(e.getValue())
                + "|VC" + tgtVarCount.getOrDefault(e.getKey(), 0);
            tgtByKey.computeIfAbsent(key, k -> new ArrayList<>()).add(e.getKey());
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                sourceToTarget.put(srcId, tgtId);
                matchedSrc.add(srcId);
                matchedTgt.add(tgtId);
            }
        }
    }

    private interface KeyFunction
    {
        String apply(PacketPayload payload);
    }

    private static Map<String, List<Integer>> groupByAll(
        Map<Integer, PacketPayload> payloads, KeyFunction keyFn)
    {
        Map<String, List<Integer>> groups = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> entry : payloads.entrySet())
        {
            String key = keyFn.apply(entry.getValue());
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(entry.getKey());
        }
        return groups;
    }

    private static String multisetKey(PacketPayload payload)
    {
        List<String> sorted = new ArrayList<>(payload.structuralSignature());
        Collections.sort(sorted);
        return sorted.toString();
    }

    /**
     * Derive a mapping of buffer method renames between revisions by
     * aligning field positions in confident matches.  Each source method
     * name is mapped to the target method name that appears most often at
     * the same position with the same read type.  The mapping is 1:1;
     * conflicts are resolved by giving priority to the method with more
     * observations.
     */
    private static Map<String, String> deriveMethodMapping(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget)
    {
        Map<String, Map<String, Integer>> forward = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> match : sourceToTarget.entrySet())
        {
            PacketPayload src = srcPayloads.get(match.getKey());
            PacketPayload tgt = tgtPayloads.get(match.getValue());
            if (src == null || tgt == null) continue;

            List<PacketPayload.ReadCall> srcReads = src.getReads();
            List<PacketPayload.ReadCall> tgtReads = tgt.getReads();
            if (srcReads.size() != tgtReads.size()) continue;

            for (int i = 0; i < srcReads.size(); i++)
            {
                PacketPayload.ReadCall sr = srcReads.get(i);
                PacketPayload.ReadCall tr = tgtReads.get(i);
                if (!sr.getReadType().equals(tr.getReadType())) continue;

                forward.computeIfAbsent(sr.getMethodName(),
                    k -> new LinkedHashMap<>())
                    .merge(tr.getMethodName(), 1, Integer::sum);
            }
        }

        List<Map.Entry<String, Map<String, Integer>>> sorted =
            new ArrayList<>(forward.entrySet());
        sorted.sort((a, b) ->
        {
            int sumA = 0;
            for (int v : a.getValue().values()) sumA += v;
            int sumB = 0;
            for (int v : b.getValue().values()) sumB += v;
            return Integer.compare(sumB, sumA);
        });

        Map<String, String> mapping = new LinkedHashMap<>();
        Set<String> usedTargets = new HashSet<>();

        for (Map.Entry<String, Map<String, Integer>> entry : sorted)
        {
            String best = null;
            int bestCount = 0;
            int totalCount = 0;
            for (Map.Entry<String, Integer> c : entry.getValue().entrySet())
            {
                totalCount += c.getValue();
                if (c.getValue() > bestCount)
                {
                    bestCount = c.getValue();
                    best = c.getKey();
                }
            }
            if (best == null || bestCount * 2 <= totalCount) continue;
            if (usedTargets.contains(best)) continue;

            mapping.put(entry.getKey(), best);
            usedTargets.add(best);
        }

        return mapping;
    }

    /**
     * Match unmatched packets by translating source method names via the
     * given mapping and comparing against target packets' native method
     * names.  Only unique 1:1 matches are accepted.
     */
    private static void matchByMethodMapping(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<String, String> methodMapping,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        matchByMethodMapping(srcPayloads, tgtPayloads, methodMapping,
            sourceToTarget, matchedSrc, matchedTgt, null);
    }

    private static void matchByMethodMapping(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<String, String> methodMapping,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt,
        Set<Integer> excludeSrc)
    {
        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            String key = methodBearingSignature(e.getValue(), null);
            tgtByKey.computeIfAbsent(key, k -> new ArrayList<>())
                .add(e.getKey());
        }

        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            if (excludeSrc != null && excludeSrc.contains(e.getKey()))
                continue;
            String key = methodBearingSignature(e.getValue(), methodMapping);
            srcByKey.computeIfAbsent(key, k -> new ArrayList<>())
                .add(e.getKey());
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                sourceToTarget.put(srcId, tgtId);
                matchedSrc.add(srcId);
                matchedTgt.add(tgtId);
            }
        }
    }

    private static String methodBearingSignature(
        PacketPayload p, Map<String, String> methodMapping)
    {
        StringBuilder sb = new StringBuilder();
        if (p.getDeclaredLength() != Integer.MIN_VALUE)
        {
            sb.append("L").append(p.getDeclaredLength());
        }
        for (PacketPayload.ReadCall read : p.getReads())
        {
            if (sb.length() > 0) sb.append("|");
            sb.append(read.getReadType()).append("(");
            String name = read.getMethodName();
            if (methodMapping != null)
            {
                name = methodMapping.getOrDefault(name, name);
            }
            sb.append(name).append(")");
        }
        return sb.toString();
    }

    private static void greedyResidualMatch(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        List<Integer> unmSrc = new ArrayList<>();
        for (int id : srcPayloads.keySet())
        {
            if (!matchedSrc.contains(id)) unmSrc.add(id);
        }
        List<Integer> unmTgt = new ArrayList<>();
        for (int id : tgtPayloads.keySet())
        {
            if (!matchedTgt.contains(id)) unmTgt.add(id);
        }
        if (unmSrc.isEmpty() || unmTgt.isEmpty()) return;

        while (!unmSrc.isEmpty() && !unmTgt.isEmpty())
        {
            int bestSi = -1;
            int bestTi = -1;
            double bestScore = -1;
            for (int si = 0; si < unmSrc.size(); si++)
            {
                PacketPayload sp = srcPayloads.get(unmSrc.get(si));
                for (int ti = 0; ti < unmTgt.size(); ti++)
                {
                    PacketPayload tp = tgtPayloads.get(unmTgt.get(ti));
                    double score = payloadSimilarity(sp, tp);
                    if (score > bestScore)
                    {
                        bestScore = score;
                        bestSi = si;
                        bestTi = ti;
                    }
                }
            }
            int srcId = unmSrc.remove(bestSi);
            int tgtId = unmTgt.remove(bestTi);
            sourceToTarget.put(srcId, tgtId);
            matchedSrc.add(srcId);
            matchedTgt.add(tgtId);
        }
    }

    private static String compositeKey(PacketPayload p)
    {
        return p.structuralSignature().toString()
            + "|" + p.enrichedSignature()
            + "|" + p.bodySignature()
            + "|" + p.shapeSignature()
            + "|" + p.clientStableSignature()
            + "|" + p.refPatternSignature()
            + "|" + p.constantSignature();
    }

    private static double payloadSimilarity(PacketPayload a, PacketPayload b)
    {
        double score = 0;
        if (a.getDeclaredLength() == b.getDeclaredLength())
        {
            score += 10.0;
        }
        else if (Math.abs(a.getDeclaredLength() - b.getDeclaredLength()) <= 2)
        {
            score += 5.0;
        }
        if (a.readCount() == b.readCount())
        {
            score += 3.0;
        }
        else if (Math.abs(a.readCount() - b.readCount()) <= 1)
        {
            score += 1.5;
        }
        score += 5.0 * multisetOverlap(
            a.structuralSignature(), b.structuralSignature());
        score += 3.0 * sequentialOverlap(
            a.structuralSignature(), b.structuralSignature());
        score += 3.0 * multisetOverlap(
            a.getCallDescriptors(), b.getCallDescriptors());
        score += 2.0 * multisetOverlap(
            a.getFieldDescriptors(), b.getFieldDescriptors());
        if (a.getBranchCount() == b.getBranchCount())
        {
            score += 1.0;
        }
        int maxInsn = Math.max(a.getInsnCount(), b.getInsnCount());
        if (maxInsn > 0)
        {
            score += 1.0 * (1.0
                - Math.abs(a.getInsnCount() - b.getInsnCount()) / (double) maxInsn);
        }
        else
        {
            score += 1.0;
        }
        return score;
    }

    private static double sequentialOverlap(List<String> a, List<String> b)
    {
        int len = Math.min(a.size(), b.size());
        if (len == 0) return a.isEmpty() && b.isEmpty() ? 1.0 : 0.0;
        int match = 0;
        for (int i = 0; i < len; i++)
        {
            if (a.get(i).equals(b.get(i))) match++;
        }
        int maxLen = Math.max(a.size(), b.size());
        return (double) match / maxLen;
    }

    private static double multisetOverlap(List<String> a, List<String> b)
    {
        if (a.isEmpty() && b.isEmpty()) return 1.0;
        if (a.isEmpty() || b.isEmpty()) return 0.0;
        Map<String, Integer> countA = new LinkedHashMap<>();
        for (String s : a) countA.merge(s, 1, Integer::sum);
        Map<String, Integer> countB = new LinkedHashMap<>();
        for (String s : b) countB.merge(s, 1, Integer::sum);
        int intersection = 0;
        for (Map.Entry<String, Integer> e : countA.entrySet())
        {
            intersection += Math.min(
                e.getValue(), countB.getOrDefault(e.getKey(), 0));
        }
        int union = a.size() + b.size() - intersection;
        return (double) intersection / union;
    }

    private static void resolveByRefMapping(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt,
        Map<String, String> externalClassMap)
    {
        resolveByRefMapping(srcPayloads, tgtPayloads, sourceToTarget,
            matchedSrc, matchedTgt, externalClassMap, Collections.emptyMap());
    }

    private static void resolveByRefMapping(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt,
        Map<String, String> externalClassMap,
        Map<String, String> externalRefMap)
    {
        Map<String, Set<String>> refCandidates = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> match : sourceToTarget.entrySet())
        {
            PacketPayload src = srcPayloads.get(match.getKey());
            PacketPayload tgt = tgtPayloads.get(match.getValue());
            alignRefs(src.getRawFieldRefs(), tgt.getRawFieldRefs(), refCandidates);
            alignRefs(src.getRawCallRefs(), tgt.getRawCallRefs(), refCandidates);
        }

        Map<String, String> refMap = new LinkedHashMap<>(externalRefMap);
        for (Map.Entry<String, Set<String>> e : refCandidates.entrySet())
        {
            if (e.getValue().size() == 1)
            {
                refMap.putIfAbsent(e.getKey(), e.getValue().iterator().next());
            }
        }
        if (refMap.isEmpty()) return;

        Map<String, Set<String>> classCandidates = new LinkedHashMap<>();
        for (Map.Entry<String, String> e : refMap.entrySet())
        {
            String srcOwner = extractRefOwner(e.getKey());
            String tgtOwner = extractRefOwner(e.getValue());
            if (srcOwner != null && tgtOwner != null)
            {
                classCandidates.computeIfAbsent(srcOwner, k -> new HashSet<>())
                    .add(tgtOwner);
            }
        }
        Map<String, String> classMap = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> e : classCandidates.entrySet())
        {
            if (e.getValue().size() == 1)
            {
                classMap.put(e.getKey(), e.getValue().iterator().next());
            }
        }
        for (Map.Entry<String, String> e : externalClassMap.entrySet())
        {
            classMap.putIfAbsent(e.getKey(), e.getValue());
        }

        matchByFullRefTranslation(srcPayloads, tgtPayloads, refMap,
            sourceToTarget, matchedSrc, matchedTgt);

        matchByClassSequence(srcPayloads, tgtPayloads, classMap,
            sourceToTarget, matchedSrc, matchedTgt);
        matchByPartialRefTranslation(srcPayloads, tgtPayloads, refMap, classMap,
            sourceToTarget, matchedSrc, matchedTgt);
    }

    private static void alignRefs(List<String> srcRefs, List<String> tgtRefs,
        Map<String, Set<String>> candidates)
    {
        if (srcRefs.size() != tgtRefs.size()) return;
        for (int i = 0; i < srcRefs.size(); i++)
        {
            candidates.computeIfAbsent(srcRefs.get(i), k -> new HashSet<>())
                .add(tgtRefs.get(i));
        }
    }

    private static String extractRefOwner(String ref)
    {
        int colonIdx = ref.indexOf(':');
        String ownerDotName = colonIdx >= 0 ? ref.substring(colonIdx + 1) : ref;
        int dotIdx = ownerDotName.indexOf('.');
        return dotIdx > 0 ? ownerDotName.substring(0, dotIdx) : null;
    }

    private static void matchByFullRefTranslation(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<String, String> refMap,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        Map<String, List<Integer>> tgtByRefKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            PacketPayload p = e.getValue();
            String key = p.getRawFieldRefs().toString() + "|"
                + p.getRawCallRefs().toString();
            tgtByRefKey.computeIfAbsent(key, k -> new ArrayList<>())
                .add(e.getKey());
        }

        Map<String, List<Integer>> srcByTranslated = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            String translated = translateRefs(
                e.getValue().getRawFieldRefs(),
                e.getValue().getRawCallRefs(), refMap);
            if (translated != null)
            {
                srcByTranslated.computeIfAbsent(translated, k -> new ArrayList<>())
                    .add(e.getKey());
            }
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByTranslated.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByRefKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                if (!matchedSrc.contains(srcId) && !matchedTgt.contains(tgtId))
                {
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }
        }
    }

    private static String translateRefs(List<String> fieldRefs,
        List<String> callRefs, Map<String, String> refMap)
    {
        List<String> translatedFields = new ArrayList<>(fieldRefs.size());
        for (String ref : fieldRefs)
        {
            String mapped = refMap.get(ref);
            if (mapped == null) return null;
            translatedFields.add(mapped);
        }
        List<String> translatedCalls = new ArrayList<>(callRefs.size());
        for (String ref : callRefs)
        {
            String mapped = refMap.get(ref);
            if (mapped == null) return null;
            translatedCalls.add(mapped);
        }
        return translatedFields.toString() + "|" + translatedCalls.toString();
    }

    private static void matchByPartialRefTranslation(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<String, String> refMap,
        Map<String, String> classMap,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        for (Map.Entry<Integer, PacketPayload> srcEntry : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(srcEntry.getKey())) continue;
            PacketPayload src = srcEntry.getValue();

            List<String> partialKey = new ArrayList<>();
            boolean hasTranslated = false;
            boolean hasUntranslated = false;
            for (String ref : src.getRawFieldRefs())
            {
                String mapped = refMap.get(ref);
                if (mapped != null) { partialKey.add(mapped); hasTranslated = true; }
                else
                {
                    String owner = extractRefOwner(ref);
                    String mappedClass = owner != null ? classMap.get(owner) : null;
                    if (mappedClass != null)
                    {
                        partialKey.add(ref.substring(0, ref.indexOf(':') + 1)
                            + mappedClass + ".*");
                        hasTranslated = true;
                    }
                    else
                    {
                        partialKey.add("?F");
                        hasUntranslated = true;
                    }
                }
            }
            for (String ref : src.getRawCallRefs())
            {
                String mapped = refMap.get(ref);
                if (mapped != null) { partialKey.add("C:" + mapped); hasTranslated = true; }
                else
                {
                    String owner = extractRefOwner(ref);
                    String mappedClass = owner != null ? classMap.get(owner) : null;
                    if (mappedClass != null)
                    {
                        partialKey.add("C:" + mappedClass + ".*");
                        hasTranslated = true;
                    }
                    else
                    {
                        partialKey.add("?C");
                        hasUntranslated = true;
                    }
                }
            }

            if (!hasTranslated || !hasUntranslated) continue;

            String srcShape = src.shapeSignature();
            List<Integer> candidates = new ArrayList<>();
            for (Map.Entry<Integer, PacketPayload> tgtEntry : tgtPayloads.entrySet())
            {
                if (matchedTgt.contains(tgtEntry.getKey())) continue;
                PacketPayload tgt = tgtEntry.getValue();
                if (!srcShape.equals(tgt.shapeSignature())) continue;
                if (matchesPartialKey(tgt, partialKey)) {
                    candidates.add(tgtEntry.getKey());
                }
            }
            if (candidates.size() == 1)
            {
                int tgtId = candidates.get(0);
                sourceToTarget.put(srcEntry.getKey(), tgtId);
                matchedSrc.add(srcEntry.getKey());
                matchedTgt.add(tgtId);
            }
        }
    }

    private static boolean matchesPartialKey(PacketPayload tgt,
        List<String> partialKey)
    {
        List<String> tgtRefs = new ArrayList<>();
        for (String ref : tgt.getRawFieldRefs()) tgtRefs.add(ref);
        for (String ref : tgt.getRawCallRefs()) tgtRefs.add("C:" + ref);

        if (tgtRefs.size() != partialKey.size()) return false;

        for (int i = 0; i < partialKey.size(); i++)
        {
            String pk = partialKey.get(i);
            String tr = tgtRefs.get(i);
            if (pk.equals("?F") || pk.equals("?C")) continue;
            if (pk.endsWith(".*"))
            {
                String prefix = pk.substring(0, pk.length() - 1);
                String tgtPrefix;
                if (tr.startsWith("C:"))
                {
                    int dot = tr.indexOf('.', 2);
                    tgtPrefix = dot > 0 ? tr.substring(0, dot + 1) : tr;
                }
                else
                {
                    int colon = tr.indexOf(':');
                    String after = colon >= 0 ? tr.substring(colon + 1) : tr;
                    int dot = after.indexOf('.');
                    tgtPrefix = (colon >= 0 ? tr.substring(0, colon + 1) : "")
                        + (dot > 0 ? after.substring(0, dot + 1) : after);
                }
                if (!prefix.equals(tgtPrefix)) return false;
            }
            else if (!pk.equals(tr))
            {
                return false;
            }
        }
        return true;
    }

    private static void matchByClassSequence(
        Map<Integer, PacketPayload> srcPayloads,
        Map<Integer, PacketPayload> tgtPayloads,
        Map<String, String> classMap,
        Map<Integer, Integer> sourceToTarget,
        Set<Integer> matchedSrc, Set<Integer> matchedTgt)
    {
        if (classMap.isEmpty()) return;

        Map<String, List<Integer>> tgtByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : tgtPayloads.entrySet())
        {
            if (matchedTgt.contains(e.getKey())) continue;
            String struct = e.getValue().shapeSignature();
            String classSeq = nativeClassSequence(e.getValue());
            tgtByKey.computeIfAbsent(struct + "||" + classSeq,
                k -> new ArrayList<>()).add(e.getKey());
        }

        Map<String, List<Integer>> srcByKey = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : srcPayloads.entrySet())
        {
            if (matchedSrc.contains(e.getKey())) continue;
            String translated = translatedClassSequence(e.getValue(), classMap);
            if (translated != null)
            {
                String struct = e.getValue().shapeSignature();
                srcByKey.computeIfAbsent(struct + "||" + translated,
                    k -> new ArrayList<>()).add(e.getKey());
            }
        }

        for (Map.Entry<String, List<Integer>> srcEntry : srcByKey.entrySet())
        {
            List<Integer> srcIds = srcEntry.getValue();
            List<Integer> tgtIds = tgtByKey.getOrDefault(
                srcEntry.getKey(), Collections.emptyList());
            if (srcIds.size() == 1 && tgtIds.size() == 1)
            {
                int srcId = srcIds.get(0);
                int tgtId = tgtIds.get(0);
                if (!matchedSrc.contains(srcId) && !matchedTgt.contains(tgtId))
                {
                    sourceToTarget.put(srcId, tgtId);
                    matchedSrc.add(srcId);
                    matchedTgt.add(tgtId);
                }
            }
        }
    }

    private static String nativeClassSequence(PacketPayload p)
    {
        List<String> seq = new ArrayList<>();
        for (String ref : p.getRawFieldRefs())
        {
            int colonIdx = ref.indexOf(':');
            String after = colonIdx >= 0 ? ref.substring(colonIdx + 1) : ref;
            int dotIdx = after.indexOf('.');
            String prefix = colonIdx >= 0 ? ref.substring(0, colonIdx) : "F";
            seq.add(prefix + ":" + (dotIdx > 0 ? after.substring(0, dotIdx) : after));
        }
        for (String ref : p.getRawCallRefs())
        {
            int dotIdx = ref.indexOf('.');
            seq.add("C:" + (dotIdx > 0 ? ref.substring(0, dotIdx) : ref));
        }
        return seq.toString();
    }

    private static String translatedClassSequence(PacketPayload p,
        Map<String, String> classMap)
    {
        List<String> seq = new ArrayList<>();
        for (String ref : p.getRawFieldRefs())
        {
            int colonIdx = ref.indexOf(':');
            String after = colonIdx >= 0 ? ref.substring(colonIdx + 1) : ref;
            int dotIdx = after.indexOf('.');
            String prefix = colonIdx >= 0 ? ref.substring(0, colonIdx) : "F";
            String owner = dotIdx > 0 ? after.substring(0, dotIdx) : after;
            String mapped = classMap.get(owner);
            if (mapped == null) return null;
            seq.add(prefix + ":" + mapped);
        }
        for (String ref : p.getRawCallRefs())
        {
            int dotIdx = ref.indexOf('.');
            String owner = dotIdx > 0 ? ref.substring(0, dotIdx) : ref;
            String mapped = classMap.get(owner);
            if (mapped == null) return null;
            seq.add("C:" + mapped);
        }
        return seq.toString();
    }

    public static final class Result
    {
        private final Map<Integer, Integer> sourceToTarget;
        private final int sourceCount;
        private final int targetCount;
        private final int ambiguous;
        private final int unmatched;

        Result(Map<Integer, Integer> sourceToTarget, int sourceCount,
            int targetCount, int ambiguous, int unmatched)
        {
            this.sourceToTarget = sourceToTarget;
            this.sourceCount = sourceCount;
            this.targetCount = targetCount;
            this.ambiguous = ambiguous;
            this.unmatched = unmatched;
        }

        public Map<Integer, Integer> getSourceToTarget()
        {
            return sourceToTarget;
        }

        public int getSourceCount()
        {
            return sourceCount;
        }

        public int getTargetCount()
        {
            return targetCount;
        }

        public int getAmbiguous()
        {
            return ambiguous;
        }

        public int getUnmatched()
        {
            return unmatched;
        }

        public int getMatchedCount()
        {
            return sourceToTarget.size();
        }
    }
}
