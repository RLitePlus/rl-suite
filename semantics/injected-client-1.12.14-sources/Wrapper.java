import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public abstract class Wrapper extends DualNode {
   @ObfuscatedName("at")
   final int size;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   abstract boolean vmethod301();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   abstract Object get();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("at")
   abstract boolean isSoft();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ag")
   abstract Object vmethod304();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("an")
   abstract Object vmethod305();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ae")
   abstract Object vmethod306();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   abstract boolean vmethod307();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   abstract boolean vmethod308();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   abstract boolean vmethod309();

   Wrapper(int var1) {
      this.size = var1;
   }
}
