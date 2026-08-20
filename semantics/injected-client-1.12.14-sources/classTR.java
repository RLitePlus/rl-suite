import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tr")
class classTR implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("de")
   static final int field5956 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5955 = 12;

   @ObfuscatedSignature(descriptor = "(Lts;Lcr;I)Z")
   @ObfuscatedName("jw")
   static boolean method10815(WorldEntity var0, Actor var1, int var2) {
      try {
         if (var0 != null) {
            if (var2 <= 1136783843) {
               throw new IllegalStateException();
            }

            if (null != var1) {
               int var3 = var1.size * 1257575232;
               int var4 = 340712311 * var1.x - var3;
               int var5 = var1.y * -1747310679 - var3;
               int var6 = var3 + var1.x * 340712311 - 1;
               int var7 = var3 + -1747310679 * var1.y - 1;
               classVU var8 = StudioGame.method8769(2041145193);
               var8.method11623(
                  WorldEntityConfig.method4768(var0.worldEntityConfig, -1958663222),
                  var0.getY(-791460267),
                  var0.getX(-727737924),
                  WorldEntity.method10834(var0, (byte)32),
                  (byte)-75
               );
               boolean var9 = GrandExchangeOfferOwnWorldComparator.method1277(var8, var4, var5, var6, var7, (byte)-96);
               var8.method11596((byte)109);
               return var9;
            }

            if (var2 <= 1136783843) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "tr.jw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
   @ObfuscatedName("av")
   int method10801(Entry var1, Entry var2, int var3) {
      try {
         return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tr.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method10801((Entry)var1, (Entry)var2, -1927686803);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tr.compare(" + 41);
      }
   }

   classTR(HttpHeaders var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltr;Ljava/lang/Object;)Z")
   @ObfuscatedName("be")
   public static boolean method10811(classTR var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqk;)Ljava/lang/String;")
   @ObfuscatedName("ft")
   public static String method10814(GrandExchangeEvent var0) {
      return var0 == null ? var0.method8938() : var0.offerName;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method10807(Object var1, Object var2) {
      return this.method10801((Entry)var1, (Entry)var2, -1991917103);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltr;Ljava/lang/Object;)Z")
   @ObfuscatedName("ff")
   public static boolean method10812(classTR var0, Object var1) {
      if (var0 == null) {
         var0.compare(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("aw")
   int method10802(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method10808(Object var1, Object var2) {
      return this.method10801((Entry)var1, (Entry)var2, -1727444471);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method10813(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("aj")
   int method10803(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltr;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("fm")
   public static int method10804(classTR var0, Entry var1, Entry var2) {
      return var0 == null ? var0.method10806(var1, var1) : ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("ak")
   int method10805(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method10809(Object var1, Object var2) {
      return this.method10801((Entry)var1, (Entry)var2, -1547779791);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method10810(Object var1, Object var2) {
      return this.method10801((Entry)var1, (Entry)var2, -1669085207);
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("av")
   public static int method10800(int var0, int var1, byte var2) {
      try {
         return var1 + (-3 - var0 << 8);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tr.av(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tr.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("ap")
   int method10806(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }
}
