import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mz")
public class classMZ extends classMD {
   @ObfuscatedName("az")
   int field4622;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4623 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field4624 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field4625 = 46;

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ae")
   public static boolean method7747(int var0, byte var1) {
      try {
         return var0 == 85;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mz.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod525(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mz.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod523(int var1) {
      try {
         return this.field4622 * 399676015;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mz.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod526() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod524() {
      return this.field4622 * 1312796260;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod522() {
      return this.field4622 * 238002785;
   }

   classMZ(classMS var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field4622 = -1154675569 * var3;
   }
}
