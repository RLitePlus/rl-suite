import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sf")
final class classSF implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("cj")
   public static final int field5921 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field5920 = 41;

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sf.newThread(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbl;I)[Lyn;")
   @ObfuscatedName("hy")
   public static classYN[] method10379(classBL var0, int var1) {
      return var0 == null ? var0.method1145(var1) : new classYN[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("gb")
   public static Thread method10377(classSF var0, Runnable var1) {
      if (var0 == null) {
         var0.method10378(var1);
      }

      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;I)Lsj;")
   @ObfuscatedName("fc")
   public static classSJ method10376(classDF var0, int var1) {
      if (var0 == null) {
         var0.method3022(var1);
      }

      return var1 >= 0 && var1 < var0.field1411.length ? var0.field1411[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("af")
   public Thread method10378(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }
}
