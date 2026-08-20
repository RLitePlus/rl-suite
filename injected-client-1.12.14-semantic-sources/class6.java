import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ak")
public class class6 implements Enum {
   @ObfuscatedName("at")
   public final int field23;
   @ObfuscatedName("ag")
   final int field24;
   @ToRemove(unused = "true")
   @ObfuscatedName("dm")
   static final int field29 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("df")
   public static final int field28 = 103;
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   static final int field27 = 40;
   @ObfuscatedSignature(descriptor = "Lak;")
   @ObfuscatedName("av")
   public static final class6 field22 = new class6(0, 0);
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field26 = 126;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field25 = 3;

   class6(int var1, int var2) {
      this.field23 = 315225233 * var1;
      this.field24 = var2 * 10900127;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field24 * -397915809;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ak.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field24 * -1698016338;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field24 * -397915809;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field24 * 353740486;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;B)V")
   @ObfuscatedName("at")
   static void method120(WorldView var0, int var1, int var2, int var3, SpriteMask var4, byte var5) {
      try {
         for (int var6 = 0; var6 < var0.sizeX * 2010544793; var6++) {
            if (var5 == 8) {
               return;
            }

            for (int var7 = 0; var7 < 1823353167 * var0.sizeY; var7++) {
               if (var5 == 8) {
                  return;
               }

               NodeDeque var8 = var0.groundItems[var0.plane * 2115028565][var6][var7];
               if (var8 != null) {
                  if (WorldView.method3060(var0, (byte)0)) {
                     if (var5 == 8) {
                        throw new IllegalStateException();
                     }

                     int var9 = 2 + var6 * 4 - -361115983 * client.field828 / 32;
                     int var10 = 2 + var7 * 4 - -291215063 * client.field674 / 32;
                     SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var9, var10, var3, classWZ.field6473[0], var4, 741861761);
                  } else {
                     ProjectionCoord var15 = classDH.method3122(var0, Coord.method8301(var6, -355008838), Coord.method8301(var7, -355008838), (byte)68);
                     int var16 = (int)var15.x;
                     int var11 = (int)var15.y;
                     var15.release(-804947546);
                     int var12 = var16 / 32 - -361115983 * client.field828 / 32;
                     int var13 = var11 / 32 - -291215063 * client.field674 / 32;
                     SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[0], var4, -1837706518);
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "ak.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("hf")
   static long getUserId(int var0) {
      try {
         return -7723409232129091151L * client.userId;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ak.hf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;I)J")
   @ObfuscatedName("as")
   public static long method121(DynamicArray var0, int var1) {
      try {
         ProjectionCoord.method9919(var0, class586.field6376, 283306842);
         int[] var2 = var0.method11207(2053374425);
         int var3 = var0.method11215((byte)39);
         long var4 = 0L;

         for (int var6 = 0; var6 < var3; var6++) {
            if (var1 != 764544479) {
               throw new IllegalStateException();
            }

            var4 += var2[var6];
         }

         return var4;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ak.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("av")
   public static float method119(int var0, int var1) {
      try {
         var0 &= 2047;
         return (float)(var0 / 2048.0F * (Math.PI * 2));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ak.av(" + ')');
      }
   }
}
