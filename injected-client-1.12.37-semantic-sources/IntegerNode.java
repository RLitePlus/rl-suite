import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vg")
public class IntegerNode extends Node implements net.runelite.api.IntegerNode {
   @ObfuscatedName("az")
   public int integer;

   public int getValue() {
      return this.integer;
   }

   public void setValue(int var1) {
      this.integer = var1;
   }

   public IntegerNode(int var1) {
      this.integer = var1;
   }
}
