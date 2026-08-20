import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ai")
public class classAI {
   @ObfuscatedSignature(descriptor = "[Lbx;")
   @ObfuscatedName("af")
   classBX[] field184;
   @ObfuscatedName("jo")
   static int field167;
   @ObfuscatedName("ae")
   int field156;
   @ObfuscatedName("ab")
   int field155;
   @ObfuscatedName("an")
   float[] field173;
   @ObfuscatedSignature(descriptor = "[Lan;")
   @ObfuscatedName("as")
   classAN[] field181;
   @ObfuscatedSignature(descriptor = "[Lbn;")
   @ObfuscatedName("ax")
   classBN[] field183;
   @ObfuscatedName("ac")
   boolean[] field185;
   @ObfuscatedName("aa")
   int[] field178;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field164 = 1076101504;
   @ObfuscatedName("al")
   float[] field172;
   @ObfuscatedName("aj")
   float[] field171;
   @ObfuscatedName("ah")
   int field157;
   @ObfuscatedName("aq")
   float[] field175;
   @ObfuscatedName("ad")
   float[] field170;
   @ToRemove(unused = "true")
   @ObfuscatedName("ch")
   static final int field165 = 87;
   @ObfuscatedName("bx")
   float[] field177;
   @ObfuscatedName("ai")
   byte[][] field186;
   @ObfuscatedName("ao")
   float[] field174;
   @ObfuscatedName("aw")
   int field162;
   @ObfuscatedName("ak")
   int field158;
   @ObfuscatedName("av")
   int field161;
   @ObfuscatedName("bn")
   boolean field169;
   @ObfuscatedName("ap")
   int[] field179;
   @ObfuscatedName("am")
   int field159;
   @ObfuscatedName("ar")
   int field160;
   @ObfuscatedName("at")
   boolean field168;
   @ObfuscatedName("ay")
   float[] field176;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field163 = 2160;
   @ObfuscatedSignature(descriptor = "Lbt;")
   @ObfuscatedName("az")
   classBT field154;
   @ToRemove(unused = "true")
   @ObfuscatedName("ck")
   public static final int field166 = 86;
   @ObfuscatedSignature(descriptor = "[Lay;")
   @ObfuscatedName("ag")
   classAY[] field182;
   @ObfuscatedName("au")
   int[] field180;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ai")
   void method381(Buffer var1) {
      this.field160 = var1.method13056((byte)1) * 245885603;
      this.field162 = var1.method13056((byte)1) * -572006573;
      this.field158 = var1.method13056((byte)1) * 1011042621;
      this.field161 = var1.method13056((byte)1) * -1234974037;
      if (-1031938045 * this.field161 < 0) {
         this.field161 = ~(-1031938045 * this.field161) * -1234974037;
         this.field169 = true;
      }

      int var2 = var1.method13056((byte)1);
      this.field186 = new byte[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = 0;

         int var5;
         do {
            var5 = Buffer.method13039(var1, -346779531);
            var4 += var5;
         } while (var5 >= 255);

         byte[] var6 = new byte[var4];
         var1.method13084(var6, 0, var4, (byte)109);
         this.field186[var3] = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method377(int var1) {
      try {
         return 745199125 * this.field158;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ai.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lai;II)[F")
   @ObfuscatedName("of")
   public static float[] method389(classAI var0, int var1, int var2) {
      if (var0 == null) {
         var0.method394(var1, var1);
      }

      try {
         classBT var3 = new classBT();
         var3.method1239(var0.field186[var1], 0, -1144331984);
         var0.field177 = new float[var0.field155 * 356769415];
         classBT.method1235(var3, 349072342);
         int var4 = var3.method1231(classZA.method13821(var0.field178.length - 1, (byte)19), -2002540571);
         boolean var5 = var0.field185[var4];
         int var10000;
         if (var5) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var10000 = 356769415 * var0.field155;
         } else {
            var10000 = -837278581 * var0.field156;
         }

         int var6 = var10000;
         boolean var7 = false;
         boolean var8 = false;
         if (var5) {
            boolean var100;
            if (classBT.method1235(var3, 684804797) != 0) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var100 = true;
            } else {
               var100 = false;
            }

            var7 = var100;
            if (classBT.method1235(var3, -789927244) != 0) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var100 = true;
            } else {
               var100 = false;
            }

            var8 = var100;
         }

         int var9;
         int var10;
         int var11;
         int var12;
         label512: {
            var9 = var6 >> 1;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               if (!var7) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  var10 = (var6 >> 2) - (var0.field156 * -837278581 >> 2);
                  var11 = (var0.field156 * -837278581 >> 2) + (var6 >> 2);
                  var12 = -837278581 * var0.field156 >> 1;
                  break label512;
               }
            }

            var10 = 0;
            var11 = var9;
            var12 = var6 >> 1;
         }

         int var13;
         int var14;
         int var15;
         label506: {
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               if (!var8) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  var13 = var6 - (var6 >> 2) - (-837278581 * var0.field156 >> 2);
                  var14 = (var0.field156 * -837278581 >> 2) + (var6 - (var6 >> 2));
                  var15 = var0.field156 * -837278581 >> 1;
                  break label506;
               }
            }

            var13 = var9;
            var14 = var6;
            var15 = var6 >> 1;
         }

         classBN var16 = var0.field183[var0.field178[var4]];
         int var17 = var16.field516;
         int var18 = var16.field517[var17];
         classBM var19 = var0.field182[var18].method741(var3, var0.field184);
         boolean var102;
         if (!var19.method1160(-1601769703)) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var102 = true;
         } else {
            var102 = false;
         }

         boolean var20 = var102;

         for (int var21 = 0; var21 < var16.field515; var21++) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            classAN var22 = var0.field181[var16.field518[var21]];
            float[] var23 = var0.field177;
            var22.method611(var23, var6 >> 1, var20, var3, var0.field184);
         }

         if (var19.method1160(-1606755211)) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var17 = var16.field516;
            var18 = var16.field517[var17];
            classBM.method1151(var19, var0.field177, var6 >> 1, 2118775804);
         }

         if (!var19.method1160(-760509938)) {
            for (int var47 = var6 >> 1; var47 < var6; var47++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var0.field177[var47] = 0.0F;
            }
         } else {
            int var48 = var6 >> 1;
            int var50 = var6 >> 2;
            int var53 = var6 >> 3;
            float[] var24 = var0.field177;

            for (int var25 = 0; var25 < var48; var25++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var25] *= 0.5F;
            }

            for (int var58 = var48; var58 < var6; var58++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var58] = -var24[var6 - var58 - 1];
            }

            float[] var103;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var103 = var0.field176;
            } else {
               var103 = var0.field174;
            }

            float[] var59 = var103;
            float[] var104;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var104 = var0.field175;
            } else {
               var104 = var0.field172;
            }

            float[] var26 = var104;
            float[] var105;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var105 = var0.field170;
            } else {
               var105 = var0.field171;
            }

            float[] var27 = var105;
            int[] var106;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var106 = var0.field180;
            } else {
               var106 = var0.field179;
            }

            int[] var28 = var106;

            for (int var29 = 0; var29 < var50; var29++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var30 = var24[var29 * 4] - var24[var6 - 4 * var29 - 1];
               float var31 = var24[var29 * 4 + 2] - var24[var6 - var29 * 4 - 3];
               float var32 = var59[var29 * 2];
               float var33 = var59[1 + 2 * var29];
               var24[var6 - var29 * 4 - 1] = var30 * var32 - var31 * var33;
               var24[var6 - var29 * 4 - 3] = var32 * var31 + var33 * var30;
            }

            for (int var60 = 0; var60 < var53; var60++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var62 = var24[3 + var48 + var60 * 4];
               float var75 = var24[var48 + 1 + var60 * 4];
               float var81 = var24[4 * var60 + 3];
               float var85 = var24[var60 * 4 + 1];
               var24[var48 + 3 + 4 * var60] = var62 + var81;
               var24[var60 * 4 + 1 + var48] = var85 + var75;
               float var34 = var59[var48 - 4 - var60 * 4];
               float var35 = var59[var48 - 3 - 4 * var60];
               var24[var60 * 4 + 3] = var34 * (var62 - var81) - (var75 - var85) * var35;
               var24[1 + 4 * var60] = (var62 - var81) * var35 + var34 * (var75 - var85);
            }

            int var61 = classZA.method13821(var6 - 1, (byte)109);

            for (int var63 = 0; var63 < var61 - 3; var63++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               int var76 = var6 >> var63 + 2;
               int var82 = 8 << var63;

               for (int var86 = 0; var86 < 2 << var63; var86++) {
                  int var89 = var6 - var76 * 2 * var86;
                  int var95 = var6 - (var86 * 2 + 1) * var76;

                  for (int var36 = 0; var36 < var6 >> 4 + var63; var36++) {
                     int var37 = 4 * var36;
                     float var38 = var24[var89 - 1 - var37];
                     float var39 = var24[var89 - 3 - var37];
                     float var40 = var24[var95 - 1 - var37];
                     float var41 = var24[var95 - 3 - var37];
                     var24[var89 - 1 - var37] = var38 + var40;
                     var24[var89 - 3 - var37] = var39 + var41;
                     float var42 = var59[var82 * var36];
                     float var43 = var59[var36 * var82 + 1];
                     var24[var95 - 1 - var37] = var42 * (var38 - var40) - (var39 - var41) * var43;
                     var24[var95 - 3 - var37] = var43 * (var38 - var40) + var42 * (var39 - var41);
                  }
               }
            }

            for (int var64 = 1; var64 < var53 - 1; var64++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               int var77 = var28[var64];
               if (var64 < var77) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  int var83 = 8 * var64;
                  int var87 = 8 * var77;
                  float var90 = var24[1 + var83];
                  var24[1 + var83] = var24[var87 + 1];
                  var24[1 + var87] = var90;
                  var90 = var24[3 + var83];
                  var24[var83 + 3] = var24[3 + var87];
                  var24[3 + var87] = var90;
                  var90 = var24[var83 + 5];
                  var24[var83 + 5] = var24[5 + var87];
                  var24[5 + var87] = var90;
                  var90 = var24[7 + var83];
                  var24[7 + var83] = var24[7 + var87];
                  var24[var87 + 7] = var90;
               }
            }

            for (int var65 = 0; var65 < var48; var65++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var65] = var24[var65 * 2 + 1];
            }

            for (int var66 = 0; var66 < var53; var66++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var6 - 1 - var66 * 2] = var24[var66 * 4];
               var24[var6 - 2 - 2 * var66] = var24[4 * var66 + 1];
               var24[var6 - var50 - 1 - 2 * var66] = var24[2 + 4 * var66];
               var24[var6 - var50 - 2 - 2 * var66] = var24[3 + var66 * 4];
            }

            for (int var67 = 0; var67 < var53; var67++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var78 = var27[2 * var67];
               float var84 = var27[var67 * 2 + 1];
               float var88 = var24[var48 + 2 * var67];
               float var94 = var24[var48 + var67 * 2 + 1];
               float var96 = var24[var6 - 2 - var67 * 2];
               float var97 = var24[var6 - 1 - var67 * 2];
               float var98 = var84 * (var88 - var96) + var78 * (var97 + var94);
               var24[var48 + var67 * 2] = (var98 + (var96 + var88)) * 0.5F;
               var24[var6 - 2 - 2 * var67] = 0.5F * (var88 + var96 - var98);
               var98 = var84 * (var94 + var97) - var78 * (var88 - var96);
               var24[1 + var48 + 2 * var67] = 0.5F * (var94 - var97 + var98);
               var24[var6 - 1 - var67 * 2] = (-var94 + var97 + var98) * 0.5F;
            }

            for (int var68 = 0; var68 < var50; var68++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var68] = var24[var48 + 1 + var68 * 2] * var26[1 + 2 * var68] + var24[2 * var68 + var48] * var26[2 * var68];
               var24[var48 - 1 - var68] = var26[1 + 2 * var68] * var24[var68 * 2 + var48] - var26[2 * var68] * var24[var48 + var68 * 2 + 1];
            }

            for (int var69 = 0; var69 < var50; var69++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var69 + (var6 - var50)] = -var24[var69];
            }

            for (int var70 = 0; var70 < var50; var70++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var70] = var24[var70 + var50];
            }

            for (int var71 = 0; var71 < var50; var71++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var71 + var50] = -var24[var50 - var71 - 1];
            }

            for (int var72 = 0; var72 < var50; var72++) {
               var24[var48 + var72] = var24[var6 - var72 - 1];
            }

            for (int var73 = var10; var73 < var11; var73++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var79 = (float)Math.sin(0.5 * ((var73 - var10 + 0.5) / var12) * Math.PI);
               var0.field177[var73] = var0.field177[var73] * (float)Math.sin((Math.PI / 2) * var79 * var79);
            }

            for (int var74 = var13; var74 < var14; var74++) {
               float var80 = (float)Math.sin(0.5 * ((0.5 + (var74 - var13)) / var15) * Math.PI + (Math.PI / 2));
               var0.field177[var74] = var0.field177[var74] * (float)Math.sin(var80 * (Math.PI / 2) * var80);
            }
         }

         float[] var49 = null;
         if (1057106081 * var0.field159 > 0) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            int var51 = var0.field159 * 1057106081 + var6 >> 2;
            var49 = new float[var51];
            if (!var0.field168) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               for (int var54 = 0; var54 < 113829097 * var0.field157; var54++) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  int var56 = (var0.field159 * 1057106081 >> 1) + var54;
                  var49[var54] += var0.field173[var56];
               }
            }

            if (var19.method1160(-1112949688)) {
               for (int var55 = var10; var55 < var6 >> 1; var55++) {
                  int var57 = var55 + (var49.length - (var6 >> 1));
                  var49[var57] += var0.field177[var55];
               }
            }
         }

         float[] var52 = var0.field173;
         var0.field173 = var0.field177;
         var0.field177 = var52;
         var0.field159 = 2011282273 * var6;
         var0.field157 = 1767781209 * (var14 - (var6 >> 1));
         var0.field168 = !var19.method1160(-1743403726);
         return var49;
      } catch (RuntimeException var44) {
         throw classEG.newRunException(var44, "ai.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("av")
   float[] method390(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field186[var1], 0, -1144331984);
      this.field177 = new float[this.field155 * 356769415];
      classBT.method1235(var2, 562280091);
      int var3 = var2.method1231(classZA.method13821(this.field178.length - 1, (byte)50), -2066620842);
      boolean var4 = this.field185[var3];
      int var5 = var4 ? 356769415 * this.field155 : -837278581 * this.field156;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, -1726156925) != 0;
         var7 = classBT.method1235(var2, 334284185) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (this.field156 * -837278581 >> 2);
         var10 = (this.field156 * -837278581 >> 2) + (var5 >> 2);
         var11 = -837278581 * this.field156 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (-837278581 * this.field156 >> 2);
         var13 = (this.field156 * -837278581 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field156 * -837278581 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = this.field183[this.field178[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = this.field182[var17].method741(var2, this.field184);
      boolean var19 = !var18.method1160(-1254126444);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = this.field181[var15.field518[var20]];
         float[] var22 = this.field177;
         var21.method611(var22, var5 >> 1, var19, var2, this.field184);
      }

      if (var18.method1160(705348143)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field177, var5 >> 1, 874938429);
      }

      if (!var18.method1160(-357711686)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field177[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field177;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field176 : this.field174;
         float[] var25 = var4 ? this.field175 : this.field172;
         float[] var26 = var4 ? this.field170 : this.field171;
         int[] var27 = var4 ? this.field180 : this.field179;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[var28 * 4] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[1 + 2 * var28];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var31 * var30 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[3 + var46 + var58 * 4];
            float var73 = var23[var46 + 1 + var58 * 4];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var58 * 4 + 1 + var46] = var83 + var73;
            float var33 = var57[var46 - 4 - var58 * 4];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[var58 * 4 + 3] = var33 * (var60 - var79) - (var73 - var83) * var34;
            var23[1 + 4 * var58] = (var60 - var79) * var34 + var33 * (var73 - var83);
         }

         int var59 = classZA.method13821(var5 - 1, (byte)21);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - (var84 * 2 + 1) * var74;

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = var41 * (var37 - var39) - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = var42 * (var37 - var39) + var41 * (var38 - var40);
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[1 + var81];
               var23[1 + var81] = var23[var85 + 1];
               var23[1 + var85] = var88;
               var88 = var23[3 + var81];
               var23[var81 + 3] = var23[3 + var85];
               var23[3 + var85] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[5 + var85];
               var23[5 + var85] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[var63 * 2 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - var64 * 2] = var23[var64 * 4];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[2 + 4 * var64];
            var23[var5 - var48 - 2 - 2 * var64] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[var65 * 2 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + var65 * 2 + 1];
            float var94 = var23[var5 - 2 - var65 * 2];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = var82 * (var86 - var94) + var76 * (var95 + var92);
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - 2 * var65] = 0.5F * (var86 + var94 - var96);
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[1 + var46 + 2 * var65] = 0.5F * (var92 - var95 + var96);
            var23[var5 - 1 - var65 * 2] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[var46 + 1 + var66 * 2] * var25[1 + 2 * var66] + var23[2 * var66 + var46] * var25[2 * var66];
            var23[var46 - 1 - var66] = var25[1 + 2 * var66] * var23[var66 * 2 + var46] - var25[2 * var66] * var23[var46 + var66 * 2 + 1];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var68 + var48];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var69 + var48] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field177[var71] = this.field177[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin(0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI + (Math.PI / 2));
            this.field177[var72] = this.field177[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (1057106081 * this.field159 > 0) {
         int var49 = this.field159 * 1057106081 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field168) {
            for (int var52 = 0; var52 < 113829097 * this.field157; var52++) {
               int var54 = (this.field159 * 1057106081 >> 1) + var52;
               var47[var52] += this.field173[var54];
            }
         }

         if (var18.method1160(-2075485886)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var53 + (var47.length - (var5 >> 1));
               var47[var55] += this.field177[var53];
            }
         }
      }

      float[] var50 = this.field173;
      this.field173 = this.field177;
      this.field177 = var50;
      this.field159 = 2011282273 * var5;
      this.field157 = 1767781209 * (var13 - (var5 >> 1));
      this.field168 = !var18.method1160(-1105815660);
      return var47;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;Laae;)I")
   @ObfuscatedName("qf")
   public static int method385(classAAE var0, classAAE var1) {
      if (null == var0.field41) {
         return null == var1.field41 ? 0 : 1;
      } else {
         return var1.field41 == null ? -1 : var0.field41.compareTo(var1.field41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lai;Lxy;)V")
   @ObfuscatedName("ri")
   public static void method382(classAI var0, Buffer var1) {
      if (var0 == null) {
         var0.method372();
      }

      var0.field160 = var1.method13056((byte)1) * 245885603;
      var0.field162 = var1.method13056((byte)1) * -1069193070;
      var0.field158 = var1.method13056((byte)1) * 1011042621;
      var0.field161 = var1.method13056((byte)1) * -1385912441;
      if (-1031938045 * var0.field161 < 0) {
         var0.field161 = ~(1389050567 * var0.field161) * -1234974037;
         var0.field169 = true;
      }

      int var2 = var1.method13056((byte)1);
      var0.field186 = new byte[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = 0;

         int var5;
         do {
            var5 = Buffer.method13039(var1, -346779531);
            var4 += var5;
         } while (var5 >= -439437969);

         byte[] var6 = new byte[var4];
         var1.method13084(var6, 0, var4, (byte)43);
         var0.field186[var3] = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ab")
   void method383(Buffer var1, int var2) {
      try {
         this.field160 = var1.method13056((byte)1) * 245885603;
         this.field162 = var1.method13056((byte)1) * -572006573;
         this.field158 = var1.method13056((byte)1) * 1011042621;
         this.field161 = var1.method13056((byte)1) * -1234974037;
         if (-1031938045 * this.field161 < 0) {
            if (var2 != 9179409) {
               throw new IllegalStateException();
            }

            this.field161 = ~(-1031938045 * this.field161) * -1234974037;
            this.field169 = true;
         }

         int var3 = var1.method13056((byte)1);
         this.field186 = new byte[var3][];

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;

            int var6;
            do {
               var6 = Buffer.method13039(var1, -346779531);
               var5 += var6;
            } while (var6 >= 255);

            if (var2 != 9179409) {
               return;
            }

            byte[] var8 = new byte[var5];
            var1.method13084(var8, 0, var5, (byte)25);
            this.field186[var4] = var8;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ai.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Laj;")
   @ObfuscatedName("ag")
   classAJ method386(byte var1) {
      try {
         this.field159 = 0;
         this.field173 = new float[356769415 * this.field155];
         short[] var2 = new short[this.field162 * -1787708197];
         int var3 = 0;

         for (int var4 = 0; var4 < this.field186.length; var4++) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            float[] var5 = method389(this, var4, -837397131);
            if (null != var5) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               int var6 = var5.length;
               if (var6 > this.field162 * -1787708197 - var3) {
                  var6 = -1787708197 * this.field162 - var3;
               }

               for (int var7 = 0; var7 < var6; var7++) {
                  var2[var3++] = (short)classEK.method3908(-32768, 32767, (int)(32768.0F * var5[var7]), (byte)-50);
               }
            }
         }

         this.field173 = null;
         return new classAJ(2023037195 * this.field160, var2, 745199125 * this.field158, -1031938045 * this.field161, this.field169, false);
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "ai.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ax")
   void method396(byte[] var1, int var2, int var3) {
      try {
         classBT var4 = this.field154;
         var4.method1239(var1, var2, -1144331984);
         this.field156 = (1 << var4.method1231(4, -2087696739)) * -476306653;
         this.field155 = (1 << var4.method1231(4, -2061996792)) * -1109489865;

         for (int var5 = 0; var5 < 2; var5++) {
            if (var3 <= -314673041) {
               throw new IllegalStateException();
            }

            int var10000;
            if (var5 != 0) {
               if (var3 <= -314673041) {
                  throw new IllegalStateException();
               }

               var10000 = this.field155 * 356769415;
            } else {
               var10000 = -837278581 * this.field156;
            }

            int var6 = var10000;
            int var7 = var6 >> 1;
            int var8 = var6 >> 2;
            int var9 = var6 >> 3;
            float[] var10 = new float[var7];

            for (int var11 = 0; var11 < var8; var11++) {
               if (var3 <= -314673041) {
                  return;
               }

               var10[2 * var11] = (float)Math.cos(Math.PI * (var11 * 4) / var6);
               var10[2 * var11 + 1] = -((float)Math.sin(Math.PI * (var11 * 4) / var6));
            }

            float[] var35 = new float[var7];

            for (int var12 = 0; var12 < var8; var12++) {
               if (var3 <= -314673041) {
                  throw new IllegalStateException();
               }

               var35[2 * var12] = (float)Math.cos(Math.PI * (1 + var12 * 2) / (var6 * 2));
               var35[1 + 2 * var12] = (float)Math.sin(Math.PI * (2 * var12 + 1) / (2 * var6));
            }

            float[] var36 = new float[var8];

            for (int var13 = 0; var13 < var9; var13++) {
               if (var3 <= -314673041) {
                  throw new IllegalStateException();
               }

               var36[2 * var13] = (float)Math.cos((var13 * 4 + 2) * Math.PI / var6);
               var36[1 + var13 * 2] = -((float)Math.sin(Math.PI * (2 + var13 * 4) / var6));
            }

            int[] var37 = new int[var9];
            int var14 = classZA.method13821(var9 - 1, (byte)106);

            for (int var15 = 0; var15 < var9; var15++) {
               if (var3 <= -314673041) {
                  throw new IllegalStateException();
               }

               int var19 = var15;
               int var20 = var14;

               int var21;
               for (var21 = 0; var20 > 0; var20--) {
                  if (var3 <= -314673041) {
                     throw new IllegalStateException();
                  }

                  var21 = var21 << 1 | var19 & 1;
                  var19 >>>= 1;
               }

               var37[var15] = var21;
            }

            if (0 != var5) {
               this.field176 = var10;
               this.field175 = var35;
               this.field170 = var36;
               this.field180 = var37;
            } else {
               this.field174 = var10;
               this.field172 = var35;
               this.field171 = var36;
               this.field179 = var37;
            }
         }

         int var23 = var4.method1231(8, -2020131230) + 1;
         this.field184 = new classBX[var23];

         for (int var24 = 0; var24 < var23; var24++) {
            if (var3 <= -314673041) {
               return;
            }

            this.field184[var24] = new classBX(var4);
         }

         int var25 = var4.method1231(6, -2059159234) + 1;

         for (int var27 = 0; var27 < var25; var27++) {
            if (var3 <= -314673041) {
               return;
            }

            var4.method1231(16, -2108797842);
         }

         var25 = var4.method1231(6, -1973510668) + 1;
         this.field182 = new classAY[var25];

         for (int var28 = 0; var28 < var25; var28++) {
            if (var3 <= -314673041) {
               throw new IllegalStateException();
            }

            this.field182[var28] = new classAY(var4);
         }

         int var29 = var4.method1231(6, -2037078010) + 1;
         this.field181 = new classAN[var29];

         for (int var30 = 0; var30 < var29; var30++) {
            if (var3 <= -314673041) {
               throw new IllegalStateException();
            }

            this.field181[var30] = new classAN(var4);
         }

         int var31 = var4.method1231(6, -1993505005) + 1;
         this.field183 = new classBN[var31];

         for (int var32 = 0; var32 < var31; var32++) {
            if (var3 <= -314673041) {
               return;
            }

            this.field183[var32] = new classBN(var4);
         }

         int var33 = var4.method1231(6, -2036548655) + 1;
         this.field185 = new boolean[var33];
         this.field178 = new int[var33];

         for (int var34 = 0; var34 < var33; var34++) {
            if (var3 <= -314673041) {
               throw new IllegalStateException();
            }

            boolean[] var38 = this.field185;
            boolean var10002;
            if (classBT.method1235(var4, -582738736) != 0) {
               if (var3 <= -314673041) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            var38[var34] = var10002;
            var4.method1231(16, -1977045461);
            var4.method1231(16, -1971275392);
            this.field178[var34] = var4.method1231(8, -2104897466);
         }
      } catch (RuntimeException var22) {
         throw classEG.newRunException(var22, "ai.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method371() {
      return 2023037195 * this.field160;
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ak")
   classAJ method387() {
      this.field159 = 0;
      this.field173 = new float[356769415 * this.field155];
      short[] var1 = new short[this.field162 * -1787708197];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field186.length; var3++) {
         float[] var4 = method389(this, var3, -88792513);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > this.field162 * -1787708197 - var2) {
               var5 = 2104599387 * this.field162 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classEK.method3908(1625784842, 32767, (int)(32768.0F * var4[var6]), (byte)11);
            }
         }
      }

      this.field173 = null;
      return new classAJ(1220948840 * this.field160, var1, 745199125 * this.field158, -1031938045 * this.field161, this.field169, false);
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("aw")
   classAJ method388() {
      this.field159 = 0;
      this.field173 = new float[356769415 * this.field155];
      short[] var1 = new short[this.field162 * -1787708197];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field186.length; var3++) {
         float[] var4 = method389(this, var3, -2020928613);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > this.field162 * -1787708197 - var2) {
               var5 = -1787708197 * this.field162 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classEK.method3908(-32768, 32767, (int)(32768.0F * var4[var6]), (byte)-4);
            }
         }
      }

      this.field173 = null;
      return new classAJ(2023037195 * this.field160, var1, 745199125 * this.field158, -1031938045 * this.field161, this.field169, false);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method378() {
      return 745199125 * this.field158;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("am")
   float[] method391(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field186[var1], 0, -1144331984);
      this.field177 = new float[this.field155 * 356769415];
      classBT.method1235(var2, -1267170519);
      int var3 = var2.method1231(classZA.method13821(this.field178.length - 1, (byte)24), -2010114073);
      boolean var4 = this.field185[var3];
      int var5 = var4 ? -477129458 * this.field155 : -230801594 * this.field156;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, 162176591) != 0;
         var7 = classBT.method1235(var2, -2121388703) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (this.field156 * -1712231398 >> 2);
         var10 = (this.field156 * 794125318 >> 2) + (var5 >> 2);
         var11 = -837278581 * this.field156 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (1380654207 * this.field156 >> 2);
         var13 = (this.field156 * -837278581 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field156 * -837278581 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = this.field183[this.field178[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = this.field182[var17].method741(var2, this.field184);
      boolean var19 = !var18.method1160(-710504080);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = this.field181[var15.field518[var20]];
         float[] var22 = this.field177;
         var21.method611(var22, var5 >> 1, var19, var2, this.field184);
      }

      if (var18.method1160(1827960403)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field177, var5 >> 1, 1249250674);
      }

      if (!var18.method1160(30295615)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field177[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field177;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field176 : this.field174;
         float[] var25 = var4 ? this.field175 : this.field172;
         float[] var26 = var4 ? this.field170 : this.field171;
         int[] var27 = var4 ? this.field180 : this.field179;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[var28 * 4] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[1 + 2 * var28];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var31 * var30 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[3 + var46 + var58 * 4];
            float var73 = var23[var46 + 1 + var58 * 4];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var58 * 4 + 1 + var46] = var83 + var73;
            float var33 = var57[var46 - 4 - var58 * 4];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[var58 * 4 + 3] = var33 * (var60 - var79) - (var73 - var83) * var34;
            var23[1 + 4 * var58] = (var60 - var79) * var34 + var33 * (var73 - var83);
         }

         int var59 = classZA.method13821(var5 - 1, (byte)58);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - (var84 * 2 + 1) * var74;

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = var41 * (var37 - var39) - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = var42 * (var37 - var39) + var41 * (var38 - var40);
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[1 + var81];
               var23[1 + var81] = var23[var85 + 1];
               var23[1 + var85] = var88;
               var88 = var23[3 + var81];
               var23[var81 + 3] = var23[3 + var85];
               var23[3 + var85] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[5 + var85];
               var23[5 + var85] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[var63 * 2 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - var64 * 2] = var23[var64 * 4];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[2 + 4 * var64];
            var23[var5 - var48 - 2 - 2 * var64] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[var65 * 2 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + var65 * 2 + 1];
            float var94 = var23[var5 - 2 - var65 * 2];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = var82 * (var86 - var94) + var76 * (var95 + var92);
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - 2 * var65] = 0.5F * (var86 + var94 - var96);
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[1 + var46 + 2 * var65] = 0.5F * (var92 - var95 + var96);
            var23[var5 - 1 - var65 * 2] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[var46 + 1 + var66 * 2] * var25[1 + 2 * var66] + var23[2 * var66 + var46] * var25[2 * var66];
            var23[var46 - 1 - var66] = var25[1 + 2 * var66] * var23[var66 * 2 + var46] - var25[2 * var66] * var23[var46 + var66 * 2 + 1];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var68 + var48];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var69 + var48] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field177[var71] = this.field177[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin(0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI + (Math.PI / 2));
            this.field177[var72] = this.field177[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (431444565 * this.field159 > 0) {
         int var49 = this.field159 * 1057106081 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field168) {
            for (int var52 = 0; var52 < 113829097 * this.field157; var52++) {
               int var54 = (this.field159 * -199372893 >> 1) + var52;
               var47[var52] += this.field173[var54];
            }
         }

         if (var18.method1160(1025061303)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var53 + (var47.length - (var5 >> 1));
               var47[var55] += this.field177[var53];
            }
         }
      }

      float[] var50 = this.field173;
      this.field173 = this.field177;
      this.field177 = var50;
      this.field159 = 2011282273 * var5;
      this.field157 = 1513331671 * (var13 - (var5 >> 1));
      this.field168 = !var18.method1160(-320406305);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method372() {
      return 2023037195 * this.field160;
   }

   classAI(classBT var1) {
      this.field154 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpg;I)Lww;")
   @ObfuscatedName("my")
   public static classWW method395(classPG var0, int var1) {
      return var0 == null ? var0.method8879(var1) : (classWW)var0.field5241.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lai;I)I")
   @ObfuscatedName("na")
   public static int method373(classAI var0, int var1) {
      if (var0 == null) {
         return var0.method375(var1);
      } else {
         try {
            return 2023037195 * var0.field160;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "ai.az(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ar")
   void method384(Buffer var1) {
      this.field160 = var1.method13056((byte)1) * 245885603;
      this.field162 = var1.method13056((byte)1) * -572006573;
      this.field158 = var1.method13056((byte)1) * 1011042621;
      this.field161 = var1.method13056((byte)1) * -1234974037;
      if (-1031938045 * this.field161 < 0) {
         this.field161 = ~(-1031938045 * this.field161) * -1234974037;
         this.field169 = true;
      }

      int var2 = var1.method13056((byte)1);
      this.field186 = new byte[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = 0;

         int var5;
         do {
            var5 = Buffer.method13039(var1, -346779531);
            var4 += var5;
         } while (var5 >= 255);

         byte[] var6 = new byte[var4];
         var1.method13084(var6, 0, var4, (byte)42);
         this.field186[var3] = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   int method380(int var1) {
      try {
         return -1031938045 * this.field161;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ai.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("bn")
   void method397(byte[] var1, int var2) {
      classBT var3 = this.field154;
      var3.method1239(var1, var2, -1144331984);
      this.field156 = (1 << var3.method1231(4, -1960358098)) * -476306653;
      this.field155 = (1 << var3.method1231(4, -2120200424)) * -1109489865;

      for (int var4 = 0; var4 < 2; var4++) {
         int var5 = var4 != 0 ? this.field155 * 356769415 : -837278581 * this.field156;
         int var6 = var5 >> 1;
         int var7 = var5 >> 2;
         int var8 = var5 >> 3;
         float[] var9 = new float[var6];

         for (int var10 = 0; var10 < var7; var10++) {
            var9[2 * var10] = (float)Math.cos(Math.PI * (var10 * 4) / var5);
            var9[2 * var10 + 1] = -((float)Math.sin(Math.PI * (var10 * 4) / var5));
         }

         float[] var33 = new float[var6];

         for (int var11 = 0; var11 < var7; var11++) {
            var33[2 * var11] = (float)Math.cos(Math.PI * (1 + var11 * 2) / (var5 * 2));
            var33[1 + 2 * var11] = (float)Math.sin(Math.PI * (2 * var11 + 1) / (2 * var5));
         }

         float[] var34 = new float[var7];

         for (int var12 = 0; var12 < var8; var12++) {
            var34[2 * var12] = (float)Math.cos((var12 * 4 + 2) * Math.PI / var5);
            var34[1 + var12 * 2] = -((float)Math.sin(Math.PI * (2 + var12 * 4) / var5));
         }

         int[] var35 = new int[var8];
         int var13 = classZA.method13821(var8 - 1, (byte)81);

         for (int var14 = 0; var14 < var8; var14++) {
            int var18 = var14;
            int var19 = var13;

            int var20;
            for (var20 = 0; var19 > 0; var19--) {
               var20 = var20 << 1 | var18 & 1;
               var18 >>>= 1;
            }

            var35[var14] = var20;
         }

         if (0 != var4) {
            this.field176 = var9;
            this.field175 = var33;
            this.field170 = var34;
            this.field180 = var35;
         } else {
            this.field174 = var9;
            this.field172 = var33;
            this.field171 = var34;
            this.field179 = var35;
         }
      }

      int var21 = var3.method1231(8, -1934792024) + 1;
      this.field184 = new classBX[var21];

      for (int var22 = 0; var22 < var21; var22++) {
         this.field184[var22] = new classBX(var3);
      }

      int var23 = var3.method1231(6, -2126698264) + 1;

      for (int var25 = 0; var25 < var23; var25++) {
         var3.method1231(16, -2042218288);
      }

      var23 = var3.method1231(6, -2003671782) + 1;
      this.field182 = new classAY[var23];

      for (int var26 = 0; var26 < var23; var26++) {
         this.field182[var26] = new classAY(var3);
      }

      int var27 = var3.method1231(6, -2072255360) + 1;
      this.field181 = new classAN[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         this.field181[var28] = new classAN(var3);
      }

      int var29 = var3.method1231(6, -1963395595) + 1;
      this.field183 = new classBN[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         this.field183[var30] = new classBN(var3);
      }

      int var31 = var3.method1231(6, -1939011861) + 1;
      this.field185 = new boolean[var31];
      this.field178 = new int[var31];

      for (int var32 = 0; var32 < var31; var32++) {
         this.field185[var32] = classBT.method1235(var3, -67623587) != 0;
         var3.method1231(16, -2070103335);
         var3.method1231(16, -2097043172);
         this.field178[var32] = var3.method1231(8, -1971282480);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method379() {
      return -508769063 * this.field158;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method374() {
      return -619533787 * this.field160;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("an")
   float[] method392(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field186[var1], 0, -1144331984);
      this.field177 = new float[this.field155 * 356769415];
      classBT.method1235(var2, -263142736);
      int var3 = var2.method1231(classZA.method13821(this.field178.length - 1, (byte)94), -2118416244);
      boolean var4 = this.field185[var3];
      int var5 = var4 ? 356769415 * this.field155 : -837278581 * this.field156;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, -2096290167) != 0;
         var7 = classBT.method1235(var2, -336998300) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (this.field156 * -837278581 >> 2);
         var10 = (this.field156 * -837278581 >> 2) + (var5 >> 2);
         var11 = -837278581 * this.field156 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (-837278581 * this.field156 >> 2);
         var13 = (this.field156 * -837278581 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field156 * -837278581 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = this.field183[this.field178[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = this.field182[var17].method741(var2, this.field184);
      boolean var19 = !var18.method1160(-1535619650);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = this.field181[var15.field518[var20]];
         float[] var22 = this.field177;
         var21.method611(var22, var5 >> 1, var19, var2, this.field184);
      }

      if (var18.method1160(-408538035)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field177, var5 >> 1, 828013808);
      }

      if (!var18.method1160(1756558347)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field177[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field177;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field176 : this.field174;
         float[] var25 = var4 ? this.field175 : this.field172;
         float[] var26 = var4 ? this.field170 : this.field171;
         int[] var27 = var4 ? this.field180 : this.field179;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[var28 * 4] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[1 + 2 * var28];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var31 * var30 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[3 + var46 + var58 * 4];
            float var73 = var23[var46 + 1 + var58 * 4];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var58 * 4 + 1 + var46] = var83 + var73;
            float var33 = var57[var46 - 4 - var58 * 4];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[var58 * 4 + 3] = var33 * (var60 - var79) - (var73 - var83) * var34;
            var23[1 + 4 * var58] = (var60 - var79) * var34 + var33 * (var73 - var83);
         }

         int var59 = classZA.method13821(var5 - 1, (byte)119);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - (var84 * 2 + 1) * var74;

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = var41 * (var37 - var39) - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = var42 * (var37 - var39) + var41 * (var38 - var40);
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[1 + var81];
               var23[1 + var81] = var23[var85 + 1];
               var23[1 + var85] = var88;
               var88 = var23[3 + var81];
               var23[var81 + 3] = var23[3 + var85];
               var23[3 + var85] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[5 + var85];
               var23[5 + var85] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[var63 * 2 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - var64 * 2] = var23[var64 * 4];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[2 + 4 * var64];
            var23[var5 - var48 - 2 - 2 * var64] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[var65 * 2 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + var65 * 2 + 1];
            float var94 = var23[var5 - 2 - var65 * 2];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = var82 * (var86 - var94) + var76 * (var95 + var92);
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - 2 * var65] = 0.5F * (var86 + var94 - var96);
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[1 + var46 + 2 * var65] = 0.5F * (var92 - var95 + var96);
            var23[var5 - 1 - var65 * 2] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[var46 + 1 + var66 * 2] * var25[1 + 2 * var66] + var23[2 * var66 + var46] * var25[2 * var66];
            var23[var46 - 1 - var66] = var25[1 + 2 * var66] * var23[var66 * 2 + var46] - var25[2 * var66] * var23[var46 + var66 * 2 + 1];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var68 + var48];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var69 + var48] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field177[var71] = this.field177[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin(0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI + (Math.PI / 2));
            this.field177[var72] = this.field177[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (1057106081 * this.field159 > 0) {
         int var49 = this.field159 * 1057106081 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field168) {
            for (int var52 = 0; var52 < 113829097 * this.field157; var52++) {
               int var54 = (this.field159 * 1057106081 >> 1) + var52;
               var47[var52] += this.field173[var54];
            }
         }

         if (var18.method1160(561068912)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var53 + (var47.length - (var5 >> 1));
               var47[var55] += this.field177[var53];
            }
         }
      }

      float[] var50 = this.field173;
      this.field173 = this.field177;
      this.field177 = var50;
      this.field159 = 2011282273 * var5;
      this.field157 = 1767781209 * (var13 - (var5 >> 1));
      this.field168 = !var18.method1160(-101118958);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("at")
   float[] method393(int var1) {
      classBT var2 = new classBT();
      var2.method1239(this.field186[var1], 0, -1144331984);
      this.field177 = new float[this.field155 * 356769415];
      classBT.method1235(var2, -1926292352);
      int var3 = var2.method1231(classZA.method13821(this.field178.length - 1, (byte)124), -2006304323);
      boolean var4 = this.field185[var3];
      int var5 = var4 ? 356769415 * this.field155 : -837278581 * this.field156;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classBT.method1235(var2, -726404165) != 0;
         var7 = classBT.method1235(var2, -1432534082) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (this.field156 * -587833088 >> 2);
         var10 = (this.field156 * -1987957908 >> 2) + (var5 >> 2);
         var11 = -837278581 * this.field156 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (1590389207 * this.field156 >> 2);
         var13 = (this.field156 * -133332548 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field156 * -837278581 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      classBN var15 = this.field183[this.field178[var3]];
      int var16 = var15.field516;
      int var17 = var15.field517[var16];
      classBM var18 = this.field182[var17].method741(var2, this.field184);
      boolean var19 = !var18.method1160(-164916923);

      for (int var20 = 0; var20 < var15.field515; var20++) {
         classAN var21 = this.field181[var15.field518[var20]];
         float[] var22 = this.field177;
         var21.method611(var22, var5 >> 1, var19, var2, this.field184);
      }

      if (var18.method1160(1718073861)) {
         var16 = var15.field516;
         var17 = var15.field517[var16];
         classBM.method1151(var18, this.field177, var5 >> 1, 1303253449);
      }

      if (!var18.method1160(-235484985)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field177[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field177;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field176 : this.field174;
         float[] var25 = var4 ? this.field175 : this.field172;
         float[] var26 = var4 ? this.field170 : this.field171;
         int[] var27 = var4 ? this.field180 : this.field179;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[var28 * 4] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[1 + 2 * var28];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var31 * var30 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[3 + var46 + var58 * 4];
            float var73 = var23[var46 + 1 + var58 * 4];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[var46 + 3 + 4 * var58] = var60 + var79;
            var23[var58 * 4 + 1 + var46] = var83 + var73;
            float var33 = var57[var46 - 4 - var58 * 4];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[var58 * 4 + 3] = var33 * (var60 - var79) - (var73 - var83) * var34;
            var23[1 + 4 * var58] = (var60 - var79) * var34 + var33 * (var73 - var83);
         }

         int var59 = classZA.method13821(var5 - 1, (byte)99);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - var74 * 2 * var84;
               int var93 = var5 - (var84 * 2 + 1) * var74;

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var37 + var39;
                  var23[var87 - 3 - var36] = var38 + var40;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[var35 * var80 + 1];
                  var23[var93 - 1 - var36] = var41 * (var37 - var39) - (var38 - var40) * var42;
                  var23[var93 - 3 - var36] = var42 * (var37 - var39) + var41 * (var38 - var40);
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = 8 * var62;
               int var85 = 8 * var75;
               float var88 = var23[1 + var81];
               var23[1 + var81] = var23[var85 + 1];
               var23[1 + var85] = var88;
               var88 = var23[3 + var81];
               var23[var81 + 3] = var23[3 + var85];
               var23[3 + var85] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[5 + var85];
               var23[5 + var85] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[var63 * 2 + 1];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - var64 * 2] = var23[var64 * 4];
            var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
            var23[var5 - var48 - 1 - 2 * var64] = var23[2 + 4 * var64];
            var23[var5 - var48 - 2 - 2 * var64] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[var65 * 2 + 1];
            float var86 = var23[var46 + 2 * var65];
            float var92 = var23[var46 + var65 * 2 + 1];
            float var94 = var23[var5 - 2 - var65 * 2];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = var82 * (var86 - var94) + var76 * (var95 + var92);
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - 2 * var65] = 0.5F * (var86 + var94 - var96);
            var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
            var23[1 + var46 + 2 * var65] = 0.5F * (var92 - var95 + var96);
            var23[var5 - 1 - var65 * 2] = (-var92 + var95 + var96) * 0.5F;
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var23[var46 + 1 + var66 * 2] * var25[1 + 2 * var66] + var23[2 * var66 + var46] * var25[2 * var66];
            var23[var46 - 1 - var66] = var25[1 + 2 * var66] * var23[var66 * 2 + var46] - var25[2 * var66] * var23[var46 + var66 * 2 + 1];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
         }

         for (int var68 = 0; var68 < var48; var68++) {
            var23[var68] = var23[var68 + var48];
         }

         for (int var69 = 0; var69 < var48; var69++) {
            var23[var69 + var48] = -var23[var48 - var69 - 1];
         }

         for (int var70 = 0; var70 < var48; var70++) {
            var23[var46 + var70] = var23[var5 - var70 - 1];
         }

         for (int var71 = var9; var71 < var10; var71++) {
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field177[var71] = this.field177[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin(0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI + (Math.PI / 2));
            this.field177[var72] = this.field177[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (312041450 * this.field159 > 0) {
         int var49 = this.field159 * 458072669 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field168) {
            for (int var52 = 0; var52 < -1789839664 * this.field157; var52++) {
               int var54 = (this.field159 * 1057106081 >> 1) + var52;
               var47[var52] += this.field173[var54];
            }
         }

         if (var18.method1160(1123431047)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var53 + (var47.length - (var5 >> 1));
               var47[var55] += this.field177[var53];
            }
         }
      }

      float[] var50 = this.field173;
      this.field173 = this.field177;
      this.field177 = var50;
      this.field159 = 2011282273 * var5;
      this.field157 = 2097275895 * (var13 - (var5 >> 1));
      this.field168 = !var18.method1160(-1282645995);
      return var47;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lai;[BI)V")
   @ObfuscatedName("fi")
   public static void method398(classAI var0, byte[] var1, int var2) {
      classBT var3 = var0.field154;
      var3.method1239(var1, var2, -1144331984);
      var0.field156 = (1 << var3.method1231(4, -2101978785)) * -160417305;
      var0.field155 = (1 << var3.method1231(4, -2051544618)) * -1584956243;

      for (int var4 = 0; var4 < 2; var4++) {
         int var5 = var4 != 0 ? var0.field155 * 356769415 : -837278581 * var0.field156;
         int var6 = var5 >> 1;
         int var7 = var5 >> 2;
         int var8 = var5 >> 3;
         float[] var9 = new float[var6];

         for (int var10 = 0; var10 < var7; var10++) {
            var9[2 * var10] = (float)Math.cos(Math.PI * (var10 * 4) / var5);
            var9[2 * var10 + 1] = -((float)Math.sin(Math.PI * (var10 * 4) / var5));
         }

         float[] var33 = new float[var6];

         for (int var11 = 0; var11 < var7; var11++) {
            var33[2 * var11] = (float)Math.cos(Math.PI * (1 + var11 * 2) / (var5 * 2));
            var33[1 + 2 * var11] = (float)Math.sin(Math.PI * (2 * var11 + 1) / (2 * var5));
         }

         float[] var34 = new float[var7];

         for (int var12 = 0; var12 < var8; var12++) {
            var34[2 * var12] = (float)Math.cos((var12 * 4 + 2) * Math.PI / var5);
            var34[1 + var12 * 2] = -((float)Math.sin(Math.PI * (2 + var12 * 4) / var5));
         }

         int[] var35 = new int[var8];
         int var13 = classZA.method13821(var8 - 1, (byte)72);

         for (int var14 = 0; var14 < var8; var14++) {
            int var18 = var14;
            int var19 = var13;

            int var20;
            for (var20 = 0; var19 > 0; var19--) {
               var20 = var20 << 1 | var18 & 1;
               var18 >>>= 1;
            }

            var35[var14] = var20;
         }

         if (0 != var4) {
            var0.field176 = var9;
            var0.field175 = var33;
            var0.field170 = var34;
            var0.field180 = var35;
         } else {
            var0.field174 = var9;
            var0.field172 = var33;
            var0.field171 = var34;
            var0.field179 = var35;
         }
      }

      int var21 = var3.method1231(8, -1928996858) + 1;
      var0.field184 = new classBX[var21];

      for (int var22 = 0; var22 < var21; var22++) {
         var0.field184[var22] = new classBX(var3);
      }

      int var23 = var3.method1231(6, -1991913299) + 1;

      for (int var25 = 0; var25 < var23; var25++) {
         var3.method1231(16, -1920260923);
      }

      var23 = var3.method1231(6, -2104112679) + 1;
      var0.field182 = new classAY[var23];

      for (int var26 = 0; var26 < var23; var26++) {
         var0.field182[var26] = new classAY(var3);
      }

      int var27 = var3.method1231(6, -1983402927) + 1;
      var0.field181 = new classAN[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         var0.field181[var28] = new classAN(var3);
      }

      int var29 = var3.method1231(6, -1960486580) + 1;
      var0.field183 = new classBN[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         var0.field183[var30] = new classBN(var3);
      }

      int var31 = var3.method1231(6, -2058516319) + 1;
      var0.field185 = new boolean[var31];
      var0.field178 = new int[var31];

      for (int var32 = 0; var32 < var31; var32++) {
         var0.field185[var32] = classBT.method1235(var3, 729402974) != 0;
         var3.method1231(16, -1919177508);
         var3.method1231(16, -1927154951);
         var0.field178[var32] = var3.method1231(8, -2015650832);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lor;")
   @ObfuscatedName("az")
   public static classOR method376(int var0, int var1) {
      try {
         classOR var2 = (classOR)classOR.field5098.method6422(var0);
         if (null != var2) {
            if (var1 >= -1254383693) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classEN.field1802.method11867(13, var0, -1029614508);
            var2 = new classOR(new Buffer(var3), var0);
            classOR.field5098.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ai.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxo;I)Lrz;")
   @ObfuscatedName("az")
   static classRZ method370(classXO var0, int var1) {
      try {
         return new classRZ();
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ai.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   int method375(int var1) {
      try {
         return 2023037195 * this.field159;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ai.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("as")
   float[] method394(int var1, int var2) {
      try {
         classBT var3 = new classBT();
         var3.method1239(this.field186[var1], 0, -1144331984);
         this.field177 = new float[this.field158 * 356769415];
         classBT.method1235(var3, 349072342);
         int var4 = var3.method1231(classZA.method13821(this.field180.length - 1, (byte)19), -2002540571);
         boolean var5 = this.field185[var4];
         int var10000;
         if (var5) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var10000 = 356769415 * this.field157;
         } else {
            var10000 = -837278581 * this.field157;
         }

         int var6 = var10000;
         boolean var7 = false;
         boolean var8 = false;
         if (var5) {
            boolean var100;
            if (classBT.method1235(var3, 684804797) != 0) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var100 = true;
            } else {
               var100 = false;
            }

            var7 = var100;
            if (classBT.method1235(var3, -789927244) != 0) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var100 = true;
            } else {
               var100 = false;
            }

            var8 = var100;
         }

         int var9;
         int var10;
         int var11;
         int var12;
         label510: {
            var9 = var6 >> 1;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               if (!var7) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  var10 = (var6 >> 2) - (this.field160 * -837278581 >> 2);
                  var11 = (this.field156 * -837278581 >> 2) + (var6 >> 2);
                  var12 = -837278581 * this.field157 >> 1;
                  break label510;
               }
            }

            var10 = 0;
            var11 = var9;
            var12 = var6 >> 1;
         }

         int var13;
         int var14;
         int var15;
         label504: {
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               if (!var8) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  var13 = var6 - (var6 >> 2) - (-837278581 * this.field158 >> 2);
                  var14 = (this.field161 * -837278581 >> 2) + (var6 - (var6 >> 2));
                  var15 = this.field156 * -837278581 >> 1;
                  break label504;
               }
            }

            var13 = var9;
            var14 = var6;
            var15 = var6 >> 1;
         }

         classBN var16 = this.field183[this.field178[var4]];
         int var17 = var16.field515;
         int var18 = var16.field517[var17];
         classBM var19 = this.field182[var18].method742(var3, this.field184);
         boolean var102;
         if (!var19.method1160(-1601769703)) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var102 = true;
         } else {
            var102 = false;
         }

         boolean var20 = var102;

         for (int var21 = 0; var21 < var16.field516; var21++) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            classAN var22 = this.field181[var16.field518[var21]];
            float[] var23 = this.field173;
            var22.method611(var23, var6 >> 1, var20, var3, this.field184);
         }

         if (var19.method1160(-1606755211)) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            var17 = var16.field516;
            var18 = var16.field517[var17];
            classBM.method1151(var19, this.field171, var6 >> 1, 2118775804);
         }

         if (!var19.method1160(-760509938)) {
            for (int var47 = var6 >> 1; var47 < var6; var47++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               this.field173[var47] = 0.0F;
            }
         } else {
            int var48 = var6 >> 1;
            int var50 = var6 >> 2;
            int var53 = var6 >> 3;
            float[] var24 = this.field172;

            for (int var25 = 0; var25 < var48; var25++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var25] *= 0.5F;
            }

            for (int var58 = var48; var58 < var6; var58++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var58] = -var24[var6 - var58 - 1];
            }

            float[] var103;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var103 = this.field177;
            } else {
               var103 = this.field170;
            }

            float[] var59 = var103;
            float[] var104;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var104 = this.field170;
            } else {
               var104 = this.field176;
            }

            float[] var26 = var104;
            float[] var105;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var105 = this.field171;
            } else {
               var105 = this.field176;
            }

            float[] var27 = var105;
            int[] var106;
            if (var5) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var106 = this.field180;
            } else {
               var106 = this.field178;
            }

            int[] var28 = var106;

            for (int var29 = 0; var29 < var50; var29++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var30 = var24[var29 * 4] - var24[var6 - 4 * var29 - 1];
               float var31 = var24[var29 * 4 + 2] - var24[var6 - var29 * 4 - 3];
               float var32 = var59[var29 * 2];
               float var33 = var59[1 + 2 * var29];
               var24[var6 - var29 * 4 - 1] = var30 * var32 - var31 * var33;
               var24[var6 - var29 * 4 - 3] = var32 * var31 + var33 * var30;
            }

            for (int var60 = 0; var60 < var53; var60++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var62 = var24[3 + var48 + var60 * 4];
               float var75 = var24[var48 + 1 + var60 * 4];
               float var81 = var24[4 * var60 + 3];
               float var85 = var24[var60 * 4 + 1];
               var24[var48 + 3 + 4 * var60] = var62 + var81;
               var24[var60 * 4 + 1 + var48] = var85 + var75;
               float var34 = var59[var48 - 4 - var60 * 4];
               float var35 = var59[var48 - 3 - 4 * var60];
               var24[var60 * 4 + 3] = var34 * (var62 - var81) - (var75 - var85) * var35;
               var24[1 + 4 * var60] = (var62 - var81) * var35 + var34 * (var75 - var85);
            }

            int var61 = classZA.method13821(var6 - 1, (byte)109);

            for (int var63 = 0; var63 < var61 - 3; var63++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               int var76 = var6 >> var63 + 2;
               int var82 = 8 << var63;

               for (int var86 = 0; var86 < 2 << var63; var86++) {
                  int var89 = var6 - var76 * 2 * var86;
                  int var95 = var6 - (var86 * 2 + 1) * var76;

                  for (int var36 = 0; var36 < var6 >> 4 + var63; var36++) {
                     int var37 = 4 * var36;
                     float var38 = var24[var89 - 1 - var37];
                     float var39 = var24[var89 - 3 - var37];
                     float var40 = var24[var95 - 1 - var37];
                     float var41 = var24[var95 - 3 - var37];
                     var24[var89 - 1 - var37] = var38 + var40;
                     var24[var89 - 3 - var37] = var39 + var41;
                     float var42 = var59[var82 * var36];
                     float var43 = var59[var36 * var82 + 1];
                     var24[var95 - 1 - var37] = var42 * (var38 - var40) - (var39 - var41) * var43;
                     var24[var95 - 3 - var37] = var43 * (var38 - var40) + var42 * (var39 - var41);
                  }
               }
            }

            for (int var64 = 1; var64 < var53 - 1; var64++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               int var77 = var28[var64];
               if (var64 < var77) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  int var83 = 8 * var64;
                  int var87 = 8 * var77;
                  float var90 = var24[1 + var83];
                  var24[1 + var83] = var24[var87 + 1];
                  var24[1 + var87] = var90;
                  var90 = var24[3 + var83];
                  var24[var83 + 3] = var24[3 + var87];
                  var24[3 + var87] = var90;
                  var90 = var24[var83 + 5];
                  var24[var83 + 5] = var24[5 + var87];
                  var24[5 + var87] = var90;
                  var90 = var24[7 + var83];
                  var24[7 + var83] = var24[7 + var87];
                  var24[var87 + 7] = var90;
               }
            }

            for (int var65 = 0; var65 < var48; var65++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var65] = var24[var65 * 2 + 1];
            }

            for (int var66 = 0; var66 < var53; var66++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var6 - 1 - var66 * 2] = var24[var66 * 4];
               var24[var6 - 2 - 2 * var66] = var24[4 * var66 + 1];
               var24[var6 - var50 - 1 - 2 * var66] = var24[2 + 4 * var66];
               var24[var6 - var50 - 2 - 2 * var66] = var24[3 + var66 * 4];
            }

            for (int var67 = 0; var67 < var53; var67++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var78 = var27[2 * var67];
               float var84 = var27[var67 * 2 + 1];
               float var88 = var24[var48 + 2 * var67];
               float var94 = var24[var48 + var67 * 2 + 1];
               float var96 = var24[var6 - 2 - var67 * 2];
               float var97 = var24[var6 - 1 - var67 * 2];
               float var98 = var84 * (var88 - var96) + var78 * (var97 + var94);
               var24[var48 + var67 * 2] = (var98 + (var96 + var88)) * 0.5F;
               var24[var6 - 2 - 2 * var67] = 0.5F * (var88 + var96 - var98);
               var98 = var84 * (var94 + var97) - var78 * (var88 - var96);
               var24[1 + var48 + 2 * var67] = 0.5F * (var94 - var97 + var98);
               var24[var6 - 1 - var67 * 2] = (-var94 + var97 + var98) * 0.5F;
            }

            for (int var68 = 0; var68 < var50; var68++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var68] = var24[var48 + 1 + var68 * 2] * var26[1 + 2 * var68] + var24[2 * var68 + var48] * var26[2 * var68];
               var24[var48 - 1 - var68] = var26[1 + 2 * var68] * var24[var68 * 2 + var48] - var26[2 * var68] * var24[var48 + var68 * 2 + 1];
            }

            for (int var69 = 0; var69 < var50; var69++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var69 + (var6 - var50)] = -var24[var69];
            }

            for (int var70 = 0; var70 < var50; var70++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var70] = var24[var70 + var50];
            }

            for (int var71 = 0; var71 < var50; var71++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               var24[var71 + var50] = -var24[var50 - var71 - 1];
            }

            for (int var72 = 0; var72 < var50; var72++) {
               var24[var48 + var72] = var24[var6 - var72 - 1];
            }

            for (int var73 = var10; var73 < var11; var73++) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               float var79 = (float)Math.sin(0.5 * ((var73 - var10 + 0.5) / var12) * Math.PI);
               this.field171[var73] = this.field171[var73] * (float)Math.sin((Math.PI / 2) * var79 * var79);
            }

            for (int var74 = var13; var74 < var14; var74++) {
               float var80 = (float)Math.sin(0.5 * ((0.5 + (var74 - var13)) / var15) * Math.PI + (Math.PI / 2));
               this.field172[var74] = this.field172[var74] * (float)Math.sin(var80 * (Math.PI / 2) * var80);
            }
         }

         float[] var49 = null;
         if (1057106081 * this.field157 > 0) {
            if (var2 == -1620201763) {
               throw new IllegalStateException();
            }

            int var51 = this.field161 * 1057106081 + var6 >> 2;
            var49 = new float[var51];
            if (!this.field168) {
               if (var2 == -1620201763) {
                  throw new IllegalStateException();
               }

               for (int var54 = 0; var54 < 113829097 * this.field161; var54++) {
                  if (var2 == -1620201763) {
                     throw new IllegalStateException();
                  }

                  int var56 = (this.field158 * 1057106081 >> 1) + var54;
                  var49[var54] += this.field177[var56];
               }
            }

            if (var19.method1160(-1112949688)) {
               for (int var55 = var10; var55 < var6 >> 1; var55++) {
                  int var57 = var55 + (var49.length - (var6 >> 1));
                  var49[var57] += this.field175[var55];
               }
            }
         }

         float[] var52 = this.field170;
         this.field175 = this.field170;
         this.field170 = var52;
         this.field158 = 2011282273 * var6;
         this.field156 = 1767781209 * (var14 - (var6 >> 1));
         this.field169 = !var19.method1160(-1743403726);
         return var49;
      } catch (RuntimeException var44) {
         throw classEG.newRunException(var44, "ai.as(" + ')');
      }
   }
}
