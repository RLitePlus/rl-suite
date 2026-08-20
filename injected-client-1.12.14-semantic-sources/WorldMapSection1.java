import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mn")
public class WorldMapSection1 implements WorldMapSection {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3980 = 7;
   @ObfuscatedName("at")
   int planes;
   @ObfuscatedName("ag")
   int regionStartX;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field3986 = 27;
   @ObfuscatedName("ae")
   int regionEndX;
   @ObfuscatedName("aj")
   int regionEndY;
   @ObfuscatedName("av")
   int minPlane;
   @ObfuscatedName("an")
   int regionStartY;

   @ObfuscatedSignature(descriptor = "(IB)Lfq;")
   @ObfuscatedName("ae")
   static class140 method7447(int var0, byte var1) {
      try {
         class140[] var2 = new class140[]{
            class140.field1831, class140.field1834, class140.field1832, class140.field1836, class140.field1835, class140.field1833
         };
         class140 var3 = (class140)GrandExchangeOffer.findEnumerated(var2, var0, (byte)1);
         if (null == var3) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var3 = class140.field1831;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "mn.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;)V")
   @ObfuscatedName("ij")
   public static void method7448(PacketWriter var0) {
      IterableNodeDeque.method9629(var0.packetBufferNodes);
      var0.bufferSize = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("ic")
   static final void method7454(Actor var0, int var1) {
      try {
         int var2 = Math.max(1, 108069351 * var0.spotAnimation - 1759706017 * client.cycle);
         int var3 = var0.size * 1257575232 + 291177600 * var0.field1181;
         int var4 = 1257575232 * var0.size + var0.field1178 * -1091697536;
         var0.x = var0.x + 1875668551 * ((var3 - var0.x * 340712311) / var2);
         var0.y = var0.y + -122983271 * ((var4 - var0.y * -1747310679) / var2);
         var0.field1145 = 0;
         var0.orientation = var0.field1179 * -950807473;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "mn.ic(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean containsCoord(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= 452965039 * this.minPlane) {
            if (var4 >= 14) {
               throw new IllegalStateException();
            }

            if (var1 < 452965039 * this.minPlane + this.planes * -1542708359) {
               if (this.regionStartX * 58323403 == var2 >> 6) {
                  if (var4 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (var3 >> 6 == -2121914509 * this.regionStartY) {
                     if (var4 >= 14) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }

               return false;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "mn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean containsPosition(int var1, int var2, int var3) {
      try {
         if (1591800825 * this.regionEndX == var1 >> 6) {
            if (var3 >= -1246167406) {
               throw new IllegalStateException();
            }

            if (var2 >> 6 == this.regionEndY * -370042613) {
               if (var3 >= -1246167406) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "mn.ag(" + ')');
      }
   }

   WorldMapSection1() {
   }

   @ObfuscatedSignature(descriptor = "(III)Loj;")
   @ObfuscatedName("ae")
   @Override
   public Coord coord(int var1, int var2, int var3) {
      try {
         if (!this.containsPosition(var1, var2, -1685987514)) {
            if (var3 != 216292671) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (-562269504 * this.regionStartX - -1203962304 * this.regionEndX);
            int var5 = var2 + (this.regionStartY * 1636424896 - this.regionEndY * 2087076544);
            return new Coord(this.minPlane * 452965039, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mn.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   @Override
   public void read(Buffer var1, int var2) {
      try {
         this.minPlane = var1.readUnsignedByte(-1026573300) * 1548543055;
         this.planes = var1.readUnsignedByte(-1667302099) * -971385143;
         this.regionStartX = Buffer.method12008(var1, (byte)5) * 1737796579;
         this.regionStartY = Buffer.method12008(var1, (byte)5) * -1099409989;
         this.regionEndX = Buffer.method12008(var1, (byte)5) * -2119344567;
         this.regionEndY = Buffer.method12008(var1, (byte)5) * 126315171;
         this.postRead(1494140945);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "mn.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void postRead(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mn.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod276(int var1, int var2, int var3) {
      return !this.containsCoord(var1, var2, var3, (byte)-60)
         ? null
         : new int[]{
            var2 + (-1203962304 * this.regionEndX - this.regionStartX * -562269504), var3 + (this.regionEndY * -95588698 - 1153631274 * this.regionStartY)
         };
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod264(WorldMapArea var1) {
      if (var1.regionLowX * 972064699 > 1591800825 * this.regionEndX) {
         var1.regionLowX = this.regionEndX * 990352859;
      }

      if (var1.regionHighX * 2009549851 < this.regionEndX * 1591800825) {
         var1.regionHighX = this.regionEndX * -1331799685;
      }

      if (932372792 * var1.regionLowY > -370042613 * this.regionEndY) {
         var1.regionLowY = this.regionEndY * 1098673261;
      }

      if (-1108702700 * var1.regionHighY < -370042613 * this.regionEndY) {
         var1.regionHighY = 1370347006 * this.regionEndY;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod267(int var1, int var2, int var3) {
      return var1 >= 452965039 * this.minPlane && var1 < 452965039 * this.minPlane + this.planes * -1542708359
         ? this.regionStartX * 58323403 == var2 >> 6 && var3 >> 6 == -2121914509 * this.regionStartY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod271(int var1, int var2, int var3) {
      return var1 >= 452965039 * this.minPlane && var1 < 452965039 * this.minPlane + this.planes * -1542708359
         ? this.regionStartX * 58323403 == var2 >> 6 && var3 >> 6 == -2121914509 * this.regionStartY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod268(int var1, int var2, int var3) {
      return var1 >= 452965039 * this.minPlane && var1 < 452965039 * this.minPlane + this.planes * -1542708359
         ? this.regionStartX * 58323403 == var2 >> 6 && var3 >> 6 == -2121914509 * this.regionStartY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lky;IIIIFFFFIIII)Z")
   @ObfuscatedName("as")
   static final boolean method7453(
      Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      try {
         boolean var13 = ViewportMouse.ViewportMouse_isInViewport;
         if (!var13) {
            if (var12 == -1123835239) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            WorldMapEvent.method7540(var5, var6, var7, var8, var9, var10, var11, 44227937);
            return class179.method4238(var0, var1, var2, var3, var4, -1920053913);
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "mn.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ai")
   @Override
   public boolean vmethod269(int var1, int var2, int var3) {
      return var1 >= -183598639 * this.minPlane && var1 < 817183661 * this.minPlane + this.planes * 1037284506
         ? this.regionStartX * 58323403 == var2 >> 6 && var3 >> 6 == 328545142 * this.regionStartY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod273(int var1, int var2) {
      return -429761663 * this.regionEndX == var1 >> 6 && var2 >> 6 == this.regionEndY * -370042613;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod274(int var1, int var2) {
      return 1591800825 * this.regionEndX == var1 >> 6 && var2 >> 6 == this.regionEndY * -370042613;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("an")
   @Override
   public int[] getBorderTileLengths(int var1, int var2, int var3, byte var4) {
      try {
         return !this.containsCoord(var1, var2, var3, (byte)-34)
            ? null
            : new int[]{
               var2 + (-1203962304 * this.regionEndX - this.regionStartX * -562269504), var3 + (this.regionEndY * 2087076544 - 1636424896 * this.regionStartY)
            };
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mn.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ax")
   @Override
   public Coord vmethod277(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1528403137)) {
         return null;
      } else {
         int var3 = var1 + (-562269504 * this.regionStartX - -1203962304 * this.regionEndX);
         int var4 = var2 + (this.regionStartY * 1636424896 - this.regionEndY * 2087076544);
         return new Coord(this.minPlane * 452965039, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ar")
   @Override
   public Coord vmethod278(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -2092678058)) {
         return null;
      } else {
         int var3 = var1 + (1252845590 * this.regionStartX - -2028096839 * this.regionEndX);
         int var4 = var2 + (this.regionStartY * 223786616 - this.regionEndY * -1526741879);
         return new Coord(this.minPlane * 1148727711, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ah")
   @Override
   public Coord vmethod279(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1774492125)) {
         return null;
      } else {
         int var3 = var1 + (-562269504 * this.regionStartX - -1203962304 * this.regionEndX);
         int var4 = var2 + (this.regionStartY * 1636424896 - this.regionEndY * 2087076544);
         return new Coord(this.minPlane * 452965039, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod282(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(-109247834) * 1548543055;
      this.planes = var1.readUnsignedByte(589008102) * -971385143;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * 1737796579;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * -574016169;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * 97380536;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * 126315171;
      this.postRead(-1489010448);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod284(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(-1568081966) * 1385256013;
      this.planes = var1.readUnsignedByte(272276511) * -971385143;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * 1737796579;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * 1167908329;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * -2119344567;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * 1758381724;
      this.postRead(1041096251);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   @Override
   public void vmethod283(Buffer var1) {
      this.minPlane = var1.readUnsignedByte(389714006) * 1548543055;
      this.planes = var1.readUnsignedByte(1114785840) * -971385143;
      this.regionStartX = Buffer.method12008(var1, (byte)5) * 1737796579;
      this.regionStartY = Buffer.method12008(var1, (byte)5) * -1099409989;
      this.regionEndX = Buffer.method12008(var1, (byte)5) * -2119344567;
      this.regionEndY = Buffer.method12008(var1, (byte)5) * 126315171;
      this.postRead(1859532009);
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("aw")
   @Override
   public void vmethod265(WorldMapArea var1) {
      if (var1.regionLowX * 1296134516 > 1591800825 * this.regionEndX) {
         var1.regionLowX = this.regionEndX * 2003987314;
      }

      if (var1.regionHighX * 2009549851 < this.regionEndX * 535726954) {
         var1.regionHighX = this.regionEndX * -1331799685;
      }

      if (-262946729 * var1.regionLowY > -370042613 * this.regionEndY) {
         var1.regionLowY = this.regionEndY * 1098673261;
      }

      if (1446871149 * var1.regionHighY < -370042613 * this.regionEndY) {
         var1.regionHighY = -899007986 * this.regionEndY;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method7450() {
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("av")
   @Override
   public void expandBounds(WorldMapArea var1, int var2) {
      try {
         if (var1.regionLowX * 972064699 > 1591800825 * this.regionEndX) {
            var1.regionLowX = this.regionEndX * 990352859;
         }

         if (var1.regionHighX * 2009549851 < this.regionEndX * 1591800825) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionHighX = this.regionEndX * -1331799685;
         }

         if (-262946729 * var1.regionLowY > -370042613 * this.regionEndY) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowY = this.regionEndY * 1098673261;
         }

         if (-234334363 * var1.regionHighY < -370042613 * this.regionEndY) {
            if (var2 >= -1420536974) {
               return;
            }

            var1.regionHighY = 269238191 * this.regionEndY;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "mn.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method7451() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method7446(int var0) {
      try {
         class182.field1851.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "mn.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ad")
   @Override
   public boolean vmethod266(int var1, int var2, int var3) {
      return var1 >= 452965039 * this.minPlane && var1 < 452965039 * this.minPlane + this.planes * -1542708359
         ? this.regionStartX * 58323403 == var2 >> 6 && var3 >> 6 == -2121914509 * this.regionStartY
         : false;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIB)Z")
   @ObfuscatedName("aj")
   static boolean method7452(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, byte var12
   ) {
      try {
         var8++;
         var9++;
         var10--;
         var11--;
         if (var0 >= var8) {
            if (var12 != 1) {
               throw new IllegalStateException();
            }

            if (var0 <= var10 && var1 >= var9) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (var1 <= var11) {
                  return true;
               }
            }
         }

         if (var2 >= var8) {
            if (var12 != 1) {
               throw new IllegalStateException();
            }

            if (var2 <= var10) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (var3 >= var9) {
                  if (var12 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= var11) {
                     return true;
                  }
               }
            }
         }

         if (var4 >= var8 && var4 <= var10) {
            if (var12 != 1) {
               throw new IllegalStateException();
            }

            if (var5 >= var9) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (var5 <= var11) {
                  if (var12 != 1) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         if (var6 >= var8) {
            if (var12 != 1) {
               throw new IllegalStateException();
            }

            if (var6 <= var10) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (var7 >= var9) {
                  if (var12 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var7 <= var11) {
                     if (var12 != 1) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         if (!WorldMapArea.method6907(var8, var9, var0, var1, var2, var3, var4, var5, -1779907607)) {
            if (var12 != 1) {
               throw new IllegalStateException();
            }

            if (!WorldMapArea.method6907(var8, var11, var0, var1, var2, var3, var4, var5, -1933075973)) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (!WorldMapArea.method6907(var10, var9, var0, var1, var2, var3, var4, var5, -1411267783)) {
                  if (var12 != 1) {
                     throw new IllegalStateException();
                  }

                  if (!WorldMapArea.method6907(var10, var11, var0, var1, var2, var3, var4, var5, -186892770)) {
                     if (!Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9, 1889235760)) {
                        if (var12 != 1) {
                           throw new IllegalStateException();
                        }

                        if (!Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9, var10, var11, 2010495762)
                           && !Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var11, var8, var11, 1791372319)
                           && !Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var11, var8, var9, 2090184862)) {
                           return false;
                        }
                     }

                     return true;
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "mn.aj(" + ')');
      }
   }
}
