import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("de")
public class VorbisResidue {
   @ObfuscatedName("av")
   int residueType;
   @ObfuscatedName("an")
   int partitionSize;
   @ObfuscatedName("aj")
   int classbook;
   @ObfuscatedName("ae")
   int classifications;
   @ObfuscatedName("ag")
   int end;
   @ObfuscatedName("at")
   int begin;
   @ObfuscatedName("ak")
   int[] cascade;

   @ObfuscatedSignature(descriptor = "([FIZLem;[Lee;)V")
   @ObfuscatedName("at")
   void method3103(float[] var1, int var2, boolean var3, classEM var4, VorbisCodebook[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.begin].field1561;
         int var7 = this.residueType - this.partitionSize;
         int var8 = var7 / this.classifications;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = class525.method11170(var5[this.begin], var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.end;
                     }

                     var12 /= this.end;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.cascade[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.partitionSize + var11 * this.classifications;
                     VorbisCodebook var16 = var5[var14];
                     if (this.classbook == 0) {
                        int var24 = this.classifications / var16.field1561;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method3701(var4);

                           for (int var20 = 0; var20 < var16.field1561; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.classifications) {
                           float[] var18 = var16.method3701(var4);

                           for (int var19 = 0; var19 < var16.field1561; var19++) {
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

   @ObfuscatedSignature(descriptor = "([FIZLem;[Lee;)V")
   @ObfuscatedName("av")
   void method3104(float[] var1, int var2, boolean var3, classEM var4, VorbisCodebook[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.begin].field1561;
         int var7 = this.residueType - this.partitionSize;
         int var8 = var7 / this.classifications;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = class525.method11170(var5[this.begin], var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.end;
                     }

                     var12 /= this.end;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.cascade[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.partitionSize + var11 * this.classifications;
                     VorbisCodebook var16 = var5[var14];
                     if (this.classbook == 0) {
                        int var24 = this.classifications / var16.field1561;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method3701(var4);

                           for (int var20 = 0; var20 < var16.field1561; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.classifications) {
                           float[] var18 = var16.method3701(var4);

                           for (int var19 = 0; var19 < var16.field1561; var19++) {
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

   @ObfuscatedSignature(descriptor = "([FIZLem;[Lee;)V")
   @ObfuscatedName("ag")
   void method3105(float[] var1, int var2, boolean var3, classEM var4, VorbisCodebook[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.begin].field1561;
         int var7 = this.residueType - this.partitionSize;
         int var8 = var7 / this.classifications;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = class525.method11170(var5[this.begin], var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.end;
                     }

                     var12 /= this.end;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.cascade[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.partitionSize + var11 * this.classifications;
                     VorbisCodebook var16 = var5[var14];
                     if (this.classbook == 0) {
                        int var24 = this.classifications / var16.field1561;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method3701(var4);

                           for (int var20 = 0; var20 < var16.field1561; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.classifications) {
                           float[] var18 = var16.method3701(var4);

                           for (int var19 = 0; var19 < var16.field1561; var19++) {
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

   @ObfuscatedSignature(descriptor = "([FIZLem;[Lee;)V")
   @ObfuscatedName("an")
   void method3106(float[] var1, int var2, boolean var3, classEM var4, VorbisCodebook[] var5) {
      for (int var6 = 0; var6 < var2; var6++) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         int var21 = var5[this.begin].field1561;
         int var7 = this.residueType - this.partitionSize;
         int var8 = var7 / this.classifications;
         int[] var9 = new int[var8];

         for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;

            while (var11 < var8) {
               if (var10 == 0) {
                  int var12 = class525.method11170(var5[this.begin], var4);

                  for (int var13 = var21 - 1; var13 >= 0; var13--) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.end;
                     }

                     var12 /= this.end;
                  }
               }

               for (int var22 = 0; var22 < var21; var22++) {
                  int var23 = var9[var11];
                  int var14 = this.cascade[var23 * 8 + var10];
                  if (var14 >= 0) {
                     int var15 = this.partitionSize + var11 * this.classifications;
                     VorbisCodebook var16 = var5[var14];
                     if (this.classbook == 0) {
                        int var24 = this.classifications / var16.field1561;

                        for (int var25 = 0; var25 < var24; var25++) {
                           float[] var26 = var16.method3701(var4);

                           for (int var20 = 0; var20 < var16.field1561; var20++) {
                              var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
                           }
                        }
                     } else {
                        int var17 = 0;

                        while (var17 < this.classifications) {
                           float[] var18 = var16.method3701(var4);

                           for (int var19 = 0; var19 < var16.field1561; var19++) {
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
   @ObfuscatedSignature(descriptor = "(Lhb;)I")
   @ObfuscatedName("zu")
   public static int method3107(EnumComposition var0) {
      return -132553189 * var0.outputCount;
   }

   VorbisResidue(classEM var1) {
      this.classbook = classEM.method3770(var1, 16, -978050246);
      this.partitionSize = classEM.method3770(var1, 24, -631044094);
      this.residueType = classEM.method3770(var1, 24, 547900971);
      this.classifications = classEM.method3770(var1, 24, -1449184764) + 1;
      this.end = classEM.method3770(var1, 6, -1494344049) + 1;
      this.begin = classEM.method3770(var1, 8, -1315985433);
      int[] var2 = new int[this.end];

      for (int var3 = 0; var3 < this.end; var3++) {
         int var4 = 0;
         int var5 = classEM.method3770(var1, 3, 1857827658);
         boolean var6 = classEM.method3774(var1, (byte)4) != 0;
         if (var6) {
            var4 = classEM.method3770(var1, 5, 1421042591);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.cascade = new int[this.end * 8];

      for (int var7 = 0; var7 < this.end * 8; var7++) {
         this.cascade[var7] = (var2[var7 >> 3] & 1 << (var7 & 7)) != 0 ? classEM.method3770(var1, 8, -1604620392) : -1;
      }
   }
}
