import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hl")
public class classHL {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2836 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2837 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2831 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2835 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2838 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final String field2840 = "JX_ACCESS_TOKEN";
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field2832 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("dy")
   static final int field2839 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2834 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2833 = 1;

   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIIIIII)V")
   @ObfuscatedName("ag")
   static final void method6071(classDZ var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         classGC[] var12 = var0.field1687;
         if (var12 != null) {
            if (var11 == -842430615) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var11 == -842430615) {
                  throw new IllegalStateException();
               }

               if (var2 < var12.length) {
                  classGC var13 = var12[var2];

                  for (int var14 = var3; var14 < 8 + var3; var14++) {
                     for (int var15 = var4; var15 < 8 + var4; var15++) {
                        if (var13.method5344(var14, var15, (byte)-34)) {
                           if (var11 == -842430615) {
                              throw new IllegalStateException();
                           }

                           var13.method5340(var14, var15, 1073741824, -2134326968);
                        }
                     }
                  }
               }
            }
         }

         classXY var32 = new classXY(var1);

         for (int var33 = 0; var33 < 4; var33++) {
            if (var11 == -842430615) {
               throw new IllegalStateException();
            }

            for (int var35 = 0; var35 < 64; var35++) {
               if (var11 == -842430615) {
                  throw new IllegalStateException();
               }

               for (int var16 = 0; var16 < 64; var16++) {
                  if (var11 == -842430615) {
                     throw new IllegalStateException();
                  }

                  if (var33 == var5) {
                     if (var11 == -842430615) {
                        throw new IllegalStateException();
                     }

                     if (var35 >= var6) {
                        if (var11 == -842430615) {
                           return;
                        }

                        if (var35 < var6 + 8) {
                           if (var11 == -842430615) {
                              throw new IllegalStateException();
                           }

                           if (var16 >= var7) {
                              if (var11 == -842430615) {
                                 throw new IllegalStateException();
                              }

                              if (var16 < 8 + var7) {
                                 if (var11 == -842430615) {
                                    throw new IllegalStateException();
                                 }

                                 int var19 = var35 & 7;
                                 int var20 = var16 & 7;
                                 int var21 = var8 & 3;
                                 int var18;
                                 if (0 == var21) {
                                    var18 = var19;
                                 } else if (1 == var21) {
                                    if (var11 == -842430615) {
                                       throw new IllegalStateException();
                                    }

                                    var18 = var20;
                                 } else if (2 == var21) {
                                    if (var11 == -842430615) {
                                       return;
                                    }

                                    var18 = 7 - var19;
                                 } else {
                                    var18 = 7 - var20;
                                 }

                                 int var22 = var18 + var3;
                                 int var25 = var35 & 7;
                                 int var26 = var16 & 7;
                                 int var27 = var8 & 3;
                                 int var24;
                                 if (var27 == 0) {
                                    if (var11 == -842430615) {
                                       throw new IllegalStateException();
                                    }

                                    var24 = var26;
                                 } else if (1 == var27) {
                                    if (var11 == -842430615) {
                                       return;
                                    }

                                    var24 = 7 - var25;
                                 } else if (2 == var27) {
                                    if (var11 == -842430615) {
                                       throw new IllegalStateException();
                                    }

                                    var24 = 7 - var26;
                                 } else {
                                    var24 = var25;
                                 }

                                 int var28 = var24 + var4;
                                 int var29 = var3 + var9 + (var35 & 7);
                                 int var30 = var4 + var10 + (var16 & 7);
                                 classKG.method6474(var0, var32, var2, var22, var28, var29, var30, var8, 124276289);
                                 continue;
                              }
                           }
                        }
                     }
                  }

                  classKG.method6474(var0, var32, 0, -1, -1, 0, 0, 0, -2084329643);
               }
            }
         }

         int var10000;
         if (var32.field6955 * 702114061 < var32.field6954.length) {
            if (var11 == -842430615) {
               throw new IllegalStateException();
            }

            var10000 = classXY.method13039(var32, -346779531);
         } else {
            var10000 = 0;
         }

         int var34 = var10000;
         boolean var38;
         if ((var34 & 1) != 0) {
            if (var11 == -842430615) {
               throw new IllegalStateException();
            }

            var38 = true;
         } else {
            var38 = false;
         }

         boolean var36 = var38;
         if (var36) {
            for (int var37 = 0; var37 < 64; var37++) {
               if (var11 == -842430615) {
                  throw new IllegalStateException();
               }

               for (int var17 = 0; var17 < 64; var17++) {
                  if (var11 == -842430615) {
                     return;
                  }

                  classLF.method6780(var32, 1347820516);
               }
            }
         }
      } catch (RuntimeException var31) {
         throw classEG.method3884(var31, "hl.ag(" + ')');
      }
   }

   classHL() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIII)Z")
   @ObfuscatedName("az")
   static boolean method6070(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      try {
         if (!classIY.method6336(var0, var1, var2, var3, var8, var9, var10, var11, -2040924807)) {
            if (var12 != -1453501658) {
               throw new IllegalStateException();
            }

            if (!classIY.method6336(var2, var3, var4, var5, var8, var9, var10, var11, -1690056408)
               && !classIY.method6336(var4, var5, var6, var7, var8, var9, var10, var11, -1766381226)) {
               if (var12 != -1453501658) {
                  throw new IllegalStateException();
               }

               if (!classIY.method6336(var6, var7, var0, var1, var8, var9, var10, var11, -1677007233)) {
                  return false;
               }

               if (var12 != -1453501658) {
                  throw new IllegalStateException();
               }
            }
         }

         return true;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "hl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfv;Z)V")
   @ObfuscatedName("ay")
   public static void method6073(classEZ var0, classFV var1, boolean var2) {
      if (var0 == null) {
         var0.method4354(var1, var2);
      }

      var0.field2041 = 0;

      for (int var3 = var0.field2040; var3 < var0.field2059; var3++) {
         classEW[][] var4 = var0.field2058[var3];

         for (int var5 = var0.field2120; var5 < var0.field2123; var5++) {
            for (int var6 = var0.field2113; var6 < var0.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.field1964 * 1390661409 <= var0.field2027
                     && (
                        !var2
                           || var0.method4311(var5 - var0.field2114 + var0.field2053 + var0.field2051, var6 - var0.field2124 + var0.field2054 + var0.field2051)
                           || var0.field2060[var3][var5][var6] - var0.field2119 >= 2000
                     )) {
                     var7.field1974 = true;
                     var7.field1976 = true;
                     var7.field1975 = var7.field1963 * -389646721 > 0 || var7.method4092((short)4076);
                     var0.field2041++;
                  } else {
                     var7.field1974 = false;
                     var7.field1976 = false;
                     var7.field1962 = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(var0.field2053);
      int var15 = Math.abs(var0.field2054);

      for (int var16 = var0.field2040; var16 < var0.field2059; var16++) {
         classEW[][] var18 = var0.field2058[var16];

         for (int var20 = -(var0.field2051 + var14); var20 <= 0; var20++) {
            int var8 = var0.field2114 + var20;
            int var9 = var0.field2114 - var20;
            if (var8 >= var0.field2120 || var9 < var0.field2123) {
               for (int var10 = -(var0.field2051 + var15); var10 <= 0; var10++) {
                  int var11 = var0.field2124 + var10;
                  int var12 = var0.field2124 - var10;
                  if (var8 >= var0.field2120 && var8 < var0.field2123) {
                     if (var11 >= var0.field2113 && var11 < var0.field2122) {
                        classEW var13 = var18[var8][var11];
                        if (var13 != null && var13.field1974) {
                           var0.method4407(var1, var13, true);
                        }
                     }

                     if (var12 >= var0.field2113 && var12 < var0.field2122) {
                        classEW var27 = var18[var8][var12];
                        if (var27 != null && var27.field1974) {
                           var0.method4407(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= var0.field2120 && var9 < var0.field2123) {
                     if (var11 >= var0.field2113 && var11 < var0.field2122) {
                        classEW var28 = var18[var9][var11];
                        if (var28 != null && var28.field1974) {
                           var0.method4407(var1, var28, true);
                        }
                     }

                     if (var12 >= var0.field2113 && var12 < var0.field2122) {
                        classEW var29 = var18[var9][var12];
                        if (var29 != null && var29.field1974) {
                           var0.method4407(var1, var29, true);
                        }
                     }
                  }

                  if (var0.field2041 == 0) {
                     var0.method4338();
                     classFL.method4827(classFH.field2257.field2215, var0.field2061);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = var0.field2040; var17 < var0.field2059; var17++) {
         classEW[][] var19 = var0.field2058[var17];

         for (int var21 = -(var0.field2051 + var14); var21 <= 0; var21++) {
            int var22 = var0.field2117 + var21;
            int var23 = var0.field2117 - var21;
            if (var22 >= var0.field2120 || var23 < var0.field2123) {
               for (int var24 = -(var0.field2051 + var15); var24 <= 0; var24++) {
                  int var25 = var0.field2115 + var24;
                  int var26 = var0.field2115 - var24;
                  if (var22 >= var0.field2120 && var22 < var0.field2123) {
                     if (var25 >= var0.field2113 && var25 < var0.field2122) {
                        classEW var30 = var19[var22][var25];
                        if (var30 != null && var30.field1974) {
                           var0.method4407(var1, var30, false);
                        }
                     }

                     if (var26 >= var0.field2113 && var26 < var0.field2122) {
                        classEW var31 = var19[var22][var26];
                        if (var31 != null && var31.field1974) {
                           var0.method4407(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= var0.field2120 && var23 < var0.field2123) {
                     if (var25 >= var0.field2113 && var25 < var0.field2122) {
                        classEW var32 = var19[var23][var25];
                        if (var32 != null && var32.field1974) {
                           var0.method4407(var1, var32, false);
                        }
                     }

                     if (var26 >= var0.field2113 && var26 < var0.field2122) {
                        classEW var33 = var19[var23][var26];
                        if (var33 != null && var33.field1974) {
                           var0.method4407(var1, var33, false);
                        }
                     }
                  }

                  if (var0.field2041 == 0) {
                     var0.method4338();
                     classFL.method4827(classFH.field2257.field2215, var0.field2061);
                     return;
                  }
               }
            }
         }
      }

      classFL.method4827(classFH.field2257.field2215, var0.field2061);
      var0.method4338();
   }

   @ObfuscatedSignature(descriptor = "([I[IIIB)V")
   @ObfuscatedName("ax")
   public static void method6072(int[] var0, int[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 == 0) {
               return;
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (var7 == Integer.MAX_VALUE) {
               if (var4 == 0) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var9 = var10000;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var4 == 0) {
                  return;
               }

               if (var0[var10] < (var10 & var9) + var7) {
                  if (var4 == 0) {
                     return;
                  }

                  int var11 = var0[var10];
                  var0[var10] = var0[var6];
                  var0[var6] = var11;
                  int var12 = var1[var10];
                  var1[var10] = var1[var6];
                  var1[var6++] = var12;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method6072(var0, var1, var2, var6 - 1, (byte)51);
            method6072(var0, var1, var6 + 1, var3, (byte)95);
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "hl.ax(" + ')');
      }
   }
}
