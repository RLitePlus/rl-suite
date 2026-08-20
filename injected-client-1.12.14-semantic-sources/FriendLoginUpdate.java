import net.runelite.api.PendingLogin;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tj")
public class FriendLoginUpdate extends Link implements PendingLogin {
   @ObfuscatedName("av")
   public int field5932 = (int)(ParamComposition.method4949((byte)15) / 1000L) * 30504305;
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("at")
   public Username username;
   @ObfuscatedName("ag")
   public short world;

   public String getName() {
      return this.method10748().method12725();
   }

   @ObfuscatedSignature(descriptor = "()Lxv;")
   @ObfuscatedName("fu")
   public Username method10748() {
      return this.username;
   }

   public short getWorld() {
      return this.world;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;I)V")
   @ObfuscatedName("sy")
   public void method10747(Username var1, int var2) {
      this.field5932 = (this.field5932 * -1064653935 + 5) * 30504305;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIIIJ)V")
   @ObfuscatedName("nx")
   public static void method10745(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || var0.faceAlphas != null) {
         int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
         int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
         int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
         int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
         float var13 = Rasterizer3D.field3038[var2];
         float var14 = Rasterizer3D.field3037[var2];
         float var15 = Rasterizer3D.field3038[var3];
         float var16 = Rasterizer3D.field3037[var3];
         if (var0.radius != 1) {
            var0.method6864();
         }

         var0.calculateBoundingBox(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = var0.diameter * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < AbstractRasterizer.method5428()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - var0.diameter) * Rasterizer3D.get3dZoom();
            if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
               int var23 = (var21 + var0.diameter) * Rasterizer3D.get3dZoom();
               if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = var0.diameter * var9 >> 16;
                  int var26 = var25 + (var0.boundsType * var10 >> 16);
                  int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
                  if (var27 / var20 > Rasterizer3D.method5859()) {
                     int var28 = var25 + (var0.height * -1272589951 * var10 >> 16);
                     int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
                     if (var29 / var20 < Rasterizer3D.method5856()) {
                        int var30 = var19 + (var0.height * -1272589951 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || var0.faceTextures != null;
                        int var34 = UserComparator8.method3943(-898143006);
                        int var35 = HttpMethod.method368(1942381054);
                        boolean var36 = ViewportMouse.ViewportMouse_isInViewport;
                        boolean var38 = WorldMapLabelSize.method7220(var7);
                        boolean var39 = false;
                        if (var38 && var36) {
                           boolean var40 = false;
                           if (Model.field3537) {
                              var40 = WorldMapSection1.method7453(
                                 var0,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 Rasterizer3D.getClipMidX(),
                                 Rasterizer3D.getClipMidY(),
                                 Rasterizer3D.get3dZoom(),
                                 1331036881
                              );
                           } else {
                              int var41 = var18 - var19;
                              if (var41 <= 50) {
                                 var41 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var41;
                              } else {
                                 var23 /= var20;
                                 var22 /= var41;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var41;
                              } else {
                                 var27 /= var20;
                                 var29 /= var41;
                              }

                              int var42 = var34 - Rasterizer3D.getClipMidX();
                              int var43 = var35 - Rasterizer3D.getClipMidY();
                              if (var42 > var22 && var42 < var23 && var43 > var29 && var43 < var27) {
                                 var40 = true;
                              }
                           }

                           if (var40) {
                              if (var0.isSingleTile) {
                                 int var55 = var5 - var0.height * -1272589951 / 2;
                                 int var57 = var6 * var12 - var4 * var11 >> 16;
                                 var57 = var55 * var9 + var57 * var10 >> 16;
                                 int var60 = var57 - var0.diameter;
                                 Varps.method8676(var7, var60, -1143204075);
                              } else {
                                 var39 = true;
                              }
                           }
                        }

                        int var54 = Rasterizer3D.getClipMidX();
                        int var56 = Rasterizer3D.getClipMidY();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = Rasterizer3D.field3038[var1];
                           var61 = Rasterizer3D.field3037[var1];
                        }

                        for (int var44 = 0; var44 < var0.verticesCount; var44++) {
                           float var45 = (int)var0.field3501[var44];
                           float var46 = (int)var0.field3507[var44];
                           float var47 = (int)var0.field3503[var44];
                           if (var1 != 0) {
                              float var48 = var47 * var59 + var45 * var61;
                              var47 = var47 * var61 - var45 * var59;
                              var45 = var48;
                           }

                           var45 += var4;
                           var46 += var5;
                           var47 += var6;
                           float var68 = var47 * var15 + var45 * var16;
                           var47 = var47 * var16 - var45 * var15;
                           float var69 = var46 * var14 - var47 * var13;
                           var47 = var46 * var13 + var47 * var14;
                           var31 |= var0.method6797(var44, var68, var69, var47, var18, var54, var56, var33);
                        }

                        try {
                           var0.draw0(var31, var39, var0.isSingleTile, var7);
                        } catch (Exception var49) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
      this.method10747(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("oi")
   static final void FriendSystem_invalidateIgnoreds(short var0) {
      try {
         classLI.method7184(1141102591);
         if (null != BuddyRankComparator.friendsChat) {
            BuddyRankComparator.friendsChat.invalidateIgnoreds((byte)-18);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tj.oi(" + ')');
      }
   }
}
