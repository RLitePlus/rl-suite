import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sx")
public class classSX {
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hh")
   static classVP field6097;
   @ObfuscatedSignature(descriptor = "Lds;")
   @ObfuscatedName("et")
   static classDS field6096;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6094 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   public static final int field6095 = 72;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Lct;")
   @ObfuscatedName("ag")
   public static Player method10701(int var0, classCL var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.field1694.method13404(var0);
         if (null != var5) {
            if (!var4.method3719(-2087374717)) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldn;")
   @ObfuscatedName("aa")
   public static NPC method10705(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         NPC var4 = (NPC)var3.field1698.method13404(var0);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Lct;")
   @ObfuscatedName("as")
   public static Player method10702(int var0, classCL var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.field1694.method13404(var0);
         if (null != var5) {
            if (!var4.method3719(-2087374717)) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Lct;")
   @ObfuscatedName("ac")
   public static Player method10703(int var0, classCL var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.field1694.method13404(var0);
         if (null != var5) {
            if (!var4.method3719(-2087374717)) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   classSX() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Lct;")
   @ObfuscatedName("ax")
   public static Player method10704(int var0, classCL var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.field1694.method13404(var0);
         if (null != var5) {
            if (!var4.method3719(-2087374717)) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldn;")
   @ObfuscatedName("ao")
   public static NPC method10706(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         NPC var4 = (NPC)var3.field1698.method13404(var0);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("al")
   public static WorldView method10707(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         Player var4 = (Player)var3.field1694.method13404(var0);
         if (null != var4 && !var3.method3719(-2087374717)) {
            return var3;
         }
      }

      return classCL.method1592(var1, 330971815);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("aj")
   public static WorldView method10708(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         Player var4 = (Player)var3.field1694.method13404(var0);
         if (null != var4 && !var3.method3719(-2087374717)) {
            return var3;
         }
      }

      return classCL.method1592(var1, -466450432);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("ay")
   public static WorldView method10709(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         if (var3.field1698.method13404(var0) != null) {
            return var3;
         }
      }

      return classCL.method1592(var1, -786916178);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("aq")
   public static WorldView method10710(int var0, classCL var1) {
      for (WorldView var3 : var1) {
         if (var3.field1698.method13404(var0) != null) {
            return var3;
         }
      }

      return classCL.method1592(var1, -1870188710);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;)Z")
   @ObfuscatedName("fx")
   public static boolean method10712(World var0) {
      if (var0 == null) {
         var0.method2519();
      }

      return (classXE.field6830.vmethod8((byte)1) & -458552905 * var0.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Lcm;")
   @ObfuscatedName("ac")
   static World method10711(int var0) {
      try {
         return -932636273 * World.field1156 < World.field1153 * -622036481 ? World.field1170[(World.field1156 += 2111825263) * -932636273 - 1] : null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "sx.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("aa")
   static String method10713(int var0, int var1) {
      try {
         String var2 = Integer.toString(var0);

         for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            if (var1 <= -1897223536) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, var3) + classDO.field1592 + var2.substring(var3);
         }

         if (var2.length() > 9) {
            if (var1 <= -1897223536) {
               throw new IllegalStateException();
            } else {
               return " "
                  + classQY.method9847(65408, (byte)11)
                  + var2.substring(0, var2.length() - 8)
                  + classKK.field3829
                  + " "
                  + classDO.field1593
                  + var2
                  + classDO.field1591
                  + classDO.field1594;
            }
         } else if (var2.length() <= 6) {
            return " " + classQY.method9847(16776960, (byte)51) + var2 + classDO.field1594;
         } else if (var1 <= -1897223536) {
            throw new IllegalStateException();
         } else {
            return " "
               + classQY.method9847(16777215, (byte)91)
               + var2.substring(0, var2.length() - 4)
               + classKK.field3657
               + " "
               + classDO.field1593
               + var2
               + classDO.field1591
               + classDO.field1594;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sx.aa(" + ')');
      }
   }
}
