import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl18")
class rl18 implements Comparator {
   @ObfuscatedSignature(descriptor = "(Lrl17;Lrl17;)I")
   @ObfuscatedName("rw")
   public int method10056(rl17 var1, rl17 var2) {
      return Integer.compare(this.method10055(var1), this.method10055(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lrl17;)I")
   @ObfuscatedName("pc")
   public int method10055(rl17 var1) {
      int var2 = var1.field5707 * 8 + 4 - this.field5714.field2147 << 7;
      int var3 = var1.field5710 * 8 + 4 - this.field5714.field2147 << 7;
      return (var2 - this.field5714.field2118) * (var2 - this.field5714.field2118) + (var3 - this.field5714.field2116) * (var3 - this.field5714.field2116);
   }

   public rl18(classEZ var1) {
      this.field5714 = var1;
   }
}
