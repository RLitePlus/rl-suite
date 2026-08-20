import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vr")
public class Link {
   @ObfuscatedSignature(descriptor = "Lvr;")
   @ObfuscatedName("an")
   public Link previous;
   @ObfuscatedSignature(descriptor = "Lvr;")
   @ObfuscatedName("ae")
   public Link next;

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("tu")
   public Link method11363() {
      return this.previous;
   }

   @ObfuscatedSignature(descriptor = "()Lvr;")
   @ObfuscatedName("rt")
   public Link method11364() {
      return this.next;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lb")
   public void method11365() {
      this.remove();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method11360() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)I")
   @ObfuscatedName("og")
   public static int method11362(PacketBuffer var0, int var1) {
      return 8 * var1 - var0.bitIndex * -1417342228;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void method11361() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
