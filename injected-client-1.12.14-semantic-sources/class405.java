import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class405 implements Enum {
   @ObfuscatedName("ae")
   public final int field4827;
   @ObfuscatedSignature(descriptor = "Lpi;")
   @ObfuscatedName("at")
   public static final class405 field4829 = new class405(1);
   @ObfuscatedSignature(descriptor = "Lpi;")
   @ObfuscatedName("ag")
   public static final class405 field4830 = new class405(2);
   @ObfuscatedSignature(descriptor = "Lpi;")
   @ObfuscatedName("an")
   public static final class405 field4831 = new class405(3);
   @ObfuscatedSignature(descriptor = "Lpi;")
   @ObfuscatedName("av")
   public static final class405 field4828 = new class405(0);

   class405(int var1) {
      this.field4827 = var1 * -2016209531;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field4827 * -922772659;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pi.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field4827 * -922772659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field4827 * -922772659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field4827 * -922772659;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("hr")
   static void method8725(byte var0) {
      try {
         if (client.field861 == class69.field517) {
            if (var0 == 0) {
               throw new IllegalStateException();
            } else {
               class175.field1995 = class69.newArchive(468737477 * class418.field5430.field5451, false, true, true, false, 1022586388);
               GrandExchangeOfferOwnWorldComparator.field422 = class69.newArchive(468737477 * class418.field5432.field5451, true, true, true, false, 684340901);
               class147.archive8 = class69.newArchive(class418.field5447.field5451 * 468737477, false, true, true, false, 58201262);
               HttpRequestTask.archive10 = class69.newArchive(class418.field5439.field5451 * 468737477, false, true, true, false, 542761595);
               ActorSpotAnim.archive13 = class69.newArchive(468737477 * class418.field5443.field5451, true, false, true, false, -554376886);
               classSI.field5792 = class69.newArchive(class418.field5440.field5451 * 468737477, false, true, true, false, -311157526);
               class226.field2779 = class69.newArchive(class418.field5426.field5451 * 468737477, false, true, true, false, 900337811);
               Varps.field4729 = class69.newArchive(468737477 * class418.field5442.field5451, true, true, true, false, 1952341841);
               SceneTilePaint.method6901(20, Strings.field4868, -442259464);
               HitSplatDefinition.method5015(class69.field505, -1588353637);
            }
         } else if (client.field861 == class69.field505) {
            int var57;
            byte var10001;
            label648: {
               int var50 = 0;
               var50 += Archive.method9072(class175.field1995, (byte)127) * 53 / 100;
               var50 += Archive.method9072(GrandExchangeOfferOwnWorldComparator.field422, (byte)67) * 5 / 100;
               var50 += Archive.method9072(class147.archive8, (byte)33) * 36 / 100;
               var50 += Archive.method9072(HttpRequestTask.archive10, (byte)64) * 1 / 100;
               var50 += Archive.method9072(ActorSpotAnim.archive13, (byte)12) * 1 / 100;
               var50 += Archive.method9072(classSI.field5792, (byte)59) * 2 / 100;
               var57 = var50 + Archive.method9072(class226.field2779, (byte)58) * 1 / 100;
               if (Varps.field4729.method9065(86757269)) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  if (Varps.field4729.isFullyLoaded(-1106010882)) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                     break label648;
                  }
               }

               var10001 = 0;
            }

            var57 += var10001;
            if (var57 != 100) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               } else {
                  if (0 != var57) {
                     if (var0 == 0) {
                        return;
                     }

                     SceneTilePaint.method6901(30, Strings.field4877 + var57 + "%", 1829836234);
                  }
               }
            } else {
               FileSystem.method4921(class175.field1995, "Sound FX", (byte)-91);
               FileSystem.method4921(GrandExchangeOfferOwnWorldComparator.field422, "Music Tracks", (byte)5);
               FileSystem.method4921(class147.archive8, "Sprites", (byte)52);
               FileSystem.method4921(classSI.field5792, "Music Samples", (byte)-75);
               FileSystem.method4921(class226.field2779, "Music Patches", (byte)-35);
               ApproximateRouteStrategy.field106 = new GraphicsDefaults();
               ApproximateRouteStrategy.field106.decode(Varps.field4729, (byte)0);
               SceneTilePaint.method6901(40, Strings.field4919, 159016348);
               HitSplatDefinition.method5015(class69.field511, -1520262458);
            }
         } else if (client.field861 == class69.field511) {
            if (var0 != 0) {
               boolean var10000;
               if (!client.isLowDetail) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var49 = var10000;
               EnumComposition.field2157 = 155013150;
               FaceNormal.PcmPlayer_stereo = var49;
               class339.field4369 = -2105706066;
               ArrayList var67 = new ArrayList(3);
               Skills.pcmPlayer1 = class62.method2632(client.taskHandler, 0, 2048, 1812404121);
               class50.pcmStreamMixer = new PcmStreamMixer();
               PcmStreamMixer var73 = new PcmStreamMixer();
               var73.addSubStream(class50.pcmStreamMixer);

               for (int var78 = 0; var78 < 3; var78++) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  MidiPcmStream var81 = new MidiPcmStream(Skills.pcmPlayer1);
                  var81.method7657(9, 128, -3394468);
                  var73.addSubStream(var81);
                  var67.add(var81);
               }

               Skills.pcmPlayer1.setStream(var73, 1699658450);
               Archive var79 = class226.field2779;
               Archive var82 = classSI.field5792;
               Archive var85 = class175.field1995;
               class345.field4317 = var79;
               WidgetFocusInputManager.field3309 = var82;
               classGH.field2009 = var85;
               class345.field4311 = var67;
               SceneTilePaint.method6901(60, Strings.field4871, -1019096874);
               HitSplatDefinition.method5015(class69.field506, -1189591082);
            }
         } else if (class69.field506 == client.field861) {
            if (var0 != 0) {
               if (class189.field2415 == null) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  class189.field2415 = new Fonts(class147.archive8, ActorSpotAnim.archive13);
               }

               FontName[] var48 = new FontName[]{
                  FontName.FontName_plain12,
                  FontName.FontName_bold12,
                  FontName.FontName_verdana11,
                  FontName.FontName_verdana13,
                  FontName.FontName_plain11,
                  FontName.FontName_verdana15
               };
               int var66 = var48.length;
               Fonts var72 = class189.field2415;
               FontName[] var77 = new FontName[]{
                  FontName.FontName_plain12,
                  FontName.FontName_bold12,
                  FontName.FontName_verdana11,
                  FontName.FontName_verdana13,
                  FontName.FontName_plain11,
                  FontName.FontName_verdana15
               };
               client.fontsMap = var72.createMap(var77, 1097748137);
               if (client.fontsMap.size() < var66) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     SceneTilePaint.method6901(80, Strings.field4872 + client.fontsMap.size() * 100 / var66 + "%", -1184903208);
                  }
               } else {
                  class498.fontPlain11 = (Font)client.fontsMap.get(FontName.FontName_plain11);
                  UserComparator5.fontPlain12 = (Font)client.fontsMap.get(FontName.FontName_plain12);
                  class234.fontBold12 = (Font)client.fontsMap.get(FontName.FontName_bold12);
                  WorldMapLabelSize.platformInfo = client.field905.get(-2051926234);
                  PlatformInfo.method11341(-1);
                  SceneTilePaint.method6901(80, Strings.field4873, -2110773067);
                  HitSplatDefinition.method5015(class69.field501, -2108468799);
               }
            }
         } else if (class69.field501 == client.field861) {
            if (var0 == 0) {
               throw new IllegalStateException();
            } else {
               int var47 = class28.method530(HttpRequestTask.archive10, class147.archive8, -1660319825);
               int var65 = HttpRequest.method278(class147.archive8, 947212816);
               if (var47 < var65) {
                  if (var0 != 0) {
                     SceneTilePaint.method6901(90, Strings.field4874 + var47 * 100 / var65 + "%", -1781486893);
                  }
               } else {
                  SceneTilePaint.method6901(100, Strings.field4875, 897586546);
                  if (class452.field5534) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     }

                     WorldMapSectionType.updateGameState(5, (byte)45);
                     HitSplatDefinition.method5015(class69.field510, -1501212493);
                  } else {
                     HitSplatDefinition.method5015(class69.field502, -1368021530);
                  }
               }
            }
         } else if (class69.field510 == client.field861) {
            if (var0 != 0) {
               WorldMapSectionType.updateGameState(10, (byte)45);
            }
         } else if (class69.field502 == client.field861) {
            if (var0 == 0) {
               throw new IllegalStateException();
            } else {
               AbstractWorldMapIcon.field3997 = class69.newArchive(468737477 * class418.field5427.field5451, false, true, true, false, 2115112683);
               AsyncHttpResponse.field63 = class69.newArchive(468737477 * class418.field5444.field5451, false, true, true, true, 1375279505);
               VarcInt.field2195 = class69.newArchive(468737477 * class418.field5436.field5451, false, true, true, false, -373844151);
               StructComposition.archive2 = class69.newArchive(class418.field5428.field5451 * 468737477, true, false, true, false, 415659362);
               class189.archive4 = class69.newArchive(468737477 * class418.field5429.field5451, false, true, true, false, 782036729);
               Tile.archive9 = class69.newArchive(468737477 * class418.field5431.field5451, true, true, true, false, -1567097182);
               Skeleton.field2818 = class69.newArchive(468737477 * class418.field5433.field5451, false, true, true, false, 772345466);
               class160.field1988 = class69.newArchive(class418.field5434.field5451 * 468737477, false, true, true, false, 206340255);
               UserComparator4.archive6 = class69.newArchive(468737477 * class418.field5435.field5451, false, true, true, false, -569604283);
               WorldMapRectangle.archive12 = class69.newArchive(class418.field5438.field5451 * 468737477, false, true, true, false, 474769522);
               ParamComposition.field2543 = class69.newArchive(class418.field5437.field5451 * 468737477, false, true, true, false, 1281160865);
               PcmPlayer.field1445 = class69.newArchive(class418.field5448.field5451 * 468737477, false, true, true, false, 1325923397);
               class138.field1779 = class69.newArchive(468737477 * class418.field5445.field5451, false, true, true, false, -1438460558);
               class136.field1858 = class69.newArchive(468737477 * class418.field5446.field5451, false, true, true, false, 866105257);
               int var64 = class418.field5441.field5451 * 468737477;
               ArchiveDisk var71 = null;
               if (JagexCache.JagexCache_dat2File != null) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  var71 = new ArchiveDisk(var64, JagexCache.JagexCache_dat2File, UserComparator9.JagexCache_idxFiles[var64], 1000000);
               }

               Archive var46 = new Archive(var71, InterfaceParent.masterDisk, VarbitComposition.field2488, var64, false, true, true, true, true);
               Message.soundEffectsArchive = var46;
               SceneTilePaint.method6901(20, Strings.field4868, 1161569360);
               HitSplatDefinition.method5015(class69.field504, -1472376585);
            }
         } else if (client.field861 == class69.field504) {
            if (var0 == 0) {
               throw new IllegalStateException();
            } else {
               int var30 = 0;
               var30 += Archive.method9072(AbstractWorldMapIcon.field3997, (byte)13) * 4 / 100;
               var30 += Archive.method9072(AsyncHttpResponse.field63, (byte)19) * 1 / 100;
               var30 += Archive.method9072(VarcInt.field2195, (byte)79) * 2 / 100;
               var30 += Archive.method9072(StructComposition.archive2, (byte)115) * 1 / 100;
               var30 += Archive.method9072(class189.archive4, (byte)44) * 1 / 100;
               var30 += Archive.method9072(Tile.archive9, (byte)19) * 10 / 100;
               var30 += Archive.method9072(Skeleton.field2818, (byte)124) * 65 / 100;
               var30 += Archive.method9072(class160.field1988, (byte)53) * 1 / 100;
               var30 += Archive.method9072(UserComparator4.archive6, (byte)17) * 1 / 100;
               var30 += Archive.method9072(WorldMapRectangle.archive12, (byte)53) * 6 / 100;
               var30 += Archive.method9072(PcmPlayer.field1445, (byte)75) * 1 / 100;
               var30 += Archive.method9072(ParamComposition.field2543, (byte)103) * 2 / 100;
               var30 += Archive.method9072(class138.field1779, (byte)18) * 2 / 100;
               var30 += Archive.method9072(class136.field1858, (byte)105) * 1 / 100;
               var30 += Archive.method9072(Message.soundEffectsArchive, (byte)94) * 2 / 100;
               if (var30 != 100) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     if (var30 != 0) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }

                        SceneTilePaint.method6901(30, Strings.field4877 + var30 + "%", 1346568830);
                     }
                  }
               } else {
                  FileSystem.method4921(AbstractWorldMapIcon.field3997, "Animations", (byte)35);
                  FileSystem.method4921(AsyncHttpResponse.field63, "Animation Keyframes", (byte)12);
                  FileSystem.method4921(VarcInt.field2195, "Skeletons", (byte)96);
                  FileSystem.method4921(Tile.archive9, "Maps", (byte)57);
                  FileSystem.method4921(Skeleton.field2818, "Models", (byte)-9);
                  FileSystem.method4921(UserComparator4.archive6, "Music Jingles", (byte)31);
                  FileSystem.method4921(PcmPlayer.field1445, "World Map", (byte)20);
                  FileSystem.method4921(ParamComposition.field2543, "World Map Geography", (byte)60);
                  FileSystem.method4921(class138.field1779, "World Map Ground", (byte)-30);
                  SceneTilePaint.method6901(30, Strings.field4919, -363351934);
                  HitSplatDefinition.method5015(class69.field500, -1151450083);
               }
            }
         } else if (class69.field500 == client.field861) {
            if (var0 != 0) {
               Occluder.topLevelWorldView = client.worldViewManager.createWorldView(104, 104, class468.clientPreferences.getDrawDistance((byte)-91), (byte)-42);
               AsyncHttpResponse.worldView = Occluder.topLevelWorldView;
               class437.sceneMinimapSprite = new SpritePixels(512, 512);
               SceneTilePaint.method6901(30, Strings.field4961, 167608317);
               HitSplatDefinition.method5015(class69.field508, -2136286283);
            }
         } else if (client.field861 == class69.field508) {
            if (var0 == 0) {
               throw new IllegalStateException();
            } else if (!StructComposition.archive2.isFullyLoaded(-1245800067)) {
               SceneTilePaint.method6901(40, Strings.field5018 + StructComposition.archive2.loadPercent(-1781125969) + "%", -1033772075);
            } else if (!class136.field1858.isFullyLoaded(1309473033)) {
               SceneTilePaint.method6901(40, Strings.field5018 + (80 + WorldMapRectangle.archive12.loadPercent(199615075) / 6) + "%", -762005221);
            } else {
               Archive var29 = StructComposition.archive2;
               FloorOverlayDefinition.FloorOverlayDefinition_archive = var29;
               ItemContainer.method2613(StructComposition.archive2, 1912333612);
               Archive var63 = StructComposition.archive2;
               Archive var70 = Skeleton.field2818;
               KitDefinition.KitDefinition_archive = var63;
               ClanChannelMember.KitDefinition_modelsArchive = var70;
               class408.KitDefinition_fileCount = AbstractArchive.method9046(KitDefinition.KitDefinition_archive, 3, (byte)-120) * 1748384847;
               Archive var76 = StructComposition.archive2;
               Archive var80 = Skeleton.field2818;
               boolean var84 = client.isLowDetail;
               VarcInt.ObjectDefinition_archive = var76;
               SecureRandomCallable.ObjectDefinition_modelsArchive = var80;
               ObjectComposition.ObjectDefinition_isLowDetail = var84;
               Archive var87 = StructComposition.archive2;
               Archive var89 = Skeleton.field2818;
               Username.NpcDefinition_archive = var87;
               class348.field4292 = var89;
               class157.method4368(StructComposition.archive2, 406971869);
               Archive var9 = StructComposition.archive2;
               Archive var10 = Skeleton.field2818;
               boolean var11 = client.isMembersWorld;
               Font var12 = class498.fontPlain11;
               class138.ItemDefinition_archive = var9;
               Language.ItemDefinition_modelArchive = var10;
               TileItem.ItemDefinition_inMembersWorld = var11;
               class394.ItemDefinition_fileCount = AbstractArchive.method9046(class138.ItemDefinition_archive, 10, (byte)-78) * 1800648379;
               class175.ItemDefinition_fontPlain11 = var12;
               SecureRandomCallable.method1379(
                  StructComposition.archive2, AbstractWorldMapIcon.field3997, AsyncHttpResponse.field63, VarcInt.field2195, 526958247
               );
               Archive var13 = StructComposition.archive2;
               Archive var14 = Skeleton.field2818;
               SpotAnimationDefinition.field2269 = var13;
               SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var14;
               Archive var15 = StructComposition.archive2;
               VarbitComposition.VarbitDefinition_archive = var15;
               class46.method533(StructComposition.archive2, (byte)2);
               int var16 = -1537704075 * VarpDefinition.field2407;
               Varps.Varps_temp = new int[var16];
               Varps.Varps_main = new int[var16];
               client.method2414(-1);
               class226.widgetDefinition = new WidgetDefinition(
                  class189.archive4, Skeleton.field2818, class147.archive8, ActorSpotAnim.archive13, Message.soundEffectsArchive
               );
               Archive var17 = StructComposition.archive2;
               InvDefinition.InvDefinition_archive = var17;
               Archive var18 = StructComposition.archive2;
               EnumComposition.EnumDefinition_archive = var18;
               classNJ.method7763(StructComposition.archive2, -833282750);
               Archive var19 = StructComposition.archive2;
               classOO.method8367(StructComposition.archive2, (byte)-56);
               Archive var20 = StructComposition.archive2;
               Archive var21 = class147.archive8;
               HttpAuthenticationHeader.field5852 = var20;
               class141.field1966 = var21;
               Archive var22 = StructComposition.archive2;
               classRS.field5704 = var22;
               classDH.method3119(StructComposition.archive2, (byte)-53);
               classDH.field1359 = new classWQ(class520.field6071, 54, class352.clientLanguage, StructComposition.archive2);
               ScriptFrame.field358 = new classWQ(class520.field6071, 47, class352.clientLanguage, StructComposition.archive2);
               class166.varcs = new Varcs();
               class380.method8243(StructComposition.archive2, class147.archive8, ActorSpotAnim.archive13, 2092189559);
               Archive var23 = StructComposition.archive2;
               Archive var24 = class147.archive8;
               HealthBarDefinition.HealthBarDefinition_archive = var23;
               UserComparator1.field6484 = var24;
               classGW.method4373(StructComposition.archive2, class147.archive8, -718309399);
               SceneTilePaint.method6901(50, Strings.field5033, -1775822395);
               HitSplatDefinition.method5015(class69.field509, -1911838807);
            }
         } else if (client.field861 != class69.field509) {
            if (class69.field503 == client.field861) {
               if (!class160.field1988.isFullyLoaded(-215679754)) {
                  SceneTilePaint.method6901(70, Strings.field4880 + "0%", 1452784340);
               } else {
                  WorldMapSection0.textureProvider = new TextureProvider(
                     class160.field1988, class147.archive8, 20, class468.clientPreferences.getBrightness(882784362), 128
                  );
                  Rasterizer3D.setTextureLoader(WorldMapSection0.textureProvider);
                  Rasterizer3D.buildPalette(class468.clientPreferences.getBrightness(1299343466));
                  HitSplatDefinition.method5015(class69.field512, -1717927173);
               }
            } else if (class69.field512 == client.field861) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               } else {
                  int var28 = TextureProvider.method6450(WorldMapSection0.textureProvider, 2140862235);
                  if (var28 < 100) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        SceneTilePaint.method6901(80, Strings.field4880 + var28 + "%", -1041440124);
                     }
                  } else {
                     SceneTilePaint.method6901(90, Strings.field4881, -371454035);
                     HitSplatDefinition.method5015(class69.field516, -1741783343);
                  }
               }
            } else if (class69.field516 == client.field861) {
               class535.mouseRecorder = new MouseRecorder();
               TaskHandler.method4876(client.taskHandler, class535.mouseRecorder, 10, 1879805061);
               SceneTilePaint.method6901(92, Strings.field5093, 47538907);
               HitSplatDefinition.method5015(class69.field513, -1527399168);
            } else if (class69.field513 == client.field861) {
               if (var0 != 0) {
                  if (!HttpRequestTask.archive10.tryLoadFileByNames("huffman", "", -989960120)) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        SceneTilePaint.method6901(94, Strings.field4883 + 0 + "%", -1539667906);
                     }
                  } else {
                     Huffman var27 = new Huffman(HttpRequestTask.archive10.takeFileByNames("huffman", "", 2075438454));
                     AsyncRestClient.method235(var27, (byte)0);
                     SceneTilePaint.method6901(94, Strings.field4884, -906909317);
                     HitSplatDefinition.method5015(class69.field514, -1818319289);
                  }
               }
            } else if (client.field861 == class69.field514) {
               if (var0 != 0) {
                  if (!class189.archive4.isFullyLoaded(1149080770)) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        SceneTilePaint.method6901(96, Strings.field5101 + class189.archive4.loadPercent(1566536890) * 4 / 5 + "%", 575476861);
                     }
                  } else if (!Message.soundEffectsArchive.isFullyLoaded(393286643)) {
                     if (var0 != 0) {
                        SceneTilePaint.method6901(96, Strings.field5101 + Message.soundEffectsArchive.loadPercent(23765531) * 4 / 5 + "%", 1698865746);
                     }
                  } else if (!WorldMapRectangle.archive12.isFullyLoaded(335324526)) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        SceneTilePaint.method6901(96, Strings.field5101 + (80 + WorldMapRectangle.archive12.loadPercent(-1510960217) / 6) + "%", -1302745535);
                     }
                  } else if (!ActorSpotAnim.archive13.isFullyLoaded(716729573)) {
                     SceneTilePaint.method6901(96, Strings.field5101 + (96 + ActorSpotAnim.archive13.loadPercent(-841944817) / 50) + "%", 1956395574);
                  } else {
                     SceneTilePaint.method6901(98, Strings.field5020, 1830482584);
                     if (WorldMapRectangle.archive12.isValidFileName("version.dat", "", -1726307925)) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }

                        Buffer var26 = new Buffer(WorldMapRectangle.archive12.takeFileByNames("version.dat", "", -737119248));
                        Buffer.method12008(var26, (byte)5);
                     }

                     HitSplatDefinition.method5015(class69.field515, -1166123428);
                  }
               }
            } else if (client.field861 == class69.field515) {
               if (var0 != 0) {
                  if (PcmPlayer.field1445.getGroupCount(-1037357832) > 0
                     && !PcmPlayer.field1445.tryLoadGroupByName(WorldMapCacheName.field3834.name, -1319387222)) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        SceneTilePaint.method6901(
                           100,
                           Strings.field5099 + AbstractArchive.method9041(PcmPlayer.field1445, WorldMapCacheName.field3834.name, (byte)53) / 10 + "%",
                           -1477877570
                        );
                     }
                  } else {
                     if (null == Skills.worldMap) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }

                        Skills.worldMap = new WorldMap();
                        WorldMap.method11370(
                           Skills.worldMap,
                           PcmPlayer.field1445,
                           ParamComposition.field2543,
                           class138.field1779,
                           class234.fontBold12,
                           client.fontsMap,
                           class499.mapSceneSprites,
                           125152974
                        );
                     }

                     SceneTilePaint.method6901(100, Strings.field5065, -709427181);
                     if (class452.field5534) {
                        HitSplatDefinition.method5015(class69.field507, -1314692863);
                     } else {
                        HitSplatDefinition.method5015(class69.field510, -1437745240);
                     }
                  }
               }
            } else {
               if (client.field861 == class69.field507) {
                  if (var0 == 0) {
                     return;
                  }

                  class134.field1821 = false;
                  WorldMapSectionType.updateGameState(20, (byte)45);
                  NpcOverrides.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE, 384338867);
               }
            }
         } else if (var0 == 0) {
            throw new IllegalStateException();
         } else {
            int var1 = 0;
            if (null == class472.compass) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               class472.compass = class387.SpriteBuffer_getSprite(class147.archive8, -913113921 * ApproximateRouteStrategy.field106.field6121, 0, -2139672119);
            } else {
               var1++;
            }

            if (class39.redHintArrowSprite == null) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               class39.redHintArrowSprite = class387.SpriteBuffer_getSprite(
                  class147.archive8, 2103662955 * ApproximateRouteStrategy.field106.field6133, 0, -2139672119
               );
            } else {
               var1++;
            }

            if (class499.mapSceneSprites == null) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               Archive var3 = class147.archive8;
               int var4 = ApproximateRouteStrategy.field106.field6130 * -907069361;
               IndexedSprite[] var2;
               if (!FloorOverlayDefinition.method5355(var3, var4, 0, -1366279867)) {
                  var2 = null;
               } else {
                  IndexedSprite[] var6 = new IndexedSprite[1626067939 * class615.SpriteBuffer_spriteCount];

                  for (int var7 = 0; var7 < class615.SpriteBuffer_spriteCount * 1626067939; var7++) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     }

                     IndexedSprite var8 = var6[var7] = new IndexedSprite();
                     var8.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
                     var8.height = 722593713 * class144.SpriteBuffer_spriteHeight;
                     var8.xOffset = class615.SpriteBuffer_xOffsets[var7];
                     var8.yOffset = class615.SpriteBuffer_yOffsets[var7];
                     var8.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var7];
                     var8.subHeight = class615.SpriteBuffer_spriteHeights[var7];
                     var8.palette = BufferedSource.SpriteBuffer_spritePalette;
                     var8.pixels = class320.SpriteBuffer_pixels[var7];
                  }

                  class615.SpriteBuffer_xOffsets = null;
                  class615.SpriteBuffer_yOffsets = null;
                  IntHashTable.SpriteBuffer_spriteWidths = null;
                  class615.SpriteBuffer_spriteHeights = null;
                  BufferedSource.SpriteBuffer_spritePalette = null;
                  class320.SpriteBuffer_pixels = (byte[][])null;
                  var2 = var6;
               }

               class499.mapSceneSprites = var2;
            } else {
               var1++;
            }

            if (class66.headIconPkSprites == null) {
               if (var0 == 0) {
                  return;
               }

               class66.headIconPkSprites = class69.method1399(class147.archive8, ApproximateRouteStrategy.field106.field6129 * 1155561851, 0, 1160399801);
            } else {
               var1++;
            }

            if (null == class279.headIconPrayerSprites) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               class279.headIconPrayerSprites = class69.method1399(class147.archive8, -1998660545 * ApproximateRouteStrategy.field106.field6127, 0, 1805561019);
            } else {
               var1++;
            }

            if (null == SceneTilePaint.headIconHintSprites) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               SceneTilePaint.headIconHintSprites = class69.method1399(
                  class147.archive8, -970907119 * ApproximateRouteStrategy.field106.field6132, 0, 1851966880
               );
            } else {
               var1++;
            }

            if (null == class217.mapDotSprites) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               class217.mapDotSprites = class69.method1399(class147.archive8, ApproximateRouteStrategy.field106.field6134 * -1341684087, 0, 1764189361);
            } else {
               var1++;
            }

            if (null == class137.crossSprites) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               class137.crossSprites = class69.method1399(class147.archive8, ApproximateRouteStrategy.field106.field6135 * -838050011, 0, 1359620825);
            } else {
               var1++;
            }

            if (classWZ.field6473 == null) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               classWZ.field6473 = class69.method1399(class147.archive8, -1895564125 * ApproximateRouteStrategy.field106.field6136, 0, 1484536704);
            } else {
               var1++;
            }

            if (WorldMapArchiveLoader.scrollBarSprites == null) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               Archive var68 = class147.archive8;
               int var74 = ApproximateRouteStrategy.field106.field6137 * -1497782373;
               IndexedSprite[] var59;
               if (!FloorOverlayDefinition.method5355(var68, var74, 0, -1366279867)) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  var59 = null;
               } else {
                  IndexedSprite[] var83 = new IndexedSprite[class615.SpriteBuffer_spriteCount * 1626067939];

                  for (int var86 = 0; var86 < 1626067939 * class615.SpriteBuffer_spriteCount; var86++) {
                     if (var0 == 0) {
                        return;
                     }

                     IndexedSprite var88 = var83[var86] = new IndexedSprite();
                     var88.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
                     var88.height = class144.SpriteBuffer_spriteHeight * 722593713;
                     var88.xOffset = class615.SpriteBuffer_xOffsets[var86];
                     var88.yOffset = class615.SpriteBuffer_yOffsets[var86];
                     var88.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var86];
                     var88.subHeight = class615.SpriteBuffer_spriteHeights[var86];
                     var88.palette = BufferedSource.SpriteBuffer_spritePalette;
                     var88.pixels = class320.SpriteBuffer_pixels[var86];
                  }

                  class615.SpriteBuffer_xOffsets = null;
                  class615.SpriteBuffer_yOffsets = null;
                  IntHashTable.SpriteBuffer_spriteWidths = null;
                  class615.SpriteBuffer_spriteHeights = null;
                  BufferedSource.SpriteBuffer_spritePalette = null;
                  class320.SpriteBuffer_pixels = (byte[][])null;
                  var59 = var83;
               }

               WorldMapArchiveLoader.scrollBarSprites = var59;
            } else {
               var1++;
            }

            if (null == UrlRequest.field1731) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               }

               UrlRequest.field1731 = WorldEntityConfig.method4732(class147.archive8, ApproximateRouteStrategy.field106.field6138 * 564143983, 0, (byte)-9);
            } else {
               var1++;
            }

            label660: {
               if (AbstractWorldMapIcon.field3996 == null) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }

                  if (-1 != 1962490815 * ApproximateRouteStrategy.field106.field6139) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     }

                     ModelData var60 = ModelData.ModelData_get(Skeleton.field2818, 1962490815 * ApproximateRouteStrategy.field106.field6139, 0);
                     if (var60 != null) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon.field3996 = var60.method6097();
                     }
                     break label660;
                  }
               }

               var1++;
            }

            label654: {
               if (null == class166.field2022) {
                  if (var0 == 0) {
                     return;
                  }

                  if (-1 != ApproximateRouteStrategy.field106.field6128 * 496146203) {
                     if (var0 == 0) {
                        throw new IllegalStateException();
                     }

                     ModelData var61 = ModelData.ModelData_get(Skeleton.field2818, 496146203 * ApproximateRouteStrategy.field106.field6128, 0);
                     if (var61 != null) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }

                        class166.field2022 = var61.method6097();
                     }
                     break label654;
                  }
               }

               var1++;
            }

            if (var1 < 13) {
               if (var0 == 0) {
                  throw new IllegalStateException();
               } else {
                  SceneTilePaint.method6901(70, Strings.field4878 + var1 * 100 / 14 + "%", -1447362730);
               }
            } else {
               AbstractFont.AbstractFont_modIconSprites = UrlRequest.field1731;
               class39.redHintArrowSprite.normalize();
               int var62 = (int)(Math.random() * 21.0) - 10;
               int var69 = (int)(Math.random() * 21.0) - 10;
               int var75 = (int)(Math.random() * 21.0) - 10;
               int var5 = (int)(Math.random() * 41.0) - 20;
               class499.mapSceneSprites[0].method12425(var62 + var5, var69 + var5, var75 + var5);
               SceneTilePaint.method6901(60, Strings.field4879, 1358411943);
               HitSplatDefinition.method5015(class69.field503, -1906834426);
            }
         }
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "pi.hr(" + ')');
      }
   }
}
