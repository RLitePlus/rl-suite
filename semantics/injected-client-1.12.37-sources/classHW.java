import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hw")
public class classHW {
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field2904 = 58;
   @ObfuscatedName("af")
   final int field2902;
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field2906 = 91;
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("ab")
   final classHP field2901;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2903 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field2905 = 1076101624;
   @ObfuscatedName("az")
   final String field2900;
   @ObfuscatedName("ae")
   final int field2899;

   classHW(String var1, int var2, int var3, classHP var4) {
      this.field2900 = var1;
      this.field2902 = -1801906281 * var2;
      this.field2899 = var3 * -615172887;
      this.field2901 = var4;
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("az")
   public static classOF method6123(int var0, int var1) {
      try {
         classOF var2 = (classOF)classOF.field4852.method6422(var0);
         if (null != var2) {
            if (var1 >= -392503493) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else if (classLP.field4196 == null) {
            if (var1 >= -392503493) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            byte[] var3 = classLP.field4196.method11867(3, var0, -1241700387);
            var2 = new classOF(new Buffer(var3));
            classOF.field4852.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "hw.az(" + ')');
      }
   }
}
