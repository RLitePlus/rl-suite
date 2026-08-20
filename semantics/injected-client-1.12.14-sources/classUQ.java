import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uq")
public class classUQ {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field6090 = 44;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6092 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6087 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field6089 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field6093 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field6088 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6091 = 1;

   @ObfuscatedSignature(descriptor = "(Lqi;J)Lvz;")
   @ObfuscatedName("wt")
   public static Node method11202(NodeHashTable var0, long var1) {
      if (var0 == null) {
         var0.next();
      }

      return var0.method8915(var1);
   }

   @ObfuscatedSignature(descriptor = "(I[BLtf;S)V")
   @ObfuscatedName("av")
   static void method11201(int var0, byte[] var1, ArchiveDisk var2, short var3) {
      try {
         ArchiveDiskAction var4 = new ArchiveDiskAction();
         var4.type = 0;
         var4.key = var0;
         var4.data = var1;
         var4.archiveDisk = var2;
         synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
         }

         class228.method4852(-1748452176);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "uq.av(" + ')');
      }
   }

   protected classUQ() throws Throwable {
      throw new Error();
   }
}
