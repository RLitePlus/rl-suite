import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class class565 {
   @ObfuscatedName("ad")
   final int field6159;
   @ObfuscatedName("ap")
   final int field6160;
   @ObfuscatedName("ax")
   static int[] Tiles_saturation;
   @ObfuscatedName("au")
   final int field6164;
   @ObfuscatedName("az")
   final int field6161;
   @ObfuscatedName("aw")
   final int field6162;
   @ObfuscatedName("ai")
   final int field6165;
   @ObfuscatedName("ay")
   final int field6163;

   @Override
   public String toString() {
      try {
         return String.format(
            "%dx%d (offset %d,%d)", -382859955 * this.field6162, -477863467 * this.field6160, this.field6161 * 809239137, 978893637 * this.field6159
         );
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "vh.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method11290() {
      return String.format(
         "%dx%d (offset %d,%d)", -382859955 * this.field6162, -477863467 * this.field6160, this.field6161 * 809239137, 978893637 * this.field6159
      );
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method11291() {
      return String.format(
         "%dx%d (offset %d,%d)", 1276901438 * this.field6162, 704191284 * this.field6160, this.field6161 * 809239137, 463130713 * this.field6159
      );
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method11292() {
      return String.format(
         "%dx%d (offset %d,%d)", -382859955 * this.field6162, -477863467 * this.field6160, this.field6161 * 809239137, 978893637 * this.field6159
      );
   }

   class565(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6162 = var1 * -1239893115;
      this.field6160 = -1749168259 * var2;
      this.field6161 = 443818401 * var3;
      this.field6159 = var4 * 35495821;
      this.field6163 = 2033620583 * (var1 / 2);
      this.field6164 = var2 / 2 * 1523584747;
      this.field6165 = (-1524422205 * this.field6164 * -1524422205 * this.field6164 + 299509079 * this.field6163 * this.field6163 * 299509079) * -1351065021;
   }
}
