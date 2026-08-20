import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl4")
public class rl4 implements Runnable {
   @ObfuscatedName("kl")
   public final int field5763;
   @ObfuscatedName("fa")
   public int field5786;
   @ObfuscatedName("by")
   public byte[][][] field5794;
   @ObfuscatedName("ba")
   public int field5785;
   @ObfuscatedSignature(descriptor = "Lxk;")
   @ObfuscatedName("ib")
   public final classXK field5772;
   @ObfuscatedName("za")
   public final int field5764;
   @ObfuscatedName("oy")
   public final int[] field5779;
   @ObfuscatedName("do")
   public short[][][] field5770;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("hj")
   public final WorldView field5771;
   @ObfuscatedName("lj")
   public int[][][] field5799;
   @ObfuscatedName("mk")
   public int field5787;
   @ObfuscatedName("vb")
   public int field5788;
   @ObfuscatedName("cm")
   public final int field5767;
   @ObfuscatedName("ki")
   public final int field5761;
   @ObfuscatedName("gt")
   public final int field5766;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ey")
   public EvictingDualNodeHashTable field5757;
   @ObfuscatedName("to")
   public final int[][][] field5776;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ne")
   public EvictingDualNodeHashTable field5756 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("zz")
   public int field5789;
   @ObfuscatedName("le")
   public final int field5760;
   @ObfuscatedName("xf")
   public final int[] field5781;
   @ObfuscatedName("ci")
   public final int[] field5782;
   @ObfuscatedName("kd")
   public final int field5765;
   @ObfuscatedName("yi")
   public final byte[][] field5774;
   @ObfuscatedName("nt")
   public static final ExecutorService field5784 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Map Loader");
      rl4.field5791 = var1;
      var1.setDaemon(true);
      return var1;
   });
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("me")
   public classNN field5758;
   @ObfuscatedName("or")
   public byte[][][] field5797;
   @ObfuscatedName("md")
   public final int field5762;
   @ObfuscatedName("jp")
   public byte[][][] field5796;
   @ObfuscatedSignature(descriptor = "Lez;")
   @ObfuscatedName("fu")
   public Scene field5790;
   @ObfuscatedName("do")
   public final int field5769;
   @ObfuscatedName("va")
   public final int[] field5783;
   @ObfuscatedName("hb")
   public int[][][] field5798;
   @ObfuscatedName("ms")
   public final DrawCallbacks field5759;
   @ObfuscatedName("de")
   public byte[][][] field5795;
   @ObfuscatedName("xt")
   public final byte[][][] field5777;
   @ObfuscatedName("co")
   public final byte[][] field5773;
   @ObfuscatedSignature(descriptor = "[Lgc;")
   @ObfuscatedName("id")
   public CollisionMap[] field5793;
   @ObfuscatedName("sv")
   public final int[][] field5778;
   @ObfuscatedName("pm")
   public final int[] field5780;
   @ObfuscatedName("hh")
   public Future field5792;
   @ObfuscatedName("xg")
   public static Thread field5791;
   @ObfuscatedName("qr")
   public short[][][] field5800;
   @ObfuscatedName("ko")
   public final int field5768;

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("hs")
   public static int method10081(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0;
      } else {
         return var2 == 2 ? 7 - var1 : var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("tf")
   public classOW method10100(int var1) {
      classOW var2 = (classOW)this.field5757.method6444(var1);
      if (var2 != null) {
         return var2;
      } else {
         classVP var3 = client.field1027[2];
         byte[] var4 = var3.loadData(4, var1);
         return new classOW(new classXY(var4), var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("nt")
   public static int method10107(int var0, int var1, int var2) {
      return classTA.method10731(var0, var1, var2, 778053024);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIII)V")
   @ObfuscatedName("cl")
   public void method10085(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 0 && var2 < 4 && var3 >= this.field5766 && var3 < this.field5768 && var4 >= this.field5767 && var4 < this.field5769) {
         int var12 = var3 + this.field5764;
         int var9 = var4 + this.field5764;
         this.field5797[var2][var12][var9] = 0;

         while (true) {
            int var10 = var1.method13271();
            if (var10 == 0) {
               if (var2 == 0) {
                  this.field5799[0][var12][var9] = -method10084(var5 + 932731, var6 + 556238) * 8;
               } else {
                  this.field5799[var2][var12][var9] = this.field5799[var2 - 1][var12][var9] - 240;
               }
               break;
            }

            if (var10 == 1) {
               int var11 = var1.method13267();
               if (var11 == 1) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  this.field5799[0][var12][var9] = -var11 * 8;
               } else {
                  this.field5799[var2][var12][var9] = this.field5799[var2 - 1][var12][var9] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               this.field5800[var2][var12][var9] = (short)var1.method13259();
               this.field5794[var2][var12][var9] = (byte)((var10 - 2) / 4);
               this.field5796[var2][var12][var9] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               this.field5797[var2][var12][var9] = (byte)(var10 - 49);
            } else {
               this.field5770[var2][var12][var9] = (short)(var10 - 81);
            }
         }
      } else {
         while (true) {
            int var8 = var1.method13271();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var1.method13267();
               break;
            }

            if (var8 <= 49) {
               var1.method13259();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("zc")
   public static int method10082(int var0, int var1) {
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

   public rl4(DrawCallbacks var1, int var2, WorldView var3, classXK var4) {
      this.field5757 = new EvictingDualNodeHashTable(64);
      this.field5758 = new classNN();

      assert var2 == 0 || var3.isTopLevel();

      this.field5759 = var1;
      this.field5760 = var3.field1696 * 1296729483;
      this.field5761 = var3.field1692 * -1269171107;
      int var5 = var3.isTopLevel() ? 40 : 0;
      this.field5762 = var3.field1696 * 1296729483 + var5 * 2;
      this.field5763 = var3.field1692 * -1269171107 + var5 * 2;
      this.field5764 = var5;
      this.field5765 = var2;
      this.field5766 = -var2 * 8;
      this.field5767 = -var2 * 8;
      this.field5768 = var3.field1696 * 1296729483 + var2 * 8;
      this.field5769 = var3.field1692 * -1269171107 + var2 * 8;
      this.field5771 = var3;
      this.field5772 = var4;
      this.field5773 = new byte[var4.field6887.length][];
      this.field5774 = new byte[var4.field6887.length][];
      this.field5776 = new int[4][this.field5762 + 1][this.field5763 + 1];
      this.field5777 = new byte[4][this.field5762 + 1][this.field5763 + 1];
      this.field5778 = new int[this.field5762 + 1][this.field5763 + 1];
      this.field5779 = new int[this.field5763];
      this.field5780 = new int[this.field5763];
      this.field5781 = new int[this.field5763];
      this.field5782 = new int[this.field5763];
      this.field5783 = new int[this.field5763];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xs")
   public void method10091() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field5760; var2++) {
            int var3 = var2 + this.field5764;

            for (int var4 = 0; var4 < this.field5761; var4++) {
               int var5 = var4 + this.field5764;
               if ((this.field5797[var1][var3][var5] & 1) == 1) {
                  int var6 = var1;
                  if ((this.field5797[1][var3][var5] & 2) == 2) {
                     var6 = var1 - 1;
                  }

                  if (var6 >= 0) {
                     this.field5793[var6].method5387(var2, var4);
                  }
               }
            }
         }
      }

      int var33 = (int)Math.sqrt(5100.0) * 768 >> 8;

      for (int var34 = 0; var34 < 4; var34++) {
         byte[][] var36 = this.field5777[var34];

         for (int var38 = 1; var38 < this.field5790.field2032 - 1; var38++) {
            for (int var42 = 1; var42 < this.field5790.field2056 - 1; var42++) {
               int var46 = this.field5799[var34][var42 + 1][var38] - this.field5799[var34][var42 - 1][var38];
               int var7 = this.field5799[var34][var42][var38 + 1] - this.field5799[var34][var42][var38 - 1];
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
               this.field5778[var42][var38] = var12 - var13;
            }
         }

         for (int var39 = 0; var39 < this.field5763; var39++) {
            this.field5779[var39] = 0;
            this.field5780[var39] = 0;
            this.field5781[var39] = 0;
            this.field5782[var39] = 0;
            this.field5783[var39] = 0;
         }

         for (int var40 = -5; var40 < this.field5762 + 5; var40++) {
            for (int var43 = 0; var43 < this.field5763; var43++) {
               int var47 = var40 + 5;
               if (var47 >= 0 && var47 < this.field5762) {
                  int var49 = this.field5770[var34][var47][var43] & 32767;
                  if (var49 > 0) {
                     classPH var52 = this.method10098(var49 - 1);
                     this.field5779[var43] = this.field5779[var43] + var52.method8895();
                     this.field5780[var43] = this.field5780[var43] + var52.method8894();
                     this.field5781[var43] = this.field5781[var43] + var52.method8893();
                     this.field5782[var43] = this.field5782[var43] + var52.method8892();
                     this.field5783[var43]++;
                  }
               }

               int var50 = var40 - 5;
               if (var50 >= 0 && var50 < this.field5762) {
                  int var53 = this.field5770[var34][var50][var43] & 32767;
                  if (var53 > 0) {
                     classPH var55 = this.method10098(var53 - 1);
                     this.field5779[var43] = this.field5779[var43] - var55.method8895();
                     this.field5780[var43] = this.field5780[var43] - var55.method8894();
                     this.field5781[var43] = this.field5781[var43] - var55.method8893();
                     this.field5782[var43] = this.field5782[var43] - var55.method8892();
                     this.field5783[var43]--;
                  }
               }
            }

            if (var40 >= 1 && var40 < this.field5762 - 1) {
               int var44 = 0;
               int var48 = 0;
               int var51 = 0;
               int var54 = 0;
               int var56 = 0;

               for (int var57 = -5; var57 < this.field5763 + 5; var57++) {
                  int var58 = var57 + 5;
                  if (var58 >= 0 && var58 < this.field5763) {
                     var44 += this.field5779[var58];
                     var48 += this.field5780[var58];
                     var51 += this.field5781[var58];
                     var54 += this.field5782[var58];
                     var56 += this.field5783[var58];
                  }

                  int var59 = var57 - 5;
                  if (var59 >= 0 && var59 < this.field5763) {
                     var44 -= this.field5779[var59];
                     var48 -= this.field5780[var59];
                     var51 -= this.field5781[var59];
                     var54 -= this.field5782[var59];
                     var56 -= this.field5783[var59];
                  }

                  if (var57 >= 1
                     && var57 < this.field5763 - 1
                     && (!client.field885 || (this.field5797[0][var40][var57] & 2) != 0 || (this.field5797[var34][var40][var57] & 16) == 0)) {
                     if (var34 < classDI.field1511 * -791964067) {
                        classDI.field1511 = var34 * 360312309;
                     }

                     int var60 = this.field5770[var34][var40][var57] & 32767;
                     int var14 = this.field5800[var34][var40][var57] & 32767;
                     if (var60 > 0 || var14 > 0) {
                        int var15 = this.field5799[var34][var40][var57];
                        int var16 = this.field5799[var34][var40 + 1][var57];
                        int var17 = this.field5799[var34][var40 + 1][var57 + 1];
                        int var18 = this.field5799[var34][var40][var57 + 1];
                        int var19 = this.field5778[var40][var57];
                        int var20 = this.field5778[var40 + 1][var57];
                        int var21 = this.field5778[var40 + 1][var57 + 1];
                        int var22 = this.field5778[var40][var57 + 1];
                        int var23 = -1;
                        int var24 = -1;
                        if (var60 > 0) {
                           int var25 = var44 * 256 / var54;
                           int var26 = var48 / var56;
                           int var27 = var51 / var56;
                           var23 = method10086(var25, var26, var27);
                           var24 = var23;
                        }

                        int var61 = 0;
                        if (var24 != -1) {
                           var61 = classFH.field2251[method10097(var24, 96)];
                        }

                        if (var14 == 0) {
                           this.field5790
                              .method4520(
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
                                 method10097(var23, var19),
                                 method10097(var23, var20),
                                 method10097(var23, var21),
                                 method10097(var23, var22),
                                 0,
                                 0,
                                 0,
                                 0,
                                 var61,
                                 0
                              );
                        } else {
                           int var62 = this.field5794[var34][var40][var57] + 1;
                           byte var63 = this.field5796[var34][var40][var57];
                           classOW var28 = this.method10100(var14 - 1);
                           int var29 = var28.method8810();
                           int var30;
                           int var31;
                           if (var29 >= 0) {
                              var31 = Ignored.field5839.getDefaultColor(var29);
                              var30 = -1;
                           } else if (var28.method8818() == 16711935) {
                              var30 = -2;
                              var29 = -1;
                              var31 = -2;
                           } else {
                              var30 = method10086(var28.method8811(), var28.method8817(), var28.method8814());
                              var31 = var30;
                           }

                           int var32 = 0;
                           if (var31 != -2) {
                              var32 = classFH.field2251[method10082(var31, 96)];
                           }

                           if (var28.method8813() != -1) {
                              var31 = method10086(var28.method8815(), var28.method8812(), var28.method8816());
                              var32 = classFH.field2251[method10082(var31, 96)];
                           }

                           this.field5790
                              .method4520(
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
                                 method10097(var23, var19),
                                 method10097(var23, var20),
                                 method10097(var23, var21),
                                 method10097(var23, var22),
                                 method10082(var30, var19),
                                 method10082(var30, var20),
                                 method10082(var30, var21),
                                 method10082(var30, var22),
                                 var61,
                                 var32
                              );
                        }
                     }
                  }
               }
            }
         }

         for (int var41 = 1; var41 < this.field5763 - 1; var41++) {
            for (int var45 = 1; var45 < this.field5762 - 1; var45++) {
               this.field5790.method4526(var34, var45, var41, 0);
            }
         }
      }

      this.field5790.method4514(-50, -10, -50);

      for (int var35 = 0; var35 < this.field5762; var35++) {
         for (int var37 = 0; var37 < this.field5763; var37++) {
            if ((this.field5797[1][var35][var37] & 2) == 2) {
               this.field5790.method4507(var35, var37);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("zt")
   public static int method10104(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 : 7 - var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIILgc;)V")
   @ObfuscatedName("if")
   public static void method10108(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
      classCI.method1518(var0, var1, var2, var3, var4, var5, var6, var7, 1070436096);
   }

   @ObfuscatedSignature(descriptor = "(I)Lph;")
   @ObfuscatedName("vn")
   public classPH method10098(int var1) {
      classPH var2 = (classPH)this.field5756.method6444(var1);
      if (var2 != null) {
         return var2;
      } else {
         classVP var3 = client.field1027[2];
         byte[] var4 = var3.loadData(1, var1);
         var2 = new classPH(new classXY(var4));
         this.field5756.method6445(var2, var1);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wk")
   public void method10102() {
      assert this.field5792 == null;

      this.field5792 = field5784.submit(this);
   }

   @ObfuscatedSignature(descriptor = "([BIIIIIIIII)V")
   @ObfuscatedName("wo")
   public void method10103(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap var11 = this.field5793[var2];

      for (int var12 = var3; var12 < var3 + 8; var12++) {
         for (int var13 = var4; var13 < var4 + 8; var13++) {
            if (var11.method5388(var12, var13)) {
               var11.method5383(var12, var13, 1073741824);
            }
         }
      }

      classXY var20 = new classXY(var1);

      for (int var21 = 0; var21 < 4; var21++) {
         for (int var14 = 0; var14 < 64; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var21 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  int var16 = var3 + method10104(var14 & 7, var15 & 7, var8);
                  int var17 = var4 + method10081(var14 & 7, var15 & 7, var8);
                  int var18 = var9 + var3 + (var14 & 7);
                  int var19 = var10 + var4 + (var15 & 7);
                  this.method10085(var20, var2, var16, var17, var18, var19, var8);
               } else {
                  this.method10085(var20, -1, -1, -1, 0, 0, 0);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("nm")
   public boolean method10095() {
      return this.field5792.isDone();
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eg")
   public void method10096(int var1, int var2, int var3, int var4) {
      for (int var5 = var2; var5 <= var4 + var2; var5++) {
         for (int var6 = var1; var6 <= var1 + var3; var6++) {
            if (var6 >= this.field5766 && var6 < this.field5768 && var5 >= this.field5767 && var5 < this.field5769) {
               int var7 = var6 + this.field5764;
               int var8 = var5 + this.field5764;
               this.field5777[0][var7][var8] = 127;
               if (var1 == var6 && var6 > 0) {
                  this.field5799[0][var7][var8] = this.field5799[0][var7 - 1][var8];
               }

               if (var1 + var3 == var6 && var6 < this.field5762 - 1) {
                  this.field5799[0][var7][var8] = this.field5799[0][var7 + 1][var8];
               }

               if (var5 == var2 && var5 > 0) {
                  this.field5799[0][var7][var8] = this.field5799[0][var7][var8 - 1];
               }

               if (var5 == var4 + var2 && var5 < this.field5763 - 1) {
                  this.field5799[0][var7][var8] = this.field5799[0][var7][var8 + 1];
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[[[B")
   @ObfuscatedName("gf")
   public byte[][][] method10105() {
      byte[][][] var1 = new byte[4][this.field5760][this.field5761];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < this.field5760; var3++) {
            for (int var4 = 0; var4 < this.field5761; var4++) {
               var1[var2][var3][var4] = this.field5797[var2][var3 + this.field5764][var4 + this.field5764];
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BII[Lgc;)V")
   @ObfuscatedName("wo")
   public void method10088(WorldView var1, byte[] var2, int var3, int var4, CollisionMap[] var5) {
      classXY var6 = new classXY(var2);
      int var7 = -1;

      while (true) {
         int var8 = var6.method13263();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while (true) {
            int var10 = var6.method13258();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method13267();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var3;
            int var18 = var11 + var4;
            if (var17 > this.field5766 && var18 > this.field5767 && var17 < this.field5768 - 1 && var18 < this.field5769 - 1) {
               int var19 = var13;
               if ((this.field5797[1][var17 + this.field5764][var18 + this.field5764] & 2) == 2) {
                  var19 = var13 - 1;
               }

               CollisionMap var20 = null;
               if (var19 >= 0) {
                  var20 = var5[var19];
               }

               method10108(var1, var13, var17, var18, var7, var16, var15, var20);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("sb")
   public static int method10086(int var0, int var1, int var2) {
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

   @ObfuscatedSignature(descriptor = "()[[[I")
   @ObfuscatedName("ad")
   public int[][][] method10089() {
      int[][][] var1 = new int[4][this.field5760 + 1][this.field5761 + 1];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < this.field5760 + 1; var3++) {
            for (int var4 = 0; var4 < this.field5761 + 1; var4++) {
               var1[var2][var3][var4] = this.field5799[var2][var3 + this.field5764][var4 + this.field5764];
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIIII[Lgc;)V")
   @ObfuscatedName("bw")
   public void method10099(WorldView var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
      classXY var11 = new classXY(var2);
      int var12 = -1;

      while (true) {
         int var13 = var11.method13263();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while (true) {
            int var15 = var11.method13258();
            if (var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.method13267();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (var18 == var6 && var17 >= var7 && var17 < var7 + 8 && var16 >= var8 && var16 < var8 + 8) {
               classOM var22 = classOM.method8603(var12);
               int var23 = var4 + method10083(var17 & 7, var16 & 7, var9, var22.field4944 * -582306509, var22.field4924 * 402876423, var21);
               int var24 = var5 + method10087(var17 & 7, var16 & 7, var9, var22.field4944 * -582306509, var22.field4924 * 402876423, var21);
               if (var23 > this.field5766 && var24 > this.field5767 && var23 < this.field5768 - 1 && var24 < this.field5769 - 1) {
                  int var25 = var3;
                  if ((this.field5797[1][var23 + this.field5764][var24 + this.field5764] & 2) == 2) {
                     var25 = var3 - 1;
                  }

                  CollisionMap var26 = null;
                  if (var25 >= 0) {
                     var26 = var10[var25];
                  }

                  method10108(var1, var3, var23, var24, var12, var21 + var9 & 3, var20, var26);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ea")
   public void method10101() {
      try {
         this.field5792.get();
      } catch (Throwable var2) {
         throw var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("yd")
   public static int method10087(int var0, int var1, int var2, int var3, int var4, int var5) {
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

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("wk")
   public static int method10083(int var0, int var1, int var2, int var3, int var4, int var5) {
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

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("wo")
   public void method10090(int var1, int var2, int var3) {
      int var4 = var2 + this.field5764;
      int var5 = var3 + this.field5764;

      for (int var6 = 0; var6 < 8; var6++) {
         for (int var7 = 0; var7 < 8; var7++) {
            this.field5799[var1][var6 + var4][var7 + var5] = 0;
         }
      }

      if (var4 > 0) {
         for (int var8 = 1; var8 < 8; var8++) {
            this.field5799[var1][var4][var8 + var5] = this.field5799[var1][var4 - 1][var8 + var5];
         }
      }

      if (var5 > 0) {
         for (int var9 = 1; var9 < 8; var9++) {
            this.field5799[var1][var9 + var4][var5] = this.field5799[var1][var9 + var4][var5 - 1];
         }
      }

      if (var4 > 0 && this.field5799[var1][var4 - 1][var5] != 0) {
         this.field5799[var1][var4][var5] = this.field5799[var1][var4 - 1][var5];
      } else if (var5 > 0 && this.field5799[var1][var4][var5 - 1] != 0) {
         this.field5799[var1][var4][var5] = this.field5799[var1][var4][var5 - 1];
      } else if (var4 > 0 && var5 > 0 && this.field5799[var1][var4 - 1][var5 - 1] != 0) {
         this.field5799[var1][var4][var5] = this.field5799[var1][var4 - 1][var5 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("eu")
   public static int method10084(int var0, int var1) {
      int var2 = method10107(45365 + var0, 91923 + var1, 4)
         - 128
         + (method10107(var0 + 10294, 37821 + var1, 2) - 128 >> 1)
         + (method10107(var0, var1, 1) - 128 >> 2);
      var2 = (int)(var2 * 0.3) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   @Override
   public void run() {
      try {
         while (!this.method10093()) {
            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
            }
         }
      } catch (Throwable var3) {
         method10109("map loading", var3);
         throw var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ey")
   public boolean method10093() {
      classVP var1 = client.field1027[5];
      int var2 = 0;

      for (int var3 = 0; var3 < this.field5772.field6887.length; var3++) {
         int var4 = this.field5772.field6887[var3];
         if (var4 != -1) {
            if (this.field5773[var3] == null) {
               boolean var5 = var1.getFileIds(var4) != null;
               this.field5773[var3] = var1.loadData(var4, 0);
               if (var5 && this.field5773[var3] == null) {
                  var2++;
               }
            }

            if (this.field5774[var3] == null) {
               boolean var34 = var1.getFileIds(var4) != null;
               this.field5774[var3] = var1.loadData(var4, 1);
               if (var34 && this.field5774[var3] == null) {
                  var2++;
               }
            }
         }
      }

      if (var2 > 0) {
         return false;
      } else {
         boolean var27 = true;

         for (int var28 = 0; var28 < this.field5773.length; var28++) {
            byte[] var35 = this.field5774[var28];
            if (var35 != null) {
               int var6 = (this.field5772.field6887[var28] >> 8) * 64 - this.field5789;
               int var7 = (this.field5772.field6887[var28] & 0xFF) * 64 - this.field5785;
               var27 &= this.method10106(var35, var6, var7);
            }
         }

         if (!var27) {
            return false;
         } else {
            this.field5799 = new int[4][this.field5762 + 1][this.field5763 + 1];
            this.field5790 = new Scene(
               this.field5771 == classIS.field3053,
               4,
               this.field5762,
               this.field5763,
               classAB.field122.field1350 * -412733521,
               classEX.field1977,
               this.field5799
            );
            this.field5790.field2112 = this.field5771.field1699 * 2140889407;
            this.field5790.field2161 = new rl10[4][this.field5760][this.field5761];
            this.field5790.field2147 = this.field5764;
            this.field5790.field2144 = this.field5766;
            this.field5790.field2145 = this.field5768;
            this.field5790.field2148 = this.field5767;
            this.field5790.field2111 = this.field5769;
            this.field5790.field2156 = false;
            this.field5793 = new CollisionMap[4];

            for (int var29 = 0; var29 < 4; var29++) {
               this.field5793[var29] = new CollisionMap(this.field5760, this.field5761, !this.field5771.isTopLevel());
            }

            this.field5797 = new byte[4][this.field5762][this.field5763];
            classDI.field1511 = 99 * 360312309;
            this.field5770 = new short[4][this.field5762][this.field5763];
            this.field5800 = new short[4][this.field5762][this.field5763];
            this.field5794 = new byte[4][this.field5762][this.field5763];
            this.field5796 = new byte[4][this.field5762][this.field5763];
            this.field5790.field2162 = this.field5770;
            this.field5790.field2017 = this.field5800;
            this.field5790.field2160 = this.field5794;
            this.field5790.field2159 = this.field5797;
            this.field5790.field2109 = this.field5789;
            this.field5790.field2146 = this.field5785;
            this.field5790.field2157 = this.field5772.field6884;
            this.field5790.field2074 = this.field5772.field6885;
            this.field5790.field2158 = this.field5772.field6887;
            if (!this.field5772.field6884) {
               byte var8 = 6;
               int var9 = 6 + this.field5765;
               int var10 = this.field5786 - var9 >> 3;
               int var11 = this.field5786 + var9 >> 3;
               int var12 = this.field5787 - var9 >> 3;
               int var13 = this.field5787 + var9 >> 3;
               int var14 = this.field5786 - var8 >> 3;
               int var15 = this.field5786 + var8 >> 3;
               int var16 = this.field5787 - var8 >> 3;
               int var17 = this.field5787 + var8 >> 3;
               int var18 = 0;

               for (int var19 = var10; var19 <= var11; var19++) {
                  for (int var20 = var12; var20 <= var13; var20++) {
                     if (var19 < var14 || var19 > var15 || var20 < var16 || var20 > var17) {
                        var18++;
                     }
                  }
               }

               int[] var30 = new int[var18];
               byte[][] var36 = new byte[var18][];
               byte[][] var39 = new byte[var18][];
               boolean[] var44 = new boolean[var18];
               int var98 = var10;

               for (int var99 = 0; var98 <= var11; var98++) {
                  for (int var21 = var12; var21 <= var13; var21++) {
                     if (var98 < var14 || var98 > var15 || var21 < var16 || var21 > var17) {
                        int var22 = var21 | var98 << 8;
                        var30[var99] = var22;
                        var36[var99] = var1.loadData(var22, 0);
                        var39[var99] = var1.loadData(var22, 1);
                        int var23 = var98 * 64 - this.field5789;
                        int var24 = var21 * 64 - this.field5785;
                        var44[var99] = var36[var99] != null && var39[var99] != null && this.method10106(var39[var99], var23, var24);
                        var99++;
                     }
                  }
               }

               for (int var49 = 0; var49 < this.field5773.length; var49++) {
                  byte[] var59 = this.field5773[var49];
                  if (var59 != null) {
                     var10 = this.field5772.field6887[var49];
                     var11 = (var10 >> 8 << 6) - this.field5789;
                     var12 = ((var10 & 0xFF) << 6) - this.field5785;

                     assert this.field5786 * 8 - 48 == this.field5789;

                     assert this.field5787 * 8 - 48 == this.field5785;

                     this.method10092(var59, var11, var12, this.field5789, this.field5785, this.field5793);
                  }
               }

               for (int var50 = 0; var50 < var30.length; var50++) {
                  if (var44[var50]) {
                     var9 = var30[var50];
                     var10 = (var9 >> 8 << 6) - this.field5789;
                     var11 = ((var9 & 0xFF) << 6) - this.field5785;
                     this.method10092(var36[var50], var10, var11, this.field5789, this.field5785, this.field5793);
                  }
               }

               for (int var51 = 0; var51 < this.field5773.length; var51++) {
                  byte[] var61 = this.field5773[var51];
                  if (var61 == null && this.field5787 < 800) {
                     var10 = this.field5772.field6887[var51];
                     var11 = (var10 >> 8 << 6) - this.field5789;
                     var12 = ((var10 & 0xFF) << 6) - this.field5785;
                     this.method10096(var11, var12, 64, 64);
                  }
               }

               for (int var52 = 0; var52 < var30.length; var52++) {
                  if (!var44[var52] && this.field5787 < 800) {
                     var9 = var30[var52];
                     var10 = (var9 >> 8 << 6) - this.field5789;
                     var11 = ((var9 & 0xFF) << 6) - this.field5785;
                     this.method10096(var10, var11, 64, 64);
                  }
               }

               client.method2323();

               for (int var53 = 0; var53 < this.field5773.length; var53++) {
                  byte[] var63 = this.field5774[var53];
                  if (var63 != null) {
                     var10 = this.field5772.field6887[var53];
                     var11 = (var10 >> 8 << 6) - this.field5789;
                     var12 = ((var10 & 0xFF) << 6) - this.field5785;
                     this.method10088(this.field5771, var63, var11, var12, this.field5793);
                  }
               }

               for (int var54 = 0; var54 < var30.length; var54++) {
                  if (var44[var54]) {
                     var9 = var30[var54];
                     var10 = (var9 >> 8 << 6) - this.field5789;
                     var11 = ((var9 & 0xFF) << 6) - this.field5785;
                     this.method10088(this.field5771, var39[var54], var10, var11, this.field5793);
                  }
               }

               client.method2372();
               client.method2323();
            } else {
               int var31 = this.field5760 / 8;
               int var37 = this.field5761 / 8;

               for (int var40 = 0; var40 < 4; var40++) {
                  for (int var45 = 0; var45 < var31; var45++) {
                     for (int var55 = 0; var55 < var37; var55++) {
                        boolean var65 = false;
                        int var74 = this.field5772.field6885[var40][var45][var55];
                        if (var74 != -1) {
                           int var82 = var74 >> 24 & 3;
                           int var87 = var74 >> 1 & 3;
                           int var89 = var74 >> 14 & 1023;
                           int var91 = var74 >> 3 & 2047;
                           int var93 = (var89 / 8 << 8) + var91 / 8;

                           for (int var95 = 0; var95 < this.field5772.field6887.length; var95++) {
                              if (this.field5772.field6887[var95] == var93 && this.field5773[var95] != null) {
                                 int var96 = (var89 - var45) * 8;
                                 int var97 = (var91 - var55) * 8;
                                 this.method10103(
                                    this.field5773[var95], var40, var45 * 8, var55 * 8, var82, (var89 & 7) * 8, (var91 & 7) * 8, var87, var96, var97
                                 );
                                 var65 = true;
                                 break;
                              }
                           }
                        }

                        if (!var65) {
                           this.method10090(var40, var45 * 8, var55 * 8);
                        }
                     }
                  }
               }

               for (int var41 = 0; var41 < 13; var41++) {
                  for (int var46 = 0; var46 < 13; var46++) {
                     int var56 = this.field5772.field6885[0][var41][var46];
                     if (var56 == -1) {
                        this.method10096(var41 * 8, var46 * 8, 8, 8);
                     }
                  }
               }

               for (int var42 = 0; var42 < 4; var42++) {
                  for (int var47 = 0; var47 < var31; var47++) {
                     for (int var57 = 0; var57 < var37; var57++) {
                        int var66 = this.field5772.field6885[var42][var47][var57];
                        if (var66 != -1) {
                           int var75 = var66 >> 24 & 3;
                           int var83 = var66 >> 1 & 3;
                           int var88 = var66 >> 14 & 1023;
                           int var90 = var66 >> 3 & 2047;
                           int var92 = (var88 / 8 << 8) + var90 / 8;

                           for (int var94 = 0; var94 < this.field5772.field6887.length; var94++) {
                              if (this.field5772.field6887[var94] == var92 && this.field5774[var94] != null) {
                                 this.method10099(
                                    this.field5771,
                                    this.field5774[var94],
                                    var42,
                                    var47 * 8,
                                    var57 * 8,
                                    var75,
                                    (var88 & 7) * 8,
                                    (var90 & 7) * 8,
                                    var83,
                                    this.field5793
                                 );
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.method10091();
            synchronized (classOM.field4968) {
               classOM.field4968.reset();
            }

            classOM.field4972.reset();
            if (this.field5771.isTopLevel()) {
               if (client.field885) {
                  this.field5790.method4500(classDI.field1511 * -791964067);
               } else {
                  this.field5790.method4500(0);
               }

               if (!this.field5772.field6884) {
                  int var33 = (this.field5786 - 6) / 8;
                  int var38 = (this.field5786 + 6) / 8;
                  int var43 = (this.field5787 - 6) / 8;
                  int var48 = (this.field5787 + 6) / 8;

                  for (int var58 = var33 - 1; var58 <= var38 + 1; var58++) {
                     for (int var67 = var43 - 1; var67 <= var48 + 1; var67++) {
                        if (var58 < var33 || var58 > var38 || var67 < var43 || var67 > var48) {
                           var1.method12055((var58 << 8) + var67);
                        }
                     }
                  }
               }
            }

            this.field5790.method4432();
            this.field5798 = this.method10089();
            this.field5795 = this.method10105();
            if (!this.field5771.isTopLevel()) {
               if (this.field5759 != null) {
                  this.field5759.loadScene(this.field5771, this.field5790);
               }

               return true;
            } else {
               client.method1953(this.field5790);
               classOE.field4843.getCallbacks().post(new PreMapLoad(this.field5771, this.field5790));
               if (this.field5759 != null) {
                  this.field5759.loadScene(this.field5790);
                  this.field5759.loadScene(this.field5771, this.field5790);
               }

               return true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)Z")
   @ObfuscatedName("rk")
   public boolean method10106(byte[] var1, int var2, int var3) {
      classXY var4 = new classXY(var1);
      int var5 = -1;
      boolean var6 = true;

      while (true) {
         int var7 = var4.method13263();
         if (var7 == 0) {
            return var6;
         }

         var5 += var7;
         int var8 = 0;

         while (true) {
            int var9 = var4.method13258();
            if (var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            var4.method13267();
            int var12 = var11 + var2;
            int var13 = var10 + var3;
            if (this.field5772.field6884 || var12 > this.field5766 && var13 > this.field5767 && var12 < this.field5768 - 1 && var13 < this.field5769 - 1) {
               classOM var14 = classOM.method8603(var5);
               if ((client.field1096 & 16) != 0 && var14.field4930 != null) {
                  if (!var14.method8605()) {
                     var6 = false;
                  }

                  for (int var15 = 0; var15 < var14.field4930.length; var15++) {
                     classOM var16 = classOM.method8603(var14.field4930[var15]);
                     if (!var16.method8605()) {
                        var6 = false;
                     }
                  }
               } else if (!var14.method8605()) {
                  var6 = false;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("gv")
   public static void method10109(String var0, Throwable var1) {
      classAAU.method275(var0, var1, (byte)102);
   }

   @ObfuscatedSignature(descriptor = "([BIIII[Lgc;)V")
   @ObfuscatedName("jl")
   public void method10092(byte[] var1, int var2, int var3, int var4, int var5, CollisionMap[] var6) {
      assert var6 != null;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = var2; var8 < var2 + 64; var8++) {
            for (int var9 = var3; var9 < var3 + 64; var9++) {
               if (var6[var7].method5388(var8, var9)) {
                  var6[var7].method5383(var8, var9, 1073741824);
               }
            }
         }
      }

      classXY var13 = new classXY(var1);

      for (int var14 = 0; var14 < 4; var14++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var10 = 0; var10 < 64; var10++) {
               int var11 = var15 + var2;
               int var12 = var10 + var3;
               this.method10085(var13, var14, var11, var12, var4 + var11, var12 + var5, 0);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cv")
   public static int method10097(int var0, int var1) {
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
}
