package dev.rl.suite.pass;

import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.H_INVOKESTATIC;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.pipeline.PassContext;
import dev.rl.suite.pipeline.TransformPass;
import dev.rl.suite.pipeline.TransformationPlan;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/** Recovers the three nested ConstantBootstraps.invoke concat constants. */
public final class CondyConcatNormalizer implements TransformPass
{
    private static final String STRING = "Ljava/lang/String;";
    private static final String HELPER_DESCRIPTOR = "(J)Ljava/lang/String;";
    private static final String CONCAT_OWNER = "java/lang/invoke/StringConcatFactory";
    private static final String CONCAT_NAME = "makeConcatWithConstants";
    private static final String CONCAT_BOOTSTRAP_DESCRIPTOR =
        "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;"
            + "Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;";
    private static final String CONSTANT_BOOTSTRAPS_OWNER = "java/lang/invoke/ConstantBootstraps";
    private static final String CONSTANT_BOOTSTRAPS_NAME = "invoke";
    private static final String CONSTANT_BOOTSTRAPS_DESCRIPTOR =
        "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;"
            + "Ljava/lang/invoke/MethodHandle;[Ljava/lang/Object;)Ljava/lang/Object;";

    @Override
    public String name()
    {
        return "normalize-condy-concats";
    }

    @Override
    public TransformationPlan analyze(PassContext context)
    {
        List<SitePlan> sites = new ArrayList<>();
        for (ClassUnit unit : context.getArchive().getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                for (AbstractInsnNode instruction : method.instructions)
                {
                    if (!(instruction instanceof InvokeDynamicInsnNode))
                    {
                        continue;
                    }
                    InvokeDynamicInsnNode indy = (InvokeDynamicInsnNode) instruction;
                    SitePlan site = match(unit, method, indy);
                    if (site != null)
                    {
                        sites.add(site);
                    }
                }
            }
        }

        long expected = context.getConfig().getExpectedCondySites();
        if (sites.size() != expected)
        {
            throw new TransformException("Expected " + expected + " nested condy concat sites, found "
                + sites.size());
        }
        if (expected == 3L)
        {
            validateKnownDistribution(sites);
        }
        return new Plan(sites);
    }

    private static void validateKnownDistribution(List<SitePlan> sites)
    {
        long longSites = sites.stream().filter(site -> site.kind == SiteKind.LONG).count();
        long stringSites = sites.stream().filter(site -> site.kind == SiteKind.TWO_STRINGS).count();
        if (longSites != 2L || stringSites != 1L)
        {
            throw new TransformException("Expected two long and one two-string condy concat sites, found "
                + longSites + " and " + stringSites);
        }

        Handle helper = sites.get(0).helper;
        for (SitePlan site : sites)
        {
            if (!helper.equals(site.helper))
            {
                throw new TransformException("The three condy concat sites do not share one helper handle");
            }
        }

        Map<ConstantDynamic, Integer> frequencies = new IdentityHashMap<>();
        for (SitePlan site : sites)
        {
            frequencies.put(site.dynamic, frequencies.getOrDefault(site.dynamic, 0) + 1);
        }
        if (frequencies.size() != 2 || !frequencies.containsValue(1) || !frequencies.containsValue(2))
        {
            throw new TransformException("Expected two condy constants with use frequencies one and two");
        }
    }

    private static SitePlan match(ClassUnit unit, MethodNode enclosingMethod, InvokeDynamicInsnNode indy)
    {
        Handle concat = indy.bsm;
        if (concat.getTag() != H_INVOKESTATIC || concat.isInterface()
            || !CONCAT_OWNER.equals(concat.getOwner())
            || !CONCAT_NAME.equals(concat.getName())
            || !CONCAT_BOOTSTRAP_DESCRIPTOR.equals(concat.getDesc())
            || !indy.name.equals(concat.getName()))
        {
            return null;
        }

        if (indy.bsmArgs.length != 2 || !(indy.bsmArgs[0] instanceof String)
            || !(indy.bsmArgs[1] instanceof ConstantDynamic))
        {
            return null;
        }

        String recipe = (String) indy.bsmArgs[0];
        ConstantDynamic dynamic = (ConstantDynamic) indy.bsmArgs[1];
        if (!"\0".equals(dynamic.getName()) || !STRING.equals(dynamic.getDescriptor()))
        {
            return null;
        }

        Handle bootstrap = dynamic.getBootstrapMethod();
        if (bootstrap.getTag() != H_INVOKESTATIC || bootstrap.isInterface()
            || !CONSTANT_BOOTSTRAPS_OWNER.equals(bootstrap.getOwner())
            || !CONSTANT_BOOTSTRAPS_NAME.equals(bootstrap.getName())
            || !CONSTANT_BOOTSTRAPS_DESCRIPTOR.equals(bootstrap.getDesc())
            || dynamic.getBootstrapMethodArgumentCount() != 2)
        {
            return null;
        }

        Object firstArgument = dynamic.getBootstrapMethodArgument(0);
        Object secondArgument = dynamic.getBootstrapMethodArgument(1);
        if (!(firstArgument instanceof Handle) || !(secondArgument instanceof Long)
            || ((Long) secondArgument).longValue() != 0L)
        {
            return null;
        }
        Handle helper = (Handle) firstArgument;
        if (helper.getTag() != H_INVOKESTATIC || helper.isInterface()
            || !unit.getNode().name.equals(helper.getOwner())
            || !HELPER_DESCRIPTOR.equals(helper.getDesc())
            || !hasStaticHelper(unit, helper))
        {
            return null;
        }

        Type methodType = Type.getMethodType(indy.desc);
        if (!Type.getType(STRING).equals(methodType.getReturnType()))
        {
            return null;
        }
        Type[] arguments = methodType.getArgumentTypes();
        String replacementRecipe;
        SiteKind kind;
        if (arguments.length == 1 && Type.LONG_TYPE.equals(arguments[0])
            && "\u0001\u0002".equals(recipe))
        {
            replacementRecipe = "\u0001\u0001";
            kind = SiteKind.LONG;
        }
        else if (arguments.length == 2
            && Type.getType(STRING).equals(arguments[0])
            && Type.getType(STRING).equals(arguments[1])
            && "\u0001\u0001\u0002".equals(recipe))
        {
            replacementRecipe = "\u0001\u0001\u0001";
            kind = SiteKind.TWO_STRINGS;
        }
        else
        {
            return null;
        }

        Type[] replacementArguments = new Type[arguments.length + 1];
        System.arraycopy(arguments, 0, replacementArguments, 0, arguments.length);
        replacementArguments[arguments.length] = Type.getType(STRING);
        String replacementDescriptor = Type.getMethodDescriptor(Type.getType(STRING), replacementArguments);
        return new SitePlan(unit.getNode().name, enclosingMethod, indy, dynamic, helper,
            replacementDescriptor, replacementRecipe, kind);
    }

    private static boolean hasStaticHelper(ClassUnit unit, Handle helper)
    {
        for (MethodNode method : unit.getNode().methods)
        {
            if (method.name.equals(helper.getName()) && method.desc.equals(helper.getDesc())
                && (method.access & ACC_STATIC) != 0)
            {
                return true;
            }
        }
        return false;
    }

    private static final class SitePlan
    {
        private final String owner;
        private final MethodNode method;
        private final InvokeDynamicInsnNode indy;
        private final ConstantDynamic dynamic;
        private final Handle helper;
        private final String replacementDescriptor;
        private final String replacementRecipe;
        private final SiteKind kind;

        private SitePlan(String owner, MethodNode method, InvokeDynamicInsnNode indy,
                         ConstantDynamic dynamic, Handle helper, String replacementDescriptor,
                         String replacementRecipe, SiteKind kind)
        {
            this.owner = owner;
            this.method = method;
            this.indy = indy;
            this.dynamic = dynamic;
            this.helper = helper;
            this.replacementDescriptor = replacementDescriptor;
            this.replacementRecipe = replacementRecipe;
            this.kind = kind;
        }
    }

    private enum SiteKind
    {
        LONG,
        TWO_STRINGS
    }

    private static final class Plan implements TransformationPlan
    {
        private final List<SitePlan> sites;

        private Plan(List<SitePlan> sites)
        {
            this.sites = new ArrayList<>(sites);
        }

        @Override
        public String passName()
        {
            return "normalize-condy-concats";
        }

        @Override
        public void apply(PassContext context)
        {
            Set<ConstantDynamic> uniqueConstants = Collections.newSetFromMap(new IdentityHashMap<>());
            Set<MethodNode> changedMethods = Collections.newSetFromMap(new IdentityHashMap<>());
            for (SitePlan site : sites)
            {
                if (site.indy.bsmArgs.length != 2 || site.indy.bsmArgs[1] != site.dynamic)
                {
                    throw new TransformException(site.owner + "." + site.method.name + site.method.desc
                        + ": condy site changed after planning");
                }

                site.method.instructions.insertBefore(site.indy, new LdcInsnNode(Long.valueOf(0L)));
                site.method.instructions.insertBefore(site.indy,
                    new MethodInsnNode(INVOKESTATIC, site.helper.getOwner(), site.helper.getName(),
                        site.helper.getDesc(), false));
                site.indy.desc = site.replacementDescriptor;
                site.indy.bsmArgs = new Object[] { site.replacementRecipe };
                uniqueConstants.add(site.dynamic);
                changedMethods.add(site.method);
            }
            for (MethodNode method : changedMethods)
            {
                // The inserted long temporarily consumes two additional stack slots.
                method.maxStack += 2;
            }

            context.getReport().putMetric("condy.concatSites.matched", sites.size());
            context.getReport().putMetric("condy.constants.materialized", uniqueConstants.size());
            context.getReport().putMetric("condy.instructions.inserted", sites.size() * 2L);
            context.getReport().putMetric("condy.longSites", sites.stream()
                .filter(site -> site.kind == SiteKind.LONG).count());
            context.getReport().putMetric("condy.twoStringSites", sites.stream()
                .filter(site -> site.kind == SiteKind.TWO_STRINGS).count());
            context.getReport().warning(
                "ConstantDynamic was materialized for decompilation; output is analysis-only because lazy caching changes.");
        }
    }
}
