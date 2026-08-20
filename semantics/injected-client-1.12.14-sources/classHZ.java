import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hz")
class classHZ implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field2430 = 2048;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("yt")
   public static void method4849(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method10006();
      }

      synchronized (TransformationMatrix.field5731) {
         if (-1539552615 * TransformationMatrix.field5729 < 604480705 * TransformationMatrix.field5730) {
            TransformationMatrix.field5731[(TransformationMatrix.field5729 += -794138199) * -1539552615 - 1] = var0;
         }
      }
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hz.newThread(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method4850(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method4851(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   classHZ(SequenceDefinition var1) {
      this.this$0 = var1;
   }
}
