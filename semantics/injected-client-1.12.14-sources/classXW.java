import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xw")
public class classXW {
   @ObfuscatedName("an")
   int field6641;
   @ObfuscatedName("ap")
   int field6642;
   @ObfuscatedName("ae")
   int field6636;
   @ObfuscatedName("aj")
   int field6639;
   @ObfuscatedName("at")
   int field6643;
   @ObfuscatedName("au")
   int field6644;
   @ObfuscatedName("az")
   int field6645;
   @ObfuscatedName("ad")
   int field6633 = 0;
   @ObfuscatedName("aw")
   int field6634 = 0;
   @ObfuscatedName("ay")
   boolean field6646;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final float field6635 = 0.9F;
   @ObfuscatedName("ai")
   int field6638;
   @ObfuscatedName("ag")
   int field6637;
   @ObfuscatedName("ak")
   int field6640;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxw;IIIIIIIIZ)V")
   @ObfuscatedName("gs")
   public static void method12727(classXW var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0 == null) {
         var0.method12734(var1, var1, var1, var1);
      }

      var0.field6642 = 1089091791 * var1;
      var0.field6636 = var2 * -428826360;
      var0.field6645 = -1469291107 * var3;
      var0.field6643 = var4 * -2080427979;
      var0.field6644 = -428379703 * var5;
      var0.field6637 = -636930199 * var6;
      var0.field6633 = var7 * 508148993;
      var0.field6634 = var8 * -1452717397;
      var0.field6646 = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZB)V")
   @ObfuscatedName("av")
   public void method12728(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, byte var10) {
      try {
         this.field6642 = 1089091791 * var1;
         this.field6636 = var2 * 1380299537;
         this.field6645 = -908806167 * var3;
         this.field6643 = var4 * -2080427979;
         this.field6644 = -428379703 * var5;
         this.field6637 = -636930199 * var6;
         this.field6633 = var7 * 508148993;
         this.field6634 = var8 * -1452717397;
         this.field6646 = var9;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "xw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;Lsu;B)V")
   @ObfuscatedName("ag")
   public void method12738(classSF var1, Font var2, byte var3) {
      try {
         if (null == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = var2.ascent;
            int var5 = Math.min(805216797 * this.field6643, (int)(var4 * 0.9F));
            int var6 = classSF.method10231(var1, -365850535 * this.field6645, (byte)-71);
            int var7 = var1.method10234(805216797 * this.field6643, -1532963950);
            int var8 = var6 + (this.field6642 * 1080544815 - 1695381625 * this.field6644);
            int var9 = var7 + (this.field6636 * 1921097201 - 1559677145 * this.field6637) + var4;
            Rasterizer2D.Rasterizer2D_setClip(
               this.field6642 * 1080544815,
               1921097201 * this.field6636,
               -365850535 * this.field6645 + 1080544815 * this.field6642,
               this.field6636 * 1921097201 + 805216797 * this.field6643
            );
            int var10 = 390881283 * this.field6634;
            int var11 = 306135809 * this.field6633;
            if (var10 > var11) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               int var12 = var10;
               var10 = var11;
               var11 = var12;
            }

            classSI var23 = classSF.method10155(var1, 0, var10, -1653331283);
            classSI var13 = classSF.method10155(var1, var10, var11, -1690181359);
            classSI var14 = classSF.method10155(var1, var11, var1.method10130(-319963431), -2093347082);
            classSI var15 = classSF.method10155(var1, 0, this.field6633 * 306135809, -2128687592);
            if (!classSI.method10281(var13, -2146475355)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               int var16 = var2.maxDescent + var2.maxAscent;

               for (int var17 = 0; var17 < var13.method10284((short)13211); var17++) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  class472 var18 = var13.method10302(var17, -1761261047);
                  int var19 = var8 + var18.field5868 * 1415121929;
                  int var20 = var2.charWidth(var18.field5869);
                  int var21 = -798824383 * var18.field5867 + var9 - var4;
                  Rasterizer2D.Rasterizer2D_fillRectangle(var19, var21, var20, var16, -1256935427 * this.field6640);
               }
            }

            if (!classSI.method10281(var23, -2146275325)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               AbstractFont.method10425(var2, var23, var8, var9, this.field6641 * 900951639, this.field6638 * 1874703679, -1);
            }

            if (!classSI.method10281(var13, -2146274803)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               AbstractFont.method10425(var2, var13, var8, var9, -546987219 * this.field6639, this.field6638 * 1874703679, -1);
            }

            if (!classSI.method10281(var14, -2146809717)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               AbstractFont.method10425(var2, var14, var8, var9, 900951639 * this.field6641, 1874703679 * this.field6638, -1);
            }

            if (this.field6646) {
               if (var3 >= 1) {
                  return;
               }

               classVP var24 = var15.method10301(726888077);
               int var25 = var8 + (Integer)var24.field6227;
               int var26 = var9 + (Integer)var24.field6228;
               int var27 = var26 - var5;
               Rasterizer2D.Rasterizer2D_drawLine(var25, var26, var25, var27, this.field6641 * 900951639);
               if (-1 != 1874703679 * this.field6638) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Rasterizer2D.Rasterizer2D_drawLine(1 + var25, var26 + 1, 1 + var25, 1 + var27, this.field6638 * 1874703679);
               }
            }
         }
      } catch (RuntimeException var22) {
         throw RestClientThreadFactory.newRunException(var22, "xw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;Lsu;)V")
   @ObfuscatedName("au")
   public void method12739(classSF var1, Font var2) {
      if (null != var2) {
         int var3 = var2.ascent;
         int var4 = Math.min(805216797 * this.field6643, (int)(var3 * 0.9F));
         int var5 = classSF.method10231(var1, -365850535 * this.field6645, (byte)-49);
         int var6 = var1.method10234(805216797 * this.field6643, -168165097);
         int var7 = var5 + (this.field6642 * 1080544815 - 1695381625 * this.field6644);
         int var8 = var6 + (this.field6636 * 1921097201 - 1559677145 * this.field6637) + var3;
         Rasterizer2D.Rasterizer2D_setClip(
            this.field6642 * 1080544815,
            1921097201 * this.field6636,
            -365850535 * this.field6645 + 1080544815 * this.field6642,
            this.field6636 * 1921097201 + 805216797 * this.field6643
         );
         int var9 = 390881283 * this.field6634;
         int var10 = 306135809 * this.field6633;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         classSI var21 = classSF.method10155(var1, 0, var9, -1816430284);
         classSI var12 = classSF.method10155(var1, var9, var10, -1923398645);
         classSI var13 = classSF.method10155(var1, var10, var1.method10130(-1036021520), -1839261727);
         classSI var14 = classSF.method10155(var1, 0, this.field6633 * 306135809, -1965232168);
         if (!classSI.method10281(var12, -2146451705)) {
            int var15 = var2.maxDescent + var2.maxAscent;

            for (int var16 = 0; var16 < var12.method10284((short)12902); var16++) {
               class472 var17 = var12.method10302(var16, 1020751002);
               int var18 = var7 + var17.field5868 * 1415121929;
               int var19 = var2.charWidth(var17.field5869);
               int var20 = -798824383 * var17.field5867 + var8 - var3;
               Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, -1256935427 * this.field6640);
            }
         }

         if (!classSI.method10281(var21, -2147410701)) {
            AbstractFont.method10425(var2, var21, var7, var8, this.field6641 * 900951639, this.field6638 * 1874703679, -1);
         }

         if (!classSI.method10281(var12, -2146640310)) {
            AbstractFont.method10425(var2, var12, var7, var8, -546987219 * this.field6639, this.field6638 * 1874703679, -1);
         }

         if (!classSI.method10281(var13, -2146020078)) {
            AbstractFont.method10425(var2, var13, var7, var8, 900951639 * this.field6641, 1874703679 * this.field6638, -1);
         }

         if (this.field6646) {
            classVP var22 = var14.method10301(726888077);
            int var23 = var7 + (Integer)var22.field6227;
            int var24 = var8 + (Integer)var22.field6228;
            int var25 = var24 - var4;
            Rasterizer2D.Rasterizer2D_drawLine(var23, var24, var23, var25, this.field6641 * 900951639);
            if (-1 != 1874703679 * this.field6638) {
               Rasterizer2D.Rasterizer2D_drawLine(1 + var23, var24 + 1, 1 + var23, 1 + var25, this.field6638 * 1874703679);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxw;IIIII)V")
   @ObfuscatedName("du")
   public static void method12732(classXW var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method12737(var1, var1, var1, var1, var1);
      } else {
         try {
            var0.field6641 = var1 * -764453529;
            var0.field6638 = var2 * -457524545;
            var0.field6639 = -806771547 * var3;
            var0.field6640 = -15063723 * var4;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "xw.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("aj")
   public void method12729(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field6642 = 1089091791 * var1;
      this.field6636 = var2 * 1380299537;
      this.field6645 = -908806167 * var3;
      this.field6643 = var4 * -2080427979;
      this.field6644 = -428379703 * var5;
      this.field6637 = -636930199 * var6;
      this.field6633 = var7 * 508148993;
      this.field6634 = var8 * -1452717397;
      this.field6646 = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("ae")
   public void method12730(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field6642 = 1089091791 * var1;
      this.field6636 = var2 * 1380299537;
      this.field6645 = -908806167 * var3;
      this.field6643 = var4 * -2080427979;
      this.field6644 = -428379703 * var5;
      this.field6637 = -636930199 * var6;
      this.field6633 = var7 * 508148993;
      this.field6634 = var8 * -1452717397;
      this.field6646 = var9;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnf;Lqm;IIIZ)V")
   @ObfuscatedName("kp")
   public static void method12731(MidiRequest var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == null) {
         var0.method7741(var1, var2, var2, var2, var5);
      } else {
         var0.musicTrackArchive = var1;
         var0.musicTrackGroupId = var2 * -1577518513;
         var0.musicTrackFileId = 197411381 * var3;
         var0.musicTrackVolume = var4 * -1589930535;
         var0.musicTrackBoolean = var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ak")
   public void method12733(int var1, int var2, int var3, int var4) {
      this.field6641 = var1 * -764453529;
      this.field6638 = var2 * -457524545;
      this.field6639 = -806771547 * var3;
      this.field6640 = -15063723 * var4;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ap")
   public void method12734(int var1, int var2, int var3, int var4) {
      this.field6641 = var1 * -764453529;
      this.field6638 = var2 * -457524545;
      this.field6639 = -806771547 * var3;
      this.field6640 = -15063723 * var4;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ay")
   public void method12735(int var1, int var2, int var3, int var4) {
      this.field6641 = var1 * -764453529;
      this.field6638 = var2 * 1858156546;
      this.field6639 = -456879827 * var3;
      this.field6640 = -15063723 * var4;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aw")
   public void method12736(int var1, int var2, int var3, int var4) {
      this.field6641 = var1 * -764453529;
      this.field6638 = var2 * -457524545;
      this.field6639 = -806771547 * var3;
      this.field6640 = -15063723 * var4;
   }

   @ObfuscatedSignature(descriptor = "(Lsf;Lsu;)V")
   @ObfuscatedName("az")
   public void method12740(classSF var1, Font var2) {
      if (null != var2) {
         int var3 = var2.ascent;
         int var4 = Math.min(483461655 * this.field6643, (int)(var3 * 0.9F));
         int var5 = classSF.method10231(var1, -365850535 * this.field6645, (byte)-99);
         int var6 = var1.method10234(1263544983 * this.field6643, -615429790);
         int var7 = var5 + (this.field6642 * 1080544815 - 1695381625 * this.field6644);
         int var8 = var6 + (this.field6636 * 1921097201 - 1886702639 * this.field6637) + var3;
         Rasterizer2D.Rasterizer2D_setClip(
            this.field6642 * -2037622316,
            1921097201 * this.field6636,
            -365850535 * this.field6645 + 1080544815 * this.field6642,
            this.field6636 * 929514341 + 805216797 * this.field6643
         );
         int var9 = 878719517 * this.field6634;
         int var10 = 306135809 * this.field6633;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         classSI var21 = classSF.method10155(var1, 0, var9, -1654387901);
         classSI var12 = classSF.method10155(var1, var9, var10, -1651319736);
         classSI var13 = classSF.method10155(var1, var10, var1.method10130(-820422979), -1964112306);
         classSI var14 = classSF.method10155(var1, 0, this.field6633 * 306135809, -1885120849);
         if (!classSI.method10281(var12, -2146038034)) {
            int var15 = var2.maxDescent + var2.maxAscent;

            for (int var16 = 0; var16 < var12.method10284((short)-4372); var16++) {
               class472 var17 = var12.method10302(var16, -2022763600);
               int var18 = var7 + var17.field5868 * 1415121929;
               int var19 = var2.charWidth(var17.field5869);
               int var20 = 1200403689 * var17.field5867 + var8 - var3;
               Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, -2074433377 * this.field6640);
            }
         }

         if (!classSI.method10281(var21, -2147419101)) {
            AbstractFont.method10425(var2, var21, var7, var8, this.field6641 * -176809688, this.field6638 * 1874703679, -1);
         }

         if (!classSI.method10281(var12, -2145923461)) {
            AbstractFont.method10425(var2, var12, var7, var8, -546987219 * this.field6639, this.field6638 * 608706195, -1);
         }

         if (!classSI.method10281(var13, -2146626737)) {
            AbstractFont.method10425(var2, var13, var7, var8, -171805917 * this.field6641, 1148224512 * this.field6638, -1);
         }

         if (this.field6646) {
            classVP var22 = var14.method10301(726888077);
            int var23 = var7 + (Integer)var22.field6227;
            int var24 = var8 + (Integer)var22.field6228;
            int var25 = var24 - var4;
            Rasterizer2D.Rasterizer2D_drawLine(var23, var24, var23, var25, this.field6641 * 900951639);
            if (-1 != -1965611351 * this.field6638) {
               Rasterizer2D.Rasterizer2D_drawLine(1 + var23, var24 + 1, 1 + var23, 1 + var25, this.field6638 * 1874703679);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("at")
   public void method12737(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field6634 = var1 * -764453529;
         this.field6643 = var2 * -457524545;
         this.field6640 = -806771547 * var3;
         this.field6642 = -15063723 * var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xw.at(" + ')');
      }
   }
}
