import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rz")
public final class classRZ {
   @ObfuscatedName("an")
   public static int field5750;
   @ObfuscatedName("av")
   final Object field5748;
   @ObfuscatedName("at")
   int field5749;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field5751 = 111;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIII)Z")
   @ObfuscatedName("if")
   public static boolean method10038(Scene var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5531(var1, var1, var1);
      }

      return var0.method5599(var0.field2921, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;)Ldq;")
   @ObfuscatedName("wr")
   public static RawSound method10037(SoundEffect var0) {
      if (var0 == null) {
         return var0.method3585();
      } else {
         return var0.field1516 == 0 ? var0.method3580(false) : var0.field1518.method3875((byte)-40);
      }
   }

   classRZ(Object var1, int var2) {
      this.field5748 = var1;
      this.field5749 = -349483459 * var2;
   }
}
