import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jq")
public abstract class classJQ extends classVJ {
   @ObfuscatedName("af")
   final int field3358;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   abstract boolean vmethod517();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   abstract Object vmethod513();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ae")
   abstract Object vmethod514();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   abstract boolean vmethod516();

   classJQ(int var1) {
      this.field3358 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Laj;")
   @ObfuscatedName("tr")
   public static classAJ method6404(classAU var0) {
      if (null != var0.field280) {
         var0.field280.field139.lock();

         classAJ var1;
         try {
            var1 = var0.method708(398316170);
         } finally {
            var0.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ag")
   abstract Object vmethod515();

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ab")
   abstract Object vmethod512();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   abstract boolean vmethod518();
}
