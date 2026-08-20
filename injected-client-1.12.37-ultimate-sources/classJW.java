import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jw")
public class classJW {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   public static final int field3492 = 69;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field3491 = 25;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("af")
   public static final void method6415(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var7) {
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var6) {
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var5) {
            }
         }
      }
   }

   classJW() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ae")
   public static final void method6416(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var7) {
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var6) {
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var5) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   public static boolean method6418(int var0, int var1) {
      try {
         if (var0 >= classKB.field3515.field3538 * 78062377) {
            if (var1 <= -597053532) {
               throw new IllegalStateException();
            }

            if (var0 <= classKB.field3518.field3538 * 78062377) {
               return true;
            }

            if (var1 <= -597053532) {
               throw new IllegalStateException();
            }
         }

         if (var0 != classKB.field3519.field3538 * 78062377) {
            return false;
         } else if (var1 <= -597053532) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Log;")
   @ObfuscatedName("af")
   public static classOG method6417(int var0, byte var1) {
      try {
         switch (var0 >> 18 & 3) {
            case 0:
               return classOG.field4862;
            case 1:
               return classOG.field4863;
            case 2:
               return classOG.field4864;
            default:
               throw new IllegalArgumentException("invalid scope");
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jw.af(" + ')');
      }
   }
}
