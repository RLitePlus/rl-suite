import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lf")
public class WorldMapID {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field3662 = 25;
   @ObfuscatedSignature(descriptor = "Llf;")
   @ObfuscatedName("at")
   static final WorldMapID field3659 = new WorldMapID(1);
   @ObfuscatedName("ag")
   final int value;
   @ToRemove(unused = "true")
   @ObfuscatedName("eo")
   static final int field3664 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field3663 = 55;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field3661 = 8;
   @ObfuscatedSignature(descriptor = "Llf;")
   @ObfuscatedName("av")
   static final WorldMapID field3658 = new WorldMapID(0);

   WorldMapID(int var1) {
      this.value = var1 * -1026994245;
   }

   @ObfuscatedSignature(descriptor = "(I)[Lfu;")
   @ObfuscatedName("ae")
   static class147[] method7173(int var0) {
      try {
         return new class147[]{
            class147.field1889,
            class147.field1891,
            class147.field1892,
            class147.field1895,
            class147.field1893,
            class147.field1894,
            class147.field1890,
            class147.field1896,
            class147.field1897
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lf.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[IIII)V")
   @ObfuscatedName("an")
   public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 <= 271277833) {
               return;
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 <= 271277833) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var4 <= 271277833) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 <= 271277833) {
                     return;
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 <= 271277833) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var6 - 1, 1105965894);
            quicksortStringsWithCorrespondingIntegers(var0, var1, 1 + var6, var3, 1114144277);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "lf.an(" + ')');
      }
   }
}
