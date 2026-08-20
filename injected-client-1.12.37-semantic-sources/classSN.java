import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sn")
public class classSN extends classVJ {
   @ObfuscatedSignature(descriptor = "Lem;")
   @ObfuscatedName("as")
   public classEM field5983;
   @ObfuscatedName("ae")
   int field5982;
   @ObfuscatedSignature(descriptor = "[[Lsu;")
   @ObfuscatedName("ab")
   public classSU[][] field6006;
   @ObfuscatedName("ax")
   int field5992;
   @ObfuscatedName("rn")
   public int[] field6003;
   @ObfuscatedName("db")
   public static final float[] field5987 = new float[4];
   @ObfuscatedName("im")
   public float[] field5998;
   @ObfuscatedName("fh")
   public float[] field5997;
   @ObfuscatedName("yc")
   public byte[] field5996;
   @ObfuscatedName("aa")
   Future field5984;
   @ObfuscatedName("uq")
   public float[] field5999;
   @ObfuscatedName("zy")
   public int[] field6004;
   @ObfuscatedName("if")
   public int[] field6000;
   @ObfuscatedSignature(descriptor = "[[Lsu;")
   @ObfuscatedName("ag")
   classSU[][] field6007;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("yg")
   public static EvictingDualNodeHashTable field5990 = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("ac")
   boolean field5995;
   @ObfuscatedName("na")
   public int[] field6001;
   @ObfuscatedName("jv")
   public short[] field6005;
   @ObfuscatedName("ta")
   public static final float field5989 = Math.ulp(1.0F);
   @ObfuscatedName("pf")
   public int[] field6002;
   @ObfuscatedName("az")
   static int field5993;
   @ObfuscatedName("ao")
   List field5985;
   @ToRemove(unused = "true")
   @ObfuscatedName("ce")
   static final int field5994 = 20;
   @ObfuscatedName("ij")
   public static final float[] field5988 = new float[5];
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field5991 = 16;

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;F)V")
   @ObfuscatedName("qd")
   public void method10547(classUU var1, int var2, classSG var3, float var4) {
      float[] var5 = var3.method10430(this.field5992 * -1268206765);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field6003[var2 * 9 + 3];
      int var10 = this.field6003[var2 * 9 + 4];
      int var11 = this.field6003[var2 * 9 + 5];
      if (var9 != 0) {
         var6 = this.method10541(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method10541(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method10541(var11, var4);
      }

      var1.field6400 = var6;
      var1.field6399 = var7;
      var1.field6395 = var8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;I)Lsn;")
   @ObfuscatedName("al")
   public static classSN method10510(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var4 = var0.method11873(var2 >> 16 & 65535, var2 & 65535, -377859792);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         int var5 = (var4[1] & 255) << 8 | var4[2] & 255;
         byte[] var6 = var1.method11873(var5, 0, -697260666);
         var3 = null != var6;
      }

      if (!var3) {
         return null;
      } else {
         if (classXN.field6891 == null) {
            field5993 = Runtime.getRuntime().availableProcessors() * 1058142237;
            classXN.field6891 = new ThreadPoolExecutor(
               0, -517436875 * field5993, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100 + -204079948 * field5993), new classSF()
            );
         }

         try {
            return new classSN(var0, var1, var2);
         } catch (Exception var7) {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("lr")
   public static int method10544(int var0) {
      if (var0 >= 0 && var0 <= 9) {
         return var0 - 1;
      } else if (var0 >= 10 && var0 <= 15) {
         return var0 - 10;
      } else {
         return var0 == 16 ? 0 : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;I)V")
   @ObfuscatedName("aw")
   void method10524(classUU var1, int var2, classSG var3, int var4) {
      float[] var5 = classSG.method10406(var3, -1268206765 * this.field5992, -2034173247);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.field6007[var2]) {
         classSU var9 = this.field6007[var2][0];
         classSU var10 = this.field6007[var2][1];
         classSU var11 = this.field6007[var2][2];
         if (null != var9) {
            var6 = var9.method10658(var4, -1557225341);
         }

         if (null != var10) {
            var7 = var10.method10658(var4, -1949484415);
         }

         if (var11 != null) {
            var8 = var11.method10658(var4, -1531153766);
         }
      }

      classUL var14 = classAV.method720((byte)0);
      var14.method11371(1.0F, 0.0F, 0.0F, var6, (short)-16336);
      classUL var15 = classAV.method720((byte)0);
      var15.method11371(0.0F, 1.0F, 0.0F, var7, (short)-25814);
      classUL var16 = classAV.method720((byte)0);
      var16.method11371(0.0F, 0.0F, 1.0F, var8, (short)-20889);
      classUL var12 = classAV.method720((byte)0);
      var12.method11390(var16, 1591236864);
      var12.method11390(var14, 1591236864);
      var12.method11390(var15, 1591236864);
      classUU var13 = classRM.method10129(1778071523);
      var13.method11599(var12, 777754821);
      classUU.method11594(var1, var13, -1150667124);
      var14.method11357(-2065053766);
      var15.method11357(1700567985);
      var16.method11357(-759227899);
      var12.method11357(-1807500268);
      var13.method11555(1870675289);
   }

   @ObfuscatedSignature(descriptor = "(ILsg;II)V")
   @ObfuscatedName("ar")
   public void method10522(int var1, classSG var2, int var3, int var4) {
      classUU var5 = classRM.method10129(1778071523);
      method10525(this, var5, var3, var2, var1, 1852786445);
      this.method10529(var5, var3, var2, var1, (short)256);
      this.method10527(var5, var3, var2, var1, (byte)-9);
      var2.method10397(var5, 380315265);
      var5.method11555(2134675276);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method10516(int var1) {
      try {
         return this.field5992 * -1268206765;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sn.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("ra")
   public static int method10548(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      return classEL.method3916(var0, var1, var2, var3, var4, var5, var6, -401031406);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsn;Lxy;I)V")
   @ObfuscatedName("mi")
   public static void method10513(classSN var0, classXY var1, int var2) {
      if (var0 == null) {
         var0.method10537(var1);
      } else {
         classXY.method13047(var1, 676450745);
         classXY.method13047(var1, 1682992360);
         var0.field5992 = classXY.method13039(var1, -346779531) * -514062117;
         int var3 = classXY.method13047(var1, 1198305036);
         var0.field6007 = new classSU[var0.field5983.method3924((byte)-6).method3850(-1583038942)][];
         var0.field6006 = new classSU[var0.field5983.method3923(532989419)][];
         classSV[] var4 = new classSV[var3];

         for (int var5 = 0; var5 < var3; var5++) {
            int var7 = classXY.method13039(var1, -346779531);
            classSK var8 = (classSK)classOF.method8404(classRA.method9936(-480535655), var7, 537646506);
            if (null == var8) {
               var8 = classSK.field5968;
            }

            int var9 = var1.method13088(-391173161);
            classSH var10 = IntProjection.method4079(classXY.method13039(var1, -346779531), 2101652372);
            classSU var11 = new classSU();
            var11.method10651(var1, var2, -1653980620);
            var4[var5] = new classSV(var0, var11, var8, var10, var9);
            int var12 = classSK.method10461(var8, 1572322037);
            classSU[][] var13;
            if (var8 == classSK.field5973) {
               var13 = var0.field6007;
            } else {
               var13 = var0.field6006;
            }

            if (null == var13[var9]) {
               var13[var9] = new classSU[var12];
            }

            if (classSK.field5972 == var8) {
               var0.field5995 = true;
            }
         }

         int var14 = var3 / (-517436875 * field5993);
         int var6 = var3 % (-517436875 * field5993);
         int var16 = 0;

         for (int var17 = 0; var17 < field5993 * -517436875; var17++) {
            int var15 = var16;
            var16 += var14;
            if (var6 > 0) {
               var16++;
               var6--;
            }

            if (var15 == var16) {
               break;
            }

            var0.field5985.add(classXN.field6891.submit(new classTB(var0, var15, var16, var4)));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IF)F")
   @ObfuscatedName("pr")
   public float method10539(int var1, float var2) {
      int var3 = this.field6004[var1 * 2];
      int var4 = this.field6004[var1 * 2 + 1];
      short var5 = this.field6005[var3];
      short var6 = this.field6005[var4 - 1];
      if (var2 < var5) {
         byte var40 = this.field5996[var1 * 2];
         return var40 == 0 ? this.field5999[var3 * 5 + 0] : this.method10546(var1, var2, true);
      } else if (var2 > var6) {
         byte var39 = this.field5996[var1 * 2 + 1];
         return var39 == 0 ? this.field5999[(var4 - 1) * 5 + 0] : this.method10546(var1, var2, false);
      } else {
         boolean var7 = this.method10542(var1, (int)var2, var3, var4);
         int var8 = this.field6000[var1];
         int var9 = this.field6001[var1];
         int var10 = var4 - var3;
         if (var10 <= 0) {
            return 0.0F;
         } else {
            float var11 = this.field5999[var8 * 5 + 3];
            float var12 = this.field5999[var8 * 5 + 4];
            boolean var13 = false;
            boolean var14 = false;
            if (0.0F == var11 && 0.0F == var12) {
               var13 = true;
            } else if (Float.MAX_VALUE == var11 && Float.MAX_VALUE == var12) {
               var14 = true;
            } else if (var8 + 1 < var4) {
               if (var7) {
                  float var16 = this.field6005[var8];
                  float var17 = this.field5999[var8 * 5 + 0];
                  float var18 = var16 + 0.33333334F * var11;
                  float var19 = var12 * 0.33333334F + var17;
                  float var20 = this.field6005[var8 + 1];
                  float var21 = this.field5999[(var8 + 1) * 5 + 0];
                  float var22 = var20 - 0.33333334F * this.field5999[var8 * 5 + 6];
                  float var23 = var21 - this.field5999[(var8 + 1) * 5 + 2] * 0.33333334F;
                  if (var9 != -1) {
                     float var24 = var20 - var16;
                     if (var24 != 0.0F) {
                        float var25 = var18 - var16;
                        float var26 = var22 - var16;
                        float var27 = var25 / var24;
                        float var28 = var26 / var24;
                        this.field5998[var9 + 5] = var27 == 0.33333334F && var28 == 0.6666667F ? 1.0F : 0.0F;
                        float var29 = var27;
                        float var30 = var28;
                        if (var27 < 0.0F) {
                           var27 = 0.0F;
                        }

                        if (var28 > 1.0F) {
                           var28 = 1.0F;
                        }

                        if (var27 > 1.0F || var28 < -1.0F) {
                           var28 = 1.0F - var28;
                           if (var28 < 0.0F) {
                              var28 = 0.0F;
                           }

                           if (var27 > 1.0F || var28 > 1.0F) {
                              float var31 = 1.0F + var27 * (var27 - 2.0F + var28) + (var28 - 2.0F) * var28;
                              if (var31 + field5989 > 0.0F) {
                                 if (field5989 + var27 < 1.3333334F) {
                                    float var32 = var27 - 2.0F;
                                    float var33 = var27 - 1.0F;
                                    float var34 = (float)Math.sqrt(var32 * var32 - var33 * 4.0F * var33);
                                    float var35 = (-var32 + var34) * 0.5F;
                                    if (var28 + field5989 > var35) {
                                       var28 = var35 - field5989;
                                    } else {
                                       var35 = 0.5F * (-var32 - var34);
                                       if (var28 < var35 + field5989) {
                                          var28 = var35 + field5989;
                                       }
                                    }
                                 } else {
                                    var27 = 1.3333334F - field5989;
                                    var28 = 0.33333334F - field5989;
                                 }
                              }
                           }

                           var28 = 1.0F - var28;
                        }

                        if (var27 != var29 && var29 != 0.0F) {
                           var19 = var17 + (var19 - var17) * var27 / var29;
                        }

                        if (var28 != var30 && var30 != 0.0F) {
                           var23 = var21 - (var21 - var23) * (1.0F - var28) / (1.0F - var30);
                        }

                        this.field5997[var1 * 5 + 4] = var16;
                        this.field5998[var9 + 4] = var20;
                        float var54 = var27 - 0.0F;
                        float var55 = var28 - var27;
                        float var56 = 1.0F - var28;
                        float var57 = var55 - var54;
                        this.field5997[var1 * 5 + 3] = var56 - var55 - var57;
                        this.field5997[var1 * 5 + 2] = var57 + var57 + var57;
                        this.field5997[var1 * 5 + 1] = var54 + var54 + var54;
                        this.field5997[var1 * 5 + 0] = 0.0F;
                        float var59 = var19 - var17;
                        float var36 = var23 - var19;
                        float var37 = var21 - var23;
                        float var38 = var36 - var59;
                        this.field5998[var9 + 3] = var37 - var36 - var38;
                        this.field5998[var9 + 2] = var38 + var38 + var38;
                        this.field5998[var9 + 1] = var59 + var59 + var59;
                        this.field5998[var9 + 0] = var17;
                     }
                  } else {
                     this.field5997[var1 * 5 + 4] = var16;
                     float var15 = var20 - var16;
                     float var45 = var21 - var17;
                     float var46 = var18 - var16;
                     float var48 = 0.0F;
                     float var49 = 0.0F;
                     if (var46 != 0.0F) {
                        var48 = (var19 - var17) / var46;
                     }

                     var46 = var20 - var22;
                     if (var46 != 0.0F) {
                        var49 = (var21 - var23) / var46;
                     }

                     float var51 = 1.0F / (var15 * var15);
                     float var52 = var15 * var48;
                     float var53 = var15 * var49;
                     this.field5997[var1 * 5 + 0] = var51 * (var52 + var53 - var45 - var45) / var15;
                     this.field5997[var1 * 5 + 1] = (var45 + var45 + var45 - var52 - var52 - var53) * var51;
                     this.field5997[var1 * 5 + 2] = var48;
                     this.field5997[var1 * 5 + 3] = var17;
                  }
               }
            } else {
               var13 = true;
            }

            if (var13) {
               return this.field5999[var8 * 5 + 0];
            } else if (!var14) {
               if (var9 != -1) {
                  float var43;
                  if (this.field5997[var1 * 5 + 4] == var2) {
                     var43 = 0.0F;
                  } else if (var2 == this.field5998[var9 + 4]) {
                     var43 = 1.0F;
                  } else {
                     var43 = (var2 - this.field5997[var1 * 5 + 4]) / (this.field5998[var9 + 4] - this.field5997[var1 * 5 + 4]);
                  }

                  float var42;
                  if (this.field5998[var9 + 5] != 0.0F) {
                     var42 = var43;
                  } else {
                     field5987[3] = this.field5997[var1 * 5 + 3];
                     field5987[2] = this.field5997[var1 * 5 + 2];
                     field5987[1] = this.field5997[var1 * 5 + 1];
                     field5987[0] = this.field5997[var1 * 5 + 0] - var43;
                     Arrays.fill(field5988, 0.0F);
                     int var44 = method10548(field5987, 3, 0.0F, true, 1.0F, true, field5988);
                     if (var44 == 1) {
                        var42 = field5988[0];
                     } else {
                        var42 = 0.0F;
                     }
                  }

                  return var42 * (this.field5998[var9 + 1] + (var42 * this.field5998[var9 + 3] + this.field5998[var9 + 2]) * var42) + this.field5998[var9 + 0];
               } else {
                  float var41 = var2 - this.field5997[var1 * 5 + 4];
                  return this.field5997[var1 * 5 + 3]
                     + var41 * (this.field5997[var1 * 5 + 2] + (this.field5997[var1 * 5 + 1] + var41 * this.field5997[var1 * 5 + 0]) * var41);
               }
            } else {
               return this.field6005[var8] != var2 && var8 + 1 < var4 ? this.field5999[(var8 + 1) * 5 + 0] : this.field5999[var8 * 5 + 0];
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("vo")
   public boolean method10542(int var1, int var2, int var3, int var4) {
      int var5 = this.field6000[var1];
      if (var5 < 0 || this.field6005[var5] > var2 || var5 + 1 < var4 && this.field6005[var5 + 1] <= var2) {
         int var6 = var4 - var3;
         if (var6 > 0) {
            int var7 = var3;
            int var8 = var4 - 1;

            do {
               int var9 = var8 + var7 >> 1;
               if (var2 < this.field6005[var9]) {
                  if (var2 > this.field6005[var9 - 1]) {
                     var5 = var9 - 1;
                     break;
                  }

                  var8 = var9 - 1;
               } else {
                  if (var2 <= this.field6005[var9]) {
                     var5 = var9;
                     break;
                  }

                  if (var2 < this.field6005[var9 + 1]) {
                     var5 = var9;
                     break;
                  }

                  var7 = var9 + 1;
               }
            } while (var7 <= var8);
         }

         assert var5 != -1;

         if (var5 != this.field6000[var1]) {
            this.field6000[var1] = var5;
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(IFZ)F")
   @ObfuscatedName("cm")
   public float method10546(int var1, float var2, boolean var3) {
      byte var4 = this.field5996[var1 * 2];
      byte var5 = this.field5996[var1 * 2 + 1];
      int var6 = this.field6004[var1 * 2];
      int var7 = this.field6004[var1 * 2 + 1];
      float var8 = 0.0F;
      int var9 = var7 - var6;
      if (var9 == 0) {
         return var8;
      } else {
         float var10 = this.field6005[var6];
         float var11 = this.field6005[var7 - 1];
         float var12 = var11 - var10;
         if (0.0F == var12) {
            return this.field5999[var6 * 5 + 0];
         } else {
            float var13;
            if (var2 > var11) {
               var13 = (var2 - var11) / var12;
            } else {
               var13 = (var2 - var10) / var12;
            }

            float var14 = (int)var13;
            float var15 = Math.abs(var13 - var14);
            float var16 = var15 * var12;
            var14 = Math.abs(var14 + 1.0F);
            float var17 = var14 / 2.0F;
            float var18 = (int)var17;
            var15 = var17 - var18;
            if (var3) {
               if (var4 == 4) {
                  if (0.0F != var15) {
                     var16 += var10;
                  } else {
                     var16 = var11 - var16;
                  }
               } else if (var4 != 2 && var4 != 3) {
                  if (var4 == 1) {
                     var16 = var10 - var2;
                     float var19 = this.field5999[var6 * 5 + 1];
                     float var20 = this.field5999[var6 * 5 + 2];
                     var8 = this.field5999[var6 * 5 + 0];
                     if (0.0F != var19) {
                        var8 -= var20 * var16 / var19;
                     }

                     return var8;
                  }
               } else {
                  var16 = var11 - var16;
               }
            } else if (var5 == 4) {
               if (var15 != 0.0F) {
                  var16 = var11 - var16;
               } else {
                  var16 += var10;
               }
            } else if (var5 != 2 && var5 != 3) {
               if (var5 == 1) {
                  var16 = var2 - var11;
                  float var29 = this.field5999[(var7 - 1) * 5 + 3];
                  float var30 = this.field5999[(var7 - 1) * 5 + 4];
                  var8 = this.field5999[(var7 - 1) * 5 + 0];
                  if (0.0F != var29) {
                     var8 += var30 * var16 / var29;
                  }

                  return var8;
               }
            } else {
               var16 += var10;
            }

            var8 = this.method10539(var1, var16);
            if (var3 && var4 == 3) {
               float var31 = this.field5999[(var7 - 1) * 5 + 0] - this.field5999[var6 * 5 + 0];
               var8 -= var14 * var31;
            } else if (!var3 && var5 == 3) {
               float var21 = this.field5999[(var7 - 1) * 5 + 0] - this.field5999[var6 * 5 + 0];
               var8 += var21 * var14;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ph")
   public void method10535(classXY var1) {
      try {
         int var2 = var1.method13271();
         int var3 = var1.method13271();
         this.field5992 = var1.method13267() * -514062117;
         this.field6003 = new int[this.field5983.field1788.method3875() * 9];
         this.field6002 = new int[this.field5983.field1786 * 1690200285 * 1];
         int var4 = var1.method13271();
         int[] var5 = new int[var4];
         this.field6004 = new int[var4 * 2];
         this.field6000 = new int[var4];
         Arrays.fill(this.field6000, -1);
         this.field6001 = new int[var4];
         this.field5997 = new float[var4 * 5];
         this.field5996 = new byte[var4 * 2];
         int var6 = 0;
         int var7 = 0;

         for (int var8 = 0; var8 < var4; var8++) {
            int var9 = var1.method13267();
            int var10 = var1.method13261();
            int var11 = var1.method13267();
            int var12 = var1.method13271();
            var1.method13267();
            this.field5996[var8 * 2] = var1.method13268();
            this.field5996[var8 * 2 + 1] = var1.method13268();
            byte var13 = var1.method13267() != 0;
            this.field6001[var8] = var13 ? 6 * var7++ : -1;
            var5[var8] = var1.method13262();
            this.field6004[var8 * 2] = var6;
            this.field6004[var8 * 2 + 1] = var6 + var12;
            var6 += var12;
            var1.method13270(var1.method13262() + 22 * var12);
            int[] var20;
            if (var9 == 1) {
               var20 = this.field6003;
               var13 = 9;
            } else {
               var20 = this.field6002;
               var13 = 1;
            }

            int var14 = method10544(var11);
            if (var14 < var13) {
               var20[var10 * var13 + var14] = var8 + 1;
            }

            if (var9 == 4) {
               this.field5995 = true;
            }
         }

         this.field5998 = new float[6 * var7];
         this.field6005 = new short[var6];
         this.field5999 = new float[var6 * 5];

         for (int var16 = 0; var16 < var4; var16++) {
            var1.method13270(var5[var16]);
            int var17 = this.field6004[var16 * 2];

            for (int var18 = this.field6004[var16 * 2 + 1]; var17 < var18; var17++) {
               this.field6005[var17] = (short)var1.method13259();

               for (int var19 = 0; var19 < 5; var19++) {
                  this.field5999[var17 * 5 + var19] = var1.method13265();
               }
            }
         }
      } catch (Exception var15) {
         client.field1026.error("AnimMaya{}", this.field5982 * 36494709, var15);
         throw var15;
      }
   }

   classSN(AbstractArchive var1, AbstractArchive var2, int var3) {
      this.field5982 = var3 * -1390589219;
      classXY var4 = new classXY(var1.loadData(this.field5982 * 36494709 >> 16 & 65535, this.field5982 * 36494709 & 65535));
      int var5 = var4.method13267();
      int var6 = var4.method13271();
      byte[] var7 = var2.method11878(var6, 0);
      this.field5983 = new classEM(var6, var7);
      this.field5984 = classXN.field6891.submit(() -> this.method10535(var4));
      classXN.field6891.submit(() -> this.field5983.field1788.method3869());
      this.field5985 = Collections.emptyList();
   }

   @ObfuscatedSignature(descriptor = "(ILsg;III)V")
   @ObfuscatedName("as")
   public void method10540(int var1, classSG var2, int var3, int var4, int var5) {
      this.method10538(rl21.field5728, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;IB)V")
   @ObfuscatedName("ac")
   void method10527(classUU var1, int var2, classSG var3, int var4, byte var5) {
      try {
         float[] var6 = var3.method10410(this.field5992 * -1268206765, -316051969);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.field6007[var2] != null) {
            classSU var10 = this.field6007[var2][3];
            classSU var11 = this.field6007[var2][4];
            classSU var12 = this.field6007[var2][5];
            if (var10 != null) {
               if (var5 >= 0) {
                  throw new IllegalStateException();
               }

               var7 = var10.method10658(var4, -1619814348);
            }

            if (null != var11) {
               if (var5 >= 0) {
                  throw new IllegalStateException();
               }

               var8 = var11.method10658(var4, -632917876);
            }

            if (null != var12) {
               if (var5 >= 0) {
                  throw new IllegalStateException();
               }

               var9 = var12.method10658(var4, -1727092833);
            }
         }

         var1.field6400 = var7;
         var1.field6399 = var8;
         var1.field6395 = var9;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "sn.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;IS)V")
   @ObfuscatedName("aa")
   void method10529(classUU var1, int var2, classSG var3, int var4, short var5) {
      try {
         float[] var6 = classSG.method10414(var3, this.field5992 * -1268206765, -16766288);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.field6007[var2] != null) {
            if (var5 != 256) {
               throw new IllegalStateException();
            }

            classSU var10 = this.field6007[var2][6];
            classSU var11 = this.field6007[var2][7];
            classSU var12 = this.field6007[var2][8];
            if (null != var10) {
               if (var5 != 256) {
                  return;
               }

               var7 = var10.method10658(var4, -1878576001);
            }

            if (null != var11) {
               if (var5 != 256) {
                  throw new IllegalStateException();
               }

               var8 = var11.method10658(var4, -509834605);
            }

            if (null != var12) {
               if (var5 != 256) {
                  throw new IllegalStateException();
               }

               var9 = var12.method10658(var4, -1625958300);
            }
         }

         classUU var14 = classRM.method10129(1778071523);
         var14.method11588(var7, var8, var9, -2144009080);
         classUU.method11594(var1, var14, 791745756);
         var14.method11555(1651346424);
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "sn.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IF)F")
   @ObfuscatedName("we")
   public float method10541(int var1, float var2) {
      return this.method10539(var1 - 1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;I)Lsn;")
   @ObfuscatedName("ao")
   public static classSN method10511(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var4 = var0.method11873(var2 >> 16 & 65535, var2 & 1551507207, -214121856);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         int var5 = (var4[1] & -1912984364) << 8 | var4[2] & -1630191000;
         byte[] var6 = var1.method11873(var5, 0, 1596615103);
         var3 = null != var6;
      }

      if (!var3) {
         return null;
      } else {
         if (classXN.field6891 == null) {
            field5993 = Runtime.getRuntime().availableProcessors() * 1058142237;
            classXN.field6891 = new ThreadPoolExecutor(
               0, -517436875 * field5993, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(-430134785 + -456228500 * field5993), new classSF()
            );
         }

         try {
            return new classSN(var0, var1, var2);
         } catch (Exception var7) {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILsg;II)V")
   @ObfuscatedName("ai")
   public void method10523(int var1, classSG var2, int var3, int var4) {
      classUU var5 = classRM.method10129(1778071523);
      method10525(this, var5, var3, var2, var1, 1119198647);
      this.method10529(var5, var3, var2, var1, (short)256);
      this.method10527(var5, var3, var2, var1, (byte)-85);
      var2.method10397(var5, -45412633);
      var5.method11555(1861208492);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsn;Luu;ILsg;I)V")
   @ObfuscatedName("pm")
   public static void method10528(classSN var0, classUU var1, int var2, classSG var3, int var4) {
      float[] var5 = var3.method10410(var0.field5992 * -1268206765, -316051969);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (var0.field6007[var2] != null) {
         classSU var9 = var0.field6007[var2][3];
         classSU var10 = var0.field6007[var2][4];
         classSU var11 = var0.field6007[var2][5];
         if (var9 != null) {
            var6 = var9.method10658(var4, -1202514749);
         }

         if (null != var10) {
            var7 = var10.method10658(var4, -658281798);
         }

         if (null != var11) {
            var8 = var11.method10658(var4, -882306359);
         }
      }

      var1.field6400 = var6;
      var1.field6399 = var7;
      var1.field6395 = var8;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   public boolean method10543(byte var1) {
      Future var2 = this.field5984;
      if (var2 == null) {
         return true;
      } else if (var2.isDone()) {
         this.field5984 = null;
         this.field5985 = null;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method10515() {
      if (null == this.field5984 && null == this.field5985) {
         return true;
      } else {
         if (this.field5984 != null) {
            if (!this.field5984.isDone()) {
               return false;
            }

            this.field5984 = null;
         }

         boolean var1 = true;

         for (int var2 = 0; var2 < this.field5985.size(); var2++) {
            if (!((Future)this.field5985.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field5985.remove(var2);
               var2--;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field5985 = null;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;F)V")
   @ObfuscatedName("uy")
   public void method10536(classUU var1, int var2, classSG var3, float var4) {
      float[] var5 = var3.method10425(this.field5992 * -1268206765);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field6003[var2 * 9 + 6];
      int var10 = this.field6003[var2 * 9 + 7];
      int var11 = this.field6003[var2 * 9 + 8];
      if (var9 != 0) {
         var6 = this.method10541(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method10541(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method10541(var11, var4);
      }

      classUU var12 = classUU.method11645();
      var12.method11659(var6, var7, var8);
      var1.method11652(var12);
      var12.method11662();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method10517() {
      return this.field5992 * -1268206765;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("af")
   void method10514(classXY var1, int var2, int var3) {
      try {
         classXY.method13047(var1, -1008441641);
         classXY.method13047(var1, 1360168439);
         this.field5992 = classXY.method13039(var1, -346779531) * -514062117;
         int var4 = classXY.method13047(var1, -1112808975);
         this.field6007 = new classSU[this.field5983.method3924((byte)12).method3850(1786141898)][];
         this.field6006 = new classSU[this.field5983.method3923(162047720)][];
         classSV[] var5 = new classSV[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            if (var3 == -435781219) {
               throw new IllegalStateException();
            }

            int var8 = classXY.method13039(var1, -346779531);
            classSK var9 = (classSK)classOF.method8404(classRA.method9936(-819351264), var8, 714166249);
            if (null == var9) {
               if (var3 == -435781219) {
                  return;
               }

               var9 = classSK.field5968;
            }

            int var10 = var1.method13088(-1383485269);
            classSH var11 = IntProjection.method4079(classXY.method13039(var1, -346779531), -2064244240);
            classSU var12 = new classSU();
            var12.method10651(var1, var2, -1970030991);
            var5[var6] = new classSV(this, var12, var9, var11, var10);
            int var13 = classSK.method10461(var9, 1572322037);
            classSU[][] var14;
            if (var9 == classSK.field5973) {
               if (var3 == -435781219) {
                  return;
               }

               var14 = this.field6007;
            } else {
               var14 = this.field6006;
            }

            if (null == var14[var10]) {
               if (var3 == -435781219) {
                  return;
               }

               var14[var10] = new classSU[var13];
            }

            if (classSK.field5972 == var9) {
               this.field5995 = true;
            }
         }

         int var16 = var4 / (-517436875 * field5993);
         int var7 = var4 % (-517436875 * field5993);
         int var18 = 0;

         for (int var19 = 0; var19 < field5993 * -517436875; var19++) {
            if (var3 == -435781219) {
               throw new IllegalStateException();
            }

            int var17 = var18;
            var18 += var16;
            if (var7 > 0) {
               if (var3 == -435781219) {
                  throw new IllegalStateException();
               }

               var18++;
               var7--;
            }

            if (var17 == var18) {
               if (var3 == -435781219) {
                  return;
               }
               break;
            }

            this.field5985.add(classXN.field6891.submit(new classTB(this, var17, var18, var5)));
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "sn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)Z")
   @ObfuscatedName("we")
   public static boolean method10518(classSN var0, int var1) {
      if (var0 == null) {
         return var0.method10521(var1);
      } else {
         try {
            return var0.field5995;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "sn.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method10519() {
      return this.field5995;
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;I)V")
   @ObfuscatedName("at")
   void method10530(classUU var1, int var2, classSG var3, int var4) {
      float[] var5 = classSG.method10414(var3, this.field5992 * -85587021, -1992505766);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field6007[var2] != null) {
         classSU var9 = this.field6007[var2][6];
         classSU var10 = this.field6007[var2][7];
         classSU var11 = this.field6007[var2][8];
         if (null != var9) {
            var6 = var9.method10658(var4, -1472378621);
         }

         if (null != var10) {
            var7 = var10.method10658(var4, -1628440073);
         }

         if (null != var11) {
            var8 = var11.method10658(var4, -870875110);
         }
      }

      classUU var12 = classRM.method10129(1778071523);
      var12.method11588(var6, var7, var8, -2142493065);
      classUU.method11594(var1, var12, 161997312);
      var12.method11555(1686622920);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;I)Lsn;")
   @ObfuscatedName("aj")
   public static classSN method10512(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var4 = var0.method11873(var2 >> 16 & 65535, var2 & 1938265762, -179901292);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         int var5 = (var4[1] & 657266300) << 8 | var4[2] & 255;
         byte[] var6 = var1.method11873(var5, 0, -831728089);
         var3 = null != var6;
      }

      if (!var3) {
         return null;
      } else {
         if (classXN.field6891 == null) {
            field5993 = Runtime.getRuntime().availableProcessors() * -1069883518;
            classXN.field6891 = new ThreadPoolExecutor(
               0, -1442751278 * field5993, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100 + -204079948 * field5993), new classSF()
            );
         }

         try {
            return new classSN(var0, var1, var2);
         } catch (Exception var7) {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method10520() {
      return this.field5995;
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;I)V")
   @ObfuscatedName("av")
   void method10531(classUU var1, int var2, classSG var3, int var4) {
      float[] var5 = classSG.method10414(var3, this.field5992 * -1268206765, -1136523565);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field6007[var2] != null) {
         classSU var9 = this.field6007[var2][6];
         classSU var10 = this.field6007[var2][7];
         classSU var11 = this.field6007[var2][8];
         if (null != var9) {
            var6 = var9.method10658(var4, -1746856060);
         }

         if (null != var10) {
            var7 = var10.method10658(var4, -1449765769);
         }

         if (null != var11) {
            var8 = var11.method10658(var4, -1669248191);
         }
      }

      classUU var12 = classRM.method10129(1778071523);
      var12.method11588(var6, var7, var8, -2146230438);
      classUU.method11594(var1, var12, 1267259805);
      var12.method11555(2118943037);
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;ILsg;II)V")
   @ObfuscatedName("kj")
   public void method10538(rl21 var1, int var2, classSG var3, int var4, int var5) {
      float var6 = var2 + (float)classMG.field4500;
      classUU var7 = classUU.method11645();
      this.method10533(var7, var4, var3, var6);
      this.method10536(var7, var4, var3, var6);
      this.method10547(var7, var4, var3, var6);
      var1.method10061(var7, var4);
      var7.method11662();
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("aq")
   public static boolean method10532(char var0, int var1) {
      try {
         if (var0 >= '0') {
            if (var1 == 1296729483) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               return true;
            }

            if (var1 == 1296729483) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 'A') {
            if (var1 == 1296729483) {
               throw new IllegalStateException();
            }

            if (var0 <= 'Z') {
               return true;
            }

            if (var1 == 1296729483) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 'a') {
            if (var1 == 1296729483) {
               throw new IllegalStateException();
            }

            if (var0 <= 'z') {
               if (var1 == 1296729483) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sn.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("qr")
   public boolean method10549() {
      return this.method10543((byte)-20);
   }

   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("bs")
   public static synchronized classSN method10534(int var0) {
      classSN var1 = (classSN)field5990.method6444(var0);
      if (var1 != null) {
         return var1;
      } else {
         classVP var3 = client.field1027[22];
         classVP var4 = client.field1027[1];
         byte[] var5 = var3.method11878(var0 >> 16 & 65535, var0 & 65535);
         boolean var2;
         if (var5 == null) {
            var2 = false;
         } else {
            int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
            byte[] var7 = var4.method11878(var6, 0);
            var2 = var7 != null;
         }

         if (!var2) {
            return null;
         } else {
            if (classXN.field6891 == null) {
               field5993 = Runtime.getRuntime().availableProcessors() * 1058142237;
               classXN.field6891 = new ThreadPoolExecutor(
                  0, field5993 * -517436875, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(field5993 * -517436875 * 100 + 100), new classSF()
               );
            }

            var1 = new classSN(client.field1027[22], client.field1027[1], var0);
            field5990.method6445(var1, var0);
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;F)V")
   @ObfuscatedName("gv")
   public void method10533(classUU var1, int var2, classSG var3, float var4) {
      float[] var5 = var3.method10431(this.field5992 * -1268206765);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field6003[var2 * 9 + 0];
      int var10 = this.field6003[var2 * 9 + 1];
      int var11 = this.field6003[var2 * 9 + 2];
      if (var9 != 0) {
         var6 = this.method10541(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method10541(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method10541(var11, var4);
      }

      classUL var12 = classUL.method11405();
      classUL var13 = classUL.method11405();
      var13.method11406(0.0F, 0.0F, 1.0F, var8);
      classCD.method1435(var12, var13);
      var13.method11406(1.0F, 0.0F, 0.0F, var6);
      classCD.method1435(var12, var13);
      var13.method11406(0.0F, 1.0F, 0.0F, var7);
      classCD.method1435(var12, var13);
      classUU var14 = classUU.method11645();
      var14.method11650(var12);
      var1.method11652(var14);
      var14.method11662();
      var12.method11402();
      var13.method11402();
   }

   @ObfuscatedSignature(descriptor = "(Lsn;Luu;ILsg;II)V")
   @ObfuscatedName("bs")
   public static void method10525(classSN var0, classUU var1, int var2, classSG var3, int var4, int var5) {
      if (var0 == null) {
         var0.method10526(var1, var2, var3, var2, var2);
      } else {
         try {
            float[] var6 = classSG.method10406(var3, -1268206765 * var0.field5992, -2034173247);
            float var7 = var6[0];
            float var8 = var6[1];
            float var9 = var6[2];
            if (null != var0.field6007[var2]) {
               if (var5 == -2059694667) {
                  return;
               }

               classSU var10 = var0.field6007[var2][0];
               classSU var11 = var0.field6007[var2][1];
               classSU var12 = var0.field6007[var2][2];
               if (null != var10) {
                  if (var5 == -2059694667) {
                     throw new IllegalStateException();
                  }

                  var7 = var10.method10658(var4, -805817691);
               }

               if (null != var11) {
                  var8 = var11.method10658(var4, -1732400191);
               }

               if (var12 != null) {
                  if (var5 == -2059694667) {
                     return;
                  }

                  var9 = var12.method10658(var4, -544400739);
               }
            }

            classUL var16 = classAV.method720((byte)0);
            var16.method11371(1.0F, 0.0F, 0.0F, var7, (short)-24168);
            classUL var17 = classAV.method720((byte)0);
            var17.method11371(0.0F, 1.0F, 0.0F, var8, (short)-26915);
            classUL var18 = classAV.method720((byte)0);
            var18.method11371(0.0F, 0.0F, 1.0F, var9, (short)-30774);
            classUL var13 = classAV.method720((byte)0);
            var13.method11390(var18, 1591236864);
            var13.method11390(var16, 1591236864);
            var13.method11390(var17, 1591236864);
            classUU var14 = classRM.method10129(1778071523);
            var14.method11599(var13, 777754821);
            classUU.method11594(var1, var14, -382262825);
            var16.method11357(-1304519495);
            var17.method11357(-1193863561);
            var18.method11357(-701725761);
            var13.method11357(-207024086);
            var14.method11555(1805636757);
         } catch (RuntimeException var15) {
            throw classEG.method3884(var15, "sn.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;ILsg;II)V")
   @ObfuscatedName("ax")
   void method10526(classUU var1, int var2, classSG var3, int var4, int var5) {
      try {
         float[] var6 = classSG.method10406(var3, -1268206765 * this.field5982, -2034173247);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.field6007[var2]) {
            if (var5 == -2059694667) {
               return;
            }

            classSU var10 = this.field6007[var2][0];
            classSU var11 = this.field6007[var2][1];
            classSU var12 = this.field6007[var2][2];
            if (null != var10) {
               if (var5 == -2059694667) {
                  throw new IllegalStateException();
               }

               var7 = var10.method10658(var4, -805817691);
            }

            if (null != var11) {
               var8 = var11.method10658(var4, -1732400191);
            }

            if (var12 != null) {
               if (var5 == -2059694667) {
                  return;
               }

               var9 = var12.method10658(var4, -544400739);
            }
         }

         classUL var16 = classAV.method720((byte)0);
         var16.method11371(1.0F, 0.0F, 0.0F, var7, (short)-24168);
         classUL var17 = classAV.method720((byte)0);
         var17.method11371(0.0F, 1.0F, 0.0F, var8, (short)-26915);
         classUL var18 = classAV.method720((byte)0);
         var18.method11371(0.0F, 0.0F, 1.0F, var9, (short)-30774);
         classUL var13 = classAV.method720((byte)0);
         var13.method11390(var18, 1591236864);
         var13.method11390(var16, 1591236864);
         var13.method11390(var17, 1591236864);
         classUU var14 = classRM.method10129(1778071523);
         var14.method11599(var13, 777754821);
         classUU.method11594(var1, var14, -382262825);
         var16.method11357(-1304519495);
         var17.method11357(-1193863561);
         var18.method11357(-701725761);
         var13.method11357(-207024086);
         var14.method11609(1805636757);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "sn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method10521(int var1) {
      try {
         return this.field5995;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sn.ag(" + ')');
      }
   }
}
