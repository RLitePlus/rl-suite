import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ps")
public class classPS extends classVJ implements MapElementConfig {
   @ObfuscatedName("ap")
   int[] field5415;
   @ObfuscatedName("af")
   public static int field5407;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ae")
   static classJZ field5406 = new classJZ(256);
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ab")
   public static classVA field5413;
   @ObfuscatedName("as")
   public final int field5405;
   @ObfuscatedName("ax")
   public int field5395 = -776403169;
   @ObfuscatedName("ac")
   int field5393 = 998477221;
   @ObfuscatedName("at")
   int[] field5416;
   @ObfuscatedName("ao")
   public int field5408;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field5410 = 33;
   @ObfuscatedName("aj")
   public boolean field5392;
   @ObfuscatedName("ay")
   public boolean field5399;
   @ObfuscatedSignature(descriptor = "Lol;")
   @ObfuscatedName("av")
   public classOL field5397;
   @ObfuscatedName("aa")
   public String field5411;
   @ObfuscatedName("aw")
   int field5401;
   @ObfuscatedName("al")
   public int field5394 = 0;
   @ObfuscatedName("ai")
   int field5403;
   @ObfuscatedName("ar")
   int field5398;
   @ObfuscatedName("au")
   int field5396;
   @ObfuscatedSignature(descriptor = "Lpe;")
   @ObfuscatedName("ak")
   public classPE field5402;
   @ObfuscatedName("am")
   public int field5404;
   @ObfuscatedName("aq")
   public String[] field5400;
   @ObfuscatedName("an")
   byte[] field5414;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5409 = 0;
   @ObfuscatedName("ad")
   public String field5412;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method9185() {
      classJZ.method6431(field5406);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lps;")
   @ObfuscatedName("aa")
   public static classPS method9183(int var0) {
      return var0 >= 0 && var0 < classYV.field7095.length && classYV.field7095[var0] != null ? classYV.field7095[var0] : new classPS(var0);
   }

   public int getCategory() {
      return this.field5404 * 1254355271;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method9194(int var1) {
      try {
         if (null != this.field5416) {
            if (var1 == -2009876679) {
               throw new IllegalStateException();
            }

            for (byte var2 = 0; var2 < this.field5416.length; var2 += 2) {
               if (var1 == -2009876679) {
                  throw new IllegalStateException();
               }

               if (this.field5416[var2] < this.field5396 * -1409238271) {
                  if (var1 == -2009876679) {
                     throw new IllegalStateException();
                  }

                  this.field5396 = this.field5416[var2] * 429409537;
               } else if (this.field5416[var2] > this.field5398 * 723964761) {
                  this.field5398 = this.field5416[var2] * -1560918807;
               }

               if (this.field5416[1 + var2] < this.field5403 * -1912538141) {
                  this.field5403 = 1145053643 * this.field5416[var2 + 1];
               } else if (this.field5416[1 + var2] > 814813303 * this.field5401) {
                  if (var1 == -2009876679) {
                     throw new IllegalStateException();
                  }

                  this.field5401 = this.field5416[var2 + 1] * -1314797241;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ps.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lym;")
   @ObfuscatedName("as")
   public classYM method9199(boolean var1, int var2) {
      try {
         int var3 = var1 ? 1153920467 * this.field5393 : 1274039073 * this.field5395;
         return this.method9201(var3, (short)3724);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ps.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lym;")
   @ObfuscatedName("aw")
   public classYM method9204(boolean var1) {
      return this.method9199(var1, 592907760);
   }

   @ObfuscatedSignature(descriptor = "(IS)Lym;")
   @ObfuscatedName("ax")
   classYM method9201(int var1, short var2) {
      try {
         if (var1 < 0) {
            if (var2 <= 232) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var3 = (classYM)field5406.method6422(var1);
            if (null != var3) {
               if (var2 <= 232) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = classPN.method9038(field5413, var1, 0, -2075524879);
               if (var3 != null) {
                  if (var2 <= 232) {
                     throw new IllegalStateException();
                  }

                  field5406.method6428(var3, var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ps.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lps;)V")
   @ObfuscatedName("dv")
   public static void method9195(classPS var0) {
      if (null != var0.field5416) {
         for (byte var1 = 0; var1 < var0.field5416.length; var1 += 2) {
            if (var0.field5416[var1] < var0.field5396 * -1409238271) {
               var0.field5396 = var0.field5416[var1] * 429409537;
            } else if (var0.field5416[var1] > var0.field5398 * 723964761) {
               var0.field5398 = var0.field5416[var1] * -1560918807;
            }

            if (var0.field5416[1 + var1] < var0.field5403 * -1912538141) {
               var0.field5403 = 1145053643 * var0.field5416[var1 + 1];
            } else if (var0.field5416[1 + var1] > 814813303 * var0.field5401) {
               var0.field5401 = var0.field5416[var1 + 1] * -1314797241;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lps;)V")
   @ObfuscatedName("vx")
   public static void method9196(classPS var0) {
      if (null != var0.field5416) {
         for (byte var1 = 0; var1 < var0.field5416.length; var1 += 2) {
            if (var0.field5416[var1] < var0.field5396 * -1409238271) {
               var0.field5396 = var0.field5416[var1] * 429409537;
            } else if (var0.field5416[var1] > var0.field5398 * -700804307) {
               var0.field5398 = var0.field5416[var1] * -1560918807;
            }

            if (var0.field5416[1 + var1] < var0.field5403 * -1912538141) {
               var0.field5403 = -1577271871 * var0.field5416[var1 + 1];
            } else if (var0.field5416[1 + var1] > 814813303 * var0.field5401) {
               var0.field5401 = var0.field5416[var1 + 1] * -2057379115;
            }
         }
      }
   }

   public classPS(int var1) {
      this.field5392 = true;
      this.field5399 = false;
      this.field5400 = new String[5];
      this.field5396 = 1718074111;
      this.field5403 = 1002430005;
      this.field5398 = Integer.MIN_VALUE;
      this.field5401 = Integer.MIN_VALUE;
      this.field5402 = classPE.field5230;
      this.field5397 = classOL.field4915;
      this.field5404 = -384460919;
      this.field5405 = var1 * 492640131;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method9186() {
      classJZ.method6431(field5406);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ac")
   public int method9203(byte var1) {
      try {
         return this.field5405 * 872689451;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ps.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;Lxy;B)V")
   @ObfuscatedName("th")
   public static void method9187(classPS var0, classXY var1, byte var2) {
      if (var0 == null) {
         var0.method9190(var1, var2);
      } else {
         try {
            while (true) {
               int var3 = classXY.method13039(var1, -346779531);
               if (0 == var3) {
                  if (var2 >= 6) {
                     return;
                  } else {
                     return;
                  }
               }

               method9193(var0, var1, var3, -1692111790);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ps.ae(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lps;")
   @ObfuscatedName("ao")
   public static classPS method9184(int var0) {
      return var0 >= 0 && var0 < classYV.field7095.length && classYV.field7095[var0] != null ? classYV.field7095[var0] : new classPS(var0);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ay")
   public void method9188(classXY var1) {
      while (true) {
         int var2 = classXY.method13039(var1, -346779531);
         if (0 == var2) {
            return;
         }

         method9193(this, var1, var2, -1692095083);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aq")
   public void method9189(classXY var1) {
      while (true) {
         int var2 = classXY.method13039(var1, -346779531);
         if (0 == var2) {
            return;
         }

         method9193(this, var1, var2, -1665293350);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ad")
   void method9191(classXY var1, int var2) {
      if (1 == var2) {
         this.field5395 = classXY.method13110(var1, -324749371) * 776403169;
      } else if (2 == var2) {
         this.field5393 = classXY.method13110(var1, -324749371) * -998477221;
      } else if (var2 == 3) {
         this.field5412 = var1.method13071(-306123980);
      } else if (4 == var2) {
         this.field5408 = var1.method13051(-758448158) * 1409547555;
      } else if (var2 == 5) {
         var1.method13051(-758448158);
      } else if (6 == var2) {
         this.field5394 = classXY.method13039(var1, -346779531) * -1551911823;
      } else if (var2 == 7) {
         int var3 = classXY.method13039(var1, -346779531);
         if (0 == (var3 & 1)) {
            this.field5392 = false;
         }

         if (2 == (var3 & 2)) {
            this.field5399 = true;
         }
      } else if (8 == var2) {
         classXY.method13039(var1, -346779531);
      } else if (var2 >= 10 && var2 <= 14) {
         this.field5400[var2 - 10] = var1.method13071(622726786);
      } else if (var2 == 15) {
         int var6 = classXY.method13039(var1, -346779531);
         this.field5416 = new int[2 * var6];

         for (int var4 = 0; var4 < 2 * var6; var4++) {
            this.field5416[var4] = var1.method13050((byte)16);
         }

         var1.method13056((byte)1);
         int var8 = classXY.method13039(var1, -346779531);
         this.field5415 = new int[var8];

         for (int var5 = 0; var5 < this.field5415.length; var5++) {
            this.field5415[var5] = var1.method13056((byte)1);
         }

         this.field5414 = new byte[var6];

         for (int var9 = 0; var9 < var6; var9++) {
            this.field5414[var9] = classXY.method13043(var1, (byte)17);
         }
      } else if (var2 != 16) {
         if (17 == var2) {
            this.field5411 = var1.method13071(-637679169);
         } else if (var2 == 18) {
            classXY.method13110(var1, -324749371);
         } else if (19 == var2) {
            this.field5404 = classXY.method13047(var1, 336475091) * -1772509582;
         } else if (var2 == 21) {
            var1.method13056((byte)1);
         } else if (var2 == 22) {
            var1.method13056((byte)1);
         } else if (23 == var2) {
            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
         } else if (var2 == 24) {
            var1.method13050((byte)16);
            var1.method13050((byte)16);
         } else if (var2 == 25) {
            classXY.method13110(var1, -324749371);
         } else if (28 == var2) {
            classXY.method13039(var1, -346779531);
         } else if (29 == var2) {
            this.field5402 = (classPE)classOF.method8404(classLP.method7140(494844112), classXY.method13039(var1, -346779531), -1114593499);
         } else if (var2 == 30) {
            classOL[] var7 = new classOL[]{classOL.field4915, classOL.field4914, classOL.field4916};
            this.field5397 = (classOL)classOF.method8404(var7, classXY.method13039(var1, -346779531), 1980613816);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method9197() {
      if (null != this.field5416) {
         for (byte var1 = 0; var1 < this.field5416.length; var1 += 2) {
            if (this.field5416[var1] < this.field5396 * -1409238271) {
               this.field5396 = this.field5416[var1] * 429409537;
            } else if (this.field5416[var1] > this.field5398 * 723964761) {
               this.field5398 = this.field5416[var1] * 1610387878;
            }

            if (this.field5416[1 + var1] < this.field5403 * -1912538141) {
               this.field5403 = 1145053643 * this.field5416[var1 + 1];
            } else if (this.field5416[1 + var1] > 814813303 * this.field5401) {
               this.field5401 = this.field5416[var1 + 1] * -113898180;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lym;")
   @ObfuscatedName("jl")
   public classYM method9200(boolean var1) {
      int var2 = var1 ? 1153920467 * this.field5393 : -1968481889 * this.field5395;
      return this.method9201(var2, (short)11797);
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ak")
   classYM method9202(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         classYM var2 = (classYM)field5406.method6422(var1);
         if (null != var2) {
            return var2;
         } else {
            var2 = classPN.method9038(field5413, var1, 0, -1652458336);
            if (var2 != null) {
               field5406.method6428(var2, var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method9198() {
      if (null != this.field5416) {
         for (byte var1 = 0; var1 < this.field5416.length; var1 += 2) {
            if (this.field5416[var1] < this.field5396 * 865751516) {
               this.field5396 = this.field5416[var1] * 429409537;
            } else if (this.field5416[var1] > this.field5398 * 723964761) {
               this.field5398 = this.field5416[var1] * -1560918807;
            }

            if (this.field5416[1 + var1] < this.field5403 * -1010761760) {
               this.field5403 = 1145053643 * this.field5416[var1 + 1];
            } else if (this.field5416[1 + var1] > 1238286228 * this.field5401) {
               this.field5401 = this.field5416[var1 + 1] * -1314797241;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILge;I)I")
   @ObfuscatedName("az")
   static int method9182(int var0, int var1, classGE var2, int var3) {
      try {
         classOW var4 = var2.vmethod463(var0, (byte)125);
         if (null == var4) {
            return var1;
         } else if (var4.field5170 * 151173899 >= 0) {
            if (var3 >= -678421703) {
               throw new IllegalStateException();
            } else {
               int var9 = classBU.method1245(2023234915 * var4.field5179, -2131451469 * var4.field5173, 1086307051 * var4.field5171, (byte)-1);
               int var10 = classDB.method2880(var9, 96, 1375698635);
               return classFH.field2251[var10] | 0xFF000000;
            }
         } else if (-982434803 * var4.field5176 >= 0) {
            if (var3 >= -678421703) {
               throw new IllegalStateException();
            } else {
               int var8 = classDB.method2880(classFH.field2257.field2239.vmethod408(var4.field5176 * -982434803, -1619632466), 96, 1375698635);
               return classFH.field2251[var8] | 0xFF000000;
            }
         } else if (var4.field5175 * 2136479275 == 16711935) {
            if (var3 >= -678421703) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            int var5 = classBU.method1245(2106821511 * var4.field5180, var4.field5181 * -1352766871, var4.field5182 * -1560131225, (byte)-120);
            int var6 = classDB.method2880(var5, 96, 1375698635);
            return classFH.field2251[var6] | 0xFF000000;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ps.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("ab")
   void method9192(classXY var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5394 = classXY.method13110(var1, -324749371) * 776403169;
         } else if (2 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5396 = classXY.method13110(var1, -324749371) * -998477221;
         } else if (var2 == 3) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5411 = var1.method13071(-337135206);
         } else if (4 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5408 = var1.method13241(-758448158) * 1409547555;
         } else if (var2 == 5) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var1.method13215(-758448158);
         } else if (6 == var2) {
            this.field5394 = classXY.method13039(var1, -346779531) * -17682209;
         } else if (var2 == 7) {
            int var4 = classXY.method13039(var1, -346779531);
            if (0 == (var4 & 1)) {
               this.field5399 = false;
            }

            if (2 == (var4 & 2)) {
               if (var3 >= -1241739344) {
                  throw new IllegalStateException();
               }

               this.field5399 = true;
            }
         } else if (8 == var2) {
            classXY.method13039(var1, -346779531);
         } else if (var2 >= 10 && var2 <= 14) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5400[var2 - 10] = var1.method13077(-973105624);
         } else if (var2 == 15) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            int var8 = classXY.method13039(var1, -346779531);
            this.field5416 = new int[2 * var8];

            for (int var5 = 0; var5 < 2 * var8; var5++) {
               if (var3 >= -1241739344) {
                  return;
               }

               this.field5416[var5] = var1.method13050((byte)16);
            }

            var1.method13202((byte)1);
            int var10 = classXY.method13039(var1, -346779531);
            this.field5415 = new int[var10];

            for (int var6 = 0; var6 < this.field5415.length; var6++) {
               if (var3 >= -1241739344) {
                  throw new IllegalStateException();
               }

               this.field5415[var6] = var1.method13159((byte)1);
            }

            this.field5414 = new byte[var8];

            for (int var11 = 0; var11 < var8; var11++) {
               if (var3 >= -1241739344) {
                  return;
               }

               this.field5414[var11] = classXY.method13043(var1, (byte)17);
            }
         } else if (var2 == 16) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }
         } else if (17 == var2) {
            this.field5411 = var1.method13071(207753851);
         } else if (var2 == 18) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13110(var1, -324749371);
         } else if (19 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5394 = classXY.method13047(var1, -696547813) * 384460919;
         } else if (var2 == 21) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var1.method13202((byte)1);
         } else if (var2 == 22) {
            if (var3 >= -1241739344) {
               return;
            }

            var1.method13100((byte)1);
         } else if (23 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
         } else if (var2 == 24) {
            if (var3 >= -1241739344) {
               return;
            }

            var1.method13159((byte)16);
            var1.method13100((byte)16);
         } else if (var2 == 25) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13110(var1, -324749371);
         } else if (28 == var2) {
            classXY.method13039(var1, -346779531);
         } else if (29 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            this.field5402 = (classPE)classOF.method8404(classLP.method7140(874163108), classXY.method13039(var1, -346779531), -971717788);
         } else if (var2 == 30) {
            if (var3 >= -1241739344) {
               return;
            }

            classOL[] var9 = new classOL[]{classOL.field4915, classOL.field4914, classOL.field4915};
            this.field5397 = (classOL)classOF.method8404(var9, classXY.method13039(var1, -346779531), 414905435);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ps.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;Lxy;II)V")
   @ObfuscatedName("eh")
   public static void method9193(classPS var0, classXY var1, int var2, int var3) {
      if (var0 == null) {
         var0.method9192(var1, var2, var2);
      }

      try {
         if (1 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5395 = classXY.method13110(var1, -324749371) * 776403169;
         } else if (2 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5393 = classXY.method13110(var1, -324749371) * -998477221;
         } else if (var2 == 3) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5412 = var1.method13071(-337135206);
         } else if (4 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5408 = var1.method13051(-758448158) * 1409547555;
         } else if (var2 == 5) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var1.method13051(-758448158);
         } else if (6 == var2) {
            var0.field5394 = classXY.method13039(var1, -346779531) * -17682209;
         } else if (var2 == 7) {
            int var4 = classXY.method13039(var1, -346779531);
            if (0 == (var4 & 1)) {
               var0.field5392 = false;
            }

            if (2 == (var4 & 2)) {
               if (var3 >= -1241739344) {
                  throw new IllegalStateException();
               }

               var0.field5399 = true;
            }
         } else if (8 == var2) {
            classXY.method13039(var1, -346779531);
         } else if (var2 >= 10 && var2 <= 14) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5400[var2 - 10] = var1.method13071(-973105624);
         } else if (var2 == 15) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            int var8 = classXY.method13039(var1, -346779531);
            var0.field5416 = new int[2 * var8];

            for (int var5 = 0; var5 < 2 * var8; var5++) {
               if (var3 >= -1241739344) {
                  return;
               }

               var0.field5416[var5] = var1.method13050((byte)16);
            }

            var1.method13056((byte)1);
            int var10 = classXY.method13039(var1, -346779531);
            var0.field5415 = new int[var10];

            for (int var6 = 0; var6 < var0.field5415.length; var6++) {
               if (var3 >= -1241739344) {
                  throw new IllegalStateException();
               }

               var0.field5415[var6] = var1.method13056((byte)1);
            }

            var0.field5414 = new byte[var8];

            for (int var11 = 0; var11 < var8; var11++) {
               if (var3 >= -1241739344) {
                  return;
               }

               var0.field5414[var11] = classXY.method13043(var1, (byte)17);
            }
         } else if (var2 == 16) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }
         } else if (17 == var2) {
            var0.field5411 = var1.method13071(207753851);
         } else if (var2 == 18) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13110(var1, -324749371);
         } else if (19 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5404 = classXY.method13047(var1, -696547813) * 384460919;
         } else if (var2 == 21) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var1.method13056((byte)1);
         } else if (var2 == 22) {
            if (var3 >= -1241739344) {
               return;
            }

            var1.method13056((byte)1);
         } else if (23 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
            classXY.method13039(var1, -346779531);
         } else if (var2 == 24) {
            if (var3 >= -1241739344) {
               return;
            }

            var1.method13050((byte)16);
            var1.method13050((byte)16);
         } else if (var2 == 25) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            classXY.method13110(var1, -324749371);
         } else if (28 == var2) {
            classXY.method13039(var1, -346779531);
         } else if (29 == var2) {
            if (var3 >= -1241739344) {
               throw new IllegalStateException();
            }

            var0.field5402 = (classPE)classOF.method8404(classLP.method7140(874163108), classXY.method13039(var1, -346779531), -971717788);
         } else if (var2 == 30) {
            if (var3 >= -1241739344) {
               return;
            }

            classOL[] var9 = new classOL[]{classOL.field4915, classOL.field4914, classOL.field4916};
            var0.field5397 = (classOL)classOF.method8404(var9, classXY.method13039(var1, -346779531), 414905435);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ps.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("ae")
   public void method9190(classXY var1, byte var2) {
      try {
         while (true) {
            int var3 = classXY.method13039(var1, -346779531);
            if (0 == var3) {
               if (var2 >= 6) {
                  return;
               }

               return;
            }

            method9193(this, var1, var3, -1692111790);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ps.ae(" + ')');
      }
   }
}
