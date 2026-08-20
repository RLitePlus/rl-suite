import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ht")
public class class200 extends DualNode {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field2100 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field2310 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2309 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("cj")
   public static final int field2311 = 97;
   @ObfuscatedName("ad")
   static byte[][][] Tiles_shapes;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   static final void method4651(int var0) {
      try {
         SwapSongTask.method10270(Strings.field5047, (byte)8);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ht.ag(" + ')');
      }
   }

   class200() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llt;)I")
   @ObfuscatedName("uw")
   public static int method4652(WorldMapData_1 var0) {
      return 1457663191 * var0.chunkX;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IB)Lnw;")
   @ObfuscatedName("av")
   static MusicPatch method4653(AbstractArchive var0, int var1, byte var2) {
      try {
         byte[] var3 = var0.takeFileFlat(var1, -1998934004);
         return null == var3 ? null : new MusicPatch(var3);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ht.av(" + ')');
      }
   }
}
