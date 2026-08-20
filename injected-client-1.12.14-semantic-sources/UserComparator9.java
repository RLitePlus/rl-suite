import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("en")
public class UserComparator9 extends AbstractUserComparator {
   @ObfuscatedName("av")
   final boolean reversed;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final byte field1620 = 0;
   @ObfuscatedSignature(descriptor = "[Lws;")
   @ObfuscatedName("ad")
   public static BufferedFile[] JagexCache_idxFiles;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field1621 = 63;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;B)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, byte var3) {
      try {
         if (var1.world * 1914416777 == client.worldId * 1312022025) {
            if (var3 != 2) {
               throw new IllegalStateException();
            }

            if (1312022025 * client.worldId == 1914416777 * var2.world) {
               if (var3 != 2) {
                  throw new IllegalStateException();
               }

               return this.reversed
                  ? var1.getUsername((byte)-72).compareToTyped(var2.getUsername((byte)-76), -1369522528)
                  : var2.getUsername((byte)-22).compareToTyped(var1.getUsername((byte)-74), 1456455415);
            }
         }

         return this.compareUser(var1, var2, (byte)-59);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "en.av(" + 41);
      }
   }

   public UserComparator9(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3790(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3791(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3792(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)2);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)2);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "en.compare(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)[B")
   @ObfuscatedName("ra")
   public static byte[] method3794(UrlRequest var0) {
      return var0.response0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Len;Ltm;Ltm;)I")
   @ObfuscatedName("ah")
   public static int method3788(UserComparator9 var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method3789(var1, var1);
      } else if (var1.world * 1914416777 == client.worldId * 1312022025 && 1312022025 * client.worldId == 1914416777 * var2.world) {
         return var0.reversed
            ? var1.getUsername((byte)-65).compareToTyped(var2.getUsername((byte)-54), -332255745)
            : var2.getUsername((byte)-19).compareToTyped(var1.getUsername((byte)-15), -2074489965);
      } else {
         return var0.compareUser(var1, var2, (byte)-117);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method3793(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method3789(Buddy var1, Buddy var2) {
      if (var1.world * 1914416777 == client.worldId * 1312022025 && 1312022025 * client.worldId == 1914416777 * var2.world) {
         return this.reversed
            ? var1.getUsername((byte)-81).compareToTyped(var2.getUsername((byte)-31), -1025602760)
            : var2.getUsername((byte)-92).compareToTyped(var1.getUsername((byte)-128), -1036238789);
      } else {
         return this.compareUser(var1, var2, (byte)-89);
      }
   }
}
