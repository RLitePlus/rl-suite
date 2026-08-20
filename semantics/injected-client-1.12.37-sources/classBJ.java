import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bj")
public class classBJ {
   @ObfuscatedSignature(descriptor = "Lzf;")
   @ObfuscatedName("kg")
   static classZF field483;
   @ObfuscatedName("af")
   int field478 = 651105091;
   @ObfuscatedName("ae")
   int[] field484;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field479 = 12;
   @ObfuscatedName("ag")
   long[] field485;
   @ObfuscatedSignature(descriptor = "Lak;")
   @ObfuscatedName("oz")
   static classAK field481;
   @ObfuscatedName("ab")
   Object[] field486;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field480 = 2;
   @ObfuscatedSignature(descriptor = "Lbl;")
   @ObfuscatedName("az")
   Script field482;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;I)Lop;")
   @ObfuscatedName("mn")
   public static ItemComposition method1114(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.method6697();
      }

      return classOB.method8299(var1 - 2048, (byte)-20);
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("aj")
   static int method1116(int var0, int var1, byte var2) {
      try {
         for (int var3 = 0; var3 < 8; var3++) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            if (var1 <= 30 + var0) {
               return var3;
            }

            byte var10001;
            label35: {
               var0 += 30;
               if (1 != var3) {
                  if (var3 != 3) {
                     var10001 = 5;
                     break label35;
                  }

                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }
               }

               var10001 = 20;
            }

            var0 += var10001;
         }

         return 0;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "bj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
   @ObfuscatedName("az")
   static File method1113(String var0, int var1) {
      try {
         if (!classMT.field4580) {
            if (var1 >= 642137221) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)classMT.field4581.get(var0);
            if (null != var2) {
               if (var1 >= 642137221) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               File var3 = new File(classMT.field4586, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if (!var5.exists()) {
                     if (var1 >= 642137221) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     classMT.field4581.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if (null != var4) {
                        var4.close();
                        Object var10 = null;
                     }
                  } catch (Exception var7) {
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "bj.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;)I")
   @ObfuscatedName("jq")
   public static int method1115(classNU var0, classNT var1) {
      if (var0 == null) {
         var0.method8044();
      }

      int var2 = (-403336933 * var1.field4730 * -359606667 * var1.field4728 >> 12) + var1.field4731 * -1276571151;
      var2 += (var0.field4761[var1.field4725 * -1057694491] - 8192) * var0.field4765[-1057694491 * var1.field4725] >> 12;
      classNY var3 = var1.field4747;
      if (-771094009 * var3.field4792 > 0 && (var3.field4796 * -1472637671 > 0 || var0.field4762[var1.field4725 * -1057694491] > 0)) {
         int var4 = -1472637671 * var3.field4796 << 2;
         int var5 = var3.field4790 * -1122448781 << 1;
         if (var1.field4727 * -1955754893 < var5) {
            var4 = -1955754893 * var1.field4727 * var4 / var5;
         }

         var4 += var0.field4762[-1057694491 * var1.field4725] >> 7;
         double var6 = Math.sin((1237307259 * var1.field4734 & 511) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.field4743.field187 * 256 * Math.pow(2.0, 3.255208333333333E-4 * var2) / (675076789 * WidgetConfigNode.field4138) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("aq")
   static void method1117(boolean var0, int var1) {
      try {
         if (!classOE.client.method2149(1985617997) && !classOE.client.method2154((byte)109)) {
            if (!client.method2152(classOE.client, -1618112219)) {
               classBF.field397 = classKK.field3821;
               classBF.field398 = classKK.field3780;
               classBF.field399 = classKK.field3823;
               classAC.method326(2, 2097818110);
               if (var0) {
                  classBF.field390 = "";
               }

               label69: {
                  if (classBF.JX_CHARACTER_ID != null) {
                     if (var1 != -347989319) {
                        throw new IllegalStateException();
                     }

                     if (!classBF.JX_CHARACTER_ID.isEmpty()) {
                        if (var1 != -347989319) {
                           throw new IllegalStateException();
                        }
                        break label69;
                     }
                  }

                  if (ClientPreferences.method2782(classAB.field122, (byte)8) != null) {
                     if (var1 != -347989319) {
                        throw new IllegalStateException();
                     }

                     classBF.JX_CHARACTER_ID = ClientPreferences.method2782(classAB.field122, (byte)8);
                     client.method2363(-1);
                     client.field832 = true;
                  } else {
                     client.field832 = false;
                  }
               }

               if (client.field832) {
                  if (var1 != -347989319) {
                     throw new IllegalStateException();
                  }

                  if (classBF.JX_CHARACTER_ID != null) {
                     if (var1 != -347989319) {
                        throw new IllegalStateException();
                     }

                     if (!classBF.JX_CHARACTER_ID.isEmpty()) {
                        if (var1 != -347989319) {
                           return;
                        }

                        classBF.field403 = -878854915;
                        return;
                     }
                  }
               }

               classBF.field403 = 0;
               return;
            }

            if (var1 != -347989319) {
               throw new IllegalStateException();
            }
         }

         classAC.method326(10, 2047579352);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "bj.aq(" + ')');
      }
   }

   classBJ() {
   }
}
