import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rn")
public class IterableDualNodeQueue implements Iterable {
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("at")
   DualNode head;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("av")
   public DualNode sentinel = new DualNode();

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ak")
   public DualNode previous() {
      DualNode var1 = this.sentinel.previousDual;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;Lvo;)V")
   @ObfuscatedName("av")
   public static void DualNodeDeque_addBefore(DualNode var0, DualNode var1) {
      if (var0.nextDual != null) {
         var0.removeDual();
      }

      var0.nextDual = var1;
      var0.previousDual = var1.previousDual;
      var0.nextDual.previousDual = var0;
      var0.previousDual.nextDual = var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void clear() {
      while (this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ax")
   public DualNode method9710() {
      return this.previousOrLast(null);
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("az")
   public void method9703(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;Lvo;)V")
   @ObfuscatedName("aw")
   public static void method9698(DualNode var0, DualNode var1) {
      if (var0.nextDual != null) {
         var0.removeDual();
      }

      var0.nextDual = var1;
      var0.previousDual = var1.previousDual;
      var0.nextDual.previousDual = var0;
      var0.previousDual.nextDual = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)Lvo;")
   @ObfuscatedName("af")
   DualNode method9715(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var2.previousDual;
         return var2;
      }
   }

   @Override
   public Iterator iterator() {
      return new IterableDualNodeQueueIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cg")
   public Iterator method9722() {
      return new IterableDualNodeQueueIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ae")
   public DualNode last() {
      DualNode var1 = this.head;
      if (var1 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var1.previousDual;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method9723() {
      return new IterableDualNodeQueueIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public Iterator method9724() {
      return new IterableDualNodeQueueIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method9700() {
      while (this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method9701() {
      while (this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;)Lvo;")
   @ObfuscatedName("gv")
   public static DualNode method9720(IterableDualNodeQueue var0) {
      if (var0 == null) {
         var0.method9724();
      }

      DualNode var1 = var0.head;
      if (var1 == var0.sentinel) {
         var0.head = null;
         return null;
      } else {
         var0.head = var1.previousDual;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ai")
   public DualNode method9707() {
      DualNode var1 = this.sentinel.previousDual;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("ad")
   public void method9704(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrn;)Lvo;")
   @ObfuscatedName("mm")
   public static DualNode method9708(IterableDualNodeQueue var0) {
      if (var0 == null) {
         var0.method9714();
      }

      DualNode var1 = var0.sentinel.previousDual;
      if (var1 == var0.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ar")
   public DualNode method9709() {
      DualNode var1 = this.sentinel.previousDual;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)Lvo;")
   @ObfuscatedName("aj")
   DualNode previousOrLast(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var2.previousDual;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("ag")
   public void add(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;Lvo;)Lvo;")
   @ObfuscatedName("ba")
   public static DualNode method9717(IterableDualNodeQueue var0, DualNode var1) {
      if (var0 == null) {
         var0.method9723();
      }

      DualNode var2;
      if (var1 == null) {
         var2 = var0.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == var0.sentinel) {
         var0.head = null;
         return null;
      } else {
         var0.head = var2.previousDual;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method9702() {
      while (this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("an")
   public DualNode removeLast() {
      return this.previousOrLast(null);
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("ua")
   public void method9725(DualNode var1) {
      this.add(var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ah")
   public DualNode method9712() {
      return this.previousOrLast(null);
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ab")
   public DualNode method9713() {
      return this.previousOrLast(null);
   }

   public IterableDualNodeQueue() {
      this.sentinel.previousDual = this.sentinel;
      this.sentinel.nextDual = this.sentinel;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;)Lvo;")
   @ObfuscatedName("nh")
   public static DualNode method9721(IterableDualNodeQueue var0) {
      DualNode var1 = var0.head;
      if (var1 == var0.sentinel) {
         var0.head = null;
         return null;
      } else {
         var0.head = var1.previousDual;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)Lvo;")
   @ObfuscatedName("am")
   DualNode method9718(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var2.previousDual;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("as")
   public DualNode method9714() {
      return this.method9718(null);
   }
}
