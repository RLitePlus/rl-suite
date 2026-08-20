import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qe")
public class classQE implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final String field5524 = "cond";
   @ObfuscatedName("af")
   final AtomicInteger field5521;
   @ObfuscatedName("az")
   final ThreadGroup field5522;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field5523 = 22;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ho")
   static classVP field5525;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqe;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("nm")
   public static Thread method9496(classQE var0, Runnable var1) {
      Thread var2 = new Thread(var0.field5522, var1, var0.this$0.field5519 + "-rest-request-" + var0.field5521.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqe;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("xp")
   public static Thread method9497(classQE var0, Runnable var1) {
      Thread var2 = new Thread(var0.field5522, var1, var0.this$0.field5519 + "-rest-request-" + var0.field5521.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         Thread var2 = new Thread(this.field5522, var1, this.this$0.field5519 + "-rest-request-" + this.field5521.getAndIncrement(), 0L);
         var2.setDaemon(true);
         var2.setPriority(5);
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qe.newThread(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Z")
   @ObfuscatedName("ab")
   public static boolean method9498(CharSequence var0, byte var1) {
      try {
         boolean var3 = false;
         boolean var4 = false;
         long var5 = 0L;
         int var7 = var0.length();
         int var8 = 0;

         boolean var2;
         while (true) {
            if (var8 >= var7) {
               var2 = var4;
               break;
            }

            label118: {
               int var9 = var0.charAt(var8);
               if (0 == var8) {
                  if (var1 <= 43) {
                     throw new IllegalStateException();
                  }

                  if (var9 == 45) {
                     var3 = true;
                     break label118;
                  }

                  if (var9 == 43) {
                     if (var1 <= 43) {
                        throw new IllegalStateException();
                     }
                     break label118;
                  }
               }

               if (var9 >= 48 && var9 <= 57) {
                  if (var1 <= 43) {
                     throw new IllegalStateException();
                  }

                  var9 -= 48;
               } else {
                  label117: {
                     if (var9 >= 65) {
                        if (var1 <= 43) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= 90) {
                           if (var1 <= 43) {
                              throw new IllegalStateException();
                           }

                           var9 -= 55;
                           break label117;
                        }
                     }

                     if (var9 < 97 || var9 > 122) {
                        var2 = false;
                        break;
                     }

                     if (var1 <= 43) {
                        throw new IllegalStateException();
                     }

                     var9 -= 87;
                  }
               }

               if (var9 >= 10) {
                  if (var1 <= 43) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
                  break;
               }

               if (var3) {
                  var9 = -var9;
               }

               long var10 = 10L * var5 + var9;
               if (var5 != var10 / 10L) {
                  if (var1 <= 43) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
                  break;
               }

               var5 = var10;
               var4 = true;
            }

            var8++;
         }

         return var2;
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "qe.ab(" + ')');
      }
   }

   classQE(classQD var1) {
      this.this$0 = var1;
      this.field5521 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field5522 = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   @ObfuscatedSignature(descriptor = "(Lul;B)Lul;")
   @ObfuscatedName("ab")
   static final classUL method9495(classUL var0, byte var1) {
      try {
         classUL var2 = classSQ.method10636(var0, -506347951);
         var2.method11381((byte)100);
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qe.ab(" + ')');
      }
   }
}
