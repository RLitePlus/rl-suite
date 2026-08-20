import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("op")
public class class376 {
   @ObfuscatedName("aj")
   public Object[] field4683;
   @ObfuscatedSignature(descriptor = "Lom;")
   @ObfuscatedName("at")
   class372 field4677;
   @ObfuscatedName("ak")
   public Object[] field4684;
   @ObfuscatedName("an")
   public Object[] field4685;
   @ObfuscatedName("ae")
   public Object[] field4682;
   @ObfuscatedSignature(descriptor = "Lbg;")
   @ObfuscatedName("ag")
   class28 field4679;
   @ObfuscatedSignature(descriptor = "Loo;")
   @ObfuscatedName("av")
   public classOO field4678 = new classOO();
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field4681 = 31;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field4680 = 0;

   @ObfuscatedSignature(descriptor = "(Lof;B)V")
   @ObfuscatedName("nk")
   public static void invalidateWidget(Widget var0, byte var1) {
      try {
         if (var0 != null) {
            if (var1 != 5) {
               throw new IllegalStateException();
            }

            if (-1014314483 * client.field886 == var0.cycle * -728739761) {
               if (var1 != 5) {
                  throw new IllegalStateException();
               }

               client.validRootWidgets[321882055 * var0.rootIndex] = true;
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "op.nk(" + ')');
      }
   }

   class376() {
      this.field4677 = new class372();
      this.field4679 = new class28();
   }
}
