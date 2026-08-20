import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Panel;
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
import net.runelite.api.ClientConfiguration;
import net.runelite.api.Constants;
import net.runelite.api.GameEngine;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tq")
public abstract class classTQ extends Panel implements Runnable, FocusListener, WindowListener, rl0, GameEngine {
   @ObfuscatedName("rb")
   static long[] field6195 = new long[32];
   @ObfuscatedName("mo")
   public Dimension field6220;
   @ObfuscatedName("qb")
   public static int field6193 = 0;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("qw")
   static classTQ field6189 = null;
   @ObfuscatedName("ss")
   volatile long field6210;
   @ObfuscatedName("rl")
   static long field6191 = 0L;
   @ObfuscatedName("xg")
   public final ComponentListener field6201 = new rl12(this);
   @ObfuscatedName("or")
   public Semaphore field6224;
   @ObfuscatedName("rv")
   int field6215;
   @ObfuscatedName("qg")
   protected static int field6187 = 1308258444;
   @ObfuscatedName("rf")
   static int field6196 = -499435836;
   @ObfuscatedName("rh")
   int field6213;
   @ObfuscatedName("rg")
   static volatile boolean field6190 = true;
   @ObfuscatedName("ra")
   static int field6194 = 585748989;
   @ObfuscatedSignature(descriptor = "Lti;")
   @ObfuscatedName("rn")
   static classTI field6198 = new classTI();
   @ObfuscatedName("rd")
   static long field6199 = -6728113685686042049L;
   @ObfuscatedName("rc")
   static long field6188 = 1622412589189406289L;
   @ObfuscatedName("rw")
   final EventQueue field6211;
   @ObfuscatedName("rm")
   static long[] field6197 = new long[32];
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6212 = 71;
   @ObfuscatedName("rr")
   public boolean field6203;
   @ObfuscatedName("sc")
   boolean field6204;
   @ObfuscatedName("rs")
   int field6205;
   @ObfuscatedName("rq")
   public ClientConfiguration field6225;
   @ObfuscatedName("rx")
   static boolean field6192 = false;
   @ObfuscatedName("rp")
   int field6214;
   @ObfuscatedName("so")
   int field6218;
   @ObfuscatedName("en")
   public boolean field6202 = false;
   @ObfuscatedName("sb")
   int field6216;
   @ObfuscatedName("fc")
   public Thread field6223;
   @ObfuscatedName("sm")
   int field6217;
   @ObfuscatedName("sz")
   Frame field6221;
   @ObfuscatedName("sp")
   Canvas field6219;
   @ObfuscatedName("sx")
   volatile boolean field6207;
   @ObfuscatedName("rt")
   boolean field6208;
   @ObfuscatedName("sr")
   volatile boolean field6209;
   @ObfuscatedName("rk")
   static int field6200 = 0;
   @ObfuscatedSignature(descriptor = "Ltc;")
   @ObfuscatedName("si")
   classTC field6226;
   @ObfuscatedName("sq")
   Clipboard field6222;
   @ObfuscatedName("ri")
   int field6206;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajn")
   public final void method11040() {
      if (field6189 == this && !field6192) {
         field6191 = (classDD.method2983(16711680) + 4000L) * -7013317878618397317L;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aik")
   protected final boolean method11011() {
      String var1 = this.method11091().getHost().toLowerCase();
      if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
         return true;
      } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
         return true;
      } else if (var1.endsWith("127.0.0.1")) {
         return true;
      } else {
         while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= 1955637880 && var1.charAt(var1.length() - 1) <= 1363998760) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         if (var1.endsWith("192.168.1.")) {
            return true;
         } else {
            method11076(this, "invalidhost", -843943309);
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltq;I)V")
   @ObfuscatedName("js")
   public static void method11027(classTQ var0, int var1) {
      if (var0 == null) {
         var0.method11031(var1);
      } else {
         var0.method11099();

         try {
            Container var2 = var0.method11079(700771541);
            long var3 = classDD.method2983(16711680);
            long var5 = field6197[-1804509917 * classFW.field2417];
            field6197[classFW.field2417 * -1804509917] = var3;
            classFW.field2417 = (1 + classFW.field2417 * -1804509917 & 31) * 1510849163;
            if (0L != var5 && var3 > var5) {
               if (var1 <= -3745303) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               field6193 = ((var7 >> 1) + 32000) / var7 * -393098901;
            }

            if ((field6196 += 2069175365) * 801347213 - 1 > 50) {
               if (var1 <= -3745303) {
                  return;
               }

               field6196 -= 379553146;
               var0.field6207 = true;
               var0.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
               var0.field6219.setVisible(true);
               if (var2 == var0.field6221) {
                  if (var1 <= -3745303) {
                     return;
                  }

                  Insets var9 = var0.field6221.getInsets();
                  var0.field6219.setLocation(var9.left + 1451619303 * var0.field6205, var9.top + -673776453 * var0.field6206);
               } else {
                  var0.field6219.setLocation(var0.field6205 * 1451619303, var0.field6206 * -673776453);
               }
            }

            if (var0.field6209) {
               if (var1 <= -3745303) {
                  throw new IllegalStateException();
               }

               var0.method11105((byte)-76);
            }

            var0.method11032(795576551);
            var0.vmethod237(var0.field6207, -397184520);
            if (var0.field6207) {
               if (var1 <= -3745303) {
                  return;
               }

               var0.method10996((byte)-87);
            }

            var0.field6207 = false;
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "tq.agi(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;B)V")
   @ObfuscatedName("afd")
   final void method11108(Object var1, byte var2) {
      if (!classOE.field4843.isGpu() && this.field6211 != null) {
         for (int var3 = 0; var3 < 50 && this.field6211.peekEvent() != null; var3++) {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var5) {
            }
         }

         if (var1 != null) {
            this.field6211.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }

      if (client.field1118 != null) {
         client.field1118.draw(classGP.field2650);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aft")
   protected void method10960(int var1) {
      try {
         this.field6222 = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.aft(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("afm")
   protected final void method10986(int var1) {
      try {
         Canvas var2 = this.field6219;
         var2.addMouseListener(classTZ.field6259);
         var2.addMouseMotionListener(classTZ.field6259);
         var2.addFocusListener(classTZ.field6259);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tq.afm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agm")
   final void method10990(int var1) {
      this.method11094();

      try {
         Container var2 = this.method11079(-1484383774);
         if (null == var2) {
            this.method11098();
         } else {
            classUQ var3 = this.method11086(918325363);
            this.field6214 = Math.max(518523273 * var3.field6370, 237759111 * this.field6215) * 833806867;
            this.field6213 = Math.max(var3.field6371 * -874893249, -450704939 * this.field6218) * -181673913;
            if (39467035 * this.field6214 <= 0) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               this.field6214 = 833806867;
            }

            if (1525008759 * this.field6213 <= 0) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               this.field6213 = -181673913;
            }

            classSA.field5897 = Math.min(39467035 * this.field6214, this.field6216 * 1937290719) * -2089155421;
            client.method2315(-1);
            classEU.field1938 = Math.min(1525008759 * this.field6213, 697093715 * this.field6217) * 841518155;
            client.method2345(-1);
            this.field6205 = 828993495 * ((39467035 * this.field6214 - classSA.field5897 * 773246731) / 2);
            this.field6206 = 0;
            this.field6219.setSize(773246731 * classSA.field5897, 8379747 * classEU.field1938);
            classWO.field6763 = new classTG(classSA.field5897 * 773246731, classEU.field1938 * 8379747, this.field6219, this.field6203);
            if (var2 == this.field6221) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.field6221.getInsets();
               this.field6219.setLocation(1451619303 * this.field6205 + var4.left, -673776453 * this.field6206 + var4.top);
            } else {
               this.field6219.setLocation(this.field6205 * 1451619303, this.field6206 * -673776453);
            }

            this.field6207 = true;
            this.vmethod250((byte)17);
            this.method11098();
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tq.agm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aga")
   protected final void method11024(byte var1) {
      try {
         this.field6207 = true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.aga(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("age")
   void method10996(byte var1) {
      try {
         int var2 = this.field6205 * 1451619303;
         int var3 = this.field6206 * -673776453;
         int var4 = this.field6214 * 39467035 - 773246731 * classSA.field5897 - var2;
         int var5 = 1525008759 * this.field6213 - 8379747 * classEU.field1938 - var3;
         if (var2 <= 0) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (var4 <= 0) {
               if (var1 >= 0) {
                  return;
               }

               if (var3 <= 0) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 0) {
                     return;
                  }
               }
            }
         }

         try {
            Container var6 = this.method11079(-998200741);
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field6221) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.field6221.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if (var2 > 0) {
               var12.fillRect(var7, var8, var2, 1525008759 * this.field6213);
            }

            if (var3 > 0) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, this.field6214 * 39467035, var3);
            }

            if (var4 > 0) {
               var12.fillRect(this.field6214 * 39467035 + var7 - var4, var8, var4, this.field6213 * 1525008759);
            }

            if (var5 > 0) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8 + 1525008759 * this.field6213 - var5, this.field6214 * 39467035, var5);
            }
         } catch (Exception var10) {
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "tq.age(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("agb")
   final void method11105(byte var1) {
      this.method11115(false);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("agf")
   protected final void method11000(int var1, int var2, int var3, int var4, int var5) {
      try {
         try {
            if (null != field6189) {
               if (var5 >= 1651537548) {
                  throw new IllegalStateException();
               }

               field6200 += 354831441;
               if (221150385 * field6200 >= 3) {
                  if (var5 >= 1651537548) {
                     throw new IllegalStateException();
                  }

                  method11076(this, "alreadyloaded", 1813484727);
                  return;
               }

               this.method11090().vmethod561(this.method11091(), "_self");
               return;
            }

            field6189 = this;
            classSA.field5897 = var1 * -2089155421;
            client.method2315(-1);
            classEU.field1938 = 841518155 * var2;
            client.method2345(-1);
            classAAL.field57 = var3 * -154973313;
            classAAF.field46 = -609160337 * var4;
            classAAF.field49 = this.method11107();
            if (classWW.field6786 == null) {
               if (var5 >= 1651537548) {
                  throw new IllegalStateException();
               }

               classWW.field6786 = new classMB();
            }

            classWW.field6786.method7517(this, 1, 16502140);
         } catch (Exception var7) {
            classAAU.method275(null, var7, (byte)83);
            method11076(this, "crash", 1494929511);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "tq.agf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("adl")
   protected abstract void vmethod251();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("sx")
   public void method11092() {
      this.addHierarchyListener(var0 -> {
         if ((var0.getChangeFlags() & 2L) != 0L && classOE.field4843.isDisplayable()) {
            client.method2370();
         }
      });
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("gd")
   public static void method11025(classTQ var0) {
      if (var0 == null) {
         var0.method11096();
      }

      var0.field6207 = true;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("agg")
   protected void method11100(boolean var1, int var2) {
      if (this.field6203 != var1) {
         this.field6203 = var1;
         var1 &= !classOE.field4843.isGpu();
         classWO.field6763.method13323(var1);
         classWO.field6763.method13322();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("akg")
   public final void method11058(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aco")
   protected abstract void vmethod243();

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agu")
   void method11019(int var1) {
      try {
         long var2 = classDD.method2983(16711680);
         long var4 = field6195[75872381 * classMD.field4487];
         field6195[75872381 * classMD.field4487] = var2;
         classMD.field4487 = (1 + 75872381 * classMD.field4487 & 31) * -911507243;
         if (var4 != 0L) {
            if (var1 == -1485028444) {
               throw new IllegalStateException();
            }

            if (var2 > var4) {
            }
         }

         synchronized (this) {
            classDD.field1405 = field6190;
         }

         this.vmethod231((byte)91);
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "tq.agu(" + ')');
      }
   }

   public abstract void init();

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("iz")
   public String method11101(String var1) {
      return this.field6225.getParameter(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/lang/String;)V")
   @ObfuscatedName("jt")
   public static void method10961(classTQ var0, String var1) {
      var0.field6222.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agz")
   final void method11032(int var1) {
      try {
         classUQ var2 = this.method11086(790055939);
         if (518523273 * var2.field6370 == 39467035 * this.field6214) {
            if (var1 <= 387260065) {
               return;
            }

            if (-874893249 * var2.field6371 == 1525008759 * this.field6213) {
               if (var1 <= 387260065) {
                  throw new IllegalStateException();
               }

               if (!this.field6208) {
                  return;
               }

               if (var1 <= 387260065) {
                  throw new IllegalStateException();
               }
            }
         }

         this.method10990(1684778192);
         this.field6208 = false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tq.agz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("agr")
   final synchronized void method11038(byte var1) {
      try {
         if (field6192) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }
         } else {
            field6192 = true;

            try {
               this.field6219.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.vmethod240(1781169542);
            } catch (Exception var5) {
            }

            if (this.field6221 != null) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (classWW.field6786 != null) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               try {
                  classWW.field6786.method7504((short)20932);
               } catch (Exception var3) {
               }
            }

            this.vmethod207(294971065);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "tq.agr(" + ')');
      }
   }

   public final void start() {
      this.method11092();

      try {
         if (this == field6189 && !field6192) {
            field6191 = 0L;
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tq.start(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Luq;")
   @ObfuscatedName("akf")
   classUQ method11083() {
      Container var1 = this.method11079(-1698579921);
      int var2 = Math.max(var1.getWidth(), 237759111 * this.field6215);
      int var3 = Math.max(var1.getHeight(), this.field6218 * -450704939);
      if (this.field6221 != null) {
         Insets var4 = this.field6221.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new classUQ(var2, var3);
   }

   public final void destroy() {
      try {
         if (field6189 == this && !field6192) {
            field6191 = classDD.method2983(16711680) * -7013317878618397317L;
            classRP.method10149(5000L);
            this.method11038((byte)-11);
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tq.destroy(" + ')');
      }
   }

   @Override
   public final synchronized void paint(Graphics var1) {
      this.method11103(var1);

      try {
         if (field6189 == this && !field6192) {
            this.field6207 = true;
            if (classDD.method2983(16711680) - this.field6210 * -5853619249873121909L > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (null == var2 || var2.width >= 773246731 * classSA.field5897 && var2.height >= 8379747 * classEU.field1938) {
                  this.field6209 = true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tq.paint(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agv")
   protected final void method11071(int var1) {
      try {
         classLY.field4443 = null;
         classAB.field123 = null;
         classAF.field145 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.agv(" + ')');
      }
   }

   @Override
   public final void focusLost(FocusEvent var1) {
      try {
         field6190 = false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.focusLost(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("ny")
   public static void method11041(classTQ var0) {
      if (var0 == null) {
         var0.method11017();
      } else if (field6189 == var0 && !field6192) {
         field6191 = (classDD.method2983(16711680) + 4000L) * -7013317878618397317L;
      }
   }

   @Override
   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowActivated(" + ')');
      }
   }

   @Override
   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowClosed(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("hs")
   protected abstract void vmethod237(boolean var1, int var2);

   @Override
   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowDeactivated(" + ')');
      }
   }

   @Override
   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowDeiconified(" + ')');
      }
   }

   @Override
   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowOpened(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hb")
   protected abstract void vmethod228(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("nv")
   public static void method10991(classTQ var0) {
      if (var0 == null) {
         var0.method10983();
      }

      Container var1 = var0.method11079(-217206153);
      if (null != var1) {
         classUQ var2 = var0.method11086(1114203534);
         var0.field6214 = Math.max(1142070103 * var2.field6370, 237759111 * var0.field6215) * 490288056;
         var0.field6213 = Math.max(var2.field6371 * -874893249, 466774250 * var0.field6218) * -665172647;
         if (39467035 * var0.field6214 <= 0) {
            var0.field6214 = 833806867;
         }

         if (-72991790 * var0.field6213 <= 0) {
            var0.field6213 = -181673913;
         }

         classSA.field5897 = Math.min(-738935847 * var0.field6214, var0.field6216 * 1937290719) * -1191905764;
         classEU.field1938 = Math.min(1525008759 * var0.field6213, 697093715 * var0.field6217) * 841518155;
         var0.field6205 = 579240516 * ((1216810758 * var0.field6214 - classSA.field5897 * -448671383) / 2);
         var0.field6206 = 0;
         var0.field6219.setSize(-1925046179 * classSA.field5897, 1483836700 * classEU.field1938);
         classWO.field6763 = new classTG(classSA.field5897 * 1492222171, classEU.field1938 * 1962161828, var0.field6219, var0.field6203);
         if (var1 == var0.field6221) {
            Insets var3 = var0.field6221.getInsets();
            var0.field6219.setLocation(1451619303 * var0.field6205 + var3.left, 2086326995 * var0.field6206 + var3.top);
         } else {
            var0.field6219.setLocation(var0.field6205 * 812696419, var0.field6206 * -673776453);
         }

         var0.field6207 = true;
         var0.vmethod250((byte)110);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/net/URL;")
   @ObfuscatedName("cs")
   public URL method11107() {
      return this.field6225.getCodeBase();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajm")
   public final void method11056(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ltq;I)V")
   @ObfuscatedName("ck")
   public static void method11034(classTQ var0, int var1) {
      if (var0 == null) {
         var0.method10995(var1);
      } else {
         try {
            var0.field6208 = true;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "tq.ags(" + ')');
         }
      }
   }

   @Override
   public void run() {
      this.field6223 = Thread.currentThread();
      this.field6223.setName("Client");
      this.field6223.setUncaughtExceptionHandler((var0, var1x) -> method11117(null, var1x));

      try {
         this.setFocusCycleRoot(true);
         this.method11122();
         this.method11111();
         classTW.field6250 = new classMG();
         if (Boolean.getBoolean("runelite.delaystart")) {
            this.field6224 = new Semaphore(0);
            this.field6224.acquire();
         }

         while (0L == field6191 * -4157353362753048141L) {
            classSI.field5964 = classTW.field6250.vmethod536(20, 1) * -1242900443;

            for (int var1 = 0; var1 < classSI.field5964 * 1906148269; var1++) {
               this.method11109();
            }

            if (classMG.field4503) {
               this.method11113();
               this.method11119(this.field6219);
            }
         }
      } catch (Exception var2) {
         method11117(null, var2);
         this.method11116("crash");
      }

      this.method11112();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ir")
   protected abstract void vmethod240(int var1);

   public void setConfiguration(ClientConfiguration var1) {
      if (this.field6225 != null) {
         throw new IllegalStateException();
      } else {
         this.field6225 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZB)V")
   @ObfuscatedName("agk")
   protected final void method11067(int var1, String var2, boolean var3, boolean var4, byte var5) {
      try {
         try {
            Graphics var6 = this.field6219.getGraphics();
            if (null == classAB.field123) {
               classAB.field123 = new Font("Helvetica", 1, 13);
               classAF.field145 = this.field6219.getFontMetrics(classAB.field123);
            }

            if (var3) {
               if (var5 == 1) {
                  return;
               }

               if (!var4) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  var6.setColor(Color.black);
                  var6.fillRect(0, 0, classSA.field5897 * 773246731, 8379747 * classEU.field1938);
               }
            }

            Color var7 = new Color(140, 17, 17);

            try {
               if (null == classLY.field4443) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  classLY.field4443 = this.field6219.createImage(304, 34);
               }

               Graphics var8 = classLY.field4443.getGraphics();
               var8.setColor(var7);
               var8.drawRect(0, 0, 303, 33);
               var8.fillRect(2, 2, var1 * 3, 30);
               var8.setColor(Color.black);
               var8.drawRect(1, 1, 301, 31);
               var8.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
               var8.setFont(classAB.field123);
               var8.setColor(Color.white);
               var8.drawString(var2, (304 - classAF.field145.stringWidth(var2)) / 2, 22);
               int var10002 = classSA.field5897 * 773246731 / 2 - 152;
               int var10003 = classEU.field1938 * 8379747 / 2;
               byte var10004;
               if (var4) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  var10004 = 50;
               } else {
                  var10004 = -18;
               }

               var6.drawImage(classLY.field4443, var10002, var10003 + var10004, null);
            } catch (Exception var11) {
               int var9 = classSA.field5897 * 773246731 / 2 - 152;
               int var10 = 8379747 * classEU.field1938 / 2 - 18;
               var6.setColor(var7);
               var6.drawRect(var9, var10, 303, 33);
               var6.fillRect(var9 + 2, 2 + var10, 3 * var1, 30);
               var6.setColor(Color.black);
               var6.drawRect(1 + var9, var10 + 1, 301, 31);
               var6.fillRect(var9 + 2 + var1 * 3, 2 + var10, 300 - 3 * var1, 30);
               var6.setFont(classAB.field123);
               var6.setColor(Color.white);
               var6.drawString(var2, var9 + (304 - classAF.field145.stringWidth(var2)) / 2, var10 + 22);
            }
         } catch (Exception var12) {
            this.field6219.repaint();
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "tq.agk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/lang/String;I)V")
   @ObfuscatedName("oq")
   public static void method11076(classTQ var0, String var1, int var2) {
      if (var0 == null) {
         var0.method11078(var1, var2);
      } else {
         try {
            if (var0.field6204) {
               if (var2 <= -877384413) {
                  throw new IllegalStateException();
               }
            } else {
               var0.field6204 = true;
               System.out.println("error_game_" + var1);

               try {
                  var0.method11090().vmethod561(new URL(var0.method11107(), "error_game_" + var1 + ".ws"), "_self");
               } catch (Exception var4) {
               }
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "tq.agh(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Luq;")
   @ObfuscatedName("akz")
   classUQ method11084() {
      Container var1 = this.method11079(-1757963978);
      int var2 = Math.max(var1.getWidth(), 2128739322 * this.field6215);
      int var3 = Math.max(var1.getHeight(), this.field6218 * -450704939);
      if (this.field6221 != null) {
         Insets var4 = this.field6221.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new classUQ(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("aja")
   public final void method11059(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/awt/Container;")
   @ObfuscatedName("agj")
   Container method11079(int var1) {
      try {
         if (null != this.field6221) {
            if (var1 >= 1024425027) {
               throw new IllegalStateException();
            } else {
               return this.field6221;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.agj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)Z")
   @ObfuscatedName("vo")
   public static boolean method10953(classNV var0) {
      if (var0 == null) {
         var0.method8191();
      }

      return var0.method8179();
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("agt")
   protected final boolean method11088(byte var1) {
      try {
         boolean var10000;
         if (null != this.field6221) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.agt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("jb")
   public void method11106(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(true);
      classOE.field4843.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("adf")
   protected abstract void vmethod254();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lc")
   public void method11099() {
      field6196 = 0 * 2069175365;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method11016() {
      try {
         if (null != classDQ.field1604) {
            String var1 = classDQ.field1604.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = classMB.field4479;
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
                  method11076(this, "wrongjava", 1717214884);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3 = 6;

                  while (var3 < var2.length() && classEB.method3802(var2.charAt(var3), (byte)-98)) {
                     var3++;
                  }

                  String var4 = var2.substring(6, var3);
                  if (classEU.method4078(var4, (byte)-1) && classJF.method6360(var4, 215229911) < 10) {
                     method11076(this, "wrongjava", 1993685585);
                     return;
                  }
               }

               field6194 = -1366222351;
            }
         }

         this.setFocusCycleRoot(true);
         this.method11009(2057236764);
         this.vmethod228(1624818309);
         classTW.field6250 = classEF.method3843((byte)-68);

         while (-4157353362753048141L * field6191 == 0L || classDD.method2983(16711680) < field6191 * -4157353362753048141L) {
            classSI.field5964 = classTW.field6250.vmethod535(field6187 * -124206665, -1581411499 * field6194, -1162884564) * -1242900443;

            for (int var6 = 0; var6 < 1906148269 * classSI.field5964; var6++) {
               this.method11019(-252904814);
            }

            method11027(this, 1159221952);
            this.method11108(this.field6219, (byte)-1);
         }
      } catch (Exception var5) {
         classAAU.method275(null, var5, (byte)38);
         method11076(this, "crash", 1096285188);
      }

      this.method11038((byte)-1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method11017() {
      try {
         if (null != classDQ.field1604) {
            String var1 = classDQ.field1604.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = classMB.field4479;
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
                  method11076(this, "wrongjava", 2079324763);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3 = 6;

                  while (var3 < var2.length() && classEB.method3802(var2.charAt(var3), (byte)-48)) {
                     var3++;
                  }

                  String var4 = var2.substring(6, var3);
                  if (classEU.method4078(var4, (byte)-1) && classJF.method6360(var4, -700834590) < 10) {
                     method11076(this, "wrongjava", -498527929);
                     return;
                  }
               }

               field6194 = -1366222351;
            }
         }

         this.setFocusCycleRoot(true);
         this.method11009(2126562725);
         this.vmethod228(1624818309);
         classTW.field6250 = classEF.method3843((byte)-63);

         while (-4157353362753048141L * field6191 == 0L || classDD.method2983(16711680) < field6191 * -4157353362753048141L) {
            classSI.field5964 = classTW.field6250.vmethod535(field6187 * 1440739541, 1149475075 * field6194, -1162884564) * -193062407;

            for (int var6 = 0; var6 < 279313160 * classSI.field5964; var6++) {
               this.method11019(-275223484);
            }

            method11027(this, 2116789255);
            this.method11108(this.field6219, (byte)-1);
         }
      } catch (Exception var5) {
         classAAU.method275(null, var5, (byte)25);
         method11076(this, "crash", 1316802590);
      }

      this.method11038((byte)-81);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aan")
   protected abstract void vmethod208();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ue")
   public void method11109() {
      this.method11019(2073411019);
   }

   @Override
   public final void focusGained(FocusEvent var1) {
      this.method11106(var1);

      try {
         field6190 = true;
         this.field6207 = true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.focusGained(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aht")
   protected final void method10971() {
      classQY.method9885(-1555149582);
      field6198.method10824(this.field6219, 828566663);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("lh")
   public boolean method11096() {
      return this.field6203;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aca")
   protected abstract void vmethod230();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("agy")
   protected static final void method10949() {
      classTW.field6250.vmethod530((byte)5);

      for (int var0 = 0; var0 < 32; var0++) {
         field6197[var0] = 0L;
      }

      for (int var1 = 0; var1 < 32; var1++) {
         field6195[var1] = 0L;
      }

      classSI.field5964 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("afn")
   protected final void method10972(int var1) {
      try {
         classQY.method9885(-1472726644);
         field6198.method10824(this.field6219, 1110326982);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.afn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hf")
   public void method11110(int var1) {
      this.field6217 = var1 * 1815127515;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajz")
   final void method10998() {
      field6198.method10826(this.field6219, (byte)-92);
      Canvas var1 = this.field6219;
      var1.removeMouseListener(classTZ.field6259);
      var1.removeMouseMotionListener(classTZ.field6259);
      var1.removeFocusListener(classTZ.field6259);
      classTZ.field6256 = 0;
      if (null != this.field6226) {
         this.field6226.method10743(this.field6219, 1886339831);
      }

      this.method11009(1596975679);
      field6198.method10824(this.field6219, 1509592828);
      Canvas var2 = this.field6219;
      var2.addMouseListener(classTZ.field6259);
      var2.addMouseMotionListener(classTZ.field6259);
      var2.addFocusListener(classTZ.field6259);
      if (this.field6226 != null) {
         this.field6226.method10740(this.field6219, -1191183928);
      }

      method11034(this, 1539154266);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ach")
   protected abstract void vmethod233();

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZ)V")
   @ObfuscatedName("akw")
   protected final void method11068(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.field6219.getGraphics();
         if (null == classAB.field123) {
            classAB.field123 = new Font("Helvetica", 1, 13);
            classAF.field145 = this.field6219.getFontMetrics(classAB.field123);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, classSA.field5897 * 773246731, 8379747 * classEU.field1938);
         }

         Color var6 = new Color(228569689, 17, 17);

         try {
            if (null == classLY.field4443) {
               classLY.field4443 = this.field6219.createImage(304, 34);
            }

            Graphics var7 = classLY.field4443.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, -2030130181, -1183911800);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, -1895772977);
            var7.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
            var7.setFont(classAB.field123);
            var7.setColor(Color.white);
            var7.drawString(var2, (2030203799 - classAF.field145.stringWidth(var2)) / 2, 22);
            var5.drawImage(classLY.field4443, classSA.field5897 * 773246731 / 2 - 152, classEU.field1938 * 302815990 / 2 + (var4 ? 50 : -18), null);
         } catch (Exception var10) {
            int var8 = classSA.field5897 * 773246731 / 2 - 152;
            int var9 = 8379747 * classEU.field1938 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 1631460915, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(classAB.field123);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (1810179764 - classAF.field145.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field6219.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("act")
   protected abstract void vmethod239(boolean var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acx")
   protected abstract void vmethod232();

   public void initialize() {
      this.setSize(Constants.GAME_FIXED_SIZE);
      this.init();
      this.start();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acd")
   protected abstract void vmethod241();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("akc")
   public final void method11062(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aix")
   protected void method11010(boolean var1) {
      if (this.field6203 != var1) {
         this.field6203 = var1;
         if (classWO.field6763 != null) {
            classYD.method13317(classWO.field6763, var1, (byte)28);
            classWO.field6763.method13314(61241127);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("ay")
   public static void method11028(classTQ var0) {
      if (var0 == null) {
         var0.run();
      }

      Container var1 = var0.method11079(-1359522947);
      long var2 = classDD.method2983(16711680);
      long var4 = field6197[676723006 * classFW.field2417];
      field6197[classFW.field2417 * -1804509917] = var2;
      classFW.field2417 = (1 + classFW.field2417 * -1804509917 & 1864477113) * 1510849163;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field6193 = ((var6 >> 1) + 32000) / var6 * -1784476173;
      }

      if ((field6196 += -961246446) * 801347213 - 1 > 50) {
         field6196 -= 379553146;
         var0.field6207 = true;
         var0.field6219.setSize(classSA.field5897 * -186829873, classEU.field1938 * 8379747);
         var0.field6219.setVisible(true);
         if (var1 == var0.field6221) {
            Insets var7 = var0.field6221.getInsets();
            var0.field6219.setLocation(var7.left + 605956500 * var0.field6205, var7.top + -673776453 * var0.field6206);
         } else {
            var0.field6219.setLocation(var0.field6205 * 1688986815, var0.field6206 * -94523477);
         }
      }

      if (var0.field6209) {
         var0.method11105((byte)20);
      }

      var0.method11032(732119250);
      var0.vmethod237(var0.field6207, 873375846);
      if (var0.field6207) {
         var0.method10996((byte)-4);
      }

      var0.field6207 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acq")
   protected abstract void vmethod244();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;IIII)V")
   @ObfuscatedName("tc")
   public static void method11001(classTQ var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11032(var1);
      }

      try {
         if (null != field6189) {
            field6200 += 354831441;
            if (221150385 * field6200 >= 3) {
               method11076(var0, "alreadyloaded", -417596165);
               return;
            }

            var0.method11090().vmethod561(var0.method11091(), "_self");
            return;
         }

         field6189 = var0;
         classSA.field5897 = var1 * -2089155421;
         classEU.field1938 = 841518155 * var2;
         classAAL.field57 = var3 * -154973313;
         classAAF.field46 = -609160337 * var4;
         classAAF.field49 = var0.method11107();
         if (classWW.field6786 == null) {
            classWW.field6786 = new classMB();
         }

         classWW.field6786.method7517(var0, 1, 612936669);
      } catch (Exception var6) {
         classAAU.method275(null, var6, (byte)13);
         method11076(var0, "crash", 1668276056);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("hn")
   protected abstract void vmethod250(byte var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ady")
   protected abstract void vmethod253();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ada")
   protected abstract void vmethod252();

   public Canvas getCanvas() {
      return this.field6219;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acr")
   protected abstract void vmethod242();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wu")
   public void method11098() {
      if (classOE.field4843.isStretchedEnabled()) {
         Canvas var1 = this.getCanvas();
         Dimension var2 = classOE.field4843.getStretchedDimensions();
         var1.setSize(var2);
         var1.setLocation((var1.getParent().getWidth() - var2.width) / 2, 0);
         var1.validate();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajb")
   public final void method11042() {
      if (field6189 == this && !field6192) {
         field6191 = classDD.method2983(16711680) * -7013317878618397317L;
         classRP.method10149(5000L);
         this.method11038((byte)-17);
      }
   }

   @Override
   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowClosing(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afg")
   public final void method11050(FocusEvent var1) {
      field6190 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ltq;B)Lmf;")
   @ObfuscatedName("si")
   public static classMF method10957(classTQ var0, byte var1) {
      if (var0 == null) {
         var0.method10959(var1);
      }

      try {
         if (var0.field6226 == null) {
            var0.field6226 = new classTC();
            var0.field6226.method10740(var0.field6219, 1087436969);
         }

         return var0.field6226;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.afo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("aff")
   public final void method11051(FocusEvent var1) {
      field6190 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afq")
   public final void method11046(Graphics var1) {
      this.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afx")
   public final void method11047(Graphics var1) {
      this.paint(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)Ljava/lang/Object;")
   @ObfuscatedName("eq")
   public static Object method10943(classNW var0) {
      classVQ var1 = var0.field4786;
      if (var1 == var0.field4785.field4782) {
         var1 = null;
         var0.field4786 = null;
      } else {
         var0.field4786 = var1.field6554;
      }

      var0.field4784 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltq;B)Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("qh")
   public static Clipboard method10966(classTQ var0, byte var1) {
      if (var0 == null) {
         return var0.method10970(var1);
      } else {
         try {
            return var0.field6222;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "tq.afv(" + ')');
         }
      }
   }

   public void unblockStartup() {
      if (this.field6224 != null) {
         this.field6224.release();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrl0;")
   @ObfuscatedName("nc")
   public rl0 method11090() {
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("ir")
   public static void method11018(classTQ var0) {
      if (var0 == null) {
         var0.method10981();
      } else {
         try {
            if (null != classDQ.field1604) {
               String var1 = classDQ.field1604.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = classMB.field4479;
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
                     method11076(var0, "wrongjava", 966850894);
                     return;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     int var3 = 6;

                     while (var3 < var2.length() && classEB.method3802(var2.charAt(var3), (byte)-30)) {
                        var3++;
                     }

                     String var4 = var2.substring(6, var3);
                     if (classEU.method4078(var4, (byte)-1) && classJF.method6360(var4, 1137653930) < 10) {
                        method11076(var0, "wrongjava", -769319227);
                        return;
                     }
                  }

                  field6194 = 437855323;
               }
            }

            var0.setFocusCycleRoot(true);
            var0.method11009(1766008000);
            var0.vmethod228(1624818309);
            classTW.field6250 = classEF.method3843((byte)-91);

            while (-4157353362753048141L * field6191 == 0L || classDD.method2983(16711680) < field6191 * -4157353362753048141L) {
               classSI.field5964 = classTW.field6250.vmethod535(field6187 * 867481676, -2028709291 * field6194, -1162884564) * -1025597522;

               for (int var6 = 0; var6 < -219142571 * classSI.field5964; var6++) {
                  var0.method11019(2045060950);
               }

               method11027(var0, 1899420747);
               var0.method11108(var0.field6219, (byte)-1);
            }
         } catch (Exception var5) {
            classAAU.method275(null, var5, (byte)123);
            method11076(var0, "crash", 196044972);
         }

         var0.method11038((byte)-118);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/Container;")
   @ObfuscatedName("akh")
   Container method11080() {
      return (Container)(null != this.field6221 ? this.field6221 : this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afk")
   public final synchronized void method11049(Graphics var1) {
      if (field6189 == this && !field6192) {
         this.field6207 = true;
         if (classDD.method2983(16711680) - this.field6210 * -5853619249873121909L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= -1526156459 * classSA.field5897 && var2.height >= 8379747 * classEU.field1938) {
               this.field6209 = true;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("agq")
   protected static final int method10944() {
      return field6198.method10816(621560484);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("agc")
   protected static final int method10945() {
      return field6198.method10816(1778578561);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("agx")
   protected static final boolean method10946() {
      return field6198.method10819(-1983657248);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aid")
   final synchronized void method11006() {
      Container var1 = this.method11079(-1161154185);
      if (null != this.field6219) {
         this.field6219.removeFocusListener(this);
         var1.remove(this.field6219);
      }

      classSA.field5897 = Math.max(var1.getWidth(), this.field6215 * -248855302) * -2139325209;
      classEU.field1938 = Math.max(var1.getHeight(), this.field6218 * -450704939) * 841518155;
      if (null != this.field6221) {
         Insets var2 = this.field6221.getInsets();
         classSA.field5897 = classSA.field5897 - (var2.left + var2.right) * -2089155421;
         classEU.field1938 = classEU.field1938 - 841518155 * (var2.top + var2.bottom);
      }

      this.field6219 = new classTD(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.field6219);
      this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
      this.field6219.setVisible(true);
      this.field6219.setBackground(Color.BLACK);
      if (this.field6221 == var1) {
         Insets var3 = this.field6221.getInsets();
         this.field6219.setLocation(var3.left + -695928323 * this.field6205, this.field6206 * 438949312 + var3.top);
      } else {
         this.field6219.setLocation(1451619303 * this.field6205, this.field6206 * 315102557);
      }

      this.field6219.addFocusListener(this);
      this.field6219.requestFocus();
      this.field6207 = true;
      if (null != classWO.field6763
         && classSA.field5897 * -379657341 == classWO.field6763.field6967 * -1238133717
         && classEU.field1938 * 1793131877 == classWO.field6763.field6968 * 1855103015) {
         classTG.method10802((classTG)classWO.field6763, this.field6219, (byte)-113);
         classWO.field6763.vmethod578(0, 0, (byte)113);
      } else {
         classWO.field6763 = new classTG(-2043236416 * classSA.field5897, 8379747 * classEU.field1938, this.field6219, this.field6203);
      }

      this.field6209 = false;
      this.field6210 = classDD.method2983(16711680) * -1528671439279181277L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("agn")
   protected static final boolean method10947() {
      return field6198.method10819(-687071513);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("li")
   public static void method10973(classTQ var0) {
      if (var0 == null) {
         var0.method11036();
      } else {
         classQY.method9885(-2010438817);
         field6198.method10824(var0.field6219, -723229338);
      }
   }

   @Override
   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.update(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ahj")
   protected void method10962(String var1) {
      this.field6222.setContents(new StringSelection(var1), null);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ahp")
   protected static int method10951() {
      int var0 = 0;
      if (null == classAT.field279 || !classAT.field279.isValid()) {
         try {
            for (GarbageCollectorMXBean var2 : ManagementFactory.getGarbageCollectorMXBeans()) {
               if (var2.isValid()) {
                  classAT.field279 = var2;
                  field6188 = 1622412589189406289L;
                  field6199 = -6728113685686042049L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (classAT.field279 != null) {
         long var10 = classDD.method2983(16711680);
         long var3 = classAT.field279.getCollectionTime();
         if (-1L != 3566866902695694913L * field6199) {
            long var5 = var3 - field6199 * 3566866902695694913L;
            long var7 = var10 - field6188 * -5967588509917407921L;
            if (var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         field6199 = var3 * 6728113685686042049L;
         field6188 = -1622412589189406289L * var10;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hr")
   public void method11111() {
      this.vmethod228(1624818309);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ahy")
   protected static int method10952() {
      int var0 = 0;
      if (null == classAT.field279 || !classAT.field279.isValid()) {
         try {
            for (GarbageCollectorMXBean var2 : ManagementFactory.getGarbageCollectorMXBeans()) {
               if (var2.isValid()) {
                  classAT.field279 = var2;
                  field6188 = 1622412589189406289L;
                  field6199 = -6728113685686042049L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (classAT.field279 != null) {
         long var10 = classDD.method2983(16711680);
         long var3 = classAT.field279.getCollectionTime();
         if (-1L != 3566866902695694913L * field6199) {
            long var5 = var3 - field6199 * 3566866902695694913L;
            long var7 = var10 - field6188 * -5967588509917407921L;
            if (var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         field6199 = var3 * 6728113685686042049L;
         field6188 = -1622412589189406289L * var10;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ahc")
   protected final void method10954(int var1, int var2) {
      if (1937290719 * this.field6216 != var1 || this.field6217 * 697093715 != var2) {
         method11034(this, 448953458);
      }

      this.field6216 = -63355361 * var1;
      this.field6217 = 1815127515 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ais")
   final synchronized void method11007() {
      Container var1 = this.method11079(423774202);
      if (null != this.field6219) {
         this.field6219.removeFocusListener(this);
         var1.remove(this.field6219);
      }

      classSA.field5897 = Math.max(var1.getWidth(), this.field6215 * 237759111) * -2089155421;
      classEU.field1938 = Math.max(var1.getHeight(), this.field6218 * -450704939) * 841518155;
      if (null != this.field6221) {
         Insets var2 = this.field6221.getInsets();
         classSA.field5897 = classSA.field5897 - (var2.left + var2.right) * -2089155421;
         classEU.field1938 = classEU.field1938 - 841518155 * (var2.top + var2.bottom);
      }

      this.field6219 = new classTD(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.field6219);
      this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
      this.field6219.setVisible(true);
      this.field6219.setBackground(Color.BLACK);
      if (this.field6221 == var1) {
         Insets var3 = this.field6221.getInsets();
         this.field6219.setLocation(var3.left + 1451619303 * this.field6205, this.field6206 * -673776453 + var3.top);
      } else {
         this.field6219.setLocation(1451619303 * this.field6205, this.field6206 * -673776453);
      }

      this.field6219.addFocusListener(this);
      this.field6219.requestFocus();
      this.field6207 = true;
      if (null != classWO.field6763
         && classSA.field5897 * 773246731 == classWO.field6763.field6967 * -1238133717
         && classEU.field1938 * 8379747 == classWO.field6763.field6968 * 1855103015) {
         classTG.method10802((classTG)classWO.field6763, this.field6219, (byte)-120);
         classWO.field6763.vmethod578(0, 0, (byte)119);
      } else {
         classWO.field6763 = new classTG(773246731 * classSA.field5897, 8379747 * classEU.field1938, this.field6219, this.field6203);
      }

      this.field6209 = false;
      this.field6210 = classDD.method2983(16711680) * -1528671439279181277L;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ahs")
   protected void method10963(String var1) {
      this.field6222.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ahf")
   protected void method10964(String var1) {
      this.field6222.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("ahh")
   public Clipboard method10967() {
      return this.field6222;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("ahq")
   public Clipboard method10968() {
      return this.field6222;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("aho")
   public Clipboard method10969() {
      return this.field6222;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("afu")
   protected final void method11097(int var1, int var2, byte var3) {
      if (classOE.field4843.isStretchedEnabled() && classOE.field4843.isResized()) {
         Dimension var4 = classOE.field4843.getRealDimensions();
         var1 = var4.width;
         var2 = var4.height;
      }

      int var7 = var2;
      int var6 = var1;
      classTQ var5 = this;
      byte var8 = 81;

      try {
         label29: {
            if (1937290719 * var5.field6216 == var6) {
               if (var8 <= 8) {
                  throw new IllegalStateException();
               }

               if (var5.field6217 * 697093715 == var7) {
                  break label29;
               }

               if (var8 <= 8) {
                  throw new IllegalStateException();
               }
            }

            method11034(var5, 1092999054);
         }

         var5.field6216 = -63355361 * var6;
         var5.field6217 = 1815127515 * var7;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "tq.afu(" + ')');
      }
   }

   public Thread getClientThread() {
      return this.field6223;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("ww")
   public static void method11072(classTQ var0) {
      if (var0 == null) {
         var0.method10981();
      }

      classLY.field4443 = null;
      classAB.field123 = null;
      classAF.field145 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahz")
   protected final void method10974() {
      classQY.method9885(-1517706091);
      field6198.method10824(this.field6219, -126373605);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahg")
   protected final void method10975() {
      classQY.method9885(-1727724451);
      field6198.method10824(this.field6219, 1670143838);
   }

   public void resizeCanvas() {
      this.method10990(1684778192);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method11112() {
      this.method11038((byte)-11);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahv")
   protected final void method10976() {
      classQY.method9885(-2096028747);
      field6198.method10824(this.field6219, -2110296974);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahw")
   protected final void method10977() {
      field6198.method10828((byte)-108);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("kk")
   public static void method10978(classTQ var0) {
      if (var0 == null) {
         var0.method10983();
      }

      field6198.method10828((byte)-73);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahr")
   protected final void method10979() {
      field6198.method10828((byte)24);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("nh")
   public static void method11073(classTQ var0) {
      if (var0 == null) {
         var0.method10983();
      }

      classLY.field4443 = null;
      classAB.field123 = null;
      classAF.field145 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acg")
   protected abstract void vmethod234();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahb")
   protected final void method10980() {
      field6198.method10828((byte)12);
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)V")
   @ObfuscatedName("ahk")
   protected void method10984(classTL var1, int var2) {
      field6198.method10814(var1, var2, 806192515);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)Z")
   @ObfuscatedName("wr")
   public static boolean method11012(classTQ var0) {
      if (var0 == null) {
         var0.method11074();
      }

      String var1 = var0.method11091().getHost().toLowerCase();
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
            method11076(var0, "invalidhost", 467219196);
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahm")
   protected final void method10987() {
      Canvas var1 = this.field6219;
      var1.addMouseListener(classTZ.field6259);
      var1.addMouseMotionListener(classTZ.field6259);
      var1.addFocusListener(classTZ.field6259);
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)I")
   @ObfuscatedName("bi")
   public static int method11089(classFX var0, int var1) {
      if (var0 == null) {
         return var0.method5186(var1);
      } else if (var0.field2425 == -1) {
         return 253;
      } else {
         int var2 = var0.field2425 & 255;
         if (var2 > 0 && var1 < 253) {
            int var3 = 253 - var1;
            int var4 = var3 * var2 >> 8;
            return var1 + var4;
         } else {
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("in")
   protected abstract void vmethod231(byte var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ahi")
   protected final void method10981() {
      field6198.method10828((byte)-91);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("ib")
   public static void method11035(classTQ var0) {
      if (var0 == null) {
         var0.method11037();
      }

      var0.field6208 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("cl")
   public static void method11043(classTQ var0) {
      if (var0 == null) {
         var0.method11094();
      } else if (field6189 == var0 && !field6192) {
         field6191 = classDD.method2983(16711680) * -7013317878618397317L;
         classRP.method10149(5000L);
         var0.method11038((byte)-96);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aiz")
   void method10997() {
      int var1 = this.field6205 * 1451619303;
      int var2 = this.field6206 * -673776453;
      int var3 = this.field6214 * 39467035 - 773246731 * classSA.field5897 - var1;
      int var4 = 1525008759 * this.field6213 - 8379747 * classEU.field1938 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method11079(269048633);
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.field6221) {
               Insets var8 = this.field6221.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, 1525008759 * this.field6213);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, this.field6214 * 39467035, var2);
            }

            if (var3 > 0) {
               var10.fillRect(this.field6214 * 39467035 + var6 - var3, var7, var3, this.field6213 * 1525008759);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + 1525008759 * this.field6213 - var4, this.field6214 * 39467035, var4);
            }
         } catch (Exception var9) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ho")
   protected abstract void vmethod207(int var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ain")
   protected final void method10988() {
      Canvas var1 = this.field6219;
      var1.addMouseListener(classTZ.field6259);
      var1.addMouseMotionListener(classTZ.field6259);
      var1.addFocusListener(classTZ.field6259);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)Ljava/awt/Container;")
   @ObfuscatedName("wm")
   public static Container method11081(classTQ var0) {
      return (Container)(null != var0.field6221 ? var0.field6221 : var0);
   }

   public final void stop() {
      try {
         if (field6189 == this && !field6192) {
            field6191 = (classDD.method2983(16711680) + 4000L) * -7013317878618397317L;
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tq.stop(" + ')');
      }
   }

   protected classTQ() {
      this.field6203 = true;
      this.field6204 = false;
      this.field6205 = 0;
      this.field6206 = 0;
      this.field6207 = true;
      this.field6208 = false;
      this.field6209 = false;
      this.field6210 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var4) {
      }

      this.field6211 = var1;
      classTX var2 = new classTX();
      classAK.field211 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aib")
   final synchronized void method11008() {
      Container var1 = this.method11079(-889495304);
      if (null != this.field6219) {
         this.field6219.removeFocusListener(this);
         var1.remove(this.field6219);
      }

      classSA.field5897 = Math.max(var1.getWidth(), this.field6215 * 1927716663) * -124507522;
      classEU.field1938 = Math.max(var1.getHeight(), this.field6218 * -450704939) * 841518155;
      if (null != this.field6221) {
         Insets var2 = this.field6221.getInsets();
         classSA.field5897 = classSA.field5897 - (var2.left + var2.right) * 1247489739;
         classEU.field1938 = classEU.field1938 - 841518155 * (var2.top + var2.bottom);
      }

      this.field6219 = new classTD(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.field6219);
      this.field6219.setSize(classSA.field5897 * -405479738, classEU.field1938 * 8379747);
      this.field6219.setVisible(true);
      this.field6219.setBackground(Color.BLACK);
      if (this.field6221 == var1) {
         Insets var3 = this.field6221.getInsets();
         this.field6219.setLocation(var3.left + 1451619303 * this.field6205, this.field6206 * 948918294 + var3.top);
      } else {
         this.field6219.setLocation(255584615 * this.field6205, this.field6206 * -673776453);
      }

      this.field6219.addFocusListener(this);
      this.field6219.requestFocus();
      this.field6207 = true;
      if (null != classWO.field6763
         && classSA.field5897 * 773246731 == classWO.field6763.field6967 * -1770606652
         && classEU.field1938 * 1683477505 == classWO.field6763.field6968 * 623188320) {
         classTG.method10802((classTG)classWO.field6763, this.field6219, (byte)-126);
         classWO.field6763.vmethod578(0, 0, (byte)84);
      } else {
         classWO.field6763 = new classTG(773246731 * classSA.field5897, 8379747 * classEU.field1938, this.field6219, this.field6203);
      }

      this.field6209 = false;
      this.field6210 = classDD.method2983(16711680) * -1528671439279181277L;
   }

   @Override
   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.windowIconified(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("vc")
   public static void method10989(classTQ var0) {
      Canvas var1 = var0.field6219;
      var1.addMouseListener(classTZ.field6259);
      var1.addMouseMotionListener(classTZ.field6259);
      var1.addFocusListener(classTZ.field6259);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("eb")
   public static void method11033(classTQ var0) {
      if (var0 == null) {
         var0.method11111();
      }

      classUQ var1 = var0.method11086(-731027267);
      if (518523273 * var1.field6370 != 39467035 * var0.field6214 || -874893249 * var1.field6371 != 1525008759 * var0.field6213 || var0.field6208) {
         var0.method10990(1503200566);
         var0.field6208 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ail")
   protected final boolean method11013() {
      String var1 = this.method11091().getHost().toLowerCase();
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
            method11076(this, "invalidhost", 2098035956);
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("agd")
   protected static final boolean method10948() {
      return field6198.method10819(-1485013847);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aio")
   protected final boolean method11014() {
      String var1 = this.method11091().getHost().toLowerCase();
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
            method11076(this, "invalidhost", 1054576696);
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajv")
   void method11020() {
      long var1 = classDD.method2983(16711680);
      long var3 = field6195[75872381 * classMD.field4487];
      field6195[75872381 * classMD.field4487] = var1;
      classMD.field4487 = (1 + 75872381 * classMD.field4487 & 31) * -911507243;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized (this) {
         classDD.field1405 = field6190;
      }

      this.vmethod231((byte)97);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method11113() {
      method11027(this, 598114799);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajd")
   void method11021() {
      long var1 = classDD.method2983(16711680);
      long var3 = field6195[75872381 * classMD.field4487];
      field6195[-1459854889 * classMD.field4487] = var1;
      classMD.field4487 = (1 + 75872381 * classMD.field4487 & 31) * -2008577211;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized (this) {
         classDD.field1405 = field6190;
      }

      this.vmethod231((byte)105);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("bq")
   public static void method10999(classTQ var0) {
      field6198.method10826(var0.field6219, (byte)31);
      Canvas var1 = var0.field6219;
      var1.removeMouseListener(classTZ.field6259);
      var1.removeMouseMotionListener(classTZ.field6259);
      var1.removeFocusListener(classTZ.field6259);
      classTZ.field6256 = 0;
      if (null != var0.field6226) {
         var0.field6226.method10743(var0.field6219, 798417951);
      }

      var0.method11009(2058027058);
      field6198.method10824(var0.field6219, 796787445);
      Canvas var2 = var0.field6219;
      var2.addMouseListener(classTZ.field6259);
      var2.addMouseMotionListener(classTZ.field6259);
      var2.addFocusListener(classTZ.field6259);
      if (var0.field6226 != null) {
         var0.field6226.method10740(var0.field6219, -571610227);
      }

      method11034(var0, 1646159564);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aiv")
   void method11022() {
      long var1 = classDD.method2983(16711680);
      long var3 = field6195[75872381 * classMD.field4487];
      field6195[75872381 * classMD.field4487] = var1;
      classMD.field4487 = (1 + 75872381 * classMD.field4487 & 1941023212) * -212431108;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized (this) {
         classDD.field1405 = field6190;
      }

      this.vmethod231((byte)115);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("acp")
   protected abstract void vmethod236(boolean var1);

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajk")
   public final void method11052(WindowEvent var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;IIII)V")
   @ObfuscatedName("lc")
   public static void method11002(classTQ var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11032(var1);
      } else {
         try {
            if (null != field6189) {
               field6200 += 682260341;
               if (221150385 * field6200 >= 3) {
                  method11076(var0, "alreadyloaded", 1679138725);
                  return;
               }

               var0.method11090().vmethod561(var0.method11091(), "_self");
               return;
            }

            field6189 = var0;
            classSA.field5897 = var1 * -1571951132;
            classEU.field1938 = -329626580 * var2;
            classAAL.field57 = var3 * -154973313;
            classAAF.field46 = -1564700842 * var4;
            classAAF.field49 = var0.method11107();
            if (classWW.field6786 == null) {
               classWW.field6786 = new classMB();
            }

            classWW.field6786.method7517(var0, 1, -455791678);
         } catch (Exception var6) {
            classAAU.method275(null, var6, (byte)88);
            method11076(var0, "crash", 254297309);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/net/URL;")
   @ObfuscatedName("vy")
   public URL method11091() {
      return this.method11107();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aim")
   void method11029() {
      Container var1 = this.method11079(1019202001);
      long var2 = classDD.method2983(16711680);
      long var4 = field6197[-1804509917 * classFW.field2417];
      field6197[classFW.field2417 * -1804509917] = var2;
      classFW.field2417 = (1 + classFW.field2417 * -1804509917 & 31) * 1510849163;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field6193 = ((var6 >> 1) + 32000) / var6 * -393098901;
      }

      if ((field6196 += 2069175365) * 801347213 - 1 > 50) {
         field6196 -= 379553146;
         this.field6207 = true;
         this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
         this.field6219.setVisible(true);
         if (var1 == this.field6221) {
            Insets var7 = this.field6221.getInsets();
            this.field6219.setLocation(var7.left + 1451619303 * this.field6205, var7.top + -673776453 * this.field6206);
         } else {
            this.field6219.setLocation(this.field6205 * 1451619303, this.field6206 * -673776453);
         }
      }

      if (this.field6209) {
         this.method11105((byte)-6);
      }

      this.method11032(1585812784);
      this.vmethod237(this.field6207, 1698349365);
      if (this.field6207) {
         this.method10996((byte)-3);
      }

      this.field6207 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("air")
   void method11030() {
      Container var1 = this.method11079(-867050494);
      long var2 = classDD.method2983(16711680);
      long var4 = field6197[-1804509917 * classFW.field2417];
      field6197[classFW.field2417 * -1804509917] = var2;
      classFW.field2417 = (1 + classFW.field2417 * -1804509917 & 31) * 1510849163;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field6193 = ((var6 >> 1) + 32000) / var6 * -393098901;
      }

      if ((field6196 += 2069175365) * 801347213 - 1 > 50) {
         field6196 -= 379553146;
         this.field6207 = true;
         this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
         this.field6219.setVisible(true);
         if (var1 == this.field6221) {
            Insets var7 = this.field6221.getInsets();
            this.field6219.setLocation(var7.left + 1451619303 * this.field6205, var7.top + -673776453 * this.field6206);
         } else {
            this.field6219.setLocation(this.field6205 * 1451619303, this.field6206 * -673776453);
         }
      }

      if (this.field6209) {
         this.method11105((byte)10);
      }

      this.method11032(1293126270);
      this.vmethod237(this.field6207, 1529356435);
      if (this.field6207) {
         this.method10996((byte)-88);
      }

      this.field6207 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ltq;I)V")
   @ObfuscatedName("lt")
   public static void method10982(classTQ var0, int var1) {
      if (var0 == null) {
         var0.method11075(var1);
      } else {
         try {
            field6198.method10828((byte)30);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "tq.afi(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)Luq;")
   @ObfuscatedName("zw")
   public static classUQ method11085(classTQ var0) {
      if (var0 == null) {
         var0.getClientThread();
      }

      Container var1 = var0.method11079(-1181729155);
      int var2 = Math.max(var1.getWidth(), 237759111 * var0.field6215);
      int var3 = Math.max(var1.getHeight(), var0.field6218 * -450704939);
      if (var0.field6221 != null) {
         Insets var4 = var0.field6221.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new classUQ(var2, var3);
   }

   public boolean isClientThread() {
      return this.field6223 == Thread.currentThread();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aih")
   final void method11036() {
      this.field6208 = true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajo")
   final void method11037() {
      this.field6208 = true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajp")
   public final void method11039() {
      if (this == field6189 && !field6192) {
         field6191 = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aju")
   public final void method11044() {
      if (field6189 == this && !field6192) {
         field6191 = classDD.method2983(16711680) * -7013317878618397317L;
         classRP.method10149(5000L);
         this.method11038((byte)-23);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   public void method11114(int var1) {
      this.field6216 = var1 * -63355361;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ajt")
   public final void method11045() {
      if (field6189 == this && !field6192) {
         field6191 = classDD.method2983(16711680) * -7013317878618397317L;
         classRP.method10149(5000L);
         this.method11038((byte)-98);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ir")
   public void method11115(boolean var1) {
      this.field6209 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ns")
   public final void method11103(Graphics var1) {
      if (!this.field6202) {
         this.field6202 = true;
         var1.clearRect(0, 0, this.getWidth(), this.getHeight());
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("agp")
   protected static final void method10950() {
      classTW.field6250.vmethod530((byte)5);

      for (int var0 = 0; var0 < 32; var0++) {
         field6197[var0] = 0L;
      }

      for (int var1 = 0; var1 < 32; var1++) {
         field6195[var1] = 0L;
      }

      classSI.field5964 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;II)V")
   @ObfuscatedName("afa")
   protected void method10985(classTL var1, int var2, int var3) {
      try {
         field6198.method10814(var1, var2, 806192515);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "tq.afa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("dm")
   public static void method10992(classTQ var0) {
      if (var0 == null) {
         var0.method11029();
      }

      Container var1 = var0.method11079(-381017106);
      if (null != var1) {
         classUQ var2 = var0.method11086(161498288);
         var0.field6214 = Math.max(518523273 * var2.field6370, 237759111 * var0.field6215) * -994011262;
         var0.field6213 = Math.max(var2.field6371 * -874893249, -450704939 * var0.field6218) * -181673913;
         if (39467035 * var0.field6214 <= 0) {
            var0.field6214 = 833806867;
         }

         if (1525008759 * var0.field6213 <= 0) {
            var0.field6213 = -181673913;
         }

         classSA.field5897 = Math.min(1100793051 * var0.field6214, var0.field6216 * 1937290719) * -2089155421;
         classEU.field1938 = Math.min(1119626313 * var0.field6213, -777828750 * var0.field6217) * 841518155;
         var0.field6205 = 1962298787 * ((39467035 * var0.field6214 - classSA.field5897 * -579192442) / 2);
         var0.field6206 = 0;
         var0.field6219.setSize(89789507 * classSA.field5897, 2143590714 * classEU.field1938);
         classWO.field6763 = new classTG(classSA.field5897 * 773246731, classEU.field1938 * -1607235138, var0.field6219, var0.field6203);
         if (var1 == var0.field6221) {
            Insets var3 = var0.field6221.getInsets();
            var0.field6219.setLocation(1023492508 * var0.field6205 + var3.left, -673776453 * var0.field6206 + var3.top);
         } else {
            var0.field6219.setLocation(var0.field6205 * 1451619303, var0.field6206 * -1827559305);
         }

         var0.field6207 = true;
         var0.vmethod250((byte)100);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acv")
   protected abstract void vmethod229();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajs")
   public final void method11053(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajy")
   public final void method11057(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajf")
   public final void method11054(WindowEvent var1) {
      this.destroy();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajw")
   public final void method11055(WindowEvent var1) {
      this.destroy();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("abe")
   public abstract void vmethod209();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;II)V")
   @ObfuscatedName("yh")
   public static void method10955(classTQ var0, int var1, int var2) {
      if (1937290719 * var0.field6216 != var1 || var0.field6217 * 697093715 != var2) {
         method11034(var0, 840777380);
      }

      var0.field6216 = -63355361 * var1;
      var0.field6217 = -1005506903 * var2;
   }

   @ObfuscatedSignature(descriptor = "()Lmf;")
   @ObfuscatedName("ahd")
   protected classMF method10958() {
      if (this.field6226 == null) {
         this.field6226 = new classTC();
         this.field6226.method10740(this.field6219, -347735156);
      }

      return this.field6226;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("nz")
   public static void method11026(classTQ var0) {
      if (var0 == null) {
         var0.method10958();
      }

      var0.field6207 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;IIII)V")
   @ObfuscatedName("ms")
   public static void method11003(classTQ var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11005(var1, var1, var1, var1);
      } else {
         try {
            if (null != field6189) {
               field6200 += 354831441;
               if (221150385 * field6200 >= 3) {
                  method11076(var0, "alreadyloaded", 30111921);
                  return;
               }

               var0.method11090().vmethod561(var0.method11091(), "_self");
               return;
            }

            field6189 = var0;
            classSA.field5897 = var1 * -2089155421;
            classEU.field1938 = 841518155 * var2;
            classAAL.field57 = var3 * -154973313;
            classAAF.field46 = -609160337 * var4;
            classAAF.field49 = var0.method11107();
            if (classWW.field6786 == null) {
               classWW.field6786 = new classMB();
            }

            classWW.field6786.method7517(var0, 1, 2083130524);
         } catch (Exception var6) {
            classAAU.method275(null, var6, (byte)123);
            method11076(var0, "crash", -44083956);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acl")
   protected abstract void vmethod235();

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajx")
   public final void method11060(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ajr")
   public final void method11061(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("acw")
   protected abstract void vmethod238(boolean var1);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("vs")
   public void method11116(String var1) {
      method11076(this, var1, -57794124);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("cu")
   public static void method11117(String var0, Throwable var1) {
      classAAU.method275(var0, var1, (byte)102);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("akd")
   public final void method11063(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("sp")
   public void method11118(boolean var1) {
      this.field6208 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("jp")
   public static void method11023(classTQ var0) {
      if (var0 == null) {
         var0.method11093();
      }

      long var1 = classDD.method2983(16711680);
      long var3 = field6195[75872381 * classMD.field4487];
      field6195[75872381 * classMD.field4487] = var1;
      classMD.field4487 = (1 + 75872381 * classMD.field4487 & 1764087297) * -911507243;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized (var0) {
         classDD.field1405 = field6190;
      }

      var0.vmethod231((byte)96);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("rg")
   public void method11094() {
      if (classOE.field4843.isStretchedEnabled()) {
         classOE.field4843.invalidateStretching(false);
         if (classOE.field4843.isResized()) {
            Dimension var1 = classOE.field4843.getRealDimensions();
            this.method11114(var1.width);
            this.method11110(var1.height);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luq;")
   @ObfuscatedName("agw")
   classUQ method11086(int var1) {
      try {
         Container var2 = this.method11079(-302065058);
         int var3 = Math.max(var2.getWidth(), 237759111 * this.field6215);
         int var4 = Math.max(var2.getHeight(), this.field6218 * -450704939);
         if (this.field6221 != null) {
            if (var1 >= 1445006785) {
               throw new IllegalStateException();
            }

            Insets var5 = this.field6221.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.top + var5.bottom;
         }

         return new classUQ(var3, var4);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "tq.agw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("aky")
   public final void method11064(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("yv")
   public void method11093() {
      if (this.field6219 != null) {
         this.field6219.removeComponentListener(this.field6201);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("nb")
   public static void method10993(classTQ var0) {
      if (var0 == null) {
         var0.method11044();
      } else {
         Container var1 = var0.method11079(181052028);
         if (null != var1) {
            classUQ var2 = var0.method11086(1329131020);
            var0.field6214 = Math.max(444480655 * var2.field6370, -1983342777 * var0.field6215) * 833806867;
            var0.field6213 = Math.max(var2.field6371 * 2072708115, -814860968 * var0.field6218) * -181673913;
            if (69365437 * var0.field6214 <= 0) {
               var0.field6214 = 342373637;
            }

            if (2143909619 * var0.field6213 <= 0) {
               var0.field6213 = -181673913;
            }

            classSA.field5897 = Math.min(39467035 * var0.field6214, var0.field6216 * 1678469514) * -2089155421;
            classEU.field1938 = Math.min(-322847495 * var0.field6213, 697093715 * var0.field6217) * 841518155;
            var0.field6205 = 828993495 * ((39467035 * var0.field6214 - classSA.field5897 * 773246731) / 2);
            var0.field6206 = 0;
            var0.field6219.setSize(2108718372 * classSA.field5897, 1302063658 * classEU.field1938);
            classWO.field6763 = new classTG(classSA.field5897 * -449368026, classEU.field1938 * 8379747, var0.field6219, var0.field6203);
            if (var1 == var0.field6221) {
               Insets var3 = var0.field6221.getInsets();
               var0.field6219.setLocation(1451619303 * var0.field6205 + var3.left, -2105698082 * var0.field6206 + var3.top);
            } else {
               var0.field6219.setLocation(var0.field6205 * -200174874, var0.field6206 * -1650576623);
            }

            var0.field6207 = true;
            var0.vmethod250((byte)62);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ako")
   public final void method11065(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)V")
   @ObfuscatedName("hd")
   public void method11119(Object var1) {
      this.method11108(var1, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agl")
   final synchronized void method11009(int var1) {
      this.method11093();

      try {
         Container var2 = this.method11079(-1603288198);
         if (null != this.field6219) {
            if (var1 <= 1278010550) {
               throw new IllegalStateException();
            }

            this.field6219.removeFocusListener(this);
            var2.remove(this.field6219);
         }

         classSA.field5897 = Math.max(var2.getWidth(), this.field6215 * 237759111) * -2089155421;
         client.method2315(-1);
         classEU.field1938 = Math.max(var2.getHeight(), this.field6218 * -450704939) * 841518155;
         client.method2345(-1);
         if (null != this.field6221) {
            if (var1 <= 1278010550) {
               throw new IllegalStateException();
            }

            Insets var3 = this.field6221.getInsets();
            classSA.field5897 = classSA.field5897 - (var3.left + var3.right) * -2089155421;
            client.method2315(-1);
            classEU.field1938 = classEU.field1938 - 841518155 * (var3.top + var3.bottom);
            client.method2345(-1);
         }

         this.field6219 = new classTD(this);
         var2.setBackground(Color.BLACK);
         var2.setLayout(null);
         var2.add(this.field6219);
         this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
         this.field6219.setVisible(true);
         this.field6219.setBackground(Color.BLACK);
         if (this.field6221 == var2) {
            if (var1 <= 1278010550) {
               throw new IllegalStateException();
            }

            Insets var5 = this.field6221.getInsets();
            this.field6219.setLocation(var5.left + 1451619303 * this.field6205, this.field6206 * -673776453 + var5.top);
         } else {
            this.field6219.setLocation(1451619303 * this.field6205, this.field6206 * -673776453);
         }

         label60: {
            this.field6219.addFocusListener(this);
            this.field6219.requestFocus();
            this.field6207 = true;
            if (null != classWO.field6763 && classSA.field5897 * 773246731 == classWO.field6763.field6967 * -1238133717) {
               if (var1 <= 1278010550) {
                  throw new IllegalStateException();
               }

               if (classEU.field1938 * 8379747 == classWO.field6763.field6968 * 1855103015) {
                  if (var1 <= 1278010550) {
                     throw new IllegalStateException();
                  }

                  classTG.method10802((classTG)classWO.field6763, this.field6219, (byte)-69);
                  classWO.field6763.vmethod578(0, 0, (byte)123);
                  break label60;
               }
            }

            classWO.field6763 = new classTG(773246731 * classSA.field5897, 8379747 * classEU.field1938, this.field6219, this.field6203);
         }

         this.field6209 = false;
         this.field6210 = classDD.method2983(16711680) * -1528671439279181277L;
         this.method11102();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "tq.agl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("en")
   public boolean method11120() {
      return this.field6209;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("acm")
   protected abstract void vmethod227();

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZ)V")
   @ObfuscatedName("akj")
   protected final void method11069(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.field6219.getGraphics();
         if (null == classAB.field123) {
            classAB.field123 = new Font("Helvetica", 1, 13);
            classAF.field145 = this.field6219.getFontMetrics(classAB.field123);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, classSA.field5897 * 773246731, 8379747 * classEU.field1938);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == classLY.field4443) {
               classLY.field4443 = this.field6219.createImage(304, 34);
            }

            Graphics var7 = classLY.field4443.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 1687275269);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 1777835743, -998577418);
            var7.fillRect(2 + 3 * var1, 2, 300 - var1 * 3, 30);
            var7.setFont(classAB.field123);
            var7.setColor(Color.white);
            var7.drawString(var2, (-1114244648 - classAF.field145.stringWidth(var2)) / 2, 22);
            var5.drawImage(classLY.field4443, classSA.field5897 * -699590131 / 2 - 152, classEU.field1938 * 8379747 / 2 + (var4 ? 50 : 1729743090), null);
         } catch (Exception var10) {
            int var8 = classSA.field5897 * 773246731 / 2 - 152;
            int var9 = -775651097 * classEU.field1938 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 645193539, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(classAB.field123);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - classAF.field145.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field6219.repaint();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;IIII)V")
   @ObfuscatedName("zd")
   public static void method11004(classTQ var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method10998();
      } else {
         try {
            if (null != field6189) {
               field6200 += 354831441;
               if (221150385 * field6200 >= 3) {
                  method11076(var0, "alreadyloaded", 1174780290);
                  return;
               }

               var0.method11090().vmethod561(var0.method11091(), "_self");
               return;
            }

            field6189 = var0;
            classSA.field5897 = var1 * -2089155421;
            classEU.field1938 = 841518155 * var2;
            classAAL.field57 = var3 * -154973313;
            classAAF.field46 = -609160337 * var4;
            classAAF.field49 = var0.method11107();
            if (classWW.field6786 == null) {
               classWW.field6786 = new classMB();
            }

            classWW.field6786.method7517(var0, 1, 382179368);
         } catch (Exception var6) {
            classAAU.method275(null, var6, (byte)12);
            method11076(var0, "crash", -18099327);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;ZZ)V")
   @ObfuscatedName("akb")
   protected final void method11070(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.field6219.getGraphics();
         if (null == classAB.field123) {
            classAB.field123 = new Font("Helvetica", 1, 13);
            classAF.field145 = this.field6219.getFontMetrics(classAB.field123);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, classSA.field5897 * 773246731, 8379747 * classEU.field1938);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == classLY.field4443) {
               classLY.field4443 = this.field6219.createImage(-144180440, 34);
            }

            Graphics var7 = classLY.field4443.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, -380954787, -2116906192);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 917921617, -1275408469);
            var7.fillRect(2 + 3 * var1, 2, -910325526 - var1 * 3, 30);
            var7.setFont(classAB.field123);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - classAF.field145.stringWidth(var2)) / 2, 22);
            var5.drawImage(classLY.field4443, classSA.field5897 * -15963207 / 2 - 1764028865, classEU.field1938 * 8379747 / 2 + (var4 ? 1124945180 : -18), null);
         } catch (Exception var10) {
            int var8 = classSA.field5897 * -142546908 / 2 - 152;
            int var9 = -1020043590 * classEU.field1938 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 1136214020, 33);
            var5.fillRect(var8 + 2, 2 + var9, 3 * var1, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, 2 + var9, 300 - 3 * var1, 30);
            var5.setFont(classAB.field123);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - classAF.field145.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field6219.repaint();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("xa")
   public boolean method11121() {
      return this.field6208;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("afw")
   protected void method10965(String var1, int var2) {
      try {
         this.field6222.setContents(new StringSelection(var1), null);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tq.afw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aka")
   protected void method11077(String var1) {
      if (!this.field6204) {
         this.field6204 = true;
         System.out.println("error_game_" + var1);

         try {
            this.method11090().vmethod561(new URL(this.method11107(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lj")
   public void method11102() {
      this.field6219.addComponentListener(this.field6201);
      this.field6220 = this.field6219.getSize();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/awt/Container;")
   @ObfuscatedName("akl")
   Container method11082() {
      return (Container)(null != this.field6221 ? this.field6221 : this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("akr")
   public final void method11066(WindowEvent var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("akn")
   protected final void method11074() {
      classLY.field4443 = null;
      classAB.field123 = null;
      classAF.field145 = null;
   }

   @ObfuscatedSignature(descriptor = "()Luq;")
   @ObfuscatedName("akt")
   classUQ method11087() {
      Container var1 = this.method11079(-1937732386);
      int var2 = Math.max(var1.getWidth(), 237759111 * this.field6215);
      int var3 = Math.max(var1.getHeight(), this.field6218 * -450704939);
      if (this.field6221 != null) {
         Insets var4 = this.field6221.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new classUQ(var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afj")
   public final void method11048(Graphics var1) {
      this.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ago")
   protected final boolean method11015(byte var1) {
      try {
         String var2 = this.method11091().getHost().toLowerCase();
         if (!var2.equals("jagex.com")) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            }

            if (!var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com")) {
                  if (var1 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (!var2.endsWith(".runescape.com")) {
                     if (var2.endsWith("127.0.0.1")) {
                        if (var1 >= 2) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     while (!var2.isEmpty() && var2.charAt(var2.length() - 1) >= '0') {
                        if (var1 >= 2) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) > '9') {
                           break;
                        }

                        if (var1 >= 2) {
                           throw new IllegalStateException();
                        }

                        var2 = var2.substring(0, var2.length() - 1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        if (var1 >= 2) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     method11076(this, "invalidhost", 1608342709);
                     return false;
                  }

                  if (var1 >= 2) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }

            if (var1 >= 2) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tq.ago(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;)V")
   @ObfuscatedName("yo")
   @Override
   public void vmethod560(URL var1) {
      String var2 = var1.getPath();
      if (var2.startsWith("/error_game_")) {
         this.field6225.onError(var2.replace("/", "").replace(".ws", ""));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;Ljava/lang/String;)V")
   @ObfuscatedName("qo")
   @Override
   public void vmethod561(URL var1, String var2) {
      this.vmethod560(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("iy")
   public static void method10994(classTQ var0) {
      if (var0 == null) {
         var0.method11017();
      }

      Container var1 = var0.method11079(-924541457);
      if (null != var1) {
         classUQ var2 = var0.method11086(-439287817);
         var0.field6214 = Math.max(518523273 * var2.field6370, 237759111 * var0.field6215) * 833806867;
         var0.field6213 = Math.max(var2.field6371 * -874893249, -450704939 * var0.field6218) * -181673913;
         if (39467035 * var0.field6214 <= 0) {
            var0.field6214 = 833806867;
         }

         if (1525008759 * var0.field6213 <= 0) {
            var0.field6213 = -181673913;
         }

         classSA.field5897 = Math.min(39467035 * var0.field6214, var0.field6216 * 1937290719) * -2089155421;
         classEU.field1938 = Math.min(1525008759 * var0.field6213, 697093715 * var0.field6217) * 841518155;
         var0.field6205 = 828993495 * ((39467035 * var0.field6214 - classSA.field5897 * 773246731) / 2);
         var0.field6206 = 0;
         var0.field6219.setSize(773246731 * classSA.field5897, 8379747 * classEU.field1938);
         classWO.field6763 = new classTG(classSA.field5897 * 773246731, classEU.field1938 * 8379747, var0.field6219, var0.field6203);
         if (var1 == var0.field6221) {
            Insets var3 = var0.field6221.getInsets();
            var0.field6219.setLocation(1451619303 * var0.field6205 + var3.left, -673776453 * var0.field6206 + var3.top);
         } else {
            var0.field6219.setLocation(var0.field6205 * 1451619303, var0.field6206 * -673776453);
         }

         var0.field6207 = true;
         var0.vmethod250((byte)119);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lmf;")
   @ObfuscatedName("afo")
   protected classMF method10959(byte var1) {
      try {
         if (this.field6226 == null) {
            this.field6226 = new classTC();
            this.field6226.method10740(this.field6219, 1087436969);
         }

         return this.field6226;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.afo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("afv")
   public Clipboard method10970(byte var1) {
      try {
         return this.field6222;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.afv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("afi")
   protected final void method11075(int var1) {
      try {
         classLY.field4443 = null;
         classAB.field123 = null;
         classAF.field145 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tq.agv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ags")
   final void method10995(int var1) {
      this.method11102();

      try {
         Container var2 = this.method11079(-1484383774);
         if (null == var2) {
            this.method11094();
         } else {
            classUQ var3 = this.method11086(918325363);
            this.field6217 = Math.max(518523273 * var3.field6370, 237759111 * this.field6216) * 833806867;
            this.field6206 = Math.max(var3.field6368 * -874893249, -450704939 * this.field6205) * -181673913;
            if (39467035 * this.field6213 <= 0) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               this.field6213 = 833806867;
            }

            if (1525008759 * this.field6215 <= 0) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               this.field6205 = -181673913;
            }

            classSA.field5897 = Math.min(39467035 * this.field6215, this.field6213 * 1937290719) * -2089155421;
            client.method2139(-1);
            classEU.field1938 = Math.min(1525008759 * this.field6213, 697093715 * this.field6215) * 841518155;
            client.method2357(-1);
            this.field6206 = 828993495 * ((39467035 * this.field6218 - classSA.field5897 * 773246731) / 2);
            this.field6214 = 0;
            this.field6219.setSize(773246731 * classSA.field5897, 8379747 * classEU.field1938);
            classWO.field6763 = new classTG(classSA.field5897 * 773246731, classEU.field1938 * 8379747, this.field6219, this.field6203);
            if (var2 == this.field6221) {
               if (var1 <= 1315923617) {
                  throw new IllegalStateException();
               }

               Insets var4 = this.field6221.getInsets();
               this.field6219.setLocation(1451619303 * this.field6215 + var4.left, -673776453 * this.field6217 + var4.top);
            } else {
               this.field6219.setLocation(this.field6214 * 1451619303, this.field6206 * -673776453);
            }

            this.field6209 = true;
            this.vmethod250((byte)17);
            this.method11111();
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tq.agm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aha")
   protected final void method10983() {
      field6198.method10828((byte)-73);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("agi")
   void method11031(int var1) {
      this.method11092();

      try {
         Container var2 = this.method11079(700771541);
         long var3 = classDD.method2983(16711680);
         long var5 = field6197[-1804509917 * classFW.field2417];
         field6195[classFW.field2417 * -1804509917] = var3;
         classFW.field2417 = (1 + classFW.field2417 * -1804509917 & 31) * 1510849163;
         if (0L != var5 && var3 > var5) {
            if (var1 <= -3745303) {
               throw new IllegalStateException();
            }

            int var7 = (int)(var3 - var5);
            field6193 = ((var7 >> 1) + 32000) / var7 * -393098901;
         }

         if ((field6196 = field6200 + 2069175365) * 801347213 - 1 > 50) {
            if (var1 <= -3745303) {
               return;
            }

            field6196 = field6194 - 379553146;
            this.field6209 = true;
            this.field6219.setSize(classSA.field5897 * 773246731, classEU.field1938 * 8379747);
            this.field6219.setVisible(true);
            if (var2 == this.field6221) {
               if (var1 <= -3745303) {
                  return;
               }

               Insets var9 = this.field6221.getInsets();
               this.field6219.setLocation(var9.left + 1451619303 * this.field6218, var9.top + -673776453 * this.field6213);
            } else {
               this.field6219.setLocation(this.field6216 * 1451619303, this.field6217 * -673776453);
            }
         }

         if (this.field6207) {
            if (var1 <= -3745303) {
               throw new IllegalStateException();
            }

            this.method11105((byte)-76);
         }

         this.method10995(795576551);
         this.vmethod237(this.field6207, -397184520);
         if (this.field6207) {
            if (var1 <= -3745303) {
               return;
            }

            this.method10996((byte)-87);
         }

         this.field6209 = false;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "tq.agi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;II)V")
   @ObfuscatedName("he")
   public static void method10956(classTQ var0, int var1, int var2) {
      if (1937290719 * var0.field6216 != var1 || var0.field6217 * 697093715 != var2) {
         method11034(var0, 2142319093);
      }

      var0.field6216 = -63355361 * var1;
      var0.field6217 = 1815127515 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mj")
   public void method11122() {
      this.method11009(1880212578);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aiq")
   protected final void method11005(int var1, int var2, int var3, int var4) {
      try {
         if (null != field6189) {
            field6200 = field6194 + 354831441;
            if (221150385 * field6196 >= 3) {
               method11076(this, "alreadyloaded", -417596165);
               return;
            }

            this.method11090().vmethod561(this.method11091(), "_self");
            return;
         }

         field6189 = this;
         classSA.field5897 = var1 * -2089155421;
         classEU.field1938 = 841518155 * var2;
         classAAL.field57 = var3 * -154973313;
         classAAF.field46 = -609160337 * var4;
         classAAF.field49 = this.method11107();
         if (classWW.field6786 == null) {
            classWW.field6786 = new classMB();
         }

         classWW.field6786.method7517(this, 1, 612936669);
      } catch (Exception var6) {
         classAAU.method275(null, var6, (byte)13);
         method11076(this, "crash", 1668276056);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("agh")
   protected void method11078(String var1, int var2) {
      try {
         if (this.field6208) {
            if (var2 <= -877384413) {
               throw new IllegalStateException();
            }
         } else {
            this.field6204 = true;
            System.out.println("error_game_" + var1);

            try {
               this.method11090().vmethod561(new URL(this.method11091(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tq.agh(" + ')');
      }
   }
}
