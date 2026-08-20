import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rp")
public final class class455 {
   @ObfuscatedName("at")
   static long[] field5682 = new long[12];
   @ObfuscatedName("av")
   static final char[] base37Table = new char[]{
      '_',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9'
   };

   class455() throws Throwable {
      throw new Error();
   }

   static {
      for (int var0 = 0; var0 < field5682.length; var0++) {
         field5682[var0] = (long)Math.pow(37.0, var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)J")
   @ObfuscatedName("an")
   public static long method9753(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for (int var4 = 0; var4 < var3; var4++) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += 1 + var5 - 65;
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += 1 + var5 - 97;
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += var5 + 27 - 48;
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while (0L == var1 % 37L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public static String method9756(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               char var8 = base37Table[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }

               var5.append(var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)J")
   @ObfuscatedName("aj")
   public static long method9754(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for (int var4 = 0; var4 < var3; var4++) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += 1 + var5 - 65;
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += 1 + var5 - 97;
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += var5 + 27 - 48;
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while (0L == var1 % 37L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public static String method9757(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               char var8 = base37Table[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }

               var5.append(var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public static String method9758(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               char var8 = base37Table[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }

               var5.append(var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)J")
   @ObfuscatedName("ae")
   public static long method9755(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for (int var4 = 0; var4 < var3; var4++) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 990404230) {
            var1 += 1 + var5 - -1686043209;
         } else if (var5 >= -1453946082 && var5 <= 'z') {
            var1 += 1 + var5 - -1380785709;
         } else if (var5 >= '0' && var5 <= 395893997) {
            var1 += var5 + 27 - 48;
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while (0L == var1 % 37L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvs;")
   @ObfuscatedName("hg")
   static WorldMap getWorldMap(int var0) {
      try {
         return Skills.worldMap;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rp.hg(" + ')');
      }
   }
}
