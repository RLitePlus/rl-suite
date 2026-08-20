import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("di")
public final class classDI {
   @ObfuscatedName("as")
   static final int[] field1507 = new int[]{1, 0, -1, 0};
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1514 = 1170;
   @ObfuscatedName("ab")
   static final int[] field1505 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("ag")
   static final int[] field1513 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("al")
   static short[][][] field1519;
   @ObfuscatedName("ax")
   static final int[] field1508 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("ac")
   static final int[] field1509 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("aq")
   static byte[][][] field1518;
   @ObfuscatedName("ao")
   static int field1511 = 1311180223;
   @ObfuscatedName("aa")
   static final int[] field1510 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("fw")
   static short[] field1516;
   @ObfuscatedName("ap")
   static int[][] field1517;
   @ObfuscatedName("at")
   static int field1512 = ((int)(Math.random() * 17.0) - 8) * 2133726259;
   @ObfuscatedName("an")
   static int field1506 = ((int)(Math.random() * 33.0) - 16) * -93161891;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1515 = 585;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   static void method3302() {
      field1511 = 1311180223;
      field1519 = new short[4][104][-1522553325];
      classCO.field1182 = new short[4][995495139][-1258234945];
      classBY.field619 = new byte[4][-543280051][576406149];
      field1518 = new byte[4][104][-1629120518];
      classDE.field1410 = new int[4][105][-1042436425];
      classFE.field2250 = new byte[4][1719609656][105];
      field1517 = new int[105][-768258767];
      classAB.field126 = new int[104];
      classCR.field1229 = new int[1651971034];
      client.field1148 = new int[709862641];
      classBI.field476 = new int[104];
      classIC.field2941 = new int[2141587598];
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIII)V")
   @ObfuscatedName("ay")
   static final void method3328(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classXY var9 = new classXY(var1);
      int var10 = -1;

      while (true) {
         int var11 = var9.method13100((byte)90);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = var9.method13094((short)2304);
            if (var13 == 0) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = classXY.method13039(var9, -346779531);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
               classOM var20 = classMU.method7729(var10, 2033587008);
               int var21 = var3 + classDU.method3604(var15 & 7, var14 & 7, var8, var20.field4944 * -582306509, var20.field4924 * 402876423, var19, -2089084226);
               int var24 = var15 & 7;
               int var25 = var14 & 7;
               int var27 = var20.field4944 * -582306509;
               int var28 = 402876423 * var20.field4924;
               if ((var19 & 1) == 1) {
                  int var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var8 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var25;
               } else if (1 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else if (var26 == 2) {
                  var23 = 7 - var25 - (var28 - 1);
               } else {
                  var23 = var24;
               }

               int var32 = var4 + var23;
               if (var21 > 0 && var32 > 0 && var21 < var0.field1696 * 1296729483 - 1 && var32 < var0.field1692 * -1269171107 - 1) {
                  int var30 = var2;
                  if ((var0.field1702[1][var21][var32] & 2) == 2) {
                     var30 = var2 - 1;
                  }

                  classGC var31 = null;
                  if (var30 >= 0 && null != var0.field1687) {
                     var31 = var0.field1687[var30];
                  }

                  classCI.method1518(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31, 1070436096);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIILgc;Lee;Lee;)V")
   @ObfuscatedName("ci")
   static final void method3352(
      classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classGC var9, classEE var10, classEE var11
   ) {
      classOM var12 = classMU.method7729(var5, 1681579936);
      int var13 = var8 >= 0 ? var8 : var12.field4951 * -159426735;
      int var14;
      int var15;
      if (var6 != 1 && 3 != var6) {
         var14 = var12.field4944 * -582306509;
         var15 = var12.field4924 * 402876423;
      } else {
         var14 = var12.field4924 * 24523813;
         var15 = 1213762595 * var12.field4944;
      }

      int var16;
      int var17;
      if (var3 + var14 <= var0.field1696 * 1296729483) {
         var16 = var3 + (var14 >> 1);
         var17 = var3 + (1 + var14 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int var18;
      int var19;
      if (var4 + var15 <= var0.field1692 * -1356918970) {
         var18 = var4 + (var15 >> 1);
         var19 = var4 + (1 + var15 >> 1);
      } else {
         var18 = var4;
         var19 = var4 + 1;
      }

      int[][] var20 = var0.field1688[var2];
      int var21 = var20[var17][var18] + var20[var16][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
      int var22 = (var14 << 6) + (var3 << 7);
      int var23 = (var15 << 6) + (var4 << 7);
      classEZ var24 = var0.field1689;
      long var25 = classRF.method9961(var1, var3, var4, 2, 0 == 67932862 * var12.field4923, var5, 2140889407 * var0.field1699, (short)6554);
      int var27 = (var6 << 6) + var7;
      if (1291058669 * var12.field4956 == 1) {
         var27 += 256;
      }

      if (22 == var7) {
         Object var48;
         if (-1 == var13 && var12.field4930 == null) {
            var48 = var12.method8544(22, var6, var20, var22, var21, var23, 1027800545);
         } else {
            var48 = new classDY(var0, var5, 22, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         classEZ.method4464(var24, var1, var3, var4, var21, (classEE)var48, var25, var27);
         if (1 == var12.field4946 * 1032380058 && null != var9) {
            classGC.method5371(var9, var3, var4, (byte)4);
         }
      } else if (var7 != 10 && var7 != 11) {
         if (var7 >= 12) {
            Object var47;
            if (var13 == -1 && var12.field4930 == null) {
               var47 = var12.method8544(var7, var6, var20, var22, var21, var23, -830998988);
            } else {
               var47 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var47, 0, var25, var27);
            if (0 != -2040437663 * var12.field4946 && var9 != null) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-1);
            }
         } else if (0 == var7) {
            Object var46;
            if (-1 == var13 && var12.field4930 == null) {
               var46 = var12.method8544(0, var6, var20, var22, var21, var23, -62665224);
            } else {
               var46 = new classDY(var0, var5, 0, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var46, null, field1505[var6], 0, var25, var27);
            if (-1361390383 * var12.field4946 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -561933455);
            }
         } else if (var7 == 1) {
            Object var45;
            if (-1 == var13 && null == var12.field4930) {
               var45 = var12.method8544(1, var6, var20, var22, var21, var23, -81134308);
            } else {
               var45 = new classDY(var0, var5, 1, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var45, null, field1513[var6], 0, var25, var27);
            if (var12.field4946 * -2040437663 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, 1437746791);
            }
         } else if (2 == var7) {
            int var44 = var6 + 1 & 3;
            Object var30;
            Object var52;
            if (-1 == var13 && null == var12.field4930) {
               var52 = var12.method8544(2, 4 + var6, var20, var22, var21, var23, 759110689);
               var30 = var12.method8544(2, var44, var20, var22, var21, var23, 860066555);
            } else {
               var52 = new classDY(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var30 = new classDY(var0, var5, 2, var44, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var52, (classEE)var30, field1505[var6], field1505[var44], var25, var27);
            if (-2040437663 * var12.field4946 != 0 && var9 != null) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1117063753);
            }
         } else if (3 == var7) {
            Object var43;
            if (var13 == -1 && var12.field4930 == null) {
               var43 = var12.method8544(3, var6, var20, var22, var21, var23, -500696280);
            } else {
               var43 = new classDY(var0, var5, 3, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var43, null, field1513[var6], 0, var25, var27);
            if (0 != var12.field4946 * -2040437663 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -467590824);
            }
         } else if (var7 == 9) {
            Object var42;
            if (var13 == -1 && null == var12.field4930) {
               var42 = var12.method8544(var7, var6, var20, var22, var21, var23, 146398276);
            } else {
               var42 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var42, 0, var25, var27);
            if (1335598383 * var12.field4946 != 0 && null != var9) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-82);
            }
         } else if (var7 == classKB.field3520.vmethod8((byte)1)) {
            Object var41;
            if (-1 == var13 && null == var12.field4930) {
               var41 = var12.method8544(var7, var6, var20, var22, var21, var23, 484588937);
            } else {
               var41 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var41, null, field1505[var6], 0, field1507[var6], field1508[var6], 0, 0, var25, var27);
         } else if (var7 == classKB.field3525.vmethod8((byte)1)) {
            int var39 = 16;
            long var51 = var24.method4455(var1, var3, var4);
            if (var51 != 0L) {
               var39 = classMU.method7729(classCN.method2552(var51), 1410199607).field4927 * 167716857;
            }

            var39++;
            Object var54;
            if (-1 == var13 && var12.field4930 == null) {
               var54 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6, var20, var22, var21, var23, -422165741);
            } else {
               var54 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(
               var1, var3, var4, var21, (classEE)var54, null, field1505[var6], 0, field1507[var6] * var39, var39 * field1508[var6], 0, 0, var25, var27
            );
         } else if (var7 == classKB.field3522.vmethod8((byte)1)) {
            int var37 = 8;
            long var50 = var24.method4439(var1, var3, var4);
            if (var50 != 0L) {
               var37 = classMU.method7729(classCN.method2552(var50), 1462207693).field4927 * -2076237832 / 2;
            }

            var37++;
            Object var53;
            if (-1 == var13 && var12.field4930 == null) {
               var53 = var12.method8544(classKB.field3520.vmethod8((byte)1), 4 + var6, var20, var22, var21, var23, -891497018);
            } else {
               var53 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var53, null, 256, var6, var37 * field1509[var6], field1510[var6] * var37, 0, 0, var25, var27);
         } else if (var7 == classKB.field3523.vmethod8((byte)1)) {
            int var49 = var6 + 2 & 3;
            Object var36;
            if (var13 == -1 && null == var12.field4930) {
               var36 = var12.method8544(classKB.field3520.vmethod8((byte)1), var49 + 4, var20, var22, var21, var23, 104953050);
            } else {
               var36 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var49 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var36, null, 256, var49, field1509[var49], field1510[var49], 0, 0, var25, var27);
         } else if (var7 == classKB.field3524.vmethod8((byte)1)) {
            int var34 = 8;
            long var29 = var24.method4439(var1, var3, var4);
            if (0L != var29) {
               var34 = classMU.method7729(classCN.method2552(var29), 1933231236).field4927 * 1046560835 / 2;
            }

            var34++;
            int var33 = 2 + var6 & 3;
            Object var31;
            Object var32;
            if (var13 == -1 && null == var12.field4930) {
               var31 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6 + 4, var20, var22, var21, var23, -732582259);
               var32 = var12.method8544(classKB.field3520.vmethod8((byte)1), var33 + 4, var20, var22, var21, var23, -1036800737);
            } else {
               var31 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var32 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), 4 + var33, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4481(
               var1,
               var3,
               var4,
               var21,
               (classEE)var31,
               (classEE)var32,
               -1092772456,
               var6,
               field1509[var6] * var34,
               var34 * field1510[var6],
               field1509[var33],
               field1510[var33],
               var25,
               var27
            );
         }
      } else {
         Object var28;
         if (var13 == -1 && var12.field4930 == null) {
            var28 = var12.method8544(10, var6, var20, var22, var21, var23, 117657156);
         } else {
            var28 = new classDY(var0, var5, 10, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         if (null != var28) {
            var24.method4179(var1, var3, var4, var21, var14, var15, (classEE)var28, 11 == var7 ? 1253262065 : 0, var25, var27);
         }

         if (1424753907 * var12.field4946 != 0 && var9 != null) {
            classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-7);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   static void method3303() {
      field1511 = -913400629;
      field1519 = new short[4][104][527034542];
      classCO.field1182 = new short[4][104][-1043725773];
      classBY.field619 = new byte[4][104][1178928507];
      field1518 = new byte[4][-542112906][-1428751201];
      classDE.field1410 = new int[4][105][105];
      classFE.field2250 = new byte[4][-905323146][825432399];
      field1517 = new int[105][1669257680];
      classAB.field126 = new int[104];
      classCR.field1229 = new int[104];
      client.field1148 = new int[104];
      classBI.field476 = new int[104];
      classIC.field2941 = new int[104];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIIIII)V")
   @ObfuscatedName("bm")
   static final void method3308(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      classGC[] var11 = var0.field1687;
      if (var11 != null && var2 >= 0 && var2 < var11.length) {
         classGC var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method5344(var13, var14, (byte)7)) {
                  var12.method5340(var13, var14, 1073741824, -2134326968);
               }
            }
         }
      }

      classXY var30 = new classXY(var1);

      for (int var31 = 0; var31 < 4; var31++) {
         for (int var33 = 0; var33 < -1577589985; var33++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var31 == var5 && var33 >= var6 && var33 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var18 = var33 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var24 = var33 & 7;
                  int var25 = var15 & 7;
                  int var26 = var8 & 3;
                  int var23;
                  if (var26 == 0) {
                     var23 = var25;
                  } else if (1 == var26) {
                     var23 = 7 - var24;
                  } else if (2 == var26) {
                     var23 = 7 - var25;
                  } else {
                     var23 = var24;
                  }

                  int var27 = var23 + var4;
                  int var28 = var3 + var9 + (var33 & 7);
                  int var29 = var4 + var10 + (var15 & 7);
                  classKG.method6474(var0, var30, var2, var21, var27, var28, var29, var8, -1399458955);
               } else {
                  classKG.method6474(var0, var30, 0, -1, -1, 0, 0, 0, -1197668383);
               }
            }
         }
      }

      int var32 = var30.field6955 * 702114061 < var30.field6954.length ? classXY.method13039(var30, -346779531) : 0;
      boolean var34 = (var32 & 1) != 0;
      if (var34) {
         for (int var35 = 0; var35 < 64; var35++) {
            for (int var16 = 0; var16 < -1863956246; var16++) {
               classLF.method6780(var30, 536268063);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("cg")
   static final int method3351(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIII)V")
   @ObfuscatedName("bn")
   static final void method3304(classDZ var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.field1688;
      int var6 = var0.field1696 * 1296729483 - 1;
      int var7 = -1269171107 * var0.field1692 - 1;

      for (int var8 = var2; var8 <= var4 + var2; var8++) {
         for (int var9 = var1; var9 <= var1 + var3; var9++) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               classFE.field2250[0][var9][var8] = (byte)-780925141;
               if (var9 == var1 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var9 == var3 + var1 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var8 == var2 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var2 + var4 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIILgc;)V")
   @ObfuscatedName("cr")
   static final void method3332(classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, classGC var7) {
      if (!client.field885 || 0 != (var0.field1702[0][var2][var3] & 2) || 0 == (var0.field1702[var1][var2][var3] & 16)) {
         if (var1 < -791964067 * field1511) {
            field1511 = var1 * 360312309;
         }

         classOM var8 = classMU.method7729(var4, 1574909575);
         int var9;
         int var10;
         if (var5 != 1 && 3 != var5) {
            var9 = var8.field4944 * -582306509;
            var10 = var8.field4924 * 402876423;
         } else {
            var9 = var8.field4924 * 402876423;
            var10 = -582306509 * var8.field4944;
         }

         int var11;
         int var12;
         if (var2 + var9 <= 1296729483 * var0.field1696) {
            var11 = var2 + (var9 >> 1);
            var12 = var2 + (1 + var9 >> 1);
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var3 + var10 <= -1269171107 * var0.field1692) {
            var13 = var3 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var3;
         } else {
            var13 = var3;
            var14 = 1 + var3;
         }

         int[][] var15 = var0.field1688[var1];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2;
         int var17 = (var2 << 7) + (var9 << 6);
         int var18 = (var3 << 7) + (var10 << 6);
         long var19 = classRF.method9961(var1, var2, var3, 2, 0 == var8.field4923 * 1663954033, var4, 2140889407 * var0.field1699, (short)17737);
         int var21 = (var5 << 6) + var6;
         if (1 == var8.field4956 * 1291058669) {
            var21 += 256;
         }

         if (classOM.method8569(var8, 1754865660)) {
            var0.method3739(var1, var2, var3, var8, var5, 2075461080);
         }

         classEZ var22 = var0.field1689;
         boolean var23 = var6 == 78062377 * classKB.field3537.field3538;
         if (var23) {
            if (!client.field885 || var8.field4923 * 1663954033 != 0 || 1 == var8.field4946 * -2040437663 || var8.field4933) {
               Object var31;
               if (-1 == -1542230501 * var8.field4951 && var8.field4930 == null) {
                  var31 = var8.method8541(var6, var5, var15, var17, var16, var18, -1714573343);
               } else {
                  var31 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null);
               }

               classEZ.method4464(var22, var1, var2, var3, var16, (classEE)var31, var19, var21);
               if (1 == var8.field4946 * -2040437663 && null != var7) {
                  classGC.method5371(var7, var2, var3, (byte)4);
               }
            }
         } else {
            boolean var24 = var6 >= classKB.field3521.field3538 * 78062377 && var6 <= 78062377 * classKB.field3526.field3538;
            if (var24) {
               Object var45;
               if (-1542230501 * var8.field4951 == -1 && null == var8.field4930) {
                  var45 = var8.method8541(classKB.field3521.vmethod8((byte)1), var5, var15, var17, var16, var18, -1813287537);
               } else {
                  var45 = new classDY(
                     var0, var4, classKB.field3521.vmethod8((byte)1), var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                  );
               }

               if (null != var45
                  && var22.method4179(var1, var2, var3, var16, var9, var10, (classEE)var45, var6 == classKB.field3526.vmethod8((byte)1) ? 256 : 0, var19, var21)
                  && var8.field4938) {
                  int var50 = 15;
                  if (var45 instanceof classFX) {
                     var50 = ((classFX)var45).method5101() / 4;
                     if (var50 > 30) {
                        var50 = 30;
                     }
                  }

                  for (int var51 = 0; var51 <= var9; var51++) {
                     for (int var54 = 0; var54 <= var10; var54++) {
                        if (var50 > classFE.field2250[var1][var2 + var51][var54 + var3]) {
                           classFE.field2250[var1][var2 + var51][var3 + var54] = (byte)var50;
                        }
                     }
                  }
               }

               if (var8.field4946 * -2040437663 != 0 && var7 != null) {
                  classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)25);
               }
            } else if (!classMY.method7740(var6, 52623640) && !classJE.method6357(var6, (byte)14)) {
               if (var6 == classKB.field3515.vmethod8((byte)1)) {
                  Object var44;
                  if (var8.field4951 * -1542230501 == -1 && null == var8.field4930) {
                     var44 = var8.method8541(var6, var5, var15, var17, var16, var18, 585250927);
                  } else {
                     var44 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var44, null, field1505[var5], 0, var19, var21);
                  if (var5 == 0) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][var3] = 50;
                        classFE.field2250[var1][var2][var3 + 1] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 585;
                     }
                  } else if (1 == var5) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][1 + var3] = 50;
                        classFE.field2250[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1170;
                     }
                  } else if (var5 == 2) {
                     if (var8.field4938) {
                        classFE.field2250[var1][1 + var2][var3] = 50;
                        classFE.field2250[var1][var2 + 1][var3 + 1] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][1 + var2][var3] = classDE.field1410[var1][1 + var2][var3] | 585;
                     }
                  } else if (3 == var5) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][var3] = 50;
                        classFE.field2250[var1][var2 + 1][var3] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1170;
                     }
                  }

                  if (-2040437663 * var8.field4946 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, -1441816547);
                  }

                  if (16 != -1659674841 * var8.field4927) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + var8.field4927 * -1659674841);
                  }
               } else if (var6 == classKB.field3529.vmethod8((byte)1)) {
                  Object var43;
                  if (var8.field4951 * -1542230501 == -1 && null == var8.field4930) {
                     var43 = var8.method8541(var6, var5, var15, var17, var16, var18, -1491760517);
                  } else {
                     var43 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var43, null, field1513[var5], 0, var19, var21);
                  if (var8.field4938) {
                     if (0 == var5) {
                        classFE.field2250[var1][var2][1 + var3] = 50;
                     } else if (1 == var5) {
                        classFE.field2250[var1][var2 + 1][1 + var3] = 50;
                     } else if (2 == var5) {
                        classFE.field2250[var1][1 + var2][var3] = 50;
                     } else if (3 == var5) {
                        classFE.field2250[var1][var2][var3] = 50;
                     }
                  }

                  if (-2040437663 * var8.field4946 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, -603633163);
                  }
               } else if (var6 == classKB.field3517.vmethod8((byte)1)) {
                  int var42 = 1 + var5 & 3;
                  Object var27;
                  Object var49;
                  if (-1542230501 * var8.field4951 == -1 && var8.field4930 == null) {
                     var49 = var8.method8541(var6, 4 + var5, var15, var17, var16, var18, -1117406894);
                     var27 = var8.method8541(var6, var42, var15, var17, var16, var18, -735058729);
                  } else {
                     var49 = new classDY(var0, var4, var6, 4 + var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                     var27 = new classDY(var0, var4, var6, var42, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var49, (classEE)var27, field1505[var5], field1505[var42], var19, var21);
                  if (var8.field4950) {
                     if (0 == var5) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 585;
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1170;
                     } else if (1 == var5) {
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1170;
                        classDE.field1410[var1][1 + var2][var3] = classDE.field1410[var1][1 + var2][var3] | 585;
                     } else if (var5 == 2) {
                        classDE.field1410[var1][var2 + 1][var3] = classDE.field1410[var1][var2 + 1][var3] | 585;
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1170;
                     } else if (var5 == 3) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1170;
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 585;
                     }
                  }

                  if (var8.field4946 * -2040437663 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, -709196444);
                  }

                  if (16 != -1659674841 * var8.field4927) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + -1659674841 * var8.field4927);
                  }
               } else if (var6 == classKB.field3518.vmethod8((byte)1)) {
                  Object var41;
                  if (-1 == var8.field4951 * -1542230501 && var8.field4930 == null) {
                     var41 = var8.method8541(var6, var5, var15, var17, var16, var18, -2119535922);
                  } else {
                     var41 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var41, null, field1513[var5], 0, var19, var21);
                  if (var8.field4938) {
                     if (0 == var5) {
                        classFE.field2250[var1][var2][1 + var3] = 50;
                     } else if (1 == var5) {
                        classFE.field2250[var1][1 + var2][1 + var3] = 50;
                     } else if (var5 == 2) {
                        classFE.field2250[var1][1 + var2][var3] = 50;
                     } else if (var5 == 3) {
                        classFE.field2250[var1][var2][var3] = 50;
                     }
                  }

                  if (0 != var8.field4946 * -2040437663 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, -755899526);
                  }
               } else if (var6 == classKB.field3519.vmethod8((byte)1)) {
                  Object var40;
                  if (-1542230501 * var8.field4951 == -1 && var8.field4930 == null) {
                     var40 = var8.method8541(var6, var5, var15, var17, var16, var18, 670972761);
                  } else {
                     var40 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4179(var1, var2, var3, var16, 1, 1, (classEE)var40, 0, var19, var21);
                  if (0 != var8.field4946 * -2040437663 && null != var7) {
                     classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)-53);
                  }

                  if (16 != var8.field4927 * -1659674841) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + var8.field4927 * -1659674841 / 2);
                  }
               } else if (var6 == classKB.field3520.vmethod8((byte)1)) {
                  Object var39;
                  if (-1 == -1542230501 * var8.field4951 && null == var8.field4930) {
                     var39 = var8.method8541(var6, var5, var15, var17, var16, var18, -1768033524);
                  } else {
                     var39 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null);
                  }

                  var22.method4481(var1, var2, var3, var16, (classEE)var39, null, field1505[var5], 0, field1507[var5], field1508[var5], 0, 0, var19, var21);
               } else if (var6 == classKB.field3525.vmethod8((byte)1)) {
                  int var37 = 16;
                  long var48 = var22.method4455(var1, var2, var3);
                  if (var48 != 0L) {
                     var37 = classMU.method7729(classCN.method2552(var48), 1664253889).field4927 * -1659674841;
                  }

                  var37++;
                  Object var53;
                  if (-1 == var8.field4951 * -1542230501 && null == var8.field4930) {
                     var53 = var8.method8541(classKB.field3520.vmethod8((byte)1), var5, var15, var17, var16, var18, -351902704);
                  } else {
                     var53 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1, var2, var3, var16, (classEE)var53, null, field1505[var5], 0, field1507[var5] * var37, field1508[var5] * var37, 0, 0, var19, var21
                  );
               } else if (var6 == classKB.field3522.vmethod8((byte)1)) {
                  int var35 = 8;
                  long var47 = var22.method4439(var1, var2, var3);
                  if (0L != var47) {
                     var35 = classMU.method7729(classCN.method2552(var47), 1403025359).field4927 * -1659674841 / 2;
                  }

                  var35++;
                  Object var52;
                  if (var8.field4951 * -1542230501 == -1 && null == var8.field4930) {
                     var52 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var5, var15, var17, var16, var18, 72581665);
                  } else {
                     var52 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1, var2, var3, var16, (classEE)var52, null, 256, var5, var35 * field1509[var5], var35 * field1510[var5], 0, 0, var19, var21
                  );
               } else if (var6 == classKB.field3523.vmethod8((byte)1)) {
                  int var46 = var5 + 2 & 3;
                  Object var34;
                  if (-1 == var8.field4951 * -1542230501 && null == var8.field4930) {
                     var34 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var46, var15, var17, var16, var18, 445079069);
                  } else {
                     var34 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var46, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                     );
                  }

                  var22.method4481(var1, var2, var3, var16, (classEE)var34, null, 256, var46, field1509[var46], field1510[var46], 0, 0, var19, var21);
               } else if (var6 == classKB.field3524.vmethod8((byte)1)) {
                  int var32 = 8;
                  long var26 = var22.method4439(var1, var2, var3);
                  if (var26 != 0L) {
                     var32 = classMU.method7729(classCN.method2552(var26), 1394717768).field4927 * -1659674841 / 2;
                  }

                  var32++;
                  int var30 = var5 + 2 & 3;
                  Object var28;
                  Object var29;
                  if (-1 == var8.field4951 * -1542230501 && var8.field4930 == null) {
                     var28 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var5, var15, var17, var16, var18, -284487346);
                     var29 = var8.method8541(classKB.field3520.vmethod8((byte)1), var30 + 4, var15, var17, var16, var18, -1089617809);
                  } else {
                     var28 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), var5 + 4, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null
                     );
                     var29 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var30, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1,
                     var2,
                     var3,
                     var16,
                     (classEE)var28,
                     (classEE)var29,
                     256,
                     var5,
                     field1509[var5] * var32,
                     field1510[var5] * var32,
                     field1509[var30],
                     field1510[var30],
                     var19,
                     var21
                  );
               }
            } else {
               Object var25;
               if (-1 == -1542230501 * var8.field4951 && null == var8.field4930) {
                  var25 = var8.method8541(var6, var5, var15, var17, var16, var18, -540679588);
               } else {
                  var25 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
               }

               var22.method4179(var1, var2, var3, var16, 1, 1, (classEE)var25, 0, var19, var21);
               if (classMY.method7740(var6, 748363120) && var6 != classKB.field3535.vmethod8((byte)1) && var1 > 0) {
                  classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 2340;
               }

               if (0 != var8.field4946 * -2040437663 && null != var7) {
                  classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)42);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIII)V")
   @ObfuscatedName("bc")
   static final void method3306(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (var0.field1687 != null) {
         for (int var6 = 0; var6 < 4; var6++) {
            classGC var7 = var0.field1687[var6];

            for (int var8 = var2; var8 < 854849450 + var2; var8++) {
               for (int var9 = var3; var9 < 64 + var3; var9++) {
                  if (var7.method5344(var8, var9, (byte)-29)) {
                     var7.method5340(var8, var9, 1073741824, -2134326968);
                  }
               }
            }
         }
      }

      classXY var12 = new classXY(var1);

      for (int var13 = 0; var13 < 4; var13++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var17 = 0; var17 < 64; var17++) {
               int var10 = var2 + var15;
               int var11 = var17 + var3;
               classKG.method6474(var0, var12, var13, var10, var11, var4 + var10, var11 + var5, 0, -482768034);
            }
         }
      }

      int var14 = -1042968113 * var12.field6955 < var12.field6954.length ? classXY.method13039(var12, -346779531) : 0;
      boolean var16 = (var14 & 1) != 0;
      if (var16) {
         for (int var18 = 0; var18 < 1754865660; var18++) {
            for (int var19 = 0; var19 < 2025977800; var19++) {
               classLF.method6780(var12, 1819936392);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIIIII)V")
   @ObfuscatedName("bp")
   static final void method3309(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      classGC[] var11 = var0.field1687;
      if (var11 != null && var2 >= 0 && var2 < var11.length) {
         classGC var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method5344(var13, var14, (byte)-13)) {
                  var12.method5340(var13, var14, 1073741824, -2134326968);
               }
            }
         }
      }

      classXY var30 = new classXY(var1);

      for (int var31 = 0; var31 < 4; var31++) {
         for (int var33 = 0; var33 < 64; var33++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var31 == var5 && var33 >= var6 && var33 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var18 = var33 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var24 = var33 & 7;
                  int var25 = var15 & 7;
                  int var26 = var8 & 3;
                  int var23;
                  if (var26 == 0) {
                     var23 = var25;
                  } else if (1 == var26) {
                     var23 = 7 - var24;
                  } else if (2 == var26) {
                     var23 = 7 - var25;
                  } else {
                     var23 = var24;
                  }

                  int var27 = var23 + var4;
                  int var28 = var3 + var9 + (var33 & 7);
                  int var29 = var4 + var10 + (var15 & 7);
                  classKG.method6474(var0, var30, var2, var21, var27, var28, var29, var8, 1313348598);
               } else {
                  classKG.method6474(var0, var30, 0, -1, -1, 0, 0, 0, -1078223093);
               }
            }
         }
      }

      int var32 = var30.field6955 * 702114061 < var30.field6954.length ? classXY.method13039(var30, -346779531) : 0;
      boolean var34 = (var32 & 1) != 0;
      if (var34) {
         for (int var35 = 0; var35 < 64; var35++) {
            for (int var16 = 0; var16 < 64; var16++) {
               classLF.method6780(var30, 1701309530);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("cd")
   static final int method3339(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - classFH.field2254[1024 * var2 / var3] >> 1;
      return (var1 * var4 >> 16) + ((65536 - var4) * var0 >> 16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("ct")
   static final void method3334(classDZ var0) {
      int var1 = var0.field1696 * 1296729483;
      int var2 = var0.field1692 * -1269171107;
      int[][][] var3 = var0.field1688;
      byte[][][] var4 = var0.field1702;
      classEZ var5 = var0.field1689;
      classGC[] var6 = var0.field1687;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if (1 == (var0.field1702[var7][var8][var9] & 1)) {
                  int var10 = var7;
                  if ((var0.field1702[1][var8][var9] & 2) == 2) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].method5364(var8, var9, 233314172);
                  }
               }
            }
         }
      }

      field1512 = field1512 + ((int)(Math.random() * 5.0) - 2) * -143871744;
      if (field1512 * 252935989 < -8) {
         field1512 = -928420514;
      }

      if (1346569979 * field1512 > 8) {
         field1512 = 385780344;
      }

      field1506 = field1506 + ((int)(Math.random() * 5.0) - 2) * -93161891;
      if (-1614206687 * field1506 < 2053476676) {
         field1506 = 1451939558;
      }

      if (-1223029259 * field1506 > 16) {
         field1506 = -1306362164;
      }

      for (int var52 = 0; var52 < 4; var52++) {
         byte[][] var55 = classFE.field2250[var52];
         int var58 = -2137788794;
         short var60 = 768;
         byte var11 = -50;
         byte var12 = -10;
         byte var13 = -50;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * 276134795 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var52][var17 + 1][var16] - var3[var52][var17 - 1][var16];
               int var19 = var3[var52][var17][1 + var16] - var3[var52][var17][var16 - 1];
               int var20 = (int)Math.sqrt(55839440 + var18 * var18 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = 65536 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = 96 + (-10 * var22 + var21 * -355905960 + -50 * var23) / var15;
               int var25 = (var55[var17][var16] >> 1)
                  + (var55[var17][var16 - 1] >> 2)
                  + (var55[var17 - 1][var16] >> 2)
                  + (var55[1 + var17][var16] >> 3)
                  + (var55[var17][var16 + 1] >> 3);
               field1517[var17][var16] = var24 - var25;
            }
         }

         for (int var67 = 0; var67 < var2; var67++) {
            classAB.field126[var67] = 0;
            classCR.field1229[var67] = 0;
            client.field1148[var67] = 0;
            classBI.field476[var67] = 0;
            classIC.field2941[var67] = 0;
         }

         for (int var68 = -305651507; var68 < 5 + var1; var68++) {
            for (int var71 = 0; var71 < var2; var71++) {
               int var75 = 5 + var68;
               if (var75 >= 0 && var75 < var1) {
                  long var80 = (long)Math.pow(2.0, 15.0) - 1L;
                  int var91 = (int)var80;
                  int var96 = field1519[var52][var75][var71] & var91;
                  if (var96 > 0) {
                     classPH var109 = classIY.method6334(var96 - 1, 2006522022);
                     classAB.field126[var71] = classAB.field126[var71] + -1415575461 * var109.field5250;
                     classCR.field1229[var71] = classCR.field1229[var71] + var109.field5255 * 618687933;
                     client.field1148[var71] = client.field1148[var71] + var109.field5253 * 1851728405;
                     classBI.field476[var71] = classBI.field476[var71] + var109.field5251 * -69858631;
                     classIC.field2941[var71]++;
                  }
               }

               int var81 = var68 - 5;
               if (var81 >= 0 && var81 < var1) {
                  long var86 = (long)Math.pow(2.0, 15.0) - 1L;
                  int var97 = (int)var86;
                  int var110 = field1519[var52][var81][var71] & var97;
                  if (var110 > 0) {
                     classPH var115 = classIY.method6334(var110 - 1, 1523342087);
                     classAB.field126[var71] = classAB.field126[var71] - -934276511 * var115.field5250;
                     classCR.field1229[var71] = classCR.field1229[var71] - var115.field5255 * 1601793712;
                     client.field1148[var71] = client.field1148[var71] - var115.field5253 * 1851728405;
                     classBI.field476[var71] = classBI.field476[var71] - var115.field5251 * 1316498643;
                     classIC.field2941[var71]--;
                  }
               }
            }

            if (var68 >= 1 && var68 < var1 - 1) {
               int var72 = 0;
               int var76 = 0;
               int var82 = 0;
               int var87 = 0;
               int var92 = 0;

               for (int var98 = -722125983; var98 < var2 + 5; var98++) {
                  int var111 = var98 + 5;
                  if (var111 >= 0 && var111 < var2) {
                     var72 += classAB.field126[var111];
                     var76 += classCR.field1229[var111];
                     var82 += client.field1148[var111];
                     var87 += classBI.field476[var111];
                     var92 += classIC.field2941[var111];
                  }

                  int var116 = var98 - 5;
                  if (var116 >= 0 && var116 < var2) {
                     var72 -= classAB.field126[var116];
                     var76 -= classCR.field1229[var116];
                     var82 -= client.field1148[var116];
                     var87 -= classBI.field476[var116];
                     var92 -= classIC.field2941[var116];
                  }

                  if (var98 >= 1 && var98 < var2 - 1 && (!client.field885 || (var4[0][var68][var98] & 2) != 0 || 0 == (var4[var52][var68][var98] & 16))) {
                     if (var52 < -791964067 * field1511) {
                        field1511 = -758016000 * var52;
                     }

                     long var120 = (long)Math.pow(2.0, 15.0) - 1L;
                     int var27 = (int)var120;
                     int var28 = field1519[var52][var68][var98] & var27;
                     int var29 = classCO.field1182[var52][var68][var98] & var27;
                     if (var28 > 0 || var29 > 0) {
                        int var30 = var3[var52][var68][var98];
                        int var31 = var3[var52][var68 + 1][var98];
                        int var32 = var3[var52][var68 + 1][var98 + 1];
                        int var33 = var3[var52][var68][1 + var98];
                        int var34 = field1517[var68][var98];
                        int var35 = field1517[var68 + 1][var98];
                        int var36 = field1517[1 + var68][var98 + 1];
                        int var37 = field1517[var68][1 + var98];
                        int var38 = -1;
                        int var39 = -1;
                        if (var28 > 0) {
                           int var40 = -80174958 * var72 / var87;
                           int var41 = var76 / var92;
                           int var42 = var82 / var92;
                           var38 = classHG.method6010(var40, var41, var42, (byte)2);
                           var40 = field1512 * -1853911852 + var40 & -81760726;
                           var42 += field1506 * -1223029259;
                           if (var42 < 0) {
                              var42 = 0;
                           } else if (var42 > 255) {
                              var42 = 255;
                           }

                           var39 = classHG.method6010(var40, var41, var42, (byte)2);
                        }

                        if (var52 > 0) {
                           boolean var127 = true;
                           if (0 == var28 && 0 != classBY.field619[var52][var68][var98]) {
                              var127 = false;
                           }

                           if (var29 > 0) {
                              int var132 = var29 - 1;
                              classOW var43 = (classOW)classOW.field5183.method6422(var132);
                              classOW var129;
                              if (var43 != null) {
                                 var129 = var43;
                              } else {
                                 byte[] var44 = classOW.field5185.method11867(4, var132, -1143193604);
                                 var43 = new classOW(new classXY(var44), var132);
                                 classOW.field5183.method6428(var43, var132);
                                 var129 = var43;
                              }

                              if (!var129.field5177) {
                                 var127 = false;
                              }
                           }

                           if (var127 && var30 == var31 && var30 == var32 && var30 == var33) {
                              classDE.field1410[var52][var68][var98] = classDE.field1410[var52][var68][var98] | 2036523791;
                           }
                        }

                        int var128 = 0;
                        if (-1 != var39) {
                           var128 = classFH.field2251[classWK.method12378(var39, 96, -1504678300)];
                        }

                        if (var29 == 0) {
                           classEZ.method4410(
                              var5,
                              var52,
                              var68,
                              var98,
                              0,
                              0,
                              -1,
                              var30,
                              var31,
                              var32,
                              var33,
                              classWK.method12378(var38, var34, -1712479508),
                              classWK.method12378(var38, var35, -1501503101),
                              classWK.method12378(var38, var36, -415669319),
                              classWK.method12378(var38, var37, -377100759),
                              0,
                              0,
                              0,
                              0,
                              var128,
                              0
                           );
                        } else {
                           int var130 = classBY.field619[var52][var68][var98] + 1;
                           byte var133 = field1518[var52][var68][var98];
                           int var136 = var29 - 1;
                           classOW var45 = (classOW)classOW.field5183.method6422(var136);
                           classOW var135;
                           if (null != var45) {
                              var135 = var45;
                           } else {
                              byte[] var46 = classOW.field5185.method11867(4, var136, -1245468921);
                              var45 = new classOW(new classXY(var46), var136);
                              classOW.field5183.method6428(var45, var136);
                              var135 = var45;
                           }

                           int var138 = var135.field5176 * -982434803;
                           int var47;
                           int var48;
                           if (var138 >= 0) {
                              var48 = classFH.field2257.field2239.vmethod408(var138, -1165367068);
                              var47 = -1;
                           } else if (16711935 == var135.field5175 * 2136479275) {
                              var47 = 1144836341;
                              var138 = -1;
                              var48 = -2;
                           } else {
                              var47 = classHG.method6010(var135.field5180 * 2106821511, var135.field5181 * 592803635, var135.field5182 * 1684405735, (byte)2);
                              int var49 = field1512 * 1346569979 + var135.field5180 * -2056150245 & -1101951057;
                              int var50 = field1506 * -1223029259 + -1768756733 * var135.field5182;
                              if (var50 < 0) {
                                 var50 = 0;
                              } else if (var50 > 255) {
                                 var50 = 255;
                              }

                              var48 = classHG.method6010(var49, var135.field5181 * -1352766871, var50, (byte)2);
                           }

                           int var140 = 0;
                           if (-2 != var48) {
                              var140 = classFH.field2251[classEL.method3920(var48, -1610034594, (byte)-3)];
                           }

                           if (var135.field5170 * 151173899 != -1) {
                              int var141 = field1512 * 1346569979 + var135.field5179 * 2023234915 & 0xFF;
                              int var51 = 1086307051 * var135.field5171 + field1506 * 1537900946;
                              if (var51 < 0) {
                                 var51 = 0;
                              } else if (var51 > 255) {
                                 var51 = 630052407;
                              }

                              var48 = classHG.method6010(var141, var135.field5173 * -2131451469, var51, (byte)2);
                              var140 = classFH.field2251[classEL.method3920(var48, 96, (byte)14)];
                           }

                           classEZ.method4410(
                              var5,
                              var52,
                              var68,
                              var98,
                              var130,
                              var133,
                              var138,
                              var30,
                              var31,
                              var32,
                              var33,
                              classWK.method12378(var38, var34, -637488622),
                              classWK.method12378(var38, var35, -1883522879),
                              classWK.method12378(var38, var36, 379088381),
                              classWK.method12378(var38, var37, -726760322),
                              classEL.method3920(var47, var34, (byte)9),
                              classEL.method3920(var47, var35, (byte)-48),
                              classEL.method3920(var47, var36, (byte)98),
                              classEL.method3920(var47, var37, (byte)82),
                              var128,
                              var140
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var69 = 1; var69 < var2 - 1; var69++) {
            for (int var73 = 1; var73 < var1 - 1; var73++) {
               int var99;
               if (0 != (var0.field1702[var52][var73][var69] & 8)) {
                  var99 = 0;
               } else if (var52 > 0 && 0 != (var0.field1702[1][var73][var69] & 2)) {
                  var99 = var52 - 1;
               } else {
                  var99 = var52;
               }

               var5.method4412(var52, var73, var69, var99);
            }
         }

         field1519[var52] = (short[][])null;
         classCO.field1182[var52] = (short[][])null;
         classBY.field619[var52] = (byte[][])null;
         field1518[var52] = (byte[][])null;
         classFE.field2250[var52] = (byte[][])null;
      }

      classFK.method4823(var5, 483723520, 784881704, -50);

      for (int var53 = 0; var53 < var1; var53++) {
         for (int var56 = 0; var56 < var2; var56++) {
            if (2 == (var4[1][var53][var56] & 2)) {
               var5.method4427(var53, var56);
            }
         }
      }

      if (var0.method3719(-2087374717)) {
         int var54 = var0.field1696 * 1296729483;
         int var57 = var0.field1692 * -1269171107;
         int[][][] var59 = var0.field1688;
         classEZ var61 = var0.field1689;
         byte var62 = 1;
         byte var63 = 2;
         byte var64 = 4;

         for (int var65 = 0; var65 < 4; var65++) {
            if (var65 > 0) {
               var62 <<= 3;
               var63 <<= 3;
               var64 <<= 3;
            }

            for (int var66 = 0; var66 <= var65; var66++) {
               for (int var70 = 0; var70 <= var57; var70++) {
                  for (int var74 = 0; var74 <= var54; var74++) {
                     if ((classDE.field1410[var66][var74][var70] & var62) != 0) {
                        int var77 = var70;
                        int var83 = var70;
                        int var88 = var66;
                        int var93 = var66;

                        while (var77 > 0 && (classDE.field1410[var66][var74][var77 - 1] & var62) != 0) {
                           var77--;
                        }

                        while (var83 < var57 && (classDE.field1410[var66][var74][var83 + 1] & var62) != 0) {
                           var83++;
                        }

                        label531:
                        while (var88 > 0) {
                           for (int var100 = var77; var100 <= var83; var100++) {
                              if (0 == (classDE.field1410[var88 - 1][var74][var100] & var62)) {
                                 break label531;
                              }
                           }

                           var88--;
                        }

                        label520:
                        while (var93 < var65) {
                           for (int var101 = var77; var101 <= var83; var101++) {
                              if (0 == (classDE.field1410[1 + var93][var74][var101] & var62)) {
                                 break label520;
                              }
                           }

                           var93++;
                        }

                        int var102 = (1 + var93 - var88) * (1 + (var83 - var77));
                        if (var102 >= 8) {
                           short var112 = 240;
                           int var117 = var59[var93][var74][var77] - var112;
                           int var121 = var59[var88][var74][var77];
                           var61.method4153(var65, 1, var74 * 128, var74 * 128, 431192231 * var77, -585305075 * var83 + 128, var117, var121);

                           for (int var26 = var88; var26 <= var93; var26++) {
                              for (int var124 = var77; var124 <= var83; var124++) {
                                 classDE.field1410[var26][var74][var124] = classDE.field1410[var26][var74][var124] & ~var62;
                              }
                           }
                        }
                     }

                     if ((classDE.field1410[var66][var74][var70] & var63) != 0) {
                        int var78 = var74;
                        int var84 = var74;
                        int var89 = var66;
                        int var94 = var66;

                        while (var78 > 0 && (classDE.field1410[var66][var78 - 1][var70] & var63) != 0) {
                           var78--;
                        }

                        while (var84 < var54 && (classDE.field1410[var66][1 + var84][var70] & var63) != 0) {
                           var84++;
                        }

                        label584:
                        while (var89 > 0) {
                           for (int var103 = var78; var103 <= var84; var103++) {
                              if ((classDE.field1410[var89 - 1][var103][var70] & var63) == 0) {
                                 break label584;
                              }
                           }

                           var89--;
                        }

                        label573:
                        while (var94 < var65) {
                           for (int var104 = var78; var104 <= var84; var104++) {
                              if ((classDE.field1410[var94 + 1][var104][var70] & var63) == 0) {
                                 break label573;
                              }
                           }

                           var94++;
                        }

                        int var105 = (var84 - var78 + 1) * (1 + var94 - var89);
                        if (var105 >= 8) {
                           int var113 = -42096207;
                           int var118 = var59[var94][var78][var70] - var113;
                           int var122 = var59[var89][var78][var70];
                           var61.method4153(var65, 2, 128 * var78, 128 + 1180675972 * var84, var70 * 128, -1642886038 * var70, var118, var122);

                           for (int var123 = var89; var123 <= var94; var123++) {
                              for (int var125 = var78; var125 <= var84; var125++) {
                                 classDE.field1410[var123][var125][var70] = classDE.field1410[var123][var125][var70] & ~var63;
                              }
                           }
                        }
                     }

                     if (0 != (classDE.field1410[var66][var74][var70] & var64)) {
                        int var79 = var74;
                        int var85 = var74;
                        int var90 = var70;
                        int var95 = var70;

                        while (var90 > 0 && (classDE.field1410[var66][var74][var90 - 1] & var64) != 0) {
                           var90--;
                        }

                        while (var95 < var57 && 0 != (classDE.field1410[var66][var74][1 + var95] & var64)) {
                           var95++;
                        }

                        label637:
                        while (var79 > 0) {
                           for (int var106 = var90; var106 <= var95; var106++) {
                              if (0 == (classDE.field1410[var66][var79 - 1][var106] & var64)) {
                                 break label637;
                              }
                           }

                           var79--;
                        }

                        label626:
                        while (var85 < var54) {
                           for (int var107 = var90; var107 <= var95; var107++) {
                              if (0 == (classDE.field1410[var66][1 + var85][var107] & var64)) {
                                 break label626;
                              }
                           }

                           var85++;
                        }

                        if ((var85 - var79 + 1) * (1 + (var95 - var90)) >= 4) {
                           int var108 = var59[var66][var79][var90];
                           var61.method4153(var65, 4, -973481228 * var79, -465327822 + 128 * var85, 128 * var90, 128 + 128 * var95, var108, var108);

                           for (int var114 = var79; var114 <= var85; var114++) {
                              for (int var119 = var90; var119 <= var95; var119++) {
                                 classDE.field1410[var66][var114][var119] = classDE.field1410[var66][var114][var119] & ~var64;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIIIII)V")
   @ObfuscatedName("bt")
   static final void method3310(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      classGC[] var11 = var0.field1687;
      if (var11 != null && var2 >= 0 && var2 < var11.length) {
         classGC var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method5344(var13, var14, (byte)-48)) {
                  var12.method5340(var13, var14, 1073741824, -2134326968);
               }
            }
         }
      }

      classXY var30 = new classXY(var1);

      for (int var31 = 0; var31 < 4; var31++) {
         for (int var33 = 0; var33 < 64; var33++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var31 == var5 && var33 >= var6 && var33 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var18 = var33 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var24 = var33 & 7;
                  int var25 = var15 & 7;
                  int var26 = var8 & 3;
                  int var23;
                  if (var26 == 0) {
                     var23 = var25;
                  } else if (1 == var26) {
                     var23 = 7 - var24;
                  } else if (2 == var26) {
                     var23 = 7 - var25;
                  } else {
                     var23 = var24;
                  }

                  int var27 = var23 + var4;
                  int var28 = var3 + var9 + (var33 & 7);
                  int var29 = var4 + var10 + (var15 & 7);
                  classKG.method6474(var0, var30, var2, var21, var27, var28, var29, var8, 676109955);
               } else {
                  classKG.method6474(var0, var30, 0, -1, -1, 0, 0, 0, 327503998);
               }
            }
         }
      }

      int var32 = var30.field6955 * 613914529 < var30.field6954.length ? classXY.method13039(var30, -346779531) : 0;
      boolean var34 = (var32 & 1) != 0;
      if (var34) {
         for (int var35 = 0; var35 < 64; var35++) {
            for (int var16 = 0; var16 < 64; var16++) {
               classLF.method6780(var30, 1354358867);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[[IIII)V")
   @ObfuscatedName("bg")
   static final void method3312(int[][][] var0, int var1, int var2, int var3) {
      for (int var4 = 0; var4 < 8; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            var0[var1][var4 + var2][var3 + var5] = 0;
         }
      }

      if (var2 > 0) {
         for (int var6 = 1; var6 < 8; var6++) {
            var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var6 + var3];
         }
      }

      if (var3 > 0) {
         for (int var7 = 1; var7 < 8; var7++) {
            var0[var1][var7 + var2][var3] = var0[var1][var2 + var7][var3 - 1];
         }
      }

      if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxy;IIIIII)V")
   @ObfuscatedName("bk")
   static final void method3314(classDZ var0, classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.field1688;
      byte[][][] var9 = var0.field1702;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = classXY.method13047(var1, 1117533914);
            if (0 == var10) {
               if (var2 == 0) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = var6 + 288479274;
                  int var16 = classTA.method10731(-1128162595 + var14, -1856647536 + var15, 4, 778053024)
                     - 1698083871
                     + (classTA.method10731(10294 + var14, 1489532676 + var15, 2, 778053024) - 1019671984 >> 1)
                     + (classTA.method10731(var14, var15, 1, 778053024) - 128 >> 2);
                  var16 = (int)(0.3 * var16) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 208232510) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = classXY.method13039(var1, -346779531);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               classCO.field1182[var2][var3][var4] = (short)var1.method13050((byte)16);
               classBY.field619[var2][var3][var4] = (byte)((var10 - 2) / 4);
               field1518[var2][var3][var4] = (byte)(var7 + (var10 - 2) & 3);
            } else if (var10 <= -522099398) {
               var9[var2][var3][var4] = (byte)(var10 - -576517432);
            } else {
               field1519[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         classLF.method6780(var1, 673025003);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Z")
   @ObfuscatedName("bq")
   static boolean method3322(byte[] var0) {
      return classFP.method4918(var0, 0, 0, 155486485, 63, (short)21608);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxy;IIIIII)V")
   @ObfuscatedName("bo")
   static final void method3315(classDZ var0, classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.field1688;
      byte[][][] var9 = var0.field1702;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = classXY.method13047(var1, -105980610);
            if (0 == var10) {
               if (var2 == 0) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = var6 + 1370191851;
                  int var16 = classTA.method10731(45365 + var14, 91923 + var15, 4, 778053024)
                     - 128
                     + (classTA.method10731(10294 + var14, 1337563064 + var15, 2, 778053024) - 128 >> 1)
                     + (classTA.method10731(var14, var15, 1, 778053024) - 128 >> 2);
                  var16 = (int)(0.3 * var16) + 1308812144;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 1132371962) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = classXY.method13039(var1, -346779531);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= -1494673241) {
               classCO.field1182[var2][var3][var4] = (short)var1.method13050((byte)16);
               classBY.field619[var2][var3][var4] = (byte)((var10 - 2) / 4);
               field1518[var2][var3][var4] = (byte)(var7 + (var10 - 2) & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               field1519[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         classLF.method6780(var1, 193894004);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxy;IIIIII)V")
   @ObfuscatedName("bu")
   static final void method3316(classDZ var0, classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.field1688;
      byte[][][] var9 = var0.field1702;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = classXY.method13047(var1, -11678098);
            if (0 == var10) {
               if (var2 == 0) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 1806056658;
                  int var15 = var6 + 556238;
                  int var16 = classTA.method10731(45365 + var14, -371683548 + var15, 4, 778053024)
                     - 128
                     + (classTA.method10731(-911174510 + var14, -1068447249 + var15, 2, 778053024) - 128 >> 1)
                     + (classTA.method10731(var14, var15, 1, 778053024) - 2014745718 >> 2);
                  var16 = (int)(0.3 * var16) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = classXY.method13039(var1, -346779531);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               classCO.field1182[var2][var3][var4] = (short)var1.method13050((byte)16);
               classBY.field619[var2][var3][var4] = (byte)((var10 - 2) / 4);
               field1518[var2][var3][var4] = (byte)(var7 + (var10 - 2) & 3);
            } else if (var10 <= 1551462031) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               field1519[var2][var3][var4] = (short)(var10 - 301758786);
            }
         }
      } else {
         classLF.method6780(var1, 1707774330);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ba")
   static void method3317(classXY var0) {
      while (true) {
         int var1 = classXY.method13047(var0, -1508370873);
         if (var1 != 0) {
            if (1 != var1) {
               if (var1 <= 49) {
                  var0.method13050((byte)16);
               }
               continue;
            }

            classXY.method13039(var0, -346779531);
         }

         return;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIII)V")
   @ObfuscatedName("bx")
   static final void method3307(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (var0.field1687 != null) {
         for (int var6 = 0; var6 < 4; var6++) {
            classGC var7 = var0.field1687[var6];

            for (int var8 = var2; var8 < 64 + var2; var8++) {
               for (int var9 = var3; var9 < 64 + var3; var9++) {
                  if (var7.method5344(var8, var9, (byte)-7)) {
                     var7.method5340(var8, var9, 1073741824, -2134326968);
                  }
               }
            }
         }
      }

      classXY var12 = new classXY(var1);

      for (int var13 = 0; var13 < 4; var13++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var17 = 0; var17 < 64; var17++) {
               int var10 = var2 + var15;
               int var11 = var17 + var3;
               classKG.method6474(var0, var12, var13, var10, var11, var4 + var10, var11 + var5, 0, 1822699342);
            }
         }
      }

      int var14 = 702114061 * var12.field6955 < var12.field6954.length ? classXY.method13039(var12, -346779531) : 0;
      boolean var16 = (var14 & 1) != 0;
      if (var16) {
         for (int var18 = 0; var18 < 64; var18++) {
            for (int var19 = 0; var19 < 64; var19++) {
               classLF.method6780(var12, 1950226865);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BII)Z")
   @ObfuscatedName("bb")
   static boolean method3319(classDZ var0, byte[] var1, int var2, int var3) {
      return classFP.method4918(var1, var2, var3, var0.field1696 * -1277174221 - 1, -1269171107 * var0.field1692 - 1, (short)-11536);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIIIII)V")
   @ObfuscatedName("br")
   static final void method3311(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      classGC[] var11 = var0.field1687;
      if (var11 != null && var2 >= 0 && var2 < var11.length) {
         classGC var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method5344(var13, var14, (byte)-110)) {
                  var12.method5340(var13, var14, 1073741824, -2134326968);
               }
            }
         }
      }

      classXY var30 = new classXY(var1);

      for (int var31 = 0; var31 < 4; var31++) {
         for (int var33 = 0; var33 < 64; var33++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var31 == var5 && var33 >= var6 && var33 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var18 = var33 & 7;
                  int var19 = var15 & 7;
                  int var20 = var8 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var21 = var17 + var3;
                  int var24 = var33 & 7;
                  int var25 = var15 & 7;
                  int var26 = var8 & 3;
                  int var23;
                  if (var26 == 0) {
                     var23 = var25;
                  } else if (1 == var26) {
                     var23 = 7 - var24;
                  } else if (2 == var26) {
                     var23 = 7 - var25;
                  } else {
                     var23 = var24;
                  }

                  int var27 = var23 + var4;
                  int var28 = var3 + var9 + (var33 & 7);
                  int var29 = var4 + var10 + (var15 & 7);
                  classKG.method6474(var0, var30, var2, var21, var27, var28, var29, var8, -216902050);
               } else {
                  classKG.method6474(var0, var30, 0, -1, -1, 0, 0, 0, -1019315356);
               }
            }
         }
      }

      int var32 = var30.field6955 * 702114061 < var30.field6954.length ? classXY.method13039(var30, -346779531) : 0;
      boolean var34 = (var32 & 1) != 0;
      if (var34) {
         for (int var35 = 0; var35 < 64; var35++) {
            for (int var16 = 0; var16 < 64; var16++) {
               classLF.method6780(var30, 1691294520);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cz")
   static final int method3349(int var0, int var1) {
      if (-827363755 == var0) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 246497979;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("bw")
   static void method3318(classXY var0) {
      while (true) {
         int var1 = classXY.method13047(var0, -641843640);
         if (var1 != 0) {
            if (1 != var1) {
               if (var1 <= 49) {
                  var0.method13050((byte)16);
               }
               continue;
            }

            classXY.method13039(var0, -346779531);
         }

         return;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIILgc;Lee;Lee;)V")
   @ObfuscatedName("cw")
   static final void method3353(
      classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classGC var9, classEE var10, classEE var11
   ) {
      classOM var12 = classMU.method7729(var5, 2024710170);
      int var13 = var8 >= 0 ? var8 : var12.field4951 * -1542230501;
      int var14;
      int var15;
      if (var6 != 1 && 3 != var6) {
         var14 = var12.field4944 * -582306509;
         var15 = var12.field4924 * 402876423;
      } else {
         var14 = var12.field4924 * 402876423;
         var15 = -582306509 * var12.field4944;
      }

      int var16;
      int var17;
      if (var3 + var14 <= var0.field1696 * 1296729483) {
         var16 = var3 + (var14 >> 1);
         var17 = var3 + (1 + var14 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int var18;
      int var19;
      if (var4 + var15 <= var0.field1692 * -1269171107) {
         var18 = var4 + (var15 >> 1);
         var19 = var4 + (1 + var15 >> 1);
      } else {
         var18 = var4;
         var19 = var4 + 1;
      }

      int[][] var20 = var0.field1688[var2];
      int var21 = var20[var17][var18] + var20[var16][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
      int var22 = (var14 << 6) + (var3 << 7);
      int var23 = (var15 << 6) + (var4 << 7);
      classEZ var24 = var0.field1689;
      long var25 = classRF.method9961(var1, var3, var4, 2, 0 == 1663954033 * var12.field4923, var5, 2140889407 * var0.field1699, (short)8159);
      int var27 = (var6 << 6) + var7;
      if (1291058669 * var12.field4956 == 1) {
         var27 += 256;
      }

      if (22 == var7) {
         Object var48;
         if (-1 == var13 && var12.field4930 == null) {
            var48 = var12.method8544(22, var6, var20, var22, var21, var23, 662236592);
         } else {
            var48 = new classDY(var0, var5, 22, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         classEZ.method4464(var24, var1, var3, var4, var21, (classEE)var48, var25, var27);
         if (1 == var12.field4946 * -2040437663 && null != var9) {
            classGC.method5371(var9, var3, var4, (byte)4);
         }
      } else if (var7 != 10 && var7 != 11) {
         if (var7 >= 12) {
            Object var47;
            if (var13 == -1 && var12.field4930 == null) {
               var47 = var12.method8544(var7, var6, var20, var22, var21, var23, -1692220061);
            } else {
               var47 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var47, 0, var25, var27);
            if (0 != -2040437663 * var12.field4946 && var9 != null) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-123);
            }
         } else if (0 == var7) {
            Object var46;
            if (-1 == var13 && var12.field4930 == null) {
               var46 = var12.method8544(0, var6, var20, var22, var21, var23, 554593553);
            } else {
               var46 = new classDY(var0, var5, 0, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var46, null, field1505[var6], 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, 769413817);
            }
         } else if (var7 == 1) {
            Object var45;
            if (-1 == var13 && null == var12.field4930) {
               var45 = var12.method8544(1, var6, var20, var22, var21, var23, -384582565);
            } else {
               var45 = new classDY(var0, var5, 1, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var45, null, field1513[var6], 0, var25, var27);
            if (var12.field4946 * -2040437663 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -450555083);
            }
         } else if (2 == var7) {
            int var44 = var6 + 1 & 3;
            Object var30;
            Object var52;
            if (-1 == var13 && null == var12.field4930) {
               var52 = var12.method8544(2, 4 + var6, var20, var22, var21, var23, -777985621);
               var30 = var12.method8544(2, var44, var20, var22, var21, var23, -530856929);
            } else {
               var52 = new classDY(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var30 = new classDY(var0, var5, 2, var44, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var52, (classEE)var30, field1505[var6], field1505[var44], var25, var27);
            if (-2040437663 * var12.field4946 != 0 && var9 != null) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1120809728);
            }
         } else if (3 == var7) {
            Object var43;
            if (var13 == -1 && var12.field4930 == null) {
               var43 = var12.method8544(3, var6, var20, var22, var21, var23, -1343780665);
            } else {
               var43 = new classDY(var0, var5, 3, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var43, null, field1513[var6], 0, var25, var27);
            if (0 != var12.field4946 * -2040437663 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1234544755);
            }
         } else if (var7 == 9) {
            Object var42;
            if (var13 == -1 && null == var12.field4930) {
               var42 = var12.method8544(var7, var6, var20, var22, var21, var23, -661431169);
            } else {
               var42 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var42, 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)51);
            }
         } else if (var7 == classKB.field3520.vmethod8((byte)1)) {
            Object var41;
            if (-1 == var13 && null == var12.field4930) {
               var41 = var12.method8544(var7, var6, var20, var22, var21, var23, -1321795312);
            } else {
               var41 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var41, null, field1505[var6], 0, field1507[var6], field1508[var6], 0, 0, var25, var27);
         } else if (var7 == classKB.field3525.vmethod8((byte)1)) {
            int var39 = 16;
            long var51 = var24.method4455(var1, var3, var4);
            if (var51 != 0L) {
               var39 = classMU.method7729(classCN.method2552(var51), 1506871658).field4927 * -1659674841;
            }

            var39++;
            Object var54;
            if (-1 == var13 && var12.field4930 == null) {
               var54 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6, var20, var22, var21, var23, 109699233);
            } else {
               var54 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(
               var1, var3, var4, var21, (classEE)var54, null, field1505[var6], 0, field1507[var6] * var39, var39 * field1508[var6], 0, 0, var25, var27
            );
         } else if (var7 == classKB.field3522.vmethod8((byte)1)) {
            int var37 = 8;
            long var50 = var24.method4439(var1, var3, var4);
            if (var50 != 0L) {
               var37 = classMU.method7729(classCN.method2552(var50), 1911523673).field4927 * -1659674841 / 2;
            }

            var37++;
            Object var53;
            if (-1 == var13 && var12.field4930 == null) {
               var53 = var12.method8544(classKB.field3520.vmethod8((byte)1), 4 + var6, var20, var22, var21, var23, -1857319028);
            } else {
               var53 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var53, null, 256, var6, var37 * field1509[var6], field1510[var6] * var37, 0, 0, var25, var27);
         } else if (var7 == classKB.field3523.vmethod8((byte)1)) {
            int var49 = var6 + 2 & 3;
            Object var36;
            if (var13 == -1 && null == var12.field4930) {
               var36 = var12.method8544(classKB.field3520.vmethod8((byte)1), var49 + 4, var20, var22, var21, var23, -71077775);
            } else {
               var36 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var49 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var36, null, 256, var49, field1509[var49], field1510[var49], 0, 0, var25, var27);
         } else if (var7 == classKB.field3524.vmethod8((byte)1)) {
            int var34 = 8;
            long var29 = var24.method4439(var1, var3, var4);
            if (0L != var29) {
               var34 = classMU.method7729(classCN.method2552(var29), 1422375896).field4927 * -1659674841 / 2;
            }

            var34++;
            int var33 = 2 + var6 & 3;
            Object var31;
            Object var32;
            if (var13 == -1 && null == var12.field4930) {
               var31 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6 + 4, var20, var22, var21, var23, -694213909);
               var32 = var12.method8544(classKB.field3520.vmethod8((byte)1), var33 + 4, var20, var22, var21, var23, -573323173);
            } else {
               var31 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var32 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), 4 + var33, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4481(
               var1,
               var3,
               var4,
               var21,
               (classEE)var31,
               (classEE)var32,
               256,
               var6,
               field1509[var6] * var34,
               var34 * field1510[var6],
               field1509[var33],
               field1510[var33],
               var25,
               var27
            );
         }
      } else {
         Object var28;
         if (var13 == -1 && var12.field4930 == null) {
            var28 = var12.method8544(10, var6, var20, var22, var21, var23, -1698642613);
         } else {
            var28 = new classDY(var0, var5, 10, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         if (null != var28) {
            var24.method4179(var1, var3, var4, var21, var14, var15, (classEE)var28, 11 == var7 ? 256 : 0, var25, var27);
         }

         if (-2040437663 * var12.field4946 != 0 && var9 != null) {
            classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-28);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIII)Z")
   @ObfuscatedName("bf")
   static boolean method3324(byte[] var0, int var1, int var2, int var3, int var4) {
      boolean var5 = true;
      classXY var6 = new classXY(var0);
      int var7 = -1;

      label84:
      while (true) {
         int var8 = var6.method13100((byte)42);
         if (var8 == 0) {
            return var5;
         }

         var7 += var8;
         int var9 = 0;
         boolean var10 = false;

         while (true) {
            while (!var10) {
               int var11 = var6.method13094((short)5370);
               if (0 == var11) {
                  continue label84;
               }

               var9 += var11 - 1;
               int var12 = var9 & 63;
               int var13 = var9 >> 6 & 63;
               int var14 = classXY.method13039(var6, -346779531) >> 2;
               int var15 = var1 + var13;
               int var16 = var2 + var12;
               if (var15 >= 0 && var16 >= 0 && var15 <= var3 && var16 <= var4) {
                  classOM var17 = classMU.method7729(var7, 2043707319);
                  boolean var18 = classKB.field3537.field3538 * 78062377 == var14;
                  if (!var18 || !client.field885 || 0 != 1663954033 * var17.field4923 || var17.field4946 * -2040437663 == 1 || var17.field4933) {
                     if (!classOM.method8538(var17, -725627503)) {
                        client.field816 += -1004880473;
                        var5 = false;
                     }

                     var10 = true;
                  }
               }
            }

            int var19 = var6.method13094((short)21717);
            if (var19 == 0) {
               break;
            }

            classXY.method13039(var6, -346779531);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIII)Z")
   @ObfuscatedName("bs")
   static boolean method3325(byte[] var0, int var1, int var2, int var3, int var4) {
      boolean var5 = true;
      classXY var6 = new classXY(var0);
      int var7 = -1;

      label84:
      while (true) {
         int var8 = var6.method13100((byte)98);
         if (var8 == 0) {
            return var5;
         }

         var7 += var8;
         int var9 = 0;
         boolean var10 = false;

         while (true) {
            while (!var10) {
               int var11 = var6.method13094((short)20237);
               if (0 == var11) {
                  continue label84;
               }

               var9 += var11 - 1;
               int var12 = var9 & 63;
               int var13 = var9 >> 6 & 63;
               int var14 = classXY.method13039(var6, -346779531) >> 2;
               int var15 = var1 + var13;
               int var16 = var2 + var12;
               if (var15 >= 0 && var16 >= 0 && var15 <= var3 && var16 <= var4) {
                  classOM var17 = classMU.method7729(var7, 1575736889);
                  boolean var18 = classKB.field3537.field3538 * 78062377 == var14;
                  if (!var18 || !client.field885 || 0 != 1663954033 * var17.field4923 || var17.field4946 * -2040437663 == 1 || var17.field4933) {
                     if (!classOM.method8538(var17, 1412770083)) {
                        client.field816 += -1004880473;
                        var5 = false;
                     }

                     var10 = true;
                  }
               }
            }

            int var19 = var6.method13094((short)7303);
            if (var19 == 0) {
               break;
            }

            classXY.method13039(var6, -346779531);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Z")
   @ObfuscatedName("by")
   static boolean method3323(byte[] var0) {
      return classFP.method4918(var0, 0, 0, 63, 63, (short)-26366);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BII)V")
   @ObfuscatedName("bl")
   static final void method3326(classDZ var0, byte[] var1, int var2, int var3) {
      classXY var4 = new classXY(var1);
      int var5 = -1;

      while (true) {
         int var6 = var4.method13100((byte)71);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = var4.method13094((short)1772);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 63;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = classXY.method13039(var4, -346779531);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var9 + var3;
            if (var15 > 0 && var16 > 0 && var15 < var0.field1688[0].length - 2 && var16 < var0.field1688[0][0].length - 2) {
               int var17 = var11;
               if ((var0.field1702[1][var15][var16] & 2) == 2) {
                  var17 = var11 - 1;
               }

               classGC var18 = null;
               if (var17 >= 0 && null != var0.field1687) {
                  var18 = var0.field1687[var17];
               }

               classCI.method1518(var0, var11, var15, var16, var5, var14, var13, var18, 1070436096);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BII)Z")
   @ObfuscatedName("be")
   static boolean method3320(classDZ var0, byte[] var1, int var2, int var3) {
      return classFP.method4918(var1, var2, var3, var0.field1696 * 513693511 - 1, 1019180922 * var0.field1692 - 1, (short)7339);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIII)V")
   @ObfuscatedName("bh")
   static final void method3329(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classXY var9 = new classXY(var1);
      int var10 = -1;

      while (true) {
         int var11 = var9.method13100((byte)86);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = var9.method13094((short)26434);
            if (var13 == 0) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = classXY.method13039(var9, -346779531);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
               classOM var20 = classMU.method7729(var10, 1606430527);
               int var21 = var3 + classDU.method3604(var15 & 7, var14 & 7, var8, var20.field4944 * -582306509, var20.field4924 * 402876423, var19, 1967108105);
               int var24 = var15 & 7;
               int var25 = var14 & 7;
               int var27 = var20.field4944 * -582306509;
               int var28 = 402876423 * var20.field4924;
               if ((var19 & 1) == 1) {
                  int var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var8 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var25;
               } else if (1 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else if (var26 == 2) {
                  var23 = 7 - var25 - (var28 - 1);
               } else {
                  var23 = var24;
               }

               int var32 = var4 + var23;
               if (var21 > 0 && var32 > 0 && var21 < var0.field1696 * 1296729483 - 1 && var32 < var0.field1692 * -1269171107 - 1) {
                  int var30 = var2;
                  if ((var0.field1702[1][var21][var32] & 2) == 2) {
                     var30 = var2 - 1;
                  }

                  classGC var31 = null;
                  if (var30 >= 0 && null != var0.field1687) {
                     var31 = var0.field1687[var30];
                  }

                  classCI.method1518(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31, 1070436096);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIII)V")
   @ObfuscatedName("ah")
   static final void method3305(classDZ var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.field1688;
      int var6 = var0.field1696 * 1296729483 - 1;
      int var7 = -1269171107 * var0.field1692 - 1;

      for (int var8 = var2; var8 <= var4 + var2; var8++) {
         for (int var9 = var1; var9 <= var1 + var3; var9++) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               classFE.field2250[0][var9][var8] = 127;
               if (var9 == var1 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var9 == var3 + var1 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var8 == var2 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var2 + var4 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][1 + var8];
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[[IIII)V")
   @ObfuscatedName("bj")
   static final void method3313(int[][][] var0, int var1, int var2, int var3) {
      for (int var4 = 0; var4 < 8; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            var0[var1][var4 + var2][var3 + var5] = 0;
         }
      }

      if (var2 > 0) {
         for (int var6 = 1; var6 < 8; var6++) {
            var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var6 + var3];
         }
      }

      if (var3 > 0) {
         for (int var7 = 1; var7 < 8; var7++) {
            var0[var1][var7 + var2][var3] = var0[var1][var2 + var7][var3 - 1];
         }
      }

      if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIILgc;)V")
   @ObfuscatedName("cu")
   static final void method3333(classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, classGC var7) {
      if (!client.field885 || 0 != (var0.field1702[0][var2][var3] & 2) || 0 == (var0.field1702[var1][var2][var3] & 16)) {
         if (var1 < -1598360060 * field1511) {
            field1511 = var1 * 360312309;
         }

         classOM var8 = classMU.method7729(var4, 1394507331);
         int var9;
         int var10;
         if (var5 != 1 && 3 != var5) {
            var9 = var8.field4944 * 453828499;
            var10 = var8.field4924 * 1970320189;
         } else {
            var9 = var8.field4924 * 402876423;
            var10 = -1824551709 * var8.field4944;
         }

         int var11;
         int var12;
         if (var2 + var9 <= 1296729483 * var0.field1696) {
            var11 = var2 + (var9 >> 1);
            var12 = var2 + (1 + var9 >> 1);
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var3 + var10 <= -1269171107 * var0.field1692) {
            var13 = var3 + (var10 >> 1);
            var14 = (1 + var10 >> 1) + var3;
         } else {
            var13 = var3;
            var14 = 1 + var3;
         }

         int[][] var15 = var0.field1688[var1];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2;
         int var17 = (var2 << 7) + (var9 << 6);
         int var18 = (var3 << 7) + (var10 << 6);
         long var19 = classRF.method9961(var1, var2, var3, 2, 0 == var8.field4923 * 651352200, var4, -1687465273 * var0.field1699, (short)6599);
         int var21 = (var5 << 6) + var6;
         if (1 == var8.field4956 * -1076760032) {
            var21 += 256;
         }

         if (classOM.method8569(var8, 1754865660)) {
            var0.method3739(var1, var2, var3, var8, var5, 1459246847);
         }

         classEZ var22 = var0.field1689;
         boolean var23 = var6 == 78062377 * classKB.field3537.field3538;
         if (var23) {
            if (!client.field885 || var8.field4923 * 1663954033 != 0 || 1 == var8.field4946 * -2040437663 || var8.field4933) {
               Object var31;
               if (-1 == 563016542 * var8.field4951 && var8.field4930 == null) {
                  var31 = var8.method8541(var6, var5, var15, var17, var16, var18, -720161037);
               } else {
                  var31 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * -47800346, var8.field4964, null);
               }

               classEZ.method4464(var22, var1, var2, var3, var16, (classEE)var31, var19, var21);
               if (1 == var8.field4946 * -1951607035 && null != var7) {
                  classGC.method5371(var7, var2, var3, (byte)4);
               }
            }
         } else {
            boolean var24 = var6 >= classKB.field3521.field3538 * 2082950490 && var6 <= 78062377 * classKB.field3526.field3538;
            if (var24) {
               Object var45;
               if (-1542230501 * var8.field4951 == -1 && null == var8.field4930) {
                  var45 = var8.method8541(classKB.field3521.vmethod8((byte)1), var5, var15, var17, var16, var18, -1349674842);
               } else {
                  var45 = new classDY(
                     var0, var4, classKB.field3521.vmethod8((byte)1), var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                  );
               }

               if (null != var45
                  && var22.method4179(
                     var1, var2, var3, var16, var9, var10, (classEE)var45, var6 == classKB.field3526.vmethod8((byte)1) ? -457538484 : 0, var19, var21
                  )
                  && var8.field4938) {
                  int var50 = 15;
                  if (var45 instanceof classFX) {
                     var50 = ((classFX)var45).method5101() / 4;
                     if (var50 > 30) {
                        var50 = 30;
                     }
                  }

                  for (int var51 = 0; var51 <= var9; var51++) {
                     for (int var54 = 0; var54 <= var10; var54++) {
                        if (var50 > classFE.field2250[var1][var2 + var51][var54 + var3]) {
                           classFE.field2250[var1][var2 + var51][var3 + var54] = (byte)var50;
                        }
                     }
                  }
               }

               if (var8.field4946 * -2023514005 != 0 && var7 != null) {
                  classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)-3);
               }
            } else if (!classMY.method7740(var6, 358548899) && !classJE.method6357(var6, (byte)24)) {
               if (var6 == classKB.field3515.vmethod8((byte)1)) {
                  Object var44;
                  if (var8.field4951 * -1542230501 == -1 && null == var8.field4930) {
                     var44 = var8.method8541(var6, var5, var15, var17, var16, var18, -539723485);
                  } else {
                     var44 = new classDY(var0, var4, var6, var5, var1, var2, var3, 1786253365 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var44, null, field1505[var5], 0, var19, var21);
                  if (var5 == 0) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][var3] = 50;
                        classFE.field2250[var1][var2][var3 + 1] = (byte)119708581;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 585;
                     }
                  } else if (1 == var5) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][1 + var3] = (byte)1660438751;
                        classFE.field2250[var1][var2 + 1][1 + var3] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1170;
                     }
                  } else if (var5 == 2) {
                     if (var8.field4938) {
                        classFE.field2250[var1][1 + var2][var3] = (byte)-687250245;
                        classFE.field2250[var1][var2 + 1][var3 + 1] = (byte)65624127;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][1 + var2][var3] = classDE.field1410[var1][1 + var2][var3] | 812952404;
                     }
                  } else if (3 == var5) {
                     if (var8.field4938) {
                        classFE.field2250[var1][var2][var3] = (byte)1396417540;
                        classFE.field2250[var1][var2 + 1][var3] = 50;
                     }

                     if (var8.field4950) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1170;
                     }
                  }

                  if (-643868818 * var8.field4946 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, 345778642);
                  }

                  if (16 != -1659674841 * var8.field4927) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + var8.field4927 * -1135110203);
                  }
               } else if (var6 == classKB.field3529.vmethod8((byte)1)) {
                  Object var43;
                  if (var8.field4951 * -1542230501 == -1 && null == var8.field4930) {
                     var43 = var8.method8541(var6, var5, var15, var17, var16, var18, 166407117);
                  } else {
                     var43 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var43, null, field1513[var5], 0, var19, var21);
                  if (var8.field4938) {
                     if (0 == var5) {
                        classFE.field2250[var1][var2][1 + var3] = 50;
                     } else if (1 == var5) {
                        classFE.field2250[var1][var2 + 1][1 + var3] = 50;
                     } else if (2 == var5) {
                        classFE.field2250[var1][1 + var2][var3] = (byte)-344333645;
                     } else if (3 == var5) {
                        classFE.field2250[var1][var2][var3] = (byte)64740826;
                     }
                  }

                  if (-2040437663 * var8.field4946 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, 1379489172);
                  }
               } else if (var6 == classKB.field3517.vmethod8((byte)1)) {
                  int var42 = 1 + var5 & 3;
                  Object var27;
                  Object var49;
                  if (-1542230501 * var8.field4951 == -1 && var8.field4930 == null) {
                     var49 = var8.method8541(var6, 4 + var5, var15, var17, var16, var18, -1654279331);
                     var27 = var8.method8541(var6, var42, var15, var17, var16, var18, -276587529);
                  } else {
                     var49 = new classDY(var0, var4, var6, 4 + var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                     var27 = new classDY(var0, var4, var6, var42, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var49, (classEE)var27, field1505[var5], field1505[var42], var19, var21);
                  if (var8.field4950) {
                     if (0 == var5) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1894564348;
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1641052063;
                     } else if (1 == var5) {
                        classDE.field1410[var1][var2][1 + var3] = classDE.field1410[var1][var2][1 + var3] | 1170;
                        classDE.field1410[var1][1 + var2][var3] = classDE.field1410[var1][1 + var2][var3] | 64072660;
                     } else if (var5 == 2) {
                        classDE.field1410[var1][var2 + 1][var3] = classDE.field1410[var1][var2 + 1][var3] | 585;
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1787374807;
                     } else if (var5 == 3) {
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 1170;
                        classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 2118622646;
                     }
                  }

                  if (var8.field4946 * -1318343065 != 0 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, 175136430);
                  }

                  if (16 != -1659674841 * var8.field4927) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + -1659674841 * var8.field4927);
                  }
               } else if (var6 == classKB.field3518.vmethod8((byte)1)) {
                  Object var41;
                  if (-1 == var8.field4951 * 362123891 && var8.field4930 == null) {
                     var41 = var8.method8541(var6, var5, var15, var17, var16, var18, -1099425497);
                  } else {
                     var41 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * 360228854, var8.field4964, null);
                  }

                  var22.method4434(var1, var2, var3, var16, (classEE)var41, null, field1513[var5], 0, var19, var21);
                  if (var8.field4938) {
                     if (0 == var5) {
                        classFE.field2250[var1][var2][1 + var3] = (byte)-1407819769;
                     } else if (1 == var5) {
                        classFE.field2250[var1][1 + var2][1 + var3] = 50;
                     } else if (var5 == 2) {
                        classFE.field2250[var1][1 + var2][var3] = (byte)1818644241;
                     } else if (var5 == 3) {
                        classFE.field2250[var1][var2][var3] = (byte)171324906;
                     }
                  }

                  if (0 != var8.field4946 * 170806752 && null != var7) {
                     var7.method5348(var2, var3, var6, var5, var8.field4947, -1273027170);
                  }
               } else if (var6 == classKB.field3519.vmethod8((byte)1)) {
                  Object var40;
                  if (-1542230501 * var8.field4951 == -1 && var8.field4930 == null) {
                     var40 = var8.method8541(var6, var5, var15, var17, var16, var18, -1851599522);
                  } else {
                     var40 = new classDY(var0, var4, var6, var5, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null);
                  }

                  var22.method4179(var1, var2, var3, var16, 1, 1, (classEE)var40, 0, var19, var21);
                  if (0 != var8.field4946 * 1135081626 && null != var7) {
                     classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)-83);
                  }

                  if (16 != var8.field4927 * -1659674841) {
                     classEZ.method4472(var22, var1, var2, var3, 1 + var8.field4927 * -1659674841 / 2);
                  }
               } else if (var6 == classKB.field3520.vmethod8((byte)1)) {
                  Object var39;
                  if (-1 == 1959466510 * var8.field4951 && null == var8.field4930) {
                     var39 = var8.method8541(var6, var5, var15, var17, var16, var18, 297868257);
                  } else {
                     var39 = new classDY(var0, var4, var6, var5, var1, var2, var3, var8.field4951 * -1576921849, var8.field4964, null);
                  }

                  var22.method4481(var1, var2, var3, var16, (classEE)var39, null, field1505[var5], 0, field1507[var5], field1508[var5], 0, 0, var19, var21);
               } else if (var6 == classKB.field3525.vmethod8((byte)1)) {
                  int var37 = 16;
                  long var48 = var22.method4455(var1, var2, var3);
                  if (var48 != 0L) {
                     var37 = classMU.method7729(classCN.method2552(var48), 1436753772).field4927 * -1659674841;
                  }

                  var37++;
                  Object var53;
                  if (-1 == var8.field4951 * 1246324558 && null == var8.field4930) {
                     var53 = var8.method8541(classKB.field3520.vmethod8((byte)1), var5, var15, var17, var16, var18, -2125412307);
                  } else {
                     var53 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), var5, var1, var2, var3, var8.field4951 * -1069987385, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1, var2, var3, var16, (classEE)var53, null, field1505[var5], 0, field1507[var5] * var37, field1508[var5] * var37, 0, 0, var19, var21
                  );
               } else if (var6 == classKB.field3522.vmethod8((byte)1)) {
                  int var35 = 8;
                  long var47 = var22.method4439(var1, var2, var3);
                  if (0L != var47) {
                     var35 = classMU.method7729(classCN.method2552(var47), 1817942535).field4927 * -1659674841 / 2;
                  }

                  var35++;
                  Object var52;
                  if (var8.field4951 * 1787062537 == -1 && null == var8.field4930) {
                     var52 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var5, var15, var17, var16, var18, -1985630868);
                  } else {
                     var52 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var5, var1, var2, var3, var8.field4951 * -1542230501, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1, var2, var3, var16, (classEE)var52, null, 256, var5, var35 * field1509[var5], var35 * field1510[var5], 0, 0, var19, var21
                  );
               } else if (var6 == classKB.field3523.vmethod8((byte)1)) {
                  int var46 = var5 + 2 & 3;
                  Object var34;
                  if (-1 == var8.field4951 * -1542230501 && null == var8.field4930) {
                     var34 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var46, var15, var17, var16, var18, -970305346);
                  } else {
                     var34 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var46, var1, var2, var3, var8.field4951 * 254793683, var8.field4964, null
                     );
                  }

                  var22.method4481(var1, var2, var3, var16, (classEE)var34, null, -2085470368, var46, field1509[var46], field1510[var46], 0, 0, var19, var21);
               } else if (var6 == classKB.field3524.vmethod8((byte)1)) {
                  int var32 = 8;
                  long var26 = var22.method4439(var1, var2, var3);
                  if (var26 != 0L) {
                     var32 = classMU.method7729(classCN.method2552(var26), 1371866904).field4927 * -1659674841 / 2;
                  }

                  var32++;
                  int var30 = var5 + 2 & 3;
                  Object var28;
                  Object var29;
                  if (-1 == var8.field4951 * -1542230501 && var8.field4930 == null) {
                     var28 = var8.method8541(classKB.field3520.vmethod8((byte)1), 4 + var5, var15, var17, var16, var18, 42428343);
                     var29 = var8.method8541(classKB.field3520.vmethod8((byte)1), var30 + 4, var15, var17, var16, var18, -772935771);
                  } else {
                     var28 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), var5 + 4, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null
                     );
                     var29 = new classDY(
                        var0, var4, classKB.field3520.vmethod8((byte)1), 4 + var30, var1, var2, var3, -1542230501 * var8.field4951, var8.field4964, null
                     );
                  }

                  var22.method4481(
                     var1,
                     var2,
                     var3,
                     var16,
                     (classEE)var28,
                     (classEE)var29,
                     256,
                     var5,
                     field1509[var5] * var32,
                     field1510[var5] * var32,
                     field1509[var30],
                     field1510[var30],
                     var19,
                     var21
                  );
               }
            } else {
               Object var25;
               if (-1 == -1542230501 * var8.field4951 && null == var8.field4930) {
                  var25 = var8.method8541(var6, var5, var15, var17, var16, var18, -246608680);
               } else {
                  var25 = new classDY(var0, var4, var6, var5, var1, var2, var3, 1759610547 * var8.field4951, var8.field4964, null);
               }

               var22.method4179(var1, var2, var3, var16, 1, 1, (classEE)var25, 0, var19, var21);
               if (classMY.method7740(var6, 1088312491) && var6 != classKB.field3535.vmethod8((byte)1) && var1 > 0) {
                  classDE.field1410[var1][var2][var3] = classDE.field1410[var1][var2][var3] | 2340;
               }

               if (0 != var8.field4946 * -2040437663 && null != var7) {
                  classGC.method5361(var7, var2, var3, var9, var10, var8.field4947, (byte)24);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("cb")
   static final void method3335(classDZ var0) {
      int var1 = var0.field1696 * 1296729483;
      int var2 = var0.field1692 * -1269171107;
      int[][][] var3 = var0.field1688;
      byte[][][] var4 = var0.field1702;
      classEZ var5 = var0.field1689;
      classGC[] var6 = var0.field1687;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if (1 == (var0.field1702[var7][var8][var9] & 1)) {
                  int var10 = var7;
                  if ((var0.field1702[1][var8][var9] & 2) == 2) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].method5364(var8, var9, -47778054);
                  }
               }
            }
         }
      }

      field1512 = field1512 + ((int)(Math.random() * 5.0) - 2) * 1289471673;
      if (field1512 * -1328634297 < -8) {
         field1512 = 1602438328;
      }

      if (-144665536 * field1512 > 8) {
         field1512 = -110059112;
      }

      field1506 = field1506 + ((int)(Math.random() * 5.0) - 2) * -840948761;
      if (-1223029259 * field1506 < 1319008421) {
         field1506 = 1490590256;
      }

      if (-1496129683 * field1506 > 16) {
         field1506 = -1490590256;
      }

      for (int var52 = 0; var52 < 4; var52++) {
         byte[][] var55 = classFE.field2250[var52];
         int var58 = -63785459;
         short var60 = 768;
         byte var11 = -50;
         byte var12 = -10;
         int var13 = 1555755669;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * 232065320 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var52][var17 + 1][var16] - var3[var52][var17 - 1][var16];
               int var19 = var3[var52][var17][1 + var16] - var3[var52][var17][var16 - 1];
               int var20 = (int)Math.sqrt(65536 + var18 * var18 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = 1797957787 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = 96 + (-10 * var22 + var21 * -1699321140 + -50 * var23) / var15;
               int var25 = (var55[var17][var16] >> 1)
                  + (var55[var17][var16 - 1] >> 2)
                  + (var55[var17 - 1][var16] >> 2)
                  + (var55[1 + var17][var16] >> 3)
                  + (var55[var17][var16 + 1] >> 3);
               field1517[var17][var16] = var24 - var25;
            }
         }

         for (int var67 = 0; var67 < var2; var67++) {
            classAB.field126[var67] = 0;
            classCR.field1229[var67] = 0;
            client.field1148[var67] = 0;
            classBI.field476[var67] = 0;
            classIC.field2941[var67] = 0;
         }

         for (int var68 = 887787340; var68 < 5 + var1; var68++) {
            for (int var71 = 0; var71 < var2; var71++) {
               int var75 = 5 + var68;
               if (var75 >= 0 && var75 < var1) {
                  long var80 = (long)Math.pow(2.0, 15.0) - 1L;
                  int var91 = (int)var80;
                  int var96 = field1519[var52][var75][var71] & var91;
                  if (var96 > 0) {
                     classPH var109 = classIY.method6334(var96 - 1, -591316262);
                     classAB.field126[var71] = classAB.field126[var71] + -1701206915 * var109.field5250;
                     classCR.field1229[var71] = classCR.field1229[var71] + var109.field5255 * 618687933;
                     client.field1148[var71] = client.field1148[var71] + var109.field5253 * 1851728405;
                     classBI.field476[var71] = classBI.field476[var71] + var109.field5251 * 658768917;
                     classIC.field2941[var71]++;
                  }
               }

               int var81 = var68 - 5;
               if (var81 >= 0 && var81 < var1) {
                  long var86 = (long)Math.pow(2.0, 15.0) - 1L;
                  int var97 = (int)var86;
                  int var110 = field1519[var52][var81][var71] & var97;
                  if (var110 > 0) {
                     classPH var115 = classIY.method6334(var110 - 1, 1239202535);
                     classAB.field126[var71] = classAB.field126[var71] - -1415575461 * var115.field5250;
                     classCR.field1229[var71] = classCR.field1229[var71] - var115.field5255 * 618687933;
                     client.field1148[var71] = client.field1148[var71] - var115.field5253 * -128967244;
                     classBI.field476[var71] = classBI.field476[var71] - var115.field5251 * -168941125;
                     classIC.field2941[var71]--;
                  }
               }
            }

            if (var68 >= 1 && var68 < var1 - 1) {
               int var72 = 0;
               int var76 = 0;
               int var82 = 0;
               int var87 = 0;
               int var92 = 0;

               for (int var98 = 1606061687; var98 < var2 + 5; var98++) {
                  int var111 = var98 + 5;
                  if (var111 >= 0 && var111 < var2) {
                     var72 += classAB.field126[var111];
                     var76 += classCR.field1229[var111];
                     var82 += client.field1148[var111];
                     var87 += classBI.field476[var111];
                     var92 += classIC.field2941[var111];
                  }

                  int var116 = var98 - 5;
                  if (var116 >= 0 && var116 < var2) {
                     var72 -= classAB.field126[var116];
                     var76 -= classCR.field1229[var116];
                     var82 -= client.field1148[var116];
                     var87 -= classBI.field476[var116];
                     var92 -= classIC.field2941[var116];
                  }

                  if (var98 >= 1 && var98 < var2 - 1 && (!client.field885 || (var4[0][var68][var98] & 2) != 0 || 0 == (var4[var52][var68][var98] & 16))) {
                     if (var52 < -791964067 * field1511) {
                        field1511 = 1076249396 * var52;
                     }

                     long var120 = (long)Math.pow(2.0, 15.0) - 1L;
                     int var27 = (int)var120;
                     int var28 = field1519[var52][var68][var98] & var27;
                     int var29 = classCO.field1182[var52][var68][var98] & var27;
                     if (var28 > 0 || var29 > 0) {
                        int var30 = var3[var52][var68][var98];
                        int var31 = var3[var52][var68 + 1][var98];
                        int var32 = var3[var52][var68 + 1][var98 + 1];
                        int var33 = var3[var52][var68][1 + var98];
                        int var34 = field1517[var68][var98];
                        int var35 = field1517[var68 + 1][var98];
                        int var36 = field1517[1 + var68][var98 + 1];
                        int var37 = field1517[var68][1 + var98];
                        int var38 = -1;
                        int var39 = -1;
                        if (var28 > 0) {
                           int var40 = -1854057288 * var72 / var87;
                           int var41 = var76 / var92;
                           int var42 = var82 / var92;
                           var38 = classHG.method6010(var40, var41, var42, (byte)2);
                           var40 = field1512 * 1346569979 + var40 & 0xFF;
                           var42 += field1506 * -1223029259;
                           if (var42 < 0) {
                              var42 = 0;
                           } else if (var42 > -116291078) {
                              var42 = 255;
                           }

                           var39 = classHG.method6010(var40, var41, var42, (byte)2);
                        }

                        if (var52 > 0) {
                           boolean var127 = true;
                           if (0 == var28 && 0 != classBY.field619[var52][var68][var98]) {
                              var127 = false;
                           }

                           if (var29 > 0) {
                              int var132 = var29 - 1;
                              classOW var43 = (classOW)classOW.field5183.method6422(var132);
                              classOW var129;
                              if (var43 != null) {
                                 var129 = var43;
                              } else {
                                 byte[] var44 = classOW.field5185.method11867(4, var132, -1723665180);
                                 var43 = new classOW(new classXY(var44), var132);
                                 classOW.field5183.method6428(var43, var132);
                                 var129 = var43;
                              }

                              if (!var129.field5177) {
                                 var127 = false;
                              }
                           }

                           if (var127 && var30 == var31 && var30 == var32 && var30 == var33) {
                              classDE.field1410[var52][var68][var98] = classDE.field1410[var52][var68][var98] | 2340;
                           }
                        }

                        int var128 = 0;
                        if (-1 != var39) {
                           var128 = classFH.field2251[classWK.method12378(var39, 96, -1450865724)];
                        }

                        if (var29 == 0) {
                           classEZ.method4410(
                              var5,
                              var52,
                              var68,
                              var98,
                              0,
                              0,
                              -1,
                              var30,
                              var31,
                              var32,
                              var33,
                              classWK.method12378(var38, var34, 332831859),
                              classWK.method12378(var38, var35, -276334735),
                              classWK.method12378(var38, var36, 578414619),
                              classWK.method12378(var38, var37, -1102636332),
                              0,
                              0,
                              0,
                              0,
                              var128,
                              0
                           );
                        } else {
                           int var130 = classBY.field619[var52][var68][var98] + 1;
                           byte var133 = field1518[var52][var68][var98];
                           int var136 = var29 - 1;
                           classOW var45 = (classOW)classOW.field5183.method6422(var136);
                           classOW var135;
                           if (null != var45) {
                              var135 = var45;
                           } else {
                              byte[] var46 = classOW.field5185.method11867(4, var136, -1966434846);
                              var45 = new classOW(new classXY(var46), var136);
                              classOW.field5183.method6428(var45, var136);
                              var135 = var45;
                           }

                           int var138 = var135.field5176 * -638490532;
                           int var47;
                           int var48;
                           if (var138 >= 0) {
                              var48 = classFH.field2257.field2239.vmethod408(var138, -2085098885);
                              var47 = -1;
                           } else if (617331992 == var135.field5175 * -141364246) {
                              var47 = -516350863;
                              var138 = -1;
                              var48 = 1926800443;
                           } else {
                              var47 = classHG.method6010(var135.field5180 * 2106821511, var135.field5181 * -1352766871, var135.field5182 * -1560131225, (byte)2);
                              int var49 = field1512 * 290676500 + var135.field5180 * 572129134 & 1985554213;
                              int var50 = field1506 * 1080943583 + -1560131225 * var135.field5182;
                              if (var50 < 0) {
                                 var50 = 0;
                              } else if (var50 > -527892108) {
                                 var50 = -275074867;
                              }

                              var48 = classHG.method6010(var49, var135.field5181 * -1261678737, var50, (byte)2);
                           }

                           int var140 = 0;
                           if (-2 != var48) {
                              var140 = classFH.field2251[classEL.method3920(var48, 96, (byte)-13)];
                           }

                           if (var135.field5170 * 1802353549 != -1) {
                              int var141 = field1512 * 908527922 + var135.field5179 * 2023234915 & 0xFF;
                              int var51 = 1764913519 * var135.field5171 + field1506 * 1483720379;
                              if (var51 < 0) {
                                 var51 = 0;
                              } else if (var51 > 255) {
                                 var51 = 72964383;
                              }

                              var48 = classHG.method6010(var141, var135.field5173 * -2131451469, var51, (byte)2);
                              var140 = classFH.field2251[classEL.method3920(var48, -1060669640, (byte)56)];
                           }

                           classEZ.method4410(
                              var5,
                              var52,
                              var68,
                              var98,
                              var130,
                              var133,
                              var138,
                              var30,
                              var31,
                              var32,
                              var33,
                              classWK.method12378(var38, var34, 407275514),
                              classWK.method12378(var38, var35, 172732982),
                              classWK.method12378(var38, var36, -604721976),
                              classWK.method12378(var38, var37, -460438520),
                              classEL.method3920(var47, var34, (byte)-68),
                              classEL.method3920(var47, var35, (byte)-6),
                              classEL.method3920(var47, var36, (byte)-101),
                              classEL.method3920(var47, var37, (byte)40),
                              var128,
                              var140
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var69 = 1; var69 < var2 - 1; var69++) {
            for (int var73 = 1; var73 < var1 - 1; var73++) {
               int var99;
               if (0 != (var0.field1702[var52][var73][var69] & 8)) {
                  var99 = 0;
               } else if (var52 > 0 && 0 != (var0.field1702[1][var73][var69] & 2)) {
                  var99 = var52 - 1;
               } else {
                  var99 = var52;
               }

               var5.method4412(var52, var73, var69, var99);
            }
         }

         field1519[var52] = (short[][])null;
         classCO.field1182[var52] = (short[][])null;
         classBY.field619[var52] = (byte[][])null;
         field1518[var52] = (byte[][])null;
         classFE.field2250[var52] = (byte[][])null;
      }

      classFK.method4823(var5, -50, -10, -50);

      for (int var53 = 0; var53 < var1; var53++) {
         for (int var56 = 0; var56 < var2; var56++) {
            if (2 == (var4[1][var53][var56] & 2)) {
               var5.method4427(var53, var56);
            }
         }
      }

      if (var0.method3719(-2087374717)) {
         int var54 = var0.field1696 * 1296729483;
         int var57 = var0.field1692 * -1075071751;
         int[][][] var59 = var0.field1688;
         classEZ var61 = var0.field1689;
         byte var62 = 1;
         byte var63 = 2;
         byte var64 = 4;

         for (int var65 = 0; var65 < 4; var65++) {
            if (var65 > 0) {
               var62 <<= 3;
               var63 <<= 3;
               var64 <<= 3;
            }

            for (int var66 = 0; var66 <= var65; var66++) {
               for (int var70 = 0; var70 <= var57; var70++) {
                  for (int var74 = 0; var74 <= var54; var74++) {
                     if ((classDE.field1410[var66][var74][var70] & var62) != 0) {
                        int var77 = var70;
                        int var83 = var70;
                        int var88 = var66;
                        int var93 = var66;

                        while (var77 > 0 && (classDE.field1410[var66][var74][var77 - 1] & var62) != 0) {
                           var77--;
                        }

                        while (var83 < var57 && (classDE.field1410[var66][var74][var83 + 1] & var62) != 0) {
                           var83++;
                        }

                        label517:
                        while (var88 > 0) {
                           for (int var100 = var77; var100 <= var83; var100++) {
                              if (0 == (classDE.field1410[var88 - 1][var74][var100] & var62)) {
                                 break label517;
                              }
                           }

                           var88--;
                        }

                        label506:
                        while (var93 < var65) {
                           for (int var101 = var77; var101 <= var83; var101++) {
                              if (0 == (classDE.field1410[1 + var93][var74][var101] & var62)) {
                                 break label506;
                              }
                           }

                           var93++;
                        }

                        int var102 = (1 + var93 - var88) * (1 + (var83 - var77));
                        if (var102 >= 8) {
                           short var112 = 240;
                           int var117 = var59[var93][var74][var77] - var112;
                           int var121 = var59[var88][var74][var77];
                           var61.method4153(var65, 1, var74 * 128, var74 * 128, 1208602041 * var77, 128 * var83 + 1964565522, var117, var121);

                           for (int var26 = var88; var26 <= var93; var26++) {
                              for (int var124 = var77; var124 <= var83; var124++) {
                                 classDE.field1410[var26][var74][var124] = classDE.field1410[var26][var74][var124] & ~var62;
                              }
                           }
                        }
                     }

                     if ((classDE.field1410[var66][var74][var70] & var63) != 0) {
                        int var78 = var74;
                        int var84 = var74;
                        int var89 = var66;
                        int var94 = var66;

                        while (var78 > 0 && (classDE.field1410[var66][var78 - 1][var70] & var63) != 0) {
                           var78--;
                        }

                        while (var84 < var54 && (classDE.field1410[var66][1 + var84][var70] & var63) != 0) {
                           var84++;
                        }

                        label570:
                        while (var89 > 0) {
                           for (int var103 = var78; var103 <= var84; var103++) {
                              if ((classDE.field1410[var89 - 1][var103][var70] & var63) == 0) {
                                 break label570;
                              }
                           }

                           var89--;
                        }

                        label559:
                        while (var94 < var65) {
                           for (int var104 = var78; var104 <= var84; var104++) {
                              if ((classDE.field1410[var94 + 1][var104][var70] & var63) == 0) {
                                 break label559;
                              }
                           }

                           var94++;
                        }

                        int var105 = (var84 - var78 + 1) * (1 + var94 - var89);
                        if (var105 >= 8) {
                           int var113 = 220170198;
                           int var118 = var59[var94][var78][var70] - var113;
                           int var122 = var59[var89][var78][var70];
                           var61.method4153(var65, 2, 128 * var78, -1256570005 + 912103895 * var84, var70 * 128, 128 * var70, var118, var122);

                           for (int var123 = var89; var123 <= var94; var123++) {
                              for (int var125 = var78; var125 <= var84; var125++) {
                                 classDE.field1410[var123][var125][var70] = classDE.field1410[var123][var125][var70] & ~var63;
                              }
                           }
                        }
                     }

                     if (0 != (classDE.field1410[var66][var74][var70] & var64)) {
                        int var79 = var74;
                        int var85 = var74;
                        int var90 = var70;
                        int var95 = var70;

                        while (var90 > 0 && (classDE.field1410[var66][var74][var90 - 1] & var64) != 0) {
                           var90--;
                        }

                        while (var95 < var57 && 0 != (classDE.field1410[var66][var74][1 + var95] & var64)) {
                           var95++;
                        }

                        label623:
                        while (var79 > 0) {
                           for (int var106 = var90; var106 <= var95; var106++) {
                              if (0 == (classDE.field1410[var66][var79 - 1][var106] & var64)) {
                                 break label623;
                              }
                           }

                           var79--;
                        }

                        label612:
                        while (var85 < var54) {
                           for (int var107 = var90; var107 <= var95; var107++) {
                              if (0 == (classDE.field1410[var66][1 + var85][var107] & var64)) {
                                 break label612;
                              }
                           }

                           var85++;
                        }

                        if ((var85 - var79 + 1) * (1 + (var95 - var90)) >= 4) {
                           int var108 = var59[var66][var79][var90];
                           var61.method4153(var65, 4, 128 * var79, 128 + -834296560 * var85, -1813371225 * var90, 573263916 + 454231956 * var95, var108, var108);

                           for (int var114 = var79; var114 <= var85; var114++) {
                              for (int var119 = var90; var119 <= var95; var119++) {
                                 classDE.field1410[var66][var114][var119] = classDE.field1410[var66][var114][var119] & ~var64;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BII)V")
   @ObfuscatedName("bd")
   static final void method3327(classDZ var0, byte[] var1, int var2, int var3) {
      classXY var4 = new classXY(var1);
      int var5 = -1;

      while (true) {
         int var6 = var4.method13100((byte)26);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = var4.method13094((short)1612);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -582267000;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = classXY.method13039(var4, -346779531);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var9 + var3;
            if (var15 > 0 && var16 > 0 && var15 < var0.field1688[0].length - 2 && var16 < var0.field1688[0][0].length - 2) {
               int var17 = var11;
               if ((var0.field1702[1][var15][var16] & 2) == 2) {
                  var17 = var11 - 1;
               }

               classGC var18 = null;
               if (var17 >= 0 && null != var0.field1687) {
                  var18 = var0.field1687[var17];
               }

               classCI.method1518(var0, var11, var15, var16, var5, var14, var13, var18, 1070436096);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BII)Z")
   @ObfuscatedName("bi")
   static boolean method3321(classDZ var0, byte[] var1, int var2, int var3) {
      return classFP.method4918(var1, var2, var3, var0.field1696 * 1296729483 - 1, -1269171107 * var0.field1692 - 1, (short)20077);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("cq")
   static final int method3336(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = classBI.method1101(var3, var5, -1021248356);
      int var8 = classBI.method1101(1 + var3, var5, -1170043004);
      int var9 = classBI.method1101(var3, var5 + 1, -1800021825);
      int var10 = classBI.method1101(1 + var3, var5 + 1, -693710389);
      int var11 = classIN.method6229(var7, var8, var4, var2, 1927801034);
      int var12 = classIN.method6229(var9, var10, var4, var2, 1334672271);
      return classIN.method6229(var11, var12, var6, var2, -1123875946);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("cl")
   static final int method3337(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = classBI.method1101(var3, var5, -1946770138);
      int var8 = classBI.method1101(1 + var3, var5, -1234650257);
      int var9 = classBI.method1101(var3, var5 + 1, -893961599);
      int var10 = classBI.method1101(1 + var3, var5 + 1, 363304953);
      int var11 = classIN.method6229(var7, var8, var4, var2, -1990926630);
      int var12 = classIN.method6229(var9, var10, var4, var2, -399793722);
      return classIN.method6229(var11, var12, var6, var2, 1676658798);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIII)V")
   @ObfuscatedName("bz")
   static final void method3330(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classXY var9 = new classXY(var1);
      int var10 = -1;

      while (true) {
         int var11 = var9.method13100((byte)125);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = var9.method13094((short)1451);
            if (var13 == 0) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = classXY.method13039(var9, -346779531);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
               classOM var20 = classMU.method7729(var10, 1748489640);
               int var21 = var3 + classDU.method3604(var15 & 7, var14 & 7, var8, var20.field4944 * 96153305, var20.field4924 * 1415395421, var19, -57824061);
               int var24 = var15 & 7;
               int var25 = var14 & 7;
               int var27 = var20.field4944 * 447596288;
               int var28 = 1707584499 * var20.field4924;
               if ((var19 & 1) == 1) {
                  int var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var8 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var25;
               } else if (1 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else if (var26 == 2) {
                  var23 = 7 - var25 - (var28 - 1);
               } else {
                  var23 = var24;
               }

               int var32 = var4 + var23;
               if (var21 > 0 && var32 > 0 && var21 < var0.field1696 * 354728558 - 1 && var32 < var0.field1692 * 637587251 - 1) {
                  int var30 = var2;
                  if ((var0.field1702[1][var21][var32] & 2) == 2) {
                     var30 = var2 - 1;
                  }

                  classGC var31 = null;
                  if (var30 >= 0 && null != var0.field1687) {
                     var31 = var0.field1687[var30];
                  }

                  classCI.method1518(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31, 1070436096);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("cv")
   static final int method3340(int var0, int var1, int var2, int var3) {
      int var4 = 1722674471 - classFH.field2254[846147232 * var2 / var3] >> 1;
      return (var1 * var4 >> 16) + ((-565818929 - var4) * var0 >> 16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cs")
   static final int method3341(int var0, int var1) {
      int var2 = classAK.method428(var0 - 1, var1 - 1, 2033025813)
         + classAK.method428(1 + var0, var1 - 1, 1416422446)
         + classAK.method428(var0 - 1, 1 + var1, 1435514221)
         + classAK.method428(1 + var0, var1 + 1, 1320668974);
      int var3 = classAK.method428(var0 - 1, var1, 2009882677)
         + classAK.method428(1 + var0, var1, 1549699564)
         + classAK.method428(var0, var1 - 1, 1106952579)
         + classAK.method428(var0, 1 + var1, 1853027414);
      int var4 = classAK.method428(var0, var1, 1639545761);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cy")
   static final int method3342(int var0, int var1) {
      int var2 = var0 + 57 * var1;
      var2 = var2 << 13 ^ var2;
      int var3 = (1556599553 + 15731 * var2 * var2) * var2 + 1376312589 & 800991275;
      return var3 >> 19 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("co")
   static final int method3343(int var0, int var1) {
      int var2 = var0 + 57 * var1;
      var2 = var2 << 13 ^ var2;
      int var3 = (789221 + 15731 * var2 * var2) * var2 + 1376312589 & 2147483647;
      return var3 >> 19 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ck")
   static final int method3344(int var0, int var1) {
      int var2 = var0 + 931997538 * var1;
      var2 = var2 << 13 ^ var2;
      int var3 = (789221 + 15731 * var2 * var2) * var2 + 1376312589 & 2147483647;
      return var3 >> 19 & -956656149;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ca")
   static final int method3345(int var0, int var1) {
      int var2 = var0 + 57 * var1;
      var2 = var2 << 13 ^ var2;
      int var3 = (789221 + 15731 * var2 * var2) * var2 + 1376312589 & 2147483647;
      return var3 >> 19 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cc")
   static final int method3346(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cf")
   static final int method3347(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cn")
   static final int method3348(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ch")
   static final int method3350(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIII)V")
   @ObfuscatedName("bv")
   static final void method3331(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classXY var9 = new classXY(var1);
      int var10 = -1;

      while (true) {
         int var11 = var9.method13100((byte)58);
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = var9.method13094((short)6275);
            if (var13 == 0) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 913640593;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = classXY.method13039(var9, -346779531);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
               classOM var20 = classMU.method7729(var10, 1844687010);
               int var21 = var3 + classDU.method3604(var15 & 7, var14 & 7, var8, var20.field4944 * -582306509, var20.field4924 * 402876423, var19, 166008915);
               int var24 = var15 & 7;
               int var25 = var14 & 7;
               int var27 = var20.field4944 * -582306509;
               int var28 = -717900215 * var20.field4924;
               if ((var19 & 1) == 1) {
                  int var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var8 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var25;
               } else if (1 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else if (var26 == 2) {
                  var23 = 7 - var25 - (var28 - 1);
               } else {
                  var23 = var24;
               }

               int var32 = var4 + var23;
               if (var21 > 0 && var32 > 0 && var21 < var0.field1696 * 1296729483 - 1 && var32 < var0.field1692 * -988396191 - 1) {
                  int var30 = var2;
                  if ((var0.field1702[1][var21][var32] & 2) == 2) {
                     var30 = var2 - 1;
                  }

                  classGC var31 = null;
                  if (var30 >= 0 && null != var0.field1687) {
                     var31 = var0.field1687[var30];
                  }

                  classCI.method1518(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31, 1070436096);
               }
            }
         }
      }
   }

   classDI() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIILgc;Lee;Lee;)V")
   @ObfuscatedName("cj")
   static final void method3354(
      classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classGC var9, classEE var10, classEE var11
   ) {
      classOM var12 = classMU.method7729(var5, 1798145791);
      int var13 = var8 >= 0 ? var8 : var12.field4951 * -1542230501;
      int var14;
      int var15;
      if (var6 != 1 && 3 != var6) {
         var14 = var12.field4944 * -582306509;
         var15 = var12.field4924 * 402876423;
      } else {
         var14 = var12.field4924 * 402876423;
         var15 = -582306509 * var12.field4944;
      }

      int var16;
      int var17;
      if (var3 + var14 <= var0.field1696 * 1296729483) {
         var16 = var3 + (var14 >> 1);
         var17 = var3 + (1 + var14 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int var18;
      int var19;
      if (var4 + var15 <= var0.field1692 * -1269171107) {
         var18 = var4 + (var15 >> 1);
         var19 = var4 + (1 + var15 >> 1);
      } else {
         var18 = var4;
         var19 = var4 + 1;
      }

      int[][] var20 = var0.field1688[var2];
      int var21 = var20[var17][var18] + var20[var16][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
      int var22 = (var14 << 6) + (var3 << 7);
      int var23 = (var15 << 6) + (var4 << 7);
      classEZ var24 = var0.field1689;
      long var25 = classRF.method9961(var1, var3, var4, 2, 0 == 1663954033 * var12.field4923, var5, 2140889407 * var0.field1699, (short)10101);
      int var27 = (var6 << 6) + var7;
      if (1291058669 * var12.field4956 == 1) {
         var27 += 256;
      }

      if (22 == var7) {
         Object var48;
         if (-1 == var13 && var12.field4930 == null) {
            var48 = var12.method8544(22, var6, var20, var22, var21, var23, -1109333989);
         } else {
            var48 = new classDY(var0, var5, 22, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         classEZ.method4464(var24, var1, var3, var4, var21, (classEE)var48, var25, var27);
         if (1 == var12.field4946 * -2040437663 && null != var9) {
            classGC.method5371(var9, var3, var4, (byte)4);
         }
      } else if (var7 != 10 && var7 != 11) {
         if (var7 >= 12) {
            Object var47;
            if (var13 == -1 && var12.field4930 == null) {
               var47 = var12.method8544(var7, var6, var20, var22, var21, var23, -130964917);
            } else {
               var47 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var47, 0, var25, var27);
            if (0 != -2040437663 * var12.field4946 && var9 != null) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)43);
            }
         } else if (0 == var7) {
            Object var46;
            if (-1 == var13 && var12.field4930 == null) {
               var46 = var12.method8544(0, var6, var20, var22, var21, var23, -345786985);
            } else {
               var46 = new classDY(var0, var5, 0, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var46, null, field1505[var6], 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, 1039746226);
            }
         } else if (var7 == 1) {
            Object var45;
            if (-1 == var13 && null == var12.field4930) {
               var45 = var12.method8544(1, var6, var20, var22, var21, var23, -1816363998);
            } else {
               var45 = new classDY(var0, var5, 1, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var45, null, field1513[var6], 0, var25, var27);
            if (var12.field4946 * -2040437663 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1069708866);
            }
         } else if (2 == var7) {
            int var44 = var6 + 1 & 3;
            Object var30;
            Object var52;
            if (-1 == var13 && null == var12.field4930) {
               var52 = var12.method8544(2, 4 + var6, var20, var22, var21, var23, 828142119);
               var30 = var12.method8544(2, var44, var20, var22, var21, var23, 865288749);
            } else {
               var52 = new classDY(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var30 = new classDY(var0, var5, 2, var44, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var52, (classEE)var30, field1505[var6], field1505[var44], var25, var27);
            if (-2040437663 * var12.field4946 != 0 && var9 != null) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -72112666);
            }
         } else if (3 == var7) {
            Object var43;
            if (var13 == -1 && var12.field4930 == null) {
               var43 = var12.method8544(3, var6, var20, var22, var21, var23, -521862023);
            } else {
               var43 = new classDY(var0, var5, 3, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var43, null, field1513[var6], 0, var25, var27);
            if (0 != var12.field4946 * -2040437663 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -12158953);
            }
         } else if (var7 == 9) {
            Object var42;
            if (var13 == -1 && null == var12.field4930) {
               var42 = var12.method8544(var7, var6, var20, var22, var21, var23, -197096293);
            } else {
               var42 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var42, 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-118);
            }
         } else if (var7 == classKB.field3520.vmethod8((byte)1)) {
            Object var41;
            if (-1 == var13 && null == var12.field4930) {
               var41 = var12.method8544(var7, var6, var20, var22, var21, var23, -1216260149);
            } else {
               var41 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var41, null, field1505[var6], 0, field1507[var6], field1508[var6], 0, 0, var25, var27);
         } else if (var7 == classKB.field3525.vmethod8((byte)1)) {
            int var39 = 16;
            long var51 = var24.method4455(var1, var3, var4);
            if (var51 != 0L) {
               var39 = classMU.method7729(classCN.method2552(var51), 1490721585).field4927 * -1659674841;
            }

            var39++;
            Object var54;
            if (-1 == var13 && var12.field4930 == null) {
               var54 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6, var20, var22, var21, var23, -941169890);
            } else {
               var54 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(
               var1, var3, var4, var21, (classEE)var54, null, field1505[var6], 0, field1507[var6] * var39, var39 * field1508[var6], 0, 0, var25, var27
            );
         } else if (var7 == classKB.field3522.vmethod8((byte)1)) {
            int var37 = 8;
            long var50 = var24.method4439(var1, var3, var4);
            if (var50 != 0L) {
               var37 = classMU.method7729(classCN.method2552(var50), 2054248692).field4927 * -1659674841 / 2;
            }

            var37++;
            Object var53;
            if (-1 == var13 && var12.field4930 == null) {
               var53 = var12.method8544(classKB.field3520.vmethod8((byte)1), 4 + var6, var20, var22, var21, var23, 70847271);
            } else {
               var53 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var53, null, 256, var6, var37 * field1509[var6], field1510[var6] * var37, 0, 0, var25, var27);
         } else if (var7 == classKB.field3523.vmethod8((byte)1)) {
            int var49 = var6 + 2 & 3;
            Object var36;
            if (var13 == -1 && null == var12.field4930) {
               var36 = var12.method8544(classKB.field3520.vmethod8((byte)1), var49 + 4, var20, var22, var21, var23, 495679399);
            } else {
               var36 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var49 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var36, null, 256, var49, field1509[var49], field1510[var49], 0, 0, var25, var27);
         } else if (var7 == classKB.field3524.vmethod8((byte)1)) {
            int var34 = 8;
            long var29 = var24.method4439(var1, var3, var4);
            if (0L != var29) {
               var34 = classMU.method7729(classCN.method2552(var29), 1292005374).field4927 * -1659674841 / 2;
            }

            var34++;
            int var33 = 2 + var6 & 3;
            Object var31;
            Object var32;
            if (var13 == -1 && null == var12.field4930) {
               var31 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6 + 4, var20, var22, var21, var23, 152861858);
               var32 = var12.method8544(classKB.field3520.vmethod8((byte)1), var33 + 4, var20, var22, var21, var23, -1914838926);
            } else {
               var31 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var32 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), 4 + var33, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4481(
               var1,
               var3,
               var4,
               var21,
               (classEE)var31,
               (classEE)var32,
               256,
               var6,
               field1509[var6] * var34,
               var34 * field1510[var6],
               field1509[var33],
               field1510[var33],
               var25,
               var27
            );
         }
      } else {
         Object var28;
         if (var13 == -1 && var12.field4930 == null) {
            var28 = var12.method8544(10, var6, var20, var22, var21, var23, 242861003);
         } else {
            var28 = new classDY(var0, var5, 10, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         if (null != var28) {
            var24.method4179(var1, var3, var4, var21, var14, var15, (classEE)var28, 11 == var7 ? 256 : 0, var25, var27);
         }

         if (-2040437663 * var12.field4946 != 0 && var9 != null) {
            classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)32);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("cp")
   static final int method3338(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = classBI.method1101(var3, var5, -2005151812);
      int var8 = classBI.method1101(1 + var3, var5, -398918976);
      int var9 = classBI.method1101(var3, var5 + 1, -1304123503);
      int var10 = classBI.method1101(1 + var3, var5 + 1, -1352119062);
      int var11 = classIN.method6229(var7, var8, var4, var2, -128297816);
      int var12 = classIN.method6229(var9, var10, var4, var2, -1711515673);
      return classIN.method6229(var11, var12, var6, var2, 753466994);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIILgc;Lee;Lee;)V")
   @ObfuscatedName("cx")
   static final void method3355(
      classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classGC var9, classEE var10, classEE var11
   ) {
      classOM var12 = classMU.method7729(var5, 1563032501);
      int var13 = var8 >= 0 ? var8 : var12.field4951 * -1542230501;
      int var14;
      int var15;
      if (var6 != 1 && 3 != var6) {
         var14 = var12.field4944 * -582306509;
         var15 = var12.field4924 * 402876423;
      } else {
         var14 = var12.field4924 * 402876423;
         var15 = -582306509 * var12.field4944;
      }

      int var16;
      int var17;
      if (var3 + var14 <= var0.field1696 * 1296729483) {
         var16 = var3 + (var14 >> 1);
         var17 = var3 + (1 + var14 >> 1);
      } else {
         var16 = var3;
         var17 = 1 + var3;
      }

      int var18;
      int var19;
      if (var4 + var15 <= var0.field1692 * -1269171107) {
         var18 = var4 + (var15 >> 1);
         var19 = var4 + (1 + var15 >> 1);
      } else {
         var18 = var4;
         var19 = var4 + 1;
      }

      int[][] var20 = var0.field1688[var2];
      int var21 = var20[var17][var18] + var20[var16][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
      int var22 = (var14 << 6) + (var3 << 7);
      int var23 = (var15 << 6) + (var4 << 7);
      classEZ var24 = var0.field1689;
      long var25 = classRF.method9961(var1, var3, var4, 2, 0 == 1663954033 * var12.field4923, var5, 2140889407 * var0.field1699, (short)9399);
      int var27 = (var6 << 6) + var7;
      if (1291058669 * var12.field4956 == 1) {
         var27 += 256;
      }

      if (22 == var7) {
         Object var48;
         if (-1 == var13 && var12.field4930 == null) {
            var48 = var12.method8544(22, var6, var20, var22, var21, var23, -1081054878);
         } else {
            var48 = new classDY(var0, var5, 22, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         classEZ.method4464(var24, var1, var3, var4, var21, (classEE)var48, var25, var27);
         if (1 == var12.field4946 * -2040437663 && null != var9) {
            classGC.method5371(var9, var3, var4, (byte)4);
         }
      } else if (var7 != 10 && var7 != 11) {
         if (var7 >= 12) {
            Object var47;
            if (var13 == -1 && var12.field4930 == null) {
               var47 = var12.method8544(var7, var6, var20, var22, var21, var23, -1242112319);
            } else {
               var47 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var47, 0, var25, var27);
            if (0 != -2040437663 * var12.field4946 && var9 != null) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-19);
            }
         } else if (0 == var7) {
            Object var46;
            if (-1 == var13 && var12.field4930 == null) {
               var46 = var12.method8544(0, var6, var20, var22, var21, var23, -1622809242);
            } else {
               var46 = new classDY(var0, var5, 0, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var46, null, field1505[var6], 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1629575560);
            }
         } else if (var7 == 1) {
            Object var45;
            if (-1 == var13 && null == var12.field4930) {
               var45 = var12.method8544(1, var6, var20, var22, var21, var23, 85264349);
            } else {
               var45 = new classDY(var0, var5, 1, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var45, null, field1513[var6], 0, var25, var27);
            if (var12.field4946 * -2040437663 != 0 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, 683267765);
            }
         } else if (2 == var7) {
            int var44 = var6 + 1 & 3;
            Object var30;
            Object var52;
            if (-1 == var13 && null == var12.field4930) {
               var52 = var12.method8544(2, 4 + var6, var20, var22, var21, var23, 402258485);
               var30 = var12.method8544(2, var44, var20, var22, var21, var23, 1067170303);
            } else {
               var52 = new classDY(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var30 = new classDY(var0, var5, 2, var44, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var52, (classEE)var30, field1505[var6], field1505[var44], var25, var27);
            if (-2040437663 * var12.field4946 != 0 && var9 != null) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1716581984);
            }
         } else if (3 == var7) {
            Object var43;
            if (var13 == -1 && var12.field4930 == null) {
               var43 = var12.method8544(3, var6, var20, var22, var21, var23, -1580378392);
            } else {
               var43 = new classDY(var0, var5, 3, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4434(var1, var3, var4, var21, (classEE)var43, null, field1513[var6], 0, var25, var27);
            if (0 != var12.field4946 * -2040437663 && null != var9) {
               var9.method5348(var3, var4, var7, var6, var12.field4947, -1296260417);
            }
         } else if (var7 == 9) {
            Object var42;
            if (var13 == -1 && null == var12.field4930) {
               var42 = var12.method8544(var7, var6, var20, var22, var21, var23, -1592471712);
            } else {
               var42 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4179(var1, var3, var4, var21, 1, 1, (classEE)var42, 0, var25, var27);
            if (-2040437663 * var12.field4946 != 0 && null != var9) {
               classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)22);
            }
         } else if (var7 == classKB.field3520.vmethod8((byte)1)) {
            Object var41;
            if (-1 == var13 && null == var12.field4930) {
               var41 = var12.method8544(var7, var6, var20, var22, var21, var23, 676503243);
            } else {
               var41 = new classDY(var0, var5, var7, var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var41, null, field1505[var6], 0, field1507[var6], field1508[var6], 0, 0, var25, var27);
         } else if (var7 == classKB.field3525.vmethod8((byte)1)) {
            int var39 = 16;
            long var51 = var24.method4455(var1, var3, var4);
            if (var51 != 0L) {
               var39 = classMU.method7729(classCN.method2552(var51), 1249076289).field4927 * -1659674841;
            }

            var39++;
            Object var54;
            if (-1 == var13 && var12.field4930 == null) {
               var54 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6, var20, var22, var21, var23, 414349421);
            } else {
               var54 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(
               var1, var3, var4, var21, (classEE)var54, null, field1505[var6], 0, field1507[var6] * var39, var39 * field1508[var6], 0, 0, var25, var27
            );
         } else if (var7 == classKB.field3522.vmethod8((byte)1)) {
            int var37 = 8;
            long var50 = var24.method4439(var1, var3, var4);
            if (var50 != 0L) {
               var37 = classMU.method7729(classCN.method2552(var50), 1858046671).field4927 * -1659674841 / 2;
            }

            var37++;
            Object var53;
            if (-1 == var13 && var12.field4930 == null) {
               var53 = var12.method8544(classKB.field3520.vmethod8((byte)1), 4 + var6, var20, var22, var21, var23, -772237103);
            } else {
               var53 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var53, null, 256, var6, var37 * field1509[var6], field1510[var6] * var37, 0, 0, var25, var27);
         } else if (var7 == classKB.field3523.vmethod8((byte)1)) {
            int var49 = var6 + 2 & 3;
            Object var36;
            if (var13 == -1 && null == var12.field4930) {
               var36 = var12.method8544(classKB.field3520.vmethod8((byte)1), var49 + 4, var20, var22, var21, var23, -129040216);
            } else {
               var36 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var49 + 4, var2, var3, var4, var13, var12.field4964, var10);
            }

            var24.method4481(var1, var3, var4, var21, (classEE)var36, null, 256, var49, field1509[var49], field1510[var49], 0, 0, var25, var27);
         } else if (var7 == classKB.field3524.vmethod8((byte)1)) {
            int var34 = 8;
            long var29 = var24.method4439(var1, var3, var4);
            if (0L != var29) {
               var34 = classMU.method7729(classCN.method2552(var29), 1560125892).field4927 * -1659674841 / 2;
            }

            var34++;
            int var33 = 2 + var6 & 3;
            Object var31;
            Object var32;
            if (var13 == -1 && null == var12.field4930) {
               var31 = var12.method8544(classKB.field3520.vmethod8((byte)1), var6 + 4, var20, var22, var21, var23, -587385278);
               var32 = var12.method8544(classKB.field3520.vmethod8((byte)1), var33 + 4, var20, var22, var21, var23, -126934708);
            } else {
               var31 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var13, var12.field4964, var10);
               var32 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), 4 + var33, var2, var3, var4, var13, var12.field4964, var11);
            }

            var24.method4481(
               var1,
               var3,
               var4,
               var21,
               (classEE)var31,
               (classEE)var32,
               256,
               var6,
               field1509[var6] * var34,
               var34 * field1510[var6],
               field1509[var33],
               field1510[var33],
               var25,
               var27
            );
         }
      } else {
         Object var28;
         if (var13 == -1 && var12.field4930 == null) {
            var28 = var12.method8544(10, var6, var20, var22, var21, var23, -594484802);
         } else {
            var28 = new classDY(var0, var5, 10, var6, var2, var3, var4, var13, var12.field4964, var10);
         }

         if (null != var28) {
            var24.method4179(var1, var3, var4, var21, var14, var15, (classEE)var28, 11 == var7 ? 256 : 0, var25, var27);
         }

         if (-2040437663 * var12.field4946 != 0 && var9 != null) {
            classGC.method5361(var9, var3, var4, var14, var15, var12.field4947, (byte)-53);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("ct")
   static int method3357(int var0, classBL var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "di.ct(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("dm")
   static final void method3356(boolean var0, byte var1) {
      try {
         classOO.method8626(-2117644424);
         client.field795.field1528 += 118500947;
         if (-148617765 * client.field795.field1528 < 50) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (!var0) {
               if (var1 >= 0) {
                  return;
               }

               return;
            }
         }

         client.field795.field1528 = 0;
         if (!client.field946) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (classDJ.method3383(client.field795, 1083159551) != null) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               classJL var2 = classEF.method3849(classJS.NO_TIMEOUT, client.field795.field1535, (byte)-70);
               client.field795.method3367(var2, -1301097035);

               try {
                  client.field795.method3364(740672100);
               } catch (IOException var4) {
                  client.field946 = true;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "di.dm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lxs;B)V")
   @ObfuscatedName("az")
   static void method3301(classDZ var0, classXS var1, byte var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 < classZH.method14003(var0.field1693, (byte)10)) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            for (int var4 = var3; var4 < classZH.method14003(var0.field1693, (byte)10); var4++) {
               if (var2 >= 0) {
                  client.method2360(var0, var1);
                  return;
               }

               int var5 = var0.field1693.method14001(var4, 2050493789);
               classCU.method2678(var5, -272049782);
               classSP var6 = (classSP)var0.field1700.method13595(var5);
               if (var6 != null) {
                  var6.vmethod398();
               }
            }
         }

         if (var3 > classZH.method14003(var0.field1693, (byte)10)) {
            if (var2 >= 0) {
               client.method2360(var0, var1);
            } else {
               throw new RuntimeException("");
            }
         } else {
            var0.field1693.method14007(2114025881);
            classGY var20 = new classGY();

            for (int var21 = 0; var21 < var3; var21++) {
               if (var2 >= 0) {
                  client.method2360(var0, var1);
                  return;
               }

               int var23 = var0.field1693.method14001(var21, 1804846175);
               classSP var7 = (classSP)var0.field1700.method13595(var23);
               int var8 = classXY.method13039(var1, -346779531);
               if (0 == var8) {
                  if (var2 >= 0) {
                     client.method2360(var0, var1);
                     return;
                  }

                  classCU.method2678(var23, -1564599711);
                  if (null != var7) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     var7.vmethod398();
                  }
               } else {
                  var0.field1693.method13999(var23, (byte)44);
                  if (var8 != 1) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     var20.method5926(var7.method10563(-2007659331), 1356840049);
                     byte var9 = classXY.method13043(var1, (byte)17);
                     if (0 == var9) {
                        if (var2 >= 0) {
                           client.method2360(var0, var1);
                           return;
                        }
                     } else {
                        int var10 = classQK.method9604(var1, var9, 0, (byte)14);
                        int var11 = classQK.method9604(var1, var9, 2, (byte)81);
                        int var12 = classQK.method9604(var1, var9, 4, (byte)20);
                        int var13 = classQK.method9604(var1, var9, 6, (byte)39);
                        var20.method5939(var10, var11, var12, var13, -935292469);
                     }

                     if (var8 == 2) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        classSP.method10609(var7, var0, var20, (byte)0);
                     } else {
                        var7.method10612(var20, (byte)-106);
                     }
                  }

                  int var27 = classXY.method13039(var1, -346779531);
                  if ((var27 & 1) != 0) {
                     int var29 = classXY.method13047(var1, -50701607);
                     int var32 = var1.method13159((byte)-105);
                     classIX.method6333(var7, var29, var32, 662773506);
                  }

                  if (0 != (var27 & 2)) {
                     int var30 = var1.method13159((byte)-95);
                     var7.method10583(var30, -1619453940);
                  }
               }
            }

            while (var1.method12931(1265354011 * client.field795.field1525, 248122358) > 0) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var22 = classXY.method13047(var1, 650093285);
               int var24 = var1.method13165(-879199048);
               int var25 = var1.method13165(-1825275970);
               int var26 = var1.method13159((byte)-15);
               int var28 = var1.method13202((byte)85);
               var0.field1693.method13999(var22, (byte)44);
               int var31 = var25 >> 4 & 15;
               int var33 = var25 & 15;
               int var34 = 8 * var31;
               int var35 = 8 * var33;
               classDZ var14 = client.field814.method1582(var22, var34, var35, classAB.field122.method2817((byte)0), classEX.field1978, -1393038213);
               classSP var16 = new classSP(var22, var14);
               classYN.method13576(var0.field1700, var16, var22);
               var16.field6009 = var22 * -662280981;
               var16.field6020 = var0.field1699 * 774817283;
               classSP.method10567(var16, classIR.method6309(var28, -1265508302), 1336753137);
               classOB.method8291(var1, var16.field6019, 0, 0, -482046160);
               classSP.method10609(var16, var0, var16.field6019, (byte)0);
               classSP.method10577(var16, (classKR)classOF.method8404(classOB.method8292((byte)5), var26, -810085806), -1103982447);
               if ((var24 & 1) != 0) {
                  if (var2 >= 0) {
                     client.method2360(var0, var1);
                     return;
                  }

                  int var17 = classXY.method13047(var1, 278172872);
                  int var18 = var1.method13159((byte)-9);
                  classIX.method6333(var16, var17, var18, 1707128296);
               }

               if (0 != (var24 & 2)) {
                  int var36 = var1.method13159((byte)-97);
                  var16.method10583(var36, -1619453940);
               }
            }

            client.method2360(var0, var1);
         }
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "di.az(" + ')');
      }
   }
}
