import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wm")
public class classWM implements RenderOverview {
   @ObfuscatedName("at")
   HashMap field6747;
   @ObfuscatedName("bp")
   int field6738;
   @ObfuscatedName("bl")
   long field6741;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final float field6723 = 30.0F;
   @ObfuscatedName("ba")
   int field6702;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6725 = 50;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ax")
   static final classXJ field6724 = classXJ.field6877;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6732 = -1;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("aa")
   static final classXJ field6726 = classXJ.field6875;
   @ObfuscatedName("cr")
   HashSet field6713;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("cs")
   classYM field6754;
   @ObfuscatedName("aq")
   final int[] field6720 = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("ad")
   public boolean field6701 = false;
   @ObfuscatedName("ap")
   HashSet field6708 = new HashSet();
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("au")
   classVA field6752;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ai")
   classVA field6750;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ar")
   classVA field6751;
   @ObfuscatedSignature(descriptor = "Lzv;")
   @ObfuscatedName("aw")
   classZV field6755;
   @ObfuscatedName("ak")
   HashMap field6746;
   @ObfuscatedName("bs")
   int field6700;
   @ObfuscatedSignature(descriptor = "Lgx;")
   @ObfuscatedName("ah")
   classGX field6743;
   @ObfuscatedSignature(descriptor = "Lgx;")
   @ObfuscatedName("an")
   classGX field6745;
   @ObfuscatedSignature(descriptor = "Lgx;")
   @ObfuscatedName("am")
   classGX field6744;
   @ObfuscatedName("bw")
   int field6693;
   @ObfuscatedSignature(descriptor = "Lgu;")
   @ObfuscatedName("bn")
   classGU field6742;
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("bx")
   classWH field6753;
   @ObfuscatedName("bc")
   int field6736;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("av")
   classYZ[] field6756;
   @ObfuscatedName("br")
   int field6696 = 832458829;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ac")
   static final classXJ field6728 = classXJ.field6879;
   @ObfuscatedName("bt")
   float field6730;
   @ObfuscatedName("bg")
   float field6729;
   @ObfuscatedName("bj")
   int field6695;
   @ObfuscatedName("cl")
   List field6749;
   @ObfuscatedName("bo")
   int field6699;
   @ObfuscatedName("bu")
   int field6697;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6727 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6735 = -65536;
   @ObfuscatedName("bz")
   boolean field6712;
   @ObfuscatedName("bi")
   HashSet field6705;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field6734 = 500;
   @ObfuscatedName("by")
   int field6707;
   @ObfuscatedName("bk")
   int field6694;
   @ObfuscatedName("bf")
   int field6703;
   @ObfuscatedName("be")
   int field6706;
   @ObfuscatedName("bd")
   int field6711;
   @ObfuscatedName("bb")
   boolean field6698;
   @ObfuscatedName("bv")
   int field6739;
   @ObfuscatedName("bh")
   int field6737;
   @ObfuscatedName("bm")
   int field6715 = -1910538783;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field6733 = 100;
   @ObfuscatedName("cu")
   HashSet field6714;
   @ObfuscatedName("cb")
   HashSet field6709;
   @ObfuscatedName("ct")
   HashSet field6716;
   @ObfuscatedName("cp")
   boolean field6717;
   @ObfuscatedName("cq")
   int field6718;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6731 = 8;
   @ObfuscatedName("cd")
   Iterator field6748;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("cv")
   classKY field6719;
   @ObfuscatedName("bq")
   int field6710;
   @ObfuscatedName("cy")
   int field6740;
   @ObfuscatedName("co")
   int field6704;
   @ObfuscatedName("ck")
   int field6721;
   @ObfuscatedName("ca")
   int field6722;

   @ObfuscatedSignature(descriptor = "(IIIIIS)V")
   @ObfuscatedName("am")
   void method12466(int var1, int var2, int var3, int var4, int var5, short var6) {
      try {
         byte var7 = 20;
         int var8 = var1 + var3 / 2;
         int var9 = var2 + var4 / 2 - 18 - var7;
         classYW.method13698(var1, var2, var3, var4, -16777216);
         classYW.method13707(var8 - 152, var9, 304, 34, -65536);
         classYW.method13698(var8 - 150, 2 + var9, var5 * 3, 30, -65536);
         this.field6755.method65(classKK.field3921, var8, var7 + var9, -1, -1);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "wm.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ek")
   void method12443(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)-3941);
         if (null == var4) {
            var4 = classGX.method5841(
               this.field6744,
               classGX.method5895(this.field6744, (byte)-67),
               classGX.method5890(this.field6744, -915535260),
               this.field6744.method5897(-1432227408),
               (short)-18645
            );
         }

         method12403(
            this, var4[0] - this.field6744.method5871(2086260676) * 64, var4[1] - classGX.method5880(this.field6744, (short)-12362) * 64, true, -2126973978
         );
         this.field6696 = 832458829;
         this.field6715 = -1910538783;
         this.field6730 = this.method12471(classGX.method5867(this.field6744, (byte)7), 120041229);
         this.field6729 = this.field6730;
         this.field6749 = null;
         this.field6748 = null;
         this.field6742.method5753((byte)-41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;ILky;)Lky;")
   @ObfuscatedName("ii")
   public static classKY method12578(classWM var0, int var1, classKY var2) {
      if (!var0.field6753.method12373((short)255)) {
         return null;
      } else if (!var0.field6742.method5775((short)-19554)) {
         return null;
      } else if (!classGX.method5838(var0.field6744, 1870919123 * var2.field4055, var2.field4056 * 819227381, -1630125944)) {
         return null;
      } else {
         HashMap var3 = var0.field6742.method5786((byte)100);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            classHD var5 = null;
            int var6 = -1;

            for (classHD var8 : var4) {
               int var9 = var8.field2769.field4055 * 1870919123 - 1870919123 * var2.field4055;
               int var10 = var8.field2769.field4056 * 819227381 - 819227381 * var2.field4056;
               int var11 = var9 * var9 + var10 * var10;
               if (0 == var11) {
                  return var8.field2769;
               }

               if (var11 < var6 || null == var5) {
                  var5 = var8;
                  var6 = var11;
               }
            }

            return var5.field2769;
         } else {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZIIIIB)V")
   @ObfuscatedName("ae")
   public void method12386(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (!this.field6753.method12373((short)255)) {
            if (var8 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            this.method12399(1944942167);
            this.method12401((short)3735);
            if (!var3) {
               if (var8 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = (int)Math.ceil(var6 / this.field6730);
               int var10 = (int)Math.ceil(var7 / this.field6730);
               List var11 = this.field6742
                  .method5770(
                     -1664894373 * this.field6736 - var9 / 2 - 1,
                     this.field6738 * 1010414839 - var10 / 2 - 1,
                     1 + -1664894373 * this.field6736 + var9 / 2,
                     1 + var10 / 2 + this.field6738 * 1010414839,
                     var4,
                     var5,
                     var6,
                     var7,
                     var1,
                     var2,
                     -903075137
                  );
               HashSet var12 = new HashSet();
               Iterator var13 = var11.iterator();

               while (var13.hasNext()) {
                  if (var8 <= 1) {
                     throw new IllegalStateException();
                  }

                  classHD var14 = (classHD)var13.next();
                  var12.add(var14);
                  classHV var15 = new classHV(var14.vmethod486((byte)-95), var14.field2770, var14.field2769);
                  Object[] var16 = new Object[]{var15, var1, var2};
                  classZR var17;
                  if (this.field6708.contains(var14)) {
                     var17 = classZS.method14182(classCA.method1392(17, -1800682780).method14145(var16, (byte)2), (byte)36);
                  } else {
                     var17 = classZS.method14182(classCA.method1392(15, -1850821134).method14145(var16, (byte)2), (byte)97);
                  }

                  classSZ.method10729(var17, -1233666950);
               }

               var13 = this.field6708.iterator();

               while (var13.hasNext()) {
                  if (var8 <= 1) {
                     throw new IllegalStateException();
                  }

                  classHD var20 = (classHD)var13.next();
                  if (!var12.contains(var20)) {
                     if (var8 <= 1) {
                        throw new IllegalStateException();
                     }

                     classHV var21 = new classHV(var20.vmethod486((byte)-110), var20.field2770, var20.field2769);
                     Object[] var22 = new Object[]{var21, var1, var2};
                     classZR var23 = classZS.method14182(classCA.method1392(16, -1403020284).method14145(var22, (byte)2), (byte)92);
                     classSZ.method10729(var23, -562177295);
                  }
               }

               this.field6708 = var12;
            }
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "wm.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZI)V")
   @ObfuscatedName("ab")
   public void method12389(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label56: {
            var6 = classDD.method2983(16711680);
            this.method12395(var1, var2, var4, var6);
            label55:
            if (!method12414(this, 1754567301)) {
               if (!var4) {
                  if (var5 >= -1271930519) {
                     throw new IllegalStateException();
                  }

                  if (!var3) {
                     break label55;
                  }

                  if (var5 >= -1271930519) {
                     throw new IllegalStateException();
                  }
               }

               boolean var8 = classWK.field6691.method12154(-431955666);
               if (!var8) {
                  if (var4) {
                     if (var5 >= -1271930519) {
                        throw new IllegalStateException();
                     }

                     this.field6700 = -935653697 * var1;
                     this.field6711 = -1677524883 * var2;
                     this.field6710 = -223069005 * this.field6736;
                     this.field6703 = -943412585 * this.field6738;
                  }

                  if (this.field6710 * -156946503 != -1) {
                     int var9 = var1 - this.field6700 * 543121727;
                     int var10 = var2 - -656340635 * this.field6711;
                     method12403(
                        this,
                        -156946503 * this.field6710 - (int)(var9 / this.field6729),
                        (int)(var10 / this.field6729) + this.field6703 * 1131574433,
                        false,
                        -836625698
                     );
                  }
                  break label56;
               }
            }

            this.method12410(1429288549);
         }

         if (var4) {
            if (var5 >= -1271930519) {
               throw new IllegalStateException();
            }

            this.field6741 = -2654852032954698167L * var6;
            this.field6739 = var1 * 1947564039;
            this.field6737 = -427845355 * var2;
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "wm.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("cq")
   public void method12591(int var1, int var2, boolean var3) {
      method12403(this, var1, var2, var3, -1392100145);
   }

   @ObfuscatedSignature(descriptor = "()Lhd;")
   @ObfuscatedName("hv")
   public classHD method12584() {
      if (!this.field6753.method12373((short)255)) {
         return null;
      } else if (!this.field6742.method5775((short)-17081)) {
         return null;
      } else {
         HashMap var1 = this.field6742.method5786((byte)100);
         this.field6749 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6749.addAll(var3);
         }

         this.field6748 = this.field6749.iterator();
         return this.method12588((byte)-18);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ax")
   void method12401(short var1) {
      try {
         if (method12414(this, 1880693425)) {
            int var2 = this.field6696 * -19228805 - this.field6736 * -1664894373;
            int var3 = -1101891105 * this.field6715 - 1010414839 * this.field6738;
            if (0 != var2) {
               if (var1 == 6513) {
                  return;
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if (0 != var3) {
               if (var1 == 6513) {
                  throw new IllegalStateException();
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            method12403(this, var2 + -1664894373 * this.field6736, this.field6738 * 1010414839 + var3, true, -2007189481);
            if (-1664894373 * this.field6736 == this.field6696 * -19228805) {
               if (var1 == 6513) {
                  return;
               }

               if (this.field6738 * 1010414839 == this.field6715 * -1101891105) {
                  if (var1 == 6513) {
                     throw new IllegalStateException();
                  }

                  this.field6696 = 832458829;
                  this.field6715 = -1910538783;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mf")
   public int method12592() {
      return this.field6694 * 166969213;
   }

   public classWM() {
      this.field6695 = -344315349;
      this.field6694 = -573698517;
      this.field6699 = 77312519;
      this.field6697 = -1723689919;
      this.field6702 = -878772995;
      this.field6693 = 739603646;
      this.field6698 = false;
      this.field6705 = null;
      this.field6706 = 1148417837;
      this.field6707 = -958191021;
      this.field6710 = -983836297;
      this.field6703 = -655388513;
      this.field6700 = 935653697;
      this.field6711 = 1677524883;
      this.field6712 = true;
      this.field6713 = new HashSet();
      this.field6714 = new HashSet();
      this.field6709 = new HashSet();
      this.field6716 = new HashSet();
      this.field6717 = false;
      this.field6718 = 0;
      this.field6719 = null;
      this.field6704 = -1462606503;
      this.field6721 = -1135731861;
      this.field6722 = -629236873;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Lgx;")
   @ObfuscatedName("al")
   public classGX method12416(int var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.field6747.values().iterator();

         while (var5.hasNext()) {
            if (var4 == 16) {
               throw new IllegalStateException();
            }

            classGX var6 = (classGX)var5.next();
            if (classGX.method5835(var6, var1, var2, var3, (byte)58)) {
               if (var4 == 16) {
                  throw new IllegalStateException();
               }

               return var6;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "wm.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZS)V")
   @ObfuscatedName("aj")
   public void method12418(int var1, int var2, int var3, boolean var4, short var5) {
      try {
         classGX var6 = this.method12416(var1, var2, var3, (byte)-9);
         if (null == var6) {
            if (!var4) {
               return;
            }

            var6 = this.field6745;
         }

         boolean var7;
         label51: {
            var7 = false;
            if (var6 == this.field6743) {
               if (var5 != 28249) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  break label51;
               }

               if (var5 != 28249) {
                  return;
               }
            }

            this.field6743 = var6;
            this.method12429(var6, -497706825);
            var7 = true;
         }

         if (!var7) {
            if (var5 != 28249) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            if (var5 != 28249) {
               throw new IllegalStateException();
            }
         }

         this.method12444(var1, var2, var3, 1279937673);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "wm.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("vb")
   public static int method12515(classWM var0) {
      if (var0 == null) {
         var0.method12595();
      }

      return var0.field6695 * -811287683;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public int method12424(int var1) {
      try {
         return this.field6744 == null ? -1 : this.field6744.method5848(-608589044);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ot")
   public int method12593() {
      return this.field6699 * -543890359;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)V")
   @ObfuscatedName("ap")
   void method12429(classGX var1, int var2) {
      try {
         if (null != this.field6744) {
            if (var2 >= 81862380) {
               return;
            }

            if (var1 == this.field6744) {
               if (var2 >= 81862380) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         this.method12434(var1, -568352897);
         this.method12444(-1, -1, -1, 1513972896);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)V")
   @ObfuscatedName("au")
   void method12434(classGX var1, int var2) {
      try {
         this.field6744 = var1;
         this.field6742 = new classGU(this.field6756, this.field6746, this.field6750, this.field6751);
         classWH.method12366(this.field6753, this.field6744, (byte)-74);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;Lky;Lky;ZB)V")
   @ObfuscatedName("ai")
   public void method12441(classGX var1, classKY var2, classKY var3, boolean var4, byte var5) {
      try {
         if (var1 != null) {
            if (this.field6744 == null || this.field6744 != var1) {
               this.method12434(var1, -1904997508);
            }

            if (!var4) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               if (classGX.method5835(this.field6744, -210579119 * var2.field4057, var2.field4055 * 1870919123, 819227381 * var2.field4056, (byte)111)) {
                  this.method12444(-210579119 * var2.field4057, var2.field4055 * 1870919123, var2.field4056 * 819227381, 1338617160);
                  return;
               }

               if (var5 <= 0) {
                  throw new IllegalStateException();
               }
            }

            this.method12444(-210579119 * var3.field4057, var3.field4055 * 1870919123, 819227381 * var3.field4056, 1849617190);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ar")
   void method12444(int var1, int var2, int var3, int var4) {
      try {
         if (this.field6744 == null) {
            if (var4 > 1216253243) {
               ;
            }
         } else {
            int[] var5 = classGX.method5841(this.field6744, var1, var2, var3, (short)-29644);
            if (null == var5) {
               if (var4 <= 1216253243) {
                  return;
               }

               var5 = classGX.method5841(
                  this.field6744,
                  classGX.method5895(this.field6744, (byte)-7),
                  classGX.method5890(this.field6744, -189047916),
                  this.field6744.method5897(-1204357463),
                  (short)-14549
               );
            }

            method12403(
               this, var5[0] - this.field6744.method5871(2005615177) * 64, var5[1] - classGX.method5880(this.field6744, (short)-23223) * 64, true, -1392100145
            );
            this.field6696 = 832458829;
            this.field6715 = -1910538783;
            this.field6730 = this.method12471(classGX.method5867(this.field6744, (byte)90), 120041229);
            this.field6729 = this.field6730;
            this.field6749 = null;
            this.field6748 = null;
            this.field6742.method5753((byte)51);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("aw")
   public void method12446(int var1, int var2, int var3, int var4, int var5, double var6) {
      try {
         int[] var8 = new int[4];
         classYW.method13675(var8);
         classYW.method13671(var1, var2, var3 + var1, var4 + var2);
         int var9 = classWH.method12375(this.field6753, -1540584211);
         if (var9 < 100) {
            this.method12466(var1, var2, var3, var4, var9, (short)13674);
         } else {
            if (!this.field6742.method5775((short)23258)) {
               this.field6742.method5750(this.field6752, this.field6744, client.field932, (byte)44);
               if (!this.field6742.method5775((short)-3532)) {
                  return;
               }
            }

            int var11 = classGU.method5779(this.field6742, (short)4010);
            double var12 = (var11 >> 16 & 0xFF) / 256.0;
            double var14 = (var11 >> 8 & 0xFF) / 256.0;
            double var16 = (var11 & 0xFF) / 256.0;
            var12 = Math.pow(var12, var6);
            var14 = Math.pow(var14, var6);
            var16 = Math.pow(var16, var6);
            int var18 = (int)(256.0 * var12);
            int var19 = (int)(256.0 * var14);
            int var20 = (int)(var16 * 256.0);
            int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
            classYW.method13698(var1, var2, var3, var4, var10);
            if (this.field6705 != null) {
               this.field6707 += 958191021;
               if (this.field6707 * -1964943835 % (this.field6693 * 624117895) == 0) {
                  this.field6707 = 0;
                  this.field6706 += -1148417837;
               }

               if (1316818779 * this.field6706 >= -775290625 * this.field6702 && !this.field6698) {
                  this.field6705 = null;
               }
            }

            int var13 = (int)Math.ceil(var3 / this.field6730);
            int var24 = (int)Math.ceil(var4 / this.field6730);
            double var15 = classFH.method4702();
            this.field6742
               .method5755(
                  -1664894373 * this.field6736 - var13 / 2,
                  1010414839 * this.field6738 - var24 / 2,
                  var13 / 2 + -1664894373 * this.field6736,
                  var24 / 2 + 1010414839 * this.field6738,
                  var1,
                  var2,
                  var1 + var3,
                  var4 + var2,
                  (byte)94
               );
            if (!this.field6717) {
               boolean var17 = false;
               if (var5 - 1129128375 * this.field6718 > 100) {
                  this.field6718 = 1227656199 * var5;
                  var17 = true;
               }

               this.field6742
                  .method5758(
                     this.field6736 * -1664894373 - var13 / 2,
                     1010414839 * this.field6738 - var24 / 2,
                     var13 / 2 + this.field6736 * -1664894373,
                     var24 / 2 + this.field6738 * 1010414839,
                     var1,
                     var2,
                     var1 + var3,
                     var2 + var4,
                     this.field6716,
                     this.field6705,
                     -1964943835 * this.field6707,
                     624117895 * this.field6693,
                     var17,
                     1925771452
                  );
            }

            this.method12457(var1, var2, var3, var4, var13, var24, -1462212404);
            if (classCG.method1497((byte)-84) && this.field6701 && null != this.field6719) {
               this.field6755.method56("Coord: " + this.field6719, classYW.field7097 + 10, 20 + classYW.field7096, 16776960, -1);
            }

            this.field6695 = 344315349 * var13;
            this.field6694 = 573698517 * var24;
            this.field6699 = -77312519 * var1;
            this.field6697 = 1723689919 * var2;
            classYW.method13679(var8);
            if (var15 != classFH.method4702()) {
               classFH.method4694(var15);
            }
         }
      } catch (RuntimeException var21) {
         throw classEG.method3884(var21, "wm.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method12448(int var1) {
      try {
         classGR.field2663.method6167();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;IILky;Lky;I)V")
   @ObfuscatedName("au")
   public static void method12580(classWM var0, int var1, int var2, classKY var3, classKY var4, int var5) {
      if (var0 == null) {
         var0.method12583(var1, var1, var3, var3, var1);
      } else {
         try {
            classHV var6 = new classHV(var2, var3, var4);
            Object[] var7 = new Object[]{var6};
            classZR var8 = null;
            switch (var1) {
               case 1008:
                  var8 = classZS.method14182(classCA.method1392(10, -1601227786).method14145(var7, (byte)2), (byte)84);
                  break;
               case 1009:
                  var8 = classZS.method14182(classCA.method1392(11, -1847135103).method14145(var7, (byte)2), (byte)109);
                  break;
               case 1010:
                  var8 = classZS.method14182(classCA.method1392(12, -1573681068).method14145(var7, (byte)2), (byte)67);
                  break;
               case 1011:
                  var8 = classZS.method14182(classCA.method1392(13, -1146537211).method14145(var7, (byte)2), (byte)4);
                  break;
               case 1012:
                  var8 = classZS.method14182(classCA.method1392(14, -1641551997).method14145(var7, (byte)2), (byte)121);
            }

            if (var8 != null) {
               if (var5 == -1305955669) {
                  return;
               }

               classSZ.method10729(var8, -187132422);
            }
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "wm.cq(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method12383() {
      classPF.method8854((byte)71);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;II)V")
   @ObfuscatedName("zh")
   public static void method12490(classWM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12496(var1, var1);
      } else if (null != var0.field6744 && classGX.method5838(var0.field6744, var1, var2, 1216744707)) {
         var0.field6696 = (var1 - var0.field6744.method5871(1979114778) * 1702755890) * -87770755;
         var0.field6715 = (var2 - classGX.method5880(var0.field6744, (short)-2801) * -1918236354) * 1910538783;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("at")
   void method12457(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (null != classMC.field4481) {
            if (var7 >= -1148417837) {
               return;
            }

            int var8 = 512 / (-629057398 * this.field6742.field2686);
            int var9 = var3 + 512;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int)(var9 / var11);
            var10 = (int)(var10 / var11);
            int var12 = this.method12509(-836464468) - var5 / 2 - var8;
            int var13 = this.method12511(525287209) - var6 / 2 - var8;
            int var14 = var1 - (var8 + var12 - 927100183 * this.field6704) * -314528699 * this.field6742.field2686;
            int var15 = var2 - this.field6742.field2686 * -314528699 * (var8 - (var13 - this.field6721 * 1420019389));
            if (this.method12452(var9, var10, var14, var15, var3, var4, -89366347)) {
               if (var7 >= -1148417837) {
                  throw new IllegalStateException();
               }

               label61: {
                  if (null != this.field6754) {
                     if (var7 >= -1148417837) {
                        throw new IllegalStateException();
                     }

                     if (this.field6754.field7007 == var9) {
                        if (var7 >= -1148417837) {
                           return;
                        }

                        if (var10 == this.field6754.field7009) {
                           Arrays.fill(this.field6754.field7005, 0);
                           break label61;
                        }

                        if (var7 >= -1148417837) {
                           return;
                        }
                     }
                  }

                  this.field6754 = new classYM(var9, var10);
               }

               this.field6704 = (this.method12509(-618903686) - var5 / 2 - var8) * 1462606503;
               this.field6721 = (this.method12511(-2105700704) - var6 / 2 - var8) * 1135731861;
               this.field6740 = this.field6742.field2686 * -87197937;
               classZX.method14230(
                  classMC.field4481, 927100183 * this.field6704, 1420019389 * this.field6721, this.field6754, this.field6740 * -285636757 / var11, 102032434
               );
               this.field6722 = client.field881 * 1002652179;
               var14 = var1 - this.field6742.field2686 * -314528699 * (var8 + var12 - this.field6704 * 927100183);
               var15 = var2 - (var8 - (var13 - this.field6721 * 1420019389)) * this.field6742.field2686 * -314528699;
            }

            classYW.method13694(var1, var2, var3, var4, 0, 128);
            if (1.0F == var11) {
               if (var7 >= -1148417837) {
                  throw new IllegalStateException();
               }

               classYM.method13529(this.field6754, var14, var15, 192);
            } else {
               this.field6754.method13532(var14, var15, (int)(var11 * var9), (int)(var10 * var11), 192);
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "wm.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("do")
   void method12430(classGX var1) {
      if (null == this.field6744 || var1 != this.field6744) {
         this.method12434(var1, -531619150);
         this.method12444(-1, -1, -1, 1438809329);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("ah")
   float method12471(int var1, int var2) {
      try {
         if (25 == var1) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if (37 == var1) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if (50 == var1) {
            return 2.0F;
         } else if (75 == var1) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            } else {
               return 3.0F;
            }
         } else if (100 == var1) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            } else {
               return 4.0F;
            }
         } else {
            return 8.0F;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nw")
   public int method12594() {
      return this.field6715 * -1101891105;
   }

   @ObfuscatedSignature(descriptor = "(S)Lhd;")
   @ObfuscatedName("cl")
   public classHD method12585(short var1) {
      try {
         if (!this.field6753.method12373((short)255)) {
            return null;
         } else if (!this.field6742.method5775((short)4599)) {
            if (var1 >= 229) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.field6742.method5786((byte)87);
            this.field6749 = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while (var3.hasNext()) {
               if (var1 >= 229) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.field6749.addAll(var4);
            }

            this.field6748 = this.field6749.iterator();
            return this.method12588((byte)-65);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wm.cl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   public void method12478(int var1, int var2) {
      try {
         this.field6729 = this.method12471(var1, 120041229);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bc")
   public void method12481(byte var1) {
      try {
         this.field6753.method12369(2016327012);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lgx;")
   @ObfuscatedName("br")
   public classGX method12486(int var1, int var2) {
      try {
         Iterator var3 = this.field6747.values().iterator();

         while (var3.hasNext()) {
            if (var2 <= 1661497523) {
               throw new IllegalStateException();
            }

            classGX var4 = (classGX)var3.next();
            if (var4.method5848(-608589044) == var1) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wm.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bm")
   public void method12491(int var1, int var2, byte var3) {
      try {
         if (null != this.field6744) {
            if (var3 >= -1) {
               return;
            }

            if (classGX.method5838(this.field6744, var1, var2, 1404367312)) {
               this.field6696 = (var1 - this.field6744.method5871(2140147375) * 64) * -832458829;
               this.field6715 = (var2 - classGX.method5880(this.field6744, (short)-12407) * 64) * 1910538783;
               return;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("ds")
   void method12435(classGX var1) {
      this.field6744 = var1;
      this.field6742 = new classGU(this.field6756, this.field6746, this.field6750, this.field6751);
      classWH.method12366(this.field6753, this.field6744, (byte)108);
   }

   @ObfuscatedSignature(descriptor = "()Lgx;")
   @ObfuscatedName("dv")
   public classGX method12426() {
      return this.field6744;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fl")
   public void method12479(int var1) {
      this.field6729 = this.method12471(var1, 120041229);
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("bu")
   public classKY method12513(int var1) {
      try {
         return this.field6744 == null ? null : this.field6744.method5844(this.method12509(726285357), this.method12511(-1418469369), (byte)110);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bu(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("ga")
   public static void method12532(classWM var0) {
      if (var0 == null) {
         var0.method12592();
      }

      var0.field6693 = 739603646;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;Lgx;)V")
   @ObfuscatedName("qs")
   public static void method12436(classWM var0, classGX var1) {
      if (var0 == null) {
         var0.method12440(var1);
      } else {
         var0.field6744 = var1;
         var0.field6742 = new classGU(var0.field6756, var0.field6746, var0.field6750, var0.field6751);
         classWH.method12366(var0.field6753, var0.field6744, (byte)-13);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIZZ)V")
   @ObfuscatedName("kp")
   public static void method12390(classWM var0, int var1, int var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method12545(var1);
      } else {
         long var5;
         label43: {
            var5 = classDD.method2983(16711680);
            var0.method12395(var1, var2, var4, var5);
            if (!method12414(var0, 2110820558) && (var4 || var3)) {
               boolean var7 = classWK.field6691.method12154(-431955666);
               if (!var7) {
                  if (var4) {
                     var0.field6700 = -935653697 * var1;
                     var0.field6711 = -1677524883 * var2;
                     var0.field6710 = -223069005 * var0.field6736;
                     var0.field6703 = -943412585 * var0.field6738;
                  }

                  if (var0.field6710 * -156946503 != -1) {
                     int var8 = var1 - var0.field6700 * 543121727;
                     int var9 = var2 - -656340635 * var0.field6711;
                     method12403(
                        var0,
                        -156946503 * var0.field6710 - (int)(var8 / var0.field6729),
                        (int)(var9 / var0.field6729) + var0.field6703 * 1131574433,
                        false,
                        -988276017
                     );
                  }
                  break label43;
               }
            }

            var0.method12410(1429288549);
         }

         if (var4) {
            var0.field6741 = -2654852032954698167L * var5;
            var0.field6739 = var1 * 1947564039;
            var0.field6737 = -427845355 * var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bw")
   public int method12519(int var1) {
      try {
         return 166969213 * this.field6694;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("bl")
   public void method12549(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 >= -1244985006) {
               throw new IllegalStateException();
            }

            this.field6713.add(var1);
         } else {
            this.field6713.remove(var1);
         }

         method12570(this, (byte)69);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bi")
   public void method12525(byte var1) {
      try {
         this.field6702 = -878772995;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gc")
   public int method12595() {
      return this.field6697 * 959218751;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("by")
   public void method12533(byte var1) {
      try {
         this.field6693 = 739603646;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bq")
   public void method12537(boolean var1, int var2) {
      try {
         this.field6698 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lgu;")
   @ObfuscatedName("se")
   public classGU method12596() {
      return this.field6742;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("xf")
   public static int method12510(classWM var0) {
      return var0.field6744 == null ? -1 : var0.field6738 * 1010414839 + classGX.method5880(var0.field6744, (short)-20876) * 862006016;
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("hz")
   public void method12550(int var1, boolean var2) {
      if (!var2) {
         this.field6713.add(var1);
      } else {
         this.field6713.remove(var1);
      }

      method12570(this, (byte)26);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bs")
   public void method12544(int var1, int var2) {
      try {
         this.field6705 = new HashSet();
         this.field6706 = 0;
         this.field6707 = 0;

         for (int var3 = 0; var3 < classPS.field5407 * 925594537; var3++) {
            if (var2 <= 1729729541) {
               throw new IllegalStateException();
            }

            if (classFJ.method4796(var3, (byte)-71) == null) {
               if (var2 <= 1729729541) {
                  throw new IllegalStateException();
               }
            } else if (classFJ.method4796(var3, (byte)-126).field5404 * 1254355271 == var1) {
               if (var2 <= 1729729541) {
                  return;
               }

               this.field6705.add(classFJ.method4796(var3, (byte)-10).field5405 * 872689451);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bd")
   public void method12546(int var1) {
      try {
         this.field6705 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hq")
   public void method12576(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field6753.method12373((short)255)) {
         int var7 = (int)Math.ceil(var3 / this.field6730);
         int var8 = (int)Math.ceil(var4 / this.field6730);
         List var9 = this.field6742
            .method5770(
               this.field6736 * 682936646 - var7 / 2 - 1,
               this.field6738 * -881998445 - var8 / 2 - 1,
               1 + this.field6736 * -1664894373 + var7 / 2,
               var8 / 2 + this.field6738 * -21113754 + 1,
               var1,
               var2,
               var3,
               var4,
               var5,
               var6,
               -903075137
            );
         if (!var9.isEmpty()) {
            for (classHD var11 : var9) {
               classPS var12 = classFJ.method4796(var11.vmethod486((byte)-14), (byte)-70);
               boolean var13 = false;

               for (int var14 = this.field6720.length - 1; var14 >= 0; var14--) {
                  if (null != var12.field5400[var14]) {
                     classTA.method10732(
                        var12.field5400[var14],
                        var12.field5411,
                        this.field6720[var14],
                        var11.vmethod486((byte)-92),
                        var11.field2770.method6619(-1477847462),
                        var11.field2769.method6619(-1721957829),
                        (byte)-23
                     );
                     var13 = true;
                  }
               }

               if (var13) {
                  return;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ct")
   public void method12577(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!this.field6753.method12373((short)255)) {
            if (var7 == -47366135) {
               throw new IllegalStateException();
            }
         } else {
            int var8 = (int)Math.ceil(var3 / this.field6730);
            int var9 = (int)Math.ceil(var4 / this.field6730);
            List var10 = this.field6742
               .method5770(
                  this.field6736 * -1664894373 - var8 / 2 - 1,
                  this.field6738 * 1010414839 - var9 / 2 - 1,
                  1 + this.field6736 * -1664894373 + var8 / 2,
                  var9 / 2 + this.field6738 * 1010414839 + 1,
                  var1,
                  var2,
                  var3,
                  var4,
                  var5,
                  var6,
                  -903075137
               );
            if (var10.isEmpty()) {
               if (var7 == -47366135) {
                  throw new IllegalStateException();
               }
            } else {
               for (classHD var12 : var10) {
                  classPS var13 = classFJ.method4796(var12.vmethod486((byte)-119), (byte)-116);
                  boolean var14 = false;

                  for (int var15 = this.field6720.length - 1; var15 >= 0; var15--) {
                     if (var7 == -47366135) {
                        throw new IllegalStateException();
                     }

                     if (null != var13.field5400[var15]) {
                        if (var7 == -47366135) {
                           throw new IllegalStateException();
                        }

                        classTA.method10732(
                           var13.field5400[var15],
                           var13.field5411,
                           this.field6720[var15],
                           var12.vmethod486((byte)-103),
                           var12.field2770.method6619(-1717495662),
                           var12.field2769.method6619(-1917946749),
                           (byte)-58
                        );
                        var14 = true;
                     }
                  }

                  if (var14) {
                     if (var7 == -47366135) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "wm.ct(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILky;I)Lky;")
   @ObfuscatedName("cp")
   public classKY method12579(int var1, classKY var2, int var3) {
      try {
         if (!this.field6753.method12373((short)255)) {
            if (var3 != 241883862) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.field6742.method5775((short)-3206)) {
            if (var3 != 241883862) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!classGX.method5838(this.field6744, 1870919123 * var2.field4055, var2.field4056 * 819227381, -157251391)) {
            if (var3 != 241883862) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.field6742.method5786((byte)91);
            List var5 = (List)var4.get(var1);
            if (var5 != null) {
               if (var3 != 241883862) {
                  throw new IllegalStateException();
               }

               if (!var5.isEmpty()) {
                  classHD var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while (var8.hasNext()) {
                     if (var3 != 241883862) {
                        throw new IllegalStateException();
                     }

                     classHD var9 = (classHD)var8.next();
                     int var10 = var9.field2769.field4055 * 1870919123 - 1870919123 * var2.field4055;
                     int var11 = var9.field2769.field4056 * 819227381 - 819227381 * var2.field4056;
                     int var12 = var10 * var10 + var11 * var11;
                     if (0 == var12) {
                        return var9.field2769;
                     }

                     if (var12 >= var7) {
                        if (null != var6) {
                           continue;
                        }

                        if (var3 != 241883862) {
                           throw new IllegalStateException();
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }

                  return var6.field2769;
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "wm.cp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lgx;")
   @ObfuscatedName("fg")
   public classGX method12487(int var1) {
      for (classGX var3 : this.field6747.values()) {
         if (var3.method5848(-608589044) == var1) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)Lhd;")
   @ObfuscatedName("cd")
   public classHD method12588(byte var1) {
      try {
         if (null == this.field6748) {
            return null;
         } else {
            while (this.field6748.hasNext()) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               classHD var2 = (classHD)this.field6748.next();
               if (var2.vmethod486((byte)-109) != -1) {
                  return var2;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;IB)Z")
   @ObfuscatedName("im")
   public static boolean method12559(classWM var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method12562(var1, var2);
      }

      try {
         boolean var10000;
         if (!var0.field6713.contains(var1)) {
            if (var2 == 16) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.cr(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("sj")
   public static void method12569(classWM var0) {
      var0.field6716.clear();
      var0.field6716.addAll(var0.field6713);
      var0.field6716.addAll(var0.field6709);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;II)V")
   @ObfuscatedName("pz")
   public static void method12492(classWM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12495(var1, var1);
      }

      if (null != var0.field6744 && classGX.method5838(var0.field6744, var1, var2, 230188470)) {
         var0.field6696 = (var1 - var0.field6744.method5871(2127428772) * 1933136788) * -832458829;
         var0.field6715 = (var2 - classGX.method5880(var0.field6744, (short)-9376) * 532582767) * -1899767149;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;IIZI)V")
   @ObfuscatedName("mu")
   public static void method12403(classWM var0, int var1, int var2, boolean var3, int var4) {
      if (var0 == null) {
         var0.method12408(var1, var1, var3, var1);
      }

      try {
         var0.field6736 = -871438893 * var1;
         var0.field6738 = 841829575 * var2;
         classDD.method2983(16711680);
         if (var3) {
            if (var4 >= -787422434) {
               return;
            }

            var0.method12410(1429288549);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wm.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;IIIII)V")
   @ObfuscatedName("zb")
   public static void method12461(classWM var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method12465(var1, var1, var1, var1, var1);
      }

      try {
         if (!var0.field6753.method12373((short)255)) {
            if (var5 == 1689794791) {
               throw new IllegalStateException();
            }
         } else {
            if (!var0.field6742.method5775((short)16106)) {
               if (var5 == 1689794791) {
                  throw new IllegalStateException();
               }

               var0.field6742.method5750(var0.field6752, var0.field6744, client.field932, (byte)2);
               if (!var0.field6742.method5775((short)-10268)) {
                  if (var5 == 1689794791) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            var0.field6742.method5764(var1, var2, var3, var4, var0.field6705, -1964943835 * var0.field6707, var0.field6693 * 624117895, (byte)-75);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;Lzv;Ljava/util/HashMap;[Lyz;)V")
   @ObfuscatedName("cv")
   public void method12380(classVA var1, classVA var2, classVA var3, classZV var4, HashMap var5, classYZ[] var6) {
      this.field6756 = var6;
      this.field6752 = var1;
      this.field6750 = var2;
      this.field6751 = var3;
      this.field6755 = var4;
      this.field6746 = new HashMap();
      this.field6746.put(classHP.field2856, var5.get(field6724));
      this.field6746.put(classHP.field2857, var5.get(field6728));
      this.field6746.put(classHP.field2858, var5.get(field6726));
      this.field6753 = new classWH(var1);
      int var7 = -1013526269 * classHE.field2774.field2773;
      int[] var8 = this.field6752.method11824(var7, -1817826448);
      int var9 = var8 == null ? 0 : var8.length;
      this.field6747 = new HashMap(var9);

      for (int var10 = 0; var10 < var9; var10++) {
         classXY var11 = new classXY(this.field6752.method11867(var7, var8[var10], -1217061968));
         classGX var12 = new classGX();
         var12.method5820(var11, var8[var10], 1848080910);
         this.field6747.put(var12.method5856(-1761269607), var12);
         if (var12.method5854((byte)48)) {
            this.field6745 = var12;
         }
      }

      this.method12429(this.field6745, -173702782);
      this.field6743 = null;
   }

   @ObfuscatedSignature(descriptor = "(IIZIIII)V")
   @ObfuscatedName("cc")
   public void method12387(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field6753.method12373((short)255)) {
         this.method12399(1576111790);
         this.method12401((short)-219);
         if (var3) {
            int var8 = (int)Math.ceil(var6 / this.field6730);
            int var9 = (int)Math.ceil(var7 / this.field6730);
            List var10 = this.field6742
               .method5770(
                  1420704072 * this.field6736 - var8 / 2 - 1,
                  this.field6738 * 413511420 - var9 / 2 - 1,
                  1 + 1075245277 * this.field6736 + var8 / 2,
                  1 + var9 / 2 + this.field6738 * 1010414839,
                  var4,
                  var5,
                  var6,
                  var7,
                  var1,
                  var2,
                  -903075137
               );
            HashSet var11 = new HashSet();

            for (classHD var13 : var10) {
               var11.add(var13);
               classHV var14 = new classHV(var13.vmethod486((byte)-70), var13.field2770, var13.field2769);
               Object[] var15 = new Object[]{var14, var1, var2};
               classZR var16;
               if (this.field6708.contains(var13)) {
                  var16 = classZS.method14182(classCA.method1392(17, -1451383213).method14145(var15, (byte)2), (byte)105);
               } else {
                  var16 = classZS.method14182(classCA.method1392(15, -2004999147).method14145(var15, (byte)2), (byte)98);
               }

               classSZ.method10729(var16, -205234782);
            }

            for (classHD var18 : this.field6708) {
               if (!var11.contains(var18)) {
                  classHV var19 = new classHV(var18.vmethod486((byte)-1), var18.field2770, var18.field2769);
                  Object[] var20 = new Object[]{var19, var1, var2};
                  classZR var21 = classZS.method14182(classCA.method1392(16, -1648705530).method14145(var20, (byte)2), (byte)2);
                  classSZ.method10729(var21, -1960893268);
               }
            }

            this.field6708 = var11;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("dc")
   final void method12404(int var1, int var2, boolean var3) {
      this.field6736 = 745269008 * var1;
      this.field6738 = 461109501 * var2;
      classDD.method2983(16711680);
      if (var3) {
         this.method12410(1429288549);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public void method12384() {
      classPF.method8854((byte)71);
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cn")
   public void method12391(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label33: {
         var5 = classDD.method2983(16711680);
         this.method12395(var1, var2, var4, var5);
         if (!method12414(this, 1717661734) && (var4 || var3)) {
            boolean var7 = classWK.field6691.method12154(-431955666);
            if (!var7) {
               if (var4) {
                  this.field6700 = -935653697 * var1;
                  this.field6711 = -1677524883 * var2;
                  this.field6710 = -223069005 * this.field6736;
                  this.field6703 = -943412585 * this.field6738;
               }

               if (this.field6710 * -156946503 != -1) {
                  int var8 = var1 - this.field6700 * 543121727;
                  int var9 = var2 - -656340635 * this.field6711;
                  method12403(
                     this,
                     -156946503 * this.field6710 - (int)(var8 / this.field6729),
                     (int)(var9 / this.field6729) + this.field6703 * 1131574433,
                     false,
                     -842205739
                  );
               }
               break label33;
            }
         }

         this.method12410(1429288549);
      }

      if (var4) {
         this.field6741 = -2654852032954698167L * var5;
         this.field6739 = var1 * 1947564039;
         this.field6737 = -427845355 * var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lgx;")
   @ObfuscatedName("ax")
   public classGX method12597() {
      return this.field6744;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bk")
   public int method12509(int var1) {
      try {
         if (this.field6744 == null) {
            if (var1 <= -1920881857) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field6736 * -1664894373 + this.field6744.method5871(2024505853) * 64;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fv")
   public void method12502(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)4811);
         if (null != var4) {
            this.method12491(var4[0], var4[1], (byte)-10);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public int method12511(int var1) {
      try {
         if (this.field6744 == null) {
            if (var1 == -335086784) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field6738 * 1010414839 + classGX.method5880(this.field6744, (short)-27995) * 64;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hk")
   public boolean method12560(int var1) {
      return !this.field6713.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   void method12396() {
      if (classMC.field4481 != null) {
         this.field6730 = this.field6729;
      } else {
         if (this.field6730 < this.field6729) {
            this.field6730 = Math.min(this.field6729, this.field6730 + this.field6730 / 30.0F);
         }

         if (this.field6730 > this.field6729) {
            this.field6730 = Math.max(this.field6729, this.field6730 - this.field6730 / 30.0F);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cj")
   void method12397() {
      if (classMC.field4481 != null) {
         this.field6730 = this.field6729;
      } else {
         if (this.field6730 < this.field6729) {
            this.field6730 = Math.min(this.field6729, this.field6730 + this.field6730 / 30.0F);
         }

         if (this.field6730 > this.field6729) {
            this.field6730 = Math.max(this.field6729, this.field6730 - this.field6730 / 30.0F);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("bj")
   public void method12504(int var1, int var2, int var3, byte var4) {
      try {
         if (this.field6744 == null) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = classGX.method5841(this.field6744, var1, var2, var3, (short)-11691);
            if (null != var5) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               method12500(this, var5[0], var5[1], 584029035);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   void method12398() {
      if (classMC.field4481 != null) {
         this.field6730 = this.field6729;
      } else {
         if (this.field6730 < this.field6729) {
            this.field6730 = Math.min(this.field6729, this.field6730 + this.field6730 / 30.0F);
         }

         if (this.field6730 > this.field6729) {
            this.field6730 = Math.max(this.field6729, this.field6730 - this.field6730 / 30.0F);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIZZ)V")
   @ObfuscatedName("qj")
   public static void method12392(classWM var0, int var1, int var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method12566(var1);
      }

      long var5;
      label47: {
         var5 = classDD.method2983(16711680);
         var0.method12395(var1, var2, var4, var5);
         if (!method12414(var0, 1977027471) && (var4 || var3)) {
            boolean var7 = classWK.field6691.method12154(-431955666);
            if (!var7) {
               if (var4) {
                  var0.field6700 = -935653697 * var1;
                  var0.field6711 = -1677524883 * var2;
                  var0.field6710 = -223069005 * var0.field6736;
                  var0.field6703 = -943412585 * var0.field6738;
               }

               if (var0.field6710 * -156946503 != -1) {
                  int var8 = var1 - var0.field6700 * 543121727;
                  int var9 = var2 - -656340635 * var0.field6711;
                  method12403(
                     var0,
                     -156946503 * var0.field6710 - (int)(var8 / var0.field6729),
                     (int)(var9 / var0.field6729) + var0.field6703 * 1131574433,
                     false,
                     -1960540117
                  );
               }
               break label47;
            }
         }

         var0.method12410(1429288549);
      }

      if (var4) {
         var0.field6741 = -2654852032954698167L * var5;
         var0.field6739 = var1 * 1947564039;
         var0.field6737 = -427845355 * var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("de")
   public void method12421(int var1) {
      classGX var2 = this.method12486(var1, 2006499107);
      if (var2 != null) {
         this.method12429(var2, -1537942060);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ee")
   float method12472(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (-1980745443 == var1) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZB)V")
   @ObfuscatedName("bv")
   public void method12552(int var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            if (var3 != 51) {
               throw new IllegalStateException();
            }

            this.field6714.add(var1);
         } else {
            this.field6714.remove(var1);
         }

         for (int var4 = 0; var4 < 925594537 * classPS.field5407; var4++) {
            if (var3 != 51) {
               return;
            }

            if (classFJ.method4796(var4, (byte)-102) == null) {
               if (var3 != 51) {
                  throw new IllegalStateException();
               }
            } else if (classFJ.method4796(var4, (byte)-49).field5404 * 1254355271 == var1) {
               if (var3 != 51) {
                  throw new IllegalStateException();
               }

               int var5 = classFJ.method4796(var4, (byte)-31).field5405 * 872689451;
               if (!var2) {
                  if (var3 != 51) {
                     return;
                  }

                  this.field6709.add(var5);
               } else {
                  this.field6709.remove(var5);
               }
            }
         }

         method12570(this, (byte)49);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("dm")
   final void method12405(int var1, int var2, boolean var3) {
      this.field6736 = -871438893 * var1;
      this.field6738 = 841829575 * var2;
      classDD.method2983(16711680);
      if (var3) {
         this.method12410(1429288549);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fk")
   public void method12598(int var1, int var2) {
      this.method12491(var1, var2, (byte)-81);
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("dx")
   final void method12406(int var1, int var2, boolean var3) {
      this.field6736 = -871438893 * var1;
      this.field6738 = 841829575 * var2;
      classDD.method2983(16711680);
      if (var3) {
         this.method12410(1429288549);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   final void method12409() {
      this.field6711 = -250011315;
      this.field6700 = -591500047;
      this.field6703 = -655388513;
      this.field6710 = -983836297;
   }

   @ObfuscatedSignature(descriptor = "(Lwm;B)V")
   @ObfuscatedName("sf")
   public static void method12570(classWM var0, byte var1) {
      if (var0 == null) {
         var0.method12527(var1);
      }

      try {
         var0.field6716.clear();
         var0.field6716.addAll(var0.field6713);
         var0.field6716.addAll(var0.field6709);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.cb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dt")
   boolean method12412() {
      return -19228805 * this.field6696 != -1 && -1 != -1101891105 * this.field6715;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("du")
   boolean method12413() {
      return -19228805 * this.field6696 != -1 && -1 != -1101891105 * this.field6715;
   }

   @ObfuscatedSignature(descriptor = "(III)Lgx;")
   @ObfuscatedName("dk")
   public classGX method12417(int var1, int var2, int var3) {
      for (classGX var5 : this.field6747.values()) {
         if (classGX.method5835(var5, var1, var2, var3, (byte)46)) {
            return var5;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(IIIZ)V")
   @ObfuscatedName("db")
   public void method12419(int var1, int var2, int var3, boolean var4) {
      classGX var5 = this.method12416(var1, var2, var3, (byte)-101);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.field6745;
      }

      boolean var6 = false;
      if (var5 != this.field6743 || var4) {
         this.field6743 = var5;
         this.method12429(var5, -577438891);
         var6 = true;
      }

      if (var6 || var4) {
         this.method12444(var1, var2, var3, 1281679465);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZ)V")
   @ObfuscatedName("dw")
   public void method12420(int var1, int var2, int var3, boolean var4) {
      classGX var5 = this.method12416(var1, var2, var3, (byte)83);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.field6745;
      }

      boolean var6 = false;
      if (var5 != this.field6743 || var4) {
         this.field6743 = var5;
         this.method12429(var5, -989827837);
         var6 = true;
      }

      if (var6 || var4) {
         this.method12444(var1, var2, var3, 1713609406);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dh")
   public void method12422(int var1) {
      classGX var2 = this.method12486(var1, 1709076461);
      if (var2 != null) {
         this.method12429(var2, -290387513);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("es")
   public void method12447(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      classYW.method13675(var8);
      classYW.method13671(var1, var2, var3 + var1, var4 + var2);
      int var9 = classWH.method12375(this.field6753, -1540584211);
      if (var9 < 100) {
         this.method12466(var1, var2, var3, var4, var9, (short)3024);
      } else {
         if (!this.field6742.method5775((short)16936)) {
            this.field6742.method5750(this.field6752, this.field6744, client.field932, (byte)76);
            if (!this.field6742.method5775((short)-1810)) {
               return;
            }
         }

         int var11 = classGU.method5779(this.field6742, (short)23377);
         double var12 = (var11 >> 16 & 0xFF) / 256.0;
         double var14 = (var11 >> 8 & 0xFF) / 256.0;
         double var16 = (var11 & 0xFF) / 256.0;
         var12 = Math.pow(var12, var6);
         var14 = Math.pow(var14, var6);
         var16 = Math.pow(var16, var6);
         int var18 = (int)(256.0 * var12);
         int var19 = (int)(256.0 * var14);
         int var20 = (int)(var16 * 256.0);
         int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
         classYW.method13698(var1, var2, var3, var4, var10);
         if (this.field6705 != null) {
            this.field6707 += 958191021;
            if (this.field6707 * -1964943835 % (this.field6693 * 624117895) == 0) {
               this.field6707 = 0;
               this.field6706 += -1148417837;
            }

            if (1316818779 * this.field6706 >= -775290625 * this.field6702 && !this.field6698) {
               this.field6705 = null;
            }
         }

         int var13 = (int)Math.ceil(var3 / this.field6730);
         int var23 = (int)Math.ceil(var4 / this.field6730);
         double var15 = classFH.method4702();
         this.field6742
            .method5755(
               -1664894373 * this.field6736 - var13 / 2,
               1010414839 * this.field6738 - var23 / 2,
               var13 / 2 + -1664894373 * this.field6736,
               var23 / 2 + 1010414839 * this.field6738,
               var1,
               var2,
               var1 + var3,
               var4 + var2,
               (byte)25
            );
         if (!this.field6717) {
            boolean var17 = false;
            if (var5 - 1129128375 * this.field6718 > 100) {
               this.field6718 = 1227656199 * var5;
               var17 = true;
            }

            this.field6742
               .method5758(
                  this.field6736 * -1664894373 - var13 / 2,
                  1010414839 * this.field6738 - var23 / 2,
                  var13 / 2 + this.field6736 * -1664894373,
                  var23 / 2 + this.field6738 * 1010414839,
                  var1,
                  var2,
                  var1 + var3,
                  var2 + var4,
                  this.field6716,
                  this.field6705,
                  -1964943835 * this.field6707,
                  624117895 * this.field6693,
                  var17,
                  2017467523
               );
         }

         this.method12457(var1, var2, var3, var4, var13, var23, -2004927156);
         if (classCG.method1497((byte)-112) && this.field6701 && null != this.field6719) {
            this.field6755.method56("Coord: " + this.field6719, classYW.field7097 + 10, 20 + classYW.field7096, 16776960, -1);
         }

         this.field6695 = 344315349 * var13;
         this.field6694 = 573698517 * var23;
         this.field6699 = -77312519 * var1;
         this.field6697 = 1723689919 * var2;
         classYW.method13679(var8);
         if (var15 != classFH.method4702()) {
            classFH.method4694(var15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nr")
   public int method12599() {
      return this.field6738 * 1010414839;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dz")
   public int method12425() {
      return this.field6744 == null ? -1 : this.field6744.method5848(-608589044);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hf")
   public boolean method12483(int var1) {
      try {
         return this.field6753.method12373((short)255);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("bg")
   public void method12503(int var1, int var2, int var3, byte var4) {
      try {
         if (this.field6744 == null) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = classGX.method5841(this.field6744, var1, var2, var3, (short)21675);
            if (null != var5) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               this.method12491(var5[0], var5[1], (byte)-46);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method12600() {
      return this.field6736 * -1664894373;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;Lgx;)V")
   @ObfuscatedName("iy")
   public static void method12431(classWM var0, classGX var1) {
      if (null == var0.field6744 || var1 != var0.field6744) {
         var0.method12434(var1, -971572349);
         var0.method12444(-1, -1, -1, 1320766739);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   void method12402() {
      if (method12414(this, 1837004952)) {
         int var1 = this.field6696 * -19228805 - this.field6736 * -1664894373;
         int var2 = -1101891105 * this.field6715 - 1010414839 * this.field6738;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         method12403(this, var1 + -1664894373 * this.field6736, this.field6738 * 1010414839 + var2, true, -1843570608);
         if (-1664894373 * this.field6736 == this.field6696 * -19228805 && this.field6738 * 1010414839 == this.field6715 * -1101891105) {
            this.field6696 = 832458829;
            this.field6715 = -1910538783;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;Lky;Lky;Z)V")
   @ObfuscatedName("ey")
   public void method12442(classGX var1, classKY var2, classKY var3, boolean var4) {
      if (var1 != null) {
         if (this.field6744 == null || this.field6744 != var1) {
            this.method12434(var1, -1960673755);
         }

         if (!var4 && classGX.method5835(this.field6744, -33612777 * var2.field4057, var2.field4055 * -1476854249, 591096687 * var2.field4056, (byte)52)) {
            this.method12444(-210579119 * var2.field4057, var2.field4055 * 671905568, var2.field4056 * 819227381, 1708373807);
         } else {
            this.method12444(568617954 * var3.field4057, var3.field4055 * 1066440694, 1764982547 * var3.field4056, 1759476596);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qq")
   public int method12601() {
      return this.field6695 * -811287683;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("dl")
   void method12432(classGX var1) {
      if (null == this.field6744 || var1 != this.field6744) {
         this.method12434(var1, -987640966);
         this.method12444(-1, -1, -1, 1919193539);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("dq")
   void method12433(classGX var1) {
      if (null == this.field6744 || var1 != this.field6744) {
         this.method12434(var1, -666270259);
         this.method12444(-1, -1, -1, 1740808024);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZJ)V")
   @ObfuscatedName("cg")
   void method12394(int var1, int var2, boolean var3, long var4) {
      if (this.field6744 != null) {
         int var6 = (int)(
            this.field6736 * -1664894373 + (var1 - -543890359 * this.field6699 - method12518(this, (byte)-29) * this.field6730 / 2.0F) / this.field6730
         );
         int var7 = (int)(
            this.field6738 * 1010414839 - (var2 - this.field6697 * 959218751 - this.method12519(-137371582) * this.field6730 / 2.0F) / this.field6730
         );
         this.field6719 = this.field6744
            .method5844(var6 + this.field6744.method5871(1988907087) * 64, var7 + classGX.method5880(this.field6744, (short)-30528) * 64, (byte)59);
         if (this.field6719 != null && var3) {
            classFA var8 = client.field931;
            if (classCG.method1497((byte)-88) && classFA.method4540(var8, 82, 1555632321) && classFA.method4540(var8, 81, 1457406092)) {
               classJS.method6413(
                  this.field6719.field4055 * 1870919123, this.field6719.field4056 * 819227381, this.field6719.field4057 * -210579119, false, 240094172
               );
            } else {
               boolean var10 = true;
               if (this.field6712) {
                  int var11 = var1 - -103516745 * this.field6739;
                  int var12 = var2 - this.field6737 * 2045505085;
                  if (var4 - 7559854042491313145L * this.field6741 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  classJL var13 = classEF.method3849(classJS.CLICKWORLDMAP, client.field795.field1535, (byte)-49);
                  var13.field3343.method13232(this.field6719.method6619(-1780424005), 730941790);
                  client.field795.method3367(var13, -1301097035);
                  this.field6741 = 0L;
               }
            }
         }
      } else {
         this.field6719 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("dj")
   void method12437(classGX var1) {
      this.field6744 = var1;
      this.field6742 = new classGU(this.field6756, this.field6746, this.field6750, this.field6751);
      classWH.method12366(this.field6753, this.field6744, (byte)81);
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;Lzv;Ljava/util/HashMap;[Lyz;B)V")
   @ObfuscatedName("az")
   public void method12381(classVA var1, classVA var2, classVA var3, classZV var4, HashMap var5, classYZ[] var6, byte var7) {
      try {
         this.field6756 = var6;
         this.field6752 = var1;
         this.field6750 = var2;
         this.field6751 = var3;
         this.field6755 = var4;
         this.field6746 = new HashMap();
         this.field6746.put(classHP.field2856, var5.get(field6724));
         this.field6746.put(classHP.field2857, var5.get(field6728));
         this.field6746.put(classHP.field2858, var5.get(field6726));
         this.field6753 = new classWH(var1);
         int var8 = -1013526269 * classHE.field2774.field2773;
         int[] var9 = this.field6752.method11824(var8, -1912062056);
         int var10000;
         if (var9 == null) {
            if (var7 >= 2) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         this.field6747 = new HashMap(var10);

         for (int var11 = 0; var11 < var10; var11++) {
            if (var7 >= 2) {
               throw new IllegalStateException();
            }

            classXY var12 = new classXY(this.field6752.method11867(var8, var9[var11], -973157393));
            classGX var13 = new classGX();
            var13.method5820(var12, var9[var11], 1792203160);
            this.field6747.put(var13.method5856(-1935285491), var13);
            if (var13.method5854((byte)-47)) {
               this.field6745 = var13;
            }
         }

         this.method12429(this.field6745, -187306842);
         this.field6743 = null;
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "wm.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;II)Z")
   @ObfuscatedName("hy")
   public static boolean method12563(classWM var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method12568(var1, var1);
      } else {
         try {
            boolean var10000;
            if (!var0.field6714.contains(var1)) {
               if (var2 == -1229776556) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "wm.cu(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lgx;")
   @ObfuscatedName("ad")
   public classGX method12427(int var1) {
      try {
         return this.field6744;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lgx;")
   @ObfuscatedName("dn")
   public classGX method12428() {
      return this.field6744;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gu")
   public void method12547() {
      this.field6705 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ej")
   public void method12449() {
      classGR.field2663.method6167();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ed")
   public void method12450() {
      classGR.field2663.method6167();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ht")
   public boolean method12554() {
      return !this.field6717;
   }

   @ObfuscatedSignature(descriptor = "(IIZIIII)V")
   @ObfuscatedName("ca")
   public void method12388(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field6753.method12373((short)255)) {
         this.method12399(1149833048);
         this.method12401((short)7595);
         if (var3) {
            int var8 = (int)Math.ceil(var6 / this.field6730);
            int var9 = (int)Math.ceil(var7 / this.field6730);
            List var10 = this.field6742
               .method5770(
                  2128544705 * this.field6736 - var8 / 2 - 1,
                  this.field6738 * -1010352863 - var9 / 2 - 1,
                  1 + -1664894373 * this.field6736 + var8 / 2,
                  1 + var9 / 2 + this.field6738 * 2125423134,
                  var4,
                  var5,
                  var6,
                  var7,
                  var1,
                  var2,
                  -903075137
               );
            HashSet var11 = new HashSet();

            for (classHD var13 : var10) {
               var11.add(var13);
               classHV var14 = new classHV(var13.vmethod486((byte)-14), var13.field2770, var13.field2769);
               Object[] var15 = new Object[]{var14, var1, var2};
               classZR var16;
               if (this.field6708.contains(var13)) {
                  var16 = classZS.method14182(classCA.method1392(17, -1598863053).method14145(var15, (byte)2), (byte)83);
               } else {
                  var16 = classZS.method14182(classCA.method1392(15, -1700958634).method14145(var15, (byte)2), (byte)83);
               }

               classSZ.method10729(var16, -1974386929);
            }

            for (classHD var18 : this.field6708) {
               if (!var11.contains(var18)) {
                  classHV var19 = new classHV(var18.vmethod486((byte)-111), var18.field2770, var18.field2769);
                  Object[] var20 = new Object[]{var19, var1, var2};
                  classZR var21 = classZS.method14182(classCA.method1392(16, -1662199949).method14145(var20, (byte)2), (byte)103);
                  classSZ.method10729(var21, -1095613137);
               }
            }

            this.field6708 = var11;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("yo")
   public static int method12512(classWM var0) {
      return var0.field6744 == null ? -1 : var0.field6738 * 1010414839 + classGX.method5880(var0.field6744, (short)57) * 64;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bf")
   public void method12541(int var1, byte var2) {
      try {
         this.field6705 = new HashSet();
         this.field6705.add(var1);
         this.field6706 = 0;
         this.field6707 = 0;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("df")
   void method12438(classGX var1) {
      this.field6744 = var1;
      this.field6742 = new classGU(this.field6756, this.field6746, this.field6750, this.field6751);
      classWH.method12366(this.field6753, this.field6744, (byte)61);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gn")
   public void method12534() {
      this.field6693 = 739603646;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bb")
   public void method12523(int var1, byte var2) {
      try {
         if (var1 >= 1) {
            if (var2 == 7) {
               throw new IllegalStateException();
            }

            this.field6702 = -1724580097 * var1;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("er")
   void method12458(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != classMC.field4481) {
         int var7 = 512 / (-629057398 * this.field6742.field2686);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = this.method12509(-1241060707) - var5 / 2 - var7;
         int var12 = this.method12511(1477386443) - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - 927100183 * this.field6704) * -314528699 * this.field6742.field2686;
         int var14 = var2 - this.field6742.field2686 * -314528699 * (var7 - (var12 - this.field6721 * 1420019389));
         if (this.method12452(var8, var9, var13, var14, var3, var4, -89366347)) {
            if (null != this.field6754 && this.field6754.field7007 == var8 && var9 == this.field6754.field7009) {
               Arrays.fill(this.field6754.field7005, 0);
            } else {
               this.field6754 = new classYM(var8, var9);
            }

            this.field6704 = (this.method12509(272460860) - var5 / 2 - var7) * 1462606503;
            this.field6721 = (this.method12511(-306351559) - var6 / 2 - var7) * 1135731861;
            this.field6740 = this.field6742.field2686 * -87197937;
            classZX.method14230(
               classMC.field4481, 927100183 * this.field6704, 1420019389 * this.field6721, this.field6754, this.field6740 * -285636757 / var10, -334270256
            );
            this.field6722 = client.field881 * 1002652179;
            var13 = var1 - this.field6742.field2686 * -314528699 * (var7 + var11 - this.field6704 * 927100183);
            var14 = var2 - (var7 - (var12 - this.field6721 * 1420019389)) * this.field6742.field2686 * -314528699;
         }

         classYW.method13694(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            classYM.method13529(this.field6754, var13, var14, 192);
         } else {
            this.field6754.method13532(var13, var14, (int)(var10 * var8), (int)(var9 * var10), 192);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIZ)V")
   @ObfuscatedName("ch")
   public static void method12407(classWM var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method12424(var1);
      }

      var0.field6736 = -931684775 * var1;
      var0.field6738 = 1048815237 * var2;
      classDD.method2983(16711680);
      if (var3) {
         var0.method12410(1429288549);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eq")
   void method12459(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != classMC.field4481) {
         int var7 = 512 / (-629057398 * this.field6742.field2686);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = this.method12509(-940386358) - var5 / 2 - var7;
         int var12 = this.method12511(440684945) - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - 927100183 * this.field6704) * -314528699 * this.field6742.field2686;
         int var14 = var2 - this.field6742.field2686 * -314528699 * (var7 - (var12 - this.field6721 * 1420019389));
         if (this.method12452(var8, var9, var13, var14, var3, var4, -89366347)) {
            if (null != this.field6754 && this.field6754.field7007 == var8 && var9 == this.field6754.field7009) {
               Arrays.fill(this.field6754.field7005, 0);
            } else {
               this.field6754 = new classYM(var8, var9);
            }

            this.field6704 = (this.method12509(849909892) - var5 / 2 - var7) * 1462606503;
            this.field6721 = (this.method12511(1326449303) - var6 / 2 - var7) * 1135731861;
            this.field6740 = this.field6742.field2686 * -87197937;
            classZX.method14230(
               classMC.field4481, 927100183 * this.field6704, 1420019389 * this.field6721, this.field6754, this.field6740 * -285636757 / var10, -1648676775
            );
            this.field6722 = client.field881 * 1002652179;
            var13 = var1 - this.field6742.field2686 * -314528699 * (var7 + var11 - this.field6704 * 927100183);
            var14 = var2 - (var7 - (var12 - this.field6721 * 1420019389)) * this.field6742.field2686 * -314528699;
         }

         classYW.method13694(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            classYM.method13529(this.field6754, var13, var14, 192);
         } else {
            this.field6754.method13532(var13, var14, (int)(var10 * var8), (int)(var9 * var10), 192);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("da")
   void method12439(classGX var1) {
      this.field6744 = var1;
      this.field6742 = new classGU(this.field6756, this.field6746, this.field6750, this.field6751);
      classWH.method12366(this.field6753, this.field6744, (byte)-75);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("eu")
   void method12467(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      classYW.method13698(var1, var2, var3, var4, -16777216);
      classYW.method13707(var7 - 152, var8, 304, 34, -65536);
      classYW.method13698(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      this.field6755.method65(classKK.field3921, var7, var6 + var8, -1, -1);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ef")
   void method12468(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      classYW.method13698(var1, var2, var3, var4, -16777216);
      classYW.method13707(var7 - 811267074, var8, 304, 34, -65536);
      classYW.method13698(var7 - -1946988071, 2 + var8, var5 * 3, 30, -65536);
      this.field6755.method65(classKK.field3921, var7, var6 + var8, -1, -1);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("em")
   void method12469(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      classYW.method13698(var1, var2, var3, var4, -16777216);
      classYW.method13707(var7 - 152, var8, 304, 34, -65536);
      classYW.method13698(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      this.field6755.method65(classKK.field3921, var7, var6 + var8, -1, -1);
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;Lzv;Ljava/util/HashMap;[Lyz;)V")
   @ObfuscatedName("cs")
   public void method12382(classVA var1, classVA var2, classVA var3, classZV var4, HashMap var5, classYZ[] var6) {
      this.field6756 = var6;
      this.field6752 = var1;
      this.field6750 = var2;
      this.field6751 = var3;
      this.field6755 = var4;
      this.field6746 = new HashMap();
      this.field6746.put(classHP.field2856, var5.get(field6724));
      this.field6746.put(classHP.field2857, var5.get(field6728));
      this.field6746.put(classHP.field2858, var5.get(field6726));
      this.field6753 = new classWH(var1);
      int var7 = -1013526269 * classHE.field2774.field2773;
      int[] var8 = this.field6752.method11824(var7, -2046822024);
      int var9 = var8 == null ? 0 : var8.length;
      this.field6747 = new HashMap(var9);

      for (int var10 = 0; var10 < var9; var10++) {
         classXY var11 = new classXY(this.field6752.method11867(var7, var8[var10], -2092757493));
         classGX var12 = new classGX();
         var12.method5820(var11, var8[var10], 748800632);
         this.field6747.put(var12.method5856(-2145988097), var12);
         if (var12.method5854((byte)-14)) {
            this.field6745 = var12;
         }
      }

      this.method12429(this.field6745, -833162955);
      this.field6743 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIIIII)V")
   @ObfuscatedName("bu")
   public static void method12460(classWM var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method12586();
      }

      if (null != classMC.field4481) {
         int var7 = 512 / (-629057398 * var0.field6742.field2686);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = var0.method12509(-1374488797) - var5 / 2 - var7;
         int var12 = var0.method12511(1477708979) - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - 927100183 * var0.field6704) * -314528699 * var0.field6742.field2686;
         int var14 = var2 - var0.field6742.field2686 * -314528699 * (var7 - (var12 - var0.field6721 * 1420019389));
         if (var0.method12452(var8, var9, var13, var14, var3, var4, -89366347)) {
            if (null != var0.field6754 && var0.field6754.field7007 == var8 && var9 == var0.field6754.field7009) {
               Arrays.fill(var0.field6754.field7005, 0);
            } else {
               var0.field6754 = new classYM(var8, var9);
            }

            var0.field6704 = (var0.method12509(457110014) - var5 / 2 - var7) * 1462606503;
            var0.field6721 = (var0.method12511(524312259) - var6 / 2 - var7) * 1135731861;
            var0.field6740 = var0.field6742.field2686 * -87197937;
            classZX.method14230(
               classMC.field4481, 927100183 * var0.field6704, 1420019389 * var0.field6721, var0.field6754, var0.field6740 * -285636757 / var10, 885793990
            );
            var0.field6722 = client.field881 * 1002652179;
            var13 = var1 - var0.field6742.field2686 * -314528699 * (var7 + var11 - var0.field6704 * 927100183);
            var14 = var2 - (var7 - (var12 - var0.field6721 * 1420019389)) * var0.field6742.field2686 * -314528699;
         }

         classYW.method13694(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            classYM.method13529(var0.field6754, var13, var14, 192);
         } else {
            var0.field6754.method13532(var13, var14, (int)(var10 * var8), (int)(var9 * var10), 192);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ei")
   float method12473(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (1330441392 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (75 == var1) {
         return 3.0F;
      } else {
         return 1964850342 == var1 ? 4.0F : 8.0F;
      }
   }

   public Point getWorldMapPosition() {
      classGU var1 = this.method12596();
      int var2 = this.method12600() + var1.method5797();
      int var3 = this.method12599() + var1.method5796();
      return new Point(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   final void method12410(int var1) {
      try {
         this.field6711 = 1677524883;
         this.field6700 = 935653697;
         this.field6703 = -655388513;
         this.field6710 = -983836297;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("eb")
   float method12474(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (-1397353618 == var1) {
         return 1.5F;
      } else if (1829824468 == var1) {
         return 2.0F;
      } else if (2120637410 == var1) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ep")
   public int method12475() {
      if (this.field6729 == 1.0) {
         return 25;
      } else if (this.field6729 == 1.5) {
         return 37;
      } else if (this.field6729 == 2.0) {
         return 6184001;
      } else if (3.0 == this.field6729) {
         return 75;
      } else {
         return this.field6729 == 4.0 ? 100 : 200;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("du")
   public static int method12520(classWM var0) {
      return 1250862754 * var0.field6694;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   public void method12423(int var1, int var2) {
      try {
         classGX var3 = this.method12486(var1, 2137218399);
         if (var3 != null) {
            if (var2 <= -1541607628) {
               throw new IllegalStateException();
            }

            this.method12429(var3, -915721534);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIII)V")
   @ObfuscatedName("hk")
   public static void method12462(classWM var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12594();
      }

      if (var0.field6753.method12373((short)255)) {
         if (!var0.field6742.method5775((short)8138)) {
            var0.field6742.method5750(var0.field6752, var0.field6744, client.field932, (byte)10);
            if (!var0.field6742.method5775((short)-1461)) {
               return;
            }
         }

         var0.field6742.method5764(var1, var2, var3, var4, var0.field6705, -1964943835 * var0.field6707, var0.field6693 * 624117895, (byte)-21);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fo")
   public void method12480(int var1) {
      this.field6729 = this.method12471(var1, 120041229);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)Z")
   @ObfuscatedName("av")
   boolean method12452(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (this.field6754 == null) {
            if (var7 != -89366347) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (this.field6754.field7007 == var1) {
               if (this.field6754.field7009 == var2) {
                  if (-285636757 * this.field6740 != -314528699 * this.field6742.field2686) {
                     if (var7 != -89366347) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (1373094587 * client.field881 != 829903289 * this.field6722) {
                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 != -89366347) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var1 + var3 >= var5) {
                           if (var7 != -89366347) {
                              throw new IllegalStateException();
                           }

                           if (var4 + var2 >= var6) {
                              return false;
                           }

                           if (var7 != -89366347) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }

                     if (var7 != -89366347) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }

               if (var7 != -89366347) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "wm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fj")
   public void method12482() {
      this.field6753.method12369(1474497483);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fd")
   public boolean method12484() {
      return this.field6753.method12373((short)255);
   }

   @ObfuscatedSignature(descriptor = "(I)Lgx;")
   @ObfuscatedName("fy")
   public classGX method12488(int var1) {
      for (classGX var3 : this.field6747.values()) {
         if (var3.method5848(-608589044) == var1) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fh")
   public void method12493(int var1, int var2) {
      if (null != this.field6744 && classGX.method5838(this.field6744, var1, var2, 139677998)) {
         this.field6696 = (var1 - this.field6744.method5871(1994945837) * 64) * -832458829;
         this.field6715 = (var2 - classGX.method5880(this.field6744, (short)-21362) * 64) * 1910538783;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lgx;")
   @ObfuscatedName("fi")
   public classGX method12489(int var1) {
      for (classGX var3 : this.field6747.values()) {
         if (var3.method5848(-608589044) == var1) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ec")
   public int method12476() {
      if (this.field6729 == 1.0) {
         return 25;
      } else if (this.field6729 == 1.5) {
         return 37;
      } else if (this.field6729 == 2.0) {
         return 50;
      } else if (3.0 == this.field6729) {
         return 75;
      } else {
         return this.field6729 == 4.0 ? 100 : 200;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;II)V")
   @ObfuscatedName("gz")
   public static void method12497(classWM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12519(var1);
      }

      if (null != var0.field6744) {
         method12403(
            var0, var1 - var0.field6744.method5871(2143861292) * 64, var2 - classGX.method5880(var0.field6744, (short)-16394) * -273327495, true, -2142058492
         );
         var0.field6696 = 832458829;
         var0.field6715 = -140798908;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;ZB)V")
   @ObfuscatedName("ji")
   public static void method12556(classWM var0, boolean var1, byte var2) {
      if (var0 == null) {
         var0.method12558(var1, var2);
      } else {
         try {
            var0.field6717 = !var1;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "wm.bz(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fz")
   public void method12494(int var1, int var2) {
      if (null != this.field6744 && classGX.method5838(this.field6744, var1, var2, 1150890400)) {
         this.field6696 = (var1 - this.field6744.method5871(2019125225) * 64) * -832458829;
         this.field6715 = (var2 - classGX.method5880(this.field6744, (short)-30146) * 64) * 17617710;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIIIII)Z")
   @ObfuscatedName("il")
   public static boolean method12453(classWM var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0.field6754 == null) {
         return true;
      } else if (var0.field6754.field7007 == var1 && var0.field6754.field7009 == var2) {
         if (-285636757 * var0.field6740 != -314528699 * var0.field6742.field2686) {
            return true;
         } else if (1373094587 * client.field881 != 829903289 * var0.field6722) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ew")
   public void method12463(int var1, int var2, int var3, int var4) {
      if (this.field6753.method12373((short)255)) {
         if (!this.field6742.method5775((short)-285)) {
            this.field6742.method5750(this.field6752, this.field6744, client.field932, (byte)4);
            if (!this.field6742.method5775((short)-6084)) {
               return;
            }
         }

         this.field6742.method5764(var1, var2, var3, var4, this.field6705, -1964943835 * this.field6707, this.field6693 * 624117895, (byte)-119);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gk")
   public int method12521() {
      return -1523454929 * this.field6694;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;III)V")
   @ObfuscatedName("vb")
   public static void method12445(classWM var0, int var1, int var2, int var3) {
      if (var0.field6744 != null) {
         int[] var4 = classGX.method5841(var0.field6744, var1, var2, var3, (short)22253);
         if (null == var4) {
            var4 = classGX.method5841(
               var0.field6744,
               classGX.method5895(var0.field6744, (byte)-15),
               classGX.method5890(var0.field6744, -741799132),
               var0.field6744.method5897(-2126289798),
               (short)4475
            );
         }

         method12403(
            var0, var4[0] - var0.field6744.method5871(2059441842) * 64, var4[1] - classGX.method5880(var0.field6744, (short)-11099) * 64, true, -1697518721
         );
         var0.field6696 = 832458829;
         var0.field6715 = -1910538783;
         var0.field6730 = var0.method12471(classGX.method5867(var0.field6744, (byte)39), 120041229);
         var0.field6729 = var0.field6730;
         var0.field6749 = null;
         var0.field6748 = null;
         var0.field6742.method5753((byte)-45);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;II)V")
   @ObfuscatedName("yp")
   public static void method12528(classWM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12531(var1, var1);
      } else {
         try {
            if (var1 >= 1) {
               if (var2 <= -751737320) {
                  throw new IllegalStateException();
               }

               var0.field6693 = var1 * -71107273;
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "wm.be(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fp")
   public void method12498(int var1, int var2) {
      if (null != this.field6744) {
         method12403(
            this,
            var1 - this.field6744.method5871(2002615988) * -392822479,
            var2 - classGX.method5880(this.field6744, (short)-15678) * -799290653,
            true,
            -1875882451
         );
         this.field6696 = 1806408931;
         this.field6715 = -1910538783;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fs")
   public void method12499(int var1, int var2) {
      if (null != this.field6744) {
         method12403(
            this, var1 - this.field6744.method5871(2038756018) * 64, var2 - classGX.method5880(this.field6744, (short)-7187) * -2043327439, true, -1436741266
         );
         this.field6696 = 832458829;
         this.field6715 = 833337649;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fn")
   public void method12505(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)15509);
         if (null != var4) {
            method12500(this, var4[0], var4[1], -175165264);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;IIIIII)Z")
   @ObfuscatedName("ri")
   public static boolean method12454(classWM var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0.field6754 == null) {
         return true;
      } else if (var0.field6754.field7007 == var1 && var0.field6754.field7009 == var2) {
         if (-285636757 * var0.field6740 != 1257880482 * var0.field6742.field2686) {
            return true;
         } else if (-819070451 * client.field881 != 1321367484 * var0.field6722) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fk")
   public void method12506(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)10483);
         if (null != var4) {
            method12500(this, var4[0], var4[1], 628621539);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fx")
   public void method12507(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)-12959);
         if (null != var4) {
            method12500(this, var4[0], var4[1], -989316156);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("eg")
   boolean method12455(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field6754 == null) {
         return true;
      } else if (this.field6754.field7007 == var1 && this.field6754.field7009 == var2) {
         if (-285636757 * this.field6740 != -314528699 * this.field6742.field2686) {
            return true;
         } else if (1373094587 * client.field881 != 829903289 * this.field6722) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eo")
   public void method12464(int var1, int var2, int var3, int var4) {
      if (this.field6753.method12373((short)255)) {
         if (!this.field6742.method5775((short)11113)) {
            this.field6742.method5750(this.field6752, this.field6744, client.field932, (byte)120);
            if (!this.field6742.method5775((short)-12535)) {
               return;
            }
         }

         this.field6742.method5764(var1, var2, var3, var4, this.field6705, -1964943835 * this.field6707, this.field6693 * -235260875, (byte)7);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("fm")
   public classKY method12514() {
      return this.field6744 == null ? null : this.field6744.method5844(this.method12509(1557510630), this.method12511(1827058575), (byte)114);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fr")
   public void method12508(int var1, int var2, int var3) {
      if (this.field6744 != null) {
         int[] var4 = classGX.method5841(this.field6744, var1, var2, var3, (short)6822);
         if (null != var4) {
            method12500(this, var4[0], var4[1], -785645989);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   public int method12516() {
      return this.field6695 * -811287683;
   }

   public void initializeWorldMap(WorldMapData var1) {
      this.method12434((classGX)var1, -568352897);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gb")
   public int method12522() {
      return 166969213 * this.field6694;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("go")
   public void method12524(int var1) {
      if (var1 >= 1) {
         this.field6702 = 759300585 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lhd;")
   @ObfuscatedName("hc")
   public classHD method12586() {
      if (!this.field6753.method12373((short)255)) {
         return null;
      } else if (!this.field6742.method5775((short)8494)) {
         return null;
      } else {
         HashMap var1 = this.field6742.method5786((byte)103);
         this.field6749 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6749.addAll(var3);
         }

         this.field6748 = this.field6749.iterator();
         return this.method12588((byte)-56);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ga")
   public void method12526() {
      this.field6702 = -1305720828;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gc")
   public void method12529(int var1) {
      if (var1 >= 1) {
         this.field6693 = var1 * 249542509;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;III)V")
   @ObfuscatedName("if")
   public static void method12500(classWM var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12501(var1, var1, var1);
      }

      try {
         if (null == var0.field6744) {
            if (var3 >= 982132619) {
               throw new IllegalStateException();
            }
         } else {
            method12403(
               var0, var1 - var0.field6744.method5871(2111888647) * 64, var2 - classGX.method5880(var0.field6744, (short)-4294) * 64, true, -1279830878
            );
            var0.field6696 = 832458829;
            var0.field6715 = -1910538783;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gw")
   public void method12530(int var1) {
      if (var1 >= 1) {
         this.field6693 = var1 * -71107273;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gg")
   public void method12535() {
      this.field6693 = 739603646;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bn")
   public int method12477(byte var1) {
      try {
         if (this.field6729 == 1.0) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if (this.field6729 == 1.5) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return 37;
            }
         } else if (this.field6729 == 2.0) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return 50;
            }
         } else if (3.0 == this.field6729) {
            return 75;
         } else if (this.field6729 == 4.0) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 200;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("do")
   public int method12602() {
      return this.field6696 * -19228805;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gt")
   public void method12536() {
      this.field6693 = 739603646;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method12399(int var1) {
      try {
         if (classMC.field4481 != null) {
            if (var1 > 943875281) {
               this.field6730 = this.field6729;
            }
         } else {
            if (this.field6730 < this.field6729) {
               if (var1 <= 943875281) {
                  throw new IllegalStateException();
               }

               this.field6730 = Math.min(this.field6729, this.field6730 + this.field6730 / 30.0F);
            }

            if (this.field6730 > this.field6729) {
               if (var1 <= 943875281) {
                  throw new IllegalStateException();
               }

               this.field6730 = Math.max(this.field6729, this.field6730 - this.field6730 / 30.0F);
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gy")
   public void method12538(boolean var1) {
      this.field6698 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gs")
   public void method12539(boolean var1) {
      this.field6698 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gj")
   public void method12540(boolean var1) {
      this.field6698 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gx")
   public void method12542(int var1) {
      this.field6705 = new HashSet();
      this.field6705.add(var1);
      this.field6706 = 0;
      this.field6707 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ge")
   public void method12543(int var1) {
      this.field6705 = new HashSet();
      this.field6705.add(var1);
      this.field6706 = 0;
      this.field6707 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gr")
   public void method12545(int var1) {
      this.field6705 = new HashSet();
      this.field6706 = 0;
      this.field6707 = 0;

      for (int var2 = 0; var2 < classPS.field5407 * -1676885712; var2++) {
         if (classFJ.method4796(var2, (byte)-102) != null && classFJ.method4796(var2, (byte)-78).field5404 * -1896737909 == var1) {
            this.field6705.add(classFJ.method4796(var2, (byte)-94).field5405 * 959033126);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gf")
   public void method12548() {
      this.field6705 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bh")
   public boolean method12564(int var1) {
      return !this.field6714.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("hw")
   public void method12551(int var1, boolean var2) {
      if (!var2) {
         this.field6713.add(var1);
      } else {
         this.field6713.remove(var1);
      }

      method12570(this, (byte)105);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("hi")
   public void method12553(int var1, boolean var2) {
      if (!var2) {
         this.field6714.add(var1);
      } else {
         this.field6714.remove(var1);
      }

      for (int var3 = 0; var3 < 925594537 * classPS.field5407; var3++) {
         if (classFJ.method4796(var3, (byte)11) != null && classFJ.method4796(var3, (byte)-98).field5404 * 1254355271 == var1) {
            int var4 = classFJ.method4796(var3, (byte)-8).field5405 * 872689451;
            if (!var2) {
               this.field6709.add(var4);
            } else {
               this.field6709.remove(var4);
            }
         }
      }

      method12570(this, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ez")
   void method12470(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      classYW.method13698(var1, var2, var3, var4, -16777216);
      classYW.method13707(var7 - 152, var8, 304, 34, -65536);
      classYW.method13698(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      this.field6755.method65(classKK.field3921, var7, var6 + var8, -1, -1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("hs")
   public static void method12411(classWM var0) {
      if (var0 == null) {
         var0.method12484();
      }

      var0.field6711 = 1677524883;
      var0.field6700 = 935653697;
      var0.field6703 = -655388513;
      var0.field6710 = -983836297;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("hd")
   public void method12557(boolean var1) {
      this.field6717 = !var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bp")
   public boolean method12561(int var1) {
      return !this.field6713.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIZJ)V")
   @ObfuscatedName("ag")
   void method12395(int var1, int var2, boolean var3, long var4) {
      try {
         if (this.field6744 != null) {
            int var6 = (int)(
               this.field6736 * -1664894373 + (var1 - -543890359 * this.field6699 - method12518(this, (byte)-20) * this.field6730 / 2.0F) / this.field6730
            );
            int var7 = (int)(
               this.field6738 * 1010414839 - (var2 - this.field6697 * 959218751 - this.method12519(2000494820) * this.field6730 / 2.0F) / this.field6730
            );
            this.field6719 = this.field6744
               .method5844(var6 + this.field6744.method5871(1979976170) * 64, var7 + classGX.method5880(this.field6744, (short)-7509) * 64, (byte)96);
            if (this.field6719 != null && var3) {
               classFA var8 = client.field931;
               if (classCG.method1497((byte)-65) && classFA.method4540(var8, 82, 1135407994) && classFA.method4540(var8, 81, 2134325806)) {
                  classJS.method6413(
                     this.field6719.field4055 * 1870919123, this.field6719.field4056 * 819227381, this.field6719.field4057 * -210579119, false, -1973590340
                  );
               } else {
                  boolean var10 = true;
                  if (this.field6712) {
                     int var11 = var1 - -103516745 * this.field6739;
                     int var12 = var2 - this.field6737 * 2045505085;
                     if (var4 - 7559854042491313145L * this.field6741 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                        var10 = false;
                     }
                  }

                  if (var10) {
                     classJL var14 = classEF.method3849(classJS.CLICKWORLDMAP, client.field795.field1535, (byte)76);
                     var14.field3343.method13232(this.field6719.method6619(-1777655593), 730941790);
                     client.field795.method3367(var14, -1301097035);
                     this.field6741 = 0L;
                  }
               }
            }
         } else {
            this.field6719 = null;
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "wm.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwm;I)Z")
   @ObfuscatedName("iz")
   public static boolean method12414(classWM var0, int var1) {
      if (var0 == null) {
         var0.method12485(var1);
      }

      try {
         if (-19228805 * var0.field6696 != -1) {
            if (var1 <= 1547676657) {
               throw new IllegalStateException();
            }

            if (-1 != -1101891105 * var0.field6715) {
               if (var1 <= 1547676657) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hx")
   public boolean method12565(int var1) {
      return !this.field6714.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hm")
   public boolean method12566(int var1) {
      return !this.field6714.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lwm;I)Z")
   @ObfuscatedName("lc")
   public static boolean method12555(classWM var0, int var1) {
      if (var0 == null) {
         return var0.method12567(var1);
      } else {
         try {
            boolean var10000;
            if (!var0.field6717) {
               if (var1 == -2127982102) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "wm.bh(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hr")
   void method12571() {
      this.field6716.clear();
      this.field6716.addAll(this.field6713);
      this.field6716.addAll(this.field6709);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ha")
   void method12572() {
      this.field6716.clear();
      this.field6716.addAll(this.field6713);
      this.field6716.addAll(this.field6709);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hu")
   void method12573() {
      this.field6716.clear();
      this.field6716.addAll(this.field6713);
      this.field6716.addAll(this.field6709);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hj")
   void method12574() {
      this.field6716.clear();
      this.field6716.addAll(this.field6713);
      this.field6716.addAll(this.field6709);
   }

   @ObfuscatedSignature(descriptor = "()Lhd;")
   @ObfuscatedName("hn")
   public classHD method12589() {
      if (null == this.field6748) {
         return null;
      } else {
         while (this.field6748.hasNext()) {
            classHD var1 = (classHD)this.field6748.next();
            if (var1.vmethod486((byte)-112) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("en")
   boolean method12456(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field6754 == null) {
         return true;
      } else if (this.field6754.field7007 == var1 && this.field6754.field7009 == var2) {
         if (-709750092 * this.field6740 != -314528699 * this.field6742.field2686) {
            return true;
         } else if (1373094587 * client.field881 != -796052709 * this.field6722) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILky;Lky;)V")
   @ObfuscatedName("hy")
   public void method12581(int var1, int var2, classKY var3, classKY var4) {
      classHV var5 = new classHV(var2, var3, var4);
      Object[] var6 = new Object[]{var5};
      classZR var7 = null;
      switch (var1) {
         case 1008:
            var7 = classZS.method14182(classCA.method1392(10, -1962264714).method14145(var6, (byte)2), (byte)21);
            break;
         case 1009:
            var7 = classZS.method14182(classCA.method1392(11, -1050774769).method14145(var6, (byte)2), (byte)25);
            break;
         case 1010:
            var7 = classZS.method14182(classCA.method1392(12, -1055873954).method14145(var6, (byte)2), (byte)118);
            break;
         case 1011:
            var7 = classZS.method14182(classCA.method1392(13, -1286332539).method14145(var6, (byte)2), (byte)63);
            break;
         case 1012:
            var7 = classZS.method14182(classCA.method1392(14, -1109466741).method14145(var6, (byte)2), (byte)82);
      }

      if (var7 != null) {
         classSZ.method10729(var7, -617721645);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("uc")
   public static void method12451(classWM var0) {
      if (var0 == null) {
         var0.method12547();
      }

      classGR.field2663.method6167();
   }

   public float getWorldMapZoom() {
      return this.field6730;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public void method12385(byte var1) {
      try {
         classPF.method8854((byte)71);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   void method12400() {
      if (classMC.field4481 != null) {
         this.field6730 = this.field6729;
      } else {
         if (this.field6730 < this.field6729) {
            this.field6730 = Math.min(this.field6729, this.field6730 + this.field6730 / 30.0F);
         }

         if (this.field6730 > this.field6729) {
            this.field6730 = Math.max(this.field6729, this.field6730 - this.field6730 / 30.0F);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)Z")
   @ObfuscatedName("rf")
   public static boolean method12415(classWM var0) {
      return -19228805 * var0.field6696 != -1 && -1 != -1101891105 * var0.field6715;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cz")
   public void method12393(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label44: {
         var5 = classDD.method2983(16711680);
         this.method12395(var1, var2, var4, var5);
         if (!method12414(this, 1978668659) && (var4 || var3)) {
            boolean var7 = classWK.field6691.method12154(-431955666);
            if (!var7) {
               if (var4) {
                  this.field6700 = -935653697 * var1;
                  this.field6711 = -1677524883 * var2;
                  this.field6710 = -223069005 * this.field6736;
                  this.field6703 = -943412585 * this.field6738;
               }

               if (this.field6710 * -156946503 != -1) {
                  int var8 = var1 - this.field6700 * 543121727;
                  int var9 = var2 - -656340635 * this.field6711;
                  method12403(
                     this,
                     -156946503 * this.field6710 - (int)(var8 / this.field6729),
                     (int)(var9 / this.field6729) + this.field6703 * 1131574433,
                     false,
                     -1795595335
                  );
               }
               break label44;
            }
         }

         this.method12410(1429288549);
      }

      if (var4) {
         this.field6741 = -2654852032954698167L * var5;
         this.field6739 = var1 * 1947564039;
         this.field6737 = -427845355 * var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lhd;")
   @ObfuscatedName("hb")
   public classHD method12587() {
      if (!this.field6753.method12373((short)255)) {
         return null;
      } else if (!this.field6742.method5775((short)6620)) {
         return null;
      } else {
         HashMap var1 = this.field6742.method5786((byte)89);
         this.field6749 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6749.addAll(var3);
         }

         this.field6748 = this.field6749.iterator();
         return this.method12588((byte)-113);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILky;Lky;)V")
   @ObfuscatedName("hh")
   public void method12582(int var1, int var2, classKY var3, classKY var4) {
      classHV var5 = new classHV(var2, var3, var4);
      Object[] var6 = new Object[]{var5};
      classZR var7 = null;
      switch (var1) {
         case 1008:
            var7 = classZS.method14182(classCA.method1392(10, -1158847301).method14145(var6, (byte)2), (byte)89);
            break;
         case 1009:
            var7 = classZS.method14182(classCA.method1392(11, -1707388737).method14145(var6, (byte)2), (byte)28);
            break;
         case 1010:
            var7 = classZS.method14182(classCA.method1392(12, -1204875656).method14145(var6, (byte)2), (byte)48);
            break;
         case 1011:
            var7 = classZS.method14182(classCA.method1392(13, -2022456984).method14145(var6, (byte)2), (byte)56);
            break;
         case 1012:
            var7 = classZS.method14182(classCA.method1392(14, -1052099835).method14145(var6, (byte)2), (byte)2);
      }

      if (var7 != null) {
         classSZ.method10729(var7, -736800227);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lhd;")
   @ObfuscatedName("hs")
   public classHD method12590() {
      if (null == this.field6748) {
         return null;
      } else {
         while (this.field6748.hasNext()) {
            classHD var1 = (classHD)this.field6748.next();
            if (var1.vmethod486((byte)1) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("ac")
   final void method12408(int var1, int var2, boolean var3, int var4) {
      try {
         this.field6700 = -871438893 * var1;
         this.field6722 = 841829575 * var2;
         classDD.method2983(16711680);
         if (var3) {
            if (var4 >= -787422434) {
               return;
            }

            this.method12410(1429288549);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wm.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("an")
   public void method12465(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (!this.field6753.method12373((short)255)) {
            if (var5 == 1689794791) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.field6742.method5775((short)16106)) {
               if (var5 == 1689794791) {
                  throw new IllegalStateException();
               }

               this.field6742.method5750(this.field6750, this.field6744, client.field1133, (byte)2);
               if (!this.field6742.method5775((short)-10268)) {
                  if (var5 == 1689794791) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            this.field6742.method5764(var1, var2, var3, var4, this.field6713, -1964943835 * this.field6700, this.field6707 * 624117895, (byte)-75);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wm.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("cr")
   public boolean method12562(int var1, byte var2) {
      try {
         boolean var10000;
         if (!this.field6709.contains(var1)) {
            if (var2 == 16) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.cr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bt")
   public void method12501(int var1, int var2, int var3) {
      try {
         if (null == this.field6743) {
            if (var3 >= 982132619) {
               throw new IllegalStateException();
            }
         } else {
            method12403(
               this, var1 - this.field6745.method5853(2111888647) * 64, var2 - classGX.method5880(this.field6743, (short)-4294) * 64, true, -1279830878
            );
            this.field6737 = 832458829;
            this.field6694 = -1910538783;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wm.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   boolean method12485(int var1) {
      try {
         return this.field6753.method12373((short)255);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ba")
   public int method12517(byte var1) {
      try {
         return this.field6703 * -811287683;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.ba(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("be")
   public void method12531(int var1, int var2) {
      try {
         if (var1 >= 1) {
            if (var2 <= -751737320) {
               throw new IllegalStateException();
            }

            this.field6710 = var1 * -71107273;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hp")
   public boolean method12567(int var1) {
      return !this.field6705.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bz")
   public void method12558(boolean var1, byte var2) {
      try {
         this.field6717 = !var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cu")
   public boolean method12568(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.field6716.contains(var1)) {
            if (var2 == -1229776556) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wm.cu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cb")
   void method12527(byte var1) {
      try {
         this.field6700 = -878772995;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILky;Lky;I)V")
   @ObfuscatedName("cq")
   public void method12583(int var1, int var2, classKY var3, classKY var4, int var5) {
      try {
         classHV var6 = new classHV(var2, var3, var4);
         Object[] var7 = new Object[]{var6};
         classZR var8 = null;
         switch (var1) {
            case 1008:
               var8 = classZS.method14182(classCA.method1392(10, -1601227786).method14145(var7, (byte)2), (byte)84);
               break;
            case 1009:
               var8 = classZS.method14182(classCA.method1392(11, -1847135103).method14145(var7, (byte)2), (byte)109);
               break;
            case 1010:
               var8 = classZS.method14182(classCA.method1392(12, -1573681068).method14145(var7, (byte)2), (byte)67);
               break;
            case 1011:
               var8 = classZS.method14182(classCA.method1392(13, -1146537211).method14145(var7, (byte)2), (byte)4);
               break;
            case 1012:
               var8 = classZS.method14182(classCA.method1392(14, -1641551997).method14145(var7, (byte)2), (byte)121);
         }

         if (var8 != null) {
            if (var5 == -1305955669) {
               return;
            }

            classSZ.method10729(var8, -187132422);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "wm.cq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method12575() {
      this.field6708.clear();
      this.field6713.addAll(this.field6714);
      this.field6705.addAll(this.field6705);
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("dp")
   void method12440(classGX var1) {
      this.field6745 = var1;
      this.field6742 = new classGU(this.field6756, this.field6747, this.field6751, this.field6751);
      classWH.method12366(this.field6753, this.field6743, (byte)81);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fu")
   public void method12495(int var1, int var2) {
      if (null != this.field6745 && classGX.method5838(this.field6745, var1, var2, 230188470)) {
         this.field6696 = (var1 - this.field6744.method5848(2127428772) * 1933136788) * -832458829;
         this.field6696 = (var2 - classGX.method5880(this.field6744, (short)-9376) * 532582767) * -1899767149;
      }
   }

   public void setWorldMapPositionTarget(WorldPoint var1) {
      this.method12598(var1.getX(), var1.getY());
   }

   @ObfuscatedSignature(descriptor = "(Lwm;B)I")
   @ObfuscatedName("hu")
   public static int method12518(classWM var0, byte var1) {
      if (var0 == null) {
         var0.method12517(var1);
      }

      try {
         return var0.field6695 * -811287683;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wm.ba(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fb")
   public void method12496(int var1, int var2) {
      if (null != this.field6743 && classGX.method5838(this.field6743, var1, var2, 1216744707)) {
         this.field6740 = (var1 - this.field6744.method5852(1979114778) * 1702755890) * -87770755;
         this.field6707 = (var2 - classGX.method5880(this.field6744, (short)-2801) * -1918236354) * 1910538783;
      }
   }
}
