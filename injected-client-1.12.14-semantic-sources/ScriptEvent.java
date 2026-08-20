import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cg")
public class ScriptEvent extends Node implements net.runelite.api.ScriptEvent {
   @ObfuscatedName("at")
   Object[] args;
   @ObfuscatedName("ae")
   int mouseY;
   @ObfuscatedName("au")
   String targetName;
   @ObfuscatedName("an")
   int mouseX;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field531 = 54;
   @ObfuscatedName("aj")
   int opIndex;
   @ObfuscatedName("ak")
   int field525;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("aw")
   Widget dragTarget;
   @ObfuscatedName("ap")
   int keyTyped;
   @ObfuscatedName("ay")
   int keyPressed;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("ag")
   Widget widget;
   @ObfuscatedName("az")
   int field530;
   @ObfuscatedName("ad")
   int type = -1361305332;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field523 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field526 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field521 = 33;
   @ObfuscatedName("av")
   boolean field535;

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("uz")
   public Widget method1412() {
      return this.dragTarget;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;Lof;)V")
   @ObfuscatedName("dw")
   public static void method1409(ScriptEvent var0, Widget var1) {
      if (var0 == null) {
         var0.getSource();
      }

      var0.widget = var1;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)V")
   @ObfuscatedName("jh")
   public void method1403(Object[] var1) {
      this.args = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lit;)V")
   @ObfuscatedName("dr")
   public static void method1411(StructComposition var0) {
      if (var0 == null) {
         var0.getParams();
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I)V")
   @ObfuscatedName("av")
   public void setArgs(Object[] var1, int var2) {
      try {
         this.args = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cg.av(" + ')');
      }
   }

   public int getMouseX() {
      return this.mouseX * -1567081689;
   }

   public int getOp() {
      return this.opIndex * 2029362027;
   }

   public int getTypedKeyChar() {
      return this.keyPressed * 837595959;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)V")
   @ObfuscatedName("ae")
   public void method1413(Object[] var1) {
      this.args = var1;
   }

   public int getTypedKeyCode() {
      return this.keyTyped * 1798396775;
   }

   public void run() {
      client.method2351(this);
   }

   public String getOpbase() {
      return this.targetName;
   }

   @ObfuscatedSignature(descriptor = "(Lcg;IB)V")
   @ObfuscatedName("qf")
   public static void method1406(ScriptEvent var0, int var1, byte var2) {
      if (var0 == null) {
         var0.setType(var1, var2);
      } else {
         try {
            var0.type = 1960033553 * var1;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "cg.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;S)V")
   @ObfuscatedName("ag")
   public void method1410(Widget var1, short var2) {
      try {
         this.widget = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cg.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void method1407(int var1) {
      this.type = 1960033553 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Lcg;")
   @ObfuscatedName("xi")
   public ScriptEvent method1414(net.runelite.api.widgets.Widget var1) {
      this.widget = (Widget)var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("bz")
   public Widget method1415() {
      return this.widget;
   }

   public int getMouseY() {
      return this.mouseY * -1332622121;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Lcg;")
   @ObfuscatedName("bl")
   public ScriptEvent method1416(net.runelite.api.widgets.Widget var1) {
      this.dragTarget = (Widget)var1;
      return this;
   }

   public Object[] getArguments() {
      return this.args;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)V")
   @ObfuscatedName("an")
   public void method1405(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lcg;")
   @ObfuscatedName("go")
   public ScriptEvent method1417(int var1) {
      this.opIndex = var1 * 1362671939;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("at")
   public void setType(int var1, byte var2) {
      try {
         this.field525 = 1960033553 * var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cg.at(" + ')');
      }
   }
}
