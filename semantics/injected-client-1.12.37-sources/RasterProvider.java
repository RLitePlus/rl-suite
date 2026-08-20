import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
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

@ObfuscatedName("tg")
public final class RasterProvider extends AbstractRasterProvider implements MainBufferProvider {
   @ObfuscatedName("af")
   Component field6135;
   @ObfuscatedName("pk")
   public Graphics field6136;
   @ObfuscatedName("az")
   Image field6134;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("mw")
   public static Object method10808(classYY var0, Buffer var1) {
      return var0.field7110.vmethod653(var1, (byte)58);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Image;)V")
   @ObfuscatedName("gt")
   public void method10809(Image var1) {
      this.field6134 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;III)V")
   @ObfuscatedName("ae")
   final void method10805(Graphics var1, int var2, int var3, int var4) {
      try {
         try {
            var1.drawImage(this.field6134, var2, var3, this.field6135);
         } catch (Exception var6) {
            this.field6135.repaint();
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "tg.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("gc")
   public static void method10807(PacketWriter var0) {
      if (var0 == null) {
         var0.method3366();
      }

      var0.field1534 = null;
   }

   RasterProvider(int var1, int var2, Component var3, boolean var4) {
      super.field6967 = var1 * 389319299;
      super.field6968 = var2 * 1180487575;
      super.field6971 = new int[var1 * var2 + 1];
      boolean var5 = classOE.client.isGpu();
      if (var4 && !var5) {
         super.field6970 = new float[var1 * var2 + 1];
      }

      DataBufferInt var6 = new DataBufferInt(super.field6971, super.field6971.length);
      DirectColorModel var7;
      if (var5) {
         var7 = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);
      } else {
         var7 = new DirectColorModel(32, 16711680, 65280, 255);
      }

      WritableRaster var8 = Raster.createWritableRaster(
         var7.createCompatibleSampleModel(super.field6967 * -1238133717, super.field6968 * 1855103015), var6, (Point)null
      );
      this.field6134 = new BufferedImage(var7, var8, false, new Hashtable());
      this.field6135 = var3;
      this.method13322();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ag")
   final void method10801(Component var1) {
      this.field6135 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltg;Ljava/awt/Component;B)V")
   @ObfuscatedName("si")
   public static void method10802(RasterProvider var0, Component var1, byte var2) {
      if (var0 == null) {
         var0.method10804(var1, var2);
      } else {
         try {
            var0.field6135 = var1;
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "tg.az(" + ')');
         }
      }
   }

   public Image getImage() {
      return this.field6134;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ab")
   final void method10803(Component var1) {
      this.field6135 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("af")
   @Override
   public final void vmethod578(int var1, int var2, byte var3) {
      if (this.field6136 == null) {
         java.awt.Canvas var4 = (java.awt.Canvas)this.method10810();
         this.field6136 = var4.getGraphics();
      }

      classOE.client.getCallbacks().draw(this, this.field6136, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/Component;")
   @ObfuscatedName("mk")
   public Component method10810() {
      return this.field6135;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   @Override
   public final void vmethod577(int var1, int var2) {
      this.method10805(this.field6135.getGraphics(), var1, var2, 1690449305);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;II)V")
   @ObfuscatedName("ac")
   final void method10806(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field6134, var2, var3, this.field6135);
      } catch (Exception var5) {
         this.field6135.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V")
   @ObfuscatedName("az")
   final void method10804(Component var1, byte var2) {
      try {
         this.field6135 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tg.az(" + ')');
      }
   }
}
