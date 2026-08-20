import net.runelite.api.IntegerNode;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vg")
public class classVG extends classVQ implements IntegerNode {
   @ObfuscatedName("az")
   public int field6503;

   public int getValue() {
      return this.field6503;
   }

   public void setValue(int var1) {
      this.field6503 = var1;
   }

   public classVG(int var1) {
      this.field6503 = var1;
   }
}
