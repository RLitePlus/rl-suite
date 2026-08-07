package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.JarArchive;
import dev.rl.suite.rename.FieldKey;
import java.io.IOException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/**
 * Explicit, version-pinned packet naming choice. Each mode names the profile
 * resource it reads and the exact checksum that resource must have; the file is
 * read on first use, so a damaged profile fails the run that asks for it rather
 * than every run.
 */
public enum PacketProfileMode
{
    /** Names from the published revision 233 tables, on the revision 235 fingerprint. */
    OSRS_235("osrs-235", "osrs-235.tsv",
        "1b03aedcea9d8aa082c3022701bf256cd1617f0552be0929d83658f4a580edee"),
    /** Names from the published revision 234 tables, on the revision 236 fingerprint. */
    OSRS_236("osrs-236", "osrs-236.tsv",
        "afda52b67542d14084ecefdc8909211d22ae587f4cf8d25040bbfca10feba0b8"),
    /** Names from the published revision 236 tables, on the revision 237 fingerprint. */
    OSRS_237("osrs-237", "osrs-237.tsv",
        "b403fc103b7f4ccb0c2ea843f671e3f47dc0168eab3431c4df5a0ec30b7d50bb"),
    /** Names from the published revision 237 tables, on the revision 238 fingerprint. */
    OSRS_238("osrs-238", "osrs-238.tsv",
        "4c25e26e1dbda52fe12630a9f295033bb5d3c3e9002a96ff3c7003f93e80afdf"),
    /** Names from the published revision 239 tables, on the revision 239 fingerprint. */
    OSRS_239("osrs-239", "osrs-239.tsv",
        "e6c48a534e48f043b7bda548802d8c1adc4a756c1dcceb4b6c1984737a86eb3f"),
    /** Names from the published revision 240 tables, on the revision 240 fingerprint. */
    OSRS_240("osrs-240", "osrs-240.tsv",
        "5ed6eefc2439e9e5e550be394f5f7e1c1d7ed7caeee7cc9bb1ce9a0b8738d4ce"),
    /** Names recovered from the renamed 1.12.31.1 client. */
    RENAMED_CLIENT_11231("renamed-client-1.12.31.1", "renamed-client-1.12.31.1.tsv",
        "ea68b04dd3f52a6cc0735225a72b5508b8892508238922e10a996eb7147598ae"),
    /** No semantic names; packet fields keep their generic numbering. */
    NONE("none", null, null);

    private static final String RESOURCE_DIRECTORY = "dev/rl/suite/packet/";

    private final String optionName;
    private final String resource;
    private final String resourceSha256;
    private PacketNameProfile profile;

    PacketProfileMode(String optionName, String resourceName, String resourceSha256)
    {
        this.optionName = optionName;
        this.resource = resourceName == null ? null : RESOURCE_DIRECTORY + resourceName;
        this.resourceSha256 = resourceSha256;
    }

    public String getOptionName()
    {
        return optionName;
    }

    public String getContentSha256()
    {
        return resource == null ? "none" : profile().getContentSha256();
    }

    public int getNamedEntryCount()
    {
        if (resource == null)
        {
            return 0;
        }
        PacketNameProfile loaded = profile();
        return loaded.getNamedEntryCount(PacketDirection.SERVER)
            + loaded.getNamedEntryCount(PacketDirection.CLIENT);
    }

    public Map<FieldKey, String> resolveOverrides(JarArchive archive)
    {
        return resource == null ? Collections.emptyMap() : profile().resolveOverrides(archive);
    }

    /** Reads and checksums the profile resource, once, on first use. */
    private synchronized PacketNameProfile profile()
    {
        if (profile == null)
        {
            try
            {
                profile = PacketNameProfile.loadResource(resource, resourceSha256);
            }
            catch (IOException | IllegalArgumentException ex)
            {
                throw new TransformException("Cannot load packet profile " + optionName, ex);
            }
        }
        return profile;
    }

    public static PacketProfileMode parse(String value)
    {
        String normalized = value.toLowerCase(Locale.ROOT);
        for (PacketProfileMode mode : values())
        {
            if (mode.optionName.equals(normalized))
            {
                return mode;
            }
        }
        throw new IllegalArgumentException("Unknown packet profile: " + value
            + " (expected osrs-235 through osrs-240, renamed-client-1.12.31.1, or none)");
    }
}
