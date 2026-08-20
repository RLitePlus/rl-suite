import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zx")
public class classZX {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7294 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field7292 = 3.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7293 = 6;
   @ObfuscatedName("ag")
   final HashMap field7288 = new HashMap();
   @ObfuscatedSignature(descriptor = "Luq;")
   @ObfuscatedName("as")
   classUQ field7287 = new classUQ(0, 0);
   @ObfuscatedName("ax")
   int[] field7289 = new int[2048];
   @ToRemove(unused = "true")
   @ObfuscatedName("cs")
   static final int field7295 = 83;
   @ObfuscatedName("aa")
   int field7290;
   @ObfuscatedName("ac")
   int[] field7291 = new int[2048];

   @ObfuscatedSignature(descriptor = "(IILym;F)V")
   @ObfuscatedName("ap")
   public final void method14227(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method14219(var5, -339174694);
      int var7 = 1 + 2 * var5;
      classUQ var8 = new classUQ(0, 0, var3.field7007, var3.field7009);
      classUQ var9 = new classUQ(0, 0);
      this.field7287.method11472(var7, var7, -1647031174);
      System.nanoTime();

      for (int var10 = 0; var10 < this.field7290 * -1366011121; var10++) {
         int var11 = this.field7289[var10];
         int var12 = this.field7291[var10];
         int var13 = (int)((var11 - var1) * var4) - var5;
         int var14 = (int)(var3.field7009 - (var12 - var2) * var4) - var5;
         this.field7287.method11470(var13, var14, (byte)18);
         this.field7287.method11484(var8, var9, 1312925182);
         this.method14232(var6, var3, var9, (byte)103);
      }

      System.nanoTime();
      System.nanoTime();

      for (int var15 = 0; var15 < var3.field7005.length; var15++) {
         if (var3.field7005[var15] == 0) {
            var3.field7005[var15] = -16777216;
         } else {
            int var16 = (var3.field7005[var15] + 64 - 1) / 256;
            if (var16 <= 0) {
               var3.field7005[var15] = -16777216;
            } else {
               if (var16 > classDR.field1613.length) {
                  var16 = classDR.field1613.length;
               }

               int var17 = classDR.field1613[var16 - 1];
               var3.field7005[var15] = 0xFF000000 | var17;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   void method14216(int var1, int var2) {
      try {
         int var3 = 1 + 2 * var1;
         double[] var4 = classFW.method5046(0.0, var1 / 3.0F, var1, 224234046);
         double var5 = var4[var1] * var4[var1];
         int[] var7 = new int[var3 * var3];
         boolean var8 = false;

         for (int var9 = 0; var9 < var3; var9++) {
            if (var2 <= 1894137396) {
               throw new IllegalStateException();
            }

            for (int var10 = 0; var10 < var3; var10++) {
               int var11 = var7[var3 * var9 + var10] = (int)(var4[var10] * var4[var9] / var5 * 256.0);
               if (!var8 && var11 > 0) {
                  if (var2 <= 1894137396) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         SpritePixels var13 = new SpritePixels(var7, var3, var3);
         this.field7288.put(var1, var13);
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "zx.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public final void method14223() {
      this.field7290 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ab")
   public final void method14220(int var1, int var2, byte var3) {
      try {
         if (-1366011121 * this.field7290 >= this.field7289.length) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            this.field7289[this.field7290 * -1366011121] = var1;
            this.field7291[-1366011121 * this.field7290] = var2;
            this.field7290 += -578929681;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lym;Luq;B)V")
   @ObfuscatedName("ax")
   void method14232(SpritePixels var1, SpritePixels var2, classUQ var3, byte var4) {
      try {
         if (0 != var3.field6370 * 518523273) {
            if (var3.field6371 * -874893249 != 0) {
               int var5 = 0;
               int var6 = 0;
               if (0 == var3.field6368 * -1357616065) {
                  if (var4 == 5) {
                     throw new IllegalStateException();
                  }

                  var5 = var1.field7007 - 518523273 * var3.field6370;
               }

               if (926655743 * var3.field6369 == 0) {
                  if (var4 == 5) {
                     return;
                  }

                  var6 = var1.field7009 - -874893249 * var3.field6371;
               }

               int var7 = var5 + var1.field7007 * var6;
               int var8 = 926655743 * var3.field6369 * var2.field7007 + var3.field6368 * -1357616065;

               for (int var9 = 0; var9 < var3.field6371 * -874893249; var9++) {
                  for (int var10 = 0; var10 < var3.field6370 * 518523273; var10++) {
                     if (var4 == 5) {
                        return;
                     }

                     int var10001 = var8++;
                     var2.field7005[var10001] = var2.field7005[var10001] + var1.field7005[var7++];
                  }

                  var7 += var1.field7007 - 518523273 * var3.field6370;
                  var8 += var2.field7007 - 518523273 * var3.field6370;
               }

               return;
            }

            if (var4 == 5) {
               return;
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "zx.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzx;II)V")
   @ObfuscatedName("hh")
   public static void method14221(classZX var0, int var1, int var2) {
      if (var0 == null) {
         var0.method14219(var1, var1);
      }

      if (1706344020 * var0.field7290 < var0.field7289.length) {
         var0.field7289[var0.field7290 * -1366011121] = var1;
         var0.field7291[-1366011121 * var0.field7290] = var2;
         var0.field7290 += -296242497;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   static void method14215() {
      classDR.field1613 = new int[2000];
      int var0 = 0;
      int var1 = -378936223;

      for (byte var2 = 12; var0 < 16; var1 -= var2) {
         int var3 = classHS.method6100(var1 / 360.0F, 0.9999F, 0.075F + var0 * 0.425F / 16.0F);
         classDR.field1613[var0] = var3;
         var0++;
      }

      var1 = -2002516797;

      for (int var6 = var1 / 6; var0 < classDR.field1613.length; var1 -= var6) {
         int var7 = var0 * 2;

         for (int var4 = classHS.method6100(var1 / 360.0F, 0.9999F, 0.5); var0 < var7 && var0 < classDR.field1613.length; var0++) {
            classDR.field1613[var0] = var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzx;I)V")
   @ObfuscatedName("ge")
   public static void method14224(classZX var0, int var1) {
      if (var0 == null) {
         var0.method14226(var1);
      }

      try {
         var0.field7290 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ao")
   SpritePixels method14217(int var1) {
      if (!this.field7288.containsKey(var1)) {
         this.method14216(var1, 2069481781);
      }

      return (SpritePixels)this.field7288.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("aa")
   SpritePixels method14218(int var1) {
      if (!this.field7288.containsKey(var1)) {
         this.method14216(var1, 1897744987);
      }

      return (SpritePixels)this.field7288.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lym;Luq;)V")
   @ObfuscatedName("ar")
   void method14233(SpritePixels var1, SpritePixels var2, classUQ var3) {
      if (0 != var3.field6370 * 518523273 && var3.field6371 * -874893249 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == var3.field6368 * -1357616065) {
            var4 = var1.field7007 - 518523273 * var3.field6370;
         }

         if (926655743 * var3.field6369 == 0) {
            var5 = var1.field7009 - -874893249 * var3.field6371;
         }

         int var6 = var4 + var1.field7007 * var5;
         int var7 = 926655743 * var3.field6369 * var2.field7007 + var3.field6368 * -1357616065;

         for (int var8 = 0; var8 < var3.field6371 * -874893249; var8++) {
            for (int var9 = 0; var9 < var3.field6370 * 518523273; var9++) {
               int var10001 = var7++;
               var2.field7005[var10001] = var2.field7005[var10001] + var1.field7005[var6++];
            }

            var6 += var1.field7007 - 518523273 * var3.field6370;
            var7 += var2.field7007 - 518523273 * var3.field6370;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzx;II)V")
   @ObfuscatedName("hg")
   public static void method14222(classZX var0, int var1, int var2) {
      if (-1333235261 * var0.field7290 < var0.field7289.length) {
         var0.field7289[var0.field7290 * -1366011121] = var1;
         var0.field7291[2081724457 * var0.field7290] = var2;
         var0.field7290 += -578929681;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public final void method14225() {
      this.field7290 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IILym;F)V")
   @ObfuscatedName("au")
   public final void method14228(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method14219(var5, 473429035);
      int var7 = 1 + 2 * var5;
      classUQ var8 = new classUQ(0, 0, var3.field7007, var3.field7009);
      classUQ var9 = new classUQ(0, 0);
      this.field7287.method11472(var7, var7, -1017271496);
      System.nanoTime();

      for (int var10 = 0; var10 < this.field7290 * -1366011121; var10++) {
         int var11 = this.field7289[var10];
         int var12 = this.field7291[var10];
         int var13 = (int)((var11 - var1) * var4) - var5;
         int var14 = (int)(var3.field7009 - (var12 - var2) * var4) - var5;
         this.field7287.method11470(var13, var14, (byte)88);
         this.field7287.method11484(var8, var9, -1548234324);
         this.method14232(var6, var3, var9, (byte)37);
      }

      System.nanoTime();
      System.nanoTime();

      for (int var15 = 0; var15 < var3.field7005.length; var15++) {
         if (var3.field7005[var15] == 0) {
            var3.field7005[var15] = -16777216;
         } else {
            int var16 = (var3.field7005[var15] + 64 - 1) / 256;
            if (var16 <= 0) {
               var3.field7005[var15] = -16777216;
            } else {
               if (var16 > classDR.field1613.length) {
                  var16 = classDR.field1613.length;
               }

               int var17 = classDR.field1613[var16 - 1];
               var3.field7005[var15] = 0xFF000000 | var17;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedSignature(descriptor = "(IILym;F)V")
   @ObfuscatedName("ad")
   public final void method14229(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method14219(var5, 981780693);
      int var7 = 1 + 2 * var5;
      classUQ var8 = new classUQ(0, 0, var3.field7007, var3.field7009);
      classUQ var9 = new classUQ(0, 0);
      this.field7287.method11472(var7, var7, -1490701363);
      System.nanoTime();

      for (int var10 = 0; var10 < this.field7290 * -1366011121; var10++) {
         int var11 = this.field7289[var10];
         int var12 = this.field7291[var10];
         int var13 = (int)((var11 - var1) * var4) - var5;
         int var14 = (int)(var3.field7009 - (var12 - var2) * var4) - var5;
         this.field7287.method11470(var13, var14, (byte)67);
         this.field7287.method11484(var8, var9, 2079935131);
         this.method14232(var6, var3, var9, (byte)32);
      }

      System.nanoTime();
      System.nanoTime();

      for (int var15 = 0; var15 < var3.field7005.length; var15++) {
         if (var3.field7005[var15] == 0) {
            var3.field7005[var15] = -16777216;
         } else {
            int var16 = (var3.field7005[var15] + 64 - 1) / 256;
            if (var16 <= 0) {
               var3.field7005[var15] = 101263684;
            } else {
               if (var16 > classDR.field1613.length) {
                  var16 = classDR.field1613.length;
               }

               int var17 = classDR.field1613[var16 - 1];
               var3.field7005[var15] = 0xFF000000 | var17;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedSignature(descriptor = "(II)Lym;")
   @ObfuscatedName("ae")
   SpritePixels method14219(int var1, int var2) {
      try {
         if (!this.field7288.containsKey(var1)) {
            if (var2 <= -2122380289) {
               throw new IllegalStateException();
            }

            this.method14216(var1, 2107515615);
         }

         return (SpritePixels)this.field7288.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lym;Luq;)V")
   @ObfuscatedName("ai")
   void method14234(SpritePixels var1, SpritePixels var2, classUQ var3) {
      if (0 != var3.field6370 * 518523273 && var3.field6371 * -874893249 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == var3.field6368 * -1357616065) {
            var4 = var1.field7007 - 518523273 * var3.field6370;
         }

         if (926655743 * var3.field6369 == 0) {
            var5 = var1.field7009 - -874893249 * var3.field6371;
         }

         int var6 = var4 + var1.field7007 * var5;
         int var7 = 926655743 * var3.field6369 * var2.field7007 + var3.field6368 * -1357616065;

         for (int var8 = 0; var8 < var3.field6371 * -874893249; var8++) {
            for (int var9 = 0; var9 < var3.field6370 * 518523273; var9++) {
               int var10001 = var7++;
               var2.field7005[var10001] = var2.field7005[var10001] + var1.field7005[var6++];
            }

            var6 += var1.field7007 - 518523273 * var3.field6370;
            var7 += var2.field7007 - 518523273 * var3.field6370;
         }
      }
   }

   public classZX() {
      this.field7290 = 0;
      classRE.method9950((byte)-76);
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lym;Luq;)V")
   @ObfuscatedName("aw")
   void method14235(SpritePixels var1, SpritePixels var2, classUQ var3) {
      if (0 != var3.field6370 * 518523273 && var3.field6371 * -874893249 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (0 == var3.field6368 * -1247468175) {
            var4 = var1.field7007 - 518523273 * var3.field6370;
         }

         if (2126533639 * var3.field6369 == 0) {
            var5 = var1.field7009 - -1904036842 * var3.field6371;
         }

         int var6 = var4 + var1.field7007 * var5;
         int var7 = 926655743 * var3.field6369 * var2.field7007 + var3.field6368 * -1357616065;

         for (int var8 = 0; var8 < var3.field6371 * 1375341397; var8++) {
            for (int var9 = 0; var9 < var3.field6370 * 1039637675; var9++) {
               int var10001 = var7++;
               var2.field7005[var10001] = var2.field7005[var10001] + var1.field7005[var6++];
            }

            var6 += var1.field7007 - -1059343231 * var3.field6370;
            var7 += var2.field7007 - 518523273 * var3.field6370;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public final void method14226(int var1) {
      try {
         this.field7290 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzx;IILym;FI)V")
   @ObfuscatedName("ye")
   public static void method14230(classZX var0, int var1, int var2, SpritePixels var3, float var4, int var5) {
      if (var0 == null) {
         var0.method14231(var1, var1, var3, var4, var1);
      } else {
         try {
            int var6 = (int)(18.0F * var4);
            SpritePixels var7 = var0.method14219(var6, -1270092059);
            int var8 = 1 + 2 * var6;
            classUQ var9 = new classUQ(0, 0, var3.field7007, var3.field7009);
            classUQ var10 = new classUQ(0, 0);
            var0.field7287.method11472(var8, var8, -1722492525);
            System.nanoTime();

            for (int var11 = 0; var11 < var0.field7290 * -1366011121; var11++) {
               if (var5 >= 1016952715) {
                  throw new IllegalStateException();
               }

               int var12 = var0.field7289[var11];
               int var13 = var0.field7291[var11];
               int var14 = (int)((var12 - var1) * var4) - var6;
               int var15 = (int)(var3.field7009 - (var13 - var2) * var4) - var6;
               var0.field7287.method11470(var14, var15, (byte)61);
               var0.field7287.method11484(var9, var10, 732616358);
               var0.method14232(var7, var3, var10, (byte)-29);
            }

            System.nanoTime();
            System.nanoTime();

            for (int var17 = 0; var17 < var3.field7005.length; var17++) {
               if (var5 >= 1016952715) {
                  return;
               }

               if (var3.field7005[var17] == 0) {
                  if (var5 >= 1016952715) {
                     return;
                  }

                  var3.field7005[var17] = -16777216;
               } else {
                  int var18 = (var3.field7005[var17] + 64 - 1) / 256;
                  if (var18 <= 0) {
                     if (var5 >= 1016952715) {
                        throw new IllegalStateException();
                     }

                     var3.field7005[var17] = -16777216;
                  } else {
                     if (var18 > classDR.field1613.length) {
                        if (var5 >= 1016952715) {
                           return;
                        }

                        var18 = classDR.field1613.length;
                     }

                     int var19 = classDR.field1613[var18 - 1];
                     var3.field7005[var17] = 0xFF000000 | var19;
                  }
               }
            }

            System.nanoTime();
         } catch (RuntimeException var16) {
            throw classEG.newRunException(var16, "zx.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILym;FI)V")
   @ObfuscatedName("as")
   public final void method14231(int var1, int var2, SpritePixels var3, float var4, int var5) {
      try {
         int var6 = (int)(18.0F * var4);
         SpritePixels var7 = this.method14219(var6, -1270092059);
         int var8 = 1 + 2 * var6;
         classUQ var9 = new classUQ(0, 0, var3.field7007, var3.field7009);
         classUQ var10 = new classUQ(0, 0);
         this.field7287.method11472(var8, var8, -1722492525);
         System.nanoTime();

         for (int var11 = 0; var11 < this.field7290 * -1366011121; var11++) {
            if (var5 >= 1016952715) {
               throw new IllegalStateException();
            }

            int var12 = this.field7289[var11];
            int var13 = this.field7289[var11];
            int var14 = (int)((var12 - var1) * var4) - var6;
            int var15 = (int)(var3.field7007 - (var13 - var2) * var4) - var6;
            this.field7287.method11470(var14, var15, (byte)61);
            this.field7287.method11484(var9, var10, 732616358);
            this.method14232(var7, var3, var10, (byte)-29);
         }

         System.nanoTime();
         System.nanoTime();

         for (int var17 = 0; var17 < var3.field7005.length; var17++) {
            if (var5 >= 1016952715) {
               return;
            }

            if (var3.field7005[var17] == 0) {
               if (var5 >= 1016952715) {
                  return;
               }

               var3.field7005[var17] = -16777216;
            } else {
               int var18 = (var3.field7005[var17] + 64 - 1) / 256;
               if (var18 <= 0) {
                  if (var5 >= 1016952715) {
                     throw new IllegalStateException();
                  }

                  var3.field7005[var17] = -16777216;
               } else {
                  if (var18 > classDR.field1613.length) {
                     if (var5 >= 1016952715) {
                        return;
                     }

                     var18 = classDR.field1613.length;
                  }

                  int var19 = classDR.field1613[var18 - 1];
                  var3.field7005[var17] = 0xFF000000 | var19;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "zx.as(" + ')');
      }
   }
}
