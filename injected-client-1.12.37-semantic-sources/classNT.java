import java.awt.event.FocusEvent;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nt")
public class classNT extends Node {
   @ObfuscatedName("af")
   int field4725;
   @ObfuscatedName("ai")
   int field4727;
   @ObfuscatedSignature(descriptor = "Lny;")
   @ObfuscatedName("ag")
   classNY field4747;
   @ObfuscatedName("aa")
   int field4722;
   @ObfuscatedSignature(descriptor = "Lam;")
   @ObfuscatedName("aw")
   classAM field4744;
   @ObfuscatedName("as")
   int field4735;
   @ObfuscatedName("ax")
   int field4738;
   @ObfuscatedName("ac")
   int field4723;
   @ObfuscatedSignature(descriptor = "Laj;")
   @ObfuscatedName("ab")
   classAJ field4743;
   @ObfuscatedName("ao")
   int field4731;
   @ObfuscatedName("al")
   int field4730;
   @ObfuscatedName("aj")
   int field4728;
   @ObfuscatedName("ay")
   int field4739;
   @ObfuscatedName("aq")
   int field4733;
   @ObfuscatedName("ad")
   int field4724;
   @ObfuscatedName("ap")
   int field4732;
   @ObfuscatedName("au")
   int field4736;
   @ObfuscatedName("ar")
   int field4734;
   @ObfuscatedSignature(descriptor = "Lnr;")
   @ObfuscatedName("ae")
   classNR field4746;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4740 = 1048576;
   @ObfuscatedName("ak")
   int field4729;
   @ObfuscatedName("av")
   int field4737;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field4741 = 32768;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field4726 = 22;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final String field4745 = "oldschool";
   @ObfuscatedName("mz")
   static int field4742;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)I")
   @ObfuscatedName("lz")
   public static int method8005(ScriptEvent var0) {
      if (var0 == null) {
         var0.method14121();
      }

      return var0.field7243 * 1669413145;
   }

   classNT() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/util/ArrayList;")
   @ObfuscatedName("us")
   public static ArrayList method8006(classMA var0) {
      return var0.field4456.field4568;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("zc")
   public static void method8008(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.stop();
      } else {
         GameEngine.field6190 = true;
         var0.field6207 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method8002(int var1) {
      try {
         this.field4746 = null;
         this.field4743 = null;
         this.field4747 = null;
         this.field4744 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "nt.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public static final void method8007(int var0) {
      try {
         classFO.field2352 = false;
         classFO.field2350 = 0;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nt.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnt;)V")
   @ObfuscatedName("dt")
   public static void method8003(classNT var0) {
      if (var0 == null) {
         var0.method8004();
      }

      var0.field4746 = null;
      var0.field4743 = null;
      var0.field4747 = null;
      var0.field4744 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   void method8004() {
      this.field4746 = null;
      this.field4743 = null;
      this.field4747 = null;
      this.field4744 = null;
   }
}
