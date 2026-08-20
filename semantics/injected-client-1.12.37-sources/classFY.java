import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fy")
public class classFY {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field2513 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final double field2509 = 2607.5945876176133;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field2511 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2510 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2512 = 3;

   classFY() {
   }

   @ObfuscatedSignature(descriptor = "(FFFFB)F")
   @ObfuscatedName("ae")
   static final float method5271(float var0, float var1, float var2, float var3, byte var4) {
      try {
         return var2 * var0 - var1 * var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "fy.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;Laae;Z)Z")
   @ObfuscatedName("fu")
   public static boolean method5273(FriendsList var0, classAAE var1, boolean var2) {
      if (var0 == null) {
         var0.method10133(var1, var2);
      }

      Friend var3 = (Friend)var0.method10207(var1, 282151994);
      return null == var3 ? false : !var2 || -760305529 * var3.field5669 != 0;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lkr;B)V")
   @ObfuscatedName("ck")
   static void method5274(WorldView var0, classKR var1, byte var2) {
      try {
         int var3 = 0;

         for (int var4 = 0; var4 < classZH.method14003(var0.field1693, (byte)10); var4++) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            WorldEntity var5 = (WorldEntity)var0.worldEntities.method13595(var0.field1693.method14001(var4, 1891622283));
            if (var5 != null) {
               if (-2034209657 * client.field846 == var5.field6012.field1699 * 2140889407) {
                  if (var2 <= 1) {
                     return;
                  }
               } else if (var5.method10571(-859227413) == var1) {
                  boolean var10000;
                  if (var3 < client.field882 * 1387630175) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var6 = var10000;
                  if (!var6) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var3++;
                     boolean var7 = false;
                     if (classKR.field4008 == var1) {
                        if (var2 <= 1) {
                           return;
                        }

                        var7 = classMN.method7624(var5, var0, -734181220);
                     }

                     classDG.method3080(var0, var5, var7, 1772441953);
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "fy.ck(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("az")
   static int method5270(int var0, int var1, byte var2) {
      try {
         ItemContainer var3 = (ItemContainer)ItemContainer.field454.method13363(var0);
         if (null == var3) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (var1 >= 0) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.quantities.length) {
                  return var3.quantities[var1];
               }

               if (var2 >= 1) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fy.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method5272(AbstractArchive var0, int var1) {
      try {
         classBQ.field531 = var0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fy.az(" + ')');
      }
   }
}
