package dev.rl.suite.packet;

import dev.rl.suite.rename.FieldKey;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * One direction's packet id/length table, read from an input archive.
 *
 * <p>This is the half of a packet profile that the jar states for itself. The
 * other half, the semantic name at each id, is not derivable from any client and
 * has to be supplied or propagated.
 */
public final class PacketTable
{
    private final PacketDirection direction;
    private final String owner;
    private final List<Entry> entries;

    PacketTable(PacketDirection direction, String owner, List<Entry> entries)
    {
        this.direction = direction;
        this.owner = owner;
        List<Entry> sorted = new ArrayList<>(entries);
        sorted.sort((left, right) -> Integer.compare(left.id, right.id));
        this.entries = Collections.unmodifiableList(sorted);
    }

    /** Internal name of the class declaring the packet constants. */
    public String getOwner()
    {
        return owner;
    }

    public List<Entry> getEntries()
    {
        return entries;
    }

    public int size()
    {
        return entries.size();
    }

    /**
     * SHA-256 over {@code direction<TAB>id<TAB>length<LF>} rows in id order,
     * the same serialization the bundled profile files record in their
     * {@code fingerprint.*.id-length.sha256} headers, so a table read from a jar
     * can be compared against a profile without re-deriving the format.
     */
    public String idLengthSha256()
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String prefix = direction == PacketDirection.SERVER ? "server" : "client";
            for (Entry entry : entries)
            {
                String row = prefix + "\t" + entry.id + "\t" + entry.length + "\n";
                digest.update(row.getBytes(StandardCharsets.UTF_8));
            }
            StringBuilder hexadecimal = new StringBuilder(64);
            for (byte value : digest.digest())
            {
                hexadecimal.append(String.format("%02x", value & 0xff));
            }
            return hexadecimal.toString();
        }
        catch (NoSuchAlgorithmException ex)
        {
            throw new IllegalStateException("SHA-256 is unavailable", ex);
        }
    }

    /** One packet: its wire id, its declared length, and the field holding it. */
    public static final class Entry
    {
        private final int id;
        private final int length;
        private final FieldKey field;

        Entry(int id, int length, FieldKey field)
        {
            this.id = id;
            this.length = length;
            this.field = field;
        }

        public int getId()
        {
            return id;
        }

        /** Payload length, or -1 for a byte-sized and -2 for a short-sized prefix. */
        public int getLength()
        {
            return length;
        }

        public FieldKey getField()
        {
            return field;
        }
    }
}
