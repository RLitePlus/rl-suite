import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vp")
public class classVP extends AbstractArchive {
   @ObfuscatedName("ap")
   volatile boolean[] field6551;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6549 = 200;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6545 = 200;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6546 = 2;
   @ObfuscatedName("ac")
   static CRC32 field6533 = new CRC32();
   @ObfuscatedName("aa")
   boolean field6536 = false;
   @ObfuscatedSignature(descriptor = "Lus;")
   @ObfuscatedName("al")
   classUS field6540;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final byte field6544 = 4;
   @ObfuscatedSignature(descriptor = "Lus;")
   @ObfuscatedName("aj")
   classUS field6541;
   @ObfuscatedName("ay")
   int field6535;
   @ObfuscatedName("aq")
   volatile int field6539;
   @ObfuscatedName("ad")
   boolean field6538;
   @ObfuscatedName("ao")
   boolean field6537 = false;
   @ObfuscatedName("au")
   int field6548;
   @ObfuscatedName("ai")
   int field6547;
   @ObfuscatedName("ar")
   int field6542;
   @ObfuscatedSignature(descriptor = "Lvb;")
   @ObfuscatedName("aw")
   classVB field6543;
   @ObfuscatedSignature(descriptor = "Lzv;")
   @ObfuscatedName("di")
   public static Font field6550;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method12011() {
      return 1 == this.field6539 * 1031852869;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public int method12044(int var1) {
      try {
         byte var2 = 0;
         int var3 = 0;

         for (int var4 = 0; var4 < this.field6453.length; var4++) {
            if (var1 >= -1370204663) {
               throw new IllegalStateException();
            }

            if (this.field6448[var4] > 0) {
               if (var1 >= -1370204663) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.method12038(var4, -1795423275);
            }
         }

         if (0 != var2) {
            return 100 * var3 / var2;
         } else if (var1 >= -1370204663) {
            throw new IllegalStateException();
         } else {
            return 100;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "vp.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vc")
   public void method12051() {
      method12036(this, -1610851517);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod610(int var1, int var2) {
      try {
         if (null != this.field6540 && null != this.field6551 && this.field6551[var1]) {
            if (var2 >= 1284385685) {
               throw new IllegalStateException();
            }

            classUS var3 = this.field6540;
            byte[] var5 = null;
            synchronized (classUJ.field6313) {
               for (classVU var7 = (classVU)classUJ.field6313.method7915(); var7 != null; var7 = (classVU)classNN.method7924(classUJ.field6313)) {
                  if (var2 >= 1284385685) {
                     throw new IllegalStateException();
                  }

                  if (var7.field6552 == var1) {
                     if (var2 >= 1284385685) {
                        return;
                     }

                     if (var7.field6608 == var3) {
                        if (var2 >= 1284385685) {
                           throw new IllegalStateException();
                        }

                        if (var7.field6607 * -1312025255 == 0) {
                           if (var2 >= 1284385685) {
                              throw new IllegalStateException();
                           }

                           var5 = var7.field6610;
                           break;
                        }
                     }
                  }
               }
            }

            if (var5 != null) {
               if (var2 >= 1284385685) {
                  return;
               }

               this.method12048(var3, var1, var5, true, (byte)9);
            } else {
               byte[] var11 = var3.method11527(var1, -1142684788);
               this.method12048(var3, var1, var11, true, (byte)67);
            }
         } else {
            classVB.method11921(this.field6543, this, this.field6535 * -169317867, var1, this.field6452[var1], (byte)4, true, -1536139829);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "vp.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lus;Lus;Lvb;IZZZ)V")
   @ObfuscatedName("lp")
   public void method12049(classUS var1, classUS var2, classVB var3, int var4, boolean var5, boolean var6, boolean var7) {
      if (var4 >= 0 && var4 < 23) {
         client.field1027[var4] = this;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void method12026(byte var1) {
      try {
         this.field6539 = 1379634970;
         this.field6447 = new int[0];
         this.field6452 = new int[0];
         this.field6446 = new int[0];
         this.field6448 = new int[0];
         this.field6456 = new int[0][];
         this.field6453 = new Object[0];
         this.field6457 = new Object[0][];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "vp.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("au")
   public static byte[] method12052(byte[] var0) {
      return classMD.method7538(var0, (byte)27);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method12021(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(WorldMapElement.field5406);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "vp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method12017(int var1) {
      try {
         if (this.field6539 * 1031852869 != 1) {
            if (var1 == -2329933) {
               throw new IllegalStateException();
            }

            if (!this.field6537 || 2 != 1031852869 * this.field6539) {
               if (this.field6453 != null) {
                  if (var1 == -2329933) {
                     throw new IllegalStateException();
                  }

                  return 99;
               }

               int var2 = this.field6543.method11911(classUM.field6329.field6328 * 1060637953, -169317867 * this.field6535, -1779850424);
               if (var2 >= 100) {
                  if (var1 == -2329933) {
                     throw new IllegalStateException();
                  }

                  var2 = 99;
               }

               return var2;
            }

            if (var1 == -2329933) {
               throw new IllegalStateException();
            }
         }

         return 100;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method12045() {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.field6453.length; var3++) {
         if (this.field6448[var3] > 0) {
            var1 += 100;
            var2 += this.method12038(var3, -1338221037);
         }
      }

      return 0 == var1 ? 1965985208 : -1333453745 * var2 / var1;
   }

   @ObfuscatedSignature(descriptor = "(I[BZZI)V")
   @ObfuscatedName("ax")
   void method12033(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      try {
         if (var3) {
            if (var5 == 685517991) {
               return;
            }

            if (1 == this.field6539 * 1031852869) {
               if (var5 == 685517991) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if (this.field6541 != null) {
               if (var5 == 685517991) {
                  return;
               }

               int var6 = -169317867 * this.field6535;
               classUS var7 = this.field6541;
               classVU var8 = new classVU();
               var8.field6607 = 0;
               var8.field6552 = var6;
               var8.field6610 = var2;
               var8.field6608 = var7;
               synchronized (classUJ.field6313) {
                  classNN.method7900(classUJ.field6313, var8);
               }

               synchronized (classUJ.field6315) {
                  if (0 == 508619279 * classUJ.field6314) {
                     if (var5 == 685517991) {
                        throw new IllegalStateException();
                     }

                     classMK.field4522 = new Thread(new classUJ());
                     client.method2185(-1);
                     classMK.field4522.setDaemon(true);
                     classMK.field4522.start();
                     classMK.field4522.setPriority(5);
                  }

                  classUJ.field6314 = 69046312;
               }
            }

            this.method11794(var2, 1479807699);
            method12036(this, -3211026);
         } else {
            var2[var2.length - 4] = (byte)(this.field6446[var1] >> 24);
            var2[var2.length - 3] = (byte)(this.field6446[var1] >> 16);
            var2[var2.length - 2] = (byte)(this.field6446[var1] >> 8);
            var2[var2.length - 1] = (byte)this.field6446[var1];
            if (null != this.field6540) {
               classUS var19 = this.field6540;
               classVU var20 = new classVU();
               var20.field6607 = 0;
               var20.field6552 = var1;
               var20.field6610 = var2;
               var20.field6608 = var19;
               synchronized (classUJ.field6313) {
                  classNN.method7900(classUJ.field6313, var20);
               }

               synchronized (classUJ.field6315) {
                  if (0 == 508619279 * classUJ.field6314) {
                     if (var5 == 685517991) {
                        throw new IllegalStateException();
                     }

                     classMK.field4522 = new Thread(new classUJ());
                     client.method2185(-1);
                     classMK.field4522.setDaemon(true);
                     classMK.field4522.start();
                     classMK.field4522.setPriority(5);
                  }

                  classUJ.field6314 = 69046312;
               }

               this.field6551[var1] = true;
            }

            if (var4) {
               if (var5 == 685517991) {
                  throw new IllegalStateException();
               }

               this.field6453[var1] = classOQ.method8718(var2, false, 1657375579);
            }
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "vp.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   public int method12038(int var1, int var2) {
      try {
         if (null != this.field6453[var1]) {
            if (var2 >= -324749371) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else if (this.field6551[var1]) {
            if (var2 >= -324749371) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return this.field6543.method11911(this.field6535 * -169317867, var1, -1779850424);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("al")
   public boolean method12040(int var1, int var2) {
      try {
         return this.field6551[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;II)V")
   @ObfuscatedName("oz")
   public static void method12022(classVP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12025(var1, var1);
      }

      try {
         classVB.method11919(var0.field6543, -169317867 * var0.field6535, var1, (byte)1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method12018() {
      if (this.field6539 * 1031852869 != 1 && (!this.field6537 || 2 != 1031852869 * this.field6539)) {
         if (this.field6453 != null) {
            return 99;
         } else {
            int var1 = this.field6543.method11911(classUM.field6329.field6328 * 1060637953, -169317867 * this.field6535, -1779850424);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 100;
      }
   }

   @ObfuscatedSignature(descriptor = "([BZ)Ljava/lang/Object;")
   @ObfuscatedName("tj")
   public static Object method12050(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         classZW var2 = new classZW();
         var2.method14214(var0);
         return var2;
      } else {
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method12012() {
      return 1 == this.field6539 * 1031852869;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method12013() {
      return 1 == this.field6539 * 1031852869;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   @Override
   void vmethod612(int var1) {
      if (null != this.field6540 && null != this.field6551 && this.field6551[var1]) {
         classUS var2 = this.field6540;
         byte[] var4 = null;
         synchronized (classUJ.field6313) {
            for (classVU var6 = (classVU)classUJ.field6313.method7915(); var6 != null; var6 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var6.field6552 == var1 && var6.field6608 == var2 && var6.field6607 * -1312025255 == 0) {
                  var4 = var6.field6610;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.method12048(var2, var1, var4, true, (byte)99);
         } else {
            byte[] var9 = var2.method11527(var1, -1142684788);
            this.method12048(var2, var1, var9, true, (byte)93);
         }
      } else {
         classVB.method11921(this.field6543, this, this.field6535 * -169317867, var1, this.field6452[var1], (byte)4, true, -571323226);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   @Override
   void vmethod611(int var1) {
      if (null != this.field6540 && null != this.field6551 && this.field6551[var1]) {
         classUS var2 = this.field6540;
         byte[] var4 = null;
         synchronized (classUJ.field6313) {
            for (classVU var6 = (classVU)classUJ.field6313.method7915(); var6 != null; var6 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var6.field6552 == var1 && var6.field6608 == var2 && var6.field6607 * -1312025255 == 0) {
                  var4 = var6.field6610;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.method12048(var2, var1, var4, true, (byte)16);
         } else {
            byte[] var9 = var2.method11527(var1, -1142684788);
            this.method12048(var2, var1, var9, true, (byte)27);
         }
      } else {
         classVB.method11921(this.field6543, this, this.field6535 * -169317867, var1, this.field6452[var1], (byte)4, true, -587411731);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;B)Z")
   @ObfuscatedName("mn")
   public static boolean method12014(classVP var0, byte var1) {
      if (var0 == null) {
         return var0.method12016(var1);
      } else {
         try {
            return 1 == var0.field6539 * 1031852869;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "vp.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   @Override
   void vmethod613(int var1) {
      if (null != this.field6540 && null != this.field6551 && this.field6551[var1]) {
         classUS var2 = this.field6540;
         byte[] var4 = null;
         synchronized (classUJ.field6313) {
            for (classVU var6 = (classVU)classUJ.field6313.method7915(); var6 != null; var6 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var6.field6552 == var1 && var6.field6608 == var2 && var6.field6607 * -1312025255 == 0) {
                  var4 = var6.field6610;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.method12048(var2, var1, var4, true, (byte)120);
         } else {
            byte[] var9 = var2.method11527(var1, -1142684788);
            this.method12048(var2, var1, var9, true, (byte)120);
         }
      } else {
         classVB.method11921(this.field6543, this, this.field6535 * -169317867, var1, this.field6452[var1], (byte)4, true, -367119212);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("lt")
   public static int method12053(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      return classYG.method13331(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method12019() {
      if (this.field6539 * 1031852869 != 1 && (!this.field6537 || 2 != 1031852869 * this.field6539)) {
         if (this.field6453 != null) {
            return 99;
         } else {
            int var1 = this.field6543.method11911(classUM.field6329.field6328 * 1060637953, -169317867 * this.field6535, -1779850424);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 100;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method12020() {
      if (this.field6539 * 1031852869 != 1 && (!this.field6537 || 2 != 1031852869 * this.field6539)) {
         if (this.field6453 != null) {
            return 99;
         } else {
            int var1 = this.field6543.method11911(classUM.field6329.field6328 * 1060637953, -169317867 * this.field6535, -1779850424);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 100;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fj")
   public void method12023(int var1) {
      classVB.method11919(this.field6543, -169317867 * this.field6535, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method12024(int var1) {
      classVB.method11919(this.field6543, -169317867 * this.field6535, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("as")
   void method12028(int var1, int var2, int var3) {
      try {
         this.field6548 = var1 * -1493060365;
         this.field6547 = var2 * 376657241;
         if (this.field6541 != null) {
            if (var3 >= -1055295741) {
               throw new IllegalStateException();
            }

            int var4 = this.field6535 * -169317867;
            classUS var5 = this.field6541;
            byte[] var7 = null;
            synchronized (classUJ.field6313) {
               for (classVU var9 = (classVU)classUJ.field6313.method7915(); var9 != null; var9 = (classVU)classNN.method7924(classUJ.field6313)) {
                  if (var9.field6552 == var4) {
                     if (var3 >= -1055295741) {
                        throw new IllegalStateException();
                     }

                     if (var9.field6608 == var5) {
                        if (var3 >= -1055295741) {
                           throw new IllegalStateException();
                        }

                        if (0 == var9.field6607 * -1312025255) {
                           var7 = var9.field6610;
                           break;
                        }
                     }
                  }
               }
            }

            if (null != var7) {
               if (var3 >= -1055295741) {
                  throw new IllegalStateException();
               }

               this.method12048(var5, var4, var7, true, (byte)48);
            } else {
               byte[] var13 = var5.method11527(var4, -1142684788);
               this.method12048(var5, var4, var13, true, (byte)23);
            }
         } else {
            classVB.method11921(
               this.field6543,
               this,
               classUM.field6329.field6328 * 1060637953,
               this.field6535 * -169317867,
               this.field6548 * 1694139451,
               (byte)0,
               true,
               -843457140
            );
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "vp.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mx")
   public int method12054() {
      return this.field6535 * -169317867;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method12015() {
      return 1 == this.field6539 * 1031852869;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   void method12027() {
      this.field6539 = 1379634970;
      this.field6447 = new int[0];
      this.field6452 = new int[0];
      this.field6446 = new int[0];
      this.field6448 = new int[0];
      this.field6456 = new int[0][];
      this.field6453 = new Object[0];
      this.field6457 = new Object[0][];
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   void method12029(int var1, int var2) {
      this.field6548 = var1 * -1493060365;
      this.field6547 = var2 * 376657241;
      if (this.field6541 != null) {
         int var3 = this.field6535 * -169317867;
         classUS var4 = this.field6541;
         byte[] var6 = null;
         synchronized (classUJ.field6313) {
            for (classVU var8 = (classVU)classUJ.field6313.method7915(); var8 != null; var8 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var8.field6552 == var3 && var8.field6608 == var4 && 0 == var8.field6607 * -1312025255) {
                  var6 = var8.field6610;
                  break;
               }
            }
         }

         if (null != var6) {
            this.method12048(var4, var3, var6, true, (byte)106);
         } else {
            byte[] var11 = var4.method11527(var3, -1142684788);
            this.method12048(var4, var3, var11, true, (byte)11);
         }
      } else {
         classVB.method11921(
            this.field6543,
            this,
            classUM.field6329.field6328 * 1060637953,
            this.field6535 * -169317867,
            this.field6548 * 1694139451,
            (byte)0,
            true,
            -1028318273
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public void method12055(int var1) {
      method12022(this, var1, -161570027);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   void method12030(int var1, int var2) {
      this.field6548 = var1 * -1493060365;
      this.field6547 = var2 * 376657241;
      if (this.field6541 != null) {
         int var3 = this.field6535 * -169317867;
         classUS var4 = this.field6541;
         byte[] var6 = null;
         synchronized (classUJ.field6313) {
            for (classVU var8 = (classVU)classUJ.field6313.method7915(); var8 != null; var8 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var8.field6552 == var3 && var8.field6608 == var4 && 0 == var8.field6607 * -1312025255) {
                  var6 = var8.field6610;
                  break;
               }
            }
         }

         if (null != var6) {
            this.method12048(var4, var3, var6, true, (byte)90);
         } else {
            byte[] var11 = var4.method11527(var3, -1142684788);
            this.method12048(var4, var3, var11, true, (byte)11);
         }
      } else {
         classVB.method11921(
            this.field6543, this, classUM.field6329.field6328 * 1060637953, this.field6535 * -169317867, this.field6548 * 1694139451, (byte)0, true, -485351830
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bp")
   void method12031(int var1, int var2) {
      this.field6548 = var1 * -411187916;
      this.field6547 = var2 * -2113858107;
      if (this.field6541 != null) {
         int var3 = this.field6535 * 31712364;
         classUS var4 = this.field6541;
         byte[] var6 = null;
         synchronized (classUJ.field6313) {
            for (classVU var8 = (classVU)classUJ.field6313.method7915(); var8 != null; var8 = (classVU)classNN.method7924(classUJ.field6313)) {
               if (var8.field6552 == var3 && var8.field6608 == var4 && 0 == var8.field6607 * -917611729) {
                  var6 = var8.field6610;
                  break;
               }
            }
         }

         if (null != var6) {
            this.method12048(var4, var3, var6, true, (byte)31);
         } else {
            byte[] var11 = var4.method11527(var3, -1142684788);
            this.method12048(var4, var3, var11, true, (byte)73);
         }
      } else {
         classVB.method11921(
            this.field6543, this, classUM.field6329.field6328 * 1295346181, this.field6535 * -169317867, this.field6548 * 594987468, (byte)0, true, -1675479739
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(I[BZZ)V")
   @ObfuscatedName("br")
   void method12034(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (1 == this.field6539 * 1031852869) {
            throw new RuntimeException();
         }

         if (this.field6541 != null) {
            int var5 = -169317867 * this.field6535;
            classUS var6 = this.field6541;
            classVU var7 = new classVU();
            var7.field6607 = 0;
            var7.field6552 = var5;
            var7.field6610 = var2;
            var7.field6608 = var6;
            synchronized (classUJ.field6313) {
               classNN.method7900(classUJ.field6313, var7);
            }

            synchronized (classUJ.field6315) {
               if (0 == 508619279 * classUJ.field6314) {
                  classMK.field4522 = new Thread(new classUJ());
                  classMK.field4522.setDaemon(true);
                  classMK.field4522.start();
                  classMK.field4522.setPriority(5);
               }

               classUJ.field6314 = 69046312;
            }
         }

         this.method11794(var2, 1479807699);
         method12036(this, -163465794);
      } else {
         var2[var2.length - 4] = (byte)(this.field6446[var1] >> 24);
         var2[var2.length - 3] = (byte)(this.field6446[var1] >> 16);
         var2[var2.length - 2] = (byte)(this.field6446[var1] >> 8);
         var2[var2.length - 1] = (byte)this.field6446[var1];
         if (null != this.field6540) {
            classUS var17 = this.field6540;
            classVU var18 = new classVU();
            var18.field6607 = 0;
            var18.field6552 = var1;
            var18.field6610 = var2;
            var18.field6608 = var17;
            synchronized (classUJ.field6313) {
               classNN.method7900(classUJ.field6313, var18);
            }

            synchronized (classUJ.field6315) {
               if (0 == 508619279 * classUJ.field6314) {
                  classMK.field4522 = new Thread(new classUJ());
                  classMK.field4522.setDaemon(true);
                  classMK.field4522.start();
                  classMK.field4522.setPriority(5);
               }

               classUJ.field6314 = 69046312;
            }

            this.field6551[var1] = true;
         }

         if (var4) {
            this.field6453[var1] = classOQ.method8718(var2, false, 969952615);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lus;I[BZ)V")
   @ObfuscatedName("bm")
   public void method12035(classUS var1, int var2, byte[] var3, boolean var4) {
      if (var1 == this.field6541) {
         if (-1741645360 * this.field6539 == 1) {
            throw new RuntimeException();
         } else if (null == var3) {
            classVB.method11921(
               this.field6543,
               this,
               -2120889335 * classUM.field6329.field6328,
               -169317867 * this.field6535,
               1694139451 * this.field6548,
               (byte)0,
               true,
               -1272075715
            );
         } else {
            field6533.reset();
            field6533.update(var3, 0, var3.length);
            int var9 = (int)field6533.getValue();
            if (var9 != this.field6548 * -628655536) {
               classVB.method11921(
                  this.field6543,
                  this,
                  classUM.field6329.field6328 * 1060637953,
                  -169317867 * this.field6535,
                  this.field6548 * 1694139451,
                  (byte)0,
                  true,
                  -1295882108
               );
            } else {
               classXY var10 = new classXY(classMD.method7538(var3, (byte)113));
               int var7 = classXY.method13039(var10, -346779531);
               if (var7 < 5 || var7 > 7) {
                  throw new RuntimeException(var7 + "," + this.field6535 * 915858580 + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = var10.method13056((byte)1);
                  }

                  if (var8 != 723372223 * this.field6547) {
                     classVB.method11921(
                        this.field6543,
                        this,
                        -1063587421 * classUM.field6329.field6328,
                        this.field6535 * -169317867,
                        this.field6548 * 180990173,
                        (byte)0,
                        true,
                        -1653106887
                     );
                  } else {
                     this.method11794(var3, 1479807699);
                     method12036(this, 3383084);
                  }
               }
            }
         }
      } else {
         if (!var4 && 929849833 * this.field6542 == var2) {
            this.field6539 = -1765763023;
         }

         if (null != var3 && var3.length > 4) {
            field6533.reset();
            field6533.update(var3, 0, var3.length - 4);
            int var5 = (int)field6533.getValue();
            int var6 = (var3[var3.length - 1] & 255)
               + ((var3[var3.length - 2] & 1843389681) << 8)
               + ((var3[var3.length - 4] & -1767763752) << 24)
               + ((var3[var3.length - 3] & 1525934998) << 16);
            if (var5 != this.field6452[var2] || var6 != this.field6446[var2]) {
               field6533.reset();
               field6533.update(var3, 0, var3.length - 2);
               var5 = (int)field6533.getValue();
               var6 = (var3[var3.length - 1] & -755679546) + ((var3[var3.length - 2] & 1620932388) << 8);
            }

            if (this.field6452[var2] == var5 && this.field6446[var2] == var6) {
               this.field6551[var2] = true;
               if (var4) {
                  this.field6453[var2] = classOQ.method8718(var3, false, -1452292921);
               }
            } else {
               this.field6551[var2] = false;
               if (this.field6538 || var4) {
                  classVB.method11921(this.field6543, this, -169317867 * this.field6535, var2, this.field6452[var2], (byte)4, var4, -1672103699);
               }
            }
         } else {
            this.field6551[var2] = false;
            if (this.field6538 || var4) {
               classVB.method11921(this.field6543, this, this.field6535 * -1929466463, var2, this.field6452[var2], (byte)4, var4, -1944941817);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   public int method12039(int var1) {
      if (null != this.field6453[var1]) {
         return 100;
      } else {
         return this.field6551[var1] ? 100 : this.field6543.method11911(this.field6535 * -1219249535, var1, -1779850424);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lus;I[BZB)V")
   @ObfuscatedName("ac")
   public void method12048(classUS var1, int var2, byte[] var3, boolean var4, byte var5) {
      if (var1 == this.field6541) {
         if (this.field6539 * 1031852869 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            this.field6543.method11923(this, 255, this.field6535 * -169317867, this.field6548 * 1694139451, (byte)0, true);
         } else {
            int var6;
            synchronized (field6533) {
               field6533.reset();
               field6533.update(var3, 0, var3.length);
               var6 = (int)field6533.getValue();
            }

            if (var6 != this.field6548 * 1694139451) {
               this.field6543.method11923(this, 255, this.field6535 * -169317867, this.field6548 * 1694139451, (byte)0, true);
            } else {
               classXY var16 = new classXY(method12052(var3));
               int var8 = var16.method13267();
               if (var8 < 5 || var8 > 7) {
                  throw new RuntimeException(var8 + "," + this.field6535 * -169317867 + "," + var2);
               }

               int var9 = 0;
               if (var8 >= 6) {
                  var9 = var16.method13264();
               }

               if (var9 != this.field6547 * -879910167) {
                  this.field6543.method11923(this, 255, this.field6535 * -169317867, this.field6548 * 1694139451, (byte)0, true);
               } else {
                  this.method12056(var3);
                  this.method12051();
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field6542 * 929849833) {
            this.field6539 = 1 * 689817485;
         }

         if (var3 != null && var3.length > 4) {
            int var15;
            synchronized (field6533) {
               field6533.reset();
               field6533.update(var3, 0, var3.length - 4);
               var15 = (int)field6533.getValue();
            }

            int var18 = (var3[var3.length - 4] & 255) << 24
               | (var3[var3.length - 3] & 255) << 16
               | (var3[var3.length - 2] & 255) << 8
               | var3[var3.length - 1] & 255;
            if (var15 != super.field6452[var2] || var18 != super.field6446[var2]) {
               synchronized (field6533) {
                  field6533.reset();
                  field6533.update(var3, 0, var3.length - 2);
                  var15 = (int)field6533.getValue();
               }

               var18 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            }

            if (var15 == super.field6452[var2] && var18 == super.field6446[var2]) {
               this.field6551[var2] = true;
               if (var4) {
                  assert super.field6453[var2] == null;

                  super.field6453[var2] = method12050(var3, false);
               }
            } else {
               this.field6551[var2] = false;
               if (this.field6538 || var4) {
                  this.field6543.method11923(this, this.field6535 * -169317867, var2, super.field6452[var2], (byte)4, var4);
               }
            }
         } else {
            this.field6551[var2] = false;
            if (this.field6538 || var4) {
               this.field6543.method11923(this, this.field6535 * -169317867, var2, super.field6452[var2], (byte)4, var4);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   public boolean method12041(int var1) {
      return this.method11824(var1, -1637457958) != null;
   }

   public classVP(classUS var1, classUS var2, classVB var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      super(var5, var6);
      this.field6539 = 0;
      this.field6538 = false;
      this.field6542 = -1916962393;
      this.field6540 = var1;
      this.field6541 = var2;
      this.field6535 = var4 * -50391747;
      this.field6538 = var7;
      this.field6537 = var8;
      this.field6536 = var9;
      this.field6543 = var3;
      this.field6543.method11897(this, -169317867 * this.field6535, 2124696322);
      this.method12049(var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(Lvp;I)V")
   @ObfuscatedName("ig")
   public static void method12036(classVP var0, int var1) {
      if (var0 == null) {
         var0.method12037(var1);
      } else {
         try {
            var0.field6551 = new boolean[var0.field6453.length];

            for (int var2 = 0; var2 < var0.field6551.length; var2++) {
               if (var1 >= 16777215) {
                  throw new IllegalStateException();
               }

               var0.field6551[var2] = false;
            }

            if (null == var0.field6540) {
               if (var1 >= 16777215) {
                  throw new IllegalStateException();
               } else {
                  var0.field6539 = 689817485;
               }
            } else {
               var0.field6542 = -1916962393;

               for (int var12 = 0; var12 < var0.field6551.length; var12++) {
                  if (var0.field6448[var12] > 0) {
                     if (var1 >= 16777215) {
                        throw new IllegalStateException();
                     }

                     classUS var3 = var0.field6540;
                     classVU var5 = new classVU();
                     var5.field6607 = 11068137;
                     var5.field6552 = var12;
                     var5.field6608 = var3;
                     var5.field6609 = var0;
                     synchronized (classUJ.field6313) {
                        classNN.method7900(classUJ.field6313, var5);
                     }

                     synchronized (classUJ.field6315) {
                        if (0 == 508619279 * classUJ.field6314) {
                           classMK.field4522 = new Thread(new classUJ());
                           client.method2185(-1);
                           classMK.field4522.setDaemon(true);
                           classMK.field4522.start();
                           classMK.field4522.setPriority(5);
                        }

                        classUJ.field6314 = 69046312;
                     }

                     var0.field6542 = var12 * 1916962393;
                  }
               }

               if (-1 == 929849833 * var0.field6542) {
                  if (var1 >= 16777215) {
                     throw new IllegalStateException();
                  }

                  var0.field6539 = 689817485;
               }
            }
         } catch (RuntimeException var11) {
            throw classEG.method3884(var11, "vp.aa(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvp;II)V")
   @ObfuscatedName("th")
   public static void method12032(classVP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12055(var1);
      } else {
         var0.field6548 = var1 * -1493060365;
         var0.field6547 = var2 * 376657241;
         if (var0.field6541 != null) {
            int var3 = var0.field6535 * 1618452037;
            classUS var4 = var0.field6541;
            byte[] var6 = null;
            synchronized (classUJ.field6313) {
               for (classVU var8 = (classVU)classUJ.field6313.method7915(); var8 != null; var8 = (classVU)classNN.method7924(classUJ.field6313)) {
                  if (var8.field6552 == var3 && var8.field6608 == var4 && 0 == var8.field6607 * -1312025255) {
                     var6 = var8.field6610;
                     break;
                  }
               }
            }

            if (null != var6) {
               var0.method12048(var4, var3, var6, true, (byte)112);
            } else {
               byte[] var11 = var4.method11527(var3, -1142684788);
               var0.method12048(var4, var3, var11, true, (byte)6);
            }
         } else {
            classVB.method11921(
               var0.field6543,
               var0,
               classUM.field6329.field6328 * -1661953164,
               var0.field6535 * -722774945,
               var0.field6548 * -2057620979,
               (byte)0,
               true,
               -1183449495
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method12046() {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.field6453.length; var3++) {
         if (this.field6448[var3] > 0) {
            var1 += 100;
            var2 += this.method12038(var3, -1943569917);
         }
      }

      return 0 == var1 ? 100 : 100 * var2 / var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method12047() {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.field6453.length; var3++) {
         if (this.field6448[var3] > 0) {
            var1 += 100;
            var2 += this.method12038(var3, -774554380);
         }
      }

      return 0 == var1 ? -2011217011 : 756422341 * var2 / var1;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("xl")
   public void method12056(byte[] var1) {
      this.method11794(var1, 1479807699);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   public void method12025(int var1, int var2) {
      try {
         classVB.method11919(this.field6543, -169317867 * this.field6535, var1, (byte)1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aj")
   public boolean method12042(int var1, int var2) {
      try {
         boolean var10000;
         if (this.method11824(var1, -1777905122) != null) {
            if (var2 != 1100671196) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vp.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method12037(int var1) {
      try {
         this.field6551 = new boolean[this.field6453.length];

         for (int var2 = 0; var2 < this.field6551.length; var2++) {
            if (var1 >= 16777215) {
               throw new IllegalStateException();
            }

            this.field6551[var2] = false;
         }

         if (null == this.field6540) {
            if (var1 >= 16777215) {
               throw new IllegalStateException();
            } else {
               this.field6539 = 689817485;
            }
         } else {
            this.field6542 = -1916962393;

            for (int var12 = 0; var12 < this.field6551.length; var12++) {
               if (super.field6452[var12] > 0) {
                  if (var1 >= 16777215) {
                     throw new IllegalStateException();
                  }

                  classUS var3 = this.field6540;
                  classVU var5 = new classVU();
                  var5.field6607 = 11068137;
                  var5.field6552 = var12;
                  var5.field6608 = var3;
                  var5.field6609 = this;
                  synchronized (classUJ.field6313) {
                     classNN.method7900(classUJ.field6313, var5);
                  }

                  synchronized (classUJ.field6315) {
                     if (0 == 508619279 * classUJ.field6314) {
                        classMK.field4522 = new Thread(new classUJ());
                        client.method2381(-1);
                        classMK.field4522.setDaemon(true);
                        classMK.field4522.start();
                        classMK.field4522.setPriority(5);
                     }

                     classUJ.field6314 = 69046312;
                  }

                  this.field6548 = var12 * 1916962393;
               }
            }

            if (-1 == 929849833 * this.field6542) {
               if (var1 >= 16777215) {
                  throw new IllegalStateException();
               }

               this.field6539 = 689817485;
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "vp.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;II)Z")
   @ObfuscatedName("fu")
   public static boolean method12043(classVP var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method12042(var1, var1);
      } else {
         try {
            boolean var10000;
            if (var0.method11824(var1, -1777905122) != null) {
               if (var2 != 1100671196) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "vp.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   public boolean method12016(byte var1) {
      try {
         return 1 == this.field6539 * 1031852869;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "vp.az(" + ')');
      }
   }
}
