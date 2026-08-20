import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("er")
public class VorbisSample extends Node {
   @ObfuscatedName("ah")
   int sampleRate;
   @ObfuscatedSignature(descriptor = "[Lee;")
   @ObfuscatedName("at")
   static VorbisCodebook[] field1663;
   @ObfuscatedName("ag")
   static int field1638;
   @ObfuscatedName("an")
   static int field1642;
   @ObfuscatedSignature(descriptor = "[Ldu;")
   @ObfuscatedName("ae")
   static VorbisFloor[] field1661;
   @ObfuscatedSignature(descriptor = "[Lde;")
   @ObfuscatedName("aj")
   static VorbisResidue[] field1660;
   @ObfuscatedName("ao")
   boolean field1647;
   @ObfuscatedName("aw")
   static boolean[] field1665;
   @ObfuscatedName("ap")
   static int[] field1658;
   @ObfuscatedName("bz")
   int field1646;
   @ObfuscatedName("au")
   static float[] field1654;
   @ObfuscatedName("aa")
   float[] field1649;
   @ObfuscatedName("ad")
   static float[] field1651;
   @ObfuscatedName("ai")
   static float[] field1652;
   @ObfuscatedName("as")
   static float[] field1653;
   @ObfuscatedName("ac")
   static float[] field1650;
   @ObfuscatedName("ab")
   static int[] field1657;
   @ObfuscatedName("ax")
   static int[] field1659;
   @ObfuscatedName("aq")
   int field1643;
   @ObfuscatedName("az")
   static float[] field1655;
   @ObfuscatedName("al")
   int sampleCount;
   @ObfuscatedName("af")
   int start;
   @ObfuscatedName("ay")
   static boolean field1636 = false;
   @ObfuscatedName("bo")
   boolean field1648;
   @ObfuscatedName("ar")
   byte[][] field1666;
   @ObfuscatedSignature(descriptor = "[Lec;")
   @ObfuscatedName("ak")
   static VorbisMapping[] field1662;
   @ObfuscatedName("be")
   int field1644;
   @ObfuscatedName("am")
   int end;
   @ObfuscatedName("bg")
   float[] field1656;
   @ObfuscatedName("bs")
   short[] samples;
   @ObfuscatedSignature(descriptor = "Lem;")
   @ObfuscatedName("av")
   static classEM field1635 = new classEM();
   @ObfuscatedName("bk")
   int field1645;

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ax")
   void method3844(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.sampleRate = Buffer.method12015(var2, -604211926);
      this.sampleCount = Buffer.method12015(var2, 449691997);
      this.start = Buffer.method12015(var2, 2029654256);
      this.end = Buffer.method12015(var2, 2036842276);
      if (this.end < 0) {
         this.end = ~this.end;
         this.field1648 = true;
      }

      int var3 = Buffer.method12015(var2, 589188702);
      this.field1666 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte(-324116460);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5, (byte)13);
         this.field1666[var4] = var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;[I)Ldq;")
   @ObfuscatedName("az")
   public static RawSound method3853(VorbisSample var0, int[] var1) {
      if (var0 == null) {
         return var0.method3855(var1);
      } else if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (var0.samples == null) {
            var0.field1643 = 0;
            var0.field1649 = new float[field1642];
            var0.samples = new short[var0.sampleCount];
            var0.field1646 = 0;
            var0.field1645 = 0;
         }

         for (; var0.field1645 < var0.field1666.length; var0.field1645++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = var0.method3848(var0.field1645);
            if (var2 != null) {
               int var3 = var0.field1646;
               int var4 = var2.length;
               if (var4 > var0.sampleCount - var3) {
                  var4 = var0.sampleCount - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  var0.samples[var3++] = (short)classSF.method10160(-32768, 32767, (int)(var2[var5] * 32768.0F), -19618711);
               }

               if (var1 != null) {
                  var1[0] -= var3 - var0.field1646;
               }

               var0.field1646 = var3;
            }
         }

         var0.field1649 = null;
         short[] var6 = var0.samples;
         var0.samples = null;
         return new RawSound(var0.sampleRate, var6, var0.start, var0.end, var0.field1648, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("av")
   static float float32Unpack(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("at")
   static void method3836(byte[] var0) {
      classEM var1 = field1635;
      var1.method3781(var0, 0, -1793120611);
      field1638 = 1 << classEM.method3770(var1, 4, 1653079160);
      field1642 = 1 << classEM.method3770(var1, 4, -1007537880);

      for (int var2 = 0; var2 < 2; var2++) {
         int var3 = var2 != 0 ? field1642 : field1638;
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
         int var11 = class39.iLog(var6 - 1, -1008620493);

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
            field1652 = var7;
            field1653 = var31;
            field1650 = var32;
            field1659 = var33;
         } else {
            field1654 = var7;
            field1655 = var31;
            field1651 = var32;
            field1657 = var33;
         }
      }

      int var19 = classEM.method3770(var1, 8, -2130602443) + 1;
      field1663 = new VorbisCodebook[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         field1663[var20] = new VorbisCodebook(field1635);
      }

      int var21 = classEM.method3770(var1, 6, 1079981463) + 1;

      for (int var23 = 0; var23 < var21; var23++) {
         classEM.method3770(var1, 16, 784220537);
      }

      var21 = classEM.method3770(var1, 6, 2064678856) + 1;
      field1661 = new VorbisFloor[var21];

      for (int var24 = 0; var24 < var21; var24++) {
         field1661[var24] = new VorbisFloor(field1635);
      }

      int var25 = classEM.method3770(var1, 6, 1184797283) + 1;
      field1660 = new VorbisResidue[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         field1660[var26] = new VorbisResidue(field1635);
      }

      int var27 = classEM.method3770(var1, 6, -1350761324) + 1;
      field1662 = new VorbisMapping[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         field1662[var28] = new VorbisMapping(field1635);
      }

      int var29 = classEM.method3770(var1, 6, 1402656652) + 1;
      field1665 = new boolean[var29];
      field1658 = new int[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         field1665[var30] = classEM.method3774(var1, (byte)4) != 0;
         classEM.method3770(var1, 16, 1086694282);
         classEM.method3770(var1, 16, -1077522118);
         field1658[var30] = classEM.method3770(var1, 8, -344674547);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("ag")
   static boolean method3839(AbstractArchive var0) {
      if (!field1636) {
         byte[] var1 = var0.getFile(0, 0, 2030230647);
         if (var1 == null) {
            return false;
         }

         method3836(var1);
         field1636 = true;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("aj")
   float[] method3848(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1666[var1], 0, -1793120611);
      this.field1656 = new float[field1642];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(field1658.length - 1, -1478629578), -1477683223);
      boolean var4 = field1665[var3];
      int var5 = var4 ? field1642 : field1638;
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
         var9 = (var5 >> 2) - (field1638 >> 2);
         var10 = (var5 >> 2) + (field1638 >> 2);
         var11 = field1638 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field1638 >> 2);
         var13 = var5 - (var5 >> 2) + (field1638 >> 2);
         var14 = field1638 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field1662[field1658[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(field1661[var17], var2, field1663);
      boolean var19 = !var18.method3919((byte)-97);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = field1660[var15.field1554[var20]];
         float[] var22 = this.field1656;
         var21.method3104(var22, var5 >> 1, var19, var2, field1663);
      }

      if (var18.method3919((byte)-21)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1656, var5 >> 1, -479020294);
      }

      if (!var18.method3919((byte)-29)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1656[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1656;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field1652 : field1654;
         float[] var25 = var4 ? field1653 : field1655;
         float[] var26 = var4 ? field1650 : field1651;
         int[] var27 = var4 ? field1659 : field1657;

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

         int var59 = class39.iLog(var5 - 1, -1390867897);

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
            this.field1656[var71] = this.field1656[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field1656[var72] = this.field1656[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field1643 > 0) {
         int var49 = this.field1643 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1647) {
            for (int var52 = 0; var52 < this.field1644; var52++) {
               int var54 = (this.field1643 >> 1) + var52;
               var47[var52] += this.field1649[var54];
            }
         }

         if (var18.method3919((byte)-48)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1656[var53];
            }
         }
      }

      float[] var50 = this.field1649;
      this.field1649 = this.field1656;
      this.field1656 = var50;
      this.field1643 = var5;
      this.field1644 = var13 - (var5 >> 1);
      this.field1647 = !var18.method3919((byte)-77);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ae")
   void read(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.sampleRate = Buffer.method12015(var2, 344979365);
      this.sampleCount = Buffer.method12015(var2, -573552048);
      this.start = Buffer.method12015(var2, 802130393);
      this.end = Buffer.method12015(var2, -325533898);
      if (this.end < 0) {
         this.end = ~this.end;
         this.field1648 = true;
      }

      int var3 = Buffer.method12015(var2, 996519962);
      this.field1666 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte(-1448284967);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5, (byte)2);
         this.field1666[var4] = var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("al")
   float[] method3849(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1666[var1], 0, -1793120611);
      this.field1656 = new float[field1642];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(field1658.length - 1, -1766244508), -285573931);
      boolean var4 = field1665[var3];
      int var5 = var4 ? field1642 : field1638;
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
         var9 = (var5 >> 2) - (field1638 >> 2);
         var10 = (var5 >> 2) + (field1638 >> 2);
         var11 = field1638 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field1638 >> 2);
         var13 = var5 - (var5 >> 2) + (field1638 >> 2);
         var14 = field1638 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field1662[field1658[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(field1661[var17], var2, field1663);
      boolean var19 = !var18.method3919((byte)-24);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = field1660[var15.field1554[var20]];
         float[] var22 = this.field1656;
         var21.method3104(var22, var5 >> 1, var19, var2, field1663);
      }

      if (var18.method3919((byte)-93)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1656, var5 >> 1, -1031781152);
      }

      if (!var18.method3919((byte)-112)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1656[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1656;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field1652 : field1654;
         float[] var25 = var4 ? field1653 : field1655;
         float[] var26 = var4 ? field1650 : field1651;
         int[] var27 = var4 ? field1659 : field1657;

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

         int var59 = class39.iLog(var5 - 1, -1626194935);

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
            this.field1656[var71] = this.field1656[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field1656[var72] = this.field1656[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field1643 > 0) {
         int var49 = this.field1643 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1647) {
            for (int var52 = 0; var52 < this.field1644; var52++) {
               int var54 = (this.field1643 >> 1) + var52;
               var47[var52] += this.field1649[var54];
            }
         }

         if (var18.method3919((byte)-71)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1656[var53];
            }
         }
      }

      float[] var50 = this.field1649;
      this.field1649 = this.field1656;
      this.field1656 = var50;
      this.field1643 = var5;
      this.field1644 = var13 - (var5 >> 1);
      this.field1647 = !var18.method3919((byte)-83);
      return var47;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("ac")
   static boolean method3840(AbstractArchive var0) {
      if (!field1636) {
         byte[] var1 = var0.getFile(0, 0, -812889503);
         if (var1 == null) {
            return false;
         }

         method3836(var1);
         field1636 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("aw")
   static float method3832(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ay")
   static float method3833(int var0) {
      int var1 = var0 & 1777182868;
      int var2 = var0 & 1224976730;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("au")
   static float method3834(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & 1383208107;
      int var3 = (var0 & -838426551) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("az")
   static void method3837(byte[] var0) {
      classEM var1 = field1635;
      var1.method3781(var0, 0, -1793120611);
      field1638 = 1 << classEM.method3770(var1, 4, -1488983965);
      field1642 = 1 << classEM.method3770(var1, 4, 340511889);

      for (int var2 = 0; var2 < 2; var2++) {
         int var3 = var2 != 0 ? field1642 : field1638;
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
         int var11 = class39.iLog(var6 - 1, -2011599079);

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
            field1652 = var7;
            field1653 = var31;
            field1650 = var32;
            field1659 = var33;
         } else {
            field1654 = var7;
            field1655 = var31;
            field1651 = var32;
            field1657 = var33;
         }
      }

      int var19 = classEM.method3770(var1, 8, 692074466) + 1;
      field1663 = new VorbisCodebook[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         field1663[var20] = new VorbisCodebook(field1635);
      }

      int var21 = classEM.method3770(var1, 6, 1236627594) + 1;

      for (int var23 = 0; var23 < var21; var23++) {
         classEM.method3770(var1, 16, -926155297);
      }

      var21 = classEM.method3770(var1, 6, -1684837057) + 1;
      field1661 = new VorbisFloor[var21];

      for (int var24 = 0; var24 < var21; var24++) {
         field1661[var24] = new VorbisFloor(field1635);
      }

      int var25 = classEM.method3770(var1, 6, -1303029850) + 1;
      field1660 = new VorbisResidue[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         field1660[var26] = new VorbisResidue(field1635);
      }

      int var27 = classEM.method3770(var1, 6, -1027832702) + 1;
      field1662 = new VorbisMapping[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         field1662[var28] = new VorbisMapping(field1635);
      }

      int var29 = classEM.method3770(var1, 6, 1552848880) + 1;
      field1665 = new boolean[var29];
      field1658 = new int[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         field1665[var30] = classEM.method3774(var1, (byte)4) != 0;
         classEM.method3770(var1, 16, 859155691);
         classEM.method3770(var1, 16, -256826780);
         field1658[var30] = classEM.method3770(var1, 8, -1357263773);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;II)Ler;")
   @ObfuscatedName("an")
   static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
      if (!method3839(var0)) {
         var0.tryLoadFile(var1, var2, 756705879);
         return null;
      } else {
         byte[] var3 = var0.getFile(var1, var2, -1560219175);
         return var3 == null ? null : new VorbisSample(var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("ai")
   static boolean method3841(AbstractArchive var0) {
      if (!field1636) {
         byte[] var1 = var0.getFile(0, 0, -237796474);
         if (var1 == null) {
            return false;
         }

         method3836(var1);
         field1636 = true;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("as")
   static boolean method3842(AbstractArchive var0) {
      if (!field1636) {
         byte[] var1 = var0.getFile(0, 0, -1794270627);
         if (var1 == null) {
            return false;
         }

         method3836(var1);
         field1636 = true;
      }

      return true;
   }

   VorbisSample(byte[] var1) {
      this.read(var1);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ab")
   void method3846(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.sampleRate = Buffer.method12015(var2, 1779787877);
      this.sampleCount = Buffer.method12015(var2, 177494467);
      this.start = Buffer.method12015(var2, 152984470);
      this.end = Buffer.method12015(var2, 1533614025);
      if (this.end < 0) {
         this.end = ~this.end;
         this.field1648 = true;
      }

      int var3 = Buffer.method12015(var2, -769051846);
      this.field1666 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte(322806918);
            var5 += var6;
         } while (var6 >= 1969108335);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5, (byte)-31);
         this.field1666[var4] = var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ap")
   static float method3835(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ar")
   void method3847(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.sampleRate = Buffer.method12015(var2, 282069317);
      this.sampleCount = Buffer.method12015(var2, -367627333);
      this.start = Buffer.method12015(var2, 504529538);
      this.end = Buffer.method12015(var2, 1681758933);
      if (this.end < 0) {
         this.end = ~this.end;
         this.field1648 = true;
      }

      int var3 = Buffer.method12015(var2, 1600706851);
      this.field1666 = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte(941989302);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5, (byte)2);
         this.field1666[var4] = var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;I)[F")
   @ObfuscatedName("cd")
   public static float[] method3850(VorbisSample var0, int var1) {
      if (var0 == null) {
         var0.method3852(var1);
      }

      classEM var2 = new classEM();
      var2.method3781(var0.field1666[var1], 0, -1793120611);
      var0.field1656 = new float[field1642];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(field1658.length - 1, -794266868), -1423603327);
      boolean var4 = field1665[var3];
      int var5 = var4 ? field1642 : field1638;
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
         var9 = (var5 >> 2) - (field1638 >> 2);
         var10 = (var5 >> 2) + (field1638 >> 2);
         var11 = field1638 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field1638 >> 2);
         var13 = var5 - (var5 >> 2) + (field1638 >> 2);
         var14 = field1638 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field1662[field1658[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(field1661[var17], var2, field1663);
      boolean var19 = !var18.method3919((byte)-68);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = field1660[var15.field1554[var20]];
         float[] var22 = var0.field1656;
         var21.method3104(var22, var5 >> 1, var19, var2, field1663);
      }

      if (var18.method3919((byte)-114)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, var0.field1656, var5 >> 1, -939457994);
      }

      if (!var18.method3919((byte)-68)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            var0.field1656[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = var0.field1656;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field1652 : field1654;
         float[] var25 = var4 ? field1653 : field1655;
         float[] var26 = var4 ? field1650 : field1651;
         int[] var27 = var4 ? field1659 : field1657;

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

         int var59 = class39.iLog(var5 - 1, -786380156);

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
            var0.field1656[var71] = var0.field1656[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            var0.field1656[var72] = var0.field1656[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (var0.field1643 > 0) {
         int var49 = var0.field1643 + var5 >> 2;
         var47 = new float[var49];
         if (!var0.field1647) {
            for (int var52 = 0; var52 < var0.field1644; var52++) {
               int var54 = (var0.field1643 >> 1) + var52;
               var47[var52] += var0.field1649[var54];
            }
         }

         if (var18.method3919((byte)-47)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += var0.field1656[var53];
            }
         }
      }

      float[] var50 = var0.field1649;
      var0.field1649 = var0.field1656;
      var0.field1656 = var50;
      var0.field1643 = var5;
      var0.field1644 = var13 - (var5 >> 1);
      var0.field1647 = !var18.method3919((byte)-36);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("ah")
   float[] method3851(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1666[var1], 0, -1793120611);
      this.field1656 = new float[field1642];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(field1658.length - 1, -1537063217), 339807785);
      boolean var4 = field1665[var3];
      int var5 = var4 ? field1642 : field1638;
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
         var9 = (var5 >> 2) - (field1638 >> 2);
         var10 = (var5 >> 2) + (field1638 >> 2);
         var11 = field1638 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field1638 >> 2);
         var13 = var5 - (var5 >> 2) + (field1638 >> 2);
         var14 = field1638 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field1662[field1658[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(field1661[var17], var2, field1663);
      boolean var19 = !var18.method3919((byte)-7);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = field1660[var15.field1554[var20]];
         float[] var22 = this.field1656;
         var21.method3104(var22, var5 >> 1, var19, var2, field1663);
      }

      if (var18.method3919((byte)-96)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1656, var5 >> 1, 255705756);
      }

      if (!var18.method3919((byte)-107)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1656[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1656;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field1652 : field1654;
         float[] var25 = var4 ? field1653 : field1655;
         float[] var26 = var4 ? field1650 : field1651;
         int[] var27 = var4 ? field1659 : field1657;

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

         int var59 = class39.iLog(var5 - 1, -2089150986);

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
            this.field1656[var71] = this.field1656[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field1656[var72] = this.field1656[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field1643 > 0) {
         int var49 = this.field1643 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1647) {
            for (int var52 = 0; var52 < this.field1644; var52++) {
               int var54 = (this.field1643 >> 1) + var52;
               var47[var52] += this.field1649[var54];
            }
         }

         if (var18.method3919((byte)-86)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1656[var53];
            }
         }
      }

      float[] var50 = this.field1649;
      this.field1649 = this.field1656;
      this.field1656 = var50;
      this.field1643 = var5;
      this.field1644 = var13 - (var5 >> 1);
      this.field1647 = !var18.method3919((byte)-107);
      return var47;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ad")
   static void method3838(byte[] var0) {
      classEM var1 = field1635;
      var1.method3781(var0, 0, -1793120611);
      field1638 = 1 << classEM.method3770(var1, 4, 162584863);
      field1642 = 1 << classEM.method3770(var1, 4, -1740133548);

      for (int var2 = 0; var2 < 2; var2++) {
         int var3 = var2 != 0 ? field1642 : field1638;
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
         int var11 = class39.iLog(var6 - 1, -1332362143);

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
            field1652 = var7;
            field1653 = var31;
            field1650 = var32;
            field1659 = var33;
         } else {
            field1654 = var7;
            field1655 = var31;
            field1651 = var32;
            field1657 = var33;
         }
      }

      int var19 = classEM.method3770(var1, 8, 1024979678) + 1;
      field1663 = new VorbisCodebook[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         field1663[var20] = new VorbisCodebook(field1635);
      }

      int var21 = classEM.method3770(var1, 6, -372905137) + 1;

      for (int var23 = 0; var23 < var21; var23++) {
         classEM.method3770(var1, 16, 1592827563);
      }

      var21 = classEM.method3770(var1, 6, 1636881881) + 1;
      field1661 = new VorbisFloor[var21];

      for (int var24 = 0; var24 < var21; var24++) {
         field1661[var24] = new VorbisFloor(field1635);
      }

      int var25 = classEM.method3770(var1, 6, 1346774973) + 1;
      field1660 = new VorbisResidue[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         field1660[var26] = new VorbisResidue(field1635);
      }

      int var27 = classEM.method3770(var1, 6, 1850701288) + 1;
      field1662 = new VorbisMapping[var27];

      for (int var28 = 0; var28 < var27; var28++) {
         field1662[var28] = new VorbisMapping(field1635);
      }

      int var29 = classEM.method3770(var1, 6, -1274117310) + 1;
      field1665 = new boolean[var29];
      field1658 = new int[var29];

      for (int var30 = 0; var30 < var29; var30++) {
         field1665[var30] = classEM.method3774(var1, (byte)4) != 0;
         classEM.method3770(var1, 16, 807925650);
         classEM.method3770(var1, 16, 1306321094);
         field1658[var30] = classEM.method3770(var1, 8, 2083485676);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("af")
   float[] method3852(int var1) {
      classEM var2 = new classEM();
      var2.method3781(this.field1666[var1], 0, -1793120611);
      this.field1656 = new float[field1642];
      classEM.method3774(var2, (byte)4);
      int var3 = classEM.method3770(var2, class39.iLog(field1658.length - 1, -1737975013), 615641819);
      boolean var4 = field1665[var3];
      int var5 = var4 ? field1642 : field1638;
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
         var9 = (var5 >> 2) - (field1638 >> 2);
         var10 = (var5 >> 2) + (field1638 >> 2);
         var11 = field1638 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field1638 >> 2);
         var13 = var5 - (var5 >> 2) + (field1638 >> 2);
         var14 = field1638 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      VorbisMapping var15 = field1662[field1658[var3]];
      int var16 = var15.field1552;
      int var17 = var15.field1553[var16];
      class113 var18 = VorbisFloor.method3487(field1661[var17], var2, field1663);
      boolean var19 = !var18.method3919((byte)-122);

      for (int var20 = 0; var20 < var15.field1551; var20++) {
         VorbisResidue var21 = field1660[var15.field1554[var20]];
         float[] var22 = this.field1656;
         var21.method3104(var22, var5 >> 1, var19, var2, field1663);
      }

      if (var18.method3919((byte)-9)) {
         var16 = var15.field1552;
         var17 = var15.field1553[var16];
         class113.method3913(var18, this.field1656, var5 >> 1, 55279766);
      }

      if (!var18.method3919((byte)-80)) {
         for (int var45 = var5 >> 1; var45 < var5; var45++) {
            this.field1656[var45] = 0.0F;
         }
      } else {
         int var46 = var5 >> 1;
         int var48 = var5 >> 2;
         int var51 = var5 >> 3;
         float[] var23 = this.field1656;

         for (int var24 = 0; var24 < var46; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var56 = var46; var56 < var5; var56++) {
            var23[var56] = -var23[var5 - var56 - 1];
         }

         float[] var57 = var4 ? field1652 : field1654;
         float[] var25 = var4 ? field1653 : field1655;
         float[] var26 = var4 ? field1650 : field1651;
         int[] var27 = var4 ? field1659 : field1657;

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

         int var59 = class39.iLog(var5 - 1, -1822165549);

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
            this.field1656[var71] = this.field1656[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
         }

         for (int var72 = var12; var72 < var13; var72++) {
            float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
            this.field1656[var72] = this.field1656[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
         }
      }

      float[] var47 = null;
      if (this.field1643 > 0) {
         int var49 = this.field1643 + var5 >> 2;
         var47 = new float[var49];
         if (!this.field1647) {
            for (int var52 = 0; var52 < this.field1644; var52++) {
               int var54 = (this.field1643 >> 1) + var52;
               var47[var52] += this.field1649[var54];
            }
         }

         if (var18.method3919((byte)-50)) {
            for (int var53 = var9; var53 < var5 >> 1; var53++) {
               int var55 = var47.length - (var5 >> 1) + var53;
               var47[var55] += this.field1656[var53];
            }
         }
      }

      float[] var50 = this.field1649;
      this.field1649 = this.field1656;
      this.field1656 = var50;
      this.field1643 = var5;
      this.field1644 = var13 - (var5 >> 1);
      this.field1647 = !var18.method3919((byte)-127);
      return var47;
   }

   @ObfuscatedSignature(descriptor = "(Ler;[I)Ldq;")
   @ObfuscatedName("nq")
   public static RawSound method3854(VorbisSample var0, int[] var1) {
      if (var0 == null) {
         var0.toRawSound(var1);
      }

      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (var0.samples == null) {
            var0.field1643 = 0;
            var0.field1649 = new float[field1642];
            var0.samples = new short[var0.sampleCount];
            var0.field1646 = 0;
            var0.field1645 = 0;
         }

         for (; var0.field1645 < var0.field1666.length; var0.field1645++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = var0.method3848(var0.field1645);
            if (var2 != null) {
               int var3 = var0.field1646;
               int var4 = var2.length;
               if (var4 > var0.sampleCount - var3) {
                  var4 = var0.sampleCount - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  var0.samples[var3++] = (short)classSF.method10160(-32768, 32767, (int)(var2[var5] * 32768.0F), -19618711);
               }

               if (var1 != null) {
                  var1[0] -= var3 - var0.field1646;
               }

               var0.field1646 = var3;
            }
         }

         var0.field1649 = null;
         short[] var6 = var0.samples;
         var0.samples = null;
         return new RawSound(var0.sampleRate, var6, var0.start, var0.end, var0.field1648, false);
      }
   }

   @ObfuscatedSignature(descriptor = "([I)Ldq;")
   @ObfuscatedName("aa")
   RawSound method3855(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.samples == null) {
            this.field1643 = 0;
            this.field1649 = new float[field1642];
            this.samples = new short[this.sampleCount];
            this.field1646 = 0;
            this.field1645 = 0;
         }

         for (; this.field1645 < this.field1666.length; this.field1645++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method3848(this.field1645);
            if (var2 != null) {
               int var3 = this.field1646;
               int var4 = var2.length;
               if (var4 > this.sampleCount - var3) {
                  var4 = this.sampleCount - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  this.samples[var3++] = (short)classSF.method10160(-32768, 32767, (int)(var2[var5] * 32768.0F), -19618711);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field1646;
               }

               this.field1646 = var3;
            }
         }

         this.field1649 = null;
         short[] var6 = this.samples;
         this.samples = null;
         return new RawSound(this.sampleRate, var6, this.start, this.end, this.field1648, false);
      }
   }

   @ObfuscatedSignature(descriptor = "([I)Ldq;")
   @ObfuscatedName("ak")
   RawSound toRawSound(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.samples == null) {
            this.field1645 = 0;
            this.field1649 = new float[field1642];
            this.samples = new short[this.start];
            this.end = 0;
            this.sampleCount = 0;
         }

         for (; this.field1645 < this.field1666.length; this.sampleRate = this.end + 1) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method3849(this.sampleCount);
            if (var2 != null) {
               int var3 = this.field1644;
               int var4 = var2.length;
               if (var4 > this.end - var3) {
                  var4 = this.end - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  this.samples[var3++] = (short)classSF.method10160(-32768, 32767, (int)(var2[var5] * 32768.0F), -19618711);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.end;
               }

               this.field1644 = var3;
            }
         }

         this.field1649 = null;
         short[] var6 = this.samples;
         this.samples = null;
         return new RawSound(this.field1646, var6, this.end, this.end, this.field1647, false);
      }
   }
}
