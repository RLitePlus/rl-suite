import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mu")
public class WorldMapEvent {
   @ObfuscatedName("av")
   public int mapElement;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("at")
   public Coord coord1;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("ag")
   public Coord coord2;
   @ObfuscatedName("ik")
   static String field4009;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field4008 = 17;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4007 = 2;

   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = var1 * -1488969871;
      this.coord1 = var2;
      this.coord2 = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFFB)F")
   @ObfuscatedName("az")
   public static float method7539(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, byte var11
   ) {
      try {
         float var12 = (var4 - var3) * (var5 - var7) + (var2 - var4) * (var6 - var7);
         float var13 = ((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var12;
         float var14 = ((var2 - var4) * (var1 - var7) + (var0 - var4) * (var7 - var5)) / var12;
         float var15 = 1.0F - var13 - var14;
         return var9 * var14 + var8 * var13 + var15 * var10;
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "mu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFIIII)V")
   @ObfuscatedName("ad")
   static final void method7540(float var0, float var1, float var2, float var3, int var4, int var5, int var6, int var7) {
      try {
         if (!ViewportMouse.ViewportMouse_false0) {
            float var12 = 50.0F;
            float var13 = AbstractRasterizer.method5428();
            float var14 = (770621097 * ViewportMouse.ViewportMouse_x - var4) * var12 / var6;
            float var15 = var12 * (ViewportMouse.ViewportMouse_y * -459009589 - var5) / var6;
            float var16 = var13 * (ViewportMouse.ViewportMouse_x * 770621097 - var4) / var6;
            float var17 = (-459009589 * ViewportMouse.ViewportMouse_y - var5) * var13 / var6;
            float var19 = var1 * var15 + var12 * var0;
            float var20 = var1 * var12 - var0 * var15;
            float var21 = var1 * var17 + var0 * var13;
            float var22 = var1 * var13 - var17 * var0;
            float var23 = var14 * var3 - var20 * var2;
            var12 = FontName.method11647(var14, var20, var3, var2, (short)28245);
            float var24 = var16 * var3 - var2 * var22;
            var13 = FontName.method11647(var16, var22, var3, var2, (short)17568);
            ReflectionCheck.method3891((int)var23, (int)var19, (int)var12, (int)var24, (int)var21, (int)var13, 327716789);
         }
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "mu.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("au")
   static void method7541(String var0, String var1, String var2, int var3) {
      try {
         class30.method1308(7, 1562822927);
         class525.setLoginResponseString(var0, var1, var2, (byte)1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "mu.au(" + ')');
      }
   }
}
