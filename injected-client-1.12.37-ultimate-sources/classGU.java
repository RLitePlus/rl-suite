import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.api.worldmap.WorldMapRenderer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gu")
public final class classGU implements WorldMapRenderer {
   @ObfuscatedName("aq")
   int field2696;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("az")
   final classVA field2692;
   @ObfuscatedName("ae")
   final HashMap field2691;
   @ObfuscatedName("ab")
   public int field2686 = 0;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("dt")
   public static classVA field2702;
   @ObfuscatedName("as")
   boolean field2688;
   @ObfuscatedSignature(descriptor = "Lhy;")
   @ObfuscatedName("ax")
   classHY field2700;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("ac")
   classYM field2703;
   @ObfuscatedName("aa")
   HashMap field2701;
   @ObfuscatedSignature(descriptor = "[[Lgr;")
   @ObfuscatedName("ao")
   classGR[][] field2704;
   @ObfuscatedName("al")
   HashMap field2689;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   final classVA field2693;
   @ObfuscatedName("ay")
   int field2697;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("aj")
   classYZ[] field2690;
   @ObfuscatedName("ag")
   boolean field2687 = false;
   @ObfuscatedName("ad")
   int field2694;
   @ObfuscatedName("ap")
   int field2695;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   public static final int field2698 = 1048576;
   @ObfuscatedName("ov")
   static int field2699;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("bi")
   public static void method5762(classGU var0, int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (var0 == null) {
         var0.method5768(var1, var1, var1, var1, var5, var1, var1);
      } else if (null != var0.field2703) {
         var0.field2703.method13517(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (var0.field2701 == null) {
               var0.method5788(-872010912);
            }

            for (int var9 : var5) {
               List var10 = (List)var0.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4055 * 1870919123 - 578890711 * var0.field2697) * var3 / (var0.field2694 * 267148007);
                     int var14 = var4 - (819227381 * var12.field2769.field4056 - 1495779659 * var0.field2696) * var4 / (var0.field2695 * -1650580411);
                     classYW.method13689(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/HashMap;")
   @ObfuscatedName("bu")
   public HashMap method5784() {
      this.method5788(220642555);
      return this.field2701;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("ah")
   public List method5769(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field2687) {
         return var11;
      } else {
         classHO var12 = this.method5772(var1, var2, var3, var4, (byte)-98);
         float var13 = this.method5794(var7, var3 - var1, 516314222);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field2697 * -1123718443 + var1;
         int var16 = var2 + this.field2696 * -1618251080;

         for (int var17 = 1712138850 * var12.field2848; var17 < var12.field2850 * -1140526835 + var12.field2848 * 1839593044; var17++) {
            for (int var18 = -1577611892 * var12.field2847; var18 < var12.field2849 * -291263749 + 1017724415 * var12.field2847; var18++) {
               List var19 = classGR.method5728(
                  this.field2704[var17][var18],
                  var14 * (1830796483 * this.field2704[var17][var18].field2662 - var15) / -503839169 + var5,
                  var6 + var8 - (848595993 + (-1904267712 * this.field2704[var17][var18].field2656 - var16)) * var14 / 64,
                  var14,
                  var9,
                  var10,
                  -528898418
               );
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public final void method5753(byte var1) {
      try {
         this.field2701 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIB)V")
   @ObfuscatedName("ae")
   public final void method5755(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      try {
         int[] var10 = classYW.field7104;
         int var11 = classYW.field7102;
         int var12 = classYW.field7101;
         float[] var13 = classYW.field7103;
         int[] var14 = new int[4];
         classYW.method13675(var14);
         classHO var15 = this.method5772(var1, var2, var3, var4, (byte)-105);
         float var16 = this.method5794(var7 - var5, var3 - var1, -612588906);
         int var17 = (int)Math.ceil(var16);
         this.field2686 = -2144237939 * var17;
         if (!this.field2689.containsKey(var17)) {
            if (var9 == 74) {
               throw new IllegalStateException();
            }

            classHH var18 = new classHH(var17);
            classHH.method6022(var18, -2130910631);
            this.field2689.put(var17, var18);
         }

         int var26 = 1611441903 * var15.field2848 + -1140526835 * var15.field2850 - 1;
         int var19 = 1017724415 * var15.field2847 + var15.field2849 * 1143416267 - 1;

         for (int var20 = var15.field2848 * 1611441903; var20 <= var26; var20++) {
            for (int var21 = var15.field2847 * 1017724415; var21 <= var19; var21++) {
               if (var9 == 74) {
                  throw new IllegalStateException();
               }

               this.field2704[var20][var21]
                  .method5651(this.field2700, var17, (classHH)this.field2689.get(var17), this.field2690, this.field2693, this.field2692, 0.725);
            }
         }

         classFH.method4738(var10, var11, var12, var13);
         classYW.method13679(var14);
         int var27 = (int)(64.0F * var16);
         int var28 = this.field2697 * 578890711 + var1;
         int var22 = this.field2696 * 1495779659 + var2;

         for (int var23 = var15.field2848 * 1611441903; var23 < 1611441903 * var15.field2848 + -1140526835 * var15.field2850; var23++) {
            if (var9 == 74) {
               throw new IllegalStateException();
            }

            for (int var24 = 1017724415 * var15.field2847; var24 < var15.field2849 * 1143416267 + 1017724415 * var15.field2847; var24++) {
               classGR.method5619(
                  this.field2704[var23][var24],
                  var27 * (-929958720 * this.field2704[var23][var24].field2662 - var28) / 64 + var5,
                  var8 - (64 + (-1904267712 * this.field2704[var23][var24].field2656 - var22)) * var27 / 64,
                  var27,
                  (short)20619
               );
            }
         }
      } catch (RuntimeException var25) {
         throw classEG.method3884(var25, "gu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
   @ObfuscatedName("ab")
   public final void method5758(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      HashSet var9,
      HashSet var10,
      int var11,
      int var12,
      boolean var13,
      int var14
   ) {
      try {
         classHO var15 = this.method5772(var1, var2, var3, var4, (byte)18);
         float var16 = this.method5794(var7 - var5, var3 - var1, -614015564);
         int var17 = (int)(64.0F * var16);
         int var18 = 578890711 * this.field2697 + var1;
         int var19 = 1495779659 * this.field2696 + var2;

         for (int var20 = var15.field2848 * 1611441903; var20 < 1611441903 * var15.field2848 + -1140526835 * var15.field2850; var20++) {
            if (var14 <= 1267178816) {
               return;
            }

            for (int var21 = var15.field2847 * 1017724415; var21 < var15.field2847 * 1017724415 + var15.field2849 * 1143416267; var21++) {
               if (var14 <= 1267178816) {
                  throw new IllegalStateException();
               }

               if (var13) {
                  if (var14 <= 1267178816) {
                     return;
                  }

                  this.field2704[var20][var21].method5636(22341307);
               }

               this.field2704[var20][var21]
                  .method5653(
                     var17 * (this.field2704[var20][var21].field2662 * -929958720 - var18) / 64 + var5,
                     var8 - (64 + (this.field2704[var20][var21].field2656 * -1904267712 - var19)) * var17 / 64,
                     var17,
                     var9,
                     (byte)82
                  );
            }
         }

         if (null != var10) {
            if (var14 <= 1267178816) {
               throw new IllegalStateException();
            }

            if (var11 > 0) {
               if (var14 <= 1267178816) {
                  throw new IllegalStateException();
               }

               for (int var23 = 1611441903 * var15.field2848; var23 < -1140526835 * var15.field2850 + var15.field2848 * 1611441903; var23++) {
                  if (var14 <= 1267178816) {
                     throw new IllegalStateException();
                  }

                  for (int var24 = 1017724415 * var15.field2847; var24 < 1017724415 * var15.field2847 + var15.field2849 * 1143416267; var24++) {
                     if (var14 <= 1267178816) {
                        throw new IllegalStateException();
                     }

                     this.field2704[var23][var24].method5657(var10, var11, var12, (byte)-71);
                  }
               }
            }
         }
      } catch (RuntimeException var22) {
         throw classEG.method3884(var22, "gu.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;)Ljava/util/HashMap;")
   @ObfuscatedName("ch")
   public static HashMap method5785(classGU var0) {
      if (var0 == null) {
         var0.isLoaded();
      }

      var0.method5788(1900205134);
      return var0.field2701;
   }

   @ObfuscatedSignature(descriptor = "(III)F")
   @ObfuscatedName("aj")
   float method5794(int var1, int var2, int var3) {
      return classOE.field4843.method2452().getWorldMapZoom();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("as")
   public List method5770(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if (!this.field2687) {
            if (var11 != -903075137) {
               throw new IllegalStateException();
            } else {
               return var12;
            }
         } else {
            classHO var13 = this.method5772(var1, var2, var3, var4, (byte)-80);
            float var14 = this.method5794(var7, var3 - var1, 1829407144);
            int var15 = (int)(64.0F * var14);
            int var16 = this.field2697 * 578890711 + var1;
            int var17 = var2 + this.field2696 * 1495779659;

            for (int var18 = 1611441903 * var13.field2848; var18 < var13.field2850 * -1140526835 + var13.field2848 * 1611441903; var18++) {
               if (var11 != -903075137) {
                  throw new IllegalStateException();
               }

               for (int var19 = 1017724415 * var13.field2847; var19 < var13.field2849 * 1143416267 + 1017724415 * var13.field2847; var19++) {
                  if (var11 != -903075137) {
                     throw new IllegalStateException();
                  }

                  List var20 = classGR.method5728(
                     this.field2704[var18][var19],
                     var15 * (-929958720 * this.field2704[var18][var19].field2662 - var16) / 64 + var5,
                     var6 + var8 - (64 + (-1904267712 * this.field2704[var18][var19].field2656 - var17)) * var15 / 64,
                     var15,
                     var9,
                     var10,
                     567222009
                  );
                  if (!var20.isEmpty()) {
                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw classEG.method3884(var21, "gu.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)Lho;")
   @ObfuscatedName("ax")
   classHO method5772(int var1, int var2, int var3, int var4, byte var5) {
      try {
         classHO var6 = new classHO(this);
         int var7 = var1 + 578890711 * this.field2697;
         int var8 = this.field2696 * 1495779659 + var2;
         int var9 = this.field2697 * 578890711 + var3;
         int var10 = var4 + this.field2696 * 1495779659;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.field2850 = -173914683 * (1 + (var13 - var11));
         var6.field2849 = (var14 - var12 + 1) * 539285475;
         var6.field2848 = (var11 - this.field2700.method5871(1952700434)) * 1822509071;
         var6.field2847 = (var12 - classGX.method5880(this.field2700, (short)-15274)) * -531447297;
         if (1611441903 * var6.field2848 < 0) {
            if (var5 == 13) {
               throw new IllegalStateException();
            }

            var6.field2850 = var6.field2850 + -1325866773 * var6.field2848;
            var6.field2848 = 0;
         }

         if (var6.field2848 * 1611441903 > this.field2704.length - -1140526835 * var6.field2850) {
            if (var5 == 13) {
               throw new IllegalStateException();
            }

            var6.field2850 = -173914683 * (this.field2704.length - 1611441903 * var6.field2848);
         }

         if (var6.field2847 * 1017724415 < 0) {
            if (var5 == 13) {
               throw new IllegalStateException();
            }

            var6.field2849 = var6.field2849 + -2063654371 * var6.field2847;
            var6.field2847 = 0;
         }

         if (var6.field2847 * 1017724415 > this.field2704[0].length - 1143416267 * var6.field2849) {
            if (var5 == 13) {
               throw new IllegalStateException();
            }

            var6.field2849 = 539285475 * (this.field2704[0].length - var6.field2847 * 1017724415);
         }

         var6.field2850 = Math.min(var6.field2850 * -1140526835, this.field2704.length) * -173914683;
         var6.field2849 = Math.min(var6.field2849 * 1143416267, this.field2704[0].length) * 539285475;
         return var6;
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "gu.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;IIII)Lho;")
   @ObfuscatedName("za")
   public static classHO method5773(classGU var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5778();
      }

      classHO var5 = new classHO(var0);
      int var6 = var1 + 578890711 * var0.field2697;
      int var7 = var0.field2696 * 1495779659 + var2;
      int var8 = var0.field2697 * 578890711 + var3;
      int var9 = var4 + var0.field2696 * 1495779659;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field2850 = -173914683 * (1 + (var12 - var10));
      var5.field2849 = (var13 - var11 + 1) * 539285475;
      var5.field2848 = (var10 - var0.field2700.method5871(1898736470)) * 1822509071;
      var5.field2847 = (var11 - classGX.method5880(var0.field2700, (short)-30033)) * -531447297;
      if (1611441903 * var5.field2848 < 0) {
         var5.field2850 = var5.field2850 + -1325866773 * var5.field2848;
         var5.field2848 = 0;
      }

      if (var5.field2848 * 1611441903 > var0.field2704.length - -1140526835 * var5.field2850) {
         var5.field2850 = -173914683 * (var0.field2704.length - 1611441903 * var5.field2848);
      }

      if (var5.field2847 * 1017724415 < 0) {
         var5.field2849 = var5.field2849 + -2063654371 * var5.field2847;
         var5.field2847 = 0;
      }

      if (var5.field2847 * 1017724415 > var0.field2704[0].length - 1143416267 * var5.field2849) {
         var5.field2849 = 539285475 * (var0.field2704[0].length - var5.field2847 * 1017724415);
      }

      var5.field2850 = Math.min(var5.field2850 * -1140526835, var0.field2704.length) * -173914683;
      var5.field2849 = Math.min(var5.field2849 * 1143416267, var0.field2704[0].length) * 539285475;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ac")
   public boolean method5775(short var1) {
      try {
         return this.field2687;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gu.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgu;S)I")
   @ObfuscatedName("vb")
   public static int method5779(classGU var0, short var1) {
      if (var0 == null) {
         return var0.method5783(var1);
      } else {
         try {
            return var0.field2700.method5865((byte)125);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gu.aa(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method5796() {
      return this.field2696 * 1495779659;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("av")
   public void method5763(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2703) {
         this.field2703.method13517(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2701 == null) {
               this.method5788(-939861228);
            }

            for (int var9 : var5) {
               List var10 = (List)this.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4055 * 1870919123 - 578890711 * this.field2697) * var3 / (this.field2694 * 267148007);
                     int var14 = var4 - (819227381 * var12.field2769.field4056 - 1495779659 * this.field2696) * var4 / (this.field2695 * -1650580411);
                     classYW.method13689(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   public boolean method5776() {
      return this.field2687;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;IIB)V")
   @ObfuscatedName("ag")
   public void method5764(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, byte var8) {
      try {
         if (null == this.field2703) {
            if (var8 < 68) {
               ;
            }
         } else {
            this.field2703.method13517(var1, var2, var3, var4);
            if (var6 > 0) {
               if (var8 >= 68) {
                  throw new IllegalStateException();
               }

               if (var6 % var7 < var7 / 2) {
                  if (this.field2701 == null) {
                     if (var8 >= 68) {
                        throw new IllegalStateException();
                     }

                     this.method5788(2095858280);
                  }

                  Iterator var9 = var5.iterator();

                  while (var9.hasNext()) {
                     if (var8 >= 68) {
                        return;
                     }

                     int var10 = (Integer)var9.next();
                     List var11 = (List)this.field2701.get(var10);
                     if (null != var11) {
                        for (classHD var13 : var11) {
                           int var14 = (var13.field2769.field4055 * 1870919123 - 578890711 * this.field2697) * var3 / (this.field2694 * 267148007);
                           int var15 = var4 - (819227381 * var13.field2769.field4056 - 1495779659 * this.field2696) * var4 / (this.field2695 * -1650580411);
                           classYW.method13689(var14 + var1, var2 + var15, 2, 16776960, 256);
                        }
                     }
                  }

                  return;
               }

               if (var8 >= 68) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "gu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public final void method5754() {
      this.field2701 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/util/HashMap;")
   @ObfuscatedName("ao")
   public HashMap method5786(byte var1) {
      try {
         this.method5788(1258583780);
         return this.field2701;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gu.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ap")
   public final void method5756(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = classYW.field7104;
      int var10 = classYW.field7102;
      int var11 = classYW.field7101;
      float[] var12 = classYW.field7103;
      int[] var13 = new int[4];
      classYW.method13675(var13);
      classHO var14 = this.method5772(var1, var2, var3, var4, (byte)-119);
      float var15 = this.method5794(var7 - var5, var3 - var1, -592423871);
      int var16 = (int)Math.ceil(var15);
      this.field2686 = -2144237939 * var16;
      if (!this.field2689.containsKey(var16)) {
         classHH var17 = new classHH(var16);
         classHH.method6022(var17, -314372382);
         this.field2689.put(var16, var17);
      }

      int var24 = 1611441903 * var14.field2848 + 40083893 * var14.field2850 - 1;
      int var18 = 1017724415 * var14.field2847 + var14.field2849 * -806442778 - 1;

      for (int var19 = var14.field2848 * 1672560045; var19 <= var24; var19++) {
         for (int var20 = var14.field2847 * 1017724415; var20 <= var18; var20++) {
            this.field2704[var19][var20]
               .method5651(this.field2700, var16, (classHH)this.field2689.get(var16), this.field2690, this.field2693, this.field2692, 0.725);
         }
      }

      classFH.method4738(var9, var10, var11, var12);
      classYW.method13679(var13);
      int var25 = (int)(64.0F * var15);
      int var26 = this.field2697 * -1299182762 + var1;
      int var21 = this.field2696 * -691416362 + var2;

      for (int var22 = var14.field2848 * 953362541; var22 < 1611441903 * var14.field2848 + 696401303 * var14.field2850; var22++) {
         for (int var23 = 1017724415 * var14.field2847; var23 < var14.field2849 * 1143416267 + 1017724415 * var14.field2847; var23++) {
            classGR.method5619(
               this.field2704[var22][var23],
               var25 * (844658005 * this.field2704[var22][var23].field2662 - var26) / 698672914 + var5,
               var8 - (64 + (-1904267712 * this.field2704[var22][var23].field2656 - var21)) * var25 / -232763856,
               var25,
               (short)25123
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vx")
   public int method5797() {
      return this.field2697 * 578890711;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("au")
   public final void method5759(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13
   ) {
      classHO var14 = this.method5772(var1, var2, var3, var4, (byte)-53);
      float var15 = this.method5794(var7 - var5, var3 - var1, 102279281);
      int var16 = (int)(64.0F * var15);
      int var17 = 578890711 * this.field2697 + var1;
      int var18 = 1495779659 * this.field2696 + var2;

      for (int var19 = var14.field2848 * 1611441903; var19 < 1611441903 * var14.field2848 + -1140526835 * var14.field2850; var19++) {
         for (int var20 = var14.field2847 * 1017724415; var20 < var14.field2847 * 1017724415 + var14.field2849 * 1143416267; var20++) {
            if (var13) {
               this.field2704[var19][var20].method5636(-1692584648);
            }

            this.field2704[var19][var20]
               .method5653(
                  var16 * (this.field2704[var19][var20].field2662 * -929958720 - var17) / 64 + var5,
                  var8 - (64 + (this.field2704[var19][var20].field2656 * -1904267712 - var18)) * var16 / 64,
                  var16,
                  var9,
                  (byte)60
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = 1611441903 * var14.field2848; var21 < -1140526835 * var14.field2850 + var14.field2848 * 1611441903; var21++) {
            for (int var22 = 1017724415 * var14.field2847; var22 < 1017724415 * var14.field2847 + var14.field2849 * 1143416267; var22++) {
               this.field2704[var21][var22].method5657(var10, var11, var12, (byte)-96);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("ai")
   public final void method5760(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13
   ) {
      classHO var14 = this.method5772(var1, var2, var3, var4, (byte)-1);
      float var15 = this.method5794(var7 - var5, var3 - var1, 813420172);
      int var16 = (int)(64.0F * var15);
      int var17 = -437724932 * this.field2697 + var1;
      int var18 = 1495779659 * this.field2696 + var2;

      for (int var19 = var14.field2848 * -335559191; var19 < -573406919 * var14.field2848 + 881567060 * var14.field2850; var19++) {
         for (int var20 = var14.field2847 * 1017724415; var20 < var14.field2847 * 1017724415 + var14.field2849 * 1143416267; var20++) {
            if (var13) {
               this.field2704[var19][var20].method5636(-897020152);
            }

            this.field2704[var19][var20]
               .method5653(
                  var16 * (this.field2704[var19][var20].field2662 * 679360106 - var17) / 1721613710 + var5,
                  var8 - (1509044862 + (this.field2704[var19][var20].field2656 * -1904267712 - var18)) * var16 / 64,
                  var16,
                  var9,
                  (byte)43
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = 352656584 * var14.field2848; var21 < -1167970953 * var14.field2850 + var14.field2848 * -1713050614; var21++) {
            for (int var22 = -613038883 * var14.field2847; var22 < -1024052357 * var14.field2847 + var14.field2849 * 730217581; var22++) {
               this.field2704[var21][var22].method5657(var10, var11, var12, (byte)-57);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("ar")
   public final void method5761(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13
   ) {
      classHO var14 = this.method5772(var1, var2, var3, var4, (byte)10);
      float var15 = this.method5794(var7 - var5, var3 - var1, 2135490396);
      int var16 = (int)(64.0F * var15);
      int var17 = 578890711 * this.field2697 + var1;
      int var18 = 1495779659 * this.field2696 + var2;

      for (int var19 = var14.field2848 * 1611441903; var19 < 1611441903 * var14.field2848 + -1140526835 * var14.field2850; var19++) {
         for (int var20 = var14.field2847 * 1017724415; var20 < var14.field2847 * 1017724415 + var14.field2849 * 1143416267; var20++) {
            if (var13) {
               this.field2704[var19][var20].method5636(-1957825018);
            }

            this.field2704[var19][var20]
               .method5653(
                  var16 * (this.field2704[var19][var20].field2662 * -929958720 - var17) / 64 + var5,
                  var8 - (64 + (this.field2704[var19][var20].field2656 * -1904267712 - var18)) * var16 / 64,
                  var16,
                  var9,
                  (byte)76
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = 1611441903 * var14.field2848; var21 < -1140526835 * var14.field2850 + var14.field2848 * 1611441903; var21++) {
            for (int var22 = 1017724415 * var14.field2847; var22 < 1017724415 * var14.field2847 + var14.field2849 * 1143416267; var22++) {
               this.field2704[var21][var22].method5657(var10, var11, var12, (byte)-5);
            }
         }
      }
   }

   public boolean isLoaded() {
      return this.field2687;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("aw")
   public void method5765(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2703) {
         this.field2703.method13517(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2701 == null) {
               this.method5788(442980513);
            }

            for (int var9 : var5) {
               List var10 = (List)this.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4055 * 1972073767 - 578890711 * this.field2697) * var3 / (this.field2694 * -855485449);
                     int var14 = var4 - (819227381 * var12.field2769.field4056 - 1541032949 * this.field2696) * var4 / (this.field2695 * -1650580411);
                     classYW.method13689(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;IIII)Lho;")
   @ObfuscatedName("cy")
   public static classHO method5774(classGU var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5784();
      }

      classHO var5 = new classHO(var0);
      int var6 = var1 + 578890711 * var0.field2697;
      int var7 = var0.field2696 * 1495779659 + var2;
      int var8 = var0.field2697 * 578890711 + var3;
      int var9 = var4 + var0.field2696 * 1495779659;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field2850 = -173914683 * (1 + (var12 - var10));
      var5.field2849 = (var13 - var11 + 1) * 539285475;
      var5.field2848 = (var10 - var0.field2700.method5871(2035637257)) * 1822509071;
      var5.field2847 = (var11 - classGX.method5880(var0.field2700, (short)-9035)) * -531447297;
      if (1611441903 * var5.field2848 < 0) {
         var5.field2850 = var5.field2850 + -1325866773 * var5.field2848;
         var5.field2848 = 0;
      }

      if (var5.field2848 * 1611441903 > var0.field2704.length - -1140526835 * var5.field2850) {
         var5.field2850 = -173914683 * (var0.field2704.length - 1611441903 * var5.field2848);
      }

      if (var5.field2847 * 1017724415 < 0) {
         var5.field2849 = var5.field2849 + -2063654371 * var5.field2847;
         var5.field2847 = 0;
      }

      if (var5.field2847 * 1017724415 > var0.field2704[0].length - 1143416267 * var5.field2849) {
         var5.field2849 = 539285475 * (var0.field2704[0].length - var5.field2847 * 1017724415);
      }

      var5.field2850 = Math.min(var5.field2850 * -1140526835, var0.field2704.length) * -173914683;
      var5.field2849 = Math.min(var5.field2849 * 1143416267, var0.field2704[0].length) * 539285475;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;)V")
   @ObfuscatedName("wr")
   public static void method5787(classGU var0) {
      if (var0.field2701 == null) {
         var0.field2701 = new HashMap();
      }

      var0.field2701.clear();

      for (int var1 = 0; var1 < var0.field2704.length; var1++) {
         for (int var2 = 0; var2 < var0.field2704[var1].length; var2++) {
            for (classHD var5 : var0.field2704[var1][var2].method5734(-2094610722)) {
               if (var5.method5997((byte)-59)) {
                  int var6 = var5.vmethod486((byte)-106);
                  if (!var0.field2701.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     var0.field2701.put(var6, var7);
                  } else {
                     List var8 = (List)var0.field2701.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("kk")
   public float method5798(int var1, int var2) {
      return this.method5794(var1, var2, 1829407144);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("ak")
   public void method5766(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2703) {
         this.field2703.method13517(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2701 == null) {
               this.method5788(1136856355);
            }

            for (int var9 : var5) {
               List var10 = (List)this.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4055 * 1870919123 - 578890711 * this.field2697) * var3 / (this.field2694 * 267148007);
                     int var14 = var4 - (819227381 * var12.field2769.field4056 - 1495779659 * this.field2696) * var4 / (this.field2695 * -1650580411);
                     classYW.method13689(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   public classGU(classYZ[] var1, HashMap var2, classVA var3, classVA var4) {
      this.field2688 = false;
      this.field2689 = new HashMap();
      this.field2690 = var1;
      this.field2691 = var2;
      this.field2693 = var3;
      this.field2692 = var4;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ad")
   public final void method5757(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = classYW.field7104;
      int var10 = classYW.field7102;
      int var11 = classYW.field7101;
      float[] var12 = classYW.field7103;
      int[] var13 = new int[4];
      classYW.method13675(var13);
      classHO var14 = this.method5772(var1, var2, var3, var4, (byte)14);
      float var15 = this.method5794(var7 - var5, var3 - var1, -541566390);
      int var16 = (int)Math.ceil(var15);
      this.field2686 = -1115416179 * var16;
      if (!this.field2689.containsKey(var16)) {
         classHH var17 = new classHH(var16);
         classHH.method6022(var17, 593884295);
         this.field2689.put(var16, var17);
      }

      int var24 = 1611441903 * var14.field2848 + -2097638479 * var14.field2850 - 1;
      int var18 = 1017724415 * var14.field2847 + var14.field2849 * -930347187 - 1;

      for (int var19 = var14.field2848 * 1611441903; var19 <= var24; var19++) {
         for (int var20 = var14.field2847 * 940222262; var20 <= var18; var20++) {
            this.field2704[var19][var20]
               .method5651(this.field2700, var16, (classHH)this.field2689.get(var16), this.field2690, this.field2693, this.field2692, 0.725);
         }
      }

      classFH.method4738(var9, var10, var11, var12);
      classYW.method13679(var13);
      int var25 = (int)(64.0F * var15);
      int var26 = this.field2697 * 578890711 + var1;
      int var21 = this.field2696 * 185065267 + var2;

      for (int var22 = var14.field2848 * 1611441903; var22 < 1611441903 * var14.field2848 + -742424272 * var14.field2850; var22++) {
         for (int var23 = 1834497608 * var14.field2847; var23 < var14.field2849 * 1143416267 + 1153619293 * var14.field2847; var23++) {
            classGR.method5619(
               this.field2704[var22][var23],
               var25 * (-929958720 * this.field2704[var22][var23].field2662 - var26) / 64 + var5,
               var8 - (-1634544033 + (-546297336 * this.field2704[var22][var23].field2656 - var21)) * var25 / -944173132,
               var25,
               (short)17199
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("an")
   public void method5767(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2703) {
         this.field2703.method13517(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2701 == null) {
               this.method5788(-1063063235);
            }

            for (int var9 : var5) {
               List var10 = (List)this.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4055 * 1753573741 - 578890711 * this.field2697) * var3 / (this.field2694 * 1081885061);
                     int var14 = var4 - (819227381 * var12.field2769.field4056 - 1495779659 * this.field2696) * var4 / (this.field2695 * -1650580411);
                     classYW.method13689(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lgx;ZB)V")
   @ObfuscatedName("az")
   public void method5750(classVA var1, classGX var2, boolean var3, byte var4) {
      try {
         if (!this.field2688) {
            this.field2687 = false;
            this.field2688 = true;
            System.nanoTime();
            this.field2700 = new classHY();

            try {
               classXY var5 = new classXY(var1.method11867(-1013526269 * classHE.field2774.field2773, var2.method5848(-608589044), -960853917));
               classXY var6 = new classXY(var1.method11867(classHE.field2778.field2773 * -1013526269, var2.method5848(-608589044), -2115854375));
               System.nanoTime();
               System.nanoTime();
               classHY.method6127(this.field2700, var5, var6, var2.method5848(-608589044), var3, (byte)-17);
            } catch (IllegalStateException var13) {
               return;
            }

            classGX.method5890(this.field2700, -131076127);
            classGX.method5895(this.field2700, (byte)-77);
            this.field2700.method5897(-1903270576);
            this.field2697 = this.field2700.method5871(1898884421) * 419297728;
            this.field2696 = classGX.method5880(this.field2700, (short)-11240) * -1583474496;
            this.field2694 = (classGX.method5873(this.field2700, -2084491383) - this.field2700.method5871(1917284033) + 1) * -1115277888;
            this.field2695 = (classGX.method5884(this.field2700, -1652495836) - classGX.method5880(this.field2700, (short)-12114) + 1) * 1632871232;
            int var15 = classGX.method5873(this.field2700, -2128876556) - this.field2700.method5871(2114672205) + 1;
            int var16 = classGX.method5884(this.field2700, -2100525577) - classGX.method5880(this.field2700, (short)-26685) + 1;
            System.nanoTime();
            System.nanoTime();
            classGR.field2663.method6167();
            this.field2704 = new classGR[var15][var16];
            Iterator var7 = this.field2700.field2912.iterator();

            while (var7.hasNext()) {
               if (var4 <= 1) {
                  return;
               }

               classGL var8 = (classGL)var7.next();
               int var9 = 1151970023 * var8.field2751;
               int var10 = var8.field2750 * -456391909;
               int var11 = var9 - this.field2700.method5871(2089363575);
               int var12 = var10 - classGX.method5880(this.field2700, (short)-7934);
               this.field2704[var11][var12] = new classGR(var9, var10, this.field2700.method5862(-242771937), this.field2691);
               classGR.method5623(this.field2704[var11][var12], var8, this.field2700.field2913, (byte)29);
            }

            for (int var17 = 0; var17 < var15; var17++) {
               for (int var19 = 0; var19 < var16; var19++) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (null == this.field2704[var17][var19]) {
                     if (var4 <= 1) {
                        throw new IllegalStateException();
                     }

                     this.field2704[var17][var19] = new classGR(
                        this.field2700.method5871(2110530242) + var17,
                        classGX.method5880(this.field2700, (short)-30056) + var19,
                        this.field2700.method5862(-944986071),
                        this.field2691
                     );
                     this.field2704[var17][var19].method5625(this.field2700.field2911, this.field2700.field2913, 1881696373);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            byte[] var18 = var1.method11867(classHE.field2776.field2773 * -1013526269, var2.method5848(-608589044), -1415365980);
            if (var18 != null) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               this.field2703 = classIT.method6314(var18, 2018058660);
            }

            System.nanoTime();
            var1.method11870((byte)14);
            var1.method11863((byte)2);
            this.field2687 = true;
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "gu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method5788(int var1) {
      try {
         if (this.field2701 == null) {
            if (var1 == -97670711) {
               throw new IllegalStateException();
            }

            this.field2701 = new HashMap();
         }

         this.field2701.clear();

         for (int var2 = 0; var2 < this.field2704.length; var2++) {
            for (int var3 = 0; var3 < this.field2704[var2].length; var3++) {
               for (classHD var6 : this.field2704[var2][var3].method5734(-1601256606)) {
                  if (!var6.method5997((byte)-73)) {
                     if (var1 == -97670711) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.vmethod486((byte)-52);
                     if (!this.field2701.containsKey(var7)) {
                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.field2701.put(var7, var8);
                     } else {
                        List var10 = (List)this.field2701.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "gu.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;III)V")
   @ObfuscatedName("bu")
   public static void method5752(classGC var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5343(var1, var1, var1);
      } else {
         var0.method5337(var1 - var0.field2558 * 370701143, var2 - var0.field2559 * 1432708128, var3, (byte)-55);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;Lva;Lgx;Z)V")
   @ObfuscatedName("lw")
   public static void method5751(classGU var0, classVA var1, classGX var2, boolean var3) {
      if (!var0.field2688) {
         var0.field2687 = false;
         var0.field2688 = true;
         System.nanoTime();
         var0.field2700 = new classHY();

         try {
            classXY var4 = new classXY(var1.method11867(-1013526269 * classHE.field2774.field2773, var2.method5848(-608589044), -983194509));
            classXY var5 = new classXY(var1.method11867(classHE.field2778.field2773 * -1013526269, var2.method5848(-608589044), -1657128542));
            System.nanoTime();
            System.nanoTime();
            classHY.method6127(var0.field2700, var4, var5, var2.method5848(-608589044), var3, (byte)-48);
         } catch (IllegalStateException var12) {
            return;
         }

         classGX.method5890(var0.field2700, -2075694668);
         classGX.method5895(var0.field2700, (byte)-98);
         var0.field2700.method5897(-1140104227);
         var0.field2697 = var0.field2700.method5871(2071703453) * 419297728;
         var0.field2696 = classGX.method5880(var0.field2700, (short)-16015) * -1583474496;
         var0.field2694 = (classGX.method5873(var0.field2700, -2115767399) - var0.field2700.method5871(1895530301) + 1) * -1115277888;
         var0.field2695 = (classGX.method5884(var0.field2700, -1353372233) - classGX.method5880(var0.field2700, (short)-24708) + 1) * 1632871232;
         int var13 = classGX.method5873(var0.field2700, -2018451604) - var0.field2700.method5871(2114588938) + 1;
         int var14 = classGX.method5884(var0.field2700, -1481776519) - classGX.method5880(var0.field2700, (short)-6770) + 1;
         System.nanoTime();
         System.nanoTime();
         classGR.field2663.method6167();
         var0.field2704 = new classGR[var13][var14];

         for (classGL var7 : var0.field2700.field2912) {
            int var8 = 1151970023 * var7.field2751;
            int var9 = var7.field2750 * -456391909;
            int var10 = var8 - var0.field2700.method5871(1944452375);
            int var11 = var9 - classGX.method5880(var0.field2700, (short)-24089);
            var0.field2704[var10][var11] = new classGR(var8, var9, var0.field2700.method5862(-716067877), var0.field2691);
            classGR.method5623(var0.field2704[var10][var11], var7, var0.field2700.field2913, (byte)34);
         }

         for (int var15 = 0; var15 < var13; var15++) {
            for (int var17 = 0; var17 < var14; var17++) {
               if (null == var0.field2704[var15][var17]) {
                  var0.field2704[var15][var17] = new classGR(
                     var0.field2700.method5871(1972744103) + var15,
                     classGX.method5880(var0.field2700, (short)-29637) + var17,
                     var0.field2700.method5862(-1952501405),
                     var0.field2691
                  );
                  var0.field2704[var15][var17].method5625(var0.field2700.field2911, var0.field2700.field2913, 1881696373);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         byte[] var16 = var1.method11867(classHE.field2776.field2773 * -1013526269, var2.method5848(-608589044), -899028419);
         if (var16 != null) {
            var0.field2703 = classIT.method6314(var16, 1203453135);
         }

         System.nanoTime();
         var1.method11870((byte)14);
         var1.method11863((byte)2);
         var0.field2687 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;II)F")
   @ObfuscatedName("gt")
   public static float method5791(classGU var0, int var1, int var2) {
      if (var0 == null) {
         var0.method5790();
      }

      float var3 = (float)var1 / var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bp")
   public boolean method5777() {
      return this.field2687;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bm")
   public boolean method5778() {
      return this.field2687;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("re")
   public int method5780() {
      return this.field2700.method5865((byte)85);
   }

   public WorldMapRegion[][] getMapRegions() {
      return this.field2704;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method5781() {
      return this.field2700.method5865((byte)77);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   public int method5782() {
      return this.field2700.method5865((byte)64);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("am")
   public List method5771(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field2687) {
         return var11;
      } else {
         classHO var12 = this.method5772(var1, var2, var3, var4, (byte)3);
         float var13 = this.method5794(var7, var3 - var1, 1238689277);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field2697 * 318551578 + var1;
         int var16 = var2 + this.field2696 * 1078996640;

         for (int var17 = 1611441903 * var12.field2848; var17 < var12.field2850 * -1140526835 + var12.field2848 * 1923004591; var17++) {
            for (int var18 = -573354044 * var12.field2847; var18 < var12.field2849 * 1143416267 + 1017724415 * var12.field2847; var18++) {
               List var19 = classGR.method5728(
                  this.field2704[var17][var18],
                  var14 * (1005318324 * this.field2704[var17][var18].field2662 - var15) / 64 + var5,
                  var6 + var8 - (283874664 + (-1733427223 * this.field2704[var17][var18].field2656 - var16)) * var14 / 105994607,
                  var14,
                  var9,
                  var10,
                  263431098
               );
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method5789() {
      if (this.field2701 == null) {
         this.field2701 = new HashMap();
      }

      this.field2701.clear();

      for (int var1 = 0; var1 < this.field2704.length; var1++) {
         for (int var2 = 0; var2 < this.field2704[var1].length; var2++) {
            for (classHD var5 : this.field2704[var1][var2].method5734(-1460062648)) {
               if (var5.method5997((byte)-10)) {
                  int var6 = var5.vmethod486((byte)-109);
                  if (!this.field2701.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.field2701.put(var6, var7);
                  } else {
                     List var8 = (List)this.field2701.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method5790() {
      if (this.field2701 == null) {
         this.field2701 = new HashMap();
      }

      this.field2701.clear();

      for (int var1 = 0; var1 < this.field2704.length; var1++) {
         for (int var2 = 0; var2 < this.field2704[var1].length; var2++) {
            for (classHD var5 : this.field2704[var1][var2].method5734(-1598730589)) {
               if (var5.method5997((byte)-37)) {
                  int var6 = var5.vmethod486((byte)-86);
                  if (!this.field2701.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.field2701.put(var6, var7);
                  } else {
                     List var8 = (List)this.field2701.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;II)F")
   @ObfuscatedName("cb")
   public static float method5792(classGU var0, int var1, int var2) {
      if (var0 == null) {
         var0.method5784();
      }

      float var3 = (float)var1 / var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("bq")
   float method5793(int var1, int var2) {
      float var3 = (float)var1 / var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;IIIII)V")
   @ObfuscatedName("fv")
   static final void method5795(classDN var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = classEZ.method4436(var0, false);
      if (var6) {
         int var11 = var4;
         int var10 = var3;
         int var9 = var2;
         int var8 = var1;
         classDN var7 = var0;
         int var12 = -1159596289;

         try {
            classPL var13 = var7.field1581;
            if (client.field974.field6797 * -1927903443 >= 400) {
               if (var12 >= -795537262) {
                  throw new IllegalStateException();
               }
            } else {
               if (null != var13.field5325) {
                  var13 = var13.method8955(652890385);
               }

               if (var13 == null) {
                  if (var12 >= -795537262) {
                     throw new IllegalStateException();
                  }
               } else if (!var13.field5326) {
                  if (var12 >= -795537262) {
                  }
               } else {
                  if (var13.field5328) {
                     if (var12 >= -795537262) {
                        throw new IllegalStateException();
                     }

                     if (!classWC.method12313(var8, (byte)11)) {
                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  classCT var15 = classMB.method7521(-984319424);
                  int var14 = null != var15 ? var15.field1261 * 810892507 : 0;
                  String var16 = var7.method3451(-694108261);
                  if (var13.field5320 * 1781570005 != 0) {
                     if (var12 >= -795537262) {
                        throw new IllegalStateException();
                     }

                     if (0 != var7.field1479 * 705538257) {
                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }

                        int var10000;
                        if (var7.field1479 * 705538257 != -1) {
                           if (var12 >= -795537262) {
                              return;
                           }

                           var10000 = 705538257 * var7.field1479;
                        } else {
                           var10000 = 1781570005 * var13.field5320;
                        }

                        int var17 = var10000;
                        int var20 = var14 - var17;
                        String var19;
                        if (var20 < -9) {
                           if (var12 >= -795537262) {
                              return;
                           }

                           var19 = classQY.method9847(16711680, (byte)77);
                        } else if (var20 < -6) {
                           var19 = classQY.method9847(16723968, (byte)61);
                        } else if (var20 < -3) {
                           if (var12 >= -795537262) {
                              throw new IllegalStateException();
                           }

                           var19 = classQY.method9847(16740352, (byte)71);
                        } else if (var20 < 0) {
                           if (var12 >= -795537262) {
                              throw new IllegalStateException();
                           }

                           var19 = classQY.method9847(16756736, (byte)47);
                        } else if (var20 > 9) {
                           if (var12 >= -795537262) {
                              return;
                           }

                           var19 = classQY.method9847(65280, (byte)118);
                        } else if (var20 > 6) {
                           var19 = classQY.method9847(4259584, (byte)41);
                        } else if (var20 > 3) {
                           if (var12 >= -795537262) {
                              return;
                           }

                           var19 = classQY.method9847(8453888, (byte)20);
                        } else if (var20 > 0) {
                           if (var12 >= -795537262) {
                              throw new IllegalStateException();
                           }

                           var19 = classQY.method9847(12648192, (byte)123);
                        } else {
                           var19 = classQY.method9847(16776960, (byte)71);
                        }

                        var16 = var16 + var19 + " " + classDO.field1593 + classKK.field3688 + var17 + classDO.field1591;
                     }
                  }

                  if (var13.field5295) {
                     if (var12 >= -795537262) {
                        throw new IllegalStateException();
                     }

                     if (client.field1003) {
                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }

                        classRP.method10155(
                           classKK.field3775, classQY.method9847(16776960, (byte)59) + var16, 1003, var8, var9, var10, -1, false, var11, -324749371
                        );
                     }
                  }

                  if (!classGB.field2547) {
                     if (var12 >= -795537262) {
                        throw new IllegalStateException();
                     }

                     if (1 == client.field945 * -512792823) {
                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }

                        classRP.method10155(
                           classKK.field3774,
                           client.field804 + " " + classDO.field1590 + " " + classQY.method9847(16776960, (byte)82) + var16,
                           7,
                           var8,
                           var9,
                           var10,
                           -1,
                           false,
                           var11,
                           -324749371
                        );
                        return;
                     }
                  }

                  if (client.field979) {
                     if (var12 >= -795537262) {
                        throw new IllegalStateException();
                     }

                     if (!classGB.field2547 && 2 == (1547634457 * classLF.field4131 & 2)) {
                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }

                        classRP.method10155(
                           client.field924,
                           client.field983 + " " + classDO.field1590 + " " + classQY.method9847(16776960, (byte)40) + var16,
                           8,
                           var8,
                           var9,
                           var10,
                           -1,
                           false,
                           var11,
                           -324749371
                        );
                     }
                  } else {
                     short var23;
                     label176: {
                        if (var13.field5295) {
                           if (var12 >= -795537262) {
                              return;
                           }

                           if (client.field1003) {
                              if (var12 >= -795537262) {
                                 throw new IllegalStateException();
                              }

                              var23 = 2000;
                              break label176;
                           }
                        }

                        var23 = 0;
                     }

                     short var22 = var23;
                     classAF.method341(var22, var13, var14, false, var7, classQY.method9847(16776960, (byte)67) + var16, var8, var9, var10, var11, (byte)-79);
                     classAF.method341(var22, var13, var14, true, var7, classQY.method9847(16776960, (byte)82) + var16, var8, var9, var10, var11, (byte)39);
                     if (var13.field5295) {
                        if (var12 >= -795537262 || client.field1003) {
                           return;
                        }

                        if (var12 >= -795537262) {
                           throw new IllegalStateException();
                        }
                     }

                     classRP.method10155(
                        classKK.field3775, classQY.method9847(16776960, (byte)108) + var16, 1003, var8, var9, var10, -1, false, var11, -324749371
                     );
                  }
               }
            }
         } catch (RuntimeException var21) {
            throw classEG.method3884(var21, "gu.fv(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("at")
   public void method5768(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2703) {
         this.field2703.method13520(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2701 == null) {
               this.method5788(-872010912);
            }

            for (int var9 : var5) {
               List var10 = (List)this.field2701.get(var9);
               if (null != var10) {
                  for (classHD var12 : var10) {
                     int var13 = (var12.field2769.field4056 * 1870919123 - 578890711 * this.field2694) * var3 / (this.field2694 * 267148007);
                     int var14 = var4 - (819227381 * var12.field2770.field4057 - 1495779659 * this.field2697) * var4 / (this.field2695 * -1650580411);
                     classYW.method13697(var13 + var1, var2 + var14, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("aa")
   public int method5783(short var1) {
      try {
         return this.field2700.method5865((byte)125);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gu.aa(" + 41);
      }
   }
}
