import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ua")
public class classUA implements classUI {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final String field6275 = "scape main";
   @ObfuscatedSignature(descriptor = "Lwi;")
   @ObfuscatedName("az")
   public final classWI field6274;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method11234(int var1) {
      return this.field6274.vmethod641(var1, (byte)8);
   }

   classUA(classWX var1) {
      this.field6274 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public int method11235(int var1, int var2) {
      try {
         return this.field6274.vmethod641(var1, (byte)8);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ua.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("af")
   public static void method11237(byte[] var0, int var1) {
      try {
         synchronized (classZA.field7127) {
            if (100 == var0.length) {
               if (var1 != 2022759572) {
                  return;
               }

               if (1951739973 * classZA.field7135 < -2141706585 * classZA.field7132) {
                  if (var1 != 2022759572) {
                     throw new IllegalStateException();
                  }

                  classZA.field7136[(classZA.field7135 += 1490182797) * 1951739973 - 1] = var0;
                  return;
               }
            }

            if (var0.length == 5000 && classZA.field7129 * 1052148383 < -817333317 * classZA.field7133) {
               classZA.field7137[(classZA.field7129 += -839116449) * 1052148383 - 1] = var0;
            } else {
               if (var0.length == 10000) {
                  if (var1 != 2022759572) {
                     throw new IllegalStateException();
                  }

                  if (-2070154251 * classZA.field7140 < classZA.field7134 * 273271753) {
                     if (var1 != 2022759572) {
                        throw new IllegalStateException();
                     }

                     classZA.field7128[(classZA.field7140 += -618995619) * -2070154251 - 1] = var0;
                     return;
                  }
               }

               if (var0.length == 30000) {
                  if (var1 != 2022759572) {
                     throw new IllegalStateException();
                  }

                  if (classZA.field7131 * 1155531987 < -1438188161 * classZA.field7130) {
                     if (var1 != 2022759572) {
                        throw new IllegalStateException();
                     }

                     classZA.field7138[(classZA.field7131 += 1255076699) * 1155531987 - 1] = var0;
                     return;
                  }
               }

               if (null != classZA.field7144) {
                  if (var1 != 2022759572) {
                     throw new IllegalStateException();
                  }

                  for (int var3 = 0; var3 < classSQ.field6028.length; var3++) {
                     if (var1 != 2022759572) {
                        throw new IllegalStateException();
                     }

                     if (classSQ.field6028[var3] == var0.length) {
                        if (var1 != 2022759572) {
                           throw new IllegalStateException();
                        }

                        if (classZA.field7143[var3] < classZA.field7144[var3].length) {
                           if (var1 != 2022759572) {
                              throw new IllegalStateException();
                           }

                           classZA.field7144[var3][classZA.field7143[var3]++] = var0;
                           return;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "ua.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method11236(int var1) {
      return this.field6274.vmethod641(var1, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ek")
   static final void method11240(int var0, int var1, int var2, int var3) {
      try {
         classLJ.method7116(classCQ.field1220, var0, var1, var2, (byte)17);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ua.ek(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/util/ArrayList;")
   @ObfuscatedName("ez")
   public static ArrayList method11238(classMA var0) {
      return var0.field4456.field4575;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ev")
   public static void method11239(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method13147(var1);
      }

      var1 = var1 << 1 ^ var1 >> -1063281542;
      var0.method13033(var1, (byte)-19);
   }

   public classUA(classUY var1) {
      this(new classWX(var1));
   }
}
