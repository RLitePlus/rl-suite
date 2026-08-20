import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public abstract class classAW extends Node {
   @ObfuscatedName("ax")
   int field295;

   @ObfuscatedSignature(descriptor = "(Lvt;II)Ljava/lang/String;")
   @ObfuscatedName("pe")
   public static String method723(PlatformInfo var0, int var1, int var2) {
      if (var0 == null) {
         var0.getDeviceId(var1, var1);
      }

      return "12345678-0000-0000-0000-123456789012";
   }

   classAW() {
   }
}
