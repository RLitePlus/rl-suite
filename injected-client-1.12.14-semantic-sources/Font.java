import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
public final class Font extends AbstractFont {
   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ap")
   @Override
   final void vmethod332(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D_width;
      int var9 = Rasterizer2D_width - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var12 = Rasterizer2D_yClipStart - var3;
         var5 -= var12;
         var3 = Rasterizer2D_yClipStart;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var2;
         var4 -= var13;
         var2 = Rasterizer2D_xClipStart;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var14 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   public Font(byte[] var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("av")
   @Override
   final void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var3;
         var5 -= var11;
         var3 = Rasterizer2D_yClipStart;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var2;
         var4 -= var12;
         var2 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var13 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ag")
   @Override
   final void vmethod340(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var3;
         var5 -= var11;
         var3 = Rasterizer2D_yClipStart;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var2;
         var4 -= var12;
         var2 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var13 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ay")
   @Override
   final void vmethod338(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D_width;
      int var9 = Rasterizer2D_width - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var12 = Rasterizer2D_yClipStart - var3;
         var5 -= var12;
         var3 = Rasterizer2D_yClipStart;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var2;
         var4 -= var13;
         var2 = Rasterizer2D_xClipStart;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var14 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var7);
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ae")
   @Override
   final void vmethod335(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var3;
         var5 -= var11;
         var3 = Rasterizer2D_yClipStart;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var2;
         var4 -= var12;
         var2 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var13 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("aj")
   @Override
   final void vmethod341(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var3;
         var5 -= var11;
         var3 = Rasterizer2D_yClipStart;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var2;
         var4 -= var12;
         var2 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var13 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("at")
   @Override
   final void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D_width;
      int var9 = Rasterizer2D_width - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var12 = Rasterizer2D_yClipStart - var3;
         var5 -= var12;
         var3 = Rasterizer2D_yClipStart;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var2;
         var4 -= var13;
         var2 = Rasterizer2D_xClipStart;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var14 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ak")
   @Override
   final void vmethod337(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D_width;
      int var9 = Rasterizer2D_width - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var12 = Rasterizer2D_yClipStart - var3;
         var5 -= var12;
         var3 = Rasterizer2D_yClipStart;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var2;
         var4 -= var13;
         var2 = Rasterizer2D_xClipStart;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var14 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("an")
   @Override
   final void vmethod334(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var3;
         var5 -= var11;
         var3 = Rasterizer2D_yClipStart;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var2;
         var4 -= var12;
         var2 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var13 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("aw")
   @Override
   final void vmethod339(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D_width;
      int var9 = Rasterizer2D_width - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Rasterizer2D_yClipStart) {
         int var12 = Rasterizer2D_yClipStart - var3;
         var5 -= var12;
         var3 = Rasterizer2D_yClipStart;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D_width;
      }

      if (var3 + var5 > Rasterizer2D_yClipEnd) {
         var5 -= var3 + var5 - Rasterizer2D_yClipEnd;
      }

      if (var2 < Rasterizer2D_xClipStart) {
         int var13 = Rasterizer2D_xClipStart - var2;
         var4 -= var13;
         var2 = Rasterizer2D_xClipStart;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Rasterizer2D_xClipEnd) {
         int var14 = var2 + var4 - Rasterizer2D_xClipEnd;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
