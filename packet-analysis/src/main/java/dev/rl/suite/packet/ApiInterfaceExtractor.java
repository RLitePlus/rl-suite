package dev.rl.suite.packet;

import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.objectweb.asm.tree.ClassNode;

/**
 * Reads the RuneLite API interfaces the injector leaves on the gamepack
 * classes. A class declaring {@code net.runelite.api.Player} is that type, so
 * the name is stated in the archive and needs no fingerprinting. Only direct
 * declarations are reported; a subclass inherits its parent's interfaces.
 */
public final class ApiInterfaceExtractor
{
    private static final String API_PREFIX = "net/runelite/api/";

    private ApiInterfaceExtractor()
    {
    }

    /**
     * Maps each obfuscated class name to the RuneLite API interfaces it
     * declares, skipping classes that declare none. Interface names are
     * returned without the package prefix.
     */
    public static Map<String, List<String>> extract(JarArchive archive)
    {
        Map<String, List<String>> declarations = new TreeMap<>();
        for (ClassUnit unit : archive.getClasses())
        {
            ClassNode node = unit.getNode();
            List<String> declared = new ArrayList<>();
            for (String candidate : node.interfaces)
            {
                if (candidate.startsWith(API_PREFIX))
                {
                    declared.add(candidate.substring(API_PREFIX.length()));
                }
            }
            if (!declared.isEmpty())
            {
                Collections.sort(declared);
                declarations.put(node.name, declared);
            }
        }
        return declarations;
    }
}
