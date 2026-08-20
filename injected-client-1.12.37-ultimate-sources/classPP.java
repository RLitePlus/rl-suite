import net.runelite.api.NpcOverrides;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pp")
public class classPP implements NpcOverrides {
   @ObfuscatedName("af")
   public int[] field5374;
   @ObfuscatedName("ax")
   public int[] field5379;
   @ObfuscatedName("ae")
   public short[] field5375;
   @ObfuscatedSignature(descriptor = "Ldk;")
   @ObfuscatedName("gu")
   static classDK field5380;
   @ObfuscatedName("as")
   public boolean field5377 = false;
   @ObfuscatedName("az")
   public long field5378;
   @ObfuscatedName("ab")
   short[] field5376;
   @ObfuscatedName("ac")
   public int field5372;
   @ObfuscatedName("ag")
   public boolean field5373 = false;

   public classPP(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this(var1, var3, var4, var5, var6, false, 0, null);
   }

   public short[] getTextureToReplaceWith() {
      return this.field5376;
   }

   public classPP(long var1, int[] var3, short[] var4, short[] var5, boolean var6, boolean var7, int var8, int[] var9) {
      this.field5372 = 0;
      this.field5378 = 1448637320550906347L * var1;
      this.field5374 = var3;
      this.field5375 = var4;
      this.field5376 = var5;
      this.field5377 = var6;
      this.field5373 = var7;
      this.field5372 = var8 * -1590649111;
      this.field5379 = var9;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)J")
   @ObfuscatedName("uv")
   public static long method9085(classAAC var0) {
      if (var0 == null) {
         var0.method152();
      }

      return -757454725848334387L * var0.field30;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;Lef;I)V")
   @ObfuscatedName("ny")
   public static void method9089(classFX var0, classEF var1, int var2) {
      if (var0 == null) {
         var0.method5231(var1, var2);
      }

      var0.method5240(rl21.field5728, var1, var2);
   }

   public boolean useLocalPlayer() {
      return this.field5377;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvc;Llw;)Z")
   @ObfuscatedName("aj")
   public static boolean method9084(classVC var0, classLW var1) {
      return var0.field6490 == var1;
   }

   public int[] getModelIds() {
      return this.field5374;
   }

   public short[] getColorToReplaceWith() {
      return this.field5375;
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIZLvv;Lqn;I)V")
   @ObfuscatedName("ab")
   static void method9086(classLW[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, classVV var8, classQN var9, int var10) {
      try {
         for (int var11 = var1; var11 <= var2; var11++) {
            if (var10 == 846735874) {
               throw new IllegalStateException();
            }

            classLW var12 = var0[var11];
            if (null == var12) {
               if (var10 == 846735874) {
                  throw new IllegalStateException();
               }
            } else if (var3 == var12.field4342 * -1502647899) {
               if (var10 == 846735874) {
                  throw new IllegalStateException();
               }

               if (var12.field4263 * 653784551 != var4) {
                  if (var10 == 846735874) {
                     throw new IllegalStateException();
                  }
               } else {
                  classPF.method8855(var12, var5, var6, var7, var8, var9, (short)27391);
                  classMP.method7637(var12, var5, var6, (short)-9244);
                  if (-34809441 * var12.field4341 > -842862191 * var12.field4258 - var12.field4249 * 1115597881) {
                     if (var10 == 846735874) {
                        return;
                     }

                     var12.field4341 = var12.field4258 * -1437415729 - var12.field4249 * 2134006567;
                  }

                  if (-34809441 * var12.field4341 < 0) {
                     if (var10 == 846735874) {
                        throw new IllegalStateException();
                     }

                     var12.field4341 = 0;
                  }

                  if (-41424189 * var12.field4331 > -714521463 * var12.field4269 - 293773697 * var12.field4259) {
                     var12.field4331 = var12.field4269 * -1471306045 - var12.field4259 * 577918571;
                  }

                  if (var12.field4331 * -41424189 < 0) {
                     if (var10 == 846735874) {
                        throw new IllegalStateException();
                     }

                     var12.field4331 = 0;
                  }

                  if (0 == var12.field4375 * -1510882375) {
                     if (var10 == 846735874) {
                        return;
                     }

                     classFC.method4586(var0, var12, var7, var8, var9, -405164896);
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "pp.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("ht")
   public static void method9088(classLH var0, boolean var1) {
      classAAG var2 = var0.field4159.method13871(0, -698145269 * var0.field4157, 1492145276);
      classWB var3 = var2.method214((byte)-111);
      var0.method7075(
         var0.field4159.method13898((Integer)var3.field6654, 236265915 * var0.field4153 + var0.field4160 * -457263387, -1660367962), var1, -1827828406
      );
   }

   @ObfuscatedSignature(descriptor = "(Lsu;FZB)F")
   @ObfuscatedName("af")
   static float method9087(classSU var0, float var1, boolean var2, byte var3) {
      try {
         float var4 = 0.0F;
         if (var0 != null) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (var0.method10685((byte)-109) != 0) {
               float var5 = var0.field6068[0].field6103 * 1210377865;
               float var6 = var0.field6068[var0.method10685((byte)-3) - 1].field6103 * 1210377865;
               float var7 = var6 - var5;
               if (var7 == 0.0F) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  return var0.field6068[0].field6102;
               }

               float var8 = 0.0F;
               if (var1 > var6) {
                  var8 = (var1 - var6) / var7;
               } else {
                  var8 = (var1 - var5) / var7;
               }

               float var9 = (int)var8;
               float var10 = Math.abs(var8 - var9);
               float var11 = var10 * var7;
               var9 = Math.abs(var9 + 1.0F);
               float var12 = var9 / 2.0F;
               float var13 = (int)var12;
               var10 = var12 - var13;
               if (var2) {
                  if (classSE.field5912 == var0.field6063) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var10 != 0.0F) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        var11 += var5;
                     } else {
                        var11 = var6 - var11;
                     }
                  } else {
                     label152: {
                        if (var0.field6063 != classSE.field5915) {
                           if (var3 != 1) {
                              throw new IllegalStateException();
                           }

                           if (classSE.field5914 != var0.field6063) {
                              if (classSE.field5913 == var0.field6063) {
                                 if (var3 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = var5 - var1;
                                 float var14 = var0.field6068[0].field6101;
                                 float var15 = var0.field6068[0].field6099;
                                 var4 = var0.field6068[0].field6102;
                                 if (var14 != 0.0F) {
                                    if (var3 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var4 -= var15 * var11 / var14;
                                 }

                                 return var4;
                              }
                              break label152;
                           }

                           if (var3 != 1) {
                              throw new IllegalStateException();
                           }
                        }

                        var11 = var6 - var11;
                     }
                  }
               } else if (var0.field6062 == classSE.field5912) {
                  if (0.0F != var10) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var11 = var6 - var11;
                  } else {
                     var11 += var5;
                  }
               } else {
                  label145: {
                     if (var0.field6062 != classSE.field5915) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        if (var0.field6062 != classSE.field5914) {
                           if (classSE.field5913 == var0.field6062) {
                              if (var3 != 1) {
                                 throw new IllegalStateException();
                              }

                              var11 = var1 - var6;
                              float var26 = var0.field6068[var0.method10685((byte)-77) - 1].field6098;
                              float var27 = var0.field6068[var0.method10685((byte)2) - 1].field6100;
                              var4 = var0.field6068[var0.method10685((byte)-54) - 1].field6102;
                              if (0.0F != var26) {
                                 if (var3 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var4 += var27 * var11 / var26;
                              }

                              return var4;
                           }
                           break label145;
                        }

                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }
                     }

                     var11 += var5;
                  }
               }

               var4 = classGL.method5489(var0, var11, (byte)127);
               if (var2) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var0.field6063 == classSE.field5914) {
                     float var28 = var0.field6068[var0.method10685((byte)-110) - 1].field6102 - var0.field6068[0].field6102;
                     var4 -= var28 * var9;
                     return var4;
                  }
               }

               if (!var2) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (classSE.field5914 == var0.field6062) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     float var16 = var0.field6068[var0.method10685((byte)-31) - 1].field6102 - var0.field6068[0].field6102;
                     var4 += var9 * var16;
                  }
               }

               return var4;
            }

            if (var3 != 1) {
               throw new IllegalStateException();
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "pp.af(" + ')');
      }
   }
}
