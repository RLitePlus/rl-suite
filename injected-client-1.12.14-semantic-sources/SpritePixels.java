import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xt")
public final class SpritePixels extends Rasterizer2D implements net.runelite.api.SpritePixels {
   @ObfuscatedName("ak")
   public int subWidth;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6625 = 15;
   @ObfuscatedName("aj")
   public int[] pixels;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6623 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6622 = 4095;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field6624 = 12;
   @ObfuscatedName("ap")
   public int xOffset;
   @ObfuscatedName("aw")
   public int subHeight;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6626 = 4;
   @ObfuscatedName("ay")
   int yOffset;
   @ObfuscatedName("au")
   public int width;
   @ObfuscatedName("az")
   public int height;

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("az")
   public SpritePixels method12613() {
      SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight);
      var1.width = this.width;
      var1.height = this.height;
      var1.xOffset = this.xOffset;
      var1.yOffset = this.yOffset;
      int var2 = this.pixels.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.pixels[var3] = this.pixels[var3];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ef")
   public void method12698() {
      method12620(this);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("be")
   public void method12663(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method12596(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method12600(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("bb")
   void method12687(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.xOffset << 4;
         var2 -= this.yOffset << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.subWidth << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.subWidth << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.subHeight << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var17 = ((this.subWidth << 4) - var1) * var10 + ((this.subHeight << 4) - var2) * var9;
         int var18 = -((this.subWidth << 4) - var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Rasterizer2D_xClipStart) {
            var19 = Rasterizer2D_xClipStart;
         }

         if (var20 > Rasterizer2D_xClipEnd) {
            var20 = Rasterizer2D_xClipEnd;
         }

         if (var21 < Rasterizer2D_yClipStart) {
            var21 = Rasterizer2D_yClipStart;
         }

         if (var22 > Rasterizer2D_yClipEnd) {
            var22 = Rasterizer2D_yClipEnd;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Rasterizer2D_width + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += Rasterizer2D_width) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.pixels[(var36 >> 12) * this.subWidth + (var35 >> 12)];
                              if (var38 != 0) {
                                 Rasterizer2D_pixels[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += Rasterizer2D_width) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.subHeight << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.pixels[(var108 >> 12) * this.subWidth + (var100 >> 12)];
                              if (var124 != 0) {
                                 Rasterizer2D_pixels[var92++] = var124;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += Rasterizer2D_width) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.subHeight << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.pixels[(var109 >> 12) * this.subWidth + (var101 >> 12)];
                              if (var125 != 0) {
                                 Rasterizer2D_pixels[var93++] = var125;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += Rasterizer2D_width) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.subWidth << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.pixels[(var110 >> 12) * this.subWidth + (var102 >> 12)];
                              if (var126 != 0) {
                                 Rasterizer2D_pixels[var94++] = var126;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += Rasterizer2D_width) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.subWidth << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.subHeight << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = this.pixels[(var111 >> 12) * this.subWidth + (var103 >> 12)];
                           if (var127 != 0) {
                              Rasterizer2D_pixels[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += Rasterizer2D_width) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.subWidth << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (this.subHeight << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.pixels[(var112 >> 12) * this.subWidth + (var104 >> 12)];
                           if (var128 != 0) {
                              Rasterizer2D_pixels[var96++] = var128;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += Rasterizer2D_width) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.subWidth << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.pixels[(var113 >> 12) * this.subWidth + (var105 >> 12)];
                           if (var129 != 0) {
                              Rasterizer2D_pixels[var97++] = var129;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += Rasterizer2D_width) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (this.subWidth << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.subHeight << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = this.pixels[(var114 >> 12) * this.subWidth + (var106 >> 12)];
                        if (var130 != 0) {
                           Rasterizer2D_pixels[var98++] = var130;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += Rasterizer2D_width) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (this.subWidth << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.subHeight << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.pixels[(var115 >> 12) * this.subWidth + (var107 >> 12)];
                        if (var131 != 0) {
                           Rasterizer2D_pixels[var99++] = var131;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIII)V")
   @ObfuscatedName("av")
   static void Sprite_draw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = -var5; var8 < 0; var8++) {
         int var9;
         for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++] | 0xFF000000) {
            var0[var3++] = var1[var2++] | 0xFF000000;
            var0[var3++] = var1[var2++] | 0xFF000000;
            var0[var3++] = var1[var2++] | 0xFF000000;
         }

         var9 += 3;

         while (var3 < var9) {
            var0[var3++] = var1[var2++] | 0xFF000000;
         }

         var3 += var6;
         var2 += var7;
      }
   }

   public int getMaxWidth() {
      return this.width;
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("at")
   static void Sprite_drawTransBg(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         for (int var24 = var5; var24 < 0; var24++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("xe")
   public static void method12631(SpritePixels var0) {
      int[] var1 = new int[var0.subWidth * var0.subHeight];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.subHeight; var3++) {
         for (int var4 = var0.subWidth - 1; var4 >= 0; var4--) {
            var1[var2++] = var0.pixels[var4 + var3 * var0.subWidth];
         }
      }

      var0.pixels = var1;
      var0.xOffset = var0.width - var0.subWidth - var0.xOffset;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bo")
   public void method12667(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.subWidth;
         int var7 = this.subHeight;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.width;
         int var11 = this.height;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.xOffset > 0) {
            int var14 = ((this.xOffset << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var17 = ((this.yOffset << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.yOffset << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Rasterizer2D_width;
         int var15 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var16 = Rasterizer2D_yClipStart - var2;
            var4 -= var16;
            var18 += var16 * Rasterizer2D_width;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var19 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var20 = Rasterizer2D_xClipStart - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         if (var5 == 256) {
            method12604(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
         } else {
            method12607(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("bs")
   public void drawRotatedMaskedCenteredAround(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12
   ) {
      this.method12675(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("an")
   static void Sprite_drawTransOverlay(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
      var10 = (var12 | var13) >>> 8;

      for (int var14 = -var6; var14 < 0; var14++) {
         for (int var15 = -var5; var15 < 0; var15++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
               var0[var4++] = ((var12 | var13) >>> 8) + var10 | 0xFF000000;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("ae")
   static void Sprite_drawTransparent(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               client.method2488(
                  var0,
                  var4++,
                  ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000) >> 8,
                  var9
               );
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("al")
   public void method12649(int var1, int var2) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var3 = var1 + var2 * Rasterizer2D_width;
      int var4 = 0;
      int var5 = this.subHeight;
      int var6 = this.subWidth;
      int var7 = Rasterizer2D_width - var6;
      int var8 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var9 = Rasterizer2D_yClipStart - var2;
         var5 -= var9;
         var2 = Rasterizer2D_yClipStart;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D_width;
      }

      if (var2 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var2 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var6 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var6 - Rasterizer2D_xClipEnd;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         Sprite_drawTransBg(Rasterizer2D_pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("ak")
   static void method12596(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      for (int var19 = -var10; var19 < 0; var19++) {
         for (int var18 = -var9; var18 < 0; var18++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("vq")
   public static void method12683(SpritePixels var0, int var1, int var2, int var3, int var4) {
      var0.method12688(var0.width << 3, var0.height << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("aw")
   static void method12600(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      for (int var22 = -var10; var22 < 0; var22++) {
         for (int var21 = -var9; var21 < 0; var21++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("ap")
   static void method12604(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var22 = -var12; var22 < 0; var22++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("ay")
   static void method12607(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16
   ) {
      int var17 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var25 = -var12; var25 < 0; var25++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("au")
   public SpritePixels mirrorHorizontally() {
      SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight);
      var1.width = this.width;
      var1.height = this.height;
      var1.xOffset = this.width - this.subWidth - this.xOffset;
      var1.yOffset = this.yOffset;

      for (int var2 = 0; var2 < this.subHeight; var2++) {
         for (int var3 = 0; var3 < this.subWidth; var3++) {
            var1.pixels[var2 * this.subWidth + var3] = this.pixels[var2 * this.subWidth + this.subWidth - 1 - var3];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("bw")
   static void method12589(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -582117861)
                     + ((var2 & 0xFF00) * var9 + (var13 & -576158207) * var10 & 0xFF0000)
                  >> 8;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("bd")
   static void method12591(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 1333513927 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 707116572) * var12 + (var18 & 16711935) * var13 & -16711936)
                     + ((var2 & -2134308703) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000)
                  >> 8;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void normalize() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         int[] var1 = new int[this.width * this.height];

         for (int var2 = 0; var2 < this.subHeight; var2++) {
            for (int var3 = 0; var3 < this.subWidth; var3++) {
               var1[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
            }
         }

         this.pixels = var1;
         this.subWidth = this.width;
         this.subHeight = this.height;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void flipHorizontally() {
      int[] var1 = new int[this.subWidth * this.subHeight];
      int var2 = 0;

      for (int var3 = 0; var3 < this.subHeight; var3++) {
         for (int var4 = this.subWidth - 1; var4 >= 0; var4--) {
            var1[var2++] = this.pixels[var4 + var3 * this.subWidth];
         }
      }

      this.pixels = var1;
      this.xOffset = this.width - this.subWidth - this.xOffset;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("sc")
   public void method12674(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < this.subWidth && var30 >= 0 && var30 < this.subHeight) {
                        int var31 = var29 + var30 * this.subWidth;
                        int var32 = this.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   public void toBufferedOutline(BufferedImage var1, int var2) {
      int var3 = this.getWidth();
      int var4 = this.getHeight();
      if (var1.getWidth() == var3 && var1.getHeight() == var4) {
         int[] var5 = this.getPixels();
         int[] var6 = new int[var3 * var4];
         int var7 = 0;

         for (int var8 = 0; var8 < var4; var8++) {
            for (int var9 = 0; var9 < var3; var9++) {
               int var10 = var5[var7];
               if (var10 == 16777215 || var10 == 0) {
                  if (var9 > 0 && var5[var7 - 1] != 0) {
                     var10 = var2;
                  } else if (var8 > 0 && var5[var7 - var3] != 0) {
                     var10 = var2;
                  } else if (var9 < var3 - 1 && var5[var7 + 1] != 0) {
                     var10 = var2;
                  } else if (var8 < var4 - 1 && var5[var7 + var3] != 0) {
                     var10 = var2;
                  }

                  var6[var7] = var10;
               }

               var7++;
            }
         }

         var1.setRGB(0, 0, var3, var4, var6, 0, var3);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("il")
   public static void method12684(SpritePixels var0, int var1, int var2, int var3, int var4) {
      var0.method12688(var0.width << 3, var0.height << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   public void outline(int var1) {
      int[] var2 = new int[this.subWidth * this.subHeight];
      int var3 = 0;

      for (int var4 = 0; var4 < this.subHeight; var4++) {
         for (int var5 = 0; var5 < this.subWidth; var5++) {
            int var6 = this.pixels[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.pixels[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.pixels[var3 - this.subWidth] != 0) {
                  var6 = var1;
               } else if (var5 < this.subWidth - 1 && this.pixels[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.subHeight - 1 && this.pixels[var3 + this.subWidth] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.pixels = var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dw")
   public void method12647(int var1, int var2) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var3 = var1 + var2 * Rasterizer2D_width;
      int var4 = 0;
      int var5 = this.subHeight;
      int var6 = this.subWidth;
      int var7 = Rasterizer2D_width - var6;
      int var8 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var9 = Rasterizer2D_yClipStart - var2;
         var5 -= var9;
         var2 = Rasterizer2D_yClipStart;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D_width;
      }

      if (var2 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var2 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var6 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var6 - Rasterizer2D_xClipEnd;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         Sprite_draw(Rasterizer2D_pixels, this.pixels, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dv")
   public void method12650(int var1, int var2) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var3 = var1 + var2 * Rasterizer2D_width;
      int var4 = 0;
      int var5 = this.subHeight;
      int var6 = this.subWidth;
      int var7 = Rasterizer2D_width - var6;
      int var8 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var9 = Rasterizer2D_yClipStart - var2;
         var5 -= var9;
         var2 = Rasterizer2D_yClipStart;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D_width;
      }

      if (var2 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var2 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var6 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var6 - Rasterizer2D_xClipEnd;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         Sprite_drawTransBg(Rasterizer2D_pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cf")
   public void method12629(int var1) {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         int var2 = var1;
         if (var1 > this.xOffset) {
            var2 = this.xOffset;
         }

         int var3 = var1;
         if (var1 + this.xOffset + this.subWidth > this.width) {
            var3 = this.width - this.xOffset - this.subWidth;
         }

         int var4 = var1;
         if (var1 > this.yOffset) {
            var4 = this.yOffset;
         }

         int var5 = var1;
         if (var1 + this.yOffset + this.subHeight > this.height) {
            var5 = this.height - this.yOffset - this.subHeight;
         }

         int var6 = this.subWidth + var2 + var3;
         int var7 = this.subHeight + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.subHeight; var9++) {
            for (int var10 = 0; var10 < this.subWidth; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.pixels[var9 * this.subWidth + var10];
            }
         }

         this.pixels = var8;
         this.subWidth = var6;
         this.subHeight = var7;
         this.xOffset -= var2;
         this.yOffset -= var4;
      }
   }

   public int getOffsetX() {
      return this.xOffset;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dz")
   public void method12659(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         Sprite_drawTransparent(Rasterizer2D_pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("hu")
   public void method12692(int var1, int var2, int var3, int var4) {
      if (var3 <= this.width && var4 <= this.height) {
         int var5 = var1 + this.xOffset * var3 / this.width;
         int var6 = var1 + ((this.xOffset + this.subWidth) * var3 + this.width - 1) / this.width;
         int var7 = var2 + this.yOffset * var4 / this.height;
         int var8 = var2 + ((this.yOffset + this.subHeight) * var4 + this.height - 1) / this.height;
         if (var5 < Rasterizer2D_xClipStart) {
            var5 = Rasterizer2D_xClipStart;
         }

         if (var6 > Rasterizer2D_xClipEnd) {
            var6 = Rasterizer2D_xClipEnd;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D_yClipStart;
         }

         if (var8 > Rasterizer2D_yClipEnd) {
            var8 = Rasterizer2D_yClipEnd;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D_width + var5;
            int var10 = Rasterizer2D_width - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.width / var3 - (this.xOffset << 4);
                     int var16 = (var13 + 16) * this.width / var3 - (this.xOffset << 4);
                     int var17 = var14 * this.height / var4 - (this.yOffset << 4);
                     int var18 = (var14 + 16) * this.height / var4 - (this.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.subWidth << 4) {
                           var16 = this.subWidth << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.subHeight << 4) {
                           var18 = this.subHeight << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = this.pixels[var28 * this.subWidth + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & -1478098165) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 118704431) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dr")
   public void method12664(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method12596(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method12600(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("cn")
   public SpritePixels method12617() {
      SpritePixels var1 = new SpritePixels(this.width, this.height);

      for (int var2 = 0; var2 < this.subHeight; var2++) {
         for (int var3 = 0; var3 < this.subWidth; var3++) {
            var1.pixels[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("de")
   public void method12675(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < this.subWidth && var30 >= 0 && var30 < this.subHeight) {
                        int var31 = var29 + var30 * this.subWidth;
                        int var32 = this.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32 | 0xFF000000;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("bz")
   public void method12680(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (Rasterizer2D_width % 2 != 0) {
               var5++;
            }

            if (Rasterizer2D_height % 2 != 0) {
               var6++;
            }
         }

         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = (int)(((long)var12 << 8) / var9);
         var13 = (int)(((long)var13 << 8) / var9);
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * Rasterizer2D_width;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.subWidth && var21 >= 0 && var21 < this.subHeight) {
                  int var22 = var20 + var21 * this.subWidth;
                  if (var22 >= 0 && var22 < this.pixels.length) {
                     int var23 = this.pixels[var22];
                     if (var23 != 0) {
                        Rasterizer2D_pixels[var17] = var23 | 0xFF000000;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Rasterizer2D_width;
         }
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ef")
   void method12688(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.xOffset << 4;
         var2 -= this.yOffset << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.subWidth << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.subWidth << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.subHeight << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var17 = ((this.subWidth << 4) - var1) * var10 + ((this.subHeight << 4) - var2) * var9;
         int var18 = -((this.subWidth << 4) - var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Rasterizer2D_xClipStart) {
            var19 = Rasterizer2D_xClipStart;
         }

         if (var20 > Rasterizer2D_xClipEnd) {
            var20 = Rasterizer2D_xClipEnd;
         }

         if (var21 < Rasterizer2D_yClipStart) {
            var21 = Rasterizer2D_yClipStart;
         }

         if (var22 > Rasterizer2D_yClipEnd) {
            var22 = Rasterizer2D_yClipEnd;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Rasterizer2D_width + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += Rasterizer2D_width) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.pixels[(var36 >> 12) * this.subWidth + (var35 >> 12)];
                              if (var38 != 0) {
                                 Rasterizer2D_pixels[var34++] = var38 | 0xFF000000;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += Rasterizer2D_width) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.subHeight << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.pixels[(var108 >> 12) * this.subWidth + (var100 >> 12)];
                              if (var124 != 0) {
                                 Rasterizer2D_pixels[var92++] = var124 | 0xFF000000;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += Rasterizer2D_width) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.subHeight << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.pixels[(var109 >> 12) * this.subWidth + (var101 >> 12)];
                              if (var125 != 0) {
                                 Rasterizer2D_pixels[var93++] = var125 | 0xFF000000;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += Rasterizer2D_width) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.subWidth << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.pixels[(var110 >> 12) * this.subWidth + (var102 >> 12)];
                              if (var126 != 0) {
                                 Rasterizer2D_pixels[var94++] = var126 | 0xFF000000;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += Rasterizer2D_width) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.subWidth << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.subHeight << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = this.pixels[(var111 >> 12) * this.subWidth + (var103 >> 12)];
                           if (var127 != 0) {
                              Rasterizer2D_pixels[var95++] = var127 | 0xFF000000;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += Rasterizer2D_width) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.subWidth << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (this.subHeight << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.pixels[(var112 >> 12) * this.subWidth + (var104 >> 12)];
                           if (var128 != 0) {
                              Rasterizer2D_pixels[var96++] = var128 | 0xFF000000;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += Rasterizer2D_width) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.subWidth << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.pixels[(var113 >> 12) * this.subWidth + (var105 >> 12)];
                           if (var129 != 0) {
                              Rasterizer2D_pixels[var97++] = var129 | 0xFF000000;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += Rasterizer2D_width) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (this.subWidth << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.subHeight << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = this.pixels[(var114 >> 12) * this.subWidth + (var106 >> 12)];
                        if (var130 != 0) {
                           Rasterizer2D_pixels[var98++] = var130 | 0xFF000000;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += Rasterizer2D_width) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (this.subWidth << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.subHeight << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.pixels[(var115 >> 12) * this.subWidth + (var107 >> 12)];
                        if (var131 != 0) {
                           Rasterizer2D_pixels[var99++] = var131 | 0xFF000000;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ek")
   void method12689(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.xOffset << 4;
         var2 -= this.yOffset << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.subWidth << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.subWidth << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.subHeight << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var17 = ((this.subWidth << 4) - var1) * var10 + ((this.subHeight << 4) - var2) * var9;
         int var18 = -((this.subWidth << 4) - var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Rasterizer2D_xClipStart) {
            var19 = Rasterizer2D_xClipStart;
         }

         if (var20 > Rasterizer2D_xClipEnd) {
            var20 = Rasterizer2D_xClipEnd;
         }

         if (var21 < Rasterizer2D_yClipStart) {
            var21 = Rasterizer2D_yClipStart;
         }

         if (var22 > Rasterizer2D_yClipEnd) {
            var22 = Rasterizer2D_yClipEnd;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Rasterizer2D_width + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += Rasterizer2D_width) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.pixels[(var36 >> 12) * this.subWidth + (var35 >> 12)];
                              if (var38 != 0) {
                                 Rasterizer2D_pixels[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += Rasterizer2D_width) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.subHeight << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.pixels[(var108 >> 12) * this.subWidth + (var100 >> 12)];
                              if (var124 != 0) {
                                 Rasterizer2D_pixels[var92++] = var124;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += Rasterizer2D_width) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.subHeight << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.pixels[(var109 >> 12) * this.subWidth + (var101 >> 12)];
                              if (var125 != 0) {
                                 Rasterizer2D_pixels[var93++] = var125;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += Rasterizer2D_width) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.subWidth << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.pixels[(var110 >> 12) * this.subWidth + (var102 >> 12)];
                              if (var126 != 0) {
                                 Rasterizer2D_pixels[var94++] = var126;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += Rasterizer2D_width) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.subWidth << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.subHeight << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = this.pixels[(var111 >> 12) * this.subWidth + (var103 >> 12)];
                           if (var127 != 0) {
                              Rasterizer2D_pixels[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += Rasterizer2D_width) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.subWidth << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (this.subHeight << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.pixels[(var112 >> 12) * this.subWidth + (var104 >> 12)];
                           if (var128 != 0) {
                              Rasterizer2D_pixels[var96++] = var128;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += Rasterizer2D_width) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.subWidth << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.pixels[(var113 >> 12) * this.subWidth + (var105 >> 12)];
                           if (var129 != 0) {
                              Rasterizer2D_pixels[var97++] = var129;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += Rasterizer2D_width) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (this.subWidth << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.subHeight << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = this.pixels[(var114 >> 12) * this.subWidth + (var106 >> 12)];
                        if (var130 != 0) {
                           Rasterizer2D_pixels[var98++] = var130;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += Rasterizer2D_width) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (this.subWidth << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.subHeight << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.pixels[(var115 >> 12) * this.subWidth + (var107 >> 12)];
                        if (var131 != 0) {
                           Rasterizer2D_pixels[var99++] = var131;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void flipVertically() {
      int[] var1 = new int[this.subWidth * this.subHeight];
      int var2 = 0;

      for (int var3 = this.subHeight - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.subWidth; var4++) {
            var1[var2++] = this.pixels[var4 + var3 * this.subWidth];
         }
      }

      this.pixels = var1;
      this.yOffset = this.height - this.subHeight - this.yOffset;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIII)V")
   @ObfuscatedName("bp")
   static void method12578(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = -var5; var8 < 0; var8++) {
         int var9;
         for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         var9 += 3;

         while (var3 < var9) {
            var0[var3++] = var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("ec")
   public void method12681(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (Rasterizer2D_width % 2 != 0) {
               var5++;
            }

            if (Rasterizer2D_height % 2 != 0) {
               var6++;
            }
         }

         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = (int)(((long)var12 << 8) / var9);
         var13 = (int)(((long)var13 << 8) / var9);
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * Rasterizer2D_width;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.subWidth && var21 >= 0 && var21 < this.subHeight) {
                  int var22 = var20 + var21 * this.subWidth;
                  if (var22 >= 0 && var22 < this.pixels.length) {
                     int var23 = this.pixels[var22];
                     if (var23 != 0) {
                        Rasterizer2D_pixels[var17] = var23;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Rasterizer2D_width;
         }
      } catch (Exception var24) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("bu")
   static void method12581(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var24 = var5; var24 < 0; var24++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIII)V")
   @ObfuscatedName("ba")
   static void method12583(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("bi")
   static void method12586(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
      var10 = (var12 | var13) >>> 8;

      for (int var14 = -var6; var14 < 0; var14++) {
         for (int var15 = -var5; var15 < 0; var15++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("by")
   static void method12587(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
      var10 = (var12 | var13) >>> 8;

      for (int var14 = -var6; var14 < 0; var14++) {
         for (int var15 = -var5; var15 < 0; var15++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ao")
   public void drawTransOverlayAt(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method12650(var1, var2);
      } else {
         var1 += this.xOffset;
         var2 += this.yOffset;
         int var5 = var1 + var2 * Rasterizer2D_width;
         int var6 = 0;
         int var7 = this.subHeight;
         int var8 = this.subWidth;
         int var9 = Rasterizer2D_width - var8;
         int var10 = 0;
         if (var2 < Rasterizer2D_yClipStart) {
            int var11 = Rasterizer2D_yClipStart - var2;
            var7 -= var11;
            var2 = Rasterizer2D_yClipStart;
            var6 += var11 * var8;
            var5 += var11 * Rasterizer2D_width;
         }

         if (var2 + var7 > Rasterizer2D_yClipEnd) {
            var7 -= var2 + var7 - Rasterizer2D_yClipEnd;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var14 = Rasterizer2D_xClipStart - var1;
            var8 -= var14;
            var1 = Rasterizer2D_xClipStart;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Rasterizer2D_xClipEnd) {
            int var15 = var1 + var8 - Rasterizer2D_xClipEnd;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            Sprite_drawTransOverlay(Rasterizer2D_pixels, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("cs")
   public SpritePixels method12614() {
      SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight);
      var1.width = this.width;
      var1.height = this.height;
      var1.xOffset = this.xOffset;
      var1.yOffset = this.yOffset;
      int var2 = this.pixels.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.pixels[var3] = this.pixels[var3];
      }

      return var1;
   }

   SpritePixels() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("ce")
   static void method12605(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var22 = -var12; var22 < 0; var22++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & -1327371686) + (var1 & 1023208139);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
         var8++;
      }
   }

   public int getHeight() {
      return this.subHeight;
   }

   public void drawAt(int var1, int var2) {
      this.method12650(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("br")
   static void method12592(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 256 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & 1728410094)
                     + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 1663897685)
                  >> 8;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   public void setMaxWidth(int var1) {
      this.width = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("bh")
   static void method12593(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 256 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936)
                     + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000)
                  >> 8;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("uk")
   public static void method12655(SpritePixels var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12700();
      }

      if (var3 == 256) {
         var0.method12650(var1, var2);
      } else {
         var1 += var0.xOffset;
         var2 += var0.yOffset;
         int var5 = var1 + var2 * Rasterizer2D_width;
         int var6 = 0;
         int var7 = var0.subHeight;
         int var8 = var0.subWidth;
         int var9 = Rasterizer2D_width - var8;
         int var10 = 0;
         if (var2 < Rasterizer2D_yClipStart) {
            int var11 = Rasterizer2D_yClipStart - var2;
            var7 -= var11;
            var2 = Rasterizer2D_yClipStart;
            var6 += var11 * var8;
            var5 += var11 * Rasterizer2D_width;
         }

         if (var2 + var7 > Rasterizer2D_yClipEnd) {
            var7 -= var2 + var7 - Rasterizer2D_yClipEnd;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var14 = Rasterizer2D_xClipStart - var1;
            var8 -= var14;
            var1 = Rasterizer2D_xClipStart;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Rasterizer2D_xClipEnd) {
            int var15 = var1 + var8 - Rasterizer2D_xClipEnd;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            Sprite_drawTransOverlay(Rasterizer2D_pixels, var0.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("bl")
   static void method12597(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      for (int var19 = -var10; var19 < 0; var19++) {
         for (int var18 = -var9; var18 < 0; var18++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & -1956847448) + (var1 & -925010774);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("bc")
   static void method12598(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      for (int var19 = -var10; var19 < 0; var19++) {
         for (int var18 = -var9; var18 < 0; var18++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & -1352893130) + (var1 & -998983661);
               var1 = (var0 & -1179267366) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("bq")
   static void method12599(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      for (int var19 = -var10; var19 < 0; var19++) {
         for (int var18 = -var9; var18 < 0; var18++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & -1961693600);
               var1 = (var0 & 16777472) + (var2 - var0 & -1425156449);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("bx")
   static void method12601(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      for (int var22 = -var10; var22 < 0; var22++) {
         for (int var21 = -var9; var21 < 0; var21++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 586650541) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 416422719) + (var1 & 1242457093);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIII)V")
   @ObfuscatedName("bm")
   static void method12579(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = -var5; var8 < 0; var8++) {
         int var9;
         for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         var9 += 3;

         while (var3 < var9) {
            var0[var3++] = var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("ch")
   static void method12606(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var22 = -var12; var22 < 0; var22++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 926258148) + (var1 & 580238258);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("dk")
   public void method12676(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < this.subWidth && var30 >= 0 && var30 < this.subHeight) {
                        int var31 = var29 + var30 * this.subWidth;
                        int var32 = this.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("cu")
   static void method12608(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16
   ) {
      int var17 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var25 = -var12; var25 < 0; var25++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("am")
   public void drawScaledAt(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.subWidth;
         int var6 = this.subHeight;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.width;
         int var10 = this.height;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (this.xOffset > 0) {
            int var13 = ((this.xOffset << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var16 = ((this.yOffset << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (this.yOffset << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         int var17 = var1 + var2 * Rasterizer2D_width;
         int var14 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var15 = Rasterizer2D_yClipStart - var2;
            var4 -= var15;
            var17 += var15 * Rasterizer2D_width;
            var8 += var12 * var15;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var18 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var18;
            var14 += var18;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var19 = Rasterizer2D_xClipStart - var1;
            var3 -= var19;
            var17 += var19;
            var7 += var11 * var19;
            var14 += var19;
         }

         Sprite_drawScaled(Rasterizer2D_pixels, this.pixels, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("cm")
   static void method12609(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16
   ) {
      int var17 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var25 = -var12; var25 < 0; var25++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 1294291784) * var16;
               var0 = (var1 & 73703936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & -1956002949) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
         var8++;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("cb")
   static void method12610(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16
   ) {
      int var17 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var25 = -var12; var25 < 0; var25++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("ck")
   public SpritePixels method12615() {
      SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight);
      var1.width = this.width;
      var1.height = this.height;
      var1.xOffset = this.xOffset;
      var1.yOffset = this.yOffset;
      int var2 = this.pixels.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.pixels[var3] = this.pixels[var3];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("cc")
   public SpritePixels method12616() {
      SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight);
      var1.width = this.width;
      var1.height = this.height;
      var1.xOffset = this.xOffset;
      var1.yOffset = this.yOffset;
      int var2 = this.pixels.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.pixels[var3] = this.pixels[var3];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("na")
   public SpritePixels method12700() {
      return this.method12613();
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("aj")
   static void Sprite_drawTransScaled(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 256 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               client.method2488(
                  var0,
                  var5++,
                  ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000) >> 8,
                  var12
               );
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("bn")
   static void method12595(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 1341173919 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 1176998600) * var12 + (var18 & 16711935) * var13 & -16711936)
                     + ((var2 & 0xFF00) * var12 + (var18 & 1796167007) * var13 & 0xFF0000)
                  >> 8;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("co")
   public SpritePixels method12618() {
      SpritePixels var1 = new SpritePixels(this.width, this.height);

      for (int var2 = 0; var2 < this.subHeight; var2++) {
         for (int var3 = 0; var3 < this.subWidth; var3++) {
            var1.pixels[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("aq")
   public void drawTransScaledAt(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.subWidth;
         int var7 = this.subHeight;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.width;
         int var11 = this.height;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.xOffset > 0) {
            int var14 = ((this.xOffset << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var17 = ((this.yOffset << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.yOffset << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Rasterizer2D_width;
         int var15 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var16 = Rasterizer2D_yClipStart - var2;
            var4 -= var16;
            var18 += var16 * Rasterizer2D_width;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var19 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var20 = Rasterizer2D_xClipStart - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         Sprite_drawTransScaled(Rasterizer2D_pixels, this.pixels, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("mo")
   public static void method12620(SpritePixels var0) {
      if (var0 == null) {
         var0.setRaster();
      }

      Rasterizer2D_init(var0.pixels, var0.subWidth, var0.subHeight, null);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("bf")
   static void method12590(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936)
                     + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000)
                  >> 8;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   public void setOffsetX(int var1) {
      this.xOffset = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bj")
   public void drawScaledWorldmap(int var1, int var2, int var3, int var4) {
      if (var3 <= this.width && var4 <= this.height) {
         int var5 = var1 + this.xOffset * var3 / this.width;
         int var6 = var1 + ((this.xOffset + this.subWidth) * var3 + this.width - 1) / this.width;
         int var7 = var2 + this.yOffset * var4 / this.height;
         int var8 = var2 + ((this.yOffset + this.subHeight) * var4 + this.height - 1) / this.height;
         if (var5 < Rasterizer2D_xClipStart) {
            var5 = Rasterizer2D_xClipStart;
         }

         if (var6 > Rasterizer2D_xClipEnd) {
            var6 = Rasterizer2D_xClipEnd;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D_yClipStart;
         }

         if (var8 > Rasterizer2D_yClipEnd) {
            var8 = Rasterizer2D_yClipEnd;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D_width + var5;
            int var10 = Rasterizer2D_width - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.width / var3 - (this.xOffset << 4);
                     int var16 = (var13 + 16) * this.width / var3 - (this.xOffset << 4);
                     int var17 = var14 * this.height / var4 - (this.yOffset << 4);
                     int var18 = (var14 + 16) * this.height / var4 - (this.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.subWidth << 4) {
                           var16 = this.subWidth << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.subHeight << 4) {
                           var18 = this.subHeight << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = this.pixels[var28 * this.subWidth + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 0xFF) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 0xFF) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39 | 0xFF000000;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public BufferedImage toBufferedImage() {
      BufferedImage var1 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedImage(var1);
      return var1;
   }

   public int getOffsetY() {
      return this.yOffset;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method12625() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         int[] var1 = new int[this.width * this.height];

         for (int var2 = 0; var2 < this.subHeight; var2++) {
            for (int var3 = 0; var3 < this.subWidth; var3++) {
               var1[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
            }
         }

         this.pixels = var1;
         this.subWidth = this.width;
         this.subHeight = this.height;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }

   public int[] getPixels() {
      return this.pixels;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ci")
   public void method12630(int var1) {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         int var2 = var1;
         if (var1 > this.xOffset) {
            var2 = this.xOffset;
         }

         int var3 = var1;
         if (var1 + this.xOffset + this.subWidth > this.width) {
            var3 = this.width - this.xOffset - this.subWidth;
         }

         int var4 = var1;
         if (var1 > this.yOffset) {
            var4 = this.yOffset;
         }

         int var5 = var1;
         if (var1 + this.yOffset + this.subHeight > this.height) {
            var5 = this.height - this.yOffset - this.subHeight;
         }

         int var6 = this.subWidth + var2 + var3;
         int var7 = this.subHeight + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.subHeight; var9++) {
            for (int var10 = 0; var10 < this.subWidth; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.pixels[var9 * this.subWidth + var10];
            }
         }

         this.pixels = var8;
         this.subWidth = var6;
         this.subHeight = var7;
         this.xOffset -= var2;
         this.yOffset -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("ad")
   public SpritePixels copyNormalized() {
      SpritePixels var1 = new SpritePixels(this.width, this.height);

      for (int var2 = 0; var2 < this.subHeight; var2++) {
         for (int var3 = 0; var3 < this.subWidth; var3++) {
            var1.pixels[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
         }
      }

      return var1;
   }

   public int getWidth() {
      return this.subWidth;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("vp")
   public void method12701(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      this.method12680(var1, var2, var3, var4, var5, var6, var7, var9);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dm")
   public void method12668(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.subWidth;
         int var7 = this.subHeight;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.width;
         int var11 = this.height;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.xOffset > 0) {
            int var14 = ((this.xOffset << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var17 = ((this.yOffset << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.yOffset << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Rasterizer2D_width;
         int var15 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var16 = Rasterizer2D_yClipStart - var2;
            var4 -= var16;
            var18 += var16 * Rasterizer2D_width;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var19 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var20 = Rasterizer2D_xClipStart - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         if (var5 == 256) {
            method12604(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
         } else {
            method12607(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("us")
   public static void method12685(SpritePixels var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12696(var1, var1, var1, var1);
      } else {
         var0.method12688(var0.width << 3, var0.height << 3, var1 << 4, var2 << 4, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public void method12633() {
      int[] var1 = new int[this.subWidth * this.subHeight];
      int var2 = 0;

      for (int var3 = 0; var3 < this.subHeight; var3++) {
         for (int var4 = this.subWidth - 1; var4 >= 0; var4--) {
            var1[var2++] = this.pixels[var4 + var3 * this.subWidth];
         }
      }

      this.pixels = var1;
      this.xOffset = this.width - this.subWidth - this.xOffset;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   public void method12621() {
      Rasterizer2D_init(this.pixels, this.subWidth, this.subHeight, null);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cl")
   public void method12642(int var1) {
      for (int var2 = this.subHeight - 1; var2 > 0; var2--) {
         int var3 = var2 * this.subWidth;

         for (int var4 = this.subWidth - 1; var4 > 0; var4--) {
            if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) {
               this.pixels[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   public void drawTransBgAt(int var1, int var2) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var3 = var1 + var2 * Rasterizer2D_width;
      int var4 = 0;
      int var5 = this.subHeight;
      int var6 = this.subWidth;
      int var7 = Rasterizer2D_width - var6;
      int var8 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var9 = Rasterizer2D_yClipStart - var2;
         var5 -= var9;
         var2 = Rasterizer2D_yClipStart;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D_width;
      }

      if (var2 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var2 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var6 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var6 - Rasterizer2D_xClipEnd;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         Sprite_draw(Rasterizer2D_pixels, this.pixels, var4, var3, var6, var5, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("ct")
   static void method12611(
      int var0,
      int var1,
      int var2,
      int var3,
      int[] var4,
      int[] var5,
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
      int var16
   ) {
      int var17 = var3;

      while (var8 < 0) {
         var7 = (var9 >> 16) * var15;

         for (int var25 = -var12; var25 < 0; var25++) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & 1177261936) + (var0 * var16 - var1 & -354983475) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & -2054928056) + (var1 & -1558719916);
               var1 = (var0 & 16777472) + (var2 - var0 & 222793184);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var10++;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
         var8++;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dy")
   public void method12653(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.subWidth;
         int var6 = this.subHeight;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.width;
         int var10 = this.height;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (this.xOffset > 0) {
            int var13 = ((this.xOffset << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var16 = ((this.yOffset << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (this.yOffset << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         int var17 = var1 + var2 * Rasterizer2D_width;
         int var14 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var15 = Rasterizer2D_yClipStart - var2;
            var4 -= var15;
            var17 += var15 * Rasterizer2D_width;
            var8 += var12 * var15;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var18 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var18;
            var14 += var18;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var19 = Rasterizer2D_xClipStart - var1;
            var3 -= var19;
            var17 += var19;
            var7 += var11 * var19;
            var14 += var19;
         }

         Sprite_drawScaled(Rasterizer2D_pixels, this.pixels, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dc")
   public void method12656(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method12650(var1, var2);
      } else {
         var1 += this.xOffset;
         var2 += this.yOffset;
         int var5 = var1 + var2 * Rasterizer2D_width;
         int var6 = 0;
         int var7 = this.subHeight;
         int var8 = this.subWidth;
         int var9 = Rasterizer2D_width - var8;
         int var10 = 0;
         if (var2 < Rasterizer2D_yClipStart) {
            int var11 = Rasterizer2D_yClipStart - var2;
            var7 -= var11;
            var2 = Rasterizer2D_yClipStart;
            var6 += var11 * var8;
            var5 += var11 * Rasterizer2D_width;
         }

         if (var2 + var7 > Rasterizer2D_yClipEnd) {
            var7 -= var2 + var7 - Rasterizer2D_yClipEnd;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var14 = Rasterizer2D_xClipStart - var1;
            var8 -= var14;
            var1 = Rasterizer2D_xClipStart;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Rasterizer2D_xClipEnd) {
            int var15 = var1 + var8 - Rasterizer2D_xClipEnd;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            Sprite_drawTransOverlay(Rasterizer2D_pixels, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("db")
   public void method12657(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method12650(var1, var2);
      } else {
         var1 += this.xOffset;
         var2 += this.yOffset;
         int var5 = var1 + var2 * Rasterizer2D_width;
         int var6 = 0;
         int var7 = this.subHeight;
         int var8 = this.subWidth;
         int var9 = Rasterizer2D_width - var8;
         int var10 = 0;
         if (var2 < Rasterizer2D_yClipStart) {
            int var11 = Rasterizer2D_yClipStart - var2;
            var7 -= var11;
            var2 = Rasterizer2D_yClipStart;
            var6 += var11 * var8;
            var5 += var11 * Rasterizer2D_width;
         }

         if (var2 + var7 > Rasterizer2D_yClipEnd) {
            var7 -= var2 + var7 - Rasterizer2D_yClipEnd;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var14 = Rasterizer2D_xClipStart - var1;
            var8 -= var14;
            var1 = Rasterizer2D_xClipStart;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Rasterizer2D_xClipEnd) {
            int var15 = var1 + var8 - Rasterizer2D_xClipEnd;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            Sprite_drawTransOverlay(Rasterizer2D_pixels, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   public void setOffsetY(int var1) {
      this.yOffset = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;I)V")
   @ObfuscatedName("go")
   public static void method12639(SpritePixels var0, int var1) {
      if (var0 == null) {
         var0.shadow(var1);
      } else {
         int[] var2 = new int[var0.subWidth * var0.subHeight];
         int var3 = 0;

         for (int var4 = 0; var4 < var0.subHeight; var4++) {
            for (int var5 = 0; var5 < var0.subWidth; var5++) {
               int var6 = var0.pixels[var3];
               if (var6 == 0) {
                  if (var5 > 0 && var0.pixels[var3 - 1] != 0) {
                     var6 = var1;
                  } else if (var4 > 0 && var0.pixels[var3 - var0.subWidth] != 0) {
                     var6 = var1;
                  } else if (var5 < var0.subWidth - 1 && var0.pixels[var3 + 1] != 0) {
                     var6 = var1;
                  } else if (var4 < var0.subHeight - 1 && var0.pixels[var3 + var0.subWidth] != 0) {
                     var6 = var1;
                  }
               }

               var2[var3++] = var6;
            }
         }

         var0.pixels = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dq")
   public void method12660(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         Sprite_drawTransparent(Rasterizer2D_pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public SpritePixels(int var1, int var2) {
      this(new int[var1 * var2], var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("ee")
   public static void method12626(SpritePixels var0) {
      if (var0 == null) {
         var0.method12628();
      }

      if (var0.subWidth != var0.width || var0.subHeight != var0.height) {
         int[] var1 = new int[var0.width * var0.height];

         for (int var2 = 0; var2 < var0.subHeight; var2++) {
            for (int var3 = 0; var3 < var0.subWidth; var3++) {
               var1[(var2 + var0.yOffset) * var0.width + var3 + var0.xOffset] = var0.pixels[var2 * var0.subWidth + var3];
            }
         }

         var0.pixels = var1;
         var0.subWidth = var0.width;
         var0.subHeight = var0.height;
         var0.xOffset = 0;
         var0.yOffset = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("aa")
   public void drawTransAt(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method12596(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method12600(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)Z")
   @ObfuscatedName("hl")
   public static boolean method12603(FriendSystem var0) {
      return var0.ignoreList.isFull((byte)10) || UserList.method10669(var0.ignoreList, -844887102) >= -1398354454 && 1 != client.field769 * 866957569;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dl")
   public void method12666(int var1, int var2, int var3) {
      var1 += this.xOffset;
      var2 += this.yOffset;
      int var4 = var1 + var2 * Rasterizer2D_width;
      int var5 = 0;
      int var6 = this.subHeight;
      int var7 = this.subWidth;
      int var8 = Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * Rasterizer2D_width;
      }

      if (var2 + var6 > Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method12596(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method12600(0, 0, 0, Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("du")
   public void method12669(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.subWidth;
         int var7 = this.subHeight;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.width;
         int var11 = this.height;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.xOffset > 0) {
            int var14 = ((this.xOffset << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.xOffset << 16);
         }

         if (this.yOffset > 0) {
            int var17 = ((this.yOffset << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.yOffset << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Rasterizer2D_width;
         int var15 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var16 = Rasterizer2D_yClipStart - var2;
            var4 -= var16;
            var18 += var16 * Rasterizer2D_width;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var19 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var20 = Rasterizer2D_xClipStart - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         if (var5 == 256) {
            method12604(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
         } else {
            method12607(0, 0, 0, var8, this.pixels, Rasterizer2D_pixels, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
         }
      }
   }

   public SpritePixels(int[] var1, int var2, int var3) {
      this.pixels = var1;
      this.subWidth = this.width = var2;
      this.subHeight = this.height = var3;
      this.yOffset = 0;
      this.xOffset = 0;
   }

   public void setMaxHeight(int var1) {
      this.height = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("dp")
   public void method12670(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.subHeight <= var6 ? this.subHeight : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.subWidth > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * Rasterizer2D_width;
      int var14 = var2 + var9;

      for (int var15 = var9; var15 < var10; var15++) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.subWidth <= var16 + var17) {
            var12 = this.subWidth;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.pixels[var20 + var15 * this.subWidth];
            if (var21 != 0) {
               Rasterizer2D_pixels[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += Rasterizer2D_width;
      }
   }

   public BufferedImage toBufferedOutline(Color var1) {
      BufferedImage var2 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedOutline(var2, var1.getRGB());
      return var2;
   }

   public int getMaxHeight() {
      return this.height;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;I)V")
   @ObfuscatedName("mx")
   public static void method12643(SpritePixels var0, int var1) {
      if (var0 == null) {
         var0.shadow(var1);
      }

      for (int var2 = var0.subHeight - 1; var2 > 0; var2--) {
         int var3 = var2 * var0.subWidth;

         for (int var4 = var0.subWidth - 1; var4 > 0; var4--) {
            if (var0.pixels[var4 + var3] == 0 && var0.pixels[var4 + var3 - 1 - var0.subWidth] != 0) {
               var0.pixels[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("dg")
   public void method12671(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.subHeight <= var6 ? this.subHeight : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.subWidth > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * Rasterizer2D_width;
      int var14 = var2 + var9;

      for (int var15 = var9; var15 < var10; var15++) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.subWidth <= var16 + var17) {
            var12 = this.subWidth;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.pixels[var20 + var15 * this.subWidth];
            if (var21 != 0) {
               Rasterizer2D_pixels[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += Rasterizer2D_width;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIIIIIIIII[I[I)V")
   @ObfuscatedName("tl")
   public static void method12677(
      SpritePixels var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12
   ) {
      if (var0 == null) {
         var0.drawRotatedMaskedCenteredAround(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var11, var11);
      }

      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < var0.subWidth && var30 >= 0 && var30 < var0.subHeight) {
                        int var31 = var29 + var30 * var0.subWidth;
                        int var32 = var0.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("dn")
   public void method12678(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < this.subWidth && var30 >= 0 && var30 < this.subHeight) {
                        int var31 = var29 + var30 * this.subWidth;
                        int var32 = this.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;II)V")
   @ObfuscatedName("rw")
   public static void method12651(SpritePixels var0, int var1, int var2) {
      var1 += var0.xOffset;
      var2 += var0.yOffset;
      int var3 = var1 + var2 * Rasterizer2D_width;
      int var4 = 0;
      int var5 = var0.subHeight;
      int var6 = var0.subWidth;
      int var7 = Rasterizer2D_width - var6;
      int var8 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var9 = Rasterizer2D_yClipStart - var2;
         var5 -= var9;
         var2 = Rasterizer2D_yClipStart;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D_width;
      }

      if (var2 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var2 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var6 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var6 - Rasterizer2D_xClipEnd;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         Sprite_drawTransBg(Rasterizer2D_pixels, var0.pixels, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dd")
   public void method12644(int var1) {
      for (int var2 = this.subHeight - 1; var2 > 0; var2--) {
         int var3 = var2 * this.subWidth;

         for (int var4 = this.subWidth - 1; var4 > 0; var4--) {
            if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) {
               this.pixels[var4 + var3] = var1;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("ll")
   public static void method12694(SpritePixels var0, int var1, int var2, int var3, int var4) {
      if (var3 <= var0.width && var4 <= var0.height) {
         int var5 = var1 + var0.xOffset * var3 / var0.width;
         int var6 = var1 + ((var0.xOffset + var0.subWidth) * var3 + var0.width - 1) / var0.width;
         int var7 = var2 + var0.yOffset * var4 / var0.height;
         int var8 = var2 + ((var0.yOffset + var0.subHeight) * var4 + var0.height - 1) / var0.height;
         if (var5 < Rasterizer2D_xClipStart) {
            var5 = Rasterizer2D_xClipStart;
         }

         if (var6 > Rasterizer2D_xClipEnd) {
            var6 = Rasterizer2D_xClipEnd;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D_yClipStart;
         }

         if (var8 > Rasterizer2D_yClipEnd) {
            var8 = Rasterizer2D_yClipEnd;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D_width + var5;
            int var10 = Rasterizer2D_width - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * var0.width / var3 - (var0.xOffset << 4);
                     int var16 = (var13 + 16) * var0.width / var3 - (var0.xOffset << 4);
                     int var17 = var14 * var0.height / var4 - (var0.yOffset << 4);
                     int var18 = (var14 + 16) * var0.height / var4 - (var0.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= var0.subWidth << 4) {
                           var16 = var0.subWidth << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= var0.subHeight << 4) {
                           var18 = var0.subHeight << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = var0.pixels[var28 * var0.subWidth + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 0xFF) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 0xFF) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;IIIIII[I[I)V")
   @ObfuscatedName("qm")
   public static void method12672(SpritePixels var0, int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      if (var0 == null) {
         var0.method12673(var1, var1, var1, var1, var1, var1, var7, var7);
      }

      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + var0.subHeight <= var6 ? var0.subHeight : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + var0.subWidth > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * Rasterizer2D_width;
      int var14 = var2 + var9;

      for (int var15 = var9; var15 < var10; var15++) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + var0.subWidth <= var16 + var17) {
            var12 = var0.subWidth;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = var0.pixels[var20 + var15 * var0.subWidth];
            if (var21 != 0) {
               Rasterizer2D_pixels[var18++] = var21 | 0xFF000000;
            } else {
               var18++;
            }
         }

         var13 += Rasterizer2D_width;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("zc")
   public static void method12634(SpritePixels var0) {
      int[] var1 = new int[var0.subWidth * var0.subHeight];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.subHeight; var3++) {
         for (int var4 = var0.subWidth - 1; var4 >= 0; var4--) {
            var1[var2++] = var0.pixels[var4 + var3 * var0.subWidth];
         }
      }

      var0.pixels = var1;
      var0.xOffset = var0.width - var0.subWidth - var0.xOffset;
   }

   public void toBufferedImage(BufferedImage var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      if (var1.getWidth() == var2 && var1.getHeight() == var3) {
         int[] var4 = this.getPixels();
         int[] var5 = new int[var4.length];

         for (int var6 = 0; var6 < var4.length; var6++) {
            if (var4[var6] != 0) {
               var5[var6] = var4[var6] | 0xFF000000;
            }
         }

         var1.setRGB(0, 0, var2, var3, var5, 0, var2);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   public void method12622() {
      Rasterizer2D_init(this.pixels, this.subWidth, this.subHeight, null);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("ea")
   public void method12682(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (Rasterizer2D_width % 2 != 0) {
               var5++;
            }

            if (Rasterizer2D_height % 2 != 0) {
               var6++;
            }
         }

         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = (int)(((long)var12 << 8) / var9);
         var13 = (int)(((long)var13 << 8) / var9);
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * Rasterizer2D_width;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.subWidth && var21 >= 0 && var21 < this.subHeight) {
                  int var22 = var20 + var21 * this.subWidth;
                  if (var22 >= 0 && var22 < this.pixels.length) {
                     int var23 = this.pixels[var22];
                     if (var23 != 0) {
                        Rasterizer2D_pixels[var17] = var23;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Rasterizer2D_width;
         }
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("do")
   public void method12679(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      try {
         int var13 = -var3 / 2;
         int var14 = -var4 / 2;
         int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var15 = (int)(((long)var15 << 8) / var8);
         var16 = (int)(((long)var16 << 8) / var8);
         int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
         int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
         int var19 = var1 + var2 * Rasterizer2D_width;

         for (int var20 = 0; var20 < var4; var20++) {
            int var21 = var2 + var20;
            int var22 = var21 - var10;
            if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
               int var23 = var19;
               int var24 = var17;
               int var25 = var18;

               for (int var26 = -var3; var26 < 0; var26++) {
                  int var27 = var1 + var3 + var26;
                  int var28 = var27 - var9;
                  if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
                     int var29 = var24 >> 16;
                     int var30 = var25 >> 16;
                     if (var29 >= 0 && var29 < this.subWidth && var30 >= 0 && var30 < this.subHeight) {
                        int var31 = var29 + var30 * this.subWidth;
                        int var32 = this.pixels[var31];
                        if (var32 != 0) {
                           Rasterizer2D_pixels[var23] = var32;
                        }
                     }
                  }

                  var23++;
                  var24 += var16;
                  var25 -= var15;
               }
            }

            var17 += var15;
            var18 += var16;
            var19 += Rasterizer2D_width;
         }
      } catch (Exception var33) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;I)V")
   @ObfuscatedName("fe")
   public static void method12640(SpritePixels var0, int var1) {
      if (var0 == null) {
         var0.method12641(var1);
      }

      int[] var2 = new int[var0.subWidth * var0.subHeight];
      int var3 = 0;

      for (int var4 = 0; var4 < var0.subHeight; var4++) {
         for (int var5 = 0; var5 < var0.subWidth; var5++) {
            int var6 = var0.pixels[var3];
            if (var6 == 0) {
               if (var5 > 0 && var0.pixels[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && var0.pixels[var3 - var0.subWidth] != 0) {
                  var6 = var1;
               } else if (var5 < var0.subWidth - 1 && var0.pixels[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < var0.subHeight - 1 && var0.pixels[var3 + var0.subWidth] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      var0.pixels = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("bv")
   static void method12602(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      for (int var22 = -var10; var22 < 0; var22++) {
         for (int var21 = -var9; var21 < 0; var21++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 803646619) * var13;
               var0 = (var1 & -891676461) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 1526338957) + (var1 & 1585540920);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("bt")
   static void method12582(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var24 = var5; var24 < 0; var24++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("es")
   public void method12686(int var1, int var2, int var3, int var4) {
      this.method12688(this.width << 3, this.height << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIII)V")
   @ObfuscatedName("ix")
   public static void method12658(SpritePixels var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12697(var1, var1, var1, var1);
      }

      if (var3 == 256) {
         var0.method12650(var1, var2);
      } else {
         var1 += var0.xOffset;
         var2 += var0.yOffset;
         int var5 = var1 + var2 * Rasterizer2D_width;
         int var6 = 0;
         int var7 = var0.subHeight;
         int var8 = var0.subWidth;
         int var9 = Rasterizer2D_width - var8;
         int var10 = 0;
         if (var2 < Rasterizer2D_yClipStart) {
            int var11 = Rasterizer2D_yClipStart - var2;
            var7 -= var11;
            var2 = Rasterizer2D_yClipStart;
            var6 += var11 * var8;
            var5 += var11 * Rasterizer2D_width;
         }

         if (var2 + var7 > Rasterizer2D_yClipEnd) {
            var7 -= var2 + var7 - Rasterizer2D_yClipEnd;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var14 = Rasterizer2D_xClipStart - var1;
            var8 -= var14;
            var1 = Rasterizer2D_xClipStart;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Rasterizer2D_xClipEnd) {
            int var15 = var1 + var8 - Rasterizer2D_xClipEnd;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            Sprite_drawTransOverlay(Rasterizer2D_pixels, var0.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIII)V")
   @ObfuscatedName("ag")
   static void Sprite_drawScaled(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2 | 0xFF000000;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   public void method12627() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         int[] var1 = new int[this.width * this.height];

         for (int var2 = 0; var2 < this.subHeight; var2++) {
            for (int var3 = 0; var3 < this.subWidth; var3++) {
               var1[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.subWidth + var3];
            }
         }

         this.pixels = var1;
         this.subWidth = this.width;
         this.subHeight = this.height;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("ok")
   public static void method12635(SpritePixels var0) {
      if (var0 == null) {
         var0.method12636();
      }

      int[] var1 = new int[var0.subWidth * var0.subHeight];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.subHeight; var3++) {
         for (int var4 = var0.subWidth - 1; var4 >= 0; var4--) {
            var1[var2++] = var0.pixels[var4 + var3 * var0.subWidth];
         }
      }

      var0.pixels = var1;
      var0.xOffset = var0.width - var0.subWidth - var0.xOffset;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;IIIII)V")
   @ObfuscatedName("qm")
   public static void method12662(SpritePixels var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method12659(var1, var1, var1);
      } else if (var3 > 0 && var4 > 0) {
         int var6 = var0.subWidth;
         int var7 = var0.subHeight;
         int var8 = 0;
         int var9 = 0;
         int var10 = var0.width;
         int var11 = var0.height;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (var0.xOffset > 0) {
            int var14 = ((var0.xOffset << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (var0.xOffset << 16);
         }

         if (var0.yOffset > 0) {
            int var17 = ((var0.yOffset << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (var0.yOffset << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Rasterizer2D_width;
         int var15 = Rasterizer2D_width - var3;
         if (var2 + var4 > Rasterizer2D_yClipEnd) {
            var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
         }

         if (var2 < Rasterizer2D_yClipStart) {
            int var16 = Rasterizer2D_yClipStart - var2;
            var4 -= var16;
            var18 += var16 * Rasterizer2D_width;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Rasterizer2D_xClipEnd) {
            int var19 = var1 + var3 - Rasterizer2D_xClipEnd;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Rasterizer2D_xClipStart) {
            int var20 = Rasterizer2D_xClipStart - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         Sprite_drawTransScaled(Rasterizer2D_pixels, var0.pixels, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ej")
   void method12690(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.xOffset << 4;
         var2 -= this.yOffset << 4;
         double var7 = (var5 & -472872484) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.subWidth << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.subWidth << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.subHeight << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var17 = ((this.subWidth << 4) - var1) * var10 + ((this.subHeight << 4) - var2) * var9;
         int var18 = -((this.subWidth << 4) - var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + -2101607092 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Rasterizer2D_xClipStart) {
            var19 = Rasterizer2D_xClipStart;
         }

         if (var20 > Rasterizer2D_xClipEnd) {
            var20 = Rasterizer2D_xClipEnd;
         }

         if (var21 < Rasterizer2D_yClipStart) {
            var21 = Rasterizer2D_yClipStart;
         }

         if (var22 > Rasterizer2D_yClipEnd) {
            var22 = Rasterizer2D_yClipEnd;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Rasterizer2D_width + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += Rasterizer2D_width) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.pixels[(var36 >> 12) * this.subWidth + (var35 >> 12)];
                              if (var38 != 0) {
                                 Rasterizer2D_pixels[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += Rasterizer2D_width) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.subHeight << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.pixels[(var108 >> 12) * this.subWidth + (var100 >> 12)];
                              if (var124 != 0) {
                                 Rasterizer2D_pixels[var92++] = var124;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += Rasterizer2D_width) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.subHeight << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.pixels[(var109 >> 12) * this.subWidth + (var101 >> 12)];
                              if (var125 != 0) {
                                 Rasterizer2D_pixels[var93++] = var125;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += Rasterizer2D_width) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.subWidth << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.pixels[(var110 >> 12) * this.subWidth + (var102 >> 12)];
                              if (var126 != 0) {
                                 Rasterizer2D_pixels[var94++] = var126;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += Rasterizer2D_width) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.subWidth << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.subHeight << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = this.pixels[(var111 >> 12) * this.subWidth + (var103 >> 12)];
                           if (var127 != 0) {
                              Rasterizer2D_pixels[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += Rasterizer2D_width) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.subWidth << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (this.subHeight << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.pixels[(var112 >> 12) * this.subWidth + (var104 >> 12)];
                           if (var128 != 0) {
                              Rasterizer2D_pixels[var96++] = var128;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += Rasterizer2D_width) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.subWidth << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.pixels[(var113 >> 12) * this.subWidth + (var105 >> 12)];
                           if (var129 != 0) {
                              Rasterizer2D_pixels[var97++] = var129;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += Rasterizer2D_width) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (this.subWidth << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.subHeight << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = this.pixels[(var114 >> 12) * this.subWidth + (var106 >> 12)];
                        if (var130 != 0) {
                           Rasterizer2D_pixels[var98++] = var130;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += Rasterizer2D_width) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (this.subWidth << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.subHeight << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.pixels[(var115 >> 12) * this.subWidth + (var107 >> 12)];
                        if (var131 != 0) {
                           Rasterizer2D_pixels[var99++] = var131;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("er")
   void method12691(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.xOffset << 4;
         var2 -= this.yOffset << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.subWidth << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.subWidth << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.subHeight << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var17 = ((this.subWidth << 4) - var1) * var10 + ((this.subHeight << 4) - var2) * var9;
         int var18 = -((this.subWidth << 4) - var1) * var9 + ((this.subHeight << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Rasterizer2D_xClipStart) {
            var19 = Rasterizer2D_xClipStart;
         }

         if (var20 > Rasterizer2D_xClipEnd) {
            var20 = Rasterizer2D_xClipEnd;
         }

         if (var21 < Rasterizer2D_yClipStart) {
            var21 = Rasterizer2D_yClipStart;
         }

         if (var22 > Rasterizer2D_yClipEnd) {
            var22 = Rasterizer2D_yClipEnd;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Rasterizer2D_width + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += Rasterizer2D_width) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.pixels[(var36 >> 12) * this.subWidth + (var35 >> 12)];
                              if (var38 != 0) {
                                 Rasterizer2D_pixels[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += Rasterizer2D_width) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.subHeight << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.pixels[(var108 >> 12) * this.subWidth + (var100 >> 12)];
                              if (var124 != 0) {
                                 Rasterizer2D_pixels[var92++] = var124;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += Rasterizer2D_width) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.subHeight << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.pixels[(var109 >> 12) * this.subWidth + (var101 >> 12)];
                              if (var125 != 0) {
                                 Rasterizer2D_pixels[var93++] = var125;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += Rasterizer2D_width) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.subWidth << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.pixels[(var110 >> 12) * this.subWidth + (var102 >> 12)];
                              if (var126 != 0) {
                                 Rasterizer2D_pixels[var94++] = var126;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += Rasterizer2D_width) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.subWidth << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.subHeight << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = this.pixels[(var111 >> 12) * this.subWidth + (var103 >> 12)];
                           if (var127 != 0) {
                              Rasterizer2D_pixels[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += Rasterizer2D_width) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.subWidth << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (this.subHeight << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.pixels[(var112 >> 12) * this.subWidth + (var104 >> 12)];
                           if (var128 != 0) {
                              Rasterizer2D_pixels[var96++] = var128;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += Rasterizer2D_width) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.subWidth << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.pixels[(var113 >> 12) * this.subWidth + (var105 >> 12)];
                           if (var129 != 0) {
                              Rasterizer2D_pixels[var97++] = var129;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += Rasterizer2D_width) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (this.subWidth << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.subHeight << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = this.pixels[(var114 >> 12) * this.subWidth + (var106 >> 12)];
                        if (var130 != 0) {
                           Rasterizer2D_pixels[var98++] = var130;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += Rasterizer2D_width) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (this.subWidth << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.subHeight << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.pixels[(var115 >> 12) * this.subWidth + (var107 >> 12)];
                        if (var131 != 0) {
                           Rasterizer2D_pixels[var99++] = var131;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ha")
   public void method12695(int var1, int var2, int var3, int var4) {
      if (var3 <= this.width && var4 <= this.height) {
         int var5 = var1 + this.xOffset * var3 / this.width;
         int var6 = var1 + ((this.xOffset + this.subWidth) * var3 + this.width - 1) / this.width;
         int var7 = var2 + this.yOffset * var4 / this.height;
         int var8 = var2 + ((this.yOffset + this.subHeight) * var4 + this.height - 1) / this.height;
         if (var5 < Rasterizer2D_xClipStart) {
            var5 = Rasterizer2D_xClipStart;
         }

         if (var6 > Rasterizer2D_xClipEnd) {
            var6 = Rasterizer2D_xClipEnd;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D_yClipStart;
         }

         if (var8 > Rasterizer2D_yClipEnd) {
            var8 = Rasterizer2D_yClipEnd;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D_width + var5;
            int var10 = Rasterizer2D_width - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.width / var3 - (this.xOffset << 4);
                     int var16 = (var13 + 16) * this.width / var3 - (this.xOffset << 4);
                     int var17 = var14 * this.height / var4 - (this.yOffset << 4);
                     int var18 = (var14 + 16) * this.height / var4 - (this.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.subWidth << 4) {
                           var16 = this.subWidth << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.subHeight << 4) {
                           var18 = this.subHeight << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = this.pixels[var28 * this.subWidth + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 0xFF) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 0xFF) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   public void method12636() {
      int[] var1 = new int[this.width * this.height];
      int var2 = 0;

      for (int var3 = 0; var3 < this.xOffset; var3++) {
         for (int var4 = this.xOffset - 1; var4 >= 0; var4--) {
            var1[var2++] = this.pixels[var4 + var3 * this.height];
         }
      }

      this.pixels = var1;
      this.subHeight = this.subWidth - this.height - this.subWidth;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   public void pad(int var1) {
      for (int var2 = this.subWidth - 1; var2 > 0; var2--) {
         int var3 = var2 * this.subWidth;

         for (int var4 = this.xOffset - 1; var4 > 0; var4--) {
            if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subHeight] != 0) {
               this.pixels[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   public void shadow(int var1) {
      for (int var2 = this.xOffset - 1; var2 > 0; var2--) {
         int var3 = var2 * this.width;

         for (int var4 = this.height - 1; var4 > 0; var4--) {
            if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) {
               this.pixels[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("bg")
   public void method12673(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.subHeight <= var6 ? this.height : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.width > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * Rasterizer2D.Rasterizer2D_height;
      int var14 = var2 + var9;

      for (int var15 = var9; var15 < var10; var15++) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.width <= var16 + var17) {
            var12 = this.height;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.pixels[var20 + var15 * this.subWidth];
            if (var21 != 0) {
               Rasterizer2D_pixels[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += Rasterizer2D.Rasterizer2D_xClipStart;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bk")
   public void method12696(int var1, int var2, int var3, int var4) {
      if (var3 <= this.subWidth && var4 <= this.xOffset) {
         int var5 = var1 + this.xOffset * var3 / this.xOffset;
         int var6 = var1 + ((this.width + this.height) * var3 + this.subWidth - 1) / this.height;
         int var7 = var2 + this.yOffset * var4 / this.subWidth;
         int var8 = var2 + ((this.yOffset + this.xOffset) * var4 + this.xOffset - 1) / this.width;
         if (var5 < Rasterizer2D.Rasterizer2D_yClipStart) {
            var5 = Rasterizer2D_xClipStart;
         }

         if (var6 > Rasterizer2D.Rasterizer2D_yClipStart) {
            var6 = Rasterizer2D.Rasterizer2D_xClipStart;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D_yClipStart;
         }

         if (var8 > Rasterizer2D.Rasterizer2D_xClipEnd) {
            var8 = Rasterizer2D.Rasterizer2D_xClipEnd;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D.Rasterizer2D_height + var5;
            int var10 = Rasterizer2D.Rasterizer2D_height - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.height / var3 - (this.width << 4);
                     int var16 = (var13 + 16) * this.subHeight / var3 - (this.height << 4);
                     int var17 = var14 * this.xOffset / var4 - (this.yOffset << 4);
                     int var18 = (var14 + 16) * this.xOffset / var4 - (this.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.xOffset << 4) {
                           var16 = this.subHeight << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.xOffset << 4) {
                           var18 = this.subHeight << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = this.pixels[var28 * this.xOffset + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & -1478098165) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 118704431) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   public void method12628() {
      if (this.subHeight != this.subHeight || this.height != this.subWidth) {
         int[] var1 = new int[this.height * this.height];

         for (int var2 = 0; var2 < this.width; var2++) {
            for (int var3 = 0; var3 < this.subWidth; var3++) {
               var1[(var2 + this.yOffset) * this.width + var3 + this.xOffset] = this.pixels[var2 * this.xOffset + var3];
            }
         }

         this.pixels = var1;
         this.height = this.width;
         this.subWidth = this.subHeight;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cj")
   public void method12641(int var1) {
      int[] var2 = new int[this.height * this.subWidth];
      int var3 = 0;

      for (int var4 = 0; var4 < this.xOffset; var4++) {
         for (int var5 = 0; var5 < this.subWidth; var5++) {
            int var6 = this.pixels[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.pixels[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.pixels[var3 - this.width] != 0) {
                  var6 = var1;
               } else if (var5 < this.height - 1 && this.pixels[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.subHeight - 1 && this.pixels[var3 + this.width] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.pixels = var2;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dt")
   public void method12697(int var1, int var2, int var3, int var4) {
      if (var3 <= this.subHeight && var4 <= this.width) {
         int var5 = var1 + this.subWidth * var3 / this.height;
         int var6 = var1 + ((this.xOffset + this.subHeight) * var3 + this.width - 1) / this.subWidth;
         int var7 = var2 + this.yOffset * var4 / this.height;
         int var8 = var2 + ((this.yOffset + this.subWidth) * var4 + this.subWidth - 1) / this.subWidth;
         if (var5 < Rasterizer2D.Rasterizer2D_height) {
            var5 = Rasterizer2D.Rasterizer2D_xClipEnd;
         }

         if (var6 > Rasterizer2D.Rasterizer2D_height) {
            var6 = Rasterizer2D.Rasterizer2D_yClipEnd;
         }

         if (var7 < Rasterizer2D_yClipStart) {
            var7 = Rasterizer2D.Rasterizer2D_width;
         }

         if (var8 > Rasterizer2D.Rasterizer2D_height) {
            var8 = Rasterizer2D.Rasterizer2D_width;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * Rasterizer2D.Rasterizer2D_height + var5;
            int var10 = Rasterizer2D.Rasterizer2D_xClipStart - (var6 - var5);
            if (var9 < Rasterizer2D_pixels.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.height / var3 - (this.height << 4);
                     int var16 = (var13 + 16) * this.xOffset / var3 - (this.subWidth << 4);
                     int var17 = var14 * this.subHeight / var4 - (this.yOffset << 4);
                     int var18 = (var14 + 16) * this.xOffset / var4 - (this.yOffset << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.width << 4) {
                           var16 = this.subHeight << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.width << 4) {
                           var18 = this.subWidth << 4;
                        }

                        var16--;
                        var18--;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        for (int var28 = var17; var28 <= var18; var28++) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for (int var30 = var15; var30 <= var16; var30++) {
                              int var31 = this.pixels[var28 * this.xOffset + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & -1478098165) * var32;
                                 var25 += (var31 >> 8 & 0xFF) * var32;
                                 var26 += (var31 & 118704431) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           Rasterizer2D_pixels[var9] = var39;
                        }

                        var9++;
                     }
                  }

                  var9 += var10;
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void setRaster() {
      Rasterizer2D_init(this.pixels, this.height, this.subHeight, null);
   }
}
