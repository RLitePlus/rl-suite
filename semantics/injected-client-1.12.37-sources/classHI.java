import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hi")
public class classHI {
   @ObfuscatedSignature(descriptor = "Lhi;")
   @ObfuscatedName("af")
   static final classHI field2803 = new classHI(1);
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2805 = 7;
   @ObfuscatedSignature(descriptor = "Lhi;")
   @ObfuscatedName("az")
   static final classHI field2802 = new classHI(0);
   @ObfuscatedName("ae")
   final int field2801;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field2804 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field2806 = 93;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Loz;")
   @ObfuscatedName("ve")
   public static classOZ method6058(classPL var0) {
      return var0.field5318;
   }

   classHI(int var1) {
      this.field2801 = -520582397 * var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   static int method6057(int var0, int var1) {
      try {
         return var0 - 1;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "hi.af(" + 41);
      }
   }
}
