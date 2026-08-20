import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lv")
public class WorldMapLabel {
   @ObfuscatedName("ag")
   final int height;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   public static final int field3789 = 63;
   @ObfuscatedSignature(descriptor = "Llp;")
   @ObfuscatedName("an")
   final WorldMapLabelSize size;
   @ObfuscatedName("av")
   final String text;
   @ObfuscatedName("at")
   final int width;
   @ObfuscatedName("km")
   static int worldPort;
   @ObfuscatedName("bh")
   static String field3791;

   WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
      this.text = var1;
      this.height = var2 * 405692233;
      this.width = var3 * 1139411531;
      this.size = var4;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("kk")
   static void method7294(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class179.method4240(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, -2051956510);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lv.kk(" + ')');
      }
   }
}
