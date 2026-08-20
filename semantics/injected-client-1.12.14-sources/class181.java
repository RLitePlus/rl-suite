import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gr")
public class class181 extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   public static final int field2055 = 65;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   public static final int field2054 = 38;
   @ObfuscatedSignature(descriptor = "Lrl;")
   @ObfuscatedName("bl")
   static Bounds field2057;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field1915 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2053 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("dv")
   static final String field2056 = "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field2052 = 21;

   class181() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)Lhm;")
   @ObfuscatedName("av")
   public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0, int var1) {
      try {
         SpotAnimationDefinition var2 = (SpotAnimationDefinition)class402.method8806(SpotAnimationDefinition.SpotAnimationDefinition_cached, var0);
         if (var2 != null) {
            if (var1 <= -1238659105) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = SpotAnimationDefinition.field2269.getFile(13, var0, 1579978917);
            var2 = new SpotAnimationDefinition();
            var2.id = -599588673 * var0;
            if (null != var3) {
               if (var1 <= -1238659105) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), 3367135);
            }

            SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)Lsu;")
   @ObfuscatedName("ad")
   public static Font method4267(byte[] var0, int var1) {
      try {
         if (null == var0) {
            if (var1 != 16777215) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Font var2 = new Font(
               var0,
               class615.SpriteBuffer_xOffsets,
               class615.SpriteBuffer_yOffsets,
               IntHashTable.SpriteBuffer_spriteWidths,
               class615.SpriteBuffer_spriteHeights,
               BufferedSource.SpriteBuffer_spritePalette,
               class320.SpriteBuffer_pixels
            );
            class615.SpriteBuffer_xOffsets = null;
            class615.SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            class615.SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gr.ad(" + ')');
      }
   }
}
