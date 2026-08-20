import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lt")
public class WorldMapData_1 extends AbstractWorldMapData {
   @ObfuscatedName("an")
   int chunkY;
   @ObfuscatedName("ag")
   int chunkX;
   @ObfuscatedName("at")
   int chunkYLow;
   @ObfuscatedName("av")
   int chunkXLow;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("cx")
   static SpritePixels rightTitleSprite;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method7284() {
      return this.chunkXLow * 593586044;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llt;Lxa;)V")
   @ObfuscatedName("kq")
   public static void method7264(WorldMapData_1 var0, Buffer var1) {
      if (var0 == null) {
         var0.method7270();
      }

      int var2 = var1.readUnsignedByte(797239754);
      if (var2 != WorldMapID.field3659.value * 1166744947) {
         throw new IllegalStateException("");
      } else {
         var0.minPlane = var1.readUnsignedByte(1978740153) * 1667049624;
         var0.planes = var1.readUnsignedByte(-522676165) * 1528296707;
         var0.regionXLow = Buffer.method12008(var1, (byte)5) * 1597123053;
         var0.regionYLow = Buffer.method12008(var1, (byte)5) * -1310284322;
         var0.chunkYLow = var1.readUnsignedByte(-359594059) * 2024060157;
         var0.chunkX = var1.readUnsignedByte(-669527409) * 1523063815;
         var0.regionX = Buffer.method12008(var1, (byte)5) * 2069748770;
         var0.regionY = Buffer.method12008(var1, (byte)5) * 1106869489;
         var0.chunkY = var1.readUnsignedByte(148641022) * -1937928851;
         var0.chunkXLow = var1.readUnsignedByte(-1600601247) * -1673632217;
         var0.groupId = var1.readNullableLargeSmart(-1933790865) * -817586406;
         var0.fileId = var1.readNullableLargeSmart(160748896) * -881501843;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   @Override
   void readGeography(Buffer var1, int var2) {
      try {
         this.planes = Math.min(this.planes * -1789868441, 4) * 1802827095;
         this.floorUnderlayIds = new short[1][64][64];
         this.floorOverlayIds = new short[-1789868441 * this.planes][64][64];
         this.field3755 = new byte[this.planes * -1789868441][64][64];
         this.field3754 = new byte[this.planes * -1789868441][64][64];
         this.decorations = new WorldMapDecoration[-1789868441 * this.planes][64][64][];
         int var3 = var1.readUnsignedByte(-30892025);
         if (-1492311435 * class309.field3703.value != var3) {
            if (var2 >= -1199104632) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var4 = var1.readUnsignedByte(-159444022);
            int var5 = var1.readUnsignedByte(-732958864);
            int var6 = var1.readUnsignedByte(121799803);
            int var7 = var1.readUnsignedByte(1640859693);
            if (this.regionX * 1415052445 == var4) {
               if (var2 >= -1199104632) {
                  throw new IllegalStateException();
               }

               if (-588647407 * this.regionY == var5) {
                  if (var2 >= -1199104632) {
                     throw new IllegalStateException();
                  }

                  if (-472280825 * this.chunkY == var6) {
                     if (var2 >= -1199104632) {
                        throw new IllegalStateException();
                     }

                     if (this.chunkXLow * 1442319505 == var7) {
                        for (int var8 = 0; var8 < 8; var8++) {
                           if (var2 >= -1199104632) {
                              throw new IllegalStateException();
                           }

                           for (int var9 = 0; var9 < 8; var9++) {
                              if (var2 >= -1199104632) {
                                 throw new IllegalStateException();
                              }

                              AbstractWorldMapData.method7240(this, var8 + this.chunkY * 516720696, var9 + this.chunkXLow * -1346345848, var1, (byte)83);
                           }
                        }

                        return;
                     }

                     if (var2 >= -1199104632) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            throw new IllegalStateException("");
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "lt.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int getChunkXLow(int var1) {
      try {
         return this.chunkXLow * 1442319505;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lt.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llt;I)I")
   @ObfuscatedName("pb")
   public static int method7272(WorldMapData_1 var0, int var1) {
      if (var0 == null) {
         return var0.getChunkYLow(var1);
      } else {
         try {
            return -557316011 * var0.chunkYLow;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "lt.ag(" + 41);
         }
      }
   }

   @Override
   public int hashCode() {
      try {
         return 1415052445 * this.regionX | -588647407 * this.regionY << 8 | this.chunkY * -472280825 << 16 | 1442319505 * this.chunkXLow << 24;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lt.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method7267(Object var1) {
      if (!(var1 instanceof WorldMapData_1)) {
         return false;
      } else {
         WorldMapData_1 var2 = (WorldMapData_1)var1;
         return var2.regionX * 1415052445 == 1415052445 * this.regionX && -588647407 * var2.regionY == 499884323 * this.regionY
            ? -1887557812 * var2.chunkY == 93128669 * this.chunkY && var2.chunkXLow * -904243785 == 1442319505 * this.chunkXLow
            : false;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method7280() {
      return this.chunkY * -472280825;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ak")
   int getChunkX(byte var1) {
      try {
         return this.chunkY * -472280825;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lt.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method7268(Object var1) {
      if (!(var1 instanceof WorldMapData_1)) {
         return false;
      } else {
         WorldMapData_1 var2 = (WorldMapData_1)var1;
         return var2.regionX * 1415052445 == 1415052445 * this.regionX && -588647407 * var2.regionY == -588647407 * this.regionY
            ? -472280825 * var2.chunkY == -472280825 * this.chunkY && var2.chunkXLow * 1442319505 == 1442319505 * this.chunkXLow
            : false;
      }
   }

   WorldMapData_1() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   void init(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte(-143887669);
         if (var3 != WorldMapID.field3659.value * 1166744947) {
            throw new IllegalStateException("");
         } else {
            this.minPlane = var1.readUnsignedByte(448225162) * 1575898727;
            this.planes = var1.readUnsignedByte(-884412828) * 1802827095;
            this.regionXLow = Buffer.method12008(var1, (byte)5) * 1597123053;
            this.regionYLow = Buffer.method12008(var1, (byte)5) * -114939813;
            this.chunkYLow = var1.readUnsignedByte(223610258) * 2024060157;
            this.chunkX = var1.readUnsignedByte(1002759597) * 1173849831;
            this.regionX = Buffer.method12008(var1, (byte)5) * 830892469;
            this.regionY = Buffer.method12008(var1, (byte)5) * 1106869489;
            this.chunkY = var1.readUnsignedByte(1382687341) * 1269501111;
            this.chunkXLow = var1.readUnsignedByte(428874269) * 975516785;
            this.groupId = var1.readNullableLargeSmart(-350819429) * 514790051;
            this.fileId = var1.readNullableLargeSmart(-886508228) * -881501843;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lt.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llt;I)I")
   @ObfuscatedName("ut")
   public static int method7277(WorldMapData_1 var0, int var1) {
      if (var0 == null) {
         return var0.getChunkY(var1);
      } else {
         try {
            return 1457663191 * var0.chunkX;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "lt.aj(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod286(Buffer var1) {
      this.planes = Math.min(this.planes * -1789868441, 4) * 1802827095;
      this.floorUnderlayIds = new short[1][64][64];
      this.floorOverlayIds = new short[-1789868441 * this.planes][64][64];
      this.field3755 = new byte[this.planes * -1789868441][64][64];
      this.field3754 = new byte[this.planes * -1789868441][64][64];
      this.decorations = new WorldMapDecoration[-1789868441 * this.planes][64][64][];
      int var2 = var1.readUnsignedByte(446097902);
      if (-1492311435 * class309.field3703.value != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte(-954020052);
         int var4 = var1.readUnsignedByte(1133348054);
         int var5 = var1.readUnsignedByte(996800466);
         int var6 = var1.readUnsignedByte(769548766);
         if (this.regionX * 1415052445 == var3 && -588647407 * this.regionY == var4 && -472280825 * this.chunkY == var5 && this.chunkXLow * 1442319505 == var6) {
            for (int var7 = 0; var7 < 8; var7++) {
               for (int var8 = 0; var8 < 8; var8++) {
                  AbstractWorldMapData.method7240(this, var7 + this.chunkY * 516720696, var8 + this.chunkXLow * -1346345848, var1, (byte)86);
               }
            }
         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod287(Buffer var1) {
      this.planes = Math.min(this.planes * -1789868441, 4) * 1802827095;
      this.floorUnderlayIds = new short[1][1684943221][64];
      this.floorOverlayIds = new short[-1789868441 * this.planes][226371537][-852488743];
      this.field3755 = new byte[this.planes * -1789868441][-509761379][64];
      this.field3754 = new byte[this.planes * -550245355][64][-998686992];
      this.decorations = new WorldMapDecoration[-83358925 * this.planes][28489705][64][];
      int var2 = var1.readUnsignedByte(-1451712918);
      if (-247216515 * class309.field3703.value != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte(-547459313);
         int var4 = var1.readUnsignedByte(-1615320138);
         int var5 = var1.readUnsignedByte(-965139299);
         int var6 = var1.readUnsignedByte(1973692935);
         if (this.regionX * 1415052445 == var3 && -1886790533 * this.regionY == var4 && -44992105 * this.chunkY == var5 && this.chunkXLow * -600078147 == var6) {
            for (int var7 = 0; var7 < 8; var7++) {
               for (int var8 = 0; var8 < 8; var8++) {
                  AbstractWorldMapData.method7240(this, var7 + this.chunkY * -674898425, var8 + this.chunkXLow * -1545691723, var1, (byte)41);
               }
            }
         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method7270() {
      return 498057870 * this.regionX | -588647407 * this.regionY << 8 | this.chunkY * -1416148093 << 16 | 1442319505 * this.chunkXLow << 24;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method7269(Object var1) {
      if (!(var1 instanceof WorldMapData_1)) {
         return false;
      } else {
         WorldMapData_1 var2 = (WorldMapData_1)var1;
         return var2.regionX * 1415052445 == 1911664126 * this.regionX && -588647407 * var2.regionY == 1619777661 * this.regionY
            ? -472280825 * var2.chunkY == 1499470167 * this.chunkY && var2.chunkXLow * 1442319505 == 1442319505 * this.chunkXLow
            : false;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method7273() {
      return -33187925 * this.chunkYLow;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int method7274() {
      return 2118591015 * this.chunkYLow;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   int method7275() {
      return -557316011 * this.chunkYLow;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method7278() {
      return 1457663191 * this.chunkX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method7282() {
      return this.chunkY * 2119079766;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   int method7283() {
      return this.chunkY * 1433791146;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof WorldMapData_1)) {
            return false;
         } else {
            WorldMapData_1 var2 = (WorldMapData_1)var1;
            return var2.regionX * 1415052445 == 1415052445 * this.regionX && -588647407 * var2.regionY == -588647407 * this.regionY
               ? -472280825 * var2.chunkY == -472280825 * this.chunkY && var2.chunkXLow * 1442319505 == 1442319505 * this.chunkXLow
               : false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lt.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public static int getVarbit(int var0, int var1) {
      try {
         VarbitComposition var3 = (VarbitComposition)class402.method8806(VarbitComposition.VarbitDefinition_cached, var0);
         VarbitComposition var2;
         if (var3 != null) {
            if (var1 <= -1829634192) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            byte[] var4 = VarbitComposition.VarbitDefinition_archive.getFile(14, var0, 71658067);
            var3 = new VarbitComposition();
            if (null != var4) {
               if (var1 <= -1829634192) {
                  throw new IllegalStateException();
               }

               var3.decode(new Buffer(var4), (byte)64);
            }

            VarbitComposition.VarbitDefinition_cached.put(var3, var0);
            var2 = var3;
         }

         int var10 = var2.baseVar * 1051846737;
         int var5 = var2.startBit * 1628144867;
         int var6 = -1525413401 * var2.endBit;
         int var7 = Varps.Varps_masks[var6 - var5];
         return Varps.Varps_main[var10] >> var5 & var7;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "lt.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int getChunkYLow(int var1) {
      try {
         return -557316011 * this.chunkYLow;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lt.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   int getChunkY(int var1) {
      try {
         return 1457663191 * this.chunkXLow;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lt.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method7271() {
      try {
         return 1415052445 * super.minPlane | -588647407 * super.groupId << 8 | this.chunkY * -472280825 << 16 | 1442319505 * this.chunkX << 24;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lt.hashCode(" + 41);
      }
   }
}
