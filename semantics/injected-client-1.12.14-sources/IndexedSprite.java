import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xm")
public final class IndexedSprite extends Rasterizer2D implements net.runelite.api.IndexedSprite {
   @ObfuscatedName("ak")
   public int width;
   @ObfuscatedName("at")
   public int[] palette;
   @ObfuscatedName("ag")
   public int subWidth;
   @ObfuscatedName("an")
   public int subHeight;
   @ObfuscatedName("ae")
   public int xOffset;
   @ObfuscatedName("aj")
   public int yOffset;
   @ObfuscatedName("av")
   public byte[] pixels;
   @ObfuscatedName("aw")
   public int height;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("ak")
   static void method12416(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            byte var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 931044836];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 1242406362];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & -1975228433];
            } else {
               var4++;
            }
         }

         for (int var20 = var5; var20 < 0; var20++) {
            byte var24 = var1[var3++];
            if (var24 != 0) {
               var0[var4++] = var2[var24 & 255];
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("av")
   static void IndexedSprite_two(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            byte var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255] | 0xFF000000;
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255] | 0xFF000000;
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255] | 0xFF000000;
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255] | 0xFF000000;
            } else {
               var4++;
            }
         }

         for (int var20 = var5; var20 < 0; var20++) {
            byte var24 = var1[var3++];
            if (var24 != 0) {
               var0[var4++] = var2[var24 & 255] | 0xFF000000;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   public void setOriginalWidth(int var1) {
      this.width = var1;
   }

   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("at")
   static void IndexedSprite_something(
      int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255] | 0xFF000000;
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
   @ObfuscatedSignature(descriptor = "(Lof;Lxa;)V")
   @ObfuscatedName("nf")
   public static void method12436(Widget var0, Buffer var1) {
      if (var0 == null) {
         var0.method8111();
      }

      var0.field4486 = var1.readStringCp1252NullCircumfixed(-416392590);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("az")
   public void method12425(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.palette.length; var4++) {
         int var5 = this.palette[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.palette[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   public int getHeight() {
      return this.subHeight;
   }

   public byte[] getPixels() {
      return this.pixels;
   }

   @ObfuscatedSignature(descriptor = "(Lxm;)V")
   @ObfuscatedName("qn")
   public static void method12421(IndexedSprite var0) {
      if (var0 == null) {
         var0.normalize();
      } else if (var0.subWidth != var0.width || var0.subHeight != var0.height) {
         byte[] var1 = new byte[var0.width * var0.height];
         int var2 = 0;

         for (int var3 = 0; var3 < var0.subHeight; var3++) {
            for (int var4 = 0; var4 < var0.subWidth; var4++) {
               var1[var4 + var0.xOffset + (var3 + var0.yOffset) * var0.width] = var0.pixels[var2++];
            }
         }

         var0.pixels = var1;
         var0.subWidth = var0.width;
         var0.subHeight = var0.height;
         var0.xOffset = 0;
         var0.yOffset = 0;
      }
   }

   public void setWidth(int var1) {
      this.subWidth = var1;
   }

   public void setOffsetY(int var1) {
      this.yOffset = var1;
   }

   public int getOriginalHeight() {
      return this.height;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   public void drawAt(int var1, int var2) {
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
         IndexedSprite_two(Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   public int getOriginalWidth() {
      return this.width;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aj")
   public void method12433(int var1, int var2, int var3, int var4) {
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

      IndexedSprite_something(Rasterizer2D_pixels, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   public int getWidth() {
      return this.subWidth;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   public void method12429(int var1, int var2) {
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
         IndexedSprite_two(Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ad")
   public void method12426(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.palette.length; var4++) {
         int var5 = this.palette[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > -367348416) {
            var5 = -347209114;
         }

         int var6 = this.palette[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > -1551581929) {
            var6 = -1299614401;
         }

         int var7 = this.palette[var4] & -1833381005;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 2087160320) {
            var7 = -879164780;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   public int getOffsetY() {
      return this.yOffset;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("ap")
   static void method12420(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   public void setPixels(byte[] var1) {
      this.pixels = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method12422() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         byte[] var1 = new byte[this.width * this.height];
         int var2 = 0;

         for (int var3 = 0; var3 < this.subHeight; var3++) {
            for (int var4 = 0; var4 < this.subWidth; var4++) {
               var1[var4 + this.xOffset + (var3 + this.yOffset) * this.width] = this.pixels[var2++];
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
   @ObfuscatedName("au")
   public void method12423() {
      if (this.subWidth != this.width || this.subHeight != this.height) {
         byte[] var1 = new byte[this.width * this.height];
         int var2 = 0;

         for (int var3 = 0; var3 < this.subHeight; var3++) {
            for (int var4 = 0; var4 < this.subWidth; var4++) {
               var1[var4 + this.xOffset + (var3 + this.yOffset) * this.width] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.subWidth = this.width;
         this.subHeight = this.height;
         this.xOffset = 0;
         this.yOffset = 0;
      }
   }

   public int[] getPalette() {
      return this.palette;
   }

   public void setPalette(int[] var1) {
      this.palette = var1;
   }

   public void setOffsetX(int var1) {
      this.xOffset = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("aw")
   static void method12418(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            byte var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 531428045];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & -230150835];
            } else {
               var4++;
            }
         }

         for (int var20 = var5; var20 < 0; var20++) {
            byte var24 = var1[var3++];
            if (var24 != 0) {
               var0[var4++] = var2[var24 & 255];
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("an")
   public void shiftColors(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.palette.length; var4++) {
         int var5 = this.palette[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.palette[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("kf")
   public void method12437(int var1, int var2, int var3, int var4) {
      this.method12433(var1, var2, var3, var4);
   }

   public int getOffsetX() {
      return this.xOffset;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ai")
   public void method12430(int var1, int var2) {
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
         IndexedSprite_two(Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   public void setOriginalHeight(int var1) {
      this.height = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ar")
   public void method12434(int var1, int var2, int var3, int var4) {
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

      IndexedSprite_something(Rasterizer2D_pixels, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   public void method12431(int var1, int var2) {
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
         IndexedSprite_two(Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   public void setHeight(int var1) {
      this.subHeight = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ax")
   public void method12435(int var1, int var2, int var3, int var4) {
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

      IndexedSprite_something(Rasterizer2D_pixels, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   public void method12432(int var1, int var2) {
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
         IndexedSprite_two(Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void normalize() {
      if (this.yOffset != this.height || this.width != this.yOffset) {
         byte[] var1 = new byte[this.height * this.yOffset];
         int var2 = 0;

         for (int var3 = 0; var3 < this.height; var3++) {
            for (int var4 = 0; var4 < this.width; var4++) {
               var1[var4 + this.yOffset + (var3 + this.yOffset) * this.width] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.yOffset = this.width;
         this.height = this.subWidth;
         this.subWidth = 0;
         this.width = 0;
      }
   }
}
