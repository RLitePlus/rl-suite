import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aal")
public class classAAL {
   @ObfuscatedName("ae")
   public static int field57;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field58 = 64;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;I)Lop;")
   @ObfuscatedName("tv")
   public static classOP method222(classLC var0, int var1) {
      if (var0 == null) {
         var0.method6740(var1);
      }

      return classOB.method8299(var1 - 2048, (byte)-33);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("af")
   public static String method221(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 < 1936910010 || var4 > -353508410)
            && (var4 < 'A' || var4 > 'Z')
            && (var4 < '0' || var4 > '9')
            && var4 != '.'
            && var4 != 1165243116
            && 1494810781 != var4
            && 1188522047 != var4) {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = classOG.method8434(var4, (byte)105);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(55 + var6));
               } else {
                  var2.append((char)(48 + var6));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(55 + var6));
               } else {
                  var2.append((char)(-1081058085 + var6));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   classAAL() throws Throwable {
      throw new Error();
   }
}
