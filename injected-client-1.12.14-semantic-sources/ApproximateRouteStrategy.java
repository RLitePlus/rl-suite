import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ba")
public class ApproximateRouteStrategy extends RouteStrategy {
   @ObfuscatedSignature(descriptor = "Luw;")
   @ObfuscatedName("nn")
   static GraphicsDefaults field106;
   @ObfuscatedName("nq")
   static boolean field107;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field104 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field105 = 74;

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("at")
   @Override
   protected boolean vmethod38(int var1, int var2, int var3, CollisionMap var4) {
      return -119525533 * this.approxDestinationSizeY == var2 && this.approxDestinationX * 1419634615 == var3;
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;B)Z")
   @ObfuscatedName("av")
   @Override
   protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4, byte var5) {
      try {
         return -119525533 * this.approxDestinationSizeY == var2 && this.approxDestinationX * 1419634615 == var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ba.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("ag")
   @Override
   protected boolean vmethod40(int var1, int var2, int var3, CollisionMap var4) {
      return -119525533 * this.approxDestinationSizeY == var2 && this.approxDestinationX * 1419634615 == var3;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("at")
   public static String method382(long var0) {
      try {
         if (var0 <= 0L || var0 >= 6582952005840035281L) {
            return null;
         } else if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(class455.base37Table[(int)(var6 - 37L * var0)]);
            }

            return var5.reverse().toString();
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ba.at(" + ')');
      }
   }

   ApproximateRouteStrategy() {
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("ae")
   @Override
   protected boolean vmethod41(int var1, int var2, int var3, CollisionMap var4) {
      return -119525533 * this.approxDestinationSizeY == var2 && this.approxDestinationX * 1419634615 == var3;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("nn")
   static final int method383(byte var0) {
      try {
         float var1 = 200.0F * ((float)class468.clientPreferences.getBrightness(1700476144) - 0.5F);
         return 100 - Math.round(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ba.nn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lcz;")
   @ObfuscatedName("ae")
   static class67[] method381(int var0) {
      try {
         return new class67[]{
            class67.field1271, class67.field1272, class67.field1269, class67.field1270, class67.field1266, class67.field1268, class67.field1267
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ba.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod42(int var1, int var2, int var3, CollisionMap var4) {
      return -119525533 * this.approxDestinationSizeY == var2 && this.approxDestinationX * 1419634615 == var3;
   }
}
