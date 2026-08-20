import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ml")
public class classML {
   @ObfuscatedName("ac")
   public int field4524;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4527 = 2;
   @ObfuscatedName("ab")
   public String field4532;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field4529 = 3;
   @ObfuscatedName("as")
   public int field4523;
   @ObfuscatedName("ax")
   public int field4526;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4530 = 0;
   @ObfuscatedName("ag")
   public float[] field4525;
   @ObfuscatedName("aj")
   static Object[] field4533;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4528 = 1;
   @ObfuscatedSignature(descriptor = "Lcs;")
   @ObfuscatedName("bi")
   static classCS field4531;

   classML(classMS var1) {
      this.this$0 = var1;
      this.field4525 = new float[4];
      this.field4523 = -1559171701;
      this.field4526 = 1098088659;
      this.field4524 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;[Ljava/lang/String;)V")
   @ObfuscatedName("ej")
   public static void method7596(SecureRandomSSLSocket var0, String[] var1) {
      if (var0 == null) {
         var0.getEnabledProtocols();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/StringBuilder;Lqi;II)V")
   @ObfuscatedName("as")
   static void method7597(String var0, StringBuilder var1, classQI var2, int var3, int var4) {
      try {
         String[] var5 = classKD.method6464(var0, (byte)-41);
         int var6 = -1;
         if (var5[1].equals("pronoun")) {
            if (var4 <= -1109565460) {
               throw new IllegalStateException();
            }

            var6 = var3;
         } else if (var5[1].startsWith("int")) {
            var6 = var2.method9565(var5[1], 708598902);
         } else {
            Boolean var7 = classQI.method9579(var2, var5[1], -2119278988);
            if (null != var7) {
               var6 = var7 ? 1 : 0;
            }
         }

         String var9;
         label47: {
            if (var6 >= 0) {
               if (var4 <= -1109565460) {
                  throw new IllegalStateException();
               }

               if (var6 < var5.length - 2) {
                  var9 = var5[var6 + 2];
                  break label47;
               }

               if (var4 <= -1109565460) {
                  return;
               }
            }

            var9 = var5[var5.length - 1];
         }

         var1.append(classLA.method6656(var9, var3, new StringBuilder(var9.length()), var2, 1967219408));
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "ml.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bc")
   static int method7598(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)38);
         if (2600 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -34809441 * var4.field4341;
               return 1;
            }
         } else if (2601 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4331 * -41424189;
               return 1;
            }
         } else if (2602 == var0) {
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.field4301;
            return 1;
         } else if (var0 == 2603) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4258 * -842862191;
            return 1;
         } else if (2604 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4269 * -714521463;
               return 1;
            }
         } else if (2605 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4338 * 245118287;
               return 1;
            }
         } else if (2606 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1246332317 * var4.field4356;
               return 1;
            }
         } else if (2607 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4294 * 827587461;
               return 1;
            }
         } else if (2608 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1008620329 * var4.field4292;
               return 1;
            }
         } else if (2609 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1517457381 * var4.field4347;
               return 1;
            }
         } else if (var0 == 2610) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4276 * 1991172799;
               return 1;
            }
         } else if (var0 == 2611) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1740831551 * var4.field4270;
               return 1;
            }
         } else if (2612 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4295 * 948260113;
               return 1;
            }
         } else if (2613 == var0) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4307.vmethod8((byte)1);
               return 1;
            }
         } else if (var0 == 2614) {
            if (var3 != 544148111) {
               throw new IllegalStateException();
            } else {
               int[] var40 = classBB.field323;
               int var55 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var70;
               if (var4.field4298) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var70 = 1;
               } else {
                  var70 = 0;
               }

               var40[var55] = var70;
               return 1;
            }
         } else {
            if (var0 == 2617) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               }

               classLI var5 = Widget.method7285(var4, 437269178);
               int[] var10000 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var10002;
               if (var5 != null) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.field4172 * -211319977;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
            }

            if (2618 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLI var25 = Widget.method7285(var4, 1757148795);
                  int[] var39 = classBB.field323;
                  int var54 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var69;
                  if (var25 != null) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var69 = var25.field4170 * 1532740787;
                  } else {
                     var69 = 0;
                  }

                  var39[var54] = var69;
                  return 1;
               }
            } else if (2619 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var24 = var4.method7283(-2120527674);
                  Object[] var38 = classBB.field328;
                  int var53 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var68;
                  if (var24 != null) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var68 = classLH.method6973(var24, 1580128890).method13854((byte)-110);
                  } else {
                     var68 = "";
                  }

                  var38[var53] = var68;
                  return 1;
               }
            } else if (2620 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLI var23 = Widget.method7285(var4, 707451256);
                  int[] var37 = classBB.field323;
                  int var52 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var67;
                  if (null != var23) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var67 = 201043577 * var23.field4169;
                  } else {
                     var67 = 0;
                  }

                  var37[var52] = var67;
                  return 1;
               }
            } else if (var0 == 2621) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var22 = var4.method7283(-1863949034);
                  int[] var36 = classBB.field323;
                  int var51 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var66;
                  if (null != var22) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var66 = var22.method7011((byte)-1);
                  } else {
                     var66 = 0;
                  }

                  var36[var51] = var66;
                  return 1;
               }
            } else if (var0 == 2622) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var21 = var4.method7283(-1191636309);
                  int[] var35 = classBB.field323;
                  int var50 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var65;
                  if (var21 != null) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var65 = classLH.method7014(var21, -2118783281);
                  } else {
                     var65 = 0;
                  }

                  var35[var50] = var65;
                  return 1;
               }
            } else if (2623 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var20 = var4.method7283(-2098898788);
                  int[] var34 = classBB.field323;
                  int var49 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var64;
                  if (var20 != null) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var64 = var20.method7017(759551096);
                  } else {
                     var64 = 0;
                  }

                  var34[var49] = var64;
                  return 1;
               }
            } else if (var0 == 2624) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  int[] var33;
                  int var48;
                  byte var63;
                  label420: {
                     classLH var19 = var4.method7283(-948174656);
                     var33 = classBB.field323;
                     var48 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                     if (var19 != null) {
                        if (var3 != 544148111) {
                           throw new IllegalStateException();
                        }

                        if (var19.method6982(2081719202)) {
                           if (var3 != 544148111) {
                              throw new IllegalStateException();
                           }

                           var63 = 1;
                           break label420;
                        }
                     }

                     var63 = 0;
                  }

                  var33[var48] = var63;
                  return 1;
               }
            } else if (var0 == 2625) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  int[] var32;
                  int var47;
                  byte var62;
                  label429: {
                     classLH var18 = var4.method7283(-327800412);
                     var32 = classBB.field323;
                     var47 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                     if (var18 != null) {
                        if (var3 != 544148111) {
                           throw new IllegalStateException();
                        }

                        if (var18.method6985(-880967958)) {
                           var62 = 1;
                           break label429;
                        }
                     }

                     var62 = 0;
                  }

                  var32[var47] = var62;
                  return 1;
               }
            } else if (2626 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var17 = var4.method7283(-1398310903);
                  Object[] var31 = classBB.field328;
                  int var46 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var61;
                  if (null != var17) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var61 = classLH.method6977(var17, 1447661178).method195(1136088356);
                  } else {
                     var61 = "";
                  }

                  var31[var46] = var61;
                  return 1;
               }
            } else if (2627 == var0) {
               classLH var16 = var4.method7283(-1133467715);
               int var6 = var16 != null ? var16.method6995(466374034) : 0;
               int var30;
               if (null != var16) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var30 = var16.method6994((byte)-5);
               } else {
                  var30 = 0;
               }

               int var7 = var30;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.min(var6, var7);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.max(var6, var7);
               return 1;
            } else if (var0 == 2628) {
               classLH var15 = var4.method7283(-1072508096);
               int[] var29 = classBB.field323;
               int var45 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var60;
               if (null != var15) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var60 = var15.method6994((byte)-63);
               } else {
                  var60 = 0;
               }

               var29[var45] = var60;
               return 1;
            } else if (var0 == 2629) {
               classLH var14 = var4.method7283(-541732279);
               int[] var28 = classBB.field323;
               int var44 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var59;
               if (null != var14) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var59 = var14.method7025(816998173);
               } else {
                  var59 = 0;
               }

               var28[var44] = var59;
               return 1;
            } else if (var0 == 2630) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var13 = var4.method7283(-1643040431);
                  int[] var27 = classBB.field323;
                  int var43 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var58;
                  if (null != var13) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var58 = var13.method7018(1145501488);
                  } else {
                     var58 = 0;
                  }

                  var27[var43] = var58;
                  return 1;
               }
            } else if (var0 == 2631) {
               classLH var12 = var4.method7283(-2035500379);
               int[] var26 = classBB.field323;
               int var42 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var57;
               if (null != var12) {
                  if (var3 != 544148111) {
                     throw new IllegalStateException();
                  }

                  var57 = var12.method7034((byte)3);
               } else {
                  var57 = 0;
               }

               var26[var42] = var57;
               return 1;
            } else if (2632 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classLH var11 = var4.method7283(-1856272486);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var11 ? var11.method7039((byte)-1) : 0;
                  return 1;
               }
            } else if (2633 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classTT var10 = Widget.method7287(var4, 1289741507);
                  classBB.field323[-324749371 * DynamicObject.field1679 - 1] = var10 != null
                     ? var10.method11138(classBB.field323[-324749371 * DynamicObject.field1679 - 1], 1819826338)
                     : 0;
                  return 1;
               }
            } else if (2634 == var0) {
               if (var3 != 544148111) {
                  throw new IllegalStateException();
               } else {
                  classTT var9 = Widget.method7287(var4, 1289741507);
                  int var41 = DynamicObject.field1679 * -324749371 - 1;
                  int var56;
                  if (null != var9) {
                     if (var3 != 544148111) {
                        throw new IllegalStateException();
                     }

                     var56 = var9.method11143((char)classBB.field323[DynamicObject.field1679 * -324749371 - 1], 1475886825);
                  } else {
                     var56 = 0;
                  }

                  classBB.field323[var41] = var56;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "ml.bc(" + 41);
      }
   }
}
