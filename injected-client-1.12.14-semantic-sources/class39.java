import java.util.Iterator;
import net.runelite.api.events.PostStructComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bi")
public class class39 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field193 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field194 = 48;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("au")
   static SpritePixels redHintArrowSprite;
   @ObfuscatedName("aw")
   static int minimapState = 0;
   @ObfuscatedName("ad")
   static int field189 = 1107025005;
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("ab")
   static SpritePixels[] mapIcons = new SpritePixels[1000];
   @ObfuscatedName("ai")
   static int mapIconCount = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("et")
   static final float field192 = 325.949F;
   @ObfuscatedName("ac")
   static int[] mapIconYs = new int[1000];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field195 = 30;
   @ObfuscatedName("ax")
   static int field185 = 0;
   @ObfuscatedName("ar")
   static int Players_count = 0;
   @ObfuscatedName("il")
   static String field196;
   @ObfuscatedName("as")
   static int[] mapIconXs = new int[1000];

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("be")
   static final void method640(int var0, int var1, int var2, int var3, int var4) {
      Scene var5 = Occluder.topLevelWorldView.scene;
      long var6 = Scene.method5731(var5, var0, var1, var2);
      if (var6 != 0L) {
         int var8 = var5.method5784(var0, var1, var2, var6);
         int var9 = var8 >> 6 & 3;
         int var10 = var8 & 31;
         int var11 = var3;
         if (WorldMapLabelSize.method7220(var6)) {
            var11 = var4;
         }

         int[] var12 = class437.sceneMinimapSprite.pixels;
         int var13 = 24624 + var1 * 4 + (103 - var2) * 2048;
         int var14 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var14, 2088200741);
         if (-1 != 93759001 * var15.mapSceneId) {
            IndexedSprite var16 = class499.mapSceneSprites[var15.mapSceneId * 93759001];
            if (var16 != null) {
               int var17 = (-1336500124 * var15.sizeX - var16.subWidth) / 2;
               int var18 = (-1410019452 * var15.sizeY - var16.subHeight) / 2;
               var16.drawAt(48 + var1 * 4 + var17, 48 + 4 * (104 - var2 - var15.sizeY * -352504863) + var18);
            }
         } else {
            if (var10 == 0 || 2 == var10) {
               if (var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[1536 + var13] = var11;
               } else if (1 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 2) {
                  var12[var13 + 3] = var11;
                  var12[512 + 3 + var13] = var11;
                  var12[1024 + 3 + var13] = var11;
                  var12[1536 + 3 + var13] = var11;
               } else if (var9 == 3) {
                  var12[var13 + 1536] = var11;
                  var12[var13 + 1536 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }

            if (3 == var10) {
               if (0 == var9) {
                  var12[var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
               } else if (2 == var9) {
                  var12[1536 + 3 + var13] = var11;
               } else if (3 == var9) {
                  var12[var13 + 1536] = var11;
               }
            }

            if (2 == var10) {
               if (3 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[var13 + 1536] = var11;
               } else if (var9 == 0) {
                  var12[var13] = var11;
                  var12[1 + var13] = var11;
                  var12[2 + var13] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
                  var12[3 + var13 + 512] = var11;
                  var12[1024 + 3 + var13] = var11;
                  var12[3 + var13 + 1536] = var11;
               } else if (2 == var9) {
                  var12[1536 + var13] = var11;
                  var12[1536 + var13 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }
         }
      }

      var6 = var5.getWallDecorationTag(var0, var1, var2);
      if (0L != var6) {
         int var21 = var5.method5784(var0, var1, var2, var6);
         int var23 = var21 >> 6 & 3;
         int var25 = var21 & 31;
         int var27 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var29 = AsyncHttpResponse.getObjectDefinition(var27, 2093377216);
         if (var29.mapSceneId * 93759001 != -1) {
            IndexedSprite var31 = class499.mapSceneSprites[93759001 * var29.mapSceneId];
            if (null != var31) {
               int var33 = (var29.sizeX * -1336500124 - var31.subWidth) / 2;
               int var35 = (-1410019452 * var29.sizeY - var31.subHeight) / 2;
               var31.drawAt(var33 + 4 * var1 + 48, var35 + 48 + (104 - var2 - -352504863 * var29.sizeY) * 4);
            }
         } else if (9 == var25) {
            int var32 = 15658734;
            if (WorldMapLabelSize.method7220(var6)) {
               var32 = 15597568;
            }

            int[] var34 = class437.sceneMinimapSprite.pixels;
            int var36 = 4 * var1 + 24624 + (103 - var2) * 2048;
            if (var23 != 0 && var23 != 2) {
               var34[var36] = var32;
               var34[1 + var36 + 512] = var32;
               var34[2 + 1024 + var36] = var32;
               var34[3 + 1536 + var36] = var32;
            } else {
               var34[1536 + var36] = var32;
               var34[var36 + 1024 + 1] = var32;
               var34[2 + var36 + 512] = var32;
               var34[var36 + 3] = var32;
            }
         }
      }

      var6 = var5.getBoundaryObjectTag(var0, var1, var2);
      if (0L != var6) {
         int var22 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var24 = AsyncHttpResponse.getObjectDefinition(var22, 2054834934);
         if (93759001 * var24.mapSceneId != -1) {
            IndexedSprite var26 = class499.mapSceneSprites[var24.mapSceneId * 93759001];
            if (null != var26) {
               int var28 = (-1336500124 * var24.sizeX - var26.subWidth) / 2;
               int var30 = (-1410019452 * var24.sizeY - var26.subHeight) / 2;
               var26.drawAt(48 + 4 * var1 + var28, var30 + 48 + (104 - var2 - var24.sizeY * -352504863) * 4);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;III)V")
   @ObfuscatedName("au")
   static final void method622(Widget var0, int var1, int var2, int var3) {
      HttpRequestTask.method93(-465214182);
      SpriteMask var4 = var0.method8051(class226.widgetDefinition, false, -1385337489);
      if (var4 != null) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, 915756381 * var4.height + var1, var4.width * 1668058793 + var2);
         if (-880013384 * minimapState != 2 && 597277019 * minimapState != 5) {
            int var5 = client.camAngleY * 531468455 & 2047;
            int var6 = 780103094 + client.field828 * 1720951819 / 32;
            int var7 = 464 - client.field674 * 1039920424 / 32;
            class437.sceneMinimapSprite
               .method12675(var1, var2, var4.height * 915756381, 1668058793 * var4.width, var6, var7, var5, 1204092055, var1, var2, var4.xStarts, var4.xWidths);

            for (int var8 = 0; var8 < mapIconCount * 623878444; var8++) {
               int var9 = 2 + mapIconXs[var8] * 4 - client.field828 * -1480965468 / 1393062896;
               int var10 = mapIconYs[var8] * 4 + 2 - client.field674 * -291215063 / 32;
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var9, var10, var5, mapIcons[var8], var4, 983624133);
            }

            class6.method120(Occluder.topLevelWorldView, var1, var2, var5, var4, (byte)-25);
            FontName.method11650(Occluder.topLevelWorldView, var1, var2, var5, var4, (byte)36);
            WorldView var29 = Occluder.topLevelWorldView;

            for (int var30 = 0; var30 < var29.field1314.method10502(-1767959725); var30++) {
               WorldEntity var34 = (WorldEntity)var29.worldEntities.get((long)var29.field1314.method10498(var30, (byte)84));
               if (var34 != null) {
                  int var11 = var34.getY(-1966461005) / 32 - client.field828 * -361115983 / 719820259;
                  int var12 = var34.getX(-727737924) / -1501745008 - 1366877648 * client.field674 / 34508353;
                  SpritePixels var13 = var34.worldEntityConfig.method4777((byte)-29);
                  byte var14 = 1;
                  if (!WorldEntity.method10825(var34, -381944409)) {
                     int var15 = -212095310 - WorldEntity.method10834(var34, (byte)32) + 1024;
                     if (var13 != null) {
                        int var16 = var11 * var11 + var12 * var12;
                        if (var16 <= 12100) {
                           int var17 = Rasterizer3D.Rasterizer3D_sine[var5];
                           int var18 = Rasterizer3D.Rasterizer3D_cosine[var5];
                           int var19 = var11 * var18 + var12 * var17 >> 16;
                           int var20 = var18 * var12 - var11 * var17 >> 16;
                           var15 = var5 - var15 & 46387048;
                           int var21 = var19 + var1 + -324344025 * var4.height / 2;
                           int var22 = var2 + var4.width * -943860898 / 2 - var20;
                           int var23 = var13.width * var14;
                           int var24 = var13.height * var14;
                           int var25 = var21 - var23 / 2;
                           int var26 = var22 - var24 / 2;
                           int var27 = var13.subWidth / 2;
                           int var28 = var13.subHeight / 2;
                           var13.method12675(var25, var26, var23, var24, var27, var28, var15, 311493398 * var14, var1, var2, var4.xStarts, var4.xWidths);
                        }
                     }

                     class6.method120(var34.worldView, var1, var2, var5, var4, (byte)26);
                     FontName.method11650(var34.worldView, var1, var2, var5, var4, (byte)53);
                     WorldMapSprite.method7292(var34.worldView, var1, var2, var5, var4, -360909473);
                  }
               }
            }

            WorldMapSprite.method7292(Occluder.topLevelWorldView, var1, var2, var5, var4, 418025432);
            if (client.hintArrow.method8731((byte)16) && client.cycle * 1759706017 % 20 < 10) {
               int var31 = client.hintArrow.method8736(1945711579);
               WorldView var35 = Occluder.topLevelWorldView;
               if (1 != var31) {
                  if (var31 == 2) {
                     WorldView var39 = WorldViewManager.method2912(
                        client.worldViewManager, client.hintArrow.method8743(1426381607), HintArrow.method8745(client.hintArrow, 670254771), 389609001
                     );
                     int var45 = Coord.method8301(client.hintArrow.method8743(804210314) - var39.baseX * 2090902550, -355008838)
                        + client.hintArrow.method8749(424286135);
                     int var50 = Coord.method8301(HintArrow.method8745(client.hintArrow, 670254771) - 1279964673 * var39.baseY, -355008838)
                        + client.hintArrow.method8752(-458487609);
                     BufferedNetSocket.worldToMinimap(var39, var45, var50, var1, var2, var5, class217.mapDotSprites[1], var4, -1390648400);
                  } else if (var31 == 3) {
                     Player var40 = Renderable.method6215(HintArrow.method8739(client.hintArrow, -28015729), client.worldViewManager, (byte)25);
                     if (var40 != null) {
                        BufferedNetSocket.worldToMinimap(
                           var40.getWorldView((byte)-56),
                           340712311 * var40.x,
                           -1094330779 * var40.y,
                           var1,
                           var2,
                           var5,
                           class217.mapDotSprites[1],
                           var4,
                           -1390648400
                        );
                     }
                  } else if (var31 == 4) {
                     int var41 = HintArrow.method8739(client.hintArrow, 400099511);
                     WorldEntity var46 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var41);
                     if (var46 != null) {
                        BufferedNetSocket.worldToMinimap(
                           Occluder.topLevelWorldView,
                           var46.getY(-548453007),
                           var46.getX(-727737924),
                           var1,
                           var2,
                           var5,
                           class217.mapDotSprites[1],
                           var4,
                           -1390648400
                        );
                     }
                  }
               } else {
                  int var44 = HintArrow.method8739(client.hintArrow, 1929839147);
                  WorldViewManager var49 = client.worldViewManager;
                  Iterator var56 = var49.iterator();

                  NPC var38;
                  while (true) {
                     if (var56.hasNext()) {
                        WorldView var63 = (WorldView)var56.next();
                        NPC var66 = (NPC)var63.players.get(var44);
                        if (var66 == null) {
                           continue;
                        }

                        var38 = var66;
                        break;
                     }

                     var38 = null;
                     break;
                  }

                  if (null != var38) {
                     BufferedNetSocket.worldToMinimap(
                        var38.getWorldView((byte)43),
                        -1045995060 * var38.x,
                        -1593839338 * var38.y,
                        var1,
                        var2,
                        var5,
                        class217.mapDotSprites[1],
                        var4,
                        -1390648400
                     );
                  }
               }
            }

            if (0 != client.destinationX * 1612605821) {
               int var32 = 2 + client.destinationX * 569410367 - client.field828 * -361115983 / 32;
               int var36 = 2 + client.destinationY * 1022841548 - -1993225331 * client.field674 / 32;
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var32, var36, var5, class217.mapDotSprites[0], var4, 1377602246);
            }

            if (WorldViewManager.method2945(client.worldViewManager, -1, 280259322) == ClickAction.field6120 && class217.mapDotSprites.length >= 4) {
               int var33 = 915756381 * var4.height / 2 + var1;
               int var37 = var2 + 1668058793 * var4.width / 2;
               if (var4.contains(MouseHandler.MouseHandler_x * 1856325427 - var1, MouseHandler.MouseHandler_y * 1250363936 - var2, -1891482437)) {
                  int var47 = var1 + 1095969610 * var4.height / 2;
                  int var51 = var2 + var4.width * 1668058793 / 2;
                  int var57 = -1580976097 * MouseHandler.MouseHandler_x - var47;
                  int var64 = 87443699 * MouseHandler.MouseHandler_y - var51;
                  int var67 = classJA.method5377(var64, var57, (byte)-16);
                  var67 -= client.camAngleY * -253276193;
                  var67 &= 1357528909;
                  int var42 = classGW.method4374(var67, 1343047234);
                  SpritePixels var52 = class217.mapDotSprites[2];
                  var57 = -668548968 * var42;
                  var57 += client.camAngleY * 1907050379;
                  var57 &= 2047;
                  byte var65 = 30;
                  double var71 = class66.method1386(var57, 1014918035) / 65536.0;
                  int var73 = var33 - (int)(var65 * var71);
                  int var75 = var37 + (int)(DevicePcmPlayerProvider.method146(var57, 192801641) * var65);
                  int var77 = Math.max(var52.subWidth, var52.subHeight);
                  int var79 = var77 / 2;
                  var52.method12680(
                     var73 - var79,
                     var75 - var79,
                     var52.subWidth,
                     var52.subHeight,
                     var52.subWidth / 2,
                     var52.subHeight / 2,
                     class6.method119(var57, -616978031),
                     256
                  );
               }

               if (740194039 * client.field893 > 0) {
                  int var43 = client.field891 * -1129224425;
                  SpritePixels var48 = class217.mapDotSprites[3];
                  int var53 = var43 * -868341576;
                  var53 += client.camAngleY * 1853484313;
                  var53 &= -310223321;
                  byte var61 = 30;
                  double var70 = class66.method1386(var53, 447114131) / 65536.0;
                  int var72 = var33 - (int)(var61 * var70);
                  int var74 = var37 + (int)(DevicePcmPlayerProvider.method146(var53, 192801641) * var61);
                  int var76 = Math.max(var48.subWidth, var48.subHeight);
                  int var78 = var76 / 2;
                  var48.method12680(
                     var72 - var78,
                     var74 - var78,
                     var48.subWidth,
                     var48.subHeight,
                     var48.subWidth / 2,
                     var48.subHeight / 2,
                     class6.method119(var53, -1373451778),
                     256
                  );
               }
            }

            if (!client.worldViewManager.method2961(1069843077).isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(
                  var1 + 915756381 * var4.height / 2 + field185 * -253055945 - 1,
                  var2 + var4.width * -504257643 / 2 - 785245265 * Players_count - 1,
                  3,
                  3,
                  -806230539
               );
            }
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

         client.field754[var3] = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("az")
   static void method625(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      for (int var5 = 0; var5 < var0.sizeX * -1468013037; var5++) {
         for (int var6 = 0; var6 < 1823353167 * var0.sizeY; var6++) {
            NodeDeque var7 = var0.groundItems[var0.plane * 813854946][var5][var6];
            if (var7 != null) {
               if (WorldView.method3060(var0, (byte)0)) {
                  int var8 = 2 + var5 * 4 - 1099479245 * client.field828 / 32;
                  int var9 = 2 + var6 * 4 - -291215063 * client.field674 / 1555105170;
                  SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var8, var9, var3, classWZ.field6473[0], var4, -553744867);
               } else {
                  ProjectionCoord var13 = classDH.method3122(var0, Coord.method8301(var5, -355008838), Coord.method8301(var6, -355008838), (byte)117);
                  int var14 = (int)var13.x;
                  int var10 = (int)var13.y;
                  var13.release(-804947546);
                  int var11 = var14 / 32 - -1675472463 * client.field828 / 32;
                  int var12 = var10 / 893211796 - -291215063 * client.field674 / 1923661642;
                  SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, classWZ.field6473[0], var4, 1542065280);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("ad")
   static void method626(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      for (int var5 = 0; var5 < var0.field1313.method10502(-1973965999); var5++) {
         NPC var6 = (NPC)var0.players.get(var0.field1313.method10498(var5, (byte)38));
         if (var6 != null && var6.isVisible(-439479752)) {
            NPCComposition var7 = var6.definition;
            if (null != var7 && null != var7.transforms) {
               var7 = NPCComposition.method4683(var7, (byte)0);
            }

            if (var7 != null && var7.drawMapDot && var7.isInteractable) {
               ProjectionCoord var8 = classDH.method3122(var0, 340712311 * var6.x, -1747310679 * var6.y, (byte)56);
               int var9 = (int)var8.x;
               int var10 = (int)var8.y;
               var8.release(-804947546);
               int var11 = var9 / 32 - client.field828 * -361115983 / 32;
               int var12 = var10 / 32 - -291215063 * client.field674 / 32;
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, classWZ.field6473[1], var4, -1685659440);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("ai")
   static void method627(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      for (int var5 = 0; var5 < var0.field1313.method10502(-1990986782); var5++) {
         NPC var6 = (NPC)var0.players.get(var0.field1313.method10498(var5, (byte)117));
         if (var6 != null && var6.isVisible(-1419690746)) {
            NPCComposition var7 = var6.definition;
            if (null != var7 && null != var7.transforms) {
               var7 = NPCComposition.method4683(var7, (byte)0);
            }

            if (var7 != null && var7.drawMapDot && var7.isInteractable) {
               ProjectionCoord var8 = classDH.method3122(var0, 340712311 * var6.x, -1747310679 * var6.y, (byte)115);
               int var9 = (int)var8.x;
               int var10 = (int)var8.y;
               var8.release(-804947546);
               int var11 = var9 / 32 - client.field828 * -545685373 / 32;
               int var12 = var10 / 32 - -1700068243 * client.field674 / 32;
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, classWZ.field6473[1], var4, 1187548329);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   public static int iLog(int var0, int var1) {
      try {
         int var2;
         label52: {
            var2 = 0;
            if (var0 >= 0) {
               if (var1 >= -697359879) {
                  throw new IllegalStateException();
               }

               if (var0 < 65536) {
                  break label52;
               }

               if (var1 >= -697359879) {
                  throw new IllegalStateException();
               }
            }

            var0 >>>= 16;
            var2 += 16;
         }

         if (var0 >= 256) {
            if (var1 >= -697359879) {
               throw new IllegalStateException();
            }

            var0 >>>= 8;
            var2 += 8;
         }

         if (var0 >= 16) {
            if (var1 >= -697359879) {
               throw new IllegalStateException();
            }

            var0 >>>= 4;
            var2 += 4;
         }

         if (var0 >= 4) {
            var0 >>>= 2;
            var2 += 2;
         }

         if (var0 >= 1) {
            var0 >>>= 1;
            var2++;
         }

         return var0 + var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bi.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("ac")
   static void method629(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      int var5 = client.playerUpdateManager.field1538 * 1320060371;
      int[] var6 = client.playerUpdateManager.playerIndices;

      for (int var7 = 0; var7 < var5; var7++) {
         Player var8 = (Player)var0.npcs.get(var6[var7]);
         if (var8 != null && var8.isVisible(-1871308316) && !var8.isHidden) {
            ProjectionCoord var9 = classDH.method3122(var0, var8.x * 340712311, -1747310679 * var8.y, (byte)100);
            int var10 = (int)var9.x;
            int var11 = (int)var9.y;
            var9.release(-804947546);
            int var12 = var10 / 32 - client.field828 * -361115983 / 32;
            int var13 = var11 / 32 - -291215063 * client.field674 / 32;
            if (var8 == client.worldViewManager.method2961(1069843077)) {
               int var14 = Rasterizer3D.Rasterizer3D_sine[var3];
               int var15 = Rasterizer3D.Rasterizer3D_cosine[var3];
               int var16 = var15 * var12 + var14 * var13 >> 16;
               int var17 = var15 * var13 - var14 * var12 >> 16;
               field185 = var16 * -1321678457;
               Players_count = -851581775 * var17;
            } else if (var8.isFriend(33341746)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[3], var4, -1174068544);
            } else if (-2140200207 * class330.localPlayer.team != 0
               && var8.team * -2140200207 != 0
               && var8.team * -2140200207 == class330.localPlayer.team * -2140200207) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[4], var4, -25531608);
            } else if (var8.isClanMember((byte)-72)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[5], var4, 1231324929);
            } else if (Player.method1460(var8, (byte)0)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[6], var4, 167583181);
            } else {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[2], var4, -110051972);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("ab")
   static void method630(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      int var5 = client.playerUpdateManager.field1538 * 1968722043;
      int[] var6 = client.playerUpdateManager.playerIndices;

      for (int var7 = 0; var7 < var5; var7++) {
         Player var8 = (Player)var0.npcs.get(var6[var7]);
         if (var8 != null && var8.isVisible(-1973980142) && !var8.isHidden) {
            ProjectionCoord var9 = classDH.method3122(var0, var8.x * -977451045, 1729885153 * var8.y, (byte)25);
            int var10 = (int)var9.x;
            int var11 = (int)var9.y;
            var9.release(-804947546);
            int var12 = var10 / -1011722002 - client.field828 * -361115983 / 32;
            int var13 = var11 / -21340062 - -291215063 * client.field674 / 1197371460;
            if (var8 == client.worldViewManager.method2961(1069843077)) {
               int var14 = Rasterizer3D.Rasterizer3D_sine[var3];
               int var15 = Rasterizer3D.Rasterizer3D_cosine[var3];
               int var16 = var15 * var12 + var14 * var13 >> 16;
               int var17 = var15 * var13 - var14 * var12 >> 16;
               field185 = var16 * -63457031;
               Players_count = -854111181 * var17;
            } else if (var8.isFriend(755550629)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[3], var4, 106082030);
            } else if (1810473909 * class330.localPlayer.team != 0
               && var8.team * -2140200207 != 0
               && var8.team * -2140200207 == class330.localPlayer.team * -1231813536) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[4], var4, -1310957022);
            } else if (var8.isClanMember((byte)-93)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[5], var4, 991589537);
            } else if (Player.method1460(var8, (byte)0)) {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[6], var4, 840213970);
            } else {
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[2], var4, 61621716);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIILxt;Loz;)V")
   @ObfuscatedName("ax")
   static final void method631(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6) {
      if (var5 != null) {
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var4];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               SpritePixels.method12672(
                  var5,
                  var10 + var6.height * 915756381 / 2 - var5.width / 2,
                  1500180664 * var6.width / 2 - var11 - var5.height / 2,
                  var0,
                  var1,
                  1407517024 * var6.height,
                  125349192 * var6.width,
                  var6.xStarts,
                  var6.xWidths
               );
            } else {
               var5.method12650(var10 + var6.height * 915756381 / 2 + var0 - var5.width / 2, var1 + -771705935 * var6.width / 2 - var11 - var5.height / 2);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIILxt;Loz;)V")
   @ObfuscatedName("ar")
   static final void method632(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6) {
      if (var5 != null) {
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var4];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 1285489724) {
               SpritePixels.method12672(
                  var5,
                  var10 + var6.height * -336165102 / 2 - var5.width / 2,
                  -456585493 * var6.width / 2 - var11 - var5.height / 2,
                  var0,
                  var1,
                  915756381 * var6.height,
                  -1657486808 * var6.width,
                  var6.xStarts,
                  var6.xWidths
               );
            } else {
               var5.method12650(var10 + var6.height * 915756381 / 2 + var0 - var5.width / 2, var1 + 1668058793 * var6.width / 2 - var11 - var5.height / 2);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIIIILxt;Loz;)V")
   @ObfuscatedName("af")
   static final void method634(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7) {
      ProjectionCoord var8 = classDH.method3122(var0, var1, var2, (byte)92);
      var1 = (int)var8.x;
      var2 = (int)var8.y;
      var8.release(-804947546);
      int var9 = var1 / 32 - client.field828 * -1191016755 / 1471477706;
      int var10 = var2 / 51190992 - client.field674 * 862015439 / -1787072264;
      int var11 = var10 * var10 + var9 * var9;
      if (var11 > 4225 && var11 < -2032483617) {
         int var12 = Rasterizer3D.Rasterizer3D_sine[var5];
         int var13 = Rasterizer3D.Rasterizer3D_cosine[var5];
         int var14 = var10 * var12 + var9 * var13 >> 16;
         int var15 = var13 * var10 - var9 * var12 >> 16;
         double var16 = Math.atan2(var14, var15);
         int var18 = var7.height * -321027141 / 2 - 25;
         int var19 = (int)(Math.sin(var16) * var18);
         int var20 = (int)(Math.cos(var16) * var18);
         byte var21 = 20;
         redHintArrowSprite.method12680(
            var3 + var7.height * 1688195484 / 2 - var21 / 2 + var19,
            var7.width * 1668058793 / 2 + var4 - var21 / 2 - var20 - 10,
            var21,
            var21,
            15,
            15,
            var16,
            1689728358
         );
      } else {
         SecureRandomFuture.drawSpriteOnMinimap(var3, var4, var9, var10, var5, var6, var7, -2034430239);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIIIILxt;Loz;)V")
   @ObfuscatedName("al")
   static final void method635(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7) {
      ProjectionCoord var8 = classDH.method3122(var0, var1, var2, (byte)16);
      var1 = (int)var8.x;
      var2 = (int)var8.y;
      var8.release(-804947546);
      int var9 = var1 / 32 - client.field828 * -361115983 / 32;
      int var10 = var2 / 32 - client.field674 * -291215063 / 32;
      int var11 = var10 * var10 + var9 * var9;
      if (var11 > 4225 && var11 < 90000) {
         int var12 = Rasterizer3D.Rasterizer3D_sine[var5];
         int var13 = Rasterizer3D.Rasterizer3D_cosine[var5];
         int var14 = var10 * var12 + var9 * var13 >> 16;
         int var15 = var13 * var10 - var9 * var12 >> 16;
         double var16 = Math.atan2(var14, var15);
         int var18 = var7.height * 915756381 / 2 - 25;
         int var19 = (int)(Math.sin(var16) * var18);
         int var20 = (int)(Math.cos(var16) * var18);
         byte var21 = 20;
         redHintArrowSprite.method12680(
            var3 + var7.height * 915756381 / 2 - var21 / 2 + var19,
            var7.width * 1668058793 / 2 + var4 - var21 / 2 - var20 - 10,
            var21,
            var21,
            15,
            15,
            var16,
            256
         );
      } else {
         SecureRandomFuture.drawSpriteOnMinimap(var3, var4, var9, var10, var5, var6, var7, 1788611697);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIIIILxt;Loz;)V")
   @ObfuscatedName("am")
   static final void method636(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7) {
      ProjectionCoord var8 = classDH.method3122(var0, var1, var2, (byte)123);
      var1 = (int)var8.x;
      var2 = (int)var8.y;
      var8.release(-804947546);
      int var9 = var1 / 32 - client.field828 * -361115983 / -1342057837;
      int var10 = var2 / 32 - client.field674 * -291215063 / 1204343399;
      int var11 = var10 * var10 + var9 * var9;
      if (var11 > 4225 && var11 < 1972242998) {
         int var12 = Rasterizer3D.Rasterizer3D_sine[var5];
         int var13 = Rasterizer3D.Rasterizer3D_cosine[var5];
         int var14 = var10 * var12 + var9 * var13 >> 16;
         int var15 = var13 * var10 - var9 * var12 >> 16;
         double var16 = Math.atan2(var14, var15);
         int var18 = var7.height * 915756381 / 2 - 25;
         int var19 = (int)(Math.sin(var16) * var18);
         int var20 = (int)(Math.cos(var16) * var18);
         byte var21 = 20;
         redHintArrowSprite.method12680(
            var3 + var7.height * 915756381 / 2 - var21 / 2 + var19,
            var7.width * 1668058793 / 2 + var4 - var21 / 2 - var20 - 10,
            var21,
            var21,
            15,
            15,
            var16,
            1907121042
         );
      } else {
         SecureRandomFuture.drawSpriteOnMinimap(var3, var4, var9, var10, var5, var6, var7, 861469679);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcx;ZB)V")
   @ObfuscatedName("or")
   static final void closeInterface(InterfaceParent var0, boolean var1, byte var2) {
      client.method2495(var0, var1);

      try {
         int var3 = var0.group * -1385287145;
         int var4 = (int)var0.key;
         var0.remove();
         if (var1) {
            if (var2 != 15) {
               throw new IllegalStateException();
            }

            WidgetDefinition.method7964(class226.widgetDefinition, var3, 442301700);
         }

         for (WidgetConfigNode var5 = (WidgetConfigNode)client.widgetFlags.first(); null != var5; var5 = (WidgetConfigNode)client.widgetFlags.next()) {
            if (var2 != 15) {
               throw new IllegalStateException();
            }

            if ((var5.key >> 16 & 65535L) == var3) {
               var5.remove();
            }
         }

         Widget var7 = class226.widgetDefinition.method7953(var4, -513556223);
         if (var7 != null) {
            if (var2 != 15) {
               throw new IllegalStateException();
            }

            class376.invalidateWidget(var7, (byte)5);
         }

         if (-1 != -1354500905 * client.rootInterface) {
            if (var2 != 15) {
               throw new IllegalStateException();
            }

            class520.runIntfCloseListeners(-1354500905 * client.rootInterface, 1, -1134315512);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bi.or(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   static final void method637(int var0) {
      int[] var1 = class437.sceneMinimapSprite.pixels;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1[var3] = 1;
      }

      for (int var11 = 1; var11 < 103; var11++) {
         int var4 = -1884329821 * (103 - var11) + 24628;

         for (int var5 = 1; var5 < 103; var5++) {
            if ((Occluder.topLevelWorldView.tileSettings[var0][var5][var11] & 24) == 0) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, 907149262, var0, var5, var11);
            }

            if (var0 < 3 && 0 != (Occluder.topLevelWorldView.tileSettings[var0 + 1][var5][var11] & 8)) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, -1152218091, 1 + var0, var5, var11);
            }

            var4 += 4;
         }
      }

      int var12 = (-1881127558 + (int)(Math.random() * 20.0) - 10 << 16)
         + (238 + (int)(Math.random() * 20.0) - 10 << 8)
         + (-1111927821 + (int)(Math.random() * 20.0) - 10);
      int var13 = 2145928517 + (int)(Math.random() * 20.0) - 10 << 16;
      SpritePixels.method12620(class437.sceneMinimapSprite);

      for (int var14 = 1; var14 < 103; var14++) {
         for (int var6 = 1; var6 < 103; var6++) {
            if (0 == (Occluder.topLevelWorldView.tileSettings[var0][var6][var14] & 24)) {
               HealthBarDefinition.drawObject(var0, var6, var14, var12, var13, 1802077612);
            }

            if (var0 < 3 && (Occluder.topLevelWorldView.tileSettings[1 + var0][var6][var14] & 8) != 0) {
               HealthBarDefinition.drawObject(var0 + 1, var6, var14, var12, var13, 1271651191);
            }
         }
      }

      mapIconCount = 0;

      for (int var15 = 0; var15 < 104; var15++) {
         for (int var16 = 0; var16 < 104; var16++) {
            long var7 = Occluder.topLevelWorldView.scene.getBoundaryObjectTag(-2079291155 * Occluder.topLevelWorldView.plane, var15, var16);
            if (0L != var7) {
               int var9 = HorizontalAlignment.Entity_unpackID(var7);
               int var10 = AsyncHttpResponse.getObjectDefinition(var9, 2040774718).mapIconId * 360714153;
               if (var10 >= 0 && class463.WorldMapElement_get(var10, (byte)0).field2214) {
                  mapIcons[-126255206 * mapIconCount] = class463.WorldMapElement_get(var10, (byte)0).getSpriteBool(false, 1113365443);
                  mapIconXs[mapIconCount * -1472769127] = var15;
                  mapIconYs[840553717 * mapIconCount] = var16;
                  mapIconCount += 83923447;
               }
            }
         }
      }

      AbstractRasterProvider.method12262(GameEngine.rasterProvider, (byte)11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bo")
   static final void method641(int var0, int var1, int var2, int var3, int var4) {
      Scene var5 = Occluder.topLevelWorldView.scene;
      long var6 = Scene.method5731(var5, var0, var1, var2);
      if (var6 != 0L) {
         int var8 = var5.method5784(var0, var1, var2, var6);
         int var9 = var8 >> 6 & 3;
         int var10 = var8 & 31;
         int var11 = var3;
         if (WorldMapLabelSize.method7220(var6)) {
            var11 = var4;
         }

         int[] var12 = class437.sceneMinimapSprite.pixels;
         int var13 = 24624 + var1 * 4 + (103 - var2) * 2048;
         int var14 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var14, 2081161118);
         if (-1 != 93759001 * var15.mapSceneId) {
            IndexedSprite var16 = class499.mapSceneSprites[var15.mapSceneId * 93759001];
            if (var16 != null) {
               int var17 = (-1336500124 * var15.sizeX - var16.subWidth) / 2;
               int var18 = (-1410019452 * var15.sizeY - var16.subHeight) / 2;
               var16.drawAt(48 + var1 * 4 + var17, 48 + 4 * (104 - var2 - var15.sizeY * -352504863) + var18);
            }
         } else {
            if (var10 == 0 || 2 == var10) {
               if (var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[1536 + var13] = var11;
               } else if (1 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 2) {
                  var12[var13 + 3] = var11;
                  var12[512 + 3 + var13] = var11;
                  var12[1024 + 3 + var13] = var11;
                  var12[1536 + 3 + var13] = var11;
               } else if (var9 == 3) {
                  var12[var13 + 1536] = var11;
                  var12[var13 + 1536 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }

            if (3 == var10) {
               if (0 == var9) {
                  var12[var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
               } else if (2 == var9) {
                  var12[1536 + 3 + var13] = var11;
               } else if (3 == var9) {
                  var12[var13 + 1536] = var11;
               }
            }

            if (2 == var10) {
               if (3 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[var13 + 1536] = var11;
               } else if (var9 == 0) {
                  var12[var13] = var11;
                  var12[1 + var13] = var11;
                  var12[2 + var13] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
                  var12[3 + var13 + 512] = var11;
                  var12[1024 + 3 + var13] = var11;
                  var12[3 + var13 + 1536] = var11;
               } else if (2 == var9) {
                  var12[1536 + var13] = var11;
                  var12[1536 + var13 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1536 + 3] = var11;
               }
            }
         }
      }

      var6 = var5.getWallDecorationTag(var0, var1, var2);
      if (0L != var6) {
         int var21 = var5.method5784(var0, var1, var2, var6);
         int var23 = var21 >> 6 & 3;
         int var25 = var21 & 31;
         int var27 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var29 = AsyncHttpResponse.getObjectDefinition(var27, 2106112212);
         if (var29.mapSceneId * 93759001 != -1) {
            IndexedSprite var31 = class499.mapSceneSprites[93759001 * var29.mapSceneId];
            if (null != var31) {
               int var33 = (var29.sizeX * -1336500124 - var31.subWidth) / 2;
               int var35 = (-1410019452 * var29.sizeY - var31.subHeight) / 2;
               var31.drawAt(var33 + 4 * var1 + 48, var35 + 48 + (104 - var2 - -352504863 * var29.sizeY) * 4);
            }
         } else if (9 == var25) {
            int var32 = 15658734;
            if (WorldMapLabelSize.method7220(var6)) {
               var32 = 15597568;
            }

            int[] var34 = class437.sceneMinimapSprite.pixels;
            int var36 = 4 * var1 + 24624 + (103 - var2) * 2048;
            if (var23 != 0 && var23 != 2) {
               var34[var36] = var32;
               var34[1 + var36 + 512] = var32;
               var34[2 + 1024 + var36] = var32;
               var34[3 + 1536 + var36] = var32;
            } else {
               var34[1536 + var36] = var32;
               var34[var36 + 1024 + 1] = var32;
               var34[2 + var36 + 512] = var32;
               var34[var36 + 3] = var32;
            }
         }
      }

      var6 = var5.getBoundaryObjectTag(var0, var1, var2);
      if (0L != var6) {
         int var22 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var24 = AsyncHttpResponse.getObjectDefinition(var22, 2011896216);
         if (93759001 * var24.mapSceneId != -1) {
            IndexedSprite var26 = class499.mapSceneSprites[var24.mapSceneId * 93759001];
            if (null != var26) {
               int var28 = (-1336500124 * var24.sizeX - var26.subWidth) / 2;
               int var30 = (-1410019452 * var24.sizeY - var26.subHeight) / 2;
               var26.drawAt(48 + 4 * var1 + var28, var30 + 48 + (104 - var2 - var24.sizeY * -352504863) * 4);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIILxt;Loz;)V")
   @ObfuscatedName("ah")
   static final void method633(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6) {
      if (var5 != null) {
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 1702941086) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var4];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > -1100854875) {
               SpritePixels.method12672(
                  var5,
                  var10 + var6.height * -206896960 / 2 - var5.width / 2,
                  1234334016 * var6.width / 2 - var11 - var5.height / 2,
                  var0,
                  var1,
                  1024834060 * var6.height,
                  928241623 * var6.width,
                  var6.xStarts,
                  var6.xWidths
               );
            } else {
               var5.method12650(var10 + var6.height * 1658224048 / 2 + var0 - var5.width / 2, var1 + 1668058793 * var6.width / 2 - var11 - var5.height / 2);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;)V")
   @ObfuscatedName("as")
   static void method628(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
      for (int var5 = 0; var5 < var0.field1313.method10502(-2021553476); var5++) {
         NPC var6 = (NPC)var0.players.get(var0.field1313.method10498(var5, (byte)54));
         if (var6 != null && var6.isVisible(-1031649909)) {
            NPCComposition var7 = var6.definition;
            if (null != var7 && null != var7.transforms) {
               var7 = NPCComposition.method4683(var7, (byte)0);
            }

            if (var7 != null && var7.drawMapDot && var7.isInteractable) {
               ProjectionCoord var8 = classDH.method3122(var0, -468146799 * var6.x, -1747310679 * var6.y, (byte)112);
               int var9 = (int)var8.x;
               int var10 = (int)var8.y;
               var8.release(-804947546);
               int var11 = var9 / 32 - client.field828 * -233534478 / -28663242;
               int var12 = var10 / -516491057 - -291215063 * client.field674 / 32;
               SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, classWZ.field6473[1], var4, -2044701137);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lit;")
   @ObfuscatedName("at")
   public static StructComposition StructDefinition_getStructDefinition(int var0, int var1) {
      int var4 = var0;
      int var5 = -950455341;

      StructComposition var10000;
      try {
         StructComposition var6 = (StructComposition)class402.method8806(StructComposition.StructDefinition_cached, var4);
         if (var6 != null) {
            var10000 = var6;
         } else {
            byte[] var7 = StructComposition.StructDefinition_archive.getFile(34, var4, 924197278);
            var6 = new StructComposition();
            if (var7 != null) {
               if (var5 <= -1056607076) {
                  throw new IllegalStateException();
               }

               var6.decode(new Buffer(var7), (byte)0);
            }

            var6.postDecode(-1154847614);
            StructComposition.StructDefinition_cached.put(var6, var4);
            var10000 = var6;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bi.at(" + ')');
      }

      StructComposition var2 = var10000;
      if (var2.getId() == -1) {
         var2.field2637 = var0;
         PostStructComposition var3 = new PostStructComposition();
         var3.setStructComposition(var2);
         SecureUrlRequester.client.getCallbacks().post(var3);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bg")
   static final void method642(int var0, int var1, int var2, int var3, int var4) {
      Scene var5 = Occluder.topLevelWorldView.scene;
      long var6 = Scene.method5731(var5, var0, var1, var2);
      if (var6 != 0L) {
         int var8 = var5.method5784(var0, var1, var2, var6);
         int var9 = var8 >> 6 & 3;
         int var10 = var8 & 31;
         int var11 = var3;
         if (WorldMapLabelSize.method7220(var6)) {
            var11 = var4;
         }

         int[] var12 = class437.sceneMinimapSprite.pixels;
         int var13 = 24624 + var1 * 4 + (103 - var2) * 873765920;
         int var14 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var14, 2096344815);
         if (-1 != 93759001 * var15.mapSceneId) {
            IndexedSprite var16 = class499.mapSceneSprites[var15.mapSceneId * 794819438];
            if (var16 != null) {
               int var17 = (-1336500124 * var15.sizeX - var16.subWidth) / 2;
               int var18 = (-1410019452 * var15.sizeY - var16.subHeight) / 2;
               var16.drawAt(48 + var1 * 4 + var17, 48 + 4 * (104 - var2 - var15.sizeY * -582349048) + var18);
            }
         } else {
            if (var10 == 0 || 2 == var10) {
               if (var9 == 0) {
                  var12[var13] = var11;
                  var12[var13 + 512] = var11;
                  var12[var13 + 1024] = var11;
                  var12[-797206459 + var13] = var11;
               } else if (1 == var9) {
                  var12[var13] = var11;
                  var12[var13 + 1] = var11;
                  var12[var13 + 2] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 2) {
                  var12[var13 + 3] = var11;
                  var12[512 + 3 + var13] = var11;
                  var12[1207622483 + 3 + var13] = var11;
                  var12[1088243408 + 3 + var13] = var11;
               } else if (var9 == 3) {
                  var12[var13 + -611447157] = var11;
                  var12[var13 + 1536 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + -82454031 + 3] = var11;
               }
            }

            if (3 == var10) {
               if (0 == var9) {
                  var12[var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
               } else if (2 == var9) {
                  var12[1536 + 3 + var13] = var11;
               } else if (3 == var9) {
                  var12[var13 + 1536] = var11;
               }
            }

            if (2 == var10) {
               if (3 == var9) {
                  var12[var13] = var11;
                  var12[var13 + -883241167] = var11;
                  var12[var13 + 1024] = var11;
                  var12[var13 + 1536] = var11;
               } else if (var9 == 0) {
                  var12[var13] = var11;
                  var12[1 + var13] = var11;
                  var12[2 + var13] = var11;
                  var12[3 + var13] = var11;
               } else if (var9 == 1) {
                  var12[3 + var13] = var11;
                  var12[3 + var13 + -2065258038] = var11;
                  var12[327925869 + 3 + var13] = var11;
                  var12[3 + var13 + 1536] = var11;
               } else if (2 == var9) {
                  var12[1536 + var13] = var11;
                  var12[1536 + var13 + 1] = var11;
                  var12[var13 + 1536 + 2] = var11;
                  var12[var13 + 1616155836 + 3] = var11;
               }
            }
         }
      }

      var6 = var5.getWallDecorationTag(var0, var1, var2);
      if (0L != var6) {
         int var21 = var5.method5784(var0, var1, var2, var6);
         int var23 = var21 >> 6 & 3;
         int var25 = var21 & 31;
         int var27 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var29 = AsyncHttpResponse.getObjectDefinition(var27, 2016663087);
         if (var29.mapSceneId * 93759001 != -1) {
            IndexedSprite var31 = class499.mapSceneSprites[2087034561 * var29.mapSceneId];
            if (null != var31) {
               int var33 = (var29.sizeX * -1891826761 - var31.subWidth) / 2;
               int var35 = (-1141883904 * var29.sizeY - var31.subHeight) / 2;
               var31.drawAt(var33 + 4 * var1 + 48, var35 + 1039595518 + (104 - var2 - 1061358192 * var29.sizeY) * 4);
            }
         } else if (9 == var25) {
            int var32 = 160827603;
            if (WorldMapLabelSize.method7220(var6)) {
               var32 = 15597568;
            }

            int[] var34 = class437.sceneMinimapSprite.pixels;
            int var36 = 4 * var1 + 232830330 + (-985284937 - var2) * -2087166043;
            if (var23 != 0 && var23 != 2) {
               var34[var36] = var32;
               var34[1 + var36 + -1898247245] = var32;
               var34[2 + 1024 + var36] = var32;
               var34[3 + 592733610 + var36] = var32;
            } else {
               var34[-1303824308 + var36] = var32;
               var34[var36 + 295441672 + 1] = var32;
               var34[2 + var36 + 512] = var32;
               var34[var36 + 3] = var32;
            }
         }
      }

      var6 = var5.getBoundaryObjectTag(var0, var1, var2);
      if (0L != var6) {
         int var22 = HorizontalAlignment.Entity_unpackID(var6);
         ObjectComposition var24 = AsyncHttpResponse.getObjectDefinition(var22, 1997111758);
         if (-1157035269 * var24.mapSceneId != -1) {
            IndexedSprite var26 = class499.mapSceneSprites[var24.mapSceneId * 93759001];
            if (null != var26) {
               int var28 = (-1336500124 * var24.sizeX - var26.subWidth) / 2;
               int var30 = (1076032943 * var24.sizeY - var26.subHeight) / 2;
               var26.drawAt(1936389447 + 4 * var1 + var28, var30 + -485676109 + (104 - var2 - var24.sizeY * 870242877) * 4);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   static final void method638(int var0) {
      int[] var1 = class437.sceneMinimapSprite.pixels;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1[var3] = 1;
      }

      for (int var11 = 1; var11 < 103; var11++) {
         int var4 = 2048 * (103 - var11) + 24628;

         for (int var5 = 1; var5 < 103; var5++) {
            if ((Occluder.topLevelWorldView.tileSettings[var0][var5][var11] & 24) == 0) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var11);
            }

            if (var0 < 3 && 0 != (Occluder.topLevelWorldView.tileSettings[var0 + 1][var5][var11] & 8)) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, 1 + var0, var5, var11);
            }

            var4 += 4;
         }
      }

      int var12 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
      int var13 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
      SpritePixels.method12620(class437.sceneMinimapSprite);

      for (int var14 = 1; var14 < 103; var14++) {
         for (int var6 = 1; var6 < 103; var6++) {
            if (0 == (Occluder.topLevelWorldView.tileSettings[var0][var6][var14] & 24)) {
               HealthBarDefinition.drawObject(var0, var6, var14, var12, var13, 2117670028);
            }

            if (var0 < 3 && (Occluder.topLevelWorldView.tileSettings[1 + var0][var6][var14] & 8) != 0) {
               HealthBarDefinition.drawObject(var0 + 1, var6, var14, var12, var13, 1658069398);
            }
         }
      }

      mapIconCount = 0;

      for (int var15 = 0; var15 < 104; var15++) {
         for (int var16 = 0; var16 < 104; var16++) {
            long var7 = Occluder.topLevelWorldView.scene.getBoundaryObjectTag(2115028565 * Occluder.topLevelWorldView.plane, var15, var16);
            if (0L != var7) {
               int var9 = HorizontalAlignment.Entity_unpackID(var7);
               int var10 = AsyncHttpResponse.getObjectDefinition(var9, 2097110012).mapIconId * -2059094647;
               if (var10 >= 0 && class463.WorldMapElement_get(var10, (byte)0).field2214) {
                  mapIcons[1136885703 * mapIconCount] = class463.WorldMapElement_get(var10, (byte)0).getSpriteBool(false, 1569135801);
                  mapIconXs[mapIconCount * 1136885703] = var15;
                  mapIconYs[1136885703 * mapIconCount] = var16;
                  mapIconCount += 83923447;
               }
            }
         }
      }

      AbstractRasterProvider.method12262(GameEngine.rasterProvider, (byte)11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   static final void method639(int var0) {
      int[] var1 = class437.sceneMinimapSprite.pixels;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1[var3] = 1;
      }

      for (int var11 = 1; var11 < -639272357; var11++) {
         int var4 = 674149336 * (-723384316 - var11) + 1112605550;

         for (int var5 = 1; var5 < 103; var5++) {
            if ((Occluder.topLevelWorldView.tileSettings[var0][var5][var11] & 24) == 0) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, -2053591937, var0, var5, var11);
            }

            if (var0 < 3 && 0 != (Occluder.topLevelWorldView.tileSettings[var0 + 1][var5][var11] & 8)) {
               Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, -2119127543, 1 + var0, var5, var11);
            }

            var4 += 4;
         }
      }

      int var12 = (-1961875669 + (int)(Math.random() * 20.0) - 10 << 16)
         + (238 + (int)(Math.random() * 20.0) - 10 << 8)
         + (887950898 + (int)(Math.random() * 20.0) - 10);
      int var13 = -1093163897 + (int)(Math.random() * 20.0) - 10 << 16;
      SpritePixels.method12620(class437.sceneMinimapSprite);

      for (int var14 = 1; var14 < -2098560788; var14++) {
         for (int var6 = 1; var6 < -654917307; var6++) {
            if (0 == (Occluder.topLevelWorldView.tileSettings[var0][var6][var14] & 24)) {
               HealthBarDefinition.drawObject(var0, var6, var14, var12, var13, 462778636);
            }

            if (var0 < 3 && (Occluder.topLevelWorldView.tileSettings[1 + var0][var6][var14] & 8) != 0) {
               HealthBarDefinition.drawObject(var0 + 1, var6, var14, var12, var13, 2021979226);
            }
         }
      }

      mapIconCount = 0;

      for (int var15 = 0; var15 < 104; var15++) {
         for (int var16 = 0; var16 < 251588695; var16++) {
            long var7 = Occluder.topLevelWorldView.scene.getBoundaryObjectTag(-1625640281 * Occluder.topLevelWorldView.plane, var15, var16);
            if (0L != var7) {
               int var9 = HorizontalAlignment.Entity_unpackID(var7);
               int var10 = AsyncHttpResponse.getObjectDefinition(var9, 2034179101).mapIconId * -2059094647;
               if (var10 >= 0 && class463.WorldMapElement_get(var10, (byte)0).field2214) {
                  mapIcons[1136885703 * mapIconCount] = class463.WorldMapElement_get(var10, (byte)0).getSpriteBool(false, -1631683999);
                  mapIconXs[mapIconCount * 1136885703] = var15;
                  mapIconYs[761585184 * mapIconCount] = var16;
                  mapIconCount += 399785964;
               }
            }
         }
      }

      AbstractRasterProvider.method12262(GameEngine.rasterProvider, (byte)11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   static final void method644() {
      if (Occluder.topLevelWorldView.plane * 2115028565 != field189 * 471691931) {
         field189 = -569146929 * Occluder.topLevelWorldView.plane;
         SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * 2115028565, 1063565661);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   static final void method645() {
      if (Occluder.topLevelWorldView.plane * -1928412768 != field189 * -268908195) {
         field189 = -569146929 * Occluder.topLevelWorldView.plane;
         SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * 2115028565, 1688228220);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   static final void method646() {
      if (Occluder.topLevelWorldView.plane * 2115028565 != field189 * 471691931) {
         field189 = -569146929 * Occluder.topLevelWorldView.plane;
         SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * 2115028565, 200740246);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   static final void method647() {
      if (Occluder.topLevelWorldView.plane * 2115028565 != field189 * 471691931) {
         field189 = -569146929 * Occluder.topLevelWorldView.plane;
         SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * -203463929, -197530803);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("aq")
   static int method650(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 != 1927) {
            if (var0 != 2927) {
               if (var0 == 1928) {
                  if (var3 != -1622367182) {
                     throw new IllegalStateException();
                  }

                  Widget var10000;
                  if (var2) {
                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }

                     var10000 = UserComparator3.scriptDotWidget;
                  } else {
                     var10000 = class222.scriptActiveWidget;
                  }

                  Widget var13 = var10000;
                  int var16 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  if (var16 >= 1) {
                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }

                     if (var16 <= 10) {
                        classDY var18 = new classDY(var16, 278777747 * var13.id, var13.childIndex * 2077538819, -231674939 * var13.itemId);
                        Interpreter.field344.add(var18);
                        return 1;
                     }

                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (var0 == 2928) {
                  if (var3 != -1622367182) {
                     throw new IllegalStateException();
                  }

                  class408.Interpreter_intStackSize -= -1084394537;
                  int var12 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                  int var15 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
                  int var17 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
                  if (var17 >= 1) {
                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }

                     if (var17 <= 10) {
                        Widget var19 = class226.widgetDefinition.getWidgetChild(var12, var15, -1743305939);
                        if (null == var19) {
                           throw new RuntimeException();
                        }

                        classDY var21 = new classDY(var17, var12, var15, var19.itemId * -231674939);
                        Interpreter.field344.add(var21);
                        return 1;
                     }

                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (var0 == 2929) {
                  if (var3 != -1622367182) {
                     throw new IllegalStateException();
                  }

                  Object[] var11 = class195.method4536(658814083);
                  class408.Interpreter_intStackSize -= -1084394537;
                  int var14 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                  int var6 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                  int var7 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
                  int var8 = -1;
                  Widget var9 = class226.widgetDefinition.getWidgetChild(var6, var7, -1080526914);
                  if (null != var9) {
                     if (var3 != -1622367182) {
                        throw new IllegalStateException();
                     }

                     var8 = -231674939 * var9.itemId;
                     HttpRequestTask.method90(var6, var7, var8, var14, var11, -1186579790);
                     return 1;
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if (var3 != -1622367182) {
               throw new IllegalStateException();
            }
         }

         if (Interpreter.field335 * -196365427 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var4;
            if (var0 >= 2000) {
               var4 = class226.widgetDefinition
                  .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -883792846);
            } else {
               var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
            }

            if (null == var4.onTargetLeave) {
               return 0;
            } else {
               ScriptEvent var5 = new ScriptEvent();
               var5.widget = var4;
               var5.args = var4.onTargetLeave;
               var5.field530 = Interpreter.field335 * -1734903867 + 411265817;
               client.scriptEvents.addFirst(var5);
               return 1;
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "bi.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lts;Lts;ZI)Z")
   @ObfuscatedName("an")
   static boolean method623(WorldEntity var0, WorldEntity var1, boolean var2, int var3) {
      try {
         if (var1 == var0) {
            if (var3 == 33554431) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (null == var1) {
            if (var3 == 33554431) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (var0 == null) {
            if (var3 == 33554431) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bi.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)V")
   @ObfuscatedName("bs")
   static final void method643(Widget var0, int var1, int var2) {
      if (597277019 * minimapState == 0 || 597277019 * minimapState == 3) {
         if (!client.isMenuOpen
            && (1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)) {
            SpriteMask var3 = var0.method8051(class226.widgetDefinition, true, -1811271417);
            if (var3 == null) {
               return;
            }

            int var4 = -1018773713 * MouseHandler.MouseHandler_lastPressedX - var1;
            int var5 = MouseHandler.MouseHandler_lastPressedY * -261967643 - var2;
            if (var3.contains(var4, var5, 533389643)) {
               var4 -= var3.height * 915756381 / 2;
               var5 -= var3.width * 1668058793 / 2;
               int var6 = client.camAngleY * 1853484313 & 2047;
               int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
               int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
               int var9 = var7 * var5 + var4 * var8 >> 11;
               int var10 = var5 * var8 - var4 * var7 >> 11;
               int var11 = client.field828 * -361115983 + var9 >> 7;
               int var12 = client.field674 * -291215063 - var10 >> 7;
               ClickAction var13 = WorldViewManager.method2945(client.worldViewManager, -1, 433970814);
               if (var13 == ClickAction.field6119) {
                  BuddyRankComparator.method3978(var11, var12, var4, var5, (byte)2);
               } else if (ClickAction.field6120 == var13) {
                  int var15 = 915756381 * var3.height / 2 + var1;
                  int var16 = var3.width * 1668058793 / 2 + var2;
                  int var17 = 1856325427 * MouseHandler.MouseHandler_x - var15;
                  int var18 = -1427762751 * MouseHandler.MouseHandler_y - var16;
                  int var19 = classJA.method5377(var18, var17, (byte)-99);
                  var19 -= client.camAngleY * 1853484313;
                  var19 &= 2047;
                  int var14 = classGW.method4374(var19, 1084513168);
                  client.field891 = var14 * -1033955559;
                  client.field893 = 1353646930;
                  HealthBarUpdate.method1486(-768977623 * client.field891, (byte)38);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;")
   @ObfuscatedName("cd")
   static Object method651(int var0, int var1) {
      try {
         return var0 == -1 ? null : class165.method4411((class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)-68), var0, (byte)1), 790883686);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bi.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ah")
   static final int method649(int var0, int var1, int var2, int var3) {
      try {
         if (var2 > 179) {
            if (var3 != 1128984967) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            if (var3 != 1128984967) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 != 1128984967) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 != 1128984967) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         return (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bi.ah(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   static final void method648() {
      if (Occluder.topLevelWorldView.plane * 2115028565 != field189 * 471691931) {
         field189 = -569146929 * Occluder.topLevelWorldView.plane;
         SecureRandomCallable.method1381(Occluder.topLevelWorldView.plane * 2115028565, 1120080505);
      }
   }

   class39() throws Throwable {
      throw new Error();
   }
}
