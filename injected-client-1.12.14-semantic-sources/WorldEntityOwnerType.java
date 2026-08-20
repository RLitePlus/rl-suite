import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pw")
public class WorldEntityOwnerType implements Enum {
   @ObfuscatedSignature(descriptor = "Lpw;")
   @ObfuscatedName("ag")
   public static final WorldEntityOwnerType field5258 = new WorldEntityOwnerType(2, 2);
   @ObfuscatedSignature(descriptor = "Lpw;")
   @ObfuscatedName("at")
   public static final WorldEntityOwnerType field5257 = new WorldEntityOwnerType(1, 1);
   @ObfuscatedSignature(descriptor = "Lpw;")
   @ObfuscatedName("av")
   public static final WorldEntityOwnerType field5256 = new WorldEntityOwnerType(0, 0);
   @ObfuscatedName("ae")
   final int field5260;
   @ObfuscatedName("an")
   final int field5259;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpw;")
   @ObfuscatedName("ak")
   public static WorldEntityOwnerType[] method8813() {
      return new WorldEntityOwnerType[]{field5256, field5257, field5258};
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 562405807 * this.field5259;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pw.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -1116211099 * this.field5259;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 562405807 * this.field5259;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 562405807 * this.field5259;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpw;")
   @ObfuscatedName("aj")
   public static WorldEntityOwnerType[] method8814() {
      return new WorldEntityOwnerType[]{field5256, field5257, field5258};
   }

   WorldEntityOwnerType(int var1, int var2) {
      this.field5260 = var1 * -453154169;
      this.field5259 = 824989007 * var2;
   }
}
