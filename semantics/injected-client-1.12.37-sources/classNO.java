import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("no")
public class classNO extends Node {
   @ObfuscatedName("af")
   byte[] field4693;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("az")
   NodeHashTable field4694;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lno;")
   @ObfuscatedName("ac")
   public static classNO method7944(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -905381686);
      return var3 == null ? null : new classNO(new Buffer(var3));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method7937() {
      if (this.field4694 == null) {
         this.field4694 = new NodeHashTable(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         classNC var4 = new classNC(this.field4693);
         int var5 = var4.method7775();

         for (int var6 = 0; var6 < var5; var6++) {
            var4.method7779(var6);
            var4.method7789(var6);
            var4.method7780(var6);
         }

         while (true) {
            int var15 = var4.method7809();
            int var7 = var4.field4656[var15];

            while (var4.field4656[var15] == var7) {
               var4.method7779(var15);
               int var8 = classAT.method692(var4, var15);
               if (var8 == 1) {
                  var4.method7787();
                  var4.method7780(var15);
                  if (var4.method7812()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               if (var9 == 176) {
                  int var10 = var8 & 15;
                  int var11 = var8 >> 8 & 127;
                  int var12 = var8 >> 16 & 127;
                  if (var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if (var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if (var9 == 192) {
                  int var16 = var8 & 15;
                  int var18 = var8 >> 8 & 127;
                  var2[var16] = var1[var16] + var18;
               }

               if (var9 == 144) {
                  int var17 = var8 & 15;
                  int var19 = var8 >> 8 & 127;
                  int var20 = var8 >> 16 & 127;
                  if (var20 > 0) {
                     int var13 = var2[var17];
                     classNJ var14 = (classNJ)this.field4694.method13363(var13);
                     if (var14 == null) {
                        var14 = new classNJ(var7);
                        this.field4694.method13372(var14, var13);
                     }

                     var14.field4674.set(var19);
                  }
               }

               var4.method7789(var15);
               var4.method7780(var15);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lno;)V")
   @ObfuscatedName("gb")
   public static void method7938(classNO var0) {
      if (var0 == null) {
         var0.method7942();
      } else if (var0.field4694 == null) {
         var0.field4694 = new NodeHashTable(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         classNC var4 = new classNC(var0.field4693);
         int var5 = var4.method7775();

         for (int var6 = 0; var6 < var5; var6++) {
            var4.method7779(var6);
            var4.method7789(var6);
            var4.method7780(var6);
         }

         while (true) {
            int var15 = var4.method7809();
            int var7 = var4.field4656[var15];

            while (var4.field4656[var15] == var7) {
               var4.method7779(var15);
               int var8 = classAT.method692(var4, var15);
               if (var8 == 1) {
                  var4.method7787();
                  var4.method7780(var15);
                  if (var4.method7812()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               if (var9 == 176) {
                  int var10 = var8 & 15;
                  int var11 = var8 >> 8 & 127;
                  int var12 = var8 >> 16 & 127;
                  if (var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if (var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if (var9 == 192) {
                  int var16 = var8 & 15;
                  int var18 = var8 >> 8 & 127;
                  var2[var16] = var1[var16] + var18;
               }

               if (var9 == 144) {
                  int var17 = var8 & 15;
                  int var19 = var8 >> 8 & 127;
                  int var20 = var8 >> 16 & 127;
                  if (var20 > 0) {
                     int var13 = var2[var17];
                     classNJ var14 = (classNJ)var0.field4694.method13363(var13);
                     if (var14 == null) {
                        var14 = new classNJ(var7);
                        var0.field4694.method13372(var14, var13);
                     }

                     var14.field4674.set(var19);
                  }
               }

               var4.method7789(var15);
               var4.method7780(var15);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Lno;")
   @ObfuscatedName("ae")
   public static classNO method7945(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -2087702018);
      return var3 == null ? null : new classNO(new Buffer(var3));
   }

   @ObfuscatedSignature(descriptor = "(Lno;)V")
   @ObfuscatedName("hh")
   public static void method7940(classNO var0) {
      if (var0 == null) {
         var0.method7943();
      }

      var0.field4694 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method7939() {
      if (this.field4694 == null) {
         this.field4694 = new NodeHashTable(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         classNC var4 = new classNC(this.field4693);
         int var5 = var4.method7775();

         for (int var6 = 0; var6 < var5; var6++) {
            var4.method7779(var6);
            var4.method7789(var6);
            var4.method7780(var6);
         }

         while (true) {
            int var15 = var4.method7809();
            int var7 = var4.field4656[var15];

            while (var4.field4656[var15] == var7) {
               var4.method7779(var15);
               int var8 = classAT.method692(var4, var15);
               if (var8 == 1) {
                  var4.method7787();
                  var4.method7780(var15);
                  if (var4.method7812()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               if (var9 == 176) {
                  int var10 = var8 & 15;
                  int var11 = var8 >> 8 & 127;
                  int var12 = var8 >> 16 & 127;
                  if (var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if (var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if (var9 == 192) {
                  int var16 = var8 & 15;
                  int var18 = var8 >> 8 & 127;
                  var2[var16] = var1[var16] + var18;
               }

               if (var9 == 144) {
                  int var17 = var8 & 15;
                  int var19 = var8 >> 8 & 127;
                  int var20 = var8 >> 16 & 127;
                  if (var20 > 0) {
                     int var13 = var2[var17];
                     classNJ var14 = (classNJ)this.field4694.method13363(var13);
                     if (var14 == null) {
                        var14 = new classNJ(var7);
                        this.field4694.method13372(var14, var13);
                     }

                     var14.field4674.set(var19);
                  }
               }

               var4.method7789(var15);
               var4.method7780(var15);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvl;)I")
   @ObfuscatedName("cz")
   public static int method7936(classVL var0) {
      return var0 == null ? var0.method11988() : var0.field6524 * 704907875;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method7941() {
      this.field4694 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lno;")
   @ObfuscatedName("ao")
   public static classNO method7946(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -655052792);
      return var3 == null ? null : new classNO(new Buffer(var3));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lno;")
   @ObfuscatedName("aa")
   public static classNO method7947(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -982143527);
      return var3 == null ? null : new classNO(new Buffer(var3));
   }

   classNO(Buffer var1) {
      var1.offset = (var1.array.length - 3) * -1095856699;
      int var2 = Buffer.method13039(var1, -346779531);
      int var3 = Buffer.method13047(var1, -1180217916);
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
            int var15 = Buffer.method13039(var1, -346779531);
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
      int var72 = var1.offset * 702114061;
      int var73 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for (int var74 = 0; var74 < var73; var74++) {
         var1.method13116(-803618091);
      }

      var4 += var1.offset * 702114061 - var72;
      int var75 = var1.offset * 702114061;
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
         var28 = var28 + Buffer.method13039(var1, -346779531) & 127;
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

      int var77 = 0;
      int var30 = var1.offset * 702114061;
      var1.offset += var26 * -1095856699;
      int var31 = var1.offset * 702114061;
      var1.offset += var11 * -1095856699;
      int var32 = var1.offset * 702114061;
      var1.offset += var10 * -1095856699;
      int var33 = var1.offset * 702114061;
      var1.offset += var9 * -1095856699;
      int var34 = var1.offset * 702114061;
      var1.offset += var16 * -1095856699;
      int var35 = var1.offset * 702114061;
      var1.offset += var18 * -1095856699;
      int var36 = var1.offset * 702114061;
      var1.offset += var20 * -1095856699;
      int var37 = var1.offset * 702114061;
      var1.offset += (var7 + var8 + var11) * -1095856699;
      int var38 = var1.offset * 702114061;
      var1.offset += var7 * -1095856699;
      int var39 = var1.offset * 702114061;
      var1.offset += var27 * -1095856699;
      int var40 = var1.offset * 702114061;
      var1.offset += var8 * -1095856699;
      int var41 = var1.offset * 702114061;
      var1.offset += var17 * -1095856699;
      int var42 = var1.offset * 702114061;
      var1.offset += var19 * -1095856699;
      int var43 = var1.offset * 702114061;
      var1.offset += var21 * -1095856699;
      int var44 = var1.offset * 702114061;
      var1.offset += var12 * -1095856699;
      int var45 = var1.offset * 702114061;
      var1.offset += var9 * -1095856699;
      int var46 = var1.offset * 702114061;
      var1.offset += var22 * -1095856699;
      int var47 = var1.offset * 702114061;
      var1.offset += var23 * -1095856699;
      int var48 = var1.offset * 702114061;
      var1.offset += var24 * -1095856699;
      int var49 = var1.offset * 702114061;
      var1.offset += var25 * -1095856699;
      int var50 = var1.offset * 702114061;
      var1.offset += var5 * 1007397199;
      this.field4693 = new byte[var4];
      Buffer var51 = new Buffer(this.field4693);
      var51.method12979(1297377380, 1813905090);
      var51.method12979(6, -286144935);
      var51.method12973(var2 > 1 ? 1 : 0, -1542382992);
      var51.method12973(var2, -1542382992);
      var51.method12973(var3, -1542382992);
      var1.offset = var72 * -1095856699;
      int var52 = 0;
      byte var53 = 0;
      byte var54 = 0;
      byte var55 = 0;
      int var56 = 0;
      byte var57 = 0;
      byte var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;

      for (int var60 = 0; var60 < var2; var60++) {
         var51.method12979(1297379947, 1559400898);
         var51.offset += -88459500;
         int var61 = var51.offset * 702114061;
         int var62 = -1;

         while (true) {
            int var63 = var1.method13116(-975989725);
            Buffer.method13031(var51, var63, (byte)89);
            int var64 = var1.array[var77++] & 255;
            boolean var65 = var64 != var62;
            var62 = var64 & 15;
            if (var64 == 7) {
               if (var65) {
                  Buffer.method12971(var51, 255, (byte)-77);
               }

               Buffer.method12971(var51, 47, (byte)-7);
               Buffer.method12971(var51, 0, (byte)-9);
               var51.method13015(var51.offset * 702114061 - var61, (byte)33);
               break;
            }

            if (var64 == 23) {
               if (var65) {
                  Buffer.method12971(var51, 255, (byte)-30);
               }

               Buffer.method12971(var51, 81, (byte)-76);
               Buffer.method12971(var51, 3, (byte)-50);
               Buffer.method12971(var51, var1.array[var50++], (byte)-72);
               Buffer.method12971(var51, var1.array[var50++], (byte)-45);
               Buffer.method12971(var51, var1.array[var50++], (byte)-104);
            } else {
               var52 ^= var64 >> 4;
               if (var62 == 0) {
                  if (var65) {
                     Buffer.method12971(var51, 144 + var52, (byte)-77);
                  }

                  var53 += var1.array[var37++];
                  var54 += var1.array[var38++];
                  int var83 = var53 & 127;
                  int var84 = var54 & 127;
                  Buffer.method12971(var51, var83, (byte)-12);
                  Buffer.method12971(var51, var84, (byte)-24);
               } else if (var62 == 1) {
                  if (var65) {
                     Buffer.method12971(var51, 128 + var52, (byte)-97);
                  }

                  var53 += var1.array[var37++];
                  var55 += var1.array[var40++];
                  Buffer.method12971(var51, var53 & 127, (byte)-48);
                  Buffer.method12971(var51, var55 & 127, (byte)-99);
               } else if (var62 == 2) {
                  if (var65) {
                     Buffer.method12971(var51, 176 + var52, (byte)-13);
                  }

                  var28 = var28 + var1.array[var75++] & 127;
                  Buffer.method12971(var51, var28, (byte)-22);
                  byte var81;
                  if (var28 == 0 || var28 == 32) {
                     var81 = var1.array[var44++];
                  } else if (var28 == 1) {
                     var81 = var1.array[var34++];
                  } else if (var28 == 33) {
                     var81 = var1.array[var41++];
                  } else if (var28 == 7) {
                     var81 = var1.array[var35++];
                  } else if (var28 == 39) {
                     var81 = var1.array[var42++];
                  } else if (var28 == 10) {
                     var81 = var1.array[var36++];
                  } else if (var28 == 42) {
                     var81 = var1.array[var43++];
                  } else if (var28 == 99) {
                     var81 = var1.array[var46++];
                  } else if (var28 == 98) {
                     var81 = var1.array[var47++];
                  } else if (var28 == 101) {
                     var81 = var1.array[var48++];
                  } else if (var28 == 100) {
                     var81 = var1.array[var49++];
                  } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                     var81 = var1.array[var39++];
                  } else {
                     var81 = var1.array[var30++];
                  }

                  var81 += var59[var28];
                  var59[var28] = var81;
                  int var67 = var81 & 127;
                  Buffer.method12971(var51, var67, (byte)-45);
               } else if (var62 == 3) {
                  if (var65) {
                     Buffer.method12971(var51, 224 + var52, (byte)-126);
                  }

                  int var80 = var56 + var1.array[var45++];
                  var56 = var80 + (var1.array[var33++] << 7);
                  Buffer.method12971(var51, var56 & 127, (byte)-42);
                  Buffer.method12971(var51, var56 >> 7 & 127, (byte)-68);
               } else if (var62 == 4) {
                  if (var65) {
                     Buffer.method12971(var51, 208 + var52, (byte)-10);
                  }

                  var57 += var1.array[var32++];
                  Buffer.method12971(var51, var57 & 127, (byte)-12);
               } else if (var62 == 5) {
                  if (var65) {
                     Buffer.method12971(var51, 160 + var52, (byte)-51);
                  }

                  var53 += var1.array[var37++];
                  var58 += var1.array[var31++];
                  Buffer.method12971(var51, var53 & 127, (byte)-20);
                  Buffer.method12971(var51, var58 & 127, (byte)-106);
               } else {
                  if (var62 != 6) {
                     throw new RuntimeException();
                  }

                  if (var65) {
                     Buffer.method12971(var51, 192 + var52, (byte)-42);
                  }

                  byte var66 = var1.array[var44++];
                  Buffer.method12971(var51, var66, (byte)-102);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method7942() {
      this.field4694 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method7943() {
      this.field4694 = null;
   }
}
