import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ji")
public class Rasterizer3D {
   @ObfuscatedSignature(descriptor = "Ljg;")
   @ObfuscatedName("az")
   static AbstractRasterizer field3042;
   @ObfuscatedSignature(descriptor = "Ljg;")
   @ObfuscatedName("at")
   static final AbstractRasterizer field3041;
   @ObfuscatedName("an")
   static int[] field3033 = new int[512];
   @ObfuscatedName("ap")
   static float[] field3037 = new float[2048];
   @ObfuscatedName("ag")
   public static int[] Rasterizer3D_colorPalette = new int[65536];
   @ObfuscatedName("aj")
   public static int[] Rasterizer3D_sine = new int[2048];
   @ObfuscatedName("ak")
   public static int[] Rasterizer3D_cosine = new int[2048];
   @ObfuscatedName("ae")
   static int[] field3040 = new int[2048];
   @ObfuscatedSignature(descriptor = "Ljg;")
   @ObfuscatedName("av")
   static final AbstractRasterizer field3036;
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("ay")
   public static Clips clips;
   @ObfuscatedName("aw")
   static float[] field3038 = new float[2048];
   @ObfuscatedName("au")
   static double field3043;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dt")
   static void method5898(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("av")
   public static void method5817(boolean var0) {
      if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
         field3042 = field3041;
      } else {
         field3042 = field3036;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkg;)V")
   @ObfuscatedName("at")
   public static void setTextureLoader(TextureLoader var0) {
      clips.Rasterizer3D_textureLoader = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("bp")
   static void method5827(double var0, int var2, int var3) {
      field3043 = var0;
      int var4 = var2 * 128;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = Rasterizer3D_brighten(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            Rasterizer3D_colorPalette[var4++] = var22;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("an")
   static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
      field3043 = var0;
      int var4 = var2 * 128;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = Rasterizer3D_brighten(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            Rasterizer3D_colorPalette[var4++] = var22;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   static int method5847() {
      return clips.clipMidX;
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("aj")
   public static double method5835() {
      return field3043;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   static int getClipMidX() {
      return clips.clipMidY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   public static int method5860() {
      return clips.zoom;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dm")
   static void method5908(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.method5441(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("cz")
   public static void method5872(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field3042 == field3041) {
         field3042 = field3036;
      }

      field3042.method5440(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   static int method5856() {
      return clips.clipNegativeMidY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   static int method5859() {
      return clips.clipY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public static int get3dZoom() {
      return clips.zoom;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   static int method5840() {
      return clips.clipMidY;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   static boolean method5869() {
      return field3042.vmethod211();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dv")
   public static void method5889(int var0, int var1, int var2) {
      clips.setClipping(var0, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bs")
   public static void method5818(boolean var0) {
      if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
         field3042 = field3041;
      } else {
         field3042 = field3036;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ax")
   static void setClipBoundsAndInitOffsets(int var0, int var1, int var2, int var3) {
      clips.clipNegativeMidX = var2 - var0;
      clips.field3460 = var3 - var1;
      setClipBounds();
      if (clips.Rasterizer3D_rowOffsets.length < clips.field3460) {
         clips.Rasterizer3D_rowOffsets = new int[class161.method4253(clips.field3460, (byte)0)];
      }

      int var4 = var1 * Rasterizer2D.Rasterizer2D_width + var0;

      for (int var5 = 0; var5 < clips.field3460; var5++) {
         clips.Rasterizer3D_rowOffsets[var5] = var4;
         var4 += Rasterizer2D.Rasterizer2D_width;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkg;)V")
   @ObfuscatedName("bk")
   public static void method5822(TextureLoader var0) {
      clips.Rasterizer3D_textureLoader = var0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ah")
   public static void setCustomClipBounds(int var0, int var1) {
      int var2 = clips.Rasterizer3D_rowOffsets[0];
      int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
      int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
      clips.method6618(var0, var4, var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("al")
   public static void setClipping(int var0, int var1, int var2) {
      clips.setClipping(var0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("af")
   static void rasterGouraud(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.drawAlphaBlendedGraphics(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("am")
   public static void rasterFlat(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field3042.vmethod214(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ao")
   static void rasterTextureWithShadingAndLighting(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("aa")
   static void rasterTextureWithColors(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.textureMapPolygons(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   Rasterizer3D() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cc")
   public static int method5862() {
      return clips.zoom;
   }

   static {
      for (int var0 = 1; var0 < 512; var0++) {
         field3033[var0] = 32768 / var0;
      }

      for (int var5 = 1; var5 < 2048; var5++) {
         field3040[var5] = 65536 / var5;
      }

      for (int var6 = 0; var6 < 2048; var6++) {
         double var1 = Math.sin(var6 * 0.0030679615);
         double var3 = Math.cos(var6 * 0.0030679615);
         Rasterizer3D_sine[var6] = (int)(65536.0 * var1);
         Rasterizer3D_cosine[var6] = (int)(65536.0 * var3);
         field3038[var6] = (float)var1;
         field3037[var6] = (float)var3;
      }

      clips = new Clips();
      field3036 = new class270(clips);
      field3041 = new class272(clips);
      field3042 = field3036;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bo")
   public static void method5819(boolean var0) {
      if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
         field3042 = field3041;
      } else {
         field3042 = field3036;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cv")
   static void method5879(int var0, int var1, int var2, int var3) {
      clips.clipNegativeMidX = var2 - var0;
      clips.field3460 = var3 - var1;
      setClipBounds();
      if (clips.Rasterizer3D_rowOffsets.length < clips.field3460) {
         clips.Rasterizer3D_rowOffsets = new int[class161.method4253(clips.field3460, (byte)0)];
      }

      int var4 = var1 * Rasterizer2D.Rasterizer2D_width + var0;

      for (int var5 = 0; var5 < clips.field3460; var5++) {
         clips.Rasterizer3D_rowOffsets[var5] = var4;
         var4 += Rasterizer2D.Rasterizer2D_width;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   public static void method5881() {
      clips.setClipBounds();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkg;)V")
   @ObfuscatedName("bz")
   public static void method5823(TextureLoader var0) {
      clips.Rasterizer3D_textureLoader = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public static int method5863() {
      return clips.zoom;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   public static void method5874() {
      setClipBoundsAndInitOffsets(
         Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("bj")
   public static void method5824(double var0) {
      Rasterizer3D_buildPalette(var0, 0, 512);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("bm")
   static void method5829(double var0, int var2, int var3) {
      field3043 = var0;
      int var4 = var2 * 128;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = Rasterizer3D_brighten(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            Rasterizer3D_colorPalette[var4++] = var22;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   static boolean method5870() {
      return field3042.vmethod211();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("bt")
   static int method5830(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 0xFF) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("bu")
   static int method5831(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & -1150557926) / 256.0;
      double var7 = (var0 & 1217802965) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("ba")
   static int method5832(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 0xFF) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("bi")
   static int method5833(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & -912977449) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("by")
   public static double method5836() {
      return field3043;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("bw")
   public static double method5837() {
      return field3043;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("bf")
   public static double method5838() {
      return field3043;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bg")
   public static void method5820(boolean var0) {
      if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
         field3042 = field3041;
      } else {
         field3042 = field3036;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   static int method5841() {
      return clips.clipMidY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   static int method5842() {
      return clips.clipMidY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   static int method5864() {
      return clips.clipNegativeMidX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   static int method5843() {
      return clips.clipCenterX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   static int method5844() {
      return clips.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ac")
   public static void method5873(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field3042 == field3041) {
         field3042 = field3036;
      }

      field3042.method5440(var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   static int method5848() {
      return clips.clipMidX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   static int method5865() {
      return clips.clipNegativeMidX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   static int method5851() {
      return clips.field3451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ce")
   static int method5852() {
      return clips.field3451;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public static void resetRasterClipping() {
      setClipBoundsAndInitOffsets(
         Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   static int method5853() {
      return clips.field3451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   static int method5857() {
      return clips.clipNegativeMidY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dz")
   static void method5900(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ca")
   public static void method5882() {
      clips.setClipBounds();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   static int method5854() {
      return clips.field3451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public static void method5883() {
      clips.setClipBounds();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cn")
   static int method5866() {
      return clips.clipNegativeMidX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   static int method5867() {
      return clips.clipNegativeMidX;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ag")
   public static void buildPalette(double var0) {
      Rasterizer3D_buildPalette(var0, 0, 512);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)I")
   @ObfuscatedName("qp")
   public static int method5816(classKM var0) {
      return var0.field3370 * -1638078021;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cg")
   static int method5868() {
      return clips.clipNegativeMidX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cp")
   static boolean method5871() {
      return field3042.vmethod211();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("df")
   public static void method5891(int var0, int var1, int var2) {
      clips.setClipping(var0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   static int getClipMidY() {
      return clips.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   static int Rasterizer3D_clipMidY2() {
      return clips.field3451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   public static void method5876() {
      setClipBoundsAndInitOffsets(
         Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public static void method5877() {
      setClipBoundsAndInitOffsets(
         Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cq")
   static void method5880(int var0, int var1, int var2, int var3) {
      clips.clipNegativeMidX = var2 - var0;
      clips.field3460 = var3 - var1;
      setClipBounds();
      if (clips.Rasterizer3D_rowOffsets.length < clips.field3460) {
         clips.Rasterizer3D_rowOffsets = new int[class161.method4253(clips.field3460, (byte)0)];
      }

      int var4 = var1 * Rasterizer2D.Rasterizer2D_width + var0;

      for (int var5 = 0; var5 < clips.field3460; var5++) {
         clips.Rasterizer3D_rowOffsets[var5] = var4;
         var4 += Rasterizer2D.Rasterizer2D_width;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cl")
   public static void method5887(int var0, int var1) {
      int var2 = clips.Rasterizer3D_rowOffsets[0];
      int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
      int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
      clips.method6618(var0, var4, var1, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public static void setClipBounds() {
      clips.setClipBounds();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   static int Rasterizer3D_clipMidX2() {
      return clips.clipMidX;
   }

   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("ae")
   static int Rasterizer3D_brighten(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 0xFF) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cj")
   public static void method5885() {
      clips.setClipBounds();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dl")
   static void method5905(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.textureMapPolygons(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dd")
   public static void method5888(int var0, int var1) {
      int var2 = clips.Rasterizer3D_rowOffsets[0];
      int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
      int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
      clips.method6618(var0, var4, var1, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dw")
   public static void method5892(int var0, int var1, int var2) {
      clips.setClipping(var0, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("bb")
   public static void method5826(double var0) {
      Rasterizer3D_buildPalette(var0, 0, 512);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   static int method5850() {
      return clips.clipMidX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dy")
   static void method5894(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.drawAlphaBlendedGraphics(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dc")
   static void method5895(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.drawAlphaBlendedGraphics(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("db")
   public static void method5897(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field3042.vmethod214(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dr")
   static void method5906(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.textureMapPolygons(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dh")
   static void method5901(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   static int method5846() {
      return clips.clipCenterX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("di")
   static void method5902(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dj")
   static void method5903(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.drawGradientTriangle(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("da")
   static void method5907(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
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
      int var19,
      int var20,
      int var21
   ) {
      field3042.textureMapPolygons(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cm")
   static int method5858() {
      return clips.clipNegativeMidY;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("be")
   static void rasterTriangle(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field3042.method5444(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dx")
   static void method5909(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.method5441(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dq")
   static void method5910(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.method5441(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("du")
   static void method5911(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.method5441(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("aq")
   static void rasterTriangleWithGradient(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field3042.method5441(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dp")
   static void method5914(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field3042.method5444(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dg")
   static void method5915(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field3042.method5444(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
