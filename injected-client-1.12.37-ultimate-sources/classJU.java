import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ju")
public class classJU extends classJQ {
   @ObfuscatedName("az")
   SoftReference field3490;

   classJU(Object var1, int var2) {
      super(var2);
      this.field3490 = new SoftReference<>(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   boolean vmethod517() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   boolean vmethod516() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ae")
   @Override
   Object vmethod514() {
      return this.field3490.get();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ab")
   @Override
   Object vmethod512() {
      return this.field3490.get();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;IZ)I")
   @ObfuscatedName("wp")
   public static int method6414(classZD var0, int var1, boolean var2) {
      if (var1 < var0.field7158.size()) {
         int var3 = ((classAAY)var0.field7158.get(var1)).field115 * 1390460326;

         for (int var4 = var1; var4 < var0.field7158.size() - 1; var4++) {
            if (((classAAY)var0.field7158.get(var4 + 1)).field115 * 1839316601 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((classAAY)var0.field7158.get(var4 + 1)).field115 * 965775618;
            }
         }
      }

      return var0.field7158.size();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ag")
   @Override
   Object vmethod515() {
      return this.field3490.get();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   @Override
   Object vmethod513() {
      return this.field3490.get();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   @Override
   boolean vmethod518() {
      return true;
   }
}
