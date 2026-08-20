import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bt")
public class classBT {
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field576 = 92;
   @ObfuscatedName("af")
   int field573;
   @ObfuscatedName("az")
   int field574 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field575 = 3;
   @ObfuscatedName("ae")
   byte[] field572;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method1233() {
      int var1 = this.field572[-1863749917 * this.field574] >> this.field573 * -573840275 & 1;
      this.field573 += 75744613;
      this.field574 = this.field574 + (-573840275 * this.field573 >> 3) * -57588021;
      this.field573 = 75744613 * (this.field573 * -573840275 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int method1227(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - -573840275 * this.field573) {
         int var4 = 8 - this.field573 * -573840275;
         int var5 = (1 << var4) - 1;
         var2 += (this.field572[this.field574 * -1863749917] >> this.field573 * -573840275 & var5) << var3;
         this.field573 = 0;
         this.field574 += -57588021;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var6) << var3;
         this.field573 += 75744613 * var1;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbt;[BI)V")
   @ObfuscatedName("lv")
   public static void method1238(classBT var0, byte[] var1, int var2) {
      if (var0 == null) {
         var0.method1240(var1, var2);
      }

      var0.field572 = var1;
      var0.field574 = -57588021 * var2;
      var0.field573 = 0;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ae")
   void method1239(byte[] var1, int var2, int var3) {
      try {
         this.field572 = var1;
         this.field574 = -57588021 * var2;
         this.field573 = 0;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bt.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbt;)I")
   @ObfuscatedName("of")
   public static int method1234(classBT var0) {
      int var1 = var0.field572[-1863749917 * var0.field574] >> var0.field573 * -573840275 & 1;
      var0.field573 += 75744613;
      var0.field574 = var0.field574 + (-573840275 * var0.field573 >> 3) * -57588021;
      var0.field573 = 75744613 * (var0.field573 * -573840275 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int method1228(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - -573840275 * this.field573) {
         int var4 = 8 - this.field573 * -573840275;
         int var5 = (1 << var4) - 1;
         var2 += (this.field572[this.field574 * -1863749917] >> this.field573 * -573840275 & var5) << var3;
         this.field573 = 0;
         this.field574 += -57588021;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var6) << var3;
         this.field573 += 75744613 * var1;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lbt;I)I")
   @ObfuscatedName("kn")
   public static int method1235(classBT var0, int var1) {
      if (var0 == null) {
         var0.method1232(var1);
      }

      try {
         int var2 = var0.field572[-1863749917 * var0.field574] >> var0.field573 * -573840275 & 1;
         var0.field573 += 75744613;
         var0.field574 = var0.field574 + (-573840275 * var0.field573 >> 3) * -57588021;
         var0.field573 = 75744613 * (var0.field573 * -573840275 & 7);
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bt.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method1236() {
      int var1 = this.field572[-1863749917 * this.field574] >> this.field573 * 1246820109 & 1;
      this.field573 += 75744613;
      this.field574 = this.field574 + (-573840275 * this.field573 >> 3) * -57588021;
      this.field573 = 730965295 * (this.field573 * -1333644747 & 7);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;)Lam;")
   @ObfuscatedName("lt")
   public static classAM method1242(classWC var0) {
      return var0.field6660;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method1229(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - -573840275 * this.field573) {
         int var4 = 8 - this.field573 * -573840275;
         int var5 = (1 << var4) - 1;
         var2 += (this.field572[this.field574 * -1863749917] >> this.field573 * -573840275 & var5) << var3;
         this.field573 = 0;
         this.field574 += -57588021;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var6) << var3;
         this.field573 += 75744613 * var1;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int method1230(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - -573840275 * this.field573) {
         int var4 = 8 - this.field573 * -573840275;
         int var5 = (1 << var4) - 1;
         var2 += (this.field572[this.field574 * -1863749917] >> this.field573 * -573840275 & var5) << var3;
         this.field573 = 0;
         this.field574 += -57588021;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var6) << var3;
         this.field573 += 75744613 * var1;
      }

      return var2;
   }

   classBT() {
      this.field573 = 0;
      this.field572 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method1237() {
      int var1 = this.field572[-1863749917 * this.field574] >> this.field573 * -573840275 & 1;
      this.field573 += 75744613;
      this.field574 = this.field574 + (-573840275 * this.field573 >> 3) * -57588021;
      this.field573 = 75744613 * (this.field573 * -573840275 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   int method1231(int var1, int var2) {
      try {
         int var3 = 0;
         int var4 = 0;

         while (var1 >= 8 - -573840275 * this.field573) {
            if (var2 >= -1911617180) {
               throw new IllegalStateException();
            }

            int var5 = 8 - this.field573 * -573840275;
            int var6 = (1 << var5) - 1;
            var3 += (this.field572[this.field574 * -1863749917] >> this.field573 * -573840275 & var6) << var4;
            this.field573 = 0;
            this.field574 += -57588021;
            var4 += var5;
            var1 -= var5;
         }

         if (var1 > 0) {
            if (var2 >= -1911617180) {
               throw new IllegalStateException();
            }

            int var8 = (1 << var1) - 1;
            var3 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var8) << var4;
            this.field573 += 75744613 * var1;
         }

         return var3;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "bt.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ay")
   void method1240(byte[] var1, int var2) {
      this.field572 = var1;
      this.field574 = 1742419465 * var2;
      this.field573 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lms;)Ljava/lang/String;")
   @ObfuscatedName("yd")
   public static String method1241(classMS var0) {
      if (var0 == null) {
         var0.method7659();
      }

      return var0.field4578;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;Ldz;Ldz;IIB)I")
   @ObfuscatedName("bf")
   static int method1243(Actor var0, WorldView var1, WorldView var2, int var3, int var4, byte var5) {
      try {
         classUZ var6 = classIK.method6218(var0.field1487 * -1547553299, 0.0F, var0.field1489 * -1272026483, (byte)97);
         classUZ var7;
         if (var2.field1699 * 2140889407 != 2140889407 * var1.field1699) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            if (0 == 2140889407 * var1.field1699) {
               WorldEntity var8 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var2.field1699);
               var7 = var8.method10620(var3, var4, (byte)-47);
            } else if (2140889407 * var2.field1699 == 0) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               WorldEntity var13 = (WorldEntity)classIS.field3053.worldEntities.method13595(var1.field1699 * 2140889407);
               var7 = var13.method10621(var3, var4, (byte)6);
            } else {
               WorldEntity var14 = (WorldEntity)classIS.field3053.worldEntities.method13595(var2.field1699 * 2140889407);
               WorldEntity var9 = (WorldEntity)classIS.field3053.worldEntities.method13595(var1.field1699 * 2140889407);
               classUZ var10 = var14.method10620(var3, var4, (byte)-56);
               var7 = var9.method10621((int)var10.field6427, (int)var10.field6426, (byte)18);
               classUZ.method11727(var10, 1880953733);
            }
         } else {
            var7 = classIK.method6218(var3, 0.0F, var4, (byte)9);
         }

         int var15;
         label51: {
            var15 = -1;
            int var16 = (int)(var6.field6427 - var7.field6427);
            int var17 = (int)(var6.field6426 - var7.field6426);
            if (0 == var16) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               if (var17 == 0) {
                  break label51;
               }

               if (var5 != 1) {
                  throw new IllegalStateException();
               }
            }

            int var11 = (int)(Math.atan2(var16, var17) * 325.94932345220167) & 2047;
            var15 = var11;
         }

         classUZ.method11727(var6, 1938438973);
         classUZ.method11727(var7, 2110727963);
         return var15;
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "bt.bf(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fh")
   static void method1244(int var0) {
      try {
         int var1 = client.menu.field6797 * -1927903443 - 1;
         if (-1 != var1) {
            if (var0 <= -144383729) {
               throw new IllegalStateException();
            }

            classON.field4993 = new classBY();
            client.method2381(-1);
            classON.field4993.field606 = client.menu.field6798[var1] * 100846287;
            classON.field4993.field613 = -385576485 * client.menu.field6799[var1];
            classON.field4993.field612 = -282371447 * client.menu.menuIdentifiers[var1];
            classON.field4993.field608 = 1973962571 * client.menu.field6801[var1];
            classON.field4993.field609 = client.menu.menuArguments2[var1] * 2074062867;
            classON.field4993.field616 = client.menu.field6804[var1];
            classON.field4993.field615 = client.menu.field6805[var1];
            classON.field4993.field610 = client.menu.menuOpcodes[var1] * 829407595;
            classON.field4993.field618 = client.menu.field6807[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bt.fh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method1232(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - -573840275 * this.field573) {
         int var4 = 8 - this.field573 * -573840275;
         int var5 = (1 << var4) - 1;
         var2 += (this.field572[this.field573 * -1863749917] >> this.field574 * -573840275 & var5) << var3;
         this.field574 = 0;
         this.field573 += -57588021;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field572[-1863749917 * this.field574] >> -573840275 * this.field573 & var6) << var3;
         this.field574 += 75744613 * var1;
      }

      return var2;
   }
}
