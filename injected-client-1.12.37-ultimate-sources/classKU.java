import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ku")
public class classKU implements classXZ {
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("ay")
   static classYM field4033;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4029 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field4031 = 7;
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("ab")
   static final classKU field4027 = new classKU(3, 3);
   @ObfuscatedName("ag")
   public final int field4024;
   @ObfuscatedName("as")
   int field4023;
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("af")
   static final classKU field4028 = new classKU(1, 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4030 = 16;
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("az")
   public static final classKU field4025 = new classKU(0, 0);
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final String field4032 = "spacer_";
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("ae")
   public static final classKU field4026 = new classKU(2, 2);

   classKU(int var1, int var2) {
      this.field4024 = var1 * 1429349157;
      this.field4023 = 1552526869 * var2;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 1958850877 * this.field4023;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ku.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 1958850877 * this.field4023;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1958850877 * this.field4023;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -867704066 * this.field4023;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lku;")
   @ObfuscatedName("as")
   public static classKU[] method6563() {
      return new classKU[]{field4025, field4028, field4026, field4027};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lku;")
   @ObfuscatedName("ac")
   public static classKU[] method6564() {
      return new classKU[]{field4025, field4028, field4026, field4027};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lku;")
   @ObfuscatedName("ax")
   public static classKU[] method6565() {
      return new classKU[]{field4025, field4028, field4026, field4027};
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lte;IB)V")
   @ObfuscatedName("ak")
   public static void method6566(classTE var0, classTE var1, int var2, byte var3) {
      try {
         classOL.method8512(var0, 1327640383);
         classON.method8613(var1, var0.field6128, 1135509496);
         if (var2 >= 0) {
            if (var3 >= 97) {
               throw new IllegalStateException();
            }

            if (var2 <= var0.field6131 * -1943548931) {
               if (0 == var1.field6131 * -1943548931) {
                  if (var3 >= 97) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               var0.method10774(var1.field6131 * -1943548931 + var0.field6131 * -1943548931, 1794039024);
               if (var2 < var0.field6131 * -1943548931) {
                  if (var3 >= 97) {
                     throw new IllegalStateException();
                  }

                  classMX.method7739(var0, var2, var0, -1943548931 * var1.field6131 + var2, var0.field6131 * -1943548931 - var2, -2127482027);
               }

               classMX.method7739(var1, 0, var0, var2, -1943548931 * var1.field6131, -2147334365);
               var0.field6131 = var0.field6131 + var1.field6131 * 1;
               var0.field6133 = true;
               return;
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ku.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bm")
   static int method6567(int var0, classBL var1, boolean var2, int var3) {
      try {
         if (var0 == 3100) {
            String var24 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            var24 = classUP.method11420(var24, classRR.method10179(-1792975740), classBB.field334, classBB.field333, (byte)0);
            classPH.method8883(0, "", var24, 1387260664);
            return 1;
         } else if (var0 == 3101) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classCU.method2676(
                  classMB.method7521(95107390),
                  classBB.field323[-324749371 * classDY.field1679],
                  classBB.field323[1 + -324749371 * classDY.field1679],
                  1322204385
               );
               return 1;
            }
         } else if (var0 == 3103) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               if (!classBB.field335) {
                  classBB.field330 = true;
               }

               return 1;
            }
         } else if (var0 == 3104) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               String var23 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var33 = 0;
               if (classEU.method4078(var23, (byte)-1)) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var33 = classJF.method6360(var23, 1918491403);
               }

               classJL var36 = classEF.method3849(classJS.RESUME_P_COUNTDIALOG, client.field795.field1535, (byte)38);
               var36.field3343.method12979(var33, 2021936256);
               client.field795.method3367(var36, -1301097035);
               return 1;
            }
         } else if (var0 == 3105) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               String var22 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classJL var32 = classEF.method3849(classJS.RESUME_P_NAMEDIALOG, client.field795.field1535, (byte)13);
               classXY.method12971(var32.field3343, var22.length() + 1, (byte)-120);
               classXY.method12997(var32.field3343, var22, (short)21980);
               client.field795.method3367(var32, -1301097035);
               return 1;
            }
         } else if (var0 == 3106) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classJL var31 = classEF.method3849(classJS.RESUME_P_STRINGDIALOG, client.field795.field1535, (byte)-15);
               classXY.method12971(var31.field3343, var21.length() + 1, (byte)-37);
               classXY.method12997(var31.field3343, var21, (short)1254);
               client.field795.method3367(var31, -1301097035);
               return 1;
            }
         } else if (var0 == 3107) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int var20 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               String var30 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classLN.method7127(var20, var30, 1785402138);
               return 1;
            }
         } else if (var0 == 3108) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 360123687;
               int var19 = classBB.field323[-324749371 * classDY.field1679];
               int var29 = classBB.field323[1 + classDY.field1679 * -324749371];
               int var35 = classBB.field323[-324749371 * classDY.field1679 + 2];
               classLW var38 = classLY.method7375(classWK.field6691, var35, (byte)84);
               if (!client.field973 && classWK.field6691.method12157(var38, var19, var29, 1478165700)) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  classBT.method1244(1974111473);
               }

               return 1;
            }
         } else if (3109 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var18 = classBB.field323[-324749371 * classDY.field1679];
               int var28 = classBB.field323[-324749371 * classDY.field1679 + 1];
               classLW var34 = var2 ? classSZ.field6110 : classDL.field1558;
               if (!client.field973) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  if (classWK.field6691.method12157(var34, var18, var28, 1323122031)) {
                     classBT.method1244(1790093624);
                  }
               }

               return 1;
            }
         } else if (3110 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classON.field4995 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               return 1;
            }
         } else if (3111 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int[] var47 = classBB.field323;
               int var53 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var56;
               if (classCY.method2720(classAB.field122, -1315528093)) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var56 = 1;
               } else {
                  var56 = 0;
               }

               var47[var53] = var56;
               return 1;
            }
         } else if (3112 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classCY var46 = classAB.field122;
               boolean var52;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var52 = true;
               } else {
                  var52 = false;
               }

               var46.method2721(var52, 407113132);
               return 1;
            }
         } else if (var0 == 3113) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               String var17 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classDY.field1679 -= 120041229;
               classUF.method11299(var17, (byte)-46);
               return 1;
            }
         } else if (var0 == 3114) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               String var16 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               long var27 = 0L;
               if (classQE.method9498(var16, (byte)81)) {
                  var27 = classDM.method3432(var16, 1668696346);
               }

               classJL var37 = classEF.method3849(classJS.RESUME_P_COUNTDIALOG_LONG, client.field795.field1535, (byte)74);
               var37.field3343.method12987(var27);
               client.field795.method3367(var37, -1301097035);
               return 1;
            }
         } else if (var0 == 3115) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classJL var26 = classEF.method3849(classJS.RESUME_P_OBJDIALOG, client.field795.field1535, (byte)-37);
               var26.field3343.method12973(var15, -1542382992);
               client.field795.method3367(var26, -1301097035);
               return 1;
            }
         } else if (var0 == 3116) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int var14 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field338 -= -1849233978;
               String var5 = (String)classBB.field328[1375698635 * classBB.field338];
               String var6 = (String)classBB.field328[1375698635 * classBB.field338 + 1];
               if (var5.length() > 500) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  } else {
                     return 1;
                  }
               } else if (var6.length() > 500) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  } else {
                     return 1;
                  }
               } else {
                  classJL var7 = classEF.method3849(classJS.BUG_REPORT, client.field795.field1535, (byte)-15);
                  var7.field3343.method12973(1 + classAU.method712(var5, (byte)81) + classAU.method712(var6, (byte)67), -1542382992);
                  classXY.method12997(var7.field3343, var5, (short)25320);
                  classXY.method12997(var7.field3343, var6, (short)13882);
                  var7.field3343.method13156(var14, (byte)47);
                  client.field795.method3367(var7, -1301097035);
                  return 1;
               }
            }
         } else if (3117 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               return 1;
            }
         } else if (var0 == 3118) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               client.field858 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               return 1;
            }
         } else if (var0 == 3119) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var45;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var45 = true;
               } else {
                  var45 = false;
               }

               client.field851 = var45;
               return 1;
            }
         } else if (var0 == 3120) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  client.field852 = -1165804573 * (client.field852 * -1072700981 | 1);
               } else {
                  client.field852 = (client.field852 * -1072700981 & -2) * -1165804573;
               }

               return 1;
            }
         } else if (3121 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  client.field852 = (-1072700981 * client.field852 | 2) * -1165804573;
               } else {
                  client.field852 = -1165804573 * (-1072700981 * client.field852 & -3);
               }

               return 1;
            }
         } else if (3122 == var0) {
            if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 == 1524072698) {
                  throw new IllegalStateException();
               }

               client.field852 = (-1072700981 * client.field852 | 4) * -1165804573;
            } else {
               client.field852 = (-1072700981 * client.field852 & -5) * -1165804573;
            }

            return 1;
         } else if (3123 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  client.field852 = (-1072700981 * client.field852 | 8) * -1165804573;
               } else {
                  client.field852 = (client.field852 * -1072700981 & -9) * -1165804573;
               }

               return 1;
            }
         } else if (3124 == var0) {
            client.field852 = 0;
            return 1;
         } else if (var0 == 3125) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var44;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var44 = true;
               } else {
                  var44 = false;
               }

               client.field842 = var44;
               return 1;
            }
         } else if (3126 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               client.field844 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               return 1;
            }
         } else if (var0 == 3127) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var43;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var43 = true;
               } else {
                  var43 = false;
               }

               classHH.method6056(var43, -1977909021);
               return 1;
            }
         } else if (var0 == 3128) {
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classTT.method11166(921633490) ? 1 : 0;
            return 1;
         } else if (var0 == 3129) {
            classDY.field1679 -= 240082458;
            client.field841 = classBB.field323[-324749371 * classDY.field1679] * 1702334145;
            client.field951 = classBB.field323[-324749371 * classDY.field1679 + 1] * 1847803151;
            return 1;
         } else if (var0 == 3130) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               return 1;
            }
         } else if (var0 == 3131) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               return 1;
            }
         } else if (var0 == 3132) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 773246731 * classSA.field5897;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classEU.field1938 * 8379747;
               return 1;
            }
         } else if (3133 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               return 1;
            }
         } else if (var0 == 3134) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3135 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               return 1;
            }
         } else if (3136 == var0) {
            classWK.field6691.field6615 = 2138382953;
            classWK.field6691.field6616 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 1264941915;
            return 1;
         } else if (3137 == var0) {
            classWK.field6691.field6615 = -6067130;
            classWK.field6691.field6616 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 1264941915;
            return 1;
         } else if (3138 == var0) {
            classWK.field6691.field6615 = 0;
            return 1;
         } else if (3139 == var0) {
            classWK.field6691.field6615 = 2144450083;
            return 1;
         } else if (var0 == 3140) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classWK.field6691.field6615 = 2138382953;
               int var51;
               if (var2) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var51 = classSZ.field6110.field4329 * -1163656551;
               } else {
                  var51 = -1163656551 * classDL.field1558.field4329;
               }

               classWK.field6691.field6616 = var51 * 1264941915;
               return 1;
            }
         } else if (var0 == 3141) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var13 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               classAB.field122.method2727(var13, 572945661);
               return 1;
            }
         } else if (3142 == var0) {
            int[] var42 = classBB.field323;
            int var50 = (classDY.field1679 += 120041229) * -324749371 - 1;
            byte var55;
            if (classCY.method2724(classAB.field122, (short)16636)) {
               if (var3 == 1524072698) {
                  throw new IllegalStateException();
               }

               var55 = 1;
            } else {
               var55 = 0;
            }

            var42[var50] = var55;
            return 1;
         } else if (3143 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var41;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var41 = true;
               } else {
                  var41 = false;
               }

               boolean var12 = var41;
               client.field832 = var12;
               if (!var12) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  classAB.field122.method2789("", -857736317);
               }

               return 1;
            }
         } else if (3144 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int[] var40 = classBB.field323;
               int var49 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var54;
               if (client.field832) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var54 = 1;
               } else {
                  var54 = 0;
               }

               var40[var49] = var54;
               return 1;
            }
         } else if (var0 == 3145) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3146) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               boolean var39;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var39 = true;
               } else {
                  var39 = false;
               }

               boolean var11 = var39;
               boolean var48;
               if (!var11) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var48 = true;
               } else {
                  var48 = false;
               }

               classCY.method2736(classAB.field122, var48, (byte)16);
               return 1;
            }
         } else if (3147 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = classBB.field323;
               int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (classAB.field122.method2732((byte)56)) {
                  if (var3 == 1524072698) {
                     throw new IllegalStateException();
                  }

                  var10002 = 0;
               } else {
                  var10002 = 1;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (3148 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3149 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3150) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3151 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3152 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3153) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 2017820609 * classBF.field395;
               return 1;
            }
         } else if (var0 == 3154) {
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classXW.method12952(-642883550);
            return 1;
         } else if (var0 == 3155) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= 1222866659;
               return 1;
            }
         } else if (3156 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3157 == var0) {
            classDY.field1679 -= 240082458;
            return 1;
         } else if (3158 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3159) {
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (var0 == 3160) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3161) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3162 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3163 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= 1222866659;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3164 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (var0 == 3165) {
            classDY.field1679 -= 120041229;
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (3166 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3167) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3168) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (3169 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3170 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3171) {
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (3172 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               return 1;
            }
         } else if (var0 == 3173) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3174 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               return 1;
            }
         } else if (var0 == 3175) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3176 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3177 == var0) {
            return 1;
         } else if (3178 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= 1222866659;
               return 1;
            }
         } else if (3179 == var0) {
            return 1;
         } else if (3180 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= 1222866659;
               return 1;
            }
         } else if (3181 == var0) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBY.method1359(classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)0);
               return 1;
            }
         } else if (var0 == 3182) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classBS.method1223(698658207);
               return 1;
            }
         } else if (var0 == 3185) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int var10 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classAB.field122.method2812(var10, 1566806538);
               return 1;
            }
         } else if (var0 == 3186) {
            int var9 = classAB.field122.method2817((byte)0);
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var9;
            return 1;
         } else if (var0 == 3189) {
            if (var3 == 1524072698) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classDF.method3053(var4, (byte)0);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ku.bm(" + 41);
      }
   }
}
