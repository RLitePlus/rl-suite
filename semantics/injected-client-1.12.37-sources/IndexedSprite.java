import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yz")
public final class IndexedSprite extends classYW implements net.runelite.api.IndexedSprite {
   @ObfuscatedName("ae")
   public int field7121;
   @ObfuscatedName("ax")
   public int field7124;
   @ObfuscatedName("ag")
   public int field7122;
   @ObfuscatedName("ab")
   public int field7119;
   @ObfuscatedName("af")
   public int[] palette;
   @ObfuscatedName("az")
   public byte[] pixels;
   @ObfuscatedName("as")
   public int field7123;
   @ObfuscatedName("ac")
   public int field7120;

   public void setHeight(int var1) {
      this.field7119 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("ay")
   static void method13797(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("az")
   static void method13793(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public void setOffsetX(int var1) {
      this.field7122 = var1;
   }

   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("af")
   static void method13798(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   public int getOffsetX() {
      return this.field7122;
   }

   public void setPalette(int[] var1) {
      this.palette = var1;
   }

   public int[] getPalette() {
      return this.palette;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method13803() {
      if (this.field7121 != this.field7124 || this.field7119 != this.field7120) {
         byte[] var1 = new byte[this.field7124 * this.field7120];
         int var2 = 0;

         for (int var3 = 0; var3 < this.field7119; var3++) {
            for (int var4 = 0; var4 < this.field7121; var4++) {
               var1[var4 + this.field7122 + (var3 + this.field7123) * this.field7124] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.field7121 = this.field7124;
         this.field7119 = this.field7120;
         this.field7122 = 0;
         this.field7123 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ab")
   public void method13805(int var1, int var2, int var3) {
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
   @ObfuscatedName("as")
   public void method13812(int var1, int var2, int var3, int var4) {
      int var5 = this.field7121;
      int var6 = this.field7119;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field7124;
      int var10 = this.field7120;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      if (this.field7122 > 0) {
         int var13 = ((this.field7122 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field7122 << 16);
      }

      if (this.field7123 > 0) {
         int var16 = ((this.field7123 << 16) + var12 - 1) / var12;
         var2 += var16;
         var8 += var16 * var12 - (this.field7123 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      int var17 = var1 + var2 * field7102;
      int var14 = field7102 - var3;
      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var2 < field7096) {
         int var15 = field7096 - var2;
         var4 -= var15;
         var17 += var15 * field7102;
         var8 += var12 * var15;
      }

      if (var1 + var3 > field7099) {
         int var18 = var1 + var3 - field7099;
         var3 -= var18;
         var14 += var18;
      }

      if (var1 < field7097) {
         int var19 = field7097 - var1;
         var3 -= var19;
         var17 += var19;
         var7 += var11 * var19;
         var14 += var19;
      }

      method13798(field7104, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("ax")
   static void method13794(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & -170333900];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }
         }

         for (int var20 = var5; var20 < 0; var20++) {
            byte var24 = var1[var3++];
            if (var24 != 0) {
               var0[var4++] = var2[var24 & 1835728198];
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   public int getOriginalHeight() {
      return this.field7120;
   }

   public void setOriginalHeight(int var1) {
      this.field7120 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aw")
   public void method13813(int var1, int var2, int var3, int var4) {
      int var5 = this.field7121;
      int var6 = this.field7119;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field7124;
      int var10 = this.field7120;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      if (this.field7122 > 0) {
         int var13 = ((this.field7122 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field7122 << 16);
      }

      if (this.field7123 > 0) {
         int var16 = ((this.field7123 << 16) + var12 - 1) / var12;
         var2 += var16;
         var8 += var16 * var12 - (this.field7123 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      int var17 = var1 + var2 * field7102;
      int var14 = field7102 - var3;
      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var2 < field7096) {
         int var15 = field7096 - var2;
         var4 -= var15;
         var17 += var15 * field7102;
         var8 += var12 * var15;
      }

      if (var1 + var3 > field7099) {
         int var18 = var1 + var3 - field7099;
         var3 -= var18;
         var14 += var18;
      }

      if (var1 < field7097) {
         int var19 = field7097 - var1;
         var3 -= var19;
         var17 += var19;
         var7 += var11 * var19;
         var14 += var19;
      }

      method13798(field7104, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   public void setPixels(byte[] var1) {
      this.pixels = var1;
   }

   public void setOriginalWidth(int var1) {
      this.field7124 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ak")
   public void method13814(int var1, int var2, int var3, int var4) {
      int var5 = this.field7121;
      int var6 = this.field7119;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field7124;
      int var10 = this.field7120;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      if (this.field7122 > 0) {
         int var13 = ((this.field7122 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field7122 << 16);
      }

      if (this.field7123 > 0) {
         int var16 = ((this.field7123 << 16) + var12 - 1) / var12;
         var2 += var16;
         var8 += var16 * var12 - (this.field7123 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      int var17 = var1 + var2 * field7102;
      int var14 = field7102 - var3;
      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var2 < field7096) {
         int var15 = field7096 - var2;
         var4 -= var15;
         var17 += var15 * field7102;
         var8 += var12 * var15;
      }

      if (var1 + var3 > field7099) {
         int var18 = var1 + var3 - field7099;
         var3 -= var18;
         var14 += var18;
      }

      if (var1 < field7097) {
         int var19 = field7097 - var1;
         var3 -= var19;
         var17 += var19;
         var7 += var11 * var19;
         var14 += var19;
      }

      method13798(field7104, this.pixels, this.palette, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("ao")
   static void method13799(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   public byte[] getPixels() {
      return this.pixels;
   }

   public int getHeight() {
      return this.field7119;
   }

   public void setOffsetY(int var1) {
      this.field7123 = var1;
   }

   public int getWidth() {
      return this.field7121;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("al")
   static void method13800(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("aj")
   static void method13801(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("aa")
   static void method13795(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            byte var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 243747790];
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
               var0[var4++] = var2[var12 & 255];
            } else {
               var4++;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIIIIII)V")
   @ObfuscatedName("aq")
   static void method13802(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 2061447120];
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

   public int getOffsetY() {
      return this.field7123;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[B[IIIIIII)V")
   @ObfuscatedName("ac")
   static void method13796(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
               var0[var4++] = var2[var12 & 255];
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
               var0[var4++] = var2[var12 & 255];
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
   @ObfuscatedName("ap")
   public void method13806(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.palette.length; var4++) {
         int var5 = this.palette[var4] >> 16 & -33093298;
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
            var6 = 743094966;
         }

         int var7 = this.palette[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > -1066899636) {
            var7 = 655070869;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   public void method13807(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.palette.length; var4++) {
         int var5 = this.palette[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 1016209075) {
            var5 = -21746197;
         }

         int var6 = this.palette[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 57826025) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 669672063;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ai")
   public void method13808(int var1, int var2, int var3) {
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

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   public void method13809(int var1, int var2) {
      var1 += this.field7122;
      var2 += this.field7123;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7119;
      int var6 = this.field7121;
      int var7 = field7102 - var6;
      int var8 = 0;
      if (var2 < field7096) {
         int var9 = field7096 - var2;
         var5 -= var9;
         var2 = field7096;
         var4 += var9 * var6;
         var3 += var9 * field7102;
      }

      if (var2 + var5 > field7098) {
         var5 -= var2 + var5 - field7098;
      }

      if (var1 < field7097) {
         int var12 = field7097 - var1;
         var6 -= var12;
         var1 = field7097;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > field7099) {
         int var13 = var1 + var6 - field7099;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         method13793(field7104, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }

   public int getOriginalWidth() {
      return this.field7124;
   }

   public void setWidth(int var1) {
      this.field7121 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lyz;II)V")
   @ObfuscatedName("sb")
   public static void method13810(IndexedSprite var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13811(var1, var1);
      } else {
         var1 += var0.field7122;
         var2 += var0.field7123;
         int var3 = var1 + var2 * field7102;
         int var4 = 0;
         int var5 = var0.field7119;
         int var6 = var0.field7121;
         int var7 = field7102 - var6;
         int var8 = 0;
         if (var2 < field7096) {
            int var9 = field7096 - var2;
            var5 -= var9;
            var2 = field7096;
            var4 += var9 * var6;
            var3 += var9 * field7102;
         }

         if (var2 + var5 > field7098) {
            var5 -= var2 + var5 - field7098;
         }

         if (var1 < field7097) {
            int var12 = field7097 - var1;
            var6 -= var12;
            var1 = field7097;
            var4 += var12;
            var3 += var12;
            var8 += var12;
            var7 += var12;
         }

         if (var1 + var6 > field7099) {
            int var13 = var1 + var6 - field7099;
            var6 -= var13;
            var8 += var13;
            var7 += var13;
         }

         if (var6 > 0 && var5 > 0) {
            method13793(field7104, var0.pixels, var0.palette, var4, var3, var6, var5, var7, var8);
         }
      }
   }

   IndexedSprite() {
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cf")
   public void method13815(int var1, int var2, int var3, int var4) {
      this.method13812(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method13804() {
      if (this.field7121 != this.field7124 || this.field7119 != this.field7120) {
         byte[] var1 = new byte[this.field7124 * this.field7120];
         int var2 = 0;

         for (int var3 = 0; var3 < this.field7119; var3++) {
            for (int var4 = 0; var4 < this.field7121; var4++) {
               var1[var4 + this.field7122 + (var3 + this.field7123) * this.field7124] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.field7121 = this.field7124;
         this.field7119 = this.field7120;
         this.field7122 = 0;
         this.field7123 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   public void method13811(int var1, int var2) {
      var1 += this.field7119;
      var2 += this.field7124;
      int var3 = var1 + var2 * classYW.field7097;
      int var4 = 0;
      int var5 = this.field7122;
      int var6 = this.field7124;
      int var7 = classYW.field7098 - var6;
      int var8 = 0;
      if (var2 < classYW.field7101) {
         int var9 = classYW.field7098 - var2;
         var5 -= var9;
         var2 = field7096;
         var4 += var9 * var6;
         var3 += var9 * classYW.field7096;
      }

      if (var2 + var5 > classYW.field7101) {
         var5 -= var2 + var5 - classYW.field7096;
      }

      if (var1 < classYW.field7099) {
         int var12 = classYW.field7099 - var1;
         var6 -= var12;
         var1 = classYW.field7098;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > classYW.field7096) {
         int var13 = var1 + var6 - classYW.field7096;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         method13793(field7104, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }
}
