import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vo")
public class DualNode extends Node {
   @ObfuscatedName("ef")
   public long keyDual;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("ej")
   public DualNode previousDual;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("ew")
   public DualNode nextDual;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;)V")
   @ObfuscatedName("ie")
   public static void method11345(class46 var0) {
      if (var0 == null) {
         var0.method558();
      } else {
         var0.field169 = var0.coord.method8316(-1656411621) * 1728637963;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kk")
   public void method11342() {
      if (this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kn")
   public void removeDual() {
      if (this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("zc")
   public DualNode method11346() {
      return this.previousDual;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jj")
   public void method11347() {
      this.removeDual();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kc")
   public void method11344() {
      if (this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }
}
