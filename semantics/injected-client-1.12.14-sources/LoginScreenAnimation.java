import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ca")
public class LoginScreenAnimation {
   @ObfuscatedName("ab")
   int[] field452;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field448 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field447 = 256;
   @ObfuscatedName("aj")
   final int[][] field445;
   @ObfuscatedName("na")
   public static boolean field446 = true;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("ak")
   IndexedSprite[] sprites;
   @ObfuscatedName("aw")
   int[] field438 = new int[256];
   @ObfuscatedName("ai")
   int field439;
   @ObfuscatedName("ay")
   int[] field458;
   @ObfuscatedName("au")
   int[] field456;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field450 = 128;
   @ObfuscatedName("ad")
   int[] field454;
   @ObfuscatedName("af")
   int field437;
   @ObfuscatedName("ar")
   int[] field455;
   @ObfuscatedName("ac")
   int[] field453;
   @ObfuscatedName("az")
   int[] field459;
   @ObfuscatedName("ax")
   int[] field457;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field449 = 1;
   @ObfuscatedName("as")
   int field443;
   @ObfuscatedName("al")
   int field442;
   @ObfuscatedName("ah")
   int field441;
   @ObfuscatedName("ap")
   int field440 = 0;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("in")
   static LoginType loginType;

   @ObfuscatedSignature(descriptor = "(Lxm;)V")
   @ObfuscatedName("by")
   final void method1349(IndexedSprite var1) {
      for (int var2 = 0; var2 < this.field457.length; var2++) {
         this.field457[var2] = 0;
      }

      for (int var8 = 0; var8 < 1520767112; var8++) {
         int var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field457[var3] = (int)(Math.random() * 256.0);
      }

      for (int var9 = 0; var9 < 20; var9++) {
         for (int var11 = 1; var11 < 255; var11++) {
            for (int var4 = 1; var4 < -1788193622; var4++) {
               int var5 = (var11 << 7) + var4;
               this.field455[var5] = (this.field457[var5 - 128] + this.field457[var5 + 1] + this.field457[var5 - 1] + this.field457[var5 + -639792092]) / 4;
            }
         }

         int[] var12 = this.field457;
         this.field457 = this.field455;
         this.field455 = var12;
      }

      if (var1 != null) {
         int var10 = 0;

         for (int var13 = 0; var13 < var1.subHeight; var13++) {
            for (int var14 = 0; var14 < var1.subWidth; var14++) {
               if (var1.pixels[var10++] != 0) {
                  int var15 = 16 + var14 + var1.xOffset;
                  int var6 = var1.yOffset + var13 + 16;
                  int var7 = var15 + (var6 << 7);
                  this.field457[var7] = 0;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ai")
   static int method1312(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var3 + (1 + (var6 - var3)) * var2 / 64 & 0xFF;
      int var10 = var2 * (1 + (var7 - var4)) / 64 + var4 & 0xFF;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 0xFF;
      return var9 << 16 | var10 << 8 | var11;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bs")
   final void method1333(int var1) {
      int var2 = this.field458.length;
      if (-1419893674 * this.field439 > 0) {
         method1339(this, -1596507998 * this.field439, this.field459, -213017801);
      } else if (this.field443 * 122121674 > 0) {
         method1339(this, -1092851361 * this.field443, this.field454, 297689450);
      } else {
         System.arraycopy(this.field456, 0, this.field458, 0, var2);
      }

      method1345(this, var1, (byte)-108);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)[I")
   @ObfuscatedName("ad")
   static int[] method1310(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      for (int var6 = 0; var6 < 64; var6++) {
         var5[var6] = classOX.method8682(var0, var1, var6, -2074077930);
      }

      for (int var7 = 0; var7 < -1569547475; var7++) {
         var5[423412086 + var7] = classOX.method8682(var1, var2, var7, -1991680603);
      }

      for (int var8 = 0; var8 < 64; var8++) {
         var5[var8 + 128] = classOX.method8682(var2, var3, var8, -2103075169);
      }

      for (int var9 = 0; var9 < 64; var9++) {
         var5[192 + var9] = classOX.method8682(var3, var4, var9, -2065022254);
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("ak")
   final int blendColors(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 256 - var3;
         return ((var1 & 0xFF00) * var5 + (var2 & 0xFF00) * var3 & 0xFF0000) + (var5 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) >> 8;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ca.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   final void method1334(int var1, int var2) {
      try {
         int var3 = this.field458.length;
         if (-325214437 * this.field439 > 0) {
            if (var2 <= 983413449) {
               throw new IllegalStateException();
            }

            method1339(this, -325214437 * this.field439, this.field459, -941000434);
         } else if (this.field443 * -1595519961 > 0) {
            if (var2 <= 983413449) {
               throw new IllegalStateException();
            }

            method1339(this, -1595519961 * this.field443, this.field454, -521983144);
         } else {
            System.arraycopy(this.field456, 0, this.field458, 0, var3);
         }

         method1345(this, var1, (byte)-121);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ca.aw(" + ')');
      }
   }

   LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
      this.field439 = 0;
      this.field443 = 0;
      this.field441 = 0;
      this.field442 = 0;
      this.field437 = 0;
      this.sprites = var1;
      this.field445 = var2;
      method1318(this, (byte)-25);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)[I")
   @ObfuscatedName("az")
   static int[] method1311(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      for (int var6 = 0; var6 < 64; var6++) {
         var5[var6] = classOX.method8682(var0, var1, var6, -1965207100);
      }

      for (int var7 = 0; var7 < -184760265; var7++) {
         var5[1382570963 + var7] = classOX.method8682(var1, var2, var7, -2034082428);
      }

      for (int var8 = 0; var8 < -859491060; var8++) {
         var5[var8 + -1766983403] = classOX.method8682(var2, var3, var8, -2090026730);
      }

      for (int var9 = 0; var9 < 64; var9++) {
         var5[192 + var9] = classOX.method8682(var3, var4, var9, -2146447473);
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lca;IB)V")
   @ObfuscatedName("nd")
   public static void method1345(LoginScreenAnimation var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method1348(var1, var2);
      }

      try {
         int var3 = 0;

         for (int var4 = 1; var4 < 255; var4++) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            int var5 = var0.field438[var4] * (256 - var4) / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               var7 = -var6;
               var6 = 0;
            }

            if (128 + var6 >= GameEngine.rasterProvider.width * 81685145) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var8 = 81685145 * GameEngine.rasterProvider.width - var6;
            }

            int var9 = var6 + (var4 + 8) * GameEngine.rasterProvider.width * 81685145;
            var3 += var7;

            for (int var10 = var7; var10 < var8; var10++) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               int var11 = var0.field453[var3++];
               int var12 = var9 % Rasterizer2D.Rasterizer2D_width;
               if (0 != var11) {
                  if (var2 >= 1) {
                     return;
                  }

                  if (var12 >= Rasterizer2D.Rasterizer2D_xClipStart && var12 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                     if (var2 >= 1) {
                        return;
                     }

                     int var14 = 256 - var11;
                     int var18 = var0.field458[var11];
                     int var15 = GameEngine.rasterProvider.pixels[var9];
                     GameEngine.rasterProvider.pixels[var9++] = 0xFF000000
                        | (var14 * (var15 & 16711935) + var11 * (var18 & 16711935) & -16711936)
                              + (var14 * (var15 & 0xFF00) + var11 * (var18 & 0xFF00) & 0xFF0000)
                           >> 8;
                     continue;
                  }
               }

               var9++;
            }

            var3 += 128 - var8;
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "ca.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxm;B)V")
   @ObfuscatedName("au")
   final void method1350(IndexedSprite var1, byte var2) {
      try {
         for (int var3 = 0; var3 < this.field457.length; var3++) {
            if (var2 != 1) {
               return;
            }

            this.field457[var3] = 0;
         }

         for (int var10 = 0; var10 < 5000; var10++) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            int var4 = (int)(Math.random() * 128.0 * 256.0);
            this.field457[var4] = (int)(Math.random() * 256.0);
         }

         for (int var11 = 0; var11 < 20; var11++) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            for (int var13 = 1; var13 < 255; var13++) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               for (int var5 = 1; var5 < 127; var5++) {
                  int var6 = (var13 << 7) + var5;
                  this.field455[var6] = (this.field457[var6 - 128] + this.field457[var6 + 1] + this.field457[var6 - 1] + this.field457[var6 + 128]) / 4;
               }
            }

            int[] var14 = this.field457;
            this.field457 = this.field455;
            this.field455 = var14;
         }

         if (var1 != null) {
            if (var2 != 1) {
               return;
            }

            int var12 = 0;

            for (int var15 = 0; var15 < var1.subHeight; var15++) {
               for (int var16 = 0; var16 < var1.subWidth; var16++) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var1.pixels[var12++] != 0) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     int var17 = 16 + var16 + var1.xOffset;
                     int var7 = var1.yOffset + var15 + 16;
                     int var8 = var17 + (var7 << 7);
                     this.field457[var8] = 0;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ca.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("as")
   static int method1313(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var3 + (1 + (var6 - var3)) * var2 / 64 & 0xFF;
      int var10 = var2 * (1 + (var7 - var4)) / 64 + var4 & 0xFF;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 0xFF;
      return var9 << 16 | var10 << 8 | var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ac")
   static int method1314(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var3 + (1 + (var6 - var3)) * var2 / 64 & 0xFF;
      int var10 = var2 * (1 + (var7 - var4)) / 64 + var4 & 0xFF;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 0xFF;
      return var9 << 16 | var10 << 8 | var11;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method1316() {
      this.field456 = SoundCache.method3452(this.field445[0][0], this.field445[0][1], this.field445[0][2], this.field445[0][3], this.field445[0][4], (byte)76);
      this.field459 = SoundCache.method3452(this.field445[1][0], this.field445[1][1], this.field445[1][2], this.field445[1][3], this.field445[1][4], (byte)7);
      this.field454 = SoundCache.method3452(this.field445[2][0], this.field445[2][1], this.field445[2][2], this.field445[2][3], this.field445[2][4], (byte)105);
      this.field458 = new int[256];
      this.field441 = 0;
      this.field457 = new int[32768];
      this.field455 = new int[32768];
      this.method1350(null, (byte)1);
      this.field453 = new int[32768];
      this.field452 = new int[32768];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method1320() {
      this.field456 = null;
      this.field459 = null;
      this.field454 = null;
      this.field458 = null;
      this.field457 = null;
      this.field455 = null;
      this.field453 = null;
      this.field452 = null;
      this.field441 = 0;
      this.field442 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method1317() {
      this.field456 = SoundCache.method3452(this.field445[0][0], this.field445[0][1], this.field445[0][2], this.field445[0][3], this.field445[0][4], (byte)67);
      this.field459 = SoundCache.method3452(this.field445[1][0], this.field445[1][1], this.field445[1][2], this.field445[1][3], this.field445[1][4], (byte)28);
      this.field454 = SoundCache.method3452(this.field445[2][0], this.field445[2][1], this.field445[2][2], this.field445[2][3], this.field445[2][4], (byte)29);
      this.field458 = new int[256];
      this.field441 = 0;
      this.field457 = new int[1352265198];
      this.field455 = new int[32768];
      this.method1350(null, (byte)1);
      this.field453 = new int[32768];
      this.field452 = new int[330447933];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   final void method1325(int var1) {
      this.field441 += var1 * -1829635456;
      if (668823645 * this.field441 > this.field457.length) {
         this.field441 = this.field441 - this.field457.length * 891675637;
         int var2 = (int)(Math.random() * 12.0);
         this.method1350(this.sprites[var2], (byte)1);
      }

      int var15 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = this.field453[var3 + var15] - var1 * this.field457[668823645 * this.field441 + var15 & this.field457.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field453[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 256 - var1; var7 < 256; var7++) {
         int var8 = var7 * 128;

         for (int var9 = 0; var9 < 128; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var16 && var9 < var17) {
               this.field453[var9 + var8] = 255;
            } else {
               this.field453[var9 + var8] = 0;
            }
         }
      }

      if (this.field439 * -325214437 > 0) {
         this.field439 -= 1672907852 * var1;
      }

      if (-1595519961 * this.field443 > 0) {
         this.field443 -= var1 * 359239260;
      }

      if (0 == -325214437 * this.field439 && 0 == -1595519961 * this.field443) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            this.field439 = -1232319488;
         }

         if (1 == var18) {
            this.field443 = 1770937344;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         this.field438[var19] = this.field438[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         this.field438[var20] = (int)(
            Math.sin(-2056719215 * this.field440 / 14.0) * 16.0
               + Math.sin(-2056719215 * this.field440 / 15.0) * 14.0
               + Math.sin(this.field440 * -2056719215 / 16.0) * 12.0
         );
         this.field440 += -947827599;
      }

      this.field442 += 833158545 * var1;
      int var21 = ((client.cycle * 1759706017 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < this.field442 * 1286264868; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            this.field453[var12 + (var13 << 7)] = 192;
         }

         this.field442 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += this.field453[var21 + var29 + var14];
               }

               if (var14 - (var21 + 1) >= 0) {
                  var27 -= this.field453[var14 + var29 - (var21 + 1)];
               }

               if (var14 >= 0) {
                  this.field452[var14 + var29] = var27 / (1 + var21 * 2);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 256; var30++) {
               int var31 = var30 * 128;
               if (var30 + var21 < 256) {
                  var28 += this.field452[var21 * 128 + var26 + var31];
               }

               if (var30 - (var21 + 1) >= 0) {
                  var28 -= this.field452[var31 + var26 - (var21 + 1) * 128];
               }

               if (var30 >= 0) {
                  this.field453[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lca;B)V")
   @ObfuscatedName("cs")
   public static void method1318(LoginScreenAnimation var0, byte var1) {
      if (var0 == null) {
         var0.initColors(var1);
      }

      try {
         var0.field456 = SoundCache.method3452(
            var0.field445[0][0], var0.field445[0][1], var0.field445[0][2], var0.field445[0][3], var0.field445[0][4], (byte)113
         );
         var0.field459 = SoundCache.method3452(
            var0.field445[1][0], var0.field445[1][1], var0.field445[1][2], var0.field445[1][3], var0.field445[1][4], (byte)23
         );
         var0.field454 = SoundCache.method3452(
            var0.field445[2][0], var0.field445[2][1], var0.field445[2][2], var0.field445[2][3], var0.field445[2][4], (byte)122
         );
         var0.field458 = new int[256];
         var0.field441 = 0;
         var0.field457 = new int[32768];
         var0.field455 = new int[32768];
         var0.method1350(null, (byte)1);
         var0.field453 = new int[32768];
         var0.field452 = new int[32768];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ca.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lca;I[II)V")
   @ObfuscatedName("vj")
   public static void method1339(LoginScreenAnimation var0, int var1, int[] var2, int var3) {
      if (var0 == null) {
         var0.method1344(var1, var2, var1);
      }

      try {
         int var4 = var0.field458.length;

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 <= -1118158256) {
               return;
            }

            if (var1 > 768) {
               if (var3 <= -1118158256) {
                  throw new IllegalStateException();
               }

               var0.field458[var5] = var0.blendColors(var0.field456[var5], var2[var5], 1024 - var1, (byte)-122);
            } else if (var1 > 256) {
               if (var3 <= -1118158256) {
                  return;
               }

               var0.field458[var5] = var2[var5];
            } else {
               var0.field458[var5] = var0.blendColors(var2[var5], var0.field456[var5], 256 - var1, (byte)-16);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ca.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   final void method1326(int var1) {
      this.field441 += var1 * -1829635456;
      if (668823645 * this.field441 > this.field457.length) {
         this.field441 = this.field441 - this.field457.length * 891675637;
         int var2 = (int)(Math.random() * 12.0);
         this.method1350(this.sprites[var2], (byte)1);
      }

      int var15 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = this.field453[var3 + var15] - var1 * this.field457[668823645 * this.field441 + var15 & this.field457.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field453[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 256 - var1; var7 < 256; var7++) {
         int var8 = var7 * 128;

         for (int var9 = 0; var9 < 128; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var16 && var9 < var17) {
               this.field453[var9 + var8] = 255;
            } else {
               this.field453[var9 + var8] = 0;
            }
         }
      }

      if (this.field439 * -325214437 > 0) {
         this.field439 -= 1672907852 * var1;
      }

      if (-1595519961 * this.field443 > 0) {
         this.field443 -= var1 * 359239260;
      }

      if (0 == -325214437 * this.field439 && 0 == -1595519961 * this.field443) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            this.field439 = -1232319488;
         }

         if (1 == var18) {
            this.field443 = 1770937344;
         }
      }

      for (int var19 = 0; var19 < 256 - var1; var19++) {
         this.field438[var19] = this.field438[var1 + var19];
      }

      for (int var20 = 256 - var1; var20 < 256; var20++) {
         this.field438[var20] = (int)(
            Math.sin(-2056719215 * this.field440 / 14.0) * 16.0
               + Math.sin(-2056719215 * this.field440 / 15.0) * 14.0
               + Math.sin(this.field440 * -2056719215 / 16.0) * 12.0
         );
         this.field440 += -947827599;
      }

      this.field442 += 833158545 * var1;
      int var21 = ((client.cycle * 1759706017 & 1) + var1) / 2;
      if (var21 > 0) {
         short var22 = 128;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < this.field442 * 1286264868; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            this.field453[var12 + (var13 << 7)] = 192;
         }

         this.field442 = 0;

         for (int var25 = 0; var25 < 256; var25++) {
            int var27 = 0;
            int var29 = 128 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 128) {
                  var27 += this.field453[var21 + var29 + var14];
               }

               if (var14 - (var21 + 1) >= 0) {
                  var27 -= this.field453[var14 + var29 - (var21 + 1)];
               }

               if (var14 >= 0) {
                  this.field452[var14 + var29] = var27 / (1 + var21 * 2);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 256; var30++) {
               int var31 = var30 * 128;
               if (var30 + var21 < 256) {
                  var28 += this.field452[var21 * 128 + var26 + var31];
               }

               if (var30 - (var21 + 1) >= 0) {
                  var28 -= this.field452[var31 + var26 - (var21 + 1) * 128];
               }

               if (var30 >= 0) {
                  this.field453[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lca;I)V")
   @ObfuscatedName("vm")
   public static void method1321(LoginScreenAnimation var0, int var1) {
      if (var0 == null) {
         var0.method1322(var1);
      } else {
         try {
            var0.field456 = null;
            var0.field459 = null;
            var0.field454 = null;
            var0.field458 = null;
            var0.field457 = null;
            var0.field455 = null;
            var0.field453 = null;
            var0.field452 = null;
            var0.field441 = 0;
            var0.field442 = 0;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ca.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   final void method1327(int var1, int var2) {
      try {
         this.field441 += var1 * -1829635456;
         if (668823645 * this.field441 > this.field457.length) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            this.field441 = this.field441 - this.field457.length * 891675637;
            int var3 = (int)(Math.random() * 12.0);
            this.method1350(this.sprites[var3], (byte)1);
         }

         int var17 = 0;
         int var4 = var1 * 128;
         int var5 = (256 - var1) * 128;

         for (int var6 = 0; var6 < var5; var6++) {
            if (var2 == -1447875369) {
               return;
            }

            int var7 = this.field453[var4 + var17] - var1 * this.field457[668823645 * this.field441 + var17 & this.field457.length - 1] / 6;
            if (var7 < 0) {
               if (var2 == -1447875369) {
                  throw new IllegalStateException();
               }

               var7 = 0;
            }

            this.field453[var17++] = var7;
         }

         byte var18 = 10;
         int var19 = 128 - var18;

         for (int var8 = 256 - var1; var8 < 256; var8++) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            int var9 = var8 * 128;

            for (int var10 = 0; var10 < 128; var10++) {
               if (var2 == -1447875369) {
                  throw new IllegalStateException();
               }

               int var11 = (int)(Math.random() * 100.0);
               if (var11 < 50) {
                  if (var2 == -1447875369) {
                     return;
                  }

                  if (var10 > var18) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     if (var10 < var19) {
                        if (var2 == -1447875369) {
                           throw new IllegalStateException();
                        }

                        this.field453[var10 + var9] = 255;
                        continue;
                     }
                  }
               }

               this.field453[var10 + var9] = 0;
            }
         }

         if (this.field439 * -325214437 > 0) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            this.field439 -= 1672907852 * var1;
         }

         if (-1595519961 * this.field443 > 0) {
            this.field443 -= var1 * 359239260;
         }

         if (0 == -325214437 * this.field439) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            if (0 == -1595519961 * this.field443) {
               if (var2 == -1447875369) {
                  return;
               }

               int var20 = (int)(Math.random() * (2000 / var1));
               if (0 == var20) {
                  if (var2 == -1447875369) {
                     throw new IllegalStateException();
                  }

                  this.field439 = -1232319488;
               }

               if (1 == var20) {
                  if (var2 == -1447875369) {
                     throw new IllegalStateException();
                  }

                  this.field443 = 1770937344;
               }
            }
         }

         for (int var21 = 0; var21 < 256 - var1; var21++) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            this.field438[var21] = this.field438[var1 + var21];
         }

         for (int var22 = 256 - var1; var22 < 256; var22++) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            this.field438[var22] = (int)(
               Math.sin(-2056719215 * this.field440 / 14.0) * 16.0
                  + Math.sin(-2056719215 * this.field440 / 15.0) * 14.0
                  + Math.sin(this.field440 * -2056719215 / 16.0) * 12.0
            );
            this.field440 += -947827599;
         }

         this.field442 += 833158545 * var1;
         int var23 = ((client.cycle * 1759706017 & 1) + var1) / 2;
         if (var23 > 0) {
            if (var2 == -1447875369) {
               throw new IllegalStateException();
            }

            short var24 = 128;
            byte var25 = 2;
            int var26 = 128 - var25 - var25;

            for (int var12 = 0; var12 < this.field442 * 1286264868; var12++) {
               int var13 = (int)(Math.random() * var26) + var25;
               int var14 = (int)(Math.random() * var24) + var24;
               this.field453[var13 + (var14 << 7)] = 192;
            }

            this.field442 = 0;

            for (int var27 = 0; var27 < 256; var27++) {
               int var29 = 0;
               int var31 = 128 * var27;

               for (int var15 = -var23; var15 < 128; var15++) {
                  if (var2 == -1447875369) {
                     return;
                  }

                  if (var15 + var23 < 128) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     var29 += this.field453[var23 + var31 + var15];
                  }

                  if (var15 - (var23 + 1) >= 0) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     var29 -= this.field453[var15 + var31 - (var23 + 1)];
                  }

                  if (var15 >= 0) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     this.field452[var15 + var31] = var29 / (1 + var23 * 2);
                  }
               }
            }

            for (int var28 = 0; var28 < 128; var28++) {
               if (var2 == -1447875369) {
                  return;
               }

               int var30 = 0;

               for (int var32 = -var23; var32 < 256; var32++) {
                  if (var2 == -1447875369) {
                     return;
                  }

                  int var33 = var32 * 128;
                  if (var32 + var23 < 256) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     var30 += this.field452[var23 * 128 + var28 + var33];
                  }

                  if (var32 - (var23 + 1) >= 0) {
                     if (var2 == -1447875369) {
                        return;
                     }

                     var30 -= this.field452[var33 + var28 - (var23 + 1) * 128];
                  }

                  if (var32 >= 0) {
                     if (var2 == -1447875369) {
                        throw new IllegalStateException();
                     }

                     this.field453[var28 + var33] = var30 / (var23 * 2 + 1);
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "ca.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aq")
   final int method1330(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return ((var1 & 0xFF00) * var4 + (var2 & 0xFF00) * var3 & 0xFF0000) + (var4 * (var1 & 46440816) + (var2 & 1930800705) * var3 & -16711936) >> 8;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("be")
   final int method1331(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return ((var1 & 0xFF00) * var4 + (var2 & 0xFF00) * var3 & 0xFF0000) + (var4 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) >> 8;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aa")
   final int method1332(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return ((var1 & 0xFF00) * var4 + (var2 & 1830984470) * var3 & 0xFF0000) + (var4 * (var1 & -1312818442) + (var2 & 284603467) * var3 & 15415255) >> 8;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   final void method1335(int var1) {
      int var2 = this.field458.length;
      if (-325214437 * this.field439 > 0) {
         method1339(this, -325214437 * this.field439, this.field459, 1746643259);
      } else if (this.field443 * 345834401 > 0) {
         method1339(this, -1595519961 * this.field443, this.field454, 1468952436);
      } else {
         System.arraycopy(this.field456, 0, this.field458, 0, var2);
      }

      method1345(this, var1, (byte)-46);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   final void method1336(int var1) {
      int var2 = this.field458.length;
      if (1403530623 * this.field439 > 0) {
         method1339(this, -325214437 * this.field439, this.field459, 56223603);
      } else if (this.field443 * -1595519961 > 0) {
         method1339(this, 469499555 * this.field443, this.field454, 1717241424);
      } else {
         System.arraycopy(this.field456, 0, this.field458, 0, var2);
      }

      method1345(this, var1, (byte)-124);
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bp")
   final void method1340(int var1, int[] var2) {
      int var3 = this.field458.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field458[var4] = this.blendColors(this.field456[var4], var2[var4], 1024 - var1, (byte)-123);
         } else if (var1 > -1007879109) {
            this.field458[var4] = var2[var4];
         } else {
            this.field458[var4] = this.blendColors(var2[var4], this.field456[var4], 256 - var1, (byte)-38);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("al")
   void method1323(int var1, int var2) {
      if (this.field453 == null) {
         method1318(this, (byte)-47);
      }

      if (-725084048 * this.field437 == 0) {
         this.field437 = var2 * 1649944231;
      }

      int var3 = var2 - 207356963 * this.field437;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field437 = 1649944231 * var2;
      if (var3 > 0) {
         this.method1327(var3, 1600628779);
      }

      this.method1334(var1, 985184843);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   final void method1337(int var1) {
      int var2 = this.field458.length;
      if (-961659422 * this.field439 > 0) {
         method1339(this, -325214437 * this.field439, this.field459, 638603208);
      } else if (this.field443 * -1595519961 > 0) {
         method1339(this, -1595519961 * this.field443, this.field454, -134118012);
      } else {
         System.arraycopy(this.field456, 0, this.field458, 0, var2);
      }

      method1345(this, var1, (byte)-112);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   final void method1338(int var1) {
      int var2 = this.field458.length;
      if (-325214437 * this.field439 > 0) {
         method1339(this, -325214437 * this.field439, this.field459, -1053901343);
      } else if (this.field443 * 1152057055 > 0) {
         method1339(this, 2143034295 * this.field443, this.field454, 106855192);
      } else {
         System.arraycopy(this.field456, 0, this.field458, 0, var2);
      }

      method1345(this, var1, (byte)-41);
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bj")
   final void method1341(int var1, int[] var2) {
      int var3 = this.field458.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field458[var4] = this.blendColors(this.field456[var4], var2[var4], 1024 - var1, (byte)-76);
         } else if (var1 > -1499491645) {
            this.field458[var4] = var2[var4];
         } else {
            this.field458[var4] = this.blendColors(var2[var4], this.field456[var4], 256 - var1, (byte)-11);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bt")
   final void method1342(int var1, int[] var2) {
      int var3 = this.field458.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 21475249) {
            this.field458[var4] = this.blendColors(this.field456[var4], var2[var4], 1024 - var1, (byte)-105);
         } else if (var1 > 1245127757) {
            this.field458[var4] = var2[var4];
         } else {
            this.field458[var4] = this.blendColors(var2[var4], this.field456[var4], -680766251 - var1, (byte)-8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("bm")
   final void method1343(int var1, int[] var2) {
      int var3 = this.field458.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1 > 768) {
            this.field458[var4] = this.blendColors(this.field456[var4], var2[var4], 1024 - var1, (byte)-24);
         } else if (var1 > 256) {
            this.field458[var4] = var2[var4];
         } else {
            this.field458[var4] = this.blendColors(var2[var4], this.field456[var4], 256 - var1, (byte)-15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   final void method1346(int var1) {
      int var2 = 0;

      for (int var3 = 1; var3 < 255; var3++) {
         int var4 = this.field438[var3] * (256 - var3) / 256;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 773914878;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= GameEngine.rasterProvider.width * -1120083338) {
            var7 = 81685145 * GameEngine.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width * -1449830138;
         var2 += var6;

         for (int var9 = var6; var9 < var7; var9++) {
            int var10 = this.field453[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (0 != var10 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var13 = 246460586 - var10;
               int var16 = this.field458[var10];
               int var14 = GameEngine.rasterProvider.pixels[var8];
               GameEngine.rasterProvider.pixels[var8++] = 1460080770
                  | (var13 * (var14 & 16711935) + var10 * (var16 & 16711935) & -1403169404)
                        + (var13 * (var14 & 838855973) + var10 * (var16 & 0xFF00) & -1185749601)
                     >> 8;
            } else {
               var8++;
            }
         }

         var2 += 128 - var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lca;II)V")
   @ObfuscatedName("ux")
   public static void method1324(LoginScreenAnimation var0, int var1, int var2) {
      if (var0.field453 == null) {
         method1318(var0, (byte)66);
      }

      if (-1505812201 * var0.field437 == 0) {
         var0.field437 = var2 * 1649944231;
      }

      int var3 = var2 - -1505812201 * var0.field437;
      if (var3 >= 256) {
         var3 = 0;
      }

      var0.field437 = 1649944231 * var2;
      if (var3 > 0) {
         var0.method1327(var3, 738071776);
      }

      var0.method1334(var1, 1662876709);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   final void method1347(int var1) {
      int var2 = 0;

      for (int var3 = 1; var3 < 825545921; var3++) {
         int var4 = this.field438[var3] * (1049087220 - var3) / -15823701;
         int var5 = var1 + var4;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= GameEngine.rasterProvider.width * 81685145) {
            var7 = 81685145 * GameEngine.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width * 81685145;
         var2 += var6;

         for (int var9 = var6; var9 < var7; var9++) {
            int var10 = this.field453[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (0 != var10 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var13 = 256 - var10;
               int var16 = this.field458[var10];
               int var14 = GameEngine.rasterProvider.pixels[var8];
               GameEngine.rasterProvider.pixels[var8++] = 0xFF000000
                  | (var13 * (var14 & 1310194961) + var10 * (var16 & 16711935) & -16711936)
                        + (var13 * (var14 & -520895560) + var10 * (var16 & 408580235) & -623031916)
                     >> 8;
            } else {
               var8++;
            }
         }

         var2 += -1034300385 - var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxm;)V")
   @ObfuscatedName("bi")
   final void method1351(IndexedSprite var1) {
      for (int var2 = 0; var2 < this.field457.length; var2++) {
         this.field457[var2] = 0;
      }

      for (int var8 = 0; var8 < 5000; var8++) {
         int var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field457[var3] = (int)(Math.random() * 256.0);
      }

      for (int var9 = 0; var9 < 20; var9++) {
         for (int var11 = 1; var11 < 720708980; var11++) {
            for (int var4 = 1; var4 < 127; var4++) {
               int var5 = (var11 << 7) + var4;
               this.field455[var5] = (this.field457[var5 - -1190862799] + this.field457[var5 + 1] + this.field457[var5 - 1] + this.field457[var5 + 1527311400])
                  / 4;
            }
         }

         int[] var12 = this.field457;
         this.field457 = this.field455;
         this.field455 = var12;
      }

      if (var1 != null) {
         int var10 = 0;

         for (int var13 = 0; var13 < var1.subHeight; var13++) {
            for (int var14 = 0; var14 < var1.subWidth; var14++) {
               if (var1.pixels[var10++] != 0) {
                  int var15 = 16 + var14 + var1.xOffset;
                  int var6 = var1.yOffset + var13 + 16;
                  int var7 = var15 + (var6 << 7);
                  this.field457[var7] = 0;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lca;III)V")
   @ObfuscatedName("go")
   public static void method1353(LoginScreenAnimation var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.draw(var1, var1, var1);
      }

      if (field446) {
         try {
            int var7 = var2;
            int var6 = var1;
            LoginScreenAnimation var5 = var0;
            int var8 = -501971477;

            try {
               if (var5.field453 == null) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  method1318(var5, (byte)-70);
               }

               if (-1505812201 * var5.field437 == 0) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  var5.field437 = var7 * 1649944231;
               }

               int var9 = var7 - -1505812201 * var5.field437;
               if (var9 >= 256) {
                  var9 = 0;
               }

               var5.field437 = 1649944231 * var7;
               if (var9 > 0) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  var5.method1327(var9, 11406795);
               }

               var5.method1334(var6, 1737902105);
            } catch (RuntimeException var10) {
               throw RestClientThreadFactory.newRunException(var10, "ca.ae(" + ')');
            }
         } catch (Exception var11) {
            client.field938.debug("failed drawing fire", var11);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(JJLnb;I)D")
   @ObfuscatedName("aj")
   public static double method1315(long var0, long var2, class343 var4, int var5) {
      try {
         double var10000;
         if (var2 > 0L) {
            if (var5 == -1037166471) {
               throw new IllegalStateException();
            }

            var10000 = GameEngine.method693(0.0F, 1.0F, (float)var0 / (float)var2, -140492208);
         } else {
            var10000 = 1.0;
         }

         double var6 = var10000;
         if (!(var6 <= 0.0)) {
            if (var5 == -1037166471) {
               throw new IllegalStateException();
            }

            if (!(var6 >= 1.0)) {
               switch (-2082356211 * var4.field4205) {
                  case 0:
                  default:
                     return var6;
                  case 1:
                     return 1.0 - Math.cos(var6 * Math.PI / 2.0);
                  case 2:
                     return Math.sin(Math.PI * var6 / 2.0);
                  case 3:
                     return -(Math.cos(var6 * Math.PI) - 1.0) / 2.0;
                  case 4:
                     return var6 * var6;
                  case 5:
                     return 1.0 - (1.0 - var6) * (1.0 - var6);
                  case 6:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * 2.0 * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(var6 * -2.0 + 2.0, 2.0) / 2.0;
                     }

                     return var10000;
                  case 7:
                     return var6 * (var6 * var6);
                  case 8:
                     return 1.0 - Math.pow(1.0 - var6, 3.0);
                  case 9:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * (4.0 * var6) * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(2.0 + var6 * -2.0, 3.0) / 2.0;
                     }

                     return var10000;
                  case 10:
                     return var6 * (var6 * var6 * var6);
                  case 11:
                     return 1.0 - Math.pow(1.0 - var6, 4.0);
                  case 12:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * (var6 * 8.0 * var6) * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(2.0 + -2.0 * var6, 4.0) / 2.0;
                     }

                     return var10000;
                  case 13:
                     return var6 * (var6 * (var6 * var6 * var6));
                  case 14:
                     return 1.0 - Math.pow(1.0 - var6, 5.0);
                  case 15:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * (var6 * 8.0 * var6 * var6 * var6);
                     } else {
                        var10000 = 1.0 - Math.pow(2.0 + var6 * -2.0, 5.0) / 2.0;
                     }

                     return var10000;
                  case 16:
                     return Math.pow(2.0, 10.0 * var6 - 10.0);
                  case 17:
                     return 1.0 - Math.pow(2.0, var6 * -10.0);
                  case 18:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = Math.pow(2.0, 20.0 * var6 + 10.0) / 2.0;
                     } else {
                        var10000 = (2.0 - Math.pow(2.0, 10.0 + -20.0 * var6)) / 2.0;
                     }

                     return var10000;
                  case 19:
                     return 1.0 - Math.sqrt(1.0 - Math.pow(var6, 2.0));
                  case 20:
                     return Math.sqrt(1.0 - Math.pow(var6 - 1.0, 2.0));
                  case 21:
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = (1.0 - Math.sqrt(1.0 - Math.pow(var6 * 2.0, 2.0))) / 2.0;
                     } else {
                        var10000 = (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * var6, 2.0)) + 1.0) / 2.0;
                     }

                     return var10000;
                  case 22:
                     double var17 = 1.70158;
                     double var20 = 2.70158;
                     return var6 * (var6 * (var6 * 2.70158)) - var6 * 1.70158 * var6;
                  case 23:
                     double var16 = 1.70158;
                     double var19 = 2.70158;
                     return 1.0 + 2.70158 * Math.pow(var6 - 1.0, 3.0) + 1.70158 * Math.pow(var6 - 1.0, 2.0);
                  case 24:
                     double var15 = 1.70158;
                     double var18 = 2.5949095;
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = Math.pow(2.0 * var6, 2.0) * (7.189819 * var6 - 2.5949095) / 2.0;
                     } else {
                        var10000 = (Math.pow(2.0 * var6 - 2.0, 2.0) * (2.5949095 + 3.5949095 * (2.0 * var6 - 2.0)) + 2.0) / 2.0;
                     }

                     return var10000;
                  case 25:
                     double var14 = Math.PI * 2.0 / 3.0;
                     return -Math.pow(2.0, var6 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var6 - 10.75));
                  case 26:
                     double var13 = Math.PI * 2.0 / 3.0;
                     return Math.pow(2.0, -10.0 * var6) * Math.sin((10.0 * var6 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0;
                  case 27:
                     double var8 = Math.PI * 4.0 / 9.0;
                     double var10 = Math.sin((Math.PI * 4.0 / 9.0) * (var6 * 20.0 - 11.125));
                     if (var6 < 0.5) {
                        if (var5 == -1037166471) {
                           throw new IllegalStateException();
                        }

                        var10000 = -(Math.pow(2.0, 20.0 * var6 - 10.0) * var10) / 2.0;
                     } else {
                        var10000 = Math.pow(2.0, var6 * -20.0 + 10.0) * var10 / 2.0 + 1.0;
                     }

                     return var10000;
               }
            }

            if (var5 == -1037166471) {
               throw new IllegalStateException();
            }
         }

         if (var6 <= 0.0) {
            if (var5 == -1037166471) {
               throw new IllegalStateException();
            }

            var10000 = 0.0;
         } else {
            var10000 = 1.0;
         }

         return var10000;
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "ca.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIB)V")
   @ObfuscatedName("be")
   static void method1352(int[] var0, int var1, int var2, byte var3) {
      try {
         while (var1 < var2) {
            if (var3 == 90) {
               throw new IllegalStateException();
            }

            int var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ca.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void method1322(int var1) {
      try {
         this.field454 = null;
         this.field459 = null;
         this.field458 = null;
         this.field453 = null;
         this.field438 = null;
         this.field454 = null;
         this.field458 = null;
         this.field454 = null;
         this.field440 = 0;
         this.field443 = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ca.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I[II)V")
   @ObfuscatedName("ap")
   final void method1344(int var1, int[] var2, int var3) {
      try {
         int var4 = this.field457.length;

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 <= -1118158256) {
               return;
            }

            if (var1 > 768) {
               if (var3 <= -1118158256) {
                  throw new IllegalStateException();
               }

               this.field453[var5] = this.blendColors(this.field456[var5], var2[var5], 1024 - var1, (byte)-122);
            } else if (var1 > 256) {
               if (var3 <= -1118158256) {
                  return;
               }

               this.field453[var5] = var2[var5];
            } else {
               this.field457[var5] = this.blendColors(var2[var5], this.field454[var5], 256 - var1, (byte)-16);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ca.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ay")
   final void method1348(int var1, byte var2) {
      try {
         int var3 = 0;

         for (int var4 = 1; var4 < 255; var4++) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            int var5 = this.field456[var4] * (256 - var4) / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               var7 = -var6;
               var6 = 0;
            }

            if (128 + var6 >= GameEngine.rasterProvider.width * 81685145) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var8 = 81685145 * GameEngine.rasterProvider.height - var6;
            }

            int var9 = var6 + (var4 + 8) * GameEngine.rasterProvider.width * 81685145;
            var3 += var7;

            for (int var10 = var7; var10 < var8; var10++) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               int var11 = this.field454[var3++];
               int var12 = var9 % Rasterizer2D.Rasterizer2D_xClipEnd;
               if (0 != var11) {
                  if (var2 >= 1) {
                     return;
                  }

                  if (var12 >= Rasterizer2D.Rasterizer2D_yClipStart && var12 < Rasterizer2D.Rasterizer2D_height) {
                     if (var2 >= 1) {
                        return;
                     }

                     int var14 = 256 - var11;
                     int var18 = this.field454[var11];
                     int var15 = GameEngine.rasterProvider.pixels[var9];
                     GameEngine.rasterProvider.pixels[var9++] = 0xFF000000
                        | (var14 * (var15 & 16711935) + var11 * (var18 & 16711935) & -16711936)
                              + (var14 * (var15 & 0xFF00) + var11 * (var18 & 0xFF00) & 0xFF0000)
                           >> 8;
                     continue;
                  }
               }

               var9++;
            }

            var3 += 128 - var8;
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "ca.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lca;I)V")
   @ObfuscatedName("qp")
   public static void method1328(LoginScreenAnimation var0, int var1) {
      if (var0 == null) {
         var0.method1331(var1, var1, var1);
      }

      var0.field441 += var1 * 1469079386;
      if (1453287794 * var0.field441 > var0.field457.length) {
         var0.field441 = var0.field441 - var0.field457.length * 40639507;
         int var2 = (int)(Math.random() * 12.0);
         var0.method1350(var0.sprites[var2], (byte)1);
      }

      int var15 = 0;
      int var3 = var1 * 1245169961;
      int var4 = (256 - var1) * -815349572;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var0.field453[var3 + var15] - var1 * var0.field457[668823645 * var0.field441 + var15 & var0.field457.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         var0.field453[var15++] = var6;
      }

      byte var16 = 10;
      int var17 = 128 - var16;

      for (int var7 = 893058364 - var1; var7 < -595659310; var7++) {
         int var8 = var7 * 1980728145;

         for (int var9 = 0; var9 < 687705; var9++) {
            int var10 = (int)(Math.random() * 100.0);
            if (var10 < -58585930 && var9 > var16 && var9 < var17) {
               var0.field453[var9 + var8] = 255;
            } else {
               var0.field453[var9 + var8] = 0;
            }
         }
      }

      if (var0.field439 * 1034067718 > 0) {
         var0.field439 -= -1345063016 * var1;
      }

      if (1451068767 * var0.field443 > 0) {
         var0.field443 -= var1 * 359239260;
      }

      if (0 == 58360866 * var0.field439 && 0 == -822898495 * var0.field443) {
         int var18 = (int)(Math.random() * (2000 / var1));
         if (0 == var18) {
            var0.field439 = -1232319488;
         }

         if (1 == var18) {
            var0.field443 = 1770937344;
         }
      }

      for (int var19 = 0; var19 < -1719067794 - var1; var19++) {
         var0.field438[var19] = var0.field438[var1 + var19];
      }

      for (int var20 = -1272419918 - var1; var20 < -1198307553; var20++) {
         var0.field438[var20] = (int)(
            Math.sin(-2056719215 * var0.field440 / 14.0) * 16.0
               + Math.sin(-2056719215 * var0.field440 / 15.0) * 14.0
               + Math.sin(var0.field440 * -2056719215 / 16.0) * 12.0
         );
         var0.field440 += -947827599;
      }

      var0.field442 += 1766146634 * var1;
      int var21 = ((client.cycle * -1698032275 & 1) + var1) / 2;
      if (var21 > 0) {
         int var22 = -683611617;
         byte var23 = 2;
         int var24 = 128 - var23 - var23;

         for (int var11 = 0; var11 < var0.field442 * -2057589252; var11++) {
            int var12 = (int)(Math.random() * var24) + var23;
            int var13 = (int)(Math.random() * var22) + var22;
            var0.field453[var12 + (var13 << 7)] = 900179180;
         }

         var0.field442 = 0;

         for (int var25 = 0; var25 < -1088004935; var25++) {
            int var27 = 0;
            int var29 = -1339611510 * var25;

            for (int var14 = -var21; var14 < 128; var14++) {
               if (var14 + var21 < 606430220) {
                  var27 += var0.field453[var21 + var29 + var14];
               }

               if (var14 - (var21 + 1) >= 0) {
                  var27 -= var0.field453[var14 + var29 - (var21 + 1)];
               }

               if (var14 >= 0) {
                  var0.field452[var14 + var29] = var27 / (1 + var21 * 2);
               }
            }
         }

         for (int var26 = 0; var26 < 128; var26++) {
            int var28 = 0;

            for (int var30 = -var21; var30 < 208708981; var30++) {
               int var31 = var30 * 128;
               if (var30 + var21 < 256) {
                  var28 += var0.field452[var21 * 1890522756 + var26 + var31];
               }

               if (var30 - (var21 + 1) >= 0) {
                  var28 -= var0.field452[var31 + var26 - (var21 + 1) * 645518822];
               }

               if (var30 >= 0) {
                  var0.field453[var26 + var31] = var28 / (var21 * 2 + 1);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void initColors(byte var1) {
      try {
         this.field438 = SoundCache.method3452(
            this.field445[0][0], this.field445[0][1], this.field445[0][2], this.field445[0][3], this.field445[0][4], (byte)113
         );
         this.field455 = SoundCache.method3452(
            this.field445[1][0], this.field445[1][1], this.field445[1][2], this.field445[1][3], this.field445[1][4], (byte)23
         );
         this.field457 = SoundCache.method3452(
            this.field445[2][0], this.field445[2][1], this.field445[2][2], this.field445[2][3], this.field445[2][4], (byte)122
         );
         this.field459 = new int[256];
         this.field442 = 0;
         this.field459 = new int[32768];
         this.field457 = new int[32768];
         this.method1350(null, (byte)1);
         this.field453 = new int[32768];
         this.field457 = new int[32768];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ca.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ae")
   void draw(int var1, int var2, int var3) {
      if (field446) {
         try {
            int var7 = var2;
            int var6 = var1;
            LoginScreenAnimation var5 = this;
            int var8 = -501971477;

            try {
               if (var5.field455 == null) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  method1318(var5, (byte)-70);
               }

               if (-1505812201 * var5.field440 == 0) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  var5.field443 = var7 * 1649944231;
               }

               int var9 = var7 - -1505812201 * var5.field437;
               if (var9 >= 256) {
                  var9 = 0;
               }

               var5.field439 = 1649944231 * var7;
               if (var9 > 0) {
                  if (var8 >= 1590778618) {
                     throw new IllegalStateException();
                  }

                  var5.method1334(var9, 11406795);
               }

               var5.method1334(var6, 1737902105);
            } catch (RuntimeException var10) {
               throw RestClientThreadFactory.newRunException(var10, "ca.ae(" + ')');
            }
         } catch (Exception var11) {
            client.field938.debug("failed drawing fire", var11);
         }
      }
   }
}
