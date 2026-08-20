import net.runelite.api.GrandExchangeOfferState;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mm")
public class GrandExchangeOffer implements net.runelite.api.GrandExchangeOffer {
   @ObfuscatedName("ag")
   public int field4537;
   @ObfuscatedName("af")
   public int field4535;
   @ObfuscatedName("ae")
   public int field4534;
   @ObfuscatedName("ab")
   public int field4536;
   @ObfuscatedName("az")
   byte field4539;
   @ObfuscatedName("as")
   public int field4538;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4540 = 14;

   public int getItemId() {
      return this.field4535 * 1561057361;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method7606() {
      return this.field4539 & 7;
   }

   public GrandExchangeOffer(classXY var1, boolean var2) {
      this.field4539 = classXY.method13043(var1, (byte)17);
      this.field4535 = classXY.method13047(var1, 1747243124) * 443314353;
      this.field4534 = var1.method13056((byte)1) * 961265821;
      this.field4536 = var1.method13056((byte)1) * 373867205;
      this.field4537 = var1.method13056((byte)1) * -424806523;
      this.field4538 = var1.method13056((byte)1) * -263056879;
      if (var2) {
         this.method7603(classUC.method11261(var1, -1964428479), (byte)-1);
      }
   }

   public int getTotalQuantity() {
      return this.field4536 * 29846541;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;B)V")
   @ObfuscatedName("af")
   void method7603(Integer var1, byte var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mm.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Integer;")
   @ObfuscatedName("ac")
   static Integer method7599(classXY var0) {
      int var1 = 0;
      boolean var2 = false;

      while (true) {
         int var3 = classXY.method13039(var0, -346779531);
         if (var3 == 1214633080) {
            return var2 ? var1 : null;
         }

         if (var3 != 0) {
            throw new IllegalStateException("");
         }

         while (true) {
            int var4 = classXY.method13039(var0, -346779531);
            if (255 == var4) {
               break;
            }

            var0.field6955 -= -507022095;
            if (classXY.method13047(var0, 1291323804) != 0) {
               throw new IllegalStateException("");
            }

            if (var2) {
               throw new IllegalStateException("");
            }

            var1 = var0.method13056((byte)1);
            var2 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method7612() {
      return 8 == (this.field4539 & 8) ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lmm;II)V")
   @ObfuscatedName("ic")
   public static void method7615(GrandExchangeOffer var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7618(var1, var1);
      } else {
         try {
            var0.field4539 &= -9;
            if (1 == var1) {
               if (var2 <= 485290041) {
                  throw new IllegalStateException();
               }

               var0.field4539 = (byte)(var0.field4539 | 8);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "mm.as(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Integer;")
   @ObfuscatedName("ax")
   static Integer method7600(classXY var0) {
      int var1 = 0;
      boolean var2 = false;

      while (true) {
         int var3 = classXY.method13039(var0, -346779531);
         if (var3 == 255) {
            return var2 ? var1 : null;
         }

         if (var3 != 0) {
            throw new IllegalStateException("");
         }

         while (true) {
            int var4 = classXY.method13039(var0, -346779531);
            if (255 == var4) {
               break;
            }

            var0.field6955 -= -1095856699;
            if (classXY.method13047(var0, 1780122919) != 0) {
               throw new IllegalStateException("");
            }

            if (var2) {
               throw new IllegalStateException("");
            }

            var1 = var0.method13056((byte)1);
            var2 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   static void method7621(int var0) {
      try {
         classGG.field2577 = null;
         classMS.field4579 = null;
         AABB.field2373 = null;
         classDT.field1630 = null;
         classRO.method10148(-2044472822);
         classCE.field714 = null;
         classCE.field713 = null;
         classUO.field6361 = null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "mm.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Integer;")
   @ObfuscatedName("aa")
   static Integer method7601(classXY var0) {
      int var1 = 0;
      boolean var2 = false;

      while (true) {
         int var3 = classXY.method13039(var0, -346779531);
         if (var3 == 255) {
            return var2 ? var1 : null;
         }

         if (var3 != 0) {
            throw new IllegalStateException("");
         }

         while (true) {
            int var4 = classXY.method13039(var0, -346779531);
            if (255 == var4) {
               break;
            }

            var0.field6955 -= -1095856699;
            if (classXY.method13047(var0, -1852010553) != 0) {
               throw new IllegalStateException("");
            }

            if (var2) {
               throw new IllegalStateException("");
            }

            var1 = var0.method13056((byte)1);
            var2 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("tq")
   public byte method7622() {
      return this.field4539;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Integer;")
   @ObfuscatedName("ao")
   static Integer method7602(classXY var0) {
      int var1 = 0;
      boolean var2 = false;

      while (true) {
         int var3 = classXY.method13039(var0, -346779531);
         if (var3 == 255) {
            return var2 ? var1 : null;
         }

         if (var3 != 0) {
            throw new IllegalStateException("");
         }

         while (true) {
            int var4 = classXY.method13039(var0, -346779531);
            if (255 == var4) {
               break;
            }

            var0.field6955 -= -1095856699;
            if (classXY.method13047(var0, -1630959316) != 0) {
               throw new IllegalStateException("");
            }

            if (var2) {
               throw new IllegalStateException("");
            }

            var1 = var0.method13056((byte)1);
            var2 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ab")
   void method7611(int var1, byte var2) {
      try {
         this.field4539 &= -8;
         this.field4539 = (byte)(this.field4539 | var1 & 7);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mm.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmm;I)V")
   @ObfuscatedName("il")
   public static void method7616(GrandExchangeOffer var0, int var1) {
      if (var0 == null) {
         var0.getSpent();
      }

      var0.field4539 = (byte)(var0.field4539 & 1485640661);
      if (1 == var1) {
         var0.field4539 = (byte)(var0.field4539 | 8);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;)V")
   @ObfuscatedName("aj")
   void method7604(Integer var1) {
   }

   public GrandExchangeOfferState getState() {
      byte var1 = this.method7622();
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

   @ObfuscatedSignature(descriptor = "(Lmm;S)I")
   @ObfuscatedName("qn")
   public static int method7607(GrandExchangeOffer var0, short var1) {
      if (var0 == null) {
         return var0.method7610(var1);
      } else {
         try {
            return var0.field4539 & 7;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "mm.ae(" + 41);
         }
      }
   }

   public GrandExchangeOffer() {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method7608() {
      return this.field4539 & 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method7609() {
      return this.field4539 & 7;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;)V")
   @ObfuscatedName("al")
   void method7605(Integer var1) {
   }

   public int getSpent() {
      return this.field4538 * 464461553;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   void method7617(int var1) {
      this.field4539 &= -9;
      if (1 == var1) {
         this.field4539 = (byte)(this.field4539 | 8);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method7613(int var1) {
      try {
         byte var10000;
         if (8 == (this.field4539 & 8)) {
            if (var1 >= 1911999792) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mm.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmm;)I")
   @ObfuscatedName("ad")
   public static int method7614(GrandExchangeOffer var0) {
      return 8 == (var0.field4539 & 8) ? 1 : 0;
   }

   public int getQuantitySold() {
      return this.field4537 * 834365773;
   }

   public int getPrice() {
      return this.field4534 * -1718041163;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;II)V")
   @ObfuscatedName("ax")
   static void method7620(WorldView var0, Actor var1, int var2, int var3) {
      try {
         classLL.method7120(var0, var1.field1487 * -1547553299, var1.field1489 * -1272026483, var2, var1.vmethod267(-1423776655), 1489480712);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mm.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;IIIIB)Z")
   @ObfuscatedName("ar")
   static boolean method7619(Model var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         AABB var6 = var0.method5093(var1);
         int var7 = -915116879 * var6.field2367 + var2;
         int var8 = var3 + var6.field2366 * -1027280203;
         int var9 = var6.field2369 * -81102275 + var4;
         int var10 = var6.field2368 * 1301855055;
         int var11 = var6.field2365 * -623192411;
         int var12 = var6.field2370 * 2105673973;
         int var13 = -1229211407 * classLS.field4219 - var7;
         int var14 = 1234160379 * classKT.field4022 - var8;
         int var15 = 1574685861 * classHQ.field2868 - var9;
         if (Math.abs(var13) > classVI.field6513 * 756191369 + var10) {
            return false;
         } else if (Math.abs(var14) > 1266420275 * classJI.field3164 + var11) {
            if (var5 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var15) > 1304241803 * classEV.field1943 + var12) {
            if (var5 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var15 * 348139717 * classDK.field1542 - FloorDecoration.field1811 * -1947307103 * var14)
            > classEV.field1943 * 1304241803 * var11 + classJI.field3164 * 1266420275 * var12) {
            return false;
         } else if (Math.abs(-1947307103 * FloorDecoration.field1811 * var13 - -331219525 * classBY.field614 * var15)
            > var10 * classEV.field1943 * 1304241803 + classVI.field6513 * 756191369 * var12) {
            if (var5 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(-331219525 * classBY.field614 * var14 - classDK.field1542 * 348139717 * var13)
            > var11 * 756191369 * classVI.field6513 + classJI.field3164 * 1266420275 * var10) {
            if (var5 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "mm.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ae")
   public int method7610(short var1) {
      try {
         return this.field4539 & 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mm.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   void method7618(int var1, int var2) {
      try {
         this.field4539 &= -9;
         if (1 == var1) {
            if (var2 <= 485290041) {
               throw new IllegalStateException();
            }

            this.field4539 = (byte)(this.field4539 | 8);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mm.as(" + ')');
      }
   }
}
