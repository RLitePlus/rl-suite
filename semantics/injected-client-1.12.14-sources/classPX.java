import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("px")
public class classPX {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5261 = 235;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field5262 = 171;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;)V")
   @ObfuscatedName("na")
   public static void method8816(AccessFile var0) throws IOException {
      if (var0 == null) {
         var0.method11816();
      } else {
         AccessFile.method11807(var0, false, (byte)-59);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lld;Ljava/lang/Object;)Z")
   @ObfuscatedName("yn")
   public static boolean method8815(WorldMapData_0 var0, Object var1) {
      if (var0 == null) {
         return var0.equals(var1);
      } else if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return 1415052445 * var0.regionX == 1415052445 * var2.regionX && -588647407 * var2.regionY == -588647407 * var0.regionY;
      }
   }

   classPX() throws Throwable {
      throw new Error();
   }
}
