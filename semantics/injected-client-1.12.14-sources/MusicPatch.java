import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nw")
public class MusicPatch extends Node {
   @ObfuscatedName("aj")
   byte[] field4352;
   @ObfuscatedName("at")
   int field4358;
   @ObfuscatedName("ae")
   byte[] field4351;
   @ObfuscatedName("an")
   short[] field4357;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4356 = 8;
   @ObfuscatedSignature(descriptor = "[Leq;")
   @ObfuscatedName("ag")
   class107[] rawSounds;
   @ObfuscatedSignature(descriptor = "[Lng;")
   @ObfuscatedName("ak")
   MusicPatchNode2[] field4354;
   @ObfuscatedName("aw")
   byte[] field4355;
   @ObfuscatedName("ay")
   int[] field4353;
   @ObfuscatedName("ap")
   ArrayList field4359 = new ArrayList(8);
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   public static final int field4361 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field4360 = 768;

   @ObfuscatedSignature(descriptor = "(Lds;Ljava/util/BitSet;)Z")
   @ObfuscatedName("aj")
   boolean method7858(SoundCache var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      class107 var5 = new class107();
      int var6 = var2.nextSetBit(0);

      while (var6 != -1) {
         int var7 = var2.nextClearBit(var6);

         for (int var8 = var6; var8 < var7; var8++) {
            if (var2.get(var8)) {
               int var9 = this.field4353[var8];
               if (0 != var9) {
                  if (var4 != var9) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new class107(var1.method3466(var9 >> 2, (byte)36));
                     } else {
                        var5 = SoundCache.method3462(var1, var9 >> 2, 924260621);
                     }

                     if (var5.method3816(-1740465471)) {
                        var3 = false;
                     } else {
                        this.field4359.add(this.field4359.size(), var5);
                     }
                  }

                  if (!var5.method3816(-2020907612)) {
                     this.rawSounds[var8] = var5;
                     this.field4353[var8] = 0;
                  }
               }
            }
         }

         var6 = var2.nextSetBit(var7);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method7861() {
      this.field4353 = null;
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ag")
   void _remove(short var1) {
      try {
         this.field4353 = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nw.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)Lnw;")
   @ObfuscatedName("an")
   static MusicPatch method7857(AbstractArchive var0, int var1) {
      byte[] var2 = var0.takeFileFlat(var1, -1388559616);
      return null == var2 ? null : new MusicPatch(var2);
   }

   @ObfuscatedSignature(descriptor = "(Lds;Ljava/util/BitSet;B)Z")
   @ObfuscatedName("at")
   boolean method7859(SoundCache var1, BitSet var2, byte var3) {
      try {
         boolean var4 = true;
         int var5 = 0;
         class107 var6 = new class107();
         int var7 = var2.nextSetBit(0);

         while (var7 != -1) {
            if (var3 <= 12) {
               throw new IllegalStateException();
            }

            int var8 = var2.nextClearBit(var7);

            for (int var9 = var7; var9 < var8; var9++) {
               if (var3 <= 12) {
                  throw new IllegalStateException();
               }

               if (var2.get(var9)) {
                  if (var3 <= 12) {
                     throw new IllegalStateException();
                  }

                  int var10 = this.field4353[var9];
                  if (0 != var10) {
                     if (var3 <= 12) {
                        throw new IllegalStateException();
                     }

                     if (var5 != var10) {
                        if (var3 <= 12) {
                           throw new IllegalStateException();
                        }

                        var5 = var10--;
                        if ((var10 & 1) == 0) {
                           if (var3 <= 12) {
                              throw new IllegalStateException();
                           }

                           var6 = new class107(var1.method3466(var10 >> 2, (byte)15));
                        } else {
                           var6 = SoundCache.method3462(var1, var10 >> 2, 988618379);
                        }

                        if (var6.method3816(-2011319333)) {
                           if (var3 <= 12) {
                              throw new IllegalStateException();
                           }

                           var4 = false;
                        } else {
                           this.field4359.add(this.field4359.size(), var6);
                        }
                     }

                     if (!var6.method3816(297041573)) {
                        if (var3 <= 12) {
                           throw new IllegalStateException();
                        }

                        this.rawSounds[var9] = var6;
                        this.field4353[var9] = 0;
                     }
                  }
               }
            }

            var7 = var2.nextSetBit(var8);
         }

         return var4;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "nw.at(" + ')');
      }
   }

   MusicPatch(byte[] var1) {
      this.rawSounds = new class107[128];
      this.field4357 = new short[128];
      this.field4351 = new byte[128];
      this.field4352 = new byte[128];
      this.field4354 = new MusicPatchNode2[128];
      this.field4355 = new byte[128];
      this.field4353 = new int[128];
      Buffer var2 = new Buffer(var1);
      int var3 = 0;

      while (0 != var2.array[var3 + var2.offset * 2108391709]) {
         var3++;
      }

      byte[] var4 = new byte[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = Buffer.method12001(var2, (byte)79);
      }

      var2.offset += 1741769013;
      var3++;
      int var39 = var2.offset * 2108391709;
      var2.offset += var3 * 1741769013;
      int var6 = 0;

      while (var2.array[var2.offset * 2108391709 + var6] != 0) {
         var6++;
      }

      byte[] var7 = new byte[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Buffer.method12001(var2, (byte)58);
      }

      var2.offset += 1741769013;
      var6++;
      int var41 = 2108391709 * var2.offset;
      var2.offset += 1741769013 * var6;
      int var9 = 0;

      while (var2.array[2108391709 * var2.offset + var9] != 0) {
         var9++;
      }

      byte[] var10 = new byte[var9];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Buffer.method12001(var2, (byte)56);
      }

      var2.offset += 1741769013;
      byte[] var43 = new byte[++var9];
      int var12;
      if (var9 > 1) {
         var43[1] = 1;
         int var13 = 1;
         var12 = 2;

         for (int var14 = 2; var14 < var9; var14++) {
            int var15 = var2.readUnsignedByte(-1416531391);
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

      MusicPatchNode2[] var44 = new MusicPatchNode2[var12];

      for (int var45 = 0; var45 < var44.length; var45++) {
         MusicPatchNode2 var48 = var44[var45] = new MusicPatchNode2();
         int var16 = var2.readUnsignedByte(137687802);
         if (var16 > 0) {
            var48.field4288 = new byte[2 * var16];
         }

         var16 = var2.readUnsignedByte(1621040263);
         if (var16 > 0) {
            var48.field4289 = new byte[2 * var16 + 2];
            var48.field4289[1] = 64;
         }
      }

      int var46 = var2.readUnsignedByte(1356581371);
      byte[] var49 = var46 > 0 ? new byte[var46 * 2] : null;
      var46 = var2.readUnsignedByte(1454869983);
      byte[] var52 = var46 > 0 ? new byte[2 * var46] : null;
      int var17 = 0;

      while (var2.array[2108391709 * var2.offset + var17] != 0) {
         var17++;
      }

      byte[] var18 = new byte[var17];

      for (int var19 = 0; var19 < var17; var19++) {
         var18[var19] = Buffer.method12001(var2, (byte)53);
      }

      var2.offset += 1741769013;
      var17++;
      int var55 = 0;

      for (int var20 = 0; var20 < 128; var20++) {
         var55 += var2.readUnsignedByte(1127460387);
         this.field4357[var20] = (short)var55;
      }

      var55 = 0;

      for (int var61 = 0; var61 < 128; var61++) {
         var55 += var2.readUnsignedByte(1155157756);
         this.field4357[var61] = (short)(this.field4357[var61] + (var55 << 8));
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

            var22 = var2.readVarInt(50708894);
         }

         this.field4357[var23] = (short)(this.field4357[var23] + ((var22 - 1 & 2) << 14));
         this.field4353[var23] = var22;
         var62--;
      }

      var62 = 0;
      var21 = 0;
      int var71 = 0;

      for (int var24 = 0; var24 < 128; var24++) {
         if (this.field4353[var24] != 0) {
            if (var62 == 0) {
               if (var21 < var4.length) {
                  var62 = var4[var21++];
               } else {
                  var62 = -1;
               }

               var71 = var2.array[var39++] - 1;
            }

            this.field4355[var24] = (byte)var71;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      int var72 = 0;

      for (int var25 = 0; var25 < 128; var25++) {
         if (this.field4353[var25] != 0) {
            if (var62 == 0) {
               if (var21 < var7.length) {
                  var62 = var7[var21++];
               } else {
                  var62 = -1;
               }

               var72 = var2.array[var41++] + 16 << 2;
            }

            this.field4352[var25] = (byte)var72;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      MusicPatchNode2 var73 = null;

      for (int var26 = 0; var26 < 128; var26++) {
         if (0 != this.field4353[var26]) {
            if (var62 == 0) {
               var73 = var44[var43[var21]];
               if (var21 < var10.length) {
                  var62 = var10[var21++];
               } else {
                  var62 = -1;
               }
            }

            this.field4354[var26] = var73;
            var62--;
         }
      }

      var62 = 0;
      var21 = 0;
      int var74 = 0;

      for (int var27 = 0; var27 < 128; var27++) {
         if (0 == var62) {
            if (var21 < var18.length) {
               var62 = var18[var21++];
            } else {
               var62 = -1;
            }

            if (this.field4353[var27] > 0) {
               var74 = var2.readUnsignedByte(-39075858) + 1;
            }
         }

         this.field4351[var27] = (byte)var74;
         var62--;
      }

      this.field4358 = (var2.readUnsignedByte(779295224) + 1) * -1409092949;

      for (int var75 = 0; var75 < var12; var75++) {
         MusicPatchNode2 var28 = var44[var75];
         if (null != var28.field4288) {
            for (byte var29 = 1; var29 < var28.field4288.length; var29 += 2) {
               var28.field4288[var29] = Buffer.method12001(var2, (byte)31);
            }
         }

         if (var28.field4289 != null) {
            for (byte var96 = 3; var96 < var28.field4289.length - 2; var96 += 2) {
               var28.field4289[var96] = Buffer.method12001(var2, (byte)107);
            }
         }
      }

      if (var49 != null) {
         for (byte var76 = 1; var76 < var49.length; var76 += 2) {
            var49[var76] = Buffer.method12001(var2, (byte)118);
         }
      }

      if (null != var52) {
         for (byte var77 = 1; var77 < var52.length; var77 += 2) {
            var52[var77] = Buffer.method12001(var2, (byte)4);
         }
      }

      for (int var78 = 0; var78 < var12; var78++) {
         MusicPatchNode2 var89 = var44[var78];
         if (null != var89.field4289) {
            var55 = 0;

            for (byte var97 = 2; var97 < var89.field4289.length; var97 += 2) {
               var55 = 1 + var55 + var2.readUnsignedByte(1572526223);
               var89.field4289[var97] = (byte)var55;
            }
         }
      }

      for (int var79 = 0; var79 < var12; var79++) {
         MusicPatchNode2 var90 = var44[var79];
         if (null != var90.field4288) {
            var55 = 0;

            for (byte var98 = 2; var98 < var90.field4288.length; var98 += 2) {
               var55 = 1 + var55 + var2.readUnsignedByte(-808549128);
               var90.field4288[var98] = (byte)var55;
            }
         }
      }

      if (null != var49) {
         var55 = var2.readUnsignedByte(-83819685);
         var49[0] = (byte)var55;

         for (byte var80 = 2; var80 < var49.length; var80 += 2) {
            var55 = var55 + 1 + var2.readUnsignedByte(-98444133);
            var49[var80] = (byte)var55;
         }

         byte var81 = var49[0];
         byte var91 = var49[1];

         for (int var99 = 0; var99 < var81; var99++) {
            this.field4351[var99] = (byte)(var91 * this.field4351[var99] + 32 >> 6);
         }

         for (byte var100 = 2; var100 < var49.length; var100 += 2) {
            byte var30 = var49[var100];
            byte var31 = var49[1 + var100];
            int var32 = var91 * (var30 - var81) + (var30 - var81) / 2;

            for (int var33 = var81; var33 < var30; var33++) {
               int var35 = var30 - var81;
               int var36 = var32 >>> 31;
               int var34 = (var36 + var32) / var35 - var36;
               this.field4351[var33] = (byte)(32 + var34 * this.field4351[var33] >> 6);
               var32 += var31 - var91;
            }

            var81 = var30;
            var91 = var31;
         }

         for (int var103 = var81; var103 < 128; var103++) {
            this.field4351[var103] = (byte)(var91 * this.field4351[var103] + 32 >> 6);
         }

         var49 = null;
      }

      if (null != var52) {
         var55 = var2.readUnsignedByte(-1238977152);
         var52[0] = (byte)var55;

         for (byte var82 = 2; var82 < var52.length; var82 += 2) {
            var55 = var55 + 1 + var2.readUnsignedByte(-470757778);
            var52[var82] = (byte)var55;
         }

         byte var83 = var52[0];
         int var92 = var52[1] << 1;

         for (int var101 = 0; var101 < var83; var101++) {
            int var104 = var92 + (this.field4352[var101] & 255);
            if (var104 < 0) {
               var104 = 0;
            }

            if (var104 > 128) {
               var104 = 128;
            }

            this.field4352[var101] = (byte)var104;
         }

         for (byte var102 = 2; var102 < var52.length; var102 += 2) {
            byte var105 = var52[var102];
            int var107 = var52[1 + var102] << 1;
            int var109 = (var105 - var83) * var92 + (var105 - var83) / 2;

            for (int var110 = var83; var110 < var105; var110++) {
               int var112 = var105 - var83;
               int var113 = var109 >>> 31;
               int var111 = (var109 + var113) / var112 - var113;
               int var37 = (this.field4352[var110] & 255) + var111;
               if (var37 < 0) {
                  var37 = 0;
               }

               if (var37 > 128) {
                  var37 = 128;
               }

               this.field4352[var110] = (byte)var37;
               var109 += var107 - var92;
            }

            var83 = var105;
            var92 = var107;
         }

         for (int var106 = var83; var106 < 128; var106++) {
            int var108 = (this.field4352[var106] & 255) + var92;
            if (var108 < 0) {
               var108 = 0;
            }

            if (var108 > 128) {
               var108 = 128;
            }

            this.field4352[var106] = (byte)var108;
         }

         var52 = null;
      }

      for (int var84 = 0; var84 < var12; var84++) {
         var44[var84].field4282 = var2.readUnsignedByte(1832130732) * 1059509023;
      }

      for (int var85 = 0; var85 < var12; var85++) {
         MusicPatchNode2 var93 = var44[var85];
         if (var93.field4288 != null) {
            var93.field4285 = var2.readUnsignedByte(-475719504) * 2027297231;
         }

         if (null != var93.field4289) {
            var93.field4281 = var2.readUnsignedByte(348985311) * 1525214239;
         }

         if (-521738017 * var93.field4282 > 0) {
            var93.field4283 = var2.readUnsignedByte(763051196) * -1123231271;
         }
      }

      for (int var86 = 0; var86 < var12; var86++) {
         var44[var86].field4287 = var2.readUnsignedByte(-419902234) * -411670499;
      }

      for (int var87 = 0; var87 < var12; var87++) {
         MusicPatchNode2 var94 = var44[var87];
         if (var94.field4287 * -665347531 > 0) {
            var94.field4284 = var2.readUnsignedByte(-1261289430) * -1133985481;
         }
      }

      for (int var88 = 0; var88 < var12; var88++) {
         MusicPatchNode2 var95 = var44[var88];
         if (var95.field4284 * -808663929 > 0) {
            var95.field4286 = var2.readUnsignedByte(1273741858) * -2049261927;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;Ljava/lang/Runnable;I)Ljp;")
   @ObfuscatedName("jf")
   public static Task method7856(TaskHandler var0, Runnable var1, int var2) {
      return var0 == null ? var0.method4877(var1, var2) : var0.newTask(2, var2, 0, var1, -1975353268);
   }

   @ObfuscatedSignature(descriptor = "(Lds;Ljava/util/BitSet;)Z")
   @ObfuscatedName("ae")
   boolean method7860(SoundCache var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      class107 var5 = new class107();
      int var6 = var2.nextSetBit(0);

      while (var6 != -1) {
         int var7 = var2.nextClearBit(var6);

         for (int var8 = var6; var8 < var7; var8++) {
            if (var2.get(var8)) {
               int var9 = this.field4353[var8];
               if (0 != var9) {
                  if (var4 != var9) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new class107(var1.method3466(var9 >> 2, (byte)21));
                     } else {
                        var5 = SoundCache.method3462(var1, var9 >> 2, 990498261);
                     }

                     if (var5.method3816(-2090357048)) {
                        var3 = false;
                     } else {
                        this.field4359.add(this.field4359.size(), var5);
                     }
                  }

                  if (!var5.method3816(1115607978)) {
                     this.rawSounds[var8] = var5;
                     this.field4353[var8] = 0;
                  }
               }
            }
         }

         var6 = var2.nextSetBit(var7);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void method7863() {
      this.field4353 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method7864() {
      this.field4353 = null;
   }
}
