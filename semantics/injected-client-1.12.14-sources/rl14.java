import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl14")
class rl14 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvr;")
   @ObfuscatedName("vq")
   public Link field5562;

   @Override
   public boolean hasNext() {
      return this.field5562 != this.field5561.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()Ltj;")
   @ObfuscatedName("wl")
   public FriendLoginUpdate method9540() {
      if (this.field5562 == this.field5561.sentinel) {
         throw new NoSuchElementException();
      } else {
         FriendLoginUpdate var1 = (FriendLoginUpdate)this.field5562;
         this.field5562 = this.field5562.method11363();
         return var1;
      }
   }

   @Override
   public void remove() {
      Link var1 = this.field5562.method11364();
      if (var1 == this.field5561.sentinel) {
         throw new IllegalStateException();
      } else {
         var1.method11365();
      }
   }

   public rl14(LinkDeque var1) {
      this.field5561 = var1;
      this.field5562 = this.field5561.sentinel.method11363();
   }
}
