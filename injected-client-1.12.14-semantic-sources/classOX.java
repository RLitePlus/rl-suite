import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ox")
public final class classOX {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4745 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4744 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4742 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field4741 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field4747 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field4748 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4746 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field4743 = 19;

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("at")
   static int method8682(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 >> 16 & 0xFF;
         int var5 = var0 >> 8 & 0xFF;
         int var6 = var0 & 0xFF;
         int var7 = var1 >> 16 & 0xFF;
         int var8 = var1 >> 8 & 0xFF;
         int var9 = var1 & 0xFF;
         int var10 = var4 + (1 + (var7 - var4)) * var2 / 64 & 0xFF;
         int var11 = var2 * (1 + (var8 - var5)) / 64 + var5 & 0xFF;
         int var12 = var6 + (1 + (var9 - var6)) * var2 / 64 & 0xFF;
         return var10 << 16 | var11 << 8 | var12;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ox.at(" + 41);
      }
   }

   classOX() throws Throwable {
      throw new Error();
   }
}
