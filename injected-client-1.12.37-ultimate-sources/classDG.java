import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dg")
public class classDG {
   @ObfuscatedName("az")
   int field1431;
   @ObfuscatedName("ae")
   int field1429;
   @ObfuscatedName("af")
   int field1430;
   @ObfuscatedName("ab")
   int field1428;

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("az")
   int method3058(short var1) {
      try {
         return 968174797 * this.field1428;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method3065() {
      return this.field1430 * 155657261;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   int method3070(byte var1) {
      try {
         return this.field1429 * -1246455709;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.ab(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;Ldz;)V")
   @ObfuscatedName("tb")
   public static void method3078(classDF var0, classDZ var1) {
      if (var0 == null) {
         var0.method3025();
      } else {
         for (int var2 = 0; var2 < -2087374717 * var0.field1419; var2++) {
            int var3 = var0.field1423[var2];
            classDC var4 = var0.field1411[var3];
            classKY var5 = var4.field1382;
            classCT var6 = (classCT)var1.field1694.method13404(var3);
            boolean var7 = var5.field4055 * 1870919123 > -1444178379 * var1.field1709
               && 819227381 * var5.field4056 > var1.field1708 * -351145363
               && var5.field4055 * 1870919123 < var1.field1709 * -1444178379 + var1.field1696 * 1296729483
               && var5.field4056 * 819227381 < -351145363 * var1.field1708 + var1.field1692 * -1269171107;
            if (-2130951373 * client.field845 == var3 && var7 && 2140889407 * var1.field1699 != 0) {
               client.field846 = var1.field1699 * 1538034569;
            }

            if (var7 && var6 == null) {
               var6 = var4.method2912(var3, var1, 844956059);
               var4.method2900(var6, -2142952141);
               classYK.method13392(var1.field1694, var6, var3);
            } else if (!var7 && var6 != null) {
               classDC.method2905(var4, var6, (byte)4);
               var6.method12005();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldg;I)I")
   @ObfuscatedName("tm")
   public static int method3062(classDG var0, int var1) {
      if (var0 == null) {
         var0.method3068(var1);
      }

      try {
         return var0.field1431 * 81639;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ak")
   static final boolean method3077(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = classFO.field2348 * 1170217135 + var6;
         if (var8 < var0) {
            if (var7 >= -1657575887) {
               throw new IllegalStateException();
            }

            if (var8 < var1 && var8 < var2) {
               if (var7 >= -1657575887) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         var8 = 1170217135 * classFO.field2348 - var6;
         if (var8 > var0) {
            if (var7 >= -1657575887) {
               throw new IllegalStateException();
            }

            if (var8 > var1) {
               if (var7 >= -1657575887) {
                  throw new IllegalStateException();
               }

               if (var8 > var2) {
                  if (var7 >= -1657575887) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         var8 = classFO.field2349 * 1376644555 + var6;
         if (var8 < var3) {
            if (var7 >= -1657575887) {
               throw new IllegalStateException();
            }

            if (var8 < var4) {
               if (var7 >= -1657575887) {
                  throw new IllegalStateException();
               }

               if (var8 < var5) {
                  if (var7 >= -1657575887) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         var8 = 1376644555 * classFO.field2349 - var6;
         if (var8 > var3) {
            if (var7 >= -1657575887) {
               throw new IllegalStateException();
            }

            if (var8 > var4) {
               if (var7 >= -1657575887) {
                  throw new IllegalStateException();
               }

               if (var8 > var5) {
                  if (var7 >= -1657575887) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         return true;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "dg.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   int method3059() {
      return 968174797 * this.field1428;
   }

   classDG(int var1, int var2, int var3, int var4) {
      this.field1428 = -246505467 * var1;
      this.field1431 = var2 * -654248745;
      this.field1430 = -988886107 * var3;
      this.field1429 = var4 * 199928139;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method3063() {
      return this.field1431 * 81639;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method3064() {
      return this.field1431 * 81639;
   }

   @ObfuscatedSignature(descriptor = "(Ldg;I)I")
   @ObfuscatedName("uh")
   public static int method3066(classDG var0, int var1) {
      if (var0 == null) {
         var0.method3069(var1);
      }

      try {
         return var0.field1430 * 155657261;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method3067() {
      return this.field1430 * -110280257;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method3060() {
      return -258145568 * this.field1428;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldg;)I")
   @ObfuscatedName("uk")
   public static int method3071(classDG var0) {
      return var0.field1429 * 1958428702;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method3072() {
      return this.field1429 * 1421643485;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method3073() {
      return this.field1429 * 653437434;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method3074() {
      return this.field1429 * -1246455709;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;)Ljava/util/HashMap;")
   @ObfuscatedName("xr")
   public static HashMap method3076(classGU var0) {
      if (var0 == null) {
         var0.method5781();
      }

      var0.method5788(14069776);
      return var0.field2701;
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("af")
   public static int method3057(int var0, int var1, byte var2) {
      try {
         return var0 << 8 | var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dg.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   static void method3079(int var0) {
      try {
         if (client.field901 == classCP.field1197) {
            if (var0 >= 2133873433) {
               throw new IllegalStateException();
            } else {
               classTZ.field6273 = classCC.method1407(1060637953 * classUM.field6334.field6328, false, true, true, false, (byte)37);
               classFC.field2208 = classCC.method1407(1060637953 * classUM.field6336.field6328, true, true, true, false, (byte)-55);
               classHC.field2767 = classCC.method1407(classUM.field6338.field6328 * 1060637953, false, true, true, false, (byte)50);
               classBH.field462 = classCC.method1407(classUM.field6344.field6328 * 1060637953, false, true, true, false, (byte)34);
               classYO.field7023 = classCC.method1407(classUM.field6343.field6328 * 1060637953, true, false, true, false, (byte)-33);
               classQN.field5572 = classCC.method1407(1060637953 * classUM.field6340.field6328, false, true, true, false, (byte)-52);
               classMQ.field4562 = classCC.method1407(classUM.field6339.field6328 * 1060637953, false, true, true, false, (byte)19);
               classBH.field463 = classCC.method1407(1060637953 * classUM.field6346.field6328, true, true, true, false, (byte)12);
               classRQ.method10165(20, classKK.field3623, 192522781);
               classXQ.method12874(classCP.field1186, -72682194);
            }
         } else if (client.field901 == classCP.field1186) {
            if (var0 >= 2133873433) {
               throw new IllegalStateException();
            } else {
               int var60;
               byte var93;
               label527: {
                  int var53 = 0;
                  var53 += classTZ.field6273.method12017(1857218819) * 53 / 100;
                  var53 += classFC.field2208.method12017(-606348877) * 5 / 100;
                  var53 += classHC.field2767.method12017(-1890665226) * 36 / 100;
                  var53 += classBH.field462.method12017(-503033937) * 1 / 100;
                  var53 += classYO.field7023.method12017(-1654409710) * 1 / 100;
                  var53 += classQN.field5572.method12017(536053702) * 2 / 100;
                  var60 = var53 + classMQ.field4562.method12017(-1943980069) * 1 / 100;
                  if (classVP.method12014(classBH.field463, (byte)9)) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     if (classBH.field463.method11811(-121046838)) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        var93 = 1;
                        break label527;
                     }
                  }

                  var93 = 0;
               }

               var60 += var93;
               if (100 != var60) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  } else {
                     if (var60 != 0) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        classRQ.method10165(30, classKK.field3735 + var60 + "%", -17133771);
                     }
                  }
               } else {
                  classPC.method8840(classTZ.field6273, "Sound FX", 1380387156);
                  classPC.method8840(classFC.field2208, "Music Tracks", 1917480831);
                  classPC.method8840(classHC.field2767, "Sprites", 99492000);
                  classPC.method8840(classQN.field5572, "Music Samples", 1655083062);
                  classPC.method8840(classMQ.field4562, "Music Patches", 338095502);
                  classOV.field5169 = new classAAM();
                  classOV.field5169.method223(classBH.field463, 1513224765);
                  classRQ.method10165(40, classKK.field3625, 1041453347);
                  classXQ.method12874(classCP.field1184, -495907339);
               }
            }
         } else if (classCP.field1184 == client.field901) {
            if (var0 >= 2133873433) {
               throw new IllegalStateException();
            } else {
               boolean var10001;
               if (!client.field885) {
                  if (var0 >= 2133873433) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               classIR.method6308(22050, (boolean)var10001, 2, 561350655);
               ArrayList var52 = new ArrayList(3);
               classMB var74 = classWW.field6786;
               short var79 = 2048;
               if (0 == classLG.field4138 * 675076789) {
                  throw new IllegalStateException();
               } else {
                  if (var79 < 512) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     var79 = 512;
                  }

                  classAK var66;
                  try {
                     classAK var83 = classAK.field211.vmethod66(2001751793);
                     if (classKG.field3583) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        var10001 = 2;
                     } else {
                        var10001 = 1;
                     }

                     var83.field214 = new int[var10001 * 512];
                     var83.field208 = 720051327 * var79;
                     var83.vmethod45((byte)27);
                     var83.field206 = -1244498745 * ((var79 & -2048) + 2048);
                     if (var83.field206 * -1077408521 > 32768) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        var83.field206 = 979599360;
                     }

                     var83.vmethod50(var83.field206 * -1077408521, 364500251);
                     if (classKI.field3595 * -644193571 > 0) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        if (classXC.field6825 == null) {
                           if (var0 >= 2133873433) {
                              throw new IllegalStateException();
                           }

                           classXC.field6825 = new classAV();
                           classAK.field212 = Executors.newScheduledThreadPool(1);
                           classAK.field212.scheduleAtFixedRate(classXC.field6825, 0L, 10L, TimeUnit.MILLISECONDS);
                        }
                     }

                     if (null != classXC.field6825) {
                        if (var0 >= 2133873433) {
                           return;
                        }

                        if (null != classXC.field6825.field287[0]) {
                           if (var0 >= 2133873433) {
                              throw new IllegalStateException();
                           }

                           throw new IllegalArgumentException();
                        }

                        classXC.field6825.field287[0] = var83;
                     }

                     var66 = var83;
                  } catch (Throwable var27) {
                     client.method2320(var27);
                     var66 = new classAK();
                  }

                  classBJ.field481 = var66;
                  classQO.field5580 = new classAO();
                  classAO var84 = new classAO();
                  var84.method617(classQO.field5580);

                  for (int var86 = 0; var86 < 3; var86++) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     classNU var88 = new classNU(classBJ.field481);
                     classNU.method8054(var88, 9, 128, (short)-27396);
                     var84.method617(var88);
                     var52.add(var88);
                  }

                  classBJ.field481.method404(var84, (byte)-86);
                  classVP var87 = classMQ.field4562;
                  classVP var89 = classQN.field5572;
                  classVP var90 = classTZ.field6273;
                  classIA.field2927 = var87;
                  classRM.field5809 = var89;
                  classNP.field4705 = var90;
                  classNP.field4704 = var52;
                  client.field857.method10290(classTZ.field6273, classQO.field5580, 62656778);
                  classRQ.method10165(60, classKK.field3853, 1137972765);
                  classXQ.method12874(classCP.field1189, -1012671695);
               }
            }
         } else if (classCP.field1189 == client.field901) {
            if (var0 < 2133873433) {
               if (null == classCR.field1228) {
                  classCR.field1228 = new classXC(classHC.field2767, classYO.field7023);
               }

               int var51 = classXJ.method12792(-511275367).length;
               client.field833 = classCR.field1228.method12744(classXJ.method12792(-511275367), -1607507693);
               if (client.field833.size() < var51) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  } else {
                     classRQ.method10165(80, classKK.field3818 + client.field833.size() * 100 / var51 + "%", 109438924);
                  }
               } else {
                  classQJ.field5556 = (classZV)client.field833.get(classXJ.field6874);
                  classVP.field6550 = (classZV)client.field833.get(classXJ.field6878);
                  classBB.field341 = (classZV)client.field833.get(classXJ.field6876);
                  classEB.field1727 = client.field877.vmethod625(971457923);
                  classVT.method12108(-1);
                  classRQ.method10165(80, classKK.field3628, 1095325968);
                  classXQ.method12874(classCP.field1185, 322322561);
               }
            }
         } else if (client.field901 == classCP.field1185) {
            if (var0 >= 2133873433) {
               throw new IllegalStateException();
            } else {
               int var50 = classVC.method11935(classBH.field462, classHC.field2767, (byte)9);
               int var65 = classKH.method6477(classHC.field2767, (short)-11923);
               if (var50 < var65) {
                  classRQ.method10165(90, classKK.field3629 + 100 * var50 / var65 + "%", 105121254);
               } else {
                  classRQ.method10165(100, classKK.field3630, 262336192);
                  if (classAC.field135) {
                     classJB.method6345(5, -1192966987);
                     classXQ.method12874(classCP.field1199, 60396827);
                  } else {
                     classXQ.method12874(classCP.field1196, -76156975);
                  }
               }
            }
         } else if (classCP.field1199 == client.field901) {
            classJB.method6345(10, -1192966987);
         } else if (classCP.field1196 == client.field901) {
            classEN.field1804 = classCC.method1407(1060637953 * classUM.field6332.field6328, false, true, true, false, (byte)34);
            classDN.field1584 = classCC.method1407(1060637953 * classUM.field6347.field6328, false, true, true, true, (byte)16);
            classQE.field5525 = classCC.method1407(classUM.field6331.field6328 * 1060637953, false, true, true, false, (byte)-67);
            classBF.field427 = classCC.method1407(1060637953 * classUM.field6341.field6328, true, false, true, false, (byte)59);
            classCC.field671 = classCC.method1407(classUM.field6333.field6328 * 1060637953, false, true, true, false, (byte)7);
            classAF.field146 = classCC.method1407(1060637953 * classUM.field6335.field6328, true, true, true, false, (byte)-19);
            classSX.field6097 = classCC.method1407(1060637953 * classUM.field6337.field6328, false, true, true, false, (byte)50);
            classOP.field5078 = classCC.method1407(classUM.field6342.field6328 * 1060637953, false, true, true, false, (byte)65);
            classCB.field650 = classCC.method1407(1060637953 * classUM.field6353.field6328, false, true, true, false, (byte)0);
            classWN.field6759 = classCC.method1407(1060637953 * classUM.field6345.field6328, false, true, true, false, (byte)78);
            classGG.field2576 = classCC.method1407(classUM.field6354.field6328 * 1060637953, false, true, true, false, (byte)20);
            classCJ.field764 = classCC.method1407(classUM.field6348.field6328 * 1060637953, false, true, true, false, (byte)27);
            classAF.field147 = classCC.method1407(1060637953 * classUM.field6330.field6328, false, true, true, false, (byte)63);
            classBE.field383 = classCC.method1407(classUM.field6350.field6328 * 1060637953, false, true, true, false, (byte)-75);
            classLZ.field4452 = classAS.method664(1060637953 * classUM.field6352.field6328, false, true, true, true, true, (byte)74);
            classRQ.method10165(20, classKK.field3623, 120972902);
            classXQ.method12874(classCP.field1187, 1305472034);
         } else if (client.field901 == classCP.field1187) {
            int var34 = 0;
            var34 += classEN.field1804.method12017(2034921150) * 4 / 100;
            var34 += classDN.field1584.method12017(-255448783) * 1 / 100;
            var34 += classQE.field5525.method12017(-1945602939) * 2 / 100;
            var34 += classBF.field427.method12017(-1269519071) * 1 / 100;
            var34 += classCC.field671.method12017(645560701) * 1 / 100;
            var34 += classAF.field146.method12017(97949876) * 10 / 100;
            var34 += classSX.field6097.method12017(-1075232567) * 65 / 100;
            var34 += classOP.field5078.method12017(-933136960) * 1 / 100;
            var34 += classCB.field650.method12017(240826279) * 1 / 100;
            var34 += classWN.field6759.method12017(-1977228614) * 6 / 100;
            var34 += classCJ.field764.method12017(597582263) * 1 / 100;
            var34 += classGG.field2576.method12017(-926736508) * 2 / 100;
            var34 += classAF.field147.method12017(-988661170) * 2 / 100;
            var34 += classBE.field383.method12017(1607767865) * 1 / 100;
            var34 += classLZ.field4452.method12017(957504198) * 2 / 100;
            if (var34 != 100) {
               if (var0 < 2133873433) {
                  if (var34 != 0) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     classRQ.method10165(30, classKK.field3735 + var34 + "%", 1297647214);
                  }
               }
            } else {
               classPC.method8840(classEN.field1804, "Animations", 388331622);
               classPC.method8840(classDN.field1584, "Animation Keyframes", 81832510);
               classPC.method8840(classQE.field5525, "Skeletons", 1231986805);
               classPC.method8840(classAF.field146, "Maps", 1619028281);
               classPC.method8840(classSX.field6097, "Models", 1015516872);
               classPC.method8840(classCB.field650, "Music Jingles", 1946096542);
               classPC.method8840(classCJ.field764, "World Map", 2115548686);
               classPC.method8840(classGG.field2576, "World Map Geography", 198798175);
               classPC.method8840(classAF.field147, "World Map Ground", 2099913500);
               classRQ.method10165(30, classKK.field3625, 367747182);
               classXQ.method12874(classCP.field1183, -103177746);
            }
         } else if (client.field901 == classCP.field1183) {
            if (var0 < 2133873433) {
               int var33 = classAB.field122.method2817((byte)0);
               classIS.field3053 = client.field814.method1580(104, 104, var33, 598446671);
               classCQ.field1220 = classIS.field3053;
               classRD.field5645 = new classYM(512, 512);
               classFQ.method4936(var33);
               classEZ.method4257(var33);
               classRQ.method10165(30, classKK.field3846, 290439628);
               classXQ.method12874(classCP.field1191, 1651513995);
            }
         } else if (classCP.field1191 == client.field901) {
            if (var0 >= 2133873433) {
               throw new IllegalStateException();
            } else if (!classBF.field427.method11811(-870848946)) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  classRQ.method10165(40, classKK.field3631 + classBF.field427.method12044(-1848350410) + "%", 1923757811);
               }
            } else if (!classBE.field383.method11811(1375147487)) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  classRQ.method10165(40, classKK.field3631 + (80 + classWN.field6759.method12044(-1634189633) / 6) + "%", 850064464);
               }
            } else {
               classKK.method6489(classBF.field427, (byte)0);
               classFP.method4899(classBF.field427, -3113161);
               classVP var32 = classBF.field427;
               classVP var64 = classSX.field6097;
               classLP.field4196 = var32;
               classOX.field5192 = var64;
               classEY.field1983 = classLP.field4196.method11868(3, 1562769287) * 110470759;
               classGH.method5437(classBF.field427, classSX.field6097, client.field885, (byte)68);
               classVP var73 = classBF.field427;
               classVP var78 = classSX.field6097;
               classPL.field5294 = var73;
               classPL.field5290 = var78;
               classVP var82 = classBF.field427;
               classPR.field5391 = var82;
               classVP var85 = classBF.field427;
               classVP var7 = classSX.field6097;
               boolean var8 = client.field932;
               classZV var9 = classQJ.field5556;
               classOT.field5117 = var85;
               classGU.field2702 = var7;
               classJP.field3357 = var8;
               classCS.field1248 = classOT.field5117.method11868(10, -2040913051) * -2069118229;
               classNE.field4667 = var9;
               classVP var10 = classBF.field427;
               classVP var11 = classEN.field1804;
               classVP var12 = classDN.field1584;
               classVP var13 = classQE.field5525;
               classOU.field5153 = var10;
               classKP.field3986 = var11;
               classGN.field2633 = var12;
               classIY.field3099 = var13;
               classVP var14 = classBF.field427;
               classVP var15 = classSX.field6097;
               classEN.field1802 = var14;
               classOR.field5085 = var15;
               classHV.method6120(classBF.field427, -793016397);
               classVP var16 = classBF.field427;
               classOY.field5201 = var16;
               classOY.field5201.method11868(16, -1059616406);
               int var17 = classBF.field427.method11868(16, 227578444);
               classLB.field4091 = new int[var17];
               classLB.field4090 = new int[var17];
               client.method2139(-1);
               classWK.field6691 = new classVV(classCC.field671, classSX.field6097, classHC.field2767, classYO.field7023, classLZ.field4452);
               classBH.method1074(classBF.field427, 2130004647);
               classVP var18 = classBF.field427;
               classLH.field4168 = var18;
               classMR.method7646(classBF.field427, 401429787);
               classDP.method3510(classBF.field427, -652152825);
               classGJ.method5465(classBF.field427, -1970667382);
               classVP var19 = classBF.field427;
               classVP var20 = classHC.field2767;
               classCB.field649 = var19;
               classJI.field3167 = var20;
               classBA.method754(classBF.field427, -857216225);
               classPD.method8842(classBF.field427, (byte)-8);
               classAAK.field56 = new classXR(classYP.field7028, 54, classLU.field4232, classBF.field427);
               classRE.field5659 = new classXR(classYP.field7028, 47, classLU.field4232, classBF.field427);
               classSX.field6096 = new classDS();
               classCP.method2570(classBF.field427, classHC.field2767, classYO.field7023, -296230892);
               classVP var21 = classBF.field427;
               classVP var22 = classHC.field2767;
               classMN.field4545 = var21;
               classKJ.field3605 = var22;
               classVP var23 = classBF.field427;
               classVP var24 = classHC.field2767;
               classPS.field5413 = var24;
               classPS.field5407 = var23.method11868(35, 479724292) * -1749753703;
               classYV.field7095 = new classPS[classPS.field5407 * 925594537];

               for (int var25 = 0; var25 < 925594537 * classPS.field5407; var25++) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  byte[] var26 = var23.method11867(35, var25, -703079961);
                  classYV.field7095[var25] = new classPS(var25);
                  if (var26 != null) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     classPS.method9187(classYV.field7095[var25], new classXY(var26), (byte)-2);
                     classYV.field7095[var25].method9194(-1946863999);
                  }
               }

               classFY.method5272(classBF.field427, 1267798787);
               classVP var91 = classBF.field427;
               classPC.field5222 = var91;
               classPC.field5222.method11868(75, -1554048698);
               classRQ.method10165(50, classKK.field3872, 1863062521);
               classXQ.method12874(classCP.field1192, -179427983);
            }
         } else if (classCP.field1192 != client.field901) {
            if (client.field901 == classCP.field1193) {
               if (!classOP.field5078.method11811(-475832234)) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  } else {
                     classRQ.method10165(70, classKK.field3635 + "0%", 49525986);
                  }
               } else {
                  classRS.field5839 = new classEC(classOP.field5078, classHC.field2767, 20, classAB.field122.method2757(-1674478907), 128);
                  classFH.method4689(classRS.field5839);
                  classFH.method4694(classAB.field122.method2757(-1674478907));
                  classXQ.method12874(classCP.field1194, -15854500);
               }
            } else if (classCP.field1194 == client.field901) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  int var31 = classEC.method3806(classRS.field5839, (byte)4);
                  if (var31 < 100) {
                     classRQ.method10165(80, classKK.field3635 + var31 + "%", 1605348951);
                  } else {
                     classRQ.method10165(90, classKK.field3636, 1704902614);
                     classXQ.method12874(classCP.field1195, -429409396);
                  }
               }
            } else if (client.field901 == classCP.field1195) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  classPP.field5380 = new classDK();
                  classWW.field6786.method7517(classPP.field5380, 10, -1779981336);
                  classRQ.method10165(92, classKK.field3637, 103264174);
                  classXQ.method12874(classCP.field1188, 948996480);
               }
            } else if (client.field901 == classCP.field1188) {
               if (!classBH.field462.method11859("huffman", "", -337835981)) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  } else {
                     classRQ.method10165(94, classKK.field3638 + 0 + "%", 1889973300);
                  }
               } else {
                  classLR var30 = new classLR(classBH.field462.method11854("huffman", "", 1857645463));
                  classBF.method994(var30, -863610012);
                  classRQ.method10165(94, classKK.field3639, 2027387257);
                  classXQ.method12874(classCP.field1190, 11366372);
               }
            } else if (classCP.field1190 == client.field901) {
               if (var0 < 2133873433) {
                  if (!classCC.field671.method11811(261960522)) {
                     classRQ.method10165(96, classKK.field3610 + classCC.field671.method12044(-2016826520) * 4 / 5 + "%", 10499025);
                  } else if (!classLZ.field4452.method11811(-1297281514)) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     } else {
                        classRQ.method10165(96, classKK.field3610 + classLZ.field4452.method12044(-1484578371) * 4 / 5 + "%", 971151773);
                     }
                  } else if (!classWN.field6759.method11811(1402896104)) {
                     if (var0 < 2133873433) {
                        classRQ.method10165(96, classKK.field3610 + (80 + classWN.field6759.method12044(-2125726082) / 6) + "%", 1156077067);
                     }
                  } else if (!classYO.field7023.method11811(-82676222)) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     } else {
                        classRQ.method10165(96, classKK.field3610 + (96 + classYO.field7023.method12044(-1818043064) / 50) + "%", 1758631788);
                     }
                  } else {
                     classRQ.method10165(98, classKK.field3641, 1346536984);
                     if (classVA.method11853(classWN.field6759, "version.dat", "", 926249338)) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        classXY var29 = new classXY(classWN.field6759.method11854("version.dat", "", 1857645463));
                        classXY.method13047(var29, 813829590);
                     }

                     classXQ.method12874(classCP.field1198, 2025835941);
                  }
               }
            } else if (client.field901 == classCP.field1198) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  if (classCJ.field764.method11832((byte)6) > 0) {
                     if (var0 >= 2133873433) {
                        throw new IllegalStateException();
                     }

                     if (!classCJ.field764.method11866(-1013526269 * classHE.field2774.field2773, -906797091)) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        classRQ.method10165(
                           100, classKK.field3682 + classCJ.field764.method12038(classHE.field2774.field2773 * -1013526269, -1392230267) / 10 + "%", 963725365
                        );
                        return;
                     }
                  }

                  if (null == client.field1125) {
                     if (var0 >= 2133873433) {
                        return;
                     }

                     client.field1125 = new classWM();
                     client.field1125
                        .method12381(classCJ.field764, classGG.field2576, classAF.field147, classBB.field341, client.field833, classOY.field5202, (byte)-50);
                  }

                  classRQ.method10165(100, classKK.field3643, 1748874685);
                  if (classAC.field135) {
                     classXQ.method12874(classCP.field1200, 1179798115);
                  } else {
                     classXQ.method12874(classCP.field1199, 450768362);
                  }
               }
            } else {
               if (client.field901 == classCP.field1200) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  classLX.field4424 = false;
                  classJB.method6345(20, -1192966987);
                  classRL.method10026(classCX.field1334, 918490706);
               }
            }
         } else if (var0 >= 2133873433) {
            throw new IllegalStateException();
         } else {
            int var1 = 0;
            if (classGG.field2577 == null) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classGG.field2577 = classPN.method9038(classHC.field2767, classOV.field5169.field61 * -92792757, 0, -1864631683);
            } else {
               var1++;
            }

            if (null == classKU.field4033) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classKU.field4033 = classPN.method9038(classHC.field2767, classOV.field5169.field63 * -813289573, 0, -2001160451);
            } else {
               var1++;
            }

            if (null == classOY.field5202) {
               if (var0 >= 2133873433) {
                  return;
               }

               classVP var3 = classHC.field2767;
               int var4 = classOV.field5169.field64 * -876542085;
               classYZ[] var2;
               if (!classHK.method6068(var3, var4, 0, (byte)-96)) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  var2 = null;
               } else {
                  var2 = classFS.method4978((byte)29);
               }

               classOY.field5202 = var2;
            } else {
               var1++;
            }

            if (!classIN.method6226((byte)0)) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classYM[] var62 = classIR.method6307(classHC.field2767, classOV.field5169.field65 * -1318207165, 0, -1253680523);
               classUO.field6361 = var62;
            } else {
               var1++;
            }

            boolean var63 = classCE.field713 != null;
            if (!var63) {
               classHP.method6091(classIR.method6307(classHC.field2767, classOV.field5169.field66 * 514042533, 0, -1253680523), -1940034738);
            } else {
               var1++;
            }

            if (!classQW.method9829(1973417774)) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classYM[] var67 = classIR.method6307(classHC.field2767, 68430027 * classOV.field5169.field67, 0, -1253680523);
               classCE.field714 = var67;
            } else {
               var1++;
            }

            if (classCQ.field1221 == null) {
               classCQ.field1221 = classIR.method6307(classHC.field2767, 1464528911 * classOV.field5169.field68, 0, -1253680523);
            } else {
               var1++;
            }

            if (classMS.field4579 == null) {
               classMS.field4579 = classIR.method6307(classHC.field2767, classOV.field5169.field69 * 1666299907, 0, -1253680523);
            } else {
               var1++;
            }

            if (null == classPE.field5234) {
               classPE.field5234 = classIR.method6307(classHC.field2767, -64965839 * classOV.field5169.field73, 0, -1253680523);
            } else {
               var1++;
            }

            if (null == classFP.field2373) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classVP var75 = classHC.field2767;
               int var5 = classOV.field5169.field71 * 2051863169;
               classYZ[] var68;
               if (!classHK.method6068(var75, var5, 0, (byte)1)) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  var68 = null;
               } else {
                  var68 = classFS.method4978((byte)-19);
               }

               classFP.field2373 = var68;
            } else {
               var1++;
            }

            if (null == classDT.field1630) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               }

               classVP var76 = classHC.field2767;
               int var80 = 238533273 * classOV.field5169.field70;
               classYZ[] var69;
               if (!classHK.method6068(var76, var80, 0, (byte)-16)) {
                  var69 = null;
               } else {
                  var69 = classFS.method4978((byte)24);
               }

               classDT.field1630 = var69;
            } else {
               var1++;
            }

            label539: {
               if (classLJ.field4179 == null) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  if (-1 != -1589101089 * classOV.field5169.field74) {
                     classER var70 = classER.method4047(classSX.field6097, -1589101089 * classOV.field5169.field74, 0);
                     if (var70 != null) {
                        if (var0 >= 2133873433) {
                           throw new IllegalStateException();
                        }

                        classLJ.field4179 = var70.method4028();
                     }
                     break label539;
                  }
               }

               var1++;
            }

            if (classIY.field3098 == null && -1 != classOV.field5169.field59 * -1992983305) {
               classER var71 = classER.method4047(classSX.field6097, classOV.field5169.field59 * -1992983305, 0);
               if (null != var71) {
                  if (var0 >= 2133873433) {
                     throw new IllegalStateException();
                  }

                  classIY.field3098 = var71.method4028();
               }
            } else {
               var1++;
            }

            if (var1 < 13) {
               if (var0 >= 2133873433) {
                  throw new IllegalStateException();
               } else {
                  classRQ.method10165(70, classKK.field3654 + 100 * var1 / 14 + "%", 1314862622);
               }
            } else {
               classAAA.field25 = classDT.field1630;
               classKU.field4033.method13482();
               int var72 = (int)(Math.random() * 21.0) - 10;
               int var77 = (int)(Math.random() * 21.0) - 10;
               int var81 = (int)(Math.random() * 21.0) - 10;
               int var6 = (int)(Math.random() * 41.0) - 20;
               classOY.field5202[0].method13805(var72 + var6, var6 + var77, var6 + var81);
               classRQ.method10165(60, classKK.field3634, 1122429593);
               classXQ.method12874(classCP.field1193, 876067568);
            }
         }
      } catch (RuntimeException var28) {
         throw classEG.method3884(var28, "dg.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([II)Lte;")
   @ObfuscatedName("ad")
   public static classTE method3075(int[] var0, int var1) {
      try {
         classTE var2 = new classTE(classYY.field7111, false);
         var2.field6126 = var0;
         var2.field6131 = var0.length * -1063196331;
         var2.field6123 = var0.length * 404453943;
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dg.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lsp;ZI)V")
   @ObfuscatedName("cy")
   static void method3080(classDZ var0, classSP var1, boolean var2, int var3) {
      try {
         boolean var10000;
         label132: {
            if (var1.field6026.field4884) {
               if (var3 <= 492384153) {
                  throw new IllegalStateException();
               }

               if (!var2) {
                  if (var3 <= 492384153) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label132;
               }
            }

            var10000 = false;
         }

         boolean var4 = var10000;
         long var5 = 0L;
         if (-2034209657 * client.field846 == var1.field6012.field1699 * 2140889407) {
            if (var3 <= 492384153) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         classKW var8 = var1.method10574(var7, -97067510);
         if (var8 == classKW.field4040) {
            if (var3 <= 492384153) {
               throw new IllegalStateException();
            }

            var5 = classRF.method9961(0, 0, 0, 5, false, 0, 0, (short)11884);
         } else if (var4) {
            if (var3 <= 492384153) {
               return;
            }

            if (classKW.field4043 != var8) {
               if (var3 <= 492384153) {
                  throw new IllegalStateException();
               }

               if (var8 == classKW.field4039) {
                  if (var3 <= 492384153) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var9 = var10000;
               var5 = classRF.method9961(
                  var1.vmethod258((byte)-112),
                  classKY.method6608(var1.vmethod368(311606126), (byte)-62),
                  classKY.method6608(var1.vmethod371(-679903255), (byte)-12),
                  4,
                  !var9,
                  var1.field6009 * -1807801405,
                  2140889407 * var0.field1699,
                  (short)12590
               );
            }
         }

         classGY.method5933(
            var1.field6019,
            classKV.method6571(var0, var1.vmethod368(311606126), var1.vmethod371(-1833520620), -483624883 * var0.field1710, (byte)122),
            (short)255
         );
         var1.field6012.field1689.method4345(1612595797 * client.field855);
         var1.method10554(var2, 1915485008);
         boolean var14 = classEZ.method4477(
            var0.field1689,
            -483624883 * var0.field1710,
            var1.vmethod368(311606126),
            var1.vmethod371(-1811048434),
            var1.method10559(-2104899589),
            60,
            var1.field6012.field1689,
            var1.method10561(-1982397383),
            var5,
            false
         );
         if (var14 && !var2) {
            if (var3 <= 492384153) {
               throw new IllegalStateException();
            }

            classCW.method2694(var1.field6012, 2053680351);
            classDZ var10 = var1.field6012;
            if (927693091 * client.field971 >= 0) {
               if (var3 <= 492384153) {
                  throw new IllegalStateException();
               }

               if (var10.field1694.method13404(client.field971 * 927693091) != null) {
                  classDV.method3627(var10, client.field971 * 927693091, false, 2021765600);
               }
            }

            classHO.method6079(var1.field6012, classOQ.field5079, (byte)0);
            classNG.method7841(var1.field6012, 1770667891);
            classHO.method6079(var1.field6012, classOQ.field5081, (byte)0);
            classHO.method6079(var1.field6012, classOQ.field5080, (byte)0);
            classDZ var11 = var1.field6012;

            for (classBI var12 = (classBI)var11.field1691.method7915(); null != var12; var12 = (classBI)classNN.method7924(var11.field1691)) {
               if (var12.field471 * 1040651135 == -483624883 * var11.field1710) {
                  if (!var12.method1091(-1832990406)) {
                     if (1612595797 * client.field855 >= 1835952965 * var12.field470) {
                        var12.method1105(client.field949 * -322689719, 120519409);
                        if (var12.method1091(-1077956619)) {
                           if (var3 <= 492384153) {
                              throw new IllegalStateException();
                           }

                           var12.vmethod398();
                        } else {
                           classEZ.method4477(
                              var11.field1689,
                              var12.field471 * 1040651135,
                              1586395561 * var12.field467,
                              var12.field468 * -1285652349,
                              var12.field469 * -1107927935,
                              60,
                              var12,
                              0,
                              -1L,
                              false
                           );
                        }
                     }
                     continue;
                  }

                  if (var3 <= 492384153) {
                     throw new IllegalStateException();
                  }
               }

               var12.vmethod398();
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "dg.cy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;")
   @ObfuscatedName("az")
   static String method3061(int var0, byte var1) {
      try {
         return "<img=" + var0 + ">";
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method3068(int var1) {
      try {
         return this.field1431 * 155657261;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   int method3069(int var1) {
      try {
         return this.field1431 * 155657261;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dg.ae(" + 41);
      }
   }
}
