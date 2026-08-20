import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xp")
final class classXP implements classXF {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6906 = 3;

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("af")
   @Override
   public classXT vmethod647() {
      return classXT.field6937;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;)I")
   @ObfuscatedName("vl")
   public static int method12867(classAAE var0) {
      return null == var0.field41 ? 0 : var0.field41.hashCode();
   }

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("az")
   @Override
   public classXT vmethod648(byte var1) {
      try {
         return classXT.field6937;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bt")
   static void method12868(int var0, int var1, int var2, int var3, int var4) {
      try {
         classCT var5 = classMB.method7521(1056436667);
         classJL var6 = classEF.method3849(classJS.MOVE_MINIMAPCLICK, client.field795.field1535, (byte)-67);
         classXY.method12971(var6.field3343, 18, (byte)-47);
         var6.field3343.method13188(var1 + -351145363 * classIS.field3053.field1708, (short)-17424);
         classXS var10000 = var6.field3343;
         byte var10001;
         if (classFA.method4540(client.field931, 82, 842830430)) {
            if (var4 <= 99079134) {
               return;
            }

            if (classFA.method4540(client.field931, 81, 1295652530)) {
               if (var4 <= 99079134) {
                  throw new IllegalStateException();
               }

               var10001 = 2;
            } else {
               var10001 = 1;
            }
         } else {
            var10001 = 0;
         }

         var10000.method13153(var10001, (byte)67);
         var6.field3343.method13188(-1444178379 * classIS.field3053.field1709 + var0, (short)-3113);
         classXY.method12971(var6.field3343, var2, (byte)-65);
         classXY.method12971(var6.field3343, var3, (byte)-21);
         var6.field3343.method12973(client.field994.method11454(556954181), -1542382992);
         classXY.method12971(var6.field3343, 57, (byte)-118);
         classXY.method12971(var6.field3343, 0, (byte)-49);
         classXY.method12971(var6.field3343, 0, (byte)-73);
         classXY.method12971(var6.field3343, 89, (byte)-23);
         if (null == var5) {
            if (var4 <= 99079134) {
               throw new IllegalStateException();
            }

            var10001 = 0;
         } else {
            var10001 = -1547553299 * var5.field1487;
         }

         var6.field3343.method12973(var10001, -1542382992);
         if (null == var5) {
            if (var4 <= 99079134) {
               throw new IllegalStateException();
            }

            var10001 = 0;
         } else {
            var10001 = var5.field1489 * -1272026483;
         }

         var6.field3343.method12973(var10001, -1542382992);
         classXY.method12971(var6.field3343, 63, (byte)-66);
         client.field795.method3367(var6, -1301097035);
         client.field859 = var0 * -1254957895;
         client.field834 = -877699493 * var1;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "xp.bt(" + ')');
      }
   }
}
