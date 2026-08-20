import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rg")
public interface classRG {
   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("aen")
   classAAE vmethod257();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("jw")
   static String method9962(classQI var0, String var1) {
      return var0 == null ? var0.method9578(var1) : (String)var0.field5548.get(var1);
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("aec")
   classAAE vmethod256();

   @ObfuscatedSignature(descriptor = "(B)Laae;")
   @ObfuscatedName("iq")
   classAAE vmethod255(byte var1);
}
