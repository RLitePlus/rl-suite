import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ic")
public class TaskHandler implements Runnable {
   @ObfuscatedName("ap")
   boolean isClosed;
   @ObfuscatedName("dw")
   static int field2444;
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("aj")
   Task current = null;
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("ak")
   Task task = null;
   @ObfuscatedName("aw")
   Thread thread;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2442 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("dz")
   static final String field2446 = "JX_DISPLAY_NAME";
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field2443 = 97;
   @ObfuscatedName("ae")
   public static String javaVersion;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public final void method4865() {
      while (true) {
         Task var1;
         synchronized (this) {
            while (true) {
               if (this.isClosed) {
                  return;
               }

               if (null != this.current) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.type * -489720931;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var2 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;I)Ljp;")
   @ObfuscatedName("at")
   final Task newTask(int var1, int var2, int var3, Object var4, int var5) {
      try {
         Task var6 = new Task();
         var6.type = var1 * 1706142389;
         var6.intArgument = var2;
         var6.objectArgument = var4;
         synchronized (this) {
            if (this.task != null) {
               if (var5 >= -1537923063) {
                  throw new IllegalStateException();
               }

               this.task.next = var6;
               this.task = var6;
            } else {
               this.task = this.current = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ic.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljp;")
   @ObfuscatedName("au")
   public final Task method4872(String var1, int var2) {
      return this.newTask(1, var2, 0, var1, -2029130733);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;)V")
   @ObfuscatedName("aw")
   public static void method4866(TaskHandler var0) {
      if (var0 == null) {
         var0.method4862();
      }

      while (true) {
         Task var1;
         synchronized (var0) {
            while (true) {
               if (var0.isClosed) {
                  return;
               }

               if (null != var0.current) {
                  var1 = var0.current;
                  var0.current = var0.current.next;
                  if (var0.current == null) {
                     var0.task = null;
                  }
                  break;
               }

               try {
                  var0.wait();
               } catch (InterruptedException var5) {
               }
            }
         }

         try {
            int var2 = var1.type * -489720931;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var2 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Ljp;")
   @ObfuscatedName("ag")
   public final Task newSocketTask(String var1, int var2, int var3) {
      try {
         return this.newTask(1, var2, 0, var1, -1939967421);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ic.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public final void close(int var1) {
      try {
         synchronized (this) {
            this.isClosed = true;
            this.notifyAll();
         }

         try {
            this.thread.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ic.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;)Ljp;")
   @ObfuscatedName("ap")
   final Task method4869(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.type = var1 * 1334075688;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized (this) {
         if (this.task != null) {
            this.task.next = var5;
            this.task = var5;
         } else {
            this.task = this.current = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;)V")
   @ObfuscatedName("tg")
   public static void method4861(TaskHandler var0) {
      if (var0 == null) {
         var0.run();
      }

      synchronized (var0) {
         var0.isClosed = true;
         var0.notifyAll();
      }

      try {
         var0.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public final void method4867() {
      while (true) {
         Task var1;
         synchronized (this) {
            while (true) {
               if (this.isClosed) {
                  return;
               }

               if (null != this.current) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.type * -489720931;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var2 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public final void method4862() {
      synchronized (this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public final void method4863() {
      synchronized (this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;IIILjava/lang/Object;)Ljp;")
   @ObfuscatedName("ni")
   public static Task method4870(TaskHandler var0, int var1, int var2, int var3, Object var4) {
      if (var0 == null) {
         var0.method4871(var1, var1, var1, var4);
      }

      Task var5 = new Task();
      var5.type = var1 * 1706142389;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized (var0) {
         if (var0.task != null) {
            var0.task.next = var5;
            var0.task = var5;
         } else {
            var0.task = var0.current = var5;
         }

         var0.notify();
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lic;Ljava/lang/Runnable;II)Ljp;")
   @ObfuscatedName("ki")
   public static Task method4876(TaskHandler var0, Runnable var1, int var2, int var3) {
      if (var0 == null) {
         var0.newThreadTask(var1, var2, var2);
      }

      try {
         return var0.newTask(2, var2, 0, var1, -1787793451);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ic.an(" + ')');
      }
   }

   public TaskHandler() {
      this.isClosed = false;
      class373.javaVendor = "Unknown";
      javaVersion = "1.6";

      try {
         class373.javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.isClosed = false;
      this.thread = new Thread(this);
      this.thread.setPriority(10);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @Override
   public final void run() {
      try {
         while (true) {
            Task var1;
            synchronized (this) {
               while (true) {
                  if (this.isClosed) {
                     return;
                  }

                  if (null != this.current) {
                     var1 = this.current;
                     this.current = this.current.next;
                     if (this.current == null) {
                        this.task = null;
                     }
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                  }
               }
            }

            try {
               int var2 = var1.type * -489720931;
               if (var2 == 1) {
                  var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.objectArgument);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.intArgument);
                  var1.result = var3;
               } else if (var2 == 4) {
                  var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
               }

               var1.status = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.status = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ic.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljp;")
   @ObfuscatedName("az")
   public final Task method4874(String var1, int var2) {
      return this.newTask(1, var2, 0, var1, -1757930315);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljp;")
   @ObfuscatedName("ai")
   public final Task method4875(String var1, int var2) {
      return this.newTask(1, var2, 0, var1, -1707916976);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;I)Ljp;")
   @ObfuscatedName("ac")
   public final Task method4877(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1, -2080402626);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;II)Ljp;")
   @ObfuscatedName("an")
   public final Task newThreadTask(Runnable var1, int var2, int var3) {
      try {
         return this.newTask(2, var2, 0, var1, -1787793451);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ic.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;)V")
   @ObfuscatedName("zn")
   public static void method4864(TaskHandler var0) {
      if (var0 == null) {
         var0.method4865();
      } else {
         synchronized (var0) {
            var0.isClosed = true;
            var0.notifyAll();
         }

         try {
            var0.thread.join();
         } catch (InterruptedException var3) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;)Ljp;")
   @ObfuscatedName("ay")
   final Task method4871(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.type = var1 * 1706142389;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized (this) {
         if (this.current != null) {
            this.task.next = var5;
            this.task = var5;
         } else {
            this.task = this.task = var5;
         }

         this.notify();
         return var5;
      }
   }
}
