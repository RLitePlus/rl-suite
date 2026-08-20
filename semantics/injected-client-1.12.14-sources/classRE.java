import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("re")
public final class classRE {
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field5509 = 22;
   @ToRemove(unused = "true")
   @ObfuscatedName("dv")
   public static final int field5510 = 102;

   classRE() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ad")
   static int method9417(int var0, int var1, byte var2) {
      try {
         for (int var3 = 0; var3 < 8; var3++) {
            if (var1 <= var0 + 30) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return var3;
            }

            byte var10001;
            label36: {
               var0 += 30;
               if (1 != var3) {
                  if (3 != var3) {
                     var10001 = 5;
                     break label36;
                  }

                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               var10001 = 20;
            }

            var0 += var10001;
         }

         return 0;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "re.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ab")
   static final int method9418(int var0, int var1, int var2) {
      try {
         int var3 = 57 * var1 + var0;
         var3 = var3 << 13 ^ var3;
         int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & 2147483647;
         return var4 >> 19 & 0xFF;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "re.ab(" + 41);
      }
   }
}
