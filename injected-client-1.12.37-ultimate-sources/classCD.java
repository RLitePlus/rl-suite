import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cd")
public final class classCD extends classVQ {
   @ObfuscatedName("aq")
   int field672;
   @ObfuscatedName("ax")
   int field686;
   @ObfuscatedName("ab")
   int field676;
   @ObfuscatedName("ag")
   int field680;
   @ObfuscatedName("ap")
   String[] field688;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field681 = 131072;
   @ObfuscatedName("ac")
   int field677;
   @ObfuscatedName("aa")
   int field675;
   @ObfuscatedName("ao")
   int field684;
   @ObfuscatedName("as")
   int field685;
   @ObfuscatedName("aj")
   int field682;
   @ObfuscatedName("ay")
   int field673 = 0;
   @ObfuscatedName("ae")
   int field678;
   @ObfuscatedName("ad")
   int field674;
   @ObfuscatedName("af")
   int field679;
   @ObfuscatedName("al")
   int field683;
   @ToRemove(unused = "true")
   @ObfuscatedName("cg")
   static final int field687 = 89;

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("az")
   void method1411(int var1, byte var2) {
      try {
         this.field674 = var1 * 1378784235;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("ay")
   static int method1433(int var0, classBL var1, boolean var2, byte var3) {
      try {
         classLW var4;
         if (var0 >= 2000) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            int var5 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            var4 = classLY.method7375(classWK.field6691, var5, (byte)94);
         } else {
            classLW var10000;
            if (var2) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = classDL.field1558;
            }

            var4 = var10000;
         }

         if (var0 == 1100) {
            classDY.field1679 -= 240082458;
            int var42 = classBB.field323[classDY.field1679 * -324749371];
            int var50 = classBB.field323[1 + -324749371 * classDY.field1679];
            if (12 == -1510882375 * var4.field4375) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               classLH var51 = var4.method7283(-1371767503);
               if (null != var51) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var51.method6834(var42, var50, 135170137)) {
                  }
               }
            } else {
               var4.field4341 = var42 * 731382367;
               if (-34809441 * var4.field4341 > var4.field4258 * -842862191 - var4.field4249 * 1115597881) {
                  var4.field4341 = var4.field4258 * -1437415729 - 2134006567 * var4.field4249;
               }

               if (var4.field4341 * -34809441 < 0) {
                  var4.field4341 = 0;
               }

               var4.field4331 = -1148676629 * var50;
               if (var4.field4331 * -41424189 > -714521463 * var4.field4269 - var4.field4259 * 293773697) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var4.field4331 = var4.field4269 * -1471306045 - var4.field4259 * 577918571;
               }

               if (-41424189 * var4.field4331 < 0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var4.field4331 = 0;
               }
            }

            return 1;
         } else if (1101 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4270 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 1590850751;
               return 1;
            }
         } else if (var0 == 1102) {
            boolean var64;
            if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               var64 = true;
            } else {
               var64 = false;
            }

            var4.field4271 = var64;
            return 1;
         } else if (1103 == var0) {
            var4.field4347 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * -2056841747;
            return 1;
         } else if (1104 == var0) {
            var4.field4277 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 327091521;
            return 1;
         } else if (var0 == 1105) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4348 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 857041169;
               return 1;
            }
         } else if (var0 == 1106) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4351 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * -727683123;
               return 1;
            }
         } else if (1107 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var63;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var63 = true;
               } else {
                  var63 = false;
               }

               var4.field4282 = var63;
               return 1;
            }
         } else if (1108 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4333 = 656328391;
               var4.field4374 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 434741949;
               return 1;
            }
         } else if (1109 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 720247374;
               var4.field4290 = 1981476425 * classBB.field323[-324749371 * classDY.field1679];
               var4.field4291 = 1954863581 * classBB.field323[1 + -324749371 * classDY.field1679];
               var4.field4356 = 1703663435 * classBB.field323[2 + -324749371 * classDY.field1679];
               var4.field4292 = classBB.field323[3 + -324749371 * classDY.field1679] * 993003239;
               var4.field4294 = classBB.field323[-324749371 * classDY.field1679 + 4] * 863028557;
               var4.field4338 = classBB.field323[classDY.field1679 * -324749371 + 5] * 1556726191;
               return 1;
            }
         } else if (1110 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               int var41 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               if (var4.field4288 * 2114568197 != var41) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var4.field4288 = 742198477 * var41;
                  var4.field4321 = 0;
                  var4.field4327 = 0;
               }

               return 1;
            }
         } else if (var0 == 1111) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var62;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var62 = true;
               } else {
                  var62 = false;
               }

               var4.field4297 = var62;
               return 1;
            }
         } else if (1112 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               String var39 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var39 = classUP.method11420(var39, classRR.method10179(-1119970828), classBB.field334, classBB.field333, (byte)0);
               if (12 == -1510882375 * var4.field4375) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  classLH var49 = var4.method7283(-328935466);
                  if (var49 != null) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var49.method6998((byte)1)) {
                        classLH.method6804(var49, var39, 381707883);
                        return 1;
                     }
                  }

                  var4.field4301 = var39;
               } else if (!var39.equals(var4.field4301)) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var4.field4301 = var39;
               }

               return 1;
            }
         } else if (1113 == var0) {
            var4.field4245 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 590574429;
            if (-1510882375 * var4.field4375 == 12) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               classLH var38 = var4.method7283(-178449929);
               if (null != var38) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var38.method6849(-1159491061);
               }
            }

            return 1;
         } else if (var0 == 1114) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 360123687;
               if (12 == var4.field4375 * -1510882375) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  classLH var37 = var4.method7283(-823814283);
                  if (null != var37) {
                     classLH.method6840(
                        var37, classBB.field323[classDY.field1679 * -324749371], classBB.field323[1 + -324749371 * classDY.field1679], -981774839
                     );
                     var37.method6841(classBB.field323[classDY.field1679 * -324749371 + 2], 879336967);
                  }
               } else {
                  var4.field4304 = 571804797 * classBB.field323[classDY.field1679 * -324749371];
                  var4.field4305 = -2106140265 * classBB.field323[-324749371 * classDY.field1679 + 1];
                  var4.field4303 = classBB.field323[2 + classDY.field1679 * -324749371] * -763080175;
               }

               return 1;
            }
         } else if (1115 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var61;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var61 = true;
               } else {
                  var61 = false;
               }

               var4.field4306 = var61;
               return 1;
            }
         } else if (var0 == 1116) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4283 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * -1993421947;
               return 1;
            }
         } else if (var0 == 1117) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4284 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 37017731;
               return 1;
            }
         } else if (1118 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var60;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var60 = true;
               } else {
                  var60 = false;
               }

               var4.field4352 = var60;
               return 1;
            }
         } else if (var0 == 1119) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var59;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var59 = true;
               } else {
                  var59 = false;
               }

               var4.field4256 = var59;
               return 1;
            }
         } else if (1120 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               var4.field4258 = -803344527 * classBB.field323[classDY.field1679 * -324749371];
               var4.field4269 = -251301447 * classBB.field323[-324749371 * classDY.field1679 + 1];
               if (0 == var4.field4375 * -1510882375) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  classLW[] var58;
                  if (-1 == var4.field4260 * 63131743) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var58 = classWK.field6691.field4440[-1163656551 * var4.field4329 >> 16];
                  } else {
                     var58 = classLY.method7375(classWK.field6691, var4.field4342 * -1502647899, (byte)125).field4340;
                  }

                  classLW[] var36 = var58;
                  classFC.method4586(var36, var4, false, classWK.field6691, client.field823, -62120686);
               }

               return 1;
            }
         } else if (var0 == 1121) {
            classUL.method11401(-1163656551 * var4.field4329, var4.field4260 * 63131743, 1283248075);
            classVV.method12163(classWK.field6691, var4, 1200783607);
            return 1;
         } else if (var0 == 1122) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4349 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 1515656587;
               return 1;
            }
         } else if (var0 == 1123) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4295 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * -1914223631;
               return 1;
            }
         } else if (var0 == 1124) {
            var4.field4276 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 61705535;
            return 1;
         } else if (var0 == 1125) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               int var35 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classYE var48 = (classYE)classOF.method8404(classCX.method2696(751400922), var35, 474920566);
               if (var48 != null) {
                  var4.field4307 = var48;
               }

               return 1;
            }
         } else if (var0 == 1126) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var57;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var57 = true;
               } else {
                  var57 = false;
               }

               boolean var34 = var57;
               var4.field4278 = var34;
               return 1;
            }
         } else if (1127 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var56;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var56 = true;
               } else {
                  var56 = false;
               }

               boolean var33 = var56;
               var4.field4298 = var33;
               return 1;
            }
         } else if (var0 == 1129) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.field4339 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               return 1;
            }
         } else if (var0 == 1130) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.method7232((String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], "", classAV.field294, classBF.method1041(-1013173859));
               return 1;
            }
         } else if (1131 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               var4.method7241(classBB.field323[classDY.field1679 * -324749371], classBB.field323[classDY.field1679 * -324749371 + 1], -1844055709);
               return 1;
            }
         } else if (1132 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classLW.method7243(
                  var4,
                  (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635],
                  classBB.field323[(classDY.field1679 -= 120041229) * -324749371],
                  (byte)61
               );
               return 1;
            }
         } else if (1133 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLI var32 = classLW.method7285(var4, 1601124651);
               if (var32 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var32.field4172 = 1594234983 * classBB.field323[classDY.field1679 * -324749371];
               }

               return 1;
            }
         } else if (1134 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLI var31 = classLW.method7285(var4, 553208368);
               if (null != var31) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var31.field4170 = classBB.field323[classDY.field1679 * -324749371] * 27298427;
               }

               return 1;
            }
         } else if (var0 == 1135) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= 1222866659;
               classLH var30 = var4.method7283(-1044537720);
               if (var30 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  String var46 = (String)classBB.field328[classBB.field338 * 1375698635];
                  var46 = classUP.method11420(var46, classRR.method10179(-518504381), classBB.field334, classBB.field333, (byte)0);
                  var4.field4302 = var46;
               }

               return 1;
            }
         } else if (var0 == 1136) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLI var29 = classLW.method7285(var4, 1538856326);
               if (null != var29) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var29.field4169 = classBB.field323[classDY.field1679 * -324749371] * 798448585;
               }

               return 1;
            }
         } else if (1137 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLH var28 = var4.method7283(-2005700341);
               if (var28 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var28.method6820(classBB.field323[classDY.field1679 * -324749371], -133076799) && var3 != 0) {
                     throw new IllegalStateException();
                  }
               }

               return 1;
            }
         } else if (1138 == var0) {
            classDY.field1679 -= 120041229;
            classLH var27 = var4.method7283(-392838421);
            if (var27 != null) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               if (var27.method6827(classBB.field323[-324749371 * classDY.field1679], (byte)1)) {
               }
            }

            return 1;
         } else if (1139 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLH var26 = var4.method7283(-729594808);
               if (null != var26) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (classLH.method6832(var26, classBB.field323[classDY.field1679 * -324749371], (byte)-35)) {
                  }
               }

               return 1;
            }
         } else if (1140 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var55;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var55 = true;
               } else {
                  var55 = false;
               }

               boolean var25 = var55;
               client.field908.method4582((byte)26);
               classLH var45 = var4.method7283(-1108914295);
               if (var45 != null && var45.method6798(var25, 1451056731)) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var25) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     client.field908.method4576(var4, (byte)-56);
                  }
               }

               return 1;
            }
         } else if (1141 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var54;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var54 = true;
               } else {
                  var54 = false;
               }

               boolean var24 = var54;
               if (!var24) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (client.field908.method4571(2041398062) == var4) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     client.field908.method4582((byte)47);
                  }
               }

               classLH var44 = var4.method7283(-29116185);
               if (null != var44) {
                  classLH.method6800(var44, var24, -701629532);
               }

               return 1;
            }
         } else if (1142 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classLH var23 = var4.method7283(-1957811422);
               if (null != var23) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (classLH.method6882(
                        var23, classBB.field323[classDY.field1679 * -324749371], classBB.field323[classDY.field1679 * -324749371 + 1], 1122842785
                     )
                     && var3 != 0) {
                     throw new IllegalStateException();
                  }
               }

               return 1;
            }
         } else if (1143 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLH var22 = var4.method7283(-118543802);
               if (var22 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (classLH.method6882(var22, classBB.field323[classDY.field1679 * -324749371], classBB.field323[classDY.field1679 * -324749371], 1122842785)
                     && var3 != 0) {
                     throw new IllegalStateException();
                  }
               }

               return 1;
            }
         } else if (1144 == var0) {
            classDY.field1679 -= 120041229;
            classLH var21 = var4.method7283(-1531097886);
            if (null != var21) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               classLH.method7031(var21, classBB.field323[-324749371 * classDY.field1679], (short)248);
            }

            return 1;
         } else if (1145 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLH var20 = var4.method7283(-529353642);
               if (var20 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var20.method7020(classBB.field323[-324749371 * classDY.field1679], (byte)0);
               }

               return 1;
            }
         } else if (var0 == 1146) {
            classDY.field1679 -= 120041229;
            classLH var19 = var4.method7283(-763924149);
            if (var19 != null) {
               var19.method6845(classBB.field323[classDY.field1679 * -324749371], 1201353478);
            }

            return 1;
         } else if (1147 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               classLH var18 = var4.method7283(-1119143627);
               if (null != var18) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  classLH.method7043(var18, classBB.field323[-324749371 * classDY.field1679], 2117141590);
               }

               return 1;
            }
         } else if (1148 == var0) {
            classDY.field1679 -= 240082458;
            classTT var17 = classLW.method7287(var4, 1289741507);
            if (var17 != null) {
               var17.method11132(classBB.field323[classDY.field1679 * -324749371], classBB.field323[-324749371 * classDY.field1679 + 1], 1658283540);
            }

            return 1;
         } else if (var0 == 1149) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classTT var16 = classLW.method7287(var4, 1289741507);
               if (null != var16) {
                  var16.method11136((char)classBB.field323[classDY.field1679 * -324749371], classBB.field323[1 + -324749371 * classDY.field1679], (byte)67);
               }

               return 1;
            }
         } else if (1150 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               var4.method7236((String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], classAV.field294, -413942015);
               return 1;
            }
         } else if (1151 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -626367319;
               String var15 = (String)classBB.field328[1375698635 * classBB.field338];
               String var43 = (String)classBB.field328[1 + classBB.field338 * 1375698635];
               String var7 = (String)classBB.field328[1375698635 * classBB.field338 + 2];
               long var8 = classBF.method1041(1371349330);
               long var10 = classKN.method6498(1249938208);
               String var12 = classAW.method723(classEA.method3798(-1455188761), classEA.method3798(1494413329).field6573 * 857134555, 1878865176);
               if (var8 != -1L) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var15 = var15.replaceAll("%userid%", Long.toString(var8));
               }

               if (var10 != -1L) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var15 = var15.replaceAll("%userhash%", Long.toString(var10));
               }

               if (!var12.isEmpty()) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var15 = var15.replaceAll("%deviceid%", var12);
               }

               classLW.method7233(var4, var15, var43, var7, var12, Long.toString(var10), classAV.field294, -1916406987);
               return 1;
            }
         } else if (1152 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else if (-1510882375 * var4.field4375 == 11) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var52;
                  label833: {
                     classMA var14 = var4.method7270(-1626603432);
                     if (var14 != null) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        if (classMA.method7444(var14, (byte)0)) {
                           if (var3 != 0) {
                              throw new IllegalStateException();
                           }

                           if (classMU.method7722(classHS.method6101(-1634436868), var14.method7478(-498465286), 337515225)) {
                              if (var3 != 0) {
                                 throw new IllegalStateException();
                              }

                              var52 = true;
                              break label833;
                           }
                        }
                     }

                     var52 = false;
                  }

                  boolean var6 = var52;
                  int[] var53 = classBB.field323;
                  int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
                  byte var10002;
                  if (var6) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var53[var10001] = var10002;
                  return 1;
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "cd.ay(" + 41);
      }
   }

   classCD() {
      this.field672 = 22663797;
      this.field674 = -207361675;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ab")
   boolean method1416(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -427441494) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 >= -427441494) {
                  throw new IllegalStateException();
               }

               return 0 != (-1371603773 * this.field674 & 1 << var1);
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method1412(int var1) {
      this.field674 = var1 * 1378784235;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcd;I)Ljava/lang/String;")
   @ObfuscatedName("pr")
   public static String method1424(classCD var0, int var1) {
      return var0.field688 != null && var1 >= 0 && var1 < var0.field688.length ? var0.field688[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method1413(int var1) {
      this.field674 = var1 * 761005750;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("yq")
   public String method1434(int var1) {
      return this.method1425(var1, -1148961647);
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ac")
   void method1414(String[] var1) {
      this.field688 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   boolean method1417(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-1995553998 * this.field674 & 1 << var1) : true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;I)V")
   @ObfuscatedName("ps")
   public static void method1432(classCY var0, int var1) {
      if (var0 == null) {
         var0.method2839(var1);
      } else {
         var0.field1345 = var1 * -2139190381;
         classMW.method7732(1041414693);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcd;II)Z")
   @ObfuscatedName("ln")
   public static boolean method1420(classCD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method1423(var1, var1);
      }

      try {
         if (var0.field688 != null && var1 >= 0) {
            if (var2 <= -839788185) {
               throw new IllegalStateException();
            }

            if (var1 < var0.field688.length && var0.field688[var1] != null) {
               if (var2 <= -839788185) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   boolean method1418(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-1371603773 * this.field674 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   boolean method1419(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-1371603773 * this.field674 & 1 << var1) : true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;)I")
   @ObfuscatedName("od")
   public static int method1429(classWC var0) {
      return var0.field6660 != null ? var0.field6660.method544() : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method1421(int var1) {
      return this.field688 != null && var1 >= 0 && var1 < this.field688.length && this.field688[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;I)V")
   @ObfuscatedName("af")
   void method1415(String[] var1, int var2) {
      try {
         this.field688 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;Lul;)V")
   @ObfuscatedName("vu")
   public static void method1435(classUL var0, classUL var1) {
      if (var0 == null) {
         var0.method11395();
      }

      var0.method11390(var1, 1591236864);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fz")
   public int method1436() {
      return this.field672 * -356773341;
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ag")
   String method1425(int var1, int var2) {
      try {
         if (this.field688 != null) {
            if (var2 == -209761696) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 == -209761696) {
                  throw new IllegalStateException();
               }

               if (var1 < this.field688.length) {
                  if (var2 == -209761696) {
                     throw new IllegalStateException();
                  }

                  return this.field688[var1];
               }
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ap")
   String method1426(int var1) {
      return this.field688 != null && var1 >= 0 && var1 < this.field688.length ? this.field688[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("tc")
   public void method1437(int var1) {
      this.field673 = var1 * 1512991639;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   String method1427(int var1) {
      return this.field688 != null && var1 >= 0 && var1 < this.field688.length ? this.field688[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   public boolean method1438(int var1) {
      return this.method1416(var1, -2035539133);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ar")
   String method1428(int var1) {
      return this.field688 != null && var1 >= 0 && var1 < this.field688.length ? this.field688[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
   @ObfuscatedName("ab")
   static Class method1431(String var0, byte var1) throws ClassNotFoundException {
      try {
         if (var0.equals("B")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return byte.class;
            }
         } else if (var0.equals("I")) {
            return int.class;
         } else if (var0.equals("S")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return short.class;
            }
         } else if (var0.equals("J")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return long.class;
            }
         } else if (var0.equals("Z")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return boolean.class;
            }
         } else if (var0.equals("F")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return float.class;
            }
         } else if (var0.equals("D")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return double.class;
            }
         } else if (var0.equals("C")) {
            if (var1 == 63) {
               throw new IllegalStateException();
            } else {
               return char.class;
            }
         } else {
            return var0.equals("void") ? void.class : Class.forName(var0);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IILvv;Lqn;I)V")
   @ObfuscatedName("as")
   public static void method1430(classLW var0, int var1, int var2, classVV var3, classQN var4, int var5) {
      try {
         classLW var10000;
         if (-1502647899 * var0.field4342 == -1) {
            if (var5 >= 1362128893) {
               throw new IllegalStateException();
            }

            var10000 = null;
         } else {
            var10000 = classLY.method7378(var3, var0.field4342 * -1502647899, 653784551 * var0.field4263, (byte)-81);
         }

         classLW var8 = var10000;
         int var6;
         int var7;
         if (null == var8) {
            var6 = var1;
            var7 = var2;
         } else {
            var6 = 1115597881 * var8.field4249;
            var7 = 293773697 * var8.field4259;
         }

         classPF.method8855(var0, var6, var7, false, var3, var4, (short)24336);
         classMP.method7637(var0, var6, var7, (short)3711);
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "cd.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)I")
   @ObfuscatedName("af")
   public static int method1410(int var0, short var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cd.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   boolean method1422(int var1) {
      return this.field688 != null && var1 >= 0 && var1 < this.field688.length && this.field688[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   boolean method1423(int var1, int var2) {
      try {
         if (this.field688 != null && var1 >= 0) {
            if (var2 <= -839788185) {
               throw new IllegalStateException();
            }

            if (var1 < this.field688.length && this.field688[var1] != null) {
               if (var2 <= -839788185) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cd.ab(" + ')');
      }
   }
}
