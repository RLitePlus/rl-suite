import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ec")
public class VorbisMapping {
   @ObfuscatedName("ag")
   int[] field1553;
   @ObfuscatedName("av")
   int field1551;
   @ObfuscatedName("at")
   int field1552;
   @ObfuscatedName("an")
   int[] field1554;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)Z")
   @ObfuscatedName("cb")
   public static boolean method3673(classSF var0) {
      return 1837761111 * var0.field5770 > 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("zy")
   public static int method3674(WorldMapArea var0) {
      return var0.regionLowX * 972064699;
   }

   VorbisMapping(classEM var1) {
      classEM.method3770(var1, 16, 522908490);
      this.field1551 = classEM.method3774(var1, (byte)4) != 0 ? classEM.method3770(var1, 4, -1404764737) + 1 : 1;
      if (classEM.method3774(var1, (byte)4) != 0) {
         classEM.method3770(var1, 8, -1165492915);
      }

      classEM.method3770(var1, 2, -440588315);
      if (this.field1551 > 1) {
         this.field1552 = classEM.method3770(var1, 4, -144968347);
      }

      this.field1553 = new int[this.field1551];
      this.field1554 = new int[this.field1551];

      for (int var2 = 0; var2 < this.field1551; var2++) {
         classEM.method3770(var1, 8, -1422776966);
         this.field1553[var2] = classEM.method3770(var1, 8, -42380114);
         this.field1554[var2] = classEM.method3770(var1, 8, -1880280664);
      }
   }
}
