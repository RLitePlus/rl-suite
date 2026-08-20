import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ne")
public final class classNE {
   @ObfuscatedSignature(descriptor = "Lzv;")
   @ObfuscatedName("dh")
   public static classZV field4667;
   @ToRemove(unused = "true")
   @ObfuscatedName("ci")
   public static final int field4666 = 96;

   @ObfuscatedSignature(descriptor = "(IB)Lpn;")
   @ObfuscatedName("af")
   public static classPN method7829(int var0, byte var1) {
      try {
         classPN var2 = (classPN)classPN.field5350.method6422(var0);
         if (null != var2) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classPN.field5362.method11867(11, var0, -908610794);
            var2 = new classPN(new classXY(var3), var0);
            classPN.field5350.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ne.af(" + ')');
      }
   }

   classNE() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public static int method7828(int var0, int var1) {
      try {
         return classKG.method6472(-2041997219) - var0 & classCS.method2576(-1520924805);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ne.as(" + 41);
      }
   }
}
