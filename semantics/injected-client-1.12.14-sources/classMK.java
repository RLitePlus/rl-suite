import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mk")
public interface classMK extends Iterable {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;I)V")
   @ObfuscatedName("bf")
   static void method7440(WorldEntityCoord var0, int var1) {
      if (var0 == null) {
         var0.method6238();
      }

      var0.z = 165042067 * var1;
   }
}
