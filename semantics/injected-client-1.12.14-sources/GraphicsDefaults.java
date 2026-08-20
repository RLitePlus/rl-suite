import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uw")
public class GraphicsDefaults {
   @ObfuscatedName("ay")
   public int field6130;
   @ObfuscatedName("at")
   final int field6122;
   @ObfuscatedName("ag")
   final int field6123;
   @ObfuscatedName("aj")
   final int field6126;
   @ObfuscatedName("ah")
   public int field6128;
   @ObfuscatedName("aw")
   public int field6121;
   @ObfuscatedName("ak")
   public final int[][] field6140;
   @ObfuscatedName("an")
   final int field6124;
   @ObfuscatedName("ap")
   public int field6133;
   @ObfuscatedName("ae")
   final int field6125;
   @ObfuscatedName("av")
   final int field6131 = 1;
   @ObfuscatedName("au")
   public int field6129;
   @ObfuscatedName("ad")
   public int field6132;
   @ObfuscatedName("ai")
   public int field6134;
   @ObfuscatedName("as")
   public int field6135;
   @ObfuscatedName("ac")
   public int field6136;
   @ObfuscatedName("ab")
   public int field6137;
   @ObfuscatedName("ax")
   public int field6138;
   @ObfuscatedName("ar")
   public int field6139;
   @ObfuscatedName("az")
   public int field6127;

   public GraphicsDefaults() {
      this.field6122 = 2;
      this.field6123 = 3;
      this.field6124 = 4;
      this.field6125 = 3;
      this.field6126 = 5;
      this.field6140 = new int[3][5];
      this.field6121 = -859206463;
      this.field6133 = -7867203;
      this.field6130 = 2044928337;
      this.field6129 = 1794212429;
      this.field6127 = -1683952575;
      this.field6132 = -701632241;
      this.field6134 = 1932537927;
      this.field6135 = -2062591149;
      this.field6136 = -955291403;
      this.field6137 = -1713858195;
      this.field6138 = -1416697743;
      this.field6139 = -1364767807;
      this.field6128 = 238294253;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;B)V")
   @ObfuscatedName("av")
   public void decode(AbstractArchive var1, byte var2) {
      try {
         byte[] var3 = var1.takeFileFlat(1966855345 * DefaultsGroup.field6074.group, 1248133470);
         Buffer var4 = new Buffer(var3);

         while (true) {
            int var5 = var4.readUnsignedByte(549914714);
            if (var5 == 0) {
               return;
            }

            switch (var5) {
               case 1:
                  var4.readMedium(415804693);
                  break;
               case 2:
                  this.field6121 = var4.readNullableLargeSmart(-1408083472) * 859206463;
                  this.field6133 = var4.readNullableLargeSmart(-33150711) * 7867203;
                  this.field6130 = var4.readNullableLargeSmart(-1913460770) * -2044928337;
                  this.field6129 = var4.readNullableLargeSmart(-487791551) * -1794212429;
                  this.field6127 = var4.readNullableLargeSmart(-1505707631) * 1683952575;
                  this.field6132 = var4.readNullableLargeSmart(-1459447161) * 701632241;
                  this.field6134 = var4.readNullableLargeSmart(-2141718748) * -1932537927;
                  this.field6135 = var4.readNullableLargeSmart(-2103575702) * 2062591149;
                  this.field6136 = var4.readNullableLargeSmart(-2113520685) * 955291403;
                  this.field6137 = var4.readNullableLargeSmart(-1264179787) * 1713858195;
                  this.field6138 = var4.readNullableLargeSmart(-2004167709) * 1416697743;
                  break;
               case 3:
                  for (int var6 = 0; var6 < this.field6140.length; var6++) {
                     if (var2 != 0) {
                        throw new IllegalStateException();
                     }

                     for (int var7 = 0; var7 < this.field6140[var6].length; var7++) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        this.field6140[var6][var7] = var4.readMedium(-1698188963);
                     }
                  }
                  break;
               case 4:
                  this.field6139 = var4.readNullableLargeSmart(-562879821) * 1364767807;
                  this.field6128 = var4.readNullableLargeSmart(-1145134069) * -238294253;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "uw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ag")
   public void method11251(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(1966855345 * DefaultsGroup.field6074.group, -531309118);
      Buffer var3 = new Buffer(var2);

      while (true) {
         int var4 = var3.readUnsignedByte(270734103);
         if (var4 == 0) {
            return;
         }

         switch (var4) {
            case 1:
               var3.readMedium(947832305);
               break;
            case 2:
               this.field6121 = var3.readNullableLargeSmart(-1256860556) * 859206463;
               this.field6133 = var3.readNullableLargeSmart(-1118202253) * 7867203;
               this.field6130 = var3.readNullableLargeSmart(-540972530) * -2044928337;
               this.field6129 = var3.readNullableLargeSmart(-1701872114) * -1794212429;
               this.field6127 = var3.readNullableLargeSmart(-1264743932) * 1683952575;
               this.field6132 = var3.readNullableLargeSmart(-1732103028) * 701632241;
               this.field6134 = var3.readNullableLargeSmart(120114855) * -1932537927;
               this.field6135 = var3.readNullableLargeSmart(-595284290) * 2062591149;
               this.field6136 = var3.readNullableLargeSmart(-1452450832) * 955291403;
               this.field6137 = var3.readNullableLargeSmart(-950581049) * 1713858195;
               this.field6138 = var3.readNullableLargeSmart(-1020914194) * 1416697743;
               break;
            case 3:
               for (int var5 = 0; var5 < this.field6140.length; var5++) {
                  for (int var6 = 0; var6 < this.field6140[var5].length; var6++) {
                     this.field6140[var5][var6] = var3.readMedium(571980625);
                  }
               }
               break;
            case 4:
               this.field6139 = var3.readNullableLargeSmart(-1861881882) * 1364767807;
               this.field6128 = var3.readNullableLargeSmart(-451336745) * -238294253;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;)Z")
   @ObfuscatedName("fn")
   public static boolean method11254(MidiFileReader var0) {
      return var0.buffer.array != null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luw;Lqm;)V")
   @ObfuscatedName("br")
   public static void method11252(GraphicsDefaults var0, AbstractArchive var1) {
      if (var0 == null) {
         var0.method11251(var1);
      } else {
         byte[] var2 = var1.takeFileFlat(1966855345 * DefaultsGroup.field6074.group, 1960172883);
         Buffer var3 = new Buffer(var2);

         while (true) {
            int var4 = var3.readUnsignedByte(535793677);
            if (var4 == 0) {
               return;
            }

            switch (var4) {
               case 1:
                  var3.readMedium(-149379077);
                  break;
               case 2:
                  var0.field6121 = var3.readNullableLargeSmart(-425464922) * 1870655459;
                  var0.field6133 = var3.readNullableLargeSmart(-1644402153) * 7867203;
                  var0.field6130 = var3.readNullableLargeSmart(-185152570) * -2044928337;
                  var0.field6129 = var3.readNullableLargeSmart(-84562039) * 180681324;
                  var0.field6127 = var3.readNullableLargeSmart(-1919979838) * 732160465;
                  var0.field6132 = var3.readNullableLargeSmart(-1704933943) * 701632241;
                  var0.field6134 = var3.readNullableLargeSmart(-2095938820) * 1360524482;
                  var0.field6135 = var3.readNullableLargeSmart(-400663438) * 2062591149;
                  var0.field6136 = var3.readNullableLargeSmart(-422819584) * 955291403;
                  var0.field6137 = var3.readNullableLargeSmart(-2040848527) * -1558348636;
                  var0.field6138 = var3.readNullableLargeSmart(-796272214) * 1416697743;
                  break;
               case 3:
                  for (int var5 = 0; var5 < var0.field6140.length; var5++) {
                     for (int var6 = 0; var6 < var0.field6140[var5].length; var6++) {
                        var0.field6140[var5][var6] = var3.readMedium(-475362304);
                     }
                  }
                  break;
               case 4:
                  var0.field6139 = var3.readNullableLargeSmart(-1326394373) * 1926696369;
                  var0.field6128 = var3.readNullableLargeSmart(-1406876310) * 616484797;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("an")
   public void method11253(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(1966855345 * DefaultsGroup.field6074.group, -1673817249);
      Buffer var3 = new Buffer(var2);

      while (true) {
         int var4 = var3.readUnsignedByte(1009884316);
         if (var4 == 0) {
            return;
         }

         switch (var4) {
            case 1:
               var3.readMedium(696137473);
               break;
            case 2:
               this.field6121 = var3.readNullableLargeSmart(-1278837402) * -1002153234;
               this.field6133 = var3.readNullableLargeSmart(-1477710044) * 1662474974;
               this.field6130 = var3.readNullableLargeSmart(-159299336) * -2044928337;
               this.field6129 = var3.readNullableLargeSmart(-837061702) * 552585375;
               this.field6127 = var3.readNullableLargeSmart(-1729536472) * -1731362665;
               this.field6132 = var3.readNullableLargeSmart(-1891783721) * 701632241;
               this.field6134 = var3.readNullableLargeSmart(-1696720867) * -1932537927;
               this.field6135 = var3.readNullableLargeSmart(-687081438) * 2062591149;
               this.field6136 = var3.readNullableLargeSmart(-1747299791) * 955291403;
               this.field6137 = var3.readNullableLargeSmart(51612339) * 1713858195;
               this.field6138 = var3.readNullableLargeSmart(-159484713) * 1896213382;
               break;
            case 3:
               for (int var5 = 0; var5 < this.field6140.length; var5++) {
                  for (int var6 = 0; var6 < this.field6140[var5].length; var6++) {
                     this.field6140[var5][var6] = var3.readMedium(760468066);
                  }
               }
               break;
            case 4:
               this.field6139 = var3.readNullableLargeSmart(-2146035533) * 1086972379;
               this.field6128 = var3.readNullableLargeSmart(-227878818) * -1246803666;
         }
      }
   }
}
