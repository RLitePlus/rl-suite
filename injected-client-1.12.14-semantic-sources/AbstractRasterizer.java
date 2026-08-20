import net.runelite.api.Rasterizer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jg")
public abstract class AbstractRasterizer extends Rasterizer2D {
   @ObfuscatedName("ak")
   static int field2855 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2861 = 3500;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2859 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2860 = 210;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2858 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final float field2857 = 1.5F;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2862 = 50;
   @ObfuscatedName("aw")
   boolean field2853 = false;
   @ObfuscatedName("ap")
   int[] field2852 = Rasterizer3D.Rasterizer3D_colorPalette;
   @ObfuscatedName("hp")
   public static final Rasterizer field2856 = new rl12();
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("ay")
   Clips field2854;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   public static void method5449() {
      Rasterizer3D.resetRasterClipping();
   }

   AbstractRasterizer(Clips var1) {
      this.field2854 = var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("fo")
   public static void method5450(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      Rasterizer3D.rasterFlat(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("se")
   public static void method5451(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("av")
   static int method5420(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   static final int method5424(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ad")
   abstract void textureMapPolygons(
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
   );

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   static void method5432(int var0) {
      field2855 = var0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bs")
   abstract boolean vmethod211();

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bu")
   abstract void vmethod212(
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
   );

   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("ju")
   public static void method5452(int var0, int var1, int var2, int[] var3, int[] var4) {
      Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("aw")
   void method5441(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2854.field3431.overrideAmount;
      if (var13 > 0) {
         byte var14 = this.field2854.field3431.overrideHue;
         byte var15 = this.field2854.field3431.overrideSaturation;
         byte var16 = this.field2854.field3431.overrideLuminance;
         var10 = method5420(var10, var14, var15, var16, var13);
         var11 = method5420(var11, var14, var15, var16, var13);
         var12 = method5420(var12, var14, var15, var16, var13);
      }

      this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ay")
   abstract void drawAlphaBlendedGraphics(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("au")
   abstract void vmethod214(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("it")
   public boolean method5453() {
      return this.vmethod211();
   }

   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("fa")
   public static float method5448(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("pj")
   public static void method5454(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_drawRectangle(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bm")
   abstract void vmethod215(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("ap")
   void method5444(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      byte var11 = this.field2854.field3431.overrideAmount;
      if (var11 > 0) {
         int var12 = method5420(
            var10,
            this.field2854.field3431.overrideHue,
            this.field2854.field3431.overrideSaturation,
            this.field2854.field3431.overrideLuminance,
            this.field2854.field3431.overrideAmount
         );
         var10 = this.field2852[var12];
      }

      this.vmethod214(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("az")
   abstract void drawGradientTriangle(
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
   );

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ar")
   static final int method5425(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > -1196944033) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("as")
   static int method5421(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   static final int method5428() {
      return field2855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   static final int method5426(int var0, int var1) {
      var1 = var1 * (var0 & 1258281768) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > -2057748341) {
         var1 = 126;
      }

      return (var0 & -1438606186) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   static final int method5427(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("ai")
   static int method5422(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 1976711212;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 1888803653;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   static final int method5429() {
      return field2855;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("vb")
   public static void method5455(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_drawVerticalLineAlpha(var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   static final int method5430() {
      return field2855;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ka")
   public static void method5456(
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
      Rasterizer3D.rasterTextureWithColors(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   static final int method5431() {
      return field2855;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("jf")
   public static void method5457(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   static void method5433(int var0) {
      field2855 = var0;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bt")
   abstract void vmethod217(
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
   );

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   static void method5434(int var0) {
      field2855 = var0;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bh")
   abstract void vmethod218(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dw")
   public static void method5447() {
      GameEngine.rasterProvider.method12270();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   static void method5436(int var0) {
      int var1 = var0 * 210;
      method5432(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   static void method5435(int var0) {
      field2855 = var0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   abstract boolean vmethod219();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("ac")
   static int method5423(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 651835683;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & -1015660939;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & -1446629612;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bz")
   void method5442(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2854.field3431.overrideAmount;
      if (var13 > 0) {
         byte var14 = this.field2854.field3431.overrideHue;
         byte var15 = this.field2854.field3431.overrideSaturation;
         byte var16 = this.field2854.field3431.overrideLuminance;
         var10 = method5420(var10, var14, var15, var16, var13);
         var11 = method5420(var11, var14, var15, var16, var13);
         var12 = method5420(var12, var14, var15, var16, var13);
      }

      this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   static void method5437(int var0) {
      int var1 = var0 * 210;
      method5432(var1);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bb")
   void method5445(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      byte var11 = this.field2854.field3431.overrideAmount;
      if (var11 > 0) {
         int var12 = method5420(
            var10,
            this.field2854.field3431.overrideHue,
            this.field2854.field3431.overrideSaturation,
            this.field2854.field3431.overrideLuminance,
            this.field2854.field3431.overrideAmount
         );
         var10 = this.field2852[var12];
      }

      this.vmethod214(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("kn")
   public static void method5458(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      Rasterizer3D.rasterGouraud(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bf")
   public static void method5459(int var0, int var1, int var2, int var3) {
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bj")
   void method5446(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      byte var11 = this.field2854.field3431.overrideAmount;
      if (var11 > 0) {
         int var12 = method5420(
            var10,
            this.field2854.field3431.overrideHue,
            this.field2854.field3431.overrideSaturation,
            this.field2854.field3431.overrideLuminance,
            this.field2854.field3431.overrideAmount
         );
         var10 = this.field2852[var12];
      }

      this.vmethod214(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bp")
   abstract void vmethod220(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ol")
   public static void method5460() {
      Rasterizer2D.Rasterizer2D_resetClip();
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("by")
   abstract void vmethod221(
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
   );

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("mk")
   public static void method5461(int var0, int var1, int var2, int var3) {
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   abstract boolean vmethod222();

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ww")
   public static void method5462(int var0, int var1, int var2, int var3) {
      Rasterizer2D.Rasterizer2D_setClip(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("uo")
   public static void method5463(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_drawLine(var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   static void method5438(int var0) {
      int var1 = var0 * 750728209;
      method5432(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("kq")
   public static void method5464(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_drawCircleAlpha(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ba")
   abstract void vmethod223(
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
   );

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   static void method5439(int var0) {
      int var1 = var0 * 210;
      method5432(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ko")
   public static void method5465(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ak")
   void method5440(int[] var1, int var2, int var3, float[] var4) {
      Rasterizer2D_init(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bw")
   abstract void vmethod224(
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
   );

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljg;FFFFFFFFFIII)V")
   @ObfuscatedName("aq")
   public static void method5443(
      AbstractRasterizer var0,
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
      int var12
   ) {
      byte var13 = var0.field2854.field3431.overrideAmount;
      if (var13 > 0) {
         byte var14 = var0.field2854.field3431.overrideHue;
         byte var15 = var0.field2854.field3431.overrideSaturation;
         byte var16 = var0.field2854.field3431.overrideLuminance;
         var10 = method5420(var10, var14, var15, var16, var13);
         var11 = method5420(var11, var14, var15, var16, var13);
         var12 = method5420(var12, var14, var15, var16, var13);
      }

      var0.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bf")
   abstract void vmethod225(
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
   );

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bo")
   public static void method5466(int var0, int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hz")
   public static void method5467(int var0, int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bn")
   abstract void vmethod226(
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
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bd")
   abstract void vmethod227(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("br")
   abstract void vmethod228(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bi")
   abstract void vmethod229(
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
   );
}
