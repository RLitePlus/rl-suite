import java.util.Iterator;
import net.runelite.api.HashTable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qi")
public final class NodeHashTable implements HashTable {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("an")
   Node current;
   @ObfuscatedSignature(descriptor = "[Lvz;")
   @ObfuscatedName("at")
   Node[] buckets;
   @ObfuscatedName("av")
   int size;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("ag")
   Node currentGet;
   @ObfuscatedName("ae")
   int index = 0;

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ai")
   public Node method8927() {
      if (this.index > 0 && this.currentGet != this.buckets[this.index - 1]) {
         Node var2 = this.currentGet;
         this.currentGet = var2.previous;
         return var2;
      } else {
         while (this.index < this.size) {
            Node var1 = this.buckets[this.index++].previous;
            if (var1 != this.buckets[this.index - 1]) {
               this.currentGet = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   public NodeHashTable(int var1) {
      this.size = var1;
      this.buckets = new Node[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         Node var3 = this.buckets[var2] = new Node();
         var3.previous = var3;
         var3.next = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("ag")
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

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("an")
   public Node first() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("ap")
   public void method8920(Node var1, long var2) {
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

   @ObfuscatedSignature(descriptor = "(J)Lvz;")
   @ObfuscatedName("av")
   public Node get(long var1) {
      Node var3 = this.buckets[(int)(var1 & this.size - 1)];

      for (this.current = var3.previous; this.current != var3; this.current = this.current.previous) {
         if (this.current.key == var1) {
            Node var4 = this.current;
            this.current = this.current.previous;
            return var4;
         }
      }

      this.current = null;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;)I")
   @ObfuscatedName("qh")
   public static int method8916(NodeHashTable var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.size; var2++) {
         Node var3 = var0.buckets[var2];

         for (Node var4 = var3.previous; var4 != var3; var4 = var4.previous) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("cq")
   public void method8931(Node var1, long var2) {
      this.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("az")
   public Node method8925() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("aw")
   public void method8921(Node var1, long var2) {
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;)Lvz;")
   @ObfuscatedName("ee")
   public static Node method8928(NodeHashTable var0) {
      if (var0.index > 0 && var0.currentGet != var0.buckets[var0.index - 1]) {
         Node var2 = var0.currentGet;
         var0.currentGet = var2.previous;
         return var2;
      } else {
         while (var0.index < var0.size) {
            Node var1 = var0.buckets[var0.index++].previous;
            if (var1 != var0.buckets[var0.index - 1]) {
               var0.currentGet = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvz;")
   @ObfuscatedName("aj")
   public Node method8915(long var1) {
      Node var3 = this.buckets[(int)(var1 & this.size - 1)];

      for (this.current = var3.previous; this.current != var3; this.current = this.current.previous) {
         if (this.current.key == var1) {
            Node var4 = this.current;
            this.current = this.current.previous;
            return var4;
         }
      }

      this.current = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("ay")
   public void method8922(Node var1, long var2) {
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

   public Iterator iterator() {
      return new rl13(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvz;J)V")
   @ObfuscatedName("au")
   public void method8923(Node var1, long var2) {
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

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ac")
   public Node method8929() {
      if (this.index > 0 && this.currentGet != this.buckets[this.index - 1]) {
         Node var2 = this.currentGet;
         this.currentGet = var2.previous;
         return var2;
      } else {
         while (this.index < this.size) {
            Node var1 = this.buckets[this.index++].previous;
            if (var1 != this.buckets[this.index - 1]) {
               this.currentGet = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ad")
   public Node method8926() {
      this.index = 0;
      return this.next();
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ae")
   public Node next() {
      if (this.index > 0 && this.currentGet != this.buckets[this.index - 1]) {
         Node var2 = this.currentGet;
         this.currentGet = var2.previous;
         return var2;
      } else {
         while (this.index < this.size) {
            Node var1 = this.buckets[this.index++].previous;
            if (var1 != this.buckets[this.index - 1]) {
               this.currentGet = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqi;)I")
   @ObfuscatedName("iu")
   public static int method8917(NodeHashTable var0) {
      if (var0 == null) {
         var0.method8918();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < var0.size; var2++) {
         Node var3 = var0.buckets[var2];

         for (Node var4 = var3.previous; var4 != var3; var4 = var4.previous) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method8918() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.size; var2++) {
         Node var3 = this.buckets[var2];

         for (Node var4 = var3.next; var4 != var3; var4 = var4.next) {
            var1++;
         }
      }

      return var1;
   }
}
