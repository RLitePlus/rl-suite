import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sd")
public interface classSD {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhj;)V")
   @ObfuscatedName("mv")
   static void method10370(classHJ var0) {
      if (var0 == null) {
         var0.method6060();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)[S")
   @ObfuscatedName("sf")
   static short[] method10371(classPL var0) {
      return var0.field5331;
   }
}
