import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ei")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("at")
   volatile boolean isClosed;
   @ObfuscatedName("an")
   int clientRevision;
   @ObfuscatedName("ag")
   Queue requests = new LinkedList();
   @ObfuscatedName("av")
   final Thread requestThread = new Thread(this);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method3732() {
      while (!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized (this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.openConnection(var1, (byte)-57);
         } catch (Exception var7) {
            PlayerType.RunException_sendStackTrace(null, var7, -1959325348);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method3733() {
      while (!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized (this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.openConnection(var1, (byte)5);
         } catch (Exception var7) {
            PlayerType.RunException_sendStackTrace(null, var7, -1750359080);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;B)V")
   @ObfuscatedName("av")
   abstract void openConnection(UrlRequest var1, byte var2) throws IOException;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lei;Ljava/net/URLConnection;)I")
   @ObfuscatedName("na")
   public static int method3735(UrlRequester var0, URLConnection var1) {
      if (var0 == null) {
         var0.method3733();
      }

      int var2 = UrlRequest.field1726 * 1859359931;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lei;Ljava/net/URLConnection;)I")
   @ObfuscatedName("bo")
   public static int method3736(UrlRequester var0, URLConnection var1) {
      if (var0 == null) {
         var0.method3750();
      }

      int var2 = UrlRequest.field1726 * 1859359931;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Ley;")
   @ObfuscatedName("ae")
   public UrlRequest request(URL var1, int var2) {
      try {
         UrlRequest var3 = new UrlRequest(var1);
         synchronized (this) {
            this.requests.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ei.ae(" + ')');
      }
   }

   @Override
   public void run() {
      try {
         while (!this.isClosed) {
            try {
               UrlRequest var1;
               synchronized (this) {
                  var1 = (UrlRequest)this.requests.poll();
                  if (var1 == null) {
                     try {
                        this.wait();
                     } catch (InterruptedException var5) {
                     }
                     continue;
                  }
               }

               this.openConnection(var1, (byte)-44);
            } catch (Exception var7) {
               PlayerType.RunException_sendStackTrace(null, var7, -526740325);
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ei.run(" + ')');
      }
   }

   UrlRequester(int var1) {
      this.requestThread.setPriority(1);
      this.requestThread.start();
      this.clientRevision = -79524607 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lei;Ljava/net/URLConnection;)I")
   @ObfuscatedName("lw")
   public static int method3737(UrlRequester var0, URLConnection var1) {
      if (var0 == null) {
         var0.method3740(var1);
      }

      int var2 = UrlRequest.field1726 * 1859359931;
      if (null != var1) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)V")
   @ObfuscatedName("ag")
   void setDefaultRequestProperties(URLConnection var1, int var2) {
      try {
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setUseCaches(false);
         var1.setRequestProperty("Connection", "close");
         var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + -244944127 * this.clientRevision);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ei.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void close(int var1) {
      try {
         this.isClosed = true;

         try {
            synchronized (this) {
               this.notify();
            }

            this.requestThread.join();
         } catch (InterruptedException var5) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ei.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)I")
   @ObfuscatedName("at")
   int method3738(URLConnection var1, int var2) {
      try {
         int var3 = UrlRequest.field1726 * 1859359931;
         if (null != var1) {
            try {
               if (var1 instanceof HttpURLConnection) {
                  if (var2 >= -1994464775) {
                     throw new IllegalStateException();
                  }

                  var3 = ((HttpURLConnection)var1).getResponseCode();
               }
            } catch (IOException var5) {
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ei.at(" + 41);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;I)V")
   @ObfuscatedName("an")
   void method3742(URLConnection var1, UrlRequest var2, int var3) {
      try {
         DataInputStream var4 = null;
         boolean var16 = false /* VF: Semaphore variable */;

         label95: {
            label94: {
               try {
                  var16 = true;
                  int var6 = var1.getContentLength();
                  var4 = new DataInputStream(var1.getInputStream());
                  byte[] var5;
                  if (var6 >= 0) {
                     if (var3 >= 1647832021) {
                        throw new IllegalStateException();
                     }

                     var5 = new byte[var6];
                     var4.readFully(var5);
                  } else {
                     var5 = new byte[0];
                     byte[] var7 = WorldEntityCoord.ByteArrayPool_getArrayBool(5000, false, (byte)-53);
                     byte[] var8 = var7;

                     for (int var9 = var4.read(var7); var9 > -1; var9 = var4.read(var8)) {
                        if (var3 >= 1647832021) {
                           throw new IllegalStateException();
                        }

                        byte[] var10 = new byte[var9 + var5.length];
                        System.arraycopy(var5, 0, var10, 0, var5.length);
                        System.arraycopy(var8, 0, var10, var5.length, var9);
                        var5 = var10;
                     }

                     class372.ByteArrayPool_release(var8, (byte)-15);
                  }

                  var2.response0 = var5;
                  var16 = false;
                  break label94;
               } catch (IOException var18) {
                  var2.response0 = null;
                  var16 = false;
               } finally {
                  if (var16) {
                     var2.field1728 = this.method3738(var1, -2144050566) * 1094577293;
                  }
               }

               var2.field1728 = this.method3738(var1, -2015683559) * 1094577293;
               break label95;
            }

            var2.field1728 = this.method3738(var1, -2038020110) * 1094577293;
         }

         if (null != var4) {
            if (var3 >= 1647832021) {
               throw new IllegalStateException();
            }

            try {
               var4.close();
            } catch (IOException var17) {
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "ei.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lei;)V")
   @ObfuscatedName("vb")
   public static void method3749(UrlRequester var0) {
      if (var0 == null) {
         var0.method3734();
      } else {
         var0.isClosed = true;

         try {
            synchronized (var0) {
               var0.notify();
            }

            var0.requestThread.join();
         } catch (InterruptedException var4) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ak")
   abstract void vmethod179(UrlRequest var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("aw")
   abstract void vmethod180(UrlRequest var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ap")
   abstract void vmethod181(UrlRequest var1) throws IOException;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;)V")
   @ObfuscatedName("ac")
   void method3743(URLConnection var1, UrlRequest var2) {
      DataInputStream var3 = null;
      boolean var14 = false /* VF: Semaphore variable */;

      label73: {
         label72: {
            try {
               var14 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = WorldEntityCoord.ByteArrayPool_getArrayBool(1013569539, false, (byte)102);
                  byte[] var7 = var6;

                  for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                     byte[] var9 = new byte[var8 + var4.length];
                     System.arraycopy(var4, 0, var9, 0, var4.length);
                     System.arraycopy(var7, 0, var9, var4.length, var8);
                     var4 = var9;
                  }

                  class372.ByteArrayPool_release(var7, (byte)-33);
               }

               var2.response0 = var4;
               var14 = false;
               break label72;
            } catch (IOException var16) {
               var2.response0 = null;
               var14 = false;
            } finally {
               if (var14) {
                  var2.field1728 = this.method3738(var1, -2090991884) * 1094577293;
               }
            }

            var2.field1728 = this.method3738(var1, -2129371558) * 632170810;
            break label73;
         }

         var2.field1728 = this.method3738(var1, -2127703031) * -1568948932;
      }

      if (null != var3) {
         try {
            var3.close();
         } catch (IOException var15) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)V")
   @ObfuscatedName("ad")
   void method3740(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + -244944127 * this.clientRevision);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method3734() {
      while (!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized (this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.openConnection(var1, (byte)-59);
         } catch (Exception var7) {
            PlayerType.RunException_sendStackTrace(null, var7, -1960570183);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;)V")
   @ObfuscatedName("as")
   void method3744(URLConnection var1, UrlRequest var2) {
      DataInputStream var3 = null;
      boolean var14 = false /* VF: Semaphore variable */;

      label73: {
         label72: {
            try {
               var14 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = WorldEntityCoord.ByteArrayPool_getArrayBool(-1149392179, false, (byte)-6);
                  byte[] var7 = var6;

                  for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                     byte[] var9 = new byte[var8 + var4.length];
                     System.arraycopy(var4, 0, var9, 0, var4.length);
                     System.arraycopy(var7, 0, var9, var4.length, var8);
                     var4 = var9;
                  }

                  class372.ByteArrayPool_release(var7, (byte)-93);
               }

               var2.response0 = var4;
               var14 = false;
               break label72;
            } catch (IOException var16) {
               var2.response0 = null;
               var14 = false;
            } finally {
               if (var14) {
                  var2.field1728 = this.method3738(var1, -2002926198) * 1094577293;
               }
            }

            var2.field1728 = this.method3738(var1, -2053475891) * 1094577293;
            break label73;
         }

         var2.field1728 = this.method3738(var1, -2100203026) * 1094577293;
      }

      if (null != var3) {
         try {
            var3.close();
         } catch (IOException var15) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lei;Ljava/net/URLConnection;)V")
   @ObfuscatedName("qt")
   public static void method3741(UrlRequester var0, URLConnection var1) {
      if (var0 == null) {
         var0.method3734();
      }

      var1.setConnectTimeout(1796644072);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 772771788 * var0.clientRevision);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;)Ley;")
   @ObfuscatedName("ab")
   public UrlRequest method3746(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized (this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;)Ley;")
   @ObfuscatedName("ax")
   public UrlRequest method3747(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized (this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method3750() {
      this.isClosed = true;

      try {
         synchronized (this) {
            this.notify();
         }

         this.requestThread.join();
      } catch (InterruptedException var4) {
      }
   }
}
