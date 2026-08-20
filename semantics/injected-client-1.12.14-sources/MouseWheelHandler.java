import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public final class MouseWheelHandler implements MouseWheel, MouseWheelListener {
   @ObfuscatedName("av")
   int rotation = 0;

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("aj")
   void method79(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @Override
   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      var1 = SecureUrlRequester.client.getCallbacks().mouseWheelMoved(var1);
      if (!var1.isConsumed()) {
         MouseWheelEvent var3 = var1;
         MouseWheelHandler var2 = this;

         try {
            var2.rotation = var2.rotation + var3.getWheelRotation() * -640473621;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "af.mouseWheelMoved(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Laf;Ljava/awt/Component;B)V")
   @ObfuscatedName("jw")
   public static void method76(MouseWheelHandler var0, Component var1, byte var2) {
      if (var0 == null) {
         var0.addTo(var1, var2);
      }

      try {
         var1.addMouseWheelListener(var0);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "af.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   @Override
   public synchronized int useRotation(byte var1) {
      try {
         int var2 = this.rotation * -106898749;
         this.rotation = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "af.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ae")
   void method77(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ak")
   void method80(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   MouseWheelHandler() {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   public synchronized int vmethod25() {
      int var1 = this.rotation * 2122060754;
      this.rotation = 0;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   public synchronized int vmethod26() {
      int var1 = this.rotation * -663996929;
      this.rotation = 0;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("at")
   void method81(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "af.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laf;Ljava/awt/Component;I)V")
   @ObfuscatedName("cp")
   public static void method82(MouseWheelHandler var0, Component var1, int var2) {
      if (var0 == null) {
         var0.method81(var1, var2);
      } else {
         try {
            var1.removeMouseWheelListener(var0);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "af.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V")
   @ObfuscatedName("av")
   void addTo(Component var1, byte var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "af.av(" + ')');
      }
   }
}
