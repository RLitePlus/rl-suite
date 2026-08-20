import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rs")
public class classRS {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5702 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ez")
   static final int field5703 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5701 = 24;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public static AbstractArchive field5704;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("ue")
   public static int method9794(WorldMapArea var0) {
      return var0 == null ? var0.method6964() : -983892273 * var0.id;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDI)[D")
   @ObfuscatedName("an")
   public static double[] method9791(double var0, double var2, int var4) {
      int var5 = 2 * var4 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for (int var8 = 0; var7 <= var4; var8++) {
         double var15 = (var7 - var0) / var2;
         double var13 = Math.exp(var15 * -var15 / 2.0) / Math.sqrt(Math.PI * 2);
         double var11 = var13 / var2;
         var6[var8] = var11;
         var7++;
      }

      return var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDI)[D")
   @ObfuscatedName("at")
   public static double[] method9792(double var0, double var2, int var4) {
      int var5 = 2 * var4 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for (int var8 = 0; var7 <= var4; var8++) {
         double var15 = (var7 - var0) / var2;
         double var13 = Math.exp(var15 * -var15 / 2.0) / Math.sqrt(Math.PI * 2);
         double var11 = var13 / var2;
         var6[var8] = var11;
         var7++;
      }

      return var6;
   }

   classRS() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDI)[D")
   @ObfuscatedName("ag")
   public static double[] method9793(double var0, double var2, int var4) {
      int var5 = 2 * var4 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for (int var8 = 0; var7 <= var4; var8++) {
         double var15 = (var7 - var0) / var2;
         double var13 = Math.exp(var15 * -var15 / 2.0) / Math.sqrt(Math.PI * 2);
         double var11 = var13 / var2;
         var6[var8] = var11;
         var7++;
      }

      return var6;
   }
}
