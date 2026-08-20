import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bu")
public class classBU extends classGG {
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field577 = 1004;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field578 = 1002;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field579 = 40;

   @ObfuscatedSignature(descriptor = "(IIILgc;B)Z")
   @ObfuscatedName("az")
   @Override
   protected boolean vmethod144(int var1, int var2, int var3, CollisionMap var4, byte var5) {
      try {
         if (this.field2575 * -1977362375 == var2) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            if (this.field2573 * -1069935115 == var3) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "bu.az(" + ')');
      }
   }

   classBU() {
   }

   @ObfuscatedSignature(descriptor = "(IIILgc;)Z")
   @ObfuscatedName("af")
   @Override
   protected boolean vmethod145(int var1, int var2, int var3, CollisionMap var4) {
      return this.field2575 * -1977362375 == var2 && this.field2573 * -1069935115 == var3;
   }

   @ObfuscatedSignature(descriptor = "(IIILgc;)Z")
   @ObfuscatedName("ae")
   @Override
   protected boolean vmethod146(int var1, int var2, int var3, CollisionMap var4) {
      return this.field2575 * 2117141590 == var2 && this.field2573 * -1069935115 == var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("ae")
   static int method1245(int var0, int var1, int var2, byte var3) {
      try {
         if (var2 > 179) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "bu.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([FI)V")
   @ObfuscatedName("ag")
   static void method1247(float[] var0, int var1) {
      try {
         var0[1] = 1.0F - var0[1];
         if (var0[0] < 0.0F) {
            if (var1 <= 283669774) {
               return;
            }

            var0[0] = 0.0F;
         }

         if (var0[1] < 0.0F) {
            var0[1] = 0.0F;
         }

         label39: {
            if (!(var0[0] > 1.0F)) {
               if (var1 <= 283669774) {
                  throw new IllegalStateException();
               }

               if (!(var0[1] > 1.0F)) {
                  break label39;
               }

               if (var1 <= 283669774) {
                  throw new IllegalStateException();
               }
            }

            float var2 = 1.0F + (var0[0] * (var0[0] - 2.0F + var0[1]) + (var0[1] - 2.0F) * var0[1]);
            if (var2 + classST.field6039 > 0.0F) {
               if (var1 <= 283669774) {
                  throw new IllegalStateException();
               }

               classIF.method6208(var0, -850399243);
            }
         }

         var0[1] = 1.0F - var0[1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "bu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aa")
   static final void method1246(int var0, int var1) {
      try {
         int[] var2 = classRD.field5645.field7005;
         int var3 = var2.length;

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1 != 1443313102) {
               return;
            }

            var2[var4] = 1;
         }

         for (int var13 = 1; var13 < 103; var13++) {
            if (var1 != 1443313102) {
               return;
            }

            int var5 = (103 - var13) * 2048 + 24628;

            for (int var6 = 1; var6 < 103; var6++) {
               if (var1 != 1443313102) {
                  throw new IllegalStateException();
               }

               if ((classIS.field3053.field1702[var0][var6][var13] & 24) == 0) {
                  if (var1 != 1443313102) {
                     return;
                  }

                  classIS.field3053.scene.method4459(var2, var5, 512, var0, var6, var13);
               }

               if (var0 < 3) {
                  if (var1 != 1443313102) {
                     return;
                  }

                  if ((classIS.field3053.field1702[var0 + 1][var6][var13] & 8) != 0) {
                     classIS.field3053.scene.method4459(var2, var5, 512, 1 + var0, var6, var13);
                  }
               }

               var5 += 4;
            }
         }

         int var14 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
         int var15 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
         classRD.field5645.method13477();

         for (int var16 = 1; var16 < 103; var16++) {
            if (var1 != 1443313102) {
               throw new IllegalStateException();
            }

            for (int var7 = 1; var7 < 103; var7++) {
               if (0 == (classIS.field3053.field1702[var0][var7][var16] & 24)) {
                  if (var1 != 1443313102) {
                     return;
                  }

                  classLD.method6746(var0, var7, var16, var14, var15, (byte)1);
               }

               if (var0 < 3) {
                  if (var1 != 1443313102) {
                     throw new IllegalStateException();
                  }

                  if ((classIS.field3053.field1702[1 + var0][var7][var16] & 8) != 0) {
                     if (var1 != 1443313102) {
                        return;
                     }

                     classLD.method6746(1 + var0, var7, var16, var14, var15, (byte)1);
                  }
               }
            }
         }

         classBA.field306 = 0;

         for (int var17 = 0; var17 < 104; var17++) {
            if (var1 != 1443313102) {
               throw new IllegalStateException();
            }

            for (int var18 = 0; var18 < 104; var18++) {
               long var8 = classIS.field3053.scene.method4476(classIS.field3053.field1710 * -483624883, var17, var18);
               if (var8 != 0L) {
                  if (var1 != 1443313102) {
                     throw new IllegalStateException();
                  }

                  int var10 = classCN.method2552(var8);
                  int var11 = classMU.method7729(var10, 1883040848).field4953 * 1412472849;
                  if (var11 >= 0) {
                     if (!SceneTilePaint.method4796(var11, (byte)-93).field5399) {
                        if (var1 != 1443313102) {
                           throw new IllegalStateException();
                        }
                     } else {
                        classBA.field310[classBA.field306 * 1296562401] = SceneTilePaint.method4796(var11, (byte)-22).method9199(false, 592907760);
                        classBA.field308[1296562401 * classBA.field306] = var17;
                        classBA.field312[1296562401 * classBA.field306] = var18;
                        classBA.field306 += 313477921;
                     }
                  }
               }
            }
         }

         classWO.field6763.method13314(1247144305);
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "bu.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIIIZB)V")
   @ObfuscatedName("dg")
   static void method1248(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, byte var11) {
      try {
         TileItem var12 = new TileItem();
         var12.field1552 = var4 * -1746397127;
         int var10001 = var5 * -513440211;
         var12.method3414(var5 * -513440211 * 1413659045);
         var12.field1554 = var10001;
         var12.method3393(var6, -1051430211);
         var12.field1550 = 280443191 * (var7 + client.field892 * -581422983);
         var12.field1549 = (client.field892 * -581422983 + var8) * -1675505975;
         var12.field1551 = var9 * -1232010363;
         var12.field1560 = var10;
         if (var0.field1701[var1][var2][var3] == null) {
            if (var11 >= 10) {
               throw new IllegalStateException();
            }

            var0.field1701[var1][var2][var3] = new classNN();
         }

         classNN.method7900(var0.field1701[var1][var2][var3], var12);
         classLJ.method7116(var0, var1, var2, var3, (byte)-10);
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "bu.dg(" + ')');
      }
   }
}
