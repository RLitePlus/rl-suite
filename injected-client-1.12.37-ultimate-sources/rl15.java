import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl15")
class rl15 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvm;")
   @ObfuscatedName("kn")
   public classVM field5701;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;I)Z")
   @ObfuscatedName("sv")
   public static boolean method10050(classWM var0, int var1) {
      return !var0.field6713.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "()Lrh;")
   @ObfuscatedName("ey")
   public classRH method10051() {
      if (this.field5701 == this.field5700.field4679) {
         throw new NoSuchElementException();
      } else {
         classRH var1 = (classRH)this.field5701;
         this.field5701 = this.field5701.method12002();
         return var1;
      }
   }

   @Override
   public void remove() {
      classVM var1 = this.field5701.method12000();
      if (var1 == this.field5700.field4679) {
         throw new IllegalStateException();
      } else {
         var1.method12001();
      }
   }

   @Override
   public boolean hasNext() {
      return this.field5701 != this.field5700.field4679;
   }

   public rl15(classNK var1) {
      this.field5700 = var1;
      this.field5701 = this.field5700.field4679.method12002();
   }
}
