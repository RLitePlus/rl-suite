import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lr")
public final class WorldMapRectangle {
   @ObfuscatedName("nd")
   static boolean field3766;
   @ObfuscatedName("ag")
   int x;
   @ObfuscatedName("av")
   int width;
   @ObfuscatedName("at")
   int height;
   @ObfuscatedName("an")
   int y;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field3759 = 23;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field3764 = 4096;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kz")
   static Archive archive12;

   @ObfuscatedSignature(descriptor = "(Lof;ZI)V")
   @ObfuscatedName("au")
   static void method7261(Widget var0, boolean var1, int var2) {
      try {
         if (var0 != null) {
            if (var2 >= 56937401) {
               throw new IllegalStateException();
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            if (var1) {
               if (var2 >= 56937401) {
                  throw new IllegalStateException();
               }

               UserComparator3.scriptDotWidget = var0;
            } else {
               class222.scriptActiveWidget = var0;
            }
         } else {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lr.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Z")
   @ObfuscatedName("al")
   public static boolean method7259(ClientPreferences var0) {
      return var0.titleMusicDisabled;
   }

   @ObfuscatedSignature(descriptor = "(ILof;IIIII[FI)Lof;")
   @ObfuscatedName("av")
   static Widget method7260(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int var8) {
      try {
         Widget var9 = new Widget();
         var9.type = var0 * -530909857;
         var9.parentId = var1.id * -1601929789;
         var9.childIndex = var2 * 1657618603;
         var9.isIf3 = true;
         var9.xAlignment = -1747850943 * var3;
         var9.yAlignment = -1356647925 * var4;
         var9.widthAlignment = var5 * -1384270729;
         var9.heightAlignment = var6 * -500921095;
         var9.rawX = -1005032755 * (int)(var7[0] * (-1946208531 * var1.width));
         var9.rawY = -752065015 * (int)(var1.height * -905446999 * var7[1]);
         var9.rawWidth = (int)(-1946208531 * var1.width * var7[2]) * 1403700735;
         var9.rawHeight = 449174585 * (int)(-905446999 * var1.height * var7[3]);
         return var9;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "lr.av(" + ')');
      }
   }

   WorldMapRectangle(WorldMapRenderer var1) {
      this.this$0 = var1;
   }
}
