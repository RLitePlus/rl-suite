import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mk")
public class classMK {
   @ObfuscatedName("ax")
   static Thread field4522;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4521 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4520 = 5;

   classMK() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;Ljava/lang/String;)V")
   @ObfuscatedName("xk")
   public static void method7594(NPC var0, String var1) {
      if (var0 == null) {
         var0.vmethod270();
      }

      var0.field1571 = var1 == null ? "" : var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;I[B[BB)V")
   @ObfuscatedName("ap")
   static final void method7595(Widget var0, int var1, byte[] var2, byte[] var3, byte var4) {
      try {
         if (null == var0.field4312) {
            if (var4 == 1) {
               throw new IllegalStateException();
            }

            if (var2 == null) {
               return;
            }

            var0.field4312 = new byte[11][];
            var0.field4346 = new byte[11][];
            var0.field4370 = new int[11];
            var0.field4371 = new int[11];
         }

         var0.field4312[var1] = var2;
         if (null != var2) {
            if (var4 == 1) {
               throw new IllegalStateException();
            }

            var0.field4360 = true;
         } else {
            var0.field4360 = false;

            for (int var5 = 0; var5 < var0.field4312.length; var5++) {
               if (var4 == 1) {
                  return;
               }

               if (var0.field4312[var5] != null) {
                  if (var4 == 1) {
                     return;
                  }

                  var0.field4360 = true;
                  break;
               }
            }
         }

         var0.field4346[var1] = var3;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "mk.ap(" + ')');
      }
   }
}
