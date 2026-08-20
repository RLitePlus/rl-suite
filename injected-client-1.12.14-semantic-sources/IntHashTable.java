import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public class IntHashTable {
   @ObfuscatedName("av")
   int[] array;
   @ObfuscatedName("aj")
   public static int[] SpriteBuffer_spriteWidths;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method10485(int var1) {
      int var2 = (this.array.length >> 1) - 1;
      int var3 = var1 & var2;

      while (true) {
         int var4 = this.array[var3 + var3 + 1];
         if (var4 == -1) {
            return -1;
         }

         if (this.array[var3 + var3] == var1) {
            return var4;
         }

         var3 = var3 + 1 & var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public int get(int var1, int var2) {
      try {
         int var3 = (this.array.length >> 1) - 1;
         int var4 = var1 & var3;

         while (true) {
            int var5 = this.array[var4 + var4 + 1];
            if (var5 == -1) {
               if (var2 != 1123379343) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if (this.array[var4 + var4] == var1) {
               if (var2 != 1123379343) {
                  throw new IllegalStateException();
               }

               return var5;
            }

            var4 = var4 + 1 & var3;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "sn.av(" + 41);
      }
   }

   public IntHashTable(int[] var1) {
      byte var2 = 1;

      while (var2 <= var1.length + (var1.length >> 1)) {
         var2 <<= 1;
      }

      this.array = new int[var2 + var2];

      for (int var3 = 0; var3 < var2 + var2; var3++) {
         this.array[var3] = -1;
      }

      int var5 = 0;

      while (var5 < var1.length) {
         int var4 = var1[var5] & var2 - 1;

         while (-1 != this.array[1 + var4 + var4]) {
            var4 = var4 + 1 & var2 - 1;
         }

         this.array[var4 + var4] = var1[var5];
         this.array[1 + var4 + var4] = var5++;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method10487(int var1) {
      int var2 = (this.array.length >> 1) - 1;
      int var3 = var1 & var2;

      while (true) {
         int var4 = this.array[var3 + var3 + 1];
         if (var4 == -1) {
            return -1;
         }

         if (this.array[var3 + var3] == var1) {
            return var4;
         }

         var3 = var3 + 1 & var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;IIIII)V")
   @ObfuscatedName("aw")
   public static void method10488(DynamicArray var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         ArchiveDiskActionHandler.method8886(var0, class586.field6376, 1876499627);
         if (var3 < 0) {
            if (var5 != 1461486816) {
               return;
            }

            var3 = 0;
         }

         int var6;
         label51: {
            var6 = var4 + var3;
            if (var4 >= 0) {
               if (var5 != 1461486816) {
                  throw new IllegalStateException();
               }

               if (var6 >= 0) {
                  if (var5 != 1461486816) {
                     return;
                  }

                  if (var6 <= var0.method11215((byte)66)) {
                     break label51;
                  }

                  if (var5 != 1461486816) {
                     return;
                  }
               }
            }

            var6 = var0.method11215((byte)117);
         }

         int[] var7 = var0.method11207(2053374425);
         int var8 = var1;

         for (int var9 = var3; var9 < var6; var9++) {
            var7[var9] = var8;
            var8 += var2;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "sn.aw(" + ')');
      }
   }
}
