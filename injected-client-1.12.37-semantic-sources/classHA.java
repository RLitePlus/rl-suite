import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ha")
public abstract class classHA {
   @ObfuscatedName("as")
   int field2754;
   @ObfuscatedName("aa")
   int field2750;
   @ObfuscatedName("ax")
   int field2755;
   @ObfuscatedName("ac")
   int field2751;
   @ObfuscatedName("aq")
   byte[][][] field2756;
   @ObfuscatedName("ao")
   int field2753;
   @ObfuscatedName("al")
   int field2752;
   @ObfuscatedName("aj")
   short[][][] field2759;
   @ObfuscatedName("ay")
   byte[][][] field2757;
   @ObfuscatedName("au")
   boolean field2749;
   @ObfuscatedSignature(descriptor = "[[[[Lhz;")
   @ObfuscatedName("ad")
   classHZ[][][][] field2760;
   @ObfuscatedName("ap")
   boolean field2748 = false;
   @ObfuscatedName("ag")
   short[][][] field2758;

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("ar")
   void method5962(classXY var1, byte var2) {
      try {
         if (var1 != null) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.vmethod467(var1, -1811901292);
            this.field2748 = true;
            this.field2749 = true;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ha.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;B)V")
   @ObfuscatedName("ak")
   void method5971(int var1, int var2, classXY var3, byte var4) {
      try {
         int var5 = classXY.method13039(var3, -346779531);
         if (0 == var5) {
            if (var4 < 33) {
               ;
            }
         } else {
            if ((var5 & 1) != 0) {
               if (var4 >= 33) {
                  throw new IllegalStateException();
               }

               method5976(this, var1, var2, var3, var5, (byte)59);
            } else {
               this.method5979(var1, var2, var3, var5, (byte)5);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ha.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   int method5983(byte var1) {
      try {
         return this.field2751 * 1151970023;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;IB)V")
   @ObfuscatedName("at")
   void method5979(int var1, int var2, classXY var3, int var4, byte var5) {
      try {
         int var6 = ((var4 & 24) >> 3) + 1;
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if (0 != (var4 & 4)) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.field2758[0][var1][var2] = (short)classXY.method13047(var3, 130975000);
         if (var7) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            int var9 = classXY.method13039(var3, -346779531);

            for (int var10 = 0; var10 < var9; var10++) {
               if (var5 == 1) {
                  return;
               }

               int var11 = classXY.method13047(var3, 1858909979);
               if (var11 != 0) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  this.field2759[var10][var1][var2] = (short)var11;
                  int var12 = classXY.method13039(var3, -346779531);
                  this.field2757[var10][var1][var2] = (byte)(var12 >> 2);
                  this.field2756[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if (var8) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            for (int var16 = 0; var16 < var6; var16++) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               int var17 = classXY.method13039(var3, -346779531);
               if (0 == var17) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  classHZ[] var18 = this.field2760[var16][var1][var2] = new classHZ[var17];

                  for (int var19 = 0; var19 < var17; var19++) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     int var13 = var3.method13117(classXM.field6889.field6890, 1767541666);
                     int var14 = classXY.method13039(var3, -346779531);
                     var18[var19] = new classHZ(var13, var14 >> 2, var14 & 3);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "ha.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method5967() {
      this.field2758 = (short[][][])null;
      this.field2759 = (short[][][])null;
      this.field2757 = (byte[][][])null;
      this.field2756 = (byte[][][])null;
      this.field2760 = (classHZ[][][][])null;
      this.field2748 = false;
      this.field2749 = false;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String method5954(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                  var2++;
               }

               StringBuilder var5 = new StringBuilder(var2);

               while (var0 != 0L) {
                  long var6 = var0;
                  var0 /= 37L;
                  var5.append(classOB.field4808[(int)(var6 - var0 * 37L)]);
               }

               return var5.reverse().toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ha.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   int method5985() {
      return -456391909 * this.field2750;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   abstract void vmethod466(classXY var1);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ah")
   boolean method5956() {
      return this.field2748 && this.field2749;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lha;IILxy;I)V")
   @ObfuscatedName("ds")
   public static void method5980(classHA var0, int var1, int var2, classXY var3, int var4) {
      if (var0 == null) {
         var0.method5973(var1, var1, var3);
      } else {
         int var5 = ((var4 & 24) >> 3) + 1;
         boolean var6 = 0 != (var4 & 2);
         boolean var7 = 0 != (var4 & 4);
         var0.field2758[0][var1][var2] = (short)classXY.method13047(var3, -509588321);
         if (var6) {
            int var8 = classXY.method13039(var3, -346779531);

            for (int var9 = 0; var9 < var8; var9++) {
               int var10 = classXY.method13047(var3, 1101615544);
               if (var10 != 0) {
                  var0.field2759[var9][var1][var2] = (short)var10;
                  int var11 = classXY.method13039(var3, -346779531);
                  var0.field2757[var9][var1][var2] = (byte)(var11 >> 2);
                  var0.field2756[var9][var1][var2] = (byte)(var11 & 3);
               }
            }
         }

         if (var7) {
            for (int var14 = 0; var14 < var5; var14++) {
               int var15 = classXY.method13039(var3, -346779531);
               if (0 != var15) {
                  classHZ[] var16 = var0.field2760[var14][var1][var2] = new classHZ[var15];

                  for (int var17 = 0; var17 < var15; var17++) {
                     int var12 = var3.method13117(classXM.field6889.field6890, 1448250251);
                     int var13 = classXY.method13039(var3, -346779531);
                     var16[var17] = new classHZ(var12, var13 >> 2, var13 & 3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;B)V")
   @ObfuscatedName("ff")
   public static void method5968(classHA var0, byte var1) {
      if (var0 == null) {
         var0.method5970(var1);
      } else {
         try {
            var0.field2758 = (short[][][])null;
            var0.field2759 = (short[][][])null;
            var0.field2757 = (byte[][][])null;
            var0.field2756 = (byte[][][])null;
            var0.field2760 = (classHZ[][][][])null;
            var0.field2748 = false;
            var0.field2749 = false;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ha.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   boolean method5957() {
      return this.field2748 && this.field2749;
   }

   @ObfuscatedSignature(descriptor = "(Lha;B)I")
   @ObfuscatedName("uo")
   public static int method5986(classHA var0, byte var1) {
      if (var0 == null) {
         var0.method5987(var1);
      }

      try {
         return -456391909 * var0.field2750;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   boolean method5958() {
      return this.field2748 && this.field2749;
   }

   classHA() {
      this.field2749 = false;
      new LinkedList();
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("bp")
   void method5963(classXY var1) {
      if (var1 != null) {
         this.vmethod467(var1, -1811901292);
         this.field2748 = true;
         this.field2749 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("bm")
   void method5964(classXY var1) {
      if (var1 != null) {
         this.vmethod467(var1, -1811901292);
         this.field2748 = true;
         this.field2749 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("by")
   int method5984() {
      return this.field2751 * 1522518828;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   public static int method5955(int var0, int var1) {
      try {
         return var0 >> 14 & 1023;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method5969() {
      this.field2758 = (short[][][])null;
      this.field2759 = (short[][][])null;
      this.field2757 = (byte[][][])null;
      this.field2756 = (byte[][][])null;
      this.field2760 = (classHZ[][][][])null;
      this.field2748 = false;
      this.field2749 = false;
   }

   @ObfuscatedSignature(descriptor = "(IILxy;)V")
   @ObfuscatedName("bo")
   void method5972(int var1, int var2, classXY var3) {
      int var4 = classXY.method13039(var3, -346779531);
      if (0 != var4) {
         if ((var4 & 1) != 0) {
            method5976(this, var1, var2, var3, var4, (byte)26);
         } else {
            this.method5979(var1, var2, var3, var4, (byte)-27);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;)V")
   @ObfuscatedName("bu")
   void method5973(int var1, int var2, classXY var3) {
      int var4 = classXY.method13039(var3, -346779531);
      if (0 != var4) {
         if ((var4 & 1) != 0) {
            method5976(this, var1, var2, var3, var4, (byte)-78);
         } else {
            this.method5979(var1, var2, var3, var4, (byte)43);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;B)Z")
   @ObfuscatedName("ch")
   public static boolean method5959(classHA var0, byte var1) {
      if (var0 == null) {
         var0.method5961(var1);
      }

      try {
         boolean var10000;
         if (var0.field2748 && var0.field2749) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;)V")
   @ObfuscatedName("ba")
   void method5974(int var1, int var2, classXY var3) {
      int var4 = classXY.method13039(var3, -346779531);
      if (0 != var4) {
         if ((var4 & 1) != 0) {
            method5976(this, var1, var2, var3, var4, (byte)-46);
         } else {
            this.method5979(var1, var2, var3, var4, (byte)-37);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   abstract void vmethod467(classXY var1, int var2);

   @ObfuscatedSignature(descriptor = "(IILxy;I)V")
   @ObfuscatedName("bw")
   void method5975(int var1, int var2, classXY var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.field2759[0][var1][var2] = (short)classXY.method13047(var3, 369527776);
      }

      this.field2758[0][var1][var2] = (short)classXY.method13047(var3, -1809869849);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   boolean method5960() {
      return this.field2748 && this.field2749;
   }

   @ObfuscatedSignature(descriptor = "(Lha;IILxy;IB)V")
   @ObfuscatedName("zs")
   public static void method5976(classHA var0, int var1, int var2, classXY var3, int var4, byte var5) {
      if (var0 == null) {
         var0.method5978(var1, var1, var3, var1, var5);
      }

      try {
         boolean var10000;
         if ((var4 & 2) != 0) {
            if (var5 == -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         if (var6) {
            if (var5 == -1) {
               throw new IllegalStateException();
            }

            var0.field2759[0][var1][var2] = (short)classXY.method13047(var3, 221517528);
         }

         var0.field2758[0][var1][var2] = (short)classXY.method13047(var3, 1753846269);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ha.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   abstract void vmethod468(classXY var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lha;Lxy;)V")
   @ObfuscatedName("dp")
   public static void method5965(classHA var0, classXY var1) {
      if (var0 == null) {
         var0.method5960();
      }

      if (var1 != null) {
         var0.vmethod467(var1, -1811901292);
         var0.field2748 = true;
         var0.field2749 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;I)V")
   @ObfuscatedName("bi")
   void method5977(int var1, int var2, classXY var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.field2759[0][var1][var2] = (short)classXY.method13047(var3, 1702094832);
      }

      this.field2758[0][var1][var2] = (short)classXY.method13047(var3, -1733085897);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("bt")
   void method5966(classXY var1) {
      if (var1 != null) {
         this.vmethod467(var1, -1811901292);
         this.field2748 = true;
         this.field2749 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BIIIIB)V")
   @ObfuscatedName("ab")
   static final void method5982(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if (var0.field1687 != null) {
            if (var6 == -1) {
               throw new IllegalStateException();
            }

            for (int var7 = 0; var7 < 4; var7++) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               CollisionMap var8 = var0.field1687[var7];

               for (int var9 = var2; var9 < 64 + var2; var9++) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  for (int var10 = var3; var10 < 64 + var3; var10++) {
                     if (var6 == -1) {
                        return;
                     }

                     if (var8.method5344(var9, var10, (byte)-108)) {
                        if (var6 == -1) {
                           return;
                        }

                        var8.method5340(var9, var10, 1073741824, -2134326968);
                     }
                  }
               }
            }
         }

         classXY var14 = new classXY(var1);

         for (int var15 = 0; var15 < 4; var15++) {
            if (var6 == -1) {
               throw new IllegalStateException();
            }

            for (int var17 = 0; var17 < 64; var17++) {
               if (var6 == -1) {
                  return;
               }

               for (int var19 = 0; var19 < 64; var19++) {
                  int var11 = var2 + var17;
                  int var12 = var19 + var3;
                  classKG.method6474(var0, var14, var15, var11, var12, var4 + var11, var12 + var5, 0, 1872302919);
               }
            }
         }

         int var10000;
         if (702114061 * var14.field6955 < var14.field6954.length) {
            if (var6 == -1) {
               throw new IllegalStateException();
            }

            var10000 = classXY.method13039(var14, -346779531);
         } else {
            var10000 = 0;
         }

         int var16 = var10000;
         boolean var22;
         if ((var16 & 1) != 0) {
            if (var6 == -1) {
               throw new IllegalStateException();
            }

            var22 = true;
         } else {
            var22 = false;
         }

         boolean var18 = var22;
         if (var18) {
            if (var6 == -1) {
               throw new IllegalStateException();
            }

            for (int var20 = 0; var20 < 64; var20++) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               for (int var21 = 0; var21 < 64; var21++) {
                  if (var6 == -1) {
                     return;
                  }

                  classLF.method6780(var14, 1868266747);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "ha.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("fm")
   static final void method5989(double var0) {
      try {
         classFH.method4694(var0);
         ((TextureProvider)classFH.field2257.field2239).method3811(var0);
         if (client.field1125 != null) {
            client.field1125.method12448(-1405629956);
         }

         EvictingDualNodeHashTable.method6431(classOP.field5008);
         classAB.field122.method2759(var0);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.fm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bu")
   static final void method5988(int var0, int var1, int var2, int var3) {
      try {
         if (classKI.field3598 * -325062789 < var0) {
            if (var3 <= 851236585) {
               throw new IllegalStateException();
            }

            classKI.field3598 = classKI.field3598
               + (classCV.field1303 * 528799137 + classHE.field2780 * 93292033 * (var0 - classKI.field3598 * -325062789) / 1000) * -1197566029;
            if (-325062789 * classKI.field3598 > var0) {
               classKI.field3598 = var0 * -1197566029;
            }
         }

         if (-325062789 * classKI.field3598 > var0) {
            classKI.field3598 = classKI.field3598
               - -1197566029 * ((-325062789 * classKI.field3598 - var0) * 93292033 * classHE.field2780 / 1000 + classCV.field1303 * 528799137);
            if (-325062789 * classKI.field3598 < var0) {
               classKI.field3598 = -1197566029 * var0;
            }
         }

         if (1615527037 * classNL.field4684 < var1) {
            if (var3 <= 851236585) {
               throw new IllegalStateException();
            }

            classNL.field4684 = classNL.field4684
               + ((var1 - classNL.field4684 * 1615527037) * classHE.field2780 * 93292033 / 1000 + 528799137 * classCV.field1303) * -477405995;
            if (1615527037 * classNL.field4684 > var1) {
               if (var3 <= 851236585) {
                  throw new IllegalStateException();
               }

               classNL.field4684 = var1 * -477405995;
            }
         }

         if (1615527037 * classNL.field4684 > var1) {
            if (var3 <= 851236585) {
               throw new IllegalStateException();
            }

            classNL.field4684 = classNL.field4684
               - -477405995 * ((1615527037 * classNL.field4684 - var1) * 93292033 * classHE.field2780 / 1000 + classCV.field1303 * 528799137);
            if (classNL.field4684 * 1615527037 < var1) {
               if (var3 <= 851236585) {
                  return;
               }

               classNL.field4684 = var1 * -477405995;
            }
         }

         if (1343311673 * classAI.field167 < var2) {
            if (var3 <= 851236585) {
               throw new IllegalStateException();
            }

            classAI.field167 = classAI.field167
               + (528799137 * classCV.field1303 + classHE.field2780 * 93292033 * (var2 - 1343311673 * classAI.field167) / 1000) * -337711351;
            if (classAI.field167 * 1343311673 > var2) {
               if (var3 <= 851236585) {
                  throw new IllegalStateException();
               }

               classAI.field167 = var2 * -337711351;
            }
         }

         if (1343311673 * classAI.field167 > var2) {
            if (var3 <= 851236585) {
               throw new IllegalStateException();
            }

            classAI.field167 = classAI.field167
               - (528799137 * classCV.field1303 + 93292033 * classHE.field2780 * (1343311673 * classAI.field167 - var2) / 1000) * -337711351;
            if (classAI.field167 * 1343311673 < var2) {
               if (var3 <= 851236585) {
                  throw new IllegalStateException();
               }

               classAI.field167 = -337711351 * var2;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ha.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lcu;")
   @ObfuscatedName("ag")
   static classCU[] method5953(byte var0) {
      try {
         return new classCU[]{classCU.field1286, classCU.field1289, classCU.field1290, classCU.field1287, classCU.field1288};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ha.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;I)V")
   @ObfuscatedName("bb")
   void method5981(int var1, int var2, classXY var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = 0 != (var4 & 2);
      boolean var7 = 0 != (var4 & 4);
      this.field2758[0][var1][var2] = (short)classXY.method13047(var3, 1340774430);
      if (var6) {
         int var8 = classXY.method13039(var3, -346779531);

         for (int var9 = 0; var9 < var8; var9++) {
            int var10 = classXY.method13047(var3, -550142747);
            if (var10 != 0) {
               this.field2759[var9][var1][var2] = (short)var10;
               int var11 = classXY.method13039(var3, -346779531);
               this.field2757[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2756[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for (int var14 = 0; var14 < var5; var14++) {
            int var15 = classXY.method13039(var3, -346779531);
            if (0 != var15) {
               classHZ[] var16 = this.field2760[var14][var1][var2] = new classHZ[var15];

               for (int var17 = 0; var17 < var15; var17++) {
                  int var12 = var3.method13117(classXM.field6889.field6890, 1524934831);
                  int var13 = classXY.method13039(var3, -346779531);
                  var16[var17] = new classHZ(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ai")
   boolean method5961(byte var1) {
      try {
         boolean var10000;
         if (this.field2749 && this.field2749) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void method5970(byte var1) {
      try {
         this.field2758 = (short[][][])null;
         this.field2759 = (short[][][])null;
         this.field2757 = (byte[][][])null;
         this.field2757 = (byte[][][])null;
         this.field2760 = (classHZ[][][][])null;
         this.field2749 = false;
         this.field2749 = false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("am")
   int method5987(byte var1) {
      try {
         return -456391909 * this.field2752;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ha.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxy;IB)V")
   @ObfuscatedName("av")
   void method5978(int var1, int var2, classXY var3, int var4, byte var5) {
      try {
         boolean var10000;
         if ((var4 & 2) != 0) {
            if (var5 == -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         if (var6) {
            if (var5 == -1) {
               throw new IllegalStateException();
            }

            this.field2759[0][var1][var2] = (short)classXY.method13047(var3, 221517528);
         }

         this.field2759[0][var1][var2] = (short)classXY.method13047(var3, 1753846269);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ha.av(" + ')');
      }
   }
}
