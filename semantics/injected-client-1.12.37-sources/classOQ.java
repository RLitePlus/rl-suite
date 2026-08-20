import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oq")
public class classOQ {
   @ObfuscatedSignature(descriptor = "Loq;")
   @ObfuscatedName("az")
   public static final classOQ field5079 = new classOQ();
   @ObfuscatedSignature(descriptor = "Loq;")
   @ObfuscatedName("ae")
   public static final classOQ field5080 = new classOQ();
   @ObfuscatedSignature(descriptor = "Loq;")
   @ObfuscatedName("af")
   public static final classOQ field5081 = new classOQ();
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5082 = 66;

   classOQ() {
   }

   @ObfuscatedSignature(descriptor = "([BZI)Ljava/lang/Object;")
   @ObfuscatedName("az")
   public static Object method8718(byte[] var0, boolean var1, int var2) {
      try {
         if (var0 == null) {
            if (var2 == -1015930584) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0.length > 136) {
            if (var2 == -1015930584) {
               throw new IllegalStateException();
            } else {
               classZW var3 = new classZW();
               var3.vmethod659(var0, 473372216);
               return var3;
            }
         } else if (var1) {
            if (var2 == -1015930584) {
               throw new IllegalStateException();
            } else {
               return classLP.method7141(var0, -294964312);
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "oq.az(" + ')');
      }
   }
}
