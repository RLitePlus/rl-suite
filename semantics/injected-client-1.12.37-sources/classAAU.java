import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aau")
public class classAAU {
   @ObfuscatedName("az")
   public static int field102 = -214038637;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field103 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("df")
   public static void method274(Model var0) {
      if (var0 == null) {
         var0.method5176();
      }

      for (int var1 = 0; var1 < 12; var1++) {
         Model.field2457[var1] = 0;
         Model.field2480[var1] = 0;
      }

      for (int var13 = var0.field2493 - 1; var13 >= 0; var13--) {
         char var2 = Model.field2455[var13];
         if (var2 > 0) {
            char[] var3 = Model.field2456[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = var0.field2431[var5];
               int var7 = Model.field2457[var6]++;
               Model.field2458[var6][var7] = var5;
               if (var6 < 10) {
                  Model.field2480[var6] = Model.field2480[var6] + var13;
               } else if (var6 == 10) {
                  Model.field2459[var7] = var13;
               } else {
                  Model.field2467[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (Model.field2457[1] > 0 || Model.field2457[2] > 0) {
         var14 = (Model.field2480[1] + Model.field2480[2]) / (Model.field2457[1] + Model.field2457[2]);
      }

      int var15 = 0;
      if (Model.field2457[3] > 0 || Model.field2457[4] > 0) {
         var15 = (Model.field2480[3] + Model.field2480[4]) / (Model.field2457[3] + Model.field2457[4]);
      }

      int var16 = 0;
      if (Model.field2457[6] > 0 || Model.field2457[8] > 0) {
         var16 = (Model.field2480[6] + Model.field2480[8]) / (Model.field2457[6] + Model.field2457[8]);
      }

      int var18 = 0;
      int var19 = Model.field2457[10];
      int[] var20 = Model.field2458[10];
      int[] var8 = Model.field2459;
      if (var18 == var19) {
         var18 = 0;
         var19 = Model.field2457[11];
         var20 = Model.field2458[11];
         var8 = Model.field2467;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            var0.method5187(var20[var18++]);
            if (var18 == var19 && var20 != Model.field2458[11]) {
               var18 = 0;
               var19 = Model.field2457[11];
               var20 = Model.field2458[11];
               var8 = Model.field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            var0.method5187(var20[var18++]);
            if (var18 == var19 && var20 != Model.field2458[11]) {
               var18 = 0;
               var19 = Model.field2457[11];
               var20 = Model.field2458[11];
               var8 = Model.field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            var0.method5187(var20[var18++]);
            if (var18 == var19 && var20 != Model.field2458[11]) {
               var18 = 0;
               var19 = Model.field2457[11];
               var20 = Model.field2458[11];
               var8 = Model.field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = Model.field2457[var9];
         int[] var11 = Model.field2458[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            var0.method5187(var11[var12]);
         }
      }

      while (var17 != -1000) {
         var0.method5187(var20[var18++]);
         if (var18 == var19 && var20 != Model.field2458[11]) {
            var18 = 0;
            var20 = Model.field2458[11];
            var19 = Model.field2457[11];
            var8 = Model.field2467;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("sm")
   public static int method273(classZD var0) {
      if (var0 == null) {
         var0.method13955();
      }

      return var0.method13845(689632222) ? 0 : var0.field7170.field8 + ((classAAY)var0.field7158.get(var0.field7158.size() - 1)).field115 * 1749054646;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
   @ObfuscatedName("az")
   public static void method275(String var0, Throwable var1, byte var2) {
      Throwable var3 = var1;
      if (var1 instanceof classAAF && "".equals(var1.getMessage())) {
         var3 = var1.getCause();
      }

      if (var0 == null) {
         client.logger.error("Client error", var3);
      } else {
         client.logger.error("Client error: {}", var0, var3);
      }

      classOE.client.getCallbacks().error(var0, var3);
   }

   classAAU() throws Throwable {
      throw new Error();
   }
}
