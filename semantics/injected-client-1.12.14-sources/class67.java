import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cz")
public class class67 implements Enum {
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("ag")
   static final class67 field1268 = new class67(2, 3);
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("at")
   static final class67 field1267 = new class67(1, 2);
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("av")
   static final class67 field1266 = new class67(0, -1);
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("an")
   static final class67 field1269 = new class67(3, 4);
   @ObfuscatedName("ar")
   static int[] Tiles_lightness;
   @ObfuscatedName("bv")
   static int field1275;
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("ak")
   static final class67 field1272 = new class67(6, 21);
   @ObfuscatedName("aw")
   final int field1274;
   @ObfuscatedName("ap")
   final int field1273;
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("aj")
   static final class67 field1270 = new class67(5, 6);
   @ObfuscatedSignature(descriptor = "Lcz;")
   @ObfuscatedName("ae")
   static final class67 field1271 = new class67(4, 5);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 1252580619 * this.field1273;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 1252580619 * this.field1273;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cz.av(" + 41);
      }
   }

   class67(int var1, int var2) {
      this.field1274 = -1916672359 * var1;
      this.field1273 = var2 * 570885795;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIII)Lcw;")
   @ObfuscatedName("lw")
   static final PendingSpawn method3010(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         for (PendingSpawn var6 = (PendingSpawn)var0.pendingSpawns.last(); null != var6; var6 = (PendingSpawn)var0.pendingSpawns.previous()) {
            if (var5 == -1028914101) {
               throw new IllegalStateException();
            }

            if (1465889165 * var6.plane == var1 && var2 == var6.x * 1691331269) {
               if (var5 == -1028914101) {
                  throw new IllegalStateException();
               }

               if (var3 == var6.y * -7912037 && var6.type * 1527879103 == var4) {
                  if (var5 == -1028914101) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "cz.lw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 1252580619 * this.field1273;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcz;")
   @ObfuscatedName("aj")
   static class67[] method3005() {
      return new class67[]{field1271, field1272, field1269, field1270, field1266, field1268, field1267};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Z")
   @ObfuscatedName("zr")
   public static boolean method3008(Buffer var0) {
      if (var0 == null) {
         var0.method12126();
      }

      return (var0.readUnsignedByte(1172006527) & 1) == 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcz;")
   @ObfuscatedName("ak")
   static class67[] method3006() {
      return new class67[]{field1271, field1272, field1269, field1270, field1266, field1268, field1267};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcz;")
   @ObfuscatedName("aw")
   static class67[] method3007() {
      return new class67[]{field1271, field1272, field1269, field1270, field1266, field1268, field1267};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 1252580619 * this.field1273;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIII)I")
   @ObfuscatedName("kw")
   static int method3009(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (var4 == 0) {
            if (var5 == -1615329940) {
               throw new IllegalStateException();
            } else {
               return NPCComposition.getTileHeight(var0, var1, var2, var3, -253070517);
            }
         } else {
            int var6 = var4 / 2;
            int var7 = var1 - var6;
            int var8 = var2 - var6;
            int var9 = var1 + var6;
            int var10 = var6 + var2;
            int var11 = Coord.method8304(var7, (byte)-32) + 1;
            int var12 = Coord.method8304(var8, (byte)-4) + 1;
            int var13 = Coord.method8304(var9, (byte)-104);
            int var14 = Coord.method8304(var10, (byte)-32);
            int var15 = Integer.MAX_VALUE;

            for (int var16 = var11; var16 <= var13; var16++) {
               if (var5 == -1615329940) {
                  throw new IllegalStateException();
               }

               for (int var17 = var12; var17 <= var14; var17++) {
                  if (var5 == -1615329940) {
                     throw new IllegalStateException();
                  }

                  var15 = Math.min(
                     var15, NPCComposition.getTileHeight(var0, Coord.method8301(var16, -355008838), Coord.method8301(var17, -355008838), var3, -253070517)
                  );
               }
            }

            var15 = Math.min(var15, NPCComposition.getTileHeight(var0, var1, var2, var3, -253070517));
            var15 = Math.min(var15, NPCComposition.getTileHeight(var0, var1 - var6, var2 - var6, var3, -253070517));
            var15 = Math.min(var15, NPCComposition.getTileHeight(var0, var1 - var6, var6 + var2, var3, -253070517));
            var15 = Math.min(var15, NPCComposition.getTileHeight(var0, var1 + var6, var2 - var6, var3, -253070517));
            return Math.min(var15, NPCComposition.getTileHeight(var0, var6 + var1, var6 + var2, var3, -253070517));
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "cz.kw(" + 41);
      }
   }
}
