import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("db")
public class classDB {
   @ObfuscatedName("ag")
   int field1371;
   @ObfuscatedName("af")
   int field1370;
   @ObfuscatedName("au")
   static File field1379;
   @ObfuscatedName("ab")
   int field1368;
   @ToRemove(unused = "true")
   @ObfuscatedName("es")
   static final int field1378 = 1;
   @ObfuscatedName("as")
   int field1373;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field1376 = 32;
   @ObfuscatedName("az")
   int field1374;
   @ObfuscatedName("ae")
   int field1369;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1372 = 499;
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   static final int field1377 = 1007;
   @ObfuscatedName("bb")
   static int field1375;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;IIIIII)V")
   @ObfuscatedName("as")
   public static void method2881(classDB var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method2885(var1, var1, var1, var1, var1, var1);
      } else {
         var0.field1374 = var1 * -2025561193;
         var0.field1370 = var2 * -378780443;
         var0.field1369 = 881833361 * var3;
         var0.field1368 = var4 * 644877005;
         var0.field1371 = var5 * -1839559751;
         var0.field1373 = var6 * -1907644063;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("az")
   void method2882(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         this.field1374 = var1 * -2025561193;
         this.field1370 = var2 * -378780443;
         this.field1369 = 881833361 * var3;
         this.field1368 = var4 * 644877005;
         this.field1371 = var5 * -1839559751;
         this.field1373 = var6 * -1907644063;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "db.az(" + ')');
      }
   }

   classDB() {
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ab")
   void method2883(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field1374 = var1 * -2025561193;
      this.field1370 = var2 * 104444716;
      this.field1369 = 881833361 * var3;
      this.field1368 = var4 * 596199647;
      this.field1371 = var5 * 1523743017;
      this.field1373 = var6 * -1907644063;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   static int method2880(int var0, int var1, int var2) {
      try {
         if (-2 == var0) {
            if (var2 != 1375698635) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (-1 == var0) {
            if (var1 < 0) {
               if (var2 != 1375698635) {
                  throw new IllegalStateException();
               }

               var1 = 0;
            } else if (var1 > 127) {
               if (var2 != 1375698635) {
                  throw new IllegalStateException();
               }

               var1 = 127;
            }

            return 127 - var1;
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               if (var2 != 1375698635) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 != 1375698635) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return (var0 & 65408) + var1;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "db.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cz")
   static boolean method2887(byte var0) {
      try {
         return (-1072700981 * client.field852 & 4) != 0;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "db.cz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;IIIIII)V")
   @ObfuscatedName("wj")
   public static void method2884(classDB var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method2885(var1, var1, var1, var1, var1, var1);
      }

      var0.field1374 = var1 * -2025561193;
      var0.field1370 = var2 * -378780443;
      var0.field1369 = -1047173704 * var3;
      var0.field1368 = var4 * 644877005;
      var0.field1371 = var5 * -1839559751;
      var0.field1373 = var6 * -1907644063;
   }

   @ObfuscatedSignature(descriptor = "(Lcm;I)V")
   @ObfuscatedName("av")
   static void method2886(World var0, int var1) {
      try {
         if (var0.method2482((byte)-49) != client.field932) {
            client.field932 = var0.method2482((byte)-105);
            classBD.method988(var0.method2482((byte)-33), 2047526172);
         }

         if (-2024190683 * client.field883 != var0.field1163 * -458552905) {
            classVP var2 = classHC.field2767;
            int var3 = var0.field1163 * -458552905;
            if ((var3 & classXE.field6840.vmethod8((byte)1)) != 0) {
               if (var1 != 1660308192) {
                  client.method1920();
                  return;
               }

               AABB.field2372 = classSU.method10680(var2, "logo_deadman_mode", "", -188356597);
            } else if ((var3 & classXE.field6851.vmethod8((byte)1)) != 0) {
               if (var1 != 1660308192) {
                  throw new IllegalStateException();
               }

               AABB.field2372 = classSU.method10680(var2, "logo_seasonal_mode", "", -1306596214);
            } else if ((var3 & classXE.field6836.vmethod8((byte)1)) != 0) {
               if (var1 != 1660308192) {
                  client.method1920();
                  return;
               }

               AABB.field2372 = classSU.method10680(var2, "logo_speedrunning", "", -117981147);
            } else if ((var3 & classXE.field6839.vmethod8((byte)1)) != 0) {
               if (var1 != 1660308192) {
                  throw new IllegalStateException();
               }

               AABB.field2372 = classSU.method10680(var2, "logo_ugc_world", "", -215054047);
            } else {
               AABB.field2372 = classSU.method10680(var2, "logo", "", 320308891);
            }
         }

         WidgetConfigNode.field4139 = var0.field1169;
         client.field827 = var0.field1162 * 894790041;
         client.field883 = var0.field1163 * -635970901;
         classGV.field2716 = var0.field1168;
         int var10001;
         if (0 == 2064080735 * client.field940) {
            if (var1 != 1660308192) {
               throw new IllegalStateException();
            }

            var10001 = 43594;
         } else {
            var10001 = var0.field1162 * 851246551 + 40000;
         }

         classRJ.field5681 = 721437403 * var10001;
         if (0 == client.field940 * 2064080735) {
            if (var1 != 1660308192) {
               throw new IllegalStateException();
            }

            var10001 = 443;
         } else {
            var10001 = 50000 + var0.field1162 * 851246551;
         }

         classMB.field4478 = 309769881 * var10001;
         classAD.field141 = 1527064229 * classRJ.field5681;
         client.method1920();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "db.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("af")
   void method2885(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field1371 = var1 * -2025561193;
      this.field1370 = var2 * -378780443;
      this.field1369 = -1047173704 * var3;
      this.field1371 = var4 * 644877005;
      this.field1369 = var5 * -1839559751;
      this.field1374 = var6 * -1907644063;
   }
}
