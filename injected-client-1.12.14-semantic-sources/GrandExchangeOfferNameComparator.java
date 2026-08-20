import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qp")
final class GrandExchangeOfferNameComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field5402 = 28;

   @ObfuscatedSignature(descriptor = "(Lut;Lut;II)V")
   @ObfuscatedName("al")
   public static void method9136(DynamicArray var0, DynamicArray var1, int var2, int var3) {
      try {
         class461.method9338(var0, null, true, -928498657);
         ProjectionCoord.method9919(var1, var0.field6107, 297207701);
         if (var2 >= 0) {
            if (var3 != 122104396) {
               return;
            }

            if (var2 <= var0.size * 1583568339) {
               if (0 == 1583568339 * var1.size) {
                  return;
               }

               DynamicArray.method11228(var0, var1.size * 1583568339 + 1583568339 * var0.size, 831818629);
               if (var2 < var0.size * 1583568339) {
                  if (var3 != 122104396) {
                     throw new IllegalStateException();
                  }

                  HttpResponse.method142(var0, var2, var0, var2 + var1.size * 1583568339, var0.size * 1583568339 - var2, (byte)2);
               }

               HttpResponse.method142(var1, 0, var0, var2, 1583568339 * var1.size, (byte)2);
               var0.size = var0.size + var1.size * 1;
               return;
            }

            if (var3 != 122104396) {
               return;
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method9133(Object var1) {
      return super.equals(var1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qp.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("mv")
   public static void method9130(PacketBuffer var0) {
      if (var0 == null) {
         var0.method12328();
      }

      var0.bitIndex = var0.offset * -1840678392;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method9131(Object var1, Object var2) {
      return method9128(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)-60);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method9132(Object var1, Object var2) {
      return method9128(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)-82);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method9134(Object var1) {
      return super.equals(var1);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method9128(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)-3);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qp.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method9135(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("ak")
   int method9126(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName((byte)-56).compareTo(var2.getOfferName((byte)39));
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aj")
   int method9127(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName((byte)-12).compareTo(var2.getOfferName((byte)-116));
   }

   @ObfuscatedSignature(descriptor = "(Lqp;Lqk;Lqk;B)I")
   @ObfuscatedName("dg")
   public static int method9128(GrandExchangeOfferNameComparator var0, GrandExchangeEvent var1, GrandExchangeEvent var2, byte var3) {
      if (var0 == null) {
         return var0.compare_bridged(var1, var1, var3);
      } else {
         try {
            return var1.getOfferName((byte)-8).compareTo(var2.getOfferName((byte)24));
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "qp.av(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;IB)Ljava/lang/String;")
   @ObfuscatedName("ow")
   static String method9137(Widget var0, int var1, byte var2) {
      try {
         int var4 = class69.getWidgetFlags2(var0, (byte)-20);
         boolean var10000;
         if ((var4 >> var1 & 1) != 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (!var3 && null == var0.onClickRepeat) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (null != var0.actions) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var0.actions.length > var1) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0.actions[var1] != null) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (!var0.actions[var1].trim().isEmpty()) {
                        return var0.actions[var1];
                     }

                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "qp.ow(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;B)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, byte var3) {
      try {
         return var1.getOfferName((byte)-8).compareTo(var2.getPreviousOfferName((byte)24));
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qp.av(" + 41);
      }
   }
}
