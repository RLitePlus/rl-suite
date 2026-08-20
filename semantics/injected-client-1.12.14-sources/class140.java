import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fq")
public class class140 implements Enum {
   @ObfuscatedName("ap")
   final int field1838;
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("an")
   static final class140 field1836 = new class140(3, 3, null, 6);
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("at")
   static final class140 field1834 = new class140(1, 1, null, 9);
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("ag")
   static final class140 field1832 = new class140(2, 2, null, 3);
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("ae")
   static final class140 field1835 = new class140(4, 4, null, 1);
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("aj")
   static final class140 field1833 = new class140(5, 5, null, 3);
   @ObfuscatedName("ak")
   final int field1839;
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("av")
   static final class140 field1831 = new class140(0, 0, null, 0);
   @ObfuscatedName("aw")
   final int field1837;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1840 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field1841 = 13;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   int method4048(byte var1) {
      try {
         return -1142185869 * this.field1838;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fq.aj(" + 41);
      }
   }

   class140(int var1, int var2, String var3, int var4) {
      this.field1839 = var1 * -2024041951;
      this.field1837 = 1694729749 * var2;
      this.field1838 = -1977613125 * var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field1837 * 1796020541;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field1837 * 1796020541;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field1837 * 1796020541;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfq;")
   @ObfuscatedName("ak")
   static class140 method4046(int var0) {
      class140[] var1 = new class140[]{field1831, field1834, field1832, field1836, field1835, field1833};
      class140 var2 = (class140)GrandExchangeOffer.findEnumerated(var1, var0, (byte)1);
      if (null == var2) {
         var2 = field1831;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfq;")
   @ObfuscatedName("aw")
   static class140 method4047(int var0) {
      class140[] var1 = new class140[]{field1831, field1834, field1832, field1836, field1835, field1833};
      class140 var2 = (class140)GrandExchangeOffer.findEnumerated(var1, var0, (byte)1);
      if (null == var2) {
         var2 = field1831;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field1837 * 1796020541;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fq.av(" + 41);
      }
   }
}
