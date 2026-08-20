import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dj")
public class classDJ {
   @ObfuscatedSignature(descriptor = "Lyt;")
   @ObfuscatedName("ab")
   public classYT field1535;
   @ObfuscatedName("af")
   int field1521;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("ae")
   classXY field1527;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("az")
   classNV field1522 = new classNV();
   @ObfuscatedSignature(descriptor = "Lxs;")
   @ObfuscatedName("ag")
   classXS field1523;
   @ObfuscatedName("ac")
   boolean field1526;
   @ObfuscatedName("al")
   int field1529;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("as")
   classJJ field1520;
   @ObfuscatedName("aa")
   int field1524;
   @ObfuscatedName("ao")
   int field1528;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("aq")
   classJJ field1532;
   @ObfuscatedName("ax")
   int field1525;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ay")
   classJJ field1533;
   @ObfuscatedName("aj")
   int field1530;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ad")
   classJJ field1531;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("ap")
   classUK field1534;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   final void method3364(int var1) throws IOException {
      try {
         if (this.field1534 != null) {
            if (var1 != 740672100) {
               throw new IllegalStateException();
            }

            if (this.field1521 * -1528349015 > 0) {
               if (var1 != 740672100) {
                  throw new IllegalStateException();
               }

               this.field1527.field6955 = 0;

               while (true) {
                  classJL var2 = (classJL)this.field1522.method8167();
                  if (var2 == null) {
                     if (var1 != 740672100) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  if (var2.field3335 * -1886141527 > this.field1527.field6954.length - this.field1527.field6955 * 702114061) {
                     if (var1 != 740672100) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  classXY.method13007(this.field1527, var2.field3343.field6954, 0, -1886141527 * var2.field3335, (byte)119);
                  this.field1521 = this.field1521 - 150240513 * var2.field3335;
                  var2.vmethod398();
                  var2.field3343.vmethod649(-1571242264);
                  var2.method6388(-949635012);
               }

               this.field1534.vmethod597(this.field1527.field6954, 0, 702114061 * this.field1527.field6955, -1032071721);
               this.field1528 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dj.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldj;I)Luk;")
   @ObfuscatedName("qq")
   public static classUK method3383(classDJ var0, int var1) {
      if (var0 == null) {
         return var0.method3386(var1);
      } else {
         try {
            return var0.field1534;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "dj.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljl;I)V")
   @ObfuscatedName("ae")
   public final void method3367(classJL var1, int var2) {
      try {
         classNV.method8156(this.field1522, var1);
         var1.field3335 = var1.field3343.field6955 * -1142155067;
         var1.field3343.field6955 = 0;
         this.field1521 = this.field1521 + 150240513 * var1.field3335;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ab")
   void method3374(short var1) {
      try {
         if (this.field1534 != null) {
            if (var1 <= 233) {
               throw new IllegalStateException();
            }

            this.field1534.vmethod604(1271658352);
            this.field1534 = null;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljl;)V")
   @ObfuscatedName("ap")
   public final void method3368(classJL var1) {
      classNV.method8156(this.field1522, var1);
      var1.field3335 = var1.field3343.field6955 * -1142155067;
      var1.field3343.field6955 = 0;
      this.field1521 = this.field1521 + 150240513 * var1.field3335;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   void method3379() {
      this.field1534 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   final void method3358() {
      this.field1522.method8151();
      this.field1521 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   final void method3359() {
      this.field1522.method8151();
      this.field1521 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   final void method3365() throws IOException {
      if (this.field1534 != null && this.field1521 * -1528349015 > 0) {
         this.field1527.field6955 = 0;

         while (true) {
            classJL var1 = (classJL)this.field1522.method8167();
            if (var1 == null || var1.field3335 * -1886141527 > this.field1527.field6954.length - this.field1527.field6955 * 702114061) {
               this.field1534.vmethod597(this.field1527.field6954, 0, 702114061 * this.field1527.field6955, -1032071721);
               this.field1528 = 0;
               break;
            }

            classXY.method13007(this.field1527, var1.field3343.field6954, 0, -1886141527 * var1.field3335, (byte)41);
            this.field1521 = this.field1521 - 150240513 * var1.field3335;
            var1.vmethod398();
            var1.field3343.vmethod649(-1793791069);
            var1.method6388(-205629758);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljl;)V")
   @ObfuscatedName("ad")
   public final void method3369(classJL var1) {
      classNV.method8156(this.field1522, var1);
      var1.field3335 = var1.field3343.field6955 * -1340218895;
      var1.field3343.field6955 = 0;
      this.field1521 = this.field1521 + 150240513 * var1.field3335;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method3380(int var1) {
      try {
         this.field1534 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljl;)V")
   @ObfuscatedName("au")
   public final void method3370(classJL var1) {
      classNV.method8156(this.field1522, var1);
      var1.field3335 = var1.field3343.field6955 * -1142155067;
      var1.field3343.field6955 = 0;
      this.field1521 = this.field1521 + 150240513 * var1.field3335;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;Ljl;)V")
   @ObfuscatedName("ez")
   public static void method3371(classDJ var0, classJL var1) {
      classNV.method8156(var0.field1522, var1);
      var1.field3335 = var1.field3343.field6955 * -1142155067;
      var1.field3343.field6955 = 0;
      var0.field1521 = var0.field1521 + 150240513 * var1.field3335;
   }

   @ObfuscatedSignature(descriptor = "(Ljl;)V")
   @ObfuscatedName("ai")
   public final void method3372(classJL var1) {
      classNV.method8156(this.field1522, var1);
      var1.field3335 = var1.field3343.field6955 * -1142155067;
      var1.field3343.field6955 = 0;
      this.field1521 = this.field1521 + 150240513 * var1.field3335;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   final void method3366() throws IOException {
      if (this.field1534 != null && this.field1521 * -1528349015 > 0) {
         this.field1527.field6955 = 0;

         while (true) {
            classJL var1 = (classJL)this.field1522.method8167();
            if (var1 == null || var1.field3335 * -1886141527 > this.field1527.field6954.length - this.field1527.field6955 * 702114061) {
               this.field1534.vmethod597(this.field1527.field6954, 0, 702114061 * this.field1527.field6955, -1032071721);
               this.field1528 = 0;
               break;
            }

            classXY.method13007(this.field1527, var1.field3343.field6954, 0, -1886141527 * var1.field3335, (byte)47);
            this.field1521 = this.field1521 - 150240513 * var1.field3335;
            var1.vmethod398();
            var1.field3343.vmethod649(-1710805187);
            var1.method6388(-115563169);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldj;I)V")
   @ObfuscatedName("mw")
   public static void method3360(classDJ var0, int var1) {
      if (var0 == null) {
         var0.method3363(var1);
      }

      try {
         var0.field1522.method8151();
         var0.field1521 = 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void method3375() {
      if (this.field1534 != null) {
         this.field1534.vmethod604(1271658352);
         this.field1534 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void method3376() {
      if (this.field1534 != null) {
         this.field1534.vmethod604(1271658352);
         this.field1534 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   void method3381() {
      this.field1534 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   final void method3361() {
      this.field1522.method8151();
      this.field1521 = 0;
   }

   classDJ() {
      this.field1521 = 0;
      this.field1527 = new classXY(5000);
      this.field1523 = new classXS(40000);
      this.field1520 = null;
      this.field1525 = 0;
      this.field1526 = true;
      this.field1524 = 0;
      this.field1528 = 0;
      this.field1529 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   void method3382() {
      this.field1534 = null;
   }

   @ObfuscatedSignature(descriptor = "(Ldj;Luk;I)V")
   @ObfuscatedName("su")
   public static void method3387(classDJ var0, classUK var1, int var2) {
      if (var0 == null) {
         var0.method3388(var1, var2);
      } else {
         try {
            var0.field1534 = var1;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "dj.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method3377() {
      if (this.field1534 != null) {
         this.field1534.vmethod604(1271658352);
         this.field1534 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Luk;")
   @ObfuscatedName("bc")
   classUK method3384() {
      return this.field1534;
   }

   @ObfuscatedSignature(descriptor = "()Luk;")
   @ObfuscatedName("bp")
   classUK method3385() {
      return this.field1534;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("cb")
   static int method3389(int var0, classBL var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dj.cb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lpw;")
   @ObfuscatedName("af")
   public static classPW method3373(int var0, byte var1) {
      try {
         classPW var2 = (classPW)classPW.field5445.method6422(var0);
         if (null != var2) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classES.field1904.method11867(32, var0, -1028312346);
            var2 = new classPW(new classXY(var3));
            classPW.field5445.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dj.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("vo")
   public static void method3378(classDJ var0) {
      if (var0 == null) {
         var0.method3359();
      }

      if (var0.field1534 != null) {
         var0.field1534.vmethod604(1271658352);
         var0.field1534 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luk;")
   @ObfuscatedName("as")
   classUK method3386(int var1) {
      try {
         return this.field1534;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dj.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("up")
   public static void method3362(classDJ var0) {
      var0.field1522.method8151();
      var0.field1521 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Luk;I)V")
   @ObfuscatedName("ax")
   void method3388(classUK var1, int var2) {
      try {
         this.field1534 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   final void method3363(int var1) {
      try {
         this.field1522.method8152();
         this.field1525 = 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dj.az(" + ')');
      }
   }
}
