import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aab")
public class classAAB {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field28 = 12;
   @ObfuscatedName("ae")
   static final char[] field26 = new char[]{
      ' ',
      ' ',
      '_',
      '-',
      'à',
      'á',
      'â',
      'ä',
      'ã',
      'À',
      'Á',
      'Â',
      'Ä',
      'Ã',
      'è',
      'é',
      'ê',
      'ë',
      'È',
      'É',
      'Ê',
      'Ë',
      'í',
      'î',
      'ï',
      'Í',
      'Î',
      'Ï',
      'ò',
      'ó',
      'ô',
      'ö',
      'õ',
      'Ò',
      'Ó',
      'Ô',
      'Ö',
      'Õ',
      'ù',
      'ú',
      'û',
      'ü',
      'Ù',
      'Ú',
      'Û',
      'Ü',
      'ç',
      'Ç',
      'ÿ',
      'Ÿ',
      'ñ',
      'Ñ',
      'ß'
   };
   @ObfuscatedName("ab")
   static final char[] field27 = new char[]{'[', ']', '#'};

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Laao;)Ljava/lang/String;")
   @ObfuscatedName("ab")
   public static String method124(CharSequence var0, classAAO var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for (var3 = var0.length(); var2 < var3; var2++) {
            char var5 = var0.charAt(var2);
            boolean var4 = 160 == var5 || -890199825 == var5 || var5 == '_' || var5 == '-';
            if (!var4) {
               break;
            }
         }

         while (var3 > var2) {
            char var14 = var0.charAt(var3 - 1);
            boolean var12 = 160 == var14 || ' ' == var14 || -114183304 == var14 || '-' == var14;
            if (!var12) {
               break;
            }

            var3--;
         }

         int var13 = var3 - var2;
         if (var13 >= 1) {
            byte var6;
            if (null == var1) {
               var6 = 12;
            } else {
               switch (-670896561 * var1.field77) {
                  case 6:
                     var6 = 20;
                     break;
                  default:
                     var6 = 12;
               }
            }

            if (var13 <= var6) {
               StringBuilder var15 = new StringBuilder(var13);

               for (int var16 = var2; var16 < var3; var16++) {
                  char var7 = var0.charAt(var16);
                  boolean var8;
                  if (Character.isISOControl(var7)) {
                     var8 = false;
                  } else if (classSN.method10532(var7, -1920590667)) {
                     var8 = true;
                  } else {
                     char[] var9 = field26;
                     int var10 = 0;

                     label118:
                     while (true) {
                        if (var10 >= var9.length) {
                           var9 = field27;

                           for (int var19 = 0; var19 < var9.length; var19++) {
                              char var20 = var9[var19];
                              if (var20 == var7) {
                                 var8 = true;
                                 break label118;
                              }
                           }

                           var8 = false;
                           break;
                        }

                        char var11 = var9[var10];
                        if (var11 == var7) {
                           var8 = true;
                           break;
                        }

                        var10++;
                     }
                  }

                  if (var8) {
                     char var18 = classHZ.method6137(var7, (byte)-64);
                     if (var18 != 0) {
                        var15.append(var18);
                     }
                  }
               }

               if (var15.length() == 0) {
                  return null;
               }

               return var15.toString();
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnz;Lvj;)V")
   @ObfuscatedName("kq")
   public static void method125(classNZ var0, classVJ var1) {
      if (var0 == null) {
         var0.method8272();
      }

      if (var1.field6516 != null) {
         var1.method11958();
      }

      var1.field6516 = var0.field4800.field6516;
      var1.field6515 = var0.field4800;
      var1.field6516.field6515 = var1;
      var1.field6515.field6516 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("as")
   static char method126(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ag")
   static char method127(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("oj")
   public static void method130(Scene var0) {
      if (var0 == null) {
         var0.getBaseX();
      }

      var0.field2036 = -1;
      var0.field2033 = false;
   }

   classAAB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ax")
   static char method128(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ac")
   public static String method129(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != -571239305 ? var0 : "";
   }
}
