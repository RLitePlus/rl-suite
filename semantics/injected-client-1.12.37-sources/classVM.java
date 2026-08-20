import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vm")
public class classVM {
   @ObfuscatedSignature(descriptor = "Lvm;")
   @ObfuscatedName("ab")
   public classVM field6528;
   @ObfuscatedSignature(descriptor = "Lvm;")
   @ObfuscatedName("ag")
   public classVM field6529;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("ug")
   public static void method11995(classVM var0) {
      if (var0.field6529 != null) {
         var0.field6529.field6528 = var0.field6528;
         var0.field6528.field6529 = var0.field6529;
         var0.field6528 = null;
         var0.field6529 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("ha")
   public classVM method12000() {
      return this.field6529;
   }

   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("gy")
   public static void method11996(classVM var0) {
      if (var0 == null) {
         var0.method11999();
      } else if (var0.field6529 != null) {
         var0.field6529.field6528 = var0.field6528;
         var0.field6528.field6529 = var0.field6529;
         var0.field6528 = null;
         var0.field6529 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("iv")
   public void method12001() {
      method11996(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("hk")
   public classVM method12002() {
      return this.field6528;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method11997() {
      if (this.field6529 != null) {
         this.field6529.field6528 = this.field6528;
         this.field6528.field6529 = this.field6529;
         this.field6528 = null;
         this.field6529 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method11998() {
      if (this.field6529 != null) {
         this.field6529.field6528 = this.field6528;
         this.field6528.field6529 = this.field6529;
         this.field6528 = null;
         this.field6529 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method11999() {
      if (this.field6528 != null) {
         this.field6528.field6528 = this.field6529;
         this.field6528.field6528 = this.field6528;
         this.field6529 = null;
         this.field6529 = null;
      }
   }
}
