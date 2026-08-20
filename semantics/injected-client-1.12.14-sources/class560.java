import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vl")
public abstract class class560 {
   @ObfuscatedName("ay")
   int field6182;
   @ObfuscatedName("az")
   int field6183;
   @ObfuscatedName("au")
   double field6185;
   @ObfuscatedName("ap")
   int field6184 = 0;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("co")
   static SpritePixels leftTitleSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field6186 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvl;)V")
   @ObfuscatedName("ct")
   public static void method11311(class560 var0) {
      if (-2038307183 * var0.field6182 < -793170329 * var0.field6184) {
         var0.field6182 += -1281975695;
         var0.field6185 = LoginScreenAnimation.method1315(
            var0.field6182 * -2038307183, var0.field6184 * -793170329, class358.method7866(1633079139 * var0.field6183, 2072182124), 1841018900
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("al")
   double method11317() {
      return this.field6185;
   }

   @ObfuscatedSignature(descriptor = "(Lvl;B)D")
   @ObfuscatedName("qr")
   public static double method11318(class560 var0, byte var1) {
      if (var0 == null) {
         return var0.method11322(var1);
      } else {
         try {
            return var0.field6185;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vl.ai(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method11312() {
      if (-923706536 * this.field6182 < 580870649 * this.field6184) {
         this.field6182 += 1427270947;
         this.field6185 = LoginScreenAnimation.method1315(
            this.field6182 * -2038307183, this.field6184 * -793170329, class358.method7866(1633079139 * this.field6183, -1487647583), -1557200834
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvl;I)V")
   @ObfuscatedName("zl")
   public static void method11313(class560 var0, int var1) {
      if (var0 == null) {
         var0.method11316(var1);
      }

      try {
         if (-2038307183 * var0.field6182 < -793170329 * var0.field6184) {
            if (var1 == 2077538819) {
               throw new IllegalStateException();
            }

            var0.field6182 += -1281975695;
            var0.field6185 = LoginScreenAnimation.method1315(
               var0.field6182 * -2038307183, var0.field6184 * -793170329, class358.method7866(1633079139 * var0.field6183, 1944344283), -893117453
            );
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vl.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("ah")
   double method11319() {
      return this.field6185;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llt;)I")
   @ObfuscatedName("nf")
   public static int method11323(WorldMapData_1 var0) {
      return var0 == null ? var0.method7271() : var0.chunkY * -472280825;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;)Lvz;")
   @ObfuscatedName("ik")
   public static Node method11324(NodeDeque var0) {
      Node var1 = var0.sentinel.next;
      if (var1 == var0.sentinel) {
         var0.current = null;
         return null;
      } else {
         var0.current = var1.next;
         return var1;
      }
   }

   class560(int var1, int var2) {
      this.field6182 = 0;
      this.field6185 = 0.0;
      this.field6183 = 0;
      this.field6184 = var1 * -354808489;
      this.field6182 = 0;
      this.field6183 = (var2 >= 0 && var2 <= 27 ? var2 : 0) * -709285301;
      this.field6185 = LoginScreenAnimation.method1315(
         this.field6182 * -2038307183, -793170329 * this.field6184, class358.method7866(1633079139 * this.field6183, 1841606677), 396178217
      );
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void method11314() {
      if (-2038307183 * this.field6182 < -793170329 * this.field6184) {
         this.field6182 += -1281975695;
         this.field6185 = LoginScreenAnimation.method1315(
            this.field6182 * -2038307183, this.field6184 * -793170329, class358.method7866(1633079139 * this.field6183, 1277768574), -974678210
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method11315() {
      if (670943101 * this.field6182 < 1253287736 * this.field6184) {
         this.field6182 += -1281975695;
         this.field6185 = LoginScreenAnimation.method1315(
            this.field6182 * -1514501944, this.field6184 * 981139941, class358.method7866(-1256208065 * this.field6183, 1045125932), -1980898139
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("af")
   double method11320() {
      return this.field6185;
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("ar")
   double method11321() {
      return this.field6185;
   }

   @ObfuscatedSignature(descriptor = "(B)D")
   @ObfuscatedName("ai")
   double method11322(byte var1) {
      try {
         return this.field6185;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vl.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public void method11316(int var1) {
      try {
         if (-2038307183 * this.field6184 < -793170329 * this.field6182) {
            if (var1 == 2077538819) {
               throw new IllegalStateException();
            }

            this.field6184 += -1281975695;
            this.field6185 = LoginScreenAnimation.method1315(
               this.field6183 * -2038307183, this.field6182 * -793170329, class358.method7866(1633079139 * this.field6182, 1944344283), -893117453
            );
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vl.ad(" + ')');
      }
   }
}
