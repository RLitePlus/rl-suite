import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ao")
public class classAO extends classAH {
   @ObfuscatedName("ae")
   int field245;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("az")
   classNN field246;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("af")
   classNN field247 = new classNN();
   @ObfuscatedName("ab")
   int field248;

   @ObfuscatedSignature(descriptor = "(Lvq;Lbp;)V")
   @ObfuscatedName("ai")
   void method624(classVQ var1, classBP var2) {
      while (var1 != this.field246.field4691 && ((classBP)var1).field522 <= var2.field522) {
         var1 = var1.field6554;
      }

      classNN.method7893(var2, var1);
      this.field248 = ((classBP)this.field246.field4691.field6554).field522;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("an")
   @Override
   protected classAH vmethod33() {
      return (classAH)classNN.method7924(this.field247);
   }

   @ObfuscatedSignature(descriptor = "(Lah;)V")
   @ObfuscatedName("af")
   public final synchronized void method618(classAH var1) {
      var1.vmethod398();
   }

   @ObfuscatedSignature(descriptor = "(Lbp;)V")
   @ObfuscatedName("ag")
   void method628(classBP var1) {
      var1.vmethod398();
      var1.method1169();
      classVQ var2 = this.field246.field4691.field6554;
      if (var2 == this.field246.field4691) {
         this.field248 = -1;
      } else {
         this.field248 = ((classBP)var2).field522;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("as")
   @Override
   protected classAH vmethod29() {
      return (classAH)this.field247.method7915();
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ax")
   @Override
   protected classAH vmethod35() {
      return (classAH)classNN.method7924(this.field247);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   protected int vmethod32() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("aa")
   @Override
   public final synchronized void vmethod30(int[] var1, int var2, int var3) {
      while (this.field248 >= 0) {
         if (this.field245 + var3 < this.field248) {
            this.field245 += var3;
            this.method632(var1, var2, var3);
            return;
         }

         int var4 = this.field248 - this.field245;
         this.method632(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field245 += var4;
         this.method623();
         classBP var5 = (classBP)this.field246.method7915();
         synchronized (var5) {
            int var7 = var5.method1170(this);
            if (var7 < 0) {
               var5.field522 = 0;
               this.method628(var5);
            } else {
               var5.field522 = var7;
               method626(this, var5.field6554, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method632(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ao")
   void method632(int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)this.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(this.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("am")
   @Override
   protected classAH vmethod44() {
      return (classAH)classNN.method7924(this.field247);
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ah")
   @Override
   protected classAH vmethod34() {
      return (classAH)classNN.method7924(this.field247);
   }

   @ObfuscatedSignature(descriptor = "(Lah;)V")
   @ObfuscatedName("ay")
   public final synchronized void method619(classAH var1) {
      var1.vmethod398();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method620() {
      if (this.field245 > 0) {
         for (classBP var1 = (classBP)this.field246.method7915(); var1 != null; var1 = (classBP)classNN.method7924(this.field246)) {
            var1.field522 = var1.field522 - this.field245;
         }

         this.field248 = this.field248 - this.field245;
         this.field245 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;Lbp;)V")
   @ObfuscatedName("au")
   void method625(classVQ var1, classBP var2) {
      while (var1 != this.field246.field4691 && ((classBP)var1).field522 <= var2.field522) {
         var1 = var1.field6554;
      }

      classNN.method7893(var2, var1);
      this.field248 = ((classBP)this.field246.field4691.field6554).field522;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bk")
   void method633(int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)this.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(this.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbp;)V")
   @ObfuscatedName("aw")
   void method629(classBP var1) {
      var1.vmethod398();
      var1.method1169();
      classVQ var2 = this.field246.field4691.field6554;
      if (var2 == this.field246.field4691) {
         this.field248 = -1;
      } else {
         this.field248 = ((classBP)var2).field522;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   public final synchronized void vmethod31(int var1) {
      while (this.field248 >= 0) {
         if (this.field245 + var1 < this.field248) {
            this.field245 += var1;
            this.method639(var1);
            return;
         }

         int var2 = this.field248 - this.field245;
         this.method639(var2);
         var1 -= var2;
         this.field245 += var2;
         this.method623();
         classBP var3 = (classBP)this.field246.method7915();
         synchronized (var3) {
            int var5 = var3.method1170(this);
            if (var5 < 0) {
               var3.field522 = 0;
               this.method628(var3);
            } else {
               var3.field522 = var5;
               method626(this, var3.field6554, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.method639(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;Lbp;)V")
   @ObfuscatedName("ud")
   public static void method630(classAO var0, classBP var1) {
      if (var0 == null) {
         var0.vmethod27();
      }

      var1.vmethod398();
      var1.method1169();
      classVQ var2 = var0.field246.field4691.field6554;
      if (var2 == var0.field246.field4691) {
         var0.field248 = -1;
      } else {
         var0.field248 = ((classBP)var2).field522;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;)V")
   @ObfuscatedName("fc")
   public static void method621(classAO var0) {
      if (var0.field245 > 0) {
         for (classBP var1 = (classBP)var0.field246.method7915(); var1 != null; var1 = (classBP)classNN.method7924(var0.field246)) {
            var1.field522 = var1.field522 - var0.field245;
         }

         var0.field248 = var0.field248 - var0.field245;
         var0.field245 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lao;Lvq;Lbp;)V")
   @ObfuscatedName("hq")
   public static void method626(classAO var0, classVQ var1, classBP var2) {
      if (var0 == null) {
         var0.method627(var1, var2);
      }

      while (var1 != var0.field246.field4691 && ((classBP)var1).field522 <= var2.field522) {
         var1 = var1.field6554;
      }

      classNN.method7893(var2, var1);
      var0.field248 = ((classBP)var0.field246.field4691.field6554).field522;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("av")
   @Override
   protected classAH vmethod43() {
      return (classAH)this.field247.method7915();
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("at")
   @Override
   protected classAH vmethod27() {
      return (classAH)this.field247.method7915();
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bx")
   @Override
   public final synchronized void vmethod36(int[] var1, int var2, int var3) {
      while (this.field248 >= 0) {
         if (this.field245 + var3 < this.field248) {
            this.field245 += var3;
            this.method632(var1, var2, var3);
            return;
         }

         int var4 = this.field248 - this.field245;
         this.method632(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field245 += var4;
         this.method623();
         classBP var5 = (classBP)this.field246.method7915();
         synchronized (var5) {
            int var7 = var5.method1170(this);
            if (var7 < 0) {
               var5.field522 = 0;
               this.method628(var5);
            } else {
               var5.field522 = var7;
               method626(this, var5.field6554, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method632(var1, var2, var3);
   }

   public classAO() {
      this.field246 = new classNN();
      this.field245 = 0;
      this.field248 = -1;
   }

   @ObfuscatedSignature(descriptor = "(Lah;)V")
   @ObfuscatedName("sk")
   public void method643(classAH var1) {
      this.method617(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   @Override
   protected int vmethod28() {
      return 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;[III)V")
   @ObfuscatedName("zd")
   public static void method634(classAO var0, int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)var0.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(var0.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("br")
   @Override
   public final synchronized void vmethod39(int[] var1, int var2, int var3) {
      while (this.field248 >= 0) {
         if (this.field245 + var3 < this.field248) {
            this.field245 += var3;
            this.method632(var1, var2, var3);
            return;
         }

         int var4 = this.field248 - this.field245;
         this.method632(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field245 += var4;
         this.method623();
         classBP var5 = (classBP)this.field246.method7915();
         synchronized (var5) {
            int var7 = var5.method1170(this);
            if (var7 < 0) {
               var5.field522 = 0;
               this.method628(var5);
            } else {
               var5.field522 = var7;
               method626(this, var5.field6554, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method632(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bc")
   @Override
   public final synchronized void vmethod37(int[] var1, int var2, int var3) {
      while (this.field248 >= 0) {
         if (this.field245 + var3 < this.field248) {
            this.field245 += var3;
            this.method632(var1, var2, var3);
            return;
         }

         int var4 = this.field248 - this.field245;
         this.method632(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field245 += var4;
         this.method623();
         classBP var5 = (classBP)this.field246.method7915();
         synchronized (var5) {
            int var7 = var5.method1170(this);
            if (var7 < 0) {
               var5.field522 = 0;
               this.method628(var5);
            } else {
               var5.field522 = var7;
               method626(this, var5.field6554, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method632(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   @Override
   public final synchronized void vmethod38(int[] var1, int var2, int var3) {
      while (this.field248 >= 0) {
         if (this.field245 + var3 < this.field248) {
            this.field245 += var3;
            this.method632(var1, var2, var3);
            return;
         }

         int var4 = this.field248 - this.field245;
         this.method632(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field245 += var4;
         this.method623();
         classBP var5 = (classBP)this.field246.method7915();
         synchronized (var5) {
            int var7 = var5.method1170(this);
            if (var7 < 0) {
               var5.field522 = 0;
               this.method628(var5);
            } else {
               var5.field522 = var7;
               method626(this, var5.field6554, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method632(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method639(int var1) {
      for (classAH var2 = (classAH)this.field247.method7915(); var2 != null; var2 = (classAH)classNN.method7924(this.field247)) {
         var2.vmethod31(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bm")
   void method635(int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)this.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(this.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lah;)V")
   @ObfuscatedName("az")
   public final synchronized void method617(classAH var1) {
      this.field247.method7902(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("pg")
   public static void method638(classUL var0) {
      if (var0 == null) {
         var0.method11398();
      }

      var0.field6327 = 0.0F;
      var0.field6326 = 0.0F;
      var0.field6325 = 0.0F;
      var0.field6324 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()Lnn;")
   @ObfuscatedName("rr")
   public classNN method644() {
      return this.field247;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bg")
   void method636(int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)this.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(this.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bj")
   void method637(int[] var1, int var2, int var3) {
      for (classAH var4 = (classAH)this.field247.method7915(); var4 != null; var4 = (classAH)classNN.method7924(this.field247)) {
         classAH.method364(var4, var1, var2, var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;Lbp;)V")
   @ObfuscatedName("ge")
   public static void method631(classAO var0, classBP var1) {
      if (var0 == null) {
         var0.method644();
      }

      var1.vmethod398();
      var1.method1169();
      classVQ var2 = var0.field246.field4691.field6554;
      if (var2 == var0.field246.field4691) {
         var0.field248 = -1;
      } else {
         var0.field248 = ((classBP)var2).field522;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;)V")
   @ObfuscatedName("yq")
   public static void method622(classAO var0) {
      if (var0.field245 > 0) {
         for (classBP var1 = (classBP)var0.field246.method7915(); var1 != null; var1 = (classBP)classNN.method7924(var0.field246)) {
            var1.field522 = var1.field522 - var0.field245;
         }

         var0.field248 = var0.field248 - var0.field245;
         var0.field245 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   @Override
   public final synchronized void vmethod41(int var1) {
      while (this.field248 >= 0) {
         if (this.field245 + var1 < this.field248) {
            this.field245 += var1;
            this.method639(var1);
            return;
         }

         int var2 = this.field248 - this.field245;
         this.method639(var2);
         var1 -= var2;
         this.field245 += var2;
         this.method623();
         classBP var3 = (classBP)this.field246.method7915();
         synchronized (var3) {
            int var5 = var3.method1170(this);
            if (var5 < 0) {
               var3.field522 = 0;
               this.method628(var3);
            } else {
               var3.field522 = var5;
               method626(this, var3.field6554, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.method639(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   @Override
   public final synchronized void vmethod40(int var1) {
      while (this.field248 >= 0) {
         if (this.field245 + var1 < this.field248) {
            this.field245 += var1;
            this.method639(var1);
            return;
         }

         int var2 = this.field248 - this.field245;
         this.method639(var2);
         var1 -= var2;
         this.field245 += var2;
         this.method623();
         classBP var3 = (classBP)this.field246.method7915();
         synchronized (var3) {
            int var5 = var3.method1170(this);
            if (var5 < 0) {
               var3.field522 = 0;
               this.method628(var3);
            } else {
               var3.field522 = var5;
               method626(this, var3.field6554, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.method639(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;I)V")
   @ObfuscatedName("wn")
   public static void method640(classAO var0, int var1) {
      if (var0 == null) {
         var0.method642(var1);
      }

      for (classAH var2 = (classAH)var0.field247.method7915(); var2 != null; var2 = (classAH)classNN.method7924(var0.field247)) {
         var2.vmethod31(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   void method623() {
      if (this.field245 > 0) {
         for (classBP var1 = (classBP)this.field246.method7915(); var1 != null; var1 = (classBP)classNN.method7924(this.field246)) {
            var1.field522 = var1.field522 - this.field245;
         }

         this.field248 = this.field248 - this.field245;
         this.field245 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   @Override
   public final synchronized void vmethod42(int var1) {
      while (this.field248 >= 0) {
         if (this.field245 + var1 < this.field248) {
            this.field245 += var1;
            this.method639(var1);
            return;
         }

         int var2 = this.field248 - this.field245;
         this.method639(var2);
         var1 -= var2;
         this.field245 += var2;
         this.method623();
         classBP var3 = (classBP)this.field246.method7915();
         synchronized (var3) {
            int var5 = var3.method1170(this);
            if (var5 < 0) {
               var3.field522 = 0;
               this.method628(var3);
            } else {
               var3.field522 = var5;
               method626(this, var3.field6554, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.method639(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   void method641(int var1) {
      for (classAH var2 = (classAH)this.field247.method7915(); var2 != null; var2 = (classAH)classNN.method7924(this.field247)) {
         var2.vmethod31(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;Lbp;)V")
   @ObfuscatedName("ab")
   void method627(classVQ var1, classBP var2) {
      while (var1 != this.field246.field4691 && ((classBP)var1).field522 <= var2.field522) {
         var1 = var1.field6553;
      }

      classNN.method7894(var2, var1);
      this.field248 = ((classBP)this.field247.field4691.field6554).field522;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   void method642(int var1) {
      for (classAH var2 = (classAH)this.field247.method7908(); var2 != null; var2 = (classAH)classNN.method7924(this.field246)) {
         var2.vmethod40(var1);
      }
   }
}
