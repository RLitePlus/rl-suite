import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pm")
public class StudioGame implements Enum {
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("ag")
   static final StudioGame game3 = new StudioGame("game3", "Game 3", 2);
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("at")
   static final StudioGame stellardawn = new StudioGame("stellardawn", "Stellar Dawn", 1);
   @ObfuscatedName("ak")
   public final String name;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field5181 = 99;
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("ae")
   static final StudioGame game5 = new StudioGame("game5", "Game 5", 4);
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("aj")
   public static final StudioGame oldscape = new StudioGame("oldscape", "RuneScape 2007", 5);
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("av")
   static final StudioGame runescape = new StudioGame("runescape", "RuneScape", 0);
   @ObfuscatedName("aw")
   final int id;
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("an")
   static final StudioGame game4 = new StudioGame("game4", "Game 4", 3);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leo;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("zu")
   public static int method8770(UserComparator5 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3800(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, -761932170);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * 809367525;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pm.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvu;")
   @ObfuscatedName("av")
   public static classVU method8769(int var0) {
      try {
         synchronized (classVU.field6304) {
            if (classVU.field6302 * -640625525 == 0) {
               if (var0 <= 1956132192) {
                  throw new IllegalStateException();
               } else {
                  return new classVU();
               }
            } else {
               classVU.method11599(classVU.field6304[(classVU.field6302 -= -1149635805) * -640625525], (byte)-3);
               return classVU.field6304[-640625525 * classVU.field6302];
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "pm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * 809367525;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * 809367525;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * -646672462;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hc")
   static int method8771(int var0) {
      try {
         if (null != client.archiveLoaders) {
            if (var0 != 871960420) {
               throw new IllegalStateException();
            }

            if (-251416631 * client.archiveLoadersDone < client.archiveLoaders.size()) {
               int var1 = 0;

               for (int var2 = 0; var2 <= -251416631 * client.archiveLoadersDone; var2++) {
                  if (var0 != 871960420) {
                     throw new IllegalStateException();
                  }

                  var1 += ((ArchiveLoader)client.archiveLoaders.get(var2)).loadedCount * 1188087065;
               }

               return var1 * 10000 / (client.field910 * 454442311);
            }

            if (var0 != 871960420) {
               throw new IllegalStateException();
            }
         }

         return 10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pm.hc(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpm;")
   @ObfuscatedName("ak")
   public static StudioGame[] method8767() {
      return new StudioGame[]{stellardawn, game5, game3, game4, runescape, oldscape};
   }

   StudioGame(String var1, String var2, int var3) {
      this.name = var1;
      this.id = var3 * -395219475;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpm;")
   @ObfuscatedName("aj")
   public static StudioGame[] method8768() {
      return new StudioGame[]{stellardawn, game5, game3, game4, runescape, oldscape};
   }
}
