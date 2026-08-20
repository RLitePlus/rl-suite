import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qq")
public class GrandExchangeEvents {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field5410 = 146;
   @ObfuscatedName("at")
   public static Comparator GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field5408 = 19;
   @ObfuscatedName("an")
   public static Comparator GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
   @ObfuscatedName("ae")
   public final List events;
   @ObfuscatedName("av")
   public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
   @ObfuscatedName("ag")
   public static Comparator GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field5409 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("dy")
   static final String field5411 = "game-session/v1/tokens";

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;Z)V")
   @ObfuscatedName("ag")
   public void method9141(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }
   }

   public GrandExchangeEvents(Buffer var1, boolean var2) {
      int var3 = Buffer.method12008(var1, (byte)5);
      boolean var4 = var1.readUnsignedByte(-437630212) == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = Buffer.method12008(var1, (byte)5);
      this.events = new ArrayList(var6);

      for (int var7 = 0; var7 < var6; var7++) {
         this.events.add(new GrandExchangeEvent(var1, var5, var3));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqo;)V")
   @ObfuscatedName("dx")
   public static void method9139(IndexedObjectSetIterator var0) {
      if (var0 == null) {
         var0.method9122();
      }

      var0.field5401 = var0.field5399.nodes[0].nextNode;
      var0.field5400 = 1;
      var0.field5398 = null;
   }

   static {
      new GrandExchangeOfferWorldComparator();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;ZB)V")
   @ObfuscatedName("av")
   public void sort(Comparator var1, boolean var2, byte var3) {
      try {
         if (var2) {
            Collections.sort(this.events, var1);
         } else {
            Collections.sort(this.events, Collections.reverseOrder(var1));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;Z)V")
   @ObfuscatedName("an")
   public void method9143(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhm;Lxa;)V")
   @ObfuscatedName("as")
   public static void method9140(SpotAnimationDefinition var0, Buffer var1) {
      if (var0 == null) {
         var0.method4609(var1);
      } else {
         while (true) {
            int var2 = var1.readUnsignedByte(1900618136);
            if (var2 == 0) {
               return;
            }

            var0.decodeNext(var1, var2, -768977623);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;Z)V")
   @ObfuscatedName("at")
   public void method9144(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lcd;")
   @ObfuscatedName("ae")
   static class66[] method9138(int var0) {
      try {
         return new class66[]{class66.field480, class66.field477, class66.field478, class66.field481, class66.field479};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "qq.ae(" + ')');
      }
   }
}
