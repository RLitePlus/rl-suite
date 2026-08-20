import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tz")
public class classTZ implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("ak")
   public static volatile long field6268 = 0L;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6270 = 2;
   @ObfuscatedName("aa")
   public static int field6266 = 0;
   @ObfuscatedName("ab")
   public static int field6251 = 0;
   @ObfuscatedName("ag")
   public static int field6255 = 0;
   @ObfuscatedName("as")
   public static int field6264 = 0;
   @ObfuscatedName("al")
   public static long field6258 = 0L;
   @ObfuscatedName("ac")
   public static int field6261 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6271 = 1;
   @ObfuscatedName("aw")
   public static volatile int field6267 = 0;
   @ObfuscatedName("ax")
   public static long field6254 = 0L;
   @ObfuscatedName("ao")
   public static int field6257 = 0;
   @ObfuscatedSignature(descriptor = "Ltz;")
   @ObfuscatedName("aj")
   public static classTZ field6259 = new classTZ();
   @ObfuscatedName("aq")
   public static volatile int field6256 = 0;
   @ObfuscatedName("ad")
   public static volatile int field6252 = -604645463;
   @ObfuscatedName("ap")
   public static volatile int field6263 = -1987403529;
   @ObfuscatedName("au")
   public static volatile long field6253 = 5058297159521459785L;
   @ObfuscatedName("ai")
   public static volatile int field6265 = 0;
   @ObfuscatedName("ar")
   public static volatile int field6262 = 0;
   @ObfuscatedName("wn")
   public int field6272;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6269 = 4;
   @ObfuscatedName("ay")
   public static volatile int field6260 = 0;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hq")
   static classVP field6273;

   @Override
   public final synchronized void mouseMoved(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mouseMoved(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;

            try {
               if (null != field6259) {
                  field6260 = 0;
                  client.method1863(-1);
                  field6252 = var4.getX() * 604645463;
                  field6263 = var4.getY() * 1987403529;
                  field6253 = var4.getWhen() * -5058297159521459785L;
               }
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mouseMoved(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;I)I")
   @ObfuscatedName("af")
   final int method11213(MouseEvent var1, int var2) {
      try {
         int var3 = var1.getButton();
         if (!var1.isAltDown()) {
            if (var2 != 422353457) {
               throw new IllegalStateException();
            }

            if (2 != var3) {
               if (!var1.isMetaDown()) {
                  if (var2 != 422353457) {
                     throw new IllegalStateException();
                  }

                  if (3 != var3) {
                     return 1;
                  }

                  if (var2 != 422353457) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "tz.af(" + 41);
      }
   }

   @Override
   public final synchronized void mousePressed(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mousePressed(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;
            classTZ var3 = this;

            try {
               if (field6259 != null) {
                  field6260 = 0;
                  client.method1863(-1);
                  field6262 = var4.getX() * 1076405321;
                  field6267 = var4.getY() * 1741789915;
                  field6268 = classDD.method2983(16711680) * -5704034266074320611L;
                  field6265 = var3.method11213(var4, 422353457) * -1377702117;
                  if (0 != -1694969069 * field6265) {
                     field6256 = field6265 * -1471911103;
                  }
               }

               if (var4.isPopupTrigger()) {
                  var4.consume();
               }
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mousePressed(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("aq")
   public final synchronized void method11222(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = -604645463;
         field6263 = -1987403529;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   @Override
   public final void mouseClicked(MouseEvent var1) {
      var1 = classOE.field4843.getCallbacks().mouseClicked(var1);
      if (!var1.isConsumed()) {
         MouseEvent var3 = var1;

         try {
            if (var3.isPopupTrigger()) {
               var3.consume();
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "tz.mouseClicked(" + ')');
         }
      }
   }

   @Override
   public final synchronized void mouseEntered(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mouseEntered(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;
            classTZ var3 = this;

            try {
               var3.mouseMoved(var4);
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mouseEntered(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @Override
   public final synchronized void mouseExited(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mouseExited(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;

            try {
               if (null != field6259) {
                  field6260 = 0;
                  client.method1863(-1);
                  field6252 = -604645463;
                  field6263 = -1987403529;
                  field6253 = var4.getWhen() * -5058297159521459785L;
               }
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mouseExited(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afl")
   public final void method11230(FocusEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("aj")
   public final void method11219(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @Override
   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tz.focusGained(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ac")
   public final synchronized void method11216(MouseEvent var1) {
      if (field6259 != null) {
         field6260 = 0;
         field6262 = var1.getX() * 1076405321;
         field6267 = var1.getY() * 1741789915;
         field6268 = classDD.method2983(16711680) * -5704034266074320611L;
         field6265 = this.method11213(var1, 422353457) * -1377702117;
         if (0 != -1694969069 * field6265) {
            field6256 = field6265 * -1471911103;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public static void method11211() {
      if (null != field6259) {
         synchronized (field6259) {
            field6259 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public static void method11212() {
      if (null != field6259) {
         synchronized (field6259) {
            field6259 = null;
         }
      }
   }

   @Override
   public final synchronized void mouseDragged(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mouseDragged(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;
            classTZ var3 = this;

            try {
               var3.mouseMoved(var4);
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mouseDragged(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("aa")
   public final synchronized void method11217(MouseEvent var1) {
      if (field6259 != null) {
         field6260 = 0;
         field6262 = var1.getX() * 1076405321;
         field6267 = var1.getY() * 1741789915;
         field6268 = classDD.method2983(16711680) * -5704034266074320611L;
         field6265 = this.method11213(var1, 422353457) * -1377702117;
         if (0 != -1694969069 * field6265) {
            field6256 = field6265 * -1471911103;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ao")
   public final synchronized void method11218(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6256 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("au")
   public final synchronized void method11225(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("al")
   public final void method11220(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ay")
   public final synchronized void method11221(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @Override
   public final synchronized void mouseReleased(MouseEvent var1) {
      if (this.field6272 == 0) {
         var1 = classOE.field4843.getCallbacks().mouseReleased(var1);
      }

      if (!var1.isConsumed()) {
         this.field6272++;

         try {
            MouseEvent var4 = var1;

            try {
               if (null != field6259) {
                  field6260 = 0;
                  client.method1863(-1);
                  field6256 = 0;
               }

               if (var4.isPopupTrigger()) {
                  var4.consume();
               }
            } catch (RuntimeException var7) {
               throw classEG.method3884(var7, "tz.mouseReleased(" + ')');
            }
         } finally {
            this.field6272--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ad")
   public final synchronized void method11223(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = -604645463;
         field6263 = -1987403529;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltz;Ljava/awt/event/MouseEvent;)I")
   @ObfuscatedName("wv")
   public static int method11214(classTZ var0, MouseEvent var1) {
      if (var0 == null) {
         var0.mouseExited(var1);
      }

      int var2 = var1.getButton();
      if (var1.isAltDown() || 2 == var2) {
         return 4;
      } else {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltz;Ljava/awt/event/MouseEvent;)I")
   @ObfuscatedName("lp")
   public static int method11215(classTZ var0, MouseEvent var1) {
      if (var0 == null) {
         var0.mousePressed(var1);
      }

      int var2 = var1.getButton();
      if (var1.isAltDown() || 2 == var2) {
         return 4;
      } else {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ap")
   public final synchronized void method11224(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = -604645463;
         field6263 = -1987403529;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   classTZ() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ai")
   public final synchronized void method11226(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @Override
   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (field6259 != null) {
            field6256 = 0;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tz.focusLost(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("aw")
   public final synchronized void method11227(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = var1.getX() * 604645463;
         field6263 = var1.getY() * -1665405372;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ak")
   public final synchronized void method11228(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = var1.getX() * -220529686;
         field6263 = var1.getY() * 1987403529;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ar")
   public final synchronized void method11229(MouseEvent var1) {
      if (null != field6259) {
         field6260 = 0;
         field6252 = var1.getX() * 604645463;
         field6263 = var1.getY() * 1987403529;
         field6253 = var1.getWhen() * -5058297159521459785L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afz")
   public final void method11231(FocusEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afg")
   public final synchronized void method11232(FocusEvent var1) {
      if (field6259 != null) {
         field6256 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("aff")
   public final synchronized void method11233(FocusEvent var1) {
      if (field6259 != null) {
         field6256 = 0;
      }
   }
}
