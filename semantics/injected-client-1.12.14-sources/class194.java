import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hc")
public class class194 extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2169 = 2340;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2168 = 30;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field2023 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field2170 = 5;

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("aw")
   static int method4477(int var0, byte var1) {
      try {
         Message var2 = (Message)Messages.Messages_hashTable.get((long)var0);
         if (var2 == null) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (var2.nextDual == Messages.Messages_queue.sentinel) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 380472083 * ((Message)var2.nextDual).count;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hc.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/io/File;ZI)Z")
   @ObfuscatedName("an")
   static boolean method4478(File var0, boolean var1, int var2) {
      try {
         try {
            RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
            int var4 = var3.read();
            var3.seek(0L);
            var3.write(var4);
            var3.seek(0L);
            var3.close();
            if (var1) {
               if (var2 <= 1868523425) {
                  throw new IllegalStateException();
               }

               var0.delete();
            }

            return true;
         } catch (Exception var5) {
            return false;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hc.an(" + ')');
      }
   }

   class194() throws Throwable {
      throw new Error();
   }
}
