import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ti")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedName("af")
   boolean[] field6141 = new boolean[112];
   @ObfuscatedName("as")
   volatile int field6142;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6146 = 100;
   @ObfuscatedName("ab")
   Collection field6140;
   @ObfuscatedName("ag")
   Collection field6144;
   @ObfuscatedSignature(descriptor = "[Ltl;")
   @ObfuscatedName("ae")
   classTL[] field6143 = new classTL[3];
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field6145 = 9;

   @Override
   public final synchronized void keyPressed(KeyEvent var1) {
      if (!method10846(var1)) {
         classOE.field4843.getCallbacks().keyPressed(var1);
      }

      classTP.field6186 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         int var4 = var3.getKeyCode();
         if (var4 >= 0 && var4 < classMO.method7635(-2145667177)) {
            int var5 = classTK.field6149[var4];
            var4 = var5;
            boolean var6 = (var5 & 128) != 0;
            if (var6) {
               var4 = -1;
            }
         } else {
            var4 = -1;
         }

         if (var4 >= 0) {
            if (!var2.field6141[var4]) {
               var2.field6142 = 0;
            }

            var2.field6141[var4] = true;
            var2.field6140.add(new classTP(1, var4));
         }

         var3.consume();
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ti.keyPressed(" + ')');
      }

      classTP.field6186 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ad")
   void method10823(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ltl;II)V")
   @ObfuscatedName("az")
   void method10814(classTL var1, int var2, int var3) {
      try {
         this.field6143[var2] = var1;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ti.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   boolean method10819(int var1) {
      try {
         boolean var10000;
         if (this.field6142 * -1014591847 <= 1) {
            if (var1 >= -106096842) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ti.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method10816(int var1) {
      try {
         return this.field6142 * -1014591847;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ti.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V")
   @ObfuscatedName("ag")
   synchronized void method10826(Component var1, byte var2) {
      try {
         var1.removeKeyListener(this);
         var1.removeFocusListener(this);
         synchronized (this) {
            this.field6140.add(new classTP(4, 0));
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ti.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   void method10828(byte var1) {
      try {
         this.field6142 += -1767512663;
         this.method10839((byte)-117);
         Iterator var2 = this.field6144.iterator();

         while (var2.hasNext()) {
            if (var1 >= 42) {
               throw new IllegalStateException();
            }

            classTP var3 = (classTP)var2.next();

            for (int var4 = 0; var4 < this.field6143.length; var4++) {
               if (var1 >= 42) {
                  throw new IllegalStateException();
               }

               if (var3.method10938(this.field6143[var4], -160021231)) {
                  if (var1 >= 42) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }
         }

         this.field6144.clear();
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ti.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)V")
   @ObfuscatedName("ac")
   void method10815(classTL var1, int var2) {
      this.field6143[var2] = var1;
   }

   @Override
   public final synchronized void keyReleased(KeyEvent var1) {
      if (!method10846(var1)) {
         classOE.field4843.getCallbacks().keyReleased(var1);
      }

      classTP.field6186 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         int var4 = var3.getKeyCode();
         if (var4 >= 0 && var4 < classMO.method7635(-2082023250)) {
            int var5 = classTK.field6149[var4];
            var4 = var5 & -129;
         } else {
            var4 = -1;
         }

         if (var4 >= 0) {
            var2.field6141[var4] = false;
            var2.field6140.add(new classTP(2, var4));
         }

         var3.consume();
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ti.keyReleased(" + ')');
      }

      classTP.field6186 = false;
   }

   @Override
   public final synchronized void keyTyped(KeyEvent var1) {
      if (!method10846(var1)) {
         classOE.field4843.getCallbacks().keyTyped(var1);
      }

      classTP.field6186 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         char var4 = var3.getKeyChar();
         if (var4 != 0 && var4 != '\uffff' && classNR.method7985(var4, 971921516)) {
            var2.field6140.add(new classTP(3, var4));
         }

         var3.consume();
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ti.keyTyped(" + ')');
      }

      classTP.field6186 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("ab")
   void method10824(Component var1, int var2) {
      try {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(this);
         var1.addFocusListener(this);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ti.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)Z")
   @ObfuscatedName("mj")
   public static boolean method10846(KeyEvent var0) {
      return (classOE.field4843.method2424() == 10 || classOE.field4843.method2424() == 11)
         && classOE.field4843.getCurrentLoginField() == 1
         && !var0.isMetaDown()
         && !var0.isControlDown();
   }

   @Override
   public final synchronized void focusGained(FocusEvent var1) {
      try {
         this.field6140.add(new classTP(4, 1));
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ti.focusGained(" + ')');
      }
   }

   @Override
   public final synchronized void focusLost(FocusEvent var1) {
      this.method10845(var1);

      try {
         for (int var2 = 0; var2 < 112; var2++) {
            if (this.field6141[var2]) {
               this.field6141[var2] = false;
               this.field6140.add(new classTP(2, var2));
            }
         }

         this.field6140.add(new classTP(4, 0));
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ti.focusLost(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afl")
   public final synchronized void method10840(FocusEvent var1) {
      this.field6140.add(new classTP(4, 1));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afz")
   public final synchronized void method10841(FocusEvent var1) {
      this.field6140.add(new classTP(4, 1));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bn")
   public final synchronized void method10836(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff' && classNR.method7985(var2, 2029555553)) {
         this.field6140.add(new classTP(3, var2));
      }

      var1.consume();
   }

   KeyHandler() {
      this.field6142 = 0;
      this.field6140 = new ArrayList(100);
      this.field6144 = new ArrayList(100);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   boolean method10820() {
      return this.field6142 * 1169335602 <= 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("aff")
   public final synchronized void method10842(FocusEvent var1) {
      for (int var2 = 0; var2 < 112; var2++) {
         if (this.field6141[var2]) {
            this.field6141[var2] = false;
            this.field6140.add(new classTP(2, var2));
         }
      }

      this.field6140.add(new classTP(4, 0));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method10817() {
      return this.field6142 * -1582919746;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method10818() {
      return this.field6142 * -1014591847;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   boolean method10821() {
      return this.field6142 * -1014591847 <= 1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   boolean method10822() {
      return this.field6142 * -1014591847 <= 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("av")
   public final synchronized void method10837(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff' && classNR.method7985(var2, -750265435)) {
         this.field6140.add(new classTP(3, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("qk")
   public void method10845(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(false);
      classOE.field4843.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ap")
   void method10825(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("afg")
   public final synchronized void method10843(FocusEvent var1) {
      for (int var2 = 0; var2 < 112; var2++) {
         if (this.field6141[var2]) {
            this.field6141[var2] = false;
            this.field6140.add(new classTP(2, var2));
         }
      }

      this.field6140.add(new classTP(4, 0));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("au")
   synchronized void method10827(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized (this) {
         this.field6140.add(new classTP(4, 0));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;)V")
   @ObfuscatedName("ve")
   public static void method10829(KeyHandler var0) {
      if (var0 == null) {
         var0.method10830();
      }

      var0.field6142 += -1767512663;
      var0.method10839((byte)-74);

      for (classTP var2 : var0.field6144) {
         int var3 = 0;

         while (var3 < var0.field6143.length && !var2.method10938(var0.field6143[var3], -160021231)) {
            var3++;
         }
      }

      var0.field6144.clear();
   }

   @ObfuscatedSignature(descriptor = "()[Z")
   @ObfuscatedName("pb")
   public boolean[] method10847() {
      return this.field6141;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method10830() {
      this.field6142 += -1767512663;
      this.method10839((byte)-52);

      for (classTP var2 : this.field6144) {
         int var3 = 0;

         while (var3 < this.field6143.length && !var2.method10938(this.field6143[var3], -160021231)) {
            var3++;
         }
      }

      this.field6144.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("am")
   public final synchronized void method10831(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < classMO.method7635(-2008485335)) {
         int var3 = classTK.field6149[var2];
         var2 = var3;
         boolean var4 = (var3 & 128) != 0;
         if (var4) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.field6141[var2]) {
            this.field6142 = 0;
         }

         this.field6141[var2] = true;
         this.field6140.add(new classTP(1, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("ah")
   public final synchronized void method10832(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < classMO.method7635(-2057518936)) {
         int var3 = classTK.field6149[var2];
         var2 = var3;
         boolean var4 = (var3 & 128) != 0;
         if (var4) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.field6141[var2]) {
            this.field6142 = 0;
         }

         this.field6141[var2] = true;
         this.field6140.add(new classTP(1, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("at")
   public final synchronized void method10833(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < classMO.method7635(-2092039702)) {
         int var3 = classTK.field6149[var2];
         var2 = var3;
         boolean var4 = (var3 & 128) != 0;
         if (var4) {
            var2 = -1;
         }
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.field6141[var2]) {
            this.field6142 = 0;
         }

         this.field6141[var2] = true;
         this.field6140.add(new classTP(1, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("an")
   public final synchronized void method10834(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 >= 0 && var2 < classMO.method7635(-1983154445)) {
         int var3 = classTK.field6149[var2];
         var2 = var3 & -129;
      } else {
         var2 = -1;
      }

      if (var2 >= 0) {
         this.field6141[var2] = false;
         this.field6140.add(new classTP(2, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bx")
   public final synchronized void method10838(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != 281755018 && classNR.method7985(var2, 560348594)) {
         this.field6140.add(new classTP(3, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ax")
   synchronized void method10839(byte var1) {
      try {
         Collection var2 = this.field6144;
         this.field6144 = this.field6140;
         this.field6140 = var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ti.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   public int method10848() {
      return this.field6142 * -1014591847;
   }

   @ObfuscatedSignature(descriptor = "(Ljc;I)V")
   @ObfuscatedName("di")
   static final void method10844(classJC var0, int var1) {
      try {
         PacketBuffer var2 = client.field795.field1523;
         if (var0 == classJC.field3132) {
            int var35 = var2.method13159((byte)-22);
            int var50 = classCJ.field763 * -189864519 + (var35 >> 4 & 7);
            int var65 = (var35 & 7) + 1180602653 * classNT.field4742;
            int var81 = classXY.method13039(var2, -346779531);
            int var98 = var81 >> 2;
            int var112 = var81 & 3;
            int var123 = client.field808[var98];
            int var131 = classXY.method13197(var2, 1973365750);
            if (0 <= var50) {
               if (var1 <= 1421159847) {
                  return;
               }

               if (var50 < classCQ.field1220.field1696 * 1296729483 - 1) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  if (0 <= var65) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     if (var65 < classCQ.field1220.field1692 * -1269171107 - 1) {
                        if (var1 <= 1421159847) {
                           throw new IllegalStateException();
                        }

                        int var164;
                        if (-1 == client.field948 * 1170158913) {
                           if (var1 <= 1421159847) {
                              throw new IllegalStateException();
                           }

                           var164 = -483624883 * classCQ.field1220.field1710;
                        } else {
                           var164 = 1170158913 * client.field948;
                        }

                        int var136 = var164;
                        classCD var141 = classXX.method12954(classCQ.field1220, var136, var50, var65, var123, 1348701295);
                        if (var141 != null) {
                           classOM var146 = classMU.method7729(1490231037 * var141.field675, 1422957852);
                           if (var146.field4965) {
                              if (var1 <= 1421159847) {
                                 throw new IllegalStateException();
                              }

                              classFA.method4551(var136, var50, var65, var98, var112, var123, var131, -208526133);
                              var141.field682 = var131 * -643835989;
                              return;
                           }
                        }

                        boolean var147 = classFA.method4551(var136, var50, var65, var98, var112, var123, var131, -208526133);
                        if (var147) {
                           if (var1 <= 1421159847) {
                              throw new IllegalStateException();
                           }

                           return;
                        }

                        if (var141 != null) {
                           if (var1 <= 1421159847) {
                              throw new IllegalStateException();
                           }

                           var141.field682 = var131 * -643835989;
                        }
                     }
                  }
               }
            }
         } else if (classJC.field3133 == var0) {
            int var34 = classXY.method13047(var2, -1843318509);
            int var49 = classXY.method13047(var2, -384183043);
            int var64 = var2.method13249((byte)-76);
            boolean var163;
            if (classXY.method13039(var2, -346779531) == 1) {
               if (var1 <= 1421159847) {
                  return;
               }

               var163 = true;
            } else {
               var163 = false;
            }

            boolean var80 = var163;
            int var97 = classXY.method13194(var2, -1740297108);
            int var111 = var2.method13159((byte)-107);
            int var122 = classCJ.field763 * -189864519 + (var111 >> 4 & 7);
            int var130 = classNT.field4742 * 1180602653 + (var111 & 7);
            int var135 = var2.method13164(-1025595677);
            int var140 = var2.method13164(-1836435558);
            if (classCQ.field1220.method3729(var122, var130, (byte)1)) {
               if (var1 <= 1421159847) {
                  throw new IllegalStateException();
               }

               int var145 = client.field948 * 1170158913 == -1 ? classCQ.field1220.field1710 * -483624883 : client.field948 * 1170158913;
               classBA.method778(var145, var122, var130, var97, var64, var135, var49, var34, var140, var80, (byte)-57);
            }
         } else if (var0 == classJC.field3127) {
            if (var1 <= 1421159847) {
               throw new IllegalStateException();
            } else {
               classSS var33 = new classSS();
               int var47 = -1;
               boolean var62 = false;
               int var79 = var2.method13198(-1434408267);
               int var161;
               if (var79 == 65535) {
                  if (var1 <= 1421159847) {
                     return;
                  }

                  var161 = -1;
               } else {
                  var161 = 1612595797 * client.field855 + var79;
               }

               var47 = var161;
               boolean var162;
               if (var2.method13159((byte)-74) == 1) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  var162 = true;
               } else {
                  var162 = false;
               }

               var62 = var162;
               var33.field6032 = var2.method13207((byte)29) * -969970217;
               int var96 = var2.method13056((byte)1);
               int var10001;
               if (var96 != -1) {
                  if (var1 <= 1421159847) {
                     return;
                  }

                  var10001 = classKY.method6594(var96, (byte)-105);
               } else {
                  var10001 = -1;
               }

               var33.field6038 = var10001 * 1193805589;
               var33.field6034 = (-1 != var96 ? classKY.method6582(var96, -1055292878) : -1) * -1642715775;
               if (-1 != var96) {
                  if (var1 <= 1421159847) {
                     return;
                  }

                  var10001 = classKY.method6596(var96, -560268380);
               } else {
                  var10001 = -1;
               }

               var33.field6033 = var10001 * 70896537;
               var33.field6036 = var2.method13202((byte)40) * 178294521;
               var33.field6035 = var2.method13211(585941008) * 1699250641;
               int var110 = classXY.method13194(var2, 1448795767);
               var33.field6037 = var2.method13053(831951752) * 688157855;
               classCJ var121 = (classCJ)classYE.field6977.method13595(var110);
               if (null != var121) {
                  if (var1 <= 1421159847) {
                     return;
                  }

                  var121.method1523(var33, var47, var62, 306770163);
               }
            }
         } else if (var0 == classJC.field3122) {
            if (var1 <= 1421159847) {
               throw new IllegalStateException();
            } else {
               int var32 = classXY.method13194(var2, -1108929325);
               int var46 = var2.method13165(-1876840737);
               int var61 = classCJ.field763 * -189864519 + (var46 >> 4 & 7);
               int var78 = 1180602653 * classNT.field4742 + (var46 & 7);
               int var95 = var2.method13056((byte)1);
               int var109 = -483624883 * classCQ.field1220.field1710;
               if (classCQ.field1220.method3729(var61, var78, (byte)1)) {
                  int var160;
                  if (1170158913 * client.field948 == -1) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var160 = var109;
                  } else {
                     var160 = client.field948 * 1170158913;
                  }

                  int var120 = var160;
                  classCL.method1629(var120, var61, var78, var32, var95, -159961776);
               }
            }
         } else if (classJC.field3123 == var0) {
            if (var1 <= 1421159847) {
               throw new IllegalStateException();
            } else {
               classSW var31 = new classSW();
               var31.field6086 = var2.method13225(1575549434) * 1658557511;
               var31.field6090 = var2.method13050((byte)16) * -278025987;
               var31.field6079 = (client.field855 * 1612595797 + var2.method13198(-1436509297)) * -1585926007;
               int var45 = var2.method13198(-1094835482);
               var31.field6085 = var2.method13050((byte)16) * 1056651425;
               var31.field6091 = var2.method13220(-1135627181) * 448369705;
               var31.field6089 = classXY.method13197(var2, 1322098973) * 846057435;
               var31.field6082 = classXY.method13194(var2, -105078933) * -391951485;
               var31.field6075 = var2.method13211(882130167) * -1370366721;
               var31.field6092 = var2.method13050((byte)16) * -1957506295;
               int var60 = var2.method13159((byte)-53);
               var31.field6083 = 691497295 * ((var60 >> 4 & 7) + classCJ.field763 * -189864519 + -1444178379 * classCQ.field1220.field1709);
               var31.field6076 = classCQ.field1220.field1710 * -1751710143;
               var31.field6087 = (classCQ.field1220.field1708 * -351145363 + 1180602653 * classNT.field4742 + (var60 & 7)) * -1216819291;
               int var77 = var2.method13241(-2100807916);
               var31.field6088 = classKY.method6594(var77, (byte)-97) * 1535353223;
               var31.field6077 = classKY.method6582(var77, -876664652) * 429718429;
               var31.field6084 = classKY.method6596(var77, -560268380) * 21815931;
               var31.field6093 = (client.field855 * 1612595797 + classXY.method13047(var2, -168999643)) * 928894729;
               var31.field6080 = var2.method13207((byte)127) * 992233077;
               var31.field6074 = var2.method13050((byte)16) * -333010425;
               var31.field6081 = classXY.method13194(var2, 116317201) * 1823187999;
               var31.field6078 = var2.method13198(-1426374592) * 40297083;
               classCJ var93 = (classCJ)classYE.field6977.method13595(var45);
               if (var93 == null) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  var93 = new classCJ(var31, client.field814);
                  IterableNodeHashTable.method13576(classYE.field6977, var93, var45);
               }
            }
         } else if (var0 == classJC.field3128) {
            if (var1 <= 1421159847) {
               throw new IllegalStateException();
            } else {
               int var30 = var2.method13202((byte)44);
               int var44 = classXY.method13197(var2, 1406900354);
               int var59 = var2.method13159((byte)-13);
               int var76 = (var59 >> 4 & 7) + -189864519 * classCJ.field763;
               int var92 = classNT.field4742 * 1180602653 + (var59 & 7);
               short var108 = (short)var2.method13202((byte)99);
               int var119 = var2.method13202((byte)121);
               short var129 = (short)var2.method13211(1080191872);
               int var134 = var2.method13249((byte)-101);
               int var139 = var2.method13198(-845572973);
               if (classCQ.field1220.method3729(var76, var92, (byte)1)) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  int var159;
                  if (-1 == 1170158913 * client.field948) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var159 = -483624883 * classCQ.field1220.field1710;
                  } else {
                     var159 = 1170158913 * client.field948;
                  }

                  int var144 = var159;
                  SceneTilePaint.method4805(var144, var76, var92, var44, var134, var108, var30, var129, var119, var139, -606749454);
               }
            }
         } else {
            if (var0 == classJC.field3124) {
               if (var1 <= 1421159847) {
                  return;
               }

               byte var3 = classXY.method13043(var2, (byte)17);
               int var4 = var2.method13198(-90049927);
               int var5 = classXY.method13047(var2, 1798961974);
               int var6 = var2.method13164(-305774216);
               int var7 = var6 >> 2;
               int var8 = var6 & 3;
               int var9 = client.field808[var7];
               int var10 = var2.method13198(-601051358);
               byte var11 = var2.method13175((byte)-14);
               byte var12 = classXY.method13043(var2, (byte)17);
               byte var13 = var2.method13175((byte)-11);
               int var14 = classXY.method13197(var2, 142476591);
               int var15 = var2.method13164(-865502654);
               int var16 = classCJ.field763 * -189864519 + (var15 >> 4 & 7);
               int var17 = (var15 & 7) + classNT.field4742 * 1180602653;
               Player var18 = (Player)classCQ.field1220.field1694.method13404(var14);
               if (var18 != null) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  int var19 = client.field948 * 1170158913 == -1 ? classCQ.field1220.field1710 * -483624883 : client.field948 * 1170158913;
                  classCH.method1501(var19, var16, var17, var7, var8, var9, var4, var10, var5, var12, var3, var13, var11, var18, 1785952299);
               }
            }

            if (classJC.field3121 == var0) {
               if (var1 > 1421159847) {
                  int var29 = var2.method13165(-882208960);
                  int var43 = classXY.method13039(var2, -346779531);
                  String[] var58 = null;
                  if (var43 > 0) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var58 = new String[5];

                     for (int var74 = 0; var74 < var43; var74++) {
                        int var90 = var2.method13159((byte)-94);
                        String var106 = var2.method13071(88492239);
                        if (var90 >= 0) {
                           if (var1 <= 1421159847) {
                              throw new IllegalStateException();
                           }

                           if (var90 < 5) {
                              if (var1 <= 1421159847) {
                                 throw new IllegalStateException();
                              }

                              var58[var90] = var106;
                           }
                        }
                     }
                  }

                  int var75 = classXY.method13039(var2, -346779531);
                  int var91 = -189864519 * classCJ.field763 + (var75 >> 4 & 7);
                  int var107 = (var75 & 7) + 1180602653 * classNT.field4742;
                  int var118 = classXY.method13197(var2, 1547727932);
                  int var128 = classXY.method13039(var2, -346779531);
                  int var133 = var128 >> 2;
                  int var138 = var128 & 3;
                  int var143 = client.field808[var133];
                  if (classCQ.field1220.method3729(var91, var107, (byte)1)) {
                     int var158;
                     if (-1 == client.field948 * 1170158913) {
                        if (var1 <= 1421159847) {
                           throw new IllegalStateException();
                        }

                        var158 = -483624883 * classCQ.field1220.field1710;
                     } else {
                        var158 = 1170158913 * client.field948;
                     }

                     int var149 = var158;
                     classAT.method694(classCQ.field1220, var149, var91, var107, var143, var118, var133, var138, var29, var58, 0, -1, 792771515);
                  }
               }
            } else if (var0 == classJC.field3125) {
               if (var1 <= 1421159847) {
                  throw new IllegalStateException();
               } else {
                  int var28 = classXY.method13197(var2, 1135057181);
                  int var42 = classXY.method13047(var2, 1273392177);
                  int var57 = var2.method13165(-914131415);
                  int var73 = var2.method13198(63131065);
                  int var89 = var2.method13220(-73627511);
                  int var105 = var2.method13056((byte)1);
                  int var117 = classKY.method6582(var105, -1613263912);
                  int var127 = classKY.method6594(var105, (byte)-50);
                  int var132 = classKY.method6596(var105, -560268380);
                  int var137 = var2.method13164(-1910970546);
                  int var142 = -483624883 * classCQ.field1220.field1710;
                  int var148 = classCJ.field763 * -189864519 + (var137 >> 4 & 7) + classCQ.field1220.field1709 * -1444178379;
                  int var150 = classNT.field4742 * 1180602653 + (var137 & 7) + classCQ.field1220.field1708 * -351145363;
                  int var151 = classXY.method13047(var2, -880103579);
                  int var152 = var2.method13198(-1208611562);
                  int var153 = var2.method13053(831951752);
                  int var154 = var2.method13198(-1540229215);
                  if (65535 != var42) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     Projectile var20 = new Projectile(
                        var142,
                        var148,
                        var150,
                        var151,
                        var153,
                        var117,
                        var127,
                        var132,
                        var73,
                        var89,
                        var42,
                        var154 + 1612595797 * client.field855,
                        1612595797 * client.field855 + var152,
                        var57,
                        var28
                     );
                     classNN.method7900(client.field817, var20);
                  }
               }
            } else if (classJC.field3126 == var0) {
               int var27 = classXY.method13197(var2, 921884585);
               int var41 = var2.method13164(-666525720);
               int var56 = var2.method13165(-1495300004);
               int var72 = classCJ.field763 * -189864519 + (var56 >> 4 & 7);
               int var88 = 1180602653 * classNT.field4742 + (var56 & 7);
               if (classCQ.field1220.method3729(var72, var88, (byte)1)) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  int var157;
                  if (-1 == client.field948 * 1170158913) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var157 = -483624883 * classCQ.field1220.field1710;
                  } else {
                     var157 = 1170158913 * client.field948;
                  }

                  int var104 = var157;
                  PacketBuffer.method12934(var104, var72, var88, var27, var41, -2087522223);
               }
            } else if (classJC.field3135 == var0) {
               if (var1 > 1421159847) {
                  int var26 = var2.method13198(-1745711172);
                  int var40 = var2.method13198(-228571177);
                  int var55 = classXY.method13039(var2, -346779531);
                  int var70 = (var55 >> 4 & 7) + classCJ.field763 * -189864519;
                  int var86 = (var55 & 7) + classNT.field4742 * 1180602653;
                  int var103 = var2.method13164(-1184958884);
                  if (classCQ.field1220.method3729(var70, var86, (byte)1)) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var70 = classKY.method6612(var70, -1336037287);
                     var86 = classKY.method6612(var86, 1830189184);
                     int var156;
                     if (-1 == client.field948 * 1170158913) {
                        if (var1 <= 1421159847) {
                           throw new IllegalStateException();
                        }

                        var156 = -483624883 * classCQ.field1220.field1710;
                     } else {
                        var156 = client.field948 * 1170158913;
                     }

                     int var116 = var156;
                     GraphicsObject var126 = new GraphicsObject(
                        classCQ.field1220,
                        var26,
                        var116,
                        var70,
                        var86,
                        classKV.method6571(classCQ.field1220, var70, var86, var116, (byte)122) - var103,
                        var40,
                        1612595797 * client.field855
                     );
                     classNN.method7900(classCQ.field1220.field1691, var126);
                  }
               }
            } else if (classJC.field3131 == var0) {
               int var25 = var2.method13159((byte)-2);
               int var39 = var2.method13159((byte)-52);
               int var54 = var2.method13165(-830745353);
               int var69 = var2.method13159((byte)-37);
               int var85 = classCJ.field763 * -189864519 + (var69 >> 4 & 7);
               int var102 = 1180602653 * classNT.field4742 + (var69 & 7);
               int var115 = var2.method13164(-1869158557) & 31;
               int var125 = var2.method13198(-1104761026);
               if (classCQ.field1220.method3729(var85, var102, (byte)1)) {
                  if (var1 <= 1421159847) {
                     return;
                  }

                  classSM.method10481(
                     GraphicsObject.field475, classCQ.field1220.field1699 * 2140889407, var125, var85, var102, var115, var25, var39, var54, -287370627
                  );
               }
            } else if (classJC.field3130 == var0) {
               if (var1 <= 1421159847) {
                  throw new IllegalStateException();
               } else {
                  int var24 = classXY.method13039(var2, -346779531);
                  int var38 = -189864519 * classCJ.field763 + (var24 >> 4 & 7);
                  int var53 = (var24 & 7) + 1180602653 * classNT.field4742;
                  int var68 = var2.method13165(-792935715);
                  int var84 = var68 >> 2;
                  int var101 = var68 & 3;
                  int var114 = client.field808[var84];
                  if (classCQ.field1220.method3729(var38, var53, (byte)1)) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     int var155;
                     if (1170158913 * client.field948 == -1) {
                        if (var1 <= 1421159847) {
                           return;
                        }

                        var155 = classCQ.field1220.field1710 * -483624883;
                     } else {
                        var155 = 1170158913 * client.field948;
                     }

                     int var124 = var155;
                     classAT.method694(classCQ.field1220, var124, var38, var53, var114, -1, var84, var101, 31, null, 0, -1, -455522648);
                  }
               }
            } else if (var0 == classJC.field3134) {
               if (var1 <= 1421159847) {
                  throw new IllegalStateException();
               } else {
                  int var23 = var2.method13249((byte)-102);
                  int var37 = var2.method13159((byte)-122);
                  int var52 = -189864519 * classCJ.field763 + (var37 >> 4 & 7);
                  int var67 = classNT.field4742 * 1180602653 + (var37 & 7);
                  int var83 = classXY.method13194(var2, 918820734);
                  if (classCQ.field1220.method3729(var52, var67, (byte)1)) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     int var100 = -1 == 1170158913 * client.field948 ? -483624883 * classCQ.field1220.field1710 : client.field948 * 1170158913;
                     classGV.method5811(var100, var52, var67, var83, var23, (byte)101);
                  }
               }
            } else if (var0 == classJC.field3129) {
               int var22 = var2.method13165(-1439614678);
               int var36 = (var22 >> 4 & 7) + -189864519 * classCJ.field763;
               int var51 = (var22 & 7) + 1180602653 * classNT.field4742;
               int var66 = var2.method13249((byte)-6);
               int var82 = var2.method13056((byte)1);
               int var99 = var2.method13198(-1865069168);
               if (classCQ.field1220.method3729(var36, var51, (byte)1)) {
                  if (var1 <= 1421159847) {
                     throw new IllegalStateException();
                  }

                  int var10000;
                  if (1170158913 * client.field948 == -1) {
                     if (var1 <= 1421159847) {
                        throw new IllegalStateException();
                     }

                     var10000 = -483624883 * classCQ.field1220.field1710;
                  } else {
                     var10000 = 1170158913 * client.field948;
                  }

                  int var113 = var10000;
                  classFW.method5066(var113, var36, var51, var99, var66, var82, 227662474);
               }
            }
         }
      } catch (RuntimeException var21) {
         throw classEG.method3884(var21, "ti.di(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;III)V")
   @ObfuscatedName("as")
   public static void method10835(String[] var0, Object[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 >= 1008380135) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 >= 1008380135) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 >= 1008380135) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 >= 1008380135) {
                     return;
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method10835(var0, var1, var2, var6 - 1, 125288097);
            method10835(var0, var1, var6 + 1, var3, -236490995);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "ti.as(" + ')');
      }
   }
}
