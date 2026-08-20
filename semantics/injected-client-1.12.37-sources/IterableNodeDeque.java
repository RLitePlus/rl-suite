import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nv")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("af")
   Node field4783;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("az")
   Node field4782 = new Node();

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("cc")
   public boolean method8212(Object var1) {
      return this.method8199((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method8186() {
      return new classNW(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   public void method8151() {
      while (this.field4782.field6554 != this.field4782) {
         this.field4782.field6554.vmethod398();
      }
   }

   public IterableNodeDeque() {
      this.field4782.field6554 = this.field4782;
      this.field4782.field6553 = this.field4782;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ae")
   public void method8159(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782;
      var1.field6554 = this.field4782.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method8187() {
      return new classNW(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("av")
   public void method8160(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782;
      var1.field6554 = this.field4782.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method8179() {
      return this.field4782.field6554 == this.field4782;
   }

   @Override
   public int size() {
      return this.method8177();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cb")
   public boolean method8204(Collection var1) {
      throw new RuntimeException();
   }

   @Override
   public Object[] toArray() {
      return method8182(this);
   }

   @Override
   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for (Node var3 = this.field4782.field6554; var3 != this.field4782; var3 = var3.field6554) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)Z")
   @ObfuscatedName("aj")
   boolean method8199(Node var1) {
      method8156(this, var1);
      return true;
   }

   @Override
   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)I")
   @ObfuscatedName("lz")
   public static int method8175(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.isEmpty();
      }

      int var1 = 0;

      for (Node var2 = var0.field4782.field6554; var2 != var0.field4782; var2 = var2.field6554) {
         var1++;
      }

      return var1;
   }

   @Override
   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Lvq;)Lvq;")
   @ObfuscatedName("sl")
   public static Node method8168(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.method8222();
      }

      Node var2;
      if (var1 == null) {
         var2 = var0.field4782.field6554;
      } else {
         var2 = var1;
      }

      if (var2 == var0.field4782) {
         var0.field4783 = null;
         return null;
      } else {
         var0.field4783 = var2.field6554;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bl")
   public Object[] method8196() {
      return method8182(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/util/Collection;)Z")
   @ObfuscatedName("wd")
   public static boolean method8206(IterableNodeDeque var0, Collection var1) {
      if (var0 == null) {
         var0.method8188();
      }

      throw new RuntimeException();
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)Lvq;")
   @ObfuscatedName("dn")
   public static Node method8163(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method8166();
      }

      Node var1 = var0.field4782.field6554;
      if (var1 == var0.field4782) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @Override
   public Iterator iterator() {
      return new classNW(this);
   }

   @Override
   public void clear() {
      this.method8151();
   }

   @Override
   public boolean add(Object var1) {
      return this.method8199((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ab")
   public void method8154(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782.field6553;
      var1.field6554 = this.field4782;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method8218() {
      return super.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method8210() {
      this.method8151();
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("bh")
   public Object[] method8198(Object[] var1) {
      int var2 = 0;

      for (Node var3 = this.field4782.field6554; var3 != this.field4782; var3 = var3.field6554) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)Lvq;")
   @ObfuscatedName("qt")
   public static Node method8171(IterableNodeDeque var0) {
      Node var1 = var0.field4783;
      if (var1 == var0.field4782) {
         var0.field4783 = null;
         return null;
      } else {
         var0.field4783 = var1.field6554;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)I")
   @ObfuscatedName("sd")
   public static int method8219(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.size();
      }

      return var0.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)I")
   @ObfuscatedName("sb")
   public static int method8176(IterableNodeDeque var0) {
      int var1 = 0;

      for (Node var2 = var0.field4782.field6554; var2 != var0.field4782; var2 = var2.field6554) {
         var1++;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/lang/Object;)Z")
   @ObfuscatedName("bb")
   public static boolean method8216(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.method8226();
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method8217(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmb;Ljava/lang/Runnable;I)Lmj;")
   @ObfuscatedName("gu")
   public static Task method8185(classMB var0, Runnable var1, int var2) {
      return var0 == null ? var0.method7517(var1, var2, var2) : classMB.method7510(var0, 2, var2, 0, var1, -182770655);
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)Lvq;")
   @ObfuscatedName("vq")
   public static Node method8172(IterableNodeDeque var0) {
      if (var0 == null) {
         return var0.method8225();
      } else {
         Node var1 = var0.field4783;
         if (var1 == var0.field4782) {
            var0.field4783 = null;
            return null;
         } else {
            var0.field4783 = var1.field6554;
            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("ay")
   public static void method8147(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1;
      var0.field6554 = var1.field6554;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @Override
   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean isEmpty() {
      return this.method8179();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("as")
   public Node method8167() {
      return this.method8170(null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ck")
   public boolean method8213(Object var1) {
      return this.method8199((Node)var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)Lvq;")
   @ObfuscatedName("aw")
   public static Node method8173(IterableNodeDeque var0) {
      Node var1 = var0.field4783;
      if (var1 == var0.field4782) {
         var0.field4783 = null;
         return null;
      } else {
         var0.field4783 = var1.field6554;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("ad")
   public static void method8148(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1;
      var0.field6554 = var1.field6554;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method8152() {
      while (this.field4782.field6554 != this.field4782) {
         this.field4782.field6554.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("aw")
   public void method8155(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782.field6553;
      var1.field6554 = this.field4782;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lnv;Lvq;)V")
   @ObfuscatedName("gk")
   public static void method8156(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.method8158(var1);
      } else {
         if (var1.field6553 != null) {
            var1.vmethod398();
         }

         var1.field6553 = var0.field4782.field6553;
         var1.field6554 = var0.field4782;
         var1.field6553.field6554 = var1;
         var1.field6554.field6553 = var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("aq")
   public static void method8149(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1;
      var0.field6554 = var1.field6554;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method8177() {
      int var1 = 0;

      for (Node var2 = this.field4782.field6554; var2 != this.field4782; var2 = var2.field6554) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ar")
   public void method8161(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782;
      var1.field6554 = this.field4782.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("an")
   public void method8157(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4782.field6553;
      var1.field6554 = this.field4782;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("am")
   public Node method8164() {
      Node var1 = this.field4782.field6554;
      if (var1 == this.field4782) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ah")
   public Node method8165() {
      Node var1 = this.field4782.field6554;
      if (var1 == this.field4782) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/lang/Object;)Z")
   @ObfuscatedName("jk")
   public static boolean method8192(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.method8165();
      }

      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method8220() {
      return super.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)I")
   @ObfuscatedName("kw")
   public static int method8178(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.size();
      }

      int var1 = 0;

      for (Node var2 = var0.field4782.field6554; var2 != var0.field4782; var2 = var2.field6554) {
         var1++;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[Lvq;")
   @ObfuscatedName("bk")
   Node[] method8181() {
      Node[] var1 = new Node[this.method8177()];
      int var2 = 0;

      for (Node var3 = this.field4782.field6554; var3 != this.field4782; var3 = var3.field6554) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)Z")
   @ObfuscatedName("bz")
   boolean method8200(Node var1) {
      method8156(this, var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method8188() {
      return this.method8177();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public int method8189() {
      return this.method8177();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   public int method8190() {
      return this.method8177();
   }

   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("az")
   public static void method8150(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1;
      var0.field6554 = var1.field6554;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)Lvq;")
   @ObfuscatedName("ax")
   Node method8169(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.field4782.field6554;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4782) {
         this.field4783 = null;
         return null;
      } else {
         this.field4783 = var2.field6554;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bs")
   public boolean method8193(Object var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("sl")
   public static void method8153(IterableNodeDeque var0) {
      while (var0.field4782.field6554 != var0.field4782) {
         var0.field4782.field6554.vmethod398();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Lvq;)V")
   @ObfuscatedName("yv")
   public static void method8162(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.method8199(var1);
      }

      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = var0.field4782;
      var1.field6554 = var0.field4782.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bd")
   public boolean method8194(Object var1) {
      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/util/Collection;)Z")
   @ObfuscatedName("ns")
   public static boolean method8207(IterableNodeDeque var0, Collection var1) {
      if (var0 == null) {
         return var0.method8203(var1);
      } else {
         throw new RuntimeException();
      }
   }

   @Override
   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "nv.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bv")
   public Object[] method8197() {
      return method8182(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("cr")
   public boolean method8201(Object var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("yd")
   public Node method8223() {
      return this.method8167();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/lang/Object;)Z")
   @ObfuscatedName("tl")
   public static boolean method8195(IterableNodeDeque var0, Object var1) {
      if (var0 == null) {
         var0.hashCode();
      }

      throw new RuntimeException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)I")
   @ObfuscatedName("xf")
   public static int method8221(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method8222();
      }

      return var0.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;Ljava/util/Collection;)Z")
   @ObfuscatedName("ze")
   public static boolean method8209(IterableNodeDeque var0, Collection var1) {
      if (var0 == null) {
         var0.method8196();
      }

      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ig")
   public Node method8224() {
      return classAAX.method294(this);
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)[Lvq;")
   @ObfuscatedName("lr")
   public static Node[] method8182(IterableNodeDeque var0) {
      if (var0 == null) {
         return var0.method8184();
      } else {
         Node[] var1 = new Node[var0.method8177()];
         int var2 = 0;

         for (Node var3 = var0.field4782.field6554; var3 != var0.field4782; var3 = var3.field6554) {
            var1[var2++] = var3;
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cu")
   public boolean method8202(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cq")
   public boolean method8208(Collection var1) {
      throw new RuntimeException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("ct")
   public boolean method8205(Collection var1) {
      throw new RuntimeException();
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nv.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method8211() {
      this.method8151();
   }

   @ObfuscatedSignature(descriptor = "()[Lvq;")
   @ObfuscatedName("bo")
   Node[] method8183() {
      Node[] var1 = new Node[this.method8177()];
      int var2 = 0;

      for (Node var3 = this.field4782.field6554; var3 != this.field4782; var3 = var3.field6554) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("co")
   public boolean method8214(Object var1) {
      return this.method8199((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ca")
   public boolean method8215(Object var1) {
      return this.method8199((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)Lvq;")
   @ObfuscatedName("bn")
   Node method8170(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.field4782.field6554;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4782) {
         this.field4783 = null;
         return null;
      } else {
         this.field4783 = var2.field6554;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ak")
   public void method8158(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4783.field6554;
      var1.field6554 = this.field4783;
      var1.field6553.field6554 = var1;
      var1.field6553.field6554 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)Z")
   @ObfuscatedName("vn")
   public static boolean method8180(IterableNodeDeque var0) {
      return var0.field4782.field6554 == var0.field4782;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ag")
   public Node method8166() {
      Node var1 = this.field4782.field6553;
      if (var1 == this.field4783) {
         return null;
      } else {
         var1.vmethod400();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Lvq;")
   @ObfuscatedName("al")
   Node[] method8184() {
      Node[] var1 = new Node[this.method8177()];
      int var2 = 0;

      for (Node var3 = this.field4782.field6553; var3 != this.field4782; var3 = var3.field6553) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   public boolean method8191() {
      return this.method8179();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method8222() {
      return super.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bc")
   public Node method8225() {
      return this.field4782;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ac")
   public Node method8174() {
      Node var1 = this.field4783;
      if (var1 == this.field4783) {
         this.field4782 = null;
         return null;
      } else {
         this.field4783 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("vn")
   public Node method8226() {
      return this.field4782;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Collection;)Z")
   @ObfuscatedName("cp")
   public boolean method8203(Collection var1) {
      throw new RuntimeException();
   }
}
