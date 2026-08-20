import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tw")
public class BufferedSink implements Runnable {
   @ObfuscatedName("ae")
   int position = 0;
   @ObfuscatedName("at")
   OutputStream outputStream;
   @ObfuscatedName("aj")
   int limit = 0;
   @ObfuscatedName("an")
   byte[] buffer;
   @ObfuscatedName("aw")
   boolean closed;
   @ObfuscatedName("av")
   Thread thread;
   @ObfuscatedName("ak")
   IOException exception;
   @ObfuscatedName("ag")
   int capacity;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final long field5993 = -3932672073523589310L;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)I")
   @ObfuscatedName("yq")
   public static int method10931(NPCComposition var0) {
      return var0.footprintSize * 964807653;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hy")
   static final void method10932(int var0) {
      try {
         Scene.Scene_isLowDetail = false;
         client.isLowDetail = false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tw.hy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   boolean isClosed(int var1) {
      try {
         if (!this.closed) {
            return false;
         } else if (var1 <= -1738978750) {
            throw new IllegalStateException();
         } else {
            try {
               this.outputStream.close();
               if (null == this.exception) {
                  this.exception = new IOException("");
               }
            } catch (IOException var3) {
               if (null == this.exception) {
                  this.exception = new IOException(var3);
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tw.av(" + ')');
      }
   }

   BufferedSink(OutputStream var1, int var2) {
      this.outputStream = var1;
      this.capacity = -69449445 * (var2 + 1);
      this.buffer = new byte[this.capacity * -685250285];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedSignature(descriptor = "(Ltw;I)V")
   @ObfuscatedName("cw")
   public static void method10927(BufferedSink var0, int var1) {
      if (var0 == null) {
         var0.close(var1);
      }

      try {
         synchronized (var0) {
            var0.closed = true;
            var0.notifyAll();
         }

         try {
            var0.thread.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("at")
   void write(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 == 113) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var4 == 113) {
                  throw new IllegalStateException();
               }

               if (var3 + var2 <= var1.length) {
                  synchronized (this) {
                     if (this.exception != null) {
                        if (var4 == 113) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.exception.toString());
                     }

                     int var6;
                     if (this.position * -672455267 <= 1826271221 * this.limit) {
                        var6 = this.capacity * -685250285 - this.limit * 1826271221 + this.position * -672455267 - 1;
                     } else {
                        var6 = this.position * -672455267 - 1826271221 * this.limit - 1;
                     }

                     if (var6 < var3) {
                        if (var4 == 113) {
                           return;
                        }

                        throw new IOException("");
                     }

                     if (var3 + this.limit * 1826271221 <= -685250285 * this.capacity) {
                        System.arraycopy(var1, var2, this.buffer, this.limit * 1826271221, var3);
                     } else {
                        int var7 = this.capacity * -685250285 - 1826271221 * this.limit;
                        System.arraycopy(var1, var2, this.buffer, this.limit * 1826271221, var7);
                        System.arraycopy(var1, var2 + var7, this.buffer, 0, var3 - var7);
                     }

                     this.limit = -1729280931 * ((this.limit * 1826271221 + var3) % (this.capacity * -685250285));
                     this.notifyAll();
                     return;
                  }
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "tw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method10921() {
      do {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (this.position * 1278737732 <= -1630441510 * this.limit) {
                  var1 = this.limit * 1826271221 - -672455267 * this.position;
               } else {
                  var1 = -475030697 * this.capacity - -672455267 * this.position + this.limit * -897104398;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.outputStream.flush();
               } catch (IOException var10) {
                  this.exception = var10;
                  return;
               }

               if (this.isClosed(1050041360)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.position * -609542929 <= this.capacity * -1216855973) {
               this.outputStream.write(this.buffer, this.position * -1377029076, var1);
            } else {
               int var13 = -1719372344 * this.capacity - -672455267 * this.position;
               this.outputStream.write(this.buffer, this.position * -672455267, var13);
               this.outputStream.write(this.buffer, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized (this) {
               this.exception = var2;
               return;
            }
         }

         synchronized (this) {
            this.position = (-672455267 * this.position + var1) % (-1887174359 * this.capacity) * -93007391;
         }
      } while (!this.isClosed(-895453439));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method10922() {
      do {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (this.position * -672455267 <= 1826271221 * this.limit) {
                  var1 = this.limit * 1826271221 - -672455267 * this.position;
               } else {
                  var1 = -685250285 * this.capacity - -672455267 * this.position + this.limit * 1826271221;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.outputStream.flush();
               } catch (IOException var10) {
                  this.exception = var10;
                  return;
               }

               if (this.isClosed(-1546633686)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.position * -672455267 <= this.capacity * -685250285) {
               this.outputStream.write(this.buffer, this.position * -672455267, var1);
            } else {
               int var13 = -685250285 * this.capacity - -672455267 * this.position;
               this.outputStream.write(this.buffer, this.position * -672455267, var13);
               this.outputStream.write(this.buffer, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized (this) {
               this.exception = var2;
               return;
            }
         }

         synchronized (this) {
            this.position = (-672455267 * this.position + var1) % (-685250285 * this.capacity) * 333416629;
         }
      } while (!this.isClosed(-926645200));
   }

   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;III)I")
   @ObfuscatedName("at")
   public static int method10916(DynamicArray var0, Object var1, int var2, int var3, int var4) {
      try {
         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0 || var3 > var0.method11215((byte)68)) {
            var3 = var0.method11215((byte)98);
         }

         if (class586.field6376 == var0.field6107) {
            if (var4 == -673834287) {
               throw new IllegalStateException();
            }

            int[] var5 = var0.method11207(2053374425);
            int var6 = (Integer)var1;

            for (int var7 = var2; var7 < var3; var7++) {
               if (var4 == -673834287) {
                  throw new IllegalStateException();
               }

               if (var5[var7] == var6) {
                  if (var4 == -673834287) {
                     throw new IllegalStateException();
                  }

                  return var7;
               }
            }
         } else if (var0.field6107 == class586.field6377) {
            if (var4 == -673834287) {
               throw new IllegalStateException();
            }

            long[] var10 = DynamicArray.method11211(var0, (byte)10);
            long var12 = (Long)var1;

            for (int var8 = var2; var8 < var3; var8++) {
               if (var4 == -673834287) {
                  throw new IllegalStateException();
               }

               if (var12 == var10[var8]) {
                  return var8;
               }
            }
         } else {
            Object[] var11 = var0.method11214((byte)-79);

            for (int var13 = var2; var13 < var3; var13++) {
               if (var4 == -673834287) {
                  throw new IllegalStateException();
               }

               if (var11[var13] == var1) {
                  return var13;
               }

               if (var4 == -673834287) {
                  throw new IllegalStateException();
               }

               if (null != var11[var13]) {
                  if (var4 == -673834287) {
                     throw new IllegalStateException();
                  }

                  if (var11[var13].equals(var1)) {
                     if (var4 == -673834287) {
                        throw new IllegalStateException();
                     }

                     return var13;
                  }
               }
            }
         }

         return -1;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "tw.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;[BII)V")
   @ObfuscatedName("bx")
   public static void method10925(BufferedSink var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.isClosed(var2);
      }

      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (var0) {
            if (var0.exception != null) {
               throw new IOException(var0.exception.toString());
            } else {
               int var5;
               if (var0.position * -672455267 <= 1826271221 * var0.limit) {
                  var5 = var0.capacity * -685250285 - var0.limit * 1826271221 + var0.position * -672455267 - 1;
               } else {
                  var5 = var0.position * -672455267 - 1826271221 * var0.limit - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + var0.limit * 1826271221 <= -685250285 * var0.capacity) {
                     System.arraycopy(var1, var2, var0.buffer, var0.limit * 1826271221, var3);
                  } else {
                     int var6 = var0.capacity * -685250285 - 1826271221 * var0.limit;
                     System.arraycopy(var1, var2, var0.buffer, var0.limit * 1826271221, var6);
                     System.arraycopy(var1, var2 + var6, var0.buffer, 0, var3 - var6);
                  }

                  var0.limit = -1729280931 * ((var0.limit * 1826271221 + var3) % (var0.capacity * -685250285));
                  var0.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   boolean method10918() {
      if (this.closed) {
         try {
            this.outputStream.close();
            if (null == this.exception) {
               this.exception = new IOException("");
            }
         } catch (IOException var2) {
            if (null == this.exception) {
               this.exception = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   boolean method10919() {
      if (this.closed) {
         try {
            this.outputStream.close();
            if (null == this.exception) {
               this.exception = new IOException("");
            }
         } catch (IOException var2) {
            if (null == this.exception) {
               this.exception = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method10923() {
      do {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (this.position * -672455267 <= 1826271221 * this.limit) {
                  var1 = this.limit * 1826271221 - -672455267 * this.position;
               } else {
                  var1 = -685250285 * this.capacity - -672455267 * this.position + this.limit * 1826271221;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.outputStream.flush();
               } catch (IOException var10) {
                  this.exception = var10;
                  return;
               }

               if (this.isClosed(-1417396737)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.position * -672455267 <= this.capacity * -685250285) {
               this.outputStream.write(this.buffer, this.position * -672455267, var1);
            } else {
               int var13 = -685250285 * this.capacity - -672455267 * this.position;
               this.outputStream.write(this.buffer, this.position * -672455267, var13);
               this.outputStream.write(this.buffer, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized (this) {
               this.exception = var2;
               return;
            }
         }

         synchronized (this) {
            this.position = (-672455267 * this.position + var1) % (-685250285 * this.capacity) * 333416629;
         }
      } while (!this.isClosed(-723621160));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method10928() {
      synchronized (this) {
         this.closed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;[BII)V")
   @ObfuscatedName("nr")
   public static void method10926(BufferedSink var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method10921();
      } else if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (var0) {
            if (var0.exception != null) {
               throw new IOException(var0.exception.toString());
            } else {
               int var5;
               if (var0.position * -672455267 <= 1826271221 * var0.limit) {
                  var5 = var0.capacity * -685250285 - var0.limit * 1826271221 + var0.position * -672455267 - 1;
               } else {
                  var5 = var0.position * -672455267 - 1826271221 * var0.limit - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + var0.limit * 1826271221 <= -685250285 * var0.capacity) {
                     System.arraycopy(var1, var2, var0.buffer, var0.limit * 1826271221, var3);
                  } else {
                     int var6 = var0.capacity * -685250285 - 1826271221 * var0.limit;
                     System.arraycopy(var1, var2, var0.buffer, var0.limit * 1826271221, var6);
                     System.arraycopy(var1, var2 + var6, var0.buffer, 0, var3 - var6);
                  }

                  var0.limit = -1729280931 * ((var0.limit * 1826271221 + var3) % (var0.capacity * -685250285));
                  var0.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method10929() {
      synchronized (this) {
         this.closed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @Override
   public void run() {
      try {
         do {
            int var1;
            synchronized (this) {
               while (true) {
                  if (this.exception != null) {
                     return;
                  }

                  if (this.position * -672455267 <= 1826271221 * this.limit) {
                     var1 = this.limit * 1826271221 - -672455267 * this.position;
                  } else {
                     var1 = -685250285 * this.capacity - -672455267 * this.position + this.limit * 1826271221;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.outputStream.flush();
                  } catch (IOException var10) {
                     this.exception = var10;
                     return;
                  }

                  if (this.isClosed(475462064)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (var1 + this.position * -672455267 <= this.capacity * -685250285) {
                  this.outputStream.write(this.buffer, this.position * -672455267, var1);
               } else {
                  int var14 = -685250285 * this.capacity - -672455267 * this.position;
                  this.outputStream.write(this.buffer, this.position * -672455267, var14);
                  this.outputStream.write(this.buffer, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized (this) {
                  this.exception = var2;
                  return;
               }
            }

            synchronized (this) {
               this.position = (-672455267 * this.position + var1) % (-685250285 * this.capacity) * 333416629;
            }
         } while (!this.isClosed(-497541902));
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "tw.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   boolean method10920() {
      if (this.closed) {
         try {
            this.outputStream.close();
            if (null == this.exception) {
               this.exception = new IOException("");
            }
         } catch (IOException var2) {
            if (null == this.exception) {
               this.exception = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void close(int var1) {
      try {
         synchronized (this) {
            this.closed = true;
            this.notifyAll();
         }

         try {
            this.thread.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tw.ag(" + ')');
      }
   }
}
