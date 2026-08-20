import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xf")
public interface classXF {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;)[I")
   @ObfuscatedName("jy")
   static int[] method12748(classDN var0) {
      return var0.field1585 != null ? var0.field1585.method13766(-106050322) : var0.field1581.method8974((byte)73);
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("af")
   classXT vmethod647();

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("az")
   classXT vmethod648(byte var1);
}
