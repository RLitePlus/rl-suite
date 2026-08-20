import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zt")
public class classZT {
   @ObfuscatedName("az")
   int[] field7270;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method14192(int var1) {
      int var2 = (this.field7270.length >> 1) - 1;
      int var3 = var1 & var2;

      while (true) {
         int var4 = this.field7270[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.field7270[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("ae")
   public static void method14197(classXY var0, int var1, byte var2) {
      try {
         classZQ var3 = new classZQ();
         var3.field7235 = classXY.method13039(var0, -346779531) * -1690461015;
         var3.field7236 = var0.method13056((byte)1) * 1763716747;
         var3.field7237 = new int[569821081 * var3.field7235];
         var3.field7239 = new int[569821081 * var3.field7235];
         var3.field7240 = new Field[569821081 * var3.field7235];
         var3.field7238 = new int[569821081 * var3.field7235];
         var3.field7241 = new Method[var3.field7235 * 569821081];
         var3.field7242 = new byte[var3.field7235 * 569821081][][];

         for (int var4 = 0; var4 < var3.field7235 * 569821081; var4++) {
            try {
               int var5 = classXY.method13039(var0, -346779531);
               if (0 != var5 && var5 != 1) {
                  if (var5 != 2) {
                     if (var5 != 3) {
                        if (var5 != 4) {
                           continue;
                        }

                        if (var2 != 0) {
                           return;
                        }
                     }

                     String var27 = var0.method13071(-269881753);
                     String var28 = var0.method13071(-982201102);
                     int var29 = classXY.method13039(var0, -346779531);
                     String[] var9 = new String[var29];

                     for (int var10 = 0; var10 < var29; var10++) {
                        var9[var10] = var0.method13071(-278018084);
                     }

                     String var30 = var0.method13071(742639869);
                     byte[][] var11 = new byte[var29][];
                     if (3 == var5) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        for (int var12 = 0; var12 < var29; var12++) {
                           if (var2 != 0) {
                              throw new IllegalStateException();
                           }

                           int var13 = var0.method13056((byte)1);
                           var11[var12] = new byte[var13];
                           var0.method13084(var11[var12], 0, var13, (byte)19);
                        }
                     }

                     var3.field7237[var4] = var5;
                     Class[] var31 = new Class[var29];

                     for (int var32 = 0; var32 < var29; var32++) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        var31[var32] = classCD.method1431(var9[var32], (byte)-81);
                     }

                     Class var33 = classCD.method1431(var30, (byte)32);
                     if (classCD.method1431(var27, (byte)22).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     Method[] var14 = classCD.method1431(var27, (byte)-95).getDeclaredMethods();
                     Method[] var15 = var14;

                     for (int var16 = 0; var16 < var15.length; var16++) {
                        if (var2 != 0) {
                           return;
                        }

                        Method var17 = var15[var16];
                        if (var17.getName().equals(var28)) {
                           if (var2 != 0) {
                              throw new IllegalStateException();
                           }

                           Class[] var18 = var17.getParameterTypes();
                           if (var31.length == var18.length) {
                              boolean var19 = true;

                              for (int var20 = 0; var20 < var31.length; var20++) {
                                 if (var2 != 0) {
                                    return;
                                 }

                                 if (var31[var20] != var18[var20]) {
                                    if (var2 != 0) {
                                       throw new IllegalStateException();
                                    }

                                    var19 = false;
                                    break;
                                 }
                              }

                              if (var19) {
                                 if (var2 != 0) {
                                    return;
                                 }

                                 if (var33 == var17.getReturnType()) {
                                    var3.field7241[var4] = var17;
                                 }
                              }
                           }
                        }
                     }

                     var3.field7242[var4] = var11;
                     continue;
                  }

                  if (var2 != 0) {
                     return;
                  }
               }

               String var6 = var0.method13071(450427643);
               String var7 = var0.method13071(396427196);
               int var8 = 0;
               if (var5 == 1) {
                  if (var2 != 0) {
                     return;
                  }

                  var8 = var0.method13056((byte)1);
               }

               var3.field7237[var4] = var5;
               var3.field7238[var4] = var8;
               if (classCD.method1431(var6, (byte)-63).getClassLoader() == null) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  throw new SecurityException();
               }

               var3.field7240[var4] = classCD.method1431(var6, (byte)-6).getDeclaredField(var7);
            } catch (ClassNotFoundException var21) {
               var3.field7239[var4] = -1;
            } catch (SecurityException var22) {
               var3.field7239[var4] = -2;
            } catch (NullPointerException var23) {
               var3.field7239[var4] = -3;
            } catch (Exception var24) {
               var3.field7239[var4] = -4;
            } catch (Throwable var25) {
               var3.field7239[var4] = -5;
            }
         }

         IterableNodeDeque.method8156(classZJ.field7189, var3);
      } catch (RuntimeException var26) {
         throw classEG.method3884(var26, "zt.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzt;II)I")
   @ObfuscatedName("vf")
   public static int method14193(classZT var0, int var1, int var2) {
      if (var0 == null) {
         var0.method14196(var1, var1);
      }

      try {
         int var3 = (var0.field7270.length >> 1) - 1;
         int var4 = var1 & var3;

         while (true) {
            int var5 = var0.field7270[1 + var4 + var4];
            if (-1 == var5) {
               if (var2 >= -2065373781) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (var0.field7270[var4 + var4] == var1) {
               return var5;
            }

            var4 = 1 + var4 & var3;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "zt.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzt;I)I")
   @ObfuscatedName("im")
   public static int method14194(classZT var0, int var1) {
      int var2 = (var0.field7270.length >> 1) - 1;
      int var3 = var1 & var2;

      while (true) {
         int var4 = var0.field7270[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (var0.field7270[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method14195(int var1) {
      int var2 = (this.field7270.length >> 1) - 1;
      int var3 = var1 & var2;

      while (true) {
         int var4 = this.field7270[1 + var3 + var3];
         if (-1 == var4) {
            return -1;
         }

         if (this.field7270[var3 + var3] == var1) {
            return var4;
         }

         var3 = 1 + var3 & var2;
      }
   }

   public classZT(int[] var1) {
      byte var2 = 1;

      while (var2 <= (var1.length >> 1) + var1.length) {
         var2 <<= 1;
      }

      this.field7270 = new int[var2 + var2];

      for (int var3 = 0; var3 < var2 + var2; var3++) {
         this.field7270[var3] = -1;
      }

      int var5 = 0;

      while (var5 < var1.length) {
         int var4 = var1[var5] & var2 - 1;

         while (this.field7270[var4 + var4 + 1] != -1) {
            var4 = 1 + var4 & var2 - 1;
         }

         this.field7270[var4 + var4] = var1[var5];
         this.field7270[var4 + var4 + 1] = var5++;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public int method14196(int var1, int var2) {
      try {
         int var3 = (this.field7270.length >> 1) - 1;
         int var4 = var1 & var3;

         while (true) {
            int var5 = this.field7270[1 + var4 + var4];
            if (-1 == var5) {
               if (var2 >= -2065373781) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (this.field7270[var4 + var4] == var1) {
               return var5;
            }

            var4 = 1 + var4 & var3;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "zt.az(" + 41);
      }
   }
}
