package dev.rl.suite.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Hashing
{
    private Hashing()
    {
    }

    public static String sha256(Path path) throws IOException
    {
        MessageDigest digest;
        try
        {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException ex)
        {
            throw new IllegalStateException("SHA-256 is unavailable", ex);
        }

        byte[] buffer = new byte[64 * 1024];
        try (InputStream input = Files.newInputStream(path))
        {
            int read;
            while ((read = input.read(buffer)) >= 0)
            {
                digest.update(buffer, 0, read);
            }
        }

        StringBuilder result = new StringBuilder(digest.getDigestLength() * 2);
        for (byte value : digest.digest())
        {
            result.append(String.format("%02x", value & 0xff));
        }
        return result.toString();
    }
}
