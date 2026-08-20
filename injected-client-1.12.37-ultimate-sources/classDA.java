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

@ObfuscatedName("da")
public abstract class classDA implements Runnable {
   @ObfuscatedName("ae")
   Queue field1363 = new LinkedList();
   @ObfuscatedName("af")
   volatile boolean field1367;
   @ObfuscatedName("az")
   final Thread field1364 = new Thread(this);
   @ObfuscatedName("ab")
   int field1365;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("db")
   static classDZ field1366;

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)V")
   @ObfuscatedName("au")
   void method2861(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1697405541 * this.field1365);
   }

   @ObfuscatedSignature(descriptor = "(Ley;I)V")
   @ObfuscatedName("ab")
   abstract void vmethod299(classEY var1, int var2) throws IOException;

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;B)V")
   @ObfuscatedName("as")
   void method2862(URLConnection var1, byte var2) {
      try {
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setUseCaches(false);
         var1.setRequestProperty("Connection", "close");
         var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1697405541 * this.field1365);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "da.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Ley;")
   @ObfuscatedName("ac")
   public classEY method2872(URL var1, int var2) {
      try {
         classEY var3 = new classEY(var1);
         synchronized (this) {
            this.field1363.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "da.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lda;Ljava/net/URL;)Ley;")
   @ObfuscatedName("yh")
   public static classEY method2873(classDA var0, URL var1) {
      if (var0 == null) {
         var0.method2853();
      }

      classEY var2 = new classEY(var1);
      synchronized (var0) {
         var0.field1363.add(var2);
         var0.notify();
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;I)V")
   @ObfuscatedName("ax")
   void method2867(URLConnection var1, classEY var2, int var3) {
      try {
         DataInputStream var4 = null;

         try {
            int var6 = var1.getContentLength();
            var4 = new DataInputStream(var1.getInputStream());
            byte[] var5;
            if (var6 >= 0) {
               var5 = new byte[var6];
               var4.readFully(var5);
            } else {
               var5 = new byte[0];
               byte[] var7 = classTO.method10937(5000, false, 1154989421);
               byte[] var8 = var7;

               for (int var9 = var4.read(var7); var9 > -1; var9 = var4.read(var8)) {
                  byte[] var10 = new byte[var5.length + var9];
                  System.arraycopy(var5, 0, var10, 0, var5.length);
                  System.arraycopy(var8, 0, var10, var5.length, var9);
                  var5 = var10;
               }

               classUA.method11237(var8, 2022759572);
            }

            var2.field1987 = var5;
         } catch (IOException var17) {
            var2.field1987 = null;
         } finally {
            var2.field1982 = this.method2860(var1, -1850307933) * -1291012355;
         }

         if (var4 != null) {
            if (var3 != -1722750605) {
               throw new IllegalStateException();
            }

            try {
               var4.close();
            } catch (IOException var16) {
            }
         }
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "da.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)I")
   @ObfuscatedName("ay")
   int method2857(URLConnection var1) {
      int var2 = classEY.field1980 * 935163235;
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

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)V")
   @ObfuscatedName("ap")
   void method2863(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + -19635928 * this.field1365);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method2853() {
      while (!this.field1367) {
         try {
            classEY var1;
            synchronized (this) {
               var1 = (classEY)this.field1363.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod299(var1, -875379736);
         } catch (Exception var7) {
            classAAU.method275(null, var7, (byte)34);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)V")
   @ObfuscatedName("ly")
   public static void method2871(classQR var0) {
      if (var0 == null) {
         var0.method9783();
      }

      var0.field5601 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lda;Ljava/net/URLConnection;)I")
   @ObfuscatedName("wu")
   public static int method2858(classDA var0, URLConnection var1) {
      if (var0 == null) {
         var0.method2865(var1);
      }

      int var2 = classEY.field1980 * 935163235;
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

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method2854() {
      while (!this.field1367) {
         try {
            classEY var1;
            synchronized (this) {
               var1 = (classEY)this.field1363.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod299(var1, -980221159);
         } catch (Exception var7) {
            classAAU.method275(null, var7, (byte)124);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method2855() {
      while (!this.field1367) {
         try {
            classEY var1;
            synchronized (this) {
               var1 = (classEY)this.field1363.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod299(var1, 1477139775);
         } catch (Exception var7) {
            classAAU.method275(null, var7, (byte)56);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ao")
   abstract void vmethod300(classEY var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("al")
   abstract void vmethod301(classEY var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;)V")
   @ObfuscatedName("aw")
   void method2868(URLConnection var1, classEY var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = classTO.method10937(226723953, false, 1154989421);
            byte[] var7 = var6;

            for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
               byte[] var9 = new byte[var4.length + var8];
               System.arraycopy(var4, 0, var9, 0, var4.length);
               System.arraycopy(var7, 0, var9, var4.length, var8);
               var4 = var9;
            }

            classUA.method11237(var7, 2022759572);
         }

         var2.field1987 = var4;
      } catch (IOException var15) {
         var2.field1987 = null;
      } finally {
         var2.field1982 = this.method2860(var1, -1850307933) * -1291012355;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var14) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)I")
   @ObfuscatedName("aj")
   int method2859(URLConnection var1) {
      int var2 = classEY.field1980 * 935163235;
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

   @Override
   public void run() {
      try {
         while (!this.field1367) {
            try {
               classEY var1;
               synchronized (this) {
                  var1 = (classEY)this.field1363.poll();
                  if (null == var1) {
                     try {
                        this.wait();
                     } catch (InterruptedException var5) {
                     }
                     continue;
                  }
               }

               this.vmethod299(var1, 896252567);
            } catch (Exception var7) {
               classAAU.method275(null, var7, (byte)66);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "da.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)V")
   @ObfuscatedName("ad")
   void method2864(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 355679662 * this.field1365);
   }

   classDA(int var1) {
      this.field1364.setPriority(1);
      this.field1364.start();
      this.field1365 = 677758829 * var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aa")
   public void method2876(byte var1) {
      try {
         this.field1367 = true;

         try {
            synchronized (this) {
               this.notify();
            }

            this.field1364.join();
         } catch (InterruptedException var5) {
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "da.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;)Z")
   @ObfuscatedName("rd")
   public static boolean method2852(classXK var0) {
      return var0.field6884;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;)V")
   @ObfuscatedName("ai")
   void method2865(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1697405541 * this.field1365);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method2877() {
      this.field1367 = true;

      try {
         synchronized (this) {
            this.notify();
         }

         this.field1364.join();
      } catch (InterruptedException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(II)J")
   @ObfuscatedName("af")
   public static long method2866(int var0, int var1) {
      try {
         return classFO.field2351[var0];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "da.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;)V")
   @ObfuscatedName("ak")
   void method2869(URLConnection var1, classEY var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = classTO.method10937(5000, false, 1154989421);
            byte[] var7 = var6;

            for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
               byte[] var9 = new byte[var4.length + var8];
               System.arraycopy(var4, 0, var9, 0, var4.length);
               System.arraycopy(var7, 0, var9, var4.length, var8);
               var4 = var9;
            }

            classUA.method11237(var7, 2022759572);
         }

         var2.field1987 = var4;
      } catch (IOException var15) {
         var2.field1987 = null;
      } finally {
         var2.field1982 = this.method2860(var1, -1850307933) * -1291012355;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var14) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;)Ley;")
   @ObfuscatedName("at")
   public classEY method2874(URL var1) {
      classEY var2 = new classEY(var1);
      synchronized (this) {
         this.field1363.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URL;)Ley;")
   @ObfuscatedName("an")
   public classEY method2875(URL var1) {
      classEY var2 = new classEY(var1);
      synchronized (this) {
         this.field1363.add(var2);
         this.notify();
         return var2;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Ley;)V")
   @ObfuscatedName("ar")
   void method2870(URLConnection var1, classEY var2) {
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
                  byte[] var6 = classTO.method10937(5000, false, 1154989421);
                  byte[] var7 = var6;

                  for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                     byte[] var9 = new byte[var4.length + var8];
                     System.arraycopy(var4, 0, var9, 0, var4.length);
                     System.arraycopy(var7, 0, var9, var4.length, var8);
                     var4 = var9;
                  }

                  classUA.method11237(var7, 2022759572);
               }

               var2.field1987 = var4;
               var14 = false;
               break label72;
            } catch (IOException var16) {
               var2.field1987 = null;
               var14 = false;
            } finally {
               if (var14) {
                  var2.field1982 = this.method2860(var1, -1850307933) * -951181438;
               }
            }

            var2.field1982 = this.method2860(var1, -1850307933) * -531992200;
            break label73;
         }

         var2.field1982 = this.method2860(var1, -1850307933) * -2031223932;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var15) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method2878() {
      this.field1367 = true;

      try {
         synchronized (this) {
            this.notify();
         }

         this.field1364.join();
      } catch (InterruptedException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method2879() {
      this.field1367 = true;

      try {
         synchronized (this) {
            this.notify();
         }

         this.field1364.join();
      } catch (InterruptedException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)I")
   @ObfuscatedName("ag")
   int method2860(URLConnection var1, int var2) {
      try {
         int var3 = classEY.field1980 * 935163235;
         if (null != var1) {
            if (var2 != -1850307933) {
               throw new IllegalStateException();
            }

            try {
               if (var1 instanceof HttpURLConnection) {
                  if (var2 != -1850307933) {
                     throw new IllegalStateException();
                  }

                  var3 = ((HttpURLConnection)var1).getResponseCode();
               }
            } catch (IOException var5) {
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "da.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public static void method2856(int var0) {
      try {
         classJZ.method6431(classPN.field5350);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "da.ae(" + ')');
      }
   }
}
