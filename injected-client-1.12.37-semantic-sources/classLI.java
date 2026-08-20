import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("li")
public class classLI {
   @ObfuscatedName("az")
   public int field4172;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field4171 = 32;
   @ObfuscatedName("ae")
   public int field4169;
   @ObfuscatedName("af")
   public int field4170;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field4173 = 0;

   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ai")
   public static String method7107(classTE var0, String var1, int var2) {
      try {
         classON.method8613(var0, classYY.field7113, -1462324984);
         int var3 = var0.method10756(-67312982);
         String[] var4 = (String[])classTE.method10753(var0, -1911993679);
         if (0 == var3) {
            if (var2 == 41440555) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (var3 == 1) {
            if (var2 == 41440555) {
               throw new IllegalStateException();
            } else {
               return var4[0];
            }
         } else {
            int var5 = var1.length();
            int var6 = (var3 - 1) * var5;

            for (int var7 = 0; var7 < var3; var7++) {
               if (var2 == 41440555) {
                  throw new IllegalStateException();
               }

               var6 += var4[var7].length();
            }

            char[] var11 = new char[var6];
            int var8 = 0;

            for (int var9 = 0; var9 < var3; var9++) {
               if (var2 == 41440555) {
                  throw new IllegalStateException();
               }

               if (var9 > 0) {
                  if (var2 == 41440555) {
                     throw new IllegalStateException();
                  }

                  var1.getChars(0, var5, var11, var8);
                  var8 += var5;
               }

               var4[var9].getChars(0, var4[var9].length(), var11, var8);
               var8 += var4[var9].length();
            }

            return new String(var11);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "li.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcm;Lcm;IZI)I")
   @ObfuscatedName("as")
   static int method7106(World var0, World var1, int var2, boolean var3, int var4) {
      try {
         if (var2 == 1) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               int var5 = var0.field1161 * 597852065;
               int var6 = var1.field1161 * 597852065;
               if (!var3) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  if (var5 == -1) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var5 = 2001;
                  }

                  if (var6 == -1) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var6 = 2001;
                  }
               }

               return var5 - var6;
            }
         } else if (2 == var2) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               return var0.field1160 * -288138629 - var1.field1160 * -288138629;
            }
         } else if (3 == var2) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else if (var0.field1167.equals("-")) {
               if (var4 >= 485700367) {
                  throw new IllegalStateException();
               } else if (var1.field1167.equals("-")) {
                  return 0;
               } else {
                  byte var11;
                  if (var3) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var11 = -1;
                  } else {
                     var11 = 1;
                  }

                  return var11;
               }
            } else if (var1.field1167.equals("-")) {
               if (var4 >= 485700367) {
                  throw new IllegalStateException();
               } else {
                  return var3 ? 1 : -1;
               }
            } else {
               return var0.field1167.compareTo(var1.field1167);
            }
         } else if (var2 == 4) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               byte var10;
               if (var0.method2497(787579061)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  if (var1.method2497(787579061)) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var10 = 0;
                  } else {
                     var10 = 1;
                  }
               } else if (var1.method2497(787579061)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  var10 = -1;
               } else {
                  var10 = 0;
               }

               return var10;
            }
         } else if (5 == var2) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               byte var9;
               if (World.method2491(var0, 1783010309)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  if (World.method2491(var1, -1190184001)) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var9 = 0;
                  } else {
                     var9 = 1;
                  }
               } else if (World.method2491(var1, -1057671836)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  var9 = -1;
               } else {
                  var9 = 0;
               }

               return var9;
            }
         } else if (var2 == 6) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               byte var8;
               if (var0.method2493(23162323)) {
                  if (var1.method2493(23162323)) {
                     if (var4 >= 485700367) {
                        throw new IllegalStateException();
                     }

                     var8 = 0;
                  } else {
                     var8 = 1;
                  }
               } else if (var1.method2493(23162323)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  var8 = -1;
               } else {
                  var8 = 0;
               }

               return var8;
            }
         } else if (7 == var2) {
            if (var4 >= 485700367) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (var0.method2482((byte)-107)) {
                  if (var4 >= 485700367) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.method2482((byte)-85) ? 0 : 1;
               } else {
                  var10000 = var1.method2482((byte)-26) ? -1 : 0;
               }

               return var10000;
            }
         } else {
            return var0.field1162 * 851246551 - 851246551 * var1.field1162;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "li.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public static void method7108(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(classOP.field5006);
         EvictingDualNodeHashTable.method6431(classOP.field5007);
         EvictingDualNodeHashTable.method6431(classOP.field5008);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "li.as(" + ')');
      }
   }

   classLI() {
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("am")
   static int method7109(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == -324749371) {
               throw new IllegalStateException();
            }

            var10000 = classSZ.field6110;
         } else {
            var10000 = TileItem.field1558;
         }

         Widget var4 = var10000;
         if (1800 == var0) {
            if (var3 == -324749371) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(
                  classWK.field6691.method12173(var4, (byte)0), -2098530565
               );
               return 1;
            }
         } else if (var0 == 1801) {
            if (var3 == -324749371) {
               throw new IllegalStateException();
            } else {
               int var5 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var5--;
               if (var4.actions != null) {
                  if (var3 == -324749371) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.actions.length) {
                     if (var4.actions[var5] != null) {
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.actions[var5];
                        return 1;
                     }

                     if (var3 == -324749371) {
                        throw new IllegalStateException();
                     }
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (var0 == 1802) {
            if (var3 == -324749371) {
               throw new IllegalStateException();
            } else {
               if (var4.field4309 == null) {
                  if (var3 == -324749371) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.field4309;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "li.am(" + 41);
      }
   }
}
