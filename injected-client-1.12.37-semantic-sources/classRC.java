import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rc")
public class classRC {
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("ae")
   public static final classRC field5641 = new classRC();
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("af")
   public static final classRC field5642 = new classRC();
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("az")
   public static final classRC field5640 = new classRC();
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field5643 = 41;

   classRC() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;I)V")
   @ObfuscatedName("kd")
   public static void method9938(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method2797(var1);
      }

      var0.field1349 = 316561455 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("ae")
   public static int method9937(long var0) {
      try {
         return (int)(var0 >>> 7 & 127L);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rc.ae(" + 41);
      }
   }
}
