import net.runelite.api.WidgetNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pk")
public class classPK extends classVQ implements WidgetNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5275 = 14;
   @ObfuscatedName("af")
   public int field5276;
   @ObfuscatedName("ae")
   public boolean field5274 = false;
   @ObfuscatedName("az")
   public int field5277;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field5278 = 29;
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("gw")
   static classAAO field5279;
   @ObfuscatedName("ky")
   static boolean field5280;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)Llw;")
   @ObfuscatedName("ac")
   public static classLW method8928(classVW var0) {
      return var0.field6625;
   }

   public int getModalMode() {
      return this.field5277 * -691218541;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrr;)Laae;")
   @ObfuscatedName("zy")
   public static classAAE method8927(classRR var0) {
      return var0.field5835;
   }

   public int getId() {
      return this.field5276 * 2023647411;
   }

   classPK() {
   }
}
