import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wy")
public abstract class classWY {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field6468 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6469 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILwp;)Z")
   @ObfuscatedName("at")
   public static boolean method11902(int var0, class594 var1) {
      return (var0 & var1.rsOrdinal((byte)34)) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)[J")
   @ObfuscatedName("wo")
   public static long[] method11905(DynamicArray var0) {
      return var0.field6110;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILwp;)Z")
   @ObfuscatedName("ag")
   public static boolean method11903(int var0, class594 var1) {
      return (var0 & var1.rsOrdinal((byte)53)) != 0;
   }

   classWY() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILwp;)Z")
   @ObfuscatedName("an")
   public static boolean method11904(int var0, class594 var1) {
      return (var0 & var1.rsOrdinal((byte)124)) != 0;
   }
}
