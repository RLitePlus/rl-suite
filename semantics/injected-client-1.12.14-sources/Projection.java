import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ka")
public abstract class Projection implements net.runelite.api.Projection {
   @ObfuscatedName("po")
   public static int field3248;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field3247 = 82;

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("an")
   abstract void vmethod235(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("mp")
   public void method6233(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      this.draw(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIII)V")
   @ObfuscatedName("at")
   abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFF)F")
   @ObfuscatedName("jf")
   public static float method6234(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return WorldMapEvent.method7539(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (byte)111);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;III)V")
   @ObfuscatedName("hj")
   public void method6231(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      field3248 = var3;
      this.vmethod248(var1, var2, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("av")
   abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("sa")
   public void method6235(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      Language.method8873(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, -173961864);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;III)V")
   @ObfuscatedName("ag")
   abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4, int var5);

   Projection() {
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ei")
   public void vmethod248(Scene var1, SceneTileModel var2, int var3, int var4) {
      this.drawTileOverlay(var1, var2, var3, var4, -656009185);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljh;Lkr;III)V")
   @ObfuscatedName("fq")
   public static void method6230(Projection var0, Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.drawSceneTileModel(var1, var2, var3, var3, var3);
      } else {
         try {
            Clips var6 = Rasterizer3D.clips;
            boolean var7 = SecureUrlRequester.client.isGpu();
            if (client.field1025 != null) {
               client.field1025.drawSceneTileModel(var1, var2, var3, var4);
            }

            rl8 var8 = var1.field2886[var1.field3023.plane * 2115028565][var3 + var1.field3014][var4 + var1.field3014];
            var6.clipX = 0;
            int var9 = var2.faceX.length;

            for (int var10 = 0; var10 < var9; var10++) {
               int var11 = var2.faceX[var10];
               int var12 = var2.faceY[var10];
               int var13 = var2.faceZ[var10];
               float var14 = SceneTileModel.verticesX[var11];
               float var15 = SceneTileModel.verticesX[var12];
               float var16 = SceneTileModel.verticesX[var13];
               float var17 = SceneTileModel.verticesY[var11];
               float var18 = SceneTileModel.verticesY[var12];
               float var19 = SceneTileModel.verticesY[var13];
               float var20 = SceneTileModel.verticesZ[var11];
               float var21 = SceneTileModel.verticesZ[var12];
               float var22 = SceneTileModel.verticesZ[var13];
               if ((var14 - var15) * (var19 - var18) - (var17 - var18) * (var16 - var15) > 0.0F) {
                  if (Scene.method5811(
                     var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var17, (int)var18, (int)var19, (int)var14, (int)var15, (int)var16
                  )) {
                     float var23 = method6234(
                        var1.Scene_selectedScreenX,
                        var1.Scene_selectedScreenY,
                        (int)var14,
                        (int)var15,
                        (int)var16,
                        (int)var17,
                        (int)var18,
                        (int)var19,
                        var20,
                        var21,
                        var22
                     );
                     if (var23 > var1.field2929 && field3248 <= var1.field3023.plane * 2115028565) {
                        var1.method5755(var3, var4, var23);
                     }

                     if (var8 != null
                        && var2 == var8.method9617()
                        && var1.Scene_selectedScreenX >= SecureUrlRequester.client.getViewportXOffset()
                        && var1.Scene_selectedScreenX < SecureUrlRequester.client.getViewportXOffset() + SecureUrlRequester.client.getViewportWidth()
                        && var1.Scene_selectedScreenY >= SecureUrlRequester.client.getViewportYOffset()
                        && var1.Scene_selectedScreenY < SecureUrlRequester.client.getViewportYOffset() + SecureUrlRequester.client.getViewportHeight()) {
                        var1.method5751(var3, var4, var8.method9624());
                     }
                  }

                  if (!var7) {
                     var6.clipping = false;
                     int var26 = var6.clipNegativeMidX;
                     if (var14 < 0.0F || var15 < 0.0F || var16 < 0.0F || var14 > var26 || var15 > var26 || var16 > var26) {
                        var6.clipping = true;
                     }

                     if (var2.triangleTextureId != null && var2.triangleTextureId[var10] != -1) {
                        if (!Scene.Scene_isLowDetail) {
                           if (var2.isFlat) {
                              AbstractRasterizer.method5456(
                                 var17,
                                 var18,
                                 var19,
                                 var14,
                                 var15,
                                 var16,
                                 var20,
                                 var21,
                                 var22,
                                 var2.triangleColorA[var10],
                                 var2.triangleColorB[var10],
                                 var2.triangleColorC[var10],
                                 SceneTileModel.triangleTexturesX[0],
                                 SceneTileModel.triangleTexturesX[1],
                                 SceneTileModel.triangleTexturesX[3],
                                 SceneTileModel.triangleTexturesY[0],
                                 SceneTileModel.triangleTexturesY[1],
                                 SceneTileModel.triangleTexturesY[3],
                                 SceneTileModel.triangleTexturesZ[0],
                                 SceneTileModel.triangleTexturesZ[1],
                                 SceneTileModel.triangleTexturesZ[3],
                                 var2.triangleTextureId[var10]
                              );
                           } else {
                              AbstractRasterizer.method5456(
                                 var17,
                                 var18,
                                 var19,
                                 var14,
                                 var15,
                                 var16,
                                 var20,
                                 var21,
                                 var22,
                                 var2.triangleColorA[var10],
                                 var2.triangleColorB[var10],
                                 var2.triangleColorC[var10],
                                 SceneTileModel.triangleTexturesX[var11],
                                 SceneTileModel.triangleTexturesX[var12],
                                 SceneTileModel.triangleTexturesX[var13],
                                 SceneTileModel.triangleTexturesY[var11],
                                 SceneTileModel.triangleTexturesY[var12],
                                 SceneTileModel.triangleTexturesY[var13],
                                 SceneTileModel.triangleTexturesZ[var11],
                                 SceneTileModel.triangleTexturesZ[var12],
                                 SceneTileModel.triangleTexturesZ[var13],
                                 var2.triangleTextureId[var10]
                              );
                           }
                        } else {
                           int var24 = var6.Rasterizer3D_textureLoader.method6347(var2.triangleTextureId[var10]);
                           AbstractRasterizer.method5458(
                              var17,
                              var18,
                              var19,
                              var14,
                              var15,
                              var16,
                              var20,
                              var21,
                              var22,
                              Scene.method5475(var24, var2.triangleColorA[var10]),
                              Scene.method5475(var24, var2.triangleColorB[var10]),
                              Scene.method5475(var24, var2.triangleColorC[var10])
                           );
                        }
                     } else if (var2.triangleColorA[var10] != 12345678) {
                        AbstractRasterizer.method5458(
                           var17,
                           var18,
                           var19,
                           var14,
                           var15,
                           var16,
                           var20,
                           var21,
                           var22,
                           var2.triangleColorA[var10],
                           var2.triangleColorB[var10],
                           var2.triangleColorC[var10]
                        );
                     }
                  }
               }
            }
         } catch (Exception var25) {
            client.field938.warn("error during overlay rendering", var25);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIJ)V")
   @ObfuscatedName("ae")
   abstract void vmethod236(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqb;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("xx")
   public static int method6225(GrandExchangeOfferUnitPriceComparator var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method8844(var1);
      }

      return var0.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 2014949931);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("aj")
   abstract void vmethod239(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ay")
   abstract void vmethod240(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("aw")
   abstract void vmethod244(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("ak")
   abstract void vmethod238(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("al")
   void method6221(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
      float var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
      float var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
      float var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
      float var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
      float var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
      float var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
      float var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
      float var25 = WorldMapSectionType.method7174(var13, 1408108797);
      float var26 = WorldMapSectionType.method7174(var14, 1808170969);
      float var27 = WorldMapSectionType.method7174(var15, -1686665830);
      float var28 = WorldMapSectionType.method7174(var16, 557350790);
      Rasterizer3D.clips.clipX = 0;
      if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var29 = Rasterizer3D.method5865();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19
         )) {
            float var30 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var21,
               (int)var23,
               (int)var19,
               (int)var22,
               (int)var24,
               (int)var20,
               var27,
               var28,
               var26,
               (byte)2
            );
            if (var30 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var30;
            }
         }

         if (-1 == -602204071 * var2.texture) {
            if (12345678 != var2.neColor * -120051743) {
               Rasterizer3D.rasterGouraud(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  var2.neColor * -120051743,
                  var2.nwColor * -1286626226,
                  -1935458268 * var2.seColor
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            if (var2.isFlat) {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  2034891725 * var2.nwColor,
                  var2.seColor * -1789756031,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  -699583661 * var2.texture
               );
            } else {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  1611650905 * var2.neColor,
                  94297073 * var2.nwColor,
                  -1544471797 * var2.seColor,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  var2.texture * -1165376709
               );
            }
         } else {
            int var32 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -699583661, 1955504080);
            Rasterizer3D.rasterGouraud(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method5469(var32, -120051743 * var2.neColor),
               Scene.method5469(var32, var2.nwColor * -689426163),
               Scene.method5469(var32, -1789756031 * var2.seColor)
            );
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var31 = Rasterizer3D.method5865();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23
         )) {
            float var33 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var17,
               (int)var19,
               (int)var23,
               (int)var18,
               (int)var20,
               (int)var24,
               var25,
               var26,
               var28,
               (byte)43
            );
            if (var33 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var33;
            }
         }

         if (-699583661 * var2.texture == -1) {
            if (2121150585 != -1705968521 * var2.swColor) {
               Rasterizer3D.rasterGouraud(
                  var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor * 1271680875, -1789756031 * var2.seColor, var2.nwColor * 94297073
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            Rasterizer3D.rasterTextureWithColors(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               -1705968521 * var2.swColor,
               var2.seColor * -178653911,
               849547233 * var2.nwColor,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               -699583661 * var2.texture
            );
         } else {
            int var34 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(-699583661 * var2.texture, 361855906);
            Rasterizer3D.rasterGouraud(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method5469(var34, -1705968521 * var2.swColor),
               Scene.method5469(var34, var2.seColor * 1362237338),
               Scene.method5469(var34, 94297073 * var2.nwColor)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("au")
   abstract void vmethod241(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("ap")
   abstract void vmethod242(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;III)V")
   @ObfuscatedName("qh")
   public void vmethod247(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      this.drawTileUnderlay(var1, var2, var3, var4, var5, -436402298);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIII)V")
   @ObfuscatedName("kk")
   public void method6228(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6) {
      field3248 = var3;
      this.vmethod247(var1, var2, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("ar")
   void method6222(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
      float var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
      float var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
      float var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
      float var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
      float var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
      float var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
      float var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
      float var25 = WorldMapSectionType.method7174(var13, -1990806033);
      float var26 = WorldMapSectionType.method7174(var14, 989827086);
      float var27 = WorldMapSectionType.method7174(var15, -1289868830);
      float var28 = WorldMapSectionType.method7174(var16, -966271862);
      Rasterizer3D.clips.clipX = 0;
      if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var29 = Rasterizer3D.method5865();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19
         )) {
            float var30 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var21,
               (int)var23,
               (int)var19,
               (int)var22,
               (int)var24,
               (int)var20,
               var27,
               var28,
               var26,
               (byte)116
            );
            if (var30 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var30;
            }
         }

         if (-1 == -699583661 * var2.texture) {
            if (12345678 != var2.neColor * -120051743) {
               Rasterizer3D.rasterGouraud(
                  var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor * -120051743, var2.nwColor * 94297073, -1789756031 * var2.seColor
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            if (var2.isFlat) {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  94297073 * var2.nwColor,
                  var2.seColor * -1789756031,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  -699583661 * var2.texture
               );
            } else {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  94297073 * var2.nwColor,
                  -1789756031 * var2.seColor,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  var2.texture * -699583661
               );
            }
         } else {
            int var32 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -699583661, 719657575);
            Rasterizer3D.rasterGouraud(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method5469(var32, -120051743 * var2.neColor),
               Scene.method5469(var32, var2.nwColor * 94297073),
               Scene.method5469(var32, -1789756031 * var2.seColor)
            );
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var31 = Rasterizer3D.method5865();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23
         )) {
            float var33 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var17,
               (int)var19,
               (int)var23,
               (int)var18,
               (int)var20,
               (int)var24,
               var25,
               var26,
               var28,
               (byte)69
            );
            if (var33 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var33;
            }
         }

         if (-699583661 * var2.texture == -1) {
            if (12345678 != -1705968521 * var2.swColor) {
               Rasterizer3D.rasterGouraud(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  var2.swColor * -1705968521,
                  -1789756031 * var2.seColor,
                  var2.nwColor * 94297073
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            Rasterizer3D.rasterTextureWithColors(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               -1705968521 * var2.swColor,
               var2.seColor * -1789756031,
               94297073 * var2.nwColor,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               -699583661 * var2.texture
            );
         } else {
            int var34 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(-699583661 * var2.texture, -259925784);
            Rasterizer3D.rasterGouraud(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method5469(var34, -1705968521 * var2.swColor),
               Scene.method5469(var34, var2.seColor * -1789756031),
               Scene.method5469(var34, 94297073 * var2.nwColor)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("ah")
   void method6223(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
      float var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
      float var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
      float var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
      float var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
      float var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
      float var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
      float var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
      float var25 = WorldMapSectionType.method7174(var13, -1071831975);
      float var26 = WorldMapSectionType.method7174(var14, 1609949636);
      float var27 = WorldMapSectionType.method7174(var15, -385769590);
      float var28 = WorldMapSectionType.method7174(var16, -363766649);
      Rasterizer3D.clips.clipX = 0;
      if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var29 = Rasterizer3D.method5865();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19
         )) {
            float var30 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var21,
               (int)var23,
               (int)var19,
               (int)var22,
               (int)var24,
               (int)var20,
               var27,
               var28,
               var26,
               (byte)43
            );
            if (var30 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var30;
            }
         }

         if (-1 == -699583661 * var2.texture) {
            if (12345678 != var2.neColor * -120051743) {
               Rasterizer3D.rasterGouraud(
                  var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor * -120051743, var2.nwColor * 94297073, -1789756031 * var2.seColor
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            if (var2.isFlat) {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  94297073 * var2.nwColor,
                  var2.seColor * -1789756031,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  -699583661 * var2.texture
               );
            } else {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  94297073 * var2.nwColor,
                  -1789756031 * var2.seColor,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  var2.texture * -699583661
               );
            }
         } else {
            int var32 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -699583661, -222033842);
            Rasterizer3D.rasterGouraud(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method5469(var32, -120051743 * var2.neColor),
               Scene.method5469(var32, var2.nwColor * 94297073),
               Scene.method5469(var32, -1789756031 * var2.seColor)
            );
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var31 = Rasterizer3D.method5865();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23
         )) {
            float var33 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var17,
               (int)var19,
               (int)var23,
               (int)var18,
               (int)var20,
               (int)var24,
               var25,
               var26,
               var28,
               (byte)116
            );
            if (var33 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var33;
            }
         }

         if (-699583661 * var2.texture == -1) {
            if (12345678 != -1705968521 * var2.swColor) {
               Rasterizer3D.rasterGouraud(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  var2.swColor * -1705968521,
                  -1789756031 * var2.seColor,
                  var2.nwColor * 94297073
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            Rasterizer3D.rasterTextureWithColors(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               -1705968521 * var2.swColor,
               var2.seColor * -1789756031,
               94297073 * var2.nwColor,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               -699583661 * var2.texture
            );
         } else {
            int var34 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(-699583661 * var2.texture, -196676767);
            Rasterizer3D.rasterGouraud(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method5469(var34, -1705968521 * var2.swColor),
               Scene.method5469(var34, var2.seColor * -1789756031),
               Scene.method5469(var34, 94297073 * var2.nwColor)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ac")
   static final int method6227(int var0, int var1, int var2) {
      try {
         int var3 = classRE.method9418(var0 - 1, var1 - 1, -1019309288)
            + classRE.method9418(var0 + 1, var1 - 1, -1681395054)
            + classRE.method9418(var0 - 1, 1 + var1, 515125297)
            + classRE.method9418(1 + var0, var1 + 1, 1986180758);
         int var4 = classRE.method9418(var0 - 1, var1, -898415102)
            + classRE.method9418(var0 + 1, var1, -497085075)
            + classRE.method9418(var0, var1 - 1, -775813309)
            + classRE.method9418(var0, 1 + var1, 1914764031);
         int var5 = classRE.method9418(var0, var1, -408864323);
         return var3 / 16 + var4 / 8 + var5 / 4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ka.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("af")
   void method6224(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
      float var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
      float var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
      float var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
      float var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
      float var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
      float var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
      float var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
      float var25 = WorldMapSectionType.method7174(var13, 1133143737);
      float var26 = WorldMapSectionType.method7174(var14, -2107100231);
      float var27 = WorldMapSectionType.method7174(var15, -758718411);
      float var28 = WorldMapSectionType.method7174(var16, -837327487);
      Rasterizer3D.clips.clipX = 0;
      if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var29 = Rasterizer3D.method5865();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19
         )) {
            float var30 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var21,
               (int)var23,
               (int)var19,
               (int)var22,
               (int)var24,
               (int)var20,
               var27,
               var28,
               var26,
               (byte)66
            );
            if (var30 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var30;
            }
         }

         if (-1 == -699583661 * var2.texture) {
            if (-1933000665 != var2.neColor * 897933404) {
               Rasterizer3D.rasterGouraud(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  var2.neColor * 1076320120,
                  var2.nwColor * -1185240909,
                  794043163 * var2.seColor
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            if (var2.isFlat) {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  1466957948 * var2.nwColor,
                  var2.seColor * 965898638,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  1079507249 * var2.texture
               );
            } else {
               Rasterizer3D.rasterTextureWithColors(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -120051743 * var2.neColor,
                  94297073 * var2.nwColor,
                  -1789756031 * var2.seColor,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  var2.texture * 1977188029
               );
            }
         } else {
            int var32 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -699583661, 480999317);
            Rasterizer3D.rasterGouraud(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method5469(var32, -120051743 * var2.neColor),
               Scene.method5469(var32, var2.nwColor * 94297073),
               Scene.method5469(var32, -1789756031 * var2.seColor)
            );
         }
      }

      if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) > 0.0F) {
         Rasterizer3D.clips.clipping = false;
         int var31 = Rasterizer3D.method5865();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            Rasterizer3D.clips.clipping = true;
         }

         if (Scene.containsBounds(
            var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23
         )) {
            float var33 = WorldMapEvent.method7539(
               var1.Scene_selectedScreenX,
               var1.Scene_selectedScreenY,
               (int)var17,
               (int)var19,
               (int)var23,
               (int)var18,
               (int)var20,
               (int)var24,
               var25,
               var26,
               var28,
               (byte)13
            );
            if (var33 > var1.field2929) {
               var1.Scene_baseX = var3;
               var1.Scene_baseY = var4;
               var1.field2929 = var33;
            }
         }

         if (-699583661 * var2.texture == -1) {
            if (12345678 != -1705968521 * var2.swColor) {
               Rasterizer3D.rasterGouraud(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  var2.swColor * -1793085295,
                  553833523 * var2.seColor,
                  var2.nwColor * 1809617000
               );
            }
         } else if (!Scene.Scene_isLowDetail) {
            Rasterizer3D.rasterTextureWithColors(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               -1705968521 * var2.swColor,
               var2.seColor * -1789756031,
               94297073 * var2.nwColor,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               -699583661 * var2.texture
            );
         } else {
            int var34 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(-699583661 * var2.texture, 1582487159);
            Rasterizer3D.rasterGouraud(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method5469(var34, -601494747 * var2.swColor),
               Scene.method5469(var34, var2.seColor * -1886484797),
               Scene.method5469(var34, 94297073 * var2.nwColor)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("am")
   void method6226(Scene var1, SceneTileModel var2, int var3, int var4) {
      Rasterizer3D.clips.clipX = 0;
      int var5 = var2.faceX.length;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var2.faceX[var6];
         int var8 = var2.faceY[var6];
         int var9 = var2.faceZ[var6];
         float var10 = SceneTileModel.verticesX[var7];
         float var11 = SceneTileModel.verticesX[var8];
         float var12 = SceneTileModel.verticesX[var9];
         float var13 = SceneTileModel.verticesY[var7];
         float var14 = SceneTileModel.verticesY[var8];
         float var15 = SceneTileModel.verticesY[var9];
         float var16 = SceneTileModel.verticesZ[var7];
         float var17 = SceneTileModel.verticesZ[var8];
         float var18 = SceneTileModel.verticesZ[var9];
         if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
            Rasterizer3D.clips.clipping = false;
            int var19 = Rasterizer3D.method5865();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
               Rasterizer3D.clips.clipping = true;
            }

            if (Scene.containsBounds(
               var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12
            )) {
               float var20 = WorldMapEvent.method7539(
                  var1.Scene_selectedScreenX,
                  var1.Scene_selectedScreenY,
                  (int)var10,
                  (int)var11,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var15,
                  var16,
                  var17,
                  var18,
                  (byte)19
               );
               if (var20 > var1.field2929) {
                  var1.Scene_baseX = var3;
                  var1.Scene_baseY = var4;
                  var1.field2929 = var20;
               }
            }

            if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
               if (!Scene.Scene_isLowDetail) {
                  if (var2.isFlat) {
                     Rasterizer3D.rasterTextureWithColors(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.triangleColorA[var6],
                        var2.triangleColorB[var6],
                        var2.triangleColorC[var6],
                        SceneTileModel.triangleTexturesX[0],
                        SceneTileModel.triangleTexturesX[1],
                        SceneTileModel.triangleTexturesX[3],
                        SceneTileModel.triangleTexturesY[0],
                        SceneTileModel.triangleTexturesY[1],
                        SceneTileModel.triangleTexturesY[3],
                        SceneTileModel.triangleTexturesZ[0],
                        SceneTileModel.triangleTexturesZ[1],
                        SceneTileModel.triangleTexturesZ[3],
                        var2.triangleTextureId[var6]
                     );
                  } else {
                     Rasterizer3D.rasterTextureWithColors(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.triangleColorA[var6],
                        var2.triangleColorB[var6],
                        var2.triangleColorC[var6],
                        SceneTileModel.triangleTexturesX[var7],
                        SceneTileModel.triangleTexturesX[var8],
                        SceneTileModel.triangleTexturesX[var9],
                        SceneTileModel.triangleTexturesY[var7],
                        SceneTileModel.triangleTexturesY[var8],
                        SceneTileModel.triangleTexturesY[var9],
                        SceneTileModel.triangleTexturesZ[var7],
                        SceneTileModel.triangleTexturesZ[var8],
                        SceneTileModel.triangleTexturesZ[var9],
                        var2.triangleTextureId[var6]
                     );
                  }
               } else {
                  int var21 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6], 1590089960);
                  Rasterizer3D.rasterGouraud(
                     var13,
                     var14,
                     var15,
                     var10,
                     var11,
                     var12,
                     var16,
                     var17,
                     var18,
                     Scene.method5469(var21, var2.triangleColorA[var6]),
                     Scene.method5469(var21, var2.triangleColorB[var6]),
                     Scene.method5469(var21, var2.triangleColorC[var6])
                  );
               }
            } else if (12345678 != var2.triangleColorA[var6]) {
               Rasterizer3D.rasterGouraud(
                  var13,
                  var14,
                  var15,
                  var10,
                  var11,
                  var12,
                  var16,
                  var17,
                  var18,
                  var2.triangleColorA[var6],
                  var2.triangleColorB[var6],
                  var2.triangleColorC[var6]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;II)V")
   @ObfuscatedName("az")
   abstract void vmethod245(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFFI)V")
   @ObfuscatedName("ab")
   void drawSceneTilePaint(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      int var17
   ) {
      try {
         Clips var18 = Rasterizer3D.clips;
         int var19 = var18.zoom;
         int var20 = var18.clipMidY;
         int var21 = var18.field3438;
         float var22 = var20 + var5 * var19 / var13;
         float var23 = var21 + var9 * var19 / var13;
         float var24 = var20 + var6 * var19 / var14;
         float var25 = var21 + var10 * var19 / var14;
         float var26 = var20 + var7 * var19 / var15;
         float var27 = var21 + var11 * var19 / var15;
         float var28 = var20 + var8 * var19 / var16;
         float var29 = var21 + var12 * var19 / var16;
         float var30 = AbstractRasterizer.method5448(var13);
         float var31 = AbstractRasterizer.method5448(var14);
         float var32 = AbstractRasterizer.method5448(var15);
         float var33 = AbstractRasterizer.method5448(var16);
         var18.clipNegativeMidY = 0;
         rl8 var34 = var1.field3030[var1.field3023.plane * 2115028565][var3 + var1.field3022][var4 + var1.field3018];
         if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0.0F) {
            if (Scene.method5811(var1.Scene_cameraYTile, var1.Scene_entityX, (int)var27, (int)var29, (int)var25, (int)var26, (int)var28, (int)var24)) {
               float var35 = method6234(
                  var1.Scene_currentOccludersCount,
                  var1.Scene_cameraXTileMin,
                  (int)var26,
                  (int)var28,
                  (int)var24,
                  (int)var27,
                  (int)var29,
                  (int)var25,
                  var32,
                  var33,
                  var31
               );
               if (var35 > var1.Scene_scale && field3248 <= var1.field3023.field1331 * 2115028565) {
                  var1.method5755(var3, var4, var35);
               }

               if (var1.Scene_selectedScreenX >= SecureUrlRequester.client.getMouseIdleTicks()
                  && var1.field3008 < SecureUrlRequester.client.getOculusOrbState() + SecureUrlRequester.client.getDraw2DMask()
                  && var1.Scene_drawnCount >= SecureUrlRequester.client.getViewportYOffset()
                  && var1.field3011 < SecureUrlRequester.client.getTickCount() + SecureUrlRequester.client.getRevision()
                  && var34 != null
                  && var2 == var34.method9622()) {
                  var1.method5553(var3, var4, var34.method9624());
               }
            }

            if (!SecureUrlRequester.client.isStretchedEnabled()) {
               var18.clipping = false;
               int var38 = var18.currentFaceAlpha;
               if (var26 < 0.0F || var28 < 0.0F || var24 < 0.0F || var26 > var38 || var28 > var38 || var24 > var38) {
                  var18.clipping = true;
               }

               if (var2.nwColor * -699583661 == -1) {
                  if (var2.seColor * -120051743 != 12345678) {
                     AbstractRasterizer.method5458(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.nwColor * -120051743,
                        var2.swColor * 94297073,
                        var2.nwColor * -1789756031
                     );
                  }
               } else if (!Scene.Scene_isLowDetail) {
                  if (var2.isFlat) {
                     AbstractRasterizer.method5456(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.nwColor * -120051743,
                        var2.rgb * 94297073,
                        var2.texture * -1789756031,
                        (int)var5,
                        (int)var6,
                        (int)var8,
                        (int)var9,
                        (int)var10,
                        (int)var12,
                        (int)var13,
                        (int)var14,
                        (int)var16,
                        var2.swColor * -699583661
                     );
                  } else {
                     AbstractRasterizer.method5456(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.neColor * -120051743,
                        var2.rgb * 94297073,
                        var2.neColor * -1789756031,
                        (int)var7,
                        (int)var8,
                        (int)var6,
                        (int)var11,
                        (int)var12,
                        (int)var10,
                        (int)var15,
                        (int)var16,
                        (int)var14,
                        var2.nwColor * -699583661
                     );
                  }
               } else {
                  int var36 = var18.Rasterizer3D_textureLoader.method6347(var2.rgb * -699583661);
                  AbstractRasterizer.method5458(
                     var27,
                     var29,
                     var25,
                     var26,
                     var28,
                     var24,
                     var32,
                     var33,
                     var31,
                     Scene.method5475(var36, var2.seColor * -120051743),
                     Scene.method5475(var36, var2.texture * 94297073),
                     Scene.method5475(var36, var2.texture * -1789756031)
                  );
               }
            }
         }

         if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0.0F) {
            if (Scene.method5811(var1.field3005, var1.minPlane, (int)var23, (int)var25, (int)var29, (int)var22, (int)var24, (int)var28)) {
               float var39 = method6234(
                  var1.Scene_cameraY, var1.Scene_entityX, (int)var22, (int)var24, (int)var28, (int)var23, (int)var25, (int)var29, var30, var31, var33
               );
               if (var39 > var1.field2868 && field3248 <= var1.field3023.sizeX * 2115028565) {
                  var1.method5755(var3, var4, var39);
               }

               if (var1.field3013 >= SecureUrlRequester.client.getMenuY()
                  && var1.Scene_currentOccludersCount < SecureUrlRequester.client.getGameCycle() + SecureUrlRequester.client.getMouseCurrentButton()
                  && var1.field3013 >= SecureUrlRequester.client.getCameraZ()
                  && var1.Scene_cameraYTileMax < SecureUrlRequester.client.getItemCount() + SecureUrlRequester.client.getMenuY()
                  && var34 != null
                  && var2 == var34.method9622()) {
                  var1.method5551(var3, var4, var34.method9616());
               }
            }

            if (!SecureUrlRequester.client.isWidgetSelected()) {
               var18.clipping = false;
               int var40 = var18.clipY;
               if (var22 < 0.0F || var24 < 0.0F || var28 < 0.0F || var22 > var40 || var24 > var40 || var28 > var40) {
                  var18.clipping = true;
               }

               if (var2.swColor * -699583661 == -1) {
                  if (var2.nwColor * -1705968521 != 12345678) {
                     AbstractRasterizer.method5458(
                        var23,
                        var25,
                        var29,
                        var22,
                        var24,
                        var28,
                        var30,
                        var31,
                        var33,
                        var2.nwColor * -1705968521,
                        var2.swColor * -1789756031,
                        var2.swColor * 94297073
                     );
                  }
               } else if (!Scene.Scene_isLowDetail) {
                  AbstractRasterizer.method5456(
                     var23,
                     var25,
                     var29,
                     var22,
                     var24,
                     var28,
                     var30,
                     var31,
                     var33,
                     var2.seColor * -1705968521,
                     var2.seColor * -1789756031,
                     var2.neColor * 94297073,
                     (int)var5,
                     (int)var6,
                     (int)var8,
                     (int)var9,
                     (int)var10,
                     (int)var12,
                     (int)var13,
                     (int)var14,
                     (int)var16,
                     var2.seColor * -699583661
                  );
               } else {
                  int var41 = var18.Rasterizer3D_textureLoader.method6347(var2.swColor * -699583661);
                  AbstractRasterizer.method5458(
                     var23,
                     var25,
                     var29,
                     var22,
                     var24,
                     var28,
                     var30,
                     var31,
                     var33,
                     Scene.method5475(var41, var2.nwColor * -1705968521),
                     Scene.method5475(var41, var2.neColor * -1789756031),
                     Scene.method5475(var41, var2.nwColor * 94297073)
                  );
               }
            }
         }
      } catch (Exception var37) {
         client.field938.warn("error during underlay rendering", var37);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lkr;III)V")
   @ObfuscatedName("ax")
   void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      field3248 = var3;
      this.vmethod248(var1, var2, var4, var5);
   }
}
