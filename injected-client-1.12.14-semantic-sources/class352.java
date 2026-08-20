import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nz")
class class352 implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4378 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4379 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field4377 = 256;
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("im")
   static Language clientLanguage;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Lsf;")
   @ObfuscatedName("pe")
   public static classSF method7874(classOO var0) {
      return var0.field4654;
   }

   @Override
   public Object call() {
      try {
         PriorityQueue var1 = this.this$0.priorityQueue;

         while (true) {
            Object var2 = null;
            synchronized (var1) {
               if (var1.isEmpty() || this.val$cancelled.get()) {
                  return null;
               }

               var2 = (classNR)var1.remove();
            }

            ((classNR)var2).field4328.method3819(-2146256813);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nz.call(" + ')');
      }
   }

   class352(MidiPcmStream var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnz;)Ljava/lang/Object;")
   @ObfuscatedName("hq")
   public static Object method7872(class352 var0) {
      PriorityQueue var1 = var0.this$0.priorityQueue;

      while (true) {
         Object var2 = null;
         synchronized (var1) {
            if (var1.isEmpty() || var0.val$cancelled.get()) {
               return null;
            }

            var2 = (classNR)var1.remove();
         }

         ((classNR)var2).field4328.method3819(-1410954714);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method7873() {
      PriorityQueue var1 = this.this$0.priorityQueue;

      while (true) {
         Object var2 = null;
         synchronized (var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (classNR)var1.remove();
         }

         ((classNR)var2).field4328.method3819(-1491933005);
      }
   }
}
