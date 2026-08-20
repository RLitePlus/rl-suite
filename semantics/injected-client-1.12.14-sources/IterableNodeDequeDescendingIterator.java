import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rg")
public class IterableNodeDequeDescendingIterator implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("ag")
   Node field5520 = null;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("av")
   IterableNodeDeque deque;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("at")
   Node field5522;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrg;)Z")
   @ObfuscatedName("qc")
   public static boolean method9450(IterableNodeDequeDescendingIterator var0) {
      if (var0 == null) {
         var0.method9453();
      }

      return var0.field5522 != var0.deque.sentinel && var0.field5522 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9451() {
      return this.field5522 != this.deque.sentinel && this.field5522 != null;
   }

   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("aj")
   void method9439(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
      class62.method2629(this, var1);
   }

   @Override
   public Object next() {
      Node var1 = this.field5522;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field5522 = null;
      } else {
         this.field5522 = var1.previous;
      }

      this.field5520 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("ae")
   void method9440(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @Override
   public void remove() {
      if (this.field5520 == null) {
         throw new IllegalStateException();
      } else {
         this.field5520.remove();
         this.field5520 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method9454() {
      if (this.field5520 == null) {
         throw new IllegalStateException();
      } else {
         this.field5520.remove();
         this.field5520 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method9447() {
      Node var1 = this.field5522;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field5522 = null;
      } else {
         this.field5522 = var1.previous;
      }

      this.field5520 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("au")
   public Object method9448() {
      Node var1 = this.field5522;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field5522 = null;
      } else {
         this.field5522 = var1.previous;
      }

      this.field5520 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method9452() {
      return this.field5522 != this.deque.sentinel && this.field5522 != null;
   }

   @Override
   public boolean hasNext() {
      return this.field5522 != this.deque.sentinel && this.field5522 != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9455() {
      if (this.field5520 == null) {
         throw new IllegalStateException();
      } else {
         this.field5520.remove();
         this.field5520 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void start() {
      this.field5522 = this.deque != null ? this.deque.sentinel.previous : null;
      this.field5520 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method9456() {
      if (this.field5520 == null) {
         throw new IllegalStateException();
      } else {
         this.field5520.remove();
         this.field5520 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("an")
   void method9441(IterableNodeDeque var1) {
      this.deque = var1;
      this.start();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void method9444() {
      this.field5522 = this.deque != null ? this.deque.sentinel.previous : null;
      this.field5520 = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method9449() {
      Node var1 = this.field5522;
      if (var1 == this.deque.sentinel) {
         var1 = null;
         this.field5522 = null;
      } else {
         this.field5522 = var1.previous;
      }

      this.field5520 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method9445() {
      this.field5522 = this.deque != null ? this.deque.sentinel.previous : null;
      this.field5520 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method9446() {
      this.field5522 = this.deque != null ? this.deque.sentinel.previous : null;
      this.field5520 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method9453() {
      return this.field5522 != this.deque.sentinel && this.field5520 != null;
   }

   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("av")
   void setDeque(IterableNodeDeque var1) {
      this.deque = var1;
      this.method9444();
   }
}
