import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vg")
public class IntegerNode extends Node implements net.runelite.api.IntegerNode {
   @ObfuscatedName("av")
   public int integer;

   public void setValue(int var1) {
      this.integer = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("py")
   public static int method11289(WorldMapArea var0) {
      return var0.field3597 * 1716020811;
   }

   public int getValue() {
      return this.integer;
   }

   public IntegerNode(int var1) {
      this.integer = var1;
   }
}
