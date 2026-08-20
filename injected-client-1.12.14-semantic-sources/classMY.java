import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("my")
public class classMY implements classMP {
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("at")
   public static final classMY field4022 = new classMY(15, 20);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("ag")
   public static final classMY field4018 = new classMY(16, -2);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("an")
   public static final classMY field4015 = new classMY(18, -2);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("av")
   public static final classMY field4014 = new classMY(14, 0);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("ae")
   public static final classMY field4017 = new classMY(19, -2);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("aj")
   public static final classMY field4016 = new classMY(21, 37);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("ak")
   static final classMY field4019 = new classMY(27, 0);
   @ObfuscatedSignature(descriptor = "Lmy;")
   @ObfuscatedName("aw")
   public static final classMY field4021 = new classMY(32, 66);
   @ObfuscatedSignature(descriptor = "[Lmy;")
   @ObfuscatedName("ap")
   static final classMY[] field4020 = new classMY[33];
   @ObfuscatedName("ay")
   public final int field4012;
   @ObfuscatedName("au")
   public final int field4013;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field4023 = 46;

   classMY(int var1, int var2) {
      this.field4012 = var1 * 967631029;
      this.field4013 = -128366499 * var2;
   }

   static {
      classMY[] var0 = class113.method3917(-1591361979);

      for (int var1 = 0; var1 < var0.length; var1++) {
         field4020[var0[var1].field4012 * -890434147] = var0[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lmy;")
   @ObfuscatedName("at")
   static classMY[] method7543() {
      return new classMY[]{field4022, field4021, field4016, field4014, field4019, field4015, field4018, field4017};
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIB)V")
   @ObfuscatedName("an")
   static final void method7544(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if (null != var0.collisionMaps) {
            if (var6 == 15) {
               throw new IllegalStateException();
            }

            for (int var7 = 0; var7 < 4; var7++) {
               if (var6 == 15) {
                  throw new IllegalStateException();
               }

               CollisionMap var8 = var0.collisionMaps[var7];

               for (int var9 = var2; var9 < var2 + 64; var9++) {
                  if (var6 == 15) {
                     throw new IllegalStateException();
                  }

                  for (int var10 = var3; var10 < var3 + 64; var10++) {
                     if (var8.method6401(var9, var10, -286048574)) {
                        if (var6 == 15) {
                           throw new IllegalStateException();
                        }

                        var8.method6398(var9, var10, 1073741824, -921764187);
                     }
                  }
               }
            }
         }

         Buffer var14 = new Buffer(var1);

         for (int var15 = 0; var15 < 4; var15++) {
            if (var6 == 15) {
               throw new IllegalStateException();
            }

            for (int var17 = 0; var17 < 64; var17++) {
               if (var6 == 15) {
                  throw new IllegalStateException();
               }

               for (int var19 = 0; var19 < 64; var19++) {
                  if (var6 == 15) {
                     throw new IllegalStateException();
                  }

                  int var11 = var2 + var17;
                  int var12 = var19 + var3;
                  class264.loadTerrain(var0, var14, var15, var11, var12, var11 + var4, var12 + var5, 0, 2120297876);
               }
            }
         }

         int var10000;
         if (var14.offset * 2108391709 < var14.array.length) {
            if (var6 == 15) {
               throw new IllegalStateException();
            }

            var10000 = var14.readUnsignedByte(583516362);
         } else {
            var10000 = 0;
         }

         int var16 = var10000;
         boolean var18 = 0 != (var16 & 1);
         if (var18) {
            if (var6 == 15) {
               return;
            }

            for (int var20 = 0; var20 < 64; var20++) {
               if (var6 == 15) {
                  throw new IllegalStateException();
               }

               for (int var21 = 0; var21 < 64; var21++) {
                  class148.method4142(var14, (byte)110);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "my.an(" + ')');
      }
   }
}
