import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nq")
public class MusicTrack extends Node {
   @ObfuscatedName("at")
   byte[] midi;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("av")
   NodeHashTable field4326 = new NodeHashTable(16);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lnq;")
   @ObfuscatedName("ag")
   public static MusicTrack method7837(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, 610876975);
      return var3 == null ? null : new MusicTrack(new Buffer(var3));
   }

   @ObfuscatedSignature(descriptor = "(Lqm;II)Lnq;")
   @ObfuscatedName("av")
   public static MusicTrack readTrack(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, 1230025120);
      return var3 == null ? null : new MusicTrack(new Buffer(var3));
   }

   MusicTrack(Buffer var1) {
      var1.offset = (var1.array.length - 3) * 1741769013;
      int var2 = var1.readUnsignedByte(-1642846885);
      int var3 = Buffer.method12008(var1, (byte)5);
      int var4 = 14 + var2 * 10;
      var1.offset = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for (int var13 = 0; var13 < var2; var13++) {
         int var14 = -1;

         while (true) {
            int var15 = var1.readUnsignedByte(-1042815253);
            if (var15 != var14) {
               var4++;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               var5++;
            } else if (var14 == 0) {
               var7++;
            } else if (var14 == 1) {
               var8++;
            } else if (var14 == 2) {
               var6++;
            } else if (var14 == 3) {
               var9++;
            } else if (var14 == 4) {
               var10++;
            } else if (var14 == 5) {
               var11++;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               var12++;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      int var78 = var1.offset * 2108391709;
      int var79 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for (int var80 = 0; var80 < var79; var80++) {
         var1.readVarInt(-881652491);
      }

      var4 += var1.offset * 2108391709 - var78;
      int var81 = var1.offset * 2108391709;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      for (int var29 = 0; var29 < var6; var29++) {
         var28 = var28 + var1.readUnsignedByte(1521218484) & 127;
         if (var28 == 0 || var28 == 32) {
            var12++;
         } else if (var28 == 1) {
            var16++;
         } else if (var28 == 33) {
            var17++;
         } else if (var28 == 7) {
            var18++;
         } else if (var28 == 39) {
            var19++;
         } else if (var28 == 10) {
            var20++;
         } else if (var28 == 42) {
            var21++;
         } else if (var28 == 99) {
            var22++;
         } else if (var28 == 98) {
            var23++;
         } else if (var28 == 101) {
            var24++;
         } else if (var28 == 100) {
            var25++;
         } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
            var27++;
         } else {
            var26++;
         }
      }

      int var83 = 0;
      int var30 = var1.offset * 2108391709;
      var1.offset += var26 * 1741769013;
      int var31 = var1.offset * 2108391709;
      var1.offset += var11 * 1741769013;
      int var32 = var1.offset * 2108391709;
      var1.offset += var10 * 1741769013;
      int var33 = var1.offset * 2108391709;
      var1.offset += var9 * 1741769013;
      int var34 = var1.offset * 2108391709;
      var1.offset += var16 * 1741769013;
      int var35 = var1.offset * 2108391709;
      var1.offset += var18 * 1741769013;
      int var36 = var1.offset * 2108391709;
      var1.offset += var20 * 1741769013;
      int var37 = var1.offset * 2108391709;
      var1.offset += (var7 + var8 + var11) * 1741769013;
      int var38 = var1.offset * 2108391709;
      var1.offset += var7 * 1741769013;
      int var39 = var1.offset * 2108391709;
      var1.offset += var27 * 1741769013;
      int var40 = var1.offset * 2108391709;
      var1.offset += var8 * 1741769013;
      int var41 = var1.offset * 2108391709;
      var1.offset += var17 * 1741769013;
      int var42 = var1.offset * 2108391709;
      var1.offset += var19 * 1741769013;
      int var43 = var1.offset * 2108391709;
      var1.offset += var21 * 1741769013;
      int var44 = var1.offset * 2108391709;
      var1.offset += var12 * 1741769013;
      int var45 = var1.offset * 2108391709;
      var1.offset += var9 * 1741769013;
      int var46 = var1.offset * 2108391709;
      var1.offset += var22 * 1741769013;
      int var47 = var1.offset * 2108391709;
      var1.offset += var23 * 1741769013;
      int var48 = var1.offset * 2108391709;
      var1.offset += var24 * 1741769013;
      int var49 = var1.offset * 2108391709;
      var1.offset += var25 * 1741769013;
      int var50 = var1.offset * 2108391709;
      var1.offset += var5 * 930339743;
      this.midi = new byte[var4];
      Buffer var51 = new Buffer(this.midi);
      var51.writeInt(1297377380, 204937924);
      var51.writeInt(6, -76026460);
      var51.writeShort(var2 > 1 ? 1 : 0, -2096493684);
      var51.writeShort(var2, -2075271823);
      var51.writeShort(var3, -1269516401);
      var1.offset = var78 * 1741769013;
      int var52 = 0;
      byte var53 = 0;
      byte var54 = 0;
      byte var55 = 0;
      int var56 = 0;
      byte var57 = 0;
      byte var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int[] var60 = new int[16];
      int[] var61 = new int[16];
      var61[9] = 128;
      var60[9] = 128;

      for (int var63 = 0; var63 < var2; var63++) {
         var51.writeInt(1297379947, 1134415379);
         var51.offset += -1622858540;
         int var64 = var51.offset * 2108391709;
         int var65 = var64;
         int var66 = -1;

         while (true) {
            int var67 = var1.readVarInt(-1071320550);
            Buffer.method11986(var51, var67, (byte)-34);
            var65 += var67;
            int var68 = var1.array[var83++] & 255;
            boolean var69 = var68 != var66;
            var66 = var68 & 15;
            if (var68 == 7) {
               if (var69) {
                  var51.writeByte(255, (short)-17630);
               }

               var51.writeByte(47, (short)-16426);
               var51.writeByte(0, (short)-22453);
               var51.writeLengthInt(var51.offset * 2108391709 - var64, 1708490112);
               break;
            }

            if (var68 == 23) {
               if (var69) {
                  var51.writeByte(255, (short)33);
               }

               var51.writeByte(81, (short)-17064);
               var51.writeByte(3, (short)-26203);
               var51.writeByte(var1.array[var50++], (short)-14723);
               var51.writeByte(var1.array[var50++], (short)-22433);
               var51.writeByte(var1.array[var50++], (short)-13367);
            } else {
               var52 ^= var68 >> 4;
               if (var66 == 0) {
                  if (var69) {
                     var51.writeByte(144 + var52, (short)-23196);
                  }

                  var53 += var1.array[var37++];
                  var54 += var1.array[var38++];
                  int var89 = var53 & 127;
                  int var90 = var54 & 127;
                  var51.writeByte(var89, (short)-18233);
                  var51.writeByte(var90, (short)-853);
                  if (var90 > 0) {
                     int var72 = var61[var52];
                     class358 var73 = (class358)this.field4326.method8915(var72);
                     if (var73 == null) {
                        var73 = new class358(var65);
                        this.field4326.put(var73, var72);
                     }

                     var73.field4362.set(var89);
                  }
               } else if (var66 == 1) {
                  if (var69) {
                     var51.writeByte(128 + var52, (short)-26116);
                  }

                  var53 += var1.array[var37++];
                  var55 += var1.array[var40++];
                  var51.writeByte(var53 & 127, (short)-16437);
                  var51.writeByte(var55 & 127, (short)-30231);
               } else if (var66 == 2) {
                  if (var69) {
                     var51.writeByte(176 + var52, (short)-21266);
                  }

                  var28 = var28 + var1.array[var81++] & 127;
                  var51.writeByte(var28, (short)-19947);
                  byte var87;
                  if (var28 == 0 || var28 == 32) {
                     var87 = var1.array[var44++];
                  } else if (var28 == 1) {
                     var87 = var1.array[var34++];
                  } else if (var28 == 33) {
                     var87 = var1.array[var41++];
                  } else if (var28 == 7) {
                     var87 = var1.array[var35++];
                  } else if (var28 == 39) {
                     var87 = var1.array[var42++];
                  } else if (var28 == 10) {
                     var87 = var1.array[var36++];
                  } else if (var28 == 42) {
                     var87 = var1.array[var43++];
                  } else if (var28 == 99) {
                     var87 = var1.array[var46++];
                  } else if (var28 == 98) {
                     var87 = var1.array[var47++];
                  } else if (var28 == 101) {
                     var87 = var1.array[var48++];
                  } else if (var28 == 100) {
                     var87 = var1.array[var49++];
                  } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                     var87 = var1.array[var39++];
                  } else {
                     var87 = var1.array[var30++];
                  }

                  var87 += var59[var28];
                  var59[var28] = var87;
                  int var71 = var87 & 127;
                  var51.writeByte(var71, (short)-23319);
                  if (var28 == 0) {
                     var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
                  }

                  if (var28 == 32) {
                     var60[var52] = (var60[var52] & -16257) + (var71 << 7);
                  }
               } else if (var66 == 3) {
                  if (var69) {
                     var51.writeByte(224 + var52, (short)-19024);
                  }

                  int var86 = var56 + var1.array[var45++];
                  var56 = var86 + (var1.array[var33++] << 7);
                  var51.writeByte(var56 & 127, (short)-11720);
                  var51.writeByte(var56 >> 7 & 127, (short)-24214);
               } else if (var66 == 4) {
                  if (var69) {
                     var51.writeByte(208 + var52, (short)-30879);
                  }

                  var57 += var1.array[var32++];
                  var51.writeByte(var57 & 127, (short)-21209);
               } else if (var66 == 5) {
                  if (var69) {
                     var51.writeByte(160 + var52, (short)-14295);
                  }

                  var53 += var1.array[var37++];
                  var58 += var1.array[var31++];
                  var51.writeByte(var53 & 127, (short)-20867);
                  var51.writeByte(var58 & 127, (short)-7913);
               } else {
                  if (var66 != 6) {
                     throw new RuntimeException();
                  }

                  if (var69) {
                     var51.writeByte(192 + var52, (short)-26493);
                  }

                  byte var70 = var1.array[var44++];
                  var61[var52] = var60[var52] + var70;
                  var51.writeByte(var70, (short)-31522);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lnq;")
   @ObfuscatedName("at")
   public static MusicTrack method7839(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, -53584877);
      return var3 == null ? null : new MusicTrack(new Buffer(var3));
   }
}
