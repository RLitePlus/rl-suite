import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("st")
public class classST {
   @ObfuscatedName("ab")
   public static final float field6039 = Math.ulp(1.0F);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final float field6041 = 1.3333334F;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field6042 = 0.6666667F;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final float field6043 = 0.33333334F;
   @ObfuscatedName("ag")
   public static final float field6040 = 2.0F * field6039;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field6044 = 256;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("yy")
   public static void method10641(classCG var0) {
      if (var0 == null) {
         var0.method1478();
      }

      var0.field722 = classRC.field5640;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;FZ)F")
   @ObfuscatedName("ao")
   static float method10642(classSU var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method10685((byte)-21) != 0) {
         float var4 = var0.field6068[0].field6103 * 1210377865;
         float var5 = var0.field6068[var0.method10685((byte)-21) - 1].field6103 * -1881433073;
         float var6 = var5 - var4;
         if (var6 == 0.0F) {
            return var0.field6068[0].field6102;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var9 * var6;
            var8 = Math.abs(var8 + 1.0F);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (classSE.field5912 == var0.field6063) {
                  if (var9 != 0.0F) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (var0.field6063 != classSE.field5915 && classSE.field5914 != var0.field6063) {
                  if (classSE.field5913 == var0.field6063) {
                     var10 = var4 - var1;
                     float var13 = var0.field6068[0].field6101;
                     float var14 = var0.field6068[0].field6099;
                     var3 = var0.field6068[0].field6102;
                     if (var13 != 0.0F) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field6062 == classSE.field5912) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (var0.field6062 != classSE.field5915 && var0.field6062 != classSE.field5914) {
               if (classSE.field5913 == var0.field6062) {
                  var10 = var1 - var5;
                  float var24 = var0.field6068[var0.method10685((byte)-77) - 1].field6098;
                  float var25 = var0.field6068[var0.method10685((byte)-8) - 1].field6100;
                  var3 = var0.field6068[var0.method10685((byte)-111) - 1].field6102;
                  if (0.0F != var24) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = classGL.method5489(var0, var10, (byte)127);
            if (var2 && var0.field6063 == classSE.field5914) {
               float var26 = var0.field6068[var0.method10685((byte)-82) - 1].field6102 - var0.field6068[0].field6102;
               var3 -= var26 * var8;
            } else if (!var2 && classSE.field5914 == var0.field6062) {
               float var15 = var0.field6068[var0.method10685((byte)-51) - 1].field6102 - var0.field6068[0].field6102;
               var3 += var8 * var15;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFLsu;)V")
   @ObfuscatedName("au")
   static void method10650(float var0, float var1, float var2, float var3, classSU var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field6050 = var7 - var6 - var8;
      var4.field6051 = var8 + var8 + var8;
      var4.field6052 = var5 + (var5 + var5);
      var4.field6047 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;F)F")
   @ObfuscatedName("ac")
   static float method10639(classSU var0, float var1) {
      if (null == var0 || var0.method10685((byte)-126) == 0) {
         return 0.0F;
      } else if (!(var1 < var0.field6068[0].field6103 * 1210377865)) {
         if (var1 > var0.field6068[var0.method10685((byte)-40) - 1].field6103 * 1210377865) {
            return classSE.field5911 == var0.field6062
               ? var0.field6068[var0.method10685((byte)-49) - 1].field6102
               : classPP.method9087(var0, var1, false, (byte)1);
         } else if (var0.field6065) {
            return var0.field6068[0].field6102;
         } else {
            classSY var2 = var0.method10682(var1, 1391304917);
            boolean var3 = false;
            boolean var4 = false;
            if (null == var2) {
               return 0.0F;
            } else {
               if (0.0F == var2.field6098 && var2.field6100 == 0.0F) {
                  var3 = true;
               } else if (var2.field6098 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field6100) {
                  var4 = true;
               } else if (null != var2.field6104) {
                  if (var0.field6045) {
                     float var5 = var2.field6103 * 1210377865;
                     float var9 = var2.field6102;
                     float var6 = 0.33333334F * var2.field6098 + var5;
                     float var10 = var2.field6100 * 0.33333334F + var9;
                     float var8 = var2.field6104.field6103 * 1210377865;
                     float var12 = var2.field6104.field6102;
                     float var7 = var8 - 0.33333334F * var2.field6104.field6101;
                     float var11 = var12 - 0.33333334F * var2.field6104.field6099;
                     if (var0.field6064) {
                        classBS.method1220(var0, var5, var6, var7, var8, var9, var10, var11, var12, (byte)-110);
                     } else if (var0 != null) {
                        var0.field6057 = var5;
                        float var13 = var8 - var5;
                        float var14 = var12 - var9;
                        float var15 = var6 - var5;
                        float var16 = 0.0F;
                        float var17 = 0.0F;
                        if (0.0F != var15) {
                           var16 = (var10 - var9) / var15;
                        }

                        var15 = var8 - var7;
                        if (0.0F != var15) {
                           var17 = (var12 - var11) / var15;
                        }

                        float var18 = 1.0F / (var13 * var13);
                        float var19 = var13 * var16;
                        float var20 = var13 * var17;
                        var0.field6047 = var18 * (var19 + var20 - var14 - var14) / var13;
                        var0.field6052 = (var14 + (var14 + var14) - var19 - var19 - var20) * var18;
                        var0.field6051 = var16;
                        var0.field6050 = var9;
                     }

                     var0.field6045 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field6102;
               } else if (var4) {
                  return var1 != var2.field6103 * 1210377865 && var2.field6104 != null ? var2.field6104.field6102 : var2.field6102;
               } else if (var0.field6064) {
                  float var22;
                  if (var0 == null) {
                     var22 = 0.0F;
                  } else {
                     float var24;
                     if (var1 == var0.field6057) {
                        var24 = 0.0F;
                     } else if (var1 == var0.field6048) {
                        var24 = 1.0F;
                     } else {
                        var24 = (var1 - var0.field6057) / (var0.field6048 - var0.field6057);
                     }

                     float var25;
                     if (var0.field6066) {
                        var25 = var24;
                     } else {
                        float[] var26 = new float[4];
                        var26[3] = var0.field6050;
                        var26[2] = var0.field6051;
                        var26[1] = var0.field6052;
                        var26[0] = var0.field6047 - var24;
                        float[] var27 = new float[5];
                        int var28 = classEL.method3916(var26, 3, 0.0F, true, 1.0F, true, var27, 894678397);
                        if (var28 == 1) {
                           var25 = var27[0];
                        } else {
                           var25 = 0.0F;
                        }
                     }

                     var22 = var0.field6058 + var25 * (var25 * (var0.field6053 * var25 + var0.field6049) + var0.field6054);
                  }

                  return var22;
               } else {
                  float var21;
                  if (var0 == null) {
                     var21 = 0.0F;
                  } else {
                     float var23 = var1 - var0.field6057;
                     var21 = var0.field6050 + (var0.field6051 + var23 * (var0.field6047 * var23 + var0.field6052)) * var23;
                  }

                  return var21;
               }
            }
         }
      } else {
         return var0.field6063 == classSE.field5911 ? var0.field6068[0].field6102 : classPP.method9087(var0, var1, true, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;FZ)F")
   @ObfuscatedName("aa")
   static float method10643(classSU var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method10685((byte)-23) != 0) {
         float var4 = var0.field6068[0].field6103 * 1210377865;
         float var5 = var0.field6068[var0.method10685((byte)-64) - 1].field6103 * 1210377865;
         float var6 = var5 - var4;
         if (var6 == 0.0F) {
            return var0.field6068[0].field6102;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var9 * var6;
            var8 = Math.abs(var8 + 1.0F);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (classSE.field5912 == var0.field6063) {
                  if (var9 != 0.0F) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (var0.field6063 != classSE.field5915 && classSE.field5914 != var0.field6063) {
                  if (classSE.field5913 == var0.field6063) {
                     var10 = var4 - var1;
                     float var13 = var0.field6068[0].field6101;
                     float var14 = var0.field6068[0].field6099;
                     var3 = var0.field6068[0].field6102;
                     if (var13 != 0.0F) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field6062 == classSE.field5912) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (var0.field6062 != classSE.field5915 && var0.field6062 != classSE.field5914) {
               if (classSE.field5913 == var0.field6062) {
                  var10 = var1 - var5;
                  float var24 = var0.field6068[var0.method10685((byte)-88) - 1].field6098;
                  float var25 = var0.field6068[var0.method10685((byte)-76) - 1].field6100;
                  var3 = var0.field6068[var0.method10685((byte)-96) - 1].field6102;
                  if (0.0F != var24) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = classGL.method5489(var0, var10, (byte)127);
            if (var2 && var0.field6063 == classSE.field5914) {
               float var26 = var0.field6068[var0.method10685((byte)-58) - 1].field6102 - var0.field6068[0].field6102;
               var3 -= var26 * var8;
            } else if (!var2 && classSE.field5914 == var0.field6062) {
               float var15 = var0.field6068[var0.method10685((byte)-62) - 1].field6102 - var0.field6068[0].field6102;
               var3 += var8 * var15;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;FZ)F")
   @ObfuscatedName("al")
   static float method10644(classSU var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method10685((byte)-2) != 0) {
         float var4 = var0.field6068[0].field6103 * 1210377865;
         float var5 = var0.field6068[var0.method10685((byte)7) - 1].field6103 * 1210377865;
         float var6 = var5 - var4;
         if (var6 == 0.0F) {
            return var0.field6068[0].field6102;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var9 * var6;
            var8 = Math.abs(var8 + 1.0F);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (classSE.field5912 == var0.field6063) {
                  if (var9 != 0.0F) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (var0.field6063 != classSE.field5915 && classSE.field5914 != var0.field6063) {
                  if (classSE.field5913 == var0.field6063) {
                     var10 = var4 - var1;
                     float var13 = var0.field6068[0].field6101;
                     float var14 = var0.field6068[0].field6099;
                     var3 = var0.field6068[0].field6102;
                     if (var13 != 0.0F) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field6062 == classSE.field5912) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (var0.field6062 != classSE.field5915 && var0.field6062 != classSE.field5914) {
               if (classSE.field5913 == var0.field6062) {
                  var10 = var1 - var5;
                  float var24 = var0.field6068[var0.method10685((byte)-85) - 1].field6098;
                  float var25 = var0.field6068[var0.method10685((byte)-118) - 1].field6100;
                  var3 = var0.field6068[var0.method10685((byte)-10) - 1].field6102;
                  if (0.0F != var24) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = classGL.method5489(var0, var10, (byte)127);
            if (var2 && var0.field6063 == classSE.field5914) {
               float var26 = var0.field6068[var0.method10685((byte)-62) - 1].field6102 - var0.field6068[0].field6102;
               var3 -= var26 * var8;
            } else if (!var2 && classSE.field5914 == var0.field6062) {
               float var15 = var0.field6068[var0.method10685((byte)-96) - 1].field6102 - var0.field6068[0].field6102;
               var3 += var8 * var15;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   classST() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;FFFFFFFF)V")
   @ObfuscatedName("aj")
   static void method10645(classSU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (var9 != 0.0F) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.field6066 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               classBU.method1247(var12, 290446099);
            }

            if (var13 != var12[0]) {
               var2 = var12[0] * var9 + var1;
               if (0.0F != var13) {
                  var6 = var5 + (var6 - var5) * var12[0] / var13;
               }
            }

            if (var12[1] != var14) {
               var3 = var1 + var12[1] * var9;
               if (1.0F != var14) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.field6057 = var1;
            var0.field6048 = var4;
            classBL.method1147(0.0F, var12[0], var12[1], 1.0F, var0, 2105431674);
            float var15 = var6 - var5;
            float var16 = var7 - var6;
            float var17 = var8 - var7;
            float var18 = var16 - var15;
            var0.field6053 = var17 - var16 - var18;
            var0.field6049 = var18 + (var18 + var18);
            var0.field6054 = var15 + var15 + var15;
            var0.field6058 = var5;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("ay")
   static void method10646(float[] var0) {
      if (field6039 + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt(var1 * var1 - var2 * 4.0F * var2);
         float var4 = (-var1 + var3) * 0.5F;
         if (field6039 + var0[1] > var4) {
            var0[1] = var4 - field6039;
         } else {
            var4 = 0.5F * (-var1 - var3);
            if (var0[1] < field6039 + var4) {
               var0[1] = var4 + field6039;
            }
         }
      } else {
         var0[0] = 1.3333334F - field6039;
         var0[1] = 0.33333334F - field6039;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("aq")
   static void method10647(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = 1.0F + (var0[0] * (var0[0] - 2.0F + var0[1]) + (var0[1] - 2.0F) * var0[1]);
         if (var1 + field6039 > 0.0F) {
            classIF.method6208(var0, -850399243);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("ad")
   static void method10648(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = 1.0F + (var0[0] * (var0[0] - 2.0F + var0[1]) + (var0[1] - 2.0F) * var0[1]);
         if (var1 + field6039 > 0.0F) {
            classIF.method6208(var0, -850399243);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("ap")
   static void method10649(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var1 = 1.0F + (var0[0] * (var0[0] - 2.0F + var0[1]) + (var0[1] - 2.0F) * var0[1]);
         if (var1 + field6039 > 0.0F) {
            classIF.method6208(var0, -850399243);
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;F)F")
   @ObfuscatedName("ax")
   static float method10640(classSU var0, float var1) {
      if (null == var0 || var0.method10685((byte)1) == 0) {
         return 0.0F;
      } else if (!(var1 < var0.field6068[0].field6103 * -118462844)) {
         if (var1 > var0.field6068[var0.method10685((byte)-29) - 1].field6103 * -2144139951) {
            return classSE.field5911 == var0.field6062
               ? var0.field6068[var0.method10685((byte)-28) - 1].field6102
               : classPP.method9087(var0, var1, false, (byte)1);
         } else if (var0.field6065) {
            return var0.field6068[0].field6102;
         } else {
            classSY var2 = var0.method10682(var1, 1391304917);
            boolean var3 = false;
            boolean var4 = false;
            if (null == var2) {
               return 0.0F;
            } else {
               if (0.0F == var2.field6098 && var2.field6100 == 0.0F) {
                  var3 = true;
               } else if (var2.field6098 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field6100) {
                  var4 = true;
               } else if (null != var2.field6104) {
                  if (var0.field6045) {
                     float var5 = var2.field6103 * 1210377865;
                     float var9 = var2.field6102;
                     float var6 = 0.33333334F * var2.field6098 + var5;
                     float var10 = var2.field6100 * 0.33333334F + var9;
                     float var8 = var2.field6104.field6103 * 1210377865;
                     float var12 = var2.field6104.field6102;
                     float var7 = var8 - 0.33333334F * var2.field6104.field6101;
                     float var11 = var12 - 0.33333334F * var2.field6104.field6099;
                     if (var0.field6064) {
                        classBS.method1220(var0, var5, var6, var7, var8, var9, var10, var11, var12, (byte)-103);
                     } else if (var0 != null) {
                        var0.field6057 = var5;
                        float var13 = var8 - var5;
                        float var14 = var12 - var9;
                        float var15 = var6 - var5;
                        float var16 = 0.0F;
                        float var17 = 0.0F;
                        if (0.0F != var15) {
                           var16 = (var10 - var9) / var15;
                        }

                        var15 = var8 - var7;
                        if (0.0F != var15) {
                           var17 = (var12 - var11) / var15;
                        }

                        float var18 = 1.0F / (var13 * var13);
                        float var19 = var13 * var16;
                        float var20 = var13 * var17;
                        var0.field6047 = var18 * (var19 + var20 - var14 - var14) / var13;
                        var0.field6052 = (var14 + (var14 + var14) - var19 - var19 - var20) * var18;
                        var0.field6051 = var16;
                        var0.field6050 = var9;
                     }

                     var0.field6045 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field6102;
               } else if (var4) {
                  return var1 != var2.field6103 * 1210377865 && var2.field6104 != null ? var2.field6104.field6102 : var2.field6102;
               } else if (var0.field6064) {
                  float var22;
                  if (var0 == null) {
                     var22 = 0.0F;
                  } else {
                     float var24;
                     if (var1 == var0.field6057) {
                        var24 = 0.0F;
                     } else if (var1 == var0.field6048) {
                        var24 = 1.0F;
                     } else {
                        var24 = (var1 - var0.field6057) / (var0.field6048 - var0.field6057);
                     }

                     float var25;
                     if (var0.field6066) {
                        var25 = var24;
                     } else {
                        float[] var26 = new float[4];
                        var26[3] = var0.field6050;
                        var26[2] = var0.field6051;
                        var26[1] = var0.field6052;
                        var26[0] = var0.field6047 - var24;
                        float[] var27 = new float[5];
                        int var28 = classEL.method3916(var26, 3, 0.0F, true, 1.0F, true, var27, 653864010);
                        if (var28 == 1) {
                           var25 = var27[0];
                        } else {
                           var25 = 0.0F;
                        }
                     }

                     var22 = var0.field6058 + var25 * (var25 * (var0.field6053 * var25 + var0.field6049) + var0.field6054);
                  }

                  return var22;
               } else {
                  float var21;
                  if (var0 == null) {
                     var21 = 0.0F;
                  } else {
                     float var23 = var1 - var0.field6057;
                     var21 = var0.field6050 + (var0.field6051 + var23 * (var0.field6047 * var23 + var0.field6052)) * var23;
                  }

                  return var21;
               }
            }
         }
      } else {
         return var0.field6063 == classSE.field5911 ? var0.field6068[0].field6102 : classPP.method9087(var0, var1, true, (byte)1);
      }
   }
}
