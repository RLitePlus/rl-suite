import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xs")
public class Rasterizer2D extends DualNode {
   @ObfuscatedName("aq")
   public static int Rasterizer2D_width;
   @ObfuscatedName("aa")
   public static int[] Rasterizer2D_pixels;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final float field6610 = 0.0F;
   @ObfuscatedName("bs")
   public static int Rasterizer2D_yClipEnd = 0;
   @ObfuscatedName("bo")
   public static float[] Rasterizer2D_brightness;
   @ObfuscatedName("bg")
   public static int Rasterizer2D_yClipStart = 0;
   @ObfuscatedName("be")
   public static int Rasterizer2D_height;
   @ObfuscatedName("bz")
   public static int Rasterizer2D_xClipStart = 0;
   @ObfuscatedName("bk")
   public static int Rasterizer2D_xClipEnd = 0;

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ey")
   public static void Rasterizer2D_drawCircleAlpha(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            drawCircle(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var12 = var1 - var2;
            if (var12 < Rasterizer2D_yClipStart) {
               var12 = Rasterizer2D_yClipStart;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > Rasterizer2D_yClipEnd) {
               var13 = Rasterizer2D_yClipEnd;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < Rasterizer2D_xClipStart) {
                  var20 = Rasterizer2D_xClipStart;
               }

               int var21 = var0 + var16;
               if (var21 > Rasterizer2D_xClipEnd) {
                  var21 = Rasterizer2D_xClipEnd;
               }

               int var22 = var20 + var14 * Rasterizer2D_width;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (Rasterizer2D_pixels[var22] >> 16 & 0xFF) * var5;
                  int var10 = (Rasterizer2D_pixels[var22] >> 8 & 0xFF) * var5;
                  int var11 = (Rasterizer2D_pixels[var22] & 0xFF) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  client.method2488(Rasterizer2D_pixels, var22++, var24, var4);
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < Rasterizer2D_xClipStart) {
                  var33 = Rasterizer2D_xClipStart;
               }

               int var34 = var0 + var16;
               if (var34 > Rasterizer2D_xClipEnd - 1) {
                  var34 = Rasterizer2D_xClipEnd - 1;
               }

               int var35 = var33 + var14 * Rasterizer2D_width;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (Rasterizer2D_pixels[var35] >> 16 & 0xFF) * var5;
                  int var26 = (Rasterizer2D_pixels[var35] >> 8 & 0xFF) * var5;
                  int var27 = (Rasterizer2D_pixels[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  client.method2488(Rasterizer2D_pixels, var35++, var37, var4);
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("em")
   protected static void Rasterizer2D_init(int[] var0, int var1, int var2, float[] var3) {
      Rasterizer2D_pixels = var0;
      Rasterizer2D_width = var1;
      Rasterizer2D_height = var2;
      Rasterizer2D_brightness = var3;
      Rasterizer2D_setClip(0, 0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eg")
   public static void Rasterizer2D_resetClip() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("el")
   public static void Rasterizer2D_setClip(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > Rasterizer2D_width) {
         var2 = Rasterizer2D_width;
      }

      if (var3 > Rasterizer2D_height) {
         var3 = Rasterizer2D_height;
      }

      Rasterizer2D_xClipStart = var0;
      Rasterizer2D_yClipStart = var1;
      Rasterizer2D_xClipEnd = var2;
      Rasterizer2D_yClipEnd = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ep")
   public static void Rasterizer2D_expandClip(int var0, int var1, int var2, int var3) {
      if (Rasterizer2D_xClipStart < var0) {
         Rasterizer2D_xClipStart = var0;
      }

      if (Rasterizer2D_yClipStart < var1) {
         Rasterizer2D_yClipStart = var1;
      }

      if (Rasterizer2D_xClipEnd > var2) {
         Rasterizer2D_xClipEnd = var2;
      }

      if (Rasterizer2D_yClipEnd > var3) {
         Rasterizer2D_yClipEnd = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("et")
   public static void Rasterizer2D_getClipArray(int[] var0) {
      var0[0] = Rasterizer2D_xClipStart;
      var0[1] = Rasterizer2D_yClipStart;
      var0[2] = Rasterizer2D_xClipEnd;
      var0[3] = Rasterizer2D_yClipEnd;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("ex")
   public static void Rasterizer2D_setClipArray(int[] var0) {
      Rasterizer2D_xClipStart = var0[0];
      Rasterizer2D_yClipStart = var0[1];
      Rasterizer2D_xClipEnd = var0[2];
      Rasterizer2D_yClipEnd = var0[3];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fi")
   public static void clearBrightness() {
      if (!SecureUrlRequester.client.isGpu() && Rasterizer2D_brightness != null) {
         if (Rasterizer2D_xClipStart == 0
            && Rasterizer2D_xClipEnd == Rasterizer2D_width
            && Rasterizer2D_yClipStart == 0
            && Rasterizer2D_yClipEnd == Rasterizer2D_height) {
            int var16 = Rasterizer2D_brightness.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; Rasterizer2D_brightness[var18++] = 0.0F) {
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
            }

            while (var18 < var16) {
               Rasterizer2D_brightness[var18++] = 0.0F;
            }
         } else {
            int var0 = Rasterizer2D_xClipEnd - Rasterizer2D_xClipStart;
            int var1 = Rasterizer2D_yClipEnd - Rasterizer2D_yClipStart;
            int var2 = Rasterizer2D_width - var0;
            int var3 = Rasterizer2D_xClipStart + Rasterizer2D_yClipStart * Rasterizer2D_width;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     Rasterizer2D_brightness[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eu")
   static void drawCircle(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            int var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            int var14 = var12 + var6 * Rasterizer2D_width;

            for (int var15 = var12; var15 < var13; var15++) {
               Rasterizer2D_pixels[var14++] = var3 | 0xFF000000;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < Rasterizer2D_xClipStart) {
               var21 = Rasterizer2D_xClipStart;
            }

            int var22 = var0 + var8;
            if (var22 > Rasterizer2D_xClipEnd - 1) {
               var22 = Rasterizer2D_xClipEnd - 1;
            }

            int var23 = var21 + var6 * Rasterizer2D_width;

            for (int var24 = var21; var24 <= var22; var24++) {
               Rasterizer2D_pixels[var23++] = var3 | 0xFF000000;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fp")
   static void Rasterizer2D_drawHorizontalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            client.method2488(Rasterizer2D_pixels, var12++, var14, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ev")
   public static void Rasterizer2D_fillRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = Rasterizer2D_width - var2;
      int var8 = var0 + var1 * Rasterizer2D_width;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = Rasterizer2D_pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            client.method2488(Rasterizer2D_pixels, var8++, var4 + var11, var5);
         }

         var8 += var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hj")
   static void method12559(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var5 = 601979791 - var4;
         int var6 = (var3 >> 16 & 342452417) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 1202311434) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12] = var14;
            var12 += Rasterizer2D_width;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eh")
   public static void Rasterizer2D_fillRectangleGradient(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var6 += (Rasterizer2D_yClipStart - var1) * var7;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var8 = Rasterizer2D_width - var2;
         int var9 = var0 + var1 * Rasterizer2D_width;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               Rasterizer2D_pixels[var9++] = var13 | 0xFF000000;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("eo")
   public static void Rasterizer2D_fillRectangleGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = Rasterizer2D_width;
      int var9 = Rasterizer2D_xClipStart;
      int var10 = Rasterizer2D_yClipStart;
      int var11 = Rasterizer2D_xClipEnd;
      int var12 = Rasterizer2D_yClipEnd;
      int[] var13 = Rasterizer2D_pixels;
      if (!SecureUrlRequester.client.isGpu()) {
         int var34 = var7;
         int var33 = var6;
         int var32 = var5;
         int var31 = var4;
         int var30 = var3;
         int var29 = var2;
         int var28 = var1;
         int var27 = var0;
         if (var2 > 0 && var3 > 0) {
            int var35 = 0;
            int var36 = 65536 / var3;
            if (var0 < Rasterizer2D_xClipStart) {
               var29 = var2 - (Rasterizer2D_xClipStart - var0);
               var27 = Rasterizer2D_xClipStart;
            }

            if (var1 < Rasterizer2D_yClipStart) {
               var35 += (Rasterizer2D_yClipStart - var1) * var36;
               var30 = var3 - (Rasterizer2D_yClipStart - var1);
               var28 = Rasterizer2D_yClipStart;
            }

            if (var27 + var29 > Rasterizer2D_xClipEnd) {
               var29 = Rasterizer2D_xClipEnd - var27;
            }

            if (var28 + var30 > Rasterizer2D_yClipEnd) {
               var30 = Rasterizer2D_yClipEnd - var28;
            }

            int var37 = Rasterizer2D_width - var29;
            int var38 = var27 + var28 * Rasterizer2D_width;

            for (int var39 = -var30; var39 < 0; var39++) {
               int var40 = 65536 - var35 >> 8;
               int var41 = var35 >> 8;
               int var42 = (var33 * var40 + var34 * var41 & 0xFF00) >>> 8;
               if (var42 == 0) {
                  var38 += Rasterizer2D_width;
                  var35 += var36;
               } else {
                  int var43 = ((var31 & 16711935) * var40 + (var32 & 16711935) * var41 & -16711936)
                        + ((var31 & 0xFF00) * var40 + (var32 & 0xFF00) * var41 & 0xFF0000)
                     >>> 8;
                  int var44 = 255 - var42;
                  int var45 = ((var43 & 16711935) * var42 >> 8 & 16711935) + ((var43 & 0xFF00) * var42 >> 8 & 0xFF00);

                  for (int var46 = -var29; var46 < 0; var46++) {
                     int var47 = Rasterizer2D_pixels[var38];
                     if (var47 == 0) {
                        Rasterizer2D_pixels[var38++] = var45;
                     } else {
                        var47 = ((var47 & 16711935) * var44 >> 8 & 16711935) + ((var47 & 0xFF00) * var44 >> 8 & 0xFF00);
                        Rasterizer2D_pixels[var38++] = var45 + var47;
                     }
                  }

                  var38 += var37;
                  var35 += var36;
               }
            }
         }
      } else {
         if (var2 > 0 && var3 > 0) {
            int var14 = 0;
            int var15 = 65536 / var3;
            if (var0 < var9) {
               var2 -= var9 - var0;
               var0 = var9;
            }

            if (var1 < var10) {
               var14 += (var10 - var1) * var15;
               var3 -= var10 - var1;
               var1 = var10;
            }

            if (var0 + var2 > var11) {
               var2 = var11 - var0;
            }

            if (var3 + var1 > var12) {
               var3 = var12 - var1;
            }

            int var16 = var8 - var2;
            int var17 = var0 + var8 * var1;

            for (int var18 = -var3; var18 < 0; var18++) {
               int var19 = 65536 - var14 >> 8;
               int var20 = var14 >> 8;
               int var21 = (var19 * var6 + var20 * var7 & 0xFF00) >>> 8;
               if (var21 == 0) {
                  var17 += var8;
                  var14 += var15;
               } else {
                  int var22 = (var20 * (var5 & 16711935) + var19 * (var4 & 16711935) & -16711936)
                        + (var20 * (var5 & 0xFF00) + var19 * (var4 & 0xFF00) & 0xFF0000)
                     >>> 8;
                  int var23 = 255 - var21;
                  int var24 = ((var22 & 16711935) * var21 >> 8 & 16711935) + (var21 * (var22 & 0xFF00) >> 8 & 0xFF00);

                  for (int var25 = -var2; var25 < 0; var25++) {
                     int var26 = var13[var17];
                     var26 = ((var26 & 16711935) * var23 >> 8 & 16711935) + (var23 * (var26 & 0xFF00) >> 8 & 0xFF00);
                     client.method2488(var13, var17++, var24 + var26, var21);
                  }

                  var17 += var16;
                  var14 += var15;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fu")
   public static void method12509(int[] var0) {
      var0[0] = Rasterizer2D_xClipStart;
      var0[1] = Rasterizer2D_yClipStart;
      var0[2] = Rasterizer2D_xClipEnd;
      var0[3] = Rasterizer2D_yClipEnd;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fm")
   static void method12516(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            int var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            int var14 = var12 + var6 * Rasterizer2D_width;

            for (int var15 = var12; var15 < var13; var15++) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < Rasterizer2D_xClipStart) {
               var21 = Rasterizer2D_xClipStart;
            }

            int var22 = var0 + var8;
            if (var22 > Rasterizer2D_xClipEnd - 1) {
               var22 = Rasterizer2D_xClipEnd - 1;
            }

            int var23 = var21 + var6 * Rasterizer2D_width;

            for (int var24 = var21; var24 <= var22; var24++) {
               Rasterizer2D_pixels[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("hi")
   public static void method12555(int var0, int var1, int var2, int var3) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fy")
   public static void method12506(int var0, int var1, int var2, int var3) {
      if (Rasterizer2D_xClipStart < var0) {
         Rasterizer2D_xClipStart = var0;
      }

      if (Rasterizer2D_yClipStart < var1) {
         Rasterizer2D_yClipStart = var1;
      }

      if (Rasterizer2D_xClipEnd > var2) {
         Rasterizer2D_xClipEnd = var2;
      }

      if (Rasterizer2D_yClipEnd > var3) {
         Rasterizer2D_yClipEnd = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public static void Rasterizer2D_clear() {
      int var0 = 0;

      int var1;
      for (var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) {
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         Rasterizer2D_pixels[var0++] = 0;
      }

      clearBrightness();
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fb")
   public static void Rasterizer2D_drawVerticalLine(int var0, int var1, int var2, int var3) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3 | 0xFF000000;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gn")
   public static void method12523(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      var4 = ((var4 & 646309791) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = Rasterizer2D_width - var2;
      int var8 = var0 + var1 * Rasterizer2D_width;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = Rasterizer2D_pixels[var8];
            var11 = ((var11 & 1311964936) * var6 >> 8 & 16711935) + ((var11 & -1690461932) * var6 >> 8 & 0xFF00);
            Rasterizer2D_pixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fl")
   public static void Rasterizer2D_drawLine(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4 | 0xFF000000;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var17 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= Rasterizer2D_xClipStart && var18 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var18 + var1 * Rasterizer2D_width] = var4 | 0xFF000000;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fh")
   static void Rasterizer2D_setPixel(int var0, int var1, int var2) {
      if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) {
         Rasterizer2D_pixels[var0 + var1 * Rasterizer2D_width] = var2 | 0xFF000000;
      }
   }

   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("fs")
   public static void Rasterizer2D_fillMaskedRectangle(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * Rasterizer2D_width;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            Rasterizer2D_pixels[var6++] = var2 | 0xFF000000;
         }

         var5 += Rasterizer2D_width;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("ed")
   public static void Rasterizer2D_drawGradientPixels(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      int var9 = Rasterizer2D_width;
      int var10 = Rasterizer2D_height;
      int[] var11 = Rasterizer2D_pixels;
      if (!SecureUrlRequester.client.isGpu()) {
         int var35 = var7;
         byte[] var34 = var6;
         int var33 = var5;
         int var32 = var4;
         int var31 = var3;
         int var30 = var2;
         int var29 = var1;
         int var28 = var0;
         boolean var36 = true;
         if (var0 + var2 >= 0 && var1 + var3 >= 0 && var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var37 = 0;
            int var38 = 0;
            if (var0 < 0) {
               var37 -= var0;
               var30 = var2 + var0;
            }

            if (var1 < 0) {
               var38 -= var1;
               var31 = var3 + var1;
            }

            if (var0 + var30 > Rasterizer2D_width) {
               var30 = Rasterizer2D_width - var0;
            }

            if (var1 + var31 > Rasterizer2D_height) {
               var31 = Rasterizer2D_height - var1;
            }

            int var39 = var6.length / var7;
            int var40 = Rasterizer2D_width - var30;
            int var41 = var4 >>> 24;
            int var42 = var5 >>> 24;
            if (!var36 || var41 == 255 && var42 == 255) {
               int var58 = (var1 + var38) * Rasterizer2D_width + var0 + var37;

               for (int var59 = var1 + var38; var59 < var29 + var38 + var31; var59++) {
                  for (int var60 = var28 + var37; var60 < var28 + var37 + var30; var60++) {
                     int var61 = (var59 - var29) % var39;
                     int var62 = (var60 - var28) % var35;
                     if (var34[var61 * var35 + var62] != 0) {
                        Rasterizer2D_pixels[var58++] = var33;
                     } else {
                        Rasterizer2D_pixels[var58++] = var32;
                     }
                  }

                  var58 += var40;
               }
            } else {
               int var43 = (var1 + var38) * Rasterizer2D_width + var0 + var37;

               for (int var44 = var1 + var38; var44 < var29 + var38 + var31; var44++) {
                  for (int var45 = var28 + var37; var45 < var28 + var37 + var30; var45++) {
                     int var46 = (var44 - var29) % var39;
                     int var47 = (var45 - var28) % var35;
                     int var48 = var32;
                     if (var34[var46 * var35 + var47] != 0) {
                        var48 = var33;
                     }

                     int var49 = var48 >>> 24;
                     int var50 = 255 - var49;
                     int var51 = Rasterizer2D_pixels[var43];
                     int var52 = ((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936)
                           + ((var48 & 0xFF00) * var49 + (var51 & 0xFF00) * var50 & 0xFF0000)
                        >> 8;
                     Rasterizer2D_pixels[var43++] = var52;
                  }

                  var43 += var40;
               }
            }
         }
      } else {
         if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < var9 && var1 < var10) {
            int var12 = 0;
            int var13 = 0;
            if (var0 < 0) {
               var12 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var13 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > var9) {
               var2 = var9 - var0;
            }

            if (var3 + var1 > var10) {
               var3 = var10 - var1;
            }

            int var14 = var6.length / var7;
            int var15 = var9 - var2;
            int var16 = var4 >>> 24;
            int var17 = var5 >>> 24;
            if (var16 == 255 && var17 == 255) {
               int var53 = var0 + var12 + (var13 + var1) * var9;

               for (int var54 = var13 + var1; var54 < var3 + var13 + var1; var54++) {
                  for (int var55 = var0 + var12; var55 < var0 + var12 + var2; var55++) {
                     int var56 = (var54 - var1) % var14;
                     int var57 = (var55 - var0) % var7;
                     if (var6[var57 + var56 * var7] != 0) {
                        var11[var53++] = var5;
                     } else {
                        var11[var53++] = var4;
                     }
                  }

                  var53 += var15;
               }
            } else {
               int var18 = var0 + var12 + (var13 + var1) * var9;

               for (int var19 = var13 + var1; var19 < var3 + var13 + var1; var19++) {
                  for (int var20 = var0 + var12; var20 < var0 + var12 + var2; var20++) {
                     int var21 = (var19 - var1) % var14;
                     int var22 = (var20 - var0) % var7;
                     int var23 = var4;
                     if (var6[var22 + var21 * var7] != 0) {
                        var23 = var5;
                     }

                     int var24 = var23 >>> 24;
                     int var25 = 255 - var24;
                     int var26 = var11[var18];
                     int var27 = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936)
                           + (var24 * (var23 & 0xFF00) + var25 * (var26 & 0xFF00) & 0xFF0000)
                        >> 8;
                     client.method2488(var11, var18++, var27, var24);
                  }

                  var18 += var15;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fg")
   public static void adjustBrightness() {
      if (Rasterizer2D_brightness != null) {
         int var0 = Rasterizer2D_brightness.length;

         for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Rasterizer2D_width < Rasterizer2D_width / 2 && Rasterizer2D_brightness[var1] > 0.0F) {
               float var3 = Rasterizer2D_brightness[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               Rasterizer2D_pixels[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }
      }
   }

   protected Rasterizer2D() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ft")
   public static void method12498() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fw")
   public static void method12507(int var0, int var1, int var2, int var3) {
      if (Rasterizer2D_xClipStart < var0) {
         Rasterizer2D_xClipStart = var0;
      }

      if (Rasterizer2D_yClipStart < var1) {
         Rasterizer2D_yClipStart = var1;
      }

      if (Rasterizer2D_xClipEnd > var2) {
         Rasterizer2D_xClipEnd = var2;
      }

      if (Rasterizer2D_yClipEnd > var3) {
         Rasterizer2D_yClipEnd = var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fz")
   public static void method12499() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fk")
   public static void method12500() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fo")
   public static void method12501() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fe")
   public static void method12504(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > Rasterizer2D_width) {
         var2 = Rasterizer2D_width;
      }

      if (var3 > Rasterizer2D_height) {
         var3 = Rasterizer2D_height;
      }

      Rasterizer2D_xClipStart = var0;
      Rasterizer2D_yClipStart = var1;
      Rasterizer2D_xClipEnd = var2;
      Rasterizer2D_yClipEnd = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gs")
   public static void method12531(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = -400299623 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var6 += (Rasterizer2D_yClipStart - var1) * var7;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var8 = Rasterizer2D_width - var2;
         int var9 = var0 + var1 * Rasterizer2D_width;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 1105246448 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & -15949437) * var11 + (var5 & 16711935) * var12 & 236232514) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & -893443013)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               Rasterizer2D_pixels[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ez")
   public static void Rasterizer2D_fillRectangle(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      int var5 = Rasterizer2D_width - var2;
      int var6 = var0 + var1 * Rasterizer2D_width;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            Rasterizer2D_pixels[var6++] = var4 | 0xFF000000;
         }

         var6 += var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hz")
   public static void method12563(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var17 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= Rasterizer2D_xClipStart && var18 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var18 + var1 * Rasterizer2D_width] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fv")
   public static void method12511(int[] var0) {
      Rasterizer2D_xClipStart = var0[0];
      Rasterizer2D_yClipStart = var0[1];
      Rasterizer2D_xClipEnd = var0[2];
      Rasterizer2D_yClipEnd = var0[3];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fx")
   public static void method12513() {
      int var0 = 0;

      int var1;
      for (var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) {
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         Rasterizer2D_pixels[var0++] = 0;
      }

      clearBrightness();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gc")
   static void method12550(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fn")
   static void Rasterizer2D_drawVerticalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            client.method2488(Rasterizer2D_pixels, var12, var14, var4);
            var12 += Rasterizer2D_width;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fd")
   static void method12517(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            int var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            int var14 = var12 + var6 * Rasterizer2D_width;

            for (int var15 = var12; var15 < var13; var15++) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < Rasterizer2D_xClipStart) {
               var21 = Rasterizer2D_xClipStart;
            }

            int var22 = var0 + var8;
            if (var22 > Rasterizer2D_xClipEnd - 1) {
               var22 = Rasterizer2D_xClipEnd - 1;
            }

            int var23 = var21 + var6 * Rasterizer2D_width;

            for (int var24 = var21; var24 <= var22; var24++) {
               Rasterizer2D_pixels[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fa")
   static void method12518(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            int var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            int var14 = var12 + var6 * Rasterizer2D_width;

            for (int var15 = var12; var15 < var13; var15++) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < Rasterizer2D_xClipStart) {
               var21 = Rasterizer2D_xClipStart;
            }

            int var22 = var0 + var8;
            if (var22 > Rasterizer2D_xClipEnd - 1) {
               var22 = Rasterizer2D_xClipEnd - 1;
            }

            int var23 = var21 + var6 * Rasterizer2D_width;

            for (int var24 = var21; var24 <= var22; var24++) {
               Rasterizer2D_pixels[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fc")
   static void method12519(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         Rasterizer2D_setPixel(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < Rasterizer2D_yClipStart) {
            var4 = Rasterizer2D_yClipStart;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > Rasterizer2D_yClipEnd) {
            var5 = Rasterizer2D_yClipEnd;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < Rasterizer2D_xClipStart) {
               var12 = Rasterizer2D_xClipStart;
            }

            int var13 = var0 + var8;
            if (var13 > Rasterizer2D_xClipEnd) {
               var13 = Rasterizer2D_xClipEnd;
            }

            int var14 = var12 + var6 * Rasterizer2D_width;

            for (int var15 = var12; var15 < var13; var15++) {
               Rasterizer2D_pixels[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < Rasterizer2D_xClipStart) {
               var21 = Rasterizer2D_xClipStart;
            }

            int var22 = var0 + var8;
            if (var22 > Rasterizer2D_xClipEnd - 1) {
               var22 = Rasterizer2D_xClipEnd - 1;
            }

            int var23 = var21 + var6 * Rasterizer2D_width;

            for (int var24 = var21; var24 <= var22; var24++) {
               Rasterizer2D_pixels[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fr")
   public static void method12521(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == -314135294) {
            drawCircle(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 1274669715) * var4;
            int var7 = (var3 >> 8 & -240817708) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var12 = var1 - var2;
            if (var12 < Rasterizer2D_yClipStart) {
               var12 = Rasterizer2D_yClipStart;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > Rasterizer2D_yClipEnd) {
               var13 = Rasterizer2D_yClipEnd;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < Rasterizer2D_xClipStart) {
                  var20 = Rasterizer2D_xClipStart;
               }

               int var21 = var0 + var16;
               if (var21 > Rasterizer2D_xClipEnd) {
                  var21 = Rasterizer2D_xClipEnd;
               }

               int var22 = var20 + var14 * Rasterizer2D_width;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (Rasterizer2D_pixels[var22] >> 16 & 17083993) * var5;
                  int var10 = (Rasterizer2D_pixels[var22] >> 8 & 1627523506) * var5;
                  int var11 = (Rasterizer2D_pixels[var22] & -1355601816) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  Rasterizer2D_pixels[var22++] = var24;
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < Rasterizer2D_xClipStart) {
                  var33 = Rasterizer2D_xClipStart;
               }

               int var34 = var0 + var16;
               if (var34 > Rasterizer2D_xClipEnd - 1) {
                  var34 = Rasterizer2D_xClipEnd - 1;
               }

               int var35 = var33 + var14 * Rasterizer2D_width;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (Rasterizer2D_pixels[var35] >> 16 & 0xFF) * var5;
                  int var26 = (Rasterizer2D_pixels[var35] >> 8 & -1819801090) * var5;
                  int var27 = (Rasterizer2D_pixels[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  Rasterizer2D_pixels[var35++] = var37;
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gp")
   static void method12551(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & -317381526) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & -842679996) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laf;Ljava/awt/Component;)V")
   @ObfuscatedName("nj")
   public static void method12495(MouseWheelHandler var0, Component var1) {
      if (var0 == null) {
         var0.method80(var1);
      }

      var1.addMouseWheelListener(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gu")
   public static void method12524(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      var4 = ((var4 & 934261081) * var5 >> 8 & 238419867) + ((var4 & 0xFF00) * var5 >> 8 & 1403064408);
      int var6 = 1161539429 - var5;
      int var7 = Rasterizer2D_width - var2;
      int var8 = var0 + var1 * Rasterizer2D_width;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = Rasterizer2D_pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & -1303276788) * var6 >> 8 & 0xFF00);
            Rasterizer2D_pixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gm")
   public static void method12525(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = Rasterizer2D_width - var2;
      int var8 = var0 + var1 * Rasterizer2D_width;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = Rasterizer2D_pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            Rasterizer2D_pixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gf")
   public static void method12527(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      int var5 = Rasterizer2D_width - var2;
      int var6 = var0 + var1 * Rasterizer2D_width;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            Rasterizer2D_pixels[var6++] = var4;
         }

         var6 += var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fj")
   public static void method12514() {
      int var0 = 0;

      int var1;
      for (var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) {
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
         Rasterizer2D_pixels[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         Rasterizer2D_pixels[var0++] = 0;
      }

      clearBrightness();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("go")
   public static void method12528(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      int var5 = Rasterizer2D_width - var2;
      int var6 = var0 + var1 * Rasterizer2D_width;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            Rasterizer2D_pixels[var6++] = var4;
         }

         var6 += var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("gw")
   public static void method12537(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > Rasterizer2D_width) {
               var2 = Rasterizer2D_width - var0;
            }

            if (var1 + var3 > Rasterizer2D_height) {
               var3 = Rasterizer2D_height - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D_width - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (var8 && (var13 != 255 || var14 != 279873645)) {
               int var25 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     int var20 = var4;
                     if (var6[var28 * var7 + var29] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D_pixels[var25];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936)
                           + ((var20 & 845463663) * var21 + (var23 & 1228014131) * var22 & 0xFF0000)
                        >> 8;
                     Rasterizer2D_pixels[var25++] = var24;
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        Rasterizer2D_pixels[var15++] = var5;
                     } else {
                        Rasterizer2D_pixels[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gg")
   public static void method12532(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var6 += (Rasterizer2D_yClipStart - var1) * var7;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var8 = Rasterizer2D_width - var2;
         int var9 = var0 + var1 * Rasterizer2D_width;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & -1387046877) * var11 + (var5 & 418180306) * var12 & -16711936)
                  + ((var4 & -1600467018) * var11 + (var5 & 1991509839) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               Rasterizer2D_pixels[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gr")
   static void method12552(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("gy")
   public static void method12533(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var8 += (Rasterizer2D_yClipStart - var1) * var9;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var10 = Rasterizer2D_width - var2;
         int var11 = var0 + var1 * Rasterizer2D_width;

         for (int var12 = -var3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
               var11 += Rasterizer2D_width;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & 0xFF0000)
                  >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

               for (int var19 = -var2; var19 < 0; var19++) {
                  int var20 = Rasterizer2D_pixels[var11];
                  if (var20 == 0) {
                     Rasterizer2D_pixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                     Rasterizer2D_pixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("gj")
   public static void method12534(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var8 += (Rasterizer2D_yClipStart - var1) * var9;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var10 = Rasterizer2D_width - var2;
         int var11 = var0 + var1 * Rasterizer2D_width;

         for (int var12 = -var3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
               var11 += Rasterizer2D_width;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & 0xFF0000)
                  >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

               for (int var19 = -var2; var19 < 0; var19++) {
                  int var20 = Rasterizer2D_pixels[var11];
                  if (var20 == 0) {
                     Rasterizer2D_pixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                     Rasterizer2D_pixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("gk")
   public static void method12535(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = -1477212748 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var8 += (Rasterizer2D_yClipStart - var1) * var9;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var10 = Rasterizer2D_width - var2;
         int var11 = var0 + var1 * Rasterizer2D_width;

         for (int var12 = -var3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 587654508) >>> 8;
            if (var15 == 0) {
               var11 += Rasterizer2D_width;
               var8 += var9;
            } else {
               int var16 = ((var4 & -81422601) * var13 + (var5 & -166838027) * var14 & -16711936)
                     + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & -909441416)
                  >>> 8;
               int var17 = -1838611641 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & -1716175322) * var15 >> 8 & 50289595);

               for (int var19 = -var2; var19 < 0; var19++) {
                  int var20 = Rasterizer2D_pixels[var11];
                  if (var20 == 0) {
                     Rasterizer2D_pixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                     Rasterizer2D_pixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("gt")
   public static void method12538(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > Rasterizer2D_width) {
               var2 = Rasterizer2D_width - var0;
            }

            if (var1 + var3 > Rasterizer2D_height) {
               var3 = Rasterizer2D_height - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D_width - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (!var8 || var13 == 255 && var14 == 255) {
               int var25 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     if (var6[var28 * var7 + var29] != 0) {
                        Rasterizer2D_pixels[var25++] = var5;
                     } else {
                        Rasterizer2D_pixels[var25++] = var4;
                     }
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D_pixels[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936)
                           + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000)
                        >> 8;
                     Rasterizer2D_pixels[var15++] = var24;
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gd")
   public static void method12529(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < Rasterizer2D_xClipStart) {
         var2 -= Rasterizer2D_xClipStart - var0;
         var0 = Rasterizer2D_xClipStart;
      }

      if (var1 < Rasterizer2D_yClipStart) {
         var3 -= Rasterizer2D_yClipStart - var1;
         var1 = Rasterizer2D_yClipStart;
      }

      if (var0 + var2 > Rasterizer2D_xClipEnd) {
         var2 = Rasterizer2D_xClipEnd - var0;
      }

      if (var1 + var3 > Rasterizer2D_yClipEnd) {
         var3 = Rasterizer2D_yClipEnd - var1;
      }

      int var5 = Rasterizer2D_width - var2;
      int var6 = var0 + var1 * Rasterizer2D_width;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            Rasterizer2D_pixels[var6++] = var4;
         }

         var6 += var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("gz")
   public static void method12539(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > Rasterizer2D_width) {
               var2 = Rasterizer2D_width - var0;
            }

            if (var1 + var3 > Rasterizer2D_height) {
               var3 = Rasterizer2D_height - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D_width - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (!var8 || var13 == 255 && var14 == 255) {
               int var25 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     if (var6[var28 * var7 + var29] != 0) {
                        Rasterizer2D_pixels[var25++] = var5;
                     } else {
                        Rasterizer2D_pixels[var25++] = var4;
                     }
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D_pixels[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936)
                           + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000)
                        >> 8;
                     Rasterizer2D_pixels[var15++] = var24;
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gv")
   public static void method12541(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D_drawHorizontalLine(var0, var1, var2, var4);
      Rasterizer2D_drawHorizontalLine(var0, var1 + var3 - 1, var2, var4);
      Rasterizer2D_drawVerticalLine(var0, var1, var3, var4);
      Rasterizer2D_drawVerticalLine(var0 + var2 - 1, var1, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gh")
   public static void method12542(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D_drawHorizontalLine(var0, var1, var2, var4);
      Rasterizer2D_drawHorizontalLine(var0, var1 + var3 - 1, var2, var4);
      Rasterizer2D_drawVerticalLine(var0, var1, var3, var4);
      Rasterizer2D_drawVerticalLine(var0 + var2 - 1, var1, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gl")
   public static void method12544(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5);
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5);
         Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ge")
   public static void method12545(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5);
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5);
         Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gx")
   public static void method12547(int var0, int var1, int var2, int var3) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5] = var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("gb")
   public static void method12540(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > Rasterizer2D_width) {
               var2 = Rasterizer2D_width - var0;
            }

            if (var1 + var3 > Rasterizer2D_height) {
               var3 = Rasterizer2D_height - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D_width - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (!var8 || var13 == 1855434852 && var14 == 255) {
               int var25 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     if (var6[var28 * var7 + var29] != 0) {
                        Rasterizer2D_pixels[var25++] = var5;
                     } else {
                        Rasterizer2D_pixels[var25++] = var4;
                     }
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * Rasterizer2D_width + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D_pixels[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & -1475968464) * var22 & -1887199679)
                           + ((var20 & 0xFF00) * var21 + (var23 & 1500693622) * var22 & 665657543)
                        >> 8;
                     Rasterizer2D_pixels[var15++] = var24;
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fq")
   public static void method12502() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gi")
   static void method12553(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gq")
   static void method12554(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 0xFF) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hh")
   static void method12568(int var0, int var1, int var2) {
      if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) {
         Rasterizer2D_pixels[var0 + var1 * Rasterizer2D_width] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("en")
   public static void Rasterizer2D_drawRectangle(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D_drawHorizontalLine(var0, var1, var2, var4);
      Rasterizer2D_drawHorizontalLine(var0, var1 + var3 - 1, var2, var4);
      Rasterizer2D_drawVerticalLine(var0, var1, var3, var4);
      Rasterizer2D_drawVerticalLine(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("hg")
   public static void method12557(int var0, int var1, int var2, int var3) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("hy")
   public static void method12558(int var0, int var1, int var2, int var3) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eb")
   public static void Rasterizer2D_drawRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5);
      Rasterizer2D_drawHorizontalLineAlpha(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5);
         Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hx")
   static void method12561(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) {
         if (var1 < Rasterizer2D_yClipStart) {
            var2 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var1 + var2 > Rasterizer2D_yClipEnd) {
            var2 = Rasterizer2D_yClipEnd - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 860484159) * var4;
         int var7 = (var3 >> 8 & -1048007926) * var4;
         int var8 = (var3 & 932821919) * var4;
         int var12 = var0 + var1 * Rasterizer2D_width;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (Rasterizer2D_pixels[var12] >> 16 & 1574337756) * var5;
            int var10 = (Rasterizer2D_pixels[var12] >> 8 & 0xFF) * var5;
            int var11 = (Rasterizer2D_pixels[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            Rasterizer2D_pixels[var12] = var14;
            var12 += Rasterizer2D_width;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hn")
   public static void method12564(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += -2017774606;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var17 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= Rasterizer2D_xClipStart && var18 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var18 + var1 * Rasterizer2D_width] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ff")
   public static void Rasterizer2D_drawHorizontalLine(int var0, int var1, int var2, int var3) {
      if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) {
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         int var4 = var0 + var1 * Rasterizer2D_width;

         for (int var5 = 0; var5 < var2; var5++) {
            Rasterizer2D_pixels[var4 + var5] = var3 | 0xFF000000;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ga")
   public static void method12536(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
         }

         if (var1 < Rasterizer2D_yClipStart) {
            var8 += (Rasterizer2D_yClipStart - var1) * var9;
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
         }

         if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
         }

         if (var1 + var3 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
         }

         int var10 = Rasterizer2D_width - var2;
         int var11 = var0 + var1 * Rasterizer2D_width;

         for (int var12 = -var3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
               var11 += Rasterizer2D_width;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & 0xFF0000)
                  >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

               for (int var19 = -var2; var19 < 0; var19++) {
                  int var20 = Rasterizer2D_pixels[var11];
                  if (var20 == 0) {
                     Rasterizer2D_pixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                     Rasterizer2D_pixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hb")
   public static void method12565(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += -1173602695;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var17 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= Rasterizer2D_xClipStart && var18 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var18 + var1 * Rasterizer2D_width] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hc")
   static void method12569(int var0, int var1, int var2) {
      if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) {
         Rasterizer2D_pixels[var0 + var1 * Rasterizer2D_width] = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hq")
   public static void method12566(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            Rasterizer2D_drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < Rasterizer2D_xClipStart) {
               var1 += var5 * (Rasterizer2D_xClipStart - var0);
               var0 = Rasterizer2D_xClipStart;
            }

            if (var2 >= Rasterizer2D_xClipEnd) {
               var2 = Rasterizer2D_xClipEnd - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < Rasterizer2D_yClipStart) {
               var0 += var17 * (Rasterizer2D_yClipStart - var1);
               var1 = Rasterizer2D_yClipStart;
            }

            if (var3 >= Rasterizer2D_yClipEnd) {
               var3 = Rasterizer2D_yClipEnd - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= Rasterizer2D_xClipStart && var18 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[var18 + var1 * Rasterizer2D_width] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hr")
   public static void method12571() {
      if (Rasterizer2D_brightness != null) {
         if (Rasterizer2D_xClipStart == 0
            && Rasterizer2D_xClipEnd == Rasterizer2D_width
            && Rasterizer2D_yClipStart == 0
            && Rasterizer2D_yClipEnd == Rasterizer2D_height) {
            int var16 = Rasterizer2D_brightness.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; Rasterizer2D_brightness[var18++] = 0.0F) {
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
               Rasterizer2D_brightness[var18++] = 0.0F;
            }

            while (var18 < var16) {
               Rasterizer2D_brightness[var18++] = 0.0F;
            }
         } else {
            int var0 = Rasterizer2D_xClipEnd - Rasterizer2D_xClipStart;
            int var1 = Rasterizer2D_yClipEnd - Rasterizer2D_yClipStart;
            int var2 = Rasterizer2D_width - var0;
            int var3 = Rasterizer2D_xClipStart + Rasterizer2D_yClipStart * Rasterizer2D_width;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                     Rasterizer2D_brightness[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     Rasterizer2D_brightness[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hl")
   public static void method12573() {
      if (Rasterizer2D_brightness != null) {
         int var0 = Rasterizer2D_brightness.length;

         for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Rasterizer2D_width < Rasterizer2D_width / 2 && Rasterizer2D_brightness[var1] > 0.0F) {
               float var3 = Rasterizer2D_brightness[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               Rasterizer2D_pixels[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }
      }
   }
}
