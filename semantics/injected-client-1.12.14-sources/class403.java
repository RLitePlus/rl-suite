import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pf")
public class class403 implements Enum {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4805 = 77;
   @ObfuscatedSignature(descriptor = "Lpf;")
   @ObfuscatedName("at")
   static final class403 field4802 = new class403(0);
   @ObfuscatedName("ae")
   final int field4804;
   @ObfuscatedSignature(descriptor = "Lpf;")
   @ObfuscatedName("ag")
   static final class403 field4801 = new class403(1);
   @ObfuscatedSignature(descriptor = "Lpf;")
   @ObfuscatedName("av")
   static final class403 field4800 = new class403(-1);
   @ObfuscatedSignature(descriptor = "Lpf;")
   @ObfuscatedName("an")
   static final class403 field4803 = new class403(2);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -904125937 * this.field4804;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pf.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpf;")
   @ObfuscatedName("aj")
   public static class403[] method8721() {
      return new class403[]{field4802, field4803, field4800, field4801};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -904125937 * this.field4804;
   }

   class403(int var1) {
      this.field4804 = -1390113553 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;II)V")
   @ObfuscatedName("ys")
   public static void method8723(WorldEntityCoord var0, int var1, int var2) {
      if (var0 == null) {
         var0.getZ(var1);
      }

      var0.x = var1 * 984947033;
      var0.y = -554576425 * var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -709178317 * this.field4804;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -904125937 * this.field4804;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpf;")
   @ObfuscatedName("ak")
   public static class403[] method8722() {
      return new class403[]{field4802, field4803, field4800, field4801};
   }
}
