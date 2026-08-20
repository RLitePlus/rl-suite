import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl20")
class rl20 implements net.runelite.api.IndexedObjectSet {
   public Iterator iterator() {
      return Iterators.transform(this.field5721.worldEntities.iterator(), var0 -> var0.field6012);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("gq")
   public WorldView method10060(int var1) {
      WorldEntity var2 = (WorldEntity)this.field5721.worldEntities.method13596(var1);
      return var2 == null ? null : var2.field6012;
   }

   public rl20(WorldView var1) {
      this.field5721 = var1;
   }
}
