import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xw")
public class classXW {
   @ObfuscatedSignature(descriptor = "Lxw;")
   @ObfuscatedName("af")
   static final classXW field6949 = new classXW();
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field6950 = 26;
   @ObfuscatedSignature(descriptor = "Lxw;")
   @ObfuscatedName("ae")
   static final classXW field6948 = new classXW();
   @ObfuscatedSignature(descriptor = "Lxw;")
   @ObfuscatedName("ab")
   static final classXW field6947 = new classXW();
   @ObfuscatedSignature(descriptor = "Lxw;")
   @ObfuscatedName("az")
   static final classXW field6946 = new classXW();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   static int method12952(int var0) {
      try {
         if (client.field1002 != null) {
            if (var0 == 312940074) {
               throw new IllegalStateException();
            }

            if (-1506417701 * client.field802 < client.field1002.size()) {
               int var1 = 0;

               for (int var2 = 0; var2 <= -1506417701 * client.field802; var2++) {
                  if (var0 == 312940074) {
                     throw new IllegalStateException();
                  }

                  var1 += ((classDT)client.field1002.get(var2)).field1625 * -1687991555;
               }

               return var1 * 10000 / (client.field1004 * 663040367);
            }

            if (var0 == 312940074) {
               throw new IllegalStateException();
            }
         }

         return 10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "xw.al(" + 41);
      }
   }

   classXW() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;)Lpi;")
   @ObfuscatedName("cd")
   public static PlayerCompositionColorTextureOverride method12951(TileItem var0) {
      return var0.field1559;
   }

   @ObfuscatedSignature(descriptor = "(JIZZLrz;B)Ljava/lang/String;")
   @ObfuscatedName("af")
   static String method12950(long var0, int var2, boolean var3, boolean var4, classRZ var5, byte var6) {
      try {
         boolean var10000;
         if (var0 < 0L) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         String var8 = Long.toString(var0);
         if (var7) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var8 = var8.substring(1);
         }

         String var10 = null;
         String var9;
         if (var2 > 0) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            while (var8.length() <= var2) {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               var8 = "0" + var8;
            }

            int var11 = var8.length() - var2;
            var9 = var8.substring(0, var11);
            String var12 = var8.substring(var11);
            String var13;
            if (!var4) {
               var13 = var12;
            } else {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               int var15;
               for (var15 = var12.length(); var15 > 0 && var12.charAt(var15 - 1) == '0'; var15--) {
                  if (var6 == 0) {
                     throw new IllegalStateException();
                  }
               }

               String var22;
               if (var15 == 0) {
                  if (var6 == 0) {
                     throw new IllegalStateException();
                  }

                  var22 = null;
               } else {
                  var22 = var12.substring(0, var15);
               }

               String var14 = var22;
               var13 = var14;
            }

            var10 = var13;
         } else {
            var9 = var8;
         }

         if (var3) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            StringBuilder var19 = new StringBuilder();
            int var20 = var9.length() % 3;
            if (0 == var20) {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               var20 = 3;
            }

            var19.append(var9, 0, var20);

            for (int var21 = var20; var21 < var9.length(); var21 += 3) {
               var19.append(",").append(var9, var21, 3 + var21);
            }

            String var17 = var19.toString();
            var9 = var17;
         }

         StringBuilder var18 = new StringBuilder();
         if (var7) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var18.append('-');
         }

         var18.append(var9);
         if (var10 != null) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var18.append(".").append(var10);
         }

         return var18.toString();
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "xw.af(" + ')');
      }
   }
}
