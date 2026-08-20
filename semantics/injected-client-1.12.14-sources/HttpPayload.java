import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public interface HttpPayload {
   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   byte[] vmethod389() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ay")
   byte[] vmethod391() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ae")
   HttpContentType vmethod386();

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("aj")
   HttpContentType vmethod383();

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("at")
   byte[] toBytes(int var1) throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ag")
   HttpContentType vmethod385();

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ak")
   byte[] vmethod388() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ap")
   byte[] vmethod390() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("an")
   HttpContentType vmethod384();

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("av")
   HttpContentType getContentType(int var1);
}
