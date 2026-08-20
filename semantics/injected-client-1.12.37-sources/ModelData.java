import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("er")
public class ModelData extends Renderable implements net.runelite.api.ModelData {
   @ObfuscatedName("an")
   byte field1851;
   @ObfuscatedName("by")
   int field1893;
   @ObfuscatedName("av")
   short[] field1853;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1888 = -2;
   @ObfuscatedName("ag")
   static int[] field1883 = new int[10000];
   @ObfuscatedName("as")
   static int field1882 = 0;
   @ObfuscatedName("fi")
   public float[] field1857;
   @ObfuscatedSignature(descriptor = "[Leb;")
   @ObfuscatedName("bp")
   classEB[] field1874;
   @ObfuscatedName("ay")
   int field1854;
   @ObfuscatedName("lj")
   public float[] field1855;
   @ObfuscatedName("ab")
   static int[] field1881 = new int[10000];
   @ObfuscatedName("oy")
   public int[] field1897;
   @ObfuscatedName("ao")
   int[] field1896;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1890 = -3;
   @ObfuscatedName("aj")
   int[] field1894;
   @ObfuscatedName("be")
   int field1849;
   @ObfuscatedName("aq")
   int[] field1880;
   @ObfuscatedName("sy")
   public int[] field1898;
   @ObfuscatedName("ac")
   static int[] field1885 = classFH.field2254;
   @ObfuscatedName("bn")
   short[] field1869;
   @ObfuscatedName("au")
   byte[] field1866;
   @ObfuscatedName("ai")
   byte[] field1867;
   @ObfuscatedName("ar")
   byte[] field1859;
   @ObfuscatedName("aw")
   byte[] field1868;
   @ObfuscatedName("ak")
   short[] field1852;
   @ObfuscatedName("bi")
   int field1891;
   @ObfuscatedName("at")
   byte[] field1872;
   @ObfuscatedName("ba")
   int[][] field1860;
   @ObfuscatedName("bf")
   int field1848 = 0;
   @ObfuscatedName("ah")
   byte[] field1861;
   @ObfuscatedName("bt")
   public short field1879;
   @ObfuscatedName("bx")
   short[] field1858;
   @ObfuscatedName("bc")
   short[] field1862;
   @ObfuscatedName("ad")
   int[] field1864;
   @ObfuscatedSignature(descriptor = "[Lfr;")
   @ObfuscatedName("br")
   classFR[] field1873;
   @ObfuscatedName("bm")
   public short field1878;
   @ObfuscatedName("ax")
   static int[] field1884 = classFH.field2253;
   @ObfuscatedName("bg")
   int[][] field1876;
   @ObfuscatedName("bj")
   int[][] field1877;
   @ObfuscatedName("bk")
   int[] field1870;
   @ObfuscatedName("bo")
   int[] field1871;
   @ObfuscatedName("bu")
   int[][] field1863;
   @ObfuscatedName("al")
   int[] field1895;
   @ObfuscatedName("vq")
   public float[] field1856;
   @ObfuscatedSignature(descriptor = "[Lfr;")
   @ObfuscatedName("bw")
   classFR[] field1875;
   @ObfuscatedName("bb")
   boolean field1850;
   @ObfuscatedName("am")
   int field1889;
   @ObfuscatedName("aa")
   int field1886;
   @ObfuscatedName("bq")
   int field1892;
   @ObfuscatedName("we")
   public int[] field1899;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1887 = -1;
   @ObfuscatedName("ap")
   int[] field1865;

   ModelData(byte[] var1) {
      this.field1849 = 0;
      this.field1851 = 0;
      this.field1850 = false;
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method3968(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method3970(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         method3974(this, var1);
      } else {
         this.method3978(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cr")
   void method3970(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * -1095856699;
      int var9 = Buffer.method13047(var4, -1714581989);
      int var10 = Buffer.method13047(var4, -753735522);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13039(var4, -346779531);
      int var18 = Buffer.method13047(var4, -281970823);
      int var19 = Buffer.method13047(var4, -1637054274);
      int var20 = Buffer.method13047(var4, -661393680);
      int var21 = Buffer.method13047(var4, -489789117);
      int var22 = Buffer.method13047(var4, 1159326408);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      if (var16 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
         this.field1868 = new byte[var10];
         this.field1853 = new short[var10];
      }

      if (var13 == 255) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      if (var17 == 1) {
         this.field1876 = new int[var9][];
         this.field1877 = new int[var9][];
      }

      this.field1852 = new short[var10];
      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      var6.offset = var23 * -1095856699;
      var7.offset = var23 * -1095856699;
      var8.offset = var23 * -1095856699;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = Buffer.method13039(var4, -346779531);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method13088(-885484049);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.method13088(-1392179173);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.method13088(-864852339);
         }

         this.field1855[var41] = var38 + var43;
         this.field1856[var41] = var39 + var44;
         this.field1857[var41] = var40 + var45;
         var38 = (int)this.field1855[var41];
         var39 = (int)this.field1856[var41];
         var40 = (int)this.field1857[var41];
         if (var16 == 1) {
            this.field1870[var41] = Buffer.method13039(var8, -346779531);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = Buffer.method13039(var8, -346779531);
            this.field1876[var58] = new int[var61];
            this.field1877[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field1876[var58][var64] = Buffer.method13039(var8, -346779531);
               this.field1877[var58][var64] = Buffer.method13039(var8, -346779531);
            }
         }
      }

      var4.offset = var23 * -1095856699;
      var5.offset = var28 * -1095856699;
      var6.offset = var26 * -1095856699;
      var7.offset = var30 * -1095856699;
      var8.offset = var27 * -1095856699;

      for (int var59 = 0; var59 < var10; var59++) {
         this.field1852[var59] = (short)Buffer.method13047(var4, -371921787);
         if (var12 == 1) {
            int var62 = Buffer.method13039(var5, -346779531);
            if ((var62 & 1) == 1) {
               this.field1866[var59] = 1;
               var2 = true;
            } else {
               this.field1866[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.field1868[var59] = (byte)(var62 >> 2);
               this.field1853[var59] = this.field1852[var59];
               this.field1852[var59] = 127;
               if (this.field1853[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.field1868[var59] = -1;
               this.field1853[var59] = -1;
            }
         }

         if (var13 == 255) {
            this.field1867[var59] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var59] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var59] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = Buffer.method13039(var5, -346779531);
         if (var46 == 1) {
            var60 = var4.method13088(-1537553239) + var66;
            var63 = var4.method13088(-1089015080) + var60;
            var65 = var4.method13088(-1660895507) + var63;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.method13088(-695893318) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.method13088(-168541258) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.method13088(-686313281) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var47;
            this.field1865[var67] = var65;
         }
      }

      var4.offset = var23 * -1095856699;

      for (int var68 = 0; var68 < var11; var68++) {
         this.field1861[var68] = 0;
         this.field1869[var68] = (short)Buffer.method13047(var4, -1481512556);
         this.field1858[var68] = (short)Buffer.method13047(var4, -1483053944);
         this.field1862[var68] = (short)Buffer.method13047(var4, -1580398189);
      }

      var4.offset = var23 * -1095856699;
      boolean var69 = Buffer.method13039(var4, -346779531) == 1;
      if (var69) {
         this.field1872 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field1872[var70] = Buffer.method13043(var4, (byte)17);
         }
      }

      if (this.field1868 != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.field1868[var72] & 255;
            if (var48 != 255) {
               if ((this.field1869[var48] & '\uffff') == this.field1880[var72]
                  && (this.field1858[var48] & '\uffff') == this.field1864[var72]
                  && (this.field1862[var48] & '\uffff') == this.field1865[var72]) {
                  this.field1868[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.field1868 = null;
         }
      }

      if (!var3) {
         this.field1853 = null;
      }

      if (!var2) {
         this.field1866 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("cg")
   public void method4000(short var1, short var2) {
      for (int var3 = 0; var3 < this.field1849; var3++) {
         if (this.field1852[var3] == var1) {
            this.field1852[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;Ler;IIIZ)V")
   @ObfuscatedName("af")
   static void method3961(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      var0.method4022();
      method4015(var0);
      var1.method4022();
      method4015(var1);
      field1882++;
      int var6 = 0;
      float[] var7 = var1.field1855;
      int var8 = var1.field1848;

      for (int var9 = 0; var9 < var0.field1848; var9++) {
         classFR var10 = var0.field1873[var9];
         if (var10.field2386 * 1200753713 != 0) {
            int var11 = (int)var0.field1856[var9] - var3;
            if (var11 <= var1.field1889) {
               int var12 = (int)var0.field1855[var9] - var2;
               if (var12 >= var1.field1886 && var12 <= var1.field1892) {
                  int var13 = (int)var0.field1857[var9] - var4;
                  if (var13 >= var1.field1893 && var13 <= var1.field1891) {
                     for (int var14 = 0; var14 < var8; var14++) {
                        classFR var15 = var1.field1873[var14];
                        if (var12 == (int)var7[var14]
                           && var13 == (int)var1.field1857[var14]
                           && var11 == (int)var1.field1856[var14]
                           && var15.field2386 * 1200753713 != 0) {
                           if (var0.field1875 == null) {
                              var0.field1875 = new classFR[var0.field1848];
                           }

                           if (var1.field1875 == null) {
                              var1.field1875 = new classFR[var8];
                           }

                           classFR var16 = var0.field1875[var9];
                           if (var16 == null) {
                              var16 = var0.field1875[var9] = new classFR(var10);
                           }

                           classFR var17 = var1.field1875[var14];
                           if (var17 == null) {
                              var17 = var1.field1875[var14] = new classFR(var15);
                           }

                           var16.field2388 = var16.field2388 + var15.field2388 * 1;
                           var16.field2387 = var16.field2387 + var15.field2387 * 1;
                           var16.field2385 = var16.field2385 + var15.field2385 * 1;
                           var16.field2386 = var16.field2386 + var15.field2386 * 1;
                           var17.field2388 = var17.field2388 + var10.field2388 * 1;
                           var17.field2387 = var17.field2387 + var10.field2387 * 1;
                           var17.field2385 = var17.field2385 + var10.field2385 * 1;
                           var17.field2386 = var17.field2386 + var10.field2386 * 1;
                           var6++;
                           field1881[var9] = field1882;
                           field1883[var14] = field1882;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for (int var18 = 0; var18 < var0.field1849; var18++) {
            if (field1881[var0.field1880[var18]] == field1882 && field1881[var0.field1864[var18]] == field1882 && field1881[var0.field1865[var18]] == field1882
               )
             {
               if (var0.field1866 == null) {
                  var0.field1866 = new byte[var0.field1849];
               }

               var0.field1866[var18] = 2;
            }
         }

         for (int var19 = 0; var19 < var1.field1849; var19++) {
            if (field1883[var1.field1880[var19]] == field1882 && field1883[var1.field1864[var19]] == field1882 && field1883[var1.field1865[var19]] == field1882
               )
             {
               if (var1.field1866 == null) {
                  var1.field1866 = new byte[var1.field1849];
               }

               var1.field1866[var19] = 2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gq")
   public void method4048() {
      method4015(this);
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("sv")
   public byte[] method4049() {
      return this.field1868;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("bq")
   public ModelData method4050() {
      this.method4044();
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dt")
   void method4021() {
      if (!this.field1850) {
         this.field1743 = 0;
         this.field1889 = 0;
         this.field1886 = 1945163118;
         this.field1892 = -999999;
         this.field1891 = -99999;
         this.field1893 = 99999;

         for (int var1 = 0; var1 < this.field1848; var1++) {
            int var2 = (int)this.field1855[var1];
            int var3 = (int)this.field1856[var1];
            int var4 = (int)this.field1857[var1];
            if (var2 < this.field1886) {
               this.field1886 = var2;
            }

            if (var2 > this.field1892) {
               this.field1892 = var2;
            }

            if (var4 < this.field1893) {
               this.field1893 = var4;
            }

            if (var4 > this.field1891) {
               this.field1891 = var4;
            }

            if (-var3 > this.field1743 * 1684608448) {
               this.field1743 = -var3 * 874955715;
            }

            if (var3 > this.field1889) {
               this.field1889 = var3;
            }
         }

         this.field1850 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   void method3990() {
      if (this.field1870 != null) {
         int[] var1 = new int[256];
         int var2 = 0;

         for (int var3 = 0; var3 < this.field1848; var3++) {
            int var4 = this.field1870[var3];
            var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field1863 = new int[var2 + 1][];

         for (int var7 = 0; var7 <= var2; var7++) {
            this.field1863[var7] = new int[var1[var7]];
            var1[var7] = 0;
         }

         int var8 = 0;

         while (var8 < this.field1848) {
            int var12 = this.field1870[var8];
            this.field1863[var12][var1[var12]++] = var8++;
         }

         this.field1870 = null;
      }

      if (this.field1871 != null) {
         int[] var5 = new int[568201891];
         int var6 = 0;

         for (int var9 = 0; var9 < this.field1849; var9++) {
            int var13 = this.field1871[var9];
            var5[var13]++;
            if (var13 > var6) {
               var6 = var13;
            }
         }

         this.field1860 = new int[var6 + 1][];

         for (int var10 = 0; var10 <= var6; var10++) {
            this.field1860[var10] = new int[var5[var10]];
            var5[var10] = 0;
         }

         int var11 = 0;

         while (var11 < this.field1849) {
            int var14 = this.field1871[var11];
            this.field1860[var14][var5[var14]++] = var11++;
         }

         this.field1871 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("br")
   public void method4001(short var1, short var2) {
      for (int var3 = 0; var3 < this.field1849; var3++) {
         if (this.field1852[var3] == var1) {
            this.field1852[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public void method4006() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         this.field1857[var1] = -((int)this.field1857[var1]);
      }

      for (int var3 = 0; var3 < this.field1849; var3++) {
         int var2 = this.field1880[var3];
         this.field1880[var3] = this.field1865[var3];
         this.field1865[var3] = var2;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method4051() {
      this.method4018();
   }

   public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1849 = 0;
      this.field1851 = 0;
      this.field1850 = false;
      this.field1848 = var1.field1848;
      this.field1849 = var1.field1849;
      this.field1854 = var1.field1854;
      if (var2) {
         this.field1855 = var1.field1855;
         this.field1856 = var1.field1856;
         this.field1857 = var1.field1857;
      } else {
         this.field1855 = new float[this.field1848];
         this.field1856 = new float[this.field1848];
         this.field1857 = new float[this.field1848];

         for (int var6 = 0; var6 < this.field1848; var6++) {
            this.field1855[var6] = var1.field1855[var6];
            this.field1856[var6] = var1.field1856[var6];
            this.field1857[var6] = var1.field1857[var6];
         }
      }

      if (var3) {
         this.field1852 = var1.field1852;
      } else {
         this.field1852 = new short[this.field1849];

         for (int var7 = 0; var7 < this.field1849; var7++) {
            this.field1852[var7] = var1.field1852[var7];
         }
      }

      if (!var4 && var1.field1853 != null) {
         this.field1853 = new short[this.field1849];

         for (int var8 = 0; var8 < this.field1849; var8++) {
            this.field1853[var8] = var1.field1853[var8];
         }
      } else {
         this.field1853 = var1.field1853;
      }

      if (var5) {
         this.field1859 = var1.field1859;
      } else {
         this.field1859 = new byte[this.field1849];
         if (var1.field1859 == null) {
            for (int var9 = 0; var9 < this.field1849; var9++) {
               this.field1859[var9] = 0;
            }
         } else {
            for (int var10 = 0; var10 < this.field1849; var10++) {
               this.field1859[var10] = var1.field1859[var10];
            }
         }
      }

      this.field1880 = var1.field1880;
      this.field1864 = var1.field1864;
      this.field1865 = var1.field1865;
      this.field1866 = var1.field1866;
      this.field1867 = var1.field1867;
      this.field1868 = var1.field1868;
      this.field1851 = var1.field1851;
      this.field1861 = var1.field1861;
      this.field1869 = var1.field1869;
      this.field1858 = var1.field1858;
      this.field1862 = var1.field1862;
      this.field1870 = var1.field1870;
      this.field1871 = var1.field1871;
      this.field1863 = var1.field1863;
      this.field1860 = var1.field1860;
      this.field1873 = var1.field1873;
      this.field1874 = var1.field1874;
      this.field1875 = var1.field1875;
      this.field1876 = var1.field1876;
      this.field1877 = var1.field1877;
      this.field1878 = var1.field1878;
      this.field1879 = var1.field1879;
      this.field1872 = var1.field1872;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("wt")
   public static void method4012(ModelData var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.getFaceColors();
      }

      for (int var4 = 0; var4 < var0.field1848; var4++) {
         var0.field1855[var4] = (int)var0.field1855[var4] * var1 / 128;
         var0.field1856[var4] = (int)var0.field1856[var4] * var2 / 128;
         var0.field1857[var4] = (int)var0.field1857[var4] * var3 / 160667711;
      }

      var0.method4018();
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ac")
   void method3978(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * -1095856699;
      int var9 = Buffer.method13047(var4, 259951655);
      int var10 = Buffer.method13047(var4, 488098787);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13047(var4, 377229697);
      int var18 = Buffer.method13047(var4, -222495383);
      int var19 = Buffer.method13047(var4, -175409656);
      int var20 = Buffer.method13047(var4, 1857075666);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      if (var16 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
         this.field1868 = new byte[var10];
         this.field1853 = new short[var10];
      }

      if (var13 == 255) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      this.field1852 = new short[var10];
      var4.offset = var21 * -1095856699;
      var5.offset = var21 * -1095856699;
      var6.offset = var21 * -1095856699;
      var7.offset = var21 * -1095856699;
      var8.offset = var27 * -1095856699;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = Buffer.method13039(var4, -346779531);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method13088(-90884172);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method13088(-7497088);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method13088(-558765863);
         }

         this.field1855[var38] = var35 + var40;
         this.field1856[var38] = var36 + var41;
         this.field1857[var38] = var37 + var42;
         var35 = (int)this.field1855[var38];
         var36 = (int)this.field1856[var38];
         var37 = (int)this.field1857[var38];
         if (var16 == 1) {
            this.field1870[var38] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var21 * -1095856699;
      var5.offset = var26 * -1095856699;
      var6.offset = var24 * -1095856699;
      var7.offset = var28 * -1095856699;
      var8.offset = var25 * -1095856699;

      for (int var53 = 0; var53 < var10; var53++) {
         this.field1852[var53] = (short)Buffer.method13047(var4, 270460424);
         if (var12 == 1) {
            int var55 = Buffer.method13039(var5, -346779531);
            if ((var55 & 1) == 1) {
               this.field1866[var53] = 1;
               var2 = true;
            } else {
               this.field1866[var53] = 0;
            }

            if ((var55 & 2) == 2) {
               this.field1868[var53] = (byte)(var55 >> 2);
               this.field1853[var53] = this.field1852[var53];
               this.field1852[var53] = 127;
               if (this.field1853[var53] != -1) {
                  var3 = true;
               }
            } else {
               this.field1868[var53] = -1;
               this.field1853[var53] = -1;
            }
         }

         if (var13 == 255) {
            this.field1867[var53] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var53] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var53] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var21 * -1095856699;
      var5.offset = var21 * -1095856699;
      int var54 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;

      for (int var59 = 0; var59 < var10; var59++) {
         int var43 = Buffer.method13039(var5, -346779531);
         if (var43 == 1) {
            var54 = var4.method13088(-1742133160) + var58;
            var56 = var4.method13088(-1312021698) + var54;
            var57 = var4.method13088(-1825470473) + var56;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 2) {
            var56 = var57;
            var57 = var4.method13088(-51449) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 3) {
            var54 = var57;
            var57 = var4.method13088(-609148183) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 4) {
            int var44 = var54;
            var54 = var56;
            var56 = var44;
            var57 = var4.method13088(-1582619706) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var44;
            this.field1865[var59] = var57;
         }
      }

      var4.offset = var21 * -1095856699;

      for (int var60 = 0; var60 < var11; var60++) {
         this.field1861[var60] = 0;
         this.field1869[var60] = (short)Buffer.method13047(var4, 317544948);
         this.field1858[var60] = (short)Buffer.method13047(var4, -1756873900);
         this.field1862[var60] = (short)Buffer.method13047(var4, 851920230);
      }

      if (this.field1868 != null) {
         boolean var61 = false;

         for (int var62 = 0; var62 < var10; var62++) {
            int var63 = this.field1868[var62] & 255;
            if (var63 != 255) {
               if ((this.field1869[var63] & '\uffff') == this.field1880[var62]
                  && (this.field1858[var63] & '\uffff') == this.field1864[var62]
                  && (this.field1862[var63] & '\uffff') == this.field1865[var62]) {
                  this.field1868[var62] = -1;
               } else {
                  var61 = true;
               }
            }
         }

         if (!var61) {
            this.field1868 = null;
         }
      }

      if (!var3) {
         this.field1853 = null;
      }

      if (!var2) {
         this.field1866 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;I)I")
   @ObfuscatedName("aj")
   final int method3981(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field1855[var2];
      int var5 = (int)var1.field1856[var2];
      int var6 = (int)var1.field1857[var2];

      for (int var7 = 0; var7 < this.field1848; var7++) {
         if (var4 == (int)this.field1855[var7] && var5 == (int)this.field1856[var7] && var6 == (int)this.field1857[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field1855[this.field1848] = var4;
         this.field1856[this.field1848] = var5;
         this.field1857[this.field1848] = var6;
         if (var1.field1870 != null) {
            this.field1870[this.field1848] = var1.field1870[var2];
         }

         if (var1.field1876 != null) {
            this.field1876[this.field1848] = var1.field1876[var2];
            this.field1877[this.field1848] = var1.field1877[var2];
         }

         var3 = this.field1848++;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Ler;[B)V")
   @ObfuscatedName("mm")
   public static void method3974(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method3977(var1);
      } else {
         Buffer var2 = new Buffer(var1);
         Buffer var3 = new Buffer(var1);
         Buffer var4 = new Buffer(var1);
         Buffer var5 = new Buffer(var1);
         Buffer var6 = new Buffer(var1);
         Buffer var7 = new Buffer(var1);
         Buffer var8 = new Buffer(var1);
         var2.offset = (var1.length - 23) * -1095856699;
         int var9 = Buffer.method13047(var2, -1975589991);
         int var10 = Buffer.method13047(var2, -1787785927);
         int var11 = Buffer.method13039(var2, -346779531);
         int var12 = Buffer.method13039(var2, -346779531);
         int var13 = Buffer.method13039(var2, -346779531);
         int var14 = Buffer.method13039(var2, -346779531);
         int var15 = Buffer.method13039(var2, -346779531);
         int var16 = Buffer.method13039(var2, -346779531);
         int var17 = Buffer.method13039(var2, -346779531);
         int var18 = Buffer.method13047(var2, 1648062840);
         int var19 = Buffer.method13047(var2, -655551909);
         int var20 = Buffer.method13047(var2, -732802342);
         int var21 = Buffer.method13047(var2, 161945279);
         int var22 = Buffer.method13047(var2, -578341193);
         int var23 = 0;
         int var24 = 0;
         int var25 = 0;
         if (var11 > 0) {
            var0.field1861 = new byte[var11];
            var2.offset = 0;

            for (int var26 = 0; var26 < var11; var26++) {
               byte var27 = var0.field1861[var26] = Buffer.method13043(var2, (byte)17);
               if (var27 == 0) {
                  var23++;
               }

               if (var27 >= 1 && var27 <= 3) {
                  var24++;
               }

               if (var27 == 2) {
                  var25++;
               }
            }
         }

         int var58 = var11 + var9;
         int var28 = var58;
         if (var12 == 1) {
            var58 += var10;
         }

         var58 += var10;
         int var30 = var58;
         if (var13 == 255) {
            var58 += var10;
         }

         int var31 = var58;
         if (var15 == 1) {
            var58 += var10;
         }

         int var32 = var58;
         if (var17 == 1) {
            var58 += var9;
         }

         int var33 = var58;
         if (var14 == 1) {
            var58 += var10;
         }

         var58 += var21;
         int var35 = var58;
         if (var16 == 1) {
            var58 += var10 * 2;
         }

         var58 += var22;
         var58 += var10 * 2;
         var58 += var18;
         var58 += var19;
         var58 += var20;
         var58 += var23 * 6;
         var58 += var24 * 6;
         var58 += var24 * 6;
         var58 += var24 * 2;
         var58 += var24;
         var58 += var24 * 2 + var25 * 2;
         var0.field1848 = var9;
         var0.field1849 = var10;
         var0.field1854 = var11;
         var0.field1855 = new float[var9];
         var0.field1856 = new float[var9];
         var0.field1857 = new float[var9];
         var0.field1880 = new int[var10];
         var0.field1864 = new int[var10];
         var0.field1865 = new int[var10];
         if (var17 == 1) {
            var0.field1870 = new int[var9];
         }

         if (var12 == 1) {
            var0.field1866 = new byte[var10];
         }

         if (var13 == 255) {
            var0.field1867 = new byte[var10];
         } else {
            var0.field1851 = (byte)var13;
         }

         if (var14 == 1) {
            var0.field1859 = new byte[var10];
         }

         if (var15 == 1) {
            var0.field1871 = new int[var10];
         }

         if (var16 == 1) {
            var0.field1853 = new short[var10];
         }

         if (var16 == 1 && var11 > 0) {
            var0.field1868 = new byte[var10];
         }

         var0.field1852 = new short[var10];
         if (var11 > 0) {
            var0.field1869 = new short[var11];
            var0.field1858 = new short[var11];
            var0.field1862 = new short[var11];
         }

         var2.offset = var11 * -1095856699;
         var3.offset = var58 * -1095856699;
         var4.offset = var58 * -1095856699;
         var5.offset = var58 * -1095856699;
         var6.offset = var32 * -1095856699;
         int var48 = 0;
         int var49 = 0;
         int var50 = 0;

         for (int var51 = 0; var51 < var9; var51++) {
            int var52 = Buffer.method13039(var2, -346779531);
            int var53 = 0;
            if ((var52 & 1) != 0) {
               var53 = var3.method13088(-253909922);
            }

            int var54 = 0;
            if ((var52 & 2) != 0) {
               var54 = var4.method13088(-1068350675);
            }

            int var55 = 0;
            if ((var52 & 4) != 0) {
               var55 = var5.method13088(-732969970);
            }

            var0.field1855[var51] = var48 + var53;
            var0.field1856[var51] = var49 + var54;
            var0.field1857[var51] = var50 + var55;
            var48 = (int)var0.field1855[var51];
            var49 = (int)var0.field1856[var51];
            var50 = (int)var0.field1857[var51];
            if (var17 == 1) {
               var0.field1870[var51] = Buffer.method13039(var6, -346779531);
            }
         }

         var2.offset = var58 * -1095856699;
         var3.offset = var28 * -1095856699;
         var4.offset = var30 * -1095856699;
         var5.offset = var33 * -1095856699;
         var6.offset = var31 * -1095856699;
         var7.offset = var35 * -1095856699;
         var8.offset = var58 * -1095856699;

         for (int var72 = 0; var72 < var10; var72++) {
            var0.field1852[var72] = (short)Buffer.method13047(var2, -1567601339);
            if (var12 == 1) {
               var0.field1866[var72] = Buffer.method13043(var3, (byte)17);
            }

            if (var13 == 255) {
               var0.field1867[var72] = Buffer.method13043(var4, (byte)17);
            }

            if (var14 == 1) {
               var0.field1859[var72] = Buffer.method13043(var5, (byte)17);
            }

            if (var15 == 1) {
               var0.field1871[var72] = Buffer.method13039(var6, -346779531);
            }

            if (var16 == 1) {
               var0.field1853[var72] = (short)(Buffer.method13047(var7, -639982632) - 1);
            }

            if (var0.field1868 != null && var0.field1853[var72] != -1) {
               var0.field1868[var72] = (byte)(Buffer.method13039(var8, -346779531) - 1);
            }
         }

         var2.offset = var58 * -1095856699;
         var3.offset = var58 * -1095856699;
         int var73 = 0;
         int var74 = 0;
         int var75 = 0;
         int var76 = 0;

         for (int var77 = 0; var77 < var10; var77++) {
            int var56 = Buffer.method13039(var3, -346779531);
            if (var56 == 1) {
               var73 = var2.method13088(-1767038727) + var76;
               var74 = var2.method13088(-33335713) + var73;
               var75 = var2.method13088(-795617608) + var74;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 2) {
               var74 = var75;
               var75 = var2.method13088(-145083022) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 3) {
               var73 = var75;
               var75 = var2.method13088(-1394156646) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 4) {
               int var57 = var73;
               var73 = var74;
               var74 = var57;
               var75 = var2.method13088(-1183143936) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var57;
               var0.field1865[var77] = var75;
            }
         }

         var2.offset = var58 * -1095856699;
         var3.offset = var58 * -1095856699;
         var4.offset = var58 * -1095856699;
         var5.offset = var58 * -1095856699;
         var6.offset = var58 * -1095856699;
         var7.offset = var58 * -1095856699;

         for (int var78 = 0; var78 < var11; var78++) {
            int var80 = var0.field1861[var78] & 255;
            if (var80 == 0) {
               var0.field1869[var78] = (short)Buffer.method13047(var2, -1543259803);
               var0.field1858[var78] = (short)Buffer.method13047(var2, 1852002342);
               var0.field1862[var78] = (short)Buffer.method13047(var2, 1714746368);
            }
         }

         var2.offset = var58 * -1095856699;
         int var79 = Buffer.method13039(var2, -346779531);
         if (var79 != 0) {
            new classFY();
            Buffer.method13047(var2, -1186071790);
            Buffer.method13047(var2, -1191891964);
            Buffer.method13047(var2, 1217187388);
            var2.method13056((byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bj")
   public void method4035(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field1848; var4++) {
         this.field1855[var4] = var1 * this.field1855[var4] / 128.0F;
         this.field1856[var4] = var2 * this.field1856[var4] / 128.0F;
         this.field1857[var4] = var3 * this.field1857[var4] / 128.0F;
      }

      this.method4051();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("rn")
   public static void method4007(ModelData var0) {
      if (var0 == null) {
         var0.method4068();
      } else {
         for (int var1 = 0; var1 < var0.field1848; var1++) {
            var0.field1857[var1] = -((int)var0.field1857[var1]);
         }

         for (int var3 = 0; var3 < var0.field1849; var3++) {
            int var2 = var0.field1880[var3];
            var0.field1880[var3] = var0.field1865[var3];
            var0.field1865[var3] = var2;
         }

         var0.method4018();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   void method3991() {
      if (this.field1870 != null) {
         int[] var1 = new int[-195620978];
         int var2 = 0;

         for (int var3 = 0; var3 < this.field1848; var3++) {
            int var4 = this.field1870[var3];
            var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field1863 = new int[var2 + 1][];

         for (int var7 = 0; var7 <= var2; var7++) {
            this.field1863[var7] = new int[var1[var7]];
            var1[var7] = 0;
         }

         int var8 = 0;

         while (var8 < this.field1848) {
            int var12 = this.field1870[var8];
            this.field1863[var12][var1[var12]++] = var8++;
         }

         this.field1870 = null;
      }

      if (this.field1871 != null) {
         int[] var5 = new int[1093443836];
         int var6 = 0;

         for (int var9 = 0; var9 < this.field1849; var9++) {
            int var13 = this.field1871[var9];
            var5[var13]++;
            if (var13 > var6) {
               var6 = var13;
            }
         }

         this.field1860 = new int[var6 + 1][];

         for (int var10 = 0; var10 <= var6; var10++) {
            this.field1860[var10] = new int[var5[var10]];
            var5[var10] = 0;
         }

         int var11 = 0;

         while (var11 < this.field1849) {
            int var14 = this.field1871[var11];
            this.field1860[var14][var5[var14]++] = var11++;
         }

         this.field1871 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   public void method4044() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         float var2 = this.field1857[var1];
         this.field1857[var1] = this.field1855[var1];
         this.field1855[var1] = -var2;
      }

      this.method4051();
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("pp")
   public byte[] method4052() {
      return this.field1861;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ler;")
   @ObfuscatedName("aq")
   public ModelData method3987(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4022();
      int var7 = var2 + this.field1886;
      int var8 = var2 + this.field1892;
      int var9 = var4 + this.field1893;
      int var10 = var4 + this.field1891;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11;
            if (var5) {
               var11 = new ModelData(this, true, true, true, true);
               var11.field1856 = new float[var11.field1848];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.field1848; var12++) {
                  int var13 = (int)this.field1855[var12] + var2;
                  int var14 = (int)this.field1857[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1856[var12] = (int)this.field1856[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.field1848; var27++) {
                  int var28 = (-((int)this.field1856[var27]) << 16) / (this.field1743 * -1256242689);
                  if (var28 < var6) {
                     int var29 = (int)this.field1855[var27] + var2;
                     int var30 = (int)this.field1857[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field1856[var27] = (int)this.field1856[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field1856[var27] = this.field1856[var27];
                  }
               }
            }

            var11.method4018();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;Ler;I)I")
   @ObfuscatedName("ti")
   public static int method3982(ModelData var0, ModelData var1, int var2) {
      if (var0 == null) {
         var0.rotateY90Ccw();
      }

      int var3 = -1;
      int var4 = (int)var1.field1855[var2];
      int var5 = (int)var1.field1856[var2];
      int var6 = (int)var1.field1857[var2];

      for (int var7 = 0; var7 < var0.field1848; var7++) {
         if (var4 == (int)var0.field1855[var7] && var5 == (int)var0.field1856[var7] && var6 == (int)var0.field1857[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         var0.field1855[var0.field1848] = var4;
         var0.field1856[var0.field1848] = var5;
         var0.field1857[var0.field1848] = var6;
         if (var1.field1870 != null) {
            var0.field1870[var0.field1848] = var1.field1870[var2];
         }

         if (var1.field1876 != null) {
            var0.field1876[var0.field1848] = var1.field1876[var2];
            var0.field1877[var0.field1848] = var1.field1877[var2];
         }

         var3 = var0.field1848++;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()[Lfr;")
   @ObfuscatedName("dv")
   public classFR[] method4053() {
      return this.field1875;
   }

   @ObfuscatedSignature(descriptor = "(Z)Ler;")
   @ObfuscatedName("kd")
   public ModelData method4039(boolean var1) {
      if (this.field1859 != null) {
         this.field1859 = (byte[])this.field1859.clone();
      } else if (var1) {
         this.field1859 = new byte[this.getFaceCount()];
      }

      return this;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("cz")
   public ModelData method4054() {
      method4042(this);
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("ah")
   public static void method4015(ModelData var0) {
      if (var0 == null) {
         var0.method4017();
      } else if (var0.field1873 == null) {
         var0.field1873 = new classFR[var0.field1848];

         for (int var1 = 0; var1 < var0.field1848; var1++) {
            var0.field1873[var1] = new classFR();
         }

         for (int var17 = 0; var17 < var0.field1849; var17++) {
            int var2 = var0.field1880[var17];
            int var3 = var0.field1864[var17];
            int var4 = var0.field1865[var17];
            int var5 = (int)var0.field1855[var3] - (int)var0.field1855[var2];
            int var6 = (int)var0.field1856[var3] - (int)var0.field1856[var2];
            int var7 = (int)var0.field1857[var3] - (int)var0.field1857[var2];
            int var8 = (int)var0.field1855[var4] - (int)var0.field1855[var2];
            int var9 = (int)var0.field1856[var4] - (int)var0.field1856[var2];
            int var10 = (int)var0.field1857[var4] - (int)var0.field1857[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (var0.field1866 == null) {
               var15 = 0;
            } else {
               var15 = var0.field1866[var17];
            }

            if (var15 == 0) {
               classFR var16 = var0.field1873[var2];
               var16.field2388 += var11 * -1837090135;
               var16.field2387 += var12 * -941718535;
               var16.field2385 += var13 * 1280581247;
               var16.field2386 += -1768043311;
               var16 = var0.field1873[var3];
               var16.field2388 += var11 * -1837090135;
               var16.field2387 += var12 * -941718535;
               var16.field2385 += var13 * 1280581247;
               var16.field2386 += -1768043311;
               var16 = var0.field1873[var4];
               var16.field2388 += var11 * -1837090135;
               var16.field2387 += var12 * -941718535;
               var16.field2385 += var13 * 1280581247;
               var16.field2386 += -1768043311;
            } else if (var15 == 1) {
               if (var0.field1874 == null) {
                  var0.field1874 = new classEB[var0.field1849];
               }

               classEB var23 = var0.field1874[var17] = new classEB();
               var23.field1724 = var11 * 824131919;
               var23.field1720 = var12 * -1800111731;
               var23.field1719 = var13 * -1200391293;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   static final int method3963(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   public short[] getFaceColors() {
      return this.field1852;
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("bm")
   public void method4004(short var1, short var2) {
      if (this.field1853 != null) {
         for (int var3 = 0; var3 < this.field1849; var3++) {
            if (this.field1853[var3] == var1) {
               this.field1853[var3] = var2;
            }
         }
      }
   }

   public int getFaceCount() {
      return this.field1849;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("yl")
   public static void method4016(ModelData var0) {
      if (var0.field1873 == null) {
         var0.field1873 = new classFR[var0.field1848];

         for (int var1 = 0; var1 < var0.field1848; var1++) {
            var0.field1873[var1] = new classFR();
         }

         for (int var17 = 0; var17 < var0.field1849; var17++) {
            int var2 = var0.field1880[var17];
            int var3 = var0.field1864[var17];
            int var4 = var0.field1865[var17];
            int var5 = (int)var0.field1855[var3] - (int)var0.field1855[var2];
            int var6 = (int)var0.field1856[var3] - (int)var0.field1856[var2];
            int var7 = (int)var0.field1857[var3] - (int)var0.field1857[var2];
            int var8 = (int)var0.field1855[var4] - (int)var0.field1855[var2];
            int var9 = (int)var0.field1856[var4] - (int)var0.field1856[var2];
            int var10 = (int)var0.field1857[var4] - (int)var0.field1857[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * -1268471083 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (var0.field1866 == null) {
               var15 = 0;
            } else {
               var15 = var0.field1866[var17];
            }

            if (var15 == 0) {
               classFR var16 = var0.field1873[var2];
               var16.field2388 += var11 * -257626986;
               var16.field2387 += var12 * 1650876054;
               var16.field2385 += var13 * 1280581247;
               var16.field2386 += 466110237;
               var16 = var0.field1873[var3];
               var16.field2388 += var11 * -1349817055;
               var16.field2387 += var12 * 342169220;
               var16.field2385 += var13 * 1280581247;
               var16.field2386 += 1144194558;
               var16 = var0.field1873[var4];
               var16.field2388 += var11 * -1837090135;
               var16.field2387 += var12 * -941718535;
               var16.field2385 += var13 * -1389952198;
               var16.field2386 += -1768043311;
            } else if (var15 == 1) {
               if (var0.field1874 == null) {
                  var0.field1874 = new classEB[var0.field1849];
               }

               classEB var23 = var0.field1874[var17] = new classEB();
               var23.field1724 = var11 * 1704282964;
               var23.field1720 = var12 * 1804973374;
               var23.field1719 = var13 * 1654084164;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("wc")
   public ModelData method4055() {
      return method3985(this);
   }

   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("le")
   public static void method3992(ModelData var0) {
      if (var0 == null) {
         var0.method4068();
      } else {
         if (var0.field1870 != null) {
            int[] var1 = new int[256];
            int var2 = 0;

            for (int var3 = 0; var3 < var0.field1848; var3++) {
               int var4 = var0.field1870[var3];
               var1[var4]++;
               if (var4 > var2) {
                  var2 = var4;
               }
            }

            var0.field1863 = new int[var2 + 1][];

            for (int var7 = 0; var7 <= var2; var7++) {
               var0.field1863[var7] = new int[var1[var7]];
               var1[var7] = 0;
            }

            int var8 = 0;

            while (var8 < var0.field1848) {
               int var12 = var0.field1870[var8];
               var0.field1863[var12][var1[var12]++] = var8++;
            }

            var0.field1870 = null;
         }

         if (var0.field1871 != null) {
            int[] var5 = new int[256];
            int var6 = 0;

            for (int var9 = 0; var9 < var0.field1849; var9++) {
               int var13 = var0.field1871[var9];
               var5[var13]++;
               if (var13 > var6) {
                  var6 = var13;
               }
            }

            var0.field1860 = new int[var6 + 1][];

            for (int var10 = 0; var10 <= var6; var10++) {
               var0.field1860[var10] = new int[var5[var10]];
               var5[var10] = 0;
            }

            int var11 = 0;

            while (var11 < var0.field1849) {
               int var14 = var0.field1871[var11];
               var0.field1860[var14][var5[var14]++] = var11++;
            }

            var0.field1871 = null;
         }
      }
   }

   public int getVerticesCount() {
      return this.field1848;
   }

   ModelData() {
      this.field1849 = 0;
      this.field1851 = 0;
      this.field1850 = false;
   }

   public float[] getVerticesY() {
      return this.field1856;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("yf")
   public Model method3980() {
      return this.method4061(64, 768, -50, -10, -50);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)Ler;")
   @ObfuscatedName("ju")
   public static ModelData method3984(ModelData var0) {
      if (var0 == null) {
         var0.method4051();
      }

      ModelData var1 = new ModelData();
      if (var0.field1866 != null) {
         var1.field1866 = new byte[var0.field1849];

         for (int var2 = 0; var2 < var0.field1849; var2++) {
            var1.field1866[var2] = var0.field1866[var2];
         }
      }

      var1.field1848 = var0.field1848;
      var1.field1849 = var0.field1849;
      var1.field1854 = var0.field1854;
      var1.field1855 = var0.field1855;
      var1.field1856 = var0.field1856;
      var1.field1857 = var0.field1857;
      var1.field1880 = var0.field1880;
      var1.field1864 = var0.field1864;
      var1.field1865 = var0.field1865;
      var1.field1867 = var0.field1867;
      var1.field1859 = var0.field1859;
      var1.field1868 = var0.field1868;
      var1.field1852 = var0.field1852;
      var1.field1853 = var0.field1853;
      var1.field1851 = var0.field1851;
      var1.field1861 = var0.field1861;
      var1.field1869 = var0.field1869;
      var1.field1858 = var0.field1858;
      var1.field1862 = var0.field1862;
      var1.field1870 = var0.field1870;
      var1.field1871 = var0.field1871;
      var1.field1863 = var0.field1863;
      var1.field1860 = var0.field1860;
      var1.field1873 = var0.field1873;
      var1.field1874 = var0.field1874;
      var1.field1878 = var0.field1878;
      var1.field1879 = var0.field1879;
      var1.field1872 = var0.field1872;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   static final int method3966(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method4034() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         float var2 = this.field1855[var1];
         this.field1855[var1] = this.field1857[var1];
         this.field1857[var1] = -var2;
      }

      this.method4051();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method4018() {
      this.field1873 = null;
      this.field1875 = null;
      this.field1874 = null;
      this.field1850 = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;I)V")
   @ObfuscatedName("ui")
   public static void method3997(ModelData var0, int var1) {
      if (var0 == null) {
         var0.method4008();
      } else {
         int var2 = field1884[var1];
         int var3 = field1885[var1];

         for (int var4 = 0; var4 < var0.field1848; var4++) {
            int var5 = (int)var0.field1857[var4] * var2 + (int)var0.field1855[var4] * var3 >> 16;
            var0.field1857[var4] = (int)var0.field1857[var4] * var3 - (int)var0.field1855[var4] * var2 >> 16;
            var0.field1855[var4] = var5;
         }

         var0.method4018();
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aa")
   void method3968(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 26) * -1095856699;
      int var9 = Buffer.method13047(var2, 1277798693);
      int var10 = Buffer.method13047(var2, -1655556399);
      int var11 = Buffer.method13039(var2, -346779531);
      int var12 = Buffer.method13039(var2, -346779531);
      int var13 = Buffer.method13039(var2, -346779531);
      int var14 = Buffer.method13039(var2, -346779531);
      int var15 = Buffer.method13039(var2, -346779531);
      int var16 = Buffer.method13039(var2, -346779531);
      int var17 = Buffer.method13039(var2, -346779531);
      int var18 = Buffer.method13039(var2, -346779531);
      int var19 = Buffer.method13047(var2, -1724857162);
      int var20 = Buffer.method13047(var2, 1158831635);
      int var21 = Buffer.method13047(var2, 1454202988);
      int var22 = Buffer.method13047(var2, -1210610823);
      int var23 = Buffer.method13047(var2, -1120978296);
      int var24 = Buffer.method13047(var2, 1455100402);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         var2.offset = 0;

         for (int var28 = 0; var28 < var11; var28++) {
            byte var29 = this.field1861[var28] = Buffer.method13043(var2, (byte)17);
            if (var29 == 0) {
               var25++;
            }

            if (var29 >= 1 && var29 <= 3) {
               var26++;
            }

            if (var29 == 2) {
               var27++;
            }
         }
      }

      int var60 = var11 + var9;
      int var30 = var60;
      if (var12 == 1) {
         var60 += var10;
      }

      var60 += var10;
      int var32 = var60;
      if (var13 == 255) {
         var60 += var10;
      }

      int var33 = var60;
      if (var15 == 1) {
         var60 += var10;
      }

      var60 += var24;
      int var35 = var60;
      if (var14 == 1) {
         var60 += var10;
      }

      var60 += var22;
      int var37 = var60;
      if (var16 == 1) {
         var60 += var10 * 2;
      }

      var60 += var23;
      var60 += var10 * 2;
      var60 += var19;
      var60 += var20;
      var60 += var21;
      var60 += var25 * 6;
      var60 += var26 * 6;
      var60 += var26 * 6;
      var60 += var26 * 2;
      var60 += var26;
      var60 += var26 * 2 + var27 * 2;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var17 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
      }

      if (var13 == 255) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      if (var16 == 1) {
         this.field1853 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field1868 = new byte[var10];
      }

      if (var18 == 1) {
         this.field1876 = new int[var9][];
         this.field1877 = new int[var9][];
      }

      this.field1852 = new short[var10];
      if (var11 > 0) {
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      var2.offset = var11 * -1095856699;
      var3.offset = var60 * -1095856699;
      var4.offset = var60 * -1095856699;
      var5.offset = var60 * -1095856699;
      var6.offset = var60 * -1095856699;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      for (int var53 = 0; var53 < var9; var53++) {
         int var54 = Buffer.method13039(var2, -346779531);
         int var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method13088(-2019001641);
         }

         int var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method13088(-1998852412);
         }

         int var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method13088(-26943008);
         }

         this.field1855[var53] = var50 + var55;
         this.field1856[var53] = var51 + var56;
         this.field1857[var53] = var52 + var57;
         var50 = (int)this.field1855[var53];
         var51 = (int)this.field1856[var53];
         var52 = (int)this.field1857[var53];
         if (var17 == 1) {
            this.field1870[var53] = Buffer.method13039(var6, -346779531);
         }
      }

      if (var18 == 1) {
         for (int var75 = 0; var75 < var9; var75++) {
            int var78 = Buffer.method13039(var6, -346779531);
            this.field1876[var75] = new int[var78];
            this.field1877[var75] = new int[var78];

            for (int var80 = 0; var80 < var78; var80++) {
               this.field1876[var75][var80] = Buffer.method13039(var6, -346779531);
               this.field1877[var75][var80] = Buffer.method13039(var6, -346779531);
            }
         }
      }

      var2.offset = var60 * -1095856699;
      var3.offset = var30 * -1095856699;
      var4.offset = var32 * -1095856699;
      var5.offset = var35 * -1095856699;
      var6.offset = var33 * -1095856699;
      var7.offset = var37 * -1095856699;
      var8.offset = var60 * -1095856699;

      for (int var76 = 0; var76 < var10; var76++) {
         this.field1852[var76] = (short)Buffer.method13047(var2, 1109783010);
         if (var12 == 1) {
            this.field1866[var76] = Buffer.method13043(var3, (byte)17);
         }

         if (var13 == 255) {
            this.field1867[var76] = Buffer.method13043(var4, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var76] = Buffer.method13043(var5, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var76] = Buffer.method13039(var6, -346779531);
         }

         if (var16 == 1) {
            this.field1853[var76] = (short)(Buffer.method13047(var7, 1418114394) - 1);
         }

         if (this.field1868 != null && this.field1853[var76] != -1) {
            this.field1868[var76] = (byte)(Buffer.method13039(var8, -346779531) - 1);
         }
      }

      var2.offset = var60 * -1095856699;
      var3.offset = var60 * -1095856699;
      int var77 = 0;
      int var79 = 0;
      int var81 = 0;
      int var82 = 0;

      for (int var83 = 0; var83 < var10; var83++) {
         int var58 = Buffer.method13039(var3, -346779531);
         if (var58 == 1) {
            var77 = var2.method13088(-820866785) + var82;
            var79 = var2.method13088(-1269051955) + var77;
            var81 = var2.method13088(-531881062) + var79;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 2) {
            var79 = var81;
            var81 = var2.method13088(-371137809) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 3) {
            var77 = var81;
            var81 = var2.method13088(-2091946271) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 4) {
            int var59 = var77;
            var77 = var79;
            var79 = var59;
            var81 = var2.method13088(-1564569824) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var59;
            this.field1865[var83] = var81;
         }
      }

      var2.offset = var60 * -1095856699;
      var3.offset = var60 * -1095856699;
      var4.offset = var60 * -1095856699;
      var5.offset = var60 * -1095856699;
      var6.offset = var60 * -1095856699;
      var7.offset = var60 * -1095856699;

      for (int var84 = 0; var84 < var11; var84++) {
         int var86 = this.field1861[var84] & 255;
         if (var86 == 0) {
            this.field1869[var84] = (short)Buffer.method13047(var2, -1784628299);
            this.field1858[var84] = (short)Buffer.method13047(var2, 1486773971);
            this.field1862[var84] = (short)Buffer.method13047(var2, -73506983);
         }
      }

      var2.offset = var60 * -1095856699;
      int var85 = Buffer.method13039(var2, -346779531);
      if (var85 != 0) {
         new classFY();
         Buffer.method13047(var2, 403106955);
         Buffer.method13047(var2, 1934831337);
         Buffer.method13047(var2, 1865626131);
         var2.method13056((byte)1);
      }

      boolean var87 = Buffer.method13039(var2, -346779531) == 1;
      if (var87) {
         this.field1872 = new byte[var10];

         for (int var88 = 0; var88 < var10; var88++) {
            this.field1872[var88] = Buffer.method13043(var2, (byte)17);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lfx;")
   @ObfuscatedName("ba")
   public final Model method4045(int var1, int var2, int var3, int var4, int var5) {
      client.logger.trace("Lighting model {}", this);
      int var12 = var5;
      int var11 = var4;
      int var10 = var3;
      int var8 = var1;
      ModelData var7 = this;
      method4015(this);
      int var13 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var14 = var2 * var13 >> 8;
      Model var15 = new Model();
      var15.field2434 = new int[this.field1849];
      var15.field2428 = new int[this.field1849];
      var15.field2435 = new int[this.field1849];
      if (this.field1854 > 0 && this.field1868 != null) {
         int[] var16 = new int[this.field1854];

         for (int var17 = 0; var17 < var7.field1849; var17++) {
            if (var7.field1868[var17] != -1) {
               var16[var7.field1868[var17] & 255]++;
            }
         }

         var15.field2418 = 0;

         for (int var24 = 0; var24 < var7.field1854; var24++) {
            if (var16[var24] > 0 && var7.field1861[var24] == 0) {
               var15.field2418++;
            }
         }

         var15.field2439 = new int[var15.field2418];
         var15.field2440 = new int[var15.field2418];
         var15.field2441 = new int[var15.field2418];
         int var25 = 0;

         for (int var18 = 0; var18 < var7.field1854; var18++) {
            if (var16[var18] > 0 && var7.field1861[var18] == 0) {
               var15.field2439[var25] = var7.field1869[var18] & '\uffff';
               var15.field2440[var25] = var7.field1858[var18] & '\uffff';
               var15.field2441[var25] = var7.field1862[var18] & '\uffff';
               var16[var18] = var25++;
            } else {
               var16[var18] = -1;
            }
         }

         var15.field2436 = new byte[var7.field1849];

         for (int var27 = 0; var27 < var7.field1849; var27++) {
            if (var7.field1868[var27] != -1) {
               var15.field2436[var27] = (byte)var16[var7.field1868[var27] & 255];
            } else {
               var15.field2436[var27] = -1;
            }
         }
      }

      for (int var23 = 0; var23 < var7.field1849; var23++) {
         byte var26;
         if (var7.field1866 == null) {
            var26 = 0;
         } else {
            var26 = var7.field1866[var23];
         }

         byte var28;
         if (var7.field1859 == null) {
            var28 = 0;
         } else {
            var28 = var7.field1859[var23];
         }

         short var19;
         if (var7.field1853 == null) {
            var19 = -1;
         } else {
            var19 = var7.field1853[var23];
         }

         if (var28 == -2) {
            var26 = 3;
         }

         if (var28 == -1) {
            var26 = 2;
         }

         if (var19 == -1) {
            if (var26 == 0) {
               int var22 = var7.field1852[var23] & '\uffff';
               classFR var20;
               if (var7.field1875 != null && var7.field1875[var7.field1880[var23]] != null) {
                  var20 = var7.field1875[var7.field1880[var23]];
               } else {
                  var20 = var7.field1873[var7.field1880[var23]];
               }

               int var21 = var8
                  + (var10 * var20.field2388 * -1174074983 + var11 * var20.field2387 * -794112439 + var12 * var20.field2385 * -949378689)
                     / (var14 * var20.field2386 * 1200753713);
               var15.field2434[var23] = method3963(var22, var21);
               if (var7.field1875 != null && var7.field1875[var7.field1864[var23]] != null) {
                  var20 = var7.field1875[var7.field1864[var23]];
               } else {
                  var20 = var7.field1873[var7.field1864[var23]];
               }

               var21 = var8
                  + (var10 * var20.field2388 * -1174074983 + var11 * var20.field2387 * -794112439 + var12 * var20.field2385 * -949378689)
                     / (var14 * var20.field2386 * 1200753713);
               var15.field2428[var23] = method3963(var22, var21);
               if (var7.field1875 != null && var7.field1875[var7.field1865[var23]] != null) {
                  var20 = var7.field1875[var7.field1865[var23]];
               } else {
                  var20 = var7.field1873[var7.field1865[var23]];
               }

               var21 = var8
                  + (var10 * var20.field2388 * -1174074983 + var11 * var20.field2387 * -794112439 + var12 * var20.field2385 * -949378689)
                     / (var14 * var20.field2386 * 1200753713);
               var15.field2435[var23] = method3963(var22, var21);
            } else if (var26 == 1) {
               classEB var31 = var7.field1874[var23];
               int var38 = var8
                  + (var10 * var31.field1724 * 835925423 + var11 * var31.field1720 * 696545605 + var12 * var31.field1719 * -1298928853) / (var14 + var14 / 2);
               var15.field2434[var23] = method3963(var7.field1852[var23] & '\uffff', var38);
               var15.field2435[var23] = -1;
            } else if (var26 == 3) {
               var15.field2434[var23] = 128;
               var15.field2435[var23] = -1;
            } else {
               var15.field2435[var23] = -2;
            }
         } else if (var26 == 0) {
            classFR var32;
            if (var7.field1875 != null && var7.field1875[var7.field1880[var23]] != null) {
               var32 = var7.field1875[var7.field1880[var23]];
            } else {
               var32 = var7.field1873[var7.field1880[var23]];
            }

            int var39 = var8
               + (var10 * var32.field2388 * -1174074983 + var11 * var32.field2387 * -794112439 + var12 * var32.field2385 * -949378689)
                  / (var14 * var32.field2386 * 1200753713);
            var15.field2434[var23] = method3966(var39);
            if (var7.field1875 != null && var7.field1875[var7.field1864[var23]] != null) {
               var32 = var7.field1875[var7.field1864[var23]];
            } else {
               var32 = var7.field1873[var7.field1864[var23]];
            }

            var39 = var8
               + (var10 * var32.field2388 * -1174074983 + var11 * var32.field2387 * -794112439 + var12 * var32.field2385 * -949378689)
                  / (var14 * var32.field2386 * 1200753713);
            var15.field2428[var23] = method3966(var39);
            if (var7.field1875 != null && var7.field1875[var7.field1865[var23]] != null) {
               var32 = var7.field1875[var7.field1865[var23]];
            } else {
               var32 = var7.field1873[var7.field1865[var23]];
            }

            var39 = var8
               + (var10 * var32.field2388 * -1174074983 + var11 * var32.field2387 * -794112439 + var12 * var32.field2385 * -949378689)
                  / (var14 * var32.field2386 * 1200753713);
            var15.field2435[var23] = method3966(var39);
         } else if (var26 == 1) {
            classEB var35 = var7.field1874[var23];
            int var42 = var8
               + (var10 * var35.field1724 * 835925423 + var11 * var35.field1720 * 696545605 + var12 * var35.field1719 * -1298928853) / (var14 + var14 / 2);
            var15.field2434[var23] = method3966(var42);
            var15.field2435[var23] = -1;
         } else {
            var15.field2435[var23] = -2;
         }
      }

      method3992(var7);
      var15.field2424 = var7.field1848;
      var15.field2427 = var7.field1855;
      var15.field2430 = var7.field1856;
      var15.field2426 = var7.field1857;
      var15.field2419 = var7.field1849;
      var15.field2429 = var7.field1880;
      var15.field2432 = var7.field1864;
      var15.field2433 = var7.field1865;
      var15.field2431 = var7.field1867;
      var15.field2444 = var7.field1859;
      var15.field2420 = var7.field1851;
      var15.field2442 = var7.field1863;
      var15.field2443 = var7.field1860;
      var15.field2437 = var7.field1853;
      var15.field2508 = var7.field1876;
      var15.field2507 = var7.field1877;
      var15.field2438 = var7.field1872;
      if (var15 == null) {
         return null;
      } else {
         if ((client.field1096 & 4) == 4) {
            this.method4038();
            var15.field2503 = this.field1897;
            var15.field2504 = this.field1898;
            var15.field2505 = this.field1899;
         }

         if ((client.field1096 & 64) == 64) {
            var15.field2506 = this.field1852;
         }

         return var15;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;[B)V")
   @ObfuscatedName("er")
   public static void method3971(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method3973(var1);
      }

      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * -1095856699;
      int var9 = Buffer.method13047(var4, -107791080);
      int var10 = Buffer.method13047(var4, -768146370);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13039(var4, -346779531);
      int var18 = Buffer.method13047(var4, 795681871);
      int var19 = Buffer.method13047(var4, -2010188365);
      int var20 = Buffer.method13047(var4, -762798976);
      int var21 = Buffer.method13047(var4, -2050234948);
      int var22 = Buffer.method13047(var4, -833548673);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 1822631066) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      var0.field1848 = var9;
      var0.field1849 = var10;
      var0.field1854 = var11;
      var0.field1855 = new float[var9];
      var0.field1856 = new float[var9];
      var0.field1857 = new float[var9];
      var0.field1880 = new int[var10];
      var0.field1864 = new int[var10];
      var0.field1865 = new int[var10];
      if (var11 > 0) {
         var0.field1861 = new byte[var11];
         var0.field1869 = new short[var11];
         var0.field1858 = new short[var11];
         var0.field1862 = new short[var11];
      }

      if (var16 == 1) {
         var0.field1870 = new int[var9];
      }

      if (var12 == 1) {
         var0.field1866 = new byte[var10];
         var0.field1868 = new byte[var10];
         var0.field1853 = new short[var10];
      }

      if (var13 == -32858800) {
         var0.field1867 = new byte[var10];
      } else {
         var0.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         var0.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         var0.field1871 = new int[var10];
      }

      if (var17 == 1) {
         var0.field1876 = new int[var9][];
         var0.field1877 = new int[var9][];
      }

      var0.field1852 = new short[var10];
      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      var6.offset = var23 * -1095856699;
      var7.offset = var23 * -1095856699;
      var8.offset = var23 * -2100283791;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = Buffer.method13039(var4, -346779531);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method13088(-1601290666);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.method13088(-1962808119);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.method13088(-1604606323);
         }

         var0.field1855[var41] = var38 + var43;
         var0.field1856[var41] = var39 + var44;
         var0.field1857[var41] = var40 + var45;
         var38 = (int)var0.field1855[var41];
         var39 = (int)var0.field1856[var41];
         var40 = (int)var0.field1857[var41];
         if (var16 == 1) {
            var0.field1870[var41] = Buffer.method13039(var8, -346779531);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = Buffer.method13039(var8, -346779531);
            var0.field1876[var58] = new int[var61];
            var0.field1877[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               var0.field1876[var58][var64] = Buffer.method13039(var8, -346779531);
               var0.field1877[var58][var64] = Buffer.method13039(var8, -346779531);
            }
         }
      }

      var4.offset = var23 * -1530650428;
      var5.offset = var28 * -1095856699;
      var6.offset = var26 * -1095856699;
      var7.offset = var30 * -2123116226;
      var8.offset = var27 * -464439939;

      for (int var59 = 0; var59 < var10; var59++) {
         var0.field1852[var59] = (short)Buffer.method13047(var4, 487913714);
         if (var12 == 1) {
            int var62 = Buffer.method13039(var5, -346779531);
            if ((var62 & 1) == 1) {
               var0.field1866[var59] = 1;
               var2 = true;
            } else {
               var0.field1866[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               var0.field1868[var59] = (byte)(var62 >> 2);
               var0.field1853[var59] = var0.field1852[var59];
               var0.field1852[var59] = (short)-1173186371;
               if (var0.field1853[var59] != -1) {
                  var3 = true;
               }
            } else {
               var0.field1868[var59] = -1;
               var0.field1853[var59] = -1;
            }
         }

         if (var13 == 255) {
            var0.field1867[var59] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            var0.field1859[var59] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            var0.field1871[var59] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = Buffer.method13039(var5, -346779531);
         if (var46 == 1) {
            var60 = var4.method13088(-1061225280) + var66;
            var63 = var4.method13088(-1001751831) + var60;
            var65 = var4.method13088(-169230939) + var63;
            var66 = var65;
            var0.field1880[var67] = var60;
            var0.field1864[var67] = var63;
            var0.field1865[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.method13088(-324407637) + var66;
            var66 = var65;
            var0.field1880[var67] = var60;
            var0.field1864[var67] = var63;
            var0.field1865[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.method13088(-1059913088) + var66;
            var66 = var65;
            var0.field1880[var67] = var60;
            var0.field1864[var67] = var63;
            var0.field1865[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.method13088(-181421895) + var66;
            var66 = var65;
            var0.field1880[var67] = var60;
            var0.field1864[var67] = var47;
            var0.field1865[var67] = var65;
         }
      }

      var4.offset = var23 * -1095856699;

      for (int var68 = 0; var68 < var11; var68++) {
         var0.field1861[var68] = 0;
         var0.field1869[var68] = (short)Buffer.method13047(var4, -857983386);
         var0.field1858[var68] = (short)Buffer.method13047(var4, -141855442);
         var0.field1862[var68] = (short)Buffer.method13047(var4, -1836913907);
      }

      var4.offset = var23 * -926635913;
      boolean var69 = Buffer.method13039(var4, -346779531) == 1;
      if (var69) {
         var0.field1872 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            var0.field1872[var70] = Buffer.method13043(var4, (byte)17);
         }
      }

      if (var0.field1868 != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = var0.field1868[var72] & 255;
            if (var48 != 552178001) {
               if ((var0.field1869[var48] & -432877611) == var0.field1880[var72]
                  && (var0.field1858[var48] & 1121576698) == var0.field1864[var72]
                  && (var0.field1862[var48] & 618463106) == var0.field1865[var72]) {
                  var0.field1868[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            var0.field1868 = null;
         }
      }

      if (!var3) {
         var0.field1853 = null;
      }

      if (!var2) {
         var0.field1866 = null;
      }
   }

   public short[] getFaceTextures() {
      return this.field1853;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("bw")
   public final Model method4028() {
      return this.method4045(128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("de")
   public final Model method4029() {
      return this.method4045(128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Ler;")
   @ObfuscatedName("bb")
   public static ModelData method3958(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -1949070972);
      return var3 == null ? null : new ModelData(var3);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Ler;")
   @ObfuscatedName("bi")
   public static ModelData method3959(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -1706517238);
      return var3 == null ? null : new ModelData(var3);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Ler;")
   @ObfuscatedName("be")
   public static ModelData method3960(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -789070626);
      return var3 == null ? null : new ModelData(var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;Ler;IIIZ)V")
   @ObfuscatedName("by")
   static void method3962(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      var0.method4022();
      method4015(var0);
      var1.method4022();
      method4015(var1);
      field1882++;
      int var6 = 0;
      float[] var7 = var1.field1855;
      int var8 = var1.field1848;

      for (int var9 = 0; var9 < var0.field1848; var9++) {
         classFR var10 = var0.field1873[var9];
         if (var10.field2386 * 1200753713 != 0) {
            int var11 = (int)var0.field1856[var9] - var3;
            if (var11 <= var1.field1889) {
               int var12 = (int)var0.field1855[var9] - var2;
               if (var12 >= var1.field1886 && var12 <= var1.field1892) {
                  int var13 = (int)var0.field1857[var9] - var4;
                  if (var13 >= var1.field1893 && var13 <= var1.field1891) {
                     for (int var14 = 0; var14 < var8; var14++) {
                        classFR var15 = var1.field1873[var14];
                        if (var12 == (int)var7[var14]
                           && var13 == (int)var1.field1857[var14]
                           && var11 == (int)var1.field1856[var14]
                           && var15.field2386 * 1200753713 != 0) {
                           if (var0.field1875 == null) {
                              var0.field1875 = new classFR[var0.field1848];
                           }

                           if (var1.field1875 == null) {
                              var1.field1875 = new classFR[var8];
                           }

                           classFR var16 = var0.field1875[var9];
                           if (var16 == null) {
                              var16 = var0.field1875[var9] = new classFR(var10);
                           }

                           classFR var17 = var1.field1875[var14];
                           if (var17 == null) {
                              var17 = var1.field1875[var14] = new classFR(var15);
                           }

                           var16.field2388 = var16.field2388 + var15.field2388 * 1;
                           var16.field2387 = var16.field2387 + var15.field2387 * 1;
                           var16.field2385 = var16.field2385 + var15.field2385 * 1;
                           var16.field2386 = var16.field2386 + var15.field2386 * 1;
                           var17.field2388 = var17.field2388 + var10.field2388 * 1;
                           var17.field2387 = var17.field2387 + var10.field2387 * 1;
                           var17.field2385 = var17.field2385 + var10.field2385 * 1;
                           var17.field2386 = var17.field2386 + var10.field2386 * 1;
                           var6++;
                           field1881[var9] = field1882;
                           field1883[var14] = field1882;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for (int var18 = 0; var18 < var0.field1849; var18++) {
            if (field1881[var0.field1880[var18]] == field1882 && field1881[var0.field1864[var18]] == field1882 && field1881[var0.field1865[var18]] == field1882
               )
             {
               if (var0.field1866 == null) {
                  var0.field1866 = new byte[var0.field1849];
               }

               var0.field1866[var18] = 2;
            }
         }

         for (int var19 = 0; var19 < var1.field1849; var19++) {
            if (field1883[var1.field1880[var19]] == field1882 && field1883[var1.field1864[var19]] == field1882 && field1883[var1.field1865[var19]] == field1882
               )
             {
               if (var1.field1866 == null) {
                  var1.field1866 = new byte[var1.field1849];
               }

               var1.field1866[var19] = 2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bq")
   static final int method3964(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 950961110;
      }

      return (var0 & -640308086) + var1;
   }

   @ObfuscatedSignature(descriptor = "(III)Ler;")
   @ObfuscatedName("ry")
   public ModelData method4056(int var1, int var2, int var3) {
      this.method4035(var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("aa")
   public ModelData method4046() {
      return new ModelData(this, true, true, true, true);
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("vj")
   public ModelData method4033() {
      return this.method4039(false);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bc")
   public void method3998(int var1) {
      int var2 = field1884[var1];
      int var3 = field1885[var1];

      for (int var4 = 0; var4 < this.field1848; var4++) {
         int var5 = (int)this.field1857[var4] * var2 + (int)this.field1855[var4] * var3 >> 16;
         this.field1857[var4] = (int)this.field1857[var4] * var3 - (int)this.field1855[var4] * var2 >> 16;
         this.field1855[var4] = var5;
      }

      this.method4018();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bs")
   static final int method3967(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 690581751) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("du")
   public ModelData method4037() {
      this.field1855 = (float[])this.field1855.clone();
      this.field1856 = (float[])this.field1856.clone();
      this.field1857 = (float[])this.field1857.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bv")
   void method3969(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 26) * -1312014050;
      int var9 = Buffer.method13047(var2, 943286945);
      int var10 = Buffer.method13047(var2, -1832277032);
      int var11 = Buffer.method13039(var2, -346779531);
      int var12 = Buffer.method13039(var2, -346779531);
      int var13 = Buffer.method13039(var2, -346779531);
      int var14 = Buffer.method13039(var2, -346779531);
      int var15 = Buffer.method13039(var2, -346779531);
      int var16 = Buffer.method13039(var2, -346779531);
      int var17 = Buffer.method13039(var2, -346779531);
      int var18 = Buffer.method13039(var2, -346779531);
      int var19 = Buffer.method13047(var2, -266792912);
      int var20 = Buffer.method13047(var2, -973816511);
      int var21 = Buffer.method13047(var2, -2097658870);
      int var22 = Buffer.method13047(var2, 995001239);
      int var23 = Buffer.method13047(var2, -1544607665);
      int var24 = Buffer.method13047(var2, 1622989543);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         var2.offset = 0;

         for (int var28 = 0; var28 < var11; var28++) {
            byte var29 = this.field1861[var28] = Buffer.method13043(var2, (byte)17);
            if (var29 == 0) {
               var25++;
            }

            if (var29 >= 1 && var29 <= 3) {
               var26++;
            }

            if (var29 == 2) {
               var27++;
            }
         }
      }

      int var60 = var11 + var9;
      int var30 = var60;
      if (var12 == 1) {
         var60 += var10;
      }

      var60 += var10;
      int var32 = var60;
      if (var13 == 255) {
         var60 += var10;
      }

      int var33 = var60;
      if (var15 == 1) {
         var60 += var10;
      }

      var60 += var24;
      int var35 = var60;
      if (var14 == 1) {
         var60 += var10;
      }

      var60 += var22;
      int var37 = var60;
      if (var16 == 1) {
         var60 += var10 * 2;
      }

      var60 += var23;
      var60 += var10 * 2;
      var60 += var19;
      var60 += var20;
      var60 += var21;
      var60 += var25 * 6;
      var60 += var26 * 6;
      var60 += var26 * 6;
      var60 += var26 * 2;
      var60 += var26;
      var60 += var26 * 2 + var27 * 2;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var17 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
      }

      if (var13 == -1198027113) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      if (var16 == 1) {
         this.field1853 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field1868 = new byte[var10];
      }

      if (var18 == 1) {
         this.field1876 = new int[var9][];
         this.field1877 = new int[var9][];
      }

      this.field1852 = new short[var10];
      if (var11 > 0) {
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      var2.offset = var11 * 1257410277;
      var3.offset = var60 * -1095856699;
      var4.offset = var60 * -1095856699;
      var5.offset = var60 * -1095856699;
      var6.offset = var60 * -1095856699;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      for (int var53 = 0; var53 < var9; var53++) {
         int var54 = Buffer.method13039(var2, -346779531);
         int var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method13088(-1266949422);
         }

         int var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method13088(-357876484);
         }

         int var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method13088(-700610924);
         }

         this.field1855[var53] = var50 + var55;
         this.field1856[var53] = var51 + var56;
         this.field1857[var53] = var52 + var57;
         var50 = (int)this.field1855[var53];
         var51 = (int)this.field1856[var53];
         var52 = (int)this.field1857[var53];
         if (var17 == 1) {
            this.field1870[var53] = Buffer.method13039(var6, -346779531);
         }
      }

      if (var18 == 1) {
         for (int var75 = 0; var75 < var9; var75++) {
            int var78 = Buffer.method13039(var6, -346779531);
            this.field1876[var75] = new int[var78];
            this.field1877[var75] = new int[var78];

            for (int var80 = 0; var80 < var78; var80++) {
               this.field1876[var75][var80] = Buffer.method13039(var6, -346779531);
               this.field1877[var75][var80] = Buffer.method13039(var6, -346779531);
            }
         }
      }

      var2.offset = var60 * 64708594;
      var3.offset = var30 * 1155047495;
      var4.offset = var32 * -636543447;
      var5.offset = var35 * -1689854064;
      var6.offset = var33 * -1095856699;
      var7.offset = var37 * -1095856699;
      var8.offset = var60 * 64210140;

      for (int var76 = 0; var76 < var10; var76++) {
         this.field1852[var76] = (short)Buffer.method13047(var2, -729629920);
         if (var12 == 1) {
            this.field1866[var76] = Buffer.method13043(var3, (byte)17);
         }

         if (var13 == 255) {
            this.field1867[var76] = Buffer.method13043(var4, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var76] = Buffer.method13043(var5, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var76] = Buffer.method13039(var6, -346779531);
         }

         if (var16 == 1) {
            this.field1853[var76] = (short)(Buffer.method13047(var7, -931554207) - 1);
         }

         if (this.field1868 != null && this.field1853[var76] != -1) {
            this.field1868[var76] = (byte)(Buffer.method13039(var8, -346779531) - 1);
         }
      }

      var2.offset = var60 * -1095856699;
      var3.offset = var60 * -1095856699;
      int var77 = 0;
      int var79 = 0;
      int var81 = 0;
      int var82 = 0;

      for (int var83 = 0; var83 < var10; var83++) {
         int var58 = Buffer.method13039(var3, -346779531);
         if (var58 == 1) {
            var77 = var2.method13088(-1759890500) + var82;
            var79 = var2.method13088(-1901725482) + var77;
            var81 = var2.method13088(-37560037) + var79;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 2) {
            var79 = var81;
            var81 = var2.method13088(-985378165) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 3) {
            var77 = var81;
            var81 = var2.method13088(-40263168) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var79;
            this.field1865[var83] = var81;
         }

         if (var58 == 4) {
            int var59 = var77;
            var77 = var79;
            var79 = var59;
            var81 = var2.method13088(-1564399988) + var82;
            var82 = var81;
            this.field1880[var83] = var77;
            this.field1864[var83] = var59;
            this.field1865[var83] = var81;
         }
      }

      var2.offset = var60 * 1752414164;
      var3.offset = var60 * -1241614583;
      var4.offset = var60 * -704567144;
      var5.offset = var60 * -2006696866;
      var6.offset = var60 * 1525379766;
      var7.offset = var60 * -1317083559;

      for (int var84 = 0; var84 < var11; var84++) {
         int var86 = this.field1861[var84] & -2136465011;
         if (var86 == 0) {
            this.field1869[var84] = (short)Buffer.method13047(var2, 610495080);
            this.field1858[var84] = (short)Buffer.method13047(var2, -1407439569);
            this.field1862[var84] = (short)Buffer.method13047(var2, -770670681);
         }
      }

      var2.offset = var60 * -1261238482;
      int var85 = Buffer.method13039(var2, -346779531);
      if (var85 != 0) {
         new classFY();
         Buffer.method13047(var2, -2128997857);
         Buffer.method13047(var2, -1189846446);
         Buffer.method13047(var2, -22901189);
         var2.method13056((byte)1);
      }

      boolean var87 = Buffer.method13039(var2, -346779531) == 1;
      if (var87) {
         this.field1872 = new byte[var10];

         for (int var88 = 0; var88 < var10; var88++) {
            this.field1872[var88] = Buffer.method13043(var2, (byte)17);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;)Ler;")
   @ObfuscatedName("bc")
   public static ModelData method3985(ModelData var0) {
      if (var0 == null) {
         return var0.method3986();
      } else {
         ModelData var1 = new ModelData();
         if (var0.field1866 != null) {
            var1.field1866 = new byte[var0.field1849];

            for (int var2 = 0; var2 < var0.field1849; var2++) {
               var1.field1866[var2] = var0.field1866[var2];
            }
         }

         var1.field1848 = var0.field1848;
         var1.field1849 = var0.field1849;
         var1.field1854 = var0.field1854;
         var1.field1855 = var0.field1855;
         var1.field1856 = var0.field1856;
         var1.field1857 = var0.field1857;
         var1.field1880 = var0.field1880;
         var1.field1864 = var0.field1864;
         var1.field1865 = var0.field1865;
         var1.field1867 = var0.field1867;
         var1.field1859 = var0.field1859;
         var1.field1868 = var0.field1868;
         var1.field1852 = var0.field1852;
         var1.field1853 = var0.field1853;
         var1.field1851 = var0.field1851;
         var1.field1861 = var0.field1861;
         var1.field1869 = var0.field1869;
         var1.field1858 = var0.field1858;
         var1.field1862 = var0.field1862;
         var1.field1870 = var0.field1870;
         var1.field1871 = var0.field1871;
         var1.field1863 = var0.field1863;
         var1.field1860 = var0.field1860;
         var1.field1873 = var0.field1873;
         var1.field1874 = var0.field1874;
         var1.field1878 = var0.field1878;
         var1.field1879 = var0.field1879;
         var1.field1872 = var0.field1872;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("rz")
   public short[] method4057() {
      return this.field1869;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bd")
   void method3972(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * 123268252;
      int var9 = Buffer.method13047(var4, 1910827335);
      int var10 = Buffer.method13047(var4, 838602305);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13039(var4, -346779531);
      int var18 = Buffer.method13047(var4, 235013632);
      int var19 = Buffer.method13047(var4, 1116533836);
      int var20 = Buffer.method13047(var4, -2015401052);
      int var21 = Buffer.method13047(var4, 1884579926);
      int var22 = Buffer.method13047(var4, -1964109579);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      if (var16 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
         this.field1868 = new byte[var10];
         this.field1853 = new short[var10];
      }

      if (var13 == -943129300) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      if (var17 == 1) {
         this.field1876 = new int[var9][];
         this.field1877 = new int[var9][];
      }

      this.field1852 = new short[var10];
      var4.offset = var23 * -44275543;
      var5.offset = var23 * 2132904190;
      var6.offset = var23 * 1597765480;
      var7.offset = var23 * -1095856699;
      var8.offset = var23 * -1095856699;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = Buffer.method13039(var4, -346779531);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method13088(-1402273016);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.method13088(-113933763);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.method13088(-468696328);
         }

         this.field1855[var41] = var38 + var43;
         this.field1856[var41] = var39 + var44;
         this.field1857[var41] = var40 + var45;
         var38 = (int)this.field1855[var41];
         var39 = (int)this.field1856[var41];
         var40 = (int)this.field1857[var41];
         if (var16 == 1) {
            this.field1870[var41] = Buffer.method13039(var8, -346779531);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = Buffer.method13039(var8, -346779531);
            this.field1876[var58] = new int[var61];
            this.field1877[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field1876[var58][var64] = Buffer.method13039(var8, -346779531);
               this.field1877[var58][var64] = Buffer.method13039(var8, -346779531);
            }
         }
      }

      var4.offset = var23 * -1095856699;
      var5.offset = var28 * -1631420608;
      var6.offset = var26 * -1095856699;
      var7.offset = var30 * -1095856699;
      var8.offset = var27 * 1899692954;

      for (int var59 = 0; var59 < var10; var59++) {
         this.field1852[var59] = (short)Buffer.method13047(var4, -1387701971);
         if (var12 == 1) {
            int var62 = Buffer.method13039(var5, -346779531);
            if ((var62 & 1) == 1) {
               this.field1866[var59] = 1;
               var2 = true;
            } else {
               this.field1866[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.field1868[var59] = (byte)(var62 >> 2);
               this.field1853[var59] = this.field1852[var59];
               this.field1852[var59] = (short)2142449124;
               if (this.field1853[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.field1868[var59] = -1;
               this.field1853[var59] = -1;
            }
         }

         if (var13 == -2146224790) {
            this.field1867[var59] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var59] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var59] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var23 * -807114937;
      var5.offset = var23 * -1095856699;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = Buffer.method13039(var5, -346779531);
         if (var46 == 1) {
            var60 = var4.method13088(-260723791) + var66;
            var63 = var4.method13088(-1405011711) + var60;
            var65 = var4.method13088(-920675607) + var63;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.method13088(-22342246) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.method13088(-1914868462) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var63;
            this.field1865[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.method13088(-1534744898) + var66;
            var66 = var65;
            this.field1880[var67] = var60;
            this.field1864[var67] = var47;
            this.field1865[var67] = var65;
         }
      }

      var4.offset = var23 * -1095856699;

      for (int var68 = 0; var68 < var11; var68++) {
         this.field1861[var68] = 0;
         this.field1869[var68] = (short)Buffer.method13047(var4, 940791349);
         this.field1858[var68] = (short)Buffer.method13047(var4, 36624017);
         this.field1862[var68] = (short)Buffer.method13047(var4, 1660472306);
      }

      var4.offset = var23 * -1095856699;
      boolean var69 = Buffer.method13039(var4, -346779531) == 1;
      if (var69) {
         this.field1872 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field1872[var70] = Buffer.method13043(var4, (byte)17);
         }
      }

      if (this.field1868 != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.field1868[var72] & 1537777256;
            if (var48 != 255) {
               if ((this.field1869[var48] & 1234833934) == this.field1880[var72]
                  && (this.field1858[var48] & '\uffff') == this.field1864[var72]
                  && (this.field1862[var48] & -1564257935) == this.field1865[var72]) {
                  this.field1868[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.field1868 = null;
         }
      }

      if (!var3) {
         this.field1853 = null;
      }

      if (!var2) {
         this.field1866 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bl")
   void method3975(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * -1095856699;
      int var9 = Buffer.method13047(var2, 1971080851);
      int var10 = Buffer.method13047(var2, -665527169);
      int var11 = Buffer.method13039(var2, -346779531);
      int var12 = Buffer.method13039(var2, -346779531);
      int var13 = Buffer.method13039(var2, -346779531);
      int var14 = Buffer.method13039(var2, -346779531);
      int var15 = Buffer.method13039(var2, -346779531);
      int var16 = Buffer.method13039(var2, -346779531);
      int var17 = Buffer.method13039(var2, -346779531);
      int var18 = Buffer.method13047(var2, -560916877);
      int var19 = Buffer.method13047(var2, 1655697284);
      int var20 = Buffer.method13047(var2, -728015589);
      int var21 = Buffer.method13047(var2, 1658603141);
      int var22 = Buffer.method13047(var2, 1156011406);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.field1861[var26] = Buffer.method13043(var2, (byte)17);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var17 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
      }

      if (var13 == 255) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      if (var16 == 1) {
         this.field1853 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field1868 = new byte[var10];
      }

      this.field1852 = new short[var10];
      if (var11 > 0) {
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      var2.offset = var11 * -1095856699;
      var3.offset = var58 * -1095856699;
      var4.offset = var58 * -1095856699;
      var5.offset = var58 * -1095856699;
      var6.offset = var32 * -1095856699;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = Buffer.method13039(var2, -346779531);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method13088(-386225327);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method13088(-1940783975);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method13088(-21021359);
         }

         this.field1855[var51] = var48 + var53;
         this.field1856[var51] = var49 + var54;
         this.field1857[var51] = var50 + var55;
         var48 = (int)this.field1855[var51];
         var49 = (int)this.field1856[var51];
         var50 = (int)this.field1857[var51];
         if (var17 == 1) {
            this.field1870[var51] = Buffer.method13039(var6, -346779531);
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var28 * -1095856699;
      var4.offset = var30 * -1095856699;
      var5.offset = var33 * -1095856699;
      var6.offset = var31 * -1095856699;
      var7.offset = var35 * -1095856699;
      var8.offset = var58 * -1095856699;

      for (int var72 = 0; var72 < var10; var72++) {
         this.field1852[var72] = (short)Buffer.method13047(var2, -853462108);
         if (var12 == 1) {
            this.field1866[var72] = Buffer.method13043(var3, (byte)17);
         }

         if (var13 == 255) {
            this.field1867[var72] = Buffer.method13043(var4, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var72] = Buffer.method13043(var5, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var72] = Buffer.method13039(var6, -346779531);
         }

         if (var16 == 1) {
            this.field1853[var72] = (short)(Buffer.method13047(var7, 340792080) - 1);
         }

         if (this.field1868 != null && this.field1853[var72] != -1) {
            this.field1868[var72] = (byte)(Buffer.method13039(var8, -346779531) - 1);
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var58 * -1095856699;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = Buffer.method13039(var3, -346779531);
         if (var56 == 1) {
            var73 = var2.method13088(-1728352149) + var76;
            var74 = var2.method13088(-623581729) + var73;
            var75 = var2.method13088(-1049427202) + var74;
            var76 = var75;
            this.field1880[var77] = var73;
            this.field1864[var77] = var74;
            this.field1865[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.method13088(-1942578595) + var76;
            var76 = var75;
            this.field1880[var77] = var73;
            this.field1864[var77] = var74;
            this.field1865[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.method13088(-1311174308) + var76;
            var76 = var75;
            this.field1880[var77] = var73;
            this.field1864[var77] = var74;
            this.field1865[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.method13088(-543361082) + var76;
            var76 = var75;
            this.field1880[var77] = var73;
            this.field1864[var77] = var57;
            this.field1865[var77] = var75;
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var58 * -1095856699;
      var4.offset = var58 * -1095856699;
      var5.offset = var58 * -1095856699;
      var6.offset = var58 * -1095856699;
      var7.offset = var58 * -1095856699;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = this.field1861[var78] & 255;
         if (var80 == 0) {
            this.field1869[var78] = (short)Buffer.method13047(var2, 150452590);
            this.field1858[var78] = (short)Buffer.method13047(var2, 998773603);
            this.field1862[var78] = (short)Buffer.method13047(var2, 1242794812);
         }
      }

      var2.offset = var58 * -1095856699;
      int var79 = Buffer.method13039(var2, -346779531);
      if (var79 != 0) {
         new classFY();
         Buffer.method13047(var2, 1662002950);
         Buffer.method13047(var2, 1197587470);
         Buffer.method13047(var2, -871509973);
         var2.method13056((byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bh")
   void method3979(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * 958010523;
      int var9 = Buffer.method13047(var4, 658472533);
      int var10 = Buffer.method13047(var4, -1811695499);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13047(var4, -1572120862);
      int var18 = Buffer.method13047(var4, -1171902964);
      int var19 = Buffer.method13047(var4, 1124454136);
      int var20 = Buffer.method13047(var4, 1427155933);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == -748518367) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.field1848 = var9;
      this.field1849 = var10;
      this.field1854 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1880 = new int[var10];
      this.field1864 = new int[var10];
      this.field1865 = new int[var10];
      if (var11 > 0) {
         this.field1861 = new byte[var11];
         this.field1869 = new short[var11];
         this.field1858 = new short[var11];
         this.field1862 = new short[var11];
      }

      if (var16 == 1) {
         this.field1870 = new int[var9];
      }

      if (var12 == 1) {
         this.field1866 = new byte[var10];
         this.field1868 = new byte[var10];
         this.field1853 = new short[var10];
      }

      if (var13 == 255) {
         this.field1867 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1859 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1871 = new int[var10];
      }

      this.field1852 = new short[var10];
      var4.offset = var21 * -500860398;
      var5.offset = var21 * -1095856699;
      var6.offset = var21 * -597221962;
      var7.offset = var21 * -10157058;
      var8.offset = var27 * -1310792932;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = Buffer.method13039(var4, -346779531);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method13088(-2039579531);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method13088(-966355095);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method13088(-1015758645);
         }

         this.field1855[var38] = var35 + var40;
         this.field1856[var38] = var36 + var41;
         this.field1857[var38] = var37 + var42;
         var35 = (int)this.field1855[var38];
         var36 = (int)this.field1856[var38];
         var37 = (int)this.field1857[var38];
         if (var16 == 1) {
            this.field1870[var38] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var21 * -1095856699;
      var5.offset = var26 * -1095856699;
      var6.offset = var24 * -1095856699;
      var7.offset = var28 * -1095856699;
      var8.offset = var25 * 486336687;

      for (int var53 = 0; var53 < var10; var53++) {
         this.field1852[var53] = (short)Buffer.method13047(var4, -358413927);
         if (var12 == 1) {
            int var55 = Buffer.method13039(var5, -346779531);
            if ((var55 & 1) == 1) {
               this.field1866[var53] = 1;
               var2 = true;
            } else {
               this.field1866[var53] = 0;
            }

            if ((var55 & 2) == 2) {
               this.field1868[var53] = (byte)(var55 >> 2);
               this.field1853[var53] = this.field1852[var53];
               this.field1852[var53] = 127;
               if (this.field1853[var53] != -1) {
                  var3 = true;
               }
            } else {
               this.field1868[var53] = -1;
               this.field1853[var53] = -1;
            }
         }

         if (var13 == 255) {
            this.field1867[var53] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            this.field1859[var53] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            this.field1871[var53] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var21 * 191032453;
      var5.offset = var21 * -977377560;
      int var54 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;

      for (int var59 = 0; var59 < var10; var59++) {
         int var43 = Buffer.method13039(var5, -346779531);
         if (var43 == 1) {
            var54 = var4.method13088(-2010730729) + var58;
            var56 = var4.method13088(-824868791) + var54;
            var57 = var4.method13088(-1171847246) + var56;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 2) {
            var56 = var57;
            var57 = var4.method13088(-1399220863) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 3) {
            var54 = var57;
            var57 = var4.method13088(-1773693113) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var56;
            this.field1865[var59] = var57;
         }

         if (var43 == 4) {
            int var44 = var54;
            var54 = var56;
            var56 = var44;
            var57 = var4.method13088(-1061470964) + var58;
            var58 = var57;
            this.field1880[var59] = var54;
            this.field1864[var59] = var44;
            this.field1865[var59] = var57;
         }
      }

      var4.offset = var21 * -1021084074;

      for (int var60 = 0; var60 < var11; var60++) {
         this.field1861[var60] = 0;
         this.field1869[var60] = (short)Buffer.method13047(var4, 1137077164);
         this.field1858[var60] = (short)Buffer.method13047(var4, 1636225419);
         this.field1862[var60] = (short)Buffer.method13047(var4, 1880898436);
      }

      if (this.field1868 != null) {
         boolean var61 = false;

         for (int var62 = 0; var62 < var10; var62++) {
            int var63 = this.field1868[var62] & 255;
            if (var63 != 255) {
               if ((this.field1869[var63] & '\uffff') == this.field1880[var62]
                  && (this.field1858[var63] & 1854159271) == this.field1864[var62]
                  && (this.field1862[var63] & '\uffff') == this.field1865[var62]) {
                  this.field1868[var62] = -1;
               } else {
                  var61 = true;
               }
            }
         }

         if (!var61) {
            this.field1868 = null;
         }
      }

      if (!var3) {
         this.field1853 = null;
      }

      if (!var2) {
         this.field1866 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)Ler;")
   @ObfuscatedName("va")
   public ModelData method4058(short var1, short var2) {
      this.method4001(var1, var2);
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ler;I)I")
   @ObfuscatedName("cu")
   final int method3983(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field1855[var2];
      int var5 = (int)var1.field1856[var2];
      int var6 = (int)var1.field1857[var2];

      for (int var7 = 0; var7 < this.field1848; var7++) {
         if (var4 == (int)this.field1855[var7] && var5 == (int)this.field1856[var7] && var6 == (int)this.field1857[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field1855[this.field1848] = var4;
         this.field1856[this.field1848] = var5;
         this.field1857[this.field1848] = var6;
         if (var1.field1870 != null) {
            this.field1870[this.field1848] = var1.field1870[var2];
         }

         if (var1.field1876 != null) {
            this.field1876[this.field1848] = var1.field1876[var2];
            this.field1877[this.field1848] = var1.field1877[var2];
         }

         var3 = this.field1848++;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ler;")
   @ObfuscatedName("cq")
   public ModelData method3988(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4022();
      int var7 = var2 + this.field1886;
      int var8 = var2 + this.field1892;
      int var9 = var4 + this.field1893;
      int var10 = var4 + this.field1891;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11;
            if (var5) {
               var11 = new ModelData(this, true, true, true, true);
               var11.field1856 = new float[var11.field1848];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.field1848; var12++) {
                  int var13 = (int)this.field1855[var12] + var2;
                  int var14 = (int)this.field1857[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1856[var12] = (int)this.field1856[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.field1848; var27++) {
                  int var28 = (-((int)this.field1856[var27]) << 16) / (this.field1743 * -1256242689);
                  if (var28 < var6) {
                     int var29 = (int)this.field1855[var27] + var2;
                     int var30 = (int)this.field1857[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field1856[var27] = (int)this.field1856[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field1856[var27] = this.field1856[var27];
                  }
               }
            }

            var11.method4018();
            return var11;
         }
      } else {
         return this;
      }
   }

   public int[] getFaceIndices2() {
      return this.field1864;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ler;")
   @ObfuscatedName("cl")
   public ModelData method3989(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4022();
      int var7 = var2 + this.field1886;
      int var8 = var2 + this.field1892;
      int var9 = var4 + this.field1893;
      int var10 = var4 + this.field1891;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11;
            if (var5) {
               var11 = new ModelData(this, true, true, true, true);
               var11.field1856 = new float[var11.field1848];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.field1848; var12++) {
                  int var13 = (int)this.field1855[var12] + var2;
                  int var14 = (int)this.field1857[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1856[var12] = (int)this.field1856[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.field1848; var27++) {
                  int var28 = (-((int)this.field1856[var27]) << 16) / (this.field1743 * -1256242689);
                  if (var28 < var6) {
                     int var29 = (int)this.field1855[var27] + var2;
                     int var30 = (int)this.field1857[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field1856[var27] = (int)this.field1856[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field1856[var27] = this.field1856[var27];
                  }
               }
            }

            var11.method4018();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   public void method4008() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         this.field1857[var1] = -((int)this.field1857[var1]);
      }

      for (int var3 = 0; var3 < this.field1849; var3++) {
         int var2 = this.field1880[var3];
         this.field1880[var3] = this.field1865[var3];
         this.field1865[var3] = var2;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method3993() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         int var2 = (int)this.field1855[var1];
         this.field1855[var1] = this.field1857[var1];
         this.field1857[var1] = -var2;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lfx;")
   @ObfuscatedName("dw")
   public final Model method4025(int var1, int var2, int var3, int var4, int var5) {
      method4015(this);
      int var6 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.field2434 = new int[this.field1849];
      var8.field2428 = new int[this.field1849];
      var8.field2435 = new int[this.field1849];
      if (this.field1854 > 0 && this.field1868 != null) {
         int[] var9 = new int[this.field1854];

         for (int var10 = 0; var10 < this.field1849; var10++) {
            if (this.field1868[var10] != -1) {
               var9[this.field1868[var10] & 255]++;
            }
         }

         var8.field2418 = 0;

         for (int var17 = 0; var17 < this.field1854; var17++) {
            if (var9[var17] > 0 && this.field1861[var17] == 0) {
               var8.field2418++;
            }
         }

         var8.field2439 = new int[var8.field2418];
         var8.field2440 = new int[var8.field2418];
         var8.field2441 = new int[var8.field2418];
         int var18 = 0;

         for (int var11 = 0; var11 < this.field1854; var11++) {
            if (var9[var11] > 0 && this.field1861[var11] == 0) {
               var8.field2439[var18] = this.field1869[var11] & '\uffff';
               var8.field2440[var18] = this.field1858[var11] & '\uffff';
               var8.field2441[var18] = this.field1862[var11] & '\uffff';
               var9[var11] = var18++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2436 = new byte[this.field1849];

         for (int var20 = 0; var20 < this.field1849; var20++) {
            if (this.field1868[var20] != -1) {
               var8.field2436[var20] = (byte)var9[this.field1868[var20] & 255];
            } else {
               var8.field2436[var20] = -1;
            }
         }
      }

      for (int var16 = 0; var16 < this.field1849; var16++) {
         byte var19;
         if (this.field1866 == null) {
            var19 = 0;
         } else {
            var19 = this.field1866[var16];
         }

         byte var21;
         if (this.field1859 == null) {
            var21 = 0;
         } else {
            var21 = this.field1859[var16];
         }

         short var12;
         if (this.field1853 == null) {
            var12 = -1;
         } else {
            var12 = this.field1853[var16];
         }

         if (var21 == -2) {
            var19 = 3;
         }

         if (var21 == -1) {
            var19 = 2;
         }

         if (var12 == -1) {
            if (var19 == 0) {
               int var15 = this.field1852[var16] & '\uffff';
               classFR var13;
               if (this.field1875 != null && this.field1875[this.field1880[var16]] != null) {
                  var13 = this.field1875[this.field1880[var16]];
               } else {
                  var13 = this.field1873[this.field1880[var16]];
               }

               int var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2434[var16] = method3963(var15, var14);
               if (this.field1875 != null && this.field1875[this.field1864[var16]] != null) {
                  var13 = this.field1875[this.field1864[var16]];
               } else {
                  var13 = this.field1873[this.field1864[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2428[var16] = method3963(var15, var14);
               if (this.field1875 != null && this.field1875[this.field1865[var16]] != null) {
                  var13 = this.field1875[this.field1865[var16]];
               } else {
                  var13 = this.field1873[this.field1865[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2435[var16] = method3963(var15, var14);
            } else if (var19 == 1) {
               classEB var24 = this.field1874[var16];
               int var31 = var1
                  + (var3 * var24.field1724 * 835925423 + var4 * var24.field1720 * 696545605 + var5 * var24.field1719 * -1298928853) / (var7 + var7 / 2);
               var8.field2434[var16] = method3963(this.field1852[var16] & '\uffff', var31);
               var8.field2435[var16] = -1;
            } else if (var19 == 3) {
               var8.field2434[var16] = 128;
               var8.field2435[var16] = -1;
            } else {
               var8.field2435[var16] = -2;
            }
         } else if (var19 == 0) {
            classFR var25;
            if (this.field1875 != null && this.field1875[this.field1880[var16]] != null) {
               var25 = this.field1875[this.field1880[var16]];
            } else {
               var25 = this.field1873[this.field1880[var16]];
            }

            int var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2434[var16] = method3966(var32);
            if (this.field1875 != null && this.field1875[this.field1864[var16]] != null) {
               var25 = this.field1875[this.field1864[var16]];
            } else {
               var25 = this.field1873[this.field1864[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2428[var16] = method3966(var32);
            if (this.field1875 != null && this.field1875[this.field1865[var16]] != null) {
               var25 = this.field1875[this.field1865[var16]];
            } else {
               var25 = this.field1873[this.field1865[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2435[var16] = method3966(var32);
         } else if (var19 == 1) {
            classEB var28 = this.field1874[var16];
            int var35 = var1
               + (var3 * var28.field1724 * 835925423 + var4 * var28.field1720 * 696545605 + var5 * var28.field1719 * -1298928853) / (var7 + var7 / 2);
            var8.field2434[var16] = method3966(var35);
            var8.field2435[var16] = -1;
         } else {
            var8.field2435[var16] = -2;
         }
      }

      method3992(this);
      var8.field2424 = this.field1848;
      var8.field2427 = this.field1855;
      var8.field2430 = this.field1856;
      var8.field2426 = this.field1857;
      var8.field2419 = this.field1849;
      var8.field2429 = this.field1880;
      var8.field2432 = this.field1864;
      var8.field2433 = this.field1865;
      var8.field2431 = this.field1867;
      var8.field2444 = this.field1859;
      var8.field2420 = this.field1851;
      var8.field2442 = this.field1863;
      var8.field2443 = this.field1860;
      var8.field2437 = this.field1853;
      var8.field2508 = this.field1876;
      var8.field2507 = this.field1877;
      var8.field2438 = this.field1872;
      return var8;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("kv")
   public ModelData method4041() {
      this.field1853 = (short[])this.field1853.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xd")
   public void method4038() {
      classFR[] var1 = this.method4066();
      classFR[] var2 = this.method4053();
      if (var1 != null && this.field1897 == null) {
         int var3 = this.getVerticesCount();
         this.field1897 = new int[var3];
         this.field1898 = new int[var3];
         this.field1899 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            classFR var5;
            if (var2 != null && (var5 = var2[var4]) != null) {
               this.field1897[var4] = var5.method4969();
               this.field1898[var4] = var5.method4971();
               this.field1899[var4] = var5.method4970();
            } else if ((var5 = var1[var4]) != null) {
               this.field1897[var4] = var5.method4969();
               this.field1898[var4] = var5.method4971();
               this.field1899[var4] = var5.method4970();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)Ler;")
   @ObfuscatedName("kz")
   public ModelData method4059(short var1, short var2) {
      this.method4004(var1, var2);
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bf")
   static final int method3965(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   public void method3995() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         int var2 = (int)this.field1857[var1];
         this.field1857[var1] = this.field1855[var1];
         this.field1855[var1] = -var2;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   public void method3996() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         int var2 = (int)this.field1857[var1];
         this.field1857[var1] = this.field1855[var1];
         this.field1855[var1] = -var2;
      }

      this.method4018();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;[B)V")
   @ObfuscatedName("hp")
   public static void method3976(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method4044();
      } else {
         Buffer var2 = new Buffer(var1);
         Buffer var3 = new Buffer(var1);
         Buffer var4 = new Buffer(var1);
         Buffer var5 = new Buffer(var1);
         Buffer var6 = new Buffer(var1);
         Buffer var7 = new Buffer(var1);
         Buffer var8 = new Buffer(var1);
         var2.offset = (var1.length - 23) * -1095856699;
         int var9 = Buffer.method13047(var2, -1694051442);
         int var10 = Buffer.method13047(var2, 1847073970);
         int var11 = Buffer.method13039(var2, -346779531);
         int var12 = Buffer.method13039(var2, -346779531);
         int var13 = Buffer.method13039(var2, -346779531);
         int var14 = Buffer.method13039(var2, -346779531);
         int var15 = Buffer.method13039(var2, -346779531);
         int var16 = Buffer.method13039(var2, -346779531);
         int var17 = Buffer.method13039(var2, -346779531);
         int var18 = Buffer.method13047(var2, 1864519031);
         int var19 = Buffer.method13047(var2, -692031952);
         int var20 = Buffer.method13047(var2, -1245741013);
         int var21 = Buffer.method13047(var2, 1841048898);
         int var22 = Buffer.method13047(var2, -557880775);
         int var23 = 0;
         int var24 = 0;
         int var25 = 0;
         if (var11 > 0) {
            var0.field1861 = new byte[var11];
            var2.offset = 0;

            for (int var26 = 0; var26 < var11; var26++) {
               byte var27 = var0.field1861[var26] = Buffer.method13043(var2, (byte)17);
               if (var27 == 0) {
                  var23++;
               }

               if (var27 >= 1 && var27 <= 3) {
                  var24++;
               }

               if (var27 == 2) {
                  var25++;
               }
            }
         }

         int var58 = var11 + var9;
         int var28 = var58;
         if (var12 == 1) {
            var58 += var10;
         }

         var58 += var10;
         int var30 = var58;
         if (var13 == 255) {
            var58 += var10;
         }

         int var31 = var58;
         if (var15 == 1) {
            var58 += var10;
         }

         int var32 = var58;
         if (var17 == 1) {
            var58 += var9;
         }

         int var33 = var58;
         if (var14 == 1) {
            var58 += var10;
         }

         var58 += var21;
         int var35 = var58;
         if (var16 == 1) {
            var58 += var10 * 2;
         }

         var58 += var22;
         var58 += var10 * 2;
         var58 += var18;
         var58 += var19;
         var58 += var20;
         var58 += var23 * 6;
         var58 += var24 * 6;
         var58 += var24 * 6;
         var58 += var24 * 2;
         var58 += var24;
         var58 += var24 * 2 + var25 * 2;
         var0.field1848 = var9;
         var0.field1849 = var10;
         var0.field1854 = var11;
         var0.field1855 = new float[var9];
         var0.field1856 = new float[var9];
         var0.field1857 = new float[var9];
         var0.field1880 = new int[var10];
         var0.field1864 = new int[var10];
         var0.field1865 = new int[var10];
         if (var17 == 1) {
            var0.field1870 = new int[var9];
         }

         if (var12 == 1) {
            var0.field1866 = new byte[var10];
         }

         if (var13 == 255) {
            var0.field1867 = new byte[var10];
         } else {
            var0.field1851 = (byte)var13;
         }

         if (var14 == 1) {
            var0.field1859 = new byte[var10];
         }

         if (var15 == 1) {
            var0.field1871 = new int[var10];
         }

         if (var16 == 1) {
            var0.field1853 = new short[var10];
         }

         if (var16 == 1 && var11 > 0) {
            var0.field1868 = new byte[var10];
         }

         var0.field1852 = new short[var10];
         if (var11 > 0) {
            var0.field1869 = new short[var11];
            var0.field1858 = new short[var11];
            var0.field1862 = new short[var11];
         }

         var2.offset = var11 * -1095856699;
         var3.offset = var58 * -906054146;
         var4.offset = var58 * -1095856699;
         var5.offset = var58 * -635083043;
         var6.offset = var32 * 1721223680;
         int var48 = 0;
         int var49 = 0;
         int var50 = 0;

         for (int var51 = 0; var51 < var9; var51++) {
            int var52 = Buffer.method13039(var2, -346779531);
            int var53 = 0;
            if ((var52 & 1) != 0) {
               var53 = var3.method13088(-1426016312);
            }

            int var54 = 0;
            if ((var52 & 2) != 0) {
               var54 = var4.method13088(-714464965);
            }

            int var55 = 0;
            if ((var52 & 4) != 0) {
               var55 = var5.method13088(-1905340202);
            }

            var0.field1855[var51] = var48 + var53;
            var0.field1856[var51] = var49 + var54;
            var0.field1857[var51] = var50 + var55;
            var48 = (int)var0.field1855[var51];
            var49 = (int)var0.field1856[var51];
            var50 = (int)var0.field1857[var51];
            if (var17 == 1) {
               var0.field1870[var51] = Buffer.method13039(var6, -346779531);
            }
         }

         var2.offset = var58 * 861024982;
         var3.offset = var28 * -1095856699;
         var4.offset = var30 * -1095856699;
         var5.offset = var33 * -1519019422;
         var6.offset = var31 * 757681244;
         var7.offset = var35 * -1095856699;
         var8.offset = var58 * -1095856699;

         for (int var72 = 0; var72 < var10; var72++) {
            var0.field1852[var72] = (short)Buffer.method13047(var2, -1728745338);
            if (var12 == 1) {
               var0.field1866[var72] = Buffer.method13043(var3, (byte)17);
            }

            if (var13 == 255) {
               var0.field1867[var72] = Buffer.method13043(var4, (byte)17);
            }

            if (var14 == 1) {
               var0.field1859[var72] = Buffer.method13043(var5, (byte)17);
            }

            if (var15 == 1) {
               var0.field1871[var72] = Buffer.method13039(var6, -346779531);
            }

            if (var16 == 1) {
               var0.field1853[var72] = (short)(Buffer.method13047(var7, 830531658) - 1);
            }

            if (var0.field1868 != null && var0.field1853[var72] != -1) {
               var0.field1868[var72] = (byte)(Buffer.method13039(var8, -346779531) - 1);
            }
         }

         var2.offset = var58 * 1804872358;
         var3.offset = var58 * 1482476697;
         int var73 = 0;
         int var74 = 0;
         int var75 = 0;
         int var76 = 0;

         for (int var77 = 0; var77 < var10; var77++) {
            int var56 = Buffer.method13039(var3, -346779531);
            if (var56 == 1) {
               var73 = var2.method13088(-1006819365) + var76;
               var74 = var2.method13088(-140429165) + var73;
               var75 = var2.method13088(-1372837959) + var74;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 2) {
               var74 = var75;
               var75 = var2.method13088(-2040843127) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 3) {
               var73 = var75;
               var75 = var2.method13088(-1237913722) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var74;
               var0.field1865[var77] = var75;
            }

            if (var56 == 4) {
               int var57 = var73;
               var73 = var74;
               var74 = var57;
               var75 = var2.method13088(-101814371) + var76;
               var76 = var75;
               var0.field1880[var77] = var73;
               var0.field1864[var77] = var57;
               var0.field1865[var77] = var75;
            }
         }

         var2.offset = var58 * -899102934;
         var3.offset = var58 * 853599111;
         var4.offset = var58 * -1095856699;
         var5.offset = var58 * -1095856699;
         var6.offset = var58 * -1095856699;
         var7.offset = var58 * -1095856699;

         for (int var78 = 0; var78 < var11; var78++) {
            int var80 = var0.field1861[var78] & -1109660457;
            if (var80 == 0) {
               var0.field1869[var78] = (short)Buffer.method13047(var2, 809599261);
               var0.field1858[var78] = (short)Buffer.method13047(var2, 82187406);
               var0.field1862[var78] = (short)Buffer.method13047(var2, 1848454891);
            }
         }

         var2.offset = var58 * -1095856699;
         int var79 = Buffer.method13039(var2, -346779531);
         if (var79 != 0) {
            new classFY();
            Buffer.method13047(var2, 1840269910);
            Buffer.method13047(var2, -1755460646);
            Buffer.method13047(var2, -1795377232);
            var2.method13056((byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ch")
   public void method3999(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field1848; var4++) {
         this.field1855[var4] = (int)this.field1855[var4] + var1;
         this.field1856[var4] = (int)this.field1856[var4] + var2;
         this.field1857[var4] = (int)this.field1857[var4] + var3;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("cz")
   public void method4002(short var1, short var2) {
      for (int var3 = 0; var3 < this.field1849; var3++) {
         if (this.field1852[var3] == var1) {
            this.field1852[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("yi")
   public short[] method4060() {
      return this.field1862;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("ii")
   public static void method4009(ModelData var0) {
      if (var0 == null) {
         var0.getVerticesX();
      }

      for (int var1 = 0; var1 < var0.field1848; var1++) {
         var0.field1857[var1] = -((int)var0.field1857[var1]);
      }

      for (int var3 = 0; var3 < var0.field1849; var3++) {
         int var2 = var0.field1880[var3];
         var0.field1880[var3] = var0.field1865[var3];
         var0.field1865[var3] = var2;
      }

      var0.method4018();
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("cw")
   public void method4003(short var1, short var2) {
      for (int var3 = 0; var3 < this.field1849; var3++) {
         if (this.field1852[var3] == var1) {
            this.field1852[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("cj")
   public void method4005(short var1, short var2) {
      if (this.field1853 != null) {
         for (int var3 = 0; var3 < this.field1849; var3++) {
            if (this.field1853[var3] == var1) {
               this.field1853[var3] = var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ca")
   public void method3994() {
      for (int var1 = 0; var1 < this.field1848; var1++) {
         this.field1855[var1] = -((int)this.field1855[var1]);
         this.field1857[var1] = -((int)this.field1857[var1]);
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method4022() {
      if (!this.field1850) {
         this.field1743 = 0;
         this.field1889 = 0;
         this.field1886 = 999999;
         this.field1892 = -999999;
         this.field1891 = -99999;
         this.field1893 = 99999;

         for (int var1 = 0; var1 < this.field1848; var1++) {
            int var2 = (int)this.field1855[var1];
            int var3 = (int)this.field1856[var1];
            int var4 = (int)this.field1857[var1];
            if (var2 < this.field1886) {
               this.field1886 = var2;
            }

            if (var2 > this.field1892) {
               this.field1892 = var2;
            }

            if (var4 < this.field1893) {
               this.field1893 = var4;
            }

            if (var4 > this.field1891) {
               this.field1891 = var4;
            }

            if (-var3 > this.field1743 * -1256242689) {
               this.field1743 = -var3 * 903659007;
            }

            if (var3 > this.field1889) {
               this.field1889 = var3;
            }
         }

         this.field1850 = true;
      }
   }

   public int[] getFaceIndices1() {
      return this.field1880;
   }

   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("sz")
   public static void method4042(ModelData var0) {
      if (var0 == null) {
         var0.method4043();
      }

      for (int var1 = 0; var1 < var0.field1848; var1++) {
         var0.field1855[var1] = -var0.field1855[var1];
         var0.field1857[var1] = -var0.field1857[var1];
      }

      var0.method4051();
   }

   public ModelData(ModelData[] var1, int var2) {
      this.field1849 = 0;
      this.field1851 = 0;
      this.field1850 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      this.field1848 = 0;
      this.field1849 = 0;
      this.field1854 = 0;
      this.field1851 = -1;

      for (int var11 = 0; var11 < var2; var11++) {
         ModelData var12 = var1[var11];
         if (var12 != null) {
            this.field1848 = this.field1848 + var12.field1848;
            this.field1849 = this.field1849 + var12.field1849;
            this.field1854 = this.field1854 + var12.field1854;
            if (var12.field1867 != null) {
               var4 = true;
            } else {
               if (this.field1851 == -1) {
                  this.field1851 = var12.field1851;
               }

               if (this.field1851 != var12.field1851) {
                  var4 = true;
               }
            }

            var3 |= var12.field1866 != null;
            var5 |= var12.field1859 != null;
            var6 |= var12.field1871 != null;
            var7 |= var12.field1853 != null;
            var8 |= var12.field1868 != null;
            var9 |= var12.field1876 != null;
            var10 |= var12.field1872 != null;
         }
      }

      this.field1855 = new float[this.field1848];
      this.field1856 = new float[this.field1848];
      this.field1857 = new float[this.field1848];
      this.field1870 = new int[this.field1848];
      this.field1880 = new int[this.field1849];
      this.field1864 = new int[this.field1849];
      this.field1865 = new int[this.field1849];
      if (var3) {
         this.field1866 = new byte[this.field1849];
      }

      if (var4) {
         this.field1867 = new byte[this.field1849];
      }

      if (var5) {
         this.field1859 = new byte[this.field1849];
      }

      if (var6) {
         this.field1871 = new int[this.field1849];
      }

      if (var7) {
         this.field1853 = new short[this.field1849];
      }

      if (var8) {
         this.field1868 = new byte[this.field1849];
      }

      if (var9) {
         this.field1876 = new int[this.field1848][];
         this.field1877 = new int[this.field1848][];
      }

      if (var10) {
         this.field1872 = new byte[this.field1849];
      }

      this.field1852 = new short[this.field1849];
      if (this.field1854 > 0) {
         this.field1861 = new byte[this.field1854];
         this.field1869 = new short[this.field1854];
         this.field1858 = new short[this.field1854];
         this.field1862 = new short[this.field1854];
      }

      this.field1848 = 0;
      this.field1849 = 0;
      this.field1854 = 0;

      for (int var15 = 0; var15 < var2; var15++) {
         ModelData var16 = var1[var15];
         if (var16 != null) {
            for (int var13 = 0; var13 < var16.field1849; var13++) {
               if (var3 && var16.field1866 != null) {
                  this.field1866[this.field1849] = var16.field1866[var13];
               }

               if (var4) {
                  if (var16.field1867 != null) {
                     this.field1867[this.field1849] = var16.field1867[var13];
                  } else {
                     this.field1867[this.field1849] = var16.field1851;
                  }
               }

               if (var5 && var16.field1859 != null) {
                  this.field1859[this.field1849] = var16.field1859[var13];
               }

               if (var6 && var16.field1871 != null) {
                  this.field1871[this.field1849] = var16.field1871[var13];
               }

               if (var7) {
                  if (var16.field1853 != null) {
                     this.field1853[this.field1849] = var16.field1853[var13];
                  } else {
                     this.field1853[this.field1849] = -1;
                  }
               }

               if (var8) {
                  if (var16.field1868 != null && var16.field1868[var13] != -1) {
                     this.field1868[this.field1849] = (byte)(var16.field1868[var13] + this.field1854);
                  } else {
                     this.field1868[this.field1849] = -1;
                  }
               }

               if (var10 && var16.field1872 != null) {
                  this.field1872[this.field1849] = var16.field1872[var13];
               }

               this.field1852[this.field1849] = var16.field1852[var13];
               this.field1880[this.field1849] = this.method3981(var16, var16.field1880[var13]);
               this.field1864[this.field1849] = this.method3981(var16, var16.field1864[var13]);
               this.field1865[this.field1849] = this.method3981(var16, var16.field1865[var13]);
               this.field1849++;
            }

            for (int var17 = 0; var17 < var16.field1854; var17++) {
               byte var14 = this.field1861[this.field1854] = var16.field1861[var17];
               if (var14 == 0) {
                  this.field1869[this.field1854] = (short)this.method3981(var16, var16.field1869[var17]);
                  this.field1858[this.field1854] = (short)this.method3981(var16, var16.field1858[var17]);
                  this.field1862[this.field1854] = (short)this.method3981(var16, var16.field1862[var17]);
               }

               this.field1854++;
            }
         }
      }
   }

   public float[] getVerticesX() {
      return this.field1855;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dm")
   public void method4013(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field1848; var4++) {
         this.field1855[var4] = (int)this.field1855[var4] * var1 / 128;
         this.field1856[var4] = (int)this.field1856[var4] * var2 / -537893264;
         this.field1857[var4] = (int)this.field1857[var4] * var3 / 128;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lfx;")
   @ObfuscatedName("mv")
   public Model method4061(int var1, int var2, int var3, int var4, int var5) {
      return this.method4045(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   void method4019() {
      this.field1873 = null;
      this.field1875 = null;
      this.field1874 = null;
      this.field1850 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("di")
   void method4020() {
      this.field1873 = null;
      this.field1875 = null;
      this.field1874 = null;
      this.field1850 = false;
   }

   public byte[] getFaceTransparencies() {
      return this.field1859;
   }

   @ObfuscatedSignature(descriptor = "(III)Ler;")
   @ObfuscatedName("hb")
   public ModelData method4062(int var1, int var2, int var3) {
      method4040(this, var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("du")
   void method4023() {
      if (!this.field1850) {
         this.field1743 = 0;
         this.field1889 = 0;
         this.field1886 = 999999;
         this.field1892 = -999999;
         this.field1891 = -99999;
         this.field1893 = 99999;

         for (int var1 = 0; var1 < this.field1848; var1++) {
            int var2 = (int)this.field1855[var1];
            int var3 = (int)this.field1856[var1];
            int var4 = (int)this.field1857[var1];
            if (var2 < this.field1886) {
               this.field1886 = var2;
            }

            if (var2 > this.field1892) {
               this.field1892 = var2;
            }

            if (var4 < this.field1893) {
               this.field1893 = var4;
            }

            if (var4 > this.field1891) {
               this.field1891 = var4;
            }

            if (-var3 > this.field1743 * -1256242689) {
               this.field1743 = -var3 * 903659007;
            }

            if (var3 > this.field1889) {
               this.field1889 = var3;
            }
         }

         this.field1850 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dr")
   void method4024() {
      if (!this.field1850) {
         this.field1743 = 0;
         this.field1889 = 0;
         this.field1886 = 999999;
         this.field1892 = -999999;
         this.field1891 = -99999;
         this.field1893 = 99999;

         for (int var1 = 0; var1 < this.field1848; var1++) {
            int var2 = (int)this.field1855[var1];
            int var3 = (int)this.field1856[var1];
            int var4 = (int)this.field1857[var1];
            if (var2 < this.field1886) {
               this.field1886 = var2;
            }

            if (var2 > this.field1892) {
               this.field1892 = var2;
            }

            if (var4 < this.field1893) {
               this.field1893 = var4;
            }

            if (var4 > this.field1891) {
               this.field1891 = var4;
            }

            if (-var3 > this.field1743 * -1256242689) {
               this.field1743 = -var3 * 903659007;
            }

            if (var3 > this.field1889) {
               this.field1889 = var3;
            }
         }

         this.field1850 = true;
      }
   }

   public int[] getFaceIndices3() {
      return this.field1865;
   }

   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("iy")
   public static void method4040(ModelData var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4036(var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.field1848; var4++) {
         var0.field1855[var4] = var0.field1855[var4] + var1;
         var0.field1856[var4] = var0.field1856[var4] + var2;
         var0.field1857[var4] = var0.field1857[var4] + var3;
      }

      var0.method4051();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lfx;")
   @ObfuscatedName("db")
   public final Model method4026(int var1, int var2, int var3, int var4, int var5) {
      method4015(this);
      int var6 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.field2434 = new int[this.field1849];
      var8.field2428 = new int[this.field1849];
      var8.field2435 = new int[this.field1849];
      if (this.field1854 > 0 && this.field1868 != null) {
         int[] var9 = new int[this.field1854];

         for (int var10 = 0; var10 < this.field1849; var10++) {
            if (this.field1868[var10] != -1) {
               var9[this.field1868[var10] & 255]++;
            }
         }

         var8.field2418 = 0;

         for (int var17 = 0; var17 < this.field1854; var17++) {
            if (var9[var17] > 0 && this.field1861[var17] == 0) {
               var8.field2418++;
            }
         }

         var8.field2439 = new int[var8.field2418];
         var8.field2440 = new int[var8.field2418];
         var8.field2441 = new int[var8.field2418];
         int var18 = 0;

         for (int var11 = 0; var11 < this.field1854; var11++) {
            if (var9[var11] > 0 && this.field1861[var11] == 0) {
               var8.field2439[var18] = this.field1869[var11] & '\uffff';
               var8.field2440[var18] = this.field1858[var11] & '\uffff';
               var8.field2441[var18] = this.field1862[var11] & '\uffff';
               var9[var11] = var18++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2436 = new byte[this.field1849];

         for (int var20 = 0; var20 < this.field1849; var20++) {
            if (this.field1868[var20] != -1) {
               var8.field2436[var20] = (byte)var9[this.field1868[var20] & 255];
            } else {
               var8.field2436[var20] = -1;
            }
         }
      }

      for (int var16 = 0; var16 < this.field1849; var16++) {
         byte var19;
         if (this.field1866 == null) {
            var19 = 0;
         } else {
            var19 = this.field1866[var16];
         }

         byte var21;
         if (this.field1859 == null) {
            var21 = 0;
         } else {
            var21 = this.field1859[var16];
         }

         short var12;
         if (this.field1853 == null) {
            var12 = -1;
         } else {
            var12 = this.field1853[var16];
         }

         if (var21 == -2) {
            var19 = 3;
         }

         if (var21 == -1) {
            var19 = 2;
         }

         if (var12 == -1) {
            if (var19 == 0) {
               int var15 = this.field1852[var16] & '\uffff';
               classFR var13;
               if (this.field1875 != null && this.field1875[this.field1880[var16]] != null) {
                  var13 = this.field1875[this.field1880[var16]];
               } else {
                  var13 = this.field1873[this.field1880[var16]];
               }

               int var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2434[var16] = method3963(var15, var14);
               if (this.field1875 != null && this.field1875[this.field1864[var16]] != null) {
                  var13 = this.field1875[this.field1864[var16]];
               } else {
                  var13 = this.field1873[this.field1864[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2428[var16] = method3963(var15, var14);
               if (this.field1875 != null && this.field1875[this.field1865[var16]] != null) {
                  var13 = this.field1875[this.field1865[var16]];
               } else {
                  var13 = this.field1873[this.field1865[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2435[var16] = method3963(var15, var14);
            } else if (var19 == 1) {
               classEB var24 = this.field1874[var16];
               int var31 = var1
                  + (var3 * var24.field1724 * 835925423 + var4 * var24.field1720 * 696545605 + var5 * var24.field1719 * -1298928853) / (var7 + var7 / 2);
               var8.field2434[var16] = method3963(this.field1852[var16] & '\uffff', var31);
               var8.field2435[var16] = -1;
            } else if (var19 == 3) {
               var8.field2434[var16] = 128;
               var8.field2435[var16] = -1;
            } else {
               var8.field2435[var16] = -2;
            }
         } else if (var19 == 0) {
            classFR var25;
            if (this.field1875 != null && this.field1875[this.field1880[var16]] != null) {
               var25 = this.field1875[this.field1880[var16]];
            } else {
               var25 = this.field1873[this.field1880[var16]];
            }

            int var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2434[var16] = method3966(var32);
            if (this.field1875 != null && this.field1875[this.field1864[var16]] != null) {
               var25 = this.field1875[this.field1864[var16]];
            } else {
               var25 = this.field1873[this.field1864[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2428[var16] = method3966(var32);
            if (this.field1875 != null && this.field1875[this.field1865[var16]] != null) {
               var25 = this.field1875[this.field1865[var16]];
            } else {
               var25 = this.field1873[this.field1865[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2435[var16] = method3966(var32);
         } else if (var19 == 1) {
            classEB var28 = this.field1874[var16];
            int var35 = var1
               + (var3 * var28.field1724 * 835925423 + var4 * var28.field1720 * 696545605 + var5 * var28.field1719 * -1298928853) / (var7 + var7 / 2);
            var8.field2434[var16] = method3966(var35);
            var8.field2435[var16] = -1;
         } else {
            var8.field2435[var16] = -2;
         }
      }

      method3992(this);
      var8.field2424 = this.field1848;
      var8.field2427 = this.field1855;
      var8.field2430 = this.field1856;
      var8.field2426 = this.field1857;
      var8.field2419 = this.field1849;
      var8.field2429 = this.field1880;
      var8.field2432 = this.field1864;
      var8.field2433 = this.field1865;
      var8.field2431 = this.field1867;
      var8.field2444 = this.field1859;
      var8.field2420 = this.field1851;
      var8.field2442 = this.field1863;
      var8.field2443 = this.field1860;
      var8.field2437 = this.field1853;
      var8.field2508 = this.field1876;
      var8.field2507 = this.field1877;
      var8.field2438 = this.field1872;
      return var8;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("dh")
   public final Model method4030() {
      return this.method4045(128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("yp")
   public ModelData method4032() {
      this.field1852 = (short[])this.field1852.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dd")
   public void method4014(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field1848; var4++) {
         this.field1855[var4] = (int)this.field1855[var4] * var1 / 128;
         this.field1856[var4] = (int)this.field1856[var4] * var2 / 128;
         this.field1857[var4] = (int)this.field1857[var4] * var3 / 128;
      }

      this.method4018();
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("dz")
   public final Model method4031() {
      return this.method4045(128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("ik")
   public short[] method4063() {
      return this.field1858;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("lt")
   public static void method4010(ModelData var0) {
      if (var0 == null) {
         var0.method4011();
      } else {
         for (int var1 = 0; var1 < var0.field1848; var1++) {
            var0.field1857[var1] = -((int)var0.field1857[var1]);
         }

         for (int var3 = 0; var3 < var0.field1849; var3++) {
            int var2 = var0.field1880[var3];
            var0.field1880[var3] = var0.field1865[var3];
            var0.field1865[var3] = var2;
         }

         var0.method4018();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Ler;")
   @ObfuscatedName("az")
   public static ModelData method4047(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.loadData(var1, var2);

      try {
         return var3 == null ? null : new ModelData(var3);
      } catch (NullPointerException var5) {
         throw new RuntimeException("loading model " + var1 + ", " + var2, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("no")
   public ModelData method4064() {
      this.method4034();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ler;Ler;IIIZ)V")
   @ObfuscatedName("xs")
   public static void method4065(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      method3961(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()[Lfr;")
   @ObfuscatedName("af")
   public classFR[] method4066() {
      return this.field1873;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public void method4017() {
      if (this.field1873 == null) {
         this.field1873 = new classFR[this.field1891];

         for (int var1 = 0; var1 < this.field1889; var1++) {
            this.field1873[var1] = new classFR();
         }

         for (int var17 = 0; var17 < this.field1892; var17++) {
            int var2 = this.field1870[var17];
            int var3 = this.field1870[var17];
            int var4 = this.field1870[var17];
            int var5 = (int)this.field1856[var3] - (int)this.field1856[var2];
            int var6 = (int)this.field1856[var3] - (int)this.field1857[var2];
            int var7 = (int)this.field1857[var3] - (int)this.field1855[var2];
            int var8 = (int)this.field1857[var4] - (int)this.field1857[var2];
            int var9 = (int)this.field1855[var4] - (int)this.field1857[var2];
            int var10 = (int)this.field1855[var4] - (int)this.field1856[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field1861 == null) {
               var15 = 0;
            } else {
               var15 = this.field1867[var17];
            }

            if (var15 == 0) {
               classFR var16 = this.field1875[var2];
               var16.field2388 = var16.field2387 + var11 * -1837090135;
               var16.field2385 += var12 * -941718535;
               var16.field2387 = var16.field2385 + var13 * 1280581247;
               var16.field2388 = var16.field2386 + -1768043311;
               var16 = this.field1875[var3];
               var16.field2387 = var16.field2385 + var11 * -1837090135;
               var16.field2386 = var16.field2388 + var12 * -941718535;
               var16.field2385 = var16.field2387 + var13 * 1280581247;
               var16.field2387 += -1768043311;
               var16 = this.field1875[var4];
               var16.field2387 = var16.field2386 + var11 * -1837090135;
               var16.field2386 = var16.field2388 + var12 * -941718535;
               var16.field2385 = var16.field2386 + var13 * 1280581247;
               var16.field2387 = var16.field2386 + -1768043311;
            } else if (var15 == 1) {
               if (this.field1874 == null) {
                  this.field1874 = new classEB[this.field1892];
               }

               classEB var23 = this.field1874[var17] = new classEB();
               var23.field1720 = var11 * 824131919;
               var23.field1719 = var12 * -1800111731;
               var23.field1719 = var13 * -1200391293;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;IIIII)Lfx;")
   @ObfuscatedName("an")
   public static Model method4027(ModelData var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method4037();
      }

      method4015(var0);
      int var6 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.field2434 = new int[var0.field1849];
      var8.field2428 = new int[var0.field1849];
      var8.field2435 = new int[var0.field1849];
      if (var0.field1854 > 0 && var0.field1868 != null) {
         int[] var9 = new int[var0.field1854];

         for (int var10 = 0; var10 < var0.field1849; var10++) {
            if (var0.field1868[var10] != -1) {
               var9[var0.field1868[var10] & 255]++;
            }
         }

         var8.field2418 = 0;

         for (int var17 = 0; var17 < var0.field1854; var17++) {
            if (var9[var17] > 0 && var0.field1861[var17] == 0) {
               var8.field2418++;
            }
         }

         var8.field2439 = new int[var8.field2418];
         var8.field2440 = new int[var8.field2418];
         var8.field2441 = new int[var8.field2418];
         int var18 = 0;

         for (int var11 = 0; var11 < var0.field1854; var11++) {
            if (var9[var11] > 0 && var0.field1861[var11] == 0) {
               var8.field2439[var18] = var0.field1869[var11] & 214058443;
               var8.field2440[var18] = var0.field1858[var11] & '\uffff';
               var8.field2441[var18] = var0.field1862[var11] & '\uffff';
               var9[var11] = var18++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2436 = new byte[var0.field1849];

         for (int var20 = 0; var20 < var0.field1849; var20++) {
            if (var0.field1868[var20] != -1) {
               var8.field2436[var20] = (byte)var9[var0.field1868[var20] & 255];
            } else {
               var8.field2436[var20] = -1;
            }
         }
      }

      for (int var16 = 0; var16 < var0.field1849; var16++) {
         byte var19;
         if (var0.field1866 == null) {
            var19 = 0;
         } else {
            var19 = var0.field1866[var16];
         }

         byte var21;
         if (var0.field1859 == null) {
            var21 = 0;
         } else {
            var21 = var0.field1859[var16];
         }

         short var12;
         if (var0.field1853 == null) {
            var12 = -1;
         } else {
            var12 = var0.field1853[var16];
         }

         if (var21 == -1006570421) {
            var19 = 3;
         }

         if (var21 == -1) {
            var19 = 2;
         }

         if (var12 == -1) {
            if (var19 == 0) {
               int var15 = var0.field1852[var16] & 1880840490;
               classFR var13;
               if (var0.field1875 != null && var0.field1875[var0.field1880[var16]] != null) {
                  var13 = var0.field1875[var0.field1880[var16]];
               } else {
                  var13 = var0.field1873[var0.field1880[var16]];
               }

               int var14 = var1
                  + (var3 * var13.field2388 * 695276757 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * 552076378)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2434[var16] = method3963(var15, var14);
               if (var0.field1875 != null && var0.field1875[var0.field1864[var16]] != null) {
                  var13 = var0.field1875[var0.field1864[var16]];
               } else {
                  var13 = var0.field1873[var0.field1864[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -1784797437)
                     / (var7 * var13.field2386 * 1200753713);
               var8.field2428[var16] = method3963(var15, var14);
               if (var0.field1875 != null && var0.field1875[var0.field1865[var16]] != null) {
                  var13 = var0.field1875[var0.field1865[var16]];
               } else {
                  var13 = var0.field1873[var0.field1865[var16]];
               }

               var14 = var1
                  + (var3 * var13.field2388 * -1174074983 + var4 * var13.field2387 * -794112439 + var5 * var13.field2385 * -949378689)
                     / (var7 * var13.field2386 * 275591635);
               var8.field2435[var16] = method3963(var15, var14);
            } else if (var19 == 1) {
               classEB var24 = var0.field1874[var16];
               int var31 = var1
                  + (var3 * var24.field1724 * 1971119174 + var4 * var24.field1720 * 696545605 + var5 * var24.field1719 * -1298928853) / (var7 + var7 / 2);
               var8.field2434[var16] = method3963(var0.field1852[var16] & -1883194206, var31);
               var8.field2435[var16] = -1;
            } else if (var19 == 3) {
               var8.field2434[var16] = 128;
               var8.field2435[var16] = -1;
            } else {
               var8.field2435[var16] = -2;
            }
         } else if (var19 == 0) {
            classFR var25;
            if (var0.field1875 != null && var0.field1875[var0.field1880[var16]] != null) {
               var25 = var0.field1875[var0.field1880[var16]];
            } else {
               var25 = var0.field1873[var0.field1880[var16]];
            }

            int var32 = var1
               + (var3 * var25.field2388 * -1584020387 + var4 * var25.field2387 * -1647610911 + var5 * var25.field2385 * -1528272530)
                  / (var7 * var25.field2386 * 1560409686);
            var8.field2434[var16] = method3966(var32);
            if (var0.field1875 != null && var0.field1875[var0.field1864[var16]] != null) {
               var25 = var0.field1875[var0.field1864[var16]];
            } else {
               var25 = var0.field1873[var0.field1864[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * -1174074983 + var4 * var25.field2387 * -2100251393 + var5 * var25.field2385 * -1462058661)
                  / (var7 * var25.field2386 * -347437819);
            var8.field2428[var16] = method3966(var32);
            if (var0.field1875 != null && var0.field1875[var0.field1865[var16]] != null) {
               var25 = var0.field1875[var0.field1865[var16]];
            } else {
               var25 = var0.field1873[var0.field1865[var16]];
            }

            var32 = var1
               + (var3 * var25.field2388 * 759055208 + var4 * var25.field2387 * -794112439 + var5 * var25.field2385 * -949378689)
                  / (var7 * var25.field2386 * 1200753713);
            var8.field2435[var16] = method3966(var32);
         } else if (var19 == 1) {
            classEB var28 = var0.field1874[var16];
            int var35 = var1
               + (var3 * var28.field1724 * 384833458 + var4 * var28.field1720 * 696545605 + var5 * var28.field1719 * -1298928853) / (var7 + var7 / 2);
            var8.field2434[var16] = method3966(var35);
            var8.field2435[var16] = -1;
         } else {
            var8.field2435[var16] = 1669147892;
         }
      }

      method3992(var0);
      var8.field2424 = var0.field1848;
      var8.field2427 = var0.field1855;
      var8.field2430 = var0.field1856;
      var8.field2426 = var0.field1857;
      var8.field2419 = var0.field1849;
      var8.field2429 = var0.field1880;
      var8.field2432 = var0.field1864;
      var8.field2433 = var0.field1865;
      var8.field2431 = var0.field1867;
      var8.field2444 = var0.field1859;
      var8.field2420 = var0.field1851;
      var8.field2442 = var0.field1863;
      var8.field2443 = var0.field1860;
      var8.field2437 = var0.field1853;
      var8.field2508 = var0.field1876;
      var8.field2507 = var0.field1877;
      var8.field2438 = var0.field1872;
      return var8;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ler;")
   @ObfuscatedName("dz")
   public ModelData method4067(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      return this.method3987(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("ay")
   public ModelData method3986() {
      ModelData var1 = new ModelData();
      if (this.field1866 != null) {
         var1.field1868 = new byte[this.field1893];

         for (int var2 = 0; var2 < this.field1849; var2++) {
            var1.field1859[var2] = this.field1866[var2];
         }
      }

      var1.field1889 = this.field1892;
      var1.field1886 = this.field1848;
      var1.field1849 = this.field1886;
      var1.field1857 = this.field1857;
      var1.field1857 = this.field1857;
      var1.field1855 = this.field1857;
      var1.field1894 = this.field1865;
      var1.field1871 = this.field1895;
      var1.field1895 = this.field1865;
      var1.field1872 = this.field1872;
      var1.field1861 = this.field1866;
      var1.field1868 = this.field1861;
      var1.field1862 = this.field1853;
      var1.field1853 = this.field1858;
      var1.field1851 = this.field1851;
      var1.field1868 = this.field1866;
      var1.field1862 = this.field1853;
      var1.field1869 = this.field1862;
      var1.field1853 = this.field1869;
      var1.field1871 = this.field1880;
      var1.field1865 = this.field1894;
      var1.field1877 = this.field1876;
      var1.field1863 = this.field1860;
      var1.field1875 = this.field1873;
      var1.field1874 = this.field1874;
      var1.field1878 = this.field1879;
      var1.field1879 = this.field1879;
      var1.field1868 = this.field1868;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method4068() {
      method4015(this);
   }

   public float[] getVerticesZ() {
      return this.field1857;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bp")
   public void method4036(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field1854; var4++) {
         this.field1856[var4] = var1 * this.field1856[var4] / 128.0F;
         this.field1856[var4] = var2 * this.field1856[var4] / 128.0F;
         this.field1857[var4] = var3 * this.field1856[var4] / 128.0F;
      }

      this.method4017();
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ao")
   void method3973(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * -1095856699;
      int var9 = Buffer.method13047(var4, -107791080);
      int var10 = Buffer.method13047(var4, -768146370);
      int var11 = Buffer.method13039(var4, -346779531);
      int var12 = Buffer.method13039(var4, -346779531);
      int var13 = Buffer.method13039(var4, -346779531);
      int var14 = Buffer.method13039(var4, -346779531);
      int var15 = Buffer.method13039(var4, -346779531);
      int var16 = Buffer.method13039(var4, -346779531);
      int var17 = Buffer.method13039(var4, -346779531);
      int var18 = Buffer.method13047(var4, 795681871);
      int var19 = Buffer.method13047(var4, -2010188365);
      int var20 = Buffer.method13047(var4, -762798976);
      int var21 = Buffer.method13047(var4, -2050234948);
      int var22 = Buffer.method13047(var4, -833548673);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 1822631066) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.field1893 = var9;
      this.field1854 = var10;
      this.field1886 = var11;
      this.field1855 = new float[var9];
      this.field1856 = new float[var9];
      this.field1857 = new float[var9];
      this.field1894 = new int[var10];
      this.field1894 = new int[var10];
      this.field1865 = new int[var10];
      if (var11 > 0) {
         this.field1867 = new byte[var11];
         this.field1858 = new short[var11];
         this.field1852 = new short[var11];
         this.field1853 = new short[var11];
      }

      if (var16 == 1) {
         this.field1896 = new int[var9];
      }

      if (var12 == 1) {
         this.field1872 = new byte[var10];
         this.field1868 = new byte[var10];
         this.field1852 = new short[var10];
      }

      if (var13 == -32858800) {
         this.field1861 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1867 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1865 = new int[var10];
      }

      if (var17 == 1) {
         this.field1860 = new int[var9][];
         this.field1876 = new int[var9][];
      }

      this.field1853 = new short[var10];
      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      var6.offset = var23 * -1095856699;
      var7.offset = var23 * -1095856699;
      var8.offset = var23 * -2100283791;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = Buffer.method13039(var4, -346779531);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method13225(-1601290666);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.method13198(-1962808119);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.method13088(-1604606323);
         }

         this.field1856[var41] = var38 + var43;
         this.field1856[var41] = var39 + var44;
         this.field1855[var41] = var40 + var45;
         var38 = (int)this.field1856[var41];
         var39 = (int)this.field1855[var41];
         var40 = (int)this.field1856[var41];
         if (var16 == 1) {
            this.field1880[var41] = Buffer.method13039(var8, -346779531);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = Buffer.method13039(var8, -346779531);
            this.field1860[var58] = new int[var61];
            this.field1876[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field1877[var58][var64] = Buffer.method13039(var8, -346779531);
               this.field1876[var58][var64] = Buffer.method13039(var8, -346779531);
            }
         }
      }

      var4.offset = var23 * -1530650428;
      var5.offset = var28 * -1095856699;
      var6.offset = var26 * -1095856699;
      var7.offset = var30 * -2123116226;
      var8.offset = var27 * -464439939;

      for (int var59 = 0; var59 < var10; var59++) {
         this.field1858[var59] = (short)Buffer.method13047(var4, 487913714);
         if (var12 == 1) {
            int var62 = Buffer.method13039(var5, -346779531);
            if ((var62 & 1) == 1) {
               this.field1859[var59] = 1;
               var2 = true;
            } else {
               this.field1866[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.field1859[var59] = (byte)(var62 >> 2);
               this.field1853[var59] = this.field1853[var59];
               this.field1869[var59] = (short)-1173186371;
               if (this.field1853[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.field1861[var59] = -1;
               this.field1858[var59] = -1;
            }
         }

         if (var13 == 255) {
            this.field1867[var59] = Buffer.method13043(var6, (byte)17);
         }

         if (var14 == 1) {
            this.field1861[var59] = Buffer.method13043(var7, (byte)17);
         }

         if (var15 == 1) {
            this.field1864[var59] = Buffer.method13039(var8, -346779531);
         }
      }

      var4.offset = var23 * -1095856699;
      var5.offset = var23 * -1095856699;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = Buffer.method13039(var5, -346779531);
         if (var46 == 1) {
            var60 = var4.method13246(-1061225280) + var66;
            var63 = var4.method13241(-1001751831) + var60;
            var65 = var4.method13241(-169230939) + var63;
            var66 = var65;
            this.field1870[var67] = var60;
            this.field1870[var67] = var63;
            this.field1894[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.method13246(-324407637) + var66;
            var66 = var65;
            this.field1865[var67] = var60;
            this.field1895[var67] = var63;
            this.field1870[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.method13088(-1059913088) + var66;
            var66 = var65;
            this.field1870[var67] = var60;
            this.field1880[var67] = var63;
            this.field1896[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.method13246(-181421895) + var66;
            var66 = var65;
            this.field1896[var67] = var60;
            this.field1871[var67] = var47;
            this.field1870[var67] = var65;
         }
      }

      var4.offset = var23 * -1095856699;

      for (int var68 = 0; var68 < var11; var68++) {
         this.field1872[var68] = 0;
         this.field1853[var68] = (short)Buffer.method13047(var4, -857983386);
         this.field1862[var68] = (short)Buffer.method13047(var4, -141855442);
         this.field1869[var68] = (short)Buffer.method13047(var4, -1836913907);
      }

      var4.offset = var23 * -926635913;
      boolean var69 = Buffer.method13039(var4, -346779531) == 1;
      if (var69) {
         this.field1867 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field1859[var70] = Buffer.method13043(var4, (byte)17);
         }
      }

      if (this.field1867 != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.field1866[var72] & 255;
            if (var48 != 552178001) {
               if ((this.field1852[var48] & -432877611) == this.field1864[var72]
                  && (this.field1862[var48] & 1121576698) == this.field1880[var72]
                  && (this.field1852[var48] & 618463106) == this.field1895[var72]) {
                  this.field1872[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.field1861 = null;
         }
      }

      if (!var3) {
         this.field1853 = null;
      }

      if (!var2) {
         this.field1868 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   public void method4011() {
      for (int var1 = 0; var1 < this.field1892; var1++) {
         this.field1857[var1] = -((int)this.field1857[var1]);
      }

      for (int var3 = 0; var3 < this.field1849; var3++) {
         int var2 = this.field1880[var3];
         this.field1871[var3] = this.field1870[var3];
         this.field1870[var3] = var2;
      }

      this.method4019();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method4043() {
      for (int var1 = 0; var1 < this.field1893; var1++) {
         this.field1857[var1] = -this.field1857[var1];
         this.field1855[var1] = -this.field1857[var1];
      }

      this.method4038();
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("al")
   void method3977(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * -1095856699;
      int var9 = Buffer.method13047(var2, -1975589991);
      int var10 = Buffer.method13047(var2, -1787785927);
      int var11 = Buffer.method13039(var2, -346779531);
      int var12 = Buffer.method13039(var2, -346779531);
      int var13 = Buffer.method13039(var2, -346779531);
      int var14 = Buffer.method13039(var2, -346779531);
      int var15 = Buffer.method13039(var2, -346779531);
      int var16 = Buffer.method13039(var2, -346779531);
      int var17 = Buffer.method13039(var2, -346779531);
      int var18 = Buffer.method13047(var2, 1648062840);
      int var19 = Buffer.method13047(var2, -655551909);
      int var20 = Buffer.method13047(var2, -732802342);
      int var21 = Buffer.method13047(var2, 161945279);
      int var22 = Buffer.method13047(var2, -578341193);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.field1868 = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.field1868[var26] = Buffer.method13043(var2, (byte)17);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      this.field1891 = var9;
      this.field1891 = var10;
      this.field1892 = var11;
      this.field1855 = new float[var9];
      this.field1855 = new float[var9];
      this.field1857 = new float[var9];
      this.field1895 = new int[var10];
      this.field1895 = new int[var10];
      this.field1880 = new int[var10];
      if (var17 == 1) {
         this.field1865 = new int[var9];
      }

      if (var12 == 1) {
         this.field1861 = new byte[var10];
      }

      if (var13 == 255) {
         this.field1859 = new byte[var10];
      } else {
         this.field1851 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1866 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1870 = new int[var10];
      }

      if (var16 == 1) {
         this.field1852 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field1861 = new byte[var10];
      }

      this.field1862 = new short[var10];
      if (var11 > 0) {
         this.field1862 = new short[var11];
         this.field1862 = new short[var11];
         this.field1869 = new short[var11];
      }

      var2.offset = var11 * -1095856699;
      var3.offset = var58 * -1095856699;
      var4.offset = var58 * -1095856699;
      var5.offset = var58 * -1095856699;
      var6.offset = var32 * -1095856699;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = Buffer.method13039(var2, -346779531);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method13220(-253909922);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method13241(-1068350675);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method13215(-732969970);
         }

         this.field1856[var51] = var48 + var53;
         this.field1855[var51] = var49 + var54;
         this.field1855[var51] = var50 + var55;
         var48 = (int)this.field1857[var51];
         var49 = (int)this.field1856[var51];
         var50 = (int)this.field1855[var51];
         if (var17 == 1) {
            this.field1895[var51] = Buffer.method13039(var6, -346779531);
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var28 * -1095856699;
      var4.offset = var30 * -1095856699;
      var5.offset = var33 * -1095856699;
      var6.offset = var31 * -1095856699;
      var7.offset = var35 * -1095856699;
      var8.offset = var58 * -1095856699;

      for (int var72 = 0; var72 < var10; var72++) {
         this.field1858[var72] = (short)Buffer.method13047(var2, -1567601339);
         if (var12 == 1) {
            this.field1872[var72] = Buffer.method13043(var3, (byte)17);
         }

         if (var13 == 255) {
            this.field1861[var72] = Buffer.method13043(var4, (byte)17);
         }

         if (var14 == 1) {
            this.field1872[var72] = Buffer.method13043(var5, (byte)17);
         }

         if (var15 == 1) {
            this.field1896[var72] = Buffer.method13039(var6, -346779531);
         }

         if (var16 == 1) {
            this.field1862[var72] = (short)(Buffer.method13047(var7, -639982632) - 1);
         }

         if (this.field1859 != null && this.field1862[var72] != -1) {
            this.field1859[var72] = (byte)(Buffer.method13039(var8, -346779531) - 1);
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var58 * -1095856699;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = Buffer.method13039(var3, -346779531);
         if (var56 == 1) {
            var73 = var2.method13116(-1767038727) + var76;
            var74 = var2.method13215(-33335713) + var73;
            var75 = var2.method13165(-795617608) + var74;
            var76 = var75;
            this.field1871[var77] = var73;
            this.field1880[var77] = var74;
            this.field1865[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.method13053(-145083022) + var76;
            var76 = var75;
            this.field1865[var77] = var73;
            this.field1896[var77] = var74;
            this.field1895[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.method13051(-1394156646) + var76;
            var76 = var75;
            this.field1864[var77] = var73;
            this.field1896[var77] = var74;
            this.field1870[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.method13053(-1183143936) + var76;
            var76 = var75;
            this.field1865[var77] = var73;
            this.field1865[var77] = var57;
            this.field1880[var77] = var75;
         }
      }

      var2.offset = var58 * -1095856699;
      var3.offset = var58 * -1095856699;
      var4.offset = var58 * -1095856699;
      var5.offset = var58 * -1095856699;
      var6.offset = var58 * -1095856699;
      var7.offset = var58 * -1095856699;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = this.field1866[var78] & 255;
         if (var80 == 0) {
            this.field1858[var78] = (short)Buffer.method13047(var2, -1543259803);
            this.field1869[var78] = (short)Buffer.method13047(var2, 1852002342);
            this.field1858[var78] = (short)Buffer.method13047(var2, 1714746368);
         }
      }

      var2.offset = var58 * -1095856699;
      int var79 = Buffer.method13039(var2, -346779531);
      if (var79 != 0) {
         new classFY();
         Buffer.method13047(var2, -1186071790);
         Buffer.method13047(var2, -1191891964);
         Buffer.method13047(var2, 1217187388);
         var2.method13100((byte)1);
      }
   }
}
