import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wn")
public final class AccessFile {
   @ObfuscatedName("av")
   final File field6395;
   @ObfuscatedName("an")
   long offset;
   @ObfuscatedName("ag")
   RandomAccessFile file;
   @ObfuscatedName("at")
   final long maxSize;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6396 = 5;

   public AccessFile(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.file = new RandomAccessFile(var1, var2);
      this.field6395 = var1;
      this.maxSize = -2208541203659807223L * var3;
      this.offset = 0L;
      int var5 = this.file.read();
      if (-1 != var5 && !var2.equals("r")) {
         this.file.seek(0L);
         this.file.write(var5);
      }

      this.file.seek(0L);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("an")
   public final void close(byte var1) throws IOException {
      try {
         method11807(this, false, (byte)-11);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wn.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("am")
   public final int method11813(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.file.read(var1, var2, var3);
      if (var4 > 0) {
         this.offset += -2116553533331058711L * var4;
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "([BIIB)I")
   @ObfuscatedName("ak")
   public final int read(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         int var5 = this.file.read(var1, var2, var3);
         if (var5 > 0) {
            this.offset += -2116553533331058711L * var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "wn.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("vi")
   public long method11820() {
      return method11809(this, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "(Lwn;[BIIB)V")
   @ObfuscatedName("lu")
   public static void method11798(AccessFile var0, byte[] var1, int var2, int var3, byte var4) throws IOException {
      if (var0 == null) {
         var0.write(var1, var2, var2, var4);
      } else {
         try {
            if (var3 + 3167778873301760089L * var0.offset > var0.maxSize * -6124820524489881543L) {
               if (var4 >= 1) {
                  throw new IllegalStateException();
               } else {
                  var0.file.seek(-6124820524489881543L * var0.maxSize);
                  var0.file.write(1);
                  throw new EOFException();
               }
            } else {
               var0.file.write(var1, var2, var3);
               var0.offset += var3 * -2116553533331058711L;
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "wn.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ch")
   public static int stringCp1252NullTerminatedByteSize(String var0, int var1) {
      try {
         return var0.length() + 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wn.ch(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("all")
   protected void method11816() throws Throwable {
      if (null != this.file) {
         this.close((byte)-33);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/File;")
   @ObfuscatedName("aw")
   final File method11791() {
      return this.field6395;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;[BII)I")
   @ObfuscatedName("el")
   public static int method11815(AccessFile var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method11819(var1, var2, var2);
      }

      int var4 = var0.file.read(var1, var2, var3);
      if (var4 > 0) {
         var0.offset += -2116553533331058711L * var4;
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Lwn;J)V")
   @ObfuscatedName("pg")
   public static void method11793(AccessFile var0, long var1) throws IOException {
      if (var0 == null) {
         var0.seek(var1);
      } else {
         try {
            var0.file.seek(var1);
            var0.offset = var1 * -2116553533331058711L;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "wn.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ab")
   public final void method11804(boolean var1) throws IOException {
      if (null != this.file) {
         if (var1) {
            try {
               this.file.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.file.close();
         this.file = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ax")
   public final void method11805(boolean var1) throws IOException {
      if (null != this.file) {
         if (var1) {
            try {
               this.file.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.file.close();
         this.file = null;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ro")
   public void method11819(byte[] var1, int var2, int var3) {
      while (var3 > 0) {
         int var4 = this.file.read(var1, var2, var3);
         if (var4 == -1) {
            throw new EOFException();
         }

         this.offset = (this.offset * 3167778873301760089L + var4) * -2116553533331058711L;
         var2 += var4;
         var3 -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("sv")
   public void method11821(byte[] var1, int var2, int var3) {
      method11798(this, var1, var2, var3, (byte)-26);
   }

   @Override
   protected void finalize() throws Throwable {
      try {
         if (null != this.file) {
            this.close((byte)-120);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wn.finalize(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwn;B)J")
   @ObfuscatedName("zw")
   public static long method11809(AccessFile var0, byte var1) throws IOException {
      if (var0 == null) {
         return var0.length(var1);
      } else {
         try {
            return var0.file.length();
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "wn.aj(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;J)V")
   @ObfuscatedName("gw")
   public static void method11794(AccessFile var0, long var1) throws IOException {
      var0.file.seek(var1);
      var0.offset = var1 * -2116553533331058711L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public final void method11801() throws IOException {
      method11807(this, false, (byte)-71);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("oh")
   public void method11822(boolean var1) {
      method11807(this, var1, (byte)-11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;)V")
   @ObfuscatedName("xt")
   public static void method11817(AccessFile var0) throws Throwable {
      if (null != var0.file) {
         var0.close((byte)-84);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public final void method11802() throws IOException {
      method11807(this, false, (byte)-17);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("az")
   final void method11795(long var1) throws IOException {
      this.file.seek(var1);
      this.offset = var1 * -2116553533331058711L;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ay")
   final void method11796(long var1) throws IOException {
      this.file.seek(var1);
      this.offset = var1 * -2116553533331058711L;
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("al")
   public final long method11810() throws IOException {
      return this.file.length();
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("gq")
   public void method11823(long var1) {
      method11793(this, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/io/File;")
   @ObfuscatedName("av")
   final File method11792(int var1) {
      try {
         return this.field6395;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wn.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;Z)V")
   @ObfuscatedName("dv")
   public static void method11806(AccessFile var0, boolean var1) throws IOException {
      if (null != var0.file) {
         if (var1) {
            try {
               var0.file.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         var0.file.close();
         var0.file = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwn;ZB)V")
   @ObfuscatedName("qo")
   public static void method11807(AccessFile var0, boolean var1, byte var2) throws IOException {
      if (var0 == null) {
         var0.closeSync(var1, var2);
      } else {
         try {
            if (null != var0.file) {
               if (var2 >= 0) {
                  return;
               }

               if (var1) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  try {
                     var0.file.getFD().sync();
                  } catch (SyncFailedException var4) {
                  }
               }

               var0.file.close();
               var0.file = null;
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "wn.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("at")
   final void seek(long var1) {
      try {
         this.file.seek(var1);
         this.offset = var1 * -2116553533331058711L;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("ag")
   public final void write(byte[] var1, int var2, int var3, byte var4) {
      try {
         if (var3 + 3167778873301760089L * this.offset > this.maxSize * -6124820524489881543L) {
            if (var4 >= 1) {
               throw new IllegalStateException();
            } else {
               this.file.seek(-6124820524489881543L * this.maxSize);
               this.file.write(1);
               throw new EOFException();
            }
         } else {
            this.file.write(var1, var2, var3);
            this.offset += var3 * -2116553533331058711L;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ae")
   public final void closeSync(boolean var1, byte var2) {
      try {
         if (null != this.file) {
            if (var2 >= 0) {
               return;
            }

            if (var1) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               try {
                  this.file.getFD().sync();
               } catch (SyncFailedException var4) {
               }
            }

            this.file.close();
            this.file = null;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wn.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public final void method11803() {
      method11807(this, false, (byte)-71);
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ah")
   public final long method11811() {
      return this.file.length();
   }

   @ObfuscatedSignature(descriptor = "(B)J")
   @ObfuscatedName("aj")
   public final long length(byte var1) {
      try {
         return this.file.length();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wn.aj(" + ')');
      }
   }
}
