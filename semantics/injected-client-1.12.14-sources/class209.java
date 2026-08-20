import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("if")
public class class209 extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field2467 = 38;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("an")
   static AbstractArchive WorldMapElement_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field2468 = 51;
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   static final int field2469 = 73;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field2136 = new EvictingDualNodeHashTable(64);

   class209() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   static int ItemContainer_getCount(int var0, int var1, int var2) {
      try {
         ItemContainer var3 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (null == var3) {
            return 0;
         } else {
            if (var1 >= 0) {
               if (var2 != 1148857744) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.quantities.length) {
                  return var3.quantities[var1];
               }
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "if.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ab")
   public static int method4886(int var0, byte var1) {
      try {
         if (var0 > 0) {
            return 1;
         } else if (var0 < 0) {
            if (var1 >= 24) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "if.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("co")
   static int method4887(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (13337 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -2113340171 * Interpreter.field339;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "if.co(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lxm;")
   @ObfuscatedName("ay")
   static IndexedSprite method4885(byte var0) {
      try {
         IndexedSprite var1 = new IndexedSprite();
         var1.width = class208.SpriteBuffer_spriteWidth * -1309012693;
         var1.height = 722593713 * class144.SpriteBuffer_spriteHeight;
         var1.xOffset = class615.SpriteBuffer_xOffsets[0];
         var1.yOffset = class615.SpriteBuffer_yOffsets[0];
         var1.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
         var1.subHeight = class615.SpriteBuffer_spriteHeights[0];
         var1.palette = BufferedSource.SpriteBuffer_spritePalette;
         var1.pixels = class320.SpriteBuffer_pixels[0];
         class615.SpriteBuffer_xOffsets = null;
         class615.SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         class615.SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "if.ay(" + ')');
      }
   }
}
