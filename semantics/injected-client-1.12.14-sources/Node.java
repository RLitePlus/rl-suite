import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
public class Node implements net.runelite.api.Node {
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("ht")
   public Node previous;
   @ObfuscatedName("hu")
   public long key;
   @ObfuscatedSignature(descriptor = "Lvz;")
   @ObfuscatedName("hp")
   public Node next;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("da")
   public void vmethod136() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void remove() {
      this.method11657();
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("km")
   public boolean method11653() {
      return this.next != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vb")
   public void method11657() {
      this.vmethod156();
   }

   public long getHash() {
      return this.key;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("ed")
   public Node method11658() {
      return this.previous;
   }

   @ObfuscatedSignature(descriptor = "()Lvz;")
   @ObfuscatedName("fo")
   public Node method11659() {
      return this.next;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dj")
   public void vmethod138() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qi")
   public void method11660() {
      this.remove();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("lz")
   public boolean method11654() {
      return this.next != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kb")
   public boolean method11655() {
      return this.next != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ud")
   public void vmethod156() {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ks")
   public boolean hasNext() {
      return this.next != null;
   }
}
