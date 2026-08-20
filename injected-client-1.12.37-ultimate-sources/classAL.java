import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("al")
public class classAL {
   @ObfuscatedSignature(descriptor = "Lai;")
   @ObfuscatedName("ae")
   classAI field218;
   @ObfuscatedName("ax")
   int field219;
   @ObfuscatedSignature(descriptor = "[Lbg;")
   @ObfuscatedName("ag")
   final classBG[] field215 = new classBG[10];
   @ObfuscatedSignature(descriptor = "Lbt;")
   @ObfuscatedName("ab")
   static classBT field221 = new classBT();
   @ObfuscatedName("az")
   int field217;
   @ObfuscatedName("as")
   int field220;
   @ObfuscatedName("af")
   int field216;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field222 = 4;

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("ae")
   public classAJ method438(boolean var1) {
      short[] var2 = this.method455(var1);
      return new classAJ(this.field217, var2, this.field217 * this.field220 / 1000, this.field217 * this.field219 / 1000, false, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("az")
   void method430(classXY var1) {
      this.field217 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 != 0) {
            var1.field6955 -= -1095856699;
            this.field215[var2] = new classBG();
            this.field215[var2].method1069(var1);
         }
      }

      this.field220 = classXY.method13047(var1, 839590941);
      this.field219 = classXY.method13047(var1, -1608476688);
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("bn")
   final short[] method453(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.field215[var3] != null && this.field215[var3].field434 + this.field215[var3].field433 > var2) {
            var2 = this.field215[var3].field434 + this.field215[var3].field433;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field217 * var2 / 1000;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.field215[var5] != null) {
               int var6 = this.field215[var5].field434 * this.field217 / 1000;
               int var7 = this.field215[var5].field433 * this.field217 / 1000;
               int[] var8 = this.field215[var5].method1061(var6, this.field215[var5].field434, this.field217);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classEK.method3908(531362135, -1010839501, var14, (byte)-53);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classEK.method3908(-32768, 32767, var10, (byte)-92);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ab")
   public classAJ method443() {
      return this.field216 == 0 ? this.method438(false) : this.field218.method386((byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("cv")
   public classAJ method456() {
      return this.method443();
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("ag")
   public classAJ method445(boolean var1) {
      return this.field216 == 0 ? this.method438(var1) : this.field218.method386((byte)1);
   }

   classAL(classXY var1, int var2, classAI var3) {
      this.field216 = var2;
      this.field218 = var3;
      if (var2 == 0) {
         this.method430(var1);
      } else {
         if (var2 != 1) {
            throw new RuntimeException("Invalid fileId for SFX");
         }

         var3.method383(var1, 9179409);
         this.field217 = classAI.method373(var3, -1666745474);
         this.field220 = var3.method377(874508979);
         this.field219 = var3.method380(902253282);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Lal;")
   @ObfuscatedName("af")
   public static classAL method435(classVA var0, int var1, int var2) {
      classAI var3 = new classAI(field221);
      byte[] var4 = var0.method11867(var1, var2, -1447154828);
      if (var4 == null) {
         return null;
      } else {
         classXY var5 = new classXY(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = var5.method13056((byte)1);
            var3.method396(var4, 4, 873111353);
            var5.field6955 = (var6 + 4) * -1095856699;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new classXY(var4);
         }

         return new classAL(var5, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public final int method448() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.field215[var2] != null && this.field215[var2].field433 / 20 < var1) {
            var1 = this.field215[var2].field433 / 20;
         }
      }

      if (this.field220 < this.field219 && this.field220 / 20 < var1) {
         var1 = this.field220 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.field215[var3] != null) {
               this.field215[var3].field433 -= var1 * 20;
            }
         }

         if (this.field220 < this.field219) {
            this.field220 -= var1 * 20;
            this.field219 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ac")
   void method431(classXY var1) {
      this.field217 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 != 0) {
            var1.field6955 -= -1095856699;
            this.field215[var2] = new classBG();
            this.field215[var2].method1069(var1);
         }
      }

      this.field220 = classXY.method13047(var1, -196184191);
      this.field219 = classXY.method13047(var1, 1119115662);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ao")
   void method432(classXY var1) {
      this.field217 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 != 0) {
            var1.field6955 -= 1304342458;
            this.field215[var2] = new classBG();
            this.field215[var2].method1069(var1);
         }
      }

      this.field220 = classXY.method13047(var1, 1792945556);
      this.field219 = classXY.method13047(var1, -1921027467);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aa")
   void method433(classXY var1) {
      this.field217 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 != 0) {
            var1.field6955 -= -1095856699;
            this.field215[var2] = new classBG();
            this.field215[var2].method1069(var1);
         }
      }

      this.field220 = classXY.method13047(var1, -1458373146);
      this.field219 = classXY.method13047(var1, -604954218);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)Lal;")
   @ObfuscatedName("aj")
   public static classAL method436(classVA var0, int var1, int var2) {
      classAI var3 = new classAI(field221);
      byte[] var4 = var0.method11867(var1, var2, -662752425);
      if (var4 == null) {
         return null;
      } else {
         classXY var5 = new classXY(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = var5.method13056((byte)1);
            var3.method396(var4, 4, 195078996);
            var5.field6955 = (var6 + 4) * -1095856699;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new classXY(var4);
         }

         return new classAL(var5, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public final int method449() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.field215[var2] != null && this.field215[var2].field433 / 20 < var1) {
            var1 = this.field215[var2].field433 / 20;
         }
      }

      if (this.field220 < this.field219 && this.field220 / 20 < var1) {
         var1 = this.field220 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.field215[var3] != null) {
               this.field215[var3].field433 -= var1 * 20;
            }
         }

         if (this.field220 < this.field219) {
            this.field220 -= var1 * 20;
            this.field219 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("aq")
   public classAJ method439(boolean var1) {
      short[] var2 = this.method455(var1);
      return new classAJ(this.field217, var2, this.field217 * this.field220 / 771897013, this.field217 * this.field219 / -1864451097, false, var1);
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("ad")
   public classAJ method440(boolean var1) {
      short[] var2 = this.method455(var1);
      return new classAJ(this.field217, var2, this.field217 * this.field220 / -735463523, this.field217 * this.field219 / 1732546376, false, var1);
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("ap")
   public classAJ method441(boolean var1) {
      short[] var2 = this.method455(var1);
      return new classAJ(this.field217, var2, this.field217 * this.field220 / 1000, this.field217 * this.field219 / 1000, false, var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lal;Z)Laj;")
   @ObfuscatedName("ht")
   public static classAJ method446(classAL var0, boolean var1) {
      return var0.field216 == 0 ? var0.method438(var1) : var0.field218.method386((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("au")
   public classAJ method442(boolean var1) {
      short[] var2 = this.method455(var1);
      return new classAJ(this.field217, var2, this.field217 * this.field220 / 1000, this.field217 * this.field219 / 1000, false, var1);
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ar")
   public classAJ method444() {
      return this.field216 == 0 ? this.method438(false) : this.field218.method386((byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lal;)I")
   @ObfuscatedName("bg")
   public static int method450(classAL var0) {
      if (var0 == null) {
         var0.method443();
      }

      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (var0.field215[var2] != null && var0.field215[var2].field433 / 20 < var1) {
            var1 = var0.field215[var2].field433 / 20;
         }
      }

      if (var0.field220 < var0.field219 && var0.field220 / 20 < var1) {
         var1 = var0.field220 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (var0.field215[var3] != null) {
               var0.field215[var3].field433 -= var1 * 20;
            }
         }

         if (var0.field220 < var0.field219) {
            var0.field220 -= var1 * 20;
            var0.field219 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Laj;")
   @ObfuscatedName("aw")
   public classAJ method447(boolean var1) {
      return this.field216 == 0 ? this.method438(var1) : this.field218.method386((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("al")
   void method434(classXY var1) {
      this.field217 = 739213419;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 != 0) {
            var1.field6955 -= -1095856699;
            this.field215[var2] = new classBG();
            this.field215[var2].method1069(var1);
         }
      }

      this.field220 = classXY.method13047(var1, -188900414);
      this.field219 = classXY.method13047(var1, -1849689812);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public final int method451() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.field215[var2] != null && this.field215[var2].field433 / 20 < var1) {
            var1 = this.field215[var2].field433 / 20;
         }
      }

      if (this.field220 < this.field219 && this.field220 / 20 < var1) {
         var1 = this.field220 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.field215[var3] != null) {
               this.field215[var3].field433 -= var1 * 20;
            }
         }

         if (this.field220 < this.field219) {
            this.field220 -= var1 * 20;
            this.field219 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public final int method452() {
      int var1 = -1026215987;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.field215[var2] != null && this.field215[var2].field433 / 20 < var1) {
            var1 = this.field215[var2].field433 / 20;
         }
      }

      if (this.field220 < this.field219 && this.field220 / 20 < var1) {
         var1 = this.field220 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.field215[var3] != null) {
               this.field215[var3].field433 -= var1 * 20;
            }
         }

         if (this.field220 < this.field219) {
            this.field220 -= var1 * 20;
            this.field219 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lal;")
   @ObfuscatedName("ay")
   public static classAL method437(classVA var0, int var1, int var2) {
      classAI var3 = new classAI(field221);
      byte[] var4 = var0.method11867(var1, var2, -1629486041);
      if (var4 == null) {
         return null;
      } else {
         classXY var5 = new classXY(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = var5.method13056((byte)1);
            var3.method396(var4, 4, 1158755480);
            var5.field6955 = (var6 + 4) * -1095856699;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new classXY(var4);
         }

         return new classAL(var5, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("ah")
   final short[] method454(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.field215[var3] != null && this.field215[var3].field434 + this.field215[var3].field433 > var2) {
            var2 = this.field215[var3].field434 + this.field215[var3].field433;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field217 * var2 / 1000;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.field215[var5] != null) {
               int var6 = this.field215[var5].field434 * this.field217 / 1000;
               int var7 = this.field215[var5].field433 * this.field217 / -485822608;
               int[] var8 = this.field215[var5].method1061(var6, this.field215[var5].field434, this.field217);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classEK.method3908(-128, 1732323541, var14, (byte)-109);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classEK.method3908(329063659, -1581510012, var10, (byte)16);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("ax")
   final short[] method455(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.field215[var3] != null && this.field215[var3].field434 + this.field215[var3].field433 > var2) {
            var2 = this.field215[var3].field434 + this.field215[var3].field433;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field217 * var2 / 1000;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.field215[var5] != null) {
               int var6 = this.field215[var5].field434 * this.field217 / 1000;
               int var7 = this.field215[var5].field433 * this.field217 / 1000;
               int[] var8 = this.field215[var5].method1061(var6, this.field215[var5].field434, this.field217);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classEK.method3908(-128, 127, var14, (byte)-49);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classEK.method3908(-32768, 32767, var10, (byte)-121);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }
}
