import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ra")
public final class classRA {
   @ObfuscatedName("az")
   final int field5631;
   @ObfuscatedName("af")
   final boolean field5630;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5632 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5633 = 10;

   @ObfuscatedSignature(descriptor = "(I)[Lsk;")
   @ObfuscatedName("ag")
   static classSK[] method9936(int var0) {
      try {
         return new classSK[]{classSK.field5968, classSK.field5973, classSK.field5970, classSK.field5971, classSK.field5972, classSK.field5969};
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ra.ag(" + ')');
      }
   }

   classRA(int var1, boolean var2) {
      this.field5631 = var1 * -593767025;
      this.field5630 = var2;
   }
}
