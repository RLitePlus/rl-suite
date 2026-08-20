import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qv")
public interface classQV {
   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("kp")
   void vmethod15(classOU var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ag")
   void vmethod14(classOU var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("vm")
   static void method9825(classDN var0) {
      if (var0 == null) {
         var0.vmethod279();
      }

      var0.field1585 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)[S")
   @ObfuscatedName("lg")
   static short[] method9826(classPL var0) {
      return var0.field5331;
   }

   @ObfuscatedSignature(descriptor = "(Lou;II)V")
   @ObfuscatedName("az")
   void vmethod13(classOU var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ae")
   void vmethod17(classOU var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;II)I")
   @ObfuscatedName("du")
   static int method9827(classOM var0, int var1, int var2) {
      return classGQ.method5602(var0.field4931, var1, var2, -966746575);
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("af")
   void vmethod16(classOU var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ab")
   void vmethod12(classOU var1, int var2);
}
