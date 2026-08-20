import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oz")
public class SpriteMask extends DualNode {
   @ObfuscatedName("av")
   public final int width;
   @ObfuscatedName("an")
   public final int[] xStarts;
   @ObfuscatedName("ag")
   public final int[] xWidths;
   @ObfuscatedName("at")
   public final int height;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final String field4764 = "random.dat";
   @ObfuscatedName("uf")
   static int field4763;
   @ToRemove(unused = "true")
   @ObfuscatedName("ev")
   static final int field4762 = -2;

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("kz")
   public int[] method8687() {
      return this.xStarts;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("av")
   public boolean contains(int var1, int var2, int var3) {
      try {
         if (var2 >= 0) {
            if (var3 == 696544814) {
               throw new IllegalStateException();
            }

            if (var2 < this.xStarts.length) {
               if (var3 == 696544814) {
                  throw new IllegalStateException();
               }

               int var4 = this.xStarts[var2];
               if (var1 >= var4) {
                  if (var3 == 696544814) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var4 + this.xWidths[var2]) {
                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vo")
   public int method8688() {
      return this.height * 915756381;
   }

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.height = -973625611 * var1;
      this.width = 1950348697 * var2;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("xo")
   public int method8689() {
      return this.width * 1668058793;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("uy")
   public boolean method8685(int var1, int var2) {
      if (var2 >= 0 && var2 < this.xStarts.length) {
         int var3 = this.xStarts[var2];
         if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("uo")
   public int[] method8690() {
      return this.xWidths;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("at")
   public boolean method8691(int var1, int var2) {
      return this.contains(var1, var2, -729119930);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIII)V")
   @ObfuscatedName("kg")
   static void method8686(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         NodeDeque var8 = var0.groundItems[var1][var2][var3];
         if (null != var8) {
            if (var7 >= 1986119854) {
               return;
            }

            for (TileItem var9 = (TileItem)var8.last(); var9 != null; var9 = (TileItem)var8.previous()) {
               if (var7 >= 1986119854) {
                  throw new IllegalStateException();
               }

               if (var4 == var9.visibleTime * 782226465) {
                  if (var7 >= 1986119854) {
                     throw new IllegalStateException();
                  }

                  if (var9.despawnTime * -1247866467 == var5) {
                     if (var7 >= 1986119854) {
                        throw new IllegalStateException();
                     }

                     int var10001 = 274398389 * var6;
                     var9.method3053(274398389 * var6 * -1247866467);
                     var9.despawnTime = var10001;
                     break;
                  }
               }
            }

            class157.updateItemPile(var1, var2, var3, 979484512);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "oz.kg(" + ')');
      }
   }
}
