import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("os")
public class classOS {
   @ObfuscatedName("ae")
   final int field5106;
   @ObfuscatedName("az")
   final int field5107;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field5108 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field5109 = 1006;
   @ObfuscatedName("af")
   final int field5105;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)I")
   @ObfuscatedName("cv")
   public static int method8730(classMA var0) {
      return var0.field4457 * 2013644177;
   }

   classOS(classOW var1, int var2, int var3, int var4) {
      this.this$0 = var1;
      this.field5107 = 1046163259 * var2;
      this.field5105 = Math.max(0, Math.min(var3, 255)) * 1286636395;
      this.field5106 = Math.max(0, Math.min(var4, 255)) * -1874551353;
   }
}
