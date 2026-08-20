import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("je")
public final class classJE {
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field3140 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3139 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field3142 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field3141 = 38;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3143 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field3144 = 94;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field3145 = 5;

   classJE() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public static String method6358(String var0, byte var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for (int var5 = 0; var5 < var2; var5++) {
            if (var1 == 15) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (0 == var4) {
               if (var1 == 15) {
                  throw new IllegalStateException();
               }

               var6 = Character.toLowerCase(var6);
            } else {
               label97: {
                  if (var4 != 2) {
                     if (var1 == 15) {
                        throw new IllegalStateException();
                     }

                     if (!Character.isUpperCase(var6)) {
                        break label97;
                     }

                     if (var1 == 15) {
                        throw new IllegalStateException();
                     }
                  }

                  char var7;
                  if (var6 != 181 && 402 != var6) {
                     var7 = Character.toTitleCase(var6);
                  } else {
                     var7 = var6;
                  }

                  var6 = var7;
               }
            }

            if (Character.isLetter(var6)) {
               if (var1 == 15) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else {
               label73: {
                  if (var6 != '.' && '?' != var6) {
                     if (var1 == 15) {
                        throw new IllegalStateException();
                     }

                     if ('!' != var6) {
                        if (Character.isSpaceChar(var6)) {
                           if (2 != var4) {
                              var4 = 1;
                           }
                        } else {
                           var4 = 1;
                        }
                        break label73;
                     }

                     if (var1 == 15) {
                        throw new IllegalStateException();
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "je.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("ag")
   static final float method6356(float var0, int var1) {
      try {
         var0 = (var0 - 75.0F) * 1.0100503F;
         return 150.75377F / var0 + 1.0100503F;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "je.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ax")
   public static boolean method6357(int var0, byte var1) {
      try {
         return var0 >= 78062377 * classKB.field3531.field3538 && var0 <= 78062377 * classKB.field3534.field3538;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "je.ax(" + ')');
      }
   }
}
