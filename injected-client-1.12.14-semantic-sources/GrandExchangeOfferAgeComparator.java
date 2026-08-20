import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qz")
final class GrandExchangeOfferAgeComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("dm")
   static final int field5495 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("cc")
   public static final int field5494 = 81;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("lu")
   public static int method9272(GrandExchangeOfferAgeComparator var0, Object var1, Object var2) {
      return var0 == null ? var0.method9274(var1, var1) : var0.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 108377882);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method9273(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1494351153);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 2052088369);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qz.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qz.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;I)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, int var3) {
      try {
         byte var10000;
         if (var1.age * 8132046234609306567L < 8132046234609306567L * var2.age) {
            if (var3 == -808765715) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var1.age * 8132046234609306567L == 8132046234609306567L * var2.age) {
            if (var3 == -808765715) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qz.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method9274(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1501283503);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method9276(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;Ljava/lang/Object;)Z")
   @ObfuscatedName("bk")
   public static boolean method9277(GrandExchangeOfferAgeComparator var0, Object var1) {
      if (var0 == null) {
         var0.method9274(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method9275(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, -1681491188);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method9278(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aj")
   int method9271(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.age * 8132046234609306567L < 8132046234609306567L * var2.age
         ? -1
         : (var1.age * 8132046234609306567L == 8132046234609306567L * var2.age ? 0 : 1);
   }
}
