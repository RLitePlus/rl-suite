import net.runelite.api.BufferProvider;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xf")
public abstract class AbstractRasterProvider implements BufferProvider {
   @ObfuscatedName("aj")
   protected float[] field6490;
   @ObfuscatedName("an")
   public int width;
   @ObfuscatedName("ae")
   public int height;
   @ObfuscatedName("ag")
   public int[] pixels;

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aa")
   public final void method12266(boolean var1) {
      this.field6490 = var1 ? new float[-136501203 * this.height * this.width * 81685145 + 1] : null;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("at")
   public abstract void drawFull(int var1, int var2, byte var3);

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ag")
   public abstract void draw(int var1, int var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("af")
   public final void method12267(boolean var1, int var2) {
      try {
         float[] var10001;
         if (var1) {
            if (var2 <= 59634140) {
               throw new IllegalStateException();
            }

            var10001 = new float[-136501203 * this.height * this.width * 81685145 + 1];
         } else {
            var10001 = null;
         }

         this.field6490 = var10001;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aq")
   public final void method12268(boolean var1) {
      this.field6490 = var1 ? new float[747847768 * this.height * this.width * 81685145 + 1] : null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   public abstract void vmethod44(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ad")
   public abstract void vmethod46(int var1, int var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lm")
   public void method12270() {
      method12262(this, (byte)11);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   public abstract void vmethod43(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("er")
   public void method12271(boolean var1) {
      this.method12267(var1, 119138100);
   }

   @ObfuscatedSignature(descriptor = "(Lxf;B)V")
   @ObfuscatedName("ig")
   public static void method12262(AbstractRasterProvider var0, byte var1) {
      if (var0 == null) {
         var0.apply(var1);
      } else {
         try {
            Rasterizer2D.Rasterizer2D_init(var0.pixels, var0.width * 81685145, -136501203 * var0.height, var0.field6490);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xf.al(" + ')');
         }
      }
   }

   public int[] getPixels() {
      return this.pixels;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("az")
   public abstract void vmethod45(int var1, int var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("be")
   public final void method12269(boolean var1) {
      this.field6490 = var1 ? new float[-136501203 * this.height * this.width * 81685145 + 1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxf;)V")
   @ObfuscatedName("ao")
   public static void method12263(AbstractRasterProvider var0) {
      Rasterizer2D.Rasterizer2D_init(var0.pixels, var0.width * 81685145, -136501203 * var0.height, var0.field6490);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public final void method12264() {
      Rasterizer2D.Rasterizer2D_init(this.pixels, this.width * 81685145, 1082784641 * this.height, this.field6490);
   }

   public int getHeight() {
      return this.height * -136501203;
   }

   public int getWidth() {
      return this.width * 81685145;
   }

   protected AbstractRasterProvider() {
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("al")
   public final void apply(byte var1) {
      try {
         Rasterizer2D.Rasterizer2D_init(this.pixels, this.height * 81685145, -136501203 * this.width, this.field6490);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xf.al(" + ')');
      }
   }
}
