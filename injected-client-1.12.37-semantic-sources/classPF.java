import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pf")
public class classPF extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5236 = 11;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("az")
   static EvictingDualNodeHashTable field5235 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("mk")
   static int field5237;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("as")
   public static void method8846(AbstractArchive var0) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ae")
   public static void method8847(AbstractArchive var0) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method8848(AbstractArchive var0) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method8849(AbstractArchive var0) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method8850() {
      EvictingDualNodeHashTable.method6431(field5235);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method8851() {
      EvictingDualNodeHashTable.method6431(field5235);
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIZLvv;Lqn;S)V")
   @ObfuscatedName("ag")
   static void method8855(Widget var0, int var1, int var2, boolean var3, classVV var4, classQN var5, short var6) {
      try {
         int var7 = var0.field4249 * 1115597881;
         int var8 = var0.field4259 * 293773697;
         if (var0.field4251 * -1966367247 == 0) {
            var0.field4249 = var0.field4255 * 2070538269;
         } else if (1 == -1966367247 * var0.field4251) {
            var0.field4249 = (var1 - var0.field4255 * 1523460725) * -1261469175;
         } else if (-1966367247 * var0.field4251 == 2) {
            if (var6 <= 255) {
               throw new IllegalStateException();
            }

            var0.field4249 = (var0.field4255 * 1523460725 * var1 >> 14) * -1261469175;
         }

         if (0 == var0.field4252 * 372143361) {
            var0.field4259 = 2102819615 * var0.field4335;
         } else if (372143361 * var0.field4252 == 1) {
            if (var6 <= 255) {
               throw new IllegalStateException();
            }

            var0.field4259 = -1358979455 * (var2 - 549489055 * var0.field4335);
         } else if (2 == 372143361 * var0.field4252) {
            if (var6 <= 255) {
               throw new IllegalStateException();
            }

            var0.field4259 = -1358979455 * (var0.field4335 * 549489055 * var2 >> 14);
         }

         if (4 == var0.field4251 * -1966367247) {
            if (var6 <= 255) {
               return;
            }

            var0.field4249 = var0.field4274 * 400524509 * var0.field4259 * 293773697 / (var0.field4261 * 2089641037) * -1261469175;
         }

         if (var0.field4252 * 372143361 == 4) {
            if (var6 <= 255) {
               return;
            }

            var0.field4259 = -1358979455 * (var0.field4249 * 1115597881 * 2089641037 * var0.field4261 / (400524509 * var0.field4274));
         }

         if (1337 == -90794217 * var0.field4334) {
            if (var6 <= 255) {
               return;
            }

            var4.field6620 = var0;
         }

         if (12 == -1510882375 * var0.field4375) {
            var0.method7283(-1720891802).method6817(1115597881 * var0.field4249, var0.field4259 * 293773697, -1834164345);
         }

         if (var3) {
            if (var6 <= 255) {
               return;
            }

            if (var0.field4246 != null) {
               if (var6 <= 255) {
                  throw new IllegalStateException();
               }

               if (var7 == 1115597881 * var0.field4249) {
                  if (var6 <= 255) {
                     throw new IllegalStateException();
                  }

                  if (var8 == var0.field4259 * 293773697) {
                     return;
                  }

                  if (var6 <= 255) {
                     throw new IllegalStateException();
                  }
               }

               ScriptEvent var9 = classZS.method14182(classUQ.method11465(var0, 1435437416).method14145(var0.field4246, (byte)2), (byte)73);
               var5.method9658(var9, 1697206599);
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "pf.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public static void method8852() {
      EvictingDualNodeHashTable.method6431(field5235);
   }

   @ObfuscatedSignature(descriptor = "(IIII[Ljava/lang/Object;B)V")
   @ObfuscatedName("fl")
   static void method8856(int var0, int var1, int var2, int var3, Object[] var4, byte var5) {
      try {
         boolean var6 = false;
         Widget var7 = classLY.method7378(classWK.field6691, var0, var1, (byte)-106);
         if (!var6) {
            if (var5 == 4) {
               throw new IllegalStateException();
            }

            if (var7 == null) {
               if (var5 == 4) {
                  return;
               }

               return;
            }
         }

         if (!var6) {
            int var9 = classWK.field6691.method12173(var7, (byte)0);
            boolean var10000;
            if ((var9 >> 23 & 1) != 0) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var8) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         classJL var18 = classEF.method3849(classJS.IF_SCRIPT_TRIGGER, client.field795.field1535, (byte)74);
         var18.field3343.method12973(0, -1542382992);
         int var19 = 702114061 * var18.field3343.field6955;
         classXY.method13235(var18.field3343, var3, -1529732366);
         var18.field3343.method12973(var2, -1542382992);
         classXY.method13235(var18.field3343, var0, -701215652);
         classXY.method13180(var18.field3343, var1, (byte)22);
         Object[] var10 = var4;

         for (int var11 = 0; var11 < var10.length; var11++) {
            if (var5 == 4) {
               throw new IllegalStateException();
            }

            Object var12 = var10[var11];
            if (var12 instanceof Integer) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               var18.field3343.method13036((Integer)var12, (byte)-49);
            } else if (var12 instanceof String) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               classXY.method12997(var18.field3343, (String)var12, (short)25054);
            } else if (var12 instanceof classTE) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               classTE var13 = (classTE)var12;
               int var14 = var13.method10756(231441325);
               var18.field3343.method13026(var14, -169584588);
               if (classYY.field7111 == var13.field6128) {
                  if (var5 == 4) {
                     throw new IllegalStateException();
                  }

                  int[] var20 = var13.method10748(-399979208);

                  for (int var21 = 0; var21 < var14; var21++) {
                     if (var5 == 4) {
                        throw new IllegalStateException();
                     }

                     var18.field3343.method13036(var20[var21], (byte)-48);
                  }
               } else {
                  Object[] var15 = classTE.method10753(var13, 1859895154);

                  for (int var16 = 0; var16 < var14; var16++) {
                     if (var5 == 4) {
                        throw new IllegalStateException();
                     }

                     classXY.method12997(var18.field3343, (String)var15[var16], (short)21661);
                  }
               }
            } else if (null == var12) {
               if (var5 == 4) {
                  throw new IllegalStateException();
               }

               classXY.method12971(var18.field3343, 0, (byte)-21);
            }
         }

         var18.field3343.method13016(702114061 * var18.field3343.field6955 - var19, 2119019222);
         client.field795.method3367(var18, -1301097035);
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "pf.fl(" + ')');
      }
   }

   classPF() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public static void method8854(byte var0) {
      try {
         WorldMapRegion.field2663.method6161(5);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIB)Z")
   @ObfuscatedName("af")
   public static boolean method8853(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (!classAK.method402(var0, var1, var2, var3, var4, var5, (byte)2)) {
            if (var8 != -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return classAK.method402(var0, var1, var4, var5, var6, var7, (byte)-118);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "pf.af(" + ')');
      }
   }
}
