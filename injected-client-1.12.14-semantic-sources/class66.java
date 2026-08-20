import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cd")
public class class66 implements Enum {
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field487 = 43;
   @ObfuscatedSignature(descriptor = "Lcd;")
   @ObfuscatedName("at")
   static final class66 field479 = new class66(1, 1);
   @ObfuscatedSignature(descriptor = "Lcd;")
   @ObfuscatedName("av")
   static final class66 field477 = new class66(0, -1);
   @ObfuscatedSignature(descriptor = "Lcd;")
   @ObfuscatedName("an")
   static final class66 field478 = new class66(3, 8);
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field484 = 256;
   @ObfuscatedName("ak")
   final int field483;
   @ObfuscatedName("aj")
   final int field482;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field486 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field485 = 1024;
   @ObfuscatedSignature(descriptor = "Lcd;")
   @ObfuscatedName("ae")
   static final class66 field481 = new class66(4, 9);
   @ObfuscatedSignature(descriptor = "[Lof;")
   @ObfuscatedName("sp")
   static Widget[] field488;
   @ObfuscatedSignature(descriptor = "Lcd;")
   @ObfuscatedName("ag")
   static final class66 field480 = new class66(2, 7);
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("py")
   static SpritePixels[] headIconPkSprites;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -60529133 * this.field482;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -60529133 * this.field482;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cd.av(" + 41);
      }
   }

   class66(int var1, int var2) {
      this.field483 = var1 * -1668867559;
      this.field482 = var2 * -372681701;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -1868107552 * this.field482;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -60529133 * this.field482;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcd;")
   @ObfuscatedName("aj")
   static class66[] method1382() {
      return new class66[]{field480, field477, field478, field481, field479};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcd;")
   @ObfuscatedName("ak")
   static class66[] method1383() {
      return new class66[]{field480, field477, field478, field481, field479};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcd;")
   @ObfuscatedName("aw")
   static class66[] method1384() {
      return new class66[]{field480, field477, field478, field481, field479};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcd;")
   @ObfuscatedName("ap")
   static class66[] method1385() {
      return new class66[]{field480, field477, field478, field481, field479};
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)Lut;")
   @ObfuscatedName("an")
   static DynamicArray method1387(int var0, Object var1, int var2) {
      try {
         DynamicArray var3 = (DynamicArray)var1;
         if (var3 == null) {
            if (var2 >= 407516417) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cd.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   public static int method1386(int var0, int var1) {
      try {
         return classUD.field6021[var0 & 2047];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cd.an(" + 41);
      }
   }
}
