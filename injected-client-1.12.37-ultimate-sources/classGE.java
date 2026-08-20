import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ge")
public interface classGE {
   @ObfuscatedSignature(descriptor = "(IB)Low;")
   @ObfuscatedName("az")
   classOW vmethod463(int var1, byte var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("wx")
   static int method5402(classNA var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method7752(var1, var1);
      }

      return var0.method7748((classNM)var1, (classNM)var2, 1823600506);
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("af")
   classOW vmethod464(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;I)V")
   @ObfuscatedName("wi")
   static void method5403(classWM var0, int var1) {
      if (var0 == null) {
         var0.method12554();
      }

      if (var1 >= 1) {
         var0.field6702 = -1724580097 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("ae")
   classOW vmethod465(int var1);
}
