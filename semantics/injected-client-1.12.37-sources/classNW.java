import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nw")
public class classNW implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("af")
   Node field4786;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("az")
   IterableNodeDeque field4785;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ae")
   Node field4784 = null;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method8231() {
      this.field4786 = this.field4785 != null ? this.field4785.field4782.field6554 : null;
      this.field4784 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)Z")
   @ObfuscatedName("hp")
   public static boolean method8238(classNW var0) {
      return var0.field4786 != var0.field4785.field4782 && var0.field4786 != null;
   }

   classNW(IterableNodeDeque var1) {
      this.method8230(var1);
   }

   @Override
   public boolean hasNext() {
      return this.field4786 != this.field4785.field4782 && this.field4786 != null;
   }

   @Override
   public Object next() {
      Node var1 = this.field4786;
      if (var1 == this.field4785.field4782) {
         var1 = null;
         this.field4786 = null;
      } else {
         this.field4786 = var1.field6554;
      }

      this.field4784 = var1;
      return var1;
   }

   @Override
   public void remove() {
      if (this.field4784 == null) {
         throw new IllegalStateException();
      } else {
         this.field4784.vmethod398();
         this.field4784 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)Z")
   @ObfuscatedName("qt")
   public static boolean method8239(classNW var0) {
      if (var0 == null) {
         var0.method8242();
      }

      return var0.field4786 != var0.field4785.field4782 && var0.field4786 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method8240() {
      return this.field4786 != this.field4785.field4782 && this.field4786 != null;
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("ab")
   void method8227(IterableNodeDeque var1) {
      this.field4785 = var1;
      this.method8231();
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("ag")
   void method8228(IterableNodeDeque var1) {
      this.field4785 = var1;
      this.method8231();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method8232() {
      this.field4786 = this.field4785 != null ? this.field4785.field4782.field6554 : null;
      this.field4784 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)V")
   @ObfuscatedName("ho")
   public static void method8243(classNW var0) {
      if (var0 == null) {
         var0.method8245();
      }

      if (var0.field4784 == null) {
         throw new IllegalStateException();
      } else {
         var0.field4784.vmethod398();
         var0.field4784 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method8233() {
      this.field4786 = this.field4785 != null ? this.field4785.field4782.field6554 : null;
      this.field4784 = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method8235() {
      Node var1 = this.field4786;
      if (var1 == this.field4785.field4782) {
         var1 = null;
         this.field4786 = null;
      } else {
         this.field4786 = var1.field6554;
      }

      this.field4784 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method8234() {
      this.field4786 = this.field4785 != null ? this.field4785.field4782.field6554 : null;
      this.field4784 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;Z)Lkw;")
   @ObfuscatedName("sb")
   public static classKW method8247(WorldEntity var0, boolean var1) {
      if (var0 == null) {
         var0.getWorldView();
      }

      return var1 ? classKW.field4043 : WorldEntityConfig.method8488(var0.field6026, 1420708477);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method8236() {
      Node var1 = this.field4786;
      if (var1 == this.field4785.field4782) {
         var1 = null;
         this.field4786 = null;
      } else {
         this.field4786 = var1.field6554;
      }

      this.field4784 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method8241() {
      return this.field4786 != this.field4785.field4782 && this.field4786 != null;
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("ae")
   void method8229(IterableNodeDeque var1) {
      this.field4785 = var1;
      this.method8231();
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("az")
   void method8230(IterableNodeDeque var1) {
      this.field4785 = var1;
      this.method8231();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method8244() {
      if (this.field4784 == null) {
         throw new IllegalStateException();
      } else {
         this.field4784.vmethod398();
         this.field4784 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method8242() {
      return this.field4784 != this.field4785.field4783 && this.field4786 != null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)Ljava/lang/Object;")
   @ObfuscatedName("be")
   public static Object method8237(classNW var0) {
      Node var1 = var0.field4786;
      if (var1 == var0.field4785.field4782) {
         var1 = null;
         var0.field4786 = null;
      } else {
         var0.field4786 = var1.field6554;
      }

      var0.field4784 = var1;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)I")
   @ObfuscatedName("fo")
   public static int method8246(classQR var0) {
      return var0.field5598 * -1483899724;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method8245() {
      if (this.field4784 == null) {
         throw new IllegalStateException();
      } else {
         this.field4786.vmethod387();
         this.field4784 = null;
      }
   }
}
