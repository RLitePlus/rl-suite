import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl20")
class rl20 implements IndexedObjectSet {
   public Iterator iterator() {
      return Iterators.transform(this.field5721.field1700.iterator(), var0 -> var0.field6012);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("gq")
   public classDZ method10060(int var1) {
      classSP var2 = (classSP)this.field5721.field1700.method13596(var1);
      return var2 == null ? null : var2.field6012;
   }

   public rl20(classDZ var1) {
      this.field5721 = var1;
   }
}
