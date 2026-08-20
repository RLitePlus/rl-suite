import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ye")
public class classYE implements classXZ {
   @ObfuscatedSignature(descriptor = "Lye;")
   @ObfuscatedName("az")
   public static final classYE field6972 = new classYE(0, 0);
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("de")
   static IterableNodeHashTable field6977;
   @ObfuscatedSignature(descriptor = "Lye;")
   @ObfuscatedName("af")
   static final classYE field6973 = new classYE(1, 1);
   @ObfuscatedName("ab")
   public final int field6976;
   @ObfuscatedName("ag")
   final int field6975;
   @ObfuscatedSignature(descriptor = "Lye;")
   @ObfuscatedName("ae")
   static final classYE field6974 = new classYE(2, 2);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field6975 * 1484841107;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ye.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lye;")
   @ObfuscatedName("as")
   public static classYE[] method13324() {
      return new classYE[]{field6973, field6974, field6972};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field6975 * 1484841107;
   }

   classYE(int var1, int var2) {
      this.field6976 = var1 * -1080124053;
      this.field6975 = var2 * 601308571;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field6975 * 1484841107;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field6975 * 1484841107;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lye;")
   @ObfuscatedName("ax")
   public static classYE[] method13325() {
      return new classYE[]{field6973, field6974, field6972};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lye;")
   @ObfuscatedName("ac")
   public static classYE[] method13326() {
      return new classYE[]{field6973, field6974, field6972};
   }
}
