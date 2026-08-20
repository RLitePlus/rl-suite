import net.runelite.api.Rasterizer;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rl12")
class rl12 implements Rasterizer {
   public int[] getPixels() {
      return Rasterizer2D.Rasterizer2D_pixels;
   }

   public void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      AbstractRasterizer.method5458(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, var8, var9);
   }

   public void fillRectangle(int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
   }

   public int getHeight() {
      return Rasterizer2D.Rasterizer2D_height;
   }

   public void setRasterGouraudLowRes(boolean var1) {
      Rasterizer3D.clips.method6631(var1);
   }

   public int getWidth() {
      return Rasterizer2D.Rasterizer2D_width;
   }

   public void resetRasterClipping() {
      Rasterizer3D.resetRasterClipping();
   }

   public void setDrawRegion(int var1, int var2, int var3, int var4) {
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3, var4);
   }

   public void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      AbstractRasterizer.method5450(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7);
   }

   public rl12() {
   }
}
