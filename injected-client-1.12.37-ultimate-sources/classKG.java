import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kg")
public class classKG {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field3578 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3575 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3574 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field3572 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3576 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3581 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field3573 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field3580 = 7;
   @ObfuscatedName("aj")
   public static boolean field3583;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   public static final int field3582 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field3577 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field3579 = 12;

   classKG() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method6472(int var0) {
      try {
         return 16384;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "kg.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)V")
   @ObfuscatedName("ls")
   public static void method6473(classBD var0) {
      var0.field374.shutdown();
      var0.field374 = null;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lxy;IIIIIII)V")
   @ObfuscatedName("ax")
   static final void method6474(classDZ var0, classXY var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         int[][][] var9 = var0.field1688;
         byte[][][] var10 = var0.field1702;
         if (var2 >= 0) {
            if (var8 == -1316961501) {
               throw new IllegalStateException();
            }

            if (var2 < 4) {
               if (var8 == -1316961501) {
                  throw new IllegalStateException();
               }

               if (var3 >= 0) {
                  if (var8 == -1316961501) {
                     return;
                  }

                  if (var3 < var9[0].length - 1) {
                     if (var8 == -1316961501) {
                        return;
                     }

                     if (var4 >= 0) {
                        if (var8 == -1316961501) {
                           return;
                        }

                        if (var4 < var9[0][0].length - 1) {
                           if (var8 == -1316961501) {
                              throw new IllegalStateException();
                           }

                           var10[var2][var3][var4] = 0;

                           while (true) {
                              int var11 = classXY.method13047(var1, -1095812026);
                              if (0 == var11) {
                                 if (var8 == -1316961501) {
                                    return;
                                 }

                                 if (var2 == 0) {
                                    int[] var19 = var9[0][var3];
                                    int var15 = var5 + 932731;
                                    int var16 = var6 + 556238;
                                    int var17 = classTA.method10731(45365 + var15, 91923 + var16, 4, 778053024)
                                       - 128
                                       + (classTA.method10731(10294 + var15, 37821 + var16, 2, 778053024) - 128 >> 1)
                                       + (classTA.method10731(var15, var16, 1, 778053024) - 128 >> 2);
                                    var17 = (int)(0.3 * var17) + 35;
                                    if (var17 < 10) {
                                       if (var8 == -1316961501) {
                                          throw new IllegalStateException();
                                       }

                                       var17 = 10;
                                    } else if (var17 > 60) {
                                       if (var8 == -1316961501) {
                                          throw new IllegalStateException();
                                       }

                                       var17 = 60;
                                    }

                                    var19[var4] = -var17 * 8;
                                 } else {
                                    var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
                                 }

                                 return;
                              }

                              if (1 == var11) {
                                 if (var8 == -1316961501) {
                                    throw new IllegalStateException();
                                 }

                                 int var12 = classXY.method13039(var1, -346779531);
                                 if (1 == var12) {
                                    var12 = 0;
                                 }

                                 if (0 == var2) {
                                    var9[0][var3][var4] = 8 * -var12;
                                 } else {
                                    var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
                                 }

                                 return;
                              }

                              if (var11 <= 49) {
                                 if (var8 == -1316961501) {
                                    throw new IllegalStateException();
                                 }

                                 classCO.field1182[var2][var3][var4] = (short)var1.method13050((byte)16);
                                 classBY.field619[var2][var3][var4] = (byte)((var11 - 2) / 4);
                                 classDI.field1518[var2][var3][var4] = (byte)(var7 + (var11 - 2) & 3);
                              } else if (var11 <= 81) {
                                 if (var8 == -1316961501) {
                                    throw new IllegalStateException();
                                 }

                                 var10[var2][var3][var4] = (byte)(var11 - 49);
                              } else {
                                 classDI.field1519[var2][var3][var4] = (short)(var11 - 81);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         classLF.method6780(var1, 1633073592);
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "kg.ax(" + ')');
      }
   }
}
