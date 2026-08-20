import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ho")
public final class classHO {
   @ObfuscatedName("ae")
   int field2848;
   @ObfuscatedName("af")
   int field2849;
   @ObfuscatedName("ab")
   int field2847;
   @ObfuscatedName("az")
   int field2850;
   @ToRemove(unused = "true")
   @ObfuscatedName("cp")
   static final int field2852 = 72;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field2851 = 30;

   @ObfuscatedSignature(descriptor = "(Lte;Lyy;B)V")
   @ObfuscatedName("bn")
   static void method6078(classTE var0, classYY var1, byte var2) {
      try {
         classOL.method8511(var0, var1, true, (byte)32);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ho.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Loq;B)V")
   @ObfuscatedName("cv")
   static final void method6079(classDZ var0, classOQ var1, byte var2) {
      try {
         for (int var3 = 0; var3 < classZH.method14003(var0.field1697, (byte)10); var3++) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            classDN var4 = (classDN)var0.field1698.method13404(var0.field1697.method14001(var3, 1761435756));
            if (null != var4 && var4.vmethod262((byte)50)) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               if (var4.field1581.field5305 == var1 && var4.field1581.method8959((byte)-97)) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  int var5 = -483624883 * var0.field1710;
                  int var6 = classKY.method6608(var4.field1487 * -1547553299, (byte)-93);
                  int var7 = classKY.method6608(-1272026483 * var4.field1489, (byte)8);
                  if (var0.method3729(var6, var7, (byte)1)) {
                     if (var2 != 0) {
                        return;
                     }

                     if (670857619 * var4.field1441 == 1) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        if ((-1547553299 * var4.field1487 & 127) == 64) {
                           if (var2 != 0) {
                              throw new IllegalStateException();
                           }

                           if (64 == (-1272026483 * var4.field1489 & 127)) {
                              if (var2 != 0) {
                                 throw new IllegalStateException();
                              }

                              if (client.field956 * 834768165 == var0.field1703[var6][var7]) {
                                 if (var2 != 0) {
                                    throw new IllegalStateException();
                                 }
                                 continue;
                              }

                              var0.field1703[var6][var7] = client.field956 * 834768165;
                           }
                        }
                     }

                     boolean var10004;
                     if (!var4.field1581.field5326) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        var10004 = true;
                     } else {
                        var10004 = false;
                     }

                     long var8 = classRF.method9961(0, 0, 0, 1, var10004, -1315528093 * var4.field1480, var0.field1699 * 2140889407, (short)30035);
                     var4.field1490 = client.field855 * 1311089481;
                     int var10 = classKC.method6460(
                        var0, var4.field1487 * -1547553299, -1272026483 * var4.field1489, var5, var4.vmethod267(-1423776655), (short)-20256
                     );
                     int var11 = var4.field1441 * -14785344 - 64 + 60;
                     boolean var12;
                     if (!var4.field1581.method8987(2095992902)) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        var12 = false;
                     } else {
                        label150: {
                           for (int var13 = 0; var13 < classZH.method14003(classIS.field3053.field1693, (byte)10); var13++) {
                              if (var2 != 0) {
                                 throw new IllegalStateException();
                              }

                              classSP var14 = (classSP)classIS.field3053.field1700.method13595(classIS.field3053.field1693.method14001(var13, 1570533187));
                              if (var14 != null) {
                                 if (var2 != 0) {
                                    return;
                                 }

                                 if (client.field855 * 1612595797 == var14.field6012.field1689.field2142) {
                                    if (var2 != 0) {
                                       return;
                                    }

                                    if (!var14.method10558(1822994519) && classFA.method4550(var14, var4, -1555620546)) {
                                       if (var2 != 0) {
                                          throw new IllegalStateException();
                                       }

                                       var12 = true;
                                       break label150;
                                    }
                                 }
                              }
                           }

                           var12 = false;
                        }
                     }

                     var4.field1586 = var12;
                     boolean var16 = classEZ.method4477(
                        var0.field1689,
                        var5,
                        var4.field1487 * -1547553299,
                        -1272026483 * var4.field1489,
                        var10,
                        var11,
                        var4,
                        1457033841 * var4.field1488,
                        var8,
                        var4.field1440
                     );
                     if (var16) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        classHH.method6055(var0, var4, var5, var10, var8);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "ho.cv(" + ')');
      }
   }

   classHO(classGU var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lct;IIIIB)V")
   @ObfuscatedName("fx")
   static final void method6080(classCT var0, int var1, int var2, int var3, int var4, byte var5) {
      boolean var6 = classEZ.method4436(var0, false);
      if (var6) {
         int var11 = var4;
         int var10 = var3;
         int var9 = var2;
         int var8 = var1;
         classCT var7 = var0;
         byte var12 = 18;

         try {
            if (var7.field1480 * -1315528093 == -2130951373 * client.field845) {
               if (var12 <= 0) {
                  throw new IllegalStateException();
               }
            } else if (-1927903443 * client.field974.field6797 >= 400) {
               if (var12 <= 0) {
                  throw new IllegalStateException();
               }
            } else {
               classCT var14 = classMB.method7521(1766208156);
               int var10000;
               if (null != var14) {
                  if (var12 <= 0) {
                     return;
                  }

                  var10000 = var14.field1261 * 810892507;
               } else {
                  var10000 = 0;
               }

               int var13 = var10000;
               int var23 = var13;
               classCT var16 = classMB.method7521(873668262);
               if (var16 != null) {
                  if (var12 <= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = var16.field1265 * 532975721;
               } else {
                  var10000 = 0;
               }

               int var15 = var10000;
               int var24 = var15;
               String var17;
               if (1777039337 * var7.field1262 == 0) {
                  String var18 = var7.field1270[0] + var7.field1283 + var7.field1270[1];
                  int var20 = 810892507 * var7.field1261;
                  int var21 = var13 - var20;
                  String var19;
                  if (var21 < -9) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(16711680, (byte)35);
                  } else if (var21 < -6) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(16723968, (byte)46);
                  } else if (var21 < -3) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(16740352, (byte)123);
                  } else if (var21 < 0) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(16756736, (byte)90);
                  } else if (var21 > 9) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(65280, (byte)84);
                  } else if (var21 > 6) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(4259584, (byte)59);
                  } else if (var21 > 3) {
                     if (var12 <= 0) {
                        return;
                     }

                     var19 = classQY.method9847(8453888, (byte)71);
                  } else if (var21 > 0) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     var19 = classQY.method9847(12648192, (byte)54);
                  } else {
                     var19 = classQY.method9847(16776960, (byte)111);
                  }

                  var17 = var18 + var19 + " " + classDO.field1593 + classKK.field3688 + 810892507 * var7.field1261 + classDO.field1591 + var7.field1270[2];
               } else {
                  var17 = var7.field1270[0]
                     + var7.field1283
                     + var7.field1270[1]
                     + " "
                     + classDO.field1593
                     + classKK.field3782
                     + var7.field1262 * 1777039337
                     + classDO.field1591
                     + var7.field1270[2];
               }

               if (-512792823 * client.field945 == 1) {
                  if (var12 <= 0) {
                     return;
                  }

                  classRP.method10155(
                     classKK.field3774,
                     client.field804 + " " + classDO.field1590 + " " + classQY.method9847(16777215, (byte)112) + var17,
                     14,
                     var8,
                     var9,
                     var10,
                     -1,
                     false,
                     var11,
                     -324749371
                  );
               } else if (client.field979) {
                  if (8 == (1547634457 * classLF.field4131 & 8)) {
                     classRP.method10155(
                        client.field924,
                        client.field983 + " " + classDO.field1590 + " " + classQY.method9847(16777215, (byte)57) + var17,
                        15,
                        var8,
                        var9,
                        var10,
                        -1,
                        false,
                        var11,
                        -324749371
                     );
                  }
               } else {
                  for (int var25 = 7; var25 >= 0; var25--) {
                     if (client.field968[var25] != null) {
                        short var27;
                        var27 = 0;
                        label216:
                        if (client.field968[var25].equalsIgnoreCase(classKK.field3776)) {
                           if (var12 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (client.field916 == classCK.field766) {
                              if (var12 <= 0) {
                                 return;
                              }
                              continue;
                           }

                           label213: {
                              if (client.field916 != classCK.field769) {
                                 if (var12 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (classCK.field765 != client.field916) {
                                    break label213;
                                 }

                                 if (var12 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7.field1261 * 810892507 <= var23) {
                                    break label213;
                                 }
                              }

                              var27 = 2000;
                           }

                           if (0 != var24) {
                              if (var12 <= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var7.field1265 * 532975721 != 0) {
                                 if (var12 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7.field1265 * 532975721 == var24) {
                                    if (var12 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var27 = 2000;
                                 } else {
                                    var27 = 0;
                                 }
                                 break label216;
                              }
                           }

                           if (client.field916 == classCK.field768) {
                              if (var12 <= 0) {
                                 return;
                              }

                              if (classCT.method2648(var7, -1817263910)) {
                                 if (var12 <= 0) {
                                    return;
                                 }

                                 var27 = 2000;
                              }
                           }
                        } else if (client.field801[var25]) {
                           if (var12 <= 0) {
                              return;
                           }

                           var27 = 2000;
                        }

                        int var28 = 0;
                        var28 = var27 + client.field821[var25];
                        classRP.method10155(
                           client.field968[var25], classQY.method9847(16777215, (byte)38) + var17, var28, var8, var9, var10, -1, false, var11, -324749371
                        );
                     }
                  }
               }

               for (int var26 = 0; var26 < -1927903443 * client.field974.field6797; var26++) {
                  if (var12 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (client.field974.field6800[var26] == 23) {
                     if (var12 <= 0) {
                        throw new IllegalStateException();
                     }

                     client.field974.field6805[var26] = classQY.method9847(16777215, (byte)88) + var17;
                     break;
                  }
               }
            }
         } catch (RuntimeException var22) {
            throw classEG.method3884(var22, "ho.fx(" + ')');
         }
      }
   }
}
