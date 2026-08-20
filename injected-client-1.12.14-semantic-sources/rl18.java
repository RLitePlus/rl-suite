import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl18")
class rl18 implements net.runelite.api.IndexedObjectSet {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("th")
   public static Object method9547(class586 var0, Buffer var1) {
      if (var0 == null) {
         var0.method11713(var1);
      }

      return var0.field6374.vmethod443(var1, (byte)-41);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldd;")
   @ObfuscatedName("ie")
   public WorldView method9549(int var1) {
      WorldEntity var2 = (WorldEntity)this.field5576.worldEntities.method8957(var1);
      return var2 == null ? null : var2.worldView;
   }

   public Iterator iterator() {
      return Iterators.transform(this.field5576.worldEntities.iterator(), var0 -> var0.worldView);
   }

   public rl18(WorldView var1) {
      this.field5576 = var1;
   }
}
