import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hx")
public class classHX {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2908 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2909 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2907 = 5000;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDD)I")
   @ObfuscatedName("af")
   public static final int method6124(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0) {
         double var12;
         if (var4 < 0.5) {
            var12 = (1.0 + var2) * var4;
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            var16--;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            var20++;
         }

         if (6.0 * var16 < 1.0) {
            var6 = var16 * ((var12 - var14) * 6.0) + var14;
         } else if (var16 * 2.0 < 1.0) {
            var6 = var12;
         } else if (3.0 * var16 < 2.0) {
            var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var0 * ((var12 - var14) * 6.0) + var14;
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (var0 * 3.0 < 2.0) {
            var8 = var14 + (var12 - var14) * (0.6666666666666666 - var0) * 6.0;
         } else {
            var8 = var14;
         }

         if (var20 * 6.0 < 1.0) {
            var10 = var20 * (6.0 * (var12 - var14)) + var14;
         } else if (var20 * 2.0 < 1.0) {
            var10 = var12;
         } else if (3.0 * var20 < 2.0) {
            var10 = var14 + 6.0 * ((var12 - var14) * (0.6666666666666666 - var20));
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0 * var6);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(var10 * 256.0);
      return var23 + (var22 << 16) + (var13 << 8);
   }

   classHX() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("sz")
   public static int method6126(Buffer var0) {
      return var0 == null ? var0.method13040() : var0.array[(var0.offset += -1095856699) * 702114061 - 1] & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDD)I")
   @ObfuscatedName("ae")
   public static final int method6125(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0) {
         double var12;
         if (var4 < 0.5) {
            var12 = (1.0 + var2) * var4;
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            var16--;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            var20++;
         }

         if (6.0 * var16 < 1.0) {
            var6 = var16 * ((var12 - var14) * 6.0) + var14;
         } else if (var16 * 2.0 < 1.0) {
            var6 = var12;
         } else if (3.0 * var16 < 2.0) {
            var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var0 * ((var12 - var14) * 6.0) + var14;
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (var0 * 3.0 < 2.0) {
            var8 = var14 + (var12 - var14) * (0.6666666666666666 - var0) * 6.0;
         } else {
            var8 = var14;
         }

         if (var20 * 6.0 < 1.0) {
            var10 = var20 * (6.0 * (var12 - var14)) + var14;
         } else if (var20 * 2.0 < 1.0) {
            var10 = var12;
         } else if (3.0 * var20 < 2.0) {
            var10 = var14 + 6.0 * ((var12 - var14) * (0.6666666666666666 - var20));
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0 * var6);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(var10 * 256.0);
      return var23 + (var22 << 16) + (var13 << 8);
   }
}
