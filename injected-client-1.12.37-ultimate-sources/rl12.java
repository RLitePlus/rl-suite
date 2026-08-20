import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl12")
class rl12 extends ComponentAdapter {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Z")
   @ObfuscatedName("qs")
   public static boolean method10044(classPL var0) {
      return var0.field5330 != null && null != var0.field5331;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.field5696.field6220 = this.field5696.field6219.getSize();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("th")
   public static int method10043(classDH var0) {
      return 635707271 * var0.field1463.field631;
   }

   public rl12(classTQ var1) {
      this.field5696 = var1;
   }
}
