import net.runelite.api.GrandExchangeOfferState;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qg")
public class GrandExchangeOffer implements net.runelite.api.GrandExchangeOffer {
   @ObfuscatedName("at")
   public int id;
   @ObfuscatedName("av")
   byte state;
   @ObfuscatedName("aj")
   public int currentPrice;
   @ObfuscatedName("an")
   public int totalQuantity;
   @ObfuscatedName("ae")
   public int currentQuantity;
   @ObfuscatedName("ag")
   public int unitPrice;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field5329 = 33;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field5330 = 26;

   public int getItemId() {
      return this.id * -840737413;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqg;)I")
   @ObfuscatedName("qe")
   public static int method8902(GrandExchangeOffer var0) {
      return (var0.state & 8) == 8 ? 1 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqg;)I")
   @ObfuscatedName("wb")
   public static int method8903(GrandExchangeOffer var0) {
      return (var0.state & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method8905(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }
   }

   public GrandExchangeOffer(Buffer var1, boolean var2) {
      this.state = Buffer.method12001(var1, (byte)103);
      this.id = Buffer.method12008(var1, (byte)5) * -830735949;
      this.unitPrice = Buffer.method12015(var1, 1974087918) * -495506635;
      this.totalQuantity = Buffer.method12015(var1, -638406701) * -2105408517;
      this.currentQuantity = Buffer.method12015(var1, 1001106410) * -571636461;
      this.currentPrice = Buffer.method12015(var1, 907106043) * 262778659;
      if (var2) {
         int var4 = 0;
         boolean var5 = false;

         while (true) {
            int var6 = var1.readUnsignedByte(-1394228317);
            if (var6 == 255) {
               Integer var3 = var5 ? var4 : null;
               this.method8890(var3, 1691461046);
               break;
            }

            if (var6 != 0) {
               throw new IllegalStateException("");
            }

            while (true) {
               int var7 = var1.readUnsignedByte(1401950668);
               if (255 == var7) {
                  break;
               }

               var1.offset -= 1741769013;
               if (Buffer.method12008(var1, (byte)5) != 0) {
                  throw new IllegalStateException("");
               }

               if (var5) {
                  throw new IllegalStateException("");
               }

               var4 = Buffer.method12015(var1, -853203395);
               var5 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;I)V")
   @ObfuscatedName("av")
   void method8890(Integer var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qg.av(" + ')');
      }
   }

   public int getPrice() {
      return this.unitPrice * 270012189;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ag")
   void method8899(int var1, byte var2) {
      try {
         this.state &= -8;
         this.state = (byte)(this.state | var1 & 7);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qg.ag(" + ')');
      }
   }

   public GrandExchangeOffer() {
   }

   public int getTotalQuantity() {
      return this.totalQuantity * 966823731;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIB)V")
   @ObfuscatedName("mt")
   static final void method8910(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var7 = var2 - var0;
         int var8 = var3 - var1;
         int var10000;
         if (var7 >= 0) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            var10000 = var7;
         } else {
            var10000 = -var7;
         }

         int var9 = var10000;
         if (var8 >= 0) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            var10000 = var8;
         } else {
            var10000 = -var8;
         }

         int var10 = var10000;
         int var11 = var9;
         if (var9 < var10) {
            var11 = var10;
         }

         if (var11 == 0) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }
         } else {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if (var13 <= var12) {
               if (var6 != 3) {
                  throw new IllegalStateException();
               }

               var12 = -var12;
            } else {
               var13 = -var13;
            }

            int var14 = var5 * var13 >> 17;
            int var15 = 1 + var13 * var5 >> 17;
            int var16 = var5 * var12 >> 17;
            int var17 = 1 + var12 * var5 >> 17;
            var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
            var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
            int var18 = var14 + var0;
            int var19 = var0 - var15;
            int var20 = var0 + var7 - var15;
            int var21 = var0 + var7 + var14;
            int var22 = var16 + var1;
            int var23 = var1 - var17;
            int var24 = var1 + var8 - var17;
            int var25 = var8 + var1 + var16;
            Rasterizer3D.setClipping(var18, var19, var20);
            Rasterizer3D.rasterFlat(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
            Rasterizer3D.setClipping(var18, var20, var21);
            Rasterizer3D.rasterFlat(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
         }
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "qg.mt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;)V")
   @ObfuscatedName("aj")
   void method8891(Integer var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;)V")
   @ObfuscatedName("aw")
   void method8892(Integer var1) {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method8894() {
      return this.state & 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method8895() {
      return this.state & 7;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method8900(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedSignature(descriptor = "(Lqg;I)I")
   @ObfuscatedName("xi")
   public static int method8904(GrandExchangeOffer var0, int var1) {
      if (var0 == null) {
         var0.type(var1);
      }

      try {
         byte var10000;
         if ((var0.state & 8) == 8) {
            if (var1 == -1931160809) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qg.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;)V")
   @ObfuscatedName("ak")
   void method8893(Integer var1) {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   void method8906(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method8907(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method8901(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedSignature(descriptor = "([Lqr;IB)Lqr;")
   @ObfuscatedName("av")
   public static Enum findEnumerated(Enum[] var0, int var1, byte var2) {
      try {
         Enum[] var3 = var0;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Enum var5 = var3[var4];
            if (var1 == var5.rsOrdinal((byte)45)) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qg.av(" + ')');
      }
   }

   public GrandExchangeOfferState getState() {
      byte var1 = this.method8911();
      boolean var2 = (var1 & 8) == 8;
      boolean var3 = (var1 & 4) == 4;
      if (var1 == 0) {
         return GrandExchangeOfferState.EMPTY;
      } else if (var3 && this.getQuantitySold() < this.getTotalQuantity()) {
         return var2 ? GrandExchangeOfferState.CANCELLED_SELL : GrandExchangeOfferState.CANCELLED_BUY;
      } else if (var2) {
         return var3 ? GrandExchangeOfferState.SOLD : GrandExchangeOfferState.SELLING;
      } else {
         return var3 ? GrandExchangeOfferState.BOUGHT : GrandExchangeOfferState.BUYING;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqg;I)I")
   @ObfuscatedName("md")
   public static int method8896(GrandExchangeOffer var0, int var1) {
      if (var0 == null) {
         var0.status(var1);
      }

      try {
         return var0.state & 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qg.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZI)V")
   @ObfuscatedName("av")
   public static void method8889(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      try {
         class57.soundEffectIds[class57.soundEffectCount * 1548103253] = var0;
         class57.soundEffects[class57.soundEffectCount * 1548103253] = null;
         class57.soundLocations[1548103253 * class57.soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
         class57.field466[1548103253 * class57.soundEffectCount] = var1;
         class57.queuedSoundEffectLoops[1548103253 * class57.soundEffectCount] = var6;
         class57.queuedSoundEffectDelays[1548103253 * class57.soundEffectCount] = var7;
         class57.field467[class57.soundEffectCount * 1548103253] = var5;
         class57.field461[class57.soundEffectCount * 1548103253] = var8;
         class57.soundEffectCount += -1575133443;
         client.method2448(-1);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "qg.av(" + ')');
      }
   }

   public int getQuantitySold() {
      return this.currentQuantity * -634712805;
   }

   public int getSpent() {
      return this.currentPrice * 993851531;
   }

   @ObfuscatedSignature(descriptor = "(Lqg;II)V")
   @ObfuscatedName("mt")
   public static void method8908(GrandExchangeOffer var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8909(var1, var1);
      }

      try {
         var0.state &= -9;
         if (var1 == 1) {
            if (var2 == 403140963) {
               return;
            }

            var0.state = (byte)(var0.state | 8);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("wg")
   public byte method8911() {
      return this.state;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   void method8909(int var1, int var2) {
      try {
         this.state &= -9;
         if (var1 == 1) {
            if (var2 == 403140963) {
               return;
            }

            this.state = (byte)(this.state | 8);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int type(int var1) {
      try {
         return this.state & 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qg.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int status(int var1) {
      try {
         return this.state & 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qg.at(" + 41);
      }
   }
}
