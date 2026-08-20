import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fg")
public interface classFG {
   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("au")
   int[] vmethod407(int var1);

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   int vmethod408(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   boolean vmethod412(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(IB)[I")
   @ObfuscatedName("ae")
   int[] vmethod402(int var1, byte var2);

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ap")
   int[] vmethod404(int var1);

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ay")
   int[] vmethod403(int var1);

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ad")
   int[] vmethod405(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lel;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("rz")
   static int method4681(classEL var0, Object var1, Object var2) {
      return var0 == null ? var0.method3918(var1, var1) : classEL.method3911(var0, (Buddy)var1, (Buddy)var2, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("nl")
   default int method4683(int var1) {
      return this.vmethod408(var1, -1340787172);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("aq")
   int[] vmethod406(int var1);

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean vmethod413(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)I")
   @ObfuscatedName("er")
   static int method4682(classLH var0) {
      return -1136623217 * var0.field4150;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int vmethod409(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   int vmethod411(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   int vmethod410(int var1);
}
