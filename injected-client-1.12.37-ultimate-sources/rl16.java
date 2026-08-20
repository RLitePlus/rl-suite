import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl16")
class rl16 implements Comparator {
   @ObfuscatedSignature(descriptor = "Lfv;")
   @ObfuscatedName("uk")
   public static classFV field5702;

   @ObfuscatedSignature(descriptor = "(Lfb;Lfb;)I")
   @ObfuscatedName("ua")
   public int method10053(classFB var1, classFB var2) {
      return Integer.compare(method10054(var2), method10054(var1));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwy;)Ljava/lang/String;")
   @ObfuscatedName("xz")
   public static String method10052(classWY var0) {
      return var0.field6790;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;)I")
   @ObfuscatedName("kd")
   public static int method10054(classFB var0) {
      int var1 = (int)field5702.project(var0.field2195 * -1405731525, var0.field2190 * 1269801851, var0.field2196 * -1706390585)[2];
      if (var0.field2200 == classDC.field1393) {
         var1 -= 12;
      }

      return var1;
   }

   public rl16() {
   }
}
