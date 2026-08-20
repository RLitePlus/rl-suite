import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ac")
public class classAC {
   @ObfuscatedName("ae")
   ExecutorService field127 = Executors.newSingleThreadExecutor();
   @ObfuscatedSignature(descriptor = "Lae;")
   @ObfuscatedName("af")
   final classAE field128;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("az")
   final classXY field129;
   @ObfuscatedName("ab")
   Future field133;
   @ObfuscatedSignature(descriptor = "Lhv;")
   @ObfuscatedName("ah")
   static classHV field132;
   @ObfuscatedName("cx")
   static boolean field135;
   @ObfuscatedName("lk")
   static byte[][] field136;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field130 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field131 = 10;
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("kf")
   static classMF field134;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)Lvh;")
   @ObfuscatedName("qf")
   public static classVH method324(classOI var0) {
      return var0.field4876;
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ab")
   void method320(short var1) {
      try {
         this.field133 = this.field127.submit(new classAF(this, this.field129, this.field128));
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ac.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method312() {
      this.field127.shutdown();
      this.field127 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void method313() {
      this.field127.shutdown();
      this.field127 = null;
   }

   public classAC(classXY var1, classAE var2) {
      this.field129 = var1;
      this.field128 = var2;
      this.method320((short)-6012);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method321() {
      this.field133 = this.field127.submit(new classAF(this, this.field129, this.field128));
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method314(int var1) {
      try {
         this.field127.shutdown();
         this.field127 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ac.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lxy;")
   @ObfuscatedName("ae")
   public classXY method317(byte var1) {
      try {
         try {
            return (classXY)this.field133.get();
         } catch (Exception var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ac.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method315() {
      this.field127.shutdown();
      this.field127 = null;
   }

   @ObfuscatedSignature(descriptor = "()Lxy;")
   @ObfuscatedName("aa")
   public classXY method318() {
      try {
         return (classXY)this.field133.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxy;")
   @ObfuscatedName("ao")
   public classXY method319() {
      try {
         return (classXY)this.field133.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method322() {
      this.field133 = this.field127.submit(new classAF(this, this.field129, this.field128));
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method311(int var1) {
      try {
         return this.field133.isDone();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ac.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method323() {
      this.field133 = this.field127.submit(new classAF(this, this.field129, this.field128));
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("am")
   static void method326(int var0, int var1) {
      try {
         if (-47366135 * classBF.field384 == var0) {
            if (var1 <= 1997865712) {
               throw new IllegalStateException();
            }
         } else {
            classBF.field384 = 1117408825 * var0;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ac.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   static void method325(byte var0) {
      try {
         if (null != classSX.field6096) {
            if (var0 != 11) {
               throw new IllegalStateException();
            }

            if (classSX.field6096.method3590((byte)-24)) {
               if (var0 != 11) {
                  throw new IllegalStateException();
               }

               classSX.field6096.method3577(738542393);
            }
         }

         classGN.method5544(-765496050);
         classBD.method989((byte)127);
         if (null != classPP.field5380) {
            if (var0 != 11) {
               throw new IllegalStateException();
            }

            classPP.field5380.field1539 = false;
         }

         classPP.field5380 = null;
         client.field795.method3374((short)19926);
         if (classWW.field6786 != null) {
            if (var0 != 11) {
               throw new IllegalStateException();
            }

            try {
               classWW.field6786.method7504((short)28124);
            } catch (Exception var4) {
            }
         }

         classWW.field6786 = null;
         classPM.method9016((short)6916);
         classMM.method7621(1434517176);
         client.field814.method1626(1822507524);
         client.field817.method7895();
         classYN.method13579(classYE.field6977);
         client.field1125 = null;
         classBK.method1118(0, 0, (byte)119);
         classDH.method3122(-1612757241);
         client.field989 = false;
         Iterator var1 = client.field814.iterator();

         while (var1.hasNext()) {
            if (var0 != 11) {
               client.method2399();
               return;
            }

            classDZ var2 = (classDZ)var1.next();
            classDZ.method3745(var2, (byte)-98);
         }

         client.field857.method10296(false, 1845258725);
         if (classBJ.field481 != null) {
            if (var0 != 11) {
               throw new IllegalStateException();
            }

            classBJ.field481.method414((byte)-1);
         }

         classVB.method11916(classEB.field1726, 2131645249);
         classTB.method10733(-1927903443);
         if (null != classAV.field294) {
            if (var0 != 11) {
               client.method2399();
               return;
            }

            classAV.field294.method2876((byte)44);
         }

         classLW.method7157(2000203024);
         classME.field4488 = null;
         classME.field4489 = null;
         classBI.field477 = null;
         classHG.method6009((byte)16);
         classQX.field5623 = null;
         client.field1002.clear();
         client.field1004 = 0;
         classEB.field1726 = new classVB();
         classAV.field294 = new classDP(classOE.field4843.field791, 240);

         try {
            classCL.method1586("oldschool", classGV.field2716, classRO.field5825.field3556, 0, 25, (byte)1);
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }

         classQX.field5623 = new classUS(255, classME.field4488, classME.field4489, 750000);
         classWW.field6786 = new classMB();
         classWK.field6691 = new classVV(classCC.field671, classSX.field6097, classHC.field2767, classYO.field7023, classLZ.field4452);
         classOE.field4843.method11024((byte)1);
         classXQ.method12874(classCP.field1197, 200380884);
         classJB.method6345(0, -1192966987);
         client.method2399();
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ac.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("az")
   public static void method316(int var0, int var1, int var2) {
      try {
         Iterator var3 = classNP.field4695.iterator();

         while (var3.hasNext()) {
            if (var2 <= 227155452) {
               throw new IllegalStateException();
            }

            classNQ var4 = (classNQ)var3.next();
            var4.vmethod246(var0, var1, 927076618);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ac.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)I")
   @ObfuscatedName("az")
   public static int method310(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 <= 127) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var3++;
            } else if (var5 <= 2047) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var3 += 2;
            } else {
               var3 += 3;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ac.az(" + 41);
      }
   }
}
