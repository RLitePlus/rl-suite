import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kx")
public class ModelData0 {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3490 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3489 = 4;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("da")
   static IndexedSprite field3492;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3488 = 32768;
   @ObfuscatedName("ix")
   static int field3491;

   ModelData0() {
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   static void method6707(byte var0) {
      try {
         ViewportMouse.ViewportMouse_false0 = false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "kx.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)Z")
   @ObfuscatedName("ae")
   public static boolean method6706(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         long var11 = 1073741824L;
         long var13 = -1073741824L;
         long var9;
         if (var0 != var2) {
            if (var8 == 237640361) {
               throw new IllegalStateException();
            }

            long var15 = var3 - var1;
            long var17 = (var15 << 15) / (var2 - var0);
            var9 = Math.min(1073741824L, Math.max(-1073741824L, var17));
         } else if (var1 > var3) {
            if (var8 == 237640361) {
               throw new IllegalStateException();
            }

            var9 = -1073741824L;
         } else {
            var9 = 1073741824L;
         }

         long var26 = 1073741824L;
         long var27 = -1073741824L;
         if (var4 != var6) {
            long var19 = var7 - var5;
            long var21 = (var19 << 15) / (var6 - var4);
            var13 = Math.min(1073741824L, Math.max(-1073741824L, var21));
         } else if (var5 > var7) {
            if (var8 == 237640361) {
               throw new IllegalStateException();
            }

            var13 = -1073741824L;
         } else {
            var13 = 1073741824L;
         }

         if (var13 == var9) {
            if (var8 == 237640361) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            var27 = ((long)var1 << 15) - var9 * var0;
            long var29 = ((long)var5 << 15) - var13 * var4;
            int var30 = -((int)((var27 - var29) / (var9 - var13)));
            if (Math.min(var0, var2) <= var30 && Math.max(var0, var2) >= var30) {
               if (var8 == 237640361) {
                  throw new IllegalStateException();
               }

               if (Math.min(var4, var6) <= var30) {
                  if (var8 == 237640361) {
                     throw new IllegalStateException();
                  }

                  if (Math.max(var4, var6) >= var30) {
                     if (var8 == 237640361) {
                        throw new IllegalStateException();
                     }

                     long var22;
                     if (Math.abs(var9) < Math.abs(var13)) {
                        var22 = var27 + var30 * var9 >> 15;
                     } else {
                        var22 = var13 * var30 + var29 >> 15;
                     }

                     if (Math.min(var1, var3) <= var22) {
                        if (var8 == 237640361) {
                           throw new IllegalStateException();
                        }

                        if (Math.max(var1, var3) >= var22) {
                           if (var8 == 237640361) {
                              throw new IllegalStateException();
                           }

                           if (Math.min(var5, var7) <= var22 && Math.max(var5, var7) >= var22) {
                              if (var8 == 237640361) {
                                 throw new IllegalStateException();
                              }

                              return true;
                           }
                        }
                     }

                     return false;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var24) {
         throw RestClientThreadFactory.newRunException(var24, "kx.ae(" + ')');
      }
   }
}
