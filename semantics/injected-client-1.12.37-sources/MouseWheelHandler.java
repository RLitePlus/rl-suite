import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public final class MouseWheelHandler implements classMF, MouseWheelListener {
   @ObfuscatedName("az")
   int field6118 = 0;

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("aa")
   void method10739(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("ag")
   void method10740(Component var1, int var2) {
      try {
         var1.addMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("ab")
   void method10743(Component var1, int var2) {
      try {
         var1.removeMouseWheelListener(this);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tc.ag(" + ')');
      }
   }

   @Override
   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      var1 = classOE.client.getCallbacks().mouseWheelMoved(var1);
      if (!var1.isConsumed()) {
         MouseWheelEvent var3 = var1;
         MouseWheelHandler var2 = this;

         try {
            var2.field6118 = var2.field6118 + var3.getWheelRotation() * 842598801;
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "tc.mouseWheelMoved(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   @Override
   public synchronized int vmethod528(int var1) {
      try {
         int var2 = this.field6118 * -1674913935;
         this.field6118 = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tc.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public synchronized int vmethod529() {
      int var1 = this.field6118 * -1674913935;
      this.field6118 = 0;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public synchronized int vmethod527() {
      int var1 = this.field6118 * -1674913935;
      this.field6118 = 0;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("as")
   void method10741(Component var1) {
      var1.addMouseWheelListener(this);
   }

   MouseWheelHandler() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ax")
   void method10742(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("al")
   void method10744(Component var1) {
      var1.removeMouseWheelListener(this);
   }
}
