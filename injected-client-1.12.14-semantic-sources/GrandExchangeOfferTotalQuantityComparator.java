import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qv")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field5424 = 22;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;)Ldq;")
   @ObfuscatedName("yv")
   public static RawSound method9192(SoundEffect var0) {
      return var0.field1516 == 0 ? var0.method3580(false) : var0.field1518.method3875((byte)57);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("ak")
   int method9181(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity * 966823731 < -518274220 * var2.grandExchangeOffer.totalQuantity
         ? -1
         : (966823731 * var1.grandExchangeOffer.totalQuantity == var2.grandExchangeOffer.totalQuantity * 966823731 ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)I")
   @ObfuscatedName("qi")
   public static int method9180(HintArrow var0) {
      return var0.subX * 1076175705;
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;I)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, int var3) {
      try {
         byte var10000;
         if (var1.grandExchangeOffer.totalQuantity * 966823731 < 966823731 * var2.grandExchangeOffer.totalQuantity) {
            var10000 = -1;
         } else if (966823731 * var1.grandExchangeOffer.totalQuantity == var2.grandExchangeOffer.totalQuantity * 966823731) {
            if (var3 == 1386932708) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qv.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqu;Lvc;J)V")
   @ObfuscatedName("yp")
   public static void method9179(IndexedObjectSet var0, IndexedObjectNode var1, long var2) {
      if (var0 == null) {
         var0.add(var1, var2);
      } else {
         if (var1.previousNode != null) {
            var1.detach();
         }

         IndexedObjectNode var4 = var0.nodes[(int)(var2 & var0.size - 1)];
         var1.previousNode = var4.previousNode;
         var1.nextNode = var4;
         var1.previousNode.nextNode = var1;
         var1.nextNode.previousNode = var1;
         var1.idx = var2;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1860381569);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qv.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lti;Lxv;Lxv;)V")
   @ObfuscatedName("nw")
   public static void method9194(UserList var0, Username var1, Username var2) {
      if (var0 == null) {
         var0.method10740(var1, var1);
      }

      var0.vmethod351(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqv;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("xp")
   public static int method9185(GrandExchangeOfferTotalQuantityComparator var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method9188(var1, var1);
      }

      return var0.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1754881359);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qv.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method9186(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1659142532);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aj")
   int method9183(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity * -1789476106 < 966823731 * var2.grandExchangeOffer.totalQuantity
         ? -1
         : (1585359001 * var1.grandExchangeOffer.totalQuantity == var2.grandExchangeOffer.totalQuantity * 98084890 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method9187(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 1538692194);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method9188(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, -98985595);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("av")
   static int method9178(int var0, int var1, int var2) {
      try {
         ItemContainer var3 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (var3 == null) {
            if (var2 <= 1899954834) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= 1899954834) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.ids.length) {
                  return var3.ids[var1];
               }

               if (var2 <= 1899954834) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qv.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method9189(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("ap")
   int method9184(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity * 971627075 < 966823731 * var2.grandExchangeOffer.totalQuantity
         ? -1
         : (966823731 * var1.grandExchangeOffer.totalQuantity == var2.grandExchangeOffer.totalQuantity * 966823731 ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;Lxa;)V")
   @ObfuscatedName("xh")
   public static void method9193(PlayerComposition var0, Buffer var1) {
      var1.writeByte(-1972367910 * var0.gender, (short)-11616);

      for (int var2 = 0; var2 < 7; var2++) {
         int var3 = var0.equipment[class204.method4644(var2, 29079574)];
         if (var3 == 0) {
            var1.writeShort(-1, -1350679135);
         } else {
            var1.writeShort(var3 - 851837319, -1265722437);
         }
      }

      for (int var4 = 0; var4 < 5; var4++) {
         var1.writeByte(var0.bodyColors[var4], (short)-25087);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqv;Ljava/lang/Object;)Z")
   @ObfuscatedName("dr")
   public static boolean method9190(GrandExchangeOfferTotalQuantityComparator var0, Object var1) {
      if (var0 == null) {
         var0.method9191(var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method9191(Object var1) {
      return super.equals(var1);
   }
}
