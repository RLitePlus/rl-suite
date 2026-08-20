import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ft")
public class classFT extends classFQ {
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("al")
   @Override
   void vmethod455(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2378.field2214;
      int var21 = this.field2378.field2234;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += field7102;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += field7102;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += field7102;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += field7102;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += field7102;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += field7102;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += field7102;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += field7102;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += field7102;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += field7102;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += field7102;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += field7102;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bd")
   final void method4984(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2378.field2213;
               int var38 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  var1[var2++] = this.field2377[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
               } while (--var4 > 0);
            }
         }
      }
   }

   classFT(classFD var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("be")
   final void method4985(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var35];
                     var7 += var8;
                     client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
                     client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
                     client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
                     client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var36];

                  do {
                     client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2378.field2213;
               int var38 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     client.method2316(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2378.field2213
                     );
                     var41 = var1[var2];
                     client.method2316(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2378.field2213
                     );
                     var41 = var1[var2];
                     client.method2316(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2378.field2213
                     );
                     var41 = var1[var2];
                     client.method2316(
                        var1,
                        var2++,
                        var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2378.field2213
                     );
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     client.method2316(
                        var1,
                        var2++,
                        var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00),
                        255 - super.field2378.field2213
                     );
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  client.method2316(var1, var2++, this.field2377[var9], 255 - super.field2378.field2213);
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  client.method2316(
                     var1,
                     var2++,
                     var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00),
                     255 - super.field2378.field2213
                  );
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("bh")
   void method4989(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 1935150176) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.field2378.field2213;
               int var8 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var8 >> 8 & 67852748) + ((var3 & 0xFF00) * var8 >> 8 & 56522486);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & -953236120) * var7 >> 8 & -1339583031) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -64473835) + ((var9 & 681584348) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 51368228) + ((var9 & -346905296) * var7 >> 8 & -86833113);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & -437192453) * var7 >> 8 & -1001776076) + ((var28 & 0xFF00) * var7 >> 8 & -1468532840);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("cr")
   void method4990(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               while (--var4 >= 0) {
                  client.method2316(var1, var2++, var1[var2], 255 - super.field2378.field2213);
                  client.method2316(var1, var2++, var1[var2], 255 - super.field2378.field2213);
                  client.method2316(var1, var2++, var1[var2], 255 - super.field2378.field2213);
                  client.method2316(var1, var2++, var1[var2], 255 - super.field2378.field2213);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  client.method2316(var1, var2++, var1[var2], 255 - super.field2378.field2213);
               }
            } else {
               int var7 = this.field2378.field2213;
               int var8 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  client.method2316(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2378.field2213
                  );
                  var9 = var1[var2];
                  client.method2316(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2378.field2213
                  );
                  var9 = var1[var2];
                  client.method2316(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2378.field2213
                  );
                  var9 = var1[var2];
                  client.method2316(
                     var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.field2378.field2213
                  );
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  client.method2316(
                     var1,
                     var2++,
                     var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00),
                     255 - super.field2378.field2213
                  );
               }
            }
         } else {
            while (--var4 >= 0) {
               client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
               client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
               client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
               client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               client.method2316(var1, var2++, var3, 255 - super.field2378.field2213);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod457(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-48);
      if (var23 == null) {
         int var70 = this.field2378.field2239.vmethod408(var22, -2109519260);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var70, var10), method4925(var70, var11), method4925(var70, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -1664890474);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2378.field2235;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2378.field2235;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2378.field2235;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2378.field2235;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2378.field2235;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2378.field2235;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod452(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2378.field2214;
         int var32 = this.field2378.field2234;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod460(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-44);
      if (var23 == null) {
         int var71 = this.field2378.field2239.vmethod408(var22, -2051899163);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var71, var10), method4925(var71, var11), method4925(var71, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -314652722);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            int var54 = this.field2378.field2235;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bb")
   @Override
   void vmethod461(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-66);
      if (var23 == null) {
         int var71 = this.field2378.field2239.vmethod408(var22, -2007524360);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var71, var10), method4925(var71, var11), method4925(var71, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -1629662678);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            int var54 = this.field2378.field2235;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   @Override
   boolean vmethod450() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bk")
   @Override
   void vmethod453(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2378.field2214;
         int var32 = this.field2378.field2234;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cl")
   void method4994(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (this.field2378.field2211) {
         if (var7 > this.field2378.field2227) {
            var7 = this.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2378.field2232;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2376) {
            if (this.field2378.field2213 == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2378.field2213;
               int var26 = 256 - this.field2378.field2213;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2378.field2213 == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2378.field2213;
            int var174 = 256 - this.field2378.field2213;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bu")
   @Override
   void vmethod456(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      int var11 = (int)var4;
      int var12 = (int)var5;
      int var13 = (int)var6;
      int var14 = (int)var1;
      int var15 = (int)var2;
      int var16 = (int)var3;
      int var17 = 0;
      if (var15 != var14) {
         var17 = (var12 - var11 << 14) / (var15 - var14);
      }

      int var18 = 0;
      if (var16 != var15) {
         var18 = (var13 - var12 << 14) / (var16 - var15);
      }

      int var19 = 0;
      if (var16 != var14) {
         var19 = (var11 - var13 << 14) / (var14 - var16);
      }

      int[] var20 = this.field2378.field2214;
      int var21 = this.field2378.field2234;
      if (var14 <= var15 && var14 <= var16) {
         if (var14 < var21) {
            if (var15 > var21) {
               var15 = var21;
            }

            if (var16 > var21) {
               var16 = var21;
            }

            if (var15 < var16) {
               int var27;
               var13 = var27 = var11 << 14;
               if (var14 < 0) {
                  var13 -= var19 * var14;
                  var27 -= var17 * var14;
                  var14 = 0;
               }

               var12 <<= 14;
               if (var15 < 0) {
                  var12 -= var18 * var15;
                  var15 = 0;
               }

               if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var27 >> 14, var13 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var12 >> 14, var13 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += field7102;
                  }
               } else {
                  var16 -= var15;
                  var15 -= var14;

                  for (var14 = var20[var14]; --var15 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var27 >> 14);
                     var13 += var19;
                     var27 += var17;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var12 >> 14);
                     var13 += var19;
                     var12 += var18;
                     var14 += field7102;
                  }
               }
            } else {
               int var26;
               var12 = var26 = var11 << 14;
               if (var14 < 0) {
                  var12 -= var19 * var14;
                  var26 -= var17 * var14;
                  var14 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var18 * var16;
                  var16 = 0;
               }

               if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var26 >> 14, var12 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var26 >> 14, var13 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += field7102;
                  }
               } else {
                  var15 -= var16;
                  var16 -= var14;

                  for (var14 = var20[var14]; --var16 >= 0; var14 += field7102) {
                     this.method4990(field7104, var14, var10, 0, var12 >> 14, var26 >> 14);
                     var12 += var19;
                     var26 += var17;
                  }

                  while (--var15 >= 0) {
                     this.method4990(field7104, var14, var10, 0, var13 >> 14, var26 >> 14);
                     var13 += var18;
                     var26 += var17;
                     var14 += field7102;
                  }
               }
            }
         }
      } else if (var15 <= var16) {
         if (var15 < var21) {
            if (var16 > var21) {
               var16 = var21;
            }

            if (var14 > var21) {
               var14 = var21;
            }

            if (var16 < var14) {
               int var31;
               var11 = var31 = var12 << 14;
               if (var15 < 0) {
                  var11 -= var17 * var15;
                  var31 -= var18 * var15;
                  var15 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var19 * var16;
                  var16 = 0;
               }

               if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var31 >> 14, var11 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var13 >> 14, var11 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += field7102;
                  }
               } else {
                  var14 -= var16;
                  var16 -= var15;

                  for (var15 = var20[var15]; --var16 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var31 >> 14);
                     var11 += var17;
                     var31 += var18;
                  }

                  while (--var14 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var13 >> 14);
                     var11 += var17;
                     var13 += var19;
                     var15 += field7102;
                  }
               }
            } else {
               int var30;
               var13 = var30 = var12 << 14;
               if (var15 < 0) {
                  var13 -= var17 * var15;
                  var30 -= var18 * var15;
                  var15 = 0;
               }

               var11 <<= 14;
               if (var14 < 0) {
                  var11 -= var19 * var14;
                  var14 = 0;
               }

               if (var17 < var18) {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var13 >> 14, var30 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var11 >> 14, var30 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += field7102;
                  }
               } else {
                  var16 -= var14;
                  var14 -= var15;

                  for (var15 = var20[var15]; --var14 >= 0; var15 += field7102) {
                     this.method4990(field7104, var15, var10, 0, var30 >> 14, var13 >> 14);
                     var13 += var17;
                     var30 += var18;
                  }

                  while (--var16 >= 0) {
                     this.method4990(field7104, var15, var10, 0, var30 >> 14, var11 >> 14);
                     var11 += var19;
                     var30 += var18;
                     var15 += field7102;
                  }
               }
            }
         }
      } else if (var16 < var21) {
         if (var14 > var21) {
            var14 = var21;
         }

         if (var15 > var21) {
            var15 = var21;
         }

         if (var14 < var15) {
            int var35;
            var12 = var35 = var13 << 14;
            if (var16 < 0) {
               var12 -= var18 * var16;
               var35 -= var19 * var16;
               var16 = 0;
            }

            var11 <<= 14;
            if (var14 < 0) {
               var11 -= var17 * var14;
               var14 = 0;
            }

            if (var18 < var19) {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var35 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var11 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += field7102;
               }
            } else {
               var15 -= var14;
               var14 -= var16;

               for (var16 = var20[var16]; --var14 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var35 >> 14, var12 >> 14);
                  var12 += var18;
                  var35 += var19;
               }

               while (--var15 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var11 >> 14, var12 >> 14);
                  var12 += var18;
                  var11 += var17;
                  var16 += field7102;
               }
            }
         } else {
            int var34;
            var11 = var34 = var13 << 14;
            if (var16 < 0) {
               var11 -= var18 * var16;
               var34 -= var19 * var16;
               var16 = 0;
            }

            var12 <<= 14;
            if (var15 < 0) {
               var12 -= var17 * var15;
               var15 = 0;
            }

            if (var18 < var19) {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var11 >> 14, var34 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var12 >> 14, var34 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += field7102;
               }
            } else {
               var14 -= var15;
               var15 -= var16;

               for (var16 = var20[var16]; --var15 >= 0; var16 += field7102) {
                  this.method4990(field7104, var16, var10, 0, var34 >> 14, var11 >> 14);
                  var11 += var18;
                  var34 += var19;
               }

               while (--var14 >= 0) {
                  this.method4990(field7104, var16, var10, 0, var34 >> 14, var12 >> 14);
                  var12 += var17;
                  var34 += var19;
                  var16 += field7102;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ba")
   @Override
   void vmethod459(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-69);
      if (var23 == null) {
         int var70 = this.field2378.field2239.vmethod408(var22, -1637810789);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var70, var10), method4925(var70, var11), method4925(var70, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -2051583421);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2378.field2235;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2378.field2235;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2378.field2235;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2378.field2235;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2378.field2235;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2378.field2235;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
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
   void vmethod458(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-82);
      if (var23 == null) {
         int var70 = this.field2378.field2239.vmethod408(var22, -1866311277);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var70, var10), method4925(var70, var11), method4925(var70, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -605266740);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var69;
                     var26 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var141 = var27 - this.field2378.field2235;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var68;
                     var25 = var68 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var68 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var140 = var27 - this.field2378.field2235;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var68 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var27, var25 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var27, var26 >> 14, var68 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var68 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var74;
                     var24 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var139 = var28 - this.field2378.field2235;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var73;
                     var26 = var73 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var73 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var138 = var28 - this.field2378.field2235;
                     var43 += var45 * var138;
                     var46 += var48 * var138;
                     var49 += var51 * var138;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var26 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var24 >> 14, var73 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           this.method4994(field7104, var23, 0, 0, var28, var73 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var73 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var78;
                  var25 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var137 = var29 - this.field2378.field2235;
                  var43 += var45 * var137;
                  var46 += var48 * var137;
                  var49 += var51 * var137;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var77;
                  var24 = var77 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var77 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var54 = var29 - this.field2378.field2235;
                  var43 += var45 * var54;
                  var46 += var48 * var54;
                  var49 += var51 * var54;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var24 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var25 >> 14, var77 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        this.method4994(field7104, var23, 0, 0, var29, var77 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var77 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bs")
   final void method4986(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2378.field2213;
               int var38 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  var1[var2++] = this.field2377[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lft;[I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("qu")
   public static void method4997(
      classFT var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (var0 == null) {
         var0.method5002(var1, var1, var3, var3, var3, var3, var3, var3, var3, var3, var3, var3, var3, var3, var3);
      } else {
         if (var0.field2378.field2211) {
            if (var7 > var0.field2378.field2227) {
               var7 = var0.field2378.field2227;
            }

            if (var6 < 0) {
               var6 = 0;
            }
         }

         if (var6 < var7) {
            var5 += var6;
            var8 += var9 * var6;
            int var18 = var7 - var6;
            int var24 = var6 - var0.field2378.field2232;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            int var23 = var12 >> 14;
            int var19;
            int var20;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            int var21;
            int var22;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            int var16 = var8 >> 8;
            if (var0.field2376) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
                     }

                     var5++;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bi")
   @Override
   void vmethod462(
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-98);
      if (var23 == null) {
         int var71 = this.field2378.field2239.vmethod408(var22, -985656922);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var71, var10), method4925(var71, var11), method4925(var71, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -79677883);
         int var24 = (int)var4;
         int var25 = (int)var5;
         int var26 = (int)var6;
         int var27 = (int)var1;
         int var28 = (int)var2;
         int var29 = (int)var3;
         int var30 = var25 - var24;
         int var31 = var28 - var27;
         int var32 = var26 - var24;
         int var33 = var29 - var27;
         int var34 = var11 - var10;
         int var35 = var12 - var10;
         int var36 = 0;
         if (var28 != var27) {
            var36 = (var25 - var24 << 14) / (var28 - var27);
         }

         int var37 = 0;
         if (var29 != var28) {
            var37 = (var26 - var25 << 14) / (var29 - var28);
         }

         int var38 = 0;
         if (var29 != var27) {
            var38 = (var24 - var26 << 14) / (var27 - var29);
         }

         int var39 = var30 * var33 - var32 * var31;
         if (var39 != 0) {
            int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
            int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
            int var42 = this.field2378.field2209;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var43 = var15 * var16 - var18 * var13 << 14;
            int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
            int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
            int var46 = var14 * var16 - var17 * var13 << 14;
            int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
            int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
            int var49 = var17 * var15 - var14 * var18 << 14;
            int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
            int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
            int[] var52 = this.field2378.field2214;
            int var53 = this.field2378.field2234;
            int var54 = this.field2378.field2235;
            if (var27 <= var28 && var27 <= var29) {
               if (var27 < var53) {
                  if (var28 > var53) {
                     var28 = var53;
                  }

                  if (var29 > var53) {
                     var29 = var53;
                  }

                  var10 = (var10 << 9) - var40 * var24 + var40;
                  if (var28 < var29) {
                     int var70;
                     var26 = var70 = var24 << 14;
                     if (var27 < 0) {
                        var26 -= var38 * var27;
                        var70 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var25 <<= 14;
                     if (var28 < 0) {
                        var25 -= var37 * var28;
                        var28 = 0;
                     }

                     int var142 = var27 - var54;
                     var43 += var45 * var142;
                     var46 += var48 * var142;
                     var49 += var51 * var142;
                     if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var28;
                        var28 -= var27;

                        for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var70 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var38;
                           var25 += var37;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var69;
                     var25 = var69 = var24 << 14;
                     if (var27 < 0) {
                        var25 -= var38 * var27;
                        var69 -= var36 * var27;
                        var10 -= var41 * var27;
                        var27 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var37 * var29;
                        var29 = 0;
                     }

                     int var141 = var27 - var54;
                     var43 += var45 * var141;
                     var46 += var48 * var141;
                     var49 += var51 * var141;
                     if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var69 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var28 -= var29;
                        var29 -= var27;

                        for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var27, var25 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var25 += var38;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var28 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var27, var26 >> 14, var69 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var37;
                           var69 += var36;
                           var10 += var41;
                           var27 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var28 <= var29) {
               if (var28 < var53) {
                  if (var29 > var53) {
                     var29 = var53;
                  }

                  if (var27 > var53) {
                     var27 = var53;
                  }

                  var11 = (var11 << 9) - var40 * var25 + var40;
                  if (var29 < var27) {
                     int var75;
                     var24 = var75 = var25 << 14;
                     if (var28 < 0) {
                        var24 -= var36 * var28;
                        var75 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var26 <<= 14;
                     if (var29 < 0) {
                        var26 -= var38 * var29;
                        var29 = 0;
                     }

                     int var140 = var28 - var54;
                     var43 += var45 * var140;
                     var46 += var48 * var140;
                     var49 += var51 * var140;
                     if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var27 -= var29;
                        var29 -= var28;

                        for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var75 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var27 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var36;
                           var26 += var38;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  } else {
                     int var74;
                     var26 = var74 = var25 << 14;
                     if (var28 < 0) {
                        var26 -= var36 * var28;
                        var74 -= var37 * var28;
                        var11 -= var41 * var28;
                        var28 = 0;
                     }

                     var24 <<= 14;
                     if (var27 < 0) {
                        var24 -= var38 * var27;
                        var27 = 0;
                     }

                     int var139 = var28 - var54;
                     var43 += var45 * var139;
                     var46 += var48 * var139;
                     var49 += var51 * var139;
                     if (var36 < var37) {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var26 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var24 >> 14, var74 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     } else {
                        var29 -= var27;
                        var27 -= var28;

                        for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var26 += var36;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                        }

                        while (--var29 >= 0) {
                           method4997(this, field7104, var23, 0, 0, var28, var74 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
                           var24 += var38;
                           var74 += var37;
                           var11 += var41;
                           var28 += field7102;
                           var43 += var45;
                           var46 += var48;
                           var49 += var51;
                        }
                     }
                  }
               }
            } else if (var29 < var53) {
               if (var27 > var53) {
                  var27 = var53;
               }

               if (var28 > var53) {
                  var28 = var53;
               }

               var12 = (var12 << 9) - var40 * var26 + var40;
               if (var27 < var28) {
                  int var79;
                  var25 = var79 = var26 << 14;
                  if (var29 < 0) {
                     var25 -= var37 * var29;
                     var79 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var24 <<= 14;
                  if (var27 < 0) {
                     var24 -= var36 * var27;
                     var27 = 0;
                  }

                  int var138 = var29 - var54;
                  var43 += var45 * var138;
                  var46 += var48 * var138;
                  var49 += var51 * var138;
                  if (var37 < var38) {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var28 -= var27;
                     var27 -= var29;

                     for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var79 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var28 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var37;
                        var24 += var36;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               } else {
                  int var78;
                  var24 = var78 = var26 << 14;
                  if (var29 < 0) {
                     var24 -= var37 * var29;
                     var78 -= var38 * var29;
                     var12 -= var41 * var29;
                     var29 = 0;
                  }

                  var25 <<= 14;
                  if (var28 < 0) {
                     var25 -= var36 * var28;
                     var28 = 0;
                  }

                  int var55 = var29 - var54;
                  var43 += var45 * var55;
                  var46 += var48 * var55;
                  var49 += var51 * var55;
                  if (var37 < var38) {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var24 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var25 >> 14, var78 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  } else {
                     var27 -= var28;
                     var28 -= var29;

                     for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var24 += var37;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                     }

                     while (--var27 >= 0) {
                        method4997(this, field7104, var23, 0, 0, var29, var78 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
                        var25 += var36;
                        var78 += var38;
                        var12 += var41;
                        var29 += field7102;
                        var43 += var45;
                        var46 += var48;
                        var49 += var51;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bo")
   @Override
   void vmethod454(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = (int)var4;
      int var14 = (int)var5;
      int var15 = (int)var6;
      int var16 = (int)var1;
      int var17 = (int)var2;
      int var18 = (int)var3;
      int var19 = var14 - var13;
      int var20 = var17 - var16;
      int var21 = var15 - var13;
      int var22 = var18 - var16;
      int var23 = var11 - var10;
      int var24 = var12 - var10;
      int var25;
      if (var18 != var17) {
         var25 = (var15 - var14 << 14) / (var18 - var17);
      } else {
         var25 = 0;
      }

      int var26;
      if (var17 != var16) {
         var26 = (var19 << 14) / var20;
      } else {
         var26 = 0;
      }

      int var27;
      if (var18 != var16) {
         var27 = (var21 << 14) / var22;
      } else {
         var27 = 0;
      }

      int var28 = var19 * var22 - var21 * var20;
      if (var28 != 0) {
         int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
         int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
         int[] var31 = this.field2378.field2214;
         int var32 = this.field2378.field2234;
         if (var16 <= var17 && var16 <= var18) {
            if (var16 < var32) {
               if (var17 > var32) {
                  var17 = var32;
               }

               if (var18 > var32) {
                  var18 = var32;
               }

               var10 = (var10 << 8) - var29 * var13 + var29;
               if (var17 < var18) {
                  int var41;
                  var15 = var41 = var13 << 14;
                  if (var16 < 0) {
                     var15 -= var27 * var16;
                     var41 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var14 <<= 14;
                  if (var17 < 0) {
                     var14 -= var25 * var17;
                     var17 = 0;
                  }

                  if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var18 -= var17;
                     var17 -= var16;

                     for (var16 = var31[var16]; --var17 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
                        var15 += var27;
                        var41 += var26;
                        var10 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
                        var15 += var27;
                        var14 += var25;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               } else {
                  int var40;
                  var14 = var40 = var13 << 14;
                  if (var16 < 0) {
                     var14 -= var27 * var16;
                     var40 -= var26 * var16;
                     var10 -= var30 * var16;
                     var16 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var25 * var18;
                     var18 = 0;
                  }

                  if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  } else {
                     var17 -= var18;
                     var18 -= var16;

                     for (var16 = var31[var16]; --var18 >= 0; var16 += field7102) {
                        this.method4985(field7104, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
                        var14 += var27;
                        var40 += var26;
                        var10 += var30;
                     }

                     while (--var17 >= 0) {
                        this.method4985(field7104, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
                        var15 += var25;
                        var40 += var26;
                        var10 += var30;
                        var16 += field7102;
                     }
                  }
               }
            }
         } else if (var17 <= var18) {
            if (var17 < var32) {
               if (var18 > var32) {
                  var18 = var32;
               }

               if (var16 > var32) {
                  var16 = var32;
               }

               var11 = (var11 << 8) - var29 * var14 + var29;
               if (var18 < var16) {
                  int var45;
                  var13 = var45 = var14 << 14;
                  if (var17 < 0) {
                     var13 -= var26 * var17;
                     var45 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var15 <<= 14;
                  if (var18 < 0) {
                     var15 -= var27 * var18;
                     var18 = 0;
                  }

                  if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var16 -= var18;
                     var18 -= var17;

                     for (var17 = var31[var17]; --var18 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
                        var13 += var26;
                        var45 += var25;
                        var11 += var30;
                     }

                     while (--var16 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
                        var13 += var26;
                        var15 += var27;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               } else {
                  int var44;
                  var15 = var44 = var14 << 14;
                  if (var17 < 0) {
                     var15 -= var26 * var17;
                     var44 -= var25 * var17;
                     var11 -= var30 * var17;
                     var17 = 0;
                  }

                  var13 <<= 14;
                  if (var16 < 0) {
                     var13 -= var27 * var16;
                     var16 = 0;
                  }

                  if (var26 < var25) {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  } else {
                     var18 -= var16;
                     var16 -= var17;

                     for (var17 = var31[var17]; --var16 >= 0; var17 += field7102) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
                        var15 += var26;
                        var44 += var25;
                        var11 += var30;
                     }

                     while (--var18 >= 0) {
                        this.method4985(field7104, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
                        var13 += var27;
                        var44 += var25;
                        var11 += var30;
                        var17 += field7102;
                     }
                  }
               }
            }
         } else if (var18 < var32) {
            if (var16 > var32) {
               var16 = var32;
            }

            if (var17 > var32) {
               var17 = var32;
            }

            var12 = (var12 << 8) - var29 * var15 + var29;
            if (var16 < var17) {
               int var49;
               var14 = var49 = var15 << 14;
               if (var18 < 0) {
                  var14 -= var25 * var18;
                  var49 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var13 <<= 14;
               if (var16 < 0) {
                  var13 -= var26 * var16;
                  var16 = 0;
               }

               if (var25 < var27) {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var17 -= var16;
                  var16 -= var18;

                  for (var18 = var31[var18]; --var16 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var49 += var27;
                     var12 += var30;
                  }

                  while (--var17 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
                     var14 += var25;
                     var13 += var26;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            } else {
               int var48;
               var13 = var48 = var15 << 14;
               if (var18 < 0) {
                  var13 -= var25 * var18;
                  var48 -= var27 * var18;
                  var12 -= var30 * var18;
                  var18 = 0;
               }

               var14 <<= 14;
               if (var17 < 0) {
                  var14 -= var26 * var17;
                  var17 = 0;
               }

               if (var25 < var27) {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               } else {
                  var16 -= var17;
                  var17 -= var18;

                  for (var18 = var31[var18]; --var17 >= 0; var18 += field7102) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
                     var13 += var25;
                     var48 += var27;
                     var12 += var30;
                  }

                  while (--var16 >= 0) {
                     this.method4985(field7104, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
                     var14 += var26;
                     var48 += var27;
                     var12 += var30;
                     var18 += field7102;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bl")
   final void method4987(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 1612932383)) >> 8;
                  var3 = this.field2377[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2378.field2213;
               int var38 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 1837565304)) >> 8;
                     var3 = this.field2377[var39];
                     var7 += var8;
                     var3 = ((var3 & 1318082999) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & -439550700);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 185512022) * var37 >> 8 & 16711935) + ((var41 & -1915298380) * var37 >> 8 & 1469470639);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & -1178663799) * var37 >> 8 & -1886332524) + ((var41 & 0xFF00) * var37 >> 8 & -766455233);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & -1280673162) * var37 >> 8 & 16711935) + ((var41 & 2003306824) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & -808814695) * var37 >> 8 & 16711935) + ((var41 & -349396599) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 593254476)) >> 8;
                  var3 = this.field2377[var40];
                  var3 = ((var3 & -166193810) * var38 >> 8 & -1156547593) + ((var3 & 0xFF00) * var38 >> 8 & -1982643103);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & -1067761782) + ((var45 & 0xFF00) * var37 >> 8 & 38686392);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 1850448237)) >> 8;
                  var1[var2++] = this.field2377[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;

               do {
                  int var11 = (var7 & ~(var7 >> 82590629)) >> 8;
                  var3 = this.field2377[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 1663447838) + ((var3 & 0xFF00) * var10 >> 8 & -1958839685);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 228644701) * var34 >> 8 & 0xFF00);
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIII)V")
   @ObfuscatedName("bv")
   final void method4988(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var35 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var35];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var36 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var36];

                  do {
                     var1[var2++] = var3;
                  } while (--var4 > 0);
               }
            } else {
               int var37 = this.field2378.field2213;
               int var38 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var39 = (var7 & ~(var7 >> 31)) >> 8;
                     var3 = this.field2377[var39];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
                     int var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                     var41 = var1[var2];
                     var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var40 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var40];
                  var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

                  do {
                     int var45 = var1[var2];
                     var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  int var9 = (var7 & ~(var7 >> 31)) >> 8;
                  var1[var2++] = this.field2377[var9];
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var34 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;

               do {
                  int var11 = (var7 & ~(var7 >> 31)) >> 8;
                  var3 = this.field2377[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
                  int var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("bz")
   void method4991(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == -204746057) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.field2378.field2213;
               int var8 = 1428861395 - this.field2378.field2213;
               var3 = ((var3 & -705108865) * var8 >> 8 & 16711935) + ((var3 & 1050265511) * var8 >> 8 & 886421668);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -612016841) + ((var9 & 0xFF00) * var7 >> 8 & 1111901969);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & -883974089) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -510591858) + ((var9 & 0xFF00) * var7 >> 8 & -1679229667);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 1790134296) * var7 >> 8 & -1704756354) + ((var9 & 0xFF00) * var7 >> 8 & -1625691427);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 445163625) * var7 >> 8 & 428081202);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;[I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("mt")
   public static void method4995(
      classFT var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (var0 == null) {
         var0.method4992(var1, var3, var3, var3, var3, var3);
      } else {
         if (var0.field2378.field2211) {
            if (var7 > var0.field2378.field2227) {
               var7 = var0.field2378.field2227;
            }

            if (var6 < 0) {
               var6 = 0;
            }
         }

         if (var6 < var7) {
            var5 += var6;
            var8 += var9 * var6;
            int var18 = var7 - var6;
            int var24 = var6 - var0.field2378.field2232;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            int var23 = var12 >> 14;
            int var19;
            int var20;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            int var21;
            int var22;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            int var16 = var8 >> 8;
            if (var0.field2376) {
               if (var0.field2378.field2213 == 0) {
                  if (var18 > 0) {
                     do {
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                        var19 = var21;
                        var20 = var22;
                        var10 += var13;
                        var11 += var14;
                        var12 += var15;
                        var23 = var12 >> 14;
                        if (var23 != 0) {
                           var21 = var10 / var23;
                           var22 = var11 / var23;
                           if (var21 < 0) {
                              var21 = 0;
                           } else if (var21 > 16256) {
                              var21 = 16256;
                           }
                        } else {
                           var21 = 0;
                           var22 = 0;
                        }

                        var3 = (var19 << 18) + var20;
                        var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                        var8 += var9;
                        var16 = var8 >> 8;
                     } while (--var18 > 0);
                  }

                  var18 = var7 - var6 & 7;
                  if (var18 > 0) {
                     do {
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                        var3 += var17;
                     } while (--var18 > 0);
                  }
               } else {
                  int var25 = var0.field2378.field2213;
                  int var26 = 256 - var0.field2378.field2213;
                  int var27 = var16 * var26 >> 8;
                  if (var18 > 0) {
                     do {
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        int var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        var28 = var1[var5];
                        var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                        var19 = var21;
                        var20 = var22;
                        var10 += var13;
                        var11 += var14;
                        var12 += var15;
                        var23 = var12 >> 14;
                        if (var23 != 0) {
                           var21 = var10 / var23;
                           var22 = var11 / var23;
                           if (var21 < 0) {
                              var21 = 0;
                           } else if (var21 > 16256) {
                              var21 = 16256;
                           }
                        } else {
                           var21 = 0;
                           var22 = 0;
                        }

                        var3 = (var19 << 18) + var20;
                        var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                        var8 += var9;
                        var16 = var8 >> 8;
                     } while (--var18 > 0);
                  }

                  var18 = var7 - var6 & 7;
                  if (var18 > 0) {
                     do {
                        var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                        var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                        int var183 = var1[var5];
                        var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
                        var3 += var17;
                     } while (--var18 > 0);
                  }
               }
            } else if (var0.field2378.field2213 == 0) {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     }

                     var5++;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var173 = var0.field2378.field2213;
               int var174 = 256 - var0.field2378.field2213;
               int var175 = var16 * var174 >> 8;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var184 = var1[var5];
                        var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var185 = var1[var5];
                        var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var186 = var1[var5];
                        var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var187 = var1[var5];
                        var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var188 = var1[var5];
                        var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var189 = var1[var5];
                        var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var190 = var1[var5];
                        var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var191 = var1[var5];
                        var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                        int var192 = var1[var5];
                        var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
                     }

                     var5++;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("bj")
   public static boolean method4983(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11175(-874077237 * var0.field6248, var1, var2, var3, (byte)-33);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;[I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("gf")
   public static void method4998(
      classFT var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (var0.field2378.field2211) {
         if (var7 > var0.field2378.field2227) {
            var7 = var0.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - var0.field2378.field2232;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (var0.field2376) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("by")
   void method4992(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.field2378.field2213;
               int var8 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("cu")
   void method4993(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = this.field2378.field2213;
               int var8 = 256 - this.field2378.field2213;
               var3 = ((var3 & -9329276) * var8 >> 8 & 498563226) + ((var3 & -1547348506) * var8 >> 8 & 225182054);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 624351528);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 1002140769) * var7 >> 8 & 16711935) + ((var9 & -504338482) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 188658397) * var7 >> 8 & 16711935) + ((var9 & 2088505516) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 557525496) * var7 >> 8 & -1517023367) + ((var9 & -185918497) * var7 >> 8 & 1752670216);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 351754321) * var7 >> 8 & 16711935) + ((var28 & 2083783105) * var7 >> 8 & 0xFF00);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   @Override
   boolean vmethod449() {
      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;[I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("rd")
   public static void method4999(
      classFT var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (var0.field2378.field2211) {
         if (var7 > var0.field2378.field2227) {
            var7 = var0.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - var0.field2378.field2232;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (var0.field2376) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("bf")
   void method4996(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (this.field2378.field2211) {
         if (var7 > this.field2378.field2227) {
            var7 = this.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2378.field2232;
         var10 += (var13 >> 3) * var24;
         var11 += (var14 >> 3) * var24;
         var12 += (var15 >> 3) * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13;
         var11 += var14;
         var12 += var15;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2376) {
            if (this.field2378.field2213 == 0) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                     var3 += var17;
                  } while (--var18 > 0);
               }
            } else {
               int var25 = this.field2378.field2213;
               int var26 = 256 - this.field2378.field2213;
               int var27 = var16 * var26 >> 8;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     var28 = var1[var5];
                     var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                  } while (--var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
                     int var183 = var1[var5];
                     var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
                     var3 += var17;
                  } while (--var18 > 0);
               }
            }
         } else if (this.field2378.field2213 == 0) {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            int var173 = this.field2378.field2213;
            int var174 = 256 - this.field2378.field2213;
            int var175 = var16 * var174 >> 8;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var184 = var1[var5];
                     var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var185 = var1[var5];
                     var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var186 = var1[var5];
                     var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var187 = var1[var5];
                     var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var188 = var1[var5];
                     var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var189 = var1[var5];
                     var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var190 = var1[var5];
                     var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var191 = var1[var5];
                     var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
                  var19 = var21;
                  var20 = var22;
                  var10 += var13;
                  var11 += var14;
                  var12 += var15;
                  var23 = var12 >> 14;
                  if (var23 != 0) {
                     var21 = var10 / var23;
                     var22 = var11 / var23;
                     if (var21 < 0) {
                        var21 = 0;
                     } else if (var21 > 16256) {
                        var21 = 16256;
                     }
                  } else {
                     var21 = 0;
                     var22 = 0;
                  }

                  var3 = (var19 << 18) + var20;
                  var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
                     int var192 = var1[var5];
                     var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   boolean vmethod451() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("ct")
   void method5000(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (this.field2378.field2211) {
         if (var7 > this.field2378.field2227) {
            var7 = this.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2378.field2232;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2376) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("bq")
   void method5001(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (this.field2378.field2211) {
         if (var7 > this.field2378.field2227) {
            var7 = this.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2378.field2232;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2376) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 1341417973) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 1373619699) * var16 & -158942308) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 518436143) * var16 & -351041026) + ((var4 & 0xFF00) * var16 & -1425691043) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 1473374505) * var16 & -735084597) + ((var4 & 0xFF00) * var16 & -1081881972) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -266258695) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 1096274628) * var16 & -16711936) + ((var4 & -676019425) * var16 & 2095129871) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 1753631868) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & -2073988947) * var16 & -834848615) + ((var4 & 0xFF00) * var16 & 831216337) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & -1475284361) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & -961949809) * var16 & -16711936) + ((var4 & 1339908246) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & -348821119) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & 1519419198) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & -263983470) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & 467315346) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 1985402226) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -1467690541) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -2022048813) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1578592997) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 1644752895) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 936264928) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -1033783436) + ((var4 & -1395231175) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1082547891) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 1096763779) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & -178780424) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & -127002823) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 330819308) * var16 & 648040372) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 813463282) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & 1670903815) + ((var4 & 0xFF00) * var16 & 1611206515) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1166307498) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIIIIIII)V")
   @ObfuscatedName("cd")
   void method5002(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
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
      if (this.field2378.field2211) {
         if (var7 > this.field2378.field2230) {
            var7 = this.field2378.field2226;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var24 = var6 - this.field2378.field2235;
         var10 += var13 * var24;
         var11 += var14 * var24;
         var12 += var15 * var24;
         int var23 = var12 >> 14;
         int var19;
         int var20;
         if (var23 != 0) {
            var19 = var10 / var23;
            var20 = var11 / var23;
         } else {
            var19 = 0;
            var20 = 0;
         }

         var10 += var13 * var18;
         var11 += var14 * var18;
         var12 += var15 * var18;
         var23 = var12 >> 14;
         int var21;
         int var22;
         if (var23 != 0) {
            var21 = var10 / var23;
            var22 = var11 / var23;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var3 = (var19 << 18) + var20;
         int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
         var18 >>= 3;
         var9 <<= 3;
         int var16 = var8 >> 8;
         if (this.field2376) {
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                  var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  var3 += var17;
               } while (--var18 > 0);
            }
         } else {
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
                  var8 += var9;
                  var16 = var8 >> 8;
               } while (--var18 > 0);
            }

            var18 = var7 - var6 & 7;
            if (var18 > 0) {
               do {
                  if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                     var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
                  }

                  var5++;
                  var3 += var17;
               } while (--var18 > 0);
            }
         }
      }
   }
}
