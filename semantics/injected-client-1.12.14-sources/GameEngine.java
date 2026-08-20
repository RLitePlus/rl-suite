import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.concurrent.Semaphore;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bm")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener, net.runelite.api.GameEngine {
   @ObfuscatedName("bf")
   boolean resizeCanvasNextFrame;
   @ObfuscatedSignature(descriptor = "Lic;")
   @ObfuscatedName("at")
   protected static TaskHandler taskHandler;
   @ObfuscatedName("ag")
   protected static int cycleDurationMillis = -490432540;
   @ObfuscatedName("an")
   protected static int fps = 0;
   @ObfuscatedName("us")
   public Thread field264;
   @ObfuscatedName("bp")
   int field253;
   @ObfuscatedName("bs")
   protected int contentWidth;
   @ObfuscatedName("ay")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("ai")
   static int fiveOrOne = 1178843279;
   @ObfuscatedName("id")
   public final ComponentListener field240 = new rl11(this);
   @ObfuscatedName("bu")
   int maxCanvasWidth;
   @ObfuscatedSignature(descriptor = "Laq;")
   @ObfuscatedName("aa")
   protected static KeyHandler keyHandler = new KeyHandler();
   @ObfuscatedName("ac")
   static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("ax")
   static long[] clientTickTimes = new long[32];
   @ObfuscatedName("am")
   static int field232 = 1352006404;
   @ObfuscatedName("ct")
   public Semaphore field265;
   @ObfuscatedName("ao")
   static volatile boolean volatileFocus = true;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field251 = 32;
   @ObfuscatedName("be")
   static long garbageCollectorLastCollectionTime = -4424692208050935839L;
   @ObfuscatedName("bo")
   static long garbageCollectorLastCheckTimeMs = -5524403803700233737L;
   @ObfuscatedName("jy")
   public Dimension field261;
   @ObfuscatedName("bg")
   final EventQueue eventQueue;
   @ObfuscatedName("bi")
   Frame frame;
   @ObfuscatedName("bz")
   protected int contentHeight;
   @ObfuscatedName("ds")
   public boolean field241 = false;
   @ObfuscatedName("az")
   static boolean isKilled = false;
   @ObfuscatedSignature(descriptor = "Lxf;")
   @ObfuscatedName("ak")
   public static AbstractRasterProvider rasterProvider;
   @ObfuscatedName("bj")
   int canvasX;
   @ObfuscatedName("bm")
   int canvasY;
   @ObfuscatedName("bb")
   boolean hasErrored;
   @ObfuscatedName("bt")
   int field255;
   @ObfuscatedName("bh")
   Clipboard clipboard;
   @ObfuscatedName("ba")
   int maxCanvasHeight;
   @ObfuscatedName("bk")
   protected boolean field242 = false;
   @ObfuscatedName("by")
   java.awt.Canvas canvas;
   @ObfuscatedName("bn")
   volatile boolean isCanvasInvalid;
   @ObfuscatedSignature(descriptor = "Lbm;")
   @ObfuscatedName("ap")
   static GameEngine gameEngine = null;
   @ObfuscatedName("bw")
   volatile boolean fullRedraw;
   @ObfuscatedName("bd")
   volatile long field249;
   @ObfuscatedSignature(descriptor = "Laf;")
   @ObfuscatedName("br")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("au")
   static long stopTimeMs = 0L;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dz")
   protected abstract void vmethod59();

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;S)V")
   @ObfuscatedName("au")
   final void post(Object var1, short var2) {
      if (!SecureUrlRequester.client.isGpu() && this.eventQueue != null) {
         for (int var3 = 0; var3 < 50 && this.eventQueue.peekEvent() != null; var3++) {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var5) {
            }
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }

      if (client.field1025 != null) {
         client.field1025.draw(client.field1000);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jp")
   public void method849(int var1) {
      this.maxCanvasHeight = var1 * 1489603319;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method850() {
      this.addCanvas(-231674939);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("hf")
   public static void method736(GameEngine var0) {
      if (var0 == null) {
         var0.method737();
      }

      keyHandler.method183(var0.canvas, -1207941268);
      java.awt.Canvas var1 = var0.canvas;
      var1.removeMouseListener(MouseHandler.MouseHandler_instance);
      var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
      if (var0.mouseWheelHandler != null) {
         MouseWheelHandler.method82(var0.mouseWheelHandler, var0.canvas, 416625921);
      }

      var0.addCanvas(-231674939);
      keyHandler.method181(var0.canvas, 626352654);
      classWT.method11880(var0.canvas, -989256333);
      if (null != var0.mouseWheelHandler) {
         MouseWheelHandler.method76(var0.mouseWheelHandler, var0.canvas, (byte)-127);
      }

      var0.method770(-1595015587);
   }

   @ObfuscatedSignature(descriptor = "(B)Lih;")
   @ObfuscatedName("az")
   protected MouseWheel mouseWheel(byte var1) {
      try {
         if (null == this.mouseWheelHandler) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.mouseWheelHandler = new MouseWheelHandler();
            MouseWheelHandler.method76(this.mouseWheelHandler, this.canvas, (byte)-119);
         }

         return this.mouseWheelHandler;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ym")
   public void method839() {
      field232 = 0 * -1706692971;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ad")
   protected void setUpClipboard(byte var1) {
      try {
         this.clipboard = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("iy")
   public static void method718(GameEngine var0) {
      if (var0 == null) {
         var0.method751();
      }

      KeyHandler.method189(keyHandler, 937457975);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ai")
   protected void method708(String var1, int var2) {
      try {
         this.clipboard.setContents(new StringSelection(var1), null);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bm.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("as")
   public Clipboard method712(int var1) {
      try {
         return this.clipboard;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gu")
   protected abstract void vmethod60(boolean var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fj")
   protected abstract void vmethod61();

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ar")
   protected final void setUpMouse(byte var1) {
      try {
         classWT.method11880(this.canvas, -825539406);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ah")
   final void resizeCanvas(byte var1) {
      this.method848();

      try {
         Container var2 = this.container((byte)9);
         if (null == var2) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               this.method834();
            }
         } else {
            Bounds var3 = this.getFrameContentBounds(-1827490821);
            this.contentWidth = Math.max(var3.lowX * -434199641, this.field253 * 2042370065) * 177828229;
            this.contentHeight = Math.max(var3.lowY * 682845965, -2010281811 * this.field255) * -1701034641;
            if (this.contentWidth * -1258365107 <= 0) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               this.contentWidth = 177828229;
            }

            if (this.contentHeight * 536394127 <= 0) {
               if (var1 == 0) {
                  this.method834();
                  return;
               }

               this.contentHeight = -1701034641;
            }

            class489.canvasWidth = Math.min(-1258365107 * this.contentWidth, this.maxCanvasWidth * -281823465) * -358468941;
            client.method2061(-1);
            class374.canvasHeight = Math.min(this.contentHeight * 536394127, -1358276921 * this.maxCanvasHeight) * 1287631079;
            client.method2501(-1);
            this.canvasX = 1418283131 * ((-1258365107 * this.contentWidth - class489.canvasWidth * 120179835) / 2);
            this.canvasY = 0;
            this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
            rasterProvider = new RasterProvider(120179835 * class489.canvasWidth, class374.canvasHeight * 19292887, this.canvas, this.field242);
            if (var2 == this.frame) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.frame.getInsets();
               this.canvas.setLocation(var4.left + this.canvasX * -81045837, this.canvasY * 289043297 + var4.top);
            } else {
               this.canvas.setLocation(-81045837 * this.canvasX, this.canvasY * 289043297);
            }

            this.isCanvasInvalid = true;
            this.resizeGame(43495521);
            this.method834();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bm.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("at")
   public final void method784(Graphics var1) {
      this.paint(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Lbs;I)V")
   @ObfuscatedName("ff")
   public static void method722(GameEngine var0, classBS var1, int var2) {
      if (var0 == null) {
         var0.method769();
      } else {
         KeyHandler.method171(keyHandler, var1, var2, (byte)-23);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ci")
   protected void method709(String var1) {
      this.clipboard.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   final void replaceCanvas(int var1) {
      this.method853(false);
   }

   public boolean isClientThread() {
      return this.field264 == Thread.currentThread();
   }

   @Override
   public final void focusLost(FocusEvent var1) {
      try {
         volatileFocus = false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.focusLost(" + ')');
      }
   }

   public void resizeCanvas() {
      this.resizeCanvas((byte)32);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("aq")
   protected void method837(boolean var1, byte var2) {
      if (this.field242 != var1) {
         this.field242 = var1;
         var1 &= !SecureUrlRequester.client.isGpu();
         rasterProvider.method12271(var1);
         rasterProvider.method12270();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("be")
   protected final boolean checkHost(int var1) {
      try {
         String var2 = this.getDocumentBase().getHost().toLowerCase();
         if (!var2.equals("jagex.com")) {
            if (var1 == -475945786) {
               throw new IllegalStateException();
            }

            if (!var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com")) {
                  if (var1 == -475945786) {
                     throw new IllegalStateException();
                  }

                  if (!var2.endsWith(".runescape.com")) {
                     if (var2.endsWith("127.0.0.1")) {
                        if (var1 == -475945786) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     while (!var2.isEmpty()) {
                        if (var1 == -475945786) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) < '0' || var2.charAt(var2.length() - 1) > '9') {
                           break;
                        }

                        var2 = var2.substring(0, var2.length() - 1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        if (var1 == -475945786) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     method815(this, "invalidhost", (byte)1);
                     return false;
                  }

                  if (var1 == -475945786) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bm.be(" + ')');
      }
   }

   @Override
   public void run() {
      this.field264 = Thread.currentThread();
      this.field264.setName("Client");
      this.field264.setUncaughtExceptionHandler((var0, var1x) -> method852(null, var1x));

      try {
         this.setFocusCycleRoot(true);
         this.method850();
         this.method856();
         class389.clock = new NanoClock();
         if (Boolean.getBoolean("runelite.delaystart")) {
            this.field265 = new Semaphore(0);
            this.field265.acquire();
         }

         while (0L == stopTimeMs * -4464936235612350065L) {
            class142.gameCyclesToDo = class389.clock.vmethod209(20, 1) * -1746444347;

            for (int var1 = 0; var1 < class142.gameCyclesToDo * -1250506995; var1++) {
               this.method859();
            }

            if (NanoClock.field2572) {
               this.method854();
               this.method851(this.canvas);
            }
         }
      } catch (Exception var2) {
         method852(null, var2);
         this.method855("crash");
      }

      this.method857();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   void clientTick(int var1) {
      try {
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = clientTickTimes[1076182323 * HorizontalAlignment.field2257];
         clientTickTimes[1076182323 * HorizontalAlignment.field2257] = var2;
         HorizontalAlignment.field2257 = -611777029 * (1 + HorizontalAlignment.field2257 * 1076182323 & 31);
         if (0L != var4) {
            if (var1 >= -2104810530) {
               throw new IllegalStateException();
            }

            if (var2 > var4 && var1 >= -2104810530) {
               throw new IllegalStateException();
            }
         }

         synchronized (this) {
            class489.hasFocus = volatileFocus;
         }

         this.doCycle((byte)86);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "bm.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   protected final void method760(int var1) {
      try {
         this.isCanvasInvalid = true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bs")
   void graphicsTick(int var1) {
      this.method839();

      try {
         Container var2 = this.container((byte)126);
         long var3 = ParamComposition.method4949((byte)15);
         long var5 = graphicsTickTimes[FadeOutTask.field5803 * -1038172093];
         graphicsTickTimes[FadeOutTask.field5803 * -1038172093] = var3;
         FadeOutTask.field5803 = -1871999893 * (1 + FadeOutTask.field5803 * -1038172093 & 31);
         if (0L != var5) {
            if (var1 != -154633652) {
               return;
            }

            if (var3 > var5) {
               if (var1 != -154633652) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               fps = -1522158881 * (((var7 >> 1) + 32000) / var7);
            }
         }

         if ((field232 += -1706692971) * 483945661 - 1 > 50) {
            if (var1 != -154633652) {
               throw new IllegalStateException();
            }

            field232 -= 564697370;
            this.isCanvasInvalid = true;
            this.canvas.setSize(class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
            this.canvas.setVisible(true);
            if (var2 == this.frame) {
               if (var1 != -154633652) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.frame.getInsets();
               this.canvas.setLocation(var9.left + -81045837 * this.canvasX, 289043297 * this.canvasY + var9.top);
            } else {
               this.canvas.setLocation(this.canvasX * -81045837, 289043297 * this.canvasY);
            }
         }

         if (this.fullRedraw) {
            this.replaceCanvas(2144098864);
         }

         method768(this, (byte)115);
         this.draw(this.isCanvasInvalid, 279644354);
         if (this.isCanvasInvalid) {
            if (var1 != -154633652) {
               throw new IllegalStateException();
            }

            this.clearBackground((byte)95);
         }

         this.isCanvasInvalid = false;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bm.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   protected abstract void setUp(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   final void method770(int var1) {
      try {
         this.hasErrored = true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   final synchronized void kill(int var1) {
      try {
         if (!isKilled) {
            isKilled = true;

            try {
               this.canvas.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.kill0(1584049096);
            } catch (Exception var5) {
            }

            if (this.frame != null) {
               if (var1 <= -713998409) {
                  throw new IllegalStateException();
               }

               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (null != taskHandler) {
               if (var1 <= -713998409) {
                  return;
               }

               try {
                  taskHandler.close(1890245710);
               } catch (Exception var3) {
               }
            }

            this.vmethod66(-40658853);
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bm.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)V")
   @ObfuscatedName("af")
   public void method851(Object var1) {
      this.post(var1, (short)29690);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("pk")
   public static void method753(GameEngine var0) {
      if (var0 == null) {
         var0.method735();
      } else {
         try {
            if (null != class373.javaVendor) {
               String var1 = class373.javaVendor.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = TaskHandler.javaVersion;
                  if (var2.equals("1.1")
                     || var2.startsWith("1.1.")
                     || var2.equals("1.2")
                     || var2.startsWith("1.2.")
                     || var2.equals("1.3")
                     || var2.startsWith("1.3.")
                     || var2.equals("1.4")
                     || var2.startsWith("1.4.")
                     || var2.equals("1.5")
                     || var2.startsWith("1.5.")
                     || var2.equals("1.6.0")) {
                     method815(var0, "wrongjava", (byte)1);
                     return;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     int var3 = 6;

                     while (var3 < var2.length() && class341.isDigit(var2.charAt(var3), 1811738809)) {
                        var3++;
                     }

                     String var4 = var2.substring(6, var3);
                     if (ViewportMouse.isNumber(var4, -1493769067) && Message.method1204(var4, (byte)-117) < 10) {
                        method815(var0, "wrongjava", (byte)1);
                        return;
                     }
                  }

                  fiveOrOne = 1599249099;
               }
            }

            var0.setFocusCycleRoot(true);
            var0.addCanvas(-231674939);
            var0.setUp(-2112750256);
            class389.clock = class1.method249(-2082206047);

            while (0L == -4464936235612350065L * stopTimeMs || ParamComposition.method4949((byte)15) < stopTimeMs * -4464936235612350065L) {
               class142.gameCyclesToDo = class389.clock.wait(234476268 * cycleDurationMillis, -1975097745 * fiveOrOne, 1680178604) * -1755956809;

               for (int var6 = 0; var6 < -1354807563 * class142.gameCyclesToDo; var6++) {
                  var0.clientTick(-2129917748);
               }

               var0.graphicsTick(-154633652);
               var0.post(var0.canvas, (short)18274);
            }
         } catch (Exception var5) {
            PlayerType.RunException_sendStackTrace(null, var5, 1171511246);
            method815(var0, "crash", (byte)1);
         }

         var0.kill(1468035361);
      }
   }

   @Override
   public final void stop() {
      try {
         if (gameEngine == this && !isKilled) {
            stopTimeMs = (ParamComposition.method4949((byte)15) + 4000L) * -3940398186994948753L;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bm.stop(" + ')');
      }
   }

   @Override
   public final void destroy() {
      try {
         if (gameEngine == this && !isKilled) {
            stopTimeMs = ParamComposition.method4949((byte)15) * -3940398186994948753L;
            LoginState.method484(5000L);
            this.kill(1406353453);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bm.destroy(" + ')');
      }
   }

   @Override
   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.update(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("za")
   public static void method731(GameEngine var0) {
      if (var0 == null) {
         var0.method745();
      } else {
         Container var1 = var0.container((byte)65);
         if (null != var1) {
            Bounds var2 = var0.getFrameContentBounds(-1919015716);
            var0.contentWidth = Math.max(var2.lowX * -434199641, var0.field253 * 2042370065) * 177828229;
            var0.contentHeight = Math.max(var2.lowY * 682845965, -2010281811 * var0.field255) * -1701034641;
            if (var0.contentWidth * -1258365107 <= 0) {
               var0.contentWidth = 177828229;
            }

            if (var0.contentHeight * 536394127 <= 0) {
               var0.contentHeight = -1701034641;
            }

            class489.canvasWidth = Math.min(-1258365107 * var0.contentWidth, var0.maxCanvasWidth * -281823465) * -358468941;
            class374.canvasHeight = Math.min(var0.contentHeight * 536394127, -1358276921 * var0.maxCanvasHeight) * 1287631079;
            var0.canvasX = 1418283131 * ((-1258365107 * var0.contentWidth - class489.canvasWidth * 120179835) / 2);
            var0.canvasY = 0;
            var0.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
            rasterProvider = new RasterProvider(120179835 * class489.canvasWidth, class374.canvasHeight * 19292887, var0.canvas, var0.field242);
            if (var1 == var0.frame) {
               Insets var3 = var0.frame.getInsets();
               var0.canvas.setLocation(var3.left + var0.canvasX * -81045837, var0.canvasY * 289043297 + var3.top);
            } else {
               var0.canvas.setLocation(-81045837 * var0.canvasX, var0.canvasY * 289043297);
            }

            var0.isCanvasInvalid = true;
            var0.resizeGame(43495521);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gc")
   protected final boolean method827() {
      return null != this.frame;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   protected abstract void resizeGame(int var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gj")
   protected final void method713() {
      if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         class27.KeyHandler_keyCodes[186] = 57;
         class27.KeyHandler_keyCodes[187] = 27;
         class27.KeyHandler_keyCodes[188] = 71;
         class27.KeyHandler_keyCodes[189] = 26;
         class27.KeyHandler_keyCodes[190] = 72;
         class27.KeyHandler_keyCodes[191] = 73;
         class27.KeyHandler_keyCodes[192] = 58;
         class27.KeyHandler_keyCodes[219] = 42;
         class27.KeyHandler_keyCodes[220] = 74;
         class27.KeyHandler_keyCodes[221] = 43;
         class27.KeyHandler_keyCodes[222] = 59;
         class27.KeyHandler_keyCodes[223] = 28;
      } else {
         class27.KeyHandler_keyCodes[44] = 71;
         class27.KeyHandler_keyCodes[45] = 26;
         class27.KeyHandler_keyCodes[46] = 72;
         class27.KeyHandler_keyCodes[47] = 73;
         class27.KeyHandler_keyCodes[59] = 57;
         class27.KeyHandler_keyCodes[61] = 27;
         class27.KeyHandler_keyCodes[91] = 42;
         class27.KeyHandler_keyCodes[92] = 74;
         class27.KeyHandler_keyCodes[93] = 43;
         class27.KeyHandler_keyCodes[192] = 28;
         class27.KeyHandler_keyCodes[222] = 58;
         class27.KeyHandler_keyCodes[520] = 59;
      }

      keyHandler.method181(this.canvas, 626352654);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("mn")
   public static void method764(GameEngine var0) {
      if (var0 == null) {
         var0.method780();
      }

      Container var1 = var0.container((byte)25);
      long var2 = ParamComposition.method4949((byte)15);
      long var4 = graphicsTickTimes[FadeOutTask.field5803 * 1495322397];
      graphicsTickTimes[FadeOutTask.field5803 * 1279796882] = var2;
      FadeOutTask.field5803 = 1545815230 * (1 + FadeOutTask.field5803 * -1909453256 & -109129934);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = -1522158881 * (((var6 >> 1) + 32000) / var6);
      }

      if ((field232 += -1706692971) * 483945661 - 1 > -2000641476) {
         field232 -= 564697370;
         var0.isCanvasInvalid = true;
         var0.canvas.setSize(class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
         var0.canvas.setVisible(true);
         if (var1 == var0.frame) {
            Insets var7 = var0.frame.getInsets();
            var0.canvas.setLocation(var7.left + -1557607601 * var0.canvasX, 1192800619 * var0.canvasY + var7.top);
         } else {
            var0.canvas.setLocation(var0.canvasX * -81045837, 289043297 * var0.canvasY);
         }
      }

      if (var0.fullRedraw) {
         var0.replaceCanvas(2143979273);
      }

      method768(var0, (byte)115);
      var0.draw(var0.isCanvasInvalid, 830356676);
      if (var0.isCanvasInvalid) {
         var0.clearBackground((byte)73);
      }

      var0.isCanvasInvalid = false;
   }

   @Override
   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowActivated(" + ')');
      }
   }

   @Override
   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowClosed(" + ')');
      }
   }

   @Override
   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowClosing(" + ')');
      }
   }

   @Override
   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowDeiconified(" + ')');
      }
   }

   @Override
   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowIconified(" + ')');
      }
   }

   @Override
   public final void focusGained(FocusEvent var1) {
      this.method842(var1);

      try {
         volatileFocus = true;
         this.isCanvasInvalid = true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.focusGained(" + ')');
      }
   }

   @Override
   public abstract void init();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("an")
   public final synchronized void method786(Graphics var1) {
      if (gameEngine == this && !isKilled) {
         this.isCanvasInvalid = true;
         if (ParamComposition.method4949((byte)15) - 3775603242213170231L * this.field249 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class489.canvasWidth * 1703123457 && var2.height >= class374.canvasHeight * 19292887) {
               this.fullRedraw = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bf")
   protected abstract void doCycle(byte var1);

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("dw")
   protected void method723(classBS var1, int var2) {
      KeyHandler.method171(keyHandler, var1, var2, (byte)-57);
   }

   @ObfuscatedSignature(descriptor = "(Lbm;B)V")
   @ObfuscatedName("mw")
   public static void method768(GameEngine var0, byte var1) {
      if (var0 == null) {
         var0.method733(var1);
      }

      try {
         Bounds var2 = var0.getFrameContentBounds(-1821587108);
         if (-434199641 * var2.lowX == -1258365107 * var0.contentWidth) {
            if (var1 != 115) {
               return;
            }

            if (var2.lowY * 682845965 == var0.contentHeight * 536394127) {
               if (var1 != 115) {
                  throw new IllegalStateException();
               }

               if (!var0.hasErrored) {
                  return;
               }

               if (var1 != 115) {
                  throw new IllegalStateException();
               }
            }
         }

         var0.resizeCanvas((byte)32);
         var0.hasErrored = false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bm.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bd")
   protected abstract void kill0(int var1);

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ed")
   public final void method794(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/awt/Container;")
   @ObfuscatedName("bc")
   Container container(byte var1) {
      try {
         if (null != this.frame) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return this.frame;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dp")
   final synchronized void method745() {
      Container var1 = this.container((byte)44);
      if (null != this.canvas) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      class489.canvasWidth = Math.max(var1.getWidth(), 2042370065 * this.field253) * -358468941;
      class374.canvasHeight = Math.max(var1.getHeight(), this.field255 * -2010281811) * 1287631079;
      if (this.frame != null) {
         Insets var2 = this.frame.getInsets();
         class489.canvasWidth = class489.canvasWidth - (var2.right + var2.left) * -358468941;
         class374.canvasHeight = class374.canvasHeight - 1287631079 * (var2.top + var2.bottom);
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.canvas);
      this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (var1 == this.frame) {
         Insets var3 = this.frame.getInsets();
         this.canvas.setLocation(-81045837 * this.canvasX + var3.left, var3.top + this.canvasY * 289043297);
      } else {
         this.canvas.setLocation(-81045837 * this.canvasX, 289043297 * this.canvasY);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.isCanvasInvalid = true;
      if (rasterProvider != null
         && rasterProvider.width * 81685145 == 120179835 * class489.canvasWidth
         && -136501203 * rasterProvider.height == class374.canvasHeight * 19292887) {
         ((RasterProvider)rasterProvider).setComponent(this.canvas, 520591453);
         rasterProvider.drawFull(0, 0, (byte)13);
      } else {
         rasterProvider = new RasterProvider(class489.canvasWidth * 120179835, class374.canvasHeight * 19292887, this.canvas, this.field242);
      }

      this.fullRedraw = false;
      this.field249 = ParamComposition.method4949((byte)15) * 3764167136456251783L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;ILjava/lang/String;ZZ)V")
   @ObfuscatedName("wv")
   public static void method808(GameEngine var0, int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = var0.canvas.getGraphics();
         if (null == class237.fontHelvetica13) {
            class237.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            class201.loginScreenFontMetrics = var0.canvas.getFontMetrics(class237.fontHelvetica13);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == class166.field2021) {
               class166.field2021 = var0.canvas.createImage(304, 34);
            }

            Graphics var7 = class166.field2021.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class237.fontHelvetica13);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var5.drawImage(class166.field2021, class489.canvasWidth * 120179835 / 2 - 152, (var4 ? 50 : -18) + 19292887 * class374.canvasHeight / 2, null);
         } catch (Exception var10) {
            int var8 = class489.canvasWidth * 120179835 / 2 - 152;
            int var9 = class374.canvasHeight * 19292887 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(2 + var8 + 3 * var1, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(class237.fontHelvetica13);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22 + var9);
         }
      } catch (Exception var11) {
         var0.canvas.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bx")
   protected final boolean hasFrame(int var1) {
      try {
         return null != this.frame;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.bx(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("jq")
   public static void method719(GameEngine var0) {
      if (var0 == null) {
         var0.method757();
      } else {
         KeyHandler.method189(keyHandler, 1783587212);
      }
   }

   public Thread getClientThread() {
      return this.field264;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bv")
   protected abstract void vmethod66(int var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fd")
   protected abstract void vmethod67();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gs")
   protected abstract void vmethod68();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fl")
   public final void method799(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("av")
   public final void method785(Graphics var1) {
      this.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ae")
   public final synchronized void method787(Graphics var1) {
      if (gameEngine == this && !isKilled) {
         this.isCanvasInvalid = true;
         if (ParamComposition.method4949((byte)15) - 3775603242213170231L * this.field249 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class489.canvasWidth * 120179835 && var2.height >= class374.canvasHeight * 19292887) {
               this.fullRedraw = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("aj")
   public final synchronized void method788(Graphics var1) {
      if (gameEngine == this && !isKilled) {
         this.isCanvasInvalid = true;
         if (ParamComposition.method4949((byte)15) - 3775603242213170231L * this.field249 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class489.canvasWidth * 120179835 && var2.height >= class374.canvasHeight * 19292887) {
               this.fullRedraw = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fr")
   protected abstract void vmethod69();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bj")
   public final void method790(FocusEvent var1) {
      volatileFocus = true;
      this.isCanvasInvalid = true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bp")
   public final void method791(FocusEvent var1) {
      volatileFocus = true;
      this.isCanvasInvalid = true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bt")
   public final void method792(FocusEvent var1) {
      volatileFocus = true;
      this.isCanvasInvalid = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   protected static final void method689() {
      class389.clock.mark(760743674);

      for (int var0 = 0; var0 < 294564186; var0++) {
         graphicsTickTimes[var0] = 0L;
      }

      for (int var1 = 0; var1 < 1549974821; var1++) {
         clientTickTimes[var1] = 0L;
      }

      class142.gameCyclesToDo = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ce")
   protected static final void method690() {
      class389.clock.mark(1762947239);

      for (int var0 = 0; var0 < 32; var0++) {
         graphicsTickTimes[var0] = 0L;
      }

      for (int var1 = 0; var1 < 32; var1++) {
         clientTickTimes[var1] = 0L;
      }

      class142.gameCyclesToDo = 0;
   }

   @Override
   public final void start() {
      this.method843();

      try {
         if (gameEngine == this && !isKilled) {
            stopTimeMs = 0L;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bm.start(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public final void method775() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cm")
   protected final void method694(int var1, int var2) {
      if (var1 != this.maxCanvasWidth * -281823465 || this.maxCanvasHeight * -1358276921 != var2) {
         this.method770(-1595015587);
      }

      this.maxCanvasWidth = 1980952743 * var1;
      this.maxCanvasHeight = 258792286 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cb")
   protected final void method695(int var1, int var2) {
      if (var1 != this.maxCanvasWidth * -281823465 || this.maxCanvasHeight * -1358276921 != var2) {
         this.method770(-1595015587);
      }

      this.maxCanvasWidth = 1980952743 * var1;
      this.maxCanvasHeight = 1489603319 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ck")
   protected final void method696(int var1, int var2) {
      if (var1 != this.maxCanvasWidth * 1880838227 || this.maxCanvasHeight * -348809837 != var2) {
         this.method770(-1595015587);
      }

      this.maxCanvasWidth = -1742137424 * var1;
      this.maxCanvasHeight = 1489603319 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)V")
   @ObfuscatedName("cc")
   final void method697(Object var1) {
      if (null != this.eventQueue) {
         for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; var2++) {
            LoginState.method484(1L);
         }

         if (null != var1) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }
   }

   @Override
   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowDeactivated(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lih;")
   @ObfuscatedName("cn")
   protected MouseWheel method699() {
      if (null == this.mouseWheelHandler) {
         this.mouseWheelHandler = new MouseWheelHandler();
         MouseWheelHandler.method76(this.mouseWheelHandler, this.canvas, (byte)-10);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/lang/String;B)V")
   @ObfuscatedName("wf")
   public static void method815(GameEngine var0, String var1, byte var2) {
      if (var0 == null) {
         var0.error(var1, var2);
      } else {
         try {
            if (var0.resizeCanvasNextFrame) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }
            } else {
               var0.resizeCanvasNextFrame = true;
               System.out.println("error_game_" + var1);

               try {
                  var0.getAppletContext().showDocument(new URL(var0.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
               } catch (Exception var4) {
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "bm.bl(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lih;")
   @ObfuscatedName("co")
   protected MouseWheel method700() {
      if (null == this.mouseWheelHandler) {
         this.mouseWheelHandler = new MouseWheelHandler();
         MouseWheelHandler.method76(this.mouseWheelHandler, this.canvas, (byte)-14);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   protected void method703() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   public void unblockStartup() {
      if (this.field265 != null) {
         this.field265.release();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   protected void method704() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("ie")
   public static void method852(String var0, Throwable var1) {
      PlayerType.RunException_sendStackTrace(var0, var1, -230650138);
   }

   @Override
   public final synchronized void paint(Graphics var1) {
      this.method840(var1);

      try {
         if (gameEngine == this && !isKilled) {
            this.isCanvasInvalid = true;
            if (ParamComposition.method4949((byte)15) - 3775603242213170231L * this.field249 > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (null == var2 || var2.width >= class489.canvasWidth * 120179835 && var2.height >= class374.canvasHeight * 19292887) {
                  this.fullRedraw = true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bm.paint(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   protected void method705() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   protected void method706() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZB)V")
   @ObfuscatedName("br")
   protected final void drawInitial(int var1, String var2, boolean var3, boolean var4, byte var5) {
      try {
         try {
            Graphics var6 = this.canvas.getGraphics();
            if (null == class237.fontHelvetica13) {
               if (var5 <= 3) {
                  return;
               }

               class237.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
               class201.loginScreenFontMetrics = this.canvas.getFontMetrics(class237.fontHelvetica13);
            }

            if (var3) {
               if (var5 <= 3) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  var6.setColor(Color.black);
                  var6.fillRect(0, 0, class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
               }
            }

            Color var7 = new Color(140, 17, 17);

            try {
               if (null == class166.field2021) {
                  class166.field2021 = this.canvas.createImage(304, 34);
               }

               Graphics var8 = class166.field2021.getGraphics();
               var8.setColor(var7);
               var8.drawRect(0, 0, 303, 33);
               var8.fillRect(2, 2, var1 * 3, 30);
               var8.setColor(Color.black);
               var8.drawRect(1, 1, 301, 31);
               var8.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
               var8.setFont(class237.fontHelvetica13);
               var8.setColor(Color.white);
               var8.drawString(var2, (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
               int var10002 = class489.canvasWidth * 120179835 / 2 - 152;
               byte var10003;
               if (var4) {
                  if (var5 <= 3) {
                     return;
                  }

                  var10003 = 50;
               } else {
                  var10003 = -18;
               }

               var6.drawImage(class166.field2021, var10002, var10003 + 19292887 * class374.canvasHeight / 2, null);
            } catch (Exception var11) {
               int var9 = class489.canvasWidth * 120179835 / 2 - 152;
               int var10 = class374.canvasHeight * 19292887 / 2 - 18;
               var6.setColor(var7);
               var6.drawRect(var9, var10, 303, 33);
               var6.fillRect(var9 + 2, var10 + 2, 3 * var1, 30);
               var6.setColor(Color.black);
               var6.drawRect(1 + var9, var10 + 1, 301, 31);
               var6.fillRect(2 + var9 + 3 * var1, 2 + var10, 300 - 3 * var1, 30);
               var6.setFont(class237.fontHelvetica13);
               var6.setColor(Color.white);
               var6.drawString(var2, var9 + (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22 + var10);
            }
         } catch (Exception var12) {
            this.canvas.repaint();
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "bm.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cf")
   protected void method710(String var1) {
      this.clipboard.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "()Lih;")
   @ObfuscatedName("cs")
   protected MouseWheel method701() {
      if (null == this.mouseWheelHandler) {
         this.mouseWheelHandler = new MouseWheelHandler();
         MouseWheelHandler.method76(this.mouseWheelHandler, this.canvas, (byte)-20);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("pk")
   public void method853(boolean var1) {
      this.fullRedraw = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("df")
   protected final void method714() {
      if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         class27.KeyHandler_keyCodes[186] = 57;
         class27.KeyHandler_keyCodes[187] = 27;
         class27.KeyHandler_keyCodes[188] = 71;
         class27.KeyHandler_keyCodes[189] = 26;
         class27.KeyHandler_keyCodes[190] = 72;
         class27.KeyHandler_keyCodes[191] = 73;
         class27.KeyHandler_keyCodes[192] = 58;
         class27.KeyHandler_keyCodes[219] = 42;
         class27.KeyHandler_keyCodes[220] = 74;
         class27.KeyHandler_keyCodes[221] = 43;
         class27.KeyHandler_keyCodes[222] = 59;
         class27.KeyHandler_keyCodes[223] = 28;
      } else {
         class27.KeyHandler_keyCodes[44] = 71;
         class27.KeyHandler_keyCodes[45] = 26;
         class27.KeyHandler_keyCodes[46] = 72;
         class27.KeyHandler_keyCodes[47] = 73;
         class27.KeyHandler_keyCodes[59] = 57;
         class27.KeyHandler_keyCodes[61] = 27;
         class27.KeyHandler_keyCodes[91] = 42;
         class27.KeyHandler_keyCodes[92] = 74;
         class27.KeyHandler_keyCodes[93] = 43;
         class27.KeyHandler_keyCodes[192] = 28;
         class27.KeyHandler_keyCodes[222] = 58;
         class27.KeyHandler_keyCodes[520] = 59;
      }

      keyHandler.method181(this.canvas, 626352654);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gk")
   protected final void method715() {
      if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         class27.KeyHandler_keyCodes[186] = 57;
         class27.KeyHandler_keyCodes[187] = 27;
         class27.KeyHandler_keyCodes[188] = 71;
         class27.KeyHandler_keyCodes[189] = 26;
         class27.KeyHandler_keyCodes[190] = 72;
         class27.KeyHandler_keyCodes[191] = 73;
         class27.KeyHandler_keyCodes[192] = 58;
         class27.KeyHandler_keyCodes[219] = 42;
         class27.KeyHandler_keyCodes[220] = 74;
         class27.KeyHandler_keyCodes[221] = 43;
         class27.KeyHandler_keyCodes[222] = 59;
         class27.KeyHandler_keyCodes[223] = 28;
      } else {
         class27.KeyHandler_keyCodes[44] = 71;
         class27.KeyHandler_keyCodes[45] = 26;
         class27.KeyHandler_keyCodes[46] = 72;
         class27.KeyHandler_keyCodes[47] = 73;
         class27.KeyHandler_keyCodes[59] = 57;
         class27.KeyHandler_keyCodes[61] = 27;
         class27.KeyHandler_keyCodes[91] = 42;
         class27.KeyHandler_keyCodes[92] = 74;
         class27.KeyHandler_keyCodes[93] = 43;
         class27.KeyHandler_keyCodes[192] = 28;
         class27.KeyHandler_keyCodes[222] = 58;
         class27.KeyHandler_keyCodes[520] = 59;
      }

      keyHandler.method181(this.canvas, 626352654);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gy")
   protected final void method720() {
      KeyHandler.method189(keyHandler, 1392787879);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gf")
   protected abstract void vmethod70(boolean var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lq")
   public void method843() {
      this.addHierarchyListener(var0 -> {
         if ((var0.getChangeFlags() & 2L) != 0L && SecureUrlRequester.client.isDisplayable()) {
            client.method2407();
         }
      });
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("dv")
   protected void method724(classBS var1, int var2) {
      KeyHandler.method171(keyHandler, var1, var2, (byte)-88);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fw")
   public abstract void vmethod71();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   protected final void method727() {
      classWT.method11880(this.canvas, -1632238295);
   }

   @ObfuscatedSignature(descriptor = "(Lbm;I)V")
   @ObfuscatedName("yh")
   public static void method716(GameEngine var0, int var1) {
      if (var0 == null) {
         var0.setUpKeyboard(var1);
      }

      try {
         if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 >= 558529600) {
               throw new IllegalStateException();
            }

            class27.KeyHandler_keyCodes[186] = 57;
            class27.KeyHandler_keyCodes[187] = 27;
            class27.KeyHandler_keyCodes[188] = 71;
            class27.KeyHandler_keyCodes[189] = 26;
            class27.KeyHandler_keyCodes[190] = 72;
            class27.KeyHandler_keyCodes[191] = 73;
            class27.KeyHandler_keyCodes[192] = 58;
            class27.KeyHandler_keyCodes[219] = 42;
            class27.KeyHandler_keyCodes[220] = 74;
            class27.KeyHandler_keyCodes[221] = 43;
            class27.KeyHandler_keyCodes[222] = 59;
            class27.KeyHandler_keyCodes[223] = 28;
         } else {
            class27.KeyHandler_keyCodes[44] = 71;
            class27.KeyHandler_keyCodes[45] = 26;
            class27.KeyHandler_keyCodes[46] = 72;
            class27.KeyHandler_keyCodes[47] = 73;
            class27.KeyHandler_keyCodes[59] = 57;
            class27.KeyHandler_keyCodes[61] = 27;
            class27.KeyHandler_keyCodes[91] = 42;
            class27.KeyHandler_keyCodes[92] = 74;
            class27.KeyHandler_keyCodes[93] = 43;
            class27.KeyHandler_keyCodes[192] = 28;
            class27.KeyHandler_keyCodes[222] = 58;
            class27.KeyHandler_keyCodes[520] = 59;
         }

         keyHandler.method181(var0.canvas, 626352654);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ca")
   protected final void method728() {
      classWT.method11880(this.canvas, -718627468);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   final void method732() {
      Container var1 = this.container((byte)122);
      if (null != var1) {
         Bounds var2 = this.getFrameContentBounds(-2087587594);
         this.contentWidth = Math.max(var2.lowX * -434199641, this.field253 * 2042370065) * 177828229;
         this.contentHeight = Math.max(var2.lowY * 682845965, -2010281811 * this.field255) * -1701034641;
         if (this.contentWidth * -1258365107 <= 0) {
            this.contentWidth = 177828229;
         }

         if (this.contentHeight * 536394127 <= 0) {
            this.contentHeight = -1701034641;
         }

         class489.canvasWidth = Math.min(-1258365107 * this.contentWidth, this.maxCanvasWidth * -281823465) * -358468941;
         class374.canvasHeight = Math.min(this.contentHeight * 536394127, -1358276921 * this.maxCanvasHeight) * 1287631079;
         this.canvasX = 1418283131 * ((-1258365107 * this.contentWidth - class489.canvasWidth * 120179835) / 2);
         this.canvasY = 0;
         this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
         rasterProvider = new RasterProvider(120179835 * class489.canvasWidth, class374.canvasHeight * 19292887, this.canvas, this.field242);
         if (var1 == this.frame) {
            Insets var3 = this.frame.getInsets();
            this.canvas.setLocation(var3.left + this.canvasX * -81045837, this.canvasY * 289043297 + var3.top);
         } else {
            this.canvas.setLocation(-81045837 * this.canvasX, this.canvasY * 289043297);
         }

         this.isCanvasInvalid = true;
         this.resizeGame(43495521);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("rn")
   public void method854() {
      this.graphicsTick(-154633652);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dh")
   protected abstract void vmethod72();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;IIII)V")
   @ObfuscatedName("xg")
   public static void method738(GameEngine var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method812();
      } else {
         try {
            if (null != gameEngine) {
               GameEngine_redundantStartThreadCount += -1561486905;
               if (GameEngine_redundantStartThreadCount * -695052297 >= 3) {
                  method815(var0, "alreadyloaded", (byte)1);
                  return;
               }

               var0.getAppletContext().showDocument(var0.getDocumentBase(), "_self");
               return;
            }

            gameEngine = var0;
            class489.canvasWidth = var1 * -358468941;
            class374.canvasHeight = 1287631079 * var2;
            RunException.RunException_revision = -1162012723 * var3;
            classRZ.field5750 = 551286249 * var4;
            class225.RunException_applet = var0.getCodeBase();
            if (null == taskHandler) {
               taskHandler = new TaskHandler();
            }

            TaskHandler.method4876(taskHandler, var0, 1, 2108610187);
         } catch (Exception var6) {
            PlayerType.RunException_sendStackTrace(null, var6, -645531327);
            method815(var0, "crash", (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbm;IIIII)V")
   @ObfuscatedName("gv")
   public static void method739(GameEngine var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.startThread(var1, var1, var1, var1, var1);
      }

      try {
         try {
            if (null != gameEngine) {
               if (var5 == -413520061) {
                  return;
               }

               GameEngine_redundantStartThreadCount += -1561486905;
               if (GameEngine_redundantStartThreadCount * -695052297 >= 3) {
                  if (var5 == -413520061) {
                     throw new IllegalStateException();
                  }

                  method815(var0, "alreadyloaded", (byte)1);
                  return;
               }

               var0.getAppletContext().showDocument(var0.getDocumentBase(), "_self");
               return;
            }

            gameEngine = var0;
            class489.canvasWidth = var1 * -358468941;
            client.method2061(-1);
            class374.canvasHeight = 1287631079 * var2;
            client.method2501(-1);
            RunException.RunException_revision = -1162012723 * var3;
            classRZ.field5750 = 551286249 * var4;
            class225.RunException_applet = var0.getCodeBase();
            if (null == taskHandler) {
               if (var5 == -413520061) {
                  throw new IllegalStateException();
               }

               taskHandler = new TaskHandler();
            }

            TaskHandler.method4876(taskHandler, var0, 1, 1902318196);
         } catch (Exception var7) {
            PlayerType.RunException_sendStackTrace(null, var7, 2112132311);
            method815(var0, "crash", (byte)1);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bm.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hp")
   public void method838() {
      if (this.canvas != null) {
         this.canvas.removeComponentListener(this.field240);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ee")
   void method757() {
      long var1 = ParamComposition.method4949((byte)15);
      long var3 = clientTickTimes[1076182323 * HorizontalAlignment.field2257];
      clientTickTimes[1076182323 * HorizontalAlignment.field2257] = var1;
      HorizontalAlignment.field2257 = -611777029 * (1 + HorizontalAlignment.field2257 * 1076182323 & 31);
      if (0L != var3 && var1 > var3) {
      }

      synchronized (this) {
         class489.hasFocus = volatileFocus;
      }

      this.doCycle((byte)99);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("di")
   protected abstract void vmethod73();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gr")
   protected abstract void vmethod74();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   protected final void method811() {
      class166.field2021 = null;
      class237.fontHelvetica13 = null;
      class201.loginScreenFontMetrics = null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dl")
   protected final void method740(int var1, int var2, int var3, int var4) {
      try {
         if (null != gameEngine) {
            GameEngine_redundantStartThreadCount += -1561486905;
            if (GameEngine_redundantStartThreadCount * 514826192 >= 3) {
               method815(this, "alreadyloaded", (byte)1);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameEngine = this;
         class489.canvasWidth = var1 * -358468941;
         class374.canvasHeight = 1803787497 * var2;
         RunException.RunException_revision = 883222899 * var3;
         classRZ.field5750 = 760340874 * var4;
         class225.RunException_applet = this.getCodeBase();
         if (null == taskHandler) {
            taskHandler = new TaskHandler();
         }

         TaskHandler.method4876(taskHandler, this, 1, 1866934426);
      } catch (Exception var6) {
         PlayerType.RunException_sendStackTrace(null, var6, 1837179571);
         method815(this, "crash", (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dx")
   protected final void method741(int var1, int var2, int var3, int var4) {
      try {
         if (null != gameEngine) {
            GameEngine_redundantStartThreadCount += -1561486905;
            if (GameEngine_redundantStartThreadCount * -695052297 >= 3) {
               method815(this, "alreadyloaded", (byte)1);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameEngine = this;
         class489.canvasWidth = var1 * -358468941;
         class374.canvasHeight = 1287631079 * var2;
         RunException.RunException_revision = -1162012723 * var3;
         classRZ.field5750 = 551286249 * var4;
         class225.RunException_applet = this.getCodeBase();
         if (null == taskHandler) {
            taskHandler = new TaskHandler();
         }

         TaskHandler.method4876(taskHandler, this, 1, 1866445967);
      } catch (Exception var6) {
         PlayerType.RunException_sendStackTrace(null, var6, -167422281);
         method815(this, "crash", (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jb")
   public boolean method832() {
      return this.field242;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dq")
   protected final void method742(int var1, int var2, int var3, int var4) {
      try {
         if (null != gameEngine) {
            GameEngine_redundantStartThreadCount += -1561486905;
            if (GameEngine_redundantStartThreadCount * -695052297 >= 3) {
               method815(this, "alreadyloaded", (byte)1);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameEngine = this;
         class489.canvasWidth = var1 * -358468941;
         class374.canvasHeight = 1287631079 * var2;
         RunException.RunException_revision = -1162012723 * var3;
         classRZ.field5750 = 551286249 * var4;
         class225.RunException_applet = this.getCodeBase();
         if (null == taskHandler) {
            taskHandler = new TaskHandler();
         }

         TaskHandler.method4876(taskHandler, this, 1, 2060383266);
      } catch (Exception var6) {
         PlayerType.RunException_sendStackTrace(null, var6, 1848672065);
         method815(this, "crash", (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("du")
   protected final void method743(int var1, int var2, int var3, int var4) {
      try {
         if (null != gameEngine) {
            GameEngine_redundantStartThreadCount += 235295952;
            if (GameEngine_redundantStartThreadCount * -695052297 >= 3) {
               method815(this, "alreadyloaded", (byte)1);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameEngine = this;
         class489.canvasWidth = var1 * 318465649;
         class374.canvasHeight = 1287631079 * var2;
         RunException.RunException_revision = 1268093540 * var3;
         classRZ.field5750 = -1754838219 * var4;
         class225.RunException_applet = this.getCodeBase();
         if (null == taskHandler) {
            taskHandler = new TaskHandler();
         }

         TaskHandler.method4876(taskHandler, this, 1, 2109278548);
      } catch (Exception var6) {
         PlayerType.RunException_sendStackTrace(null, var6, 1786890059);
         method815(this, "crash", (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)Lrl;")
   @ObfuscatedName("mm")
   public static Bounds method822(GameEngine var0) {
      if (var0 == null) {
         var0.method826();
      }

      Container var1 = var0.container((byte)70);
      int var2 = Math.max(var1.getWidth(), 2042370065 * var0.field253);
      int var3 = Math.max(var1.getHeight(), var0.field255 * -2010281811);
      if (null != var0.frame) {
         Insets var4 = var0.frame.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dm")
   final synchronized void method746() {
      Container var1 = this.container((byte)15);
      if (null != this.canvas) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      class489.canvasWidth = Math.max(var1.getWidth(), 307416401 * this.field253) * -358468941;
      class374.canvasHeight = Math.max(var1.getHeight(), this.field255 * -2010281811) * 1549230677;
      if (this.frame != null) {
         Insets var2 = this.frame.getInsets();
         class489.canvasWidth = class489.canvasWidth - (var2.right + var2.left) * 21005299;
         class374.canvasHeight = class374.canvasHeight - 1287631079 * (var2.top + var2.bottom);
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.canvas);
      this.canvas.setSize(120179835 * class489.canvasWidth, -527641210 * class374.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (var1 == this.frame) {
         Insets var3 = this.frame.getInsets();
         this.canvas.setLocation(-1669990781 * this.canvasX + var3.left, var3.top + this.canvasY * 587726232);
      } else {
         this.canvas.setLocation(-837839604 * this.canvasX, 289043297 * this.canvasY);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.isCanvasInvalid = true;
      if (rasterProvider != null
         && rasterProvider.width * 81685145 == -1838181451 * class489.canvasWidth
         && -136501203 * rasterProvider.height == class374.canvasHeight * 1985507814) {
         ((RasterProvider)rasterProvider).setComponent(this.canvas, 1352339445);
         rasterProvider.drawFull(0, 0, (byte)48);
      } else {
         rasterProvider = new RasterProvider(class489.canvasWidth * 120179835, class374.canvasHeight * 1340051732, this.canvas, this.field242);
      }

      this.fullRedraw = false;
      this.field249 = ParamComposition.method4949((byte)15) * 3764167136456251783L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("wh")
   public static void method729(GameEngine var0) {
      classWT.method11880(var0.canvas, -890881339);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("qz")
   public static void method806(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method843();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("sa")
   public void method855(String var1) {
      method815(this, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ff")
   public final void method796(WindowEvent var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("eh")
   public static void method758(GameEngine var0) {
      if (var0 == null) {
         var0.method782();
      }

      long var1 = ParamComposition.method4949((byte)15);
      long var3 = clientTickTimes[1076182323 * HorizontalAlignment.field2257];
      clientTickTimes[-1775863332 * HorizontalAlignment.field2257] = var1;
      HorizontalAlignment.field2257 = 1221972239 * (1 + HorizontalAlignment.field2257 * 957743081 & 31);
      if (0L != var3 && var1 > var3) {
      }

      synchronized (var0) {
         class489.hasFocus = volatileFocus;
      }

      var0.doCycle((byte)60);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fc")
   protected abstract void vmethod75();

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ds")
   protected void method749(boolean var1) {
      if (this.field242 != var1) {
         this.field242 = var1;
         if (null != rasterProvider) {
            rasterProvider.method12267(var1, 469719936);
            AbstractRasterProvider.method12262(rasterProvider, (byte)11);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("de")
   protected final boolean method751() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
         return true;
      } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
         return true;
      } else if (var1.endsWith("127.0.0.1")) {
         return true;
      } else {
         while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= 1560365089 && var1.charAt(var1.length() - 1) <= -1059156597) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         if (var1.endsWith("192.168.1.")) {
            return true;
         } else {
            method815(this, "invalidhost", (byte)1);
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wu")
   public void method834() {
      if (SecureUrlRequester.client.isStretchedEnabled()) {
         java.awt.Canvas var1 = this.getCanvas();
         Dimension var2 = SecureUrlRequester.client.getStretchedDimensions();
         var1.setSize(var2);
         var1.setLocation((var1.getParent().getWidth() - var2.width) / 2, 0);
         var1.validate();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("pc")
   public void method842(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(true);
      SecureUrlRequester.client.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("da")
   final void method769() {
      Bounds var1 = this.getFrameContentBounds(-2028720996);
      if (-434199641 * var1.lowX != -1258365107 * this.contentWidth || var1.lowY * 682845965 != this.contentHeight * 536394127 || this.hasErrored) {
         this.resizeCanvas((byte)56);
         this.hasErrored = false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ob")
   public void method856() {
      this.setUp(-1963092833);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method754() {
      try {
         if (null != class373.javaVendor) {
            String var1 = class373.javaVendor.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = TaskHandler.javaVersion;
               if (var2.equals("1.1")
                  || var2.startsWith("1.1.")
                  || var2.equals("1.2")
                  || var2.startsWith("1.2.")
                  || var2.equals("1.3")
                  || var2.startsWith("1.3.")
                  || var2.equals("1.4")
                  || var2.startsWith("1.4.")
                  || var2.equals("1.5")
                  || var2.startsWith("1.5.")
                  || var2.equals("1.6.0")) {
                  method815(this, "wrongjava", (byte)1);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3 = 6;

                  while (var3 < var2.length() && class341.isDigit(var2.charAt(var3), -594914797)) {
                     var3++;
                  }

                  String var4 = var2.substring(6, var3);
                  if (ViewportMouse.isNumber(var4, -1090547205) && Message.method1204(var4, (byte)-92) < 10) {
                     method815(this, "wrongjava", (byte)1);
                     return;
                  }
               }

               fiveOrOne = -2058157338;
            }
         }

         this.setFocusCycleRoot(true);
         this.addCanvas(-231674939);
         this.setUp(-2117466075);
         class389.clock = class1.method249(-2082206047);

         while (0L == -4464936235612350065L * stopTimeMs || ParamComposition.method4949((byte)15) < stopTimeMs * -4464936235612350065L) {
            class142.gameCyclesToDo = class389.clock.wait(-1973764755 * cycleDurationMillis, -89704264 * fiveOrOne, -2038167753) * 477618439;

            for (int var6 = 0; var6 < -1250506995 * class142.gameCyclesToDo; var6++) {
               this.clientTick(-2134932912);
            }

            this.graphicsTick(-154633652);
            this.post(this.canvas, (short)24970);
         }
      } catch (Exception var5) {
         PlayerType.RunException_sendStackTrace(null, var5, -385388490);
         method815(this, "crash", (byte)1);
      }

      this.kill(1298431682);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("ff")
   public static void method707(GameEngine var0) {
      if (var0 == null) {
         var0.method700();
      }

      var0.clipboard = var0.getToolkit().getSystemClipboard();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method755() {
      try {
         if (null != class373.javaVendor) {
            String var1 = class373.javaVendor.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = TaskHandler.javaVersion;
               if (var2.equals("1.1")
                  || var2.startsWith("1.1.")
                  || var2.equals("1.2")
                  || var2.startsWith("1.2.")
                  || var2.equals("1.3")
                  || var2.startsWith("1.3.")
                  || var2.equals("1.4")
                  || var2.startsWith("1.4.")
                  || var2.equals("1.5")
                  || var2.startsWith("1.5.")
                  || var2.equals("1.6.0")) {
                  method815(this, "wrongjava", (byte)1);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3 = 6;

                  while (var3 < var2.length() && class341.isDigit(var2.charAt(var3), -1541803015)) {
                     var3++;
                  }

                  String var4 = var2.substring(6, var3);
                  if (ViewportMouse.isNumber(var4, 1451778527) && Message.method1204(var4, (byte)-65) < 10) {
                     method815(this, "wrongjava", (byte)1);
                     return;
                  }
               }

               fiveOrOne = 1599249099;
            }
         }

         this.setFocusCycleRoot(true);
         this.addCanvas(-231674939);
         this.setUp(-2065061484);
         class389.clock = class1.method249(-2082206047);

         while (0L == -4464936235612350065L * stopTimeMs || ParamComposition.method4949((byte)15) < stopTimeMs * -4464936235612350065L) {
            class142.gameCyclesToDo = class389.clock.wait(-1973764755 * cycleDurationMillis, -1975097745 * fiveOrOne, -406995388) * -1746444347;

            for (int var6 = 0; var6 < -1250506995 * class142.gameCyclesToDo; var6++) {
               this.clientTick(-2133694023);
            }

            this.graphicsTick(-154633652);
            this.post(this.canvas, (short)11830);
         }
      } catch (Exception var5) {
         PlayerType.RunException_sendStackTrace(null, var5, 1971525782);
         method815(this, "crash", (byte)1);
      }

      this.kill(2130563792);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ea")
   void method759() {
      long var1 = ParamComposition.method4949((byte)15);
      long var3 = clientTickTimes[1076182323 * HorizontalAlignment.field2257];
      clientTickTimes[1076182323 * HorizontalAlignment.field2257] = var1;
      HorizontalAlignment.field2257 = -611777029 * (1 + HorizontalAlignment.field2257 * 1076182323 & 31);
      if (0L != var3 && var1 > var3) {
      }

      synchronized (this) {
         class489.hasFocus = volatileFocus;
      }

      this.doCycle((byte)8);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dg")
   final synchronized void method747() {
      Container var1 = this.container((byte)51);
      if (null != this.canvas) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      class489.canvasWidth = Math.max(var1.getWidth(), 2042370065 * this.field253) * -358468941;
      class374.canvasHeight = Math.max(var1.getHeight(), this.field255 * -2010281811) * 1287631079;
      if (this.frame != null) {
         Insets var2 = this.frame.getInsets();
         class489.canvasWidth = class489.canvasWidth - (var2.right + var2.left) * -358468941;
         class374.canvasHeight = class374.canvasHeight - 1287631079 * (var2.top + var2.bottom);
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.canvas);
      this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (var1 == this.frame) {
         Insets var3 = this.frame.getInsets();
         this.canvas.setLocation(-81045837 * this.canvasX + var3.left, var3.top + this.canvasY * 289043297);
      } else {
         this.canvas.setLocation(-81045837 * this.canvasX, 289043297 * this.canvasY);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.isCanvasInvalid = true;
      if (rasterProvider != null
         && rasterProvider.width * 81685145 == 120179835 * class489.canvasWidth
         && -136501203 * rasterProvider.height == class374.canvasHeight * 19292887) {
         ((RasterProvider)rasterProvider).setComponent(this.canvas, 520550879);
         rasterProvider.drawFull(0, 0, (byte)-44);
      } else {
         rasterProvider = new RasterProvider(class489.canvasWidth * 120179835, class374.canvasHeight * 19292887, this.canvas, this.field242);
      }

      this.fullRedraw = false;
      this.field249 = ParamComposition.method4949((byte)15) * 3764167136456251783L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   protected final void method761() {
      this.isCanvasInvalid = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   protected static int method691() {
      int var0 = 0;
      if (Timer.garbageCollector == null || !Timer.garbageCollector.isValid()) {
         try {
            for (GarbageCollectorMXBean var2 : ManagementFactory.getGarbageCollectorMXBeans()) {
               if (var2.isValid()) {
                  Timer.garbageCollector = var2;
                  garbageCollectorLastCheckTimeMs = -5524403803700233737L;
                  garbageCollectorLastCollectionTime = -4424692208050935839L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != Timer.garbageCollector) {
         long var10 = ParamComposition.method4949((byte)15);
         long var3 = Timer.garbageCollector.getCollectionTime();
         if (-1L != -2422081617647836193L * garbageCollectorLastCollectionTime) {
            long var5 = var3 - garbageCollectorLastCollectionTime * -2422081617647836193L;
            long var7 = var10 - -948665066413299655L * garbageCollectorLastCheckTimeMs;
            if (var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         garbageCollectorLastCollectionTime = 4424692208050935839L * var3;
         garbageCollectorLastCheckTimeMs = var10 * 5524403803700233737L;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("id")
   public void method857() {
      this.kill(-316514826);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ek")
   void method765() {
      Container var1 = this.container((byte)34);
      long var2 = ParamComposition.method4949((byte)15);
      long var4 = graphicsTickTimes[FadeOutTask.field5803 * -1038172093];
      graphicsTickTimes[FadeOutTask.field5803 * -1038172093] = var2;
      FadeOutTask.field5803 = -1871999893 * (1 + FadeOutTask.field5803 * -1038172093 & 31);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = -1522158881 * (((var6 >> 1) + 32000) / var6);
      }

      if ((field232 += -1706692971) * 483945661 - 1 > 50) {
         field232 -= 564697370;
         this.isCanvasInvalid = true;
         this.canvas.setSize(class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
         this.canvas.setVisible(true);
         if (var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(var7.left + -81045837 * this.canvasX, 289043297 * this.canvasY + var7.top);
         } else {
            this.canvas.setLocation(this.canvasX * -81045837, 289043297 * this.canvasY);
         }
      }

      if (this.fullRedraw) {
         this.replaceCanvas(2144975023);
      }

      method768(this, (byte)115);
      this.draw(this.isCanvasInvalid, 238027511);
      if (this.isCanvasInvalid) {
         this.clearBackground((byte)126);
      }

      this.isCanvasInvalid = false;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;IB)V")
   @ObfuscatedName("ax")
   protected void method725(classBS var1, int var2, byte var3) {
      try {
         KeyHandler.method171(keyHandler, var1, var2, (byte)-44);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bm.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ep")
   public final void method776() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eg")
   final synchronized void method773() {
      if (!isKilled) {
         isKilled = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.kill0(2122334133);
         } catch (Exception var4) {
         }

         if (this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != taskHandler) {
            try {
               taskHandler.close(1957715721);
            } catch (Exception var2) {
            }
         }

         this.vmethod66(-1544555277);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   void clearBackground(byte var1) {
      try {
         int var2 = -81045837 * this.canvasX;
         int var3 = 289043297 * this.canvasY;
         int var4 = this.contentWidth * -1258365107 - class489.canvasWidth * 120179835 - var2;
         int var5 = this.contentHeight * 536394127 - 19292887 * class374.canvasHeight - var3;
         if (var2 <= 0) {
            if (var1 <= 63) {
               return;
            }

            if (var4 <= 0) {
               if (var1 <= 63) {
                  throw new IllegalStateException();
               }

               if (var3 <= 0) {
                  if (var1 <= 63) {
                     return;
                  }

                  if (var5 <= 0) {
                     return;
                  }

                  if (var1 <= 63) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         try {
            Container var6 = this.container((byte)70);
            int var7 = 0;
            int var8 = 0;
            if (this.frame == var6) {
               if (var1 <= 63) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.frame.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if (var2 > 0) {
               if (var1 <= 63) {
                  return;
               }

               var12.fillRect(var7, var8, var2, 536394127 * this.contentHeight);
            }

            if (var3 > 0) {
               var12.fillRect(var7, var8, -1258365107 * this.contentWidth, var3);
            }

            if (var4 > 0) {
               if (var1 <= 63) {
                  return;
               }

               var12.fillRect(-1258365107 * this.contentWidth + var7 - var4, var8, var4, this.contentHeight * 536394127);
            }

            if (var5 > 0) {
               if (var1 <= 63) {
                  return;
               }

               var12.fillRect(var7, this.contentHeight * 536394127 + var8 - var5, this.contentWidth * -1258365107, var5);
            }
         } catch (Exception var10) {
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "bm.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ak")
   public final synchronized void method789(Graphics var1) {
      if (gameEngine == this && !isKilled) {
         this.isCanvasInvalid = true;
         if (ParamComposition.method4949((byte)15) - 3775603242213170231L * this.field249 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class489.canvasWidth * 120179835 && var2.height >= class374.canvasHeight * 19292887) {
               this.fullRedraw = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("et")
   public final void method777() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrl;")
   @ObfuscatedName("gl")
   Bounds method823() {
      Container var1 = this.container((byte)62);
      int var2 = Math.max(var1.getWidth(), 2042370065 * this.field253);
      int var3 = Math.max(var1.getHeight(), this.field255 * -2010281811);
      if (null != this.frame) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ex")
   public final void method778() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   public final void method779() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = (ParamComposition.method4949((byte)15) + 4000L) * -3940398186994948753L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ey")
   public final void method780() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = (ParamComposition.method4949((byte)15) + 4000L) * -3940398186994948753L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ev")
   public final void method781() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = (ParamComposition.method4949((byte)15) + 4000L) * -3940398186994948753L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   public final void method782() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = ParamComposition.method4949((byte)15) * -3940398186994948753L;
         LoginState.method484(5000L);
         this.kill(424968193);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ic")
   public void method841() {
      this.canvas.addComponentListener(this.field240);
      this.field261 = this.canvas.getSize();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eh")
   public final void method783() {
      if (gameEngine == this && !isKilled) {
         stopTimeMs = ParamComposition.method4949((byte)15) * -3940398186994948753L;
         LoginState.method484(5000L);
         this.kill(822607663);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("eo")
   public final void method795(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gq")
   protected abstract void vmethod76();

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bn")
   protected abstract void draw(boolean var1, int var2);

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("eb")
   public final void method797(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ic")
   public boolean method858() {
      return this.hasErrored;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fb")
   public final void method800(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("es")
   protected final void method812() {
      class166.field2021 = null;
      class237.fontHelvetica13 = null;
      class201.loginScreenFontMetrics = null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("fp")
   public final void method840(Graphics var1) {
      if (!this.field241) {
         this.field241 = true;
         var1.clearRect(0, 0, this.getWidth(), this.getHeight());
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fh")
   public final void method801(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fs")
   public final void method802(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fg")
   public final void method803(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()Lrl;")
   @ObfuscatedName("gh")
   Bounds method824() {
      Container var1 = this.container((byte)45);
      int var2 = Math.max(var1.getWidth(), 2042370065 * this.field253);
      int var3 = Math.max(var1.getHeight(), this.field255 * -2010281811);
      if (null != this.frame) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fz")
   public final void method804(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fk")
   public final void method807(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gm")
   protected abstract void vmethod78(boolean var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ou")
   public void method859() {
      this.clientTick(-2130247763);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fy")
   public abstract void vmethod79();

   @ObfuscatedSignature(descriptor = "(Lbm;I)V")
   @ObfuscatedName("qi")
   public static void method813(GameEngine var0, int var1) {
      if (var0 == null) {
         var0.method767(var1);
      }

      try {
         class166.field2021 = null;
         class237.fontHelvetica13 = null;
         class201.loginScreenFontMetrics = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fu")
   public abstract void vmethod80();

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fl")
   public void method860(boolean var1) {
      this.hasErrored = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fv")
   public abstract void vmethod81();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fx")
   public abstract void vmethod82();

   @ObfuscatedSignature(descriptor = "(I)Lrl;")
   @ObfuscatedName("bq")
   Bounds getFrameContentBounds(int var1) {
      try {
         Container var2 = this.container((byte)86);
         int var3 = Math.max(var2.getWidth(), 2042370065 * this.field253);
         int var4 = Math.max(var2.getHeight(), this.field255 * -2010281811);
         if (null != this.frame) {
            if (var1 >= -1812572196) {
               throw new IllegalStateException();
            }

            Insets var5 = this.frame.getInsets();
            var3 -= var5.left + var5.right;
            var4 -= var5.top + var5.bottom;
         }

         return new Bounds(var3, var4);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bm.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZ)V")
   @ObfuscatedName("gg")
   protected final void method810(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.canvas.getGraphics();
         if (null == class237.fontHelvetica13) {
            class237.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            class201.loginScreenFontMetrics = this.canvas.getFontMetrics(class237.fontHelvetica13);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == class166.field2021) {
               class166.field2021 = this.canvas.createImage(304, 34);
            }

            Graphics var7 = class166.field2021.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class237.fontHelvetica13);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var5.drawImage(class166.field2021, class489.canvasWidth * 120179835 / 2 - 152, (var4 ? 50 : -18) + 19292887 * class374.canvasHeight / 2, null);
         } catch (Exception var10) {
            int var8 = class489.canvasWidth * 120179835 / 2 - 152;
            int var9 = class374.canvasHeight * 19292887 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(2 + var8 + 3 * var1, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(class237.fontHelvetica13);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22 + var9);
         }
      } catch (Exception var11) {
         this.canvas.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   final void method771() {
      this.hasErrored = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("vf")
   public void method861(int var1) {
      this.maxCanvasWidth = var1 * 1980952743;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("qy")
   public boolean method862() {
      return this.fullRedraw;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)Ljava/awt/Container;")
   @ObfuscatedName("yi")
   public static Container method820(GameEngine var0) {
      return (Container)(null != var0.frame ? var0.frame : var0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fa")
   protected abstract void vmethod83();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("mn")
   public static void method793(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.destroy();
      } else {
         volatileFocus = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("je")
   static boolean method833(int var0) {
      try {
         boolean var10000;
         if ((-1459845413 * client.drawPlayerNames & 4) != 0) {
            if (var0 == 842489961) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bm.je(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("fq")
   public final void method805(WindowEvent var1) {
   }

   protected GameEngine() {
      this.resizeCanvasNextFrame = false;
      this.canvasX = 0;
      this.canvasY = 0;
      this.isCanvasInvalid = true;
      this.hasErrored = false;
      this.fullRedraw = false;
      this.field249 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var4) {
      }

      this.eventQueue = var1;
      DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
      class380.pcmPlayerProvider = var2;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gn")
   protected abstract void vmethod84(boolean var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gd")
   protected abstract void vmethod85();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("go")
   protected abstract void vmethod86();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("sg")
   public void method848() {
      if (SecureUrlRequester.client.isStretchedEnabled()) {
         SecureUrlRequester.client.invalidateStretching(false);
         if (SecureUrlRequester.client.isResized()) {
            Dimension var1 = SecureUrlRequester.client.getRealDimensions();
            this.method861(var1.width);
            this.method849(var1.height);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   protected final void method762() {
      this.isCanvasInvalid = true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gx")
   protected final boolean method829() {
      return null != this.frame;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("en")
   public final void method798(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   final synchronized void addCanvas(int var1) {
      this.method838();

      try {
         Container var2 = this.container((byte)45);
         if (null != this.canvas) {
            if (var1 != -231674939) {
               this.method841();
               return;
            }

            this.canvas.removeFocusListener(this);
            var2.remove(this.canvas);
         }

         class489.canvasWidth = Math.max(var2.getWidth(), 2042370065 * this.field253) * -358468941;
         client.method2061(-1);
         class374.canvasHeight = Math.max(var2.getHeight(), this.field255 * -2010281811) * 1287631079;
         client.method2501(-1);
         if (this.frame != null) {
            if (var1 != -231674939) {
               throw new IllegalStateException();
            }

            Insets var3 = this.frame.getInsets();
            class489.canvasWidth = class489.canvasWidth - (var3.right + var3.left) * -358468941;
            client.method2061(-1);
            class374.canvasHeight = class374.canvasHeight - 1287631079 * (var3.top + var3.bottom);
            client.method2501(-1);
         }

         this.canvas = new Canvas(this);
         var2.setBackground(Color.BLACK);
         var2.setLayout(null);
         var2.add(this.canvas);
         this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
         this.canvas.setVisible(true);
         this.canvas.setBackground(Color.BLACK);
         if (var2 == this.frame) {
            if (var1 != -231674939) {
               throw new IllegalStateException();
            }

            Insets var5 = this.frame.getInsets();
            this.canvas.setLocation(-81045837 * this.canvasX + var5.left, var5.top + this.canvasY * 289043297);
         } else {
            this.canvas.setLocation(-81045837 * this.canvasX, 289043297 * this.canvasY);
         }

         label58: {
            this.canvas.addFocusListener(this);
            this.canvas.requestFocus();
            this.isCanvasInvalid = true;
            if (rasterProvider != null && rasterProvider.width * 81685145 == 120179835 * class489.canvasWidth) {
               if (var1 != -231674939) {
                  throw new IllegalStateException();
               }

               if (-136501203 * rasterProvider.height == class374.canvasHeight * 19292887) {
                  if (var1 != -231674939) {
                     throw new IllegalStateException();
                  }

                  ((RasterProvider)rasterProvider).setComponent(this.canvas, 1852837296);
                  rasterProvider.drawFull(0, 0, (byte)-69);
                  break label58;
               }
            }

            rasterProvider = new RasterProvider(class489.canvasWidth * 120179835, class374.canvasHeight * 19292887, this.canvas, this.field242);
         }

         this.fullRedraw = false;
         this.field249 = ParamComposition.method4949((byte)15) * 3764167136456251783L;
         this.method841();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bm.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("er")
   protected final void method814() {
      class166.field2021 = null;
      class237.fontHelvetica13 = null;
      class201.loginScreenFontMetrics = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gi")
   protected abstract void vmethod87();

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gt")
   protected void method816(String var1) {
      if (!this.resizeCanvasNextFrame) {
         this.resizeCanvasNextFrame = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gw")
   protected void method817(String var1) {
      if (!this.resizeCanvasNextFrame) {
         this.resizeCanvasNextFrame = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)Z")
   @ObfuscatedName("xn")
   public static boolean method752(GameEngine var0) {
      if (var0 == null) {
         var0.method732();
      }

      String var1 = var0.getDocumentBase().getHost().toLowerCase();
      if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
         return true;
      } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
         return true;
      } else if (var1.endsWith("127.0.0.1")) {
         return true;
      } else {
         while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
            var1 = var1.substring(0, var1.length() - 1);
         }

         if (var1.endsWith("192.168.1.")) {
            return true;
         } else {
            method815(var0, "invalidhost", (byte)1);
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/Container;")
   @ObfuscatedName("gz")
   Container method821() {
      return (Container)(null != this.frame ? this.frame : this);
   }

   public java.awt.Canvas getCanvas() {
      return this.canvas;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dj")
   void method735() {
      int var1 = -81045837 * this.canvasX;
      int var2 = 289043297 * this.canvasY;
      int var3 = this.contentWidth * -1258365107 - class489.canvasWidth * 120179835 - var1;
      int var4 = this.contentHeight * 536394127 - 19292887 * class374.canvasHeight - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.container((byte)62);
            int var6 = 0;
            int var7 = 0;
            if (this.frame == var5) {
               Insets var8 = this.frame.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, 536394127 * this.contentHeight);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, -1258365107 * this.contentWidth, var2);
            }

            if (var3 > 0) {
               var10.fillRect(-1258365107 * this.contentWidth + var6 - var3, var7, var3, this.contentHeight * 536394127);
            }

            if (var4 > 0) {
               var10.fillRect(var6, this.contentHeight * 536394127 + var7 - var4, this.contentWidth * -1258365107, var4);
            }
         } catch (Exception var9) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbm;IIB)V")
   @ObfuscatedName("xy")
   public static void method845(GameEngine var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.setMaxCanvasSize(var1, var1, var3);
      } else {
         if (SecureUrlRequester.client.isStretchedEnabled() && SecureUrlRequester.client.isResized()) {
            Dimension var4 = SecureUrlRequester.client.getRealDimensions();
            var1 = var4.width;
            var2 = var4.height;
         }

         int var7 = var2;
         int var6 = var1;
         GameEngine var5 = var0;
         byte var8 = 20;

         try {
            label30: {
               if (var6 == var5.maxCanvasWidth * -281823465) {
                  if (var5.maxCanvasHeight * -1358276921 == var7) {
                     break label30;
                  }

                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }
               }

               var5.method770(-1595015587);
            }

            var5.maxCanvasWidth = 1980952743 * var6;
            var5.maxCanvasHeight = 1489603319 * var7;
         } catch (RuntimeException var9) {
            throw RestClientThreadFactory.newRunException(var9, "bm.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fm")
   protected abstract void vmethod88();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ge")
   protected final boolean method830() {
      return null != this.frame;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gp")
   protected final boolean method831() {
      return null != this.frame;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ab")
   protected final void method721(byte var1) {
      try {
         KeyHandler.method189(keyHandler, 600422317);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("el")
   final synchronized void method774() {
      if (!isKilled) {
         isKilled = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.kill0(1390268532);
         } catch (Exception var4) {
         }

         if (this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != taskHandler) {
            try {
               taskHandler.close(1761436899);
            } catch (Exception var2) {
            }
         }

         this.vmethod66(719585082);
      }
   }

   @Override
   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.windowOpened(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   protected static int method692() {
      int var0 = 0;
      if (Timer.garbageCollector == null || !Timer.garbageCollector.isValid()) {
         try {
            for (GarbageCollectorMXBean var2 : ManagementFactory.getGarbageCollectorMXBeans()) {
               if (var2.isValid()) {
                  Timer.garbageCollector = var2;
                  garbageCollectorLastCheckTimeMs = -5524403803700233737L;
                  garbageCollectorLastCollectionTime = -4424692208050935839L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != Timer.garbageCollector) {
         long var10 = ParamComposition.method4949((byte)15);
         long var3 = Timer.garbageCollector.getCollectionTime();
         if (-1L != -2422081617647836193L * garbageCollectorLastCollectionTime) {
            long var5 = var3 - garbageCollectorLastCollectionTime * -2422081617647836193L;
            long var7 = var10 - -948665066413299655L * garbageCollectorLastCheckTimeMs;
            if (var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         garbageCollectorLastCollectionTime = 4424692208050935839L * var3;
         garbageCollectorLastCheckTimeMs = var10 * 5524403803700233737L;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ej")
   void method766() {
      Container var1 = this.container((byte)23);
      long var2 = ParamComposition.method4949((byte)15);
      long var4 = graphicsTickTimes[FadeOutTask.field5803 * -1038172093];
      graphicsTickTimes[FadeOutTask.field5803 * -1038172093] = var2;
      FadeOutTask.field5803 = -1871999893 * (1 + FadeOutTask.field5803 * -1038172093 & 31);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = -1522158881 * (((var6 >> 1) + 32000) / var6);
      }

      if ((field232 += -1706692971) * 483945661 - 1 > 50) {
         field232 -= 564697370;
         this.isCanvasInvalid = true;
         this.canvas.setSize(class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
         this.canvas.setVisible(true);
         if (var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(var7.left + -81045837 * this.canvasX, 289043297 * this.canvasY + var7.top);
         } else {
            this.canvas.setLocation(this.canvasX * -81045837, 289043297 * this.canvasY);
         }
      }

      if (this.fullRedraw) {
         this.replaceCanvas(2142841585);
      }

      method768(this, (byte)115);
      this.draw(this.isCanvasInvalid, -1488848680);
      if (this.isCanvasInvalid) {
         this.clearBackground((byte)115);
      }

      this.isCanvasInvalid = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/lang/String;)V")
   @ObfuscatedName("oh")
   public static void method711(GameEngine var0, String var1) {
      var0.clipboard.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "(FFFI)F")
   @ObfuscatedName("au")
   public static float method693(float var0, float var1, float var2, int var3) {
      try {
         if (var1 < var0) {
            if (var3 == 1663569182) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
            }
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bm.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ay")
   protected final void setMaxCanvasSize(int var1, int var2, byte var3) {
      if (SecureUrlRequester.client.isResized() && SecureUrlRequester.client.isStretchedEnabled()) {
         Dimension var4 = SecureUrlRequester.client.getRealDimensions();
         var1 = var4.width;
         var2 = var4.height;
      }

      int var7 = var2;
      int var6 = var1;
      GameEngine var5 = this;
      byte var8 = 20;

      try {
         label27: {
            if (var6 == var5.field255 * -281823465) {
               if (var5.canvasY * -1358276921 == var7) {
                  break label27;
               }

               if (var8 == 1) {
                  throw new IllegalStateException();
               }
            }

            var5.method770(-1595015587);
         }

         var5.maxCanvasWidth = 1980952743 * var6;
         var5.field255 = 1489603319 * var7;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "bm.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   protected final void setUpKeyboard(int var1) {
      try {
         if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            if (var1 >= 558529600) {
               throw new IllegalStateException();
            }

            class27.KeyHandler_keyCodes[186] = 57;
            class27.KeyHandler_keyCodes[187] = 27;
            class27.KeyHandler_keyCodes[188] = 71;
            class27.KeyHandler_keyCodes[189] = 26;
            class27.KeyHandler_keyCodes[190] = 72;
            class27.KeyHandler_keyCodes[191] = 73;
            class27.KeyHandler_keyCodes[192] = 58;
            class27.KeyHandler_keyCodes[219] = 42;
            class27.KeyHandler_keyCodes[220] = 74;
            class27.KeyHandler_keyCodes[221] = 43;
            class27.KeyHandler_keyCodes[222] = 59;
            class27.KeyHandler_keyCodes[223] = 28;
         } else {
            class27.KeyHandler_keyCodes[44] = 71;
            class27.KeyHandler_keyCodes[45] = 26;
            class27.KeyHandler_keyCodes[46] = 72;
            class27.KeyHandler_keyCodes[47] = 73;
            class27.KeyHandler_keyCodes[59] = 57;
            class27.KeyHandler_keyCodes[61] = 27;
            class27.KeyHandler_keyCodes[91] = 42;
            class27.KeyHandler_keyCodes[92] = 74;
            class27.KeyHandler_keyCodes[93] = 43;
            class27.KeyHandler_keyCodes[192] = 28;
            class27.KeyHandler_keyCodes[222] = 58;
            class27.KeyHandler_keyCodes[520] = 59;
         }

         keyHandler.method181(this.canvas, 626352654);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bm.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ao")
   protected final void startThread(int var1, int var2, int var3, int var4, int var5) {
      try {
         try {
            if (null != gameEngine) {
               if (var5 == -413520061) {
                  return;
               }

               field232 += -1561486905;
               if (field232 * -695052297 >= 3) {
                  if (var5 == -413520061) {
                     throw new IllegalStateException();
                  }

                  method815(this, "alreadyloaded", (byte)1);
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            gameEngine = this;
            class489.canvasWidth = var1 * -358468941;
            client.method2039(-1);
            class374.canvasHeight = 1287631079 * var2;
            client.method2519(-1);
            RunException.RunException_revision = -1162012723 * var3;
            classRZ.field5750 = 551286249 * var4;
            class225.RunException_applet = this.getCodeBase();
            if (null == taskHandler) {
               if (var5 == -413520061) {
                  throw new IllegalStateException();
               }

               taskHandler = new TaskHandler();
            }

            TaskHandler.method4876(taskHandler, this, 1, 1902318196);
         } catch (Exception var7) {
            PlayerType.RunException_sendStackTrace(null, var7, 2112132311);
            method815(this, "crash", (byte)1);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bm.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bh")
   protected final void method767(int var1) {
      this.method841();

      try {
         Container var2 = this.container((byte)126);
         long var3 = ParamComposition.method4949((byte)15);
         long var5 = clientTickTimes[FadeOutTask.field5803 * -1038172093];
         clientTickTimes[FadeOutTask.field5803 * -1038172093] = var3;
         FadeOutTask.field5803 = -1871999893 * (1 + FadeOutTask.field5803 * -1038172093 & 31);
         if (0L != var5) {
            if (var1 != -154633652) {
               return;
            }

            if (var3 > var5) {
               if (var1 != -154633652) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               fps = -1522158881 * (((var7 >> 1) + 32000) / var7);
            }
         }

         if ((fiveOrOne += -1706692971) * 483945661 - 1 > 50) {
            if (var1 != -154633652) {
               throw new IllegalStateException();
            }

            fiveOrOne = GameEngine_redundantStartThreadCount - 564697370;
            this.isCanvasInvalid = true;
            this.canvas.setSize(class489.canvasWidth * 120179835, 19292887 * class374.canvasHeight);
            this.canvas.setVisible(true);
            if (var2 == this.frame) {
               if (var1 != -154633652) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.frame.getInsets();
               this.canvas.setLocation(var9.left + -81045837 * this.maxCanvasWidth, 289043297 * this.field255 + var9.top);
            } else {
               this.canvas.setLocation(this.field255 * -81045837, 289043297 * this.canvasY);
            }
         }

         if (this.isCanvasInvalid) {
            this.replaceCanvas(2144098864);
         }

         method768(this, (byte)115);
         this.draw(this.fullRedraw, 279644354);
         if (this.isCanvasInvalid) {
            if (var1 != -154633652) {
               throw new IllegalStateException();
            }

            this.clearBackground((byte)95);
         }

         this.isCanvasInvalid = false;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bm.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("bl")
   protected void error(String var1, byte var2) {
      try {
         if (this.resizeCanvasNextFrame) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }
         } else {
            this.resizeCanvasNextFrame = true;
            System.out.println("error_game_" + var1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bm.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bz")
   final void method733(byte var1) {
      this.method839();

      try {
         Container var2 = this.container((byte)9);
         if (null == var2) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               this.unblockStartup();
            }
         } else {
            Bounds var3 = this.getFrameContentBounds(-1827490821);
            this.contentWidth = Math.max(var3.highY * -434199641, this.maxCanvasWidth * 2042370065) * 177828229;
            this.contentHeight = Math.max(var3.highX * 682845965, -2010281811 * this.maxCanvasHeight) * -1701034641;
            if (this.contentWidth * -1258365107 <= 0) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               this.contentWidth = 177828229;
            }

            if (this.contentHeight * 536394127 <= 0) {
               if (var1 == 0) {
                  this.method839();
                  return;
               }

               this.contentWidth = -1701034641;
            }

            class489.canvasWidth = Math.min(-1258365107 * this.contentWidth, this.field255 * -281823465) * -358468941;
            client.method2322(-1);
            class374.canvasHeight = Math.min(this.contentWidth * 536394127, -1358276921 * this.maxCanvasWidth) * 1287631079;
            client.method2463(-1);
            this.maxCanvasHeight = 1418283131 * ((-1258365107 * this.contentWidth - class489.canvasWidth * 120179835) / 2);
            this.field255 = 0;
            this.canvas.setSize(120179835 * class489.canvasWidth, 19292887 * class374.canvasHeight);
            rasterProvider = new RasterProvider(120179835 * class489.canvasWidth, class374.canvasHeight * 19292887, this.canvas, this.field242);
            if (var2 == this.frame) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.frame.getInsets();
               this.canvas.setLocation(var4.left + this.field253 * -81045837, this.field255 * 289043297 + var4.top);
            } else {
               this.canvas.setLocation(-81045837 * this.canvasX, this.canvasX * 289043297);
            }

            this.fullRedraw = true;
            this.resizeGame(43495521);
            this.run();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bm.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrl;")
   @ObfuscatedName("gv")
   Bounds method826() {
      Container var1 = this.container((byte)70);
      int var2 = Math.max(var1.getWidth(), 2042370065 * this.maxCanvasHeight);
      int var3 = Math.max(var1.getHeight(), this.field253 * -2010281811);
      if (null != this.frame) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("db")
   final void method737() {
      keyHandler.method183(this.canvas, -1207941268);
      java.awt.Canvas var1 = this.canvas;
      var1.removeMouseListener(MouseHandler.MouseHandler_instance);
      var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_lastButtonVolatile = 0;
      if (this.mouseWheelHandler != null) {
         MouseWheelHandler.method82(this.mouseWheelHandler, this.canvas, 416625921);
      }

      this.kill(-231674939);
      keyHandler.method181(this.canvas, 626352654);
      classWT.method11880(this.canvas, -989256333);
      if (null != this.mouseWheelHandler) {
         MouseWheelHandler.method76(this.mouseWheelHandler, this.canvas, (byte)-127);
      }

      this.replaceCanvas(-1595015587);
   }
}
