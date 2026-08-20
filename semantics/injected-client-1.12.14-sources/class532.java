import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class532 implements Enum {
   @ObfuscatedName("aj")
   final int field6057;
   @ObfuscatedSignature(descriptor = "Luh;")
   @ObfuscatedName("at")
   static final class532 field6061 = new class532(1, 2);
   @ObfuscatedSignature(descriptor = "Luh;")
   @ObfuscatedName("ag")
   static final class532 field6060 = new class532(2, 3);
   @ObfuscatedSignature(descriptor = "Luh;")
   @ObfuscatedName("an")
   static final class532 field6062 = new class532(0, 10);
   @ObfuscatedName("kb")
   static int js5Port;
   @ObfuscatedName("ae")
   final int field6058;
   @ObfuscatedSignature(descriptor = "Luh;")
   @ObfuscatedName("av")
   static final class532 field6059 = new class532(3, 1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 695919697 * this.field6057;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 695919697 * this.field6057;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "uh.av(" + 41);
      }
   }

   class532(int var1, int var2) {
      this.field6058 = -1567229411 * var1;
      this.field6057 = var2 * -1213143887;
   }

   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;III)V")
   @ObfuscatedName("ak")
   public static void method11167(DynamicArray var0, Object var1, int var2, int var3, int var4) {
      try {
         class461.method9338(var0, null, true, -928498657);
         if (var2 < 0) {
            var2 = 0;
         }

         int var5;
         label43: {
            var5 = var3 + var2;
            if (var3 >= 0) {
               if (var4 >= -1456381367) {
                  throw new IllegalStateException();
               }

               if (var5 >= 0) {
                  if (var4 >= -1456381367) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= var0.method11215((byte)41)) {
                     break label43;
                  }

                  if (var4 >= -1456381367) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = var0.method11215((byte)121);
         }

         if (class586.field6376 == var0.field6107) {
            Arrays.fill(var0.method11207(2053374425), var2, var5, ((Integer)var1).intValue());
         } else if (var0.field6107 == class586.field6377) {
            Arrays.fill(DynamicArray.method11211(var0, (byte)-86), var2, var5, ((Long)var1).longValue());
         } else {
            Arrays.fill(var0.method11214((byte)-102), var2, var5, var1);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "uh.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 695919697 * this.field6057;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 883997387 * this.field6057;
   }

   @ObfuscatedSignature(descriptor = "(IIS)I")
   @ObfuscatedName("ky")
   static int method11168(int var0, int var1, short var2) {
      try {
         int var3 = var1 - 334;
         if (var3 < 0) {
            var3 = 0;
         } else if (var3 > 100) {
            if (var2 != 4036) {
               throw new IllegalStateException();
            }

            var3 = 100;
         }

         int var4 = client.zoomHeight + var3 * (client.zoomWidth - client.zoomHeight) / 100;
         return var0 * var4 / 256;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uh.ky(" + 41);
      }
   }
}
