import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qd")
public class classQD {
   @ObfuscatedName("az")
   final String field5519;
   @ObfuscatedName("af")
   final ThreadFactory field5516;
   @ObfuscatedName("ae")
   final ThreadPoolExecutor field5517;
   @ObfuscatedName("ab")
   final int field5518;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5520 = 7;

   @ObfuscatedSignature(descriptor = "(Lqa;)Lqm;")
   @ObfuscatedName("ac")
   public classQM method9484(classQA var1) {
      if (this.field5517.getQueue().remainingCapacity() <= 0) {
         System.err
            .println(
               "REST thread pool queue is empty\r\nThread pool size " + this.field5517.getCorePoolSize() + " Queue capacity " + 1603104713 * this.field5518
            );
         return new classQM("Queue full");
      } else {
         return new classQM(this.field5517.submit(new classQK(this, var1)));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqd;Lqa;)Lqm;")
   @ObfuscatedName("xf")
   public static classQM method9485(classQD var0, classQA var1) {
      if (var0.field5517.getQueue().remainingCapacity() <= 0) {
         System.err
            .println(
               "REST thread pool queue is empty\r\nThread pool size " + var0.field5517.getCorePoolSize() + " Queue capacity " + 1603104713 * var0.field5518
            );
         return new classQM("Queue full");
      } else {
         return new classQM(var0.field5517.submit(new classQK(var0, var1)));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("as")
   final ThreadPoolExecutor method9481(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.field5518 * 1603104713), this.field5516);
   }

   public classQD(String var1, int var2, int var3) {
      this.field5519 = var1;
      this.field5518 = var2 * 1506663033;
      this.field5516 = new classQE(this);
      this.field5517 = this.method9494(var3, (byte)-51);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public final void method9488(byte var1) {
      try {
         try {
            this.field5517.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qd.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("ab")
   final ThreadPoolExecutor method9482(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.field5518 * -300290001), this.field5516);
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("az")
   final ThreadPoolExecutor method9494(int var1, byte var2) {
      return new ThreadPoolExecutor(0, var1, 2L, TimeUnit.MINUTES, new ArrayBlockingQueue<>(this.field5518 * 1603104713), this.field5516);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("ag")
   final ThreadPoolExecutor method9483(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.field5518 * 1603104713), this.field5516);
   }

   @ObfuscatedSignature(descriptor = "(Lqa;)Lqm;")
   @ObfuscatedName("aa")
   public classQM method9486(classQA var1) {
      if (this.field5517.getQueue().remainingCapacity() <= 0) {
         System.err
            .println(
               "REST thread pool queue is empty\r\nThread pool size " + this.field5517.getCorePoolSize() + " Queue capacity " + 1603104713 * this.field5518
            );
         return new classQM("Queue full");
      } else {
         return new classQM(this.field5517.submit(new classQK(this, var1)));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public final void method9489() {
      try {
         this.field5517.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqa;I)Lqm;")
   @ObfuscatedName("af")
   public classQM method9487(classQA var1, int var2) {
      try {
         if (this.field5517.getQueue().remainingCapacity() <= 0) {
            if (var2 == 675603180) {
               throw new IllegalStateException();
            } else {
               System.err
                  .println(
                     "REST thread pool queue is empty\r\nThread pool size "
                        + this.field5517.getCorePoolSize()
                        + " Queue capacity "
                        + 1603104713 * this.field5518
                  );
               return new classQM("Queue full");
            }
         } else {
            return new classQM(this.field5517.submit(new classQK(this, var1)));
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qd.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public final void method9490() {
      try {
         this.field5517.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public final void method9491() {
      try {
         this.field5517.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqd;)V")
   @ObfuscatedName("xf")
   public static void method9492(classQD var0) {
      try {
         var0.field5517.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lse;")
   @ObfuscatedName("ag")
   static classSE[] method9493(int var0) {
      try {
         return new classSE[]{classSE.field5911, classSE.field5913, classSE.field5915, classSE.field5914, classSE.field5912};
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qd.ag(" + ')');
      }
   }
}
