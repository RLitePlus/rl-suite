import java.util.Iterator;
import net.runelite.api.IterableHashTable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ql")
public final class IterableNodeHashTable implements Iterable, IterableHashTable, net.runelite.api.IndexedObjectSet {
   @ObfuscatedName("ae")
   int index = 0;
   @ObfuscatedSignature(descriptor = "[Lvz;")
   @ObfuscatedName("at")
   Node[] buckets;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("ag")
   Node currentGet;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("an")
   Node current;
   @ObfuscatedName("av")
   int size;

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("at")
   public void put(Node var1, long var2) {
      if (var1.next != null) {
         var1.remove();
      }

      Node var4 = this.buckets[(int)(var2 & this.size - 1)];
      var1.next = var4.next;
      var1.previous = var4;
      var1.next.previous = var1;
      var1.previous.next = var1;
      var1.key = var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method8952() {
      return new IterableNodeHashTableIterator(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;)Ljava/util/Iterator;")
   @ObfuscatedName("wd")
   public static Iterator method8953(IterableNodeHashTable var0) {
      if (var0 == null) {
         var0.method8949();
      }

      return new IterableNodeHashTableIterator(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;J)Lvz;")
   @ObfuscatedName("by")
   public static Node method8940(IterableNodeHashTable var0, long var1) {
      Node var3 = var0.buckets[(int)(var1 & var0.size - 1)];

      for (var0.currentGet = var3.previous; var0.currentGet != var3; var0.currentGet = var0.currentGet.previous) {
         if (var0.currentGet.key == var1) {
            Node var4 = var0.currentGet;
            var0.currentGet = var0.currentGet.previous;
            return var4;
         }
      }

      var0.currentGet = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void clear() {
      for (int var1 = 0; var1 < this.size; var1++) {
         Node var2 = this.buckets[var1];

         while (true) {
            Node var3 = var2.previous;
            if (var3 == var2) {
               break;
            }

            var3.remove();
         }
      }

      this.currentGet = null;
      this.current = null;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("an")
   public Node first() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "(I)Lvz;")
   @ObfuscatedName("pi")
   public Node method8957(int var1) {
      return class340.method7830(this, var1);
   }

   public IterableNodeHashTable(int var1) {
      this.size = var1;
      this.buckets = new Node[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         Node var3 = this.buckets[var2] = new Node();
         var3.previous = var3;
         var3.next = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ae")
   public Node next() {
      if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
         Node var2 = this.current;
         this.current = var2.previous;
         return var2;
      } else {
         while (this.index < this.size) {
            Node var1 = this.buckets[this.index++].previous;
            if (var1 != this.buckets[this.index - 1]) {
               this.current = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   @Override
   public Iterator iterator() {
      return new IterableNodeHashTableIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public Iterator method8954() {
      return new IterableNodeHashTableIterator(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("tb")
   public void method8958(Node var1, long var2) {
      this.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("au")
   public Node method8947() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("ak")
   public void method8942(Node var1, long var2) {
      if (var1.next != null) {
         var1.remove();
      }

      Node var4 = this.buckets[(int)(var2 & this.size - 1)];
      var1.next = var4.next;
      var1.previous = var4;
      var1.next.previous = var1;
      var1.previous.next = var1;
      var1.key = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("un")
   public void method8959() {
      this.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method8944() {
      for (int var1 = 0; var1 < this.size; var1++) {
         Node var2 = this.buckets[var1];

         while (true) {
            Node var3 = var2.previous;
            if (var3 == var2) {
               break;
            }

            var3.remove();
         }
      }

      this.currentGet = null;
      this.current = null;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("wy")
   public void method8956(Node var1, long var2) {
      Node var4 = class340.method7830(this, var2);
      if (var4 != null) {
         var4.method11660();
      }

      this.method8958(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method8945() {
      for (int var1 = 0; var1 < this.size; var1++) {
         Node var2 = this.buckets[var1];

         while (true) {
            Node var3 = var2.previous;
            if (var3 == var2) {
               break;
            }

            var3.remove();
         }
      }

      this.currentGet = null;
      this.current = null;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ay")
   public Node method8948() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("az")
   public Node method8949() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "(J)Lvz;")
   @ObfuscatedName("av")
   public Node get(long var1) {
      Node var3 = this.buckets[(int)(var1 & this.size - 1)];

      for (Node var4 = var3.previous; var3 != var4; var4 = var4.previous) {
         if (var4.key == var1) {
            this.currentGet = var4;
            return var4;
         }
      }

      this.currentGet = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ai")
   public Node method8951() {
      if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
         Node var2 = this.current;
         this.current = var2.previous;
         return var2;
      } else {
         while (this.index < this.size) {
            Node var1 = this.buckets[this.index++].previous;
            if (var1 != this.buckets[this.index - 1]) {
               this.current = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }
}
