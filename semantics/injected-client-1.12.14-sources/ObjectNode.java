import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public class ObjectNode extends Node {
   @ObfuscatedName("av")
   public final Object obj;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("gn")
   public Object method11288() {
      return this.obj;
   }

   public ObjectNode(Object var1) {
      this.obj = var1;
   }
}
