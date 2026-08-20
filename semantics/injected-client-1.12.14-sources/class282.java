import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kc")
public class class282 {
   @ObfuscatedName("au")
   final int field3255;
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("at")
   static final class282 field3260 = new class282(6, 16, 16);
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("ag")
   static final class282 field3258 = new class282(4, 32, 32);
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("an")
   static final class282 field3259 = new class282(2, 48, 48);
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("ae")
   static final class282 field3257 = new class282(5, 64, 64);
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("av")
   static final class282 field3256 = new class282(0, 8, 8);
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("ak")
   static final class282 field3262 = new class282(3, 128, 128);
   @ObfuscatedName("aw")
   final int field3254;
   @ObfuscatedSignature(descriptor = "[Lkc;")
   @ObfuscatedName("ap")
   static final class282[] field3263;
   @ObfuscatedSignature(descriptor = "Lkc;")
   @ObfuscatedName("aj")
   static final class282 field3261 = new class282(1, 96, 96);
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field3264 = 8;
   @ObfuscatedName("ay")
   final int field3253;
   @ToRemove(unused = "true")
   @ObfuscatedName("cn")
   static final int field3265 = 83;

   class282(int var1, int var2, int var3) {
      this.field3254 = var1 * 1322060861;
      this.field3253 = var2 * -1572867737;
      this.field3255 = 520261865 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkc;)I")
   @ObfuscatedName("ig")
   public static int method6295(class282 var0) {
      return 694917719 * var0.field3253 * var0.field3255 * 1471367001;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   int method6296(byte var1) {
      try {
         return 694917719 * this.field3253 * this.field3255 * 1471367001;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kc.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int method6297() {
      return 694917719 * this.field3253 * this.field3255 * 1471367001;
   }

   static {
      class282[] var0 = new class282[]{field3256, field3261, field3259, field3262, field3258, field3257, field3260};
      field3263 = var0;
      Arrays.sort(field3263, new class289());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int method6298() {
      return 2061268973 * this.field3253 * this.field3255 * -1163081692;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvn;")
   @ObfuscatedName("hi")
   static PlatformInfo getPlatformInfo(int var0) {
      try {
         return WorldMapLabelSize.platformInfo;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "kc.hi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[FIIFI)V")
   @ObfuscatedName("xk")
   public static void method6294(class272 var0, int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
      if (var0 == null) {
         var0.method6565(var1, var2, var3, var3, var5, var3);
      } else {
         int var7 = var0.field2854.field3434 & var6;
         int var8 = var0.field2854.field3438 & var6;
         var1[var3] = var7 & var4 | ~var7 & var1[var3];
         int var9 = var8 & Float.floatToRawIntBits(var5);
         int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
         var2[var3] = Float.intBitsToFloat(var9 | var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ie")
   static final void method6300(int var0, int var1, byte var2) {
      try {
         if (var0 < 128) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            var0 = 128;
         } else if (var0 > 383) {
            if (var2 <= 28) {
               return;
            }

            var0 = 383;
         }

         if (GraphicsObject.cameraPitch * -1593954547 < var0) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            GraphicsObject.cameraPitch = GraphicsObject.cameraPitch
               + -1628293179 * (class28.field166 * 1039921429 + WorldView.field1332 * 436965041 * (var0 - -1593954547 * GraphicsObject.cameraPitch) / 1000);
            if (GraphicsObject.cameraPitch * -1593954547 > var0) {
               if (var2 <= 28) {
                  throw new IllegalStateException();
               }

               GraphicsObject.cameraPitch = var0 * -1628293179;
            }
         } else if (GraphicsObject.cameraPitch * -1593954547 > var0) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            GraphicsObject.cameraPitch = GraphicsObject.cameraPitch
               - (436965041 * WorldView.field1332 * (GraphicsObject.cameraPitch * -1593954547 - var0) / 1000 + 1039921429 * class28.field166) * -1628293179;
            if (-1593954547 * GraphicsObject.cameraPitch < var0) {
               if (var2 <= 28) {
                  throw new IllegalStateException();
               }

               GraphicsObject.cameraPitch = var0 * -1628293179;
            }
         }

         var1 &= 2047;
         int var3 = var1 - 197556079 * WorldMapData_0.cameraYaw;
         if (var3 > 1024) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            var3 -= 2048;
         } else if (var3 < -1024) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            var3 += 2048;
         }

         if (var3 > 0) {
            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            WorldMapData_0.cameraYaw = WorldMapData_0.cameraYaw + (var3 * 436965041 * WorldView.field1332 / 1000 + class28.field166 * 1039921429) * -378222705;
            WorldMapData_0.cameraYaw = -378222705 * (WorldMapData_0.cameraYaw * 197556079 & 2047);
         } else if (var3 < 0) {
            WorldMapData_0.cameraYaw = WorldMapData_0.cameraYaw - (class28.field166 * 1039921429 + -var3 * WorldView.field1332 * 436965041 / 1000) * -378222705;
            WorldMapData_0.cameraYaw = (WorldMapData_0.cameraYaw * 197556079 & 2047) * -378222705;
         }

         int var4 = var1 - WorldMapData_0.cameraYaw * 197556079;
         if (var4 > 1024) {
            if (var2 <= 28) {
               return;
            }

            var4 -= 2048;
         } else if (var4 < -1024) {
            if (var2 <= 28) {
               return;
            }

            var4 += 2048;
         }

         label126: {
            if (var4 < 0) {
               if (var2 <= 28) {
                  return;
               }

               if (var3 > 0) {
                  break label126;
               }

               if (var2 <= 28) {
                  throw new IllegalStateException();
               }
            }

            if (var4 <= 0) {
               return;
            }

            if (var2 <= 28) {
               throw new IllegalStateException();
            }

            if (var3 >= 0) {
               return;
            }
         }

         WorldMapData_0.cameraYaw = var1 * -378222705;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kc.ie(" + ')');
      }
   }
}
