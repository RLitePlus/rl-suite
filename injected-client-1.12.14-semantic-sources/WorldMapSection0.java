import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("ak")
   int oldChunkXLow;
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("qh")
   static TextureProvider textureProvider;
   @ObfuscatedName("ag")
   int oldX;
   @ObfuscatedName("an")
   int oldY;
   @ObfuscatedName("ae")
   int newX;
   @ObfuscatedName("aj")
   int newY;
   @ObfuscatedName("az")
   int newChunkYLow;
   @ObfuscatedName("aw")
   int oldChunkYLow;
   @ObfuscatedName("av")
   int oldZ;
   @ObfuscatedName("at")
   int newZ;
   @ObfuscatedName("au")
   int newChunkXLow;
   @ObfuscatedName("ap")
   int oldChunkXHigh;
   @ObfuscatedName("ad")
   int newChunkXHigh;
   @ObfuscatedName("ai")
   int newChunkYHigh;
   @ObfuscatedName("ay")
   int oldChunkYHigh;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod284(Buffer var1) {
      this.oldZ = var1.readUnsignedByte(-1346371050) * 874141713;
      this.newZ = var1.readUnsignedByte(1290898659) * 1092634539;
      this.oldX = Buffer.method12008(var1, (byte)5) * -1158263835;
      this.oldChunkXLow = var1.readUnsignedByte(-1587137049) * -2025563401;
      this.oldChunkXHigh = var1.readUnsignedByte(42791442) * -401595251;
      this.oldY = Buffer.method12008(var1, (byte)5) * 1723438433;
      this.oldChunkYLow = var1.readUnsignedByte(1176096882) * 925688397;
      this.oldChunkYHigh = var1.readUnsignedByte(1373655238) * 1509542947;
      this.newX = Buffer.method12008(var1, (byte)5) * -1412272091;
      this.newChunkXLow = var1.readUnsignedByte(377825316) * -309261257;
      this.newChunkXHigh = var1.readUnsignedByte(-745922308) * 1519970719;
      this.newY = Buffer.method12008(var1, (byte)5) * 311076853;
      this.newChunkYLow = var1.readUnsignedByte(-1648710461) * -1513319;
      this.newChunkYHigh = var1.readUnsignedByte(851256596) * 1528943407;
      this.postRead((short)-18832);
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("av")
   @Override
   public void expandBounds(WorldMapArea var1, int var2) {
      try {
         if (972064699 * var1.regionLowX > 904145837 * this.newX) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowX = this.newX * 445816759;
         }

         if (2009549851 * var1.regionHighX < this.newX * 904145837) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionHighX = 1206637527 * this.newX;
         }

         if (var1.regionLowY * -262946729 > 1867222109 * this.newY) {
            var1.regionLowY = this.newY * -561112981;
         }

         if (-234334363 * var1.regionHighY < 1867222109 * this.newY) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionHighY = -1670939239 * this.newY;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ll.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean containsCoord(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= -1587963663 * this.oldZ) {
            if (var4 >= 14) {
               throw new IllegalStateException();
            }

            if (var1 < this.newZ * 1049656067 + this.oldZ * -1587963663) {
               if (var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)) {
                  if (var4 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= (1390606829 * this.oldX << 6) + (-788775355 * this.oldChunkXHigh << 3) + 7
                     && var3 >= (this.oldChunkYLow * -772594043 << 3) + (1647693473 * this.oldY << 6)) {
                     if (var4 >= 14) {
                        throw new IllegalStateException();
                     }

                     if (var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (1647693473 * this.oldY << 6)) {
                        if (var4 >= 14) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }
                  }
               }

               return false;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ll.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean containsPosition(int var1, int var2, int var3) {
      try {
         if (var1 >= (1501587847 * this.newChunkXLow << 3) + (904145837 * this.newX << 6)) {
            if (var3 >= -1246167406) {
               throw new IllegalStateException();
            }

            if (var1 <= (904145837 * this.newX << 6) + (351793759 * this.newChunkXHigh << 3) + 7
               && var2 >= (566946729 * this.newChunkYLow << 3) + (1867222109 * this.newY << 6)) {
               if (var3 >= -1246167406) {
                  throw new IllegalStateException();
               }

               if (var2 <= (this.newY * 1867222109 << 6) + (this.newChunkYHigh * 926045135 << 3) + 7) {
                  if (var3 >= -1246167406) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ll.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ak")
   void postRead(short var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ll.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Loj;")
   @ObfuscatedName("ae")
   @Override
   public Coord coord(int var1, int var2, int var3) {
      try {
         if (!this.containsPosition(var1, var2, -1983007638)) {
            if (var3 != 216292671) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = this.oldChunkXLow * 2114205240 - -872199112 * this.newChunkXLow + this.oldX * -1195476160 - this.newX * 2030758720 + var1;
            int var5 = this.oldChunkYLow * -1885785048 - this.newChunkYLow * 240606536 + -1921800128 * this.oldY - -756869312 * this.newY + var2;
            return new Coord(this.oldZ * -1587963663, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ll.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ar")
   @Override
   public Coord vmethod278(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -2077051405)) {
         return null;
      } else {
         int var3 = this.oldChunkXLow * 2114205240 - -872199112 * this.newChunkXLow + this.oldX * -1195476160 - this.newX * 2030758720 + var1;
         int var4 = this.oldChunkYLow * -1885785048 - this.newChunkYLow * 240606536 + -1921800128 * this.oldY - -756869312 * this.newY + var2;
         return new Coord(this.oldZ * -1587963663, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method7195() {
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ad")
   @Override
   public boolean vmethod266(int var1, int var2, int var3) {
      return var1 >= -1587963663 * this.oldZ && var1 < this.newZ * 1049656067 + this.oldZ * -1587963663
         ? var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)
            && var2 <= (1390606829 * this.oldX << 6) + (-788775355 * this.oldChunkXHigh << 3) + 7
            && var3 >= (this.oldChunkYLow * -772594043 << 3) + (1647693473 * this.oldY << 6)
            && var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (1647693473 * this.oldY << 6)
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod264(WorldMapArea var1) {
      if (972064699 * var1.regionLowX > 904145837 * this.newX) {
         var1.regionLowX = this.newX * 445816759;
      }

      if (2009549851 * var1.regionHighX < this.newX * 904145837) {
         var1.regionHighX = 1206637527 * this.newX;
      }

      if (var1.regionLowY * -262946729 > 1867222109 * this.newY) {
         var1.regionLowY = this.newY * -561112981;
      }

      if (-234334363 * var1.regionHighY < 1867222109 * this.newY) {
         var1.regionHighY = -1670939239 * this.newY;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod267(int var1, int var2, int var3) {
      return var1 >= -1600287150 * this.oldZ && var1 < this.newZ * 1049656067 + this.oldZ * -1587963663
         ? var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)
            && var2 <= (-765804911 * this.oldX << 6) + (-788775355 * this.oldChunkXHigh << 3) + 7
            && var3 >= (this.oldChunkYLow * 149324005 << 3) + (1840406072 * this.oldY << 6)
            && var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (-1473749633 * this.oldY << 6)
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("aw")
   @Override
   public void vmethod265(WorldMapArea var1) {
      if (972064699 * var1.regionLowX > 904145837 * this.newX) {
         var1.regionLowX = this.newX * 445816759;
      }

      if (2009549851 * var1.regionHighX < this.newX * 904145837) {
         var1.regionHighX = 1206637527 * this.newX;
      }

      if (var1.regionLowY * -262946729 > 1867222109 * this.newY) {
         var1.regionLowY = this.newY * -561112981;
      }

      if (-234334363 * var1.regionHighY < 1867222109 * this.newY) {
         var1.regionHighY = -1670939239 * this.newY;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod268(int var1, int var2, int var3) {
      return var1 >= 1280246368 * this.oldZ && var1 < this.newZ * 1411518518 + this.oldZ * -1587963663
         ? var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)
            && var2 <= (1390606829 * this.oldX << 6) + (380309520 * this.oldChunkXHigh << 3) + 7
            && var3 >= (this.oldChunkYLow * -1378826584 << 3) + (1647693473 * this.oldY << 6)
            && var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (-800010752 * this.oldY << 6)
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod276(int var1, int var2, int var3) {
      return !this.containsCoord(var1, var2, var3, (byte)-36)
         ? null
         : new int[]{
            155629913 * this.newChunkXLow - this.oldChunkXLow * 995766821 + var2 + (this.newX * 2030758720 - this.oldX * -1389321370),
            -1462394513 * this.newY - 218506687 * this.oldY + var3 + (1619057493 * this.newChunkYLow - -784955327 * this.oldChunkYLow)
         };
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ai")
   @Override
   public boolean vmethod269(int var1, int var2, int var3) {
      return var1 >= -1587963663 * this.oldZ && var1 < this.newZ * 1049656067 + this.oldZ * -1587963663
         ? var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)
            && var2 <= (1390606829 * this.oldX << 6) + (-788775355 * this.oldChunkXHigh << 3) + 7
            && var3 >= (this.oldChunkYLow * -772594043 << 3) + (1647693473 * this.oldY << 6)
            && var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (1647693473 * this.oldY << 6)
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod271(int var1, int var2, int var3) {
      return var1 >= -1587963663 * this.oldZ && var1 < this.newZ * 1049656067 + this.oldZ * -1587963663
         ? var2 >= (this.oldChunkXLow * -1346337081 << 3) + (this.oldX * 1390606829 << 6)
            && var2 <= (1390606829 * this.oldX << 6) + (-788775355 * this.oldChunkXHigh << 3) + 7
            && var3 >= (this.oldChunkYLow * -772594043 << 3) + (1647693473 * this.oldY << 6)
            && var3 <= 7 + (31146891 * this.oldChunkYHigh << 3) + (1647693473 * this.oldY << 6)
         : false;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("an")
   @Override
   public int[] getBorderTileLengths(int var1, int var2, int var3, byte var4) {
      try {
         return !this.containsCoord(var1, var2, var3, (byte)5)
            ? null
            : new int[]{
               -872199112 * this.newChunkXLow - this.oldChunkXLow * 2114205240 + var2 + (this.newX * 2030758720 - this.oldX * -1195476160),
               -756869312 * this.newY - -1921800128 * this.oldY + var3 + (240606536 * this.newChunkYLow - -1885785048 * this.oldChunkYLow)
            };
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ll.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   @Override
   public void read(Buffer var1, int var2) {
      try {
         this.oldZ = var1.readUnsignedByte(-719249237) * 874141713;
         this.newZ = var1.readUnsignedByte(-1426311083) * 1092634539;
         this.oldX = Buffer.method12008(var1, (byte)5) * -1158263835;
         this.oldChunkXLow = var1.readUnsignedByte(1275785760) * -2025563401;
         this.oldChunkXHigh = var1.readUnsignedByte(1276343517) * -401595251;
         this.oldY = Buffer.method12008(var1, (byte)5) * 1723438433;
         this.oldChunkYLow = var1.readUnsignedByte(-117350337) * 925688397;
         this.oldChunkYHigh = var1.readUnsignedByte(-1146492326) * 1509542947;
         this.newX = Buffer.method12008(var1, (byte)5) * -1412272091;
         this.newChunkXLow = var1.readUnsignedByte(442592446) * -309261257;
         this.newChunkXHigh = var1.readUnsignedByte(1085985461) * 1519970719;
         this.newY = Buffer.method12008(var1, (byte)5) * 311076853;
         this.newChunkYLow = var1.readUnsignedByte(474365378) * -1513319;
         this.newChunkYHigh = var1.readUnsignedByte(-1453693191) * 1528943407;
         this.postRead((short)-8857);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ll.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ax")
   @Override
   public Coord vmethod277(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1737570761)) {
         return null;
      } else {
         int var3 = this.oldChunkXLow * 2114205240 - -872199112 * this.newChunkXLow + this.oldX * -1195476160 - this.newX * -44493599 + var1;
         int var4 = this.oldChunkYLow * -1885785048 - this.newChunkYLow * 240606536 + -1921800128 * this.oldY - -587332591 * this.newY + var2;
         return new Coord(this.oldZ * -1503290270, var3, var4);
      }
   }

   WorldMapSection0() {
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ah")
   @Override
   public Coord vmethod279(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1804231542)) {
         return null;
      } else {
         int var3 = this.oldChunkXLow * 2114205240 - -872199112 * this.newChunkXLow + this.oldX * -1195476160 - this.newX * 2030758720 + var1;
         int var4 = this.oldChunkYLow * -1885785048 - this.newChunkYLow * 240606536 + -1921800128 * this.oldY - -756869312 * this.newY + var2;
         return new Coord(this.oldZ * -1587963663, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod282(Buffer var1) {
      this.oldZ = var1.readUnsignedByte(-1271067834) * 2043175295;
      this.newZ = var1.readUnsignedByte(-168116704) * 1092634539;
      this.oldX = Buffer.method12008(var1, (byte)5) * -602981398;
      this.oldChunkXLow = var1.readUnsignedByte(-1262321852) * -55680352;
      this.oldChunkXHigh = var1.readUnsignedByte(-1375050359) * -401595251;
      this.oldY = Buffer.method12008(var1, (byte)5) * 1596974793;
      this.oldChunkYLow = var1.readUnsignedByte(-188836030) * -851170446;
      this.oldChunkYHigh = var1.readUnsignedByte(-696354132) * 1509542947;
      this.newX = Buffer.method12008(var1, (byte)5) * -1412272091;
      this.newChunkXLow = var1.readUnsignedByte(364931968) * -309261257;
      this.newChunkXHigh = var1.readUnsignedByte(-1481568338) * 1519970719;
      this.newY = Buffer.method12008(var1, (byte)5) * 311076853;
      this.newChunkYLow = var1.readUnsignedByte(-46418042) * -1920409207;
      this.newChunkYHigh = var1.readUnsignedByte(869443904) * 1528943407;
      this.postRead((short)6722);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod274(int var1, int var2) {
      return var1 >= (1871596909 * this.newChunkXLow << 3) + (904145837 * this.newX << 6)
         && var1 <= (-1191005836 * this.newX << 6) + (351793759 * this.newChunkXHigh << 3) + 7
         && var2 >= (288446863 * this.newChunkYLow << 3) + (-1104003064 * this.newY << 6)
         && var2 <= (this.newY * 1867222109 << 6) + (this.newChunkYHigh * -723983869 << 3) + 7;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   @Override
   public void vmethod283(Buffer var1) {
      this.oldZ = var1.readUnsignedByte(599983050) * -93178402;
      this.newZ = var1.readUnsignedByte(-761118533) * 1880801946;
      this.oldX = Buffer.method12008(var1, (byte)5) * -1158263835;
      this.oldChunkXLow = var1.readUnsignedByte(-1211510988) * -2025563401;
      this.oldChunkXHigh = var1.readUnsignedByte(849085582) * -401595251;
      this.oldY = Buffer.method12008(var1, (byte)5) * 158465921;
      this.oldChunkYLow = var1.readUnsignedByte(1270856163) * 635838342;
      this.oldChunkYHigh = var1.readUnsignedByte(1062211408) * 603426264;
      this.newX = Buffer.method12008(var1, (byte)5) * -1412272091;
      this.newChunkXLow = var1.readUnsignedByte(-889981454) * 723491427;
      this.newChunkXHigh = var1.readUnsignedByte(-683178804) * 1519970719;
      this.newY = Buffer.method12008(var1, (byte)5) * -1995532177;
      this.newChunkYLow = var1.readUnsignedByte(112837954) * -1284076330;
      this.newChunkYHigh = var1.readUnsignedByte(-1485481505) * 1528943407;
      this.postRead((short)-24318);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod273(int var1, int var2) {
      return var1 >= (1501587847 * this.newChunkXLow << 3) + (904145837 * this.newX << 6)
         && var1 <= (904145837 * this.newX << 6) + (351793759 * this.newChunkXHigh << 3) + 7
         && var2 >= (566946729 * this.newChunkYLow << 3) + (1867222109 * this.newY << 6)
         && var2 <= (this.newY * 1867222109 << 6) + (this.newChunkYHigh * 926045135 << 3) + 7;
   }
}
