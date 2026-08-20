import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zj")
public class classZJ {
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("az")
   public static classNV field7189 = new classNV();
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7190 = 250;

   classZJ() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public static boolean method14043() {
      classZQ var0 = (classZQ)field7189.method8167();
      return null != var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   public static boolean method14044() {
      classZQ var0 = (classZQ)field7189.method8167();
      return null != var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
   @ObfuscatedName("aa")
   static Class method14048(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return byte.class;
      } else if (var0.equals("I")) {
         return int.class;
      } else if (var0.equals("S")) {
         return short.class;
      } else if (var0.equals("J")) {
         return long.class;
      } else if (var0.equals("Z")) {
         return boolean.class;
      } else if (var0.equals("F")) {
         return float.class;
      } else if (var0.equals("D")) {
         return double.class;
      } else if (var0.equals("C")) {
         return char.class;
      } else {
         return var0.equals("void") ? void.class : Class.forName(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("ax")
   public static void method14046(classXS var0) {
      classZQ var1 = (classZQ)field7189.method8167();
      if (var1 != null) {
         int var2 = 702114061 * var0.field6955;
         var0.method12979(var1.field7236 * -417925375, 828157859);

         for (int var3 = 0; var3 < var1.field7235 * 569821081; var3++) {
            if (0 != var1.field7239[var3]) {
               classXY.method12971(var0, var1.field7239[var3], (byte)-125);
            } else {
               try {
                  int var4 = var1.field7237[var3];
                  if (0 == var4) {
                     Field var5 = var1.field7240[var3];
                     int var6 = var5.getInt(null);
                     classXY.method12971(var0, 0, (byte)-29);
                     var0.method12979(var6, 1290809744);
                  } else if (1 == var4) {
                     Field var22 = var1.field7240[var3];
                     var22.setInt(null, var1.field7238[var3]);
                     classXY.method12971(var0, 0, (byte)-8);
                  } else if (var4 == 2) {
                     Field var23 = var1.field7240[var3];
                     int var26 = var23.getModifiers();
                     classXY.method12971(var0, 0, (byte)-33);
                     var0.method12979(var26, 225332529);
                  }

                  if (var4 != 3) {
                     if (4 == var4) {
                        Method var25 = var1.field7241[var3];
                        int var28 = var25.getModifiers();
                        classXY.method12971(var0, 0, (byte)-47);
                        var0.method12979(var28, 1050910404);
                     }
                  } else {
                     Method var24 = var1.field7241[var3];
                     byte[][] var27 = var1.field7242[var3];
                     Object[] var7 = new Object[var27.length];

                     for (int var8 = 0; var8 < var27.length; var8++) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var29 = var24.invoke(null, var7);
                     if (null == var29) {
                        classXY.method12971(var0, 0, (byte)-19);
                     } else if (var29 instanceof Number) {
                        classXY.method12971(var0, 1, (byte)-35);
                        var0.method12987(((Number)var29).longValue());
                     } else if (var29 instanceof String) {
                        classXY.method12971(var0, 2, (byte)-78);
                        classXY.method12997(var0, (String)var29, (short)24468);
                     } else {
                        classXY.method12971(var0, 4, (byte)-92);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  classXY.method12971(var0, -10, (byte)-43);
               } catch (InvalidClassException var11) {
                  classXY.method12971(var0, -11, (byte)-28);
               } catch (StreamCorruptedException var12) {
                  classXY.method12971(var0, 30597723, (byte)-15);
               } catch (OptionalDataException var13) {
                  classXY.method12971(var0, -13, (byte)-73);
               } catch (IllegalAccessException var14) {
                  classXY.method12971(var0, -14, (byte)-36);
               } catch (IllegalArgumentException var15) {
                  classXY.method12971(var0, -15, (byte)-80);
               } catch (InvocationTargetException var16) {
                  classXY.method12971(var0, -16, (byte)-105);
               } catch (SecurityException var17) {
                  classXY.method12971(var0, 512175335, (byte)-87);
               } catch (IOException var18) {
                  classXY.method12971(var0, -18, (byte)-64);
               } catch (NullPointerException var19) {
                  classXY.method12971(var0, 1315714708, (byte)-95);
               } catch (Exception var20) {
                  classXY.method12971(var0, -20, (byte)-15);
               } catch (Throwable var21) {
                  classXY.method12971(var0, -21, (byte)-6);
               }
            }
         }

         var0.method13145(var2, -1669758824);
         var1.vmethod398();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ac")
   public static void method14047(classXY var0, int var1) {
      classZQ var2 = new classZQ();
      var2.field7235 = classXY.method13039(var0, -346779531) * -1690461015;
      var2.field7236 = var0.method13056((byte)1) * 1763716747;
      var2.field7237 = new int[569821081 * var2.field7235];
      var2.field7239 = new int[569821081 * var2.field7235];
      var2.field7240 = new Field[569821081 * var2.field7235];
      var2.field7238 = new int[569821081 * var2.field7235];
      var2.field7241 = new Method[var2.field7235 * 569821081];
      var2.field7242 = new byte[var2.field7235 * 569821081][][];

      for (int var3 = 0; var3 < var2.field7235 * 569821081; var3++) {
         try {
            int var4 = classXY.method13039(var0, -346779531);
            if (0 != var4 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  String var25 = var0.method13071(654900071);
                  String var26 = var0.method13071(-1060297483);
                  int var27 = classXY.method13039(var0, -346779531);
                  String[] var8 = new String[var27];

                  for (int var9 = 0; var9 < var27; var9++) {
                     var8[var9] = var0.method13071(-154693549);
                  }

                  String var28 = var0.method13071(1804413356);
                  byte[][] var10 = new byte[var27][];
                  if (3 == var4) {
                     for (int var11 = 0; var11 < var27; var11++) {
                        int var12 = var0.method13056((byte)1);
                        var10[var11] = new byte[var12];
                        var0.method13084(var10[var11], 0, var12, (byte)50);
                     }
                  }

                  var2.field7237[var3] = var4;
                  Class[] var29 = new Class[var27];

                  for (int var30 = 0; var30 < var27; var30++) {
                     var29[var30] = classCD.method1431(var8[var30], (byte)4);
                  }

                  Class var31 = classCD.method1431(var28, (byte)26);
                  if (classCD.method1431(var25, (byte)69).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = classCD.method1431(var25, (byte)-16).getDeclaredMethods();
                  Method[] var14 = var13;

                  for (int var15 = 0; var15 < var14.length; var15++) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var26)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var29.length == var17.length) {
                           boolean var18 = true;

                           for (int var19 = 0; var19 < var29.length; var19++) {
                              if (var29[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var31 == var16.getReturnType()) {
                              var2.field7241[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field7242[var3] = var10;
               }
            } else {
               String var5 = var0.method13071(1976934672);
               String var6 = var0.method13071(573270006);
               int var7 = 0;
               if (var4 == 1) {
                  var7 = var0.method13056((byte)1);
               }

               var2.field7237[var3] = var4;
               var2.field7238[var3] = var7;
               if (classCD.method1431(var5, (byte)-84).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field7240[var3] = classCD.method1431(var5, (byte)24).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field7239[var3] = -1;
         } catch (SecurityException var21) {
            var2.field7239[var3] = -2;
         } catch (NullPointerException var22) {
            var2.field7239[var3] = -3;
         } catch (Exception var23) {
            var2.field7239[var3] = -4;
         } catch (Throwable var24) {
            var2.field7239[var3] = -5;
         }
      }

      classNV.method8156(field7189, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)Z")
   @ObfuscatedName("uo")
   public static boolean method14045(classBD var0) {
      return var0.field375.isDone();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
   @ObfuscatedName("ao")
   static Class method14049(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return byte.class;
      } else if (var0.equals("I")) {
         return int.class;
      } else if (var0.equals("S")) {
         return short.class;
      } else if (var0.equals("J")) {
         return long.class;
      } else if (var0.equals("Z")) {
         return boolean.class;
      } else if (var0.equals("F")) {
         return float.class;
      } else if (var0.equals("D")) {
         return double.class;
      } else if (var0.equals("C")) {
         return char.class;
      } else {
         return var0.equals("void") ? void.class : Class.forName(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   static final void method14050(int var0) {
      try {
         if (-496203881 * client.field967 == 0) {
            classDZ var2 = classIS.field3053;
            switch (-1921957715 * classLE.field4126.field4024) {
               case 0:
                  var2 = classQB.method9434(1778071523 * client.field849, client.field814, -780819548);
                  break;
               case 1:
                  var2 = classHB.method5990(1778071523 * client.field849, client.field814, -849117969);
                  break;
               case 2:
                  var2 = classIS.field3053;
                  break;
               case 3:
                  classKY.method6582(1778071523 * client.field849, -547564670);
                  int var3 = classKY.method6594(1778071523 * client.field849, (byte)-118);
                  int var4 = classKY.method6596(client.field849 * 1778071523, -560268380);
                  var2 = client.field814.method1596(var3, var4, -1987881682);
            }

            if (var2 == null) {
               return;
            }

            Object var25 = null;
            switch (-1921957715 * classLE.field4126.field4024) {
               case 0:
                  var25 = (classYB)var2.field1694.method13404(1778071523 * client.field849);
                  break;
               case 1:
                  var25 = (classYB)var2.field1698.method13404(1778071523 * client.field849);
                  break;
               case 2:
                  var25 = (classYB)var2.field1700.method13595(client.field849 * 1778071523);
                  break;
               case 3:
                  int var29 = classKY.method6582(1778071523 * client.field849, -1245331519);
                  int var5 = classKY.method6594(client.field849 * 1778071523, (byte)-51);
                  int var6 = classKY.method6596(client.field849 * 1778071523, -560268380);
                  int var7 = var5 - -1444178379 * var2.field1709;
                  int var8 = var6 - -351145363 * var2.field1708;
                  client.field850.method13385(var29, var7, var8, 1365691935);
                  var25 = client.field850;
            }

            if (var25 == null) {
               if (var0 != 1161256214) {
                  return;
               }

               return;
            }

            client.field962 = ((classYB)var25).vmethod368(311606126) * 1126376453;
            client.field986 = ((classYB)var25).vmethod371(-1314369959) * 320618265;
            if (classIS.field3053 != var2) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               classUZ var30 = classYY.method13790(var2, ((classYB)var25).vmethod368(311606126), ((classYB)var25).vmethod371(-1769115976), (byte)114);
               client.field962 = 1126376453 * (int)var30.field6427;
               client.field986 = (int)var30.field6426 * 320618265;
               classUZ.method11727(var30, 1791412169);
            }

            label506: {
               client.field1040 = ((classYB)var25).vmethod258((byte)-102) * -686553453;
               if (318828117 * classJY.field3500 - 2106329293 * client.field962 >= -500) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  if (classJY.field3500 * 318828117 - 2106329293 * client.field962 <= 500) {
                     if (var0 != 1161256214) {
                        throw new IllegalStateException();
                     }

                     if (classPF.field5237 * 68756747 - client.field986 * -2126074583 >= -500) {
                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }

                        if (classPF.field5237 * 68756747 - client.field986 * -2126074583 <= 500) {
                           if (classJY.field3500 * 318828117 != 2106329293 * client.field962) {
                              if (var0 != 1161256214) {
                                 throw new IllegalStateException();
                              }

                              classJY.field3500 = classJY.field3500 + -1794334979 * ((client.field962 * 2106329293 - classJY.field3500 * 318828117) / 16);
                              client.method2241(-1);
                           }

                           if (-2126074583 * client.field986 != 68756747 * classPF.field5237) {
                              if (var0 != 1161256214) {
                                 return;
                              }

                              classPF.field5237 = classPF.field5237 + -528056669 * ((client.field986 * -2126074583 - classPF.field5237 * 68756747) / 16);
                              client.method2258(-1);
                           }
                           break label506;
                        }

                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               classJY.field3500 = 997144729 * client.field962;
               client.method2241(-1);
               classPF.field5237 = -1666158821 * client.field986;
               client.method2258(-1);
            }

            int var31 = 318828117 * classJY.field3500 >> 7;
            int var36 = 68756747 * classPF.field5237 >> 7;
            int var40 = classKV.method6571(
               classIS.field3053, classJY.field3500 * 318828117, 68756747 * classPF.field5237, 1741031323 * client.field1040, (byte)122
            );
            int var42 = 0;
            if (var31 > 3) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               if (var36 > 3) {
                  if (var0 != 1161256214) {
                     return;
                  }

                  if (var31 < 100) {
                     if (var0 != 1161256214) {
                        throw new IllegalStateException();
                     }

                     if (var36 < 100) {
                        for (int var45 = var31 - 4; var45 <= var31 + 4; var45++) {
                           if (var0 != 1161256214) {
                              throw new IllegalStateException();
                           }

                           for (int var9 = var36 - 4; var9 <= var36 + 4; var9++) {
                              if (var0 != 1161256214) {
                                 throw new IllegalStateException();
                              }

                              int var10 = 1741031323 * client.field1040;
                              if (var10 < 3 && (classIS.field3053.field1702[1][var45][var9] & 2) == 2) {
                                 var10++;
                              }

                              int var11 = var40 - classIS.field3053.field1688[var10][var45][var9];
                              if (var11 > var42) {
                                 if (var0 != 1161256214) {
                                    throw new IllegalStateException();
                                 }

                                 var42 = var11;
                              }
                           }
                        }
                     }
                  }
               }
            }

            int var46 = 192 * var42 << 3;
            if (var46 > classEZ.method4138(client.field839) * 256) {
               var46 = classEZ.method4138(client.field839) * 256;
            }

            if (var46 < classEZ.method4131(client.field839) * 256) {
               var46 = classEZ.method4131(client.field839) * 256;
            }

            if (var46 > client.field955 * -719672733) {
               if (var0 != 1161256214) {
                  return;
               }

               client.field955 = client.field955 + (var46 - client.field955 * -719672733) / 24 * -649517237;
               client.method2403(-1);
            } else if (var46 < client.field955 * -719672733) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field955 = client.field955 + -649517237 * ((var46 - client.field955 * -719672733) / 80);
               client.method2403(-1);
            }

            int var47 = ((classYB)var25).vmethod368(311606126);
            int var48 = ((classYB)var25).vmethod371(-1925650647);
            int var12 = client.field1040 * 1741031323;
            int var13 = classKV.method6571(var2, var47, var48, var12, (byte)122);
            classSP var14 = (classSP)classIS.field3053.field1700.method13595(2140889407 * var2.field1699);
            if (null != var14) {
               if (var0 != 1161256214) {
                  return;
               }

               var13 += classKV.method6571(classIS.field3053, var14.vmethod368(311606126), var14.vmethod371(-739104730), var14.vmethod258((byte)-10), (byte)122);
            }

            client.field884 = 1533582705 * var13;
            classBK.field489 = 1423746095 * client.field884 - -1150066931 * client.field840;
            client.method1823(-1);
         } else if (1 == -496203881 * client.field967) {
            if (var0 != 1161256214) {
               throw new IllegalStateException();
            }

            classDZ var21 = client.field814.method1590(client.field846 * -2034209657, (short)-7746);
            classCT var32 = var21.method3737(-2130951373 * client.field845, (byte)1);
            classUZ var1;
            if (null != var32) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               classUZ var37 = classYY.method13790(var21, var32.vmethod368(311606126), var32.vmethod371(-568866254), (byte)123);
               var37.field6425 = var32.vmethod258((byte)-13);
               var1 = var37;
            } else {
               var1 = classHZ.method6135(16777216);
            }

            label468: {
               if (client.field952 && !classUZ.method11745(var1, (byte)-43)) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  int var26 = (int)var1.field6427;
                  int var33 = (int)var1.field6426;
                  int var38 = classKY.method6608(var26, (byte)-91);
                  int var41 = classKY.method6608(var33, (byte)-99);
                  if (!classIS.field3053.method3729(var38, var41, (byte)1)) {
                     classUZ.method11727(var1, 2122660122);
                     break label468;
                  }

                  classJY.field3500 = var26 * -1794334979;
                  client.method2241(-1);
                  int var43 = classKV.method6571(classIS.field3053, var26, var33, -483624883 * classIS.field3053.field1710, (byte)122)
                     - client.field840 * -184240077;
                  if (var43 < -961764289 * classBK.field489) {
                     if (var0 != 1161256214) {
                        return;
                     }

                     classBK.field489 = var43 * 774720447;
                     client.method1823(-1);
                  }

                  classPF.field5237 = var33 * -528056669;
                  client.method2258(-1);
                  client.field952 = false;
               }

               classUZ.method11727(var1, 2044706691);
            }

            int var16 = -1;
            if (classFA.method4540(client.field931, 33, 1557822100)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               var16 = 0;
            } else if (classFA.method4540(client.field931, 49, 1973849135)) {
               if (var0 != 1161256214) {
                  return;
               }

               var16 = classEG.method3882(1024, (byte)-7);
            }

            if (classFA.method4540(client.field931, 48, 495493659)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               if (0 == var16) {
                  if (var0 != 1161256214) {
                     return;
                  }

                  var16 = classEG.method3882(1792, (byte)25);
               } else if (var16 == classEG.method3882(1024, (byte)104)) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  var16 = classEG.method3882(1280, (byte)-77);
               } else {
                  var16 = classEG.method3882(1536, (byte)-13);
               }
            } else if (classFA.method4540(client.field931, 50, 1970181635)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               if (var16 == 0) {
                  if (var0 != 1161256214) {
                     return;
                  }

                  var16 = classEG.method3882(256, (byte)32);
               } else if (var16 == classEG.method3882(1024, (byte)99)) {
                  var16 = classEG.method3882(768, (byte)31);
               } else {
                  var16 = classEG.method3882(512, (byte)38);
               }
            }

            byte var22 = 0;
            if (classFA.method4540(client.field931, 35, 1096467661)) {
               var22 = -1;
            } else if (classFA.method4540(client.field931, 51, 1721822638)) {
               if (var0 != 1161256214) {
                  return;
               }

               var22 = 1;
            }

            int var27 = 0;
            if (var16 >= 0 || 0 != var22) {
               int var10000;
               if (classFA.method4540(client.field931, 81, 1297892079)) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1590423057 * client.field951;
               } else {
                  var10000 = client.field841 * 546701633;
               }

               var27 = var10000;
               var27 *= 16;
               client.field853 = var16 * -923466687;
               client.field950 = -1664018043 * var22;
            }

            if (client.field987 * -977367887 < var27) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field987 += var27 / 8 * -1602470831;
               if (-977367887 * client.field987 > var27) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  client.field987 = -1602470831 * var27;
               }
            } else if (-977367887 * client.field987 > var27) {
               if (var0 != 1161256214) {
                  return;
               }

               client.field987 = -1602470831 * (client.field987 * -206376391 / 10);
            }

            if (-977367887 * client.field987 > 0) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               int var34 = client.field987 * -977367887 / 16;
               if (client.field853 * 500763585 >= 0) {
                  if (var0 != 1161256214) {
                     throw new IllegalStateException();
                  }

                  int var17 = 500763585 * client.field853 - client.field796.method11436((short)-7772) & classCS.method2576(-1520924805);
                  int var39 = classBF.method997(var17, (byte)-50);
                  int var44 = classLL.method7119(var17, 1222866659);
                  classJY.field3500 += var39 * var34 / 65536 * -1794334979;
                  client.method2241(-1);
                  classPF.field5237 += var34 * var44 / 65536 * -528056669;
                  client.method2258(-1);
               }

               if (client.field950 * 441251661 != 0) {
                  classBK.field489 = classBK.field489 + var34 * 441251661 * client.field950 * 774720447;
                  client.method1823(-1);
                  if (classBK.field489 * -961764289 > 0) {
                     if (var0 != 1161256214) {
                        throw new IllegalStateException();
                     }

                     classBK.field489 = 0;
                     client.method1823(-1);
                  }
               }
            } else {
               client.field853 = 923466687;
               client.field950 = 1664018043;
            }

            int var35 = classEZ.method4131(client.field839) * 256;
            if (var35 > client.field955 * -719672733) {
               client.field955 = client.field955 + -649517237 * ((var35 - client.field955 * -719672733) / 24);
               client.method2403(-1);
            } else if (var35 < -719672733 * client.field955) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field955 = client.field955 + -649517237 * ((var35 - client.field955 * -719672733) / 80);
               client.method2403(-1);
            }

            if (classFA.method4540(client.field931, 13, -35163126)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field795.method3367(classEF.method3849(classJS.EXIT_FREECAM, client.field795.field1535, (byte)-43), -1301097035);
               client.field967 = 0;
            }
         }

         label528: {
            if (2090434187 * classTZ.field6251 == 4) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               if (classON.field4995) {
                  int var49;
                  label448: {
                     int var19 = -2144333897 * classTZ.field6264 - -958869211 * client.field921;
                     client.field919 = classEG.method3882(var19 * 2, (byte)54) * -745135755;
                     client.method2180(-1);
                     if (-1 != var19) {
                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }

                        if (1 != var19) {
                           var49 = (-2144333897 * classTZ.field6264 + client.field921 * -958869211) / 2;
                           break label448;
                        }

                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }
                     }

                     var49 = -2144333897 * classTZ.field6264;
                  }

                  label441: {
                     client.field921 = var49 * -1074208083;
                     int var24 = 1832988085 * client.field812 - -38255113 * classTZ.field6255;
                     client.field918 = classEG.method3882(2 * var24, (byte)-82) * 249810553;
                     if (var24 != -1) {
                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }

                        if (var24 != 1) {
                           var49 = (1832988085 * client.field812 + -38255113 * classTZ.field6255) / 2;
                           break label441;
                        }

                        if (var0 != 1161256214) {
                           throw new IllegalStateException();
                        }
                     }

                     var49 = -38255113 * classTZ.field6255;
                  }

                  client.field812 = var49 * -561637219;
                  break label528;
               }
            }

            int var18 = classEG.method3882(24, (byte)37);
            int var23 = classEG.method3882(12, (byte)-19);
            if (classFA.method4540(client.field931, 96, 800326200)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field918 = client.field918 + (-var18 - -1414186039 * client.field918) / 2 * 249810553;
            } else if (classFA.method4540(client.field931, 97, 2001277454)) {
               if (var0 != 1161256214) {
                  throw new IllegalStateException();
               }

               client.field918 = client.field918 + (var18 - client.field918 * -1414186039) / 2 * 249810553;
            } else {
               client.field918 = 249810553 * (-1414186039 * client.field918 / 2);
            }

            if (classFA.method4540(client.field931, 98, 2036264756)) {
               if (var0 != 1161256214) {
                  return;
               }

               client.field919 = client.field919 + -745135755 * ((var23 - -1891703075 * client.field919) / 2);
               client.method2180(-1);
            } else if (classFA.method4540(client.field931, 99, 1130711853)) {
               if (var0 != 1161256214) {
                  return;
               }

               client.field919 = client.field919 + -745135755 * ((-var23 - client.field919 * -1891703075) / 2);
               client.method2180(-1);
            } else {
               client.field919 = -1891703075 * client.field919 / 2 * -745135755;
               client.method2180(-1);
            }

            client.field921 = classTZ.field6264 * -794678101;
            client.field812 = -1310977925 * classTZ.field6255;
         }

         classUP.method11457(client.field994, client.field918 * -1414186039 / 2, -1985221643);
         int var20 = client.field942.method11436((short)-19081) + -1891703075 * client.field919 / 2;
         client.field942.method11434(classKC.method6458(var20, -181998943), -2057027980);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "zj.be(" + ')');
      }
   }
}
