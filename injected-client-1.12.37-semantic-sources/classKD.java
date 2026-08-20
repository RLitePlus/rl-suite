import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kd")
public class classKD {
   @ObfuscatedSignature(descriptor = "Lkd;")
   @ObfuscatedName("ab")
   static final classKD field3549 = new classKD(3);
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("cl")
   static AbstractArchive field3554;
   @ObfuscatedSignature(descriptor = "Lkd;")
   @ObfuscatedName("ae")
   static final classKD field3548 = new classKD(2);
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field3553 = 34;
   @ObfuscatedSignature(descriptor = "Lkd;")
   @ObfuscatedName("ag")
   static final classKD field3551 = new classKD(4);
   @ObfuscatedName("as")
   public final int field3552;
   @ObfuscatedSignature(descriptor = "Lkd;")
   @ObfuscatedName("af")
   public static final classKD field3550 = new classKD(1);
   @ObfuscatedSignature(descriptor = "Lkd;")
   @ObfuscatedName("az")
   public static final classKD field3547 = new classKD(0);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;I)V")
   @ObfuscatedName("ag")
   public static void method6463(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method2719(var1);
      }

      var0.field1347 = 1565965903 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "([F[II)V")
   @ObfuscatedName("al")
   public static void method6462(float[] var0, int[] var1, int var2) {
      try {
         Actor.method3128(var0, var1, 0, var0.length - 1, 1851800923);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "kd.al(" + ')');
      }
   }

   classKD(int var1) {
      this.field3552 = 33137207 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;IFFFIIIZ)Z")
   @ObfuscatedName("gt")
   public static boolean method6465(Model var0, int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      if (var0 == null) {
         return var0.method5169(var1, var2, var2, var2, var1, var1, var1, var8);
      } else {
         Model.field2451[var1] = (int)var4 - var5;
         if (var8) {
            Model.field2470[var1] = (int)var2;
            Model.field2453[var1] = (int)var3;
            Model.field2476[var1] = (int)var4;
         }

         if (var4 >= 50.0F) {
            Model.field2466[var1] = var6 + var2 * classFH.method4727() / var4;
            Model.field2452[var1] = var7 + var3 * classFH.method4727() / var4;
            Model.field2450[var1] = var4;
            return false;
         } else {
            Model.field2466[var1] = -5000.0F;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lod;")
   @ObfuscatedName("az")
   public static EnumComposition method6461(int var0, int var1) {
      try {
         EnumComposition var2 = (EnumComposition)EnumComposition.field4820.method6422(var0);
         if (null != var2) {
            if (var1 <= 240616945) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classLH.field4168.method11867(8, var0, -1038848619);
            var2 = new EnumComposition(new classXY(var3));
            EnumComposition.field4820.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "kd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("aq")
   static int method6466(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4;
         if (var0 >= 2000) {
            if (var3 == 1193425358) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)66);
         } else {
            Widget var10000;
            if (var2) {
               if (var3 == 1193425358) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = TileItem.field1558;
            }

            var4 = var10000;
         }

         if (1200 != var0) {
            if (var3 == 1193425358) {
               throw new IllegalStateException();
            }

            if (var0 != 1205) {
               if (var3 == 1193425358) {
                  throw new IllegalStateException();
               }

               if (var0 != 1212) {
                  if (1201 == var0) {
                     if (var3 == 1193425358) {
                        throw new IllegalStateException();
                     }

                     var4.field4333 = 1312656782;
                     var4.field4374 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
                     return 1;
                  }

                  if (var0 == 1202) {
                     if (var3 == 1193425358) {
                        throw new IllegalStateException();
                     }

                     var4.field4333 = 1968985173;
                     Player var13 = classMB.method7521(-1324753833);
                     int var10001;
                     if (var13 != null) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        var10001 = var13.field1285.method6707(170077571);
                     } else {
                        var10001 = -1;
                     }

                     var4.field4374 = var10001 * 434741949;
                     return 1;
                  }

                  if (var0 == 1207) {
                     if (var3 == 1193425358) {
                        throw new IllegalStateException();
                     }

                     boolean var20;
                     if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        var20 = true;
                     } else {
                        var20 = false;
                     }

                     boolean var12 = var20;
                     Player var16 = classMB.method7521(858191598);
                     PlayerComposition var21;
                     if (null != var16) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        var21 = var16.field1285;
                     } else {
                        var21 = null;
                     }

                     PlayerComposition var18 = var21;
                     Widget.method7306(var4, var18, var12, (byte)66);
                     return 1;
                  }

                  if (1208 == var0) {
                     if (var3 == 1193425358) {
                        throw new IllegalStateException();
                     }

                     int var11 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                     if (var4.field4358 == null) {
                        throw new RuntimeException("");
                     }

                     PlayerComposition.method6726(var4.field4358, var11, 1270668958);
                     return 1;
                  }

                  if (var0 == 1209) {
                     if (var3 == 1193425358) {
                        throw new IllegalStateException();
                     }

                     DynamicObject.field1679 -= 240082458;
                     int var10 = classBB.field323[-324749371 * DynamicObject.field1679];
                     int var15 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
                     if (var4.field4358 == null) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("");
                     }

                     var4.field4358.method6723(var10, var15, -1379854773);
                     return 1;
                  }

                  if (var0 == 1210) {
                     int var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                     if (var4.field4358 == null) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("");
                     }

                     Player var14 = classMB.method7521(92699019);
                     int var19;
                     if (null != var14) {
                        if (var3 == 1193425358) {
                           throw new IllegalStateException();
                        }

                        var19 = var14.field1285.field4094 * 1705409403;
                     } else {
                        var19 = 0;
                     }

                     int var17 = var19;
                     var4.field4358.method6716(var17, var9, 1562392691);
                     return 1;
                  }

                  if (var0 == 1214) {
                     var4.field4333 = 955659832;
                     var4.field4374 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
                     return 1;
                  }

                  if (1215 == var0) {
                     var4.field4333 = 1611988223;
                     var4.field4374 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
                     return 1;
                  }

                  return 2;
               }

               if (var3 == 1193425358) {
                  throw new IllegalStateException();
               }
            }
         }

         DynamicObject.field1679 -= 240082458;
         int var5 = classBB.field323[DynamicObject.field1679 * -324749371];
         int var6 = classBB.field323[DynamicObject.field1679 * -324749371 + 1];
         var4.field4319 = 1321867761 * var5;
         var4.field4344 = 911947905 * var6;
         classOP var7 = classOB.method8299(var5, (byte)-87);
         var4.field4356 = -882581749 * var7.field5035;
         var4.field4292 = var7.field5036 * -1704932525;
         var4.field4294 = var7.field5054 * -2019216183;
         var4.field4290 = 141623689 * var7.field5038;
         var4.field4291 = -614150625 * var7.field5039;
         var4.field4338 = var7.field5034 * -379927707;
         if (var0 == 1205) {
            var4.field4299 = 0;
         } else if (var0 == 1212 | 1 == 1633663665 * var7.field5055) {
            var4.field4299 = -349833341;
         } else {
            var4.field4299 = -699666682;
         }

         if (var4.field4296 * 613100595 > 0) {
            if (var3 == 1193425358) {
               throw new IllegalStateException();
            }

            var4.field4338 = var4.field4338 * -746149408 / (613100595 * var4.field4296) * 1556726191;
         } else if (var4.field4255 * 1523460725 > 0) {
            if (var3 == 1193425358) {
               throw new IllegalStateException();
            }

            var4.field4338 = var4.field4338 * -746149408 / (var4.field4255 * 1523460725) * 1556726191;
         }

         return 1;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "kd.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)[Ljava/lang/String;")
   @ObfuscatedName("ax")
   static String[] method6464(String var0, byte var1) {
      try {
         String[] var2 = var0.split("(?<!\\\\),", -1);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            var2[var3] = classME.method7560(var2[var3], -262140534);
            String var7 = var2[var3];
            String var6 = var7.replaceAll("\\\\,", ",");
            var2[var3] = var6;
         }

         return var2;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "kd.ax(" + ')');
      }
   }
}
