import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pd")
public final class classPD {
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("dw")
   static IndexedSprite[] field5227;
   @ObfuscatedName("az")
   final Object field5224;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field5226 = 57;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5225 = 1;
   @ObfuscatedName("af")
   int field5223;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)V")
   @ObfuscatedName("br")
   static void method8845(String var0, int var1, byte var2) {
      try {
         classBK.method1118(0, 0, (byte)49);
         ArrayList var3 = new ArrayList();
         var3.add(new MidiRequest(classFC.field2208, var0, "", var1, false));
         classIJ.method6215(var3, 0, 0, 0, 100, false, -1473723703);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "pd.br(" + ')');
      }
   }

   classPD(Object var1, int var2) {
      this.field5224 = var1;
      this.field5223 = var2 * 39206217;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;ZI)Lte;")
   @ObfuscatedName("ai")
   public static classTE method8843(Buffer var0, boolean var1, int var2) {
      try {
         int var3 = Buffer.method13047(var0, 1206608293);
         if (var3 >= 0) {
            if (var2 != -193629541) {
               throw new IllegalStateException();
            }

            if (var3 <= 5000) {
               int var4 = Buffer.method13039(var0, -346779531);
               if (var4 != 0) {
                  if (var2 != -193629541) {
                     throw new IllegalStateException();
                  }

                  if (1 != var4) {
                     if (var4 != 2) {
                        if (var2 != -193629541) {
                           throw new IllegalStateException();
                        }

                        if (var4 != 3) {
                           if (var4 == 4) {
                              if (var2 != -193629541) {
                                 throw new IllegalStateException();
                              }

                              String[] var11 = new String[var3];

                              for (int var14 = 0; var14 < var3; var14++) {
                                 if (var2 != -193629541) {
                                    throw new IllegalStateException();
                                 }

                                 var11[var14] = var0.method13071(576806578);
                              }

                              classTE var15;
                              if (var1) {
                                 if (var2 != -193629541) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = SceneTilePaint.method4804(var11, -1179293840);
                              } else {
                                 classTE var16 = new classTE(classYY.field7113, false);
                                 var16.field6125 = var11;
                                 var16.field6131 = var11.length * -1063196331;
                                 var16.field6123 = var11.length * 404453943;
                                 var15 = var16;
                              }

                              return var15;
                           }

                           if (var4 == 255) {
                              if (var2 != -193629541) {
                                 throw new IllegalStateException();
                              }

                              return null;
                           }

                           throw new RuntimeException();
                        }

                        if (var2 != -193629541) {
                           throw new IllegalStateException();
                        }
                     }

                     long[] var10 = new long[var3];

                     for (int var12 = 0; var12 < var3; var12++) {
                        if (var2 != -193629541) {
                           throw new IllegalStateException();
                        }

                        var10[var12] = var0.method13059(813735498);
                     }

                     classTE var13;
                     if (var1) {
                        if (var2 != -193629541) {
                           throw new IllegalStateException();
                        }

                        var13 = classEK.method3909(var10, (byte)49);
                     } else {
                        classTE var8 = new classTE(classYY.field7115, false);
                        var8.field6127 = var10;
                        var8.field6131 = -1063196331 * var10.length;
                        var8.field6123 = var10.length * 404453943;
                        var13 = var8;
                     }

                     return var13;
                  }

                  if (var2 != -193629541) {
                     throw new IllegalStateException();
                  }
               }

               int[] var5 = new int[var3];

               for (int var6 = 0; var6 < var3; var6++) {
                  if (var2 != -193629541) {
                     throw new IllegalStateException();
                  }

                  var5[var6] = var0.method13056((byte)1);
               }

               return var1 ? classKH.method6476(var5, (byte)124) : classDG.method3075(var5, -530642757);
            }

            if (var2 != -193629541) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "pd.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
   @ObfuscatedName("aa")
   static String method8844(String var0, boolean var1, int var2) {
      try {
         StringBuilder var3 = new StringBuilder();
         int var4 = 0;

         while (var4 < var0.length()) {
            char var5 = var0.charAt(var4);
            if ('<' == var5) {
               int var6 = var0.indexOf(62, var4 + 1);
               if (-1 != var6) {
                  var3.append(var0, var4, 1 + var6);
                  var4 = 1 + var6;
                  continue;
               }
            }

            if (var5 == '@') {
               if (var2 == 1385470159) {
                  throw new IllegalStateException();
               }

               int var8 = var0.indexOf(64, var4 + 1);
               if (var8 != -1) {
                  if (var2 == 1385470159) {
                     throw new IllegalStateException();
                  }

                  var3.append(var0, var4, 1 + var8);
                  var4 = 1 + var8;
                  continue;
               }
            }

            char var10001;
            if (var1) {
               if (var2 == 1385470159) {
                  throw new IllegalStateException();
               }

               var10001 = Character.toLowerCase(var5);
            } else {
               var10001 = Character.toUpperCase(var5);
            }

            var3.append(var10001);
            var4++;
         }

         return var3.toString();
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "pd.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;B)V")
   @ObfuscatedName("az")
   public static void method8842(AbstractArchive var0, byte var1) {
      try {
         DbRowType.field7177 = var0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pd.az(" + ')');
      }
   }
}
