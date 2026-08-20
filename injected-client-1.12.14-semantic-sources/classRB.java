import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rb")
public class classRB {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5506 = 15;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLqd;)I")
   @ObfuscatedName("as")
   static int method9357(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (1994241979 == var0 && var1 == Language.Language_ES) {
         var2 = 1238177472;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLqd;)I")
   @ObfuscatedName("ac")
   static int method9358(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (840574776 == var0 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;)I")
   @ObfuscatedName("aj")
   public static int method9345(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         int var9;
         if (0 != var7) {
            var9 = var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         int var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (338 == var9) {
            var11 = 234095619;
         } else if (339 == var9) {
            var11 = 159324830;
         } else {
            var11 = 0;
         }

         var7 = var11;
         var8 = Sound.method4250(var10, -2134111008);
         char var18 = Actor.standardizeChar((char)var9, var2, 259298383);
         var10 = Actor.standardizeChar(var10, var2, -1195375987);
         if (var10 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var10)) {
            var18 = Character.toLowerCase(var18);
            var10 = Character.toLowerCase(var10);
            if (var10 != var18) {
               return class329.lowercaseChar(var18, var2, (byte)80) - class329.lowercaseChar(var10, var2, (byte)-9);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var12 = var1.charAt(var6);
         if (var12 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var12)) {
            var25 = Character.toLowerCase(var25);
            var12 = Character.toLowerCase(var12);
            if (var25 != var12) {
               return class329.lowercaseChar(var25, var2, (byte)-24) - class329.lowercaseChar(var12, var2, (byte)-25);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var29 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var13 != var29) {
               return class329.lowercaseChar(var29, var2, (byte)-54) - class329.lowercaseChar(var13, var2, (byte)-32);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)Ljava/lang/String;")
   @ObfuscatedName("ys")
   public static String method9350(WorldMapArea var0) {
      return var0.externalName;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lee;Lem;)[F")
   @ObfuscatedName("oo")
   public static float[] method9356(VorbisCodebook var0, classEM var1) {
      return var0.field1564[class525.method11170(var0, var1)];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;)I")
   @ObfuscatedName("ak")
   public static int method9346(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      char var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (0 != var7) {
            var9 = (char)var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (338 == var9) {
            var11 = 69;
         } else if (339 == var9) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         var8 = Sound.method4250(var10, -2098093922);
         var9 = Actor.standardizeChar(var9, var2, -983944226);
         var10 = Actor.standardizeChar(var10, var2, -1027076661);
         if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var10 != var9) {
               return class329.lowercaseChar(var9, var2, (byte)60) - class329.lowercaseChar(var10, var2, (byte)86);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var12 = var1.charAt(var6);
         if (var12 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var12)) {
            var25 = Character.toLowerCase(var25);
            var12 = Character.toLowerCase(var12);
            if (var25 != var12) {
               return class329.lowercaseChar(var25, var2, (byte)-70) - class329.lowercaseChar(var12, var2, (byte)-63);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var29 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var13 != var29) {
               return class329.lowercaseChar(var29, var2, (byte)-24) - class329.lowercaseChar(var13, var2, (byte)6);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLqd;)C")
   @ObfuscatedName("aw")
   static char method9348(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && Language.Language_ES != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (221 == var0) {
            return 'Y';
         }

         if (223 == var0) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && Language.Language_ES != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return 376 == var0 ? 'Y' : var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLqd;)C")
   @ObfuscatedName("ap")
   static char method9349(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && Language.Language_ES != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (221 == var0) {
            return 'Y';
         }

         if (223 == var0) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && Language.Language_ES != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return 376 == var0 ? 'Y' : var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ai")
   static char method9351(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (223 == var0) {
         return 's';
      } else if (338 == var0) {
         return 'E';
      } else {
         return (char)(339 == var0 ? 'e' : '\u0000');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ay")
   static char method9352(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (223 == var0) {
         return 's';
      } else if (338 == var0) {
         return 'E';
      } else {
         return (char)(339 == var0 ? 'e' : '\u0000');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("az")
   static char method9353(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (223 == var0) {
         return 's';
      } else if (338 == var0) {
         return 'E';
      } else {
         return (char)(339 == var0 ? 'e' : '\u0000');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ad")
   static char method9354(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (223 == var0) {
         return 's';
      } else if (338 == var0) {
         return 'E';
      } else {
         return (char)(339 == var0 ? 'e' : '\u0000');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLqd;)I")
   @ObfuscatedName("ab")
   static int method9359(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (241 == var0 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("au")
   static char method9355(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (223 == var0) {
         return 's';
      } else if (338 == var0) {
         return 'E';
      } else {
         return (char)(339 == var0 ? 'e' : '\u0000');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;)I")
   @ObfuscatedName("ae")
   public static int method9347(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      char var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (0 != var7) {
            var9 = (char)var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (338 == var9) {
            var11 = 69;
         } else if (339 == var9) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         var8 = Sound.method4250(var10, -2103120472);
         var9 = Actor.standardizeChar(var9, var2, -73908643);
         var10 = Actor.standardizeChar(var10, var2, -1448828994);
         if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var10 != var9) {
               return class329.lowercaseChar(var9, var2, (byte)-10) - class329.lowercaseChar(var10, var2, (byte)-30);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var12 = var1.charAt(var6);
         if (var12 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var12)) {
            var25 = Character.toLowerCase(var25);
            var12 = Character.toLowerCase(var12);
            if (var25 != var12) {
               return class329.lowercaseChar(var25, var2, (byte)78) - class329.lowercaseChar(var12, var2, (byte)86);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var29 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var13 != var29) {
               return class329.lowercaseChar(var29, var2, (byte)-40) - class329.lowercaseChar(var13, var2, (byte)43);
            }
         }

         return 0;
      }
   }

   classRB() throws Throwable {
      throw new Error();
   }
}
