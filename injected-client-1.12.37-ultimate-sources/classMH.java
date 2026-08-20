import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mh")
public abstract class classMH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field4505 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("cc")
   static final int field4506 = 160;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4504 = 7;

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("ba")
   static final void method7571(int var0, int var1, short var2) {
      try {
         var0 = classKC.method6458(var0, -181998943);
         int var3 = client.field914.method11436((short)-28167);
         int var4 = client.field796.method11436((short)-4430);
         if (var3 < var0) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var3 += classGU.field2699 * -463609277 * (var0 - var3) / 1000 + classHE.field2781 * 836632525;
            if (var3 > var0) {
               if (var2 == 255) {
                  throw new IllegalStateException();
               }

               var3 = var0;
            }
         } else if (var3 > var0) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var3 -= -463609277 * classGU.field2699 * (var3 - var0) / 1000 + classHE.field2781 * 836632525;
            if (var3 < var0) {
               if (var2 == 255) {
                  throw new IllegalStateException();
               }

               var3 = var0;
            }
         }

         var1 &= classCS.method2576(-1520924805);
         int var5 = var1 - var4;
         short var7 = 8192;
         if (var5 > var7) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var5 -= classKG.method6472(-2085028226);
         } else {
            short var9 = 8192;
            if (var5 < -var9) {
               var5 += classKG.method6472(199047527);
            }
         }

         if (var5 > 0) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var4 += var5 * classGU.field2699 * -463609277 / 1000 + 836632525 * classHE.field2781;
         } else if (var5 < 0) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var4 -= 836632525 * classHE.field2781 + -var5 * -463609277 * classGU.field2699 / 1000;
         }

         int var8 = var1 - var4;
         short var10 = 8192;
         if (var8 > var10) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var8 -= classKG.method6472(-459448143);
         } else {
            short var12 = 8192;
            if (var8 < -var12) {
               if (var2 == 255) {
                  throw new IllegalStateException();
               }

               var8 += classKG.method6472(-18800356);
            }
         }

         label114: {
            label119: {
               if (var8 < 0) {
                  if (var2 == 255) {
                     throw new IllegalStateException();
                  }

                  if (var5 > 0) {
                     break label119;
                  }

                  if (var2 == 255) {
                     throw new IllegalStateException();
                  }
               }

               if (var8 <= 0 || var5 >= 0) {
                  break label114;
               }

               if (var2 == 255) {
                  throw new IllegalStateException();
               }
            }

            var4 = var1;
         }

         client.field914.method11434(var3, -1499893710);
         client.field796.method11434(var4, -1273130461);
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "mh.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   public abstract void vmethod530(byte var1);

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   public abstract int vmethod535(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ol")
   public int vmethod536(int var1, int var2) {
      return this.vmethod535(var1, var2, -1162884564);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public abstract void vmethod532();

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public abstract int vmethod534(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("az")
   public static int method7570(int var0, int var1, byte var2) {
      try {
         return (var0 << 8) + var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mh.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public abstract int vmethod533(int var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmh;")
   @ObfuscatedName("ac")
   public static classMH method7569() {
      try {
         return new classMG();
      } catch (Throwable var1) {
         return new classMQ();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("gv")
   static final int method7572(byte var0) {
      try {
         return classKF.field3571.method3425(-1960183053);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "mh.gv(" + 41);
      }
   }

   classMH() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public abstract void vmethod531();
}
