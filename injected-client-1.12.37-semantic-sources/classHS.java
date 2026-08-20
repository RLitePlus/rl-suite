import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class classHS extends classHB {
   @ObfuscatedName("ag")
   byte field2882;
   @ObfuscatedName("ae")
   byte field2880;
   @ObfuscatedName("ab")
   byte field2879;
   @ObfuscatedName("az")
   boolean field2883;
   @ObfuscatedName("af")
   byte field2881;

   @ObfuscatedSignature(descriptor = "(I)Lmu;")
   @ObfuscatedName("az")
   public static classMU method6101(int var0) {
      try {
         return classMU.field4587;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "hs.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         boolean var10001;
         if (classXY.method13039(var1, -346779531) == 1) {
            if (var2 >= -989877912) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field2883 = var10001;
         this.field2881 = classXY.method13043(var1, (byte)17);
         this.field2880 = classXY.method13043(var1, (byte)17);
         this.field2879 = classXY.method13043(var1, (byte)17);
         this.field2882 = classXY.method13043(var1, (byte)17);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hs.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(DDD)I")
   @ObfuscatedName("az")
   public static final int method6100(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if (var2 != 0.0) {
            double var12;
            if (var4 < 0.5) {
               var12 = (1.0 + var2) * var4;
            } else {
               var12 = var2 + var4 - var2 * var4;
            }

            double var14 = var4 * 2.0 - var12;
            double var16 = var0 + 0.3333333333333333;
            if (var16 > 1.0) {
               var16--;
            }

            double var20 = var0 - 0.3333333333333333;
            if (var20 < 0.0) {
               var20++;
            }

            if (6.0 * var16 < 1.0) {
               var6 = var16 * ((var12 - var14) * 6.0) + var14;
            } else if (var16 * 2.0 < 1.0) {
               var6 = var12;
            } else if (3.0 * var16 < 2.0) {
               var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
            } else {
               var6 = var14;
            }

            if (var0 * 6.0 < 1.0) {
               var8 = var0 * ((var12 - var14) * 6.0) + var14;
            } else if (var0 * 2.0 < 1.0) {
               var8 = var12;
            } else if (var0 * 3.0 < 2.0) {
               var8 = var14 + (var12 - var14) * (0.6666666666666666 - var0) * 6.0;
            } else {
               var8 = var14;
            }

            if (var20 * 6.0 < 1.0) {
               var10 = var20 * (6.0 * (var12 - var14)) + var14;
            } else if (var20 * 2.0 < 1.0) {
               var10 = var12;
            } else if (3.0 * var20 < 2.0) {
               var10 = var14 + 6.0 * ((var12 - var14) * (0.6666666666666666 - var20));
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(256.0 * var6);
         int var13 = (int)(256.0 * var8);
         int var24 = (int)(var10 * 256.0);
         return var24 + (var23 << 16) + (var13 << 8);
      } catch (RuntimeException var22) {
         throw classEG.method3884(var22, "hs.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field2883 = classXY.method13039(var1, -346779531) == 1;
      this.field2881 = classXY.method13043(var1, (byte)17);
      this.field2880 = classXY.method13043(var1, (byte)17);
      this.field2879 = classXY.method13043(var1, (byte)17);
      this.field2882 = classXY.method13043(var1, (byte)17);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field2883 = classXY.method13039(var1, -346779531) == 1;
      this.field2881 = classXY.method13043(var1, (byte)17);
      this.field2880 = classXY.method13043(var1, (byte)17);
      this.field2879 = classXY.method13043(var1, (byte)17);
      this.field2882 = classXY.method13043(var1, (byte)17);
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.field3034 = this.field2883;
         var1.field3023 = this.field2881;
         var1.field3025 = this.field2880;
         var1.field3024 = this.field2879;
         var1.field3019 = this.field2882;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.field3034 = this.field2883;
      var1.field3023 = this.field2881;
      var1.field3025 = this.field2880;
      var1.field3024 = this.field2879;
      var1.field3019 = this.field2882;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.field3034 = this.field2883;
      var1.field3023 = this.field2881;
      var1.field3025 = this.field2880;
      var1.field3024 = this.field2879;
      var1.field3019 = this.field2882;
   }

   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;Lzv;I)V")
   @ObfuscatedName("ai")
   static void method6102(Font var0, Font var1, Font var2, int var3) {
      client.method2347(var0, var1, var2);

      try {
         classBF.field385 = (773246731 * classSA.field5897 - 765) / 2 * 358417233;
         classBF.field394 = 2007709401 * classBF.field385 + 1927755610;
         Ignored.field5838 = 273549476 + -1415132635 * classBF.field394;
         if (classBF.field413) {
            classCS.method2618(var0, var1, (byte)54);
         } else {
            label720: {
               classNI.field4673.method13508(classBF.field385 * -329898575, 0);
               classFR.field2391.method13508(382 + classBF.field385 * -329898575, 0);
               IndexedSprite.method13810(AABB.field2372, 382 + classBF.field385 * -329898575 - AABB.field2372.field7121 / 2, 18);
               if (client.field828 * -44590225 != 0) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  if (client.field828 * -44590225 != 5) {
                     break label720;
                  }

                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }
               }

               byte var4 = 20;
               var0.method65(classKK.field3820, -511275367 * classBF.field394 + 180, 245 - var4, 16777215, -1);
               int var5 = 253 - var4;
               classYW.method13707(180 + -511275367 * classBF.field394 - 152, var5, 304, 34, 9179409);
               classYW.method13707(180 + classBF.field394 * -511275367 - 151, var5 + 1, 302, 32, 0);
               classYW.method13698(180 + classBF.field394 * -511275367 - 150, var5 + 2, classBF.field395 * 1758494531, 30, 9179409);
               classYW.method13698(
                  1758494531 * classBF.field395 + (classBF.field394 * -511275367 + 180 - 150), var5 + 2, 300 - classBF.field395 * 1758494531, 30, 0
               );
               var0.method65(classBF.field392, 180 + -511275367 * classBF.field394, 276 - var4, 16777215, -1);
            }

            if (20 == -44590225 * client.field828) {
               if (var3 >= -1329525269) {
                  return;
               }

               IndexedSprite.method13810(
                  classJB.field3120, classBF.field394 * -511275367 + 180 - classJB.field3120.field7121 / 2, 271 - classJB.field3120.field7119 / 2
               );
               int var13 = 201;
               var0.method65(classBF.field397, classBF.field394 * -511275367 + 180, var13, 16776960, 0);
               var13 += 15;
               var0.method65(classBF.field398, -511275367 * classBF.field394 + 180, var13, 16776960, 0);
               var13 += 15;
               var0.method65(classBF.field399, classBF.field394 * -511275367 + 180, var13, 16776960, 0);
               var13 += 15;
               var13 += 7;
               if (classBF.field384 * -47366135 != 4 && classBF.field384 * -47366135 != 10) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  if (1 != -47366135 * classBF.field384) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     var0.method56(classKK.field3788, 180 + classBF.field394 * -511275367 - 110, var13, 16777215, 0);
                     short var102 = 200;

                     String var6;
                     for (var6 = classBQ.method1177(1383343981); var0.method36(var6) > var102; var6 = var6.substring(0, var6.length() - 1)) {
                        if (var3 >= -1329525269) {
                           throw new IllegalStateException();
                        }
                     }

                     var0.method56(AbstractFont.method8(var6), 180 + -511275367 * classBF.field394 - 70, var13, 16777215, 0);
                     var13 += 15;

                     String var7;
                     for (var7 = classSL.method10470(classBF.field390, (short)-17047); var0.method36(var7) > var102; var7 = var7.substring(1)) {
                        if (var3 >= -1329525269) {
                           throw new IllegalStateException();
                        }
                     }

                     var0.method56(classKK.field3838 + var7, 180 + -511275367 * classBF.field394 - 108, var13, 16777215, 0);
                     var13 += 15;
                  }
               }
            }

            label694: {
               if (10 != client.field828 * -44590225) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  if (-44590225 * client.field828 != 11) {
                     if (client.field828 * -44590225 != 50) {
                        break label694;
                     }

                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }
                  }
               }

               IndexedSprite.method13810(classJB.field3120, -511275367 * classBF.field394, 171);
               if (-47366135 * classBF.field384 == 0) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  int var20 = 251;
                  var0.method65(classKK.field3878, 180 + classBF.field394 * -511275367, var20, 16776960, 0);
                  var20 += 30;
                  int var103 = 180 + classBF.field394 * -511275367 - 80;
                  short var141 = 291;
                  IndexedSprite.method13810(classKA.field3514, var103 - 73, var141 - 20);
                  var0.method66(classKK.field3851, var103 - 73, var141 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                  var103 = 180 + -511275367 * classBF.field394 + 80;
                  IndexedSprite.method13810(classKA.field3514, var103 - 73, var141 - 20);
                  var0.method66(classKK.field3852, var103 - 73, var141 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               } else if (-47366135 * classBF.field384 == 1) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  var0.method65(classBF.field396, 180 + -511275367 * classBF.field394, 201, 16776960, 0);
                  int var22 = 236;
                  var0.method65(classBF.field397, 180 + classBF.field394 * -511275367, var22, 16777215, 0);
                  var22 += 15;
                  var0.method65(classBF.field398, classBF.field394 * -511275367 + 180, var22, 16777215, 0);
                  var22 += 15;
                  var0.method65(classBF.field399, classBF.field394 * -511275367 + 180, var22, 16777215, 0);
                  var22 += 15;
                  int var105 = -511275367 * classBF.field394 + 180 - 80;
                  short var142 = 321;
                  IndexedSprite.method13810(classKA.field3514, var105 - 73, var142 - 20);
                  var0.method65(classKK.field3777, var105, var142 + 5, 16777215, 0);
                  var105 = 80 + 180 + -511275367 * classBF.field394;
                  IndexedSprite.method13810(classKA.field3514, var105 - 73, var142 - 20);
                  var0.method65(classKK.field3854, var105, 5 + var142, 16777215, 0);
               } else if (-47366135 * classBF.field384 == 2) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  int var26 = 201;
                  var0.method65(classBF.field397, 1429288549 * Ignored.field5838, var26, 16776960, 0);
                  var26 += 15;
                  var0.method65(classBF.field398, 1429288549 * Ignored.field5838, var26, 16776960, 0);
                  var26 += 15;
                  var0.method65(classBF.field399, Ignored.field5838 * 1429288549, var26, 16776960, 0);
                  var26 += 15;
                  var26 += 7;
                  var0.method56(classKK.field3788, 1429288549 * Ignored.field5838 - 110, var26, 16777215, 0);
                  short var107 = 200;

                  String var143;
                  for (var143 = classBQ.method1177(-53098227); var0.method36(var143) > var107; var143 = var143.substring(1)) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }
                  }

                  StringBuilder var10001 = new StringBuilder().append(AbstractFont.method8(var143));
                  boolean var10002 = 0 == classBF.field403 * -1187692459;
                  boolean var10003;
                  if (1612595797 * client.field855 % 40 < 20) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  String var193;
                  if (var10002 & var10003) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     var193 = classQY.method9847(16776960, (byte)31) + classDO.field1589;
                  } else {
                     var193 = "";
                  }

                  var0.method56(var10001.append(var193).toString(), Ignored.field5838 * 1429288549 - 70, var26, 16777215, 0);
                  var26 += 15;

                  String var163;
                  for (var163 = classSL.method10470(classBF.field390, (short)-21583); var0.method36(var163) > var107; var163 = var163.substring(1)) {
                     if (var3 >= -1329525269) {
                        return;
                     }
                  }

                  var10001 = new StringBuilder().append(classKK.field3838).append(var163);
                  if (classBF.field403 * -1187692459 == 1) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  if (1612595797 * client.field855 % 40 < 20) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  String var195;
                  if (var10002 & var10003) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var195 = classQY.method9847(16776960, (byte)108) + classDO.field1589;
                  } else {
                     var195 = "";
                  }

                  var0.method56(var10001.append(var195).toString(), 1429288549 * Ignored.field5838 - 108, var26, 16777215, 0);
                  var26 += 15;
                  int var33 = 277;
                  int var8 = -117 + 1429288549 * Ignored.field5838;
                  IndexedSprite var9 = classLF.method6779(client.field832, classBF.field401, 576240197);
                  IndexedSprite.method13810(var9, var8, var33);
                  var8 += var9.field7121 + 5;
                  var1.method56(classKK.field3669, var8, 13 + var33, 16776960, 0);
                  var8 = Ignored.field5838 * 1429288549 + 24;
                  var9 = classLF.method6779(ClientPreferences.method2724(classAB.field122, (short)-7807), classBF.field406, 1512911023);
                  IndexedSprite.method13810(var9, var8, var33);
                  var8 += var9.field7121 + 5;
                  var1.method56(classKK.field3648, var8, 13 + var33, 16776960, 0);
                  var33 += 15;
                  int var10 = 1429288549 * Ignored.field5838 - 80;
                  short var11 = 321;
                  IndexedSprite.method13810(classKA.field3514, var10 - 73, var11 - 20);
                  var0.method65(classKK.field3709, var10, 5 + var11, 16777215, 0);
                  var10 = 1429288549 * Ignored.field5838 + 80;
                  IndexedSprite.method13810(classKA.field3514, var10 - 73, var11 - 20);
                  var0.method65(classKK.field3854, var10, 5 + var11, 16777215, 0);
                  short var35 = 357;
                  switch (-323997799 * classBF.field388) {
                     case 2:
                        classJH.field3158 = classKK.field3868;
                        break;
                     default:
                        classJH.field3158 = classKK.field3866;
                  }

                  classWR.field6770 = new classUQ(1429288549 * Ignored.field5838, var35, var1.method36(classJH.field3158), 11);
                  classLB.field4089 = new classUQ(1429288549 * Ignored.field5838, var35, var1.method36(classKK.field3867), 11);
                  var1.method65(classJH.field3158, Ignored.field5838 * 1429288549, var35, 16777215, 0);
               } else if (3 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var36 = 201;
                  var0.method65(classKK.field3924, -511275367 * classBF.field394 + 180, var36, 16776960, 0);
                  var36 += 20;
                  var1.method65(classKK.field3858, -511275367 * classBF.field394 + 180, var36, 16776960, 0);
                  var36 += 20;
                  var1.method65(classKK.field3859, 180 + classBF.field394 * -511275367, var36, 16776960, 0);
                  var36 += 15;
                  int var108 = 180 + classBF.field394 * -511275367;
                  short var144 = 276;
                  IndexedSprite.method13810(classKA.field3514, var108 - 73, var144 - 20);
                  var2.method65(classKK.field3860, var108, 5 + var144, 16777215, 0);
                  var108 = 180 + classBF.field394 * -511275367;
                  var144 = 326;
                  IndexedSprite.method13810(classKA.field3514, var108 - 73, var144 - 20);
                  var2.method65(classKK.field3861, var108, 5 + var144, 16777215, 0);
               } else if (-47366135 * classBF.field384 == 4) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  var0.method65(classKK.field3837, -511275367 * classBF.field394 + 180, 201, 16776960, 0);
                  int var40 = 236;
                  var0.method65(classBF.field397, 180 + classBF.field394 * -511275367, var40, 16777215, 0);
                  var40 += 15;
                  var0.method65(classBF.field398, classBF.field394 * -511275367 + 180, var40, 16777215, 0);
                  var40 += 15;
                  var0.method65(classBF.field399, 180 + classBF.field394 * -511275367, var40, 16777215, 0);
                  var40 += 15;
                  StringBuilder var188 = new StringBuilder().append(classKK.field3849).append(classSL.method10470(classQP.field5586, (short)12520));
                  String var196;
                  if (client.field855 * 1612595797 % 40 < 20) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var196 = classQY.method9847(16776960, (byte)24) + classDO.field1589;
                  } else {
                     var196 = "";
                  }

                  var0.method56(var188.append(var196).toString(), -511275367 * classBF.field394 + 180 - 108, var40, 16777215, 0);
                  var40 -= 8;
                  var0.method56(classKK.field3616, -511275367 * classBF.field394 + 180 - 9, var40, 16776960, 0);
                  var40 += 15;
                  var0.method56(classKK.field3617, -511275367 * classBF.field394 + 180 - 9, var40, 16776960, 0);
                  int var110 = 180 + classBF.field394 * -511275367 - 9 + var0.method36(classKK.field3617) + 15;
                  int var146 = var40 - var0.field8;
                  IndexedSprite var164;
                  if (classBF.field393) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     var164 = classEK.field1779;
                  } else {
                     var164 = classCK.field778;
                  }

                  IndexedSprite.method13810(var164, var110, var146);
                  var40 += 15;
                  int var175 = 180 + -511275367 * classBF.field394 - 80;
                  short var182 = 321;
                  IndexedSprite.method13810(classKA.field3514, var175 - 73, var182 - 20);
                  var0.method65(classKK.field3777, var175, 5 + var182, 16777215, 0);
                  var175 = 80 + classBF.field394 * -511275367 + 180;
                  IndexedSprite.method13810(classKA.field3514, var175 - 73, var182 - 20);
                  var0.method65(classKK.field3854, var175, var182 + 5, 16777215, 0);
                  var1.method65(classKK.field3866, 180 + -511275367 * classBF.field394, 36 + var182, 16777215, 0);
               } else if (classBF.field384 * -47366135 == 5) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  var0.method65(classKK.field3862, -511275367 * classBF.field394 + 180, 201, 16776960, 0);
                  int var47 = 221;
                  var2.method65(classBF.field397, -511275367 * classBF.field394 + 180, var47, 16776960, 0);
                  var47 += 15;
                  var2.method65(classBF.field398, -511275367 * classBF.field394 + 180, var47, 16776960, 0);
                  var47 += 15;
                  var2.method65(classBF.field399, 180 + -511275367 * classBF.field394, var47, 16776960, 0);
                  var47 += 15;
                  var47 += 14;
                  var0.method56(classKK.field3875, -511275367 * classBF.field394 + 180 - 145, var47, 16777215, 0);
                  short var111 = 174;

                  String var147;
                  for (var147 = classBQ.method1177(947688212); var0.method36(var147) > var111; var147 = var147.substring(1)) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }
                  }

                  StringBuilder var189 = new StringBuilder().append(AbstractFont.method8(var147));
                  String var197;
                  if (1612595797 * client.field855 % 40 < 20) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var197 = classQY.method9847(16776960, (byte)33) + classDO.field1589;
                  } else {
                     var197 = "";
                  }

                  var0.method56(var189.append(var197).toString(), -511275367 * classBF.field394 + 180 - 34, var47, 16777215, 0);
                  var47 += 15;
                  int var165 = classBF.field394 * -511275367 + 180 - 80;
                  short var177 = 321;
                  IndexedSprite.method13810(classKA.field3514, var165 - 73, var177 - 20);
                  var0.method65(classKK.field3864, var165, 5 + var177, 16777215, 0);
                  var165 = 80 + classBF.field394 * -511275367 + 180;
                  IndexedSprite.method13810(classKA.field3514, var165 - 73, var177 - 20);
                  var0.method65(classKK.field3865, var165, 5 + var177, 16777215, 0);
                  var177 = 356;
                  var1.method65(classKK.field3867, Ignored.field5838 * 1429288549, var177, 268435455, 0);
               } else if (classBF.field384 * -47366135 == 6) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var53 = 201;
                  var0.method65(classBF.field397, -511275367 * classBF.field394 + 180, var53, 16776960, 0);
                  var53 += 15;
                  var0.method65(classBF.field398, classBF.field394 * -511275367 + 180, var53, 16776960, 0);
                  var53 += 15;
                  var0.method65(classBF.field399, classBF.field394 * -511275367 + 180, var53, 16776960, 0);
                  var53 += 15;
                  int var112 = -511275367 * classBF.field394 + 180;
                  short var148 = 321;
                  IndexedSprite.method13810(classKA.field3514, var112 - 73, var148 - 20);
                  var0.method65(classKK.field3865, var112, 5 + var148, 16777215, 0);
               } else if (7 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  if (client.field1134 && !client.field890) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     int var61 = 201;
                     var0.method65(classBF.field397, 1429288549 * Ignored.field5838, var61, 16776960, 0);
                     var61 += 15;
                     var0.method65(classBF.field398, 1429288549 * Ignored.field5838, var61, 16776960, 0);
                     var61 += 15;
                     var0.method65(classBF.field399, 1429288549 * Ignored.field5838, var61, 16776960, 0);
                     int var115 = 1429288549 * Ignored.field5838 - 150;
                     var61 += 10;

                     for (int var150 = 0; var150 < 8; var150++) {
                        if (var3 >= -1329525269) {
                           return;
                        }

                        classKA.field3514.method13812(var115, var61, 30, 40);
                        boolean var10000;
                        if (classBF.field391 * -594543677 == var150) {
                           if (var3 >= -1329525269) {
                              return;
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        boolean var190;
                        if (1612595797 * client.field855 % 40 < 20) {
                           if (var3 >= -1329525269) {
                              throw new IllegalStateException();
                           }

                           var190 = true;
                        } else {
                           var190 = false;
                        }

                        boolean var167 = var10000 & var190;
                        StringBuilder var191 = new StringBuilder();
                        String var198;
                        if (classBF.field407[var150] == null) {
                           if (var3 >= -1329525269) {
                              return;
                           }

                           var198 = "";
                        } else {
                           var198 = classBF.field407[var150];
                        }

                        StringBuilder var192 = var191.append(var198);
                        if (var167) {
                           if (var3 >= -1329525269) {
                              return;
                           }

                           var198 = classQY.method9847(16776960, (byte)53) + classDO.field1589;
                        } else {
                           var198 = "";
                        }

                        var0.method56(var192.append(var198).toString(), 10 + var115, 27 + var61, 16777215, 0);
                        if (var150 != 1) {
                           if (var3 >= -1329525269) {
                              throw new IllegalStateException();
                           }

                           if (3 != var150) {
                              var115 += 35;
                              continue;
                           }

                           if (var3 >= -1329525269) {
                              throw new IllegalStateException();
                           }
                        }

                        var115 += 50;
                        var0.method56(AbstractFont.method8("/"), var115 - 13, 27 + var61, 16777215, 0);
                     }

                     int var151 = Ignored.field5838 * 1429288549 - 80;
                     short var168 = 321;
                     IndexedSprite.method13810(classKA.field3514, var151 - 73, var168 - 20);
                     var0.method65("Submit", var151, 5 + var168, 16777215, 0);
                     var151 = 1429288549 * Ignored.field5838 + 80;
                     IndexedSprite.method13810(classKA.field3514, var151 - 73, var168 - 20);
                     var0.method65(classKK.field3854, var151, 5 + var168, 16777215, 0);
                  } else {
                     int var57 = 216;
                     var0.method65(classKK.field3892, classBF.field394 * -511275367 + 180, var57, 16776960, 0);
                     var57 += 15;
                     var2.method65(classKK.field3893, classBF.field394 * -511275367 + 180, var57, 16776960, 0);
                     var57 += 15;
                     var2.method65(classKK.field3633, 180 + -511275367 * classBF.field394, var57, 16776960, 0);
                     var57 += 15;
                     int var113 = 180 + classBF.field394 * -511275367 - 80;
                     short var149 = 321;
                     IndexedSprite.method13810(classKA.field3514, var113 - 73, var149 - 20);
                     var0.method65(classKK.field3895, var113, var149 + 5, 16777215, 0);
                     var113 = 180 + -511275367 * classBF.field394 + 80;
                     IndexedSprite.method13810(classKA.field3514, var113 - 73, var149 - 20);
                     var0.method65(classKK.field3865, var113, 5 + var149, 16777215, 0);
                  }
               } else if (8 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var65 = 216;
                  var0.method65(classKK.field3613, 180 + classBF.field394 * -511275367, var65, 16776960, 0);
                  var65 += 15;
                  var2.method65(classKK.field3749, 180 + -511275367 * classBF.field394, var65, 16776960, 0);
                  var65 += 15;
                  var2.method65(classKK.field3750, 180 + -511275367 * classBF.field394, var65, 16776960, 0);
                  var65 += 15;
                  int var116 = -511275367 * classBF.field394 + 180 - 80;
                  short var153 = 321;
                  IndexedSprite.method13810(classKA.field3514, var116 - 73, var153 - 20);
                  var0.method65(classKK.field3751, var116, var153 + 5, 16777215, 0);
                  var116 = 80 + -511275367 * classBF.field394 + 180;
                  IndexedSprite.method13810(classKA.field3514, var116 - 73, var153 - 20);
                  var0.method65(classKK.field3865, var116, 5 + var153, 16777215, 0);
               } else if (9 == -47366135 * classBF.field384) {
                  int var69 = 221;
                  var0.method65(classBF.field397, 180 + -511275367 * classBF.field394, var69, 16776960, 0);
                  var69 += 25;
                  var0.method65(classBF.field398, 180 + -511275367 * classBF.field394, var69, 16776960, 0);
                  var69 += 25;
                  var0.method65(classBF.field399, 180 + -511275367 * classBF.field394, var69, 16776960, 0);
                  int var118 = classBF.field394 * -511275367 + 180;
                  short var154 = 311;
                  IndexedSprite.method13810(classKA.field3514, var118 - 73, var154 - 20);
                  var0.method65(classKK.field3860, var118, var154 + 5, 16777215, 0);
               } else if (10 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var72 = 180 + -511275367 * classBF.field394;
                  int var119 = 209;
                  var0.method65(classKK.field3878, classBF.field394 * -511275367 + 180, var119, 16776960, 0);
                  var119 += 20;
                  IndexedSprite.method13810(classGQ.field2655, var72 - 109, var119);
                  if (classBF.field412.isEmpty()) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     IndexedSprite.method13810(classQH.field5544, var72 - 48, 18 + var119);
                  } else {
                     IndexedSprite.method13810(classQH.field5544, var72 - 48, var119 + 5);
                     var0.method65(classBF.field412, var72, 68 + var119 - 15, 16776960, 0);
                  }
               } else if (-47366135 * classBF.field384 == 12) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  int var73 = 1429288549 * Ignored.field5838;
                  int var121 = 216;
                  var2.method65(classKK.field3899, var73, var121, 16777215, 0);
                  var121 += 17;
                  var2.method65(classKK.field3900, var73, var121, 16777215, 0);
                  var121 += 17;
                  var2.method65(classKK.field3901, var73, var121, 16777215, 0);
                  var121 += 17;
                  var2.method65(classKK.field3902, var73, var121, 16777215, 0);
                  var73 = 1429288549 * Ignored.field5838 - 80;
                  short var125 = 311;
                  IndexedSprite.method13810(classKA.field3514, var73 - 73, var125 - 20);
                  var0.method65(classKK.field3910, var73, var125 + 5, 16777215, 0);
                  var73 = Ignored.field5838 * 1429288549 + 80;
                  IndexedSprite.method13810(classKA.field3514, var73 - 73, var125 - 20);
                  var0.method65(classKK.field3911, var73, 5 + var125, 16777215, 0);
               } else if (13 == classBF.field384 * -47366135) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  int var76 = 231;
                  var2.method65(classKK.field3903, 180 + -511275367 * classBF.field394, var76, 16777215, 0);
                  var76 += 20;
                  var2.method65(classKK.field3904, -511275367 * classBF.field394 + 180, var76, 16777215, 0);
                  int var126 = 180 + -511275367 * classBF.field394;
                  short var78 = 311;
                  IndexedSprite.method13810(classKA.field3514, var126 - 73, var78 - 20);
                  var0.method65(classKK.field3865, var126, var78 + 5, 16777215, 0);
               } else if (14 == classBF.field384 * -47366135) {
                  int var79 = 201;
                  String var127 = "";
                  String var155 = "";
                  String var169 = "";
                  switch (-20437633 * classBF.field387) {
                     case 0:
                        var127 = classKK.field3907;
                        var155 = classKK.field3662;
                        var169 = classKK.field3663;
                        break;
                     case 1:
                        var127 = classKK.field3700;
                        var155 = classKK.field3701;
                        var169 = classKK.field3702;
                        break;
                     case 2:
                        var127 = classKK.field3784;
                        var155 = classKK.field3897;
                        var169 = classKK.field3622;
                        break;
                     default:
                        classBJ.method1117(false, -347989319);
                  }

                  var0.method65(var127, classBF.field394 * -511275367 + 180, var79, 16776960, 0);
                  var79 += 20;
                  var0.method65(var155, 180 + classBF.field394 * -511275367, var79, 16776960, 0);
                  var79 += 20;
                  var0.method65(var169, 180 + classBF.field394 * -511275367, var79, 16776960, 0);
                  int var179 = 180 + classBF.field394 * -511275367;
                  short var183 = 276;
                  IndexedSprite.method13810(classKA.field3514, var179 - 73, var183 - 20);
                  if (1 == -20437633 * classBF.field387) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var0.method65(classKK.field3645, var179, var183 + 5, 16777215, 0);
                  } else {
                     var0.method65(classKK.field3710, var179, 5 + var183, 16777215, 0);
                  }

                  var179 = -511275367 * classBF.field394 + 180;
                  var183 = 326;
                  IndexedSprite.method13810(classKA.field3514, var179 - 73, var183 - 20);
                  var0.method65(classKK.field3865, var179, 5 + var183, 16777215, 0);
               } else if (24 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var82 = 221;
                  var0.method65(classBF.field397, -511275367 * classBF.field394 + 180, var82, 16777215, 0);
                  var82 += 15;
                  var0.method65(classBF.field398, classBF.field394 * -511275367 + 180, var82, 16777215, 0);
                  var82 += 15;
                  var0.method65(classBF.field399, -511275367 * classBF.field394 + 180, var82, 16777215, 0);
                  var82 += 15;
                  int var128 = -511275367 * classBF.field394 + 180;
                  short var156 = 301;
                  IndexedSprite.method13810(classKA.field3514, var128 - 73, var156 - 20);
                  var0.method65(classKK.field3795, var128, 5 + var156, 16777215, 0);
               } else if (32 == classBF.field384 * -47366135) {
                  int var86 = 216;
                  var0.method65(classKK.field3892, classBF.field394 * -511275367 + 180, var86, 16776960, 0);
                  var86 += 15;
                  var2.method65(classKK.field3893, classBF.field394 * -511275367 + 180, var86, 16776960, 0);
                  var86 += 15;
                  var2.method65(classKK.field3633, 180 + classBF.field394 * -511275367, var86, 16776960, 0);
                  var86 += 15;
                  int var129 = 180 + classBF.field394 * -511275367 - 80;
                  short var157 = 321;
                  IndexedSprite.method13810(classKA.field3514, var129 - 73, var157 - 20);
                  var0.method65(classKK.field3895, var129, 5 + var157, 16777215, 0);
                  var129 = -511275367 * classBF.field394 + 180 + 80;
                  IndexedSprite.method13810(classKA.field3514, var129 - 73, var157 - 20);
                  var0.method65(classKK.field3865, var129, 5 + var157, 16777215, 0);
               } else if (33 == -47366135 * classBF.field384) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var90 = 201;
                  var0.method65(classBF.field397, -511275367 * classBF.field394 + 180, var90, 16776960, 0);
                  var90 += 20;
                  var1.method65(classBF.field398, 180 + -511275367 * classBF.field394, var90, 16776960, 0);
                  var90 += 20;
                  var1.method65(classBF.field399, -511275367 * classBF.field394 + 180, var90, 16776960, 0);
                  var90 += 15;
                  int var131 = classBF.field394 * -511275367 + 180;
                  short var158 = 276;
                  IndexedSprite.method13810(classKA.field3514, var131 - 73, var158 - 20);
                  var2.method65(classKK.field3736, var131, var158 + 5, 16777215, 0);
                  var131 = classBF.field394 * -511275367 + 180;
                  var158 = 326;
                  IndexedSprite.method13810(classKA.field3514, var131 - 73, var158 - 20);
                  var2.method65(classKK.field3865, var131, 5 + var158, 16777215, 0);
               } else if (classBF.field384 * -47366135 == 34) {
                  if (var3 >= -1329525269) {
                     throw new IllegalStateException();
                  }

                  int var94 = 201;
                  var0.method65(classBF.field397, 180 + classBF.field394 * -511275367, var94, 16776960, 0);
                  var94 += 20;
                  var1.method65(classBF.field398, 180 + classBF.field394 * -511275367, var94, 16776960, 0);
                  var94 += 20;
                  var1.method65(classBF.field399, classBF.field394 * -511275367 + 180, var94, 16776960, 0);
                  int var133 = 180 + classBF.field394 * -511275367;
                  short var160 = 276;
                  IndexedSprite.method13810(classKA.field3514, var133 - 73, var160 - 20);
                  String var186;
                  if (classIS.field3054 != null) {
                     if (var3 >= -1329525269) {
                        throw new IllegalStateException();
                     }

                     var186 = classKK.field3921;
                  } else {
                     var186 = classKK.field3786;
                  }

                  String var170 = var186;
                  var2.method65(var170, var133, var160 + 5, 16777215, 0);
                  var133 = -511275367 * classBF.field394 + 180;
                  var160 = 326;
                  IndexedSprite.method13810(classKA.field3514, var133 - 73, var160 - 20);
                  var2.method65(classKK.field3865, var133, var160 + 5, 16777215, 0);
               } else if (38 == classBF.field384 * -47366135) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  int var97 = Ignored.field5838 * 1429288549;
                  int var135 = 216;
                  var0.method65(classKK.field3759, var97, var135, 16776960, 0);
                  var135 += 25;
                  var1.method65(classKK.field3656, var97, var135, 16777215, 0);
                  var135 += 20;
                  var1.method65(classKK.field3877, var97, var135, 16777215, 0);
                  var135 += 20;
                  var1.method65(classKK.field3908, var97, var135, 16765440, 0);
                  var97 = 1429288549 * Ignored.field5838 - 80;
                  short var139 = 321;
                  IndexedSprite.method13810(classKA.field3514, var97 - 73, var139 - 20);
                  var0.method65(classKK.field3736, var97, 5 + var139, 16777215, 0);
                  var97 = 80 + 1429288549 * Ignored.field5838;
                  IndexedSprite.method13810(classKA.field3514, var97 - 73, var139 - 20);
                  var0.method65(classKK.field3709, var97, 5 + var139, 16777215, 0);
               }
            }

            if (-44590225 * client.field828 >= 10) {
               if (var3 >= -1329525269) {
                  throw new IllegalStateException();
               }

               int[] var100 = new int[4];
               classYW.method13675(var100);
               classYW.method13671(classBF.field385 * -329898575, 0, -329898575 * classBF.field385 + 765, 8379747 * IntProjection.field1938);
               classML.field4531.method2619(classBF.field385 * -329898575 - 22, client.field855 * 1612595797, 1698595949);
               classML.field4531.method2619(765 + -329898575 * classBF.field385 + 22 - 128, client.field855 * 1612595797, 1698595949);
               classYW.method13679(var100);
            }

            IndexedSprite.method13810(Message.field733[classAB.field122.method2732((byte)14) ? 1 : 0], 765 + -329898575 * classBF.field385 - 40, 463);
            if (-44590225 * client.field828 > 5) {
               if (var3 >= -1329525269) {
                  throw new IllegalStateException();
               }

               if (classLU.field4232 == classXO.field6892) {
                  if (var3 >= -1329525269) {
                     return;
                  }

                  if (SceneTilePaint.field2294 != null) {
                     if (var3 >= -1329525269) {
                        return;
                     }

                     int var101 = -329898575 * classBF.field385 + 5;
                     short var140 = 463;
                     byte var162 = 100;
                     byte var171 = 35;
                     IndexedSprite.method13810(SceneTilePaint.field2294, var101, var140);
                     var0.method65(classKK.field3790 + " " + client.field827 * 1311484143, var101 + var162 / 2, var140 + var171 / 2 - 2, 16777215, 0);
                     if (null != classIS.field3054) {
                        if (var3 >= -1329525269) {
                           throw new IllegalStateException();
                        }

                        var1.method65(classKK.field3921, var101 + var162 / 2, 12 + var171 / 2 + var140, 16777215, 0);
                     } else {
                        var1.method65(classKK.field3817, var101 + var162 / 2, var140 + var171 / 2 + 12, 16777215, 0);
                     }
                  } else {
                     SceneTilePaint.field2294 = classSU.method10680(classHC.field2767, "sl_button", "", -1504741754);
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "hs.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.field3034 = this.field2883;
      var1.field3023 = this.field2881;
      var1.field3025 = this.field2880;
      var1.field3024 = this.field2879;
      var1.field3019 = this.field2882;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bz")
   static int method6103(int var0, Script var1, boolean var2, byte var3) {
      try {
         WorldMap var4 = classIO.method6230((byte)-66);
         if (6600 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var41 = classOA.method8290(1544651080);
               if (classKY.method6630(var41, -1905351182)) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var4.method12418(-210579119 * var41.field4057, var41.field4055 * 1870919123, 819227381 * var41.field4056, true, (short)28249);
               }

               return 1;
            }
         } else if (var0 == 6601) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var40 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               String var58 = "";
               WorldMapArea var62 = var4.method12486(var40, 1737537585);
               if (null != var62) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var58 = var62.method5861(-500044624);
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var58;
               return 1;
            }
         } else if (var0 == 6602) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var39 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4.method12423(var39, -547639807);
               return 1;
            }
         } else if (6603 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method12477((byte)-6);
            return 1;
         } else if (6604 == var0) {
            int var38 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var4.method12478(var38, 945231587);
            return 1;
         } else if (6605 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int[] var67 = classBB.field323;
               int var69 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var71;
               if (var4.method12483(1029607166)) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var71 = 1;
               } else {
                  var71 = 0;
               }

               var67[var69] = var71;
               return 1;
            }
         } else if (6606 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var37 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               var4.method12491(var37.field4055 * 1870919123, 819227381 * var37.field4056, (byte)-81);
               return 1;
            }
         } else if (6607 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var36 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               WorldMap.method12500(var4, var36.field4055 * 1870919123, var36.field4056 * 819227381, -799160146);
               return 1;
            }
         } else if (var0 == 6608) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var35 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               var4.method12503(var35.field4057 * -210579119, var35.field4055 * 1870919123, 819227381 * var35.field4056, (byte)1);
               return 1;
            }
         } else if (6609 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var34 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               var4.method12504(var34.field4057 * -210579119, var34.field4055 * 1870919123, var34.field4056 * 819227381, (byte)0);
               return 1;
            }
         } else if (6610 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method12509(-425530838);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method12511(-1134140564);
               return 1;
            }
         } else if (var0 == 6611) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var33 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapArea var57 = var4.method12486(var33, 2120512138);
               if (null == var57) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var57.method5902(-1866243526).method6619(-1873274489);
               }

               return 1;
            }
         } else if (6612 == var0) {
            int var32 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            WorldMapArea var56 = var4.method12486(var32, 2140534194);
            if (var56 == null) {
               if (var3 >= 85) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (
                     WorldMapArea.method5873(var56, -2105928043) - var56.method5871(2104574153) + 1
                  )
                  * 64;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (
                     WorldMapArea.method5884(var56, -2005057880) - WorldMapArea.method5880(var56, (short)-23493) + 1
                  )
                  * 64;
            }

            return 1;
         } else if (6613 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var31 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapArea var55 = var4.method12486(var31, 1933407261);
               if (var55 == null) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var55.method5871(2121269751) * 64;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5880(var55, (short)-11138) * 64;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5873(var55, -2059842380) * 64 + 64 - 1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5884(var55, -1775957318) * 64 + 64 - 1;
               }

               return 1;
            }
         } else if (6614 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var30 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapArea var54 = var4.method12486(var30, 2025188083);
               if (null == var54) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5867(var54, (byte)33);
               }

               return 1;
            }
         } else if (6615 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var29 = var4.method12513(2116046708);
               if (null == var29) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var29.field4055 * 1870919123;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var29.field4056 * 819227381;
               }

               return 1;
            }
         } else if (6616 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method12424(-2024075624);
            return 1;
         } else if (6617 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var28 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               WorldMapArea var53 = var4.method12427(-539086250);
               if (var53 == null) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                     return 1;
                  }
               } else {
                  int[] var61 = WorldMapArea.method5841(
                     var53, -210579119 * var28.field4057, 1870919123 * var28.field4055, 819227381 * var28.field4056, (short)3310
                  );
                  if (var61 == null) {
                     if (var3 >= 85) {
                        throw new IllegalStateException();
                     }

                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var61[0];
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var61[1];
                  }

                  return 1;
               }
            }
         } else if (var0 == 6618) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var27 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               WorldMapArea var52 = var4.method12427(-539086250);
               if (var52 == null) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                     return 1;
                  }
               } else {
                  classKY var60 = var52.method5844(1870919123 * var27.field4055, 819227381 * var27.field4056, (byte)123);
                  if (null == var60) {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var60.method6619(-1735582275);
                  }

                  return 1;
               }
            }
         } else if (var0 == 6619) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var26 = classBB.field323[DynamicObject.field1679 * -324749371];
               classKY var51 = new classKY(classBB.field323[-324749371 * DynamicObject.field1679 + 1]);
               classPC.method8841(var26, var51, false, -1555610915);
               return 1;
            }
         } else if (6620 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var25 = classBB.field323[-324749371 * DynamicObject.field1679];
               classKY var50 = new classKY(classBB.field323[DynamicObject.field1679 * -324749371 + 1]);
               classPC.method8841(var25, var50, true, -552667590);
               return 1;
            }
         } else if (var0 == 6621) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var24 = classBB.field323[DynamicObject.field1679 * -324749371];
               classKY var49 = new classKY(classBB.field323[-324749371 * DynamicObject.field1679 + 1]);
               WorldMapArea var59 = var4.method12486(var24, 2099779103);
               if (null == var59) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else {
                  int[] var66 = classBB.field323;
                  int var68 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var70;
                  if (WorldMapArea.method5835(var59, var49.field4057 * -210579119, 1870919123 * var49.field4055, 819227381 * var49.field4056, (byte)123)) {
                     if (var3 >= 85) {
                        throw new IllegalStateException();
                     }

                     var70 = 1;
                  } else {
                     var70 = 0;
                  }

                  var66[var68] = var70;
                  return 1;
               }
            }
         } else if (6622 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12518(var4, (byte)-65);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method12519(-1117430456);
               return 1;
            }
         } else if (var0 == 6623) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classKY var23 = new classKY(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
               WorldMapArea var48 = var4.method12416(-210579119 * var23.field4057, 1870919123 * var23.field4055, 819227381 * var23.field4056, (byte)12);
               if (null == var48) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var48.method5848(-608589044);
               }

               return 1;
            }
         } else if (var0 == 6624) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               var4.method12523(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)17);
               return 1;
            }
         } else if (var0 == 6625) {
            var4.method12525((byte)120);
            return 1;
         } else if (6626 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               WorldMap.method12528(var4, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], 1515465245);
               return 1;
            }
         } else if (var0 == 6627) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               var4.method12533((byte)118);
               return 1;
            }
         } else if (var0 == 6628) {
            boolean var65;
            if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 >= 85) {
                  throw new IllegalStateException();
               }

               var65 = true;
            } else {
               var65 = false;
            }

            boolean var22 = var65;
            var4.method12537(var22, 861017044);
            return 1;
         } else if (var0 == 6629) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var21 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4.method12541(var21, (byte)-1);
               return 1;
            }
         } else if (6630 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var20 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4.method12544(var20, 1791589508);
               return 1;
            }
         } else if (6631 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               var4.method12546(-254931415);
               return 1;
            }
         } else if (var0 == 6632) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               boolean var64;
               if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var64 = true;
               } else {
                  var64 = false;
               }

               boolean var19 = var64;
               WorldMap.method12556(var4, var19, (byte)-22);
               return 1;
            }
         } else if (6633 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var18 = classBB.field323[-324749371 * DynamicObject.field1679];
            boolean var47 = 1 == classBB.field323[1 + DynamicObject.field1679 * -324749371];
            var4.method12549(var18, var47, -1774238068);
            return 1;
         } else if (6634 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var17 = classBB.field323[-324749371 * DynamicObject.field1679];
               boolean var63;
               if (classBB.field323[DynamicObject.field1679 * -324749371 + 1] == 1) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var63 = true;
               } else {
                  var63 = false;
               }

               boolean var46 = var63;
               var4.method12552(var17, var46, (byte)51);
               return 1;
            }
         } else if (6635 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (WorldMap.method12555(var4, 404322590)) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (6636 == var0) {
            int var16 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12559(var4, var16, (byte)13) ? 1 : 0;
            return 1;
         } else if (var0 == 6637) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12563(var4, var15, -1181761071) ? 1 : 0;
               return 1;
            }
         } else if (6638 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var14 = classBB.field323[-324749371 * DynamicObject.field1679];
               classKY var45 = new classKY(classBB.field323[1 + -324749371 * DynamicObject.field1679]);
               classKY var7 = var4.method12579(var14, var45, 241883862);
               if (null == var7) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7.method6619(-1646416364);
               }

               return 1;
            }
         } else if (6639 == var0) {
            AbstractWorldMapIcon var13 = var4.method12585((short)-17984);
            if (null == var13) {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var13.vmethod486((byte)-55);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var13.field2769.method6619(-1744487000);
            }

            return 1;
         } else if (var0 == 6640) {
            AbstractWorldMapIcon var12 = var4.method12588((byte)-88);
            if (var12 == null) {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var12.vmethod486((byte)-114);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var12.field2769.method6619(-2086769174);
            }

            return 1;
         } else if (6693 == var0) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var11 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapElement var44 = SceneTilePaint.method4796(var11, (byte)12);
               if (null == var44.field5412) {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var44.field5412;
               }

               return 1;
            }
         } else if (var0 == 6694) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var10 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapElement var43 = SceneTilePaint.method4796(var10, (byte)-34);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var43.field5394 * 1698532127;
               return 1;
            }
         } else if (var0 == 6695) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               int var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               WorldMapElement var42 = SceneTilePaint.method4796(var9, (byte)-18);
               if (var42 == null) {
                  if (var3 >= 85) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1254355271 * var42.field5404;
               }

               return 1;
            }
         } else if (var0 == 6696) {
            int var5 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            WorldMapElement var6 = SceneTilePaint.method4796(var5, (byte)0);
            if (var6 == null) {
               if (var3 >= 85) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var6.field5395 * 1274039073;
            }

            return 1;
         } else if (var0 == 6697) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2897 * -753629693;
            return 1;
         } else if (var0 == 6698) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2896.method6619(-1968935754);
               return 1;
            }
         } else if (var0 == 6699) {
            if (var3 >= 85) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2895.method6619(-1491760677);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "hs.bz(" + 41);
      }
   }

   classHS(classIF var1) {
      this.this$0 = var1;
   }
}
