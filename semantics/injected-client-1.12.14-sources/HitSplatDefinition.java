import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iq")
public class HitSplatDefinition extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2563 = 70;
   @ObfuscatedName("ao")
   public int field2556;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2565 = 16777215;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ap")
   public static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   int field2544;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ay")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2564 = 1;
   @ObfuscatedName("az")
   int fontId = 1359890183;
   @ObfuscatedName("ad")
   public int textColor = -1699743607;
   @ObfuscatedName("ai")
   public int field2548 = 1251683146;
   @ObfuscatedName("as")
   int field2551 = -857335627;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("au")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ab")
   int field2549;
   @ObfuscatedName("ax")
   int field2550;
   @ObfuscatedName("ar")
   public int field2546;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2566 = -1;
   @ObfuscatedName("al")
   public int field2553;
   @ObfuscatedName("af")
   String field2554;
   @ObfuscatedName("am")
   public int field2555;
   @ObfuscatedName("aq")
   int transformVarbit;
   @ObfuscatedName("aa")
   public int[] transforms;
   @ObfuscatedName("ah")
   public int field2552;
   @ObfuscatedName("be")
   int transformVarp;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final byte field2562 = 0;

   @ObfuscatedSignature(descriptor = "()Liq;")
   @ObfuscatedName("aq")
   public final HitSplatDefinition method4994() {
      int var1 = -1;
      if (-1 != 1798362831 * this.transformVarbit) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * 1798362831, -704497688);
      } else if (-1 != -1567049985 * this.transformVarp) {
         var1 = Varps.Varps_main[this.transformVarp * -1567049985];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? classGF.method4234(var2, 558050665) : null;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   public static int method4993(int var0, int var1) {
      try {
         classFY var3 = (classFY)class402.method8806(SequenceDefinition.SequenceDefinition_cachedModel, var0);
         classFY var2;
         if (null != var3) {
            if (var1 != 1402352388) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            AbstractArchive var5 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
            AbstractArchive var6 = WorldMapIcon_0.SpotAnimationDefinition_archive;
            boolean var7 = WorldMapSectionType.method7176(var5, var6, var0, -1267610787);
            classFY var4;
            if (!var7) {
               if (var1 != 1402352388) {
                  throw new IllegalStateException();
               }

               var4 = null;
            } else {
               if (classFY.field1932 == null) {
                  if (var1 != 1402352388) {
                     throw new IllegalStateException();
                  }

                  classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                  classFY.field1932 = new ThreadPoolExecutor(
                     0,
                     1886450023 * classFY.field1930,
                     0L,
                     TimeUnit.MILLISECONDS,
                     new ArrayBlockingQueue<>(classFY.field1930 * -333558724 + 100),
                     new classGP()
                  );
               }

               try {
                  var4 = new classFY(var5, var6, var0);
               } catch (Exception var9) {
                  var4 = null;
               }
            }

            if (var4 != null) {
               if (var1 != 1402352388) {
                  throw new IllegalStateException();
               }

               SequenceDefinition.SequenceDefinition_cachedModel.put(var4, var0);
            }

            var2 = var4;
         }

         if (var2 == null) {
            if (var1 != 1402352388) {
               throw new IllegalStateException();
            } else {
               return 2;
            }
         } else {
            byte var10000;
            if (var2.method4186(-1632678446)) {
               if (var1 != 1402352388) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "iq.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String getString(int var1, int var2) {
      try {
         String var3 = this.field2554;

         while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 != 1113141895) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + Tile.intToString(var1, false, -358468941) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iq.aj(" + ')');
      }
   }

   HitSplatDefinition() {
      this.field2544 = 110269839;
      this.field2549 = 1617854825;
      this.field2550 = -1697434207;
      this.field2546 = 0;
      this.field2552 = 0;
      this.field2553 = 1135949555;
      this.field2554 = "";
      this.field2555 = -497487395;
      this.field2556 = 0;
      this.transformVarbit = 292392913;
      this.transformVarp = -597051647;
   }

   @ObfuscatedSignature(descriptor = "(Liq;Lxa;I)V")
   @ObfuscatedName("kd")
   public static void method4983(HitSplatDefinition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4989(var1, var2);
      } else {
         try {
            while (true) {
               int var3 = var1.readUnsignedByte(724784702);
               if (0 == var3) {
                  if (var2 == 65535) {
                     throw new IllegalStateException();
                  } else {
                     return;
                  }
               }

               method4990(var0, var1, var3, (byte)119);
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "iq.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liq;")
   @ObfuscatedName("ab")
   public static HitSplatDefinition method4979(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)class402.method8806(HitSplatDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = GrandExchangeOfferWorldComparator.HitSplatDefinition_archive.getFile(2108627336, var0, 1450829626);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            method4983(var1, new Buffer(var2), -557854278);
         }

         HitSplatDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ap")
   public SpritePixels method5008(int var1) {
      try {
         if (-110763737 * this.field2549 < 0) {
            return null;
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, -110763737 * this.field2549);
            if (null != var2) {
               if (var1 >= 437881001) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = class387.SpriteBuffer_getSprite(classWG.field6371, -110763737 * this.field2549, 0, -2139672119);
               if (var2 != null) {
                  HitSplatDefinition_cachedSprites.put(var2, -110763737 * this.field2549);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iq.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ay")
   public SpritePixels method5009(int var1) {
      try {
         if (1157763487 * this.field2550 < 0) {
            if (var1 != 1935060474) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, 1157763487 * this.field2550);
            if (null != var2) {
               return var2;
            } else {
               var2 = class387.SpriteBuffer_getSprite(classWG.field6371, this.field2550 * 1157763487, 0, -2139672119);
               if (var2 != null) {
                  HitSplatDefinition_cachedSprites.put(var2, 1157763487 * this.field2550);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iq.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bk")
   public SpritePixels method5005() {
      if (-1234102639 * this.field2544 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, -1234102639 * this.field2544);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(classWG.field6371, -1234102639 * this.field2544, 0, -2139672119);
            if (null != var1) {
               HitSplatDefinition_cachedSprites.put(var1, -1234102639 * this.field2544);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Liq;")
   @ObfuscatedName("bo")
   public final HitSplatDefinition method4995() {
      int var1 = -1;
      if (-1 != 1798362831 * this.transformVarbit) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * 1798362831, 1325280893);
      } else if (-1 != -1567049985 * this.transformVarp) {
         var1 = Varps.Varps_main[this.transformVarp * -1567049985];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? classGF.method4234(var2, 558050665) : null;
   }

   @ObfuscatedSignature(descriptor = "(Liq;Lxa;IB)V")
   @ObfuscatedName("df")
   public static void method4990(HitSplatDefinition var0, Buffer var1, int var2, byte var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var3);
      }

      try {
         if (1 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.fontId = var1.readNullableLargeSmart(-944817901) * -1359890183;
         } else if (var2 == 2) {
            if (var3 == 0) {
               return;
            }

            var0.textColor = var1.readMedium(-1754173405) * -598734985;
         } else if (3 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2551 = var1.readNullableLargeSmart(-2001819254) * 857335627;
         } else if (var2 == 4) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2549 = var1.readNullableLargeSmart(-56331354) * -1617854825;
         } else if (var2 == 5) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2544 = var1.readNullableLargeSmart(-1009664952) * -110269839;
         } else if (var2 == 6) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2550 = var1.readNullableLargeSmart(-2042439629) * 1697434207;
         } else if (var2 == 7) {
            if (var3 == 0) {
               return;
            }

            var0.field2546 = var1.readShort((byte)-58) * 490149525;
         } else if (8 == var2) {
            var0.field2554 = var1.readStringCp1252NullTerminatedOrNull(682993622);
         } else if (var2 == 9) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2548 = Buffer.method12008(var1, (byte)5) * -1270609001;
         } else if (var2 == 10) {
            if (var3 == 0) {
               return;
            }

            var0.field2552 = var1.readShort((byte)-19) * -761916173;
         } else if (11 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2553 = 0;
         } else if (12 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2555 = var1.readUnsignedByte(-1349494176) * 497487395;
         } else if (13 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var0.field2556 = var1.readShort((byte)-78) * 156702865;
         } else if (14 == var2) {
            if (var3 == 0) {
               return;
            }

            var0.field2553 = Buffer.method12008(var1, (byte)5) * -1135949555;
         } else {
            if (var2 != 17) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (var2 != 18) {
                  return;
               }

               if (var3 == 0) {
                  throw new IllegalStateException();
               }
            }

            var0.transformVarbit = Buffer.method12008(var1, (byte)5) * -292392913;
            if (65535 == 1798362831 * var0.transformVarbit) {
               var0.transformVarbit = 292392913;
            }

            var0.transformVarp = Buffer.method12008(var1, (byte)5) * 597051647;
            if (-1567049985 * var0.transformVarp == 65535) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var0.transformVarp = -597051647;
            }

            int var4 = -1;
            if (18 == var2) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var4 = Buffer.method12008(var1, (byte)5);
               if (var4 == 65535) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  var4 = -1;
               }
            }

            int var5 = var1.readUnsignedByte(-845841298);
            var0.transforms = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; var6++) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var0.transforms[var6] = Buffer.method12008(var1, (byte)5);
               if (65535 == var0.transforms[var6]) {
                  var0.transforms[var6] = -1;
               }
            }

            var0.transforms[var5 + 1] = var4;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iq.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("as")
   public static void method4975(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
      classWG.field6371 = var1;
      class228.HitSplatDefinition_fontsArchive = var2;
      PlatformInfo var10000 = WorldMapLabelSize.platformInfo;
      WorldMapLabelSize.platformInfo.clockSpeed = (Arrays.hashCode(SecureUrlRequester.client.field1024.getClass().getSigners()) >> 2) * 1700970496
         + -1618552320
         + (Archive.field5389 - 1) * -1509453216;
      var10000.field5119 = client.method2500();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("az")
   public static void method4976(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
      classWG.field6371 = var1;
      class228.HitSplatDefinition_fontsArchive = var2;
      PlatformInfo var10000 = WorldMapLabelSize.platformInfo;
      WorldMapLabelSize.platformInfo.clockSpeed = (Arrays.hashCode(SecureUrlRequester.client.field1024.getClass().getSigners()) >> 2) * 1700970496
         + -1618552320
         + (Archive.field5389 - 1) * -1509453216;
      var10000.field5119 = client.method2500();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("ai")
   public static void method4977(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
      classWG.field6371 = var1;
      class228.HitSplatDefinition_fontsArchive = var2;
      PlatformInfo var10000 = WorldMapLabelSize.platformInfo;
      WorldMapLabelSize.platformInfo.clockSpeed = (Arrays.hashCode(SecureUrlRequester.client.field1024.getClass().getSigners()) >> 2) * 1700970496
         + -1618552320
         + (Archive.field5389 - 1) * -1509453216;
      var10000.field5119 = client.method2500();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liq;")
   @ObfuscatedName("ax")
   public static HitSplatDefinition method4980(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)class402.method8806(HitSplatDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = GrandExchangeOfferWorldComparator.HitSplatDefinition_archive.getFile(32, var0, 1866250396);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            method4983(var1, new Buffer(var2), 1986369863);
         }

         HitSplatDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ar")
   void method4984(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-804516278);
         if (0 == var2) {
            return;
         }

         method4990(this, var1, var2, (byte)-20);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, int var2) {
      if (1 == var2) {
         this.fontId = var1.readNullableLargeSmart(-1223933868) * -513546129;
      } else if (var2 == 2) {
         this.textColor = var1.readMedium(-1955196406) * 246159301;
      } else if (3 == var2) {
         this.field2551 = var1.readNullableLargeSmart(-1507019644) * -1449962192;
      } else if (var2 == 4) {
         this.field2549 = var1.readNullableLargeSmart(-598437383) * 1228236444;
      } else if (var2 == 5) {
         this.field2544 = var1.readNullableLargeSmart(-711633665) * -110269839;
      } else if (var2 == 6) {
         this.field2550 = var1.readNullableLargeSmart(-1750114646) * 1697434207;
      } else if (var2 == 7) {
         this.field2546 = var1.readShort((byte)-43) * 490149525;
      } else if (8 == var2) {
         this.field2554 = var1.readStringCp1252NullTerminatedOrNull(1607041316);
      } else if (var2 == 9) {
         this.field2548 = Buffer.method12008(var1, (byte)5) * -1270609001;
      } else if (var2 == 10) {
         this.field2552 = var1.readShort((byte)2) * -761916173;
      } else if (11 == var2) {
         this.field2553 = 0;
      } else if (12 == var2) {
         this.field2555 = var1.readUnsignedByte(1795818478) * 1063763095;
      } else if (13 == var2) {
         this.field2556 = var1.readShort((byte)-70) * 102611808;
      } else if (14 == var2) {
         this.field2553 = Buffer.method12008(var1, (byte)5) * -1190720525;
      } else if (var2 == 17 || var2 == 18) {
         this.transformVarbit = Buffer.method12008(var1, (byte)5) * -1689390533;
         if (65535 == 1798362831 * this.transformVarbit) {
            this.transformVarbit = 292392913;
         }

         this.transformVarp = Buffer.method12008(var1, (byte)5) * 597051647;
         if (60530131 * this.transformVarp == 65535) {
            this.transformVarp = 1939799156;
         }

         int var3 = -1;
         if (18 == var2) {
            var3 = Buffer.method12008(var1, (byte)5);
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte(-1223798010);
         this.transforms = new int[var4 + 2];

         for (int var5 = 0; var5 <= var4; var5++) {
            this.transforms[var5] = Buffer.method12008(var1, (byte)5);
            if (65535 == this.transforms[var5]) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   void method4985(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1774838612);
         if (0 == var2) {
            return;
         }

         method4990(this, var1, var2, (byte)-27);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ah")
   void method4986(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(883497045);
         if (0 == var2) {
            return;
         }

         method4990(this, var1, var2, (byte)-50);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   void method4987(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-20760410);
         if (0 == var2) {
            return;
         }

         method4990(this, var1, var2, (byte)92);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liq;")
   @ObfuscatedName("ac")
   public static HitSplatDefinition method4981(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)class402.method8806(HitSplatDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = GrandExchangeOfferWorldComparator.HitSplatDefinition_archive.getFile(32, var0, -815247099);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            method4983(var1, new Buffer(var2), 416393178);
         }

         HitSplatDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;)Lxt;")
   @ObfuscatedName("tg")
   public static SpritePixels method5010(HitSplatDefinition var0) {
      if (1157763487 * var0.field2550 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, 1157763487 * var0.field2550);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(classWG.field6371, var0.field2550 * 1157763487, 0, -2139672119);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, 1157763487 * var0.field2550);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ez")
   public int method5017() {
      return this.field2548 * -332979161;
   }

   @ObfuscatedSignature(descriptor = "()Liq;")
   @ObfuscatedName("aa")
   public final HitSplatDefinition method4996() {
      int var1 = -1;
      if (-1 != -354524195 * this.transformVarbit) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * -24020398, -1307449507);
      } else if (-1 != -109357876 * this.transformVarp) {
         var1 = Varps.Varps_main[this.transformVarp * -834201714];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? classGF.method4234(var2, 558050665) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("aw")
   public SpritePixels method5006(int var1) {
      try {
         if (-1234102639 * this.field2544 < 0) {
            return null;
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, -1234102639 * this.field2544);
            if (null != var2) {
               if (var1 <= -597222072) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = class387.SpriteBuffer_getSprite(classWG.field6371, -1234102639 * this.field2544, 0, -2139672119);
               if (null != var2) {
                  if (var1 <= -597222072) {
                     throw new IllegalStateException();
                  }

                  HitSplatDefinition_cachedSprites.put(var2, -1234102639 * this.field2544);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iq.aw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;)Lxt;")
   @ObfuscatedName("bu")
   public static SpritePixels method5011(HitSplatDefinition var0) {
      if (1157763487 * var0.field2550 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, 1157763487 * var0.field2550);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(classWG.field6371, var0.field2550 * 1157763487, 0, -2139672119);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, 1157763487 * var0.field2550);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Liq;")
   @ObfuscatedName("be")
   public final HitSplatDefinition method4997() {
      int var1 = -1;
      if (-1 != 1798362831 * this.transformVarbit) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * 1798362831, -1066946041);
      } else if (-1 != -1567049985 * this.transformVarp) {
         var1 = Varps.Varps_main[this.transformVarp * -1567049985];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? classGF.method4234(var2, 558050665) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("ad")
   public static void method4978(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
      classWG.field6371 = var1;
      class228.HitSplatDefinition_fontsArchive = var2;
      PlatformInfo var10000 = WorldMapLabelSize.platformInfo;
      WorldMapLabelSize.platformInfo.clockSpeed = (Arrays.hashCode(SecureUrlRequester.client.field1024.getClass().getSigners()) >> 2) * 1700970496
         + -1618552320
         + (Archive.field5389 - 1) * -1509453216;
      var10000.field5119 = client.method2500();
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bg")
   public String method5001(int var1) {
      String var2 = this.field2554;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Tile.intToString(var1, false, -358468941) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bs")
   public String method5002(int var1) {
      String var2 = this.field2554;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Tile.intToString(var1, false, -358468941) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bz")
   public String method5003(int var1) {
      String var2 = this.field2554;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Tile.intToString(var1, false, -358468941) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ak")
   public SpritePixels method5004(int var1) {
      try {
         if (this.field2551 * 252963427 < 0) {
            if (var1 >= 1976760942) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, this.field2551 * 252963427);
            if (null != var2) {
               if (var1 >= 1976760942) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = class387.SpriteBuffer_getSprite(classWG.field6371, 252963427 * this.field2551, 0, -2139672119);
               if (var2 != null) {
                  HitSplatDefinition_cachedSprites.put(var2, this.field2551 * 252963427);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iq.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bb")
   public SpritePixels method5007() {
      if (-1234102639 * this.field2544 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, -1059566431 * this.field2544);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(classWG.field6371, -1234102639 * this.field2544, 0, -2139672119);
            if (null != var1) {
               HitSplatDefinition_cachedSprites.put(var1, -1234102639 * this.field2544);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   void method4988(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-439058821);
         if (0 == var2) {
            return;
         }

         method4990(this, var1, var2, (byte)-51);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;III)Lxm;")
   @ObfuscatedName("at")
   static IndexedSprite method4982(AbstractArchive var0, int var1, int var2, int var3) {
      try {
         if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
            if (var3 != -1268219190) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            IndexedSprite var5 = new IndexedSprite();
            var5.width = class208.SpriteBuffer_spriteWidth * -1309012693;
            var5.height = class144.SpriteBuffer_spriteHeight * 722593713;
            var5.xOffset = class615.SpriteBuffer_xOffsets[0];
            var5.yOffset = class615.SpriteBuffer_yOffsets[0];
            var5.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
            var5.subHeight = class615.SpriteBuffer_spriteHeights[0];
            var5.palette = BufferedSource.SpriteBuffer_spritePalette;
            var5.pixels = class320.SpriteBuffer_pixels[0];
            class615.SpriteBuffer_xOffsets = null;
            class615.SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            class615.SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            return var5;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "iq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;I)Liq;")
   @ObfuscatedName("wv")
   public static HitSplatDefinition method4998(HitSplatDefinition var0, int var1) {
      if (var0 == null) {
         var0.transform(var1);
      }

      try {
         int var2 = -1;
         if (-1 != 1798362831 * var0.transformVarbit) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            var2 = WorldMapData_1.getVarbit(var0.transformVarbit * 1798362831, 924457436);
         } else if (-1 != -1567049985 * var0.transformVarp) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            var2 = Varps.Varps_main[var0.transformVarp * -1567049985];
         }

         if (var2 >= 0) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            if (var2 < var0.transforms.length - 1) {
               int var5 = var0.transforms[var2];
               return var5 != -1 ? classGF.method4234(var5, 558050665) : null;
            }

            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }
         }

         int var3 = var0.transforms[var0.transforms.length - 1];
         return var3 != -1 ? classGF.method4234(var3, 558050665) : null;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bp")
   public SpritePixels method5012() {
      if (1157763487 * this.field2550 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HitSplatDefinition_cachedSprites, -1926895477 * this.field2550);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(classWG.field6371, this.field2550 * 1052784083, 0, -2139672119);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, 1157763487 * this.field2550);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("pe")
   static void randomDatData2(Buffer var0, int var1, int var2) {
      try {
         HttpQueryParams.method11269(var0.array, var1, 1348286119);
         class180.method4263(var0, var1, 1812761662);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iq.pe(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;I)Lsu;")
   @ObfuscatedName("va")
   public static Font method5013(HitSplatDefinition var0, int var1) {
      if (var0 == null) {
         return var0.getFont(var1);
      } else {
         try {
            if (-1 == var0.fontId * 1274906953) {
               if (var1 >= -655399110) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               Font var2 = (Font)class402.method8806(HitSplatDefinition_cachedFonts, var0.fontId * 1274906953);
               if (null != var2) {
                  if (var1 >= -655399110) {
                     throw new IllegalStateException();
                  } else {
                     return var2;
                  }
               } else {
                  AbstractArchive var4 = classWG.field6371;
                  AbstractArchive var5 = class228.HitSplatDefinition_fontsArchive;
                  int var6 = var0.fontId * 1274906953;
                  Font var3;
                  if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
                     var3 = null;
                  } else {
                     var3 = class181.method4267(var5.getFile(var6, 0, -1543370785), 16777215);
                  }

                  if (null != var3) {
                     if (var1 >= -655399110) {
                        throw new IllegalStateException();
                     }

                     HitSplatDefinition_cachedFonts.put(var3, 1274906953 * var0.fontId);
                  }

                  return var3;
               }
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "iq.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcf;I)V")
   @ObfuscatedName("hl")
   static void method5015(class69 var0, int var1) {
      try {
         if (var0 != client.field861) {
            client.field861 = var0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iq.hl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Liq;")
   @ObfuscatedName("ae")
   public final HitSplatDefinition transform(int var1) {
      try {
         int var2 = -1;
         if (-1 != 1798362831 * this.field2544) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            var2 = WorldMapData_1.getVarbit(this.fontId * 1798362831, 924457436);
         } else if (-1 != -1567049985 * this.field2544) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            var2 = Varps.Varps_temp[this.field2549 * -1567049985];
         }

         if (var2 >= 0) {
            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }

            if (var2 < this.transforms.length - 1) {
               int var5 = this.transforms[var2];
               return var5 != -1 ? classGF.method4234(var5, 558050665) : null;
            }

            if (var1 >= 832112375) {
               throw new IllegalStateException();
            }
         }

         int var3 = this.transforms[this.transforms.length - 1];
         return var3 != -1 ? classGF.method4234(var3, 558050665) : null;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, byte var3) {
      try {
         if (1 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2550 = var1.readLargeSmart(-944817901) * -1359890183;
         } else if (var2 == 2) {
            if (var3 == 0) {
               return;
            }

            this.field2556 = var1.method12181(-1754173405) * -598734985;
         } else if (3 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.transformVarbit = var1.method12100(-2001819254) * 857335627;
         } else if (var2 == 4) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2549 = var1.readVarInt(-56331354) * -1617854825;
         } else if (var2 == 5) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.fontId = var1.readShortLE(-1009664952) * -110269839;
         } else if (var2 == 6) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2551 = var1.readShortSmart(-2042439629) * 1697434207;
         } else if (var2 == 7) {
            if (var3 == 0) {
               return;
            }

            this.field2546 = var1.method12174((byte)-58) * 490149525;
         } else if (8 == var2) {
            this.field2554 = var1.readStringCp1252NullCircumfixed(682993622);
         } else if (var2 == 9) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2556 = Buffer.method12008(var1, (byte)5) * -1270609001;
         } else if (var2 == 10) {
            if (var3 == 0) {
               return;
            }

            this.textColor = var1.method12164((byte)-19) * -761916173;
         } else if (11 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2546 = 0;
         } else if (12 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2555 = var1.readMedium(-1349494176) * 497487395;
         } else if (13 == var2) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.field2546 = var1.readUnsignedShortLE((byte)-78) * 156702865;
         } else if (14 == var2) {
            if (var3 == 0) {
               return;
            }

            this.field2546 = Buffer.method12008(var1, (byte)5) * -1135949555;
         } else {
            if (var2 != 17) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (var2 != 18) {
                  return;
               }

               if (var3 == 0) {
                  throw new IllegalStateException();
               }
            }

            this.field2544 = Buffer.method12008(var1, (byte)5) * -292392913;
            if (65535 == 1798362831 * this.transformVarbit) {
               this.field2549 = 292392913;
            }

            this.field2550 = Buffer.method12008(var1, (byte)5) * 597051647;
            if (-1567049985 * this.field2544 == 65535) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.fontId = -597051647;
            }

            int var4 = -1;
            if (18 == var2) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var4 = Buffer.method12008(var1, (byte)5);
               if (var4 == 65535) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  var4 = -1;
               }
            }

            int var5 = var1.readUnsignedIntLE(-845841298);
            this.transforms = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; var6++) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               this.transforms[var6] = Buffer.method12008(var1, (byte)5);
               if (65535 == this.transforms[var6]) {
                  this.transforms[var6] = -1;
               }
            }

            this.transforms[var5 + 1] = var4;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iq.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsu;")
   @ObfuscatedName("au")
   public Font getFont(int var1) {
      try {
         if (-1 == this.field2549 * 1274906953) {
            if (var1 >= -655399110) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Font var2 = (Font)class402.method8806(HitSplatDefinition_cachedSprites, this.field2551 * 1274906953);
            if (null != var2) {
               if (var1 >= -655399110) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               AbstractArchive var4 = classWG.field6371;
               AbstractArchive var5 = class228.HitSplatDefinition_fontsArchive;
               int var6 = this.field2544 * 1274906953;
               Font var3;
               if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
                  var3 = null;
               } else {
                  var3 = class181.method4267(var5.getFile(var6, 0, -1543370785), 16777215);
               }

               if (null != var3) {
                  if (var1 >= -655399110) {
                     throw new IllegalStateException();
                  }

                  HitSplatDefinition_cachedSprites.put(var3, 1274906953 * this.fontId);
               }

               return var3;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iq.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ao")
   void method4989(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.method12181(724784702);
            if (0 == var3) {
               if (var2 == 65535) {
                  throw new IllegalStateException();
               }

               return;
            }

            method4990(this, var1, var3, (byte)119);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iq.ag(" + ')');
      }
   }
}
