import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qe")
public class classQE {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5311 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final byte field5309 = 0;
   @ObfuscatedName("jl")
   static long field5315;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field5310 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field5313 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5312 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field5314 = 98;

   classQE() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ly")
   static final void method8874(byte var0) {
      try {
         for (PendingSpawn var1 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.last();
            var1 != null;
            var1 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.previous()
         ) {
            if (var0 >= 1) {
               throw new IllegalStateException();
            }

            if (var1.hitpoints * 517473543 == -1) {
               if (var0 >= 1) {
                  throw new IllegalStateException();
               }

               var1.delay = 0;
               WorldMapLabelSize.method7224(Occluder.topLevelWorldView, var1, 1149527128);
            } else {
               var1.remove();
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qe.ly(" + ')');
      }
   }
}
