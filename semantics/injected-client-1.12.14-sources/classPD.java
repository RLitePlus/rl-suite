import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pd")
public class classPD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4791 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field4793 = 90;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4795 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field4792 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4796 = 43;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4794 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4790 = 99;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)Z")
   @ObfuscatedName("zd")
   public static boolean method8717(NPCComposition var0) {
      return var0.field2353;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lfz;")
   @ObfuscatedName("ae")
   static class141[] method8716(byte var0) {
      try {
         return new class141[]{
            class141.field1946,
            class141.field1950,
            class141.field1957,
            class141.field1949,
            class141.field1955,
            class141.field1951,
            class141.field1959,
            class141.field1947,
            class141.field1954,
            class141.field1962,
            class141.field1956,
            class141.field1952,
            class141.field1953,
            class141.field1958,
            class141.field1960,
            class141.field1961,
            class141.field1948
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "pd.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqt;)Ljava/lang/Object;")
   @ObfuscatedName("fx")
   public static Object method8715(IterableNodeHashTableIterator var0) {
      if (var0.head != var0.hashTable.buckets[var0.index - 1]) {
         Node var2 = var0.head;
         var0.head = var2.previous;
         var0.last = var2;
         return var2;
      } else {
         while (var0.index < var0.hashTable.size) {
            Node var1 = var0.hashTable.buckets[var0.index++].previous;
            if (var1 != var0.hashTable.buckets[var0.index - 1]) {
               var0.head = var1.previous;
               var0.last = var1;
               return var1;
            }
         }

         return null;
      }
   }

   classPD() throws Throwable {
      throw new Error();
   }
}
