import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mg")
public class classMG extends classMH {
   @ObfuscatedName("nn")
   public static boolean field4503;
   @ObfuscatedName("sb")
   public long field4501;
   @ObfuscatedName("yu")
   public static double field4500;
   @ObfuscatedName("xu")
   public long field4502;
   @ObfuscatedName("az")
   long field4499 = System.nanoTime() * -8688469985774214489L;

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("zd")
   public static void method7567(long var0) {
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
   @ObfuscatedName("rj")
   public int method7566(int var1, int var2) {
      long var3 = System.nanoTime();
      field4503 = true;
      if (client.field1028 > 0L) {
         long var5 = this.field4499 * 7670220157275514135L - var3;
         long var7 = this.field4501 - var3;
         long var9 = Math.min(var5, var7);
         var9 /= 1000000L;
         method7567(var9);
         var3 = System.nanoTime();
         if (var3 < this.field4499 * 7670220157275514135L && var5 > var7) {
            field4503 = false;
         } else {
            this.field4499 = (this.field4499 * 7670220157275514135L + client.field1028) * -8688469985774214489L;
            if (this.field4499 * 7670220157275514135L < var3) {
               this.field4499 = var3 * -8688469985774214489L;
            }
         }
      }

      long var11 = 1000000L * var1;

      int var12;
      for (var12 = 0; var12 < 10 && (var12 < 1 && !field4503 || this.field4501 < var3); this.field4501 += var11) {
         var12++;
         this.field4502 = this.field4501;
      }

      if (this.field4501 < var3) {
         this.field4501 = var3;
      }

      field4500 = (double)Math.min(var3 - this.field4502, var11) / var11;
      return var12;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   @Override
   public int vmethod533(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = 7670220157275514135L * this.field4499 - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      classRP.method10149(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || this.field4499 * 7670220157275514135L < var7)) {
         var9++;
         this.field4499 += var1 * 1813175205450790848L;
      }

      if (this.field4499 * 7670220157275514135L < var7) {
         this.field4499 = var7 * -8688469985774214489L;
      }

      return var9;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod530(byte var1) {
      try {
         this.field4499 = System.nanoTime() * -8688469985774214489L;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mg.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod535(int var1, int var2, int var3) {
      return client.field1142 && client.field828 * -44590225 >= 25 ? this.method7566(var1, var2) : this.method7568(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod534(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = 7670220157275514135L * this.field4499 - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      classRP.method10149(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || this.field4499 * 7670220157275514135L < var7)) {
         var9++;
         this.field4499 += var1 * 1813175205450790848L;
      }

      if (this.field4499 * 7670220157275514135L < var7) {
         this.field4499 = var7 * -8688469985774214489L;
      }

      return var9;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("gj")
   public int method7568(int var1, int var2) {
      long var3 = 1000000L * var2;
      long var5 = this.field4499 * 7670220157275514135L - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      method7567(var5 / 1000000L);
      long var7 = System.nanoTime();
      int var9 = 0;

      while (var9 < 10 && (var9 < 1 || this.field4499 * 7670220157275514135L < var7)) {
         var9++;
         this.field4499 = (this.field4499 * 7670220157275514135L + var1 * 1000000L) * -8688469985774214489L;
      }

      if (this.field4499 * 7670220157275514135L < var7) {
         this.field4499 = var7 * -8688469985774214489L;
      }

      field4503 = true;
      return var9;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod531() {
      this.field4499 = System.nanoTime() * -8688469985774214489L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lex;)V")
   @ObfuscatedName("bv")
   public static void method7565(classEZ var0, classEX var1) {
      if (var1 != var0.field2052) {
         var0.field2052 = var1;
         classEZ.method4304(classEZ.field2072, classEZ.field2130, classEZ.field2126, classEZ.field2135, classEZ.field2131);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod532() {
      this.field4499 = System.nanoTime() * -8688469985774214489L;
   }

   classMG() {
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ol")
   @Override
   public int vmethod536(int var1, int var2) {
      return this.vmethod535(var1, var2, -1162884564);
   }
}
