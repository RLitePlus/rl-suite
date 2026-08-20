import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kr")
public final class SceneTileModel implements net.runelite.api.SceneTileModel {
   @ObfuscatedName("ak")
   static int[] triangleTexturesY = new int[6];
   @ObfuscatedName("ux")
   public int field3424;
   @ObfuscatedName("ae")
   static float[] verticesZ = new float[6];
   @ObfuscatedName("ag")
   static float[] verticesX = new float[6];
   @ObfuscatedName("an")
   static float[] verticesY = new float[6];
   @ObfuscatedName("ac")
   int[] faceY;
   @ObfuscatedName("aj")
   static int[] triangleTexturesX = new int[6];
   @ObfuscatedName("un")
   public int field3423;
   @ObfuscatedName("al")
   int rotation;
   @ObfuscatedName("jy")
   public int field3422;
   @ObfuscatedName("aw")
   static int[] triangleTexturesZ = new int[6];
   @ObfuscatedName("ap")
   int[] vertexX;
   @ObfuscatedName("ay")
   int[] vertexY;
   @ObfuscatedName("au")
   int[] vertexZ;
   @ObfuscatedName("av")
   static final int[][] triangleTextureIndices = new int[][]{
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
   @ObfuscatedName("ad")
   int[] triangleColorB;
   @ObfuscatedName("ai")
   int[] triangleColorC;
   @ObfuscatedName("as")
   int[] faceX;
   @ObfuscatedName("am")
   int overlayRgb;
   @ObfuscatedName("ab")
   int[] faceZ;
   @ObfuscatedName("ax")
   int[] triangleTextureId;
   @ObfuscatedName("ah")
   int shape;
   @ObfuscatedName("at")
   static final int[][] faceIndices = new int[][]{
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
   @ObfuscatedName("az")
   int[] triangleColorA;
   @ObfuscatedName("af")
   int underlayRgb;
   @ObfuscatedName("ar")
   boolean isFlat = true;

   public int[] getVertexY() {
      return this.vertexY;
   }

   public int getModelUnderlay() {
      return this.underlayRgb;
   }

   public int getModelOverlay() {
      return this.overlayRgb;
   }

   public int getBufferLen() {
      return this.field3423;
   }

   public void setBufferLen(int var1) {
      this.field3423 = var1;
   }

   public int getBufferOffset() {
      return this.field3422;
   }

   public int[] getTriangleColorB() {
      return this.triangleColorB;
   }

   public int[] getFaceY() {
      return this.faceY;
   }

   SceneTileModel(
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
         this.isFlat = false;
      }

      this.shape = var1;
      this.rotation = var2;
      this.underlayRgb = var18;
      this.overlayRgb = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = triangleTextureIndices[var1];
      int var25 = var24.length;
      this.vertexX = new int[var25];
      this.vertexY = new int[var25];
      this.vertexZ = new int[var25];
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

         this.vertexX[var30] = var32;
         this.vertexY[var30] = var34;
         this.vertexZ[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var38 = faceIndices[var1];
      int var39 = var38.length / 4;
      this.faceX = new int[var39];
      this.faceY = new int[var39];
      this.faceZ = new int[var39];
      this.triangleColorA = new int[var39];
      this.triangleColorB = new int[var39];
      this.triangleColorC = new int[var39];
      if (var3 != -1) {
         this.triangleTextureId = new int[var39];
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

         this.faceX[var41] = var47;
         this.faceY[var41] = var48;
         this.faceZ[var41] = var37;
         if (var44 == 0) {
            this.triangleColorA[var41] = var26[var47];
            this.triangleColorB[var41] = var26[var48];
            this.triangleColorC[var41] = var26[var37];
            if (this.triangleTextureId != null) {
               this.triangleTextureId[var41] = -1;
            }
         } else {
            this.triangleColorA[var41] = var27[var47];
            this.triangleColorB[var41] = var27[var48];
            this.triangleColorC[var41] = var27[var37];
            if (this.triangleTextureId != null) {
               this.triangleTextureId[var41] = var3;
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

   public int getShape() {
      return this.shape;
   }

   public boolean isFlat() {
      return this.isFlat;
   }

   public void setBufferOffset(int var1) {
      this.field3422 = var1;
   }

   public int getRotation() {
      return this.rotation;
   }

   public int[] getTriangleTextureId() {
      return this.triangleTextureId;
   }

   public int[] getFaceX() {
      return this.faceX;
   }

   public int getUvBufferOffset() {
      return this.field3424;
   }

   public int[] getVertexX() {
      return this.vertexX;
   }

   public void setUvBufferOffset(int var1) {
      this.field3424 = var1;
   }

   public int[] getFaceZ() {
      return this.faceZ;
   }

   public int[] getTriangleColorA() {
      return this.triangleColorA;
   }

   public int[] getTriangleColorC() {
      return this.triangleColorC;
   }

   public int[] getVertexZ() {
      return this.vertexZ;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IIF)F")
   @ObfuscatedName("pd")
   public static float method6610(AudioFilter var0, int var1, int var2, float var3) {
      float var4 = var0.field1601[var1][0][var2] + var3 * (var0.field1601[var1][1][var2] - var0.field1601[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }
}
