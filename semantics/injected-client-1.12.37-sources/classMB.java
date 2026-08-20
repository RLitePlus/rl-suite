import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mb")
public class classMB implements Runnable {
   @ObfuscatedName("iv")
   static int field4478;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4474 = 4;
   @ObfuscatedName("aa")
   boolean field4472;
   @ObfuscatedSignature(descriptor = "Lmj;")
   @ObfuscatedName("as")
   Task field4470 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4476 = 1;
   @ObfuscatedName("ac")
   Thread field4473;
   @ObfuscatedSignature(descriptor = "Lmj;")
   @ObfuscatedName("ax")
   Task field4471 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field4475 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   static final int field4477 = 148;
   @ObfuscatedName("ag")
   public static String field4479;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public final void method7503() {
      synchronized (this) {
         this.field4472 = true;
         this.notifyAll();
      }

      try {
         this.field4473.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ab")
   public final void method7504(short var1) {
      try {
         synchronized (this) {
            this.field4472 = true;
            this.notifyAll();
         }

         try {
            this.field4473.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "mb.ab(" + ')');
      }
   }

   @Override
   public final void run() {
      try {
         while (true) {
            Task var1;
            synchronized (this) {
               while (true) {
                  if (this.field4472) {
                     return;
                  }

                  if (this.field4470 != null) {
                     var1 = this.field4470;
                     this.field4470 = this.field4470.field4519;
                     if (null == this.field4470) {
                        this.field4471 = null;
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
               int var2 = var1.field4515 * 1949692181;
               if (var2 == 1) {
                  var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.field4513);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.objectArgument);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.field4513);
                  var1.result = var3;
               } else if (4 == var2) {
                  var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
               }

               var1.field4512 = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.field4512 = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "mb.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lmj;")
   @ObfuscatedName("as")
   public final Task method7514(String var1, int var2, int var3) {
      try {
         return method7510(this, 1, var2, 0, var1, 143965232);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "mb.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmb;IIILjava/lang/Object;I)Lmj;")
   @ObfuscatedName("oq")
   public static Task method7510(classMB var0, int var1, int var2, int var3, Object var4, int var5) {
      if (var0 == null) {
         var0.method7513(var1, var1, var1, var4, var1);
      }

      try {
         Task var6 = new Task();
         var6.field4515 = var1 * 1420219965;
         var6.field4513 = var2;
         var6.objectArgument = var4;
         synchronized (var0) {
            if (null != var0.field4471) {
               if (var5 >= 1375698635) {
                  throw new IllegalStateException();
               }

               var0.field4471.field4519 = var6;
               var0.field4471 = var6;
            } else {
               var0.field4471 = var0.field4470 = var6;
            }

            var0.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "mb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;II)Lmj;")
   @ObfuscatedName("ax")
   public final Task method7517(Runnable var1, int var2, int var3) {
      try {
         return method7510(this, 2, var2, 0, var1, -1883812875);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "mb.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("as")
   public static int method7520(classTE var0, int var1) {
      try {
         classCQ.method2572(var0, -668471179);
         byte var2 = 0;
         int var3 = var0.method10756(-2063914818);
         int var4 = -1;
         if (classYY.field7111 == var0.field6128) {
            if (var1 == -1456496566) {
               throw new IllegalStateException();
            }

            int[] var5 = var0.method10748(1293299844);

            for (int var6 = var2; var6 < var3; var6++) {
               if (var1 == -1456496566) {
                  throw new IllegalStateException();
               }

               if (var4 != -1) {
                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }

                  if (var5[var6] <= var5[var4]) {
                     continue;
                  }

                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var6;
            }
         } else if (classYY.field7115 == var0.field6128) {
            if (var1 == -1456496566) {
               throw new IllegalStateException();
            }

            long[] var10 = var0.method10750(-262575641);

            for (int var12 = var2; var12 < var3; var12++) {
               if (var1 == -1456496566) {
                  throw new IllegalStateException();
               }

               if (-1 != var4) {
                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }

                  if (var10[var12] <= var10[var4]) {
                     continue;
                  }

                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var12;
            }
         } else if (classYY.field7113 == var0.field6128) {
            String var11 = null;
            Object[] var13 = classTE.method10753(var0, 648693478);

            for (int var7 = var2; var7 < var3; var7++) {
               if (var1 == -1456496566) {
                  throw new IllegalStateException();
               }

               String var8 = (String)var13[var7];
               if (var4 != -1) {
                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }

                  if (var8 == null) {
                     continue;
                  }

                  if (var1 == -1456496566) {
                     throw new IllegalStateException();
                  }

                  if (var8.compareTo(var11) <= 0) {
                     continue;
                  }
               }

               var4 = var7;
               var11 = var8;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "mb.as(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmb;IIILjava/lang/Object;)Lmj;")
   @ObfuscatedName("aa")
   public static Task method7511(classMB var0, int var1, int var2, int var3, Object var4) {
      if (var0 == null) {
         var0.method7507();
      }

      Task var5 = new Task();
      var5.field4515 = var1 * 1420219965;
      var5.field4513 = var2;
      var5.objectArgument = var4;
      synchronized (var0) {
         if (null != var0.field4471) {
            var0.field4471.field4519 = var5;
            var0.field4471 = var5;
         } else {
            var0.field4471 = var0.field4470 = var5;
         }

         var0.notify();
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmb;)V")
   @ObfuscatedName("kd")
   public static void method7506(classMB var0) {
      if (var0 == null) {
         var0.run();
      }

      while (true) {
         Task var1;
         synchronized (var0) {
            while (true) {
               if (var0.field4472) {
                  return;
               }

               if (var0.field4470 != null) {
                  var1 = var0.field4470;
                  var0.field4470 = var0.field4470.field4519;
                  if (null == var0.field4470) {
                     var0.field4471 = null;
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
            int var2 = var1.field4515 * 794181862;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.field4513);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field4513);
               var1.result = var3;
            } else if (4 == var2) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.field4512 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field4512 = 2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("af")
   public static int method7502(int var0, byte var1) {
      try {
         return var0 + -512;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mb.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public final void method7507() {
      while (true) {
         Task var1;
         synchronized (this) {
            while (true) {
               if (this.field4472) {
                  return;
               }

               if (this.field4470 != null) {
                  var1 = this.field4470;
                  this.field4470 = this.field4470.field4519;
                  if (null == this.field4470) {
                     this.field4471 = null;
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
            int var2 = var1.field4515 * 1949692181;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.field4513);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field4513);
               var1.result = var3;
            } else if (4 == var2) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.field4512 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field4512 = 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmb;)V")
   @ObfuscatedName("zt")
   public static void method7508(classMB var0) {
      if (var0 == null) {
         var0.run();
      } else {
         while (true) {
            Task var1;
            synchronized (var0) {
               while (true) {
                  if (var0.field4472) {
                     return;
                  }

                  if (var0.field4470 != null) {
                     var1 = var0.field4470;
                     var0.field4470 = var0.field4470.field4519;
                     if (null == var0.field4470) {
                        var0.field4471 = null;
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
               int var2 = var1.field4515 * 1949692181;
               if (var2 == 1) {
                  var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.field4513);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.objectArgument);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.field4513);
                  var1.result = var3;
               } else if (4 == var2) {
                  var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
               }

               var1.field4512 = 1;
            } catch (ThreadDeath var6) {
               throw var6;
            } catch (Throwable var7) {
               var1.field4512 = 2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public final void method7505() {
      synchronized (this) {
         this.field4472 = true;
         this.notifyAll();
      }

      try {
         this.field4473.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;)Lmj;")
   @ObfuscatedName("ao")
   final Task method7512(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.field4515 = var1 * -1399864910;
      var5.field4513 = var2;
      var5.objectArgument = var4;
      synchronized (this) {
         if (null != this.field4471) {
            this.field4471.field4519 = var5;
            this.field4471 = var5;
         } else {
            this.field4471 = this.field4470 = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lmj;")
   @ObfuscatedName("aj")
   public final Task method7515(String var1, int var2) {
      return method7510(this, 1, var2, 0, var1, -391069800);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lmj;")
   @ObfuscatedName("ay")
   public final Task method7516(String var1, int var2) {
      return method7510(this, 1, var2, 0, var1, -585293095);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;I)Lmj;")
   @ObfuscatedName("aq")
   public final Task method7518(Runnable var1, int var2) {
      return method7510(this, 2, var2, 0, var1, 1264907340);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;I)Lmj;")
   @ObfuscatedName("ap")
   public final Task method7519(Runnable var1, int var2) {
      return method7510(this, 2, var2, 0, var1, 1177595316);
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;II)Lsn;")
   @ObfuscatedName("az")
   public static classSN method7509(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
      try {
         byte[] var5 = var0.method11873(var2 >> 16 & 65535, var2 & 65535, 2044601435);
         boolean var4;
         if (null == var5) {
            if (var3 != -1929466463) {
               throw new IllegalStateException();
            }

            var4 = false;
         } else {
            int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
            byte[] var7 = var1.method11873(var6, 0, 350903642);
            var4 = null != var7;
         }

         if (!var4) {
            if (var3 != -1929466463) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (classXN.field6891 == null) {
               if (var3 != -1929466463) {
                  throw new IllegalStateException();
               }

               classSN.field5993 = Runtime.getRuntime().availableProcessors() * 1058142237;
               classXN.field6891 = new ThreadPoolExecutor(
                  0, -517436875 * classSN.field5993, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100 + -204079948 * classSN.field5993), new classSF()
               );
            }

            try {
               return new classSN(var0, var1, var2);
            } catch (Exception var8) {
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "mb.az(" + ')');
      }
   }

   public classMB() {
      this.field4472 = false;
      classDQ.field1604 = "Unknown";
      field4479 = "1.6";

      try {
         classDQ.field1604 = System.getProperty("java.vendor");
         field4479 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field4472 = false;
      this.field4473 = new Thread(this);
      this.field4473.setPriority(10);
      this.field4473.setDaemon(true);
      this.field4473.start();
   }

   @ObfuscatedSignature(descriptor = "(I)Lct;")
   @ObfuscatedName("ev")
   static Player method7521(int var0) {
      try {
         WorldView var1 = client.field814.method1590(client.field846 * -2034209657, (short)13357);
         Player var10000;
         if (var1 != null) {
            if (var0 == 120041229) {
               throw new IllegalStateException();
            }

            var10000 = var1.method3737(client.field845 * -2130951373, (byte)1);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "mb.ev(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;I)Lmj;")
   @ObfuscatedName("ag")
   final Task method7513(int var1, int var2, int var3, Object var4, int var5) {
      try {
         Task var6 = new Task();
         var6.field4515 = var1 * 1420219965;
         var6.field4513 = var2;
         var6.objectArgument = var4;
         synchronized (this) {
            if (null != this.field4471) {
               if (var5 >= 1375698635) {
                  throw new IllegalStateException();
               }

               this.field4471.field4519 = var6;
               this.field4470 = var6;
            } else {
               this.field4471 = this.field4470 = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "mb.ag(" + ')');
      }
   }
}
