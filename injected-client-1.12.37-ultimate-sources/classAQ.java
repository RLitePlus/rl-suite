import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aq")
public class classAQ {
   @ObfuscatedName("as")
   int[] field249;
   @ObfuscatedName("ae")
   int field255;
   @ObfuscatedName("ax")
   int field258;
   @ObfuscatedName("al")
   int field250 = 2;
   @ObfuscatedName("ag")
   int[] field251;
   @ObfuscatedName("aa")
   int field252;
   @ObfuscatedName("ab")
   int field253;
   @ObfuscatedName("ao")
   int field257;
   @ObfuscatedName("ac")
   int field254;
   @ObfuscatedName("af")
   int field256;
   @ObfuscatedName("az")
   int field259;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   final int method655(int var1) {
      if (this.field252 >= this.field253) {
         this.field256 = this.field251[this.field257++] << 15;
         if (this.field257 >= this.field250) {
            this.field257 = this.field250 - 1;
         }

         this.field253 = (int)(this.field249[this.field257] / 65536.0 * var1);
         if (this.field253 > this.field252) {
            this.field255 = ((this.field251[this.field257] << 15) - this.field256) / (this.field253 - this.field252);
         }
      }

      this.field256 = this.field256 + this.field255;
      this.field252++;
      return this.field256 - this.field255 >> 15;
   }

   classAQ() {
      this.field249 = new int[2];
      this.field251 = new int[2];
      this.field249[0] = 0;
      this.field249[1] = 65535;
      this.field251[0] = 0;
      this.field251[1] = 65535;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laq;I)I")
   @ObfuscatedName("sv")
   public static int method656(classAQ var0, int var1) {
      if (var0.field252 >= var0.field253) {
         var0.field256 = var0.field251[var0.field257++] << 15;
         if (var0.field257 >= var0.field250) {
            var0.field257 = var0.field250 - 1;
         }

         var0.field253 = (int)(var0.field249[var0.field257] / 65536.0 * var1);
         if (var0.field253 > var0.field252) {
            var0.field255 = ((var0.field251[var0.field257] << 15) - var0.field256) / (var0.field253 - var0.field252);
         }
      }

      var0.field256 = var0.field256 + var0.field255;
      var0.field252++;
      return var0.field256 - var0.field255 >> 15;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("as")
   final void method650(classXY var1) {
      this.field250 = classXY.method13039(var1, -346779531);
      this.field249 = new int[this.field250];
      this.field251 = new int[this.field250];

      for (int var2 = 0; var2 < this.field250; var2++) {
         this.field249[var2] = classXY.method13047(var1, -1838758401);
         this.field251[var2] = classXY.method13047(var1, -1797386924);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnh;)Lvj;")
   @ObfuscatedName("am")
   public static classVJ method649(classNH var0) {
      classVJ var1 = var0.field4671.field6515;
      return var1 == var0.field4671 ? null : var1;
   }

   @ObfuscatedSignature(descriptor = "(Laq;Lxy;)V")
   @ObfuscatedName("ys")
   public static void method645(classAQ var0, classXY var1) {
      if (var0 == null) {
         var0.method648(var1);
      }

      var0.field259 = classXY.method13039(var1, -346779531);
      var0.field254 = var1.method13056((byte)1);
      var0.field258 = var1.method13056((byte)1);
      var0.method651(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aa")
   final void method651(classXY var1) {
      this.field250 = classXY.method13039(var1, -346779531);
      this.field249 = new int[this.field250];
      this.field251 = new int[this.field250];

      for (int var2 = 0; var2 < this.field250; var2++) {
         this.field249[var2] = classXY.method13047(var1, -558593366);
         this.field251[var2] = classXY.method13047(var1, -1806044823);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("az")
   final void method646(classXY var1) {
      this.field259 = classXY.method13039(var1, -346779531);
      this.field254 = var1.method13056((byte)1);
      this.field258 = var1.method13056((byte)1);
      this.method651(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ag")
   final void method652(classXY var1) {
      this.field250 = classXY.method13039(var1, -346779531);
      this.field249 = new int[this.field250];
      this.field251 = new int[this.field250];

      for (int var2 = 0; var2 < this.field250; var2++) {
         this.field249[var2] = classXY.method13047(var1, -401698618);
         this.field251[var2] = classXY.method13047(var1, -951704202);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ac")
   final void method653(classXY var1) {
      this.field250 = classXY.method13039(var1, -346779531);
      this.field249 = new int[this.field250];
      this.field251 = new int[this.field250];

      for (int var2 = 0; var2 < this.field250; var2++) {
         this.field249[var2] = classXY.method13047(var1, -924138602);
         this.field251[var2] = classXY.method13047(var1, 1514957370);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("af")
   final void method647(classXY var1) {
      this.field259 = classXY.method13039(var1, -346779531);
      this.field254 = var1.method13056((byte)1);
      this.field258 = var1.method13056((byte)1);
      this.method651(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("zy")
   public static int method657(classDH var0) {
      if (var0 == null) {
         var0.method3292();
      }

      int var1 = -1;
      int var2 = var0.method3195(582976596);
      if (-1 == var2) {
         var1 = -1657575887 * var0.field1445;
      } else {
         int var3 = var2 - 1457033841 * var0.field1488 & 2047;
         if (var3 > 1024) {
            var3 -= 2048;
         }

         var1 = var0.field1462 * -412780869;
         if (var3 >= -256 && var3 <= 256) {
            var1 = -1657575887 * var0.field1445;
         } else if (var3 >= 256 && var3 < 768) {
            var1 = var0.field1448 * -144383729;
         } else if (var3 >= -768 && var3 <= -256) {
            var1 = var0.field1450 * 1347929125;
         }
      }

      if (var1 == -1) {
         var1 = -1657575887 * var0.field1445;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ax")
   final void method648(classXY var1) {
      this.field252 = classXY.method13039(var1, -346779531);
      this.field253 = var1.method13050((byte)1);
      this.field253 = var1.method13249((byte)1);
      this.method652(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   final void method654() {
      this.field256 = 0;
      this.field257 = 0;
      this.field254 = 0;
      this.field253 = 0;
      this.field255 = 0;
   }
}
