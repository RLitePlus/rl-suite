package dev.rl.suite.packet;

import dev.rl.suite.TransformException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Names client packets by matching the shape of their payload against a table
 * of shapes whose names are known.
 *
 * <p>A packet is only named when its fingerprint identifies exactly one packet
 * in the jar being read. Packets that share a fingerprint with another packet
 * are left unnamed rather than guessed at; the cross-revision mapper fills
 * those in from a revision where they could be resolved.
 *
 * <p>The table is generated, not hand-written: see FingerprintTableGenTest.
 * Measured on the six published revisions it names roughly a third of the
 * client table with no wrong names. Fingerprints do not transfer reliably to a
 * revision the table was not built from, so a new revision should be added to
 * the generator rather than assumed to be covered.
 */
public final class ClientPacketNamer
{
    private static final String RESOURCE =
        "dev/rl/suite/packet/client-fingerprints.tsv";

    private static final Map<String, String> FINGERPRINT_NAMES = load();

    private ClientPacketNamer()
    {
    }

    public static Map<Integer, String> name(ClientPayloadExtractor.Result result)
    {
        Map<Integer, String> names = new TreeMap<>();
        Map<String, BufferMethod> bm = result.getBufferMethods();

        Map<String, List<Integer>> fpToIds = new LinkedHashMap<>();
        for (Map.Entry<Integer, PacketPayload> e : result.getPayloads().entrySet())
        {
            fpToIds.computeIfAbsent(computeFingerprint(e.getValue(), bm),
                k -> new ArrayList<>()).add(e.getKey());
        }

        for (Map.Entry<String, List<Integer>> e : fpToIds.entrySet())
        {
            if (e.getValue().size() != 1) continue;
            String name = FINGERPRINT_NAMES.get(e.getKey());
            if (name != null) names.put(e.getValue().get(0), name);
        }
        return names;
    }

    /**
     * The declared length followed by each buffer write in order. A write that
     * encodes a string carries an "s" suffix, which separates otherwise
     * identical byte sequences.
     */
    static String computeFingerprint(
        PacketPayload payload, Map<String, BufferMethod> bm)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("L").append(payload.getDeclaredLength()).append("|");
        List<PacketPayload.ReadCall> reads = payload.getReads();
        for (int i = 0; i < reads.size(); i++)
        {
            if (i > 0) sb.append(",");
            PacketPayload.ReadCall r = reads.get(i);
            String wt = r.getReadType();
            if (bm != null)
            {
                BufferMethod method = bm.get(r.getMethodName() + r.getDescriptor());
                if (method != null && !method.getWriteEncodings().isEmpty())
                {
                    String enc = method.getWriteEncodings().get(0);
                    if ("strn".equals(enc) || "strc".equals(enc)) wt += "s";
                }
            }
            sb.append(wt);
        }
        return sb.toString();
    }

    private static Map<String, String> load()
    {
        Map<String, String> table = new LinkedHashMap<>();
        try (InputStream in = ClientPacketNamer.class.getClassLoader()
            .getResourceAsStream(RESOURCE))
        {
            if (in == null) throw new TransformException("missing " + RESOURCE);
            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            byte[] chunk = new byte[8192];
            int n;
            while ((n = in.read(chunk)) > 0) buf.write(chunk, 0, n);
            for (String line : new String(buf.toByteArray(),
                StandardCharsets.UTF_8).split("\\R"))
            {
                if (line.isEmpty() || line.startsWith("#")) continue;
                int tab = line.indexOf('\t');
                if (tab <= 0) continue;
                table.put(line.substring(0, tab), line.substring(tab + 1));
            }
        }
        catch (IOException e)
        {
            throw new TransformException("cannot read " + RESOURCE, e);
        }
        return Collections.unmodifiableMap(table);
    }
}
