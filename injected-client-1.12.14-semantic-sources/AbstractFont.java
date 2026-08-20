import java.util.Random;
import net.runelite.api.FontTypeFace;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sl")
public abstract class AbstractFont extends Rasterizer2D implements FontTypeFace {
   @ObfuscatedName("ar")
   int[] widths;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("at")
   public static IndexedSprite[] AbstractFont_modIconSprites;
   @ObfuscatedName("ap")
   static int AbstractFont_alpha = 256;
   @ObfuscatedName("ah")
   int[] heights;
   @ObfuscatedName("ae")
   static int AbstractFont_previousShadow = -1;
   @ObfuscatedName("ag")
   static int AbstractFont_strike = -1;
   @ObfuscatedName("ak")
   static int AbstractFont_previousColor = 0;
   @ObfuscatedName("aw")
   static int AbstractFont_color = 0;
   @ObfuscatedName("az")
   static Random AbstractFont_random = new Random();
   @ObfuscatedName("ay")
   static int AbstractFont_justificationTotal = 0;
   @ObfuscatedName("au")
   static int AbstractFont_justificationCurrent = 0;
   @ObfuscatedName("an")
   static int AbstractFont_underline = -1;
   @ObfuscatedName("ad")
   static String[] AbstractFont_lines = new String[100];
   @ObfuscatedName("ai")
   public int ascent = 0;
   @ObfuscatedName("as")
   public int maxAscent;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5825 = 256;
   @ObfuscatedName("ab")
   byte[][] pixels = new byte[256][];
   @ObfuscatedName("ax")
   int[] advances;
   @ObfuscatedName("lo")
   public static final StringBuilder field5810 = new StringBuilder(100);
   @ObfuscatedName("aj")
   static int AbstractFont_shadow = -1;
   @ObfuscatedName("ac")
   public int maxDescent;
   @ObfuscatedName("al")
   int[] leftBearings;
   @ObfuscatedName("af")
   int[] topBearings;
   @ObfuscatedName("am")
   byte[] kerning;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;I)I")
   @ObfuscatedName("wh")
   public static int method10392(AbstractFont var0, String var1, int var2) {
      if (var0 == null) {
         var0.method10400(var2, var2, var1, var2, var2);
      }

      int var3 = var0.breakLines(var1, new int[]{var2}, AbstractFont_lines);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var0.stringWidth(AbstractFont_lines[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public void drawWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      method10422(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;IIII)V")
   @ObfuscatedName("ro")
   public static void method10450(AbstractFont var0, int var1, int var2, int var3, int var4) {
      var3 -= var0.ascent;
      int var5 = var1 & 1764280755;
      if (var5 != 1189469304) {
         var0.drawGlyph(var0.pixels[var5], var2 + var0.leftBearings[var5], var3 + var0.topBearings[var5], var0.widths[var5], var0.heights[var5], var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIII)V")
   @ObfuscatedName("pu")
   public static void method10444(AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method10446(var1, var2, var2, var2, var2, var2);
      } else if (var1 != null) {
         method10455(var0, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         var0.method10469(var1, var2, var3, null, var7, null);
      }
   }

   AbstractFont(byte[] var1) {
      method10384(this, var1);
   }

   @ObfuscatedSignature(descriptor = "([[B[[B[I[I[III)I")
   @ObfuscatedName("au")
   static int method10365(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;I)I")
   @ObfuscatedName("np")
   public static int method10393(AbstractFont var0, String var1, int var2) {
      if (var0 == null) {
         return var0.method10394(var1, var2);
      } else {
         int var3 = var0.breakLines(var1, new int[]{var2}, AbstractFont_lines);
         int var4 = 0;

         for (int var5 = 0; var5 < var3; var5++) {
            int var6 = var0.stringWidth(AbstractFont_lines[var5]);
            if (var6 > var4) {
               var4 = var6;
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cw")
   public void method10472(String var1, int var2, int var3, int var4, int var5) {
      this.method10402(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("eq")
   void method10459(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == 246684104) {
            var4 = true;
         } else if (var6 == -1952067692) {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ad")
   static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D_width;
      int var7 = Rasterizer2D_width - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var4 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var9 += var10 * var3;
         var6 += var10 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var11 = Rasterizer2D_xClipStart - var1;
         var3 -= var11;
         var1 = Rasterizer2D_xClipStart;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var12 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("ai")
   static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("as")
   static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var3;
      int var9 = 0;
      int var10 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var2;
         var4 -= var11;
         var2 = Rasterizer2D_yClipStart;
         var10 += var11 * var3;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var3 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("gb")
   public static void method10429(AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var0 == null) {
         var0.method10433(var1, var2, var2, var2, var2, var2, var7);
      } else if (var1 != null) {
         method10455(var0, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = var0.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         var0.method10469(var1, var2 - var0.stringWidth(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[BIIIIIIII)V")
   @ObfuscatedName("ac")
   static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
      var9 = 256 - var9;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               client.method2488(var0, var4++, (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2, 256 - var9);
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II[I[I[I)V")
   @ObfuscatedName("ej")
   void method10468(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ascent;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         if (var1.charAt(var10) != 0) {
            int var11 = (char)(Sound.charToByteCp1252(var1.charAt(var10), (byte)79) & 255);
            if (var11 == 43705294) {
               var7 = var10;
            } else {
               if (var11 == -882642643 && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = -1626728574;
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              int var21;
                              if (var5 != null) {
                                 var21 = var5[var9];
                              } else {
                                 var21 = 0;
                              }

                              int var22;
                              if (var6 != null) {
                                 var22 = var6[var9];
                              } else {
                                 var22 = 0;
                              }

                              var9++;
                              int var23 = Message.method1204(var12.substring(4), (byte)-101);
                              IndexedSprite var24 = AbstractFont_modIconSprites[var23];
                              var24.drawAt(var2 + var21, var3 + this.ascent - var24.height + var22);
                              var2 += var24.width;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.decodeTag(var12);
                        }
                        continue;
                     }

                     var11 = 62;
                  }
               }

               if (var11 == 844369865) {
                  var11 = 32;
               }

               if (var7 == -1) {
                  if (this.kerning != null && var8 != -1) {
                     var2 += this.kerning[(var8 << 8) + var11];
                  }

                  int var20 = this.widths[var11];
                  int var13 = this.heights[var11];
                  int var14;
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  int var15;
                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = AbstractFont_color;
                  }

                  var9++;
                  if (var11 != 32) {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var11], var2 + this.leftBearings[var11] + var14, var3 + this.topBearings[var11] + var15, var20, var13, var16);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var11],
                           var2 + this.leftBearings[var11] + var14,
                           var3 + this.topBearings[var11] + var15,
                           var20,
                           var13,
                           var16,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 1410187934;
                  }

                  int var17 = this.advances[var11];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var17, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var17, AbstractFont_underline);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("cc")
   public int method10390(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(2090423393);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         int var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for (int var14 = 0; var14 < var13; var14++) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == -288872154 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append((char)572169830);
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.charWidth('<');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << 8) + 60];
                     }

                     var11 = -1007094975;
                  } else if (var16.equals("gt")) {
                     var4 += this.charWidth('>');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << 8) + 62];
                     }

                     var11 = 1373842628;
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = Message.method1204(var16.substring(4), (byte)-41);
                        var4 += AbstractFont_modIconSprites[var17].width;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.charWidth(var15);
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == 2076988400) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12++] = var6.substring(var5, var7 - var9);
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var12++] = var6.substring(var5);
         }

         return var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("re")
   public static int method10418(
      AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      if (var0 == null) {
         var0.method10389(var1);
      }

      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 2099541894) {
            var8 = 256;
         }

         method10455(var0, var6, var7);
         AbstractFont_alpha = var8;
         if (var11 == 0) {
            var11 = var0.ascent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var0.maxAscent + var0.maxDescent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = var0.breakLines(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + var0.maxAscent;
         } else if (var10 == 1) {
            var14 = var3 + var0.maxAscent + (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - var0.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var0.maxAscent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               var0.draw0(AbstractFont_lines[var16], var2 + (var4 - var0.stringWidth(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               var0.draw0(AbstractFont_lines[var16], var2 + var4 - var0.stringWidth(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else {
               var0.calculateLineJustification(AbstractFont_lines[var16], var4);
               var0.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_justificationTotal = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("ef")
   void method10465(String var1, int var2, int var3) {
      var3 -= this.ascent;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            int var7 = (char)(Sound.charToByteCp1252(var1.charAt(var6), (byte)110) & 255);
            if (var7 == 60) {
               var4 = var6;
            } else {
               if (var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = 1541374608;
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              int var14 = Message.method1204(var8.substring(4), (byte)-9);
                              IndexedSprite var15 = AbstractFont_modIconSprites[var14];
                              var15.drawAt(var2, var3 + this.ascent - var15.height);
                              var2 += var15.width;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.decodeTag(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if (var7 == 160) {
                  var7 = 1603329163;
               }

               if (var4 == -1) {
                  if (this.kerning != null && var5 != -1) {
                     var2 += this.kerning[(var5 << 8) + var7];
                  }

                  int var13 = this.widths[var7];
                  int var9 = this.heights[var7];
                  if (var7 != 457997106) {
                     if (AbstractFont_alpha == 2134865097) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var13, var9, AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var13, var9, AbstractFont_color);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var7],
                              var2 + this.leftBearings[var7] + 1,
                              var3 + this.topBearings[var7] + 1,
                              var13,
                              var9,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var7],
                           var2 + this.leftBearings[var7],
                           var3 + this.topBearings[var7],
                           var13,
                           var9,
                           AbstractFont_color,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= -241598518;
                  }

                  int var10 = this.advances[var7];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var10, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var10, AbstractFont_underline);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIII)I")
   @ObfuscatedName("cl")
   public int method10415(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return method10422(this, var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("af")
   public int lineCount(String var1, int var2) {
      return this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("bg")
   public int drawWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == -1175535752) {
            var8 = 256;
         }

         method10455(this, var6, var7);
         AbstractFont_alpha = var8;
         if (var11 == 0) {
            var11 = this.ascent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.maxAscent + this.maxDescent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.breakLines(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.maxAscent;
         } else if (var10 == 1) {
            var14 = var3 + this.maxAscent + (var5 - this.maxAscent - this.maxDescent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.maxAscent - this.maxDescent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.maxAscent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               this.draw0(AbstractFont_lines[var16], var2 + (var4 - this.stringWidth(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.draw0(AbstractFont_lines[var16], var2 + var4 - this.stringWidth(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.draw0(AbstractFont_lines[var16], var2, var14);
            } else {
               this.calculateLineJustification(AbstractFont_lines[var16], var4);
               this.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_justificationTotal = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cj")
   public void method10402(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("aa")
   public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_alpha = var6;
         this.draw0(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("cg")
   public int method10398(String var1, int var2) {
      return this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("bz")
   public void method10427(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for (int var10 = 0; var10 < var1.length(); var10++) {
            var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var8, null, var9);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIII)V")
   @ObfuscatedName("ve")
   public static void method10405(AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.drawRightAligned(var1, var2, var2, var2, var2);
      } else if (var1 != null) {
         method10455(var0, var4, var5);
         AbstractFont_alpha = var6;
         var0.draw0(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("bk")
   public void method10430(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIII[I)V")
   @ObfuscatedName("bb")
   public void method10434(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method10440(var8, var1.length());
         }

         double var10 = 7.0 - var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for (int var13 = 0; var13 < var1.length(); var13++) {
            var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var9, null, var12);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("bj")
   public void method10437(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method10440(var6, var1.length());
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("bm")
   public void method10439(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method10440(var6, var1.length());
         }

         this.method10469(var1, var2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIII)V")
   @ObfuscatedName("fb")
   public static void method10407(AbstractFont var0, String var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method10409(var1, var2, var2, var2, var2);
      } else if (var1 != null) {
         method10455(var0, var4, var5);
         var0.draw0(var1, var2 - var0.stringWidth(var1), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("bp")
   int[] method10440(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;I)V")
   @ObfuscatedName("gl")
   public static void method10460(AbstractFont var0, String var1, int var2) {
      if (var0 == null) {
         var0.drawWidgetText(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2, var2);
      } else {
         int var3 = 0;
         boolean var4 = false;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var4 = true;
            } else if (var6 == '>') {
               var4 = false;
            } else if (!var4 && var6 == ' ') {
               var3++;
            }
         }

         if (var3 > 0) {
            AbstractFont_justificationTotal = (var2 - var0.stringWidth(var1) << 8) / var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)V")
   @ObfuscatedName("hf")
   public static void method10364(WorldViewManager var0, int var1) {
      WorldView var2 = (WorldView)var0.worldViews.get((long)var1);
      WorldViewManager.method2896(var0, var2, (short)-29215);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ar")
   public int stringWidth(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = Message.method1204(var7.substring(4), (byte)-95);
                              var4 += AbstractFont_modIconSprites[var8].width;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.advances[(char)(Sound.charToByteCp1252(var6, (byte)20) & 255)];
                  if (this.kerning != null && var3 != -1) {
                     var4 += this.kerning[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("cm")
   public int method10386(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.advances[Sound.charToByteCp1252(var1, (byte)45) & 0xFF];
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("df")
   public int method10420(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         method10455(this, var6, var7);
         AbstractFont_alpha = var8;
         if (var11 == 0) {
            var11 = this.ascent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.maxAscent + this.maxDescent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.breakLines(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.maxAscent;
         } else if (var10 == 1) {
            var14 = var3 + this.maxAscent + (var5 - this.maxAscent - this.maxDescent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.maxAscent - this.maxDescent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.maxAscent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               this.draw0(AbstractFont_lines[var16], var2 + (var4 - this.stringWidth(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.draw0(AbstractFont_lines[var16], var2 + var4 - this.stringWidth(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.draw0(AbstractFont_lines[var16], var2, var14);
            } else {
               this.calculateLineJustification(AbstractFont_lines[var16], var4);
               this.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_justificationTotal = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("dq")
   int[] method10441(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("bw")
   void draw0(String var1, int var2, int var3) {
      var3 -= this.ascent;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(Sound.charToByteCp1252(var1.charAt(var6), (byte)119) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              int var14 = Message.method1204(var8.substring(4), (byte)-13);
                              IndexedSprite var15 = AbstractFont_modIconSprites[var14];
                              var15.drawAt(var2, var3 + this.ascent - var15.height);
                              var2 += var15.width;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.decodeTag(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.kerning != null && var5 != -1) {
                     var2 += this.kerning[(var5 << 8) + var7];
                  }

                  int var13 = this.widths[var7];
                  int var9 = this.heights[var7];
                  if (var7 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var13, var9, AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var13, var9, AbstractFont_color);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var7],
                              var2 + this.leftBearings[var7] + 1,
                              var3 + this.topBearings[var7] + 1,
                              var13,
                              var9,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var7],
                           var2 + this.leftBearings[var7],
                           var3 + this.topBearings[var7],
                           var13,
                           var9,
                           AbstractFont_color,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var10 = this.advances[var7];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var10, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var10, AbstractFont_underline);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II[I[I[I)V")
   @ObfuscatedName("bf")
   void method10469(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ascent;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(Sound.charToByteCp1252(var1.charAt(var10), (byte)76) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              int var21;
                              if (var5 != null) {
                                 var21 = var5[var9];
                              } else {
                                 var21 = 0;
                              }

                              int var22;
                              if (var6 != null) {
                                 var22 = var6[var9];
                              } else {
                                 var22 = 0;
                              }

                              var9++;
                              int var23 = Message.method1204(var12.substring(4), (byte)-21);
                              IndexedSprite var24 = AbstractFont_modIconSprites[var23];
                              var24.drawAt(var2 + var21, var3 + this.ascent - var24.height + var22);
                              var2 += var24.width;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.decodeTag(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.kerning != null && var8 != -1) {
                     var2 += this.kerning[(var8 << 8) + var11];
                  }

                  int var20 = this.widths[var11];
                  int var13 = this.heights[var11];
                  int var14;
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  int var15;
                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = AbstractFont_color;
                  }

                  var9++;
                  if (var11 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var11], var2 + this.leftBearings[var11] + var14, var3 + this.topBearings[var11] + var15, var20, var13, var16);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var11],
                           var2 + this.leftBearings[var11] + var14,
                           var3 + this.topBearings[var11] + var15,
                           var20,
                           var13,
                           var16,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var17 = this.advances[var11];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var17, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var17, AbstractFont_underline);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bh")
   public static String method10368(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == -1541999676 || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == 1582846261) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("gv")
   public static int method10421(
      AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      if (var0 == null) {
         var0.drawRandomAlphaAndSpacing(var1, var2, var2, var2, var2, var2);
      }

      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = -228840554;
         }

         method10455(var0, var6, var7);
         AbstractFont_alpha = var8;
         if (var11 == 0) {
            var11 = var0.ascent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var0.maxAscent + var0.maxDescent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = var0.breakLines(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + var0.maxAscent;
         } else if (var10 == 1) {
            var14 = var3 + var0.maxAscent + (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - var0.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var0.maxAscent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               var0.draw0(AbstractFont_lines[var16], var2 + (var4 - var0.stringWidth(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               var0.draw0(AbstractFont_lines[var16], var2 + var4 - var0.stringWidth(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else {
               var0.calculateLineJustification(AbstractFont_lines[var16], var4);
               var0.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_justificationTotal = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ap")
   abstract void vmethod332(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("at")
   abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("an")
   abstract void vmethod334(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ae")
   abstract void vmethod335(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("av")
   abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ak")
   abstract void vmethod337(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ay")
   abstract void vmethod338(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("aw")
   abstract void vmethod339(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[B[[B[I[I[III)I")
   @ObfuscatedName("bn")
   static int method10366(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[B[[B[I[I[III)I")
   @ObfuscatedName("bd")
   static int method10367(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("br")
   public static String method10369(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("db")
   public void method10431(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bl")
   public static String method10370(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == 379028625 || var4 == 750069359) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == -2048781562) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bq")
   static void method10373(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D_width;
      int var7 = Rasterizer2D_width - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var4 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var9 += var10 * var3;
         var6 += var10 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var11 = Rasterizer2D_xClipStart - var1;
         var3 -= var11;
         var1 = Rasterizer2D_xClipStart;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var12 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ea")
   void method10461(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("bv")
   static void method10377(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("by")
   void calculateLineJustification(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ce")
   static void method10380(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * Rasterizer2D_width;
      int var8 = Rasterizer2D_width - var3;
      int var9 = 0;
      int var10 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var11 = Rasterizer2D_yClipStart - var2;
         var4 -= var11;
         var2 = Rasterizer2D_yClipStart;
         var10 += var11 * var3;
         var7 += var11 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var12 = Rasterizer2D_xClipStart - var1;
         var3 -= var12;
         var1 = Rasterizer2D_xClipStart;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var13 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIIII)V")
   @ObfuscatedName("cu")
   static void method10382(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
      var9 = 256 - var9;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ct")
   void method10383(byte[] var1) {
      this.advances = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.advances.length; var2++) {
            this.advances[var2] = var1[var2] & 255;
         }

         this.ascent = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.advances[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.kerning = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.kerning[(var16 << 8) + var18] = (byte)method10365(var13, var14, var4, this.advances, var11, var16, var18);
                  }
               }
            }
         }

         this.ascent = var4[32] + var11[32];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bi")
   void decodeTag(String var1) {
      try {
         if (var1.startsWith("col=")) {
            AbstractFont_color = Varcs.method3152(var1.substring(4), 16, -990884116);
         } else if (var1.equals("/col")) {
            AbstractFont_color = AbstractFont_previousColor;
         } else if (var1.startsWith("str=")) {
            AbstractFont_strike = Varcs.method3152(var1.substring(4), 16, 475390235);
         } else if (var1.equals("str")) {
            AbstractFont_strike = 8388608;
         } else if (var1.equals("/str")) {
            AbstractFont_strike = -1;
         } else if (var1.startsWith("u=")) {
            AbstractFont_underline = Varcs.method3152(var1.substring(2), 16, 783973386);
         } else if (var1.equals("u")) {
            AbstractFont_underline = 0;
         } else if (var1.equals("/u")) {
            AbstractFont_underline = -1;
         } else if (var1.startsWith("shad=")) {
            AbstractFont_shadow = Varcs.method3152(var1.substring(5), 16, -1286514478);
         } else if (var1.equals("shad")) {
            AbstractFont_shadow = 0;
         } else if (var1.equals("/shad")) {
            AbstractFont_shadow = AbstractFont_previousShadow;
         } else if (var1.equals("br")) {
            method10455(this, AbstractFont_previousColor, AbstractFont_previousShadow);
         }
      } catch (Exception var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("cb")
   public int method10389(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = Message.method1204(var7.substring(4), (byte)-6);
                              var4 += AbstractFont_modIconSprites[var8].width;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.advances[(char)(Sound.charToByteCp1252(var6, (byte)43) & 255)];
                  if (this.kerning != null && var3 != -1) {
                     var4 += this.kerning[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;II)V")
   @ObfuscatedName("ps")
   public static void method10455(AbstractFont var0, int var1, int var2) {
      if (var0 == null) {
         var0.reset(var1, var1);
      }

      AbstractFont_strike = -1;
      AbstractFont_underline = -1;
      AbstractFont_previousShadow = var2;
      AbstractFont_shadow = var2;
      AbstractFont_previousColor = var1;
      AbstractFont_color = var1;
      AbstractFont_alpha = 256;
      AbstractFont_justificationTotal = 0;
      AbstractFont_justificationCurrent = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("ck")
   public int method10391(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for (int var14 = 0; var14 < var13; var14++) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.charWidth('<');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << '\b') + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.charWidth('>');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << '\b') + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = Message.method1204(var16.substring(4), (byte)-59);
                        var4 += AbstractFont_modIconSprites[var17].width;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.charWidth(var15);
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << '\b') + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12++] = var6.substring(var5, var7 - var9);
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var12++] = var6.substring(var5);
         }

         return var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("aq")
   public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsi;IIIII)Lvp;")
   @ObfuscatedName("dy")
   public classVP method10424(classSI var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classSI.method10281(var1, -2146463435)) {
         method10455(this, var4, var5);
         var3 -= this.ascent;

         for (int var7 = 0; var7 < var1.method10284((short)4506); var7++) {
            class472 var8 = var1.method10302(var7, -2079289035);
            if (var6 != -1 && var8.field5867 * -798824383 > var6) {
               return new classVP(var8.field5868 * 1415121929, var8.field5867 * -1255159733);
            }

            int var9 = var8.field5869;
            if (var9 != 10) {
               if (var1.method10276(var7, (byte)-13)) {
                  var9 = 42;
               }

               if (var9 != 9) {
                  if (var9 == 160) {
                     var9 = -1168748709;
                  }

                  int var10 = var2 + var8.field5868 * 1415121929;
                  int var11 = var3 + var8.field5867 * -798824383;
                  int var12 = this.widths[var9];
                  int var13 = this.heights[var9];
                  if (AbstractFont_shadow != -1) {
                     this.drawGlyph(
                        this.pixels[var9], var10 + this.leftBearings[var9] + 1, var11 + this.topBearings[var9] + 1, var12, var13, AbstractFont_shadow
                     );
                  }

                  this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9], var11 + this.topBearings[var9], var12, var13, AbstractFont_color);
               }
            }
         }
      }

      return var1.method10301(726888077);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("co")
   public int method10394(String var1, int var2) {
      int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.stringWidth(AbstractFont_lines[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ag")
   abstract void vmethod340(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("de")
   public void method10451(int var1, int var2, int var3, int var4) {
      var3 -= this.ascent;
      int var5 = var1 & 0xFF;
      if (var5 != -150906043) {
         this.drawGlyph(this.pixels[var5], var2 + this.leftBearings[var5], var3 + this.topBearings[var5], this.widths[var5], this.heights[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("zq")
   public static int method10422(
      AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      if (var0 == null) {
         var0.method10423(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2, var2);
      }

      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         method10455(var0, var6, var7);
         AbstractFont_alpha = var8;
         if (var11 == 0) {
            var11 = var0.ascent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var0.maxAscent + var0.maxDescent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = var0.breakLines(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + var0.maxAscent;
         } else if (var10 == 1) {
            var14 = var3 + var0.maxAscent + (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - var0.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - var0.maxAscent - var0.maxDescent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var0.maxAscent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               var0.draw0(AbstractFont_lines[var16], var2 + (var4 - var0.stringWidth(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               var0.draw0(AbstractFont_lines[var16], var2 + var4 - var0.stringWidth(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               var0.draw0(AbstractFont_lines[var16], var2, var14);
            } else {
               var0.calculateLineJustification(AbstractFont_lines[var16], var4);
               var0.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_justificationTotal = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("ax")
   public int charWidth(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.advances[Sound.charToByteCp1252(var1, (byte)31) & 0xFF];
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("pa")
   public int method10473(char var1) {
      return this.charWidth(var1);
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Lrl;")
   @ObfuscatedName("am")
   public Bounds method10400(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.stringWidth(var3) / 2;
         var6 += this.stringWidth(var3.substring(0, var1));
         int var7 = var5 - this.maxAscent;
         int var8 = this.stringWidth(var3.substring(var1, var1 + var2));
         int var9 = this.maxAscent + this.maxDescent;
         return new Bounds(var6, var7, var8, var9);
      } else {
         return new Bounds(var4, var5, 0, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("ao")
   public void draw(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("cf")
   public void method10406(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_alpha = var6;
         this.draw0(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("do")
   public void method10452(int var1, int var2, int var3, int var4) {
      var3 -= this.ascent;
      int var5 = var1 & 0xFF;
      if (var5 != -916412551) {
         this.drawGlyph(this.pixels[var5], var2 + this.leftBearings[var5], var3 + this.topBearings[var5], this.widths[var5], this.heights[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIIIIIII)I")
   @ObfuscatedName("cb")
   public static int method10416(AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return var0 == null
         ? var0.drawLines(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2)
         : method10422(var0, var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("al")
   public int lineWidth(String var1, int var2) {
      int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.stringWidth(AbstractFont_lines[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("be")
   public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("du")
   public void method10445(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method10469(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bu")
   public void method10453(int var1, int var2, int var3, int var4) {
      var3 -= this.ascent;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         this.drawGlyph(this.pixels[var5], var2 + this.leftBearings[var5], var3 + this.topBearings[var5], this.widths[var5], this.heights[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cv")
   public void method10412(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("ah")
   public int breakLines(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         int var6 = -1;
         int var7 = 0;
         byte var8 = 0;
         int var9 = -1;
         char var10 = 0;
         int var11 = 0;
         int var12 = var1.length();
         field5810.setLength(0);

         for (int var13 = 0; var13 < var12; var13++) {
            char var14 = var1.charAt(var13);
            if (var14 == '<') {
               var9 = var13;
            } else {
               if (var14 == '>' && var9 != -1) {
                  String var15 = var1.substring(var9 + 1, var13);
                  var9 = -1;
                  field5810.append('<');
                  field5810.append(var15);
                  field5810.append('>');
                  if (var15.equals("br")) {
                     var3[var11++] = field5810.substring(var5);
                     field5810.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var6 = -1;
                     var10 = 0;
                  } else if (var15.equals("lt")) {
                     var4 += this.method10473('<');
                     if (this.kerning != null && var10 != -1) {
                        var4 += this.kerning[(var10 << '\b') + 60];
                     }

                     var10 = '<';
                  } else if (var15.equals("gt")) {
                     var4 += this.method10473('>');
                     if (this.kerning != null && var10 != -1) {
                        var4 += this.kerning[(var10 << '\b') + 62];
                     }

                     var10 = '>';
                  } else if (var15.startsWith("img=")) {
                     try {
                        IndexedSprite[] var16 = SecureUrlRequester.client.method2571();
                        int var17 = Integer.parseInt(var15.substring(4));
                        var4 += var16[var17].getOriginalWidth();
                        var10 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var14 = 0;
               }

               if (var9 == -1) {
                  if (var14 != 0) {
                     field5810.append(var14);
                     var4 += this.method10473(var14);
                     if (this.kerning != null && var10 != -1) {
                        var4 += this.kerning[var14 + (var10 << '\b')];
                     }

                     var10 = var14;
                  }

                  if (var14 == ' ') {
                     var6 = field5810.length();
                     var7 = var4;
                     var8 = 1;
                  }

                  if (var2 != null && var4 > var2[var11 < var2.length ? var11 : var2.length - 1] && var6 >= 0) {
                     var3[var11++] = field5810.substring(var5, var6 - var8);
                     var5 = var6;
                     var6 = -1;
                     var4 -= var7;
                     var10 = 0;
                  }

                  if (var14 == '-') {
                     var6 = field5810.length();
                     var7 = var4;
                     var8 = 0;
                  }
               }
            }
         }

         if (field5810.length() > var5) {
            var3[var11++] = field5810.substring(var5);
         }

         return var11;
      }
   }

   AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      this.leftBearings = var2;
      this.topBearings = var3;
      this.widths = var4;
      this.heights = var5;
      method10384(this, var1);
      this.pixels = var6;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MIN_VALUE;

      for (int var9 = 0; var9 < 256; var9++) {
         if (this.topBearings[var9] < var7 && this.heights[var9] != 0) {
            var7 = this.topBearings[var9];
         }

         if (this.topBearings[var9] + this.heights[var9] > var8) {
            var8 = this.topBearings[var9] + this.heights[var9];
         }
      }

      this.maxAscent = this.ascent - var7;
      this.maxDescent = var8 - this.ascent;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bc")
   static void method10374(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D_width;
      int var7 = Rasterizer2D_width - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var4 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var9 += var10 * var3;
         var6 += var10 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var11 = Rasterizer2D_xClipStart - var1;
         var3 -= var11;
         var1 = Rasterizer2D_xClipStart;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var12 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bx")
   static void method10375(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D_width;
      int var7 = Rasterizer2D_width - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < Rasterizer2D_yClipStart) {
         int var10 = Rasterizer2D_yClipStart - var2;
         var4 -= var10;
         var2 = Rasterizer2D_yClipStart;
         var9 += var10 * var3;
         var6 += var10 * Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D_xClipStart) {
         int var11 = Rasterizer2D_xClipStart - var1;
         var3 -= var11;
         var1 = Rasterizer2D_xClipStart;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > Rasterizer2D_xClipEnd) {
         int var12 = var1 + var3 - Rasterizer2D_xClipEnd;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public int getTextWidth(String var1) {
      return this.stringWidth(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("dl")
   public void method10438(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method10440(var6, var1.length());
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("cd")
   public int method10399(String var1, int var2) {
      return this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("dt")
   public void method10432(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIII[I)V")
   @ObfuscatedName("dz")
   public void method10435(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method10440(var8, var1.length());
         }

         double var10 = 7.0 - var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for (int var13 = 0; var13 < var1.length(); var13++) {
            var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var9, null, var12);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIII[I)V")
   @ObfuscatedName("di")
   public void method10436(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method10440(var8, var1.length());
         }

         double var10 = 7.0 - var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for (int var13 = 0; var13 < var1.length(); var13++) {
            var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
         }

         this.method10469(var1, var2 - this.stringWidth(var1) / 2, var3, var9, null, var12);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String escapeBrackets(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("dx")
   int[] method10442(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("dm")
   public void method10446(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method10469(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("dp")
   public void method10447(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method10469(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;[B)V")
   @ObfuscatedName("ke")
   public static void method10384(AbstractFont var0, byte[] var1) {
      if (var0 == null) {
         var0.readMetrics(var1);
      } else {
         var0.advances = new int[256];
         if (var1.length == 257) {
            for (int var2 = 0; var2 < var0.advances.length; var2++) {
               var0.advances[var2] = var1[var2] & 255;
            }

            var0.ascent = var1[256] & 255;
         } else {
            int var10 = 0;

            for (int var3 = 0; var3 < 256; var3++) {
               var0.advances[var3] = var1[var10++] & 255;
            }

            int[] var11 = new int[256];
            int[] var4 = new int[256];

            for (int var5 = 0; var5 < 256; var5++) {
               var11[var5] = var1[var10++] & 255;
            }

            for (int var12 = 0; var12 < 256; var12++) {
               var4[var12] = var1[var10++] & 255;
            }

            byte[][] var13 = new byte[256][];

            for (int var6 = 0; var6 < 256; var6++) {
               var13[var6] = new byte[var11[var6]];
               byte var7 = 0;

               for (int var8 = 0; var8 < var13[var6].length; var8++) {
                  var7 += var1[var10++];
                  var13[var6][var8] = var7;
               }
            }

            byte[][] var14 = new byte[256][];

            for (int var15 = 0; var15 < 256; var15++) {
               var14[var15] = new byte[var11[var15]];
               byte var17 = 0;

               for (int var9 = 0; var9 < var14[var15].length; var9++) {
                  var17 += var1[var10++];
                  var14[var15][var9] = var17;
               }
            }

            var0.kerning = new byte[65536];

            for (int var16 = 0; var16 < 256; var16++) {
               if (var16 != 32 && var16 != 160) {
                  for (int var18 = 0; var18 < 256; var18++) {
                     if (var18 != 32 && var18 != 160) {
                        var0.kerning[(var16 << 8) + var18] = (byte)method10365(var13, var14, var4, var0.advances, var11, var16, var18);
                     }
                  }
               }
            }

            var0.ascent = var4[32] + var11[32];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;IIII)V")
   @ObfuscatedName("sr")
   public static void method10454(AbstractFont var0, int var1, int var2, int var3, int var4) {
      var3 -= var0.ascent;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         var0.drawGlyph(var0.pixels[var5], var2 + var0.leftBearings[var5], var3 + var0.topBearings[var5], var0.widths[var5], var0.heights[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("dg")
   public void method10448(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method10469(var1, var2, var3, null, var7, null);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;[II)[I")
   @ObfuscatedName("si")
   public static int[] method10443(AbstractFont var0, int[] var1, int var2) {
      if (var0 == null) {
         return var0.method10440(var1, var2);
      } else if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("bt")
   public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method10455(this, var4, var5);
         AbstractFont_random.setSeed(var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method10469(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("ca")
   public void method10413(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("aj")
   abstract void vmethod341(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ec")
   void method10458(String var1) {
      try {
         if (var1.startsWith("col=")) {
            AbstractFont_color = Varcs.method3152(var1.substring(4), 16, -1574839165);
         } else if (var1.equals("/col")) {
            AbstractFont_color = AbstractFont_previousColor;
         } else if (var1.startsWith("str=")) {
            AbstractFont_strike = Varcs.method3152(var1.substring(4), 16, 1176986519);
         } else if (var1.equals("str")) {
            AbstractFont_strike = 8388608;
         } else if (var1.equals("/str")) {
            AbstractFont_strike = -1;
         } else if (var1.startsWith("u=")) {
            AbstractFont_underline = Varcs.method3152(var1.substring(2), 16, -1857235800);
         } else if (var1.equals("u")) {
            AbstractFont_underline = 0;
         } else if (var1.equals("/u")) {
            AbstractFont_underline = -1;
         } else if (var1.startsWith("shad=")) {
            AbstractFont_shadow = Varcs.method3152(var1.substring(5), 16, -552377394);
         } else if (var1.equals("shad")) {
            AbstractFont_shadow = 0;
         } else if (var1.equals("/shad")) {
            AbstractFont_shadow = AbstractFont_previousShadow;
         } else if (var1.equals("br")) {
            method10455(this, AbstractFont_previousColor, AbstractFont_previousShadow);
         }
      } catch (Exception var3) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("ch")
   static void method10378(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
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
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("lk")
   public static void method10428(AbstractFont var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var0 == null) {
         var0.drawRandomAlphaAndSpacing(var1, var2, var2, var2, var2, var2);
      } else if (var1 != null) {
         method10455(var0, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = var0.method10440(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for (int var10 = 0; var10 < var1.length(); var10++) {
            var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
         }

         var0.method10469(var1, var2 - var0.stringWidth(var1) / 2, var3, var8, null, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ee")
   void method10463(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("er")
   void method10464(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }
   }

   public int getBaseline() {
      return this.ascent;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("ek")
   void method10467(String var1, int var2, int var3) {
      var3 -= this.ascent;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(Sound.charToByteCp1252(var1.charAt(var6), (byte)56) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              int var14 = Message.method1204(var8.substring(4), (byte)-97);
                              IndexedSprite var15 = AbstractFont_modIconSprites[var14];
                              var15.drawAt(var2, var3 + this.ascent - var15.height);
                              var2 += var15.width;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.decodeTag(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.kerning != null && var5 != -1) {
                     var2 += this.kerning[(var5 << 8) + var7];
                  }

                  int var13 = this.widths[var7];
                  int var9 = this.heights[var7];
                  if (var7 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var13, var9, AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var13, var9, AbstractFont_color);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var7],
                              var2 + this.leftBearings[var7] + 1,
                              var3 + this.topBearings[var7] + 1,
                              var13,
                              var9,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var7],
                           var2 + this.leftBearings[var7],
                           var3 + this.topBearings[var7],
                           var13,
                           var9,
                           AbstractFont_color,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var10 = this.advances[var7];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var10, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var10, AbstractFont_underline);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Lrl;")
   @ObfuscatedName("cz")
   public Bounds method10401(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.stringWidth(var3) / 2;
         var6 += this.stringWidth(var3.substring(0, var1));
         int var7 = var5 - this.maxAscent;
         int var8 = this.stringWidth(var3.substring(var1, var1 + var2));
         int var9 = this.maxAscent + this.maxDescent;
         return new Bounds(var6, var7, var8, var9);
      } else {
         return new Bounds(var4, var5, 0, 0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;I)I")
   @ObfuscatedName("cp")
   public static int method10396(AbstractFont var0, String var1, int var2) {
      if (var0 == null) {
         var0.draw0(var1, var2, var2);
      }

      int var3 = var0.breakLines(var1, new int[]{var2}, AbstractFont_lines);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var0.stringWidth(AbstractFont_lines[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("ci")
   public void method10408(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II[I[I[I)V")
   @ObfuscatedName("ew")
   void method10470(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ascent;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(Sound.charToByteCp1252(var1.charAt(var10), (byte)55) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              int var21;
                              if (var5 != null) {
                                 var21 = var5[var9];
                              } else {
                                 var21 = 0;
                              }

                              int var22;
                              if (var6 != null) {
                                 var22 = var6[var9];
                              } else {
                                 var22 = 0;
                              }

                              var9++;
                              int var23 = Message.method1204(var12.substring(4), (byte)-53);
                              IndexedSprite var24 = AbstractFont_modIconSprites[var23];
                              var24.drawAt(var2 + var21, var3 + this.ascent - var24.height + var22);
                              var2 += var24.width;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.decodeTag(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.kerning != null && var8 != -1) {
                     var2 += this.kerning[(var8 << 8) + var11];
                  }

                  int var20 = this.widths[var11];
                  int var13 = this.heights[var11];
                  int var14;
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  int var15;
                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = AbstractFont_color;
                  }

                  var9++;
                  if (var11 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow
                           );
                        }

                        this.drawGlyph(this.pixels[var11], var2 + this.leftBearings[var11] + var14, var3 + this.topBearings[var11] + var15, var20, var13, var16);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(
                              this.pixels[var11],
                              var2 + this.leftBearings[var11] + 1 + var14,
                              var3 + this.topBearings[var11] + 1 + var15,
                              var20,
                              var13,
                              AbstractFont_shadow,
                              AbstractFont_alpha
                           );
                        }

                        this.vmethod332(
                           this.pixels[var11],
                           var2 + this.leftBearings[var11] + var14,
                           var3 + this.topBearings[var11] + var15,
                           var20,
                           var13,
                           var16,
                           AbstractFont_alpha
                        );
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent = AbstractFont_justificationCurrent + AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var17 = this.advances[var11];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + (int)(this.ascent * 0.7), var17, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var17, AbstractFont_underline);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;Lsi;IIIII)Lvp;")
   @ObfuscatedName("bd")
   public static classVP method10425(AbstractFont var0, classSI var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         return var0.method10426(var1, var2, var2, var2, var2, var2);
      } else {
         if (!classSI.method10281(var1, -2147251603)) {
            method10455(var0, var4, var5);
            var3 -= var0.ascent;

            for (int var7 = 0; var7 < var1.method10284((short)-2371); var7++) {
               class472 var8 = var1.method10302(var7, -1645648174);
               if (var6 != -1 && var8.field5867 * -798824383 > var6) {
                  return new classVP(var8.field5868 * 1415121929, var8.field5867 * -798824383);
               }

               char var9 = var8.field5869;
               if (var9 != '\n') {
                  if (var1.method10276(var7, (byte)-35)) {
                     var9 = '*';
                  }

                  if (var9 != '\t') {
                     if (var9 == 160) {
                        var9 = ' ';
                     }

                     int var10 = var2 + var8.field5868 * 1415121929;
                     int var11 = var3 + var8.field5867 * -798824383;
                     int var12 = var0.widths[var9];
                     int var13 = var0.heights[var9];
                     if (AbstractFont_shadow != -1) {
                        var0.drawGlyph(
                           var0.pixels[var9], var10 + var0.leftBearings[var9] + 1, var11 + var0.topBearings[var9] + 1, var12, var13, AbstractFont_shadow
                        );
                     }

                     var0.drawGlyph(var0.pixels[var9], var10 + var0.leftBearings[var9], var11 + var0.topBearings[var9], var12, var13, AbstractFont_color);
                  }
               }
            }
         }

         return var1.method10301(726888077);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ab")
   void readMetrics(byte[] var1) {
      this.advances = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.advances.length; var2++) {
            this.widths[var2] = var1[var2] & 255;
         }

         this.maxAscent = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.topBearings[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.kerning = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.kerning[(var16 << 8) + var18] = (byte)method10365(var13, var14, var4, this.widths, var11, var16, var18);
                  }
               }
            }
         }

         this.maxAscent = var4[32] + var11[32];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("xx")
   public void method10409(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.method10389(var1), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cr")
   public void method10414(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method10455(this, var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIII)I")
   @ObfuscatedName("bo")
   public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return method10422(this, var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ba")
   void reset(int var1, int var2) {
      AbstractFont_alpha = -1;
      AbstractFont_color = -1;
      AbstractFont_alpha = var2;
      AbstractFont_previousColor = var2;
      AbstractFont_underline = var1;
      AbstractFont_previousColor = var1;
      AbstractFont_previousColor = 256;
      AbstractFont_color = 0;
      AbstractFont_justificationCurrent = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("dv")
   public int method10423(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         method10455(this, var6, var7);
         AbstractFont_previousColor = var8;
         if (var11 == 0) {
            var11 = this.maxAscent;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.maxDescent + this.maxAscent + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method10391(var1, var12, AbstractFont_lines);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.ascent;
         } else if (var10 == 1) {
            var14 = var3 + this.maxAscent + (var5 - this.maxAscent - this.ascent - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.maxDescent - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.maxAscent - this.ascent - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.maxDescent + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.draw0(AbstractFont_lines[var16], var2, var14);
            } else if (var9 == 1) {
               this.method10467(AbstractFont_lines[var16], var2 + (var4 - this.method10389(AbstractFont_lines[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.method10467(AbstractFont_lines[var16], var2 + var4 - this.method10389(AbstractFont_lines[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.method10467(AbstractFont_lines[var16], var2, var14);
            } else {
               this.method10461(AbstractFont_lines[var16], var4);
               this.draw0(AbstractFont_lines[var16], var2, var14);
               AbstractFont_previousShadow = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("dh")
   public void method10433(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method10455(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method10442(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method10470(var1, var2 - this.method10389(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsi;IIIII)Lvp;")
   @ObfuscatedName("bs")
   public classVP method10426(classSI var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classSI.method10281(var1, -2147251603)) {
         method10455(this, var4, var5);
         var3 -= this.maxAscent;

         for (int var7 = 0; var7 < var1.method10284((short)-2371); var7++) {
            class472 var8 = var1.method10302(var7, -1645648174);
            if (var6 != -1 && var8.field5867 * -798824383 > var6) {
               return new classVP(var8.field5867 * 1415121929, var8.field5867 * -798824383);
            }

            char var9 = var8.field5869;
            if (var9 != '\n') {
               if (var1.method10276(var7, (byte)-35)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field5868 * 1415121929;
                  int var11 = var3 + var8.field5868 * -798824383;
                  int var12 = this.widths[var9];
                  int var13 = this.topBearings[var9];
                  if (AbstractFont_underline != -1) {
                     this.vmethod341(
                        this.pixels[var9], var10 + this.topBearings[var9] + 1, var11 + this.heights[var9] + 1, var12, var13, AbstractFont_underline
                     );
                  }

                  this.vmethod341(this.pixels[var9], var10 + this.leftBearings[var9], var11 + this.heights[var9], var12, var13, AbstractFont_strike);
               }
            }
         }
      }

      return var1.method10301(726888077);
   }
}
