import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cy")
public class class70 {
   @ObfuscatedName("ar")
   public static int[] ByteArrayPool_altSizeArrayCounts;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("dl")
   static IndexedSprite worldSelectLeftSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1257 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1258 = Integer.MAX_VALUE;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1256 = 60;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1261 = 16748608;
   @ToRemove(unused = "true")
   @ObfuscatedName("dt")
   static final int field1263 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1260 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1262 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1259 = 100;

   @ObfuscatedSignature(descriptor = "(Lof;IIZI)V")
   @ObfuscatedName("mz")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3, int var4) {
      try {
         int var5 = var0.width * -1946208531;
         int var6 = var0.height * -905446999;
         if (0 == 831546695 * var0.widthAlignment) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.width = 369838875 * var0.rawWidth;
         } else if (1 == var0.widthAlignment * 831546695) {
            if (var4 <= 1621421497) {
               return;
            }

            var0.width = (var1 - 1127299583 * var0.rawWidth) * 1190762213;
         } else if (831546695 * var0.widthAlignment == 2) {
            if (var4 <= 1621421497) {
               return;
            }

            var0.width = (var1 * 1127299583 * var0.rawWidth >> 14) * 1190762213;
         }

         if (1876325705 * var0.heightAlignment == 0) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.height = -651980447 * var0.rawHeight;
         } else if (1 == var0.heightAlignment * 1876325705) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.height = (var2 - 1955156489 * var0.rawHeight) * -1551910247;
         } else if (2 == var0.heightAlignment * 1876325705) {
            if (var4 <= 1621421497) {
               return;
            }

            var0.height = (var2 * var0.rawHeight * 1955156489 >> 14) * -1551910247;
         }

         if (4 == 831546695 * var0.widthAlignment) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.width = 1190762213 * (-905446999 * var0.height * 105193489 * var0.field4448 / (-1105373189 * var0.field4449));
         }

         if (4 == 1876325705 * var0.heightAlignment) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.height = -1551910247 * (var0.field4449 * -1105373189 * var0.width * -1946208531 / (var0.field4448 * 105193489));
         }

         if (1337 == 1889823193 * var0.contentType) {
            client.viewportWidget = var0;
         }

         if (12 == var0.type * 928687775) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            var0.method8156(1740372303).method8388(-1946208531 * var0.width, var0.height * -905446999, 353138520);
         }

         if (var3) {
            if (var4 <= 1621421497) {
               throw new IllegalStateException();
            }

            if (var0.onTargetLeave != null) {
               if (var4 <= 1621421497) {
                  throw new IllegalStateException();
               }

               if (var5 != -1946208531 * var0.width || -905446999 * var0.height != var6) {
                  ScriptEvent var7 = new ScriptEvent();
                  var7.widget = var0;
                  var7.args = var0.onTargetLeave;
                  client.scriptEvents.addFirst(var7);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cy.mz(" + ')');
      }
   }

   class70() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIB)Lbu;")
   @ObfuscatedName("ag")
   static Message Messages_getByChannelAndID(int var0, int var1, byte var2) {
      try {
         ChatChannel var3 = (ChatChannel)Messages.Messages_channels.get(var0);
         return var3.getMessage(var1, -1671591810);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cy.ag(" + ')');
      }
   }
}
