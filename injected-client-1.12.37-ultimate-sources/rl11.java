import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl11")
class rl11 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("dr")
   public classVQ field5695;

   @Override
   public boolean hasNext() {
      return this.field5695 != this.field5694.field4691;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("nk")
   public classVQ method10042() {
      if (this.field5695 == this.field5694.field4691) {
         throw new NoSuchElementException();
      } else {
         classVQ var1 = this.field5695;
         this.field5695 = this.field5695.method12064();
         return var1;
      }
   }

   @Override
   public void remove() {
      classVQ var1 = this.field5695.method12063();
      if (var1 == this.field5694.field4691) {
         throw new IllegalStateException();
      } else {
         var1.method12065();
      }
   }

   public rl11(classNN var1) {
      this.field5694 = var1;
      this.field5695 = this.field5694.field4691.method12064();
   }
}
