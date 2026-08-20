import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vn")
public interface classVN {
   @ObfuscatedSignature(descriptor = "()Lvt;")
   @ObfuscatedName("ag")
   classVT vmethod624();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("lu")
   static int method12003(classPV var0) {
      return var0 == null ? var0.method9302() : var0.field5425 * -1686259781;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvt;")
   @ObfuscatedName("az")
   classVT vmethod625(int var1);
}
