import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl10")
class rl10 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("au")
   public Node field5556;

   @Override
   public boolean hasNext() {
      return this.field5556 != this.field5555.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("pq")
   public Node method9538() {
      if (this.field5556 == this.field5555.sentinel) {
         throw new NoSuchElementException();
      } else {
         Node var1 = this.field5556;
         this.field5556 = this.field5556.method11658();
         return var1;
      }
   }

   @Override
   public void remove() {
      Node var1 = this.field5556.method11659();
      if (var1 == this.field5555.sentinel) {
         throw new IllegalStateException();
      } else {
         var1.method11660();
      }
   }

   public rl10(NodeDeque var1) {
      this.field5555 = var1;
      this.field5556 = this.field5555.sentinel.method11658();
   }
}
