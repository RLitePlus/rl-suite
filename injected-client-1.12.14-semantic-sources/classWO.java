import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wo")
public class classWO {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6403 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6402 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field6400 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field6398 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field6401 = 76;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field6399 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6397 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6404 = 20;
   @ObfuscatedName("af")
   static String[] field6405;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   public static boolean method11824(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || 14 == var0 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   classWO() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public static boolean method11825(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || 14 == var0 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   public static boolean method11826(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || 14 == var0 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ObfuscatedSignature(descriptor = "([F[IIII)V")
   @ObfuscatedName("az")
   static void method11827(float[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 >= 1952817404) {
               return;
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            float var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 >= 1952817404) {
                  throw new IllegalStateException();
               }

               if (var0[var9] < var7) {
                  if (var4 >= 1952817404) {
                     return;
                  }

                  float var10 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6] = var10;
                  int var11 = var1[var9];
                  var1[var9] = var1[var6];
                  var1[var6++] = var11;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method11827(var0, var1, var2, var6 - 1, -914265299);
            method11827(var0, var1, 1 + var6, var3, 827497117);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "wo.az(" + ')');
      }
   }
}
