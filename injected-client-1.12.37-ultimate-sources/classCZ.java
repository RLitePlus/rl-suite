import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cz")
public class classCZ implements classGZ {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field1361 = 28;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1360 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   static final int field1362 = 69;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   @Override
   public void vmethod295(int var1, int var2) {
      classML.field4531.method2619(var1, var2, 1698595949);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod281(int var1, int var2, int var3, int var4, int var5) {
      try {
         client.field976 = -93444189 * var1;
         client.field1042 = -2134477999 * var2;
         classDL.method3409((byte)4);
         classRL.method10027(var1, var2, var3, var4, true, 317527437);
         int var6 = client.field798 * 2135834767;
         int var7 = 2033487121 * client.field875;
         int var8 = 27064125 * client.field990;
         int var9 = client.field982 * 1158148203;
         classYW.method13671(var6, var7, var6 + var8, var9 + var7);
         classFH.method4740();
         classYW.method13763();
         int var10 = client.field942.method11436((short)-6339);
         if (-719672733 * client.field955 / 256 > var10) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            var10 = -719672733 * client.field955 / 256;
         }

         if (client.field997[4]) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            if (1024 + client.field999[4] > var10) {
               var10 = client.field999[4] + 1024;
            }
         }

         int var11 = client.field994.method11436((short)-5136);
         int var12 = classJY.field3500 * 318828117;
         int var13 = -961764289 * classBK.field489;
         int var14 = classPF.field5237 * 68756747;
         int var16 = var10 >> 3;
         int var15 = var16 * 3 + 600;
         int var18 = var9 - 334;
         if (var18 < 0) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            var18 = 0;
         } else if (var18 > 100) {
            var18 = 100;
         }

         int var19 = (client.field862 - client.field869) * var18 / 100 + client.field869;
         int var17 = var19 * var15 / 256;
         var18 = classKG.method6472(2065148309) - var10 & classCS.method2576(-1520924805);
         int var20 = classNE.method7828(var11, 1429595320);
         int var21 = 0;
         int var22 = 0;
         int var23 = var17;
         if (0 != var18) {
            if (var5 >= 281771763) {
               return;
            }

            int var24 = classBF.method997(var18, (byte)-123);
            int var26 = classLL.method7119(var18, 1222866659);
            int var27 = var26 * var22 - var24 * var17 >> 16;
            var23 = var22 * var24 + var26 * var17 >> 16;
            var22 = var27;
         }

         if (0 != var20) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            int var52 = classBF.method997(var20, (byte)-79);
            int var58 = classLL.method7119(var20, 1222866659);
            int var62 = var52 * var23 + var58 * var21 >> 16;
            var23 = var58 * var23 - var52 * var21 >> 16;
            var21 = var62;
         }

         if (client.field933) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            classUW.field6409 = 1209400545 * (var12 - var21);
            classIU.field3065 = (var13 - var22) * -1577754695;
            classEL.field1784 = -1702691677 * (var14 - var23);
            classCK.field777 = 556467999 * var10;
            classGT.field2685 = 1711790767 * var11;
         } else {
            classKI.field3598 = -1197566029 * (var12 - var21);
            classNL.field4684 = (var13 - var22) * -477405995;
            classAI.field167 = (var14 - var23) * -337711351;
            client.field914.method11434(var10, -2077693119);
            client.field796.method11434(var11, -2018615335);
         }

         if (client.field967 * -496203881 == 1) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            classDZ var25 = client.field814.method1590(client.field846 * -2034209657, (short)-19746);
            classCT var63 = var25.method3737(-2130951373 * client.field845, (byte)1);
            classUZ var53;
            if (null != var63) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               classUZ var28 = classYY.method13790(var25, var63.vmethod368(311606126), var63.vmethod371(-342494893), (byte)110);
               var28.field6425 = var63.vmethod258((byte)-120);
               var53 = var28;
            } else {
               var53 = classHZ.method6135(16777216);
            }

            int var59 = (int)var53.field6427;
            int var64 = (int)var53.field6426;
            if (313368463 * client.field911 >= 2) {
               if (var5 >= 281771763) {
                  return;
               }

               label499:
               if (client.field855 * 1612595797 % 50 == 0) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  if (var59 >> 7 == classJY.field3500 * 318828117 >> 7) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     if (var64 >> 7 == 68756747 * classPF.field5237 >> 7) {
                        break label499;
                     }

                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }
                  }

                  int var67 = (int)var53.field6425;
                  int var29 = -1444178379 * classIS.field3053.field1709 + (318828117 * classJY.field3500 >> 7);
                  int var30 = (classPF.field5237 * 68756747 >> 7) + -351145363 * classIS.field3053.field1708;
                  classJS.method6413(var29, var30, var67, true, -1060314874);
               }
            }

            classUZ.method11727(var53, 1837062573);
         }

         if (!client.field933) {
            if (var5 >= 281771763) {
               throw new IllegalStateException();
            }

            var17 = method2850(927500664);
         } else {
            if (classCY.method2720(classAB.field122, -1315528093)) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               var18 = -483624883 * classIS.field3053.field1710;
            } else {
               var19 = classKI.field3598 * -325062789 >> 7;
               var20 = 1343311673 * classAI.field167 >> 7;
               if (!classIS.field3053.method3729(var19, var20, (byte)1)) {
                  var18 = -483624883 * classIS.field3053.field1710;
               } else {
                  var21 = classKV.method6571(
                     classIS.field3053, classKI.field3598 * -325062789, 1343311673 * classAI.field167, classIS.field3053.field1710 * -483624883, (byte)122
                  );
                  if (var21 - 1615527037 * classNL.field4684 < 800
                     && 0 != (classIS.field3053.field1702[-483624883 * classIS.field3053.field1710][var19][var20] & 4)) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     var18 = classIS.field3053.field1710 * -483624883;
                  } else {
                     var18 = 3;
                  }
               }
            }

            var17 = var18;
         }

         var18 = -325062789 * classKI.field3598;
         var19 = classNL.field4684 * 1615527037;
         var20 = classAI.field167 * 1343311673;
         var21 = client.field914.method11436((short)-20192);
         var22 = client.field796.method11436((short)-23811);

         for (int var50 = 0; var50 < 5; var50++) {
            if (client.field997[var50]) {
               int var54 = (int)(
                  Math.random() * (client.field998[var50] * 2 + 1)
                     - client.field998[var50]
                     + Math.sin(client.field935[var50] * (client.field1000[var50] / 100.0)) * client.field999[var50]
               );
               switch (var50) {
                  case 0:
                     classKI.field3598 += var54 * -1197566029;
                     break;
                  case 1:
                     classNL.field4684 += var54 * -477405995;
                     break;
                  case 2:
                     classAI.field167 += -337711351 * var54;
                     break;
                  case 3:
                     classUP.method11457(client.field796, var54, -1985221643);
                     break;
                  case 4:
                     classUP.method11457(client.field914, var54, -1985221643);
                     client.field914.method11434(classKC.method6458(client.field914.method11436((short)-7707), -181998943), -2028217729);
               }
            }
         }

         label473: {
            var23 = classTZ.field6255 * -38255113;
            int var55 = -2144333897 * classTZ.field6264;
            if (var23 >= var6) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               if (var23 < var6 + var8) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  if (var55 >= var7) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     if (var55 < var9 + var7) {
                        if (var5 >= 281771763) {
                           throw new IllegalStateException();
                        }

                        classKS.method6559(var23 - var6, var55 - var7, (byte)0);
                        Iterator var56 = client.field814.iterator();

                        while (true) {
                           if (!var56.hasNext()) {
                              break label473;
                           }

                           if (var5 >= 281771763) {
                              throw new IllegalStateException();
                           }

                           classDZ var60 = (classDZ)var56.next();
                           var60.field1689.method4326(-483624883 * var60.field1710, var23 - var6, var55 - var7);
                        }
                     }
                  }
               }
            }

            classNT.method8007(-1700525754);
         }

         classOO.method8626(-2097946051);
         client.method1752(var6, var7, var8, var9, 0);
         classOO.method8626(-1674431286);
         int var57 = classFH.method4727();
         classFH.method4684(classOE.field4843.field6203);
         classFH.field2257.field2209 = client.field878 * 1129651895;
         classEX var10000;
         if (client.field846 * -2034209657 == 0) {
            if (var5 >= 281771763) {
               return;
            }

            var10000 = classEX.field1977;
         } else {
            var10000 = classEX.field1978;
         }

         classEX var61 = var10000;
         classIS.field3053.field1689.method4254(var61);
         classIS.field3053
            .field1689
            .method4398(
               -325062789 * classKI.field3598,
               classNL.field4684 * 1615527037,
               1343311673 * classAI.field167,
               client.field914,
               client.field796,
               var17,
               client.field962 * 2106329293,
               client.field986 * -2126074583,
               client.field933
            );

         boolean var65;
         do {
            var65 = true;

            for (int var68 = 0; var68 < 613116963 * classFO.field2350; var68++) {
               if (classFO.field2347[var68] < classFO.field2347[1 + var68]) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  long var71 = classFO.field2351[var68];
                  classFO.field2351[var68] = classFO.field2351[1 + var68];
                  classFO.field2351[1 + var68] = var71;
                  int var31 = classFO.field2347[var68];
                  classFO.field2347[var68] = classFO.field2347[1 + var68];
                  classFO.field2347[var68 + 1] = var31;
                  var65 = false;
               }
            }
         } while (!var65);

         if (var5 < 281771763) {
            for (int var69 = 0; var69 < 613116963 * classFO.field2350; var69++) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               for (int var72 = 1 + var69; var72 <= classFO.field2350 * 613116963; var72++) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  if (classFO.field2351[var72] == classFO.field2351[var69]) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     classFO.field2351[var69] = -1L;
                     break;
                  }
               }
            }

            classFH.method4684(false);
            if (client.field899) {
               classYW.method13761();
            }

            classFH.field2257.field2209 = var57;
            classOO.method8626(-1788778187);
            classCX.method2699(classIS.field3053, var6, var7, var8, var9, client.field855 * 1612595797, 2098554167);
            classKQ var66 = client.field941;
            classCL var70 = client.field814;
            int var73 = 1612595797 * client.field855;
            if (var66.method6529(2000036973) != 2) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }
            } else {
               classDZ var74 = var70.method1596(var66.method6535(680910494), var66.method6537(-1984556575), -2076017788);
               int var76 = (var66.method6535(-1967638492) - var74.field1709 * -1444178379 << 7) + classKQ.method6540(var66, (byte)30);
               int var32 = (var66.method6537(-1588110313) - -351145363 * var74.field1708 << 7) + var66.method6544((byte)118);
               int var33 = var66.method6545((short)5205) * 2;
               classLL.method7120(var74, var76, var32, var33, 0, -358189704);
               if (1269689307 * classCE.field690 > -1) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  if (var73 % 20 < 10) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     classYM.method13511(classCE.field714[0], var6 + classCE.field690 * 1269689307 - 12, classCE.field700 * -690353985 + var7 - 28);
                  }
               }
            }

            classKQ var75 = client.field941;
            classDZ var77 = classIS.field3053;
            int var78 = 1612595797 * client.field855;
            if (var75.method6529(-1593257328) != 4) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }
            } else {
               classSP var79 = (classSP)var77.field1700.method13595(var75.method6533(-906431094));
               if (null != var79) {
                  int var34 = 1386308288 * var79.field6012.field1696;
                  int var35 = 377427776 * var79.field6012.field1692;
                  classLL.method7120(var79.field6012, var34, var35, var75.method6545((short)5205) * 2, 0, -422704665);
                  if (1269689307 * classCE.field690 > -1) {
                     if (var5 >= 281771763) {
                        return;
                     }

                     if (var78 % 20 < 10) {
                        classYM.method13511(classCE.field714[0], var6 + 1269689307 * classCE.field690 - 12, classCE.field700 * -690353985 + var7 - 28);
                     }
                  }
               }
            }

            classEC.method3819((classEC)classFH.field2257.field2239, client.field949 * -322689719, -1467379791);
            client.field836 = 0;
            classCT var80 = classMB.method7521(2007530252);
            if (null != var80) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               int var81 = -1444178379 * classIS.field3053.field1709 + (-1547553299 * var80.field1487 >> 7);
               int var82 = -351145363 * classIS.field3053.field1708 + (var80.field1489 * -1272026483 >> 7);
               if (var81 >= 3053) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  if (var81 <= 3156 && var82 >= 3056 && var82 <= 3136) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     client.field836 = 1640767051;
                  }
               }

               if (var81 >= 3072) {
                  if (var5 >= 281771763) {
                     return;
                  }

                  if (var81 <= 3118 && var82 >= 9492) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     if (var82 <= 9535) {
                        if (var5 >= 281771763) {
                           return;
                        }

                        client.field836 = 1640767051;
                     }
                  }
               }

               if (1 == 1746877283 * client.field836) {
                  if (var5 >= 281771763) {
                     return;
                  }

                  if (var81 >= 3139) {
                     if (var5 >= 281771763) {
                        throw new IllegalStateException();
                     }

                     if (var81 <= 3199) {
                        if (var5 >= 281771763) {
                           throw new IllegalStateException();
                        }

                        if (var82 >= 3008) {
                           if (var5 >= 281771763) {
                              return;
                           }

                           if (var82 <= 3062) {
                              if (var5 >= 281771763) {
                                 return;
                              }

                              client.field836 = 0;
                           }
                        }
                     }
                  }
               }
            }

            classKI.field3598 = -1197566029 * var18;
            classNL.field4684 = var19 * -477405995;
            classAI.field167 = -337711351 * var20;
            client.field914.method11434(var21, -1585704395);
            client.field796.method11434(var22, -1458111414);
            if (client.field891) {
               if (var5 >= 281771763) {
                  throw new IllegalStateException();
               }

               if (classVB.method11913(classEB.field1726, true, false, -1482347994) == 0) {
                  if (var5 >= 281771763) {
                     throw new IllegalStateException();
                  }

                  client.field891 = false;
               }
            }

            if (client.field891) {
               client.method1752(var6, var7, var8, var9, 0);
               classLU.method7150(classKK.field3618, false, -1241987884);
            }

            classIS.field3053.field1689.method4479();

            for (int var37 = 0; var37 < classZH.method14003(classIS.field3053.field1693, (byte)10); var37++) {
               classSP var38 = (classSP)classIS.field3053.field1700.method13595(classIS.field3053.field1693.method14001(var37, 1665789766));
               if (var38 != null) {
                  var38.field6012.field1689.method4479();
               }
            }
         }
      } catch (RuntimeException var36) {
         throw classEG.method3884(var36, "cz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIS)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod298(classLW var1, int var2, int var3, short var4) {
      client.method2362(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod285(int var1, int var2, int var3, int var4, int var5, double var6) {
      try {
         classIO.method6230((byte)2).method12446(var1, var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "cz.ae(" + ')');
      }
   }

   classCZ() {
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod296(int var1, int var2, int var3) {
      try {
         classML.field4531.method2619(var1, var2, 1698595949);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("as")
   @Override
   public void vmethod282(int var1, int var2, int var3, int var4) {
      client.field976 = -93444189 * var1;
      client.field1042 = -180613360 * var2;
      classDL.method3409((byte)4);
      classRL.method10027(var1, var2, var3, var4, true, 317527437);
      int var5 = client.field798 * 2135834767;
      int var6 = 2033487121 * client.field875;
      int var7 = 27064125 * client.field990;
      int var8 = client.field982 * 1158148203;
      classYW.method13671(var5, var6, var5 + var7, var8 + var6);
      classFH.method4740();
      classYW.method13763();
      int var9 = client.field942.method11436((short)-17867);
      if (-245068755 * client.field955 / 256 > var9) {
         var9 = 296157394 * client.field955 / -386078317;
      }

      if (client.field997[4] && 1822516934 + client.field999[4] > var9) {
         var9 = client.field999[4] + 1024;
      }

      int var10 = client.field994.method11436((short)-1496);
      int var11 = classJY.field3500 * 1902689368;
      int var12 = 274104349 * classBK.field489;
      int var13 = classPF.field5237 * 121774856;
      int var15 = var9 >> 3;
      int var14 = var15 * 3 + 214319766;
      int var17 = var8 - 334;
      if (var17 < 0) {
         var17 = 0;
      } else if (var17 > 100) {
         var17 = 100;
      }

      int var18 = (client.field862 - client.field869) * var17 / 100 + client.field869;
      int var16 = var18 * var14 / 86551881;
      var17 = classKG.method6472(-1616630143) - var9 & classCS.method2576(-1520924805);
      int var19 = classNE.method7828(var10, -131279178);
      int var20 = 0;
      int var21 = 0;
      int var22 = var16;
      if (0 != var17) {
         int var23 = classBF.method997(var17, (byte)-23);
         int var25 = classLL.method7119(var17, 1222866659);
         int var26 = var25 * var21 - var23 * var16 >> 16;
         var22 = var21 * var23 + var25 * var16 >> 16;
         var21 = var26;
      }

      if (0 != var19) {
         int var50 = classBF.method997(var19, (byte)-61);
         int var56 = classLL.method7119(var19, 1222866659);
         int var60 = var50 * var22 + var56 * var20 >> 16;
         var22 = var56 * var22 - var50 * var20 >> 16;
         var20 = var60;
      }

      if (client.field933) {
         classUW.field6409 = -603566277 * (var11 - var20);
         classIU.field3065 = (var12 - var21) * 2088139105;
         classEL.field1784 = -1702691677 * (var13 - var22);
         classCK.field777 = 556467999 * var9;
         classGT.field2685 = 300142332 * var10;
      } else {
         classKI.field3598 = -1197566029 * (var11 - var20);
         classNL.field4684 = (var12 - var21) * -477405995;
         classAI.field167 = (var13 - var22) * -1569776488;
         client.field914.method11434(var9, -1315738700);
         client.field796.method11434(var10, -1955759844);
      }

      if (client.field967 * -1459893314 == 1) {
         classDZ var24 = client.field814.method1590(client.field846 * -2034209657, (short)5850);
         classCT var61 = var24.method3737(-387898057 * client.field845, (byte)1);
         classUZ var51;
         if (null != var61) {
            classUZ var27 = classYY.method13790(var24, var61.vmethod368(311606126), var61.vmethod371(-86156870), (byte)106);
            var27.field6425 = var61.vmethod258((byte)-16);
            var51 = var27;
         } else {
            var51 = classHZ.method6135(16777216);
         }

         int var57 = (int)var51.field6427;
         int var62 = (int)var51.field6426;
         if (785215438 * client.field911 >= 2
            && client.field855 * 1612595797 % 50 == 0
            && (var57 >> 7 != classJY.field3500 * 928279075 >> 7 || var62 >> 7 != -718595217 * classPF.field5237 >> 7)) {
            int var65 = (int)var51.field6425;
            int var28 = -1672861349 * classIS.field3053.field1709 + (-297586307 * classJY.field3500 >> 7);
            int var29 = (classPF.field5237 * 1756330672 >> 7) + -706832575 * classIS.field3053.field1708;
            classJS.method6413(var28, var29, var65, true, -814068082);
         }

         classUZ.method11727(var51, 1698760688);
      }

      if (!client.field933) {
         var16 = method2850(927500664);
      } else {
         if (classCY.method2720(classAB.field122, -1315528093)) {
            var17 = -483624883 * classIS.field3053.field1710;
         } else {
            var18 = classKI.field3598 * -325062789 >> 7;
            var19 = 1343311673 * classAI.field167 >> 7;
            if (!classIS.field3053.method3729(var18, var19, (byte)1)) {
               var17 = -483624883 * classIS.field3053.field1710;
            } else {
               var20 = classKV.method6571(
                  classIS.field3053, classKI.field3598 * -325062789, 1343311673 * classAI.field167, classIS.field3053.field1710 * -483624883, (byte)122
               );
               if (var20 - -1436107192 * classNL.field4684 < 800
                  && 0 != (classIS.field3053.field1702[848265165 * classIS.field3053.field1710][var18][var19] & 4)) {
                  var17 = classIS.field3053.field1710 * 1184477042;
               } else {
                  var17 = 3;
               }
            }
         }

         var16 = var17;
      }

      var17 = -2064460437 * classKI.field3598;
      var18 = classNL.field4684 * 1837599291;
      var19 = classAI.field167 * 1343311673;
      var20 = client.field914.method11436((short)-22755);
      var21 = client.field796.method11436((short)-14465);

      for (int var48 = 0; var48 < 5; var48++) {
         if (client.field997[var48]) {
            int var52 = (int)(
               Math.random() * (client.field998[var48] * 2 + 1)
                  - client.field998[var48]
                  + Math.sin(client.field935[var48] * (client.field1000[var48] / 100.0)) * client.field999[var48]
            );
            switch (var48) {
               case 0:
                  classKI.field3598 += var52 * 1832961594;
                  break;
               case 1:
                  classNL.field4684 += var52 * -477405995;
                  break;
               case 2:
                  classAI.field167 += 1351787795 * var52;
                  break;
               case 3:
                  classUP.method11457(client.field796, var52, -1985221643);
                  break;
               case 4:
                  classUP.method11457(client.field914, var52, -1985221643);
                  client.field914.method11434(classKC.method6458(client.field914.method11436((short)-14496), -181998943), -1473272970);
            }
         }
      }

      var22 = classTZ.field6255 * -38255113;
      int var53 = -2144333897 * classTZ.field6264;
      if (var22 >= var5 && var22 < var5 + var7 && var53 >= var6 && var53 < var8 + var6) {
         classKS.method6559(var22 - var5, var53 - var6, (byte)0);

         for (classDZ var58 : client.field814) {
            var58.field1689.method4326(-2142973985 * var58.field1710, var22 - var5, var53 - var6);
         }
      } else {
         classNT.method8007(-1218830917);
      }

      classOO.method8626(-1839443984);
      client.method1752(var5, var6, var7, var8, 0);
      classOO.method8626(-1943736369);
      int var55 = classFH.method4727();
      classFH.method4684(classOE.field4843.field6203);
      classFH.field2257.field2209 = client.field878 * 1129651895;
      classEX var59 = client.field846 * -1371695474 == 0 ? classEX.field1977 : classEX.field1978;
      classIS.field3053.field1689.method4254(var59);
      classIS.field3053
         .field1689
         .method4398(
            -325062789 * classKI.field3598,
            classNL.field4684 * 1615527037,
            533208081 * classAI.field167,
            client.field914,
            client.field796,
            var16,
            client.field962 * -2116960421,
            client.field986 * -2126074583,
            client.field933
         );

      boolean var63;
      do {
         var63 = true;

         for (int var66 = 0; var66 < 613116963 * classFO.field2350; var66++) {
            if (classFO.field2347[var66] < classFO.field2347[1 + var66]) {
               long var69 = classFO.field2351[var66];
               classFO.field2351[var66] = classFO.field2351[1 + var66];
               classFO.field2351[1 + var66] = var69;
               int var30 = classFO.field2347[var66];
               classFO.field2347[var66] = classFO.field2347[1 + var66];
               classFO.field2347[var66 + 1] = var30;
               var63 = false;
            }
         }
      } while (!var63);

      for (int var67 = 0; var67 < 613116963 * classFO.field2350; var67++) {
         for (int var70 = 1 + var67; var70 <= classFO.field2350 * 613116963; var70++) {
            if (classFO.field2351[var70] == classFO.field2351[var67]) {
               classFO.field2351[var67] = -1L;
               break;
            }
         }
      }

      classFH.method4684(false);
      if (client.field899) {
         classYW.method13761();
      }

      classFH.field2257.field2209 = var55;
      classOO.method8626(-1832705297);
      classCX.method2699(classIS.field3053, var5, var6, var7, var8, client.field855 * 1612595797, 2081122300);
      classKQ var64 = client.field941;
      classCL var68 = client.field814;
      int var71 = 1612595797 * client.field855;
      if (var64.method6529(-1098020493) == 2) {
         classDZ var72 = var68.method1596(var64.method6535(1223715463), var64.method6537(-2032374799), -1121689311);
         int var74 = (var64.method6535(-825415143) - var72.field1709 * -1444178379 << 7) + classKQ.method6540(var64, (byte)30);
         int var31 = (var64.method6537(-1253422199) - -351145363 * var72.field1708 << 7) + var64.method6544((byte)45);
         int var32 = var64.method6545((short)5205) * 2;
         classLL.method7120(var72, var74, var31, var32, 0, 1238874714);
         if (-1160319369 * classCE.field690 > -1 && var71 % 20 < 10) {
            classYM.method13511(classCE.field714[0], var5 + classCE.field690 * 1269689307 - 12, classCE.field700 * -690353985 + var6 - 28);
         }
      }

      classKQ var73 = client.field941;
      classDZ var75 = classIS.field3053;
      int var76 = 1612595797 * client.field855;
      if (var73.method6529(595526630) == 4) {
         classSP var77 = (classSP)var75.field1700.method13595(var73.method6533(-452384430));
         if (null != var77) {
            int var33 = 1386308288 * var77.field6012.field1696;
            int var34 = -1487597769 * var77.field6012.field1692;
            classLL.method7120(var77.field6012, var33, var34, var73.method6545((short)5205) * 2, 0, 1067863);
            if (-1239732645 * classCE.field690 > -1 && var76 % 20 < 10) {
               classYM.method13511(classCE.field714[0], var5 + -247557412 * classCE.field690 - 12, classCE.field700 * -1113904354 + var6 - 28);
            }
         }
      }

      classEC.method3819((classEC)classFH.field2257.field2239, client.field949 * -322689719, -1467379791);
      client.field836 = 0;
      classCT var78 = classMB.method7521(1978276076);
      if (null != var78) {
         int var79 = 853929199 * classIS.field3053.field1709 + (-1729792355 * var78.field1487 >> 7);
         int var80 = -351145363 * classIS.field3053.field1708 + (var78.field1489 * 800970545 >> 7);
         if (var79 >= 1607398442 && var79 <= 70582970 && var80 >= 3056 && var80 <= 3136) {
            client.field836 = 897817962;
         }

         if (var79 >= -948043602 && var79 <= 3118 && var80 >= 1105849317 && var80 <= 636684063) {
            client.field836 = 1640767051;
         }

         if (1 == 1746877283 * client.field836 && var79 >= 3139 && var79 <= 3199 && var80 >= 1416549812 && var80 <= -503364477) {
            client.field836 = 0;
         }
      }

      classKI.field3598 = 788218604 * var17;
      classNL.field4684 = var18 * 932404558;
      classAI.field167 = 386602660 * var19;
      client.field914.method11434(var20, -1844316585);
      client.field796.method11434(var21, -1550823508);
      if (client.field891 && classVB.method11913(classEB.field1726, true, false, -25208370) == 0) {
         client.field891 = false;
      }

      if (client.field891) {
         client.method1752(var5, var6, var7, var8, 0);
         classLU.method7150(classKK.field3618, false, -48174666);
      }

      classIS.field3053.field1689.method4479();

      for (int var35 = 0; var35 < classZH.method14003(classIS.field3053.field1693, (byte)10); var35++) {
         classSP var36 = (classSP)classIS.field3053.field1700.method13595(classIS.field3053.field1693.method14001(var35, 1728630060));
         if (var36 != null) {
            var36.field6012.field1689.method4479();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod291(int var1, int var2, int var3, int var4, int var5) {
      try {
         classWM.method12461(classIO.method6230((byte)-13), var1, var2, var3, var4, 1466331901);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cz.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod284(classLW var1, int var2, int var3) {
      classOO.method8626(-1837064700);
      classKH var4 = var1.method7204(classWK.field6691, false, -618236678);
      if (var4 != null) {
         classYW.method13671(var2, var3, var2 + -1246906611 * var4.field3586, var3 + -1637380195 * var4.field3585);
         if (classBA.field305 * -782895767 != 2 && -782895767 * classBA.field305 != 5) {
            int var5 = client.field962 * 2106329293 / 32 + 48;
            int var6 = 464 - client.field986 * -2126074583 / 32;
            classYM.method13544(
               classRD.field5645,
               var2,
               var3,
               -1246906611 * var4.field3586,
               -1637380195 * var4.field3585,
               var5,
               var6,
               client.field994.method11436((short)-2210),
               256,
               var2,
               var3,
               var4.field3587,
               var4.field3584
            );
            classUP var7 = client.field994;

            for (int var8 = 0; var8 < 1296562401 * classBA.field306; var8++) {
               int var9 = 2 + 4 * classBA.field308[var8] - 2106329293 * client.field962 / 32;
               int var10 = 4 * classBA.field312[var8] + 2 - client.field986 * -2126074583 / 32;
               classBO.method1165(var2, var3, var9, var10, var7, classBA.field310[var8], var4, (byte)4);
            }

            classOT.method8731(classIS.field3053, var2, var3, client.field994, var4, -1506256026);
            classUM.method11408(classIS.field3053, var2, var3, client.field994, var4, 1091781341);
            classDZ var33 = classIS.field3053;
            classUP var34 = client.field994;

            for (int var35 = 0; var35 < classZH.method14003(var33.field1693, (byte)10); var35++) {
               classSP var11 = (classSP)var33.field1700.method13595(var33.field1693.method14001(var35, 2033299512));
               if (var11 != null) {
                  int var12 = var11.vmethod368(311606126) / 32 - client.field962 * 2106329293 / 32;
                  int var13 = var11.vmethod371(318768421) / 32 - client.field986 * -2126074583 / 32;
                  classYM var14 = var11.field6026.method8492(-372328533);
                  byte var15 = 1;
                  if (!var11.method10558(1796779449)) {
                     int var16 = classCS.method2576(-1520924805) - classEG.method3882(var11.method10561(-794620466), (byte)-95);
                     short var17 = 8192;
                     int var18 = var16 + var17;
                     if (var14 != null) {
                        int var20 = var13 * var13 + var12 * var12;
                        if (var20 <= 12100) {
                           int var21 = var34.method11443(747119668);
                           int var22 = classUP.method11445(var34, (byte)38);
                           int var23 = var21 * var13 + var12 * var22 >> 16;
                           int var24 = var13 * var22 - var12 * var21 >> 16;
                           int var19 = var34.method11436((short)-19042) - var18 & classCS.method2576(-1520924805);
                           int var25 = -1246906611 * var4.field3586 / 2 + var2 + var23;
                           int var26 = var3 + -1637380195 * var4.field3585 / 2 - var24;
                           int var27 = var15 * var14.field7006;
                           int var28 = var14.field7008 * var15;
                           int var29 = var25 - var27 / 2;
                           int var30 = var26 - var28 / 2;
                           int var31 = var14.field7007 / 2;
                           int var32 = var14.field7009 / 2;
                           classYM.method13544(var14, var29, var30, var27, var28, var31, var32, var19, var15 * 256, var2, var3, var4.field3587, var4.field3584);
                        }
                     }

                     classOT.method8731(var11.field6012, var2, var3, var34, var4, -1475632712);
                     classUM.method11408(var11.field6012, var2, var3, var34, var4, 370413208);
                     classGD.method5399(var11.field6012, var2, var3, var34, var4, 1115597881);
                  }
               }
            }

            classGD.method5399(classIS.field3053, var2, var3, client.field994, var4, 1115597881);
            if (classKQ.method6527(client.field941, (byte)94) && client.field855 * 1612595797 % 20 < 10) {
               int var36 = client.field941.method6529(-1041204045);
               classAF.method339(classIS.field3053, var2, var3, client.field994, var4, var36, -2075346477);
            }

            if (1698720137 * client.field859 != 0) {
               int var37 = client.field859 * -1795054044 + 2 - 2106329293 * client.field962 / 32;
               int var40 = -890599604 * client.field834 + 2 - -2126074583 * client.field986 / 32;
               classBO.method1165(var2, var3, var37, var40, client.field994, classCQ.field1221[0], var4, (byte)14);
            }

            if (client.field814.method1620(0, 206128317) == classTN.field6173 && classCQ.field1221.length >= 4) {
               int var38 = var2 + -1246906611 * var4.field3586 / 2;
               int var41 = var3 + var4.field3585 * -1637380195 / 2;
               if (classKH.method6479(var4, -38255113 * classTZ.field6255 - var2, -2144333897 * classTZ.field6264 - var3, 2061631842)) {
                  int var42 = -1246906611 * var4.field3586 / 2 + var2;
                  int var43 = var3 + var4.field3585 * -1637380195 / 2;
                  int var44 = classTZ.field6255 * -38255113 - var42;
                  int var45 = classTZ.field6264 * -2144333897 - var43;
                  int var46 = (int)Math.round(Math.atan2(var45, var44) * 325.94932345220167) - 512 & 2047;
                  int var47 = var46 - client.field994.method11454(100147130);
                  var47 &= 2047;
                  int var50 = var47 + 64;
                  int var49 = (var50 & 2047) / 128;
                  classEF.method3867(var38, var41, var49, classCQ.field1221[2], (byte)-79);
               }

               if (1272389989 * client.field838 > 0) {
                  classEF.method3867(var38, var41, 1200011005 * client.field988, classCQ.field1221[3], (byte)-66);
               }
            }

            classCT var39 = classMB.method7521(-1616151352);
            if (var39 != null && !var39.field1259) {
               classYW.method13698(
                  classBA.field309 * 491453815 + -1246906611 * var4.field3586 / 2 + var2 - 1,
                  var3 + var4.field3585 * -1637380195 / 2 - classBA.field307 * -818064757 - 1,
                  3,
                  3,
                  16777215
               );
            }
         } else {
            classYW.method13752(var2, var3, 0, var4.field3587, var4.field3584);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod286(int var1, int var2, int var3, int var4, int var5, double var6) {
      classIO.method6230((byte)-110).method12446(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ao")
   @Override
   public void vmethod287(int var1, int var2, int var3, int var4, int var5, double var6) {
      classIO.method6230((byte)-127).method12446(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod288(int var1, int var2, int var3, int var4, int var5, double var6) {
      classIO.method6230((byte)-46).method12446(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("aj")
   @Override
   public void vmethod289(int var1, int var2, int var3, int var4, int var5, double var6) {
      classIO.method6230((byte)-50).method12446(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ay")
   @Override
   public void vmethod290(int var1, int var2, int var3, int var4, int var5, double var6) {
      classIO.method6230((byte)-44).method12446(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aq")
   @Override
   public void vmethod292(int var1, int var2, int var3, int var4) {
      classWM.method12461(classIO.method6230((byte)-99), var1, var2, var3, var4, 632010480);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ax")
   @Override
   public void vmethod283(int var1, int var2, int var3, int var4) {
      client.field976 = 115636128 * var1;
      client.field1042 = 1693065144 * var2;
      classDL.method3409((byte)4);
      classRL.method10027(var1, var2, var3, var4, true, 317527437);
      int var5 = client.field798 * 2135834767;
      int var6 = -971888065 * client.field875;
      int var7 = 1702378240 * client.field990;
      int var8 = client.field982 * 1028922794;
      classYW.method13671(var5, var6, var5 + var7, var8 + var6);
      classFH.method4740();
      classYW.method13763();
      int var9 = client.field942.method11436((short)-9244);
      if (-575127828 * client.field955 / 256 > var9) {
         var9 = -719672733 * client.field955 / 256;
      }

      if (client.field997[4] && 1024 + client.field999[4] > var9) {
         var9 = client.field999[4] + 1024;
      }

      int var10 = client.field994.method11436((short)-7401);
      int var11 = classJY.field3500 * -523817415;
      int var12 = -961764289 * classBK.field489;
      int var13 = classPF.field5237 * 68756747;
      int var15 = var9 >> 3;
      int var14 = var15 * 3 + 600;
      int var17 = var8 - 334;
      if (var17 < 0) {
         var17 = 0;
      } else if (var17 > 995319399) {
         var17 = 1496518228;
      }

      int var18 = (client.field862 - client.field869) * var17 / 2146196464 + client.field869;
      int var16 = var18 * var14 / -809305123;
      var17 = classKG.method6472(-862592877) - var9 & classCS.method2576(-1520924805);
      int var19 = classNE.method7828(var10, 1359378127);
      int var20 = 0;
      int var21 = 0;
      int var22 = var16;
      if (0 != var17) {
         int var23 = classBF.method997(var17, (byte)-65);
         int var25 = classLL.method7119(var17, 1222866659);
         int var26 = var25 * var21 - var23 * var16 >> 16;
         var22 = var21 * var23 + var25 * var16 >> 16;
         var21 = var26;
      }

      if (0 != var19) {
         int var50 = classBF.method997(var19, (byte)-50);
         int var56 = classLL.method7119(var19, 1222866659);
         int var60 = var50 * var22 + var56 * var20 >> 16;
         var22 = var56 * var22 - var50 * var20 >> 16;
         var20 = var60;
      }

      if (client.field933) {
         classUW.field6409 = -329949875 * (var11 - var20);
         classIU.field3065 = (var12 - var21) * -648112179;
         classEL.field1784 = 1293339202 * (var13 - var22);
         classCK.field777 = 556467999 * var9;
         classGT.field2685 = 1711790767 * var10;
      } else {
         classKI.field3598 = -1197566029 * (var11 - var20);
         classNL.field4684 = (var12 - var21) * -859396279;
         classAI.field167 = (var13 - var22) * -1383897961;
         client.field914.method11434(var9, -1844060050);
         client.field796.method11434(var10, -1585538999);
      }

      if (client.field967 * 1789610552 == 1) {
         classDZ var24 = client.field814.method1590(client.field846 * 1932249845, (short)-776);
         classCT var61 = var24.method3737(-166899870 * client.field845, (byte)1);
         classUZ var51;
         if (null != var61) {
            classUZ var27 = classYY.method13790(var24, var61.vmethod368(311606126), var61.vmethod371(-1977154941), (byte)104);
            var27.field6425 = var61.vmethod258((byte)-55);
            var51 = var27;
         } else {
            var51 = classHZ.method6135(16777216);
         }

         int var57 = (int)var51.field6427;
         int var62 = (int)var51.field6426;
         if (313368463 * client.field911 >= 2
            && client.field855 * 835386320 % 50 == 0
            && (var57 >> 7 != classJY.field3500 * 318828117 >> 7 || var62 >> 7 != 68756747 * classPF.field5237 >> 7)) {
            int var65 = (int)var51.field6425;
            int var28 = -1458731450 * classIS.field3053.field1709 + (318828117 * classJY.field3500 >> 7);
            int var29 = (classPF.field5237 * 68756747 >> 7) + -351145363 * classIS.field3053.field1708;
            classJS.method6413(var28, var29, var65, true, 1343603856);
         }

         classUZ.method11727(var51, 2055046908);
      }

      if (!client.field933) {
         var16 = method2850(927500664);
      } else {
         if (classCY.method2720(classAB.field122, -1315528093)) {
            var17 = -483624883 * classIS.field3053.field1710;
         } else {
            var18 = classKI.field3598 * -1352391770 >> 7;
            var19 = 1343311673 * classAI.field167 >> 7;
            if (!classIS.field3053.method3729(var18, var19, (byte)1)) {
               var17 = -1977531710 * classIS.field3053.field1710;
            } else {
               var20 = classKV.method6571(
                  classIS.field3053, classKI.field3598 * -743848121, 282156907 * classAI.field167, classIS.field3053.field1710 * -483624883, (byte)122
               );
               if (var20 - 1615527037 * classNL.field4684 < 1844172450
                  && 0 != (classIS.field3053.field1702[-483624883 * classIS.field3053.field1710][var18][var19] & 4)) {
                  var17 = classIS.field3053.field1710 * -483624883;
               } else {
                  var17 = 3;
               }
            }
         }

         var16 = var17;
      }

      var17 = -1432296581 * classKI.field3598;
      var18 = classNL.field4684 * 1615527037;
      var19 = classAI.field167 * -743160805;
      var20 = client.field914.method11436((short)-5546);
      var21 = client.field796.method11436((short)-4271);

      for (int var48 = 0; var48 < 5; var48++) {
         if (client.field997[var48]) {
            int var52 = (int)(
               Math.random() * (client.field998[var48] * 2 + 1)
                  - client.field998[var48]
                  + Math.sin(client.field935[var48] * (client.field1000[var48] / 100.0)) * client.field999[var48]
            );
            switch (var48) {
               case 0:
                  classKI.field3598 += var52 * -611427612;
                  break;
               case 1:
                  classNL.field4684 += var52 * -477405995;
                  break;
               case 2:
                  classAI.field167 += 559355317 * var52;
                  break;
               case 3:
                  classUP.method11457(client.field796, var52, -1985221643);
                  break;
               case 4:
                  classUP.method11457(client.field914, var52, -1985221643);
                  client.field914.method11434(classKC.method6458(client.field914.method11436((short)-28271), -181998943), -1880969538);
            }
         }
      }

      var22 = classTZ.field6255 * -909024992;
      int var53 = 1003715490 * classTZ.field6264;
      if (var22 >= var5 && var22 < var5 + var7 && var53 >= var6 && var53 < var8 + var6) {
         classKS.method6559(var22 - var5, var53 - var6, (byte)0);

         for (classDZ var58 : client.field814) {
            var58.field1689.method4326(-483624883 * var58.field1710, var22 - var5, var53 - var6);
         }
      } else {
         classNT.method8007(-1445137336);
      }

      classOO.method8626(-1816189289);
      client.method1752(var5, var6, var7, var8, 0);
      classOO.method8626(-1949137670);
      int var55 = classFH.method4727();
      classFH.method4684(classOE.field4843.field6203);
      classFH.field2257.field2209 = client.field878 * 1698015531;
      classEX var59 = client.field846 * 211154541 == 0 ? classEX.field1977 : classEX.field1978;
      classIS.field3053.field1689.method4254(var59);
      classIS.field3053
         .field1689
         .method4398(
            -325062789 * classKI.field3598,
            classNL.field4684 * -1065017877,
            1343311673 * classAI.field167,
            client.field914,
            client.field796,
            var16,
            client.field962 * 2106329293,
            client.field986 * -2126074583,
            client.field933
         );

      boolean var63;
      do {
         var63 = true;

         for (int var66 = 0; var66 < 613116963 * classFO.field2350; var66++) {
            if (classFO.field2347[var66] < classFO.field2347[1 + var66]) {
               long var69 = classFO.field2351[var66];
               classFO.field2351[var66] = classFO.field2351[1 + var66];
               classFO.field2351[1 + var66] = var69;
               int var30 = classFO.field2347[var66];
               classFO.field2347[var66] = classFO.field2347[1 + var66];
               classFO.field2347[var66 + 1] = var30;
               var63 = false;
            }
         }
      } while (!var63);

      for (int var67 = 0; var67 < 613116963 * classFO.field2350; var67++) {
         for (int var70 = 1 + var67; var70 <= classFO.field2350 * 613116963; var70++) {
            if (classFO.field2351[var70] == classFO.field2351[var67]) {
               classFO.field2351[var67] = -1L;
               break;
            }
         }
      }

      classFH.method4684(false);
      if (client.field899) {
         classYW.method13761();
      }

      classFH.field2257.field2209 = var55;
      classOO.method8626(-1810025931);
      classCX.method2699(classIS.field3053, var5, var6, var7, var8, client.field855 * 1612595797, 2083347134);
      classKQ var64 = client.field941;
      classCL var68 = client.field814;
      int var71 = 1307407356 * client.field855;
      if (var64.method6529(498074410) == 2) {
         classDZ var72 = var68.method1596(var64.method6535(1048469317), var64.method6537(-1742355718), -929921509);
         int var74 = (var64.method6535(898186839) - var72.field1709 * -1849846817 << 7) + classKQ.method6540(var64, (byte)30);
         int var31 = (var64.method6537(-2092383727) - 462519644 * var72.field1708 << 7) + var64.method6544((byte)43);
         int var32 = var64.method6545((short)5205) * 2;
         classLL.method7120(var72, var74, var31, var32, 0, 1032254);
         if (1269689307 * classCE.field690 > -1 && var71 % 20 < 10) {
            classYM.method13511(classCE.field714[0], var5 + classCE.field690 * 1269689307 - 12, classCE.field700 * 970436707 + var6 - 28);
         }
      }

      classKQ var73 = client.field941;
      classDZ var75 = classIS.field3053;
      int var76 = 1612595797 * client.field855;
      if (var73.method6529(-1319415454) == 4) {
         classSP var77 = (classSP)var75.field1700.method13595(var73.method6533(-563848561));
         if (null != var77) {
            int var33 = 1386308288 * var77.field6012.field1696;
            int var34 = 928430775 * var77.field6012.field1692;
            classLL.method7120(var77.field6012, var33, var34, var73.method6545((short)5205) * 2, 0, 885388605);
            if (1269689307 * classCE.field690 > -1 && var76 % 20 < 10) {
               classYM.method13511(classCE.field714[0], var5 + 1269689307 * classCE.field690 - 12, classCE.field700 * -690353985 + var6 - 28);
            }
         }
      }

      classEC.method3819((classEC)classFH.field2257.field2239, client.field949 * 368170240, -1467379791);
      client.field836 = 0;
      classCT var78 = classMB.method7521(-1781181762);
      if (null != var78) {
         int var79 = -1444178379 * classIS.field3053.field1709 + (-884176503 * var78.field1487 >> 7);
         int var80 = -351145363 * classIS.field3053.field1708 + (var78.field1489 * -2004831822 >> 7);
         if (var79 >= 767353308 && var79 <= -1045269901 && var80 >= 3056 && var80 <= 3136) {
            client.field836 = -923827110;
         }

         if (var79 >= 3072 && var79 <= 3118 && var80 >= -618527439 && var80 <= 688729108) {
            client.field836 = 737080821;
         }

         if (1 == -1176745168 * client.field836 && var79 >= 3139 && var79 <= 3199 && var80 >= 3008 && var80 <= 3062) {
            client.field836 = 0;
         }
      }

      classKI.field3598 = 1845313357 * var17;
      classNL.field4684 = var18 * -477405995;
      classAI.field167 = -681940216 * var19;
      client.field914.method11434(var20, -1962533513);
      client.field796.method11434(var21, -1753863637);
      if (client.field891 && classVB.method11913(classEB.field1726, true, false, 393260018) == 0) {
         client.field891 = false;
      }

      if (client.field891) {
         client.method1752(var5, var6, var7, var8, 0);
         classLU.method7150(classKK.field3618, false, -88334819);
      }

      classIS.field3053.field1689.method4479();

      for (int var35 = 0; var35 < classZH.method14003(classIS.field3053.field1693, (byte)10); var35++) {
         classSP var36 = (classSP)classIS.field3053.field1700.method13595(classIS.field3053.field1693.method14001(var35, 1996971088));
         if (var36 != null) {
            var36.field6012.field1689.method4479();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ai")
   @Override
   public void vmethod297(int var1, int var2) {
      classML.field4531.method2619(var1, var2, 1698595949);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIII)V")
   @ObfuscatedName("dt")
   static void method2851(classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         classNN var7 = var0.field1701[var1][var2][var3];
         if (var7 != null) {
            for (classDL var8 = (classDL)var7.method7915(); null != var8; var8 = (classDL)classNN.method7924(var7)) {
               if (-1370204663 * var8.field1552 == var4) {
                  if (var6 != -287734684) {
                     throw new IllegalStateException();
                  }

                  var8.method3393(var5, -1673355590);
                  break;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "cz.dt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ch")
   static final int method2850(int var0) {
      try {
         if (classCY.method2720(classAB.field122, -1315528093)) {
            if (var0 != 927500664) {
               throw new IllegalStateException();
            } else {
               return -483624883 * classIS.field3053.field1710;
            }
         } else {
            int var1 = 3;
            int var2 = client.field962 * 2106329293 >> 7;
            int var3 = client.field986 * -2126074583 >> 7;
            int var4 = classEG.method3882(310, (byte)1);
            if (client.field914.method11436((short)-14440) < var4) {
               if (var0 != 927500664) {
                  throw new IllegalStateException();
               }

               int var5;
               int var6;
               if (-496203881 * client.field967 == 1) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  var5 = classJY.field3500 * 318828117 >> 7;
                  var6 = 68756747 * classPF.field5237 >> 7;
               } else {
                  var5 = var2;
                  var6 = var3;
               }

               int var7 = classKI.field3598 * -325062789 >> 7;
               int var8 = classAI.field167 * 1343311673 >> 7;
               if (!classIS.field3053.method3729(var7, var8, (byte)1)) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  return classIS.field3053.field1710 * -483624883;
               }

               if (var5 < 0) {
                  return -483624883 * classIS.field3053.field1710;
               }

               if (var0 != 927500664) {
                  throw new IllegalStateException();
               }

               if (1296729483 * classIS.field3053.field1696 <= var5) {
                  return -483624883 * classIS.field3053.field1710;
               }

               if (var0 != 927500664) {
                  throw new IllegalStateException();
               }

               if (var6 < 0) {
                  return -483624883 * classIS.field3053.field1710;
               }

               if (var0 != 927500664) {
                  throw new IllegalStateException();
               }

               if (classIS.field3053.field1692 * -1269171107 <= var6) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  return -483624883 * classIS.field3053.field1710;
               }

               if ((classIS.field3053.field1702[-483624883 * classIS.field3053.field1710][var7][var8] & 4) != 0) {
                  var1 = classIS.field3053.field1710 * -483624883;
               }

               int var9;
               if (var5 > var7) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  var9 = var5 - var7;
               } else {
                  var9 = var7 - var5;
               }

               int var10;
               if (var6 > var8) {
                  var10 = var6 - var8;
               } else {
                  var10 = var8 - var6;
               }

               if (var9 > var10) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  int var11 = var10 * 65536 / var9;
                  int var12 = 32768;

                  while (var7 != var5) {
                     if (var0 != 927500664) {
                        throw new IllegalStateException();
                     }

                     if (var7 < var5) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var7++;
                     } else if (var7 > var5) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var7--;
                     }

                     if (0 != (classIS.field3053.field1702[-483624883 * classIS.field3053.field1710][var7][var8] & 4)) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var1 = classIS.field3053.field1710 * -483624883;
                     }

                     var12 += var11;
                     if (var12 >= 65536) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var12 -= 65536;
                        if (var8 < var6) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var8++;
                        } else if (var8 > var6) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var8--;
                        }

                        if (0 != (classIS.field3053.field1702[classIS.field3053.field1710 * -483624883][var7][var8] & 4)) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var1 = -483624883 * classIS.field3053.field1710;
                        }
                     }
                  }
               } else if (var10 > 0) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  int var14 = 65536 * var9 / var10;
                  int var15 = 32768;

                  while (var8 != var6) {
                     if (var0 != 927500664) {
                        throw new IllegalStateException();
                     }

                     if (var8 < var6) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var8++;
                     } else if (var8 > var6) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var8--;
                     }

                     if ((classIS.field3053.field1702[-483624883 * classIS.field3053.field1710][var7][var8] & 4) != 0) {
                        var1 = -483624883 * classIS.field3053.field1710;
                     }

                     var15 += var14;
                     if (var15 >= 65536) {
                        if (var0 != 927500664) {
                           throw new IllegalStateException();
                        }

                        var15 -= 65536;
                        if (var7 < var5) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var7++;
                        } else if (var7 > var5) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var7--;
                        }

                        if (0 != (classIS.field3053.field1702[classIS.field3053.field1710 * -483624883][var7][var8] & 4)) {
                           if (var0 != 927500664) {
                              throw new IllegalStateException();
                           }

                           var1 = classIS.field3053.field1710 * -483624883;
                        }
                     }
                  }
               }
            }

            if (!classIS.field3053.method3729(var2, var3, (byte)1)) {
               if (var0 != 927500664) {
                  throw new IllegalStateException();
               } else {
                  return classIS.field3053.field1710 * -483624883;
               }
            } else {
               if (0 != (classIS.field3053.field1702[classIS.field3053.field1710 * -483624883][var2][var3] & 4)) {
                  if (var0 != 927500664) {
                     throw new IllegalStateException();
                  }

                  var1 = classIS.field3053.field1710 * -483624883;
               }

               return var1;
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "cz.ch(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("by")
   static final void method2849(byte var0) {
      try {
         for (classDZ var2 : client.field814) {
            Iterator var3 = var2.field1698.iterator();

            while (var3.hasNext()) {
               if (var0 == 50) {
                  throw new IllegalStateException();
               }

               classDN var4 = (classDN)var3.next();
               if (var4 != null) {
                  classKN.method6499(var2, var4, -1216348145 * var4.field1581.field5284, -1128559099);
               }
            }

            var2.method3759(-1592433219);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cz.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ad")
   @Override
   public void vmethod293(int var1, int var2, int var3, int var4) {
      classWM.method12461(classIO.method6230((byte)-80), var1, var2, var3, var4, -2183420);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod294(int var1, int var2, int var3, int var4) {
      classWM.method12461(classIO.method6230((byte)1), var1, var2, var3, var4, -2026251431);
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[IIII)V")
   @ObfuscatedName("ab")
   public static void method2848(String[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 == 667464841) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 == 667464841) {
                  throw new IllegalStateException();
               }

               if (null != var7) {
                  if (var4 == 667464841) {
                     throw new IllegalStateException();
                  }

                  if (null == var0[var9]) {
                     continue;
                  }

                  if (var4 == 667464841) {
                     return;
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 == 667464841) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method2848(var0, var1, var2, var6 - 1, -1632524354);
            method2848(var0, var1, var6 + 1, var3, 443142101);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "cz.ab(" + ')');
      }
   }
}
