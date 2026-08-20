import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jo")
public class classJO {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field3351 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3349 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3352 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3350 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;)V")
   @ObfuscatedName("ka")
   public static void method6399(classVB var0) {
      if (var0 == null) {
         var0.method11918();
      } else {
         if (var0.field6483 != null) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var2) {
            }

            var0.field6483 = null;
         }
      }
   }

   classJO() throws Throwable {
      throw new Error();
   }
}
