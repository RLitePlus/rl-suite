import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ok")
public class class389 {
   @ObfuscatedSignature(descriptor = "Ljx;")
   @ObfuscatedName("as")
   static Clock clock;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4634 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4635 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4633 = 64;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)Z")
   @ObfuscatedName("lt")
   public static boolean method8342(AnimationSequence var0) {
      return var0.sequenceDefinition != null;
   }

   static {
      Math.sqrt(8192.0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;II)Z")
   @ObfuscatedName("uw")
   public static boolean method8343(WorldMapArea var0, int var1, int var2) {
      int var3 = var1 / -436213099;
      int var4 = var2 / 474654213;
      if (var3 >= 972064699 * var0.regionLowX && var3 <= 1260902774 * var0.regionHighX) {
         if (var4 >= -2082424362 * var0.regionLowY && var4 <= 792780803 * var0.regionHighY) {
            for (WorldMapSection var6 : var0.sections) {
               if (var6.containsPosition(var1, var2, -2010078472)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   class389() throws Throwable {
      throw new Error();
   }
}
