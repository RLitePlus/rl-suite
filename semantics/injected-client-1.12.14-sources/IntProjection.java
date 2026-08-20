import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jr")
public class IntProjection extends Projection implements net.runelite.api.IntProjection {
   @ObfuscatedName("ak")
   float pitchCos;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field3176 = 3;
   @ObfuscatedName("fe")
   public float field3165;
   @ObfuscatedName("av")
   int cameraX;
   @ObfuscatedName("an")
   int cameraPitch;
   @ObfuscatedName("ti")
   public float field3170;
   @ObfuscatedName("ae")
   int cameraYaw2;
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("fh")
   public static IntProjection field3178;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field3177 = 45;
   @ObfuscatedName("at")
   int cameraY;
   @ObfuscatedName("mm")
   public float field3168;
   @ObfuscatedName("xo")
   public float field3171;
   @ObfuscatedName("xw")
   public float field3172;
   @ObfuscatedName("yi")
   public float field3173;
   @ObfuscatedName("aw")
   float yawSin;
   @ObfuscatedName("ap")
   float yawCos;
   @ObfuscatedName("gs")
   public float field3167;
   @ObfuscatedName("sw")
   public float field3169;
   @ObfuscatedName("ff")
   public float field3166;
   @ObfuscatedName("ay")
   int field3162;
   @ObfuscatedName("pt")
   public final float[] field3153 = new float[3];
   @ObfuscatedName("au")
   int field3163;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field3174 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field3175 = 3;
   @ObfuscatedName("aj")
   float pitchSin;
   @ObfuscatedName("ag")
   int cameraZ;

   public float getYawCos() {
      return this.yawCos;
   }

   public float[] project(float var1, float var2, float var3) {
      return this.project(var1, var2, var3, this.field3153);
   }

   public float getPitchSin() {
      return this.pitchSin;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ap")
   @Override
   void vmethod242(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6] - this.cameraX * 1728789787;
            float var8 = var2.vertexY[var6] - this.cameraY * 968130945;
            float var9 = var2.vertexZ[var6] - 1313245843 * this.cameraZ;
            float var10 = this.yawSin * var9 + this.yawCos * var7;
            var9 = var9 * this.yawCos - this.yawSin * var7;
            var10 = this.pitchCos * var8 - var9 * this.pitchSin;
            var9 = this.pitchSin * var8 + this.pitchCos * var9;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.triangleTextureId) {
               SceneTileModel.triangleTexturesX[var6] = (int)var10;
               SceneTileModel.triangleTexturesY[var6] = (int)var10;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, 7365520);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2102728444);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;III)V")
   @ObfuscatedName("ag")
   @Override
   void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      try {
         if (1 == Rasterizer3D.clips.currentFaceAlpha) {
            if (var5 != -656009185) {
               throw new IllegalStateException();
            }
         } else {
            int var6 = var2.vertexX.length;

            for (int var7 = 0; var7 < var6; var7++) {
               if (var5 != -656009185) {
                  throw new IllegalStateException();
               }

               float var8 = var2.vertexX[var7] - this.cameraX * 1728789787;
               float var9 = var2.vertexY[var7] - this.cameraY * -1473847235;
               float var10 = var2.vertexZ[var7] - 1313245843 * this.cameraZ;
               float var11 = this.yawSin * var10 + this.yawCos * var8;
               var10 = var10 * this.yawCos - this.yawSin * var8;
               var11 = this.pitchCos * var9 - var10 * this.pitchSin;
               var10 = this.pitchSin * var9 + this.pitchCos * var10;
               if (var10 < 50.0F) {
                  return;
               }

               if (null != var2.triangleTextureId) {
                  if (var5 != -656009185) {
                     throw new IllegalStateException();
                  }

                  SceneTileModel.triangleTexturesX[var7] = (int)var11;
                  SceneTileModel.triangleTexturesY[var7] = (int)var11;
                  SceneTileModel.triangleTexturesZ[var7] = (int)var10;
               }

               SceneTileModel.verticesX[var7] = Rasterizer3D.getClipMidX() + var11 * Rasterizer3D.get3dZoom() / var10;
               SceneTileModel.verticesY[var7] = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var10;
               SceneTileModel.verticesZ[var7] = WorldMapSectionType.method7174(var10, -1543958663);
            }

            Projection.method6230(this, var1, var2, var3, var4, 1967260157);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "jr.ag(" + ')');
      }
   }

   public int getCameraZ() {
      return this.cameraZ * 1313245843;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIII)V")
   @ObfuscatedName("at")
   @Override
   void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6) {
      try {
         if (Rasterizer3D.clips.currentFaceAlpha != 1) {
            float var7;
            float var8 = var7 = (var4 << 7) - this.cameraX * 1728789787;
            float var9;
            float var10 = var9 = (var5 << 7) - 1313245843 * this.cameraZ;
            float var11;
            float var12 = var11 = 128.0F + var8;
            float var13;
            float var14 = var13 = 128.0F + var10;
            float var15 = var1.tileHeights[var3][var4][var5] - -1473847235 * this.cameraY;
            float var16 = var1.tileHeights[var3][var4 + 1][var5] - -1473847235 * this.cameraY;
            float var17 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY * -1473847235;
            float var18 = var1.tileHeights[var3][var4][1 + var5] - -1473847235 * this.cameraY;
            float var19 = var8 * this.yawCos + this.yawSin * var10;
            var10 = this.yawCos * var10 - this.yawSin * var8;
            var19 = this.pitchCos * var15 - var10 * this.pitchSin;
            var10 = var10 * this.pitchCos + this.pitchSin * var15;
            if (var10 < 50.0F) {
               if (var6 != -436402298) {
                  throw new IllegalStateException();
               }
            } else {
               var19 = this.yawSin * var9 + var12 * this.yawCos;
               var9 = var9 * this.yawCos - var12 * this.yawSin;
               var19 = this.pitchCos * var16 - var9 * this.pitchSin;
               var9 = var16 * this.pitchSin + this.pitchCos * var9;
               if (!(var9 < 50.0F)) {
                  var19 = var14 * this.yawSin + var11 * this.yawCos;
                  var14 = this.yawCos * var14 - this.yawSin * var11;
                  var19 = var17 * this.pitchCos - this.pitchSin * var14;
                  var14 = this.pitchCos * var14 + var17 * this.pitchSin;
                  if (!(var14 < 50.0F)) {
                     var19 = this.yawSin * var13 + var7 * this.yawCos;
                     var13 = this.yawCos * var13 - var7 * this.yawSin;
                     var19 = var18 * this.pitchCos - var13 * this.pitchSin;
                     var13 = this.pitchSin * var18 + this.pitchCos * var13;
                     if (var13 < 50.0F) {
                        if (var6 != -436402298) {
                           throw new IllegalStateException();
                        }
                     } else {
                        Language.method8873(
                           this, var1, var2, var4, var5, var19, var19, var19, var19, var19, var19, var19, var19, var10, var9, var14, var13, -173961864
                        );
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "jr.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("an")
   @Override
   void vmethod235(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod234(
         var2,
         -1667910886 * this.cameraPitch,
         this.cameraYaw2 * -881129575,
         var3,
         var4,
         var5,
         this.cameraX * 1728789787,
         this.cameraY * -1473847235,
         this.cameraZ * -1096933414,
         var6,
         507003299 * this.field3162,
         this.field3163 * -1454111152,
         false
      );
   }

   IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.cameraX = var1 * 355063059;
      this.cameraY = var2 * 416593685;
      this.cameraZ = var3 * 793256859;
      this.cameraPitch = var4 * -2055786427;
      this.cameraYaw2 = -241869655 * var5;
      this.pitchSin = Rasterizer3D.field3038[var4];
      this.pitchCos = Rasterizer3D.field3037[var4];
      this.yawSin = Rasterizer3D.field3038[var5];
      this.yawCos = Rasterizer3D.field3037[var5];
      this.field3162 = -540349133 * var6;
      this.field3163 = var7 * 66484881;
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod236(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod234(
         var2,
         1734369933 * this.cameraPitch,
         this.cameraYaw2 * -881129575,
         var3,
         var4,
         var5,
         this.cameraX * 1728789787,
         this.cameraY * -1473847235,
         this.cameraZ * 1313245843,
         var6,
         -996485637 * this.field3162,
         this.field3163 * -917731727,
         false
      );
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod239(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.cameraX * 1728789787;
         float var8;
         float var9 = var8 = (var5 << 7) - 1313245843 * this.cameraZ;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.tileHeights[var3][var4][var5] - -1473847235 * this.cameraY;
         float var15 = var1.tileHeights[var3][var4 + 1][var5] - -1473847235 * this.cameraY;
         float var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY * -1473847235;
         float var17 = var1.tileHeights[var3][var4][1 + var5] - -1473847235 * this.cameraY;
         float var18 = var7 * this.yawCos + this.yawSin * var9;
         var9 = this.yawCos * var9 - this.yawSin * var7;
         var18 = this.pitchCos * var14 - var9 * this.pitchSin;
         var9 = var9 * this.pitchCos + this.pitchSin * var14;
         if (!(var9 < 50.0F)) {
            var18 = this.yawSin * var8 + var11 * this.yawCos;
            var8 = var8 * this.yawCos - var11 * this.yawSin;
            var18 = this.pitchCos * var15 - var8 * this.pitchSin;
            var8 = var15 * this.pitchSin + this.pitchCos * var8;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.yawSin + var10 * this.yawCos;
               var13 = this.yawCos * var13 - this.yawSin * var10;
               var18 = var16 * this.pitchCos - this.pitchSin * var13;
               var13 = this.pitchCos * var13 + var16 * this.pitchSin;
               if (!(var13 < 50.0F)) {
                  var18 = this.yawSin * var12 + var6 * this.yawCos;
                  var12 = this.yawCos * var12 - var6 * this.yawSin;
                  var18 = var17 * this.pitchCos - var12 * this.pitchSin;
                  var12 = this.pitchSin * var17 + this.pitchCos * var12;
                  if (!(var12 < 50.0F)) {
                     Language.method8873(
                        this, var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, -173961864
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod238(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.cameraX * 1728789787;
         float var8;
         float var9 = var8 = (var5 << 7) - 1313245843 * this.cameraZ;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.tileHeights[var3][var4][var5] - 1045788064 * this.cameraY;
         float var15 = var1.tileHeights[var3][var4 + 1][var5] - 1588822027 * this.cameraY;
         float var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY * 1413549915;
         float var17 = var1.tileHeights[var3][var4][1 + var5] - 2147348278 * this.cameraY;
         float var18 = var7 * this.yawCos + this.yawSin * var9;
         var9 = this.yawCos * var9 - this.yawSin * var7;
         var18 = this.pitchCos * var14 - var9 * this.pitchSin;
         var9 = var9 * this.pitchCos + this.pitchSin * var14;
         if (!(var9 < 50.0F)) {
            var18 = this.yawSin * var8 + var11 * this.yawCos;
            var8 = var8 * this.yawCos - var11 * this.yawSin;
            var18 = this.pitchCos * var15 - var8 * this.pitchSin;
            var8 = var15 * this.pitchSin + this.pitchCos * var8;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.yawSin + var10 * this.yawCos;
               var13 = this.yawCos * var13 - this.yawSin * var10;
               var18 = var16 * this.pitchCos - this.pitchSin * var13;
               var13 = this.pitchCos * var13 + var16 * this.pitchSin;
               if (!(var13 < 50.0F)) {
                  var18 = this.yawSin * var12 + var6 * this.yawCos;
                  var12 = this.yawCos * var12 - var6 * this.yawSin;
                  var18 = var17 * this.pitchCos - var12 * this.pitchSin;
                  var12 = this.pitchSin * var17 + this.pitchCos * var12;
                  if (!(var12 < 50.0F)) {
                     Language.method8873(
                        this, var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, -173961864
                     );
                  }
               }
            }
         }
      }
   }

   public int getCameraY() {
      return this.cameraY * -1473847235;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("aw")
   @Override
   void vmethod244(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6] - this.cameraX * 1728789787;
            float var8 = var2.vertexY[var6] - this.cameraY * -1473847235;
            float var9 = var2.vertexZ[var6] - 1313245843 * this.cameraZ;
            float var10 = this.yawSin * var9 + this.yawCos * var7;
            var9 = var9 * this.yawCos - this.yawSin * var7;
            var10 = this.pitchCos * var8 - var9 * this.pitchSin;
            var9 = this.pitchSin * var8 + this.pitchCos * var9;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.triangleTextureId) {
               SceneTileModel.triangleTexturesX[var6] = (int)var10;
               SceneTileModel.triangleTexturesY[var6] = (int)var10;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, -1970645913);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2009705422);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("az")
   @Override
   void vmethod245(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6] - this.cameraX * 1728789787;
            float var8 = var2.vertexY[var6] - this.cameraY * 1134572804;
            float var9 = var2.vertexZ[var6] - -1336652716 * this.cameraZ;
            float var10 = this.yawSin * var9 + this.yawCos * var7;
            var9 = var9 * this.yawCos - this.yawSin * var7;
            var10 = this.pitchCos * var8 - var9 * this.pitchSin;
            var9 = this.pitchSin * var8 + this.pitchCos * var9;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.triangleTextureId) {
               SceneTileModel.triangleTexturesX[var6] = (int)var10;
               SceneTileModel.triangleTexturesY[var6] = (int)var10;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, 174254196);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2094772746);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod240(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6] - this.cameraX * 1990643771;
            float var8 = var2.vertexY[var6] - this.cameraY * -1473847235;
            float var9 = var2.vertexZ[var6] - -1147658074 * this.cameraZ;
            float var10 = this.yawSin * var9 + this.yawCos * var7;
            var9 = var9 * this.yawCos - this.yawSin * var7;
            var10 = this.pitchCos * var8 - var9 * this.pitchSin;
            var9 = this.pitchSin * var8 + this.pitchCos * var9;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.triangleTextureId) {
               SceneTileModel.triangleTexturesX[var6] = (int)var10;
               SceneTileModel.triangleTexturesY[var6] = (int)var10;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, 57804031);
         }

         Projection.method6230(this, var1, var2, var3, var4, 1960501371);
      }
   }

   public float[] project(float var1, float var2, float var3, float[] var4) {
      var1 -= this.field3169;
      var2 -= this.field3166;
      var3 -= this.field3171;
      float var5 = var1 * this.field3173 + var3 * this.field3172;
      float var6 = var3 * this.field3173 - var1 * this.field3172;
      float var7 = var2 * this.field3165 - var6 * this.field3168;
      float var8 = var6 * this.field3165 + var2 * this.field3168;
      var4[0] = var5;
      var4[1] = var7;
      var4[2] = var8;
      return var4;
   }

   public int getCameraX() {
      return this.cameraX * 1728789787;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("au")
   @Override
   void vmethod241(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6] - this.cameraX * -1359323662;
            float var8 = var2.vertexY[var6] - this.cameraY * 1235480372;
            float var9 = var2.vertexZ[var6] - -844597006 * this.cameraZ;
            float var10 = this.yawSin * var9 + this.yawCos * var7;
            var9 = var9 * this.yawCos - this.yawSin * var7;
            var10 = this.pitchCos * var8 - var9 * this.pitchSin;
            var9 = this.pitchSin * var8 + this.pitchCos * var9;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.triangleTextureId) {
               SceneTileModel.triangleTexturesX[var6] = (int)var10;
               SceneTileModel.triangleTexturesY[var6] = (int)var10;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, -1574209991);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2131588307);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("av")
   @Override
   void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      if ((client.field997 & 17) == 1) {
         client.field1025.draw(this, null, var1, var2, var3, var4, var5, var6);
      } else {
         var1.method6218(
            var2,
            this.cameraPitch * 1734369933,
            this.cameraYaw2 * -881129575,
            var3,
            var4,
            var5,
            this.cameraX * 1728789787,
            this.cameraY * -1473847235,
            this.cameraZ * 1313245843,
            var6,
            this.field3162 * -996485637,
            this.field3163 * -917731727,
            false
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("av")
   static void method6177(SpritePixels var0, int var1, int var2, int var3, int var4) {
      try {
         DemotingHashTable var5 = WorldMapRegion.WorldMapRegion_cachedSprites;
         long var7 = var3 << 16 | var1 << 8 | var2;
         var5.put(var0, var7, 4 * var0.pixels.length);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "jr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("oa")
   static final void Clan_joinChat(String var0, int var1) {
      try {
         if (var0.equals("")) {
            if (var1 == -58424928) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3896, client.packetWriter.isaacCipher, -1300989113);
            var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 599797571), (short)-22814);
            var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
            PacketWriter.method3330(client.packetWriter, var2, -1771370198);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jr.oa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("qh")
   @Override
   public void vmethod247(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1) {
         int var6 = var4 + var1.field3014;
         int var7 = var5 + var1.field3014;
         float var8;
         float var9 = var8 = (var4 << 7) - this.cameraX * 1728789787;
         float var10;
         float var11 = var10 = (var5 << 7) - this.cameraZ * 1313245843;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14;
         float var15 = var14 = var11 + 128.0F;
         float var16 = var1.tileHeights[var3][var6][var7] - this.cameraY * -1473847235;
         float var17 = var1.tileHeights[var3][var6 + 1][var7] - this.cameraY * -1473847235;
         float var18 = var1.tileHeights[var3][var6 + 1][var7 + 1] - this.cameraY * -1473847235;
         float var19 = var1.tileHeights[var3][var6][var7 + 1] - this.cameraY * -1473847235;
         float var20 = var9 * this.yawCos + var11 * this.yawSin;
         var11 = var11 * this.yawCos - var9 * this.yawSin;
         var20 = var16 * this.pitchCos - var11 * this.pitchSin;
         var11 = var11 * this.pitchCos + var16 * this.pitchSin;
         if (var11 >= 50.0F) {
            var20 = var10 * this.yawSin + var13 * this.yawCos;
            var10 = var10 * this.yawCos - var13 * this.yawSin;
            var20 = var17 * this.pitchCos - var10 * this.pitchSin;
            var10 = var10 * this.pitchCos + var17 * this.pitchSin;
            if (var10 >= 50.0F) {
               var20 = var12 * this.yawCos + var15 * this.yawSin;
               var15 = var15 * this.yawCos - var12 * this.yawSin;
               var20 = var18 * this.pitchCos - var15 * this.pitchSin;
               var15 = var18 * this.pitchSin + var15 * this.pitchCos;
               if (var15 >= 50.0F) {
                  var20 = var8 * this.yawCos + var14 * this.yawSin;
                  var14 = var14 * this.yawCos - var8 * this.yawSin;
                  var20 = var19 * this.pitchCos - var14 * this.pitchSin;
                  var14 = var19 * this.pitchSin + var14 * this.pitchCos;
                  if (var14 >= 50.0F) {
                     if (client.field1025 != null) {
                        client.field1025.drawScenePaint(var1, var2, var3, var4, var5);
                     }

                     this.method6235(var1, var2, var4, var5, var20, var20, var20, var20, var20, var20, var20, var20, var11, var10, var15, var14);
                  }
               }
            }
         }
      }
   }

   public float getYawSin() {
      return this.yawSin;
   }

   public float getPitchCos() {
      return this.pitchCos;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ei")
   @Override
   public void vmethod248(Scene var1, SceneTileModel var2, int var3, int var4) {
      this.drawTileOverlay(var1, var2, var3, var4, -656009185);
   }
}
