import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
public class classVT extends class565 {
   @ObfuscatedName("at")
   final int[][] field6296;
   @ObfuscatedName("av")
   final int[][] field6295 = new int[16][4];
   @ObfuscatedName("an")
   final int[] field6297;
   @ObfuscatedSignature(descriptor = "[Lrl;")
   @ObfuscatedName("aj")
   final Bounds[] field6301;
   @ObfuscatedSignature(descriptor = "[Lrl;")
   @ObfuscatedName("ae")
   final Bounds[] field6299;
   @ObfuscatedName("ag")
   final int[] field6298;
   @ObfuscatedSignature(descriptor = "[Lrl;")
   @ObfuscatedName("ak")
   final Bounds[] field6300;

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("at")
   int method11588(int var1, int var2, byte var3) {
      try {
         return this.field6296[var1][var2];
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vt.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("av")
   int method11584(int var1, int var2, byte var3) {
      try {
         return this.field6295[var1][var2];
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vt.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   int method11585(int var1, int var2) {
      return this.field6295[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   int method11589(int var1, int var2) {
      return this.field6296[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   int method11586(int var1, int var2) {
      return this.field6295[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   int method11587(int var1, int var2) {
      return this.field6295[var1][var2];
   }

   classVT(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field6296 = new int[16][4];
      this.field6297 = new int[16];
      this.field6298 = new int[16];
      this.field6299 = new Bounds[16];
      this.field6301 = new Bounds[16];
      this.field6300 = new Bounds[16];

      for (int var7 = 0; var7 < 16; var7++) {
         int var8 = var7 * 128;
         int var9 = classUD.field6022[var8 & 2047];
         int var11 = class66.method1386(var8, 340995275);
         int var12 = -(var9 * var3 - var11 * var4 >> 16);
         int var13 = var3 * var11 + var9 * var4 >> 16;
         int var14 = this.field6163 * 299509079 * var9 - var11 * this.field6164 * -1524422205 >> 16;
         int var15 = this.field6164 * -1524422205 * var9 + var11 * this.field6163 * 299509079 >> 16;
         int var16 = this.field6163 * 299509079 * var9 + -1524422205 * this.field6164 * var11 >> 16;
         int var17 = -1524422205 * this.field6164 * var9 - var11 * this.field6163 * 299509079 >> 16;
         this.field6295[var7] = new int[4];
         this.field6296[var7] = new int[4];
         this.field6295[var7][0] = var12 - var14;
         this.field6296[var7][0] = var13 + var15;
         this.field6295[var7][1] = var16 + var12;
         this.field6296[var7][1] = var13 + var17;
         this.field6295[var7][2] = var12 + var14;
         this.field6296[var7][2] = var13 - var15;
         this.field6295[var7][3] = var12 - var16;
         this.field6296[var7][3] = var13 - var17;
         this.field6297[var7] = Math.abs(var11 * -1524422205 * this.field6164) >> 16;
         this.field6298[var7] = Math.abs(-1524422205 * this.field6164 * var9) >> 16;
         int var18 = Math.min(this.field6295[var7][0], Math.min(this.field6295[var7][1], Math.min(this.field6295[var7][2], this.field6295[var7][3])));
         int var19 = Math.max(this.field6295[var7][0], Math.max(this.field6295[var7][1], Math.max(this.field6295[var7][2], this.field6295[var7][3])));
         int var20 = Math.min(this.field6296[var7][0], Math.min(this.field6296[var7][1], Math.min(this.field6296[var7][2], this.field6296[var7][3])));
         int var21 = Math.max(this.field6296[var7][0], Math.max(this.field6296[var7][1], Math.max(this.field6296[var7][2], this.field6296[var7][3])));
         this.field6299[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
         var18 = Math.min(this.field6295[var7][2], Math.min(this.field6295[var7][3], var12));
         var19 = Math.max(this.field6295[var7][2], Math.max(this.field6295[var7][3], var12));
         var20 = Math.min(this.field6296[var7][2], Math.min(this.field6296[var7][3], var13));
         var21 = Math.max(this.field6296[var7][2], Math.max(this.field6296[var7][3], var13));
         this.field6301[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
         var18 = Math.min(this.field6295[var7][0], Math.min(this.field6295[var7][1], var12));
         var19 = Math.max(this.field6295[var7][0], Math.max(this.field6295[var7][1], var12));
         var20 = Math.min(this.field6296[var7][0], Math.min(this.field6296[var7][1], var13));
         var21 = Math.max(this.field6296[var7][0], Math.max(this.field6296[var7][1], var13));
         this.field6300[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
      }
   }

   public classVT(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 2359552, 0);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   int method11590(int var1, int var2) {
      return this.field6296[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   int method11591(int var1, int var2) {
      return this.field6296[var1][var2];
   }
}
