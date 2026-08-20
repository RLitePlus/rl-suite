import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lw")
public class class288 {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field3792 = 25;
   @ObfuscatedSignature(descriptor = "[Lkm;")
   @ObfuscatedName("av")
   classKM[] field3795;
   @ToRemove(unused = "true")
   @ObfuscatedName("cf")
   static final int field3794 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field3793 = 32768;

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ac")
   final boolean method7311(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5) {
      int var6 = var5.method6480((byte)0);
      int var7 = var5.method6481((byte)-114);
      int[][] var8 = var5.method6487((short)222);
      int[][] var9 = var5.method6484((byte)89);
      int[] var10 = var5.method6492(1180324680);
      int[] var11 = var5.method6495(-1991638363);
      int var12 = var5.method6499((short)255);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 454724516;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      var11[var19++] = var2;

      while (var19 != var20) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var21 = var13 - CollisionMap.method6369(var4, -836526735);
         int var22 = var14 - CollisionMap.method6373(var4, (short)12901);
         if (var3.hasArrived(2, var13, var14, var4, (byte)101)) {
            var5.method6473(var13, var14, -768637108);
            return true;
         }

         int var23 = 1 + var8[var15][var16];
         if (var15 > 0
            && var9[var15 - 1][var16] == 0
            && !var4.method6386(var21 - 1, var22, 1076101390, 433121914)
            && !var4.method6386(var21 - 1, var22 + 1, 830424343, 450051558)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var23;
         }

         if (var15 < var6 - 2
            && var9[var15 + 1][var16] == 0
            && !var4.method6386(var21 + 2, var22, -2083319520, -1991077875)
            && !var4.method6386(var21 + 2, var22 + 1, 1076101600, -375077891)) {
            var10[var19] = 1 + var13;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var23;
         }

         if (var16 > 0
            && var9[var15][var16 - 1] == 0
            && !var4.method6386(var21, var22 - 1, -229987069, 1158258535)
            && !var4.method6386(var21 + 1, var22 - 1, 1076101507, -1583707460)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var23;
         }

         if (var16 < var7 - 2
            && 0 == var9[var15][1 + var16]
            && !var4.method6386(var21, 2 + var22, 1076101432, 1312749033)
            && !var4.method6386(var21 + 1, 2 + var22, 1076101600, -1658926383)) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][1 + var16] = var23;
         }

         if (var15 > 0
            && var16 > 0
            && var9[var15 - 1][var16 - 1] == 0
            && !var4.method6386(var21 - 1, var22, 1076101438, -1124136759)
            && !var4.method6386(var21 - 1, var22 - 1, 1696611728, 860183154)
            && !var4.method6386(var21, var22 - 1, 1076101519, 714415171)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 > 0
            && 0 == var9[1 + var15][var16 - 1]
            && !var4.method6386(var21 + 1, var22 - 1, -1298572976, -34039328)
            && !var4.method6386(2 + var21, var22 - 1, 1076101507, -763456239)
            && !var4.method6386(var21 + 2, var22, -1429313495, -881938055)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var23;
         }

         if (var15 > 0
            && var16 < var7 - 2
            && 0 == var9[var15 - 1][1 + var16]
            && !var4.method6386(var21 - 1, 1 + var22, 1076101438, -1535664431)
            && !var4.method6386(var21 - 1, var22 + 2, 1729288040, 130944172)
            && !var4.method6386(var21, 2 + var22, -2018238152, -1863424095)) {
            var10[var19] = var13 - 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 < var7 - 2
            && var9[1 + var15][1 + var16] == 0
            && !var4.method6386(var21 + 1, var22 + 2, 2095903573, 751997665)
            && !var4.method6386(2 + var21, var22 + 2, 1076101600, -1397036620)
            && !var4.method6386(2 + var21, var22 + 1, -1983986849, -1286947087)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 + 1;
            var19 = 1 + var19 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][1 + var16] = var23;
         }
      }

      var5.method6473(var13, var14, -768637108);
      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public void method7295(int var1) {
      try {
         this.field3795 = new classKM[1];
         class282 var2 = class282.field3258;
         this.field3795[0] = new classKM(var2.field3253 * 694917719, var2.field3255 * 1471367001);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void method7296() {
      this.field3795 = new classKM[1];
      class282 var1 = class282.field3258;
      this.field3795[0] = new classKM(var1.field3253 * 694917719, var1.field3255 * 1471367001);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;[Lxm;)V")
   @ObfuscatedName("hm")
   public static void method7315(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      if (var0 == null) {
         var0.method7006(var1, var1, var1, var1, var3);
      }

      var0.method7062(var1, var2, var3, 1055655472);
      WorldMapRegion.method7060(var0, var1, var2, var3, var5, (byte)39);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IIILks;Lkk;Z[I[ILkm;)I")
   @ObfuscatedName("ey")
   public static int method7303(
      class288 var0, int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, classKM var9
   ) {
      if (var0 == null) {
         var0.method7313(var1, var1, var4, var5, var9);
      }

      var9.method6471(-2052465350);
      int var10 = var9.method6480((byte)0);
      int var11 = var9.method6481((byte)-108);
      int[][] var12 = var9.method6487((short)222);
      int[][] var13 = var9.method6484((byte)122);
      int[] var14 = var9.method6492(-509869956);
      int[] var15 = var9.method6495(-1484713638);
      boolean var16;
      if (1 == var3) {
         var16 = var0.method7309(var1, var2, var4, var5, var9, 1674200609);
      } else if (2 == var3) {
         var16 = var0.method7312(var1, var2, var4, var5, var9, -424339957);
      } else {
         var16 = var0.method7316(var1, var2, var3, var4, var5, var9, -101888226);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.method6476((byte)24);
      int var20 = var9.method6479(1041465838);
      if (!var16) {
         if (!var6) {
            return -1;
         }

         int var21 = Integer.MAX_VALUE;
         int var22 = Integer.MAX_VALUE;
         byte var23 = 10;
         int var24 = -119525533 * var4.approxDestinationSizeY;
         int var25 = 1419634615 * var4.approxDestinationX;
         int var26 = 2063768593 * var4.approxDestinationSizeX;
         int var27 = 1083678259 * var4.approxDestinationY;

         for (int var28 = var24 - var23; var28 <= var24 + var23; var28++) {
            for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var32 * var32 + var33 * var33;
                  if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var19 == var1 && var20 == var2) {
         var7[0] = var19;
         var8[0] = var20;
         return 0;
      } else {
         int var35 = 0;
         var14[var35] = var19;
         var15[var35++] = var20;

         int var38;
         for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var37 = var13[var19 - var17][var20 - var18]) {
            if (var38 != var37) {
               var38 = var37;
               var14[var35] = var19;
               var15[var35++] = var20;
            }

            if ((var37 & 2) != 0) {
               var19++;
            } else if ((var37 & 8) != 0) {
               var19--;
            }

            if ((var37 & 1) != 0) {
               var20++;
            } else if (0 != (var37 & 4)) {
               var20--;
            }
         }

         int var39 = 0;

         while (var35-- > 0) {
            var7[var39] = var14[var35];
            var8[var39++] = var15[var35];
            if (var39 >= var7.length) {
               break;
            }
         }

         return var39;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lpv;")
   @ObfuscatedName("av")
   public static GameBuild[] method7299(int var0) {
      try {
         return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP, GameBuild.RC};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;I)Z")
   @ObfuscatedName("ae")
   final boolean method7312(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5, int var6) {
      try {
         int var7 = var5.method6480((byte)0);
         int var8 = var5.method6481((byte)-112);
         int[][] var9 = var5.method6487((short)222);
         int[][] var10 = var5.method6484((byte)39);
         int[] var11 = var5.method6492(-788817276);
         int[] var12 = var5.method6495(-440621292);
         int var13 = var5.method6499((short)255);
         int var14 = var1;
         int var15 = var2;
         int var16 = var7 >> 1;
         int var17 = var8 >> 1;
         int var18 = var1 - var16;
         int var19 = var2 - var17;
         var10[var16][var17] = 99;
         var9[var16][var17] = 0;
         int var20 = 0;
         int var21 = 0;
         var11[var20] = var1;
         var12[var20++] = var2;

         while (var20 != var21) {
            if (var6 == -126668884) {
               throw new IllegalStateException();
            }

            var14 = var11[var21];
            var15 = var12[var21];
            var21 = 1 + var21 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var22 = var14 - CollisionMap.method6369(var4, 2133112339);
            int var23 = var15 - CollisionMap.method6373(var4, (short)30205);
            if (var3.hasArrived(2, var14, var15, var4, (byte)68)) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               var5.method6473(var14, var15, -768637108);
               return true;
            }

            int var24 = 1 + var9[var16][var17];
            if (var16 > 0) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][var17] != 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 - 1, var23, 1076101390, 228551399)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 - 1, var23 + 1, 1076101432, -1740688668)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15;
                  var20 = 1 + var20 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var24;
               }
            }

            if (var16 < var7 - 2) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var10[var16 + 1][var17] != 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 + 2, var23, 1076101507, -488346472)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (!var4.method6386(var22 + 2, var23 + 1, 1076101600, -1771556990)) {
                  var11[var20] = 1 + var14;
                  var12[var20] = var15;
                  var20 = 1 + var20 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[var16 + 1][var17] = var24;
               }
            }

            if (var17 > 0) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 - 1] != 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22, var23 - 1, 1076101390, 1069227443)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 + 1, var23 - 1, 1076101507, -2052263802)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var20] = var14;
                  var12[var20] = var15 - 1;
                  var20 = var20 + 1 & var13;
                  var10[var16][var17 - 1] = 1;
                  var9[var16][var17 - 1] = var24;
               }
            }

            if (var17 < var8 - 2) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (0 != var10[var16][1 + var17]) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22, 2 + var23, 1076101432, 212320127)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 + 1, 2 + var23, 1076101600, -1369757413)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var20] = var14;
                  var12[var20] = var15 + 1;
                  var20 = var20 + 1 & var13;
                  var10[var16][1 + var17] = 4;
                  var9[var16][1 + var17] = var24;
               }
            }

            if (var16 > 0 && var17 > 0) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][var17 - 1] != 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 - 1, var23, 1076101438, -1533408545)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (!var4.method6386(var22 - 1, var23 - 1, 1076101390, -1413533774)) {
                  if (var4.method6386(var22, var23 - 1, 1076101519, -2096324361)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var20] = var14 - 1;
                     var12[var20] = var15 - 1;
                     var20 = 1 + var20 & var13;
                     var10[var16 - 1][var17 - 1] = 3;
                     var9[var16 - 1][var17 - 1] = var24;
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }

                  if (0 != var10[1 + var16][var17 - 1]) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (var4.method6386(var22 + 1, var23 - 1, 1076101519, -460920943)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (var4.method6386(2 + var22, var23 - 1, 1076101507, 485001877)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (var4.method6386(var22 + 2, var23, 1076101603, -2091382791)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var20] = var14 + 1;
                     var12[var20] = var15 - 1;
                     var20 = 1 + var20 & var13;
                     var10[1 + var16][var17 - 1] = 9;
                     var9[var16 + 1][var17 - 1] = var24;
                  }
               }
            }

            if (var16 > 0) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 2) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }

                  if (0 != var10[var16 - 1][1 + var17]) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (var4.method6386(var22 - 1, 1 + var23, 1076101438, -650037563)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (var4.method6386(var22 - 1, var23 + 2, 1076101432, 908585069)) {
                     if (var6 == -126668884) {
                        throw new IllegalStateException();
                     }
                  } else if (!var4.method6386(var22, 2 + var23, 1076101624, -214720462)) {
                     var11[var20] = var14 - 1;
                     var12[var20] = 1 + var15;
                     var20 = 1 + var20 & var13;
                     var10[var16 - 1][var17 + 1] = 6;
                     var9[var16 - 1][var17 + 1] = var24;
                  }
               }
            }

            if (var16 < var7 - 2 && var17 < var8 - 2) {
               if (var6 == -126668884) {
                  throw new IllegalStateException();
               }

               if (var10[1 + var16][1 + var17] != 0) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(var22 + 1, var23 + 2, 1076101624, -1887246266)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(2 + var22, var23 + 2, 1076101600, -1858640959)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else if (var4.method6386(2 + var22, var23 + 1, 1076101603, -366758329)) {
                  if (var6 == -126668884) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var20] = var14 + 1;
                  var12[var20] = var15 + 1;
                  var20 = 1 + var20 & var13;
                  var10[var16 + 1][var17 + 1] = 12;
                  var9[var16 + 1][1 + var17] = var24;
               }
            }
         }

         var5.method6473(var14, var15, -768637108);
         return false;
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "lw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Lkm;I)Z")
   @ObfuscatedName("aj")
   final boolean method7316(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, classKM var6, int var7) {
      try {
         int var8 = var6.method6480((byte)0);
         int var9 = var6.method6481((byte)-100);
         int[][] var10 = var6.method6487((short)222);
         int[][] var11 = var6.method6484((byte)64);
         int[] var12 = var6.method6492(-93855849);
         int[] var13 = var6.method6495(-713118564);
         int var14 = var6.method6499((short)255);
         int var15 = var1;
         int var16 = var2;
         int var17 = var8 >> 1;
         int var18 = var9 >> 1;
         int var19 = var1 - var17;
         int var20 = var2 - var18;
         var11[var17][var18] = 99;
         var10[var17][var18] = 0;
         int var21 = 0;
         int var22 = 0;
         var12[var21] = var1;
         var13[var21++] = var2;

         label428:
         while (var21 != var22) {
            if (var7 == 22751753) {
               throw new IllegalStateException();
            }

            var15 = var12[var22];
            var16 = var13[var22];
            var22 = var22 + 1 & var14;
            var17 = var15 - var19;
            var18 = var16 - var20;
            int var23 = var15 - CollisionMap.method6369(var5, -1452009436);
            int var24 = var16 - CollisionMap.method6373(var5, (short)23685);
            if (var4.hasArrived(var3, var15, var16, var5, (byte)30)) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               var6.method6473(var15, var16, -768637108);
               return true;
            }

            int var25 = var10[var17][var18] + 1;
            if (var17 > 0) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (0 != var11[var17 - 1][var18]) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (!var5.method6386(var23 - 1, var24, 1076101390, 868775725)) {
                  if (var5.method6386(var23 - 1, var24 + var3 - 1, 1076101432, 119998255)) {
                     if (var7 == 22751753) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label434: {
                        for (int var26 = 1; var26 < var3 - 1; var26++) {
                           if (var7 == 22751753) {
                              throw new IllegalStateException();
                           }

                           if (var5.method6386(var23 - 1, var26 + var24, 1076101438, -765262073)) {
                              if (var7 == 22751753) {
                                 throw new IllegalStateException();
                              }
                              break label434;
                           }
                        }

                        var12[var21] = var15 - 1;
                        var13[var21] = var16;
                        var21 = var21 + 1 & var14;
                        var11[var17 - 1][var18] = 2;
                        var10[var17 - 1][var18] = var25;
                     }
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (var11[1 + var17][var18] != 0) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else {
                  label406:
                  if (!var5.method6386(var3 + var23, var24, 1076101507, -1806675915)
                     && !var5.method6386(var3 + var23, var24 + var3 - 1, 1076101600, -519759987)) {
                     for (int var31 = 1; var31 < var3 - 1; var31++) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }

                        if (var5.method6386(var23 + var3, var31 + var24, 1076101603, -1766459198)) {
                           break label406;
                        }
                     }

                     var12[var21] = 1 + var15;
                     var13[var21] = var16;
                     var21 = var21 + 1 & var14;
                     var11[1 + var17][var18] = 8;
                     var10[1 + var17][var18] = var25;
                  }
               }
            }

            if (var18 > 0) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (var11[var17][var18 - 1] != 0) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method6386(var23, var24 - 1, 1076101390, -2085224162)) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method6386(var23 + var3 - 1, var24 - 1, 1076101507, -766610257)) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else {
                  label438: {
                     for (int var32 = 1; var32 < var3 - 1; var32++) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }

                        if (var5.method6386(var32 + var23, var24 - 1, 1076101519, 1078886721)) {
                           if (var7 == 22751753) {
                              throw new IllegalStateException();
                           }
                           break label438;
                        }
                     }

                     var12[var21] = var15;
                     var13[var21] = var16 - 1;
                     var21 = 1 + var21 & var14;
                     var11[var17][var18 - 1] = 1;
                     var10[var17][var18 - 1] = var25;
                  }
               }
            }

            if (var18 < var9 - var3) {
               if (0 != var11[var17][var18 + 1]) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method6386(var23, var3 + var24, 1076101432, 1470515285)) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method6386(var23 + var3 - 1, var24 + var3, 1076101600, 1120549998)) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else {
                  label440: {
                     for (int var33 = 1; var33 < var3 - 1; var33++) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }

                        if (var5.method6386(var33 + var23, var3 + var24, 1076101624, -140603906)) {
                           break label440;
                        }
                     }

                     var12[var21] = var15;
                     var13[var21] = var16 + 1;
                     var21 = 1 + var21 & var14;
                     var11[var17][1 + var18] = 4;
                     var10[var17][1 + var18] = var25;
                  }
               }
            }

            if (var17 > 0 && var18 > 0) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (var11[var17 - 1][var18 - 1] != 0) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method6386(var23 - 1, var24 - 1, 1076101390, 223448565)) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }
               } else {
                  int var34 = 1;

                  while (true) {
                     if (var34 >= var3) {
                        var12[var21] = var15 - 1;
                        var13[var21] = var16 - 1;
                        var21 = 1 + var21 & var14;
                        var11[var17 - 1][var18 - 1] = 3;
                        var10[var17 - 1][var18 - 1] = var25;
                        break;
                     }

                     if (var5.method6386(var23 - 1, var34 + (var24 - 1), 1076101438, -744470068)) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     if (var5.method6386(var23 - 1 + var34, var24 - 1, 1076101519, 426227680)) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var34++;
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (var18 > 0) {
                  if (var7 == 22751753) {
                     throw new IllegalStateException();
                  }

                  if (var11[1 + var17][var18 - 1] != 0) {
                     if (var7 == 22751753) {
                        throw new IllegalStateException();
                     }
                  } else if (var5.method6386(var23 + var3, var24 - 1, 1076101507, -108571420)) {
                     if (var7 == 22751753) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label443: {
                        for (int var35 = 1; var35 < var3; var35++) {
                           if (var7 == 22751753) {
                              throw new IllegalStateException();
                           }

                           if (var5.method6386(var3 + var23, var35 + (var24 - 1), 1076101603, -628196380)) {
                              if (var7 == 22751753) {
                                 throw new IllegalStateException();
                              }
                              break label443;
                           }

                           if (var5.method6386(var35 + var23, var24 - 1, 1076101519, -473573749)) {
                              if (var7 == 22751753) {
                                 throw new IllegalStateException();
                              }
                              break label443;
                           }
                        }

                        var12[var21] = 1 + var15;
                        var13[var21] = var16 - 1;
                        var21 = var21 + 1 & var14;
                        var11[var17 + 1][var18 - 1] = 9;
                        var10[1 + var17][var18 - 1] = var25;
                     }
                  }
               }
            }

            if (var17 > 0) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (var18 < var9 - var3) {
                  if (var11[var17 - 1][1 + var18] != 0) {
                     if (var7 == 22751753) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label324:
                     if (!var5.method6386(var23 - 1, var3 + var24, 1076101432, -997995548)) {
                        for (int var36 = 1; var36 < var3; var36++) {
                           if (var7 == 22751753) {
                              throw new IllegalStateException();
                           }

                           if (var5.method6386(var23 - 1, var24 + var36, 1076101438, 469364376)) {
                              if (var7 == 22751753) {
                                 throw new IllegalStateException();
                              }
                              break label324;
                           }

                           if (var5.method6386(var36 + (var23 - 1), var3 + var24, 1076101624, -1652444031)) {
                              if (var7 == 22751753) {
                                 throw new IllegalStateException();
                              }
                              break label324;
                           }
                        }

                        var12[var21] = var15 - 1;
                        var13[var21] = var16 + 1;
                        var21 = var21 + 1 & var14;
                        var11[var17 - 1][1 + var18] = 6;
                        var10[var17 - 1][var18 + 1] = var25;
                     }
                  }
               }
            }

            if (var17 < var8 - var3 && var18 < var9 - var3) {
               if (var7 == 22751753) {
                  throw new IllegalStateException();
               }

               if (0 == var11[var17 + 1][1 + var18]) {
                  if (var5.method6386(var23 + var3, var24 + var3, 1076101600, 697228819)) {
                     if (var7 == 22751753) {
                        throw new IllegalStateException();
                     }
                  } else {
                     for (int var37 = 1; var37 < var3; var37++) {
                        if (var7 == 22751753) {
                           throw new IllegalStateException();
                        }

                        if (var5.method6386(var37 + var23, var24 + var3, 1076101624, 723203997)) {
                           if (var7 == 22751753) {
                              throw new IllegalStateException();
                           }
                           continue label428;
                        }

                        if (var5.method6386(var3 + var23, var37 + var24, 1076101603, 632749223)) {
                           continue label428;
                        }
                     }

                     var12[var21] = 1 + var15;
                     var13[var21] = 1 + var16;
                     var21 = var21 + 1 & var14;
                     var11[1 + var17][var18 + 1] = 12;
                     var10[var17 + 1][1 + var18] = var25;
                  }
               }
            }
         }

         var6.method6473(var15, var16, -768637108);
         return false;
      } catch (RuntimeException var27) {
         throw RestClientThreadFactory.newRunException(var27, "lw.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ar")
   final boolean method7317(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, classKM var6) {
      int var7 = var6.method6480((byte)0);
      int var8 = var6.method6481((byte)-27);
      int[][] var9 = var6.method6487((short)222);
      int[][] var10 = var6.method6484((byte)48);
      int[] var11 = var6.method6492(324521763);
      int[] var12 = var6.method6495(-1898101715);
      int var13 = var6.method6499((short)255);
      int var14 = var1;
      int var15 = var2;
      int var16 = var7 >> 1;
      int var17 = var8 >> 1;
      int var18 = var1 - var16;
      int var19 = var2 - var17;
      var10[var16][var17] = 99;
      var9[var16][var17] = 0;
      int var20 = 0;
      int var21 = 0;
      var11[var20] = var1;
      var12[var20++] = var2;

      label336:
      while (var20 != var21) {
         var14 = var11[var21];
         var15 = var12[var21];
         var21 = var21 + 1 & var13;
         var16 = var14 - var18;
         var17 = var15 - var19;
         int var22 = var14 - CollisionMap.method6369(var5, -1072212514);
         int var23 = var15 - CollisionMap.method6373(var5, (short)423);
         if (var4.hasArrived(var3, var14, var15, var5, (byte)21)) {
            var6.method6473(var14, var15, -768637108);
            return true;
         }

         int var24 = var9[var16][var17] + 1;
         if (var16 > 0
            && 0 == var10[var16 - 1][var17]
            && !var5.method6386(var22 - 1, var23, 1076101390, 425279535)
            && !var5.method6386(var22 - 1, var23 + var3 - 1, -200583994, -1798385184)) {
            int var25 = 1;

            while (true) {
               if (var25 >= var3 - 1) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15;
                  var20 = var20 + 1 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var25 + var23, 1076101438, 1298667174)) {
                  break;
               }

               var25++;
            }
         }

         if (var16 < var7 - var3
            && var10[1 + var16][var17] == 0
            && !var5.method6386(var3 + var22, var23, 1076101507, -2028487720)
            && !var5.method6386(var3 + var22, var23 + var3 - 1, 681682583, -512958698)) {
            int var29 = 1;

            while (true) {
               if (var29 >= var3 - 1) {
                  var11[var20] = 1 + var14;
                  var12[var20] = var15;
                  var20 = var20 + 1 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[1 + var16][var17] = var24;
                  break;
               }

               if (var5.method6386(var22 + var3, var29 + var23, 1076101603, -21393637)) {
                  break;
               }

               var29++;
            }
         }

         if (var17 > 0
            && var10[var16][var17 - 1] == 0
            && !var5.method6386(var22, var23 - 1, 1076101390, -1396372327)
            && !var5.method6386(var22 + var3 - 1, var23 - 1, 1076101507, -427836852)) {
            int var30 = 1;

            while (true) {
               if (var30 >= var3 - 1) {
                  var11[var20] = var14;
                  var12[var20] = var15 - 1;
                  var20 = 1 + var20 & var13;
                  var10[var16][var17 - 1] = 1;
                  var9[var16][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var30 + var22, var23 - 1, 462628055, 1340619830)) {
                  break;
               }

               var30++;
            }
         }

         if (var17 < var8 - var3
            && 0 == var10[var16][var17 + 1]
            && !var5.method6386(var22, var3 + var23, 1076101432, 218035242)
            && !var5.method6386(var22 + var3 - 1, var23 + var3, -1792821904, 920674980)) {
            int var31 = 1;

            while (true) {
               if (var31 >= var3 - 1) {
                  var11[var20] = var14;
                  var12[var20] = var15 + 1;
                  var20 = 1 + var20 & var13;
                  var10[var16][1 + var17] = 4;
                  var9[var16][1 + var17] = var24;
                  break;
               }

               if (var5.method6386(var31 + var22, var3 + var23, 1692570534, 44788026)) {
                  break;
               }

               var31++;
            }
         }

         if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.method6386(var22 - 1, var23 - 1, 2005753634, 663402863)) {
            int var32 = 1;

            while (true) {
               if (var32 >= var3) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15 - 1;
                  var20 = 1 + var20 & var13;
                  var10[var16 - 1][var17 - 1] = 3;
                  var9[var16 - 1][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var32 + (var23 - 1), 1076101438, -1403550986)
                  || var5.method6386(var22 - 1 + var32, var23 - 1, -2080446237, 129497653)) {
                  break;
               }

               var32++;
            }
         }

         if (var16 < var7 - var3 && var17 > 0 && var10[1 + var16][var17 - 1] == 0 && !var5.method6386(var22 + var3, var23 - 1, -1948118602, 646744204)) {
            int var33 = 1;

            while (true) {
               if (var33 >= var3) {
                  var11[var20] = 1 + var14;
                  var12[var20] = var15 - 1;
                  var20 = var20 + 1 & var13;
                  var10[var16 + 1][var17 - 1] = 9;
                  var9[1 + var16][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var3 + var22, var33 + (var23 - 1), -202678314, 820621186)
                  || var5.method6386(var33 + var22, var23 - 1, 1789064754, 240546142)) {
                  break;
               }

               var33++;
            }
         }

         if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][1 + var17] == 0 && !var5.method6386(var22 - 1, var3 + var23, 1076101432, -29414621)) {
            int var34 = 1;

            while (true) {
               if (var34 >= var3) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15 + 1;
                  var20 = var20 + 1 & var13;
                  var10[var16 - 1][1 + var17] = 6;
                  var9[var16 - 1][var17 + 1] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var23 + var34, 1076101438, 1354650151)
                  || var5.method6386(var34 + (var22 - 1), var3 + var23, -1573844930, -918678779)) {
                  break;
               }

               var34++;
            }
         }

         if (var16 < var7 - var3
            && var17 < var8 - var3
            && 0 == var10[var16 + 1][1 + var17]
            && !var5.method6386(var22 + var3, var23 + var3, 218301191, -1256329910)) {
            for (int var35 = 1; var35 < var3; var35++) {
               if (var5.method6386(var35 + var22, var23 + var3, 45728817, -588371491) || var5.method6386(var3 + var22, var35 + var23, 878764533, 511569438)) {
                  continue label336;
               }
            }

            var11[var20] = 1 + var14;
            var12[var20] = 1 + var15;
            var20 = var20 + 1 & var13;
            var10[1 + var16][var17 + 1] = 12;
            var9[var16 + 1][1 + var17] = var24;
         }
      }

      var6.method6473(var14, var15, -768637108);
      return false;
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Z[I[II)I")
   @ObfuscatedName("at")
   public int method7300(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, int var9) {
      try {
         return this.method7305(var1, var2, var3, var4, var5, var6, var7, var8, this.field3795[0], -2046753734);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "lw.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Z[I[I)I")
   @ObfuscatedName("ay")
   public int method7301(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
      return this.method7305(var1, var2, var3, var4, var5, var6, var7, var8, this.field3795[0], -2123993540);
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Z[I[I)I")
   @ObfuscatedName("au")
   public int method7302(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
      return this.method7305(var1, var2, var3, var4, var5, var6, var7, var8, this.field3795[0], -1827600731);
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Z[I[ILkm;)I")
   @ObfuscatedName("ad")
   int method7304(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, classKM var9) {
      var9.method6471(-628412593);
      int var10 = var9.method6480((byte)0);
      int var11 = var9.method6481((byte)-67);
      int[][] var12 = var9.method6487((short)222);
      int[][] var13 = var9.method6484((byte)73);
      int[] var14 = var9.method6492(1443558954);
      int[] var15 = var9.method6495(-686268620);
      boolean var16;
      if (1 == var3) {
         var16 = this.method7309(var1, var2, var4, var5, var9, 2082646814);
      } else if (2 == var3) {
         var16 = this.method7312(var1, var2, var4, var5, var9, -1927838396);
      } else {
         var16 = this.method7316(var1, var2, var3, var4, var5, var9, -2122093298);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.method6476((byte)-63);
      int var20 = var9.method6479(1041465838);
      if (!var16) {
         if (!var6) {
            return -1;
         }

         int var21 = Integer.MAX_VALUE;
         int var22 = Integer.MAX_VALUE;
         byte var23 = 10;
         int var24 = -119525533 * var4.approxDestinationSizeY;
         int var25 = 1419634615 * var4.approxDestinationX;
         int var26 = 2063768593 * var4.approxDestinationSizeX;
         int var27 = 1083678259 * var4.approxDestinationY;

         for (int var28 = var24 - var23; var28 <= var24 + var23; var28++) {
            for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var32 * var32 + var33 * var33;
                  if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var19 == var1 && var20 == var2) {
         var7[0] = var19;
         var8[0] = var20;
         return 0;
      } else {
         int var35 = 0;
         var14[var35] = var19;
         var15[var35++] = var20;

         int var38;
         for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var37 = var13[var19 - var17][var20 - var18]) {
            if (var38 != var37) {
               var38 = var37;
               var14[var35] = var19;
               var15[var35++] = var20;
            }

            if ((var37 & 2) != 0) {
               var19++;
            } else if ((var37 & 8) != 0) {
               var19--;
            }

            if ((var37 & 1) != 0) {
               var20++;
            } else if (0 != (var37 & 4)) {
               var20--;
            }
         }

         int var39 = 0;

         while (var35-- > 0) {
            var7[var39] = var14[var35];
            var8[var39++] = var15[var35];
            if (var39 >= var7.length) {
               break;
            }
         }

         return var39;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ai")
   final boolean method7308(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5) {
      int var6 = var5.method6480((byte)0);
      int var7 = var5.method6481((byte)-3);
      int[][] var8 = var5.method6487((short)222);
      int[][] var9 = var5.method6484((byte)120);
      int[] var10 = var5.method6492(1700508415);
      int[] var11 = var5.method6495(-1579051327);
      int var12 = var5.method6499((short)255);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      var11[var19++] = var2;

      while (var20 != var19) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = var20 + 1 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var21 = var13 - CollisionMap.method6369(var4, 1705803595);
         int var22 = var14 - CollisionMap.method6373(var4, (short)20576);
         if (var3.hasArrived(1, var13, var14, var4, (byte)55)) {
            var5.method6473(var13, var14, -768637108);
            return true;
         }

         int var23 = 1 + var8[var15][var16];
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && !var4.method6386(var21 - 1, var22, 1076101384, 965719239)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var23;
         }

         if (var15 < var6 - 1 && var9[1 + var15][var16] == 0 && !var4.method6386(1 + var21, var22, 1076101504, 56596084)) {
            var10[var19] = 1 + var13;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var23;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6386(var21, var22 - 1, 1076101378, -993433423)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var23;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && !var4.method6386(var21, 1 + var22, 1076101408, -167628869)) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = 1 + var19 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][var16 + 1] = var23;
         }

         if (var15 > 0
            && var16 > 0
            && 0 == var9[var15 - 1][var16 - 1]
            && !var4.method6386(var21 - 1, var22 - 1, 1076101390, 299671448)
            && !var4.method6386(var21 - 1, var22, 1076101384, -2105929294)
            && !var4.method6386(var21, var22 - 1, 1076101378, 599294349)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var23;
         }

         if (var15 < var6 - 1
            && var16 > 0
            && 0 == var9[1 + var15][var16 - 1]
            && !var4.method6386(var21 + 1, var22 - 1, 1076101507, -1412911957)
            && !var4.method6386(1 + var21, var22, 1076101504, 107702458)
            && !var4.method6386(var21, var22 - 1, 1076101378, -966073793)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var23;
         }

         if (var15 > 0
            && var16 < var7 - 1
            && var9[var15 - 1][1 + var16] == 0
            && !var4.method6386(var21 - 1, var22 + 1, 1076101432, 236011312)
            && !var4.method6386(var21 - 1, var22, 1076101384, -1603677746)
            && !var4.method6386(var21, 1 + var22, 1076101408, -189433012)) {
            var10[var19] = var13 - 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][var16 + 1] = var23;
         }

         if (var15 < var6 - 1
            && var16 < var7 - 1
            && 0 == var9[1 + var15][1 + var16]
            && !var4.method6386(1 + var21, 1 + var22, 1076101600, 893800233)
            && !var4.method6386(var21 + 1, var22, 1076101504, 424416953)
            && !var4.method6386(var21, 1 + var22, 1076101408, -1462745535)) {
            var10[var19] = var13 + 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[var15 + 1][var16 + 1] = var23;
         }
      }

      var5.method6473(var13, var14, -768637108);
      return false;
   }

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;I)Z")
   @ObfuscatedName("an")
   final boolean method7309(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5, int var6) {
      try {
         int var7 = var5.method6480((byte)0);
         int var8 = var5.method6481((byte)-66);
         int[][] var9 = var5.method6487((short)222);
         int[][] var10 = var5.method6484((byte)79);
         int[] var11 = var5.method6492(-2028539772);
         int[] var12 = var5.method6495(-425615664);
         int var13 = var5.method6499((short)255);
         int var14 = var1;
         int var15 = var2;
         int var16 = var7 >> 1;
         int var17 = var8 >> 1;
         int var18 = var1 - var16;
         int var19 = var2 - var17;
         var10[var16][var17] = 99;
         var9[var16][var17] = 0;
         int var20 = 0;
         int var21 = 0;
         var11[var20] = var1;
         var12[var20++] = var2;

         while (var21 != var20) {
            if (var6 <= 1612218878) {
               throw new IllegalStateException();
            }

            var14 = var11[var21];
            var15 = var12[var21];
            var21 = var21 + 1 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var22 = var14 - CollisionMap.method6369(var4, 1713094960);
            int var23 = var15 - CollisionMap.method6373(var4, (short)7957);
            if (var3.hasArrived(1, var14, var15, var4, (byte)64)) {
               var5.method6473(var14, var15, -768637108);
               return true;
            }

            int var24 = 1 + var9[var16][var17];
            if (var16 > 0) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (0 == var10[var16 - 1][var17] && !var4.method6386(var22 - 1, var23, 1076101384, 660108619)) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  var11[var20] = var14 - 1;
                  var12[var20] = var15;
                  var20 = 1 + var20 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var24;
               }
            }

            if (var16 < var7 - 1) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var10[1 + var16][var17] == 0) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (!var4.method6386(1 + var22, var23, 1076101504, 1277222560)) {
                     var11[var20] = 1 + var14;
                     var12[var20] = var15;
                     var20 = var20 + 1 & var13;
                     var10[var16 + 1][var17] = 8;
                     var9[var16 + 1][var17] = var24;
                  }
               }
            }

            if (var17 > 0) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 - 1] == 0) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (!var4.method6386(var22, var23 - 1, 1076101378, 697598861)) {
                     if (var6 <= 1612218878) {
                        throw new IllegalStateException();
                     }

                     var11[var20] = var14;
                     var12[var20] = var15 - 1;
                     var20 = var20 + 1 & var13;
                     var10[var16][var17 - 1] = 1;
                     var9[var16][var17 - 1] = var24;
                  }
               }
            }

            if (var17 < var8 - 1) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (0 == var10[var16][1 + var17] && !var4.method6386(var22, 1 + var23, 1076101408, -966167809)) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  var11[var20] = var14;
                  var12[var20] = var15 + 1;
                  var20 = 1 + var20 & var13;
                  var10[var16][1 + var17] = 4;
                  var9[var16][var17 + 1] = var24;
               }
            }

            if (var16 > 0) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var17 > 0 && 0 == var10[var16 - 1][var17 - 1]) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (!var4.method6386(var22 - 1, var23 - 1, 1076101390, -1174840029)) {
                     if (var6 <= 1612218878) {
                        throw new IllegalStateException();
                     }

                     if (!var4.method6386(var22 - 1, var23, 1076101384, 747895143)) {
                        if (var6 <= 1612218878) {
                           throw new IllegalStateException();
                        }

                        if (!var4.method6386(var22, var23 - 1, 1076101378, -1903173693)) {
                           if (var6 <= 1612218878) {
                              throw new IllegalStateException();
                           }

                           var11[var20] = var14 - 1;
                           var12[var20] = var15 - 1;
                           var20 = 1 + var20 & var13;
                           var10[var16 - 1][var17 - 1] = 3;
                           var9[var16 - 1][var17 - 1] = var24;
                        }
                     }
                  }
               }
            }

            if (var16 < var7 - 1) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (0 == var10[1 + var16][var17 - 1]) {
                     if (var6 <= 1612218878) {
                        throw new IllegalStateException();
                     }

                     if (!var4.method6386(var22 + 1, var23 - 1, 1076101507, -1275145750) && !var4.method6386(1 + var22, var23, 1076101504, -1851925691)) {
                        if (var6 <= 1612218878) {
                           throw new IllegalStateException();
                        }

                        if (!var4.method6386(var22, var23 - 1, 1076101378, -1091584657)) {
                           if (var6 <= 1612218878) {
                              throw new IllegalStateException();
                           }

                           var11[var20] = var14 + 1;
                           var12[var20] = var15 - 1;
                           var20 = 1 + var20 & var13;
                           var10[var16 + 1][var17 - 1] = 9;
                           var9[1 + var16][var17 - 1] = var24;
                        }
                     }
                  }
               }
            }

            if (var16 > 0 && var17 < var8 - 1) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][1 + var17] == 0 && !var4.method6386(var22 - 1, var23 + 1, 1076101432, -1768593097)) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (!var4.method6386(var22 - 1, var23, 1076101384, -854471998)) {
                     if (var6 <= 1612218878) {
                        throw new IllegalStateException();
                     }

                     if (!var4.method6386(var22, 1 + var23, 1076101408, 1148019660)) {
                        if (var6 <= 1612218878) {
                           throw new IllegalStateException();
                        }

                        var11[var20] = var14 - 1;
                        var12[var20] = 1 + var15;
                        var20 = 1 + var20 & var13;
                        var10[var16 - 1][1 + var17] = 6;
                        var9[var16 - 1][var17 + 1] = var24;
                     }
                  }
               }
            }

            if (var16 < var7 - 1) {
               if (var6 <= 1612218878) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 1) {
                  if (var6 <= 1612218878) {
                     throw new IllegalStateException();
                  }

                  if (0 == var10[1 + var16][1 + var17]) {
                     if (var6 <= 1612218878) {
                        throw new IllegalStateException();
                     }

                     if (!var4.method6386(1 + var22, 1 + var23, 1076101600, -867500726) && !var4.method6386(var22 + 1, var23, 1076101504, 423778253)) {
                        if (var6 <= 1612218878) {
                           throw new IllegalStateException();
                        }

                        if (!var4.method6386(var22, 1 + var23, 1076101408, 1269745582)) {
                           if (var6 <= 1612218878) {
                              throw new IllegalStateException();
                           }

                           var11[var20] = var14 + 1;
                           var12[var20] = 1 + var15;
                           var20 = 1 + var20 & var13;
                           var10[1 + var16][var17 + 1] = 12;
                           var9[var16 + 1][var17 + 1] = var24;
                        }
                     }
                  }
               }
            }
         }

         var5.method6473(var14, var15, -768637108);
         return false;
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "lw.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ab")
   final boolean method7313(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5) {
      int var6 = var5.method6480((byte)0);
      int var7 = var5.method6481((byte)-6);
      int[][] var8 = var5.method6487((short)222);
      int[][] var9 = var5.method6484((byte)18);
      int[] var10 = var5.method6492(-884341898);
      int[] var11 = var5.method6495(-1219057354);
      int var12 = var5.method6499((short)255);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      var11[var19++] = var2;

      while (var19 != var20) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var21 = var13 - CollisionMap.method6369(var4, 805899478);
         int var22 = var14 - CollisionMap.method6373(var4, (short)12721);
         if (var3.hasArrived(2, var13, var14, var4, (byte)17)) {
            var5.method6473(var13, var14, -768637108);
            return true;
         }

         int var23 = 1 + var8[var15][var16];
         if (var15 > 0
            && var9[var15 - 1][var16] == 0
            && !var4.method6386(var21 - 1, var22, 1076101390, -2040424002)
            && !var4.method6386(var21 - 1, var22 + 1, 1076101432, -725066511)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var23;
         }

         if (var15 < var6 - 2
            && var9[var15 + 1][var16] == 0
            && !var4.method6386(var21 + 2, var22, 1076101507, -217454600)
            && !var4.method6386(var21 + 2, var22 + 1, 1076101600, -840042042)) {
            var10[var19] = 1 + var13;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var23;
         }

         if (var16 > 0
            && var9[var15][var16 - 1] == 0
            && !var4.method6386(var21, var22 - 1, 1076101390, 121467241)
            && !var4.method6386(var21 + 1, var22 - 1, 1076101507, -1576147290)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var23;
         }

         if (var16 < var7 - 2
            && 0 == var9[var15][1 + var16]
            && !var4.method6386(var21, 2 + var22, 1076101432, -305718997)
            && !var4.method6386(var21 + 1, 2 + var22, 1076101600, -579472031)) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][1 + var16] = var23;
         }

         if (var15 > 0
            && var16 > 0
            && var9[var15 - 1][var16 - 1] == 0
            && !var4.method6386(var21 - 1, var22, 1076101438, 784302282)
            && !var4.method6386(var21 - 1, var22 - 1, 1076101390, 377125670)
            && !var4.method6386(var21, var22 - 1, 1076101519, 999847253)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 > 0
            && 0 == var9[1 + var15][var16 - 1]
            && !var4.method6386(var21 + 1, var22 - 1, 1076101519, 1363700622)
            && !var4.method6386(2 + var21, var22 - 1, 1076101507, 426758990)
            && !var4.method6386(var21 + 2, var22, 1076101603, -760559055)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var23;
         }

         if (var15 > 0
            && var16 < var7 - 2
            && 0 == var9[var15 - 1][1 + var16]
            && !var4.method6386(var21 - 1, 1 + var22, 1076101438, -743948638)
            && !var4.method6386(var21 - 1, var22 + 2, 1076101432, 1121330965)
            && !var4.method6386(var21, 2 + var22, 1076101624, -777079497)) {
            var10[var19] = var13 - 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 < var7 - 2
            && var9[1 + var15][1 + var16] == 0
            && !var4.method6386(var21 + 1, var22 + 2, 1076101624, -1856477892)
            && !var4.method6386(2 + var21, var22 + 2, 1076101600, -546905596)
            && !var4.method6386(2 + var21, var22 + 1, 1076101603, 1445245497)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 + 1;
            var19 = 1 + var19 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][1 + var16] = var23;
         }
      }

      var5.method6473(var13, var14, -768637108);
      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILks;Lkk;Lkm;)Z")
   @ObfuscatedName("wx")
   public static boolean method7310(class288 var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5) {
      if (var0 == null) {
         var0.method7298();
      }

      int var6 = var5.method6480((byte)0);
      int var7 = var5.method6481((byte)-45);
      int[][] var8 = var5.method6487((short)222);
      int[][] var9 = var5.method6484((byte)9);
      int[] var10 = var5.method6492(1667537886);
      int[] var11 = var5.method6495(-1716003465);
      int var12 = var5.method6499((short)255);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      var11[var19++] = var2;

      while (var20 != var19) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = var20 + 1 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var21 = var13 - CollisionMap.method6369(var4, -1340206699);
         int var22 = var14 - CollisionMap.method6373(var4, (short)31436);
         if (var3.hasArrived(1, var13, var14, var4, (byte)18)) {
            var5.method6473(var13, var14, -768637108);
            return true;
         }

         int var23 = 1 + var8[var15][var16];
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && !var4.method6386(var21 - 1, var22, 1423482491, -929381435)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var23;
         }

         if (var15 < var6 - 1 && var9[1 + var15][var16] == 0 && !var4.method6386(1 + var21, var22, -578827115, 729648128)) {
            var10[var19] = 1 + var13;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var23;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6386(var21, var22 - 1, 1076101378, -1210728987)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var23;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && !var4.method6386(var21, 1 + var22, 1076101408, 1131354622)) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = 1 + var19 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][var16 + 1] = var23;
         }

         if (var15 > 0
            && var16 > 0
            && 0 == var9[var15 - 1][var16 - 1]
            && !var4.method6386(var21 - 1, var22 - 1, 1076101390, -971290841)
            && !var4.method6386(var21 - 1, var22, 1076101384, -1100033672)
            && !var4.method6386(var21, var22 - 1, -734550032, -1366959956)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var23;
         }

         if (var15 < var6 - 1
            && var16 > 0
            && 0 == var9[1 + var15][var16 - 1]
            && !var4.method6386(var21 + 1, var22 - 1, 1076101507, 223234499)
            && !var4.method6386(1 + var21, var22, 2072160963, -2135056823)
            && !var4.method6386(var21, var22 - 1, -1629562537, 1173913826)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var23;
         }

         if (var15 > 0
            && var16 < var7 - 1
            && var9[var15 - 1][1 + var16] == 0
            && !var4.method6386(var21 - 1, var22 + 1, -209139454, -115677004)
            && !var4.method6386(var21 - 1, var22, -1717662461, 1055780722)
            && !var4.method6386(var21, 1 + var22, 2080916925, -1387772416)) {
            var10[var19] = var13 - 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][var16 + 1] = var23;
         }

         if (var15 < var6 - 1
            && var16 < var7 - 1
            && 0 == var9[1 + var15][1 + var16]
            && !var4.method6386(1 + var21, 1 + var22, 1437142089, -1948563913)
            && !var4.method6386(var21 + 1, var22, 1983826803, 909333857)
            && !var4.method6386(var21, 1 + var22, 1076101408, -201117056)) {
            var10[var19] = var13 + 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[var15 + 1][var16 + 1] = var23;
         }
      }

      var5.method6473(var13, var14, -768637108);
      return false;
   }

   @ObfuscatedSignature(descriptor = "(IILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ax")
   final boolean method7314(int var1, int var2, RouteStrategy var3, CollisionMap var4, classKM var5) {
      int var6 = var5.method6480((byte)0);
      int var7 = var5.method6481((byte)-110);
      int[][] var8 = var5.method6487((short)222);
      int[][] var9 = var5.method6484((byte)100);
      int[] var10 = var5.method6492(1595189203);
      int[] var11 = var5.method6495(-403914930);
      int var12 = var5.method6499((short)255);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      var11[var19++] = var2;

      while (var19 != var20) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var21 = var13 - CollisionMap.method6369(var4, 2084540226);
         int var22 = var14 - CollisionMap.method6373(var4, (short)14091);
         if (var3.hasArrived(2, var13, var14, var4, (byte)30)) {
            var5.method6473(var13, var14, -768637108);
            return true;
         }

         int var23 = 1 + var8[var15][var16];
         if (var15 > 0
            && var9[var15 - 1][var16] == 0
            && !var4.method6386(var21 - 1, var22, 1076101390, -56672454)
            && !var4.method6386(var21 - 1, var22 + 1, 1076101432, 1499225410)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var23;
         }

         if (var15 < var6 - 2
            && var9[var15 + 1][var16] == 0
            && !var4.method6386(var21 + 2, var22, 1076101507, 1433176808)
            && !var4.method6386(var21 + 2, var22 + 1, 1076101600, -2034811654)) {
            var10[var19] = 1 + var13;
            var11[var19] = var14;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var23;
         }

         if (var16 > 0
            && var9[var15][var16 - 1] == 0
            && !var4.method6386(var21, var22 - 1, 1076101390, 661980673)
            && !var4.method6386(var21 + 1, var22 - 1, 1076101507, 948897185)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var23;
         }

         if (var16 < var7 - 2
            && 0 == var9[var15][1 + var16]
            && !var4.method6386(var21, 2 + var22, 1076101432, 614713918)
            && !var4.method6386(var21 + 1, 2 + var22, 1076101600, 660974290)) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][1 + var16] = var23;
         }

         if (var15 > 0
            && var16 > 0
            && var9[var15 - 1][var16 - 1] == 0
            && !var4.method6386(var21 - 1, var22, 1076101438, 1217435395)
            && !var4.method6386(var21 - 1, var22 - 1, 1076101390, 473652647)
            && !var4.method6386(var21, var22 - 1, 1076101519, -1071908186)) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 > 0
            && 0 == var9[1 + var15][var16 - 1]
            && !var4.method6386(var21 + 1, var22 - 1, 1076101519, 883132696)
            && !var4.method6386(2 + var21, var22 - 1, 1076101507, -152086646)
            && !var4.method6386(var21 + 2, var22, 1076101603, -1920427317)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = 1 + var19 & var12;
            var9[1 + var15][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var23;
         }

         if (var15 > 0
            && var16 < var7 - 2
            && 0 == var9[var15 - 1][1 + var16]
            && !var4.method6386(var21 - 1, 1 + var22, 1076101438, 468670105)
            && !var4.method6386(var21 - 1, var22 + 2, 1076101432, 1089245001)
            && !var4.method6386(var21, 2 + var22, 1076101624, 1092614134)) {
            var10[var19] = var13 - 1;
            var11[var19] = 1 + var14;
            var19 = 1 + var19 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var23;
         }

         if (var15 < var6 - 2
            && var16 < var7 - 2
            && var9[1 + var15][1 + var16] == 0
            && !var4.method6386(var21 + 1, var22 + 2, 1076101624, -897997024)
            && !var4.method6386(2 + var21, var22 + 2, 1076101600, -696969509)
            && !var4.method6386(2 + var21, var22 + 1, 1076101603, 602960220)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 + 1;
            var19 = 1 + var19 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][1 + var16] = var23;
         }
      }

      var5.method6473(var13, var14, -768637108);
      return false;
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Z[I[ILkm;I)I")
   @ObfuscatedName("ag")
   int method7305(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, classKM var9, int var10) {
      try {
         var9.method6471(768477798);
         int var11 = var9.method6480((byte)0);
         int var12 = var9.method6481((byte)-26);
         int[][] var13 = var9.method6487((short)222);
         int[][] var14 = var9.method6484((byte)100);
         int[] var15 = var9.method6492(563513550);
         int[] var16 = var9.method6495(-1159686019);
         boolean var17;
         if (1 == var3) {
            if (var10 >= -1748650454) {
               throw new IllegalStateException();
            }

            var17 = this.method7309(var1, var2, var4, var5, var9, 1996614885);
         } else if (2 == var3) {
            var17 = this.method7312(var1, var2, var4, var5, var9, -399685811);
         } else {
            var17 = this.method7316(var1, var2, var3, var4, var5, var9, -908688123);
         }

         int var18 = var1 - (var11 >> 1);
         int var19 = var2 - (var12 >> 1);
         int var20 = var9.method6476((byte)104);
         int var21 = var9.method6479(1041465838);
         if (!var17) {
            if (var10 >= -1748650454) {
               throw new IllegalStateException();
            }

            if (!var6) {
               return -1;
            }

            if (var10 >= -1748650454) {
               throw new IllegalStateException();
            }

            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            int var25 = -119525533 * var4.approxDestinationSizeY;
            int var26 = 1419634615 * var4.approxDestinationX;
            int var27 = 2063768593 * var4.approxDestinationSizeX;
            int var28 = 1083678259 * var4.approxDestinationY;

            for (int var29 = var25 - var24; var29 <= var25 + var24; var29++) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               for (int var30 = var26 - var24; var30 <= var26 + var24; var30++) {
                  if (var10 >= -1748650454) {
                     throw new IllegalStateException();
                  }

                  int var31 = var29 - var18;
                  int var32 = var30 - var19;
                  if (var31 >= 0) {
                     if (var10 >= -1748650454) {
                        throw new IllegalStateException();
                     }

                     if (var32 >= 0) {
                        if (var10 >= -1748650454) {
                           throw new IllegalStateException();
                        }

                        if (var31 < var11 && var32 < var12 && var13[var31][var32] < 100) {
                           int var33 = 0;
                           if (var29 < var25) {
                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              var33 = var25 - var29;
                           } else if (var29 > var27 + var25 - 1) {
                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              var33 = var29 - (var25 + var27 - 1);
                           }

                           int var34 = 0;
                           if (var30 < var26) {
                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              var34 = var26 - var30;
                           } else if (var30 > var26 + var28 - 1) {
                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              var34 = var30 - (var28 + var26 - 1);
                           }

                           int var35 = var33 * var33 + var34 * var34;
                           if (var35 >= var22) {
                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              if (var22 != var35) {
                                 continue;
                              }

                              if (var10 >= -1748650454) {
                                 throw new IllegalStateException();
                              }

                              if (var13[var31][var32] >= var23) {
                                 continue;
                              }
                           }

                           var22 = var35;
                           var23 = var13[var31][var32];
                           var20 = var29;
                           var21 = var30;
                        }
                     }
                  }
               }
            }

            if (var22 == Integer.MAX_VALUE) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (var20 == var1) {
            if (var10 >= -1748650454) {
               throw new IllegalStateException();
            }

            if (var21 == var2) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               var7[0] = var20;
               var8[0] = var21;
               return 0;
            }
         }

         int var37 = 0;
         var15[var37] = var20;
         var16[var37++] = var21;
         int var40;
         int var39 = var40 = var14[var20 - var18][var21 - var19];

         while (true) {
            if (var1 == var20) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               if (var2 == var21) {
                  int var41 = 0;

                  while (var37-- > 0) {
                     var7[var41] = var15[var37];
                     var8[var41++] = var16[var37];
                     if (var41 >= var7.length) {
                        if (var10 >= -1748650454) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return var41;
               }

               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }
            }

            if (var40 != var39) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               var40 = var39;
               var15[var37] = var20;
               var16[var37++] = var21;
            }

            if ((var39 & 2) != 0) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               var20++;
            } else if ((var39 & 8) != 0) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               var20--;
            }

            if ((var39 & 1) != 0) {
               var21++;
            } else if (0 != (var39 & 4)) {
               if (var10 >= -1748650454) {
                  throw new IllegalStateException();
               }

               var21--;
            }

            var39 = var14[var20 - var18][var21 - var19];
         }
      } catch (RuntimeException var36) {
         throw RestClientThreadFactory.newRunException(var36, "lw.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILks;Lkk;Lkm;)Z")
   @ObfuscatedName("ah")
   final boolean method7318(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, classKM var6) {
      int var7 = var6.method6480((byte)0);
      int var8 = var6.method6481((byte)-37);
      int[][] var9 = var6.method6487((short)222);
      int[][] var10 = var6.method6484((byte)5);
      int[] var11 = var6.method6492(-278835031);
      int[] var12 = var6.method6495(-1563195278);
      int var13 = var6.method6499((short)255);
      int var14 = var1;
      int var15 = var2;
      int var16 = var7 >> 1;
      int var17 = var8 >> 1;
      int var18 = var1 - var16;
      int var19 = var2 - var17;
      var10[var16][var17] = 453498419;
      var9[var16][var17] = 0;
      int var20 = 0;
      int var21 = 0;
      var11[var20] = var1;
      var12[var20++] = var2;

      label346:
      while (var20 != var21) {
         var14 = var11[var21];
         var15 = var12[var21];
         var21 = var21 + 1 & var13;
         var16 = var14 - var18;
         var17 = var15 - var19;
         int var22 = var14 - CollisionMap.method6369(var5, 326566362);
         int var23 = var15 - CollisionMap.method6373(var5, (short)17352);
         if (var4.hasArrived(var3, var14, var15, var5, (byte)60)) {
            var6.method6473(var14, var15, -768637108);
            return true;
         }

         int var24 = var9[var16][var17] + 1;
         if (var16 > 0
            && 0 == var10[var16 - 1][var17]
            && !var5.method6386(var22 - 1, var23, 1076101390, 1222662116)
            && !var5.method6386(var22 - 1, var23 + var3 - 1, -840715754, -1345367959)) {
            int var25 = 1;

            while (true) {
               if (var25 >= var3 - 1) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15;
                  var20 = var20 + 1 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var25 + var23, 732865029, -1254751376)) {
                  break;
               }

               var25++;
            }
         }

         if (var16 < var7 - var3
            && var10[1 + var16][var17] == 0
            && !var5.method6386(var3 + var22, var23, 1076101507, -749032103)
            && !var5.method6386(var3 + var22, var23 + var3 - 1, 676973610, -1623573928)) {
            int var29 = 1;

            while (true) {
               if (var29 >= var3 - 1) {
                  var11[var20] = 1 + var14;
                  var12[var20] = var15;
                  var20 = var20 + 1 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[1 + var16][var17] = var24;
                  break;
               }

               if (var5.method6386(var22 + var3, var29 + var23, 1076101603, 1537791306)) {
                  break;
               }

               var29++;
            }
         }

         if (var17 > 0
            && var10[var16][var17 - 1] == 0
            && !var5.method6386(var22, var23 - 1, 1076101390, -1945827855)
            && !var5.method6386(var22 + var3 - 1, var23 - 1, 1076101507, -295626355)) {
            int var30 = 1;

            while (true) {
               if (var30 >= var3 - 1) {
                  var11[var20] = var14;
                  var12[var20] = var15 - 1;
                  var20 = 1 + var20 & var13;
                  var10[var16][var17 - 1] = 1;
                  var9[var16][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var30 + var22, var23 - 1, 1076101519, -1018728896)) {
                  break;
               }

               var30++;
            }
         }

         if (var17 < var8 - var3
            && 0 == var10[var16][var17 + 1]
            && !var5.method6386(var22, var3 + var23, 1076101432, -1904514888)
            && !var5.method6386(var22 + var3 - 1, var23 + var3, 1076101600, 443434301)) {
            int var31 = 1;

            while (true) {
               if (var31 >= var3 - 1) {
                  var11[var20] = var14;
                  var12[var20] = var15 + 1;
                  var20 = 1 + var20 & var13;
                  var10[var16][1 + var17] = 4;
                  var9[var16][1 + var17] = var24;
                  break;
               }

               if (var5.method6386(var31 + var22, var3 + var23, 1076101624, -1285890162)) {
                  break;
               }

               var31++;
            }
         }

         if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.method6386(var22 - 1, var23 - 1, 724843334, -1823331998)) {
            int var32 = 1;

            while (true) {
               if (var32 >= var3) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15 - 1;
                  var20 = 1 + var20 & var13;
                  var10[var16 - 1][var17 - 1] = 3;
                  var9[var16 - 1][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var32 + (var23 - 1), 1988317725, -1752066413)
                  || var5.method6386(var22 - 1 + var32, var23 - 1, -2139293258, -1033369143)) {
                  break;
               }

               var32++;
            }
         }

         if (var16 < var7 - var3 && var17 > 0 && var10[1 + var16][var17 - 1] == 0 && !var5.method6386(var22 + var3, var23 - 1, 1076101507, 1320090006)) {
            int var33 = 1;

            while (true) {
               if (var33 >= var3) {
                  var11[var20] = 1 + var14;
                  var12[var20] = var15 - 1;
                  var20 = var20 + 1 & var13;
                  var10[var16 + 1][var17 - 1] = 9;
                  var9[1 + var16][var17 - 1] = var24;
                  break;
               }

               if (var5.method6386(var3 + var22, var33 + (var23 - 1), -1964643113, 328037466)
                  || var5.method6386(var33 + var22, var23 - 1, 1076101519, -1114564280)) {
                  break;
               }

               var33++;
            }
         }

         if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][1 + var17] == 0 && !var5.method6386(var22 - 1, var3 + var23, -503849799, -2142181446)) {
            int var34 = 1;

            while (true) {
               if (var34 >= var3) {
                  var11[var20] = var14 - 1;
                  var12[var20] = var15 + 1;
                  var20 = var20 + 1 & var13;
                  var10[var16 - 1][1 + var17] = 6;
                  var9[var16 - 1][var17 + 1] = var24;
                  break;
               }

               if (var5.method6386(var22 - 1, var23 + var34, 1076101438, -386593117)
                  || var5.method6386(var34 + (var22 - 1), var3 + var23, 1076101624, -849094762)) {
                  break;
               }

               var34++;
            }
         }

         if (var16 < var7 - var3
            && var17 < var8 - var3
            && 0 == var10[var16 + 1][1 + var17]
            && !var5.method6386(var22 + var3, var23 + var3, 1612777548, -2019248795)) {
            for (int var35 = 1; var35 < var3; var35++) {
               if (var5.method6386(var35 + var22, var23 + var3, 731865081, -629751723) || var5.method6386(var3 + var22, var35 + var23, 1402115072, 1012863673)) {
                  continue label346;
               }
            }

            var11[var20] = 1 + var14;
            var12[var20] = 1 + var15;
            var20 = var20 + 1 & var13;
            var10[1 + var16][var17 + 1] = 12;
            var9[var16 + 1][1 + var17] = var24;
         }
      }

      var6.method6473(var14, var15, -768637108);
      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("lc")
   public static void method7297(class288 var0) {
      if (var0 == null) {
         var0.method7298();
      }

      var0.field3795 = new classKM[1];
      class282 var1 = class282.field3258;
      var0.field3795[0] = new classKM(var1.field3253 * 694917719, var1.field3255 * 1471367001);
   }

   @ObfuscatedSignature(descriptor = "(B)[Lnb;")
   @ObfuscatedName("ae")
   static class343[] method7306(byte var0) {
      try {
         return new class343[]{
            class343.field4175,
            class343.field4202,
            class343.field4177,
            class343.field4183,
            class343.field4197,
            class343.field4179,
            class343.field4203,
            class343.field4181,
            class343.field4180,
            class343.field4176,
            class343.field4184,
            class343.field4185,
            class343.field4186,
            class343.field4187,
            class343.field4188,
            class343.field4189,
            class343.field4194,
            class343.field4191,
            class343.field4196,
            class343.field4193,
            class343.field4190,
            class343.field4195,
            class343.field4178,
            class343.field4192,
            class343.field4198,
            class343.field4199,
            class343.field4200,
            class343.field4201
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method7298() {
      this.field3795 = new classKM[1];
      class282 var1 = class282.field3258;
      this.field3795[0] = new classKM(var1.field3253 * 694917719, var1.field3255 * 1471367001);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;B)[Lxm;")
   @ObfuscatedName("ae")
   public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2, byte var3) {
      try {
         if (!var0.isValidFileName(var1, var2, -1661083242)) {
            return null;
         } else {
            int var4 = var0.groupLoadPercentByName(var1, (byte)41);
            int var5 = AbstractArchive.method9022(var0, var4, var2, 290672641);
            IndexedSprite[] var6;
            if (!FloorOverlayDefinition.method5355(var0, var4, var5, -1366279867)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               var6 = null;
            } else {
               IndexedSprite[] var8 = new IndexedSprite[class615.SpriteBuffer_spriteCount * 1626067939];

               for (int var9 = 0; var9 < class615.SpriteBuffer_spriteCount * 1626067939; var9++) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  IndexedSprite var10 = var8[var9] = new IndexedSprite();
                  var10.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
                  var10.height = 722593713 * class144.SpriteBuffer_spriteHeight;
                  var10.xOffset = class615.SpriteBuffer_xOffsets[var9];
                  var10.yOffset = class615.SpriteBuffer_yOffsets[var9];
                  var10.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var9];
                  var10.subHeight = class615.SpriteBuffer_spriteHeights[var9];
                  var10.palette = BufferedSource.SpriteBuffer_spritePalette;
                  var10.pixels = class320.SpriteBuffer_pixels[var9];
               }

               class615.SpriteBuffer_xOffsets = null;
               class615.SpriteBuffer_yOffsets = null;
               IntHashTable.SpriteBuffer_spriteWidths = null;
               class615.SpriteBuffer_spriteHeights = null;
               BufferedSource.SpriteBuffer_spritePalette = null;
               class320.SpriteBuffer_pixels = (byte[][])null;
               var6 = var8;
            }

            return var6;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "lw.ae(" + ')');
      }
   }
}
