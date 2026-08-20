import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fk")
public class class142 implements classFN {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field1810 = 11;
   @ObfuscatedName("bt")
   static int field1811;
   @ObfuscatedName("ae")
   public static int field1808;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field1809 = 3;
   @ObfuscatedName("ad")
   static int gameCyclesToDo;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("hr")
   public static int method4016(Widget var0) {
      return var0.field4553 != null && !var0.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;IB)Ljt;")
   @ObfuscatedName("av")
   public static Frames method4014(AbstractArchive var0, AbstractArchive var1, int var2, byte var3) {
      try {
         boolean var4 = true;
         int var5 = -1;
         int[] var6 = AbstractArchive.method8992(var0, var2, -1775968255);

         for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = AbstractArchive.method9044(var0, var2, var6[var7], -2086102660);
            if (null == var8) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var4 = false;
            } else if (var5 == -1) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var5 = (var8[0] & 255) << 8 | var8[1] & 255;
            }
         }

         if (-1 != var5) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            byte[] var11 = AbstractArchive.method9044(var1, var5, 0, -2063033031);
            if (null == var11) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var4 = false;
            }
         } else {
            var4 = false;
         }

         if (var4) {
            try {
               return new Frames(var0, var1, var2);
            } catch (Exception var9) {
               return null;
            }
         } else if (var3 <= 0) {
            throw new IllegalStateException();
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "fk.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("na")
   static boolean method4017(int var0, int var1) {
      try {
         for (int var2 = 0; var2 < client.field767 * -1698979265; var2++) {
            if (client.field720[var2] == var0) {
               if (var1 == 680703466) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fk.na(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFLft;I)V")
   @ObfuscatedName("aj")
   static void method4015(float var0, float var1, float var2, float var3, classFT var4, int var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.field1879 = var8 - var7 - var9;
         var4.field1876 = var9 + var9 + var9;
         var4.field1878 = var6 + (var6 + var6);
         var4.field1874 = var0;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "fk.aj(" + ')');
      }
   }
}
