import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eb")
public class classEB {
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field1721 = 17;
   @ObfuscatedSignature(descriptor = "Lvt;")
   @ObfuscatedName("pt")
   static PlatformInfo field1727;
   @ObfuscatedName("ae")
   int field1719;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field1725 = 29;
   @ObfuscatedSignature(descriptor = "Lvb;")
   @ObfuscatedName("pw")
   static classVB field1726;
   @ObfuscatedName("af")
   int field1720;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field1722 = 31;
   @ObfuscatedName("az")
   int field1724;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field1723 = 37;

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("bs")
   static final void method3803(WorldView var0, Actor var1, int var2) {
      try {
         int var3;
         boolean var4;
         label157: {
            var3 = -1;
            var4 = false;
            if (var1.method3149(1857490025)) {
               if (var2 >= -1317666184) {
                  throw new IllegalStateException();
               }

               if (var1.method3206(1542551662)) {
                  var3 = var1.method3261(162820460);
                  var4 = var1.method3227(1386776059);
                  Actor.method3160(var1, -983329598);
                  break label157;
               }
            }

            if (Actor.method3157(var1, 1718590827)) {
               if (var2 >= -1317666184) {
                  return;
               }

               if (var1.method3213((byte)55)) {
                  if (var2 >= -1317666184) {
                     return;
                  }

                  int var15 = classKY.method6612(var1.method3249(1254222995) - var0.field1709 * -1444178379, 744949980);
                  int var17 = classKY.method6612(var1.method3251(695894775) - -351145363 * var0.field1708, -1642766449);
                  int var18 = classKY.method6612(var1.method3249(1254222995) + (var1.method3254((byte)31) - 1) - -1444178379 * var0.field1709, 791326245);
                  int var21 = classKY.method6612(var1.method3251(-423127899) + (var1.method3258((byte)-83) - 1) - var0.field1708 * -351145363, 882389400);
                  int var10 = (var15 + var18) / 2;
                  int var11 = (var21 + var17) / 2;
                  int var12 = classBT.method1243(var1, var0, var0, var10, var11, (byte)1);
                  int var22;
                  if (-1 == var12) {
                     if (var2 >= -1317666184) {
                        throw new IllegalStateException();
                     }

                     var22 = 677773095 * var1.field1496;
                  } else {
                     var22 = var12;
                  }

                  var3 = var22;
                  var4 = var1.method3227(-1123446094);
                  Actor.method3231(var1, false, 51205404);
                  break label157;
               }
            }

            if (var1.method3151(-685442936)) {
               if (var2 >= -1317666184) {
                  throw new IllegalStateException();
               }

               WorldView var5 = null;
               int var6 = -1;
               int var7 = -1;
               CameraFocusableEntity var8 = null;
               if (var1.method3235(-1217021755) == classLJ.field4177) {
                  if (var2 >= -1317666184) {
                     throw new IllegalStateException();
                  }

                  var5 = classHB.method5990(var1.method3245((short)148), client.field814, -139095293);
                  var8 = (CameraFocusableEntity)var5.field1698.method13404(var1.method3245((short)148));
               } else if (var1.method3235(1812366758) == classLJ.field4176) {
                  if (var2 >= -1317666184) {
                     throw new IllegalStateException();
                  }

                  int var9 = var1.method3245((short)148);
                  var5 = classQB.method9434(var9, client.field814, -1248209298);
                  var8 = (CameraFocusableEntity)var5.field1694.method13404(var9);
               } else if (var1.method3235(-1853778300) == classLJ.field4175) {
                  int var19 = var1.method3245((short)148);
                  var5 = classIS.field3053;
                  var8 = (CameraFocusableEntity)var5.worldEntities.method13595(var19);
               }

               if (var8 != null) {
                  if (var2 >= -1317666184) {
                     throw new IllegalStateException();
                  }

                  var6 = var8.vmethod368(311606126);
                  var7 = var8.vmethod371(-1485838393);
                  int var20 = classBT.method1243(var1, var0, var5, var6, var7, (byte)1);
                  int var10000;
                  if (var20 == -1) {
                     if (var2 >= -1317666184) {
                        throw new IllegalStateException();
                     }

                     var10000 = 677773095 * var1.field1496;
                  } else {
                     var10000 = var20;
                  }

                  var3 = var10000;
               } else if (var1.method3247((byte)-20) != -1) {
                  if (var2 >= -1317666184) {
                     throw new IllegalStateException();
                  }

                  var3 = var1.method3247((byte)-3);
               } else if (var1.field1475) {
                  var1.method3241((byte)23);
                  var1.field1475 = false;
               }
            }
         }

         if (-1 == var3 && -1798356091 * var1.field1473 > 0) {
            if (var2 >= -1317666184) {
               throw new IllegalStateException();
            }

            if (var1.method3204((byte)1)) {
               var3 = var1.method3195(1593126723);
            }
         }

         int var10002;
         if (var3 != -1) {
            if (var2 >= -1317666184) {
               throw new IllegalStateException();
            }

            var10002 = var3;
         } else {
            var10002 = 677773095 * var1.field1496;
         }

         var1.field1496 = -1685749609 * var10002;
         if (var4) {
            if (var2 >= -1317666184) {
               return;
            }

            if (-909895021 * var1.field1472 > 0) {
               if (var2 >= -1317666184) {
                  throw new IllegalStateException();
               }

               var1.field1488 = var1.field1496 * -1169438953;
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "eb.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)I")
   @ObfuscatedName("al")
   public static int method3801(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 <= 13) {
               throw new IllegalStateException();
            }

            var3 = (var3 << 5) - var3 + var0.charAt(var4);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "eb.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ay")
   public static boolean method3802(char var0, byte var1) {
      try {
         if (var0 >= '0') {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "eb.ay(" + ')');
      }
   }

   classEB() {
   }
}
