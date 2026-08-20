import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class IndexedObjectNode extends DualNode {
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("es")
   public IndexedObjectNode previousNode;
   @ObfuscatedName("ee")
   public long idx;
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("eq")
   public IndexedObjectNode nextNode;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kh")
   public void method11272() {
      if (this.previousNode != null) {
         this.previousNode.nextNode = this.nextNode;
         this.nextNode.previousNode = this.previousNode;
         this.nextNode = null;
         this.previousNode = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kd")
   public void detach() {
      if (this.previousNode != null) {
         this.previousNode.nextNode = this.nextNode;
         this.nextNode.previousNode = this.previousNode;
         this.nextNode = null;
         this.previousNode = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ki")
   public void method11274() {
      if (this.previousNode != null) {
         this.previousNode.nextNode = this.nextNode;
         this.nextNode.previousNode = this.previousNode;
         this.nextNode = null;
         this.previousNode = null;
      }
   }
}
