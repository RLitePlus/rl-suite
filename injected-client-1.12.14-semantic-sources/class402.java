import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pu")
public class class402 implements Enum {
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("ag")
   public static final class402 field5241 = new class402(2, 2);
   @ObfuscatedName("an")
   public final int field5243;
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("av")
   public static final class402 field5240 = new class402(0, 0);
   @ObfuscatedName("ln")
   static int field5247;
   @ObfuscatedName("ae")
   final int field5244;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   public static final int field5246 = 1010;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field5245 = 34;
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("at")
   public static final class402 field5242 = new class402(1, 1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 542280074 * this.field5244;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 512803091 * this.field5244;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pu.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 512803091 * this.field5244;
   }

   @ObfuscatedSignature(descriptor = "(Lmc;J)Lvo;")
   @ObfuscatedName("ho")
   public static DualNode method8806(EvictingDualNodeHashTable var0, long var1) {
      if (var0 == null) {
         var0.get(var1);
      }

      DualNode var3 = (DualNode)var0.hashTable.get(var1);
      if (var3 != null) {
         var0.deque.add(var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 512803091 * this.field5244;
   }

   class402(int var1, int var2) {
      this.field5243 = var1 * -264901435;
      this.field5244 = var2 * -151178981;
   }
}
