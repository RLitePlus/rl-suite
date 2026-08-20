import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mi")
public interface classMI extends classMO {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;Lci;)V")
   @ObfuscatedName("vn")
   static void method7428(class46 var0, Player var1) {
      var0.field175.add(var1);
   }
}
