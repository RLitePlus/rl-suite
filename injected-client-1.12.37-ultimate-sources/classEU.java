import net.runelite.api.IntProjection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class classEU extends classFV implements IntProjection {
   @ObfuscatedName("ao")
   int field1919;
   @ObfuscatedName("af")
   int field1921;
   @ObfuscatedName("pd")
   public float field1934;
   @ObfuscatedName("jh")
   public float field1930;
   @ObfuscatedName("yb")
   public float field1936;
   @ObfuscatedName("fp")
   public float field1929;
   @ObfuscatedName("ae")
   int field1920;
   @ObfuscatedName("kv")
   public float field1932;
   @ObfuscatedSignature(descriptor = "Lup;")
   @ObfuscatedName("ab")
   classUP field1923;
   @ObfuscatedName("lm")
   public float field1933;
   @ObfuscatedName("qx")
   public static int field1938;
   @ObfuscatedName("as")
   float field1922;
   @ObfuscatedName("bz")
   static int field1937;
   @ObfuscatedName("qb")
   public float field1935;
   @ObfuscatedName("ac")
   float field1924;
   @ObfuscatedSignature(descriptor = "Leu;")
   @ObfuscatedName("wq")
   public static classEU field1939;
   @ObfuscatedName("aa")
   float field1925;
   @ObfuscatedName("at")
   public float field1928;
   @ObfuscatedName("kh")
   public float field1931;
   @ObfuscatedName("ys")
   public final float[] field1916 = new float[3];
   @ObfuscatedSignature(descriptor = "Lup;")
   @ObfuscatedName("ag")
   classUP field1918;
   @ObfuscatedName("al")
   int field1926;
   @ObfuscatedName("az")
   int field1927;
   @ObfuscatedName("ax")
   float field1917;

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("as")
   @Override
   void vmethod422(classEE var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod415(
         var2,
         this.field1923,
         this.field1918,
         var3,
         var4,
         var5,
         this.field1927 * -244055134,
         this.field1921 * -39987553,
         609299141 * this.field1920,
         var6,
         this.field1919 * -1931395903,
         this.field1926 * 1167982009,
         false
      );
   }

   public float[] project(float var1, float var2, float var3) {
      return this.project(var1, var2, var3, this.field1916);
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("az")
   @Override
   void vmethod435(classEE var1, int var2, int var3, int var4, int var5, long var6) {
      if ((client.field1096 & 17) == 1) {
         client.field1118.draw(this, null, var1, var2, var3, var4 - var1.getAnimationHeightOffset(), var5, var6);
      } else {
         var1.method3841(
            var2,
            this.field1923,
            this.field1918,
            var3,
            var4,
            var5,
            this.field1927 * -1862793759,
            this.field1921 * -39987553,
            this.field1920 * 706474989,
            var6,
            this.field1919 * -1931395903,
            this.field1926 * 1167982009,
            false
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIII)V")
   @ObfuscatedName("af")
   @Override
   void vmethod426(classEZ var1, classFJ var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 != classFH.field2257.field2217) {
            float var7;
            float var8 = var7 = (var4 << 7) - this.field1927 * -1862793759;
            float var9;
            float var10 = var9 = (var5 << 7) - this.field1920 * 706474989;
            float var11;
            float var12 = var11 = 128.0F + var8;
            float var13;
            float var14 = var13 = var10 + 128.0F;
            float var15 = var1.field2060[var3][var4][var5] - -39987553 * this.field1921;
            float var16 = var1.field2060[var3][var4 + 1][var5] - -39987553 * this.field1921;
            float var17 = var1.field2060[var3][1 + var4][1 + var5] - this.field1921 * -39987553;
            float var18 = var1.field2060[var3][var4][1 + var5] - this.field1921 * -39987553;
            float var19 = var10 * this.field1924 + var8 * this.field1925;
            var10 = var10 * this.field1925 - var8 * this.field1924;
            var19 = this.field1917 * var15 - var10 * this.field1922;
            var10 = var10 * this.field1917 + var15 * this.field1922;
            if (!(var10 < 50.0F)) {
               var19 = var9 * this.field1924 + this.field1925 * var12;
               var9 = this.field1925 * var9 - this.field1924 * var12;
               var19 = this.field1917 * var16 - this.field1922 * var9;
               var9 = this.field1922 * var16 + var9 * this.field1917;
               if (var9 < 50.0F) {
                  if (var6 != -1565439737) {
                     ;
                  }
               } else {
                  var19 = var14 * this.field1924 + var11 * this.field1925;
                  var14 = var14 * this.field1925 - var11 * this.field1924;
                  var19 = var17 * this.field1917 - this.field1922 * var14;
                  var14 = this.field1917 * var14 + this.field1922 * var17;
                  if (var14 < 50.0F) {
                     if (var6 == -1565439737) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var19 = var13 * this.field1924 + this.field1925 * var7;
                     var13 = this.field1925 * var13 - this.field1924 * var7;
                     var19 = var18 * this.field1917 - this.field1922 * var13;
                     var13 = var13 * this.field1917 + this.field1922 * var18;
                     if (!(var13 < 50.0F)) {
                        this.method5034(var1, var2, var4, var5, var19, var19, var19, var19, var19, var19, var19, var19, var10, var9, var14, var13, 650575801);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "eu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aq")
   @Override
   void vmethod433(classEZ var1, classFN var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6] - this.field1927 * -196075592;
            float var8 = var2.field2323[var6] - this.field1921 * -1226183590;
            float var9 = var2.field2327[var6] - this.field1920 * 1133029733;
            float var10 = var9 * this.field1924 + this.field1925 * var7;
            var9 = this.field1925 * var9 - var7 * this.field1924;
            var10 = var8 * this.field1917 - var9 * this.field1922;
            var9 = var8 * this.field1922 + var9 * this.field1917;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.field2324) {
               classFN.field2339[var6] = (int)var10;
               classFN.field2335[var6] = (int)var10;
               classFN.field2341[var6] = (int)var9;
            }

            classFN.field2337[var6] = classFH.method4705() + var10 * classFH.method4727() / var9;
            classFN.field2340[var6] = classFH.method4710() + var10 * classFH.method4727() / var9;
            classFN.field2338[var6] = classJE.method6356(var9, 2113227426);
         }

         this.method5035(var1, var2, var3, var4, -305409447);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod434(classEZ var1, classFN var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6] - this.field1927 * -1862793759;
            float var8 = var2.field2323[var6] - this.field1921 * -39987553;
            float var9 = var2.field2327[var6] - this.field1920 * 706474989;
            float var10 = var9 * this.field1924 + this.field1925 * var7;
            var9 = this.field1925 * var9 - var7 * this.field1924;
            var10 = var8 * this.field1917 - var9 * this.field1922;
            var9 = var8 * this.field1922 + var9 * this.field1917;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.field2324) {
               classFN.field2339[var6] = (int)var10;
               classFN.field2335[var6] = (int)var10;
               classFN.field2341[var6] = (int)var9;
            }

            classFN.field2337[var6] = classFH.method4705() + var10 * classFH.method4727() / var9;
            classFN.field2340[var6] = classFH.method4710() + var10 * classFH.method4727() / var9;
            classFN.field2338[var6] = classJE.method6356(var9, 2090944221);
         }

         this.method5035(var1, var2, var3, var4, -930933709);
      }
   }

   public float getPitchSin() {
      return this.field1922;
   }

   classEU(int var1, int var2, int var3, classUP var4, classUP var5, int var6, int var7) {
      this.field1927 = var1 * 477298209;
      this.field1921 = var2 * 1184613727;
      this.field1920 = -442867227 * var3;
      this.field1923 = var4;
      this.field1918 = var5;
      this.field1922 = var4.method11449(2090579777);
      this.field1917 = var4.method11451((byte)127);
      this.field1924 = var5.method11449(2094340517);
      this.field1925 = var5.method11451((byte)127);
      this.field1919 = var6 * -1570942143;
      this.field1926 = 1240004745 * var7;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;III)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod431(classEZ var1, classFN var2, int var3, int var4, int var5) {
      try {
         if (1 != classFH.field2257.field2217) {
            int var6 = var2.field2322.length;

            for (int var7 = 0; var7 < var6; var7++) {
               if (var5 == 52058636) {
                  throw new IllegalStateException();
               }

               float var8 = var2.field2322[var7] - this.field1927 * -1862793759;
               float var9 = var2.field2323[var7] - this.field1921 * -39987553;
               float var10 = var2.field2327[var7] - this.field1920 * 706474989;
               float var11 = var10 * this.field1924 + this.field1925 * var8;
               var10 = this.field1925 * var10 - var8 * this.field1924;
               var11 = var9 * this.field1917 - var10 * this.field1922;
               var10 = var9 * this.field1922 + var10 * this.field1917;
               if (var10 < 50.0F) {
                  if (var5 == 52058636) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               if (null != var2.field2324) {
                  if (var5 == 52058636) {
                     throw new IllegalStateException();
                  }

                  classFN.field2339[var7] = (int)var11;
                  classFN.field2335[var7] = (int)var11;
                  classFN.field2341[var7] = (int)var10;
               }

               classFN.field2337[var7] = classFH.method4705() + var11 * classFH.method4727() / var10;
               classFN.field2340[var7] = classFH.method4710() + var11 * classFH.method4727() / var10;
               classFN.field2338[var7] = classJE.method6356(var10, 2107920547);
            }

            this.method5035(var1, var2, var3, var4, 474971057);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "eu.ae(" + ')');
      }
   }

   public int getCameraY() {
      return this.field1921 * -39987553;
   }

   public float getPitchCos() {
      return this.field1917;
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod425(classEE var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod415(
         var2,
         this.field1923,
         this.field1918,
         var3,
         var4,
         var5,
         this.field1927 * -1862793759,
         this.field1921 * -39987553,
         706474989 * this.field1920,
         var6,
         this.field1919 * -1931395903,
         this.field1926 * 1167982009,
         false
      );
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ac")
   @Override
   void vmethod427(classEZ var1, classFJ var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.field1927 * -1862793759;
         float var8;
         float var9 = var8 = (var5 << 7) - this.field1920 * 706474989;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.field2060[var3][var4][var5] - -39987553 * this.field1921;
         float var15 = var1.field2060[var3][var4 + 1][var5] - -39987553 * this.field1921;
         float var16 = var1.field2060[var3][1 + var4][1 + var5] - this.field1921 * -39987553;
         float var17 = var1.field2060[var3][var4][1 + var5] - this.field1921 * -39987553;
         float var18 = var9 * this.field1924 + var7 * this.field1925;
         var9 = var9 * this.field1925 - var7 * this.field1924;
         var18 = this.field1917 * var14 - var9 * this.field1922;
         var9 = var9 * this.field1917 + var14 * this.field1922;
         if (!(var9 < 50.0F)) {
            var18 = var8 * this.field1924 + this.field1925 * var11;
            var8 = this.field1925 * var8 - this.field1924 * var11;
            var18 = this.field1917 * var15 - this.field1922 * var8;
            var8 = this.field1922 * var15 + var8 * this.field1917;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.field1924 + var10 * this.field1925;
               var13 = var13 * this.field1925 - var10 * this.field1924;
               var18 = var16 * this.field1917 - this.field1922 * var13;
               var13 = this.field1917 * var13 + this.field1922 * var16;
               if (!(var13 < 50.0F)) {
                  var18 = var12 * this.field1924 + this.field1925 * var6;
                  var12 = this.field1925 * var12 - this.field1924 * var6;
                  var18 = var17 * this.field1917 - this.field1922 * var12;
                  var12 = var12 * this.field1917 + this.field1922 * var17;
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, 2078436232);
                  }
               }
            }
         }
      }
   }

   public float[] project(float var1, float var2, float var3, float[] var4) {
      var1 -= this.field1933;
      var2 -= this.field1930;
      var3 -= this.field1931;
      float var5 = var1 * this.field1928 + var3 * this.field1936;
      float var6 = var3 * this.field1928 - var1 * this.field1936;
      float var7 = var2 * this.field1934 - var6 * this.field1932;
      float var8 = var6 * this.field1934 + var2 * this.field1932;
      var4[0] = var5;
      var4[1] = var7;
      var4[2] = var8;
      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod432(classEZ var1, classFN var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6] - this.field1927 * 223124833;
            float var8 = var2.field2323[var6] - this.field1921 * -39987553;
            float var9 = var2.field2327[var6] - this.field1920 * -1197555864;
            float var10 = var9 * this.field1924 + this.field1925 * var7;
            var9 = this.field1925 * var9 - var7 * this.field1924;
            var10 = var8 * this.field1917 - var9 * this.field1922;
            var9 = var8 * this.field1922 + var9 * this.field1917;
            if (var9 < 50.0F) {
               return;
            }

            if (null != var2.field2324) {
               classFN.field2339[var6] = (int)var10;
               classFN.field2335[var6] = (int)var10;
               classFN.field2341[var6] = (int)var9;
            }

            classFN.field2337[var6] = classFH.method4705() + var10 * classFH.method4727() / var9;
            classFN.field2340[var6] = classFH.method4710() + var10 * classFH.method4727() / var9;
            classFN.field2338[var6] = classJE.method6356(var9, 2109625642);
         }

         this.method5035(var1, var2, var3, var4, -427030004);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Z")
   @ObfuscatedName("af")
   public static boolean method4078(CharSequence var0, byte var1) {
      try {
         return classMQ.method7641(var0, 10, true, -349565276);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "eu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("al")
   @Override
   void vmethod429(classEZ var1, classFJ var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.field1927 * -1862793759;
         float var8;
         float var9 = var8 = (var5 << 7) - this.field1920 * 706474989;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.field2060[var3][var4][var5] - -39987553 * this.field1921;
         float var15 = var1.field2060[var3][var4 + 1][var5] - -39987553 * this.field1921;
         float var16 = var1.field2060[var3][1 + var4][1 + var5] - this.field1921 * -39987553;
         float var17 = var1.field2060[var3][var4][1 + var5] - this.field1921 * -39987553;
         float var18 = var9 * this.field1924 + var7 * this.field1925;
         var9 = var9 * this.field1925 - var7 * this.field1924;
         var18 = this.field1917 * var14 - var9 * this.field1922;
         var9 = var9 * this.field1917 + var14 * this.field1922;
         if (!(var9 < 50.0F)) {
            var18 = var8 * this.field1924 + this.field1925 * var11;
            var8 = this.field1925 * var8 - this.field1924 * var11;
            var18 = this.field1917 * var15 - this.field1922 * var8;
            var8 = this.field1922 * var15 + var8 * this.field1917;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.field1924 + var10 * this.field1925;
               var13 = var13 * this.field1925 - var10 * this.field1924;
               var18 = var16 * this.field1917 - this.field1922 * var13;
               var13 = this.field1917 * var13 + this.field1922 * var16;
               if (!(var13 < 50.0F)) {
                  var18 = var12 * this.field1924 + this.field1925 * var6;
                  var12 = this.field1925 * var12 - this.field1924 * var6;
                  var18 = var17 * this.field1917 - this.field1922 * var12;
                  var12 = var12 * this.field1917 + this.field1922 * var17;
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, -329453956);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod424(classEE var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod415(
         var2,
         this.field1923,
         this.field1918,
         var3,
         var4,
         var5,
         this.field1927 * -1862793759,
         this.field1921 * -39987553,
         706474989 * this.field1920,
         var6,
         this.field1919 * -1931395903,
         this.field1926 * 1167982009,
         false
      );
   }

   public float getYawSin() {
      return this.field1924;
   }

   @ObfuscatedSignature(descriptor = "(II)Lsh;")
   @ObfuscatedName("as")
   static classSH method4079(int var0, int var1) {
      try {
         classSH var2 = (classSH)classOF.method8404(classOG.method8435((byte)-27), var0, -455431125);
         if (var2 == null) {
            var2 = classSH.field5936;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "eu.as(" + ')');
      }
   }

   public int getCameraX() {
      return this.field1927 * -1862793759;
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod423(classEE var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod415(
         var2,
         this.field1923,
         this.field1918,
         var3,
         var4,
         var5,
         this.field1927 * -1862793759,
         this.field1921 * -39987553,
         -159365702 * this.field1920,
         var6,
         this.field1919 * -1931395903,
         this.field1926 * 1167982009,
         false
      );
   }

   public float getYawCos() {
      return this.field1925;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gg")
   static final void method4081(int var0) {
      try {
         client.field824.method9242(-226350443);
         classYY.field7118 = true;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "eu.gg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("aa")
   @Override
   void vmethod428(classEZ var1, classFJ var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.field1927 * 505713928;
         float var8;
         float var9 = var8 = (var5 << 7) - this.field1920 * 706474989;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.field2060[var3][var4][var5] - -1627652707 * this.field1921;
         float var15 = var1.field2060[var3][var4 + 1][var5] - 43222010 * this.field1921;
         float var16 = var1.field2060[var3][1 + var4][1 + var5] - this.field1921 * -482231816;
         float var17 = var1.field2060[var3][var4][1 + var5] - this.field1921 * 623749917;
         float var18 = var9 * this.field1924 + var7 * this.field1925;
         var9 = var9 * this.field1925 - var7 * this.field1924;
         var18 = this.field1917 * var14 - var9 * this.field1922;
         var9 = var9 * this.field1917 + var14 * this.field1922;
         if (!(var9 < 50.0F)) {
            var18 = var8 * this.field1924 + this.field1925 * var11;
            var8 = this.field1925 * var8 - this.field1924 * var11;
            var18 = this.field1917 * var15 - this.field1922 * var8;
            var8 = this.field1922 * var15 + var8 * this.field1917;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.field1924 + var10 * this.field1925;
               var13 = var13 * this.field1925 - var10 * this.field1924;
               var18 = var16 * this.field1917 - this.field1922 * var13;
               var13 = this.field1917 * var13 + this.field1922 * var16;
               if (!(var13 < 50.0F)) {
                  var18 = var12 * this.field1924 + this.field1925 * var6;
                  var12 = this.field1925 * var12 - this.field1924 * var6;
                  var18 = var17 * this.field1917 - this.field1922 * var12;
                  var12 = var12 * this.field1917 + this.field1922 * var17;
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, 1163604833);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method4076(int var0) {
      try {
         classJZ.method6431(classPF.field5235);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "eu.af(" + ')');
      }
   }

   public int getCameraZ() {
      return this.field1920 * 706474989;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod430(classEZ var1, classFJ var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = (var4 << 7) - this.field1927 * -1862793759;
         float var8;
         float var9 = var8 = (var5 << 7) - this.field1920 * 706474989;
         float var10;
         float var11 = var10 = 128.0F + var7;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14 = var1.field2060[var3][var4][var5] - -39987553 * this.field1921;
         float var15 = var1.field2060[var3][var4 + 1][var5] - -39987553 * this.field1921;
         float var16 = var1.field2060[var3][1 + var4][1 + var5] - this.field1921 * -39987553;
         float var17 = var1.field2060[var3][var4][1 + var5] - this.field1921 * -39987553;
         float var18 = var9 * this.field1924 + var7 * this.field1925;
         var9 = var9 * this.field1925 - var7 * this.field1924;
         var18 = this.field1917 * var14 - var9 * this.field1922;
         var9 = var9 * this.field1917 + var14 * this.field1922;
         if (!(var9 < 50.0F)) {
            var18 = var8 * this.field1924 + this.field1925 * var11;
            var8 = this.field1925 * var8 - this.field1924 * var11;
            var18 = this.field1917 * var15 - this.field1922 * var8;
            var8 = this.field1922 * var15 + var8 * this.field1917;
            if (!(var8 < 50.0F)) {
               var18 = var13 * this.field1924 + var10 * this.field1925;
               var13 = var13 * this.field1925 - var10 * this.field1924;
               var18 = var16 * this.field1917 - this.field1922 * var13;
               var13 = this.field1917 * var13 + this.field1922 * var16;
               if (!(var13 < 50.0F)) {
                  var18 = var12 * this.field1924 + this.field1925 * var6;
                  var12 = this.field1925 * var12 - this.field1924 * var6;
                  var18 = var17 * this.field1917 - this.field1922 * var12;
                  var12 = var12 * this.field1917 + this.field1922 * var17;
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, 1259911123);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public static boolean method4077(int var0) {
      try {
         classZQ var1 = (classZQ)classZJ.field7189.method8167();
         if (null == var1) {
            if (var0 >= -1981470888) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "eu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIII)V")
   @ObfuscatedName("dk")
   static void method4080(classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         classNN var8 = var0.field1701[var1][var2][var3];
         if (null != var8) {
            if (var7 >= 1531627111) {
               throw new IllegalStateException();
            }

            for (classDL var9 = (classDL)var8.method7915(); var9 != null; var9 = (classDL)classNN.method7924(var8)) {
               if (var7 >= 1531627111) {
                  throw new IllegalStateException();
               }

               if (var4 == -1370204663 * var9.field1552) {
                  if (var7 >= 1531627111) {
                     return;
                  }

                  if (var5 == var9.field1554 * 1413659045) {
                     if (var7 >= 1531627111) {
                        throw new IllegalStateException();
                     }

                     int var10001 = -513440211 * var6;
                     var9.method3414(-513440211 * var6 * 1413659045);
                     var9.field1554 = var10001;
                     break;
                  }
               }
            }

            classUA.method11240(var1, var2, var3, -79498757);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "eu.dk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("cl")
   @Override
   public void vmethod436(classEZ var1, classFJ var2, int var3, int var4, int var5) {
      if (classFH.field2257.field2217 != 1) {
         int var6 = var4 + var1.field2147;
         int var7 = var5 + var1.field2147;
         float var8;
         float var9 = var8 = (var4 << 7) - this.field1927 * -1862793759;
         float var10;
         float var11 = var10 = (var5 << 7) - this.field1920 * 706474989;
         float var12;
         float var13 = var12 = var9 + 128.0F;
         float var14;
         float var15 = var14 = var11 + 128.0F;
         float var16 = var1.field2060[var3][var6][var7] - this.field1921 * -39987553;
         float var17 = var1.field2060[var3][var6 + 1][var7] - this.field1921 * -39987553;
         float var18 = var1.field2060[var3][var6 + 1][var7 + 1] - this.field1921 * -39987553;
         float var19 = var1.field2060[var3][var6][var7 + 1] - this.field1921 * -39987553;
         float var20 = var9 * this.field1925 + var11 * this.field1924;
         var11 = var11 * this.field1925 - var9 * this.field1924;
         var20 = var16 * this.field1917 - var11 * this.field1922;
         var11 = var11 * this.field1917 + var16 * this.field1922;
         if (var11 >= 50.0F) {
            var20 = var10 * this.field1924 + var13 * this.field1925;
            var10 = var10 * this.field1925 - var13 * this.field1924;
            var20 = var17 * this.field1917 - var10 * this.field1922;
            var10 = var10 * this.field1917 + var17 * this.field1922;
            if (var10 >= 50.0F) {
               var20 = var12 * this.field1925 + var15 * this.field1924;
               var15 = var15 * this.field1925 - var12 * this.field1924;
               var20 = var18 * this.field1917 - var15 * this.field1922;
               var15 = var18 * this.field1922 + var15 * this.field1917;
               if (var15 >= 50.0F) {
                  var20 = var8 * this.field1925 + var14 * this.field1924;
                  var14 = var14 * this.field1925 - var8 * this.field1924;
                  var20 = var19 * this.field1917 - var14 * this.field1922;
                  var14 = var19 * this.field1922 + var14 * this.field1917;
                  if (var14 >= 50.0F) {
                     if (client.field1118 != null) {
                        client.field1118.drawScenePaint(var1, var2, var3, var4, var5);
                     }

                     this.method5038(var1, var2, var4, var5, var20, var20, var20, var20, var20, var20, var20, var20, var11, var10, var15, var14);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("xg")
   @Override
   public void vmethod437(classEZ var1, classFN var2, int var3, int var4) {
      this.vmethod431(var1, var2, var3, var4, 461027311);
   }
}
