import java.util.Collections;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("un")
public interface classUN {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwb;)Ljava/util/Iterator;")
   @ObfuscatedName("lx")
   static Iterator method11196(classWB var0) {
      return null == var0.field6353 ? Collections.emptyList().iterator() : var0.field6353.values().iterator();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;I)V")
   @ObfuscatedName("ot")
   static void method11197(AnimationSequence var0, int var1) {
      if (var0 == null) {
         var0.method10324();
      }

      var0.loopCount = 1045711611 * var1;
   }
}
