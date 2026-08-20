import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jl")
public class FloatProjection extends Projection implements net.runelite.api.FloatProjection {
   @ObfuscatedName("tc")
   public static final float[] field3081 = new float[16];
   @ObfuscatedName("ag")
   long field3079;
   @ObfuscatedName("at")
   float[] projection = new float[3];
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final long field3084 = -1L;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("av")
   TransformationMatrix transformationMatrix;
   @ObfuscatedName("uv")
   static int field3083;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field3082 = 4;

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod240(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6];
            float var8 = var2.vertexY[var6];
            float var9 = var2.vertexZ[var6];
            this.transformationMatrix.transformPoint(var7, var8, var9, this.projection, 1045119330);
            var7 = this.projection[0];
            var8 = this.projection[1];
            var9 = this.projection[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.triangleTextureId != null) {
               SceneTileModel.triangleTexturesX[var6] = (int)var7;
               SceneTileModel.triangleTexturesY[var6] = (int)var8;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, -1889597441);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2134308095);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ad")
   void method6009(long var1) {
      try {
         this.field3079 = var1 * 1113747779295338803L;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jl.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("av")
   @Override
   void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      if (client.field997 == 0) {
         int var8 = ViewportMouse.ViewportMouse_entityCount * -1556503267;
         var6 = this.method6014(var6);
         var1.method6219(var2, this.transformationMatrix, var3, var4, var5, var6);
         if (var8 != ViewportMouse.ViewportMouse_entityCount * -1556503267) {
            this.method6016();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)J")
   @ObfuscatedName("dr")
   public long method6014(long var1) {
      return this.field3079 * -5649451870187191813L == 0L || method6015(var1) && !method6015(this.field3079 * -5649451870187191813L)
         ? var1
         : this.field3079 * -5649451870187191813L & -524289L;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIII)V")
   @ObfuscatedName("at")
   @Override
   void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 == Rasterizer3D.clips.currentFaceAlpha) {
            if (var6 != -436402298) {
               throw new IllegalStateException();
            }
         } else {
            float var7;
            float var8 = var7 = var4 << 7;
            float var9;
            float var10 = var9 = var5 << 7;
            float var11;
            float var12 = var11 = var8 + 128.0F;
            float var13;
            float var14 = var13 = var10 + 128.0F;
            float var15 = var1.tileHeights[var3][var4][var5];
            float var16 = var1.tileHeights[var3][1 + var4][var5];
            float var17 = var1.tileHeights[var3][var4 + 1][1 + var5];
            float var18 = var1.tileHeights[var3][var4][1 + var5];
            this.transformationMatrix.transformPoint(var8, var15, var10, this.projection, 1045119330);
            var8 = this.projection[0];
            var15 = this.projection[1];
            var10 = this.projection[2];
            if (var10 < 50.0F) {
               if (var6 != -436402298) {
                  throw new IllegalStateException();
               }
            } else {
               this.transformationMatrix.transformPoint(var12, var16, var9, this.projection, 1045119330);
               var12 = this.projection[0];
               var16 = this.projection[1];
               var9 = this.projection[2];
               if (!(var9 < 50.0F)) {
                  this.transformationMatrix.transformPoint(var11, var17, var14, this.projection, 1045119330);
                  var11 = this.projection[0];
                  var17 = this.projection[1];
                  var14 = this.projection[2];
                  if (var14 < 50.0F) {
                     if (var6 != -436402298) {
                        throw new IllegalStateException();
                     }
                  } else {
                     this.transformationMatrix.transformPoint(var7, var18, var13, this.projection, 1045119330);
                     var7 = this.projection[0];
                     var18 = this.projection[1];
                     var13 = this.projection[2];
                     if (var13 < 50.0F) {
                        if (var6 != -436402298) {
                           throw new IllegalStateException();
                        }
                     } else {
                        Language.method8873(
                           this, var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13, -173961864
                        );
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "jl.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("ek")
   public static boolean method6015(long var0) {
      return var0 != 0L && (var0 >>> 19 & 1L) == 0L;
   }

   public float[] project(float var1, float var2, float var3) {
      return this.project(var1, var2, var3, this.projection);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ac")
   void method6010(long var1) {
      this.field3079 = var1 * 1113747779295338803L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xc")
   public void method6016() {
      if (this.field3079 * -5649451870187191813L != 0L) {
         this.field3079 = (this.field3079 * -5649451870187191813L & 524288L | 327680L) * 1113747779295338803L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("an")
   @Override
   void vmethod235(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classGP.method4258(1682609902);
      if (-5649451870187191813L * this.field3079 != 0L) {
         boolean var9 = WorldMapLabelSize.method7220(var6);
         boolean var10 = !var9 || WorldMapLabelSize.method7220(this.field3079 * -5649451870187191813L);
         if (var10) {
            long var13 = this.field3079 * -5649451870187191813L;
            long var11 = var13 & -524289L;
            var6 = var11;
         }
      }

      var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (-5649451870187191813L * this.field3079 != 0L && var8 != classGP.method4258(2060490570)) {
         this.field3079 = class236.calculateTag(0, 0, 0, 5, !WorldMapLabelSize.method7220(this.field3079 * -5649451870187191813L), 0, 0, -1329739818)
            * 1113747779295338803L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod236(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classGP.method4258(1516290871);
      if (-5649451870187191813L * this.field3079 != 0L) {
         boolean var9 = WorldMapLabelSize.method7220(var6);
         boolean var10 = !var9 || WorldMapLabelSize.method7220(this.field3079 * -5649451870187191813L);
         if (var10) {
            long var13 = this.field3079 * -5649451870187191813L;
            long var11 = var13 & -524289L;
            var6 = var11;
         }
      }

      var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (-5649451870187191813L * this.field3079 != 0L && var8 != classGP.method4258(508398905)) {
         this.field3079 = class236.calculateTag(0, 0, 0, 5, !WorldMapLabelSize.method7220(this.field3079 * -5649451870187191813L), 0, 0, -1329739818)
            * 1113747779295338803L;
      }
   }

   FloatProjection(TransformationMatrix var1) {
      this.field3079 = 0L;
      this.transformationMatrix = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod238(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.tileHeights[var3][var4][var5];
         float var15 = var1.tileHeights[var3][1 + var4][var5];
         float var16 = var1.tileHeights[var3][var4 + 1][1 + var5];
         float var17 = var1.tileHeights[var3][var4][1 + var5];
         this.transformationMatrix.transformPoint(var7, var14, var9, this.projection, 1045119330);
         var7 = this.projection[0];
         var14 = this.projection[1];
         var9 = this.projection[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.transformPoint(var11, var15, var8, this.projection, 1045119330);
            var11 = this.projection[0];
            var15 = this.projection[1];
            var8 = this.projection[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.transformPoint(var10, var16, var13, this.projection, 1045119330);
               var10 = this.projection[0];
               var16 = this.projection[1];
               var13 = this.projection[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.transformPoint(var6, var17, var12, this.projection, 1045119330);
                  var6 = this.projection[0];
                  var17 = this.projection[1];
                  var12 = this.projection[2];
                  if (!(var12 < 50.0F)) {
                     Language.method8873(
                        this, var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, -173961864
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("au")
   @Override
   void vmethod241(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6];
            float var8 = var2.vertexY[var6];
            float var9 = var2.vertexZ[var6];
            this.transformationMatrix.transformPoint(var7, var8, var9, this.projection, 1045119330);
            var7 = this.projection[0];
            var8 = this.projection[1];
            var9 = this.projection[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.triangleTextureId != null) {
               SceneTileModel.triangleTexturesX[var6] = (int)var7;
               SceneTileModel.triangleTexturesY[var6] = (int)var8;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, 327225770);
         }

         Projection.method6230(this, var1, var2, var3, var4, 1998003158);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("as")
   void method6011(long var1) {
      this.field3079 = var1 * 1113747779295338803L;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod239(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.tileHeights[var3][var4][var5];
         float var15 = var1.tileHeights[var3][1 + var4][var5];
         float var16 = var1.tileHeights[var3][var4 + 1][1 + var5];
         float var17 = var1.tileHeights[var3][var4][1 + var5];
         this.transformationMatrix.transformPoint(var7, var14, var9, this.projection, 1045119330);
         var7 = this.projection[0];
         var14 = this.projection[1];
         var9 = this.projection[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.transformPoint(var11, var15, var8, this.projection, 1045119330);
            var11 = this.projection[0];
            var15 = this.projection[1];
            var8 = this.projection[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.transformPoint(var10, var16, var13, this.projection, 1045119330);
               var10 = this.projection[0];
               var16 = this.projection[1];
               var13 = this.projection[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.transformPoint(var6, var17, var12, this.projection, 1045119330);
                  var6 = this.projection[0];
                  var17 = this.projection[1];
                  var12 = this.projection[2];
                  if (!(var12 < 50.0F)) {
                     Language.method8873(
                        this, var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, -173961864
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ap")
   @Override
   void vmethod242(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6];
            float var8 = var2.vertexY[var6];
            float var9 = var2.vertexZ[var6];
            this.transformationMatrix.transformPoint(var7, var8, var9, this.projection, 1045119330);
            var7 = this.projection[0];
            var8 = this.projection[1];
            var9 = this.projection[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.triangleTextureId != null) {
               SceneTileModel.triangleTexturesX[var6] = (int)var7;
               SceneTileModel.triangleTexturesY[var6] = (int)var8;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, 1907015942);
         }

         Projection.method6230(this, var1, var2, var3, var4, 2113495059);
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
                  return;
               }

               float var8 = var2.vertexX[var7];
               float var9 = var2.vertexY[var7];
               float var10 = var2.vertexZ[var7];
               this.transformationMatrix.transformPoint(var8, var9, var10, this.projection, 1045119330);
               var8 = this.projection[0];
               var9 = this.projection[1];
               var10 = this.projection[2];
               if (var10 < 50.0F) {
                  if (var5 != -656009185) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               if (var2.triangleTextureId != null) {
                  if (var5 != -656009185) {
                     throw new IllegalStateException();
                  }

                  SceneTileModel.triangleTexturesX[var7] = (int)var8;
                  SceneTileModel.triangleTexturesY[var7] = (int)var9;
                  SceneTileModel.triangleTexturesZ[var7] = (int)var10;
               }

               SceneTileModel.verticesX[var7] = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var10;
               SceneTileModel.verticesY[var7] = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var10;
               SceneTileModel.verticesZ[var7] = WorldMapSectionType.method7174(var10, 1561224689);
            }

            Projection.method6230(this, var1, var2, var3, var4, 1889662150);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "jl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("aw")
   @Override
   void vmethod244(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6];
            float var8 = var2.vertexY[var6];
            float var9 = var2.vertexZ[var6];
            this.transformationMatrix.transformPoint(var7, var8, var9, this.projection, 1045119330);
            var7 = this.projection[0];
            var8 = this.projection[1];
            var9 = this.projection[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.triangleTextureId != null) {
               SceneTileModel.triangleTexturesX[var6] = (int)var7;
               SceneTileModel.triangleTexturesY[var6] = (int)var8;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, -2086376166);
         }

         Projection.method6230(this, var1, var2, var3, var4, 1977738982);
      }
   }

   public float[] project(float var1, float var2, float var3, float[] var4) {
      this.transformationMatrix.method10025(var1, var2, var3, var4);
      return var4;
   }

   public float[] getProjection() {
      this.transformationMatrix.method10011(field3081);
      return field3081;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("az")
   @Override
   void vmethod245(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha) {
         int var5 = var2.vertexX.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.vertexX[var6];
            float var8 = var2.vertexY[var6];
            float var9 = var2.vertexZ[var6];
            this.transformationMatrix.transformPoint(var7, var8, var9, this.projection, 1045119330);
            var7 = this.projection[0];
            var8 = this.projection[1];
            var9 = this.projection[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.triangleTextureId != null) {
               SceneTileModel.triangleTexturesX[var6] = (int)var7;
               SceneTileModel.triangleTexturesY[var6] = (int)var8;
               SceneTileModel.triangleTexturesZ[var6] = (int)var9;
            }

            SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
            SceneTileModel.verticesZ[var6] = WorldMapSectionType.method7174(var9, -269006983);
         }

         Projection.method6230(this, var1, var2, var3, var4, 1924339942);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lxj;B)V")
   @ObfuscatedName("lo")
   static final void method6013(WorldView var0, PacketBuffer var1, byte var2) {
      try {
         for (int var3 = 0; var3 < client.npcCount * 6231661; var3++) {
            if (var2 != 14) {
               return;
            }

            int var4 = client.npcIndices[var3];
            NPC var5 = (NPC)var0.players.get(var4);
            int var6 = var1.readUnsignedByte(1519468481);
            if (0 != (var6 & 16)) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var7 = var1.readUnsignedByte(520575011);
               var6 += var7 << 8;
            }

            if ((var6 & 2048) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var16 = var1.readUnsignedByte(-1651120348);
               var6 += var16 << 16;
            }

            if ((var6 & 512) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               var5.field1165 = Buffer.method12015(var1, 644272079) * 2006173817;
            }

            if (0 != (var6 & 65536)) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var17 = var1.readUnsignedByteNeg(-1697289704);
               if (var17 == 0) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var5.method3533(-74638402);
               } else {
                  int[] var8 = new int[8];
                  short[] var9 = new short[8];

                  for (int var10 = 0; var10 < 8; var10++) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     if (0 != (var17 & 1 << var10)) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var8[var10] = var1.readNullableLargeSmart(-909514324);
                        var9[var10] = (short)var1.readShortSmartSub(1212883843);
                     } else {
                        var8[var10] = -1;
                        var9[var10] = -1;
                     }
                  }

                  var5.method3530(var8, var9, (byte)76);
               }
            }

            if ((var6 & 131072) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               var5.field1123 = var1.readUnsignedShortAdd(-1156088784) * 967374543;
               boolean var10001;
               if (var1.readUnsignedByte(1437897147) == 1) {
                  if (var2 != 14) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5.field1185 = var10001;
            }

            label656:
            if ((var6 & 2) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var18 = var1.readUnsignedShortLE((byte)-68);
               if (65535 == var18) {
                  if (var2 != 14) {
                     return;
                  }

                  var18 = -1;
               }

               int var26 = var1.readUnsignedByteNeg(-966930390);
               SequenceDefinition var33 = AnimationSequence.method10318(var5.animationSequence, 65329504);
               if (var18 == var5.method2753(-311590766)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  if (var18 != -1) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var42 = 564693013 * var33.restartMode;
                     if (var42 == 1) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var5.animationSequence.method10332((byte)113);
                        var5.field1153 = var26 * -296795651;
                     }

                     if (var42 == 2) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var5.animationSequence.method10333((byte)124);
                     }
                     break label656;
                  }
               }

               if (var18 != -1) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10315(var5.animationSequence, -831296794)) {
                     if (ClientPacket.SequenceDefinition_get(var18, 117576427).field2726 * -1808717695 < -1808717695 * var33.field2726) {
                        break label656;
                     }

                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }
                  }
               }

               AnimationSequence.method10313(var5.animationSequence, var18, -2027673262);
               var5.animationSequence.method10332((byte)36);
               var5.field1153 = -296795651 * var26;
               var5.field1164 = var5.pathLength * -1060830063;
            }

            if (0 != (var6 & 32768)) {
               if (var2 != 14) {
                  return;
               }

               NPC.method3497(var5, var1.readUnsignedByteSub((byte)30), (byte)70);
            }

            if (0 != (var6 & 1)) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               var1.readUnsignedShortAdd(-1156088784);
               var1.readUnsignedIntIME(-1303899069);
            }

            if ((var6 & 524288) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var19 = Buffer.method12203(var1, -2053988317);
               int var75;
               if (0 != (var19 & 1)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortLE((byte)36);
               } else {
                  var75 = 917022203 * var5.definition.turnLeftSequence;
               }

               var5.turnLeftSequence = var75 * 10470407;
               if (0 != (var19 & 2)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = Buffer.method12008(var1, (byte)5);
               } else {
                  var75 = 1219249533 * var5.definition.turnRightSequence;
               }

               var5.turnRightSequence = var75 * 1660361997;
               if ((var19 & 4) != 0) {
                  if (var2 != 14) {
                     return;
                  }

                  var75 = var1.readUnsignedShortLE((byte)-35);
               } else {
                  var75 = var5.definition.walkSequence * -404134647;
               }

               var5.walkSequence = var75 * 308070339;
               if ((var19 & 8) != 0) {
                  if (var2 != 14) {
                     return;
                  }

                  var75 = var1.readUnsignedShortAddLE(1901235802);
               } else {
                  var75 = 585856205 * var5.definition.walkBackSequence;
               }

               var5.walkBackSequence = var75 * 207093345;
               if (0 != (var19 & 16)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortLE((byte)-15);
               } else {
                  var75 = 2027561961 * var5.definition.walkLeftSequence;
               }

               var5.walkLeftSequence = var75 * 1071631209;
               if ((var19 & 32) != 0) {
                  if (var2 != 14) {
                     return;
                  }

                  var75 = Buffer.method12008(var1, (byte)5);
               } else {
                  var75 = 1039294955 * var5.definition.walkRightSequence;
               }

               var5.walkRightSequence = var75 * 1809054117;
               if ((var19 & 64) != 0) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = Buffer.method12008(var1, (byte)5);
               } else {
                  var75 = var5.definition.field2348 * -988204857;
               }

               var5.runSequence = var75 * -1512855059;
               if (0 != (var19 & 128)) {
                  if (var2 != 14) {
                     return;
                  }

                  var75 = var1.readUnsignedShortLE((byte)-4);
               } else {
                  var75 = var5.definition.field2325 * -310965519;
               }

               var5.field1160 = var75 * -782885955;
               if ((var19 & 256) != 0) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortAddLE(-361851118);
               } else {
                  var75 = var5.definition.field2326 * -786508797;
               }

               var5.field1154 = var75 * -2142822883;
               if (0 != (var19 & 512)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortAdd(-1156088784);
               } else {
                  var75 = -175856555 * var5.definition.field2340;
               }

               var5.field1138 = var75 * -1365876615;
               if (0 != (var19 & 1024)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortAddLE(-1100366934);
               } else {
                  var75 = var5.definition.field2328 * -169103045;
               }

               var5.field1139 = var75 * 914622293;
               if (0 != (var19 & 2048)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = Buffer.method12008(var1, (byte)5);
               } else {
                  var75 = -834214881 * var5.definition.field2339;
               }

               var5.field1140 = var75 * 1955892983;
               if (0 != (var19 & 4096)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = var1.readUnsignedShortLE((byte)13);
               } else {
                  var75 = var5.definition.field2330 * -232059351;
               }

               var5.field1141 = var75 * -191908213;
               if (0 != (var19 & 8192)) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var75 = Buffer.method12008(var1, (byte)5);
               } else {
                  var75 = -249279285 * var5.definition.field2344;
               }

               var5.field1142 = var75 * 1035597893;
               if (0 != (var19 & 16384)) {
                  if (var2 != 14) {
                     return;
                  }

                  var75 = var1.readUnsignedShortLE((byte)-119);
               } else {
                  var75 = var5.definition.idleSequence * -625790299;
               }

               var5.idleSequence = var75 * -2146330229;
            }

            if (0 != (var6 & 1024)) {
               int var20 = var1.readUnsignedByteNeg(608149081);
               if ((var20 & 1) == 1) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var5.method3543(1584202160);
               } else {
                  int[] var27 = null;
                  if (2 == (var20 & 2)) {
                     int var34 = var1.readUnsignedByteAdd(544897069);
                     var27 = new int[var34];

                     for (int var43 = 0; var43 < var34; var43++) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        int var11 = var1.readUnsignedShortLE((byte)36);
                        int var10000;
                        if (65535 == var11) {
                           if (var2 != 14) {
                              throw new IllegalStateException();
                           }

                           var10000 = -1;
                        } else {
                           var10000 = var11;
                        }

                        var11 = var10000;
                        var27[var43] = var11;
                     }
                  }

                  short[] var35 = null;
                  if ((var20 & 4) == 4) {
                     int var44 = 0;
                     if (var5.definition.recolorTo != null) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var44 = var5.definition.recolorTo.length;
                     }

                     var35 = new short[var44];

                     for (int var54 = 0; var54 < var44; var54++) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var35[var54] = (short)var1.readUnsignedShortAddLE(899516517);
                     }
                  }

                  short[] var45 = null;
                  if (8 == (var20 & 8)) {
                     int var55 = 0;
                     if (var5.definition.retextureTo != null) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var55 = var5.definition.retextureTo.length;
                     }

                     var45 = new short[var55];

                     for (int var12 = 0; var12 < var55; var12++) {
                        var45[var12] = (short)Buffer.method12008(var1, (byte)5);
                     }
                  }

                  boolean var56 = false;
                  if ((var20 & 16) != 0) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     boolean var71;
                     if (var1.readUnsignedByteAdd(-454480495) == 1) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var71 = true;
                     } else {
                        var71 = false;
                     }

                     var56 = var71;
                  }

                  long var65 = (NPC.field1496 += -1404432765) * -669175765 - 1;
                  var5.method3539(new NpcOverrides(var65, var27, var35, var45, var56), -838502520);
               }
            }

            if ((var6 & 8192) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var21 = var1.readUnsignedByteAdd(-249087147);
               if ((var21 & 1) == 1) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  var5.method3548((byte)-27);
               } else {
                  int[] var28 = null;
                  if ((var21 & 2) == 2) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var36 = var1.readUnsignedByteAdd(318979790);
                     var28 = new int[var36];

                     for (int var46 = 0; var46 < var36; var46++) {
                        if (var2 != 14) {
                           return;
                        }

                        int var57 = var1.readUnsignedShortAdd(-1156088784);
                        int var72;
                        if (var57 == 65535) {
                           if (var2 != 14) {
                              throw new IllegalStateException();
                           }

                           var72 = -1;
                        } else {
                           var72 = var57;
                        }

                        var57 = var72;
                        var28[var46] = var57;
                     }
                  }

                  short[] var37 = null;
                  if ((var21 & 4) == 4) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var47 = 0;
                     if (null != var5.definition.recolorTo) {
                        if (var2 != 14) {
                           return;
                        }

                        var47 = var5.definition.recolorTo.length;
                     }

                     var37 = new short[var47];

                     for (int var59 = 0; var59 < var47; var59++) {
                        var37[var59] = (short)var1.readUnsignedShortAddLE(-1048925070);
                     }
                  }

                  short[] var48 = null;
                  if ((var21 & 8) == 8) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var60 = 0;
                     if (var5.definition.retextureTo != null) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var60 = var5.definition.retextureTo.length;
                     }

                     var48 = new short[var60];

                     for (int var66 = 0; var66 < var60; var66++) {
                        if (var2 != 14) {
                           return;
                        }

                        var48[var66] = (short)var1.readUnsignedShortLE((byte)42);
                     }
                  }

                  boolean var61 = false;
                  if (0 != (var21 & 16)) {
                     if (var2 != 14) {
                        return;
                     }

                     boolean var73;
                     if (var1.readUnsignedByte(1318476545) == 1) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var73 = true;
                     } else {
                        var73 = false;
                     }

                     var61 = var73;
                  }

                  long var67 = (NPC.field1495 += 2035824187) * -801688845 - 1;
                  var5.method3540(new NpcOverrides(var67, var28, var37, var48, var61), (short)23331);
               }
            }

            if (0 != (var6 & 64)) {
               var5.overheadText = var1.readStringCp1252NullCircumfixed(1402576034);
               var5.method2825(-1);
               var5.overheadTextCyclesRemaining = 59045028;
            }

            if ((var6 & 262144) != 0) {
               if (var2 != 14) {
                  return;
               }

               int var22 = var1.readUnsignedByteSub((byte)-106);

               for (int var29 = 0; var29 < var22; var29++) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  int var38 = var1.readUnsignedByteNeg(1509701725);
                  int var49 = var1.readUnsignedShortLE((byte)109);
                  int var62 = var1.readUnsignedIntLE(-1370916521);
                  var5.updateSpotAnimation(var38, var49, var62 >> 16, var62 & 65535, -1078953861);
               }
            }

            if ((var6 & 128) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               var5.targetIndex = var1.readUnsignedShortAdd(-1156088784) * -92047129;
               var5.method2838(-1);
               var5.targetIndex = var5.targetIndex + (var1.readUnsignedByte(-1623758965) << 16) * -92047129;
               var5.method2838(-1);
               int var23 = 16777215;
               if (var23 == -998106409 * var5.targetIndex) {
                  var5.targetIndex = 92047129;
                  var5.method2838(-1);
               }
            }

            if (0 != (var6 & 8)) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               NPCComposition var90 = AsyncHttpResponse.getNpcDefinition(var1.readUnsignedShortAddLE(1910225915), (byte)107);
               var5.method3552(var90);
               var5.definition = var90;
               classFM.method4030(var5, -1993778630);
            }

            if ((var6 & 16384) != 0) {
               var5.field1181 = var1.readByteSub(-639471049) * -1816676295;
               var5.field1178 = Buffer.method12001(var1, (byte)68) * 1687056953;
               var5.field1180 = var1.readByteSub(-639471049) * 637283297;
               var5.field1182 = var1.readByteSub(-639471049) * -449848409;
               var5.spotAnimation = (var1.readUnsignedShortAdd(-1156088784) + 1759706017 * client.cycle) * -779189801;
               var5.field1176 = (var1.readUnsignedShortAdd(-1156088784) + client.cycle * 1759706017) * 1487731929;
               var5.field1179 = var1.readUnsignedShortAddLE(-526383908) * 182140069;
               var5.pathLength = 0;
               var5.field1164 = 0;
               var5.field1181 = var5.field1181 + -1816676295 * var5.pathX[0];
               var5.field1178 = var5.field1178 + var5.pathY[0] * 1687056953;
               var5.field1180 = var5.field1180 + var5.pathX[0] * 637283297;
               var5.field1182 = var5.field1182 + -449848409 * var5.pathY[0];
            }

            if ((var6 & 32) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               Buffer.method12008(var1, (byte)5);
               var1.readUnsignedShortAdd(-1156088784);
               var1.readUnsignedByteSub((byte)-44);
            }

            if (0 != (var6 & 256)) {
               var5.npcCycle = (client.cycle * 1759706017 + var1.readUnsignedShortAdd(-1156088784)) * 657376133;
               var5.field1125 = (1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784)) * -244368321;
               byte var24 = var1.readByteNeg(344605225);
               byte var30 = var1.readByteSub(-639471049);
               byte var39 = var1.readByteNeg(344605225);
               byte var50 = (byte)var1.readUnsignedByteSub((byte)66);
               GrandExchangeOfferWorldComparator.method8848(var5.field1136, var24, var30, var39, var50);
            }

            if ((var6 & 4) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               int var25 = var1.readUnsignedByteSub((byte)-2);
               if (var25 > 0) {
                  for (int var31 = 0; var31 < var25; var31++) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var51 = -1;
                     int var63 = -1;
                     int var68 = -1;
                     int var40 = Buffer.method12050(var1, -22099790);
                     if (32767 == var40) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        var40 = Buffer.method12050(var1, 1812494303);
                        var63 = Buffer.method12050(var1, -352788931);
                        var51 = Buffer.method12050(var1, -2110076730);
                        var68 = Buffer.method12050(var1, 151968542);
                     } else if (var40 != 32766) {
                        var63 = Buffer.method12050(var1, -523548813);
                     } else {
                        var40 = -1;
                     }

                     int var13 = Buffer.method12050(var1, 1303193651);
                     var5.addHitSplat(var40, var63, var51, var68, 1759706017 * client.cycle, var13, (short)32767);
                  }
               }

               int var32 = var1.readUnsignedByteAdd(-394853283);
               if (var32 > 0) {
                  if (var2 != 14) {
                     throw new IllegalStateException();
                  }

                  for (int var41 = 0; var41 < var32; var41++) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     int var52 = Buffer.method12050(var1, 1902608834);
                     int var64 = Buffer.method12050(var1, -1869893838);
                     if (32767 != var64) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }

                        int var69 = Buffer.method12050(var1, -1060273606);
                        int var70 = var1.readUnsignedByteNeg(1197962100);
                        int var74;
                        if (var64 > 0) {
                           if (var2 != 14) {
                              throw new IllegalStateException();
                           }

                           var74 = var1.readUnsignedByteSub((byte)36);
                        } else {
                           var74 = var70;
                        }

                        int var14 = var74;
                        var5.addHealthBar(var52, client.cycle * 1759706017, var64, var69, var70, var14, (byte)15);
                     } else {
                        var5.removeHealthBar(var52, 327716789);
                     }
                  }
               }
            }

            if ((var6 & 4096) != 0) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               NPC.method3492(var5, var1.readStringCp1252NullCircumfixed(-510895537), -1504322904);
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "jl.lo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("an")
   public static int method6012(int var0, int var1, int var2, int var3) {
      try {
         int var4 = SpotAnimationDefinition.method4605(1 + (var2 - var1), 191599472);
         var4 <<= var1;
         int var6;
         return var6 = var0 & ~var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "jl.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("qh")
   @Override
   public void vmethod247(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      this.drawTileUnderlay(var1, var2, var3, var4, var5, -436402298);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ei")
   @Override
   public void vmethod248(Scene var1, SceneTileModel var2, int var3, int var4) {
      this.drawTileOverlay(var1, var2, var3, var4, -656009185);
   }
}
