import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cs")
public class classCS {
   @ObfuscatedName("di")
   public static int field1248;
   @ObfuscatedName("jq")
   public static boolean field1240 = true;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1242 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1244 = 256;
   @ObfuscatedName("as")
   final int[][] field1231;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("ax")
   IndexedSprite[] field1238;
   @ObfuscatedName("ac")
   int[] field1235 = new int[256];
   @ObfuscatedName("ak")
   int field1239;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1243 = 256;
   @ObfuscatedName("ap")
   int[] field1254;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1245 = 128;
   @ObfuscatedName("ay")
   int[] field1257;
   @ObfuscatedName("aq")
   int field1232;
   @ObfuscatedName("ao")
   int[] field1253;
   @ObfuscatedName("al")
   int[] field1252;
   @ObfuscatedName("au")
   int[] field1256;
   @ObfuscatedName("ai")
   int[] field1250;
   @ObfuscatedName("ar")
   int[] field1255;
   @ObfuscatedName("aw")
   int field1234;
   @ObfuscatedName("aj")
   int[] field1251;
   @ObfuscatedName("av")
   int field1236;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final String field1249 = "JX_REFRESH_TOKEN";
   @ObfuscatedName("ad")
   int field1233;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field1246 = 67;
   @ObfuscatedName("aa")
   int field1237 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field1241 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field1247 = 51;

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   void method2619(int var1, int var2, int var3) {
      if (client.field1145) {
         classFQ.method4952(var1 - 22, 0, var1 + 128, IntProjection.field1938 * 8379747);
      }

      if (field1240) {
         try {
            int var7 = var2;
            int var6 = var1;
            classCS var5 = this;
            int var8 = 1698595949;

            try {
               if (var5.field1254 == null) {
                  if (var8 != 1698595949) {
                     return;
                  }

                  method2582(var5, 1441447714);
               }

               if (var5.field1236 * -173940227 == 0) {
                  var5.field1236 = var7 * 673317717;
               }

               int var9 = var7 - var5.field1236 * -173940227;
               if (var9 >= 256) {
                  var9 = 0;
               }

               var5.field1236 = var7 * 673317717;
               if (var9 > 0) {
                  if (var8 != 1698595949) {
                     return;
                  }

                  var5.method2591(var9, -981584042);
               }

               method2602(var5, var6, -2102777934);
            } catch (RuntimeException var10) {
               throw classEG.newRunException(var10, "cs.ag(" + ')');
            }
         } catch (Exception var11) {
            client.logger.debug("failed drawing fire", var11);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method2584(int var1) {
      try {
         this.field1252 = null;
         this.field1251 = null;
         this.field1257 = null;
         this.field1253 = null;
         this.field1250 = null;
         this.field1255 = null;
         this.field1254 = null;
         this.field1256 = null;
         this.field1234 = 0;
         this.field1239 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcs;II)V")
   @ObfuscatedName("cm")
   public static void method2602(classCS var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2614(var1, var1);
      }

      try {
         int var3 = var0.field1253.length;
         if (var0.field1232 * -1551918995 > 0) {
            if (var2 >= -1526222877) {
               throw new IllegalStateException();
            }

            var0.method2607(var0.field1232 * -1551918995, var0.field1251, (short)131);
         } else if (1386667955 * var0.field1233 > 0) {
            if (var2 >= -1526222877) {
               throw new IllegalStateException();
            }

            var0.method2607(1386667955 * var0.field1233, var0.field1257, (short)131);
         } else {
            System.arraycopy(var0.field1252, 0, var0.field1253, 0, var3);
         }

         var0.method2611(var1, 2081703005);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "cs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   final void method2590(int var1) {
      this.field1234 += var1 * -646522752;
      if (this.field1234 * -1559545007 > this.field1250.length) {
         this.field1234 = this.field1234 - 1370680753 * this.field1250.length;
         int var2 = (int)(Math.random() * 12.0);
         this.method2615(this.field1238[var2], 1130018239);
      }

      int var15 = 0;
      int var3 = 128 * var1;
      int var4 = (256 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = this.field1254[var3 + var15] - var1 * this.field1250[this.field1234 * -1559545007 + var15 & this.field1250.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1254[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 256 - var1; var7 < 256; var7++) {
         int var8 = var7 * 128;

         for (int var9 = 0; var9 < 128; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var16 && var9 < var17) {
               this.field1254[var8 + var9] = 255;
            } else {
               this.field1254[var9 + var8] = 0;
            }
         }
      }

      if (this.field1232 * -1551918995 > 0) {
         this.field1232 -= var1 * 464569748;
      }

      if (this.field1233 * 1386667955 > 0) {
         this.field1233 -= var1 * -660365844;
      }

      if (0 == -1551918995 * this.field1232 && 1386667955 * this.field1233 == 0) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            this.field1232 = -1329228800;
         }

         if (1 == var18) {
            this.field1233 = -1549931520;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         this.field1235[var19] = this.field1235[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         this.field1235[var20] = (int)(
            Math.sin(this.field1237 * -22252611 / 14.0) * 16.0
               + Math.sin(-22252611 * this.field1237 / 15.0) * 14.0
               + Math.sin(-22252611 * this.field1237 / 16.0) * 12.0
         );
         this.field1237 += 1165746069;
      }

      this.field1239 += 498436033 * var1;
      int var21 = ((client.field855 * 1612595797 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < -652396188 * this.field1239; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            this.field1254[(var13 << 7) + var12] = 192;
         }

         this.field1239 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += this.field1254[var29 + var14 + var21];
               }

               if (var14 - (1 + var21) >= 0) {
                  var27 -= this.field1254[var14 + var29 - (1 + var21)];
               }

               if (var14 >= 0) {
                  this.field1256[var14 + var29] = var27 / (var21 * 2 + 1);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 256; var30++) {
               int var31 = 128 * var30;
               if (var21 + var30 < 256) {
                  var28 += this.field1256[var26 + var31 + var21 * 128];
               }

               if (var30 - (1 + var21) >= 0) {
                  var28 -= this.field1256[var26 + var31 - 128 * (1 + var21)];
               }

               if (var30 >= 0) {
                  this.field1254[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ao")
   final void method2591(int var1, int var2) {
      try {
         this.field1234 += var1 * -646522752;
         if (this.field1234 * -1559545007 > this.field1250.length) {
            if (var2 >= 554780875) {
               return;
            }

            this.field1234 = this.field1234 - 1370680753 * this.field1250.length;
            int var3 = (int)(Math.random() * 12.0);
            this.method2615(this.field1238[var3], 1130018239);
         }

         int var17 = 0;
         int var4 = 128 * var1;
         int var5 = (256 - var1) * 128;

         for (int var6 = 0; var6 < var5; var6++) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            int var7 = this.field1254[var4 + var17] - var1 * this.field1250[this.field1234 * -1559545007 + var17 & this.field1250.length - 1] / 6;
            if (var7 < 0) {
               if (var2 >= 554780875) {
                  throw new IllegalStateException();
               }

               var7 = 0;
            }

            this.field1254[var17++] = var7;
         }

         byte var18 = 10;
         int var19 = 128 - var18;

         for (int var8 = 256 - var1; var8 < 256; var8++) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            int var9 = var8 * 128;

            for (int var10 = 0; var10 < 128; var10++) {
               int var11 = (int)(Math.random() * 100.0);
               if (var11 < 50) {
                  if (var2 >= 554780875) {
                     throw new IllegalStateException();
                  }

                  if (var10 > var18) {
                     if (var2 >= 554780875) {
                        throw new IllegalStateException();
                     }

                     if (var10 < var19) {
                        if (var2 >= 554780875) {
                           throw new IllegalStateException();
                        }

                        this.field1254[var9 + var10] = 255;
                        continue;
                     }
                  }
               }

               this.field1254[var10 + var9] = 0;
            }
         }

         if (this.field1232 * -1551918995 > 0) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            this.field1232 -= var1 * 464569748;
         }

         if (this.field1233 * 1386667955 > 0) {
            this.field1233 -= var1 * -660365844;
         }

         if (0 == -1551918995 * this.field1232) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            if (1386667955 * this.field1233 == 0) {
               if (var2 >= 554780875) {
                  return;
               }

               int var20 = (int)(Math.random() * (2000 / var1));
               if (0 == var20) {
                  if (var2 >= 554780875) {
                     throw new IllegalStateException();
                  }

                  this.field1232 = -1329228800;
               }

               if (1 == var20) {
                  if (var2 >= 554780875) {
                     throw new IllegalStateException();
                  }

                  this.field1233 = -1549931520;
               }
            }
         }

         for (int var21 = 0; var21 < 256 - var1; var21++) {
            if (var2 >= 554780875) {
               return;
            }

            this.field1235[var21] = this.field1235[var1 + var21];
         }

         for (int var22 = 256 - var1; var22 < 256; var22++) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            this.field1235[var22] = (int)(
               Math.sin(this.field1237 * -22252611 / 14.0) * 16.0
                  + Math.sin(-22252611 * this.field1237 / 15.0) * 14.0
                  + Math.sin(-22252611 * this.field1237 / 16.0) * 12.0
            );
            this.field1237 += 1165746069;
         }

         this.field1239 += 498436033 * var1;
         int var23 = ((client.field855 * 1612595797 & 1) + var1) / 2;
         if (var23 > 0) {
            if (var2 >= 554780875) {
               throw new IllegalStateException();
            }

            short var24 = 128;
            byte var25 = 2;
            int var26 = 128 - var25 - var25;

            for (int var12 = 0; var12 < -652396188 * this.field1239; var12++) {
               if (var2 >= 554780875) {
                  throw new IllegalStateException();
               }

               int var13 = (int)(Math.random() * var26) + var25;
               int var14 = (int)(Math.random() * var24) + var24;
               this.field1254[(var14 << 7) + var13] = 192;
            }

            this.field1239 = 0;

            for (int var27 = 0; var27 < 256; var27++) {
               if (var2 >= 554780875) {
                  throw new IllegalStateException();
               }

               int var29 = 0;
               int var31 = 128 * var27;

               for (int var15 = -var23; var15 < 128; var15++) {
                  if (var2 >= 554780875) {
                     return;
                  }

                  if (var15 + var23 < 128) {
                     var29 += this.field1254[var31 + var15 + var23];
                  }

                  if (var15 - (1 + var23) >= 0) {
                     if (var2 >= 554780875) {
                        return;
                     }

                     var29 -= this.field1254[var15 + var31 - (1 + var23)];
                  }

                  if (var15 >= 0) {
                     if (var2 >= 554780875) {
                        throw new IllegalStateException();
                     }

                     this.field1256[var15 + var31] = var29 / (var23 * 2 + 1);
                  }
               }
            }

            for (int var28 = 0; var28 < 128; var28++) {
               if (var2 >= 554780875) {
                  throw new IllegalStateException();
               }

               int var30 = 0;

               for (int var32 = -var23; var32 < 256; var32++) {
                  if (var2 >= 554780875) {
                     return;
                  }

                  int var33 = 128 * var32;
                  if (var23 + var32 < 256) {
                     var30 += this.field1256[var28 + var33 + var23 * 128];
                  }

                  if (var32 - (1 + var23) >= 0) {
                     if (var2 >= 554780875) {
                        return;
                     }

                     var30 -= this.field1256[var28 + var33 - 128 * (1 + var23)];
                  }

                  if (var32 >= 0) {
                     if (var2 >= 554780875) {
                        return;
                     }

                     this.field1254[var28 + var33] = var30 / (var23 * 2 + 1);
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "cs.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bc")
   final void method2603(int var1) {
      int var2 = this.field1253.length;
      if (this.field1232 * -1551918995 > 0) {
         this.method2607(this.field1232 * -1551918995, this.field1251, (short)131);
      } else if (1386667955 * this.field1233 > 0) {
         this.method2607(1386667955 * this.field1233, this.field1257, (short)131);
      } else {
         System.arraycopy(this.field1252, 0, this.field1253, 0, var2);
      }

      this.method2611(var1, -964289706);
   }

   @ObfuscatedSignature(descriptor = "(I[IS)V")
   @ObfuscatedName("aa")
   final void method2607(int var1, int[] var2, short var3) {
      try {
         int var4 = this.field1253.length;

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 != 131) {
               throw new IllegalStateException();
            }

            if (var1 > 768) {
               if (var3 != 131) {
                  return;
               }

               this.field1253[var5] = method2599(this, this.field1252[var5], var2[var5], 1024 - var1, 1979053932);
            } else if (var1 > 256) {
               if (var3 != 131) {
                  return;
               }

               this.field1253[var5] = var2[var5];
            } else {
               this.field1253[var5] = method2599(this, var2[var5], this.field1252[var5], 256 - var1, 1979053932);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "cs.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;III)I")
   @ObfuscatedName("mp")
   public static int method2597(classCS var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method2586();
      }

      int var4 = 256 - var3;
      return (var4 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ab")
   static final boolean method2596(int var0, int var1) {
      try {
         if (16 != var0) {
            if (var1 != 1509062995) {
               throw new IllegalStateException();
            }

            if (17 != var0) {
               if (var1 != 1509062995) {
                  throw new IllegalStateException();
               }

               if (var0 >= 18) {
                  if (var1 != 1509062995) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 22) {
                     if (var1 != 1509062995) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }

               return false;
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bn")
   final int method2598(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;)V")
   @ObfuscatedName("vf")
   public static void method2585(classCS var0) {
      if (var0 == null) {
         var0.method2580();
      }

      var0.field1252 = null;
      var0.field1251 = null;
      var0.field1257 = null;
      var0.field1253 = null;
      var0.field1250 = null;
      var0.field1255 = null;
      var0.field1254 = null;
      var0.field1256 = null;
      var0.field1234 = 0;
      var0.field1239 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lyz;I)V")
   @ObfuscatedName("al")
   final void method2615(IndexedSprite var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field1250.length; var3++) {
            if (var2 != 1130018239) {
               throw new IllegalStateException();
            }

            this.field1250[var3] = 0;
         }

         for (int var10 = 0; var10 < 5000; var10++) {
            if (var2 != 1130018239) {
               return;
            }

            int var4 = (int)(Math.random() * 128.0 * 256.0);
            this.field1250[var4] = (int)(Math.random() * 256.0);
         }

         for (int var11 = 0; var11 < 20; var11++) {
            if (var2 != 1130018239) {
               throw new IllegalStateException();
            }

            for (int var13 = 1; var13 < 255; var13++) {
               for (int var5 = 1; var5 < 127; var5++) {
                  if (var2 != 1130018239) {
                     throw new IllegalStateException();
                  }

                  int var6 = (var13 << 7) + var5;
                  this.field1255[var6] = (this.field1250[128 + var6] + this.field1250[var6 - 128] + this.field1250[var6 - 1] + this.field1250[1 + var6]) / 4;
               }
            }

            int[] var14 = this.field1250;
            this.field1250 = this.field1255;
            this.field1255 = var14;
         }

         if (null != var1) {
            int var12 = 0;

            for (int var15 = 0; var15 < var1.field7119; var15++) {
               if (var2 != 1130018239) {
                  throw new IllegalStateException();
               }

               for (int var16 = 0; var16 < var1.field7121; var16++) {
                  if (var2 != 1130018239) {
                     return;
                  }

                  if (var1.pixels[var12++] != 0) {
                     int var17 = 16 + var16 + var1.field7122;
                     int var7 = var1.field7123 + var15 + 16;
                     int var8 = var17 + (var7 << 7);
                     this.field1250[var8] = 0;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "cs.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;)V")
   @ObfuscatedName("lr")
   public static void method2579(classCS var0) {
      var0.field1252 = classIW.method6322(
         var0.field1231[0][0], var0.field1231[0][1], var0.field1231[0][2], var0.field1231[0][3], var0.field1231[0][4], (byte)88
      );
      var0.field1251 = classIW.method6322(
         var0.field1231[1][0], var0.field1231[1][1], var0.field1231[1][2], var0.field1231[1][3], var0.field1231[1][4], (byte)56
      );
      var0.field1257 = classIW.method6322(
         var0.field1231[2][0], var0.field1231[2][1], var0.field1231[2][2], var0.field1231[2][3], var0.field1231[2][4], (byte)100
      );
      var0.field1253 = new int[1575436427];
      var0.field1234 = 0;
      var0.field1250 = new int[32768];
      var0.field1255 = new int[-916322022];
      var0.method2615(null, 1130018239);
      var0.field1254 = new int[32768];
      var0.field1256 = new int[-1275661940];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ay")
   static int method2578(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var3 + var2 * (var6 - var3 + 1) / 64 & 0xFF;
      int var10 = var4 + var2 * (1 + (var7 - var4)) / 64 & 0xFF;
      int var11 = var5 + var2 * (1 + (var8 - var5)) / 64 & 0xFF;
      return var9 << 16 | var10 << 8 | var11;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method2580() {
      this.field1252 = classIW.method6322(
         this.field1231[0][0], this.field1231[0][1], this.field1231[0][2], this.field1231[0][3], this.field1231[0][4], (byte)32
      );
      this.field1251 = classIW.method6322(
         this.field1231[1][0], this.field1231[1][1], this.field1231[1][2], this.field1231[1][3], this.field1231[1][4], (byte)89
      );
      this.field1257 = classIW.method6322(
         this.field1231[2][0], this.field1231[2][1], this.field1231[2][2], this.field1231[2][3], this.field1231[2][4], (byte)108
      );
      this.field1253 = new int[838303357];
      this.field1234 = 0;
      this.field1250 = new int[1437048684];
      this.field1255 = new int[-1021490662];
      this.method2615(null, 1130018239);
      this.field1254 = new int[32768];
      this.field1256 = new int[32768];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method2581() {
      this.field1252 = classIW.method6322(
         this.field1231[0][0], this.field1231[0][1], this.field1231[0][2], this.field1231[0][3], this.field1231[0][4], (byte)30
      );
      this.field1251 = classIW.method6322(
         this.field1231[1][0], this.field1231[1][1], this.field1231[1][2], this.field1231[1][3], this.field1231[1][4], (byte)119
      );
      this.field1257 = classIW.method6322(
         this.field1231[2][0], this.field1231[2][1], this.field1231[2][2], this.field1231[2][3], this.field1231[2][4], (byte)59
      );
      this.field1253 = new int[459723135];
      this.field1234 = 0;
      this.field1250 = new int[-621200864];
      this.field1255 = new int[-1495584499];
      this.method2615(null, 1130018239);
      this.field1254 = new int[-1060886249];
      this.field1256 = new int[748698545];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("br")
   final void method2604(int var1) {
      int var2 = this.field1253.length;
      if (this.field1232 * 2079452222 > 0) {
         this.method2607(this.field1232 * -1551918995, this.field1251, (short)131);
      } else if (1386667955 * this.field1233 > 0) {
         this.method2607(-429726616 * this.field1233, this.field1257, (short)131);
      } else {
         System.arraycopy(this.field1252, 0, this.field1253, 0, var2);
      }

      this.method2611(var1, 607546777);
   }

   @ObfuscatedSignature(descriptor = "(Lcs;IIII)I")
   @ObfuscatedName("rw")
   public static int method2599(classCS var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method2601(var1, var1, var1, var1);
      }

      try {
         int var5 = 256 - var3;
         return (var5 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + (var5 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "cs.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method2586() {
      this.field1252 = null;
      this.field1251 = null;
      this.field1257 = null;
      this.field1253 = null;
      this.field1250 = null;
      this.field1255 = null;
      this.field1254 = null;
      this.field1256 = null;
      this.field1234 = 0;
      this.field1239 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lcs;I)V")
   @ObfuscatedName("in")
   public static void method2582(classCS var0, int var1) {
      if (var0 == null) {
         var0.method2588(var1);
      } else {
         try {
            var0.field1252 = classIW.method6322(
               var0.field1231[0][0], var0.field1231[0][1], var0.field1231[0][2], var0.field1231[0][3], var0.field1231[0][4], (byte)57
            );
            var0.field1251 = classIW.method6322(
               var0.field1231[1][0], var0.field1231[1][1], var0.field1231[1][2], var0.field1231[1][3], var0.field1231[1][4], (byte)127
            );
            var0.field1257 = classIW.method6322(
               var0.field1231[2][0], var0.field1231[2][1], var0.field1231[2][2], var0.field1231[2][3], var0.field1231[2][4], (byte)32
            );
            var0.field1253 = new int[256];
            var0.field1234 = 0;
            var0.field1250 = new int[32768];
            var0.field1255 = new int[32768];
            var0.method2615(null, 1130018239);
            var0.field1254 = new int[32768];
            var0.field1256 = new int[32768];
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "cs.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   final void method2611(int var1, int var2) {
      try {
         int var3 = 0;

         for (int var4 = 1; var4 < 255; var4++) {
            if (var2 == 120041229) {
               throw new IllegalStateException();
            }

            int var5 = this.field1235[var4] * (256 - var4) / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               if (var2 == 120041229) {
                  throw new IllegalStateException();
               }

               var7 = -var6;
               var6 = 0;
            }

            if (128 + var6 >= classWO.field6763.field6967 * -1238133717) {
               if (var2 == 120041229) {
                  throw new IllegalStateException();
               }

               var8 = -1238133717 * classWO.field6763.field6967 - var6;
            }

            int var9 = classWO.field6763.field6967 * -1238133717 * (var4 + 8) + var6;
            var3 += var7;

            for (int var10 = var7; var10 < var8; var10++) {
               if (var2 == 120041229) {
                  return;
               }

               int var11 = this.field1254[var3++];
               int var12 = var9 % classYW.field7102;
               if (var11 != 0) {
                  if (var2 == 120041229) {
                     throw new IllegalStateException();
                  }

                  if (var12 >= classYW.field7097) {
                     if (var2 == 120041229) {
                        throw new IllegalStateException();
                     }

                     if (var12 < classYW.field7099) {
                        int var14 = 256 - var11;
                        int var18 = this.field1253[var11];
                        int var15 = classWO.field6763.field6971[var9];
                        classWO.field6763.field6971[var9++] = 0xFF000000
                           | ((var15 & 0xFF00) * var14 + (var18 & 0xFF00) * var11 & 0xFF0000)
                                 + ((var15 & 16711935) * var14 + var11 * (var18 & 16711935) & -16711936)
                              >> 8;
                        continue;
                     }
                  }
               }

               var9++;
            }

            var3 += 128 - var8;
         }
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "cs.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   final void method2592(int var1) {
      this.field1234 += var1 * -646522752;
      if (this.field1234 * -1559545007 > this.field1250.length) {
         this.field1234 = this.field1234 - 1370680753 * this.field1250.length;
         int var2 = (int)(Math.random() * 12.0);
         this.method2615(this.field1238[var2], 1130018239);
      }

      int var15 = 0;
      int var3 = 128 * var1;
      int var4 = (256 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = this.field1254[var3 + var15] - var1 * this.field1250[this.field1234 * -1559545007 + var15 & this.field1250.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1254[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 256 - var1; var7 < 256; var7++) {
         int var8 = var7 * 128;

         for (int var9 = 0; var9 < 128; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var16 && var9 < var17) {
               this.field1254[var8 + var9] = 255;
            } else {
               this.field1254[var9 + var8] = 0;
            }
         }
      }

      if (this.field1232 * -1551918995 > 0) {
         this.field1232 -= var1 * 464569748;
      }

      if (this.field1233 * 1386667955 > 0) {
         this.field1233 -= var1 * -660365844;
      }

      if (0 == -1551918995 * this.field1232 && 1386667955 * this.field1233 == 0) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            this.field1232 = -1329228800;
         }

         if (1 == var18) {
            this.field1233 = -1549931520;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         this.field1235[var19] = this.field1235[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         this.field1235[var20] = (int)(
            Math.sin(this.field1237 * -22252611 / 14.0) * 16.0
               + Math.sin(-22252611 * this.field1237 / 15.0) * 14.0
               + Math.sin(-22252611 * this.field1237 / 16.0) * 12.0
         );
         this.field1237 += 1165746069;
      }

      this.field1239 += 498436033 * var1;
      int var21 = ((client.field855 * 1612595797 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < -652396188 * this.field1239; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            this.field1254[(var13 << 7) + var12] = 192;
         }

         this.field1239 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += this.field1254[var29 + var14 + var21];
               }

               if (var14 - (1 + var21) >= 0) {
                  var27 -= this.field1254[var14 + var29 - (1 + var21)];
               }

               if (var14 >= 0) {
                  this.field1256[var14 + var29] = var27 / (var21 * 2 + 1);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 256; var30++) {
               int var31 = 128 * var30;
               if (var21 + var30 < 256) {
                  var28 += this.field1256[var26 + var31 + var21 * 128];
               }

               if (var30 - (1 + var21) >= 0) {
                  var28 -= this.field1256[var26 + var31 - 128 * (1 + var21)];
               }

               if (var30 >= 0) {
                  this.field1254[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   final void method2593(int var1) {
      this.field1234 += var1 * -646522752;
      if (this.field1234 * -1559545007 > this.field1250.length) {
         this.field1234 = this.field1234 - 1370680753 * this.field1250.length;
         int var2 = (int)(Math.random() * 12.0);
         this.method2615(this.field1238[var2], 1130018239);
      }

      int var15 = 0;
      int var3 = 128 * var1;
      int var4 = (256 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = this.field1254[var3 + var15] - var1 * this.field1250[this.field1234 * -1559545007 + var15 & this.field1250.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1254[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 256 - var1; var7 < 256; var7++) {
         int var8 = var7 * 128;

         for (int var9 = 0; var9 < 128; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var16 && var9 < var17) {
               this.field1254[var8 + var9] = 255;
            } else {
               this.field1254[var9 + var8] = 0;
            }
         }
      }

      if (this.field1232 * -1551918995 > 0) {
         this.field1232 -= var1 * 464569748;
      }

      if (this.field1233 * 1386667955 > 0) {
         this.field1233 -= var1 * -660365844;
      }

      if (0 == -1551918995 * this.field1232 && 1386667955 * this.field1233 == 0) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            this.field1232 = -1329228800;
         }

         if (1 == var18) {
            this.field1233 = -1549931520;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         this.field1235[var19] = this.field1235[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         this.field1235[var20] = (int)(
            Math.sin(this.field1237 * -22252611 / 14.0) * 16.0
               + Math.sin(-22252611 * this.field1237 / 15.0) * 14.0
               + Math.sin(-22252611 * this.field1237 / 16.0) * 12.0
         );
         this.field1237 += 1165746069;
      }

      this.field1239 += 498436033 * var1;
      int var21 = ((client.field855 * 1612595797 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < -652396188 * this.field1239; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            this.field1254[(var13 << 7) + var12] = 192;
         }

         this.field1239 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += this.field1254[var29 + var14 + var21];
               }

               if (var14 - (1 + var21) >= 0) {
                  var27 -= this.field1254[var14 + var29 - (1 + var21)];
               }

               if (var14 >= 0) {
                  this.field1256[var14 + var29] = var27 / (var21 * 2 + 1);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 256; var30++) {
               int var31 = 128 * var30;
               if (var21 + var30 < 256) {
                  var28 += this.field1256[var26 + var31 + var21 * 128];
               }

               if (var30 - (1 + var21) >= 0) {
                  var28 -= this.field1256[var26 + var31 - 128 * (1 + var21)];
               }

               if (var30 >= 0) {
                  this.field1254[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;)V")
   @ObfuscatedName("cc")
   public static void method2583(classCS var0) {
      if (var0 == null) {
         var0.method2581();
      } else {
         var0.field1252 = classIW.method6322(
            var0.field1231[0][0], var0.field1231[0][1], var0.field1231[0][2], var0.field1231[0][3], var0.field1231[0][4], (byte)127
         );
         var0.field1251 = classIW.method6322(
            var0.field1231[1][0], var0.field1231[1][1], var0.field1231[1][2], var0.field1231[1][3], var0.field1231[1][4], (byte)63
         );
         var0.field1257 = classIW.method6322(
            var0.field1231[2][0], var0.field1231[2][1], var0.field1231[2][2], var0.field1231[2][3], var0.field1231[2][4], (byte)85
         );
         var0.field1253 = new int[256];
         var0.field1234 = 0;
         var0.field1250 = new int[32768];
         var0.field1255 = new int[32768];
         var0.method2615(null, 1130018239);
         var0.field1254 = new int[32768];
         var0.field1256 = new int[32768];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   final void method2612(int var1) {
      int var2 = 0;

      for (int var3 = 1; var3 < 255; var3++) {
         int var4 = this.field1235[var3] * (-1221964974 - var3) / 256;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (-841952431 + var5 >= classWO.field6763.field6967 * -1893488748) {
            var7 = -1238133717 * classWO.field6763.field6967 - var5;
         }

         int var8 = classWO.field6763.field6967 * 534384140 * (var3 + 8) + var5;
         var2 += var6;

         for (int var9 = var6; var9 < var7; var9++) {
            int var10 = this.field1254[var2++];
            int var11 = var8 % classYW.field7102;
            if (var10 != 0 && var11 >= classYW.field7097 && var11 < classYW.field7099) {
               int var13 = 256 - var10;
               int var16 = this.field1253[var10];
               int var14 = classWO.field6763.field6971[var8];
               classWO.field6763.field6971[var8++] = -1601882941
                  | ((var14 & 0xFF00) * var13 + (var16 & 1796441416) * var10 & 1684317309)
                        + ((var14 & 16711935) * var13 + var10 * (var16 & 929567641) & -16711936)
                     >> 8;
            } else {
               var8++;
            }
         }

         var2 += 128 - var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   final void method2605(int var1) {
      int var2 = this.field1253.length;
      if (this.field1232 * -1551918995 > 0) {
         this.method2607(this.field1232 * -1551918995, this.field1251, (short)131);
      } else if (696311217 * this.field1233 > 0) {
         this.method2607(1386667955 * this.field1233, this.field1257, (short)131);
      } else {
         System.arraycopy(this.field1252, 0, this.field1253, 0, var2);
      }

      this.method2611(var1, 553717412);
   }

   classCS(IndexedSprite[] var1, int[][] var2) {
      this.field1232 = 0;
      this.field1233 = 0;
      this.field1234 = 0;
      this.field1239 = 0;
      this.field1236 = 0;
      this.field1238 = var1;
      this.field1231 = var2;
      method2582(this, -158809887);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bp")
   final void method2606(int var1) {
      int var2 = this.field1253.length;
      if (this.field1232 * -1459601987 > 0) {
         this.method2607(this.field1232 * -1551918995, this.field1251, (short)131);
      } else if (1386667955 * this.field1233 > 0) {
         this.method2607(1037975200 * this.field1233, this.field1257, (short)131);
      } else {
         System.arraycopy(this.field1252, 0, this.field1253, 0, var2);
      }

      this.method2611(var1, 503316767);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method2587() {
      this.field1252 = null;
      this.field1251 = null;
      this.field1257 = null;
      this.field1253 = null;
      this.field1250 = null;
      this.field1255 = null;
      this.field1254 = null;
      this.field1256 = null;
      this.field1234 = 0;
      this.field1239 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;I)V")
   @ObfuscatedName("uo")
   public static void method2594(classCS var0, int var1) {
      if (var0 == null) {
         var0.method2600(var1, var1, var1);
      }

      var0.field1234 += var1 * -646522752;
      if (var0.field1234 * -1559545007 > var0.field1250.length) {
         var0.field1234 = var0.field1234 - 1370680753 * var0.field1250.length;
         int var2 = (int)(Math.random() * 12.0);
         var0.method2615(var0.field1238[var2], 1130018239);
      }

      int var15 = 0;
      int var3 = 1863944398 * var1;
      int var4 = (-720272318 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var0.field1254[var3 + var15] - var1 * var0.field1250[var0.field1234 * -1559545007 + var15 & var0.field1250.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         var0.field1254[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = -2107951867 - var1; var7 < 256; var7++) {
         int var8 = var7 * -1385419140;

         for (int var9 = 0; var9 < -1054710534; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 1428151105 && var9 > var16 && var9 < var17) {
               var0.field1254[var8 + var9] = 255;
            } else {
               var0.field1254[var9 + var8] = 0;
            }
         }
      }

      if (var0.field1232 * -1551918995 > 0) {
         var0.field1232 -= var1 * 1297334984;
      }

      if (var0.field1233 * 846735790 > 0) {
         var0.field1233 -= var1 * 853296162;
      }

      if (0 == 346522081 * var0.field1232 && 1386667955 * var0.field1233 == 0) {
         int var18 = (int)(Math.random() * (-1379100700 / var1));
         if (0 == var18) {
            var0.field1232 = -1329228800;
         }

         if (1 == var18) {
            var0.field1233 = -1549931520;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         var0.field1235[var19] = var0.field1235[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         var0.field1235[var20] = (int)(
            Math.sin(var0.field1237 * -22252611 / 14.0) * 16.0
               + Math.sin(1845088999 * var0.field1237 / 15.0) * 14.0
               + Math.sin(-22252611 * var0.field1237 / 16.0) * 12.0
         );
         var0.field1237 += 1165746069;
      }

      var0.field1239 += -1686868107 * var1;
      int var21 = ((client.field855 * 1154851165 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < -652396188 * var0.field1239; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            var0.field1254[(var13 << 7) + var12] = 1536721856;
         }

         var0.field1239 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += var0.field1254[var29 + var14 + var21];
               }

               if (var14 - (1 + var21) >= 0) {
                  var27 -= var0.field1254[var14 + var29 - (1 + var21)];
               }

               if (var14 >= 0) {
                  var0.field1256[var14 + var29] = var27 / (var21 * 2 + 1);
               }
            }
         }

         for (int var26 = 0; var26 < 389686218; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < -266999573; var30++) {
               int var31 = 221640390 * var30;
               if (var21 + var30 < 2083866918) {
                  var28 += var0.field1256[var26 + var31 + var21 * -1588977353];
               }

               if (var30 - (1 + var21) >= 0) {
                  var28 -= var0.field1256[var26 + var31 - 128 * (1 + var21)];
               }

               if (var30 >= 0) {
                  var0.field1254[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyz;)V")
   @ObfuscatedName("ba")
   final void method2616(IndexedSprite var1) {
      for (int var2 = 0; var2 < this.field1250.length; var2++) {
         this.field1250[var2] = 0;
      }

      for (int var8 = 0; var8 < 5000; var8++) {
         int var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1250[var3] = (int)(Math.random() * 256.0);
      }

      for (int var9 = 0; var9 < 20; var9++) {
         for (int var11 = 1; var11 < 255; var11++) {
            for (int var4 = 1; var4 < 127; var4++) {
               int var5 = (var11 << 7) + var4;
               this.field1255[var5] = (this.field1250[-841058844 + var5] + this.field1250[var5 - 128] + this.field1250[var5 - 1] + this.field1250[1 + var5])
                  / 4;
            }
         }

         int[] var12 = this.field1250;
         this.field1250 = this.field1255;
         this.field1255 = var12;
      }

      if (null != var1) {
         int var10 = 0;

         for (int var13 = 0; var13 < var1.field7119; var13++) {
            for (int var14 = 0; var14 < var1.field7121; var14++) {
               if (var1.pixels[var10++] != 0) {
                  int var15 = 16 + var14 + var1.field7122;
                  int var6 = var1.field7123 + var13 + 16;
                  int var7 = var15 + (var6 << 7);
                  this.field1250[var7] = 0;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bt")
   final void method2608(int var1, int[] var2) {
      int var3 = this.field1253.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field1253[var4] = method2599(this, this.field1252[var4], var2[var4], 1024 - var1, 1979053932);
         } else if (var1 > 256) {
            this.field1253[var4] = var2[var4];
         } else {
            this.field1253[var4] = method2599(this, var2[var4], this.field1252[var4], 256 - var1, 1979053932);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)[I")
   @ObfuscatedName("aj")
   static int[] method2577(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      for (int var6 = 0; var6 < 64; var6++) {
         var5[var6] = FloatProjection.method3896(var0, var1, var6, -2077477038);
      }

      for (int var7 = 0; var7 < 64; var7++) {
         var5[64 + var7] = FloatProjection.method3896(var1, var2, var7, -2017816990);
      }

      for (int var8 = 0; var8 < 64; var8++) {
         var5[128 + var8] = FloatProjection.method3896(var2, var3, var8, -1881223230);
      }

      for (int var9 = 0; var9 < 64; var9++) {
         var5[var9 + 192] = FloatProjection.method3896(var3, var4, var9, -1598757105);
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bj")
   final void method2609(int var1, int[] var2) {
      int var3 = this.field1253.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field1253[var4] = method2599(this, this.field1252[var4], var2[var4], 1024 - var1, 1979053932);
         } else if (var1 > 256) {
            this.field1253[var4] = var2[var4];
         } else {
            this.field1253[var4] = method2599(this, var2[var4], this.field1252[var4], 256 - var1, 1979053932);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bg")
   final void method2610(int var1, int[] var2) {
      int var3 = this.field1253.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field1253[var4] = method2599(this, this.field1252[var4], var2[var4], 1024 - var1, 1979053932);
         } else if (var1 > 256) {
            this.field1253[var4] = var2[var4];
         } else {
            this.field1253[var4] = method2599(this, var2[var4], this.field1252[var4], 256 - var1, 1979053932);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;II)V")
   @ObfuscatedName("zl")
   public static void method2589(classCS var0, int var1, int var2) {
      if (var0.field1254 == null) {
         method2582(var0, 1769423392);
      }

      if (var0.field1236 * -495701474 == 0) {
         var0.field1236 = var2 * -1408423928;
      }

      int var3 = var2 - var0.field1236 * 342535152;
      if (var3 >= 256) {
         var3 = 0;
      }

      var0.field1236 = var2 * 491483062;
      if (var3 > 0) {
         var0.method2591(var3, -1691768845);
      }

      method2602(var0, var1, -1951869060);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   final void method2613(int var1) {
      int var2 = 0;

      for (int var3 = 1; var3 < -452313927; var3++) {
         int var4 = this.field1235[var3] * (-1769068566 - var3) / 256;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= classWO.field6763.field6967 * -1238133717) {
            var7 = 836814154 * classWO.field6763.field6967 - var5;
         }

         int var8 = classWO.field6763.field6967 * -2021926892 * (var3 + 8) + var5;
         var2 += var6;

         for (int var9 = var6; var9 < var7; var9++) {
            int var10 = this.field1254[var2++];
            int var11 = var8 % classYW.field7102;
            if (var10 != 0 && var11 >= classYW.field7097 && var11 < classYW.field7099) {
               int var13 = 256 - var10;
               int var16 = this.field1253[var10];
               int var14 = classWO.field6763.field6971[var8];
               classWO.field6763.field6971[var8++] = 0xFF000000
                  | ((var14 & 0xFF00) * var13 + (var16 & 0xFF00) * var10 & 0xFF0000) + ((var14 & 646860513) * var13 + var10 * (var16 & 16711935) & -16711936)
                     >> 8;
            } else {
               var8++;
            }
         }

         var2 += 1138545934 - var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ah")
   final int method2600(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & -1188162276) + var3 * (var2 & 0xFF00) & 0xFF0000) + (var4 * (var1 & 16711935) + var3 * (var2 & 2109810323) & -16711936) >> 8;
   }

   @ObfuscatedSignature(descriptor = "(Lyz;)V")
   @ObfuscatedName("bw")
   final void method2617(IndexedSprite var1) {
      for (int var2 = 0; var2 < this.field1250.length; var2++) {
         this.field1250[var2] = 0;
      }

      for (int var8 = 0; var8 < -1658978004; var8++) {
         int var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1250[var3] = (int)(Math.random() * 256.0);
      }

      for (int var9 = 0; var9 < 20; var9++) {
         for (int var11 = 1; var11 < 255; var11++) {
            for (int var4 = 1; var4 < 127; var4++) {
               int var5 = (var11 << 7) + var4;
               this.field1255[var5] = (this.field1250[128 + var5] + this.field1250[var5 - 128] + this.field1250[var5 - 1] + this.field1250[1 + var5]) / 4;
            }
         }

         int[] var12 = this.field1250;
         this.field1250 = this.field1255;
         this.field1255 = var12;
      }

      if (null != var1) {
         int var10 = 0;

         for (int var13 = 0; var13 < var1.field7119; var13++) {
            for (int var14 = 0; var14 < var1.field7121; var14++) {
               if (var1.pixels[var10++] != 0) {
                  int var15 = 16 + var14 + var1.field7122;
                  int var6 = var1.field7123 + var13 + 16;
                  int var7 = var15 + (var6 << 7);
                  this.field1250[var7] = 0;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method2576(int var0) {
      try {
         return 16383;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "cs.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   static final int method2595(int var0) {
      try {
         return classFO.field2349 * 1376644555;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "cs.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;B)V")
   @ObfuscatedName("aw")
   static void method2618(Font var0, Font var1, byte var2) {
      try {
         if (classCR.field1230 == null) {
            classVP var4 = classHC.field2767;
            SpritePixels[] var3;
            if (!AbstractArchive.method11853(var4, "sl_back", "", -1199864680)) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               var3 = null;
            } else {
               int var5 = var4.method11848("sl_back", 1835271085);
               int var6 = var4.method11851(var5, "", (byte)-40);
               var3 = classIR.method6307(var4, var5, var6, -1253680523);
            }

            classCR.field1230 = var3;
         }

         if (null == classCF.field720) {
            if (var2 <= 1) {
               return;
            }

            classCF.field720 = classOT.method8732(classHC.field2767, "sl_flags", "", (byte)68);
         }

         if (classPM.field5349 == null) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            classPM.field5349 = classOT.method8732(classHC.field2767, "sl_arrows", "", (byte)44);
         }

         if (null == classPD.field5227) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            classPD.field5227 = classOT.method8732(classHC.field2767, "sl_stars", "", (byte)47);
         }

         if (null == ChatChannel.field590) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            ChatChannel.field590 = classSU.method10680(classHC.field2767, "leftarrow", "", 145885891);
         }

         if (classUR.field6374 == null) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            classUR.field6374 = classSU.method10680(classHC.field2767, "rightarrow", "", -431936289);
         }

         classYW.method13698(classBF.field385 * -329898575, 23, 765, 480, 0);
         classYW.method13699(-329898575 * classBF.field385, 0, 125, 23, 12425273, 9135624);
         classYW.method13699(125 + -329898575 * classBF.field385, 0, 640, 23, 5197647, 2697513);
         var0.method65(classKK.field3912, 62 + classBF.field385 * -329898575, 15, 0, -1);
         if (null != classPD.field5227) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            IndexedSprite.method13810(classPD.field5227[1], 140 + -329898575 * classBF.field385, 1);
            var1.method56(classKK.field3913, 152 + classBF.field385 * -329898575, 10, 16777215, -1);
            IndexedSprite.method13810(classPD.field5227[0], 140 + -329898575 * classBF.field385, 12);
            var1.method56(classKK.field3856, 152 + -329898575 * classBF.field385, 21, 16777215, -1);
         }

         if (null != classPM.field5349) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            int var24 = 280 + -329898575 * classBF.field385;
            if (0 == World.field1154[0] && 0 == World.field1155[0]) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               IndexedSprite.method13810(classPM.field5349[2], var24, 4);
            } else {
               IndexedSprite.method13810(classPM.field5349[0], var24, 4);
            }

            label531: {
               if (World.field1154[0] == 0) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (1 == World.field1155[0]) {
                     if (var2 <= 1) {
                        return;
                     }

                     IndexedSprite.method13810(classPM.field5349[3], var24 + 15, 4);
                     break label531;
                  }
               }

               IndexedSprite.method13810(classPM.field5349[1], var24 + 15, 4);
            }

            var0.method56(classKK.field3697, var24 + 32, 17, 16777215, -1);
            int var26 = classBF.field385 * -329898575 + 390;
            if (World.field1154[0] == 1 && 0 == World.field1155[0]) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               IndexedSprite.method13810(classPM.field5349[2], var26, 4);
            } else {
               IndexedSprite.method13810(classPM.field5349[0], var26, 4);
            }

            label520: {
               if (World.field1154[0] == 1) {
                  if (var2 <= 1) {
                     return;
                  }

                  if (1 == World.field1155[0]) {
                     IndexedSprite.method13810(classPM.field5349[3], 15 + var26, 4);
                     break label520;
                  }
               }

               IndexedSprite.method13810(classPM.field5349[1], 15 + var26, 4);
            }

            int var28;
            label514: {
               var0.method56(classKK.field3898, 32 + var26, 17, 16777215, -1);
               var28 = 500 + -329898575 * classBF.field385;
               if (World.field1154[0] == 2) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (0 == World.field1155[0]) {
                     IndexedSprite.method13810(classPM.field5349[2], var28, 4);
                     break label514;
                  }
               }

               IndexedSprite.method13810(classPM.field5349[0], var28, 4);
            }

            label508: {
               if (World.field1154[0] == 2) {
                  if (var2 <= 1) {
                     return;
                  }

                  if (World.field1155[0] == 1) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }

                     IndexedSprite.method13810(classPM.field5349[3], var28 + 15, 4);
                     break label508;
                  }
               }

               IndexedSprite.method13810(classPM.field5349[1], var28 + 15, 4);
            }

            int var30;
            label502: {
               var0.method56(classKK.field3917, var28 + 32, 17, 16777215, -1);
               var30 = 610 + classBF.field385 * -329898575;
               if (3 == World.field1154[0]) {
                  if (var2 <= 1) {
                     return;
                  }

                  if (0 == World.field1155[0]) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }

                     IndexedSprite.method13810(classPM.field5349[2], var30, 4);
                     break label502;
                  }
               }

               IndexedSprite.method13810(classPM.field5349[0], var30, 4);
            }

            if (World.field1154[0] == 3 && World.field1155[0] == 1) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               IndexedSprite.method13810(classPM.field5349[3], 15 + var30, 4);
            } else {
               IndexedSprite.method13810(classPM.field5349[1], 15 + var30, 4);
            }

            var0.method56(classKK.field3918, 32 + var30, 17, 16777215, -1);
         }

         classYW.method13698(708 + classBF.field385 * -329898575, 4, 50, 16, 0);
         var1.method65(classKK.field3854, 708 + classBF.field385 * -329898575 + 25, 16, 16777215, -1);
         classBF.field400 = -520043415;
         if (classCR.field1230 != null) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            byte var25 = 88;
            byte var27 = 19;
            int var29 = 765 / (var25 + 1) - 1;
            int var31 = 480 / (var27 + 1);

            while (true) {
               int var7 = var31;
               int var8 = var29;
               if (var31 * (var29 - 1) >= -622036481 * World.field1153) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var29--;
               }

               if ((var31 - 1) * var29 >= World.field1153 * -622036481) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var31--;
               }

               if (var29 * (var31 - 1) >= World.field1153 * -622036481) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var31--;
               }

               if (var31 == var7) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var29 == var8) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }

                     var7 = (765 - var29 * var25) / (var29 + 1);
                     if (var7 > 5) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        var7 = 5;
                     }

                     var8 = (480 - var27 * var31) / (var31 + 1);
                     if (var8 > 5) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        var8 = 5;
                     }

                     int var9 = (765 - var25 * var29 - (var29 - 1) * var7) / 2;
                     int var10 = (480 - var31 * var27 - var8 * (var31 - 1)) / 2;
                     int var11 = (World.field1153 * -622036481 + var31 - 1) / var31;
                     classBF.field409 = -1501820553 * (var11 - var29);
                     if (ChatChannel.field590 != null) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (classBF.field408 * -942812997 > 0) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           IndexedSprite.method13810(ChatChannel.field590, 8, 8379747 * IntProjection.field1938 / 2 - ChatChannel.field590.field7119 / 2);
                        }
                     }

                     if (null != classUR.field6374) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (classBF.field408 * -942812997 < classBF.field409 * -343302073) {
                           IndexedSprite.method13810(
                              classUR.field6374,
                              773246731 * classSA.field5897 - classUR.field6374.field7121 - 8,
                              8379747 * IntProjection.field1938 / 2 - classUR.field6374.field7119 / 2
                           );
                        }
                     }

                     int var12 = var10 + 23;
                     int var13 = classBF.field385 * -329898575 + var9;
                     int var14 = 0;
                     boolean var15 = false;
                     int var16 = -942812997 * classBF.field408;

                     for (int var17 = var31 * var16; var17 < -622036481 * World.field1153; var17++) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var16 - -942812997 * classBF.field408 >= var29) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        World var18 = World.field1170[var17];
                        boolean var19 = true;
                        String var20 = Integer.toString(597852065 * var18.field1161);
                        if (-1 == var18.field1161 * 597852065) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var20 = classKK.field3919;
                           var19 = false;
                        } else if (var18.field1161 * 597852065 > 1980) {
                           var20 = classKK.field3839;
                           var19 = false;
                        }

                        classCC var21 = null;
                        int var22 = 0;
                        if (var18.method2506(-403512673)) {
                           if (var2 <= 1) {
                              return;
                           }

                           classCC var10000;
                           if (var18.method2482((byte)-9)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = classCC.field666;
                           } else {
                              var10000 = classCC.field658;
                           }

                           var21 = var10000;
                        } else if (World.method2487(var18, -2093717319)) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var21 = var18.method2482((byte)-40) ? classCC.field667 : classCC.field662;
                        } else if (var18.method2502(-843087954)) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var22 = 16711680;
                           var21 = var18.method2482((byte)-11) ? classCC.field657 : classCC.field656;
                        } else if (var18.method2510(-1979508513)) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           classCC var37;
                           if (var18.method2482((byte)-64)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var37 = classCC.field665;
                           } else {
                              var37 = classCC.field663;
                           }

                           var21 = var37;
                        } else if (var18.method2493(23162323)) {
                           classCC var38;
                           if (var18.method2482((byte)-72)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var38 = classCC.field655;
                           } else {
                              var38 = classCC.field654;
                           }

                           var21 = var38;
                        } else if (World.method2514(var18, (byte)20)) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           classCC var39;
                           if (var18.method2482((byte)-123)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var39 = classCC.field653;
                           } else {
                              var39 = classCC.field659;
                           }

                           var21 = var39;
                        } else if (var18.method2521(-1945769594)) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           classCC var40;
                           if (var18.method2482((byte)-105)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var40 = classCC.field660;
                           } else {
                              var40 = classCC.field664;
                           }

                           var21 = var40;
                        }

                        label563: {
                           if (null != var21) {
                              if (var2 <= 1) {
                                 return;
                              }

                              if (371320039 * var21.field651 < classCR.field1230.length) {
                                 break label563;
                              }

                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }
                           }

                           classCC var41;
                           if (var18.method2482((byte)-1)) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var41 = classCC.field661;
                           } else {
                              var41 = classCC.field652;
                           }

                           var21 = var41;
                        }

                        label466: {
                           if (MouseHandler.MouseHandler_x * -38255113 >= var13 && MouseHandler.MouseHandler_y * -2144333897 >= var12) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (-38255113 * MouseHandler.MouseHandler_x < var25 + var13) {
                                 if (var2 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (-2144333897 * MouseHandler.MouseHandler_y < var27 + var12) {
                                    if (var2 <= 1) {
                                       throw new IllegalStateException();
                                    }

                                    if (var19) {
                                       if (var2 <= 1) {
                                          throw new IllegalStateException();
                                       }

                                       classBF.field400 = 520043415 * var17;
                                       classCR.field1230[var21.field651 * 371320039].method13518(var13, var12, 128, 16777215);
                                       var15 = true;
                                       break label466;
                                    }
                                 }
                              }
                           }

                           classCR.field1230[371320039 * var21.field651].method13508(var13, var12);
                        }

                        if (classCF.field720 != null) {
                           if (var2 <= 1) {
                              return;
                           }

                           IndexedSprite[] var42 = classCF.field720;
                           int var10001;
                           if (var18.method2482((byte)-9)) {
                              if (var2 <= 1) {
                                 return;
                              }

                              var10001 = classCF.field720.length / 2;
                           } else {
                              var10001 = 0;
                           }

                           IndexedSprite.method13810(var42[var10001 + var18.field1160 * -288138629], 29 + var13, var12);
                        }

                        var0.method65(Integer.toString(851246551 * var18.field1162), var13 + 15, var27 / 2 + var12 + 5, var22, -1);
                        var1.method65(var20, 60 + var13, var12 + var27 / 2 + 5, 268435455, -1);
                        var12 += var27 + var8;
                        if (++var14 >= var31) {
                           var12 = 23 + var10;
                           var13 += var25 + var7;
                           var14 = 0;
                           var16++;
                        }
                     }

                     if (var15) {
                        if (var2 <= 1) {
                           throw new IllegalStateException();
                        }

                        int var34 = var1.method36(World.field1170[classBF.field400 * -2105609177].field1167) + 6;
                        int var35 = var1.field8 + 8;
                        int var36 = MouseHandler.MouseHandler_y * -2144333897 + 25;
                        if (var35 + var36 > 480) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var36 = -2144333897 * MouseHandler.MouseHandler_y - 25 - var35;
                        }

                        classYW.method13698(-38255113 * MouseHandler.MouseHandler_x - var34 / 2, var36, var34, var35, 16777120);
                        classYW.method13707(MouseHandler.MouseHandler_x * -38255113 - var34 / 2, var36, var34, var35, 0);
                        var1.method65(
                           World.field1170[classBF.field400 * -2105609177].field1167, MouseHandler.MouseHandler_x * -38255113, var36 + var1.field8 + 4, 0, -1
                        );
                     }
                     break;
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw classEG.newRunException(var23, "cs.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method2588(int var1) {
      try {
         this.field1251 = null;
         this.field1250 = null;
         this.field1252 = null;
         this.field1254 = null;
         this.field1253 = null;
         this.field1253 = null;
         this.field1256 = null;
         this.field1257 = null;
         this.field1236 = 0;
         this.field1234 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   final void method2614(int var1, int var2) {
      try {
         int var3 = 0;

         for (int var4 = 1; var4 < 255; var4++) {
            if (var2 == 120041229) {
               throw new IllegalStateException();
            }

            int var5 = this.field1250[var4] * (256 - var4) / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               if (var2 == 120041229) {
                  throw new IllegalStateException();
               }

               var7 = -var6;
               var6 = 0;
            }

            if (128 + var6 >= classWO.field6763.field6967 * -1238133717) {
               if (var2 == 120041229) {
                  throw new IllegalStateException();
               }

               var8 = -1238133717 * classWO.field6763.field6968 - var6;
            }

            int var9 = classWO.field6763.field6967 * -1238133717 * (var4 + 8) + var6;
            var3 += var7;

            for (int var10 = var7; var10 < var8; var10++) {
               if (var2 == 120041229) {
                  return;
               }

               int var11 = this.field1251[var3++];
               int var12 = var9 % classYW.field7098;
               if (var11 != 0) {
                  if (var2 == 120041229) {
                     throw new IllegalStateException();
                  }

                  if (var12 >= classYW.field7097) {
                     if (var2 == 120041229) {
                        throw new IllegalStateException();
                     }

                     if (var12 < classYW.field7101) {
                        int var14 = 256 - var11;
                        int var18 = this.field1251[var11];
                        int var15 = classWO.field6763.field6971[var9];
                        classWO.field6763.field6971[var9++] = 0xFF000000
                           | ((var15 & 0xFF00) * var14 + (var18 & 0xFF00) * var11 & 0xFF0000)
                                 + ((var15 & 16711935) * var14 + var11 * (var18 & 16711935) & -16711936)
                              >> 8;
                        continue;
                     }
                  }
               }

               var9++;
            }

            var3 += 128 - var8;
         }
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "cs.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ax")
   final int method2601(int var1, int var2, int var3, int var4) {
      try {
         int var5 = 256 - var3;
         return (var5 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + (var5 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "cs.ax(" + 41);
      }
   }
}
