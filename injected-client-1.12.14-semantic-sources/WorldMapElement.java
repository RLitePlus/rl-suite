import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hi")
public class WorldMapElement extends DualNode implements MapElementConfig {
   @ObfuscatedName("ax")
   int field2208;
   @ObfuscatedName("at")
   public static int WorldMapElement_count;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ag")
   static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
   @ObfuscatedSignature(descriptor = "[Lhi;")
   @ObfuscatedName("ae")
   static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("ap")
   public String name;
   @ObfuscatedName("az")
   public boolean field2204;
   @ObfuscatedName("aw")
   int sprite2;
   @ObfuscatedName("as")
   public String menuTargetName;
   @ObfuscatedName("ay")
   public int field2218;
   @ObfuscatedName("aj")
   public final int objectId;
   @ObfuscatedName("am")
   int[] field2224;
   @ObfuscatedName("ad")
   public boolean field2214;
   @ObfuscatedName("ai")
   public String[] menuActions;
   @ObfuscatedName("ao")
   byte[] field2222;
   @ObfuscatedName("ac")
   int[] field2223;
   @ObfuscatedName("ab")
   int field2206;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2217 = 0;
   @ObfuscatedName("ar")
   int field2202;
   @ObfuscatedName("ah")
   int field2210;
   @ObfuscatedSignature(descriptor = "Lhl;")
   @ObfuscatedName("al")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedSignature(descriptor = "Lhk;")
   @ObfuscatedName("af")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("au")
   public int textSize;
   @ObfuscatedName("aa")
   public int category;
   @ObfuscatedName("ak")
   public int sprite1 = 670357653;
   @ObfuscatedSignature(descriptor = "Lrl;")
   @ObfuscatedName("bc")
   static Bounds field2221;

   @ObfuscatedSignature(descriptor = "(Z)Lxt;")
   @ObfuscatedName("aa")
   public SpritePixels method4557(boolean var1) {
      int var2 = var1 ? -1176539457 * this.sprite2 : this.sprite1 * -393425597;
      return method4562(this, var2, 1227913881);
   }

   @ObfuscatedSignature(descriptor = "(Lhi;II)Lxt;")
   @ObfuscatedName("ck")
   public static SpritePixels method4562(WorldMapElement var0, int var1, int var2) {
      if (var0 == null) {
         var0.getSprite(var1, var1);
      }

      try {
         if (var1 < 0) {
            if (var2 <= -41784034) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var3 = (SpritePixels)class402.method8806(HitSplatDefinition_cached, var1);
            if (var3 != null) {
               if (var2 <= -41784034) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = class387.SpriteBuffer_getSprite(class209.WorldMapElement_archive, var1, 0, -2139672119);
               if (null != var3) {
                  if (var2 <= -41784034) {
                     throw new IllegalStateException();
                  }

                  HitSplatDefinition_cached.put(var3, var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hi.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("an")
   void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1689602109);
            if (var3 == 0) {
               return;
            }

            this.decodeNext(var1, var3, (byte)-58);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hi.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, byte var3) {
      try {
         if (1 == var2) {
            if (var3 >= 1) {
               return;
            }

            this.sprite1 = var1.readNullableLargeSmart(-474635681) * -670357653;
         } else if (2 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.sprite2 = var1.readNullableLargeSmart(-763451929) * -676658881;
         } else if (var2 == 3) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.menuTargetName = var1.readStringCp1252NullCircumfixed(-1709059683);
         } else if (var2 == 4) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            this.field2218 = var1.readMedium(1015693736) * -850027379;
         } else if (5 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var1.readMedium(-1787415075);
         } else if (var2 == 6) {
            this.textSize = var1.readUnsignedByte(1128415616) * 1588971959;
         } else if (7 == var2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            int var4 = var1.readUnsignedByte(-793614288);
            if (0 == (var4 & 1)) {
               if (var3 >= 1) {
                  return;
               }

               this.field2204 = false;
            }

            if (2 == (var4 & 2)) {
               if (var3 >= 1) {
                  return;
               }

               this.field2214 = true;
            }
         } else if (8 == var2) {
            if (var3 >= 1) {
               return;
            }

            var1.readUnsignedByte(-563881802);
         } else {
            if (var2 >= 10) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               if (var2 <= 14) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.menuActions[var2 - 10] = var1.readStringCp1252NullCircumfixed(-505108356);
                  return;
               }
            }

            if (var2 == 15) {
               int var8 = var1.readUnsignedByte(-118937273);
               this.field2223 = new int[2 * var8];

               for (int var5 = 0; var5 < 2 * var8; var5++) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.field2223[var5] = var1.readShort((byte)-68);
               }

               Buffer.method12015(var1, 884633622);
               int var11 = var1.readUnsignedByte(-895391611);
               this.field2224 = new int[var11];

               for (int var6 = 0; var6 < this.field2224.length; var6++) {
                  if (var3 >= 1) {
                     return;
                  }

                  this.field2224[var6] = Buffer.method12015(var1, 1941095464);
               }

               this.field2222 = new byte[var8];

               for (int var12 = 0; var12 < var8; var12++) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.field2222[var12] = Buffer.method12001(var1, (byte)114);
               }
            } else if (16 != var2) {
               if (var2 == 17) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.name = var1.readStringCp1252NullCircumfixed(115589693);
               } else if (18 == var2) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var1.readNullableLargeSmart(-905313189);
               } else if (19 == var2) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.category = Buffer.method12008(var1, (byte)5) * 1867340629;
               } else if (21 == var2) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12015(var1, 821757750);
               } else if (var2 == 22) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12015(var1, 1029436693);
               } else if (23 == var2) {
                  var1.readUnsignedByte(16514068);
                  var1.readUnsignedByte(418925975);
                  var1.readUnsignedByte(844339158);
               } else if (var2 == 24) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var1.readShort((byte)-103);
                  var1.readShort((byte)-32);
               } else if (var2 == 25) {
                  var1.readNullableLargeSmart(-1719155927);
               } else if (28 == var2) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var1.readUnsignedByte(145135757);
               } else if (var2 == 29) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  HorizontalAlignment[] var9 = new HorizontalAlignment[]{
                     HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2250, HorizontalAlignment.field2252
                  };
                  this.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var9, var1.readUnsignedByte(205464628), (byte)1);
               } else if (30 == var2) {
                  VerticalAlignment[] var10 = new VerticalAlignment[]{
                     VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2246, VerticalAlignment.field2244
                  };
                  this.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var10, var1.readUnsignedByte(-275558601), (byte)1);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "hi.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)V")
   @ObfuscatedName("ay")
   public static void method4538(AbstractArchive var0, AbstractArchive var1) {
      class209.WorldMapElement_archive = var1;
      WorldMapElement_count = AbstractArchive.method9046(var0, 35, (byte)-91) * 961549525;
      WorldMapElement_cached = new WorldMapElement[143164541 * WorldMapElement_count];

      for (int var2 = 0; var2 < WorldMapElement_count * 143164541; var2++) {
         byte[] var3 = var0.getFile(35, var2, 1573453334);
         WorldMapElement_cached[var2] = new WorldMapElement(var2);
         if (null != var3) {
            WorldMapElement_cached[var2].decode(new Buffer(var3), (byte)-65);
            method4553(WorldMapElement_cached[var2], (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int getObjectId(int var1) {
      try {
         return 348284615 * this.objectId;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hi.ap(" + 41);
      }
   }

   WorldMapElement(int var1) {
      this.sprite2 = 676658881;
      this.textSize = 0;
      this.field2204 = true;
      this.field2214 = false;
      this.menuActions = new String[5];
      this.field2206 = 1511251527;
      this.field2208 = -1377064367;
      this.field2202 = Integer.MIN_VALUE;
      this.field2210 = Integer.MIN_VALUE;
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1867340629;
      this.objectId = -856917257 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhi;")
   @ObfuscatedName("ad")
   public static WorldMapElement method4541(int var0) {
      return var0 >= 0 && var0 < WorldMapElement_cached.length && null != WorldMapElement_cached[var0]
         ? WorldMapElement_cached[var0]
         : new WorldMapElement(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhi;")
   @ObfuscatedName("ai")
   public static WorldMapElement method4542(int var0) {
      return var0 >= 0 && var0 < WorldMapElement_cached.length && null != WorldMapElement_cached[var0]
         ? WorldMapElement_cached[var0]
         : new WorldMapElement(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method4543() {
      HitSplatDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method4544() {
      HitSplatDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public static void method4545() {
      HitSplatDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lhi;B)V")
   @ObfuscatedName("kh")
   public static void method4553(WorldMapElement var0, byte var1) {
      if (var0 == null) {
         var0.method4556(var1);
      } else {
         try {
            if (null != var0.field2223) {
               for (byte var2 = 0; var2 < var0.field2223.length; var2 += 2) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var0.field2223[var2] < var0.field2206 * -2017749879) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     var0.field2206 = 636232121 * var0.field2223[var2];
                  } else if (var0.field2223[var2] > var0.field2202 * 282834999) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     var0.field2202 = var0.field2223[var2] * 1355382151;
                  }

                  if (var0.field2223[1 + var2] < var0.field2208 * -676191921) {
                     if (var1 != 1) {
                        return;
                     }

                     var0.field2208 = var0.field2223[1 + var2] * -770419281;
                  } else if (var0.field2223[1 + var2] > var0.field2210 * 229850989) {
                     if (var1 != 1) {
                        throw new IllegalStateException();
                     }

                     var0.field2210 = 177840741 * var0.field2223[1 + var2];
                  }
               }
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "hi.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ax")
   void method4547(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1345847522);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, (byte)-90);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ar")
   void method4549(Buffer var1, int var2) {
      if (1 == var2) {
         this.sprite1 = var1.readNullableLargeSmart(-1494789868) * 642915327;
      } else if (2 == var2) {
         this.sprite2 = var1.readNullableLargeSmart(-804821715) * -1464769508;
      } else if (var2 == 3) {
         this.menuTargetName = var1.readStringCp1252NullCircumfixed(-1228693794);
      } else if (var2 == 4) {
         this.field2218 = var1.readMedium(410100312) * -850027379;
      } else if (5 == var2) {
         var1.readMedium(-449606222);
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte(1840445072) * 291500642;
      } else if (7 == var2) {
         int var3 = var1.readUnsignedByte(-18254532);
         if (0 == (var3 & 1)) {
            this.field2204 = false;
         }

         if (2 == (var3 & 2)) {
            this.field2214 = true;
         }
      } else if (8 == var2) {
         var1.readUnsignedByte(860707678);
      } else if (var2 >= 10 && var2 <= 14) {
         this.menuActions[var2 - 10] = var1.readStringCp1252NullCircumfixed(-1665307585);
      } else if (var2 == 15) {
         int var6 = var1.readUnsignedByte(443934844);
         this.field2223 = new int[2 * var6];

         for (int var4 = 0; var4 < 2 * var6; var4++) {
            this.field2223[var4] = var1.readShort((byte)-91);
         }

         Buffer.method12015(var1, 866820634);
         int var9 = var1.readUnsignedByte(418521126);
         this.field2224 = new int[var9];

         for (int var5 = 0; var5 < this.field2224.length; var5++) {
            this.field2224[var5] = Buffer.method12015(var1, 1200580527);
         }

         this.field2222 = new byte[var6];

         for (int var10 = 0; var10 < var6; var10++) {
            this.field2222[var10] = Buffer.method12001(var1, (byte)103);
         }
      } else if (16 != var2) {
         if (var2 == 17) {
            this.name = var1.readStringCp1252NullCircumfixed(312368317);
         } else if (18 == var2) {
            var1.readNullableLargeSmart(-518130459);
         } else if (19 == var2) {
            this.category = Buffer.method12008(var1, (byte)5) * 1346520910;
         } else if (21 == var2) {
            Buffer.method12015(var1, 188721941);
         } else if (var2 == 22) {
            Buffer.method12015(var1, 1682197108);
         } else if (23 == var2) {
            var1.readUnsignedByte(553146037);
            var1.readUnsignedByte(1470662645);
            var1.readUnsignedByte(-283679237);
         } else if (var2 == 24) {
            var1.readShort((byte)-41);
            var1.readShort((byte)-51);
         } else if (var2 == 25) {
            var1.readNullableLargeSmart(-2037325333);
         } else if (28 == var2) {
            var1.readUnsignedByte(34763538);
         } else if (var2 == 29) {
            HorizontalAlignment[] var7 = new HorizontalAlignment[]{
               HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2250, HorizontalAlignment.field2252
            };
            this.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var7, var1.readUnsignedByte(764724647), (byte)1);
         } else if (30 == var2) {
            VerticalAlignment[] var8 = new VerticalAlignment[]{
               VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2246, VerticalAlignment.field2244
            };
            this.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var8, var1.readUnsignedByte(1878195275), (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("al")
   void method4550(Buffer var1, int var2) {
      if (1 == var2) {
         this.sprite1 = var1.readNullableLargeSmart(-404926370) * -670357653;
      } else if (2 == var2) {
         this.sprite2 = var1.readNullableLargeSmart(-2023915274) * -676658881;
      } else if (var2 == 3) {
         this.menuTargetName = var1.readStringCp1252NullCircumfixed(-887293328);
      } else if (var2 == 4) {
         this.field2218 = var1.readMedium(-676369353) * -850027379;
      } else if (5 == var2) {
         var1.readMedium(-1715455490);
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte(129486561) * 1588971959;
      } else if (7 == var2) {
         int var3 = var1.readUnsignedByte(1603329073);
         if (0 == (var3 & 1)) {
            this.field2204 = false;
         }

         if (2 == (var3 & 2)) {
            this.field2214 = true;
         }
      } else if (8 == var2) {
         var1.readUnsignedByte(1847680994);
      } else if (var2 >= 10 && var2 <= 14) {
         this.menuActions[var2 - 10] = var1.readStringCp1252NullCircumfixed(-927521292);
      } else if (var2 == 15) {
         int var6 = var1.readUnsignedByte(1468216479);
         this.field2223 = new int[2 * var6];

         for (int var4 = 0; var4 < 2 * var6; var4++) {
            this.field2223[var4] = var1.readShort((byte)-31);
         }

         Buffer.method12015(var1, 1462570010);
         int var9 = var1.readUnsignedByte(1847059572);
         this.field2224 = new int[var9];

         for (int var5 = 0; var5 < this.field2224.length; var5++) {
            this.field2224[var5] = Buffer.method12015(var1, -527232418);
         }

         this.field2222 = new byte[var6];

         for (int var10 = 0; var10 < var6; var10++) {
            this.field2222[var10] = Buffer.method12001(var1, (byte)124);
         }
      } else if (16 != var2) {
         if (var2 == 17) {
            this.name = var1.readStringCp1252NullCircumfixed(1134143410);
         } else if (18 == var2) {
            var1.readNullableLargeSmart(-1028680495);
         } else if (19 == var2) {
            this.category = Buffer.method12008(var1, (byte)5) * 1867340629;
         } else if (21 == var2) {
            Buffer.method12015(var1, 1161398764);
         } else if (var2 == 22) {
            Buffer.method12015(var1, 689590654);
         } else if (23 == var2) {
            var1.readUnsignedByte(1355301978);
            var1.readUnsignedByte(-1609259229);
            var1.readUnsignedByte(-724596972);
         } else if (var2 == 24) {
            var1.readShort((byte)-44);
            var1.readShort((byte)0);
         } else if (var2 == 25) {
            var1.readNullableLargeSmart(-1083829054);
         } else if (28 == var2) {
            var1.readUnsignedByte(156128833);
         } else if (var2 == 29) {
            HorizontalAlignment[] var7 = new HorizontalAlignment[]{
               HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2250, HorizontalAlignment.field2252
            };
            this.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var7, var1.readUnsignedByte(-58997491), (byte)1);
         } else if (30 == var2) {
            VerticalAlignment[] var8 = new VerticalAlignment[]{
               VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2246, VerticalAlignment.field2244
            };
            this.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var8, var1.readUnsignedByte(713292946), (byte)1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)V")
   @ObfuscatedName("au")
   public static void method4539(AbstractArchive var0, AbstractArchive var1) {
      class209.WorldMapElement_archive = var1;
      WorldMapElement_count = AbstractArchive.method9046(var0, 35, (byte)-111) * 961549525;
      WorldMapElement_cached = new WorldMapElement[143164541 * WorldMapElement_count];

      for (int var2 = 0; var2 < WorldMapElement_count * 143164541; var2++) {
         byte[] var3 = var0.getFile(1624553299, var2, -270124904);
         WorldMapElement_cached[var2] = new WorldMapElement(var2);
         if (null != var3) {
            WorldMapElement_cached[var2].decode(new Buffer(var3), (byte)76);
            method4553(WorldMapElement_cached[var2], (byte)1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhi;Lxa;I)V")
   @ObfuscatedName("ho")
   public static void method4551(WorldMapElement var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4552(var1, var2);
      }

      if (1 == var2) {
         var0.sprite1 = var1.readNullableLargeSmart(-1955869539) * -670357653;
      } else if (2 == var2) {
         var0.sprite2 = var1.readNullableLargeSmart(-1678416280) * -676658881;
      } else if (var2 == 3) {
         var0.menuTargetName = var1.readStringCp1252NullCircumfixed(-627794506);
      } else if (var2 == 4) {
         var0.field2218 = var1.readMedium(-1259347561) * -850027379;
      } else if (5 == var2) {
         var1.readMedium(-1667004490);
      } else if (var2 == 6) {
         var0.textSize = var1.readUnsignedByte(2009583365) * 1588971959;
      } else if (7 == var2) {
         int var3 = var1.readUnsignedByte(-1049849402);
         if (0 == (var3 & 1)) {
            var0.field2204 = false;
         }

         if (2 == (var3 & 2)) {
            var0.field2214 = true;
         }
      } else if (8 == var2) {
         var1.readUnsignedByte(-135719413);
      } else if (var2 >= 10 && var2 <= 14) {
         var0.menuActions[var2 - 10] = var1.readStringCp1252NullCircumfixed(2098275311);
      } else if (var2 == 15) {
         int var6 = var1.readUnsignedByte(988667121);
         var0.field2223 = new int[2 * var6];

         for (int var4 = 0; var4 < 2 * var6; var4++) {
            var0.field2223[var4] = var1.readShort((byte)-107);
         }

         Buffer.method12015(var1, 1569923515);
         int var9 = var1.readUnsignedByte(-34247544);
         var0.field2224 = new int[var9];

         for (int var5 = 0; var5 < var0.field2224.length; var5++) {
            var0.field2224[var5] = Buffer.method12015(var1, -586411517);
         }

         var0.field2222 = new byte[var6];

         for (int var10 = 0; var10 < var6; var10++) {
            var0.field2222[var10] = Buffer.method12001(var1, (byte)96);
         }
      } else if (16 != var2) {
         if (var2 == 17) {
            var0.name = var1.readStringCp1252NullCircumfixed(-1894727404);
         } else if (18 == var2) {
            var1.readNullableLargeSmart(-722700136);
         } else if (19 == var2) {
            var0.category = Buffer.method12008(var1, (byte)5) * 1867340629;
         } else if (21 == var2) {
            Buffer.method12015(var1, -404965657);
         } else if (var2 == 22) {
            Buffer.method12015(var1, 169843721);
         } else if (23 == var2) {
            var1.readUnsignedByte(1460834005);
            var1.readUnsignedByte(-914392238);
            var1.readUnsignedByte(-5320303);
         } else if (var2 == 24) {
            var1.readShort((byte)-71);
            var1.readShort((byte)-82);
         } else if (var2 == 25) {
            var1.readNullableLargeSmart(-957063301);
         } else if (28 == var2) {
            var1.readUnsignedByte(698145027);
         } else if (var2 == 29) {
            HorizontalAlignment[] var7 = new HorizontalAlignment[]{
               HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2250, HorizontalAlignment.field2252
            };
            var0.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var7, var1.readUnsignedByte(-551934436), (byte)1);
         } else if (30 == var2) {
            VerticalAlignment[] var8 = new VerticalAlignment[]{
               VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2246, VerticalAlignment.field2244
            };
            var0.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var8, var1.readUnsignedByte(1555766436), (byte)1);
         }
      }
   }

   public int getCategory() {
      return this.category * -629421571;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhi;)V")
   @ObfuscatedName("fj")
   public static void method4554(WorldMapElement var0) {
      if (null != var0.field2223) {
         for (byte var1 = 0; var1 < var0.field2223.length; var1 += 2) {
            if (var0.field2223[var1] < var0.field2206 * -2017749879) {
               var0.field2206 = 636232121 * var0.field2223[var1];
            } else if (var0.field2223[var1] > var0.field2202 * 282834999) {
               var0.field2202 = var0.field2223[var1] * 1355382151;
            }

            if (var0.field2223[1 + var1] < var0.field2208 * -676191921) {
               var0.field2208 = var0.field2223[1 + var1] * -770419281;
            } else if (var0.field2223[1 + var1] > var0.field2210 * 229850989) {
               var0.field2210 = 177840741 * var0.field2223[1 + var1];
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lxt;")
   @ObfuscatedName("yt")
   public SpritePixels method4570(boolean var1) {
      return this.getSpriteBool(var1, -666509786);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method4555() {
      if (null != this.field2223) {
         for (byte var1 = 0; var1 < this.field2223.length; var1 += 2) {
            if (this.field2223[var1] < this.field2206 * -2017749879) {
               this.field2206 = 1156288653 * this.field2223[var1];
            } else if (this.field2223[var1] > this.field2202 * 282834999) {
               this.field2202 = this.field2223[var1] * 1355382151;
            }

            if (this.field2223[1 + var1] < this.field2208 * -676191921) {
               this.field2208 = this.field2223[1 + var1] * -770419281;
            } else if (this.field2223[1 + var1] > this.field2210 * -1527361107) {
               this.field2210 = 177840741 * this.field2223[1 + var1];
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lxt;")
   @ObfuscatedName("be")
   public SpritePixels method4558(boolean var1) {
      int var2 = var1 ? -1176539457 * this.sprite2 : this.sprite1 * -393425597;
      return method4562(this, var2, 1097067576);
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("bo")
   SpritePixels method4563(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cached, var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class387.SpriteBuffer_getSprite(class209.WorldMapElement_archive, var1, 0, -2139672119);
            if (null != var2) {
               HitSplatDefinition_cached.put(var2, var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lxt;")
   @ObfuscatedName("aq")
   public SpritePixels method4559(boolean var1) {
      int var2 = var1 ? 2131054692 * this.sprite2 : this.sprite1 * 753261549;
      return method4562(this, var2, 446693815);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method4567() {
      return 969183434 * this.objectId;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lxt;")
   @ObfuscatedName("ao")
   public SpritePixels method4560(boolean var1) {
      int var2 = var1 ? -1007920913 * this.sprite2 : this.sprite1 * -269098298;
      return method4562(this, var2, 224687571);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)V")
   @ObfuscatedName("az")
   public static void method4540(AbstractArchive var0, AbstractArchive var1) {
      class209.WorldMapElement_archive = var1;
      WorldMapElement_count = AbstractArchive.method9046(var0, 23696925, (byte)-2) * 961549525;
      WorldMapElement_cached = new WorldMapElement[143164541 * WorldMapElement_count];

      for (int var2 = 0; var2 < WorldMapElement_count * 1107255672; var2++) {
         byte[] var3 = var0.getFile(35, var2, -1992000610);
         WorldMapElement_cached[var2] = new WorldMapElement(var2);
         if (null != var3) {
            WorldMapElement_cached[var2].decode(new Buffer(var3), (byte)43);
            method4553(WorldMapElement_cached[var2], (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method4568() {
      return 348284615 * this.objectId;
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lxt;")
   @ObfuscatedName("ak")
   public SpritePixels getSpriteBool(boolean var1, int var2) {
      try {
         int var10000;
         if (var1) {
            if (var2 == 955714229) {
               throw new IllegalStateException();
            }

            var10000 = -1176539457 * this.sprite2;
         } else {
            var10000 = this.sprite1 * -393425597;
         }

         int var3 = var10000;
         return method4562(this, var3, 1605595744);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hi.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ib")
   static final void clear(int var0) {
      try {
         class31.method664(-1311285749);
         class194.field2023.clear();
         class181.field1915.clear();
         WorldViewManager.method2892((byte)15);
         DbTableType.DBTableType_cache.clear();
         DevicePcmPlayerProvider.method145(938449093);
         VerticalAlignment.method4595(2056965400);
         PendingSpawn.method2972(-1036292581);
         HealthBarDefinition.HealthBarDefinition_cached.clear();
         HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
         HitSplatDefinition.HitSplatDefinition_cached.clear();
         HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
         HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
         class180.field1913.clear();
         KitDefinition.KitDefinition_cached.clear();
         GrandExchangeOfferOwnWorldComparator.method1275(147042880);
         UserComparator7.method3730(-1472743150);
         InterfaceParent.method3001(-568794256);
         class196.field2026.clear();
         ScriptFrame.method1173(1590935225);
         ItemComposition.ItemDefinition_cached.clear();
         ItemComposition.ItemDefinition_cachedModels.clear();
         ItemComposition.ItemDefinition_cachedSprites.clear();
         ParamComposition.ParamDefinition_cached.clear();
         SequenceDefinition.SequenceDefinition_cached.clear();
         SequenceDefinition.SequenceDefinition_cachedFrames.clear();
         SequenceDefinition.SequenceDefinition_cachedModel.clear();
         KitDefinition.method4821((byte)90);
         classEM.method3779(-809726831);
         classGK.method4245((byte)48);
         WorldViewManager.method2884(-2138868602);
         if (null != classDH.field1359) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            classDH.field1359.method11837((byte)-120);
         }

         if (null != ScriptFrame.field358) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            ScriptFrame.field358.method11837((byte)-95);
         }

         class200.field2100.clear();
         StructComposition.method5106(-690020777);
         AsyncRestClient.method241((byte)-126);
         classEM.method3773(-1975991322);
         class179.field1842.clear();
         WorldMapSection1.method7446(1760144535);
         classFT.method4099(1516989941);
         VarpDefinition.VarpDefinition_cached.clear();
         class209.field2136.clear();
         client.DBTableIndex_cache.clear();
         client.archive11.clear();
         PlayerComposition.PlayerAppearance_cachedModels.clear();
         PlayerComposition.field4391.clearFiles((byte)126);
         PlayerComposition.field4392 = 0;
         if (null != class226.widgetDefinition) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            class226.widgetDefinition.method7967(1258831648);
         }

         if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
            TextureProvider.method6460((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader, (byte)-84);
         }

         Script.Script_cached.clear();
         client.field742.clearFiles((byte)80);
         if (null != AbstractWorldMapIcon.field3997) {
            AbstractWorldMapIcon.field3997.clearFiles((byte)0);
         }

         if (AsyncHttpResponse.field63 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            AsyncHttpResponse.field63.clearFiles((byte)0);
         }

         if (VarcInt.field2195 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            VarcInt.field2195.clearFiles((byte)0);
         }

         if (HttpRequestTask.archive10 != null) {
            if (var0 == -1752162783) {
               return;
            }

            HttpRequestTask.archive10.clearFiles((byte)0);
         }

         if (null != WorldMapRectangle.archive12) {
            if (var0 == -1752162783) {
               return;
            }

            WorldMapRectangle.archive12.clearFiles((byte)0);
         }

         if (null != StructComposition.archive2) {
            if (var0 == -1752162783) {
               return;
            }

            StructComposition.archive2.clearFiles((byte)0);
         }

         if (null != class136.field1858) {
            if (var0 == -1752162783) {
               return;
            }

            class136.field1858.clearFiles((byte)0);
         }

         if (Varps.field4729 != null) {
            Varps.field4729.clearFiles((byte)0);
         }

         if (null != ActorSpotAnim.archive13) {
            if (var0 == -1752162783) {
               return;
            }

            ActorSpotAnim.archive13.clearFiles((byte)0);
         }

         if (null != class189.archive4) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            class189.archive4.clearFiles((byte)0);
         }

         if (Message.soundEffectsArchive != null) {
            if (var0 == -1752162783) {
               return;
            }

            Message.soundEffectsArchive.clearFiles((byte)0);
         }

         if (null != class175.field1995) {
            class175.field1995.clearFiles((byte)0);
         }

         if (UserComparator4.archive6 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            UserComparator4.archive6.clearFiles((byte)0);
         }

         if (Tile.archive9 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            Tile.archive9.clearFiles((byte)0);
         }

         if (GrandExchangeOfferOwnWorldComparator.field422 != null) {
            if (var0 == -1752162783) {
               return;
            }

            GrandExchangeOfferOwnWorldComparator.field422.clearFiles((byte)0);
         }

         if (Skeleton.field2818 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            Skeleton.field2818.clearFiles((byte)0);
         }

         if (null != class226.field2779) {
            class226.field2779.clearFiles((byte)0);
         }

         if (class147.archive8 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            class147.archive8.clearFiles((byte)0);
         }

         if (class160.field1988 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            class160.field1988.clearFiles((byte)0);
         }

         if (classSI.field5792 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            classSI.field5792.clearFiles((byte)0);
         }

         if (class138.field1779 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            class138.field1779.clearFiles((byte)0);
         }

         if (ParamComposition.field2543 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            ParamComposition.field2543.clearFiles((byte)0);
         }

         if (PcmPlayer.field1445 != null) {
            if (var0 == -1752162783) {
               throw new IllegalStateException();
            }

            PcmPlayer.field1445.clearFiles((byte)0);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hi.ib(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhi;I)Lxt;")
   @ObfuscatedName("ir")
   public static SpritePixels method4564(WorldMapElement var0, int var1) {
      if (var0 == null) {
         var0.method4555();
      }

      if (var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)class402.method8806(HitSplatDefinition_cached, var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class387.SpriteBuffer_getSprite(class209.WorldMapElement_archive, var1, 0, -2139672119);
            if (null != var2) {
               HitSplatDefinition_cached.put(var2, var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   void method4556(byte var1) {
      try {
         if (null != this.field2223) {
            for (byte var2 = 0; var2 < this.field2224.length; var2 += 2) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               if (this.field2224[var2] < this.field2208 * -2017749879) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.sprite2 = 636232121 * this.field2223[var2];
               } else if (this.field2224[var2] > this.field2206 * 282834999) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.sprite2 = this.field2224[var2] * 1355382151;
               }

               if (this.field2223[1 + var2] < this.field2206 * -676191921) {
                  if (var1 != 1) {
                     return;
                  }

                  this.field2206 = this.field2223[1 + var2] * -770419281;
               } else if (this.field2223[1 + var2] > this.sprite2 * 229850989) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field2208 = 177840741 * this.field2224[1 + var2];
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hi.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ah")
   void method4552(Buffer var1, int var2) {
      if (1 == var2) {
         this.field2218 = var1.readUnsignedShortAdd(-1955869539) * -670357653;
      } else if (2 == var2) {
         this.field2210 = var1.readShortSmartSub(-1678416280) * -676658881;
      } else if (var2 == 3) {
         this.menuTargetName = var1.readCESU8(-627794506);
      } else if (var2 == 4) {
         this.textSize = var1.readUnsignedShortAdd(-1259347561) * -850027379;
      } else if (5 == var2) {
         var1.readShortSmartSub(-1667004490);
      } else if (var2 == 6) {
         this.textSize = var1.method12181(2009583365) * 1588971959;
      } else if (7 == var2) {
         int var3 = var1.method12097(-1049849402);
         if (0 == (var3 & 1)) {
            this.field2214 = false;
         }

         if (2 == (var3 & 2)) {
            this.field2204 = true;
         }
      } else if (8 == var2) {
         var1.method12100(-135719413);
      } else if (var2 >= 10 && var2 <= 14) {
         this.menuActions[var2 - 10] = var1.readCESU8(2098275311);
      } else if (var2 == 15) {
         int var6 = var1.readUnsignedByteAdd(988667121);
         this.field2223 = new int[2 * var6];

         for (int var4 = 0; var4 < 2 * var6; var4++) {
            this.field2223[var4] = var1.method12170((byte)-107);
         }

         Buffer.method12015(var1, 1569923515);
         int var9 = var1.readUnsignedShortAddLE(-34247544);
         this.field2224 = new int[var9];

         for (int var5 = 0; var5 < this.field2224.length; var5++) {
            this.field2223[var5] = Buffer.method12015(var1, -586411517);
         }

         this.field2222 = new byte[var6];

         for (int var10 = 0; var10 < var6; var10++) {
            this.field2222[var10] = Buffer.method12001(var1, (byte)96);
         }
      } else if (16 != var2) {
         if (var2 == 17) {
            this.menuTargetName = var1.readStringCp1252NullTerminatedOrNull(-1894727404);
         } else if (18 == var2) {
            var1.readSignedShort(-722700136);
         } else if (19 == var2) {
            this.sprite1 = Buffer.method12008(var1, (byte)5) * 1867340629;
         } else if (21 == var2) {
            Buffer.method12015(var1, -404965657);
         } else if (var2 == 22) {
            Buffer.method12015(var1, 169843721);
         } else if (23 == var2) {
            var1.readShortSmartSub(1460834005);
            var1.method12075(-914392238);
            var1.readUnsignedShortAddLE(-5320303);
         } else if (var2 == 24) {
            var1.readUnsignedShortLE((byte)-71);
            var1.readUnsignedShortLE((byte)-82);
         } else if (var2 == 25) {
            var1.readShortSmart(-957063301);
         } else if (28 == var2) {
            var1.readUnsignedShortAdd(698145027);
         } else if (var2 == 29) {
            HorizontalAlignment[] var7 = new HorizontalAlignment[]{
               HorizontalAlignment.field2252, HorizontalAlignment.field2252, HorizontalAlignment.HorizontalAlignment_centered
            };
            this.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var7, var1.method12181(-551934436), (byte)1);
         } else if (30 == var2) {
            VerticalAlignment[] var8 = new VerticalAlignment[]{
               VerticalAlignment.field2244, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2246
            };
            this.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var8, var1.method12075(1555766436), (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lxt;")
   @ObfuscatedName("aw")
   SpritePixels getSprite(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 <= -41784034) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var3 = (SpritePixels)class402.method8806(HitSplatDefinition_cached, var1);
            if (var3 != null) {
               if (var2 <= -41784034) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = class387.SpriteBuffer_getSprite(class209.WorldMapElement_archive, var1, 0, -2139672119);
               if (null != var3) {
                  if (var2 <= -41784034) {
                     throw new IllegalStateException();
                  }

                  HitSplatDefinition_cached.put(var3, var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hi.aw(" + ')');
      }
   }
}
