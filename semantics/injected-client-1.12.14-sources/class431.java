import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qx")
public class class431 {
   @ObfuscatedSignature(descriptor = "Lrl;")
   @ObfuscatedName("aj")
   Bounds bounds;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5459 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5458 = 6;
   @ObfuscatedName("an")
   static int[] field5462;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final float field5457 = 3.0F;
   @ObfuscatedName("ls")
   static String authServiceBaseUrl;
   @ObfuscatedName("ak")
   int[] field5453;
   @ObfuscatedName("aw")
   int[] field5456;
   @ObfuscatedName("ae")
   final HashMap spriteMap = new HashMap();
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field5460 = 1003;
   @ObfuscatedName("ap")
   int field5455;

   @ObfuscatedSignature(descriptor = "(IILxt;F)V")
   @ObfuscatedName("al")
   public final void method9218(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method9205(var5, -1024986007);
      int var7 = 1 + var5 * 2;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      Bounds.method9503(this.bounds, var7, var7, (short)16890);
      System.nanoTime();

      for (int var10 = 0; var10 < 707170028 * this.field5455; var10++) {
         int var11 = this.field5453[var10];
         int var12 = this.field5456[var10];
         int var13 = (int)((var11 - var1) * var4) - var5;
         int var14 = (int)(var3.subHeight - var4 * (var12 - var2)) - var5;
         Bounds.method9496(this.bounds, var13, var14, 1101244774);
         Bounds.method9515(this.bounds, var8, var9, -1946460441);
         this.method9221(var6, var3, var9, -1301073611);
      }

      System.nanoTime();
      System.nanoTime();

      for (int var15 = 0; var15 < var3.pixels.length; var15++) {
         if (var3.pixels[var15] == 0) {
            var3.pixels[var15] = -1263961993;
         } else {
            int var16 = (557308239 + var3.pixels[var15] - 1) / 256;
            if (var16 <= 0) {
               var3.pixels[var15] = -16777216;
            } else {
               if (var16 > field5462.length) {
                  var16 = field5462.length;
               }

               int var17 = field5462[var16 - 1];
               var3.pixels[var15] = -912696966 | var17;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedSignature(descriptor = "(Lqx;IB)V")
   @ObfuscatedName("vo")
   public static void method9199(class431 var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method9204(var1, var2);
      } else {
         try {
            int var3 = var1 * 2 + 1;
            double[] var4 = class320.method7359(0.0, var1 / 3.0F, var1, -1773956998);
            double var5 = var4[var1] * var4[var1];
            int[] var7 = new int[var3 * var3];
            boolean var8 = false;

            for (int var9 = 0; var9 < var3; var9++) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               for (int var10 = 0; var10 < var3; var10++) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  int var11 = var7[var3 * var9 + var10] = (int)(var4[var9] * var4[var10] / var5 * 256.0);
                  if (!var8) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (var11 > 0) {
                        var8 = true;
                     }
                  }
               }
            }

            SpritePixels var13 = new SpritePixels(var7, var3, var3);
            var0.spriteMap.put(var1, var13);
         } catch (RuntimeException var12) {
            throw RestClientThreadFactory.newRunException(var12, "qx.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lxt;Lrl;I)V")
   @ObfuscatedName("aj")
   void method9221(SpritePixels var1, SpritePixels var2, Bounds var3, int var4) {
      try {
         if (-434199641 * var3.lowX != 0) {
            if (var4 >= -1089050480) {
               throw new IllegalStateException();
            }

            if (var3.lowY * 682845965 != 0) {
               int var5 = 0;
               int var6 = 0;
               if (-316755897 * var3.highY == 0) {
                  if (var4 >= -1089050480) {
                     throw new IllegalStateException();
                  }

                  var5 = var1.subWidth - -434199641 * var3.lowX;
               }

               if (-268027987 * var3.highX == 0) {
                  var6 = var1.subHeight - var3.lowY * 682845965;
               }

               int var7 = var5 + var1.subWidth * var6;
               int var8 = var3.highX * -268027987 * var2.subWidth + var3.highY * -316755897;

               for (int var9 = 0; var9 < 682845965 * var3.lowY; var9++) {
                  if (var4 >= -1089050480) {
                     throw new IllegalStateException();
                  }

                  for (int var10 = 0; var10 < -434199641 * var3.lowX; var10++) {
                     if (var4 >= -1089050480) {
                        throw new IllegalStateException();
                     }

                     int var10001 = var8++;
                     var2.pixels[var10001] = var2.pixels[var10001] + var1.pixels[var7++];
                  }

                  var7 += var1.subWidth - var3.lowX * -434199641;
                  var8 += var2.subWidth - -434199641 * var3.lowX;
               }

               return;
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "qx.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lxt;")
   @ObfuscatedName("at")
   SpritePixels method9205(int var1, int var2) {
      try {
         if (!this.spriteMap.containsKey(var1)) {
            method9199(this, var1, (byte)105);
         }

         return (SpritePixels)this.spriteMap.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qx.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;II)V")
   @ObfuscatedName("wk")
   public static void method9211(class431 var0, int var1, int var2) {
      if (1387637636 * var0.field5455 < var0.field5453.length) {
         var0.field5453[-1261959677 * var0.field5455] = var1;
         var0.field5456[-1261959677 * var0.field5455] = var2;
         var0.field5455 += -59450617;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   public final void method9212(int var1, int var2, int var3) {
      try {
         if (-1261959677 * this.field5455 >= this.field5453.length) {
            if (var3 != -183280906) {
               throw new IllegalStateException();
            }
         } else {
            this.field5453[-1261959677 * this.field5455] = var1;
            this.field5456[-1261959677 * this.field5455] = var2;
            this.field5455 += -1753656149;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qx.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;I)V")
   @ObfuscatedName("un")
   public static void method9200(class431 var0, int var1) {
      if (var0 == null) {
         var0.method9216();
      }

      int var2 = var1 * 2 + 1;
      double[] var3 = class320.method7359(0.0, var1 / 3.0F, var1, -1954601475);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var2; var9++) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var8] * var3[var9] / var4 * 256.0);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      var0.spriteMap.put(var1, var11);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   public final void method9215(int var1) {
      try {
         this.field5455 = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qx.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public final void method9216() {
      this.field5455 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;I)Lxt;")
   @ObfuscatedName("pt")
   public static SpritePixels method9206(class431 var0, int var1) {
      if (var0 == null) {
         var0.method9201(var1);
      }

      if (!var0.spriteMap.containsKey(var1)) {
         method9199(var0, var1, (byte)88);
      }

      return (SpritePixels)var0.spriteMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method9201(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class320.method7359(0.0, var1 / 3.0F, var1, -1626524685);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var2; var9++) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var8] * var3[var9] / var4 * 256.0);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      this.spriteMap.put(var1, var11);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void method9202(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class320.method7359(0.0, var1 / 3.0F, var1, 128309594);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var2; var9++) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var8] * var3[var9] / var4 * 256.0);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      this.spriteMap.put(var1, var11);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void method9203(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class320.method7359(0.0, var1 / 3.0F, var1, -35540823);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for (int var8 = 0; var8 < var2; var8++) {
         for (int var9 = 0; var9 < var2; var9++) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var8] * var3[var9] / var4 * 256.0);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      this.spriteMap.put(var1, var11);
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ai")
   SpritePixels method9207(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         method9199(this, var1, (byte)92);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;II)V")
   @ObfuscatedName("zn")
   public static void method9213(class431 var0, int var1, int var2) {
      if (-1261959677 * var0.field5455 < var0.field5453.length) {
         var0.field5453[-1261959677 * var0.field5455] = var1;
         var0.field5456[-1261959677 * var0.field5455] = var2;
         var0.field5455 += -1753656149;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("az")
   SpritePixels method9208(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         method9199(this, var1, (byte)54);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;I)Lxt;")
   @ObfuscatedName("xr")
   public static SpritePixels method9209(class431 var0, int var1) {
      if (!var0.spriteMap.containsKey(var1)) {
         method9199(var0, var1, (byte)71);
      }

      return (SpritePixels)var0.spriteMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("jg")
   static final void method9226(int var0, int var1, byte var2) {
      try {
         if (client.hintArrow.method8736(1945711579) != 4) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            WorldEntity var3 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)HintArrow.method8739(client.hintArrow, 1740891139));
            if (null == var3) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }
            } else {
               int var4 = var3.worldView.sizeX * -174152128;
               int var5 = var3.worldView.sizeY * 730485696;
               classFR.method4051(var3.worldView, var4, var5, client.hintArrow.method8757(-1215892414) * 2, 0, -1352432588);
               if (-1259541623 * client.viewportTempX > -1) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (client.cycle * 1759706017 % 20 < 10) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     SceneTilePaint.headIconHintSprites[0]
                        .method12650(-1259541623 * client.viewportTempX + var0 - 12, var1 + -604800983 * client.viewportTempY - 28);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qx.jg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public final void method9217() {
      this.field5455 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   public final void method9214(int var1, int var2) {
      if (-1261959677 * this.field5455 < this.field5453.length) {
         this.field5453[-1261959677 * this.field5455] = var1;
         this.field5456[-1261959677 * this.field5455] = var2;
         this.field5455 += -1753656149;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ad")
   SpritePixels method9210(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         method9199(this, var1, (byte)117);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   public class431() {
      this.bounds = new Bounds(0, 0);
      this.field5453 = new int[2048];
      this.field5456 = new int[2048];
      this.field5455 = 0;
      field5462 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      for (byte var3 = 12; var1 < 16; var2 -= var3) {
         int var4 = classFM.method4025(var2 / 360.0F, 0.9999F, 0.075F + 0.425F * var1 / 16.0F);
         field5462[var1] = var4;
         var1++;
      }

      var2 = 48;

      for (int var7 = var2 / 6; var1 < field5462.length; var2 -= var7) {
         int var8 = var1 * 2;

         for (int var5 = classFM.method4025(var2 / 360.0F, 0.9999F, 0.5); var1 < var8 && var1 < field5462.length; var1++) {
            field5462[var1] = var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxt;F)V")
   @ObfuscatedName("af")
   public final void method9219(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method9205(var5, -1218052990);
      int var7 = 1 + var5 * 2;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      Bounds.method9503(this.bounds, var7, var7, (short)12408);
      System.nanoTime();

      for (int var10 = 0; var10 < -1261959677 * this.field5455; var10++) {
         int var11 = this.field5453[var10];
         int var12 = this.field5456[var10];
         int var13 = (int)((var11 - var1) * var4) - var5;
         int var14 = (int)(var3.subHeight - var4 * (var12 - var2)) - var5;
         Bounds.method9496(this.bounds, var13, var14, 1101244774);
         Bounds.method9515(this.bounds, var8, var9, 916258650);
         this.method9221(var6, var3, var9, -1609807633);
      }

      System.nanoTime();
      System.nanoTime();

      for (int var15 = 0; var15 < var3.pixels.length; var15++) {
         if (var3.pixels[var15] == 0) {
            var3.pixels[var15] = -16777216;
         } else {
            int var16 = (64 + var3.pixels[var15] - 1) / 256;
            if (var16 <= 0) {
               var3.pixels[var15] = -16777216;
            } else {
               if (var16 > field5462.length) {
                  var16 = field5462.length;
               }

               int var17 = field5462[var16 - 1];
               var3.pixels[var15] = 0xFF000000 | var17;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lxt;Lrl;)V")
   @ObfuscatedName("am")
   void method9222(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (-434199641 * var3.lowX != 0 && var3.lowY * 682845965 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-316755897 * var3.highY == 0) {
            var4 = var1.subWidth - -434199641 * var3.lowX;
         }

         if (-268027987 * var3.highX == 0) {
            var5 = var1.subHeight - var3.lowY * 682845965;
         }

         int var6 = var4 + var1.subWidth * var5;
         int var7 = var3.highX * -268027987 * var2.subWidth + var3.highY * -316755897;

         for (int var8 = 0; var8 < 682845965 * var3.lowY; var8++) {
            for (int var9 = 0; var9 < -434199641 * var3.lowX; var9++) {
               int var10001 = var7++;
               var2.pixels[var10001] = var2.pixels[var10001] + var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.lowX * -434199641;
            var7 += var2.subWidth - -434199641 * var3.lowX;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lxt;Lrl;)V")
   @ObfuscatedName("ao")
   void method9223(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (-434199641 * var3.lowX != 0 && var3.lowY * 682845965 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-316755897 * var3.highY == 0) {
            var4 = var1.subWidth - -434199641 * var3.lowX;
         }

         if (-268027987 * var3.highX == 0) {
            var5 = var1.subHeight - var3.lowY * 682845965;
         }

         int var6 = var4 + var1.subWidth * var5;
         int var7 = var3.highX * -268027987 * var2.subWidth + var3.highY * -316755897;

         for (int var8 = 0; var8 < 682845965 * var3.lowY; var8++) {
            for (int var9 = 0; var9 < -434199641 * var3.lowX; var9++) {
               int var10001 = var7++;
               var2.pixels[var10001] = var2.pixels[var10001] + var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.lowX * -434199641;
            var7 += var2.subWidth - -434199641 * var3.lowX;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lxt;Lrl;)V")
   @ObfuscatedName("aa")
   void method9224(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (-434199641 * var3.lowX != 0 && var3.lowY * 682845965 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-316755897 * var3.highY == 0) {
            var4 = var1.subWidth - -434199641 * var3.lowX;
         }

         if (-268027987 * var3.highX == 0) {
            var5 = var1.subHeight - var3.lowY * 682845965;
         }

         int var6 = var4 + var1.subWidth * var5;
         int var7 = var3.highX * -268027987 * var2.subWidth + var3.highY * -316755897;

         for (int var8 = 0; var8 < 682845965 * var3.lowY; var8++) {
            for (int var9 = 0; var9 < -434199641 * var3.lowX; var9++) {
               int var10001 = var7++;
               var2.pixels[var10001] = var2.pixels[var10001] + var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.lowX * -434199641;
            var7 += var2.subWidth - -434199641 * var3.lowX;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BILjava/lang/CharSequence;I)I")
   @ObfuscatedName("at")
   public static int method9198(byte[] var0, int var1, CharSequence var2, int var3) {
      try {
         int var4 = var2.length();
         int var5 = var1;

         for (int var6 = 0; var6 < var4; var6++) {
            char var7 = var2.charAt(var6);
            if (var7 <= 127) {
               if (var3 >= -1992767109) {
                  throw new IllegalStateException();
               }

               var0[var5++] = (byte)var7;
            } else if (var7 <= 2047) {
               if (var3 >= -1992767109) {
                  throw new IllegalStateException();
               }

               var0[var5++] = (byte)(192 | var7 >> 6);
               var0[var5++] = (byte)(128 | var7 & '?');
            } else {
               var0[var5++] = (byte)(224 | var7 >> '\f');
               var0[var5++] = (byte)(128 | var7 >> 6 & 63);
               var0[var5++] = (byte)(128 | var7 & '?');
            }
         }

         return var5 - var1;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "qx.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bk")
   static int method9225(int var0, Script var1, boolean var2, int var3) {
      try {
         if (3100 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               String var23 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class356.addGameMessage(0, "", var23, 252170032);
               return 1;
            }
         } else if (3101 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               CameraViewMode.performPlayerAnimation(
                  class330.localPlayer,
                  Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
                  -40656488
               );
               return 1;
            }
         } else if (var0 == 3103) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               if (!Interpreter.field338) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  Interpreter.field345 = true;
               }

               return 1;
            }
         } else if (3104 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               String var22 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var30 = 0;
               if (ViewportMouse.isNumber(var22, -579982735)) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var30 = Message.method1204(var22, (byte)-102);
               }

               PacketBufferNode var33 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3861, client.packetWriter.isaacCipher, -1514180576);
               var33.packetBuffer.writeInt(var30, 2038573292);
               PacketWriter.method3330(client.packetWriter, var33, -1771370198);
               return 1;
            }
         } else if (var0 == 3105) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               PacketBufferNode var29 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3890, client.packetWriter.isaacCipher, -1427797355);
               var29.packetBuffer.writeByte(var21.length() + 1, (short)-6145);
               var29.packetBuffer.writeStringCp1252NullTerminated(var21, 998990159);
               PacketWriter.method3330(client.packetWriter, var29, -1771370198);
               return 1;
            }
         } else if (3106 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               String var20 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               PacketBufferNode var28 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3937, client.packetWriter.isaacCipher, -1738061589);
               var28.packetBuffer.writeByte(var20.length() + 1, (short)-1235);
               var28.packetBuffer.writeStringCp1252NullTerminated(var20, 998990159);
               PacketWriter.method3330(client.packetWriter, var28, -1771370198);
               return 1;
            }
         } else if (var0 == 3107) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               String var27 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               ItemLayer.method5391(var19, var27, 1697542444);
               return 1;
            }
         } else if (3108 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var18 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var26 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               int var32 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               Widget var34 = class226.widgetDefinition.method7953(var32, -1860076420);
               class141.clickWidget(var34, var18, var26, 775423246);
               return 1;
            }
         } else if (var0 == 3109) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var17 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var25 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               Widget var47;
               if (var2) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var47 = UserComparator3.scriptDotWidget;
               } else {
                  var47 = class222.scriptActiveWidget;
               }

               Widget var31 = var47;
               class141.clickWidget(var31, var17, var25, 26495618);
               return 1;
            }
         } else if (var0 == 3110) {
            boolean var46;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= -2027878593) {
                  throw new IllegalStateException();
               }

               var46 = true;
            } else {
               var46 = false;
            }

            UrlRequest.mouseCam = var46;
            return 1;
         } else if (3111 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int[] var45 = Interpreter.Interpreter_intStack;
               int var51 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var54;
               if (class468.clientPreferences.isRoofsHidden(1945121145)) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var54 = 1;
               } else {
                  var54 = 0;
               }

               var45[var51] = var54;
               return 1;
            }
         } else if (var0 == 3112) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               ClientPreferences var44 = class468.clientPreferences;
               boolean var50;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var50 = true;
               } else {
                  var50 = false;
               }

               var44.updateRoofsHidden(var50, (short)22284);
               return 1;
            }
         } else if (var0 == 3113) {
            String var16 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class408.Interpreter_intStackSize -= -1793120611;
            class558.openURL(var16, (short)5044);
            return 1;
         } else if (var0 == 3115) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var15 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               PacketBufferNode var24 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3863, client.packetWriter.isaacCipher, -1850598324);
               var24.packetBuffer.writeShort(var15, -1370639784);
               PacketWriter.method3330(client.packetWriter, var24, -1771370198);
               return 1;
            }
         } else if (var0 == 3116) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var5 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               String var6 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1];
               if (var5.length() > 500) {
                  return 1;
               } else if (var6.length() > 500) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  } else {
                     return 1;
                  }
               } else {
                  PacketBufferNode var7 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3869, client.packetWriter.isaacCipher, -1800269232);
                  var7.packetBuffer
                     .writeShort(
                        1 + AccessFile.stringCp1252NullTerminatedByteSize(var5, -1650063212) + AccessFile.stringCp1252NullTerminatedByteSize(var6, 23642523),
                        -1241814183
                     );
                  var7.packetBuffer.writeStringCp1252NullTerminated(var5, 998990159);
                  Buffer.method12113(var7.packetBuffer, var14, (short)-15686);
                  var7.packetBuffer.writeStringCp1252NullTerminated(var6, 998990159);
                  PacketWriter.method3330(client.packetWriter, var7, -1771370198);
                  return 1;
               }
            }
         } else if (var0 == 3117) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (var0 == 3118) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               boolean var43;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var43 = true;
               } else {
                  var43 = false;
               }

               client.showMouseOverText = var43;
               return 1;
            }
         } else if (3119 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               boolean var42;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var42 = true;
               } else {
                  var42 = false;
               }

               client.renderSelf = var42;
               return 1;
            }
         } else if (3120 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  client.drawPlayerNames = -1545992877 * (-1459845413 * client.drawPlayerNames | 1);
               } else {
                  client.drawPlayerNames = -1545992877 * (client.drawPlayerNames * -1459845413 & -2);
               }

               return 1;
            }
         } else if (var0 == 3121) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  client.drawPlayerNames = (-1459845413 * client.drawPlayerNames | 2) * -1545992877;
               } else {
                  client.drawPlayerNames = -1545992877 * (-1459845413 * client.drawPlayerNames & -3);
               }

               return 1;
            }
         } else if (var0 == 3122) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  client.drawPlayerNames = -1545992877 * (-1459845413 * client.drawPlayerNames | 4);
               } else {
                  client.drawPlayerNames = -1545992877 * (client.drawPlayerNames * -1459845413 & -5);
               }

               return 1;
            }
         } else if (3123 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  client.drawPlayerNames = (client.drawPlayerNames * -1459845413 | 8) * -1545992877;
               } else {
                  client.drawPlayerNames = -1545992877 * (client.drawPlayerNames * -1459845413 & -9);
               }

               return 1;
            }
         } else if (3124 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.drawPlayerNames = 0;
               return 1;
            }
         } else if (3125 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               boolean var41;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var41 = true;
               } else {
                  var41 = false;
               }

               client.showMouseCross = var41;
               return 1;
            }
         } else if (3126 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.showLoadingMessages = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
               return 1;
            }
         } else if (3127 == var0) {
            KeyHandler.setTapToDrop(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1, 1616173249);
            return 1;
         } else if (var0 == 3128) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int[] var40 = Interpreter.Interpreter_intStack;
               int var49 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var53;
               if (class175.getTapToDrop(1673279701)) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var53 = 1;
               } else {
                  var53 = 0;
               }

               var40[var49] = var53;
               return 1;
            }
         } else if (3129 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1502776973;
               client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] * -1344242071;
               return 1;
            }
         } else if (var0 == 3130) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               return 1;
            }
         } else if (var0 == 3131) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (3132 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class489.canvasWidth * 120179835;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 19292887 * class374.canvasHeight;
               return 1;
            }
         } else if (3133 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (var0 == 3134) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3135) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               return 1;
            }
         } else if (var0 == 3136) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.field636 = 96316967;
               client.field733 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 887301543;
               return 1;
            }
         } else if (var0 == 3137) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.field636 = -1367444454;
               client.field733 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 887301543;
               return 1;
            }
         } else if (3138 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.field636 = 0;
               return 1;
            }
         } else if (var0 == 3139) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.field636 = 1463761421;
               return 1;
            }
         } else if (3140 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               client.field636 = 96316967;
               int var39;
               if (var2) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var39 = 278777747 * UserComparator3.scriptDotWidget.id;
               } else {
                  var39 = class222.scriptActiveWidget.id * 278777747;
               }

               client.field733 = var39 * 887301543;
               return 1;
            }
         } else if (var0 == 3141) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               boolean var38;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var38 = true;
               } else {
                  var38 = false;
               }

               boolean var13 = var38;
               ClientPreferences.method1569(class468.clientPreferences, var13, 1494649334);
               return 1;
            }
         } else if (3142 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int[] var37 = Interpreter.Interpreter_intStack;
               int var48 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var52;
               if (ClientPreferences.method1560(class468.clientPreferences, -2111976121)) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var52 = 1;
               } else {
                  var52 = 0;
               }

               var37[var48] = var52;
               return 1;
            }
         } else if (3143 == var0) {
            boolean var36;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= -2027878593) {
                  throw new IllegalStateException();
               }

               var36 = true;
            } else {
               var36 = false;
            }

            boolean var12 = var36;
            client.Login_isUsernameRemembered = var12;
            if (!var12) {
               if (var3 <= -2027878593) {
                  throw new IllegalStateException();
               }

               class468.clientPreferences.updateRememberedUsername("", (byte)1);
            }

            return 1;
         } else if (var0 == 3144) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int[] var35 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (client.Login_isUsernameRemembered) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var35[var10001] = var10002;
               return 1;
            }
         } else if (3145 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3146 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -2027878593) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var11 = var10000;
               class468.clientPreferences.updateTitleMusicDisabled(!var11, -1293654165);
               return 1;
            }
         } else if (3147 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences
                     .isTitleMusicDisabled(937680330)
                  ? 0
                  : 1;
               return 1;
            }
         } else if (var0 == 3148) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3149) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3150) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3151 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3152) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3153 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1230510771 * Login.Login_loadingPercent;
            return 1;
         } else if (var0 == 3154) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = StudioGame.method8771(871960420);
               return 1;
            }
         } else if (var0 == 3155) {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            return 1;
         } else if (var0 == 3156) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (3157 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               return 1;
            }
         } else if (3158 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3159) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (var0 == 3160) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3161 == var0) {
            class408.Interpreter_intStackSize -= -1793120611;
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (3162 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3163) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3164 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (3165 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3166 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3167) {
            class408.Interpreter_intStackSize -= 708726074;
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (3168 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (var0 == 3169) {
            return 1;
         } else if (var0 == 3170) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3171 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (3172 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (var0 == 3173) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3174) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (var0 == 3175) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (var0 == 3176) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3177) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3178) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               return 1;
            }
         } else if (3179 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 3180) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               return 1;
            }
         } else if (var0 == 3181) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               DefaultsGroup.method11178(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1735725398);
               return 1;
            }
         } else if (var0 == 3182) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ApproximateRouteStrategy.method383(
                  (byte)10
               );
               return 1;
            }
         } else if (3185 == var0) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ClientPreferences.method1661(class468.clientPreferences, var10, -1881249788);
               return 1;
            }
         } else if (var0 == 3186) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var9 = class468.clientPreferences.getDrawDistance((byte)-28);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9;
               return 1;
            }
         } else if (var0 == 3189) {
            if (var3 <= -2027878593) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               classPY.method8823(var4, -415824616);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "qx.bk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxt;FI)V")
   @ObfuscatedName("ae")
   public final void method9220(int var1, int var2, SpritePixels var3, float var4, int var5) {
      try {
         int var6 = (int)(var4 * 18.0F);
         SpritePixels var7 = this.method9205(var6, -1097044866);
         int var8 = 1 + var6 * 2;
         Bounds var9 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
         Bounds var10 = new Bounds(0, 0);
         Bounds.method9503(this.bounds, var8, var8, (short)13495);
         System.nanoTime();

         for (int var11 = 0; var11 < -1261959677 * this.field5455; var11++) {
            if (var5 != 16582757) {
               throw new IllegalStateException();
            }

            int var12 = this.field5453[var11];
            int var13 = this.field5456[var11];
            int var14 = (int)((var12 - var1) * var4) - var6;
            int var15 = (int)(var3.subHeight - var4 * (var13 - var2)) - var6;
            Bounds.method9496(this.bounds, var14, var15, 1101244774);
            Bounds.method9515(this.bounds, var9, var10, -1164215303);
            this.method9221(var7, var3, var10, -1291066961);
         }

         System.nanoTime();
         System.nanoTime();

         for (int var17 = 0; var17 < var3.pixels.length; var17++) {
            if (var5 != 16582757) {
               throw new IllegalStateException();
            }

            if (var3.pixels[var17] == 0) {
               var3.pixels[var17] = -16777216;
            } else {
               int var18 = (64 + var3.pixels[var17] - 1) / 256;
               if (var18 <= 0) {
                  if (var5 != 16582757) {
                     return;
                  }

                  var3.pixels[var17] = -16777216;
               } else {
                  if (var18 > field5462.length) {
                     var18 = field5462.length;
                  }

                  int var19 = field5462[var18 - 1];
                  var3.pixels[var17] = 0xFF000000 | var19;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "qx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   void method9204(int var1, byte var2) {
      try {
         int var3 = var1 * 2 + 1;
         double[] var4 = class320.method7359(0.0, var1 / 3.0F, var1, -1773956998);
         double var5 = var4[var1] * var4[var1];
         int[] var7 = new int[var3 * var3];
         boolean var8 = false;

         for (int var9 = 0; var9 < var3; var9++) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            for (int var10 = 0; var10 < var3; var10++) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               int var11 = var7[var3 * var9 + var10] = (int)(var4[var9] * var4[var10] / var5 * 256.0);
               if (!var8) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  if (var11 > 0) {
                     var8 = true;
                  }
               }
            }
         }

         SpritePixels var13 = new SpritePixels(var7, var3, var3);
         this.spriteMap.put(var1, var13);
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "qx.av(" + ')');
      }
   }
}
