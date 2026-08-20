import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gp")
final class classGP implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2043 = 40;
   @ToRemove(unused = "true")
   @ObfuscatedName("cc")
   static final int field2044 = 1;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   static AbstractArchive field2045;

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("af")
   static void method4261(short var0) {
      try {
         if (class406.loadWorlds(1588402824)) {
            if (var0 <= 142) {
               return;
            }

            Login.worldSelectOpen = true;
            Login.worldSelectPage = 0;
            Login.worldSelectPagesCount = 0;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gp.af(" + ')');
      }
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gp.newThread(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method4259(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("lq")
   static void method4262(byte var0) {
      try {
         client.menu.field6552 = 0;
         client.menu.method12397(-1);
         client.isMenuOpen = false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gp.lq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public static int method4258(int var0) {
      try {
         return 1 + ViewportMouse.ViewportMouse_entityCount * -1556503267;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gp.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method4260(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }
}
