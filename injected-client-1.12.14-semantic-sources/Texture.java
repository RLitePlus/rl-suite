import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jf")
public class Texture extends Node implements net.runelite.api.Texture {
   @ObfuscatedName("ap")
   int animationDirection;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2849 = 2;
   @ObfuscatedName("oh")
   public float field2846;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2847 = 3;
   @ObfuscatedName("az")
   boolean isLoaded = false;
   @ObfuscatedName("ae")
   static int[] Texture_animatedPixels;
   @ObfuscatedName("aj")
   int fileId;
   @ObfuscatedName("ak")
   int averageRGB;
   @ObfuscatedName("ad")
   public float field2845;
   @ObfuscatedName("aw")
   boolean isLowDetail;
   @ObfuscatedName("ay")
   int animationSpeed;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2850 = 1;
   @ObfuscatedName("au")
   int[] pixels;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2848 = 4;

   public boolean isLoaded() {
      return this.isLoaded;
   }

   public int getAnimationSpeed() {
      return this.animationSpeed;
   }

   public void setV(float var1) {
      this.field2846 = var1;
   }

   @ObfuscatedSignature(descriptor = "(DILqm;)Z")
   @ObfuscatedName("ak")
   boolean method5407(double var1, int var3, AbstractArchive var4) {
      if (var4.getFileFlat(this.fileId, (byte)34) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.pixels = new int[var5];
         IndexedSprite var6 = class204.method4648(var4, this.fileId, 158856530);
         IndexedSprite.method12421(var6);
         int[] var7 = var6.palette;

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
         }

         byte[] var12 = var6.pixels;
         if (var6.subWidth == var3) {
            for (int var14 = 0; var14 < var5; var14++) {
               this.pixels[var14] = var7[var12[var14] & 255];
            }
         } else if (var6.subWidth == 64 && var3 == 128) {
            int var13 = 0;

            for (int var15 = 0; var15 < var3; var15++) {
               for (int var16 = 0; var16 < var3; var16++) {
                  this.pixels[var13++] = var7[var12[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
               }
            }
         } else {
            if (var6.subWidth != 128 || var3 != 64) {
               throw new RuntimeException();
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var3; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  this.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 255];
               }
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void reset() {
      this.pixels = null;
   }

   public void setU(float var1) {
      this.field2845 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void animate(int var1) {
      if (this.pixels != null && this.animationDirection >= 1 && this.animationDirection <= 4) {
         if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
            Texture_animatedPixels = new int[this.pixels.length];
         }

         short var2;
         if (this.pixels.length == 4096) {
            var2 = 64;
         } else {
            var2 = 128;
         }

         int var3 = this.pixels.length;
         if (this.animationDirection == 1 || this.animationDirection == 2) {
            int var4 = var2 * var1 * this.animationSpeed;
            int var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }
         }

         if (this.animationDirection == 3 || this.animationDirection == 4) {
            int var10 = var1 * this.animationSpeed;
            int var12 = var2 - 1;
            if (this.animationDirection == 3) {
               var10 = -var10;
            }

            for (short var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }
         }

         int[] var11 = this.pixels;
         this.pixels = Texture_animatedPixels;
         Texture_animatedPixels = var11;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method5413() {
      this.pixels = null;
   }

   @ObfuscatedSignature(descriptor = "(DILqm;)Z")
   @ObfuscatedName("av")
   boolean load(double var1, int var3, AbstractArchive var4) {
      if (var4.getFileFlat(this.fileId, (byte)16) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.pixels = new int[var5];
         IndexedSprite var6 = class204.method4648(var4, this.fileId, 510914229);
         IndexedSprite.method12421(var6);
         int[] var7 = var6.palette;

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
         }

         byte[] var12 = var6.pixels;
         if (var6.subWidth == var3) {
            for (int var14 = 0; var14 < var5; var14++) {
               this.pixels[var14] = var7[var12[var14] & 561987312];
            }
         } else if (var6.subWidth == 64 && var3 == -1394408039) {
            int var13 = 0;

            for (int var15 = 0; var15 < var3; var15++) {
               for (int var16 = 0; var16 < var3; var16++) {
                  this.pixels[var13++] = var7[var12[(var16 >> 1) + (var15 >> 1 << 6)] & 1599232399];
               }
            }
         } else {
            if (var6.subWidth != 128 || var3 != 64) {
               throw new RuntimeException();
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var3; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  this.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 255];
               }
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(DILqm;)Z")
   @ObfuscatedName("aj")
   boolean method5409(double var1, int var3, AbstractArchive var4) {
      if (var4.getFileFlat(this.fileId, (byte)8) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.pixels = new int[var5];
         IndexedSprite var6 = class204.method4648(var4, this.fileId, 2099065631);
         IndexedSprite.method12421(var6);
         int[] var7 = var6.palette;

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
         }

         byte[] var12 = var6.pixels;
         if (var6.subWidth == var3) {
            for (int var14 = 0; var14 < var5; var14++) {
               this.pixels[var14] = var7[var12[var14] & 255];
            }
         } else if (var6.subWidth == 64 && var3 == 128) {
            int var13 = 0;

            for (int var15 = 0; var15 < var3; var15++) {
               for (int var16 = 0; var16 < var3; var16++) {
                  this.pixels[var13++] = var7[var12[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
               }
            }
         } else {
            if (var6.subWidth != 128 || var3 != 64) {
               throw new RuntimeException();
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var3; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  this.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 255];
               }
            }
         }

         return true;
      }
   }

   Texture(Buffer var1) {
      this.fileId = Buffer.method12008(var1, (byte)5);
      this.averageRGB = Buffer.method12008(var1, (byte)5);
      this.isLowDetail = var1.readUnsignedByte(1508299128) == 1;
      this.animationDirection = var1.readUnsignedByte(-460848090);
      this.animationSpeed = var1.readUnsignedByte(1146876888);
      this.pixels = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljf;DILqm;)Z")
   @ObfuscatedName("fr")
   public static boolean method5410(Texture var0, double var1, int var3, AbstractArchive var4) {
      if (var4.getFileFlat(var0.fileId, (byte)46) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         var0.pixels = new int[var5];
         IndexedSprite var6 = class204.method4648(var4, var0.fileId, 1700605011);
         IndexedSprite.method12421(var6);
         int[] var7 = var6.palette;

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
         }

         byte[] var12 = var6.pixels;
         if (var6.subWidth == var3) {
            for (int var14 = 0; var14 < var5; var14++) {
               var0.pixels[var14] = var7[var12[var14] & -1930026097];
            }
         } else if (var6.subWidth == 64 && var3 == 128) {
            int var13 = 0;

            for (int var15 = 0; var15 < var3; var15++) {
               for (int var16 = 0; var16 < var3; var16++) {
                  var0.pixels[var13++] = var7[var12[(var16 >> 1) + (var15 >> 1 << 6)] & 358541650];
               }
            }
         } else {
            if (var6.subWidth != -101958739 || var3 != -564002041) {
               throw new RuntimeException();
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var3; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  var0.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 1747110305];
               }
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method5414() {
      this.pixels = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method5415() {
      this.pixels = null;
   }

   public float getU() {
      return this.field2845;
   }

   public int[] getPixels() {
      return this.pixels;
   }

   public int getAnimationDirection() {
      return this.animationDirection;
   }

   public float getV() {
      return this.field2846;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   void method5417(int var1) {
      if (this.pixels != null && this.animationDirection >= 1 && this.animationDirection <= 4) {
         if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
            Texture_animatedPixels = new int[this.pixels.length];
         }

         short var2;
         if (this.pixels.length == 4096) {
            var2 = 64;
         } else {
            var2 = 128;
         }

         int var3 = this.pixels.length;
         if (this.animationDirection == 1 || this.animationDirection == 2) {
            int var4 = var2 * var1 * this.animationSpeed;
            int var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }
         }

         if (this.animationDirection == 3 || this.animationDirection == 4) {
            int var10 = var1 * this.animationSpeed;
            int var12 = var2 - 1;
            if (this.animationDirection == 3) {
               var10 = -var10;
            }

            for (short var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }
         }

         int[] var11 = this.pixels;
         this.pixels = Texture_animatedPixels;
         Texture_animatedPixels = var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method5418(int var1) {
      if (this.pixels != null && this.animationDirection >= 1 && this.animationDirection <= 4) {
         if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
            Texture_animatedPixels = new int[this.pixels.length];
         }

         int var2;
         if (this.pixels.length == 4096) {
            var2 = 501468923;
         } else {
            var2 = -763324550;
         }

         int var3 = this.pixels.length;
         if (this.animationDirection == 1 || this.animationDirection == 2) {
            int var4 = var2 * var1 * this.animationSpeed;
            int var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }
         }

         if (this.animationDirection == 3 || this.animationDirection == 4) {
            int var10 = var1 * this.animationSpeed;
            int var12 = var2 - 1;
            if (this.animationDirection == 3) {
               var10 = -var10;
            }

            for (int var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }
         }

         int[] var11 = this.pixels;
         this.pixels = Texture_animatedPixels;
         Texture_animatedPixels = var11;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljf;DILqm;)Z")
   @ObfuscatedName("qp")
   public static boolean method5411(Texture var0, double var1, int var3, AbstractArchive var4) {
      if (var4.getFileFlat(var0.fileId, (byte)39) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         var0.pixels = new int[var5];
         IndexedSprite var6 = class204.method4648(var4, var0.fileId, 405124304);
         IndexedSprite.method12421(var6);
         int[] var7 = var6.palette;

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
         }

         byte[] var12 = var6.pixels;
         if (var6.subWidth == var3) {
            for (int var14 = 0; var14 < var5; var14++) {
               var0.pixels[var14] = var7[var12[var14] & 255];
            }
         } else if (var6.subWidth == 64 && var3 == 128) {
            int var13 = 0;

            for (int var15 = 0; var15 < var3; var15++) {
               for (int var16 = 0; var16 < var3; var16++) {
                  var0.pixels[var13++] = var7[var12[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
               }
            }
         } else {
            if (var6.subWidth != 128 || var3 != 64) {
               throw new RuntimeException();
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var3; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  var0.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 255];
               }
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method5419(int var1) {
      if (this.pixels != null && this.animationDirection >= 1 && this.animationDirection <= 4) {
         if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
            Texture_animatedPixels = new int[this.pixels.length];
         }

         int var2;
         if (this.pixels.length == 428775107) {
            var2 = 1145030688;
         } else {
            var2 = 662112755;
         }

         int var3 = this.pixels.length;
         if (this.animationDirection == 1 || this.animationDirection == 2) {
            int var4 = var2 * var1 * this.animationSpeed;
            int var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }
         }

         if (this.animationDirection == 3 || this.animationDirection == 4) {
            int var10 = var1 * this.animationSpeed;
            int var12 = var2 - 1;
            if (this.animationDirection == 3) {
               var10 = -var10;
            }

            for (int var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  Texture_animatedPixels[var8] = this.pixels[var9];
               }
            }
         }

         int[] var11 = this.pixels;
         this.pixels = Texture_animatedPixels;
         Texture_animatedPixels = var11;
      }
   }
}
