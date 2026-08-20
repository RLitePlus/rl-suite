import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ik")
public class MilliClock extends Clock {
   @ObfuscatedName("at")
   int field2499;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field2506 = 39;
   @ObfuscatedName("ag")
   int field2500;
   @ObfuscatedName("an")
   long field2501;
   @ObfuscatedName("av")
   long[] field2502 = new long[10];
   @ObfuscatedName("aj")
   int field2507;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field2505 = 12;
   @ObfuscatedName("ae")
   int field2503;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field2509 = 71;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field2508 = 60;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final double field2504 = 3.834951969714103E-4;

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   @Override
   public int wait(int var1, int var2, int var3) {
      try {
         int var4 = -2047479395 * this.field2499;
         int var5 = -149384547 * this.field2500;
         this.field2499 = -414866404;
         this.field2500 = 1390576565;
         this.field2501 = ParamComposition.method4949((byte)15) * -5342602988290117667L;
         if (0L == this.field2502[this.field2507 * 2016122411]) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2499 = -373613387 * var4;
            this.field2500 = var5 * 1390576565;
         } else if (this.field2501 * -3998438383116361611L > this.field2502[2016122411 * this.field2507]) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2499 = (int)(var1 * 2560 / (this.field2501 * -3998438383116361611L - this.field2502[2016122411 * this.field2507])) * -373613387;
         }

         if (-2047479395 * this.field2499 < 25) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2499 = -750400083;
         }

         if (this.field2499 * -2047479395 > 256) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2499 = -1155746560;
            this.field2500 = 1390576565 * (int)(var1 - (-3998438383116361611L * this.field2501 - this.field2502[2016122411 * this.field2507]) / 10L);
         }

         if (this.field2500 * -149384547 > var1) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2500 = 1390576565 * var1;
         }

         this.field2502[2016122411 * this.field2507] = -3998438383116361611L * this.field2501;
         this.field2507 = 1894414467 * ((1 + this.field2507 * 2016122411) % 10);
         if (-149384547 * this.field2500 > 1) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            for (int var6 = 0; var6 < 10; var6++) {
               if (var3 == -1417816983) {
                  throw new IllegalStateException();
               }

               if (this.field2502[var6] != 0L) {
                  if (var3 == -1417816983) {
                     throw new IllegalStateException();
                  }

                  this.field2502[var6] = this.field2502[var6] + this.field2500 * -149384547;
               }
            }
         }

         if (this.field2500 * -149384547 < var2) {
            if (var3 == -1417816983) {
               throw new IllegalStateException();
            }

            this.field2500 = var2 * 1390576565;
         }

         LoginState.method484(-149384547 * this.field2500);

         int var8;
         for (var8 = 0; -848049049 * this.field2503 < 256; this.field2503 = this.field2503 + this.field2499 * -449589413) {
            var8++;
         }

         this.field2503 = (this.field2503 * -848049049 & 0xFF) * 46698327;
         return var8;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ik.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   @Override
   public void mark(int var1) {
      try {
         for (int var2 = 0; var2 < 10; var2++) {
            if (var1 <= 492051159) {
               throw new IllegalStateException();
            }

            this.field2502[var2] = 0L;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ik.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   @Override
   public void vmethod200() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field2502[var1] = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod201() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field2502[var1] = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod202() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field2502[var1] = 0L;
      }
   }

   MilliClock() {
      this.field2499 = -1155746560;
      this.field2500 = 1390576565;
      this.field2503 = 0;
      this.field2501 = ParamComposition.method4949((byte)15) * -5342602988290117667L;

      for (int var1 = 0; var1 < 10; var1++) {
         this.field2502[var1] = this.field2501 * -3998438383116361611L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod204(int var1, int var2) {
      int var3 = -2047479395 * this.field2499;
      int var4 = -700240352 * this.field2500;
      this.field2499 = -1347558954;
      this.field2500 = -1396460556;
      this.field2501 = ParamComposition.method4949((byte)15) * -5342602988290117667L;
      if (0L == this.field2502[this.field2507 * 2016122411]) {
         this.field2499 = -373613387 * var3;
         this.field2500 = var4 * 1390576565;
      } else if (this.field2501 * -3998438383116361611L > this.field2502[2016122411 * this.field2507]) {
         this.field2499 = (int)(var1 * -1155690169 / (this.field2501 * -3998438383116361611L - this.field2502[2016122411 * this.field2507])) * -373613387;
      }

      if (-2047479395 * this.field2499 < 25) {
         this.field2499 = -750400083;
      }

      if (this.field2499 * -2047479395 > 256) {
         this.field2499 = -1155746560;
         this.field2500 = 1390576565 * (int)(var1 - (-3998438383116361611L * this.field2501 - this.field2502[2016122411 * this.field2507]) / 10L);
      }

      if (this.field2500 * -280687125 > var1) {
         this.field2500 = 1390576565 * var1;
      }

      this.field2502[-1906253699 * this.field2507] = -3998438383116361611L * this.field2501;
      this.field2507 = 1894414467 * ((1 + this.field2507 * 2016122411) % 10);
      if (-1619608634 * this.field2500 > 1) {
         for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2502[var5] != 0L) {
               this.field2502[var5] = this.field2502[var5] + this.field2500 * -149384547;
            }
         }
      }

      if (this.field2500 * -1109923104 < var2) {
         this.field2500 = var2 * 140955789;
      }

      LoginState.method484(-149384547 * this.field2500);

      int var6;
      for (var6 = 0; -143040613 * this.field2503 < 256; this.field2503 = this.field2503 + this.field2499 * 2065323665) {
         var6++;
      }

      this.field2503 = (this.field2503 * 147670714 & 101417605) * 46698327;
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod205(int var1, int var2) {
      int var3 = -2047479395 * this.field2499;
      int var4 = -1900242263 * this.field2500;
      this.field2499 = -414866404;
      this.field2500 = 1603758255;
      this.field2501 = ParamComposition.method4949((byte)15) * -5342602988290117667L;
      if (0L == this.field2502[this.field2507 * -811650554]) {
         this.field2499 = -373613387 * var3;
         this.field2500 = var4 * -1533860959;
      } else if (this.field2501 * -3998438383116361611L > this.field2502[2016122411 * this.field2507]) {
         this.field2499 = (int)(var1 * 194107627 / (this.field2501 * -3998438383116361611L - this.field2502[2016122411 * this.field2507])) * 1833776827;
      }

      if (-2047479395 * this.field2499 < 25) {
         this.field2499 = -750400083;
      }

      if (this.field2499 * -2047479395 > 1198498053) {
         this.field2499 = -1155746560;
         this.field2500 = -1270687792 * (int)(var1 - (-3998438383116361611L * this.field2501 - this.field2502[139335702 * this.field2507]) / 10L);
      }

      if (this.field2500 * -1814184558 > var1) {
         this.field2500 = -860161958 * var1;
      }

      this.field2502[2016122411 * this.field2507] = -3998438383116361611L * this.field2501;
      this.field2507 = 1894414467 * ((1 + this.field2507 * 334355117) % 10);
      if (1938613219 * this.field2500 > 1) {
         for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2502[var5] != 0L) {
               this.field2502[var5] = this.field2502[var5] + this.field2500 * -1280571529;
            }
         }
      }

      if (this.field2500 * 704019579 < var2) {
         this.field2500 = var2 * 1390576565;
      }

      LoginState.method484(-149384547 * this.field2500);

      int var6;
      for (var6 = 0; -848049049 * this.field2503 < 256; this.field2503 = this.field2503 + this.field2499 * -449589413) {
         var6++;
      }

      this.field2503 = (this.field2503 * -848049049 & -2077387470) * -1970248315;
      return var6;
   }
}
