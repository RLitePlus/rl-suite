import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ff")
public class classFF extends classFQ {
   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("cp")
   final void method4678(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2378.field2232;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2376) {
            while (var20-- > 0) {
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cy")
   final void method4633(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2378.field2210 & var6;
      int var8 = this.field2378.field2216 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[F[IIIIF)V")
   @ObfuscatedName("zl")
   public static void method4638(classFF var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      if (var0 == null) {
         var0.method4658(var1, var2, var4, var4, var4, var7);
      }

      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
      var0.method4634(var1, var2, var4, var8, var7, method4630(var2[var4], var7));
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("dc")
   float method4664(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("bh")
   final void method4656(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = this.field2378.field2210 & method4630(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("cu")
   final void method4668(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 65535;
                     var3 = this.field2377[var40];
                     var7 += var8;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & 65535;
                  var3 = this.field2377[var41];

                  do {
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2378.field2213;
               int var43 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & 65535;
                     var3 = this.field2377[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 65535;
                  var3 = this.field2377[var44];
                  var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

                  do {
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  method4655(this, var1, field7103, ++var2, (int)var7 & 65535, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2378.field2213;
               int var12 = 256 - this.field2378.field2213;

               do {
                  this.method4661(var1, field7103, ++var2, (int)var7 & 65535, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("cr")
   float method4665(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("by")
   final void method4634(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2378.field2210 & var6;
      int var8 = this.field2378.field2216 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("ca")
   final void method4645(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = this.field2378.field2210 & method4630(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIIF)V")
   @ObfuscatedName("bz")
   final void method4661(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = this.field2377[var4];
      var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var10 = this.field2378.field2210 & method4630(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   @Override
   boolean vmethod449() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(FFFFF)F")
   @ObfuscatedName("dd")
   float method4666(float var1, float var2, float var3, float var4, float var5) {
      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod452(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2378.field2214;
            int var44 = this.field2378.field2234;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = this.method4666(var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += field7102;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = this.method4666(var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += field7102;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += field7102;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = this.method4666(var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("al")
   @Override
   void vmethod455(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2378.field2214;
         int var34 = this.field2378.field2234;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = this.method4666(var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += field7102;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += field7102;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += field7102;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += field7102;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += field7102;
                     }

                     while (--var15 >= 0.0F) {
                        this.method4672(field7104, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += field7102;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += field7102;
                     }

                     while (--var15 >= 0.0F) {
                        this.method4672(field7104, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += field7102;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = this.method4666(var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.method4672(field7104, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += field7102;
                     }

                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += field7102;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.method4672(field7104, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += field7102;
                     }

                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += field7102;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = this.method4666(var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += field7102;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += field7102;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += field7102;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += field7102;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("cb")
   final void method4672(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               if (var5 == 0 || var6 > this.field2378.field2227 - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               method4649(this, var1, field7103, ++var2, var3, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lff;[I[FIIF)V")
   @ObfuscatedName("uo")
   public static void method4649(classFF var0, int[] var1, float[] var2, int var3, int var4, float var5) {
      if (var0 == null) {
         var0.method4653(var1, var2, var3, var3, var5);
      } else {
         var0.method4634(var1, var2, var3, var4, var5, method4630(var2[var3], var5));
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-91);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -1609126394);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -663168611);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("ct")
   final void method4676(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2378.field2232;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 16256) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = 16256;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2376) {
            if (this.field2378.field2213 != 0) {
               int var27 = this.field2378.field2213;
               int var28 = 256 - this.field2378.field2213;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method4641(this, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 16256) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  this.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (this.field2378.field2213 != 0) {
            int var149 = this.field2378.field2213;
            int var150 = 256 - this.field2378.field2213;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               this.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 16256) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-103);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -1481928134);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -1497473050);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var24, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cv")
   final void method4635(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2378.field2210 & var6;
      int var8 = this.field2378.field2216 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   @Override
   boolean vmethod450() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bk")
   @Override
   void vmethod453(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2378.field2214;
            int var44 = this.field2378.field2234;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = this.method4666(var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += field7102;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = this.method4666(var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += field7102;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += field7102;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = this.method4666(var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("ts")
   public static void method4677(
      classFF var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      if (var0 == null) {
         var0.vmethod450();
      }

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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - var0.field2378.field2232;
         var12 += (var15 >> 3) * var26;
         var13 += (var16 >> 3) * var26;
         var14 += (var17 >> 3) * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > -342005909) {
               var21 = 16256;
            }
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15;
         var13 += var16;
         var14 += var17;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 16256) {
               var23 = -520961864;
            }
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (var0.field2376) {
            if (var0.field2378.field2213 != 0) {
               int var27 = var0.field2378.field2213;
               int var28 = 1981922107 - var0.field2378.field2213;
               int var29 = var18 * var28 >> 8;

               while (var20-- > 0) {
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 1355035324) {
                        var23 = -49679891;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
                  method4641(var0, var1, field7103, var2, var5, var27, var29, var3, var10);
                  var5++;
                  var3 += var19;
               }
            } else {
               while (var20-- > 0) {
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
                  var10 += var11;
                  var21 = var23;
                  var22 = var24;
                  var12 += var15;
                  var13 += var16;
                  var14 += var17;
                  var25 = var14 >> 14;
                  if (var25 != 0) {
                     var23 = var12 / var25;
                     var24 = var13 / var25;
                     if (var23 < 0) {
                        var23 = 0;
                     } else if (var23 > 235491863) {
                        var23 = 16256;
                     }
                  } else {
                     var23 = 0;
                     var24 = 0;
                  }

                  var3 = (var21 << 18) + var22;
                  var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                  var8 += var9;
                  var18 = var8 >> 8;
               }

               for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
                  var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
                  var5++;
                  var3 += var19;
               }
            }
         } else if (var0.field2378.field2213 != 0) {
            int var149 = var0.field2378.field2213;
            int var150 = -540949796 - var0.field2378.field2213;
            int var151 = var18 * var150 >> 8;

            while (var20-- > 0) {
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > -1922699371) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
               var0.method4645(var1, field7103, var2, var5, var149, var151, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var21 = var23;
               var22 = var24;
               var12 += var15;
               var13 += var16;
               var14 += var17;
               var25 = var14 >> 14;
               if (var25 != 0) {
                  var23 = var12 / var25;
                  var24 = var13 / var25;
                  if (var23 < 0) {
                     var23 = 0;
                  } else if (var23 > 524813695) {
                     var23 = 16256;
                  }
               } else {
                  var23 = 0;
                  var24 = 0;
               }

               var3 = (var21 << 18) + var22;
               var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bo")
   @Override
   void vmethod454(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      float var13 = (int)(var4 + 0.5F);
      float var14 = (int)(var5 + 0.5F);
      float var15 = (int)(var6 + 0.5F);
      float var16 = (int)(var1 + 0.5F);
      float var17 = (int)(var2 + 0.5F);
      float var18 = (int)(var3 + 0.5F);
      float var19 = var14 - var13;
      float var20 = var17 - var16;
      float var21 = var15 - var13;
      float var22 = var18 - var16;
      float var23 = var19 * var22 - var21 * var20;
      if (var23 != 0.0F) {
         float var24 = var10;
         float var25 = var11;
         float var26 = var12;
         float var27 = var25 - var24;
         float var28 = var26 - var24;
         float var29 = (var27 * var22 - var28 * var20) / var23;
         float var30 = (var28 * var19 - var27 * var21) / var23;
         float var31 = var5 - var4;
         float var32 = var2 - var1;
         float var33 = var6 - var4;
         float var34 = var3 - var1;
         float var35 = var31 * var34 - var33 * var32;
         if (var35 != 0.0F) {
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * var34 - var37 * var32) / var35;
            float var39 = (var37 * var31 - var36 * var33) / var35;
            float var40;
            if (var18 != var17) {
               var40 = (var15 - var14) / (var18 - var17);
            } else {
               var40 = 0.0F;
            }

            float var41;
            if (var17 != var16) {
               var41 = var19 / var20;
            } else {
               var41 = 0.0F;
            }

            float var42;
            if (var18 != var16) {
               var42 = var21 / var22;
            } else {
               var42 = 0.0F;
            }

            int[] var43 = this.field2378.field2214;
            int var44 = this.field2378.field2234;
            if (var16 <= var17 && var16 <= var18) {
               if (!(var16 >= var44)) {
                  if (var17 > var44) {
                     var17 = var44;
                  }

                  if (var18 > var44) {
                     var18 = var44;
                  }

                  var24 = var24 - var29 * var13 + var29;
                  var7 = this.method4666(var4, var1, var7, var38, var39);
                  if (var17 < var18) {
                     var15 = var13;
                     if (var16 < 0.0F) {
                        var15 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var17 < 0.0F) {
                        var14 -= var40 * var17;
                        var17 = 0.0F;
                     }

                     if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var101;
                        for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var101 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var101 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F) - var17;
                        var17 -= var16;

                        int var100;
                        for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var42;
                           var13 += var41;
                           var24 += var30;
                           var100 += field7102;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
                           var15 += var42;
                           var14 += var40;
                           var24 += var30;
                           var100 += field7102;
                           var7 += var39;
                        }
                     }
                  } else {
                     var14 = var13;
                     if (var16 < 0.0F) {
                        var14 = var13 - var42 * var16;
                        var13 -= var41 * var16;
                        var24 -= var30 * var16;
                        var16 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var40 * var18;
                        var18 = 0.0F;
                     }

                     if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var99;
                        for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var99 += field7102;
                           var7 += var39;
                        }
                     } else {
                        var16 = (int)(var16 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var17 = (int)(var17 + 0.5F) - var18;
                        var18 -= var16;

                        int var98;
                        for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
                           this.method4668(field7104, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
                           var14 += var42;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                        }

                        while (--var17 >= 0.0F) {
                           this.method4668(field7104, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
                           var15 += var40;
                           var13 += var41;
                           var24 += var30;
                           var98 += field7102;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var17 <= var18) {
               if (!(var17 >= var44)) {
                  if (var18 > var44) {
                     var18 = var44;
                  }

                  if (var16 > var44) {
                     var16 = var44;
                  }

                  var25 = var25 - var29 * var14 + var29;
                  var8 = this.method4666(var5, var2, var8, var38, var39);
                  if (var18 < var16) {
                     var13 = var14;
                     if (var17 < 0.0F) {
                        var13 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var18 < 0.0F) {
                        var15 -= var42 * var18;
                        var18 = 0.0F;
                     }

                     if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var97;
                        for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var97 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var97 += field7102;
                           var8 += var39;
                        }
                     } else {
                        var17 = (int)(var17 + 0.5F);
                        var18 = (int)(var18 + 0.5F);
                        var16 = (int)(var16 + 0.5F) - var18;
                        var18 -= var17;

                        int var96;
                        for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var41;
                           var14 += var40;
                           var25 += var30;
                           var96 += field7102;
                        }

                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
                           var13 += var41;
                           var15 += var42;
                           var25 += var30;
                           var96 += field7102;
                           var8 += var39;
                        }
                     }
                  } else {
                     var15 = var14;
                     if (var17 < 0.0F) {
                        var15 = var14 - var41 * var17;
                        var14 -= var40 * var17;
                        var25 -= var30 * var17;
                        var17 = 0.0F;
                     }

                     if (var16 < 0.0F) {
                        var13 -= var42 * var16;
                        var16 = 0.0F;
                     }

                     var17 = (int)(var17 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var18 = (int)(var18 + 0.5F) - var16;
                     var16 -= var17;
                     int var95 = var43[(int)var17];
                     if (var41 < var40) {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     } else {
                        while (--var16 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
                           var15 += var41;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }

                        while (--var18 >= 0.0F) {
                           this.method4668(field7104, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
                           var13 += var42;
                           var14 += var40;
                           var25 += var30;
                           var95 += field7102;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (!(var18 >= var44)) {
               if (var16 > var44) {
                  var16 = var44;
               }

               if (var17 > var44) {
                  var17 = var44;
               }

               var26 = var26 - var29 * var15 + var29;
               var9 = this.method4666(var6, var3, var9, var38, var39);
               if (var16 < var17) {
                  var14 = var15;
                  if (var18 < 0.0F) {
                     var14 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var41 * var16;
                     var16 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var16 = (int)(var16 + 0.5F);
                  var17 = (int)(var17 + 0.5F) - var16;
                  var16 -= var18;
                  int var94 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var15 += var42;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }

                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
                        var14 += var40;
                        var13 += var41;
                        var26 += var30;
                        var94 += field7102;
                        var9 += var39;
                     }
                  }
               } else {
                  var13 = var15;
                  if (var18 < 0.0F) {
                     var13 = var15 - var40 * var18;
                     var15 -= var42 * var18;
                     var26 -= var30 * var18;
                     var18 = 0.0F;
                  }

                  if (var17 < 0.0F) {
                     var14 -= var41 * var17;
                     var17 = 0.0F;
                  }

                  var18 = (int)(var18 + 0.5F);
                  var17 = (int)(var17 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var17;
                  var17 -= var18;
                  int var45 = var43[(int)var18];
                  if (var40 < var42) {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  } else {
                     while (--var17 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
                        var13 += var40;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4668(field7104, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
                        var14 += var41;
                        var15 += var42;
                        var26 += var30;
                        var45 += field7102;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("cz")
   final void method4650(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method4634(var1, var2, var3, var4, var5, method4630(var2[var3], var5));
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-38);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -2088895374);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -712020681);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-87);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -1341958431);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -2087146994);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var24, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lff;[I[F[IIIIIF)V")
   @ObfuscatedName("xn")
   public static void method4641(classFF var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      if (var0 == null) {
         var0.method4648(var1, var2, var1, var4, var4, var4, var4, var8);
      } else {
         int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = var0.field2378.field2210 & method4630(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-119);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -1501683217);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -317451860);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var144 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var144;
                        var55 += var57 * var144;
                        var58 += var60 * var144;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var152;
                           for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var152 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var151;
                           for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var151 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var143 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var143;
                        var55 += var57 * var143;
                        var58 += var60 * var143;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var142 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var148;
                           for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var147;
                           for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        float var81;
                        var26 = var81 = var25;
                        if (var28 < 0.0F) {
                           var26 -= var49 * var28;
                           var81 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var141 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var146 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var24, (int)var81, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4678(
                                 field7104, var23, 0, 0, var146, (int)var81, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var81 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var140 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var140;
                     var55 += var57 * var140;
                     var58 += var60 * var140;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var145 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var145 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     float var83;
                     var24 = var83 = var26;
                     if (var29 < 0.0F) {
                        var24 -= var48 * var29;
                        var83 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var83, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4678(
                              field7104, var23, 0, 0, var64, (int)var83, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var83 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("dr")
   final void method4673(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               if (var5 == 0 || var6 > this.field2378.field2227 - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               method4649(this, var1, field7103, ++var2, var3, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cd")
   final void method4636(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2378.field2210 & var6;
      int var8 = this.field2378.field2216 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[FIIIF)V")
   @ObfuscatedName("ip")
   public static void method4657(classFF var0, int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      if (var0 == null) {
         var0.method4639(var1, var2, var1, var3, var3, var3, var6);
      }

      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = var0.field2378.field2210 & method4630(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("be")
   static final int method4630(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   @ObfuscatedSignature(descriptor = "([I[FIIFI)V")
   @ObfuscatedName("cs")
   final void method4637(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      int var7 = this.field2378.field2210 & var6;
      int var8 = this.field2378.field2216 & var6;
      var1[var3] = var7 & var4 | ~var7 & var1[var3];
      int var9 = var8 & Float.floatToRawIntBits(var5);
      int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
      var2[var3] = Float.intBitsToFloat(var9 | var10);
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("di")
   final void method4669(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 1758048187;
                     var3 = this.field2377[var40];
                     var7 += var8;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & -531704116;
                  var3 = this.field2377[var41];

                  do {
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2378.field2213;
               int var43 = -1300905095 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & -103454883;
                     var3 = this.field2377[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & -1640400748) + ((var3 & 547835287) * var43 >> 8 & -1802675709);
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 1688239878;
                  var3 = this.field2377[var44];
                  var3 = ((var3 & -1138392291) * var43 >> 8 & 16711935) + ((var3 & -329909385) * var43 >> 8 & 0xFF00);

                  do {
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  method4655(this, var1, field7103, ++var2, (int)var7 & -1463677734, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2378.field2213;
               int var12 = 1798968678 - this.field2378.field2213;

               do {
                  this.method4661(var1, field7103, ++var2, (int)var7 & 1790553018, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[F[IIIIIF)V")
   @ObfuscatedName("od")
   public static void method4646(classFF var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      if (var0 == null) {
         var0.method4660(var1, var2, var4, var4, var4, var8);
      } else {
         int var9 = var3[(var7 & -1064169760) + (var7 >>> 25)];
         if (var9 != 0) {
            var9 = ((var9 & -810279429) * var6 & -16711936 | (var9 & -1314890647) * var6 & 1241639685) >> 8;
            int var10 = var1[var4];
            var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 742780252) >> 8;
            int var11 = var0.field2378.field2210 & method4630(var2[var4], var8);
            var1[var4] = (var11 & var9) + (~var11 & var10);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("co")
   final void method4639(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      var8 = ((var8 & 333924918) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
      this.method4634(var1, var2, var4, var8, var7, method4630(var2[var4], var7));
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("bq")
   final void method4640(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
      this.method4634(var1, var2, var4, var8, var7, method4630(var2[var4], var7));
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("cf")
   final void method4642(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
      int var10 = var1[var4];
      var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
      int var11 = this.field2378.field2210 & method4630(var2[var4], var8);
      var1[var4] = (var11 & var9) + (~var11 & var10);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("cc")
   final void method4643(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      if (var8 != 0) {
         var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
         this.method4634(var1, var2, var4, var8, var7, method4630(var2[var4], var7));
      }
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("bf")
   final void method4647(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 249817360) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 18265740) * var6 & -189436655 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 119919213) * var5 & -16711936 | (var10 & 1548075630) * var5 & -1598477153) >> 8;
         int var11 = this.field2378.field2210 & method4630(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("cq")
   static final int method4631(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> -112104231;
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("ch")
   final void method4651(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method4634(var1, var2, var3, var4, var5, method4630(var2[var3], var5));
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
      int[] var23 = this.field2378.field2239.vmethod402(var22, (byte)-78);
      if (var23 == null) {
         int var79 = this.field2378.field2239.vmethod408(var22, -1300735000);
         this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, method4925(var79, var10), method4925(var79, var11), method4925(var79, var12));
      } else {
         this.field2376 = this.field2378.field2239.vmethod412(var22, -1266545880);
         float var24 = (int)(var4 + 0.5F);
         float var25 = (int)(var5 + 0.5F);
         float var26 = (int)(var6 + 0.5F);
         float var27 = (int)(var1 + 0.5F);
         float var28 = (int)(var2 + 0.5F);
         float var29 = (int)(var3 + 0.5F);
         float var30 = var25 - var24;
         float var31 = var28 - var27;
         float var32 = var26 - var24;
         float var33 = var29 - var27;
         float var34 = var30 * var33 - var32 * var31;
         if (var34 != 0.0F) {
            float var35 = var11 - var10;
            float var36 = var12 - var10;
            int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
            int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
            float var39 = var5 - var4;
            float var40 = var2 - var1;
            float var41 = var6 - var4;
            float var42 = var3 - var1;
            float var43 = var39 * var42 - var41 * var40;
            if (var43 != 0.0F) {
               float var44 = var8 - var7;
               float var45 = var9 - var7;
               float var46 = (var44 * var42 - var45 * var40) / var43;
               float var47 = (var45 * var39 - var44 * var41) / var43;
               float var48;
               if (var29 != var28) {
                  var48 = (var26 - var25) / (var29 - var28);
               } else {
                  var48 = 0.0F;
               }

               float var49;
               if (var28 != var27) {
                  var49 = var30 / var31;
               } else {
                  var49 = 0.0F;
               }

               float var50;
               if (var29 != var27) {
                  var50 = var32 / var33;
               } else {
                  var50 = 0.0F;
               }

               int var51 = this.field2378.field2209;
               var14 = var13 - var14;
               var17 = var16 - var17;
               var20 = var19 - var20;
               var15 -= var13;
               var18 -= var16;
               var21 -= var19;
               int var52 = var15 * var16 - var18 * var13 << 14;
               int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
               int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
               int var55 = var14 * var16 - var17 * var13 << 14;
               int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
               int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
               int var58 = var17 * var15 - var14 * var18 << 14;
               int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
               int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
               int[] var61 = this.field2378.field2214;
               int var62 = this.field2378.field2234;
               if (var27 <= var28 && var27 <= var29) {
                  if (!(var27 >= var62)) {
                     if (var28 > var62) {
                        var28 = var62;
                     }

                     if (var29 > var62) {
                        var29 = var62;
                     }

                     var10 = (var10 << 9) - var37 * (int)var24 + var37;
                     var7 = this.method4666(var4, var1, var7, var46, var47);
                     if (var28 < var29) {
                        var26 = var24;
                        if (var27 < 0.0F) {
                           var26 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 -= var38 * (int)var27;
                           var27 = 0.0F;
                        }

                        if (var28 < 0.0F) {
                           var25 -= var48 * var28;
                           var28 = 0.0F;
                        }

                        int var142 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var142;
                        var55 += var57 * var142;
                        var58 += var60 * var142;
                        if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var150;
                           for (var150 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var150, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var150 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F) - var28;
                           var28 -= var27;

                           int var149;
                           for (var149 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var24 += var49;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var149, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var50;
                              var25 += var48;
                              var10 += var38;
                              var149 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     } else {
                        var25 = var24;
                        if (var27 < 0.0F) {
                           var25 = var24 - var50 * var27;
                           var24 -= var49 * var27;
                           var10 = (int)(var10 - var38 * var27);
                           var27 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var48 * var29;
                           var29 = 0.0F;
                        }

                        int var141 = (int)var27 - this.field2378.field2235;
                        var52 += var54 * var141;
                        var55 += var57 * var141;
                        var58 += var60 * var141;
                        if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var148;
                           for (var148 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var148, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var148 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        } else {
                           var27 = (int)(var27 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var28 = (int)(var28 + 0.5F) - var29;
                           var29 -= var27;

                           int var147;
                           for (var147 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var25 += var50;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var28 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var147, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var48;
                              var24 += var49;
                              var10 += var38;
                              var147 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var7 += var47;
                           }
                        }
                     }
                  }
               } else if (var28 <= var29) {
                  if (!(var28 >= var62)) {
                     if (var29 > var62) {
                        var29 = var62;
                     }

                     if (var27 > var62) {
                        var27 = var62;
                     }

                     var11 = (var11 << 9) - var37 * (int)var25 + var37;
                     var8 = this.method4666(var5, var2, var8, var46, var47);
                     if (var29 < var27) {
                        var24 = var25;
                        if (var28 < 0.0F) {
                           var24 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var29 < 0.0F) {
                           var26 -= var50 * var29;
                           var29 = 0.0F;
                        }

                        int var140 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var140;
                        var55 += var57 * var140;
                        var58 += var60 * var140;
                        if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var146;
                           for (var146 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var146, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var146 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           var28 = (int)(var28 + 0.5F);
                           var29 = (int)(var29 + 0.5F);
                           var27 = (int)(var27 + 0.5F) - var29;
                           var29 -= var28;

                           int var145;
                           for (var145 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var25 += var48;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                           }

                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var145, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var49;
                              var26 += var50;
                              var11 += var38;
                              var145 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     } else {
                        var26 = var25;
                        if (var28 < 0.0F) {
                           var26 = var25 - var49 * var28;
                           var25 -= var48 * var28;
                           var11 -= var38 * (int)var28;
                           var28 = 0.0F;
                        }

                        if (var27 < 0.0F) {
                           var24 -= var50 * var27;
                           var27 = 0.0F;
                        }

                        int var139 = (int)var28 - this.field2378.field2235;
                        var52 += var54 * var139;
                        var55 += var57 * var139;
                        var58 += var60 * var139;
                        var28 = (int)(var28 + 0.5F);
                        var27 = (int)(var27 + 0.5F);
                        var29 = (int)(var29 + 0.5F) - var27;
                        var27 -= var28;
                        int var144 = var61[(int)var28];
                        if (var49 < var48) {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        } else {
                           while (--var27 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var26 += var49;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }

                           while (--var29 >= 0.0F) {
                              this.method4676(
                                 field7104, var23, 0, 0, var144, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59
                              );
                              var24 += var50;
                              var25 += var48;
                              var11 += var38;
                              var144 += field7102;
                              var52 += var54;
                              var55 += var57;
                              var58 += var60;
                              var8 += var47;
                           }
                        }
                     }
                  }
               } else if (!(var29 >= var62)) {
                  if (var27 > var62) {
                     var27 = var62;
                  }

                  if (var28 > var62) {
                     var28 = var62;
                  }

                  var12 = (var12 << 9) - var37 * (int)var26 + var37;
                  var9 = this.method4666(var6, var3, var9, var46, var47);
                  if (var27 < var28) {
                     var25 = var26;
                     if (var29 < 0.0F) {
                        var25 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var27 < 0.0F) {
                        var24 -= var49 * var27;
                        var27 = 0.0F;
                     }

                     int var138 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var138;
                     var55 += var57 * var138;
                     var58 += var60 * var138;
                     var29 = (int)(var29 + 0.5F);
                     var27 = (int)(var27 + 0.5F);
                     var28 = (int)(var28 + 0.5F) - var27;
                     var27 -= var29;
                     int var143 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var26 += var50;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var143, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var48;
                           var24 += var49;
                           var12 += var38;
                           var143 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  } else {
                     var24 = var26;
                     if (var29 < 0.0F) {
                        var24 = var26 - var48 * var29;
                        var26 -= var50 * var29;
                        var12 -= var38 * (int)var29;
                        var29 = 0.0F;
                     }

                     if (var28 < 0.0F) {
                        var25 -= var49 * var28;
                        var28 = 0.0F;
                     }

                     int var63 = (int)var29 - this.field2378.field2235;
                     var52 += var54 * var63;
                     var55 += var57 * var63;
                     var58 += var60 * var63;
                     var29 = (int)(var29 + 0.5F);
                     var28 = (int)(var28 + 0.5F);
                     var27 = (int)(var27 + 0.5F) - var28;
                     var28 -= var29;
                     int var64 = var61[(int)var29];
                     if (var48 < var50) {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     } else {
                        while (--var28 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var24 += var48;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }

                        while (--var27 >= 0.0F) {
                           this.method4676(
                              field7104, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59
                           );
                           var25 += var49;
                           var26 += var50;
                           var12 += var38;
                           var64 += field7102;
                           var52 += var54;
                           var55 += var57;
                           var58 += var60;
                           var9 += var47;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("ci")
   final void method4658(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = this.field2378.field2210 & method4630(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "(Lff;[I[FIIIF)V")
   @ObfuscatedName("vl")
   public static void method4659(classFF var0, int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      if (var0 == null) {
         var0.method4660(var1, var2, var3, var3, var3, var6);
      }

      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = var0.field2378.field2210 & method4630(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("ww")
   public static void method4679(
      classFF var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - var0.field2378.field2232;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (var0.field2376) {
            while (var20-- > 0) {
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               var0.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               var0.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FF)I")
   @ObfuscatedName("cl")
   static final int method4632(float var0, float var1) {
      return Float.floatToRawIntBits(var0 - var1) >> 31;
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("cg")
   final void method4654(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method4634(var1, var2, var3, this.field2377[var4], var5, method4630(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIIF)V")
   @ObfuscatedName("cx")
   final void method4662(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = this.field2377[var4];
      var8 = ((var8 & 89919616) * var6 >> 8 & 2127734068) + ((var8 & 0xFF00) * var6 >> 8 & -1070062123);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 16711935) * var5 >> 8 & -1781271480) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var10 = this.field2378.field2210 & method4630(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIIF)V")
   @ObfuscatedName("ce")
   final void method4663(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = this.field2377[var4];
      var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var10 = this.field2378.field2210 & method4630(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("dr")
   public static int method4667(classZD var0) {
      return var0.field7155 * 1736120249;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   boolean vmethod451() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIF)V")
   @ObfuscatedName("bs")
   final void method4644(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
      int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
      if (var8 != 0) {
         var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
         this.method4634(var1, var2, var4, var8, var7, method4630(var2[var4], var7));
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("dx")
   final void method4670(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 65535;
                     var3 = this.field2377[var40];
                     var7 += var8;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & 65535;
                  var3 = this.field2377[var41];

                  do {
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2378.field2213;
               int var43 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & 65535;
                     var3 = this.field2377[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 65535;
                  var3 = this.field2377[var44];
                  var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

                  do {
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  method4655(this, var1, field7103, ++var2, (int)var7 & 65535, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2378.field2213;
               int var12 = 256 - this.field2378.field2213;

               do {
                  this.method4661(var1, field7103, ++var2, (int)var7 & 65535, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFFFF)V")
   @ObfuscatedName("dy")
   final void method4671(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * var5;
         var9 += var10 * var5;
         if (this.field2378.field2212) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if (this.field2378.field2213 == 0) {
               if (var4 > 0) {
                  do {
                     int var40 = (int)var7 & 65535;
                     var3 = this.field2377[var40];
                     var7 += var8;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var41 = (int)var7 & 65535;
                  var3 = this.field2377[var41];

                  do {
                     method4649(this, var1, field7103, ++var2, var3, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            } else {
               int var42 = this.field2378.field2213;
               int var43 = 256 - this.field2378.field2213;
               if (var4 > 0) {
                  do {
                     int var13 = (int)var7 & 65535;
                     var3 = this.field2377[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  int var44 = (int)var7 & 65535;
                  var3 = this.field2377[var44];
                  var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

                  do {
                     method4659(this, var1, field7103, ++var2, var3, var42, var9);
                     var9 += var10;
                  } while (--var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if (this.field2378.field2213 == 0) {
               do {
                  method4655(this, var1, field7103, ++var2, (int)var7 & 65535, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            } else {
               int var11 = this.field2378.field2213;
               int var12 = 256 - this.field2378.field2213;

               do {
                  this.method4661(var1, field7103, ++var2, (int)var7 & 65535, var11, var12, var9);
                  var9 += var10;
                  var7 += var8;
               } while (--var4 > 0);
            }
         }
      }
   }

   classFF(classFD var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lff;[I[FIIF)V")
   @ObfuscatedName("rv")
   public static void method4655(classFF var0, int[] var1, float[] var2, int var3, int var4, float var5) {
      if (var0 == null) {
         var0.method4652(var1, var2, var3, var3, var5);
      } else {
         var0.method4634(var1, var2, var3, var0.field2377[var4], var5, method4630(var2[var3], var5));
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("du")
   final void method4674(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2378.field2213 == 0) {
            while (--var4 >= 0) {
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
               method4649(this, var1, field7103, ++var2, var3, var7);
            }
         } else if (this.field2378.field2213 != 254) {
            int var9 = this.field2378.field2213;
            int var10 = 256 - this.field2378.field2213;
            var3 = ((var3 & -2143100969) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & -1898720771);

            while (--var4 >= 0) {
               method4659(this, var1, field7103, ++var2, var3, var9, var7);
               var7 += var8;
               method4659(this, var1, field7103, ++var2, var3, var9, var7);
               var7 += var8;
               method4659(this, var1, field7103, ++var2, var3, var9, var7);
               var7 += var8;
               method4659(this, var1, field7103, ++var2, var3, var9, var7);
               var7 += var8;
            }

            for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
               method4659(this, var1, field7103, ++var2, var3, var9, var7);
            }
         } else if (var5 != 0 && var6 <= this.field2378.field2227 - 1) {
            while (--var4 >= 0) {
               var2++;
               method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               var7 += var8;
               var2++;
               method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               var7 += var8;
               var2++;
               method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               var7 += var8;
               var2++;
               method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               var2++;
               method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIIIFF)V")
   @ObfuscatedName("dt")
   final void method4675(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.field2378.field2211) {
         if (var6 > this.field2378.field2227) {
            var6 = this.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * var5;
         if (this.field2378.field2213 != 0) {
            if (this.field2378.field2213 == 254) {
               if (var5 == 0 || var6 > this.field2378.field2227 - 1) {
                  return;
               }

               while (--var4 >= 0) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
                  var7 += var8;
               }

               for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
                  var2++;
                  method4659(this, var1, field7103, var2 - 1, var1[var2], 0, var7);
               }
            } else {
               int var9 = this.field2378.field2213;
               int var10 = 256 - this.field2378.field2213;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
                  var7 += var8;
               }

               for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
                  method4659(this, var1, field7103, ++var2, var3, var9, var7);
               }
            }
         } else {
            while (--var4 >= 0) {
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
               method4649(this, var1, field7103, ++var2, var3, var7);
               var7 += var8;
            }

            for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
               method4649(this, var1, field7103, ++var2, var3, var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bu")
   @Override
   void vmethod456(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = (int)(var4 + 0.5F);
      float var12 = (int)(var5 + 0.5F);
      float var13 = (int)(var6 + 0.5F);
      float var14 = (int)(var1 + 0.5F);
      float var15 = (int)(var2 + 0.5F);
      float var16 = (int)(var3 + 0.5F);
      float var17 = var12 - var11;
      float var18 = var15 - var14;
      float var19 = var13 - var11;
      float var20 = var16 - var14;
      float var21 = var5 - var4;
      float var22 = var2 - var1;
      float var23 = var6 - var4;
      float var24 = var3 - var1;
      float var25 = var21 * var24 - var23 * var22;
      if (var25 != 0.0F) {
         float var26 = var8 - var7;
         float var27 = var9 - var7;
         float var28 = (var26 * var24 - var27 * var22) / var25;
         float var29 = (var27 * var21 - var26 * var23) / var25;
         float var30;
         if (var16 != var15) {
            var30 = (var13 - var12) / (var16 - var15);
         } else {
            var30 = 0.0F;
         }

         float var31;
         if (var15 != var14) {
            var31 = var17 / var18;
         } else {
            var31 = 0.0F;
         }

         float var32;
         if (var16 != var14) {
            var32 = var19 / var20;
         } else {
            var32 = 0.0F;
         }

         int[] var33 = this.field2378.field2214;
         int var34 = this.field2378.field2234;
         if (var14 <= var15 && var14 <= var16) {
            if (!(var14 >= var34)) {
               if (var15 > var34) {
                  var15 = var34;
               }

               if (var16 > var34) {
                  var16 = var34;
               }

               var7 = this.method4666(var4, var1, var7, var28, var29);
               if (var15 < var16) {
                  var13 = var11;
                  if (var14 < 0.0F) {
                     var13 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var15 < 0.0F) {
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var88;
                     for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var88, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var88 += field7102;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var88, var10, 0, (int)var12, (int)var13, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var88 += field7102;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F) - var15;
                     var15 -= var14;

                     int var87;
                     for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var87, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var32;
                        var11 += var31;
                        var87 += field7102;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var87, var10, 0, (int)var13, (int)var12, var7, var28);
                        var13 += var32;
                        var12 += var30;
                        var87 += field7102;
                        var7 += var29;
                     }
                  }
               } else {
                  var12 = var11;
                  if (var14 < 0.0F) {
                     var12 = var11 - var32 * var14;
                     var11 -= var31 * var14;
                     var14 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var30 * var16;
                     var16 = 0.0F;
                  }

                  if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var86;
                     for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var86, var10, 0, (int)var11, (int)var12, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var86 += field7102;
                     }

                     while (--var15 >= 0.0F) {
                        this.method4672(field7104, var86, var10, 0, (int)var11, (int)var13, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var86 += field7102;
                        var7 += var29;
                     }
                  } else {
                     var14 = (int)(var14 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var15 = (int)(var15 + 0.5F) - var16;
                     var16 -= var14;

                     int var85;
                     for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
                        this.method4672(field7104, var85, var10, 0, (int)var12, (int)var11, var7, var28);
                        var12 += var32;
                        var11 += var31;
                        var85 += field7102;
                     }

                     while (--var15 >= 0.0F) {
                        this.method4672(field7104, var85, var10, 0, (int)var13, (int)var11, var7, var28);
                        var13 += var30;
                        var11 += var31;
                        var85 += field7102;
                        var7 += var29;
                     }
                  }
               }
            }
         } else if (var15 <= var16) {
            if (!(var15 >= var34)) {
               if (var16 > var34) {
                  var16 = var34;
               }

               if (var14 > var34) {
                  var14 = var34;
               }

               var8 = this.method4666(var5, var2, var8, var28, var29);
               if (var16 < var14) {
                  var11 = var12;
                  if (var15 < 0.0F) {
                     var11 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var16 < 0.0F) {
                     var13 -= var32 * var16;
                     var16 = 0.0F;
                  }

                  if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var84;
                     for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.method4672(field7104, var84, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var84 += field7102;
                     }

                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var84, var10, 0, (int)var13, (int)var11, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var84 += field7102;
                        var8 += var29;
                     }
                  } else {
                     var15 = (int)(var15 + 0.5F);
                     var16 = (int)(var16 + 0.5F);
                     var14 = (int)(var14 + 0.5F) - var16;
                     var16 -= var15;

                     int var83;
                     for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
                        this.method4672(field7104, var83, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var31;
                        var12 += var30;
                        var83 += field7102;
                     }

                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var83, var10, 0, (int)var11, (int)var13, var8, var28);
                        var11 += var31;
                        var13 += var32;
                        var83 += field7102;
                        var8 += var29;
                     }
                  }
               } else {
                  var13 = var12;
                  if (var15 < 0.0F) {
                     var13 = var12 - var31 * var15;
                     var12 -= var30 * var15;
                     var15 = 0.0F;
                  }

                  if (var14 < 0.0F) {
                     var11 -= var32 * var14;
                     var14 = 0.0F;
                  }

                  var15 = (int)(var15 + 0.5F);
                  var14 = (int)(var14 + 0.5F);
                  var16 = (int)(var16 + 0.5F) - var14;
                  var14 -= var15;
                  int var82 = var33[(int)var15];
                  if (var31 < var30) {
                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var13, (int)var12, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var11, (int)var12, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }
                  } else {
                     while (--var14 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var12, (int)var13, var8, var28);
                        var13 += var31;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }

                     while (--var16 >= 0.0F) {
                        this.method4672(field7104, var82, var10, 0, (int)var12, (int)var11, var8, var28);
                        var11 += var32;
                        var12 += var30;
                        var82 += field7102;
                        var8 += var29;
                     }
                  }
               }
            }
         } else if (!(var16 >= var34)) {
            if (var14 > var34) {
               var14 = var34;
            }

            if (var15 > var34) {
               var15 = var34;
            }

            var9 = this.method4666(var6, var3, var9, var28, var29);
            if (var14 < var15) {
               var12 = var13;
               if (var16 < 0.0F) {
                  var12 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var14 < 0.0F) {
                  var11 -= var31 * var14;
                  var14 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var14 = (int)(var14 + 0.5F);
               var15 = (int)(var15 + 0.5F) - var14;
               var14 -= var16;
               int var81 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += field7102;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var12, (int)var11, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += field7102;
                     var9 += var29;
                  }
               } else {
                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var30;
                     var13 += var32;
                     var81 += field7102;
                     var9 += var29;
                  }

                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var81, var10, 0, (int)var11, (int)var12, var9, var28);
                     var12 += var30;
                     var11 += var31;
                     var81 += field7102;
                     var9 += var29;
                  }
               }
            } else {
               var11 = var13;
               if (var16 < 0.0F) {
                  var11 = var13 - var30 * var16;
                  var13 -= var32 * var16;
                  var16 = 0.0F;
               }

               if (var15 < 0.0F) {
                  var12 -= var31 * var15;
                  var15 = 0.0F;
               }

               var16 = (int)(var16 + 0.5F);
               var15 = (int)(var15 + 0.5F);
               var14 = (int)(var14 + 0.5F) - var15;
               var15 -= var16;
               int var35 = var33[(int)var16];
               if (var30 < var32) {
                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var11, (int)var13, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var12, (int)var13, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }
               } else {
                  while (--var15 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var13, (int)var11, var9, var28);
                     var11 += var30;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }

                  while (--var14 >= 0.0F) {
                     this.method4672(field7104, var35, var10, 0, (int)var13, (int)var12, var9, var28);
                     var12 += var31;
                     var13 += var32;
                     var35 += field7102;
                     var9 += var29;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("dw")
   final void method4680(
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
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
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - this.field2378.field2232;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (this.field2376) {
            while (var20-- > 0) {
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               this.method4640(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               this.method4644(var1, field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("bv")
   final void method4652(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method4634(var1, var2, var3, var4, var5, method4632(var2[var3], var5));
   }

   @ObfuscatedSignature(descriptor = "([I[FIIIF)V")
   @ObfuscatedName("cw")
   final void method4660(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var1[var3];
      var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var8 = this.field2378.field2232 & method4630(var2[var3], var6);
      var1[var3] = (var8 & var4) + (~var8 & var7);
   }

   @ObfuscatedSignature(descriptor = "([I[F[IIIIIF)V")
   @ObfuscatedName("bd")
   final void method4648(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
      if (var9 != 0) {
         var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
         int var10 = var1[var4];
         var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
         int var11 = this.field2378.field2234 & method4630(var2[var4], var8);
         var1[var4] = (var11 & var9) + (~var11 & var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[FIIF)V")
   @ObfuscatedName("bl")
   final void method4653(int[] var1, float[] var2, int var3, int var4, float var5) {
      this.method4633(var1, var2, var3, var4, var5, method4630(var2[var3], var5));
   }
}
