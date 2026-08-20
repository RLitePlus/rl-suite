import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ib")
class class208 implements ThreadFactory {
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("ck")
   static IndexedSprite titleboxSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2436 = 30;
   @ObfuscatedName("at")
   public static int SpriteBuffer_spriteWidth;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method4858(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ib.newThread(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lib;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("dm")
   public static Thread method4859(class208 var0, Runnable var1) {
      if (var0 == null) {
         var0.newThread(var1);
      }

      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljj;Ljava/lang/String;)Z")
   @ObfuscatedName("mt")
   public static boolean method4857(class234 var0, String var1) {
      if (var0 == null) {
         var0.method5956(var1);
      }

      class234.method5918(var0, 2, var1, -1669944512);
      return true;
   }

   class208(SequenceDefinition var1) {
      this.this$0 = var1;
   }
}
