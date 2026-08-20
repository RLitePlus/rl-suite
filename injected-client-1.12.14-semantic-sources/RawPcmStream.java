import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dk")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("ab")
   public long field1399;
   @ObfuscatedName("aw")
   int numLoops;
   @ObfuscatedName("an")
   int field1394;
   @ObfuscatedName("ay")
   int end;
   @ObfuscatedName("aj")
   int field1402;
   @ObfuscatedName("ah")
   public int field1387;
   @ObfuscatedName("ag")
   int field1400;
   @ObfuscatedName("ak")
   int field1403;
   @ObfuscatedName("ae")
   int field1393;
   @ObfuscatedName("ad")
   int field1395;
   @ObfuscatedName("au")
   boolean field1396;
   @ObfuscatedName("as")
   int field1404;
   @ObfuscatedName("az")
   int field1406;
   @ObfuscatedName("av")
   int field1392;
   @ObfuscatedName("at")
   int field1405;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("ac")
   public class343 field1391 = class343.field4175;
   @ObfuscatedName("ar")
   public int field1390;
   @ObfuscatedName("ax")
   public int field1389;
   @ObfuscatedName("ai")
   int field1401;
   @ObfuscatedName("ap")
   int start;

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("aa")
   static int method3235(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 += (var2[var1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      this.field1399 = 0L;
      this.field1389 = 0;
      this.field1390 = 0;
      this.field1387 = 0;
      this.sound = var1;
      this.field1393 = var1.sampleRate;
      this.field1395 = var1.end;
      this.field1396 = var1.field1471;
      this.start = var2;
      this.field1394 = var3;
      this.end = var4;
      this.numLoops = 0;
      this.method3238();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   static int method3169(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ei")
   public synchronized void method3250(int var1) {
      this.method3243(var1 << 6, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "(Ldq;II)Ldk;")
   @ObfuscatedName("ag")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0
         ? new RawPcmStream(var0, (int)(var0.start * 256L * var1 / (EnumComposition.field2157 * -1036419300)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Ldq;III)Ldk;")
   @ObfuscatedName("an")
   public static RawPcmStream method3180(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;)Z")
   @ObfuscatedName("hn")
   public static boolean method3298(RawPcmStream var0) {
      return var0.numLoops < 0 || var0.numLoops >= ((RawSound)var0.sound).samples.length << 8;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIILdk;)I")
   @ObfuscatedName("ae")
   static int method3184(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;Z)I")
   @ObfuscatedName("ay")
   static int method3187(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11
   ) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIILdk;)I")
   @ObfuscatedName("az")
   static int method3189(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var8.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;)I")
   @ObfuscatedName("ad")
   static int method3190(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("ai")
   static int method3194(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gl")
   public void method3323(int var1) {
      this.method3242(var1);
   }

   RawPcmStream(RawSound var1, int var2, int var3) {
      this.field1399 = 0L;
      this.field1389 = 0;
      this.field1390 = 0;
      this.field1387 = 0;
      this.sound = var1;
      this.field1393 = var1.sampleRate;
      this.field1395 = var1.end;
      this.field1396 = var1.field1471;
      this.start = var2;
      this.field1394 = var3;
      this.end = 8192;
      this.numLoops = 0;
      this.method3238();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;[IIIII)I")
   @ObfuscatedName("qz")
   public static int method3314(RawPcmStream var0, int[] var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method3240(var2);
      }

      while (var0.field1404 > 0) {
         int var6 = var2 + var0.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         var0.field1404 += var2;
         if (var0.start == -256 && (var0.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3224(
                  0,
                  ((RawSound)var0.sound).samples,
                  var1,
                  var0.numLoops,
                  var2,
                  var0.field1392,
                  var0.field1400,
                  var0.field1405,
                  var0.field1401,
                  0,
                  var6,
                  var3,
                  var0
               );
            } else {
               var2 = method3218(((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, var0.field1406, 0, var6, var3, var0);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3235(
               0,
               0,
               ((RawSound)var0.sound).samples,
               var1,
               var0.numLoops,
               var2,
               var0.field1392,
               var0.field1400,
               var0.field1405,
               var0.field1401,
               0,
               var6,
               var3,
               var0,
               var0.start,
               var5
            );
         } else {
            var2 = method3231(
               0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, var0.field1406, 0, var6, var3, var0, var0.start, var5
            );
         }

         var0.field1404 -= var2;
         if (var0.field1404 != 0) {
            return var2;
         }

         if (var0.method3318()) {
            return var4;
         }
      }

      if (var0.start == -256 && (var0.numLoops & 1401623382) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3190(0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1392, var0.field1400, 0, var4, var3, var0)
            : method3189(((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, 0, var4, var3, var0);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3206(0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1392, var0.field1400, 0, var4, var3, var0, var0.start, var5)
            : method3202(0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, 0, var4, var3, var0, var0.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fo")
   public synchronized void method3284(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = Integer.MIN_VALUE;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("ab")
   static int method3206(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("ax")
   static int method3209(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("ar")
   static int method3214(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("ah")
   static int method3218(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ek")
   void method3237() {
      this.field1402 = this.field1394;
      this.field1392 = method3169(this.field1394, this.end);
      this.field1400 = method3172(this.field1394, this.end);
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("ac")
   static int method3202(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("er")
   @Override
   int vmethod160() {
      int var1 = this.field1402 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 674761655);
      if (this.field1403 == 0) {
         var1 -= var1 * this.numLoops / (((RawSound)this.sound).samples.length << 8);
      } else if (this.field1403 >= 0) {
         var1 -= var1 * this.field1393 / ((RawSound)this.sound).samples.length;
      }

      return var1 > -1871665317 ? 545275733 : var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fp")
   public synchronized void method3285(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = -862260652;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fg")
   public synchronized void method3277(int var1, int var2) {
      this.method3281(var1, var2, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   @Override
   int vmethod161() {
      int var1 = this.field1402 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field1403 == 0) {
         var1 -= var1 * this.numLoops / (((RawSound)this.sound).samples.length << 8);
      } else if (this.field1403 >= 0) {
         var1 -= var1 * this.field1393 / ((RawSound)this.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fc")
   public boolean method3299() {
      return this.numLoops < 0 || this.numLoops >= ((RawSound)this.sound).samples.length << 8;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ch")
   public synchronized void method3286(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = Integer.MIN_VALUE;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bm")
   synchronized void method3243(int var1, int var2) {
      this.field1394 = var1;
      this.end = var2;
      this.field1404 = 0;
      this.method3238();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("et")
   public synchronized int method3247() {
      return this.field1394 == Integer.MIN_VALUE ? 0 : this.field1394 + 32 >> 6;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fb")
   public synchronized void method3251(int var1) {
      this.method3243(var1 << 6, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "(Ldk;)Z")
   @ObfuscatedName("jl")
   public static boolean method3300(RawPcmStream var0) {
      return var0 == null ? var0.method3303() : var0.numLoops < 0 || var0.numLoops >= ((RawSound)var0.sound).samples.length << 8;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("am")
   static int method3227(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fq")
   public synchronized void method3280(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method3243(var2, var3);
      } else {
         int var4 = method3169(var2, var3);
         int var5 = method3172(var2, var3);
         if (this.field1392 == var4 && this.field1400 == var5) {
            this.field1404 = 0;
         } else {
            int var6 = var2 - this.field1402;
            if (this.field1402 - var2 > var6) {
               var6 = this.field1402 - var2;
            }

            if (var4 - this.field1392 > var6) {
               var6 = var4 - this.field1392;
            }

            if (this.field1392 - var4 > var6) {
               var6 = this.field1392 - var4;
            }

            if (var5 - this.field1400 > var6) {
               var6 = var5 - this.field1400;
            }

            if (this.field1400 - var5 > var6) {
               var6 = this.field1400 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1404 = var1;
            this.field1394 = var2;
            this.end = var3;
            this.field1406 = (var2 - this.field1402) / var1;
            this.field1405 = (var4 - this.field1392) / var1;
            this.field1401 = (var5 - this.field1400) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public synchronized int method3258() {
      return this.end < 0 ? -1 : this.end;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   public int method3262() {
      RawSound var1 = (RawSound)this.sound;
      return (int)(var1.samples.length * 1000.0 / var1.start);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   public synchronized int method3255() {
      return this.field1394 == Integer.MIN_VALUE ? 0 : this.field1394;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("ds")
   static int method3222(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   public synchronized void method3278(int var1, int var2) {
      this.method3281(var1, var2, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bq")
   public synchronized void method3281(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method3243(var2, var3);
      } else {
         int var4 = method3169(var2, var3);
         int var5 = method3172(var2, var3);
         if (this.field1392 == var4 && this.field1400 == var5) {
            this.field1404 = 0;
         } else {
            int var6 = var2 - this.field1402;
            if (this.field1402 - var2 > var6) {
               var6 = this.field1402 - var2;
            }

            if (var4 - this.field1392 > var6) {
               var6 = var4 - this.field1392;
            }

            if (this.field1392 - var4 > var6) {
               var6 = this.field1392 - var4;
            }

            if (var5 - this.field1400 > var6) {
               var6 = var5 - this.field1400;
            }

            if (this.field1400 - var5 > var6) {
               var6 = this.field1400 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1404 = var1;
            this.field1394 = var2;
            this.end = var3;
            this.field1406 = (var2 - this.field1402) / var1;
            this.field1405 = (var4 - this.field1392) / var1;
            this.field1401 = (var5 - this.field1400) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fm")
   public synchronized void method3287(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = Integer.MIN_VALUE;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod171() {
      return this.field1394 == 0 && this.field1404 == 0 ? 0 : 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fd")
   public synchronized void method3294(int var1) {
      if (this.start < 0) {
         this.start = -var1;
      } else {
         this.start = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gg")
   int method3315(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == -256 && (this.numLoops & 175563164) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3224(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3218(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3235(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3231(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == 1094917856 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3190(0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this)
            : method3189(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3206(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3202(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bk")
   @Override
   protected PcmStream vmethod163() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;Z)I")
   @ObfuscatedName("cq")
   static int method3188(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11
   ) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;
      if (var11) {
         while (var4 < var7) {
            short var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
            var17 = var1[var3++];
            var2[var4++] += var17 * var5 << 2;
            var2[var4++] += var17 * var6 << 2;
         }

         var7 += 6;

         while (var4 < var7) {
            short var21 = var1[var3++];
            var2[var4++] += var21 * var5 << 2;
            var2[var4++] += var21 * var6 << 2;
         }
      } else {
         while (var4 < var7) {
            short var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
            var12 = var1[var3++];
            var2[var4++] += var12 * var5 >> 6;
            var2[var4++] += var12 * var6 >> 6;
         }

         var7 += 6;

         while (var4 < var7) {
            short var16 = var1[var3++];
            var2[var4++] += var16 * var5 >> 6;
            var2[var4++] += var16 * var6 >> 6;
         }
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ev")
   public synchronized int method3259() {
      return this.end < 0 ? -1 : this.end;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ap")
   @Override
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field1394 == 0 && this.field1404 == 0) {
         this.skip(var3);
      } else {
         RawSound var4 = (RawSound)this.sound;
         int var5 = this.field1393 << 8;
         int var6 = this.field1395 << 8;
         int var7 = var4.samples.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field1403 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.numLoops < 0) {
            if (this.start <= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = 0;
         }

         if (this.numLoops >= var7) {
            if (this.start >= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = var7 - 1;
         }

         if (this.field1403 < 0) {
            if (this.field1396) {
               if (this.start < 0) {
                  var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }

               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var6 + var6 - 1 - this.numLoops;
                  this.start = -this.start;
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }
            } else if (this.start < 0) {
               while (true) {
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var6 - 1 - (var6 - 1 - this.numLoops) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var5 + (this.numLoops - var5) % var8;
               }
            }
         } else {
            if (this.field1403 > 0) {
               label183:
               if (this.field1396) {
                  if (this.start < 0) {
                     var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break label183;
                     }
                  }

                  do {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     this.numLoops = var6 + var6 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break;
                     }

                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                  } while (--this.field1403 != 0);
               } else if (this.start < 0) {
                  while (true) {
                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.numLoops) / var8;
                     if (var13 >= this.field1403) {
                        this.numLoops = this.numLoops + var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops += var8 * var13;
                     this.field1403 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     int var10 = (this.numLoops - var5) / var8;
                     if (var10 >= this.field1403) {
                        this.numLoops = this.numLoops - var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops -= var8 * var10;
                     this.field1403 -= var10;
                  }
               }
            }

            if (this.start < 0) {
               this.method3316(var1, var9, 0, var3, 0);
               if (this.numLoops < 0) {
                  this.numLoops = -1;
                  method3274(this);
                  this.remove();
               }
            } else {
               this.method3311(var1, var9, var7, var3, 0);
               if (this.numLoops >= var7) {
                  this.numLoops = var7;
                  method3274(this);
                  this.remove();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   protected int vmethod172() {
      return this.field1394 == 0 && this.field1404 == 0 ? 0 : 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cc")
   static int method3170(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gj")
   int method3316(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == -256 && (this.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3224(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3218(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3235(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3231(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == -256 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3190(0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this)
            : method3189(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3206(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3202(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   static int method3172(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method3320() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fi")
   public synchronized void method3279(int var1, int var2) {
      this.method3281(var1, var2, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bb")
   @Override
   protected PcmStream vmethod164() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ew")
   public synchronized void method3295(int var1) {
      if (this.start < 0) {
         this.start = -var1;
      } else {
         this.start = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fz")
   public synchronized void method3282(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method3243(var2, var3);
      } else {
         int var4 = method3169(var2, var3);
         int var5 = method3172(var2, var3);
         if (this.field1392 == var4 && this.field1400 == var5) {
            this.field1404 = 0;
         } else {
            int var6 = var2 - this.field1402;
            if (this.field1402 - var2 > var6) {
               var6 = this.field1402 - var2;
            }

            if (var4 - this.field1392 > var6) {
               var6 = var4 - this.field1392;
            }

            if (this.field1392 - var4 > var6) {
               var6 = this.field1392 - var4;
            }

            if (var5 - this.field1400 > var6) {
               var6 = var5 - this.field1400;
            }

            if (this.field1400 - var5 > var6) {
               var6 = this.field1400 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1404 = var1;
            this.field1394 = var2;
            this.end = var3;
            this.field1406 = (var2 - this.field1402) / var1;
            this.field1405 = (var4 - this.field1392) / var1;
            this.field1401 = (var5 - this.field1400) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bg")
   @Override
   protected PcmStream vmethod167() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bs")
   @Override
   protected PcmStream vmethod168() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   public synchronized void vmethod176(int var1) {
      if (this.field1404 > 0) {
         if (var1 >= this.field1404) {
            if (this.field1394 == Integer.MIN_VALUE) {
               this.field1394 = 0;
               this.field1400 = 0;
               this.field1392 = 0;
               this.field1402 = 0;
               this.remove();
               var1 = this.field1404;
            }

            this.field1404 = 0;
            this.method3238();
         } else {
            this.field1402 = this.field1402 + this.field1406 * var1;
            this.field1392 = this.field1392 + this.field1405 * var1;
            this.field1400 = this.field1400 + this.field1401 * var1;
            this.field1404 -= var1;
         }
      }

      RawSound var2 = (RawSound)this.sound;
      int var3 = this.field1393 << 8;
      int var4 = this.field1395 << 8;
      int var5 = var2.samples.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field1403 = 0;
      }

      if (this.numLoops < 0) {
         if (this.start <= 0) {
            method3274(this);
            this.remove();
            return;
         }

         this.numLoops = 0;
      }

      if (this.numLoops >= var5) {
         if (this.start >= 0) {
            method3274(this);
            this.remove();
            return;
         }

         this.numLoops = var5 - 1;
      }

      this.numLoops = this.numLoops + this.start * var1;
      if (this.field1403 < 0) {
         if (!this.field1396) {
            if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var4 - 1 - (var4 - 1 - this.numLoops) % var6;
            } else {
               if (this.numLoops < var4) {
                  return;
               }

               this.numLoops = var3 + (this.numLoops - var3) % var6;
            }
         } else {
            if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var3 + var3 - 1 - this.numLoops;
               this.start = -this.start;
            }

            while (this.numLoops >= var4) {
               this.numLoops = var4 + var4 - 1 - this.numLoops;
               this.start = -this.start;
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var3 + var3 - 1 - this.numLoops;
               this.start = -this.start;
            }
         }
      } else {
         if (this.field1403 > 0) {
            label179:
            if (this.field1396) {
               if (this.start < 0) {
                  if (this.numLoops >= var3) {
                     return;
                  }

                  this.numLoops = var3 + var3 - 1 - this.numLoops;
                  this.start = -this.start;
                  if (--this.field1403 == 0) {
                     break label179;
                  }
               }

               do {
                  if (this.numLoops < var4) {
                     return;
                  }

                  this.numLoops = var4 + var4 - 1 - this.numLoops;
                  this.start = -this.start;
                  if (--this.field1403 == 0) {
                     break;
                  }

                  if (this.numLoops >= var3) {
                     return;
                  }

                  this.numLoops = var3 + var3 - 1 - this.numLoops;
                  this.start = -this.start;
               } while (--this.field1403 != 0);
            } else if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.numLoops) / var6;
               if (var7 < this.field1403) {
                  this.numLoops += var6 * var7;
                  this.field1403 -= var7;
                  return;
               }

               this.numLoops = this.numLoops + var6 * this.field1403;
               this.field1403 = 0;
            } else {
               if (this.numLoops < var4) {
                  return;
               }

               int var8 = (this.numLoops - var3) / var6;
               if (var8 < this.field1403) {
                  this.numLoops -= var6 * var8;
                  this.field1403 -= var8;
                  return;
               }

               this.numLoops = this.numLoops - var6 * this.field1403;
               this.field1403 = 0;
            }
         }

         if (this.start < 0) {
            if (this.numLoops < 0) {
               this.numLoops = -1;
               method3274(this);
               this.remove();
            }
         } else if (this.numLoops >= var5) {
            this.numLoops = var5;
            method3274(this);
            this.remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gu")
   public boolean method3304() {
      return this.field1404 != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gn")
   public boolean method3301() {
      return this.numLoops < 0 || this.numLoops >= ((RawSound)this.sound).samples.length << 8;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("ao")
   static int method3231(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cs")
   static int method3173(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cn")
   static int method3174(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("co")
   static int method3175(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldq;II)Ldk;")
   @ObfuscatedName("cx")
   public static RawPcmStream method3177(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0
         ? new RawPcmStream(var0, (int)(var0.start * 256L * var1 / (EnumComposition.field2157 * -1036419300)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   synchronized void method3257(int var1) {
      this.method3243(var1, this.method3258());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldq;II)Ldk;")
   @ObfuscatedName("cp")
   public static RawPcmStream method3178(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0
         ? new RawPcmStream(var0, (int)(var0.start * 256L * var1 / (EnumComposition.field2157 * -1036419300)), var2 << 6)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Ldq;III)Ldk;")
   @ObfuscatedName("cd")
   public static RawPcmStream method3181(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldq;III)Ldk;")
   @ObfuscatedName("cz")
   public static RawPcmStream method3182(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedSignature(descriptor = "(Ldq;III)Ldk;")
   @ObfuscatedName("ci")
   public static RawPcmStream method3183(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eb")
   public int method3263() {
      RawSound var1 = (RawSound)this.sound;
      return (int)(var1.samples.length * 1000.0 / var1.start);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("ca")
   static int method3195(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & -128249167)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;)I")
   @ObfuscatedName("cv")
   static int method3191(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;)I")
   @ObfuscatedName("cw")
   static int method3192(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIILdk;)I")
   @ObfuscatedName("cr")
   static int method3193(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         short var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5 >> 6;
         var2[var4++] += var11 * var6 >> 6;
      }

      var7 += 6;

      while (var4 < var7) {
         short var15 = var1[var3--];
         var2[var4++] += var15 * var5 >> 6;
         var2[var4++] += var15 * var6 >> 6;
      }

      var10.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("cj")
   static int method3196(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - -2136662960) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 237042292)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         short var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 1520123686)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Ldk;)V")
   @ObfuscatedName("nc")
   public static void method3274(RawPcmStream var0) {
      if (var0 == null) {
         var0.method3276();
      } else {
         if (var0.field1404 != 0) {
            if (var0.field1394 == Integer.MIN_VALUE) {
               var0.field1394 = 0;
            }

            var0.field1404 = 0;
            var0.method3238();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ck")
   static int method3171(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((691794077 - var1) * 1.2207031E-4F) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("cl")
   static int method3197(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 585845032) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & -2050628982) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("dd")
   static int method3198(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   @Override
   public synchronized void skip(int var1) {
      if (this.field1404 > 0) {
         if (var1 >= this.field1404) {
            if (this.field1394 == Integer.MIN_VALUE) {
               this.field1394 = 0;
               this.field1400 = 0;
               this.field1392 = 0;
               this.field1402 = 0;
               this.remove();
               var1 = this.field1404;
            }

            this.field1404 = 0;
            this.method3238();
         } else {
            this.field1402 = this.field1402 + this.field1406 * var1;
            this.field1392 = this.field1392 + this.field1405 * var1;
            this.field1400 = this.field1400 + this.field1401 * var1;
            this.field1404 -= var1;
         }
      }

      RawSound var2 = (RawSound)this.sound;
      int var3 = this.field1393 << 8;
      int var4 = this.field1395 << 8;
      int var5 = var2.samples.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field1403 = 0;
      }

      if (this.numLoops < 0) {
         if (this.start <= 0) {
            method3274(this);
            this.remove();
            return;
         }

         this.numLoops = 0;
      }

      if (this.numLoops >= var5) {
         if (this.start >= 0) {
            method3274(this);
            this.remove();
            return;
         }

         this.numLoops = var5 - 1;
      }

      this.numLoops = this.numLoops + this.start * var1;
      if (this.field1403 < 0) {
         if (!this.field1396) {
            if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var4 - 1 - (var4 - 1 - this.numLoops) % var6;
            } else {
               if (this.numLoops < var4) {
                  return;
               }

               this.numLoops = var3 + (this.numLoops - var3) % var6;
            }
         } else {
            if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var3 + var3 - 1 - this.numLoops;
               this.start = -this.start;
            }

            while (this.numLoops >= var4) {
               this.numLoops = var4 + var4 - 1 - this.numLoops;
               this.start = -this.start;
               if (this.numLoops >= var3) {
                  return;
               }

               this.numLoops = var3 + var3 - 1 - this.numLoops;
               this.start = -this.start;
            }
         }
      } else {
         if (this.field1403 > 0) {
            label173:
            if (this.field1396) {
               if (this.start < 0) {
                  if (this.numLoops >= var3) {
                     return;
                  }

                  this.numLoops = var3 + var3 - 1 - this.numLoops;
                  this.start = -this.start;
                  if (--this.field1403 == 0) {
                     break label173;
                  }
               }

               do {
                  if (this.numLoops < var4) {
                     return;
                  }

                  this.numLoops = var4 + var4 - 1 - this.numLoops;
                  this.start = -this.start;
                  if (--this.field1403 == 0) {
                     break;
                  }

                  if (this.numLoops >= var3) {
                     return;
                  }

                  this.numLoops = var3 + var3 - 1 - this.numLoops;
                  this.start = -this.start;
               } while (--this.field1403 != 0);
            } else if (this.start < 0) {
               if (this.numLoops >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.numLoops) / var6;
               if (var7 < this.field1403) {
                  this.numLoops += var6 * var7;
                  this.field1403 -= var7;
                  return;
               }

               this.numLoops = this.numLoops + var6 * this.field1403;
               this.field1403 = 0;
            } else {
               if (this.numLoops < var4) {
                  return;
               }

               int var8 = (this.numLoops - var3) / var6;
               if (var8 < this.field1403) {
                  this.numLoops -= var6 * var8;
                  this.field1403 -= var8;
                  return;
               }

               this.numLoops = this.numLoops - var6 * this.field1403;
               this.field1403 = 0;
            }
         }

         if (this.start < 0) {
            if (this.numLoops < 0) {
               this.numLoops = -1;
               method3274(this);
               this.remove();
            }
         } else if (this.numLoops >= var5) {
            this.numLoops = var5;
            method3274(this);
            this.remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldk;)Z")
   @ObfuscatedName("nf")
   public static boolean method3305(RawPcmStream var0) {
      return var0 == null ? var0.method3309() : var0.field1404 != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("dv")
   static int method3199(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & -207976803) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("df")
   static int method3203(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("dy")
   static int method3204(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 1419344974 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIILdk;II)I")
   @ObfuscatedName("dc")
   static int method3205(
      int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         short var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("db")
   static int method3207(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & -980248496) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("dt")
   static int method3208(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 += (var2[var1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("dh")
   static int method3210(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("dz")
   static int method3211(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("di")
   static int method3212(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;)Ljava/lang/String;")
   @ObfuscatedName("wg")
   public static String method3321(RawPcmStream var0) {
      if (var0 == null) {
         var0.method3263();
      }

      return var0.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("dl")
   static int method3213(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("af")
   static int method3225(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         short var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldq;II)Ldk;")
   @ObfuscatedName("cg")
   public static RawPcmStream method3179(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0
         ? new RawPcmStream(var0, (int)(var0.start * 256L * var1 / (EnumComposition.field2157 * -1036419300)), var2 << 6)
         : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("dw")
   static int method3200(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 576551964) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("du")
   static int method3219(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("dm")
   static int method3220(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIIILdk;)I")
   @ObfuscatedName("dp")
   static int method3221(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1392 = var9.field1392 + var9.field1405 * (var6 - var3);
      var9.field1400 = var9.field1400 + var9.field1401 * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.field1402 = var4 >> 2;
      var9.numLoops = var2 << 8;
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("dg")
   static int method3223(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ed")
   public int method3264() {
      RawSound var1 = (RawSound)this.sound;
      return (int)(var1.samples.length * 1000.0 / var1.start);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("de")
   static int method3226(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         short var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("ak")
   @Override
   protected PcmStream nextSubStream() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("dk")
   static int method3228(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("dn")
   static int method3229(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 0xFF) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;)Ljava/lang/String;")
   @ObfuscatedName("mi")
   public static String method3322(RawPcmStream var0) {
      if (var0 == null) {
         var0.method3299();
      }

      return var0.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("ec")
   static int method3232(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("ct")
   int method3310(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3214(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3209(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3227(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3225(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3187(
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               0,
               var4,
               var3,
               this,
               ((RawSound)this.sound).method3413()
            )
            : method3184(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3201(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3194(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("ee")
   static int method3233(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("eq")
   static int method3236(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 += (var2[var1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   @Override
   int vmethod162() {
      int var1 = this.field1402 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field1403 == 0) {
         var1 -= var1 * this.numLoops / (((RawSound)this.sound).samples.length << 8);
      } else if (this.field1403 >= 0) {
         var1 -= var1 * this.field1393 / ((RawSound)this.sound).samples.length;
      }

      return var1 > -931088266 ? 255 : var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIIIILdk;II)I")
   @ObfuscatedName("do")
   static int method3230(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      RawPcmStream var13,
      int var14,
      int var15
   ) {
      var13.field1402 = var13.field1402 - var13.field1406 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 1394935629) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 += (var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 += (var21 - var18) * (var4 & 1408744448) >> 8;
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1402 = var13.field1402 + var13.field1406 * var5;
      var13.field1392 = var6;
      var13.field1400 = var7;
      var13.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fy")
   public synchronized void method3288(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = Integer.MIN_VALUE;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bt")
   public synchronized void method3239(int var1) {
      this.field1403 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eu")
   public synchronized void method3240(int var1) {
      this.field1403 = var1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bf")
   @Override
   public synchronized void vmethod174(int[] var1, int var2, int var3) {
      if (this.field1394 == 0 && this.field1404 == 0) {
         this.skip(var3);
      } else {
         RawSound var4 = (RawSound)this.sound;
         int var5 = this.field1393 << 8;
         int var6 = this.field1395 << 8;
         int var7 = var4.samples.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field1403 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.numLoops < 0) {
            if (this.start <= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = 0;
         }

         if (this.numLoops >= var7) {
            if (this.start >= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = var7 - 1;
         }

         if (this.field1403 < 0) {
            if (this.field1396) {
               if (this.start < 0) {
                  var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }

               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var6 + var6 - 1 - this.numLoops;
                  this.start = -this.start;
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }
            } else if (this.start < 0) {
               while (true) {
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var6 - 1 - (var6 - 1 - this.numLoops) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var5 + (this.numLoops - var5) % var8;
               }
            }
         } else {
            if (this.field1403 > 0) {
               label188:
               if (this.field1396) {
                  if (this.start < 0) {
                     var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break label188;
                     }
                  }

                  do {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     this.numLoops = var6 + var6 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break;
                     }

                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                  } while (--this.field1403 != 0);
               } else if (this.start < 0) {
                  while (true) {
                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.numLoops) / var8;
                     if (var13 >= this.field1403) {
                        this.numLoops = this.numLoops + var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops += var8 * var13;
                     this.field1403 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     int var10 = (this.numLoops - var5) / var8;
                     if (var10 >= this.field1403) {
                        this.numLoops = this.numLoops - var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops -= var8 * var10;
                     this.field1403 -= var10;
                  }
               }
            }

            if (this.start < 0) {
               this.method3316(var1, var9, 0, var3, 0);
               if (this.numLoops < 0) {
                  this.numLoops = -1;
                  method3274(this);
                  this.remove();
               }
            } else {
               this.method3311(var1, var9, var7, var3, 0);
               if (this.numLoops >= var7) {
                  this.numLoops = var7;
                  method3274(this);
                  this.remove();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("em")
   synchronized void method3244(int var1, int var2) {
      this.field1394 = var1;
      this.end = var2;
      this.field1404 = 0;
      this.method3238();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("eg")
   synchronized void method3245(int var1, int var2) {
      this.field1394 = var1;
      this.end = var2;
      this.field1404 = 0;
      this.method3238();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("el")
   synchronized void method3246(int var1, int var2) {
      this.field1394 = var1;
      this.end = var2;
      this.field1404 = 0;
      this.method3238();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ez")
   public synchronized int method3248() {
      return this.field1394 == Integer.MIN_VALUE ? 0 : this.field1394 + 32 >> 6;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ep")
   public synchronized int method3249() {
      return this.field1394 == Integer.MIN_VALUE ? 0 : this.field1394 + 32 >> 6;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   public synchronized void setNumLoops(int var1) {
      this.method3243(var1 << 6, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method3238() {
      this.field1402 = this.field1394;
      this.field1392 = method3169(this.field1394, this.end);
      this.field1400 = method3172(this.field1394, this.end);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fe")
   public synchronized void method3253(int var1) {
      this.method3243(var1 << 6, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   public synchronized int method3256() {
      return this.field1394 == Integer.MIN_VALUE ? 0 : this.field1394;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   public synchronized void method3241(int var1) {
      this.field1403 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public synchronized int method3260() {
      return this.end < 0 ? -1 : this.end;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eh")
   public synchronized int method3261() {
      return this.end < 0 ? -1 : this.end;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fx")
   public synchronized int method3291() {
      return this.start < 0 ? -this.start : this.start;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("en")
   public int method3265() {
      RawSound var1 = (RawSound)this.sound;
      return (int)(var1.samples.length * 1000.0 / var1.start);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("ea")
   static int method3234(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      var11.field1392 = var11.field1392 - var11.field1405 * var5;
      var11.field1400 = var11.field1400 - var11.field1401 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + -26919570 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         short var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1392 = var11.field1392 + var11.field1405 * var5;
      var11.field1400 = var11.field1400 + var11.field1401 * var5;
      var11.field1402 = var6;
      var11.numLoops = var4;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fw")
   public synchronized void method3266(int var1) {
      int var2 = ((RawSound)this.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.numLoops = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bo")
   @Override
   protected PcmStream vmethod169() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public synchronized void method3267(int var1) {
      int var2 = ((RawSound)this.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.numLoops = var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fn")
   public synchronized void method3270(boolean var1) {
      this.start = (this.start ^ this.start >> 31) + (this.start >>> 31);
      if (var1) {
         this.start = -this.start;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fl")
   public synchronized void method3271(boolean var1) {
      this.start = (this.start ^ this.start >> 31) + (this.start >>> 31);
      if (var1) {
         this.start = -this.start;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fh")
   public synchronized void method3272(boolean var1) {
      this.start = (this.start ^ this.start >> 31) + (this.start >>> -1943487258);
      if (var1) {
         this.start = -this.start;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("dr")
   static int method3215(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("dq")
   static int method3216(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ft")
   public synchronized void method3283(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method3243(var2, var3);
      } else {
         int var4 = method3169(var2, var3);
         int var5 = method3172(var2, var3);
         if (this.field1392 == var4 && this.field1400 == var5) {
            this.field1404 = 0;
         } else {
            int var6 = var2 - this.field1402;
            if (this.field1402 - var2 > var6) {
               var6 = this.field1402 - var2;
            }

            if (var4 - this.field1392 > var6) {
               var6 = var4 - this.field1392;
            }

            if (this.field1392 - var4 > var6) {
               var6 = this.field1392 - var4;
            }

            if (var5 - this.field1400 > var6) {
               var6 = var5 - this.field1400;
            }

            if (this.field1400 - var5 > var6) {
               var6 = this.field1400 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1404 = var1;
            this.field1394 = var2;
            this.end = var3;
            this.field1406 = (var2 - this.field1402) / var1;
            this.field1405 = (var4 - this.field1392) / var1;
            this.field1401 = (var5 - this.field1400) / var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fu")
   public synchronized void method3268(int var1) {
      int var2 = ((RawSound)this.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.numLoops = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method3318() {
      int var1 = this.field1394;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method3169(var1, this.end);
         var3 = method3172(var1, this.end);
      }

      if (this.field1402 == var1 && this.field1392 == var2 && this.field1400 == var3) {
         if (this.field1394 == Integer.MIN_VALUE) {
            this.field1394 = 0;
            this.field1400 = 0;
            this.field1392 = 0;
            this.field1402 = 0;
            this.remove();
            return true;
         } else {
            this.method3238();
            return false;
         }
      } else {
         if (this.field1402 < var1) {
            this.field1406 = 1;
            this.field1404 = var1 - this.field1402;
         } else if (this.field1402 > var1) {
            this.field1406 = -1;
            this.field1404 = this.field1402 - var1;
         } else {
            this.field1406 = 0;
         }

         if (this.field1392 < var2) {
            this.field1405 = 1;
            if (this.field1404 == 0 || this.field1404 > var2 - this.field1392) {
               this.field1404 = var2 - this.field1392;
            }
         } else if (this.field1392 > var2) {
            this.field1405 = -1;
            if (this.field1404 == 0 || this.field1404 > this.field1392 - var2) {
               this.field1404 = this.field1392 - var2;
            }
         } else {
            this.field1405 = 0;
         }

         if (this.field1400 < var3) {
            this.field1401 = 1;
            if (this.field1404 == 0 || this.field1404 > var3 - this.field1400) {
               this.field1404 = var3 - this.field1400;
            }
         } else if (this.field1400 > var3) {
            this.field1401 = -1;
            if (this.field1404 == 0 || this.field1404 > this.field1400 - var3) {
               this.field1404 = this.field1400 - var3;
            }
         } else {
            this.field1401 = 0;
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ff")
   public synchronized void method3289(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = Integer.MIN_VALUE;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("al")
   static int method3224(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3--];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("br")
   public synchronized void method3254(int var1) {
      this.method3243(var1 << 6, this.method3258());
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("aj")
   @Override
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bh")
   public synchronized void method3273(boolean var1) {
      this.start = (this.start ^ this.start >> 31) + (this.start >>> 31);
      if (var1) {
         this.start = -this.start;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ey")
   public synchronized void method3290(int var1) {
      if (var1 == 0) {
         this.method3257(0);
         this.remove();
      } else if (this.field1392 == 0 && this.field1400 == 0) {
         this.field1404 = 0;
         this.field1394 = 0;
         this.field1402 = 0;
         this.remove();
      } else {
         int var2 = -this.field1402;
         if (this.field1402 > var2) {
            var2 = this.field1402;
         }

         if (-this.field1392 > var2) {
            var2 = -this.field1392;
         }

         if (this.field1392 > var2) {
            var2 = this.field1392;
         }

         if (-this.field1400 > var2) {
            var2 = -this.field1400;
         }

         if (this.field1400 > var2) {
            var2 = this.field1400;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1404 = var1;
         this.field1394 = 915379838;
         this.field1406 = -this.field1402 / var1;
         this.field1405 = -this.field1392 / var1;
         this.field1401 = -this.field1400 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gk")
   boolean method3319() {
      int var1 = this.field1394;
      int var2;
      int var3;
      if (var1 == 167549601) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method3169(var1, this.end);
         var3 = method3172(var1, this.end);
      }

      if (this.field1402 == var1 && this.field1392 == var2 && this.field1400 == var3) {
         if (this.field1394 == Integer.MIN_VALUE) {
            this.field1394 = 0;
            this.field1400 = 0;
            this.field1392 = 0;
            this.field1402 = 0;
            this.remove();
            return true;
         } else {
            this.method3238();
            return false;
         }
      } else {
         if (this.field1402 < var1) {
            this.field1406 = 1;
            this.field1404 = var1 - this.field1402;
         } else if (this.field1402 > var1) {
            this.field1406 = -1;
            this.field1404 = this.field1402 - var1;
         } else {
            this.field1406 = 0;
         }

         if (this.field1392 < var2) {
            this.field1405 = 1;
            if (this.field1404 == 0 || this.field1404 > var2 - this.field1392) {
               this.field1404 = var2 - this.field1392;
            }
         } else if (this.field1392 > var2) {
            this.field1405 = -1;
            if (this.field1404 == 0 || this.field1404 > this.field1392 - var2) {
               this.field1404 = this.field1392 - var2;
            }
         } else {
            this.field1405 = 0;
         }

         if (this.field1400 < var3) {
            this.field1401 = 1;
            if (this.field1404 == 0 || this.field1404 > var3 - this.field1400) {
               this.field1404 = var3 - this.field1400;
            }
         } else if (this.field1400 > var3) {
            this.field1401 = -1;
            if (this.field1404 == 0 || this.field1404 > this.field1400 - var3) {
               this.field1404 = this.field1400 - var3;
            }
         } else {
            this.field1401 = 0;
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fv")
   public synchronized int method3292() {
      return this.start < 0 ? -this.start : this.start;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[S[IIIIIIIIIILdk;)I")
   @ObfuscatedName("dx")
   static int method3217(
      int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field1402 = var12.field1402 + var12.field1406 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         short var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var13 * var6 >> 6;
         var6 += var8;
      }

      for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
         short var17 = var1[var3++];
         var2[var4++] += var17 * var5 >> 6;
         var5 += var7;
         var2[var4++] += var17 * var6 >> 6;
      }

      var12.field1392 = var5;
      var12.field1400 = var6;
      var12.numLoops = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ef")
   public synchronized void method3296(int var1) {
      if (this.start < 0) {
         this.start = -var1;
      } else {
         this.start = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fj")
   public synchronized void method3297(int var1) {
      if (this.start < 0) {
         this.start = -var1;
      } else {
         this.start = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   public synchronized void method3242(int var1) {
      this.field1403 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fr")
   public boolean method3302() {
      return this.numLoops < 0 || this.numLoops >= ((RawSound)this.sound).samples.length << 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;)V")
   @ObfuscatedName("gm")
   public static void method3275(RawPcmStream var0) {
      if (var0.field1404 != 0) {
         if (var0.field1394 == Integer.MIN_VALUE) {
            var0.field1394 = 0;
         }

         var0.field1404 = 0;
         var0.method3238();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bz")
   @Override
   protected PcmStream vmethod166() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("cm")
   int method3311(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3214(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3209(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3227(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3225(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3187(
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               0,
               var4,
               var3,
               this,
               ((RawSound)this.sound).method3413()
            )
            : method3184(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3201(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3194(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gf")
   public boolean method3306() {
      return this.field1404 != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gd")
   public boolean method3307() {
      return this.field1404 != 0;
   }

   @ObfuscatedSignature(descriptor = "(II[S[IIIIIIIILdk;II)I")
   @ObfuscatedName("as")
   static int method3201(
      int var0,
      int var1,
      short[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      RawPcmStream var11,
      int var12,
      int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 += (var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8;
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 += (var19 - var16) * (var4 & 0xFF) >> 8;
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.numLoops = var4;
      return var5 >> 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([S[IIIIIIILdk;)I")
   @ObfuscatedName("cf")
   static int method3185(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.numLoops = var2 << 8;
      return var3;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("gs")
   int method3312(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == 1684682469 && (this.numLoops & -1538408056) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3214(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3209(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3227(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3225(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3187(
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               0,
               var4,
               var3,
               this,
               ((RawSound)this.sound).method3413()
            )
            : method3184(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3201(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3194(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;Lrx;)V")
   @ObfuscatedName("ib")
   public static void method3186(TileItem var0, ProjectionCoord var1) {
      if (var0 == null) {
         var0.vmethod52();
      }

      var0.field1284 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fk")
   public synchronized void method3269(int var1) {
      int var2 = ((RawSound)this.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.numLoops = var1;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)I")
   @ObfuscatedName("go")
   int method3313(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.field1404 > 0) {
         int var6 = var2 + this.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         this.field1404 += var2;
         if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3214(
                  0,
                  ((RawSound)this.sound).samples,
                  var1,
                  this.numLoops,
                  var2,
                  this.field1392,
                  this.field1400,
                  this.field1405,
                  this.field1401,
                  0,
                  var6,
                  var3,
                  this
               );
            } else {
               var2 = method3209(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3227(
               0,
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               this.field1405,
               this.field1401,
               0,
               var6,
               var3,
               this,
               this.start,
               var5
            );
         } else {
            var2 = method3225(
               0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, this.field1406, 0, var6, var3, this, this.start, var5
            );
         }

         this.field1404 -= var2;
         if (this.field1404 != 0) {
            return var2;
         }

         if (this.method3318()) {
            return var4;
         }
      }

      if (this.start == 256 && (this.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3187(
               0,
               ((RawSound)this.sound).samples,
               var1,
               this.numLoops,
               var2,
               this.field1392,
               this.field1400,
               0,
               var4,
               var3,
               this,
               ((RawSound)this.sound).method3413()
            )
            : method3184(((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3201(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1392, this.field1400, 0, var4, var3, this, this.start, var5)
            : method3194(0, 0, ((RawSound)this.sound).samples, var1, this.numLoops, var2, this.field1402, 0, var4, var3, this, this.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bw")
   @Override
   public synchronized void vmethod175(int[] var1, int var2, int var3) {
      if (this.field1394 == 0 && this.field1404 == 0) {
         this.skip(var3);
      } else {
         RawSound var4 = (RawSound)this.sound;
         int var5 = this.field1393 << 8;
         int var6 = this.field1395 << 8;
         int var7 = var4.samples.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field1403 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.numLoops < 0) {
            if (this.start <= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = 0;
         }

         if (this.numLoops >= var7) {
            if (this.start >= 0) {
               method3274(this);
               this.remove();
               return;
            }

            this.numLoops = var7 - 1;
         }

         if (this.field1403 < 0) {
            if (this.field1396) {
               if (this.start < 0) {
                  var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }

               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var6 + var6 - 1 - this.numLoops;
                  this.start = -this.start;
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var5 + var5 - 1 - this.numLoops;
                  this.start = -this.start;
               }
            } else if (this.start < 0) {
               while (true) {
                  var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                  if (this.numLoops >= var5) {
                     return;
                  }

                  this.numLoops = var6 - 1 - (var6 - 1 - this.numLoops) % var8;
               }
            } else {
               while (true) {
                  var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                  if (this.numLoops < var6) {
                     return;
                  }

                  this.numLoops = var5 + (this.numLoops - var5) % var8;
               }
            }
         } else {
            if (this.field1403 > 0) {
               label189:
               if (this.field1396) {
                  if (this.start < 0) {
                     var9 = this.method3316(var1, var2, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break label189;
                     }
                  }

                  do {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     this.numLoops = var6 + var6 - 1 - this.numLoops;
                     this.start = -this.start;
                     if (--this.field1403 == 0) {
                        break;
                     }

                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1393]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     this.numLoops = var5 + var5 - 1 - this.numLoops;
                     this.start = -this.start;
                  } while (--this.field1403 != 0);
               } else if (this.start < 0) {
                  while (true) {
                     var9 = this.method3316(var1, var9, var5, var3, var4.samples[this.field1395 - 1]);
                     if (this.numLoops >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.numLoops) / var8;
                     if (var13 >= this.field1403) {
                        this.numLoops = this.numLoops + var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops += var8 * var13;
                     this.field1403 -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.method3311(var1, var9, var6, var3, var4.samples[this.field1393]);
                     if (this.numLoops < var6) {
                        return;
                     }

                     int var10 = (this.numLoops - var5) / var8;
                     if (var10 >= this.field1403) {
                        this.numLoops = this.numLoops - var8 * this.field1403;
                        this.field1403 = 0;
                        break;
                     }

                     this.numLoops -= var8 * var10;
                     this.field1403 -= var10;
                  }
               }
            }

            if (this.start < 0) {
               this.method3316(var1, var9, 0, var3, 0);
               if (this.numLoops < 0) {
                  this.numLoops = -1;
                  method3274(this);
                  this.remove();
               }
            } else {
               this.method3311(var1, var9, var7, var3, 0);
               if (this.numLoops >= var7) {
                  this.numLoops = var7;
                  method3274(this);
                  this.remove();
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gm")
   public boolean method3308() {
      return this.field1404 != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;[IIIII)I")
   @ObfuscatedName("ft")
   public static int method3317(RawPcmStream var0, int[] var1, int var2, int var3, int var4, int var5) {
      while (var0.field1404 > 0) {
         int var6 = var2 + var0.field1404;
         if (var6 > var4) {
            var6 = var4;
         }

         var0.field1404 += var2;
         if (var0.start == -256 && (var0.numLoops & 0xFF) == 0) {
            if (FaceNormal.PcmPlayer_stereo) {
               var2 = method3224(
                  0,
                  ((RawSound)var0.sound).samples,
                  var1,
                  var0.numLoops,
                  var2,
                  var0.field1392,
                  var0.field1400,
                  var0.field1405,
                  var0.field1401,
                  0,
                  var6,
                  var3,
                  var0
               );
            } else {
               var2 = method3218(((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, var0.field1406, 0, var6, var3, var0);
            }
         } else if (FaceNormal.PcmPlayer_stereo) {
            var2 = method3235(
               0,
               0,
               ((RawSound)var0.sound).samples,
               var1,
               var0.numLoops,
               var2,
               var0.field1392,
               var0.field1400,
               var0.field1405,
               var0.field1401,
               0,
               var6,
               var3,
               var0,
               var0.start,
               var5
            );
         } else {
            var2 = method3231(
               0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, var0.field1406, 0, var6, var3, var0, var0.start, var5
            );
         }

         var0.field1404 -= var2;
         if (var0.field1404 != 0) {
            return var2;
         }

         if (var0.method3318()) {
            return var4;
         }
      }

      if (var0.start == -256 && (var0.numLoops & 0xFF) == 0) {
         return FaceNormal.PcmPlayer_stereo
            ? method3190(0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1392, var0.field1400, 0, var4, var3, var0)
            : method3189(((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, 0, var4, var3, var0);
      } else {
         return FaceNormal.PcmPlayer_stereo
            ? method3206(0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1392, var0.field1400, 0, var4, var3, var0, var0.start, var5)
            : method3202(0, 0, ((RawSound)var0.sound).samples, var1, var0.numLoops, var2, var0.field1402, 0, var4, var3, var0, var0.start, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("by")
   public synchronized int method3293() {
      return this.start < 0 ? -this.start : this.start;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   void method3276() {
      if (this.field1402 != 0) {
         if (this.start == Integer.MIN_VALUE) {
            this.field1404 = 0;
         }

         this.start = 0;
         this.method3237();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   public boolean method3303() {
      return this.field1392 < 0 || this.field1403 >= ((RawSound)this.sound).samples.length << 8;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   public boolean method3309() {
      return this.field1393 != 0;
   }
}
