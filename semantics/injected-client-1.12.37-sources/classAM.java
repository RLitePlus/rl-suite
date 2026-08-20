import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("am")
public class classAM extends classAH {
   @ObfuscatedName("ae")
   int field223;
   @ObfuscatedName("af")
   int field228;
   @ObfuscatedName("aa")
   int field229;
   @ObfuscatedName("ab")
   int field224;
   @ObfuscatedName("ag")
   int field226;
   @ObfuscatedName("as")
   int field235;
   @ObfuscatedName("ax")
   int field236;
   @ObfuscatedName("ac")
   int field231;
   @ObfuscatedName("al")
   boolean field227;
   @ObfuscatedName("ao")
   int field225;
   @ObfuscatedName("aq")
   int field234;
   @ObfuscatedName("aj")
   int field233;
   @ObfuscatedName("ay")
   int field237;
   @ObfuscatedName("az")
   int field230;
   @ObfuscatedName("ad")
   int field232;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method607() {
      return super.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;)Z")
   @ObfuscatedName("bg")
   public static boolean method604(classAM var0) {
      if (var0 == null) {
         var0.method534();
      }

      int var1 = var0.field223;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method459(var1, var0.field224);
         var3 = method462(var1, var0.field224);
      }

      if (var0.field226 == var1 && var0.field235 == var2 && var0.field236 == var3) {
         if (var0.field223 == Integer.MIN_VALUE) {
            var0.field223 = 0;
            var0.field236 = 0;
            var0.field235 = 0;
            var0.field226 = 0;
            var0.vmethod398();
            return true;
         } else {
            var0.method537();
            return false;
         }
      } else {
         if (var0.field226 < var1) {
            var0.field237 = 1;
            var0.field233 = var1 - var0.field226;
         } else if (var0.field226 > var1) {
            var0.field237 = -1;
            var0.field233 = var0.field226 - var1;
         } else {
            var0.field237 = 0;
         }

         if (var0.field235 < var2) {
            var0.field234 = 1;
            if (var0.field233 == 0 || var0.field233 > var2 - var0.field235) {
               var0.field233 = var2 - var0.field235;
            }
         } else if (var0.field235 > var2) {
            var0.field234 = -1;
            if (var0.field233 == 0 || var0.field233 > var0.field235 - var2) {
               var0.field233 = var0.field235 - var2;
            }
         } else {
            var0.field234 = 0;
         }

         if (var0.field236 < var3) {
            var0.field232 = 1;
            if (var0.field233 == 0 || var0.field233 > var3 - var0.field236) {
               var0.field233 = var3 - var0.field236;
            }
         } else if (var0.field236 > var3) {
            var0.field232 = -1;
            if (var0.field233 == 0 || var0.field233 > var0.field236 - var3) {
               var0.field233 = var0.field236 - var3;
            }
         } else {
            var0.field232 = 0;
         }

         return false;
      }
   }

   classAM(classAJ var1, int var2, int var3, int var4) {
      this.field153 = var1;
      this.field229 = var1.field192;
      this.field225 = var1.field191;
      this.field227 = var1.field190;
      this.field228 = var2;
      this.field223 = var3;
      this.field224 = var4;
      this.field230 = 0;
      this.method537();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   boolean method605() {
      int var1 = this.field223;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method459(var1, this.field224);
         var3 = method462(var1, this.field224);
      }

      if (this.field226 == var1 && this.field235 == var2 && this.field236 == var3) {
         if (this.field223 == Integer.MIN_VALUE) {
            this.field223 = 0;
            this.field236 = 0;
            this.field235 = 0;
            this.field226 = 0;
            this.vmethod398();
            return true;
         } else {
            this.method537();
            return false;
         }
      } else {
         if (this.field226 < var1) {
            this.field237 = 1;
            this.field233 = var1 - this.field226;
         } else if (this.field226 > var1) {
            this.field237 = -1;
            this.field233 = this.field226 - var1;
         } else {
            this.field237 = 0;
         }

         if (this.field235 < var2) {
            this.field234 = 1;
            if (this.field233 == 0 || this.field233 > var2 - this.field235) {
               this.field233 = var2 - this.field235;
            }
         } else if (this.field235 > var2) {
            this.field234 = -1;
            if (this.field233 == 0 || this.field233 > this.field235 - var2) {
               this.field233 = this.field235 - var2;
            }
         } else {
            this.field234 = 0;
         }

         if (this.field236 < var3) {
            this.field232 = 1;
            if (this.field233 == 0 || this.field233 > var3 - this.field236) {
               this.field233 = var3 - this.field236;
            }
         } else if (this.field236 > var3) {
            this.field232 = -1;
            if (this.field233 == 0 || this.field233 > this.field236 - var3) {
               this.field233 = this.field236 - var3;
            }
         } else {
            this.field232 = 0;
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   static int method462(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   @Override
   public synchronized void vmethod38(int[] var1, int var2, int var3) {
      if (this.field223 == 0 && this.field233 == 0) {
         this.vmethod31(var3);
      } else {
         classAJ var4 = (classAJ)this.field153;
         int var5 = this.field229 << 8;
         int var6 = this.field225 << 8;
         int var7 = var4.field189.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field231 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field230 < 0) {
            if (this.field228 <= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = 0;
         }

         if (this.field230 >= var7) {
            if (this.field228 >= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = var7 - 1;
         }

         if (this.field231 < 0) {
            if (this.field227) {
               if (this.field228 < 0) {
                  var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }

               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var6 + var6 - 1 - this.field230;
                  this.field228 = -this.field228;
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }
            } else if (this.field228 < 0) {
               while (true) {
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var6 - 1 - (var6 - 1 - this.field230) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var5 + (this.field230 - var5) % var8;
               }
            }
         } else {
            if (this.field231 > 0) {
               label175:
               if (this.field227) {
                  if (this.field228 < 0) {
                     var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break label175;
                     }
                  }

                  do {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 < var6) {
                        return;
                     }

                     this.field230 = var6 + var6 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break;
                     }

                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                  } while (--this.field231 != 0);
               } else if (this.field228 < 0) {
                  while (true) {
                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.field230) / var8;
                     if (var13 >= this.field231) {
                        this.field230 = this.field230 + var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 += var8 * var13;
                     this.field231 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                     if (this.field230 < var6) {
                        return;
                     }

                     int var10 = (this.field230 - var5) / var8;
                     if (var10 >= this.field231) {
                        this.field230 = this.field230 - var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 -= var8 * var10;
                     this.field231 -= var10;
                  }
               }
            }

            if (this.field228 < 0) {
               this.method598(var1, var9, 0, var3, 0);
               if (this.field230 < 0) {
                  this.field230 = -1;
                  this.method568();
                  this.vmethod398();
               }
            } else {
               this.method596(var1, var9, var7, var3, 0);
               if (this.field230 >= var7) {
                  this.field230 = var7;
                  this.method568();
                  this.vmethod398();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   synchronized void method553(int var1) {
      this.method542(var1, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dh")
   static int method493(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;Z)I")
   @ObfuscatedName("ao")
   static int method477(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, boolean var11) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("aj")
   static int method481(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;)Ljava/lang/String;")
   @ObfuscatedName("kc")
   public static String method608(classAM var0) {
      if (var0 == null) {
         var0.method594();
      }

      return var0.toString();
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;)I")
   @ObfuscatedName("ay")
   static int method484(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("aq")
   static int method488(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("ad")
   static int method494(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("ap")
   static int method498(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("au")
   static int method504(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("ar")
   static int method511(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;)Z")
   @ObfuscatedName("an")
   public static boolean method593(classAM var0) {
      return var0.field233 != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ei")
   public synchronized void method562(int var1) {
      int var2 = ((classAJ)this.field153).field189.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field230 = var1;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILam;)I")
   @ObfuscatedName("aw")
   static int method515(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classAM var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field235 = var9.field235 + var9.field234 * (var6 - var3);
      var9.field236 = var9.field236 + var9.field232 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field226 = var4 >> 2;
      var9.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bx")
   @Override
   public synchronized void vmethod36(int[] var1, int var2, int var3) {
      if (this.field223 == 0 && this.field233 == 0) {
         this.vmethod31(var3);
      } else {
         classAJ var4 = (classAJ)this.field153;
         int var5 = this.field229 << 8;
         int var6 = this.field225 << 8;
         int var7 = var4.field189.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field231 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field230 < 0) {
            if (this.field228 <= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = 0;
         }

         if (this.field230 >= var7) {
            if (this.field228 >= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = var7 - 1;
         }

         if (this.field231 < 0) {
            if (this.field227) {
               if (this.field228 < 0) {
                  var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }

               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var6 + var6 - 1 - this.field230;
                  this.field228 = -this.field228;
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }
            } else if (this.field228 < 0) {
               while (true) {
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var6 - 1 - (var6 - 1 - this.field230) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var5 + (this.field230 - var5) % var8;
               }
            }
         } else {
            if (this.field231 > 0) {
               label179:
               if (this.field227) {
                  if (this.field228 < 0) {
                     var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break label179;
                     }
                  }

                  do {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 < var6) {
                        return;
                     }

                     this.field230 = var6 + var6 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break;
                     }

                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                  } while (--this.field231 != 0);
               } else if (this.field228 < 0) {
                  while (true) {
                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.field230) / var8;
                     if (var13 >= this.field231) {
                        this.field230 = this.field230 + var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 += var8 * var13;
                     this.field231 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                     if (this.field230 < var6) {
                        return;
                     }

                     int var10 = (this.field230 - var5) / var8;
                     if (var10 >= this.field231) {
                        this.field230 = this.field230 - var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 -= var8 * var10;
                     this.field231 -= var10;
                  }
               }
            }

            if (this.field228 < 0) {
               this.method598(var1, var9, 0, var3, 0);
               if (this.field230 < 0) {
                  this.field230 = -1;
                  this.method568();
                  this.vmethod398();
               }
            } else {
               this.method596(var1, var9, var7, var3, 0);
               if (this.field230 >= var7) {
                  this.field230 = var7;
                  this.method568();
                  this.vmethod398();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   void method534() {
      this.field226 = this.field223;
      this.field235 = method459(this.field223, this.field224);
      this.field236 = method462(this.field223, this.field224);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   public synchronized int method557() {
      return this.field224 < 0 ? -1 : this.field224;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("bg")
   static int method529(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      var11.field235 = var11.field235 - var11.field234 * var5;
      var11.field236 = var11.field236 - var11.field232 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field235 = var11.field235 + var11.field234 * var5;
      var11.field236 = var11.field236 + var11.field232 * var5;
      var11.field226 = var6;
      var11.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method610(int var1) {
      this.method539(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;II)Lam;")
   @ObfuscatedName("cn")
   public static classAM method466(classAJ var0, int var1, int var2) {
      return var0.field189 != null && var0.field189.length != 0
         ? new classAM(var0, (int)(var0.field187 * 256L * var1 / (WidgetConfigNode.field4138 * -1793241970)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bi")
   @Override
   int vmethod26() {
      int var1 = this.field226 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field231 == 0) {
         var1 -= var1 * this.field230 / (((classAJ)this.field153).field189.length << 8);
      } else if (this.field231 >= 0) {
         var1 -= var1 * this.field229 / ((classAJ)this.field153).field189.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dl")
   static int method505(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 700351937 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 1506922544) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(Laj;II)Lam;")
   @ObfuscatedName("ae")
   public static classAM method467(classAJ var0, int var1, int var2) {
      return var0.field189 != null && var0.field189.length != 0
         ? new classAM(var0, (int)(var0.field187 * 256L * var1 / (WidgetConfigNode.field4138 * -1211797836)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ee")
   synchronized void method542(int var1, int var2) {
      this.field223 = var1;
      this.field224 = var2;
      this.field233 = 0;
      this.method537();
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fc")
   public synchronized void method575(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method542(var2, var3);
      } else {
         int var4 = method459(var2, var3);
         int var5 = method462(var2, var3);
         if (this.field235 == var4 && this.field236 == var5) {
            this.field233 = 0;
         } else {
            int var6 = var2 - this.field226;
            if (this.field226 - var2 > var6) {
               var6 = this.field226 - var2;
            }

            if (var4 - this.field235 > var6) {
               var6 = var4 - this.field235;
            }

            if (this.field235 - var4 > var6) {
               var6 = this.field235 - var4;
            }

            if (var5 - this.field236 > var6) {
               var6 = var5 - this.field236;
            }

            if (this.field236 - var5 > var6) {
               var6 = this.field236 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field233 = var1;
            this.field223 = var2;
            this.field224 = var3;
            this.field237 = (var2 - this.field226) / var1;
            this.field234 = (var4 - this.field235) / var1;
            this.field232 = (var5 - this.field236) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ez")
   public synchronized void method547(int var1) {
      this.method542(var1 << 6, this.method558());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   public synchronized int method544() {
      return this.field223 == Integer.MIN_VALUE ? 0 : this.field223 + 32 >> 6;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fo")
   public synchronized void method586(int var1) {
      if (this.field228 < 0) {
         this.field228 = -var1;
      } else {
         this.field228 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public synchronized int method558() {
      return this.field224 < 0 ? -1 : this.field224;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("bt")
   static int method524(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fp")
   public synchronized void method564(boolean var1) {
      this.field228 = (this.field228 ^ this.field228 >> 31) + (this.field228 >>> 31);
      if (var1) {
         this.field228 = -this.field228;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   void method568() {
      if (this.field233 != 0) {
         if (this.field223 == Integer.MIN_VALUE) {
            this.field223 = 0;
         }

         this.field233 = 0;
         this.method537();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   public synchronized void method571(int var1, int var2) {
      this.method576(var1, var2, this.method558());
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bz")
   public synchronized void method576(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method542(var2, var3);
      } else {
         int var4 = method459(var2, var3);
         int var5 = method462(var2, var3);
         if (this.field235 == var4 && this.field236 == var5) {
            this.field233 = 0;
         } else {
            int var6 = var2 - this.field226;
            if (this.field226 - var2 > var6) {
               var6 = this.field226 - var2;
            }

            if (var4 - this.field235 > var6) {
               var6 = var4 - this.field235;
            }

            if (this.field235 - var4 > var6) {
               var6 = this.field235 - var4;
            }

            if (var5 - this.field236 > var6) {
               var6 = var5 - this.field236;
            }

            if (this.field236 - var5 > var6) {
               var6 = this.field236 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field233 = var1;
            this.field223 = var2;
            this.field224 = var3;
            this.field237 = (var2 - this.field226) / var1;
            this.field234 = (var4 - this.field235) / var1;
            this.field232 = (var5 - this.field236) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ep")
   public synchronized int method545() {
      return this.field223 == Integer.MIN_VALUE ? 0 : this.field223 + 32 >> 6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dw")
   static int method495(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 817402884) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fm")
   public synchronized void method587(int var1) {
      if (this.field228 < 0) {
         this.field228 = -var1;
      } else {
         this.field228 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ct")
   public boolean method590() {
      return this.field230 < 0 || this.field230 >= ((classAJ)this.field153).field189.length << 8;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cp")
   public boolean method594() {
      return this.field233 != 0;
   }

   classAM(classAJ var1, int var2, int var3) {
      this.field153 = var1;
      this.field229 = var1.field192;
      this.field225 = var1.field191;
      this.field227 = var1.field190;
      this.field228 = var2;
      this.field223 = var3;
      this.field224 = 8192;
      this.field230 = 0;
      this.method537();
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ax")
   @Override
   protected classAH vmethod35() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   protected int vmethod32() {
      return this.field223 == 0 && this.field233 == 0 ? 0 : 1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("aa")
   @Override
   public synchronized void vmethod30(int[] var1, int var2, int var3) {
      if (this.field223 == 0 && this.field233 == 0) {
         this.vmethod31(var3);
      } else {
         classAJ var4 = (classAJ)this.field153;
         int var5 = this.field229 << 8;
         int var6 = this.field225 << 8;
         int var7 = var4.field189.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field231 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field230 < 0) {
            if (this.field228 <= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = 0;
         }

         if (this.field230 >= var7) {
            if (this.field228 >= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = var7 - 1;
         }

         if (this.field231 < 0) {
            if (this.field227) {
               if (this.field228 < 0) {
                  var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }

               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var6 + var6 - 1 - this.field230;
                  this.field228 = -this.field228;
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }
            } else if (this.field228 < 0) {
               while (true) {
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var6 - 1 - (var6 - 1 - this.field230) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var5 + (this.field230 - var5) % var8;
               }
            }
         } else {
            if (this.field231 > 0) {
               label187:
               if (this.field227) {
                  if (this.field228 < 0) {
                     var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break label187;
                     }
                  }

                  do {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 < var6) {
                        return;
                     }

                     this.field230 = var6 + var6 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break;
                     }

                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                  } while (--this.field231 != 0);
               } else if (this.field228 < 0) {
                  while (true) {
                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.field230) / var8;
                     if (var13 >= this.field231) {
                        this.field230 = this.field230 + var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 += var8 * var13;
                     this.field231 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                     if (this.field230 < var6) {
                        return;
                     }

                     int var10 = (this.field230 - var5) / var8;
                     if (var10 >= this.field231) {
                        this.field230 = this.field230 - var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 -= var8 * var10;
                     this.field231 -= var10;
                  }
               }
            }

            if (this.field228 < 0) {
               this.method598(var1, var9, 0, var3, 0);
               if (this.field230 < 0) {
                  this.field230 = -1;
                  this.method568();
                  this.vmethod398();
               }
            } else {
               this.method596(var1, var9, var7, var3, 0);
               if (this.field230 >= var7) {
                  this.field230 = var7;
                  this.method568();
                  this.vmethod398();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   public synchronized void vmethod31(int var1) {
      if (this.field233 > 0) {
         if (var1 >= this.field233) {
            if (this.field223 == Integer.MIN_VALUE) {
               this.field223 = 0;
               this.field236 = 0;
               this.field235 = 0;
               this.field226 = 0;
               this.vmethod398();
               var1 = this.field233;
            }

            this.field233 = 0;
            this.method537();
         } else {
            this.field226 = this.field226 + this.field237 * var1;
            this.field235 = this.field235 + this.field234 * var1;
            this.field236 = this.field236 + this.field232 * var1;
            this.field233 -= var1;
         }
      }

      classAJ var2 = (classAJ)this.field153;
      int var3 = this.field229 << 8;
      int var4 = this.field225 << 8;
      int var5 = var2.field189.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field231 = 0;
      }

      if (this.field230 < 0) {
         if (this.field228 <= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = 0;
      }

      if (this.field230 >= var5) {
         if (this.field228 >= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = var5 - 1;
      }

      this.field230 = this.field230 + this.field228 * var1;
      if (this.field231 < 0) {
         if (!this.field227) {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var4 - 1 - (var4 - 1 - this.field230) % var6;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               this.field230 = var3 + (this.field230 - var3) % var6;
            }
         } else {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }

            while (this.field230 >= var4) {
               this.field230 = var4 + var4 - 1 - this.field230;
               this.field228 = -this.field228;
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }
         }
      } else {
         if (this.field231 > 0) {
            label175:
            if (this.field227) {
               if (this.field228 < 0) {
                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break label175;
                  }
               }

               do {
                  if (this.field230 < var4) {
                     return;
                  }

                  this.field230 = var4 + var4 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break;
                  }

                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
               } while (--this.field231 != 0);
            } else if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field230) / var6;
               if (var7 < this.field231) {
                  this.field230 += var6 * var7;
                  this.field231 -= var7;
                  return;
               }

               this.field230 = this.field230 + var6 * this.field231;
               this.field231 = 0;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               int var8 = (this.field230 - var3) / var6;
               if (var8 < this.field231) {
                  this.field230 -= var6 * var8;
                  this.field231 -= var8;
                  return;
               }

               this.field230 = this.field230 - var6 * this.field231;
               this.field231 = 0;
            }
         }

         if (this.field228 < 0) {
            if (this.field230 < 0) {
               this.field230 = -1;
               this.method568();
               this.vmethod398();
            }
         } else if (this.field230 >= var5) {
            this.field230 = var5;
            this.method568();
            this.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("cq")
   int method596(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == 256 && (this.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method511(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method508(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method524(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method523(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == 256 && (this.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method477(
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               0,
               var4,
               var3,
               this,
               ((classAJ)this.field153).method399()
            )
            : method475(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method494(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method488(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("cl")
   int method598(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method517(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method515(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method531(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method529(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method484(0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this)
            : method481(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method504(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method498(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public synchronized int method583() {
      return this.field228 < 0 ? -this.field228 : this.field228;
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gc")
   int method597(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == 256 && (this.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method511(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method508(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method524(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method523(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == 256 && (this.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method477(
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               0,
               var4,
               var3,
               this,
               ((classAJ)this.field153).method399()
            )
            : method475(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method494(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method488(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("at")
   @Override
   protected classAH vmethod27() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Laj;II)Lam;")
   @ObfuscatedName("ch")
   public static classAM method468(classAJ var0, int var1, int var2) {
      return var0.field189 != null && var0.field189.length != 0
         ? new classAM(var0, (int)(var0.field187 * 256L * var1 / (WidgetConfigNode.field4138 * -1211797836)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("am")
   @Override
   protected classAH vmethod44() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Laj;III)Lam;")
   @ObfuscatedName("ab")
   public static classAM method470(classAJ var0, int var1, int var2, int var3) {
      return var0.field189 != null && var0.field189.length != 0 ? new classAM(var0, var1, var2, var3) : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   @Override
   protected int vmethod28() {
      return this.field223 == 0 && this.field233 == 0 ? 0 : 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fz")
   public synchronized int method559() {
      return this.field224 < 0 ? -1 : this.field224;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bc")
   @Override
   public synchronized void vmethod37(int[] var1, int var2, int var3) {
      if (this.field223 == 0 && this.field233 == 0) {
         this.vmethod31(var3);
      } else {
         classAJ var4 = (classAJ)this.field153;
         int var5 = this.field229 << 8;
         int var6 = this.field225 << 8;
         int var7 = var4.field189.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field231 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field230 < 0) {
            if (this.field228 <= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = 0;
         }

         if (this.field230 >= var7) {
            if (this.field228 >= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = var7 - 1;
         }

         if (this.field231 < 0) {
            if (this.field227) {
               if (this.field228 < 0) {
                  var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }

               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var6 + var6 - 1 - this.field230;
                  this.field228 = -this.field228;
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }
            } else if (this.field228 < 0) {
               while (true) {
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var6 - 1 - (var6 - 1 - this.field230) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var5 + (this.field230 - var5) % var8;
               }
            }
         } else {
            if (this.field231 > 0) {
               label180:
               if (this.field227) {
                  if (this.field228 < 0) {
                     var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break label180;
                     }
                  }

                  do {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 < var6) {
                        return;
                     }

                     this.field230 = var6 + var6 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break;
                     }

                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                  } while (--this.field231 != 0);
               } else if (this.field228 < 0) {
                  while (true) {
                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.field230) / var8;
                     if (var13 >= this.field231) {
                        this.field230 = this.field230 + var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 += var8 * var13;
                     this.field231 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                     if (this.field230 < var6) {
                        return;
                     }

                     int var10 = (this.field230 - var5) / var8;
                     if (var10 >= this.field231) {
                        this.field230 = this.field230 - var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 -= var8 * var10;
                     this.field231 -= var10;
                  }
               }
            }

            if (this.field228 < 0) {
               this.method598(var1, var9, 0, var3, 0);
               if (this.field230 < 0) {
                  this.field230 = -1;
                  this.method568();
                  this.vmethod398();
               }
            } else {
               this.method596(var1, var9, var7, var3, 0);
               if (this.field230 >= var7) {
                  this.field230 = var7;
                  this.method568();
                  this.vmethod398();
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dg")
   static int method506(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("br")
   @Override
   public synchronized void vmethod39(int[] var1, int var2, int var3) {
      if (this.field223 == 0 && this.field233 == 0) {
         this.vmethod31(var3);
      } else {
         classAJ var4 = (classAJ)this.field153;
         int var5 = this.field229 << 8;
         int var6 = this.field225 << 8;
         int var7 = var4.field189.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field231 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field230 < 0) {
            if (this.field228 <= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = 0;
         }

         if (this.field230 >= var7) {
            if (this.field228 >= 0) {
               this.method568();
               this.vmethod398();
               return;
            }

            this.field230 = var7 - 1;
         }

         if (this.field231 < 0) {
            if (this.field227) {
               if (this.field228 < 0) {
                  var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }

               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var6 + var6 - 1 - this.field230;
                  this.field228 = -this.field228;
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var5 + var5 - 1 - this.field230;
                  this.field228 = -this.field228;
               }
            } else if (this.field228 < 0) {
               while (true) {
                  var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                  if (this.field230 >= var5) {
                     return;
                  }

                  this.field230 = var6 - 1 - (var6 - 1 - this.field230) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                  if (this.field230 < var6) {
                     return;
                  }

                  this.field230 = var5 + (this.field230 - var5) % var8;
               }
            }
         } else {
            if (this.field231 > 0) {
               label184:
               if (this.field227) {
                  if (this.field228 < 0) {
                     var9 = this.method598(var1, var2, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break label184;
                     }
                  }

                  do {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 < var6) {
                        return;
                     }

                     this.field230 = var6 + var6 - 1 - this.field230;
                     this.field228 = -this.field228;
                     if (--this.field231 == 0) {
                        break;
                     }

                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field229]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     this.field230 = var5 + var5 - 1 - this.field230;
                     this.field228 = -this.field228;
                  } while (--this.field231 != 0);
               } else if (this.field228 < 0) {
                  while (true) {
                     var9 = this.method598(var1, var9, var5, var3, var4.field189[this.field225 - 1]);
                     if (this.field230 >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.field230) / var8;
                     if (var13 >= this.field231) {
                        this.field230 = this.field230 + var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 += var8 * var13;
                     this.field231 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method596(var1, var9, var6, var3, var4.field189[this.field229]);
                     if (this.field230 < var6) {
                        return;
                     }

                     int var10 = (this.field230 - var5) / var8;
                     if (var10 >= this.field231) {
                        this.field230 = this.field230 - var8 * this.field231;
                        this.field231 = 0;
                        break;
                     }

                     this.field230 -= var8 * var10;
                     this.field231 -= var10;
                  }
               }
            }

            if (this.field228 < 0) {
               this.method598(var1, var9, 0, var3, 0);
               if (this.field230 < 0) {
                  this.field230 = -1;
                  this.method568();
                  this.vmethod398();
               }
            } else {
               this.method596(var1, var9, var7, var3, 0);
               if (this.field230 >= var7) {
                  this.field230 = var7;
                  this.method568();
                  this.vmethod398();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   @Override
   public synchronized void vmethod40(int var1) {
      if (this.field233 > 0) {
         if (var1 >= this.field233) {
            if (this.field223 == Integer.MIN_VALUE) {
               this.field223 = 0;
               this.field236 = 0;
               this.field235 = 0;
               this.field226 = 0;
               this.vmethod398();
               var1 = this.field233;
            }

            this.field233 = 0;
            this.method537();
         } else {
            this.field226 = this.field226 + this.field237 * var1;
            this.field235 = this.field235 + this.field234 * var1;
            this.field236 = this.field236 + this.field232 * var1;
            this.field233 -= var1;
         }
      }

      classAJ var2 = (classAJ)this.field153;
      int var3 = this.field229 << 8;
      int var4 = this.field225 << 8;
      int var5 = var2.field189.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field231 = 0;
      }

      if (this.field230 < 0) {
         if (this.field228 <= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = 0;
      }

      if (this.field230 >= var5) {
         if (this.field228 >= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = var5 - 1;
      }

      this.field230 = this.field230 + this.field228 * var1;
      if (this.field231 < 0) {
         if (!this.field227) {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var4 - 1 - (var4 - 1 - this.field230) % var6;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               this.field230 = var3 + (this.field230 - var3) % var6;
            }
         } else {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }

            while (this.field230 >= var4) {
               this.field230 = var4 + var4 - 1 - this.field230;
               this.field228 = -this.field228;
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }
         }
      } else {
         if (this.field231 > 0) {
            label175:
            if (this.field227) {
               if (this.field228 < 0) {
                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break label175;
                  }
               }

               do {
                  if (this.field230 < var4) {
                     return;
                  }

                  this.field230 = var4 + var4 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break;
                  }

                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
               } while (--this.field231 != 0);
            } else if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field230) / var6;
               if (var7 < this.field231) {
                  this.field230 += var6 * var7;
                  this.field231 -= var7;
                  return;
               }

               this.field230 = this.field230 + var6 * this.field231;
               this.field231 = 0;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               int var8 = (this.field230 - var3) / var6;
               if (var8 < this.field231) {
                  this.field230 -= var6 * var8;
                  this.field231 -= var8;
                  return;
               }

               this.field230 = this.field230 - var6 * this.field231;
               this.field231 = 0;
            }
         }

         if (this.field228 < 0) {
            if (this.field230 < 0) {
               this.field230 = -1;
               this.method568();
               this.vmethod398();
            }
         } else if (this.field230 >= var5) {
            this.field230 = var5;
            this.method568();
            this.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   @Override
   public synchronized void vmethod41(int var1) {
      if (this.field233 > 0) {
         if (var1 >= this.field233) {
            if (this.field223 == Integer.MIN_VALUE) {
               this.field223 = 0;
               this.field236 = 0;
               this.field235 = 0;
               this.field226 = 0;
               this.vmethod398();
               var1 = this.field233;
            }

            this.field233 = 0;
            this.method537();
         } else {
            this.field226 = this.field226 + this.field237 * var1;
            this.field235 = this.field235 + this.field234 * var1;
            this.field236 = this.field236 + this.field232 * var1;
            this.field233 -= var1;
         }
      }

      classAJ var2 = (classAJ)this.field153;
      int var3 = this.field229 << 8;
      int var4 = this.field225 << 8;
      int var5 = var2.field189.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field231 = 0;
      }

      if (this.field230 < 0) {
         if (this.field228 <= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = 0;
      }

      if (this.field230 >= var5) {
         if (this.field228 >= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = var5 - 1;
      }

      this.field230 = this.field230 + this.field228 * var1;
      if (this.field231 < 0) {
         if (!this.field227) {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var4 - 1 - (var4 - 1 - this.field230) % var6;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               this.field230 = var3 + (this.field230 - var3) % var6;
            }
         } else {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }

            while (this.field230 >= var4) {
               this.field230 = var4 + var4 - 1 - this.field230;
               this.field228 = -this.field228;
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }
         }
      } else {
         if (this.field231 > 0) {
            label179:
            if (this.field227) {
               if (this.field228 < 0) {
                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break label179;
                  }
               }

               do {
                  if (this.field230 < var4) {
                     return;
                  }

                  this.field230 = var4 + var4 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break;
                  }

                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
               } while (--this.field231 != 0);
            } else if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field230) / var6;
               if (var7 < this.field231) {
                  this.field230 += var6 * var7;
                  this.field231 -= var7;
                  return;
               }

               this.field230 = this.field230 + var6 * this.field231;
               this.field231 = 0;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               int var8 = (this.field230 - var3) / var6;
               if (var8 < this.field231) {
                  this.field230 -= var6 * var8;
                  this.field231 -= var8;
                  return;
               }

               this.field230 = this.field230 - var6 * this.field231;
               this.field231 = 0;
            }
         }

         if (this.field228 < 0) {
            if (this.field230 < 0) {
               this.field230 = -1;
               this.method568();
               this.vmethod398();
            }
         } else if (this.field230 >= var5) {
            this.field230 = var5;
            this.method568();
            this.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   @Override
   public synchronized void vmethod42(int var1) {
      if (this.field233 > 0) {
         if (var1 >= this.field233) {
            if (this.field223 == Integer.MIN_VALUE) {
               this.field223 = 0;
               this.field236 = 0;
               this.field235 = 0;
               this.field226 = 0;
               this.vmethod398();
               var1 = this.field233;
            }

            this.field233 = 0;
            this.method537();
         } else {
            this.field226 = this.field226 + this.field237 * var1;
            this.field235 = this.field235 + this.field234 * var1;
            this.field236 = this.field236 + this.field232 * var1;
            this.field233 -= var1;
         }
      }

      classAJ var2 = (classAJ)this.field153;
      int var3 = this.field229 << 8;
      int var4 = this.field225 << 8;
      int var5 = var2.field189.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field231 = 0;
      }

      if (this.field230 < 0) {
         if (this.field228 <= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = 0;
      }

      if (this.field230 >= var5) {
         if (this.field228 >= 0) {
            this.method568();
            this.vmethod398();
            return;
         }

         this.field230 = var5 - 1;
      }

      this.field230 = this.field230 + this.field228 * var1;
      if (this.field231 < 0) {
         if (!this.field227) {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var4 - 1 - (var4 - 1 - this.field230) % var6;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               this.field230 = var3 + (this.field230 - var3) % var6;
            }
         } else {
            if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }

            while (this.field230 >= var4) {
               this.field230 = var4 + var4 - 1 - this.field230;
               this.field228 = -this.field228;
               if (this.field230 >= var3) {
                  return;
               }

               this.field230 = var3 + var3 - 1 - this.field230;
               this.field228 = -this.field228;
            }
         }
      } else {
         if (this.field231 > 0) {
            label177:
            if (this.field227) {
               if (this.field228 < 0) {
                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break label177;
                  }
               }

               do {
                  if (this.field230 < var4) {
                     return;
                  }

                  this.field230 = var4 + var4 - 1 - this.field230;
                  this.field228 = -this.field228;
                  if (--this.field231 == 0) {
                     break;
                  }

                  if (this.field230 >= var3) {
                     return;
                  }

                  this.field230 = var3 + var3 - 1 - this.field230;
                  this.field228 = -this.field228;
               } while (--this.field231 != 0);
            } else if (this.field228 < 0) {
               if (this.field230 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field230) / var6;
               if (var7 < this.field231) {
                  this.field230 += var6 * var7;
                  this.field231 -= var7;
                  return;
               }

               this.field230 = this.field230 + var6 * this.field231;
               this.field231 = 0;
            } else {
               if (this.field230 < var4) {
                  return;
               }

               int var8 = (this.field230 - var3) / var6;
               if (var8 < this.field231) {
                  this.field230 -= var6 * var8;
                  this.field231 -= var8;
                  return;
               }

               this.field230 = this.field230 - var6 * this.field231;
               this.field231 = 0;
            }
         }

         if (this.field228 < 0) {
            if (this.field230 < 0) {
               this.field230 = -1;
               this.method568();
               this.vmethod398();
            }
         } else if (this.field230 >= var5) {
            this.field230 = var5;
            this.method568();
            this.vmethod398();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cv")
   static int method457(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((1636679479 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("an")
   @Override
   protected classAH vmethod33() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cy")
   static int method458(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public synchronized int method550() {
      return this.field223 == Integer.MIN_VALUE ? 0 : this.field223;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ck")
   static int method463(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ca")
   static int method464(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cc")
   static int method465(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;)V")
   @ObfuscatedName("cq")
   public static void method569(classAM var0) {
      if (var0 == null) {
         var0.method536();
      }

      if (var0.field233 != 0) {
         if (var0.field223 == Integer.MIN_VALUE) {
            var0.field223 = 0;
         }

         var0.field233 = 0;
         var0.method537();
      }
   }

   @ObfuscatedSignature(descriptor = "(Laj;II)Lam;")
   @ObfuscatedName("cf")
   public static classAM method469(classAJ var0, int var1, int var2) {
      return var0.field189 != null && var0.field189.length != 0
         ? new classAM(var0, (int)(var0.field187 * 256L * var1 / (WidgetConfigNode.field4138 * -1211797836)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILam;)I")
   @ObfuscatedName("ai")
   static int method508(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classAM var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field235 = var9.field235 + var9.field234 * (var6 - var3);
      var9.field236 = var9.field236 + var9.field232 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field226 = var4 >> 2;
      var9.field230 = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("dn")
   static int method499(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & -862998278)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & -36270777)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Laj;III)Lam;")
   @ObfuscatedName("cz")
   public static classAM method471(classAJ var0, int var1, int var2, int var3) {
      return var0.field189 != null && var0.field189.length != 0 ? new classAM(var0, var1, var2, var3) : null;
   }

   @ObfuscatedSignature(descriptor = "(Laj;III)Lam;")
   @ObfuscatedName("cg")
   public static classAM method472(classAJ var0, int var1, int var2, int var3) {
      return var0.field189 != null && var0.field189.length != 0 ? new classAM(var0, var1, var2, var3) : null;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("cw")
   static int method473(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("cj")
   static int method474(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gq")
   public synchronized int method584() {
      return this.field228 < 0 ? -this.field228 : this.field228;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;Z)I")
   @ObfuscatedName("cx")
   static int method478(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, boolean var11) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;Z)I")
   @ObfuscatedName("ce")
   static int method479(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, boolean var11) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;Z)I")
   @ObfuscatedName("cm")
   static int method480(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, boolean var11) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("da")
   static int method512(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gb")
   public synchronized void method548(int var1) {
      this.method542(var1 << 6, this.method558());
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("ag")
   static int method475(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method609() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;)I")
   @ObfuscatedName("dy")
   static int method485(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("di")
   static int method489(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("du")
   static int method490(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("dt")
   static int method491(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - -739954728) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & -1762936829)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("dr")
   static int method492(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1286433959) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dk")
   static int method496(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - -1849069218) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & -686964054) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("db")
   static int method497(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fh")
   public synchronized void method580(int var1) {
      if (var1 == 0) {
         this.method553(0);
         this.vmethod398();
      } else if (this.field235 == 0 && this.field236 == 0) {
         this.field233 = 0;
         this.field223 = 0;
         this.field226 = 0;
         this.vmethod398();
      } else {
         int var2 = -this.field226;
         if (this.field226 > var2) {
            var2 = this.field226;
         }

         if (-this.field235 > var2) {
            var2 = -this.field235;
         }

         if (this.field235 > var2) {
            var2 = this.field235;
         }

         if (-this.field236 > var2) {
            var2 = -this.field236;
         }

         if (this.field236 > var2) {
            var2 = this.field236;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field233 = var1;
         this.field223 = Integer.MIN_VALUE;
         this.field237 = -this.field226 / var1;
         this.field234 = -this.field235 / var1;
         this.field232 = -this.field236 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("ak")
   static int method517(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   static int method459(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("dz")
   static int method500(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fi")
   public synchronized int method560() {
      return this.field224 < 0 ? -1 : this.field224;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("dv")
   static int method501(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("co")
   static int method460(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((-1012124524 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gk")
   public synchronized void method539(int var1) {
      this.field231 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bb")
   synchronized void method543(int var1, int var2) {
      this.field223 = var1;
      this.field224 = var2;
      this.field233 = 0;
      this.method537();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("dq")
   static int method507(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.field230 = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("bj")
   static int method531(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 += (var2[var1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILam;)I")
   @ObfuscatedName("ds")
   static int method509(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classAM var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field235 = var9.field235 + var9.field234 * (var6 - var3);
      var9.field236 = var9.field236 + var9.field232 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field226 = var4 >> 2;
      var9.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("dj")
   static int method513(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("ea")
   static int method518(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ft")
   public synchronized void method577(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method542(var2, var3);
      } else {
         int var4 = method459(var2, var3);
         int var5 = method462(var2, var3);
         if (this.field235 == var4 && this.field236 == var5) {
            this.field233 = 0;
         } else {
            int var6 = var2 - this.field226;
            if (this.field226 - var2 > var6) {
               var6 = this.field226 - var2;
            }

            if (var4 - this.field235 > var6) {
               var6 = var4 - this.field235;
            }

            if (this.field235 - var4 > var6) {
               var6 = this.field235 - var4;
            }

            if (var5 - this.field236 > var6) {
               var6 = var5 - this.field236;
            }

            if (this.field236 - var5 > var6) {
               var6 = this.field236 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field233 = var1;
            this.field223 = var2;
            this.field224 = var3;
            this.field237 = (var2 - this.field226) / var1;
            this.field234 = (var4 - this.field235) / var1;
            this.field232 = (var5 - this.field236) / var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cs")
   static int method461(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((-2102584904 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("de")
   static int method502(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 1152141877 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & -1598498895)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("ek")
   static int method519(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("es")
   static int method520(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("ej")
   static int method521(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      var11.field235 = var11.field235 - var11.field234 * var5;
      var11.field236 = var11.field236 - var11.field232 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 913879483) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 770586855)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         short var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 2076367451)) * var6 >> 6;
         var6 += var7;
      }

      var11.field235 = var11.field235 + var11.field234 * var5;
      var11.field236 = var11.field236 + var11.field232 * var5;
      var11.field226 = var6;
      var11.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("ed")
   static int method522(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      var11.field235 = var11.field235 - var11.field234 * var5;
      var11.field236 = var11.field236 - var11.field232 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         short var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field235 = var11.field235 + var11.field234 * var5;
      var11.field236 = var11.field236 + var11.field232 * var5;
      var11.field226 = var6;
      var11.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("ev")
   static int method525(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("el")
   static int method526(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ec")
   public synchronized void method581(int var1) {
      if (var1 == 0) {
         this.method553(0);
         this.vmethod398();
      } else if (this.field235 == 0 && this.field236 == 0) {
         this.field233 = 0;
         this.field223 = 0;
         this.field226 = 0;
         this.vmethod398();
      } else {
         int var2 = -this.field226;
         if (this.field226 > var2) {
            var2 = this.field226;
         }

         if (-this.field235 > var2) {
            var2 = -this.field235;
         }

         if (this.field235 > var2) {
            var2 = this.field235;
         }

         if (-this.field236 > var2) {
            var2 = -this.field236;
         }

         if (this.field236 > var2) {
            var2 = this.field236;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field233 = var1;
         this.field223 = Integer.MIN_VALUE;
         this.field237 = -this.field226 / var1;
         this.field234 = -this.field235 / var1;
         this.field232 = -this.field236 / var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("eg")
   static int method527(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("en")
   static int method530(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      var11.field235 = var11.field235 - var11.field234 * var5;
      var11.field236 = var11.field236 - var11.field232 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field235 = var11.field235 + var11.field234 * var5;
      var11.field236 = var11.field236 + var11.field232 * var5;
      var11.field226 = var6;
      var11.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("ex")
   static int method532(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + -1274424438 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 += (var2[var1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & -379472121) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("eq")
   static int method533(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 += (var2[var1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("er")
   @Override
   int vmethod23() {
      int var1 = this.field226 * 3 >> 6;
      var1 = (var1 ^ var1 >> -1759968845) + (var1 >>> 31);
      if (this.field231 == 0) {
         var1 -= var1 * this.field230 / (((classAJ)this.field153).field189.length << 8);
      } else if (this.field231 >= 0) {
         var1 -= var1 * this.field229 / ((classAJ)this.field153).field189.length;
      }

      return var1 > -437951682 ? 255 : var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   @Override
   int vmethod24() {
      int var1 = this.field226 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field231 == 0) {
         var1 -= var1 * this.field230 / (((classAJ)this.field153).field189.length << 8);
      } else if (this.field231 >= 0) {
         var1 -= var1 * this.field229 / ((classAJ)this.field153).field189.length;
      }

      return var1 > 255 ? -1286466934 : var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("et")
   @Override
   int vmethod25() {
      int var1 = this.field226 * 3 >> 6;
      var1 = (var1 ^ var1 >> -619920644) + (var1 >>> -207271973);
      if (this.field231 == 0) {
         var1 -= var1 * this.field230 / (((classAJ)this.field153).field189.length << 8);
      } else if (this.field231 >= 0) {
         var1 -= var1 * this.field229 / ((classAJ)this.field153).field189.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ah")
   @Override
   protected classAH vmethod34() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   void method535() {
      this.field226 = this.field223;
      this.field235 = method459(this.field223, this.field224);
      this.field236 = method462(this.field223, this.field224);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ef")
   void method536() {
      this.field226 = this.field223;
      this.field235 = method459(this.field223, this.field224);
      this.field236 = method462(this.field223, this.field224);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method537() {
      this.field226 = this.field223;
      this.field235 = method459(this.field223, this.field224);
      this.field236 = method462(this.field223, this.field224);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gv")
   public synchronized void method540(int var1) {
      this.field231 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fa")
   public synchronized void method541(int var1) {
      this.field231 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILam;II)I")
   @ObfuscatedName("eh")
   static int method528(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      classAM var13,
      int var14,
      int var15
   ) {
      var13.field226 = var13.field226 - var13.field237 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 804717689) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & -246072825) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field226 = var13.field226 + var13.field237 * var5;
      var13.field235 = var6;
      var13.field236 = var7;
      var13.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("ci")
   static int method476(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;)I")
   @ObfuscatedName("dm")
   static int method486(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   public synchronized void method549(int var1) {
      this.method542(var1 << 6, this.method558());
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fq")
   public synchronized void method565(boolean var1) {
      this.field228 = (this.field228 ^ this.field228 >> -1253639289) + (this.field228 >>> 440878710);
      if (var1) {
         this.field228 = -this.field228;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fl")
   public synchronized int method551() {
      return this.field223 == Integer.MIN_VALUE ? 0 : this.field223;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fj")
   public synchronized int method552() {
      return this.field223 == Integer.MIN_VALUE ? 0 : this.field223;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILam;)I")
   @ObfuscatedName("dp")
   static int method514(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classAM var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field226 = var12.field226 + var12.field237 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field235 = var5;
      var12.field236 = var6;
      var12.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fy")
   synchronized void method554(int var1) {
      this.method542(var1, this.method558());
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fg")
   synchronized void method555(int var1) {
      this.method542(var1, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("dd")
   static int method482(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fb")
   public synchronized int method561() {
      return this.field224 < 0 ? -1 : this.field224;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   public synchronized void method563(int var1) {
      int var2 = ((classAJ)this.field153).field189.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field230 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("as")
   @Override
   protected classAH vmethod29() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIILam;)I")
   @ObfuscatedName("dc")
   static int method483(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, classAM var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var8.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILam;II)I")
   @ObfuscatedName("bm")
   static int method523(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, classAM var11, int var12, int var13
   ) {
      var11.field235 = var11.field235 - var11.field234 * var5;
      var11.field236 = var11.field236 - var11.field232 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         short var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field235 = var11.field235 + var11.field234 * var5;
      var11.field236 = var11.field236 + var11.field232 * var5;
      var11.field226 = var6;
      var11.field230 = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILam;)I")
   @ObfuscatedName("dx")
   static int method487(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.field230 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fs")
   public synchronized void method566(boolean var1) {
      this.field228 = (this.field228 ^ this.field228 >> 31) + (this.field228 >>> 31);
      if (var1) {
         this.field228 = -this.field228;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fn")
   void method570() {
      if (this.field233 != 0) {
         if (this.field223 == Integer.MIN_VALUE) {
            this.field223 = 0;
         }

         this.field233 = 0;
         this.method537();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fk")
   public synchronized void method572(int var1, int var2) {
      this.method576(var1, var2, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;)Z")
   @ObfuscatedName("yt")
   public static boolean method591(classAM var0) {
      return var0.field230 < 0 || var0.field230 >= ((classAJ)var0.field153).field189.length << 8;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fx")
   public synchronized void method573(int var1, int var2) {
      this.method576(var1, var2, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILam;II)I")
   @ObfuscatedName("do")
   static int method503(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, classAM var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + -1745909083 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.field230 = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ff")
   public synchronized void method578(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method542(var2, var3);
      } else {
         int var4 = method459(var2, var3);
         int var5 = method462(var2, var3);
         if (this.field235 == var4 && this.field236 == var5) {
            this.field233 = 0;
         } else {
            int var6 = var2 - this.field226;
            if (this.field226 - var2 > var6) {
               var6 = this.field226 - var2;
            }

            if (var4 - this.field235 > var6) {
               var6 = var4 - this.field235;
            }

            if (this.field235 - var4 > var6) {
               var6 = this.field235 - var4;
            }

            if (var5 - this.field236 > var6) {
               var6 = var5 - this.field236;
            }

            if (this.field236 - var5 > var6) {
               var6 = this.field236 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field233 = var1;
            this.field223 = var2;
            this.field224 = var3;
            this.field237 = (var2 - this.field226) / var1;
            this.field234 = (var4 - this.field235) / var1;
            this.field232 = (var5 - this.field236) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gy")
   boolean method606() {
      int var1 = this.field223;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method459(var1, this.field224);
         var3 = method462(var1, this.field224);
      }

      if (this.field226 == var1 && this.field235 == var2 && this.field236 == var3) {
         if (this.field223 == Integer.MIN_VALUE) {
            this.field223 = 0;
            this.field236 = 0;
            this.field235 = 0;
            this.field226 = 0;
            this.vmethod398();
            return true;
         } else {
            this.method537();
            return false;
         }
      } else {
         if (this.field226 < var1) {
            this.field237 = 1;
            this.field233 = var1 - this.field226;
         } else if (this.field226 > var1) {
            this.field237 = -1;
            this.field233 = this.field226 - var1;
         } else {
            this.field237 = 0;
         }

         if (this.field235 < var2) {
            this.field234 = 1;
            if (this.field233 == 0 || this.field233 > var2 - this.field235) {
               this.field233 = var2 - this.field235;
            }
         } else if (this.field235 > var2) {
            this.field234 = -1;
            if (this.field233 == 0 || this.field233 > this.field235 - var2) {
               this.field233 = this.field235 - var2;
            }
         } else {
            this.field234 = 0;
         }

         if (this.field236 < var3) {
            this.field232 = 1;
            if (this.field233 == 0 || this.field233 > var3 - this.field236) {
               this.field233 = var3 - this.field236;
            }
         } else if (this.field236 > var3) {
            this.field232 = -1;
            if (this.field233 == 0 || this.field233 > this.field236 - var3) {
               this.field233 = this.field236 - var3;
            }
         } else {
            this.field232 = 0;
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fe")
   public synchronized void method579(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method542(var2, var3);
      } else {
         int var4 = method459(var2, var3);
         int var5 = method462(var2, var3);
         if (this.field235 == var4 && this.field236 == var5) {
            this.field233 = 0;
         } else {
            int var6 = var2 - this.field226;
            if (this.field226 - var2 > var6) {
               var6 = this.field226 - var2;
            }

            if (var4 - this.field235 > var6) {
               var6 = var4 - this.field235;
            }

            if (this.field235 - var4 > var6) {
               var6 = this.field235 - var4;
            }

            if (var5 - this.field236 > var6) {
               var6 = var5 - this.field236;
            }

            if (this.field236 - var5 > var6) {
               var6 = this.field236 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field233 = var1;
            this.field223 = var2;
            this.field224 = var3;
            this.field237 = (var2 - this.field226) / var1;
            this.field234 = (var4 - this.field235) / var1;
            this.field232 = (var5 - this.field236) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cr")
   public synchronized void method582(int var1) {
      if (var1 == 0) {
         this.method553(0);
         this.vmethod398();
      } else if (this.field235 == 0 && this.field236 == 0) {
         this.field233 = 0;
         this.field223 = 0;
         this.field226 = 0;
         this.vmethod398();
      } else {
         int var2 = -this.field226;
         if (this.field226 > var2) {
            var2 = this.field226;
         }

         if (-this.field235 > var2) {
            var2 = -this.field235;
         }

         if (this.field235 > var2) {
            var2 = this.field235;
         }

         if (-this.field236 > var2) {
            var2 = -this.field236;
         }

         if (this.field236 > var2) {
            var2 = this.field236;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field233 = var1;
         this.field223 = -337786126;
         this.field237 = -this.field226 / var1;
         this.field234 = -this.field235 / var1;
         this.field232 = -this.field236 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("av")
   @Override
   protected classAH vmethod43() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   public synchronized int method585() {
      return this.field228 < 0 ? -this.field228 : this.field228;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fd")
   synchronized void method556(int var1) {
      this.method542(var1, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lam;[IIIII)I")
   @ObfuscatedName("hr")
   public static int method599(classAM var0, int[] var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method603(var1, var2, var2, var2, var2);
      }

      while (var0.field233 > 0) {
         int var6 = var2 + var0.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         var0.field233 += var2;
         if (var0.field228 == -256 && (var0.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method517(
                  0,
                  ((classAJ)var0.field153).field189,
                  var1,
                  var0.field230,
                  var2,
                  var0.field235,
                  var0.field236,
                  var0.field234,
                  var0.field232,
                  0,
                  var6,
                  var3,
                  var0
               );
            } else {
               var2 = method515(((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field226, var0.field237, 0, var6, var3, var0);
            }
         } else if (classKG.field3583) {
            var2 = method531(
               0,
               0,
               ((classAJ)var0.field153).field189,
               var1,
               var0.field230,
               var2,
               var0.field235,
               var0.field236,
               var0.field234,
               var0.field232,
               0,
               var6,
               var3,
               var0,
               var0.field228,
               var5
            );
         } else {
            var2 = method529(
               0, 0, ((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field226, var0.field237, 0, var6, var3, var0, var0.field228, var5
            );
         }

         var0.field233 -= var2;
         if (var0.field233 != 0) {
            return var2;
         }

         if (var0.method605()) {
            return var4;
         }
      }

      if (var0.field228 == -256 && (var0.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method484(0, ((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field235, var0.field236, 0, var4, var3, var0)
            : method481(((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field226, 0, var4, var3, var0);
      } else {
         return classKG.field3583
            ? method504(
               0, 0, ((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field235, var0.field236, 0, var4, var3, var0, var0.field228, var5
            )
            : method498(0, 0, ((classAJ)var0.field153).field189, var1, var0.field230, var2, var0.field226, 0, var4, var3, var0, var0.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cb")
   public synchronized void method588(int var1) {
      if (this.field228 < 0) {
         this.field228 = -var1;
      } else {
         this.field228 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bd")
   public synchronized void method589(int var1) {
      if (this.field228 < 0) {
         this.field228 = -var1;
      } else {
         this.field228 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eb")
   public synchronized int method546() {
      return this.field223 == -1251685597 ? 0 : this.field223 + 32 >> 6;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("go")
   public boolean method592() {
      return this.field230 < 0 || this.field230 >= ((classAJ)this.field153).field189.length << 8;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ga")
   public boolean method595() {
      return this.field233 != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILam;)I")
   @ObfuscatedName("ey")
   static int method516(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classAM var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field235 = var9.field235 + var9.field234 * (var6 - var3);
      var9.field236 = var9.field236 + var9.field232 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field226 = var4 >> 2;
      var9.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gw")
   int method600(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == -256 && (this.field230 & -1077815914) == 0) {
            if (classKG.field3583) {
               var2 = method517(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method515(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method531(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method529(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == 318910781 && (this.field230 & -127884256) == 0) {
         return classKG.field3583
            ? method484(0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this)
            : method481(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method504(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method498(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gn")
   int method601(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method517(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method515(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method531(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method529(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method484(0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this)
            : method481(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method504(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method498(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gt")
   int method602(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field233;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 += var2;
         if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method517(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field230,
                  var2,
                  this.field235,
                  this.field236,
                  this.field234,
                  this.field232,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method515(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method531(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field230,
               var2,
               this.field235,
               this.field236,
               this.field234,
               this.field232,
               0,
               var6,
               var3,
               this,
               this.field228,
               var5
            );
         } else {
            var2 = method529(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, this.field237, 0, var6, var3, this, this.field228, var5
            );
         }

         this.field233 -= var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method605()) {
            return var4;
         }
      }

      if (this.field228 == -256 && (this.field230 & 0xFF) == 0) {
         return classKG.field3583
            ? method484(0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this)
            : method481(((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method504(
               0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field235, this.field236, 0, var4, var3, this, this.field228, var5
            )
            : method498(0, 0, ((classAJ)this.field153).field189, var1, this.field230, var2, this.field226, 0, var4, var3, this, this.field228, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   void method538() {
      this.field226 = this.field223;
      this.field235 = method459(this.field223, this.field224);
      this.field236 = method462(this.field223, this.field224);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fr")
   public synchronized void method574(int var1, int var2) {
      this.method576(var1, var2, this.method558());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILam;)I")
   @ObfuscatedName("df")
   static int method510(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classAM var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field235 = var9.field235 + var9.field234 * (var6 - var3);
      var9.field236 = var9.field236 + var9.field232 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field226 = var4 >> 2;
      var9.field230 = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bl")
   public synchronized void method567(boolean var1) {
      this.field228 = (this.field228 ^ this.field228 >> 31) + (this.field228 >>> 31);
      if (var1) {
         this.field228 = -this.field228;
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gg")
   int method603(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field233 > 0) {
         int var6 = var2 + this.field228;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field233 = this.field234 + var2;
         if (this.field237 == -256 && (this.field231 & 0xFF) == 0) {
            if (classKG.field3583) {
               var2 = method513(
                  0,
                  ((classAJ)this.field153).field189,
                  var1,
                  this.field225,
                  var2,
                  this.field231,
                  this.field232,
                  this.field234,
                  this.field225,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method508(((classAJ)this.field153).field189, var1, this.field231, var2, this.field236, this.field231, 0, var6, var3, this);
            }
         } else if (classKG.field3583) {
            var2 = method526(
               0,
               0,
               ((classAJ)this.field153).field189,
               var1,
               this.field229,
               var2,
               this.field228,
               this.field228,
               this.field232,
               this.field225,
               0,
               var6,
               var3,
               this,
               this.field234,
               var5
            );
         } else {
            var2 = method497(
               0, 0, ((classAJ)this.field153).field189, var1, this.field226, var2, this.field226, this.field237, 0, var6, var3, this, this.field225, var5
            );
         }

         this.field230 = this.field228 - var2;
         if (this.field233 != 0) {
            return var2;
         }

         if (this.method606()) {
            return var4;
         }
      }

      if (this.field237 == -256 && (this.field237 & 0xFF) == 0) {
         return classKG.field3583
            ? method485(0, ((classAJ)this.field153).field189, var1, this.field236, var2, this.field223, this.field236, 0, var4, var3, this)
            : method473(((classAJ)this.field153).field189, var1, this.field236, var2, this.field237, 0, var4, var3, this);
      } else {
         return classKG.field3583
            ? method530(
               0, 0, ((classAJ)this.field153).field189, var1, this.field226, var2, this.field224, this.field230, 0, var4, var3, this, this.field229, var5
            )
            : method489(0, 0, ((classAJ)this.field153).field189, var1, this.field234, var2, this.field236, 0, var4, var3, this, this.field226, var5);
      }
   }
}
