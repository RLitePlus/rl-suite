import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ie")
public class class224 extends classJO {
   @ObfuscatedName("av")
   int field2464;
   @ObfuscatedName("al")
   static int cacheGamebuild;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   @Override
   public int vmethod196(int var1) {
      try {
         return 1300977817 * this.field2464;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ie.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod197() {
      return 1300977817 * this.field2464;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod194(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ie.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("cz")
   public static boolean method4883(World var0) {
      return var0 == null ? var0.method911() : (class594.field6429.rsOrdinal((byte)127) & -607869593 * var0.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod195() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod198() {
      return 1300977817 * this.field2464;
   }

   class224(class236 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field2464 = var3 * 681147305;
   }
}
