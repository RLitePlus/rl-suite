import net.runelite.api.Rasterizer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl13")
class rl13 implements Rasterizer {
   public int getWidth() {
      return classYW.field7102;
   }

   public void fillRectangle(int var1, int var2, int var3, int var4, int var5) {
      classYW.method13698(var1, var2, var3, var4, var5);
   }

   public int getHeight() {
      return classYW.field7101;
   }

   public int[] getPixels() {
      return classYW.field7104;
   }

   public void setDrawRegion(int var1, int var2, int var3, int var4) {
      classYW.method13671(var1, var2, var3, var4);
   }

   public void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      classFQ.method4963(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfq;FFFFFFFFFI)V")
   @ObfuscatedName("eu")
   public static void method10046(
      classFQ var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      if (var0 == null) {
         var0.method4955();
      }

      byte var11 = var0.field2378.field2215.field2303;
      if (var11 > 0) {
         int var12 = classFQ.method4920(
            var10,
            var0.field2378.field2215.field2300,
            var0.field2378.field2215.field2301,
            var0.field2378.field2215.field2302,
            var0.field2378.field2215.field2303
         );
         var10 = var0.field2377[var12];
      }

      var0.vmethod455(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;)V")
   @ObfuscatedName("so")
   public static void method10045(classQN var0) {
      for (ScriptEvent var1 = (ScriptEvent)var0.field5568.method8167(); null != var1; var1 = (ScriptEvent)classAAX.method294(var0.field5568)) {
         if (var1.method14130(-1238165748)) {
            var1.vmethod398();
            ScriptEvent.method14092(var1, 1323379080).field4322 = false;
         }
      }

      var0.method9682(-1051245);
   }

   public void setRasterGouraudLowRes(boolean var1) {
      classFH.field2257.method4605(var1);
   }

   public void resetRasterClipping() {
      classFH.method4740();
   }

   public void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      classFQ.method4950(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7);
   }

   public rl13() {
   }
}
