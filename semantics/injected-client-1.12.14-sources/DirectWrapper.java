import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class DirectWrapper extends Wrapper {
   @ObfuscatedName("av")
   Object obj;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ae")
   @Override
   Object vmethod306() {
      return this.obj;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   @Override
   Object get() {
      return this.obj;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("at")
   @Override
   boolean isSoft() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ag")
   @Override
   Object vmethod304() {
      return this.obj;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("an")
   @Override
   Object vmethod305() {
      return this.obj;
   }

   DirectWrapper(Object var1, int var2) {
      super(var2);
      this.obj = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   @Override
   boolean vmethod301() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   @Override
   boolean vmethod308() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   @Override
   boolean vmethod309() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   @Override
   boolean vmethod307() {
      return false;
   }
}
