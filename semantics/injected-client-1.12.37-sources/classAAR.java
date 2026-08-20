import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aar")
public final class classAAR {
   @ObfuscatedName("az")
   final File field96;
   @ObfuscatedName("af")
   final long field97;
   @ObfuscatedName("ae")
   RandomAccessFile field98;
   @ObfuscatedName("ab")
   long field99;

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ak")
   public final void method251(boolean var1) throws IOException {
      if (this.field98 != null) {
         if (var1) {
            try {
               this.field98.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.field98.close();
         this.field98 = null;
      }
   }

   public classAAR(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field98 = new RandomAccessFile(var1, var2);
      this.field96 = var1;
      this.field97 = 4558015941283848441L * var3;
      this.field99 = 0L;
      int var5 = this.field98.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field98.seek(0L);
         this.field98.write(var5);
      }

      this.field98.seek(0L);
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("an")
   public final long method256() throws IOException {
      return this.field98.length();
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("da")
   public void method265(long var1) {
      this.method241(var1);
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ae")
   public final void method242(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 + 8826329765573070539L * this.field99 > this.field97 * -1097077856284434103L) {
            if (var4 >= 689229467) {
               throw new IllegalStateException();
            } else {
               this.field98.seek(-1097077856284434103L * this.field97);
               this.field98.write(1);
               throw new EOFException();
            }
         } else {
            this.field98.write(var1, var2, var3);
            this.field99 += var3 * 7580072378778380003L;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "aar.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ag")
   public final void method252(boolean var1, int var2) throws IOException {
      try {
         if (this.field98 != null) {
            if (var2 == 1032478127) {
               throw new IllegalStateException();
            }

            if (var1) {
               if (var2 == 1032478127) {
                  return;
               }

               try {
                  this.field98.getFD().sync();
               } catch (SyncFailedException var4) {
               }
            }

            this.field98.close();
            this.field98 = null;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "aar.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("as")
   public final long method257(int var1) throws IOException {
      try {
         return this.field98.length();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aar.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("ax")
   public final int method260(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         int var5 = this.field98.read(var1, var2, var3);
         if (var5 > 0) {
            if (var4 != -1397369950) {
               throw new IllegalStateException();
            }

            this.field99 += var5 * 7580072378778380003L;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "aar.ax(" + 41);
      }
   }

   @Override
   protected void finalize() throws Throwable {
      try {
         if (this.field98 != null) {
            method247(this, (byte)1);
         }
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "aar.finalize(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ad")
   public final void method243(byte[] var1, int var2, int var3) throws IOException {
      if (var3 + 8826329765573070539L * this.field99 > this.field97 * -1097077856284434103L) {
         this.field98.seek(-1097077856284434103L * this.field97);
         this.field98.write(1);
         throw new EOFException();
      } else {
         this.field98.write(var1, var2, var3);
         this.field99 += var3 * 7580072378778380003L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("abn")
   protected void method261() throws Throwable {
      if (this.field98 != null) {
         method247(this, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laar;I)Ljava/io/File;")
   @ObfuscatedName("dl")
   public static File method235(classAAR var0, int var1) {
      if (var0 == null) {
         return var0.method237(var1);
      } else {
         try {
            return var0.field96;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "aar.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/File;")
   @ObfuscatedName("ac")
   final File method236() {
      return this.field96;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("abc")
   protected void method262() throws Throwable {
      if (this.field98 != null) {
         method247(this, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ao")
   final void method238(long var1) throws IOException {
      this.field98.seek(var1);
      this.field99 = var1 * 7580072378778380003L;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("al")
   final void method239(long var1) throws IOException {
      this.field98.seek(var1);
      this.field99 = var1 * 7580072378778380003L;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("aj")
   final void method240(long var1) throws IOException {
      this.field98.seek(var1);
      this.field99 = var1 * 7580072378778380003L;
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("gm")
   public long method266() {
      return this.method257(-153393736);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("aq")
   public final void method244(byte[] var1, int var2, int var3) throws IOException {
      if (var3 + 8826329765573070539L * this.field99 > this.field97 * -1097077856284434103L) {
         this.field98.seek(-1097077856284434103L * this.field97);
         this.field98.write(1);
         throw new EOFException();
      } else {
         this.field98.write(var1, var2, var3);
         this.field99 += var3 * 7580072378778380003L;
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("at")
   public final long method258() throws IOException {
      return this.field98.length();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laar;[BII)V")
   @ObfuscatedName("eg")
   public static void method245(classAAR var0, byte[] var1, int var2, int var3) throws IOException {
      if (var3 + 8826329765573070539L * var0.field99 > var0.field97 * -1097077856284434103L) {
         var0.field98.seek(-1097077856284434103L * var0.field97);
         var0.field98.write(1);
         throw new EOFException();
      } else {
         var0.field98.write(var1, var2, var3);
         var0.field99 += var3 * 7580072378778380003L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("av")
   public final void method253(boolean var1) throws IOException {
      if (this.field98 != null) {
         if (var1) {
            try {
               this.field98.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.field98.close();
         this.field98 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public final void method246() throws IOException {
      this.method252(false, 1494157377);
   }

   @ObfuscatedSignature(descriptor = "(Laar;B)V")
   @ObfuscatedName("qm")
   public static void method247(classAAR var0, byte var1) throws IOException {
      if (var0 == null) {
         var0.method250(var1);
      }

      try {
         var0.method252(false, 1787136346);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aar.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ii")
   public void method267(byte[] var1, int var2, int var3) {
      this.method242(var1, var2, var3, -1522899189);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public final void method248() throws IOException {
      this.method252(false, -347069786);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ar")
   public final void method254(boolean var1) throws IOException {
      if (this.field98 != null) {
         if (var1) {
            try {
               this.field98.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.field98.close();
         this.field98 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aw")
   public final void method255(boolean var1) throws IOException {
      if (this.field98 != null) {
         if (var1) {
            try {
               this.field98.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.field98.close();
         this.field98 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("vj")
   public void method268(boolean var1) {
      this.method252(var1, 1787136346);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public final void method249() throws IOException {
      this.method252(false, 1573672214);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("abt")
   protected void method263() throws Throwable {
      if (this.field98 != null) {
         method247(this, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("af")
   final void method241(long var1) throws IOException {
      try {
         this.field98.seek(var1);
         this.field99 = var1 * 7580072378778380003L;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aar.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("am")
   public final long method259() throws IOException {
      return this.field98.length();
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("tf")
   public void method264(byte[] var1, int var2, int var3) {
      while (var3 > 0) {
         int var4 = this.field98.read(var1, var2, var3);
         if (var4 == -1) {
            throw new EOFException();
         }

         this.field99 = (this.field99 * 8826329765573070539L + var4) * 7580072378778380003L;
         var2 += var4;
         var3 -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ab")
   public final void method250(byte var1) {
      try {
         this.method252(false, 1787136346);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aar.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/io/File;")
   @ObfuscatedName("az")
   final File method237(int var1) {
      try {
         return this.field96;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aar.az(" + ')');
      }
   }
}
