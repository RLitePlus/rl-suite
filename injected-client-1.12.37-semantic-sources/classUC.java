import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uc")
public class classUC extends classVJ {
   @ObfuscatedName("af")
   int field6285;
   @ObfuscatedName("ae")
   byte field6284;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("az")
   classVP field6286;

   classUC() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvh;I)I")
   @ObfuscatedName("km")
   public static int method11262(classVH var0, int var1) {
      return var0 == null ? var0.method11950(var1) : var0.field6505[var1 & 15];
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)Ljava/lang/Integer;")
   @ObfuscatedName("az")
   static Integer method11261(classXY var0, int var1) {
      try {
         int var2 = 0;
         boolean var3 = false;

         label65:
         while (true) {
            int var4 = classXY.method13039(var0, -346779531);
            if (var4 == 255) {
               if (var1 != -1964428479) {
                  throw new IllegalStateException();
               }

               return var3 ? var2 : null;
            }

            if (var4 != 0) {
               if (var1 != -1964428479) {
                  throw new IllegalStateException();
               }

               throw new IllegalStateException("");
            }

            while (true) {
               int var5 = classXY.method13039(var0, -346779531);
               if (255 == var5) {
                  if (var1 != -1964428479) {
                     break label65;
                  }
                  break;
               }

               var0.field6955 -= -1095856699;
               if (classXY.method13047(var0, -1645209627) != 0) {
                  if (var1 != -1964428479) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("");
               }

               if (var3) {
                  if (var1 != -1964428479) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("");
               }

               var2 = var0.method13056((byte)1);
               var3 = true;
            }
         }

         throw new IllegalStateException();
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "uc.az(" + 41);
      }
   }
}
