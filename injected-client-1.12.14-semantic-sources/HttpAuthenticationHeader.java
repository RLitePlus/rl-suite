import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("so")
public class HttpAuthenticationHeader {
   @ObfuscatedSignature(descriptor = "Lso;")
   @ObfuscatedName("at")
   static final HttpAuthenticationHeader BEARER = new HttpAuthenticationHeader("Bearer");
   @ObfuscatedName("ag")
   final String key;
   @ObfuscatedSignature(descriptor = "Lso;")
   @ObfuscatedName("av")
   static final HttpAuthenticationHeader BASIC = new HttpAuthenticationHeader("Basic");
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5851 = 768;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("al")
   public static AbstractArchive field5852;

   @ObfuscatedSignature(descriptor = "(Lso;B)Ljava/lang/String;")
   @ObfuscatedName("jk")
   public static String method10489(HttpAuthenticationHeader var0, byte var1) {
      if (var0 == null) {
         return var0.getKey(var1);
      } else {
         try {
            return var0.key;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "so.av(" + ')');
         }
      }
   }

   HttpAuthenticationHeader(String var1) {
      this.key = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("an")
   static void itemContainerSetItem(int var0, int var1, int var2, int var3, int var4) {
      try {
         ItemContainer var5 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (var5 == null) {
            var5 = new ItemContainer();
            ItemContainer.itemContainers.put(var5, var0);
         }

         if (var5.ids.length <= var1) {
            if (var4 >= -1916438590) {
               throw new IllegalStateException();
            }

            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[var1 + 1];

            for (int var8 = 0; var8 < var5.ids.length; var8++) {
               var6[var8] = var5.ids[var8];
               var7[var8] = var5.quantities[var8];
            }

            for (int var10 = var5.ids.length; var10 < var1; var10++) {
               if (var4 >= -1916438590) {
                  return;
               }

               var6[var10] = -1;
               var7[var10] = 0;
            }

            var5.ids = var6;
            var5.quantities = var7;
         }

         var5.ids[var1] = var2;
         var5.quantities[var1] = var3;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "so.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   String method10490() {
      return this.key;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("at")
   String method10491() {
      return this.key;
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("av")
   String getKey(byte var1) {
      try {
         return this.key;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "so.av(" + ')');
      }
   }
}
