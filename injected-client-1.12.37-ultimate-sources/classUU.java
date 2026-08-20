import java.util.Arrays;
import java.util.Objects;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uu")
public final class classUU {
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("vs")
   public static classUU field6384 = new classUU();
   @ObfuscatedName("ag")
   public float[] field6403;
   @ObfuscatedName("ui")
   public float field6400;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final float field6390 = 1.0E-4F;
   @ObfuscatedName("vi")
   public float field6401;
   @ObfuscatedName("do")
   public float field6387;
   @ObfuscatedName("pt")
   public float field6395;
   @ObfuscatedName("gw")
   public float field6392;
   @ObfuscatedName("rc")
   public float field6386;
   @ObfuscatedName("io")
   public float field6388;
   @ObfuscatedName("ae")
   static final int field6381 = 887137936;
   @ObfuscatedName("sg")
   public float field6397;
   @ObfuscatedName("ab")
   static int field6383 = 0;
   @ObfuscatedName("ad")
   public float field6389;
   @ObfuscatedName("ta")
   public float field6398;
   @ObfuscatedName("uc")
   public float field6399;
   @ObfuscatedName("fi")
   public float field6391;
   @ObfuscatedName("le")
   public float field6394;
   @ObfuscatedSignature(descriptor = "[Luu;")
   @ObfuscatedName("af")
   static final classUU[] field6382 = new classUU[field6381 * -711449127];
   @ObfuscatedName("jz")
   public float field6393;
   @ObfuscatedName("il")
   public float field6385;
   @ObfuscatedName("qy")
   public float field6396;
   @ObfuscatedName("aj")
   static final int field6402 = 15574765;

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("by")
   public float[] method11568() {
      float[] var1 = new float[]{(float)(-Math.asin(this.field6391)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = this.field6394;
         double var6 = this.field6387;
         double var8 = this.field6398;
         double var10 = this.field6386;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = this.field6392;
         double var13 = this.field6385;
         if (this.field6391 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Luu;)V")
   @ObfuscatedName("sp")
   public static void method11593(classUU var0, classUU var1) {
      if (var0 == null) {
         var0.method11584(var0);
      }

      float var2 = var0.field6396 * var1.field6400 + (var1.field6401 * var0.field6394 + (var0.field6385 * var1.field6385 + var0.field6392 * var1.field6398));
      float var3 = var0.field6394 * var1.field6389 + (var0.field6392 * var1.field6386 + var0.field6385 * var1.field6392) + var1.field6399 * var0.field6396;
      float var4 = var0.field6396 * var1.field6395 + (var0.field6392 * var1.field6391 + var1.field6394 * var0.field6385 + var1.field6387 * var0.field6394);
      float var5 = var0.field6394 * var1.field6393 + (var1.field6396 * var0.field6385 + var0.field6392 * var1.field6397) + var0.field6396 * var1.field6388;
      float var6 = var0.field6386 * var1.field6398 + var0.field6398 * var1.field6385 + var1.field6401 * var0.field6391 + var1.field6400 * var0.field6397;
      float var7 = var0.field6391 * var1.field6389 + (var0.field6398 * var1.field6392 + var0.field6386 * var1.field6386) + var1.field6399 * var0.field6397;
      float var8 = var1.field6391 * var0.field6386 + var1.field6394 * var0.field6398 + var0.field6391 * var1.field6387 + var1.field6395 * var0.field6397;
      float var9 = var0.field6386 * var1.field6397 + var0.field6398 * var1.field6396 + var0.field6391 * var1.field6393 + var1.field6388 * var0.field6397;
      float var10 = var1.field6400 * var0.field6393 + (var1.field6401 * var0.field6387 + (var1.field6385 * var0.field6401 + var1.field6398 * var0.field6389));
      float var11 = var0.field6393 * var1.field6399 + (var0.field6387 * var1.field6389 + (var0.field6401 * var1.field6392 + var0.field6389 * var1.field6386));
      float var12 = var1.field6387 * var0.field6387 + (var1.field6391 * var0.field6389 + var1.field6394 * var0.field6401) + var0.field6393 * var1.field6395;
      float var13 = var0.field6393 * var1.field6388 + (var0.field6401 * var1.field6396 + var0.field6389 * var1.field6397 + var0.field6387 * var1.field6393);
      float var14 = var0.field6388 * var1.field6400 + (var1.field6385 * var0.field6400 + var0.field6399 * var1.field6398 + var0.field6395 * var1.field6401);
      float var15 = var0.field6388 * var1.field6399 + (var0.field6395 * var1.field6389 + (var0.field6400 * var1.field6392 + var0.field6399 * var1.field6386));
      float var16 = var0.field6395 * var1.field6387 + (var1.field6394 * var0.field6400 + var0.field6399 * var1.field6391) + var1.field6395 * var0.field6388;
      float var17 = var1.field6396 * var0.field6400 + var0.field6399 * var1.field6397 + var0.field6395 * var1.field6393 + var0.field6388 * var1.field6388;
      var0.field6385 = var2;
      var0.field6392 = var3;
      var0.field6394 = var4;
      var0.field6396 = var5;
      var0.field6398 = var6;
      var0.field6386 = var7;
      var0.field6391 = var8;
      var0.field6397 = var9;
      var0.field6401 = var10;
      var0.field6389 = var11;
      var0.field6387 = var12;
      var0.field6393 = var13;
      var0.field6400 = var14;
      var0.field6399 = var15;
      var0.field6395 = var16;
      var0.field6388 = var17;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Z)V")
   @ObfuscatedName("uk")
   public void method11648(classXY var1, boolean var2) {
      this.method11644(var1, var2, -1231321475);
   }

   public classUU(classUU var1) {
      this.method11649(var1);
   }

   public classUU(classXY var1, boolean var2) {
      this.method11648(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void method11555(int var1) {
      try {
         synchronized (field6382) {
            if (field6383 * -1618719293 < -711449127 * field6381) {
               if (var1 <= 1525934998) {
                  throw new IllegalStateException();
               }

               field6382[(field6383 += 943786731) * -1618719293 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;ZI)V")
   @ObfuscatedName("ab")
   void method11644(classXY var1, boolean var2, int var3) {
      if (var2) {
         boolean var5 = var2;
         classXY var4 = var1;
         classUU var18 = this;
         int var6 = -1231321475;

         try {
            if (var5) {
               classUX var7 = new classUX();
               int var10 = var4.method13050((byte)16);
               var10 &= 16383;
               float var9 = (float)(var10 * 3.834951969714103E-4);
               var7.method11681(var9, 173632492);
               int var13 = var4.method13050((byte)16);
               var13 &= 16383;
               float var12 = (float)(var13 * 3.834951969714103E-4);
               var7.method11686(var12, 982132619);
               int var16 = var4.method13050((byte)16);
               var16 &= 16383;
               float var15 = (float)(var16 * 3.834951969714103E-4);
               classUX.method11689(var7, var15, -2028165068);
               var7.method11693(var4.method13050((byte)16), var4.method13050((byte)16), var4.method13050((byte)16), (byte)105);
               var18.method11605(var7, -1959054899);
            } else {
               for (int var19 = 0; var19 < 16 && var6 > -1547886893; var19++) {
                  var18.field6403[var19] = var4.method13062(37945336);
               }
            }
         } catch (RuntimeException var17) {
            throw classEG.method3884(var17, "uu.ab(" + ')');
         }
      } else {
         this.field6385 = var1.method13265();
         this.field6392 = var1.method13265();
         this.field6394 = var1.method13265();
         this.field6396 = var1.method13265();
         this.field6398 = var1.method13265();
         this.field6386 = var1.method13265();
         this.field6391 = var1.method13265();
         this.field6397 = var1.method13265();
         this.field6401 = var1.method13265();
         this.field6389 = var1.method13265();
         this.field6387 = var1.method13265();
         this.field6393 = var1.method13265();
         this.field6400 = var1.method13265();
         this.field6399 = var1.method13265();
         this.field6395 = var1.method13265();
         this.field6388 = var1.method13265();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   public void method11579(int var1) {
      try {
         this.field6385 = 0.0F;
         this.field6392 = 0.0F;
         this.field6394 = 0.0F;
         this.field6396 = 0.0F;
         this.field6398 = 0.0F;
         this.field6386 = 0.0F;
         this.field6391 = 0.0F;
         this.field6397 = 0.0F;
         this.field6401 = 0.0F;
         this.field6389 = 0.0F;
         this.field6387 = 0.0F;
         this.field6393 = 0.0F;
         this.field6400 = 0.0F;
         this.field6399 = 0.0F;
         this.field6395 = 0.0F;
         this.field6388 = 0.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uu.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF[FI)V")
   @ObfuscatedName("aw")
   public void method11616(float var1, float var2, float var3, float[] var4, int var5) {
      try {
         var4[0] = var1 * this.field6385 + var2 * this.field6398 + var3 * this.field6401 + this.field6400;
         var4[1] = var2 * this.field6386 + var1 * this.field6392 + var3 * this.field6389 + this.field6399;
         var4[2] = this.field6395 + (var3 * this.field6387 + (var2 * this.field6391 + var1 * this.field6394));
         if (var4.length > 3) {
            var4[3] = var1 * this.field6396 + this.field6397 * var2 + this.field6393 * var3 + this.field6388;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("al")
   public void method11588(float var1, float var2, float var3, int var4) {
      try {
         method11574(this, -1605400150);
         this.field6385 = var1;
         this.field6386 = var2;
         this.field6387 = var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;B)V")
   @ObfuscatedName("aj")
   public void method11641(classUU var1, byte var2) {
      this.field6385 = this.field6385 + var1.field6385;
      this.field6392 = this.field6392 + var1.field6392;
      this.field6394 = this.field6394 + var1.field6394;
      this.field6396 = this.field6396 + var1.field6396;
      this.field6398 = this.field6398 + var1.field6398;
      this.field6386 = this.field6386 + var1.field6386;
      this.field6391 = this.field6391 + var1.field6391;
      this.field6397 = this.field6397 + var1.field6397;
      this.field6401 = this.field6401 + var1.field6401;
      this.field6389 = this.field6389 + var1.field6389;
      this.field6387 = this.field6387 + var1.field6387;
      this.field6393 = this.field6393 + var1.field6393;
      this.field6400 = this.field6400 + var1.field6400;
      this.field6399 = this.field6399 + var1.field6399;
      this.field6395 = this.field6395 + var1.field6395;
      this.field6388 = this.field6388 + var1.field6388;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("et")
   public void method11649(classUU var1) {
      rl23.method10067(this, var1, (byte)-47);
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("ca")
   public void method11650(classUL var1) {
      this.method11599(var1, 777754821);
   }

   @ObfuscatedSignature(descriptor = "(FFF[F)V")
   @ObfuscatedName("ci")
   public void method11617(float var1, float var2, float var3, float[] var4) {
      var4[0] = var1 * this.field6385 + var2 * this.field6398 + var3 * this.field6401 + this.field6400;
      var4[1] = var2 * this.field6386 + var1 * this.field6392 + var3 * this.field6389 + this.field6399;
      var4[2] = this.field6395 + (var3 * this.field6387 + (var2 * this.field6391 + var1 * this.field6394));
      if (var4.length > 3) {
         var4[3] = var1 * this.field6396 + this.field6397 * var2 + this.field6393 * var3 + this.field6388;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("ad")
   public void method11599(classUL var1, int var2) {
      try {
         float var3 = var1.field6324 * var1.field6324;
         float var4 = var1.field6325 * var1.field6324;
         float var5 = var1.field6326 * var1.field6324;
         float var6 = var1.field6327 * var1.field6324;
         float var7 = var1.field6325 * var1.field6325;
         float var8 = var1.field6326 * var1.field6325;
         float var9 = var1.field6325 * var1.field6327;
         float var10 = var1.field6326 * var1.field6326;
         float var11 = var1.field6326 * var1.field6327;
         float var12 = var1.field6327 * var1.field6327;
         this.field6385 = var3 + var7 - var12 - var10;
         this.field6392 = var8 + var6 + var8 + var6;
         this.field6394 = var9 - var5 - var5 + var9;
         this.field6398 = var8 + (var8 - var6 - var6);
         this.field6386 = var3 + var10 - var7 - var12;
         this.field6391 = var4 + (var11 + var4 + var11);
         this.field6401 = var5 + (var9 + var5 + var9);
         this.field6389 = var11 - var4 - var4 + var11;
         this.field6387 = var3 + var12 - var10 - var7;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "uu.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lux;I)V")
   @ObfuscatedName("ap")
   public void method11605(classUX var1, int var2) {
      try {
         this.field6385 = var1.field6422;
         this.field6392 = var1.field6415;
         this.field6394 = var1.field6414;
         this.field6396 = 0.0F;
         this.field6398 = var1.field6412;
         this.field6386 = var1.field6416;
         this.field6391 = var1.field6420;
         this.field6397 = 0.0F;
         this.field6401 = var1.field6421;
         this.field6389 = var1.field6413;
         this.field6387 = var1.field6411;
         this.field6393 = 0.0F;
         this.field6400 = var1.field6419;
         this.field6399 = var1.field6418;
         this.field6395 = var1.field6417;
         this.field6388 = 1.0F;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "uu.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)Luu;")
   @ObfuscatedName("bm")
   public static classUU method11550(classUU var0) {
      synchronized (field6382) {
         if (0 == field6383 * -1618719293) {
            return new classUU(var0);
         } else {
            rl23.method10067(field6382[(field6383 -= 943786731) * -1258993443], var0, (byte)99);
            return field6382[field6383 * 1887936142];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;Luu;I)V")
   @ObfuscatedName("jt")
   public static void method11594(classUU var0, classUU var1, int var2) {
      if (var0 == null) {
         var0.method11597(var0, var2);
      } else {
         try {
            float var3 = var0.field6396 * var1.field6400
               + (var1.field6401 * var0.field6394 + (var0.field6385 * var1.field6385 + var0.field6392 * var1.field6398));
            float var4 = var0.field6394 * var1.field6389
               + (var0.field6392 * var1.field6386 + var0.field6385 * var1.field6392)
               + var1.field6399 * var0.field6396;
            float var5 = var0.field6396 * var1.field6395
               + (var0.field6392 * var1.field6391 + var1.field6394 * var0.field6385 + var1.field6387 * var0.field6394);
            float var6 = var0.field6394 * var1.field6393
               + (var1.field6396 * var0.field6385 + var0.field6392 * var1.field6397)
               + var0.field6396 * var1.field6388;
            float var7 = var0.field6386 * var1.field6398 + var0.field6398 * var1.field6385 + var1.field6401 * var0.field6391 + var1.field6400 * var0.field6397;
            float var8 = var0.field6391 * var1.field6389
               + (var0.field6398 * var1.field6392 + var0.field6386 * var1.field6386)
               + var1.field6399 * var0.field6397;
            float var9 = var1.field6391 * var0.field6386 + var1.field6394 * var0.field6398 + var0.field6391 * var1.field6387 + var1.field6395 * var0.field6397;
            float var10 = var0.field6386 * var1.field6397 + var0.field6398 * var1.field6396 + var0.field6391 * var1.field6393 + var1.field6388 * var0.field6397;
            float var11 = var1.field6400 * var0.field6393
               + (var1.field6401 * var0.field6387 + (var1.field6385 * var0.field6401 + var1.field6398 * var0.field6389));
            float var12 = var0.field6393 * var1.field6399
               + (var0.field6387 * var1.field6389 + (var0.field6401 * var1.field6392 + var0.field6389 * var1.field6386));
            float var13 = var1.field6387 * var0.field6387
               + (var1.field6391 * var0.field6389 + var1.field6394 * var0.field6401)
               + var0.field6393 * var1.field6395;
            float var14 = var0.field6393 * var1.field6388
               + (var0.field6401 * var1.field6396 + var0.field6389 * var1.field6397 + var0.field6387 * var1.field6393);
            float var15 = var0.field6388 * var1.field6400
               + (var1.field6385 * var0.field6400 + var0.field6399 * var1.field6398 + var0.field6395 * var1.field6401);
            float var16 = var0.field6388 * var1.field6399
               + (var0.field6395 * var1.field6389 + (var0.field6400 * var1.field6392 + var0.field6399 * var1.field6386));
            float var17 = var0.field6395 * var1.field6387
               + (var1.field6394 * var0.field6400 + var0.field6399 * var1.field6391)
               + var1.field6395 * var0.field6388;
            float var18 = var1.field6396 * var0.field6400 + var0.field6399 * var1.field6397 + var0.field6395 * var1.field6393 + var0.field6388 * var1.field6388;
            var0.field6385 = var3;
            var0.field6392 = var4;
            var0.field6394 = var5;
            var0.field6396 = var6;
            var0.field6398 = var7;
            var0.field6386 = var8;
            var0.field6391 = var9;
            var0.field6397 = var10;
            var0.field6401 = var11;
            var0.field6389 = var12;
            var0.field6387 = var13;
            var0.field6393 = var14;
            var0.field6400 = var15;
            var0.field6399 = var16;
            var0.field6395 = var17;
            var0.field6388 = var18;
         } catch (RuntimeException var19) {
            throw classEG.method3884(var19, "uu.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   public void method11609(int var1) {
      try {
         float var2 = 1.0F / this.method11608((byte)40);
         float var3 = (
               this.field6388 * (this.field6387 * this.field6386)
                  - this.field6393 * this.field6386 * this.field6395
                  - this.field6391 * this.field6389 * this.field6388
                  + this.field6399 * (this.field6391 * this.field6393)
                  + this.field6397 * this.field6389 * this.field6395
                  - this.field6399 * (this.field6387 * this.field6397)
            )
            * var2;
         float var4 = (
               this.field6396 * this.field6387 * this.field6399
                  + (
                     this.field6395 * (this.field6392 * this.field6393)
                        + -this.field6392 * this.field6387 * this.field6388
                        + this.field6388 * (this.field6394 * this.field6389)
                        - this.field6399 * (this.field6393 * this.field6394)
                        - this.field6395 * (this.field6396 * this.field6389)
                  )
            )
            * var2;
         float var5 = var2
            * (
               this.field6394 * this.field6397 * this.field6399
                  + (
                     this.field6392 * this.field6391 * this.field6388
                        - this.field6392 * this.field6397 * this.field6395
                        - this.field6388 * (this.field6386 * this.field6394)
                  )
                  + this.field6386 * this.field6396 * this.field6395
                  - this.field6396 * this.field6391 * this.field6399
            );
         float var6 = var2
            * (
               this.field6391 * -this.field6392 * this.field6393
                  + this.field6387 * (this.field6392 * this.field6397)
                  + this.field6393 * (this.field6386 * this.field6394)
                  - this.field6394 * this.field6397 * this.field6389
                  - this.field6387 * (this.field6396 * this.field6386)
                  + this.field6391 * this.field6396 * this.field6389
            );
         float var7 = (
               this.field6391 * this.field6401 * this.field6388
                  + (this.field6387 * -this.field6398 * this.field6388 + this.field6398 * this.field6393 * this.field6395)
                  - this.field6400 * (this.field6393 * this.field6391)
                  - this.field6401 * this.field6397 * this.field6395
                  + this.field6397 * this.field6387 * this.field6400
            )
            * var2;
         float var8 = (
               this.field6400 * (this.field6393 * this.field6394)
                  + (
                     this.field6388 * (this.field6385 * this.field6387)
                        - this.field6395 * (this.field6393 * this.field6385)
                        - this.field6394 * this.field6401 * this.field6388
                  )
                  + this.field6401 * this.field6396 * this.field6395
                  - this.field6400 * (this.field6387 * this.field6396)
            )
            * var2;
         float var9 = (
               this.field6395 * (this.field6385 * this.field6397)
                  + -this.field6385 * this.field6391 * this.field6388
                  + this.field6394 * this.field6398 * this.field6388
                  - this.field6394 * this.field6397 * this.field6400
                  - this.field6396 * this.field6398 * this.field6395
                  + this.field6400 * (this.field6396 * this.field6391)
            )
            * var2;
         float var10 = var2
            * (
               this.field6387 * (this.field6396 * this.field6398)
                  + (
                     this.field6393 * (this.field6385 * this.field6391)
                        - this.field6397 * this.field6385 * this.field6387
                        - this.field6394 * this.field6398 * this.field6393
                        + this.field6394 * this.field6397 * this.field6401
                  )
                  - this.field6396 * this.field6391 * this.field6401
            );
         float var11 = (
               this.field6398 * this.field6389 * this.field6388
                  - this.field6393 * this.field6398 * this.field6399
                  - this.field6388 * (this.field6386 * this.field6401)
                  + this.field6386 * this.field6393 * this.field6400
                  + this.field6399 * (this.field6397 * this.field6401)
                  - this.field6397 * this.field6389 * this.field6400
            )
            * var2;
         float var12 = (
               this.field6400 * (this.field6396 * this.field6389)
                  + (
                     this.field6399 * (this.field6393 * this.field6385)
                        + this.field6388 * (this.field6389 * -this.field6385)
                        + this.field6392 * this.field6401 * this.field6388
                        - this.field6400 * (this.field6392 * this.field6393)
                        - this.field6401 * this.field6396 * this.field6399
                  )
            )
            * var2;
         float var13 = (
               this.field6385 * this.field6386 * this.field6388
                  - this.field6397 * this.field6385 * this.field6399
                  - this.field6398 * this.field6392 * this.field6388
                  + this.field6400 * (this.field6397 * this.field6392)
                  + this.field6399 * (this.field6396 * this.field6398)
                  - this.field6400 * (this.field6386 * this.field6396)
            )
            * var2;
         float var14 = var2
            * (
               this.field6393 * (this.field6392 * this.field6398)
                  + (this.field6393 * (-this.field6385 * this.field6386) + this.field6397 * this.field6385 * this.field6389)
                  - this.field6401 * (this.field6392 * this.field6397)
                  - this.field6398 * this.field6396 * this.field6389
                  + this.field6401 * (this.field6396 * this.field6386)
            );
         float var15 = var2
            * (
               this.field6391 * this.field6389 * this.field6400
                  + (
                     this.field6395 * (this.field6386 * this.field6401)
                        + (this.field6398 * this.field6387 * this.field6399 + this.field6389 * -this.field6398 * this.field6395)
                        - this.field6386 * this.field6387 * this.field6400
                        - this.field6399 * (this.field6391 * this.field6401)
                  )
            );
         float var16 = (
               this.field6389 * this.field6385 * this.field6395
                  - this.field6387 * this.field6385 * this.field6399
                  - this.field6395 * (this.field6401 * this.field6392)
                  + this.field6400 * (this.field6392 * this.field6387)
                  + this.field6394 * this.field6401 * this.field6399
                  - this.field6394 * this.field6389 * this.field6400
            )
            * var2;
         float var17 = var2
            * (
               this.field6391 * this.field6385 * this.field6399
                  + this.field6386 * -this.field6385 * this.field6395
                  + this.field6392 * this.field6398 * this.field6395
                  - this.field6400 * (this.field6392 * this.field6391)
                  - this.field6394 * this.field6398 * this.field6399
                  + this.field6400 * (this.field6386 * this.field6394)
            );
         float var18 = var2
            * (
               this.field6385 * this.field6386 * this.field6387
                  - this.field6389 * (this.field6391 * this.field6385)
                  - this.field6387 * (this.field6392 * this.field6398)
                  + this.field6391 * this.field6392 * this.field6401
                  + this.field6398 * this.field6394 * this.field6389
                  - this.field6401 * (this.field6394 * this.field6386)
            );
         this.field6385 = var3;
         this.field6392 = var4;
         this.field6394 = var5;
         this.field6396 = var6;
         this.field6398 = var7;
         this.field6386 = var8;
         this.field6391 = var9;
         this.field6397 = var10;
         this.field6401 = var11;
         this.field6389 = var12;
         this.field6387 = var13;
         this.field6393 = var14;
         this.field6400 = var15;
         this.field6399 = var16;
         this.field6395 = var17;
         this.field6388 = var18;
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "uu.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("be")
   public float[] method11569() {
      float[] var1 = new float[]{(float)(-Math.asin(this.field6391)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = this.field6394;
         double var6 = this.field6387;
         double var8 = this.field6398;
         double var10 = this.field6386;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = this.field6392;
         double var13 = this.field6385;
         if (this.field6391 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFI)F")
   @ObfuscatedName("at")
   public float method11623(float var1, float var2, float var3, int var4) {
      try {
         return this.field6399 + (var3 * this.field6389 + (this.field6386 * var2 + var1 * this.field6392));
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFB)F")
   @ObfuscatedName("av")
   public float method11622(float var1, float var2, float var3, byte var4) {
      try {
         return this.field6385 * var1 + var2 * this.field6398 + var3 * this.field6401 + this.field6400;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fa")
   public void method11651() {
      this.method11579(1782054023);
   }

   static {
      new classUU();
   }

   @ObfuscatedSignature(descriptor = "(FFFI)F")
   @ObfuscatedName("an")
   public float method11625(float var1, float var2, float var3, int var4) {
      try {
         return this.field6387 * var3 + (this.field6391 * var2 + var1 * this.field6394) + this.field6395;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.an(" + ')');
      }
   }

   @Override
   public String toString() {
      return "Mat4{m0="
         + this.field6385
         + ", m1="
         + this.field6392
         + ", m2="
         + this.field6394
         + ", m3="
         + this.field6396
         + ", m4="
         + this.field6398
         + ", m5="
         + this.field6386
         + ", m6="
         + this.field6391
         + ", m7="
         + this.field6397
         + ", m8="
         + this.field6401
         + ", m9="
         + this.field6389
         + ", m10="
         + this.field6387
         + ", m11="
         + this.field6393
         + ", m12="
         + this.field6400
         + ", m13="
         + this.field6399
         + ", m14="
         + this.field6395
         + ", m15="
         + this.field6388
         + "}";
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("as")
   public float[] method11570(int var1) {
      try {
         float[] var2 = new float[]{(float)(-Math.asin(this.field6391)), 0.0F, 0.0F};
         double var3 = Math.cos(var2[0]);
         if (Math.abs(var3) > 0.005) {
            if (var1 == -1423591330) {
               throw new IllegalStateException();
            }

            double var5 = this.field6394;
            double var7 = this.field6387;
            double var9 = this.field6398;
            double var11 = this.field6386;
            var2[1] = (float)Math.atan2(var5, var7);
            var2[2] = (float)Math.atan2(var9, var11);
         } else {
            double var14 = this.field6392;
            double var15 = this.field6385;
            if (this.field6391 < 0.0F) {
               var2[1] = (float)Math.atan2(var14, var15);
            } else {
               var2[1] = (float)(-Math.atan2(var14, var15));
            }

            var2[2] = 0.0F;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "uu.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("zi")
   public void method11652(classUU var1) {
      method11594(this, var1, -121561848);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method11653() {
      this.method11609(-1126922930);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)Luu;")
   @ObfuscatedName("bp")
   public static classUU method11551(classUU var0) {
      synchronized (field6382) {
         if (0 == field6383 * 280754414) {
            return new classUU(var0);
         } else {
            rl23.method10067(field6382[(field6383 -= 943786731) * -1526793145], var0, (byte)42);
            return field6382[field6383 * 1190115707];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("vv")
   public void method11647(float[] var1) {
      var1[0] = this.field6385;
      var1[1] = this.field6392;
      var1[2] = this.field6394;
      var1[3] = this.field6396;
      var1[4] = this.field6398;
      var1[5] = this.field6386;
      var1[6] = this.field6391;
      var1[7] = this.field6397;
      var1[8] = this.field6401;
      var1[9] = this.field6389;
      var1[10] = this.field6387;
      var1[11] = this.field6393;
      var1[12] = this.field6400;
      var1[13] = this.field6399;
      var1[14] = this.field6395;
      var1[15] = this.field6388;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("bx")
   public static classUU method11547() {
      synchronized (field6382) {
         if (717099664 * field6383 == 0) {
            return new classUU();
         } else {
            method11574(field6382[(field6383 -= 1500138072) * -681667817], -107151084);
            return field6382[field6383 * 34801148];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("mr")
   public void method11654(float var1, float var2, float var3, float var4) {
      method11613(this, var1, var2, var3, var4, -1412584499);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;FFF)F")
   @ObfuscatedName("ag")
   public static float method11626(classUU var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method11628(var1, var1, var1);
      }

      return var0.field6387 * var3 + (var0.field6391 * var2 + var1 * var0.field6394) + var0.field6395;
   }

   @ObfuscatedSignature(descriptor = "(Lug;)V")
   @ObfuscatedName("qm")
   public void method11655(classUG var1) {
      this.method11642(var1, 1861666336);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method11629() {
      StringBuilder var1 = new StringBuilder();
      this.method11570(517080097);
      method11565(this, (byte)34);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field6403[4 * var2 + var3];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11630() {
      StringBuilder var1 = new StringBuilder();
      this.method11570(-1060025548);
      method11565(this, (byte)21);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field6403[4 * var2 + var3];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method11635(Object var1) {
      if (!(var1 instanceof classUU)) {
         return false;
      } else {
         classUU var2 = (classUU)var1;

         for (int var3 = 0; var3 < 16; var3++) {
            if (this.field6403[var3] != var2.field6403[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)F")
   @ObfuscatedName("au")
   float method11608(byte var1) {
      try {
         return this.field6401 * (this.field6396 * this.field6386) * this.field6395
            + (
               this.field6401 * (this.field6394 * this.field6397) * this.field6399
                  + (
                     this.field6400 * (this.field6393 * (this.field6386 * this.field6394))
                        + (
                           this.field6392 * this.field6397 * this.field6387 * this.field6400
                              + (
                                 this.field6398 * this.field6392 * this.field6393 * this.field6395
                                    + (
                                       this.field6385 * this.field6386 * this.field6387 * this.field6388
                                          - this.field6395 * (this.field6385 * this.field6386 * this.field6393)
                                          - this.field6389 * (this.field6391 * this.field6385) * this.field6388
                                          + this.field6399 * (this.field6385 * this.field6391 * this.field6393)
                                          + this.field6395 * (this.field6385 * this.field6397 * this.field6389)
                                          - this.field6385 * this.field6397 * this.field6387 * this.field6399
                                          - this.field6388 * (this.field6387 * (this.field6398 * this.field6392))
                                    )
                                    + this.field6401 * (this.field6392 * this.field6391) * this.field6388
                                    - this.field6400 * (this.field6392 * this.field6391 * this.field6393)
                                    - this.field6401 * (this.field6392 * this.field6397) * this.field6395
                              )
                              + this.field6389 * (this.field6394 * this.field6398) * this.field6388
                              - this.field6393 * (this.field6394 * this.field6398) * this.field6399
                              - this.field6386 * this.field6394 * this.field6401 * this.field6388
                        )
                  )
                  - this.field6389 * (this.field6394 * this.field6397) * this.field6400
                  - this.field6395 * (this.field6398 * this.field6396 * this.field6389)
                  + this.field6398 * this.field6396 * this.field6387 * this.field6399
            )
            - this.field6387 * (this.field6396 * this.field6386) * this.field6400
            - this.field6401 * (this.field6391 * this.field6396) * this.field6399
            + this.field6391 * this.field6396 * this.field6389 * this.field6400;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uu.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("am")
   public float[] method11636(int var1) {
      try {
         float[] var2 = new float[3];
         classUZ var3 = new classUZ(this.field6385, this.field6392, this.field6394);
         classUZ var4 = new classUZ(this.field6398, this.field6386, this.field6391);
         classUZ var5 = new classUZ(this.field6401, this.field6389, this.field6387);
         var2[0] = var3.method11774(-1808401369);
         var2[1] = var4.method11774(-1808401369);
         var2[2] = var5.method11774(-1808401369);
         return var2;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)Luz;")
   @ObfuscatedName("ak")
   public classUZ method11618(float var1, float var2, float var3, int var4) {
      try {
         float var5 = 1.0F / (this.field6388 + (var2 * this.field6397 + var1 * this.field6396 + this.field6393 * var3));
         return classIK.method6218(
            var5 * (this.field6400 + (this.field6385 * var1 + var2 * this.field6398 + this.field6401 * var3)),
            var5 * (this.field6399 + (this.field6392 * var1 + var2 * this.field6386 + var3 * this.field6389)),
            (this.field6395 + (var3 * this.field6387 + (this.field6391 * var2 + var1 * this.field6394))) * var5,
            (byte)13
         );
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("jn")
   public static void method11573(classUU var0) {
      if (var0 == null) {
         var0.method11653();
      } else {
         var0.field6385 = 1.0F;
         var0.field6392 = 0.0F;
         var0.field6394 = 0.0F;
         var0.field6396 = 0.0F;
         var0.field6398 = 0.0F;
         var0.field6386 = 1.0F;
         var0.field6391 = 0.0F;
         var0.field6397 = 0.0F;
         var0.field6401 = 0.0F;
         var0.field6389 = 0.0F;
         var0.field6387 = 1.0F;
         var0.field6393 = 0.0F;
         var0.field6400 = 0.0F;
         var0.field6399 = 0.0F;
         var0.field6395 = 0.0F;
         var0.field6388 = 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method11632() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + Arrays.hashCode(this.field6403);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("ah")
   public static classUU method11548() {
      synchronized (field6382) {
         if (-1276566354 * field6383 == 0) {
            return new classUU();
         } else {
            method11574(field6382[(field6383 -= 943786731) * 1141092157], -808306951);
            return field6382[field6383 * -1143955944];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("bn")
   public static classUU method11549() {
      synchronized (field6382) {
         if (-1618719293 * field6383 == 0) {
            return new classUU();
         } else {
            method11574(field6382[(field6383 -= -1880037778) * -1618719293], -613313620);
            return field6382[field6383 * 1966952103];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11631() {
      StringBuilder var1 = new StringBuilder();
      this.method11570(46404346);
      method11565(this, (byte)-51);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field6403[4 * var2 + var3];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)Luu;")
   @ObfuscatedName("bc")
   public static classUU method11552(classUU var0) {
      synchronized (field6382) {
         if (0 == field6383 * -1618719293) {
            return new classUU(var0);
         } else {
            rl23.method10067(field6382[(field6383 -= 943786731) * -1618719293], var0, (byte)63);
            return field6382[field6383 * -1618719293];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;FFFFI)V")
   @ObfuscatedName("uf")
   public static void method11613(classUU var0, float var1, float var2, float var3, float var4, int var5) {
      if (var0 == null) {
         var0.method11615(var1, var1, var1, var1, var5);
      }

      try {
         var0.field6385 = var1;
         var0.field6392 = 0.0F;
         var0.field6394 = 0.0F;
         var0.field6396 = 0.0F;
         var0.field6398 = 0.0F;
         var0.field6386 = var2;
         var0.field6391 = 0.0F;
         var0.field6397 = 0.0F;
         var0.field6401 = 0.0F;
         var0.field6389 = 0.0F;
         var0.field6387 = var3;
         var0.field6393 = 0.0F;
         var0.field6400 = 0.0F;
         var0.field6399 = 0.0F;
         var0.field6395 = 0.0F;
         var0.field6388 = var4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("ba")
   float[] method11562() {
      float[] var1 = new float[3];
      if (this.field6394 < 0.999 && this.field6394 > -0.999) {
         var1[1] = (float)(-Math.asin(this.field6394));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(this.field6391 / var2, this.field6387 / var2);
         var1[2] = (float)Math.atan2(this.field6392 / var2, this.field6385 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(this.field6394, 0.0);
         var1[2] = (float)Math.atan2(-this.field6389, this.field6386);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("ev")
   public float method11624(float var1, float var2, float var3) {
      return this.field6399 + (var3 * this.field6389 + (this.field6386 * var2 + var1 * this.field6392));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public void method11556() {
      synchronized (field6382) {
         if (field6383 * -1618719293 < -711449127 * field6381) {
            field6382[(field6383 += 943786731) * -1618719293 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)[F")
   @ObfuscatedName("cv")
   public static float[] method11637(classUU var0) {
      if (var0 == null) {
         var0.method11639();
      }

      float[] var1 = new float[3];
      classUZ var2 = new classUZ(var0.field6385, var0.field6392, var0.field6394);
      classUZ var3 = new classUZ(var0.field6398, var0.field6386, var0.field6391);
      classUZ var4 = new classUZ(var0.field6401, var0.field6389, var0.field6387);
      var1[0] = var2.method11774(-1808401369);
      var1[1] = var3.method11774(-1808401369);
      var1[2] = var4.method11774(-1808401369);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public void method11557() {
      synchronized (field6382) {
         if (field6383 * 1928824724 < -711449127 * field6381) {
            field6382[(field6383 += 943786731) * 251910781 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("dx")
   public float method11656(float var1, float var2, float var3) {
      return this.method11625(var1, var2, var3, 1629962595);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Z)V")
   @ObfuscatedName("bk")
   void method11560(classXY var1, boolean var2) {
      if (var2) {
         classUX var3 = new classUX();
         int var6 = var1.method13050((byte)16);
         var6 &= 1975280137;
         float var5 = (float)(var6 * 3.834951969714103E-4);
         var3.method11681(var5, 173632492);
         int var9 = var1.method13050((byte)16);
         var9 &= 16383;
         float var8 = (float)(var9 * 3.834951969714103E-4);
         var3.method11686(var8, 982132619);
         int var12 = var1.method13050((byte)16);
         var12 &= 16383;
         float var11 = (float)(var12 * 3.834951969714103E-4);
         classUX.method11689(var3, var11, -10133714);
         var3.method11693(var1.method13050((byte)16), var1.method13050((byte)16), var1.method13050((byte)16), (byte)26);
         this.method11605(var3, -1959054899);
      } else {
         for (int var13 = 0; var13 < 16; var13++) {
            this.field6403[var13] = var1.method13062(406632560);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bb")
   float[] method11563() {
      float[] var1 = new float[3];
      if (this.field6394 < 0.999 && this.field6394 > -0.999) {
         var1[1] = (float)(-Math.asin(this.field6394));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(this.field6391 / var2, this.field6387 / var2);
         var1[2] = (float)Math.atan2(this.field6392 / var2, this.field6385 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(this.field6394, 0.0);
         var1[2] = (float)Math.atan2(-this.field6389, this.field6386);
      }

      return var1;
   }

   public classUU() {
      this.field6385 = 1.0F;
      this.field6386 = 1.0F;
      this.field6387 = 1.0F;
      this.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bu")
   float[] method11564() {
      float[] var1 = new float[3];
      if (this.field6394 < 0.999 && this.field6394 > -0.999) {
         var1[1] = (float)(-Math.asin(this.field6394));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(this.field6391 / var2, this.field6387 / var2);
         var1[2] = (float)Math.atan2(this.field6392 / var2, this.field6385 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(this.field6394, 0.0);
         var1[2] = (float)Math.atan2(-this.field6389, this.field6386);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("dy")
   public float[] method11571() {
      float[] var1 = new float[]{(float)(-Math.asin(this.field6391)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = this.field6394;
         double var6 = this.field6387;
         double var8 = this.field6398;
         double var10 = this.field6386;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = this.field6392;
         double var13 = this.field6385;
         if (this.field6391 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Luu;B)[F")
   @ObfuscatedName("nx")
   public static float[] method11565(classUU var0, byte var1) {
      if (var0 == null) {
         return var0.method11567(var1);
      } else {
         try {
            float[] var2 = new float[3];
            if (var0.field6394 < 0.999) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               if (var0.field6394 > -0.999) {
                  if (var1 == 3) {
                     throw new IllegalStateException();
                  }

                  var2[1] = (float)(-Math.asin(var0.field6394));
                  double var3 = Math.cos(var2[1]);
                  var2[0] = (float)Math.atan2(var0.field6391 / var3, var0.field6387 / var3);
                  var2[2] = (float)Math.atan2(var0.field6392 / var3, var0.field6385 / var3);
                  return var2;
               }
            }

            var2[0] = 0.0F;
            var2[1] = (float)Math.atan2(var0.field6394, 0.0);
            var2[2] = (float)Math.atan2(-var0.field6389, var0.field6386);
            return var2;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "uu.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("dt")
   public float[] method11572() {
      float[] var1 = new float[]{(float)(-Math.asin(this.field6391)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = this.field6394;
         double var6 = this.field6387;
         double var8 = this.field6398;
         double var10 = this.field6386;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = this.field6392;
         double var13 = this.field6385;
         if (this.field6391 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lug;)V")
   @ObfuscatedName("co")
   public void method11598(classUG var1) {
      float var2 = var1.field6305.field6324 * var1.field6305.field6324;
      float var3 = var1.field6305.field6324 * var1.field6305.field6325;
      float var4 = var1.field6305.field6326 * var1.field6305.field6324;
      float var5 = var1.field6305.field6324 * var1.field6305.field6327;
      float var6 = var1.field6305.field6325 * var1.field6305.field6325;
      float var7 = var1.field6305.field6326 * var1.field6305.field6325;
      float var8 = var1.field6305.field6327 * var1.field6305.field6325;
      float var9 = var1.field6305.field6326 * var1.field6305.field6326;
      float var10 = var1.field6305.field6327 * var1.field6305.field6326;
      float var11 = var1.field6305.field6327 * var1.field6305.field6327;
      this.field6385 = var2 + var6 - var11 - var9;
      this.field6392 = var5 + (var7 + (var5 + var7));
      this.field6394 = var8 - var4 - var4 + var8;
      this.field6398 = var7 - var5 - var5 + var7;
      this.field6386 = var2 + var9 - var6 - var11;
      this.field6391 = var3 + (var10 + (var10 + var3));
      this.field6401 = var4 + (var8 + (var8 + var4));
      this.field6389 = var10 - var3 - var3 + var10;
      this.field6387 = var2 + var11 - var9 - var6;
      float[] var12 = this.field6403;
      float[] var13 = this.field6403;
      this.field6393 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field6400 = var1.field6307.field6427;
      this.field6399 = var1.field6307.field6425;
      this.field6395 = var1.field6307.field6426;
      this.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Luu;I)V")
   @ObfuscatedName("zq")
   public static void method11574(classUU var0, int var1) {
      if (var0 == null) {
         var0.method11578(var1);
      }

      try {
         var0.field6385 = 1.0F;
         var0.field6392 = 0.0F;
         var0.field6394 = 0.0F;
         var0.field6396 = 0.0F;
         var0.field6398 = 0.0F;
         var0.field6386 = 1.0F;
         var0.field6391 = 0.0F;
         var0.field6397 = 0.0F;
         var0.field6401 = 0.0F;
         var0.field6389 = 0.0F;
         var0.field6387 = 1.0F;
         var0.field6393 = 0.0F;
         var0.field6400 = 0.0F;
         var0.field6399 = 0.0F;
         var0.field6395 = 0.0F;
         var0.field6388 = 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uu.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("ao")
   public void method11585(float var1, int var2) {
      try {
         this.method11588(var1, var1, var1, -2138377657);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "uu.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xl")
   public void method11575() {
      this.field6385 = 1.0F;
      this.field6392 = 0.0F;
      this.field6394 = 0.0F;
      this.field6396 = 0.0F;
      this.field6398 = 0.0F;
      this.field6386 = 1.0F;
      this.field6391 = 0.0F;
      this.field6397 = 0.0F;
      this.field6401 = 0.0F;
      this.field6389 = 0.0F;
      this.field6387 = 1.0F;
      this.field6393 = 0.0F;
      this.field6400 = 0.0F;
      this.field6399 = 0.0F;
      this.field6395 = 0.0F;
      this.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   public void method11576() {
      this.field6385 = 1.0F;
      this.field6392 = 0.0F;
      this.field6394 = 0.0F;
      this.field6396 = 0.0F;
      this.field6398 = 0.0F;
      this.field6386 = 1.0F;
      this.field6391 = 0.0F;
      this.field6397 = 0.0F;
      this.field6401 = 0.0F;
      this.field6389 = 0.0F;
      this.field6387 = 1.0F;
      this.field6393 = 0.0F;
      this.field6400 = 0.0F;
      this.field6399 = 0.0F;
      this.field6395 = 0.0F;
      this.field6388 = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;FFF)V")
   @ObfuscatedName("sm")
   public static void method11589(classUU var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method11656(var1, var1, var1);
      }

      method11574(var0, -143128600);
      var0.field6385 = var1;
      var0.field6386 = var2;
      var0.field6387 = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("gy")
   public static void method11577(classUU var0) {
      if (var0 == null) {
         var0.method11559();
      }

      var0.field6385 = 1.0F;
      var0.field6392 = 0.0F;
      var0.field6394 = 0.0F;
      var0.field6396 = 0.0F;
      var0.field6398 = 0.0F;
      var0.field6386 = 1.0F;
      var0.field6391 = 0.0F;
      var0.field6397 = 0.0F;
      var0.field6401 = 0.0F;
      var0.field6389 = 0.0F;
      var0.field6387 = 1.0F;
      var0.field6393 = 0.0F;
      var0.field6400 = 0.0F;
      var0.field6399 = 0.0F;
      var0.field6395 = 0.0F;
      var0.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("go")
   public void method11580() {
      this.field6385 = 0.0F;
      this.field6392 = 0.0F;
      this.field6394 = 0.0F;
      this.field6396 = 0.0F;
      this.field6398 = 0.0F;
      this.field6386 = 0.0F;
      this.field6391 = 0.0F;
      this.field6397 = 0.0F;
      this.field6401 = 0.0F;
      this.field6389 = 0.0F;
      this.field6387 = 0.0F;
      this.field6393 = 0.0F;
      this.field6400 = 0.0F;
      this.field6399 = 0.0F;
      this.field6395 = 0.0F;
      this.field6388 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("cx")
   public classUZ method11619(float var1, float var2, float var3) {
      float var4 = 1.0F / (this.field6388 + (var2 * this.field6397 + var1 * this.field6396 + this.field6393 * var3));
      return classIK.method6218(
         var4 * (this.field6400 + (this.field6385 * var1 + var2 * this.field6398 + this.field6401 * var3)),
         var4 * (this.field6399 + (this.field6392 * var1 + var2 * this.field6386 + var3 * this.field6389)),
         (this.field6395 + (var3 * this.field6387 + (this.field6391 * var2 + var1 * this.field6394))) * var4,
         (byte)67
      );
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cr")
   public void method11581(classUU var1) {
      System.arraycopy(var1.field6403, 0, this.field6403, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("dm")
   public float method11657(float var1, float var2, float var3) {
      return this.method11622(var1, var2, var3, (byte)-6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;F)V")
   @ObfuscatedName("mu")
   public static void method11586(classUU var0, float var1) {
      if (var0 == null) {
         var0.method11630();
      }

      var0.method11588(var1, var1, var1, -2136018681);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)Luu;")
   @ObfuscatedName("br")
   public static classUU method11553(classUU var0) {
      synchronized (field6382) {
         if (0 == field6383 * -1618719293) {
            return new classUU(var0);
         } else {
            rl23.method10067(field6382[(field6383 -= 943786731) * -1618719293], var0, (byte)-14);
            return field6382[field6383 * -1618719293];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method11633() {
      byte var1 = 31;
      byte var2 = 1;
      return -725005571 * var2 + Arrays.hashCode(this.field6403);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("cq")
   public void method11590(float var1, float var2, float var3) {
      method11574(this, -1660665592);
      this.field6385 = var1;
      this.field6386 = var2;
      this.field6387 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cl")
   public void method11591(classUU var1) {
      for (int var2 = 0; var2 < this.field6403.length; var2++) {
         this.field6403[var2] = this.field6403[var2] + var1.field6403[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("cm")
   public classUZ method11620(float var1, float var2, float var3) {
      float var4 = 1.0F / (this.field6388 + (var2 * this.field6397 + var1 * this.field6396 + this.field6393 * var3));
      return classIK.method6218(
         var4 * (this.field6400 + (this.field6385 * var1 + var2 * this.field6398 + this.field6401 * var3)),
         var4 * (this.field6399 + (this.field6392 * var1 + var2 * this.field6386 + var3 * this.field6389)),
         (this.field6395 + (var3 * this.field6387 + (this.field6391 * var2 + var1 * this.field6394))) * var4,
         (byte)-33
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Luu;)V")
   @ObfuscatedName("qr")
   public static void method11582(classUU var0, classUU var1) {
      System.arraycopy(var1.field6403, 0, var0.field6403, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cv")
   public void method11595(classUU var1) {
      float var2 = this.field6396 * var1.field6400 + (var1.field6401 * this.field6394 + (this.field6385 * var1.field6385 + this.field6392 * var1.field6398));
      float var3 = this.field6394 * var1.field6389 + (this.field6392 * var1.field6386 + this.field6385 * var1.field6392) + var1.field6399 * this.field6396;
      float var4 = this.field6396 * var1.field6395 + (this.field6392 * var1.field6391 + var1.field6394 * this.field6385 + var1.field6387 * this.field6394);
      float var5 = this.field6394 * var1.field6393 + (var1.field6396 * this.field6385 + this.field6392 * var1.field6397) + this.field6396 * var1.field6388;
      float var6 = this.field6386 * var1.field6398 + this.field6398 * var1.field6385 + var1.field6401 * this.field6391 + var1.field6400 * this.field6397;
      float var7 = this.field6391 * var1.field6389 + (this.field6398 * var1.field6392 + this.field6386 * var1.field6386) + var1.field6399 * this.field6397;
      float var8 = var1.field6391 * this.field6386 + var1.field6394 * this.field6398 + this.field6391 * var1.field6387 + var1.field6395 * this.field6397;
      float var9 = this.field6386 * var1.field6397 + this.field6398 * var1.field6396 + this.field6391 * var1.field6393 + var1.field6388 * this.field6397;
      float var10 = var1.field6400 * this.field6393 + (var1.field6401 * this.field6387 + (var1.field6385 * this.field6401 + var1.field6398 * this.field6389));
      float var11 = this.field6393 * var1.field6399 + (this.field6387 * var1.field6389 + (this.field6401 * var1.field6392 + this.field6389 * var1.field6386));
      float var12 = var1.field6387 * this.field6387 + (var1.field6391 * this.field6389 + var1.field6394 * this.field6401) + this.field6393 * var1.field6395;
      float var13 = this.field6393 * var1.field6388 + (this.field6401 * var1.field6396 + this.field6389 * var1.field6397 + this.field6387 * var1.field6393);
      float var14 = this.field6388 * var1.field6400 + (var1.field6385 * this.field6400 + this.field6399 * var1.field6398 + this.field6395 * var1.field6401);
      float var15 = this.field6388 * var1.field6399 + (this.field6395 * var1.field6389 + (this.field6400 * var1.field6392 + this.field6399 * var1.field6386));
      float var16 = this.field6395 * var1.field6387 + (var1.field6394 * this.field6400 + this.field6399 * var1.field6391) + var1.field6395 * this.field6388;
      float var17 = var1.field6396 * this.field6400 + this.field6399 * var1.field6397 + this.field6395 * var1.field6393 + this.field6388 * var1.field6388;
      this.field6385 = var2;
      this.field6392 = var3;
      this.field6394 = var4;
      this.field6396 = var5;
      this.field6398 = var6;
      this.field6386 = var7;
      this.field6391 = var8;
      this.field6397 = var9;
      this.field6401 = var10;
      this.field6389 = var11;
      this.field6387 = var12;
      this.field6393 = var13;
      this.field6400 = var14;
      this.field6399 = var15;
      this.field6395 = var16;
      this.field6388 = var17;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Lux;)V")
   @ObfuscatedName("lb")
   public static void method11606(classUU var0, classUX var1) {
      if (var0 == null) {
         var0.method11571();
      }

      var0.field6385 = var1.field6422;
      var0.field6392 = var1.field6415;
      var0.field6394 = var1.field6414;
      var0.field6396 = 0.0F;
      var0.field6398 = var1.field6412;
      var0.field6386 = var1.field6416;
      var0.field6391 = var1.field6420;
      var0.field6397 = 0.0F;
      var0.field6401 = var1.field6421;
      var0.field6389 = var1.field6413;
      var0.field6387 = var1.field6411;
      var0.field6393 = 0.0F;
      var0.field6400 = var1.field6419;
      var0.field6399 = var1.field6418;
      var0.field6395 = var1.field6417;
      var0.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cs")
   public void method11596(classUU var1) {
      float var2 = this.field6396 * var1.field6400 + (var1.field6401 * this.field6394 + (this.field6385 * var1.field6385 + this.field6392 * var1.field6398));
      float var3 = this.field6394 * var1.field6389 + (this.field6392 * var1.field6386 + this.field6385 * var1.field6392) + var1.field6399 * this.field6396;
      float var4 = this.field6396 * var1.field6395 + (this.field6392 * var1.field6391 + var1.field6394 * this.field6385 + var1.field6387 * this.field6394);
      float var5 = this.field6394 * var1.field6393 + (var1.field6396 * this.field6385 + this.field6392 * var1.field6397) + this.field6396 * var1.field6388;
      float var6 = this.field6386 * var1.field6398 + this.field6398 * var1.field6385 + var1.field6401 * this.field6391 + var1.field6400 * this.field6397;
      float var7 = this.field6391 * var1.field6389 + (this.field6398 * var1.field6392 + this.field6386 * var1.field6386) + var1.field6399 * this.field6397;
      float var8 = var1.field6391 * this.field6386 + var1.field6394 * this.field6398 + this.field6391 * var1.field6387 + var1.field6395 * this.field6397;
      float var9 = this.field6386 * var1.field6397 + this.field6398 * var1.field6396 + this.field6391 * var1.field6393 + var1.field6388 * this.field6397;
      float var10 = var1.field6400 * this.field6393 + (var1.field6401 * this.field6387 + (var1.field6385 * this.field6401 + var1.field6398 * this.field6389));
      float var11 = this.field6393 * var1.field6399 + (this.field6387 * var1.field6389 + (this.field6401 * var1.field6392 + this.field6389 * var1.field6386));
      float var12 = var1.field6387 * this.field6387 + (var1.field6391 * this.field6389 + var1.field6394 * this.field6401) + this.field6393 * var1.field6395;
      float var13 = this.field6393 * var1.field6388 + (this.field6401 * var1.field6396 + this.field6389 * var1.field6397 + this.field6387 * var1.field6393);
      float var14 = this.field6388 * var1.field6400 + (var1.field6385 * this.field6400 + this.field6399 * var1.field6398 + this.field6395 * var1.field6401);
      float var15 = this.field6388 * var1.field6399 + (this.field6395 * var1.field6389 + (this.field6400 * var1.field6392 + this.field6399 * var1.field6386));
      float var16 = this.field6395 * var1.field6387 + (var1.field6394 * this.field6400 + this.field6399 * var1.field6391) + var1.field6395 * this.field6388;
      float var17 = var1.field6396 * this.field6400 + this.field6399 * var1.field6397 + this.field6395 * var1.field6393 + this.field6388 * var1.field6388;
      this.field6385 = var2;
      this.field6392 = var3;
      this.field6394 = var4;
      this.field6396 = var5;
      this.field6398 = var6;
      this.field6386 = var7;
      this.field6391 = var8;
      this.field6397 = var9;
      this.field6401 = var10;
      this.field6389 = var11;
      this.field6387 = var12;
      this.field6393 = var13;
      this.field6400 = var14;
      this.field6399 = var15;
      this.field6395 = var16;
      this.field6388 = var17;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Lxy;Z)V")
   @ObfuscatedName("qt")
   public static void method11561(classUU var0, classXY var1, boolean var2) {
      if (var0 == null) {
         var0.method11557();
      }

      if (var2) {
         classUX var3 = new classUX();
         int var6 = var1.method13050((byte)16);
         var6 &= 16383;
         float var5 = (float)(var6 * 3.834951969714103E-4);
         var3.method11681(var5, 173632492);
         int var9 = var1.method13050((byte)16);
         var9 &= 16383;
         float var8 = (float)(var9 * 3.834951969714103E-4);
         var3.method11686(var8, 982132619);
         int var12 = var1.method13050((byte)16);
         var12 &= 16383;
         float var11 = (float)(var12 * 3.834951969714103E-4);
         classUX.method11689(var3, var11, 1324180918);
         var3.method11693(var1.method13050((byte)16), var1.method13050((byte)16), var1.method13050((byte)16), (byte)98);
         var0.method11605(var3, -1959054899);
      } else {
         for (int var13 = 0; var13 < 16; var13++) {
            var0.field6403[var13] = var1.method13062(536070982);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         classUU var2 = (classUU)var1;
         return Float.compare(var2.field6385, this.field6385) == 0
            && Float.compare(var2.field6392, this.field6392) == 0
            && Float.compare(var2.field6394, this.field6394) == 0
            && Float.compare(var2.field6396, this.field6396) == 0
            && Float.compare(var2.field6398, this.field6398) == 0
            && Float.compare(var2.field6386, this.field6386) == 0
            && Float.compare(var2.field6391, this.field6391) == 0
            && Float.compare(var2.field6397, this.field6397) == 0
            && Float.compare(var2.field6401, this.field6401) == 0
            && Float.compare(var2.field6389, this.field6389) == 0
            && Float.compare(var2.field6387, this.field6387) == 0
            && Float.compare(var2.field6393, this.field6393) == 0
            && Float.compare(var2.field6400, this.field6400) == 0
            && Float.compare(var2.field6399, this.field6399) == 0
            && Float.compare(var2.field6395, this.field6395) == 0
            && Float.compare(var2.field6388, this.field6388) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.field6385,
         this.field6392,
         this.field6394,
         this.field6396,
         this.field6398,
         this.field6386,
         this.field6391,
         this.field6397,
         this.field6401,
         this.field6389,
         this.field6387,
         this.field6393,
         this.field6400,
         this.field6399,
         this.field6395,
         this.field6388
      );
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("la")
   public void method11600(classUL var1) {
      float var2 = var1.field6324 * var1.field6324;
      float var3 = var1.field6325 * var1.field6324;
      float var4 = var1.field6326 * var1.field6324;
      float var5 = var1.field6327 * var1.field6324;
      float var6 = var1.field6325 * var1.field6325;
      float var7 = var1.field6326 * var1.field6325;
      float var8 = var1.field6325 * var1.field6327;
      float var9 = var1.field6326 * var1.field6326;
      float var10 = var1.field6326 * var1.field6327;
      float var11 = var1.field6327 * var1.field6327;
      this.field6385 = var2 + var6 - var11 - var9;
      this.field6392 = var7 + var5 + var7 + var5;
      this.field6394 = var8 - var4 - var4 + var8;
      this.field6398 = var7 + (var7 - var5 - var5);
      this.field6386 = var2 + var9 - var6 - var11;
      this.field6391 = var3 + (var10 + var3 + var10);
      this.field6401 = var4 + (var8 + var4 + var8);
      this.field6389 = var10 - var3 - var3 + var10;
      this.field6387 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("cc")
   public void method11601(classUL var1) {
      float var2 = var1.field6324 * var1.field6324;
      float var3 = var1.field6325 * var1.field6324;
      float var4 = var1.field6326 * var1.field6324;
      float var5 = var1.field6327 * var1.field6324;
      float var6 = var1.field6325 * var1.field6325;
      float var7 = var1.field6326 * var1.field6325;
      float var8 = var1.field6325 * var1.field6327;
      float var9 = var1.field6326 * var1.field6326;
      float var10 = var1.field6326 * var1.field6327;
      float var11 = var1.field6327 * var1.field6327;
      this.field6385 = var2 + var6 - var11 - var9;
      this.field6392 = var7 + var5 + var7 + var5;
      this.field6394 = var8 - var4 - var4 + var8;
      this.field6398 = var7 + (var7 - var5 - var5);
      this.field6386 = var2 + var9 - var6 - var11;
      this.field6391 = var3 + (var10 + var3 + var10);
      this.field6401 = var4 + (var8 + var4 + var8);
      this.field6389 = var10 - var3 - var3 + var10;
      this.field6387 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("cf")
   public void method11602(classUL var1) {
      float var2 = var1.field6324 * var1.field6324;
      float var3 = var1.field6325 * var1.field6324;
      float var4 = var1.field6326 * var1.field6324;
      float var5 = var1.field6327 * var1.field6324;
      float var6 = var1.field6325 * var1.field6325;
      float var7 = var1.field6326 * var1.field6325;
      float var8 = var1.field6325 * var1.field6327;
      float var9 = var1.field6326 * var1.field6326;
      float var10 = var1.field6326 * var1.field6327;
      float var11 = var1.field6327 * var1.field6327;
      this.field6385 = var2 + var6 - var11 - var9;
      this.field6392 = var7 + var5 + var7 + var5;
      this.field6394 = var8 - var4 - var4 + var8;
      this.field6398 = var7 + (var7 - var5 - var5);
      this.field6386 = var2 + var9 - var6 - var11;
      this.field6391 = var3 + (var10 + var3 + var10);
      this.field6401 = var4 + (var8 + var4 + var8);
      this.field6389 = var10 - var3 - var3 + var10;
      this.field6387 = var2 + var11 - var9 - var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;FFFF)V")
   @ObfuscatedName("bd")
   public static void method11614(classUU var0, float var1, float var2, float var3, float var4) {
      if (var0 == null) {
         var0.method11632();
      }

      var0.field6385 = var1;
      var0.field6392 = 0.0F;
      var0.field6394 = 0.0F;
      var0.field6396 = 0.0F;
      var0.field6398 = 0.0F;
      var0.field6386 = var2;
      var0.field6391 = 0.0F;
      var0.field6397 = 0.0F;
      var0.field6401 = 0.0F;
      var0.field6389 = 0.0F;
      var0.field6387 = var3;
      var0.field6393 = 0.0F;
      var0.field6400 = 0.0F;
      var0.field6399 = 0.0F;
      var0.field6395 = 0.0F;
      var0.field6388 = var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Luu;)V")
   @ObfuscatedName("ey")
   public static void method11583(classUU var0, classUU var1) {
      System.arraycopy(var1.field6403, 0, var0.field6403, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method11610() {
      float var1 = 1.0F / this.method11608((byte)-28);
      float var2 = (
            this.field6388 * (this.field6387 * this.field6386)
               - this.field6393 * this.field6386 * this.field6395
               - this.field6391 * this.field6389 * this.field6388
               + this.field6399 * (this.field6391 * this.field6393)
               + this.field6397 * this.field6389 * this.field6395
               - this.field6399 * (this.field6387 * this.field6397)
         )
         * var1;
      float var3 = (
            this.field6396 * this.field6387 * this.field6399
               + (
                  this.field6395 * (this.field6392 * this.field6393)
                     + -this.field6392 * this.field6387 * this.field6388
                     + this.field6388 * (this.field6394 * this.field6389)
                     - this.field6399 * (this.field6393 * this.field6394)
                     - this.field6395 * (this.field6396 * this.field6389)
               )
         )
         * var1;
      float var4 = var1
         * (
            this.field6394 * this.field6397 * this.field6399
               + (
                  this.field6392 * this.field6391 * this.field6388
                     - this.field6392 * this.field6397 * this.field6395
                     - this.field6388 * (this.field6386 * this.field6394)
               )
               + this.field6386 * this.field6396 * this.field6395
               - this.field6396 * this.field6391 * this.field6399
         );
      float var5 = var1
         * (
            this.field6391 * -this.field6392 * this.field6393
               + this.field6387 * (this.field6392 * this.field6397)
               + this.field6393 * (this.field6386 * this.field6394)
               - this.field6394 * this.field6397 * this.field6389
               - this.field6387 * (this.field6396 * this.field6386)
               + this.field6391 * this.field6396 * this.field6389
         );
      float var6 = (
            this.field6391 * this.field6401 * this.field6388
               + (this.field6387 * -this.field6398 * this.field6388 + this.field6398 * this.field6393 * this.field6395)
               - this.field6400 * (this.field6393 * this.field6391)
               - this.field6401 * this.field6397 * this.field6395
               + this.field6397 * this.field6387 * this.field6400
         )
         * var1;
      float var7 = (
            this.field6400 * (this.field6393 * this.field6394)
               + (
                  this.field6388 * (this.field6385 * this.field6387)
                     - this.field6395 * (this.field6393 * this.field6385)
                     - this.field6394 * this.field6401 * this.field6388
               )
               + this.field6401 * this.field6396 * this.field6395
               - this.field6400 * (this.field6387 * this.field6396)
         )
         * var1;
      float var8 = (
            this.field6395 * (this.field6385 * this.field6397)
               + -this.field6385 * this.field6391 * this.field6388
               + this.field6394 * this.field6398 * this.field6388
               - this.field6394 * this.field6397 * this.field6400
               - this.field6396 * this.field6398 * this.field6395
               + this.field6400 * (this.field6396 * this.field6391)
         )
         * var1;
      float var9 = var1
         * (
            this.field6387 * (this.field6396 * this.field6398)
               + (
                  this.field6393 * (this.field6385 * this.field6391)
                     - this.field6397 * this.field6385 * this.field6387
                     - this.field6394 * this.field6398 * this.field6393
                     + this.field6394 * this.field6397 * this.field6401
               )
               - this.field6396 * this.field6391 * this.field6401
         );
      float var10 = (
            this.field6398 * this.field6389 * this.field6388
               - this.field6393 * this.field6398 * this.field6399
               - this.field6388 * (this.field6386 * this.field6401)
               + this.field6386 * this.field6393 * this.field6400
               + this.field6399 * (this.field6397 * this.field6401)
               - this.field6397 * this.field6389 * this.field6400
         )
         * var1;
      float var11 = (
            this.field6400 * (this.field6396 * this.field6389)
               + (
                  this.field6399 * (this.field6393 * this.field6385)
                     + this.field6388 * (this.field6389 * -this.field6385)
                     + this.field6392 * this.field6401 * this.field6388
                     - this.field6400 * (this.field6392 * this.field6393)
                     - this.field6401 * this.field6396 * this.field6399
               )
         )
         * var1;
      float var12 = (
            this.field6385 * this.field6386 * this.field6388
               - this.field6397 * this.field6385 * this.field6399
               - this.field6398 * this.field6392 * this.field6388
               + this.field6400 * (this.field6397 * this.field6392)
               + this.field6399 * (this.field6396 * this.field6398)
               - this.field6400 * (this.field6386 * this.field6396)
         )
         * var1;
      float var13 = var1
         * (
            this.field6393 * (this.field6392 * this.field6398)
               + (this.field6393 * (-this.field6385 * this.field6386) + this.field6397 * this.field6385 * this.field6389)
               - this.field6401 * (this.field6392 * this.field6397)
               - this.field6398 * this.field6396 * this.field6389
               + this.field6401 * (this.field6396 * this.field6386)
         );
      float var14 = var1
         * (
            this.field6391 * this.field6389 * this.field6400
               + (
                  this.field6395 * (this.field6386 * this.field6401)
                     + (this.field6398 * this.field6387 * this.field6399 + this.field6389 * -this.field6398 * this.field6395)
                     - this.field6386 * this.field6387 * this.field6400
                     - this.field6399 * (this.field6391 * this.field6401)
               )
         );
      float var15 = (
            this.field6389 * this.field6385 * this.field6395
               - this.field6387 * this.field6385 * this.field6399
               - this.field6395 * (this.field6401 * this.field6392)
               + this.field6400 * (this.field6392 * this.field6387)
               + this.field6394 * this.field6401 * this.field6399
               - this.field6394 * this.field6389 * this.field6400
         )
         * var1;
      float var16 = var1
         * (
            this.field6391 * this.field6385 * this.field6399
               + this.field6386 * -this.field6385 * this.field6395
               + this.field6392 * this.field6398 * this.field6395
               - this.field6400 * (this.field6392 * this.field6391)
               - this.field6394 * this.field6398 * this.field6399
               + this.field6400 * (this.field6386 * this.field6394)
         );
      float var17 = var1
         * (
            this.field6385 * this.field6386 * this.field6387
               - this.field6389 * (this.field6391 * this.field6385)
               - this.field6387 * (this.field6392 * this.field6398)
               + this.field6391 * this.field6392 * this.field6401
               + this.field6398 * this.field6394 * this.field6389
               - this.field6401 * (this.field6394 * this.field6386)
         );
      this.field6385 = var2;
      this.field6392 = var3;
      this.field6394 = var4;
      this.field6396 = var5;
      this.field6398 = var6;
      this.field6386 = var7;
      this.field6391 = var8;
      this.field6397 = var9;
      this.field6401 = var10;
      this.field6389 = var11;
      this.field6387 = var12;
      this.field6393 = var13;
      this.field6400 = var14;
      this.field6399 = var15;
      this.field6395 = var16;
      this.field6388 = var17;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Lux;)V")
   @ObfuscatedName("tw")
   public static void method11607(classUU var0, classUX var1) {
      if (var0 == null) {
         var0.method11580();
      } else {
         var0.field6385 = var1.field6422;
         var0.field6392 = var1.field6415;
         var0.field6394 = var1.field6414;
         var0.field6396 = 0.0F;
         var0.field6398 = var1.field6412;
         var0.field6386 = var1.field6416;
         var0.field6391 = var1.field6420;
         var0.field6397 = 0.0F;
         var0.field6401 = var1.field6421;
         var0.field6389 = var1.field6413;
         var0.field6387 = var1.field6411;
         var0.field6393 = 0.0F;
         var0.field6400 = var1.field6419;
         var0.field6399 = var1.field6418;
         var0.field6395 = var1.field6417;
         var0.field6388 = 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   public void method11611() {
      float var1 = 1.0F / this.method11608((byte)-103);
      float var2 = (
            this.field6388 * (this.field6387 * this.field6386)
               - this.field6393 * this.field6386 * this.field6395
               - this.field6391 * this.field6389 * this.field6388
               + this.field6399 * (this.field6391 * this.field6393)
               + this.field6397 * this.field6389 * this.field6395
               - this.field6399 * (this.field6387 * this.field6397)
         )
         * var1;
      float var3 = (
            this.field6396 * this.field6387 * this.field6399
               + (
                  this.field6395 * (this.field6392 * this.field6393)
                     + -this.field6392 * this.field6387 * this.field6388
                     + this.field6388 * (this.field6394 * this.field6389)
                     - this.field6399 * (this.field6393 * this.field6394)
                     - this.field6395 * (this.field6396 * this.field6389)
               )
         )
         * var1;
      float var4 = var1
         * (
            this.field6394 * this.field6397 * this.field6399
               + (
                  this.field6392 * this.field6391 * this.field6388
                     - this.field6392 * this.field6397 * this.field6395
                     - this.field6388 * (this.field6386 * this.field6394)
               )
               + this.field6386 * this.field6396 * this.field6395
               - this.field6396 * this.field6391 * this.field6399
         );
      float var5 = var1
         * (
            this.field6391 * -this.field6392 * this.field6393
               + this.field6387 * (this.field6392 * this.field6397)
               + this.field6393 * (this.field6386 * this.field6394)
               - this.field6394 * this.field6397 * this.field6389
               - this.field6387 * (this.field6396 * this.field6386)
               + this.field6391 * this.field6396 * this.field6389
         );
      float var6 = (
            this.field6391 * this.field6401 * this.field6388
               + (this.field6387 * -this.field6398 * this.field6388 + this.field6398 * this.field6393 * this.field6395)
               - this.field6400 * (this.field6393 * this.field6391)
               - this.field6401 * this.field6397 * this.field6395
               + this.field6397 * this.field6387 * this.field6400
         )
         * var1;
      float var7 = (
            this.field6400 * (this.field6393 * this.field6394)
               + (
                  this.field6388 * (this.field6385 * this.field6387)
                     - this.field6395 * (this.field6393 * this.field6385)
                     - this.field6394 * this.field6401 * this.field6388
               )
               + this.field6401 * this.field6396 * this.field6395
               - this.field6400 * (this.field6387 * this.field6396)
         )
         * var1;
      float var8 = (
            this.field6395 * (this.field6385 * this.field6397)
               + -this.field6385 * this.field6391 * this.field6388
               + this.field6394 * this.field6398 * this.field6388
               - this.field6394 * this.field6397 * this.field6400
               - this.field6396 * this.field6398 * this.field6395
               + this.field6400 * (this.field6396 * this.field6391)
         )
         * var1;
      float var9 = var1
         * (
            this.field6387 * (this.field6396 * this.field6398)
               + (
                  this.field6393 * (this.field6385 * this.field6391)
                     - this.field6397 * this.field6385 * this.field6387
                     - this.field6394 * this.field6398 * this.field6393
                     + this.field6394 * this.field6397 * this.field6401
               )
               - this.field6396 * this.field6391 * this.field6401
         );
      float var10 = (
            this.field6398 * this.field6389 * this.field6388
               - this.field6393 * this.field6398 * this.field6399
               - this.field6388 * (this.field6386 * this.field6401)
               + this.field6386 * this.field6393 * this.field6400
               + this.field6399 * (this.field6397 * this.field6401)
               - this.field6397 * this.field6389 * this.field6400
         )
         * var1;
      float var11 = (
            this.field6400 * (this.field6396 * this.field6389)
               + (
                  this.field6399 * (this.field6393 * this.field6385)
                     + this.field6388 * (this.field6389 * -this.field6385)
                     + this.field6392 * this.field6401 * this.field6388
                     - this.field6400 * (this.field6392 * this.field6393)
                     - this.field6401 * this.field6396 * this.field6399
               )
         )
         * var1;
      float var12 = (
            this.field6385 * this.field6386 * this.field6388
               - this.field6397 * this.field6385 * this.field6399
               - this.field6398 * this.field6392 * this.field6388
               + this.field6400 * (this.field6397 * this.field6392)
               + this.field6399 * (this.field6396 * this.field6398)
               - this.field6400 * (this.field6386 * this.field6396)
         )
         * var1;
      float var13 = var1
         * (
            this.field6393 * (this.field6392 * this.field6398)
               + (this.field6393 * (-this.field6385 * this.field6386) + this.field6397 * this.field6385 * this.field6389)
               - this.field6401 * (this.field6392 * this.field6397)
               - this.field6398 * this.field6396 * this.field6389
               + this.field6401 * (this.field6396 * this.field6386)
         );
      float var14 = var1
         * (
            this.field6391 * this.field6389 * this.field6400
               + (
                  this.field6395 * (this.field6386 * this.field6401)
                     + (this.field6398 * this.field6387 * this.field6399 + this.field6389 * -this.field6398 * this.field6395)
                     - this.field6386 * this.field6387 * this.field6400
                     - this.field6399 * (this.field6391 * this.field6401)
               )
         );
      float var15 = (
            this.field6389 * this.field6385 * this.field6395
               - this.field6387 * this.field6385 * this.field6399
               - this.field6395 * (this.field6401 * this.field6392)
               + this.field6400 * (this.field6392 * this.field6387)
               + this.field6394 * this.field6401 * this.field6399
               - this.field6394 * this.field6389 * this.field6400
         )
         * var1;
      float var16 = var1
         * (
            this.field6391 * this.field6385 * this.field6399
               + this.field6386 * -this.field6385 * this.field6395
               + this.field6392 * this.field6398 * this.field6395
               - this.field6400 * (this.field6392 * this.field6391)
               - this.field6394 * this.field6398 * this.field6399
               + this.field6400 * (this.field6386 * this.field6394)
         );
      float var17 = var1
         * (
            this.field6385 * this.field6386 * this.field6387
               - this.field6389 * (this.field6391 * this.field6385)
               - this.field6387 * (this.field6392 * this.field6398)
               + this.field6391 * this.field6392 * this.field6401
               + this.field6398 * this.field6394 * this.field6389
               - this.field6401 * (this.field6394 * this.field6386)
         );
      this.field6385 = var2;
      this.field6392 = var3;
      this.field6394 = var4;
      this.field6396 = var5;
      this.field6398 = var6;
      this.field6386 = var7;
      this.field6391 = var8;
      this.field6397 = var9;
      this.field6401 = var10;
      this.field6389 = var11;
      this.field6387 = var12;
      this.field6393 = var13;
      this.field6400 = var14;
      this.field6399 = var15;
      this.field6395 = var16;
      this.field6388 = var17;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   public void method11612() {
      float var1 = 1.0F / this.method11608((byte)-94);
      float var2 = (
            this.field6388 * (this.field6387 * this.field6386)
               - this.field6393 * this.field6386 * this.field6395
               - this.field6391 * this.field6389 * this.field6388
               + this.field6399 * (this.field6391 * this.field6393)
               + this.field6397 * this.field6389 * this.field6395
               - this.field6399 * (this.field6387 * this.field6397)
         )
         * var1;
      float var3 = (
            this.field6396 * this.field6387 * this.field6399
               + (
                  this.field6395 * (this.field6392 * this.field6393)
                     + -this.field6392 * this.field6387 * this.field6388
                     + this.field6388 * (this.field6394 * this.field6389)
                     - this.field6399 * (this.field6393 * this.field6394)
                     - this.field6395 * (this.field6396 * this.field6389)
               )
         )
         * var1;
      float var4 = var1
         * (
            this.field6394 * this.field6397 * this.field6399
               + (
                  this.field6392 * this.field6391 * this.field6388
                     - this.field6392 * this.field6397 * this.field6395
                     - this.field6388 * (this.field6386 * this.field6394)
               )
               + this.field6386 * this.field6396 * this.field6395
               - this.field6396 * this.field6391 * this.field6399
         );
      float var5 = var1
         * (
            this.field6391 * -this.field6392 * this.field6393
               + this.field6387 * (this.field6392 * this.field6397)
               + this.field6393 * (this.field6386 * this.field6394)
               - this.field6394 * this.field6397 * this.field6389
               - this.field6387 * (this.field6396 * this.field6386)
               + this.field6391 * this.field6396 * this.field6389
         );
      float var6 = (
            this.field6391 * this.field6401 * this.field6388
               + (this.field6387 * -this.field6398 * this.field6388 + this.field6398 * this.field6393 * this.field6395)
               - this.field6400 * (this.field6393 * this.field6391)
               - this.field6401 * this.field6397 * this.field6395
               + this.field6397 * this.field6387 * this.field6400
         )
         * var1;
      float var7 = (
            this.field6400 * (this.field6393 * this.field6394)
               + (
                  this.field6388 * (this.field6385 * this.field6387)
                     - this.field6395 * (this.field6393 * this.field6385)
                     - this.field6394 * this.field6401 * this.field6388
               )
               + this.field6401 * this.field6396 * this.field6395
               - this.field6400 * (this.field6387 * this.field6396)
         )
         * var1;
      float var8 = (
            this.field6395 * (this.field6385 * this.field6397)
               + -this.field6385 * this.field6391 * this.field6388
               + this.field6394 * this.field6398 * this.field6388
               - this.field6394 * this.field6397 * this.field6400
               - this.field6396 * this.field6398 * this.field6395
               + this.field6400 * (this.field6396 * this.field6391)
         )
         * var1;
      float var9 = var1
         * (
            this.field6387 * (this.field6396 * this.field6398)
               + (
                  this.field6393 * (this.field6385 * this.field6391)
                     - this.field6397 * this.field6385 * this.field6387
                     - this.field6394 * this.field6398 * this.field6393
                     + this.field6394 * this.field6397 * this.field6401
               )
               - this.field6396 * this.field6391 * this.field6401
         );
      float var10 = (
            this.field6398 * this.field6389 * this.field6388
               - this.field6393 * this.field6398 * this.field6399
               - this.field6388 * (this.field6386 * this.field6401)
               + this.field6386 * this.field6393 * this.field6400
               + this.field6399 * (this.field6397 * this.field6401)
               - this.field6397 * this.field6389 * this.field6400
         )
         * var1;
      float var11 = (
            this.field6400 * (this.field6396 * this.field6389)
               + (
                  this.field6399 * (this.field6393 * this.field6385)
                     + this.field6388 * (this.field6389 * -this.field6385)
                     + this.field6392 * this.field6401 * this.field6388
                     - this.field6400 * (this.field6392 * this.field6393)
                     - this.field6401 * this.field6396 * this.field6399
               )
         )
         * var1;
      float var12 = (
            this.field6385 * this.field6386 * this.field6388
               - this.field6397 * this.field6385 * this.field6399
               - this.field6398 * this.field6392 * this.field6388
               + this.field6400 * (this.field6397 * this.field6392)
               + this.field6399 * (this.field6396 * this.field6398)
               - this.field6400 * (this.field6386 * this.field6396)
         )
         * var1;
      float var13 = var1
         * (
            this.field6393 * (this.field6392 * this.field6398)
               + (this.field6393 * (-this.field6385 * this.field6386) + this.field6397 * this.field6385 * this.field6389)
               - this.field6401 * (this.field6392 * this.field6397)
               - this.field6398 * this.field6396 * this.field6389
               + this.field6401 * (this.field6396 * this.field6386)
         );
      float var14 = var1
         * (
            this.field6391 * this.field6389 * this.field6400
               + (
                  this.field6395 * (this.field6386 * this.field6401)
                     + (this.field6398 * this.field6387 * this.field6399 + this.field6389 * -this.field6398 * this.field6395)
                     - this.field6386 * this.field6387 * this.field6400
                     - this.field6399 * (this.field6391 * this.field6401)
               )
         );
      float var15 = (
            this.field6389 * this.field6385 * this.field6395
               - this.field6387 * this.field6385 * this.field6399
               - this.field6395 * (this.field6401 * this.field6392)
               + this.field6400 * (this.field6392 * this.field6387)
               + this.field6394 * this.field6401 * this.field6399
               - this.field6394 * this.field6389 * this.field6400
         )
         * var1;
      float var16 = var1
         * (
            this.field6391 * this.field6385 * this.field6399
               + this.field6386 * -this.field6385 * this.field6395
               + this.field6392 * this.field6398 * this.field6395
               - this.field6400 * (this.field6392 * this.field6391)
               - this.field6394 * this.field6398 * this.field6399
               + this.field6400 * (this.field6386 * this.field6394)
         );
      float var17 = var1
         * (
            this.field6385 * this.field6386 * this.field6387
               - this.field6389 * (this.field6391 * this.field6385)
               - this.field6387 * (this.field6392 * this.field6398)
               + this.field6391 * this.field6392 * this.field6401
               + this.field6398 * this.field6394 * this.field6389
               - this.field6401 * (this.field6394 * this.field6386)
         );
      this.field6385 = var2;
      this.field6392 = var3;
      this.field6394 = var4;
      this.field6396 = var5;
      this.field6398 = var6;
      this.field6386 = var7;
      this.field6391 = var8;
      this.field6397 = var9;
      this.field6401 = var10;
      this.field6389 = var11;
      this.field6387 = var12;
      this.field6393 = var13;
      this.field6400 = var14;
      this.field6399 = var15;
      this.field6395 = var16;
      this.field6388 = var17;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cd")
   public void method11592(classUU var1) {
      for (int var2 = 0; var2 < this.field6403.length; var2++) {
         this.field6403[var2] = this.field6403[var2] + var1.field6403[var2];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)[F")
   @ObfuscatedName("ct")
   public static float[] method11566(classUU var0) {
      if (var0 == null) {
         var0.method11653();
      }

      float[] var1 = new float[3];
      if (var0.field6394 < 0.999 && var0.field6394 > -0.999) {
         var1[1] = (float)(-Math.asin(var0.field6394));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(var0.field6391 / var2, var0.field6387 / var2);
         var1[2] = (float)Math.atan2(var0.field6392 / var2, var0.field6385 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(var0.field6394, 0.0);
         var1[2] = (float)Math.atan2(-var0.field6389, var0.field6386);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lug;I)V")
   @ObfuscatedName("aq")
   public void method11642(classUG var1, int var2) {
      float var3 = var1.field6305.field6324 * var1.field6305.field6324;
      float var4 = var1.field6305.field6324 * var1.field6305.field6325;
      float var5 = var1.field6305.field6326 * var1.field6305.field6324;
      float var6 = var1.field6305.field6327 * var1.field6305.field6324;
      float var7 = var1.field6305.field6325 * var1.field6305.field6325;
      float var8 = var1.field6305.field6326 * var1.field6305.field6325;
      float var9 = var1.field6305.field6327 * var1.field6305.field6325;
      float var10 = var1.field6305.field6326 * var1.field6305.field6326;
      float var11 = var1.field6305.field6327 * var1.field6305.field6326;
      float var12 = var1.field6305.field6327 * var1.field6305.field6327;
      this.field6385 = var3 + var7 - var12 - var10;
      this.field6392 = var6 + var8 + var6 + var8;
      this.field6394 = var9 - var5 - var5 + var9;
      this.field6398 = var8 - var6 - var6 + var8;
      this.field6386 = var3 + var10 - var7 - var12;
      this.field6391 = var11 + var11 + var4 + var4;
      this.field6401 = var9 + var9 + var5 + var5;
      this.field6389 = var11 - var4 - var4 + var11;
      this.field6387 = var3 + var12 - var10 - var7;
      this.field6393 = 0.0F;
      this.field6397 = 0.0F;
      this.field6396 = 0.0F;
      this.field6400 = var1.field6307.field6427;
      this.field6399 = var1.field6307.field6425;
      this.field6395 = var1.field6307.field6426;
      this.field6388 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("ce")
   public classUZ method11621(float var1, float var2, float var3) {
      float var4 = 1.0F / (this.field6388 + (var2 * this.field6397 + var1 * this.field6396 + this.field6393 * var3));
      return classIK.method6218(
         var4 * (this.field6400 + (this.field6385 * var1 + var2 * this.field6398 + this.field6401 * var3)),
         var4 * (this.field6399 + (this.field6392 * var1 + var2 * this.field6386 + var3 * this.field6389)),
         (this.field6395 + (var3 * this.field6387 + (this.field6391 * var2 + var1 * this.field6394))) * var4,
         (byte)-64
      );
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method11634() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + Arrays.hashCode(this.field6403);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("oj")
   public static void method11558(classUU var0) {
      if (var0 == null) {
         var0.method11639();
      }

      synchronized (field6382) {
         if (field6383 * -2060926419 < -82390220 * field6381) {
            field6382[(field6383 += 1681980045) * -2072202381 - 1] = var0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("dg")
   public void method11658(classUU var1) {
      this.method11641(var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cb")
   public void method11587(float var1) {
      this.method11588(var1, var1, var1, -2129160486);
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("hk")
   public float method11627(float var1, float var2, float var3) {
      return this.field6387 * var3 + (this.field6391 * var2 + var1 * this.field6394) + this.field6395;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("du")
   public float[] method11638() {
      float[] var1 = new float[3];
      classUZ var2 = new classUZ(this.field6385, this.field6392, this.field6394);
      classUZ var3 = new classUZ(this.field6398, this.field6386, this.field6391);
      classUZ var4 = new classUZ(this.field6401, this.field6389, this.field6387);
      var1[0] = var2.method11774(-1808401369);
      var1[1] = var3.method11774(-1808401369);
      var1[2] = var4.method11774(-1808401369);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bq")
   public float[] method11639() {
      float[] var1 = new float[3];
      classUZ var2 = new classUZ(this.field6385, this.field6392, this.field6394);
      classUZ var3 = new classUZ(this.field6398, this.field6386, this.field6391);
      classUZ var4 = new classUZ(this.field6401, this.field6389, this.field6387);
      var1[0] = var2.method11774(-1808401369);
      var1[1] = var3.method11774(-1808401369);
      var1[2] = var4.method11774(-1808401369);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("mi")
   public static classUU method11645() {
      synchronized (field6382) {
         if (field6383 * -1618719293 == 0) {
            return new classUU();
         } else {
            classUU[] var10000 = field6382;
            int var10001 = field6383 * -1618719293 - 1;
            field6383 = (field6383 * -1618719293 - 1) * 943786731;
            classUU var1 = var10000[var10001];
            var1.method11663();
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bi")
   public float[] method11640() {
      float[] var1 = new float[3];
      classUZ var2 = new classUZ(this.field6385, this.field6392, this.field6394);
      classUZ var3 = new classUZ(this.field6398, this.field6386, this.field6391);
      classUZ var4 = new classUZ(this.field6401, this.field6389, this.field6387);
      var1[0] = var2.method11774(-1808401369);
      var1[1] = var3.method11774(-1808401369);
      var1[2] = var4.method11774(-1808401369);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)Luu;")
   @ObfuscatedName("jn")
   public static classUU method11643(classUU var0) {
      synchronized (field6382) {
         if (field6383 * -1618719293 == 0) {
            return new classUU(var0);
         } else {
            classUU[] var10000 = field6382;
            int var10001 = field6383 * -1618719293 - 1;
            field6383 = (field6383 * -1618719293 - 1) * 943786731;
            classUU var2 = var10000[var10001];
            var2.method11649(var0);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("ej")
   public void method11659(float var1, float var2, float var3) {
      this.method11588(var1, var2, var3, -2138377657);
   }

   @ObfuscatedSignature(descriptor = "(Lom;I)Z")
   @ObfuscatedName("ae")
   static boolean method11554(classOM var0, int var1) {
      try {
         if (var0.field4930 != null) {
            if (var1 != 1217057510) {
               throw new IllegalStateException();
            }

            int[] var2 = var0.field4930;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 != 1217057510) {
                  throw new IllegalStateException();
               }

               int var4 = var2[var3];
               classOM var5 = classMU.method7729(var4, 1688742965);
               if (var5.field4953 * 1412472849 != -1) {
                  if (var1 != 1217057510) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         } else if (1412472849 * var0.field4953 != -1) {
            if (var1 != 1217057510) {
               throw new IllegalStateException();
            }

            return true;
         }

         return false;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[F")
   @ObfuscatedName("ag")
   float[] method11567(byte var1) {
      try {
         float[] var2 = new float[3];
         if (this.field6394 < 0.999) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            if (this.field6400 > -0.999) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)(-Math.asin(this.field6385));
               double var3 = Math.cos(var2[1]);
               var2[0] = (float)Math.atan2(this.field6396 / var3, this.field6393 / var3);
               var2[2] = (float)Math.atan2(this.field6385 / var3, this.field6393 / var3);
               return var2;
            }
         }

         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2(this.field6400, 0.0);
         var2[2] = (float)Math.atan2(-this.field6401, this.field6401);
         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   public void method11578(int var1) {
      try {
         this.field6391 = 1.0F;
         this.field6389 = 0.0F;
         this.field6398 = 0.0F;
         this.field6397 = 0.0F;
         this.field6391 = 0.0F;
         this.field6393 = 1.0F;
         this.field6387 = 0.0F;
         this.field6388 = 0.0F;
         this.field6401 = 0.0F;
         this.field6401 = 0.0F;
         this.field6400 = 1.0F;
         this.field6395 = 0.0F;
         this.field6399 = 0.0F;
         this.field6389 = 0.0F;
         this.field6400 = 0.0F;
         this.field6389 = 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uu.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   public void method11559() {
      synchronized (field6382) {
         if (field6383 * -1618719293 < -711449127 * field6402) {
            field6382[(field6383 += 943786731) * -1618719293 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("qz")
   public float method11660(float var1, float var2, float var3) {
      return this.method11623(var1, var2, var3, 1097366312);
   }

   @ObfuscatedSignature(descriptor = "(Lux;)V")
   @ObfuscatedName("sk")
   public void method11661(classUX var1) {
      this.method11605(var1, -1959054899);
   }

   @ObfuscatedSignature(descriptor = "(Luu;I)V")
   @ObfuscatedName("ay")
   public void method11597(classUU var1, int var2) {
      try {
         float var3 = this.field6397 * var1.field6389 + (var1.field6397 * this.field6399 + (this.field6386 * var1.field6396 + this.field6395 * var1.field6389));
         float var4 = this.field6395 * var1.field6395 + (this.field6398 * var1.field6398 + this.field6397 * var1.field6401) + var1.field6386 * this.field6398;
         float var5 = this.field6394 * var1.field6395 + (this.field6398 * var1.field6396 + var1.field6398 * this.field6393 + var1.field6400 * this.field6398);
         float var6 = this.field6387 * var1.field6399 + (var1.field6392 * this.field6394 + this.field6396 * var1.field6398) + this.field6395 * var1.field6395;
         float var7 = this.field6392 * var1.field6396 + this.field6389 * var1.field6393 + var1.field6400 * this.field6389 + var1.field6398 * this.field6387;
         float var8 = this.field6388 * var1.field6392 + (this.field6394 * var1.field6397 + this.field6391 * var1.field6388) + var1.field6394 * this.field6393;
         float var9 = var1.field6395 * this.field6400 + var1.field6387 * this.field6388 + this.field6386 * var1.field6401 + var1.field6385 * this.field6393;
         float var10 = this.field6388 * var1.field6396 + this.field6397 * var1.field6398 + this.field6401 * var1.field6398 + var1.field6391 * this.field6394;
         float var11 = var1.field6393 * this.field6397
            + (var1.field6387 * this.field6393 + (var1.field6396 * this.field6397 + var1.field6401 * this.field6395));
         float var12 = this.field6386 * var1.field6399
            + (this.field6399 * var1.field6386 + (this.field6399 * var1.field6401 + this.field6385 * var1.field6400));
         float var13 = var1.field6399 * this.field6385 + (var1.field6387 * this.field6400 + var1.field6385 * this.field6395) + this.field6392 * var1.field6399;
         float var14 = this.field6395 * var1.field6397 + (this.field6386 * var1.field6388 + this.field6389 * var1.field6387 + this.field6389 * var1.field6389);
         float var15 = this.field6394 * var1.field6401 + (var1.field6393 * this.field6387 + this.field6394 * var1.field6389 + this.field6393 * var1.field6401);
         float var16 = this.field6393 * var1.field6387
            + (this.field6396 * var1.field6391 + (this.field6394 * var1.field6385 + this.field6401 * var1.field6399));
         float var17 = this.field6394 * var1.field6395 + (var1.field6400 * this.field6393 + this.field6397 * var1.field6385) + var1.field6393 * this.field6392;
         float var18 = var1.field6392 * this.field6386 + this.field6391 * var1.field6400 + this.field6395 * var1.field6394 + this.field6387 * var1.field6385;
         this.field6391 = var3;
         this.field6397 = var4;
         this.field6397 = var5;
         this.field6399 = var6;
         this.field6397 = var7;
         this.field6387 = var8;
         this.field6385 = var9;
         this.field6387 = var10;
         this.field6401 = var11;
         this.field6398 = var12;
         this.field6401 = var13;
         this.field6387 = var14;
         this.field6397 = var15;
         this.field6391 = var16;
         this.field6391 = var17;
         this.field6389 = var18;
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "uu.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFI)V")
   @ObfuscatedName("ar")
   public void method11615(float var1, float var2, float var3, float var4, int var5) {
      try {
         this.field6397 = var1;
         this.field6396 = 0.0F;
         this.field6392 = 0.0F;
         this.field6398 = 0.0F;
         this.field6388 = 0.0F;
         this.field6398 = var2;
         this.field6387 = 0.0F;
         this.field6387 = 0.0F;
         this.field6396 = 0.0F;
         this.field6399 = 0.0F;
         this.field6397 = var3;
         this.field6386 = 0.0F;
         this.field6395 = 0.0F;
         this.field6387 = 0.0F;
         this.field6395 = 0.0F;
         this.field6395 = var4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uu.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;B)V")
   @ObfuscatedName("aa")
   public void method11646(classUU var1, byte var2) {
      this.field6397 = var1.field6399;
      this.field6397 = var1.field6386;
      this.field6385 = var1.field6398;
      this.field6393 = var1.field6385;
      this.field6389 = var1.field6393;
      this.field6397 = var1.field6388;
      this.field6386 = var1.field6398;
      this.field6399 = var1.field6392;
      this.field6396 = var1.field6393;
      this.field6388 = var1.field6387;
      this.field6395 = var1.field6394;
      this.field6395 = var1.field6391;
      this.field6397 = var1.field6401;
      this.field6385 = var1.field6387;
      this.field6401 = var1.field6396;
      this.field6387 = var1.field6397;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   public void method11662() {
      this.method11555(2033466195);
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("cy")
   public void method11584(classUU var1) {
      System.arraycopy(var1.field6403, 0, this.field6403, 0, 16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Lul;)V")
   @ObfuscatedName("pj")
   public static void method11603(classUU var0, classUL var1) {
      if (var0 == null) {
         var0.method11604(var1);
      }

      float var2 = var1.field6324 * var1.field6324;
      float var3 = var1.field6325 * var1.field6324;
      float var4 = var1.field6326 * var1.field6324;
      float var5 = var1.field6327 * var1.field6324;
      float var6 = var1.field6325 * var1.field6325;
      float var7 = var1.field6326 * var1.field6325;
      float var8 = var1.field6325 * var1.field6327;
      float var9 = var1.field6326 * var1.field6326;
      float var10 = var1.field6326 * var1.field6327;
      float var11 = var1.field6327 * var1.field6327;
      var0.field6385 = var2 + var6 - var11 - var9;
      var0.field6392 = var7 + var5 + var7 + var5;
      var0.field6394 = var8 - var4 - var4 + var8;
      var0.field6398 = var7 + (var7 - var5 - var5);
      var0.field6386 = var2 + var9 - var6 - var11;
      var0.field6391 = var3 + (var10 + var3 + var10);
      var0.field6401 = var4 + (var8 + var4 + var8);
      var0.field6389 = var10 - var3 - var3 + var10;
      var0.field6387 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("ck")
   public void method11604(classUL var1) {
      float var2 = var1.field6325 * var1.field6327;
      float var3 = var1.field6326 * var1.field6325;
      float var4 = var1.field6324 * var1.field6327;
      float var5 = var1.field6324 * var1.field6327;
      float var6 = var1.field6324 * var1.field6327;
      float var7 = var1.field6325 * var1.field6324;
      float var8 = var1.field6327 * var1.field6326;
      float var9 = var1.field6325 * var1.field6325;
      float var10 = var1.field6326 * var1.field6326;
      float var11 = var1.field6327 * var1.field6326;
      this.field6397 = var2 + var6 - var11 - var9;
      this.field6399 = var7 + var5 + var7 + var5;
      this.field6387 = var8 - var4 - var4 + var8;
      this.field6395 = var7 + (var7 - var5 - var5);
      this.field6387 = var2 + var9 - var6 - var11;
      this.field6398 = var3 + (var10 + var3 + var10);
      this.field6395 = var4 + (var8 + var4 + var8);
      this.field6394 = var10 - var3 - var3 + var10;
      this.field6387 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public void method11663() {
      method11574(this, -166618756);
   }

   @ObfuscatedSignature(descriptor = "(FFF[F)V")
   @ObfuscatedName("vf")
   public void method11664(float var1, float var2, float var3, float[] var4) {
      this.method11616(var1, var2, var3, var4, 1634822735);
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("dd")
   public float method11628(float var1, float var2, float var3) {
      return this.field6387 * var3 + (this.field6395 * var2 + var1 * this.field6399) + this.field6393;
   }
}
