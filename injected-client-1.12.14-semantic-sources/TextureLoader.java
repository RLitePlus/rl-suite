import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kg")
public interface TextureLoader {
   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ac")
   int[] vmethod254(int var1);

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   int getAverageTextureRGB(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(IB)[I")
   @ObfuscatedName("ag")
   int[] getTexturePixels(int var1, byte var2);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("jc")
   default int method6347(int var1) {
      return this.getAverageTextureRGB(var1, 55834647);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("as")
   int[] vmethod257(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int vmethod258(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)I")
   @ObfuscatedName("kv")
   static int method6346(ClientPreferences var0) {
      return -2135918997 * var0.drawDistance;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ah")
   boolean vmethod259(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int vmethod260(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int vmethod261(int var1);

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   boolean isLowDetail(int var1, int var2);
}
