import java.awt.event.FocusEvent;
import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hq")
class class190 implements ThreadFactory {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   static AbstractArchive ParamDefinition_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field2289 = 39;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final String field2290 = "";

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)V")
   @ObfuscatedName("nx")
   public static void method4638(AnimationSequence var0) {
      if (var0 == null) {
         var0.method10316();
      }

      var0.frameCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aw")
   public static int method4639(int var0, int var1, int var2) {
      try {
         return var0 + (int)(Math.random() * (var1 - var0));
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hq.aw(" + 41);
      }
   }

   class190(SequenceDefinition var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("rr")
   public static void method4642(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.method791(var1);
      }

      GameEngine.volatileFocus = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method4640(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hq.newThread(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method4641(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }
}
