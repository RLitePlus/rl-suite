import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ks")
public abstract class RouteStrategy {
   @ObfuscatedName("av")
   public int approxDestinationX;
   @ObfuscatedName("ub")
   static int field3430;
   @ObfuscatedName("an")
   public int approxDestinationSizeX;
   @ObfuscatedName("at")
   public int approxDestinationY;
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field3429 = 1006;
   @ObfuscatedName("ag")
   public int approxDestinationSizeY;

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("ag")
   protected abstract boolean vmethod40(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedSignature(descriptor = "(IIILkk;B)Z")
   @ObfuscatedName("av")
   protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4, byte var5);

   @ObfuscatedSignature(descriptor = "(Ljh;)V")
   @ObfuscatedName("sl")
   public static void method6613(Scene var0) {
      if (var0 == null) {
         var0.method5638();
      }

      var0.viewportWalking = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqp;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ys")
   public static int method6611(GrandExchangeOfferNameComparator var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.compare(var1, var1);
      }

      return GrandExchangeOfferNameComparator.method9128(var0, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)-5);
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("ae")
   protected abstract boolean vmethod41(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("an")
   protected abstract boolean vmethod42(int var1, int var2, int var3, CollisionMap var4);

   protected RouteStrategy() {
   }

   @ObfuscatedSignature(descriptor = "(IIILkk;)Z")
   @ObfuscatedName("at")
   protected abstract boolean vmethod38(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2, int var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;

         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var0[var6 + var1] & 255;
            if (var7 == 0) {
               if (var3 != 1895064943) {
                  throw new IllegalStateException();
               }
            } else {
               if (var7 >= 128) {
                  if (var3 != 1895064943) {
                     throw new IllegalStateException();
                  }

                  if (var7 < 160) {
                     if (var3 != 1895064943) {
                        throw new IllegalStateException();
                     }

                     char var8 = class451.cp1252AsciiExtension[var7 - 128];
                     if (var8 == 0) {
                        if (var3 != 1895064943) {
                           throw new IllegalStateException();
                        }

                        var8 = '?';
                     }

                     var7 = var8;
                  }
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ks.aw(" + ')');
      }
   }
}
