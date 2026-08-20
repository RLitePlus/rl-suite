import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gv")
public class classGV {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2103 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field2104 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2101 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field2102 = 72;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field2100 = 67;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2106 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2105 = 2;

   @ObfuscatedSignature(descriptor = "(Lof;IIIB)V")
   @ObfuscatedName("oe")
   static final void method4372(Widget var0, int var1, int var2, int var3, byte var4) {
      try {
         SpriteMask var5 = var0.method8051(class226.widgetDefinition, false, -1977778941);
         if (var5 == null) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            if (class39.minimapState * 597277019 < 3) {
               class472.compass
                  .method12675(
                     var1,
                     var2,
                     915756381 * var5.height,
                     var5.width * 1668058793,
                     25,
                     25,
                     1853484313 * client.camAngleY,
                     256,
                     var1,
                     var2,
                     var5.xStarts,
                     var5.xWidths
                  );
            } else {
               Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var5.xStarts, var5.xWidths);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gv.oe(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   static final void method4371(int var0) {
      try {
         if (Occluder.topLevelWorldView.plane * 2115028565 != class39.field189 * 471691931) {
            if (var0 == 928687775) {
               return;
            }

            class39.field189 = -569146929 * Occluder.topLevelWorldView.plane;
            SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * 2115028565, -590831217);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gv.ay(" + ')');
      }
   }

   classGV() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   static final boolean method4370(int var0, int var1) {
      try {
         if (14 != var0) {
            if (var1 <= -16711936) {
               throw new IllegalStateException();
            }

            if (15 != var0) {
               if (var0 < 44) {
                  return false;
               }

               if (var1 <= -16711936) {
                  throw new IllegalStateException();
               }

               if (var0 > 51) {
                  return false;
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gv.av(" + ')');
      }
   }
}
