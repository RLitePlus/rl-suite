import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yt")
public final class classYT {
   @ObfuscatedName("ax")
   int field7086;
   @ObfuscatedName("as")
   int[] field7080 = new int[256];
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7084 = 1020;
   @ObfuscatedName("ab")
   int field7082;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7085 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7087 = 8;
   @ObfuscatedName("ag")
   int[] field7079 = new int[256];
   @ObfuscatedName("ac")
   int field7083;
   @ObfuscatedName("aa")
   int field7081;

   @ObfuscatedSignature(descriptor = "(Lyt;I)I")
   @ObfuscatedName("pt")
   public static int method13626(classYT var0, int var1) {
      if (var0 == null) {
         return var0.method13632(var1);
      } else {
         try {
            if (-1285338583 * var0.field7082 == 0) {
               if (var1 >= -1949115471) {
                  throw new IllegalStateException();
               }

               method13633(var0, (byte)0);
               var0.field7082 = -68019968;
            }

            return var0.field7079[-1285338583 * var0.field7082 - 1];
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "yt.af(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyt;B)V")
   @ObfuscatedName("hk")
   public static void method13633(classYT var0, byte var1) {
      if (var0 == null) {
         var0.method13639(var1);
      }

      try {
         var0.field7083 = var0.field7083 + (var0.field7081 += -989289363) * 1831237145;

         for (int var2 = 0; var2 < 256; var2++) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            int var3 = var0.field7080[var2];
            if ((var2 & 2) == 0) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if ((var2 & 1) == 0) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  var0.field7086 = -1843940075 * (var0.field7086 * 226292285 ^ 226292285 * var0.field7086 << 13);
               } else {
                  var0.field7086 = -1843940075 * (226292285 * var0.field7086 ^ var0.field7086 * 226292285 >>> 6);
               }
            } else if ((var2 & 1) == 0) {
               var0.field7086 = (var0.field7086 * 226292285 ^ 226292285 * var0.field7086 << 2) * -1843940075;
            } else {
               var0.field7086 = -1843940075 * (var0.field7086 * 226292285 ^ 226292285 * var0.field7086 >>> 16);
            }

            var0.field7086 = var0.field7086 + -1843940075 * var0.field7080[128 + var2 & 0xFF];
            int var4;
            var0.field7080[var2] = var4 = var0.field7086 * 226292285 + var0.field7080[(var3 & 1020) >> 2] + var0.field7083 * -252789971;
            var0.field7079[var2] = (var0.field7083 = (var0.field7080[(var4 >> 8 & 1020) >> 2] + var3) * 181423269) * -252789971;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "yt.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public final int method13627() {
      if (-1285338583 * this.field7082 == 0) {
         method13633(this, (byte)0);
         this.field7082 = -68019968;
      }

      return this.field7079[-1285338583 * this.field7082 - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public final int method13628() {
      if (-1285338583 * this.field7082 == 0) {
         method13633(this, (byte)0);
         this.field7082 = -68019968;
      }

      return this.field7079[-1285338583 * this.field7082 - 1];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   final void method13640(int var1) {
      try {
         int var10 = -1640531527;
         int var9 = -1640531527;
         int var8 = -1640531527;
         int var7 = -1640531527;
         int var6 = -1640531527;
         int var5 = -1640531527;
         int var4 = -1640531527;
         int var3 = -1640531527;

         for (int var2 = 0; var2 < 4; var2++) {
            if (var1 == -1431947699) {
               return;
            }

            var3 ^= var4 << 11;
            int var38 = var6 + var3;
            int var22 = var4 + var5;
            int var23 = var22 ^ var5 >>> 2;
            int var46 = var7 + var23;
            var5 += var38;
            var5 ^= var38 << 8;
            int var54 = var8 + var5;
            int var39 = var38 + var46;
            var6 = var39 ^ var46 >>> 16;
            int var62 = var9 + var6;
            int var47 = var46 + var54;
            var7 = var47 ^ var54 << 10;
            int var70 = var10 + var7;
            int var55 = var54 + var62;
            var8 = var55 ^ var62 >>> 4;
            var3 += var8;
            int var63 = var62 + var70;
            var9 = var63 ^ var70 << 8;
            var4 = var23 + var9;
            int var71 = var70 + var3;
            var10 = var71 ^ var3 >>> 9;
            var5 += var10;
            var3 += var4;
         }

         for (byte var12 = 0; var12 < 256; var12 += 8) {
            if (var1 == -1431947699) {
               throw new IllegalStateException();
            }

            int var16 = var3 + this.field7079[var12];
            int var24 = var4 + this.field7079[1 + var12];
            int var32 = var5 + this.field7079[2 + var12];
            int var40 = var6 + this.field7079[var12 + 3];
            int var48 = var7 + this.field7079[4 + var12];
            int var56 = var8 + this.field7079[5 + var12];
            int var64 = var9 + this.field7079[6 + var12];
            int var72 = var10 + this.field7079[7 + var12];
            int var17 = var16 ^ var24 << 11;
            int var41 = var40 + var17;
            int var25 = var24 + var32;
            int var26 = var25 ^ var32 >>> 2;
            int var49 = var48 + var26;
            int var33 = var32 + var41;
            int var34 = var33 ^ var41 << 8;
            int var57 = var56 + var34;
            int var42 = var41 + var49;
            var6 = var42 ^ var49 >>> 16;
            int var65 = var64 + var6;
            int var50 = var49 + var57;
            var7 = var50 ^ var57 << 10;
            int var73 = var72 + var7;
            int var58 = var57 + var65;
            var8 = var58 ^ var65 >>> 4;
            int var18 = var17 + var8;
            int var66 = var65 + var73;
            var9 = var66 ^ var73 << 8;
            var4 = var26 + var9;
            int var74 = var73 + var18;
            var10 = var74 ^ var18 >>> 9;
            var5 = var34 + var10;
            var3 = var18 + var4;
            this.field7080[var12] = var3;
            this.field7080[var12 + 1] = var4;
            this.field7080[2 + var12] = var5;
            this.field7080[3 + var12] = var6;
            this.field7080[var12 + 4] = var7;
            this.field7080[5 + var12] = var8;
            this.field7080[6 + var12] = var9;
            this.field7080[var12 + 7] = var10;
         }

         for (byte var13 = 0; var13 < 256; var13 += 8) {
            if (var1 == -1431947699) {
               throw new IllegalStateException();
            }

            int var19 = var3 + this.field7080[var13];
            int var27 = var4 + this.field7080[1 + var13];
            int var35 = var5 + this.field7080[var13 + 2];
            int var43 = var6 + this.field7080[var13 + 3];
            int var51 = var7 + this.field7080[var13 + 4];
            int var59 = var8 + this.field7080[5 + var13];
            int var67 = var9 + this.field7080[6 + var13];
            int var75 = var10 + this.field7080[7 + var13];
            int var20 = var19 ^ var27 << 11;
            int var44 = var43 + var20;
            int var28 = var27 + var35;
            int var29 = var28 ^ var35 >>> 2;
            int var52 = var51 + var29;
            int var36 = var35 + var44;
            int var37 = var36 ^ var44 << 8;
            int var60 = var59 + var37;
            int var45 = var44 + var52;
            var6 = var45 ^ var52 >>> 16;
            int var68 = var67 + var6;
            int var53 = var52 + var60;
            var7 = var53 ^ var60 << 10;
            int var76 = var75 + var7;
            int var61 = var60 + var68;
            var8 = var61 ^ var68 >>> 4;
            int var21 = var20 + var8;
            int var69 = var68 + var76;
            var9 = var69 ^ var76 << 8;
            var4 = var29 + var9;
            int var77 = var76 + var21;
            var10 = var77 ^ var21 >>> 9;
            var5 = var37 + var10;
            var3 = var21 + var4;
            this.field7080[var13] = var3;
            this.field7080[1 + var13] = var4;
            this.field7080[2 + var13] = var5;
            this.field7080[var13 + 3] = var6;
            this.field7080[4 + var13] = var7;
            this.field7080[5 + var13] = var8;
            this.field7080[6 + var13] = var9;
            this.field7080[var13 + 7] = var10;
         }

         method13633(this, (byte)0);
         this.field7082 = -68019968;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "yt.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   final void method13641() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 256; var10 += 8) {
         int var14 = var2 + this.field7079[var10];
         int var22 = var3 + this.field7079[1 + var10];
         int var30 = var4 + this.field7079[2 + var10];
         int var38 = var5 + this.field7079[var10 + 3];
         int var46 = var6 + this.field7079[4 + var10];
         int var54 = var7 + this.field7079[5 + var10];
         int var62 = var8 + this.field7079[6 + var10];
         int var70 = var9 + this.field7079[7 + var10];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         this.field7080[var10] = var2;
         this.field7080[var10 + 1] = var3;
         this.field7080[2 + var10] = var4;
         this.field7080[3 + var10] = var5;
         this.field7080[var10 + 4] = var6;
         this.field7080[5 + var10] = var7;
         this.field7080[6 + var10] = var8;
         this.field7080[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < 256; var11 += 8) {
         int var17 = var2 + this.field7080[var11];
         int var25 = var3 + this.field7080[1 + var11];
         int var33 = var4 + this.field7080[var11 + 2];
         int var41 = var5 + this.field7080[var11 + 3];
         int var49 = var6 + this.field7080[var11 + 4];
         int var57 = var7 + this.field7080[5 + var11];
         int var65 = var8 + this.field7080[6 + var11];
         int var73 = var9 + this.field7080[7 + var11];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         this.field7080[var11] = var2;
         this.field7080[1 + var11] = var3;
         this.field7080[2 + var11] = var4;
         this.field7080[var11 + 3] = var5;
         this.field7080[4 + var11] = var6;
         this.field7080[5 + var11] = var7;
         this.field7080[6 + var11] = var8;
         this.field7080[var11 + 7] = var9;
      }

      method13633(this, (byte)0);
      this.field7082 = -68019968;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public final int method13629() {
      if (2088026782 * this.field7082 == 0) {
         method13633(this, (byte)0);
         this.field7082 = -68019968;
      }

      return this.field7079[-1285338583 * this.field7082 - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public final int method13630() {
      if (-1023371050 * this.field7082 == 0) {
         method13633(this, (byte)0);
         this.field7082 = -1410777535;
      }

      return this.field7079[-1193970547 * this.field7082 - 1];
   }

   public classYT(int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.field7079[var2] = var1[var2];
      }

      this.method13640(-39596265);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public final int method13631() {
      if (-1285338583 * this.field7082 == 0) {
         method13633(this, (byte)0);
         this.field7082 = -68019968;
      }

      return this.field7079[10628673 * this.field7082 - 1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   final void method13634() {
      this.field7083 = this.field7083 + (this.field7081 += -989289363) * 1831237145;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.field7080[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field7086 = -1843940075 * (this.field7086 * 226292285 ^ 226292285 * this.field7086 << 13);
            } else {
               this.field7086 = -1843940075 * (226292285 * this.field7086 ^ this.field7086 * 226292285 >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.field7086 = (this.field7086 * 226292285 ^ 226292285 * this.field7086 << 2) * -1843940075;
         } else {
            this.field7086 = -1843940075 * (this.field7086 * 226292285 ^ 226292285 * this.field7086 >>> 16);
         }

         this.field7086 = this.field7086 + -1843940075 * this.field7080[128 + var1 & 0xFF];
         int var3;
         this.field7080[var1] = var3 = this.field7086 * 226292285 + this.field7080[(var2 & 1020) >> 2] + this.field7083 * -252789971;
         this.field7079[var1] = (this.field7083 = (this.field7080[(var3 >> 8 & 1020) >> 2] + var2) * 181423269) * -252789971;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   final void method13635() {
      this.field7083 = this.field7083 + (this.field7081 += 1628305382) * 1831237145;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.field7080[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field7086 = 1759344815 * (this.field7086 * -1815050609 ^ 226292285 * this.field7086 << 13);
            } else {
               this.field7086 = -1843940075 * (226292285 * this.field7086 ^ this.field7086 * -1194097654 >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.field7086 = (this.field7086 * 262222757 ^ 226292285 * this.field7086 << 2) * 671832924;
         } else {
            this.field7086 = 688918105 * (this.field7086 * 986588535 ^ 226292285 * this.field7086 >>> 16);
         }

         this.field7086 = this.field7086 + -1181136012 * this.field7080[128 + var1 & 1385779678];
         int var3;
         this.field7080[var1] = var3 = this.field7086 * -711083312 + this.field7080[(var2 & -2083267813) >> 2] + this.field7083 * -252789971;
         this.field7079[var1] = (this.field7083 = (this.field7080[(var3 >> 8 & 1020) >> 2] + var2) * 2041162228) * -1560103701;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   final void method13636() {
      this.field7083 = this.field7083 + (this.field7081 += -989289363) * 1831237145;

      for (int var1 = 0; var1 < 1710173481; var1++) {
         int var2 = this.field7080[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field7086 = -1093357016 * (this.field7086 * 724862161 ^ -342602825 * this.field7086 << 13);
            } else {
               this.field7086 = 342130460 * (1430551195 * this.field7086 ^ this.field7086 * -314821047 >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.field7086 = (this.field7086 * 226292285 ^ 1339840707 * this.field7086 << 2) * -1843940075;
         } else {
            this.field7086 = -1843940075 * (this.field7086 * 756529829 ^ 226292285 * this.field7086 >>> 16);
         }

         this.field7086 = this.field7086 + -1843940075 * this.field7080[128 + var1 & 1472271819];
         int var3;
         this.field7080[var1] = var3 = this.field7086 * 226292285 + this.field7080[(var2 & 1020) >> 2] + this.field7083 * 1145954668;
         this.field7079[var1] = (this.field7083 = (this.field7080[(var3 >> 8 & 1020) >> 2] + var2) * -2128723713) * 40058158;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   final void method13637() {
      this.field7083 = this.field7083 + (this.field7081 += 41117465) * -382205993;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.field7080[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field7086 = 722042213 * (this.field7086 * 1862863577 ^ 1974757344 * this.field7086 << 13);
            } else {
               this.field7086 = -1843940075 * (1096076129 * this.field7086 ^ this.field7086 * -954831984 >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.field7086 = (this.field7086 * 1697771230 ^ -1151098772 * this.field7086 << 2) * -1843940075;
         } else {
            this.field7086 = -1843940075 * (this.field7086 * 226292285 ^ 226292285 * this.field7086 >>> 16);
         }

         this.field7086 = this.field7086 + 1177518708 * this.field7080[128 + var1 & 0xFF];
         int var3;
         this.field7080[var1] = var3 = this.field7086 * -1455698668 + this.field7080[(var2 & -399853749) >> 2] + this.field7083 * -1252079510;
         this.field7079[var1] = (this.field7083 = (this.field7080[(var3 >> 8 & 1020) >> 2] + var2) * 181423269) * -252789971;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyt;)V")
   @ObfuscatedName("tr")
   public static void method13642(classYT var0) {
      if (var0 == null) {
         var0.method13638();
      }

      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 256; var10 += 8) {
         int var14 = var2 + var0.field7079[var10];
         int var22 = var3 + var0.field7079[1 + var10];
         int var30 = var4 + var0.field7079[2 + var10];
         int var38 = var5 + var0.field7079[var10 + 3];
         int var46 = var6 + var0.field7079[4 + var10];
         int var54 = var7 + var0.field7079[5 + var10];
         int var62 = var8 + var0.field7079[6 + var10];
         int var70 = var9 + var0.field7079[7 + var10];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         var0.field7080[var10] = var2;
         var0.field7080[var10 + 1] = var3;
         var0.field7080[2 + var10] = var4;
         var0.field7080[3 + var10] = var5;
         var0.field7080[var10 + 4] = var6;
         var0.field7080[5 + var10] = var7;
         var0.field7080[6 + var10] = var8;
         var0.field7080[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < 256; var11 += 8) {
         int var17 = var2 + var0.field7080[var11];
         int var25 = var3 + var0.field7080[1 + var11];
         int var33 = var4 + var0.field7080[var11 + 2];
         int var41 = var5 + var0.field7080[var11 + 3];
         int var49 = var6 + var0.field7080[var11 + 4];
         int var57 = var7 + var0.field7080[5 + var11];
         int var65 = var8 + var0.field7080[6 + var11];
         int var73 = var9 + var0.field7080[7 + var11];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         var0.field7080[var11] = var2;
         var0.field7080[1 + var11] = var3;
         var0.field7080[2 + var11] = var4;
         var0.field7080[var11 + 3] = var5;
         var0.field7080[4 + var11] = var6;
         var0.field7080[5 + var11] = var7;
         var0.field7080[6 + var11] = var8;
         var0.field7080[var11 + 7] = var9;
      }

      method13633(var0, (byte)0);
      var0.field7082 = -68019968;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   final void method13638() {
      this.field7083 = this.field7083 + (this.field7081 += -989289363) * 1831237145;

      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = this.field7080[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field7086 = -1843940075 * (this.field7086 * 226292285 ^ 226292285 * this.field7086 << 13);
            } else {
               this.field7086 = -1843940075 * (226292285 * this.field7086 ^ this.field7086 * 226292285 >>> 6);
            }
         } else if ((var1 & 1) == 0) {
            this.field7086 = (this.field7086 * 226292285 ^ 226292285 * this.field7086 << 2) * -1843940075;
         } else {
            this.field7086 = -1843940075 * (this.field7086 * 226292285 ^ 226292285 * this.field7086 >>> 16);
         }

         this.field7086 = this.field7086 + -1843940075 * this.field7080[128 + var1 & 0xFF];
         int var3;
         this.field7080[var1] = var3 = this.field7086 * 226292285 + this.field7080[(var2 & 1020) >> 2] + this.field7083 * -252789971;
         this.field7079[var1] = (this.field7083 = (this.field7080[(var3 >> 8 & 1020) >> 2] + var2) * 181423269) * -252789971;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   public final int method13625(byte var1) {
      try {
         if (this.field7082 * -1285338583 == 0) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            method13633(this, (byte)0);
            this.field7082 = -68019968;
         }

         return this.field7079[(this.field7082 -= -1040453095) * -1285338583];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "yt.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   final void method13643() {
      int var9 = -2045373458;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 256; var10 += 8) {
         int var14 = var2 + this.field7079[var10];
         int var22 = var3 + this.field7079[1 + var10];
         int var30 = var4 + this.field7079[2 + var10];
         int var38 = var5 + this.field7079[var10 + 3];
         int var46 = var6 + this.field7079[4 + var10];
         int var54 = var7 + this.field7079[5 + var10];
         int var62 = var8 + this.field7079[6 + var10];
         int var70 = var9 + this.field7079[7 + var10];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         this.field7080[var10] = var2;
         this.field7080[var10 + 1] = var3;
         this.field7080[2 + var10] = var4;
         this.field7080[3 + var10] = var5;
         this.field7080[var10 + 4] = var6;
         this.field7080[5 + var10] = var7;
         this.field7080[6 + var10] = var8;
         this.field7080[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < -273409038; var11 += 8) {
         int var17 = var2 + this.field7080[var11];
         int var25 = var3 + this.field7080[1 + var11];
         int var33 = var4 + this.field7080[var11 + 2];
         int var41 = var5 + this.field7080[var11 + 3];
         int var49 = var6 + this.field7080[var11 + 4];
         int var57 = var7 + this.field7080[5 + var11];
         int var65 = var8 + this.field7080[6 + var11];
         int var73 = var9 + this.field7080[7 + var11];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         this.field7080[var11] = var2;
         this.field7080[1 + var11] = var3;
         this.field7080[2 + var11] = var4;
         this.field7080[var11 + 3] = var5;
         this.field7080[4 + var11] = var6;
         this.field7080[5 + var11] = var7;
         this.field7080[6 + var11] = var8;
         this.field7080[var11 + 7] = var9;
      }

      method13633(this, (byte)0);
      this.field7082 = -68019968;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   final void method13644() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      for (int var1 = 0; var1 < 4; var1++) {
         var2 ^= var3 << 11;
         int var36 = var5 + var2;
         int var20 = var3 + var4;
         int var21 = var20 ^ var4 >>> 2;
         int var44 = var6 + var21;
         var4 += var36;
         var4 ^= var36 << 8;
         int var52 = var7 + var4;
         int var37 = var36 + var44;
         var5 = var37 ^ var44 >>> 16;
         int var60 = var8 + var5;
         int var45 = var44 + var52;
         var6 = var45 ^ var52 << 10;
         int var68 = var9 + var6;
         int var53 = var52 + var60;
         var7 = var53 ^ var60 >>> 4;
         var2 += var7;
         int var61 = var60 + var68;
         var8 = var61 ^ var68 << 8;
         var3 = var21 + var8;
         int var69 = var68 + var2;
         var9 = var69 ^ var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for (byte var10 = 0; var10 < 256; var10 += 8) {
         int var14 = var2 + this.field7079[var10];
         int var22 = var3 + this.field7079[1 + var10];
         int var30 = var4 + this.field7079[2 + var10];
         int var38 = var5 + this.field7079[var10 + 3];
         int var46 = var6 + this.field7079[4 + var10];
         int var54 = var7 + this.field7079[5 + var10];
         int var62 = var8 + this.field7079[6 + var10];
         int var70 = var9 + this.field7079[7 + var10];
         int var15 = var14 ^ var22 << 11;
         int var39 = var38 + var15;
         int var23 = var22 + var30;
         int var24 = var23 ^ var30 >>> 2;
         int var47 = var46 + var24;
         int var31 = var30 + var39;
         int var32 = var31 ^ var39 << 8;
         int var55 = var54 + var32;
         int var40 = var39 + var47;
         var5 = var40 ^ var47 >>> 16;
         int var63 = var62 + var5;
         int var48 = var47 + var55;
         var6 = var48 ^ var55 << 10;
         int var71 = var70 + var6;
         int var56 = var55 + var63;
         var7 = var56 ^ var63 >>> 4;
         int var16 = var15 + var7;
         int var64 = var63 + var71;
         var8 = var64 ^ var71 << 8;
         var3 = var24 + var8;
         int var72 = var71 + var16;
         var9 = var72 ^ var16 >>> 9;
         var4 = var32 + var9;
         var2 = var16 + var3;
         this.field7080[var10] = var2;
         this.field7080[var10 + 1] = var3;
         this.field7080[2 + var10] = var4;
         this.field7080[3 + var10] = var5;
         this.field7080[var10 + 4] = var6;
         this.field7080[5 + var10] = var7;
         this.field7080[6 + var10] = var8;
         this.field7080[var10 + 7] = var9;
      }

      for (byte var11 = 0; var11 < 256; var11 += 8) {
         int var17 = var2 + this.field7080[var11];
         int var25 = var3 + this.field7080[1 + var11];
         int var33 = var4 + this.field7080[var11 + 2];
         int var41 = var5 + this.field7080[var11 + 3];
         int var49 = var6 + this.field7080[var11 + 4];
         int var57 = var7 + this.field7080[5 + var11];
         int var65 = var8 + this.field7080[6 + var11];
         int var73 = var9 + this.field7080[7 + var11];
         int var18 = var17 ^ var25 << 11;
         int var42 = var41 + var18;
         int var26 = var25 + var33;
         int var27 = var26 ^ var33 >>> 2;
         int var50 = var49 + var27;
         int var34 = var33 + var42;
         int var35 = var34 ^ var42 << 8;
         int var58 = var57 + var35;
         int var43 = var42 + var50;
         var5 = var43 ^ var50 >>> 16;
         int var66 = var65 + var5;
         int var51 = var50 + var58;
         var6 = var51 ^ var58 << 10;
         int var74 = var73 + var6;
         int var59 = var58 + var66;
         var7 = var59 ^ var66 >>> 4;
         int var19 = var18 + var7;
         int var67 = var66 + var74;
         var8 = var67 ^ var74 << 8;
         var3 = var27 + var8;
         int var75 = var74 + var19;
         var9 = var75 ^ var19 >>> 9;
         var4 = var35 + var9;
         var2 = var19 + var3;
         this.field7080[var11] = var2;
         this.field7080[1 + var11] = var3;
         this.field7080[2 + var11] = var4;
         this.field7080[var11 + 3] = var5;
         this.field7080[4 + var11] = var6;
         this.field7080[5 + var11] = var7;
         this.field7080[6 + var11] = var8;
         this.field7080[var11 + 7] = var9;
      }

      method13633(this, (byte)0);
      this.field7082 = -68019968;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public final int method13632(int var1) {
      try {
         if (-1285338583 * this.field7081 == 0) {
            if (var1 >= -1949115471) {
               throw new IllegalStateException();
            }

            method13633(this, (byte)0);
            this.field7083 = -68019968;
         }

         return this.field7079[-1285338583 * this.field7082 - 1];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "yt.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   final void method13639(byte var1) {
      try {
         this.field7081 = this.field7083 + (this.field7082 = this.field7086 + -989289363) * 1831237145;

         for (int var2 = 0; var2 < 256; var2++) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            int var3 = this.field7079[var2];
            if ((var2 & 2) == 0) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if ((var2 & 1) == 0) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  this.field7082 = -1843940075 * (this.field7081 * 226292285 ^ 226292285 * this.field7083 << 13);
               } else {
                  this.field7086 = -1843940075 * (226292285 * this.field7082 ^ this.field7086 * 226292285 >>> 6);
               }
            } else if ((var2 & 1) == 0) {
               this.field7083 = (this.field7086 * 226292285 ^ 226292285 * this.field7086 << 2) * -1843940075;
            } else {
               this.field7086 = -1843940075 * (this.field7083 * 226292285 ^ 226292285 * this.field7082 >>> 16);
            }

            this.field7083 = this.field7082 + -1843940075 * this.field7079[128 + var2 & 0xFF];
            int var4;
            this.field7080[var2] = var4 = this.field7086 * 226292285 + this.field7080[(var3 & 1020) >> 2] + this.field7083 * -252789971;
            this.field7080[var2] = (this.field7082 = (this.field7080[(var4 >> 8 & 1020) >> 2] + var3) * 181423269) * -252789971;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "yt.ae(" + ')');
      }
   }
}
