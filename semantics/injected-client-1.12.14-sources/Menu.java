import java.util.Arrays;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xk")
public class Menu implements net.runelite.api.Menu {
   @ObfuscatedName("az")
   public boolean[] menuShiftClick;
   @ObfuscatedName("fj")
   public int field6573;
   @ObfuscatedName("ag")
   public int[] menuArguments1;
   @ObfuscatedName("ax")
   int field6572;
   @ObfuscatedName("an")
   public int[] menuArguments2;
   @ObfuscatedName("ae")
   public int[] menuOpcodes;
   @ObfuscatedName("aj")
   public int[] menuIdentifiers;
   @ObfuscatedName("ak")
   public int[] menuItemIds;
   @ObfuscatedName("ec")
   public final int field6563;
   @ObfuscatedName("aw")
   public int[] menuWorldViewIds;
   @ObfuscatedName("pi")
   public int field6551;
   @ObfuscatedName("ap")
   public String[] menuActions;
   @ObfuscatedSignature(descriptor = "[Lxk;")
   @ObfuscatedName("au")
   public Menu[] subMenus;
   @ObfuscatedSignature(descriptor = "[Lrl5;")
   @ObfuscatedName("aq")
   public final rl5[] field6564;
   @ObfuscatedName("ev")
   public int field6552;
   @ObfuscatedName("ay")
   public String[] menuTargets;
   @ObfuscatedName("ad")
   int menuX;
   @ObfuscatedName("at")
   public int menuOptionsCount = -1;
   @ObfuscatedName("av")
   boolean field6565;
   @ObfuscatedName("as")
   int menuWidth;
   @ObfuscatedName("ai")
   int menuY;
   @ObfuscatedName("ab")
   int field6567;
   @ObfuscatedName("ac")
   int menuHeight;
   @ObfuscatedName("ar")
   long field6574;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public final void method12392(int var1) {
      BeforeMenuRender var2 = new BeforeMenuRender();
      SecureUrlRequester.client.getCallbacks().post(var2);
      if (!var2.isConsumed()) {
         client.method2451(this);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;)V")
   @ObfuscatedName("hr")
   public void method12401(Menu var1) {
      int var2;
      if (var1 == null) {
         var2 = class234.fontBold12.getTextWidth("Choose Option");
      } else {
         var2 = class234.fontBold12.getTextWidth(var1.menuTargets[var1.field6567 * 180456857]);
      }

      for (int var3 = 0; var3 < this.field6552 * 1759446067; var3++) {
         String var4 = this.menuActions[var3];
         if (!this.menuTargets[var3].isEmpty()) {
            var4 = var4 + " " + this.menuTargets[var3];
         }

         if (this.subMenus[var3] != null) {
            var4 = var4 + " <gt>";
         }

         int var5 = class234.fontBold12.getTextWidth(var4);
         if (var5 > var2) {
            var2 = var5;
         }
      }

      var2 += 8;
      int var7 = this.field6552 * 1759446067 * 15 + 4;
      if (this.field6565) {
         var7 += 18;
      }

      this.menuWidth = var2 * -1726927377;
      this.menuHeight = var7 * 961897753;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mb")
   public void method12405() {
      this.method12376(1490780514);
   }

   @ObfuscatedSignature(descriptor = "(Lxk;I)V")
   @ObfuscatedName("an")
   final void method12404(Menu var1, int var2) {
      this.method12401(var1);
      this.menuX = (var1.menuWidth * 1653973263 + var1.menuX * 121140035) * -876072597;
      if (this.menuX * 121140035 + this.menuWidth * 1653973263 > class489.canvasWidth * 120179835) {
         this.menuX = (var1.menuX * 121140035 - this.menuWidth * 1653973263) * -876072597;
      }

      if (this.menuX * 121140035 < 0) {
         this.menuX = 0 * -876072597;
      }

      assert var1 == client.menu;

      this.menuY = (var1.menuY * 1308492019 + (var1.field6552 * 1759446067 - 1 - var1.field6567 * 180456857 - client.field982) * 15) * 1877284923;
      if (this.menuHeight * 399255337 + this.menuY * 1308492019 > class374.canvasHeight * 19292887) {
         this.menuY = (class374.canvasHeight * 19292887 - this.menuHeight * 399255337) * 1877284923;
      }

      if (this.menuY * 1308492019 < 0) {
         this.menuY = 0 * 1877284923;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("au")
   final void method12381(short var1) {
      try {
         if (180456857 * this.field6567 != -1) {
            if (var1 != 200) {
               throw new IllegalStateException();
            }

            if (null != this.subMenus[this.field6567 * 180456857]) {
               if (var1 != 200) {
                  throw new IllegalStateException();
               }

               this.subMenus[180456857 * this.field6567].invalidateWidgetsUnder(1385691668);
            }

            this.field6567 = -1841133225;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xk.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("aj")
   public final void method12368(int var1, byte var2) {
      try {
         if (var1 < 0) {
            if (var2 != 125) {
               ;
            }
         } else {
            class101.menuAction(
               this.menuArguments1[var1],
               this.menuArguments2[var1],
               this.menuOpcodes[var1],
               this.menuIdentifiers[var1],
               this.menuItemIds[var1],
               this.menuWorldViewIds[var1],
               this.menuActions[var1],
               this.menuTargets[var1],
               MouseHandler.MouseHandler_lastPressedX * -1018773713,
               -261967643 * MouseHandler.MouseHandler_lastPressedY,
               (byte)-32
            );
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xk.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ak")
   public final boolean method12402(int var1, int var2, byte var3) {
      boolean var4;
      if (this.field6567 * 180456857 != -1
         && this.subMenus[this.field6567 * 180456857] != null
         && this.subMenus[this.field6567 * 180456857].method12411(var1, var2)) {
         var4 = true;
      } else if (var1 >= this.menuX * 121140035 - 10
         && var1 <= this.menuWidth * 1653973263 + this.menuX * 121140035 + 10
         && var2 >= this.menuY * 1308492019 - 10
         && var2 <= this.menuHeight * 399255337 + this.menuY * 1308492019 + 10) {
         int var5 = this.method12408(var1, var2);
         if (var5 != -1 && var5 != this.field6567 * 180456857) {
            long var6 = SecureUrlRequester.client.getGameCycle();
            int var8 = var5;
            long var9 = Math.max(var6, this.field6574 * -1468454876987467673L);
            if (this.field6567 * 180456857 != -1) {
               if (this.method12398(var1, var2)) {
                  var8 = -1;
                  var9 = Long.MAX_VALUE;
               } else if (this.field6572 * -1161052669 == -1) {
                  if (var1 == this.menuOptionsCount && var2 == this.field6551) {
                     var9 = var6 + 8L;
                  } else {
                     var9 = var6 + 2L;
                  }
               }
            }

            this.field6572 = var8 * 959798443;
            this.field6574 = var9 * -6033963050583145641L;
            if (this.field6574 * -1468454876987467673L <= var6) {
               this.field6572 = -1 * 959798443;
               this.method12406();
               Menu var11 = this.subMenus[var5];
               if (var11 != null) {
                  this.field6567 = var5 * 1841133225;
                  var11.method12413(this);
                  client.field976 = 0;
                  client.field999 = 0;
                  if (var11.menuHeight * 399255337 > SecureUrlRequester.client.getCanvasHeight()) {
                     client.field999 = 0;
                     client.field976 = (var11.menuHeight * 399255337 - SecureUrlRequester.client.getCanvasHeight() + 14) / 15;
                  }
               }
            }
         }

         var4 = true;
      } else {
         var4 = false;
      }

      this.menuOptionsCount = var1;
      this.field6551 = var2;
      return var4;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lc")
   public void method12406() {
      this.method12381((short)200);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   public final void method12376(int var1) {
      try {
         this.field6567 = -1841133225;

         for (int var2 = 0; var2 < this.field6552 * 1759446067; var2++) {
            if (var1 == -231674939) {
               throw new IllegalStateException();
            }

            if (null != this.subMenus[var2]) {
               if (var1 == -231674939) {
                  throw new IllegalStateException();
               }

               this.subMenus[var2].method12376(-212340861);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xk.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public final void invalidateWidgetsUnder(int var1) {
      this.method12396();

      try {
         class31.method668(121140035 * this.menuX, this.menuY * 1308492019, this.menuWidth * 1653973263, this.menuHeight * 399255337, (byte)117);
         this.method12381((short)200);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xk.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I")
   @ObfuscatedName("bu")
   public final int method12385(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      if (1759446067 * this.field6552 < this.menuActions.length) {
         this.menuActions[-433788970 * this.field6552] = var1;
         this.menuTargets[this.field6552 * -879971427] = var2;
         this.menuOpcodes[1534497524 * this.field6552] = var3;
         this.menuIdentifiers[-24511056 * this.field6552] = var4;
         this.menuArguments1[this.field6552 * 1759446067] = var5;
         this.menuArguments2[1964684873 * this.field6552] = var6;
         this.menuItemIds[this.field6552 * 836134145] = var7;
         this.menuWorldViewIds[this.field6552 * 1759446067] = var9;
         this.menuShiftClick[-1208372555 * this.field6552] = var8;
         this.subMenus[-428102444 * this.field6552] = null;
         return (this.field6552 += 849057531) * -1061053341 - 1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;III)V")
   @ObfuscatedName("la")
   public static void method12360(Menu var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12362(var1, var1, var1);
      }

      try {
         class604.method12442(var0, (byte)-46);
         var0.menuX = -876072597 * (var1 - var0.menuWidth * 1653973263 / 2);
         if (121140035 * var0.menuX + var0.menuWidth * 1653973263 > 120179835 * class489.canvasWidth) {
            var0.menuX = 1202979433 * class489.canvasWidth - -1860816827 * var0.menuWidth;
         }

         if (var0.menuX * 121140035 < 0) {
            if (var3 == -238297257) {
               throw new IllegalStateException();
            }

            var0.menuX = 0;
         }

         var0.menuY = 1877284923 * var2;
         if (var0.menuY * 1308492019 + var0.menuHeight * 399255337 > 19292887 * class374.canvasHeight) {
            var0.menuY = -2140147827 * class374.canvasHeight - 1852169843 * var0.menuHeight;
         }

         if (1308492019 * var0.menuY < 0) {
            if (var3 == -238297257) {
               return;
            }

            var0.menuY = 0;
         }

         if (180456857 * var0.field6567 != -1) {
            if (var3 == -238297257) {
               throw new IllegalStateException();
            }

            if (var0.subMenus[180456857 * var0.field6567] != null) {
               if (var3 == -238297257) {
                  throw new IllegalStateException();
               }

               var0.subMenus[180456857 * var0.field6567].method12404(var0, 219952160);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xk.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
   @ObfuscatedName("az")
   public final int insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10) {
      try {
         if (1759446067 * this.field6552 < this.menuActions.length) {
            if (var10 == -103080593) {
               throw new IllegalStateException();
            } else {
               this.menuActions[1759446067 * this.field6552] = var1;
               this.menuTargets[this.field6552 * 1759446067] = var2;
               this.menuOpcodes[1759446067 * this.field6552] = var3;
               this.menuIdentifiers[1759446067 * this.field6552] = var4;
               this.menuArguments1[this.field6552 * 1759446067] = var5;
               this.menuArguments2[1759446067 * this.field6552] = var6;
               this.menuItemIds[this.field6552 * 1759446067] = var7;
               this.menuWorldViewIds[this.field6552 * 1759446067] = var9;
               this.menuShiftClick[1759446067 * this.field6552] = var8;
               this.subMenus[1759446067 * this.field6552] = null;
               int var10000 = this.field6552 += 849057531;
               this.method12397(-1);
               return var10000 * 1759446067 - 1;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "xk.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I")
   @ObfuscatedName("bt")
   public final int method12387(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      if (-803665727 * this.field6552 < this.menuActions.length) {
         this.menuActions[-78571264 * this.field6552] = var1;
         this.menuTargets[this.field6552 * 1759446067] = var2;
         this.menuOpcodes[-92797069 * this.field6552] = var3;
         this.menuIdentifiers[1759446067 * this.field6552] = var4;
         this.menuArguments1[this.field6552 * -1325972681] = var5;
         this.menuArguments2[1759446067 * this.field6552] = var6;
         this.menuItemIds[this.field6552 * -269212077] = var7;
         this.menuWorldViewIds[this.field6552 * -593914196] = var9;
         this.menuShiftClick[1759446067 * this.field6552] = var8;
         this.subMenus[1714789524 * this.field6552] = null;
         return (this.field6552 += 1085320359) * 1759446067 - 1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bs")
   public final boolean method12373(int var1, int var2) {
      if (-1 != this.field6567 * 1641150162
         && null != this.subMenus[1460225812 * this.field6567]
         && method12374(this.subMenus[this.field6567 * -177773536], var1, var2, -89164335)) {
         return true;
      } else {
         int var3 = method12394(this, var1, var2, -559661089);
         if (-1 != var3) {
            this.method12368(var3, (byte)-20);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("as")
   public final String method12354(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + Strings.field4956 + this.menuTargets[var1] : this.menuActions[var1];
      }
   }

   public Menu(boolean var1) {
      this.field6551 = -1;
      int var2 = var1 ? 500 : 64;
      this.field6552 = 0 * 849057531;
      this.menuArguments1 = new int[var2];
      this.menuArguments2 = new int[var2];
      this.menuOpcodes = new int[var2];
      this.menuIdentifiers = new int[var2];
      this.menuItemIds = new int[var2];
      this.menuWorldViewIds = new int[var2];
      this.menuActions = new String[var2];
      this.menuTargets = new String[var2];
      this.subMenus = new Menu[var2];
      this.menuShiftClick = new boolean[var2];
      this.field6563 = var2;
      this.field6564 = new rl5[var2];
      this.field6565 = true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method12359() {
      this.menuWidth = class234.fontBold12.stringWidth(Strings.field5022) * -1763893819;

      for (int var1 = 0; var1 < this.field6552 * -51621368; var1++) {
         int var2 = class234.fontBold12.stringWidth(method12356(this, var1, -1866824600));
         if (null != this.subMenus[var1]) {
            var2 += 15;
         }

         if (var2 > 302874698 * this.menuWidth) {
            this.menuWidth = -1726927377 * var2;
         }
      }

      this.menuWidth += -930517128;
      this.menuHeight = 1329662683 + this.field6552 * 1039254764;
      if (this.field6565) {
         this.menuHeight += 1640584915;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public final void method12361(int var1, int var2) {
      class604.method12442(this, (byte)25);
      this.menuX = -876072597 * (var1 - this.menuWidth * 1653973263 / 2);
      if (121140035 * this.menuX + this.menuWidth * 1653973263 > 120179835 * class489.canvasWidth) {
         this.menuX = 1202979433 * class489.canvasWidth - -1860816827 * this.menuWidth;
      }

      if (this.menuX * 121140035 < 0) {
         this.menuX = 0;
      }

      this.menuY = 1877284923 * var2;
      if (this.menuY * 1308492019 + this.menuHeight * 399255337 > 19292887 * class374.canvasHeight) {
         this.menuY = -2140147827 * class374.canvasHeight - 1852169843 * this.menuHeight;
      }

      if (1308492019 * this.menuY < 0) {
         this.menuY = 0;
      }

      if (180456857 * this.field6567 != -1 && this.subMenus[180456857 * this.field6567] != null) {
         this.subMenus[180456857 * this.field6567].method12404(this, 219952160);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("by")
   public void method12407(int var1, int var2) {
      method12360(this, var1, var2, 1477002946);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("qs")
   public int method12408(int var1, int var2) {
      return method12394(this, var1, var2, 1164141805);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;Lxk;)V")
   @ObfuscatedName("to")
   public static void method12363(Menu var0, Menu var1) {
      if (var0 == null) {
         var0.method12388();
      }

      class604.method12442(var0, (byte)70);
      var0.menuX = 1 * var1.menuX + var1.menuWidth * -1175853780;
      if (121140035 * var0.menuX + -321121322 * var0.menuWidth > -1067131489 * class489.canvasWidth) {
         var0.menuX = var1.menuX * 1 - var0.menuWidth * -96198107;
      }

      if (var0.menuX * 1464432709 < 0) {
         var0.menuX = 0;
      }

      int var2 = -743893433 * var1.menuY + (621887229 * var1.field6552 - 15 - 2069264565 * var1.field6567);
      if (var1.field6565) {
         var2 += 17;
      }

      int var3 = var2 + 19;
      var0.menuY = 1877284923 * var2;
      if (var0.menuHeight * 520219845 + var0.menuY * 1308492019 > class374.canvasHeight * 19292887) {
         var0.menuY = (var3 - var0.menuHeight * -1682038247) * 1877284923;
      }

      if (1308492019 * var0.menuY < 0) {
         var0.menuY = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dm")
   public void method12403(int var1, int var2) {
      assert var1 != var2;

      String var3 = this.menuActions[var1];
      this.menuActions[var1] = this.menuActions[var2];
      this.menuActions[var2] = var3;
      var3 = this.menuTargets[var1];
      this.menuTargets[var1] = this.menuTargets[var2];
      this.menuTargets[var2] = var3;
      int var4 = this.menuIdentifiers[var1];
      this.menuIdentifiers[var1] = this.menuIdentifiers[var2];
      this.menuIdentifiers[var2] = var4;
      var4 = this.menuOpcodes[var1];
      this.menuOpcodes[var1] = this.menuOpcodes[var2];
      this.menuOpcodes[var2] = var4;
      var4 = this.menuArguments1[var1];
      this.menuArguments1[var1] = this.menuArguments1[var2];
      this.menuArguments1[var2] = var4;
      var4 = this.menuArguments2[var1];
      this.menuArguments2[var1] = this.menuArguments2[var2];
      this.menuArguments2[var2] = var4;
      var4 = this.menuItemIds[var1];
      this.menuItemIds[var1] = this.menuItemIds[var2];
      this.menuItemIds[var2] = var4;
      var4 = this.menuWorldViewIds[var1];
      this.menuWorldViewIds[var1] = this.menuWorldViewIds[var2];
      this.menuWorldViewIds[var2] = var4;
      boolean var5 = this.menuShiftClick[var1];
      this.menuShiftClick[var1] = this.menuShiftClick[var2];
      this.menuShiftClick[var2] = var5;
      Menu var6 = this.subMenus[var1];
      this.subMenus[var1] = this.subMenus[var2];
      this.subMenus[var2] = var6;

      assert this.field6564[var1].field5665 == this;

      assert this.field6564[var2].field5665 == this;

      assert this.field6564[var1].field5666 == var1;

      assert this.field6564[var2].field5666 == var2;

      rl5 var7 = this.field6564[var1];
      this.field6564[var1] = this.field6564[var2];
      this.field6564[var2] = var7;
      this.field6564[var1].field5666 = var1;
      this.field6564[var2].field5666 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   public final String method12355(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + Strings.field4956 + this.menuTargets[var1] : this.menuActions[var1];
      }
   }

   public void removeMenuEntry(MenuEntry var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         rl5 var2 = (rl5)var1;
         int var3 = var2.field5666;
         if (var2.field5665 == this && var3 < this.field6552 * 1759446067) {
            assert var3 >= 0 && var3 < this.field6552 * 1759446067;

            for (int var4 = var3; var4 < this.field6552 * 1759446067 - 1; this.field6564[var4].field5666 = var4++) {
               this.menuActions[var4] = this.menuActions[var4 + 1];
               this.menuTargets[var4] = this.menuTargets[var4 + 1];
               this.menuIdentifiers[var4] = this.menuIdentifiers[var4 + 1];
               this.menuOpcodes[var4] = this.menuOpcodes[var4 + 1];
               this.menuArguments1[var4] = this.menuArguments1[var4 + 1];
               this.menuArguments2[var4] = this.menuArguments2[var4 + 1];
               this.menuItemIds[var4] = this.menuItemIds[var4 + 1];
               this.menuWorldViewIds[var4] = this.menuWorldViewIds[var4 + 1];
               this.menuShiftClick[var4] = this.menuShiftClick[var4 + 1];
               this.subMenus[var4] = this.subMenus[var4 + 1];
               this.field6564[var4] = this.field6564[var4 + 1];
            }

            var2.field5666 = this.field6552 * 1759446067 - 1;
            this.field6564[this.field6552 * 1759446067 - 1] = var2;
            this.field6552 = (this.field6552 * 1759446067 - 1) * 849057531;
            this.field6573 = this.field6552 * 1759446067;
         } else {
            throw new IllegalArgumentException("entry doesn't belong to menu");
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   final int method12366(int var1, int var2) {
      for (int var3 = 0; var3 < this.field6552 * -153324682; var3++) {
         int var4 = 14 + this.menuY * 1308492019 + (this.field6552 * 1759446067 - 1 - var3) * 15;
         if (this.field6565) {
            var4 += 17;
         }

         if (var1 > 121140035 * this.menuX && var1 < 1653973263 * this.menuWidth + this.menuX * 121140035 && var2 > var4 - 13 && var2 < 3 + var4) {
            return var3;
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;Lxk;)V")
   @ObfuscatedName("rf")
   public static void method12364(Menu var0, Menu var1) {
      if (var0 == null) {
         var0.method12380();
      }

      class604.method12442(var0, (byte)14);
      var0.menuX = 1 * var1.menuX + var1.menuWidth * -1860816827;
      if (121140035 * var0.menuX + 1653973263 * var0.menuWidth > 120179835 * class489.canvasWidth) {
         var0.menuX = var1.menuX * 1 - var0.menuWidth * -1860816827;
      }

      if (var0.menuX * 121140035 < 0) {
         var0.menuX = 0;
      }

      int var2 = 1529550915 * var1.menuY + (1285984925 * var1.field6552 - 15 - 223074393 * var1.field6567);
      if (var1.field6565) {
         var2 += 17;
      }

      int var3 = var2 + 19;
      var0.menuY = -1686222538 * var2;
      if (var0.menuHeight * 399255337 + var0.menuY * 1308492019 > class374.canvasHeight * 19292887) {
         var0.menuY = (var3 - var0.menuHeight * 399255337) * 1877284923;
      }

      if (1308492019 * var0.menuY < 0) {
         var0.menuY = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pt")
   public void method12397(int var1) {
      int var2 = this.field6573;
      int var3 = this.field6552 * 1759446067;
      this.field6573 = var3;
      if (var3 < var2) {
         for (int var4 = var3; var4 < var2; var4++) {
            this.field6564[var4].field5667 = null;
         }
      } else if (var3 == var2 + 1) {
         rl5 var6 = this.field6564[var2];
         if (var6 == null) {
            var6 = this.field6564[var2] = new rl5(this, var2);
         } else {
            var6.field5667 = null;
         }

         MenuEntryAdded var5 = new MenuEntryAdded(var6);
         SecureUrlRequester.client.getCallbacks().post(var5);
      }
   }

   public int getMenuHeight() {
      return this.menuHeight * 399255337;
   }

   public int getMenuWidth() {
      return this.menuWidth * 1653973263;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("sa")
   public boolean method12398(int var1, int var2) {
      if (this.field6567 * 180456857 == -1) {
         return false;
      } else {
         Menu var3 = this.subMenus[this.field6567 * 180456857];
         if (var3 == null) {
            return false;
         } else if (var3.menuX * 121140035 > this.menuX * 121140035) {
            int var9 = var3.menuX * 121140035;
            float var10 = method12400(var1, var2, var9, var3.menuY * 1308492019);
            float var11 = method12400(this.menuOptionsCount, this.field6551, var9, var3.menuY * 1308492019);
            float var12 = method12400(var1, var2, var9, var3.menuY * 1308492019 + var3.menuHeight * 399255337);
            float var13 = method12400(this.menuOptionsCount, this.field6551, var9, var3.menuY * 1308492019 + var3.menuHeight * 399255337);
            return var10 >= var11 && var12 < var13 || var10 > var11 && var12 <= var13;
         } else {
            int var4 = this.menuX * 121140035;
            float var5 = method12400(var1, var2, var4, var3.menuY * 1308492019);
            float var6 = method12400(this.menuOptionsCount, this.field6551, var4, var3.menuY * 1308492019);
            float var7 = method12400(var1, var2, var4, var3.menuY * 1308492019 + var3.menuHeight * 399255337);
            float var8 = method12400(this.menuOptionsCount, this.field6551, var4, var3.menuY * 1308492019 + var3.menuHeight * 399255337);
            return var5 <= var6 && var7 > var8 || var5 < var6 && var7 >= var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ri")
   public void method12409(int var1) {
      this.method12368(var1, (byte)26);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   public final void method12369(int var1) {
      if (var1 >= 0) {
         class101.menuAction(
            this.menuArguments1[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.menuIdentifiers[var1],
            this.menuItemIds[var1],
            this.menuWorldViewIds[var1],
            this.menuActions[var1],
            this.menuTargets[var1],
            MouseHandler.MouseHandler_lastPressedX * -1018773713,
            -261967643 * MouseHandler.MouseHandler_lastPressedY,
            (byte)55
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("tl")
   public void method12410(int var1, int var2) {
      method12374(this, var1, var2, -89164335);
   }

   public int getMenuX() {
      return this.menuX * 121140035;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bz")
   public final boolean method12371(int var1, int var2) {
      if (-1 != this.field6567 * 1530241976
         && this.subMenus[180456857 * this.field6567] != null
         && this.subMenus[this.field6567 * 180456857].method12402(var1, var2, (byte)111)) {
         return true;
      } else if (var1 >= this.menuX * 234202493 - 10
         && var1 <= this.menuX * 1329135820 + this.menuWidth * 1653973263 + 10
         && var2 >= 1308492019 * this.menuY - 10
         && var2 <= 10 + 1308492019 * this.menuY + this.menuHeight * 399255337) {
         int var3 = method12394(this, var1, var2, 1822589687);
         if (-1 != var3 && var3 != 180456857 * this.field6567) {
            if (var3 != -2017721521 * this.field6572) {
               this.field6572 = 905771704 * var3;
               this.field6574 = ParamComposition.method4949((byte)15) * -6033963050583145641L;
               if (this.field6567 * 1302799543 != -1) {
                  this.field6574 += -2407995951407633932L;
               }
            }

            if (this.field6574 * -1468454876987467673L <= ParamComposition.method4949((byte)15)) {
               this.field6572 = -959798443;
               this.method12381((short)200);
               if (null != this.subMenus[var3]) {
                  this.field6567 = var3 * -2095336672;
                  this.subMenus[var3].method12404(this, 219952160);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bg")
   public final boolean method12372(int var1, int var2) {
      if (-1 != this.field6567 * 180456857
         && this.subMenus[180456857 * this.field6567] != null
         && this.subMenus[this.field6567 * 180456857].method12402(var1, var2, (byte)110)) {
         return true;
      } else if (var1 >= this.menuX * 121140035 - 10
         && var1 <= this.menuX * 121140035 + this.menuWidth * 1653973263 + 10
         && var2 >= 1308492019 * this.menuY - 10
         && var2 <= 10 + 1308492019 * this.menuY + this.menuHeight * 399255337) {
         int var3 = method12394(this, var1, var2, -1647890057);
         if (-1 != var3 && var3 != 180456857 * this.field6567) {
            if (var3 != -1161052669 * this.field6572) {
               this.field6572 = 959798443 * var3;
               this.field6574 = ParamComposition.method4949((byte)15) * -6033963050583145641L;
               if (this.field6567 * 180456857 != -1) {
                  this.field6574 += -2407995951407633932L;
               }
            }

            if (this.field6574 * -1468454876987467673L <= ParamComposition.method4949((byte)15)) {
               this.field6572 = -959798443;
               this.method12381((short)200);
               if (null != this.subMenus[var3]) {
                  this.field6567 = var3 * 1841133225;
                  this.subMenus[var3].method12404(this, 219952160);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public final void method12377() {
      this.field6567 = -1841133225;

      for (int var1 = 0; var1 < this.field6552 * 1304740028; var1++) {
         if (null != this.subMenus[var1]) {
            this.subMenus[var1].method12376(1574990982);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public final void method12379() {
      class31.method668(121140035 * this.menuX, this.menuY * 1308492019, this.menuWidth * 1653973263, this.menuHeight * 399255337, (byte)79);
      this.method12381((short)200);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   public final void method12370(int var1) {
      if (var1 >= 0) {
         class101.menuAction(
            this.menuArguments1[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.menuIdentifiers[var1],
            this.menuItemIds[var1],
            this.menuWorldViewIds[var1],
            this.menuActions[var1],
            this.menuTargets[var1],
            MouseHandler.MouseHandler_lastPressedX * -1018773713,
            -261967643 * MouseHandler.MouseHandler_lastPressedY,
            (byte)65
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   final void method12382() {
      if (-532677 * this.field6567 != -1) {
         if (null != this.subMenus[this.field6567 * 180456857]) {
            this.subMenus[-853190553 * this.field6567].invalidateWidgetsUnder(250357056);
         }

         this.field6567 = -5393458;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   public boolean method12411(int var1, int var2) {
      return this.method12402(var1, var2, (byte)15);
   }

   @ObfuscatedSignature(descriptor = "(Lxk;II)Ljava/lang/String;")
   @ObfuscatedName("ms")
   public static String method12356(Menu var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method12358(var1, var1);
      } else {
         try {
            if (var1 < 0) {
               if (var2 >= 999011256) {
                  throw new IllegalStateException();
               } else {
                  return "";
               }
            } else if (!var0.menuTargets[var1].isEmpty()) {
               if (var2 >= 999011256) {
                  throw new IllegalStateException();
               } else {
                  return var0.menuActions[var1] + Strings.field4956 + var0.menuTargets[var1];
               }
            } else {
               return var0.menuActions[var1];
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xk.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ai")
   public final String method12357(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + Strings.field4956 + this.menuTargets[var1] : this.menuActions[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public final void method12380() {
      class31.method668(121140035 * this.menuX, this.menuY * 1308492019, this.menuWidth * 1653973263, this.menuHeight * 399255337, (byte)116);
      this.method12381((short)200);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public final void method12388() {
      int var1 = this.menuX * 121140035;
      int var2 = this.menuY * 9309448;
      int var3 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth * -1683502003, this.menuHeight * 1403052456, var3);
      if (this.field6565) {
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var1, 1 + var2, this.menuWidth * 1391700660 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 18 + var2, 1771615443 * this.menuWidth - 2, 399255337 * this.menuHeight - 19, 0);
         class234.fontBold12.method10402(Strings.field5022, 3 + var1, 14 + var2, var3, -1);
      } else {
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 1 + var2, 989559968 * this.menuWidth - 2, 399255337 * this.menuHeight - 2, 0);
      }

      int var4 = MouseHandler.MouseHandler_x * -1420180101;
      int var5 = -1427762751 * MouseHandler.MouseHandler_y;

      for (int var6 = 0; var6 < this.field6552 * 1759446067; var6++) {
         int var7 = 14 + var2 + (1244197440 * this.field6552 - 1 - var6) * 15;
         if (this.field6565) {
            var7 += 17;
         }

         int var8 = -164720867;
         if (var4 > var1 && var4 < this.menuWidth * 1610313401 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = -795523520;
         }

         if (var6 == -1104227961 * this.field6567 || var6 == 782296109 * this.field6572 && null != this.subMenus[var6]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(2 + var1, var7 - 12, this.menuWidth * 1858603453 - 4, 15, 1509333599);
         }

         class234.fontBold12.method10402(method12356(this, var6, -886528478), 3 + var1, var7, var8, 0);
         if (this.subMenus[var6] != null) {
            class234.fontBold12.method10453(1127394106, this.menuWidth * 290438444 + var1 - 10, var7, 116536209);
         }
      }

      class408.method8780(1887904228 * this.menuX, 1308492019 * this.menuY, this.menuWidth * 1653973263, this.menuHeight * -954438656, -653776599);
      if (-1 != 180456857 * this.field6567 && null != this.subMenus[this.field6567 * -1102261894]) {
         this.subMenus[this.field6567 * 869486564].method12392(-1328428839);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   final int method12367(int var1, int var2) {
      for (int var3 = 0; var3 < this.field6552 * 1759446067; var3++) {
         int var4 = 14 + this.menuY * 1308492019 + (this.field6552 * 1759446067 - 1 - var3) * 15;
         if (this.field6565) {
            var4 += 17;
         }

         if (var1 > 121140035 * this.menuX && var1 < 1653973263 * this.menuWidth + this.menuX * 121140035 && var2 > var4 - 13 && var2 < 3 + var4) {
            return var3;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)F")
   @ObfuscatedName("kc")
   public static float method12400(int var0, int var1, int var2, int var3) {
      return ((float)var1 - var3) / (var2 - var0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   public final void method12389() {
      int var1 = this.menuX * 121140035;
      int var2 = this.menuY * 1308492019;
      int var3 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth * 1653973263, this.menuHeight * 399255337, var3);
      if (this.field6565) {
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var1, 1 + var2, this.menuWidth * 1653973263 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 18 + var2, 1653973263 * this.menuWidth - 2, 399255337 * this.menuHeight - 19, 0);
         class234.fontBold12.method10402(Strings.field5022, 3 + var1, 14 + var2, var3, -1);
      } else {
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 1 + var2, 1653973263 * this.menuWidth - 2, 399255337 * this.menuHeight - 2, 0);
      }

      int var4 = MouseHandler.MouseHandler_x * 1856325427;
      int var5 = -1427762751 * MouseHandler.MouseHandler_y;

      for (int var6 = 0; var6 < this.field6552 * 1759446067; var6++) {
         int var7 = 14 + var2 + (1759446067 * this.field6552 - 1 - var6) * 15;
         if (this.field6565) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < this.menuWidth * 1653973263 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = 16776960;
         }

         if (var6 == 180456857 * this.field6567 || var6 == -1161052669 * this.field6572 && null != this.subMenus[var6]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(2 + var1, var7 - 12, this.menuWidth * 1653973263 - 4, 15, 7496785);
         }

         class234.fontBold12.method10402(method12356(this, var6, 445918036), 3 + var1, var7, var8, 0);
         if (this.subMenus[var6] != null) {
            class234.fontBold12.method10453(62, this.menuWidth * 1653973263 + var1 - 10, var7, 16777215);
         }
      }

      class408.method8780(121140035 * this.menuX, 1308492019 * this.menuY, this.menuWidth * 1653973263, this.menuHeight * 399255337, -1876490928);
      if (-1 != 180456857 * this.field6567 && null != this.subMenus[this.field6567 * 180456857]) {
         this.subMenus[this.field6567 * 180456857].method12392(-1730569718);
      }
   }

   public MenuEntry[] getMenuEntries() {
      return Arrays.copyOf(this.field6564, this.field6552 * 1759446067);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   public final void method12390() {
      int var1 = this.menuX * -1104492484;
      int var2 = this.menuY * -2090559549;
      int var3 = -703122624;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth * 1653973263, this.menuHeight * 399255337, var3);
      if (this.field6565) {
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var1, 1 + var2, this.menuWidth * 1653973263 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 18 + var2, -1000404167 * this.menuWidth - 2, -758387382 * this.menuHeight - 19, 0);
         class234.fontBold12.method10402(Strings.field5022, 3 + var1, 14 + var2, var3, -1);
      } else {
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 1 + var2, 1653973263 * this.menuWidth - 2, 399255337 * this.menuHeight - 2, 0);
      }

      int var4 = MouseHandler.MouseHandler_x * 1856325427;
      int var5 = -1427762751 * MouseHandler.MouseHandler_y;

      for (int var6 = 0; var6 < this.field6552 * 1759446067; var6++) {
         int var7 = 14 + var2 + (552495556 * this.field6552 - 1 - var6) * 15;
         if (this.field6565) {
            var7 += 17;
         }

         int var8 = -178988581;
         if (var4 > var1 && var4 < this.menuWidth * 1653973263 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = 1277027698;
         }

         if (var6 == -2029431377 * this.field6567 || var6 == 4465823 * this.field6572 && null != this.subMenus[var6]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(2 + var1, var7 - 12, this.menuWidth * -951169503 - 4, 15, 7496785);
         }

         class234.fontBold12.method10402(method12356(this, var6, 590291410), 3 + var1, var7, var8, 0);
         if (this.subMenus[var6] != null) {
            class234.fontBold12.method10453(-1551848364, this.menuWidth * 1653973263 + var1 - 10, var7, 16777215);
         }
      }

      class408.method8780(-1210500051 * this.menuX, 138516047 * this.menuY, this.menuWidth * 1653973263, this.menuHeight * 399255337, -1904747669);
      if (-1 != 1608190385 * this.field6567 && null != this.subMenus[this.field6567 * -1157342421]) {
         this.subMenus[this.field6567 * 180456857].method12392(522395016);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;III)I")
   @ObfuscatedName("ws")
   public static int method12394(Menu var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method12395(var1, var1, var1);
      } else {
         int var4 = var0 == client.menu ? client.field982 : client.field999;

         for (int var5 = 0; var5 < var0.field6552 * 1759446067; var5++) {
            int var6 = var0.menuY * 1308492019 + (var0.field6552 * 1759446067 - 1 - var5 - var4) * 15 + 14;
            if (var0.field6565) {
               var6 += 17;
            }

            if (var1 > var0.menuX * 121140035 && var1 < var0.menuWidth * 1653973263 + var0.menuX * 121140035 && var2 > var6 - 13 && var2 < var6 + 3) {
               return var5;
            }
         }

         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;)V")
   @ObfuscatedName("nh")
   public static void method12391(Menu var0) {
      int var1 = var0.menuX * 121140035;
      int var2 = var0.menuY * 1308492019;
      int var3 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var0.menuWidth * 1653973263, var0.menuHeight * 399255337, var3);
      if (var0.field6565) {
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var1, 1 + var2, var0.menuWidth * 1653973263 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 18 + var2, 1653973263 * var0.menuWidth - 2, 399255337 * var0.menuHeight - 19, 0);
         class234.fontBold12.method10402(Strings.field5022, 3 + var1, 14 + var2, var3, -1);
      } else {
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, 1 + var2, 1653973263 * var0.menuWidth - 2, 399255337 * var0.menuHeight - 2, 0);
      }

      int var4 = MouseHandler.MouseHandler_x * 1856325427;
      int var5 = -1427762751 * MouseHandler.MouseHandler_y;

      for (int var6 = 0; var6 < var0.field6552 * 1759446067; var6++) {
         int var7 = 14 + var2 + (1759446067 * var0.field6552 - 1 - var6) * 15;
         if (var0.field6565) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var0.menuWidth * 1653973263 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = 16776960;
         }

         if (var6 == 180456857 * var0.field6567 || var6 == -1161052669 * var0.field6572 && null != var0.subMenus[var6]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(2 + var1, var7 - 12, var0.menuWidth * 1653973263 - 4, 15, 7496785);
         }

         class234.fontBold12.method10402(method12356(var0, var6, -1361034539), 3 + var1, var7, var8, 0);
         if (var0.subMenus[var6] != null) {
            class234.fontBold12.method10453(62, var0.menuWidth * 1653973263 + var1 - 10, var7, 16777215);
         }
      }

      class408.method8780(121140035 * var0.menuX, 1308492019 * var0.menuY, var0.menuWidth * 1653973263, var0.menuHeight * 399255337, 1448577616);
      if (-1 != 180456857 * var0.field6567 && null != var0.subMenus[var0.field6567 * 180456857]) {
         var0.subMenus[var0.field6567 * 180456857].method12392(-949419536);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;III)Z")
   @ObfuscatedName("lo")
   public static boolean method12374(Menu var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12375(var1, var1, var1);
      }

      try {
         if (-1 != var0.field6567 * 180456857) {
            if (var3 != -89164335) {
               throw new IllegalStateException();
            }

            if (null != var0.subMenus[180456857 * var0.field6567]) {
               if (var3 != -89164335) {
                  throw new IllegalStateException();
               }

               if (method12374(var0.subMenus[var0.field6567 * 180456857], var1, var2, -89164335)) {
                  if (var3 != -89164335) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         int var4 = method12394(var0, var1, var2, 1164141805);
         if (-1 != var4) {
            if (var3 != -89164335) {
               throw new IllegalStateException();
            } else {
               var0.method12368(var4, (byte)-107);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xk.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ds")
   public void method12396() {
      this.field6574 = -1L * -6033963050583145641L;
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("av")
   public final String method12358(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 >= 999011256) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (!this.menuActions[var1].isEmpty()) {
            if (var2 >= 999011256) {
               throw new IllegalStateException();
            } else {
               return this.menuTargets[var1] + Strings.field5150 + this.menuActions[var1];
            }
         } else {
            return this.menuTargets[var1];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xk.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   void method12393(byte var1) {
      this.method12413(null);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   public final void method12362(int var1, int var2, int var3) {
      try {
         class604.method12442(this, (byte)-46);
         this.menuX = -876072597 * (var1 - this.field6572 * 1653973263 / 2);
         if (121140035 * this.field6567 + this.menuHeight * 1653973263 > 120179835 * class489.canvasWidth) {
            this.field6572 = 1202979433 * class489.canvasWidth - -1860816827 * this.menuY;
         }

         if (this.field6572 * 121140035 < 0) {
            if (var3 == -238297257) {
               throw new IllegalStateException();
            }

            this.field6567 = 0;
         }

         this.menuX = 1877284923 * var2;
         if (this.menuX * 1308492019 + this.field6567 * 399255337 > 19292887 * class374.canvasHeight) {
            this.menuWidth = -2140147827 * class374.canvasHeight - 1852169843 * this.field6567;
         }

         if (1308492019 * this.menuY < 0) {
            if (var3 == -238297257) {
               return;
            }

            this.menuY = 0;
         }

         if (180456857 * this.menuY != -1) {
            if (var3 == -238297257) {
               throw new IllegalStateException();
            }

            if (this.subMenus[180456857 * this.field6572] != null) {
               if (var3 == -238297257) {
                  throw new IllegalStateException();
               }

               this.subMenus[180456857 * this.menuY].method12404(this, 219952160);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xk.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public void method12412() {
      this.invalidateWidgetsUnder(1278814647);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("aw")
   public final boolean method12375(int var1, int var2, int var3) {
      try {
         if (-1 != this.menuWidth * 180456857) {
            if (var3 != -89164335) {
               throw new IllegalStateException();
            }

            if (null != this.subMenus[180456857 * this.field6567]) {
               if (var3 != -89164335) {
                  throw new IllegalStateException();
               }

               if (method12374(this.subMenus[this.menuY * 180456857], var1, var2, -89164335)) {
                  if (var3 != -89164335) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         int var4 = method12394(this, var1, var2, 1164141805);
         if (-1 != var4) {
            if (var3 != -89164335) {
               throw new IllegalStateException();
            } else {
               this.method12368(var4, (byte)-107);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xk.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   final void method12383() {
      if (-666068800 * this.field6567 != -1) {
         if (null != this.subMenus[this.menuHeight * -1600263449]) {
            this.subMenus[681036770 * this.field6572].method12369(961805852);
         }

         this.field6567 = -100811449;
      }
   }

   public void setMenuEntries(MenuEntry[] var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         boolean var2 = false;
         if (WorldMapSection2.tempMenuAction != null && this.field6552 * 1759446067 > 0) {
            var2 = WorldMapSection2.tempMenuAction.method978() == this.menuOpcodes[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method980() == this.menuIdentifiers[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method982() == this.menuActions[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method979() == this.menuTargets[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method983() == this.menuArguments1[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method989() == this.menuArguments2[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method991() == this.menuItemIds[this.field6552 * 1759446067 - 1]
               && WorldMapSection2.tempMenuAction.method988() == this.menuWorldViewIds[this.field6552 * 1759446067 - 1];
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            rl5 var4 = (rl5)var1[var3];
            if (var4.field5666 != var3) {
               if (var4.field5665 != this) {
                  throw new IllegalArgumentException("menu entry at index " + var3 + " doesn't belong to this menu");
               }

               if (var4.field5666 <= var3) {
                  throw new IllegalArgumentException("menu entry out of order (are you passing the same menu twice?)");
               }

               this.method12403(var4.field5666, var3);
            }
         }

         this.field6552 = var1.length * 849057531;
         this.field6573 = var1.length;
         if (var2 && this.field6552 * 1759446067 > 0) {
            assert WorldMapSection2.tempMenuAction != null;

            WorldMapSection2.tempMenuAction.method986(this.menuOpcodes[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method987(this.menuIdentifiers[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method985(this.menuActions[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method992(this.menuTargets[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method981(this.menuArguments1[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method977(this.menuArguments2[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method984(this.menuItemIds[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.method990(this.menuWorldViewIds[this.field6552 * 1759446067 - 1]);
            WorldMapSection2.tempMenuAction.field331 = this.field6564[this.field6552 * 1759446067 - 1].field5667;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;)V")
   @ObfuscatedName("ah")
   public void method12413(Menu var1) {
      this.method12404(var1, 219952160);
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("qm")
   public rl5 method12399(int var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.field6552 * 1759446067 >= this.field6563) {
         throw new IllegalStateException("Menu has exceeded the maximum number of entries (" + this.field6563 + ")");
      } else {
         if (var1 < 0) {
            var1 = this.field6552 * 1759446067 + var1 + 1;
            if (var1 < 0) {
               throw new IllegalArgumentException();
            }
         }

         rl5 var2;
         if (var1 < this.field6552 * 1759446067) {
            rl5 var3 = this.field6564[this.field6552 * 1759446067];
            if (var3 == null) {
               var3 = this.field6564[this.field6552 * 1759446067] = new rl5(this, this.field6552 * 1759446067);
            }

            for (int var4 = this.field6552 * 1759446067; var4 > var1; this.field6564[var4].field5666 = var4--) {
               this.menuActions[var4] = this.menuActions[var4 - 1];
               this.menuTargets[var4] = this.menuTargets[var4 - 1];
               this.menuIdentifiers[var4] = this.menuIdentifiers[var4 - 1];
               this.menuOpcodes[var4] = this.menuOpcodes[var4 - 1];
               this.menuArguments1[var4] = this.menuArguments1[var4 - 1];
               this.menuArguments2[var4] = this.menuArguments2[var4 - 1];
               this.menuItemIds[var4] = this.menuItemIds[var4 - 1];
               this.menuWorldViewIds[var4] = this.menuWorldViewIds[var4 - 1];
               this.menuShiftClick[var4] = this.menuShiftClick[var4 - 1];
               this.subMenus[var4] = this.subMenus[var4 - 1];
               this.field6564[var4] = this.field6564[var4 - 1];
            }

            this.field6552 = (this.field6552 * 1759446067 + 1) * 849057531;
            this.field6573 = this.field6552 * 1759446067;
            var2 = var3;
            this.field6564[var1] = var3;
            var3.field5666 = var1;
         } else {
            if (var1 != this.field6552 * 1759446067) {
               throw new IllegalArgumentException();
            }

            var2 = this.field6564[this.field6552 * 1759446067];
            if (var2 == null) {
               var2 = this.field6564[this.field6552 * 1759446067] = new rl5(this, this.field6552 * 1759446067);
            }

            this.field6552 = (this.field6552 * 1759446067 + 1) * 849057531;
            this.field6573 = this.field6552 * 1759446067;
         }

         this.menuActions[var2.field5666] = "";
         this.menuTargets[var2.field5666] = "";
         this.menuOpcodes[var2.field5666] = net.runelite.api.MenuAction.RUNELITE.getId();
         this.menuIdentifiers[var2.field5666] = 0;
         this.menuArguments1[var2.field5666] = 0;
         this.menuArguments2[var2.field5666] = 0;
         this.menuItemIds[var2.field5666] = -1;
         this.menuWorldViewIds[var2.field5666] = -1;
         this.subMenus[var2.field5666] = null;
         var2.field5667 = null;
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;Lxk;)V")
   @ObfuscatedName("pg")
   public static void method12365(Menu var0, Menu var1) {
      if (var0 == null) {
         var0.method12359();
      }

      class604.method12442(var0, (byte)57);
      var0.menuX = 1 * var1.menuX + var1.menuWidth * -1860816827;
      if (121140035 * var0.menuX + 1653973263 * var0.menuWidth > 120179835 * class489.canvasWidth) {
         var0.menuX = var1.menuX * 1 - var0.menuWidth * -1860816827;
      }

      if (var0.menuX * 121140035 < 0) {
         var0.menuX = 0;
      }

      int var2 = 1308492019 * var1.menuY + (621887229 * var1.field6552 - 15 - -1588114441 * var1.field6567);
      if (var1.field6565) {
         var2 += 17;
      }

      int var3 = var2 + 19;
      var0.menuY = 1877284923 * var2;
      if (var0.menuHeight * 399255337 + var0.menuY * 1308492019 > class374.canvasHeight * 19292887) {
         var0.menuY = (var3 - var0.menuHeight * 399255337) * 1877284923;
      }

      if (1308492019 * var0.menuY < 0) {
         var0.menuY = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;)V")
   @ObfuscatedName("ai")
   public static void method12384(Menu var0) {
      if (var0 == null) {
         var0.method12383();
      } else {
         if (-666068800 * var0.field6567 != -1) {
            if (null != var0.subMenus[var0.field6567 * -1600263449]) {
               var0.subMenus[681036770 * var0.field6567].invalidateWidgetsUnder(961805852);
            }

            var0.field6567 = -100811449;
         }
      }
   }

   public int getMenuY() {
      return this.menuY * 1308492019;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ae")
   final int method12395(int var1, int var2, int var3) {
      int var4 = this == client.menu ? client.field946 : client.field990;

      for (int var5 = 0; var5 < this.field6551 * 1759446067; var5++) {
         int var6 = this.menuX * 1308492019 + (this.field6552 * 1759446067 - 1 - var5 - var4) * 15 + 14;
         if (this.field6565) {
            var6 += 17;
         }

         if (var1 > this.menuWidth * 121140035 && var1 < this.menuWidth * 1653973263 + this.field6567 * 121140035 && var2 > var6 - 13 && var2 < var6 + 3) {
            return var5;
         }
      }

      return -1;
   }
}
