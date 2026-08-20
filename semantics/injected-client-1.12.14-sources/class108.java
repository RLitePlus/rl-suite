import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("es")
public class class108 {
   @ObfuscatedName("ar")
   int field1675;
   @ObfuscatedSignature(descriptor = "[Ldu;")
   @ObfuscatedName("ae")
   VorbisFloor[] field1691;
   @ObfuscatedName("ag")
   int field1670;
   @ObfuscatedName("an")
   int field1673;
   @ObfuscatedName("aw")
   boolean[] field1694;
   @ObfuscatedSignature(descriptor = "[Lde;")
   @ObfuscatedName("aj")
   VorbisResidue[] field1690;
   @ObfuscatedName("au")
   float[] field1683;
   @ObfuscatedName("af")
   int field1669;
   @ObfuscatedSignature(descriptor = "[Lee;")
   @ObfuscatedName("at")
   VorbisCodebook[] field1693;
   @ObfuscatedName("ad")
   float[] field1679;
   @ObfuscatedName("ay")
   float[] field1684;
   @ObfuscatedName("ao")
   float[] field1681;
   @ObfuscatedName("az")
   float[] field1685;
   @ObfuscatedName("aa")
   int field1668;
   @ObfuscatedName("ai")
   float[] field1680;
   @ObfuscatedName("ac")
   int[] field1688;
   @ObfuscatedName("ab")
   int[] field1687;
   @ObfuscatedName("ax")
   byte[][] field1695;
   @ObfuscatedName("ah")
   int field1671;
   @ObfuscatedName("bo")
   float[] field1686;
   @ObfuscatedName("al")
   int field1672;
   @ObfuscatedName("aq")
   int field1674;
   @ObfuscatedName("am")
   boolean field1677;
   @ObfuscatedSignature(descriptor = "Lem;")
   @ObfuscatedName("av")
   classEM field1667;
   @ObfuscatedName("ap")
   int[] field1689;
   @ObfuscatedSignature(descriptor = "[Lec;")
   @ObfuscatedName("ak")
   VorbisMapping[] field1692;
   @ObfuscatedName("be")
   boolean field1678;
   @ObfuscatedName("as")
   float[] field1682;
   @ObfuscatedName("bi")
   static int field1676;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int method3859(int var1) {
      try {
         return -2039671841 * this.field1675;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "es.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;)Ldq;")
   @ObfuscatedName("em")
   public static RawSound method3874(class108 var0) {
      if (var0 == null) {
         var0.method3860();
      }

      var0.field1668 = 0;
      var0.field1682 = new float[-1385525943 * var0.field1673];
      short[] var1 = new short[var0.field1671 * -547117659];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.field1695.length; var3++) {
         float[] var4 = method3879(var0, var3, 796065525);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > var0.field1671 * -547117659 - var2) {
               var5 = var0.field1671 * -547117659 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classSF.method10160(1950667270, 32767, (int)(32768.0F * var4[var6]), -19618711);
            }
         }
      }

      var0.field1682 = null;
      return new RawSound(1505856736 * var0.field1675, var1, var0.field1672 * -2145751539, -1443346660 * var0.field1669, var0.field1677, false);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int method3862() {
      return this.field1672 * -2145751539;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int method3866(int var1) {
      try {
         return 442890883 * this.field1669;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "es.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   void method3871(Buffer var1, int var2) {
      try {
         this.field1675 = Buffer.method12015(var1, -1019826105) * 1850239007;
         this.field1671 = Buffer.method12015(var1, 593429542) * -1426408915;
         this.field1672 = Buffer.method12015(var1, -952092528) * 910856389;
         this.field1669 = Buffer.method12015(var1, -496207441) * -1868454869;
         if (this.field1669 * 442890883 < 0) {
            if (var2 == 1122264325) {
               return;
            }

            this.field1669 = ~(this.field1669 * 442890883) * -1868454869;
            this.field1677 = true;
         }

         int var3 = Buffer.method12015(var1, 2097917196);
         this.field1695 = new byte[var3][];

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 == 1122264325) {
               throw new IllegalStateException();
            }

            int var5 = 0;

            int var6;
            do {
               var6 = var1.readUnsignedByte(1604270716);
               var5 += var6;
            } while (var6 >= 255);

            if (var2 == 1122264325) {
               return;
            }

            byte[] var8 = new byte[var5];
            var1.readBytes(var8, 0, var5, (byte)14);
            this.field1695[var4] = var8;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "es.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method3863() {
      return this.field1672 * -2145751539;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method3867() {
      return 442890883 * this.field1669;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ak")
   void method3884(byte[] var1, int var2, int var3) {
      try {
         classEM var4 = this.field1667;
         var4.method3781(var1, var2, -1793120611);
         this.field1670 = (1 << classEM.method3770(var4, 4, 30742441)) * 1988241381;
         this.field1673 = (1 << classEM.method3770(var4, 4, 1352584024)) * -300157703;

         for (int var5 = 0; var5 < 2; var5++) {
            if (var3 != -1226370646) {
               throw new IllegalStateException();
            }

            int var10000;
            if (var5 != 0) {
               if (var3 != -1226370646) {
                  throw new IllegalStateException();
               }

               var10000 = this.field1673 * -1385525943;
            } else {
               var10000 = this.field1670 * -284574227;
            }

            int var6 = var10000;
            int var7 = var6 >> 1;
            int var8 = var6 >> 2;
            int var9 = var6 >> 3;
            float[] var10 = new float[var7];

            for (int var11 = 0; var11 < var8; var11++) {
               if (var3 != -1226370646) {
                  throw new IllegalStateException();
               }

               var10[2 * var11] = (float)Math.cos(Math.PI * (var11 * 4) / var6);
               var10[1 + 2 * var11] = -((float)Math.sin(4 * var11 * Math.PI / var6));
            }

            float[] var35 = new float[var7];

            for (int var12 = 0; var12 < var8; var12++) {
               var35[2 * var12] = (float)Math.cos((2 * var12 + 1) * Math.PI / (2 * var6));
               var35[var12 * 2 + 1] = (float)Math.sin((var12 * 2 + 1) * Math.PI / (2 * var6));
            }

            float[] var36 = new float[var8];

            for (int var13 = 0; var13 < var9; var13++) {
               if (var3 != -1226370646) {
                  return;
               }

               var36[2 * var13] = (float)Math.cos(Math.PI * (2 + var13 * 4) / var6);
               var36[1 + 2 * var13] = -((float)Math.sin((2 + 4 * var13) * Math.PI / var6));
            }

            int[] var37 = new int[var9];
            int var14 = class39.iLog(var9 - 1, -714442251);

            for (int var15 = 0; var15 < var9; var15++) {
               if (var3 != -1226370646) {
                  throw new IllegalStateException();
               }

               int var19 = var15;
               int var20 = var14;

               int var21;
               for (var21 = 0; var20 > 0; var20--) {
                  if (var3 != -1226370646) {
                     throw new IllegalStateException();
                  }

                  var21 = var21 << 1 | var19 & 1;
                  var19 >>>= 1;
               }

               var37[var15] = var21;
            }

            if (var5 != 0) {
               if (var3 != -1226370646) {
                  return;
               }

               this.field1685 = var10;
               this.field1686 = var35;
               this.field1680 = var36;
               this.field1687 = var37;
            } else {
               this.field1679 = var10;
               this.field1684 = var35;
               this.field1681 = var36;
               this.field1688 = var37;
            }
         }

         int var23 = classEM.method3770(var4, 8, -1675220218) + 1;
         this.field1693 = new VorbisCodebook[var23];

         for (int var24 = 0; var24 < var23; var24++) {
            if (var3 != -1226370646) {
               throw new IllegalStateException();
            }

            this.field1693[var24] = new VorbisCodebook(var4);
         }

         int var25 = classEM.method3770(var4, 6, -1302376408) + 1;

         for (int var27 = 0; var27 < var25; var27++) {
            if (var3 != -1226370646) {
               return;
            }

            classEM.method3770(var4, 16, -883505781);
         }

         var25 = classEM.method3770(var4, 6, -833918917) + 1;
         this.field1691 = new VorbisFloor[var25];

         for (int var28 = 0; var28 < var25; var28++) {
            if (var3 != -1226370646) {
               throw new IllegalStateException();
            }

            this.field1691[var28] = new VorbisFloor(var4);
         }

         int var29 = classEM.method3770(var4, 6, -994176786) + 1;
         this.field1690 = new VorbisResidue[var29];

         for (int var30 = 0; var30 < var29; var30++) {
            this.field1690[var30] = new VorbisResidue(var4);
         }

         int var31 = classEM.method3770(var4, 6, -1954245155) + 1;
         this.field1692 = new VorbisMapping[var31];

         for (int var32 = 0; var32 < var31; var32++) {
            if (var3 != -1226370646) {
               return;
            }

            this.field1692[var32] = new VorbisMapping(var4);
         }

         int var33 = classEM.method3770(var4, 6, 525436470) + 1;
         this.field1694 = new boolean[var33];
         this.field1689 = new int[var33];

         for (int var34 = 0; var34 < var33; var34++) {
            if (var3 != -1226370646) {
               return;
            }

            boolean[] var38 = this.field1694;
            boolean var10002;
            if (classEM.method3774(var4, (byte)4) != 0) {
               if (var3 != -1226370646) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            var38[var34] = var10002;
            classEM.method3770(var4, 16, 1318461382);
            classEM.method3770(var4, 16, 1160204662);
            this.field1689[var34] = classEM.method3770(var4, 8, 2034768411);
         }
      } catch (RuntimeException var22) {
         throw RestClientThreadFactory.newRunException(var22, "es.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method3860() {
      return -2039671841 * this.field1675;
   }

   @ObfuscatedSignature(descriptor = "(Les;II)[F")
   @ObfuscatedName("xx")
   public static float[] method3879(class108 var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3883(var1, var1);
      }

      try {
         classEM var3 = new classEM();
         var3.method3781(var0.field1695[var1], 0, -1793120611);
         var0.field1683 = new float[var0.field1673 * -1385525943];
         classEM.method3774(var3, (byte)4);
         int var4 = classEM.method3770(var3, class39.iLog(var0.field1689.length - 1, -1727100302), 107102995);
         boolean var5 = var0.field1694[var4];
         int var10000;
         if (var5) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var10000 = var0.field1673 * -1385525943;
         } else {
            var10000 = -284574227 * var0.field1670;
         }

         int var6 = var10000;
         boolean var7 = false;
         boolean var8 = false;
         if (var5) {
            var7 = classEM.method3774(var3, (byte)4) != 0;
            boolean var100;
            if (classEM.method3774(var3, (byte)4) != 0) {
               if (var2 != 796065525) {
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
         label522: {
            var9 = var6 >> 1;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               if (!var7) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  var10 = (var6 >> 2) - (-284574227 * var0.field1670 >> 2);
                  var11 = (var6 >> 2) + (var0.field1670 * -284574227 >> 2);
                  var12 = -284574227 * var0.field1670 >> 1;
                  break label522;
               }
            }

            var10 = 0;
            var11 = var9;
            var12 = var6 >> 1;
         }

         int var13;
         int var14;
         int var15;
         label516: {
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               if (!var8) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  var13 = var6 - (var6 >> 2) - (-284574227 * var0.field1670 >> 2);
                  var14 = (-284574227 * var0.field1670 >> 2) + (var6 - (var6 >> 2));
                  var15 = var0.field1670 * -284574227 >> 1;
                  break label516;
               }
            }

            var13 = var9;
            var14 = var6;
            var15 = var6 >> 1;
         }

         VorbisMapping var16 = var0.field1692[var0.field1689[var4]];
         int var17 = var16.field1552;
         int var18 = var16.field1553[var17];
         class113 var19 = VorbisFloor.method3487(var0.field1691[var18], var3, var0.field1693);
         boolean var101;
         if (!var19.method3919((byte)-62)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var101 = true;
         } else {
            var101 = false;
         }

         boolean var20 = var101;

         for (int var21 = 0; var21 < var16.field1551; var21++) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            VorbisResidue var22 = var0.field1690[var16.field1554[var21]];
            float[] var23 = var0.field1683;
            var22.method3104(var23, var6 >> 1, var20, var3, var0.field1693);
         }

         if (var19.method3919((byte)-108)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var17 = var16.field1552;
            var18 = var16.field1553[var17];
            class113.method3913(var19, var0.field1683, var6 >> 1, -1106247087);
         }

         if (!var19.method3919((byte)-106)) {
            for (int var47 = var6 >> 1; var47 < var6; var47++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var0.field1683[var47] = 0.0F;
            }
         } else {
            int var48 = var6 >> 1;
            int var50 = var6 >> 2;
            int var53 = var6 >> 3;
            float[] var24 = var0.field1683;

            for (int var25 = 0; var25 < var48; var25++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var25] *= 0.5F;
            }

            for (int var58 = var48; var58 < var6; var58++) {
               var24[var58] = -var24[var6 - var58 - 1];
            }

            float[] var102;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var102 = var0.field1685;
            } else {
               var102 = var0.field1679;
            }

            float[] var59 = var102;
            float[] var26 = var5 ? var0.field1686 : var0.field1684;
            float[] var103;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var103 = var0.field1680;
            } else {
               var103 = var0.field1681;
            }

            float[] var27 = var103;
            int[] var104;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var104 = var0.field1687;
            } else {
               var104 = var0.field1688;
            }

            int[] var28 = var104;

            for (int var29 = 0; var29 < var50; var29++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var30 = var24[4 * var29] - var24[var6 - 4 * var29 - 1];
               float var31 = var24[4 * var29 + 2] - var24[var6 - var29 * 4 - 3];
               float var32 = var59[var29 * 2];
               float var33 = var59[var29 * 2 + 1];
               var24[var6 - 4 * var29 - 1] = var30 * var32 - var31 * var33;
               var24[var6 - 4 * var29 - 3] = var31 * var32 + var33 * var30;
            }

            for (int var60 = 0; var60 < var53; var60++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var62 = var24[4 * var60 + var48 + 3];
               float var75 = var24[1 + var48 + 4 * var60];
               float var81 = var24[4 * var60 + 3];
               float var85 = var24[var60 * 4 + 1];
               var24[3 + var48 + var60 * 4] = var62 + var81;
               var24[var48 + 1 + 4 * var60] = var75 + var85;
               float var34 = var59[var48 - 4 - 4 * var60];
               float var35 = var59[var48 - 3 - 4 * var60];
               var24[3 + var60 * 4] = (var62 - var81) * var34 - (var75 - var85) * var35;
               var24[1 + var60 * 4] = (var62 - var81) * var35 + (var75 - var85) * var34;
            }

            int var61 = class39.iLog(var6 - 1, -1913087425);

            for (int var63 = 0; var63 < var61 - 3; var63++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               int var76 = var6 >> var63 + 2;
               int var82 = 8 << var63;

               for (int var86 = 0; var86 < 2 << var63; var86++) {
                  int var89 = var6 - 2 * var76 * var86;
                  int var95 = var6 - var76 * (1 + 2 * var86);

                  for (int var36 = 0; var36 < var6 >> 4 + var63; var36++) {
                     if (var2 != 796065525) {
                        throw new IllegalStateException();
                     }

                     int var37 = 4 * var36;
                     float var38 = var24[var89 - 1 - var37];
                     float var39 = var24[var89 - 3 - var37];
                     float var40 = var24[var95 - 1 - var37];
                     float var41 = var24[var95 - 3 - var37];
                     var24[var89 - 1 - var37] = var40 + var38;
                     var24[var89 - 3 - var37] = var41 + var39;
                     float var42 = var59[var82 * var36];
                     float var43 = var59[1 + var82 * var36];
                     var24[var95 - 1 - var37] = (var38 - var40) * var42 - var43 * (var39 - var41);
                     var24[var95 - 3 - var37] = var42 * (var39 - var41) + (var38 - var40) * var43;
                  }
               }
            }

            for (int var64 = 1; var64 < var53 - 1; var64++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               int var77 = var28[var64];
               if (var64 < var77) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var83 = var64 * 8;
                  int var87 = var77 * 8;
                  float var90 = var24[var83 + 1];
                  var24[1 + var83] = var24[var87 + 1];
                  var24[var87 + 1] = var90;
                  var90 = var24[var83 + 3];
                  var24[3 + var83] = var24[3 + var87];
                  var24[var87 + 3] = var90;
                  var90 = var24[var83 + 5];
                  var24[var83 + 5] = var24[var87 + 5];
                  var24[var87 + 5] = var90;
                  var90 = var24[7 + var83];
                  var24[7 + var83] = var24[7 + var87];
                  var24[var87 + 7] = var90;
               }
            }

            for (int var65 = 0; var65 < var48; var65++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var65] = var24[1 + 2 * var65];
            }

            for (int var66 = 0; var66 < var53; var66++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var6 - 1 - 2 * var66] = var24[4 * var66];
               var24[var6 - 2 - 2 * var66] = var24[1 + 4 * var66];
               var24[var6 - var50 - 1 - var66 * 2] = var24[4 * var66 + 2];
               var24[var6 - var50 - 2 - var66 * 2] = var24[3 + var66 * 4];
            }

            for (int var67 = 0; var67 < var53; var67++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var78 = var27[2 * var67];
               float var84 = var27[1 + 2 * var67];
               float var88 = var24[var67 * 2 + var48];
               float var94 = var24[1 + var48 + 2 * var67];
               float var96 = var24[var6 - 2 - 2 * var67];
               float var97 = var24[var6 - 1 - var67 * 2];
               float var98 = (var97 + var94) * var78 + (var88 - var96) * var84;
               var24[var48 + var67 * 2] = (var98 + (var96 + var88)) * 0.5F;
               var24[var6 - 2 - var67 * 2] = 0.5F * (var96 + var88 - var98);
               var98 = var84 * (var97 + var94) - var78 * (var88 - var96);
               var24[1 + var48 + var67 * 2] = (var98 + (var94 - var97)) * 0.5F;
               var24[var6 - 1 - var67 * 2] = 0.5F * (-var94 + var97 + var98);
            }

            for (int var68 = 0; var68 < var50; var68++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var68] = var26[var68 * 2] * var24[var68 * 2 + var48] + var26[2 * var68 + 1] * var24[var68 * 2 + 1 + var48];
               var24[var48 - 1 - var68] = var24[var68 * 2 + var48] * var26[1 + 2 * var68] - var24[var48 + 1 + 2 * var68] * var26[2 * var68];
            }

            for (int var69 = 0; var69 < var50; var69++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var69 + (var6 - var50)] = -var24[var69];
            }

            for (int var70 = 0; var70 < var50; var70++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var70] = var24[var50 + var70];
            }

            for (int var71 = 0; var71 < var50; var71++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var50 + var71] = -var24[var50 - var71 - 1];
            }

            for (int var72 = 0; var72 < var50; var72++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var48 + var72] = var24[var6 - var72 - 1];
            }

            for (int var73 = var10; var73 < var11; var73++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var79 = (float)Math.sin(0.5 * ((var73 - var10 + 0.5) / var12) * Math.PI);
               var0.field1683[var73] = var0.field1683[var73] * (float)Math.sin(var79 * ((Math.PI / 2) * var79));
            }

            for (int var74 = var13; var74 < var14; var74++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var80 = (float)Math.sin((Math.PI / 2) + 0.5 * ((0.5 + (var74 - var13)) / var15) * Math.PI);
               var0.field1683[var74] = var0.field1683[var74] * (float)Math.sin(var80 * (Math.PI / 2) * var80);
            }
         }

         float[] var49 = null;
         if (var0.field1668 * -920882293 > 0) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            int var51 = -920882293 * var0.field1668 + var6 >> 2;
            var49 = new float[var51];
            if (!var0.field1678) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               for (int var54 = 0; var54 < 2012767871 * var0.field1674; var54++) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var56 = var54 + (-920882293 * var0.field1668 >> 1);
                  var49[var54] += var0.field1682[var56];
               }
            }

            if (var19.method3919((byte)-118)) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               for (int var55 = var10; var55 < var6 >> 1; var55++) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var57 = var49.length - (var6 >> 1) + var55;
                  var49[var57] += var0.field1683[var55];
               }
            }
         }

         float[] var52 = var0.field1682;
         var0.field1682 = var0.field1683;
         var0.field1683 = var52;
         var0.field1668 = var6 * -125101021;
         var0.field1674 = 475879807 * (var14 - (var6 >> 1));
         boolean var10001;
         if (!var19.method3919((byte)-109)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         var0.field1678 = var10001;
         return var49;
      } catch (RuntimeException var44) {
         throw RestClientThreadFactory.newRunException(var44, "es.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method3864() {
      return this.field1672 * -2145751539;
   }

   class108(classEM var1) {
      this.field1667 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method3868() {
      return 442890883 * this.field1669;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;I)[F")
   @ObfuscatedName("yl")
   public static float[] method3880(class108 var0, int var1) {
      if (var0 == null) {
         var0.method3881(var1);
      }

      classEM var2 = new classEM();
      var2.method3781(var0.field1695[var1], 0, -1793120611);
      var0.field1683 = new float[var0.field1673 * -1385525943];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(var0.field1689.length - 1, -1066973044), -981773743);
      boolean var4 = var0.field1694[var3];
      int var5 = var4 ? var0.field1673 * -1385525943 : 912655974 * var0.field1670;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classEM.method3774(var2, (byte)4) != 0;
         var7 = classEM.method3774(var2, (byte)4) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (-284574227 * var0.field1670 >> 2);
         var10 = (var5 >> 2) + (var0.field1670 * -430909998 >> 2);
         var11 = 1153546241 * var0.field1670 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (1678569777 * var0.field1670 >> 2);
         var13 = (1133987358 * var0.field1670 >> 2) + (var5 - (var5 >> 2));
         var14 = var0.field1670 * -1765273224 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = var0.field1692[var0.field1689[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(var0.field1691[var17], var2, var0.field1693);
      boolean var19 = !var18.method3919((byte)-71);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = var0.field1690[var15.field1554[var20]];
         float[] var22 = var0.field1683;
         var21.method3104(var22, var5 >> 1, var19, var2, var0.field1693);
      }

      if (var18.method3919((byte)0)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, var0.field1683, var5 >> 1, 1252001365);
      }

      if (!var18.method3919((byte)-87)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            var0.field1683[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = var0.field1683;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? var0.field1685 : var0.field1679;
         float[] var25 = var4 ? var0.field1686 : var0.field1684;
         float[] var26 = var4 ? var0.field1680 : var0.field1681;
         int[] var27 = var4 ? var0.field1687 : var0.field1688;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[4 * var28 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[var28 * 2 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var30 * var31 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[4 * var58 + var46 + 3];
            float var73 = var23[1 + var46 + 4 * var58];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[3 + var46 + var58 * 4] = var60 + var79;
            var23[var46 + 1 + 4 * var58] = var73 + var83;
            float var33 = var57[var46 - 4 - 4 * var58];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[3 + var58 * 4] = (var60 - var79) * var33 - (var73 - var83) * var34;
            var23[1 + var58 * 4] = (var60 - var79) * var34 + (var73 - var83) * var33;
         }

         int var59 = class39.iLog(var5 - 1, -1480250356);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - 2 * var74 * var84;
               int var93 = var5 - var74 * (1 + 2 * var84);

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var39 + var37;
                  var23[var87 - 3 - var36] = var40 + var38;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[1 + var80 * var35];
                  var23[var93 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
                  var23[var93 - 3 - var36] = var41 * (var38 - var40) + (var37 - var39) * var42;
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = var62 * 8;
               int var85 = var75 * 8;
               float var88 = var23[var81 + 1];
               var23[1 + var81] = var23[var85 + 1];
               var23[var85 + 1] = var88;
               var88 = var23[var81 + 3];
               var23[3 + var81] = var23[3 + var85];
               var23[var85 + 3] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[var85 + 5];
               var23[var85 + 5] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[1 + 2 * var63];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - 2 * var64] = var23[4 * var64];
            var23[var5 - 2 - 2 * var64] = var23[1 + 4 * var64];
            var23[var5 - var48 - 1 - var64 * 2] = var23[4 * var64 + 2];
            var23[var5 - var48 - 2 - var64 * 2] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[1 + 2 * var65];
            float var86 = var23[var65 * 2 + var46];
            float var92 = var23[1 + var46 + 2 * var65];
            float var94 = var23[var5 - 2 - 2 * var65];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = (var95 + var92) * var76 + (var86 - var94) * var82;
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - var65 * 2] = 0.5F * (var94 + var86 - var96);
            var96 = var82 * (var95 + var92) - var76 * (var86 - var94);
            var23[1 + var46 + var65 * 2] = (var96 + (var92 - var95)) * 0.5F;
            var23[var5 - 1 - var65 * 2] = 0.5F * (-var92 + var95 + var96);
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var25[var66 * 2] * var23[var66 * 2 + var46] + var25[2 * var66 + 1] * var23[var66 * 2 + 1 + var46];
            var23[var46 - 1 - var66] = var23[var66 * 2 + var46] * var25[1 + 2 * var66] - var23[var46 + 1 + 2 * var66] * var25[2 * var66];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
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
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            var0.field1683[var71] = var0.field1683[var71] * (float)Math.sin(var77 * ((Math.PI / 2) * var77));
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((Math.PI / 2) + 0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI);
            var0.field1683[var72] = var0.field1683[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (var0.field1668 * -807608672 > 0) {
         int var49 = -920882293 * var0.field1668 + var5 >> 2;
         var47 = new float[var49];
         if (!var0.field1678) {
            for (int var52 = 0; var52 < -1351796238 * var0.field1674; var52++) {
               int var54 = var52 + (830918244 * var0.field1668 >> 1);
               var47[var52] += var0.field1682[var54];
            }
         }

         if (var18.method3919((byte)-82)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += var0.field1683[var53];
            }
         }
      }

      float[] var50 = var0.field1682;
      var0.field1682 = var0.field1683;
      var0.field1683 = var50;
      var0.field1668 = var5 * -125101021;
      var0.field1674 = 1015793649 * (var13 - (var5 >> 1));
      var0.field1678 = !var18.method3919((byte)-1);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("jk")
   static final void drawEntities(int var0, int var1, int var2, int var3, byte var4) {
      try {
         client.viewportDrawCount += -1872214741;
         Occluder.topLevelWorldView.scene.cycle = 1759706017 * client.cycle;
         class50.method1290((byte)-66);
         class164.method4215(Occluder.topLevelWorldView, (byte)27);
         WorldView var5 = Occluder.topLevelWorldView;
         int var6 = 1759446067 * client.menu.field6552 - 1;
         if (null != AbstractWorldMapIcon.field3996) {
            if (var4 == 4) {
               throw new IllegalStateException();
            }

            label118:
            if (var5 == Occluder.topLevelWorldView && var6 >= 0 && client.menu.menuOpcodes[var6] == 60) {
               if (var4 == 4) {
                  return;
               }

               if (740194039 * client.field893 > 0) {
                  if (var4 == 4) {
                     throw new IllegalStateException();
                  }

                  if (client.menu.menuIdentifiers[var6] == -768977623 * client.field891) {
                     if (var4 == 4) {
                        throw new IllegalStateException();
                     }
                     break label118;
                  }
               }

               int var8 = client.menu.menuIdentifiers[var6] * 128;
               Clock.method6213(var5, var8, AbstractWorldMapIcon.field3996, (byte)13);
            }
         }

         WorldView var15 = Occluder.topLevelWorldView;
         if (client.renderSelf) {
            class31.addPlayerToScene(var15, client.localPlayerIndex * -1548864151, false, 2098856560);
         }

         WorldView var7 = Occluder.topLevelWorldView;
         if (client.combatTargetPlayerIndex * 1466770191 >= 0) {
            if (var4 == 4) {
               throw new IllegalStateException();
            }

            if (var7.npcs.get(client.combatTargetPlayerIndex * 1466770191) != null) {
               if (var4 == 4) {
                  throw new IllegalStateException();
               }

               class31.addPlayerToScene(var7, client.combatTargetPlayerIndex * 1466770191, false, 2137976669);
            }
         }

         WorldView var17 = Occluder.topLevelWorldView;
         WorldEntity var9 = (WorldEntity)var17.worldEntities.get((long)(1201323213 * client.currentWorldViewId));
         if (null != var9) {
            WorldMapLabelSize.method7223(var17, var9, false, (byte)2);
         }

         class212.method5135(Occluder.topLevelWorldView, WorldEntityOwnerType.field5258, (byte)27);
         class212.method5135(Occluder.topLevelWorldView, WorldEntityOwnerType.field5256, (byte)80);
         class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2280, -1111039125);
         WorldView var18 = Occluder.topLevelWorldView;
         int var10 = 1320060371 * client.playerUpdateManager.field1538;
         int[] var11 = client.playerUpdateManager.playerIndices;

         for (int var12 = 0; var12 < var10; var12++) {
            if (var4 == 4) {
               return;
            }

            if (1466770191 * client.combatTargetPlayerIndex != var11[var12]) {
               if (var11[var12] == -1548864151 * client.localPlayerIndex) {
                  if (var4 == 4) {
                     throw new IllegalStateException();
                  }
               } else {
                  class31.addPlayerToScene(var18, var11[var12], true, 2119426087);
               }
            }
         }

         class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2281, -862583164);
         class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2282, -1474986624);
         classNV.method7854(1868866219);
         UserList.method10739(Occluder.topLevelWorldView, -2119681656);
         class212.method5135(Occluder.topLevelWorldView, WorldEntityOwnerType.field5257, (byte)13);
         class33.worldToScreen(var0, var1, var2, var3, -867112715);
         Occluder.topLevelWorldView.scene.setViewportWalking();

         for (int var14 = 0; var14 < Occluder.topLevelWorldView.field1314.method10502(-2090339500); var14++) {
            if (var4 == 4) {
               return;
            }

            WorldEntity var16 = (WorldEntity)Occluder.topLevelWorldView
               .worldEntities
               .get((long)Occluder.topLevelWorldView.field1314.method10498(var14, (byte)87));
            if (null != var16) {
               var16.worldView.scene.setViewportWalking();
            }
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "es.jk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ldq;")
   @ObfuscatedName("ae")
   RawSound method3875(byte var1) {
      try {
         this.field1668 = 0;
         this.field1682 = new float[-1385525943 * this.field1673];
         short[] var2 = new short[this.field1671 * -547117659];
         int var3 = 0;

         for (int var4 = 0; var4 < this.field1695.length; var4++) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            float[] var5 = method3879(this, var4, 796065525);
            if (null != var5) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               int var6 = var5.length;
               if (var6 > this.field1671 * -547117659 - var3) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }

                  var6 = this.field1671 * -547117659 - var3;
               }

               for (int var7 = 0; var7 < var6; var7++) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }

                  var2[var3++] = (short)classSF.method10160(-32768, 32767, (int)(32768.0F * var5[var7]), -19618711);
               }
            }
         }

         this.field1682 = null;
         return new RawSound(-2039671841 * this.field1675, var2, this.field1672 * -2145751539, 442890883 * this.field1669, this.field1677, false);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "es.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method3869() {
      return 442890883 * this.field1669;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ax")
   void method3872(Buffer var1) {
      this.field1675 = Buffer.method12015(var1, -656475510) * 1850239007;
      this.field1671 = Buffer.method12015(var1, 1438806472) * -1426408915;
      this.field1672 = Buffer.method12015(var1, -52898728) * 910856389;
      this.field1669 = Buffer.method12015(var1, 1769409786) * -1868454869;
      if (this.field1669 * 442890883 < 0) {
         this.field1669 = ~(this.field1669 * 442890883) * -1868454869;
         this.field1677 = true;
      }

      int var2 = Buffer.method12015(var1, 1291206978);
      this.field1695 = new byte[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = 0;

         int var5;
         do {
            var5 = var1.readUnsignedByte(964959099);
            var4 += var5;
         } while (var5 >= 255);

         byte[] var6 = new byte[var4];
         var1.readBytes(var6, 0, var4, (byte)88);
         this.field1695[var3] = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   int method3870() {
      return 442890883 * this.field1669;
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("ah")
   RawSound method3876() {
      this.field1668 = 0;
      this.field1682 = new float[1872260419 * this.field1673];
      short[] var1 = new short[this.field1671 * -545165043];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field1695.length; var3++) {
         float[] var4 = method3879(this, var3, 796065525);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > this.field1671 * -212402922 - var2) {
               var5 = this.field1671 * -1590193212 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classSF.method10160(-641716400, 32767, (int)(32768.0F * var4[var6]), -19618711);
            }
         }
      }

      this.field1682 = null;
      return new RawSound(-1239715928 * this.field1675, var1, this.field1672 * -2145751539, 1365224009 * this.field1669, this.field1677, false);
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("al")
   RawSound method3877() {
      this.field1668 = 0;
      this.field1682 = new float[-1385525943 * this.field1673];
      short[] var1 = new short[this.field1671 * 1624817116];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field1695.length; var3++) {
         float[] var4 = method3879(this, var3, 796065525);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > this.field1671 * -547117659 - var2) {
               var5 = this.field1671 * 895588132 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classSF.method10160(-32768, 32767, (int)(32768.0F * var4[var6]), -19618711);
            }
         }
      }

      this.field1682 = null;
      return new RawSound(-1998719860 * this.field1675, var1, this.field1672 * -2112023068, 270504391 * this.field1669, this.field1677, false);
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("af")
   RawSound method3878() {
      this.field1668 = 0;
      this.field1682 = new float[-1385525943 * this.field1673];
      short[] var1 = new short[this.field1671 * -547117659];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field1695.length; var3++) {
         float[] var4 = method3879(this, var3, 796065525);
         if (null != var4) {
            int var5 = var4.length;
            if (var5 > this.field1671 * -547117659 - var2) {
               var5 = this.field1671 * -547117659 - var2;
            }

            for (int var6 = 0; var6 < var5; var6++) {
               var1[var2++] = (short)classSF.method10160(-32768, 32767, (int)(32768.0F * var4[var6]), -19618711);
            }
         }
      }

      this.field1682 = null;
      return new RawSound(-2039671841 * this.field1675, var1, this.field1672 * -2145751539, 442890883 * this.field1669, this.field1677, false);
   }

   @ObfuscatedSignature(descriptor = "(Les;I)I")
   @ObfuscatedName("md")
   public static int method3865(class108 var0, int var1) {
      if (var0 == null) {
         var0.method3861(var1);
      }

      try {
         return var0.field1672 * -2145751539;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "es.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("am")
   float[] method3881(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1695[var1], 0, -1793120611);
      this.field1683 = new float[this.field1673 * -1385525943];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(this.field1689.length - 1, -1018052046), -1121654668);
      boolean var4 = this.field1694[var3];
      int var5 = var4 ? this.field1673 * -1385525943 : -284574227 * this.field1670;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classEM.method3774(var2, (byte)4) != 0;
         var7 = classEM.method3774(var2, (byte)4) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (-284574227 * this.field1670 >> 2);
         var10 = (var5 >> 2) + (this.field1670 * -284574227 >> 2);
         var11 = -1359924842 * this.field1670 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (-284574227 * this.field1670 >> 2);
         var13 = (-284574227 * this.field1670 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field1670 * -284574227 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = this.field1692[this.field1689[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(this.field1691[var17], var2, this.field1693);
      boolean var19 = !var18.method3919((byte)-105);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = this.field1690[var15.field1554[var20]];
         float[] var22 = this.field1683;
         var21.method3104(var22, var5 >> 1, var19, var2, this.field1693);
      }

      if (var18.method3919((byte)-14)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1683, var5 >> 1, 1621470587);
      }

      if (!var18.method3919((byte)-81)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1683[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1683;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field1685 : this.field1679;
         float[] var25 = var4 ? this.field1686 : this.field1684;
         float[] var26 = var4 ? this.field1680 : this.field1681;
         int[] var27 = var4 ? this.field1687 : this.field1688;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[4 * var28 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[var28 * 2 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var30 * var31 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[4 * var58 + var46 + 3];
            float var73 = var23[1 + var46 + 4 * var58];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[3 + var46 + var58 * 4] = var60 + var79;
            var23[var46 + 1 + 4 * var58] = var73 + var83;
            float var33 = var57[var46 - 4 - 4 * var58];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[3 + var58 * 4] = (var60 - var79) * var33 - (var73 - var83) * var34;
            var23[1 + var58 * 4] = (var60 - var79) * var34 + (var73 - var83) * var33;
         }

         int var59 = class39.iLog(var5 - 1, -982274073);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - 2 * var74 * var84;
               int var93 = var5 - var74 * (1 + 2 * var84);

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var39 + var37;
                  var23[var87 - 3 - var36] = var40 + var38;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[1 + var80 * var35];
                  var23[var93 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
                  var23[var93 - 3 - var36] = var41 * (var38 - var40) + (var37 - var39) * var42;
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = var62 * 8;
               int var85 = var75 * 8;
               float var88 = var23[var81 + 1];
               var23[1 + var81] = var23[var85 + 1];
               var23[var85 + 1] = var88;
               var88 = var23[var81 + 3];
               var23[3 + var81] = var23[3 + var85];
               var23[var85 + 3] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[var85 + 5];
               var23[var85 + 5] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[1 + 2 * var63];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - 2 * var64] = var23[4 * var64];
            var23[var5 - 2 - 2 * var64] = var23[1 + 4 * var64];
            var23[var5 - var48 - 1 - var64 * 2] = var23[4 * var64 + 2];
            var23[var5 - var48 - 2 - var64 * 2] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[1 + 2 * var65];
            float var86 = var23[var65 * 2 + var46];
            float var92 = var23[1 + var46 + 2 * var65];
            float var94 = var23[var5 - 2 - 2 * var65];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = (var95 + var92) * var76 + (var86 - var94) * var82;
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - var65 * 2] = 0.5F * (var94 + var86 - var96);
            var96 = var82 * (var95 + var92) - var76 * (var86 - var94);
            var23[1 + var46 + var65 * 2] = (var96 + (var92 - var95)) * 0.5F;
            var23[var5 - 1 - var65 * 2] = 0.5F * (-var92 + var95 + var96);
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var25[var66 * 2] * var23[var66 * 2 + var46] + var25[2 * var66 + 1] * var23[var66 * 2 + 1 + var46];
            var23[var46 - 1 - var66] = var23[var66 * 2 + var46] * var25[1 + 2 * var66] - var23[var46 + 1 + 2 * var66] * var25[2 * var66];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
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
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field1683[var71] = this.field1683[var71] * (float)Math.sin(var77 * ((Math.PI / 2) * var77));
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((Math.PI / 2) + 0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI);
            this.field1683[var72] = this.field1683[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (this.field1668 * -1409398188 > 0) {
         int var49 = -920882293 * this.field1668 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1678) {
            for (int var52 = 0; var52 < -891260722 * this.field1674; var52++) {
               int var54 = var52 + (-274961892 * this.field1668 >> 1);
               var47[var52] += this.field1682[var54];
            }
         }

         if (var18.method3919((byte)-10)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1683[var53];
            }
         }
      }

      float[] var50 = this.field1682;
      this.field1682 = this.field1683;
      this.field1683 = var50;
      this.field1668 = var5 * 1153441653;
      this.field1674 = -1143812842 * (var13 - (var5 >> 1));
      this.field1678 = !var18.method3919((byte)-98);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("aa")
   float[] method3882(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1695[var1], 0, -1793120611);
      this.field1683 = new float[this.field1673 * 1911176498];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(this.field1689.length - 1, -1069080717), -1101792599);
      boolean var4 = this.field1694[var3];
      int var5 = var4 ? this.field1673 * -1385525943 : -911157141 * this.field1670;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = classEM.method3774(var2, (byte)4) != 0;
         var7 = classEM.method3774(var2, (byte)4) != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (-987583994 * this.field1670 >> 2);
         var10 = (var5 >> 2) + (this.field1670 * -284574227 >> 2);
         var11 = -284574227 * this.field1670 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (1538637777 * this.field1670 >> 2);
         var13 = (1429055344 * this.field1670 >> 2) + (var5 - (var5 >> 2));
         var14 = this.field1670 * -284574227 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = this.field1692[this.field1689[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(this.field1691[var17], var2, this.field1693);
      boolean var19 = !var18.method3919((byte)-28);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = this.field1690[var15.field1554[var20]];
         float[] var22 = this.field1683;
         var21.method3104(var22, var5 >> 1, var19, var2, this.field1693);
      }

      if (var18.method3919((byte)-17)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1683, var5 >> 1, -190284253);
      }

      if (!var18.method3919((byte)-71)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1683[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1683;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? this.field1685 : this.field1679;
         float[] var25 = var4 ? this.field1686 : this.field1684;
         float[] var26 = var4 ? this.field1680 : this.field1681;
         int[] var27 = var4 ? this.field1687 : this.field1688;

         for (int var28 = 0; var28 < var48; var28++) {
            float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
            float var30 = var23[4 * var28 + 2] - var23[var5 - var28 * 4 - 3];
            float var31 = var57[var28 * 2];
            float var32 = var57[var28 * 2 + 1];
            var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - 4 * var28 - 3] = var30 * var31 + var32 * var29;
         }

         for (int var58 = 0; var58 < var51; var58++) {
            float var60 = var23[4 * var58 + var46 + 3];
            float var73 = var23[1 + var46 + 4 * var58];
            float var79 = var23[4 * var58 + 3];
            float var83 = var23[var58 * 4 + 1];
            var23[3 + var46 + var58 * 4] = var60 + var79;
            var23[var46 + 1 + 4 * var58] = var73 + var83;
            float var33 = var57[var46 - 4 - 4 * var58];
            float var34 = var57[var46 - 3 - 4 * var58];
            var23[3 + var58 * 4] = (var60 - var79) * var33 - (var73 - var83) * var34;
            var23[1 + var58 * 4] = (var60 - var79) * var34 + (var73 - var83) * var33;
         }

         int var59 = class39.iLog(var5 - 1, -1647423043);

         for (int var61 = 0; var61 < var59 - 3; var61++) {
            int var74 = var5 >> var61 + 2;
            int var80 = 8 << var61;

            for (int var84 = 0; var84 < 2 << var61; var84++) {
               int var87 = var5 - 2 * var74 * var84;
               int var93 = var5 - var74 * (1 + 2 * var84);

               for (int var35 = 0; var35 < var5 >> 4 + var61; var35++) {
                  int var36 = 4 * var35;
                  float var37 = var23[var87 - 1 - var36];
                  float var38 = var23[var87 - 3 - var36];
                  float var39 = var23[var93 - 1 - var36];
                  float var40 = var23[var93 - 3 - var36];
                  var23[var87 - 1 - var36] = var39 + var37;
                  var23[var87 - 3 - var36] = var40 + var38;
                  float var41 = var57[var80 * var35];
                  float var42 = var57[1 + var80 * var35];
                  var23[var93 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
                  var23[var93 - 3 - var36] = var41 * (var38 - var40) + (var37 - var39) * var42;
               }
            }
         }

         for (int var62 = 1; var62 < var51 - 1; var62++) {
            int var75 = var27[var62];
            if (var62 < var75) {
               int var81 = var62 * 8;
               int var85 = var75 * 8;
               float var88 = var23[var81 + 1];
               var23[1 + var81] = var23[var85 + 1];
               var23[var85 + 1] = var88;
               var88 = var23[var81 + 3];
               var23[3 + var81] = var23[3 + var85];
               var23[var85 + 3] = var88;
               var88 = var23[var81 + 5];
               var23[var81 + 5] = var23[var85 + 5];
               var23[var85 + 5] = var88;
               var88 = var23[7 + var81];
               var23[7 + var81] = var23[7 + var85];
               var23[var85 + 7] = var88;
            }
         }

         for (int var63 = 0; var63 < var46; var63++) {
            var23[var63] = var23[1 + 2 * var63];
         }

         for (int var64 = 0; var64 < var51; var64++) {
            var23[var5 - 1 - 2 * var64] = var23[4 * var64];
            var23[var5 - 2 - 2 * var64] = var23[1 + 4 * var64];
            var23[var5 - var48 - 1 - var64 * 2] = var23[4 * var64 + 2];
            var23[var5 - var48 - 2 - var64 * 2] = var23[3 + var64 * 4];
         }

         for (int var65 = 0; var65 < var51; var65++) {
            float var76 = var26[2 * var65];
            float var82 = var26[1 + 2 * var65];
            float var86 = var23[var65 * 2 + var46];
            float var92 = var23[1 + var46 + 2 * var65];
            float var94 = var23[var5 - 2 - 2 * var65];
            float var95 = var23[var5 - 1 - var65 * 2];
            float var96 = (var95 + var92) * var76 + (var86 - var94) * var82;
            var23[var46 + var65 * 2] = (var96 + (var94 + var86)) * 0.5F;
            var23[var5 - 2 - var65 * 2] = 0.5F * (var94 + var86 - var96);
            var96 = var82 * (var95 + var92) - var76 * (var86 - var94);
            var23[1 + var46 + var65 * 2] = (var96 + (var92 - var95)) * 0.5F;
            var23[var5 - 1 - var65 * 2] = 0.5F * (-var92 + var95 + var96);
         }

         for (int var66 = 0; var66 < var48; var66++) {
            var23[var66] = var25[var66 * 2] * var23[var66 * 2 + var46] + var25[2 * var66 + 1] * var23[var66 * 2 + 1 + var46];
            var23[var46 - 1 - var66] = var23[var66 * 2 + var46] * var25[1 + 2 * var66] - var23[var46 + 1 + 2 * var66] * var25[2 * var66];
         }

         for (int var67 = 0; var67 < var48; var67++) {
            var23[var67 + (var5 - var48)] = -var23[var67];
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
            float var77 = (float)Math.sin(0.5 * ((var71 - var9 + 0.5) / var11) * Math.PI);
            this.field1683[var71] = this.field1683[var71] * (float)Math.sin(var77 * ((Math.PI / 2) * var77));
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((Math.PI / 2) + 0.5 * ((0.5 + (var72 - var12)) / var14) * Math.PI);
            this.field1683[var72] = this.field1683[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
         }
      }

      float[] var47 = null;
      if (this.field1668 * -1669250147 > 0) {
         int var49 = 1593661628 * this.field1668 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1678) {
            for (int var52 = 0; var52 < 293189822 * this.field1674; var52++) {
               int var54 = var52 + (-920882293 * this.field1668 >> 1);
               var47[var52] += this.field1682[var54];
            }
         }

         if (var18.method3919((byte)-114)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1683[var53];
            }
         }
      }

      float[] var50 = this.field1682;
      this.field1682 = this.field1683;
      this.field1683 = var50;
      this.field1668 = var5 * -349521485;
      this.field1674 = 475879807 * (var13 - (var5 >> 1));
      this.field1678 = !var18.method3919((byte)-92);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("aq")
   void method3885(byte[] var1, int var2) {
      classEM var3 = this.field1667;
      var3.method3781(var1, var2, -1793120611);
      this.field1670 = (1 << classEM.method3770(var3, 4, 1645272207)) * 1988241381;
      this.field1673 = (1 << classEM.method3770(var3, 4, 1445881667)) * -300157703;

      for (int var4 = 0; var4 < 2; var4++) {
         int var5 = var4 != 0 ? this.field1673 * -1385525943 : this.field1670 * -284574227;
         int var6 = var5 >> 1;
         int var7 = var5 >> 2;
         int var8 = var5 >> 3;
         float[] var9 = new float[var6];

         for (int var10 = 0; var10 < var7; var10++) {
            var9[2 * var10] = (float)Math.cos(Math.PI * (var10 * 4) / var5);
            var9[1 + 2 * var10] = -((float)Math.sin(4 * var10 * Math.PI / var5));
         }

         float[] var33 = new float[var6];

         for (int var11 = 0; var11 < var7; var11++) {
            var33[2 * var11] = (float)Math.cos((2 * var11 + 1) * Math.PI / (2 * var5));
            var33[var11 * 2 + 1] = (float)Math.sin((var11 * 2 + 1) * Math.PI / (2 * var5));
         }

         float[] var34 = new float[var7];

         for (int var12 = 0; var12 < var8; var12++) {
            var34[2 * var12] = (float)Math.cos(Math.PI * (2 + var12 * 4) / var5);
            var34[1 + 2 * var12] = -((float)Math.sin((2 + 4 * var12) * Math.PI / var5));
         }

         int[] var35 = new int[var8];
         int var13 = class39.iLog(var8 - 1, -1308187240);

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

         if (var4 != 0) {
            this.field1685 = var9;
            this.field1686 = var33;
            this.field1680 = var34;
            this.field1687 = var35;
         } else {
            this.field1679 = var9;
            this.field1684 = var33;
            this.field1681 = var34;
            this.field1688 = var35;
         }
      }

      int var21 = classEM.method3770(var3, 8, -1390222684) + 1;
      this.field1693 = new VorbisCodebook[var21];

      for (int var22 = 0; var22 < var21; var22++) {
         this.field1693[var22] = new VorbisCodebook(var3);
      }

      int var23 = classEM.method3770(var3, 6, 347087828) + 1;

      for (int var25 = 0; var25 < var23; var25++) {
         classEM.method3770(var3, 16, -588381274);
      }

      var23 = classEM.method3770(var3, 6, 587190121) + 1;
      this.field1691 = new VorbisFloor[var23];

      for (int var26 = 0; var26 < var23; var26++) {
         this.field1691[var26] = new VorbisFloor(var3);
      }

      int var27 = classEM.method3770(var3, 6, 1146194113) + 1;
      this.field1690 = new VorbisResidue[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         this.field1690[var28] = new VorbisResidue(var3);
      }

      int var29 = classEM.method3770(var3, 6, 445934153) + 1;
      this.field1692 = new VorbisMapping[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         this.field1692[var30] = new VorbisMapping(var3);
      }

      int var31 = classEM.method3770(var3, 6, -750953275) + 1;
      this.field1694 = new boolean[var31];
      this.field1689 = new int[var31];

      for (int var32 = 0; var32 < var31; var32++) {
         this.field1694[var32] = classEM.method3774(var3, (byte)4) != 0;
         classEM.method3770(var3, 16, 93930101);
         classEM.method3770(var3, 16, 1363483203);
         this.field1689[var32] = classEM.method3770(var3, 8, -227163198);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;)Ltz;")
   @ObfuscatedName("hs")
   public static User method3873(UserList var0, Username var1) {
      if (var0 == null) {
         var0.vmethod351(var1, var1);
      }

      return !var1.hasCleanName(-698146178) ? null : (User)var0.previousUsernamesMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lql;III)I")
   @ObfuscatedName("at")
   static int method3858(IterableNodeHashTable var0, int var1, int var2, int var3) {
      try {
         if (var0 == null) {
            if (var3 >= 503766140) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            IntegerNode var4 = (IntegerNode)var0.get((long)var1);
            if (var4 == null) {
               if (var3 >= 503766140) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return var4.integer;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "es.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lhb;")
   @ObfuscatedName("av")
   public static EnumComposition getEnum(int var0, int var1) {
      try {
         EnumComposition var2 = (EnumComposition)class402.method8806(EnumComposition.EnumDefinition_cached, var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = EnumComposition.EnumDefinition_archive.getFile(8, var0, 1162383715);
            var2 = new EnumComposition();
            if (null != var3) {
               if (var1 >= 706950864) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), (byte)85);
            }

            EnumComposition.EnumDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "es.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Ljava/lang/String;")
   @ObfuscatedName("mv")
   static final String method3888(int var0, int var1, byte var2) {
      try {
         int var3 = var1 - var0;
         if (var3 < -9) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(16711680, 958182628);
            }
         } else if (var3 < -6) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(16723968, 944287276);
            }
         } else if (var3 < -3) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(16740352, -1704811775);
            }
         } else if (var3 < 0) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(16756736, 1297838144);
            }
         } else if (var3 > 9) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(65280, -1112543136);
            }
         } else if (var3 > 6) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(4259584, 1340487043);
            }
         } else if (var3 > 3) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(8453888, 1058980035);
            }
         } else if (var3 > 0) {
            if (var2 >= 21) {
               throw new IllegalStateException();
            } else {
               return class144.colorStartTag(12648192, -2109914526);
            }
         } else {
            return class144.colorStartTag(16776960, -166631546);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "es.mv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("if")
   static final void method3886(int var0) {
      try {
         KitDefinition.KitDefinition_archive = null;
         ClanChannelMember.KitDefinition_modelsArchive = null;
         class408.KitDefinition_fileCount = 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "es.if(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   int method3861(int var1) {
      try {
         return -2039671841 * this.field1671;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "es.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("aj")
   float[] method3883(int var1, int var2) {
      try {
         classEM var3 = new classEM();
         var3.method3781(this.field1695[var1], 0, -1793120611);
         this.field1683 = new float[this.field1668 * -1385525943];
         classEM.method3774(var3, (byte)4);
         int var4 = classEM.method3770(var3, class39.iLog(this.field1688.length - 1, -1727100302), 107102995);
         boolean var5 = this.field1694[var4];
         int var10000;
         if (var5) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var10000 = this.field1675 * -1385525943;
         } else {
            var10000 = -284574227 * this.field1670;
         }

         int var6 = var10000;
         boolean var7 = false;
         boolean var8 = false;
         if (var5) {
            var7 = classEM.method3774(var3, (byte)4) != 0;
            boolean var100;
            if (classEM.method3774(var3, (byte)4) != 0) {
               if (var2 != 796065525) {
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
         label520: {
            var9 = var6 >> 1;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               if (!var7) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  var10 = (var6 >> 2) - (-284574227 * this.field1669 >> 2);
                  var11 = (var6 >> 2) + (this.field1670 * -284574227 >> 2);
                  var12 = -284574227 * this.field1672 >> 1;
                  break label520;
               }
            }

            var10 = 0;
            var11 = var9;
            var12 = var6 >> 1;
         }

         int var13;
         int var14;
         int var15;
         label514: {
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               if (!var8) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  var13 = var6 - (var6 >> 2) - (-284574227 * this.field1668 >> 2);
                  var14 = (-284574227 * this.field1671 >> 2) + (var6 - (var6 >> 2));
                  var15 = this.field1673 * -284574227 >> 1;
                  break label514;
               }
            }

            var13 = var9;
            var14 = var6;
            var15 = var6 >> 1;
         }

         VorbisMapping var16 = this.field1692[this.field1689[var4]];
         int var17 = var16.field1551;
         int var18 = var16.field1553[var17];
         class113 var19 = VorbisFloor.method3487(this.field1691[var18], var3, this.field1693);
         boolean var101;
         if (!var19.method3919((byte)-62)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var101 = true;
         } else {
            var101 = false;
         }

         boolean var20 = var101;

         for (int var21 = 0; var21 < var16.field1551; var21++) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            VorbisResidue var22 = this.field1690[var16.field1553[var21]];
            float[] var23 = this.field1680;
            var22.method3106(var23, var6 >> 1, var20, var3, this.field1693);
         }

         if (var19.method3919((byte)-108)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var17 = var16.field1552;
            var18 = var16.field1553[var17];
            class113.method3913(var19, this.field1685, var6 >> 1, -1106247087);
         }

         if (!var19.method3919((byte)-106)) {
            for (int var47 = var6 >> 1; var47 < var6; var47++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               this.field1686[var47] = 0.0F;
            }
         } else {
            int var48 = var6 >> 1;
            int var50 = var6 >> 2;
            int var53 = var6 >> 3;
            float[] var24 = this.field1682;

            for (int var25 = 0; var25 < var48; var25++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var25] *= 0.5F;
            }

            for (int var58 = var48; var58 < var6; var58++) {
               var24[var58] = -var24[var6 - var58 - 1];
            }

            float[] var102;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var102 = this.field1682;
            } else {
               var102 = this.field1681;
            }

            float[] var59 = var102;
            float[] var26 = var5 ? this.field1681 : this.field1684;
            float[] var103;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var103 = this.field1680;
            } else {
               var103 = this.field1682;
            }

            float[] var27 = var103;
            int[] var104;
            if (var5) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var104 = this.field1687;
            } else {
               var104 = this.field1688;
            }

            int[] var28 = var104;

            for (int var29 = 0; var29 < var50; var29++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var30 = var24[4 * var29] - var24[var6 - 4 * var29 - 1];
               float var31 = var24[4 * var29 + 2] - var24[var6 - var29 * 4 - 3];
               float var32 = var59[var29 * 2];
               float var33 = var59[var29 * 2 + 1];
               var24[var6 - 4 * var29 - 1] = var30 * var32 - var31 * var33;
               var24[var6 - 4 * var29 - 3] = var31 * var32 + var33 * var30;
            }

            for (int var60 = 0; var60 < var53; var60++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var62 = var24[4 * var60 + var48 + 3];
               float var75 = var24[1 + var48 + 4 * var60];
               float var81 = var24[4 * var60 + 3];
               float var85 = var24[var60 * 4 + 1];
               var24[3 + var48 + var60 * 4] = var62 + var81;
               var24[var48 + 1 + 4 * var60] = var75 + var85;
               float var34 = var59[var48 - 4 - 4 * var60];
               float var35 = var59[var48 - 3 - 4 * var60];
               var24[3 + var60 * 4] = (var62 - var81) * var34 - (var75 - var85) * var35;
               var24[1 + var60 * 4] = (var62 - var81) * var35 + (var75 - var85) * var34;
            }

            int var61 = class39.iLog(var6 - 1, -1913087425);

            for (int var63 = 0; var63 < var61 - 3; var63++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               int var76 = var6 >> var63 + 2;
               int var82 = 8 << var63;

               for (int var86 = 0; var86 < 2 << var63; var86++) {
                  int var89 = var6 - 2 * var76 * var86;
                  int var95 = var6 - var76 * (1 + 2 * var86);

                  for (int var36 = 0; var36 < var6 >> 4 + var63; var36++) {
                     if (var2 != 796065525) {
                        throw new IllegalStateException();
                     }

                     int var37 = 4 * var36;
                     float var38 = var24[var89 - 1 - var37];
                     float var39 = var24[var89 - 3 - var37];
                     float var40 = var24[var95 - 1 - var37];
                     float var41 = var24[var95 - 3 - var37];
                     var24[var89 - 1 - var37] = var40 + var38;
                     var24[var89 - 3 - var37] = var41 + var39;
                     float var42 = var59[var82 * var36];
                     float var43 = var59[1 + var82 * var36];
                     var24[var95 - 1 - var37] = (var38 - var40) * var42 - var43 * (var39 - var41);
                     var24[var95 - 3 - var37] = var42 * (var39 - var41) + (var38 - var40) * var43;
                  }
               }
            }

            for (int var64 = 1; var64 < var53 - 1; var64++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               int var77 = var28[var64];
               if (var64 < var77) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var83 = var64 * 8;
                  int var87 = var77 * 8;
                  float var90 = var24[var83 + 1];
                  var24[1 + var83] = var24[var87 + 1];
                  var24[var87 + 1] = var90;
                  var90 = var24[var83 + 3];
                  var24[3 + var83] = var24[3 + var87];
                  var24[var87 + 3] = var90;
                  var90 = var24[var83 + 5];
                  var24[var83 + 5] = var24[var87 + 5];
                  var24[var87 + 5] = var90;
                  var90 = var24[7 + var83];
                  var24[7 + var83] = var24[7 + var87];
                  var24[var87 + 7] = var90;
               }
            }

            for (int var65 = 0; var65 < var48; var65++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var65] = var24[1 + 2 * var65];
            }

            for (int var66 = 0; var66 < var53; var66++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var6 - 1 - 2 * var66] = var24[4 * var66];
               var24[var6 - 2 - 2 * var66] = var24[1 + 4 * var66];
               var24[var6 - var50 - 1 - var66 * 2] = var24[4 * var66 + 2];
               var24[var6 - var50 - 2 - var66 * 2] = var24[3 + var66 * 4];
            }

            for (int var67 = 0; var67 < var53; var67++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var78 = var27[2 * var67];
               float var84 = var27[1 + 2 * var67];
               float var88 = var24[var67 * 2 + var48];
               float var94 = var24[1 + var48 + 2 * var67];
               float var96 = var24[var6 - 2 - 2 * var67];
               float var97 = var24[var6 - 1 - var67 * 2];
               float var98 = (var97 + var94) * var78 + (var88 - var96) * var84;
               var24[var48 + var67 * 2] = (var98 + (var96 + var88)) * 0.5F;
               var24[var6 - 2 - var67 * 2] = 0.5F * (var96 + var88 - var98);
               var98 = var84 * (var97 + var94) - var78 * (var88 - var96);
               var24[1 + var48 + var67 * 2] = (var98 + (var94 - var97)) * 0.5F;
               var24[var6 - 1 - var67 * 2] = 0.5F * (-var94 + var97 + var98);
            }

            for (int var68 = 0; var68 < var50; var68++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var68] = var26[var68 * 2] * var24[var68 * 2 + var48] + var26[2 * var68 + 1] * var24[var68 * 2 + 1 + var48];
               var24[var48 - 1 - var68] = var24[var68 * 2 + var48] * var26[1 + 2 * var68] - var24[var48 + 1 + 2 * var68] * var26[2 * var68];
            }

            for (int var69 = 0; var69 < var50; var69++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var69 + (var6 - var50)] = -var24[var69];
            }

            for (int var70 = 0; var70 < var50; var70++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var70] = var24[var50 + var70];
            }

            for (int var71 = 0; var71 < var50; var71++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var50 + var71] = -var24[var50 - var71 - 1];
            }

            for (int var72 = 0; var72 < var50; var72++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               var24[var48 + var72] = var24[var6 - var72 - 1];
            }

            for (int var73 = var10; var73 < var11; var73++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var79 = (float)Math.sin(0.5 * ((var73 - var10 + 0.5) / var12) * Math.PI);
               this.field1684[var73] = this.field1684[var73] * (float)Math.sin(var79 * ((Math.PI / 2) * var79));
            }

            for (int var74 = var13; var74 < var14; var74++) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               float var80 = (float)Math.sin((Math.PI / 2) + 0.5 * ((0.5 + (var74 - var13)) / var15) * Math.PI);
               this.field1686[var74] = this.field1686[var74] * (float)Math.sin(var80 * (Math.PI / 2) * var80);
            }
         }

         float[] var49 = null;
         if (this.field1674 * -920882293 > 0) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            int var51 = -920882293 * this.field1674 + var6 >> 2;
            var49 = new float[var51];
            if (!this.field1678) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               for (int var54 = 0; var54 < 2012767871 * this.field1669; var54++) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var56 = var54 + (-920882293 * this.field1674 >> 1);
                  var49[var54] += this.field1683[var56];
               }
            }

            if (var19.method3919((byte)-118)) {
               if (var2 != 796065525) {
                  throw new IllegalStateException();
               }

               for (int var55 = var10; var55 < var6 >> 1; var55++) {
                  if (var2 != 796065525) {
                     throw new IllegalStateException();
                  }

                  int var57 = var49.length - (var6 >> 1) + var55;
                  var49[var57] += this.field1684[var55];
               }
            }
         }

         float[] var52 = this.field1686;
         this.field1683 = this.field1684;
         this.field1686 = var52;
         this.field1670 = var6 * -125101021;
         this.field1673 = 475879807 * (var14 - (var6 >> 1));
         boolean var10001;
         if (!var19.method3919((byte)-109)) {
            if (var2 != 796065525) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field1678 = var10001;
         return var49;
      } catch (RuntimeException var44) {
         throw RestClientThreadFactory.newRunException(var44, "es.aj(" + ')');
      }
   }
}
