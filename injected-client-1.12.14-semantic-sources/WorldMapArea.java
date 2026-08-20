import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.api.WorldMapData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("la")
public class WorldMapArea implements WorldMapData {
   @ObfuscatedName("aw")
   int regionLowX;
   @ObfuscatedName("at")
   String internalName;
   @ObfuscatedName("ag")
   String externalName;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field3607 = 7;
   @ObfuscatedName("ad")
   LinkedList sections;
   @ObfuscatedName("aj")
   int zoom;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("ak")
   Coord origin;
   @ObfuscatedName("an")
   int field3597;
   @ObfuscatedName("av")
   int id = -2039433263;
   @ObfuscatedName("ay")
   int regionLowY;
   @ObfuscatedName("au")
   int regionHighY;
   @ObfuscatedName("az")
   boolean isMain;
   @ObfuscatedName("ae")
   int field3599;
   @ToRemove(unused = "true")
   @ObfuscatedName("cp")
   public static final int field3608 = 104;
   @ObfuscatedName("ap")
   int regionHighX;

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void setBounds(byte var1) {
      try {
         Iterator var2 = this.sections.iterator();

         while (var2.hasNext()) {
            if (var1 <= 112) {
               return;
            }

            WorldMapSection var3 = (WorldMapSection)var2.next();
            var3.expandBounds(this, -1683202969);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "la.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)Lmw;")
   @ObfuscatedName("at")
   WorldMapSection readWorldMapSection(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte(-1465417861);
         WorldMapSectionType[] var4 = new WorldMapSectionType[]{
            WorldMapSectionType.WORLDMAPSECTIONTYPE1,
            WorldMapSectionType.WORLDMAPSECTIONTYPE3,
            WorldMapSectionType.WORLDMAPSECTIONTYPE0,
            WorldMapSectionType.WORLDMAPSECTIONTYPE2
         };
         WorldMapSectionType var5 = (WorldMapSectionType)GrandExchangeOffer.findEnumerated(var4, var3, (byte)1);
         Object var6 = null;
         switch (var5.type * -1593199457) {
            case 0:
               var6 = new WorldMapSection2();
               break;
            case 1:
               var6 = new WorldMapSection0();
               break;
            case 2:
               var6 = new WorldMapSection1();
               break;
            case 3:
               var6 = new class299();
               break;
            default:
               throw new IllegalStateException("");
         }

         ((WorldMapSection)var6).read(var1, -1666502772);
         return (WorldMapSection)var6;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "la.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ag")
   public boolean containsCoord(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.sections.iterator();

         while (var5.hasNext()) {
            if (var4 != 2136870681) {
               throw new IllegalStateException();
            }

            WorldMapSection var6 = (WorldMapSection)var5.next();
            if (var6.containsCoord(var1, var2, var3, (byte)-15)) {
               if (var4 != 2136870681) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "la.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;Lxa;I)V")
   @ObfuscatedName("za")
   public static void method6902(WorldMapArea var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method6949();
      }

      var0.id = var2 * 2039433263;
      var0.internalName = var1.readStringCp1252NullCircumfixed(-1155956062);
      var0.externalName = var1.readStringCp1252NullCircumfixed(437057127);
      var0.origin = new Coord(Buffer.method12015(var1, 2015554144));
      var0.field3597 = Buffer.method12015(var1, 586969449) * -1288785053;
      var0.field3599 = Buffer.method12015(var1, -1005529741) * -451993227;
      var1.readUnsignedByte(-819500692);
      var0.isMain = var1.readUnsignedByte(-513381516) == 1;
      var0.zoom = var1.readUnsignedByte(-1150873099) * -1990217257;
      int var3 = var1.readUnsignedByte(456096038);
      var0.sections = new LinkedList();

      for (int var4 = 0; var4 < var3; var4++) {
         var0.sections.add(var0.readWorldMapSection(var1, -615011018));
      }

      var0.setBounds((byte)116);
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("an")
   public boolean containsPosition(int var1, int var2, byte var3) {
      try {
         int var4 = var1 / 64;
         int var5 = var2 / 64;
         if (var4 >= 972064699 * this.regionLowX) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            if (var4 <= 2009549851 * this.regionHighX) {
               if (var5 >= -262946729 * this.regionLowY) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= -234334363 * this.regionHighY) {
                     Iterator var6 = this.sections.iterator();

                     while (var6.hasNext()) {
                        if (var3 == 0) {
                           throw new IllegalStateException();
                        }

                        WorldMapSection var7 = (WorldMapSection)var6.next();
                        if (var7.containsPosition(var1, var2, -1400123545)) {
                           if (var3 == 0) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }
                     }

                     return false;
                  }

                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            }

            if (var3 == 0) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "la.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;B)I")
   @ObfuscatedName("tq")
   public static int method6955(WorldMapArea var0, byte var1) {
      if (var0 == null) {
         return var0.getRegionHighX(var1);
      } else {
         try {
            return var0.regionHighX * 2009549851;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "la.ac(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cg")
   public int method6960() {
      return 767780925 * this.regionLowY;
   }

   @ObfuscatedSignature(descriptor = "(IIB)Loj;")
   @ObfuscatedName("aj")
   public Coord coord(int var1, int var2, byte var3) {
      try {
         for (WorldMapSection var5 : this.sections) {
            if (var5.containsPosition(var1, var2, -1836111411)) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               return var5.coord(var1, var2, 216292671);
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "la.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   public int method6965() {
      return this.regionHighY * -234334363;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   public boolean getIsMain(int var1) {
      try {
         return this.isMain;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bk")
   public boolean method6918(int var1, int var2) {
      int var3 = var1 / -1873751671;
      int var4 = var2 / 64;
      if (var3 >= -553737737 * this.regionLowX && var3 <= -1717668412 * this.regionHighX) {
         if (var4 >= -262946729 * this.regionLowY && var4 <= -234334363 * this.regionHighY) {
            for (WorldMapSection var6 : this.sections) {
               if (var6.containsPosition(var1, var2, -1407891914)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("bp")
   public int[] method6920(int var1, int var2, int var3) {
      for (WorldMapSection var5 : this.sections) {
         if (var5.containsCoord(var1, var2, var3, (byte)5)) {
            return var5.getBorderTileLengths(var1, var2, var3, (byte)67);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   int method6945(byte var1) {
      try {
         return this.field3597 * 1716020811;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ai")
   public int getZoom(byte var1) {
      try {
         return -428158489 * this.zoom;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lmw;")
   @ObfuscatedName("aq")
   WorldMapSection method6910(Buffer var1) {
      int var2 = var1.readUnsignedByte(1939289024);
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{
         WorldMapSectionType.WORLDMAPSECTIONTYPE1,
         WorldMapSectionType.WORLDMAPSECTIONTYPE3,
         WorldMapSectionType.WORLDMAPSECTIONTYPE0,
         WorldMapSectionType.WORLDMAPSECTIONTYPE2
      };
      WorldMapSectionType var4 = (WorldMapSectionType)GrandExchangeOffer.findEnumerated(var3, var2, (byte)1);
      Object var5 = null;
      switch (var4.type * -1593199457) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new WorldMapSection0();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new class299();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1, 269359993);
      return (WorldMapSection)var5;
   }

   @ObfuscatedSignature(descriptor = "(Lla;B)I")
   @ObfuscatedName("kl")
   public static int method6961(WorldMapArea var0, byte var1) {
      if (var0 == null) {
         return var0.getRegionLowY(var1);
      } else {
         try {
            return -262946729 * var0.regionLowY;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "la.ab(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public int getRegionHighY(int var1) {
      try {
         return this.regionHighY * -234334363;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public int getOriginX(int var1) {
      try {
         return this.origin.x * -1931160809;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public int getOriginPlane(int var1) {
      try {
         return 370217423 * this.origin.plane;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Loj;")
   @ObfuscatedName("af")
   public Coord getOrigin(int var1) {
      try {
         return new Coord(this.origin);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int getRegionLowX(int var1) {
      try {
         return this.regionLowX * 972064699;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ao")
   public void method6903(Buffer var1, int var2) {
      this.id = var2 * 2039433263;
      this.internalName = var1.readStringCp1252NullCircumfixed(891912813);
      this.externalName = var1.readStringCp1252NullCircumfixed(1344701267);
      this.origin = new Coord(Buffer.method12015(var1, -601647751));
      this.field3597 = Buffer.method12015(var1, 1043255554) * -1288785053;
      this.field3599 = Buffer.method12015(var1, 957412675) * -451993227;
      var1.readUnsignedByte(1289574480);
      this.isMain = var1.readUnsignedByte(-57723118) == 1;
      this.zoom = var1.readUnsignedByte(1789318903) * -1990217257;
      int var3 = var1.readUnsignedByte(954436760);
      this.sections = new LinkedList();

      for (int var4 = 0; var4 < var3; var4++) {
         this.sections.add(this.readWorldMapSection(var1, -982016111));
      }

      this.setBounds((byte)123);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lmw;")
   @ObfuscatedName("be")
   WorldMapSection method6911(Buffer var1) {
      int var2 = var1.readUnsignedByte(1994590597);
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{
         WorldMapSectionType.WORLDMAPSECTIONTYPE1,
         WorldMapSectionType.WORLDMAPSECTIONTYPE3,
         WorldMapSectionType.WORLDMAPSECTIONTYPE0,
         WorldMapSectionType.WORLDMAPSECTIONTYPE2
      };
      WorldMapSectionType var4 = (WorldMapSectionType)GrandExchangeOffer.findEnumerated(var3, var2, (byte)1);
      Object var5 = null;
      switch (var4.type * -1593199457) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new WorldMapSection0();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new class299();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1, 1812735366);
      return (WorldMapSection)var5;
   }

   @ObfuscatedSignature(descriptor = "()Loj;")
   @ObfuscatedName("cr")
   public Coord method6978() {
      return new Coord(this.origin);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aa")
   public void method6904(Buffer var1, int var2) {
      this.id = var2 * 2039433263;
      this.internalName = var1.readStringCp1252NullCircumfixed(-532944771);
      this.externalName = var1.readStringCp1252NullCircumfixed(-829976942);
      this.origin = new Coord(Buffer.method12015(var1, 2031865759));
      this.field3597 = Buffer.method12015(var1, 690184470) * -1288785053;
      this.field3599 = Buffer.method12015(var1, -886679059) * -451993227;
      var1.readUnsignedByte(1355276800);
      this.isMain = var1.readUnsignedByte(1108305962) == 1;
      this.zoom = var1.readUnsignedByte(168897780) * -1990217257;
      int var3 = var1.readUnsignedByte(1218037503);
      this.sections = new LinkedList();

      for (int var4 = 0; var4 < var3; var4++) {
         this.sections.add(this.readWorldMapSection(var1, -1421624131));
      }

      this.setBounds((byte)125);
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)I")
   @ObfuscatedName("ao")
   public static int method6931(WorldMapArea var0, int var1) {
      if (var0 == null) {
         var0.getId(var1);
      }

      try {
         return -983892273 * var0.id;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bs")
   public boolean method6915(int var1, int var2, int var3) {
      for (WorldMapSection var5 : this.sections) {
         if (var5.containsCoord(var1, var2, var3, (byte)-50)) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method6929() {
      for (WorldMapSection var2 : this.sections) {
         var2.expandBounds(this, -1657860888);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bj")
   public boolean method6919(int var1, int var2) {
      int var3 = var1 / 1295440146;
      int var4 = var2 / 64;
      if (var3 >= -271089751 * this.regionLowX && var3 <= 2009549851 * this.regionHighX) {
         if (var4 >= -200182974 * this.regionLowY && var4 <= -234334363 * this.regionHighY) {
            for (WorldMapSection var6 : this.sections) {
               if (var6.containsPosition(var1, var2, -2061060106)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public WorldMapArea() {
      this.field3597 = 1288785053;
      this.field3599 = -1962934272;
      this.zoom = 1990217257;
      this.origin = null;
      this.regionLowX = 1104206477;
      this.regionHighX = 0;
      this.regionLowY = 543610009;
      this.regionHighY = 0;
      this.isMain = false;
   }

   @ObfuscatedSignature(descriptor = "(Lla;Lxa;IB)V")
   @ObfuscatedName("pf")
   public static void method6905(WorldMapArea var0, Buffer var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method6906(var1, var2, var3);
      } else {
         try {
            var0.id = var2 * 2039433263;
            var0.internalName = var1.readStringCp1252NullCircumfixed(325759326);
            var0.externalName = var1.readStringCp1252NullCircumfixed(1725934396);
            var0.origin = new Coord(Buffer.method12015(var1, 915300244));
            var0.field3597 = Buffer.method12015(var1, -83996416) * -1288785053;
            var0.field3599 = Buffer.method12015(var1, 428392934) * -451993227;
            var1.readUnsignedByte(1115519025);
            boolean var10001;
            if (var1.readUnsignedByte(-1540329443) == 1) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var0.isMain = var10001;
            var0.zoom = var1.readUnsignedByte(2321119) * -1990217257;
            int var4 = var1.readUnsignedByte(1644293402);
            var0.sections = new LinkedList();

            for (int var5 = 0; var5 < var4; var5++) {
               var0.sections.add(var0.readWorldMapSection(var1, -115503325));
            }

            var0.setBounds((byte)120);
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "la.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("bt")
   public int[] method6921(int var1, int var2, int var3) {
      for (WorldMapSection var5 : this.sections) {
         if (var5.containsCoord(var1, var2, var3, (byte)-65)) {
            return var5.getBorderTileLengths(var1, var2, var3, (byte)96);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)Ljava/lang/String;")
   @ObfuscatedName("id")
   public static String method6941(WorldMapArea var0, int var1) {
      if (var0 == null) {
         var0.getExternalName(var1);
      }

      try {
         return var0.externalName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("bm")
   public int[] method6922(int var1, int var2, int var3) {
      for (WorldMapSection var5 : this.sections) {
         if (var5.containsCoord(var1, var2, var3, (byte)0)) {
            return var5.getBorderTileLengths(var1, var2, var3, (byte)91);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("bu")
   public Coord method6926(int var1, int var2) {
      for (WorldMapSection var4 : this.sections) {
         if (var4.containsPosition(var1, var2, -1548598418)) {
            return var4.coord(var1, var2, 216292671);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ba")
   public Coord method6927(int var1, int var2) {
      for (WorldMapSection var4 : this.sections) {
         if (var4.containsPosition(var1, var2, -1698552269)) {
            return var4.coord(var1, var2, 216292671);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   public int method6932() {
      return -983892273 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   public int method6933() {
      return -983892273 * this.id;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljj;")
   @ObfuscatedName("av")
   public static class234 method6908(int var0) {
      try {
         return class234.field3044;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "la.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   public int method6934() {
      return -983892273 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   public boolean method6937() {
      return this.isMain;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   public boolean method6938() {
      return this.isMain;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bc")
   public String method6939() {
      return this.internalName;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bv")
   public String method6942() {
      return this.externalName;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   int method6946() {
      return this.field3597 * 1716020811;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bq")
   public String method6943() {
      return this.externalName;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   int method6947() {
      return this.field3597 * 1716020811;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   int method6948() {
      return this.field3599 * -851581219;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method6956() {
      return this.regionHighX * -1666312945;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method6930() {
      for (WorldMapSection var2 : this.sections) {
         var2.expandBounds(this, -1465501388);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   public int method6954() {
      return this.regionLowX * 972064699;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lmw;")
   @ObfuscatedName("bo")
   WorldMapSection method6912(Buffer var1) {
      int var2 = var1.readUnsignedByte(377981155);
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{
         WorldMapSectionType.WORLDMAPSECTIONTYPE1,
         WorldMapSectionType.WORLDMAPSECTIONTYPE3,
         WorldMapSectionType.WORLDMAPSECTIONTYPE0,
         WorldMapSectionType.WORLDMAPSECTIONTYPE2
      };
      WorldMapSectionType var4 = (WorldMapSectionType)GrandExchangeOffer.findEnumerated(var3, var2, (byte)1);
      Object var5 = null;
      switch (var4.type * -1593199457) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new WorldMapSection0();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new class299();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1, 1950328915);
      return (WorldMapSection)var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cn")
   public int method6957() {
      return this.regionHighX * 2009549851;
   }

   @ObfuscatedSignature(descriptor = "(Lla;IIII)[I")
   @ObfuscatedName("ly")
   public static int[] method6923(WorldMapArea var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         return var0.position(var1, var1, var1, var1);
      } else {
         try {
            Iterator var5 = var0.sections.iterator();

            while (var5.hasNext()) {
               if (var4 <= 2037229819) {
                  throw new IllegalStateException();
               }

               WorldMapSection var6 = (WorldMapSection)var5.next();
               if (var6.containsCoord(var1, var2, var3, (byte)11)) {
                  return var6.getBorderTileLengths(var1, var2, var3, (byte)35);
               }
            }

            return null;
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "la.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method6958() {
      return this.regionHighX * 2009549851;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   public int method6962() {
      return -262946729 * this.regionLowY;
   }

   public boolean surfaceContainsPosition(int var1, int var2) {
      return this.containsPosition(var1, var2, (byte)-47);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public int method6935() {
      return -983892273 * this.id;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String getInternalName(int var1) {
      try {
         return this.internalName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cf")
   public int method6968() {
      return this.origin.x * -1931160809;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   public int method6969() {
      return this.origin.x * -1931160809;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   public int method6973() {
      return 370217423 * this.origin.plane;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bz")
   public boolean method6916(int var1, int var2, int var3) {
      for (WorldMapSection var5 : this.sections) {
         if (var5.containsCoord(var1, var2, var3, (byte)-21)) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   public int method6974() {
      return -263036313 * this.origin.y;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)Z")
   @ObfuscatedName("ag")
   public static boolean method6907(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!PacketBufferNode.method7434(var0, var1, var2, var3, var4, var5, 361075336)) {
            if (var8 == -1295243854) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return PacketBufferNode.method7434(var0, var1, var4, var5, var6, var7, 361075336);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "la.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cm")
   int method6949() {
      return this.field3599 * -583067135;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("av")
   public void method6906(Buffer var1, int var2, byte var3) {
      try {
         this.field3599 = var2 * 2039433263;
         this.internalName = var1.readStringCp1252NullTerminatedOrNull(325759326);
         this.externalName = var1.readStringCp1252NullTerminatedOrNull(1725934396);
         this.origin = new Coord(Buffer.method12015(var1, 915300244));
         this.zoom = Buffer.method12015(var1, -83996416) * -1288785053;
         this.id = Buffer.method12015(var1, 428392934) * -451993227;
         var1.readShortSmartSub(1115519025);
         boolean var10001;
         if (var1.readShortSmartSub(-1540329443) == 1) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.isMain = var10001;
         this.zoom = var1.readUnsignedShortAddLE(2321119) * -1990217257;
         int var4 = var1.method12075(1644293402);
         this.sections = new LinkedList();

         for (int var5 = 0; var5 < var4; var5++) {
            this.sections.add(this.readWorldMapSection(var1, -115503325));
         }

         this.setBounds((byte)120);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "la.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method6950(int var1) {
      try {
         return this.regionHighY * -851581219;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ac")
   public int getRegionHighX(byte var1) {
      try {
         return this.zoom * 2009549851;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)I")
   @ObfuscatedName("ye")
   public static int method6951(WorldMapArea var0, int var1) {
      if (var0 == null) {
         var0.method6950(var1);
      }

      try {
         return var0.field3599 * -851581219;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   public int method6970() {
      return this.origin.x * -1931160809;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("al")
   public int getOriginY(byte var1) {
      try {
         return -263036313 * this.origin.x;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   public int getRegionLowY(byte var1) {
      try {
         return -262946729 * this.regionLowY;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bf")
   public int method6964() {
      return 767780925 * this.regionHighY;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   public String getExternalName(int var1) {
      try {
         return this.externalName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;B)I")
   @ObfuscatedName("he")
   public static int method6976(WorldMapArea var0, byte var1) {
      if (var0 == null) {
         var0.getOriginY(var1);
      }

      try {
         return -263036313 * var0.origin.y;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public int getId(int var1) {
      try {
         return this.origin.y * -1931160809;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "la.ar(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;Lxa;)Lmw;")
   @ObfuscatedName("be")
   public static WorldMapSection method6913(WorldMapArea var0, Buffer var1) {
      if (var0 == null) {
         var0.method6930();
      }

      int var2 = var1.readUnsignedByte(-1046802812);
      WorldMapSectionType[] var3 = new WorldMapSectionType[]{
         WorldMapSectionType.WORLDMAPSECTIONTYPE1,
         WorldMapSectionType.WORLDMAPSECTIONTYPE3,
         WorldMapSectionType.WORLDMAPSECTIONTYPE0,
         WorldMapSectionType.WORLDMAPSECTIONTYPE2
      };
      WorldMapSectionType var4 = (WorldMapSectionType)GrandExchangeOffer.findEnumerated(var3, var2, (byte)1);
      Object var5 = null;
      switch (var4.type * 536128651) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new WorldMapSection0();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new class299();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1, 898220438);
      return (WorldMapSection)var5;
   }

   @ObfuscatedSignature(descriptor = "(IIII)[I")
   @ObfuscatedName("ae")
   public int[] position(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.sections.iterator();

         while (var5.hasNext()) {
            if (var4 <= 2037229819) {
               throw new IllegalStateException();
            }

            WorldMapSection var6 = (WorldMapSection)var5.next();
            if (var6.containsCoord(var1, var2, var3, (byte)11)) {
               return var6.getBorderTileLengths(var1, var2, var3, (byte)35);
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "la.ae(" + ')');
      }
   }
}
