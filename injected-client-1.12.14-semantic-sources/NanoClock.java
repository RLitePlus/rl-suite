import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class NanoClock extends Clock {
   @ObfuscatedName("gs")
   public long field2570;
   @ObfuscatedName("gc")
   public static boolean field2572;
   @ObfuscatedName("jh")
   public static double field2569;
   @ObfuscatedName("qz")
   public long field2571;
   @ObfuscatedName("av")
   long lastTimeNano = System.nanoTime() * 5517121868071460577L;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   @Override
   public void vmethod200() {
      this.lastTimeNano = System.nanoTime() * 5517121868071460577L;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ic")
   public int method5019(int var1, int var2) {
      long var3 = System.nanoTime();
      field2572 = true;
      if (client.field1003 > 0L) {
         long var5 = this.lastTimeNano * 4884895930248422689L - var3;
         long var7 = this.field2570 - var3;
         long var9 = Math.min(var5, var7);
         var9 /= 1000000L;
         method5018(var9);
         var3 = System.nanoTime();
         if (var3 < this.lastTimeNano * 4884895930248422689L && var5 > var7) {
            field2572 = false;
         } else {
            this.lastTimeNano = (this.lastTimeNano * 4884895930248422689L + client.field1003) * 5517121868071460577L;
            if (this.lastTimeNano * 4884895930248422689L < var3) {
               this.lastTimeNano = var3 * 5517121868071460577L;
            }
         }
      }

      long var11 = 1000000L * var1;

      int var12;
      for (var12 = 0; var12 < 10 && (var12 < 1 && !field2572 || this.field2570 < var3); this.field2570 += var11) {
         var12++;
         this.field2571 = this.field2570;
      }

      if (this.field2570 < var3) {
         this.field2570 = var3;
      }

      field2569 = (double)Math.min(var3 - this.field2571, var11) / var11;
      return var12;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("en")
   public int method5020(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = this.lastTimeNano * 4884895930248422689L - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      method5018(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || this.lastTimeNano * 4884895930248422689L < var7)) {
         var9++;
         this.lastTimeNano = (this.lastTimeNano * 4884895930248422689L + var1 * 1000000L) * 5517121868071460577L;
      }

      if (this.lastTimeNano * 4884895930248422689L < var7) {
         this.lastTimeNano = var7 * 5517121868071460577L;
      }

      field2572 = true;
      return var9;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   @Override
   public void mark(int var1) {
      try {
         this.lastTimeNano = System.nanoTime() * 5517121868071460577L;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ir.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   @Override
   public int wait(int var1, int var2, int var3) {
      return client.field1045 && client.gameState * 1271535343 >= 25 ? this.method5019(var1, var2) : this.method5020(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod201() {
      this.lastTimeNano = System.nanoTime() * 5517121868071460577L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod202() {
      this.lastTimeNano = System.nanoTime() * 5517121868071460577L;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod204(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = 4884895930248422689L * this.lastTimeNano - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      LoginState.method484(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || 4884895930248422689L * this.lastTimeNano < var7)) {
         var9++;
         this.lastTimeNano += -4136469886958519744L * var1;
      }

      if (4884895930248422689L * this.lastTimeNano < var7) {
         this.lastTimeNano = var7 * 5517121868071460577L;
      }

      return var9;
   }

   NanoClock() {
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("gw")
   public static void method5018(long var0) {
      if (var0 > 0L) {
         if (var0 % 10L == 0L) {
            try {
               Thread.sleep(var0 - 1L);
            } catch (InterruptedException var5) {
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var3) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod205(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = 4884895930248422689L * this.lastTimeNano - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      LoginState.method484(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || 4884895930248422689L * this.lastTimeNano < var7)) {
         var9++;
         this.lastTimeNano += -4136469886958519744L * var1;
      }

      if (4884895930248422689L * this.lastTimeNano < var7) {
         this.lastTimeNano = var7 * 5517121868071460577L;
      }

      return var9;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("uq")
   @Override
   public int vmethod209(int var1, int var2) {
      return this.wait(var1, var2, 205232251);
   }
}
