import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tb")
class classTB implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6117 = -1412584499;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field6116 = 10;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltb;)Ljava/lang/Object;")
   @ObfuscatedName("uq")
   public static Object method10734(classTB var0) {
      for (int var1 = var0.val$workStart; var1 < var0.val$workEnd; var1++) {
         var0.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public static void method10733(int var0) {
      try {
         synchronized (classUJ.field6315) {
            if (classUJ.field6314 * 508619279 != 0) {
               if (var0 != -1927903443) {
                  throw new IllegalStateException();
               }

               classUJ.field6314 = 379503855;

               try {
                  classUJ.field6315.wait();
               } catch (InterruptedException var6) {
               }
            }
         }

         synchronized (classUJ.field6313) {
            classUJ.field6313.method7895();
            classUJ.field6316.method7895();
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "tb.ab(" + ')');
      }
   }

   @Override
   public Object call() {
      try {
         for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
            this.val$curveLoadJobs[var1].call();
         }

         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tb.call(" + ')');
      }
   }

   classTB(classSN var1, int var2, int var3, classSV[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method10735() {
      for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gp")
   static final void method10737(byte var0) {
      try {
         classJL var1 = classEF.method3849(classJS.CLOSE_MODAL, client.field795.field1535, (byte)-86);
         client.field795.method3367(var1, -1301097035);
         classBB.field335 = true;

         for (classPK var2 = (classPK)classWK.field6691.field6613.method13375(); null != var2; var2 = (classPK)classYK.method13401(classWK.field6691.field6613)) {
            if (var0 == 1) {
               return;
            }

            if (0 != var2.field5277 * -691218541) {
               if (var0 == 1) {
                  return;
               }

               if (-691218541 * var2.field5277 != 3) {
                  continue;
               }
            }

            classPQ.method9106(classGB.field2546, var2, true, classWK.field6691, (byte)-98);
         }

         classWK.field6691.method12167((byte)8);
         classBB.field335 = false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "tb.gp(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;)Z")
   @ObfuscatedName("lw")
   public static boolean method10738(client var0) {
      if (var0 == null) {
         var0.method2113();
      }

      return null != var0.field1102;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("et")
   static final boolean method10736(int var0) {
      try {
         return client.field973;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tb.et(" + ')');
      }
   }
}
