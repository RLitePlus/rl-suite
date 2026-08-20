import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nr")
public class classNR extends Node {
   @ObfuscatedName("af")
   int field4710;
   @ObfuscatedSignature(descriptor = "[Lny;")
   @ObfuscatedName("ax")
   classNY[] field4713;
   @ObfuscatedSignature(descriptor = "[Lau;")
   @ObfuscatedName("ae")
   classAU[] field4706;
   @ObfuscatedName("ab")
   short[] field4707;
   @ObfuscatedName("as")
   byte[] field4708;
   @ObfuscatedName("ac")
   byte[] field4709;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4712 = 8;
   @ObfuscatedName("ag")
   byte[] field4711;
   @ObfuscatedName("aa")
   ArrayList field4715 = new ArrayList(8);
   @ObfuscatedName("ao")
   int[] field4714;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method7991() {
      this.field4714 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lat;Ljava/util/BitSet;I)Z")
   @ObfuscatedName("af")
   boolean method7989(classAT var1, BitSet var2, int var3) {
      try {
         boolean var4 = true;
         int var5 = 0;
         classAU var6 = new classAU();
         int var7 = var2.nextSetBit(0);

         while (var7 != -1) {
            if (var3 <= 1566637176) {
               throw new IllegalStateException();
            }

            int var8 = var2.nextClearBit(var7);

            for (int var9 = var7; var9 < var8; var9++) {
               if (var3 <= 1566637176) {
                  throw new IllegalStateException();
               }

               if (var2.get(var9)) {
                  if (var3 <= 1566637176) {
                     throw new IllegalStateException();
                  }

                  int var10 = this.field4714[var9];
                  if (var10 != 0) {
                     if (var3 <= 1566637176) {
                        throw new IllegalStateException();
                     }

                     if (var5 != var10) {
                        var5 = var10--;
                        if (0 == (var10 & 1)) {
                           var6 = new classAU(var1.method684(var10 >> 2, (byte)55));
                        } else {
                           var6 = var1.method678(var10 >> 2, (byte)64);
                        }

                        if (var6.method696(918580135)) {
                           if (var3 <= 1566637176) {
                              throw new IllegalStateException();
                           }

                           var4 = false;
                        } else {
                           this.field4715.add(this.field4715.size(), var6);
                        }
                     }

                     if (!var6.method696(918580135)) {
                        this.field4706[var9] = var6;
                        this.field4714[var9] = 0;
                     }
                  }
               }
            }

            var7 = var2.nextSetBit(var8);
         }

         return var4;
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "nr.af(" + ')');
      }
   }

   classNR(byte[] var1) {
      this.field4706 = new classAU[128];
      this.field4707 = new short[128];
      this.field4708 = new byte[128];
      this.field4709 = new byte[128];
      this.field4713 = new classNY[128];
      this.field4711 = new byte[128];
      this.field4714 = new int[128];
      Buffer var2 = new Buffer(var1);
      int var3 = 0;

      while (0 != var2.array[702114061 * var2.offset + var3]) {
         var3++;
      }

      byte[] var4 = new byte[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = Buffer.method13043(var2, (byte)17);
      }

      var2.offset += -1095856699;
      var3++;
      int var39 = var2.offset * 702114061;
      var2.offset += -1095856699 * var3;
      int var6 = 0;

      while (0 != var2.array[702114061 * var2.offset + var6]) {
         var6++;
      }

      byte[] var7 = new byte[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Buffer.method13043(var2, (byte)17);
      }

      var2.offset += -1095856699;
      var6++;
      int var41 = var2.offset * 702114061;
      var2.offset += -1095856699 * var6;
      int var9 = 0;

      while (0 != var2.array[var9 + 702114061 * var2.offset]) {
         var9++;
      }

      byte[] var10 = new byte[var9];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Buffer.method13043(var2, (byte)17);
      }

      var2.offset += -1095856699;
      byte[] var43 = new byte[++var9];
      int var12;
      if (var9 > 1) {
         var43[1] = 1;
         int var13 = 1;
         var12 = 2;

         for (int var14 = 2; var14 < var9; var14++) {
            int var15 = Buffer.method13039(var2, -346779531);
            if (var15 == 0) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  var15--;
               }

               var13 = var15;
            }

            var43[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      classNY[] var44 = new classNY[var12];

      for (int var45 = 0; var45 < var44.length; var45++) {
         classNY var48 = var44[var45] = new classNY();
         int var16 = Buffer.method13039(var2, -346779531);
         if (var16 > 0) {
            var48.field4798 = new byte[2 * var16];
         }

         var16 = Buffer.method13039(var2, -346779531);
         if (var16 > 0) {
            var48.field4799 = new byte[2 * var16 + 2];
            var48.field4799[1] = 64;
         }
      }

      int var46 = Buffer.method13039(var2, -346779531);
      byte[] var49 = var46 > 0 ? new byte[2 * var46] : null;
      var46 = Buffer.method13039(var2, -346779531);
      byte[] var52 = var46 > 0 ? new byte[var46 * 2] : null;
      int var17 = 0;

      while (0 != var2.array[var17 + 702114061 * var2.offset]) {
         var17++;
      }

      byte[] var18 = new byte[var17];

      for (int var19 = 0; var19 < var17; var19++) {
         var18[var19] = Buffer.method13043(var2, (byte)17);
      }

      var2.offset += -1095856699;
      var17++;
      int var55 = 0;

      for (int var20 = 0; var20 < 128; var20++) {
         var55 += Buffer.method13039(var2, -346779531);
         this.field4707[var20] = (short)var55;
      }

      var55 = 0;

      for (int var61 = 0; var61 < 128; var61++) {
         var55 += Buffer.method13039(var2, -346779531);
         this.field4707[var61] = (short)(this.field4707[var61] + (var55 << 8));
      }

      int var62 = 0;
      int var21 = 0;
      int var22 = 0;

      for (int var23 = 0; var23 < 128; var23++) {
         if (0 == var62) {
            if (var21 < var18.length) {
               var62 = var18[var21++];
            } else {
               var62 = -1;
            }

            var22 = var2.method13116(-2063817879);
         }

         this.field4707[var23] = (short)(this.field4707[var23] + ((var22 - 1 & 2) << 14));
         this.field4714[var23] = var22;
         var62--;
      }

      var62 = 0;
      var21 = 0;
      int var71 = 0;

      for (int var24 = 0; var24 < 128; var24++) {
         if (0 != this.field4714[var24]) {
            if (0 == var62) {
               if (var21 < var4.length) {
                  var62 = var4[var21++];
               } else {
                  var62 = -1;
               }

               var71 = var2.array[var39++] - 1;
            }

            this.field4711[var24] = (byte)var71;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      int var72 = 0;

      for (int var25 = 0; var25 < 128; var25++) {
         if (0 != this.field4714[var25]) {
            if (var62 == 0) {
               if (var21 < var7.length) {
                  var62 = var7[var21++];
               } else {
                  var62 = -1;
               }

               var72 = var2.array[var41++] + 16 << 2;
            }

            this.field4709[var25] = (byte)var72;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      classNY var73 = null;

      for (int var26 = 0; var26 < 128; var26++) {
         if (this.field4714[var26] != 0) {
            if (0 == var62) {
               var73 = var44[var43[var21]];
               if (var21 < var10.length) {
                  var62 = var10[var21++];
               } else {
                  var62 = -1;
               }
            }

            this.field4713[var26] = var73;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      int var74 = 0;

      for (int var27 = 0; var27 < 128; var27++) {
         if (var62 == 0) {
            if (var21 < var18.length) {
               var62 = var18[var21++];
            } else {
               var62 = -1;
            }

            if (this.field4714[var27] > 0) {
               var74 = Buffer.method13039(var2, -346779531) + 1;
            }
         }

         this.field4708[var27] = (byte)var74;
         var62--;
      }

      this.field4710 = (Buffer.method13039(var2, -346779531) + 1) * -1318668967;

      for (int var75 = 0; var75 < var12; var75++) {
         classNY var28 = var44[var75];
         if (var28.field4798 != null) {
            for (byte var29 = 1; var29 < var28.field4798.length; var29 += 2) {
               var28.field4798[var29] = Buffer.method13043(var2, (byte)17);
            }
         }

         if (null != var28.field4799) {
            for (byte var96 = 3; var96 < var28.field4799.length - 2; var96 += 2) {
               var28.field4799[var96] = Buffer.method13043(var2, (byte)17);
            }
         }
      }

      if (null != var49) {
         for (byte var76 = 1; var76 < var49.length; var76 += 2) {
            var49[var76] = Buffer.method13043(var2, (byte)17);
         }
      }

      if (var52 != null) {
         for (byte var77 = 1; var77 < var52.length; var77 += 2) {
            var52[var77] = Buffer.method13043(var2, (byte)17);
         }
      }

      for (int var78 = 0; var78 < var12; var78++) {
         classNY var89 = var44[var78];
         if (var89.field4799 != null) {
            var55 = 0;

            for (byte var97 = 2; var97 < var89.field4799.length; var97 += 2) {
               var55 = 1 + var55 + Buffer.method13039(var2, -346779531);
               var89.field4799[var97] = (byte)var55;
            }
         }
      }

      for (int var79 = 0; var79 < var12; var79++) {
         classNY var90 = var44[var79];
         if (null != var90.field4798) {
            var55 = 0;

            for (byte var98 = 2; var98 < var90.field4798.length; var98 += 2) {
               var55 = 1 + var55 + Buffer.method13039(var2, -346779531);
               var90.field4798[var98] = (byte)var55;
            }
         }
      }

      if (null != var49) {
         var55 = Buffer.method13039(var2, -346779531);
         var49[0] = (byte)var55;

         for (byte var80 = 2; var80 < var49.length; var80 += 2) {
            var55 = 1 + var55 + Buffer.method13039(var2, -346779531);
            var49[var80] = (byte)var55;
         }

         byte var81 = var49[0];
         byte var91 = var49[1];

         for (int var99 = 0; var99 < var81; var99++) {
            this.field4708[var99] = (byte)(this.field4708[var99] * var91 + 32 >> 6);
         }

         for (byte var100 = 2; var100 < var49.length; var100 += 2) {
            byte var30 = var49[var100];
            byte var31 = var49[var100 + 1];
            int var32 = var91 * (var30 - var81) + (var30 - var81) / 2;

            for (int var33 = var81; var33 < var30; var33++) {
               int var35 = var30 - var81;
               int var36 = var32 >>> 31;
               int var34 = (var32 + var36) / var35 - var36;
               this.field4708[var33] = (byte)(32 + this.field4708[var33] * var34 >> 6);
               var32 += var31 - var91;
            }

            var81 = var30;
            var91 = var31;
         }

         for (int var103 = var81; var103 < 128; var103++) {
            this.field4708[var103] = (byte)(32 + this.field4708[var103] * var91 >> 6);
         }

         var49 = null;
      }

      if (null != var52) {
         var55 = Buffer.method13039(var2, -346779531);
         var52[0] = (byte)var55;

         for (byte var82 = 2; var82 < var52.length; var82 += 2) {
            var55 = 1 + var55 + Buffer.method13039(var2, -346779531);
            var52[var82] = (byte)var55;
         }

         byte var83 = var52[0];
         int var92 = var52[1] << 1;

         for (int var101 = 0; var101 < var83; var101++) {
            int var104 = var92 + (this.field4709[var101] & 255);
            if (var104 < 0) {
               var104 = 0;
            }

            if (var104 > 128) {
               var104 = 128;
            }

            this.field4709[var101] = (byte)var104;
         }

         for (byte var102 = 2; var102 < var52.length; var102 += 2) {
            byte var105 = var52[var102];
            int var107 = var52[1 + var102] << 1;
            int var109 = (var105 - var83) / 2 + var92 * (var105 - var83);

            for (int var110 = var83; var110 < var105; var110++) {
               int var112 = var105 - var83;
               int var113 = var109 >>> 31;
               int var111 = (var113 + var109) / var112 - var113;
               int var37 = var111 + (this.field4709[var110] & 255);
               if (var37 < 0) {
                  var37 = 0;
               }

               if (var37 > 128) {
                  var37 = 128;
               }

               this.field4709[var110] = (byte)var37;
               var109 += var107 - var92;
            }

            var83 = var105;
            var92 = var107;
         }

         for (int var106 = var83; var106 < 128; var106++) {
            int var108 = (this.field4709[var106] & 255) + var92;
            if (var108 < 0) {
               var108 = 0;
            }

            if (var108 > 128) {
               var108 = 128;
            }

            this.field4709[var106] = (byte)var108;
         }

         var52 = null;
      }

      for (int var84 = 0; var84 < var12; var84++) {
         var44[var84].field4793 = Buffer.method13039(var2, -346779531) * -1264008049;
      }

      for (int var85 = 0; var85 < var12; var85++) {
         classNY var93 = var44[var85];
         if (null != var93.field4798) {
            var93.field4791 = Buffer.method13039(var2, -346779531) * -875309257;
         }

         if (var93.field4799 != null) {
            var93.field4794 = Buffer.method13039(var2, -346779531) * 1090002817;
         }

         if (-939533713 * var93.field4793 > 0) {
            var93.field4795 = Buffer.method13039(var2, -346779531) * -247497773;
         }
      }

      for (int var86 = 0; var86 < var12; var86++) {
         var44[var86].field4792 = Buffer.method13039(var2, -346779531) * -210418761;
      }

      for (int var87 = 0; var87 < var12; var87++) {
         classNY var94 = var44[var87];
         if (-771094009 * var94.field4792 > 0) {
            var94.field4796 = Buffer.method13039(var2, -346779531) * -906938583;
         }
      }

      for (int var88 = 0; var88 < var12; var88++) {
         classNY var95 = var44[var88];
         if (var95.field4796 * -1472637671 > 0) {
            var95.field4790 = Buffer.method13039(var2, -346779531) * -636622149;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lus;I[BIZ)Z")
   @ObfuscatedName("bq")
   public static boolean method7986(classUS var0, int var1, byte[] var2, int var3, boolean var4) {
      synchronized (var0.field6376) {
         boolean var20;
         try {
            int var6;
            if (var4) {
               if (var0.field6379.method139(96767306) < 6 + 6 * var1) {
                  return false;
               }

               var0.field6379.method138(6 * var1);
               classAAC.method147(var0.field6379, classUS.field6375, 0, 6, (byte)-98);
               var6 = ((classUS.field6375[3] & -12224455) << 16) + ((classUS.field6375[4] & 255) << 8) + (classUS.field6375[5] & 255);
               if (var6 <= 0 || var6 > var0.field6376.method139(-1809076523) / 520L) {
                  return false;
               }
            } else {
               var0.field6376.method160(409402898);
               var6 = (int)((var0.field6376.method141(-1845311234).length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for (int var9 = var6; var7 < var3; var8++) {
               int var10 = 0;
               if (var4) {
                  var0.field6376.method138(520L * var9);
                  int var11;
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     classAAC.method147(var0.field6376, classUS.field6375, 0, 10, (byte)-114);
                     var11 = (classUS.field6375[3] & 255)
                        + ((classUS.field6375[0] & 255) << 24)
                        + ((classUS.field6375[1] & 255) << 16)
                        + ((classUS.field6375[2] & 91968402) << 8);
                     var12 = (classUS.field6375[5] & 255) + ((classUS.field6375[4] & -887533093) << 8);
                     var10 = ((classUS.field6375[6] & 2022121275) << 16) + ((classUS.field6375[7] & 255) << 8) + (classUS.field6375[8] & 255);
                     var13 = classUS.field6375[9] & 255;
                  } else {
                     classAAC.method147(var0.field6376, classUS.field6375, 0, 8, (byte)86);
                     var11 = (classUS.field6375[1] & 255) + ((classUS.field6375[0] & 255) << 8);
                     var12 = (classUS.field6375[3] & 255) + ((classUS.field6375[2] & -1858795461) << 8);
                     var10 = (classUS.field6375[6] & 255) + ((classUS.field6375[4] & -200731790) << 16) + ((classUS.field6375[5] & -506063565) << 8);
                     var13 = classUS.field6375[7] & 255;
                  }

                  if (var1 != var11 || var8 != var12 || -537923631 * var0.field6378 != var13) {
                     return false;
                  }

                  if (var10 < 0 || var10 > var0.field6376.method139(-1956573818) / 520L) {
                     return false;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  var0.field6376.method160(1901021209);
                  var10 = (int)((var0.field6376.method141(-946183387).length() + 519L) / 520L);
                  if (0 == var10) {
                     var10++;
                  }

                  if (var9 == var10) {
                     var10++;
                  }
               }

               if (var1 > -637102189) {
                  if (var3 - var7 <= 510) {
                     var10 = 0;
                  }

                  classUS.field6375[0] = (byte)(var1 >> 24);
                  classUS.field6375[1] = (byte)(var1 >> 16);
                  classUS.field6375[2] = (byte)(var1 >> 8);
                  classUS.field6375[3] = (byte)var1;
                  classUS.field6375[4] = (byte)(var8 >> 8);
                  classUS.field6375[5] = (byte)var8;
                  classUS.field6375[6] = (byte)(var10 >> 16);
                  classUS.field6375[7] = (byte)(var10 >> 8);
                  classUS.field6375[8] = (byte)var10;
                  classUS.field6375[9] = (byte)(-516579491 * var0.field6378);
                  var0.field6376.method138(var9 * 520L);
                  var0.field6376.method153(classUS.field6375, 0, 10, 242976139);
                  int var17 = var3 - var7;
                  if (var17 > 510) {
                     var17 = -1064950520;
                  }

                  var0.field6376.method153(var2, var7, var17, -1986811978);
                  var7 += var17;
               } else {
                  if (var3 - var7 <= 512) {
                     var10 = 0;
                  }

                  classUS.field6375[0] = (byte)(var1 >> 8);
                  classUS.field6375[1] = (byte)var1;
                  classUS.field6375[2] = (byte)(var8 >> 8);
                  classUS.field6375[3] = (byte)var8;
                  classUS.field6375[4] = (byte)(var10 >> 16);
                  classUS.field6375[5] = (byte)(var10 >> 8);
                  classUS.field6375[6] = (byte)var10;
                  classUS.field6375[7] = (byte)(-297199316 * var0.field6378);
                  var0.field6376.method138(var9 * 520L);
                  var0.field6376.method153(classUS.field6375, 0, 8, -1808198814);
                  int var18 = var3 - var7;
                  if (var18 > 512) {
                     var18 = 616170112;
                  }

                  var0.field6376.method153(var2, var7, var18, -789403442);
                  var7 += var18;
               }

               var9 = var10;
            }

            classUS.field6375[0] = (byte)(var3 >> 16);
            classUS.field6375[1] = (byte)(var3 >> 8);
            classUS.field6375[2] = (byte)var3;
            classUS.field6375[3] = (byte)(var6 >> 16);
            classUS.field6375[4] = (byte)(var6 >> 8);
            classUS.field6375[5] = (byte)var6;
            var0.field6379.method138(6 * var1);
            var0.field6379.method153(classUS.field6375, 0, 6, -1135503718);
            var20 = true;
         } catch (IOException var15) {
            return false;
         }

         return var20;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lat;Ljava/util/BitSet;)Z")
   @ObfuscatedName("as")
   boolean method7990(classAT var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      classAU var5 = new classAU();
      int var6 = var2.nextSetBit(0);

      while (var6 != -1) {
         int var7 = var2.nextClearBit(var6);

         for (int var8 = var6; var8 < var7; var8++) {
            if (var2.get(var8)) {
               int var9 = this.field4714[var8];
               if (var9 != 0) {
                  if (var4 != var9) {
                     var4 = var9--;
                     if (0 == (var9 & 1)) {
                        var5 = new classAU(var1.method684(var9 >> 2, (byte)62));
                     } else {
                        var5 = var1.method678(var9 >> 2, (byte)44);
                     }

                     if (var5.method696(918580135)) {
                        var3 = false;
                     } else {
                        this.field4715.add(this.field4715.size(), var5);
                     }
                  }

                  if (!var5.method696(918580135)) {
                     this.field4706[var8] = var5;
                     this.field4714[var8] = 0;
                  }
               }
            }
         }

         var6 = var2.nextSetBit(var7);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Lnr;")
   @ObfuscatedName("ag")
   static classNR method7987(AbstractArchive var0, int var1) {
      byte[] var2 = AbstractArchive.method11814(var0, var1, 1879018076);
      return null == var2 ? null : new classNR(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Lnr;")
   @ObfuscatedName("ab")
   static classNR method7988(AbstractArchive var0, int var1) {
      byte[] var2 = AbstractArchive.method11814(var0, var1, 229663212);
      return null == var2 ? null : new classNR(var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method7992() {
      this.field4714 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method7993() {
      this.field4714 = null;
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("af")
   public static boolean method7985(char var0, int var1) {
      try {
         if (var0 > 0) {
            if (var1 == -461268180) {
               throw new IllegalStateException();
            }

            if (var0 < 128) {
               return true;
            }

            if (var1 == -461268180) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 == -461268180) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               return true;
            }
         }

         if (var0 != 0) {
            if (var1 == -461268180) {
               throw new IllegalStateException();
            }

            char[] var2 = classOH.field4869;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 == -461268180) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var0 == var4) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "nr.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnr;B)V")
   @ObfuscatedName("dv")
   public static void method7994(classNR var0, byte var1) {
      if (var0 == null) {
         var0.method7995(var1);
      } else {
         try {
            var0.field4714 = null;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "nr.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void method7995(byte var1) {
      try {
         this.field4714 = null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nr.ae(" + ')');
      }
   }
}
