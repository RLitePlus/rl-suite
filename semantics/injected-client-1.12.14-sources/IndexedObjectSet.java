import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qu")
public final class IndexedObjectSet implements Iterable, net.runelite.api.IndexedObjectSet {
   @ObfuscatedName("at")
   int size;
   @ObfuscatedSignature(descriptor = "[Lvc;")
   @ObfuscatedName("ag")
   IndexedObjectNode[] nodes;
   @ObfuscatedSignature(descriptor = "Lqo;")
   @ObfuscatedName("av")
   final IndexedObjectSetIterator iterator;
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("an")
   IndexedObjectNode currentNode;

   @ObfuscatedSignature(descriptor = "(I)Lvc;")
   @ObfuscatedName("ve")
   public IndexedObjectNode method9176(int var1) {
      return this.method9177(var1);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvc;")
   @ObfuscatedName("av")
   public IndexedObjectNode get(long var1) {
      IndexedObjectNode var3 = this.nodes[(int)(var1 & this.size - 1)];

      for (this.currentNode = var3.nextNode; this.currentNode != var3; this.currentNode = this.currentNode.nextNode) {
         if (this.currentNode.idx == var1) {
            IndexedObjectNode var4 = this.currentNode;
            this.currentNode = this.currentNode.nextNode;
            return var4;
         }
      }

      this.currentNode = null;
      return null;
   }

   public IndexedObjectSet(int var1) {
      this.size = var1;
      this.nodes = new IndexedObjectNode[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         IndexedObjectNode var3 = this.nodes[var2] = new IndexedObjectNode();
         var3.nextNode = var3;
         var3.previousNode = var3;
      }

      this.iterator = new IndexedObjectSetIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cg")
   public Iterator method9173() {
      this.iterator.method9114();
      return this.iterator;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqu;)V")
   @ObfuscatedName("zn")
   public static void method9169(IndexedObjectSet var0) {
      if (var0 == null) {
         var0.iterator();
      }

      for (int var1 = 0; var1 < var0.size; var1++) {
         IndexedObjectNode var2 = var0.nodes[var1];

         while (true) {
            IndexedObjectNode var3 = var2.nextNode;
            if (var3 == var2) {
               break;
            }

            var3.detach();
         }
      }

      var0.currentNode = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public Iterator method9174() {
      this.iterator.method9114();
      return this.iterator;
   }

   @ObfuscatedSignature(descriptor = "(Lvc;J)V")
   @ObfuscatedName("ak")
   public void method9165(IndexedObjectNode var1, long var2) {
      if (var1.previousNode != null) {
         var1.detach();
      }

      IndexedObjectNode var4 = this.nodes[(int)(var2 & this.size - 1)];
      var1.previousNode = var4.previousNode;
      var1.nextNode = var4;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
      var1.idx = var2;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvc;")
   @ObfuscatedName("an")
   public IndexedObjectNode method9164(long var1) {
      IndexedObjectNode var3 = this.nodes[(int)(var1 & this.size - 1)];

      for (this.currentNode = var3.nextNode; this.currentNode != var3; this.currentNode = this.currentNode.nextNode) {
         if (this.currentNode.idx == var1) {
            IndexedObjectNode var4 = this.currentNode;
            this.currentNode = this.currentNode.nextNode;
            return var4;
         }
      }

      this.currentNode = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lvc;J)V")
   @ObfuscatedName("ae")
   public void method9166(IndexedObjectNode var1, long var2) {
      if (var1.previousNode != null) {
         var1.detach();
      }

      IndexedObjectNode var4 = this.nodes[(int)(var2 & this.size - 1)];
      var1.previousNode = var4.previousNode;
      var1.nextNode = var4;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
      var1.idx = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lvc;J)V")
   @ObfuscatedName("aj")
   public void method9167(IndexedObjectNode var1, long var2) {
      if (var1.previousNode != null) {
         var1.detach();
      }

      IndexedObjectNode var4 = this.nodes[(int)(var2 & this.size - 1)];
      var1.previousNode = var4.previousNode;
      var1.nextNode = var4;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
      var1.idx = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqu;)Ljava/util/Iterator;")
   @ObfuscatedName("xf")
   public static Iterator method9175(IndexedObjectSet var0) {
      var0.iterator.method9114();
      return var0.iterator;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvc;")
   @ObfuscatedName("ji")
   public IndexedObjectNode method9177(long var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return this.get(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method9170() {
      for (int var1 = 0; var1 < this.size; var1++) {
         IndexedObjectNode var2 = this.nodes[var1];

         while (true) {
            IndexedObjectNode var3 = var2.nextNode;
            if (var3 == var2) {
               break;
            }

            var3.detach();
         }
      }

      this.currentNode = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void clear() {
      for (int var1 = 0; var1 < this.size; var1++) {
         IndexedObjectNode var2 = this.nodes[var1];

         while (true) {
            IndexedObjectNode var3 = var2.nextNode;
            if (var3 == var2) {
               break;
            }

            var3.detach();
         }
      }

      this.currentNode = null;
   }

   @Override
   public Iterator iterator() {
      return new IndexedObjectSetIterator(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method9172() {
      for (int var1 = 0; var1 < this.size; var1++) {
         IndexedObjectNode var2 = this.nodes[var1];

         while (true) {
            IndexedObjectNode var3 = var2.nextNode;
            if (var3 == var2) {
               break;
            }

            var3.detach();
         }
      }

      this.currentNode = null;
   }

   @ObfuscatedSignature(descriptor = "(Lvc;J)V")
   @ObfuscatedName("at")
   public void add(IndexedObjectNode var1, long var2) {
      if (var1.previousNode != null) {
         var1.detach();
      }

      IndexedObjectNode var4 = this.nodes[(int)(var2 & this.size - 1)];
      var1.nextNode = var4.previousNode;
      var1.nextNode = var4;
      var1.nextNode.previousNode = var1;
      var1.nextNode.previousNode = var1;
      var1.idx = var2;
   }
}
