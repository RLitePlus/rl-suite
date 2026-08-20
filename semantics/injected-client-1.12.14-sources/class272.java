import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kq")
public class class272 extends AbstractRasterizer {
   @ObfuscatedSignature(descriptor = "(Lkq;[I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("qq")
   public static void method6606(
      class272 var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      if (var0 == null) {
         var0.method6609(var1, var1, var3, var3, var3, var3, var3, var3, var3, var10, var10, var3, var3, var3, var3, var3, var3);
      }

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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - var0.field2854.clipMidY;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (var0.field2853) {
            while (var20-- > 0) {
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               var0.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               method6574(var0, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("ce")
   final void method6582(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method6564(var1, var2, var3, var4, var5, method6556(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("bl")
   static final int method6556(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("di")
   float method6591(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("dr")
   final void method6596(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2854.rasterGouraudLowRes) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2854.clipX == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 65535;
                     var3 = this.field2852[var40];
                     var7 += var8;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & 65535;
                  var3 = this.field2852[var41];

                  do {
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2854.clipX;
               int var43 = 256 - this.field2854.clipX;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & 65535;
                     var3 = this.field2852[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 65535;
                  var3 = this.field2852[var44];
                  var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

                  do {
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2854.clipX == 0) {
               do {
                  this.method6585(var1, Rasterizer2D_brightness, ++var2, (int)var7 & 65535, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2854.clipX;
               int var12 = 256 - this.field2854.clipX;

               do {
                  this.method6589(var1, Rasterizer2D_brightness, ++var2, (int)var7 & 65535, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("br")
   @Override
   void vmethod228(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2854.Rasterizer3D_rowOffsets;
         int var34 = this.field2854.field3460;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = method6592(this, var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = method6592(this, var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = method6592(this, var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bd")
   @Override
   void vmethod227(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2854.Rasterizer3D_rowOffsets;
         int var34 = this.field2854.field3460;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = method6592(this, var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = method6592(this, var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = method6592(this, var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("cu")
   final void method6585(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method6564(var1, var2, var3, this.field2852[var4], var5, method6556(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("ct")
   final void method6586(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = this.field2854.field3434 & method6556(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIIF)V")
   @ObfuscatedName("cm")
   final void method6589(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = this.field2852[var4];
      var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var10 = this.field2854.field3434 & method6556(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[FIIFI)V")
   @ObfuscatedName("pm")
   public static void method6561(class272 var0, int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = var0.field2854.field3434 & var6;
      int var8 = var0.field2854.field3438 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bs")
   @Override
   boolean vmethod211() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("cg")
   static final int method6557(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ay")
   @Override
   void drawAlphaBlendedGraphics(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   ) {
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2854.Rasterizer3D_rowOffsets;
            int var44 = this.field2854.field3460;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = method6592(this, var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = method6592(this, var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = method6592(this, var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("ck")
   final void method6597(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2854.rasterGouraudLowRes) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2854.clipX == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 65535;
                     var3 = this.field2852[var40];
                     var7 += var8;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & 65535;
                  var3 = this.field2852[var41];

                  do {
                     this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2854.clipX;
               int var43 = 256 - this.field2854.clipX;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & 65535;
                     var3 = this.field2852[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 65535;
                  var3 = this.field2852[var44];
                  var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

                  do {
                     this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2854.clipX == 0) {
               do {
                  this.method6585(var1, Rasterizer2D_brightness, ++var2, (int)var7 & 65535, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2854.clipX;
               int var12 = 256 - this.field2854.clipX;

               do {
                  this.method6589(var1, Rasterizer2D_brightness, ++var2, (int)var7 & 65535, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("au")
   @Override
   void vmethod214(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2854.Rasterizer3D_rowOffsets;
         int var34 = this.field2854.field3460;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = method6592(this, var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = method6592(this, var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = method6592(this, var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   @Override
   boolean vmethod222() {
      return true;
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)11);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 422964472);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var24,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkq;[I[F[IIIIF)V")
   @ObfuscatedName("kg")
   public static void method6574(class272 var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      if (var0 == null) {
         var0.method6577(var1, var2, var1, var4, var4, var4, var7);
      } else {
         int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
         if (var8 != 0) {
            var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
            var0.method6564(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkq;FFFFF)F")
   @ObfuscatedName("wz")
   public static float method6592(class272 var0, float var1, float var2, float var3, float var4, float var5) {
      if (var0 == null) {
         var0.method6595(var1, var1, var1, var1, var1);
      }

      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("cs")
   final void method6602(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = 16256;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX != 0) {
               int var27 = this.field2854.clipX;
               int var28 = 256 - this.field2854.clipX;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (this.field2854.clipX != 0) {
            int var149 = this.field2854.clipX;
            int var150 = 256 - this.field2854.clipX;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)71);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1755102836);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var24,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
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
      return true;
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("dt")
   final void method6587(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = this.field2854.field3434 & method6556(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bm")
   @Override
   void vmethod215(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2854.Rasterizer3D_rowOffsets;
            int var44 = this.field2854.field3460;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = method6592(this, var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = method6592(this, var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = method6592(this, var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
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
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2854.Rasterizer3D_rowOffsets;
            int var44 = this.field2854.field3460;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = method6592(this, var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                        }

                        while (--var17 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += Rasterizer2D_width;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = method6592(this, var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                        }

                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method6597(Rasterizer2D_pixels, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += Rasterizer2D_width;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = method6592(this, var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method6597(Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += Rasterizer2D_width;
                        var9 += var39;
                     }
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)24);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 331189815);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)104);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, -214218200);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[F[IIIIIF)V")
   @ObfuscatedName("yp")
   public static void method6578(class272 var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      if (var0 == null) {
         var0.method6594(var8, var8, var8, var8, var8);
      }

      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = var0.field2854.field3434 & method6556(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)95);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, -90789864);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)16);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1341024464);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)81);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 35044165);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var24,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("cc")
   final void copyPixelsWithAlphaBlending(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2854.clipX != 0) {
            if (this.field2854.clipX == 254) {
               if (var5 == 0 || var6 > this.field2854.clipNegativeMidX - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2854.clipX;
               int var10 = 256 - this.field2854.clipX;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)73);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1214985807);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var152,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var151,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var24,
                                 (int)var81,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              method6606(
                                 this,
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var81,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var145,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var83,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           method6606(
                              this,
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var83,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("dd")
   final void method6579(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bh")
   @Override
   void vmethod218(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2854.Rasterizer3D_rowOffsets;
         int var34 = this.field2854.field3460;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = method6592(this, var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += Rasterizer2D_width;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                     }

                     while (--var15 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += Rasterizer2D_width;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = method6592(this, var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += Rasterizer2D_width;
                     }

                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += Rasterizer2D_width;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = method6592(this, var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.copyPixelsWithAlphaBlending(Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += Rasterizer2D_width;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("co")
   static final int method6558(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> -844715554;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("cx")
   static final int method6559(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   class272(Clips var1) {
      super(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[F[IIIIF)V")
   @ObfuscatedName("ln")
   public static void method6575(class272 var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      if (var0 == null) {
         var0.vmethod211();
      }

      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      if (var8 != 0) {
         var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
         var0.method6564(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("dy")
   final void method6583(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method6564(var1, var2, var3, var4, var5, method6556(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cf")
   final void method6562(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2854.field3434 & var6;
      int var8 = this.field2854.field3438 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cz")
   final void method6563(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2854.field3434 & var6;
      int var8 = this.field2854.field3438 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("cq")
   final void method6566(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
      this.method6564(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("cv")
   final void method6568(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
      int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("cp")
   static final int method6560(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("dp")
   final void method6603(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = -933528286;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = 16256;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX != 0) {
               int var27 = this.field2854.clipX;
               int var28 = 256 - this.field2854.clipX;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > -477234423) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > -727400006) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (this.field2854.clipX != 0) {
            int var149 = this.field2854.clipX;
            int var150 = 556120069 - this.field2854.clipX;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 1919769371;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("cj")
   final void method6569(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
      int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("cl")
   final void method6576(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      if (var8 != 0) {
         var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
         this.method6564(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)85);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1371173098);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkq;[I[F[IIIIIF)V")
   @ObfuscatedName("kz")
   public static void method6570(class272 var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      if (var0 == null) {
         var0.method6573(var1, var2, var1, var4, var4, var4, var4, var8);
      }

      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
      int var11 = var0.field2854.field3434 & method6556(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("dw")
   final void method6580(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("du")
   final void method6599(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2854.clipX != 0) {
            if (this.field2854.clipX == 254) {
               if (var5 == 0 || var6 > this.field2854.clipNegativeMidX - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2854.clipX;
               int var10 = 256 - this.field2854.clipX;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("df")
   final void method6584(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method6564(var1, var2, var3, var4, var5, method6556(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("db")
   final void method6588(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & -892061675) * var5 >> 8 & 0xFF00);
      int var8 = this.field2854.field3434 & method6556(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("bq")
   final void method6567(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
      this.method6564(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIIF)V")
   @ObfuscatedName("dh")
   final void method6590(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = this.field2852[var4];
      var8 = ((var8 & 16711935) * var6 >> 8 & 554427064) + ((var8 & 0xFF00) * var6 >> 8 & -24190912);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 318621937) * var5 >> 8 & 16711935) + ((var9 & -827327062) * var5 >> 8 & 0xFF00);
      int var10 = this.field2854.field3434 & method6556(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("dz")
   float method6593(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("de")
   final void method6607(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            while (var20-- > 0) {
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("dl")
   float method6594(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("dg")
   final void method6604(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = 16256;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX != 0) {
               int var27 = this.field2854.clipX;
               int var28 = -915502765 - this.field2854.clipX;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = -1503148073;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 1340967098) {
                        var23 = -788098689;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (this.field2854.clipX != 0) {
            int var149 = this.field2854.clipX;
            int var150 = 256 - this.field2854.clipX;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > -2014977717) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("dx")
   final void method6600(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2854.clipping) {
         if (var6 > this.field2854.clipNegativeMidX) {
            var6 = this.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2854.clipX != 0) {
            if (this.field2854.clipX == 1158501481) {
               if (var5 == 0 || var6 > this.field2854.clipNegativeMidX - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  this.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2854.clipX;
               int var10 = 256 - this.field2854.clipX;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  this.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               this.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[F[IIIIIF)V")
   @ObfuscatedName("nd")
   public static void method6571(class272 var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      if (var0 == null) {
         var0.method6587(var1, var2, var4, var4, var4, var8);
      } else {
         int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = var0.field2854.field3434 & method6556(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
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
      int[] var23 = this.field2854.Rasterizer3D_textureLoader.getTexturePixels(var22, (byte)94);
      if (var23 == null) {
         int var79 = this.field2854.Rasterizer3D_textureLoader.getAverageTextureRGB(var22, 1920543397);
         this.drawAlphaBlendedGraphics(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, method5424(var79, var10), method5424(var79, var11), method5424(var79, var12)
         );
      } else {
         this.field2853 = this.field2854.Rasterizer3D_textureLoader.isLowDetail(var22, -28511821);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2854.zoom;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2854.Rasterizer3D_rowOffsets;
               int var62 = this.field2854.field3460;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = method6592(this, var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var150,
                                 (int)var25,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var149,
                                 (int)var26,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2854.clipCenterX;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var25,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var148,
                                 (int)var24,
                                 (int)var26,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var25,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var147,
                                 (int)var26,
                                 (int)var24,
                                 var10,
                                 var37,
                                 var7,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = method6592(this, var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var146,
                                 (int)var26,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var145,
                                 (int)var24,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2854.clipCenterX;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var26,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var24,
                                 (int)var25,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var26,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method6602(
                                 Rasterizer2D_pixels,
                                 var23,
                                 0,
                                 0,
                                 var144,
                                 (int)var25,
                                 (int)var24,
                                 var11,
                                 var37,
                                 var8,
                                 var46,
                                 var52,
                                 var55,
                                 var58,
                                 var53,
                                 var56,
                                 var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += Rasterizer2D_width;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = method6592(this, var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var25,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var143,
                              (int)var24,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2854.clipCenterX;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var24,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var25,
                              (int)var26,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var24,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method6602(
                              Rasterizer2D_pixels,
                              var23,
                              0,
                              0,
                              var64,
                              (int)var26,
                              (int)var25,
                              var12,
                              var37,
                              var9,
                              var46,
                              var52,
                              var55,
                              var58,
                              var53,
                              var56,
                              var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += Rasterizer2D_width;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("ci")
   final void method6564(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2854.field3434 & var6;
      int var8 = this.field2854.field3438 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("dm")
   final void method6605(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = 16256;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            if (this.field2854.clipX != 0) {
               int var27 = this.field2854.clipX;
               int var28 = 256 - this.field2854.clipX;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method6570(this, var1, Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (this.field2854.clipX != 0) {
            int var149 = this.field2854.clipX;
            int var150 = 256 - this.field2854.clipX;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               this.method6581(var1, Rasterizer2D_brightness, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("cw")
   final void method6572(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 413317114) * var6 & -845103063 | (var9 & 0xFF00) * var6 & -1740680756) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -1435459290 | (var10 & 677238342) * var5 & 0xFF0000) >> 8;
      int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("ch")
   final void method6581(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = this.field2854.field3434 & method6556(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("ds")
   final void method6608(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.clipMidY;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            while (var20-- > 0) {
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("bx")
   final void method6573(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
      int var11 = this.field2854.clipY & method6557(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("bv")
   final void method6577(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      if (var8 != 0) {
         var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
         this.method6563(var1, var2, var4, var8, var7, method6556(var2[var4], var7));
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("cn")
   final void method6609(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      if (this.field2854.clipping) {
         if (var7 > this.field2854.clipCenterX) {
            var7 = this.field2854.field3434;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2854.field3438;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2853) {
            while (var20-- > 0) {
               this.method6576(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6566(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6576(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6577(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6566(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6567(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method6576(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               this.method6566(var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               method6574(this, var1, Rasterizer2D_brightness, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("bc")
   final void method6565(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2854.clipX & var6;
      int var8 = this.field2854.clipX & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[IIIIIIFF)V")
   @ObfuscatedName("yb")
   public static void method6601(class272 var0, int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (var0.field2854.clipping) {
         if (var6 > var0.field2854.clipNegativeMidX) {
            var6 = var0.field2854.clipNegativeMidX;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (var0.field2854.clipX != 0) {
            if (var0.field2854.clipX == 254) {
               if (var5 == 0 || var6 > var0.field2854.clipNegativeMidX - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  var0.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  var0.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  var0.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  var0.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  var0.method6586(var1, Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = var0.field2854.clipX;
               int var10 = 256 - var0.field2854.clipX;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & -994436266) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  var0.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  var0.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  var0.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
                  var0.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  var0.method6586(var1, Rasterizer2D_brightness, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               var0.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               var0.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               var0.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
               var0.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               var0.method6582(var1, Rasterizer2D_brightness, ++var2, var3, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("cb")
   float method6595(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }
}
