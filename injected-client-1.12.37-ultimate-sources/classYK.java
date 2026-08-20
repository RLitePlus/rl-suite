import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yk")
public final class classYK implements Iterable, IndexedObjectSet {
   @ObfuscatedSignature(descriptor = "[Lvo;")
   @ObfuscatedName("ae")
   classVO[] field6996;
   @ObfuscatedSignature(descriptor = "Lyu;")
   @ObfuscatedName("az")
   final classYU field6995;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("ab")
   classVO field6998;
   @ObfuscatedName("af")
   int field6997;

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("as")
   public void method13390(classVO var1, long var2) {
      if (var1.field6531 != null) {
         var1.method12005();
      }

      classVO var4 = this.field6996[(int)(var2 & this.field6997 - 1)];
      var1.field6531 = var4.field6531;
      var1.field6532 = var4;
      var1.field6531.field6532 = var1;
      var1.field6532.field6531 = var1;
      var1.field6530 = var2;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("az")
   public classVO method13404(long var1) {
      classVO var3 = this.field6996[(int)(var1 & this.field6997 - 1)];

      for (classVO var4 = var3.field6532; var3 != var4; var4 = var4.field6532) {
         if (var4.field6530 == var1) {
            return var4;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;)Z")
   @ObfuscatedName("rv")
   public static boolean method13398(classRJ var0) {
      return -456314879 * var0.field5675 != -1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method13399() {
      this.field6995.method13645();
      return this.field6995;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("ab")
   public classVO method13389(long var1) {
      classVO var3 = this.field6996[(int)(var1 & this.field6997 - 1)];

      for (this.field6998 = var3.field6532; this.field6998 != var3; this.field6998 = this.field6998.field6532) {
         if (this.field6998.field6530 == var1) {
            classVO var4 = this.field6998;
            this.field6998 = this.field6998.field6532;
            return var4;
         }
      }

      this.field6998 = null;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;I)V")
   @ObfuscatedName("uw")
   public static void method13402(classCY var0, int var1) {
      if (var0 == null) {
         var0.method2773(var1);
      } else {
         var0.field1340 = -296677930 * var1;
         classMW.method7732(1041414693);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyk;)V")
   @ObfuscatedName("tg")
   public static void method13395(classYK var0) {
      if (var0 == null) {
         var0.method13400();
      }

      for (int var1 = 0; var1 < var0.field6997; var1++) {
         classVO var2 = var0.field6996[var1];

         while (true) {
            classVO var3 = var2.field6532;
            if (var3 == var2) {
               break;
            }

            var3.method12005();
         }
      }

      var0.field6998 = null;
   }

   public classYK(int var1) {
      this.field6997 = var1;
      this.field6996 = new classVO[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         classVO var3 = this.field6996[var2] = new classVO();
         var3.field6532 = var3;
         var3.field6531 = var3;
      }

      this.field6995 = new classYU(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method13400() {
      this.field6995.method13645();
      return this.field6995;
   }

   @ObfuscatedSignature(descriptor = "(Lyi;)Lvq;")
   @ObfuscatedName("fe")
   public static classVQ method13401(classYI var0) {
      if (var0 == null) {
         var0.method13379();
      }

      if (var0.field6988 > 0 && var0.field6989 != var0.field6986[var0.field6988 - 1]) {
         classVQ var2 = var0.field6989;
         var0.field6989 = var2.field6554;
         return var2;
      } else {
         while (var0.field6988 < var0.field6987) {
            classVQ var1 = var0.field6986[var0.field6988++].field6554;
            if (var1 != var0.field6986[var0.field6988 - 1]) {
               var0.field6989 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("ag")
   public void method13391(classVO var1, long var2) {
      if (var1.field6531 != null) {
         var1.method12005();
      }

      classVO var4 = this.field6996[(int)(var2 & this.field6997 - 1)];
      var1.field6531 = var4.field6531;
      var1.field6532 = var4;
      var1.field6531.field6532 = var1;
      var1.field6532.field6531 = var1;
      var1.field6530 = var2;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("je")
   public classVO method13405(long var1) {
      return this.method13404(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lyk;Lvo;J)V")
   @ObfuscatedName("nr")
   public static void method13392(classYK var0, classVO var1, long var2) {
      if (var0 == null) {
         var0.method13394(var1, var2);
      } else {
         if (var1.field6531 != null) {
            var1.method12005();
         }

         classVO var4 = var0.field6996[(int)(var2 & var0.field6997 - 1)];
         var1.field6531 = var4.field6531;
         var1.field6532 = var4;
         var1.field6531.field6532 = var1;
         var1.field6532.field6531 = var1;
         var1.field6530 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method13396() {
      for (int var1 = 0; var1 < this.field6997; var1++) {
         classVO var2 = this.field6996[var1];

         while (true) {
            classVO var3 = var2.field6532;
            if (var3 == var2) {
               break;
            }

            var3.method12005();
         }
      }

      this.field6998 = null;
   }

   @Override
   public Iterator iterator() {
      return new classYU(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("ax")
   public void method13393(classVO var1, long var2) {
      if (var1.field6531 != null) {
         var1.method12005();
      }

      classVO var4 = this.field6996[(int)(var2 & this.field6997 - 1)];
      var1.field6531 = var4.field6531;
      var1.field6532 = var4;
      var1.field6531.field6532 = var1;
      var1.field6532.field6531 = var1;
      var1.field6530 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvo;")
   @ObfuscatedName("fd")
   public classVO method13403(int var1) {
      return this.method13405(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public void method13397() {
      for (int var1 = 0; var1 < this.field6997; var1++) {
         classVO var2 = this.field6996[var1];

         while (true) {
            classVO var3 = var2.field6532;
            if (var3 == var2) {
               break;
            }

            var3.method12005();
         }
      }

      this.field6998 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("af")
   public void method13394(classVO var1, long var2) {
      if (var1.field6531 != null) {
         var1.method12005();
      }

      classVO var4 = this.field6996[(int)(var2 & this.field6997 - 1)];
      var1.field6532 = var4.field6531;
      var1.field6531 = var4;
      var1.field6532.field6531 = var1;
      var1.field6532.field6532 = var1;
      var1.field6530 = var2;
   }
}
