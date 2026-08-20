import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lh")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("av")
   int minPlane;
   @ObfuscatedName("ak")
   int field3682;
   @ObfuscatedName("ag")
   int regionStartX;
   @ObfuscatedName("an")
   int regionStartY;
   @ObfuscatedName("ae")
   int regionEndX;
   @ObfuscatedName("aj")
   int regionEndY;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field3678 = 44;
   @ObfuscatedName("aw")
   int field3687;
   @ObfuscatedName("at")
   int planes;
   @ObfuscatedName("ay")
   int field3688;
   @ObfuscatedName("ap")
   int field3684;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3689 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("er")
   static final int field3690 = 334;
   @ObfuscatedSignature(descriptor = "Lbq;")
   @ObfuscatedName("rl")
   static MenuAction tempMenuAction;

   WorldMapSection2() {
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod267(int var1, int var2, int var3) {
      return var1 >= this.minPlane * -407887475 && var1 < 1100797107 * this.planes + this.minPlane * -407887475
         ? var2 >> 6 >= -1391053375 * this.regionStartX
            && var2 >> 6 <= -1321091891 * this.regionEndX
            && var3 >> 6 >= 1335182407 * this.regionStartY
            && var3 >> 6 <= -573999143 * this.regionEndY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean containsCoord(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= this.minPlane * -407887475) {
            if (var4 >= 14) {
               throw new IllegalStateException();
            }

            if (var1 < 1100797107 * this.planes + this.minPlane * -407887475) {
               if (var2 >> 6 >= -1391053375 * this.regionStartX) {
                  if (var4 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (var2 >> 6 <= -1321091891 * this.regionEndX) {
                     if (var4 >= 14) {
                        throw new IllegalStateException();
                     }

                     if (var3 >> 6 >= 1335182407 * this.regionStartY) {
                        if (var4 >= 14) {
                           throw new IllegalStateException();
                        }

                        if (var3 >> 6 <= -573999143 * this.regionEndY) {
                           return true;
                        }
                     }
                  }
               }

               return false;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "lh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod282(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(-145167399) * 83691845;
      this.planes = var1.readUnsignedByte(-798125759) * -1009386885;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * 1770371820;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * -1927404223;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * 346646060;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * 239500414;
      this.field3682 = Buffer.method12008(var1, (byte)5) * 902166670;
      this.field3687 = Buffer.method12008(var1, (byte)5) * -962457497;
      this.field3684 = Buffer.method12008(var1, (byte)5) * 939611233;
      this.field3688 = Buffer.method12008(var1, (byte)5) * -1124560149;
      this.postRead(-1025829342);
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("an")
   @Override
   public int[] getBorderTileLengths(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.containsCoord(var1, var2, var3, (byte)-86)) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return new int[]{
               -2063170752 * this.field3682 - this.regionStartX * 1166897216 + var2, this.field3687 * -1040001600 - -447671872 * this.regionStartY + var3
            };
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lh.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean containsPosition(int var1, int var2, int var3) {
      try {
         if (var1 >> 6 >= -837543411 * this.field3682 && var1 >> 6 <= 304107425 * this.field3684) {
            if (var3 >= -1246167406) {
               throw new IllegalStateException();
            }

            if (var2 >> 6 >= -1291318441 * this.field3687 && var2 >> 6 <= this.field3688 * -483891709) {
               if (var3 >= -1246167406) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod284(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(-199763932) * 83691845;
      this.planes = var1.readUnsignedByte(1295613136) * -1009386885;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * -2141728690;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * -2137014917;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * -1583153513;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * -1631741847;
      this.field3682 = Buffer.method12008(var1, (byte)5) * -378616635;
      this.field3687 = Buffer.method12008(var1, (byte)5) * -962457497;
      this.field3684 = Buffer.method12008(var1, (byte)5) * -1266006855;
      this.field3688 = Buffer.method12008(var1, (byte)5) * -1994387933;
      this.postRead(-2084746824);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void postRead(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lh.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("aw")
   @Override
   public void vmethod265(WorldMapArea var1) {
      if (972064699 * var1.regionLowX > this.field3682 * -837543411) {
         var1.regionLowX = 232480353 * this.field3682;
      }

      if (var1.regionHighX * -1985815127 < this.field3684 * 304107425) {
         var1.regionHighX = this.field3684 * -1488562445;
      }

      if (var1.regionLowY * -262946729 > this.field3687 * 907136716) {
         var1.regionLowY = this.field3687 * 1914907905;
      }

      if (var1.regionHighY * 1731720891 < this.field3688 * 2140096215) {
         var1.regionHighY = this.field3688 * 979072327;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod264(WorldMapArea var1) {
      if (972064699 * var1.regionLowX > this.field3682 * -837543411) {
         var1.regionLowX = 1764660439 * this.field3682;
      }

      if (var1.regionHighX * 2009549851 < this.field3684 * 304107425) {
         var1.regionHighX = this.field3684 * -1488562445;
      }

      if (var1.regionLowY * -262946729 > this.field3687 * -1291318441) {
         var1.regionLowY = this.field3687 * 1914907905;
      }

      if (var1.regionHighY * -234334363 < this.field3688 * -483891709) {
         var1.regionHighY = this.field3688 * 979072327;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ad")
   @Override
   public boolean vmethod266(int var1, int var2, int var3) {
      return var1 >= this.minPlane * -407887475 && var1 < 1100797107 * this.planes + this.minPlane * -407887475
         ? var2 >> 6 >= -1391053375 * this.regionStartX
            && var2 >> 6 <= -1321091891 * this.regionEndX
            && var3 >> 6 >= 1335182407 * this.regionStartY
            && var3 >> 6 <= -573999143 * this.regionEndY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod271(int var1, int var2, int var3) {
      return var1 >= this.minPlane * -407887475 && var1 < 1100797107 * this.planes + this.minPlane * -407887475
         ? var2 >> 6 >= -1391053375 * this.regionStartX
            && var2 >> 6 <= -1321091891 * this.regionEndX
            && var3 >> 6 >= 1335182407 * this.regionStartY
            && var3 >> 6 <= -573999143 * this.regionEndY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod268(int var1, int var2, int var3) {
      return var1 >= this.minPlane * -185922024 && var1 < 974941161 * this.planes + this.minPlane * 926801035
         ? var2 >> 6 >= -1391053375 * this.regionStartX
            && var2 >> 6 <= -648763386 * this.regionEndX
            && var3 >> 6 >= 1335182407 * this.regionStartY
            && var3 >> 6 <= -410833907 * this.regionEndY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   @Override
   public void read(Buffer var1, int var2) {
      try {
         this.minPlane = var1.readUnsignedByte(-1698765697) * 83691845;
         this.planes = var1.readUnsignedByte(469407429) * -1009386885;
         this.regionStartX = Buffer.method12008(var1, (byte)5) * -988358079;
         this.regionStartY = Buffer.method12008(var1, (byte)5) * 365503863;
         this.regionEndX = Buffer.method12008(var1, (byte)5) * 227840005;
         this.regionEndY = Buffer.method12008(var1, (byte)5) * -1631741847;
         this.field3682 = Buffer.method12008(var1, (byte)5) * -378616635;
         this.field3687 = Buffer.method12008(var1, (byte)5) * -962457497;
         this.field3684 = Buffer.method12008(var1, (byte)5) * 939611233;
         this.field3688 = Buffer.method12008(var1, (byte)5) * -1337723733;
         this.postRead(-1589644882);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lh.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ai")
   @Override
   public boolean vmethod269(int var1, int var2, int var3) {
      return var1 >= this.minPlane * 243633641 && var1 < 1100797107 * this.planes + this.minPlane * -407887475
         ? var2 >> 6 >= -1391053375 * this.regionStartX
            && var2 >> 6 <= -247656556 * this.regionEndX
            && var3 >> 6 >= -1592112532 * this.regionStartY
            && var3 >> 6 <= -573999143 * this.regionEndY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod273(int var1, int var2) {
      return var1 >> 6 >= -837543411 * this.field3682
         && var1 >> 6 <= 304107425 * this.field3684
         && var2 >> 6 >= -1291318441 * this.field3687
         && var2 >> 6 <= this.field3688 * -483891709;
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ax")
   @Override
   public Coord vmethod277(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1341906892)) {
         return null;
      } else {
         int var3 = this.regionStartX * 1166897216 - this.field3682 * -2063170752 + var1;
         int var4 = var2 + (this.regionStartY * -447671872 - -1040001600 * this.field3687);
         return new Coord(-407887475 * this.minPlane, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod276(int var1, int var2, int var3) {
      return !this.containsCoord(var1, var2, var3, (byte)-13)
         ? null
         : new int[]{
            -2063170752 * this.field3682 - this.regionStartX * 1166897216 + var2, this.field3687 * -1040001600 - -447671872 * this.regionStartY + var3
         };
   }

   @ObfuscatedSignature(descriptor = "(III)Loj;")
   @ObfuscatedName("ae")
   @Override
   public Coord coord(int var1, int var2, int var3) {
      try {
         if (!this.containsPosition(var1, var2, -1532744797)) {
            if (var3 != 216292671) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = this.regionStartX * 1166897216 - this.field3682 * -2063170752 + var1;
            int var5 = var2 + (this.regionStartY * -447671872 - -1040001600 * this.field3687);
            return new Coord(-407887475 * this.minPlane, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lh.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ar")
   @Override
   public Coord vmethod278(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -2038803357)) {
         return null;
      } else {
         int var3 = this.regionStartX * 1166897216 - this.field3682 * -2063170752 + var1;
         int var4 = var2 + (this.regionStartY * -447671872 - -1040001600 * this.field3687);
         return new Coord(-407887475 * this.minPlane, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ah")
   @Override
   public Coord vmethod279(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -2101121012)) {
         return null;
      } else {
         int var3 = this.regionStartX * 1166897216 - this.field3682 * -2063170752 + var1;
         int var4 = var2 + (this.regionStartY * -447671872 - -1040001600 * this.field3687);
         return new Coord(-407887475 * this.minPlane, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("av")
   @Override
   public void expandBounds(WorldMapArea var1, int var2) {
      try {
         if (972064699 * var1.regionLowX > this.field3682 * -837543411) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowX = 1764660439 * this.field3682;
         }

         if (var1.regionHighX * 2009549851 < this.field3684 * 304107425) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionHighX = this.field3684 * -1488562445;
         }

         if (var1.regionLowY * -262946729 > this.field3687 * -1291318441) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowY = this.field3687 * 1914907905;
         }

         if (var1.regionHighY * -234334363 < this.field3688 * -483891709) {
            var1.regionHighY = this.field3688 * 979072327;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod274(int var1, int var2) {
      return var1 >> 6 >= -837543411 * this.field3682
         && var1 >> 6 <= 304107425 * this.field3684
         && var2 >> 6 >= -1291318441 * this.field3687
         && var2 >> 6 <= this.field3688 * -483891709;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   @Override
   public void vmethod283(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(1982796149) * 83691845;
      this.planes = var1.readUnsignedByte(-1415787987) * -1009386885;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * -988358079;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * 365503863;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * 227840005;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * -1631741847;
      this.field3682 = Buffer.method12008(var1, (byte)5) * -378616635;
      this.field3687 = Buffer.method12008(var1, (byte)5) * -962457497;
      this.field3684 = Buffer.method12008(var1, (byte)5) * 939611233;
      this.field3688 = Buffer.method12008(var1, (byte)5) * -1337723733;
      this.postRead(-1927375502);
   }
}
