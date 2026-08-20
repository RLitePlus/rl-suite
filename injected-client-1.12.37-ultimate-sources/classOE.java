import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oe")
@classZY
public final class classOE {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4840 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field4842 = 17;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field4839 = 8;
   @ObfuscatedSignature(descriptor = "Lclient;")
   @ObfuscatedName("cz")
   public static client field4843;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field4841 = 14;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
   @ObfuscatedName("at")
   public static String method8354(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = (CharSequence)var0[var1];
         return null == var8 ? "null" : var8.toString();
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
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("ca")
   public static String method8397(CharSequence var0) {
      return classJC.method6352('*', var0.length(), 951041195);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public static String method8355(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = (CharSequence)var0[var1];
         return null == var8 ? "null" : var8.toString();
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
            if (null == var7) {
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
   @ObfuscatedName("av")
   public static String method8356(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = (CharSequence)var0[var1];
         return null == var8 ? "null" : var8.toString();
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
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cc")
   public static boolean method8400(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else {
         return var0 >= 160 && var0 <= 255 ? true : 8364 == var0 || 338 == var0 || 8212 == var0 || 339 == var0 || var0 == 376;
      }
   }

   classOE() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CI)Ljava/lang/String;")
   @ObfuscatedName("cy")
   static String method8396(char var0, int var1) {
      char[] var2 = new char[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)Z")
   @ObfuscatedName("ah")
   static boolean method8359(CharSequence var0, int var1, boolean var2) {
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

            if (var8 >= 48 && var8 <= 1651904207) {
               var8 -= 48;
            } else if (var8 >= 1711007796 && var8 <= -1901707866) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 902276313) {
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

            int var9 = var1 * var5 + var8;
            if (var9 / var1 != var5) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("bn")
   public static boolean method8360(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      long var4 = 0L;
      int var6 = var0.length();
      int var7 = 0;

      boolean var1;
      while (true) {
         if (var7 >= var6) {
            var1 = var3;
            break;
         }

         label88: {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == 45) {
                  var2 = true;
                  break label88;
               }

               if (var8 == 43) {
                  break label88;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  var1 = false;
                  break;
               }

               var8 -= 87;
            }

            if (var8 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var8 = -var8;
            }

            long var9 = 10L * var4 + var8;
            if (var4 != var9 / 10L) {
               var1 = false;
               break;
            }

            var4 = var9;
            var3 = true;
         }

         var7++;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("bx")
   public static boolean method8361(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      long var4 = 0L;
      int var6 = var0.length();
      int var7 = 0;

      boolean var1;
      while (true) {
         if (var7 >= var6) {
            var1 = var3;
            break;
         }

         label95: {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == -420974839) {
                  var2 = true;
                  break label95;
               }

               if (var8 == 43) {
                  break label95;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= -563646038 && var8 <= -2055895973) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 206486299) {
                  var1 = false;
                  break;
               }

               var8 -= 87;
            }

            if (var8 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var8 = -var8;
            }

            long var9 = 10L * var4 + var8;
            if (var4 != var9 / 10L) {
               var1 = false;
               break;
            }

            var4 = var9;
            var3 = true;
         }

         var7++;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("bc")
   public static boolean method8362(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      long var4 = 0L;
      int var6 = var0.length();
      int var7 = 0;

      boolean var1;
      while (true) {
         if (var7 >= var6) {
            var1 = var3;
            break;
         }

         label91: {
            int var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == 45) {
                  var2 = true;
                  break label91;
               }

               if (var8 == 43) {
                  break label91;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  var1 = false;
                  break;
               }

               var8 -= 87;
            }

            if (var8 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var8 = -var8;
            }

            long var9 = 10L * var4 + var8;
            if (var4 != var9 / 10L) {
               var1 = false;
               break;
            }

            var4 = var9;
            var3 = true;
         }

         var7++;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bp")
   public static int method8363(CharSequence var0) {
      return classOH.method8449(var0, 10, true, -143639670);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("br")
   public static int method8364(CharSequence var0) {
      return classOH.method8449(var0, 10, true, -276747427);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bf")
   public static int method8378(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + classOG.method8434(var0.charAt(var3), (byte)-58);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bt")
   public static int method8365(CharSequence var0) {
      return classOH.method8449(var0, 10, true, 2146053681);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bh")
   public static boolean method8383(char var0) {
      return var0 >= 1767531205 && var0 <= 'Z' || var0 >= 1128218370 && var0 <= -533070977;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)Ljava/lang/String;")
   @ObfuscatedName("ba")
   public static String method8371(int var0, boolean var1) {
      return var1 && var0 >= 0 ? classBZ.method1390(var0, 10, var1, -1989481004) : Integer.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bg")
   public static int method8367(CharSequence var0, int var1, boolean var2) {
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

            if (var8 >= 48 && var8 <= -36273482) {
               var8 -= 48;
            } else if (var8 >= 237421723 && var8 <= -246542352) {
               var8 -= 55;
            } else {
               if (var8 < 2053133349 || var8 > 122) {
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

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)J")
   @ObfuscatedName("bk")
   public static long method8369(CharSequence var0) {
      boolean var3 = false;
      boolean var4 = false;
      long var5 = 0L;
      int var7 = var0.length();

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var0.charAt(var8);
         if (0 == var8) {
            if (var9 == 45) {
               var3 = true;
               continue;
            }

            if (43 == var9) {
               continue;
            }
         }

         if (var9 >= 48 && var9 <= -319094687) {
            var9 -= 48;
         } else if (var9 >= 65 && var9 <= 90) {
            var9 -= 55;
         } else {
            if (var9 < 97 || var9 > 122) {
               throw new NumberFormatException();
            }

            var9 -= 87;
         }

         if (var9 >= 10) {
            throw new NumberFormatException();
         }

         if (var3) {
            var9 = -var9;
         }

         long var10 = var5 * 10L + var9;
         if (var10 / 10L != var5) {
            throw new NumberFormatException();
         }

         var5 = var10;
         var4 = true;
      }

      if (!var4) {
         throw new NumberFormatException();
      } else {
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bm")
   public static int method8366(CharSequence var0) {
      return classOH.method8449(var0, 10, true, 733615914);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)Ljava/lang/String;")
   @ObfuscatedName("bu")
   public static String method8372(int var0, boolean var1) {
      return var1 && var0 >= 0 ? classBZ.method1390(var0, 10, var1, -1956174664) : Integer.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)Ljava/lang/String;")
   @ObfuscatedName("bw")
   public static String method8373(int var0, boolean var1) {
      return var1 && var0 >= 0 ? classBZ.method1390(var0, 10, var1, -2092275622) : Integer.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)J")
   @ObfuscatedName("bo")
   public static long method8370(CharSequence var0) {
      boolean var3 = false;
      boolean var4 = false;
      long var5 = 0L;
      int var7 = var0.length();

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var0.charAt(var8);
         if (0 == var8) {
            if (var9 == 45) {
               var3 = true;
               continue;
            }

            if (43 == var9) {
               continue;
            }
         }

         if (var9 >= -957548162 && var9 <= -727917656) {
            var9 -= 48;
         } else if (var9 >= 65 && var9 <= -405232715) {
            var9 -= 55;
         } else {
            if (var9 < 97 || var9 > 236249495) {
               throw new NumberFormatException();
            }

            var9 -= 87;
         }

         if (var9 >= 10) {
            throw new NumberFormatException();
         }

         if (var3) {
            var9 = -var9;
         }

         long var10 = var5 * 10L + var9;
         if (var10 / 10L != var5) {
            throw new NumberFormatException();
         }

         var5 = var10;
         var4 = true;
      }

      if (!var4) {
         throw new NumberFormatException();
      } else {
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIZ)Ljava/lang/String;")
   @ObfuscatedName("bi")
   static String method8375(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 1289741002) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for (int var4 = var0 / var1; var4 != 0; var3++) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = (char)922914205;

            for (int var6 = var3 - 1; var6 > 0; var6--) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 851160619);
               } else {
                  var5[var6] = (char)(-1932783941 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIZ)Ljava/lang/String;")
   @ObfuscatedName("be")
   static String method8376(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= -931798758) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for (int var4 = var0 / var1; var4 != 0; var3++) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = (char)540199558;

            for (int var6 = var3 - 1; var6 > 0; var6--) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 87);
               } else {
                  var5[var6] = (char)(-1864296173 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIZ)Ljava/lang/String;")
   @ObfuscatedName("by")
   static String method8377(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 1122683234) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for (int var4 = var0 / var1; var4 != 0; var3++) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = '+';

            for (int var6 = var3 - 1; var6 > 0; var6--) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 381694910);
               } else {
                  var5[var6] = (char)(48 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bq")
   public static int method8379(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + classOG.method8434(var0.charAt(var3), (byte)-29);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("co")
   public static String method8398(CharSequence var0) {
      return classJC.method6352((char)14641147, var0.length(), 634319926);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bs")
   public static int method8380(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + classOG.method8434(var0.charAt(var3), (byte)99);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bd")
   public static int method8381(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("bl")
   public static int method8382(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bv")
   public static boolean method8384(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cq")
   public static boolean method8389(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("an")
   public static boolean method8357(CharSequence var0) {
      return classMQ.method7641(var0, 10, true, -349565276);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cr")
   public static boolean method8386(char var0) {
      return var0 >= -1559204334 && var0 <= 1170570461;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cu")
   public static boolean method8387(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cb")
   public static boolean method8388(char var0) {
      return var0 >= 1928082441 && var0 <= 255071991;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ct")
   public static boolean method8390(char var0) {
      return var0 >= '0' && var0 <= 1510029139 || var0 >= -2087781551 && var0 <= 'Z' || var0 >= -2118067101 && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cp")
   public static boolean method8391(char var0) {
      return var0 >= '0' && var0 <= 1092489757 || var0 >= 'A' && var0 <= 'Z' || var0 >= -1997618917 && var0 <= 1679277135;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bz")
   public static boolean method8385(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cl")
   public static String method8392(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && 402 != var5) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || '?' == var5 || '!' == var5) {
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
   @ObfuscatedName("cd")
   public static String method8393(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && 402 != var5) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || '?' == var5 || -1535962830 == var5) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZ)I")
   @ObfuscatedName("bj")
   public static int method8368(CharSequence var0, int var1, boolean var2) {
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

            int var9 = var8 + var5 * var1;
            if (var5 != var9 / var1) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cs")
   public static String method8394(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && 402 != var5) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || '?' == var5 || '!' == var5) {
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

   static {
      Pattern.compile("^\\D*(\\d+)\\D*$");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cv")
   public static String method8395(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for (int var4 = 0; var4 < var1; var4++) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && 402 != var5) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 == '.' || -1825519722 == var5 || '!' == var5) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
   @ObfuscatedName("ck")
   public static String method8399(CharSequence var0) {
      return classJC.method6352('*', var0.length(), 1326971333);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)Z")
   @ObfuscatedName("am")
   public static boolean method8358(CharSequence var0) {
      return classMQ.method7641(var0, 10, true, -349565276);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)Ljava/lang/String;")
   @ObfuscatedName("bb")
   public static String method8374(int var0, boolean var1) {
      return var1 && var0 >= 0 ? classBZ.method1390(var0, 10, var1, -2084927858) : Integer.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cf")
   public static boolean method8401(char var0) {
      if (var0 >= -1128117879 && var0 <= 1987744575) {
         return true;
      } else {
         return var0 >= -399997803 && var0 <= 255 ? true : 8364 == var0 || -742893524 == var0 || -1893360990 == var0 || 339 == var0 || var0 == -1266676627;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cn")
   public static int method8402(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ch")
   public static int method8403(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
