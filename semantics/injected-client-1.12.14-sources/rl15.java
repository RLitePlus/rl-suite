import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl15")
class rl15 implements Comparator {
   @ObfuscatedSignature(descriptor = "Lka;")
   @ObfuscatedName("gz")
   public static Projection field5563;

   @ObfuscatedSignature(descriptor = "(Lkd;Lkd;)I")
   @ObfuscatedName("ww")
   public int method9542(GameObject var1, GameObject var2) {
      return Integer.compare(method9541(var2), method9541(var1));
   }

   @ObfuscatedSignature(descriptor = "(Lkd;)I")
   @ObfuscatedName("nz")
   public static int method9541(GameObject var0) {
      int var1 = (int)field5563.project(var0.centerX * 1204024827, var0.z * 683703035, var0.centerY * 1465977803)[2];
      if (var0.renderable == class330.localPlayer) {
         var1 -= 12;
      }

      return var1;
   }

   public rl15() {
   }
}
