import net.runelite.api.ModelData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fk")
public class classFK {
   @ToRemove(unused = "true")
   @ObfuscatedName("co")
   static final int field2297 = 140;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2296 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   static final int field2298 = 252;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final long field2299 = -3932672073523589310L;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field2295 = 128;

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIILgc;Lee;Lee;I)V")
   @ObfuscatedName("at")
   static final void method4820(
      classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, classGC var9, classEE var10, classEE var11, int var12
   ) {
      try {
         classOM var13;
         int var14;
         int var15;
         int var16;
         label530: {
            var13 = classMU.method7729(var5, 1762392591);
            var14 = var8 >= 0 ? var8 : var13.field4951 * -1542230501;
            if (var6 != 1) {
               if (var12 == 892962765) {
                  return;
               }

               if (3 != var6) {
                  var15 = var13.field4944 * -582306509;
                  var16 = var13.field4924 * 402876423;
                  break label530;
               }

               if (var12 == 892962765) {
                  throw new IllegalStateException();
               }
            }

            var15 = var13.field4924 * 402876423;
            var16 = -582306509 * var13.field4944;
         }

         int var17;
         int var18;
         if (var3 + var15 <= var0.field1696 * 1296729483) {
            if (var12 == 892962765) {
               throw new IllegalStateException();
            }

            var17 = var3 + (var15 >> 1);
            var18 = var3 + (1 + var15 >> 1);
         } else {
            var17 = var3;
            var18 = 1 + var3;
         }

         int var19;
         int var20;
         if (var4 + var16 <= var0.field1692 * -1269171107) {
            var19 = var4 + (var16 >> 1);
            var20 = var4 + (1 + var16 >> 1);
         } else {
            var19 = var4;
            var20 = var4 + 1;
         }

         int[][] var21 = var0.field1688[var2];
         int var22 = var21[var18][var19] + var21[var17][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
         int var23 = (var15 << 6) + (var3 << 7);
         int var24 = (var16 << 6) + (var4 << 7);
         classEZ var25 = var0.field1689;
         boolean var10004;
         if (0 == 1663954033 * var13.field4923) {
            if (var12 == 892962765) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         long var26 = classRF.method9961(var1, var3, var4, 2, var10004, var5, 2140889407 * var0.field1699, (short)21022);
         int var28 = (var6 << 6) + var7;
         if (1291058669 * var13.field4956 == 1) {
            if (var12 == 892962765) {
               throw new IllegalStateException();
            }

            var28 += 256;
         }

         if (22 == var7) {
            Object var50;
            label411: {
               if (-1 == var14) {
                  if (var12 == 892962765) {
                     throw new IllegalStateException();
                  }

                  if (var13.field4930 == null) {
                     var50 = var13.method8544(22, var6, var21, var23, var22, var24, 1056473218);
                     break label411;
                  }
               }

               var50 = new classDY(var0, var5, 22, var6, var2, var3, var4, var14, var13.field4964, var10);
            }

            classEZ.method4464(var25, var1, var3, var4, var22, (classEE)var50, var26, var28);
            if (1 == var13.field4946 * -2040437663) {
               if (var12 == 892962765) {
                  return;
               }

               if (null != var9) {
                  if (var12 == 892962765) {
                     return;
                  }

                  classGC.method5371(var9, var3, var4, (byte)4);
               }
            }
         } else {
            if (var7 != 10) {
               if (var12 == 892962765) {
                  throw new IllegalStateException();
               }

               if (var7 != 11) {
                  if (var7 >= 12) {
                     Object var49;
                     if (var14 == -1 && var13.field4930 == null) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        var49 = var13.method8544(var7, var6, var21, var23, var22, var24, 282245732);
                     } else {
                        var49 = new classDY(var0, var5, var7, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4179(var1, var3, var4, var22, 1, 1, (classEE)var49, 0, var26, var28);
                     if (0 != -2040437663 * var13.field4946) {
                        if (var12 == 892962765) {
                           return;
                        }

                        if (var9 != null) {
                           if (var12 == 892962765) {
                              return;
                           }

                           classGC.method5361(var9, var3, var4, var15, var16, var13.field4947, (byte)28);
                        }
                     }

                     return;
                  }

                  if (0 == var7) {
                     if (var12 == 892962765) {
                        throw new IllegalStateException();
                     }

                     Object var48;
                     label425: {
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (var13.field4930 == null) {
                              var48 = var13.method8544(0, var6, var21, var23, var22, var24, -1046390359);
                              break label425;
                           }
                        }

                        var48 = new classDY(var0, var5, 0, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4434(var1, var3, var4, var22, (classEE)var48, null, classDI.field1505[var6], 0, var26, var28);
                     if (-2040437663 * var13.field4946 != 0 && null != var9) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        var9.method5348(var3, var4, var7, var6, var13.field4947, -2007446649);
                     }

                     return;
                  }

                  if (var7 == 1) {
                     if (var12 == 892962765) {
                        throw new IllegalStateException();
                     }

                     Object var47;
                     label434: {
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              return;
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var47 = var13.method8544(1, var6, var21, var23, var22, var24, 1008285301);
                              break label434;
                           }
                        }

                        var47 = new classDY(var0, var5, 1, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4434(var1, var3, var4, var22, (classEE)var47, null, classDI.field1513[var6], 0, var26, var28);
                     if (var13.field4946 * -2040437663 != 0) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        if (null != var9) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           var9.method5348(var3, var4, var7, var6, var13.field4947, 1181693377);
                        }
                     }

                     return;
                  }

                  if (2 == var7) {
                     Object var31;
                     int var46;
                     Object var54;
                     label443: {
                        var46 = var6 + 1 & 3;
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var54 = var13.method8544(2, 4 + var6, var21, var23, var22, var24, -1710523705);
                              var31 = var13.method8544(2, var46, var21, var23, var22, var24, -543004295);
                              break label443;
                           }
                        }

                        var54 = new classDY(var0, var5, 2, var6 + 4, var2, var3, var4, var14, var13.field4964, var10);
                        var31 = new classDY(var0, var5, 2, var46, var2, var3, var4, var14, var13.field4964, var11);
                     }

                     var25.method4434(var1, var3, var4, var22, (classEE)var54, (classEE)var31, classDI.field1505[var6], classDI.field1505[var46], var26, var28);
                     if (-2040437663 * var13.field4946 != 0 && var9 != null) {
                        var9.method5348(var3, var4, var7, var6, var13.field4947, -1396123545);
                     }

                     return;
                  }

                  if (3 == var7) {
                     if (var12 == 892962765) {
                        throw new IllegalStateException();
                     }

                     Object var45;
                     label451: {
                        if (var14 == -1) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (var13.field4930 == null) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var45 = var13.method8544(3, var6, var21, var23, var22, var24, -1649434716);
                              break label451;
                           }
                        }

                        var45 = new classDY(var0, var5, 3, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4434(var1, var3, var4, var22, (classEE)var45, null, classDI.field1513[var6], 0, var26, var28);
                     if (0 != var13.field4946 * -2040437663) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        if (null != var9) {
                           var9.method5348(var3, var4, var7, var6, var13.field4947, 26301346);
                        }
                     }

                     return;
                  }

                  if (var7 == 9) {
                     Object var44;
                     label460: {
                        if (var14 == -1) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var44 = var13.method8544(var7, var6, var21, var23, var22, var24, 921259943);
                              break label460;
                           }
                        }

                        var44 = new classDY(var0, var5, var7, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4179(var1, var3, var4, var22, 1, 1, (classEE)var44, 0, var26, var28);
                     if (-2040437663 * var13.field4946 != 0) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        if (null != var9) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           classGC.method5361(var9, var3, var4, var15, var16, var13.field4947, (byte)10);
                        }
                     }

                     return;
                  }

                  if (var7 == classKB.field3520.vmethod8((byte)1)) {
                     if (var12 == 892962765) {
                        return;
                     }

                     Object var43;
                     label468: {
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var43 = var13.method8544(var7, var6, var21, var23, var22, var24, -1495204728);
                              break label468;
                           }
                        }

                        var43 = new classDY(var0, var5, var7, var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4481(
                        var1,
                        var3,
                        var4,
                        var22,
                        (classEE)var43,
                        null,
                        classDI.field1505[var6],
                        0,
                        classDI.field1507[var6],
                        classDI.field1508[var6],
                        0,
                        0,
                        var26,
                        var28
                     );
                     return;
                  }

                  if (var7 == classKB.field3525.vmethod8((byte)1)) {
                     if (var12 == 892962765) {
                        return;
                     }

                     int var41 = 16;
                     long var53 = var25.method4455(var1, var3, var4);
                     if (var53 != 0L) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        var41 = classMU.method7729(classCN.method2552(var53), 1336987204).field4927 * -1659674841;
                     }

                     Object var56;
                     label477: {
                        var41++;
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              return;
                           }

                           if (var13.field4930 == null) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var56 = var13.method8544(classKB.field3520.vmethod8((byte)1), var6, var21, var23, var22, var24, -964167384);
                              break label477;
                           }
                        }

                        var56 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4481(
                        var1,
                        var3,
                        var4,
                        var22,
                        (classEE)var56,
                        null,
                        classDI.field1505[var6],
                        0,
                        classDI.field1507[var6] * var41,
                        var41 * classDI.field1508[var6],
                        0,
                        0,
                        var26,
                        var28
                     );
                     return;
                  }

                  if (var7 == classKB.field3522.vmethod8((byte)1)) {
                     if (var12 == 892962765) {
                        throw new IllegalStateException();
                     }

                     int var39 = 8;
                     long var52 = var25.method4439(var1, var3, var4);
                     if (var52 != 0L) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        var39 = classMU.method7729(classCN.method2552(var52), 1796451721).field4927 * -1659674841 / 2;
                     }

                     Object var55;
                     label488: {
                        var39++;
                        if (-1 == var14) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (var13.field4930 == null) {
                              var55 = var13.method8544(classKB.field3520.vmethod8((byte)1), 4 + var6, var21, var23, var22, var24, 403213395);
                              break label488;
                           }
                        }

                        var55 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4481(
                        var1,
                        var3,
                        var4,
                        var22,
                        (classEE)var55,
                        null,
                        256,
                        var6,
                        var39 * classDI.field1509[var6],
                        classDI.field1510[var6] * var39,
                        0,
                        0,
                        var26,
                        var28
                     );
                     return;
                  }

                  if (var7 == classKB.field3523.vmethod8((byte)1)) {
                     if (var12 == 892962765) {
                        throw new IllegalStateException();
                     }

                     Object var38;
                     int var51;
                     label499: {
                        var51 = var6 + 2 & 3;
                        if (var14 == -1) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var38 = var13.method8544(classKB.field3520.vmethod8((byte)1), var51 + 4, var21, var23, var22, var24, -2138695091);
                              break label499;
                           }
                        }

                        var38 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var51 + 4, var2, var3, var4, var14, var13.field4964, var10);
                     }

                     var25.method4481(
                        var1, var3, var4, var22, (classEE)var38, null, 256, var51, classDI.field1509[var51], classDI.field1510[var51], 0, 0, var26, var28
                     );
                     return;
                  }

                  if (var7 == classKB.field3524.vmethod8((byte)1)) {
                     int var36 = 8;
                     long var30 = var25.method4439(var1, var3, var4);
                     if (0L != var30) {
                        if (var12 == 892962765) {
                           throw new IllegalStateException();
                        }

                        var36 = classMU.method7729(classCN.method2552(var30), 1599776449).field4927 * -1659674841 / 2;
                     }

                     Object var32;
                     Object var33;
                     int var34;
                     label508: {
                        var36++;
                        var34 = 2 + var6 & 3;
                        if (var14 == -1) {
                           if (var12 == 892962765) {
                              throw new IllegalStateException();
                           }

                           if (null == var13.field4930) {
                              if (var12 == 892962765) {
                                 throw new IllegalStateException();
                              }

                              var32 = var13.method8544(classKB.field3520.vmethod8((byte)1), var6 + 4, var21, var23, var22, var24, 625289706);
                              var33 = var13.method8544(classKB.field3520.vmethod8((byte)1), var34 + 4, var21, var23, var22, var24, 893889394);
                              break label508;
                           }
                        }

                        var32 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), var6 + 4, var2, var3, var4, var14, var13.field4964, var10);
                        var33 = new classDY(var0, var5, classKB.field3520.vmethod8((byte)1), 4 + var34, var2, var3, var4, var14, var13.field4964, var11);
                     }

                     var25.method4481(
                        var1,
                        var3,
                        var4,
                        var22,
                        (classEE)var32,
                        (classEE)var33,
                        256,
                        var6,
                        classDI.field1509[var6] * var36,
                        var36 * classDI.field1510[var6],
                        classDI.field1509[var34],
                        classDI.field1510[var34],
                        var26,
                        var28
                     );
                     return;
                  }

                  return;
               }

               if (var12 == 892962765) {
                  throw new IllegalStateException();
               }
            }

            Object var29;
            if (var14 == -1 && var13.field4930 == null) {
               if (var12 == 892962765) {
                  throw new IllegalStateException();
               }

               var29 = var13.method8544(10, var6, var21, var23, var22, var24, -1581037939);
            } else {
               var29 = new classDY(var0, var5, 10, var6, var2, var3, var4, var14, var13.field4964, var10);
            }

            if (null != var29) {
               short var10008;
               if (11 == var7) {
                  if (var12 == 892962765) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               var25.method4179(var1, var3, var4, var22, var15, var16, (classEE)var29, var10008, var26, var28);
            }

            if (-2040437663 * var13.field4946 != 0) {
               if (var12 == 892962765) {
                  throw new IllegalStateException();
               }

               if (var9 != null) {
                  if (var12 == 892962765) {
                     throw new IllegalStateException();
                  }

                  classGC.method5361(var9, var3, var4, var15, var16, var13.field4947, (byte)-127);
               }
            }
         }
      } catch (RuntimeException var35) {
         throw classEG.method3884(var35, "fk.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("uw")
   public static void method4823(classEZ var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4213(var1, var1, var1);
      } else {
         for (int var4 = 0; var4 < var0.field2059; var4++) {
            for (int var5 = 0; var5 < var0.field2056; var5++) {
               for (int var6 = 0; var6 < var0.field2032; var6++) {
                  int var7 = var0.method4489(var4, var5, var6);
                  if (var0.method4389(var7)) {
                     classFE var8 = var0.field2008[var7];
                     if (var8 != null && var8.field2249 instanceof classER) {
                        classER var9 = (classER)var8.field2249;
                        var0.method4498(var9, var4, var5, var6, 1, 1);
                        if (var8.field2248 instanceof ModelData) {
                           classER var10 = (classER)var8.field2248;
                           var0.method4498(var10, var4, var5, var6, 1, 1);
                           classER.method4065(var9, var10, 0, 0, 0, false);
                           var8.field2248 = var10.method4061(var10.field1878, var10.field1879, var1, var2, var3);
                        }

                        var8.field2249 = var9.method4061(var9.field1878, var9.field1879, var1, var2, var3);
                     }

                     byte var13 = var0.field2012[var7];

                     for (int var14 = 0; var14 < var13; var14++) {
                        classFB var11 = var0.field2013[var7 * 5 + var14];
                        if (var11 != null && var11.field2200 instanceof classER) {
                           classER var12 = (classER)var11.field2200;
                           var0.method4498(
                              var12,
                              var4,
                              var5,
                              var6,
                              var11.field2186 * 304142753 - var11.field2188 * 1138017605 + 1,
                              var11.field2192 * -544424899 - var11.field2194 * -555977777 + 1
                           );
                           var11.field2200 = var12.method4061(var12.field1878, var12.field1879, var1, var2, var3);
                        }
                     }

                     classEO var15 = var0.field2010[var7];
                     if (var15 != null && var15.field1816 instanceof classER) {
                        classER var16 = (classER)var15.field1816;
                        var0.method4522(var16, var4, var5, var6);
                        var15.field1816 = var16.method4061(var16.field1878, var16.field1879, var1, var2, var3);
                     }
                  }
               }
            }
         }
      }
   }

   classFK() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ax")
   static final int method4806(int var0, int var1, int var2, int var3) {
      return var3 * var1 + var2 * var0 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ac")
   static final int method4807(int var0, int var1, int var2, int var3) {
      return var3 * var1 + var2 * var0 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("aa")
   static final int method4808(int var0, int var1, int var2, int var3) {
      return var3 * var1 + var2 * var0 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("ad")
   static final float method4814(float var0, float var1, float var2, float var3) {
      return var1 * var2 - var3 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("al")
   static final int method4810(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var3 * var0 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("aj")
   static final int method4811(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var3 * var0 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("ay")
   static final float method4813(float var0, float var1, float var2, float var3) {
      return var2 * var0 - var1 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ao")
   static final int method4812(int var0, int var1, int var2, int var3) {
      return var1 * var2 - var3 * var0 >> 16;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("dx")
   static final void method4822(byte var0) {
      if (!client.$assertionsDisabled && !client.field938) {
         throw new AssertionError();
      } else {
         if (client.field1122 == null) {
            rl4 var1 = new rl4(client.field1118, client.field1075, classIS.field3053, client.field1041);
            var1.field5789 = var1.field5771.field1709 * -1444178379;
            var1.field5785 = var1.field5771.field1708 * -351145363;
            var1.field5786 = classEI.field1772 * -1535860629;
            var1.field5787 = classBQ.field528 * 2016174363;
            var1.field5788 = classCQ.field1220.field1710 * -483624883;
            if (!client.$assertionsDisabled && client.field1123 != null) {
               throw new AssertionError();
            }

            client.field1122 = var1;
            var1.method10102();
         } else if (client.field1122.method10095()) {
            rl4 var2 = client.field1122;
            if (!client.$assertionsDisabled && client.field1123 != null) {
               throw new AssertionError();
            }

            client.field1122 = null;
            client.field1143 = false;
            classIS.field3053.field1710 = var2.field5788 * 339443845;
            client.method2301(var2);
            client.method2337(var2);
            if (!client.$assertionsDisabled && classOE.field4843.method2424() != 25) {
               throw new AssertionError();
            }

            if (!client.$assertionsDisabled && client.field938) {
               throw new AssertionError();
            }

            if (client.field1118 != var2.field5759 && client.field1118 != null) {
               client.field1026.info("Reloading due to draw callbacks change while loading!");
               client.field938 = true;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("ap")
   static final float method4816(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 150.75377F / var0 + 1.0100503F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("au")
   static final float method4817(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 150.75377F / var0 + 1.0100503F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("ai")
   static final float method4818(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 150.75377F / var0 + 1.0100503F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("as")
   static final int method4809(int var0, int var1, int var2, int var3) {
      return var3 * var1 + var2 * var0 >> 16;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("cq")
   static int method4821(int var0, classBL var1, boolean var2, byte var3) {
      try {
         if (7463 == var0) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 <= 2) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var4 = var10000;
               classON.method8615(var4, (byte)1);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "fk.cq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("aq")
   static final float method4815(float var0, float var1, float var2, float var3) {
      return var1 * var2 - var3 * var0;
   }

   @ObfuscatedSignature(descriptor = "(Lte;IB)I")
   @ObfuscatedName("ap")
   public static int method4819(classTE var0, int var1, byte var2) {
      try {
         classON.method8613(var0, classYY.field7111, -174188555);
         if (var1 >= 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            int[] var3 = var0.method10748(608246344);
            int var4 = var0.method10756(199963441);

            for (int var5 = 0; var5 < var4; var5++) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var1 < var3[var5]) {
                  return var5;
               }

               var1 -= var3[var5];
            }
         }

         return -1;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "fk.ap(" + 41);
      }
   }
}
