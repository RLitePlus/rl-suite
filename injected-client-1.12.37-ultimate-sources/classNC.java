import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nc")
public class classNC {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4648 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4651 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4650 = 1;
   @ObfuscatedName("ay")
   int[] field4659;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4652 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4654 = 500000;
   @ObfuscatedName("as")
   static final byte[] field4647 = new byte[]{
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      0,
      1,
      2,
      1,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
   };
   @ObfuscatedName("ac")
   int field4649;
   @ObfuscatedName("aa")
   int[] field4656;
   @ObfuscatedName("ao")
   int field4653;
   @ObfuscatedName("al")
   int[] field4658;
   @ObfuscatedName("aj")
   int[] field4657;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("ax")
   classXY field4646 = new classXY(null);
   @ObfuscatedName("aq")
   long field4655;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("hj")
   public static void method7766(classNC var0) {
      var0.field4646.field6954 = null;
      var0.field4658 = null;
      var0.field4657 = null;
      var0.field4656 = null;
      var0.field4659 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   int method7806() {
      int var1 = this.field4657.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.field4657[var4] >= 0 && this.field4656[var4] < var3) {
            var2 = var4;
            var3 = this.field4656[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   void method7778(int var1) {
      this.field4646.field6955 = this.field4657[var1] * -1095856699;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;II)I")
   @ObfuscatedName("qa")
   public static int method7796(classNC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7770();
      }

      if (var2 == 255) {
         int var7 = classXY.method13039(var0.field4646, -346779531);
         int var8 = var0.field4646.method13116(-892171095);
         if (var7 == 47) {
            var0.field4646.field6955 += var8 * -1095856699;
            return 1;
         } else if (var7 == 81) {
            int var5 = var0.field4646.method13051(-758448158);
            var8 -= 3;
            int var6 = var0.field4656[var1];
            var0.field4655 = var0.field4655 + (long)var6 * (var0.field4653 - var5);
            var0.field4653 = var5;
            var0.field4646.field6955 += var8 * -1095856699;
            return 2;
         } else {
            var0.field4646.field6955 += var8 * -1095856699;
            return 3;
         }
      } else {
         byte var3 = field4647[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | classXY.method13039(var0.field4646, -346779531) << 8;
         }

         if (var3 >= 2) {
            var4 |= classXY.method13039(var0.field4646, -346779531) << 16;
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)Z")
   @ObfuscatedName("sn")
   public static boolean method7771(classNC var0) {
      return var0.field4646.field6954 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   boolean method7772() {
      return this.field4646.field6954 != null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   int method7775() {
      return this.field4657.length;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method7779(int var1) {
      this.field4646.field6955 = this.field4657[var1] * -1095856699;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;J)V")
   @ObfuscatedName("ot")
   public static void method7814(classNC var0, long var1) {
      if (var0 == null) {
         var0.method7774();
      }

      var0.field4655 = var1;
      int var3 = var0.field4657.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var0.field4656[var4] = 0;
         var0.field4659[var4] = 0;
         var0.field4646.field6955 = var0.field4658[var4] * -1095856699;
         var0.method7789(var4);
         var0.field4657[var4] = var0.field4646.field6955 * 702114061;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method7780(int var1) {
      this.field4657[var1] = this.field4646.field6955 * 702114061;
   }

   classNC(byte[] var1) {
      method7763(this, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method7791(int var1) {
      int var2 = this.field4646.field6954[this.field4646.field6955 * 702114061];
      if (var2 < 0) {
         var2 &= 255;
         this.field4659[var1] = var2;
         this.field4646.field6955 += -1095856699;
      } else {
         var2 = this.field4659[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7797(var1, var2);
      } else {
         int var3 = this.field4646.method13116(-1917731728);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field4646.field6954[this.field4646.field6955 * 702114061] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field4646.field6955 += -1095856699;
               this.field4659[var1] = var4;
               return this.method7797(var1, var4);
            }
         }

         this.field4646.field6955 += var3 * -1095856699;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("al")
   int method7797(int var1, int var2) {
      if (var2 == 255) {
         int var7 = classXY.method13039(this.field4646, -346779531);
         int var8 = this.field4646.method13116(-1869452137);
         if (var7 == 47) {
            this.field4646.field6955 += var8 * -1095856699;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field4646.method13051(-758448158);
            var8 -= 3;
            int var6 = this.field4656[var1];
            this.field4655 = this.field4655 + (long)var6 * (this.field4653 - var5);
            this.field4653 = var5;
            this.field4646.field6955 += var8 * -1095856699;
            return 2;
         } else {
            this.field4646.field6955 += var8 * -1095856699;
            return 3;
         }
      } else {
         byte var3 = field4647[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | classXY.method13039(this.field4646, -346779531) << 8;
         }

         if (var3 >= 2) {
            var4 |= classXY.method13039(this.field4646, -346779531) << 16;
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   void method7781(int var1) {
      this.field4657[var1] = this.field4646.field6955 * 702114061;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bn")
   void method7782(int var1) {
      this.field4657[var1] = this.field4646.field6955 * 702114061;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)I")
   @ObfuscatedName("gu")
   public static int method7776(classNC var0) {
      return var0.field4657.length;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method7783() {
      this.field4646.field6955 = -1074980126;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   void method7762(byte[] var1) {
      this.field4646.field6954 = var1;
      this.field4646.field6955 = 1926334898;
      int var2 = classXY.method13047(this.field4646, 521387646);
      this.field4649 = classXY.method13047(this.field4646, 1146209906);
      this.field4653 = 500000;
      this.field4658 = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = this.field4646.method13056((byte)1);
         int var5 = this.field4646.method13056((byte)1);
         if (var4 == 1297379947) {
            this.field4658[var3] = this.field4646.field6955 * 702114061;
            var3++;
         }

         this.field4646.field6955 += var5 * -1095856699;
      }

      this.field4655 = 0L;
      this.field4657 = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.field4657[var6] = this.field4658[var6];
      }

      this.field4656 = new int[var2];
      this.field4659 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method7767() {
      this.field4646.field6954 = null;
      this.field4658 = null;
      this.field4657 = null;
      this.field4656 = null;
      this.field4659 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method7807() {
      int var1 = this.field4657.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.field4657[var4] >= 0 && this.field4656[var4] < var3) {
            var2 = var4;
            var3 = this.field4656[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("jn")
   public static void method7768(classNC var0) {
      if (var0 == null) {
         var0.method7770();
      }

      var0.field4646.field6954 = null;
      var0.field4658 = null;
      var0.field4657 = null;
      var0.field4656 = null;
      var0.field4659 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   boolean method7773() {
      return this.field4646.field6954 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("av")
   boolean method7774() {
      return this.field4646.field6954 != null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bf")
   int method7777() {
      return this.field4657.length;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ad")
   void method7815(long var1) {
      this.field4655 = var1;
      int var3 = this.field4657.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.field4656[var4] = 0;
         this.field4659[var4] = 0;
         this.field4646.field6955 = this.field4658[var4] * -1095856699;
         this.method7789(var4);
         this.field4657[var4] = this.field4646.field6955 * 702114061;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)Z")
   @ObfuscatedName("gt")
   public static boolean method7810(classNC var0) {
      int var1 = var0.field4657.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (var0.field4657[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   boolean method7811() {
      int var1 = this.field4657.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.field4657[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   void method7784() {
      this.field4646.field6955 = 1095856699;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   void method7785() {
      this.field4646.field6955 = -167842463;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   void method7786() {
      this.field4646.field6955 = 1095856699;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method7787() {
      this.field4646.field6955 = 1095856699;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)I")
   @ObfuscatedName("jl")
   public static int method7792(classNC var0, int var1) {
      int var2 = var0.field4646.field6954[var0.field4646.field6955 * 702114061];
      if (var2 < 0) {
         var2 &= 255;
         var0.field4659[var1] = var2;
         var0.field4646.field6955 += -1095856699;
      } else {
         var2 = var0.field4659[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return var0.method7797(var1, var2);
      } else {
         int var3 = var0.field4646.method13116(-945193828);
         if (var2 == 247 && var3 > 0) {
            int var4 = var0.field4646.field6954[var0.field4646.field6955 * 702114061] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var0.field4646.field6955 += -1095856699;
               var0.field4659[var1] = var4;
               return var0.method7797(var1, var4);
            }
         }

         var0.field4646.field6955 += var3 * -1095856699;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bt")
   void method7788(int var1) {
      int var2 = this.field4646.method13116(-604448193);
      this.field4656[var1] = this.field4656[var1] + var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   void method7789(int var1) {
      int var2 = this.field4646.method13116(-1379519921);
      this.field4656[var1] = this.field4656[var1] + var2;
   }

   classNC() {
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bk")
   int method7793(int var1) {
      int var2 = this.field4646.field6954[this.field4646.field6955 * 702114061];
      if (var2 < 0) {
         var2 &= 255;
         this.field4659[var1] = var2;
         this.field4646.field6955 += -1095856699;
      } else {
         var2 = this.field4659[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7797(var1, var2);
      } else {
         int var3 = this.field4646.method13116(-1014127211);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field4646.field6954[this.field4646.field6955 * 702114061] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field4646.field6955 += -1095856699;
               this.field4659[var1] = var4;
               return this.method7797(var1, var4);
            }
         }

         this.field4646.field6955 += var3 * -1095856699;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;[B)V")
   @ObfuscatedName("do")
   public static void method7763(classNC var0, byte[] var1) {
      if (var0 == null) {
         var0.method7765(var1);
      } else {
         var0.field4646.field6954 = var1;
         var0.field4646.field6955 = 1926334898;
         int var2 = classXY.method13047(var0.field4646, -1420262210);
         var0.field4649 = classXY.method13047(var0.field4646, 525215387);
         var0.field4653 = 500000;
         var0.field4658 = new int[var2];
         int var3 = 0;

         while (var3 < var2) {
            int var4 = var0.field4646.method13056((byte)1);
            int var5 = var0.field4646.method13056((byte)1);
            if (var4 == 1297379947) {
               var0.field4658[var3] = var0.field4646.field6955 * 702114061;
               var3++;
            }

            var0.field4646.field6955 += var5 * -1095856699;
         }

         var0.field4655 = 0L;
         var0.field4657 = new int[var2];

         for (int var6 = 0; var6 < var2; var6++) {
            var0.field4657[var6] = var0.field4658[var6];
         }

         var0.field4656 = new int[var2];
         var0.field4659 = new int[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bu")
   int method7798(int var1, int var2) {
      if (var2 == 255) {
         int var7 = classXY.method13039(this.field4646, -346779531);
         int var8 = this.field4646.method13116(-1521398117);
         if (var7 == 47) {
            this.field4646.field6955 += var8 * -1095856699;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field4646.method13051(-758448158);
            var8 -= 3;
            int var6 = this.field4656[var1];
            this.field4655 = this.field4655 + (long)var6 * (this.field4653 - var5);
            this.field4653 = var5;
            this.field4646.field6955 += var8 * -1095856699;
            return 2;
         } else {
            this.field4646.field6955 += var8 * -1095856699;
            return 3;
         }
      } else {
         byte var3 = field4647[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | classXY.method13039(this.field4646, -346779531) << 8;
         }

         if (var3 >= 2) {
            var4 |= classXY.method13039(this.field4646, -346779531) << 16;
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bb")
   int method7799(int var1, int var2) {
      if (var2 == -894745750) {
         int var7 = classXY.method13039(this.field4646, -346779531);
         int var8 = this.field4646.method13116(-890567453);
         if (var7 == 47) {
            this.field4646.field6955 += var8 * 382150135;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field4646.method13051(-758448158);
            var8 -= 3;
            int var6 = this.field4656[var1];
            this.field4655 = this.field4655 + (long)var6 * (this.field4653 - var5);
            this.field4653 = var5;
            this.field4646.field6955 += var8 * -1315956917;
            return 2;
         } else {
            this.field4646.field6955 += var8 * -1095856699;
            return 3;
         }
      } else {
         byte var3 = field4647[var2 - -1043136130];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | classXY.method13039(this.field4646, -346779531) << 8;
         }

         if (var3 >= 2) {
            var4 |= classXY.method13039(this.field4646, -346779531) << 16;
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;II)I")
   @ObfuscatedName("pq")
   public static int method7800(classNC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7786();
      }

      if (var2 == 255) {
         int var7 = classXY.method13039(var0.field4646, -346779531);
         int var8 = var0.field4646.method13116(-1109954305);
         if (var7 == 47) {
            var0.field4646.field6955 += var8 * -1517860803;
            return 1;
         } else if (var7 == 914786944) {
            int var5 = var0.field4646.method13051(-758448158);
            var8 -= 3;
            int var6 = var0.field4656[var1];
            var0.field4655 = var0.field4655 + (long)var6 * (var0.field4653 - var5);
            var0.field4653 = var5;
            var0.field4646.field6955 += var8 * -1095856699;
            return 2;
         } else {
            var0.field4646.field6955 += var8 * -98035949;
            return 3;
         }
      } else {
         byte var3 = field4647[var2 - -1087043011];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | classXY.method13039(var0.field4646, -346779531) << 8;
         }

         if (var3 >= 2) {
            var4 |= classXY.method13039(var0.field4646, -346779531) << 16;
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("be")
   long method7801(int var1) {
      return this.field4655 + (long)var1 * this.field4653;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   boolean method7812() {
      int var1 = this.field4657.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.field4657[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ap")
   void method7764(byte[] var1) {
      this.field4646.field6954 = var1;
      this.field4646.field6955 = 1926334898;
      int var2 = classXY.method13047(this.field4646, 1174598881);
      this.field4649 = classXY.method13047(this.field4646, -970218992);
      this.field4653 = 500000;
      this.field4658 = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = this.field4646.method13056((byte)1);
         int var5 = this.field4646.method13056((byte)1);
         if (var4 == -1360957737) {
            this.field4658[var3] = this.field4646.field6955 * 1130038081;
            var3++;
         }

         this.field4646.field6955 += var5 * -1095856699;
      }

      this.field4655 = 0L;
      this.field4657 = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.field4657[var6] = this.field4658[var6];
      }

      this.field4656 = new int[var2];
      this.field4659 = new int[var2];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)J")
   @ObfuscatedName("yp")
   public static long method7802(classNC var0, int var1) {
      return var0.field4655 + (long)var1 * var0.field4653;
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("bq")
   long method7803(int var1) {
      return this.field4655 + (long)var1 * this.field4653;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   int method7808() {
      int var1 = this.field4657.length;
      int var2 = -1;
      int var3 = 2076686818;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.field4657[var4] >= 0 && this.field4656[var4] < var3) {
            var2 = var4;
            var3 = this.field4656[var4];
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)I")
   @ObfuscatedName("sf")
   public static int method7794(classNC var0, int var1) {
      int var2 = var0.field4646.field6954[var0.field4646.field6955 * 702114061];
      if (var2 < 0) {
         var2 &= 255;
         var0.field4659[var1] = var2;
         var0.field4646.field6955 += -1095856699;
      } else {
         var2 = var0.field4659[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return var0.method7797(var1, var2);
      } else {
         int var3 = var0.field4646.method13116(-1086726186);
         if (var2 == 247 && var3 > 0) {
            int var4 = var0.field4646.field6954[var0.field4646.field6955 * 702114061] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var0.field4646.field6955 += -1095856699;
               var0.field4659[var1] = var4;
               return var0.method7797(var1, var4);
            }
         }

         var0.field4646.field6955 += var3 * -1095856699;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int method7809() {
      int var1 = this.field4657.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.field4657[var4] >= 0 && this.field4656[var4] < var3) {
            var2 = var4;
            var3 = this.field4656[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method7769() {
      this.field4646.field6954 = null;
      this.field4658 = null;
      this.field4657 = null;
      this.field4656 = null;
      this.field4659 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   boolean method7813() {
      int var1 = this.field4657.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.field4657[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   int method7790(int var1) {
      return this.method7791(var1);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("bz")
   void method7816(long var1) {
      this.field4655 = var1;
      int var3 = this.field4657.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.field4656[var4] = 0;
         this.field4659[var4] = 0;
         this.field4646.field6955 = this.field4658[var4] * -2082209081;
         this.method7789(var4);
         this.field4657[var4] = this.field4646.field6955 * 1805312808;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)J")
   @ObfuscatedName("hw")
   public static long method7804(classNC var0, int var1) {
      return var0.field4655 + (long)var1 * var0.field4653;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("az")
   void method7765(byte[] var1) {
      this.field4646.field6954 = var1;
      this.field4646.field6955 = 1926334898;
      int var2 = classXY.method13047(this.field4646, 521387646);
      this.field4649 = classXY.method13047(this.field4646, 1146209906);
      this.field4653 = 500000;
      this.field4658 = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = this.field4646.method13050((byte)1);
         int var5 = this.field4646.method13249((byte)1);
         if (var4 == 1297379947) {
            this.field4658[var3] = this.field4646.field6955 * 702114061;
            var3++;
         }

         this.field4646.field6955 += var5 * -1095856699;
      }

      this.field4655 = 0L;
      this.field4656 = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.field4657[var6] = this.field4657[var6];
      }

      this.field4656 = new int[var2];
      this.field4658 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method7770() {
      this.field4646.field6954 = null;
      this.field4658 = null;
      this.field4656 = null;
      this.field4657 = null;
      this.field4657 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   int method7795(int var1) {
      int var2 = this.field4646.field6954[this.field4646.field6955 * 702114061];
      if (var2 < 0) {
         var2 &= 255;
         this.field4659[var1] = var2;
         this.field4646.field6955 += -1095856699;
      } else {
         var2 = this.field4657[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7799(var1, var2);
      } else {
         int var3 = this.field4646.method13053(-1014127211);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field4646.field6954[this.field4646.field6955 * 702114061] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field4646.field6955 += -1095856699;
               this.field4658[var1] = var4;
               return this.method7798(var1, var4);
            }
         }

         this.field4646.field6955 += var3 * -1095856699;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("aj")
   long method7805(int var1) {
      return this.field4655 + (long)var1 * this.field4653;
   }
}
