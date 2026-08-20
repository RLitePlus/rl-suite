import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("je")
public class AABB implements net.runelite.api.AABB {
   @ObfuscatedName("av")
   final int orientation;
   @ObfuscatedName("at")
   int xMid;
   @ObfuscatedName("ag")
   int yMid;
   @ObfuscatedName("an")
   int zMid;
   @ObfuscatedName("ae")
   int xMidOffset;
   @ObfuscatedName("aj")
   int yMidOffset;
   @ObfuscatedName("ak")
   int zMidOffset;
   @ObfuscatedSignature(descriptor = "Lje;")
   @ObfuscatedName("aw")
   AABB aabb;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2836 = 12;

   public int getCenterY() {
      return this.yMid * 1267849313;
   }

   public int getCenterX() {
      return this.xMid * -1721312265;
   }

   public int getExtremeZ() {
      return this.zMidOffset * 528344083;
   }

   public int getExtremeX() {
      return this.xMidOffset * 984504841;
   }

   public int getExtremeY() {
      return this.yMidOffset * -157622439;
   }

   public int getCenterZ() {
      return this.zMid * 266507379;
   }

   AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.orientation = var1 * -136614271;
      this.xMid = var2 * 1636718023;
      this.yMid = var3 * -1477260383;
      this.zMid = var4 * 767045819;
      this.xMidOffset = -783592391 * var5;
      this.yMidOffset = var6 * 486635753;
      this.zMidOffset = var7 * -1423079909;
   }
}
