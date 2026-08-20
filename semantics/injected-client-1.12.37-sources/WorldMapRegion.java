import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gr")
public class WorldMapRegion implements net.runelite.api.worldmap.WorldMapRegion {
   @ObfuscatedName("ao")
   LinkedList field2657;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2666 = -3407872;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2668 = -3355444;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2664 = 256;
   @ObfuscatedName("ay")
   List field2658;
   @ObfuscatedName("aj")
   int field2667;
   @ObfuscatedName("ax")
   int field2662;
   @ObfuscatedName("ac")
   int field2656;
   @ObfuscatedSignature(descriptor = "Lgl;")
   @ObfuscatedName("aa")
   classGL field2669;
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ag")
   public static classID field2663 = new classID(37748736, 256);
   @ObfuscatedName("al")
   int field2660;
   @ObfuscatedName("as")
   final HashMap field2661;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2665 = 37748736;
   @ObfuscatedName("aq")
   HashMap field2659;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   void method5642() {
      if (null != this.field2669) {
         classHA.method5968(this.field2669, (byte)-35);
      } else {
         for (classGF var2 : this.field2657) {
            classHA.method5968(var2, (byte)-54);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Ljava/util/List;)V")
   @ObfuscatedName("ij")
   public static void method5638(WorldMapRegion var0, List var1) {
      if (var0 == null) {
         var0.getMapIcons();
      }

      for (classHF var3 : var1) {
         if (SceneTilePaint.method4796(var3.field2785 * -1047464521, (byte)-83).field5392
            && 1870919123 * var3.field2769.field4055 >> 6 == var0.field2662 * -551401517
            && var0.field2656 * 1312423097 == 819227381 * var3.field2769.field4056 >> 6) {
            classHF var4 = new classHF(var3.field2769, var3.field2769, var3.field2785 * -1047464521, var0.method5722(-1047464521 * var3.field2785, 1965611735));
            var0.field2658.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;Ljava/util/List;I)V")
   @ObfuscatedName("as")
   void method5625(ArrayList var1, List var2, int var3) {
      try {
         this.field2659.clear();
         Iterator var4 = var1.iterator();

         while (var4.hasNext()) {
            if (var3 != 1881696373) {
               throw new IllegalStateException();
            }

            classGF var5 = (classGF)var4.next();
            if (var5.method5983((byte)15) == this.field2662 * -551401517) {
               if (var3 != 1881696373) {
                  throw new IllegalStateException();
               }

               if (classHA.method5986(var5, (byte)-60) == this.field2656 * 1312423097) {
                  if (var3 != 1881696373) {
                     throw new IllegalStateException();
                  }

                  this.field2657.add(var5);
               }
            }
         }

         this.method5639(var2, (byte)16);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;I)V")
   @ObfuscatedName("dg")
   void method5712(int var1, int var2, HashSet var3, int var4) {
      float var5 = var4 / 64.0F;

      for (AbstractWorldMapIcon var7 : this.field2658) {
         if (var7.method5997((byte)-17)) {
            int var8 = 1870919123 * var7.field2769.field4055 % 64;
            int var9 = 819227381 * var7.field2769.field4056 % 64;
            var7.field2771 = (int)(var1 + var8 * var5) * 1179114429;
            var7.field2772 = 1689733203 * (int)(var2 + var5 * (63 - var9));
            if (!var3.contains(var7.vmethod486((byte)-83))) {
               this.method5700(var7, 797816725 * var7.field2771, var7.field2772 * 655244251, var5, (byte)32);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lom;IIILha;I)V")
   @ObfuscatedName("ac")
   void method5633(classOM var1, int var2, int var3, int var4, classHA var5, int var6) {
      try {
         classKY var7 = new classKY(var2, -929958720 * this.field2662 + var3, var4 + -1904267712 * this.field2656);
         Object var8 = null;
         if (this.field2669 != null) {
            if (var6 <= -894742854) {
               return;
            }

            var8 = new classKY(
               this.field2669.field2753 * 1423073843 + var2, -1303084352 * this.field2669.field2754 + var3, var4 + this.field2669.field2755 * 747140416
            );
         } else {
            classGF var9 = (classGF)var5;
            var8 = new classKY(
               var2 + var9.field2753 * 1423073843,
               var3 + var9.field2754 * -1303084352 + var9.method5415((byte)98) * 8,
               var4 + 747140416 * var9.field2755 + classGF.method5419(var9, -846797079) * 8
            );
         }

         Object var13;
         if (null != var1.field4930) {
            if (var6 <= -894742854) {
               throw new IllegalStateException();
            }

            var13 = new classGS((classKY)var8, var7, -381960671 * var1.field4922, this);
         } else {
            WorldMapElement var10 = SceneTilePaint.method4796(var1.field4953 * 1412472849, (byte)-18);
            var13 = new classHF((classKY)var8, var7, var10.field5405 * 872689451, this.method5725(var10, 1639042190));
         }

         WorldMapElement var14 = SceneTilePaint.method4796(((AbstractWorldMapIcon)var13).vmethod486((byte)-45), (byte)-15);
         if (var14.field5392) {
            if (var6 <= -894742854) {
               return;
            }

            this.field2659.put(new classKY(0, var3, var4), var13);
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "gr.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lpe;)I")
   @ObfuscatedName("er")
   int method5714(SpritePixels var1, classPE var2) {
      switch (-44671146 * var2.field5231) {
         case 0:
            return 0;
         case 1:
            return -var1.field7007 / 2;
         default:
            return -var1.field7007;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/List;B)V")
   @ObfuscatedName("ao")
   void method5639(List var1, byte var2) {
      try {
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            if (var2 == 32) {
               return;
            }

            classHF var4 = (classHF)var3.next();
            if (!SceneTilePaint.method4796(var4.field2785 * -1047464521, (byte)-63).field5392) {
               if (var2 == 32) {
                  throw new IllegalStateException();
               }
            } else if (1870919123 * var4.field2769.field4055 >> 6 == this.field2662 * -551401517
               && this.field2656 * 1312423097 == 819227381 * var4.field2769.field4056 >> 6) {
               if (var2 == 32) {
                  throw new IllegalStateException();
               }

               classHF var5 = new classHF(
                  var4.field2769, var4.field2769, var4.field2785 * -1047464521, this.method5722(-1047464521 * var4.field2785, 2063850095)
               );
               this.field2658.add(var5);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;IIIIII)Ljava/util/List;")
   @ObfuscatedName("cq")
   public static List method5728(WorldMapRegion var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method5732(var1, var1, var1, var1, var1, var1);
      }

      try {
         LinkedList var7 = new LinkedList();
         if (var4 >= var1) {
            if (var6 <= -673752481) {
               throw new IllegalStateException();
            }

            if (var5 >= var2) {
               if (var4 < var1 + var3) {
                  if (var6 <= -673752481) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var2 + var3) {
                     Iterator var8 = var0.field2659.values().iterator();

                     while (var8.hasNext()) {
                        if (var6 <= -673752481) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var9 = (AbstractWorldMapIcon)var8.next();
                        if (var9.method5997((byte)-4)) {
                           if (var6 <= -673752481) {
                              throw new IllegalStateException();
                           }

                           if (var9.method5993(var4, var5, (byte)-65)) {
                              var7.add(var9);
                           }
                        }
                     }

                     var8 = var0.field2658.iterator();

                     while (var8.hasNext()) {
                        if (var6 <= -673752481) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.next();
                        if (var12.method5997((byte)-54)) {
                           if (var6 <= -673752481) {
                              throw new IllegalStateException();
                           }

                           if (var12.method5993(var4, var5, (byte)-44)) {
                              var7.add(var12);
                           }
                        }
                     }

                     return var7;
                  }
               }

               return var7;
            }

            if (var6 <= -673752481) {
               throw new IllegalStateException();
            }
         }

         return var7;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("dc")
   void method5659(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (int var5 = 0; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 64; var6++) {
            method5671(this, var5, var6, this.field2669, var1, var3, var4, (byte)104);
            this.method5676(var5, var6, this.field2669, var1, var4, -1017290293);
         }
      }

      for (int var7 = 0; var7 < 64; var7++) {
         for (int var8 = 0; var8 < 64; var8++) {
            this.method5668(var7, var8, this.field2669, var1, var2, (byte)73);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILva;I)Z")
   @ObfuscatedName("aj")
   boolean method5646(int var1, AbstractArchive var2, int var3) {
      try {
         this.field2659.clear();
         int var4 = classDG.method3057(this.field2662 * -551401517, 1312423097 * this.field2656, (byte)-88);
         byte[] var5 = var2.method11867(var4, var1, -1232070465);
         Buffer var6 = null;
         if (var5 != null) {
            if (var3 == -172229614) {
               throw new IllegalStateException();
            }

            var6 = new Buffer(var5);
         }

         if (null != this.field2669) {
            if (var3 == -172229614) {
               throw new IllegalStateException();
            } else {
               this.field2669.method5962(var6, (byte)54);
               if (classHA.method5959(this.field2669, (byte)-86)) {
                  if (var3 == -172229614) {
                     throw new IllegalStateException();
                  } else {
                     method5631(this, 0, 0, 64, 64, this.field2669, -1709921586);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            boolean var7 = true;
            Iterator var8 = this.field2657.iterator();

            while (var8.hasNext()) {
               if (var3 == -172229614) {
                  throw new IllegalStateException();
               }

               classGF var9 = (classGF)var8.next();
               var9.method5962(var6, (byte)39);
               var7 &= classHA.method5959(var9, (byte)-5);
            }

            if (var7) {
               if (var3 == -172229614) {
                  throw new IllegalStateException();
               }

               var8 = this.field2657.iterator();

               while (var8.hasNext()) {
                  if (var3 == -172229614) {
                     throw new IllegalStateException();
                  }

                  classGF var12 = (classGF)var8.next();
                  method5631(this, var12.method5422(-2055683981) * 8, var12.method5426(-2032103155) * 8, 8, 8, var12, -1841437185);
               }
            }

            return var7;
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;[Lyz;B)V")
   @ObfuscatedName("ai")
   void method5668(int var1, int var2, classHA var3, classHH var4, IndexedSprite[] var5, byte var6) {
      try {
         this.method5688(var1, var2, var3, -344925418);
         this.method5684(var1, var2, var3, var5, 801221335);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "gr.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lps;IIII)V")
   @ObfuscatedName("bm")
   public static void method5697(WorldMapRegion var0, WorldMapElement var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method5722(var2, var2);
      }

      SpritePixels var6 = var1.method9199(false, 1692508071);
      if (null != var6) {
         SpritePixels.method13511(var6, var2 - var6.field7007 / 2, var3 - var6.field7009 / 2);
         if (var4 % var5 < var5 / 2) {
            classYW.method13689(var2, var3, 15, -1096935414, 128);
            classYW.method13689(var2, var3, 7, 16777215, 256);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lgx;ILhh;[Lyz;Lva;Lva;D)V")
   @ObfuscatedName("lm")
   public static void method5650(
      WorldMapRegion var0, WorldMapArea var1, int var2, classHH var3, IndexedSprite[] var4, AbstractArchive var5, AbstractArchive var6, double var7
   ) {
      if (var0 == null) {
         var0.method5652(var1, var2, var3, var4, var5, var5, var7);
      }

      var0.field2667 = 212048344 * var2;
      if (null != var0.field2669 || !var0.field2657.isEmpty()) {
         int var10 = -1405153691 * var0.field2662;
         int var11 = var0.field2656 * -1670926402;
         SpritePixels var9 = (SpritePixels)field2663.method6147(classCX.method2698(var10, var11, var2, (byte)1));
         if (null == var9) {
            if (classFH.method4702() != var7) {
               classFH.method4694(var7);
            }

            boolean var12 = true;
            var12 &= var0.method5646(var1.method5848(-608589044), var5, 618311864);
            int var14 = classDG.method3057(var0.field2662 * -551401517, var0.field2656 * -2079563483, (byte)78);
            var12 &= var6.method11866(var14, -906797091);
            if (var12) {
               byte[] var13 = var6.method11867(var14, var1.method5848(-608589044), -1016788209);
               classHU var15;
               if (var13 == null) {
                  var15 = new classHU();
               } else {
                  SpritePixels var16 = classIT.method6314(var13, 1207354536);
                  if (null == var16) {
                     var15 = new classHU();
                  } else {
                     var15 = new classHU(var16.field7005);
                  }
               }

               SpritePixels var17 = new SpritePixels(-757278971 * var0.field2667, 1744034391 * var0.field2667);
               var17.method13477();
               if (null != var0.field2669) {
                  method5662(var0, var3, var4, var15, new classHQ(), -1685083207);
               } else {
                  var0.method5664(var3, var4, var15, new classHQ(), -1952919293);
               }

               int var18 = -560795297 * var0.field2662;
               int var19 = var0.field2656 * 1312423097;
               int var20 = 680806733 * var0.field2667;
               field2663.method6157(var17, classCX.method2698(var18, var19, var20, (byte)1), 4 * var17.field7005.length);
               var0.method5643((byte)122);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Ljava/util/ArrayList;Ljava/util/List;)V")
   @ObfuscatedName("vv")
   public static void method5626(WorldMapRegion var0, ArrayList var1, List var2) {
      var0.field2659.clear();

      for (classGF var4 : var1) {
         if (var4.method5983((byte)15) == var0.field2662 * -551401517 && classHA.method5986(var4, (byte)-80) == var0.field2656 * 1312423097) {
            var0.field2657.add(var4);
         }
      }

      var0.method5639(var2, (byte)12);
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;B)V")
   @ObfuscatedName("aq")
   void method5653(int var1, int var2, int var3, HashSet var4, byte var5) {
      try {
         if (null == var4) {
            if (var5 >= 101) {
               throw new IllegalStateException();
            }

            var4 = new HashSet();
         }

         this.method5690(var1, var2, var4, var3, (byte)3);
         this.method5713(var1, var2, var4, var3, 543832187);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;II)V")
   @ObfuscatedName("ej")
   void method5704(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.method9199(false, -1534229956);
      if (null != var4) {
         int var5 = this.method5715(var4, var1.field5402, 1654920068);
         int var6 = this.method5719(var4, var1.field5397, 696529173);
         SpritePixels.method13511(var4, var2 + var5, var3 + var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;I)V")
   @ObfuscatedName("au")
   void method5664(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4, int var5) {
      try {
         Iterator var6 = this.field2657.iterator();

         while (var6.hasNext()) {
            if (var5 >= -1426728943) {
               throw new IllegalStateException();
            }

            classGF var7 = (classGF)var6.next();

            for (int var8 = var7.method5422(-1979286425) * 8; var8 < var7.method5422(-1824743324) * 8 + 8; var8++) {
               if (var5 >= -1426728943) {
                  throw new IllegalStateException();
               }

               for (int var9 = var7.method5426(-2041482250) * 8; var9 < var7.method5426(-2126916529) * 8 + 8; var9++) {
                  if (var5 >= -1426728943) {
                     throw new IllegalStateException();
                  }

                  method5671(this, var8, var9, var7, var1, var3, var4, (byte)116);
                  this.method5676(var8, var9, var7, var1, var4, -1017290293);
               }
            }
         }

         var6 = this.field2657.iterator();

         while (var6.hasNext()) {
            if (var5 >= -1426728943) {
               return;
            }

            classGF var12 = (classGF)var6.next();

            for (int var13 = var12.method5422(-1901635223) * 8; var13 < var12.method5422(-2137283529) * 8 + 8; var13++) {
               if (var5 >= -1426728943) {
                  return;
               }

               for (int var14 = var12.method5426(-2077628961) * 8; var14 < var12.method5426(-2054737183) * 8 + 8; var14++) {
                  if (var5 >= -1426728943) {
                     throw new IllegalStateException();
                  }

                  this.method5668(var13, var14, var12, var1, var2, (byte)79);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Z")
   @ObfuscatedName("bd")
   static boolean method5613(classOM var0) {
      if (var0.field4930 != null) {
         int[] var1 = var0.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            classOM var4 = classMU.method7729(var3, 1418227343);
            if (var4.field4953 * 1412472849 != -1) {
               return true;
            }
         }
      } else if (1412472849 * var0.field4953 != -1) {
         return true;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lge;I)V")
   @ObfuscatedName("aw")
   void method5676(int var1, int var2, classHA var3, classHH var4, classGE var5, int var6) {
      try {
         for (int var7 = 1; var7 < var3.field2752 * -1667236931; var7++) {
            if (var6 != -1017290293) {
               throw new IllegalStateException();
            }

            int var8 = var3.field2759[var7][var1][var2] - 1;
            if (var8 > -1) {
               if (var6 != -1017290293) {
                  throw new IllegalStateException();
               }

               int var9 = WorldMapElement.method9182(var8, this.field2660 * 288074485, var5, -1517689602);
               if (0 == var3.field2757[var7][var1][var2]) {
                  if (var6 != -1017290293) {
                     return;
                  }

                  classYW.method13698(
                     this.field2667 * 680806733 * var1, (63 - var2) * 680806733 * this.field2667, this.field2667 * 680806733, this.field2667 * 680806733, var9
                  );
               } else {
                  var4.method6012(
                     var1 * this.field2667 * 680806733,
                     (63 - var2) * this.field2667 * 680806733,
                     0,
                     var9,
                     680806733 * this.field2667,
                     680806733 * this.field2667,
                     var3.field2757[var7][var1][var2],
                     var3.field2756[var7][var1][var2],
                     980481800
                  );
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;[Lyz;I)V")
   @ObfuscatedName("av")
   void method5684(int var1, int var2, classHA var3, IndexedSprite[] var4, int var5) {
      try {
         for (int var6 = 0; var6 < -1667236931 * var3.field2752; var6++) {
            if (var5 != 801221335) {
               return;
            }

            classHZ[] var7 = var3.field2760[var6][var1][var2];
            if (null != var7) {
               if (var5 != 801221335) {
                  throw new IllegalStateException();
               }

               if (var7.length != 0) {
                  classHZ[] var8 = var7;

                  for (int var9 = 0; var9 < var8.length; var9++) {
                     classHZ var10;
                     boolean var10000;
                     label107: {
                        var10 = var8[var9];
                        int var12 = var10.field2914 * 1253547473;
                        if (var12 >= classKB.field3521.field3538 * 78062377) {
                           if (var5 != 801221335) {
                              throw new IllegalStateException();
                           }

                           if (var12 <= 78062377 * classKB.field3526.field3538) {
                              if (var5 != 801221335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = 1;
                              break label107;
                           }
                        }

                        var10000 = 0;
                     }

                     boolean var11 = (boolean)var10000;
                     if (!var11) {
                        if (var5 != 801221335) {
                           throw new IllegalStateException();
                        }

                        int var14 = var10.field2914 * 1253547473;
                        if (var14 == 78062377 * classKB.field3537.field3538) {
                           if (var5 != 801221335) {
                              throw new IllegalStateException();
                           }

                           var10000 = (boolean)1;
                        } else {
                           var10000 = (boolean)0;
                        }

                        boolean var13 = var10000;
                        if (!var13) {
                           if (var5 != 801221335) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }

                     classOM var16 = classMU.method7729(var10.field2916 * -1831941567, 1639553332);
                     if (-1 != var16.field4954 * 1680279607) {
                        if (var5 != 801221335) {
                           throw new IllegalStateException();
                        }

                        label93: {
                           if (var10.field2915 * 374409179 != 1) {
                              if (var5 != 801221335) {
                                 throw new IllegalStateException();
                              }

                              if (3 != var10.field2915 * 374409179) {
                                 var10000 = 402876423 * var16.field4924;
                                 break label93;
                              }

                              if (var5 != 801221335) {
                                 throw new IllegalStateException();
                              }
                           }

                           var10000 = -582306509 * var16.field4944;
                        }

                        int var17 = var10000;
                        var4[1680279607 * var16.field4954]
                           .method13812(
                              var1 * 680806733 * this.field2667,
                              (64 - var17 - var2) * this.field2667 * 680806733,
                              this.field2667 * 1361613466,
                              this.field2667 * 1361613466
                           );
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "gr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;I)V")
   @ObfuscatedName("at")
   void method5688(int var1, int var2, classHA var3, int var4) {
      try {
         for (int var5 = 0; var5 < -1667236931 * var3.field2752; var5++) {
            if (var4 >= 1860831095) {
               throw new IllegalStateException();
            }

            classHZ[] var6 = var3.field2760[var5][var1][var2];
            if (var6 != null) {
               if (var4 >= 1860831095) {
                  throw new IllegalStateException();
               }

               if (0 == var6.length) {
                  if (var4 >= 1860831095) {
                     return;
                  }
               } else {
                  classHZ[] var7 = var6;

                  for (int var8 = 0; var8 < var7.length; var8++) {
                     if (var4 >= 1860831095) {
                        throw new IllegalStateException();
                     }

                     classHZ var9 = var7[var8];
                     if (classJW.method6418(var9.field2914 * 1253547473, 1644747895)) {
                        if (var4 >= 1860831095) {
                           throw new IllegalStateException();
                        }

                        classOM var10 = classMU.method7729(var9.field2916 * -1831941567, 1881626262);
                        int var10000;
                        if (var10.field4923 * 1663954033 != 0) {
                           if (var4 >= 1860831095) {
                              throw new IllegalStateException();
                           }

                           var10000 = -3407872;
                        } else {
                           var10000 = -3355444;
                        }

                        int var11 = var10000;
                        if (classKB.field3515.field3538 * 78062377 == var9.field2914 * 1253547473) {
                           this.method5736(var1, var2, var9.field2915 * 374409179, var11, 1423521969);
                        }

                        if (classKB.field3517.field3538 * 78062377 == var9.field2914 * 1253547473) {
                           if (var4 >= 1860831095) {
                              throw new IllegalStateException();
                           }

                           this.method5736(var1, var2, 374409179 * var9.field2915, -3355444, -1893756618);
                           this.method5736(var1, var2, 374409179 * var9.field2915 + 1, var11, 1240727397);
                        }

                        if (var9.field2914 * 1253547473 == 78062377 * classKB.field3518.field3538) {
                           if (var4 >= 1860831095) {
                              throw new IllegalStateException();
                           }

                           if (var9.field2915 * 374409179 == 0) {
                              if (var4 >= 1860831095) {
                                 throw new IllegalStateException();
                              }

                              classYW.method13717(var1 * this.field2667 * 680806733, 680806733 * this.field2667 * (63 - var2), 1, var11);
                           }

                           if (1 == var9.field2915 * 374409179) {
                              if (var4 >= 1860831095) {
                                 throw new IllegalStateException();
                              }

                              classYW.method13717(
                                 680806733 * this.field2667 + var1 * this.field2667 * 680806733 - 1, this.field2667 * 680806733 * (63 - var2), 1, var11
                              );
                           }

                           if (374409179 * var9.field2915 == 2) {
                              if (var4 >= 1860831095) {
                                 throw new IllegalStateException();
                              }

                              classYW.method13717(
                                 680806733 * this.field2667 + this.field2667 * 680806733 * var1 - 1,
                                 (63 - var2) * 680806733 * this.field2667 + this.field2667 * 680806733 - 1,
                                 1,
                                 var11
                              );
                           }

                           if (var9.field2915 * 374409179 == 3) {
                              if (var4 >= 1860831095) {
                                 return;
                              }

                              classYW.method13717(
                                 var1 * this.field2667 * 680806733, this.field2667 * 680806733 + this.field2667 * 680806733 * (63 - var2) - 1, 1, var11
                              );
                           }
                        }

                        if (1253547473 * var9.field2914 == 78062377 * classKB.field3519.field3538) {
                           int var12 = var9.field2915 * 374409179 % 2;
                           if (0 == var12) {
                              if (var4 >= 1860831095) {
                                 throw new IllegalStateException();
                              }

                              for (int var15 = 0; var15 < 680806733 * this.field2667; var15++) {
                                 if (var4 >= 1860831095) {
                                    return;
                                 }

                                 classYW.method13717(var1 * this.field2667 * 680806733 + var15, this.field2667 * 680806733 * (64 - var2) - 1 - var15, 1, var11);
                              }
                           } else {
                              for (int var13 = 0; var13 < 680806733 * this.field2667; var13++) {
                                 if (var4 >= 1860831095) {
                                    throw new IllegalStateException();
                                 }

                                 classYW.method13717(var13 + var1 * 680806733 * this.field2667, var13 + this.field2667 * 680806733 * (63 - var2), 1, var11);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "gr.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;IB)V")
   @ObfuscatedName("an")
   void method5690(int var1, int var2, HashSet var3, int var4, byte var5) {
      try {
         float var6 = var4 / 64.0F;
         float var7 = var6 / 2.0F;
         Iterator var8 = this.field2659.entrySet().iterator();

         while (var8.hasNext()) {
            if (var5 != 3) {
               return;
            }

            Entry var9 = (Entry)var8.next();
            classKY var10 = (classKY)var9.getKey();
            int var11 = (int)(var6 * (var10.field4055 * 1870919123) + var1 - var7);
            int var12 = (int)(var2 + var4 - var6 * (819227381 * var10.field4056) - var7);
            AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var9.getValue();
            if (var13 != null) {
               if (var5 != 3) {
                  throw new IllegalStateException();
               }

               if (var13.method5997((byte)-52)) {
                  if (var5 != 3) {
                     return;
                  }

                  var13.field2771 = 1179114429 * var11;
                  var13.field2772 = var12 * 1689733203;
                  WorldMapElement var14 = SceneTilePaint.method4796(var13.vmethod486((byte)-115), (byte)-66);
                  if (!var3.contains(var14.method9203((byte)0))) {
                     if (var5 != 3) {
                        throw new IllegalStateException();
                     }

                     this.method5700(var13, var11, var12, var6, (byte)32);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "gr.an(" + ')');
      }
   }

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.field2662 = var1 * 584755291;
      this.field2656 = var2 * 1000294793;
      this.field2657 = new LinkedList();
      this.field2658 = new LinkedList();
      this.field2659 = new HashMap();
      this.field2660 = -612224675 * (var3 | 0xFF000000);
      this.field2661 = var4;
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;I)V")
   @ObfuscatedName("eg")
   void method5691(int var1, int var2, HashSet var3, int var4) {
      float var5 = var4 / 64.0F;
      float var6 = var5 / 2.0F;

      for (Entry var8 : this.field2659.entrySet()) {
         classKY var9 = (classKY)var8.getKey();
         int var10 = (int)(var5 * (var9.field4055 * 1870919123) + var1 - var6);
         int var11 = (int)(var2 + var4 - var5 * (-307626039 * var9.field4056) - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.method5997((byte)-112)) {
            var12.field2771 = -1316921854 * var10;
            var12.field2772 = var11 * -1899163693;
            WorldMapElement var13 = SceneTilePaint.method4796(var12.vmethod486((byte)-71), (byte)-3);
            if (!var3.contains(var13.method9203((byte)0))) {
               this.method5700(var12, var10, var11, var5, (byte)32);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;II)V")
   @ObfuscatedName("ek")
   void method5705(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.method9199(false, 317703748);
      if (null != var4) {
         int var5 = this.method5715(var4, var1.field5402, 1738483204);
         int var6 = this.method5719(var4, var1.field5397, -431077059);
         SpritePixels.method13511(var4, var2 + var5, var3 + var6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;I)Lhw;")
   @ObfuscatedName("gy")
   public static classHW method5721(WorldMapRegion var0, int var1) {
      if (var0 == null) {
         return var0.method5723(var1);
      } else {
         WorldMapElement var2 = SceneTilePaint.method4796(var1, (byte)5);
         return var0.method5725(var2, 1629968187);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;)V")
   @ObfuscatedName("th")
   public static void method5635(WorldMapRegion var0) {
      for (AbstractWorldMapIcon var2 : var0.field2659.values()) {
         if (var2 instanceof classGS) {
            classGS.method5741((classGS)var2, -749605090);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;)Ljava/util/List;")
   @ObfuscatedName("dc")
   public static List method5733(WorldMapRegion var0) {
      if (var0 == null) {
         var0.method5642();
      }

      LinkedList var1 = new LinkedList();
      var1.addAll(var0.field2658);
      var1.addAll(var0.field2659.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(ILva;)Z")
   @ObfuscatedName("cz")
   boolean method5647(int var1, AbstractArchive var2) {
      this.field2659.clear();
      int var3 = classDG.method3057(this.field2662 * -551401517, 1312423097 * this.field2656, (byte)43);
      byte[] var4 = var2.method11867(var3, var1, -1533770718);
      Buffer var5 = null;
      if (var4 != null) {
         var5 = new Buffer(var4);
      }

      if (null != this.field2669) {
         this.field2669.method5962(var5, (byte)71);
         if (classHA.method5959(this.field2669, (byte)-5)) {
            method5631(this, 0, 0, 64, 64, this.field2669, -1587521671);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var6 = true;

         for (classGF var8 : this.field2657) {
            var8.method5962(var5, (byte)47);
            var6 &= classHA.method5959(var8, (byte)58);
         }

         if (var6) {
            for (classGF var10 : this.field2657) {
               method5631(this, var10.method5422(-1736572141) * 8, var10.method5426(-2052422298) * 8, 8, 8, var10, -1451713958);
            }
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V")
   @ObfuscatedName("bp")
   void method5713(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = var4 / 64.0F;
         Iterator var7 = this.field2658.iterator();

         while (var7.hasNext()) {
            if (var5 != 543832187) {
               return;
            }

            AbstractWorldMapIcon var8 = (AbstractWorldMapIcon)var7.next();
            if (!var8.method5997((byte)-115)) {
               if (var5 != 543832187) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = 1870919123 * var8.field2769.field4055 % 64;
               int var10 = 819227381 * var8.field2769.field4056 % 64;
               var8.field2771 = (int)(var1 + var9 * var6) * 1179114429;
               var8.field2772 = 1689733203 * (int)(var2 + var6 * (63 - var10));
               if (var3.contains(var8.vmethod486((byte)-86))) {
                  if (var5 != 543832187) {
                     return;
                  }
               } else {
                  this.method5700(var8, 797816725 * var8.field2771, var8.field2772 * 655244251, var6, (byte)32);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "gr.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;III)V")
   @ObfuscatedName("bx")
   void method5706(WorldMapElement var1, int var2, int var3, int var4) {
      try {
         SpritePixels var5 = var1.method9199(false, -1683811326);
         if (null != var5) {
            if (var4 >= 586322231) {
               throw new IllegalStateException();
            }

            int var6 = this.method5715(var5, var1.field5402, 1767348466);
            int var7 = this.method5719(var5, var1.field5397, -129613938);
            SpritePixels.method13511(var5, var2 + var6, var3 + var7);
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "gr.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lol;I)I")
   @ObfuscatedName("bm")
   int method5719(SpritePixels var1, classOL var2, int var3) {
      try {
         switch (-1205275063 * var2.field4917) {
            case 0:
               return -var1.field7009 / 2;
            case 1:
               return 0;
            default:
               return -var1.field7009;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.bm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;I)Lhw;")
   @ObfuscatedName("bg")
   classHW method5725(WorldMapElement var1, int var2) {
      try {
         if (null != var1.field5412) {
            if (var2 <= 1412510579) {
               throw new IllegalStateException();
            }

            if (null != this.field2661) {
               if (var2 <= 1412510579) {
                  throw new IllegalStateException();
               }

               if (this.field2661.get(classHP.field2856) != null) {
                  classHP var3 = classHP.method6085(var1.field5394 * 1698532127, (byte)47);
                  if (var3 == null) {
                     if (var2 <= 1412510579) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  Font var4 = (Font)this.field2661.get(var3);
                  if (null == var4) {
                     if (var2 <= 1412510579) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  int var5 = var4.method43(var1.field5412, 1000000);
                  String[] var6 = new String[var5];
                  var4.method38(var1.field5412, null, var6);
                  int var7 = var4.field8 * var6.length / 2;
                  int var8 = 0;
                  String[] var9 = var6;

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     if (var2 <= 1412510579) {
                        throw new IllegalStateException();
                     }

                     String var11 = var9[var10];
                     int var12 = var4.method36(var11);
                     if (var12 > var8) {
                        if (var2 <= 1412510579) {
                           throw new IllegalStateException();
                        }

                        var8 = var12;
                     }
                  }

                  return new classHW(var1.field5412, var8, var7, var3);
               }
            }
         }

         return null;
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "gr.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/List;")
   @ObfuscatedName("bk")
   List method5734(int var1) {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.field2658);
         var2.addAll(this.field2659.values());
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "gr.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;IILha;Lhh;Lhu;Lge;B)V")
   @ObfuscatedName("uq")
   public static void method5671(WorldMapRegion var0, int var1, int var2, classHA var3, classHH var4, classHU var5, classGE var6, byte var7) {
      if (var0 == null) {
         var0.method5675(var1, var1, var3, var4, var5, var6, var7);
      }

      try {
         int var8 = var3.field2758[0][var1][var2] - 1;
         int var9 = var3.field2759[0][var1][var2] - 1;
         if (-1 == var8) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            if (-1 == var9) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               classYW.method13698(
                  680806733 * var0.field2667 * var1,
                  680806733 * var0.field2667 * (63 - var2),
                  680806733 * var0.field2667,
                  var0.field2667 * 680806733,
                  288074485 * var0.field2660
               );
            }
         }

         int var10 = 16711935;
         if (var9 != -1) {
            var10 = WorldMapElement.method9182(var9, 288074485 * var0.field2660, var6, -2092820255);
         }

         if (var9 > -1) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            if (0 == var3.field2757[0][var1][var2]) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               classYW.method13698(
                  680806733 * var0.field2667 * var1, (63 - var2) * var0.field2667 * 680806733, var0.field2667 * 680806733, var0.field2667 * 680806733, var10
               );
               return;
            }
         }

         int var11 = method5680(var0, var1, var2, var3, var5, -1255554545);
         if (var9 == -1) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            } else {
               classYW.method13698(
                  var0.field2667 * 680806733 * var1, (63 - var2) * var0.field2667 * 680806733, 680806733 * var0.field2667, var0.field2667 * 680806733, var11
               );
            }
         } else {
            var4.method6012(
               var1 * var0.field2667 * 680806733,
               (63 - var2) * var0.field2667 * 680806733,
               var11,
               var10,
               var0.field2667 * 680806733,
               var0.field2667 * 680806733,
               var3.field2757[0][var1][var2],
               var3.field2756[0][var1][var2],
               980481800
            );
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "gr.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bo")
   void method5736(int var1, int var2, int var3, int var4, int var5) {
      try {
         var3 %= 4;
         if (var3 == 0) {
            if (var5 == 163963853) {
               throw new IllegalStateException();
            }

            classYW.method13723(var1 * this.field2667 * 680806733, this.field2667 * 680806733 * (63 - var2), 680806733 * this.field2667, var4);
         }

         if (var3 == 1) {
            if (var5 == 163963853) {
               return;
            }

            classYW.method13717(var1 * this.field2667 * 680806733, (63 - var2) * this.field2667 * 680806733, this.field2667 * 680806733, var4);
         }

         if (var3 == 2) {
            if (var5 == 163963853) {
               return;
            }

            classYW.method13723(
               680806733 * this.field2667 + this.field2667 * 680806733 * var1 - 1, 680806733 * this.field2667 * (63 - var2), this.field2667 * 680806733, var4
            );
         }

         if (3 == var3) {
            if (var5 == 163963853) {
               return;
            }

            classYW.method13717(
               this.field2667 * 680806733 * var1, 680806733 * this.field2667 + (63 - var2) * this.field2667 * 680806733 - 1, 680806733 * this.field2667, var4
            );
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/List;)V")
   @ObfuscatedName("ca")
   void method5640(List var1) {
      for (classHF var3 : var1) {
         if (SceneTilePaint.method4796(var3.field2785 * -1047464521, (byte)-92).field5392
            && 1870919123 * var3.field2769.field4055 >> 6 == this.field2662 * -551401517
            && this.field2656 * 1312423097 == 819227381 * var3.field2769.field4056 >> 6) {
            classHF var4 = new classHF(var3.field2769, var3.field2769, var3.field2785 * -1047464521, this.method5722(-1047464521 * var3.field2785, 2130223302));
            this.field2658.add(var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bu")
   static long method5604(int var0, int var1, int var2) {
      return var2 << 16 | var0 << 8 | var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("ba")
   static long method5605(int var0, int var1, int var2) {
      return var2 << 16 | var0 << 8 | var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bw")
   static long method5606(int var0, int var1, int var2) {
      return var2 << 16 | var0 << 8 | var1;
   }

   @ObfuscatedSignature(descriptor = "(Lhd;IIFB)V")
   @ObfuscatedName("bn")
   void method5700(AbstractWorldMapIcon var1, int var2, int var3, float var4, byte var5) {
      try {
         WorldMapElement var6 = SceneTilePaint.method4796(var1.vmethod486((byte)-68), (byte)-77);
         this.method5706(var6, var2, var3, 148705509);
         this.method5708(var1, var6, var2, var3, var4, 364928686);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "gr.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method5636(int var1) {
      try {
         for (AbstractWorldMapIcon var3 : this.field2659.values()) {
            if (var3 instanceof classGS) {
               if (var1 == 757968036) {
                  throw new IllegalStateException();
               }

               classGS.method5741((classGS)var3, -1132427880);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public static void method5608() {
      field2663.method6161(5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   public static void method5609() {
      field2663.method6161(5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public static void method5610() {
      field2663.method6161(5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public static void method5611() {
      field2663.method6161(5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lps;)Lhw;")
   @ObfuscatedName("nx")
   public static classHW method5726(WorldMapRegion var0, WorldMapElement var1) {
      if (var0 == null) {
         var0.method5637();
      }

      if (null != var1.field5412 && null != var0.field2661 && var0.field2661.get(classHP.field2856) != null) {
         classHP var2 = classHP.method6085(var1.field5394 * 1698532127, (byte)76);
         if (var2 == null) {
            return null;
         } else {
            Font var3 = (Font)var0.field2661.get(var2);
            if (null == var3) {
               return null;
            } else {
               int var4 = var3.method43(var1.field5412, 1000000);
               String[] var5 = new String[var4];
               var3.method38(var1.field5412, null, var5);
               int var6 = var3.field8 * var5.length / 2;
               int var7 = 0;
               String[] var8 = var5;

               for (int var9 = 0; var9 < var8.length; var9++) {
                  String var10 = var8[var9];
                  int var11 = var3.method36(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new classHW(var1.field5412, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Z")
   @ObfuscatedName("bs")
   static boolean method5614(classOM var0) {
      if (var0.field4930 != null) {
         int[] var1 = var0.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            classOM var4 = classMU.method7729(var3, 2014570797);
            if (var4.field4953 * -990302710 != -1) {
               return true;
            }
         }
      } else if (-1944388660 * var0.field4953 != -1) {
         return true;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/HashMap;")
   @ObfuscatedName("rf")
   public HashMap method5737() {
      return this.field2659;
   }

   @ObfuscatedSignature(descriptor = "(IIIILha;)V")
   @ObfuscatedName("cq")
   void method5627(int var1, int var2, int var3, int var4, classHA var5) {
      for (int var6 = var1; var6 < var1 + var3; var6++) {
         label53:
         for (int var7 = var2; var7 < var4 + var2; var7++) {
            for (int var8 = 0; var8 < var5.field2752 * 1618039302; var8++) {
               classHZ[] var9 = var5.field2760[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  classHZ[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     classHZ var12 = var10[var11];
                     classOM var13 = classMU.method7729(-1759172876 * var12.field2916, 1439231117);
                     if (classUU.method11554(var13, 1217057510)) {
                        this.method5633(var13, var8, var6, var7, var5, 602222571);
                        continue label53;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("al")
   void method5643(byte var1) {
      try {
         if (null != this.field2669) {
            if (var1 <= 31) {
               throw new IllegalStateException();
            }

            classHA.method5968(this.field2669, (byte)-79);
         } else {
            Iterator var2 = this.field2657.iterator();

            while (var2.hasNext()) {
               if (var1 <= 31) {
                  throw new IllegalStateException();
               }

               classGF var3 = (classGF)var2.next();
               classHA.method5968(var3, (byte)-23);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;IIIII)Ljava/util/List;")
   @ObfuscatedName("ao")
   public static List method5729(WorldMapRegion var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         return var0.method5734(var1);
      } else {
         LinkedList var6 = new LinkedList();
         if (var4 >= var1 && var5 >= var2) {
            if (var4 < var1 + var3 && var5 < var2 + var3) {
               for (AbstractWorldMapIcon var8 : var0.field2659.values()) {
                  if (var8.method5997((byte)-51) && var8.method5993(var4, var5, (byte)-96)) {
                     var6.add(var8);
                  }
               }

               for (AbstractWorldMapIcon var10 : var0.field2658) {
                  if (var10.method5997((byte)-111) && var10.method5993(var4, var5, (byte)-23)) {
                     var6.add(var10);
                  }
               }

               return var6;
            } else {
               return var6;
            }
         } else {
            return var6;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bv")
   void method5615(int var1, int var2, int var3) {
      int var5 = -551401517 * this.field2662;
      int var6 = this.field2656 * 1312423097;
      int var7 = this.field2667 * 680806733;
      SpritePixels var4 = (SpritePixels)field2663.method6147(classCX.method2698(var5, var6, var7, (byte)1));
      if (null != var4) {
         if (621957952 * this.field2667 == var3) {
            var4.method13508(var1, var2);
         } else {
            var4.method13559(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lhw;")
   @ObfuscatedName("bt")
   classHW method5722(int var1, int var2) {
      try {
         WorldMapElement var3 = SceneTilePaint.method4796(var1, (byte)-98);
         return this.method5725(var3, 1467959558);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bz")
   void method5616(int var1, int var2, int var3) {
      int var5 = -1838604949 * this.field2662;
      int var6 = this.field2656 * 1312423097;
      int var7 = this.field2667 * 1744663631;
      SpritePixels var4 = (SpritePixels)field2663.method6147(classCX.method2698(var5, var6, var7, (byte)1));
      if (null != var4) {
         if (621957952 * this.field2667 == var3) {
            var4.method13508(var1, var2);
         } else {
            var4.method13559(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   void method5644() {
      if (null != this.field2669) {
         classHA.method5968(this.field2669, (byte)40);
      } else {
         for (classGF var2 : this.field2657) {
            classHA.method5968(var2, (byte)-91);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgl;Ljava/util/List;)V")
   @ObfuscatedName("cu")
   void method5621(classGL var1, List var2) {
      this.field2659.clear();
      this.field2669 = var1;
      this.method5639(var2, (byte)24);
   }

   @ObfuscatedSignature(descriptor = "(Lgl;Ljava/util/List;)V")
   @ObfuscatedName("cb")
   void method5622(classGL var1, List var2) {
      this.field2659.clear();
      this.field2669 = var1;
      this.method5639(var2, (byte)-122);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bh")
   void method5617(int var1, int var2, int var3) {
      int var5 = 911628504 * this.field2662;
      int var6 = this.field2656 * 1312423097;
      int var7 = this.field2667 * 680806733;
      SpritePixels var4 = (SpritePixels)field2663.method6147(classCX.method2698(var5, var6, var7, (byte)1));
      if (null != var4) {
         if (621957952 * this.field2667 == var3) {
            var4.method13508(var1, var2);
         } else {
            var4.method13559(var1, var2, var3, var3);
         }
      }
   }

   public Collection getMapIcons() {
      return Collections.unmodifiableCollection(this.method5737().values());
   }

   @ObfuscatedSignature(descriptor = "(IILha;[Lyz;)V")
   @ObfuscatedName("dn")
   void method5685(int var1, int var2, classHA var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < -1667236931 * var3.field2752; var5++) {
         classHZ[] var6 = var3.field2760[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            classHZ[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               classHZ var9 = var7[var8];
               int var11 = var9.field2914 * 1253547473;
               boolean var10 = var11 >= classKB.field3521.field3538 * 78062377 && var11 <= 78062377 * classKB.field3526.field3538;
               if (!var10) {
                  int var13 = var9.field2914 * 1253547473;
                  boolean var12 = var13 == 78062377 * classKB.field3537.field3538;
                  if (!var12) {
                     continue;
                  }
               }

               classOM var14 = classMU.method7729(var9.field2916 * -1831941567, 1924964978);
               if (-1 != var14.field4954 * 1680279607) {
                  int var15 = var9.field2915 * 374409179 != 1 && 3 != var9.field2915 * 374409179 ? 402876423 * var14.field4924 : -582306509 * var14.field4944;
                  var4[1680279607 * var14.field4954]
                     .method13812(
                        var1 * 680806733 * this.field2667,
                        (64 - var15 - var2) * this.field2667 * 680806733,
                        this.field2667 * 1361613466,
                        this.field2667 * 1361613466
                     );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILha;)V")
   @ObfuscatedName("cd")
   void method5628(int var1, int var2, int var3, int var4, classHA var5) {
      for (int var6 = var1; var6 < var1 + var3; var6++) {
         label56:
         for (int var7 = var2; var7 < var4 + var2; var7++) {
            for (int var8 = 0; var8 < var5.field2752 * -1667236931; var8++) {
               classHZ[] var9 = var5.field2760[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  classHZ[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     classHZ var12 = var10[var11];
                     classOM var13 = classMU.method7729(-1831941567 * var12.field2916, 1775677517);
                     if (classUU.method11554(var13, 1217057510)) {
                        this.method5633(var13, var8, var6, var7, var5, 82368089);
                        continue label56;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lpe;I)I")
   @ObfuscatedName("br")
   int method5715(SpritePixels var1, classPE var2, int var3) {
      try {
         switch (1700578181 * var2.field5231) {
            case 0:
               return 0;
            case 1:
               return -var1.field7007 / 2;
            default:
               return -var1.field7007;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.br(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cn")
   void method5637() {
      for (AbstractWorldMapIcon var2 : this.field2659.values()) {
         if (var2 instanceof classGS) {
            classGS.method5741((classGS)var2, -2077744068);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/List;)V")
   @ObfuscatedName("ck")
   void method5641(List var1) {
      for (classHF var3 : var1) {
         if (SceneTilePaint.method4796(var3.field2785 * -1047464521, (byte)1).field5392
            && 1870919123 * var3.field2769.field4055 >> 6 == this.field2662 * 638883745
            && this.field2656 * 1312423097 == 819227381 * var3.field2769.field4056 >> 6) {
            classHF var4 = new classHF(var3.field2769, var3.field2769, var3.field2785 * -1226273325, this.method5722(1391544085 * var3.field2785, 2015727623));
            this.field2658.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("dm")
   void method5665(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (classGF var6 : this.field2657) {
         for (int var7 = var6.method5422(-2085738907) * 8; var7 < var6.method5422(-1855988952) * 8 + 8; var7++) {
            for (int var8 = var6.method5426(-2092448097) * 8; var8 < var6.method5426(-2094425218) * 8 + 8; var8++) {
               method5671(this, var7, var8, var6, var1, var3, var4, (byte)6);
               this.method5676(var7, var8, var6, var1, var4, -1017290293);
            }
         }
      }

      for (classGF var10 : this.field2657) {
         for (int var11 = var10.method5422(-1984218074) * 8; var11 < var10.method5422(-1704589692) * 8 + 8; var11++) {
            for (int var12 = var10.method5426(-2036439783) * 8; var12 < var10.method5426(-2122505821) * 8 + 8; var12++) {
               this.method5668(var11, var12, var10, var1, var2, (byte)86);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lhu;Lge;)V")
   @ObfuscatedName("dt")
   void method5672(int var1, int var2, classHA var3, classHH var4, classHU var5, classGE var6) {
      int var7 = var3.field2758[0][var1][var2] - 1;
      int var8 = var3.field2759[0][var1][var2] - 1;
      if (-1 == var7 && -1 == var8) {
         classYW.method13698(
            680806733 * this.field2667 * var1,
            680806733 * this.field2667 * (63 - var2),
            680806733 * this.field2667,
            this.field2667 * 680806733,
            288074485 * this.field2660
         );
      }

      int var9 = 16711935;
      if (var8 != -1) {
         var9 = WorldMapElement.method9182(var8, 288074485 * this.field2660, var6, -1378665219);
      }

      if (var8 > -1 && 0 == var3.field2757[0][var1][var2]) {
         classYW.method13698(
            680806733 * this.field2667 * var1, (63 - var2) * this.field2667 * 680806733, this.field2667 * 680806733, this.field2667 * 680806733, var9
         );
      } else {
         int var10 = method5680(this, var1, var2, var3, var5, -1255554545);
         if (var8 == -1) {
            classYW.method13698(
               this.field2667 * 680806733 * var1, (63 - var2) * this.field2667 * 680806733, 680806733 * this.field2667, this.field2667 * 680806733, var10
            );
         } else {
            var4.method6012(
               var1 * this.field2667 * 680806733,
               (63 - var2) * this.field2667 * 680806733,
               var10,
               var9,
               this.field2667 * 680806733,
               this.field2667 * 680806733,
               var3.field2757[0][var1][var2],
               var3.field2756[0][var1][var2],
               980481800
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   void method5645() {
      if (null != this.field2669) {
         classHA.method5968(this.field2669, (byte)-37);
      } else {
         for (classGF var2 : this.field2657) {
            classHA.method5968(var2, (byte)-22);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lge;)V")
   @ObfuscatedName("dw")
   void method5677(int var1, int var2, classHA var3, classHH var4, classGE var5) {
      for (int var6 = 1; var6 < var3.field2752 * -1667236931; var6++) {
         int var7 = var3.field2759[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = WorldMapElement.method9182(var7, this.field2660 * 288074485, var5, -1313828822);
            if (0 == var3.field2757[var6][var1][var2]) {
               classYW.method13698(
                  this.field2667 * 28285155 * var1,
                  (-349447874 - var2) * 680806733 * this.field2667,
                  this.field2667 * 937426308,
                  this.field2667 * 680806733,
                  var8
               );
            } else {
               var4.method6012(
                  var1 * this.field2667 * 1730859881,
                  (63 - var2) * this.field2667 * 680806733,
                  0,
                  var8,
                  680806733 * this.field2667,
                  680806733 * this.field2667,
                  var3.field2757[var6][var1][var2],
                  var3.field2756[var6][var1][var2],
                  980481800
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILva;)Z")
   @ObfuscatedName("ch")
   boolean method5648(int var1, AbstractArchive var2) {
      this.field2659.clear();
      int var3 = classDG.method3057(this.field2662 * -551401517, 1312423097 * this.field2656, (byte)-43);
      byte[] var4 = var2.method11867(var3, var1, -1441875101);
      Buffer var5 = null;
      if (var4 != null) {
         var5 = new Buffer(var4);
      }

      if (null != this.field2669) {
         this.field2669.method5962(var5, (byte)61);
         if (classHA.method5959(this.field2669, (byte)-6)) {
            method5631(this, 0, 0, 64, 64, this.field2669, -1645911389);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var6 = true;

         for (classGF var8 : this.field2657) {
            var8.method5962(var5, (byte)88);
            var6 &= classHA.method5959(var8, (byte)17);
         }

         if (var6) {
            for (classGF var10 : this.field2657) {
               method5631(this, var10.method5422(-1996254876) * 8, var10.method5426(-2029911932) * 8, 8, 8, var10, -1478433216);
            }
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;IIIII)V")
   @ObfuscatedName("ah")
   void method5698(WorldMapElement var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         SpritePixels var7 = var1.method9199(false, -1113911178);
         if (null == var7) {
            if (var6 >= 1564893887) {
               throw new IllegalStateException();
            }
         } else {
            SpritePixels.method13511(var7, var2 - var7.field7007 / 2, var3 - var7.field7009 / 2);
            if (var4 % var5 < var5 / 2) {
               if (var6 >= 1564893887) {
                  return;
               }

               classYW.method13689(var2, var3, 15, 16776960, 128);
               classYW.method13689(var2, var3, 7, 16777215, 256);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "gr.ah(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lym;Lpe;)I")
   @ObfuscatedName("sh")
   public static int method5716(WorldMapRegion var0, SpritePixels var1, classPE var2) {
      if (var0 == null) {
         var0.method5737();
      }

      switch (390439893 * var2.field5231) {
         case 0:
            return 0;
         case 1:
            return -var1.field7007 / 2;
         default:
            return -var1.field7007;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;ILhh;[Lyz;Lva;Lva;D)V")
   @ObfuscatedName("ay")
   void method5651(WorldMapArea var1, int var2, classHH var3, IndexedSprite[] var4, AbstractArchive var5, AbstractArchive var6, double var7) {
      try {
         this.field2667 = -908060795 * var2;
         if (null != this.field2669 || !this.field2657.isEmpty()) {
            int var10 = -551401517 * this.field2662;
            int var11 = this.field2656 * 1312423097;
            SpritePixels var9 = (SpritePixels)field2663.method6147(classCX.method2698(var10, var11, var2, (byte)1));
            if (null == var9) {
               if (classFH.method4702() != var7) {
                  classFH.method4694(var7);
               }

               boolean var12 = true;
               var12 &= this.method5646(var1.method5848(-608589044), var5, 1285314194);
               int var14 = classDG.method3057(this.field2662 * -551401517, this.field2656 * 1312423097, (byte)59);
               var12 &= var6.method11866(var14, -906797091);
               if (var12) {
                  byte[] var13 = var6.method11867(var14, var1.method5848(-608589044), -1555239139);
                  classHU var15;
                  if (var13 == null) {
                     var15 = new classHU();
                  } else {
                     SpritePixels var16 = classIT.method6314(var13, 1820082454);
                     if (null == var16) {
                        var15 = new classHU();
                     } else {
                        var15 = new classHU(var16.field7005);
                     }
                  }

                  SpritePixels var17 = new SpritePixels(621957952 * this.field2667, 621957952 * this.field2667);
                  var17.method13477();
                  if (null != this.field2669) {
                     method5662(this, var3, var4, var15, new classHQ(), -717963337);
                  } else {
                     this.method5664(var3, var4, var15, new classHQ(), -2049758853);
                  }

                  int var18 = -551401517 * this.field2662;
                  int var19 = this.field2656 * 1312423097;
                  int var20 = 680806733 * this.field2667;
                  field2663.method6157(var17, classCX.method2698(var18, var19, var20, (byte)1), 4 * var17.field7005.length);
                  this.method5643((byte)61);
               }
            }
         }
      } catch (RuntimeException var21) {
         throw classEG.newRunException(var21, "gr.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;IIIILha;)V")
   @ObfuscatedName("yk")
   public static void method5629(WorldMapRegion var0, int var1, int var2, int var3, int var4, classHA var5) {
      if (var0 == null) {
         var0.method5730(var1, var1, var1, var1, var1);
      }

      for (int var6 = var1; var6 < var1 + var3; var6++) {
         label60:
         for (int var7 = var2; var7 < var4 + var2; var7++) {
            for (int var8 = 0; var8 < var5.field2752 * -1667236931; var8++) {
               classHZ[] var9 = var5.field2760[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  classHZ[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     classHZ var12 = var10[var11];
                     classOM var13 = classMU.method7729(-2066145620 * var12.field2916, 1893475433);
                     if (classUU.method11554(var13, 1217057510)) {
                        var0.method5633(var13, var8, var6, var7, var5, 1424067734);
                        continue label60;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;IILha;Lhu;I)I")
   @ObfuscatedName("gp")
   public static int method5680(WorldMapRegion var0, int var1, int var2, classHA var3, classHU var4, int var5) {
      if (var0 == null) {
         var0.method5683(var1, var1, var3, var4, var1);
      }

      try {
         if (var3.field2758[0][var1][var2] == 0) {
            if (var5 != -1255554545) {
               throw new IllegalStateException();
            } else {
               return 288074485 * var0.field2660;
            }
         } else {
            return var4.method6115(var1, var2, (byte)6);
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bl")
   void method5618(int var1, int var2, int var3) {
      int var5 = -551401517 * this.field2662;
      int var6 = this.field2656 * 1312423097;
      int var7 = this.field2667 * 680806733;
      SpritePixels var4 = (SpritePixels)field2663.method6147(classCX.method2698(var5, var6, var7, (byte)1));
      if (null != var4) {
         if (621957952 * this.field2667 == var3) {
            var4.method13508(var1, var2);
         } else {
            var4.method13559(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;)V")
   @ObfuscatedName("cj")
   void method5654(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.method5690(var1, var2, var4, var3, (byte)3);
      this.method5713(var1, var2, var4, var3, 543832187);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("ci")
   void method5655(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.field2659.values()) {
         if (var5.method5997((byte)-54)) {
            int var6 = var5.vmethod486((byte)-45);
            if (var1.contains(var6)) {
               WorldMapElement var7 = SceneTilePaint.method4796(var6, (byte)-52);
               this.method5698(var7, 797816725 * var5.field2771, 655244251 * var5.field2772, var2, var3, -2059129008);
            }
         }
      }

      this.method5696(var1, var2, var3, (byte)61);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("cx")
   void method5656(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.field2659.values()) {
         if (var5.method5997((byte)-78)) {
            int var6 = var5.vmethod486((byte)-102);
            if (var1.contains(var6)) {
               WorldMapElement var7 = SceneTilePaint.method4796(var6, (byte)-72);
               this.method5698(var7, 797816725 * var5.field2771, 655244251 * var5.field2772, var2, var3, -2055826933);
            }
         }
      }

      this.method5696(var1, var2, var3, (byte)101);
   }

   @ObfuscatedSignature(descriptor = "(IIIILha;)V")
   @ObfuscatedName("cp")
   void method5630(int var1, int var2, int var3, int var4, classHA var5) {
      for (int var6 = var1; var6 < var1 + var3; var6++) {
         label53:
         for (int var7 = var2; var7 < var4 + var2; var7++) {
            for (int var8 = 0; var8 < var5.field2752 * -1667236931; var8++) {
               classHZ[] var9 = var5.field2760[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  classHZ[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     classHZ var12 = var10[var11];
                     classOM var13 = classMU.method7729(-1831941567 * var12.field2916, 1779905438);
                     if (classUU.method11554(var13, 1217057510)) {
                        this.method5633(var13, var8, var6, var7, var5, 582751434);
                        continue label53;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("cm")
   void method5660(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (int var5 = 0; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 64; var6++) {
            method5671(this, var5, var6, this.field2669, var1, var3, var4, (byte)13);
            this.method5676(var5, var6, this.field2669, var1, var4, -1017290293);
         }
      }

      for (int var7 = 0; var7 < 64; var7++) {
         for (int var8 = 0; var8 < 64; var8++) {
            this.method5668(var7, var8, this.field2669, var1, var2, (byte)51);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("ds")
   void method5694(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.field2658) {
         if (var5.method5997((byte)-115)) {
            WorldMapElement var6 = SceneTilePaint.method4796(var5.vmethod486((byte)-79), (byte)-80);
            if (var6 != null && var1.contains(var6.method9203((byte)0))) {
               this.method5698(var6, var5.field2771 * 1976372191, 655244251 * var5.field2772, var2, var3, 1496204167);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("dd")
   void method5666(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (classGF var6 : this.field2657) {
         for (int var7 = var6.method5422(-1921428979) * 8; var7 < var6.method5422(-1745085946) * 8 + 8; var7++) {
            for (int var8 = var6.method5426(-2131117581) * 8; var8 < var6.method5426(-2063606997) * 8 + 8; var8++) {
               method5671(this, var7, var8, var6, var1, var3, var4, (byte)31);
               this.method5676(var7, var8, var6, var1, var4, -1017290293);
            }
         }
      }

      for (classGF var10 : this.field2657) {
         for (int var11 = var10.method5422(-1993784243) * 8; var11 < var10.method5422(-1811505557) * 8 + 8; var11++) {
            for (int var12 = var10.method5426(-2035136236) * 8; var12 < var10.method5426(-2139752523) * 8 + 8; var12++) {
               this.method5668(var11, var12, var10, var1, var2, (byte)68);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;IIIS)V")
   @ObfuscatedName("nf")
   public static void method5619(WorldMapRegion var0, int var1, int var2, int var3, short var4) {
      if (var0 == null) {
         var0.method5620(var1, var1, var1, var4);
      } else {
         try {
            int var6 = -551401517 * var0.field2662;
            int var7 = var0.field2656 * 1312423097;
            int var8 = var0.field2667 * 680806733;
            SpritePixels var5 = (SpritePixels)field2663.method6147(classCX.method2698(var6, var7, var8, (byte)1));
            if (null == var5) {
               if (var4 > 128) {
                  ;
               }
            } else {
               if (621957952 * var0.field2667 == var3) {
                  if (var4 <= 128) {
                     return;
                  }

                  var5.method13508(var1, var2);
               } else {
                  var5.method13559(var1, var2, var3, var3);
               }
            }
         } catch (RuntimeException var10) {
            throw classEG.newRunException(var10, "gr.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("dx")
   void method5667(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (classGF var6 : this.field2657) {
         for (int var7 = var6.method5422(-1852564526) * 8; var7 < var6.method5422(-1857577570) * 8 + 8; var7++) {
            for (int var8 = var6.method5426(-2140855414) * 8; var8 < var6.method5426(-2125691689) * 8 + 8; var8++) {
               method5671(this, var7, var8, var6, var1, var3, var4, (byte)94);
               this.method5676(var7, var8, var6, var1, var4, -1017290293);
            }
         }
      }

      for (classGF var10 : this.field2657) {
         for (int var11 = var10.method5422(-1921243593) * 8; var11 < var10.method5422(-2136259364) * 8 + 8; var11++) {
            for (int var12 = var10.method5426(-2073642164) * 8; var12 < var10.method5426(-2055961944) * 8 + 8; var12++) {
               this.method5668(var11, var12, var10, var1, var2, (byte)25);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;[Lyz;)V")
   @ObfuscatedName("dy")
   void method5669(int var1, int var2, classHA var3, classHH var4, IndexedSprite[] var5) {
      this.method5688(var1, var2, var3, 541210997);
      this.method5684(var1, var2, var3, var5, 801221335);
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;[Lyz;)V")
   @ObfuscatedName("di")
   void method5670(int var1, int var2, classHA var3, classHH var4, IndexedSprite[] var5) {
      this.method5688(var1, var2, var3, -73334254);
      this.method5684(var1, var2, var3, var5, 801221335);
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lhu;Lge;)V")
   @ObfuscatedName("du")
   void method5673(int var1, int var2, classHA var3, classHH var4, classHU var5, classGE var6) {
      int var7 = var3.field2758[0][var1][var2] - 1;
      int var8 = var3.field2759[0][var1][var2] - 1;
      if (-1 == var7 && -1 == var8) {
         classYW.method13698(
            680806733 * this.field2667 * var1,
            609184860 * this.field2667 * (893108332 - var2),
            991973274 * this.field2667,
            this.field2667 * 1879951,
            759805682 * this.field2660
         );
      }

      int var9 = 16711935;
      if (var8 != -1) {
         var9 = WorldMapElement.method9182(var8, -155991272 * this.field2660, var6, -959833637);
      }

      if (var8 > -1 && 0 == var3.field2757[0][var1][var2]) {
         classYW.method13698(
            1338066436 * this.field2667 * var1, (63 - var2) * this.field2667 * 680806733, this.field2667 * 680806733, this.field2667 * -2011495642, var9
         );
      } else {
         int var10 = method5680(this, var1, var2, var3, var5, -1255554545);
         if (var8 == -1) {
            classYW.method13698(
               this.field2667 * 680806733 * var1,
               (531519024 - var2) * this.field2667 * 680806733,
               680806733 * this.field2667,
               this.field2667 * 680806733,
               var10
            );
         } else {
            var4.method6012(
               var1 * this.field2667 * 680806733,
               (1208921947 - var2) * this.field2667 * 1152669316,
               var10,
               var9,
               this.field2667 * -796718584,
               this.field2667 * 866421463,
               var3.field2757[0][var1][var2],
               var3.field2756[0][var1][var2],
               980481800
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;)V")
   @ObfuscatedName("ce")
   void method5661(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4) {
      for (int var5 = 0; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 1771315823; var6++) {
            method5671(this, var5, var6, this.field2669, var1, var3, var4, (byte)34);
            this.method5676(var5, var6, this.field2669, var1, var4, -1017290293);
         }
      }

      for (int var7 = 0; var7 < 64; var7++) {
         for (int var8 = 0; var8 < 64; var8++) {
            this.method5668(var7, var8, this.field2669, var1, var2, (byte)57);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lhu;Lge;)V")
   @ObfuscatedName("dr")
   void method5674(int var1, int var2, classHA var3, classHH var4, classHU var5, classGE var6) {
      int var7 = var3.field2758[0][var1][var2] - 1;
      int var8 = var3.field2759[0][var1][var2] - 1;
      if (-1 == var7 && -1 == var8) {
         classYW.method13698(
            1057174447 * this.field2667 * var1,
            680806733 * this.field2667 * (63 - var2),
            680806733 * this.field2667,
            this.field2667 * 680806733,
            -885089342 * this.field2660
         );
      }

      int var9 = -1456385724;
      if (var8 != -1) {
         var9 = WorldMapElement.method9182(var8, 288074485 * this.field2660, var6, -2046105688);
      }

      if (var8 > -1 && 0 == var3.field2757[0][var1][var2]) {
         classYW.method13698(
            546251007 * this.field2667 * var1, (63 - var2) * this.field2667 * 680806733, this.field2667 * 680806733, this.field2667 * -582573020, var9
         );
      } else {
         int var10 = method5680(this, var1, var2, var3, var5, -1255554545);
         if (var8 == -1) {
            classYW.method13698(
               this.field2667 * 680806733 * var1,
               (-718646756 - var2) * this.field2667 * -944707294,
               1973071837 * this.field2667,
               this.field2667 * -230174861,
               var10
            );
         } else {
            var4.method6012(
               var1 * this.field2667 * 680806733,
               (63 - var2) * this.field2667 * 680806733,
               var10,
               var9,
               this.field2667 * 680806733,
               this.field2667 * 1260179876,
               var3.field2757[0][var1][var2],
               var3.field2756[0][var1][var2],
               980481800
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lge;)V")
   @ObfuscatedName("dk")
   void method5678(int var1, int var2, classHA var3, classHH var4, classGE var5) {
      for (int var6 = 1; var6 < var3.field2752 * -1667236931; var6++) {
         int var7 = var3.field2759[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = WorldMapElement.method9182(var7, this.field2660 * -962674413, var5, -1410352166);
            if (0 == var3.field2757[var6][var1][var2]) {
               classYW.method13698(
                  this.field2667 * -126044426 * var1, (63 - var2) * 902351597 * this.field2667, this.field2667 * 1810733971, this.field2667 * 680806733, var8
               );
            } else {
               var4.method6012(
                  var1 * this.field2667 * 1695042806,
                  (2113180073 - var2) * this.field2667 * 680806733,
                  0,
                  var8,
                  680806733 * this.field2667,
                  680806733 * this.field2667,
                  var3.field2757[var6][var1][var2],
                  var3.field2756[var6][var1][var2],
                  980481800
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lge;)V")
   @ObfuscatedName("db")
   void method5679(int var1, int var2, classHA var3, classHH var4, classGE var5) {
      for (int var6 = 1; var6 < var3.field2752 * -1667236931; var6++) {
         int var7 = var3.field2759[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = WorldMapElement.method9182(var7, this.field2660 * 288074485, var5, -884422306);
            if (0 == var3.field2757[var6][var1][var2]) {
               classYW.method13698(
                  this.field2667 * 680806733 * var1, (63 - var2) * -1683289488 * this.field2667, this.field2667 * 680806733, this.field2667 * 808044581, var8
               );
            } else {
               var4.method6012(
                  var1 * this.field2667 * 680806733,
                  (63 - var2) * this.field2667 * -1847178377,
                  0,
                  var8,
                  680806733 * this.field2667,
                  -227540918 * this.field2667,
                  var3.field2757[var6][var1][var2],
                  var3.field2756[var6][var1][var2],
                  980481800
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILva;)Z")
   @ObfuscatedName("cg")
   boolean method5649(int var1, AbstractArchive var2) {
      this.field2659.clear();
      int var3 = classDG.method3057(this.field2662 * -551401517, 1312423097 * this.field2656, (byte)54);
      byte[] var4 = var2.method11867(var3, var1, -1152032383);
      Buffer var5 = null;
      if (var4 != null) {
         var5 = new Buffer(var4);
      }

      if (null != this.field2669) {
         this.field2669.method5962(var5, (byte)102);
         if (classHA.method5959(this.field2669, (byte)-45)) {
            method5631(this, 0, 0, 64, 64, this.field2669, -2139971437);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var6 = true;

         for (classGF var8 : this.field2657) {
            var8.method5962(var5, (byte)80);
            var6 &= classHA.method5959(var8, (byte)21);
         }

         if (var6) {
            for (classGF var10 : this.field2657) {
               method5631(this, var10.method5422(-1675867710) * 8, var10.method5426(-2025975957) * 8, 8, 8, var10, -1391327371);
            }
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;IILjava/util/HashSet;I)V")
   @ObfuscatedName("vc")
   public static void method5692(WorldMapRegion var0, int var1, int var2, HashSet var3, int var4) {
      if (var0 == null) {
         var0.method5730(var1, var1, var1, var1, var1);
      }

      float var5 = var4 / 64.0F;
      float var6 = var5 / 2.0F;

      for (Entry var8 : var0.field2659.entrySet()) {
         classKY var9 = (classKY)var8.getKey();
         int var10 = (int)(var5 * (var9.field4055 * 1870919123) + var1 - var6);
         int var11 = (int)(var2 + var4 - var5 * (819227381 * var9.field4056) - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.method5997((byte)-18)) {
            var12.field2771 = 1807202930 * var10;
            var12.field2772 = var11 * 1689733203;
            WorldMapElement var13 = SceneTilePaint.method4796(var12.vmethod486((byte)-65), (byte)-99);
            if (!var3.contains(var13.method9203((byte)0))) {
               var0.method5700(var12, var10, var11, var5, (byte)32);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhu;)I")
   @ObfuscatedName("dh")
   int method5681(int var1, int var2, classHA var3, classHU var4) {
      return var3.field2758[0][var1][var2] == 0 ? -121537779 * this.field2660 : var4.method6115(var1, var2, (byte)-20);
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhu;)I")
   @ObfuscatedName("de")
   int method5682(int var1, int var2, classHA var3, classHU var4) {
      return var3.field2758[0][var1][var2] == 0 ? -1604479368 * this.field2660 : var4.method6115(var1, var2, (byte)-110);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bb")
   static long method5607(int var0, int var1, int var2) {
      return var2 << 16 | var0 << 8 | var1;
   }

   @ObfuscatedSignature(descriptor = "(IILha;[Lyz;)V")
   @ObfuscatedName("dv")
   void method5686(int var1, int var2, classHA var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < -1667236931 * var3.field2752; var5++) {
         classHZ[] var6 = var3.field2760[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            classHZ[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               classHZ var9 = var7[var8];
               int var11 = var9.field2914 * 1253547473;
               boolean var10 = var11 >= classKB.field3521.field3538 * 78062377 && var11 <= 78062377 * classKB.field3526.field3538;
               if (!var10) {
                  int var13 = var9.field2914 * -751544977;
                  boolean var12 = var13 == 78062377 * classKB.field3537.field3538;
                  if (!var12) {
                     continue;
                  }
               }

               classOM var14 = classMU.method7729(var9.field2916 * -1831941567, 1942075009);
               if (-1 != var14.field4954 * 1680279607) {
                  int var15 = var9.field2915 * 750862542 != 1 && 3 != var9.field2915 * 374409179 ? -1446838028 * var14.field4924 : -582306509 * var14.field4944;
                  var4[-1769935665 * var14.field4954]
                     .method13812(
                        var1 * 680806733 * this.field2667,
                        (64 - var15 - var2) * this.field2667 * 680806733,
                        this.field2667 * 1361613466,
                        this.field2667 * 1206907360
                     );
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lym;Lpe;)I")
   @ObfuscatedName("gm")
   public static int method5717(WorldMapRegion var0, SpritePixels var1, classPE var2) {
      if (var0 == null) {
         var0.getMapIcons();
      }

      switch (1700578181 * var2.field5231) {
         case 0:
            return 0;
         case 1:
            return -var1.field7007 / 2;
         default:
            return -var1.field7007;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;[Lyz;)V")
   @ObfuscatedName("dz")
   void method5687(int var1, int var2, classHA var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < -96940946 * var3.field2752; var5++) {
         classHZ[] var6 = var3.field2760[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            classHZ[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               classHZ var9 = var7[var8];
               int var11 = var9.field2914 * 1253547473;
               boolean var10 = var11 >= classKB.field3521.field3538 * 1249505821 && var11 <= 78062377 * classKB.field3526.field3538;
               if (!var10) {
                  int var13 = var9.field2914 * 1253547473;
                  boolean var12 = var13 == 151502973 * classKB.field3537.field3538;
                  if (!var12) {
                     continue;
                  }
               }

               classOM var14 = classMU.method7729(var9.field2916 * -1113044954, 1601758517);
               if (-1 != var14.field4954 * 1954960064) {
                  int var15 = var9.field2915 * 772052502 != 1 && 3 != var9.field2915 * 1968754761 ? -1103455974 * var14.field4924 : 70560759 * var14.field4944;
                  var4[649712750 * var14.field4954]
                     .method13812(
                        var1 * 680806733 * this.field2667,
                        (64 - var15 - var2) * this.field2667 * 680806733,
                        this.field2667 * 1361613466,
                        this.field2667 * 699589741
                     );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;Lhh;[Lyz;Lhu;Lge;I)V")
   @ObfuscatedName("bq")
   public static void method5662(WorldMapRegion var0, classHH var1, IndexedSprite[] var2, classHU var3, classGE var4, int var5) {
      if (var0 == null) {
         var0.method5663(var1, var2, var3, var4, var5);
      }

      try {
         for (int var6 = 0; var6 < 64; var6++) {
            if (var5 >= -711998756) {
               return;
            }

            for (int var7 = 0; var7 < 64; var7++) {
               if (var5 >= -711998756) {
                  throw new IllegalStateException();
               }

               method5671(var0, var6, var7, var0.field2669, var1, var3, var4, (byte)77);
               var0.method5676(var6, var7, var0.field2669, var1, var4, -1017290293);
            }
         }

         for (int var9 = 0; var9 < 64; var9++) {
            if (var5 >= -711998756) {
               throw new IllegalStateException();
            }

            for (int var10 = 0; var10 < 64; var10++) {
               if (var5 >= -711998756) {
                  return;
               }

               var0.method5668(var9, var10, var0.field2669, var1, var2, (byte)127);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "gr.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public static void method5612() {
      field2663.method6161(5);
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;I)V")
   @ObfuscatedName("dq")
   void method5693(int var1, int var2, HashSet var3, int var4) {
      float var5 = var4 / 64.0F;
      float var6 = var5 / 2.0F;

      for (Entry var8 : this.field2659.entrySet()) {
         classKY var9 = (classKY)var8.getKey();
         int var10 = (int)(var5 * (var9.field4055 * 1870919123) + var1 - var6);
         int var11 = (int)(var2 + var4 - var5 * (819227381 * var9.field4056) - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.method5997((byte)-86)) {
            var12.field2771 = 1179114429 * var10;
            var12.field2772 = var11 * 1689733203;
            WorldMapElement var13 = SceneTilePaint.method4796(var12.vmethod486((byte)-37), (byte)-104);
            if (!var3.contains(var13.method9203((byte)0))) {
               this.method5700(var12, var10, var11, var5, (byte)32);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhd;Lps;IIFI)V")
   @ObfuscatedName("bc")
   void method5708(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5, int var6) {
      try {
         classHW var7 = var1.vmethod491((byte)-81);
         if (null != var7) {
            if (!var7.field2901.method6087(var5, -152388045)) {
               if (var6 >= 1146930136) {
                  throw new IllegalStateException();
               }
            } else {
               Font var8 = (Font)this.field2661.get(var7.field2901);
               var8.method66(
                  var7.field2900,
                  var3 - 2116737063 * var7.field2902 / 2,
                  var4,
                  var7.field2902 * 2116737063,
                  -737746087 * var7.field2899,
                  0xFF000000 | 257956491 * var2.field5408,
                  0,
                  1,
                  0,
                  var8.field8 / 2
               );
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "gr.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("df")
   void method5695(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.field2658) {
         if (var5.method5997((byte)-10)) {
            WorldMapElement var6 = SceneTilePaint.method4796(var5.vmethod486((byte)-58), (byte)-69);
            if (var6 != null && var1.contains(var6.method9203((byte)0))) {
               this.method5698(var6, var5.field2771 * 797816725, 655244251 * var5.field2772, var2, var3, -1286077523);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIB)V")
   @ObfuscatedName("ad")
   void method5657(HashSet var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.field2659.values().iterator();

         while (var5.hasNext()) {
            if (var4 >= 8) {
               throw new IllegalStateException();
            }

            AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
            if (!var6.method5997((byte)-76)) {
               if (var4 >= 8) {
                  throw new IllegalStateException();
               }
            } else {
               int var7 = var6.vmethod486((byte)-124);
               if (var1.contains(var7)) {
                  if (var4 >= 8) {
                     return;
                  }

                  WorldMapElement var8 = SceneTilePaint.method4796(var7, (byte)-89);
                  this.method5698(var8, 797816725 * var6.field2771, 655244251 * var6.field2772, var2, var3, 708381924);
               }
            }
         }

         this.method5696(var1, var2, var3, (byte)39);
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "gr.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;IIII)V")
   @ObfuscatedName("dj")
   void method5699(WorldMapElement var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.method9199(false, 413620383);
      if (null != var6) {
         SpritePixels.method13511(var6, var2 - var6.field7007 / 2, var3 - var6.field7009 / 2);
         if (var4 % var5 < var5 / 2) {
            classYW.method13689(var2, var3, 15, 16776960, 128);
            classYW.method13689(var2, var3, 7, 163101928, -1962339980);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhd;Lps;IIF)V")
   @ObfuscatedName("el")
   void method5709(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      classHW var6 = var1.vmethod491((byte)-64);
      if (null != var6) {
         if (var6.field2901.method6087(var5, -378769035)) {
            Font var7 = (Font)this.field2661.get(var6.field2901);
            var7.method66(
               var6.field2900,
               var3 - 2116737063 * var6.field2902 / 2,
               var4,
               var6.field2902 * 2116737063,
               -737746087 * var6.field2899,
               0xFF000000 | -1185021451 * var2.field5408,
               0,
               1,
               0,
               var7.field8 / 2
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhd;IIF)V")
   @ObfuscatedName("ey")
   void method5701(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = SceneTilePaint.method4796(var1.vmethod486((byte)-73), (byte)-82);
      this.method5706(var5, var2, var3, -921336222);
      this.method5708(var1, var5, var2, var3, var4, 854072992);
   }

   @ObfuscatedSignature(descriptor = "(Lhd;IIF)V")
   @ObfuscatedName("ea")
   void method5702(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = SceneTilePaint.method4796(var1.vmethod486((byte)7), (byte)-14);
      this.method5706(var5, var2, var3, 168356072);
      this.method5708(var1, var5, var2, var3, var4, 313818958);
   }

   @ObfuscatedSignature(descriptor = "(II)Lsn;")
   @ObfuscatedName("ae")
   static classSN method5658(int var0, int var1) {
      try {
         classSN var2 = classUG.method11321(var0, -545503834);
         if (var2 != null) {
            if (var1 <= -1032126936) {
               throw new IllegalStateException();
            }

            if (var2.method10543((byte)-96)) {
               if (var1 <= -1032126936) {
                  throw new IllegalStateException();
               }

               return var2;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "gr.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lps;II)V")
   @ObfuscatedName("es")
   void method5707(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.method9199(false, 1155356910);
      if (null != var4) {
         int var5 = this.method5715(var4, var1.field5402, 1866889577);
         int var6 = this.method5719(var4, var1.field5397, -556550252);
         SpritePixels.method13511(var4, var2 + var5, var3 + var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIB)V")
   @ObfuscatedName("am")
   void method5696(HashSet var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.field2658.iterator();

         while (var5.hasNext()) {
            if (var4 <= 0) {
               return;
            }

            AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
            if (!var6.method5997((byte)-5)) {
               if (var4 <= 0) {
                  return;
               }
            } else {
               WorldMapElement var7 = SceneTilePaint.method4796(var6.vmethod486((byte)-77), (byte)-23);
               if (var7 != null && var1.contains(var7.method9203((byte)0))) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.method5698(var7, var6.field2771 * 797816725, 655244251 * var6.field2772, var2, var3, 543770908);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "gr.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhd;Lps;IIF)V")
   @ObfuscatedName("ev")
   void method5710(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      classHW var6 = var1.vmethod491((byte)-79);
      if (null != var6) {
         if (var6.field2901.method6087(var5, 1778997976)) {
            Font var7 = (Font)this.field2661.get(var6.field2901);
            var7.method66(
               var6.field2900,
               var3 - 2116737063 * var6.field2902 / 2,
               var4,
               var6.field2902 * 2116737063,
               -737746087 * var6.field2899,
               0xFF000000 | 257956491 * var2.field5408,
               0,
               1,
               0,
               var7.field8 / 2
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;)V")
   @ObfuscatedName("do")
   void method5689(int var1, int var2, classHA var3) {
      for (int var4 = 0; var4 < -1667236931 * var3.field2752; var4++) {
         classHZ[] var5 = var3.field2760[var4][var1][var2];
         if (var5 != null && 0 != var5.length) {
            classHZ[] var6 = var5;

            for (int var7 = 0; var7 < var6.length; var7++) {
               classHZ var8 = var6[var7];
               if (classJW.method6418(var8.field2914 * 1253547473, 1514103518)) {
                  classOM var9 = classMU.method7729(var8.field2916 * 828790790, 1993527088);
                  int var10 = var9.field4923 * 1663954033 != 0 ? 907244563 : 354202134;
                  if (classKB.field3515.field3538 * 78062377 == var8.field2914 * 1253547473) {
                     this.method5736(var1, var2, var8.field2915 * -1606626361, var10, -216699479);
                  }

                  if (classKB.field3517.field3538 * -17748798 == var8.field2914 * 1253547473) {
                     this.method5736(var1, var2, 374409179 * var8.field2915, -1830124057, -1272781425);
                     this.method5736(var1, var2, -1140221311 * var8.field2915 + 1, var10, 384673505);
                  }

                  if (var8.field2914 * 754467151 == 206851662 * classKB.field3518.field3538) {
                     if (var8.field2915 * 374409179 == 0) {
                        classYW.method13717(var1 * this.field2667 * -1197979380, -1335159914 * this.field2667 * (63 - var2), 1, var10);
                     }

                     if (1 == var8.field2915 * -412990757) {
                        classYW.method13717(
                           1085274210 * this.field2667 + var1 * this.field2667 * 1784041792 - 1, this.field2667 * 186422391 * (-1410476161 - var2), 1, var10
                        );
                     }

                     if (374409179 * var8.field2915 == 2) {
                        classYW.method13717(
                           1411361001 * this.field2667 + this.field2667 * 680806733 * var1 - 1,
                           (422128300 - var2) * 680806733 * this.field2667 + this.field2667 * 1478006004 - 1,
                           1,
                           var10
                        );
                     }

                     if (var8.field2915 * 374409179 == 3) {
                        classYW.method13717(
                           var1 * this.field2667 * 680806733, this.field2667 * 680806733 + this.field2667 * 680806733 * (63 - var2) - 1, 1, var10
                        );
                     }
                  }

                  if (1281769178 * var8.field2914 == -617979631 * classKB.field3519.field3538) {
                     int var11 = var8.field2915 * -1120880974 % 2;
                     if (0 == var11) {
                        for (int var13 = 0; var13 < -1997896363 * this.field2667; var13++) {
                           classYW.method13717(var1 * this.field2667 * 301272702 + var13, this.field2667 * 680806733 * (64 - var2) - 1 - var13, 1, var10);
                        }
                     } else {
                        for (int var12 = 0; var12 < 680806733 * this.field2667; var12++) {
                           classYW.method13717(var12 + var1 * 1267618269 * this.field2667, var12 + this.field2667 * 680806733 * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhd;Lps;IIF)V")
   @ObfuscatedName("eh")
   void method5711(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      classHW var6 = var1.vmethod491((byte)-4);
      if (null != var6) {
         if (var6.field2901.method6087(var5, 1791098707)) {
            Font var7 = (Font)this.field2661.get(var6.field2901);
            var7.method66(
               var6.field2900,
               var3 - 2116737063 * var6.field2902 / 2,
               var4,
               var6.field2902 * 1220136105,
               -2132459495 * var6.field2899,
               0xFF000000 | -1562446460 * var2.field5408,
               0,
               1,
               0,
               var7.field8 / 2
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lom;IIILha;)V")
   @ObfuscatedName("cv")
   void method5634(classOM var1, int var2, int var3, int var4, classHA var5) {
      classKY var6 = new classKY(var2, -929958720 * this.field2662 + var3, var4 + -1904267712 * this.field2656);
      Object var7 = null;
      if (this.field2669 != null) {
         var7 = new classKY(
            this.field2669.field2753 * -1972608530 + var2, 867220831 * this.field2669.field2754 + var3, var4 + this.field2669.field2755 * 747140416
         );
      } else {
         classGF var8 = (classGF)var5;
         var7 = new classKY(
            var2 + var8.field2753 * -865818558,
            var3 + var8.field2754 * -1303084352 + var8.method5415((byte)98) * 8,
            var4 + 747140416 * var8.field2755 + classGF.method5419(var8, -326352541) * 8
         );
      }

      Object var11;
      if (null != var1.field4930) {
         var11 = new classGS((classKY)var7, var6, 1662532640 * var1.field4922, this);
      } else {
         WorldMapElement var9 = SceneTilePaint.method4796(var1.field4953 * 1571238399, (byte)-105);
         var11 = new classHF((classKY)var7, var6, var9.field5405 * -1991769382, this.method5725(var9, 2023781404));
      }

      WorldMapElement var12 = SceneTilePaint.method4796(((AbstractWorldMapIcon)var11).vmethod486((byte)-123), (byte)5);
      if (var12.field5392) {
         this.field2659.put(new classKY(0, var3, var4), var11);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lpe;)I")
   @ObfuscatedName("ex")
   int method5718(SpritePixels var1, classPE var2) {
      switch (1140979680 * var2.field5231) {
         case 0:
            return 0;
         case 1:
            return -var1.field7007 / 2;
         default:
            return -var1.field7007;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;Lol;)I")
   @ObfuscatedName("eo")
   int method5720(SpritePixels var1, classOL var2) {
      switch (-1205275063 * var2.field4917) {
         case 0:
            return -var1.field7009 / 2;
         case 1:
            return 0;
         default:
            return -var1.field7009;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lhw;")
   @ObfuscatedName("ew")
   classHW method5723(int var1) {
      WorldMapElement var2 = SceneTilePaint.method4796(var1, (byte)-103);
      return this.method5725(var2, 1926760881);
   }

   @ObfuscatedSignature(descriptor = "(I)Lhw;")
   @ObfuscatedName("et")
   classHW method5724(int var1) {
      WorldMapElement var2 = SceneTilePaint.method4796(var1, (byte)-50);
      return this.method5725(var2, 1577997555);
   }

   @ObfuscatedSignature(descriptor = "(Lps;)Lhw;")
   @ObfuscatedName("em")
   classHW method5727(WorldMapElement var1) {
      if (null != var1.field5412 && null != this.field2661 && this.field2661.get(classHP.field2856) != null) {
         classHP var2 = classHP.method6085(var1.field5394 * 1698532127, (byte)38);
         if (var2 == null) {
            return null;
         } else {
            Font var3 = (Font)this.field2661.get(var2);
            if (null == var3) {
               return null;
            } else {
               int var4 = var3.method43(var1.field5412, 1000000);
               String[] var5 = new String[var4];
               var3.method38(var1.field5412, null, var5);
               int var6 = var3.field8 * var5.length / 2;
               int var7 = 0;
               String[] var8 = var5;

               for (int var9 = 0; var9 < var8.length; var9++) {
                  String var10 = var8[var9];
                  int var11 = var3.method36(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new classHW(var1.field5412, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;Lgl;Ljava/util/List;B)V")
   @ObfuscatedName("ac")
   public static void method5623(WorldMapRegion var0, classGL var1, List var2, byte var3) {
      if (var0 == null) {
         var0.method5624(var1, var2, var3);
      }

      try {
         var0.field2659.clear();
         var0.field2669 = var1;
         var0.method5639(var2, (byte)0);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Ljava/util/List;")
   @ObfuscatedName("ez")
   List method5730(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var2 + var3) {
            for (AbstractWorldMapIcon var8 : this.field2659.values()) {
               if (var8.method5997((byte)-117) && var8.method5993(var4, var5, (byte)-127)) {
                  var6.add(var8);
               }
            }

            for (AbstractWorldMapIcon var10 : this.field2658) {
               if (var10.method5997((byte)-55) && var10.method5993(var4, var5, (byte)-67)) {
                  var6.add(var10);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgr;IIIILha;I)V")
   @ObfuscatedName("qk")
   public static void method5631(WorldMapRegion var0, int var1, int var2, int var3, int var4, classHA var5, int var6) {
      if (var0 == null) {
         var0.method5632(var1, var1, var1, var1, var5, var1);
      } else {
         try {
            for (int var7 = var1; var7 < var1 + var3; var7++) {
               label76:
               for (int var8 = var2; var8 < var4 + var2; var8++) {
                  if (var6 >= -1375923225) {
                     throw new IllegalStateException();
                  }

                  for (int var9 = 0; var9 < var5.field2752 * -1667236931; var9++) {
                     if (var6 >= -1375923225) {
                        throw new IllegalStateException();
                     }

                     classHZ[] var10 = var5.field2760[var9][var7][var8];
                     if (var10 != null) {
                        if (var10.length == 0) {
                           if (var6 >= -1375923225) {
                              return;
                           }
                        } else {
                           classHZ[] var11 = var10;

                           for (int var12 = 0; var12 < var11.length; var12++) {
                              if (var6 >= -1375923225) {
                                 throw new IllegalStateException();
                              }

                              classHZ var13 = var11[var12];
                              classOM var14 = classMU.method7729(-1831941567 * var13.field2916, 2018249124);
                              if (classUU.method11554(var14, 1217057510)) {
                                 var0.method5633(var14, var9, var7, var8, var5, -297503953);
                                 continue label76;
                              }

                              if (var6 >= -1375923225) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var15) {
            throw classEG.newRunException(var15, "gr.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Ljava/util/List;")
   @ObfuscatedName("ei")
   List method5731(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var2 + var3) {
            for (AbstractWorldMapIcon var8 : this.field2659.values()) {
               if (var8.method5997((byte)-22) && var8.method5993(var4, var5, (byte)-46)) {
                  var6.add(var8);
               }
            }

            for (AbstractWorldMapIcon var10 : this.field2658) {
               if (var10.method5997((byte)-127) && var10.method5993(var4, var5, (byte)-19)) {
                  var6.add(var10);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/List;")
   @ObfuscatedName("ep")
   List method5735() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field2658);
      var1.addAll(this.field2659.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lhd;IIF)V")
   @ObfuscatedName("dp")
   void method5703(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = SceneTilePaint.method4796(var1.vmethod486((byte)-36), (byte)-85);
      this.method5706(var5, var2, var3, -1930278561);
      this.method5708(var1, var5, var2, var3, var4, -773892930);
   }

   @ObfuscatedSignature(descriptor = "(IIIS)V")
   @ObfuscatedName("ab")
   void method5620(int var1, int var2, int var3, short var4) {
      try {
         int var6 = -551401517 * this.field2656;
         int var7 = this.field2667 * 1312423097;
         int var8 = this.field2656 * 680806733;
         SpritePixels var5 = (SpritePixels)field2663.method6143(classCX.method2698(var6, var7, var8, (byte)1));
         if (null == var5) {
            if (var4 > 128) {
               ;
            }
         } else {
            if (621957952 * this.field2660 == var3) {
               if (var4 <= 128) {
                  return;
               }

               var5.method13508(var1, var2);
            } else {
               var5.method13515(var1, var2, var3, var3);
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgl;Ljava/util/List;B)V")
   @ObfuscatedName("ag")
   void method5624(classGL var1, List var2, byte var3) {
      try {
         this.field2659.clear();
         this.field2669 = var1;
         this.method5639(var2, (byte)0);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gr.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhh;[Lyz;Lhu;Lge;I)V")
   @ObfuscatedName("ap")
   void method5663(classHH var1, IndexedSprite[] var2, classHU var3, classGE var4, int var5) {
      try {
         for (int var6 = 0; var6 < 64; var6++) {
            if (var5 >= -711998756) {
               return;
            }

            for (int var7 = 0; var7 < 64; var7++) {
               if (var5 >= -711998756) {
                  throw new IllegalStateException();
               }

               method5671(this, var6, var7, this.field2669, var1, var3, var4, (byte)77);
               this.method5676(var6, var7, this.field2669, var1, var4, -1017290293);
            }
         }

         for (int var9 = 0; var9 < 64; var9++) {
            if (var5 >= -711998756) {
               throw new IllegalStateException();
            }

            for (int var10 = 0; var10 < 64; var10++) {
               if (var5 >= -711998756) {
                  return;
               }

               this.method5668(var9, var10, this.field2669, var1, var2, (byte)127);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "gr.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhh;Lhu;Lge;B)V")
   @ObfuscatedName("ar")
   void method5675(int var1, int var2, classHA var3, classHH var4, classHU var5, classGE var6, byte var7) {
      try {
         int var8 = var3.field2758[0][var1][var2] - 1;
         int var9 = var3.field2759[0][var1][var2] - 1;
         if (-1 == var8) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            if (-1 == var9) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               classYW.method13692(
                  680806733 * this.field2660 * var1,
                  680806733 * this.field2660 * (63 - var2),
                  680806733 * this.field2660,
                  this.field2660 * 680806733,
                  288074485 * this.field2667
               );
            }
         }

         int var10 = 16711935;
         if (var9 != -1) {
            var10 = WorldMapElement.method9182(var9, 288074485 * this.field2662, var6, -2092820255);
         }

         if (var9 > -1) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            if (0 == var3.field2756[0][var1][var2]) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               classYW.method13730(
                  680806733 * this.field2656 * var1, (63 - var2) * this.field2656 * 680806733, this.field2660 * 680806733, this.field2662 * 680806733, var10
               );
               return;
            }
         }

         int var11 = method5680(this, var1, var2, var3, var5, -1255554545);
         if (var9 == -1) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            } else {
               classYW.method13690(
                  this.field2656 * 680806733 * var1, (63 - var2) * this.field2656 * 680806733, 680806733 * this.field2660, this.field2662 * 680806733, var11
               );
            }
         } else {
            var4.method6012(
               var1 * this.field2660 * 680806733,
               (63 - var2) * this.field2656 * 680806733,
               var11,
               var10,
               this.field2660 * 680806733,
               this.field2656 * 680806733,
               var3.field2756[0][var1][var2],
               var3.field2757[0][var1][var2],
               980481800
            );
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "gr.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILha;Lhu;I)I")
   @ObfuscatedName("ak")
   int method5683(int var1, int var2, classHA var3, classHU var4, int var5) {
      try {
         if (var3.field2758[0][var1][var2] == 0) {
            if (var5 != -1255554545) {
               throw new IllegalStateException();
            } else {
               return 288074485 * this.field2656;
            }
         } else {
            return var4.method6115(var1, var2, (byte)6);
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gr.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILha;I)V")
   @ObfuscatedName("ax")
   void method5632(int var1, int var2, int var3, int var4, classHA var5, int var6) {
      try {
         for (int var7 = var1; var7 < var1 + var3; var7++) {
            label74:
            for (int var8 = var2; var8 < var4 + var2; var8++) {
               if (var6 >= -1375923225) {
                  throw new IllegalStateException();
               }

               for (int var9 = 0; var9 < var5.field2751 * -1667236931; var9++) {
                  if (var6 >= -1375923225) {
                     throw new IllegalStateException();
                  }

                  classHZ[] var10 = var5.field2760[var9][var7][var8];
                  if (var10 != null) {
                     if (var10.length == 0) {
                        if (var6 >= -1375923225) {
                           return;
                        }
                     } else {
                        classHZ[] var11 = var10;

                        for (int var12 = 0; var12 < var11.length; var12++) {
                           if (var6 >= -1375923225) {
                              throw new IllegalStateException();
                           }

                           classHZ var13 = var11[var12];
                           classOM var14 = classMU.method7729(-1831941567 * var13.field2916, 2018249124);
                           if (classUU.method11554(var14, 1217057510)) {
                              this.method5633(var14, var9, var7, var8, var5, -297503953);
                              continue label74;
                           }

                           if (var6 >= -1375923225) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "gr.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Ljava/util/List;")
   @ObfuscatedName("bj")
   List method5732(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         LinkedList var7 = new LinkedList();
         if (var4 >= var1) {
            if (var6 <= -673752481) {
               throw new IllegalStateException();
            }

            if (var5 >= var2) {
               if (var4 < var1 + var3) {
                  if (var6 <= -673752481) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var2 + var3) {
                     Iterator var8 = this.field2659.values().iterator();

                     while (var8.hasNext()) {
                        if (var6 <= -673752481) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var9 = (AbstractWorldMapIcon)var8.next();
                        if (var9.method5997((byte)-4)) {
                           if (var6 <= -673752481) {
                              throw new IllegalStateException();
                           }

                           if (var9.method5993(var4, var5, (byte)-65)) {
                              var7.add(var9);
                           }
                        }
                     }

                     var8 = this.field2658.iterator();

                     while (var8.hasNext()) {
                        if (var6 <= -673752481) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.next();
                        if (var12.method5997((byte)-54)) {
                           if (var6 <= -673752481) {
                              throw new IllegalStateException();
                           }

                           if (var12.method5993(var4, var5, (byte)-44)) {
                              var7.add(var12);
                           }
                        }
                     }

                     return var7;
                  }
               }

               return var7;
            }

            if (var6 <= -673752481) {
               throw new IllegalStateException();
            }
         }

         return var7;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "gr.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;ILhh;[Lyz;Lva;Lva;D)V")
   @ObfuscatedName("cw")
   void method5652(WorldMapArea var1, int var2, classHH var3, IndexedSprite[] var4, AbstractArchive var5, AbstractArchive var6, double var7) {
      this.field2656 = 212048344 * var2;
      if (null != this.field2669 || !this.field2657.isEmpty()) {
         int var10 = -1405153691 * this.field2656;
         int var11 = this.field2667 * -1670926402;
         SpritePixels var9 = (SpritePixels)field2663.method6143(classCX.method2698(var10, var11, var2, (byte)1));
         if (null == var9) {
            if (classFH.method4704() != var7) {
               classFH.method4693(var7);
            }

            boolean var12 = true;
            var12 &= this.method5646(var1.method5897(-608589044), var5, 618311864);
            int var14 = classDG.method3057(this.field2667 * -551401517, this.field2662 * -2079563483, (byte)78);
            var12 &= var6.method11866(var14, -906797091);
            if (var12) {
               byte[] var13 = var6.method11867(var14, var1.method5853(-608589044), -1016788209);
               classHU var15;
               if (var13 == null) {
                  var15 = new classHU();
               } else {
                  SpritePixels var16 = classIT.method6314(var13, 1207354536);
                  if (null == var16) {
                     var15 = new classHU();
                  } else {
                     var15 = new classHU(var16.field7005);
                  }
               }

               SpritePixels var17 = new SpritePixels(-757278971 * this.field2667, 1744034391 * this.field2667);
               var17.method13477();
               if (null != this.field2669) {
                  method5662(this, var3, var4, var15, new classHQ(), -1685083207);
               } else {
                  this.method5664(var3, var4, var15, new classHQ(), -1952919293);
               }

               int var18 = -560795297 * this.field2656;
               int var19 = this.field2656 * 1312423097;
               int var20 = 680806733 * this.field2662;
               field2663.method6158(var17, classCX.method2698(var18, var19, var20, (byte)1), 4 * var17.field7005.length);
               this.method5643((byte)122);
            }
         }
      }
   }
}
