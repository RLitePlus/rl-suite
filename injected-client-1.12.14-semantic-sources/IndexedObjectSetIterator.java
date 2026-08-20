import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qo")
public class IndexedObjectSetIterator implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("at")
   IndexedObjectNode field5401;
   @ObfuscatedSignature(descriptor = "Lqu;")
   @ObfuscatedName("av")
   IndexedObjectSet field5399;
   @ObfuscatedName("ag")
   int field5400;
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("an")
   IndexedObjectNode field5398 = null;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9123() {
      if (this.field5398 == null) {
         throw new IllegalStateException();
      } else {
         this.field5398.detach();
         this.field5398 = null;
      }
   }

   IndexedObjectSetIterator(IndexedObjectSet var1) {
      this.field5399 = var1;
      this.method9114();
   }

   @Override
   public Object next() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         IndexedObjectNode var2 = this.field5401;
         this.field5401 = var2.nextNode;
         this.field5398 = var2;
         return var2;
      } else {
         while (this.field5400 < this.field5399.size) {
            IndexedObjectNode var1 = this.field5399.nodes[this.field5400++].nextNode;
            if (var1 != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = var1.nextNode;
               this.field5398 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         return true;
      } else {
         while (this.field5400 < this.field5399.size) {
            if (this.field5399.nodes[this.field5400++].nextNode != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = this.field5399.nodes[this.field5400 - 1].nextNode;
               return true;
            }

            this.field5401 = this.field5399.nodes[this.field5400 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method9124() {
      if (this.field5398 == null) {
         throw new IllegalStateException();
      } else {
         this.field5398.detach();
         this.field5398 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqo;)Ljava/lang/Object;")
   @ObfuscatedName("tu")
   public static Object method9117(IndexedObjectSetIterator var0) {
      if (var0.field5401 != var0.field5399.nodes[var0.field5400 - 1]) {
         IndexedObjectNode var2 = var0.field5401;
         var0.field5401 = var2.nextNode;
         var0.field5398 = var2;
         return var2;
      } else {
         while (var0.field5400 < var0.field5399.size) {
            IndexedObjectNode var1 = var0.field5399.nodes[var0.field5400++].nextNode;
            if (var1 != var0.field5399.nodes[var0.field5400 - 1]) {
               var0.field5401 = var1.nextNode;
               var0.field5398 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method9118() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         IndexedObjectNode var2 = this.field5401;
         this.field5401 = var2.nextNode;
         this.field5398 = var2;
         return var2;
      } else {
         while (this.field5400 < this.field5399.size) {
            IndexedObjectNode var1 = this.field5399.nodes[this.field5400++].nextNode;
            if (var1 != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = var1.nextNode;
               this.field5398 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method9119() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         IndexedObjectNode var2 = this.field5401;
         this.field5401 = var2.nextNode;
         this.field5398 = var2;
         return var2;
      } else {
         while (this.field5400 < this.field5399.size) {
            IndexedObjectNode var1 = this.field5399.nodes[this.field5400++].nextNode;
            if (var1 != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = var1.nextNode;
               this.field5398 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void method9114() {
      this.field5401 = this.field5399.nodes[0].nextNode;
      this.field5400 = 1;
      this.field5398 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method9120() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         return true;
      } else {
         while (this.field5400 < this.field5399.size) {
            if (this.field5399.nodes[this.field5400++].nextNode != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = this.field5399.nodes[this.field5400 - 1].nextNode;
               return true;
            }

            this.field5401 = this.field5399.nodes[this.field5400 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method9121() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         return true;
      } else {
         while (this.field5400 < this.field5399.size) {
            if (this.field5399.nodes[this.field5400++].nextNode != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = this.field5399.nodes[this.field5400 - 1].nextNode;
               return true;
            }

            this.field5401 = this.field5399.nodes[this.field5400 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method9115() {
      this.field5401 = this.field5399.nodes[0].nextNode;
      this.field5400 = 1;
      this.field5398 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method9125() {
      if (this.field5398 == null) {
         throw new IllegalStateException();
      } else {
         this.field5398.detach();
         this.field5398 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void method9116() {
      this.field5401 = this.field5399.nodes[0].nextNode;
      this.field5400 = 1;
      this.field5398 = null;
   }

   @Override
   public void remove() {
      if (this.field5398 == null) {
         throw new IllegalStateException();
      } else {
         this.field5398.detach();
         this.field5398 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9122() {
      if (this.field5401 != this.field5399.nodes[this.field5400 - 1]) {
         return true;
      } else {
         while (this.field5400 < this.field5399.size) {
            if (this.field5399.nodes[this.field5400++].nextNode != this.field5399.nodes[this.field5400 - 1]) {
               this.field5401 = this.field5399.nodes[this.field5400 - 1].nextNode;
               return true;
            }

            this.field5401 = this.field5399.nodes[this.field5400 - 1];
         }

         return false;
      }
   }
}
