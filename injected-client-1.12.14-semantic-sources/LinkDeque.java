import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rj")
public class LinkDeque implements Deque {
   @ObfuscatedSignature(descriptor = "Lvr;")
   @ObfuscatedName("av")
   Link sentinel = new Link();
   @ObfuscatedSignature(descriptor = "Lvr;")
   @ObfuscatedName("at")
   Link current;

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("ak")
   public Link method9473() {
      Link var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("at")
   public Link last() {
      Link var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;)Lvr;")
   @ObfuscatedName("cf")
   public static Link method9475(LinkDeque var0) {
      Link var1 = var0.sentinel.previous;
      if (var1 == var0.sentinel) {
         var0.current = null;
         return null;
      } else {
         var0.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("ag")
   public Link previous() {
      Link var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   public void clear() {
      Iterator var1 = this.iterator();

      while (var1.hasNext()) {
         var1.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvr;)V")
   @ObfuscatedName("an")
   public void method9471(Link var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltj;)V")
   @ObfuscatedName("sz")
   public void method9478(FriendLoginUpdate var1) {
      this.addFirst(var1);
   }

   public Iterator iterator() {
      return new rl14(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvr;)V")
   @ObfuscatedName("av")
   public void addFirst(Link var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("aw")
   public Link method9477() {
      Link var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   public LinkDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }
}
