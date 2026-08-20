import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class SoftWrapper extends Wrapper {
   @ObfuscatedName("av")
   SoftReference ref;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ae")
   @Override
   Object vmethod306() {
      return this.ref.get();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   @Override
   Object get() {
      return this.ref.get();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   @Override
   boolean vmethod309() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ag")
   @Override
   Object vmethod304() {
      return this.ref.get();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("an")
   @Override
   Object vmethod305() {
      return this.ref.get();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   @Override
   boolean vmethod308() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   @Override
   boolean vmethod301() {
      return true;
   }

   SoftWrapper(Object var1, int var2) {
      super(var2);
      this.ref = new SoftReference<>(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("at")
   @Override
   boolean isSoft() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   @Override
   boolean vmethod307() {
      return true;
   }
}
