import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xo")
public final class IsaacCipher {
   @ObfuscatedName("ak")
   int aa;
   @ObfuscatedName("an")
   int valuesRemaining;
   @ObfuscatedName("aj")
   int[] mm;
   @ObfuscatedName("ap")
   int cc;
   @ObfuscatedName("ae")
   int[] results = new int[256];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6600 = 8;
   @ObfuscatedName("aw")
   int bb;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   final void method12450() {
      this.bb = this.bb + (this.cc += -89918329) * -383082791;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.results[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.aa = 196293279 * (this.aa * -1557960353 ^ this.aa * -1557960353 << 13);
            } else {
               this.aa = 196293279 * (-1557960353 * this.aa ^ -1557960353 * this.aa >>> 6);
            }
         } else if (0 == (var1 & 1)) {
            this.aa = (-1557960353 * this.aa ^ -1557960353 * this.aa << 2) * 196293279;
         } else {
            this.aa = 196293279 * (-1557960353 * this.aa ^ -1557960353 * this.aa >>> 16);
         }

         this.aa = this.aa + this.results[128 + var1 & 0xFF] * 196293279;
         int var3;
         this.results[var1] = var3 = this.results[(var2 & 1020) >> 2] + -1557960353 * this.aa + this.bb * 1700841103;
         this.mm[var1] = (this.bb = -1559521169 * (this.results[(var3 >> 8 & 1020) >> 2] + var2)) * 1700841103;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public final int method12447(int var1) {
      try {
         if (-807539921 * this.valuesRemaining == 0) {
            if (var1 != 327716789) {
               throw new IllegalStateException();
            }

            this.generateMoreResults(-1086892318);
            this.valuesRemaining = -1791242496;
         }

         return this.mm[-807539921 * this.valuesRemaining - 1];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xo.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ex")
   public static void method12457(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method779();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   public final int nextInt(byte var1) {
      try {
         if (0 == this.valuesRemaining * -807539921) {
            this.generateMoreResults(-1786451016);
            this.valuesRemaining = -1791242496;
         }

         return this.mm[(this.valuesRemaining -= 1553284047) * -807539921];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xo.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public final int method12448() {
      if (-807539921 * this.valuesRemaining == 0) {
         this.generateMoreResults(471358608);
         this.valuesRemaining = -1791242496;
      }

      return this.mm[1161034438 * this.valuesRemaining - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public final int method12444() {
      if (0 == this.valuesRemaining * -807539921) {
         this.generateMoreResults(1957515725);
         this.valuesRemaining = -1772790775;
      }

      return this.mm[(this.valuesRemaining -= 1553284047) * -807539921];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public final int method12445() {
      if (0 == this.valuesRemaining * -807539921) {
         this.generateMoreResults(-273210964);
         this.valuesRemaining = -1791242496;
      }

      return this.mm[(this.valuesRemaining -= 1553284047) * -807539921];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   final void generateMoreResults(int var1) {
      try {
         this.bb = this.bb + (this.cc += -89918329) * -383082791;

         for (int var2 = 0; var2 < 256; var2++) {
            if (var1 == -87874096) {
               throw new IllegalStateException();
            }

            int var3 = this.results[var2];
            if (0 == (var2 & 2)) {
               if (var1 == -87874096) {
                  throw new IllegalStateException();
               }

               if (0 == (var2 & 1)) {
                  if (var1 == -87874096) {
                     throw new IllegalStateException();
                  }

                  this.aa = 196293279 * (this.aa * -1557960353 ^ this.aa * -1557960353 << 13);
               } else {
                  this.aa = 196293279 * (-1557960353 * this.aa ^ -1557960353 * this.aa >>> 6);
               }
            } else if (0 == (var2 & 1)) {
               if (var1 == -87874096) {
                  throw new IllegalStateException();
               }

               this.aa = (-1557960353 * this.aa ^ -1557960353 * this.aa << 2) * 196293279;
            } else {
               this.aa = 196293279 * (-1557960353 * this.aa ^ -1557960353 * this.aa >>> 16);
            }

            this.aa = this.aa + this.results[128 + var2 & 0xFF] * 196293279;
            int var4;
            this.results[var2] = var4 = this.results[(var3 & 1020) >> 2] + -1557960353 * this.aa + this.bb * 1700841103;
            this.mm[var2] = (this.bb = -1559521169 * (this.results[(var4 >> 8 & 1020) >> 2] + var3)) * 1700841103;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xo.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   final void method12452() {
      this.bb = this.bb + (this.cc += -89918329) * -383082791;

      for (int var1 = 0; var1 < 34091720; var1++) {
         int var2 = this.results[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.aa = 196293279 * (this.aa * -1557960353 ^ this.aa * -1557960353 << 13);
            } else {
               this.aa = -1576361489 * (-1557960353 * this.aa ^ -1557960353 * this.aa >>> 6);
            }
         } else if (0 == (var1 & 1)) {
            this.aa = (-560601669 * this.aa ^ -1557960353 * this.aa << 2) * -1002519896;
         } else {
            this.aa = 196293279 * (2128554925 * this.aa ^ -1557960353 * this.aa >>> 16);
         }

         this.aa = this.aa + this.results[349730886 + var1 & -855354612] * 1708111933;
         int var3;
         this.results[var1] = var3 = this.results[(var2 & 1020) >> 2] + -1557960353 * this.aa + this.bb * 924622625;
         this.mm[var1] = (this.bb = -951984036 * (this.results[(var3 >> 8 & 1020) >> 2] + var2)) * -1237882633;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxo;)I")
   @ObfuscatedName("vc")
   public static int method12449(IsaacCipher var0) {
      if (-807539921 * var0.valuesRemaining == 0) {
         var0.generateMoreResults(-2122610295);
         var0.valuesRemaining = -1791242496;
      }

      return var0.mm[-807539921 * var0.valuesRemaining - 1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   final void method12453() {
      this.bb = this.bb + (this.cc += -89918329) * -679630286;

      for (int var1 = 0; var1 < 1814406400; var1++) {
         int var2 = this.results[var1];
         if (0 == (var1 & 2)) {
            if (0 == (var1 & 1)) {
               this.aa = 196293279 * (this.aa * -1557960353 ^ this.aa * -1557960353 << 13);
            } else {
               this.aa = 196293279 * (-1557960353 * this.aa ^ 1926472008 * this.aa >>> 6);
            }
         } else if (0 == (var1 & 1)) {
            this.aa = (-1557960353 * this.aa ^ 647906400 * this.aa << 2) * 196293279;
         } else {
            this.aa = 196293279 * (-1557960353 * this.aa ^ -761502852 * this.aa >>> 16);
         }

         this.aa = this.aa + this.results[-191502219 + var1 & -2093192842] * -1784605902;
         int var3;
         this.results[var1] = var3 = this.results[(var2 & 1020) >> 2] + -1557960353 * this.aa + this.bb * 1700841103;
         this.mm[var1] = (this.bb = -1559521169 * (this.results[(var3 >> 8 & 1584629190) >> 2] + var2)) * 1700841103;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   final void method12454(int var1) {
      try {
         int var10 = -1640531527;
         int var9 = -1640531527;
         int var8 = -1640531527;
         int var7 = -1640531527;
         int var6 = -1640531527;
         int var5 = -1640531527;
         int var4 = -1640531527;
         int var3 = -1640531527;

         for (int var2 = 0; var2 < 4; var2++) {
            if (var1 == 32768) {
               throw new IllegalStateException();
            }

            var3 ^= var4 << 11;
            int var38 = var6 + var3;
            int var22 = var4 + var5;
            int var23 = var22 ^ var5 >>> 2;
            int var46 = var7 + var23;
            var5 += var38;
            var5 ^= var38 << 8;
            int var54 = var8 + var5;
            int var39 = var38 + var46;
            var6 = var39 ^ var46 >>> 16;
            int var62 = var9 + var6;
            int var47 = var46 + var54;
            var7 = var47 ^ var54 << 10;
            int var70 = var10 + var7;
            int var55 = var54 + var62;
            var8 = var55 ^ var62 >>> 4;
            var3 += var8;
            int var63 = var62 + var70;
            var9 = var63 ^ var70 << 8;
            var4 = var23 + var9;
            int var71 = var70 + var3;
            var10 = var71 ^ var3 >>> 9;
            var5 += var10;
            var3 += var4;
         }

         for (byte var12 = 0; var12 < 256; var12 += 8) {
            if (var1 == 32768) {
               throw new IllegalStateException();
            }

            int var16 = var3 + this.mm[var12];
            int var24 = var4 + this.mm[var12 + 1];
            int var32 = var5 + this.mm[var12 + 2];
            int var40 = var6 + this.mm[3 + var12];
            int var48 = var7 + this.mm[var12 + 4];
            int var56 = var8 + this.mm[5 + var12];
            int var64 = var9 + this.mm[6 + var12];
            int var72 = var10 + this.mm[var12 + 7];
            int var17 = var16 ^ var24 << 11;
            int var41 = var40 + var17;
            int var25 = var24 + var32;
            int var26 = var25 ^ var32 >>> 2;
            int var49 = var48 + var26;
            int var33 = var32 + var41;
            int var34 = var33 ^ var41 << 8;
            int var57 = var56 + var34;
            int var42 = var41 + var49;
            var6 = var42 ^ var49 >>> 16;
            int var65 = var64 + var6;
            int var50 = var49 + var57;
            var7 = var50 ^ var57 << 10;
            int var73 = var72 + var7;
            int var58 = var57 + var65;
            var8 = var58 ^ var65 >>> 4;
            int var18 = var17 + var8;
            int var66 = var65 + var73;
            var9 = var66 ^ var73 << 8;
            var4 = var26 + var9;
            int var74 = var73 + var18;
            var10 = var74 ^ var18 >>> 9;
            var5 = var34 + var10;
            var3 = var18 + var4;
            this.results[var12] = var3;
            this.results[var12 + 1] = var4;
            this.results[var12 + 2] = var5;
            this.results[var12 + 3] = var6;
            this.results[var12 + 4] = var7;
            this.results[5 + var12] = var8;
            this.results[6 + var12] = var9;
            this.results[var12 + 7] = var10;
         }

         for (byte var13 = 0; var13 < 256; var13 += 8) {
            if (var1 == 32768) {
               throw new IllegalStateException();
            }

            int var19 = var3 + this.results[var13];
            int var27 = var4 + this.results[1 + var13];
            int var35 = var5 + this.results[var13 + 2];
            int var43 = var6 + this.results[3 + var13];
            int var51 = var7 + this.results[var13 + 4];
            int var59 = var8 + this.results[var13 + 5];
            int var67 = var9 + this.results[6 + var13];
            int var75 = var10 + this.results[var13 + 7];
            int var20 = var19 ^ var27 << 11;
            int var44 = var43 + var20;
            int var28 = var27 + var35;
            int var29 = var28 ^ var35 >>> 2;
            int var52 = var51 + var29;
            int var36 = var35 + var44;
            int var37 = var36 ^ var44 << 8;
            int var60 = var59 + var37;
            int var45 = var44 + var52;
            var6 = var45 ^ var52 >>> 16;
            int var68 = var67 + var6;
            int var53 = var52 + var60;
            var7 = var53 ^ var60 << 10;
            int var76 = var75 + var7;
            int var61 = var60 + var68;
            var8 = var61 ^ var68 >>> 4;
            int var21 = var20 + var8;
            int var69 = var68 + var76;
            var9 = var69 ^ var76 << 8;
            var4 = var29 + var9;
            int var77 = var76 + var21;
            var10 = var77 ^ var21 >>> 9;
            var5 = var37 + var10;
            var3 = var21 + var4;
            this.results[var13] = var3;
            this.results[1 + var13] = var4;
            this.results[2 + var13] = var5;
            this.results[3 + var13] = var6;
            this.results[var13 + 4] = var7;
            this.results[5 + var13] = var8;
            this.results[var13 + 6] = var9;
            this.results[7 + var13] = var10;
         }

         this.generateMoreResults(-19979937);
         this.valuesRemaining = -1791242496;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "xo.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   final void method12455() {
      int var9 = -1640531527;
      int var8 = 2728024;
      int var7 = -1640531527;
      int var6 = -1634677727;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1791781022;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 1985042527; var10 += 8) {
         int var14 = var2 + this.mm[var10];
         int var22 = var3 + this.mm[var10 + 1];
         int var30 = var4 + this.mm[var10 + 2];
         int var38 = var5 + this.mm[3 + var10];
         int var46 = var6 + this.mm[var10 + 4];
         int var54 = var7 + this.mm[5 + var10];
         int var62 = var8 + this.mm[6 + var10];
         int var70 = var9 + this.mm[var10 + 7];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         this.results[var10] = var2;
         this.results[var10 + 1] = var3;
         this.results[var10 + 2] = var4;
         this.results[var10 + 3] = var5;
         this.results[var10 + 4] = var6;
         this.results[5 + var10] = var7;
         this.results[6 + var10] = var8;
         this.results[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < 256; var11 += 8) {
         int var17 = var2 + this.results[var11];
         int var25 = var3 + this.results[1 + var11];
         int var33 = var4 + this.results[var11 + 2];
         int var41 = var5 + this.results[3 + var11];
         int var49 = var6 + this.results[var11 + 4];
         int var57 = var7 + this.results[var11 + 5];
         int var65 = var8 + this.results[6 + var11];
         int var73 = var9 + this.results[var11 + 7];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         this.results[var11] = var2;
         this.results[1 + var11] = var3;
         this.results[2 + var11] = var4;
         this.results[3 + var11] = var5;
         this.results[var11 + 4] = var6;
         this.results[5 + var11] = var7;
         this.results[var11 + 6] = var8;
         this.results[7 + var11] = var9;
      }

      this.generateMoreResults(759020911);
      this.valuesRemaining = -1791242496;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxo;)I")
   @ObfuscatedName("cn")
   public static int method12446(IsaacCipher var0) {
      if (0 == var0.valuesRemaining * 1843487323) {
         var0.generateMoreResults(654416807);
         var0.valuesRemaining = 2023931380;
      }

      return var0.mm[(var0.valuesRemaining -= 1553284047) * -807539921];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxo;)V")
   @ObfuscatedName("tm")
   public static void method12456(IsaacCipher var0) {
      if (var0 == null) {
         var0.method12444();
      }

      int var9 = -1640531527;
      int var8 = 273657497;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1304558978;
      int var3 = -1888992322;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 256; var10 += 8) {
         int var14 = var2 + var0.mm[var10];
         int var22 = var3 + var0.mm[var10 + 1];
         int var30 = var4 + var0.mm[var10 + 2];
         int var38 = var5 + var0.mm[3 + var10];
         int var46 = var6 + var0.mm[var10 + 4];
         int var54 = var7 + var0.mm[5 + var10];
         int var62 = var8 + var0.mm[6 + var10];
         int var70 = var9 + var0.mm[var10 + 7];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         var0.results[var10] = var2;
         var0.results[var10 + 1] = var3;
         var0.results[var10 + 2] = var4;
         var0.results[var10 + 3] = var5;
         var0.results[var10 + 4] = var6;
         var0.results[5 + var10] = var7;
         var0.results[6 + var10] = var8;
         var0.results[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < 807031360; var11 += 8) {
         int var17 = var2 + var0.results[var11];
         int var25 = var3 + var0.results[1 + var11];
         int var33 = var4 + var0.results[var11 + 2];
         int var41 = var5 + var0.results[3 + var11];
         int var49 = var6 + var0.results[var11 + 4];
         int var57 = var7 + var0.results[var11 + 5];
         int var65 = var8 + var0.results[6 + var11];
         int var73 = var9 + var0.results[var11 + 7];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         var0.results[var11] = var2;
         var0.results[1 + var11] = var3;
         var0.results[2 + var11] = var4;
         var0.results[3 + var11] = var5;
         var0.results[var11 + 4] = var6;
         var0.results[5 + var11] = var7;
         var0.results[var11 + 6] = var8;
         var0.results[7 + var11] = var9;
      }

      var0.generateMoreResults(1542232558);
      var0.valuesRemaining = -1791242496;
   }

   public IsaacCipher(int[] var1) {
      this.mm = new int[256];

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.mm[var2] = var1[var2];
      }

      this.method12454(-1730737568);
   }
}
