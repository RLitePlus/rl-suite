import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl4")
public class rl4 implements Runnable {
   @ObfuscatedName("wj")
   public int field5651;
   @ObfuscatedName("pn")
   public final int[] field5644;
   @ObfuscatedName("iz")
   public int field5649;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("tc")
   public NodeDeque field5623;
   @ObfuscatedName("db")
   public final int field5634;
   @ObfuscatedName("qe")
   public final int[] field5642;
   @ObfuscatedName("if")
   public final int field5632;
   @ObfuscatedName("jh")
   public static Thread field5654;
   @ObfuscatedName("qu")
   public int field5650;
   @ObfuscatedName("wp")
   public final int field5631;
   @ObfuscatedName("tm")
   public Future field5655;
   @ObfuscatedSignature(descriptor = "[Lkk;")
   @ObfuscatedName("ga")
   public CollisionMap[] field5657;
   @ObfuscatedName("zv")
   public final int field5630;
   @ObfuscatedName("zy")
   public byte[][][] field5661;
   @ObfuscatedName("tx")
   public final byte[][][] field5639;
   @ObfuscatedName("vf")
   public byte[][][] field5660;
   @ObfuscatedName("qu")
   public byte[][][] field5659;
   @ObfuscatedSignature(descriptor = "Ljh;")
   @ObfuscatedName("it")
   public Scene field5656;
   @ObfuscatedName("eo")
   public final int field5629;
   @ObfuscatedName("lh")
   public short[][][] field5647;
   @ObfuscatedName("kx")
   public final int field5635;
   @ObfuscatedName("kh")
   public byte[][][] field5658;
   @ObfuscatedName("bc")
   public final DrawCallbacks field5624;
   @ObfuscatedName("eh")
   public final int field5628;
   @ObfuscatedName("oh")
   public final int[][][] field5638;
   @ObfuscatedName("xa")
   public short[][][] field5664;
   @ObfuscatedName("ee")
   public int[][][] field5663;
   @ObfuscatedName("hw")
   public int field5648;
   @ObfuscatedName("xw")
   public int field5652;
   @ObfuscatedName("ao")
   public int[][][] field5662;
   @ObfuscatedName("cd")
   public final int field5625;
   @ObfuscatedName("vv")
   public final int[] field5643;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ih")
   public EvictingDualNodeHashTable field5622;
   @ObfuscatedName("at")
   public final int field5626;
   @ObfuscatedName("vh")
   public final int field5627;
   @ObfuscatedName("cv")
   public final int[][] field5640;
   @ObfuscatedName("lh")
   public static final ExecutorService field5646 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Map Loader");
      field5654 = var1;
      var1.setDaemon(true);
      return var1;
   });
   @ObfuscatedName("if")
   public final int[] field5633;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("yh")
   public final WorldView field5636;
   @ObfuscatedName("sk")
   public final int[] field5641;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("he")
   public EvictingDualNodeHashTable field5621 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("cy")
   public RandomAccessFile field5653;
   @ObfuscatedSignature(descriptor = "Lrl2;")
   @ObfuscatedName("bq")
   public final rl2 field5637;

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ez")
   public int[] method9572(int var1, int var2, int var3) {
      if (this.field5653 == null) {
         return null;
      } else {
         try {
            int[] var4 = new int[4];
            this.field5653.seek(var1 * 25);
            if (this.field5653.readByte() != 1) {
               return null;
            } else {
               int var5 = this.field5653.readInt();
               int var6 = this.field5653.readInt();
               if (var5 == var2 && var6 == var3) {
                  for (int var7 = 0; var7 < 4; var7++) {
                     var4[var7] = this.field5653.readInt();
                  }

                  return var4;
               } else {
                  return null;
               }
            }
         } catch (EOFException var8) {
            return null;
         } catch (IOException var9) {
            client.field938.error("io error loading xtea", var9);
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BII[Lkk;)V")
   @ObfuscatedName("pe")
   public void method9576(WorldView var1, byte[] var2, int var3, int var4, CollisionMap[] var5) {
      Buffer var6 = new Buffer(var2);
      int var7 = -1;

      while (true) {
         int var8 = var6.method12222();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while (true) {
            int var10 = var6.method12233();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method12221();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var3;
            int var18 = var11 + var4;
            if (var17 > this.field5631 && var18 > this.field5632 && var17 < this.field5634 - 1 && var18 < this.field5635 - 1) {
               int var19 = var13;
               if ((this.field5659[1][var17 + this.field5629][var18 + this.field5629] & 2) == 2) {
                  var19 = var13 - 1;
               }

               CollisionMap var20 = null;
               if (var19 >= 0) {
                  var20 = var5[var19];
               }

               method9597(var1, var13, var17, var18, var7, var16, var15, var20);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lhf;")
   @ObfuscatedName("sw")
   public FloorUnderlayDefinition method9578(int var1) {
      FloorUnderlayDefinition var2 = (FloorUnderlayDefinition)this.field5621.method7390(var1);
      if (var2 != null) {
         return var2;
      } else {
         Archive var3 = client.field939[2];
         byte[] var4 = var3.loadData(1, var1);
         var2 = new FloorUnderlayDefinition();
         if (var4 != null) {
            var2.method4520(new Buffer(var4), var1);
         }

         var2.method4517();
         this.field5621.method7391(var2, var1);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Liz;")
   @ObfuscatedName("hs")
   public FloorOverlayDefinition method9571(int var1) {
      FloorOverlayDefinition var2 = (FloorOverlayDefinition)this.field5622.method7390(var1);
      if (var2 != null) {
         return var2;
      } else {
         Archive var3 = client.field939[2];
         byte[] var4 = var3.loadData(4, var1);
         var2 = new FloorOverlayDefinition();
         if (var4 != null) {
            var2.method5367(new Buffer(var4), var1);
         }

         var2.method5368();
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIIIIII)V")
   @ObfuscatedName("xz")
   public void method9573(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap var11 = this.field5657[var2];

      for (int var12 = var3; var12 < var3 + 8; var12++) {
         for (int var13 = var4; var13 < var4 + 8; var13++) {
            if (var11.method6447(var12, var13)) {
               var11.method6441(var12, var13, 1073741824);
            }
         }
      }

      Buffer var20 = new Buffer(var1);

      for (int var21 = 0; var21 < 4; var21++) {
         for (int var14 = 0; var14 < 64; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var21 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  int var16 = var3 + method9568(var14 & 7, var15 & 7, var8);
                  int var17 = var4 + method9589(var14 & 7, var15 & 7, var8);
                  int var18 = var9 + var3 + (var14 & 7);
                  int var19 = var10 + var4 + (var15 & 7);
                  this.method9570(var20, var2, var16, var17, var18, var19, var8);
               } else {
                  this.method9570(var20, -1, -1, -1, 0, 0, 0);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)Z")
   @ObfuscatedName("ok")
   public boolean method9577(byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;
      boolean var6 = true;

      while (true) {
         int var7 = var4.method12222();
         if (var7 == 0) {
            return var6;
         }

         var5 += var7;
         int var8 = 0;

         while (true) {
            int var9 = var4.method12233();
            if (var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            var4.method12221();
            int var12 = var11 + var2;
            int var13 = var10 + var3;
            if (this.field5637.field5591 || var12 > this.field5631 && var13 > this.field5632 && var12 < this.field5634 - 1 && var13 < this.field5635 - 1) {
               ObjectComposition var14 = ObjectComposition.method5196(var5);
               if ((client.field997 & 16) != 0 && var14.transforms != null) {
                  if (!var14.method5198()) {
                     var6 = false;
                  }

                  for (int var15 = 0; var15 < var14.transforms.length; var15++) {
                     ObjectComposition var16 = ObjectComposition.method5196(var14.transforms[var15]);
                     if (!var16.method5198()) {
                        var6 = false;
                     }
                  }
               } else if (!var14.method5198()) {
                  var6 = false;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("jj")
   public static void method9595(String var0, Throwable var1) {
      PlayerType.RunException_sendStackTrace(var0, var1, -230650138);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("kn")
   public static int method9596(int var0, int var1, int var2) {
      return class236.method6008(var0, var1, var2, 1998174652);
   }

   public rl4(DrawCallbacks var1, int var2, WorldView var3, rl2 var4) {
      this.field5622 = new EvictingDualNodeHashTable(64);
      this.field5623 = new NodeDeque();

      assert var2 == 0 || var3.isTopLevel();

      this.field5624 = var1;
      this.field5625 = var3.sizeX * 2010544793;
      this.field5626 = var3.sizeY * 1823353167;
      int var5 = var3.isTopLevel() ? 40 : 0;
      this.field5627 = var3.sizeX * 2010544793 + var5 * 2;
      this.field5628 = var3.sizeY * 1823353167 + var5 * 2;
      this.field5629 = var5;
      this.field5630 = var2;
      this.field5631 = -var2 * 8;
      this.field5632 = -var2 * 8;
      this.field5634 = var3.sizeX * 2010544793 + var2 * 8;
      this.field5635 = var3.sizeY * 1823353167 + var2 * 8;
      this.field5636 = var3;
      this.field5637 = var4;
      this.field5638 = new int[4][this.field5627 + 1][this.field5628 + 1];
      this.field5639 = new byte[4][this.field5627 + 1][this.field5628 + 1];
      this.field5640 = new int[this.field5627 + 1][this.field5628 + 1];
      this.field5633 = new int[this.field5628];
      this.field5641 = new int[this.field5628];
      this.field5642 = new int[this.field5628];
      this.field5643 = new int[this.field5628];
      this.field5644 = new int[this.field5628];
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cz")
   public boolean method9586() {
      Archive var1 = client.field939[5];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field5637.field5597.length; var3++) {
         if (this.field5637.field5595[var3] != -1 && this.field5637.field5597[var3] == null) {
            this.field5637.field5597[var3] = var1.loadData(this.field5637.field5595[var3], 0);
            if (this.field5637.field5597[var3] == null) {
               var2++;
            }
         }

         if (this.field5637.field5596[var3] != -1 && this.field5637.field5598[var3] == null) {
            this.field5637.field5598[var3] = var1.method9057(this.field5637.field5596[var3], 0, this.field5637.field5593[var3]);
            if (this.field5637.field5598[var3] == null) {
               var2++;
            }
         }
      }

      if (var2 > 0) {
         return false;
      } else {
         boolean var33 = true;

         for (int var4 = 0; var4 < this.field5637.field5597.length; var4++) {
            byte[] var5 = this.field5637.field5598[var4];
            if (var5 != null) {
               int var6 = (this.field5637.field5594[var4] >> 8) * 64 - this.field5652;
               int var7 = (this.field5637.field5594[var4] & 0xFF) * 64 - this.field5650;
               var33 &= this.method9577(var5, var6, var7);
            }
         }

         if (!var33) {
            return false;
         } else {
            for (int var34 = 0; var34 < this.field5637.field5594.length; var34++) {
               int var40 = this.field5637.field5596[var34];
               if (var40 != -1) {
                  int var44 = var1.groupCrcs[var40];
                  int var50 = var1.groupVersions[var40];
                  this.method9584(this.field5637.field5594[var34], var44, var50, this.field5637.field5593[var34]);
               }
            }

            this.field5662 = new int[4][this.field5627 + 1][this.field5628 + 1];
            this.field5656 = new Scene(
               this.field5636.id * 577964535,
               4,
               this.field5627,
               this.field5628,
               class468.clientPreferences.drawDistance * -2135918997,
               TileRenderMode.field3137,
               this.field5662
            );
            this.field5656.field3030 = new rl8[4][this.field5625][this.field5626];
            this.field5656.field3014 = this.field5629;
            this.field5656.field3022 = this.field5631;
            this.field5656.field3018 = this.field5634;
            this.field5656.field3016 = this.field5632;
            this.field5656.field3015 = this.field5635;
            this.field5656.field3025 = false;
            this.field5657 = new CollisionMap[4];

            for (int var35 = 0; var35 < 4; var35++) {
               this.field5657[var35] = new CollisionMap(this.field5625, this.field5626, !this.field5636.isTopLevel());
            }

            this.field5659 = new byte[4][this.field5627][this.field5628];
            Tiles.Tiles_minPlane = 99 * 84476805;
            this.field5647 = new short[4][this.field5627][this.field5628];
            this.field5664 = new short[4][this.field5627][this.field5628];
            this.field5658 = new byte[4][this.field5627][this.field5628];
            this.field5661 = new byte[4][this.field5627][this.field5628];
            this.field5656.field2913 = this.field5647;
            this.field5656.field3031 = this.field5664;
            this.field5656.field3027 = this.field5658;
            this.field5656.field3028 = this.field5659;
            this.field5656.field3017 = this.field5652;
            this.field5656.field3020 = this.field5650;
            this.field5656.field3024 = this.field5637.field5591;
            this.field5656.field3029 = this.field5637.field5592;
            this.field5656.field3026 = this.field5637.field5594;
            if (!this.field5637.field5591) {
               byte var8 = 6;
               int var9 = 6 + this.field5630;
               int var10 = this.field5649 - var9 >> 3;
               int var11 = this.field5649 + var9 >> 3;
               int var12 = this.field5651 - var9 >> 3;
               int var13 = this.field5651 + var9 >> 3;
               int var14 = this.field5649 - var8 >> 3;
               int var15 = this.field5649 + var8 >> 3;
               int var16 = this.field5651 - var8 >> 3;
               int var17 = this.field5651 + var8 >> 3;
               int var18 = 0;

               for (int var19 = var10; var19 <= var11; var19++) {
                  for (int var20 = var12; var20 <= var13; var20++) {
                     if (var19 < var14 || var19 > var15 || var20 < var16 || var20 > var17) {
                        var18++;
                     }
                  }
               }

               int[] var36 = new int[var18];
               byte[][] var41 = new byte[var18][];
               byte[][] var45 = new byte[var18][];
               boolean[] var51 = new boolean[var18];
               int var105 = var10;

               for (int var106 = 0; var105 <= var11; var105++) {
                  for (int var21 = var12; var21 <= var13; var21++) {
                     if (var105 < var14 || var105 > var15 || var21 < var16 || var21 > var17) {
                        int var22 = var21 | var105 << 8;
                        var36[var106] = var22;
                        int var23 = var1.method9059("m" + var105 + "_" + var21);
                        int var24 = var1.method9059("l" + var105 + "_" + var21);
                        if (var23 != -1 && var24 != -1) {
                           var41[var106] = var1.loadData(var23, 0);
                           int var25 = var1.groupCrcs[var24];
                           int var26 = var1.groupVersions[var24];
                           int[] var27 = this.method9572(var22, var25, var26);
                           if (var27 != null) {
                              try {
                                 var45[var106] = var1.method9057(var24, 0, var27);
                              } catch (Exception var32) {
                                 client.field938.error("error decrypting map data", var32);
                              }

                              int var28 = var105 * 64 - this.field5652;
                              int var29 = var21 * 64 - this.field5650;
                              var51[var106] = var41[var106] != null && var45[var106] != null && this.method9577(var45[var106], var28, var29);
                           }
                        }

                        var106++;
                     }
                  }
               }

               for (int var56 = 0; var56 < this.field5637.field5597.length; var56++) {
                  byte[] var66 = this.field5637.field5597[var56];
                  if (var66 != null) {
                     var10 = this.field5637.field5594[var56];
                     var11 = (var10 >> 8 << 6) - this.field5652;
                     var12 = ((var10 & 0xFF) << 6) - this.field5650;

                     assert this.field5649 * 8 - 48 == this.field5652;

                     assert this.field5651 * 8 - 48 == this.field5650;

                     this.method9582(var66, var11, var12, this.field5652, this.field5650, this.field5657);
                  }
               }

               for (int var57 = 0; var57 < var36.length; var57++) {
                  if (var51[var57]) {
                     var9 = var36[var57];
                     var10 = (var9 >> 8 << 6) - this.field5652;
                     var11 = ((var9 & 0xFF) << 6) - this.field5650;
                     this.method9582(var41[var57], var10, var11, this.field5652, this.field5650, this.field5657);
                  }
               }

               for (int var58 = 0; var58 < this.field5637.field5597.length; var58++) {
                  byte[] var68 = this.field5637.field5597[var58];
                  if (var68 == null && this.field5651 < 800) {
                     var10 = this.field5637.field5594[var58];
                     var11 = (var10 >> 8 << 6) - this.field5652;
                     var12 = ((var10 & 0xFF) << 6) - this.field5650;
                     this.method9569(var11, var12, 64, 64);
                  }
               }

               for (int var59 = 0; var59 < var36.length; var59++) {
                  if (!var51[var59] && this.field5651 < 800) {
                     var9 = var36[var59];
                     var10 = (var9 >> 8 << 6) - this.field5652;
                     var11 = ((var9 & 0xFF) << 6) - this.field5650;
                     this.method9569(var10, var11, 64, 64);
                  }
               }

               client.method2428();

               for (int var60 = 0; var60 < this.field5637.field5597.length; var60++) {
                  byte[] var70 = this.field5637.field5598[var60];
                  if (var70 != null) {
                     var10 = this.field5637.field5594[var60];
                     var11 = (var10 >> 8 << 6) - this.field5652;
                     var12 = ((var10 & 0xFF) << 6) - this.field5650;
                     this.method9576(this.field5636, var70, var11, var12, this.field5657);
                  }
               }

               for (int var61 = 0; var61 < var36.length; var61++) {
                  if (var51[var61]) {
                     var9 = var36[var61];
                     var10 = (var9 >> 8 << 6) - this.field5652;
                     var11 = ((var9 & 0xFF) << 6) - this.field5650;
                     this.method9576(this.field5636, var45[var61], var10, var11, this.field5657);
                  }
               }

               client.method2479();
               client.method2428();
            } else {
               int var37 = this.field5625 / 8;
               int var42 = this.field5626 / 8;

               for (int var46 = 0; var46 < 4; var46++) {
                  for (int var52 = 0; var52 < var37; var52++) {
                     for (int var62 = 0; var62 < var42; var62++) {
                        boolean var72 = false;
                        int var81 = this.field5637.field5592[var46][var52][var62];
                        if (var81 != -1) {
                           int var89 = var81 >> 24 & 3;
                           int var94 = var81 >> 1 & 3;
                           int var96 = var81 >> 14 & 1023;
                           int var98 = var81 >> 3 & 2047;
                           int var100 = (var96 / 8 << 8) + var98 / 8;

                           for (int var102 = 0; var102 < this.field5637.field5594.length; var102++) {
                              if (this.field5637.field5594[var102] == var100 && this.field5637.field5597[var102] != null) {
                                 int var103 = (var96 - var52) * 8;
                                 int var104 = (var98 - var62) * 8;
                                 this.method9573(
                                    this.field5637.field5597[var102],
                                    var46,
                                    var52 * 8,
                                    var62 * 8,
                                    var89,
                                    (var96 & 7) * 8,
                                    (var98 & 7) * 8,
                                    var94,
                                    var103,
                                    var104
                                 );
                                 var72 = true;
                                 break;
                              }
                           }
                        }

                        if (!var72) {
                           this.method9579(var46, var52 * 8, var62 * 8);
                        }
                     }
                  }
               }

               for (int var47 = 0; var47 < 13; var47++) {
                  for (int var53 = 0; var53 < 13; var53++) {
                     int var63 = this.field5637.field5592[0][var47][var53];
                     if (var63 == -1) {
                        this.method9569(var47 * 8, var53 * 8, 8, 8);
                     }
                  }
               }

               for (int var48 = 0; var48 < 4; var48++) {
                  for (int var54 = 0; var54 < var37; var54++) {
                     for (int var64 = 0; var64 < var42; var64++) {
                        int var73 = this.field5637.field5592[var48][var54][var64];
                        if (var73 != -1) {
                           int var82 = var73 >> 24 & 3;
                           int var90 = var73 >> 1 & 3;
                           int var95 = var73 >> 14 & 1023;
                           int var97 = var73 >> 3 & 2047;
                           int var99 = (var95 / 8 << 8) + var97 / 8;

                           for (int var101 = 0; var101 < this.field5637.field5594.length; var101++) {
                              if (this.field5637.field5594[var101] == var99 && this.field5637.field5598[var101] != null) {
                                 this.method9594(
                                    this.field5636,
                                    this.field5637.field5598[var101],
                                    var48,
                                    var54 * 8,
                                    var64 * 8,
                                    var82,
                                    (var95 & 7) * 8,
                                    (var97 & 7) * 8,
                                    var90,
                                    this.field5657
                                 );
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.method9591();
            synchronized (ObjectComposition.ObjectDefinition_cachedModelData) {
               ObjectComposition.ObjectDefinition_cachedModelData.reset();
            }

            ObjectComposition.ObjectDefinition_cachedEntities.reset();
            if (this.field5636.isTopLevel()) {
               if (client.isLowDetail) {
                  this.field5656.method5793(Tiles.Tiles_minPlane * -957711027);
               } else {
                  this.field5656.method5793(0);
               }

               if (!this.field5637.field5591) {
                  int var39 = (this.field5649 - 6) / 8;
                  int var43 = (this.field5649 + 6) / 8;
                  int var49 = (this.field5651 - 6) / 8;
                  int var55 = (this.field5651 + 6) / 8;

                  for (int var65 = var39 - 1; var65 <= var43 + 1; var65++) {
                     for (int var74 = var49 - 1; var74 <= var55 + 1; var74++) {
                        if (var65 < var39 || var65 > var43 || var74 < var49 || var74 > var55) {
                           var1.method9108("m" + var65 + "_" + var74);
                           var1.method9108("l" + var65 + "_" + var74);
                        }
                     }
                  }
               }
            }

            this.field5656.method5730();
            this.field5663 = this.method9590();
            this.field5660 = this.method9580();
            if (!this.field5636.isTopLevel()) {
               if (this.field5624 != null) {
                  this.field5624.loadScene(this.field5636, this.field5656);
               }

               return true;
            } else {
               client.method2516(this.field5656);
               SecureUrlRequester.client.getCallbacks().post(new PreMapLoad(this.field5636, this.field5656));
               if (this.field5624 != null) {
                  this.field5624.loadScene(this.field5656);
                  this.field5624.loadScene(this.field5636, this.field5656);
               }

               return true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("dp")
   public static int method9581(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("kc")
   public static int method9589(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0;
      } else {
         return var2 == 2 ? 7 - var1 : var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("qr")
   public void method9579(int var1, int var2, int var3) {
      int var4 = var2 + this.field5629;
      int var5 = var3 + this.field5629;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 8; var7++) {
            this.field5662[var1][var6 + var4][var7 + var5] = 0;
         }
      }

      if (var4 > 0) {
         for (int var8 = 1; var8 < 8; var8++) {
            this.field5662[var1][var4][var8 + var5] = this.field5662[var1][var4 - 1][var8 + var5];
         }
      }

      if (var5 > 0) {
         for (int var9 = 1; var9 < 8; var9++) {
            this.field5662[var1][var9 + var4][var5] = this.field5662[var1][var9 + var4][var5 - 1];
         }
      }

      if (var4 > 0 && this.field5662[var1][var4 - 1][var5] != 0) {
         this.field5662[var1][var4][var5] = this.field5662[var1][var4 - 1][var5];
      } else if (var5 > 0 && this.field5662[var1][var4][var5 - 1] != 0) {
         this.field5662[var1][var4][var5] = this.field5662[var1][var4][var5 - 1];
      } else if (var4 > 0 && var5 > 0 && this.field5662[var1][var4 - 1][var5 - 1] != 0) {
         this.field5662[var1][var4][var5] = this.field5662[var1][var4 - 1][var5 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("vf")
   public void method9569(int var1, int var2, int var3, int var4) {
      for (int var5 = var2; var5 <= var4 + var2; var5++) {
         for (int var6 = var1; var6 <= var1 + var3; var6++) {
            if (var6 >= this.field5631 && var6 < this.field5634 && var5 >= this.field5632 && var5 < this.field5635) {
               int var7 = var6 + this.field5629;
               int var8 = var5 + this.field5629;
               this.field5639[0][var7][var8] = 127;
               if (var1 == var6 && var6 > 0) {
                  this.field5662[0][var7][var8] = this.field5662[0][var7 - 1][var8];
               }

               if (var1 + var3 == var6 && var6 < this.field5627 - 1) {
                  this.field5662[0][var7][var8] = this.field5662[0][var7 + 1][var8];
               }

               if (var5 == var2 && var5 > 0) {
                  this.field5662[0][var7][var8] = this.field5662[0][var7][var8 - 1];
               }

               if (var5 == var4 + var2 && var5 < this.field5628 - 1) {
                  this.field5662[0][var7][var8] = this.field5662[0][var7][var8 + 1];
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIILkk;)V")
   @ObfuscatedName("ow")
   public static void method9597(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
      FriendSystem.addObjects(var0, var1, var2, var3, var4, var5, var6, var7, -434056318);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("mp")
   public static int method9568(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 : 7 - var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   public void method9591() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field5625; var2++) {
            int var3 = var2 + this.field5629;

            for (int var4 = 0; var4 < this.field5626; var4++) {
               int var5 = var4 + this.field5629;
               if ((this.field5659[var1][var3][var5] & 1) == 1) {
                  int var6 = var1;
                  if ((this.field5659[1][var3][var5] & 2) == 2) {
                     var6 = var1 - 1;
                  }

                  if (var6 >= 0) {
                     this.field5657[var6].method6445(var2, var4);
                  }
               }
            }
         }
      }

      int var33 = (int)Math.sqrt(5100.0) * 768 >> 8;

      for (int var34 = 0; var34 < 4; var34++) {
         byte[][] var36 = this.field5639[var34];

         for (int var38 = 1; var38 < this.field5656.ySize - 1; var38++) {
            for (int var42 = 1; var42 < this.field5656.xSize - 1; var42++) {
               int var46 = this.field5662[var34][var42 + 1][var38] - this.field5662[var34][var42 - 1][var38];
               int var7 = this.field5662[var34][var42][var38 + 1] - this.field5662[var34][var42][var38 - 1];
               int var8 = (int)Math.sqrt(var7 * var7 + var46 * var46 + 65536);
               int var9 = (var46 << 8) / var8;
               int var10 = 65536 / var8;
               int var11 = (var7 << 8) / var8;
               int var12 = (var11 * -50 + var9 * -50 + var10 * -10) / var33 + 96;
               int var13 = (var36[var42][var38 + 1] >> 3)
                  + (var36[var42 - 1][var38] >> 2)
                  + (var36[var42][var38 - 1] >> 2)
                  + (var36[var42 + 1][var38] >> 3)
                  + (var36[var42][var38] >> 1);
               this.field5640[var42][var38] = var12 - var13;
            }
         }

         for (int var39 = 0; var39 < this.field5628; var39++) {
            this.field5633[var39] = 0;
            this.field5641[var39] = 0;
            this.field5642[var39] = 0;
            this.field5643[var39] = 0;
            this.field5644[var39] = 0;
         }

         for (int var40 = -5; var40 < this.field5627 + 5; var40++) {
            for (int var43 = 0; var43 < this.field5628; var43++) {
               int var47 = var40 + 5;
               if (var47 >= 0 && var47 < this.field5627) {
                  int var49 = this.field5647[var34][var47][var43] & 32767;
                  if (var49 > 0) {
                     FloorUnderlayDefinition var52 = this.method9578(var49 - 1);
                     this.field5633[var43] = this.field5633[var43] + var52.method4521();
                     this.field5641[var43] = this.field5641[var43] + var52.method4519();
                     this.field5642[var43] = this.field5642[var43] + var52.method4518();
                     this.field5643[var43] = this.field5643[var43] + var52.method4516();
                     this.field5644[var43]++;
                  }
               }

               int var50 = var40 - 5;
               if (var50 >= 0 && var50 < this.field5627) {
                  int var53 = this.field5647[var34][var50][var43] & 32767;
                  if (var53 > 0) {
                     FloorUnderlayDefinition var55 = this.method9578(var53 - 1);
                     this.field5633[var43] = this.field5633[var43] - var55.method4521();
                     this.field5641[var43] = this.field5641[var43] - var55.method4519();
                     this.field5642[var43] = this.field5642[var43] - var55.method4518();
                     this.field5643[var43] = this.field5643[var43] - var55.method4516();
                     this.field5644[var43]--;
                  }
               }
            }

            if (var40 >= 1 && var40 < this.field5627 - 1) {
               int var44 = 0;
               int var48 = 0;
               int var51 = 0;
               int var54 = 0;
               int var56 = 0;

               for (int var57 = -5; var57 < this.field5628 + 5; var57++) {
                  int var58 = var57 + 5;
                  if (var58 >= 0 && var58 < this.field5628) {
                     var44 += this.field5633[var58];
                     var48 += this.field5641[var58];
                     var51 += this.field5642[var58];
                     var54 += this.field5643[var58];
                     var56 += this.field5644[var58];
                  }

                  int var59 = var57 - 5;
                  if (var59 >= 0 && var59 < this.field5628) {
                     var44 -= this.field5633[var59];
                     var48 -= this.field5641[var59];
                     var51 -= this.field5642[var59];
                     var54 -= this.field5643[var59];
                     var56 -= this.field5644[var59];
                  }

                  if (var57 >= 1
                     && var57 < this.field5628 - 1
                     && (!client.isLowDetail || (this.field5659[0][var40][var57] & 2) != 0 || (this.field5659[var34][var40][var57] & 16) == 0)) {
                     if (var34 < Tiles.Tiles_minPlane * -957711027) {
                        Tiles.Tiles_minPlane = var34 * 84476805;
                     }

                     int var60 = this.field5647[var34][var40][var57] & 32767;
                     int var14 = this.field5664[var34][var40][var57] & 32767;
                     if (var60 > 0 || var14 > 0) {
                        int var15 = this.field5662[var34][var40][var57];
                        int var16 = this.field5662[var34][var40 + 1][var57];
                        int var17 = this.field5662[var34][var40 + 1][var57 + 1];
                        int var18 = this.field5662[var34][var40][var57 + 1];
                        int var19 = this.field5640[var40][var57];
                        int var20 = this.field5640[var40 + 1][var57];
                        int var21 = this.field5640[var40 + 1][var57 + 1];
                        int var22 = this.field5640[var40][var57 + 1];
                        int var23 = -1;
                        int var24 = -1;
                        if (var60 > 0) {
                           int var25 = var44 * 256 / var54;
                           int var26 = var48 / var56;
                           int var27 = var51 / var56;
                           var23 = method9588(var25, var26, var27);
                           var24 = var23;
                        }

                        int var61 = 0;
                        if (var24 != -1) {
                           var61 = Rasterizer3D.Rasterizer3D_colorPalette[method9583(var24, 96)];
                        }

                        if (var14 == 0) {
                           this.field5656
                              .method5807(
                                 var34,
                                 var40,
                                 var57,
                                 0,
                                 0,
                                 -1,
                                 var15,
                                 var16,
                                 var17,
                                 var18,
                                 method9583(var23, var19),
                                 method9583(var23, var20),
                                 method9583(var23, var21),
                                 method9583(var23, var22),
                                 0,
                                 0,
                                 0,
                                 0,
                                 var61,
                                 0
                              );
                        } else {
                           int var62 = this.field5658[var34][var40][var57] + 1;
                           byte var63 = this.field5661[var34][var40][var57];
                           FloorOverlayDefinition var28 = this.method9571(var14 - 1);
                           int var29 = var28.method5359();
                           int var30;
                           int var31;
                           if (var29 >= 0) {
                              var31 = WorldMapSection0.textureProvider.getDefaultColor(var29);
                              var30 = -1;
                           } else if (var28.method5362() == 16711935) {
                              var30 = -2;
                              var29 = -1;
                              var31 = -2;
                           } else {
                              var30 = method9588(class418.method9197(var28), var28.method5366(), var28.method5365());
                              var31 = var30;
                           }

                           int var32 = 0;
                           if (var31 != -2) {
                              var32 = Rasterizer3D.Rasterizer3D_colorPalette[method9587(var31, 96)];
                           }

                           if (var28.method5363() != -1) {
                              var31 = method9588(var28.method5360(), var28.method5364(), var28.method5361());
                              var32 = Rasterizer3D.Rasterizer3D_colorPalette[method9587(var31, 96)];
                           }

                           this.field5656
                              .method5807(
                                 var34,
                                 var40,
                                 var57,
                                 var62,
                                 var63,
                                 var29,
                                 var15,
                                 var16,
                                 var17,
                                 var18,
                                 method9583(var23, var19),
                                 method9583(var23, var20),
                                 method9583(var23, var21),
                                 method9583(var23, var22),
                                 method9587(var30, var19),
                                 method9587(var30, var20),
                                 method9587(var30, var21),
                                 method9587(var30, var22),
                                 var61,
                                 var32
                              );
                        }
                     }
                  }
               }
            }
         }

         for (int var41 = 1; var41 < this.field5628 - 1; var41++) {
            for (int var45 = 1; var45 < this.field5627 - 1; var45++) {
               this.field5656.method5792(var34, var45, var41, 0);
            }
         }
      }

      this.field5656.method5802(-50, -10, -50);

      for (int var35 = 0; var35 < this.field5627; var35++) {
         for (int var37 = 0; var37 < this.field5628; var37++) {
            if ((this.field5659[1][var35][var37] & 2) == 2) {
               this.field5656.method5801(var35, var37);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("hx")
   public static int method9583(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III[I)V")
   @ObfuscatedName("da")
   public void method9584(int var1, int var2, int var3, int[] var4) {
      if (this.field5653 != null) {
         try {
            this.field5653.seek(var1 * 25);
            this.field5653.writeByte(1);
            this.field5653.writeInt(var2);
            this.field5653.writeInt(var3);

            for (int var5 = 0; var5 < 4; var5++) {
               this.field5653.writeInt(var4[var5]);
            }
         } catch (IOException var6) {
            client.field938.error("io error saving xtea", var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("nl")
   public static int method9587(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("gt")
   public static int method9593(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      int var7 = var2 & 3;
      if (var7 == 0) {
         return var0;
      } else if (var7 == 1) {
         return var1;
      } else {
         return var7 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIII[Lkk;)V")
   @ObfuscatedName("ws")
   public void method9582(byte[] var1, int var2, int var3, int var4, int var5, CollisionMap[] var6) {
      assert var6 != null;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = var2; var8 < var2 + 64; var8++) {
            for (int var9 = var3; var9 < var3 + 64; var9++) {
               if (var6[var7].method6447(var8, var9)) {
                  var6[var7].method6441(var8, var9, 1073741824);
               }
            }
         }
      }

      Buffer var13 = new Buffer(var1);

      for (int var14 = 0; var14 < 4; var14++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var10 = 0; var10 < 64; var10++) {
               int var11 = var15 + var2;
               int var12 = var10 + var3;
               this.method9570(var13, var14, var11, var12, var4 + var11, var12 + var5, 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qn")
   public void method9575() {
      try {
         this.field5655.get();
      } catch (Throwable var2) {
         throw var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()[[[B")
   @ObfuscatedName("tz")
   public byte[][][] method9580() {
      byte[][][] var1 = new byte[4][this.field5625][this.field5626];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < this.field5625; var3++) {
            for (int var4 = 0; var4 < this.field5626; var4++) {
               var1[var2][var3][var4] = this.field5659[var2][var3 + this.field5629][var4 + this.field5629];
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mw")
   public void method9592() {
      assert this.field5655 == null;

      this.field5655 = field5646.submit(this);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("lj")
   public boolean method9585() {
      return this.field5655.isDone();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IIIIII)V")
   @ObfuscatedName("ab")
   public void method9570(Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 0 && var2 < 4 && var3 >= this.field5631 && var3 < this.field5634 && var4 >= this.field5632 && var4 < this.field5635) {
         int var12 = var3 + this.field5629;
         int var9 = var4 + this.field5629;
         this.field5659[var2][var12][var9] = 0;

         while (true) {
            int var10 = var1.method12219();
            if (var10 == 0) {
               if (var2 == 0) {
                  this.field5662[0][var12][var9] = -method9567(var5 + 932731, var6 + 556238) * 8;
               } else {
                  this.field5662[var2][var12][var9] = this.field5662[var2 - 1][var12][var9] - 240;
               }
               break;
            }

            if (var10 == 1) {
               int var11 = var1.method12221();
               if (var11 == 1) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  this.field5662[0][var12][var9] = -var11 * 8;
               } else {
                  this.field5662[var2][var12][var9] = this.field5662[var2 - 1][var12][var9] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               this.field5664[var2][var12][var9] = (short)var1.method12230();
               this.field5658[var2][var12][var9] = (byte)((var10 - 2) / 4);
               this.field5661[var2][var12][var9] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               this.field5659[var2][var12][var9] = (byte)(var10 - 49);
            } else {
               this.field5647[var2][var12][var9] = (short)(var10 - 81);
            }
         }
      } else {
         while (true) {
            int var8 = var1.method12219();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var1.method12221();
               break;
            }

            if (var8 <= 49) {
               var1.method12230();
            }
         }
      }
   }

   @Override
   public void run() {
      try {
         try {
            this.field5653 = new RandomAccessFile(JagexCache.userHomeDirectory + File.separator + "cache" + File.separator + "xtea", "rw");
         } catch (Exception var12) {
            client.field938.error("unable to setup xtea cache", var12);
         }

         while (!this.method9586()) {
            try {
               Thread.sleep(20L);
            } catch (InterruptedException var11) {
            }
         }
      } catch (Throwable var13) {
         method9595("map loading", var13);
         throw var13;
      } finally {
         try {
            if (this.field5653 != null) {
               this.field5653.close();
            }
         } catch (Exception var10) {
            client.field938.error("unable to setup xtea cache", var10);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("xc")
   public static int method9588(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      return (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("tt")
   public static int method9567(int var0, int var1) {
      int var2 = method9596(45365 + var0, 91923 + var1, 4)
         - 128
         + (method9596(var0 + 10294, 37821 + var1, 2) - 128 >> 1)
         + (method9596(var0, var1, 1) - 128 >> 2);
      var2 = (int)(var2 * 0.3) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()[[[I")
   @ObfuscatedName("as")
   public int[][][] method9590() {
      int[][][] var1 = new int[4][this.field5625 + 1][this.field5626 + 1];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < this.field5625 + 1; var3++) {
            for (int var4 = 0; var4 < this.field5626 + 1; var4++) {
               var1[var2][var3][var4] = this.field5662[var2][var3 + this.field5629][var4 + this.field5629];
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIII[Lkk;)V")
   @ObfuscatedName("sf")
   public void method9594(WorldView var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
      Buffer var11 = new Buffer(var2);
      int var12 = -1;

      while (true) {
         int var13 = var11.method12222();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while (true) {
            int var15 = var11.method12233();
            if (var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.method12221();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (var18 == var6 && var17 >= var7 && var17 < var7 + 8 && var16 >= var8 && var16 < var8 + 8) {
               ObjectComposition var22 = ObjectComposition.method5196(var12);
               int var23 = var4 + method9593(var17 & 7, var16 & 7, var9, var22.sizeX * 1813358617, var22.sizeY * -352504863, var21);
               int var24 = var5 + method9581(var17 & 7, var16 & 7, var9, var22.sizeX * 1813358617, var22.sizeY * -352504863, var21);
               if (var23 > this.field5631 && var24 > this.field5632 && var23 < this.field5634 - 1 && var24 < this.field5635 - 1) {
                  int var25 = var3;
                  if ((this.field5659[1][var23 + this.field5629][var24 + this.field5629] & 2) == 2) {
                     var25 = var3 - 1;
                  }

                  CollisionMap var26 = null;
                  if (var25 >= 0) {
                     var26 = var10[var25];
                  }

                  method9597(var1, var3, var23, var24, var12, var21 + var9 & 3, var20, var26);
               }
            }
         }
      }
   }
}
