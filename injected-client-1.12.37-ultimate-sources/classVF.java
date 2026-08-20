import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vf")
public class classVF extends classVY {
   @ObfuscatedName("af")
   int field6499;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field6502 = 20;
   @ObfuscatedName("az")
   int field6500 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field6501 = 5;

   public classVF(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.field6499 = 0;
      this.field6500 = 727214093 * var1;
      this.field6499 = var2 * 1639991611;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("qs")
   public static boolean method11942(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11175(var0.field6247 * 2113017971, var1, var2, var3, (byte)22);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwt;)Z")
   @ObfuscatedName("ib")
   public static boolean method11941(classWT var0) {
      return var0.field6779;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   public int method11937(byte var1) {
      try {
         double var2 = this.method12270(-1233746673);
         return (int)Math.round(var2 * (-1328568333 * this.field6499 - this.field6500 * -1541527867) + -1541527867 * this.field6500);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vf.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method11938() {
      double var1 = this.method12270(-1709188435);
      return (int)Math.round(var1 * (1454249051 * this.field6499 - this.field6500 * -1541527867) + -1541527867 * this.field6500);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method11939() {
      double var1 = this.method12270(858067524);
      return (int)Math.round(var1 * (-1328568333 * this.field6499 - this.field6500 * -1541527867) + -1541527867 * this.field6500);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method11940() {
      double var1 = this.method12270(-1373319283);
      return (int)Math.round(var1 * (-1328568333 * this.field6499 - this.field6500 * -1541527867) + -1541527867 * this.field6500);
   }
}
