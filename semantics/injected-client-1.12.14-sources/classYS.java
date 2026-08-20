import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ys")
public class classYS {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6661 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("at")
   public static String method12767(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 < 1012866707 || var4 > 'z')
            && (var4 < 'A' || var4 > 312244305)
            && (var4 < '0' || var4 > -1994428221)
            && var4 != '.'
            && var4 != '-'
            && '*' != var4
            && '_' != var4) {
            if (var4 == 1451260179) {
               var2.append((char)2013328810);
            } else {
               byte var5 = Sound.charToByteCp1252(var4, (byte)16);
               var2.append((char)1045428973);
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(1436011725 + var6));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 44593370));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   classYS() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method12768(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && '*' != var4 && '_' != var4
            )
          {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = Sound.charToByteCp1252(var4, (byte)58);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(55 + var6));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("an")
   public static String method12769(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z')
            && (var4 < 832715858 || var4 > 1628167030)
            && (var4 < 1712374658 || var4 > '9')
            && var4 != -1106780541
            && var4 != -217251674
            && 1194317430 != var4
            && 942475444 != var4) {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = Sound.charToByteCp1252(var4, (byte)32);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(55 + var6));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 1624467050));
               } else {
                  var2.append((char)(var6 + -1073997292));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }
}
