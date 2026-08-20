import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.api.SpritePixels;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ym")
public final class classYM extends classYW implements SpritePixels {
   @ObfuscatedName("ac")
   public int field7009;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7016 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field7015 = 4095;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field7012 = 12;
   @ObfuscatedName("ao")
   int field7011;
   @ObfuscatedName("as")
   public int[] field7005;
   @ObfuscatedName("ax")
   public int field7007;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7013 = 8;
   @ObfuscatedName("aa")
   public int field7010;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7014 = 15;
   @ObfuscatedName("aw")
   public int field7006;
   @ObfuscatedName("ak")
   public int field7008;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIII)V")
   @ObfuscatedName("bu")
   static void method13441(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   @ObfuscatedSignature(descriptor = "(Lym;IIIIIIIIII[I[I)V")
   @ObfuscatedName("uc")
   public static void method13544(
      classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12
   ) {
      if (var0 == null) {
         var0.method13547(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var11, var11);
      } else {
         int var13 = classBF.method997(var7, (byte)-44);
         int var15 = classLL.method7119(var7, 1222866659);
         var0.method13541(var1, var2, var3, var4, var5, var6, var13, var15, var8, var9, var10, var11, var12);
      }
   }

   public classYM(int var1, int var2) {
      this(new int[var1 * var2], var1, var2);
   }

   public classYM(int[] var1, int var2, int var3) {
      this.field7005 = var1;
      this.field7007 = this.field7006 = var2;
      this.field7009 = this.field7008 = var3;
      this.field7011 = 0;
      this.field7010 = 0;
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIII)V")
   @ObfuscatedName("az")
   static void method13437(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("bm")
   public void method13548(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (field7102 % 2 != 0) {
               var5++;
            }

            if (field7101 % 2 != 0) {
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
         int var16 = var1 + var2 * field7102;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.field7007 && var21 >= 0 && var21 < this.field7009) {
                  int var22 = var20 + var21 * this.field7007;
                  if (var22 >= 0 && var22 < this.field7005.length) {
                     int var23 = this.field7005[var22];
                     if (var23 != 0) {
                        field7104[var17] = var23 | 0xFF000000;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field7102;
         }
      } catch (Exception var24) {
      }
   }

   public int getWidth() {
      return this.field7007;
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIII)V")
   @ObfuscatedName("ae")
   static void method13442(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("ab")
   static void method13443(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("iv")
   void method13555(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field7010 << 4;
         var2 -= this.field7011 << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field7007 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field7007 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field7009 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field7009 << 4) - var2) * var10;
         int var17 = ((this.field7007 << 4) - var1) * var10 + ((this.field7009 << 4) - var2) * var9;
         int var18 = -((this.field7007 << 4) - var1) * var9 + ((this.field7009 << 4) - var2) * var10;
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
         if (var19 < field7097) {
            var19 = field7097;
         }

         if (var20 > field7099) {
            var20 = field7099;
         }

         if (var21 < field7096) {
            var21 = field7096;
         }

         if (var22 > field7098) {
            var22 = field7098;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * field7102 + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += field7102) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field7007 << 12) < 0 && var31 - (this.field7009 << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.field7005[(var36 >> 12) * this.field7007 + (var35 >> 12)];
                              if (var38 != 0) {
                                 field7104[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += field7102) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.field7009 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.field7005[(var108 >> 12) * this.field7007 + (var100 >> 12)];
                              if (var124 != 0) {
                                 field7104[var92++] = var124;
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
                     for (int var85 = var22; var85 < 0; var23 += field7102) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.field7009 << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.field7005[(var109 >> 12) * this.field7007 + (var101 >> 12)];
                              if (var125 != 0) {
                                 field7104[var93++] = var125;
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
                     for (int var86 = var22; var86 < 0; var23 += field7102) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.field7007 << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.field7005[(var110 >> 12) * this.field7007 + (var102 >> 12)];
                              if (var126 != 0) {
                                 field7104[var94++] = var126;
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
                     for (int var87 = var22; var87 < 0; var23 += field7102) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.field7007 << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.field7009 << 12)) >= 0) {
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
                           int var127 = this.field7005[(var111 >> 12) * this.field7007 + (var103 >> 12)];
                           if (var127 != 0) {
                              field7104[var95++] = var127;
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
                     for (int var88 = var22; var88 < 0; var23 += field7102) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.field7007 << 12)) >= 0) {
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

                        if ((var68 = (1 + var112 - (this.field7009 << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.field7005[(var112 >> 12) * this.field7007 + (var104 >> 12)];
                           if (var128 != 0) {
                              field7104[var96++] = var128;
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
                  for (int var89 = var22; var89 < 0; var23 += field7102) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.field7007 << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.field7005[(var113 >> 12) * this.field7007 + (var105 >> 12)];
                           if (var129 != 0) {
                              field7104[var97++] = var129;
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
                  for (int var90 = var22; var90 < 0; var23 += field7102) {
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
                     if ((var76 = (1 + var106 - (this.field7007 << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.field7009 << 12)) >= 0) {
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
                        int var130 = this.field7005[(var114 >> 12) * this.field7007 + (var106 >> 12)];
                        if (var130 != 0) {
                           field7104[var98++] = var130;
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
                  for (int var91 = var22; var91 < 0; var23 += field7102) {
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
                     if ((var81 = (1 + var107 - (this.field7007 << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.field7009 << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.field7005[(var115 >> 12) * this.field7007 + (var107 >> 12)];
                        if (var131 != 0) {
                           field7104[var99++] = var131;
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

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("as")
   static void method13452(
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
               client.method2316(
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

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("ax")
   static void method13454(
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

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII[I[I)V")
   @ObfuscatedName("it")
   void method13539(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int[] var12, int[] var13) {
      try {
         int var14 = -var3 / 2;
         int var15 = -var4 / 2;
         var7 = (int)(((long)var7 << 8) / var9);
         var8 = (int)(((long)var8 << 8) / var9);
         int var16 = (var5 << 16) + var15 * var7 + var14 * var8;
         int var17 = (var6 << 16) + (var15 * var8 - var14 * var7);
         int var18 = var1 + var2 * field7102;

         for (int var19 = 0; var19 < var4; var19++) {
            int var20 = var2 + var19;
            int var21 = var20 - var11;
            if (var21 >= 0 && var21 < var12.length && var12[var21] >= 0) {
               int var22 = var18;
               int var23 = var16;
               int var24 = var17;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var26 = var1 + var3 + var25;
                  int var27 = var26 - var10;
                  if (var27 >= var12[var21] && var27 < var12[var21] + var13[var21]) {
                     int var28 = var23 >> 16;
                     int var29 = var24 >> 16;
                     if (var28 >= 0 && var28 < this.field7007 && var29 >= 0 && var29 < this.field7009) {
                        int var30 = var28 + var29 * this.field7007;
                        int var31 = this.field7005[var30];
                        if (var31 != 0) {
                           field7104[var22] = var31;
                        }
                     }
                  }

                  var22++;
                  var23 += var8;
                  var24 -= var7;
               }
            }

            var16 += var7;
            var17 += var8;
            var18 += field7102;
         }
      } catch (Exception var32) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("aa")
   static void method13463(
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
   @ObfuscatedName("ao")
   static void method13468(
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

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("al")
   public classYM method13470() {
      classYM var1 = new classYM(this.field7007, this.field7009);
      var1.field7006 = this.field7006;
      var1.field7008 = this.field7008;
      var1.field7010 = this.field7006 - this.field7007 - this.field7010;
      var1.field7011 = this.field7011;

      for (int var2 = 0; var2 < this.field7009; var2++) {
         for (int var3 = 0; var3 < this.field7007; var3++) {
            var1.field7005[var2 * this.field7007 + var3] = this.field7005[var2 * this.field7007 + this.field7007 - 1 - var3];
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method13495() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = this.field7009 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.field7007; var4++) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7011 = this.field7008 - this.field7009 - this.field7011;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ay")
   public classYM method13476() {
      classYM var1 = new classYM(this.field7006, this.field7008);

      for (int var2 = 0; var2 < this.field7009; var2++) {
         for (int var3 = 0; var3 < this.field7007; var3++) {
            var1.field7005[(var2 + this.field7011) * this.field7006 + var3 + this.field7010] = this.field7005[var2 * this.field7007 + var3];
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public void method13477() {
      method13662(this.field7005, this.field7007, this.field7009, null);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   public void method13482() {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int[] var1 = new int[this.field7006 * this.field7008];

         for (int var2 = 0; var2 < this.field7009; var2++) {
            for (int var3 = 0; var3 < this.field7007; var3++) {
               var1[(var2 + this.field7011) * this.field7006 + var3 + this.field7010] = this.field7005[var2 * this.field7007 + var3];
            }
         }

         this.field7005 = var1;
         this.field7007 = this.field7006;
         this.field7009 = this.field7008;
         this.field7010 = 0;
         this.field7011 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("af")
   static void method13438(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cj")
   public void method13491() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field7009; var3++) {
         for (int var4 = this.field7007 - 1; var4 >= 0; var4--) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7010 = this.field7006 - this.field7007 - this.field7010;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ah")
   public void method13524(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         method13452(field7104, this.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;III)V")
   @ObfuscatedName("sz")
   public static void method13529(classYM var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13531(var1, var1, var1);
      } else {
         var1 += var0.field7010;
         var2 += var0.field7011;
         int var4 = var1 + var2 * field7102;
         int var5 = 0;
         int var6 = var0.field7009;
         int var7 = var0.field7007;
         int var8 = field7102 - var7;
         int var9 = 0;
         if (var2 < field7096) {
            int var10 = field7096 - var2;
            var6 -= var10;
            var2 = field7096;
            var5 += var10 * var7;
            var4 += var10 * field7102;
         }

         if (var2 + var6 > field7098) {
            var6 -= var2 + var6 - field7098;
         }

         if (var1 < field7097) {
            int var13 = field7097 - var1;
            var7 -= var13;
            var1 = field7097;
            var5 += var13;
            var4 += var13;
            var9 += var13;
            var8 += var13;
         }

         if (var1 + var7 > field7099) {
            int var14 = var1 + var7 - field7099;
            var7 -= var14;
            var9 += var14;
            var8 += var14;
         }

         if (var7 > 0 && var6 > 0) {
            if (var3 == 256) {
               method13454(0, 0, 0, field7104, var0.field7005, var5, 0, var4, 0, var7, var6, var8, var9);
            } else {
               method13461(0, 0, 0, field7104, var0.field7005, var5, 0, var4, 0, var7, var6, var8, var9, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII[I[I)V")
   @ObfuscatedName("ig")
   void method13540(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int[] var12, int[] var13) {
      try {
         int var14 = -var3 / 2;
         int var15 = -var4 / 2;
         var7 = (int)(((long)var7 << 8) / var9);
         var8 = (int)(((long)var8 << 8) / var9);
         int var16 = (var5 << 16) + var15 * var7 + var14 * var8;
         int var17 = (var6 << 16) + (var15 * var8 - var14 * var7);
         int var18 = var1 + var2 * field7102;

         for (int var19 = 0; var19 < var4; var19++) {
            int var20 = var2 + var19;
            int var21 = var20 - var11;
            if (var21 >= 0 && var21 < var12.length && var12[var21] >= 0) {
               int var22 = var18;
               int var23 = var16;
               int var24 = var17;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var26 = var1 + var3 + var25;
                  int var27 = var26 - var10;
                  if (var27 >= var12[var21] && var27 < var12[var21] + var13[var21]) {
                     int var28 = var23 >> 16;
                     int var29 = var24 >> 16;
                     if (var28 >= 0 && var28 < this.field7007 && var29 >= 0 && var29 < this.field7009) {
                        int var30 = var28 + var29 * this.field7007;
                        int var31 = this.field7005[var30];
                        if (var31 != 0) {
                           field7104[var22] = var31;
                        }
                     }
                  }

                  var22++;
                  var23 += var8;
                  var24 -= var7;
               }
            }

            var16 += var7;
            var17 += var8;
            var18 += field7102;
         }
      } catch (Exception var32) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;II)V")
   @ObfuscatedName("gz")
   public static void method13511(classYM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13514(var1, var1);
      }

      var1 += var0.field7010;
      var2 += var0.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = var0.field7009;
      int var6 = var0.field7007;
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
         method13438(field7104, var0.field7005, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("ba")
   static void method13444(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   public void method13508(int var1, int var2) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7009;
      int var6 = this.field7007;
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
         method13437(field7104, this.field7005, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("ia")
   public void method13549(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (field7102 % 2 != 0) {
               var5++;
            }

            if (field7101 % 2 != 0) {
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
         int var16 = var1 + var2 * field7102;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.field7007 && var21 >= 0 && var21 < this.field7009) {
                  int var22 = var20 + var21 * this.field7007;
                  if (var22 >= 0 && var22 < this.field7005.length) {
                     int var23 = this.field7005[var22];
                     if (var23 != 0) {
                        field7104[var17] = var23;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field7102;
         }
      } catch (Exception var24) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIIII)V")
   @ObfuscatedName("cp")
   static void method13469(
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
               var0 = (var1 & -66965708) + (var0 * var16 - var1 & 479824946) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & -2143728571) + (var1 & 16711935);
               var1 = (var0 & -1822757449) + (var2 - var0 & 295516802);
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

   public int getMaxWidth() {
      return this.field7006;
   }

   public int getOffsetY() {
      return this.field7011;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("an")
   public void method13518(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         method13511(this, var1, var2);
      } else {
         var1 += this.field7010;
         var2 += this.field7011;
         int var5 = var1 + var2 * field7102;
         int var6 = 0;
         int var7 = this.field7009;
         int var8 = this.field7007;
         int var9 = field7102 - var8;
         int var10 = 0;
         if (var2 < field7096) {
            int var11 = field7096 - var2;
            var7 -= var11;
            var2 = field7096;
            var6 += var11 * var8;
            var5 += var11 * field7102;
         }

         if (var2 + var7 > field7098) {
            var7 -= var2 + var7 - field7098;
         }

         if (var1 < field7097) {
            int var14 = field7097 - var1;
            var8 -= var14;
            var1 = field7097;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > field7099) {
            int var15 = var1 + var8 - field7099;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            method13443(field7104, this.field7005, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("aj")
   public classYM method13473() {
      classYM var1 = new classYM(this.field7007, this.field7009);
      var1.field7006 = this.field7006;
      var1.field7008 = this.field7008;
      var1.field7010 = this.field7010;
      var1.field7011 = this.field7011;
      int var2 = this.field7005.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.field7005[var3] = this.field7005[var3];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   public void method13499(int var1) {
      int[] var2 = new int[this.field7007 * this.field7009];
      int var3 = 0;

      for (int var4 = 0; var4 < this.field7009; var4++) {
         for (int var5 = 0; var5 < this.field7007; var5++) {
            int var6 = this.field7005[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field7005[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field7005[var3 - this.field7007] != 0) {
                  var6 = var1;
               } else if (var5 < this.field7007 - 1 && this.field7005[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field7009 - 1 && this.field7005[var3 + this.field7007] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field7005 = var2;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bx")
   public void method13532(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         if (var5 == 256) {
            method13463(0, 0, 0, var8, this.field7005, field7104, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
         } else {
            method13468(0, 0, 0, var8, this.field7005, field7104, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("bc")
   public void method13534(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field7009 <= var6 ? this.field7009 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.field7007 > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field7102;
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
         if (var1 + this.field7007 <= var16 + var17) {
            var12 = this.field7007;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.field7005[var20 + var15 * this.field7007];
            if (var21 != 0) {
               field7104[var18++] = var21 | 0xFF000000;
            } else {
               var18++;
            }
         }

         var13 += field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII[I[I)V")
   @ObfuscatedName("il")
   void method13541(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int[] var12, int[] var13) {
      try {
         int var14 = -var3 / 2;
         int var15 = -var4 / 2;
         var7 = (int)(((long)var7 << 8) / var9);
         var8 = (int)(((long)var8 << 8) / var9);
         int var16 = (var5 << 16) + var15 * var7 + var14 * var8;
         int var17 = (var6 << 16) + (var15 * var8 - var14 * var7);
         int var18 = var1 + var2 * field7102;

         for (int var19 = 0; var19 < var4; var19++) {
            int var20 = var2 + var19;
            int var21 = var20 - var11;
            if (var21 >= 0 && var21 < var12.length && var12[var21] >= 0) {
               int var22 = var18;
               int var23 = var16;
               int var24 = var17;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var26 = var1 + var3 + var25;
                  int var27 = var26 - var10;
                  if (var27 >= var12[var21] && var27 < var12[var21] + var13[var21]) {
                     int var28 = var23 >> 16;
                     int var29 = var24 >> 16;
                     if (var28 >= 0 && var28 < this.field7007 && var29 >= 0 && var29 < this.field7009) {
                        int var30 = var28 + var29 * this.field7007;
                        int var31 = this.field7005[var30];
                        if (var31 != 0) {
                           field7104[var22] = var31 | 0xFF000000;
                        }
                     }
                  }

                  var22++;
                  var23 += var8;
                  var24 -= var7;
               }
            }

            var16 += var7;
            var17 += var8;
            var18 += field7102;
         }
      } catch (Exception var32) {
      }
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("ct")
   static void method13464(
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
               var0 = (var0 & 772521864) + (var1 & 407590904);
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

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("ag")
   static void method13448(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               client.method2316(
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

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("bg")
   void method13556(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field7010 << 4;
         var2 -= this.field7011 << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field7007 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field7007 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field7009 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field7009 << 4) - var2) * var10;
         int var17 = ((this.field7007 << 4) - var1) * var10 + ((this.field7009 << 4) - var2) * var9;
         int var18 = -((this.field7007 << 4) - var1) * var9 + ((this.field7009 << 4) - var2) * var10;
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
         if (var19 < field7097) {
            var19 = field7097;
         }

         if (var20 > field7099) {
            var20 = field7099;
         }

         if (var21 < field7096) {
            var21 = field7096;
         }

         if (var22 > field7098) {
            var22 = field7098;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * field7102 + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += field7102) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field7007 << 12) < 0 && var31 - (this.field7009 << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.field7005[(var36 >> 12) * this.field7007 + (var35 >> 12)];
                              if (var38 != 0) {
                                 field7104[var34++] = var38 | 0xFF000000;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += field7102) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.field7009 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.field7005[(var108 >> 12) * this.field7007 + (var100 >> 12)];
                              if (var124 != 0) {
                                 field7104[var92++] = var124 | 0xFF000000;
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
                     for (int var85 = var22; var85 < 0; var23 += field7102) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.field7009 << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.field7005[(var109 >> 12) * this.field7007 + (var101 >> 12)];
                              if (var125 != 0) {
                                 field7104[var93++] = var125 | 0xFF000000;
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
                     for (int var86 = var22; var86 < 0; var23 += field7102) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.field7007 << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.field7005[(var110 >> 12) * this.field7007 + (var102 >> 12)];
                              if (var126 != 0) {
                                 field7104[var94++] = var126 | 0xFF000000;
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
                     for (int var87 = var22; var87 < 0; var23 += field7102) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.field7007 << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.field7009 << 12)) >= 0) {
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
                           int var127 = this.field7005[(var111 >> 12) * this.field7007 + (var103 >> 12)];
                           if (var127 != 0) {
                              field7104[var95++] = var127 | 0xFF000000;
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
                     for (int var88 = var22; var88 < 0; var23 += field7102) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.field7007 << 12)) >= 0) {
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

                        if ((var68 = (1 + var112 - (this.field7009 << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.field7005[(var112 >> 12) * this.field7007 + (var104 >> 12)];
                           if (var128 != 0) {
                              field7104[var96++] = var128 | 0xFF000000;
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
                  for (int var89 = var22; var89 < 0; var23 += field7102) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.field7007 << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.field7005[(var113 >> 12) * this.field7007 + (var105 >> 12)];
                           if (var129 != 0) {
                              field7104[var97++] = var129 | 0xFF000000;
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
                  for (int var90 = var22; var90 < 0; var23 += field7102) {
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
                     if ((var76 = (1 + var106 - (this.field7007 << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.field7009 << 12)) >= 0) {
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
                        int var130 = this.field7005[(var114 >> 12) * this.field7007 + (var106 >> 12)];
                        if (var130 != 0) {
                           field7104[var98++] = var130 | 0xFF000000;
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
                  for (int var91 = var22; var91 < 0; var23 += field7102) {
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
                     if ((var81 = (1 + var107 - (this.field7007 << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.field7009 << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.field7005[(var115 >> 12) * this.field7007 + (var107 >> 12)];
                        if (var131 != 0) {
                           field7104[var99++] = var131 | 0xFF000000;
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
   @ObfuscatedName("bj")
   public void method13559(int var1, int var2, int var3, int var4) {
      if (var3 <= this.field7006 && var4 <= this.field7008) {
         int var5 = var1 + this.field7010 * var3 / this.field7006;
         int var6 = var1 + ((this.field7010 + this.field7007) * var3 + this.field7006 - 1) / this.field7006;
         int var7 = var2 + this.field7011 * var4 / this.field7008;
         int var8 = var2 + ((this.field7011 + this.field7009) * var4 + this.field7008 - 1) / this.field7008;
         if (var5 < field7097) {
            var5 = field7097;
         }

         if (var6 > field7099) {
            var6 = field7099;
         }

         if (var7 < field7096) {
            var7 = field7096;
         }

         if (var8 > field7098) {
            var8 = field7098;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * field7102 + var5;
            int var10 = field7102 - (var6 - var5);
            if (var9 < field7104.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field7006 / var3 - (this.field7010 << 4);
                     int var16 = (var13 + 16) * this.field7006 / var3 - (this.field7010 << 4);
                     int var17 = var14 * this.field7008 / var4 - (this.field7011 << 4);
                     int var18 = (var14 + 16) * this.field7008 / var4 - (this.field7011 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.field7007 << 4) {
                           var16 = this.field7007 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.field7009 << 4) {
                           var18 = this.field7009 << 4;
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
                              int var31 = this.field7005[var28 * this.field7007 + var30];
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

                           field7104[var9] = var39 | 0xFF000000;
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("bk")
   static void method13439(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
   @ObfuscatedSignature(descriptor = "([I[IIIIIIII)V")
   @ObfuscatedName("bo")
   static void method13440(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public void drawAt(int var1, int var2) {
      method13511(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dx")
   public void method13486(int var1) {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int var2 = var1;
         if (var1 > this.field7010) {
            var2 = this.field7010;
         }

         int var3 = var1;
         if (var1 + this.field7010 + this.field7007 > this.field7006) {
            var3 = this.field7006 - this.field7010 - this.field7007;
         }

         int var4 = var1;
         if (var1 > this.field7011) {
            var4 = this.field7011;
         }

         int var5 = var1;
         if (var1 + this.field7011 + this.field7009 > this.field7008) {
            var5 = this.field7008 - this.field7011 - this.field7009;
         }

         int var6 = this.field7007 + var2 + var3;
         int var7 = this.field7009 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.field7009; var9++) {
            for (int var10 = 0; var10 < this.field7007; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field7005[var9 * this.field7007 + var10];
            }
         }

         this.field7005 = var8;
         this.field7007 = var6;
         this.field7009 = var7;
         this.field7010 -= var2;
         this.field7011 -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public void method13492() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field7009; var3++) {
         for (int var4 = this.field7007 - 1; var4 >= 0; var4--) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7010 = this.field7006 - this.field7007 - this.field7010;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("bw")
   static void method13445(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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
   @ObfuscatedSignature(descriptor = "(Lym;IIIIIIIIIII[I[I)V")
   @ObfuscatedName("an")
   public static void method13542(
      classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int[] var12, int[] var13
   ) {
      if (var0 == null) {
         var0.method13527(var1, var1, var1, var1, var1);
      }

      try {
         int var14 = -var3 / 2;
         int var15 = -var4 / 2;
         var7 = (int)(((long)var7 << 8) / var9);
         var8 = (int)(((long)var8 << 8) / var9);
         int var16 = (var5 << 16) + var15 * var7 + var14 * var8;
         int var17 = (var6 << 16) + (var15 * var8 - var14 * var7);
         int var18 = var1 + var2 * field7102;

         for (int var19 = 0; var19 < var4; var19++) {
            int var20 = var2 + var19;
            int var21 = var20 - var11;
            if (var21 >= 0 && var21 < var12.length && var12[var21] >= 0) {
               int var22 = var18;
               int var23 = var16;
               int var24 = var17;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var26 = var1 + var3 + var25;
                  int var27 = var26 - var10;
                  if (var27 >= var12[var21] && var27 < var12[var21] + var13[var21]) {
                     int var28 = var23 >> 16;
                     int var29 = var24 >> 16;
                     if (var28 >= 0 && var28 < var0.field7007 && var29 >= 0 && var29 < var0.field7009) {
                        int var30 = var28 + var29 * var0.field7007;
                        int var31 = var0.field7005[var30];
                        if (var31 != 0) {
                           field7104[var22] = var31;
                        }
                     }
                  }

                  var22++;
                  var23 += var8;
                  var24 -= var7;
               }
            }

            var16 += var7;
            var17 += var8;
            var18 += field7102;
         }
      } catch (Exception var32) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("bb")
   static void method13446(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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
   @ObfuscatedName("dw")
   public void method13519(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         method13511(this, var1, var2);
      } else {
         var1 += this.field7010;
         var2 += this.field7011;
         int var5 = var1 + var2 * field7102;
         int var6 = 0;
         int var7 = this.field7009;
         int var8 = this.field7007;
         int var9 = field7102 - var8;
         int var10 = 0;
         if (var2 < field7096) {
            int var11 = field7096 - var2;
            var7 -= var11;
            var2 = field7096;
            var6 += var11 * var8;
            var5 += var11 * field7102;
         }

         if (var2 + var7 > field7098) {
            var7 -= var2 + var7 - field7098;
         }

         if (var1 < field7097) {
            int var14 = field7097 - var1;
            var8 -= var14;
            var1 = field7097;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > field7099) {
            int var15 = var1 + var8 - field7099;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            method13443(field7104, this.field7005, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("mq")
   public void method13562(int var1, int var2) {
      this.method13508(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIII)V")
   @ObfuscatedName("fh")
   public static void method13560(classYM var0, int var1, int var2, int var3, int var4) {
      if (var3 <= var0.field7006 && var4 <= var0.field7008) {
         int var5 = var1 + var0.field7010 * var3 / var0.field7006;
         int var6 = var1 + ((var0.field7010 + var0.field7007) * var3 + var0.field7006 - 1) / var0.field7006;
         int var7 = var2 + var0.field7011 * var4 / var0.field7008;
         int var8 = var2 + ((var0.field7011 + var0.field7009) * var4 + var0.field7008 - 1) / var0.field7008;
         if (var5 < field7097) {
            var5 = field7097;
         }

         if (var6 > field7099) {
            var6 = field7099;
         }

         if (var7 < field7096) {
            var7 = field7096;
         }

         if (var8 > field7098) {
            var8 = field7098;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * field7102 + var5;
            int var10 = field7102 - (var6 - var5);
            if (var9 < field7104.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * var0.field7006 / var3 - (var0.field7010 << 4);
                     int var16 = (var13 + 16) * var0.field7006 / var3 - (var0.field7010 << 4);
                     int var17 = var14 * var0.field7008 / var4 - (var0.field7011 << 4);
                     int var18 = (var14 + 16) * var0.field7008 / var4 - (var0.field7011 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= var0.field7007 << 4) {
                           var16 = var0.field7007 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= var0.field7009 << 4) {
                           var18 = var0.field7009 << 4;
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
                              int var31 = var0.field7005[var28 * var0.field7007 + var30];
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
                                 var25 += (var31 >> 8 & 332577320) * var32;
                                 var26 += (var31 & 0xFF) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var39 == 0) {
                              var39 = 1;
                           }

                           field7104[var9] = var39;
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("be")
   static void method13449(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 1401650942 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 555836401) * var9 + (var13 & 1577456752) * var10 & -1983843091)
                     + ((var2 & 0xFF00) * var9 + (var13 & 375045205) * var10 & 336251998)
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
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("by")
   static void method13450(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIII)V")
   @ObfuscatedName("bq")
   static void method13451(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIII)V")
   @ObfuscatedName("bf")
   static void method13453(
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
               var0[var5++] = ((var2 & -197288494) * var12 + (var18 & 16711935) * var13 & -16711936)
                     + ((var2 & 47755335) * var12 + (var18 & -104111506) * var13 & -2077041067)
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
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("bd")
   static void method13455(
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

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIII)V")
   @ObfuscatedName("bl")
   static void method13456(
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
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("bv")
   static void method13458(
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("bh")
   static void method13459(
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

   public void setOffsetX(int var1) {
      this.field7010 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;)V")
   @ObfuscatedName("hj")
   public static void method13478(classYM var0) {
      if (var0 == null) {
         var0.method13480();
      }

      method13662(var0.field7005, var0.field7007, var0.field7009, null);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;)Lym;")
   @ObfuscatedName("wa")
   public static classYM method13471(classYM var0) {
      classYM var1 = new classYM(var0.field7007, var0.field7009);
      var1.field7006 = var0.field7006;
      var1.field7008 = var0.field7008;
      var1.field7010 = var0.field7006 - var0.field7007 - var0.field7010;
      var1.field7011 = var0.field7011;

      for (int var2 = 0; var2 < var0.field7009; var2++) {
         for (int var3 = 0; var3 < var0.field7007; var3++) {
            var1.field7005[var2 * var0.field7007 + var3] = var0.field7005[var2 * var0.field7007 + var0.field7007 - 1 - var3];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;I)V")
   @ObfuscatedName("ir")
   public static void method13487(classYM var0, int var1) {
      if (var0.field7007 != var0.field7006 || var0.field7009 != var0.field7008) {
         int var2 = var1;
         if (var1 > var0.field7010) {
            var2 = var0.field7010;
         }

         int var3 = var1;
         if (var1 + var0.field7010 + var0.field7007 > var0.field7006) {
            var3 = var0.field7006 - var0.field7010 - var0.field7007;
         }

         int var4 = var1;
         if (var1 > var0.field7011) {
            var4 = var0.field7011;
         }

         int var5 = var1;
         if (var1 + var0.field7011 + var0.field7009 > var0.field7008) {
            var5 = var0.field7008 - var0.field7011 - var0.field7009;
         }

         int var6 = var0.field7007 + var2 + var3;
         int var7 = var0.field7009 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < var0.field7009; var9++) {
            for (int var10 = 0; var10 < var0.field7007; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = var0.field7005[var9 * var0.field7007 + var10];
            }
         }

         var0.field7005 = var8;
         var0.field7007 = var6;
         var0.field7009 = var7;
         var0.field7010 -= var2;
         var0.field7011 -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("cr")
   public classYM method13563() {
      return this.method13473();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("bz")
   static void method13460(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      for (int var22 = -var10; var22 < 0; var22++) {
         for (int var21 = -var9; var21 < 0; var21++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & -576914856) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 1931507974) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & -1005435227) + (var1 & 16711935);
               var1 = (var0 & 2123435664) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method13493() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field7009; var3++) {
         for (int var4 = this.field7007 - 1; var4 >= 0; var4--) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7010 = this.field7006 - this.field7007 - this.field7010;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;)V")
   @ObfuscatedName("hx")
   public static void method13483(classYM var0) {
      if (var0 == null) {
         var0.method13481();
      }

      if (var0.field7007 != var0.field7006 || var0.field7009 != var0.field7008) {
         int[] var1 = new int[var0.field7006 * var0.field7008];

         for (int var2 = 0; var2 < var0.field7009; var2++) {
            for (int var3 = 0; var3 < var0.field7007; var3++) {
               var1[(var2 + var0.field7011) * var0.field7006 + var3 + var0.field7010] = var0.field7005[var2 * var0.field7007 + var3];
            }
         }

         var0.field7005 = var1;
         var0.field7007 = var0.field7006;
         var0.field7009 = var0.field7008;
         var0.field7010 = 0;
         var0.field7011 = 0;
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
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("cu")
   static void method13465(
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

   classYM() {
   }

   public int[] getPixels() {
      return this.field7005;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cn")
   public void method13500(int var1) {
      int[] var2 = new int[this.field7007 * this.field7009];
      int var3 = 0;

      for (int var4 = 0; var4 < this.field7009; var4++) {
         for (int var5 = 0; var5 < this.field7007; var5++) {
            int var6 = this.field7005[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field7005[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field7005[var3 - this.field7007] != 0) {
                  var6 = var1;
               } else if (var5 < this.field7007 - 1 && this.field7005[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field7009 - 1 && this.field7005[var3 + this.field7007] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field7005 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("cq")
   public classYM method13472() {
      classYM var1 = new classYM(this.field7007, this.field7009);
      var1.field7006 = this.field7006;
      var1.field7008 = this.field7008;
      var1.field7010 = this.field7006 - this.field7007 - this.field7010;
      var1.field7011 = this.field7011;

      for (int var2 = 0; var2 < this.field7009; var2++) {
         for (int var3 = 0; var3 < this.field7007; var3++) {
            var1.field7005[var2 * this.field7007 + var3] = this.field7005[var2 * this.field7007 + this.field7007 - 1 - var3];
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("cd")
   public classYM method13474() {
      classYM var1 = new classYM(this.field7007, this.field7009);
      var1.field7006 = this.field7006;
      var1.field7008 = this.field7008;
      var1.field7010 = this.field7010;
      var1.field7011 = this.field7011;
      int var2 = this.field7005.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.field7005[var3] = this.field7005[var3];
      }

      return var1;
   }

   public int getOffsetX() {
      return this.field7010;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("cv")
   public classYM method13475() {
      classYM var1 = new classYM(this.field7007, this.field7009);
      var1.field7006 = this.field7006;
      var1.field7008 = this.field7008;
      var1.field7010 = this.field7010;
      var1.field7011 = this.field7011;
      int var2 = this.field7005.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.field7005[var3] = this.field7005[var3];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fv")
   public void method13479() {
      method13662(this.field7005, this.field7007, this.field7009, null);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method13484() {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int[] var1 = new int[this.field7006 * this.field7008];

         for (int var2 = 0; var2 < this.field7009; var2++) {
            for (int var3 = 0; var3 < this.field7007; var3++) {
               var1[(var2 + this.field7011) * this.field7006 + var3 + this.field7010] = this.field7005[var2 * this.field7007 + var3];
            }
         }

         this.field7005 = var1;
         this.field7007 = this.field7006;
         this.field7009 = this.field7008;
         this.field7010 = 0;
         this.field7011 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public void method13488(int var1) {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int var2 = var1;
         if (var1 > this.field7010) {
            var2 = this.field7010;
         }

         int var3 = var1;
         if (var1 + this.field7010 + this.field7007 > this.field7006) {
            var3 = this.field7006 - this.field7010 - this.field7007;
         }

         int var4 = var1;
         if (var1 > this.field7011) {
            var4 = this.field7011;
         }

         int var5 = var1;
         if (var1 + this.field7011 + this.field7009 > this.field7008) {
            var5 = this.field7008 - this.field7011 - this.field7009;
         }

         int var6 = this.field7007 + var2 + var3;
         int var7 = this.field7009 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.field7009; var9++) {
            for (int var10 = 0; var10 < this.field7007; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field7005[var9 * this.field7007 + var10];
            }
         }

         this.field7005 = var8;
         this.field7007 = var6;
         this.field7009 = var7;
         this.field7010 -= var2;
         this.field7011 -= var4;
      }
   }

   public int getHeight() {
      return this.field7009;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cc")
   public void method13489(int var1) {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int var2 = var1;
         if (var1 > this.field7010) {
            var2 = this.field7010;
         }

         int var3 = var1;
         if (var1 + this.field7010 + this.field7007 > this.field7006) {
            var3 = this.field7006 - this.field7010 - this.field7007;
         }

         int var4 = var1;
         if (var1 > this.field7011) {
            var4 = this.field7011;
         }

         int var5 = var1;
         if (var1 + this.field7011 + this.field7009 > this.field7008) {
            var5 = this.field7008 - this.field7011 - this.field7009;
         }

         int var6 = this.field7007 + var2 + var3;
         int var7 = this.field7009 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.field7009; var9++) {
            for (int var10 = 0; var10 < this.field7007; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field7005[var9 * this.field7007 + var10];
            }
         }

         this.field7005 = var8;
         this.field7007 = var6;
         this.field7009 = var7;
         this.field7010 -= var2;
         this.field7011 -= var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIII)V")
   @ObfuscatedName("bi")
   static void method13447(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method13496() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = this.field7009 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.field7007; var4++) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7011 = this.field7008 - this.field7009 - this.field7011;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dy")
   public void method13501(int var1) {
      int[] var2 = new int[this.field7007 * this.field7009];
      int var3 = 0;

      for (int var4 = 0; var4 < this.field7009; var4++) {
         for (int var5 = 0; var5 < this.field7007; var5++) {
            int var6 = this.field7005[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field7005[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field7005[var3 - this.field7007] != 0) {
                  var6 = var1;
               } else if (var5 < this.field7007 - 1 && this.field7005[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field7009 - 1 && this.field7005[var3 + this.field7007] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field7005 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   public void method13497() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = this.field7009 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.field7007; var4++) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7011 = this.field7008 - this.field7009 - this.field7011;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIIII[I[I)V")
   @ObfuscatedName("ju")
   public static void method13535(classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      if (var0 == null) {
         var0.method13519(var1, var1, var1, var1);
      } else {
         int var9 = var2 < 0 ? -var2 : 0;
         int var10 = var2 + var0.field7009 <= var6 ? var0.field7009 : var6 - var2;
         int var11 = var1 < 0 ? -var1 : 0;
         if (var1 + var0.field7007 > var5) {
            int var10000 = var5 - var1;
         }

         int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field7102;
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
            if (var1 + var0.field7007 <= var16 + var17) {
               var12 = var0.field7007;
            } else {
               var12 = var16 + var17 - var1;
            }

            for (int var20 = var19; var20 < var12; var20++) {
               int var21 = var0.field7005[var20 + var15 * var0.field7007];
               if (var21 != 0) {
                  field7104[var18++] = var21;
               } else {
                  var18++;
               }
            }

            var13 += field7102;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("iq")
   void method13557(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field7010 << 4;
         var2 -= this.field7011 << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field7007 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field7007 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field7009 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field7009 << 4) - var2) * var10;
         int var17 = ((this.field7007 << 4) - var1) * var10 + ((this.field7009 << 4) - var2) * var9;
         int var18 = -((this.field7007 << 4) - var1) * var9 + ((this.field7009 << 4) - var2) * var10;
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
         if (var19 < field7097) {
            var19 = field7097;
         }

         if (var20 > field7099) {
            var20 = field7099;
         }

         if (var21 < field7096) {
            var21 = field7096;
         }

         if (var22 > field7098) {
            var22 = field7098;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * field7102 + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += field7102) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field7007 << 12) < 0 && var31 - (this.field7009 << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.field7005[(var36 >> 12) * this.field7007 + (var35 >> 12)];
                              if (var38 != 0) {
                                 field7104[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += field7102) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.field7009 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.field7005[(var108 >> 12) * this.field7007 + (var100 >> 12)];
                              if (var124 != 0) {
                                 field7104[var92++] = var124;
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
                     for (int var85 = var22; var85 < 0; var23 += field7102) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.field7007 << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.field7009 << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.field7005[(var109 >> 12) * this.field7007 + (var101 >> 12)];
                              if (var125 != 0) {
                                 field7104[var93++] = var125;
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
                     for (int var86 = var22; var86 < 0; var23 += field7102) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.field7007 << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.field7005[(var110 >> 12) * this.field7007 + (var102 >> 12)];
                              if (var126 != 0) {
                                 field7104[var94++] = var126;
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
                     for (int var87 = var22; var87 < 0; var23 += field7102) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.field7007 << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.field7009 << 12)) >= 0) {
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
                           int var127 = this.field7005[(var111 >> 12) * this.field7007 + (var103 >> 12)];
                           if (var127 != 0) {
                              field7104[var95++] = var127;
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
                     for (int var88 = var22; var88 < 0; var23 += field7102) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.field7007 << 12)) >= 0) {
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

                        if ((var68 = (1 + var112 - (this.field7009 << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.field7005[(var112 >> 12) * this.field7007 + (var104 >> 12)];
                           if (var128 != 0) {
                              field7104[var96++] = var128;
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
                  for (int var89 = var22; var89 < 0; var23 += field7102) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.field7007 << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.field7005[(var113 >> 12) * this.field7007 + (var105 >> 12)];
                           if (var129 != 0) {
                              field7104[var97++] = var129;
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
                  for (int var90 = var22; var90 < 0; var23 += field7102) {
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
                     if ((var76 = (1 + var106 - (this.field7007 << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.field7009 << 12)) >= 0) {
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
                        int var130 = this.field7005[(var114 >> 12) * this.field7007 + (var106 >> 12)];
                        if (var130 != 0) {
                           field7104[var98++] = var130;
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
                  for (int var91 = var22; var91 < 0; var23 += field7102) {
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
                     if ((var81 = (1 + var107 - (this.field7007 << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.field7009 << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.field7005[(var115 >> 12) * this.field7007 + (var107 >> 12)];
                        if (var131 != 0) {
                           field7104[var99++] = var131;
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)I")
   @ObfuscatedName("qy")
   public static int method13467(classOI var0) {
      return var0 == null ? var0.method8505() : 2092474365 * var0.field4889;
   }

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("ac")
   static void method13461(
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

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   public void method13502(int var1) {
      int[] var2 = new int[this.field7007 * this.field7009];
      int var3 = 0;

      for (int var4 = 0; var4 < this.field7009; var4++) {
         for (int var5 = 0; var5 < this.field7007; var5++) {
            int var6 = this.field7005[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field7005[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field7005[var3 - this.field7007] != 0) {
                  var6 = var1;
               } else if (var5 < this.field7007 - 1 && this.field7005[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field7009 - 1 && this.field7005[var3 + this.field7007] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field7005 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ce")
   public void method13504(int var1) {
      for (int var2 = this.field7009 - 1; var2 > 0; var2--) {
         int var3 = var2 * this.field7007;

         for (int var4 = this.field7007 - 1; var4 > 0; var4--) {
            if (this.field7005[var4 + var3] == 0 && this.field7005[var4 + var3 - 1 - this.field7007] != 0) {
               this.field7005[var4 + var3] = var1;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIIIIDI)V")
   @ObfuscatedName("id")
   public static void method13550(classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      if (var0 == null) {
         var0.setMaxHeight(var1);
      } else {
         try {
            if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
               if (field7102 % 2 != 0) {
                  var5++;
               }

               if (field7101 % 2 != 0) {
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
            int var16 = var1 + var2 * field7102;

            for (int var26 = 0; var26 < var4; var26++) {
               int var17 = var16;
               int var18 = var14;
               int var19 = var15;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var20 = var18 >> 16;
                  int var21 = var19 >> 16;
                  if (var20 >= 0 && var20 < var0.field7007 && var21 >= 0 && var21 < var0.field7009) {
                     int var22 = var20 + var21 * var0.field7007;
                     if (var22 >= 0 && var22 < var0.field7005.length) {
                        int var23 = var0.field7005[var22];
                        if (var23 != 0) {
                           field7104[var17] = var23;
                        }
                     }
                  }

                  var17++;
                  var18 += var13;
                  var19 -= var12;
               }

               var14 += var12;
               var15 += var13;
               var16 += field7102;
            }
         } catch (Exception var24) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dd")
   public void method13505(int var1) {
      for (int var2 = this.field7009 - 1; var2 > 0; var2--) {
         int var3 = var2 * this.field7007;

         for (int var4 = this.field7007 - 1; var4 > 0; var4--) {
            if (this.field7005[var4 + var3] == 0 && this.field7005[var4 + var3 - 1 - this.field7007] != 0) {
               this.field7005[var4 + var3] = var1;
            }
         }
      }
   }

   public void setMaxWidth(int var1) {
      this.field7006 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cx")
   public void method13506(int var1) {
      for (int var2 = this.field7009 - 1; var2 > 0; var2--) {
         int var3 = var2 * this.field7007;

         for (int var4 = this.field7007 - 1; var4 > 0; var4--) {
            if (this.field7005[var4 + var3] == 0 && this.field7005[var4 + var3 - 1 - this.field7007] != 0) {
               this.field7005[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("di")
   public void method13509(int var1, int var2) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7009;
      int var6 = this.field7007;
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
         method13437(field7104, this.field7005, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("du")
   public void method13510(int var1, int var2) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7009;
      int var6 = this.field7007;
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
         method13437(field7104, this.field7005, var4, var3, var6, var5, var7, var8);
      }
   }

   public int getMaxHeight() {
      return this.field7008;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dt")
   public void method13512(int var1, int var2) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7009;
      int var6 = this.field7007;
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
         method13438(field7104, this.field7005, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIIIIIIII[I[I)V")
   @ObfuscatedName("dq")
   public static void method13545(
      classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12
   ) {
      if (var0 == null) {
         var0.method13484();
      } else {
         int var13 = classBF.method997(var7, (byte)-89);
         int var15 = classLL.method7119(var7, 1222866659);
         var0.method13541(var1, var2, var3, var4, var5, var6, var13, var15, var8, var9, var10, var11, var12);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dr")
   public void method13513(int var1, int var2) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7009;
      int var6 = this.field7007;
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
         method13438(field7104, this.field7005, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   public void setOffsetY(int var1) {
      this.field7011 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dk")
   public void method13515(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field7007;
         int var6 = this.field7009;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field7006;
         int var10 = this.field7008;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (this.field7010 > 0) {
            int var13 = ((this.field7010 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var16 = ((this.field7011 << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (this.field7011 << 16);
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

         method13442(field7104, this.field7005, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("db")
   public void method13516(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field7007;
         int var6 = this.field7009;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field7006;
         int var10 = this.field7008;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (this.field7010 > 0) {
            int var13 = ((this.field7010 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var16 = ((this.field7011 << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (this.field7011 << 16);
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

         method13442(field7104, this.field7005, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII[I[I)V")
   @ObfuscatedName("bp")
   void method13543(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int[] var12, int[] var13) {
      try {
         int var14 = -var3 / 2;
         int var15 = -var4 / 2;
         var7 = (int)(((long)var7 << 8) / var9);
         var8 = (int)(((long)var8 << 8) / var9);
         int var16 = (var5 << 16) + var15 * var7 + var14 * var8;
         int var17 = (var6 << 16) + (var15 * var8 - var14 * var7);
         int var18 = var1 + var2 * field7102;

         for (int var19 = 0; var19 < var4; var19++) {
            int var20 = var2 + var19;
            int var21 = var20 - var11;
            if (var21 >= 0 && var21 < var12.length && var12[var21] >= 0) {
               int var22 = var18;
               int var23 = var16;
               int var24 = var17;

               for (int var25 = -var3; var25 < 0; var25++) {
                  int var26 = var1 + var3 + var25;
                  int var27 = var26 - var10;
                  if (var27 >= var12[var21] && var27 < var12[var21] + var13[var21]) {
                     int var28 = var23 >> 16;
                     int var29 = var24 >> 16;
                     if (var28 >= 0 && var28 < this.field7007 && var29 >= 0 && var29 < this.field7009) {
                        int var30 = var28 + var29 * this.field7007;
                        int var31 = this.field7005[var30];
                        if (var31 != 0) {
                           field7104[var22] = var31;
                        }
                     }
                  }

                  var22++;
                  var23 += var8;
                  var24 -= var7;
               }
            }

            var16 += var7;
            var17 += var8;
            var18 += field7102;
         }
      } catch (Exception var32) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hc")
   public void method13525(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         method13452(field7104, this.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hb")
   public void method13526(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         method13452(field7104, this.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hn")
   public void method13527(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         method13452(field7104, this.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hs")
   public void method13528(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         method13452(field7104, this.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("am")
   public void method13530(int var1, int var2, int var3) {
      var1 += this.field7010;
      var2 += this.field7011;
      int var4 = var1 + var2 * field7102;
      int var5 = 0;
      int var6 = this.field7009;
      int var7 = this.field7007;
      int var8 = field7102 - var7;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var6 -= var10;
         var2 = field7096;
         var5 += var10 * var7;
         var4 += var10 * field7102;
      }

      if (var2 + var6 > field7098) {
         var6 -= var2 + var6 - field7098;
      }

      if (var1 < field7097) {
         int var13 = field7097 - var1;
         var7 -= var13;
         var1 = field7097;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > field7099) {
         int var14 = var1 + var7 - field7099;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method13454(0, 0, 0, field7104, this.field7005, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method13461(0, 0, 0, field7104, this.field7005, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("if")
   public void method13551(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (field7102 % 2 != 0) {
               var5++;
            }

            if (field7101 % 2 != 0) {
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
         int var16 = var1 + var2 * field7102;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.field7007 && var21 >= 0 && var21 < this.field7009) {
                  int var22 = var20 + var21 * this.field7007;
                  if (var22 >= 0 && var22 < this.field7005.length) {
                     int var23 = this.field7005[var22];
                     if (var23 != 0) {
                        field7104[var17] = var23;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field7102;
         }
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("is")
   public void method13536(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field7009 <= var6 ? this.field7009 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.field7007 > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field7102;
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
         if (var1 + this.field7007 <= var16 + var17) {
            var12 = this.field7007;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.field7005[var20 + var15 * this.field7007];
            if (var21 != 0) {
               field7104[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII[I[IIIIIIIIIII)V")
   @ObfuscatedName("cb")
   static void method13466(
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
               var0 = (var0 & 965232770) + (var1 & -463589909);
               var1 = (var0 & 16777472) + (var2 - var0 & -594205881);
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

   public void setMaxHeight(int var1) {
      this.field7008 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("at")
   public void method13517(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field7007;
         int var6 = this.field7009;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field7006;
         int var10 = this.field7008;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (this.field7010 > 0) {
            int var13 = ((this.field7010 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var16 = ((this.field7011 << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (this.field7011 << 16);
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

         method13442(field7104, this.field7005, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bt")
   public void method13553(int var1, int var2, int var3, int var4) {
      this.method13556(this.field7006 << 3, this.field7008 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ib")
   public void method13533(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field7007;
         int var7 = this.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field7006;
         int var11 = this.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (this.field7010 > 0) {
            int var14 = ((this.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field7010 << 16);
         }

         if (this.field7011 > 0) {
            int var17 = ((this.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (this.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * field7102;
         int var15 = field7102 - var3;
         if (var2 + var4 > field7098) {
            var4 -= var2 + var4 - field7098;
         }

         if (var2 < field7096) {
            int var16 = field7096 - var2;
            var4 -= var16;
            var18 += var16 * field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > field7099) {
            int var19 = var1 + var3 - field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < field7097) {
            int var20 = field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         if (var5 == 256) {
            method13463(0, 0, 0, var8, this.field7005, field7104, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
         } else {
            method13468(0, 0, 0, var8, this.field7005, field7104, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method13494() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field7009; var3++) {
         for (int var4 = this.field7007 - 1; var4 >= 0; var4--) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7010 = this.field7006 - this.field7007 - this.field7010;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;I)V")
   @ObfuscatedName("yf")
   public static void method13507(classYM var0, int var1) {
      for (int var2 = var0.field7009 - 1; var2 > 0; var2--) {
         int var3 = var2 * var0.field7007;

         for (int var4 = var0.field7007 - 1; var4 > 0; var4--) {
            if (var0.field7005[var4 + var3] == 0 && var0.field7005[var4 + var3 - 1 - var0.field7007] != 0) {
               var0.field7005[var4 + var3] = var1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dc")
   public void method13503(int var1) {
      int[] var2 = new int[this.field7007 * this.field7009];
      int var3 = 0;

      for (int var4 = 0; var4 < this.field7009; var4++) {
         for (int var5 = 0; var5 < this.field7007; var5++) {
            int var6 = this.field7005[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field7005[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field7005[var3 - this.field7007] != 0) {
                  var6 = var1;
               } else if (var5 < this.field7007 - 1 && this.field7005[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field7009 - 1 && this.field7005[var3 + this.field7007] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field7005 = var2;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("br")
   public void method13546(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      int var13 = classBF.method997(var7, (byte)-8);
      int var15 = classLL.method7119(var7, 1222866659);
      this.method13541(var1, var2, var3, var4, var5, var6, var13, var15, var8, var9, var10, var11, var12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIIII[I[I)V")
   @ObfuscatedName("jc")
   public static void method13537(classYM var0, int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      if (var0 == null) {
         var0.method13536(var1, var1, var1, var1, var1, var1, var7, var7);
      }

      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + var0.field7009 <= var6 ? var0.field7009 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + var0.field7007 > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field7102;
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
         if (var1 + var0.field7007 <= var16 + var17) {
            var12 = var0.field7007;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = var0.field7005[var20 + var15 * var0.field7007];
            if (var21 != 0) {
               field7104[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ic")
   public void method13561(int var1, int var2, int var3, int var4) {
      if (var3 <= this.field7006 && var4 <= this.field7008) {
         int var5 = var1 + this.field7010 * var3 / this.field7006;
         int var6 = var1 + ((this.field7010 + this.field7007) * var3 + this.field7006 - 1) / this.field7006;
         int var7 = var2 + this.field7011 * var4 / this.field7008;
         int var8 = var2 + ((this.field7011 + this.field7009) * var4 + this.field7008 - 1) / this.field7008;
         if (var5 < field7097) {
            var5 = field7097;
         }

         if (var6 > field7099) {
            var6 = field7099;
         }

         if (var7 < field7096) {
            var7 = field7096;
         }

         if (var8 > field7098) {
            var8 = field7098;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * field7102 + var5;
            int var10 = field7102 - (var6 - var5);
            if (var9 < field7104.length) {
               for (int var11 = var7; var11 < var8; var11++) {
                  for (int var12 = var5; var12 < var6; var12++) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field7006 / var3 - (this.field7010 << 4);
                     int var16 = (var13 + 16) * this.field7006 / var3 - (this.field7010 << 4);
                     int var17 = var14 * this.field7008 / var4 - (this.field7011 << 4);
                     int var18 = (var14 + 16) * this.field7008 / var4 - (this.field7011 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.field7007 << 4) {
                           var16 = this.field7007 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.field7009 << 4) {
                           var18 = this.field7009 << 4;
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
                              int var31 = this.field7005[var28 * this.field7007 + var30];
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

                           field7104[var9] = var39;
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

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("im")
   public void method13554(int var1, int var2, int var3, int var4) {
      this.method13556(this.field7006 << 3, this.field7008 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("io")
   public void method13552(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
            if (field7102 % 2 != 0) {
               var5++;
            }

            if (field7101 % 2 != 0) {
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
         int var16 = var1 + var2 * field7102;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = var18 >> 16;
               int var21 = var19 >> 16;
               if (var20 >= 0 && var20 < this.field7007 && var21 >= 0 && var21 < this.field7009) {
                  int var22 = var20 + var21 * this.field7007;
                  if (var22 >= 0 && var22 < this.field7005.length) {
                     int var23 = this.field7005[var22];
                     if (var23 != 0) {
                        field7104[var17] = var23;
                     }
                  }
               }

               var17++;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field7102;
         }
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   public void method13485() {
      if (this.field7007 != this.field7006 || this.field7009 != this.field7008) {
         int[] var1 = new int[this.field7006 * this.field7008];

         for (int var2 = 0; var2 < this.field7009; var2++) {
            for (int var3 = 0; var3 < this.field7007; var3++) {
               var1[(var2 + this.field7011) * this.field7006 + var3 + this.field7010] = this.field7005[var2 * this.field7007 + var3];
            }
         }

         this.field7005 = var1;
         this.field7007 = this.field7006;
         this.field7009 = this.field7008;
         this.field7010 = 0;
         this.field7011 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method13498() {
      int[] var1 = new int[this.field7007 * this.field7009];
      int var2 = 0;

      for (int var3 = this.field7009 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.field7007; var4++) {
            var1[var2++] = this.field7005[var4 + var3 * this.field7007];
         }
      }

      this.field7005 = var1;
      this.field7011 = this.field7008 - this.field7009 - this.field7011;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ca")
   public void method13564() {
      this.method13477();
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[I[I)V")
   @ObfuscatedName("ih")
   public void method13538(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field7009 <= var6 ? this.field7009 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (var1 + this.field7007 > var5) {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field7102;
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
         if (var1 + this.field7007 <= var16 + var17) {
            var12 = this.field7007;
         } else {
            var12 = var16 + var17 - var1;
         }

         for (int var20 = var19; var20 < var12; var20++) {
            int var21 = this.field7005[var20 + var15 * this.field7007];
            if (var21 != 0) {
               field7104[var18++] = var21;
            } else {
               var18++;
            }
         }

         var13 += field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("tk")
   public classYM method13565() {
      return this.method13470();
   }

   public BufferedImage toBufferedOutline(Color var1) {
      BufferedImage var2 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedOutline(var2, var1.getRGB());
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dh")
   public void method13520(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         method13511(this, var1, var2);
      } else {
         var1 += this.field7010;
         var2 += this.field7011;
         int var5 = var1 + var2 * field7102;
         int var6 = 0;
         int var7 = this.field7009;
         int var8 = this.field7007;
         int var9 = field7102 - var8;
         int var10 = 0;
         if (var2 < field7096) {
            int var11 = field7096 - var2;
            var7 -= var11;
            var2 = field7096;
            var6 += var11 * var8;
            var5 += var11 * field7102;
         }

         if (var2 + var7 > field7098) {
            var7 -= var2 + var7 - field7098;
         }

         if (var1 < field7097) {
            int var14 = field7097 - var1;
            var8 -= var14;
            var1 = field7097;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > field7099) {
            int var15 = var1 + var8 - field7099;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            method13443(field7104, this.field7005, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III[I[IIIIIIIIII)V")
   @ObfuscatedName("cr")
   static void method13462(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      for (int var22 = -var10; var22 < 0; var22++) {
         for (int var21 = -var9; var21 < 0; var21++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & 50860237) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & -648373471) + (var1 & 301699931);
               var1 = (var0 & 16777472) + (var2 - var0 & 906368615);
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
   @ObfuscatedName("bs")
   static void method13457(
      int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      for (int var19 = -var10; var19 < 0; var19++) {
         for (int var18 = -var9; var18 < 0; var18++) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 482198291) + (var1 & 16711935);
               var1 = (var0 & 1689184896) + (var2 - var0 & 149516809);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               var7++;
            }
         }

         var7 += var11;
         var5 += var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bn")
   public void method13521(int var1, int var2, int var3) {
      var1 += this.field7006;
      var2 += this.field7011;
      int var4 = var1 + var2 * classYW.field7101;
      int var5 = 0;
      int var6 = this.field7009;
      int var7 = this.field7006;
      int var8 = classYW.field7097 - var7;
      int var9 = 0;
      if (var2 < classYW.field7101) {
         int var10 = field7096 - var2;
         var6 -= var10;
         var2 = classYW.field7097;
         var5 += var10 * var7;
         var4 += var10 * classYW.field7096;
      }

      if (var2 + var6 > classYW.field7102) {
         var6 -= var2 + var6 - classYW.field7102;
      }

      if (var1 < field7097) {
         int var13 = classYW.field7101 - var1;
         var7 -= var13;
         var1 = classYW.field7101;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > classYW.field7098) {
         int var14 = var1 + var7 - classYW.field7098;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         method13451(field7104, this.field7005, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public BufferedImage toBufferedImage() {
      BufferedImage var1 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedImage(var1);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("jp")
   public void method13547(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      int var13 = classBF.method997(var7, (byte)-44);
      int var15 = classLL.method7119(var7, 1222866659);
      this.method13539(var1, var2, var3, var4, var5, var6, var13, var15, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("av")
   public void method13514(int var1, int var2) {
      var1 += this.field7009;
      var2 += this.field7011;
      int var3 = var1 + var2 * field7102;
      int var4 = 0;
      int var5 = this.field7006;
      int var6 = this.field7010;
      int var7 = classYW.field7097 - var6;
      int var8 = 0;
      if (var2 < classYW.field7101) {
         int var9 = field7096 - var2;
         var5 -= var9;
         var2 = classYW.field7097;
         var4 += var9 * var6;
         var3 += var9 * classYW.field7099;
      }

      if (var2 + var5 > classYW.field7096) {
         var5 -= var2 + var5 - field7098;
      }

      if (var1 < field7097) {
         int var12 = classYW.field7096 - var1;
         var6 -= var12;
         var1 = field7097;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > classYW.field7096) {
         int var13 = var1 + var6 - classYW.field7097;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         method13438(field7104, this.field7005, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ir")
   public void method13531(int var1, int var2, int var3) {
      var1 += this.field7008;
      var2 += this.field7011;
      int var4 = var1 + var2 * classYW.field7101;
      int var5 = 0;
      int var6 = this.field7007;
      int var7 = this.field7006;
      int var8 = classYW.field7097 - var7;
      int var9 = 0;
      if (var2 < classYW.field7102) {
         int var10 = classYW.field7099 - var2;
         var6 -= var10;
         var2 = classYW.field7101;
         var5 += var10 * var7;
         var4 += var10 * classYW.field7099;
      }

      if (var2 + var6 > classYW.field7102) {
         var6 -= var2 + var6 - classYW.field7102;
      }

      if (var1 < classYW.field7096) {
         int var13 = classYW.field7102 - var1;
         var7 -= var13;
         var1 = classYW.field7099;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > field7099) {
         int var14 = var1 + var7 - classYW.field7102;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method13456(0, 0, 0, field7104, this.field7005, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method13462(0, 0, 0, field7104, this.field7005, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII[I[I)V")
   @ObfuscatedName("iz")
   public void method13566(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      method13544(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIDI)V")
   @ObfuscatedName("wy")
   public void method13567(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      this.method13548(var1, var2, var3, var4, var5, var6, var7, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;III)V")
   @ObfuscatedName("ue")
   public static void method13522(classYM var0, int var1, int var2, int var3) {
      var1 += var0.field7010;
      var2 += var0.field7011;
      int var4 = var1 + var2 * field7102;
      int var5 = 0;
      int var6 = var0.field7009;
      int var7 = var0.field7007;
      int var8 = field7102 - var7;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var6 -= var10;
         var2 = field7096;
         var5 += var10 * var7;
         var4 += var10 * field7102;
      }

      if (var2 + var6 > field7098) {
         var6 -= var2 + var6 - field7098;
      }

      if (var1 < field7097) {
         int var13 = field7097 - var1;
         var7 -= var13;
         var1 = field7097;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > field7099) {
         int var14 = var1 + var7 - field7099;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         method13448(field7104, var0.field7005, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;III)V")
   @ObfuscatedName("id")
   public static void method13523(classYM var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13521(var1, var1, var1);
      } else {
         var1 += var0.field7010;
         var2 += var0.field7011;
         int var4 = var1 + var2 * field7102;
         int var5 = 0;
         int var6 = var0.field7009;
         int var7 = var0.field7007;
         int var8 = field7102 - var7;
         int var9 = 0;
         if (var2 < field7096) {
            int var10 = field7096 - var2;
            var6 -= var10;
            var2 = field7096;
            var5 += var10 * var7;
            var4 += var10 * field7102;
         }

         if (var2 + var6 > field7098) {
            var6 -= var2 + var6 - field7098;
         }

         if (var1 < field7097) {
            int var13 = field7097 - var1;
            var7 -= var13;
            var1 = field7097;
            var5 += var13;
            var4 += var13;
            var9 += var13;
            var8 += var13;
         }

         if (var1 + var7 > field7099) {
            int var14 = var1 + var7 - field7099;
            var7 -= var14;
            var9 += var14;
            var8 += var14;
         }

         if (var7 > 0 && var6 > 0) {
            method13448(field7104, var0.field7005, 0, var5, var4, var7, var6, var8, var9, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method13480() {
      classYW.method13665(this.field7005, this.field7008, this.field7010, null);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   public void method13481() {
      classYW.method13664(this.field7005, this.field7007, this.field7009, null);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cm")
   public void method13490(int var1) {
      if (this.field7008 != this.field7008 || this.field7010 != this.field7008) {
         int var2 = var1;
         if (var1 > this.field7007) {
            var2 = this.field7009;
         }

         int var3 = var1;
         if (var1 + this.field7007 + this.field7008 > this.field7007) {
            var3 = this.field7007 - this.field7008 - this.field7006;
         }

         int var4 = var1;
         if (var1 > this.field7011) {
            var4 = this.field7011;
         }

         int var5 = var1;
         if (var1 + this.field7011 + this.field7008 > this.field7009) {
            var5 = this.field7007 - this.field7011 - this.field7007;
         }

         int var6 = this.field7007 + var2 + var3;
         int var7 = this.field7007 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < this.field7007; var9++) {
            for (int var10 = 0; var10 < this.field7010; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field7005[var9 * this.field7006 + var10];
            }
         }

         this.field7005 = var8;
         this.field7010 = var6;
         this.field7008 = var7;
         this.field7009 -= var2;
         this.field7011 -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("iu")
   void method13558(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field7009 << 4;
         var2 -= this.field7011 << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field7007 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field7006 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field7007 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field7010 << 4) - var2) * var10;
         int var17 = ((this.field7008 << 4) - var1) * var10 + ((this.field7009 << 4) - var2) * var9;
         int var18 = -((this.field7006 << 4) - var1) * var9 + ((this.field7010 << 4) - var2) * var10;
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
         if (var19 < classYW.field7098) {
            var19 = field7097;
         }

         if (var20 > classYW.field7098) {
            var20 = classYW.field7097;
         }

         if (var21 < classYW.field7097) {
            var21 = classYW.field7099;
         }

         if (var22 > field7098) {
            var22 = classYW.field7096;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * field7102 + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += classYW.field7099) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field7007 << 12) < 0 && var31 - (this.field7007 << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = this.field7005[(var36 >> 12) * this.field7007 + (var35 >> 12)];
                              if (var38 != 0) {
                                 field7104[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += classYW.field7098) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (this.field7006 << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (this.field7010 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = this.field7005[(var108 >> 12) * this.field7010 + (var100 >> 12)];
                              if (var124 != 0) {
                                 field7104[var92++] = var124;
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
                     for (int var85 = var22; var85 < 0; var23 += classYW.field7101) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (this.field7008 << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (this.field7010 << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = this.field7005[(var109 >> 12) * this.field7008 + (var101 >> 12)];
                              if (var125 != 0) {
                                 field7104[var93++] = var125;
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
                     for (int var86 = var22; var86 < 0; var23 += classYW.field7096) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (this.field7009 << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (this.field7007 << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = this.field7005[(var110 >> 12) * this.field7010 + (var102 >> 12)];
                              if (var126 != 0) {
                                 field7104[var94++] = var126;
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
                     for (int var87 = var22; var87 < 0; var23 += field7102) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (this.field7010 << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (this.field7009 << 12)) >= 0) {
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
                           int var127 = this.field7005[(var111 >> 12) * this.field7007 + (var103 >> 12)];
                           if (var127 != 0) {
                              field7104[var95++] = var127;
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
                     for (int var88 = var22; var88 < 0; var23 += classYW.field7097) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (this.field7008 << 12)) >= 0) {
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

                        if ((var68 = (1 + var112 - (this.field7006 << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = this.field7005[(var112 >> 12) * this.field7010 + (var104 >> 12)];
                           if (var128 != 0) {
                              field7104[var96++] = var128;
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
                  for (int var89 = var22; var89 < 0; var23 += classYW.field7097) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (this.field7008 << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (this.field7010 << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = this.field7005[(var113 >> 12) * this.field7010 + (var105 >> 12)];
                           if (var129 != 0) {
                              field7104[var97++] = var129;
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
                  for (int var90 = var22; var90 < 0; var23 += classYW.field7098) {
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
                     if ((var76 = (1 + var106 - (this.field7008 << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (this.field7006 << 12)) >= 0) {
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
                        int var130 = this.field7005[(var114 >> 12) * this.field7006 + (var106 >> 12)];
                        if (var130 != 0) {
                           field7104[var98++] = var130;
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
                  for (int var91 = var22; var91 < 0; var23 += classYW.field7098) {
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
                     if ((var81 = (1 + var107 - (this.field7009 << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (this.field7009 << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = this.field7005[(var115 >> 12) * this.field7010 + (var107 >> 12)];
                        if (var131 != 0) {
                           field7104[var99++] = var131;
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
}
