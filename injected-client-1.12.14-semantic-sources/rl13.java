import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl13")
class rl13 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("ar")
   public Node field5560;
   @ObfuscatedName("gn")
   public int field5559;

   @Override
   public boolean hasNext() {
      if (this.field5559 > 0 && this.field5558.buckets[this.field5559 - 1] != this.field5560) {
         return true;
      } else {
         for (int var1 = this.field5559; var1 < this.field5558.size; var1++) {
            Node var2 = this.field5558.buckets[var1];
            Node var3 = var2.method11658();
            if (var2 != var3) {
               return true;
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("nl")
   public Node method9539() {
      if (this.field5559 > 0 && this.field5558.buckets[this.field5559 - 1] != this.field5560) {
         Node var3 = this.field5560;
         this.field5560 = var3.method11658();
         return var3;
      } else {
         while (this.field5559 < this.field5558.size) {
            Node var1 = this.field5558.buckets[this.field5559++];
            Node var2 = var1.method11658();
            if (var1 != var2) {
               this.field5560 = var2.method11658();
               return var2;
            }
         }

         throw new NoSuchElementException();
      }
   }

   public rl13(NodeHashTable var1) {
      this.field5558 = var1;
   }
}
