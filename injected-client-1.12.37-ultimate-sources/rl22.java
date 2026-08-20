import net.runelite.api.TileObject;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl22")
class rl22 extends classVQ {
   @ObfuscatedName("tf")
   public int field5736;
   @ObfuscatedName("ud")
   public int field5737;
   @ObfuscatedName("xm")
   public int field5738;
   @ObfuscatedName("sn")
   public int field5735;
   @ObfuscatedSignature(descriptor = "Ldy;")
   @ObfuscatedName("iz")
   public classDY field5739;
   @ObfuscatedName("kg")
   public TileObject field5740;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfa;)[I")
   @ObfuscatedName("np")
   public static int[] method10063(classFA var0) {
      int[] var1 = new int[422327897 * var0.field2164];

      for (int var2 = 0; var2 < var0.field2164 * 422327897; var2++) {
         var1[var2] = var0.field2167[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Laq;)V")
   @ObfuscatedName("nc")
   public static void method10062(classAQ var0) {
      if (var0 == null) {
         var0.method654();
      } else {
         var0.field253 = 0;
         var0.field257 = 0;
         var0.field255 = 0;
         var0.field256 = 0;
         var0.field252 = 0;
      }
   }

   public rl22() {
   }
}
