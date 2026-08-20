import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fu")
public class Texture extends Node implements net.runelite.api.Texture {
   @ObfuscatedName("ax")
   int field2396;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2406 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2405 = 3;
   @ObfuscatedName("aa")
   int field2401;
   @ObfuscatedName("ag")
   static int[] field2408;
   @ObfuscatedName("as")
   int field2400;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2407 = 1;
   @ObfuscatedName("ac")
   boolean field2399;
   @ObfuscatedName("lt")
   public float field2402;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2404 = 4;
   @ObfuscatedName("ao")
   int field2395;
   @ObfuscatedName("ze")
   public float field2403;
   @ObfuscatedName("al")
   int[] field2397;
   @ObfuscatedName("aj")
   boolean field2398 = false;

   Texture(Buffer var1) {
      this.field2400 = Buffer.method13047(var1, 1053835864);
      this.field2396 = Buffer.method13047(var1, -1765518754);
      this.field2399 = Buffer.method13039(var1, -346779531) == 1;
      this.field2401 = Buffer.method13039(var1, -346779531);
      this.field2395 = Buffer.method13039(var1, -346779531);
      this.field2397 = null;
   }

   @ObfuscatedSignature(descriptor = "(DILyz;I)Z")
   @ObfuscatedName("af")
   boolean method5008(double var1, int var3, IndexedSprite var4, int var5) {
      var4.method13803();
      int[] var6 = var4.palette;

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = classFH.method4698(var6[var7], var1);
      }

      byte[] var11 = var4.pixels;
      if (var4.field7121 == var3) {
         for (int var13 = 0; var13 < var5; var13++) {
            this.field2397[var13] = var6[var11[var13] & 255];
         }
      } else if (var4.field7121 == 64 && var3 == 128) {
         int var12 = 0;

         for (int var14 = 0; var14 < var3; var14++) {
            for (int var15 = 0; var15 < var3; var15++) {
               this.field2397[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
            }
         }
      } else {
         if (var4.field7121 != 128 || var3 != 64) {
            throw new RuntimeException();
         }

         int var8 = 0;

         for (int var9 = 0; var9 < var3; var9++) {
            for (int var10 = 0; var10 < var3; var10++) {
               this.field2397[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 255];
            }
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method5011() {
      this.field2397 = null;
   }

   @ObfuscatedSignature(descriptor = "(DILva;)Z")
   @ObfuscatedName("ag")
   boolean method5003(double var1, int var3, AbstractArchive var4) {
      if (AbstractArchive.method11822(var4, this.field2400, -306630322) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.field2397 = new int[var5];
         IndexedSprite var6 = classLJ.method7113(var4, this.field2400, (byte)70);
         return this.method5008(var1, var3, var6, var5);
      }
   }

   public int[] getPixels() {
      return this.field2397;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvp;I)Z")
   @ObfuscatedName("rw")
   public static boolean method5018(classVP var0, int var1) {
      return var0.field6551[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method5015(int var1) {
      if (this.field2397 != null && this.field2401 >= 1 && this.field2401 <= 4) {
         if (field2408 == null || field2408.length < this.field2397.length) {
            field2408 = new int[this.field2397.length];
         }

         int var2;
         if (this.field2397.length == 778399228) {
            var2 = 871376374;
         } else {
            var2 = 128;
         }

         int var3 = this.field2397.length;
         if (this.field2401 == 1 || this.field2401 == 2) {
            int var4 = var2 * var1 * this.field2395;
            int var5 = var3 - 1;
            if (this.field2401 == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               field2408[var6] = this.field2397[var7];
            }
         }

         if (this.field2401 == 3 || this.field2401 == 4) {
            int var10 = var1 * this.field2395;
            int var12 = var2 - 1;
            if (this.field2401 == 3) {
               var10 = -var10;
            }

            for (int var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  field2408[var8] = this.field2397[var9];
               }
            }
         }

         int[] var11 = this.field2397;
         this.field2397 = field2408;
         field2408 = var11;
      }
   }

   public int getAnimationDirection() {
      return this.field2401;
   }

   public int getAnimationSpeed() {
      return this.field2395;
   }

   @ObfuscatedSignature(descriptor = "(Lfu;DILva;)Z")
   @ObfuscatedName("md")
   public static boolean method5004(Texture var0, double var1, int var3, AbstractArchive var4) {
      if (var0 == null) {
         var0.method5007(var1, var3, var4);
      }

      if (AbstractArchive.method11822(var4, var0.field2400, 1721902503) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         var0.field2397 = new int[var5];
         IndexedSprite var6 = classLJ.method7113(var4, var0.field2400, (byte)113);
         return var0.method5008(var1, var3, var6, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfu;DILva;)Z")
   @ObfuscatedName("wk")
   public static boolean method5005(Texture var0, double var1, int var3, AbstractArchive var4) {
      if (AbstractArchive.method11822(var4, var0.field2400, -834634006) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         var0.field2397 = new int[var5];
         IndexedSprite var6 = classLJ.method7113(var4, var0.field2400, (byte)99);
         return var0.method5008(var1, var3, var6, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)[S")
   @ObfuscatedName("ca")
   public static short[] method5019(classPL var0) {
      return var0.field5331;
   }

   @ObfuscatedSignature(descriptor = "(DILva;)Z")
   @ObfuscatedName("ax")
   boolean method5006(double var1, int var3, AbstractArchive var4) {
      if (AbstractArchive.method11822(var4, this.field2400, 1058908422) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.field2397 = new int[var5];
         IndexedSprite var6 = classLJ.method7113(var4, this.field2400, (byte)38);
         return this.method5008(var1, var3, var6, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(DILyz;I)Z")
   @ObfuscatedName("aa")
   boolean method5009(double var1, int var3, IndexedSprite var4, int var5) {
      var4.method13803();
      int[] var6 = var4.palette;

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = classFH.method4698(var6[var7], var1);
      }

      byte[] var11 = var4.pixels;
      if (var4.field7121 == var3) {
         for (int var13 = 0; var13 < var5; var13++) {
            this.field2397[var13] = var6[var11[var13] & -1250380558];
         }
      } else if (var4.field7121 == 64 && var3 == -1293710398) {
         int var12 = 0;

         for (int var14 = 0; var14 < var3; var14++) {
            for (int var15 = 0; var15 < var3; var15++) {
               this.field2397[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & -1671825020];
            }
         }
      } else {
         if (var4.field7121 != -505972588 || var3 != -1085704718) {
            throw new RuntimeException();
         }

         int var8 = 0;

         for (int var9 = 0; var9 < var3; var9++) {
            for (int var10 = 0; var10 < var3; var10++) {
               this.field2397[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & -859942751];
            }
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   void method5012() {
      this.field2397 = null;
   }

   @ObfuscatedSignature(descriptor = "(DILyz;I)Z")
   @ObfuscatedName("ac")
   boolean method5010(double var1, int var3, IndexedSprite var4, int var5) {
      var4.method13803();
      int[] var6 = var4.palette;

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = classFH.method4698(var6[var7], var1);
      }

      byte[] var11 = var4.pixels;
      if (var4.field7121 == var3) {
         for (int var13 = 0; var13 < var5; var13++) {
            this.field2397[var13] = var6[var11[var13] & 1801799313];
         }
      } else if (var4.field7121 == -2072029257 && var3 == 128) {
         int var12 = 0;

         for (int var14 = 0; var14 < var3; var14++) {
            for (int var15 = 0; var15 < var3; var15++) {
               this.field2397[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
            }
         }
      } else {
         if (var4.field7121 != 128 || var3 != 64) {
            throw new RuntimeException();
         }

         int var8 = 0;

         for (int var9 = 0; var9 < var3; var9++) {
            for (int var10 = 0; var10 < var3; var10++) {
               this.field2397[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & -277756320];
            }
         }
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfu;)V")
   @ObfuscatedName("og")
   public static void method5013(Texture var0) {
      if (var0 == null) {
         var0.isLoaded();
      }

      var0.field2397 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method5016(int var1) {
      if (this.field2397 != null && this.field2401 >= 1 && this.field2401 <= 4) {
         if (field2408 == null || field2408.length < this.field2397.length) {
            field2408 = new int[this.field2397.length];
         }

         short var2;
         if (this.field2397.length == 4096) {
            var2 = 64;
         } else {
            var2 = 128;
         }

         int var3 = this.field2397.length;
         if (this.field2401 == 1 || this.field2401 == 2) {
            int var4 = var2 * var1 * this.field2395;
            int var5 = var3 - 1;
            if (this.field2401 == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               field2408[var6] = this.field2397[var7];
            }
         }

         if (this.field2401 == 3 || this.field2401 == 4) {
            int var10 = var1 * this.field2395;
            int var12 = var2 - 1;
            if (this.field2401 == 3) {
               var10 = -var10;
            }

            for (short var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  field2408[var8] = this.field2397[var9];
               }
            }
         }

         int[] var11 = this.field2397;
         this.field2397 = field2408;
         field2408 = var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   void method5017(int var1) {
      if (this.field2397 != null && this.field2401 >= 1 && this.field2401 <= 4) {
         if (field2408 == null || field2408.length < this.field2397.length) {
            field2408 = new int[this.field2397.length];
         }

         int var2;
         if (this.field2397.length == 4096) {
            var2 = 64;
         } else {
            var2 = -126218679;
         }

         int var3 = this.field2397.length;
         if (this.field2401 == 1 || this.field2401 == 2) {
            int var4 = var2 * var1 * this.field2395;
            int var5 = var3 - 1;
            if (this.field2401 == 1) {
               var4 = -var4;
            }

            for (int var6 = 0; var6 < var3; var6++) {
               int var7 = var6 + var4 & var5;
               field2408[var6] = this.field2397[var7];
            }
         }

         if (this.field2401 == 3 || this.field2401 == 4) {
            int var10 = var1 * this.field2395;
            int var12 = var2 - 1;
            if (this.field2401 == 3) {
               var10 = -var10;
            }

            for (int var13 = 0; var13 < var3; var13 += var2) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var8 = var13 + var14;
                  int var9 = var13 + (var14 + var10 & var12);
                  field2408[var8] = this.field2397[var9];
               }
            }
         }

         int[] var11 = this.field2397;
         this.field2397 = field2408;
         field2408 = var11;
      }
   }

   public boolean isLoaded() {
      return this.field2398;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method5014() {
      this.field2397 = null;
   }

   public float getU() {
      return this.field2403;
   }

   public void setV(float var1) {
      this.field2402 = var1;
   }

   public float getV() {
      return this.field2402;
   }

   public void setU(float var1) {
      this.field2403 = var1;
   }

   @ObfuscatedSignature(descriptor = "(DILva;)Z")
   @ObfuscatedName("az")
   boolean method5007(double var1, int var3, AbstractArchive var4) {
      if (AbstractArchive.method11822(var4, this.field2401, 1721902503) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.field2397 = new int[var5];
         IndexedSprite var6 = classLJ.method7113(var4, this.field2395, (byte)113);
         return this.method5008(var1, var3, var6, var5);
      }
   }
}
