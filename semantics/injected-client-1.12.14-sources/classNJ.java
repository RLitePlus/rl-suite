import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nj")
public class classNJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field4298 = 0;
   @ObfuscatedName("av")
   static int[] field4297 = new int[33];
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4299 = 6;

   static {
      new Object();
      field4297[0] = 0;
      byte var0 = 2;

      for (int var1 = 1; var1 < 33; var1++) {
         field4297[var1] = var0 - 1;
         var0 += var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ad")
   public static int method7764(int var0, int var1) {
      int var2 = 1;

      while (var1 > 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
         var1 >>= 1;
      }

      return var1 == 1 ? var0 * var2 : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bk")
   public static int method7781(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bt")
   public static int method7787(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public static int method7765(int var0, int var1) {
      int var2 = 1;

      while (var1 > 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
         var1 >>= 1;
      }

      return var1 == 1 ? var0 * var2 : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public static int method7767(int var0) {
      return field4297[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ao")
   public static int method7774(int var0, int var1, int var2) {
      int var3 = SpotAnimationDefinition.method4605(1 + (var2 - var1), 745523138);
      var3 <<= var1;
      int var4;
      return var4 = var0 & ~var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method7768(int var0) {
      return field4297[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method7769(int var0) {
      return field4297[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public static int method7771(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public static int method7772(int var0) {
      var0 = (var0 >>> 1 & 732251189) + (var0 & 1780553995);
      var0 = (var0 & 1322548093) + (var0 >>> 2 & 324677842);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public static int method7773(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("am")
   public static int method7775(int var0, int var1, int var2) {
      int var3 = SpotAnimationDefinition.method4605(1 + (var2 - var1), -349529781);
      var3 <<= var1;
      int var4;
      return var4 = var0 & ~var3;
   }

   classNJ() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aa")
   public static int method7776(int var0, int var1, int var2) {
      int var3 = SpotAnimationDefinition.method4605(var2 - var1 + 1, -1165107834);
      var3 <<= var1;
      return var0 | var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aq")
   public static int method7777(int var0, int var1, int var2) {
      int var3 = SpotAnimationDefinition.method4605(var2 - var1 + 1, -1390169314);
      var3 <<= var1;
      return var0 | var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ai")
   public static int method7766(int var0, int var1) {
      int var2 = 1;

      while (var1 > 1) {
         if (0 != (var1 & 1)) {
            var2 *= var0;
         }

         var0 *= var0;
         var1 >>= 1;
      }

      return var1 == 1 ? var0 * var2 : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public static int method7778(int var0) {
      var0 = --var0 | var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   public static int method7780(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         var1++;
      }

      return var0 + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bs")
   public static int method7782(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bz")
   public static int method7783(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   public static int method7779(int var0) {
      var0 = --var0 | var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bb")
   public static int method7784(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bj")
   public static int method7785(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method7770(int var0) {
      return field4297[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bp")
   public static int method7788(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("bm")
   public static long method7786(int var0) {
      if (var0 > 63) {
         throw new classRR(
            "Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
            new Object[]{var0}
         );
      } else {
         return (long)Math.pow(2.0, var0) - 1L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("bu")
   public static float method7789(float var0, float var1, float var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFF)F")
   @ObfuscatedName("ba")
   public static float method7790(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      float var11 = (var4 - var3) * (var5 - var7) + (var2 - var4) * (var6 - var7);
      float var12 = ((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
      float var13 = ((var2 - var4) * (var1 - var7) + (var0 - var4) * (var7 - var5)) / var11;
      float var14 = 1.0F - var12 - var13;
      return var9 * var13 + var8 * var12 + var14 * var10;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFF)F")
   @ObfuscatedName("bi")
   public static float method7791(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      float var11 = (var4 - var3) * (var5 - var7) + (var2 - var4) * (var6 - var7);
      float var12 = ((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
      float var13 = ((var2 - var4) * (var1 - var7) + (var0 - var4) * (var7 - var5)) / var11;
      float var14 = 1.0F - var12 - var13;
      return var9 * var13 + var8 * var12 + var14 * var10;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("cs")
   static int method7792(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (7900 == var0) {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            client.field711 = Math.max(var4, 0) * -705147593;
            return 1;
         } else if (7901 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field711 * -338757497;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nj.cs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("av")
   public static void method7763(AbstractArchive var0, int var1) {
      try {
         VarcInt.VarcInt_archive = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nj.av(" + ')');
      }
   }
}
