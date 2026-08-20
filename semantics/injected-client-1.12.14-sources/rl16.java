import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl16")
class rl16 {
   @ObfuscatedName("so")
   public List field5567;
   @ObfuscatedName("mz")
   public boolean field5574;
   @ObfuscatedName("ul")
   public int field5571;
   @ObfuscatedName("yo")
   public int field5573;
   @ObfuscatedName("qp")
   public int field5565;
   @ObfuscatedName("sv")
   public int field5570;
   @ObfuscatedName("if")
   public int field5569;
   @ObfuscatedName("tc")
   public int field5564 = 1024;
   @ObfuscatedName("yq")
   public List field5566;
   @ObfuscatedName("yf")
   public int field5572;
   @ObfuscatedName("ez")
   public int field5568;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqq;Ljava/util/Comparator;Z)V")
   @ObfuscatedName("th")
   public static void method9543(GrandExchangeEvents var0, Comparator var1, boolean var2) {
      if (var0 == null) {
         var0.method9141(var1, var2);
      }

      if (var2) {
         Collections.sort(var0.events, var1);
      } else {
         Collections.sort(var0.events, Collections.reverseOrder(var1));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;II)V")
   @ObfuscatedName("uf")
   public static void method9544(Player var0, int var1, int var2) {
      var0.pathX[0] = var1;
      var0.pathY[0] = var2;
      var0.pathLength = 0;
   }

   public rl16() {
      this.field5565 = 1024;
      this.field5566 = new ArrayList();
      this.field5567 = new ArrayList();
   }
}
