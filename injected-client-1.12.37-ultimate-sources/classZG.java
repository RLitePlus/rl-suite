import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zg")
public interface classZG {
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("hv")
   static void method13998(classFX var0) {
      if (var0 == null) {
         var0.method5142();
      }

      var0.field2489 = 0;
      var0.field2497 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Z")
   @ObfuscatedName("so")
   static boolean method13997(classVV var0, classLW var1) {
      return var0.field6617 == var1;
   }
}
