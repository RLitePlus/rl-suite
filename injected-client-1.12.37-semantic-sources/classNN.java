import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nn")
public class classNN implements Deque {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("az")
   public Node field4691 = new Node();
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("af")
   Node field4692;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method7895() {
      while (true) {
         Node var1 = this.field4691.field6554;
         if (var1 == this.field4691) {
            this.field4692 = null;
            return;
         }

         var1.vmethod398();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;)Lvq;")
   @ObfuscatedName("lr")
   public static Node method7919(classNN var0) {
      Node var1 = var0.field4691.field6553;
      if (var1 == var0.field4691) {
         var0.field4692 = null;
         return null;
      } else {
         var0.field4692 = var1.field6553;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;Lvq;)V")
   @ObfuscatedName("vj")
   public static void method7899(classNN var0, Node var1) {
      if (var0 == null) {
         var0.method7935();
      }

      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = var0.field4691.field6553;
      var1.field6554 = var0.field4691;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;)V")
   @ObfuscatedName("pu")
   public static void method7896(classNN var0) {
      while (true) {
         Node var1 = var0.field4691.field6554;
         if (var1 == var0.field4691) {
            var0.field4692 = null;
            return;
         }

         var1.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnn;)Lvq;")
   @ObfuscatedName("jg")
   public static Node method7907(classNN var0) {
      if (var0 == null) {
         return var0.method7934();
      } else {
         Node var1 = var0.field4691.field6554;
         if (var1 == var0.field4691) {
            return null;
         } else {
            var1.vmethod398();
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("au")
   public void method7902(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4691;
      var1.field6554 = this.field4691.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   public classNN() {
      this.field4691.field6554 = this.field4691;
      this.field4691.field6553 = this.field4691;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ax")
   public Node method7915() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ac")
   public Node method7920() {
      Node var1 = this.field4691.field6553;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ar")
   public Node method7908() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ao")
   public Node method7925() {
      Node var1 = this.field4692;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("az")
   public static void method7893(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1.field6553;
      var0.field6554 = var1;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method7897() {
      while (true) {
         Node var1 = this.field4691.field6554;
         if (var1 == this.field4691) {
            this.field4692 = null;
            return;
         }

         var1.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method7898() {
      while (true) {
         Node var1 = this.field4691.field6554;
         if (var1 == this.field4691) {
            this.field4692 = null;
            return;
         }

         var1.vmethod398();
      }
   }

   public Iterator iterator() {
      return new rl11(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ab")
   public void method7903(Node var1) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      var1.field6553 = this.field4691;
      var1.field6554 = this.field4691.field6554;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("av")
   public Node method7912() {
      Node var1 = this.field4691.field6553;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bp")
   public Node method7923() {
      Node var1 = this.field4692;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnn;Lvq;)V")
   @ObfuscatedName("nx")
   public static void method7900(classNN var0, Node var1) {
      if (var0 == null) {
         var0.method7905(var1);
      } else {
         if (var1.field6553 != null) {
            var1.vmethod398();
         }

         var1.field6553 = var0.field4691.field6553;
         var1.field6554 = var0.field4691;
         var1.field6553.field6554 = var1;
         var1.field6554.field6553 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ak")
   public Node method7909() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ch")
   public Node method7930() {
      return this.method7920();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bt")
   public Node method7926() {
      Node var1 = this.field4692;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;)Lvq;")
   @ObfuscatedName("vq")
   public static Node method7921(classNN var0) {
      Node var1 = var0.field4691.field6553;
      if (var1 == var0.field4691) {
         var0.field4692 = null;
         return null;
      } else {
         var0.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("at")
   public Node method7913() {
      Node var1 = this.field4691.field6553;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("an")
   public Node method7916() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("am")
   public Node method7917() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnn;)Lvq;")
   @ObfuscatedName("xu")
   public static Node method7924(classNN var0) {
      if (var0 == null) {
         var0.method7910();
      }

      Node var1 = var0.field4692;
      if (var1 == var0.field4691) {
         var0.field4692 = null;
         return null;
      } else {
         var0.field4692 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ah")
   public Node method7918() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6554;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;Lvq;)V")
   @ObfuscatedName("kj")
   public static void method7901(classNN var0, Node var1) {
      if (var0 == null) {
         var0.method7905(var1);
      } else {
         if (var1.field6553 != null) {
            var1.vmethod398();
         }

         var1.field6553 = var0.field4691.field6553;
         var1.field6554 = var0.field4691;
         var1.field6553.field6554 = var1;
         var1.field6554.field6553 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("as")
   public Node method7914() {
      Node var1 = this.field4691.field6553;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("br")
   public Node method7927() {
      Node var1 = this.field4692;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;Lvq;)V")
   @ObfuscatedName("al")
   public static void method7894(Node var0, Node var1) {
      if (var0.field6553 != null) {
         var0.vmethod398();
      }

      var0.field6553 = var1.field6553;
      var0.field6554 = var1;
      var0.field6553.field6554 = var0;
      var0.field6554.field6553 = var0;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("is")
   public Node method7931() {
      return this.method7915();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bm")
   public Node method7928() {
      Node var1 = this.field4692;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ai")
   public void method7932(Node var1) {
      method7900(this, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("sz")
   public Node method7933() {
      return method7907(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bn")
   public Node method7922() {
      Node var1 = this.field4691.field6553;
      if (var1 == this.field4691) {
         this.field4692 = null;
         return null;
      } else {
         this.field4692 = var1.field6553;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("aa")
   public Node method7910() {
      Node var1 = this.field4691.field6554;
      if (var1 == this.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   public void clear() {
      this.method7895();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;Lvq;)V")
   @ObfuscatedName("hk")
   public static void method7904(classNN var0, Node var1) {
      if (var0 == null) {
         var0.method7906(var1);
      } else {
         if (var1.field6553 != null) {
            var1.vmethod398();
         }

         var1.field6553 = var0.field4691;
         var1.field6554 = var0.field4691.field6554;
         var1.field6553.field6554 = var1;
         var1.field6554.field6553 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnn;)V")
   @ObfuscatedName("qz")
   public void method7929(classNN var1) {
      Node var2 = this.field4691;
      Node var3 = this.field4692;
      this.field4691 = var1.field4691;
      this.field4692 = var1.field4692;
      var1.field4691 = var2;
      var1.field4692 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("hi")
   public void method7905(Node var1) {
      if (var1.field6554 != null) {
         var1.vmethod399();
      }

      var1.field6554 = this.field4691;
      var1.field6553 = this.field4691.field6554;
      var1.field6554.field6553 = var1;
      var1.field6553.field6554 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnn;)Lvq;")
   @ObfuscatedName("zt")
   public static Node method7911(classNN var0) {
      Node var1 = var0.field4691.field6554;
      if (var1 == var0.field4691) {
         return null;
      } else {
         var1.vmethod398();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ag")
   public Node method7934() {
      return method7924(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("cr")
   public Node method7935() {
      return method7924(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvq;)V")
   @ObfuscatedName("ae")
   public void method7906(Node var1) {
      if (var1.field6554 != null) {
         var1.vmethod400();
      }

      var1.field6554 = this.field4691;
      var1.field6554 = this.field4691.field6553;
      var1.field6553.field6553 = var1;
      var1.field6554.field6554 = var1;
   }
}
