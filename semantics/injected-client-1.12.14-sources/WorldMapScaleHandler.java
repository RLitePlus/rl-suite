import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mr")
public class WorldMapScaleHandler {
   @ObfuscatedName("av")
   int pixelsPerTile;
   @ObfuscatedName("at")
   byte[][][] tileTemplates;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field3988 = 26;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field3989 = 72;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   int method7473(int var1) {
      if (9 == var1 || var1 == 10) {
         return 1;
      } else {
         return var1 == 11 ? 8 : var1;
      }
   }

   WorldMapScaleHandler(int var1) {
      this.pixelsPerTile = -1754604657 * var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method7495() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 1993728879 * this.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = this.pixelsPerTile * 1993728879 - 1; var4 >= 0; var4--) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var11 = 1993728879 * this.pixelsPerTile - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < 1993728879 * this.pixelsPerTile; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = 0; var13 < 1993728879 * this.pixelsPerTile; var13++) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method7504() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3 - 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][0] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 <= var13 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][1] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var14 = this.pixelsPerTile * 1993728879 - 1; var14 >= 0; var14--) {
         for (int var17 = this.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
            if (var17 <= var14 - 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
         for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
            if (var18 <= var15 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)V")
   @ObfuscatedName("av")
   void method7462(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (var7 != 0) {
            if (var9 <= -2080934139) {
               throw new IllegalStateException();
            }

            if (1993728879 * this.pixelsPerTile != 0) {
               if (var9 <= -2080934139) {
                  throw new IllegalStateException();
               }

               if (this.tileTemplates != null) {
                  var8 = this.method7466(var8, var7, -2137378658);
                  var7 = this.method7477(var7, (byte)-70);
                  Rasterizer2D.Rasterizer2D_drawGradientPixels(
                     var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile * 1993728879, true
                  );
                  return;
               }

               if (var9 <= -2080934139) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "mr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   int method7466(int var1, int var2, int var3) {
      try {
         if (9 == var2) {
            if (var3 >= -1549183693) {
               throw new IllegalStateException();
            }

            var1 = 1 + var1 & 3;
         }

         if (var2 == 10) {
            if (var3 >= -1549183693) {
               throw new IllegalStateException();
            }

            var1 = var1 + 3 & 3;
         }

         if (11 == var2) {
            if (var3 >= -1549183693) {
               throw new IllegalStateException();
            }

            var1 = var1 + 3 & 3;
         }

         return var1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "mr.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;)V")
   @ObfuscatedName("tr")
   public static void method7490(WorldMapScaleHandler var0) {
      byte[] var1 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
      int var2 = 0;

      for (int var3 = -571719971 * var0.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = 1993728879 * var0.pixelsPerTile - 1; var4 >= 0; var4--) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[2][0] = var1;
      var1 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 365392436];
      var2 = 0;

      for (int var11 = var0.pixelsPerTile * 1993728879 - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < var0.pixelsPerTile * 1993728879; var14++) {
            if (var14 >= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[2][1] = var1;
      var1 = new byte[-536516167 * var0.pixelsPerTile * -439004386 * var0.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < var0.pixelsPerTile * -1517743271; var12++) {
         for (int var15 = 0; var15 < 1993728879 * var0.pixelsPerTile; var15++) {
            if (var15 <= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[2][2] = var1;
      var1 = new byte[1993728879 * var0.pixelsPerTile * 669990984 * var0.pixelsPerTile];
      var2 = 0;

      for (int var13 = 0; var13 < var0.pixelsPerTile * 1993728879; var13++) {
         for (int var16 = 1993728879 * var0.pixelsPerTile - 1; var16 >= 0; var16--) {
            if (var16 >= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[2][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void init1(int var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         int var3 = 0;

         for (int var4 = 1993728879 * this.pixelsPerTile - 1; var4 >= 0; var4--) {
            if (var1 >= 1741769013) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < 1993728879 * this.pixelsPerTile; var5++) {
               if (var1 >= 1741769013) {
                  throw new IllegalStateException();
               }

               if (var5 <= var4 >> 1) {
                  if (var1 >= 1741769013) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[1][0] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var13 = 0; var13 < 1993728879 * this.pixelsPerTile; var13++) {
            if (var1 >= 1741769013) {
               throw new IllegalStateException();
            }

            for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
               if (var3 >= 0) {
                  if (var1 >= 1741769013) {
                     throw new IllegalStateException();
                  }

                  if (var3 < var2.length) {
                     if (var16 >= var13 << 1) {
                        if (var1 >= 1741769013) {
                           return;
                        }

                        var2[var3] = -1;
                     }

                     var3++;
                     continue;
                  }

                  if (var1 >= 1741769013) {
                     throw new IllegalStateException();
                  }
               }

               var3++;
            }
         }

         this.tileTemplates[1][1] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var14 = 0; var14 < 1993728879 * this.pixelsPerTile; var14++) {
            if (var1 >= 1741769013) {
               throw new IllegalStateException();
            }

            for (int var17 = this.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
               if (var1 >= 1741769013) {
                  throw new IllegalStateException();
               }

               if (var17 <= var14 >> 1) {
                  if (var1 >= 1741769013) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[1][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var15 = this.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var1 >= 1741769013) {
               throw new IllegalStateException();
            }

            for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
               if (var1 >= 1741769013) {
                  throw new IllegalStateException();
               }

               if (var18 >= var15 << 1) {
                  if (var1 >= 1741769013) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[1][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void init2(byte var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         int var3 = 0;

         for (int var4 = 1993728879 * this.pixelsPerTile - 1; var4 >= 0; var4--) {
            if (var1 >= 0) {
               return;
            }

            for (int var5 = 1993728879 * this.pixelsPerTile - 1; var5 >= 0; var5--) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var5 <= var4 >> 1) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[2][0] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
            if (var1 >= 0) {
               return;
            }

            for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
               if (var16 >= var13 << 1) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[2][1] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            for (int var17 = 0; var17 < 1993728879 * this.pixelsPerTile; var17++) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var17 <= var14 >> 1) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[2][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            for (int var18 = 1993728879 * this.pixelsPerTile - 1; var18 >= 0; var18--) {
               if (var18 >= var15 << 1) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[2][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   int method7474(int var1) {
      if (9 == var1 || var1 == 10) {
         return 1;
      } else {
         return var1 == 11 ? 8 : var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;II)I")
   @ObfuscatedName("fu")
   public static int method7467(WorldMapScaleHandler var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7485();
      }

      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   public static void method7487(byte var0) {
      try {
         Arrays.fill(Varps.Varps_temp, 0);
         Arrays.fill(Varps.Varps_main, 0);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "mr.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;)V")
   @ObfuscatedName("ic")
   public static void method7482(WorldMapScaleHandler var0) {
      byte[] var1 = new byte[var0.pixelsPerTile * -308797323 * 491740030 * var0.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.pixelsPerTile * 1335821267; var3++) {
         for (int var4 = 0; var4 < 1993728879 * var0.pixelsPerTile; var4++) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[0][0] = var1;
      var1 = new byte[-451273191 * var0.pixelsPerTile * 270894992 * var0.pixelsPerTile];
      var2 = 0;

      for (int var11 = var0.pixelsPerTile * 1228389140 - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < var0.pixelsPerTile * -401649027; var14++) {
            if (var14 <= var11) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[0][1] = var1;
      var1 = new byte[var0.pixelsPerTile * -1905473748 * -2000559777 * var0.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < var0.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < var0.pixelsPerTile * 1930693874; var15++) {
            if (var15 >= var12) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[0][2] = var1;
      var1 = new byte[369753062 * var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile];
      var2 = 0;

      for (int var13 = 1993728879 * var0.pixelsPerTile - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < var0.pixelsPerTile * -2060585640; var16++) {
            if (var16 >= var13) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[0][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   void init5(int var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         int var3 = 0;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var1 >= -1772541911) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < 1993728879 * this.pixelsPerTile; var5++) {
               if (var1 >= -1772541911) {
                  throw new IllegalStateException();
               }

               if (var5 <= 1993728879 * this.pixelsPerTile / 2) {
                  if (var1 >= -1772541911) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[5][0] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            for (int var18 = 0; var18 < this.pixelsPerTile * 1993728879; var18++) {
               if (var1 >= -1772541911) {
                  throw new IllegalStateException();
               }

               if (var15 <= 1993728879 * this.pixelsPerTile / 2) {
                  if (var1 >= -1772541911) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[5][1] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var1 >= -1772541911) {
               throw new IllegalStateException();
            }

            for (int var19 = 0; var19 < 1993728879 * this.pixelsPerTile; var19++) {
               if (var1 >= -1772541911) {
                  return;
               }

               if (var19 >= 1993728879 * this.pixelsPerTile / 2) {
                  if (var1 >= -1772541911) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[5][2] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var17 = 0; var17 < 1993728879 * this.pixelsPerTile; var17++) {
            if (var1 >= -1772541911) {
               throw new IllegalStateException();
            }

            for (int var20 = 0; var20 < this.pixelsPerTile * 1993728879; var20++) {
               if (var1 >= -1772541911) {
                  throw new IllegalStateException();
               }

               if (var17 >= this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 >= -1772541911) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[5][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void init(int var1) {
      try {
         if (null != this.tileTemplates) {
            if (var1 > 262832811) {
               ;
            }
         } else {
            this.tileTemplates = new byte[8][4][];
            this.init0((byte)84);
            this.init1(94118847);
            this.init2((byte)-114);
            this.init3(-1655335364);
            method7497(this, -1522121513);
            this.init5(-1826504378);
            method7505(this, -261967643);
            method7509(this, (byte)101);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mr.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ai")
   void method7463(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && -1443869562 * this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method7466(var8, var7, -1866259622);
         var7 = this.method7477(var7, (byte)-24);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(
            var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile * -275337315, true
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void init0(byte var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         int var3 = 0;

         for (int var4 = 0; var4 < this.pixelsPerTile * 1993728879; var4++) {
            for (int var5 = 0; var5 < 1993728879 * this.pixelsPerTile; var5++) {
               if (var1 <= 8) {
                  throw new IllegalStateException();
               }

               if (var5 <= var4) {
                  if (var1 <= 8) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[0][0] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
            if (var1 <= 8) {
               throw new IllegalStateException();
            }

            for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
               if (var1 <= 8) {
                  return;
               }

               if (var16 <= var13) {
                  if (var1 <= 8) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[0][1] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            for (int var17 = 0; var17 < this.pixelsPerTile * 1993728879; var17++) {
               if (var1 <= 8) {
                  throw new IllegalStateException();
               }

               if (var17 >= var14) {
                  if (var1 <= 8) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[0][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var15 = 1993728879 * this.pixelsPerTile - 1; var15 >= 0; var15--) {
            for (int var18 = 0; var18 < this.pixelsPerTile * 1993728879; var18++) {
               if (var1 <= 8) {
                  return;
               }

               if (var18 >= var15) {
                  if (var1 <= 8) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[0][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   int method7468(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   int method7469(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ah")
   int method7470(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void init3(int var1) {
      try {
         byte[] var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         int var3 = 0;

         for (int var4 = this.pixelsPerTile * 1993728879 - 1; var4 >= 0; var4--) {
            if (var1 == -1360800203) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < this.pixelsPerTile * 1993728879; var5++) {
               if (var1 == -1360800203) {
                  throw new IllegalStateException();
               }

               if (var5 >= var4 >> 1) {
                  if (var1 == -1360800203) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[3][0] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var13 = 0; var13 < 1993728879 * this.pixelsPerTile; var13++) {
            if (var1 == -1360800203) {
               throw new IllegalStateException();
            }

            for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
               if (var1 == -1360800203) {
                  return;
               }

               if (var16 <= var13 << 1) {
                  if (var1 == -1360800203) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[3][1] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var14 = 0; var14 < 1993728879 * this.pixelsPerTile; var14++) {
            if (var1 == -1360800203) {
               throw new IllegalStateException();
            }

            for (int var17 = 1993728879 * this.pixelsPerTile - 1; var17 >= 0; var17--) {
               if (var17 >= var14 >> 1) {
                  if (var1 == -1360800203) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[3][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var15 = this.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var1 == -1360800203) {
               throw new IllegalStateException();
            }

            for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
               if (var1 == -1360800203) {
                  throw new IllegalStateException();
               }

               if (var18 <= var15 << 1) {
                  if (var1 == -1360800203) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[3][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method7475(int var1) {
      if (9 == var1 || var1 == 10) {
         return 1;
      } else {
         return var1 == 11 ? 8 : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ny")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         WorldMapArchiveLoader.scrollBarSprites[0].drawAt(var0, var1);
         WorldMapArchiveLoader.scrollBarSprites[1].drawAt(var0, var1 + var3 - 16);
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, 16 + var1, 16, var3 - 32, client.field780 * 1259318399);
         int var6 = var3 * (var3 - 32) / var4;
         if (var6 < 8) {
            if (var5 >= 1838099199) {
               throw new IllegalStateException();
            }

            var6 = 8;
         }

         int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var7 + var1 + 16, 16, var6, client.field881 * -879348827);
         Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, 16 + var1 + var7, var6, 861497495 * client.field858);
         Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var7 + 16 + var1, var6, 861497495 * client.field858);
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, 16 + var1 + var7, 16, 861497495 * client.field858);
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var1 + 17 + var7, 16, client.field858 * 861497495);
         Rasterizer2D.Rasterizer2D_drawVerticalLine(15 + var0, 16 + var1 + var7, var6, 1137284357 * client.field797);
         Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, 17 + var1 + var7, var6 - 1, client.field797 * 1137284357);
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var7 + var1 + 15, 16, client.field797 * 1137284357);
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var1 + 14 + var7, 15, 1137284357 * client.field797);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "mr.ny(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method7476(int var1) {
      if (9 == var1 || var1 == 10) {
         return 1;
      } else {
         return var1 == 11 ? 8 : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   void method7479() {
      if (null == this.tileTemplates) {
         this.tileTemplates = new byte[8][4][];
         this.init0((byte)101);
         this.init1(-1842872484);
         this.init2((byte)-92);
         this.init3(-885512866);
         method7497(this, -1433897080);
         this.init5(-1895790000);
         method7505(this, -261967643);
         method7509(this, (byte)83);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;)V")
   @ObfuscatedName("yk")
   public static void method7496(WorldMapScaleHandler var0) {
      byte[] var1 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 1993728879 * var0.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = var0.pixelsPerTile * 1993728879 - 1; var4 >= 0; var4--) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[4][0] = var1;
      var1 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var11 = 1993728879 * var0.pixelsPerTile - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < 1993728879 * var0.pixelsPerTile; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[4][1] = var1;
      var1 = new byte[var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var12 = 0; var12 < var0.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < var0.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[4][2] = var1;
      var1 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = 0; var13 < 1993728879 * var0.pixelsPerTile; var13++) {
         for (int var16 = var0.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[4][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method7480() {
      if (null == this.tileTemplates) {
         this.tileTemplates = new byte[8][4][];
         this.init0((byte)39);
         this.init1(1441733109);
         this.init2((byte)-97);
         this.init3(1960419679);
         method7497(this, -1014332035);
         this.init5(-1840552717);
         method7505(this, -261967643);
         method7509(this, (byte)113);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method7484() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = this.pixelsPerTile * 1993728879 - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var14 <= var11) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = 1993728879 * this.pixelsPerTile - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 >= var13) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][3] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("no")
   public static void method7503(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8477(var1);
      } else {
         if (var0.method8599(1339616614) && !var1) {
            var0.method8619(Math.min(var0.field4658 * 1141616381, var0.field4661 * -178140633), var1, (short)512);
         } else if (-178140633 * var0.field4661 > 0) {
            var0.method8619(-178140633 * var0.field4661 - 1, var1, (short)512);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;I)V")
   @ObfuscatedName("gf")
   public static void method7497(WorldMapScaleHandler var0, int var1) {
      if (var0 == null) {
         var0.init4(var1);
      }

      try {
         byte[] var2 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
         int var3 = 0;

         for (int var4 = 1993728879 * var0.pixelsPerTile - 1; var4 >= 0; var4--) {
            if (var1 >= 552014347) {
               throw new IllegalStateException();
            }

            for (int var5 = var0.pixelsPerTile * 1993728879 - 1; var5 >= 0; var5--) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var5 >= var4 >> 1) {
                  if (var1 >= 552014347) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[4][0] = var2;
         var2 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var13 = 1993728879 * var0.pixelsPerTile - 1; var13 >= 0; var13--) {
            for (int var16 = 0; var16 < 1993728879 * var0.pixelsPerTile; var16++) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var16 <= var13 << 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[4][1] = var2;
         var2 = new byte[var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var14 = 0; var14 < var0.pixelsPerTile * 1993728879; var14++) {
            if (var1 >= 552014347) {
               throw new IllegalStateException();
            }

            for (int var17 = 0; var17 < var0.pixelsPerTile * 1993728879; var17++) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var17 >= var14 >> 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[4][2] = var2;
         var2 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var15 = 0; var15 < 1993728879 * var0.pixelsPerTile; var15++) {
            if (var1 >= 552014347) {
               return;
            }

            for (int var18 = var0.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
               if (var1 >= 552014347) {
                  return;
               }

               if (var18 <= var15 << 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[4][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method7485() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = this.pixelsPerTile * 1993728879 - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var14 <= var11) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = 1993728879 * this.pixelsPerTile - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 >= var13) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method7481() {
      if (null == this.tileTemplates) {
         this.tileTemplates = new byte[8][4][];
         this.init0((byte)21);
         this.init1(-1606775921);
         this.init2((byte)-98);
         this.init3(-1177898045);
         method7497(this, -1447809252);
         this.init5(-2003660121);
         method7505(this, -261967643);
         method7509(this, (byte)125);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   void method7498() {
      byte[] var1 = new byte[this.pixelsPerTile * -2004789575 * -1622911072 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = -1244053558 * this.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = this.pixelsPerTile * -929717183 - 1; var4 >= 0; var4--) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * -1585885817];
      var2 = 0;

      for (int var11 = -1167679496 * this.pixelsPerTile - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < 1000417187 * this.pixelsPerTile; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * -1117548487];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1131703026; var15++) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = 0; var13 < 1147237141 * this.pixelsPerTile; var13++) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method7486() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = this.pixelsPerTile * 1993728879 - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var14 <= var11) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = 1993728879 * this.pixelsPerTile - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 >= var13) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[0][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lmr;B)V")
   @ObfuscatedName("zm")
   public static void method7509(WorldMapScaleHandler var0, byte var1) {
      if (var0 == null) {
         var0.init7(var1);
      }

      try {
         byte[] var2 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
         int var3 = 0;
         var2 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
         var3 = 0;

         for (int var4 = 0; var4 < var0.pixelsPerTile * 1993728879; var4++) {
            if (var1 <= 15) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < 1993728879 * var0.pixelsPerTile; var5++) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var5 >= var4 - var0.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[7][0] = var2;
         var2 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
         var3 = 0;

         for (int var15 = var0.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var1 <= 15) {
               return;
            }

            for (int var18 = 0; var18 < var0.pixelsPerTile * 1993728879; var18++) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var18 >= var15 - var0.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[7][1] = var2;
         var2 = new byte[1993728879 * var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile];
         var3 = 0;

         for (int var16 = 1993728879 * var0.pixelsPerTile - 1; var16 >= 0; var16--) {
            if (var1 <= 15) {
               return;
            }

            for (int var19 = var0.pixelsPerTile * 1993728879 - 1; var19 >= 0; var19--) {
               if (var1 <= 15) {
                  return;
               }

               if (var19 >= var16 - var0.pixelsPerTile * 1993728879 / 2) {
                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[7][2] = var2;
         var2 = new byte[var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var17 = 0; var17 < 1993728879 * var0.pixelsPerTile; var17++) {
            for (int var20 = var0.pixelsPerTile * 1993728879 - 1; var20 >= 0; var20--) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var20 >= var17 - var0.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         var0.tileTemplates[7][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;)V")
   @ObfuscatedName("cu")
   public static void method7510(WorldMapScaleHandler var0) {
      byte[] var1 = new byte[var0.pixelsPerTile * -243976674 * 1105428104 * var0.pixelsPerTile];
      int var2 = 0;
      var1 = new byte[var0.pixelsPerTile * 1478288058 * 1241408810 * var0.pixelsPerTile];
      var2 = 0;

      for (int var3 = 0; var3 < var0.pixelsPerTile * 2046646442; var3++) {
         for (int var4 = 0; var4 < 1993728879 * var0.pixelsPerTile; var4++) {
            if (var4 >= var3 - var0.pixelsPerTile * -1628015506 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[7][0] = var1;
      var1 = new byte[var0.pixelsPerTile * 1306087059 * 1993728879 * var0.pixelsPerTile];
      var2 = 0;

      for (int var13 = var0.pixelsPerTile * -1338645385 - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < var0.pixelsPerTile * 1895164695; var16++) {
            if (var16 >= var13 - var0.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[7][1] = var1;
      var1 = new byte[-1509343618 * var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile];
      var2 = 0;

      for (int var14 = 1480093645 * var0.pixelsPerTile - 1; var14 >= 0; var14--) {
         for (int var17 = var0.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
            if (var17 >= var14 - var0.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[7][2] = var1;
      var1 = new byte[var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile * -1783129299];
      var2 = 0;

      for (int var15 = 0; var15 < 1993728879 * var0.pixelsPerTile; var15++) {
         for (int var18 = var0.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
            if (var18 >= var15 - var0.pixelsPerTile * 517259459 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[7][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method7493() {
      byte[] var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      int var2 = 0;

      for (int var3 = this.pixelsPerTile * 1993728879 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.pixelsPerTile * 1993728879; var4++) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = 0; var11 < 1993728879 * this.pixelsPerTile; var11++) {
         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var12 = 0; var12 < 1993728879 * this.pixelsPerTile; var12++) {
         for (int var15 = 1993728879 * this.pixelsPerTile - 1; var15 >= 0; var15--) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method7494() {
      byte[] var1 = new byte[-908717581 * this.pixelsPerTile * this.pixelsPerTile * -118667573];
      int var2 = 0;

      for (int var3 = this.pixelsPerTile * -324891934 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.pixelsPerTile * -1080902124; var4++) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = 0; var11 < 1993728879 * this.pixelsPerTile; var11++) {
         for (int var14 = 0; var14 < this.pixelsPerTile * -96697021; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][1] = var1;
      var1 = new byte[this.pixelsPerTile * -951800077 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var12 = 0; var12 < -1746061823 * this.pixelsPerTile; var12++) {
         for (int var15 = 1993728879 * this.pixelsPerTile - 1; var15 >= 0; var15--) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 2091544120 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[3][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   void method7499() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;

      for (int var3 = 1993728879 * this.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = this.pixelsPerTile * 1993728879 - 1; var4 >= 0; var4--) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][0] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var11 = 1993728879 * this.pixelsPerTile - 1; var11 >= 0; var11--) {
         for (int var14 = 0; var14 < 1993728879 * this.pixelsPerTile; var14++) {
            if (var14 <= var11 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var12 = 0; var12 < this.pixelsPerTile * 1993728879; var12++) {
         for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
            if (var15 >= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = 0; var13 < 1993728879 * this.pixelsPerTile; var13++) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 <= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[4][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ag")
   int method7477(int var1, byte var2) {
      try {
         if (9 != var1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var1 != 10) {
               if (var1 == 11) {
                  return 8;
               }

               return var1;
            }

            if (var2 == 0) {
               throw new IllegalStateException();
            }
         }

         return 1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "mr.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   void method7489() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      int var2 = 0;

      for (int var3 = 1993728879 * this.pixelsPerTile - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[1][0] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var11 = 0; var11 < 1993728879 * this.pixelsPerTile; var11++) {
         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var14 >= var11 << 1) {
                  var1[var2] = -1;
               }

               var2++;
            } else {
               var2++;
            }
         }
      }

      this.tileTemplates[1][1] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var12 = 0; var12 < 1993728879 * this.pixelsPerTile; var12++) {
         for (int var15 = this.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var15 <= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[1][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            if (var16 >= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[1][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method7502() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      int var2 = 0;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var3 = 0; var3 < 1993728879 * this.pixelsPerTile; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[5][0] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = 0; var13 < this.pixelsPerTile * 1993728879; var13++) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var13 <= 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[5][1] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
         for (int var17 = 0; var17 < 1993728879 * this.pixelsPerTile; var17++) {
            if (var17 >= 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[5][2] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var15 = 0; var15 < 1993728879 * this.pixelsPerTile; var15++) {
         for (int var18 = 0; var18 < this.pixelsPerTile * 1993728879; var18++) {
            if (var15 >= this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[5][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lmr;I)V")
   @ObfuscatedName("aj")
   public static void method7505(WorldMapScaleHandler var0, int var1) {
      if (var0 == null) {
         var0.init6(var1);
      } else {
         try {
            byte[] var2 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
            int var3 = 0;
            var2 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1993728879];
            var3 = 0;

            for (int var4 = 0; var4 < var0.pixelsPerTile * 1993728879; var4++) {
               if (var1 != -261967643) {
                  throw new IllegalStateException();
               }

               for (int var5 = 0; var5 < 1993728879 * var0.pixelsPerTile; var5++) {
                  if (var5 <= var4 - 1993728879 * var0.pixelsPerTile / 2) {
                     if (var1 != -261967643) {
                        throw new IllegalStateException();
                     }

                     var2[var3] = -1;
                  }

                  var3++;
               }
            }

            var0.tileTemplates[6][0] = var2;
            var2 = new byte[var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile * 1993728879];
            var3 = 0;

            for (int var15 = var0.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
               if (var1 != -261967643) {
                  return;
               }

               for (int var18 = 0; var18 < var0.pixelsPerTile * 1993728879; var18++) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  if (var18 <= var15 - var0.pixelsPerTile * 1993728879 / 2) {
                     if (var1 != -261967643) {
                        throw new IllegalStateException();
                     }

                     var2[var3] = -1;
                  }

                  var3++;
               }
            }

            var0.tileTemplates[6][1] = var2;
            var2 = new byte[1993728879 * var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile];
            var3 = 0;

            for (int var16 = var0.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
               for (int var19 = var0.pixelsPerTile * 1993728879 - 1; var19 >= 0; var19--) {
                  if (var1 != -261967643) {
                     return;
                  }

                  if (var19 <= var16 - 1993728879 * var0.pixelsPerTile / 2) {
                     if (var1 != -261967643) {
                        throw new IllegalStateException();
                     }

                     var2[var3] = -1;
                  }

                  var3++;
               }
            }

            var0.tileTemplates[6][2] = var2;
            var2 = new byte[1993728879 * var0.pixelsPerTile * 1993728879 * var0.pixelsPerTile];
            var3 = 0;

            for (int var17 = 0; var17 < var0.pixelsPerTile * 1993728879; var17++) {
               if (var1 != -261967643) {
                  throw new IllegalStateException();
               }

               for (int var20 = var0.pixelsPerTile * 1993728879 - 1; var20 >= 0; var20--) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  if (var20 <= var17 - var0.pixelsPerTile * 1993728879 / 2) {
                     if (var1 != -261967643) {
                        throw new IllegalStateException();
                     }

                     var2[var3] = -1;
                  }

                  var3++;
               }
            }

            var0.tileTemplates[6][3] = var2;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "mr.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("as")
   void method7464(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && -317664847 * this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method7466(var8, var7, -1898647061);
         var7 = this.method7477(var7, (byte)25);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(
            var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile * 1993728879, true
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method7506() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;
      var1 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 <= var3 - 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][0] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 <= var13 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][1] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var14 = this.pixelsPerTile * 1993728879 - 1; var14 >= 0; var14--) {
         for (int var17 = this.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
            if (var17 <= var14 - 1993728879 * this.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][2] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var15 = 0; var15 < this.pixelsPerTile * 1993728879; var15++) {
         for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
            if (var18 <= var15 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[6][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method7511() {
      byte[] var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      int var2 = 0;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var3 = 0; var3 < this.pixelsPerTile * 1993728879; var3++) {
         for (int var4 = 0; var4 < 1993728879 * this.pixelsPerTile; var4++) {
            if (var4 >= var3 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[7][0] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var13 = this.pixelsPerTile * 1993728879 - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < this.pixelsPerTile * 1993728879; var16++) {
            if (var16 >= var13 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[7][1] = var1;
      var1 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
      var2 = 0;

      for (int var14 = 1993728879 * this.pixelsPerTile - 1; var14 >= 0; var14--) {
         for (int var17 = this.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
            if (var17 >= var14 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[7][2] = var1;
      var1 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var15 = 0; var15 < 1993728879 * this.pixelsPerTile; var15++) {
         for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
            if (var18 >= var15 - this.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      this.tileTemplates[7][3] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;IIIIIIII)V")
   @ObfuscatedName("ut")
   public static void method7465(WorldMapScaleHandler var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0 == null) {
         var0.method7474(var1);
      }

      if (var7 != 0 && 1993728879 * var0.pixelsPerTile != 0 && var0.tileTemplates != null) {
         var8 = var0.method7466(var8, var7, -1597019976);
         var7 = var0.method7477(var7, (byte)-61);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(
            var1, var2, var5, var6, var3, var4, var0.tileTemplates[var7 - 1][var8], var0.pixelsPerTile * 1993728879, true
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("al")
   int method7471(int var1, int var2) {
      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;)V")
   @ObfuscatedName("kc")
   public static void method7507(WorldMapScaleHandler var0) {
      byte[] var1 = new byte[var0.pixelsPerTile * 1993728879 * 1993728879 * var0.pixelsPerTile];
      int var2 = 0;
      var1 = new byte[1993728879 * var0.pixelsPerTile * var0.pixelsPerTile * 1342605658];
      var2 = 0;

      for (int var3 = 0; var3 < var0.pixelsPerTile * -1433463344; var3++) {
         for (int var4 = 0; var4 < 896149720 * var0.pixelsPerTile; var4++) {
            if (var4 <= var3 - 161198339 * var0.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[6][0] = var1;
      var1 = new byte[var0.pixelsPerTile * -447847204 * var0.pixelsPerTile * 1993728879];
      var2 = 0;

      for (int var13 = var0.pixelsPerTile * -581386239 - 1; var13 >= 0; var13--) {
         for (int var16 = 0; var16 < var0.pixelsPerTile * 263729196; var16++) {
            if (var16 <= var13 - var0.pixelsPerTile * -1747471697 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[6][1] = var1;
      var1 = new byte[1993728879 * var0.pixelsPerTile * -1226098916 * var0.pixelsPerTile];
      var2 = 0;

      for (int var14 = var0.pixelsPerTile * 1993728879 - 1; var14 >= 0; var14--) {
         for (int var17 = var0.pixelsPerTile * 1993728879 - 1; var17 >= 0; var17--) {
            if (var17 <= var14 - 1993728879 * var0.pixelsPerTile / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[6][2] = var1;
      var1 = new byte[-1955403548 * var0.pixelsPerTile * 1193826798 * var0.pixelsPerTile];
      var2 = 0;

      for (int var15 = 0; var15 < var0.pixelsPerTile * 1168727356; var15++) {
         for (int var18 = var0.pixelsPerTile * 1189756177 - 1; var18 >= 0; var18--) {
            if (var18 <= var15 - var0.pixelsPerTile * 1993728879 / 2) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.tileTemplates[6][3] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmr;II)I")
   @ObfuscatedName("ku")
   public static int method7472(WorldMapScaleHandler var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7481();
      }

      if (9 == var2) {
         var1 = 1 + var1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (11 == var2) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("nj")
   static final void Widget_addToMenu(Widget var0, int var1) {
      try {
         if (var0.buttonType * 596322169 == 1) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            VerticalAlignment.method4597(var0.buttonText, "", 24, 0, 0, 278777747 * var0.id, var0.itemId * -231674939, -702991691);
         }

         if (2 == 596322169 * var0.buttonType) {
            if (var1 >= 599765192) {
               return;
            }

            if (!client.isSpellSelected) {
               if (var1 >= 599765192) {
                  throw new IllegalStateException();
               }

               String var2 = ItemComposition.Widget_getSpellActionName(var0, 1856236874);
               if (null != var2) {
                  if (var1 >= 599765192) {
                     throw new IllegalStateException();
                  }

                  VerticalAlignment.method4597(
                     var2, class144.colorStartTag(65280, -296254822) + var0.field4506, 25, 0, -1, var0.id * 278777747, -231674939 * var0.itemId, 1416600624
                  );
               }
            }
         }

         if (3 == var0.buttonType * 596322169) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            client.insertMenuItemNoShift(Strings.field5029, "", 26, 0, 0, var0.id * 278777747, 567164384);
         }

         if (4 == 596322169 * var0.buttonType) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            client.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id * 278777747, 1787299020);
         }

         if (596322169 * var0.buttonType == 5) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            client.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id * 278777747, 1992295941);
         }

         if (596322169 * var0.buttonType == 6) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            if (client.meslayerContinueWidget == null) {
               if (var1 >= 599765192) {
                  return;
               }

               client.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, 278777747 * var0.id, -847307478);
            }
         }

         if (var0.isIf3) {
            if (var1 >= 599765192) {
               throw new IllegalStateException();
            }

            if (client.isSpellSelected) {
               int var3 = class191.getWidgetFlags(var0, (byte)75);
               boolean var10 = 0 != (var3 >> 21 & 1);
               if (var10) {
                  if (var1 >= 599765192) {
                     throw new IllegalStateException();
                  }

                  if (32 == (DesktopPlatformInfoProvider.selectedSpellFlags * 485276933 & 32)) {
                     if (var1 >= 599765192) {
                        throw new IllegalStateException();
                     }

                     VerticalAlignment.method4597(
                        client.selectedSpellActionName,
                        client.selectedSpellName + " " + classDF.field1350 + " " + var0.dataText,
                        58,
                        0,
                        var0.childIndex * 2077538819,
                        278777747 * var0.id,
                        -231674939 * var0.itemId,
                        -109084504
                     );
                  }
               }
            } else {
               for (int var11 = 31; var11 >= 0; var11--) {
                  if (530396407 * var0.targetPriority == var11) {
                     if (var1 >= 599765192) {
                        throw new IllegalStateException();
                     }

                     String var13 = ItemComposition.Widget_getSpellActionName(var0, 1870820948);
                     if (var13 != null) {
                        VerticalAlignment.method4597(
                           var13, var0.dataText, 25, 0, var0.childIndex * 2077538819, 278777747 * var0.id, var0.itemId * -231674939, -912492954
                        );
                     }
                  }

                  String var14 = GrandExchangeOfferNameComparator.method9137(var0, var11, (byte)-59);
                  if (null != var14) {
                     int var4;
                     short var5;
                     if (var11 > 530396407 * var0.targetPriority) {
                        var5 = 1007;
                        var4 = VerticalAlignment.method4597(
                           var14, var0.dataText, var5, 1 + var11, var0.childIndex * 2077538819, var0.id * 278777747, -231674939 * var0.itemId, -1512002774
                        );
                     } else {
                        var5 = 57;
                        var4 = ClanChannel.insertMenuItem(
                           var14,
                           var0.dataText,
                           var5,
                           var11 + 1,
                           2077538819 * var0.childIndex,
                           var0.id * 278777747,
                           -231674939 * var0.itemId,
                           var0.prioritizeMenuEntry,
                           -1,
                           65535
                        );
                     }

                     if (null != var0.field4536) {
                        if (var1 >= 599765192) {
                           return;
                        }

                        if (var11 < var0.field4536.length && var0.field4536[var11] != null) {
                           if (var1 >= 599765192) {
                              throw new IllegalStateException();
                           }

                           String[] var6 = var0.field4536[var11];

                           for (int var7 = var6.length - 1; var7 >= 0; var7--) {
                              if (var1 >= 599765192) {
                                 throw new IllegalStateException();
                              }

                              int var8 = 1 + var7 << 16 | 1 + var11;
                              if (null != var6[var7]) {
                                 if (var1 >= 599765192) {
                                    throw new IllegalStateException();
                                 }

                                 if (!var6[var7].isEmpty()) {
                                    if (var1 >= 599765192) {
                                       throw new IllegalStateException();
                                    }

                                    Language.method8872(
                                       var4,
                                       var6[var7],
                                       "",
                                       var5,
                                       var8,
                                       2077538819 * var0.childIndex,
                                       278777747 * var0.id,
                                       var0.itemId * -231674939,
                                       -1,
                                       1976279533
                                    );
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               int var15 = class191.getWidgetFlags(var0, (byte)75);
               boolean var10000;
               if ((var15 & 1) != 0) {
                  if (var1 >= 599765192) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var12 = var10000;
               if (var12) {
                  if (var1 >= 599765192) {
                     throw new IllegalStateException();
                  }

                  client.insertMenuItemNoShift(Strings.field4859, "", 30, 0, var0.childIndex * 2077538819, 278777747 * var0.id, -1340020475);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "mr.nj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   void init6(int var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         int var3 = 0;
         var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var4 = 0; var4 < this.pixelsPerTile * 1993728879; var4++) {
            if (var1 != -261967643) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < 1993728879 * this.pixelsPerTile; var5++) {
               if (var5 <= var4 - 1993728879 * this.pixelsPerTile / 2) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[6][0] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var15 = this.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var1 != -261967643) {
               return;
            }

            for (int var18 = 0; var18 < this.pixelsPerTile * 1993728879; var18++) {
               if (var1 != -261967643) {
                  throw new IllegalStateException();
               }

               if (var18 <= var15 - this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[6][1] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var16 = this.pixelsPerTile * 1993728879 - 1; var16 >= 0; var16--) {
            for (int var19 = this.pixelsPerTile * 1993728879 - 1; var19 >= 0; var19--) {
               if (var1 != -261967643) {
                  return;
               }

               if (var19 <= var16 - 1993728879 * this.pixelsPerTile / 2) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[6][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var17 = 0; var17 < this.pixelsPerTile * 1993728879; var17++) {
            if (var1 != -261967643) {
               throw new IllegalStateException();
            }

            for (int var20 = this.pixelsPerTile * 1993728879 - 1; var20 >= 0; var20--) {
               if (var1 != -261967643) {
                  throw new IllegalStateException();
               }

               if (var20 <= var17 - this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 != -261967643) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[6][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void init4(int var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         int var3 = 0;

         for (int var4 = 1993728879 * this.pixelsPerTile - 1; var4 >= 0; var4--) {
            if (var1 >= 552014347) {
               throw new IllegalStateException();
            }

            for (int var5 = this.pixelsPerTile * 1993728879 - 1; var5 >= 0; var5--) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var5 >= var4 >> 1) {
                  if (var1 >= 552014347) {
                     return;
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[4][0] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var13 = 1993728879 * this.pixelsPerTile - 1; var13 >= 0; var13--) {
            for (int var16 = 0; var16 < 1993728879 * this.pixelsPerTile; var16++) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var16 <= var13 << 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[4][1] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var14 = 0; var14 < this.pixelsPerTile * 1993728879; var14++) {
            if (var1 >= 552014347) {
               throw new IllegalStateException();
            }

            for (int var17 = 0; var17 < this.pixelsPerTile * 1993728879; var17++) {
               if (var1 >= 552014347) {
                  throw new IllegalStateException();
               }

               if (var17 >= var14 >> 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[4][2] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var15 = 0; var15 < 1993728879 * this.pixelsPerTile; var15++) {
            if (var1 >= 552014347) {
               return;
            }

            for (int var18 = this.pixelsPerTile * 1993728879 - 1; var18 >= 0; var18--) {
               if (var1 >= 552014347) {
                  return;
               }

               if (var18 <= var15 << 1) {
                  if (var1 >= 552014347) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[4][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void init7(byte var1) {
      try {
         byte[] var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         int var3 = 0;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var4 = 0; var4 < this.pixelsPerTile * 1993728879; var4++) {
            if (var1 <= 15) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < 1993728879 * this.pixelsPerTile; var5++) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var5 >= var4 - this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[7][0] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var15 = this.pixelsPerTile * 1993728879 - 1; var15 >= 0; var15--) {
            if (var1 <= 15) {
               return;
            }

            for (int var18 = 0; var18 < this.pixelsPerTile * 1993728879; var18++) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var18 >= var15 - this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[7][1] = var2;
         var2 = new byte[1993728879 * this.pixelsPerTile * 1993728879 * this.pixelsPerTile];
         var3 = 0;

         for (int var16 = 1993728879 * this.pixelsPerTile - 1; var16 >= 0; var16--) {
            if (var1 <= 15) {
               return;
            }

            for (int var19 = this.pixelsPerTile * 1993728879 - 1; var19 >= 0; var19--) {
               if (var1 <= 15) {
                  return;
               }

               if (var19 >= var16 - this.pixelsPerTile * 1993728879 / 2) {
                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[7][2] = var2;
         var2 = new byte[this.pixelsPerTile * 1993728879 * this.pixelsPerTile * 1993728879];
         var3 = 0;

         for (int var17 = 0; var17 < 1993728879 * this.pixelsPerTile; var17++) {
            for (int var20 = this.pixelsPerTile * 1993728879 - 1; var20 >= 0; var20--) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (var20 >= var17 - this.pixelsPerTile * 1993728879 / 2) {
                  if (var1 <= 15) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               var3++;
            }
         }

         this.tileTemplates[7][3] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mr.az(" + ')');
      }
   }
}
