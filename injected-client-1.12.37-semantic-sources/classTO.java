import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("to")
public class classTO implements classSD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6177 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final String field6179 = "_";
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6178 = 15;

   @ObfuscatedSignature(descriptor = "(IZI)[B")
   @ObfuscatedName("az")
   public static byte[] method10937(int var0, boolean var1, int var2) {
      try {
         synchronized (classZA.field7127) {
            label207: {
               if (100 != var0) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 100) {
                     break label207;
                  }

                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label207;
                  }
               }

               if (1951739973 * classZA.field7135 > 0) {
                  byte[] var4 = classZA.field7136[(classZA.field7135 -= 1490182797) * 1951739973];
                  classZA.field7136[1951739973 * classZA.field7135] = null;
                  return var4;
               }
            }

            label198: {
               if (var0 != 5000) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 5000) {
                     break label198;
                  }

                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label198;
                  }
               }

               if (1052148383 * classZA.field7129 > 0) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  byte[] var9 = classZA.field7137[(classZA.field7129 -= -839116449) * 1052148383];
                  classZA.field7137[classZA.field7129 * 1052148383] = null;
                  return var9;
               }
            }

            label189: {
               if (var0 != 10000) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 10000) {
                     break label189;
                  }

                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label189;
                  }

                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }
               }

               if (-2070154251 * classZA.field7140 > 0) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  byte[] var10 = classZA.field7128[(classZA.field7140 -= -618995619) * -2070154251];
                  classZA.field7128[classZA.field7140 * -2070154251] = null;
                  return var10;
               }
            }

            label179: {
               if (30000 != var0) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 30000 || !var1) {
                     break label179;
                  }
               }

               if (classZA.field7131 * 1155531987 > 0) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  byte[] var11 = classZA.field7138[(classZA.field7131 -= 1255076699) * 1155531987];
                  classZA.field7138[classZA.field7131 * 1155531987] = null;
                  return var11;
               }
            }

            if (classZA.field7144 != null) {
               if (var2 != 1154989421) {
                  throw new IllegalStateException();
               }

               for (int var12 = 0; var12 < classSQ.field6028.length; var12++) {
                  if (var2 != 1154989421) {
                     throw new IllegalStateException();
                  }

                  if (classSQ.field6028[var12] != var0) {
                     if (var2 != 1154989421) {
                        throw new IllegalStateException();
                     }

                     if (var0 >= classSQ.field6028[var12]) {
                        continue;
                     }

                     if (var2 != 1154989421) {
                        throw new IllegalStateException();
                     }

                     if (!var1) {
                        continue;
                     }

                     if (var2 != 1154989421) {
                        throw new IllegalStateException();
                     }
                  }

                  if (classZA.field7143[var12] > 0) {
                     if (var2 != 1154989421) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = classZA.field7144[var12][--classZA.field7143[var12]];
                     classZA.field7144[var12][classZA.field7143[var12]] = null;
                     return var5;
                  }
               }
            }

            if (var1) {
               if (var2 != 1154989421) {
                  throw new IllegalStateException();
               }

               if (null != classSQ.field6028) {
                  for (int var13 = 0; var13 < classSQ.field6028.length; var13++) {
                     if (var2 != 1154989421) {
                        throw new IllegalStateException();
                     }

                     if (var0 <= classSQ.field6028[var13]) {
                        if (var2 != 1154989421) {
                           throw new IllegalStateException();
                        }

                        if (classZA.field7143[var13] < classZA.field7144[var13].length) {
                           if (var2 != 1154989421) {
                              throw new IllegalStateException();
                           }

                           return new byte[classSQ.field6028[var13]];
                        }
                     }
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "to.az(" + ')');
      }
   }
}
