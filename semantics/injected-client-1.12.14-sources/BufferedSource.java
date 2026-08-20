import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tg")
public class BufferedSource implements Runnable {
   @ObfuscatedName("av")
   Thread thread;
   @ObfuscatedName("at")
   InputStream inputStream;
   @ObfuscatedName("aw")
   public static int[] SpriteBuffer_spritePalette;
   @ObfuscatedName("ag")
   int capacity;
   @ObfuscatedName("an")
   byte[] buffer;
   @ObfuscatedName("aj")
   int limit;
   @ObfuscatedName("ak")
   IOException exception;
   @ObfuscatedName("ae")
   int position = 0;

   @ObfuscatedSignature(descriptor = "([BZB)Ljava/lang/Object;")
   @ObfuscatedName("av")
   public static Object method10618(byte[] var0, boolean var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0.length > 136) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               DirectByteArrayCopier var3 = new DirectByteArrayCopier();
               var3.set(var0, (byte)2);
               return var3;
            }
         } else if (var1) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               int var4 = var0.length;
               byte[] var5 = new byte[var4];
               System.arraycopy(var0, 0, var5, 0, var4);
               return var5;
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tg.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("az")
   int method10632(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (this) {
            int var5;
            if (this.position * -1136848575 <= this.limit * 381894067) {
               var5 = 381894067 * this.limit - this.position * -1136848575;
            } else {
               var5 = this.limit * 381894067 + (-195486255 * this.capacity - -1136848575 * this.position);
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               if (var3 + -1136848575 * this.position <= this.capacity * -195486255) {
                  System.arraycopy(this.buffer, this.position * -1136848575, var1, var2, var3);
               } else {
                  int var6 = this.capacity * -195486255 - -1136848575 * this.position;
                  System.arraycopy(this.buffer, this.position * -1136848575, var1, var2, var6);
                  System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
               }

               this.position = -1317503295 * ((var3 + -1136848575 * this.position) % (-195486255 * this.capacity));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   boolean isAvailable(int var1, int var2) throws IOException {
      try {
         if (var1 == 0) {
            return true;
         } else {
            if (var1 > 0) {
               if (var2 >= 1431144326) {
                  throw new IllegalStateException();
               }

               if (var1 < this.capacity * -195486255) {
                  synchronized (this) {
                     int var4;
                     if (-1136848575 * this.position <= 381894067 * this.limit) {
                        var4 = 381894067 * this.limit - this.position * -1136848575;
                     } else {
                        var4 = this.capacity * -195486255 - -1136848575 * this.position + this.limit * 381894067;
                     }

                     if (var4 < var1) {
                        if (this.exception != null) {
                           throw new IOException(this.exception.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if (var2 >= 1431144326) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "tg.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   int available(int var1) throws IOException {
      try {
         synchronized (this) {
            int var3;
            if (-1136848575 * this.position <= this.limit * 381894067) {
               if (var1 == 1094908779) {
                  throw new IllegalStateException();
               }

               var3 = this.limit * 381894067 - -1136848575 * this.position;
            } else {
               var3 = -195486255 * this.capacity - this.position * -1136848575 + 381894067 * this.limit;
            }

            if (var3 > 0 || null == this.exception) {
               this.notifyAll();
               return var3;
            } else if (var1 == 1094908779) {
               throw new IllegalStateException();
            } else {
               throw new IOException(this.exception.toString());
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tg.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int readUnsignedByte(int var1) throws IOException {
      try {
         synchronized (this) {
            if (this.position * -1136848575 == 381894067 * this.limit) {
               if (var1 != 286363924) {
                  throw new IllegalStateException();
               } else if (this.exception != null) {
                  throw new IOException(this.exception.toString());
               } else {
                  return -1;
               }
            } else {
               int var3 = this.buffer[this.position * -1136848575] & 255;
               this.position = (1 + this.position * -1136848575) % (-195486255 * this.capacity) * -1317503295;
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tg.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("an")
   int read(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0 && var2 >= 0) {
            if (var4 <= 1263268823) {
               throw new IllegalStateException();
            }

            if (var3 + var2 <= var1.length) {
               synchronized (this) {
                  int var6;
                  if (this.position * -1136848575 <= this.limit * 381894067) {
                     if (var4 <= 1263268823) {
                        throw new IllegalStateException();
                     }

                     var6 = 381894067 * this.limit - this.position * -1136848575;
                  } else {
                     var6 = this.limit * 381894067 + (-195486255 * this.capacity - -1136848575 * this.position);
                  }

                  if (var3 > var6) {
                     if (var4 <= 1263268823) {
                        throw new IllegalStateException();
                     }

                     var3 = var6;
                  }

                  if (0 == var3) {
                     if (var4 <= 1263268823) {
                        throw new IllegalStateException();
                     }

                     if (this.exception != null) {
                        if (var4 <= 1263268823) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.exception.toString());
                     }
                  }

                  if (var3 + -1136848575 * this.position <= this.capacity * -195486255) {
                     if (var4 <= 1263268823) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.buffer, this.position * -1136848575, var1, var2, var3);
                  } else {
                     int var7 = this.capacity * -195486255 - -1136848575 * this.position;
                     System.arraycopy(this.buffer, this.position * -1136848575, var1, var2, var7);
                     System.arraycopy(this.buffer, 0, var1, var7 + var2, var3 - var7);
                  }

                  this.position = -1317503295 * ((var3 + -1136848575 * this.position) % (-195486255 * this.capacity));
                  this.notifyAll();
                  return var3;
               }
            }

            if (var4 <= 1263268823) {
               throw new IllegalStateException();
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "tg.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void close(int var1) {
      try {
         synchronized (this) {
            if (this.exception == null) {
               if (var1 == -349508558) {
                  throw new IllegalStateException();
               }

               this.exception = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.thread.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method10636() {
      synchronized (this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method10620() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (0 == this.position * -1136848575) {
                  var1 = -626323521 * this.capacity - 330553793 * this.limit - 1;
               } else if (this.position * -1136848575 <= this.limit * -381045044) {
                  var1 = this.capacity * -195486255 - 72440948 * this.limit;
               } else {
                  var1 = this.position * -1136848575 - this.limit * 1307935168 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.buffer, 381894067 * this.limit, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.exception = var3;
               return;
            }
         }

         synchronized (this) {
            this.limit = 1970911611 * ((this.limit * -1066991446 + var2) % (this.capacity * -195486255));
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltg;[BII)I")
   @ObfuscatedName("hz")
   public static int method10634(BufferedSource var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method10638();
      }

      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (var0) {
            int var5;
            if (var0.position * -1136848575 <= var0.limit * 381894067) {
               var5 = 381894067 * var0.limit - var0.position * -1136848575;
            } else {
               var5 = var0.limit * 381894067 + (-195486255 * var0.capacity - -1136848575 * var0.position);
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (0 == var3 && var0.exception != null) {
               throw new IOException(var0.exception.toString());
            } else {
               if (var3 + -1136848575 * var0.position <= var0.capacity * -195486255) {
                  System.arraycopy(var0.buffer, var0.position * -1136848575, var1, var2, var3);
               } else {
                  int var6 = var0.capacity * -195486255 - -1136848575 * var0.position;
                  System.arraycopy(var0.buffer, var0.position * -1136848575, var1, var2, var6);
                  System.arraycopy(var0.buffer, 0, var1, var6 + var2, var3 - var6);
               }

               var0.position = -1317503295 * ((var3 + -1136848575 * var0.position) % (-195486255 * var0.capacity));
               var0.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method10621() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (0 == this.position * 941818348) {
                  var1 = -195486255 * this.capacity - 381894067 * this.limit - 1;
               } else if (this.position * 972426108 <= this.limit * 834699116) {
                  var1 = this.capacity * -1099101090 - -890973390 * this.limit;
               } else {
                  var1 = this.position * -1230428998 - this.limit * 381894067 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.buffer, 381894067 * this.limit, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.exception = var3;
               return;
            }
         }

         synchronized (this) {
            this.limit = 1394082897 * ((this.limit * -288703947 + var2) % (this.capacity * 2096883119));
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltg;I)Z")
   @ObfuscatedName("sf")
   public static boolean method10624(BufferedSource var0, int var1) throws IOException {
      if (var0 == null) {
         var0.method10621();
      }

      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < var0.capacity * -195486255) {
         synchronized (var0) {
            int var3;
            if (-1136848575 * var0.position <= 381894067 * var0.limit) {
               var3 = 381894067 * var0.limit - var0.position * -1136848575;
            } else {
               var3 = var0.capacity * -195486255 - -1136848575 * var0.position + var0.limit * 381894067;
            }

            if (var3 >= var1) {
               return true;
            } else if (var0.exception != null) {
               throw new IOException(var0.exception.toString());
            } else {
               var0.notifyAll();
               return false;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltg;)V")
   @ObfuscatedName("wa")
   public static void method10637(BufferedSource var0) {
      if (var0 == null) {
         var0.method10639();
      }

      synchronized (var0) {
         if (var0.exception == null) {
            var0.exception = new IOException("");
         }

         var0.notifyAll();
      }

      try {
         var0.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltg;)I")
   @ObfuscatedName("ko")
   public static int method10627(BufferedSource var0) throws IOException {
      if (var0 == null) {
         var0.method10629();
      }

      synchronized (var0) {
         int var2;
         if (-1136848575 * var0.position <= var0.limit * 381894067) {
            var2 = var0.limit * 381894067 - -1136848575 * var0.position;
         } else {
            var2 = -195486255 * var0.capacity - var0.position * -1136848575 + 381894067 * var0.limit;
         }

         if (var2 <= 0 && null != var0.exception) {
            throw new IOException(var0.exception.toString());
         } else {
            var0.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method10625(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.capacity * -195486255) {
         synchronized (this) {
            int var3;
            if (-1817393951 * this.position <= -978182002 * this.limit) {
               var3 = -2023476455 * this.limit - this.position * 1400956377;
            } else {
               var3 = this.capacity * -195486255 - -1136848575 * this.position + this.limit * -880802920;
            }

            if (var3 >= var1) {
               return true;
            } else if (this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               this.notifyAll();
               return false;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method10638() {
      synchronized (this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int method10628() throws IOException {
      synchronized (this) {
         int var2;
         if (1820335570 * this.position <= this.limit * 1124191342) {
            var2 = this.limit * 1380740161 - -1136848575 * this.position;
         } else {
            var2 = 534364200 * this.capacity - this.position * 444353604 + 381894067 * this.limit;
         }

         if (var2 <= 0 && null != this.exception) {
            throw new IOException(this.exception.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method10631() throws IOException {
      synchronized (this) {
         if (this.position * 1103298248 == 381894067 * this.limit) {
            if (this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.buffer[this.position * 1189498621] & 255;
            this.position = (1 + this.position * 1594276631) % (1789943724 * this.capacity) * 1730547707;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method10622() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (this.exception != null) {
                  return;
               }

               if (0 == this.position * -1136848575) {
                  var1 = -195486255 * this.capacity - 381894067 * this.limit - 1;
               } else if (this.position * -1136848575 <= this.limit * 381894067) {
                  var1 = this.capacity * -195486255 - 381894067 * this.limit;
               } else {
                  var1 = this.position * -1136848575 - this.limit * 381894067 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.buffer, 381894067 * this.limit, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.exception = var3;
               return;
            }
         }

         synchronized (this) {
            this.limit = 1970911611 * ((this.limit * 381894067 + var2) % (this.capacity * -195486255));
         }
      }
   }

   @Override
   public void run() {
      try {
         while (true) {
            int var1;
            synchronized (this) {
               while (true) {
                  if (this.exception != null) {
                     return;
                  }

                  if (0 == this.position * -1136848575) {
                     var1 = -195486255 * this.capacity - 381894067 * this.limit - 1;
                  } else if (this.position * -1136848575 <= this.limit * 381894067) {
                     var1 = this.capacity * -195486255 - 381894067 * this.limit;
                  } else {
                     var1 = this.position * -1136848575 - this.limit * 381894067 - 1;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var9) {
                  }
               }
            }

            int var2;
            try {
               var2 = this.inputStream.read(this.buffer, 381894067 * this.limit, var1);
               if (-1 == var2) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized (this) {
                  this.exception = var3;
                  return;
               }
            }

            synchronized (this) {
               this.limit = 1970911611 * ((this.limit * 381894067 + var2) % (this.capacity * -195486255));
            }
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "tg.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method10629() throws IOException {
      synchronized (this) {
         int var2;
         if (-1136848575 * this.position <= this.limit * 381894067) {
            var2 = this.limit * 381894067 - -1136848575 * this.position;
         } else {
            var2 = -195486255 * this.capacity - this.position * -1136848575 + 381894067 * this.limit;
         }

         if (var2 <= 0 && null != this.exception) {
            throw new IOException(this.exception.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   BufferedSource(InputStream var1, int var2) {
      this.limit = 0;
      this.inputStream = var1;
      this.capacity = 1440242481 * (1 + var2);
      this.buffer = new byte[this.capacity * -195486255];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedSignature(descriptor = "([BIIB)Ljava/lang/String;")
   @ObfuscatedName("av")
   public static String method10619(byte[] var0, int var1, int var2, byte var3) {
      try {
         StringBuilder var4 = new StringBuilder();

         for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            int var6 = var0[var5] & 255;
            var4.append(class452.field5526[var6 >>> 2]);
            if (var5 < var2 - 1) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               int var7 = var0[var5 + 1] & 255;
               var4.append(class452.field5526[(var6 & 3) << 4 | var7 >>> 4]);
               if (var5 < var2 - 2) {
                  int var8 = var0[var5 + 2] & 255;
                  var4.append(class452.field5526[(var7 & 15) << 2 | var8 >>> 6]).append(class452.field5526[var8 & 63]);
               } else {
                  var4.append(class452.field5526[(var7 & 15) << 2]).append("=");
               }
            } else {
               var4.append(class452.field5526[(var6 & 3) << 4]).append("==");
            }
         }

         return var4.toString();
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "tg.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method10639() {
      synchronized (this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }
   }
}
