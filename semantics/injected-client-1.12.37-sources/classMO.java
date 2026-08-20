import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mo")
final class classMO implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field4549 = 95;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4546 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field4547 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field4550 = 105;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4548 = 75;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   static int method7635(int var0) {
      try {
         return classTK.field6149.length;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "mo.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I")
   @ObfuscatedName("az")
   int method7628(classNM var1, classNM var2, int var3) {
      try {
         int var10000;
         if (-1718041163 * var1.field4685.field4534 < -1718041163 * var2.field4685.field4534) {
            if (var3 >= 1528565262) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = -1718041163 * var2.field4685.field4534 == -1718041163 * var1.field4685.field4534 ? 0 : 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "mo.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("ur")
   public static void method7626(IterableNodeDeque var0) {
      while (var0.field4782.field6554 != var0.field4782) {
         var0.field4782.field6554.vmethod398();
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mo.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmo;Lnm;Lnm;)I")
   @ObfuscatedName("pd")
   public static int method7629(classMO var0, classNM var1, classNM var2) {
      if (var0 == null) {
         var0.method7631(var1, var1);
      }

      return -1235623083 * var1.field4685.field4534 < -1718041163 * var2.field4685.field4534
         ? -1
         : (-1460435179 * var2.field4685.field4534 == -1718041163 * var1.field4685.field4534 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method7632(Object var1, Object var2) {
      return this.method7628((classNM)var1, (classNM)var2, -1225412822);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("af")
   int method7630(classNM var1, classNM var2) {
      return -1718041163 * var1.field4685.field4534 < -1718041163 * var2.field4685.field4534
         ? -1
         : (-1718041163 * var2.field4685.field4534 == -1718041163 * var1.field4685.field4534 ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmo;Ljava/lang/Object;)Z")
   @ObfuscatedName("fn")
   public static boolean method7633(classMO var0, Object var1) {
      if (var0 == null) {
         var0.method7632(var1, var1);
      }

      return var0.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmo;Ljava/lang/Object;)Z")
   @ObfuscatedName("tf")
   public static boolean method7634(classMO var0, Object var1) {
      if (var0 == null) {
         var0.method7632(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("ae")
   int method7631(classNM var1, classNM var2) {
      return -1718041163 * var1.field4685.field4534 < -1718041163 * var2.field4685.field4534
         ? -1
         : (-1718041163 * var2.field4685.field4534 == -1718041163 * var1.field4685.field4534 ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)Laag;")
   @ObfuscatedName("gb")
   public static classAAG method7636(classLH var0) {
      return var0.field4159.method13871(var0.field4152 * 1072642345, var0.field4157 * -698145269, -33115129);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method7628((classNM)var1, (classNM)var2, 678431448);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "mo.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("af")
   static int method7627(int var0, byte var1) {
      try {
         return (var0 >> 7) + 1;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mo.af(" + 41);
      }
   }
}
