import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.api.MainBufferProvider;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bb")
public final class RasterProvider extends AbstractRasterProvider implements MainBufferProvider {
   @ObfuscatedName("ae")
   public Graphics field108;
   @ObfuscatedName("av")
   Image image;
   @ObfuscatedName("at")
   Component component;

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ak")
   final void method384(Component var1) {
      this.component = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("av")
   final void setComponent(Component var1, int var2) {
      try {
         this.component = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("at")
   @Override
   public final void drawFull(int var1, int var2, byte var3) {
      if (this.field108 == null) {
         java.awt.Canvas var4 = (java.awt.Canvas)this.method399();
         this.field108 = var4.getGraphics();
      }

      SecureUrlRequester.client.getCallbacks().draw(this, this.field108, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Image;)V")
   @ObfuscatedName("rm")
   public void method398(Image var1) {
      this.image = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/Component;")
   @ObfuscatedName("sb")
   public Component method399() {
      return this.component;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("az")
   @Override
   public final void vmethod45(int var1, int var2, int var3, int var4) {
      this.draw0(this.component.getGraphics(), var1, var2, var3, var4, 1185409273);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;IIII)V")
   @ObfuscatedName("ab")
   final void method393(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.component);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.component.repaint();
      }
   }

   public Image getImage() {
      return this.image;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;II)V")
   @ObfuscatedName("ai")
   final void method389(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.image, var2, var3, this.component);
      } catch (Exception var5) {
         this.component.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("aj")
   final void method386(Component var1) {
      this.component = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ad")
   @Override
   public final void vmethod46(int var1, int var2, int var3, int var4) {
      this.draw0(this.component.getGraphics(), var1, var2, var3, var4, 1033160754);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("aw")
   final void method387(Component var1) {
      this.component = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;II)V")
   @ObfuscatedName("ac")
   final void method390(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.image, var2, var3, this.component);
      } catch (Exception var5) {
         this.component.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   @Override
   public final void vmethod43(int var1, int var2) {
      this.drawFull0(this.component.getGraphics(), var1, var2, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   @Override
   public final void vmethod44(int var1, int var2) {
      this.drawFull0(this.component.getGraphics(), var1, var2, (byte)49);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;IIB)V")
   @ObfuscatedName("an")
   final void drawFull0(Graphics var1, int var2, int var3, byte var4) {
      try {
         try {
            var1.drawImage(this.image, var2, var3, this.component);
         } catch (Exception var6) {
            this.component.repaint();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bb.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbb;Ljava/awt/Component;)V")
   @ObfuscatedName("kk")
   public static void method388(RasterProvider var0, Component var1) {
      if (var0 == null) {
         var0.method386(var1);
      } else {
         var0.component = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;IIIII)V")
   @ObfuscatedName("ae")
   final void draw0(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.image, 0, 0, this.component);
            var1.setClip(var7);
         } catch (Exception var8) {
            this.component.repaint();
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "bb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;II)V")
   @ObfuscatedName("as")
   final void method392(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.image, var2, var3, this.component);
      } catch (Exception var5) {
         this.component.repaint();
      }
   }

   RasterProvider(int var1, int var2, Component var3, boolean var4) {
      super.width = var1 * -1263122007;
      super.height = var2 * -1940428891;
      super.pixels = new int[var1 * var2 + 1];
      boolean var5 = SecureUrlRequester.client.isGpu();
      if (var4 && !var5) {
         super.field6490 = new float[var1 * var2 + 1];
      }

      DataBufferInt var6 = new DataBufferInt(super.pixels, super.pixels.length);
      DirectColorModel var7;
      if (var5) {
         var7 = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);
      } else {
         var7 = new DirectColorModel(32, 16711680, 65280, 255);
      }

      WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(super.width * 81685145, super.height * -136501203), var6, (Point)null);
      this.image = new BufferedImage(var7, var8, false, new Hashtable());
      this.component = var3;
      this.method12270();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ag")
   @Override
   public final void draw(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.draw0(this.component.getGraphics(), var1, var2, var3, var4, 1385544758);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;IIII)V")
   @ObfuscatedName("ax")
   final void method395(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.component);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.component.repaint();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbb;Ljava/awt/Graphics;IIII)V")
   @ObfuscatedName("ji")
   public static void method396(RasterProvider var0, Graphics var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method392(var1, var2, var2);
      } else {
         try {
            Shape var6 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(var0.image, 0, 0, var0.component);
            var1.setClip(var6);
         } catch (Exception var7) {
            var0.component.repaint();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;IIII)V")
   @ObfuscatedName("ar")
   final void method397(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.component);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.component.repaint();
      }
   }
}
