import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ks")
public class classKS {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field4014 = 65536;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4013 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4015 = 0;

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("aa")
   public static final void method6559(int var0, int var1, byte var2) {
      try {
         classFO.field2349 = var0 * -750923805;
         classFO.field2348 = var1 * 1000488527;
         classFO.field2352 = true;
         classFO.field2350 = 0;
         classFO.field2351[0] = -1L;
         classFO.field2347[0] = Integer.MAX_VALUE;
         classFO.field2346 = false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ks.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/StringBuilder;Lqi;B)V")
   @ObfuscatedName("ab")
   static void method6560(String var0, StringBuilder var1, classQI var2, byte var3) {
      try {
         String[] var4 = var0.split("=");
         if (1 == var4.length) {
            if (var3 <= -1) {
               return;
            }

            var4 = var0.split(":");
            long var5 = classQI.method9568(var2, var4[0], (byte)-1);
            String var7 = Long.toString(var5);
            var1.append(var7);
         } else {
            var2.method9553(var4[0], var4[1], 598319735);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ks.ab(" + ')');
      }
   }

   classKS() throws Throwable {
      throw new Error();
   }
}
