import java.awt.Rectangle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gp")
public class classGP {
   @ObfuscatedName("rk")
   public static List field2644 = new ArrayList();
   @ObfuscatedSignature(descriptor = "Ljx;")
   @ObfuscatedName("af")
   final classJX field2634;
   @ObfuscatedSignature(descriptor = "Ljv;")
   @ObfuscatedName("ae")
   final classJV field2639;
   @ObfuscatedSignature(descriptor = "Ljt;")
   @ObfuscatedName("ab")
   final classJT field2637;
   @ObfuscatedSignature(descriptor = "Lga;")
   @ObfuscatedName("ax")
   final classGA field2640 = new classGA();
   @ObfuscatedSignature(descriptor = "Lgz;")
   @ObfuscatedName("as")
   final classGZ field2641;
   @ObfuscatedName("br")
   public static List field2643 = new ArrayList();
   @ObfuscatedName("al")
   int field2646;
   @ObfuscatedName("aj")
   int field2635 = 1498649735;
   @ObfuscatedName("ac")
   int field2636 = -1013110651;
   @ObfuscatedName("in")
   public static int field2650;
   @ObfuscatedSignature(descriptor = "[Llw;")
   @ObfuscatedName("ao")
   classLW[] field2651;
   @ObfuscatedName("aa")
   int field2645;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2647 = 1076101390;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2648 = 5063219;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field2649 = 73;
   @ObfuscatedSignature(descriptor = "Lgo;")
   @ObfuscatedName("ag")
   final classGO field2638;

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("av")
   void method5561(classLW var1, int var2) {
      int var3 = var1.field4334 * -90794217;
      if (var3 == -318425325) {
         if (1542917833 * this.field2635 == -1) {
            this.field2635 = var1.field4348 * 1013652457;
            this.field2636 = var1.field4349 * 261153745;
         }

         if (this.field2639.vmethod178(-982871142) == 1) {
            var1.field4348 = -2137944143 * this.field2635;
         } else {
            var1.field4348 = this.field2636 * 1718596635;
         }
      } else if (var3 == -1582829748) {
         if (-1 == 419342058 * this.field2635) {
            this.field2635 = -2072594371 * var1.field4348;
            this.field2636 = 261153745 * var1.field4349;
         }

         if (this.field2639.vmethod178(-1178403926) == 1) {
            var1.field4348 = 575002083 * this.field2636;
         } else {
            var1.field4348 = -1309316007 * this.field2635;
         }
      } else if (var3 == 721226762) {
         var1.field4356 = 1656612962;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 993003239;
         var1.field4333 = -1013325341;
         var1.field4374 = 0;
      } else if (var3 == -267225782) {
         var1.field4356 = 2146444786;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 993003239;
         var1.field4333 = -1013325341;
         var1.field4374 = 641350865;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;[Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("zu")
   public static void method5556(
      classGP var0,
      classLW[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      classVV var12,
      int var13
   ) {
      if (var0 == null) {
         var0.method5550(var2, var2, var12, var2, var2);
      }

      classYW.method13671(var6, var7, var8, var9);
      classFH.method4740();

      for (int var14 = var2; var14 <= var3; var14++) {
         classLW var15 = var1[var14];
         if (null != var15
            && (
               -1502647899 * var15.field4342 == var4 && var15.field4263 * 653784551 == var5
                  || var4 == -1412584499 && var15 == classVV.method12152(var12, (byte)-104)
            )
            && (!var15.field4275 || !var12.method12119(var15, (byte)0))) {
            if (-90794217 * var15.field4334 > 0) {
               var0.method5562(var15, var13, (byte)122);
            }

            int var16 = var10 + 744286069 * var15.field4281;
            int var17 = var11 + 1570844829 * var15.field4257;
            int var18 = 1517457381 * var15.field4347;
            if (classVV.method12152(var12, (byte)-67) == var15) {
               classVW var19 = var12.method12150((byte)0);
               if (var4 != -1412584499 && !var15.field4314) {
                  var0.field2651 = var1;
                  var0.field2645 = -100057729 * var10;
                  var0.field2646 = 5465987 * var11;
                  continue;
               }

               if (var19.method12253((short)15505) && var19.method12258(-1340309653)) {
                  int var20 = var19.method12235(-92209757);
                  int var21 = classVW.method12241(var19, (byte)5);
                  int var22 = var19.method12215(-117260710).field4249 * 1115597881;
                  int var23 = var19.method12215(124016499).field4259 * 293773697;
                  int var24 = classTZ.field6255 * -38255113;
                  int var25 = classTZ.field6264 * -2144333897;
                  var24 -= var19.method12224((byte)109);
                  var25 -= classVW.method12226(var19, (byte)-120);
                  if (var24 < var20) {
                     var24 = var20;
                  }

                  if (1115597881 * var15.field4249 + var24 > var22 + var20) {
                     var24 = var22 + var20 - 1115597881 * var15.field4249;
                  }

                  if (var25 < var21) {
                     var25 = var21;
                  }

                  if (var25 + var15.field4259 * 293773697 > var21 + var23) {
                     var25 = var21 + var23 - var15.field4259 * 293773697;
                  }

                  var16 = var24;
                  var17 = var25;
               }

               if (!var15.field4314) {
                  var18 = 128;
               }
            }

            int var33;
            int var34;
            int var35;
            int var36;
            if (9 == -1510882375 * var15.field4375) {
               int var37 = var16;
               int var49 = var17;
               int var59 = var16 + var15.field4249 * 1115597881;
               int var26 = var15.field4259 * 293773697 + var17;
               if (var59 < var16) {
                  var37 = var59;
                  var59 = var16;
               }

               if (var26 < var17) {
                  var49 = var26;
                  var26 = var17;
               }

               var59++;
               var26++;
               var33 = var37 > var6 ? var37 : var6;
               var34 = var49 > var7 ? var49 : var7;
               var35 = var59 < var8 ? var59 : var8;
               var36 = var26 < var9 ? var26 : var9;
            } else {
               int var38 = var15.field4249 * 1115597881 + var16;
               int var50 = var17 + var15.field4259 * 293773697;
               var33 = var16 > var6 ? var16 : var6;
               var34 = var17 > var7 ? var17 : var7;
               var35 = var38 < var8 ? var38 : var8;
               var36 = var50 < var9 ? var50 : var9;
            }

            if (!var15.field4275 || var33 < var35 && var34 < var36) {
               if (0 != -90794217 * var15.field4334) {
                  if (1336 == var15.field4334 * -90794217) {
                     var0.method5569(var16, var17, 1115597881 * var15.field4249, 825915897);
                     continue;
                  }

                  if (1337 == var15.field4334 * -90794217) {
                     var0.field2641.vmethod281(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, -1172287256);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1338 == -90794217 * var15.field4334) {
                     var0.field2641.vmethod298(var15, var16, var17, (short)-25715);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1339 == var15.field4334 * -90794217) {
                     var0.method5565(var15, var16, var17, var12, (byte)2);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1400 == var15.field4334 * -90794217) {
                     var0.field2641
                        .vmethod285(
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           293773697 * var15.field4259,
                           var13,
                           var0.field2634.vmethod89(797563684).method2757(-1674478907)
                        );
                  }

                  if (1401 == var15.field4334 * -90794217) {
                     var0.field2641.vmethod291(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, 1090011500);
                  }

                  if (var15.field4334 * -90794217 == 1402) {
                     var0.field2641.vmethod296(var16, var13, -309695139);
                  }
               }

               if (0 == -1510882375 * var15.field4375) {
                  if (!var15.field4275 && var12.method12119(var15, (byte)0) && !var12.method12112(2064171573).method11927(var15, (byte)56)) {
                     continue;
                  }

                  if (!var15.field4275) {
                     if (var15.field4331 * -41424189 > var15.field4269 * -714521463 - 293773697 * var15.field4259) {
                        var15.field4331 = var15.field4269 * -1471306045 - var15.field4259 * 577918571;
                     }

                     if (var15.field4331 * -41424189 < 0) {
                        var15.field4331 = 0;
                     }
                  }

                  var0.method5560(
                     var1,
                     var15.field4265 * -1210177335,
                     var15.field4266 * 379541057,
                     -1163656551 * var15.field4329,
                     var15.field4260 * 63131743,
                     var33,
                     var34,
                     var35,
                     var36,
                     var16 - var15.field4341 * -34809441,
                     var17 - var15.field4331 * -41424189,
                     var12,
                     var13,
                     1690058415
                  );
                  if (var15.field4340 != null) {
                     var0.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        -1163656551 * var15.field4329,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - var15.field4341 * -34809441,
                        var17 - -41424189 * var15.field4331,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  if (-1 == var15.field4260 * 63131743) {
                     classPK var39 = (classPK)var12.field6613.method13363(var15.field4329 * -1163656551);
                     if (null != var39) {
                        method5553(var0, var39.field5276 * 2023647411, var33, var34, var35, var36, var16, var17, var12, var13, 545645039);
                     }
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               } else if (11 == -1510882375 * var15.field4375) {
                  if (var12.method12119(var15, (byte)0) && !var12.method12112(942535804).method11927(var15, (byte)100)) {
                     continue;
                  }

                  if (null != var15.field4340) {
                     var0.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        var15.field4329 * -1163656551,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - -34809441 * var15.field4341,
                        var17 - var15.field4331 * -41424189,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               }

               if (var15.field4375 * -1510882375 == 0 && !var15.field4275 && var15.field4269 * -714521463 > 293773697 * var15.field4259) {
                  method5573(
                     var0,
                     var16 + 1115597881 * var15.field4249,
                     var17,
                     -41424189 * var15.field4331,
                     293773697 * var15.field4259,
                     -714521463 * var15.field4269,
                     (byte)-1
                  );
               }

               if (var15.field4375 * -1510882375 != 1) {
                  if (-1510882375 * var15.field4375 == 3) {
                     int var47;
                     if (var0.method5579(var15, (byte)72)) {
                        var47 = var15.field4295 * 948260113;
                        if (var12.method12112(224915379).method11927(var15, (byte)84) && 0 != var15.field4273 * 1396903265) {
                           var47 = var15.field4273 * 1396903265;
                        }
                     } else {
                        var47 = 1740831551 * var15.field4270;
                        if (var12.method12112(-67540092).method11927(var15, (byte)44) && 318120869 * var15.field4272 != 0) {
                           var47 = 318120869 * var15.field4272;
                        }
                     }

                     if (var15.field4271) {
                        switch (1768204099 * var15.field4307.field6976) {
                           case 1:
                              classYW.method13699(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 1740831551 * var15.field4270,
                                 var15.field4295 * 948260113
                              );
                              break;
                           case 2:
                              classYW.method13765(
                                 var16,
                                 var17,
                                 var15.field4249 * 1115597881,
                                 293773697 * var15.field4259,
                                 var15.field4270 * 1740831551,
                                 var15.field4295 * 948260113,
                                 255 - (var15.field4347 * 1517457381 & 0xFF),
                                 255 - (var15.field4276 * 1991172799 & 0xFF)
                              );
                              break;
                           default:
                              if (var18 == 0) {
                                 classYW.method13698(var16, var17, var15.field4249 * 1115597881, 293773697 * var15.field4259, var47);
                              } else {
                                 classYW.method13694(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, var47, 256 - (var18 & 0xFF));
                              }
                        }
                     } else if (0 == var18) {
                        classYW.method13707(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697, var47);
                     } else {
                        classYW.method13711(var16, var17, var15.field4249 * 1115597881, var15.field4259 * 293773697, var47, 256 - (var18 & 0xFF));
                     }
                  } else if (4 == var15.field4375 * -1510882375) {
                     classZV var46 = var15.method7199(var12, (byte)-76);
                     if (var46 != null) {
                        String var67 = var15.field4301;
                        int var57;
                        if (var0.method5579(var15, (byte)-54)) {
                           var57 = 948260113 * var15.field4295;
                           if (var12.method12112(277717963).method11927(var15, (byte)83) && var15.field4273 * 1396903265 != 0) {
                              var57 = var15.field4273 * 1396903265;
                           }

                           if (!var15.field4302.isEmpty()) {
                              var67 = var15.field4302;
                           }
                        } else {
                           var57 = 1740831551 * var15.field4270;
                           if (var12.method12112(191497182).method11927(var15, (byte)89) && 0 != var15.field4272 * 318120869) {
                              var57 = 318120869 * var15.field4272;
                           }
                        }

                        if (var15.field4275 && var15.field4319 * 2073671441 != -1) {
                           classOP var75 = classOB.method8299(2073671441 * var15.field4319, (byte)34);
                           var67 = classOP.method8704(var75, 1248604557);
                           if (var67 == null) {
                              var67 = classKK.field3615;
                           }

                           if ((1633663665 * var75.field5055 == 1 || var15.field4344 * 1190987649 != 1) && -1 != var15.field4344 * 1190987649) {
                              var67 = classQY.method9847(16748608, (byte)49)
                                 + var67
                                 + classDO.field1594
                                 + " "
                                 + 'x'
                                 + classSX.method10713(var15.field4344 * 1190987649, -268294114);
                           }
                        }

                        if (var12.method12170(var15, (byte)-86)) {
                           var67 = classKK.field3783;
                           var57 = var15.field4270 * 1740831551;
                        }

                        if (!var15.field4275) {
                           var67 = var0.method5575(var67, var15, 2036642790);
                        }

                        classAAA.method70(
                           var46,
                           var67,
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           var15.field4259 * 293773697,
                           var57,
                           var15.field4306 ? 0 : -1,
                           classGK.method5483(var15.field4347 * 1517457381, -1312142721),
                           var15.field4304 * 1409141973,
                           -338086361 * var15.field4305,
                           704962289 * var15.field4303
                        );
                     }
                  } else if (-1510882375 * var15.field4375 == 5) {
                     if (!var15.field4275) {
                        classYM var45 = var15.method7319(var12, var0.method5579(var15, (byte)-72), var0.field2634.vmethod78((byte)-67), -304707674);
                        if (null != var45) {
                           classYM.method13511(var45, var16, var17);
                        }
                     } else {
                        classYM var44;
                        if (-1 != 2073671441 * var15.field4319) {
                           var44 = classLJ.method7114(
                              2073671441 * var15.field4319,
                              var15.field4344 * 1190987649,
                              var15.field4283 * -2011859635,
                              880555563 * var15.field4284,
                              -278245589 * var15.field4299,
                              false,
                              Math.max(36, var15.field4249 * 1115597881),
                              Math.max(32, 293773697 * var15.field4259),
                              1683831829
                           );
                        } else {
                           var44 = var15.method7319(var12, false, var0.field2634.vmethod78((byte)29), -604027302);
                        }

                        if (null != var44) {
                           int var56 = var44.field7006;
                           int var66 = var44.field7008;
                           if (!var15.field4282) {
                              int var74 = -356282368 * var15.field4249 / var56;
                              if (var15.field4351 * 142218501 != 0) {
                                 var44.method13553(
                                    var16 + 1115597881 * var15.field4249 / 2, var17 + var15.field4259 * 293773697 / 2, var15.field4351 * 142218501, var74
                                 );
                              } else if (0 != var18) {
                                 var44.method13524(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, 256 - (var18 & 0xFF));
                              } else if (var56 == var15.field4249 * 1115597881 && 293773697 * var15.field4259 == var66) {
                                 classYM.method13511(var44, var16, var17);
                              } else {
                                 var44.method13517(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697);
                              }
                           } else {
                              classYW.method13674(var16, var17, var16 + var15.field4249 * 1115597881, var17 + 293773697 * var15.field4259);
                              int var73 = (1115597881 * var15.field4249 + (var56 - 1)) / var56;
                              int var81 = (var66 - 1 + var15.field4259 * 293773697) / var66;

                              for (int var84 = 0; var84 < var73; var84++) {
                                 for (int var87 = 0; var87 < var81; var87++) {
                                    if (0 != var15.field4351 * 142218501) {
                                       var44.method13553(
                                          var56 / 2 + var84 * var56 + var16, var66 * var87 + var17 + var66 / 2, 142218501 * var15.field4351, 4096
                                       );
                                    } else if (var18 != 0) {
                                       classYM.method13523(var44, var84 * var56 + var16, var17 + var87 * var66, 256 - (var18 & 0xFF));
                                    } else {
                                       classYM.method13511(var44, var84 * var56 + var16, var17 + var66 * var87);
                                    }
                                 }
                              }

                              classYW.method13671(var6, var7, var8, var9);
                           }
                        }
                     }
                  } else if (6 == -1510882375 * var15.field4375) {
                     classOU var43 = null;
                     int var55 = -1;
                     boolean var65 = var0.method5579(var15, (byte)-67);
                     int var72;
                     if (var65) {
                        var72 = 821151237 * var15.field4293;
                     } else {
                        var72 = 2114568197 * var15.field4288;
                     }

                     if (-1 != var72) {
                        var43 = classQA.method9430(var72, -1327675644);
                        var55 = -814893963 * var15.field4321;
                     }

                     classFX var79 = null;
                     int var83 = 0;
                     if (2073671441 * var15.field4319 != -1) {
                        var79 = var0.field2638.vmethod115(var15, (byte)-50);
                        if (var79 != null) {
                           var79.method5230();
                           var83 = var79.field1743 * -1256242689 / 2;
                        }
                     } else if (5 == var15.field4333 * -910601) {
                        var79 = var0.field2638.vmethod119(var15, (byte)4);
                     } else if (var15.field4333 * -910601 == 7) {
                        var79 = var0.field2638.vmethod122(var15, (byte)62);
                     } else if (8 == var15.field4333 * -910601) {
                        var79 = var0.field2638.vmethod127(var15, var43, var55, (byte)14);
                     } else if (9 == var15.field4333 * -910601) {
                        var79 = var0.field2638.vmethod129(var15, var43, var55, (byte)43);
                     } else if (6 == var15.field4333 * -910601) {
                        var79 = var0.field2638.vmethod133(var15, var43, var55, var65, -837018650);
                     } else if (var15.field4333 * -910601 == 2) {
                        var79 = var0.field2638.vmethod139(var15, var43, var55, var65, -1595185582);
                     } else {
                        var79 = var0.field2638.vmethod140(var15, var43, var55, var65, (byte)21);
                     }

                     classFH.method4756(1115597881 * var15.field4249 / 2 + var16, 293773697 * var15.field4259 / 2 + var17);
                     int var86 = classFH.field2253[-1246332317 * var15.field4356] * var15.field4338 * 245118287 >> 16;
                     int var89 = var15.field4338 * 245118287 * classFH.field2254[var15.field4356 * -1246332317] >> 16;
                     if (null != var79) {
                        classFH.method4684(false);
                        if (!var15.field4275) {
                           var79.method5250(0, -1008620329 * var15.field4292, 0, var15.field4356 * -1246332317, 0, var86, var89);
                        } else {
                           var79.method5230();
                           if (var15.field4297) {
                              var79.method5161(
                                 0,
                                 var15.field4292 * -1008620329,
                                 827587461 * var15.field4294,
                                 var15.field4356 * -1246332317,
                                 var15.field4290 * -1469553671,
                                 var86 + var83 + var15.field4291 * -30521739,
                                 var15.field4291 * -30521739 + var89,
                                 var15.field4338 * 245118287
                              );
                           } else {
                              var79.method5250(
                                 0,
                                 -1008620329 * var15.field4292,
                                 827587461 * var15.field4294,
                                 -1246332317 * var15.field4356,
                                 var15.field4290 * -1469553671,
                                 var83 + var86 + -30521739 * var15.field4291,
                                 var89 + var15.field4291 * -30521739
                              );
                           }
                        }
                     }

                     classFH.method4754();
                  } else if (-1510882375 * var15.field4375 == 8) {
                     if (var12.method12112(131338097).method11932(var15, (byte)93)) {
                        classZV var42 = var0.field2637.vmethod105(classXJ.field6878, -725461430);
                        int var53 = 0;
                        int var63 = 0;
                        classZV var71 = var42;
                        String var27 = var15.field4301;

                        for (String var76 = var0.method5575(var27, var15, 1988596906); !var76.isEmpty(); var63 += var71.field8 + 1) {
                           int var29 = var76.indexOf(classDO.field1588);
                           String var28;
                           if (-1 != var29) {
                              var28 = var76.substring(0, var29);
                              var76 = var76.substring(var29 + 4);
                           } else {
                              var28 = var76;
                              var76 = "";
                           }

                           int var30 = var71.method36(var28);
                           if (var30 > var53) {
                              var53 = var30;
                           }
                        }

                        var53 += 6;
                        var63 += 7;
                        int var85 = var16 + 1115597881 * var15.field4249 - 5 - var53;
                        int var88 = 5 + var15.field4259 * 293773697 + var17;
                        if (var85 < 5 + var16) {
                           var85 = 5 + var16;
                        }

                        if (var85 + var53 > var8) {
                           var85 = var8 - var53;
                        }

                        if (var88 + var63 > var9) {
                           var88 = var9 - var63;
                        }

                        classYW.method13698(var85, var88, var53, var63, 16777120);
                        classYW.method13707(var85, var88, var53, var63, 0);
                        var27 = var15.field4301;
                        int var31 = 2 + var88 + var71.field8;

                        for (String var78 = var0.method5575(var27, var15, 1802283647); !var78.isEmpty(); var31 += 1 + var71.field8) {
                           int var32 = var78.indexOf(classDO.field1588);
                           String var82;
                           if (-1 != var32) {
                              var82 = var78.substring(0, var32);
                              var78 = var78.substring(4 + var32);
                           } else {
                              var82 = var78;
                              var78 = "";
                           }

                           var71.method56(var82, 3 + var85, var31, 0, -1);
                        }
                     }
                  } else if (9 == -1510882375 * var15.field4375) {
                     int var41;
                     int var52;
                     int var62;
                     int var70;
                     if (var15.field4278) {
                        var41 = var16;
                        var52 = var15.field4259 * 293773697 + var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var17;
                     } else {
                        var41 = var16;
                        var52 = var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var15.field4259 * 293773697 + var17;
                     }

                     if (var15.field4277 * 845712065 == 1) {
                        classYW.method13732(var41, var52, var62, var70, 1740831551 * var15.field4270);
                     } else {
                        classYW.method13745(var41, var52, var62, var70, 845712065 * var15.field4277, var15.field4270 * 1740831551);
                     }
                  } else if (-1510882375 * var15.field4375 == 12) {
                     classLH var40 = var15.method7283(-996162157);
                     classLI var51 = classLW.method7285(var15, 565240322);
                     if (var40 != null && var51 != null && var40.method6998((byte)-29)) {
                        classZV var61 = var15.method7199(var12, (byte)11);
                        if (null != var61) {
                           var0.field2640
                              .method5281(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 var40.method7001(1819415552),
                                 classLH.method7003(var40, 1252681617),
                                 var40.method6994((byte)-7),
                                 var40.method6995(1509379795),
                                 var40.method6989((byte)3),
                                 395641138
                              );
                           int var69 = var15.field4306 ? var15.field4284 * 880555563 : -1;
                           if (!var40.method6982(1494528679) && var40.method6970(-243119125).method13845(-1062272653)) {
                              classGA.method5284(
                                 var0.field2640, var51.field4169 * 201043577, var69, -211319977 * var51.field4172, var51.field4170 * 1532740787, 1181372109
                              );
                              var0.field2640.method5287(classLH.method6973(var40, -549869436), var61, 120041229);
                           } else {
                              classGA.method5284(
                                 var0.field2640, 1740831551 * var15.field4270, var69, var51.field4172 * -211319977, 1532740787 * var51.field4170, -121025944
                              );
                              var0.field2640.method5287(var40.method6970(1667101354), var61, 120041229);
                           }

                           classYW.method13671(var6, var7, var8, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("br")
   static String method5577(int var0) {
      String var1 = Integer.toString(var0);

      for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + classDO.field1592 + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " "
            + classQY.method9847(65408, (byte)66)
            + var1.substring(0, var1.length() - 8)
            + classKK.field3829
            + " "
            + classDO.field1593
            + var1
            + classDO.field1591
            + classDO.field1594;
      } else {
         return var1.length() > 6
            ? " "
               + classQY.method9847(16777215, (byte)75)
               + var1.substring(0, var1.length() - 4)
               + classKK.field3657
               + " "
               + classDO.field1593
               + var1
               + classDO.field1591
               + classDO.field1594
            : " " + classQY.method9847(16776960, (byte)119) + var1 + classDO.field1594;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;III)V")
   @ObfuscatedName("tx")
   public static void method5568(classGP var0, int var1, int var2, int var3) {
      if (var0.field2634.vmethod89(797563684).method2741(-207714472)) {
         var2 += 15;
         classVP.field6550.method63("Fps:" + var0.field2639.vmethod172(868104458), var3 + var1, var2, 16776960, -1);
         var2 += 15;
         Runtime var4 = Runtime.getRuntime();
         int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
         int var6 = -1774382915;
         if (var5 > -1192065500 && !var0.field2639.vmethod177(2111760693)) {
            var6 = -1133107897;
         }

         classVP.field6550.method63("Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IB)V")
   @ObfuscatedName("ab")
   void method5562(classLW var1, int var2, byte var3) {
      try {
         int var4 = var1.field4334 * -90794217;
         if (var4 == 324) {
            if (var3 == 122) {
               if (1542917833 * this.field2635 == -1) {
                  if (var3 != 122) {
                     throw new IllegalStateException();
                  }

                  this.field2635 = var1.field4348 * 1013652457;
                  this.field2636 = var1.field4349 * 261153745;
               }

               if (this.field2639.vmethod178(-1277628182) == 1) {
                  if (var3 != 122) {
                     return;
                  }

                  var1.field4348 = -1309316007 * this.field2635;
               } else {
                  var1.field4348 = this.field2636 * 575002083;
               }
            }
         } else if (var4 == 325) {
            if (var3 != 122) {
               throw new IllegalStateException();
            } else {
               if (-1 == 1542917833 * this.field2635) {
                  this.field2635 = 1013652457 * var1.field4348;
                  this.field2636 = 261153745 * var1.field4349;
               }

               if (this.field2639.vmethod178(-836548708) == 1) {
                  if (var3 != 122) {
                     throw new IllegalStateException();
                  }

                  var1.field4348 = 575002083 * this.field2636;
               } else {
                  var1.field4348 = -1309316007 * this.field2635;
               }
            }
         } else if (var4 == 327) {
            if (var3 != 122) {
               throw new IllegalStateException();
            } else {
               var1.field4356 = 2146444786;
               var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 993003239;
               var1.field4333 = -1013325341;
               var1.field4374 = 0;
            }
         } else if (var4 == 328) {
            if (var3 == 122) {
               var1.field4356 = 2146444786;
               var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 993003239;
               var1.field4333 = -1013325341;
               var1.field4374 = 434741949;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gp.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IILvv;B)V")
   @ObfuscatedName("ag")
   void method5565(classLW var1, int var2, int var3, classVV var4, byte var5) {
      try {
         classKH var6 = var1.method7204(var4, false, -1052618474);
         if (null != var6) {
            if (this.field2639.vmethod163(-918955062)) {
               if (var5 == -1) {
                  throw new IllegalStateException();
               }

               classYM.method13544(
                  this.field2637.vmethod111(-217993828),
                  var2,
                  var3,
                  var6.field3586 * -1246906611,
                  var6.field3585 * -1637380195,
                  25,
                  25,
                  this.field2639.vmethod186(2137414314),
                  256,
                  var2,
                  var3,
                  var6.field3587,
                  var6.field3584
               );
            } else {
               classYW.method13752(var2, var3, 0, var6.field3587, var6.field3584);
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gp.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("as")
   void method5569(int var1, int var2, int var3, int var4) {
      try {
         if (this.field2634.vmethod89(797563684).method2741(-64602112)) {
            var2 += 15;
            classVP.field6550.method63("Fps:" + this.field2639.vmethod172(-1370570823), var3 + var1, var2, 16776960, -1);
            var2 += 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int)((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 327680 && !this.field2639.vmethod177(2144167031)) {
               if (var4 != 825915897) {
                  return;
               }

               var7 = 16711680;
            }

            classVP.field6550.method63("Mem:" + var6 + "k", var1 + var3, var2, var7, -1);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "gp.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIILvv;I)V")
   @ObfuscatedName("bw")
   void method5587(classLW[] var1, int var2, int var3, int var4, int var5, classVV var6, int var7) {
      for (int var8 = var2; var8 <= var3; var8++) {
         classLW var9 = var1[var8];
         if (null != var9
            && var4 == var9.field4342 * -1502647899
            && 653784551 * var9.field4263 == var5
            && (!var9.field4275 || !var6.method12119(var9, (byte)0))) {
            if (var9.field4375 * -1510882375 == 0) {
               if (!var9.field4275 && var6.method12119(var9, (byte)0) && !var6.method12112(1268851671).method11927(var9, (byte)49)) {
                  continue;
               }

               this.method5588(
                  var1,
                  var9.field4265 * -1210177335,
                  var9.field4266 * 379541057,
                  var9.field4329 * -1163656551,
                  63131743 * var9.field4260,
                  var6,
                  var7,
                  (byte)-128
               );
               if (var9.field4340 != null) {
                  this.method5588(var9.field4340, 0, var9.field4340.length - 1, var9.field4329 * -1163656551, -1, var6, var7, (byte)-112);
               }

               if (var9.field4260 * 63131743 == -1) {
                  classPK var10 = (classPK)var6.field6613.method13363(-1163656551 * var9.field4329);
                  if (null != var10) {
                     this.method5584(var10.field5276 * 2023647411, var6, var7, (byte)1);
                  }
               }
            }

            if (6 == -1510882375 * var9.field4375) {
               if (var9.field4288 * 2114568197 != -1 || 821151237 * var9.field4293 != -1) {
                  boolean var14 = this.method5579(var9, (byte)-114);
                  int var11;
                  if (var14) {
                     var11 = var9.field4293 * 821151237;
                  } else {
                     var11 = 2114568197 * var9.field4288;
                  }

                  if (-1 != var11) {
                     classOU var12 = classQA.method9430(var11, -957838605);
                     if (!var12.method8768((byte)0)) {
                        var9.field4327 += 650277867 * var7;

                        while (var9.field4327 * 916200643 > var12.field5125[-814893963 * var9.field4321]) {
                           var9.field4327 = var9.field4327 - 650277867 * var12.field5125[-814893963 * var9.field4321];
                           var9.field4321 += 1734048733;
                           if (-814893963 * var9.field4321 >= var12.field5127.length) {
                              var9.field4321 = var9.field4321 - var12.field5134 * -696471245;
                              if (-814893963 * var9.field4321 < 0 || -814893963 * var9.field4321 >= var12.field5127.length) {
                                 var9.field4321 = 0;
                              }
                           }
                        }
                     } else {
                        var9.field4321 += 1734048733 * var7;
                        int var13 = var12.method8771(1812625088);
                        if (-814893963 * var9.field4321 >= var13) {
                           var9.field4321 = var9.field4321 - var12.field5134 * -696471245;
                           if (var9.field4321 * -814893963 < 0 || -814893963 * var9.field4321 >= var13) {
                              var9.field4321 = 0;
                           }
                        }
                     }
                  }
               }

               if (var9.field4262 * 759310449 != 0 && !var9.field4275) {
                  int var15 = 759310449 * var9.field4262 >> 16;
                  int var17 = 759310449 * var9.field4262 << 16 >> 16;
                  var15 *= var7;
                  var17 *= var7;
                  var9.field4356 = (-1246332317 * var9.field4356 + var15 & 2047) * 1703663435;
                  var9.field4292 = (var17 + -1008620329 * var9.field4292 & 2047) * 993003239;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;III)V")
   @ObfuscatedName("ba")
   public static void method5570(classGP var0, int var1, int var2, int var3) {
      if (var0.field2634.vmethod89(797563684).method2741(1150434614)) {
         var2 += 15;
         classVP.field6550.method63("Fps:" + var0.field2639.vmethod172(-390513682), var3 + var1, var2, 16776960, -1);
         var2 += 15;
         Runtime var4 = Runtime.getRuntime();
         int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
         int var6 = 16776960;
         if (var5 > 327680 && !var0.field2639.vmethod177(2130255174)) {
            var6 = 1757339270;
         }

         classVP.field6550.method63("Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Llw;I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   String method5575(String var1, classLW var2, int var3) {
      try {
         if (var1.indexOf("%") != -1) {
            if (var3 <= 1719251183) {
               throw new IllegalStateException();
            }

            for (int var4 = 1; var4 <= 5; var4++) {
               if (var3 <= 1719251183) {
                  throw new IllegalStateException();
               }

               while (true) {
                  int var5 = var1.indexOf("%" + var4);
                  if (var5 == -1) {
                     if (var3 <= 1719251183) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  int var6 = this.field2639.vmethod181(var2, var4 - 1, -1039980405);
                  String var7;
                  if (var6 < 999999999) {
                     if (var3 <= 1719251183) {
                        throw new IllegalStateException();
                     }

                     var7 = Integer.toString(var6);
                  } else {
                     var7 = "*";
                  }

                  var1 = var1.substring(0, var5) + var7 + var1.substring(var5 + 2);
               }
            }
         }

         return var1;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "gp.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("ao")
   boolean method5579(classLW var1, byte var2) {
      try {
         if (null == var1.field4400) {
            return false;
         } else {
            for (int var3 = 0; var3 < var1.field4400.length; var3++) {
               if (var2 == -108) {
                  throw new IllegalStateException();
               }

               int var4 = this.field2639.vmethod181(var1, var3, -1470283120);
               int var5 = var1.field4401[var3];
               if (2 == var1.field4400[var3]) {
                  if (var2 == -108) {
                     throw new IllegalStateException();
                  }

                  if (var4 >= var5) {
                     if (var2 == -108) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (3 == var1.field4400[var3]) {
                  if (var4 <= var5) {
                     if (var2 == -108) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (var1.field4400[var3] == 4) {
                  if (var5 == var4) {
                     return false;
                  }
               } else if (var5 != var4) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gp.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;Llw;IILvv;)V")
   @ObfuscatedName("lf")
   public static void method5566(classGP var0, classLW var1, int var2, int var3, classVV var4) {
      if (var0 == null) {
         var0.method5569(var2, var2, var2, var2);
      }

      classKH var5 = var1.method7204(var4, false, -297012961);
      if (null != var5) {
         if (var0.field2639.vmethod163(712213356)) {
            classYM.method13544(
               var0.field2637.vmethod111(-217993828),
               var2,
               var3,
               var5.field3586 * -1246906611,
               var5.field3585 * 342325999,
               25,
               25,
               var0.field2639.vmethod186(2137414314),
               -620371225,
               var2,
               var3,
               var5.field3587,
               var5.field3584
            );
         } else {
            classYW.method13752(var2, var3, 0, var5.field3587, var5.field3584);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;IB)V")
   @ObfuscatedName("al")
   void method5584(int var1, classVV var2, int var3, byte var4) {
      try {
         if (!classLY.method7381(var2, var1, 1883254673)) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }
         } else {
            this.method5588(var2.field4440[var1], 0, var2.field4440[var1].length - 1, -1, -1, var2, var3, (byte)-24);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIILvv;IB)V")
   @ObfuscatedName("aj")
   void method5588(classLW[] var1, int var2, int var3, int var4, int var5, classVV var6, int var7, byte var8) {
      try {
         for (int var9 = var2; var9 <= var3; var9++) {
            if (var8 >= 1) {
               throw new IllegalStateException();
            }

            classLW var10 = var1[var9];
            if (null == var10) {
               if (var8 >= 1) {
                  throw new IllegalStateException();
               }
            } else if (var4 == var10.field4342 * -1502647899) {
               if (var8 >= 1) {
                  throw new IllegalStateException();
               }

               if (653784551 * var10.field4263 != var5) {
                  if (var8 >= 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var10.field4275) {
                     if (var8 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (var6.method12119(var10, (byte)0)) {
                        if (var8 >= 1) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  if (var10.field4375 * -1510882375 == 0) {
                     if (var8 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (!var10.field4275) {
                        if (var8 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (var6.method12119(var10, (byte)0)) {
                           if (var8 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (!var6.method12112(-208306595).method11927(var10, (byte)37)) {
                              if (var8 >= 1) {
                                 return;
                              }
                              continue;
                           }
                        }
                     }

                     this.method5588(
                        var1,
                        var10.field4265 * -1210177335,
                        var10.field4266 * 379541057,
                        var10.field4329 * -1163656551,
                        63131743 * var10.field4260,
                        var6,
                        var7,
                        (byte)-27
                     );
                     if (var10.field4340 != null) {
                        if (var8 >= 1) {
                           return;
                        }

                        this.method5588(var10.field4340, 0, var10.field4340.length - 1, var10.field4329 * -1163656551, -1, var6, var7, (byte)-36);
                     }

                     if (var10.field4260 * 63131743 == -1) {
                        if (var8 >= 1) {
                           throw new IllegalStateException();
                        }

                        classPK var11 = (classPK)var6.field6613.method13363(-1163656551 * var10.field4329);
                        if (null != var11) {
                           if (var8 >= 1) {
                              throw new IllegalStateException();
                           }

                           this.method5584(var11.field5276 * 2023647411, var6, var7, (byte)1);
                        }
                     }
                  }

                  if (6 == -1510882375 * var10.field4375) {
                     if (var8 >= 1) {
                        throw new IllegalStateException();
                     }

                     label215: {
                        if (var10.field4288 * 2114568197 == -1) {
                           if (var8 >= 1) {
                              return;
                           }

                           if (821151237 * var10.field4293 == -1) {
                              break label215;
                           }
                        }

                        boolean var16 = this.method5579(var10, (byte)59);
                        int var12;
                        if (var16) {
                           if (var8 >= 1) {
                              throw new IllegalStateException();
                           }

                           var12 = var10.field4293 * 821151237;
                        } else {
                           var12 = 2114568197 * var10.field4288;
                        }

                        if (-1 != var12) {
                           if (var8 >= 1) {
                              throw new IllegalStateException();
                           }

                           classOU var13 = classQA.method9430(var12, 1650869054);
                           if (!var13.method8768((byte)0)) {
                              if (var8 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10.field4327 += 650277867 * var7;

                              while (var10.field4327 * 916200643 > var13.field5125[-814893963 * var10.field4321]) {
                                 if (var8 >= 1) {
                                    return;
                                 }

                                 var10.field4327 = var10.field4327 - 650277867 * var13.field5125[-814893963 * var10.field4321];
                                 var10.field4321 += 1734048733;
                                 if (-814893963 * var10.field4321 >= var13.field5127.length) {
                                    if (var8 >= 1) {
                                       return;
                                    }

                                    var10.field4321 = var10.field4321 - var13.field5134 * -696471245;
                                    if (-814893963 * var10.field4321 >= 0) {
                                       if (var8 >= 1) {
                                          throw new IllegalStateException();
                                       }

                                       if (-814893963 * var10.field4321 < var13.field5127.length) {
                                          continue;
                                       }

                                       if (var8 >= 1) {
                                          return;
                                       }
                                    }

                                    var10.field4321 = 0;
                                 }
                              }
                           } else {
                              var10.field4321 += 1734048733 * var7;
                              int var14 = var13.method8771(1403803941);
                              label173:
                              if (-814893963 * var10.field4321 >= var14) {
                                 if (var8 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10.field4321 = var10.field4321 - var13.field5134 * -696471245;
                                 if (var10.field4321 * -814893963 >= 0) {
                                    if (var8 >= 1) {
                                       throw new IllegalStateException();
                                    }

                                    if (-814893963 * var10.field4321 < var14) {
                                       break label173;
                                    }
                                 }

                                 var10.field4321 = 0;
                              }
                           }
                        }
                     }

                     if (var10.field4262 * 759310449 != 0) {
                        if (var8 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (!var10.field4275) {
                           if (var8 >= 1) {
                              throw new IllegalStateException();
                           }

                           int var17 = 759310449 * var10.field4262 >> 16;
                           int var19 = 759310449 * var10.field4262 << 16 >> 16;
                           var17 *= var7;
                           var19 *= var7;
                           var10.field4356 = (-1246332317 * var10.field4356 + var17 & 2047) * 1703663435;
                           var10.field4292 = (var19 + -1008620329 * var10.field4292 & 2047) * 993003239;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "gp.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;Llw;)Z")
   @ObfuscatedName("vz")
   public static boolean method5580(classGP var0, classLW var1) {
      if (var0 == null) {
         var0.method5582(var1);
      }

      if (null == var1.field4400) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.field4400.length; var2++) {
            int var3 = var0.field2639.vmethod181(var1, var2, -973847063);
            int var4 = var1.field4401[var2];
            if (2 == var1.field4400[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (3 == var1.field4400[var2]) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.field4400[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILvv;II)V")
   @ObfuscatedName("ay")
   public void method5549(int var1, int var2, classVV var3, int var4, int var5) {
      if (var3.field6612 * -77072447 != -1) {
         this.method5584(-77072447 * var3.field6612, var3, var5, (byte)1);
         method5553(this, var3.field6612 * -77072447, 0, 0, var1, var2, 0, 0, var3, var4, 545645039);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILvv;II)V")
   @ObfuscatedName("aq")
   public void method5550(int var1, int var2, classVV var3, int var4, int var5) {
      if (var3.field6612 * -77072447 != -1) {
         this.method5584(-77072447 * var3.field6612, var3, var5, (byte)1);
         method5553(this, var3.field6612 * -77072447, 0, 0, var1, var2, 0, 0, var3, var4, 545645039);
      }
   }

   public classGP(classJX var1, classJV var2, classJT var3, classGO var4, classGZ var5) {
      this.field2634 = var1;
      this.field2639 = var2;
      this.field2637 = var3;
      this.field2638 = var4;
      this.field2641 = var5;
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("aw")
   void method5557(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13
   ) {
      classYW.method13671(var6, var7, var8, var9);
      classFH.method4740();

      for (int var14 = var2; var14 <= var3; var14++) {
         classLW var15 = var1[var14];
         if (null != var15
            && (
               -1502647899 * var15.field4342 == var4 && var15.field4263 * 653784551 == var5
                  || var4 == -1412584499 && var15 == classVV.method12152(var12, (byte)-40)
            )
            && (!var15.field4275 || !var12.method12119(var15, (byte)0))) {
            if (-90794217 * var15.field4334 > 0) {
               this.method5562(var15, var13, (byte)122);
            }

            int var16 = var10 + 744286069 * var15.field4281;
            int var17 = var11 + 1570844829 * var15.field4257;
            int var18 = 1517457381 * var15.field4347;
            if (classVV.method12152(var12, (byte)-93) == var15) {
               classVW var19 = var12.method12150((byte)0);
               if (var4 != -1412584499 && !var15.field4314) {
                  this.field2651 = var1;
                  this.field2645 = -100057729 * var10;
                  this.field2646 = 5465987 * var11;
                  continue;
               }

               if (var19.method12253((short)9906) && var19.method12258(-1772000595)) {
                  int var20 = var19.method12235(-839918489);
                  int var21 = classVW.method12241(var19, (byte)-106);
                  int var22 = var19.method12215(-52026959).field4249 * 1115597881;
                  int var23 = var19.method12215(1111697437).field4259 * 293773697;
                  int var24 = classTZ.field6255 * -38255113;
                  int var25 = classTZ.field6264 * -2144333897;
                  var24 -= var19.method12224((byte)86);
                  var25 -= classVW.method12226(var19, (byte)-67);
                  if (var24 < var20) {
                     var24 = var20;
                  }

                  if (1115597881 * var15.field4249 + var24 > var22 + var20) {
                     var24 = var22 + var20 - 1115597881 * var15.field4249;
                  }

                  if (var25 < var21) {
                     var25 = var21;
                  }

                  if (var25 + var15.field4259 * 293773697 > var21 + var23) {
                     var25 = var21 + var23 - var15.field4259 * 293773697;
                  }

                  var16 = var24;
                  var17 = var25;
               }

               if (!var15.field4314) {
                  var18 = 128;
               }
            }

            int var33;
            int var34;
            int var35;
            int var36;
            if (9 == -1510882375 * var15.field4375) {
               int var37 = var16;
               int var49 = var17;
               int var59 = var16 + var15.field4249 * 1115597881;
               int var26 = var15.field4259 * 293773697 + var17;
               if (var59 < var16) {
                  var37 = var59;
                  var59 = var16;
               }

               if (var26 < var17) {
                  var49 = var26;
                  var26 = var17;
               }

               var59++;
               var26++;
               var33 = var37 > var6 ? var37 : var6;
               var34 = var49 > var7 ? var49 : var7;
               var35 = var59 < var8 ? var59 : var8;
               var36 = var26 < var9 ? var26 : var9;
            } else {
               int var38 = var15.field4249 * 1115597881 + var16;
               int var50 = var17 + var15.field4259 * 293773697;
               var33 = var16 > var6 ? var16 : var6;
               var34 = var17 > var7 ? var17 : var7;
               var35 = var38 < var8 ? var38 : var8;
               var36 = var50 < var9 ? var50 : var9;
            }

            if (!var15.field4275 || var33 < var35 && var34 < var36) {
               if (0 != -90794217 * var15.field4334) {
                  if (1336 == var15.field4334 * -90794217) {
                     this.method5569(var16, var17, 1115597881 * var15.field4249, 825915897);
                     continue;
                  }

                  if (1337 == var15.field4334 * -90794217) {
                     this.field2641.vmethod281(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, -12535752);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1338 == -90794217 * var15.field4334) {
                     this.field2641.vmethod298(var15, var16, var17, (short)-6786);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1339 == var15.field4334 * -90794217) {
                     this.method5565(var15, var16, var17, var12, (byte)56);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1400 == var15.field4334 * -90794217) {
                     this.field2641
                        .vmethod285(
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           293773697 * var15.field4259,
                           var13,
                           this.field2634.vmethod89(797563684).method2757(-1674478907)
                        );
                  }

                  if (1401 == var15.field4334 * -90794217) {
                     this.field2641.vmethod291(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, 1554558740);
                  }

                  if (var15.field4334 * -90794217 == 1402) {
                     this.field2641.vmethod296(var16, var13, -1565153214);
                  }
               }

               if (0 == -1510882375 * var15.field4375) {
                  if (!var15.field4275 && var12.method12119(var15, (byte)0) && !var12.method12112(-405374057).method11927(var15, (byte)86)) {
                     continue;
                  }

                  if (!var15.field4275) {
                     if (var15.field4331 * -41424189 > var15.field4269 * -714521463 - 293773697 * var15.field4259) {
                        var15.field4331 = var15.field4269 * -1471306045 - var15.field4259 * 577918571;
                     }

                     if (var15.field4331 * -41424189 < 0) {
                        var15.field4331 = 0;
                     }
                  }

                  this.method5560(
                     var1,
                     var15.field4265 * -1210177335,
                     var15.field4266 * 379541057,
                     -1163656551 * var15.field4329,
                     var15.field4260 * 63131743,
                     var33,
                     var34,
                     var35,
                     var36,
                     var16 - var15.field4341 * -34809441,
                     var17 - var15.field4331 * -41424189,
                     var12,
                     var13,
                     1690058415
                  );
                  if (var15.field4340 != null) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        -1163656551 * var15.field4329,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - var15.field4341 * -34809441,
                        var17 - -41424189 * var15.field4331,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  if (-1 == var15.field4260 * 63131743) {
                     classPK var39 = (classPK)var12.field6613.method13363(var15.field4329 * -1163656551);
                     if (null != var39) {
                        method5553(this, var39.field5276 * 2023647411, var33, var34, var35, var36, var16, var17, var12, var13, 545645039);
                     }
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               } else if (11 == -1510882375 * var15.field4375) {
                  if (var12.method12119(var15, (byte)0) && !var12.method12112(-314599428).method11927(var15, (byte)57)) {
                     continue;
                  }

                  if (null != var15.field4340) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        var15.field4329 * -1163656551,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - -34809441 * var15.field4341,
                        var17 - var15.field4331 * -41424189,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               }

               if (var15.field4375 * -1510882375 == 0 && !var15.field4275 && var15.field4269 * -714521463 > 293773697 * var15.field4259) {
                  method5573(
                     this,
                     var16 + 1115597881 * var15.field4249,
                     var17,
                     -41424189 * var15.field4331,
                     293773697 * var15.field4259,
                     -714521463 * var15.field4269,
                     (byte)-1
                  );
               }

               if (var15.field4375 * -1510882375 != 1) {
                  if (-1510882375 * var15.field4375 == 3) {
                     int var47;
                     if (this.method5579(var15, (byte)15)) {
                        var47 = var15.field4295 * 948260113;
                        if (var12.method12112(1280247474).method11927(var15, (byte)52) && 0 != var15.field4273 * 1396903265) {
                           var47 = var15.field4273 * 1396903265;
                        }
                     } else {
                        var47 = 1740831551 * var15.field4270;
                        if (var12.method12112(1920763831).method11927(var15, (byte)63) && 318120869 * var15.field4272 != 0) {
                           var47 = 318120869 * var15.field4272;
                        }
                     }

                     if (var15.field4271) {
                        switch (1768204099 * var15.field4307.field6976) {
                           case 1:
                              classYW.method13699(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 1740831551 * var15.field4270,
                                 var15.field4295 * 948260113
                              );
                              break;
                           case 2:
                              classYW.method13765(
                                 var16,
                                 var17,
                                 var15.field4249 * 1115597881,
                                 293773697 * var15.field4259,
                                 var15.field4270 * 1740831551,
                                 var15.field4295 * 948260113,
                                 255 - (var15.field4347 * 1517457381 & 0xFF),
                                 255 - (var15.field4276 * 1991172799 & 0xFF)
                              );
                              break;
                           default:
                              if (var18 == 0) {
                                 classYW.method13698(var16, var17, var15.field4249 * 1115597881, 293773697 * var15.field4259, var47);
                              } else {
                                 classYW.method13694(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, var47, 256 - (var18 & 0xFF));
                              }
                        }
                     } else if (0 == var18) {
                        classYW.method13707(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697, var47);
                     } else {
                        classYW.method13711(var16, var17, var15.field4249 * 1115597881, var15.field4259 * 293773697, var47, 256 - (var18 & 0xFF));
                     }
                  } else if (4 == var15.field4375 * -1510882375) {
                     classZV var46 = var15.method7199(var12, (byte)-2);
                     if (var46 != null) {
                        String var67 = var15.field4301;
                        int var57;
                        if (this.method5579(var15, (byte)-43)) {
                           var57 = 948260113 * var15.field4295;
                           if (var12.method12112(-251751247).method11927(var15, (byte)70) && var15.field4273 * 1396903265 != 0) {
                              var57 = var15.field4273 * 1396903265;
                           }

                           if (!var15.field4302.isEmpty()) {
                              var67 = var15.field4302;
                           }
                        } else {
                           var57 = 1740831551 * var15.field4270;
                           if (var12.method12112(332890184).method11927(var15, (byte)30) && 0 != var15.field4272 * 318120869) {
                              var57 = 318120869 * var15.field4272;
                           }
                        }

                        if (var15.field4275 && var15.field4319 * 2073671441 != -1) {
                           classOP var75 = classOB.method8299(2073671441 * var15.field4319, (byte)35);
                           var67 = classOP.method8704(var75, 1248604557);
                           if (var67 == null) {
                              var67 = classKK.field3615;
                           }

                           if ((1633663665 * var75.field5055 == 1 || var15.field4344 * 1190987649 != 1) && -1 != var15.field4344 * 1190987649) {
                              var67 = classQY.method9847(16748608, (byte)80)
                                 + var67
                                 + classDO.field1594
                                 + " "
                                 + 'x'
                                 + classSX.method10713(var15.field4344 * 1190987649, -1052888622);
                           }
                        }

                        if (var12.method12170(var15, (byte)-109)) {
                           var67 = classKK.field3783;
                           var57 = var15.field4270 * 1740831551;
                        }

                        if (!var15.field4275) {
                           var67 = this.method5575(var67, var15, 1942349116);
                        }

                        classAAA.method70(
                           var46,
                           var67,
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           var15.field4259 * 293773697,
                           var57,
                           var15.field4306 ? 0 : -1,
                           classGK.method5483(var15.field4347 * 1517457381, -1825471066),
                           var15.field4304 * 1409141973,
                           -338086361 * var15.field4305,
                           704962289 * var15.field4303
                        );
                     }
                  } else if (-1510882375 * var15.field4375 == 5) {
                     if (!var15.field4275) {
                        classYM var45 = var15.method7319(var12, this.method5579(var15, (byte)-6), this.field2634.vmethod78((byte)49), -1694061909);
                        if (null != var45) {
                           classYM.method13511(var45, var16, var17);
                        }
                     } else {
                        classYM var44;
                        if (-1 != 2073671441 * var15.field4319) {
                           var44 = classLJ.method7114(
                              2073671441 * var15.field4319,
                              var15.field4344 * 1190987649,
                              var15.field4283 * -2011859635,
                              880555563 * var15.field4284,
                              -278245589 * var15.field4299,
                              false,
                              Math.max(36, var15.field4249 * 1115597881),
                              Math.max(32, 293773697 * var15.field4259),
                              1683831829
                           );
                        } else {
                           var44 = var15.method7319(var12, false, this.field2634.vmethod78((byte)-65), -1625225312);
                        }

                        if (null != var44) {
                           int var56 = var44.field7006;
                           int var66 = var44.field7008;
                           if (!var15.field4282) {
                              int var74 = -356282368 * var15.field4249 / var56;
                              if (var15.field4351 * 142218501 != 0) {
                                 var44.method13553(
                                    var16 + 1115597881 * var15.field4249 / 2, var17 + var15.field4259 * 293773697 / 2, var15.field4351 * 142218501, var74
                                 );
                              } else if (0 != var18) {
                                 var44.method13524(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, 256 - (var18 & 0xFF));
                              } else if (var56 == var15.field4249 * 1115597881 && 293773697 * var15.field4259 == var66) {
                                 classYM.method13511(var44, var16, var17);
                              } else {
                                 var44.method13517(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697);
                              }
                           } else {
                              classYW.method13674(var16, var17, var16 + var15.field4249 * 1115597881, var17 + 293773697 * var15.field4259);
                              int var73 = (1115597881 * var15.field4249 + (var56 - 1)) / var56;
                              int var81 = (var66 - 1 + var15.field4259 * 293773697) / var66;

                              for (int var84 = 0; var84 < var73; var84++) {
                                 for (int var87 = 0; var87 < var81; var87++) {
                                    if (0 != var15.field4351 * 142218501) {
                                       var44.method13553(
                                          var56 / 2 + var84 * var56 + var16, var66 * var87 + var17 + var66 / 2, 142218501 * var15.field4351, 4096
                                       );
                                    } else if (var18 != 0) {
                                       classYM.method13523(var44, var84 * var56 + var16, var17 + var87 * var66, 256 - (var18 & 0xFF));
                                    } else {
                                       classYM.method13511(var44, var84 * var56 + var16, var17 + var66 * var87);
                                    }
                                 }
                              }

                              classYW.method13671(var6, var7, var8, var9);
                           }
                        }
                     }
                  } else if (6 == -1510882375 * var15.field4375) {
                     classOU var43 = null;
                     int var55 = -1;
                     boolean var65 = this.method5579(var15, (byte)58);
                     int var72;
                     if (var65) {
                        var72 = 821151237 * var15.field4293;
                     } else {
                        var72 = 2114568197 * var15.field4288;
                     }

                     if (-1 != var72) {
                        var43 = classQA.method9430(var72, 1783553366);
                        var55 = -814893963 * var15.field4321;
                     }

                     classFX var79 = null;
                     int var83 = 0;
                     if (2073671441 * var15.field4319 != -1) {
                        var79 = this.field2638.vmethod115(var15, (byte)-12);
                        if (var79 != null) {
                           var79.method5230();
                           var83 = var79.field1743 * -1256242689 / 2;
                        }
                     } else if (5 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod119(var15, (byte)4);
                     } else if (var15.field4333 * -910601 == 7) {
                        var79 = this.field2638.vmethod122(var15, (byte)115);
                     } else if (8 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod127(var15, var43, var55, (byte)14);
                     } else if (9 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod129(var15, var43, var55, (byte)43);
                     } else if (6 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod133(var15, var43, var55, var65, 1212958472);
                     } else if (var15.field4333 * -910601 == 2) {
                        var79 = this.field2638.vmethod139(var15, var43, var55, var65, -1886850572);
                     } else {
                        var79 = this.field2638.vmethod140(var15, var43, var55, var65, (byte)2);
                     }

                     classFH.method4756(1115597881 * var15.field4249 / 2 + var16, 293773697 * var15.field4259 / 2 + var17);
                     int var86 = classFH.field2253[-1246332317 * var15.field4356] * var15.field4338 * 245118287 >> 16;
                     int var89 = var15.field4338 * 245118287 * classFH.field2254[var15.field4356 * -1246332317] >> 16;
                     if (null != var79) {
                        classFH.method4684(false);
                        if (!var15.field4275) {
                           var79.method5250(0, -1008620329 * var15.field4292, 0, var15.field4356 * -1246332317, 0, var86, var89);
                        } else {
                           var79.method5230();
                           if (var15.field4297) {
                              var79.method5161(
                                 0,
                                 var15.field4292 * -1008620329,
                                 827587461 * var15.field4294,
                                 var15.field4356 * -1246332317,
                                 var15.field4290 * -1469553671,
                                 var86 + var83 + var15.field4291 * -30521739,
                                 var15.field4291 * -30521739 + var89,
                                 var15.field4338 * 245118287
                              );
                           } else {
                              var79.method5250(
                                 0,
                                 -1008620329 * var15.field4292,
                                 827587461 * var15.field4294,
                                 -1246332317 * var15.field4356,
                                 var15.field4290 * -1469553671,
                                 var83 + var86 + -30521739 * var15.field4291,
                                 var89 + var15.field4291 * -30521739
                              );
                           }
                        }
                     }

                     classFH.method4754();
                  } else if (-1510882375 * var15.field4375 == 8) {
                     if (var12.method12112(2106647350).method11932(var15, (byte)28)) {
                        classZV var42 = this.field2637.vmethod105(classXJ.field6878, -725461430);
                        int var53 = 0;
                        int var63 = 0;
                        classZV var71 = var42;
                        String var27 = var15.field4301;

                        for (String var76 = this.method5575(var27, var15, 1885462901); !var76.isEmpty(); var63 += var71.field8 + 1) {
                           int var29 = var76.indexOf(classDO.field1588);
                           String var28;
                           if (-1 != var29) {
                              var28 = var76.substring(0, var29);
                              var76 = var76.substring(var29 + 4);
                           } else {
                              var28 = var76;
                              var76 = "";
                           }

                           int var30 = var71.method36(var28);
                           if (var30 > var53) {
                              var53 = var30;
                           }
                        }

                        var53 += 6;
                        var63 += 7;
                        int var85 = var16 + 1115597881 * var15.field4249 - 5 - var53;
                        int var88 = 5 + var15.field4259 * 293773697 + var17;
                        if (var85 < 5 + var16) {
                           var85 = 5 + var16;
                        }

                        if (var85 + var53 > var8) {
                           var85 = var8 - var53;
                        }

                        if (var88 + var63 > var9) {
                           var88 = var9 - var63;
                        }

                        classYW.method13698(var85, var88, var53, var63, 16777120);
                        classYW.method13707(var85, var88, var53, var63, 0);
                        var27 = var15.field4301;
                        int var31 = 2 + var88 + var71.field8;

                        for (String var78 = this.method5575(var27, var15, 2065494022); !var78.isEmpty(); var31 += 1 + var71.field8) {
                           int var32 = var78.indexOf(classDO.field1588);
                           String var82;
                           if (-1 != var32) {
                              var82 = var78.substring(0, var32);
                              var78 = var78.substring(4 + var32);
                           } else {
                              var82 = var78;
                              var78 = "";
                           }

                           var71.method56(var82, 3 + var85, var31, 0, -1);
                        }
                     }
                  } else if (9 == -1510882375 * var15.field4375) {
                     int var41;
                     int var52;
                     int var62;
                     int var70;
                     if (var15.field4278) {
                        var41 = var16;
                        var52 = var15.field4259 * 293773697 + var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var17;
                     } else {
                        var41 = var16;
                        var52 = var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var15.field4259 * 293773697 + var17;
                     }

                     if (var15.field4277 * 845712065 == 1) {
                        classYW.method13732(var41, var52, var62, var70, 1740831551 * var15.field4270);
                     } else {
                        classYW.method13745(var41, var52, var62, var70, 845712065 * var15.field4277, var15.field4270 * 1740831551);
                     }
                  } else if (-1510882375 * var15.field4375 == 12) {
                     classLH var40 = var15.method7283(-1671051614);
                     classLI var51 = classLW.method7285(var15, 1825762370);
                     if (var40 != null && var51 != null && var40.method6998((byte)-117)) {
                        classZV var61 = var15.method7199(var12, (byte)-96);
                        if (null != var61) {
                           this.field2640
                              .method5281(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 var40.method7001(1684905505),
                                 classLH.method7003(var40, 658593938),
                                 var40.method6994((byte)-96),
                                 var40.method6995(1219239234),
                                 var40.method6989((byte)3),
                                 395641138
                              );
                           int var69 = var15.field4306 ? var15.field4284 * 880555563 : -1;
                           if (!var40.method6982(1267044611) && var40.method6970(-219773290).method13845(735880602)) {
                              classGA.method5284(
                                 this.field2640, var51.field4169 * 201043577, var69, -211319977 * var51.field4172, var51.field4170 * 1532740787, 1564115800
                              );
                              this.field2640.method5287(classLH.method6973(var40, -635239825), var61, 120041229);
                           } else {
                              classGA.method5284(
                                 this.field2640, 1740831551 * var15.field4270, var69, var51.field4172 * -211319977, 1532740787 * var51.field4170, 1421514085
                              );
                              this.field2640.method5287(var40.method6970(-1861932607), var61, 120041229);
                           }

                           classYW.method13671(var6, var7, var8, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("ak")
   void method5563(classLW var1, int var2) {
      int var3 = var1.field4334 * -1208938619;
      if (var3 == 440463794) {
         if (1542917833 * this.field2635 == -1) {
            this.field2635 = var1.field4348 * -794511402;
            this.field2636 = var1.field4349 * 1178689048;
         }

         if (this.field2639.vmethod178(-1548549706) == 1) {
            var1.field4348 = -908744055 * this.field2635;
         } else {
            var1.field4348 = this.field2636 * -1144797714;
         }
      } else if (var3 == 1998739821) {
         if (-1 == 1542917833 * this.field2635) {
            this.field2635 = 1013652457 * var1.field4348;
            this.field2636 = 261153745 * var1.field4349;
         }

         if (this.field2639.vmethod178(-990270765) == 1) {
            var1.field4348 = 575002083 * this.field2636;
         } else {
            var1.field4348 = 165903446 * this.field2635;
         }
      } else if (var3 == 327) {
         var1.field4356 = 2146444786;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 993003239;
         var1.field4333 = -1013325341;
         var1.field4374 = 0;
      } else if (var3 == 1932681869) {
         var1.field4356 = 2146444786;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 58902721) * 993003239;
         var1.field4333 = -1190268717;
         var1.field4374 = -148119952;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("at")
   void method5564(classLW var1, int var2) {
      int var3 = var1.field4334 * -90794217;
      if (var3 == 324) {
         if (1095022465 * this.field2635 == -1) {
            this.field2635 = var1.field4348 * 1013652457;
            this.field2636 = var1.field4349 * 1610883489;
         }

         if (this.field2639.vmethod178(-1963818833) == 1) {
            var1.field4348 = -1309316007 * this.field2635;
         } else {
            var1.field4348 = this.field2636 * 575002083;
         }
      } else if (var3 == 325) {
         if (-1 == 712895439 * this.field2635) {
            this.field2635 = -2063943867 * var1.field4348;
            this.field2636 = 261153745 * var1.field4349;
         }

         if (this.field2639.vmethod178(-1661790117) == 1) {
            var1.field4348 = 1567519918 * this.field2636;
         } else {
            var1.field4348 = -230072226 * this.field2635;
         }
      } else if (var3 == 327) {
         var1.field4356 = 777190345;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * 881145893;
         var1.field4333 = -1013325341;
         var1.field4374 = 0;
      } else if (var3 == -1096988311) {
         var1.field4356 = -1432036539;
         var1.field4292 = ((int)(Math.sin(var2 / 40.0) * 256.0) & 713937275) * 1398957021;
         var1.field4333 = -1013325341;
         var1.field4374 = 434741949;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IILvv;)V")
   @ObfuscatedName("am")
   void method5567(classLW var1, int var2, int var3, classVV var4) {
      classKH var5 = var1.method7204(var4, false, -973700585);
      if (null != var5) {
         if (this.field2639.vmethod163(-1148830535)) {
            classYM.method13544(
               this.field2637.vmethod111(-217993828),
               var2,
               var3,
               var5.field3586 * -1246906611,
               var5.field3585 * -1637380195,
               25,
               25,
               this.field2639.vmethod186(2137414314),
               256,
               var2,
               var3,
               var5.field3587,
               var5.field3584
            );
         } else {
            classYW.method13752(var2, var3, 0, var5.field3587, var5.field3584);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILvv;III)V")
   @ObfuscatedName("az")
   public void method5551(int var1, int var2, classVV var3, int var4, int var5, int var6) {
      try {
         if (var3.field6612 * -77072447 != -1) {
            if (var6 >= -200174874) {
               throw new IllegalStateException();
            }

            this.method5584(-77072447 * var3.field6612, var3, var5, (byte)1);
            method5553(this, var3.field6612 * -77072447, 0, 0, var1, var2, 0, 0, var3, var4, 545645039);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bx")
   void method5571(int var1, int var2, int var3) {
      if (this.field2634.vmethod89(797563684).method2741(1803222332)) {
         var2 += 15;
         classVP.field6550.method63("Fps:" + this.field2639.vmethod172(-554702036), var3 + var1, var2, 16776960, -1);
         var2 += 15;
         Runtime var4 = Runtime.getRuntime();
         int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
         int var6 = 16776960;
         if (var5 > 327680 && !this.field2639.vmethod177(2088505584)) {
            var6 = 16711680;
         }

         classVP.field6550.method63("Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bc")
   void method5572(int var1, int var2, int var3) {
      if (this.field2634.vmethod89(797563684).method2741(-310743968)) {
         var2 += 15;
         classVP.field6550.method63("Fps:" + this.field2639.vmethod172(392729646), var3 + var1, var2, 16776960, -1);
         var2 += 15;
         Runtime var4 = Runtime.getRuntime();
         int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
         int var6 = 16776960;
         if (var5 > 327680 && !this.field2639.vmethod177(2136143972)) {
            var6 = 16711680;
         }

         classVP.field6550.method63("Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("ai")
   void method5558(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13
   ) {
      classYW.method13671(var6, var7, var8, var9);
      classFH.method4740();

      for (int var14 = var2; var14 <= var3; var14++) {
         classLW var15 = var1[var14];
         if (null != var15
            && (
               -1502647899 * var15.field4342 == var4 && var15.field4263 * 653784551 == var5
                  || var4 == 578975898 && var15 == classVV.method12152(var12, (byte)-79)
            )
            && (!var15.field4275 || !var12.method12119(var15, (byte)0))) {
            if (704945840 * var15.field4334 > 0) {
               this.method5562(var15, var13, (byte)122);
            }

            int var16 = var10 + 744286069 * var15.field4281;
            int var17 = var11 + 1570844829 * var15.field4257;
            int var18 = -1887796431 * var15.field4347;
            if (classVV.method12152(var12, (byte)-100) == var15) {
               classVW var19 = var12.method12150((byte)0);
               if (var4 != -1412584499 && !var15.field4314) {
                  this.field2651 = var1;
                  this.field2645 = -100057729 * var10;
                  this.field2646 = -1327834564 * var11;
                  continue;
               }

               if (var19.method12253((short)1981) && var19.method12258(-1996589236)) {
                  int var20 = var19.method12235(-842815482);
                  int var21 = classVW.method12241(var19, (byte)-16);
                  int var22 = var19.method12215(-1012748042).field4249 * -213997419;
                  int var23 = var19.method12215(-1504140299).field4259 * 293773697;
                  int var24 = classTZ.field6255 * -38255113;
                  int var25 = classTZ.field6264 * -2044969658;
                  var24 -= var19.method12224((byte)35);
                  var25 -= classVW.method12226(var19, (byte)-84);
                  if (var24 < var20) {
                     var24 = var20;
                  }

                  if (707519696 * var15.field4249 + var24 > var22 + var20) {
                     var24 = var22 + var20 - 1115597881 * var15.field4249;
                  }

                  if (var25 < var21) {
                     var25 = var21;
                  }

                  if (var25 + var15.field4259 * -300667092 > var21 + var23) {
                     var25 = var21 + var23 - var15.field4259 * 293773697;
                  }

                  var16 = var24;
                  var17 = var25;
               }

               if (!var15.field4314) {
                  var18 = 1885175640;
               }
            }

            int var33;
            int var34;
            int var35;
            int var36;
            if (9 == -1510882375 * var15.field4375) {
               int var37 = var16;
               int var49 = var17;
               int var59 = var16 + var15.field4249 * -1652021331;
               int var26 = var15.field4259 * -1040669975 + var17;
               if (var59 < var16) {
                  var37 = var59;
                  var59 = var16;
               }

               if (var26 < var17) {
                  var49 = var26;
                  var26 = var17;
               }

               var59++;
               var26++;
               var33 = var37 > var6 ? var37 : var6;
               var34 = var49 > var7 ? var49 : var7;
               var35 = var59 < var8 ? var59 : var8;
               var36 = var26 < var9 ? var26 : var9;
            } else {
               int var38 = var15.field4249 * 1986756906 + var16;
               int var50 = var17 + var15.field4259 * 293773697;
               var33 = var16 > var6 ? var16 : var6;
               var34 = var17 > var7 ? var17 : var7;
               var35 = var38 < var8 ? var38 : var8;
               var36 = var50 < var9 ? var50 : var9;
            }

            if (!var15.field4275 || var33 < var35 && var34 < var36) {
               if (0 != -90794217 * var15.field4334) {
                  if (1336 == var15.field4334 * -331159416) {
                     this.method5569(var16, var17, 1115597881 * var15.field4249, 825915897);
                     continue;
                  }

                  if (1683099239 == var15.field4334 * 588338033) {
                     this.field2641.vmethod281(var16, var17, 538289636 * var15.field4249, 624085268 * var15.field4259, -1965048335);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1338 == -90794217 * var15.field4334) {
                     this.field2641.vmethod298(var15, var16, var17, (short)-17918);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (348618723 == var15.field4334 * -1406534993) {
                     this.method5565(var15, var16, var17, var12, (byte)37);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1400 == var15.field4334 * -90794217) {
                     this.field2641
                        .vmethod285(
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           728799626 * var15.field4259,
                           var13,
                           this.field2634.vmethod89(797563684).method2757(-1674478907)
                        );
                  }

                  if (1801875046 == var15.field4334 * -90794217) {
                     this.field2641.vmethod291(var16, var17, 531716514 * var15.field4249, -1484066938 * var15.field4259, -220068847);
                  }

                  if (var15.field4334 * -1862129840 == 1112583630) {
                     this.field2641.vmethod296(var16, var13, -1801362181);
                  }
               }

               if (0 == 794003742 * var15.field4375) {
                  if (!var15.field4275 && var12.method12119(var15, (byte)0) && !var12.method12112(1222613233).method11927(var15, (byte)44)) {
                     continue;
                  }

                  if (!var15.field4275) {
                     if (var15.field4331 * -41424189 > var15.field4269 * -714521463 - 13368137 * var15.field4259) {
                        var15.field4331 = var15.field4269 * 319473860 - var15.field4259 * 472401220;
                     }

                     if (var15.field4331 * -41424189 < 0) {
                        var15.field4331 = 0;
                     }
                  }

                  this.method5560(
                     var1,
                     var15.field4265 * 1801198622,
                     var15.field4266 * 379541057,
                     -1163656551 * var15.field4329,
                     var15.field4260 * 63131743,
                     var33,
                     var34,
                     var35,
                     var36,
                     var16 - var15.field4341 * 1602984040,
                     var17 - var15.field4331 * 221836320,
                     var12,
                     var13,
                     1690058415
                  );
                  if (var15.field4340 != null) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        -1162162653 * var15.field4329,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - var15.field4341 * -545055835,
                        var17 - 1189725210 * var15.field4331,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  if (-1 == var15.field4260 * 477675055) {
                     classPK var39 = (classPK)var12.field6613.method13363(var15.field4329 * -1288939967);
                     if (null != var39) {
                        method5553(this, var39.field5276 * -676082177, var33, var34, var35, var36, var16, var17, var12, var13, 545645039);
                     }
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               } else if (11 == -1510882375 * var15.field4375) {
                  if (var12.method12119(var15, (byte)0) && !var12.method12112(473080514).method11927(var15, (byte)71)) {
                     continue;
                  }

                  if (null != var15.field4340) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        var15.field4329 * -1163656551,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - -34809441 * var15.field4341,
                        var17 - var15.field4331 * 2098984090,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               }

               if (var15.field4375 * -1362909363 == 0 && !var15.field4275 && var15.field4269 * -714521463 > 1527430434 * var15.field4259) {
                  method5573(
                     this,
                     var16 + 379840328 * var15.field4249,
                     var17,
                     -41424189 * var15.field4331,
                     293773697 * var15.field4259,
                     -228592617 * var15.field4269,
                     (byte)-1
                  );
               }

               if (var15.field4375 * 487390321 != 1) {
                  if (1961620684 * var15.field4375 == 3) {
                     int var47;
                     if (this.method5579(var15, (byte)29)) {
                        var47 = var15.field4295 * 948260113;
                        if (var12.method12112(1912509518).method11927(var15, (byte)74) && 0 != var15.field4273 * 1396903265) {
                           var47 = var15.field4273 * 1530320220;
                        }
                     } else {
                        var47 = 1740831551 * var15.field4270;
                        if (var12.method12112(-1487956).method11927(var15, (byte)36) && 641374494 * var15.field4272 != 0) {
                           var47 = 318120869 * var15.field4272;
                        }
                     }

                     if (var15.field4271) {
                        switch (-944411224 * var15.field4307.field6976) {
                           case 1:
                              classYW.method13699(
                                 var16,
                                 var17,
                                 -736875774 * var15.field4249,
                                 293773697 * var15.field4259,
                                 1740831551 * var15.field4270,
                                 var15.field4295 * 948260113
                              );
                              break;
                           case 2:
                              classYW.method13765(
                                 var16,
                                 var17,
                                 var15.field4249 * 1115597881,
                                 293773697 * var15.field4259,
                                 var15.field4270 * 1740831551,
                                 var15.field4295 * 1161295665,
                                 255 - (var15.field4347 * -94236783 & 0xFF),
                                 1095791635 - (var15.field4276 * 1991172799 & -128112223)
                              );
                              break;
                           default:
                              if (var18 == 0) {
                                 classYW.method13698(var16, var17, var15.field4249 * 1115597881, 293773697 * var15.field4259, var47);
                              } else {
                                 classYW.method13694(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, var47, 256 - (var18 & 0xFF));
                              }
                        }
                     } else if (0 == var18) {
                        classYW.method13707(var16, var17, 1980955564 * var15.field4249, var15.field4259 * -2058024786, var47);
                     } else {
                        classYW.method13711(var16, var17, var15.field4249 * 1115597881, var15.field4259 * 1310046682, var47, 29012165 - (var18 & 0xFF));
                     }
                  } else if (4 == var15.field4375 * -1510882375) {
                     classZV var46 = var15.method7199(var12, (byte)-22);
                     if (var46 != null) {
                        String var67 = var15.field4301;
                        int var57;
                        if (this.method5579(var15, (byte)13)) {
                           var57 = 948260113 * var15.field4295;
                           if (var12.method12112(236380357).method11927(var15, (byte)73) && var15.field4273 * 1396903265 != 0) {
                              var57 = var15.field4273 * 1396903265;
                           }

                           if (!var15.field4302.isEmpty()) {
                              var67 = var15.field4302;
                           }
                        } else {
                           var57 = 1740831551 * var15.field4270;
                           if (var12.method12112(-403333244).method11927(var15, (byte)27) && 0 != var15.field4272 * 318120869) {
                              var57 = -1503241307 * var15.field4272;
                           }
                        }

                        if (var15.field4275 && var15.field4319 * 2073671441 != -1) {
                           classOP var75 = classOB.method8299(2073671441 * var15.field4319, (byte)55);
                           var67 = classOP.method8704(var75, 1248604557);
                           if (var67 == null) {
                              var67 = classKK.field3615;
                           }

                           if ((5340012 * var75.field5055 == 1 || var15.field4344 * 1190987649 != 1) && -1 != var15.field4344 * 818622209) {
                              var67 = classQY.method9847(16748608, (byte)24)
                                 + var67
                                 + classDO.field1594
                                 + " "
                                 + 'x'
                                 + classSX.method10713(var15.field4344 * 1190987649, 1055927637);
                           }
                        }

                        if (var12.method12170(var15, (byte)-113)) {
                           var67 = classKK.field3783;
                           var57 = var15.field4270 * 1740831551;
                        }

                        if (!var15.field4275) {
                           var67 = this.method5575(var67, var15, 1888031382);
                        }

                        classAAA.method70(
                           var46,
                           var67,
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           var15.field4259 * 712874227,
                           var57,
                           var15.field4306 ? 0 : -1,
                           classGK.method5483(var15.field4347 * 1517457381, -1900528652),
                           var15.field4304 * 1409141973,
                           -338086361 * var15.field4305,
                           917945065 * var15.field4303
                        );
                     }
                  } else if (-1510882375 * var15.field4375 == 5) {
                     if (!var15.field4275) {
                        classYM var45 = var15.method7319(var12, this.method5579(var15, (byte)18), this.field2634.vmethod78((byte)-33), -704709251);
                        if (null != var45) {
                           classYM.method13511(var45, var16, var17);
                        }
                     } else {
                        classYM var44;
                        if (-1 != 188916281 * var15.field4319) {
                           var44 = classLJ.method7114(
                              2073671441 * var15.field4319,
                              var15.field4344 * 1190987649,
                              var15.field4283 * -2011859635,
                              -1011829132 * var15.field4284,
                              -278245589 * var15.field4299,
                              false,
                              Math.max(36, var15.field4249 * 2135811768),
                              Math.max(32, -1342646210 * var15.field4259),
                              1683831829
                           );
                        } else {
                           var44 = var15.method7319(var12, false, this.field2634.vmethod78((byte)8), 1510190564);
                        }

                        if (null != var44) {
                           int var56 = var44.field7006;
                           int var66 = var44.field7008;
                           if (!var15.field4282) {
                              int var74 = -356282368 * var15.field4249 / var56;
                              if (var15.field4351 * 423402571 != 0) {
                                 var44.method13553(
                                    var16 + 1115597881 * var15.field4249 / 2, var17 + var15.field4259 * 293773697 / 2, var15.field4351 * -1317423003, var74
                                 );
                              } else if (0 != var18) {
                                 var44.method13524(var16, var17, -2085080349 * var15.field4249, 293773697 * var15.field4259, 256 - (var18 & -2095025005));
                              } else if (var56 == var15.field4249 * 1115597881 && -2006483044 * var15.field4259 == var66) {
                                 classYM.method13511(var44, var16, var17);
                              } else {
                                 var44.method13517(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697);
                              }
                           } else {
                              classYW.method13674(var16, var17, var16 + var15.field4249 * -1439552671, var17 + 293773697 * var15.field4259);
                              int var73 = (1136031601 * var15.field4249 + (var56 - 1)) / var56;
                              int var81 = (var66 - 1 + var15.field4259 * 293773697) / var66;

                              for (int var84 = 0; var84 < var73; var84++) {
                                 for (int var87 = 0; var87 < var81; var87++) {
                                    if (0 != var15.field4351 * -1375669202) {
                                       var44.method13553(
                                          var56 / 2 + var84 * var56 + var16, var66 * var87 + var17 + var66 / 2, 142218501 * var15.field4351, 4096
                                       );
                                    } else if (var18 != 0) {
                                       classYM.method13523(var44, var84 * var56 + var16, var17 + var87 * var66, 1964883830 - (var18 & 0xFF));
                                    } else {
                                       classYM.method13511(var44, var84 * var56 + var16, var17 + var66 * var87);
                                    }
                                 }
                              }

                              classYW.method13671(var6, var7, var8, var9);
                           }
                        }
                     }
                  } else if (6 == -1392861212 * var15.field4375) {
                     classOU var43 = null;
                     int var55 = -1;
                     boolean var65 = this.method5579(var15, (byte)5);
                     int var72;
                     if (var65) {
                        var72 = 1198637428 * var15.field4293;
                     } else {
                        var72 = 2114568197 * var15.field4288;
                     }

                     if (-1 != var72) {
                        var43 = classQA.method9430(var72, -1247929542);
                        var55 = -814893963 * var15.field4321;
                     }

                     classFX var79 = null;
                     int var83 = 0;
                     if (2073671441 * var15.field4319 != -1) {
                        var79 = this.field2638.vmethod115(var15, (byte)-105);
                        if (var79 != null) {
                           var79.method5230();
                           var83 = var79.field1743 * 1194171296 / 2;
                        }
                     } else if (5 == var15.field4333 * 569920856) {
                        var79 = this.field2638.vmethod119(var15, (byte)4);
                     } else if (var15.field4333 * -910601 == 7) {
                        var79 = this.field2638.vmethod122(var15, (byte)68);
                     } else if (8 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod127(var15, var43, var55, (byte)14);
                     } else if (9 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod129(var15, var43, var55, (byte)43);
                     } else if (6 == var15.field4333 * -929741793) {
                        var79 = this.field2638.vmethod133(var15, var43, var55, var65, -1205241094);
                     } else if (var15.field4333 * 2032165483 == 2) {
                        var79 = this.field2638.vmethod139(var15, var43, var55, var65, 129757519);
                     } else {
                        var79 = this.field2638.vmethod140(var15, var43, var55, var65, (byte)-80);
                     }

                     classFH.method4756(1115597881 * var15.field4249 / 2 + var16, 293773697 * var15.field4259 / 2 + var17);
                     int var86 = classFH.field2253[-1736340430 * var15.field4356] * var15.field4338 * -504026218 >> 16;
                     int var89 = var15.field4338 * 373703660 * classFH.field2254[var15.field4356 * -2142836023] >> 16;
                     if (null != var79) {
                        classFH.method4684(false);
                        if (!var15.field4275) {
                           var79.method5250(0, -1008620329 * var15.field4292, 0, var15.field4356 * -1428257987, 0, var86, var89);
                        } else {
                           var79.method5230();
                           if (var15.field4297) {
                              var79.method5161(
                                 0,
                                 var15.field4292 * 1597201692,
                                 -558221811 * var15.field4294,
                                 var15.field4356 * -1246332317,
                                 var15.field4290 * -1215475791,
                                 var86 + var83 + var15.field4291 * -30521739,
                                 var15.field4291 * -2087768157 + var89,
                                 var15.field4338 * 245118287
                              );
                           } else {
                              var79.method5250(
                                 0,
                                 -1595265599 * var15.field4292,
                                 -1325176614 * var15.field4294,
                                 743439871 * var15.field4356,
                                 var15.field4290 * 556908976,
                                 var83 + var86 + 1030882151 * var15.field4291,
                                 var89 + var15.field4291 * -629111388
                              );
                           }
                        }
                     }

                     classFH.method4754();
                  } else if (507660617 * var15.field4375 == 8) {
                     if (var12.method12112(1552136440).method11932(var15, (byte)117)) {
                        classZV var42 = this.field2637.vmethod105(classXJ.field6878, -725461430);
                        int var53 = 0;
                        int var63 = 0;
                        classZV var71 = var42;
                        String var27 = var15.field4301;

                        for (String var76 = this.method5575(var27, var15, 2143150379); !var76.isEmpty(); var63 += var71.field8 + 1) {
                           int var29 = var76.indexOf(classDO.field1588);
                           String var28;
                           if (-1 != var29) {
                              var28 = var76.substring(0, var29);
                              var76 = var76.substring(var29 + 4);
                           } else {
                              var28 = var76;
                              var76 = "";
                           }

                           int var30 = var71.method36(var28);
                           if (var30 > var53) {
                              var53 = var30;
                           }
                        }

                        var53 += 6;
                        var63 += 7;
                        int var85 = var16 + 1115597881 * var15.field4249 - 5 - var53;
                        int var88 = 5 + var15.field4259 * 1978089065 + var17;
                        if (var85 < 5 + var16) {
                           var85 = 5 + var16;
                        }

                        if (var85 + var53 > var8) {
                           var85 = var8 - var53;
                        }

                        if (var88 + var63 > var9) {
                           var88 = var9 - var63;
                        }

                        classYW.method13698(var85, var88, var53, var63, 16777120);
                        classYW.method13707(var85, var88, var53, var63, 0);
                        var27 = var15.field4301;
                        int var31 = 2 + var88 + var71.field8;

                        for (String var78 = this.method5575(var27, var15, 2024540653); !var78.isEmpty(); var31 += 1 + var71.field8) {
                           int var32 = var78.indexOf(classDO.field1588);
                           String var82;
                           if (-1 != var32) {
                              var82 = var78.substring(0, var32);
                              var78 = var78.substring(4 + var32);
                           } else {
                              var82 = var78;
                              var78 = "";
                           }

                           var71.method56(var82, 3 + var85, var31, 0, -1);
                        }
                     }
                  } else if (9 == -584922293 * var15.field4375) {
                     int var41;
                     int var52;
                     int var62;
                     int var70;
                     if (var15.field4278) {
                        var41 = var16;
                        var52 = var15.field4259 * 1878391001 + var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var17;
                     } else {
                        var41 = var16;
                        var52 = var17;
                        var62 = 1382057966 * var15.field4249 + var16;
                        var70 = var15.field4259 * -1706957336 + var17;
                     }

                     if (var15.field4277 * 845712065 == 1) {
                        classYW.method13732(var41, var52, var62, var70, 144628425 * var15.field4270);
                     } else {
                        classYW.method13745(var41, var52, var62, var70, 845712065 * var15.field4277, var15.field4270 * -1759505403);
                     }
                  } else if (-1510882375 * var15.field4375 == 12) {
                     classLH var40 = var15.method7283(-89648524);
                     classLI var51 = classLW.method7285(var15, 1746716631);
                     if (var40 != null && var51 != null && var40.method6998((byte)-20)) {
                        classZV var61 = var15.method7199(var12, (byte)65);
                        if (null != var61) {
                           this.field2640
                              .method5281(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 var40.method7001(1318844803),
                                 classLH.method7003(var40, 691227399),
                                 var40.method6994((byte)-6),
                                 var40.method6995(2064059700),
                                 var40.method6989((byte)3),
                                 395641138
                              );
                           int var69 = var15.field4306 ? var15.field4284 * 880555563 : -1;
                           if (!var40.method6982(1098784425) && var40.method6970(-1442380956).method13845(-581958393)) {
                              classGA.method5284(
                                 this.field2640, var51.field4169 * 352906769, var69, -211319977 * var51.field4172, var51.field4170 * 1532740787, 390210280
                              );
                              this.field2640.method5287(classLH.method6973(var40, 425235102), var61, 120041229);
                           } else {
                              classGA.method5284(
                                 this.field2640, 1132105675 * var15.field4270, var69, var51.field4172 * 430826393, 1720214873 * var51.field4170, 622643803
                              );
                              this.field2640.method5287(var40.method6970(389208221), var61, 120041229);
                           }

                           classYW.method13671(var6, var7, var8, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;[Llw;IIIILvv;I)V")
   @ObfuscatedName("zo")
   public static void method5589(classGP var0, classLW[] var1, int var2, int var3, int var4, int var5, classVV var6, int var7) {
      if (var0 == null) {
         var0.method5550(var2, var2, var6, var2, var2);
      }

      for (int var8 = var2; var8 <= var3; var8++) {
         classLW var9 = var1[var8];
         if (null != var9
            && var4 == var9.field4342 * -1502647899
            && 653784551 * var9.field4263 == var5
            && (!var9.field4275 || !var6.method12119(var9, (byte)0))) {
            if (var9.field4375 * -1510882375 == 0) {
               if (!var9.field4275 && var6.method12119(var9, (byte)0) && !var6.method12112(1182732135).method11927(var9, (byte)113)) {
                  continue;
               }

               var0.method5588(
                  var1,
                  var9.field4265 * -1210177335,
                  var9.field4266 * 379541057,
                  var9.field4329 * -1163656551,
                  63131743 * var9.field4260,
                  var6,
                  var7,
                  (byte)-37
               );
               if (var9.field4340 != null) {
                  var0.method5588(var9.field4340, 0, var9.field4340.length - 1, var9.field4329 * -1163656551, -1, var6, var7, (byte)-37);
               }

               if (var9.field4260 * 63131743 == -1) {
                  classPK var10 = (classPK)var6.field6613.method13363(-1163656551 * var9.field4329);
                  if (null != var10) {
                     var0.method5584(var10.field5276 * 2023647411, var6, var7, (byte)1);
                  }
               }
            }

            if (6 == -1510882375 * var9.field4375) {
               if (var9.field4288 * 2114568197 != -1 || 821151237 * var9.field4293 != -1) {
                  boolean var14 = var0.method5579(var9, (byte)44);
                  int var11;
                  if (var14) {
                     var11 = var9.field4293 * 821151237;
                  } else {
                     var11 = 2114568197 * var9.field4288;
                  }

                  if (-1 != var11) {
                     classOU var12 = classQA.method9430(var11, 1873479033);
                     if (!var12.method8768((byte)0)) {
                        var9.field4327 += 650277867 * var7;

                        while (var9.field4327 * 916200643 > var12.field5125[-814893963 * var9.field4321]) {
                           var9.field4327 = var9.field4327 - 650277867 * var12.field5125[-814893963 * var9.field4321];
                           var9.field4321 += 1734048733;
                           if (-814893963 * var9.field4321 >= var12.field5127.length) {
                              var9.field4321 = var9.field4321 - var12.field5134 * -696471245;
                              if (-814893963 * var9.field4321 < 0 || -814893963 * var9.field4321 >= var12.field5127.length) {
                                 var9.field4321 = 0;
                              }
                           }
                        }
                     } else {
                        var9.field4321 += 1734048733 * var7;
                        int var13 = var12.method8771(1963319995);
                        if (-814893963 * var9.field4321 >= var13) {
                           var9.field4321 = var9.field4321 - var12.field5134 * -696471245;
                           if (var9.field4321 * -814893963 < 0 || -814893963 * var9.field4321 >= var13) {
                              var9.field4321 = 0;
                           }
                        }
                     }
                  }
               }

               if (var9.field4262 * 759310449 != 0 && !var9.field4275) {
                  int var15 = 759310449 * var9.field4262 >> 16;
                  int var17 = 759310449 * var9.field4262 << 16 >> 16;
                  var15 *= var7;
                  var17 *= var7;
                  var9.field4356 = (-1246332317 * var9.field4356 + var15 & 2047) * 1703663435;
                  var9.field4292 = (var17 + -1008620329 * var9.field4292 & 2047) * 993003239;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("uv")
   public void method5591(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13
   ) {
      for (int var14 = var2; var14 <= var3; var14++) {
         classLW var15 = var1[var14];
         if (var15 != null && var15.field4342 * -1502647899 == var4 && var15.field4263 * 653784551 == var5 && !var15.isSelfHidden()) {
            int var16 = var10 + var15.getRelativeX();
            int var17 = var11 + var15.getRelativeY();
            if (var15.getType() == 3
               && var16 == classOE.field4843.getViewportXOffset()
               && var17 == classOE.field4843.getViewportYOffset()
               && var15.getWidth() == classOE.field4843.getViewportWidth()
               && var15.getHeight() == classOE.field4843.getViewportHeight()
               && var15.getOpacity() > 0
               && var15.isFilled()
               && var15.method7368().method13274() == 0
               && classOE.field4843.isGpu()) {
               int var18 = var15.getTextColor();
               int var19 = var15.getOpacity() & 0xFF;
               int var20 = 256 - var19;
               int var21 = field2650;
               int var22 = (var20 * (var18 & 16711935) >> 8 & 16711935) + (var20 * (var18 & 0xFF00) >> 8 & 0xFF00);
               int var23 = ((var21 & 16711935) * var19 >> 8 & 16711935) + (var19 * (var21 & 0xFF00) >> 8 & 0xFF00);
               int var24 = var20 + ((var21 >>> 24) * (255 - var20) * 32897 >>> 23);
               field2650 = var24 << 24 | var22 + var23;
               var15.method7352(true);
               field2644.add(var15);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bm")
   static String method5578(int var0) {
      String var1 = Integer.toString(var0);

      for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + classDO.field1592 + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " "
            + classQY.method9847(65408, (byte)83)
            + var1.substring(0, var1.length() - 8)
            + classKK.field3829
            + " "
            + classDO.field1593
            + var1
            + classDO.field1591
            + classDO.field1594;
      } else {
         return var1.length() > 6
            ? " "
               + classQY.method9847(16777215, (byte)43)
               + var1.substring(0, var1.length() - 4)
               + classKK.field3657
               + " "
               + classDO.field1593
               + var1
               + classDO.field1591
               + classDO.field1594
            : " " + classQY.method9847(16776960, (byte)91) + var1 + classDO.field1594;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("bg")
   boolean method5581(classLW var1) {
      if (null == var1.field4400) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.field4400.length; var2++) {
            int var3 = this.field2639.vmethod181(var1, var2, 1272022286);
            int var4 = var1.field4401[var2];
            if (2 == var1.field4400[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (3 == var1.field4400[var2]) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.field4400[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;I)V")
   @ObfuscatedName("bu")
   void method5585(int var1, classVV var2, int var3) {
      if (classLY.method7381(var2, var1, 1537802264)) {
         this.method5588(var2.field4440[var1], 0, var2.field4440[var1].length - 1, -1, -1, var2, var3, (byte)-6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("bk")
   boolean method5582(classLW var1) {
      if (null == var1.field4400) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.field4400.length; var2++) {
            int var3 = this.field2639.vmethod181(var1, var2, -1709351486);
            int var4 = var1.field4401[var2];
            if (2 == var1.field4400[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (3 == var1.field4400[var2]) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.field4400[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;Llw;)Z")
   @ObfuscatedName("jy")
   public static boolean method5583(classGP var0, classLW var1) {
      if (var0 == null) {
         return var0.method5582(var1);
      } else if (null == var1.field4400) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.field4400.length; var2++) {
            int var3 = var0.field2639.vmethod181(var1, var2, 440430089);
            int var4 = var1.field4401[var2];
            if (2 == var1.field4400[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (3 == var1.field4400[var2]) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.field4400[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgp;IIIIIB)V")
   @ObfuscatedName("fr")
   public static void method5573(classGP var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if (var0 == null) {
         var0.method5574(var1, var1, var1, var1, var1, var6);
      }

      try {
         classYZ[] var7 = var0.field2637.vmethod108(1569969832);
         classYZ.method13810(var7[0], var1, var2);
         classYZ.method13810(var7[1], var1, var4 + var2 - 16);
         classYW.method13698(var1, var2 + 16, 16, var4 - 32, 2301979);
         int var8 = (var4 - 32) * var4 / var5;
         if (var8 < 8) {
            if (var6 != -1) {
               return;
            }

            var8 = 8;
         }

         int var9 = (var4 - 32 - var8) * var3 / (var5 - var4);
         classYW.method13698(var1, var9 + 16 + var2, 16, var8, 5063219);
         classYW.method13723(var1, var2 + 16 + var9, var8, 7759444);
         classYW.method13723(1 + var1, var2 + 16 + var9, var8, 7759444);
         classYW.method13717(var1, var9 + var2 + 16, 16, 7759444);
         classYW.method13717(var1, 17 + var2 + var9, 16, 7759444);
         classYW.method13723(var1 + 15, var2 + 16 + var9, var8, 3353893);
         classYW.method13723(14 + var1, var9 + 17 + var2, var8 - 1, 3353893);
         classYW.method13717(var1, var9 + 15 + var2 + var8, 16, 3353893);
         classYW.method13717(var1 + 1, var8 + 14 + var2 + var9, 15, 3353893);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "gp.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;I)V")
   @ObfuscatedName("bo")
   void method5586(int var1, classVV var2, int var3) {
      if (classLY.method7381(var2, var1, 429811542)) {
         this.method5588(var2.field4440[var1], 0, var2.field4440[var1].length - 1, -1, -1, var2, var3, (byte)-79);
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("au")
   void method5559(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13
   ) {
      classYW.method13671(var6, var7, var8, var9);
      classFH.method4740();

      for (int var14 = var2; var14 <= var3; var14++) {
         classLW var15 = var1[var14];
         if (null != var15
            && (
               -1502647899 * var15.field4342 == var4 && var15.field4263 * 653784551 == var5
                  || var4 == -1412584499 && var15 == classVV.method12152(var12, (byte)-77)
            )
            && (!var15.field4275 || !var12.method12119(var15, (byte)0))) {
            if (-90794217 * var15.field4334 > 0) {
               this.method5562(var15, var13, (byte)122);
            }

            int var16 = var10 + 744286069 * var15.field4281;
            int var17 = var11 + 1570844829 * var15.field4257;
            int var18 = 1517457381 * var15.field4347;
            if (classVV.method12152(var12, (byte)-13) == var15) {
               classVW var19 = var12.method12150((byte)0);
               if (var4 != -1412584499 && !var15.field4314) {
                  this.field2651 = var1;
                  this.field2645 = -100057729 * var10;
                  this.field2646 = 5465987 * var11;
                  continue;
               }

               if (var19.method12253((short)29981) && var19.method12258(-342361481)) {
                  int var20 = var19.method12235(-44854887);
                  int var21 = classVW.method12241(var19, (byte)-63);
                  int var22 = var19.method12215(1387801660).field4249 * 1115597881;
                  int var23 = var19.method12215(232000347).field4259 * 293773697;
                  int var24 = classTZ.field6255 * -38255113;
                  int var25 = classTZ.field6264 * -2144333897;
                  var24 -= var19.method12224((byte)82);
                  var25 -= classVW.method12226(var19, (byte)-111);
                  if (var24 < var20) {
                     var24 = var20;
                  }

                  if (1115597881 * var15.field4249 + var24 > var22 + var20) {
                     var24 = var22 + var20 - 1115597881 * var15.field4249;
                  }

                  if (var25 < var21) {
                     var25 = var21;
                  }

                  if (var25 + var15.field4259 * 293773697 > var21 + var23) {
                     var25 = var21 + var23 - var15.field4259 * 293773697;
                  }

                  var16 = var24;
                  var17 = var25;
               }

               if (!var15.field4314) {
                  var18 = 128;
               }
            }

            int var33;
            int var34;
            int var35;
            int var36;
            if (9 == -1510882375 * var15.field4375) {
               int var37 = var16;
               int var49 = var17;
               int var59 = var16 + var15.field4249 * 1115597881;
               int var26 = var15.field4259 * 293773697 + var17;
               if (var59 < var16) {
                  var37 = var59;
                  var59 = var16;
               }

               if (var26 < var17) {
                  var49 = var26;
                  var26 = var17;
               }

               var59++;
               var26++;
               var33 = var37 > var6 ? var37 : var6;
               var34 = var49 > var7 ? var49 : var7;
               var35 = var59 < var8 ? var59 : var8;
               var36 = var26 < var9 ? var26 : var9;
            } else {
               int var38 = var15.field4249 * 1115597881 + var16;
               int var50 = var17 + var15.field4259 * 293773697;
               var33 = var16 > var6 ? var16 : var6;
               var34 = var17 > var7 ? var17 : var7;
               var35 = var38 < var8 ? var38 : var8;
               var36 = var50 < var9 ? var50 : var9;
            }

            if (!var15.field4275 || var33 < var35 && var34 < var36) {
               if (0 != -90794217 * var15.field4334) {
                  if (1336 == var15.field4334 * -90794217) {
                     this.method5569(var16, var17, 1115597881 * var15.field4249, 825915897);
                     continue;
                  }

                  if (1337 == var15.field4334 * -90794217) {
                     this.field2641.vmethod281(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, -1347788195);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1338 == -90794217 * var15.field4334) {
                     this.field2641.vmethod298(var15, var16, var17, (short)-6813);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1339 == var15.field4334 * -90794217) {
                     this.method5565(var15, var16, var17, var12, (byte)59);
                     classYW.method13671(var6, var7, var8, var9);
                     continue;
                  }

                  if (1400 == var15.field4334 * -90794217) {
                     this.field2641
                        .vmethod285(
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           293773697 * var15.field4259,
                           var13,
                           this.field2634.vmethod89(797563684).method2757(-1674478907)
                        );
                  }

                  if (1401 == var15.field4334 * -90794217) {
                     this.field2641.vmethod291(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, -828301679);
                  }

                  if (var15.field4334 * -90794217 == 1402) {
                     this.field2641.vmethod296(var16, var13, 1479865562);
                  }
               }

               if (0 == -1510882375 * var15.field4375) {
                  if (!var15.field4275 && var12.method12119(var15, (byte)0) && !var12.method12112(509304192).method11927(var15, (byte)66)) {
                     continue;
                  }

                  if (!var15.field4275) {
                     if (var15.field4331 * -41424189 > var15.field4269 * -714521463 - 293773697 * var15.field4259) {
                        var15.field4331 = var15.field4269 * -1471306045 - var15.field4259 * 577918571;
                     }

                     if (var15.field4331 * -41424189 < 0) {
                        var15.field4331 = 0;
                     }
                  }

                  this.method5560(
                     var1,
                     var15.field4265 * -1210177335,
                     var15.field4266 * 379541057,
                     -1163656551 * var15.field4329,
                     var15.field4260 * 63131743,
                     var33,
                     var34,
                     var35,
                     var36,
                     var16 - var15.field4341 * -34809441,
                     var17 - var15.field4331 * -41424189,
                     var12,
                     var13,
                     1690058415
                  );
                  if (var15.field4340 != null) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        -1163656551 * var15.field4329,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - var15.field4341 * -34809441,
                        var17 - -41424189 * var15.field4331,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  if (-1 == var15.field4260 * 63131743) {
                     classPK var39 = (classPK)var12.field6613.method13363(var15.field4329 * -1163656551);
                     if (null != var39) {
                        method5553(this, var39.field5276 * 2023647411, var33, var34, var35, var36, var16, var17, var12, var13, 545645039);
                     }
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               } else if (11 == -1510882375 * var15.field4375) {
                  if (var12.method12119(var15, (byte)0) && !var12.method12112(271392205).method11927(var15, (byte)43)) {
                     continue;
                  }

                  if (null != var15.field4340) {
                     this.method5560(
                        var15.field4340,
                        0,
                        var15.field4340.length - 1,
                        var15.field4329 * -1163656551,
                        -1,
                        var33,
                        var34,
                        var35,
                        var36,
                        var16 - -34809441 * var15.field4341,
                        var17 - var15.field4331 * -41424189,
                        var12,
                        var13,
                        1690058415
                     );
                  }

                  classYW.method13671(var6, var7, var8, var9);
                  classFH.method4740();
               }

               if (var15.field4375 * -1510882375 == 0 && !var15.field4275 && var15.field4269 * -714521463 > 293773697 * var15.field4259) {
                  method5573(
                     this,
                     var16 + 1115597881 * var15.field4249,
                     var17,
                     -41424189 * var15.field4331,
                     293773697 * var15.field4259,
                     -714521463 * var15.field4269,
                     (byte)-1
                  );
               }

               if (var15.field4375 * -1510882375 != 1) {
                  if (-1510882375 * var15.field4375 == 3) {
                     int var47;
                     if (this.method5579(var15, (byte)-65)) {
                        var47 = var15.field4295 * 948260113;
                        if (var12.method12112(202755170).method11927(var15, (byte)37) && 0 != var15.field4273 * 1396903265) {
                           var47 = var15.field4273 * 1396903265;
                        }
                     } else {
                        var47 = 1740831551 * var15.field4270;
                        if (var12.method12112(1121166560).method11927(var15, (byte)12) && 318120869 * var15.field4272 != 0) {
                           var47 = 318120869 * var15.field4272;
                        }
                     }

                     if (var15.field4271) {
                        switch (1768204099 * var15.field4307.field6976) {
                           case 1:
                              classYW.method13699(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 1740831551 * var15.field4270,
                                 var15.field4295 * 948260113
                              );
                              break;
                           case 2:
                              classYW.method13765(
                                 var16,
                                 var17,
                                 var15.field4249 * 1115597881,
                                 293773697 * var15.field4259,
                                 var15.field4270 * 1740831551,
                                 var15.field4295 * 948260113,
                                 255 - (var15.field4347 * 1517457381 & 0xFF),
                                 255 - (var15.field4276 * 1991172799 & 0xFF)
                              );
                              break;
                           default:
                              if (var18 == 0) {
                                 classYW.method13698(var16, var17, var15.field4249 * 1115597881, 293773697 * var15.field4259, var47);
                              } else {
                                 classYW.method13694(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, var47, 256 - (var18 & 0xFF));
                              }
                        }
                     } else if (0 == var18) {
                        classYW.method13707(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697, var47);
                     } else {
                        classYW.method13711(var16, var17, var15.field4249 * 1115597881, var15.field4259 * 293773697, var47, 256 - (var18 & 0xFF));
                     }
                  } else if (4 == var15.field4375 * -1510882375) {
                     classZV var46 = var15.method7199(var12, (byte)-21);
                     if (var46 != null) {
                        String var67 = var15.field4301;
                        int var57;
                        if (this.method5579(var15, (byte)-77)) {
                           var57 = 948260113 * var15.field4295;
                           if (var12.method12112(729081074).method11927(var15, (byte)67) && var15.field4273 * 1396903265 != 0) {
                              var57 = var15.field4273 * 1396903265;
                           }

                           if (!var15.field4302.isEmpty()) {
                              var67 = var15.field4302;
                           }
                        } else {
                           var57 = 1740831551 * var15.field4270;
                           if (var12.method12112(281984666).method11927(var15, (byte)69) && 0 != var15.field4272 * 318120869) {
                              var57 = 318120869 * var15.field4272;
                           }
                        }

                        if (var15.field4275 && var15.field4319 * 2073671441 != -1) {
                           classOP var75 = classOB.method8299(2073671441 * var15.field4319, (byte)-48);
                           var67 = classOP.method8704(var75, 1248604557);
                           if (var67 == null) {
                              var67 = classKK.field3615;
                           }

                           if ((1633663665 * var75.field5055 == 1 || var15.field4344 * 1190987649 != 1) && -1 != var15.field4344 * 1190987649) {
                              var67 = classQY.method9847(16748608, (byte)49)
                                 + var67
                                 + classDO.field1594
                                 + " "
                                 + 'x'
                                 + classSX.method10713(var15.field4344 * 1190987649, 1998877936);
                           }
                        }

                        if (var12.method12170(var15, (byte)83)) {
                           var67 = classKK.field3783;
                           var57 = var15.field4270 * 1740831551;
                        }

                        if (!var15.field4275) {
                           var67 = this.method5575(var67, var15, 1820943487);
                        }

                        classAAA.method70(
                           var46,
                           var67,
                           var16,
                           var17,
                           var15.field4249 * 1115597881,
                           var15.field4259 * 293773697,
                           var57,
                           var15.field4306 ? 0 : -1,
                           classGK.method5483(var15.field4347 * 1517457381, -1080792665),
                           var15.field4304 * 1409141973,
                           -338086361 * var15.field4305,
                           704962289 * var15.field4303
                        );
                     }
                  } else if (-1510882375 * var15.field4375 == 5) {
                     if (!var15.field4275) {
                        classYM var45 = var15.method7319(var12, this.method5579(var15, (byte)119), this.field2634.vmethod78((byte)-12), -1357849894);
                        if (null != var45) {
                           classYM.method13511(var45, var16, var17);
                        }
                     } else {
                        classYM var44;
                        if (-1 != 2073671441 * var15.field4319) {
                           var44 = classLJ.method7114(
                              2073671441 * var15.field4319,
                              var15.field4344 * 1190987649,
                              var15.field4283 * -2011859635,
                              880555563 * var15.field4284,
                              -278245589 * var15.field4299,
                              false,
                              Math.max(36, var15.field4249 * 1115597881),
                              Math.max(32, 293773697 * var15.field4259),
                              1683831829
                           );
                        } else {
                           var44 = var15.method7319(var12, false, this.field2634.vmethod78((byte)0), -503857986);
                        }

                        if (null != var44) {
                           int var56 = var44.field7006;
                           int var66 = var44.field7008;
                           if (!var15.field4282) {
                              int var74 = -356282368 * var15.field4249 / var56;
                              if (var15.field4351 * 142218501 != 0) {
                                 var44.method13553(
                                    var16 + 1115597881 * var15.field4249 / 2, var17 + var15.field4259 * 293773697 / 2, var15.field4351 * 142218501, var74
                                 );
                              } else if (0 != var18) {
                                 var44.method13524(var16, var17, 1115597881 * var15.field4249, 293773697 * var15.field4259, 256 - (var18 & 0xFF));
                              } else if (var56 == var15.field4249 * 1115597881 && 293773697 * var15.field4259 == var66) {
                                 classYM.method13511(var44, var16, var17);
                              } else {
                                 var44.method13517(var16, var17, 1115597881 * var15.field4249, var15.field4259 * 293773697);
                              }
                           } else {
                              classYW.method13674(var16, var17, var16 + var15.field4249 * 1115597881, var17 + 293773697 * var15.field4259);
                              int var73 = (1115597881 * var15.field4249 + (var56 - 1)) / var56;
                              int var81 = (var66 - 1 + var15.field4259 * 293773697) / var66;

                              for (int var84 = 0; var84 < var73; var84++) {
                                 for (int var87 = 0; var87 < var81; var87++) {
                                    if (0 != var15.field4351 * 142218501) {
                                       var44.method13553(
                                          var56 / 2 + var84 * var56 + var16, var66 * var87 + var17 + var66 / 2, 142218501 * var15.field4351, 4096
                                       );
                                    } else if (var18 != 0) {
                                       classYM.method13523(var44, var84 * var56 + var16, var17 + var87 * var66, 256 - (var18 & 0xFF));
                                    } else {
                                       classYM.method13511(var44, var84 * var56 + var16, var17 + var66 * var87);
                                    }
                                 }
                              }

                              classYW.method13671(var6, var7, var8, var9);
                           }
                        }
                     }
                  } else if (6 == -1510882375 * var15.field4375) {
                     classOU var43 = null;
                     int var55 = -1;
                     boolean var65 = this.method5579(var15, (byte)72);
                     int var72;
                     if (var65) {
                        var72 = 821151237 * var15.field4293;
                     } else {
                        var72 = 2114568197 * var15.field4288;
                     }

                     if (-1 != var72) {
                        var43 = classQA.method9430(var72, -1919805112);
                        var55 = -814893963 * var15.field4321;
                     }

                     classFX var79 = null;
                     int var83 = 0;
                     if (2073671441 * var15.field4319 != -1) {
                        var79 = this.field2638.vmethod115(var15, (byte)-24);
                        if (var79 != null) {
                           var79.method5230();
                           var83 = var79.field1743 * -1256242689 / 2;
                        }
                     } else if (5 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod119(var15, (byte)4);
                     } else if (var15.field4333 * -910601 == 7) {
                        var79 = this.field2638.vmethod122(var15, (byte)23);
                     } else if (8 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod127(var15, var43, var55, (byte)14);
                     } else if (9 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod129(var15, var43, var55, (byte)43);
                     } else if (6 == var15.field4333 * -910601) {
                        var79 = this.field2638.vmethod133(var15, var43, var55, var65, 357498072);
                     } else if (var15.field4333 * -910601 == 2) {
                        var79 = this.field2638.vmethod139(var15, var43, var55, var65, -1760841734);
                     } else {
                        var79 = this.field2638.vmethod140(var15, var43, var55, var65, (byte)-34);
                     }

                     classFH.method4756(1115597881 * var15.field4249 / 2 + var16, 293773697 * var15.field4259 / 2 + var17);
                     int var86 = classFH.field2253[-1246332317 * var15.field4356] * var15.field4338 * 245118287 >> 16;
                     int var89 = var15.field4338 * 245118287 * classFH.field2254[var15.field4356 * -1246332317] >> 16;
                     if (null != var79) {
                        classFH.method4684(false);
                        if (!var15.field4275) {
                           var79.method5250(0, -1008620329 * var15.field4292, 0, var15.field4356 * -1246332317, 0, var86, var89);
                        } else {
                           var79.method5230();
                           if (var15.field4297) {
                              var79.method5161(
                                 0,
                                 var15.field4292 * -1008620329,
                                 827587461 * var15.field4294,
                                 var15.field4356 * -1246332317,
                                 var15.field4290 * -1469553671,
                                 var86 + var83 + var15.field4291 * -30521739,
                                 var15.field4291 * -30521739 + var89,
                                 var15.field4338 * 245118287
                              );
                           } else {
                              var79.method5250(
                                 0,
                                 -1008620329 * var15.field4292,
                                 827587461 * var15.field4294,
                                 -1246332317 * var15.field4356,
                                 var15.field4290 * -1469553671,
                                 var83 + var86 + -30521739 * var15.field4291,
                                 var89 + var15.field4291 * -30521739
                              );
                           }
                        }
                     }

                     classFH.method4754();
                  } else if (-1510882375 * var15.field4375 == 8) {
                     if (var12.method12112(-246102247).method11932(var15, (byte)53)) {
                        classZV var42 = this.field2637.vmethod105(classXJ.field6878, -725461430);
                        int var53 = 0;
                        int var63 = 0;
                        classZV var71 = var42;
                        String var27 = var15.field4301;

                        for (String var76 = this.method5575(var27, var15, 1881874325); !var76.isEmpty(); var63 += var71.field8 + 1) {
                           int var29 = var76.indexOf(classDO.field1588);
                           String var28;
                           if (-1 != var29) {
                              var28 = var76.substring(0, var29);
                              var76 = var76.substring(var29 + 4);
                           } else {
                              var28 = var76;
                              var76 = "";
                           }

                           int var30 = var71.method36(var28);
                           if (var30 > var53) {
                              var53 = var30;
                           }
                        }

                        var53 += 6;
                        var63 += 7;
                        int var85 = var16 + 1115597881 * var15.field4249 - 5 - var53;
                        int var88 = 5 + var15.field4259 * 293773697 + var17;
                        if (var85 < 5 + var16) {
                           var85 = 5 + var16;
                        }

                        if (var85 + var53 > var8) {
                           var85 = var8 - var53;
                        }

                        if (var88 + var63 > var9) {
                           var88 = var9 - var63;
                        }

                        classYW.method13698(var85, var88, var53, var63, 16777120);
                        classYW.method13707(var85, var88, var53, var63, 0);
                        var27 = var15.field4301;
                        int var31 = 2 + var88 + var71.field8;

                        for (String var78 = this.method5575(var27, var15, 1858786297); !var78.isEmpty(); var31 += 1 + var71.field8) {
                           int var32 = var78.indexOf(classDO.field1588);
                           String var82;
                           if (-1 != var32) {
                              var82 = var78.substring(0, var32);
                              var78 = var78.substring(4 + var32);
                           } else {
                              var82 = var78;
                              var78 = "";
                           }

                           var71.method56(var82, 3 + var85, var31, 0, -1);
                        }
                     }
                  } else if (9 == -1510882375 * var15.field4375) {
                     int var41;
                     int var52;
                     int var62;
                     int var70;
                     if (var15.field4278) {
                        var41 = var16;
                        var52 = var15.field4259 * 293773697 + var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var17;
                     } else {
                        var41 = var16;
                        var52 = var17;
                        var62 = 1115597881 * var15.field4249 + var16;
                        var70 = var15.field4259 * 293773697 + var17;
                     }

                     if (var15.field4277 * 845712065 == 1) {
                        classYW.method13732(var41, var52, var62, var70, 1740831551 * var15.field4270);
                     } else {
                        classYW.method13745(var41, var52, var62, var70, 845712065 * var15.field4277, var15.field4270 * 1740831551);
                     }
                  } else if (-1510882375 * var15.field4375 == 12) {
                     classLH var40 = var15.method7283(-220764);
                     classLI var51 = classLW.method7285(var15, 1887235301);
                     if (var40 != null && var51 != null && var40.method6998((byte)-107)) {
                        classZV var61 = var15.method7199(var12, (byte)90);
                        if (null != var61) {
                           this.field2640
                              .method5281(
                                 var16,
                                 var17,
                                 1115597881 * var15.field4249,
                                 293773697 * var15.field4259,
                                 var40.method7001(1551027022),
                                 classLH.method7003(var40, -319522320),
                                 var40.method6994((byte)-89),
                                 var40.method6995(-76744899),
                                 var40.method6989((byte)3),
                                 395641138
                              );
                           int var69 = var15.field4306 ? var15.field4284 * 880555563 : -1;
                           if (!var40.method6982(1195932113) && var40.method6970(-847223427).method13845(-779339817)) {
                              classGA.method5284(
                                 this.field2640, var51.field4169 * 201043577, var69, -211319977 * var51.field4172, var51.field4170 * 1532740787, -160511588
                              );
                              this.field2640.method5287(classLH.method6973(var40, 228546374), var61, 120041229);
                           } else {
                              classGA.method5284(
                                 this.field2640, 1740831551 * var15.field4270, var69, var51.field4172 * -211319977, 1532740787 * var51.field4170, 271374387
                              );
                              this.field2640.method5287(var40.method6970(-1198434150), var61, 120041229);
                           }

                           classYW.method13671(var6, var7, var8, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;II)V")
   @ObfuscatedName("ae")
   void method5560(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13, int var14
   ) {
      this.method5591(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);

      try {
         classYW.method13671(var6, var7, var8, var9);
         classFH.method4740();

         for (int var15 = var2; var15 <= var3; var15++) {
            classLW var16 = var1[var15];
            if (null == var16) {
               if (var14 != 1690058415) {
                  this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                  return;
               }
            } else {
               label1035: {
                  if (-1502647899 * var16.field4342 == var4) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     if (var16.field4263 * 653784551 == var5) {
                        break label1035;
                     }

                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }
                  }

                  if (var4 != -1412584499) {
                     continue;
                  }

                  if (var14 != 1690058415) {
                     throw new IllegalStateException();
                  }

                  if (var16 != classVV.method12152(var12, (byte)-59)) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               if (var16.field4275 && var12.method12119(var16, (byte)0)) {
                  if (var14 != 1690058415) {
                     this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                     return;
                  }
               } else {
                  if (-90794217 * var16.field4334 > 0) {
                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     this.method5562(var16, var13, (byte)122);
                  }

                  int var17 = var10 + 744286069 * var16.field4281;
                  int var18 = var11 + 1570844829 * var16.field4257;
                  int var19 = 1517457381 * var16.field4347;
                  if (classVV.method12152(var12, (byte)-105) == var16) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     classVW var20 = var12.method12150((byte)0);
                     if (var4 != -1412584499) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        if (!var16.field4314) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           this.field2651 = var1;
                           this.field2645 = -100057729 * var10;
                           this.field2646 = 5465987 * var11;
                           continue;
                        }
                     }

                     if (var20.method12253((short)1693)) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        if (var20.method12258(-1223649978)) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           int var21 = var20.method12235(-1458575824);
                           int var22 = classVW.method12241(var20, (byte)-91);
                           int var23 = var20.method12215(487783638).field4249 * 1115597881;
                           int var24 = var20.method12215(-365832785).field4259 * 293773697;
                           int var25 = classTZ.field6255 * -38255113;
                           int var26 = classTZ.field6264 * -2144333897;
                           var25 -= var20.method12224((byte)36);
                           var26 -= classVW.method12226(var20, (byte)-90);
                           if (var25 < var21) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var25 = var21;
                           }

                           if (1115597881 * var16.field4249 + var25 > var23 + var21) {
                              if (var14 != 1690058415) {
                                 this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                                 return;
                              }

                              var25 = var23 + var21 - 1115597881 * var16.field4249;
                           }

                           if (var26 < var22) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var26 = var22;
                           }

                           if (var26 + var16.field4259 * 293773697 > var22 + var24) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var26 = var22 + var24 - var16.field4259 * 293773697;
                           }

                           var17 = var25;
                           var18 = var26;
                        }
                     }

                     if (!var16.field4314) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var19 = 128;
                     }
                  }

                  int var35;
                  int var36;
                  int var37;
                  int var38;
                  if (9 == -1510882375 * var16.field4375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     int var39 = var17;
                     int var51 = var18;
                     int var61 = var17 + var16.field4249 * 1115597881;
                     int var27 = var16.field4259 * 293773697 + var18;
                     if (var61 < var17) {
                        var39 = var61;
                        var61 = var17;
                     }

                     if (var27 < var18) {
                        var51 = var27;
                        var27 = var18;
                     }

                     var61++;
                     var27++;
                     var35 = var39 > var6 ? var39 : var6;
                     int var10000;
                     if (var51 > var7) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        var10000 = var51;
                     } else {
                        var10000 = var7;
                     }

                     var36 = var10000;
                     if (var61 < var8) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var10000 = var61;
                     } else {
                        var10000 = var8;
                     }

                     var37 = var10000;
                     var38 = var27 < var9 ? var27 : var9;
                  } else {
                     int var40 = var16.field4249 * 1115597881 + var17;
                     int var52 = var18 + var16.field4259 * 293773697;
                     int var93;
                     if (var17 > var6) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var93 = var17;
                     } else {
                        var93 = var6;
                     }

                     var35 = var93;
                     if (var18 > var7) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var93 = var18;
                     } else {
                        var93 = var7;
                     }

                     var36 = var93;
                     if (var40 < var8) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var93 = var40;
                     } else {
                        var93 = var8;
                     }

                     var37 = var93;
                     var38 = var52 < var9 ? var52 : var9;
                  }

                  if (var16.field4275) {
                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     if (var35 >= var37) {
                        continue;
                     }

                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     if (var36 >= var38) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }
                        continue;
                     }
                  }

                  if (0 != -90794217 * var16.field4334) {
                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     if (1336 == var16.field4334 * -90794217) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        this.method5569(var17, var18, 1115597881 * var16.field4249, 825915897);
                        continue;
                     }

                     if (1337 == var16.field4334 * -90794217) {
                        this.field2641.vmethod281(var17, var18, 1115597881 * var16.field4249, 293773697 * var16.field4259, -1657364698);
                        classYW.method13671(var6, var7, var8, var9);
                        continue;
                     }

                     if (1338 == -90794217 * var16.field4334) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        this.field2641.vmethod298(var16, var17, var18, (short)-10739);
                        classYW.method13671(var6, var7, var8, var9);
                        continue;
                     }

                     if (1339 == var16.field4334 * -90794217) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        this.method5565(var16, var17, var18, var12, (byte)74);
                        classYW.method13671(var6, var7, var8, var9);
                        continue;
                     }

                     if (1400 == var16.field4334 * -90794217) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        this.field2641
                           .vmethod285(
                              var17,
                              var18,
                              var16.field4249 * 1115597881,
                              293773697 * var16.field4259,
                              var13,
                              this.field2634.vmethod89(797563684).method2757(-1674478907)
                           );
                     }

                     if (1401 == var16.field4334 * -90794217) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        this.field2641.vmethod291(var17, var18, 1115597881 * var16.field4249, 293773697 * var16.field4259, -1714675824);
                     }

                     if (var16.field4334 * -90794217 == 1402) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        this.field2641.vmethod296(var17, var13, 1137310854);
                     }
                  }

                  if (0 == -1510882375 * var16.field4375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     if (!var16.field4275) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        if (var12.method12119(var16, (byte)0) && !var12.method12112(2061916916).method11927(var16, (byte)72)) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }
                           continue;
                        }
                     }

                     if (!var16.field4275) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        if (var16.field4331 * -41424189 > var16.field4269 * -714521463 - 293773697 * var16.field4259) {
                           var16.field4331 = var16.field4269 * -1471306045 - var16.field4259 * 577918571;
                        }

                        if (var16.field4331 * -41424189 < 0) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var16.field4331 = 0;
                        }
                     }

                     this.method5560(
                        var1,
                        var16.field4265 * -1210177335,
                        var16.field4266 * 379541057,
                        -1163656551 * var16.field4329,
                        var16.field4260 * 63131743,
                        var35,
                        var36,
                        var37,
                        var38,
                        var17 - var16.field4341 * -34809441,
                        var18 - var16.field4331 * -41424189,
                        var12,
                        var13,
                        1690058415
                     );
                     if (var16.field4340 != null) {
                        this.method5560(
                           var16.field4340,
                           0,
                           var16.field4340.length - 1,
                           -1163656551 * var16.field4329,
                           -1,
                           var35,
                           var36,
                           var37,
                           var38,
                           var17 - var16.field4341 * -34809441,
                           var18 - -41424189 * var16.field4331,
                           var12,
                           var13,
                           1690058415
                        );
                     }

                     if (-1 == var16.field4260 * 63131743) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        classPK var41 = (classPK)var12.field6613.method13363(var16.field4329 * -1163656551);
                        if (null != var41) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           method5553(this, var41.field5276 * 2023647411, var35, var36, var37, var38, var17, var18, var12, var13, 545645039);
                        }
                     }

                     classYW.method13671(var6, var7, var8, var9);
                     classFH.method4740();
                  } else if (11 == -1510882375 * var16.field4375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     if (var12.method12119(var16, (byte)0)) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        if (!var12.method12112(1653497242).method11927(var16, (byte)72)) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }

                     if (null != var16.field4340) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        this.method5560(
                           var16.field4340,
                           0,
                           var16.field4340.length - 1,
                           var16.field4329 * -1163656551,
                           -1,
                           var35,
                           var36,
                           var37,
                           var38,
                           var17 - -34809441 * var16.field4341,
                           var18 - var16.field4331 * -41424189,
                           var12,
                           var13,
                           1690058415
                        );
                     }

                     classYW.method13671(var6, var7, var8, var9);
                     classFH.method4740();
                  }

                  if (var16.field4375 * -1510882375 == 0) {
                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     if (!var16.field4275) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        if (var16.field4269 * -714521463 > 293773697 * var16.field4259) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           method5573(
                              this,
                              var17 + 1115597881 * var16.field4249,
                              var18,
                              -41424189 * var16.field4331,
                              293773697 * var16.field4259,
                              -714521463 * var16.field4269,
                              (byte)-1
                           );
                        }
                     }
                  }

                  if (var16.field4375 * -1510882375 == 1) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }
                  } else if (-1510882375 * var16.field4375 == 3) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     int var49;
                     if (this.method5579(var16, (byte)-16)) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var49 = var16.field4295 * 948260113;
                        if (var12.method12112(-90191525).method11927(var16, (byte)32) && 0 != var16.field4273 * 1396903265) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var49 = var16.field4273 * 1396903265;
                        }
                     } else {
                        var49 = 1740831551 * var16.field4270;
                        if (var12.method12112(617931125).method11927(var16, (byte)101)) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           if (318120869 * var16.field4272 != 0) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var49 = 318120869 * var16.field4272;
                           }
                        }
                     }

                     if (var16.field4271) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        switch (1768204099 * var16.field4307.field6976) {
                           case 1:
                              classYW.method13699(
                                 var17,
                                 var18,
                                 1115597881 * var16.field4249,
                                 293773697 * var16.field4259,
                                 1740831551 * var16.field4270,
                                 var16.field4295 * 948260113
                              );
                              break;
                           case 2:
                              classYW.method13765(
                                 var17,
                                 var18,
                                 var16.field4249 * 1115597881,
                                 293773697 * var16.field4259,
                                 var16.field4270 * 1740831551,
                                 var16.field4295 * 948260113,
                                 255 - (var16.field4347 * 1517457381 & 0xFF),
                                 255 - (var16.field4276 * 1991172799 & 0xFF)
                              );
                              break;
                           default:
                              if (var19 == 0) {
                                 classYW.method13698(var17, var18, var16.field4249 * 1115597881, 293773697 * var16.field4259, var49);
                              } else {
                                 classYW.method13694(var17, var18, 1115597881 * var16.field4249, 293773697 * var16.field4259, var49, 256 - (var19 & 0xFF));
                              }
                        }
                     } else if (0 == var19) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        classYW.method13707(var17, var18, 1115597881 * var16.field4249, var16.field4259 * 293773697, var49);
                     } else {
                        classYW.method13711(var17, var18, var16.field4249 * 1115597881, var16.field4259 * 293773697, var49, 256 - (var19 & 0xFF));
                     }
                  } else if (4 == var16.field4375 * -1510882375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     classZV var48 = var16.method7199(var12, (byte)20);
                     if (var48 == null) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }
                     } else {
                        String var69 = var16.field4301;
                        int var59;
                        if (this.method5579(var16, (byte)-68)) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           var59 = 948260113 * var16.field4295;
                           if (var12.method12112(813215143).method11927(var16, (byte)115) && var16.field4273 * 1396903265 != 0) {
                              var59 = var16.field4273 * 1396903265;
                           }

                           if (!var16.field4302.isEmpty()) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var69 = var16.field4302;
                           }
                        } else {
                           var59 = 1740831551 * var16.field4270;
                           if (var12.method12112(-212020466).method11927(var16, (byte)104)) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              if (0 != var16.field4272 * 318120869) {
                                 if (var14 != 1690058415) {
                                    throw new IllegalStateException();
                                 }

                                 var59 = 318120869 * var16.field4272;
                              }
                           }
                        }

                        if (var16.field4275) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           label971:
                           if (var16.field4319 * 2073671441 != -1) {
                              if (var14 != 1690058415) {
                                 this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                                 return;
                              }

                              classOP var77 = classOB.method8299(2073671441 * var16.field4319, (byte)-66);
                              var69 = classOP.method8704(var77, 1248604557);
                              if (var69 == null) {
                                 if (var14 != 1690058415) {
                                    this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                                    return;
                                 }

                                 var69 = classKK.field3615;
                              }

                              if (1633663665 * var77.field5055 != 1) {
                                 if (var14 != 1690058415) {
                                    throw new IllegalStateException();
                                 }

                                 if (var16.field4344 * 1190987649 == 1) {
                                    break label971;
                                 }

                                 if (var14 != 1690058415) {
                                    this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                                    return;
                                 }
                              }

                              if (-1 != var16.field4344 * 1190987649) {
                                 if (var14 != 1690058415) {
                                    throw new IllegalStateException();
                                 }

                                 var69 = classQY.method9847(16748608, (byte)74)
                                    + var69
                                    + classDO.field1594
                                    + " "
                                    + 'x'
                                    + classSX.method10713(var16.field4344 * 1190987649, 1269917943);
                              }
                           }
                        }

                        if (var12.method12170(var16, (byte)-38)) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var69 = classKK.field3783;
                           var59 = var16.field4270 * 1740831551;
                        }

                        if (!var16.field4275) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var69 = this.method5575(var69, var16, 1977830334);
                        }

                        int var10004 = var16.field4249 * 1115597881;
                        int var10005 = var16.field4259 * 293773697;
                        byte var10007;
                        if (var16.field4306) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           var10007 = 0;
                        } else {
                           var10007 = -1;
                        }

                        classAAA.method70(
                           var48,
                           var69,
                           var17,
                           var18,
                           var10004,
                           var10005,
                           var59,
                           var10007,
                           classGK.method5483(var16.field4347 * 1517457381, -2066863073),
                           var16.field4304 * 1409141973,
                           -338086361 * var16.field4305,
                           704962289 * var16.field4303
                        );
                     }
                  } else if (-1510882375 * var16.field4375 == 5) {
                     if (var14 != 1690058415) {
                        this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                        return;
                     }

                     if (!var16.field4275) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        classYM var47 = var16.method7319(var12, this.method5579(var16, (byte)-76), this.field2634.vmethod78((byte)-1), 1522102538);
                        if (null != var47) {
                           classYM.method13511(var47, var17, var18);
                        }
                     } else {
                        classYM var46;
                        if (-1 != 2073671441 * var16.field4319) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var46 = classLJ.method7114(
                              2073671441 * var16.field4319,
                              var16.field4344 * 1190987649,
                              var16.field4283 * -2011859635,
                              880555563 * var16.field4284,
                              -278245589 * var16.field4299,
                              false,
                              Math.max(36, var16.field4249 * 1115597881),
                              Math.max(32, 293773697 * var16.field4259),
                              1683831829
                           );
                        } else {
                           var46 = var16.method7319(var12, false, this.field2634.vmethod78((byte)-37), -1169119797);
                        }

                        if (null != var46) {
                           int var58 = var46.field7006;
                           int var68 = var46.field7008;
                           if (!var16.field4282) {
                              int var76 = -356282368 * var16.field4249 / var58;
                              if (var16.field4351 * 142218501 != 0) {
                                 var46.method13553(
                                    var17 + 1115597881 * var16.field4249 / 2, var18 + var16.field4259 * 293773697 / 2, var16.field4351 * 142218501, var76
                                 );
                              } else if (0 != var19) {
                                 var46.method13524(var17, var18, 1115597881 * var16.field4249, 293773697 * var16.field4259, 256 - (var19 & 0xFF));
                              } else {
                                 if (var58 == var16.field4249 * 1115597881) {
                                    if (var14 != 1690058415) {
                                       throw new IllegalStateException();
                                    }

                                    if (293773697 * var16.field4259 == var68) {
                                       classYM.method13511(var46, var17, var18);
                                       continue;
                                    }
                                 }

                                 var46.method13517(var17, var18, 1115597881 * var16.field4249, var16.field4259 * 293773697);
                              }
                           } else {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              classYW.method13674(var17, var18, var17 + var16.field4249 * 1115597881, var18 + 293773697 * var16.field4259);
                              int var75 = (1115597881 * var16.field4249 + (var58 - 1)) / var58;
                              int var83 = (var68 - 1 + var16.field4259 * 293773697) / var68;

                              for (int var86 = 0; var86 < var75; var86++) {
                                 if (var14 != 1690058415) {
                                    throw new IllegalStateException();
                                 }

                                 for (int var89 = 0; var89 < var83; var89++) {
                                    if (var14 != 1690058415) {
                                       throw new IllegalStateException();
                                    }

                                    if (0 != var16.field4351 * 142218501) {
                                       if (var14 != 1690058415) {
                                          throw new IllegalStateException();
                                       }

                                       var46.method13553(
                                          var58 / 2 + var86 * var58 + var17, var68 * var89 + var18 + var68 / 2, 142218501 * var16.field4351, 4096
                                       );
                                    } else if (var19 != 0) {
                                       if (var14 != 1690058415) {
                                          throw new IllegalStateException();
                                       }

                                       classYM.method13523(var46, var86 * var58 + var17, var18 + var89 * var68, 256 - (var19 & 0xFF));
                                    } else {
                                       classYM.method13511(var46, var86 * var58 + var17, var18 + var68 * var89);
                                    }
                                 }
                              }

                              classYW.method13671(var6, var7, var8, var9);
                           }
                        }
                     }
                  } else if (6 == -1510882375 * var16.field4375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     classOU var45 = null;
                     int var57 = -1;
                     boolean var67 = this.method5579(var16, (byte)10);
                     int var74;
                     if (var67) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        var74 = 821151237 * var16.field4293;
                     } else {
                        var74 = 2114568197 * var16.field4288;
                     }

                     if (-1 != var74) {
                        var45 = classQA.method9430(var74, -1277205194);
                        var57 = -814893963 * var16.field4321;
                     }

                     classFX var81 = null;
                     int var85 = 0;
                     if (2073671441 * var16.field4319 != -1) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod115(var16, (byte)-120);
                        if (var81 != null) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var81.method5230();
                           var85 = var81.field1743 * -1256242689 / 2;
                        }
                     } else if (5 == var16.field4333 * -910601) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod119(var16, (byte)4);
                     } else if (var16.field4333 * -910601 == 7) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        var81 = this.field2638.vmethod122(var16, (byte)64);
                     } else if (8 == var16.field4333 * -910601) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod127(var16, var45, var57, (byte)14);
                     } else if (9 == var16.field4333 * -910601) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod129(var16, var45, var57, (byte)43);
                     } else if (6 == var16.field4333 * -910601) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod133(var16, var45, var57, var67, -1993548421);
                     } else if (var16.field4333 * -910601 == 2) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var81 = this.field2638.vmethod139(var16, var45, var57, var67, -1390393847);
                     } else {
                        var81 = this.field2638.vmethod140(var16, var45, var57, var67, (byte)-65);
                     }

                     classFH.method4756(1115597881 * var16.field4249 / 2 + var17, 293773697 * var16.field4259 / 2 + var18);
                     int var88 = classFH.field2253[-1246332317 * var16.field4356] * var16.field4338 * 245118287 >> 16;
                     int var91 = var16.field4338 * 245118287 * classFH.field2254[var16.field4356 * -1246332317] >> 16;
                     if (null != var81) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        classFH.method4684(false);
                        if (!var16.field4275) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           var81.method5250(0, -1008620329 * var16.field4292, 0, var16.field4356 * -1246332317, 0, var88, var91);
                        } else {
                           var81.method5230();
                           if (var16.field4297) {
                              var81.method5161(
                                 0,
                                 var16.field4292 * -1008620329,
                                 827587461 * var16.field4294,
                                 var16.field4356 * -1246332317,
                                 var16.field4290 * -1469553671,
                                 var88 + var85 + var16.field4291 * -30521739,
                                 var16.field4291 * -30521739 + var91,
                                 var16.field4338 * 245118287
                              );
                           } else {
                              var81.method5250(
                                 0,
                                 -1008620329 * var16.field4292,
                                 827587461 * var16.field4294,
                                 -1246332317 * var16.field4356,
                                 var16.field4290 * -1469553671,
                                 var85 + var88 + -30521739 * var16.field4291,
                                 var91 + var16.field4291 * -30521739
                              );
                           }
                        }
                     }

                     classFH.method4754();
                  } else if (-1510882375 * var16.field4375 == 8) {
                     if (var12.method12112(2061692895).method11932(var16, (byte)11)) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        classZV var44 = this.field2637.vmethod105(classXJ.field6878, -725461430);
                        int var55 = 0;
                        int var65 = 0;
                        classZV var73 = var44;
                        String var28 = var16.field4301;

                        for (String var78 = this.method5575(var28, var16, 1855216883); !var78.isEmpty(); var65 += var73.field8 + 1) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           int var30 = var78.indexOf(classDO.field1588);
                           String var29;
                           if (-1 != var30) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var29 = var78.substring(0, var30);
                              var78 = var78.substring(var30 + 4);
                           } else {
                              var29 = var78;
                              var78 = "";
                           }

                           int var31 = var73.method36(var29);
                           if (var31 > var55) {
                              if (var14 != 1690058415) {
                                 this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                                 return;
                              }

                              var55 = var31;
                           }
                        }

                        var55 += 6;
                        var65 += 7;
                        int var87 = var17 + 1115597881 * var16.field4249 - 5 - var55;
                        int var90 = 5 + var16.field4259 * 293773697 + var18;
                        if (var87 < 5 + var17) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           var87 = 5 + var17;
                        }

                        if (var87 + var55 > var8) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           var87 = var8 - var55;
                        }

                        if (var90 + var65 > var9) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           var90 = var9 - var65;
                        }

                        classYW.method13698(var87, var90, var55, var65, 16777120);
                        classYW.method13707(var87, var90, var55, var65, 0);
                        var28 = var16.field4301;
                        int var32 = 2 + var90 + var73.field8;

                        for (String var80 = this.method5575(var28, var16, 2043879658); !var80.isEmpty(); var32 += 1 + var73.field8) {
                           if (var14 != 1690058415) {
                              throw new IllegalStateException();
                           }

                           int var33 = var80.indexOf(classDO.field1588);
                           String var84;
                           if (-1 != var33) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              var84 = var80.substring(0, var33);
                              var80 = var80.substring(4 + var33);
                           } else {
                              var84 = var80;
                              var80 = "";
                           }

                           var73.method56(var84, 3 + var87, var32, 0, -1);
                        }
                     }
                  } else if (9 == -1510882375 * var16.field4375) {
                     if (var14 != 1690058415) {
                        throw new IllegalStateException();
                     }

                     int var43;
                     int var54;
                     int var64;
                     int var72;
                     if (var16.field4278) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        var43 = var17;
                        var54 = var16.field4259 * 293773697 + var18;
                        var64 = 1115597881 * var16.field4249 + var17;
                        var72 = var18;
                     } else {
                        var43 = var17;
                        var54 = var18;
                        var64 = 1115597881 * var16.field4249 + var17;
                        var72 = var16.field4259 * 293773697 + var18;
                     }

                     if (var16.field4277 * 845712065 == 1) {
                        if (var14 != 1690058415) {
                           throw new IllegalStateException();
                        }

                        classYW.method13732(var43, var54, var64, var72, 1740831551 * var16.field4270);
                     } else {
                        classYW.method13745(var43, var54, var64, var72, 845712065 * var16.field4277, var16.field4270 * 1740831551);
                     }
                  } else if (-1510882375 * var16.field4375 == 12) {
                     classLH var42 = var16.method7283(-988626374);
                     classLI var53 = classLW.method7285(var16, 810441855);
                     if (var42 != null) {
                        if (var14 != 1690058415) {
                           this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                           return;
                        }

                        if (var53 != null) {
                           if (var14 != 1690058415) {
                              this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
                              return;
                           }

                           if (var42.method6998((byte)-102)) {
                              if (var14 != 1690058415) {
                                 throw new IllegalStateException();
                              }

                              classZV var63 = var16.method7199(var12, (byte)-37);
                              if (null != var63) {
                                 if (var14 != 1690058415) {
                                    throw new IllegalStateException();
                                 }

                                 label1001: {
                                    this.field2640
                                       .method5281(
                                          var17,
                                          var18,
                                          1115597881 * var16.field4249,
                                          293773697 * var16.field4259,
                                          var42.method7001(1815138794),
                                          classLH.method7003(var42, -1306679676),
                                          var42.method6994((byte)-85),
                                          var42.method6995(-6445662),
                                          var42.method6989((byte)3),
                                          395641138
                                       );
                                    int var71 = var16.field4306 ? var16.field4284 * 880555563 : -1;
                                    if (!var42.method6982(1398060670)) {
                                       if (var14 != 1690058415) {
                                          throw new IllegalStateException();
                                       }

                                       if (var42.method6970(-50111782).method13845(1308995388)) {
                                          if (var14 != 1690058415) {
                                             throw new IllegalStateException();
                                          }

                                          classGA.method5284(
                                             this.field2640,
                                             var53.field4169 * 201043577,
                                             var71,
                                             -211319977 * var53.field4172,
                                             var53.field4170 * 1532740787,
                                             -358572900
                                          );
                                          this.field2640.method5287(classLH.method6973(var42, -74330507), var63, 120041229);
                                          break label1001;
                                       }
                                    }

                                    classGA.method5284(
                                       this.field2640,
                                       1740831551 * var16.field4270,
                                       var71,
                                       var53.field4172 * -211319977,
                                       1532740787 * var53.field4170,
                                       2022870815
                                    );
                                    this.field2640.method5287(var42.method6970(109922931), var63, 120041229);
                                 }

                                 classYW.method13671(var6, var7, var8, var9);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         this.method5592(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      } catch (RuntimeException var34) {
         throw classEG.method3884(var34, "gp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("af")
   public static void method5546(int var0, int var1, int var2) {
      try {
         int var4;
         int var5;
         int var7;
         label29: {
            classPT var3 = classOL.method8510(var0, (short)-2595);
            var4 = -1681019861 * var3.field5420;
            var5 = -526564793 * var3.field5419;
            int var6 = var3.field5421 * 2095283109;
            var7 = classLB.field4085[var6 - var5];
            if (var1 >= 0) {
               if (var2 <= -2106322914) {
                  return;
               }

               if (var1 <= var7) {
                  break label29;
               }

               if (var2 <= -2106322914) {
                  throw new IllegalStateException();
               }
            }

            var1 = 0;
         }

         var7 <<= var5;
         classLB.field4090[var4] = classLB.field4090[var4] & ~var7 | var1 << var5 & var7;
         client.method2139(var4);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "gp.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;Ljava/lang/String;Llw;)Ljava/lang/String;")
   @ObfuscatedName("wh")
   public static String method5576(classGP var0, String var1, classLW var2) {
      if (var0 == null) {
         var0.method5581(var2);
      }

      if (var1.indexOf("%") != -1) {
         for (int var3 = 1; var3 <= 5; var3++) {
            while (true) {
               int var4 = var1.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               int var5 = var0.field2639.vmethod181(var2, var3 - 1, -1331144978);
               String var6;
               if (var5 < 1541404362) {
                  var6 = Integer.toString(var5);
               } else {
                  var6 = "*";
               }

               var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
            }
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;IIIIIIILvv;I)V")
   @ObfuscatedName("vj")
   public static void method5552(classGP var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9) {
      if (var0 == null) {
         var0.method5571(var1, var1, var1);
      } else if (classLY.method7381(var8, var1, -104541086)) {
         var0.field2651 = null;
         var0.method5560(var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, 1690058415);
         if (var0.field2651 != null) {
            var0.method5560(
               var0.field2651,
               0,
               var0.field2651.length - 1,
               465860321,
               236557616,
               var2,
               var3,
               var4,
               var5,
               var0.field2645 * 869302911,
               -1560065790 * var0.field2646,
               var8,
               var9,
               1690058415
            );
            var0.field2651 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/security/SecureRandom;")
   @ObfuscatedName("ae")
   static SecureRandom method5547(byte var0) {
      try {
         SecureRandom var1 = new SecureRandom();
         var1.nextInt();
         return var1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgp;IIIIIIILvv;II)V")
   @ObfuscatedName("lv")
   public static void method5553(classGP var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, int var10) {
      if (var0 == null) {
         var0.method5555(var1, var1, var1, var1, var1, var1, var1, var8, var1, var1);
      }

      try {
         if (!classLY.method7381(var8, var1, 1023807851)) {
            if (var10 != 545645039) {
               throw new IllegalStateException();
            }
         } else {
            var0.field2651 = null;
            var0.method5560(var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, 1690058415);
            if (var0.field2651 != null) {
               if (var10 != 545645039) {
                  throw new IllegalStateException();
               }

               var0.method5560(
                  var0.field2651,
                  0,
                  var0.field2651.length - 1,
                  -1412584499,
                  -1412584499,
                  var2,
                  var3,
                  var4,
                  var5,
                  var0.field2645 * 869302911,
                  -1361289429 * var0.field2646,
                  var8,
                  var9,
                  1690058415
               );
               var0.field2651 = null;
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "gp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   public static int method5548(int var0, int var1) {
      try {
         return classGV.field2706[var0 & 2047];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gp.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;I)V")
   @ObfuscatedName("vr")
   public void method5592(
      classLW[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, classVV var12, int var13
   ) {
      Callbacks var14 = classOE.field4843.getCallbacks();
      classVW var15 = var12.field6614;
      int var16 = field2643.size();

      for (int var17 = var2; var17 <= var3; var17++) {
         classLW var18 = var1[var17];
         if (var18 != null && var18.field4342 * -1502647899 == var4 && var18.field4263 * 653784551 == var5 && !var18.isSelfHidden()) {
            int var19 = var18.getType();
            if (var19 == 5 && var18.getItemId() != -1 && var18.getItemId() != 6512) {
               Rectangle var20 = null;
               if (var18 == classOE.field4843.method2333() && var15.field6626 && var15.field6621) {
                  int var21 = classTZ.field6255 * -38255113;
                  int var22 = classTZ.field6264 * -2144333897;
                  var21 -= var15.field6623 * -314698085;
                  var22 -= var15.field6624 * -542846241;
                  if (var21 < var15.field6628 * -279181121) {
                     var21 = var15.field6628 * -279181121;
                  }

                  if (var21 + var18.getWidth() > var15.field6628 * -279181121 + var15.field6622.getWidth()) {
                     var21 = var15.field6628 * -279181121 + var15.field6622.getWidth() - var18.getWidth();
                  }

                  if (var22 < var15.field6629 * -2119087041) {
                     var22 = var15.field6629 * -2119087041;
                  }

                  if (var22 + var18.getHeight() > var15.field6629 * -2119087041 + var15.field6622.getHeight()) {
                     var22 = var15.field6629 * -2119087041 + var15.field6622.getHeight() - var18.getHeight();
                  }

                  var20 = new Rectangle(var21, var22, var18.getWidth(), var18.getHeight());
               }

               int var36 = var10 + var18.getRelativeX();
               int var38 = var11 + var18.getRelativeY();
               var18.method7311(var36);
               var18.method7314(var38);
               if (var36 >= var6 && var36 <= var8 && var38 >= var7 && var38 <= var9) {
                  WidgetItem var23 = new WidgetItem(var18.getItemId(), var18.getItemQuantity(), var18.getBounds(), var18, var20);
                  field2643.add(var23);
               }
            }
         }
      }

      List var24 = Collections.emptyList();
      if (var16 < field2643.size()) {
         if (var16 > 0) {
            var24 = field2643.subList(var16, field2643.size());
         } else {
            var24 = field2643;
         }
      }

      if (var4 == -1412584499) {
         assert this.field2651 == var1;

         int var25 = -1;

         for (int var28 = 0; var28 < var1.length; var28++) {
            classLW var32 = var1[var28];
            if (var32 != null) {
               var25 = WidgetUtil.componentToInterface(var32.getId());
               break;
            }
         }

         if (var25 == -1) {
            return;
         }

         var14.drawInterface(var25, field2643);
         field2643.clear();
      } else if (var4 != -1) {
         if (var5 != -1) {
            return;
         }

         classLW var26 = classOE.field4843.method2295(var4);
         Widget[] var29 = var26.getChildren();
         if (var29 == null || var29 == var1) {
            var14.drawLayer(var26, var24);
         }
      } else {
         int var27 = -1;

         for (int var30 = 0; var30 < var1.length; var30++) {
            classLW var33 = var1[var30];
            if (var33 != null) {
               var27 = WidgetUtil.componentToInterface(var33.getId());
               break;
            }
         }

         if (var27 == -1) {
            return;
         }

         if (this.field2651 == null) {
            var14.drawInterface(var27, field2643);
            field2643.clear();
         }

         for (int var31 = field2644.size() - 1; var31 >= 0; var31--) {
            Widget var34 = (Widget)field2644.get(var31);
            if (WidgetUtil.componentToInterface(var34.getId()) == var27) {
               var34.setHidden(false);
               field2644.remove(var31);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("ar")
   static int method5590(int var0, classBL var1, boolean var2, int var3) {
      try {
         classLW var4;
         if (var0 >= 2000) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = classLY.method7375(classWK.field6691, classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)96);
         } else {
            classLW var10000;
            if (var2) {
               if (var3 != 1839316601) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = classDL.field1558;
            }

            var4 = var10000;
         }

         String var5 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
         int[] var6 = null;
         if (!var5.isEmpty()) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            if (var5.charAt(var5.length() - 1) == 'Y') {
               if (var3 != 1839316601) {
                  throw new IllegalStateException();
               }

               int var7 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               if (var7 > 0) {
                  var6 = new int[var7];

                  while (var7-- > 0) {
                     var6[var7] = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
                  }
               }

               var5 = var5.substring(0, var5.length() - 1);
            }
         }

         Object[] var11 = new Object[var5.length() + 1];

         for (int var8 = var11.length - 1; var8 >= 1; var8--) {
            switch (var5.charAt(var8 - 1)) {
               case 'W':
               case 'X':
               case 's':
                  var11[var8] = classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
                  break;
               case 'Ï':
                  var11[var8] = new Long(classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
                  break;
               default:
                  var11[var8] = new Integer(classBB.field323[(classDY.field1679 -= 120041229) * -324749371]);
            }
         }

         int var12 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
         if (-1 != var12) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var11[0] = new Integer(var12);
         } else {
            var11 = null;
         }

         if (var0 == 1400) {
            var4.field4359 = var11;
         } else if (1401 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4378 = var11;
         } else if (1402 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4357 = var11;
         } else if (1403 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4402 = var11;
         } else if (1404 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4361 = var11;
         } else if (1405 == var0) {
            var4.field4379 = var11;
         } else if (var0 == 1406) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4350 = var11;
         } else if (var0 == 1407) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4382 = var11;
            var4.field4280 = var6;
         } else if (var0 == 1408) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4343 = var11;
         } else if (var0 == 1409) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4386 = var11;
         } else if (var0 == 1410) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4380 = var11;
         } else if (1411 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4377 = var11;
         } else if (1412 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4286 = var11;
         } else if (var0 == 1414) {
            var4.field4355 = var11;
            var4.field4267 = var6;
         } else if (var0 == 1415) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4384 = var11;
            var4.field4385 = var6;
         } else if (var0 == 1416) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4381 = var11;
         } else if (1417 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4387 = var11;
         } else if (1418 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4365 = var11;
         } else if (1419 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4388 = var11;
         } else if (1420 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4383 = var11;
         } else if (var0 == 1421) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4391 = var11;
         } else if (var0 == 1422) {
            var4.field4394 = var11;
         } else if (1423 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4406 = var11;
         } else if (1424 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4395 = var11;
         } else if (1425 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4396 = var11;
         } else if (1426 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4397 = var11;
         } else if (var0 == 1427) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4246 = var11;
         } else if (var0 == 1428) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4392 = var11;
         } else if (var0 == 1429) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4393 = var11;
         } else if (1430 == var0) {
            var4.field4389 = var11;
         } else if (1431 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4363 = var11;
         } else if (var0 == 1434) {
            var4.field4398 = var11;
         } else if (1435 == var0) {
            if (var3 != 1839316601) {
               throw new IllegalStateException();
            }

            var4.field4254 = var11;
         } else {
            label416: {
               if (var0 >= 1436) {
                  if (var3 != 1839316601) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 1439) {
                     if (var3 != 1839316601) {
                        throw new IllegalStateException();
                     }

                     classLX var9 = var4.method7294(-1876593199);
                     if (var9 != null) {
                        if (var3 != 1839316601) {
                           throw new IllegalStateException();
                        }

                        if (var0 == 1436) {
                           if (var3 != 1839316601) {
                              throw new IllegalStateException();
                           }

                           var9.field4426 = var11;
                        } else if (1437 == var0) {
                           if (var3 != 1839316601) {
                              throw new IllegalStateException();
                           }

                           var9.field4427 = var11;
                        } else if (var0 == 1438) {
                           if (var3 != 1839316601) {
                              throw new IllegalStateException();
                           }

                           var9.field4428 = var11;
                        } else if (var0 == 1439) {
                           var9.field4425 = var11;
                        }
                     }
                     break label416;
                  }
               }

               return 2;
            }
         }

         var4.field4315 = true;
         return 1;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "gp.ar(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgp;IIIIIIILvv;I)V")
   @ObfuscatedName("ac")
   public static void method5554(classGP var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9) {
      if (var0 == null) {
         var0.method5585(var1, var8, var1);
      }

      if (classLY.method7381(var8, var1, 1199514442)) {
         var0.field2651 = null;
         var0.method5560(var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, 1690058415);
         if (var0.field2651 != null) {
            var0.method5560(
               var0.field2651,
               0,
               var0.field2651.length - 1,
               -1412584499,
               -1412584499,
               var2,
               var3,
               var4,
               var5,
               var0.field2645 * 869302911,
               -1361289429 * var0.field2646,
               var8,
               var9,
               1690058415
            );
            var0.field2651 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIILvv;II)V")
   @ObfuscatedName("af")
   void method5555(int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, int var10) {
      try {
         if (!classLY.method7381(var8, var1, 1023807851)) {
            if (var10 != 545645039) {
               throw new IllegalStateException();
            }
         } else {
            this.field2651 = null;
            this.method5560(var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, 1690058415);
            if (this.field2651 != null) {
               if (var10 != 545645039) {
                  throw new IllegalStateException();
               }

               this.method5560(
                  this.field2651,
                  0,
                  this.field2651.length - 1,
                  -1412584499,
                  -1412584499,
                  var2,
                  var3,
                  var4,
                  var5,
                  this.field2645 * 869302911,
                  -1361289429 * this.field2636,
                  var8,
                  var9,
                  1690058415
               );
               this.field2651 = null;
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "gp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("ax")
   void method5574(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         classYZ[] var7 = this.field2637.vmethod108(1569969832);
         classYZ.method13810(var7[0], var1, var2);
         classYZ.method13810(var7[1], var1, var4 + var2 - 16);
         classYW.method13709(var1, var2 + 16, 16, var4 - 32, 2301979);
         int var8 = (var4 - 32) * var4 / var5;
         if (var8 < 8) {
            if (var6 != -1) {
               return;
            }

            var8 = 8;
         }

         int var9 = (var4 - 32 - var8) * var3 / (var5 - var4);
         classYW.method13707(var1, var9 + 16 + var2, 16, var8, 5063219);
         classYW.method13723(var1, var2 + 16 + var9, var8, 7759444);
         classYW.method13672(1 + var1, var2 + 16 + var9, var8, 7759444);
         classYW.method13717(var1, var9 + var2 + 16, 16, 7759444);
         classYW.method13673(var1, 17 + var2 + var9, 16, 7759444);
         classYW.method13725(var1 + 15, var2 + 16 + var9, var8, 3353893);
         classYW.method13672(14 + var1, var9 + 17 + var2, var8 - 1, 3353893);
         classYW.method13718(var1, var9 + 15 + var2 + var8, 16, 3353893);
         classYW.method13717(var1 + 1, var8 + 14 + var2 + var9, 15, 3353893);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "gp.ax(" + ')');
      }
   }
}
