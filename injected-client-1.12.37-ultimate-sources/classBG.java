import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bg")
public class classBG {
   @ObfuscatedName("ae")
   static int[] field437 = new int[32768];
   @ObfuscatedName("aa")
   static int[] field441 = new int[5];
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ap")
   classAQ field448;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final double field443 = 1.0057929410678534;
   @ObfuscatedName("ag")
   static int[] field435 = new int[5];
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ah")
   classAQ field445;
   @ObfuscatedName("ab")
   static int[] field439;
   @ObfuscatedName("ac")
   static int[] field442 = new int[5];
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ay")
   classAQ field452;
   @ObfuscatedName("ao")
   int field434 = 500;
   @ObfuscatedName("al")
   int field433 = 0;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("aj")
   classAQ field447;
   @ObfuscatedName("ax")
   static int[] field436 = new int[5];
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("aq")
   classAQ field449;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ad")
   classAQ field444;
   @ObfuscatedName("af")
   static int[] field440;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("au")
   classAQ field451;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ai")
   classAQ field446;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("ar")
   classAQ field450;
   @ObfuscatedName("av")
   int[] field428;
   @ObfuscatedName("ak")
   int[] field430;
   @ObfuscatedName("aw")
   int[] field431 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("at")
   int field432;
   @ObfuscatedName("an")
   int field429;
   @ObfuscatedName("as")
   static int[] field438 = new int[5];
   @ObfuscatedSignature(descriptor = "Lbr;")
   @ObfuscatedName("am")
   classBR field453;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aa")
   final void method1068(classXY var1) {
      this.field447 = new classAQ();
      classAQ.method645(this.field447, var1);
      this.field452 = new classAQ();
      classAQ.method645(this.field452, var1);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field449 = new classAQ();
         classAQ.method645(this.field449, var1);
         this.field444 = new classAQ();
         classAQ.method645(this.field444, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field448 = new classAQ();
         classAQ.method645(this.field448, var1);
         this.field451 = new classAQ();
         classAQ.method645(this.field451, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field446 = new classAQ();
         classAQ.method645(this.field446, var1);
         this.field450 = new classAQ();
         classAQ.method645(this.field450, var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.method13094((short)1175);
         if (var4 == 0) {
            break;
         }

         this.field431[var3] = var4;
         this.field430[var3] = var1.method13088(-887396761);
         this.field428[var3] = var1.method13094((short)22312);
      }

      this.field432 = var1.method13094((short)12510);
      this.field429 = var1.method13094((short)30094);
      this.field434 = classXY.method13047(var1, -1276016228);
      this.field433 = classXY.method13047(var1, 859250798);
      this.field453 = new classBR();
      this.field445 = new classAQ();
      this.field453.method1197(var1, this.field445);
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("az")
   final int[] method1061(int var1, int var2, int var3) {
      classZZ.method14274(field440, 0, var1);
      if (var2 < 10) {
         return field440;
      } else {
         double var4 = var1 / (var2 + 0.0);
         rl22.method10062(this.field447);
         rl22.method10062(this.field452);
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.field449 != null) {
            rl22.method10062(this.field449);
            rl22.method10062(this.field444);
            var6 = (int)((this.field449.field258 - this.field449.field254) * 32.768 / var4);
            var7 = (int)(this.field449.field254 * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.field448 != null) {
            rl22.method10062(this.field448);
            rl22.method10062(this.field451);
            var9 = (int)((this.field448.field258 - this.field448.field254) * 32.768 / var4);
            var10 = (int)(this.field448.field254 * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (this.field431[var12] != 0) {
               field435[var12] = 0;
               field438[var12] = (int)(this.field428[var12] * var4);
               field436[var12] = (this.field431[var12] << 14) / 100;
               field442[var12] = (int)((this.field447.field258 - this.field447.field254) * 32.768 * Math.pow(1.0057929410678534, this.field430[var12]) / var4);
               field441[var12] = (int)(this.field447.field254 * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = this.field447.method655(var1);
            int var14 = this.field452.method655(var1);
            if (this.field449 != null) {
               int var15 = this.field449.method655(var1);
               int var16 = this.field444.method655(var1);
               var13 += this.method1065(var8, var16, this.field449.field259) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (this.field448 != null) {
               int var32 = this.field448.method655(var1);
               int var36 = this.field451.method655(var1);
               var14 = var14 * ((this.method1065(var11, var36, this.field448.field259) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (this.field431[var33] != 0) {
                  int var37 = var20 + field438[var33];
                  if (var37 < var1) {
                     field440[var37] = field440[var37] + this.method1065(field435[var33], var14 * field436[var33] >> 15, this.field447.field259);
                     field435[var33] = field435[var33] + (var13 * field442[var33] >> 16) + field441[var33];
                  }
               }
            }
         }

         if (this.field446 != null) {
            rl22.method10062(this.field446);
            rl22.method10062(this.field450);
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = this.field446.method655(var1);
               int var17 = this.field450.method655(var1);
               if (var30) {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var38 >> 8);
               } else {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  field440[var34] = 0;
               }
            }
         }

         if (this.field432 > 0 && this.field429 > 0) {
            int var22 = (int)(this.field432 * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               field440[var28] = field440[var28] + field440[var28 - var22] * this.field429 / 100;
            }
         }

         if (this.field453.field537[0] > 0 || this.field453.field537[1] > 0) {
            rl22.method10062(this.field445);
            int var23 = this.field445.method655(var1 + 1);
            int var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
            int var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)field440[var35 + var29 - 1 - var18] * classBR.field533[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)field440[var35 - 1 - var43] * classBR.field533[1][var43] >> 16);
                  }

                  field440[var35] = var41;
                  var23 = this.field445.method655(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)field440[var35 + var29 - 1 - var19] * classBR.field533[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)field440[var35 - 1 - var46] * classBR.field533[1][var46] >> 16);
                     }

                     field440[var35] = var44;
                     var23 = this.field445.method655(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)field440[var35 + var29 - 1 - var47] * classBR.field533[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)field440[var35 - 1 - var48] * classBR.field533[1][var48] >> 16);
                        }

                        field440[var35] = var45;
                        var23 = this.field445.method655(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
                  var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (field440[var25] < -32768) {
               field440[var25] = -32768;
            }

            if (field440[var25] > 32767) {
               field440[var25] = 32767;
            }
         }

         return field440;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   final int method1065(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field439[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field437[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   final void method1069(classXY var1) {
      this.field447 = new classAQ();
      classAQ.method645(this.field447, var1);
      this.field452 = new classAQ();
      classAQ.method645(this.field452, var1);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field449 = new classAQ();
         classAQ.method645(this.field449, var1);
         this.field444 = new classAQ();
         classAQ.method645(this.field444, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field448 = new classAQ();
         classAQ.method645(this.field448, var1);
         this.field451 = new classAQ();
         classAQ.method645(this.field451, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field446 = new classAQ();
         classAQ.method645(this.field446, var1);
         this.field450 = new classAQ();
         classAQ.method645(this.field450, var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.method13094((short)16261);
         if (var4 == 0) {
            break;
         }

         this.field431[var3] = var4;
         this.field430[var3] = var1.method13088(-1416069025);
         this.field428[var3] = var1.method13094((short)13141);
      }

      this.field432 = var1.method13094((short)8799);
      this.field429 = var1.method13094((short)4373);
      this.field434 = classXY.method13047(var1, 1757687103);
      this.field433 = classXY.method13047(var1, 1253667262);
      this.field453 = new classBR();
      this.field445 = new classAQ();
      this.field453.method1197(var1, this.field445);
   }

   classBG() {
      this.field430 = new int[]{0, 0, 0, 0, 0};
      this.field428 = new int[]{0, 0, 0, 0, 0};
      this.field432 = 0;
      this.field429 = 100;
   }

   static {
      Random var0 = new Random(0L);

      for (int var1 = 0; var1 < 32768; var1++) {
         field437[var1] = (var0.nextInt() & 2) - 1;
      }

      field439 = new int[32768];

      for (int var2 = 0; var2 < 32768; var2++) {
         field439[var2] = (int)(Math.sin(var2 / 5215.1903) * 16384.0);
      }

      field440 = new int[220500];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;III)I")
   @ObfuscatedName("wf")
   public static int method1066(classBG var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method1062(var1, var1, var1);
      }

      if (var3 == 1) {
         return (var1 & 32767) < -773741043 ? var2 : -var2;
      } else if (var3 == 2) {
         return field439[var1 & 1956141258] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field437[var1 / 2071023848 & 32767] * var2 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("as")
   final int[] method1062(int var1, int var2, int var3) {
      classZZ.method14274(field440, 0, var1);
      if (var2 < 10) {
         return field440;
      } else {
         double var4 = var1 / (var2 + 0.0);
         rl22.method10062(this.field447);
         rl22.method10062(this.field452);
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.field449 != null) {
            rl22.method10062(this.field449);
            rl22.method10062(this.field444);
            var6 = (int)((this.field449.field258 - this.field449.field254) * 32.768 / var4);
            var7 = (int)(this.field449.field254 * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.field448 != null) {
            rl22.method10062(this.field448);
            rl22.method10062(this.field451);
            var9 = (int)((this.field448.field258 - this.field448.field254) * 32.768 / var4);
            var10 = (int)(this.field448.field254 * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (this.field431[var12] != 0) {
               field435[var12] = 0;
               field438[var12] = (int)(this.field428[var12] * var4);
               field436[var12] = (this.field431[var12] << 14) / 100;
               field442[var12] = (int)((this.field447.field258 - this.field447.field254) * 32.768 * Math.pow(1.0057929410678534, this.field430[var12]) / var4);
               field441[var12] = (int)(this.field447.field254 * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = this.field447.method655(var1);
            int var14 = this.field452.method655(var1);
            if (this.field449 != null) {
               int var15 = this.field449.method655(var1);
               int var16 = this.field444.method655(var1);
               var13 += this.method1065(var8, var16, this.field449.field259) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (this.field448 != null) {
               int var32 = this.field448.method655(var1);
               int var36 = this.field451.method655(var1);
               var14 = var14 * ((this.method1065(var11, var36, this.field448.field259) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (this.field431[var33] != 0) {
                  int var37 = var20 + field438[var33];
                  if (var37 < var1) {
                     field440[var37] = field440[var37] + this.method1065(field435[var33], var14 * field436[var33] >> 15, this.field447.field259);
                     field435[var33] = field435[var33] + (var13 * field442[var33] >> 16) + field441[var33];
                  }
               }
            }
         }

         if (this.field446 != null) {
            rl22.method10062(this.field446);
            rl22.method10062(this.field450);
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = this.field446.method655(var1);
               int var17 = this.field450.method655(var1);
               if (var30) {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var38 >> 8);
               } else {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  field440[var34] = 0;
               }
            }
         }

         if (this.field432 > 0 && this.field429 > 0) {
            int var22 = (int)(this.field432 * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               field440[var28] = field440[var28] + field440[var28 - var22] * this.field429 / 100;
            }
         }

         if (this.field453.field537[0] > 0 || this.field453.field537[1] > 0) {
            rl22.method10062(this.field445);
            int var23 = this.field445.method655(var1 + 1);
            int var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
            int var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)field440[var35 + var29 - 1 - var18] * classBR.field533[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)field440[var35 - 1 - var43] * classBR.field533[1][var43] >> 16);
                  }

                  field440[var35] = var41;
                  var23 = this.field445.method655(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)field440[var35 + var29 - 1 - var19] * classBR.field533[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)field440[var35 - 1 - var46] * classBR.field533[1][var46] >> 16);
                     }

                     field440[var35] = var44;
                     var23 = this.field445.method655(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)field440[var35 + var29 - 1 - var47] * classBR.field533[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)field440[var35 - 1 - var48] * classBR.field533[1][var48] >> 16);
                        }

                        field440[var35] = var45;
                        var23 = this.field445.method655(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
                  var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (field440[var25] < -32768) {
               field440[var25] = -32768;
            }

            if (field440[var25] > 32767) {
               field440[var25] = 32767;
            }
         }

         return field440;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ag")
   final int[] method1063(int var1, int var2, int var3) {
      classZZ.method14274(field440, 0, var1);
      if (var2 < 10) {
         return field440;
      } else {
         double var4 = var1 / (var2 + 0.0);
         rl22.method10062(this.field447);
         rl22.method10062(this.field452);
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.field449 != null) {
            rl22.method10062(this.field449);
            rl22.method10062(this.field444);
            var6 = (int)((this.field449.field258 - this.field449.field254) * 32.768 / var4);
            var7 = (int)(this.field449.field254 * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.field448 != null) {
            rl22.method10062(this.field448);
            rl22.method10062(this.field451);
            var9 = (int)((this.field448.field258 - this.field448.field254) * 32.768 / var4);
            var10 = (int)(this.field448.field254 * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (this.field431[var12] != 0) {
               field435[var12] = 0;
               field438[var12] = (int)(this.field428[var12] * var4);
               field436[var12] = (this.field431[var12] << 14) / 100;
               field442[var12] = (int)((this.field447.field258 - this.field447.field254) * 32.768 * Math.pow(1.0057929410678534, this.field430[var12]) / var4);
               field441[var12] = (int)(this.field447.field254 * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = this.field447.method655(var1);
            int var14 = this.field452.method655(var1);
            if (this.field449 != null) {
               int var15 = this.field449.method655(var1);
               int var16 = this.field444.method655(var1);
               var13 += this.method1065(var8, var16, this.field449.field259) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (this.field448 != null) {
               int var32 = this.field448.method655(var1);
               int var36 = this.field451.method655(var1);
               var14 = var14 * ((this.method1065(var11, var36, this.field448.field259) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (this.field431[var33] != 0) {
                  int var37 = var20 + field438[var33];
                  if (var37 < var1) {
                     field440[var37] = field440[var37] + this.method1065(field435[var33], var14 * field436[var33] >> 15, this.field447.field259);
                     field435[var33] = field435[var33] + (var13 * field442[var33] >> 16) + field441[var33];
                  }
               }
            }
         }

         if (this.field446 != null) {
            rl22.method10062(this.field446);
            rl22.method10062(this.field450);
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = this.field446.method655(var1);
               int var17 = this.field450.method655(var1);
               if (var30) {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var38 >> 8);
               } else {
                  var26 = this.field446.field254 + ((this.field446.field258 - this.field446.field254) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  field440[var34] = 0;
               }
            }
         }

         if (this.field432 > 0 && this.field429 > 0) {
            int var22 = (int)(this.field432 * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               field440[var28] = field440[var28] + field440[var28 - var22] * this.field429 / 1260110397;
            }
         }

         if (this.field453.field537[0] > 0 || this.field453.field537[1] > 0) {
            rl22.method10062(this.field445);
            int var23 = this.field445.method655(var1 + 1);
            int var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
            int var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)field440[var35 + var29 - 1 - var18] * classBR.field533[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)field440[var35 - 1 - var43] * classBR.field533[1][var43] >> 16);
                  }

                  field440[var35] = var41;
                  var23 = this.field445.method655(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)field440[var35 + var29 - 1 - var19] * classBR.field533[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)field440[var35 - 1 - var46] * classBR.field533[1][var46] >> 16);
                     }

                     field440[var35] = var44;
                     var23 = this.field445.method655(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)field440[var35 + var29 - 1 - var47] * classBR.field533[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)field440[var35 - 1 - var48] * classBR.field533[1][var48] >> 16);
                        }

                        field440[var35] = var45;
                        var23 = this.field445.method655(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = this.field453.method1193(0, var23 / 65536.0F, var3);
                  var31 = this.field453.method1193(1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (field440[var25] < -1901917290) {
               field440[var25] = -32768;
            }

            if (field440[var25] > 32767) {
               field440[var25] = 885993274;
            }
         }

         return field440;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ax")
   final int method1067(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field439[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field437[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ao")
   final void method1070(classXY var1) {
      this.field447 = new classAQ();
      classAQ.method645(this.field447, var1);
      this.field452 = new classAQ();
      classAQ.method645(this.field452, var1);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= 1373759744;
         this.field449 = new classAQ();
         classAQ.method645(this.field449, var1);
         this.field444 = new classAQ();
         classAQ.method645(this.field444, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field448 = new classAQ();
         classAQ.method645(this.field448, var1);
         this.field451 = new classAQ();
         classAQ.method645(this.field451, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field446 = new classAQ();
         classAQ.method645(this.field446, var1);
         this.field450 = new classAQ();
         classAQ.method645(this.field450, var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.method13094((short)11288);
         if (var4 == 0) {
            break;
         }

         this.field431[var3] = var4;
         this.field430[var3] = var1.method13088(-1066364384);
         this.field428[var3] = var1.method13094((short)16178);
      }

      this.field432 = var1.method13094((short)31688);
      this.field429 = var1.method13094((short)19126);
      this.field434 = classXY.method13047(var1, -1129938967);
      this.field433 = classXY.method13047(var1, 1062289256);
      this.field453 = new classBR();
      this.field445 = new classAQ();
      this.field453.method1197(var1, this.field445);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;III)[I")
   @ObfuscatedName("ye")
   public static int[] method1064(classBG var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method1067(var1, var1, var1);
      }

      classZZ.method14274(field440, 0, var1);
      if (var2 < 10) {
         return field440;
      } else {
         double var4 = var1 / (var2 + 0.0);
         rl22.method10062(var0.field447);
         rl22.method10062(var0.field452);
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (var0.field449 != null) {
            rl22.method10062(var0.field449);
            rl22.method10062(var0.field444);
            var6 = (int)((var0.field449.field258 - var0.field449.field254) * 32.768 / var4);
            var7 = (int)(var0.field449.field254 * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (var0.field448 != null) {
            rl22.method10062(var0.field448);
            rl22.method10062(var0.field451);
            var9 = (int)((var0.field448.field258 - var0.field448.field254) * 32.768 / var4);
            var10 = (int)(var0.field448.field254 * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (var0.field431[var12] != 0) {
               field435[var12] = 0;
               field438[var12] = (int)(var0.field428[var12] * var4);
               field436[var12] = (var0.field431[var12] << 14) / 100;
               field442[var12] = (int)((var0.field447.field258 - var0.field447.field254) * 32.768 * Math.pow(1.0057929410678534, var0.field430[var12]) / var4);
               field441[var12] = (int)(var0.field447.field254 * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = var0.field447.method655(var1);
            int var14 = var0.field452.method655(var1);
            if (var0.field449 != null) {
               int var15 = var0.field449.method655(var1);
               int var16 = var0.field444.method655(var1);
               var13 += var0.method1065(var8, var16, var0.field449.field259) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (var0.field448 != null) {
               int var32 = var0.field448.method655(var1);
               int var36 = var0.field451.method655(var1);
               var14 = var14 * ((var0.method1065(var11, var36, var0.field448.field259) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (var0.field431[var33] != 0) {
                  int var37 = var20 + field438[var33];
                  if (var37 < var1) {
                     field440[var37] = field440[var37] + var0.method1065(field435[var33], var14 * field436[var33] >> 15, var0.field447.field259);
                     field435[var33] = field435[var33] + (var13 * field442[var33] >> 16) + field441[var33];
                  }
               }
            }
         }

         if (var0.field446 != null) {
            rl22.method10062(var0.field446);
            rl22.method10062(var0.field450);
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = var0.field446.method655(var1);
               int var17 = var0.field450.method655(var1);
               if (var30) {
                  var26 = var0.field446.field254 + ((var0.field446.field258 - var0.field446.field254) * var38 >> 8);
               } else {
                  var26 = var0.field446.field254 + ((var0.field446.field258 - var0.field446.field254) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  field440[var34] = 0;
               }
            }
         }

         if (var0.field432 > 0 && var0.field429 > 0) {
            int var22 = (int)(var0.field432 * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               field440[var28] = field440[var28] + field440[var28 - var22] * var0.field429 / 100;
            }
         }

         if (var0.field453.field537[0] > 0 || var0.field453.field537[1] > 0) {
            rl22.method10062(var0.field445);
            int var23 = var0.field445.method655(var1 + 1);
            int var29 = var0.field453.method1193(0, var23 / 65536.0F, var3);
            int var31 = var0.field453.method1193(1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)field440[var35 + var29 - 1 - var18] * classBR.field533[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)field440[var35 - 1 - var43] * classBR.field533[1][var43] >> 16);
                  }

                  field440[var35] = var41;
                  var23 = var0.field445.method655(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)field440[var35 + var29] * classBR.field542 >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)field440[var35 + var29 - 1 - var19] * classBR.field533[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)field440[var35 - 1 - var46] * classBR.field533[1][var46] >> 16);
                     }

                     field440[var35] = var44;
                     var23 = var0.field445.method655(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)field440[var35 + var29 - 1 - var47] * classBR.field533[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)field440[var35 - 1 - var48] * classBR.field533[1][var48] >> 16);
                        }

                        field440[var35] = var45;
                        var23 = var0.field445.method655(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = var0.field453.method1193(0, var23 / 65536.0F, var3);
                  var31 = var0.field453.method1193(1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (field440[var25] < -32768) {
               field440[var25] = -32768;
            }

            if (field440[var25] > 32767) {
               field440[var25] = 32767;
            }
         }

         return field440;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("al")
   final void method1071(classXY var1) {
      this.field447 = new classAQ();
      classAQ.method645(this.field447, var1);
      this.field452 = new classAQ();
      classAQ.method645(this.field452, var1);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field449 = new classAQ();
         classAQ.method645(this.field449, var1);
         this.field444 = new classAQ();
         classAQ.method645(this.field444, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= 188513080;
         this.field448 = new classAQ();
         classAQ.method645(this.field448, var1);
         this.field451 = new classAQ();
         classAQ.method645(this.field451, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= 587343764;
         this.field446 = new classAQ();
         classAQ.method645(this.field446, var1);
         this.field450 = new classAQ();
         classAQ.method645(this.field450, var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.method13094((short)10962);
         if (var4 == 0) {
            break;
         }

         this.field431[var3] = var4;
         this.field430[var3] = var1.method13088(-1228143983);
         this.field428[var3] = var1.method13094((short)14555);
      }

      this.field432 = var1.method13094((short)15396);
      this.field429 = var1.method13094((short)29464);
      this.field434 = classXY.method13047(var1, -1046184455);
      this.field433 = classXY.method13047(var1, 1747693416);
      this.field453 = new classBR();
      this.field445 = new classAQ();
      this.field453.method1197(var1, this.field445);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aj")
   final void method1072(classXY var1) {
      this.field447 = new classAQ();
      classAQ.method645(this.field447, var1);
      this.field452 = new classAQ();
      classAQ.method645(this.field452, var1);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field449 = new classAQ();
         classAQ.method645(this.field449, var1);
         this.field444 = new classAQ();
         classAQ.method645(this.field444, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field448 = new classAQ();
         classAQ.method645(this.field448, var1);
         this.field451 = new classAQ();
         classAQ.method645(this.field451, var1);
      }

      var2 = classXY.method13039(var1, -346779531);
      if (var2 != 0) {
         var1.field6955 -= -1095856699;
         this.field446 = new classAQ();
         classAQ.method645(this.field446, var1);
         this.field450 = new classAQ();
         classAQ.method645(this.field450, var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.method13094((short)1714);
         if (var4 == 0) {
            break;
         }

         this.field431[var3] = var4;
         this.field430[var3] = var1.method13088(-205172680);
         this.field428[var3] = var1.method13094((short)29225);
      }

      this.field432 = var1.method13094((short)11147);
      this.field429 = var1.method13094((short)7805);
      this.field434 = classXY.method13047(var1, -922429777);
      this.field433 = classXY.method13047(var1, 1483385394);
      this.field453 = new classBR();
      this.field445 = new classAQ();
      this.field453.method1197(var1, this.field445);
   }
}
