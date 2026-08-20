import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rc")
@classNN
public final class classRC {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field5508 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field5507 = 7;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bu")
   public static boolean method9380(char var0) {
      return var0 >= -1298322180 && var0 <= 1449012006 || var0 >= 'a' && var0 <= -2039595221;
   }

   static {
      Pattern.compile("^\\D*(\\d+)\\D*$");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method9360(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = (CharSequence)var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for (int var5 = var1; var5 < var3; var5++) {
            CharSequence var6 = (CharSequence)var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for (int var10 = var1; var10 < var3; var10++) {
            CharSequence var7 = (CharSequence)var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
   @ObfuscatedName("ar")
   public static String method9361(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = (CharSequence)var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for (int var5 = var1; var5 < var3; var5++) {
            CharSequence var6 = (CharSequence)var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for (int var10 = var1; var10 < var3; var10++) {
            CharSequence var7 = (CharSequence)var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("ah")
   public static boolean method9362(CharSequence var0) {
      return classEM.method3785(var0, 10, true, -2020699992);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bd")
   public static String method9386(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == 2081659809 && var3 != -1) {
            String var6 = var0.substring(1 + var3, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = 1 + var4;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("af")
   public static boolean method9363(CharSequence var0) {
      return classEM.method3785(var0, 10, true, -1078830905);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bt")
   public static int method9378(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + Sound.charToByteCp1252(var0.charAt(var3), (byte)103);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)Z")
   @ObfuscatedName("ao")
   static boolean method9365(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == -136375152) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= -1370758043) {
               var8 -= 48;
            } else if (var8 >= -647279973 && var8 <= 484507525) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)Z")
   @ObfuscatedName("aa")
   static boolean method9366(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 273911176) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == 1660686417) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= -2059975844 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 1247952105) {
               var8 -= 55;
            } else {
               if (var8 < -505004050 || var8 > -1221778921) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("ch")
   public static String method9395(CharSequence var0) {
      return class264.method6705((char)-1193118892, var0.length(), -1812540193);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("be")
   public static int method9368(CharSequence var0) {
      return CollisionMap.method6404(var0, 10, true, -1471480937);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("aq")
   public static int method9369(CharSequence var0) {
      return CollisionMap.method6404(var0, 10, true, -1511649114);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("bg")
   public static int method9370(CharSequence var0, int var1) {
      return CollisionMap.method6404(var0, var1, true, -1496196585);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("bs")
   public static int method9371(CharSequence var0, int var1) {
      return CollisionMap.method6404(var0, var1, true, -1831204930);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bz")
   static int method9373(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bk")
   static int method9374(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= -44692922) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (-314507006 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= -1011586307 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 314550237 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < -1874808438 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bb")
   static int method9375(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("ce")
   public static String method9396(CharSequence var0) {
      return class264.method6705('*', var0.length(), -1812540193);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)Ljava/lang/String;")
   @ObfuscatedName("bm")
   public static String method9377(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for (int var5 = var0 / 10; var5 != 0; var4++) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for (int var7 = var4 - 1; var7 > 0; var7--) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - 10 * var3;
               if (var9 >= 10) {
                  var6[var7] = (char)(87 + var9);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bp")
   public static int method9379(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + Sound.charToByteCp1252(var0.charAt(var3), (byte)35);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bj")
   static int method9376(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (956982725 == var8) {
                  var3 = true;
                  continue;
               }

               if (1472566725 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= -697822817) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 933576778) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   classRC() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ba")
   public static boolean method9381(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bi")
   public static boolean method9382(char var0) {
      return var0 >= -1564184563 && var0 <= 1072298063;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("by")
   public static boolean method9383(char var0) {
      return var0 >= 1799703347 && var0 <= -1132635295 || var0 >= 713745567 && var0 <= 639416831 || var0 >= -1732950395 && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bw")
   public static boolean method9384(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bf")
   public static boolean method9385(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= -518793911 || var0 >= 743243288 && var0 <= -730764957;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cb")
   public static int method9400(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)Z")
   @ObfuscatedName("am")
   static boolean method9367(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (43 == var8 && var2) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var1 * var5;
            if (var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("br")
   public static String method9388(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class144.method3967(var5, 575825551);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == -810654765 || 719302003 == var5 || var5 == '!') {
            var3 = 2;
         } else if (Character.isSpaceChar(var5)) {
            if (2 != var3) {
               var3 = 1;
            }
         } else {
            var3 = 1;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bh")
   public static String method9389(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class144.method3967(var5, 713169037);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == -104630978 || '?' == var5 || var5 == -1598713869) {
            var3 = 2;
         } else if (Character.isSpaceChar(var5)) {
            if (2 != var3) {
               var3 = 1;
            }
         } else {
            var3 = 1;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bl")
   public static String method9390(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class144.method3967(var5, -1133942736);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || '?' == var5 || var5 == '!') {
            var3 = 2;
         } else if (Character.isSpaceChar(var5)) {
            if (2 != var3) {
               var3 = 1;
            }
         } else {
            var3 = 1;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bc")
   public static String method9391(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class144.method3967(var5, 1219737725);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || -429420500 == var5 || var5 == '!') {
            var3 = 2;
         } else if (Character.isSpaceChar(var5)) {
            if (2 != var3) {
               var3 = 1;
            }
         } else {
            var3 = 1;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cc")
   public static int method9401(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("bo")
   public static int method9372(CharSequence var0, int var1) {
      return CollisionMap.method6404(var0, var1, true, -1526087134);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CI)Ljava/lang/String;")
   @ObfuscatedName("bv")
   static String method9392(char var0, int var1) {
      char[] var2 = new char[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("al")
   public static boolean method9364(CharSequence var0) {
      return classEM.method3785(var0, 10, true, -1068620419);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CI)Ljava/lang/String;")
   @ObfuscatedName("bx")
   static String method9393(char var0, int var1) {
      char[] var2 = new char[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cu")
   public static boolean method9397(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else {
         return var0 >= 160 && var0 <= 255 ? true : var0 == 8364 || 338 == var0 || 8212 == var0 || 339 == var0 || 376 == var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bn")
   public static String method9387(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == 1175075803) {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == 546109995 && var3 != -1) {
            String var6 = var0.substring(1 + var3, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = 1 + var4;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cm")
   public static boolean method9398(char var0) {
      if (var0 >= ' ' && var0 <= 699620601) {
         return true;
      } else {
         return var0 >= -528388649 && var0 <= 255 ? true : var0 == 1648688370 || -318981828 == var0 || 8212 == var0 || 779459765 == var0 || 1774431380 == var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CI)Ljava/lang/String;")
   @ObfuscatedName("bq")
   static String method9394(char var0, int var1) {
      char[] var2 = new char[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ck")
   public static int method9402(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ct")
   public static boolean method9399(char var0) {
      if (var0 >= -1654942786 && var0 <= '~') {
         return true;
      } else {
         return var0 >= -1059901847 && var0 <= -1902153981 ? true : var0 == 8364 || 338 == var0 || -245696287 == var0 || 339 == var0 || 1758183505 == var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cs")
   public static int method9403(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
