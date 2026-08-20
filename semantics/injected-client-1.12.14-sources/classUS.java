import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("us")
public class classUS {
   @ObfuscatedName("an")
   static final int[] field6098 = new int[16384];
   @ObfuscatedName("aj")
   static final float[] field6099 = new float[16384];
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6103 = 16383;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6104 = 16384;
   @ObfuscatedName("ae")
   static final int[] field6100 = new int[16384];
   @ObfuscatedName("ak")
   static final float[] field6101 = new float[16384];
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final double field6102 = 2607.5945876176133;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method11205(int var0) {
      return field6100[var0 & 1383713189];
   }

   static {
      double var0 = 3.834951969714103E-4;

      for (int var2 = 0; var2 < 16384; var2++) {
         field6098[var2] = (int)(16384.0 * Math.sin(var2 * var0));
         field6100[var2] = (int)(16384.0 * Math.cos(var0 * var2));
         field6099[var2] = (float)Math.sin(var0 * var2);
         field6101[var2] = (float)Math.cos(var2 * var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   public static int method11204(int var0, int var1) {
      return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
   }

   classUS() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method11206(int var0) {
      return field6100[var0 & 16383];
   }
}
