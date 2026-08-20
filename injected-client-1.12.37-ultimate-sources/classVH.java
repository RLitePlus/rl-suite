import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class classVH extends classVZ {
   @ObfuscatedSignature(descriptor = "[Luq;")
   @ObfuscatedName("ac")
   final classUQ[] field6511;
   @ObfuscatedName("af")
   final int[][] field6506;
   @ObfuscatedSignature(descriptor = "[Luq;")
   @ObfuscatedName("aa")
   final classUQ[] field6510;
   @ObfuscatedName("ab")
   final int[] field6512;
   @ObfuscatedName("ag")
   final int[] field6507;
   @ObfuscatedName("as")
   final int[] field6508;
   @ObfuscatedSignature(descriptor = "[Luq;")
   @ObfuscatedName("ax")
   final classUQ[] field6509;
   @ObfuscatedName("az")
   final int[][] field6504 = new int[16][4];
   @ObfuscatedName("ae")
   final int[] field6505;

   classVH(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field6506 = new int[16][4];
      this.field6505 = new int[16];
      this.field6512 = new int[16];
      this.field6507 = new int[16];
      this.field6508 = new int[16];
      this.field6509 = new classUQ[16];
      this.field6511 = new classUQ[16];
      this.field6510 = new classUQ[16];

      for (int var7 = 0; var7 < 16; var7++) {
         int var8 = 128 * var7;
         int var9 = classGP.method5548(var8, 1208260883);
         int var10 = classGV.field2705[var8 & 2047];
         this.field6505[var7] = -(var9 * var3 - var4 * var10 >> 16);
         this.field6512[var7] = var10 * var3 + var4 * var9 >> 16;
         int var12 = this.field6650 * 1905552099 * var9 - this.field6647 * 455672321 * var10 >> 16;
         int var13 = var9 * this.field6647 * 455672321 + var10 * 1905552099 * this.field6650 >> 16;
         int var14 = 455672321 * this.field6647 * var10 + 1905552099 * this.field6650 * var9 >> 16;
         int var15 = var9 * this.field6647 * 455672321 - var10 * this.field6650 * 1905552099 >> 16;
         this.field6504[var7] = new int[4];
         this.field6506[var7] = new int[4];
         this.field6504[var7][0] = this.field6505[var7] - var12;
         this.field6506[var7][0] = var13 + this.field6512[var7];
         this.field6504[var7][1] = var14 + this.field6505[var7];
         this.field6506[var7][1] = var15 + this.field6512[var7];
         this.field6504[var7][2] = this.field6505[var7] + var12;
         this.field6506[var7][2] = this.field6512[var7] - var13;
         this.field6504[var7][3] = this.field6505[var7] - var14;
         this.field6506[var7][3] = this.field6512[var7] - var15;
         int var16 = this.field6650 * 1905552099 * var9 >> 16;
         int var17 = this.field6650 * 1905552099 * var10 >> 16;
         int var18 = this.field6505[var7] - var16;
         int var19 = this.field6512[var7] + var17;
         int var20 = this.field6505[var7] + var16;
         int var21 = this.field6512[var7] - var17;
         this.field6507[var7] = Math.abs(var10 * 455672321 * this.field6647) >> 16;
         this.field6508[var7] = Math.abs(var9 * 455672321 * this.field6647) >> 16;
         int var22 = Math.min(this.field6504[var7][0], Math.min(this.field6504[var7][1], Math.min(this.field6504[var7][2], this.field6504[var7][3])));
         int var23 = Math.max(this.field6504[var7][0], Math.max(this.field6504[var7][1], Math.max(this.field6504[var7][2], this.field6504[var7][3])));
         int var24 = Math.min(this.field6506[var7][0], Math.min(this.field6506[var7][1], Math.min(this.field6506[var7][2], this.field6506[var7][3])));
         int var25 = Math.max(this.field6506[var7][0], Math.max(this.field6506[var7][1], Math.max(this.field6506[var7][2], this.field6506[var7][3])));
         this.field6509[var7] = new classUQ(var22, var24, var23 - var22, var25 - var24);
         var22 = Math.min(this.field6504[var7][2], Math.min(this.field6504[var7][3], Math.min(var20, var18)));
         var23 = Math.max(this.field6504[var7][2], Math.max(this.field6504[var7][3], Math.max(var20, var18)));
         var24 = Math.min(this.field6506[var7][2], Math.min(this.field6506[var7][3], Math.min(var21, var19)));
         var25 = Math.max(this.field6506[var7][2], Math.max(this.field6506[var7][3], Math.max(var21, var19)));
         this.field6511[var7] = new classUQ(var22, var24, var23 - var22, var25 - var24);
         var22 = Math.min(this.field6504[var7][0], Math.min(this.field6504[var7][1], Math.min(var18, var20)));
         var23 = Math.max(this.field6504[var7][0], Math.max(this.field6504[var7][1], Math.max(var18, var20)));
         var24 = Math.min(this.field6506[var7][0], Math.min(this.field6506[var7][1], Math.min(var19, var21)));
         var25 = Math.max(this.field6506[var7][0], Math.max(this.field6506[var7][1], Math.max(var19, var21)));
         this.field6510[var7] = new classUQ(var22, var24, var23 - var22, var25 - var24);
      }
   }

   public classVH(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 2359552, 0);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   int method11946(int var1, int var2, int var3) {
      try {
         return this.field6506[var1][var2];
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vh.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   int method11943(int var1, int var2) {
      return this.field6504[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("az")
   int method11944(int var1, int var2, byte var3) {
      try {
         return this.field6504[var1][var2];
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vh.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   int method11945(int var1, int var2) {
      return this.field6504[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method11951(int var1) {
      return this.field6512[var1 & 15];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ac")
   int method11947(int var1, int var2) {
      return this.field6506[var1][var2];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   int method11952(int var1) {
      return this.field6512[var1 & 15];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method11953(int var1) {
      return this.field6512[var1 & 15];
   }

   @ObfuscatedSignature(descriptor = "(Lvh;II)I")
   @ObfuscatedName("oo")
   public static int method11948(classVH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11949(var1, var1);
      }

      try {
         return var0.field6505[var1 & 15];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vh.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   int method11954(int var1) {
      return this.field6512[var1 & 15];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   int method11955(int var1, int var2) {
      try {
         return this.field6505[var1 & 15];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vh.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   int method11949(int var1, int var2) {
      try {
         return this.field6508[var1 & 15];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vh.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvh;II)I")
   @ObfuscatedName("mv")
   public static int method11956(classVH var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method11955(var1, var1);
      } else {
         try {
            return var0.field6512[var1 & 15];
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "vh.ab(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   int method11950(int var1) {
      return this.field6507[var1 & 15];
   }
}
