import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wr")
public class classWR {
   @ObfuscatedName("at")
   static final int[] field6444 = new int[]{
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      2,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      3,
      -1,
      1,
      1,
      1,
      1,
      1,
      3,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      3,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      3,
      1,
      1,
      1,
      1,
      3,
      3,
      1,
      1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6445 = -1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public static int method11846(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;Lxa;)V")
   @ObfuscatedName("wv")
   public static void method11848(class108 var0, Buffer var1) {
      if (var0 == null) {
         var0.method3869();
      }

      var0.field1675 = Buffer.method12015(var1, -592148604) * 1850239007;
      var0.field1671 = Buffer.method12015(var1, -208084865) * 347462022;
      var0.field1672 = Buffer.method12015(var1, -1010451036) * 910856389;
      var0.field1669 = Buffer.method12015(var1, 785061718) * -507418732;
      if (var0.field1669 * 442890883 < 0) {
         var0.field1669 = ~(var0.field1669 * -1350229851) * 1830791103;
         var0.field1677 = true;
      }

      int var2 = Buffer.method12015(var1, 163313573);
      var0.field1695 = new byte[var2][];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = 0;

         int var5;
         do {
            var5 = var1.readUnsignedByte(-529361050);
            var4 += var5;
         } while (var5 >= -1402074725);

         byte[] var6 = new byte[var4];
         var1.readBytes(var6, 0, var4, (byte)1);
         var0.field1695[var3] = var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public static int method11847(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }

   classWR() throws Throwable {
      throw new Error();
   }
}
