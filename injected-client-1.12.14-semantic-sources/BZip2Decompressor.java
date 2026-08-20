import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xi")
public final class BZip2Decompressor {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field6542 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6545 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6546 = 4096;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6541 = 23;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field6544 = 0;
   @ObfuscatedSignature(descriptor = "Lxh;")
   @ObfuscatedName("aw")
   static BZip2State BZip2Decompressor_state = new BZip2State();
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6543 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6540 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("as")
   static void method12286(BZip2State var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.blockSize100k = 833482797;
      if (BZip2State.BZip2Decompressor_block == null) {
         BZip2State.BZip2Decompressor_block = new int[var0.blockSize100k * 736175392];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = BZip2Decompressor_readNextByte(var0);
         if (var1 == 23) {
            return;
         }

         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextBit(var0);
         if (var1 != 0) {
         }

         var0.originalPointer = 0;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = BZip2Decompressor_readNextBit(var0);
            if (var1 == 1) {
               var0.inUse16[var56] = true;
            } else {
               var0.inUse16[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.inUse[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.inUse16[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 1) {
                     var0.inUse[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         makeMaps(var0);
         var7 = var0.nInUse * 1542765527 + 2;
         var8 = BZip2Decompressor_readBits(3, var0);
         var9 = BZip2Decompressor_readBits(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = BZip2Decompressor_readNextBit(var0);
               if (var1 == 0) {
                  var0.ll8[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.ll8[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.seqToUnseq[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = BZip2Decompressor_readBits(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var0.temp_charArray2d[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.temp_charArray2d[var70][var62] > var3) {
                  var3 = var0.temp_charArray2d[var70][var62];
               }

               if (var0.temp_charArray2d[var70][var62] < var2) {
                  var2 = var0.temp_charArray2d[var70][var62];
               }
            }

            BZip2Decompressor_createHuffmanTables(var0.limit[var70], var0.base[var70], var0.perm[var70], var0.temp_charArray2d[var70], var2, var3, var7);
            var0.minLens[var70] = var2;
         }

         var10 = var0.nInUse * 1542765527 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.unzftab[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.selector[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.getAndMoveToFrontDecode_yy[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.seqToUnseq[var11];
            var22 = var0.minLens[var21];
            var23 = var0.limit[var21];
            var25 = var0.perm[var21];
            var24 = var0.base[var21];
         }

         var12--;
         var18 = var22;
         var19 = BZip2Decompressor_readBits(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = BZip2Decompressor_readNextBit(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.getAndMoveToFrontDecode_yy[0];

                  for (var1 = var0.selector[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.selector[var34] = var0.selector[var34 - 1];
                     var0.selector[var34 - 1] = var0.selector[var34 - 2];
                     var0.selector[var34 - 2] = var0.selector[var34 - 3];
                     var0.selector[var34 - 3] = var0.selector[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.selector[var103 + var33] = var0.selector[var103 + var33 - 1];
                     var33--;
                  }

                  var0.selector[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.getAndMoveToFrontDecode_yy[var31] + var32;

                  for (var1 = var0.selector[var30]; var30 > var0.getAndMoveToFrontDecode_yy[var31]; var30--) {
                     var0.selector[var30] = var0.selector[var30 - 1];
                  }

                  var0.getAndMoveToFrontDecode_yy[var31]++;

                  while (var31 > 0) {
                     var0.getAndMoveToFrontDecode_yy[var31]--;
                     var0.selector[var0.getAndMoveToFrontDecode_yy[var31]] = var0.selector[var0.getAndMoveToFrontDecode_yy[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.getAndMoveToFrontDecode_yy[0]--;
                  var0.selector[var0.getAndMoveToFrontDecode_yy[0]] = var1;
                  if (var0.getAndMoveToFrontDecode_yy[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.selector[var29] = var0.selector[var0.getAndMoveToFrontDecode_yy[var97] + var99];
                           var29--;
                        }

                        var0.getAndMoveToFrontDecode_yy[var97] = var29 + 1;
                     }
                  }
               }

               var0.unzftab[var0.inputArray[var1 & 255] & 255]++;
               BZip2State.BZip2Decompressor_block[var14] = var0.inputArray[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.seqToUnseq[var11];
                  var22 = var0.minLens[var21];
                  var23 = var0.limit[var21];
                  var25 = var0.perm[var21];
                  var24 = var0.base[var21];
               }

               var12--;
               var18 = var22;
               var19 = BZip2Decompressor_readBits(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = BZip2Decompressor_readNextBit(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.seqToUnseq[var11];
                     var22 = var0.minLens[var21];
                     var23 = var0.limit[var21];
                     var25 = var0.perm[var21];
                     var24 = var0.base[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = BZip2Decompressor_readBits(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = BZip2Decompressor_readNextBit(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.inputArray[var0.selector[var0.getAndMoveToFrontDecode_yy[0]] & 255];

               for (var0.unzftab[var1 & 255] = var0.unzftab[var1 & 255] + var15; var15 > 0; var15--) {
                  BZip2State.BZip2Decompressor_block[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.su_rNToGo = 0;
         var0.out_char = 0;
         var0.cftab[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.cftab[var64] = var0.unzftab[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.cftab[var65] = var0.cftab[var65] + var0.cftab[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(BZip2State.BZip2Decompressor_block[var66] & 0xFF);
            BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] = BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] | var66 << 8;
            var0.cftab[var1 & 255]++;
         }

         var0.field6526 = (BZip2State.BZip2Decompressor_block[var0.originalPointer * -1770922585] >> 8) * -1057687425;
         var0.nblocks_used = 0;
         var0.field6526 = BZip2State.BZip2Decompressor_block[var0.field6526 * 1873987455] * -1057687425;
         var0.su_ch2 = (byte)(var0.field6526 * 1873987455 & 0xFF) * 824015257;
         var0.field6526 = (var0.field6526 * 1873987455 >> 8) * -1057687425;
         var0.nblocks_used += -1096057335;
         var0.field6533 = var14 * 1670578731;
         method12283(var0);
         if (var0.nblocks_used * 981823545 == var0.field6533 * 1735634051 + 1 && var0.su_rNToGo * -433006017 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("av")
   public static int BZip2Decompressor_decompress(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (BZip2Decompressor_state) {
         BZip2Decompressor_state.outputArray = var2;
         BZip2Decompressor_state.nextByte = var4 * 965497391;
         BZip2Decompressor_state.selectorMtf = var0;
         BZip2Decompressor_state.next_out = 0;
         BZip2Decompressor_state.outputLength = var1 * 584807589;
         BZip2Decompressor_state.bsLive = 0;
         BZip2Decompressor_state.bsBuff = 0;
         BZip2Decompressor_state.nextBit_unused = 0;
         BZip2Decompressor_state.field6522 = 0;
         BZip2Decompressor_decompress(BZip2Decompressor_state);
         var1 -= BZip2Decompressor_state.outputLength * -1270918355;
         BZip2Decompressor_state.outputArray = null;
         BZip2Decompressor_state.selectorMtf = null;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("at")
   static void method12283(BZip2State var0) {
      byte var2 = var0.out_char;
      int var3 = var0.su_rNToGo * -433006017;
      int var4 = var0.nblocks_used * 981823545;
      int var5 = var0.su_ch2 * -849818967;
      int[] var6 = BZip2State.BZip2Decompressor_block;
      int var7 = var0.field6526 * 1873987455;
      byte[] var8 = var0.selectorMtf;
      int var9 = var0.next_out * -702324125;
      int var10 = var0.outputLength * -1270918355;
      int var11 = var10;
      int var12 = var0.field6533 * 1735634051 + 1;

      label111:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label111;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label111;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label111;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label111;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label111;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field6522 * 1116340389;
      var0.field6522 += (var11 - var10) * 20309805;
      if (var0.field6522 * 1116340389 < var13) {
      }

      var0.out_char = var2;
      var0.su_rNToGo = var3 * 450500031;
      var0.nblocks_used = var4 * -1096057335;
      var0.su_ch2 = var5 * 824015257;
      BZip2State.BZip2Decompressor_block = var6;
      var0.field6526 = var7 * -1057687425;
      var0.selectorMtf = var8;
      var0.next_out = var9 * 1690709835;
      var0.outputLength = var10 * 584807589;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsz;)Z")
   @ObfuscatedName("fm")
   public static boolean method12278(SongTask var0) {
      return var0.field5883;
   }

   @ObfuscatedSignature(descriptor = "(Lxh;)B")
   @ObfuscatedName("an")
   static byte BZip2Decompressor_readNextByte(BZip2State var0) {
      return (byte)BZip2Decompressor_readBits(8, var0);
   }

   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ag")
   static void BZip2Decompressor_decompress(BZip2State var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.blockSize100k = 833482797;
      if (BZip2State.BZip2Decompressor_block == null) {
         BZip2State.BZip2Decompressor_block = new int[var0.blockSize100k * 736175392];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = BZip2Decompressor_readNextByte(var0);
         if (var1 == 23) {
            return;
         }

         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextBit(var0);
         if (var1 != 0) {
         }

         var0.originalPointer = 0;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = BZip2Decompressor_readNextBit(var0);
            if (var1 == 1) {
               var0.inUse16[var56] = true;
            } else {
               var0.inUse16[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.inUse[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.inUse16[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 1) {
                     var0.inUse[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         makeMaps(var0);
         var7 = var0.nInUse * 1542765527 + 2;
         var8 = BZip2Decompressor_readBits(3, var0);
         var9 = BZip2Decompressor_readBits(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = BZip2Decompressor_readNextBit(var0);
               if (var1 == 0) {
                  var0.ll8[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.ll8[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.seqToUnseq[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = BZip2Decompressor_readBits(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var0.temp_charArray2d[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.temp_charArray2d[var70][var62] > var3) {
                  var3 = var0.temp_charArray2d[var70][var62];
               }

               if (var0.temp_charArray2d[var70][var62] < var2) {
                  var2 = var0.temp_charArray2d[var70][var62];
               }
            }

            BZip2Decompressor_createHuffmanTables(var0.limit[var70], var0.base[var70], var0.perm[var70], var0.temp_charArray2d[var70], var2, var3, var7);
            var0.minLens[var70] = var2;
         }

         var10 = var0.nInUse * 1542765527 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.unzftab[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.selector[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.getAndMoveToFrontDecode_yy[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.seqToUnseq[var11];
            var22 = var0.minLens[var21];
            var23 = var0.limit[var21];
            var25 = var0.perm[var21];
            var24 = var0.base[var21];
         }

         var12--;
         var18 = var22;
         var19 = BZip2Decompressor_readBits(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = BZip2Decompressor_readNextBit(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.getAndMoveToFrontDecode_yy[0];

                  for (var1 = var0.selector[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.selector[var34] = var0.selector[var34 - 1];
                     var0.selector[var34 - 1] = var0.selector[var34 - 2];
                     var0.selector[var34 - 2] = var0.selector[var34 - 3];
                     var0.selector[var34 - 3] = var0.selector[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.selector[var103 + var33] = var0.selector[var103 + var33 - 1];
                     var33--;
                  }

                  var0.selector[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.getAndMoveToFrontDecode_yy[var31] + var32;

                  for (var1 = var0.selector[var30]; var30 > var0.getAndMoveToFrontDecode_yy[var31]; var30--) {
                     var0.selector[var30] = var0.selector[var30 - 1];
                  }

                  var0.getAndMoveToFrontDecode_yy[var31]++;

                  while (var31 > 0) {
                     var0.getAndMoveToFrontDecode_yy[var31]--;
                     var0.selector[var0.getAndMoveToFrontDecode_yy[var31]] = var0.selector[var0.getAndMoveToFrontDecode_yy[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.getAndMoveToFrontDecode_yy[0]--;
                  var0.selector[var0.getAndMoveToFrontDecode_yy[0]] = var1;
                  if (var0.getAndMoveToFrontDecode_yy[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.selector[var29] = var0.selector[var0.getAndMoveToFrontDecode_yy[var97] + var99];
                           var29--;
                        }

                        var0.getAndMoveToFrontDecode_yy[var97] = var29 + 1;
                     }
                  }
               }

               var0.unzftab[var0.inputArray[var1 & 255] & 255]++;
               BZip2State.BZip2Decompressor_block[var14] = var0.inputArray[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.seqToUnseq[var11];
                  var22 = var0.minLens[var21];
                  var23 = var0.limit[var21];
                  var25 = var0.perm[var21];
                  var24 = var0.base[var21];
               }

               var12--;
               var18 = var22;
               var19 = BZip2Decompressor_readBits(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = BZip2Decompressor_readNextBit(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.seqToUnseq[var11];
                     var22 = var0.minLens[var21];
                     var23 = var0.limit[var21];
                     var25 = var0.perm[var21];
                     var24 = var0.base[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = BZip2Decompressor_readBits(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = BZip2Decompressor_readNextBit(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.inputArray[var0.selector[var0.getAndMoveToFrontDecode_yy[0]] & 255];

               for (var0.unzftab[var1 & 255] = var0.unzftab[var1 & 255] + var15; var15 > 0; var15--) {
                  BZip2State.BZip2Decompressor_block[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.su_rNToGo = 0;
         var0.out_char = 0;
         var0.cftab[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.cftab[var64] = var0.unzftab[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.cftab[var65] = var0.cftab[var65] + var0.cftab[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(BZip2State.BZip2Decompressor_block[var66] & 0xFF);
            BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] = BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] | var66 << 8;
            var0.cftab[var1 & 255]++;
         }

         var0.field6526 = (BZip2State.BZip2Decompressor_block[var0.originalPointer * -1770922585] >> 8) * -1057687425;
         var0.nblocks_used = 0;
         var0.field6526 = BZip2State.BZip2Decompressor_block[var0.field6526 * 1873987455] * -1057687425;
         var0.su_ch2 = (byte)(var0.field6526 * 1873987455 & 0xFF) * 824015257;
         var0.field6526 = (var0.field6526 * 1873987455 >> 8) * -1057687425;
         var0.nblocks_used += -1096057335;
         var0.field6533 = var14 * 1670578731;
         method12283(var0);
         if (var0.nblocks_used * 981823545 == var0.field6533 * 1735634051 + 1 && var0.su_rNToGo * -433006017 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxh;)B")
   @ObfuscatedName("ae")
   static byte BZip2Decompressor_readNextBit(BZip2State var0) {
      return (byte)BZip2Decompressor_readBits(1, var0);
   }

   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ak")
   static void makeMaps(BZip2State var0) {
      var0.nInUse = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.inUse[var1]) {
            var0.inputArray[var0.nInUse * 1542765527] = (byte)var1;
            var0.nInUse += 1799448551;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("aw")
   static void BZip2Decompressor_createHuffmanTables(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   BZip2Decompressor() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ao")
   static void method12300(BZip2State var0) {
      var0.nInUse = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.inUse[var1]) {
            var0.inputArray[var0.nInUse * 1542765527] = (byte)var1;
            var0.nInUse += -633309352;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("ay")
   public static int method12280(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (BZip2Decompressor_state) {
         BZip2Decompressor_state.outputArray = var2;
         BZip2Decompressor_state.nextByte = var4 * 881718413;
         BZip2Decompressor_state.selectorMtf = var0;
         BZip2Decompressor_state.next_out = 0;
         BZip2Decompressor_state.outputLength = var1 * 1182468856;
         BZip2Decompressor_state.bsLive = 0;
         BZip2Decompressor_state.bsBuff = 0;
         BZip2Decompressor_state.nextBit_unused = 0;
         BZip2Decompressor_state.field6522 = 0;
         BZip2Decompressor_decompress(BZip2Decompressor_state);
         var1 -= BZip2Decompressor_state.outputLength * 1718676307;
         BZip2Decompressor_state.outputArray = null;
         BZip2Decompressor_state.selectorMtf = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("au")
   public static int method12281(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (BZip2Decompressor_state) {
         BZip2Decompressor_state.outputArray = var2;
         BZip2Decompressor_state.nextByte = var4 * 965497391;
         BZip2Decompressor_state.selectorMtf = var0;
         BZip2Decompressor_state.next_out = 0;
         BZip2Decompressor_state.outputLength = var1 * -1264100725;
         BZip2Decompressor_state.bsLive = 0;
         BZip2Decompressor_state.bsBuff = 0;
         BZip2Decompressor_state.nextBit_unused = 0;
         BZip2Decompressor_state.field6522 = 0;
         BZip2Decompressor_decompress(BZip2Decompressor_state);
         var1 -= BZip2Decompressor_state.outputLength * -1610242608;
         BZip2Decompressor_state.outputArray = null;
         BZip2Decompressor_state.selectorMtf = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("az")
   static void method12284(BZip2State var0) {
      byte var2 = var0.out_char;
      int var3 = var0.su_rNToGo * -433006017;
      int var4 = var0.nblocks_used * 981823545;
      int var5 = var0.su_ch2 * -849818967;
      int[] var6 = BZip2State.BZip2Decompressor_block;
      int var7 = var0.field6526 * 1873987455;
      byte[] var8 = var0.selectorMtf;
      int var9 = var0.next_out * -702324125;
      int var10 = var0.outputLength * -1270918355;
      int var11 = var10;
      int var12 = var0.field6533 * 1735634051 + 1;

      label110:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label110;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label110;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label110;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field6522 * 1116340389;
      var0.field6522 += (var11 - var10) * 20309805;
      if (var0.field6522 * 1116340389 < var13) {
      }

      var0.out_char = var2;
      var0.su_rNToGo = var3 * 450500031;
      var0.nblocks_used = var4 * -1096057335;
      var0.su_ch2 = var5 * 824015257;
      BZip2State.BZip2Decompressor_block = var6;
      var0.field6526 = var7 * -1057687425;
      var0.selectorMtf = var8;
      var0.next_out = var9 * 1690709835;
      var0.outputLength = var10 * 584807589;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ad")
   static void method12285(BZip2State var0) {
      byte var2 = var0.out_char;
      int var3 = var0.su_rNToGo * -433006017;
      int var4 = var0.nblocks_used * 981823545;
      int var5 = var0.su_ch2 * -849818967;
      int[] var6 = BZip2State.BZip2Decompressor_block;
      int var7 = var0.field6526 * 1873987455;
      byte[] var8 = var0.selectorMtf;
      int var9 = var0.next_out * -702324125;
      int var10 = var0.outputLength * -1270918355;
      int var11 = var10;
      int var12 = var0.field6533 * 1735634051 + 1;

      label110:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label110;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label110;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label110;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field6522 * 1116340389;
      var0.field6522 += (var11 - var10) * 20309805;
      if (var0.field6522 * 1116340389 < var13) {
      }

      var0.out_char = var2;
      var0.su_rNToGo = var3 * 450500031;
      var0.nblocks_used = var4 * -1096057335;
      var0.su_ch2 = var5 * 824015257;
      BZip2State.BZip2Decompressor_block = var6;
      var0.field6526 = var7 * -1057687425;
      var0.selectorMtf = var8;
      var0.next_out = var9 * 1690709835;
      var0.outputLength = var10 * 584807589;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ai")
   static void method12288(BZip2State var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.blockSize100k = 833482797;
      if (BZip2State.BZip2Decompressor_block == null) {
         BZip2State.BZip2Decompressor_block = new int[var0.blockSize100k * 2076190568];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = BZip2Decompressor_readNextByte(var0);
         if (var1 == 23) {
            return;
         }

         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextBit(var0);
         if (var1 != 0) {
         }

         var0.originalPointer = 0;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 1334834830) * 2061902820;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * 1372808489 << 8 | var1 & 1447936830) * -1238304233;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = BZip2Decompressor_readNextBit(var0);
            if (var1 == 1) {
               var0.inUse16[var56] = true;
            } else {
               var0.inUse16[var56] = false;
            }
         }

         for (int var57 = 0; var57 < -181830506; var57++) {
            var0.inUse[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.inUse16[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 1) {
                     var0.inUse[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         makeMaps(var0);
         var7 = var0.nInUse * 1542765527 + 2;
         var8 = BZip2Decompressor_readBits(3, var0);
         var9 = BZip2Decompressor_readBits(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = BZip2Decompressor_readNextBit(var0);
               if (var1 == 0) {
                  var0.ll8[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.ll8[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.seqToUnseq[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = BZip2Decompressor_readBits(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var0.temp_charArray2d[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.temp_charArray2d[var70][var62] > var3) {
                  var3 = var0.temp_charArray2d[var70][var62];
               }

               if (var0.temp_charArray2d[var70][var62] < var2) {
                  var2 = var0.temp_charArray2d[var70][var62];
               }
            }

            BZip2Decompressor_createHuffmanTables(var0.limit[var70], var0.base[var70], var0.perm[var70], var0.temp_charArray2d[var70], var2, var3, var7);
            var0.minLens[var70] = var2;
         }

         var10 = var0.nInUse * 1252333771 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= -199901997; var63++) {
            var0.unzftab[var63] = 0;
         }

         var29 = -1759563666;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.selector[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.getAndMoveToFrontDecode_yy[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.seqToUnseq[var11];
            var22 = var0.minLens[var21];
            var23 = var0.limit[var21];
            var25 = var0.perm[var21];
            var24 = var0.base[var21];
         }

         var12--;
         var18 = var22;
         var19 = BZip2Decompressor_readBits(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = BZip2Decompressor_readNextBit(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.getAndMoveToFrontDecode_yy[0];

                  for (var1 = var0.selector[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.selector[var34] = var0.selector[var34 - 1];
                     var0.selector[var34 - 1] = var0.selector[var34 - 2];
                     var0.selector[var34 - 2] = var0.selector[var34 - 3];
                     var0.selector[var34 - 3] = var0.selector[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.selector[var103 + var33] = var0.selector[var103 + var33 - 1];
                     var33--;
                  }

                  var0.selector[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.getAndMoveToFrontDecode_yy[var31] + var32;

                  for (var1 = var0.selector[var30]; var30 > var0.getAndMoveToFrontDecode_yy[var31]; var30--) {
                     var0.selector[var30] = var0.selector[var30 - 1];
                  }

                  var0.getAndMoveToFrontDecode_yy[var31]++;

                  while (var31 > 0) {
                     var0.getAndMoveToFrontDecode_yy[var31]--;
                     var0.selector[var0.getAndMoveToFrontDecode_yy[var31]] = var0.selector[var0.getAndMoveToFrontDecode_yy[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.getAndMoveToFrontDecode_yy[0]--;
                  var0.selector[var0.getAndMoveToFrontDecode_yy[0]] = var1;
                  if (var0.getAndMoveToFrontDecode_yy[0] == 0) {
                     var29 = -1069436094;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.selector[var29] = var0.selector[var0.getAndMoveToFrontDecode_yy[var97] + var99];
                           var29--;
                        }

                        var0.getAndMoveToFrontDecode_yy[var97] = var29 + 1;
                     }
                  }
               }

               var0.unzftab[var0.inputArray[var1 & 255] & 255]++;
               BZip2State.BZip2Decompressor_block[var14] = var0.inputArray[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.seqToUnseq[var11];
                  var22 = var0.minLens[var21];
                  var23 = var0.limit[var21];
                  var25 = var0.perm[var21];
                  var24 = var0.base[var21];
               }

               var12--;
               var18 = var22;
               var19 = BZip2Decompressor_readBits(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = BZip2Decompressor_readNextBit(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.seqToUnseq[var11];
                     var22 = var0.minLens[var21];
                     var23 = var0.limit[var21];
                     var25 = var0.perm[var21];
                     var24 = var0.base[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = BZip2Decompressor_readBits(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = BZip2Decompressor_readNextBit(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.inputArray[var0.selector[var0.getAndMoveToFrontDecode_yy[0]] & 255];

               for (var0.unzftab[var1 & 1870173423] = var0.unzftab[var1 & 1870173423] + var15; var15 > 0; var15--) {
                  BZip2State.BZip2Decompressor_block[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.su_rNToGo = 0;
         var0.out_char = 0;
         var0.cftab[0] = 0;

         for (int var64 = 1; var64 <= -1223960941; var64++) {
            var0.cftab[var64] = var0.unzftab[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.cftab[var65] = var0.cftab[var65] + var0.cftab[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(BZip2State.BZip2Decompressor_block[var66] & -1799188124);
            BZip2State.BZip2Decompressor_block[var0.cftab[var1 & -1115604096]] = BZip2State.BZip2Decompressor_block[var0.cftab[var1 & -1115604096]]
               | var66 << 8;
            var0.cftab[var1 & 255]++;
         }

         var0.field6526 = (BZip2State.BZip2Decompressor_block[var0.originalPointer * -1770922585] >> 8) * -1057687425;
         var0.nblocks_used = 0;
         var0.field6526 = BZip2State.BZip2Decompressor_block[var0.field6526 * 1197995083] * -1057687425;
         var0.su_ch2 = (byte)(var0.field6526 * 1873987455 & 0xFF) * 824015257;
         var0.field6526 = (var0.field6526 * 1873987455 >> 8) * -1057687425;
         var0.nblocks_used += 1860042216;
         var0.field6533 = var14 * 1125117939;
         method12283(var0);
         if (var0.nblocks_used * 655635709 == var0.field6533 * 1484915729 + 1 && var0.su_rNToGo * 490349616 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("bo")
   static void method12303(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("ac")
   static void method12289(BZip2State var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.blockSize100k = 833482797;
      if (BZip2State.BZip2Decompressor_block == null) {
         BZip2State.BZip2Decompressor_block = new int[var0.blockSize100k * 736175392];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = BZip2Decompressor_readNextByte(var0);
         if (var1 == 23) {
            return;
         }

         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextByte(var0);
         var1 = BZip2Decompressor_readNextBit(var0);
         if (var1 != 0) {
         }

         var0.originalPointer = 0;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;
         var1 = BZip2Decompressor_readNextByte(var0);
         var0.originalPointer = (var0.originalPointer * -1770922585 << 8 | var1 & 255) * -1238304233;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = BZip2Decompressor_readNextBit(var0);
            if (var1 == 1) {
               var0.inUse16[var56] = true;
            } else {
               var0.inUse16[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.inUse[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.inUse16[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 1) {
                     var0.inUse[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         makeMaps(var0);
         var7 = var0.nInUse * 1542765527 + 2;
         var8 = BZip2Decompressor_readBits(3, var0);
         var9 = BZip2Decompressor_readBits(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = BZip2Decompressor_readNextBit(var0);
               if (var1 == 0) {
                  var0.ll8[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.ll8[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.seqToUnseq[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = BZip2Decompressor_readBits(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var0.temp_charArray2d[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = BZip2Decompressor_readNextBit(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.temp_charArray2d[var70][var62] > var3) {
                  var3 = var0.temp_charArray2d[var70][var62];
               }

               if (var0.temp_charArray2d[var70][var62] < var2) {
                  var2 = var0.temp_charArray2d[var70][var62];
               }
            }

            BZip2Decompressor_createHuffmanTables(var0.limit[var70], var0.base[var70], var0.perm[var70], var0.temp_charArray2d[var70], var2, var3, var7);
            var0.minLens[var70] = var2;
         }

         var10 = var0.nInUse * 1542765527 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.unzftab[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.selector[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.getAndMoveToFrontDecode_yy[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.seqToUnseq[var11];
            var22 = var0.minLens[var21];
            var23 = var0.limit[var21];
            var25 = var0.perm[var21];
            var24 = var0.base[var21];
         }

         var12--;
         var18 = var22;
         var19 = BZip2Decompressor_readBits(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = BZip2Decompressor_readNextBit(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.getAndMoveToFrontDecode_yy[0];

                  for (var1 = var0.selector[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.selector[var34] = var0.selector[var34 - 1];
                     var0.selector[var34 - 1] = var0.selector[var34 - 2];
                     var0.selector[var34 - 2] = var0.selector[var34 - 3];
                     var0.selector[var34 - 3] = var0.selector[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.selector[var103 + var33] = var0.selector[var103 + var33 - 1];
                     var33--;
                  }

                  var0.selector[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.getAndMoveToFrontDecode_yy[var31] + var32;

                  for (var1 = var0.selector[var30]; var30 > var0.getAndMoveToFrontDecode_yy[var31]; var30--) {
                     var0.selector[var30] = var0.selector[var30 - 1];
                  }

                  var0.getAndMoveToFrontDecode_yy[var31]++;

                  while (var31 > 0) {
                     var0.getAndMoveToFrontDecode_yy[var31]--;
                     var0.selector[var0.getAndMoveToFrontDecode_yy[var31]] = var0.selector[var0.getAndMoveToFrontDecode_yy[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.getAndMoveToFrontDecode_yy[0]--;
                  var0.selector[var0.getAndMoveToFrontDecode_yy[0]] = var1;
                  if (var0.getAndMoveToFrontDecode_yy[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.selector[var29] = var0.selector[var0.getAndMoveToFrontDecode_yy[var97] + var99];
                           var29--;
                        }

                        var0.getAndMoveToFrontDecode_yy[var97] = var29 + 1;
                     }
                  }
               }

               var0.unzftab[var0.inputArray[var1 & 255] & 255]++;
               BZip2State.BZip2Decompressor_block[var14] = var0.inputArray[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.seqToUnseq[var11];
                  var22 = var0.minLens[var21];
                  var23 = var0.limit[var21];
                  var25 = var0.perm[var21];
                  var24 = var0.base[var21];
               }

               var12--;
               var18 = var22;
               var19 = BZip2Decompressor_readBits(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = BZip2Decompressor_readNextBit(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.seqToUnseq[var11];
                     var22 = var0.minLens[var21];
                     var23 = var0.limit[var21];
                     var25 = var0.perm[var21];
                     var24 = var0.base[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = BZip2Decompressor_readBits(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = BZip2Decompressor_readNextBit(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.inputArray[var0.selector[var0.getAndMoveToFrontDecode_yy[0]] & 255];

               for (var0.unzftab[var1 & 255] = var0.unzftab[var1 & 255] + var15; var15 > 0; var15--) {
                  BZip2State.BZip2Decompressor_block[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.su_rNToGo = 0;
         var0.out_char = 0;
         var0.cftab[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.cftab[var64] = var0.unzftab[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.cftab[var65] = var0.cftab[var65] + var0.cftab[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(BZip2State.BZip2Decompressor_block[var66] & 0xFF);
            BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] = BZip2State.BZip2Decompressor_block[var0.cftab[var1 & 255]] | var66 << 8;
            var0.cftab[var1 & 255]++;
         }

         var0.field6526 = (BZip2State.BZip2Decompressor_block[var0.originalPointer * -1770922585] >> 8) * -1057687425;
         var0.nblocks_used = 0;
         var0.field6526 = BZip2State.BZip2Decompressor_block[var0.field6526 * 1873987455] * -1057687425;
         var0.su_ch2 = (byte)(var0.field6526 * 1873987455 & 0xFF) * 824015257;
         var0.field6526 = (var0.field6526 * 1873987455 >> 8) * -1057687425;
         var0.nblocks_used += -1096057335;
         var0.field6533 = var14 * 1670578731;
         method12283(var0);
         if (var0.nblocks_used * 981823545 == var0.field6533 * 1735634051 + 1 && var0.su_rNToGo * -433006017 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)B")
   @ObfuscatedName("ab")
   static byte method12291(BZip2State var0) {
      return (byte)BZip2Decompressor_readBits(8, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)B")
   @ObfuscatedName("ax")
   static byte method12293(BZip2State var0) {
      return (byte)BZip2Decompressor_readBits(1, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)B")
   @ObfuscatedName("ar")
   static byte method12294(BZip2State var0) {
      return (byte)BZip2Decompressor_readBits(1, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("am")
   static void method12301(BZip2State var0) {
      var0.nInUse = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.inUse[var1]) {
            var0.inputArray[var0.nInUse * 1542765527] = (byte)var1;
            var0.nInUse += 1799448551;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILxh;)I")
   @ObfuscatedName("al")
   static int method12295(int var0, BZip2State var1) {
      while (var1.bsLive * 1065960537 < var0) {
         var1.bsBuff = (var1.bsBuff * 1565757723 << 8 | var1.outputArray[var1.nextByte * 2024289487] & 255) * -125607661;
         var1.bsLive += 1196302152;
         var1.nextByte += 965497391;
         var1.nextBit_unused += -88989053;
         if (var1.nextBit_unused * 898939947 == 0) {
         }
      }

      int var2 = var1.bsBuff * 1565757723 >> var1.bsLive * 1065960537 - var0 & (1 << var0) - 1;
      var1.bsLive -= var0 * -1461074967;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILxh;)I")
   @ObfuscatedName("af")
   static int method12296(int var0, BZip2State var1) {
      while (var1.bsLive * 1065960537 < var0) {
         var1.bsBuff = (var1.bsBuff * -1627603678 << 8 | var1.outputArray[var1.nextByte * -1008846971] & -1397397913) * -125607661;
         var1.bsLive += 519344896;
         var1.nextByte += -430433178;
         var1.nextBit_unused += -88989053;
         if (var1.nextBit_unused * 898939947 == 0) {
         }
      }

      int var2 = var1.bsBuff * 1565757723 >> var1.bsLive * -1817183582 - var0 & (1 << var0) - 1;
      var1.bsLive -= var0 * -1461074967;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("ap")
   public static int method12282(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (BZip2Decompressor_state) {
         BZip2Decompressor_state.outputArray = var2;
         BZip2Decompressor_state.nextByte = var4 * 965497391;
         BZip2Decompressor_state.selectorMtf = var0;
         BZip2Decompressor_state.next_out = 0;
         BZip2Decompressor_state.outputLength = var1 * 584807589;
         BZip2Decompressor_state.bsLive = 0;
         BZip2Decompressor_state.bsBuff = 0;
         BZip2Decompressor_state.nextBit_unused = 0;
         BZip2Decompressor_state.field6522 = 0;
         BZip2Decompressor_decompress(BZip2Decompressor_state);
         var1 -= BZip2Decompressor_state.outputLength * -1270918355;
         BZip2Decompressor_state.outputArray = null;
         BZip2Decompressor_state.selectorMtf = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILxh;)I")
   @ObfuscatedName("ah")
   static int method12297(int var0, BZip2State var1) {
      while (var1.bsLive * 1065960537 < var0) {
         var1.bsBuff = (var1.bsBuff * 1565757723 << 8 | var1.outputArray[var1.nextByte * 2091288580] & 255) * -125607661;
         var1.bsLive += 104023636;
         var1.nextByte += 965497391;
         var1.nextBit_unused += -2126734241;
         if (var1.nextBit_unused * 898939947 == 0) {
         }
      }

      int var2 = var1.bsBuff * 1565757723 >> var1.bsLive * 1065960537 - var0 & (1 << var0) - 1;
      var1.bsLive -= var0 * -1461074967;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("aa")
   static void method12304(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("aq")
   static void method12305(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("be")
   static void method12306(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxh;)I")
   @ObfuscatedName("aj")
   static int BZip2Decompressor_readBits(int var0, BZip2State var1) {
      while (var1.bsLive * 1065960537 < var0) {
         var1.bsBuff = (var1.bsBuff * 1565757723 << 8 | var1.outputArray[var1.nextByte * 2024289487] & 255) * -125607661;
         var1.bsLive += 1196302152;
         var1.nextByte += 965497391;
         var1.nextBit_unused += -88989053;
         if (var1.nextBit_unused * 898939947 == 0) {
         }
      }

      int var2 = var1.bsBuff * 1565757723 >> var1.bsLive * 1065960537 - var0 & (1 << var0) - 1;
      var1.bsLive -= var0 * -1461074967;
      return var2;
   }
}
