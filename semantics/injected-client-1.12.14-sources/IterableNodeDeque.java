import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rm")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("at")
   Node field5674;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("av")
   Node sentinel = new Node();

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bw")
   public Object[] method9667() {
      return this.method9659();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("av")
   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
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

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("cn")
   public boolean method9688(Object var1) {
      return rl22.method9561(this, (Node)var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ae")
   public Node last() {
      return method9643(this, null);
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("br")
   public Node method9646() {
      Node var1 = this.field5674;
      if (var1 == this.sentinel) {
         this.field5674 = null;
         return null;
      } else {
         this.field5674 = var1.previous;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Ljava/util/Collection;)Z")
   @ObfuscatedName("yw")
   public static boolean method9684(IterableNodeDeque var0, Collection var1) {
      if (var0 == null) {
         var0.retainAll(var1);
      }

      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method9649() {
      int var1 = 0;

      for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method9653() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()[Lvz;")
   @ObfuscatedName("bp")
   Node[] method9659() {
      Node[] var1 = new Node[this.method9649()];
      int var2 = 0;

      for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @Override
   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   @Override
   public int size() {
      return this.method9649();
   }

   @Override
   public boolean isEmpty() {
      return this.method9653();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;[Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("ls")
   public static Object[] method9669(IterableNodeDeque var0, Object[] var1) {
      if (var0 == null) {
         var0.hashCode();
      }

      int var2 = 0;

      for (Node var3 = var0.sentinel.previous; var3 != var0.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method9661() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   @Override
   public Object[] toArray() {
      return this.method9659();
   }

   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("dr")
   public static void method9629(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.rsClear();
      }

      while (var0.sentinel.previous != var0.sentinel) {
         var0.sentinel.previous.remove();
      }
   }

   @Override
   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)Z")
   @ObfuscatedName("lu")
   public static boolean method9654(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9657();
      }

      return var0.sentinel.previous == var0.sentinel;
   }

   @Override
   public void clear() {
      method9629(this);
   }

   @Override
   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)I")
   @ObfuscatedName("ty")
   public static int method9640(HintArrow var0) {
      if (var0 == null) {
         var0.method8751();
      }

      return 1327275491 * var0.y;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bu")
   public boolean method9664() {
      return this.method9653();
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cu")
   public boolean method9677(Collection var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean add(Object var1) {
      return rl22.method9561(this, (Node)var1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rm.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ao")
   public Node method9695() {
      return this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("be")
   public Node method9642() {
      return method9643(this, null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method9691(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Ljava/util/Collection;)Z")
   @ObfuscatedName("yd")
   public static boolean method9678(IterableNodeDeque var0, Collection var1) {
      if (var0 == null) {
         var0.method9649();
      }

      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method9692(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bf")
   public Object[] method9668() {
      return this.method9659();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Ljava/lang/Object;)Z")
   @ObfuscatedName("ah")
   public static boolean method9666(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.toArray();
      }

      throw new RuntimeException();
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("az")
   public static void method9626(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("ad")
   public static void method9627(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvz;Lvz;)V")
   @ObfuscatedName("ai")
   public static void method9628(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("bv")
   public boolean method9682(Collection var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfo;)Ljava/lang/Object;")
   @ObfuscatedName("zp")
   public static Object method9637(classFO var0) {
      if (var0 == null) {
         return var0.call();
      } else {
         classFY.method4158(var0.this$0, var0.val$p, var0.val$version, -1886821661);
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9630() {
      while (this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)I")
   @ObfuscatedName("fd")
   public static int method9694(IterableNodeDeque var0) {
      return var0 == null ? var0.method9652() : var0.hashCode();
   }

   @ObfuscatedSignature(descriptor = "(Lrm;Lvz;)Lvz;")
   @ObfuscatedName("eg")
   public static Node method9643(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         return var0.method9645(var1);
      } else {
         Node var2;
         if (var1 == null) {
            var2 = var0.sentinel.previous;
         } else {
            var2 = var1;
         }

         if (var2 == var0.sentinel) {
            var0.field5674 = null;
            return null;
         } else {
            var0.field5674 = var2.previous;
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ax")
   public void method9634(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("ar")
   public void method9635(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)V")
   @ObfuscatedName("al")
   public void method9639(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cm")
   public boolean method9679(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)Lvz;")
   @ObfuscatedName("aa")
   Node method9644(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.field5674 = null;
         return null;
      } else {
         this.field5674 = var2.previous;
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public static boolean method9673(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.method9676(var1);
      }

      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("wy")
   public Node method9647() {
      Node var1 = this.field5674;
      if (var1 == this.sentinel) {
         this.field5674 = null;
         return null;
      } else {
         this.field5674 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   int method9650() {
      int var1 = 0;

      for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public Iterator method9662() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)Z")
   @ObfuscatedName("jc")
   public static boolean method9655(IterableNodeDeque var0) {
      return var0.sentinel.previous == var0.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   public boolean method9656() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bj")
   public boolean method9657() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   int method9651() {
      int var1 = 0;

      for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[Lvz;")
   @ObfuscatedName("ay")
   Node[] method9660() {
      Node[] var1 = new Node[this.method9649()];
      int var2 = 0;

      for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("cs")
   public boolean method9689(Object var1) {
      return rl22.method9561(this, (Node)var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   public boolean method9665() {
      return this.method9653();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)Lvz;")
   @ObfuscatedName("xc")
   public static Node method9648(IterableNodeDeque var0) {
      Node var1 = var0.field5674;
      if (var1 == var0.sentinel) {
         var0.field5674 = null;
         return null;
      } else {
         var0.field5674 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)Z")
   @ObfuscatedName("br")
   boolean method9670(Node var1) {
      this.addFirst(var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bl")
   public boolean method9674(Object var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)Z")
   @ObfuscatedName("bd")
   boolean method9671(Node var1) {
      this.addFirst(var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   int method9652() {
      int var1 = 0;

      for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("ch")
   public boolean method9683(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bc")
   public boolean method9675(Object var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Ljava/lang/Object;)Z")
   @ObfuscatedName("fw")
   public static boolean method9693(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.method9647();
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cb")
   public boolean method9680(Collection var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Lvz;)V")
   @ObfuscatedName("dn")
   public static void method9636(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.method9647();
      }

      if (var1.next != null) {
         var1.remove();
      }

      var1.next = var0.sentinel.next;
      var1.previous = var0.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("bq")
   public boolean method9681(Collection var1) {
      throw new RuntimeException();
   }

   @Override
   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rm.hashCode(" + 41);
      }
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("ct")
   public boolean method9685(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("ce")
   public boolean method9686(Collection var1) {
      throw new RuntimeException();
   }

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   public void method9687() {
      method9629(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public static Iterator method9663(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9647();
      }

      return new IterableNodeDequeDescendingIterator(var0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method9631() {
      while (this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bm")
   public boolean method9658() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("co")
   public boolean method9690(Object var1) {
      return rl22.method9561(this, (Node)var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void rsClear() {
      while (this.sentinel.next != this.field5674) {
         this.field5674.previous.vmethod136();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ak")
   public Node previous() {
      return this.method9642();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)Lvz;")
   @ObfuscatedName("aj")
   Node method9645(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.next;
      } else {
         var2 = var1;
      }

      if (var2 == this.field5674) {
         this.sentinel = null;
         return null;
      } else {
         this.field5674 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;)Z")
   @ObfuscatedName("au")
   boolean method9672(Node var1) {
      this.addLast(var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bh")
   public boolean method9676(Object var1) {
      throw new RuntimeException();
   }
}
