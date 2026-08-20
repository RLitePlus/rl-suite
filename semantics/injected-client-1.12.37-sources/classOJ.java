import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oj")
public class classOJ {
   @ObfuscatedName("az")
   final int field4900;
   @ObfuscatedName("af")
   final int field4903;
   @ObfuscatedName("ae")
   final int field4902;
   @ObfuscatedName("ab")
   final int field4901;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field4904 = 524288;
   @ToRemove(unused = "true")
   @ObfuscatedName("ca")
   public static final int field4905 = 87;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;)Lvc;")
   @ObfuscatedName("lt")
   public static classVC method8506(classVV var0) {
      return var0.field6611;
   }

   classOJ(classPH var1, int var2, int var3, int var4, int var5) {
      this.this$0 = var1;
      this.field4900 = var2 * 645350423;
      this.field4903 = var3 * 1968744361;
      this.field4902 = 37131719 * var4;
      this.field4901 = -1393386903 * var5;
   }

   @ObfuscatedSignature(descriptor = "(IZB)Ljava/lang/String;")
   @ObfuscatedName("ac")
   public static String method8507(int var0, boolean var1, byte var2) {
      try {
         if (var1) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            if (var0 >= 0) {
               return classBZ.method1390(var0, 10, var1, -1879842619);
            }

            if (var2 == 1) {
               throw new IllegalStateException();
            }
         }

         return Integer.toString(var0);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "oj.ac(" + ')');
      }
   }
}
