import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nu")
public class classNU extends classAH {
   @ObfuscatedName("aw")
   int[] field4771;
   @ObfuscatedName("ah")
   int[] field4768;
   @ObfuscatedName("bx")
   int[] field4765;
   @ObfuscatedName("ag")
   static ThreadPoolExecutor field4749 = null;
   @ObfuscatedName("am")
   int[] field4762;
   @ObfuscatedName("ax")
   public int field4751;
   @ObfuscatedName("ak")
   int[] field4758;
   @ObfuscatedName("aa")
   int[] field4752;
   @ObfuscatedName("ao")
   int[] field4753;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("al")
   classYI field4772;
   @ObfuscatedName("bg")
   int field4754;
   @ObfuscatedName("aj")
   int field4763;
   @ObfuscatedName("ac")
   int[] field4750;
   @ObfuscatedName("ad")
   int[] field4773;
   @ObfuscatedSignature(descriptor = "Lak;")
   @ObfuscatedName("ba")
   classAK field4760;
   @ObfuscatedName("bk")
   long field4779;
   @ObfuscatedName("av")
   int[] field4756;
   @ObfuscatedName("at")
   int[] field4759;
   @ObfuscatedName("aq")
   int[] field4755;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4775 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4776 = 2;
   @ObfuscatedName("bn")
   int[] field4764;
   @ObfuscatedName("as")
   PriorityQueue field4757 = new PriorityQueue(5, new classNL());
   @ObfuscatedName("bc")
   int[] field4766;
   @ObfuscatedSignature(descriptor = "[[Lnt;")
   @ObfuscatedName("bp")
   classNT[][] field4767;
   @ObfuscatedSignature(descriptor = "[[Lnt;")
   @ObfuscatedName("br")
   classNT[][] field4774;
   @ObfuscatedSignature(descriptor = "Lnc;")
   @ObfuscatedName("bm")
   classNC field4769;
   @ObfuscatedName("bt")
   boolean field4781;
   @ObfuscatedName("ab")
   static AtomicBoolean field4748 = null;
   @ObfuscatedName("ay")
   int field4777;
   @ObfuscatedName("bj")
   int field4778;
   @ObfuscatedName("bo")
   long field4780;
   @ObfuscatedSignature(descriptor = "Lnd;")
   @ObfuscatedName("bu")
   classND field4770;
   @ObfuscatedName("an")
   int[] field4761;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method8023() {
      synchronized (this.field4760) {
         for (classNR var2 = (classNR)this.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(this.field4772)) {
            classNR.method7994(var2, (byte)110);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   public boolean method8044() {
      synchronized (this.field4760) {
         return classYI.method13368(this.field4772) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ah")
   @Override
   protected classAH vmethod34() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   public void method8024(byte var1) {
      try {
         synchronized (this.field4760) {
            for (classNR var3 = (classNR)this.field4772.method13375(); var3 != null; var3 = (classNR)classYK.method13401(this.field4772)) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classNR.method7994(var3, (byte)60);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "nu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ao")
   public void method8026(byte var1) {
      try {
         synchronized (this.field4760) {
            for (classNR var3 = (classNR)this.field4772.method13375(); var3 != null; var3 = (classNR)classYK.method13401(this.field4772)) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var3.vmethod398();
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "nu.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method8027() {
      synchronized (this.field4760) {
         for (classNR var2 = (classNR)this.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(this.field4772)) {
            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("du")
   public void method8049(int var1, int var2) {
      synchronized (this.field4760) {
         method8059(this, var1, var2, -1973392059);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aq")
   public boolean method8041(byte var1) {
      try {
         synchronized (this.field4760) {
            return this.field4769.method7772();
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "nu.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ad")
   public boolean method8045(short var1) {
      try {
         synchronized (this.field4760) {
            boolean var10000;
            if (classYI.method13368(this.field4772) > 0) {
               if (var1 <= 1122) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "nu.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;ZI)V")
   @ObfuscatedName("nz")
   public static void method8065(classNU var0, classNT var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method8070(var1, var2, var3);
      }

      try {
         int var5;
         label37: {
            int var4 = var1.field4743.field189.length;
            if (var2) {
               if (var3 != 881975798) {
                  throw new IllegalStateException();
               }

               if (var1.field4743.field190) {
                  if (var3 != 881975798) {
                     throw new IllegalStateException();
                  }

                  int var6 = var4 + var4 - var1.field4743.field192;
                  var5 = (int)((long)var6 * var0.field4752[var1.field4725 * -1057694491] >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 != 881975798) {
                        throw new IllegalStateException();
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.field4744.method567(true);
                  }
                  break label37;
               }
            }

            var5 = (int)((long)var4 * var0.field4752[var1.field4725 * -1057694491] >> 6);
         }

         var1.field4744.method562(var5);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nu.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnu;Lno;ZB)V")
   @ObfuscatedName("tu")
   public static void method8031(classNU var0, classNO var1, boolean var2, byte var3) {
      if (var0 == null) {
         var0.method8035(var1, var2, var3);
      } else {
         try {
            synchronized (var0.field4760) {
               var0.method8040((byte)-90);
               classNC.method7763(var0.field4769, var1.field4693);
               var0.field4781 = var2;
               var0.field4779 = 0L;
               int var5 = var0.field4769.method7775();

               for (int var6 = 0; var6 < var5; var6++) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var0.field4769.method7779(var6);
                  var0.field4769.method7789(var6);
                  var0.field4769.method7780(var6);
               }

               var0.field4778 = var0.field4769.method7809() * -1778762749;
               var0.field4777 = var0.field4769.field4656[-1076146517 * var0.field4778] * 596597749;
               var0.field4780 = classXQ.method12873(var0.field4769, 852899933 * var0.field4777) * -7106189560981577079L;
            }
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "nu.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fp")
   int method8126(classNT var1) {
      classNY var2 = var1.field4747;
      int var3 = 4096 + this.field4755[-1057694491 * var1.field4725] * this.field4771[-1057694491 * var1.field4725] >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.field4723 * -983353503 * var3 + 16384 >> 15;
      var3 = 1238197527 * this.field4754 * var3 + 128 >> 8;
      if (-939533713 * var2.field4793 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, -939533713 * var2.field4793 * (1.953125E-5 * (934628419 * var1.field4739))) + 0.5);
      }

      if (var2.field4798 != null) {
         int var4 = 1539106655 * var1.field4733;
         int var5 = var2.field4798[1 + var1.field4724 * 1565767631];
         if (var1.field4724 * 1565767631 < var2.field4798.length - 2) {
            int var6 = (var2.field4798[1565767631 * var1.field4724] & 255) << 8;
            int var7 = (var2.field4798[var1.field4724 * 1565767631 + 2] & 255) << 8;
            var5 += (var2.field4798[1565767631 * var1.field4724 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (67131625 * var1.field4732 > 0 && var2.field4799 != null) {
         int var11 = var1.field4732 * 67131625;
         int var12 = var2.field4799[1 + var1.field4736 * -463641621];
         if (-463641621 * var1.field4736 < var2.field4799.length - 2) {
            int var13 = (var2.field4799[var1.field4736 * -463641621] & 255) << 8;
            int var14 = (var2.field4799[-463641621 * var1.field4736 + 2] & 255) << 8;
            var12 += (var11 - var13) * (var2.field4799[3 + var1.field4736 * -463641621] - var12) / (var14 - var13);
         }

         var3 = var3 * var12 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("db")
   void method8060(int var1, int var2) {
      if (var2 != this.field4756[var1]) {
         this.field4756[var1] = var2;

         for (int var3 = 0; var3 < 128; var3++) {
            this.field4774[var1][var3] = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bm")
   void method8062(int var1, int var2, int var3, int var4) {
      try {
         this.method8071(var1, var2, 64, -1053552803);
         if ((this.field4750[var1] & 2) != 0) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7920(); var5 != null; var5 = (classNT)this.field4770.field4661.method7925()) {
               if (-1057694491 * var5.field4725 == var1) {
                  if (var4 == 799916168) {
                     throw new IllegalStateException();
                  }

                  if (var5.field4732 * 67131625 < 0) {
                     if (var4 == 799916168) {
                        throw new IllegalStateException();
                     }

                     this.field4767[var1][-107170957 * var5.field4738] = null;
                     this.field4767[var1][var2] = var5;
                     int var6 = (var5.field4728 * -359606667 * -403336933 * var5.field4730 >> 12) + var5.field4731 * -1276571151;
                     var5.field4731 = var5.field4731 + -665600239 * (var2 - -107170957 * var5.field4738 << 8);
                     var5.field4730 = -300850925 * (var6 - var5.field4731 * -1276571151);
                     var5.field4728 = 480104448;
                     var5.field4738 = -685332037 * var2;
                     return;
                  }
               }
            }
         }

         classNR var10 = (classNR)this.field4772.method13363(this.field4756[var1]);
         if (null == var10) {
            if (var4 == 799916168) {
               throw new IllegalStateException();
            }
         } else if (null == var10.field4706[var2]) {
            if (var4 == 799916168) {
               throw new IllegalStateException();
            }
         } else {
            classAJ var11 = var10.field4706[var2].method706(1016727737);
            if (var11 == null) {
               if (var4 != 799916168) {
                  ;
               }
            } else {
               classNT var7 = new classNT();
               var7.field4725 = -1566998291 * var1;
               var7.field4746 = var10;
               var7.field4743 = var11;
               var7.field4747 = var10.field4713[var2];
               var7.field4735 = var10.field4711[var2] * 1130932567;
               var7.field4738 = var2 * -685332037;
               var7.field4723 = 780512417 * (1024 + var10.field4710 * -127646999 * var3 * var3 * var10.field4708[var2] >> 11);
               var7.field4722 = -225319163 * (var10.field4709[var2] & 255);
               var7.field4731 = ((var2 << 8) - (var10.field4707[var2] & 32767)) * -665600239;
               var7.field4739 = 0;
               var7.field4733 = 0;
               var7.field4724 = 0;
               var7.field4732 = -371851097;
               var7.field4736 = 0;
               if (0 == this.field4752[var1]) {
                  if (var4 == 799916168) {
                     throw new IllegalStateException();
                  }

                  var7.field4744 = classAM.method470(
                     var11, this.method8125(var7, -851559498), this.method8127(var7, -1876968885), this.method8132(var7, 1746496860)
                  );
               } else {
                  var7.field4744 = classAM.method470(var11, this.method8125(var7, -1168586760), 0, this.method8132(var7, 1725890535));
                  boolean var10002;
                  if (var10.field4707[var2] < 0) {
                     if (var4 == 799916168) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  method8065(this, var7, var10002, 881975798);
               }

               if (var10.field4707[var2] < 0) {
                  var7.field4744.method539(-1);
               }

               if (-1530244505 * var7.field4735 >= 0) {
                  if (var4 == 799916168) {
                     throw new IllegalStateException();
                  }

                  classNT var8 = this.field4774[var1][-1530244505 * var7.field4735];
                  if (var8 != null) {
                     if (var4 == 799916168) {
                        throw new IllegalStateException();
                     }

                     if (67131625 * var8.field4732 < 0) {
                        if (var4 == 799916168) {
                           throw new IllegalStateException();
                        }

                        this.field4767[var1][var8.field4738 * -107170957] = null;
                        var8.field4732 = 0;
                     }
                  }

                  this.field4774[var1][var7.field4735 * -1530244505] = var7;
               }

               classNN.method7900(this.field4770.field4661, var7);
               this.field4767[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "nu.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bk")
   void method8098(int var1, byte var2) {
      try {
         if (var1 < 0) {
            if (var2 != 2) {
               for (int var4 = 0; var4 < 16; var4++) {
                  if (var2 == 2) {
                     throw new IllegalStateException();
                  }

                  this.method8098(var4, (byte)14);
               }
            }
         } else {
            this.field4755[var1] = 12800;
            this.field4773[var1] = 8192;
            this.field4771[var1] = 16383;
            this.field4761[var1] = 8192;
            this.field4762[var1] = 0;
            this.field4768[var1] = 8192;
            this.method8108(var1, -2033466329);
            method8111(this, var1, -1140320208);
            this.field4750[var1] = 0;
            this.field4764[var1] = 32767;
            this.field4765[var1] = 256;
            this.field4752[var1] = 0;
            method8119(this, var1, 8192, (byte)71);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "nu.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method8011() {
      return 1238197527 * this.field4754;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bj")
   void method8093(int var1, int var2) {
      try {
         for (classNT var3 = (classNT)this.field4770.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4770.field4661)) {
            if (var2 <= 2044929277) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 <= 2044929277) {
                  throw new IllegalStateException();
               }

               if (var1 != -1057694491 * var3.field4725) {
                  continue;
               }

               if (var2 <= 2044929277) {
                  throw new IllegalStateException();
               }
            }

            if (null != var3.field4744) {
               if (var2 <= 2044929277) {
                  return;
               }

               var3.field4744.method581(classLG.field4138 * 675076789 / 100);
               if (var3.field4744.method594()) {
                  if (var2 <= 2044929277) {
                     throw new IllegalStateException();
                  }

                  this.field4770.field4662.method617(var3.field4744);
               }

               var3.method8002(1946466263);
            }

            if (var3.field4732 * 67131625 < 0) {
               if (var2 <= 2044929277) {
                  return;
               }

               this.field4767[-1057694491 * var3.field4725][-107170957 * var3.field4738] = null;
            }

            var3.vmethod398();
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dt")
   void method8056(int var1, int var2) {
      this.field4758[var1] = var2;
      this.field4759[var1] = var2 & 906513920;
      method8061(this, var1, var2, 1958391157);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bw")
   void method8102(int var1, byte var2) {
      try {
         for (classNT var3 = (classNT)this.field4770.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4770.field4661)) {
            if (var1 >= 0) {
               if (var2 != 0) {
                  return;
               }

               if (var1 != var3.field4725 * -1057694491) {
                  continue;
               }
            }

            if (var3.field4732 * 67131625 < 0) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               this.field4767[var3.field4725 * -1057694491][var3.field4738 * -107170957] = null;
               var3.field4732 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   void method8105(int var1) {
      try {
         this.method8093(-1, 2100279562);
         this.method8098(-1, (byte)19);

         for (int var2 = 0; var2 < 16; var2++) {
            this.field4756[var2] = this.field4758[var2];
         }

         for (int var4 = 0; var4 < 16; var4++) {
            if (var1 >= -676520024) {
               throw new IllegalStateException();
            }

            this.field4759[var4] = this.field4758[var4] & -128;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "nu.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("be")
   void method8108(int var1, int var2) {
      try {
         if ((this.field4750[var1] & 2) != 0) {
            if (var2 >= -918718938) {
               throw new IllegalStateException();
            }

            for (classNT var3 = (classNT)this.field4770.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (var2 >= -918718938) {
                  throw new IllegalStateException();
               }

               if (-1057694491 * var3.field4725 == var1 && this.field4767[var1][var3.field4738 * -107170957] == null && 67131625 * var3.field4732 < 0) {
                  var3.field4732 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fv")
   void method8137() {
      int var1 = -1076146517 * this.field4778;
      int var2 = 2122727052 * this.field4777;

      long var3;
      for (var3 = 5174971452106306489L * this.field4780; this.field4777 * 852899933 == var2; var3 = classXQ.method12873(this.field4769, var2)) {
         while (true) {
            if (var2 == this.field4769.field4656[var1]) {
               this.field4769.method7779(var1);
               int var5 = classAT.method692(this.field4769, var1);
               if (1 != var5) {
                  if (0 != (var5 & 128)) {
                     this.method8114(var5, -724523093);
                  }

                  this.field4769.method7789(var1);
                  this.field4769.method7780(var1);
                  continue;
               }

               this.field4769.method7787();
               this.field4769.method7780(var1);
               if (this.field4769.method7812()) {
                  if (!this.field4781 || var2 == 0) {
                     this.method8105(-1768093644);
                     classNC.method7768(this.field4769);
                     return;
                  }

                  this.field4769.method7815(var3);
               }
            }

            var1 = this.field4769.method7809();
            var2 = this.field4769.field4656[var1];
            break;
         }
      }

      this.field4778 = -1260362814 * var1;
      this.field4777 = var2 * -1258786400;
      this.field4780 = var3 * -7106189560981577079L;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   public int method8012() {
      return 1238197527 * this.field4754;
   }

   @ObfuscatedSignature(descriptor = "(Lnt;I)I")
   @ObfuscatedName("bd")
   int method8127(classNT var1, int var2) {
      try {
         classNY var3 = var1.field4747;
         int var4 = 4096 + this.field4755[-1057694491 * var1.field4725] * this.field4771[-1057694491 * var1.field4725] >> 13;
         var4 = var4 * var4 + 16384 >> 15;
         var4 = var1.field4723 * -983353503 * var4 + 16384 >> 15;
         var4 = 1238197527 * this.field4754 * var4 + 128 >> 8;
         if (-939533713 * var3.field4793 > 0) {
            if (var2 == -1095595519) {
               throw new IllegalStateException();
            }

            var4 = (int)(var4 * Math.pow(0.5, -939533713 * var3.field4793 * (1.953125E-5 * (934628419 * var1.field4739))) + 0.5);
         }

         if (var3.field4798 != null) {
            int var5 = 1539106655 * var1.field4733;
            int var6 = var3.field4798[1 + var1.field4724 * 1565767631];
            if (var1.field4724 * 1565767631 < var3.field4798.length - 2) {
               if (var2 == -1095595519) {
                  throw new IllegalStateException();
               }

               int var7 = (var3.field4798[1565767631 * var1.field4724] & 255) << 8;
               int var8 = (var3.field4798[var1.field4724 * 1565767631 + 2] & 255) << 8;
               var6 += (var3.field4798[1565767631 * var1.field4724 + 3] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         if (67131625 * var1.field4732 > 0) {
            if (var2 == -1095595519) {
               throw new IllegalStateException();
            }

            if (var3.field4799 != null) {
               if (var2 == -1095595519) {
                  throw new IllegalStateException();
               }

               int var13 = var1.field4732 * 67131625;
               int var14 = var3.field4799[1 + var1.field4736 * -463641621];
               if (-463641621 * var1.field4736 < var3.field4799.length - 2) {
                  if (var2 == -1095595519) {
                     throw new IllegalStateException();
                  }

                  int var15 = (var3.field4799[var1.field4736 * -463641621] & 255) << 8;
                  int var16 = (var3.field4799[-463641621 * var1.field4736 + 2] & 255) << 8;
                  var14 += (var13 - var15) * (var3.field4799[3 + var1.field4736 * -463641621] - var14) / (var16 - var15);
               }

               var4 = var4 * var14 + 32 >> 6;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "nu.bd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eh")
   void method8099(int var1) {
      if (var1 >= 0) {
         this.field4755[var1] = 12800;
         this.field4773[var1] = 8192;
         this.field4771[var1] = 16383;
         this.field4761[var1] = 8192;
         this.field4762[var1] = 0;
         this.field4768[var1] = 8192;
         this.method8108(var1, -1564988536);
         method8111(this, var1, -1140320208);
         this.field4750[var1] = 0;
         this.field4764[var1] = 32767;
         this.field4765[var1] = 462154629;
         this.field4752[var1] = 0;
         method8119(this, var1, 173345212, (byte)93);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            this.method8098(var2, (byte)37);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("as")
   @Override
   protected classAH vmethod29() {
      try {
         return this.field4770;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nu.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ax")
   @Override
   protected classAH vmethod35() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nu.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fd")
   int method8128(classNT var1) {
      classNY var2 = var1.field4747;
      int var3 = 353099282 + this.field4755[1357548492 * var1.field4725] * this.field4771[-1057694491 * var1.field4725] >> 13;
      var3 = var3 * var3 + -880750220 >> 15;
      var3 = var1.field4723 * -983353503 * var3 + 16384 >> 15;
      var3 = 1855461802 * this.field4754 * var3 + 128 >> 8;
      if (-1222388173 * var2.field4793 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, -2037092064 * var2.field4793 * (1.953125E-5 * (934628419 * var1.field4739))) + 0.5);
      }

      if (var2.field4798 != null) {
         int var4 = 1539106655 * var1.field4733;
         int var5 = var2.field4798[1 + var1.field4724 * 1565767631];
         if (var1.field4724 * 1000394618 < var2.field4798.length - 2) {
            int var6 = (var2.field4798[1882473994 * var1.field4724] & 255) << 8;
            int var7 = (var2.field4798[var1.field4724 * -35197221 + 2] & 255) << 8;
            var5 += (var2.field4798[-1473884191 * var1.field4724 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 271073188 >> 6;
      }

      if (1176672622 * var1.field4732 > 0 && var2.field4799 != null) {
         int var11 = var1.field4732 * 67131625;
         int var12 = var2.field4799[1 + var1.field4736 * -463641621];
         if (1959585189 * var1.field4736 < var2.field4799.length - 2) {
            int var13 = (var2.field4799[var1.field4736 * -463641621] & -2119247936) << 8;
            int var14 = (var2.field4799[-463641621 * var1.field4736 + 2] & 255) << 8;
            var12 += (var11 - var13) * (var2.field4799[3 + var1.field4736 * -217386509] - var12) / (var14 - var13);
         }

         var3 = var3 * var12 + -396636216 >> 6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("aa")
   @Override
   protected void vmethod30(int[] var1, int var2, int var3) {
      try {
         if (this.field4769.method7772()) {
            int var4 = this.field4763 * -1423260313 * this.field4769.field4649 / (675076789 * classLG.field4138);

            do {
               long var5 = (long)var3 * var4 + -8970596226586884259L * this.field4779;
               if (this.field4780 * 5174971452106306489L - var5 >= 0L) {
                  this.field4779 = 1512448154803324149L * var5;
                  break;
               }

               int var7 = (int)((var4 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var4);
               this.field4779 += (long)var7 * var4 * 1512448154803324149L;
               this.field4770.vmethod30(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.method8138(-1205376008);
            } while (this.field4769.method7772());
         }

         this.field4770.vmethod30(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "nu.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   protected void vmethod31(int var1) {
      try {
         if (this.field4769.method7772()) {
            int var2 = -1423260313 * this.field4763 * this.field4769.field4649 / (classLG.field4138 * 675076789);

            do {
               long var3 = (long)var1 * var2 + -8970596226586884259L * this.field4779;
               if (this.field4780 * 5174971452106306489L - var3 >= 0L) {
                  this.field4779 = 1512448154803324149L * var3;
                  break;
               }

               int var5 = (int)((var2 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var2);
               this.field4779 += (long)var5 * var2 * 1512448154803324149L;
               this.field4770.vmethod31(var5);
               var1 -= var5;
               this.method8138(307618493);
            } while (this.field4769.method7772());
         }

         this.field4770.vmethod31(var1);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "nu.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fb")
   int method8122(classNT var1) {
      int var2 = (-403336933 * var1.field4730 * -359606667 * var1.field4728 >> 12) + var1.field4731 * -1276571151;
      var2 += (this.field4761[var1.field4725 * -1057694491] - 8192) * this.field4765[-1057694491 * var1.field4725] >> 12;
      classNY var3 = var1.field4747;
      if (-771094009 * var3.field4792 > 0 && (var3.field4796 * -1472637671 > 0 || this.field4762[var1.field4725 * -1057694491] > 0)) {
         int var4 = -1472637671 * var3.field4796 << 2;
         int var5 = var3.field4790 * -1122448781 << 1;
         if (var1.field4727 * -1955754893 < var5) {
            var4 = -1955754893 * var1.field4727 * var4 / var5;
         }

         var4 += this.field4762[-1057694491 * var1.field4725] >> 7;
         double var6 = Math.sin((1237307259 * var1.field4734 & 511) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.field4743.field187 * 256 * Math.pow(2.0, 3.255208333333333E-4 * var2) / (675076789 * classLG.field4138) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ef")
   void method8109(int var1) {
      if ((this.field4750[var1] & 2) != 0) {
         for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
            if (-1057694491 * var2.field4725 == var1 && this.field4767[var1][var2.field4738 * -107170957] == null && 67131625 * var2.field4732 < 0) {
               var2.field4732 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;[IIIB)Z")
   @ObfuscatedName("bz")
   boolean method8144(classNT var1, int[] var2, int var3, int var4, byte var5) {
      try {
         label221: {
            var1.field4729 = classLG.field4138 * 675076789 / 100 * 1686279333;
            if (67131625 * var1.field4732 >= 0) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               if (var1.field4744 == null) {
                  break label221;
               }

               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               if (var1.field4744.method590()) {
                  break label221;
               }
            }

            int var6 = var1.field4728 * -359606667;
            if (var6 > 0) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               var6 -= (int)(16.0 * Math.pow(2.0, this.field4768[-1057694491 * var1.field4725] * 4.921259842519685E-4) + 0.5);
               if (var6 < 0) {
                  var6 = 0;
               }

               var1.field4728 = var6 * 631359965;
            }

            var1.field4744.method587(this.method8125(var1, -1500906549));
            classNY var7 = var1.field4747;
            boolean var8 = false;
            var1.field4727 += -1247151941;
            var1.field4734 = var1.field4734 + -1276836891 * var7.field4792;
            double var9 = ((var1.field4738 * -107170957 - 60 << 8) + (-403336933 * var1.field4730 * var1.field4728 * -359606667 >> 12)) * 5.086263020833333E-6;
            if (-939533713 * var7.field4793 > 0) {
               if (-819751845 * var7.field4795 > 0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var1.field4739 = var1.field4739 + (int)(128.0 * Math.pow(2.0, var9 * (-819751845 * var7.field4795)) + 0.5) * 14704747;
               } else {
                  var1.field4739 += 1882207616;
               }
            }

            if (null != var7.field4798) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               if (var7.field4791 * 1071615623 > 0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var1.field4733 = var1.field4733 + (int)(128.0 * Math.pow(2.0, var9 * (1071615623 * var7.field4791)) + 0.5) * -1452067681;
               } else {
                  var1.field4733 += -1181069440;
               }

               while (
                  var1.field4724 * 1565767631 < var7.field4798.length - 2
                     && var1.field4733 * 1539106655 > (var7.field4798[var1.field4724 * 1565767631 + 2] & 255) << 8
               ) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var1.field4724 += -1970020770;
               }

               if (var1.field4724 * 1565767631 == var7.field4798.length - 2) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  if (var7.field4798[1 + 1565767631 * var1.field4724] == 0) {
                     var8 = true;
                  }
               }
            }

            if (67131625 * var1.field4732 >= 0) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               if (var7.field4799 != null) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  label190:
                  if (0 == (this.field4750[var1.field4725 * -1057694491] & 1)) {
                     if (var5 != -1) {
                        throw new IllegalStateException();
                     }

                     if (-1530244505 * var1.field4735 >= 0) {
                        if (var5 != -1) {
                           throw new IllegalStateException();
                        }

                        if (var1 == this.field4774[var1.field4725 * -1057694491][-1530244505 * var1.field4735]) {
                           break label190;
                        }

                        if (var5 != -1) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-1022877567 * var7.field4794 > 0) {
                        if (var5 != -1) {
                           throw new IllegalStateException();
                        }

                        var1.field4732 = var1.field4732 + (int)(128.0 * Math.pow(2.0, var7.field4794 * -1022877567 * var9) + 0.5) * 371851097;
                     } else {
                        var1.field4732 += 352300160;
                     }

                     while (
                        -463641621 * var1.field4736 < var7.field4799.length - 2
                           && 67131625 * var1.field4732 > (var7.field4799[2 + var1.field4736 * -463641621] & 255) << 8
                     ) {
                        if (var5 != -1) {
                           throw new IllegalStateException();
                        }

                        var1.field4736 += -1293723258;
                     }

                     if (var7.field4799.length - 2 == -463641621 * var1.field4736) {
                        if (var5 != -1) {
                           throw new IllegalStateException();
                        }

                        var8 = true;
                     }
                  }
               }
            }

            if (var8) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               var1.field4744.method581(1837314861 * var1.field4729);
               if (var2 != null) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var1.field4744.vmethod30(var2, var3, var4);
               } else {
                  var1.field4744.vmethod31(var4);
               }

               if (var1.field4744.method594()) {
                  this.field4770.field4662.method617(var1.field4744);
               }

               var1.method8002(1774779114);
               if (67131625 * var1.field4732 >= 0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var1.vmethod398();
                  if (-1530244505 * var1.field4735 > 0 && this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] == var1) {
                     if (var5 != -1) {
                        throw new IllegalStateException();
                     }

                     this.field4774[var1.field4725 * -1057694491][var1.field4735 * -1530244505] = null;
                  }
               }

               return true;
            }

            var1.field4744.method576(1837314861 * var1.field4729, this.method8127(var1, 121229128), this.method8132(var1, 1932888135));
            return false;
         }

         var1.method8002(1814200938);
         var1.vmethod398();
         if (var1.field4735 * -1530244505 > 0) {
            if (var5 != -1) {
               throw new IllegalStateException();
            }

            if (this.field4774[var1.field4725 * -1057694491][var1.field4735 * -1530244505] == var1) {
               this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] = null;
            }
         }

         return true;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "nu.bz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;)Z")
   @ObfuscatedName("ji")
   public static boolean method8140(classNU var0, classNT var1) {
      if (var0 == null) {
         var0.method8025();
      }

      if (null == var1.field4744) {
         if (67131625 * var1.field4732 >= 0) {
            var1.vmethod398();
            if (1851399286 * var1.field4735 > 0 && var0.field4774[-1057694491 * var1.field4725][var1.field4735 * -1530244505] == var1) {
               var0.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bq")
   void method8114(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         if (var3 == 128) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var15 = var1 & 15;
               int var21 = var1 >> 8 & 127;
               int var24 = var1 >> 16 & 127;
               this.method8071(var15, var21, var24, -1007796470);
            }
         } else if (var3 == 144) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var14 = var1 & 15;
               int var20 = var1 >> 8 & 127;
               int var23 = var1 >> 16 & 127;
               if (var23 > 0) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.method8062(var14, var20, var23, -29666088);
               } else {
                  this.method8071(var14, var20, 64, -1354132743);
               }
            }
         } else if (160 == var3) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var13 = var1 & 15;
               int var19 = var1 >> 8 & 127;
               int var22 = var1 >> 16 & 127;
               method8081(this, var13, var19, var22, -2123728586);
            }
         } else if (176 == var3) {
            if (var2 == -724523093) {
               int var12 = var1 & 15;
               int var18 = var1 >> 8 & 127;
               int var6 = var1 >> 16 & 127;
               if (var18 == 0) {
                  if (var2 != -724523093) {
                     return;
                  }

                  this.field4759[var12] = (var6 << 14) + (this.field4759[var12] & -2080769);
               }

               if (var18 == 32) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4759[var12] = (this.field4759[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 1) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4762[var12] = (this.field4762[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 33) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4762[var12] = (this.field4762[var12] & -128) + var6;
               }

               if (var18 == 5) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4768[var12] = (this.field4768[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 37) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4768[var12] = var6 + (this.field4768[var12] & -128);
               }

               if (7 == var18) {
                  if (var2 != -724523093) {
                     return;
                  }

                  this.field4755[var12] = (var6 << 7) + (this.field4755[var12] & -16257);
               }

               if (39 == var18) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4755[var12] = (this.field4755[var12] & -128) + var6;
               }

               if (var18 == 10) {
                  if (var2 != -724523093) {
                     return;
                  }

                  this.field4773[var12] = (var6 << 7) + (this.field4773[var12] & -16257);
               }

               if (var18 == 42) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4773[var12] = var6 + (this.field4773[var12] & -128);
               }

               if (11 == var18) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4771[var12] = (this.field4771[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 43) {
                  this.field4771[var12] = (this.field4771[var12] & -128) + var6;
               }

               if (64 == var18) {
                  if (var2 != -724523093) {
                     return;
                  }

                  if (var6 >= 64) {
                     this.field4750[var12] = this.field4750[var12] | 1;
                  } else {
                     this.field4750[var12] = this.field4750[var12] & -2;
                  }
               }

               if (65 == var18) {
                  if (var6 >= 64) {
                     if (var2 != -724523093) {
                        throw new IllegalStateException();
                     }

                     this.field4750[var12] = this.field4750[var12] | 2;
                  } else {
                     this.method8108(var12, -1000649374);
                     this.field4750[var12] = this.field4750[var12] & -3;
                  }
               }

               if (99 == var18) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4764[var12] = (this.field4764[var12] & 127) + (var6 << 7);
               }

               if (var18 == 98) {
                  this.field4764[var12] = var6 + (this.field4764[var12] & 16256);
               }

               if (101 == var18) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4764[var12] = 16384 + (this.field4764[var12] & 127) + (var6 << 7);
               }

               if (var18 == 100) {
                  if (var2 != -724523093) {
                     return;
                  }

                  this.field4764[var12] = 16384 + (this.field4764[var12] & 16256) + var6;
               }

               if (120 == var18) {
                  this.method8093(var12, 2110408396);
               }

               if (var18 == 121) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.method8098(var12, (byte)54);
               }

               if (var18 == 123) {
                  if (var2 != -724523093) {
                     return;
                  }

                  this.method8102(var12, (byte)0);
               }

               if (6 == var18) {
                  if (var2 != -724523093) {
                     return;
                  }

                  int var7 = this.field4764[var12];
                  if (var7 == 16384) {
                     if (var2 != -724523093) {
                        return;
                     }

                     this.field4765[var12] = (var6 << 7) + (this.field4765[var12] & -16257);
                  }
               }

               if (38 == var18) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  int var25 = this.field4764[var12];
                  if (var25 == 16384) {
                     this.field4765[var12] = (this.field4765[var12] & -128) + var6;
                  }
               }

               if (var18 == 16) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4752[var12] = (var6 << 7) + (this.field4752[var12] & -16257);
               }

               if (var18 == 48) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  this.field4752[var12] = var6 + (this.field4752[var12] & -128);
               }

               if (var18 == 81) {
                  if (var2 != -724523093) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     this.field4750[var12] = this.field4750[var12] | 4;
                  } else {
                     method8111(this, var12, -1140320208);
                     this.field4750[var12] = this.field4750[var12] & -5;
                  }
               }

               if (var18 == 17) {
                  method8119(this, var12, (this.field4766[var12] & -16257) + (var6 << 7), (byte)88);
               }

               if (var18 == 49) {
                  if (var2 != -724523093) {
                     return;
                  }

                  method8119(this, var12, (this.field4766[var12] & -128) + var6, (byte)89);
               }
            }
         } else if (var3 == 192) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var11 = var1 & 15;
               int var17 = var1 >> 8 & 127;
               method8061(this, var11, this.field4759[var11] + var17, 1927507411);
            }
         } else if (var3 == 208) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var10 = var1 & 15;
               int var16 = var1 >> 8 & 127;
               this.method8083(var10, var16, -1044212998);
            }
         } else if (224 == var3) {
            if (var2 != -724523093) {
               throw new IllegalStateException();
            } else {
               int var4 = var1 & 15;
               int var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
               method8086(this, var4, var5, (byte)-27);
            }
         } else {
            var3 = var1 & 0xFF;
            if (var3 == 255) {
               if (var2 != -724523093) {
                  throw new IllegalStateException();
               } else {
                  this.method8105(-1435920584);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "nu.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dw")
   void method8063(int var1, int var2, int var3) {
      this.method8071(var1, var2, -487945971, -1078748678);
      if ((this.field4750[var1] & 2) != 0) {
         for (classNT var4 = (classNT)this.field4770.field4661.method7920(); var4 != null; var4 = (classNT)this.field4770.field4661.method7925()) {
            if (-1057694491 * var4.field4725 == var1 && var4.field4732 * 67131625 < 0) {
               this.field4767[var1][-370277124 * var4.field4738] = null;
               this.field4767[var1][var2] = var4;
               int var5 = (var4.field4728 * -359606667 * -403336933 * var4.field4730 >> 12) + var4.field4731 * 464921419;
               var4.field4731 = var4.field4731 + -1901450660 * (var2 - 1701614193 * var4.field4738 << 8);
               var4.field4730 = -300850925 * (var5 - var4.field4731 * 1732100978);
               var4.field4728 = 480104448;
               var4.field4738 = -685332037 * var2;
               return;
            }
         }
      }

      classNR var8 = (classNR)this.field4772.method13363(this.field4756[var1]);
      if (null != var8) {
         if (null != var8.field4706[var2]) {
            classAJ var9 = var8.field4706[var2].method706(2019781816);
            if (var9 != null) {
               classNT var6 = new classNT();
               var6.field4725 = -1566998291 * var1;
               var6.field4746 = var8;
               var6.field4743 = var9;
               var6.field4747 = var8.field4713[var2];
               var6.field4735 = var8.field4711[var2] * 15946373;
               var6.field4738 = var2 * -685332037;
               var6.field4723 = 780512417 * (1039261828 + var8.field4710 * -127646999 * var3 * var3 * var8.field4708[var2] >> 11);
               var6.field4722 = -225319163 * (var8.field4709[var2] & 2132532882);
               var6.field4731 = ((var2 << 8) - (var8.field4707[var2] & 1608534758)) * 1567246768;
               var6.field4739 = 0;
               var6.field4733 = 0;
               var6.field4724 = 0;
               var6.field4732 = 1108414625;
               var6.field4736 = 0;
               if (0 == this.field4752[var1]) {
                  var6.field4744 = classAM.method470(
                     var9, this.method8125(var6, -816538955), this.method8127(var6, 1966662171), this.method8132(var6, 1667012717)
                  );
               } else {
                  var6.field4744 = classAM.method470(var9, this.method8125(var6, -420856506), 0, this.method8132(var6, 1870930798));
                  method8065(this, var6, var8.field4707[var2] < 0, 881975798);
               }

               if (var8.field4707[var2] < 0) {
                  var6.field4744.method539(-1);
               }

               if (-1530244505 * var6.field4735 >= 0) {
                  classNT var7 = this.field4774[var1][-662556096 * var6.field4735];
                  if (var7 != null && 67131625 * var7.field4732 < 0) {
                     this.field4767[var1][var7.field4738 * -549347805] = null;
                     var7.field4732 = 0;
                  }

                  this.field4774[var1][var6.field4735 * -1530244505] = var6;
               }

               classNN.method7900(this.field4770.field4661, var6);
               this.field4767[var1][var2] = var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ev")
   void method8094(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if (var1 < 0 || var1 == -1057694491 * var2.field4725) {
            if (null != var2.field4744) {
               var2.field4744.method581(classLG.field4138 * 675076789 / 100);
               if (var2.field4744.method594()) {
                  this.field4770.field4662.method617(var2.field4744);
               }

               var2.method8002(2139097596);
            }

            if (var2.field4732 * 67131625 < 0) {
               this.field4767[-1057694491 * var2.field4725][-107170957 * var2.field4738] = null;
            }

            var2.vmethod398();
         }
      }
   }

   public classNU(classAK var1) {
      this.field4751 = 0;
      this.field4750 = new int[16];
      this.field4752 = new int[16];
      this.field4753 = new int[16];
      this.field4754 = -635263232;
      this.field4763 = 1159529408;
      this.field4755 = new int[16];
      this.field4773 = new int[16];
      this.field4771 = new int[16];
      this.field4758 = new int[16];
      this.field4756 = new int[16];
      this.field4759 = new int[16];
      this.field4761 = new int[16];
      this.field4762 = new int[16];
      this.field4768 = new int[16];
      this.field4764 = new int[16];
      this.field4765 = new int[16];
      this.field4766 = new int[16];
      this.field4767 = new classNT[16][128];
      this.field4774 = new classNT[16][128];
      this.field4769 = new classNC();
      this.field4770 = new classND(this);
      this.field4760 = null;
      this.field4760 = var1;
      this.field4772 = new classYI(128);
      this.method8105(-932703825);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lno;Lva;Lat;)Z")
   @ObfuscatedName("go")
   public static boolean method8016(classNU var0, classNO var1, classVA var2, classAT var3) {
      synchronized (var0.field4760) {
         boolean var5 = true;
         synchronized (var0.field4757) {
            var0.field4757.clear();
         }

         classNO.method7938(var1);

         for (classNJ var17 = (classNJ)var1.field4694.method13375(); var17 != null; var17 = (classNJ)classYK.method13401(var1.field4694)) {
            int var7 = (int)var17.field6552;
            classNR var8 = (classNR)var0.field4772.method13363(var7);
            if (null == var8) {
               var8 = classJI.method6371(var2, var7, -885874591);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               var0.field4772.method13372(var8, var7);
            }

            if (!var8.method7989(var3, var17.field4674, 2003953031)) {
               var5 = false;
            } else if (var0.field4757 != null) {
               synchronized (var0.field4757) {
                  for (classAU var11 : var8.field4715) {
                     var0.field4757.add(new classNS(var17.field4675 * 1220483629, var11));
                  }
               }
            }
         }

         if (var5) {
            classNO.method7940(var1);
         }

         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ds")
   void method8077(int var1, int var2, int var3) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;)I")
   @ObfuscatedName("ol")
   public static int method8123(classNU var0, classNT var1) {
      if (var0 == null) {
         var0.method8030();
      }

      int var2 = (-403336933 * var1.field4730 * -359606667 * var1.field4728 >> 12) + var1.field4731 * -1276571151;
      var2 += (var0.field4761[var1.field4725 * -1057694491] - 8192) * var0.field4765[-1057694491 * var1.field4725] >> 12;
      classNY var3 = var1.field4747;
      if (-771094009 * var3.field4792 > 0 && (var3.field4796 * -1472637671 > 0 || var0.field4762[var1.field4725 * -1057694491] > 0)) {
         int var4 = -1472637671 * var3.field4796 << 2;
         int var5 = var3.field4790 * -1122448781 << 1;
         if (var1.field4727 * -1955754893 < var5) {
            var4 = -1955754893 * var1.field4727 * var4 / var5;
         }

         var4 += var0.field4762[-1057694491 * var1.field4725] >> 7;
         double var6 = Math.sin((1237307259 * var1.field4734 & 511) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.field4743.field187 * 256 * Math.pow(2.0, 3.255208333333333E-4 * var2) / (675076789 * classLG.field4138) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   @Override
   protected int vmethod28() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bx")
   @Override
   protected void vmethod36(int[] var1, int var2, int var3) {
      if (this.field4769.method7772()) {
         int var4 = this.field4763 * -167767442 * this.field4769.field4649 / (1966081859 * classLG.field4138);

         do {
            long var5 = (long)var3 * var4 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var5 >= 0L) {
               this.field4779 = 1512448154803324149L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var4);
            this.field4779 += (long)var7 * var4 * 1512448154803324149L;
            this.field4770.vmethod30(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method8138(996302914);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod30(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bc")
   @Override
   protected void vmethod37(int[] var1, int var2, int var3) {
      if (this.field4769.method7772()) {
         int var4 = this.field4763 * -1423260313 * this.field4769.field4649 / (675076789 * classLG.field4138);

         do {
            long var5 = (long)var3 * var4 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var5 >= 0L) {
               this.field4779 = 1512448154803324149L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var4);
            this.field4779 += (long)var7 * var4 * 1512448154803324149L;
            this.field4770.vmethod30(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method8138(725777762);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod30(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lnu;IIB)V")
   @ObfuscatedName("oh")
   public static void method8086(classNU var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method8092(var1, var1, var3);
      }

      try {
         var0.field4761[var1] = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnu;II)V")
   @ObfuscatedName("wp")
   public static void method8111(classNU var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8113(var1, var1);
      }

      try {
         if ((var0.field4750[var1] & 4) != 0) {
            for (classNT var3 = (classNT)var0.field4770.field4661.method7915(); null != var3; var3 = (classNT)classNN.method7924(var0.field4770.field4661)) {
               if (var2 != -1140320208) {
                  throw new IllegalStateException();
               }

               if (-1057694491 * var3.field4725 == var1) {
                  if (var2 != -1140320208) {
                     return;
                  }

                  var3.field4737 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.by(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;)I")
   @ObfuscatedName("of")
   public static int method8129(classNU var0, classNT var1) {
      if (var0 == null) {
         var0.method8139();
      }

      classNY var2 = var1.field4747;
      int var3 = -1554358408 + var0.field4755[-1569917068 * var1.field4725] * var0.field4771[619349541 * var1.field4725] >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.field4723 * 753829437 * var3 + -1848643850 >> 15;
      var3 = 1238197527 * var0.field4754 * var3 + 128 >> 8;
      if (-939533713 * var2.field4793 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, -939533713 * var2.field4793 * (1.953125E-5 * (934628419 * var1.field4739))) + 0.5);
      }

      if (var2.field4798 != null) {
         int var4 = -840369632 * var1.field4733;
         int var5 = var2.field4798[1 + var1.field4724 * -1948393691];
         if (var1.field4724 * 730729186 < var2.field4798.length - 2) {
            int var6 = (var2.field4798[1565767631 * var1.field4724] & -1060350370) << 8;
            int var7 = (var2.field4798[var1.field4724 * 819359530 + 2] & -1925709992) << 8;
            var5 += (var2.field4798[380631447 * var1.field4724 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + -870944654 >> 6;
      }

      if (860965171 * var1.field4732 > 0 && var2.field4799 != null) {
         int var11 = var1.field4732 * 257053581;
         int var12 = var2.field4799[1 + var1.field4736 * -463641621];
         if (-463641621 * var1.field4736 < var2.field4799.length - 2) {
            int var13 = (var2.field4799[var1.field4736 * -463641621] & 591189722) << 8;
            int var14 = (var2.field4799[-463641621 * var1.field4736 + 2] & 1787406606) << 8;
            var12 += (var11 - var13) * (var2.field4799[3 + var1.field4736 * -463641621] - var12) / (var14 - var13);
         }

         var3 = var3 * var12 + -1304315389 >> 6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   @Override
   protected void vmethod38(int[] var1, int var2, int var3) {
      if (this.field4769.method7772()) {
         int var4 = this.field4763 * -1423260313 * this.field4769.field4649 / (675076789 * classLG.field4138);

         do {
            long var5 = (long)var3 * var4 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var5 >= 0L) {
               this.field4779 = 1512448154803324149L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var4);
            this.field4779 += (long)var7 * var4 * 1512448154803324149L;
            this.field4770.vmethod30(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method8138(-1026147751);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod30(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("br")
   @Override
   protected void vmethod39(int[] var1, int var2, int var3) {
      if (this.field4769.method7772()) {
         int var4 = this.field4763 * 493773987 * this.field4769.field4649 / (675076789 * classLG.field4138);

         do {
            long var5 = (long)var3 * var4 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var5 >= 0L) {
               this.field4779 = 1512448154803324149L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var4);
            this.field4779 += (long)var7 * var4 * 1512448154803324149L;
            this.field4770.vmethod30(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method8138(-495862168);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod30(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   @Override
   protected void vmethod40(int var1) {
      if (this.field4769.method7772()) {
         int var2 = 1968952280 * this.field4763 * this.field4769.field4649 / (classLG.field4138 * 19588851);

         do {
            long var3 = (long)var1 * var2 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var3 >= 0L) {
               this.field4779 = 1512448154803324149L * var3;
               break;
            }

            int var5 = (int)((var2 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var2);
            this.field4779 += (long)var5 * var2 * 1512448154803324149L;
            this.field4770.vmethod31(var5);
            var1 -= var5;
            this.method8138(-95849439);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod31(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   @Override
   protected void vmethod41(int var1) {
      if (this.field4769.method7772()) {
         int var2 = 1556367119 * this.field4763 * this.field4769.field4649 / (classLG.field4138 * -179221373);

         do {
            long var3 = (long)var1 * var2 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var3 >= 0L) {
               this.field4779 = 1512448154803324149L * var3;
               break;
            }

            int var5 = (int)((var2 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var2);
            this.field4779 += (long)var5 * var2 * 1512448154803324149L;
            this.field4770.vmethod31(var5);
            var1 -= var5;
            this.method8138(2111081720);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod31(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   @Override
   protected void vmethod42(int var1) {
      if (this.field4769.method7772()) {
         int var2 = -1423260313 * this.field4763 * this.field4769.field4649 / (classLG.field4138 * 675076789);

         do {
            long var3 = (long)var1 * var2 + -8970596226586884259L * this.field4779;
            if (this.field4780 * 5174971452106306489L - var3 >= 0L) {
               this.field4779 = 1512448154803324149L * var3;
               break;
            }

            int var5 = (int)((var2 + (this.field4780 * 5174971452106306489L - -8970596226586884259L * this.field4779) - 1L) / var2);
            this.field4779 += (long)var5 * var2 * 1512448154803324149L;
            this.field4770.vmethod31(var5);
            var1 -= var5;
            this.method8138(-1748465743);
         } while (this.field4769.method7772());
      }

      this.field4770.vmethod31(var1);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("da")
   void method8078(int var1, int var2, int var3) {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public int method8013() {
      return 1238197527 * this.field4754;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("an")
   @Override
   protected classAH vmethod33() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   public int method8014(byte var1) {
      try {
         return 1238197527 * this.field4754;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "nu.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ar")
   void method8071(int var1, int var2, int var3, int var4) {
      try {
         classNT var5 = this.field4767[var1][var2];
         if (var5 != null) {
            this.field4767[var1][var2] = null;
            if (0 != (this.field4750[var1] & 2)) {
               if (var4 >= -549981141) {
                  throw new IllegalStateException();
               }

               for (classNT var6 = (classNT)this.field4770.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4770.field4661)) {
                  if (-1057694491 * var6.field4725 == -1057694491 * var5.field4725) {
                     if (var4 >= -549981141) {
                        throw new IllegalStateException();
                     }

                     if (var6.field4732 * 67131625 < 0) {
                        if (var4 >= -549981141) {
                           throw new IllegalStateException();
                        }

                        if (var5 != var6) {
                           if (var4 >= -549981141) {
                              throw new IllegalStateException();
                           }

                           var5.field4732 = 0;
                           break;
                        }
                     }
                  }
               }
            } else {
               var5.field4732 = 0;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nu.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fi")
   int method8124(classNT var1) {
      int var2 = (-403336933 * var1.field4730 * -359606667 * var1.field4728 >> 12) + var1.field4731 * -1276571151;
      var2 += (this.field4761[var1.field4725 * -1057694491] - 8192) * this.field4765[-1057694491 * var1.field4725] >> 12;
      classNY var3 = var1.field4747;
      if (-771094009 * var3.field4792 > 0 && (var3.field4796 * -1472637671 > 0 || this.field4762[var1.field4725 * -1057694491] > 0)) {
         int var4 = -1472637671 * var3.field4796 << 2;
         int var5 = var3.field4790 * -1122448781 << 1;
         if (var1.field4727 * -1955754893 < var5) {
            var4 = -1955754893 * var1.field4727 * var4 / var5;
         }

         var4 += this.field4762[-1057694491 * var1.field4725] >> 7;
         double var6 = Math.sin((1237307259 * var1.field4734 & 511) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.field4743.field187 * 256 * Math.pow(2.0, 3.255208333333333E-4 * var2) / (675076789 * classLG.field4138) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "(Lno;Lva;Lat;)Z")
   @ObfuscatedName("cl")
   public boolean method8017(classNO var1, classVA var2, classAT var3) {
      synchronized (this.field4760) {
         boolean var5 = true;
         synchronized (this.field4757) {
            this.field4757.clear();
         }

         classNO.method7938(var1);

         for (classNJ var17 = (classNJ)var1.field4694.method13375(); var17 != null; var17 = (classNJ)classYK.method13401(var1.field4694)) {
            int var7 = (int)var17.field6552;
            classNR var8 = (classNR)this.field4772.method13363(var7);
            if (null == var8) {
               var8 = classJI.method6371(var2, var7, -885874591);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.field4772.method13372(var8, var7);
            }

            if (!var8.method7989(var3, var17.field4674, 1570631702)) {
               var5 = false;
            } else if (this.field4757 != null) {
               synchronized (this.field4757) {
                  for (classAU var11 : var8.field4715) {
                     this.field4757.add(new classNS(var17.field4675 * 950357568, var11));
                  }
               }
            }
         }

         if (var5) {
            classNO.method7940(var1);
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;)V")
   @ObfuscatedName("jz")
   public static void method8028(classNU var0) {
      synchronized (var0.field4760) {
         for (classNR var2 = (classNR)var0.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(var0.field4772)) {
            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   public void method8020() {
      if (this.field4757 != null) {
         if (field4748 != null) {
            field4748.set(true);
         }

         field4748 = new AtomicBoolean(false);
         AtomicBoolean var1 = field4748;
         if (field4749 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field4749 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new classNF(this));
         }

         field4749.submit(new classNG(this, var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eq")
   void method8103(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if ((var1 < 0 || var1 == var2.field4725 * 186984351) && var2.field4732 * 1503486442 < 0) {
            this.field4767[var2.field4725 * 1974828459][var2.field4738 * -2038165215] = null;
            var2.field4732 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   public void method8025() {
      synchronized (this.field4760) {
         for (classNR var2 = (classNR)this.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(this.field4772)) {
            classNR.method7994(var2, (byte)80);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fg")
   int method8131(classNT var1) {
      int var2 = this.field4773[var1.field4725 * -1057694491];
      return var2 < 8192 ? 32 + var2 * var1.field4722 * -1066414643 >> 6 : 16384 - ((128 - -1066414643 * var1.field4722) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "(Lnt;I)I")
   @ObfuscatedName("bl")
   int method8132(classNT var1, int var2) {
      try {
         int var3 = this.field4773[var1.field4725 * -1057694491];
         if (var3 < 8192) {
            if (var2 <= 1660644709) {
               throw new IllegalStateException();
            } else {
               return 32 + var3 * var1.field4722 * -1066414643 >> 6;
            }
         } else {
            return 16384 - ((128 - -1066414643 * var1.field4722) * (16384 - var3) + 32 >> 6);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public void method8029() {
      synchronized (this.field4760) {
         for (classNR var2 = (classNR)this.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(this.field4772)) {
            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   public void method8030() {
      synchronized (this.field4760) {
         for (classNR var2 = (classNR)this.field4772.method13375(); var2 != null; var2 = (classNR)classYK.method13401(this.field4772)) {
            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;Z)V")
   @ObfuscatedName("dz")
   void method8066(classNT var1, boolean var2) {
      int var3 = var1.field4743.field189.length;
      int var4;
      if (var2 && var1.field4743.field190) {
         int var5 = var3 + var3 - var1.field4743.field192;
         var4 = (int)((long)var5 * this.field4752[var1.field4725 * -1057694491] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field4744.method567(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4752[var1.field4725 * -1057694491] >> 6);
      }

      var1.field4744.method562(var4);
   }

   @ObfuscatedSignature(descriptor = "(Lno;Z)V")
   @ObfuscatedName("ch")
   public void method8032(classNO var1, boolean var2) {
      synchronized (this.field4760) {
         this.method8040((byte)38);
         classNC.method7763(this.field4769, var1.field4693);
         this.field4781 = var2;
         this.field4779 = 0L;
         int var4 = this.field4769.method7775();

         for (int var5 = 0; var5 < var4; var5++) {
            this.field4769.method7779(var5);
            this.field4769.method7789(var5);
            this.field4769.method7780(var5);
         }

         this.field4778 = this.field4769.method7809() * -1778762749;
         this.field4777 = this.field4769.field4656[-1076146517 * this.field4778] * 596597749;
         this.field4780 = classXQ.method12873(this.field4769, 852899933 * this.field4777) * -7106189560981577079L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;II)V")
   @ObfuscatedName("va")
   public static void method8087(classNU var0, int var1, int var2) {
      var0.field4761[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lno;Z)V")
   @ObfuscatedName("cf")
   public void method8033(classNO var1, boolean var2) {
      synchronized (this.field4760) {
         this.method8040((byte)-2);
         classNC.method7763(this.field4769, var1.field4693);
         this.field4781 = var2;
         this.field4779 = 0L;
         int var4 = this.field4769.method7775();

         for (int var5 = 0; var5 < var4; var5++) {
            this.field4769.method7779(var5);
            this.field4769.method7789(var5);
            this.field4769.method7780(var5);
         }

         this.field4778 = this.field4769.method7809() * -1778762749;
         this.field4777 = this.field4769.field4656[-1076146517 * this.field4778] * 596597749;
         this.field4780 = classXQ.method12873(this.field4769, 852899933 * this.field4777) * -7106189560981577079L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method8036() {
      synchronized (this.field4760) {
         classNC.method7768(this.field4769);
         this.method8105(-2104063806);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;I)V")
   @ObfuscatedName("gh")
   public static void method8100(classNU var0, int var1) {
      if (var0 == null) {
         var0.method8103(var1);
      }

      if (var1 >= 0) {
         var0.field4755[var1] = 12800;
         var0.field4773[var1] = 8192;
         var0.field4771[var1] = 16383;
         var0.field4761[var1] = 8192;
         var0.field4762[var1] = 0;
         var0.field4768[var1] = 8192;
         var0.method8108(var1, -1305041572);
         method8111(var0, var1, -1140320208);
         var0.field4750[var1] = 0;
         var0.field4764[var1] = 32767;
         var0.field4765[var1] = 256;
         var0.field4752[var1] = 0;
         method8119(var0, var1, 8192, (byte)74);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            var0.method8098(var2, (byte)-17);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   public void method8037() {
      synchronized (this.field4760) {
         classNC.method7768(this.field4769);
         this.method8105(-711855675);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public void method8038() {
      synchronized (this.field4760) {
         classNC.method7768(this.field4769);
         this.method8105(-1953164524);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cj")
   public void method8039() {
      synchronized (this.field4760) {
         classNC.method7768(this.field4769);
         this.method8105(-1137408671);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ci")
   public boolean method8042() {
      synchronized (this.field4760) {
         return this.field4769.method7772();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cx")
   public boolean method8043() {
      synchronized (this.field4760) {
         return this.field4769.method7772();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("do")
   void method8072(int var1, int var2, int var3) {
      classNT var4 = this.field4767[var1][var2];
      if (var4 != null) {
         this.field4767[var1][var2] = null;
         if (0 != (this.field4750[var1] & 2)) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7915(); var5 != null; var5 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (-1057694491 * var5.field4725 == -1057694491 * var4.field4725 && var5.field4732 * 67131625 < 0 && var4 != var5) {
                  var4.field4732 = 0;
                  break;
               }
            }
         } else {
            var4.field4732 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   public boolean method8046() {
      synchronized (this.field4760) {
         return classYI.method13368(this.field4772) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dd")
   public boolean method8047() {
      synchronized (this.field4760) {
         return classYI.method13368(this.field4772) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dm")
   public void method8050(int var1, int var2) {
      synchronized (this.field4760) {
         method8059(this, var1, var2, 1220472108);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dx")
   public void method8051(int var1, int var2) {
      synchronized (this.field4760) {
         method8059(this, var1, var2, -644509436);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;I)V")
   @ObfuscatedName("fa")
   public static void method8115(classNU var0, int var1) {
      if (var0 == null) {
         var0.method8096(var1);
      }

      int var2 = var1 & 240;
      if (var2 == 128) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & 127;
         int var22 = var1 >> 16 & 127;
         var0.method8071(var13, var19, var22, -1605775374);
      } else if (var2 == 144) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & 127;
         int var21 = var1 >> 16 & 127;
         if (var21 > 0) {
            var0.method8062(var12, var18, var21, 1026262110);
         } else {
            var0.method8071(var12, var18, 64, -1183423236);
         }
      } else if (160 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & 127;
         int var20 = var1 >> 16 & 127;
         method8081(var0, var11, var17, var20, -1955668349);
      } else if (176 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & 127;
         int var5 = var1 >> 16 & 127;
         if (var16 == 0) {
            var0.field4759[var10] = (var5 << 14) + (var0.field4759[var10] & -2080769);
         }

         if (var16 == 32) {
            var0.field4759[var10] = (var0.field4759[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 1) {
            var0.field4762[var10] = (var0.field4762[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 33) {
            var0.field4762[var10] = (var0.field4762[var10] & -128) + var5;
         }

         if (var16 == 5) {
            var0.field4768[var10] = (var0.field4768[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 37) {
            var0.field4768[var10] = var5 + (var0.field4768[var10] & -128);
         }

         if (7 == var16) {
            var0.field4755[var10] = (var5 << 7) + (var0.field4755[var10] & -16257);
         }

         if (39 == var16) {
            var0.field4755[var10] = (var0.field4755[var10] & -128) + var5;
         }

         if (var16 == 10) {
            var0.field4773[var10] = (var5 << 7) + (var0.field4773[var10] & -16257);
         }

         if (var16 == 42) {
            var0.field4773[var10] = var5 + (var0.field4773[var10] & -128);
         }

         if (11 == var16) {
            var0.field4771[var10] = (var0.field4771[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 43) {
            var0.field4771[var10] = (var0.field4771[var10] & -128) + var5;
         }

         if (64 == var16) {
            if (var5 >= 64) {
               var0.field4750[var10] = var0.field4750[var10] | 1;
            } else {
               var0.field4750[var10] = var0.field4750[var10] & -2;
            }
         }

         if (65 == var16) {
            if (var5 >= 64) {
               var0.field4750[var10] = var0.field4750[var10] | 2;
            } else {
               var0.method8108(var10, -1165871656);
               var0.field4750[var10] = var0.field4750[var10] & -3;
            }
         }

         if (99 == var16) {
            var0.field4764[var10] = (var0.field4764[var10] & 127) + (var5 << 7);
         }

         if (var16 == 98) {
            var0.field4764[var10] = var5 + (var0.field4764[var10] & 16256);
         }

         if (101 == var16) {
            var0.field4764[var10] = 16384 + (var0.field4764[var10] & 127) + (var5 << 7);
         }

         if (var16 == 100) {
            var0.field4764[var10] = 16384 + (var0.field4764[var10] & 16256) + var5;
         }

         if (120 == var16) {
            var0.method8093(var10, 2068263234);
         }

         if (var16 == 121) {
            var0.method8098(var10, (byte)9);
         }

         if (var16 == 123) {
            var0.method8102(var10, (byte)0);
         }

         if (6 == var16) {
            int var6 = var0.field4764[var10];
            if (var6 == 16384) {
               var0.field4765[var10] = (var5 << 7) + (var0.field4765[var10] & -16257);
            }
         }

         if (38 == var16) {
            int var23 = var0.field4764[var10];
            if (var23 == 16384) {
               var0.field4765[var10] = (var0.field4765[var10] & -128) + var5;
            }
         }

         if (var16 == 16) {
            var0.field4752[var10] = (var5 << 7) + (var0.field4752[var10] & -16257);
         }

         if (var16 == 48) {
            var0.field4752[var10] = var5 + (var0.field4752[var10] & -128);
         }

         if (var16 == 81) {
            if (var5 >= 64) {
               var0.field4750[var10] = var0.field4750[var10] | 4;
            } else {
               method8111(var0, var10, -1140320208);
               var0.field4750[var10] = var0.field4750[var10] & -5;
            }
         }

         if (var16 == 17) {
            method8119(var0, var10, (var0.field4766[var10] & -16257) + (var5 << 7), (byte)54);
         }

         if (var16 == 49) {
            method8119(var0, var10, (var0.field4766[var10] & -128) + var5, (byte)104);
         }
      } else if (var2 == 192) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & 127;
         method8061(var0, var9, var0.field4759[var9] + var15, 1795320947);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & 127;
         var0.method8083(var8, var14, -1044212998);
      } else if (224 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         method8086(var0, var3, var4, (byte)-23);
      } else {
         var2 = var1 & 0xFF;
         if (var2 == 255) {
            var0.method8105(-962327122);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dy")
   public void method8052(int var1, int var2) {
      synchronized (this.field4760) {
         method8059(this, var1, var2, -2114096052);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("di")
   public void method8053(int var1, int var2) {
      synchronized (this.field4760) {
         method8059(this, var1, var2, -2126562125);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ec")
   void method8118(int var1, int var2) {
      this.field4766[var1] = var2;
      this.field4753[var1] = (int)(2097152.0 * Math.pow(2.0, 5.493164E-4F * var2) + 0.5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;I)V")
   @ObfuscatedName("kr")
   public static void method8110(classNU var0, int var1) {
      if ((var0.field4750[var1] & 2) != 0) {
         for (classNT var2 = (classNT)var0.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(var0.field4770.field4661)) {
            if (-1057694491 * var2.field4725 == var1 && var0.field4767[var1][var2.field4738 * -107170957] == null && 67131625 * var2.field4732 < 0) {
               var2.field4732 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dr")
   void method8057(int var1, int var2) {
      this.field4758[var1] = var2;
      this.field4759[var1] = var2 & -128;
      method8061(this, var1, var2, 1964276760);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dk")
   void method8058(int var1, int var2) {
      this.field4758[var1] = var2;
      this.field4759[var1] = var2 & -128;
      method8061(this, var1, var2, 2098248730);
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("at")
   @Override
   protected classAH vmethod27() {
      return this.field4770;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bt")
   void method8083(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   public void method8009(int var1, int var2) {
      try {
         synchronized (this.field4760) {
            this.field4754 = 853156519 * var1;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "nu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   public void method8021() {
      if (this.field4757 != null) {
         if (field4748 != null) {
            field4748.set(true);
         }

         field4748 = new AtomicBoolean(false);
         AtomicBoolean var1 = field4748;
         if (field4749 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field4749 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new classNF(this));
         }

         field4749.submit(new classNG(this, var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;Z)V")
   @ObfuscatedName("dn")
   void method8067(classNT var1, boolean var2) {
      int var3 = var1.field4743.field189.length;
      int var4;
      if (var2 && var1.field4743.field190) {
         int var5 = var3 + var3 - var1.field4743.field192;
         var4 = (int)((long)var5 * this.field4752[var1.field4725 * -1057694491] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field4744.method567(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4752[var1.field4725 * 1187247753] >> 6);
      }

      var1.field4744.method562(var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnt;Z)V")
   @ObfuscatedName("dv")
   void method8068(classNT var1, boolean var2) {
      int var3 = var1.field4743.field189.length;
      int var4;
      if (var2 && var1.field4743.field190) {
         int var5 = var3 + var3 - var1.field4743.field192;
         var4 = (int)((long)var5 * this.field4752[var1.field4725 * -1057694491] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field4744.method567(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4752[var1.field4725 * -916402755] >> 6);
      }

      var1.field4744.method562(var4);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   protected int vmethod32() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nu.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dl")
   void method8073(int var1, int var2, int var3) {
      classNT var4 = this.field4767[var1][var2];
      if (var4 != null) {
         this.field4767[var1][var2] = null;
         if (0 != (this.field4750[var1] & 2)) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7915(); var5 != null; var5 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (-1410583715 * var5.field4725 == -50448318 * var4.field4725 && var5.field4732 * 67131625 < 0 && var4 != var5) {
                  var4.field4732 = 0;
                  break;
               }
            }
         } else {
            var4.field4732 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dq")
   void method8074(int var1, int var2, int var3) {
      classNT var4 = this.field4767[var1][var2];
      if (var4 != null) {
         this.field4767[var1][var2] = null;
         if (0 != (this.field4750[var1] & 2)) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7915(); var5 != null; var5 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (-1057694491 * var5.field4725 == -1057694491 * var4.field4725 && var5.field4732 * 67131625 < 0 && var4 != var5) {
                  var4.field4732 = 0;
                  break;
               }
            }
         } else {
            var4.field4732 = 0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;III)V")
   @ObfuscatedName("ot")
   public static void method8064(classNU var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method8009(var1, var1);
      } else {
         var0.method8071(var1, var2, 64, -975565602);
         if ((var0.field4750[var1] & 2) != 0) {
            for (classNT var4 = (classNT)var0.field4770.field4661.method7920(); var4 != null; var4 = (classNT)var0.field4770.field4661.method7925()) {
               if (-1057694491 * var4.field4725 == var1 && var4.field4732 * 67131625 < 0) {
                  var0.field4767[var1][-107170957 * var4.field4738] = null;
                  var0.field4767[var1][var2] = var4;
                  int var5 = (var4.field4728 * -359606667 * -403336933 * var4.field4730 >> 12) + var4.field4731 * -1276571151;
                  var4.field4731 = var4.field4731 + -665600239 * (var2 - -107170957 * var4.field4738 << 8);
                  var4.field4730 = -300850925 * (var5 - var4.field4731 * -1276571151);
                  var4.field4728 = 480104448;
                  var4.field4738 = -685332037 * var2;
                  return;
               }
            }
         }

         classNR var8 = (classNR)var0.field4772.method13363(var0.field4756[var1]);
         if (null != var8) {
            if (null != var8.field4706[var2]) {
               classAJ var9 = var8.field4706[var2].method706(1835537839);
               if (var9 != null) {
                  classNT var6 = new classNT();
                  var6.field4725 = -1566998291 * var1;
                  var6.field4746 = var8;
                  var6.field4743 = var9;
                  var6.field4747 = var8.field4713[var2];
                  var6.field4735 = var8.field4711[var2] * 1130932567;
                  var6.field4738 = var2 * -685332037;
                  var6.field4723 = 780512417 * (1024 + var8.field4710 * -127646999 * var3 * var3 * var8.field4708[var2] >> 11);
                  var6.field4722 = -225319163 * (var8.field4709[var2] & 255);
                  var6.field4731 = ((var2 << 8) - (var8.field4707[var2] & 32767)) * -665600239;
                  var6.field4739 = 0;
                  var6.field4733 = 0;
                  var6.field4724 = 0;
                  var6.field4732 = -371851097;
                  var6.field4736 = 0;
                  if (0 == var0.field4752[var1]) {
                     var6.field4744 = classAM.method470(
                        var9, var0.method8125(var6, 397490094), var0.method8127(var6, 1285039116), var0.method8132(var6, 1760746250)
                     );
                  } else {
                     var6.field4744 = classAM.method470(var9, var0.method8125(var6, 215717452), 0, var0.method8132(var6, 1690094063));
                     method8065(var0, var6, var8.field4707[var2] < 0, 881975798);
                  }

                  if (var8.field4707[var2] < 0) {
                     var6.field4744.method539(-1);
                  }

                  if (-1530244505 * var6.field4735 >= 0) {
                     classNT var7 = var0.field4774[var1][-1530244505 * var6.field4735];
                     if (var7 != null && 67131625 * var7.field4732 < 0) {
                        var0.field4767[var1][var7.field4738 * -107170957] = null;
                        var7.field4732 = 0;
                     }

                     var0.field4774[var1][var6.field4735 * -1530244505] = var6;
                  }

                  classNN.method7900(var0.field4770.field4661, var6);
                  var0.field4767[var1][var2] = var6;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("df")
   void method8079(int var1, int var2, int var3) {
   }

   @ObfuscatedSignature(descriptor = "(Lnu;IIS)V")
   @ObfuscatedName("ws")
   public static void method8054(classNU var0, int var1, int var2, short var3) {
      if (var0 == null) {
         var0.method8055(var1, var1, var3);
      } else {
         try {
            synchronized (var0.field4760) {
               method8059(var0, var1, var2, 110238855);
            }
         } catch (RuntimeException var7) {
            throw classEG.method3884(var7, "nu.ap(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dc")
   public boolean method8048() {
      synchronized (this.field4760) {
         return classYI.method13368(this.field4772) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dj")
   void method8080(int var1, int var2, int var3) {
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("am")
   @Override
   protected classAH vmethod44() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dp")
   void method8084(int var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ey")
   void method8088(int var1, int var2) {
      this.field4761[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lnu;IIB)V")
   @ObfuscatedName("ql")
   public static void method8119(classNU var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method8121(var1, var1, var3);
      } else {
         try {
            var0.field4766[var1] = var2;
            var0.field4753[var1] = (int)(2097152.0 * Math.pow(2.0, 5.493164E-4F * var2) + 0.5);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "nu.bf(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ea")
   void method8089(int var1, int var2) {
      this.field4761[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lnu;III)V")
   @ObfuscatedName("xs")
   public static void method8061(classNU var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method8085(var1, var1, var1);
      } else {
         try {
            if (var2 != var0.field4756[var1]) {
               var0.field4756[var1] = var2;

               for (int var4 = 0; var4 < 128; var4++) {
                  if (var3 <= 1591084815) {
                     throw new IllegalStateException();
                  }

                  var0.field4774[var1][var4] = null;
               }
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "nu.ai(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ek")
   void method8090(int var1, int var2) {
      this.field4761[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ej")
   void method8091(int var1, int var2) {
      this.field4761[var1] = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnu;Lnt;)I")
   @ObfuscatedName("we")
   public static int method8133(classNU var0, classNT var1) {
      int var2 = var0.field4773[var1.field4725 * -1057694491];
      return var2 < 8192 ? 32 + var2 * var1.field4722 * -1066414643 >> 6 : 16384 - ((128 - -1066414643 * var1.field4722) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ed")
   void method8095(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if (var1 < 0 || var1 == -1311139638 * var2.field4725) {
            if (null != var2.field4744) {
               var2.field4744.method581(classLG.field4138 * -1572993699 / -2096733984);
               if (var2.field4744.method594()) {
                  this.field4770.field4662.method617(var2.field4744);
               }

               var2.method8002(2005278781);
            }

            if (var2.field4732 * -1690390608 < 0) {
               this.field4767[-1057694491 * var2.field4725][-107170957 * var2.field4738] = null;
            }

            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;B)Z")
   @ObfuscatedName("bh")
   boolean method8141(classNT var1, byte var2) {
      try {
         if (null == var1.field4744) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               if (67131625 * var1.field4732 >= 0) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var1.vmethod398();
                  if (-1530244505 * var1.field4735 > 0) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.field4774[-1057694491 * var1.field4725][var1.field4735 * -1530244505] == var1) {
                        this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "nu.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;I)I")
   @ObfuscatedName("bs")
   int method8125(classNT var1, int var2) {
      try {
         int var10;
         var10 = (-403336933 * var1.field4730 * -359606667 * var1.field4728 >> 12) + var1.field4731 * -1276571151;
         var10 += (this.field4761[var1.field4725 * -1057694491] - 8192) * this.field4765[-1057694491 * var1.field4725] >> 12;
         classNY var4 = var1.field4747;
         label53:
         if (-771094009 * var4.field4792 > 0) {
            if (var2 >= 1204216895) {
               throw new IllegalStateException();
            }

            if (var4.field4796 * -1472637671 <= 0) {
               if (var2 >= 1204216895) {
                  throw new IllegalStateException();
               }

               if (this.field4762[var1.field4725 * -1057694491] <= 0) {
                  break label53;
               }

               if (var2 >= 1204216895) {
                  throw new IllegalStateException();
               }
            }

            int var5 = -1472637671 * var4.field4796 << 2;
            int var6 = var4.field4790 * -1122448781 << 1;
            if (var1.field4727 * -1955754893 < var6) {
               if (var2 >= 1204216895) {
                  throw new IllegalStateException();
               }

               var5 = -1955754893 * var1.field4727 * var5 / var6;
            }

            var5 += this.field4762[-1057694491 * var1.field4725] >> 7;
            double var7 = Math.sin((1237307259 * var1.field4734 & 511) * 0.01227184630308513);
            var10 += (int)(var5 * var7);
         }

         int var12 = (int)(var1.field4743.field187 * 256 * Math.pow(2.0, 3.255208333333333E-4 * var10) / (675076789 * classLG.field4138) + 0.5);
         int var10000;
         if (var12 < 1) {
            if (var2 >= 1204216895) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var12;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "nu.bs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eg")
   void method8101(int var1) {
      if (var1 >= 0) {
         this.field4755[var1] = 12800;
         this.field4773[var1] = 1539832493;
         this.field4771[var1] = 1792727278;
         this.field4761[var1] = 1009023550;
         this.field4762[var1] = 0;
         this.field4768[var1] = 8192;
         this.method8108(var1, -1622798110);
         method8111(this, var1, -1140320208);
         this.field4750[var1] = 0;
         this.field4764[var1] = 2093241976;
         this.field4765[var1] = 256;
         this.field4752[var1] = 0;
         method8119(this, var1, 1908540761, (byte)61);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            this.method8098(var2, (byte)-72);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   void method8104(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if ((var1 < 0 || var1 == var2.field4725 * -1057694491) && var2.field4732 * 67131625 < 0) {
            this.field4767[var2.field4725 * -1057694491][var2.field4738 * -107170957] = null;
            var2.field4732 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cr")
   public void method8010(int var1) {
      synchronized (this.field4760) {
         this.field4754 = 853156519 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   void method8106() {
      this.method8093(-1, 2132120614);
      this.method8098(-1, (byte)-18);

      for (int var1 = 0; var1 < 16; var1++) {
         this.field4756[var1] = this.field4758[var1];
      }

      for (int var2 = 0; var2 < 16; var2++) {
         this.field4759[var2] = this.field4758[var2] & 1137512112;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   void method8107() {
      this.method8093(-1, 2093435522);
      this.method8098(-1, (byte)-17);

      for (int var1 = 0; var1 < 16; var1++) {
         this.field4756[var1] = this.field4758[var1];
      }

      for (int var2 = 0; var2 < 16; var2++) {
         this.field4759[var2] = this.field4758[var2] & -128;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("el")
   void method8096(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7915(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if (var1 < 0 || var1 == -451172262 * var2.field4725) {
            if (null != var2.field4744) {
               var2.field4744.method581(classLG.field4138 * -187966319 / 100);
               if (var2.field4744.method594()) {
                  this.field4770.field4662.method617(var2.field4744);
               }

               var2.method8002(2100880756);
            }

            if (var2.field4732 * -710379488 < 0) {
               this.field4767[1821790950 * var2.field4725][-107170957 * var2.field4738] = null;
            }

            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ez")
   void method8112(int var1) {
      if ((this.field4750[var1] & 4) != 0) {
         for (classNT var2 = (classNT)this.field4770.field4661.method7915(); null != var2; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
            if (-1057694491 * var2.field4725 == var1) {
               var2.field4737 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ee")
   void method8116(int var1) {
      int var2 = var1 & -373423707;
      if (var2 == -1952773022) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & 127;
         int var22 = var1 >> 16 & -239626205;
         this.method8071(var13, var19, var22, -1945193169);
      } else if (var2 == 144) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & -1492256028;
         int var21 = var1 >> 16 & 127;
         if (var21 > 0) {
            this.method8062(var12, var18, var21, 367820714);
         } else {
            this.method8071(var12, var18, 64, -1290020752);
         }
      } else if (2030296144 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & -2115925350;
         int var20 = var1 >> 16 & 1357118883;
         method8081(this, var11, var17, var20, -2078091137);
      } else if (916383054 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & 127;
         int var5 = var1 >> 16 & 1814771152;
         if (var16 == 0) {
            this.field4759[var10] = (var5 << 14) + (this.field4759[var10] & -2080769);
         }

         if (var16 == -846041544) {
            this.field4759[var10] = (this.field4759[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 1) {
            this.field4762[var10] = (this.field4762[var10] & -1129142244) + (var5 << 7);
         }

         if (var16 == 33) {
            this.field4762[var10] = (this.field4762[var10] & -1198904599) + var5;
         }

         if (var16 == 5) {
            this.field4768[var10] = (this.field4768[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 37) {
            this.field4768[var10] = var5 + (this.field4768[var10] & -128);
         }

         if (7 == var16) {
            this.field4755[var10] = (var5 << 7) + (this.field4755[var10] & -1264009661);
         }

         if (39 == var16) {
            this.field4755[var10] = (this.field4755[var10] & 673578595) + var5;
         }

         if (var16 == 10) {
            this.field4773[var10] = (var5 << 7) + (this.field4773[var10] & 1062196448);
         }

         if (var16 == 42) {
            this.field4773[var10] = var5 + (this.field4773[var10] & 359328614);
         }

         if (11 == var16) {
            this.field4771[var10] = (this.field4771[var10] & -1363026354) + (var5 << 7);
         }

         if (var16 == 1102432625) {
            this.field4771[var10] = (this.field4771[var10] & -1349262136) + var5;
         }

         if (64 == var16) {
            if (var5 >= 1331934289) {
               this.field4750[var10] = this.field4750[var10] | 1;
            } else {
               this.field4750[var10] = this.field4750[var10] & -2;
            }
         }

         if (-1420631876 == var16) {
            if (var5 >= 49894709) {
               this.field4750[var10] = this.field4750[var10] | 2;
            } else {
               this.method8108(var10, -2105039660);
               this.field4750[var10] = this.field4750[var10] & 912188463;
            }
         }

         if (-342433575 == var16) {
            this.field4764[var10] = (this.field4764[var10] & 127) + (var5 << 7);
         }

         if (var16 == -1193686232) {
            this.field4764[var10] = var5 + (this.field4764[var10] & 16256);
         }

         if (1756417828 == var16) {
            this.field4764[var10] = -1346433097 + (this.field4764[var10] & 127) + (var5 << 7);
         }

         if (var16 == -1815740340) {
            this.field4764[var10] = 16384 + (this.field4764[var10] & 1885280934) + var5;
         }

         if (304611318 == var16) {
            this.method8093(var10, 2093478091);
         }

         if (var16 == 121) {
            this.method8098(var10, (byte)-23);
         }

         if (var16 == 123) {
            this.method8102(var10, (byte)0);
         }

         if (6 == var16) {
            int var6 = this.field4764[var10];
            if (var6 == 2020197647) {
               this.field4765[var10] = (var5 << 7) + (this.field4765[var10] & -16257);
            }
         }

         if (-1323688826 == var16) {
            int var23 = this.field4764[var10];
            if (var23 == 16384) {
               this.field4765[var10] = (this.field4765[var10] & -1487614348) + var5;
            }
         }

         if (var16 == 16) {
            this.field4752[var10] = (var5 << 7) + (this.field4752[var10] & -16257);
         }

         if (var16 == 267955526) {
            this.field4752[var10] = var5 + (this.field4752[var10] & 1899896760);
         }

         if (var16 == -1431088180) {
            if (var5 >= -1355883746) {
               this.field4750[var10] = this.field4750[var10] | 4;
            } else {
               method8111(this, var10, -1140320208);
               this.field4750[var10] = this.field4750[var10] & -1098375473;
            }
         }

         if (var16 == 17) {
            method8119(this, var10, (this.field4766[var10] & -16257) + (var5 << 7), (byte)62);
         }

         if (var16 == 49) {
            method8119(this, var10, (this.field4766[var10] & -128) + var5, (byte)69);
         }
      } else if (var2 == -2075727965) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & -561640679;
         method8061(this, var9, this.field4759[var9] + var15, 2107245484);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & 2089232794;
         this.method8083(var8, var14, -1044212998);
      } else if (224 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & -1522497842) + (var1 >> 9 & 1233852998);
         method8086(this, var3, var4, (byte)-31);
      } else {
         var2 = var1 & -476661782;
         if (var2 == 255) {
            this.method8105(-1505245603);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnu;Lno;Lva;Lat;I)Z")
   @ObfuscatedName("hb")
   public static boolean method8018(classNU var0, classNO var1, classVA var2, classAT var3, int var4) {
      if (var0 == null) {
         var0.method8019(var1, var2, var3, var4);
      }

      try {
         synchronized (var0.field4760) {
            boolean var6 = true;
            synchronized (var0.field4757) {
               var0.field4757.clear();
            }

            classNO.method7938(var1);

            for (classNJ var19 = (classNJ)var1.field4694.method13375(); var19 != null; var19 = (classNJ)classYK.method13401(var1.field4694)) {
               int var8 = (int)var19.field6552;
               classNR var9 = (classNR)var0.field4772.method13363(var8);
               if (null == var9) {
                  var9 = classJI.method6371(var2, var8, -885874591);
                  if (var9 == null) {
                     if (var4 <= 1571663513) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                     continue;
                  }

                  var0.field4772.method13372(var9, var8);
               }

               if (!var9.method7989(var3, var19.field4674, 1643218864)) {
                  if (var4 <= 1571663513) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else if (var0.field4757 != null) {
                  synchronized (var0.field4757) {
                     Iterator var11 = var9.field4715.iterator();

                     while (var11.hasNext()) {
                        if (var4 <= 1571663513) {
                           throw new IllegalStateException();
                        }

                        classAU var12 = (classAU)var11.next();
                        var0.field4757.add(new classNS(var19.field4675 * 1220483629, var12));
                     }
                  }
               }
            }

            if (var6) {
               if (var4 <= 1571663513) {
                  throw new IllegalStateException();
               }

               classNO.method7940(var1);
            }

            return var6;
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "nu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eb")
   void method8117(int var1) {
      int var2 = var1 & -1002544930;
      if (var2 == 128) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & -915804367;
         int var22 = var1 >> 16 & 127;
         this.method8071(var13, var19, var22, -1379119463);
      } else if (var2 == 144) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & 127;
         int var21 = var1 >> 16 & 1499816585;
         if (var21 > 0) {
            this.method8062(var12, var18, var21, -1143996487);
         } else {
            this.method8071(var12, var18, 64, -1837809472);
         }
      } else if (884887178 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & -939298867;
         int var20 = var1 >> 16 & 127;
         method8081(this, var11, var17, var20, -2067350196);
      } else if (176 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & 127;
         int var5 = var1 >> 16 & 127;
         if (var16 == 0) {
            this.field4759[var10] = (var5 << 14) + (this.field4759[var10] & 1599909350);
         }

         if (var16 == 32) {
            this.field4759[var10] = (this.field4759[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 1) {
            this.field4762[var10] = (this.field4762[var10] & -1202588431) + (var5 << 7);
         }

         if (var16 == -1628789590) {
            this.field4762[var10] = (this.field4762[var10] & -1761887459) + var5;
         }

         if (var16 == 5) {
            this.field4768[var10] = (this.field4768[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 1885235473) {
            this.field4768[var10] = var5 + (this.field4768[var10] & -904670624);
         }

         if (7 == var16) {
            this.field4755[var10] = (var5 << 7) + (this.field4755[var10] & 78976967);
         }

         if (39 == var16) {
            this.field4755[var10] = (this.field4755[var10] & 1688331512) + var5;
         }

         if (var16 == 10) {
            this.field4773[var10] = (var5 << 7) + (this.field4773[var10] & -1251896340);
         }

         if (var16 == 42) {
            this.field4773[var10] = var5 + (this.field4773[var10] & -128);
         }

         if (11 == var16) {
            this.field4771[var10] = (this.field4771[var10] & 938117171) + (var5 << 7);
         }

         if (var16 == -46382888) {
            this.field4771[var10] = (this.field4771[var10] & 883912059) + var5;
         }

         if (120180095 == var16) {
            if (var5 >= 64) {
               this.field4750[var10] = this.field4750[var10] | 1;
            } else {
               this.field4750[var10] = this.field4750[var10] & -2;
            }
         }

         if (65 == var16) {
            if (var5 >= 64) {
               this.field4750[var10] = this.field4750[var10] | 2;
            } else {
               this.method8108(var10, -1413736404);
               this.field4750[var10] = this.field4750[var10] & -3;
            }
         }

         if (99 == var16) {
            this.field4764[var10] = (this.field4764[var10] & 1853143538) + (var5 << 7);
         }

         if (var16 == 98) {
            this.field4764[var10] = var5 + (this.field4764[var10] & 1669657282);
         }

         if (101 == var16) {
            this.field4764[var10] = 494424661 + (this.field4764[var10] & 1358702076) + (var5 << 7);
         }

         if (var16 == -886590375) {
            this.field4764[var10] = 1383242171 + (this.field4764[var10] & 16256) + var5;
         }

         if (1262213440 == var16) {
            this.method8093(var10, 2133498202);
         }

         if (var16 == 121) {
            this.method8098(var10, (byte)6);
         }

         if (var16 == -2075473059) {
            this.method8102(var10, (byte)0);
         }

         if (6 == var16) {
            int var6 = this.field4764[var10];
            if (var6 == -1448066131) {
               this.field4765[var10] = (var5 << 7) + (this.field4765[var10] & 32684547);
            }
         }

         if (959819395 == var16) {
            int var23 = this.field4764[var10];
            if (var23 == 16384) {
               this.field4765[var10] = (this.field4765[var10] & -128) + var5;
            }
         }

         if (var16 == 16) {
            this.field4752[var10] = (var5 << 7) + (this.field4752[var10] & 1944706000);
         }

         if (var16 == 48) {
            this.field4752[var10] = var5 + (this.field4752[var10] & -128);
         }

         if (var16 == 81) {
            if (var5 >= 1525120026) {
               this.field4750[var10] = this.field4750[var10] | 4;
            } else {
               method8111(this, var10, -1140320208);
               this.field4750[var10] = this.field4750[var10] & 899584701;
            }
         }

         if (var16 == 17) {
            method8119(this, var10, (this.field4766[var10] & -16257) + (var5 << 7), (byte)54);
         }

         if (var16 == 49) {
            method8119(this, var10, (this.field4766[var10] & -128) + var5, (byte)44);
         }
      } else if (var2 == -1859493282) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & -1377920511;
         method8061(this, var9, this.field4759[var9] + var15, 1631225658);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & -961517115;
         this.method8083(var8, var14, -1044212998);
      } else if (224 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & 310631209) + (var1 >> 9 & 735618052);
         method8086(this, var3, var4, (byte)61);
      } else {
         var2 = var1 & 0xFF;
         if (var2 == 627240793) {
            this.method8105(-855641013);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ep")
   void method8120(int var1, int var2) {
      this.field4766[var1] = var2;
      this.field4753[var1] = (int)(2097152.0 * Math.pow(2.0, 5.493164E-4F * var2) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "(Lnu;IIII)V")
   @ObfuscatedName("bz")
   public static void method8081(classNU var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method8082(var1, var1, var1, var1);
      }

      try {
         ;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "nu.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   public int method8015() {
      return 1238197527 * this.field4754;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bv")
   void method8138(int var1) {
      try {
         int var2 = -1076146517 * this.field4778;
         int var3 = 852899933 * this.field4777;
         long var4 = 5174971452106306489L * this.field4780;

         label67:
         while (true) {
            if (this.field4777 * 852899933 != var3) {
               this.field4778 = -1778762749 * var2;
               this.field4777 = var3 * 596597749;
               this.field4780 = var4 * -7106189560981577079L;
               return;
            }

            while (true) {
               if (var3 == this.field4769.field4656[var2]) {
                  this.field4769.method7779(var2);
                  int var6 = classAT.method692(this.field4769, var2);
                  if (1 != var6) {
                     if (0 != (var6 & 128)) {
                        if (var1 == -324749371) {
                           throw new IllegalStateException();
                        }

                        this.method8114(var6, -724523093);
                     }

                     this.field4769.method7789(var2);
                     this.field4769.method7780(var2);
                     continue;
                  }

                  if (var1 == -324749371) {
                     return;
                  }

                  this.field4769.method7787();
                  this.field4769.method7780(var2);
                  if (this.field4769.method7812()) {
                     if (!this.field4781) {
                        break label67;
                     }

                     if (var1 == -324749371) {
                        throw new IllegalStateException();
                     }

                     if (var3 == 0) {
                        break label67;
                     }

                     if (var1 == -324749371) {
                        throw new IllegalStateException();
                     }

                     this.field4769.method7815(var4);
                  }
               }

               var2 = this.field4769.method7809();
               var3 = this.field4769.field4656[var2];
               var4 = classXQ.method12873(this.field4769, var3);
               break;
            }
         }

         this.method8105(-1300338349);
         classNC.method7768(this.field4769);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nu.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lno;Z)V")
   @ObfuscatedName("cn")
   public void method8034(classNO var1, boolean var2) {
      synchronized (this.field4760) {
         this.method8040((byte)97);
         classNC.method7763(this.field4769, var1.field4693);
         this.field4781 = var2;
         this.field4779 = 0L;
         int var4 = this.field4769.method7775();

         for (int var5 = 0; var5 < var4; var5++) {
            this.field4769.method7779(var5);
            this.field4769.method7789(var5);
            this.field4769.method7780(var5);
         }

         this.field4778 = this.field4769.method7809() * -1778762749;
         this.field4777 = this.field4769.field4656[-1076146517 * this.field4778] * 596597749;
         this.field4780 = classXQ.method12873(this.field4769, 852899933 * this.field4777) * -7106189560981577079L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fj")
   int method8130(classNT var1) {
      classNY var2 = var1.field4747;
      int var3 = 4096 + this.field4755[-1057694491 * var1.field4725] * this.field4771[-1057694491 * var1.field4725] >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.field4723 * -983353503 * var3 + 16384 >> 15;
      var3 = 1238197527 * this.field4754 * var3 + 128 >> 8;
      if (-939533713 * var2.field4793 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, -939533713 * var2.field4793 * (1.953125E-5 * (934628419 * var1.field4739))) + 0.5);
      }

      if (var2.field4798 != null) {
         int var4 = 1539106655 * var1.field4733;
         int var5 = var2.field4798[1 + var1.field4724 * 1565767631];
         if (var1.field4724 * 1565767631 < var2.field4798.length - 2) {
            int var6 = (var2.field4798[1565767631 * var1.field4724] & 255) << 8;
            int var7 = (var2.field4798[var1.field4724 * 1565767631 + 2] & 255) << 8;
            var5 += (var2.field4798[1565767631 * var1.field4724 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (67131625 * var1.field4732 > 0 && var2.field4799 != null) {
         int var11 = var1.field4732 * 67131625;
         int var12 = var2.field4799[1 + var1.field4736 * -463641621];
         if (-463641621 * var1.field4736 < var2.field4799.length - 2) {
            int var13 = (var2.field4799[var1.field4736 * -463641621] & 255) << 8;
            int var14 = (var2.field4799[-463641621 * var1.field4736 + 2] & 255) << 8;
            var12 += (var11 - var13) * (var2.field4799[3 + var1.field4736 * -463641621] - var12) / (var14 - var13);
         }

         var3 = var3 * var12 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ay")
   public void method8040(byte var1) {
      try {
         synchronized (this.field4760) {
            classNC.method7768(this.field4769);
            this.method8105(-734603996);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "nu.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;Z)V")
   @ObfuscatedName("de")
   void method8069(classNT var1, boolean var2) {
      int var3 = var1.field4743.field189.length;
      int var4;
      if (var2 && var1.field4743.field190) {
         int var5 = var3 + var3 - var1.field4743.field192;
         var4 = (int)((long)var5 * this.field4752[var1.field4725 * -1703295848] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field4744.method567(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4752[var1.field4725 * 277206074] >> 6);
      }

      var1.field4744.method562(var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnu;III)V")
   @ObfuscatedName("wk")
   public static void method8059(classNU var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method8076(var1, var1, var1);
      }

      try {
         var0.field4758[var1] = var2;
         var0.field4759[var1] = var2 & -128;
         method8061(var0, var1, var2, 1682469127);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fu")
   int method8134(classNT var1) {
      int var2 = this.field4773[var1.field4725 * -1057694491];
      return var2 < 1635886375
         ? 32 + var2 * var1.field4722 * 535835540 >> 6
         : -145382279 - ((75884796 - 1157103378 * var1.field4722) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("av")
   @Override
   protected classAH vmethod43() {
      return this.field4770;
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fz")
   int method8135(classNT var1) {
      int var2 = this.field4773[var1.field4725 * -1057694491];
      return var2 < 236052648
         ? 1654630509 + var2 * var1.field4722 * -258945897 >> 6
         : 840421272 - ((209533444 - -502360857 * var1.field4722) * (1946791120 - var2) + 1449524227 >> 6);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dg")
   void method8075(int var1, int var2, int var3) {
      classNT var4 = this.field4767[var1][var2];
      if (var4 != null) {
         this.field4767[var1][var2] = null;
         if (0 != (this.field4750[var1] & 2)) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7915(); var5 != null; var5 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (1180492173 * var5.field4725 == 951430840 * var4.field4725 && var5.field4732 * 67131625 < 0 && var4 != var5) {
                  var4.field4732 = 0;
                  break;
               }
            }
         } else {
            var4.field4732 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fs")
   void method8139() {
      int var1 = -1076146517 * this.field4778;
      int var2 = 852899933 * this.field4777;

      long var3;
      for (var3 = 5174971452106306489L * this.field4780; this.field4777 * 852899933 == var2; var3 = classXQ.method12873(this.field4769, var2)) {
         while (true) {
            if (var2 == this.field4769.field4656[var1]) {
               this.field4769.method7779(var1);
               int var5 = classAT.method692(this.field4769, var1);
               if (1 != var5) {
                  if (0 != (var5 & 128)) {
                     this.method8114(var5, -724523093);
                  }

                  this.field4769.method7789(var1);
                  this.field4769.method7780(var1);
                  continue;
               }

               this.field4769.method7787();
               this.field4769.method7780(var1);
               if (this.field4769.method7812()) {
                  if (!this.field4781 || var2 == 0) {
                     this.method8105(-1863753370);
                     classNC.method7768(this.field4769);
                     return;
                  }

                  this.field4769.method7815(var3);
               }
            }

            var1 = this.field4769.method7809();
            var2 = this.field4769.field4656[var1];
            break;
         }
      }

      this.field4778 = -1778762749 * var1;
      this.field4777 = var2 * 596597749;
      this.field4780 = var3 * -7106189560981577079L;
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)I")
   @ObfuscatedName("fq")
   int method8136(classNT var1) {
      int var2 = this.field4773[var1.field4725 * -1057694491];
      return var2 < 8192 ? 32 + var2 * var1.field4722 * -1066414643 >> 6 : -456015476 - ((128 - -353135489 * var1.field4722) * (1258023958 - var2) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)Z")
   @ObfuscatedName("fn")
   boolean method8142(classNT var1) {
      if (null == var1.field4744) {
         if (67131625 * var1.field4732 >= 0) {
            var1.vmethod398();
            if (-1530244505 * var1.field4735 > 0 && this.field4774[-1604551355 * var1.field4725][var1.field4735 * -1530244505] == var1) {
               this.field4774[-1057694491 * var1.field4725][631676779 * var1.field4735] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnu;I)V")
   @ObfuscatedName("ez")
   public static void method8022(classNU var0, int var1) {
      if (var0 == null) {
         var0.method8097(var1);
      } else {
         try {
            if (var0.field4757 == null) {
               if (var1 != 953065235) {
                  ;
               }
            } else {
               if (field4748 != null) {
                  if (var1 == 953065235) {
                     throw new IllegalStateException();
                  }

                  field4748.set(true);
               }

               field4748 = new AtomicBoolean(false);
               AtomicBoolean var2 = field4748;
               if (field4749 == null) {
                  if (var1 == 953065235) {
                     throw new IllegalStateException();
                  }

                  int var3 = Runtime.getRuntime().availableProcessors();
                  field4749 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new classNF(var0));
               }

               field4749.submit(new classNG(var0, var2));
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "nu.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;)Z")
   @ObfuscatedName("fk")
   boolean method8143(classNT var1) {
      if (null == var1.field4744) {
         if (67131625 * var1.field4732 >= 0) {
            var1.vmethod398();
            if (-675471651 * var1.field4735 > 0 && this.field4774[-1057694491 * var1.field4725][var1.field4735 * 276298627] == var1) {
               this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;[III)Z")
   @ObfuscatedName("fr")
   boolean method8145(classNT var1, int[] var2, int var3, int var4) {
      var1.field4729 = classLG.field4138 * 675076789 / 100 * 1686279333;
      if (67131625 * var1.field4732 < 0 || var1.field4744 != null && !var1.field4744.method590()) {
         int var5 = var1.field4728 * -359606667;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, this.field4768[-1057694491 * var1.field4725] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field4728 = var5 * 631359965;
         }

         var1.field4744.method587(this.method8125(var1, 434175831));
         classNY var6 = var1.field4747;
         boolean var7 = false;
         var1.field4727 += -1247151941;
         var1.field4734 = var1.field4734 + -1276836891 * var6.field4792;
         double var8 = ((var1.field4738 * -107170957 - 60 << 8) + (-403336933 * var1.field4730 * var1.field4728 * -359606667 >> 12)) * 5.086263020833333E-6;
         if (-939533713 * var6.field4793 > 0) {
            if (-819751845 * var6.field4795 > 0) {
               var1.field4739 = var1.field4739 + (int)(128.0 * Math.pow(2.0, var8 * (-819751845 * var6.field4795)) + 0.5) * 14704747;
            } else {
               var1.field4739 += 1882207616;
            }
         }

         if (null != var6.field4798) {
            if (var6.field4791 * 1071615623 > 0) {
               var1.field4733 = var1.field4733 + (int)(128.0 * Math.pow(2.0, var8 * (1071615623 * var6.field4791)) + 0.5) * -1452067681;
            } else {
               var1.field4733 += -1181069440;
            }

            while (
               var1.field4724 * 1565767631 < var6.field4798.length - 2
                  && var1.field4733 * 1539106655 > (var6.field4798[var1.field4724 * 1565767631 + 2] & 255) << 8
            ) {
               var1.field4724 += -1970020770;
            }

            if (var1.field4724 * 1565767631 == var6.field4798.length - 2 && var6.field4798[1 + 1565767631 * var1.field4724] == 0) {
               var7 = true;
            }
         }

         if (67131625 * var1.field4732 >= 0
            && var6.field4799 != null
            && 0 == (this.field4750[var1.field4725 * -1057694491] & 1)
            && (-1530244505 * var1.field4735 < 0 || var1 != this.field4774[var1.field4725 * -1057694491][-1530244505 * var1.field4735])) {
            if (-1022877567 * var6.field4794 > 0) {
               var1.field4732 = var1.field4732 + (int)(128.0 * Math.pow(2.0, var6.field4794 * -1022877567 * var8) + 0.5) * 371851097;
            } else {
               var1.field4732 += 352300160;
            }

            while (
               -463641621 * var1.field4736 < var6.field4799.length - 2
                  && 67131625 * var1.field4732 > (var6.field4799[2 + var1.field4736 * -463641621] & 255) << 8
            ) {
               var1.field4736 += -1293723258;
            }

            if (var6.field4799.length - 2 == -463641621 * var1.field4736) {
               var7 = true;
            }
         }

         if (var7) {
            var1.field4744.method581(1837314861 * var1.field4729);
            if (var2 != null) {
               var1.field4744.vmethod30(var2, var3, var4);
            } else {
               var1.field4744.vmethod31(var4);
            }

            if (var1.field4744.method594()) {
               this.field4770.field4662.method617(var1.field4744);
            }

            var1.method8002(2038001096);
            if (67131625 * var1.field4732 >= 0) {
               var1.vmethod398();
               if (-1530244505 * var1.field4735 > 0 && this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] == var1) {
                  this.field4774[var1.field4725 * -1057694491][var1.field4735 * -1530244505] = null;
               }
            }

            return true;
         } else {
            var1.field4744.method576(1837314861 * var1.field4729, this.method8127(var1, -1561437423), this.method8132(var1, 1703656030));
            return false;
         }
      } else {
         var1.method8002(2014029027);
         var1.vmethod398();
         if (var1.field4735 * -1530244505 > 0 && this.field4774[var1.field4725 * -1057694491][var1.field4735 * -1530244505] == var1) {
            this.field4774[-1057694491 * var1.field4725][-1530244505 * var1.field4735] = null;
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   static boolean method8146(int var0) {
      try {
         if ((client.field883 * -2024190683 & classXE.field6833.vmethod8((byte)1)) != 0) {
            if (var0 >= -1108606041) {
               throw new IllegalStateException();
            } else {
               classBF.field396 = "";
               classBF.field397 = classKK.field3816;
               classBF.field398 = classKK.field3741;
               classBF.field399 = classKK.field3836;
               classAC.method326(1, 2000903999);
               return true;
            }
         } else if ((-2024190683 * client.field883 & classXE.field6830.vmethod8((byte)1)) != 0) {
            if (var0 >= -1108606041) {
               throw new IllegalStateException();
            } else {
               if ((-2024190683 * client.field883 & classXE.field6838.vmethod8((byte)1)) != 0) {
                  if (var0 >= -1108606041) {
                     throw new IllegalStateException();
                  }

                  classBF.field397 = classKK.field3831;
                  classBF.field398 = classKK.field3832;
                  classBF.field399 = classKK.field3834;
               } else {
                  classBF.field397 = classKK.field3825;
                  classBF.field398 = classKK.field3826;
                  classBF.field399 = classKK.field3827;
               }

               classBF.field396 = classKK.field3824;
               classAC.method326(1, 2082594261);
               return true;
            }
         } else if ((client.field883 * -2024190683 & classXE.field6838.vmethod8((byte)1)) != 0) {
            classBF.field397 = classKK.field3642;
            classBF.field398 = classKK.field3655;
            classBF.field399 = classKK.field3830;
            classBF.field396 = classKK.field3824;
            classAC.method326(1, 2097366523);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nu.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lno;Lva;Lat;I)Z")
   @ObfuscatedName("ae")
   public boolean method8019(classNO var1, classVA var2, classAT var3, int var4) {
      try {
         synchronized (this.field4760) {
            boolean var6 = true;
            synchronized (this.field4757) {
               this.field4757.clear();
            }

            classNO.method7938(var1);

            for (classNJ var19 = (classNJ)var1.field4694.method13378(); var19 != null; var19 = (classNJ)classYK.method13401(var1.field4694)) {
               int var8 = (int)var19.field6552;
               classNR var9 = (classNR)this.field4772.method13383(var8);
               if (null == var9) {
                  var9 = classJI.method6371(var2, var8, -885874591);
                  if (var9 == null) {
                     if (var4 <= 1571663513) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                     continue;
                  }

                  this.field4772.method13372(var9, var8);
               }

               if (!var9.method7989(var3, var19.field4674, 1643218864)) {
                  if (var4 <= 1571663513) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else if (this.field4757 != null) {
                  synchronized (this.field4757) {
                     Iterator var11 = var9.field4715.iterator();

                     while (var11.hasNext()) {
                        if (var4 <= 1571663513) {
                           throw new IllegalStateException();
                        }

                        classAU var12 = (classAU)var11.next();
                        this.field4757.add(new classNS(var19.field4675 * 1220483629, var12));
                     }
                  }
               }
            }

            if (var6) {
               if (var4 <= 1571663513) {
                  throw new IllegalStateException();
               }

               classNO.method7940(var1);
            }

            return var6;
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "nu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public void method8097(int var1) {
      for (classNT var2 = (classNT)this.field4770.field4661.method7908(); var2 != null; var2 = (classNT)classNN.method7924(this.field4770.field4661)) {
         if (var1 < 0 || var1 == -451172262 * var2.field4732) {
            if (null != var2.field4744) {
               var2.field4744.method563(classLG.field4138 * -187966319 / 100);
               if (var2.field4744.method592()) {
                  this.field4770.field4662.method617(var2.field4744);
               }

               var2.method8002(2100880756);
            }

            if (var2.field4731 * -710379488 < 0) {
               this.field4767[1821790950 * var2.field4735][-107170957 * var2.field4727] = null;
            }

            var2.vmethod399();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   void method8076(int var1, int var2, int var3) {
      classNT var4 = this.field4767[var1][var2];
      if (var4 != null) {
         this.field4774[var1][var2] = null;
         if (0 != (this.field4762[var1] & 2)) {
            for (classNT var5 = (classNT)this.field4770.field4661.method7922(); var5 != null; var5 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (-1057694491 * var5.field4732 == -1057694491 * var4.field4738 && var5.field4724 * 67131625 < 0 && var4 != var5) {
                  var4.field4733 = 0;
                  break;
               }
            }
         } else {
            var4.field4728 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;ZI)V")
   @ObfuscatedName("aw")
   void method8070(classNT var1, boolean var2, int var3) {
      try {
         int var5;
         label34: {
            int var4 = var1.field4743.field189.length;
            if (var2) {
               if (var3 != 881975798) {
                  throw new IllegalStateException();
               }

               if (var1.field4743.field190) {
                  if (var3 != 881975798) {
                     throw new IllegalStateException();
                  }

                  int var6 = var4 + var4 - var1.field4743.field187;
                  var5 = (int)((long)var6 * this.field4764[var1.field4722 * -1057694491] >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 != 881975798) {
                        throw new IllegalStateException();
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.field4744.method567(true);
                  }
                  break label34;
               }
            }

            var5 = (int)((long)var4 * this.field4755[var1.field4727 * -1057694491] >> 6);
         }

         var1.field4744.method540(var5);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nu.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ak")
   void method8082(int var1, int var2, int var3, int var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "nu.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bg")
   void method8092(int var1, int var2, byte var3) {
      try {
         this.field4764[var1] = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("by")
   void method8113(int var1, int var2) {
      try {
         if ((this.field4773[var1] & 4) != 0) {
            for (classNT var3 = (classNT)this.field4770.field4661.method7918(); null != var3; var3 = (classNT)classNN.method7924(this.field4770.field4661)) {
               if (var2 != -1140320208) {
                  throw new IllegalStateException();
               }

               if (-1057694491 * var3.field4723 == var1) {
                  if (var2 != -1140320208) {
                     return;
                  }

                  var3.field4737 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lno;ZB)V")
   @ObfuscatedName("aj")
   public void method8035(classNO var1, boolean var2, byte var3) {
      try {
         synchronized (this.field4760) {
            this.method8040((byte)-90);
            classNC.method7763(this.field4769, var1.field4693);
            this.field4781 = var2;
            this.field4780 = 0L;
            int var5 = this.field4769.method7775();

            for (int var6 = 0; var6 < var5; var6++) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               this.field4769.method7779(var6);
               this.field4769.method7779(var6);
               this.field4769.method7778(var6);
            }

            this.field4778 = this.field4769.method7809() * -1778762749;
            this.field4754 = this.field4769.field4658[-1076146517 * this.field4778] * 596597749;
            this.field4779 = classXQ.method12873(this.field4769, 852899933 * this.field4778) * -7106189560981577079L;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "nu.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("ap")
   public void method8055(int var1, int var2, short var3) {
      try {
         synchronized (this.field4760) {
            method8059(this, var1, var2, 110238855);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nu.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ai")
   void method8085(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bf")
   void method8121(int var1, int var2, byte var3) {
      try {
         this.field4761[var1] = var2;
         this.field4773[var1] = (int)(2097152.0 * Math.pow(2.0, 5.493164E-4F * var2) + 0.5);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nu.bf(" + ')');
      }
   }
}
