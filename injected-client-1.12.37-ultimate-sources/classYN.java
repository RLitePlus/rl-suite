import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.IterableHashTable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yn")
public final class classYN implements Iterable, IterableHashTable, IndexedObjectSet {
   @ObfuscatedSignature(descriptor = "[Lvq;")
   @ObfuscatedName("af")
   classVQ[] field7017;
   @ObfuscatedName("ag")
   int field7019 = 0;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ab")
   classVQ field7020;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ae")
   classVQ field7021;
   @ObfuscatedName("az")
   int field7018;

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("az")
   public classVQ method13595(long var1) {
      classVQ var3 = this.field7017[(int)(var1 & this.field7018 - 1)];

      for (classVQ var4 = var3.field6554; var3 != var4; var4 = var4.field6554) {
         if (var4.field6552 == var1) {
            this.field7020 = var4;
            return var4;
         }
      }

      this.field7020 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("jx")
   public classVQ method13598() {
      return method13589(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyo;Lte;Lxy;)V")
   @ObfuscatedName("jy")
   public static void method13586(classYO var0, classTE var1, classXY var2) {
      if (var0 == null) {
         var0.vmethod654(var2);
      }

      var1.method10795(var2, (byte)-21);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqb;)Ljava/lang/String;")
   @ObfuscatedName("jg")
   public static String method13568(classQB var0) {
      return var0.field5513;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ab")
   public classVQ method13587() {
      this.field7019 = 0;
      return method13589(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;J)Lvq;")
   @ObfuscatedName("ig")
   public static classVQ method13569(classYN var0, long var1) {
      classVQ var3 = var0.field7017[(int)(var1 & var0.field7018 - 1)];

      for (var0.field7020 = var3.field6554; var0.field7020 != var3; var0.field7020 = var0.field7020.field6554) {
         if (var0.field7020.field6552 == var1) {
            classVQ var4 = var0.field7020;
            var0.field7020 = var0.field7020.field6554;
            return var4;
         }
      }

      var0.field7020 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method13592() {
      return new classYA(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("af")
   public void method13574(classVQ var1, long var2) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      classVQ var4 = this.field7017[(int)(var2 & this.field7018 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @Override
   public Iterator iterator() {
      return new classYA(this);
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("oj")
   public static void method13579(classYN var0) {
      if (var0 == null) {
         var0.method13584();
      } else {
         for (int var1 = 0; var1 < var0.field7018; var1++) {
            classVQ var2 = var0.field7017[var1];

            while (true) {
               classVQ var3 = var2.field6554;
               if (var3 == var2) {
                  break;
               }

               var3.vmethod398();
            }
         }

         var0.field7020 = null;
         var0.field7021 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("uw")
   public static void method13580(classYN var0) {
      if (var0 == null) {
         var0.method13585();
      }

      for (int var1 = 0; var1 < var0.field7018; var1++) {
         classVQ var2 = var0.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.vmethod398();
         }
      }

      var0.field7020 = null;
      var0.field7021 = null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ai")
   public classVQ method13588() {
      this.field7019 = 0;
      return method13589(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("ya")
   public static void method13581(classYN var0) {
      if (var0 == null) {
         var0.method13587();
      }

      for (int var1 = 0; var1 < var0.field7018; var1++) {
         classVQ var2 = var0.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.vmethod398();
         }
      }

      var0.field7020 = null;
      var0.field7021 = null;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("as")
   public classVQ method13570(long var1) {
      classVQ var3 = this.field7017[(int)(var1 & this.field7018 - 1)];

      for (this.field7020 = var3.field6554; this.field7020 != var3; this.field7020 = this.field7020.field6554) {
         if (this.field7020.field6552 == var1) {
            classVQ var4 = this.field7020;
            this.field7020 = this.field7020.field6554;
            return var4;
         }
      }

      this.field7020 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("cb")
   public classVQ method13599() {
      return this.method13587();
   }

   public classYN(int var1) {
      this.field7018 = var1;
      this.field7017 = new classVQ[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         classVQ var3 = this.field7017[var2] = new classVQ();
         var3.field6554 = var3;
         var3.field6553 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("uy")
   public classVQ method13600(long var1) {
      return this.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("al")
   public void method13597(classVQ var1, long var2) {
      classVQ var4 = this.method13600(var2);
      if (var4 != null) {
         var4.method12065();
      }

      this.method13601(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)Lvq;")
   @ObfuscatedName("kf")
   public static classVQ method13589(classYN var0) {
      if (var0 == null) {
         var0.method13591();
      }

      if (var0.field7019 > 0 && var0.field7021 != var0.field7017[var0.field7019 - 1]) {
         classVQ var2 = var0.field7021;
         var0.field7021 = var2.field6554;
         return var2;
      } else {
         while (var0.field7019 < var0.field7018) {
            classVQ var1 = var0.field7017[var0.field7019++].field6554;
            if (var1 != var0.field7017[var0.field7019 - 1]) {
               var0.field7021 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("ax")
   public classVQ method13571(long var1) {
      classVQ var3 = this.field7017[(int)(var1 & this.field7018 - 1)];

      for (this.field7020 = var3.field6554; this.field7020 != var3; this.field7020 = this.field7020.field6554) {
         if (this.field7020.field6552 == var1) {
            classVQ var4 = this.field7020;
            this.field7020 = this.field7020.field6554;
            return var4;
         }
      }

      this.field7020 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method13593() {
      return new classYA(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("ay")
   public void method13601(classVQ var1, long var2) {
      method13576(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("aa")
   public classVQ method13572(long var1) {
      classVQ var3 = this.field7017[(int)(var1 & this.field7018 - 1)];

      for (this.field7020 = var3.field6554; this.field7020 != var3; this.field7020 = this.field7020.field6554) {
         if (this.field7020.field6552 == var1) {
            classVQ var4 = this.field7020;
            this.field7020 = this.field7020.field6554;
            return var4;
         }
      }

      this.field7020 = null;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;J)Lvq;")
   @ObfuscatedName("fy")
   public static classVQ method13573(classYN var0, long var1) {
      classVQ var3 = var0.field7017[(int)(var1 & var0.field7018 - 1)];

      for (var0.field7020 = var3.field6554; var0.field7020 != var3; var0.field7020 = var0.field7020.field6554) {
         if (var0.field7020.field6552 == var1) {
            classVQ var4 = var0.field7020;
            var0.field7020 = var0.field7020.field6554;
            return var4;
         }
      }

      var0.field7020 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("sr")
   public void method13575(classVQ var1, long var2) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      classVQ var4 = this.field7017[(int)(var2 & this.field7018 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lyn;Lvq;J)V")
   @ObfuscatedName("pe")
   public static void method13576(classYN var0, classVQ var1, long var2) {
      if (var0 == null) {
         var0.method13578(var1, var2);
      } else {
         if (var1.field6553 != null) {
            var1.vmethod398();
         }

         classVQ var4 = var0.field7017[(int)(var2 & var0.field7018 - 1)];
         var1.field6553 = var4.field6553;
         var1.field6554 = var4;
         var1.field6553.field6554 = var1;
         var1.field6554.field6553 = var1;
         var1.field6552 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("aj")
   public void method13577(classVQ var1, long var2) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      classVQ var4 = this.field7017[(int)(var2 & this.field7018 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvq;")
   @ObfuscatedName("ic")
   public classVQ method13596(int var1) {
      return this.method13600(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method13582() {
      for (int var1 = 0; var1 < this.field7018; var1++) {
         classVQ var2 = this.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.vmethod398();
         }
      }

      this.field7020 = null;
      this.field7021 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method13583() {
      for (int var1 = 0; var1 < this.field7018; var1++) {
         classVQ var2 = this.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.vmethod398();
         }
      }

      this.field7020 = null;
      this.field7021 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;)Lvq;")
   @ObfuscatedName("ce")
   public static classVQ method13590(classYN var0) {
      if (var0.field7019 > 0 && var0.field7021 != var0.field7017[var0.field7019 - 1]) {
         classVQ var2 = var0.field7021;
         var0.field7021 = var2.field6554;
         return var2;
      } else {
         while (var0.field7019 < var0.field7018) {
            classVQ var1 = var0.field7017[var0.field7019++].field6554;
            if (var1 != var0.field7017[var0.field7019 - 1]) {
               var0.field7021 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("zb")
   public void method13578(classVQ var1, long var2) {
      if (var1.field6553 != null) {
         var1.vmethod401();
      }

      classVQ var4 = this.field7017[(int)(var2 & this.field7018 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6553 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method13584() {
      for (int var1 = 0; var1 < this.field7019; var1++) {
         classVQ var2 = this.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.method12065();
         }
      }

      this.field7020 = null;
      this.field7021 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("yt")
   public void method13602() {
      method13579(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)I")
   @ObfuscatedName("fk")
   public static int method13594(classVW var0) {
      return -291548360 * var0.field6624;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ag")
   public classVQ method13591() {
      if (this.field7018 > 0 && this.field7020 != this.field7017[this.field7019 - 1]) {
         classVQ var2 = this.field7021;
         this.field7021 = var2.field6554;
         return var2;
      } else {
         while (this.field7019 < this.field7018) {
            classVQ[] var10000 = this.field7017;
            int var10001 = this.field7018;
            this.field7019 = this.field7018 + 1;
            classVQ var1 = var10000[var10001].field6554;
            if (var1 != this.field7017[this.field7018 - 1]) {
               this.field7020 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method13585() {
      for (int var1 = 0; var1 < this.field7019; var1++) {
         classVQ var2 = this.field7017[var1];

         while (true) {
            classVQ var3 = var2.field6554;
            if (var3 == var2) {
               break;
            }

            var3.method12062();
         }
      }

      this.field7020 = null;
      this.field7021 = null;
   }
}
