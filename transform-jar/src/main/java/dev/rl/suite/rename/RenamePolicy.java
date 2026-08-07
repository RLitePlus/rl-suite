package dev.rl.suite.rename;

import java.util.Locale;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/** Stable, deliberately narrow definition of symbols owned by the injected client. */
final class RenamePolicy
{
    private static final Pattern SHORT_GAME_CLASS = Pattern.compile("[a-z]{1,3}");
    private static final Pattern RUNELITE_HELPER = Pattern.compile("rl[0-9]+");
    private static final String PUBLIC_API_PREFIX = "com/jagex/oldscape/pub/";

    boolean isMappingScope(String internalName)
    {
        return internalName.startsWith(PUBLIC_API_PREFIX)
            || internalName.indexOf('/') < 0
                && !"module-info".equals(internalName)
                && !"package-info".equals(internalName);
    }

    boolean renameClass(String internalName)
    {
        return internalName.indexOf('/') < 0
            && SHORT_GAME_CLASS.matcher(internalName).matches()
            && !RUNELITE_HELPER.matcher(internalName).matches();
    }

    String className(String originalName)
    {
        return "class" + originalName.toUpperCase(Locale.ROOT);
    }

    boolean obfuscatedMember(String owner, String name)
    {
        return isMappingScope(owner) && name.length() <= 3
            && !"run".equals(name) && !"add".equals(name);
    }

    boolean preserveMethod(int access)
    {
        // The injected API's get/put adapters are bridge methods. Renaming a
        // bridge independently breaks the external interface contract.
        return (access & Opcodes.ACC_BRIDGE) != 0;
    }

    boolean participatesInVirtualFamily(int access)
    {
        return (access & (Opcodes.ACC_STATIC | Opcodes.ACC_PRIVATE)) == 0;
    }
}
