import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kp")
public class class270 extends AbstractRasterizer {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkp;[IIIIII)V")
   @ObfuscatedName("qd")
   public static void method6545(class270 var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0.field2854.clipping) {
         if (var6 > var0.field2854.clipNegativeMidX) {
            var6 = var0.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (var0.field2854.clipX != 0) {
            if (var0.field2854.clipX == 254) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = var0.field2854.clipX;
               int var8 = 256 - var0.field2854.clipX;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("by")
   @Override
   void vmethod221(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)77);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1923657991);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bs")
   @Override
   boolean vmethod211() {
      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkp;[I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("hi")
   public static void method6548(
      class270 var0,
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (var0.field2854.clipping) {
         if (var7 > var0.field2854.clipNegativeMidX) {
            var7 = var0.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - var0.field2854.clipMidY;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = -2137433359;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > -386289967) {
               var21 = -98007592;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (var0.field2853) {
            if (var0.field2854.clipX == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 2076333311) * var16 & 1637520511) + ((var4 & 249196703) * var16 & 407769344) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 975286425) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 158961054) * var16 & 289358609) + ((var4 & 664641849) * var16 & 741944944) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 2020247533) * var16 & 912642187) + ((var4 & 0xFF00) * var16 & -237168068) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 75068260) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 861586125) * var16 & 411962304) + ((var4 & -1354445804) * var16 & 740376357) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -946123083) * var16 & -16711936) + ((var4 & 1683367791) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1618131234) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1287019475) + ((var4 & 1491603125) * var16 & 859606324) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 489768853) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1817014127) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -828301666) >> 8;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 84756854;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 2034442579) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -2065078310) >> 8;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = var0.field2854.clipX;
               int var26 = 604962611 - var0.field2854.clipX;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 315512872) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & 755195102 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 2094821518) + (var3 >>> 25)];
                     var4 = ((var4 & 522955128) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 1303235730) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -315409011) * var25 & -1646248758 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -1804550029) + (var3 >>> 25)];
                     var4 = ((var4 & -1575663177) * var27 & -156499747 | (var4 & 0xFF00) * var27 & -1202214667) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 2011667416) * var25 & -16711936 | (var28 & 1016514746) * var25 & 1822090159) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -2002728871) + (var3 >>> 25)];
                     var4 = ((var4 & 251649186) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 664213041) * var25 & 768092896 | (var28 & 0xFF00) * var25 & -801888845) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & 656918231 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -83646855 | (var28 & 1689449735) * var25 & -1356194880) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 715243005) * var27 & -1485846915 | (var4 & 670988277) * var27 & 1757823235) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & -701604135) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & 1101223915 | (var4 & 0xFF00) * var27 & 1468820241) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 1075360993) * var25 & 300674973 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -1155965319) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -1674623387 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -453779241) * var25 & -16711936 | (var28 & -1172858924) * var25 & -1068564927) >> 8);
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > -1201746376) {
                           var21 = -57725685;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 1669607264) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 1797140195) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 1097771048) >> 8);
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (var0.field2854.clipX == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -661857948) + ((var4 & 0xFF00) * var16 & -707137483) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 138470514) + ((var4 & 0xFF00) * var16 & -2114329963) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 744980376) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 839239702) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 1197208980) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -1334965400) * var16 & 1059077577) + ((var4 & 0xFF00) * var16 & 285825448) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1501215259) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1868253808) * var16 & -1536008955) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -594660318) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 789942772) + ((var4 & 0xFF00) * var16 & -1639433704) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -2099284693) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1549244587) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 520773232) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 333907360) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = var0.field2854.clipX;
            int var174 = -150474372 - var0.field2854.clipX;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1397658742 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 748649550) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 275972308 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -1638219822) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1025365697 | (var4 & 2052225410) * var175 & 0xFF0000) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & -1756977380) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1174740148) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -1870226963) * var175 & -859748592 | (var4 & 0xFF00) * var175 & 1655128420) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 257146199) * var175 & 521045161) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & -789096555 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 1691022711) * var175 & -1667988713 | (var4 & 1924308323) * var175 & -854944346) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & -782726889) * var173 & -16711936 | (var189 & 597235030) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -52185206) * var175 & -16711936 | (var4 & -300848851) * var175 & 1542892344) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & -2126812335) * var173 & -16711936 | (var190 & 0xFF00) * var173 & -1350626632) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -713736296) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 1092618047 | (var4 & 597347162) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & -1022246581) * var173 & -1671956822 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 1978788150;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -978419168) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -136133074) * var175 & -903423897 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ay")
   @Override
   void drawAlphaBlendedGraphics(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   ) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2854.Rasterizer3D_rowOffsets;
         int var32 = this.field2854.field3460;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bl")
   final void Rasterizer3D_vertAlpha(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2854.rasterGouraudLowRes) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2854.clipX == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2852[var35];
                     var7 += var8;
                     client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
                     client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
                     client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
                     client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var36];

                  do {
                     client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2854.clipX;
               int var38 = 256 - this.field2854.clipX;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2852[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     client.method2488(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2854.clipX
                     );
                     var41 = var1[var2];
                     client.method2488(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2854.clipX
                     );
                     var41 = var1[var2];
                     client.method2488(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2854.clipX
                     );
                     var41 = var1[var2];
                     client.method2488(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2854.clipX
                     );
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     client.method2488(
                        var1,
                        var2++,
                        var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2854.clipX
                     );
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2854.clipX == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  client.method2488(var1, var2++, this.field2852[var9], 255 - super.field2854.clipX);
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2854.clipX;
               int var10 = 256 - this.field2854.clipX;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("au")
   @Override
   void vmethod214(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2854.Rasterizer3D_rowOffsets;
      int var21 = this.field2854.field3460;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bd")
   @Override
   void vmethod227(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2854.Rasterizer3D_rowOffsets;
      int var21 = this.field2854.field3460;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cc")
   void method6553(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("bx")
   void drawPixels(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ba")
   @Override
   void vmethod223(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)19);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1660644505);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ad")
   @Override
   void textureMapPolygons(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)111);
      if (var23 == null) {
         int var71 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1518678867);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var71, var10), method5424(var71, var11), method5424(var71, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            int var54 = this.field2854.clipCenterX;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   @Override
   boolean vmethod219() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   @Override
   boolean vmethod222() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bm")
   @Override
   void vmethod215(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2854.Rasterizer3D_rowOffsets;
         int var32 = this.field2854.field3460;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bp")
   @Override
   void vmethod220(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2854.Rasterizer3D_rowOffsets;
         int var32 = this.field2854.field3460;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += Rasterizer2D_width) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += Rasterizer2D_width) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.Rasterizer3D_vertAlpha(Rasterizer2D_pixels, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += Rasterizer2D_width;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bt")
   @Override
   void vmethod217(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)57);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 243154022);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bu")
   @Override
   void vmethod212(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)21);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 362713744);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cs")
   void method6555(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & -74255100) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -15251053) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 1765187091) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -341559496) + ((var4 & -1652344652) * var16 & -23671214) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & -2013553592) * var16 & -1422893485) + ((var4 & -1014751672) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 303642627) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 1839017554) * var16 & -2045502097) + ((var4 & 0xFF00) * var16 & 155534531) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & -1361679169) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & 1344423697) + ((var4 & -2026855893) * var16 & -1759247401) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 162099345) * var16 & -16711936) + ((var4 & 2031149081) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1672345400) * var16 & -1379709378) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -1397413140) + ((var4 & 0xFF00) * var16 & -108961183) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 113234563) * var16 & -329532484) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 2114842830) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -1300194271) * var16 & -713016617) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -1999218054) * var16 & 1603355779) + ((var4 & 353062049) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1928252260) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 614198893) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -1842574358) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 36969249) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 1959864652) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 380196765) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -534453280) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -193858739) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -123837417) + ((var4 & -442872457) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   class270(Clips var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cb")
   void method6549(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 605282659) {
               var19 = 1524462362;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > -452729304) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -1029022265) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -751274719) * var16 & 1962177655) + ((var4 & -1322951221) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1951925994) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 65762883) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1620003596) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 770006480) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 975699003) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -430603650) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -209302398) * var16 & -16711936) + ((var4 & -71399617) * var16 & -1054917781) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -787361277) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -847565188) * var16 & -16711936) + ((var4 & 1621004752) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 694203929) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -694549803) * var16 & -92822307) + ((var4 & 1768100509) * var16 & -910224495) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1802585830) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1674454044) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > -627593834) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -774106772) >> 8;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2854.clipX;
               int var26 = -1355221700 - this.field2854.clipX;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -886387399) + (var3 >>> 25)];
                     var4 = ((var4 & -154525684) * var27 & -16711936 | (var4 & 131518065) * var27 & 0xFF0000) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 2037678019) * var25 & -16711936 | (var28 & -1284543262) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 1933780220) * var27 & -16711936 | (var4 & -2136435747) * var27 & -1618955748) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1656578879) * var25 & -735477726 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -1324570538 | (var4 & -2006837376) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -853700116) * var25 & 289773733 | (var28 & 321362851) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -3479055) + (var3 >>> 25)];
                     var4 = ((var4 & -1846714584) * var27 & -16711936 | (var4 & 0xFF00) * var27 & -2029908214) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & 1604449564 | (var28 & 0xFF00) * var25 & -342742514) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 807411569) * var27 & -16711936 | (var4 & -2087029858) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & -1798130170) * var25 & -1553541708) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -585342994) + (var3 >>> 25)];
                     var4 = ((var4 & -1561054615) * var27 & -494819789 | (var4 & 0xFF00) * var27 & -618423356) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1788141793) * var25 & 955183358 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & -1665733401) * var27 & -1845642859 | (var4 & 0xFF00) * var27 & 2141824586) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 2119773037) * var25 & -1201442817 | (var28 & 1424691936) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -720817650) + (var3 >>> 25)];
                     var4 = ((var4 & 49906624) * var27 & 857871303 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 1247114700) * var25 & -1764512431 | (var28 & 0xFF00) * var25 & 346259814) >> 8);
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > -1476725356) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 1501531753) * var27 & -1802254712 | (var4 & 0xFF00) * var27 & 897011833) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & 1617383755 | (var183 & 1374221218) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2854.clipX == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -1407741619) + ((var4 & 0xFF00) * var16 & -1477511578) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -88296701) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 805532380) * var16 & -16711936) + ((var4 & -461598690) * var16 & 976590501) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1101133535) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1156643318) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -443192518) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -121560253) * var16 & 1598386947) + ((var4 & -1302871922) * var16 & 318494866) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 28786609) * var16 & -1142460484) + ((var4 & -1075729542) * var16 & -2032769888) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 593922879) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 242498932) * var16 & -16711936) + ((var4 & 667782112) * var16 & -89327974) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1651500149) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 1697280452) + ((var4 & 1099330306) * var16 & 551221051) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > -2052093151) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 537362239) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2854.clipX;
            int var174 = 256 - this.field2854.clipX;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -777464726) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -1838014710) * var175 & -16711936 | (var4 & 0xFF00) * var175 & -476635727) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 910581538) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 184995152 | (var4 & 961700170) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 1505950645) * var173 & -714851162 | (var185 & 1455034476) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -1734359130) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -2112977264) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 445821447) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & 188310011 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -59911177) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 1399230869 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 2108771730) * var173 & -16711936 | (var187 & 0xFF00) * var173 & -284286777) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -1884487699) * var175 & -16711936 | (var4 & -1066987415) * var175 & -713189680) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 229701897) * var173 & -16711936 | (var188 & -1283556523) * var173 & 1756701914) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -655133081) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 1279416657) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 607437069) * var173 & 1998373598 | (var189 & 0xFF00) * var173 & 1941648105) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 1552565375) * var175 & 1810091957) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -267289704 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1616286426) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & -952783118) * var175 & 272056734 | (var4 & -1649810024) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & -1489968139) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 1401289844) {
                        var21 = 228856702;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -230678783) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1124109854 | (var4 & 0xFF00) * var175 & 362915568) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & -1868777181) * var173 & -16711936 | (var192 & -1332123613) * var173 & 1166446842) >> 8);
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bi")
   @Override
   void vmethod229(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)32);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1725407714);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bf")
   @Override
   void vmethod225(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)77);
      if (var23 == null) {
         int var71 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1958206430);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var71, var10), method5424(var71, var11), method5424(var71, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            int var54 = this.field2854.clipCenterX;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bn")
   @Override
   void vmethod226(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)68);
      if (var23 == null) {
         int var71 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 978837983);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var71, var10), method5424(var71, var11), method5424(var71, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            int var54 = this.field2854.clipCenterX;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("bc")
   void applyColorFilterToPixelsInRange(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2854.clipX != 0) {
            if (this.field2854.clipX == 254) {
               while (--var4 >= 0) {
                  client.method2488(var1, var2++, var1[var2], 255 - super.field2854.clipX);
                  client.method2488(var1, var2++, var1[var2], 255 - super.field2854.clipX);
                  client.method2488(var1, var2++, var1[var2], 255 - super.field2854.clipX);
                  client.method2488(var1, var2++, var1[var2], 255 - super.field2854.clipX);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  client.method2488(var1, var2++, var1[var2], 255 - super.field2854.clipX);
               }
            } else {
               int var7 = this.field2854.clipX;
               int var8 = 256 - this.field2854.clipX;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
                  var9 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
                  var9 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
                  var9 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  client.method2488(
                     var1, var2++, var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2854.clipX
                  );
               }
            }
         } else {
            while (--var4 >= 0) {
               client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
               client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
               client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
               client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               client.method2488(var1, var2++, var3, 255 - super.field2854.clipX);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("ch")
   final void method6543(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2854.rasterGouraudLowRes) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2854.clipX == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2852[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2854.clipX;
               int var38 = 256 - this.field2854.clipX;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2852[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2854.clipX == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  var1[var2++] = this.field2852[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2854.clipX;
               int var10 = 256 - this.field2854.clipX;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2852[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("az")
   @Override
   void drawGradientTriangle(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)13);
      if (var23 == null) {
         int var70 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, -78847819);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var70, var10), method5424(var70, var11), method5424(var70, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2854.clipCenterX;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2854.clipCenterX;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.processPixelsToArray(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2854.clipCenterX;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.processPixelsToArray(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkp;[IIIIII)V")
   @ObfuscatedName("pc")
   public static void method6547(class270 var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0.field2854.clipping) {
         if (var6 > var0.field2854.clipNegativeMidX) {
            var6 = var0.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (var0.field2854.clipX != 0) {
            if (var0.field2854.clipX == -1002917297) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = var0.field2854.clipX;
               int var8 = 256 - var0.field2854.clipX;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 2093522913) * var8 >> 8 & 1057176977);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 112688191) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & -550154791);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & -1095262480) * var7 >> 8 & 16711935) + ((var9 & -4634793) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 1082059863);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 1362068313) * var7 >> 8 & 16711935) + ((var28 & -1674916230) * var7 >> 8 & 0xFF00);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("br")
   @Override
   void vmethod228(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2854.Rasterizer3D_rowOffsets;
      int var21 = this.field2854.field3460;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bh")
   @Override
   void vmethod218(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2854.Rasterizer3D_rowOffsets;
      int var21 = this.field2854.field3460;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += Rasterizer2D_width;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += Rasterizer2D_width;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += Rasterizer2D_width) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += Rasterizer2D_width;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += Rasterizer2D_width) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.applyColorFilterToPixelsInRange(Rasterizer2D_pixels, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += Rasterizer2D_width;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cm")
   void method6550(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2854.clipX;
               int var26 = 256 - this.field2854.clipX;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2854.clipX == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2854.clipX;
            int var174 = 256 - this.field2854.clipX;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bw")
   @Override
   void vmethod224(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   ) {
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)114);
      if (var23 == null) {
         int var71 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 670987871);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var71, var10), method5424(var71, var11), method5424(var71, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2854.zoom;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2854.Rasterizer3D_rowOffsets;
            int var53 = this.field2854.field3460;
            int var54 = this.field2854.clipCenterX;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.drawPixels(
                              Rasterizer2D_pixels, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50
                           );
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += Rasterizer2D_width;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.drawPixels(
                           Rasterizer2D_pixels, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50
                        );
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += Rasterizer2D_width;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("ck")
   void method6551(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > -1146358431) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -1741083086) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 548775221) * var16 & 398509898) + ((var4 & -1332655350) * var16 & 648921531) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1524149717) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1464307240) * var16 & -16711936) + ((var4 & -777513786) * var16 & -554426460) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -819493086) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1220802238) * var16 & -113028457) + ((var4 & 0xFF00) * var16 & 742654880) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1292554875) + ((var4 & 0xFF00) * var16 & -99779069) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1077268154) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -497550644) + ((var4 & -1574592765) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -164280174) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -578068822) * var16 & -501595508) + ((var4 & -1002683571) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -330400332) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 1335933959) {
                           var21 = -1392267924;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -1973431052) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2854.clipX;
               int var26 = 2114604387 - this.field2854.clipX;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 927911497) * var27 & -16711936 | (var4 & 0xFF00) * var27 & -517470989) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & 340057965 | (var28 & 1116873390) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 1917355061) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 1664606774) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 1396790002) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 1163487546) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -1077231807 | (var4 & 0xFF00) * var27 & 965828069) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1929797116) * var25 & -1520613168 | (var28 & 0xFF00) * var25 & -411880768) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & -2122595210) + (var3 >>> 25)];
                     var4 = ((var4 & 944157340) * var27 & -16711936 | (var4 & -1627971493) * var27 & 707836738) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1032177852) * var25 & -1015126626 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & -1531705158) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 112538711) * var25 & -16711936 | (var28 & -277456150) * var25 & -2000427749) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 687864457) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & 1806349259 | (var4 & -1524715792) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1362227571) * var25 & -2015441698 | (var28 & 0xFF00) * var25 & -1232999466) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -625551650 | (var4 & -438410970) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & -1909535279) * var25 & 1633734551 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 351557956) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & 1624949776 | (var28 & -589622585) * var25 & -1212828111) >> 8);
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -1068154575) + (var3 >>> 25)];
                     var4 = ((var4 & -192245445) * var27 & 541801624 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & -781010031) * var25 & 16329183) >> 8);
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2854.clipX == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 384284183) * var16 & 1032572941) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -2058311706) + ((var4 & 0xFF00) * var16 & -1125989502) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -1747083141) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -42406741) * var16 & -16711936) + ((var4 & 1214186338) * var16 & -317773541) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 22379222) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1867594449) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 1281042703) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -1152310472) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -770893935) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -607413089) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1926198402) * var16 & -1240504853) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 1675121599) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -1676153645) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 1253966292) + ((var4 & 912666766) * var16 & 998358652) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2854.clipX;
            int var174 = -1355038126 - this.field2854.clipX;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 42652850) * var175 & 696404344 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & -547522266) * var173 & -1685058657) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1756254487 | (var4 & 0xFF00) * var175 & 1732951115) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 1813377969) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -241121119) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 1821309844) * var175 & 108013318 | (var4 & 2137689568) * var175 & 1819747736) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -1845768044 | (var186 & 1209136357) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 138623056) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 1782741228) * var175 & -16711936 | (var4 & 131716997) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & 1204328279 | (var187 & -2107707654) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -1777163144) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1573587645 | (var4 & 0xFF00) * var175 & -500944825) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & 826792865 | (var188 & -459449496) * var173 & -94442870) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -538884700) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 1413699920 | (var4 & 1911332202) * var175 & -291512236) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 348749239) * var173 & -837328316 | (var189 & -2041830328) * var173 & 437452227) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -491560418) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 238576481) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -358734540 | (var190 & 1763374100) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1911085694) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & 869773227 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & -590508064) * var173 & -16711936 | (var191 & 0xFF00) * var173 & -2025965599) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = -1442847158;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & -157715598) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -1112704888 | (var4 & 2068778664) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & -562725217) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bv")
   final void method6544(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2854.rasterGouraudLowRes) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2854.clipX == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> -551120262)) >> 8;
                     var3 = this.field2852[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 1245359920)) >> 8;
                  var3 = this.field2852[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2854.clipX;
               int var38 = 1715208732 - this.field2854.clipX;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2852[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & -1693799268) + ((var3 & -83030991) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & -10939576) + ((var41 & 0xFF00) * var37 >> 8 & -1987577570);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & -1880559591) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 1553542667) + ((var41 & 0xFF00) * var37 >> 8 & 1473392932);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 1529282767) + ((var41 & -1625527799) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> -285105616)) >> 8;
                  var3 = this.field2852[var40];
                  var3 = ((var3 & 218086484) * var38 >> 8 & 16711935) + ((var3 & -1318093152) * var38 >> 8 & 1989253639);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 1926992632) * var37 >> 8 & -869333723) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2854.clipX == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> -1445000592)) >> 8;
                  var1[var2++] = this.field2852[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2854.clipX;
               int var10 = 607285109 - this.field2854.clipX;

               do {
                  int var11 = (var7 & ~(var7 >> -404604967)) >> 8;
                  var3 = this.field2852[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & -1139149947) + ((var3 & 1768323994) * var10 >> 8 & 608137439);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & -1048857889) * var34 >> 8 & -704320560) + ((var12 & -990671344) * var34 >> 8 & -886721357);
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("bq")
   void processPixelsToArray(
      int[] var1,
      int[] var2,
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
      int var15
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipNegativeMidX) {
            var7 = this.field2854.clipNegativeMidX;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2854.clipMidY;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2854.clipX;
               int var26 = 256 - this.field2854.clipX;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2854.clipX == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2854.clipX;
            int var174 = 256 - this.field2854.clipX;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }
}
