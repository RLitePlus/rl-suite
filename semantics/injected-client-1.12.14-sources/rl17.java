import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl17")
class rl17 implements Comparator {
   @ObfuscatedSignature(descriptor = "(Lrl16;Lrl16;)I")
   @ObfuscatedName("uf")
   public int method9545(rl16 var1, rl16 var2) {
      return Integer.compare(this.method9546(var1), this.method9546(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lrl16;)I")
   @ObfuscatedName("qs")
   public int method9546(rl16 var1) {
      int var2 = var1.field5568 * 8 + 4 - this.field5575.field3014 << 7;
      int var3 = var1.field5570 * 8 + 4 - this.field5575.field3014 << 7;
      return (var2 - this.field5575.Scene_cameraX) * (var2 - this.field5575.Scene_cameraX)
         + (var3 - this.field5575.Scene_cameraZ) * (var3 - this.field5575.Scene_cameraZ);
   }

   public rl17(Scene var1) {
      this.field5575 = var1;
   }
}
