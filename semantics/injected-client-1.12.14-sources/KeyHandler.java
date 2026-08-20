import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aq")
public class KeyHandler implements KeyListener, FocusListener {
   @ObfuscatedSignature(descriptor = "[Lbs;")
   @ObfuscatedName("ag")
   classBS[] field50;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field55 = 100;
   @ObfuscatedName("aj")
   volatile int KeyHandler_idleCycles;
   @ObfuscatedName("an")
   Collection field52;
   @ObfuscatedName("at")
   boolean[] KeyHandler_pressedKeys = new boolean[112];
   @ObfuscatedName("ae")
   Collection field49;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field54 = 6;

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bo")
   public final synchronized void method198(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && -962901095 != var2 && class161.method4255(var2, (byte)1)) {
         this.field52.add(new class33(3, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)Z")
   @ObfuscatedName("ce")
   public static boolean method213(KeyEvent var0) {
      return (SecureUrlRequester.client.method2562() == 10 || SecureUrlRequester.client.method2562() == 11)
         && SecureUrlRequester.client.getCurrentLoginField() == 1
         && !var0.isMetaDown()
         && !var0.isControlDown();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)Ljava/io/File;")
   @ObfuscatedName("at")
   static File getFile(String var0, short var1) {
      try {
         if (!FileSystem.FileSystem_hasPermissions) {
            if (var1 <= 1605) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
            if (null != var2) {
               if (var1 <= 1605) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               File var3 = new File(FileSystem.FileSystem_cacheDir, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if (!var5.exists()) {
                     throw new RuntimeException("");
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     FileSystem.FileSystem_cacheFiles.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if (var4 != null) {
                        if (var1 <= 1605) {
                           throw new IllegalStateException();
                        }

                        var4.close();
                        Object var10 = null;
                     }
                  } catch (Exception var7) {
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "aq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method177(int var1) {
      try {
         return this.KeyHandler_idleCycles * 559141873 <= 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("aq")
   public final synchronized void method192(KeyEvent var1) {
      int var6;
      label32: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5;
               if (FloorDecoration.method6190(var5, (byte)-11)) {
                  var6 = -1;
               }
               break label32;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         if (!this.KeyHandler_pressedKeys[var6]) {
            this.KeyHandler_idleCycles = 0;
         }

         this.KeyHandler_pressedKeys[var6] = true;
         this.field52.add(new class33(1, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("ae")
   synchronized void method183(Component var1, int var2) {
      try {
         var1.removeKeyListener(this);
         var1.removeFocusListener(this);
         synchronized (this) {
            this.field52.add(new class33(4, 0));
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "aq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ue")
   public int method214() {
      return this.KeyHandler_idleCycles * 559141873;
   }

   @ObfuscatedSignature(descriptor = "()[Z")
   @ObfuscatedName("wl")
   public boolean[] method215() {
      return this.KeyHandler_pressedKeys;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("by")
   public final synchronized void method207(FocusEvent var1) {
      for (int var2 = 0; var2 < -1244213217; var2++) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field52.add(new class33(2, var2));
         }
      }

      this.field52.add(new class33(4, 0));
   }

   @Override
   public final synchronized void keyReleased(KeyEvent var1) {
      if (!method213(var1)) {
         SecureUrlRequester.client.getCallbacks().keyReleased(var1);
      }

      class33.field208 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         int var9;
         label28: {
            var9 = var3.getKeyCode();
            if (var9 >= 0) {
               int var6 = class27.KeyHandler_keyCodes.length;
               if (var9 < var6) {
                  int var7 = class27.KeyHandler_keyCodes[var9];
                  var9 = var7 & -129;
                  break label28;
               }
            }

            var9 = -1;
         }

         if (var9 >= 0) {
            var2.KeyHandler_pressedKeys[var9] = false;
            var2.field52.add(new class33(2, var9));
         }

         var3.consume();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "aq.keyReleased(" + ')');
      }

      class33.field208 = false;
   }

   @Override
   public final synchronized void keyTyped(KeyEvent var1) {
      if (!method213(var1)) {
         SecureUrlRequester.client.getCallbacks().keyTyped(var1);
      }

      class33.field208 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         char var4 = var3.getKeyChar();
         if (var4 != 0 && '\uffff' != var4 && class161.method4255(var4, (byte)1)) {
            var2.field52.add(new class33(3, var4));
         }

         var3.consume();
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "aq.keyTyped(" + ')');
      }

      class33.field208 = false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   synchronized void method202(int var1) {
      try {
         Collection var2 = this.field49;
         this.field49 = this.field52;
         this.field52 = var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aq.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method188() {
      this.KeyHandler_idleCycles += -480854767;
      this.method202(-385710694);

      for (class33 var2 : this.field49) {
         int var3 = 0;

         while (var3 < this.field50.length && !var2.method656(this.field50[var3], -1676749524)) {
            var3++;
         }
      }

      this.field49.clear();
   }

   @ObfuscatedSignature(descriptor = "(Laq;I)V")
   @ObfuscatedName("lg")
   public static void method189(KeyHandler var0, int var1) {
      if (var0 == null) {
         var0.method191(var1);
      } else {
         try {
            var0.KeyHandler_idleCycles += -480854767;
            var0.method202(-385710694);
            Iterator var2 = var0.field49.iterator();

            while (var2.hasNext()) {
               if (var1 <= -299150792) {
                  throw new IllegalStateException();
               }

               class33 var3 = (class33)var2.next();

               for (int var4 = 0; var4 < var0.field50.length; var4++) {
                  if (var3.method656(var0.field50[var4], -1190796916)) {
                     if (var1 <= -299150792) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }

            var0.field49.clear();
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "aq.aj(" + ')');
         }
      }
   }

   @Override
   public final synchronized void focusLost(FocusEvent var1) {
      this.method211(var1);

      try {
         for (int var2 = 0; var2 < 112; var2++) {
            if (this.KeyHandler_pressedKeys[var2]) {
               this.KeyHandler_pressedKeys[var2] = false;
               this.field52.add(new class33(2, var2));
            }
         }

         this.field52.add(new class33(4, 0));
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aq.focusLost(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("aw")
   void method167(classBS var1, int var2) {
      this.field50[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("ap")
   void method168(classBS var1, int var2) {
      this.field50[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("ay")
   void method169(classBS var1, int var2) {
      this.field50[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)V")
   @ObfuscatedName("au")
   void method170(classBS var1, int var2) {
      this.field50[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   public int method173() {
      return 559141873 * this.KeyHandler_idleCycles;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method174() {
      return 559141873 * this.KeyHandler_idleCycles;
   }

   @Override
   public final synchronized void focusGained(FocusEvent var1) {
      try {
         this.field52.add(new class33(4, 1));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aq.focusGained(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method178() {
      return this.KeyHandler_idleCycles * 559141873 <= 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ac")
   void method179(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ax")
   void method180(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ar")
   synchronized void method184(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized (this) {
         this.field52.add(new class33(4, 0));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("ah")
   synchronized void method185(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized (this) {
         this.field52.add(new class33(4, 0));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;)V")
   @ObfuscatedName("al")
   synchronized void method186(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized (this) {
         this.field52.add(new class33(4, 0));
      }
   }

   @ObfuscatedSignature(descriptor = "(Laq;Lbs;IB)V")
   @ObfuscatedName("hc")
   public static void method171(KeyHandler var0, classBS var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method172(var1, var2, var3);
      } else {
         try {
            var0.field50[var2] = var1;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "aq.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method175() {
      return 559141873 * this.KeyHandler_idleCycles;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   static int Messages_getHistorySize(int var0, int var1) {
      try {
         ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
         if (var2 == null) {
            if (var1 != 421673862) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var2.size(1853998737);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aq.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("ao")
   public final synchronized void method193(KeyEvent var1) {
      int var6;
      label30: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5;
               if (FloorDecoration.method6190(var5, (byte)-35)) {
                  var6 = -1;
               }
               break label30;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         if (!this.KeyHandler_pressedKeys[var6]) {
            this.KeyHandler_idleCycles = 0;
         }

         this.KeyHandler_pressedKeys[var6] = true;
         this.field52.add(new class33(1, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method190() {
      this.KeyHandler_idleCycles += -480854767;
      this.method202(-385710694);

      for (class33 var2 : this.field49) {
         int var3 = 0;

         while (var3 < this.field50.length && !var2.method656(this.field50[var3], -846003045)) {
            var3++;
         }
      }

      this.field49.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("ba")
   public final synchronized void method208(FocusEvent var1) {
      for (int var2 = 0; var2 < 112; var2++) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field52.add(new class33(2, var2));
         }
      }

      this.field52.add(new class33(4, 0));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("aa")
   public final synchronized void method195(KeyEvent var1) {
      int var6;
      label25: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5 & -129;
               break label25;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         this.KeyHandler_pressedKeys[var6] = false;
         this.field52.add(new class33(2, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bg")
   public final synchronized void method196(KeyEvent var1) {
      int var6;
      label21: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5 & -129;
               break label21;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         this.KeyHandler_pressedKeys[var6] = false;
         this.field52.add(new class33(2, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bb")
   public final synchronized void method197(KeyEvent var1) {
      int var6;
      label25: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5 & -129;
               break label25;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         this.KeyHandler_pressedKeys[var6] = false;
         this.field52.add(new class33(2, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("wr")
   public void method211(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(false);
      SecureUrlRequester.client.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method176(int var1) {
      try {
         return 559141873 * this.KeyHandler_idleCycles;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aq.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bs")
   public final synchronized void method199(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && '\uffff' != var2 && class161.method4255(var2, (byte)1)) {
         this.field52.add(new class33(3, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bz")
   public final synchronized void method200(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && '\uffff' != var2 && class161.method4255(var2, (byte)1)) {
         this.field52.add(new class33(3, var2));
      }

      var1.consume();
   }

   KeyHandler() {
      this.field50 = new classBS[3];
      this.KeyHandler_idleCycles = 0;
      this.field52 = new ArrayList(100);
      this.field49 = new ArrayList(100);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bp")
   public final synchronized void method203(FocusEvent var1) {
      this.field52.add(new class33(4, 1));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bi")
   public final synchronized void method204(FocusEvent var1) {
      this.field52.add(new class33(4, 1));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bt")
   public final synchronized void method205(FocusEvent var1) {
      this.field52.add(new class33(4, 1));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("an")
   void method181(Component var1, int var2) {
      try {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(this);
         var1.addFocusListener(this);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aq.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bj")
   public final synchronized void method209(FocusEvent var1) {
      for (int var2 = 0; var2 < 112; var2++) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field52.add(new class33(2, var2));
         }
      }

      this.field52.add(new class33(4, 0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laq;Ljava/awt/Component;)V")
   @ObfuscatedName("jl")
   public static void method182(KeyHandler var0, Component var1) {
      if (var0 == null) {
         var0.method186(var1);
      }

      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(var0);
      var1.addFocusListener(var0);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bu")
   public final synchronized void method210(FocusEvent var1) {
      for (int var2 = 0; var2 < 112; var2++) {
         if (this.KeyHandler_pressedKeys[var2]) {
            this.KeyHandler_pressedKeys[var2] = false;
            this.field52.add(new class33(2, var2));
         }
      }

      this.field52.add(new class33(4, 0));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("bk")
   public final synchronized void method194(KeyEvent var1) {
      int var6;
      label28: {
         var6 = var1.getKeyCode();
         if (var6 >= 0) {
            int var4 = class27.KeyHandler_keyCodes.length;
            if (var6 < var4) {
               int var5 = class27.KeyHandler_keyCodes[var6];
               var6 = var5;
               if (FloorDecoration.method6190(var5, (byte)-106)) {
                  var6 = -1;
               }
               break label28;
            }
         }

         var6 = -1;
      }

      if (var6 >= 0) {
         if (!this.KeyHandler_pressedKeys[var6]) {
            this.KeyHandler_idleCycles = 0;
         }

         this.KeyHandler_pressedKeys[var6] = true;
         this.field52.add(new class33(1, var6));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/KeyEvent;)V")
   @ObfuscatedName("be")
   public final synchronized void method201(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && '\uffff' != var2 && class161.method4255(var2, (byte)1)) {
         this.field52.add(new class33(3, var2));
      }

      var1.consume();
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("nb")
   static void setTapToDrop(boolean var0, int var1) {
      try {
         client.tapToDrop = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aq.nb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("bm")
   public final synchronized void method206(FocusEvent var1) {
      this.field52.add(new class33(4, 1));
   }

   @Override
   public final synchronized void keyPressed(KeyEvent var1) {
      if (!method213(var1)) {
         SecureUrlRequester.client.getCallbacks().keyPressed(var1);
      }

      class33.field208 = var1.isConsumed();
      KeyEvent var3 = var1;
      KeyHandler var2 = this;

      try {
         int var9;
         label38: {
            var9 = var3.getKeyCode();
            if (var9 >= 0) {
               int var6 = class27.KeyHandler_keyCodes.length;
               if (var9 < var6) {
                  int var7 = class27.KeyHandler_keyCodes[var9];
                  var9 = var7;
                  if (FloorDecoration.method6190(var7, (byte)-75)) {
                     var9 = -1;
                  }
                  break label38;
               }
            }

            var9 = -1;
         }

         if (var9 >= 0) {
            if (!var2.KeyHandler_pressedKeys[var9]) {
               var2.KeyHandler_idleCycles = 0;
            }

            var2.KeyHandler_pressedKeys[var9] = true;
            var2.field52.add(new class33(1, var9));
         }

         var3.consume();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "aq.keyPressed(" + ')');
      }

      class33.field208 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;IB)V")
   @ObfuscatedName("av")
   void method172(classBS var1, int var2, byte var3) {
      try {
         this.field50[var2] = var1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "aq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method191(int var1) {
      try {
         this.KeyHandler_idleCycles += -480854767;
         this.method202(-385710694);
         Iterator var2 = this.field52.iterator();

         while (var2.hasNext()) {
            if (var1 <= -299150792) {
               throw new IllegalStateException();
            }

            class33 var3 = (class33)var2.next();

            for (int var4 = 0; var4 < this.field50.length; var4++) {
               if (var3.method656(this.field50[var4], -1190796916)) {
                  if (var1 <= -299150792) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }
         }

         this.field49.clear();
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "aq.aj(" + ')');
      }
   }
}
