import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("an")
public class classAN {
   @ObfuscatedName("ag")
   int field241;
   @ObfuscatedName("af")
   int field242;
   @ObfuscatedName("ae")
   int field239;
   @ObfuscatedName("ab")
   int field240;
   @ObfuscatedName("az")
   int field243;
   @ObfuscatedName("as")
   int field244;
   @ObfuscatedName("ax")
   int[] field238;

   @ObfuscatedSignature(descriptor = "([FIZLbt;[Lbx;)V")
   @ObfuscatedName("az")
   void method611(float[] var1, int var2, boolean var3, classBT var4, classBX[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.field244].field602;
         int var7 = this.field239 - this.field242;
         int var8 = var7 / this.field240;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = var5[this.field244].method1354(var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field241;
                     }

                     var12 /= this.field241;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.field238[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.field242 + var11 * this.field240;
                     classBX var16 = var5[var14];
                     if (this.field243 == 0) {
                        int var24 = this.field240 / var16.field602;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method1355(var4);

                           for (int var20 = 0; var20 < var16.field602; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.field240) {
                           float[] var18 = var16.method1355(var4);

                           for (int var19 = 0; var19 < var16.field602; var19++) {
                              var1[var15 + var17] = var1[var15 + var17] + var18[var19];
                              var17++;
                           }
                        }
                     }
                  }

                  if (++var11 >= var8) {
                     break;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;)Lkr;")
   @ObfuscatedName("rm")
   public static classKR method616(classSP var0) {
      if (var0 == null) {
         var0.vmethod259();
      }

      return var0.field6021;
   }

   @ObfuscatedSignature(descriptor = "([FIZLbt;[Lbx;)V")
   @ObfuscatedName("af")
   void method612(float[] var1, int var2, boolean var3, classBT var4, classBX[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.field244].field602;
         int var7 = this.field239 - this.field242;
         int var8 = var7 / this.field240;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = var5[this.field244].method1354(var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field241;
                     }

                     var12 /= this.field241;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.field238[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.field242 + var11 * this.field240;
                     classBX var16 = var5[var14];
                     if (this.field243 == 0) {
                        int var24 = this.field240 / var16.field602;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method1355(var4);

                           for (int var20 = 0; var20 < var16.field602; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.field240) {
                           float[] var18 = var16.method1355(var4);

                           for (int var19 = 0; var19 < var16.field602; var19++) {
                              var1[var15 + var17] = var1[var15 + var17] + var18[var19];
                              var17++;
                           }
                        }
                     }
                  }

                  if (++var11 >= var8) {
                     break;
                  }
               }
            }
         }
      }
   }

   classAN(classBT var1) {
      this.field243 = var1.method1231(16, -2062694823);
      this.field242 = var1.method1231(24, -1982826681);
      this.field239 = var1.method1231(24, -1930873174);
      this.field240 = var1.method1231(24, -1971959893) + 1;
      this.field241 = var1.method1231(6, -1962648877) + 1;
      this.field244 = var1.method1231(8, -1967226719);
      int[] var2 = new int[this.field241];

      for (int var3 = 0; var3 < this.field241; var3++) {
         int var4 = 0;
         int var5 = var1.method1231(3, -2054432032);
         boolean var6 = classBT.method1235(var1, 645430661) != 0;
         if (var6) {
            var4 = var1.method1231(5, -2046201344);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.field238 = new int[this.field241 * 8];

      for (int var7 = 0; var7 < this.field241 * 8; var7++) {
         this.field238[var7] = (var2[var7 >> 3] & 1 << (var7 & 7)) != 0 ? var1.method1231(8, -2007295539) : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "([FIZLbt;[Lbx;)V")
   @ObfuscatedName("ae")
   void method613(float[] var1, int var2, boolean var3, classBT var4, classBX[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.field244].field602;
         int var7 = this.field239 - this.field242;
         int var8 = var7 / this.field240;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = var5[this.field244].method1354(var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field241;
                     }

                     var12 /= this.field241;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.field238[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.field242 + var11 * this.field240;
                     classBX var16 = var5[var14];
                     if (this.field243 == 0) {
                        int var24 = this.field240 / var16.field602;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method1355(var4);

                           for (int var20 = 0; var20 < var16.field602; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.field240) {
                           float[] var18 = var16.method1355(var4);

                           for (int var19 = 0; var19 < var16.field602; var19++) {
                              var1[var15 + var17] = var1[var15 + var17] + var18[var19];
                              var17++;
                           }
                        }
                     }
                  }

                  if (++var11 >= var8) {
                     break;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([FIZLbt;[Lbx;)V")
   @ObfuscatedName("ab")
   void method614(float[] var1, int var2, boolean var3, classBT var4, classBX[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.field244].field602;
         int var7 = this.field239 - this.field242;
         int var8 = var7 / this.field240;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = var5[this.field244].method1354(var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field241;
                     }

                     var12 /= this.field241;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.field238[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.field242 + var11 * this.field240;
                     classBX var16 = var5[var14];
                     if (this.field243 == 0) {
                        int var24 = this.field240 / var16.field602;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method1355(var4);

                           for (int var20 = 0; var20 < var16.field602; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.field240) {
                           float[] var18 = var16.method1355(var4);

                           for (int var19 = 0; var19 < var16.field602; var19++) {
                              var1[var15 + var17] = var1[var15 + var17] + var18[var19];
                              var17++;
                           }
                        }
                     }
                  }

                  if (++var11 >= var8) {
                     break;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([FIZLbt;[Lbx;)V")
   @ObfuscatedName("ag")
   void method615(float[] var1, int var2, boolean var3, classBT var4, classBX[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.field244].field602;
         int var7 = this.field239 - this.field242;
         int var8 = var7 / this.field240;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = var5[this.field244].method1354(var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field241;
                     }

                     var12 /= this.field241;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.field238[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.field242 + var11 * this.field240;
                     classBX var16 = var5[var14];
                     if (this.field243 == 0) {
                        int var24 = this.field240 / var16.field602;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method1355(var4);

                           for (int var20 = 0; var20 < var16.field602; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.field240) {
                           float[] var18 = var16.method1355(var4);

                           for (int var19 = 0; var19 < var16.field602; var19++) {
                              var1[var15 + var17] = var1[var15 + var17] + var18[var19];
                              var17++;
                           }
                        }
                     }
                  }

                  if (++var11 >= var8) {
                     break;
                  }
               }
            }
         }
      }
   }
}
