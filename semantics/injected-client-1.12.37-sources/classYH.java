import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yh")
public interface classYH {
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   void vmethod656(Object var1, Buffer var2, int var3);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbw;Lxy;I)V")
   @ObfuscatedName("vv")
   static void method13362(classBW var0, Buffer var1, int var2) {
      var0.field593.method10135(var1, var2, (byte)1);
      var0.field594 = 596332666;
      classPW.method9358(-527562367);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   Object vmethod655(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   Object vmethod654(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   Object vmethod653(Buffer var1, byte var2);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   void vmethod657(Object var1, Buffer var2);
}
