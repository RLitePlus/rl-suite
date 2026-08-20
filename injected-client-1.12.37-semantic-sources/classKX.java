import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kx")
public class classKX implements classXZ {
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("as")
   public static final classKX field4050 = new classKX("oldscape", "RuneScape 2007", 5);
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("ag")
   static final classKX field4049 = new classKX("game5", "Game 5", 4);
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("ae")
   static final classKX field4048 = new classKX("game3", "Game 3", 2);
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("ab")
   static final classKX field4047 = new classKX("game4", "Game 4", 3);
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("af")
   static final classKX field4051 = new classKX("stellardawn", "Stellar Dawn", 1);
   @ObfuscatedName("ac")
   final int field4052;
   @ObfuscatedName("ax")
   public final String field4053;
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("az")
   static final classKX field4046 = new classKX("runescape", "RuneScape", 0);
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field4054 = 93;

   classKX(String var1, String var2, int var3) {
      this.field4053 = var1;
      this.field4052 = -350634179 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkx;")
   @ObfuscatedName("as")
   public static classKX[] method6578() {
      return new classKX[]{field4049, field4047, field4051, field4046, field4050, field4048};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 1839566869 * this.field4052;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1839566869 * this.field4052;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return 1839566869 * this.field4052;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 1839566869 * this.field4052;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kx.az(" + 41);
      }
   }
}
