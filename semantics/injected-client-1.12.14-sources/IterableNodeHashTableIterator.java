import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qt")
public class IterableNodeHashTableIterator implements Iterator {
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("av")
   IterableNodeHashTable hashTable;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("an")
   Node last = null;
   @ObfuscatedName("ag")
   int index;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("at")
   Node head;

   @Override
   public void remove() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("at")
   public Node method9152() {
      ArchiveDisk.method10607(this);
      return (Node)this.next();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqt;)Z")
   @ObfuscatedName("vo")
   public static boolean method9156(IterableNodeHashTableIterator var0) {
      if (var0.head != var0.hashTable.buckets[var0.index - 1]) {
         return true;
      } else {
         while (var0.index < var0.hashTable.size) {
            if (var0.hashTable.buckets[var0.index++].previous != var0.hashTable.buckets[var0.index - 1]) {
               var0.head = var0.hashTable.buckets[var0.index - 1].previous;
               return true;
            }

            var0.head = var0.hashTable.buckets[var0.index - 1];
         }

         return false;
      }
   }

   @Override
   public Object next() {
      if (this.head != this.hashTable.buckets[this.index - 1]) {
         Node var2 = this.head;
         this.head = var2.previous;
         this.last = var2;
         return var2;
      } else {
         while (this.index < this.hashTable.size) {
            Node var1 = this.hashTable.buckets[this.index++].previous;
            if (var1 != this.hashTable.buckets[this.index - 1]) {
               this.head = var1.previous;
               this.last = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.head != this.hashTable.buckets[this.index - 1]) {
         return true;
      } else {
         while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
               this.head = this.hashTable.buckets[this.index - 1].previous;
               return true;
            }

            this.head = this.hashTable.buckets[this.index - 1];
         }

         return false;
      }
   }

   public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
      this.hashTable = var1;
      ArchiveDisk.method10607(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ak")
   public Node method9153() {
      ArchiveDisk.method10607(this);
      return (Node)this.next();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method9147() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.last = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqt;)Ljava/lang/Object;")
   @ObfuscatedName("xj")
   public static Object method9154(IterableNodeHashTableIterator var0) {
      if (var0 == null) {
         var0.method9149();
      }

      if (var0.head != var0.hashTable.buckets[var0.index - 1]) {
         Node var2 = var0.head;
         var0.head = var2.previous;
         var0.last = var2;
         return var2;
      } else {
         while (var0.index < var0.hashTable.size) {
            Node var1 = var0.hashTable.buckets[var0.index++].previous;
            if (var1 != var0.hashTable.buckets[var0.index - 1]) {
               var0.head = var1.previous;
               var0.last = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method9148() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.last = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   void method9149() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.last = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;Z)V")
   @ObfuscatedName("ve")
   public static void method9162(WorldMap var0, boolean var1) {
      if (var0 == null) {
         var0.method11521(var1);
      } else {
         var0.elementsDisabled = !var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method9157() {
      if (this.head != this.hashTable.buckets[this.index - 1]) {
         return true;
      } else {
         while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
               this.head = this.hashTable.buckets[this.index - 1].previous;
               return true;
            }

            this.head = this.hashTable.buckets[this.index - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("au")
   public Object method9155() {
      if (this.head != this.hashTable.buckets[this.index - 1]) {
         Node var2 = this.head;
         this.head = var2.previous;
         this.last = var2;
         return var2;
      } else {
         while (this.index < this.hashTable.size) {
            Node var1 = this.hashTable.buckets[this.index++].previous;
            if (var1 != this.hashTable.buckets[this.index - 1]) {
               this.head = var1.previous;
               this.last = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method9150() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.last = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method9158() {
      if (this.head != this.hashTable.buckets[this.index - 1]) {
         return true;
      } else {
         while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
               this.head = this.hashTable.buckets[this.index - 1].previous;
               return true;
            }

            this.head = this.hashTable.buckets[this.index - 1];
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqt;)V")
   @ObfuscatedName("pi")
   public static void method9159(IterableNodeHashTableIterator var0) {
      if (var0.last == null) {
         throw new IllegalStateException();
      } else {
         var0.last.remove();
         var0.last = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9160() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method9161() {
      if (this.last == null) {
         throw new IllegalStateException();
      } else {
         this.last.remove();
         this.last = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void start() {
      this.head = this.hashTable.buckets[0].previous;
      this.index = 1;
      this.head = null;
   }
}
