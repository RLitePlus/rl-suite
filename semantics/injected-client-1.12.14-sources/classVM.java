import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vm")
public interface classVM {
   @ObfuscatedSignature(descriptor = "(I)Lvn;")
   @ObfuscatedName("av")
   PlatformInfo get(int var1);

   @ObfuscatedSignature(descriptor = "()Lvn;")
   @ObfuscatedName("ae")
   PlatformInfo vmethod441();

   @ObfuscatedSignature(descriptor = "()Lvn;")
   @ObfuscatedName("aj")
   PlatformInfo vmethod440();
}
