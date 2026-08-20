import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vj")
public class classVJ extends Node {
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("fr")
   public classVJ field6515;
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("ft")
   public classVJ field6516;
   @ObfuscatedName("fx")
   public long field6514;

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("fc")
   public classVJ method11962() {
      return this.field6515;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eb")
   public void method11963() {
      this.method11958();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;I)I")
   @ObfuscatedName("wq")
   public static int method11961(classPV var0, int var1) {
      return var0.field5428[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mc")
   public void method11958() {
      if (this.field6516 != null) {
         this.field6516.field6515 = this.field6515;
         this.field6515.field6516 = this.field6516;
         this.field6515 = null;
         this.field6516 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("my")
   public void method11959() {
      if (this.field6516 != null) {
         this.field6516.field6515 = this.field6515;
         this.field6515.field6516 = this.field6516;
         this.field6515 = null;
         this.field6516 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mm")
   public void method11960() {
      if (this.field6516 != null) {
         this.field6516.field6515 = this.field6515;
         this.field6515.field6516 = this.field6516;
         this.field6515 = null;
         this.field6516 = null;
      }
   }
}
