import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("py")
public class classPY extends RuntimeException {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field5491 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final String field5492 = "m=accountappeal/login.ws";

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("bf")
   static int method9375(byte[] var0, int var1, int var2, int var3) {
      try {
         int var4 = -1;

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 >= -1163656551) {
               throw new IllegalStateException();
            }

            var4 = var4 >>> 8 ^ classXY.field6957[(var4 ^ var0[var5]) & 0xFF];
         }

         return ~var4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "py.bf(" + 41);
      }
   }

   public classPY(String var1, Object[] var2) {
      super(String.format(var1, var2));
   }
}
