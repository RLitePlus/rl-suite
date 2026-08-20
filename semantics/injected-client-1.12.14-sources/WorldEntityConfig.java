import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hv")
public class WorldEntityConfig extends DualNode implements net.runelite.api.WorldEntityConfig {
   @ObfuscatedName("bt")
   int field2391;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2397 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2395 = 8;
   @ObfuscatedName("aq")
   public boolean field2384;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2400 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2401 = 17;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field2394 = 18;
   @ObfuscatedName("by")
   int field2390;
   @ObfuscatedName("bs")
   int boundsY;
   @ObfuscatedName("ao")
   public String field2378 = Strings.field4861;
   @ObfuscatedName("aa")
   public String[] field2377 = new String[5];
   @ObfuscatedName("be")
   int field2379;
   @ObfuscatedName("bo")
   int field2380;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("am")
   static EvictingDualNodeHashTable field2374 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("bg")
   int boundsX;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2398 = 2;
   @ObfuscatedName("bz")
   int boundsWidth;
   @ObfuscatedName("bk")
   int boundsHeight;
   @ObfuscatedName("bb")
   int field2385;
   @ObfuscatedSignature(descriptor = "Lvt;")
   @ObfuscatedName("bj")
   classVT field2404;
   @ObfuscatedName("wo")
   public int field2403;
   @ObfuscatedSignature(descriptor = "[Lvt;")
   @ObfuscatedName("bm")
   classVT[] field2392;
   @ObfuscatedName("bp")
   int id;
   @ObfuscatedSignature(descriptor = "Low;")
   @ObfuscatedName("ba")
   class386 field2387;
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("bu")
   class406 field2389;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("bw")
   static EvictingDualNodeHashTable field2375 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("bi")
   int field2386;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2393 = 23;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field2399 = 12;
   @ObfuscatedName("ur")
   static int field2402;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field2396 = 9;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   public int method4782() {
      return -328940957 * this.field2390;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhv;)I")
   @ObfuscatedName("uu")
   public static int method4751(WorldEntityConfig var0) {
      return 2058769091 * var0.field2391;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method4734(int var1) {
      try {
         return this.id * 1496622753;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhv;B)I")
   @ObfuscatedName("dz")
   public static int method4757(WorldEntityConfig var0, byte var1) {
      if (var0 == null) {
         var0.method4760(var1);
      }

      try {
         return var0.field2379 * 365389617;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aq")
   void method4739(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-1504349410);
            if (0 == var3) {
               return;
            }

            this.decodeNext(var1, var3, -1948815390);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method4735() {
      return this.id * 1496622753;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method4748(int var1) {
      try {
         this.field2404 = new classVT(this.boundsWidth * -1708957505, this.boundsHeight * -1934803429, 420693345 * this.boundsX, this.boundsY * -2043328725);
         this.method4750((byte)98);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   void method4750(byte var1) {
      try {
         short var2 = 256;
         this.field2392[0] = new classVT(
            -1708957505 * this.boundsWidth + var2, this.boundsHeight * -1934803429 + var2, 420693345 * this.boundsX, this.boundsY * -2043328725
         );
         var2 = 362;
         this.field2392[2] = new classVT(
            this.boundsWidth * -1708957505 + var2, var2 + -1934803429 * this.boundsHeight, 420693345 * this.boundsX, -2043328725 * this.boundsY
         );
         var2 = 334;
         this.field2392[1] = new classVT(
            var2 + -1708957505 * this.boundsWidth, -1934803429 * this.boundsHeight + var2, this.boundsX * 420693345, -2043328725 * this.boundsY
         );
         this.field2392[3] = this.field2392[1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hv.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ak")
   public int method4752(byte var1) {
      try {
         return 2058769091 * this.field2391;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhv;Lxa;I)V")
   @ObfuscatedName("mm")
   public static void method4744(WorldEntityConfig var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4774();
      }

      switch (var2) {
         case 2:
            var0.field2391 = var1.readUnsignedByte(763764855) * -804246483;
         case 3:
         case 10:
         case 11:
         case 13:
         case 21:
         case 22:
         default:
            break;
         case 4:
            var0.field2379 = var1.readShort((byte)-25) * -1503489583;
            break;
         case 5:
            var0.field2380 = var1.readShort((byte)-1) * -269667797;
            break;
         case 6:
            var0.boundsX = var1.readShort((byte)-47) * -255844703;
            break;
         case 7:
            var0.boundsY = var1.readShort((byte)-41) * -970244221;
            break;
         case 8:
            var0.boundsWidth = Buffer.method12008(var1, (byte)5) * -1720915762;
            break;
         case 9:
            var0.boundsHeight = Buffer.method12008(var1, (byte)5) * -2065739278;
            break;
         case 12:
            var0.field2378 = var1.readStringCp1252NullCircumfixed(1839059474);
            break;
         case 14:
            var0.field2384 = true;
            break;
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            int var3 = var2 - 15;
            var0.field2377[var3] = var1.readStringCp1252NullCircumfixed(-1320665476);
            if (var0.field2377[var3].equalsIgnoreCase(Strings.field4856)) {
               var0.field2377[var3] = null;
            }

            var0.field2384 = true;
            break;
         case 20:
            Buffer.method12008(var1, (byte)5);
            break;
         case 23:
            var0.field2389 = (class406)GrandExchangeOffer.findEnumerated(classGB.method4216((byte)-67), var1.readUnsignedByte(2066476345), (byte)1);
            break;
         case 24:
            var0.field2387 = (class386)GrandExchangeOffer.findEnumerated(class222.method4879((byte)-76), var1.readUnsignedByte(977476578), (byte)1);
            break;
         case 25:
            var0.field2385 = Buffer.method12008(var1, (byte)5) * 30001303;
            break;
         case 26:
            var0.field2386 = var1.readNullableLargeSmart(7255643) * -121027514;
            break;
         case 27:
            var0.field2390 = Buffer.method12008(var1, (byte)5) * -1286424901;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvt;")
   @ObfuscatedName("bi")
   public classVT method4767() {
      return this.field2404;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method4761(int var1) {
      try {
         return 1597504643 * this.field2380;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public int method4765(int var1) {
      try {
         return -1402587353 * this.field2385;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lpn;")
   @ObfuscatedName("az")
   public class406 method4771(byte var1) {
      try {
         return this.field2389;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("jk")
   public void method4788(Buffer var1, int var2) {
      if (var2 == 20) {
         int var3 = var1.method12223();
         this.field2403 = var1.method12219();
         var1.method12229(var3);
      }
   }

   public int getBoundsHeight() {
      return this.boundsHeight * -1934803429;
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("ad")
   public class386 method4773(int var1) {
      try {
         return this.field2387;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ad(" + ')');
      }
   }

   public int getId() {
      return this.id * 1496622753;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)I")
   @ObfuscatedName("tj")
   public static int method4785(ObjectSound var0) {
      return 739522815 * var0.maxX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method4762() {
      return 1597504643 * this.field2380;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method4758() {
      return this.field2379 * 365389617;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("rv")
   public static int method4756(WorldMapArea var0) {
      return var0.regionHighY * -893320055;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhv;")
   @ObfuscatedName("ab")
   public static WorldEntityConfig method4733(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)class402.method8806(field2374, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HttpAuthenticationHeader.field5852.getFile(72, var0, -1591205631);
         var1 = new WorldEntityConfig();
         var1.id = -1089946271 * var0;
         if (null != var2) {
            var1.method4739(new Buffer(var2), -1035328937);
         }

         var1.method4748(-521677348);
         field2374.put(var1, var0);
         return var1;
      }
   }

   public int getBoundsWidth() {
      return this.boundsWidth * -1708957505;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public int method4736() {
      return this.id * -1771103005;
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Lof;")
   @ObfuscatedName("ou")
   static Widget method4787(Widget var0, int var1) {
      try {
         int var2 = class330.method7535(class191.getWidgetFlags(var0, (byte)75), -2074397494);
         if (var2 == 0) {
            if (var1 == -1701004998) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            for (int var3 = 0; var3 < var2; var3++) {
               if (var1 == -1701004998) {
                  throw new IllegalStateException();
               }

               var0 = class226.widgetDefinition.method7953(var0.parentId * 794900977, 836947543);
               if (var0 == null) {
                  if (var1 == -1701004998) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            return var0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hv.ou(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method4737() {
      return this.id * 1496622753;
   }

   public int getCategory() {
      return this.field2403;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("im")
   public SpritePixels method4789() {
      return this.method4777((byte)-64);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method4753() {
      return 2058769091 * this.field2391;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   void method4740(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-987729099);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, -1948815390);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ao")
   void method4741(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1091003686);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, -1948815390);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aa")
   void method4742(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1223650911);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, -1948815390);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("be")
   void method4745(Buffer var1, int var2) {
      switch (var2) {
         case 2:
            this.field2391 = var1.readUnsignedByte(-965578184) * 817327595;
         case 3:
         case 10:
         case 11:
         case 13:
         case 21:
         case 22:
         default:
            break;
         case 4:
            this.field2379 = var1.readShort((byte)-13) * -1503489583;
            break;
         case 5:
            this.field2380 = var1.readShort((byte)-75) * -269667797;
            break;
         case 6:
            this.boundsX = var1.readShort((byte)-64) * -255844703;
            break;
         case 7:
            this.boundsY = var1.readShort((byte)-95) * -970244221;
            break;
         case 8:
            this.boundsWidth = Buffer.method12008(var1, (byte)5) * 157290303;
            break;
         case 9:
            this.boundsHeight = Buffer.method12008(var1, (byte)5) * -1511822317;
            break;
         case 12:
            this.field2378 = var1.readStringCp1252NullCircumfixed(1167963465);
            break;
         case 14:
            this.field2384 = true;
            break;
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            int var3 = var2 - 15;
            this.field2377[var3] = var1.readStringCp1252NullCircumfixed(-1847354439);
            if (this.field2377[var3].equalsIgnoreCase(Strings.field4856)) {
               this.field2377[var3] = null;
            }

            this.field2384 = true;
            break;
         case 20:
            Buffer.method12008(var1, (byte)5);
            break;
         case 23:
            this.field2389 = (class406)GrandExchangeOffer.findEnumerated(classGB.method4216((byte)-86), var1.readUnsignedByte(686792608), (byte)1);
            break;
         case 24:
            this.field2387 = (class386)GrandExchangeOffer.findEnumerated(class222.method4879((byte)30), var1.readUnsignedByte(1664545541), (byte)1);
            break;
         case 25:
            this.field2385 = Buffer.method12008(var1, (byte)5) * 30001303;
            break;
         case 26:
            this.field2386 = var1.readNullableLargeSmart(-695660472) * 216382891;
            break;
         case 27:
            this.field2390 = Buffer.method12008(var1, (byte)5) * -691042793;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   void method4743(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(421966767);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, -1948815390);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bh")
   public SpritePixels method4776() {
      if (-318810877 * this.field2386 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(field2375, this.field2386 * -318810877);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(class141.field1966, -318810877 * this.field2386, 0, -2139672119);
            if (var1 != null) {
               field2375.put(var1, this.field2386 * -318810877);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, int var2) {
      switch (var2) {
         case 2:
            this.field2391 = var1.readUnsignedByte(392491463) * 817327595;
         case 3:
         case 10:
         case 11:
         case 13:
         case 21:
         case 22:
         default:
            break;
         case 4:
            this.field2379 = var1.readShort((byte)-83) * -1503489583;
            break;
         case 5:
            this.field2380 = var1.readShort((byte)-39) * -269667797;
            break;
         case 6:
            this.boundsX = var1.readShort((byte)-100) * -255844703;
            break;
         case 7:
            this.boundsY = var1.readShort((byte)-118) * -970244221;
            break;
         case 8:
            this.boundsWidth = Buffer.method12008(var1, (byte)5) * 157290303;
            break;
         case 9:
            this.boundsHeight = Buffer.method12008(var1, (byte)5) * -1511822317;
            break;
         case 12:
            this.field2378 = var1.readStringCp1252NullCircumfixed(-402467047);
            break;
         case 14:
            this.field2384 = true;
            break;
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            int var3 = var2 - 15;
            this.field2377[var3] = var1.readStringCp1252NullCircumfixed(-446976906);
            if (this.field2377[var3].equalsIgnoreCase(Strings.field4856)) {
               this.field2377[var3] = null;
            }

            this.field2384 = true;
            break;
         case 20:
            Buffer.method12008(var1, (byte)5);
            break;
         case 23:
            this.field2389 = (class406)GrandExchangeOffer.findEnumerated(classGB.method4216((byte)-17), var1.readUnsignedByte(715075973), (byte)1);
            break;
         case 24:
            this.field2387 = (class386)GrandExchangeOffer.findEnumerated(class222.method4879((byte)9), var1.readUnsignedByte(-657785397), (byte)1);
            break;
         case 25:
            this.field2385 = Buffer.method12008(var1, (byte)5) * 30001303;
            break;
         case 26:
            this.field2386 = var1.readNullableLargeSmart(-1302691079) * 216382891;
            break;
         case 27:
            this.field2390 = Buffer.method12008(var1, (byte)5) * -691042793;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method4754() {
      return 2058769091 * this.field2391;
   }

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("ai")
   public SpritePixels method4777(byte var1) {
      try {
         if (-318810877 * this.field2386 < 0) {
            if (var1 == 15) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(field2375, this.field2386 * -318810877);
            if (null != var2) {
               if (var1 == 15) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = class387.SpriteBuffer_getSprite(class141.field1966, -318810877 * this.field2386, 0, -2139672119);
               if (var2 != null) {
                  if (var1 == 15) {
                     throw new IllegalStateException();
                  }

                  field2375.put(var2, this.field2386 * -318810877);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hv.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   public int method4759() {
      return this.field2379 * -538608602;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public int method4738() {
      return this.id * 1496622753;
   }

   @ObfuscatedSignature(descriptor = "(Lhv;I)Lvt;")
   @ObfuscatedName("sq")
   public static classVT method4768(WorldEntityConfig var0, int var1) {
      if (var0 == null) {
         var0.method4770(var1);
      }

      try {
         return var0.field2404;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhv;)V")
   @ObfuscatedName("tx")
   public static void method4749(WorldEntityConfig var0) {
      var0.field2404 = new classVT(var0.boundsWidth * -1708957505, var0.boundsHeight * -1934803429, 420693345 * var0.boundsX, var0.boundsY * -2043328725);
      var0.method4750((byte)-76);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method4763() {
      return 1597504643 * this.field2380;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method4764() {
      return 1658899370 * this.field2380;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, int var3) {
      this.method4788(var1, var2);

      try {
         switch (var2) {
            case 2:
               this.field2391 = var1.readUnsignedByte(1150355214) * 817327595;
            case 3:
            case 10:
            case 11:
            case 13:
            case 21:
            case 22:
            default:
               break;
            case 4:
               this.field2379 = var1.readShort((byte)-20) * -1503489583;
               break;
            case 5:
               this.field2380 = var1.readShort((byte)-109) * -269667797;
               break;
            case 6:
               this.boundsX = var1.readShort((byte)-50) * -255844703;
               break;
            case 7:
               this.boundsY = var1.readShort((byte)-40) * -970244221;
               break;
            case 8:
               this.boundsWidth = Buffer.method12008(var1, (byte)5) * 157290303;
               break;
            case 9:
               this.boundsHeight = Buffer.method12008(var1, (byte)5) * -1511822317;
               break;
            case 12:
               this.field2378 = var1.readStringCp1252NullCircumfixed(-979526453);
               break;
            case 14:
               this.field2384 = true;
               break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
               int var4 = var2 - 15;
               this.field2377[var4] = var1.readStringCp1252NullCircumfixed(850293619);
               if (this.field2377[var4].equalsIgnoreCase(Strings.field4856)) {
                  if (var3 != -1948815390) {
                     throw new IllegalStateException();
                  }

                  this.field2377[var4] = null;
               }

               this.field2384 = true;
               break;
            case 20:
               Buffer.method12008(var1, (byte)5);
               break;
            case 23:
               this.field2389 = (class406)GrandExchangeOffer.findEnumerated(classGB.method4216((byte)-94), var1.readUnsignedByte(1747472908), (byte)1);
               break;
            case 24:
               this.field2387 = (class386)GrandExchangeOffer.findEnumerated(class222.method4879((byte)67), var1.readUnsignedByte(1094852602), (byte)1);
               break;
            case 25:
               this.field2385 = Buffer.method12008(var1, (byte)5) * 30001303;
               break;
            case 26:
               this.field2386 = var1.readNullableLargeSmart(166499367) * 216382891;
               break;
            case 27:
               this.field2390 = Buffer.method12008(var1, (byte)5) * -691042793;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public int method4766() {
      return -1402587353 * this.field2385;
   }

   WorldEntityConfig() {
      this.field2384 = false;
      this.field2379 = 0;
      this.field2380 = 0;
      this.boundsX = 0;
      this.boundsY = 0;
      this.boundsWidth = 0;
      this.boundsHeight = 0;
      this.field2385 = -30001303;
      this.field2392 = new classVT[4];
      this.id = 1089946271;
      this.field2391 = 0;
      this.field2389 = class406.field5186;
      this.field2387 = class386.field4735;
      this.field2386 = -216382891;
      this.field2390 = -816170804;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIB)[Lxm;")
   @ObfuscatedName("av")
   public static IndexedSprite[] method4732(AbstractArchive var0, int var1, int var2, byte var3) {
      try {
         if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
            if (var3 == 3) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            IndexedSprite[] var5 = new IndexedSprite[1626067939 * class615.SpriteBuffer_spriteCount];

            for (int var6 = 0; var6 < 1626067939 * class615.SpriteBuffer_spriteCount; var6++) {
               if (var3 == 3) {
                  throw new IllegalStateException();
               }

               IndexedSprite var7 = var5[var6] = new IndexedSprite();
               var7.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
               var7.height = class144.SpriteBuffer_spriteHeight * 722593713;
               var7.xOffset = class615.SpriteBuffer_xOffsets[var6];
               var7.yOffset = class615.SpriteBuffer_yOffsets[var6];
               var7.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var6];
               var7.subHeight = class615.SpriteBuffer_spriteHeights[var6];
               var7.palette = BufferedSource.SpriteBuffer_spritePalette;
               var7.pixels = class320.SpriteBuffer_pixels[var6];
            }

            class615.SpriteBuffer_xOffsets = null;
            class615.SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            class615.SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            return var5;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "hv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpn;")
   @ObfuscatedName("bw")
   public class406 method4772() {
      return this.field2389;
   }

   public int getBoundsX() {
      return this.boundsX * 420693345;
   }

   @ObfuscatedSignature(descriptor = "()Low;")
   @ObfuscatedName("bf")
   public class386 method4774() {
      return this.field2387;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bd")
   public SpritePixels method4778() {
      if (1355892896 * this.field2386 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(field2375, this.field2386 * -318810877);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(class141.field1966, -1587717498 * this.field2386, 0, -2139672119);
            if (var1 != null) {
               field2375.put(var1, this.field2386 * -1307260105);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("br")
   public SpritePixels method4779() {
      if (-318810877 * this.field2386 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(field2375, this.field2386 * -318810877);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(class141.field1966, -318810877 * this.field2386, 0, -2139672119);
            if (var1 != null) {
               field2375.put(var1, this.field2386 * -318810877);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Low;")
   @ObfuscatedName("bn")
   public class386 method4775() {
      return this.field2387;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   public static void method4780() {
      field2375.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   public static void method4781() {
      field2375.clear();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public int method4783() {
      return 168300967 * this.field2390;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method4755() {
      return 2058769091 * this.field2391;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public int method4784(int var1) {
      try {
         return 168300967 * this.field2390;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.ac(" + 41);
      }
   }

   public int getBoundsY() {
      return this.boundsY * -2043328725;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("cb")
   static int method4786(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (7463 == var0) {
            if (var3 <= 4) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 4) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var4 = var10000;
               VarbitComposition.method4907(var4, (byte)-62);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hv.cb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvt;")
   @ObfuscatedName("by")
   public classVT method4769() {
      return this.field2404;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvt;")
   @ObfuscatedName("au")
   public classVT method4770(int var1) {
      try {
         return this.field2404;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   public int method4760(byte var1) {
      try {
         return this.field2379 * 365389617;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hv.aw(" + 41);
      }
   }
}
