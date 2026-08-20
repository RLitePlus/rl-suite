import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bx")
public class class50 {
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   public static final int field427 = 74;
   @ObfuscatedName("at")
   static final BigInteger field425 = new BigInteger(
      "a6a2290023a892f09b33e0be1efaafcf9a1eca20f9af373ae1db3b51fd83e807b5c71470bebe73d392cdd0f144ca4144973d32074a3282f5edf68516ea6eb84c3d83e152faa25e38d77a48030c06a3c59df491b6de99f6c329bcf999f36c131095b13fa5a07c96d4211618f31929b58c7b8a26e8bb1ab28c8d91ba7dbd73e86b",
      16
   );
   @ObfuscatedSignature(descriptor = "Ldr;")
   @ObfuscatedName("nb")
   static PcmStreamMixer pcmStreamMixer;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field426 = 1023;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cg")
   static IndexedSprite logoSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("ch")
   static final int field428 = 1007;
   @ObfuscatedName("av")
   static final BigInteger field424 = new BigInteger("10001", 16);

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("jo")
   static void method1290(byte var0) {
      try {
         if (340712311 * class330.localPlayer.x >> 7 == client.destinationX * 1612605821) {
            if (var0 >= 6) {
               throw new IllegalStateException();
            }

            if (class330.localPlayer.y * -1747310679 >> 7 == 1329452211 * client.destinationY) {
               if (var0 >= 6) {
                  throw new IllegalStateException();
               }

               client.destinationX = 0;
            }
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bx.jo(" + ')');
      }
   }

   class50() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bh")
   static int method1291(int var0, Script var1, boolean var2, int var3) {
      try {
         if (5630 == var0) {
            if (var3 != -343906879) {
               throw new IllegalStateException();
            } else {
               client.logoutTimer = 485255766;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bx.bh(" + 41);
      }
   }
}
