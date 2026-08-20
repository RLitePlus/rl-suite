import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ru")
public final class DualNodeDeque {
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("av")
   DualNode sentinel = new DualNode();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;)Lvo;")
   @ObfuscatedName("wu")
   public static DualNode method9838(DualNodeDeque var0) {
      DualNode var1 = var0.sentinel.previousDual;
      return var1 == var0.sentinel ? null : var1;
   }

   public DualNodeDeque() {
      this.sentinel.previousDual = this.sentinel;
      this.sentinel.nextDual = this.sentinel;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;Lvo;)V")
   @ObfuscatedName("ca")
   public static void method9832(DualNodeDeque var0, DualNode var1) {
      if (var0 == null) {
         var0.method9833(var1);
      }

      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = var0.sentinel.nextDual;
      var1.previousDual = var0.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lru;Lvo;)V")
   @ObfuscatedName("ew")
   public static void method9836(DualNodeDeque var0, DualNode var1) {
      if (var0 == null) {
         var0.method9837(var1);
      } else {
         if (var1.nextDual != null) {
            var1.removeDual();
         }

         var1.nextDual = var0.sentinel;
         var1.previousDual = var0.sentinel.previousDual;
         var1.nextDual.previousDual = var1;
         var1.previousDual.nextDual = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ap")
   public DualNode method9839() {
      DualNode var1 = this.sentinel.previousDual;
      return var1 == this.sentinel ? null : var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("av")
   public void method9833(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("aw")
   public DualNode method9840() {
      DualNode var1 = this.sentinel.previousDual;
      return var1 == this.sentinel ? null : var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("aj")
   public void method9834(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;)Lvo;")
   @ObfuscatedName("ia")
   public static DualNode method9841(DualNodeDeque var0) {
      DualNode var1 = var0.sentinel.previousDual;
      return var1 == var0.sentinel ? null : var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;Lvo;)V")
   @ObfuscatedName("aq")
   public static void method9835(DualNodeDeque var0, DualNode var1) {
      if (var0 == null) {
         var0.method9834(var1);
      }

      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = var0.sentinel.nextDual;
      var1.previousDual = var0.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("au")
   public DualNode method9842() {
      DualNode var1 = this.sentinel.previousDual;
      return var1 == this.sentinel ? null : var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("at")
   public void method9837(DualNode var1) {
      if (var1.nextDual != null) {
         var1.method11347();
      }

      var1.nextDual = this.sentinel;
      var1.previousDual = this.sentinel.previousDual;
      var1.nextDual.previousDual = var1;
      var1.nextDual.nextDual = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("ag")
   public DualNode removeLast() {
      DualNode var1 = this.sentinel.nextDual;
      return var1 == this.sentinel ? null : var1;
   }
}
