import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bc")
public class classBC extends Node {
   @ObfuscatedName("ad")
   static float[] field356;
   @ObfuscatedSignature(descriptor = "[Lbx;")
   @ObfuscatedName("af")
   static classBX[] field370;
   @ObfuscatedName("ae")
   static int field345;
   @ObfuscatedName("ab")
   static int field344;
   @ObfuscatedSignature(descriptor = "[Lay;")
   @ObfuscatedName("ag")
   static classAY[] field368;
   @ObfuscatedSignature(descriptor = "[Lan;")
   @ObfuscatedName("as")
   static classAN[] field367;
   @ObfuscatedSignature(descriptor = "[Lbn;")
   @ObfuscatedName("ax")
   static classBN[] field369;
   @ObfuscatedName("aw")
   int field350;
   @ObfuscatedName("aa")
   static int[] field364;
   @ObfuscatedName("ao")
   static boolean field343 = false;
   @ObfuscatedName("an")
   boolean field354;
   @ObfuscatedName("aj")
   static float[] field357;
   @ObfuscatedName("bc")
   float[] field363;
   @ObfuscatedName("aq")
   static float[] field361;
   @ObfuscatedName("al")
   static float[] field358;
   @ObfuscatedSignature(descriptor = "Lbt;")
   @ObfuscatedName("az")
   static classBT field342 = new classBT();
   @ObfuscatedName("au")
   static int[] field366;
   @ObfuscatedName("bn")
   int field352;
   @ObfuscatedName("ar")
   byte[][] field373;
   @ObfuscatedName("ah")
   int field346;
   @ObfuscatedName("ac")
   static boolean[] field372;
   @ObfuscatedName("at")
   int field348;
   @ObfuscatedName("bm")
   int field351;
   @ObfuscatedName("ak")
   int field347;
   @ObfuscatedName("am")
   float[] field359;
   @ObfuscatedName("av")
   int field349;
   @ObfuscatedName("br")
   int field353;
   @ObfuscatedName("bx")
   boolean field355;
   @ObfuscatedName("ai")
   static int[] field365;
   @ObfuscatedName("bp")
   short[] field371;
   @ObfuscatedName("ap")
   static float[] field360;
   @ObfuscatedName("ay")
   static float[] field362;

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("aw")
   float[] method970(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field373[var1], 0, -1144331984);
      this.field359 = new float[field344];
      classBT.method1235(var2, 512489494);
      int var3 = var2.method1231(classZA.method13821(field364.length - 1, (byte)71), -2142862039);
      boolean var4 = field372[var3];
      int var5 = var4 ? field344 : field345;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, 271117459) != 0;
         var7 = classBT.method1235(var2, -1712140249) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (field345 >> 2);
         var10 = (var5 >> 2) + (field345 >> 2);
         var11 = field345 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field345 >> 2);
         var13 = var5 - (var5 >> 2) + (field345 >> 2);
         var14 = field345 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = field369[field364[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = field368[var17].method741(var2, field370);
      boolean var19 = !var18.method1160(-1013171937);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = field367[var15.field518[var20]];
         float[] var22 = this.field359;
         var21.method611(var22, var5 >> 1, var19, var2, field370);
      }

      if (var18.method1160(-313627789)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field359, var5 >> 1, 1692665275);
      }

      if (!var18.method1160(-1093621258)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field359[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field359;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field361 : field358;
         float[] var25 = var4 ? field356 : field357;
         float[] var26 = var4 ? field360 : field362;
         int[] var27 = var4 ? field365 : field366;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
            float var31 = var57[2 * var28];
            float var32 = var57[2 * var28 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[var46 + 3 + 4 * var58];
            float var73 = var23[var46 + 1 + 4 * var58];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[4 * var58 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var46 + 1 + 4 * var58] = var73 + var83;
            float var33 = var57[var46 - 4 - 4 * var58];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
            var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
         }

         int var59 = classZA.method13821(var5 - 1, (byte)122);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - var74 * (2 * var84 + 1);

               for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var35 * var80];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[var81 + 1];
               var23[var81 + 1] = var23[var85 + 1];
               var23[var85 + 1] = var88;
               var88 = var23[var81 + 3];
               var23[var81 + 3] = var23[var85 + 3];
               var23[var85 + 3] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[var85 + 5];
               var23[var85 + 5] = var88;
               var88 = var23[var81 + 7];
               var23[var81 + 7] = var23[var85 + 7];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[2 * var63 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - 2 * var64] = var23[4 * var64];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
            var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[2 * var65 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + 2 * var65 + 1];
            float var94 = var23[var5 - 2 - 2 * var65];
            float var95 = var23[var5 - 1 - 2 * var65];
            float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
            var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
            var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
            var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
            var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var5 - var48 + var67] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var48 + var68];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var48 + var69] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
            this.field359[var71] = this.field359[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field359[var72] = this.field359[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field349 > 0) {
         int var49 = this.field349 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field355) {
            for (int var52 = 0; var52 < this.field353; var52++) {
               int var54 = (this.field349 >> 1) + var52;
               var47[var52] += this.field363[var54];
            }
         }

         if (var18.method1160(1199033426)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field359[var53];
            }
         }
      }

      float[] var50 = this.field363;
      this.field363 = this.field359;
      this.field359 = var50;
      this.field349 = var5;
      this.field353 = var13 - (var5 >> 1);
      this.field355 = !var18.method1160(1902560190);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("az")
   static float method953(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("af")
   static void method957(byte[] var0) {
      classBT var1 = field342;
      var1.method1239(var0, 0, -1144331984);
      field345 = 1 << var1.method1231(4, -1972924072);
      field344 = 1 << var1.method1231(4, -2048591099);

      for (int var2 = 0; var2 < 2; var2++) {
         int var3 = var2 != 0 ? field344 : field345;
         int var4 = var3 >> 1;
         int var5 = var3 >> 2;
         int var6 = var3 >> 3;
         float[] var7 = new float[var4];

         for (int var8 = 0; var8 < var5; var8++) {
            var7[2 * var8] = (float)Math.cos(4 * var8 * Math.PI / var3);
            var7[2 * var8 + 1] = -((float)Math.sin(4 * var8 * Math.PI / var3));
         }

         float[] var31 = new float[var4];

         for (int var9 = 0; var9 < var5; var9++) {
            var31[2 * var9] = (float)Math.cos((2 * var9 + 1) * Math.PI / (2 * var3));
            var31[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * Math.PI / (2 * var3));
         }

         float[] var32 = new float[var5];

         for (int var10 = 0; var10 < var6; var10++) {
            var32[2 * var10] = (float)Math.cos((4 * var10 + 2) * Math.PI / var3);
            var32[2 * var10 + 1] = -((float)Math.sin((4 * var10 + 2) * Math.PI / var3));
         }

         int[] var33 = new int[var6];
         int var11 = classZA.method13821(var6 - 1, (byte)25);

         for (int var12 = 0; var12 < var6; var12++) {
            int var16 = var12;
            int var17 = var11;

            int var18;
            for (var18 = 0; var17 > 0; var17--) {
               var18 = var18 << 1 | var16 & 1;
               var16 >>>= 1;
            }

            var33[var12] = var18;
         }

         if (var2 != 0) {
            field361 = var7;
            field356 = var31;
            field360 = var32;
            field365 = var33;
         } else {
            field358 = var7;
            field357 = var31;
            field362 = var32;
            field366 = var33;
         }
      }

      int var19 = var1.method1231(8, -2106087602) + 1;
      field370 = new classBX[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         field370[var20] = new classBX(field342);
      }

      int var21 = var1.method1231(6, -1940865727) + 1;

      for (int var23 = 0; var23 < var21; var23++) {
         var1.method1231(16, -2074202386);
      }

      var21 = var1.method1231(6, -2055949402) + 1;
      field368 = new classAY[var21];

      for (int var24 = 0; var24 < var21; var24++) {
         field368[var24] = new classAY(field342);
      }

      int var25 = var1.method1231(6, -2121263148) + 1;
      field367 = new classAN[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         field367[var26] = new classAN(field342);
      }

      int var27 = var1.method1231(6, -2135929828) + 1;
      field369 = new classBN[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         field369[var28] = new classBN(field342);
      }

      int var29 = var1.method1231(6, -2130503662) + 1;
      field372 = new boolean[var29];
      field364 = new int[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         field372[var30] = classBT.method1235(var1, 353322123) != 0;
         var1.method1231(16, -2125854923);
         var1.method1231(16, -1975877765);
         field364[var30] = var1.method1231(8, -1935674882);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ag")
   void method967(byte[] var1) {
      classXY var2 = new classXY(var1);
      this.field352 = var2.method13056((byte)1);
      this.field350 = var2.method13056((byte)1);
      this.field348 = var2.method13056((byte)1);
      this.field347 = var2.method13056((byte)1);
      if (this.field347 < 0) {
         this.field347 = ~this.field347;
         this.field354 = true;
      }

      int var3 = var2.method13056((byte)1);
      this.field373 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = classXY.method13039(var2, -346779531);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method13084(var7, 0, var5, (byte)11);
         this.field373[var4] = var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Lbc;")
   @ObfuscatedName("ab")
   static classBC method965(AbstractArchive var0, int var1, int var2) {
      if (!method964(var0)) {
         var0.method11871(var1, var2, (byte)98);
         return null;
      } else {
         byte[] var3 = var0.method11867(var1, var2, -1064331421);
         return var3 == null ? null : new classBC(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ai")
   void method968(byte[] var1) {
      classXY var2 = new classXY(var1);
      this.field352 = var2.method13056((byte)1);
      this.field350 = var2.method13056((byte)1);
      this.field348 = var2.method13056((byte)1);
      this.field347 = var2.method13056((byte)1);
      if (this.field347 < 0) {
         this.field347 = ~this.field347;
         this.field354 = true;
      }

      int var3 = var2.method13056((byte)1);
      this.field373 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = classXY.method13039(var2, -346779531);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method13084(var7, 0, var5, (byte)24);
         this.field373[var4] = var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ac")
   static float method954(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ObfuscatedSignature(descriptor = "([I)Laj;")
   @ObfuscatedName("ax")
   classAJ method972(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field371 == null) {
            this.field349 = 0;
            this.field363 = new float[field344];
            this.field371 = new short[this.field350];
            this.field351 = 0;
            this.field346 = 0;
         }

         for (; this.field346 < this.field373.length; this.field346++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method970(this.field346);
            if (var2 != null) {
               int var3 = this.field351;
               int var4 = var2.length;
               if (var4 > this.field350 - var3) {
                  var4 = this.field350 - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  this.field371[var3++] = (short)classEK.method3908(-32768, 32767, (int)(var2[var5] * 32768.0F), (byte)-78);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field351;
               }

               this.field351 = var3;
            }
         }

         this.field363 = null;
         short[] var6 = this.field371;
         this.field371 = null;
         return new classAJ(this.field352, var6, this.field348, this.field347, this.field354, false);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ao")
   static float method955(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ObfuscatedSignature(descriptor = "([I)Laj;")
   @ObfuscatedName("ak")
   classAJ method973(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field371 == null) {
            this.field349 = 0;
            this.field363 = new float[field344];
            this.field371 = new short[this.field350];
            this.field351 = 0;
            this.field346 = 0;
         }

         for (; this.field346 < this.field373.length; this.field346++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method970(this.field346);
            if (var2 != null) {
               int var3 = this.field351;
               int var4 = var2.length;
               if (var4 > this.field350 - var3) {
                  var4 = this.field350 - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  this.field371[var3++] = (short)classEK.method3908(-518528835, 32767, (int)(var2[var5] * 32768.0F), (byte)-85);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field351;
               }

               this.field351 = var3;
            }
         }

         this.field363 = null;
         short[] var6 = this.field371;
         this.field371 = null;
         return new classAJ(this.field352, var6, this.field348, this.field347, this.field354, false);
      }
   }

   classBC(byte[] var1) {
      this.method967(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("al")
   static void method958(byte[] var0) {
      classBT var1 = field342;
      var1.method1239(var0, 0, -1144331984);
      field345 = 1 << var1.method1231(4, -2035878157);
      field344 = 1 << var1.method1231(4, -2106867212);

      for (int var2 = 0; var2 < 2; var2++) {
         int var3 = var2 != 0 ? field344 : field345;
         int var4 = var3 >> 1;
         int var5 = var3 >> 2;
         int var6 = var3 >> 3;
         float[] var7 = new float[var4];

         for (int var8 = 0; var8 < var5; var8++) {
            var7[2 * var8] = (float)Math.cos(4 * var8 * Math.PI / var3);
            var7[2 * var8 + 1] = -((float)Math.sin(4 * var8 * Math.PI / var3));
         }

         float[] var31 = new float[var4];

         for (int var9 = 0; var9 < var5; var9++) {
            var31[2 * var9] = (float)Math.cos((2 * var9 + 1) * Math.PI / (2 * var3));
            var31[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * Math.PI / (2 * var3));
         }

         float[] var32 = new float[var5];

         for (int var10 = 0; var10 < var6; var10++) {
            var32[2 * var10] = (float)Math.cos((4 * var10 + 2) * Math.PI / var3);
            var32[2 * var10 + 1] = -((float)Math.sin((4 * var10 + 2) * Math.PI / var3));
         }

         int[] var33 = new int[var6];
         int var11 = classZA.method13821(var6 - 1, (byte)41);

         for (int var12 = 0; var12 < var6; var12++) {
            int var16 = var12;
            int var17 = var11;

            int var18;
            for (var18 = 0; var17 > 0; var17--) {
               var18 = var18 << 1 | var16 & 1;
               var16 >>>= 1;
            }

            var33[var12] = var18;
         }

         if (var2 != 0) {
            field361 = var7;
            field356 = var31;
            field360 = var32;
            field365 = var33;
         } else {
            field358 = var7;
            field357 = var31;
            field362 = var32;
            field366 = var33;
         }
      }

      int var19 = var1.method1231(8, -2113450533) + 1;
      field370 = new classBX[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         field370[var20] = new classBX(field342);
      }

      int var21 = var1.method1231(6, -2090816425) + 1;

      for (int var23 = 0; var23 < var21; var23++) {
         var1.method1231(16, -2073983102);
      }

      var21 = var1.method1231(6, -2079139635) + 1;
      field368 = new classAY[var21];

      for (int var24 = 0; var24 < var21; var24++) {
         field368[var24] = new classAY(field342);
      }

      int var25 = var1.method1231(6, -2081329448) + 1;
      field367 = new classAN[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         field367[var26] = new classAN(field342);
      }

      int var27 = var1.method1231(6, -1958082263) + 1;
      field369 = new classBN[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         field369[var28] = new classBN(field342);
      }

      int var29 = var1.method1231(6, -2005740653) + 1;
      field372 = new boolean[var29];
      field364 = new int[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         field372[var30] = classBT.method1235(var1, -1919397487) != 0;
         var1.method1231(16, -1965109856);
         var1.method1231(16, -1917953568);
         field364[var30] = var1.method1231(8, -2020912206);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("aq")
   static boolean method959(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -569842333);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("ay")
   static boolean method960(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -876221956);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("aa")
   static float method956(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("ad")
   static boolean method961(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -1378805862);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("ap")
   static boolean method962(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -1606914815);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lbc;")
   @ObfuscatedName("au")
   static classBC method966(AbstractArchive var0, int var1, int var2) {
      if (!method964(var0)) {
         var0.method11871(var1, var2, (byte)-80);
         return null;
      } else {
         byte[] var3 = var0.method11867(var1, var2, -1755646444);
         return var3 == null ? null : new classBC(var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("aj")
   static boolean method963(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -1199561525);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbc;[I)Laj;")
   @ObfuscatedName("qz")
   public static classAJ method974(classBC var0, int[] var1) {
      if (var0 == null) {
         var0.method972(var1);
      }

      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (var0.field371 == null) {
            var0.field349 = 0;
            var0.field363 = new float[field344];
            var0.field371 = new short[var0.field350];
            var0.field351 = 0;
            var0.field346 = 0;
         }

         for (; var0.field346 < var0.field373.length; var0.field346++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = var0.method970(var0.field346);
            if (var2 != null) {
               int var3 = var0.field351;
               int var4 = var2.length;
               if (var4 > var0.field350 - var3) {
                  var4 = var0.field350 - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  var0.field371[var3++] = (short)classEK.method3908(-32768, 32767, (int)(var2[var5] * 32768.0F), (byte)-61);
               }

               if (var1 != null) {
                  var1[0] -= var3 - var0.field351;
               }

               var0.field351 = var3;
            }
         }

         var0.field363 = null;
         short[] var6 = var0.field371;
         var0.field371 = null;
         return new classAJ(var0.field352, var6, var0.field348, var0.field347, var0.field354, false);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ar")
   void method969(byte[] var1) {
      classXY var2 = new classXY(var1);
      this.field352 = var2.method13056((byte)1);
      this.field350 = var2.method13056((byte)1);
      this.field348 = var2.method13056((byte)1);
      this.field347 = var2.method13056((byte)1);
      if (this.field347 < 0) {
         this.field347 = ~this.field347;
         this.field354 = true;
      }

      int var3 = var2.method13056((byte)1);
      this.field373 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = classXY.method13039(var2, -346779531);
            var5 += var6;
         } while (var6 >= -1251484740);

         byte[] var7 = new byte[var5];
         var2.method13084(var7, 0, var5, (byte)97);
         this.field373[var4] = var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("as")
   float[] method971(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field373[var1], 0, -1144331984);
      this.field359 = new float[field344];
      classBT.method1235(var2, -1848583763);
      int var3 = var2.method1231(classZA.method13821(field364.length - 1, (byte)99), -1942885025);
      boolean var4 = field372[var3];
      int var5 = var4 ? field344 : field345;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, 147041153) != 0;
         var7 = classBT.method1235(var2, -8734601) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (field345 >> 2);
         var10 = (var5 >> 2) + (field345 >> 2);
         var11 = field345 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field345 >> 2);
         var13 = var5 - (var5 >> 2) + (field345 >> 2);
         var14 = field345 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = field369[field364[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = field368[var17].method741(var2, field370);
      boolean var19 = !var18.method1160(-1967239150);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = field367[var15.field518[var20]];
         float[] var22 = this.field359;
         var21.method611(var22, var5 >> 1, var19, var2, field370);
      }

      if (var18.method1160(-214871898)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field359, var5 >> 1, 1111200321);
      }

      if (!var18.method1160(-562913127)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field359[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field359;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field361 : field358;
         float[] var25 = var4 ? field356 : field357;
         float[] var26 = var4 ? field360 : field362;
         int[] var27 = var4 ? field365 : field366;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
            float var31 = var57[2 * var28];
            float var32 = var57[2 * var28 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[var46 + 3 + 4 * var58];
            float var73 = var23[var46 + 1 + 4 * var58];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[4 * var58 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var46 + 1 + 4 * var58] = var73 + var83;
            float var33 = var57[var46 - 4 - 4 * var58];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
            var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
         }

         int var59 = classZA.method13821(var5 - 1, (byte)74);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - var74 * (2 * var84 + 1);

               for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var35 * var80];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[var81 + 1];
               var23[var81 + 1] = var23[var85 + 1];
               var23[var85 + 1] = var88;
               var88 = var23[var81 + 3];
               var23[var81 + 3] = var23[var85 + 3];
               var23[var85 + 3] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[var85 + 5];
               var23[var85 + 5] = var88;
               var88 = var23[var81 + 7];
               var23[var81 + 7] = var23[var85 + 7];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[2 * var63 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - 2 * var64] = var23[4 * var64];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
            var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[2 * var65 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + 2 * var65 + 1];
            float var94 = var23[var5 - 2 - 2 * var65];
            float var95 = var23[var5 - 1 - 2 * var65];
            float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
            var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
            var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
            var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
            var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var5 - var48 + var67] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var48 + var68];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var48 + var69] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
            this.field359[var71] = this.field359[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field359[var72] = this.field359[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field349 > 0) {
         int var49 = this.field349 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field355) {
            for (int var52 = 0; var52 < this.field353; var52++) {
               int var54 = (this.field349 >> 1) + var52;
               var47[var52] += this.field363[var54];
            }
         }

         if (var18.method1160(-1194391790)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field359[var53];
            }
         }
      }

      float[] var50 = this.field363;
      this.field363 = this.field359;
      this.field359 = var50;
      this.field349 = var5;
      this.field353 = var13 - (var5 >> 1);
      this.field355 = !var18.method1160(438535472);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(Lva;)Z")
   @ObfuscatedName("ae")
   static boolean method964(AbstractArchive var0) {
      if (!field343) {
         byte[] var1 = var0.method11867(0, 0, -1903770424);
         if (var1 == null) {
            return false;
         }

         method957(var1);
         field343 = true;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "([I)Laj;")
   @ObfuscatedName("av")
   classAJ method975(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field371 == null) {
            this.field349 = 0;
            this.field363 = new float[field344];
            this.field371 = new short[this.field350];
            this.field351 = 0;
            this.field346 = 0;
         }

         for (; this.field346 < this.field373.length; this.field346++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method970(this.field346);
            if (var2 != null) {
               int var3 = this.field351;
               int var4 = var2.length;
               if (var4 > this.field350 - var3) {
                  var4 = this.field350 - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  this.field371[var3++] = (short)classEK.method3908(-32768, 32767, (int)(var2[var5] * 32768.0F), (byte)-22);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field351;
               }

               this.field351 = var3;
            }
         }

         this.field363 = null;
         short[] var6 = this.field371;
         this.field371 = null;
         return new classAJ(this.field352, var6, this.field348, this.field347, this.field354, false);
      }
   }
}
