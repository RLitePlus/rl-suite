import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ux")
public class classUX {
   @ObfuscatedName("ac")
   float field6413;
   @ObfuscatedName("az")
   float field6422;
   @ObfuscatedName("ae")
   float field6414;
   @ObfuscatedName("as")
   float field6420;
   @ObfuscatedSignature(descriptor = "Lux;")
   @ObfuscatedName("jd")
   public static classUX field6410 = new classUX();
   @ObfuscatedName("ag")
   float field6416;
   @ObfuscatedName("ab")
   float field6412;
   @ObfuscatedName("af")
   float field6415;
   @ObfuscatedName("ao")
   float field6419;
   @ObfuscatedName("aa")
   float field6411;
   @ObfuscatedName("ax")
   float field6421;
   @ObfuscatedName("al")
   float field6418;
   @ObfuscatedName("aj")
   float field6417;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field6423 = 45;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11694() {
      return this.field6422
         + ","
         + this.field6412
         + ","
         + this.field6421
         + ","
         + this.field6419
         + "\n"
         + this.field6415
         + ","
         + this.field6416
         + ","
         + this.field6413
         + ","
         + this.field6418
         + "\n"
         + this.field6414
         + ","
         + this.field6420
         + ","
         + this.field6411
         + ","
         + this.field6417;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lux;)V")
   @ObfuscatedName("tq")
   public static void method11678(classUX var0) {
      if (var0 == null) {
         var0.method11694();
      }

      var0.field6417 = 0.0F;
      var0.field6418 = 0.0F;
      var0.field6419 = 0.0F;
      var0.field6413 = 0.0F;
      var0.field6421 = 0.0F;
      var0.field6420 = 0.0F;
      var0.field6412 = 0.0F;
      var0.field6414 = 0.0F;
      var0.field6415 = 0.0F;
      var0.field6411 = 1.0F;
      var0.field6416 = 1.0F;
      var0.field6422 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method11679(int var1) {
      try {
         this.field6417 = 0.0F;
         this.field6418 = 0.0F;
         this.field6419 = 0.0F;
         this.field6413 = 0.0F;
         this.field6421 = 0.0F;
         this.field6420 = 0.0F;
         this.field6412 = 0.0F;
         this.field6414 = 0.0F;
         this.field6415 = 0.0F;
         this.field6411 = 1.0F;
         this.field6416 = 1.0F;
         this.field6422 = 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ux.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ao")
   public void method11684(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field6422;
      float var5 = this.field6412;
      float var6 = this.field6421;
      float var7 = this.field6419;
      this.field6422 = var3 * this.field6414 + var4 * var2;
      this.field6414 = this.field6414 * var2 - var3 * var4;
      this.field6412 = var2 * var5 + this.field6420 * var3;
      this.field6420 = var2 * this.field6420 - var5 * var3;
      this.field6421 = var2 * var6 + var3 * this.field6411;
      this.field6411 = this.field6411 * var2 - var3 * var6;
      this.field6419 = this.field6417 * var3 + var7 * var2;
      this.field6417 = var2 * this.field6417 - var7 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lux;)V")
   @ObfuscatedName("mi")
   public static void method11680(classUX var0) {
      if (var0 == null) {
         var0.toString();
      }

      var0.field6417 = 0.0F;
      var0.field6418 = 0.0F;
      var0.field6419 = 0.0F;
      var0.field6413 = 0.0F;
      var0.field6421 = 0.0F;
      var0.field6420 = 0.0F;
      var0.field6412 = 0.0F;
      var0.field6414 = 0.0F;
      var0.field6415 = 0.0F;
      var0.field6411 = 1.0F;
      var0.field6416 = 1.0F;
      var0.field6422 = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lux;FFF)V")
   @ObfuscatedName("sv")
   public static void method11692(classUX var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method11702(var1, var1, var1);
      }

      var0.field6419 += var1;
      var0.field6418 += var2;
      var0.field6417 += var3;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ay")
   void method11688(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field6422;
      float var5 = this.field6412;
      float var6 = this.field6421;
      float var7 = this.field6419;
      this.field6422 = var2 * var4 - var3 * this.field6415;
      this.field6415 = this.field6415 * var2 + var3 * var4;
      this.field6412 = var2 * var5 - var3 * this.field6416;
      this.field6416 = var3 * var5 + this.field6416 * var2;
      this.field6421 = var2 * var6 - this.field6413 * var3;
      this.field6413 = this.field6413 * var2 + var6 * var3;
      this.field6419 = var7 * var2 - var3 * this.field6418;
      this.field6418 = var2 * this.field6418 + var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(Lux;FI)V")
   @ObfuscatedName("qx")
   public static void method11689(classUX var0, float var1, int var2) {
      if (var0 == null) {
         var0.method11687(var1, var2);
      }

      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = var0.field6422;
         float var6 = var0.field6412;
         float var7 = var0.field6421;
         float var8 = var0.field6419;
         var0.field6422 = var3 * var5 - var4 * var0.field6415;
         var0.field6415 = var0.field6415 * var3 + var4 * var5;
         var0.field6412 = var3 * var6 - var4 * var0.field6416;
         var0.field6416 = var4 * var6 + var0.field6416 * var3;
         var0.field6421 = var3 * var7 - var0.field6413 * var4;
         var0.field6413 = var0.field6413 * var3 + var7 * var4;
         var0.field6419 = var8 * var3 - var4 * var0.field6418;
         var0.field6418 = var3 * var0.field6418 + var4 * var8;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "ux.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFB)V")
   @ObfuscatedName("ag")
   public void method11693(float var1, float var2, float var3, byte var4) {
      try {
         this.field6419 += var1;
         this.field6418 += var2;
         this.field6417 += var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "ux.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("af")
   public void method11681(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field6415;
         float var6 = this.field6416;
         float var7 = this.field6413;
         float var8 = this.field6418;
         this.field6415 = var3 * var5 - this.field6414 * var4;
         this.field6414 = var4 * var5 + var3 * this.field6414;
         this.field6416 = var6 * var3 - var4 * this.field6420;
         this.field6420 = var6 * var4 + this.field6420 * var3;
         this.field6413 = var3 * var7 - var4 * this.field6411;
         this.field6411 = var4 * var7 + this.field6411 * var3;
         this.field6418 = var3 * var8 - this.field6417 * var4;
         this.field6417 = var3 * this.field6417 + var4 * var8;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "ux.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("aq")
   void method11690(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field6422;
      float var5 = this.field6412;
      float var6 = this.field6421;
      float var7 = this.field6419;
      this.field6422 = var2 * var4 - var3 * this.field6415;
      this.field6415 = this.field6415 * var2 + var3 * var4;
      this.field6412 = var2 * var5 - var3 * this.field6416;
      this.field6416 = var3 * var5 + this.field6416 * var2;
      this.field6421 = var2 * var6 - this.field6413 * var3;
      this.field6413 = this.field6413 * var2 + var6 * var3;
      this.field6419 = var7 * var2 - var3 * this.field6418;
      this.field6418 = var2 * this.field6418 + var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("od")
   public void method11698(float var1) {
      this.method11686(var1, 982132619);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11695() {
      return this.field6422
         + ","
         + this.field6412
         + ","
         + this.field6421
         + ","
         + this.field6419
         + "\n"
         + this.field6415
         + ","
         + this.field6416
         + ","
         + this.field6413
         + ","
         + this.field6418
         + "\n"
         + this.field6414
         + ","
         + this.field6420
         + ","
         + this.field6411
         + ","
         + this.field6417;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("fb")
   public void method11699(float var1) {
      this.method11681(var1, 173632492);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lux;F)V")
   @ObfuscatedName("dd")
   public static void method11685(classUX var0, float var1) {
      if (var0 == null) {
         var0.method11701(var1);
      }

      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = var0.field6422;
      float var5 = var0.field6412;
      float var6 = var0.field6421;
      float var7 = var0.field6419;
      var0.field6422 = var3 * var0.field6414 + var4 * var2;
      var0.field6414 = var0.field6414 * var2 - var3 * var4;
      var0.field6412 = var2 * var5 + var0.field6420 * var3;
      var0.field6420 = var2 * var0.field6420 - var5 * var3;
      var0.field6421 = var2 * var6 + var3 * var0.field6411;
      var0.field6411 = var0.field6411 * var2 - var3 * var6;
      var0.field6419 = var0.field6417 * var3 + var7 * var2;
      var0.field6417 = var2 * var0.field6417 - var7 * var3;
   }

   public classUX() {
      this.method11679(2000712555);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gk")
   public void method11700() {
      this.method11679(2000712555);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("js")
   public void method11701(float var1) {
      method11689(this, var1, -2028165068);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method11696() {
      return this.field6422
         + ","
         + this.field6412
         + ","
         + this.field6421
         + ","
         + this.field6419
         + "\n"
         + this.field6415
         + ","
         + this.field6416
         + ","
         + this.field6413
         + ","
         + this.field6418
         + "\n"
         + this.field6414
         + ","
         + this.field6420
         + ","
         + this.field6411
         + ","
         + this.field6417;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ae")
   static final boolean method11697(int var0, byte var1) {
      try {
         if (var0 != 7) {
            if (var1 != 3) {
               throw new IllegalStateException();
            }

            if (8 != var0) {
               if (var0 < 9) {
                  return false;
               }

               if (var1 != 3) {
                  throw new IllegalStateException();
               }

               if (var0 > 13) {
                  return false;
               }

               if (var1 != 3) {
                  throw new IllegalStateException();
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ux.ae(" + ')');
      }
   }

   static {
      new classUX();
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("gy")
   public void method11702(float var1, float var2, float var3) {
      this.method11693(var1, var2, var3, (byte)105);
   }

   @Override
   public String toString() {
      try {
         return this.field6422
            + ","
            + this.field6412
            + ","
            + this.field6421
            + ","
            + this.field6419
            + "\n"
            + this.field6415
            + ","
            + this.field6416
            + ","
            + this.field6413
            + ","
            + this.field6418
            + "\n"
            + this.field6414
            + ","
            + this.field6420
            + ","
            + this.field6411
            + ","
            + this.field6417;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ux.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ac")
   public void method11682(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field6415;
      float var5 = this.field6416;
      float var6 = this.field6413;
      float var7 = this.field6418;
      this.field6415 = var2 * var4 - this.field6414 * var3;
      this.field6414 = var3 * var4 + var2 * this.field6414;
      this.field6416 = var5 * var2 - var3 * this.field6420;
      this.field6420 = var5 * var3 + this.field6420 * var2;
      this.field6413 = var2 * var6 - var3 * this.field6411;
      this.field6411 = var3 * var6 + this.field6411 * var2;
      this.field6418 = var2 * var7 - this.field6417 * var3;
      this.field6417 = var2 * this.field6417 + var3 * var7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lux;F)V")
   @ObfuscatedName("wz")
   public static void method11683(classUX var0, float var1) {
      if (var0 == null) {
         var0.method11684(var1);
      }

      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = var0.field6415;
      float var5 = var0.field6416;
      float var6 = var0.field6413;
      float var7 = var0.field6418;
      var0.field6415 = var2 * var4 - var0.field6414 * var3;
      var0.field6414 = var3 * var4 + var2 * var0.field6414;
      var0.field6416 = var5 * var2 - var3 * var0.field6420;
      var0.field6420 = var5 * var3 + var0.field6420 * var2;
      var0.field6413 = var2 * var6 - var3 * var0.field6411;
      var0.field6411 = var3 * var6 + var0.field6411 * var2;
      var0.field6418 = var2 * var7 - var0.field6417 * var3;
      var0.field6417 = var2 * var0.field6417 + var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("aj")
   void method11691(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field6422;
      float var5 = this.field6412;
      float var6 = this.field6421;
      float var7 = this.field6419;
      this.field6422 = var2 * var4 - var3 * this.field6415;
      this.field6415 = this.field6415 * var2 + var3 * var4;
      this.field6412 = var2 * var5 - var3 * this.field6416;
      this.field6416 = var3 * var5 + this.field6416 * var2;
      this.field6421 = var2 * var6 - this.field6413 * var3;
      this.field6413 = this.field6413 * var2 + var6 * var3;
      this.field6419 = var7 * var2 - var3 * this.field6418;
      this.field6418 = var2 * this.field6418 + var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("ae")
   public void method11686(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field6422;
         float var6 = this.field6412;
         float var7 = this.field6421;
         float var8 = this.field6419;
         this.field6422 = var4 * this.field6414 + var5 * var3;
         this.field6414 = this.field6414 * var3 - var4 * var5;
         this.field6412 = var3 * var6 + this.field6420 * var4;
         this.field6420 = var3 * this.field6420 - var6 * var4;
         this.field6421 = var3 * var7 + var4 * this.field6411;
         this.field6411 = this.field6411 * var3 - var4 * var7;
         this.field6419 = this.field6417 * var4 + var8 * var3;
         this.field6417 = var3 * this.field6417 - var8 * var4;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "ux.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("ab")
   void method11687(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field6413;
         float var6 = this.field6418;
         float var7 = this.field6422;
         float var8 = this.field6418;
         this.field6412 = var4 * this.field6411 + var5 * var3;
         this.field6411 = this.field6418 * var3 - var4 * var5;
         this.field6418 = var3 * var6 + this.field6416 * var4;
         this.field6412 = var3 * this.field6414 - var6 * var4;
         this.field6413 = var3 * var7 + var4 * this.field6421;
         this.field6417 = this.field6420 * var3 - var4 * var7;
         this.field6418 = this.field6421 * var4 + var8 * var3;
         this.field6419 = var3 * this.field6419 - var8 * var4;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "ux.ae(" + ')');
      }
   }
}
