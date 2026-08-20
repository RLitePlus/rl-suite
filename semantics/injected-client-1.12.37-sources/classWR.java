import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wr")
public class classWR {
   @ObfuscatedSignature(descriptor = "Luq;")
   @ObfuscatedName("bd")
   static classUQ field6770;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final String field6769 = "version.dat";

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpi;I)I")
   @ObfuscatedName("xy")
   public static int method12610(PlayerCompositionColorTextureOverride var0, int var1) {
      return 0 == var1 ? var0.field5259 * -292131739 : 10867937 * var0.field5262;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("cj")
   public static int method12611(Buffer var0) {
      return 0 - var0.array[(var0.offset += -1095856699) * 702114061 - 1] & 0xFF;
   }

   classWR() throws Throwable {
      throw new Error();
   }
}
