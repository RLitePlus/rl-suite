import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rm")
public final class classRM {
   @ObfuscatedName("az")
   String field5808;
   @ObfuscatedName("af")
   String field5807;
   @ObfuscatedName("ae")
   String field5806;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("as")
   public static AbstractArchive field5809;
   @ObfuscatedName("ag")
   boolean field5811;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field5805 = 6;
   @ObfuscatedName("ab")
   boolean field5810;

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("az")
   public static classUU method10129(int var0) {
      try {
         synchronized (classUU.field6382) {
            if (-1618719293 * classUU.field6383 == 0) {
               if (var0 != 1778071523) {
                  throw new IllegalStateException();
               } else {
                  return new classUU();
               }
            } else {
               classUU.method11574(classUU.field6382[(classUU.field6383 -= 943786731) * -1618719293], -1594911430);
               return classUU.field6382[classUU.field6383 * -1618719293];
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "rm.az(" + ')');
      }
   }

   classRM() {
   }
}
