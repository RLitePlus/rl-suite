import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gk")
public class classGK {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2610 = 63;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2612 = 127;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2611 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2609 = 7;
   @ObfuscatedName("aa")
   public static int[] field2617;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2613 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field2614 = 896;
   @ObfuscatedName("ac")
   static int[] field2607 = new int[32768];
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field2615 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final double field2608 = 3.834951969714103E-4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final String field2616 = "ht";

   classGK() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)B")
   @ObfuscatedName("az")
   public static byte method5471(int var0, int var1) {
      try {
         return (byte)(var0 >> 10 & 63);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gk.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)B")
   @ObfuscatedName("af")
   public static byte method5472(int var0, int var1) {
      try {
         return (byte)(var0 >> 7 & 7);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gk.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   static void method5477(int var0) {
      try {
         if (field2617 != null) {
            if (var0 >= -288138629) {
               throw new IllegalStateException();
            }
         } else {
            field2617 = new int[65536];
            double var1 = 0.95F;

            for (int var3 = 0; var3 < 65536; var3++) {
               if (var0 >= -288138629) {
                  throw new IllegalStateException();
               }

               double var4 = 0.0078125 + (var3 >> 10 & 63) / 64.0;
               double var6 = 0.0625 + (var3 >> 7 & 7) / 8.0;
               double var8 = (var3 & 127) / 128.0;
               double var10 = var8;
               double var12 = var8;
               double var14 = var8;
               if (var6 != 0.0) {
                  if (var0 >= -288138629) {
                     return;
                  }

                  double var16;
                  if (var8 < 0.5) {
                     var16 = (var6 + 1.0) * var8;
                  } else {
                     var16 = var8 + var6 - var6 * var8;
                  }

                  double var18 = var8 * 2.0 - var16;
                  double var20 = var4 + 0.3333333333333333;
                  if (var20 > 1.0) {
                     var20--;
                  }

                  double var24 = var4 - 0.3333333333333333;
                  if (var24 < 0.0) {
                     if (var0 >= -288138629) {
                        return;
                     }

                     var24++;
                  }

                  if (var20 * 6.0 < 1.0) {
                     if (var0 >= -288138629) {
                        return;
                     }

                     var10 = var18 + (var16 - var18) * 6.0 * var20;
                  } else if (2.0 * var20 < 1.0) {
                     if (var0 >= -288138629) {
                        return;
                     }

                     var10 = var16;
                  } else if (3.0 * var20 < 2.0) {
                     var10 = var18 + 6.0 * ((0.6666666666666666 - var20) * (var16 - var18));
                  } else {
                     var10 = var18;
                  }

                  if (var4 * 6.0 < 1.0) {
                     if (var0 >= -288138629) {
                        return;
                     }

                     var12 = var4 * ((var16 - var18) * 6.0) + var18;
                  } else if (2.0 * var4 < 1.0) {
                     var12 = var16;
                  } else if (3.0 * var4 < 2.0) {
                     if (var0 >= -288138629) {
                        throw new IllegalStateException();
                     }

                     var12 = 6.0 * ((var16 - var18) * (0.6666666666666666 - var4)) + var18;
                  } else {
                     var12 = var18;
                  }

                  if (var24 * 6.0 < 1.0) {
                     if (var0 >= -288138629) {
                        throw new IllegalStateException();
                     }

                     var14 = var24 * (6.0 * (var16 - var18)) + var18;
                  } else if (var24 * 2.0 < 1.0) {
                     var14 = var16;
                  } else if (3.0 * var24 < 2.0) {
                     if (var0 >= -288138629) {
                        return;
                     }

                     var14 = 6.0 * ((0.6666666666666666 - var24) * (var16 - var18)) + var18;
                  } else {
                     var14 = var18;
                  }
               }

               var10 = Math.pow(var10, var1);
               var12 = Math.pow(var12, var1);
               var14 = Math.pow(var14, var1);
               int var30 = (int)(var10 * 256.0);
               int var17 = (int)(256.0 * var12);
               int var31 = (int)(var14 * 256.0);
               int var19 = (var30 << 16) + (var17 << 8) + var31;
               field2617[var3] = var19 & 16777215;
            }
         }
      } catch (RuntimeException var26) {
         throw classEG.method3884(var26, "gk.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("as")
   public static byte method5473(int var0) {
      return (byte)(var0 >> 7 & 7);
   }

   static {
      for (int var0 = 0; var0 < 32768; var0++) {
         int[] var1 = field2607;
         double var4 = (var0 >> 10 & 31) / 31.0;
         double var6 = (var0 >> 5 & 31) / 31.0;
         double var8 = (var0 & 31) / 31.0;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0;
         double var16 = 0.0;
         double var18 = (var10 + var12) / 2.0;
         if (var10 != var12) {
            if (var18 < 0.5) {
               var16 = (var12 - var10) / (var12 + var10);
            }

            if (var18 >= 0.5) {
               var16 = (var12 - var10) / (2.0 - var12 - var10);
            }

            if (var4 == var12) {
               var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
               var14 = (var8 - var4) / (var12 - var10) + 2.0;
            } else if (var12 == var8) {
               var14 = (var4 - var6) / (var12 - var10) + 4.0;
            }
         }

         int var20 = (int)(256.0 * var14 / 6.0);
         var20 &= 255;
         double var21 = var16 * 256.0;
         if (var21 < 0.0) {
            var21 = 0.0;
         } else if (var21 > 255.0) {
            var21 = 255.0;
         }

         if (var18 > 0.7) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.75) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.85) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.95) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.995) {
            var18 = 0.995;
         }

         int var23 = (int)(var21 / 32.0 + var20 / 4 * 8);
         int var3 = (var23 << 7) + (int)(var18 * 128.0);
         var1[var0] = var3;
      }

      method5477(-786472450);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("ag")
   public static byte method5474(int var0) {
      return (byte)(var0 >> 7 & 7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method5482(int var0) {
      return 255 - (var0 & 0xFF);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("ax")
   public static byte method5475(int var0) {
      return (byte)(var0 >> 7 & 7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("ac")
   public static byte method5476(int var0) {
      return (byte)(var0 >> 7 & 7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   static void method5478() {
      if (field2617 == null) {
         field2617 = new int[65536];
         double var0 = 0.95F;

         for (int var2 = 0; var2 < 65536; var2++) {
            double var3 = 0.0078125 + (var2 >> 10 & 63) / 64.0;
            double var5 = 0.0625 + (var2 >> 7 & 7) / 8.0;
            double var7 = (var2 & -1471574918) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = (var5 + 1.0) * var7;
               } else {
                  var15 = var7 + var5 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = var3 + 0.3333333333333333;
               if (var19 > 1.0) {
                  var19--;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  var23++;
               }

               if (var19 * 6.0 < 1.0) {
                  var9 = var17 + (var15 - var17) * 6.0 * var19;
               } else if (2.0 * var19 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * ((0.6666666666666666 - var19) * (var15 - var17));
               } else {
                  var9 = var17;
               }

               if (var3 * 6.0 < 1.0) {
                  var11 = var3 * ((var15 - var17) * 6.0) + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = 6.0 * ((var15 - var17) * (0.6666666666666666 - var3)) + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * (6.0 * (var15 - var17)) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * ((0.6666666666666666 - var23) * (var15 - var17)) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var28 = (int)(var9 * 256.0);
            int var16 = (int)(256.0 * var11);
            int var29 = (int)(var13 * 256.0);
            int var18 = (var28 << 16) + (var16 << 8) + var29;
            field2617[var2] = var18 & 1629183283;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   static void method5479() {
      if (field2617 == null) {
         field2617 = new int[65536];
         double var0 = 0.95F;

         for (int var2 = 0; var2 < 65536; var2++) {
            double var3 = 0.0078125 + (var2 >> 10 & 63) / 64.0;
            double var5 = 0.0625 + (var2 >> 7 & 7) / 8.0;
            double var7 = (var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = (var5 + 1.0) * var7;
               } else {
                  var15 = var7 + var5 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = var3 + 0.3333333333333333;
               if (var19 > 1.0) {
                  var19--;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  var23++;
               }

               if (var19 * 6.0 < 1.0) {
                  var9 = var17 + (var15 - var17) * 6.0 * var19;
               } else if (2.0 * var19 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * ((0.6666666666666666 - var19) * (var15 - var17));
               } else {
                  var9 = var17;
               }

               if (var3 * 6.0 < 1.0) {
                  var11 = var3 * ((var15 - var17) * 6.0) + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = 6.0 * ((var15 - var17) * (0.6666666666666666 - var3)) + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * (6.0 * (var15 - var17)) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * ((0.6666666666666666 - var23) * (var15 - var17)) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var28 = (int)(var9 * 256.0);
            int var16 = (int)(256.0 * var11);
            int var29 = (int)(var13 * 256.0);
            int var18 = (var28 << 16) + (var16 << 8) + var29;
            field2617[var2] = var18 & 16777215;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   static void method5480() {
      if (field2617 == null) {
         field2617 = new int[1678157873];
         double var0 = 0.95F;

         for (int var2 = 0; var2 < 1418927883; var2++) {
            double var3 = 0.0078125 + (var2 >> 10 & -1273563584) / 64.0;
            double var5 = 0.0625 + (var2 >> 7 & 7) / 8.0;
            double var7 = (var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = (var5 + 1.0) * var7;
               } else {
                  var15 = var7 + var5 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = var3 + 0.3333333333333333;
               if (var19 > 1.0) {
                  var19--;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  var23++;
               }

               if (var19 * 6.0 < 1.0) {
                  var9 = var17 + (var15 - var17) * 6.0 * var19;
               } else if (2.0 * var19 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * ((0.6666666666666666 - var19) * (var15 - var17));
               } else {
                  var9 = var17;
               }

               if (var3 * 6.0 < 1.0) {
                  var11 = var3 * ((var15 - var17) * 6.0) + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = 6.0 * ((var15 - var17) * (0.6666666666666666 - var3)) + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * (6.0 * (var15 - var17)) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * ((0.6666666666666666 - var23) * (var15 - var17)) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var28 = (int)(var9 * 256.0);
            int var16 = (int)(256.0 * var11);
            int var29 = (int)(var13 * 256.0);
            int var18 = (var28 << 16) + (var16 << 8) + var29;
            field2617[var2] = var18 & 16777215;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   public static int method5483(int var0, int var1) {
      try {
         return 255 - (var0 & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gk.ab(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public static int method5484(int var0) {
      return 255 - (var0 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   static void method5486(int var0) {
      try {
         for (MidiRequest var2 : classNP.field4698) {
            if (null == var2) {
               if (var0 <= 677773095) {
                  throw new IllegalStateException();
               }
            } else {
               var2.field4641.method8040((byte)22);
               var2.field4641.method8026((byte)0);
               var2.field4641.method8009(0, -1380350542);
               var2.field4641.field4751 = 0;
               classAC.method316(var2.field4632 * 1942111947, var2.field4630 * 450234221, 1047358631);
            }
         }

         classNP.field4698.clear();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gk.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ac")
   static String method5485(long var0) {
      try {
         return var0 < 10L ? "0" + var0 : Long.toString(var0);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gk.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;III)I")
   @ObfuscatedName("ab")
   public static int method5481(classTE var0, Object var1, int var2, int var3, int var4) {
      try {
         if (var2 < 0) {
            var2 = 0;
         }

         label118: {
            if (var3 >= 0) {
               if (var3 <= var0.method10756(-1153807629)) {
                  break label118;
               }

               if (var4 != -746124030) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.method10756(188102844);
         }

         int var5 = 0;
         if (var0.field6128 == classYY.field7111) {
            if (var4 != -746124030) {
               throw new IllegalStateException();
            }

            int[] var6 = var0.method10748(1630107125);
            int var7 = (Integer)var1;

            for (int var8 = var2; var8 < var3; var8++) {
               if (var4 != -746124030) {
                  throw new IllegalStateException();
               }

               if (var7 == var6[var8]) {
                  if (var4 != -746124030) {
                     throw new IllegalStateException();
                  }

                  var5++;
               }
            }
         } else if (classYY.field7115 == var0.field6128) {
            if (var4 != -746124030) {
               throw new IllegalStateException();
            }

            long[] var11 = var0.method10750(-756455890);
            long var13 = (Long)var1;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 != -746124030) {
                  throw new IllegalStateException();
               }

               if (var11[var9] == var13) {
                  if (var4 != -746124030) {
                     throw new IllegalStateException();
                  }

                  var5++;
               }
            }
         } else {
            Object[] var12 = classTE.method10753(var0, -1762564429);

            for (int var14 = var2; var14 < var3; var14++) {
               if (var4 != -746124030) {
                  throw new IllegalStateException();
               }

               if (var12[var14] != var1) {
                  if (var4 != -746124030) {
                     throw new IllegalStateException();
                  }

                  if (null == var12[var14]) {
                     continue;
                  }

                  if (var4 != -746124030) {
                     throw new IllegalStateException();
                  }

                  if (!var12[var14].equals(var1)) {
                     continue;
                  }

                  if (var4 != -746124030) {
                     throw new IllegalStateException();
                  }
               }

               var5++;
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "gk.ab(" + 41);
      }
   }
}
