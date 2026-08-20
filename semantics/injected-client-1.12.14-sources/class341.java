import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nu")
public class class341 {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4344 = 250;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field4345 = 57;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ae")
   static final void method7849(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ag")
   public static final void method7846(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            Interpreter.method993(var0 - 1L);
            Interpreter.method993(1L);
         } else {
            Interpreter.method993(var0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("an")
   public static final void method7847(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            Interpreter.method993(var0 - 1L);
            Interpreter.method993(1L);
         } else {
            Interpreter.method993(var0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)Luv;")
   @ObfuscatedName("xw")
   public static ClickAction method7851(WorldViewManager var0, int var1) {
      ClickAction var2 = (ClickAction)var0.field1225.get(var1);
      return null != var2 ? var2 : var0.field1231;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmn;)V")
   @ObfuscatedName("zj")
   public static void method7850(WorldMapSection1 var0) {
      if (var0 == null) {
         var0.method7450();
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("at")
   public static int method7848(int var0, byte var1) {
      try {
         return -512 + var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nu.at(" + 41);
      }
   }

   class341() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ay")
   public static boolean isDigit(char var0, int var1) {
      try {
         if (var0 >= '0') {
            if (var1 == 1759706017) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               if (var1 == 1759706017) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nu.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([J[IIII)V")
   @ObfuscatedName("ap")
   public static void method7852(long[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 <= 467546243) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            byte var10000;
            if (Long.MAX_VALUE == var7) {
               if (var4 <= 467546243) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var10 = var10000;

            for (int var11 = var2; var11 < var3; var11++) {
               if (var0[var11] < (var11 & var10) + var7) {
                  long var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  int var14 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var14;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method7852(var0, var1, var2, var6 - 1, 1822780152);
            method7852(var0, var1, 1 + var6, var3, 518629670);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "nu.ap(" + ')');
      }
   }
}
