import net.runelite.api.SceneTileModel;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fn")
public final class classFN implements SceneTileModel {
   @ObfuscatedName("aa")
   public int[] field2322;
   @ObfuscatedName("af")
   static final int[][] field2336 = new int[][]{
      {0, 1, 2, 3, 0, 0, 1, 3},
      {1, 1, 2, 3, 1, 0, 1, 3},
      {0, 1, 2, 3, 1, 0, 1, 3},
      {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3},
      {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4},
      {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4},
      {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3},
      {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3},
      {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5},
      {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5},
      {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3},
      {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3},
      {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}
   };
   @ObfuscatedName("ae")
   static float[] field2337 = new float[6];
   @ObfuscatedName("ak")
   int field2326;
   @ObfuscatedName("ap")
   public int[] field2331;
   @ObfuscatedName("as")
   static int[] field2339 = new int[6];
   @ObfuscatedName("ax")
   static int[] field2335 = new int[6];
   @ObfuscatedName("wf")
   public int field2344;
   @ObfuscatedName("ac")
   static int[] field2341 = new int[6];
   @ObfuscatedName("ab")
   static float[] field2340 = new float[6];
   @ObfuscatedName("ao")
   public int[] field2323;
   @ObfuscatedName("eo")
   public int field2342;
   @ObfuscatedName("al")
   public int[] field2327;
   @ObfuscatedName("aj")
   int[] field2332;
   @ObfuscatedName("ss")
   public int field2343;
   @ObfuscatedName("ay")
   int[] field2325;
   @ObfuscatedName("aq")
   int[] field2328;
   @ObfuscatedName("ad")
   public int[] field2330;
   @ObfuscatedName("aw")
   int field2320;
   @ObfuscatedName("au")
   public int[] field2329;
   @ObfuscatedName("az")
   static final int[][] field2334 = new int[][]{
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 2, 6},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 13, 14}
   };
   @ObfuscatedName("ai")
   int[] field2324;
   @ObfuscatedName("ag")
   static float[] field2338 = new float[6];
   @ObfuscatedName("ar")
   boolean field2319 = true;
   @ObfuscatedName("av")
   int field2333;
   @ObfuscatedName("at")
   int field2321;

   public void setBufferOffset(int var1) {
      this.field2342 = var1;
   }

   public int[] getFaceX() {
      return this.field2330;
   }

   public int getShape() {
      return this.field2320;
   }

   public int getModelUnderlay() {
      return this.field2333;
   }

   public int getModelOverlay() {
      return this.field2321;
   }

   public void setUvBufferOffset(int var1) {
      this.field2343 = var1;
   }

   classFN(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19
   ) {
      if (var6 != var7 || var6 != var8 || var6 != var9) {
         this.field2319 = false;
      }

      this.field2320 = var1;
      this.field2326 = var2;
      this.field2333 = var18;
      this.field2321 = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = field2334[var1];
      int var25 = var24.length;
      this.field2322 = new int[var25];
      this.field2323 = new int[var25];
      this.field2327 = new int[var25];
      int[] var26 = new int[var25];
      int[] var27 = new int[var25];
      int var28 = var4 * var20;
      int var29 = var5 * var20;

      for (int var30 = 0; var30 < var25; var30++) {
         int var31 = var24[var30];
         if ((var31 & 1) == 0 && var31 <= 8) {
            var31 = (var31 - var2 - var2 - 1 & 7) + 1;
         }

         if (var31 > 8 && var31 <= 12) {
            var31 = (var31 - 9 - var2 & 3) + 9;
         }

         if (var31 > 12 && var31 <= 16) {
            var31 = (var31 - 13 - var2 & 3) + 13;
         }

         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         if (var31 == 1) {
            var32 = var28;
            var33 = var29;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if (var31 == 2) {
            var32 = var28 + var21;
            var33 = var29;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if (var31 == 3) {
            var32 = var28 + var20;
            var33 = var29;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if (var31 == 4) {
            var32 = var28 + var20;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if (var31 == 5) {
            var32 = var28 + var20;
            var33 = var29 + var20;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else if (var31 == 6) {
            var32 = var28 + var21;
            var33 = var29 + var20;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if (var31 == 7) {
            var32 = var28;
            var33 = var29 + var20;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         } else if (var31 == 8) {
            var32 = var28;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if (var31 == 9) {
            var32 = var28 + var21;
            var33 = var29 + var22;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if (var31 == 10) {
            var32 = var28 + var23;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if (var31 == 11) {
            var32 = var28 + var21;
            var33 = var29 + var23;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if (var31 == 12) {
            var32 = var28 + var22;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if (var31 == 13) {
            var32 = var28 + var22;
            var33 = var29 + var22;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if (var31 == 14) {
            var32 = var28 + var23;
            var33 = var29 + var22;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if (var31 == 15) {
            var32 = var28 + var23;
            var33 = var29 + var23;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else {
            var32 = var28 + var22;
            var33 = var29 + var23;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         }

         this.field2322[var30] = var32;
         this.field2323[var30] = var34;
         this.field2327[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var38 = field2336[var1];
      int var39 = var38.length / 4;
      this.field2330 = new int[var39];
      this.field2331 = new int[var39];
      this.field2329 = new int[var39];
      this.field2332 = new int[var39];
      this.field2325 = new int[var39];
      this.field2328 = new int[var39];
      if (var3 != -1) {
         this.field2324 = new int[var39];
      }

      byte var40 = 0;

      for (int var41 = 0; var41 < var39; var41++) {
         int var44 = var38[var40];
         int var47 = var38[var40 + 1];
         int var48 = var38[var40 + 2];
         int var37 = var38[var40 + 3];
         var40 += 4;
         if (var47 < 4) {
            var47 = var47 - var2 & 3;
         }

         if (var48 < 4) {
            var48 = var48 - var2 & 3;
         }

         if (var37 < 4) {
            var37 = var37 - var2 & 3;
         }

         this.field2330[var41] = var47;
         this.field2331[var41] = var48;
         this.field2329[var41] = var37;
         if (var44 == 0) {
            this.field2332[var41] = var26[var47];
            this.field2325[var41] = var26[var48];
            this.field2328[var41] = var26[var37];
            if (this.field2324 != null) {
               this.field2324[var41] = -1;
            }
         } else {
            this.field2332[var41] = var27[var47];
            this.field2325[var41] = var27[var48];
            this.field2328[var41] = var27[var37];
            if (this.field2324 != null) {
               this.field2324[var41] = var3;
            }
         }
      }

      int var42 = var6;
      int var45 = var7;
      if (var7 < var6) {
         var42 = var7;
      }

      if (var7 > var7) {
         var45 = var7;
      }

      if (var8 < var42) {
         var42 = var8;
      }

      if (var8 > var45) {
         var45 = var8;
      }

      if (var9 < var42) {
         var42 = var9;
      }

      if (var9 > var45) {
         var45 = var9;
      }

      var42 /= 14;
      var45 /= 14;
   }

   public int getBufferOffset() {
      return this.field2342;
   }

   public int[] getTriangleColorB() {
      return this.field2325;
   }

   public int[] getTriangleColorA() {
      return this.field2332;
   }

   public int[] getVertexX() {
      return this.field2322;
   }

   public int getBufferLen() {
      return this.field2344;
   }

   public boolean isFlat() {
      return this.field2319;
   }

   public int getUvBufferOffset() {
      return this.field2343;
   }

   public int[] getVertexZ() {
      return this.field2327;
   }

   public int getRotation() {
      return this.field2326;
   }

   public int[] getFaceZ() {
      return this.field2329;
   }

   public int[] getVertexY() {
      return this.field2323;
   }

   public int[] getTriangleTextureId() {
      return this.field2324;
   }

   public int[] getFaceY() {
      return this.field2331;
   }

   public int[] getTriangleColorC() {
      return this.field2328;
   }

   public void setBufferLen(int var1) {
      this.field2344 = var1;
   }
}
