import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cc")
public class classCC {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field669 = 61;
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("af")
   static final classCC field661 = new classCC(1);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("al")
   static final classCC field659 = new classCC(10);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("az")
   static final classCC field652 = new classCC(0);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ag")
   static final classCC field656 = new classCC(4);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("as")
   static final classCC field657 = new classCC(5);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ax")
   static final classCC field658 = new classCC(6);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ac")
   static final classCC field666 = new classCC(7);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("aa")
   static final classCC field663 = new classCC(8);
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hj")
   static classVP field671;
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ae")
   static final classCC field654 = new classCC(2);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("aj")
   static final classCC field653 = new classCC(11);
   @ObfuscatedName("au")
   int field651;
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("aq")
   static final classCC field660 = new classCC(13);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ad")
   static final classCC field662 = new classCC(14);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ap")
   static final classCC field667 = new classCC(15);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ao")
   static final classCC field665 = new classCC(9);
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ab")
   static final classCC field655 = new classCC(3);
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field668 = 47;
   @ToRemove(unused = "true")
   @ObfuscatedName("cn")
   static final int field670 = 201;
   @ObfuscatedSignature(descriptor = "Lcc;")
   @ObfuscatedName("ay")
   static final classCC field664 = new classCC(12);

   classCC(int var1) {
      this.field651 = var1 * -1305022761;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("xg")
   public static int method1404(classGN var0) {
      return var0.field2627.length;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cb")
   static void method1408(int var0) {
      try {
         Player var1 = classMB.method7521(-1477207973);
         if (null != var1) {
            if (var0 != -806820883) {
               throw new IllegalStateException();
            }

            if (1698720137 * client.field859 != var1.field1487 * -1547553299 >> 7 || -1296391725 * client.field834 != -1272026483 * var1.field1489 >> 7) {
               return;
            }

            if (var0 != -806820883) {
               return;
            }
         }

         client.field859 = 0;
         client.field834 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cc.cb(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvy;)D")
   @ObfuscatedName("fs")
   public static double method1403(classVY var0) {
      return var0.field6642;
   }

   @ObfuscatedSignature(descriptor = "(IZZZZB)Lvp;")
   @ObfuscatedName("ad")
   static classVP method1407(int var0, boolean var1, boolean var2, boolean var3, boolean var4, byte var5) {
      try {
         classUS var6 = null;
         if (null != classME.field4488) {
            if (var5 == 2) {
               throw new IllegalStateException();
            }

            var6 = new classUS(var0, classME.field4488, GraphicsObject.field477[var0], 1000000);
         }

         return new classVP(var6, classQX.field5623, classEB.field1726, var0, var1, var2, var3, var4, false);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "cc.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cf")
   static final void method1409(byte var0) {
      try {
         for (Projectile var1 = (Projectile)client.field817.method7915(); null != var1; var1 = (Projectile)classNN.method7924(client.field817)) {
            if (var0 != 0) {
               throw new IllegalStateException();
            }

            if (1612595797 * client.field855 > var1.field558 * 384835215) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               var1.vmethod398();
            } else if (client.field855 * 1612595797 >= var1.field544 * -988090901) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               Projectile.method1224(var1, client.field814, 1612595797 * client.field855, client.field949 * -322689719, (byte)1);
               Scene.method4477(
                  classIS.field3053.scene,
                  var1.field546 * 728954045,
                  (int)var1.field562,
                  (int)var1.field564,
                  (int)var1.field560,
                  60,
                  var1,
                  var1.field565 * 1834702173,
                  -1L,
                  false
               );
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cc.cf(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbw;Laae;)Z")
   @ObfuscatedName("io")
   public static boolean method1405(classBW var0, classAAE var1) {
      if (var0 == null) {
         var0.method1290();
      }

      return var1 == null ? false : var0.field591.method10202(var1, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "([[[IIIII)V")
   @ObfuscatedName("as")
   static final void method1406(int[][][] var0, int var1, int var2, int var3, int var4) {
      try {
         for (int var5 = 0; var5 < 8; var5++) {
            for (int var6 = 0; var6 < 8; var6++) {
               var0[var1][var5 + var2][var3 + var6] = 0;
            }
         }

         if (var2 > 0) {
            if (var4 != -1790487635) {
               throw new IllegalStateException();
            }

            for (int var8 = 1; var8 < 8; var8++) {
               if (var4 != -1790487635) {
                  return;
               }

               var0[var1][var2][var3 + var8] = var0[var1][var2 - 1][var8 + var3];
            }
         }

         if (var3 > 0) {
            if (var4 != -1790487635) {
               throw new IllegalStateException();
            }

            for (int var9 = 1; var9 < 8; var9++) {
               if (var4 != -1790487635) {
                  throw new IllegalStateException();
               }

               var0[var1][var9 + var2][var3] = var0[var1][var2 + var9][var3 - 1];
            }
         }

         if (var2 > 0) {
            if (var4 != -1790487635) {
               throw new IllegalStateException();
            }

            if (0 != var0[var1][var2 - 1][var3]) {
               if (var4 != -1790487635) {
                  throw new IllegalStateException();
               }

               var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
               return;
            }
         }

         if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
            if (var4 != -1790487635) {
               throw new IllegalStateException();
            }

            var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
         } else if (var2 > 0) {
            if (var4 != -1790487635) {
               return;
            }

            if (var3 > 0) {
               if (var4 != -1790487635) {
                  return;
               }

               if (var0[var1][var2 - 1][var3 - 1] != 0) {
                  var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "cc.as(" + ')');
      }
   }
}
