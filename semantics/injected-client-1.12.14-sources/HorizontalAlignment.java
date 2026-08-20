import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hl")
public class HorizontalAlignment implements Enum {
   @ObfuscatedSignature(descriptor = "Lhl;")
   @ObfuscatedName("ag")
   static final HorizontalAlignment field2252 = new HorizontalAlignment(2, 2);
   @ObfuscatedName("ar")
   static int field2257;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2256 = 16776960;
   @ObfuscatedName("an")
   public final int value;
   @ObfuscatedName("ae")
   final int id;
   @ObfuscatedSignature(descriptor = "Lhl;")
   @ObfuscatedName("at")
   static final HorizontalAlignment HorizontalAlignment_centered = new HorizontalAlignment(0, 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2255 = 20;
   @ObfuscatedSignature(descriptor = "Lhl;")
   @ObfuscatedName("av")
   static final HorizontalAlignment field2250 = new HorizontalAlignment(1, 0);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * -942244898;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;)V")
   @ObfuscatedName("ug")
   public static void method4599(UserList var0) {
      if (var0 == null) {
         var0.getCount();
      }

      var0.comparator = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * -61043722;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * -1843110241;
   }

   HorizontalAlignment(int var1, int var2) {
      this.value = var1 * -1347635445;
      this.id = var2 * -1164648595;
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("ae")
   public static int Entity_unpackID(long var0) {
      try {
         return (int)(var0 >>> 20 & 4294967295L);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hl.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * -1149697435;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hl.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;III)V")
   @ObfuscatedName("ai")
   public static void method4600(long[] var0, Object[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 >= 1930713103) {
               return;
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            byte var10000;
            if (var7 == Long.MAX_VALUE) {
               if (var4 >= 1930713103) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var10 = var10000;

            for (int var11 = var2; var11 < var3; var11++) {
               if (var4 >= 1930713103) {
                  throw new IllegalStateException();
               }

               if (var0[var11] < var7 + (var11 & var10)) {
                  long var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  Object var14 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var14;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method4600(var0, var1, var2, var6 - 1, 941525808);
            method4600(var0, var1, 1 + var6, var3, 1169482529);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "hl.ai(" + ')');
      }
   }
}
