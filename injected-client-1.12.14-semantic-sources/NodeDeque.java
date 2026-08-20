import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rt")
public class NodeDeque implements Deque {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("av")
   public Node sentinel = new Node();
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("at")
   Node current;

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ao")
   public Node method9814() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Lvz;)V")
   @ObfuscatedName("bw")
   public static void method9801(NodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.method9818();
      }

      if (var1.next != null) {
         var1.remove();
      }

      var1.next = var0.sentinel;
      var1.previous = var0.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("av")
   public static void NodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1.next;
      var0.previous = var1;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ad")
   public void method9802(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("bg")
   public Node method9820() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ml")
   public void method9826(Node var1) {
      this.addFirst(var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("mc")
   public Node method9827() {
      return this.previous();
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ae")
   public Node removeLast() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("am")
   public Node method9815() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ak")
   public Node last() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("aw")
   public Node first() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ap")
   public Node previous() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ay")
   public Node next() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("za")
   public Node method9828() {
      return this.first();
   }

   public Iterator iterator() {
      return new rl10(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("as")
   public void method9803(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("az")
   public void method9799(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ag")
   public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ai")
   public void method9804(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   public NodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "(Lrt;)V")
   @ObfuscatedName("yw")
   public void method9825(NodeDeque var1) {
      Node var2 = this.sentinel;
      Node var3 = this.current;
      this.sentinel = var1.sentinel;
      this.current = var1.current;
      var1.sentinel = var2;
      var1.current = var3;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ej")
   public Node method9829() {
      return this.removeLast();
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ab")
   public Node method9807() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrt;)Lvz;")
   @ObfuscatedName("ti")
   public static Node method9809(NodeDeque var0) {
      if (var0 == null) {
         return var0.removeFirst();
      } else {
         Node var1 = var0.sentinel.next;
         if (var1 == var0.sentinel) {
            return null;
         } else {
            var1.remove();
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("an")
   public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ar")
   public Node method9810() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ah")
   public Node method9811() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("au")
   public static void method9796(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1.next;
      var0.previous = var1;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("af")
   public Node method9812() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ax")
   public Node method9808() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("aa")
   public Node method9818() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("aq")
   public Node method9819() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ec")
   public Node method9830() {
      return this.last();
   }

   public void clear() {
      method9797(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("bo")
   public Node method9822() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrt;)V")
   @ObfuscatedName("mc")
   public static void method9797(NodeDeque var0) {
      if (var0 == null) {
         var0.method9798();
      }

      while (true) {
         Node var1 = var0.sentinel.previous;
         if (var1 == var0.sentinel) {
            var0.current = null;
            return;
         }

         var1.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("al")
   public Node method9813() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("bs")
   public Node method9824() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("aj")
   public Node removeFirst() {
      return this.method9830();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method9798() {
      while (true) {
         Node var1 = this.sentinel.next;
         if (var1 == this.sentinel) {
            this.current = null;
            return;
         }

         var1.vmethod156();
      }
   }
}
