import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ko")
public class classKO {
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   static final int field3977 = 249;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field3975 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3972 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field3973 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field3976 = -3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field3971 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field3974 = 15;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("gi")
   public static String method6507(ItemComposition var0, int var1, String var2) {
      return classFS.method4977(var0.field5032, var1, var2, (byte)79);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   public static int method6501(int var0, int var1) {
      return var1 + (-3 - var0 << 8);
   }

   classKO() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method6502(int var0, int var1) {
      return var1 + (-3 - var0 << 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method6503(int var0, int var1) {
      return var1 + (-3 - var0 << 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public static int method6504(int var0) {
      return var0 + -512;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method6505(int var0) {
      return var0 + -512;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvl;")
   @ObfuscatedName("az")
   public static classVL method6506(int var0) {
      try {
         synchronized (classVL.field6522) {
            if (1879977691 * classVL.field6520 == 0) {
               return new classVL();
            } else {
               classVL.method11973(classVL.field6522[(classVL.field6520 -= -272097965) * 1879977691], (byte)7);
               return classVL.field6522[classVL.field6520 * 1879977691];
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ko.az(" + ')');
      }
   }
}
