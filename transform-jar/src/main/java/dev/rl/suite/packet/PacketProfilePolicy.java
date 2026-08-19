package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
import java.util.Set;

/** Guards implicit semantic packet naming with exact accepted input evidence. */
public final class PacketProfilePolicy
{
    public static final String RUNELITE_11231_SHA256 =
        "40fa21bad5de3885894621ecc479467828f437c1fca30e680287b774445eec02";
    public static final String RUNELITE_11232_SHA256 =
        "7e1f70c24e25175e21a2d1fe55db3650f57d786a9f890c6a1510fc43aa6323ee";

    private static final Set<String> IMPLICIT_OSRS_239_INPUTS = Set.of(
        RUNELITE_11231_SHA256, RUNELITE_11232_SHA256);

    private PacketProfilePolicy()
    {
    }

    /**
     * The default semantic profile is automatic only for exact, tested JARs.
     * Selecting a CLI/API profile explicitly is an acknowledgement that its
     * protocol semantics were confirmed independently of packet lengths.
     */
    public static void validate(PacketProfileMode mode, boolean explicit, String inputSha256)
    {
        if (explicit || mode == PacketProfileMode.NONE)
        {
            return;
        }
        if (mode == PacketProfileMode.OSRS_239
            && IMPLICIT_OSRS_239_INPUTS.contains(inputSha256))
        {
            return;
        }
        throw new TransformException("Refusing to apply the implicit " + mode.getOptionName()
            + " packet profile to unrecognized input SHA-256 " + inputSha256
            + ". Confirm the protocol independently and select --packet-profile "
            + mode.getOptionName() + " explicitly, or select --packet-profile none.");
    }

    public static boolean isImplicitlyAccepted(PacketProfileMode mode, String inputSha256)
    {
        return mode == PacketProfileMode.OSRS_239
            && IMPLICIT_OSRS_239_INPUTS.contains(inputSha256);
    }
}
