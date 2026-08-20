import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mo")
public interface classMO {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;I)I")
   @ObfuscatedName("rp")
   static int method7456(classVU var0, int var1) {
      if (var0 == null) {
         var0.method11607(var1);
      }

      return var0.field6306[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrg;Lrm;)V")
   @ObfuscatedName("bh")
   static void method7455(IterableNodeDequeDescendingIterator var0, IterableNodeDeque var1) {
      if (var0 == null) {
         var0.method9446();
      }

      var0.deque = var1;
      var0.start();
   }
}
