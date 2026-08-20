import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zz")
public class classZZ {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([SI[SII)V")
   @ObfuscatedName("ar")
   static void method14241(short[] var0, int var1, short[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)V")
   @ObfuscatedName("az")
   public static void method14238(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;III)V")
   @ObfuscatedName("cb")
   public static void method14291(Object[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            Object var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([II[III)V")
   @ObfuscatedName("am")
   static void method14249(int[] var0, int var1, int[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([II[III)V")
   @ObfuscatedName("ab")
   static void method14250(int[] var0, int var1, int[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JI[JII)V")
   @ObfuscatedName("ag")
   static void method14253(long[] var0, int var1, long[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FI[FII)V")
   @ObfuscatedName("as")
   static void method14256(float[] var0, int var1, float[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("ax")
   static void method14259(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JI[JII)V")
   @ObfuscatedName("bn")
   static void method14254(long[] var0, int var1, long[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
   @ObfuscatedName("aa")
   static void method14270(Object[] var0, int var1, Object[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;III)V")
   @ObfuscatedName("aq")
   public static void method14292(Object[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            Object var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/util/Random;")
   @ObfuscatedName("al")
   static Random method14278(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         var0 = (int)(Math.random() * 2.147483647E9);
         var1 = (int)(Math.random() * 2.147483647E9);
      }

      long var2 = (long)var0 << 32 | var1;
      return new Random(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([SI[SII)V")
   @ObfuscatedName("au")
   static void method14242(short[] var0, int var1, short[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([ZI[ZII)V")
   @ObfuscatedName("bj")
   static void method14265(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ao")
   public static void method14274(int[] var0, int var1, int var2) {
      var2 = var1 + var2 - 7;

      while (var1 < var2) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      var2 += 7;

      while (var1 < var2) {
         var0[var1++] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)V")
   @ObfuscatedName("ad")
   public static void method14239(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)V")
   @ObfuscatedName("ap")
   public static void method14240(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   classZZ() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([SI[SII)V")
   @ObfuscatedName("ai")
   static void method14243(short[] var0, int var1, short[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([CI[CII)V")
   @ObfuscatedName("ak")
   static void method14245(char[] var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([CI[CII)V")
   @ObfuscatedName("aw")
   static void method14246(char[] var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("bg")
   static void method14260(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([SI[SII)V")
   @ObfuscatedName("af")
   static void method14244(short[] var0, int var1, short[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([II[III)V")
   @ObfuscatedName("at")
   static void method14251(int[] var0, int var1, int[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Ljava/util/Random;")
   @ObfuscatedName("bq")
   static Random method14279(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         var0 = (int)(Math.random() * 2.147483647E9);
         var1 = (int)(Math.random() * 2.147483647E9);
      }

      long var2 = (long)var0 << 32 | var1;
      return new Random(var2);
   }

   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("aj")
   public static void method14282(int[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            int var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JI[JII)V")
   @ObfuscatedName("ah")
   static void method14255(long[] var0, int var1, long[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([ZI[ZII)V")
   @ObfuscatedName("bk")
   static void method14266(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FI[FII)V")
   @ObfuscatedName("bx")
   static void method14257(float[] var0, int var1, float[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([CI[CII)V")
   @ObfuscatedName("av")
   static void method14247(char[] var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("bp")
   static void method14261(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FI[FII)V")
   @ObfuscatedName("bc")
   static void method14258(float[] var0, int var1, float[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("bm")
   static void method14262(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("bt")
   static void method14263(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("ay")
   public static void method14285(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;III)V")
   @ObfuscatedName("ct")
   public static void method14293(Object[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            Object var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([DI[DII)V")
   @ObfuscatedName("br")
   static void method14264(double[] var0, int var1, double[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 3;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 3;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([ZI[ZII)V")
   @ObfuscatedName("bo")
   static void method14267(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([ZI[ZII)V")
   @ObfuscatedName("bu")
   static void method14268(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
   @ObfuscatedName("ba")
   static void method14271(Object[] var0, int var1, Object[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bw")
   static void method14272(Object[] var0, int var1, Object[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bb")
   static void method14273(Object[] var0, int var1, Object[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bi")
   public static void method14275(int[] var0, int var1, int var2) {
      var2 = var1 + var2 - 7;

      while (var1 < var2) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      var2 += 7;

      while (var1 < var2) {
         var0[var1++] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("be")
   public static void method14276(int[] var0, int var1, int var2) {
      var2 = var1 + var2 - 7;

      while (var1 < var2) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      var2 += 7;

      while (var1 < var2) {
         var0[var1++] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([ZI[ZII)V")
   @ObfuscatedName("ac")
   static void method14269(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("by")
   public static void method14277(int[] var0, int var1, int var2) {
      var2 = var1 + var2 - 7;

      while (var1 < var2) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      var2 += 7;

      while (var1 < var2) {
         var0[var1++] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Ljava/util/Random;")
   @ObfuscatedName("bf")
   static Random method14280(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         var0 = (int)(Math.random() * 2.147483647E9);
         var1 = (int)(Math.random() * 2.147483647E9);
      }

      long var2 = (long)var0 << 32 | var1;
      return new Random(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Ljava/util/Random;")
   @ObfuscatedName("bs")
   static Random method14281(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         var0 = (int)(Math.random() * 2.147483647E9);
         var1 = (int)(Math.random() * 2.147483647E9);
      }

      long var2 = (long)var0 << 32 | var1;
      return new Random(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("bd")
   public static void method14283(int[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            int var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("bl")
   public static void method14284(int[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            int var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("bv")
   public static void method14286(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("bh")
   public static void method14287(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("bz")
   public static void method14288(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("cr")
   public static void method14289(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("cu")
   public static void method14290(long[] var0, int var1, int var2, int var3) {
      Random var4 = method14278(var2, var3);

      for (int var5 = var1 - 1; var5 > 0; var5--) {
         int var6 = var4.nextInt(var5 + 1);
         if (var5 != var6) {
            long var7 = var0[var5];
            var0[var5] = var0[var6];
            var0[var6] = var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([CI[CII)V")
   @ObfuscatedName("ae")
   static void method14248(char[] var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([II[III)V")
   @ObfuscatedName("an")
   static void method14252(int[] var0, int var1, int[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            var1 += --var4;
            var3 += var4;
            var4 = var1 - var4;

            for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            var4 -= 7;

            while (var1 >= var4) {
               var2[var3--] = var0[var1--];
            }

            return;
         }
      }

      var4 += var1;

      for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      var4 += 7;

      while (var1 < var4) {
         var2[var3++] = var0[var1++];
      }
   }
}
