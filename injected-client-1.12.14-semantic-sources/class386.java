import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ow")
public class class386 implements Enum {
   @ObfuscatedName("ak")
   public final boolean field4739;
   @ObfuscatedSignature(descriptor = "Low;")
   @ObfuscatedName("at")
   static final class386 field4733 = new class386(1, 1, true, false);
   @ObfuscatedSignature(descriptor = "Low;")
   @ObfuscatedName("ag")
   static final class386 field4734 = new class386(2, 2, true, true);
   @ObfuscatedSignature(descriptor = "Low;")
   @ObfuscatedName("av")
   static final class386 field4732 = new class386(0, 0, false, false);
   @ObfuscatedName("ae")
   final int field4738;
   @ObfuscatedName("aj")
   public final boolean field4736;
   @ObfuscatedName("an")
   final int field4737;
   @ObfuscatedSignature(descriptor = "Low;")
   @ObfuscatedName("aw")
   public static final class386 field4735 = field4734;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field4740 = 9;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Low;")
   @ObfuscatedName("aw")
   public static class386[] method8677() {
      return new class386[]{field4732, field4733, field4734};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lly;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("pm")
   public static int method8680(class289 var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.equals(var1);
      }

      return var0.method7329((class282)var1, (class282)var2, (byte)-50);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 205014581 * this.field4738;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 205014581 * this.field4738;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Low;")
   @ObfuscatedName("aj")
   public static class386[] method8678() {
      return new class386[]{field4732, field4733, field4734};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 205014581 * this.field4738;
   }

   class386(int var1, int var2, boolean var3, boolean var4) {
      this.field4737 = var1 * 2129311077;
      this.field4738 = -1418634211 * var2;
      this.field4736 = var3;
      this.field4739 = var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;Lkb;)Z")
   @ObfuscatedName("is")
   public static boolean method8681(WorldEntityCoord var0, WorldEntityCoord var1) {
      return var0 == null
         ? var0.method6289(var0)
         : -639471049 * var0.x == var1.x * -639471049
            && -179609957 * var0.z == -179609957 * var1.z
            && var1.y * -430111663 == -430111663 * var0.y
            && 459733525 * var1.orientation == 459733525 * var0.orientation;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Low;")
   @ObfuscatedName("ak")
   public static class386[] method8679() {
      return new class386[]{field4732, field4733, field4734};
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 205014581 * this.field4738;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ow.av(" + 41);
      }
   }
}
