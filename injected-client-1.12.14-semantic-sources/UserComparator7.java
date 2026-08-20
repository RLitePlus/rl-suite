import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("av")
   final boolean reversed;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;B)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, byte var3) {
      try {
         if (0 == 1914416777 * var1.world || var2.world * 1914416777 == 0) {
            return this.compareUser(var1, var2, (byte)-70);
         } else if (var3 >= 0) {
            throw new IllegalStateException();
         } else {
            return this.reversed ? var1.int2 * -529820201 - -529820201 * var2.int2 : var2.int2 * -529820201 - -529820201 * var1.int2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eh.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)-25);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "eh.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aw")
   int method3726(Buddy var1, Buddy var2) {
      if (0 != 1914416777 * var1.world && var2.world * 1914416777 != 0) {
         return this.reversed ? var1.int2 * -529820201 - -529820201 * var2.int2 : var2.int2 * -529820201 - -529820201 * var1.int2;
      } else {
         return this.compareUser(var1, var2, (byte)-35);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3729(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)-112);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3727(Buddy var1, Buddy var2) {
      if (0 != 1914416777 * var1.world && var2.world * 1914416777 != 0) {
         return this.reversed ? var1.int2 * -529820201 - -529820201 * var2.int2 : var2.int2 * -529820201 - -529820201 * var1.int2;
      } else {
         return this.compareUser(var1, var2, (byte)-21);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method3728(Buddy var1, Buddy var2) {
      if (0 != 425824701 * var1.world && var2.world * 1619045845 != 0) {
         return this.reversed ? var1.int2 * 855130885 - 1048169598 * var2.int2 : var2.int2 * -529820201 - -529820201 * var1.int2;
      } else {
         return this.compareUser(var1, var2, (byte)-84);
      }
   }

   public UserComparator7(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public static void method3731(int var0) {
      try {
         try {
            BufferedFile.method11849(JagexCache.JagexCache_dat2File, (short)-23941);

            for (int var1 = 0; var1 < -808607155 * class134.field1817; var1++) {
               if (var0 >= 1502687808) {
                  throw new IllegalStateException();
               }

               BufferedFile.method11849(UserComparator9.JagexCache_idxFiles[var1], (short)-7966);
            }

            BufferedFile.method11849(JagexCache.JagexCache_idx255File, (short)-11128);
            BufferedFile.method11849(JagexCache.JagexCache_randomDat, (short)-20245);
         } catch (Exception var2) {
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "eh.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method3730(int var0) {
      try {
         ObjectComposition.ObjectDefinition_cached.clear();
         ObjectComposition.ObjectDefinition_cachedModelData.clear();
         ObjectComposition.ObjectDefinition_cachedEntities.clear();
         ObjectComposition.ObjectDefinition_cachedModels.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "eh.at(" + ')');
      }
   }
}
