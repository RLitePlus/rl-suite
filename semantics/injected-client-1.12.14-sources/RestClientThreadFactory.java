import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ab")
public class RestClientThreadFactory implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field6 = 79;
   @ObfuscatedName("av")
   final ThreadGroup field5;
   @ObfuscatedName("at")
   final AtomicInteger field4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field8 = 124;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   public static final int field7 = 67;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   static void method1(int var0) {
      try {
         class57.soundEffectCount = 0;
         client.method2448(-1);
      } catch (RuntimeException var1) {
         throw newRunException(var1, "ab.ae(" + ')');
      }
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         Thread var2 = new Thread(this.field5, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field4.getAndIncrement(), 0L);
         var2.setDaemon(true);
         var2.setPriority(5);
         return var2;
      } catch (RuntimeException var3) {
         throw newRunException(var3, "ab.newThread(" + ')');
      }
   }

   RestClientThreadFactory(AsyncRestClient var1) {
      this.this$0 = var1;
      this.field4 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field5 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method2(Runnable var1) {
      Thread var2 = new Thread(this.field5, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field4.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bp")
   static int method5(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 3500) {
            int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int[] var8 = Interpreter.Interpreter_intStack;
            int var9 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var10;
            if (IndexCheck.method6514(client.indexCheck, var7, (short)1337)) {
               if (var3 != -616650646) {
                  throw new IllegalStateException();
               }

               var10 = 1;
            } else {
               var10 = 0;
            }

            var8[var9] = var10;
            return 1;
         } else if (3501 == var0) {
            if (var3 != -616650646) {
               throw new IllegalStateException();
            } else {
               int var6 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.indexCheck
                     .method6513(var6, 504064209)
                  ? 1
                  : 0;
               return 1;
            }
         } else if (3502 == var0) {
            if (var3 != -616650646) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (client.indexCheck.method6517(var4, -1677082177)) {
                  if (var3 != -616650646) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw newRunException(var5, "ab.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method3(Runnable var1) {
      Thread var2 = new Thread(this.field5, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field4.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lyg;")
   @ObfuscatedName("at")
   public static RunException newRunException(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
      } else {
         var2 = new RunException(var0, "");
      }

      if (!var1.endsWith("()")) {
         if (var2.message.length() != 0) {
            var2.message = var2.message + " ";
         }

         var2.message = var2.message + var1;
      }

      return var2;
   }
}
