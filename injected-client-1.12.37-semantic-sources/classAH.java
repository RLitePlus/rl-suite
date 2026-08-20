import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ah")
public abstract class classAH extends Node {
   @ObfuscatedName("au")
   volatile boolean field150 = true;
   @ObfuscatedSignature(descriptor = "Law;")
   @ObfuscatedName("ap")
   classAW field153;
   @ObfuscatedSignature(descriptor = "Lah;")
   @ObfuscatedName("ai")
   classAH field152;
   @ObfuscatedName("ar")
   int field151;

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("at")
   protected abstract classAH vmethod27();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   protected abstract int vmethod28();

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("as")
   protected abstract classAH vmethod29();

   protected classAH() {
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("aa")
   protected abstract void vmethod30(int[] var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   protected abstract void vmethod31(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   protected abstract int vmethod32();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("er")
   int vmethod23() {
      return 2008431479;
   }

   @ObfuscatedSignature(descriptor = "(Lah;[III)V")
   @ObfuscatedName("uz")
   public static void method364(classAH var0, int[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method368(var1, var2, var2);
      }

      if (var0.field150) {
         var0.vmethod30(var1, var2, var3);
      } else {
         var0.vmethod31(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("an")
   protected abstract classAH vmethod33();

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ah")
   protected abstract classAH vmethod34();

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ax")
   protected abstract classAH vmethod35();

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bx")
   protected abstract void vmethod36(int[] var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bc")
   protected abstract void vmethod37(int[] var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   protected abstract void vmethod38(int[] var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("br")
   protected abstract void vmethod39(int[] var1, int var2, int var3);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lah;[III)V")
   @ObfuscatedName("yi")
   public static void method365(classAH var0, int[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method369(var1, var2, var2);
      } else {
         if (var0.field150) {
            var0.vmethod30(var1, var2, var3);
         } else {
            var0.vmethod31(var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   protected abstract void vmethod40(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   protected abstract void vmethod41(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   protected abstract void vmethod42(int var1);

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("av")
   protected abstract classAH vmethod43();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   int vmethod24() {
      return 255;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("et")
   int vmethod25() {
      return 255;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("am")
   protected abstract classAH vmethod44();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lah;[III)V")
   @ObfuscatedName("am")
   public static void method366(classAH var0, int[] var1, int var2, int var3) {
      if (var0.field150) {
         var0.vmethod30(var1, var2, var3);
      } else {
         var0.vmethod31(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("gx")
   final void method367(int[] var1, int var2, int var3) {
      if (this.field150) {
         this.vmethod30(var1, var2, var3);
      } else {
         this.vmethod31(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bi")
   int vmethod26() {
      return 255;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("gs")
   final void method368(int[] var1, int var2, int var3) {
      if (this.field150) {
         this.vmethod38(var1, var2, var3);
      } else {
         this.vmethod42(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("gj")
   final void method369(int[] var1, int var2, int var3) {
      if (this.field150) {
         this.vmethod30(var1, var2, var3);
      } else {
         this.vmethod42(var3);
      }
   }
}
