import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ww")
public class classWW {
   @ObfuscatedName("ae")
   public int field6783;
   @ObfuscatedName("az")
   public int[] field6785;
   @ObfuscatedSignature(descriptor = "Lmb;")
   @ObfuscatedName("qm")
   protected static classMB field6786;
   @ObfuscatedName("af")
   public int field6784 = 0;

   public classWW() {
      this.field6783 = 0;
   }

   public classWW(int[] var1, int var2, int var3) {
      this.field6783 = 0;
      this.field6785 = var1;
      this.field6784 = var2 * -1412665981;
      this.field6783 = -736985931 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;)I")
   @ObfuscatedName("lo")
   public static int method12632(classSP var0) {
      return var0.field6012.field1692 * 377427776 + var0.field6026.method8478((byte)30);
   }

   @ObfuscatedSignature(descriptor = "(II)D")
   @ObfuscatedName("ae")
   public static double method12631(int var0, int var1) {
      try {
         return classLO.method7132(var0, (byte)21) / 65536.0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ww.ae(" + ')');
      }
   }
}
