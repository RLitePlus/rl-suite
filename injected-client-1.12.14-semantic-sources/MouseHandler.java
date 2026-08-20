import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("bp")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("no")
   public int field321;
   @ObfuscatedName("ax")
   public static volatile int MouseHandler_lastButtonVolatile = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field319 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field318 = 4;
   @ObfuscatedName("ab")
   public static volatile long MouseHandler_lastMovedVolatile = 873042280694559027L;
   @ObfuscatedSignature(descriptor = "Lbp;")
   @ObfuscatedName("az")
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("aj")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("ae")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("aw")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("ap")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("ay")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("ac")
   public static volatile int MouseHandler_yVolatile = 299070531;
   @ObfuscatedName("an")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("ad")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("ai")
   public static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("au")
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field320 = 1;
   @ObfuscatedName("as")
   public static volatile int MouseHandler_xVolatile = 931039509;
   @ObfuscatedName("ak")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("ar")
   public static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("ah")
   public static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("al")
   public static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("oe")
   static long field322;

   @Override
   public final synchronized void mouseMoved(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mouseMoved(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;

            try {
               if (MouseHandler_instance != null) {
                  MouseHandler_idleCycles = 0;
                  client.method2433(-1);
                  MouseHandler_xVolatile = var4.getX() * -931039509;
                  MouseHandler_yVolatile = var4.getY() * -299070531;
                  MouseHandler_lastMovedVolatile = var4.getWhen() * -873042280694559027L;
               }
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mouseMoved(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;I)I")
   @ObfuscatedName("ag")
   final int getButton(MouseEvent var1, int var2) {
      try {
         int var3 = var1.getButton();
         if (!var1.isAltDown()) {
            if (var2 != 131071) {
               throw new IllegalStateException();
            }

            if (var3 != 2) {
               if (!var1.isMetaDown()) {
                  if (3 != var3) {
                     return 1;
                  }

                  if (var2 != 131071) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bp.ag(" + 41);
      }
   }

   @Override
   public final synchronized void mousePressed(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mousePressed(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;
            MouseHandler var3 = this;

            try {
               if (null != MouseHandler_instance) {
                  MouseHandler_idleCycles = 0;
                  client.method2433(-1);
                  MouseHandler_lastPressedXVolatile = var4.getX() * 1240330613;
                  MouseHandler_lastPressedYVolatile = var4.getY() * -570854401;
                  MouseHandler_lastPressedTimeMillisVolatile = ParamComposition.method4949((byte)15) * 2536130467538807065L;
                  MouseHandler_lastButtonVolatile = var3.getButton(var4, 131071) * 1984110647;
                  if (1157010823 * MouseHandler_lastButtonVolatile != 0) {
                     MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * 341615099;
                  }
               }

               if (var4.isPopupTrigger()) {
                  var4.consume();
               }
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mousePressed(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;S)[F")
   @ObfuscatedName("av")
   static float[] method933(JSONObject var0, String var1, short var2) throws JSONException {
      try {
         float[] var3 = new float[4];

         try {
            JSONArray var4 = var0.getJSONArray(var1);
            var3[0] = (float)var4.optDouble(0, 0.0);
            var3[1] = (float)var4.optDouble(1, 0.0);
            var3[2] = (float)var4.optDouble(2, 1.0);
            var3[3] = (float)var4.optDouble(3, 1.0);
         } catch (JSONException var5) {
            var3[0] = 0.0F;
            var3[1] = 0.0F;
            var3[2] = 1.0F;
            var3[3] = 1.0F;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bp.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("al")
   public final synchronized void method945(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bd")
   public final synchronized void method960(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX() * -1900532217;
         MouseHandler_yVolatile = var1.getY() * 557119735;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @Override
   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (null != MouseHandler_instance) {
            MouseHandler_currentButtonVolatile = 0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bp.focusLost(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("az")
   public final synchronized void method956(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bl")
   public final synchronized void method953(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = 931039509;
         MouseHandler_yVolatile = 299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bp")
   public final void method964(FocusEvent var1) {
   }

   @Override
   public final synchronized void mouseEntered(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mouseEntered(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;
            MouseHandler var3 = this;

            try {
               var3.mouseMoved(var4);
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mouseEntered(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bj")
   public final void method965(FocusEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bq")
   public final synchronized void method957(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bt")
   public final void method966(FocusEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bu")
   public final synchronized void method967(FocusEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_currentButtonVolatile = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("ba")
   public final synchronized void method968(FocusEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_currentButtonVolatile = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bi")
   public final synchronized void method969(FocusEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_currentButtonVolatile = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("by")
   public final synchronized void method970(FocusEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_currentButtonVolatile = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("an")
   static void method934(Component var0) {
      var0.addMouseListener(MouseHandler_instance);
      var0.addMouseMotionListener(MouseHandler_instance);
      var0.addFocusListener(MouseHandler_instance);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public static int method935() {
      return (MouseHandler_idleCycles += 457552751) * 651496335 - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   public static int method936() {
      return (MouseHandler_idleCycles += 457552751) * 651496335 - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public static int method937() {
      return (MouseHandler_idleCycles += 457552751) * 651496335 - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public static int method938() {
      return (MouseHandler_idleCycles += 457552751) * 651496335 - 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)I")
   @ObfuscatedName("ay")
   final int method940(MouseEvent var1) {
      int var2 = var1.getButton();
      if (var1.isAltDown() || var2 == 2) {
         return 4;
      } else {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("il")
   static void setWindowedMode(int var0, int var1) {
      try {
         client.field812 = 0L;
         if (var0 >= 2) {
            if (var1 <= -1614560929) {
               return;
            }

            client.isResizable = true;
            client.method2426(-1);
         } else {
            client.isResizable = false;
            client.method2426(-1);
         }

         if (class182.getWindowedMode(120687688) == 1) {
            if (var1 <= -1614560929) {
               return;
            }

            GameEngine.method845(SecureUrlRequester.client, 765, 503, (byte)55);
         } else {
            GameEngine.method845(SecureUrlRequester.client, 7680, 2160, (byte)20);
         }

         if (1271535343 * client.gameState >= 25) {
            classQH.method8913((byte)0);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bp.il(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bw")
   public final synchronized void method942(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX() * 1240330613;
         MouseHandler_lastPressedYVolatile = var1.getY() * -570854401;
         MouseHandler_lastPressedTimeMillisVolatile = ParamComposition.method4949((byte)15) * 2536130467538807065L;
         MouseHandler_lastButtonVolatile = this.getButton(var1, 131071) * 985165706;
         if (-1178203201 * MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * 1556949934;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bn")
   public final synchronized void method943(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX() * -1452611223;
         MouseHandler_lastPressedYVolatile = var1.getY() * -570854401;
         MouseHandler_lastPressedTimeMillisVolatile = ParamComposition.method4949((byte)15) * 2536130467538807065L;
         MouseHandler_lastButtonVolatile = this.getButton(var1, 131071) * -2138432057;
         if (1315341581 * MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * 341615099;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;I[B[BS)V")
   @ObfuscatedName("ac")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3, short var4) {
      try {
         if (null == var0.field4557) {
            if (var4 != 512) {
               return;
            }

            if (null == var2) {
               return;
            }

            var0.field4557 = new byte[11][];
            var0.field4452 = new byte[11][];
            var0.field4560 = new int[11];
            var0.field4561 = new int[11];
         }

         var0.field4557[var1] = var2;
         if (null != var2) {
            var0.field4460 = true;
         } else {
            var0.field4460 = false;

            for (int var5 = 0; var5 < var0.field4557.length; var5++) {
               if (var0.field4557[var5] != null) {
                  if (var4 != 512) {
                     throw new IllegalStateException();
                  }

                  var0.field4460 = true;
                  break;
               }
            }
         }

         var0.field4452[var1] = var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bp.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bf")
   public final synchronized void method946(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bh")
   public final synchronized void method947(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("au")
   public final synchronized void method948(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)I")
   @ObfuscatedName("ap")
   final int method941(MouseEvent var1) {
      int var2 = var1.getButton();
      if (var1.isAltDown() || var2 == 2) {
         return 4;
      } else {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ax")
   public final void method949(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("af")
   public final synchronized void method950(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("am")
   public final synchronized void method951(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bx")
   public final synchronized void method952(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @Override
   public final synchronized void mouseExited(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mouseExited(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;

            try {
               if (MouseHandler_instance != null) {
                  MouseHandler_idleCycles = 0;
                  client.method2433(-1);
                  MouseHandler_xVolatile = 931039509;
                  MouseHandler_yVolatile = 299070531;
                  MouseHandler_lastMovedVolatile = var4.getWhen() * -873042280694559027L;
               }
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mouseExited(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("bc")
   public final synchronized void method954(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = 931039509;
         MouseHandler_yVolatile = 299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ad")
   public final synchronized void method955(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = 931039509;
         MouseHandler_yVolatile = 299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ai")
   public final synchronized void method958(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @Override
   public final void mouseClicked(MouseEvent var1) {
      var1 = SecureUrlRequester.client.getCallbacks().mouseClicked(var1);
      if (!var1.isConsumed()) {
         MouseEvent var3 = var1;

         try {
            if (var3.isPopupTrigger()) {
               var3.consume();
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "bp.mouseClicked(" + ')');
         }
      }
   }

   MouseHandler() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ah")
   public final synchronized void method959(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("br")
   public final synchronized void method961(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX() * -931039509;
         MouseHandler_yVolatile = var1.getY() * -299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ab")
   public final synchronized void method962(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX() * -931039509;
         MouseHandler_yVolatile = var1.getY() * -299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("ac")
   public final synchronized void method963(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX() * -931039509;
         MouseHandler_yVolatile = var1.getY() * -299070531;
         MouseHandler_lastMovedVolatile = var1.getWhen() * -873042280694559027L;
      }
   }

   @Override
   public final synchronized void mouseReleased(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mouseReleased(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;

            try {
               if (null != MouseHandler_instance) {
                  MouseHandler_idleCycles = 0;
                  client.method2433(-1);
                  MouseHandler_currentButtonVolatile = 0;
               }

               if (var4.isPopupTrigger()) {
                  var4.consume();
               }
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mouseReleased(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @Override
   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bp.focusGained(" + ')');
      }
   }

   @Override
   public final synchronized void mouseDragged(MouseEvent var1) {
      if (this.field321 == 0) {
         var1 = SecureUrlRequester.client.getCallbacks().mouseDragged(var1);
      }

      if (!var1.isConsumed()) {
         this.field321++;

         try {
            MouseEvent var4 = var1;
            MouseHandler var3 = this;

            try {
               var3.mouseMoved(var4);
            } catch (RuntimeException var7) {
               throw RestClientThreadFactory.newRunException(var7, "bp.mouseDragged(" + ')');
            }
         } finally {
            this.field321--;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("as")
   public final synchronized void method944(MouseEvent var1) {
      if (null != MouseHandler_instance) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX() * 1240330613;
         MouseHandler_lastPressedYVolatile = var1.getY() * -570854401;
         MouseHandler_lastPressedTimeMillisVolatile = ParamComposition.method4949((byte)15) * 2536130467538807065L;
         MouseHandler_lastButtonVolatile = this.getButton(var1, 131071) * 1984110647;
         if (1157010823 * MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * 341615099;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZIZI)I")
   @ObfuscatedName("aj")
   static int method971(World var0, World var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      try {
         int var7 = class107.compareWorlds(var0, var1, var2, var3, 991765083);
         if (var7 != 0) {
            return var3 ? -var7 : var7;
         } else if (var4 == -1) {
            if (var6 != 93619784) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var8 = class107.compareWorlds(var0, var1, var4, var5, 1969839596);
            if (var5) {
               if (var6 != 93619784) {
                  throw new IllegalStateException();
               } else {
                  return -var8;
               }
            } else {
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "bp.aj(" + 41);
      }
   }
}
