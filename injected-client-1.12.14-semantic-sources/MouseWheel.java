import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public interface MouseWheel {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int vmethod25();

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   int useRotation(byte var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int vmethod26();
}
