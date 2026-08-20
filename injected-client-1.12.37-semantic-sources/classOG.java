import net.runelite.api.events.GrandExchangeSearched;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("og")
public class classOG {
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   public static final int field4867 = 37;
   @ObfuscatedSignature(descriptor = "Log;")
   @ObfuscatedName("af")
   static final classOG field4863 = new classOG(2);
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field4865 = 131072;
   @ObfuscatedName("ab")
   public final int field4861;
   @ObfuscatedSignature(descriptor = "Log;")
   @ObfuscatedName("ae")
   public static final classOG field4864 = new classOG(0);
   @ToRemove(unused = "true")
   @ObfuscatedName("cy")
   static final int field4868 = 139;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field4866 = 8;
   @ObfuscatedSignature(descriptor = "Log;")
   @ObfuscatedName("az")
   static final classOG field4862 = new classOG(1);

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ay")
   static boolean method8436(char var0, byte var1) {
      try {
         for (int var2 = 0; var2 < classBF.field404.length(); var2++) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (var0 == classBF.field404.charAt(var2)) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "og.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)B")
   @ObfuscatedName("az")
   public static byte method8434(char var0, byte var1) {
      try {
         if (var0 > 0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (var0 < 128) {
               return (byte)var0;
            }

            if (var1 == 0) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               return (byte)var0;
            }
         }

         if (var0 == 8364) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -128;
            }
         } else if (var0 == 8218) {
            return -126;
         } else if (402 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -125;
            }
         } else if (8222 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -124;
            }
         } else if (8230 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -123;
            }
         } else if (var0 == 8224) {
            return -122;
         } else if (var0 == 8225) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -121;
            }
         } else if (var0 == 710) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -120;
            }
         } else if (8240 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -119;
            }
         } else if (352 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -118;
            }
         } else if (8249 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -117;
            }
         } else if (338 == var0) {
            return -116;
         } else if (381 == var0) {
            return -114;
         } else if (8216 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -111;
            }
         } else if (var0 == 8217) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -110;
            }
         } else if (var0 == 8220) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -109;
            }
         } else if (var0 == 8221) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -108;
            }
         } else if (var0 == 8226) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -107;
            }
         } else if (8211 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -106;
            }
         } else if (8212 == var0) {
            return -105;
         } else if (732 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -104;
            }
         } else if (8482 == var0) {
            return -103;
         } else if (var0 == 353) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -102;
            }
         } else if (8250 == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -101;
            }
         } else if (339 == var0) {
            return -100;
         } else if (var0 == 382) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return -98;
            }
         } else {
            byte var29;
            if (376 == var0) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               var29 = -97;
            } else {
               var29 = 63;
            }

            return var29;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "og.az(" + ')');
      }
   }

   classOG(int var1) {
      this.field4861 = 679778215 * var1;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lsh;")
   @ObfuscatedName("ag")
   static classSH[] method8435(byte var0) {
      try {
         return new classSH[]{
            classSH.field5936,
            classSH.field5946,
            classSH.field5938,
            classSH.field5942,
            classSH.field5948,
            classSH.field5941,
            classSH.field5947,
            classSH.field5943,
            classSH.field5937,
            classSH.field5945,
            classSH.field5939,
            classSH.field5950,
            classSH.field5940,
            classSH.field5949,
            classSH.field5944,
            classSH.field5951,
            classSH.field5952
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "og.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZS)V")
   @ObfuscatedName("gr")
   static void method8437(String var0, boolean var1, short var2) {
      GrandExchangeSearched var3 = new GrandExchangeSearched();
      classOE.field4843.getCallbacks().post(var3);
      if (!var3.isConsumed()) {
         boolean var5 = var1;
         String var4 = var0;
         short var6 = 9757;

         try {
            var4 = var4.toLowerCase();
            short[] var7 = new short[16];
            int var8 = 0;
            int var9 = classBF.field427.method11868(10, -1870926354);

            for (int var10 = 0; var10 < var9; var10++) {
               if (var6 == 3129) {
                  throw new IllegalStateException();
               }

               classOP var11 = classOB.method8299(var10, (byte)-39);
               if (var5) {
                  if (var6 == 3129) {
                     throw new IllegalStateException();
                  }

                  if (!var11.field5063) {
                     if (var6 == 3129) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               if (-1 == 1236138331 * var11.field5051) {
                  if (var6 == 3129) {
                     throw new IllegalStateException();
                  }

                  if (-2023616411 * var11.field5065 != -1) {
                     if (var6 == 3129) {
                        throw new IllegalStateException();
                     }
                  } else if (classOP.method8704(var11, 1248604557).toLowerCase().indexOf(var4) == -1) {
                     if (var6 == 3129) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if (var8 >= 250) {
                        if (var6 == 3129) {
                           throw new IllegalStateException();
                        }

                        World.field1166 = -690374881;
                        classDI.field1516 = null;
                        return;
                     }

                     if (var8 >= var7.length) {
                        if (var6 == 3129) {
                           throw new IllegalStateException();
                        }

                        short[] var12 = new short[2 * var7.length];

                        for (int var13 = 0; var13 < var8; var13++) {
                           if (var6 == 3129) {
                              throw new IllegalStateException();
                           }

                           var12[var13] = var7[var13];
                        }

                        var7 = var12;
                     }

                     var7[var8++] = (short)var10;
                  }
               }
            }

            classDI.field1516 = var7;
            classMI.field4510 = 0;
            World.field1166 = 690374881 * var8;
            String[] var16 = new String[807205665 * World.field1166];
            int var17 = 0;

            while (true) {
               if (var17 >= 807205665 * World.field1166) {
                  classIN.method6225(var16, classDI.field1516, (byte)-71);
                  break;
               }

               if (var6 == 3129) {
                  break;
               }

               var16[var17] = classOP.method8704(classOB.method8299(var7[var17], (byte)-41), 1248604557);
               var17++;
            }
         } catch (RuntimeException var14) {
            throw classEG.method3884(var14, "og.gr(" + ')');
         }
      }
   }
}
