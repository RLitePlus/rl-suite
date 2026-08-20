import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lc")
public class WorldMapRegion implements net.runelite.api.worldmap.WorldMapRegion {
   @ObfuscatedSignature(descriptor = "Lld;")
   @ObfuscatedName("ap")
   WorldMapData_0 worldMapData_0;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field3635 = 256;
   @ObfuscatedName("ai")
   HashMap iconMap;
   @ObfuscatedName("aj")
   final HashMap fonts;
   @ObfuscatedName("au")
   int backgroundColor;
   @ObfuscatedName("az")
   int pixelsPerTile;
   @ObfuscatedSignature(descriptor = "Lmg;")
   @ObfuscatedName("ae")
   public static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("ay")
   LinkedList worldMapData1List;
   @ObfuscatedName("aw")
   int regionY;
   @ObfuscatedName("ak")
   int regionX;
   @ObfuscatedName("ad")
   List icon0List;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3636 = -3355444;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field3634 = 23;

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.backgroundColor = -674297633 * var1;
      this.pixelsPerTile = -128936329 * var2;
      this.worldMapData1List = new LinkedList();
      this.icon0List = new LinkedList();
      this.iconMap = new HashMap();
      this.regionY = -879584629 * (var3 | 0xFF000000);
      this.fonts = var4;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("ag")
   void method6993(int var1, int var2, int var3, byte var4) {
      try {
         int var6 = 1250341663 * this.backgroundColor;
         int var7 = this.pixelsPerTile * -863231161;
         int var8 = this.regionX * -631149707;
         DemotingHashTable var9 = WorldMapRegion_cachedSprites;
         long var10 = var8 << 16 | var6 << 8 | var7;
         SpritePixels var5 = (SpritePixels)var9.get(var10);
         if (null == var5) {
            if (var4 >= 3) {
               throw new IllegalStateException();
            }
         } else {
            if (-1738875584 * this.regionX == var3) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               var5.method12647(var1, var2);
            } else {
               var5.drawScaledWorldmap(var1, var2, var3, var3);
            }
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "lc.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Ljava/util/HashSet;II)V")
   @ObfuscatedName("pd")
   public static void method7029(WorldMapRegion var0, HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : var0.iconMap.values()) {
         if (AbstractWorldMapIcon.method7521(var5, 771705346)) {
            int var6 = var5.getElement(278723027);
            if (var1.contains(var6)) {
               WorldMapElement var7 = class463.WorldMapElement_get(var6, (byte)0);
               var0.drawBackgroundCircle(var7, var5.screenX * -1407512062, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }

      var0.method7066(var1, var2, var3, -2126003740);
   }

   @ObfuscatedSignature(descriptor = "(Lld;Ljava/util/List;I)V")
   @ObfuscatedName("an")
   void initWorldMapData0(WorldMapData_0 var1, List var2, int var3) {
      try {
         this.iconMap.clear();
         this.worldMapData_0 = var1;
         this.addAllToIconList(var2, (byte)95);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bn")
   void method6994(int var1, int var2, int var3) {
      int var5 = 1250341663 * this.backgroundColor;
      int var6 = this.pixelsPerTile * -863231161;
      int var7 = this.regionX * 1709102994;
      DemotingHashTable var8 = WorldMapRegion_cachedSprites;
      long var9 = var7 << 16 | var5 << 8 | var6;
      SpritePixels var4 = (SpritePixels)var8.get(var9);
      if (null != var4) {
         if (916403024 * this.regionX == var3) {
            var4.method12647(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILlq;I)V")
   @ObfuscatedName("aj")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5, int var6) {
      try {
         for (int var7 = var1; var7 < var3 + var1; var7++) {
            label74:
            for (int var8 = var2; var8 < var2 + var4; var8++) {
               if (var6 >= 386212961) {
                  throw new IllegalStateException();
               }

               for (int var9 = 0; var9 < -1789868441 * var5.planes; var9++) {
                  if (var6 >= 386212961) {
                     throw new IllegalStateException();
                  }

                  WorldMapDecoration[] var10 = var5.decorations[var9][var7][var8];
                  if (null != var10) {
                     if (var6 >= 386212961) {
                        throw new IllegalStateException();
                     }

                     if (0 == var10.length) {
                        if (var6 >= 386212961) {
                           throw new IllegalStateException();
                        }
                     } else {
                        WorldMapDecoration[] var11 = var10;

                        for (int var12 = 0; var12 < var11.length; var12++) {
                           WorldMapDecoration var13 = var11[var12];
                           ObjectComposition var14 = AsyncHttpResponse.getObjectDefinition(var13.objectDefinitionId * 1508500333, 2144126180);
                           if (IndexCheck.method6505(var14, (byte)43)) {
                              this.getIcon(var14, var9, var7, var8, var5, 1293297519);
                              continue label74;
                           }

                           if (var6 >= 386212961) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lc.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("co")
   boolean method7018(AbstractArchive var1) {
      this.iconMap.clear();
      if (null != this.worldMapData_0) {
         this.worldMapData_0.loadGeography(var1, 259650186);
         if (this.worldMapData_0.isFullyLoaded(886741517)) {
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0, 47645214);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         for (WorldMapData_1 var4 : this.worldMapData1List) {
            var4.loadGeography(var1, -930309165);
            var2 &= var4.isFullyLoaded(886741517);
         }

         if (var2) {
            for (WorldMapData_1 var6 : this.worldMapData1List) {
               this.getIconsForTiles(var6.getChunkX((byte)71) * 8, var6.getChunkXLow(293825696) * 8, 8, 8, var6, -721369936);
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhl;B)I")
   @ObfuscatedName("bs")
   int method7085(SpritePixels var1, HorizontalAlignment var2, byte var3) {
      try {
         switch (var2.value * -747709277) {
            case 0:
               return -var1.subWidth / 2;
            case 1:
               return 0;
            default:
               return -var1.subWidth;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.bs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/List;B)V")
   @ObfuscatedName("ap")
   void addAllToIconList(List var1, byte var2) {
      try {
         for (WorldMapIcon_0 var4 : var1) {
            if (!class463.WorldMapElement_get(-879570211 * var4.element, (byte)0).field2204) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }
            } else if (var4.coord2.x * -1931160809 >> 6 == 1250341663 * this.backgroundColor
               && -863231161 * this.pixelsPerTile == -263036313 * var4.coord2.y >> 6) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               WorldMapIcon_0 var5 = new WorldMapIcon_0(
                  var4.coord2, var4.coord2, -879570211 * var4.element, this.method7094(var4.element * -879570211, 1211137861)
               );
               this.icon0List.add(var5);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lld;Ljava/util/List;)V")
   @ObfuscatedName("br")
   void method6998(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2, (byte)55);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;Llu;)V")
   @ObfuscatedName("qn")
   public static void method7047(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      if (var0 == null) {
         var0.method7095(var1);
      }

      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && -1 == var7) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * 2122052821 * var0.regionX,
            (63 - var2) * var0.regionX * -631149707,
            var0.regionX * -767305606,
            var0.regionX * -1957179868,
            var0.regionY * -620110646
         );
      }

      int var8 = 16711935;
      if (-1 != var7) {
         var8 = VerticalAlignment.method4594(var7, -1773797010 * var0.regionY, (byte)85);
      }

      if (var7 > -1 && var3.field3755[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * var0.regionX * 363814982, var0.regionX * -631149707 * (63 - var2), 297138142 * var0.regionX, var0.regionX * 1893676470, var8
         );
      } else {
         int var9 = method7054(var0, var1, var2, var3, var5, (byte)-19);
         if (-1 == var7) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               2141716438 * var0.regionX * var1, -1629418555 * var0.regionX * (63 - var2), 387825517 * var0.regionX, var0.regionX * -631149707, var9
            );
         } else {
            var4.method7462(
               var1 * -631149707 * var0.regionX,
               -631149707 * var0.regionX * (63 - var2),
               var9,
               var8,
               var0.regionX * -631149707,
               -631149707 * var0.regionX,
               var3.field3755[0][var1][var2],
               var3.field3754[0][var1][var2],
               -345640097
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)Z")
   @ObfuscatedName("au")
   boolean loadGeography(AbstractArchive var1, int var2) {
      try {
         this.iconMap.clear();
         if (null != this.worldMapData_0) {
            if (var2 <= -958960159) {
               throw new IllegalStateException();
            } else {
               this.worldMapData_0.loadGeography(var1, -1932060791);
               if (this.worldMapData_0.isFullyLoaded(886741517)) {
                  this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0, -1886000928);
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            boolean var3 = true;
            Iterator var4 = this.worldMapData1List.iterator();

            while (var4.hasNext()) {
               if (var2 <= -958960159) {
                  throw new IllegalStateException();
               }

               WorldMapData_1 var5 = (WorldMapData_1)var4.next();
               var5.loadGeography(var1, 94406882);
               var3 &= var5.isFullyLoaded(886741517);
            }

            if (var3) {
               if (var2 <= -958960159) {
                  throw new IllegalStateException();
               }

               var4 = this.worldMapData1List.iterator();

               while (var4.hasNext()) {
                  if (var2 <= -958960159) {
                     throw new IllegalStateException();
                  }

                  WorldMapData_1 var8 = (WorldMapData_1)var4.next();
                  this.getIconsForTiles(var8.getChunkX((byte)115) * 8, var8.getChunkXLow(2119072615) * 8, 8, 8, var8, -1585956183);
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILmr;[Lxm;Lqm;Lqm;D)V")
   @ObfuscatedName("az")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
      try {
         this.regionX = -1349399331 * var1;
         if (null != this.worldMapData_0 || !this.worldMapData1List.isEmpty()) {
            int var9 = this.backgroundColor * 1250341663;
            int var10 = this.pixelsPerTile * -863231161;
            DemotingHashTable var11 = WorldMapRegion_cachedSprites;
            long var12 = var1 << 16 | var9 << 8 | var10;
            SpritePixels var8 = (SpritePixels)var11.get(var12);
            if (null == var8) {
               if (Rasterizer3D.method5835() != var6) {
                  Rasterizer3D.buildPalette(var6);
               }

               boolean var17 = true;
               boolean var18 = var17 & this.loadGeography(var4, 594140057);
               int var13;
               if (this.worldMapData_0 != null) {
                  var13 = 2080583947 * this.worldMapData_0.groupId;
               } else {
                  var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId * 2080583947;
               }

               boolean var19 = var18 & var5.tryLoadGroup(var13, -1373162395);
               if (var19) {
                  byte[] var20 = var5.takeFileFlat(var13, 863720651);
                  WorldMapSprite var14 = WorldEntityCoord.method6245(var20, (byte)1);
                  SpritePixels var15 = new SpritePixels(this.regionX * -1738875584, -1738875584 * this.regionX);
                  SpritePixels.method12620(var15);
                  if (null != this.worldMapData_0) {
                     this.method7032(var2, var3, var14, (short)3803);
                  } else {
                     this.method7038(var2, var3, var14, -944429631);
                  }

                  IntProjection.method6177(var15, 1250341663 * this.backgroundColor, -863231161 * this.pixelsPerTile, -631149707 * this.regionX, -418973918);
                  this.method7016(2104030790);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "lc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;B)V")
   @ObfuscatedName("ad")
   void method7027(int var1, int var2, int var3, HashSet var4, byte var5) {
      try {
         if (null == var4) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            var4 = new HashSet();
         }

         this.drawNonLinkMapIcons(var1, var2, var4, var3, 1077197578);
         this.drawMapLinks(var1, var2, var4, var3, 1565170465);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;I)V")
   @ObfuscatedName("af")
   void method7062(int var1, int var2, AbstractWorldMapData var3, int var4) {
      try {
         for (int var5 = 0; var5 < -1789868441 * var3.planes; var5++) {
            WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
            if (null != var6) {
               if (var4 != 1055655472) {
                  return;
               }

               if (var6.length != 0) {
                  WorldMapDecoration[] var7 = var6;

                  for (int var8 = 0; var8 < var7.length; var8++) {
                     if (var4 != 1055655472) {
                        throw new IllegalStateException();
                     }

                     WorldMapDecoration var9;
                     boolean var10000;
                     label129: {
                        label160: {
                           var9 = var7[var8];
                           int var11 = 774297171 * var9.decoration;
                           if (var11 >= -13030657 * WorldMapDecorationType.field4701.id) {
                              if (var4 != 1055655472) {
                                 return;
                              }

                              if (var11 <= -13030657 * WorldMapDecorationType.field4706.id) {
                                 break label160;
                              }
                           }

                           if (var11 != WorldMapDecorationType.field4705.id * -13030657) {
                              var10000 = 0;
                              break label129;
                           }

                           if (var4 != 1055655472) {
                              throw new IllegalStateException();
                           }
                        }

                        var10000 = 1;
                     }

                     boolean var10 = (boolean)var10000;
                     if (var10) {
                        if (var4 != 1055655472) {
                           return;
                        }

                        ObjectComposition var12 = AsyncHttpResponse.getObjectDefinition(var9.objectDefinitionId * 1508500333, 2096917655);
                        if (0 != var12.int1 * -1900812067) {
                           if (var4 != 1055655472) {
                              throw new IllegalStateException();
                           }

                           var10000 = -3407872;
                        } else {
                           var10000 = -3355444;
                        }

                        int var13 = var10000;
                        if (var9.decoration * 774297171 == WorldMapDecorationType.field4701.id * -13030657) {
                           method7111(this, var1, var2, -945438443 * var9.rotation, var13, 1993007000);
                        }

                        if (WorldMapDecorationType.field4703.id * -13030657 == var9.decoration * 774297171) {
                           if (var4 != 1055655472) {
                              throw new IllegalStateException();
                           }

                           method7111(this, var1, var2, var9.rotation * -945438443, -3355444, 2059879221);
                           method7111(this, var1, var2, -945438443 * var9.rotation + 1, var13, 2030851155);
                        }

                        if (-13030657 * WorldMapDecorationType.field4706.id == var9.decoration * 774297171) {
                           if (var4 != 1055655472) {
                              throw new IllegalStateException();
                           }

                           if (var9.rotation * -945438443 == 0) {
                              Rasterizer2D.Rasterizer2D_drawHorizontalLine(var1 * this.regionX * -631149707, -631149707 * this.regionX * (63 - var2), 1, var13);
                           }

                           if (1 == -945438443 * var9.rotation) {
                              Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                                 -631149707 * this.regionX + var1 * -631149707 * this.regionX - 1, (63 - var2) * -631149707 * this.regionX, 1, var13
                              );
                           }

                           if (-945438443 * var9.rotation == 2) {
                              if (var4 != 1055655472) {
                                 throw new IllegalStateException();
                              }

                              Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                                 var1 * -631149707 * this.regionX + this.regionX * -631149707 - 1,
                                 -631149707 * this.regionX * (63 - var2) + -631149707 * this.regionX - 1,
                                 1,
                                 var13
                              );
                           }

                           if (3 == -945438443 * var9.rotation) {
                              if (var4 != 1055655472) {
                                 throw new IllegalStateException();
                              }

                              Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                                 var1 * this.regionX * -631149707, this.regionX * -631149707 + (63 - var2) * -631149707 * this.regionX - 1, 1, var13
                              );
                           }
                        }

                        if (var9.decoration * 774297171 == -13030657 * WorldMapDecorationType.field4705.id) {
                           int var14 = -945438443 * var9.rotation % 2;
                           if (0 == var14) {
                              if (var4 != 1055655472) {
                                 return;
                              }

                              for (int var17 = 0; var17 < -631149707 * this.regionX; var17++) {
                                 Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                                    var17 + -631149707 * this.regionX * var1, (64 - var2) * -631149707 * this.regionX - 1 - var17, 1, var13
                                 );
                              }
                           } else {
                              for (int var15 = 0; var15 < -631149707 * this.regionX; var15++) {
                                 Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                                    -631149707 * this.regionX * var1 + var15, -631149707 * this.regionX * (63 - var2) + var15, 1, var13
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "lc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;S)V")
   @ObfuscatedName("as")
   void method7032(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3, short var4) {
      try {
         for (int var5 = 0; var5 < 64; var5++) {
            if (var4 != 3803) {
               throw new IllegalStateException();
            }

            for (int var6 = 0; var6 < 64; var6++) {
               if (var4 != 3803) {
                  throw new IllegalStateException();
               }

               this.drawTileGround(var5, var6, this.worldMapData_0, var1, var3, 855971414);
               this.method7051(var5, var6, this.worldMapData_0, var1, (short)382);
            }
         }

         for (int var8 = 0; var8 < 64; var8++) {
            if (var4 != 3803) {
               return;
            }

            for (int var9 = 0; var9 < 64; var9++) {
               if (var4 != 3803) {
                  throw new IllegalStateException();
               }

               method7043(this, var8, var9, this.worldMapData_0, var1, var2, (byte)-66);
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;I)V")
   @ObfuscatedName("ea")
   void method7082(int var1, int var2, HashSet var3, int var4) {
      float var5 = var4 / 64.0F;

      for (AbstractWorldMapIcon var7 : this.icon0List) {
         if (AbstractWorldMapIcon.method7521(var7, 55331902)) {
            int var8 = 2070597410 * var7.coord2.x % 606242927;
            int var9 = var7.coord2.y * 666994062 % 64;
            var7.screenX = 486465835 * (int)(var8 * var5 + var1);
            var7.screenY = 1808525725 * (int)(var5 * (529210771 - var9) + var2);
            if (!var3.contains(var7.getElement(-1921923499))) {
               method7074(this, var7, -615327175 * var7.screenX, 1550466614 * var7.screenY, var5, (byte)21);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Llu;B)I")
   @ObfuscatedName("ls")
   public static int method7054(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4, byte var5) {
      if (var0 == null) {
         var0.method7056(var1, var1, var3, var4, var5);
      }

      try {
         if (var3.floorUnderlayIds[0][var1][var2] == 0) {
            if (var5 == 1) {
               throw new IllegalStateException();
            } else {
               return 1935506723 * var0.regionY;
            }
         } else {
            return var4.getTileColor(var1, var2, 1807549016);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;Lms;IIFB)V")
   @ObfuscatedName("hm")
   public static void method7074(WorldMapRegion var0, AbstractWorldMapIcon var1, int var2, int var3, float var4, byte var5) {
      if (var0 == null) {
         var0.method7075(var1, var2, var2, var4, var5);
      }

      try {
         WorldMapElement var6 = class463.WorldMapElement_get(var1.getElement(-1709690705), (byte)0);
         method7076(var0, var6, var2, var3, 2057130196);
         var0.method7079(var1, var6, var2, var3, var4, -1166551005);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lc.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V")
   @ObfuscatedName("ae")
   void initWorldMapData1(HashSet var1, List var2, byte var3) {
      try {
         this.iconMap.clear();
         Iterator var4 = var1.iterator();

         while (var4.hasNext()) {
            if (var3 == 3) {
               throw new IllegalStateException();
            }

            WorldMapData_1 var5 = (WorldMapData_1)var4.next();
            if (var5.getRegionX((byte)-120) == 1250341663 * this.backgroundColor) {
               if (var3 == 3) {
                  return;
               }

               if (AbstractWorldMapData.method7252(var5, 2117186632) == this.pixelsPerTile * -863231161) {
                  if (var3 == 3) {
                     throw new IllegalStateException();
                  }

                  this.worldMapData1List.add(var5);
               }
            }
         }

         this.addAllToIconList(var2, (byte)30);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ct")
   void method7015() {
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.reset((byte)85);
      } else {
         for (WorldMapData_1 var2 : this.worldMapData1List) {
            var2.reset((byte)-16);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;S)V")
   @ObfuscatedName("ar")
   void method7051(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, short var5) {
      try {
         for (int var6 = 1; var6 < var3.planes * -1789868441; var6++) {
            if (var5 != 382) {
               throw new IllegalStateException();
            }

            int var7 = var3.floorOverlayIds[var6][var1][var2] - 1;
            if (var7 > -1) {
               if (var5 != 382) {
                  throw new IllegalStateException();
               }

               int var8 = VerticalAlignment.method4594(var7, this.regionY * 1935506723, (byte)127);
               if (var3.field3755[var6][var1][var2] == 0) {
                  Rasterizer2D.Rasterizer2D_fillRectangle(
                     this.regionX * -631149707 * var1, -631149707 * this.regionX * (63 - var2), this.regionX * -631149707, -631149707 * this.regionX, var8
                  );
               } else {
                  var4.method7462(
                     var1 * -631149707 * this.regionX,
                     this.regionX * -631149707 * (63 - var2),
                     0,
                     var8,
                     this.regionX * -631149707,
                     -631149707 * this.regionX,
                     var3.field3755[var6][var1][var2],
                     var3.field3754[var6][var1][var2],
                     2066734953
                  );
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "lc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void initWorldMapIcon1s(byte var1) {
      try {
         Iterator var2 = this.iconMap.values().iterator();

         while (var2.hasNext()) {
            if (var1 == -92) {
               throw new IllegalStateException();
            }

            AbstractWorldMapIcon var3 = (AbstractWorldMapIcon)var2.next();
            if (var3 instanceof WorldMapIcon_1) {
               if (var1 == -92) {
                  throw new IllegalStateException();
               }

               ((WorldMapIcon_1)var3).init((byte)117);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;IIII)V")
   @ObfuscatedName("ds")
   void method7071(WorldMapElement var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.getSpriteBool(false, 2136653962);
      if (var6 != null) {
         var6.method12650(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, -44034151);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 1024072718, 661071930);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V")
   @ObfuscatedName("ao")
   void method7066(HashSet var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.icon0List.iterator();

         while (var5.hasNext()) {
            if (var4 == -1100741860) {
               return;
            }

            AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
            if (AbstractWorldMapIcon.method7521(var6, -796200475)) {
               WorldMapElement var7 = class463.WorldMapElement_get(var6.getElement(2029519193), (byte)0);
               if (null != var7) {
                  if (var4 == -1100741860) {
                     throw new IllegalStateException();
                  }

                  if (var1.contains(var7.getObjectId(-1629059085))) {
                     if (var4 == -1100741860) {
                        return;
                     }

                     this.drawBackgroundCircle(var7, var6.screenX * -1481714301, 915727541 * var6.screenY, var2, var3, 1361532286);
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "lc.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lxt;Lhl;)I")
   @ObfuscatedName("fm")
   public static int method7086(WorldMapRegion var0, SpritePixels var1, HorizontalAlignment var2) {
      if (var0 == null) {
         var0.method7015();
      }

      switch (var2.value * -747709277) {
         case 0:
            return -var1.subWidth / 2;
         case 1:
            return 0;
         default:
            return -var1.subWidth;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILjava/util/HashSet;I)V")
   @ObfuscatedName("cr")
   public static void method7083(WorldMapRegion var0, int var1, int var2, HashSet var3, int var4) {
      if (var0 == null) {
         var0.method7095(var1);
      }

      float var5 = var4 / 64.0F;

      for (AbstractWorldMapIcon var7 : var0.icon0List) {
         if (AbstractWorldMapIcon.method7521(var7, 148632301)) {
            int var8 = -1931160809 * var7.coord2.x % 64;
            int var9 = var7.coord2.y * -263036313 % 64;
            var7.screenX = 486465835 * (int)(var8 * var5 + var1);
            var7.screenY = 1808525725 * (int)(var5 * (63 - var9) + var2);
            if (!var3.contains(var7.getElement(-2092839683))) {
               method7074(var0, var7, -1481714301 * var7.screenX, 915727541 * var7.screenY, var5, (byte)8);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;IIIII)V")
   @ObfuscatedName("aa")
   void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         SpritePixels var7 = var1.getSpriteBool(false, -1779282646);
         if (var7 == null) {
            if (var6 == 1361532286) {
               ;
            }
         } else {
            var7.method12650(var2 - var7.subWidth / 2, var3 - var7.subHeight / 2);
            if (var4 % var5 < var5 / 2) {
               Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
               Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "lc.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIS)V")
   @ObfuscatedName("ai")
   void flashElements(HashSet var1, int var2, int var3, short var4) {
      try {
         Iterator var5 = this.iconMap.values().iterator();

         while (var5.hasNext()) {
            if (var4 == 255) {
               throw new IllegalStateException();
            }

            AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
            if (!AbstractWorldMapIcon.method7521(var6, -25984290)) {
               if (var4 == 255) {
                  return;
               }
            } else {
               int var7 = var6.getElement(-1504814972);
               if (var1.contains(var7)) {
                  WorldMapElement var8 = class463.WorldMapElement_get(var7, (byte)0);
                  this.drawBackgroundCircle(var8, var6.screenX * -1481714301, 915727541 * var6.screenY, var2, var3, 1361532286);
               }
            }
         }

         this.method7066(var1, var2, var3, 1443306890);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "lc.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lms;Lhi;IIFI)V")
   @ObfuscatedName("bo")
   void method7079(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5, int var6) {
      try {
         WorldMapLabel var7 = var1.getLabel((byte)121);
         if (null == var7) {
            if (var6 == 962364880) {
               throw new IllegalStateException();
            }
         } else if (!var7.size.method7217(var5, 1638055948)) {
            if (var6 == 962364880) {
               throw new IllegalStateException();
            }
         } else {
            Font var8 = (Font)this.fonts.get(var7.size);
            AbstractFont.method10416(
               var8,
               var7.text,
               var3 - -1322204423 * var7.height / 2,
               var4,
               var7.height * -1322204423,
               var7.width * -1989742749,
               0xFF000000 | -1733851579 * var2.field2218,
               0,
               1,
               0,
               var8.ascent / 2
            );
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "lc.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V")
   @ObfuscatedName("bg")
   void drawMapLinks(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = var4 / 64.0F;
         Iterator var7 = this.icon0List.iterator();

         while (var7.hasNext()) {
            if (var5 == 61595043) {
               throw new IllegalStateException();
            }

            AbstractWorldMapIcon var8 = (AbstractWorldMapIcon)var7.next();
            if (!AbstractWorldMapIcon.method7521(var8, 1424930356)) {
               if (var5 == 61595043) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = -1931160809 * var8.coord2.x % 64;
               int var10 = var8.coord2.y * -263036313 % 64;
               var8.screenX = 486465835 * (int)(var9 * var6 + var1);
               var8.screenY = 1808525725 * (int)(var6 * (63 - var10) + var2);
               if (var3.contains(var8.getElement(482390026))) {
                  if (var5 == 61595043) {
                     throw new IllegalStateException();
                  }
               } else {
                  method7074(this, var8, -1481714301 * var8.screenX, 915727541 * var8.screenY, var6, (byte)28);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "lc.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;)Llv;")
   @ObfuscatedName("eg")
   WorldMapLabel method7097(WorldMapElement var1) {
      if (null != var1.menuTargetName && null != this.fonts && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         int var3 = var1.textSize * 1000629255;
         WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{
            WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small
         };
         WorldMapLabelSize[] var5 = var4;
         int var6 = 0;

         WorldMapLabelSize var2;
         while (true) {
            if (var6 >= var5.length) {
               var2 = null;
               break;
            }

            WorldMapLabelSize var7 = var5[var6];
            if (var7.field3734 * 1938465625 == var3) {
               var2 = var7;
               break;
            }

            var6++;
         }

         if (null == var2) {
            return null;
         } else {
            Font var14 = (Font)this.fonts.get(var2);
            if (null == var14) {
               return null;
            } else {
               var6 = var14.lineCount(var1.menuTargetName, 1000000);
               String[] var16 = new String[var6];
               var14.breakLines(var1.menuTargetName, null, var16);
               int var8 = var14.ascent * var16.length / 2;
               int var9 = 0;
               String[] var10 = var16;

               for (int var11 = 0; var11 < var10.length; var11++) {
                  String var12 = var10[var11];
                  int var13 = var14.stringWidth(var12);
                  if (var13 > var9) {
                     var9 = var13;
                  }
               }

               return new WorldMapLabel(var1.menuTargetName, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liv;IIILlq;I)V")
   @ObfuscatedName("ak")
   void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5, int var6) {
      try {
         Coord var7 = new Coord(var2, var3 + -1582512192 * this.backgroundColor, var4 + this.pixelsPerTile * 587780544);
         Object var8 = null;
         if (null != this.worldMapData_0) {
            if (var6 == 1677308786) {
               throw new IllegalStateException();
            }

            var8 = new Coord(
               var2 + -1100812969 * this.worldMapData_0.minPlane,
               var3 + this.worldMapData_0.regionXLow * -39388864,
               this.worldMapData_0.regionYLow * -89000768 + var4
            );
         } else {
            WorldMapData_1 var9 = (WorldMapData_1)var5;
            var8 = new Coord(
               var2 + var9.minPlane * -1100812969,
               -39388864 * var9.regionXLow + var3 + WorldMapData_1.method7272(var9, -1347220241) * 8,
               var9.regionYLow * -89000768 + var4 + WorldMapData_1.method7277(var9, -1428879079) * 8
            );
         }

         Object var13;
         if (var1.transforms != null) {
            if (var6 == 1677308786) {
               throw new IllegalStateException();
            }

            var13 = new WorldMapIcon_1((Coord)var8, var7, var1.id * -965498101, this);
         } else {
            WorldMapElement var10 = class463.WorldMapElement_get(var1.mapIconId * -2059094647, (byte)0);
            var13 = new WorldMapIcon_0((Coord)var8, var7, var10.objectId * 348284615, method7098(this, var10, -774527635));
         }

         WorldMapElement var14 = class463.WorldMapElement_get(((AbstractWorldMapIcon)var13).getElement(847220697), (byte)0);
         if (var14.field2204) {
            if (var6 == 1677308786) {
               throw new IllegalStateException();
            }

            this.iconMap.put(new Coord(0, var3, var4), var13);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "lc.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Llv;")
   @ObfuscatedName("bk")
   WorldMapLabel method7094(int var1, int var2) {
      try {
         WorldMapElement var3 = class463.WorldMapElement_get(var1, (byte)0);
         return method7098(this, var3, -173312698);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cw")
   void method7033(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (int var4 = 0; var4 < 64; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3, -1401486197);
            this.method7051(var4, var5, this.worldMapData_0, var1, (short)382);
         }
      }

      for (int var6 = 0; var6 < 64; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            method7043(this, var6, var7, this.worldMapData_0, var1, var2, (byte)-10);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)Ljava/util/List;")
   @ObfuscatedName("bj")
   List method7102(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         LinkedList var7 = new LinkedList();
         if (var4 >= var1) {
            if (var6 >= 0) {
               throw new IllegalStateException();
            }

            if (var5 >= var2) {
               if (var4 < var1 + var3) {
                  if (var5 < var2 + var3) {
                     Iterator var8 = this.iconMap.values().iterator();

                     while (var8.hasNext()) {
                        if (var6 >= 0) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var9 = (AbstractWorldMapIcon)var8.next();
                        if (AbstractWorldMapIcon.method7521(var9, -804149576)) {
                           if (var6 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var9.fitsScreen(var4, var5, -655190399)) {
                              var7.add(var9);
                           }
                        }
                     }

                     var8 = this.icon0List.iterator();

                     while (var8.hasNext()) {
                        if (var6 >= 0) {
                           throw new IllegalStateException();
                        }

                        AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.next();
                        if (AbstractWorldMapIcon.method7521(var12, 194477251)) {
                           if (var6 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var12.fitsScreen(var4, var5, 566078373)) {
                              if (var6 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var7.add(var12);
                           }
                        }
                     }

                     return var7;
                  }

                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               return var7;
            }

            if (var6 >= 0) {
               throw new IllegalStateException();
            }
         }

         return var7;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "lc.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhk;)I")
   @ObfuscatedName("ej")
   int method7089(SpritePixels var1, VerticalAlignment var2) {
      switch (-1167722475 * var2.value) {
         case 0:
            return -var1.subHeight / 2;
         case 2:
            return 0;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;I)V")
   @ObfuscatedName("ac")
   void method7038(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3, int var4) {
      try {
         Iterator var5 = this.worldMapData1List.iterator();

         while (var5.hasNext()) {
            if (var4 != -944429631) {
               throw new IllegalStateException();
            }

            WorldMapData_1 var6 = (WorldMapData_1)var5.next();

            for (int var7 = var6.getChunkX((byte)22) * 8; var7 < var6.getChunkX((byte)94) * 8 + 8; var7++) {
               for (int var8 = var6.getChunkXLow(1711673761) * 8; var8 < var6.getChunkXLow(-882675600) * 8 + 8; var8++) {
                  if (var4 != -944429631) {
                     throw new IllegalStateException();
                  }

                  this.drawTileGround(var7, var8, var6, var1, var3, -1336259673);
                  this.method7051(var7, var8, var6, var1, (short)382);
               }
            }
         }

         var5 = this.worldMapData1List.iterator();

         while (var5.hasNext()) {
            if (var4 != -944429631) {
               throw new IllegalStateException();
            }

            WorldMapData_1 var11 = (WorldMapData_1)var5.next();

            for (int var12 = var11.getChunkX((byte)41) * 8; var12 < var11.getChunkX((byte)80) * 8 + 8; var12++) {
               for (int var13 = var11.getChunkXLow(2033790743) * 8; var13 < var11.getChunkXLow(-2075225510) * 8 + 8; var13++) {
                  if (var4 != -944429631) {
                     throw new IllegalStateException();
                  }

                  method7043(this, var12, var13, var11, var1, var2, (byte)-24);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "lc.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;III)V")
   @ObfuscatedName("bu")
   static void method6986(SpritePixels var0, int var1, int var2, int var3) {
      DemotingHashTable var4 = WorldMapRegion_cachedSprites;
      long var6 = var3 << 16 | var1 << 8 | var2;
      var4.put(var0, var6, 4 * var0.pixels.length);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;)Z")
   @ObfuscatedName("ba")
   static boolean method6988(ObjectComposition var0) {
      if (null != var0.transforms) {
         int[] var1 = var0.transforms;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3, 2087679157);
            if (-2059094647 * var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (-1 != -2059094647 * var0.mapIconId) {
         return true;
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;)Z")
   @ObfuscatedName("bi")
   static boolean method6989(ObjectComposition var0) {
      if (null != var0.transforms) {
         int[] var1 = var0.transforms;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3, 2094187537);
            if (-2059094647 * var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (-1 != -2059094647 * var0.mapIconId) {
         return true;
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;)Z")
   @ObfuscatedName("by")
   static boolean method6990(ObjectComposition var0) {
      if (null != var0.transforms) {
         int[] var1 = var0.transforms;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3, 2011346530);
            if (1719567945 * var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (-1 != -1675560633 * var0.mapIconId) {
         return true;
      }

      return false;
   }

   public Collection getMapIcons() {
      return Collections.unmodifiableCollection(this.method7114().values());
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bw")
   void method6995(int var1, int var2, int var3) {
      int var5 = 1250341663 * this.backgroundColor;
      int var6 = this.pixelsPerTile * -863231161;
      int var7 = this.regionX * -631149707;
      DemotingHashTable var8 = WorldMapRegion_cachedSprites;
      long var9 = var7 << 16 | var5 << 8 | var6;
      SpritePixels var4 = (SpritePixels)var8.get(var9);
      if (null != var4) {
         if (-1738875584 * this.regionX == var3) {
            var4.method12647(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bf")
   void method6996(int var1, int var2, int var3) {
      int var5 = 1250341663 * this.backgroundColor;
      int var6 = this.pixelsPerTile * -863231161;
      int var7 = this.regionX * -631149707;
      DemotingHashTable var8 = WorldMapRegion_cachedSprites;
      long var9 = var7 << 16 | var5 << 8 | var6;
      SpritePixels var4 = (SpritePixels)var8.get(var9);
      if (null != var4) {
         if (-1738875584 * this.regionX == var3) {
            var4.method12647(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   void method7011() {
      for (AbstractWorldMapIcon var2 : this.iconMap.values()) {
         if (var2 instanceof WorldMapIcon_1) {
            ((WorldMapIcon_1)var2).init((byte)71);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/HashMap;")
   @ObfuscatedName("io")
   public HashMap method7114() {
      return this.iconMap;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   void method7016(int var1) {
      try {
         if (this.worldMapData_0 != null) {
            if (var1 <= 1666200558) {
               throw new IllegalStateException();
            }

            this.worldMapData_0.reset((byte)-87);
         } else {
            for (WorldMapData_1 var3 : this.worldMapData1List) {
               var3.reset((byte)-35);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cf")
   void method7034(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (int var4 = 0; var4 < 64; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3, 1215728460);
            this.method7051(var4, var5, this.worldMapData_0, var1, (short)382);
         }
      }

      for (int var6 = 0; var6 < 64; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            method7043(this, var6, var7, this.worldMapData_0, var1, var2, (byte)-50);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lld;Ljava/util/List;)V")
   @ObfuscatedName("bl")
   void method6999(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2, (byte)59);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;)V")
   @ObfuscatedName("bc")
   void method7002(HashSet var1, List var2) {
      this.iconMap.clear();

      for (WorldMapData_1 var4 : var1) {
         if (var4.getRegionX((byte)-119) == 1250341663 * this.backgroundColor
            && AbstractWorldMapData.method7252(var4, 2117186632) == this.pixelsPerTile * -863231161) {
            this.worldMapData1List.add(var4);
         }
      }

      this.addAllToIconList(var2, (byte)48);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;)V")
   @ObfuscatedName("bq")
   void method7003(HashSet var1, List var2) {
      this.iconMap.clear();

      for (WorldMapData_1 var4 : var1) {
         if (var4.getRegionX((byte)-52) == 1250341663 * this.backgroundColor
            && AbstractWorldMapData.method7252(var4, 2117186632) == this.pixelsPerTile * -863231161) {
            this.worldMapData1List.add(var4);
         }
      }

      this.addAllToIconList(var2, (byte)38);
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("av")
   static boolean method6985(int var0, int var1, byte var2) {
      try {
         return 4 != var0 || var1 < 8;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILlq;)V")
   @ObfuscatedName("bv")
   void method7005(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for (int var6 = var1; var6 < var3 + var1; var6++) {
         label56:
         for (int var7 = var2; var7 < var2 + var4; var7++) {
            for (int var8 = 0; var8 < -1789868441 * var5.planes; var8++) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (null != var9 && 0 != var9.length) {
                  WorldMapDecoration[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = AsyncHttpResponse.getObjectDefinition(var12.objectDefinitionId * 1508500333, 2074343921);
                     if (IndexCheck.method6505(var13, (byte)92)) {
                        this.getIcon(var13, var8, var6, var7, var5, -1402503708);
                        continue label56;
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;)V")
   @ObfuscatedName("dt")
   public static void method7052(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      if (var0 == null) {
         var0.method6995(var1, var1, var1);
      } else {
         for (int var5 = 1; var5 < var3.planes * -1789868441; var5++) {
            int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
            if (var6 > -1) {
               int var7 = VerticalAlignment.method4594(var6, var0.regionY * 1935506723, (byte)19);
               if (var3.field3755[var5][var1][var2] == 0) {
                  Rasterizer2D.Rasterizer2D_fillRectangle(
                     var0.regionX * -631149707 * var1, -631149707 * var0.regionX * (63 - var2), var0.regionX * -631149707, -631149707 * var0.regionX, var7
                  );
               } else {
                  var4.method7462(
                     var1 * -631149707 * var0.regionX,
                     var0.regionX * -631149707 * (63 - var2),
                     0,
                     var7,
                     var0.regionX * -631149707,
                     -631149707 * var0.regionX,
                     var3.field3755[var5][var1][var2],
                     var3.field3754[var5][var1][var2],
                     -257958721
                  );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Liv;IIILlq;)V")
   @ObfuscatedName("ch")
   void method7008(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + -1582512192 * this.backgroundColor, var4 + this.pixelsPerTile * 587780544);
      Object var7 = null;
      if (null != this.worldMapData_0) {
         var7 = new Coord(
            var2 + -1100812969 * this.worldMapData_0.minPlane,
            var3 + this.worldMapData_0.regionXLow * -39388864,
            this.worldMapData_0.regionYLow * -89000768 + var4
         );
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(
            var2 + var8.minPlane * -1100812969,
            -39388864 * var8.regionXLow + var3 + WorldMapData_1.method7272(var8, -1347220241) * 8,
            var8.regionYLow * -89000768 + var4 + WorldMapData_1.method7277(var8, -1428879079) * 8
         );
      }

      Object var11;
      if (var1.transforms != null) {
         var11 = new WorldMapIcon_1((Coord)var7, var6, var1.id * -965498101, this);
      } else {
         WorldMapElement var9 = class463.WorldMapElement_get(var1.mapIconId * -2059094647, (byte)0);
         var11 = new WorldMapIcon_0((Coord)var7, var6, var9.objectId * 348284615, method7098(this, var9, 624628062));
      }

      WorldMapElement var12 = class463.WorldMapElement_get(((AbstractWorldMapIcon)var11).getElement(2008080808), (byte)0);
      if (var12.field2204) {
         this.iconMap.put(new Coord(0, var3, var4), var11);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liv;IIILlq;)V")
   @ObfuscatedName("ce")
   void method7009(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + -1582512192 * this.backgroundColor, var4 + this.pixelsPerTile * 587780544);
      Object var7 = null;
      if (null != this.worldMapData_0) {
         var7 = new Coord(
            var2 + -1100812969 * this.worldMapData_0.minPlane,
            var3 + this.worldMapData_0.regionXLow * -39388864,
            this.worldMapData_0.regionYLow * -89000768 + var4
         );
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(
            var2 + var8.minPlane * -1100812969,
            -39388864 * var8.regionXLow + var3 + WorldMapData_1.method7272(var8, -1347220241) * 8,
            var8.regionYLow * -89000768 + var4 + WorldMapData_1.method7277(var8, -1428879079) * 8
         );
      }

      Object var11;
      if (var1.transforms != null) {
         var11 = new WorldMapIcon_1((Coord)var7, var6, var1.id * -965498101, this);
      } else {
         WorldMapElement var9 = class463.WorldMapElement_get(var1.mapIconId * -2059094647, (byte)0);
         var11 = new WorldMapIcon_0((Coord)var7, var6, var9.objectId * 348284615, method7098(this, var9, -201566711));
      }

      WorldMapElement var12 = class463.WorldMapElement_get(((AbstractWorldMapIcon)var11).getElement(99173427), (byte)0);
      if (var12.field2204) {
         this.iconMap.put(new Coord(0, var3, var4), var11);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llv;")
   @ObfuscatedName("ew")
   WorldMapLabel method7095(int var1) {
      WorldMapElement var2 = class463.WorldMapElement_get(var1, (byte)0);
      return method7098(this, var2, -1970647298);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/List;)V")
   @ObfuscatedName("cm")
   void method7014(List var1) {
      for (WorldMapIcon_0 var3 : var1) {
         if (class463.WorldMapElement_get(-879570211 * var3.element, (byte)0).field2204
            && var3.coord2.x * -1931160809 >> 6 == -1783705284 * this.backgroundColor
            && -863231161 * this.pixelsPerTile == -140860387 * var3.coord2.y >> 6) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(
               var3.coord2, var3.coord2, -879570211 * var3.element, this.method7094(var3.element * -879570211, -652232763)
            );
            this.icon0List.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   void method7017() {
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.reset((byte)45);
      } else {
         for (WorldMapData_1 var2 : this.worldMapData1List) {
            var2.reset((byte)-50);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("cc")
   boolean method7020(AbstractArchive var1) {
      this.iconMap.clear();
      if (null != this.worldMapData_0) {
         this.worldMapData_0.loadGeography(var1, 1107411884);
         if (this.worldMapData_0.isFullyLoaded(886741517)) {
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0, -434836897);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         for (WorldMapData_1 var4 : this.worldMapData1List) {
            var4.loadGeography(var1, -363052654);
            var2 &= var4.isFullyLoaded(886741517);
         }

         if (var2) {
            for (WorldMapData_1 var6 : this.worldMapData1List) {
               this.getIconsForTiles(var6.getChunkX((byte)75) * 8, var6.getChunkXLow(478893217) * 8, 8, 8, var6, -951911948);
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("cs")
   boolean method7021(AbstractArchive var1) {
      this.iconMap.clear();
      if (null != this.worldMapData_0) {
         this.worldMapData_0.loadGeography(var1, 1373261321);
         if (this.worldMapData_0.isFullyLoaded(886741517)) {
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0, -925387146);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         for (WorldMapData_1 var4 : this.worldMapData1List) {
            var4.loadGeography(var1, 1353986568);
            var2 &= var4.isFullyLoaded(886741517);
         }

         if (var2) {
            for (WorldMapData_1 var6 : this.worldMapData1List) {
               this.getIconsForTiles(var6.getChunkX((byte)90) * 8, var6.getChunkXLow(1357753599) * 8, 8, 8, var6, 165249392);
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;[Lxm;B)V")
   @ObfuscatedName("nl")
   public static void method7043(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5, byte var6) {
      if (var0 == null) {
         var0.method7046(var1, var1, var3, var4, var5, var6);
      }

      try {
         var0.method7062(var1, var2, var3, 1055655472);
         method7060(var0, var1, var2, var3, var5, (byte)14);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("cn")
   boolean method7022(AbstractArchive var1) {
      this.iconMap.clear();
      if (null != this.worldMapData_0) {
         this.worldMapData_0.loadGeography(var1, -1653319749);
         if (this.worldMapData_0.isFullyLoaded(886741517)) {
            this.getIconsForTiles(0, 0, 1241563913, 64, this.worldMapData_0, -1839421328);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         for (WorldMapData_1 var4 : this.worldMapData1List) {
            var4.loadGeography(var1, -1107384004);
            var2 &= var4.isFullyLoaded(886741517);
         }

         if (var2) {
            for (WorldMapData_1 var6 : this.worldMapData1List) {
               this.getIconsForTiles(var6.getChunkX((byte)81) * 8, var6.getChunkXLow(2053746772) * 8, 8, 8, var6, -1507596256);
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;Lhi;III)V")
   @ObfuscatedName("dz")
   public static void method7076(WorldMapRegion var0, WorldMapElement var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method7078(var1, var2, var2, var2);
      } else {
         try {
            SpritePixels var5 = var1.getSpriteBool(false, 660677213);
            if (var5 != null) {
               if (var4 == 49018164) {
                  return;
               }

               int var6 = var0.method7085(var5, var1.horizontalAlignment, (byte)99);
               int var7 = var0.method7090(var5, var1.verticalAlignment, (byte)4);
               var5.method12650(var6 + var2, var7 + var3);
            }
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "lc.be(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILlq;)V")
   @ObfuscatedName("bx")
   void method7006(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for (int var6 = var1; var6 < var3 + var1; var6++) {
         label53:
         for (int var7 = var2; var7 < var2 + var4; var7++) {
            for (int var8 = 0; var8 < -1789868441 * var5.planes; var8++) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (null != var9 && 0 != var9.length) {
                  WorldMapDecoration[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = AsyncHttpResponse.getObjectDefinition(var12.objectDefinitionId * 1508500333, 2095544537);
                     if (IndexCheck.method6505(var13, (byte)45)) {
                        this.getIcon(var13, var8, var6, var7, var5, 2082020373);
                        continue label53;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILmr;[Lxm;Lqm;Lqm;D)V")
   @ObfuscatedName("cg")
   void method7024(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
      this.regionX = -1349399331 * var1;
      if (null != this.worldMapData_0 || !this.worldMapData1List.isEmpty()) {
         int var9 = this.backgroundColor * 1250341663;
         int var10 = this.pixelsPerTile * -863231161;
         DemotingHashTable var11 = WorldMapRegion_cachedSprites;
         long var12 = var1 << 16 | var9 << 8 | var10;
         SpritePixels var8 = (SpritePixels)var11.get(var12);
         if (null == var8) {
            if (Rasterizer3D.method5835() != var6) {
               Rasterizer3D.buildPalette(var6);
            }

            boolean var16 = true;
            boolean var17 = var16 & this.loadGeography(var4, -936672688);
            int var13;
            if (this.worldMapData_0 != null) {
               var13 = 2080583947 * this.worldMapData_0.groupId;
            } else {
               var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId * 2080583947;
            }

            boolean var18 = var17 & var5.tryLoadGroup(var13, -879396529);
            if (var18) {
               byte[] var19 = var5.takeFileFlat(var13, -100732323);
               WorldMapSprite var14 = WorldEntityCoord.method6245(var19, (byte)1);
               SpritePixels var15 = new SpritePixels(this.regionX * -1738875584, -1738875584 * this.regionX);
               SpritePixels.method12620(var15);
               if (null != this.worldMapData_0) {
                  this.method7032(var2, var3, var14, (short)3803);
               } else {
                  this.method7038(var2, var3, var14, -944429631);
               }

               IntProjection.method6177(var15, 1250341663 * this.backgroundColor, -863231161 * this.pixelsPerTile, -631149707 * this.regionX, 1313809985);
               this.method7016(2024408608);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILmr;[Lxm;Lqm;Lqm;D)V")
   @ObfuscatedName("cp")
   void method7025(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
      this.regionX = -1349399331 * var1;
      if (null != this.worldMapData_0 || !this.worldMapData1List.isEmpty()) {
         int var9 = this.backgroundColor * 1250341663;
         int var10 = this.pixelsPerTile * -863231161;
         DemotingHashTable var11 = WorldMapRegion_cachedSprites;
         long var12 = var1 << 16 | var9 << 8 | var10;
         SpritePixels var8 = (SpritePixels)var11.get(var12);
         if (null == var8) {
            if (Rasterizer3D.method5835() != var6) {
               Rasterizer3D.buildPalette(var6);
            }

            boolean var16 = true;
            boolean var17 = var16 & this.loadGeography(var4, 1347362965);
            int var13;
            if (this.worldMapData_0 != null) {
               var13 = 2080583947 * this.worldMapData_0.groupId;
            } else {
               var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId * 2080583947;
            }

            boolean var18 = var17 & var5.tryLoadGroup(var13, 26143777);
            if (var18) {
               byte[] var19 = var5.takeFileFlat(var13, -1836706369);
               WorldMapSprite var14 = WorldEntityCoord.method6245(var19, (byte)1);
               SpritePixels var15 = new SpritePixels(this.regionX * -1738875584, -1738875584 * this.regionX);
               SpritePixels.method12620(var15);
               if (null != this.worldMapData_0) {
                  this.method7032(var2, var3, var14, (short)3803);
               } else {
                  this.method7038(var2, var3, var14, -944429631);
               }

               IntProjection.method6177(var15, 1250341663 * this.backgroundColor, -863231161 * this.pixelsPerTile, -631149707 * this.regionX, -258337276);
               this.method7016(1784826702);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;)V")
   @ObfuscatedName("cd")
   void method7028(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3, -426449844);
      this.drawMapLinks(var1, var2, var4, var3, -661049808);
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cj")
   void method7039(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (WorldMapData_1 var5 : this.worldMapData1List) {
         for (int var6 = var5.getChunkX((byte)78) * 8; var6 < var5.getChunkX((byte)18) * 8 + 8; var6++) {
            for (int var7 = var5.getChunkXLow(-1805952926) * 8; var7 < var5.getChunkXLow(210679909) * 8 + 8; var7++) {
               this.drawTileGround(var6, var7, var5, var1, var3, 1716253481);
               this.method7051(var6, var7, var5, var1, (short)382);
            }
         }
      }

      for (WorldMapData_1 var9 : this.worldMapData1List) {
         for (int var10 = var9.getChunkX((byte)99) * 8; var10 < var9.getChunkX((byte)113) * 8 + 8; var10++) {
            for (int var11 = var9.getChunkXLow(1037045549) * 8; var11 < var9.getChunkXLow(1392923978) * 8 + 8; var11++) {
               method7043(this, var10, var11, var9, var1, var2, (byte)-122);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;)V")
   @ObfuscatedName("dz")
   void method7053(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      for (int var5 = 1; var5 < var3.planes * -1789868441; var5++) {
         int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = VerticalAlignment.method4594(var6, this.regionY * 1935506723, (byte)36);
            if (var3.field3755[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(
                  this.regionX * -173504649 * var1, -631149707 * this.regionX * (63 - var2), this.regionX * -1829010362, -115799461 * this.regionX, var7
               );
            } else {
               var4.method7462(
                  var1 * -631149707 * this.regionX,
                  this.regionX * -2089265864 * (501213920 - var2),
                  0,
                  var7,
                  this.regionX * -631149707,
                  -1912600350 * this.regionX,
                  var3.field3755[var5][var1][var2],
                  var3.field3754[var5][var1][var2],
                  -1197559645
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/List;")
   @ObfuscatedName("ez")
   List method7105() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;Llu;I)V")
   @ObfuscatedName("ax")
   void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5, int var6) {
      try {
         int var7 = var3.floorUnderlayIds[0][var1][var2] - 1;
         int var8 = var3.floorOverlayIds[0][var1][var2] - 1;
         if (var7 == -1) {
            if (var6 == -2106777030) {
               throw new IllegalStateException();
            }

            if (-1 == var8) {
               if (var6 == -2106777030) {
                  throw new IllegalStateException();
               }

               Rasterizer2D.Rasterizer2D_fillRectangle(
                  var1 * -631149707 * this.regionX,
                  (63 - var2) * this.regionX * -631149707,
                  this.regionX * -631149707,
                  this.regionX * -631149707,
                  this.regionY * 1935506723
               );
            }
         }

         int var9 = 16711935;
         if (-1 != var8) {
            var9 = VerticalAlignment.method4594(var8, 1935506723 * this.regionY, (byte)77);
         }

         if (var8 > -1) {
            if (var6 == -2106777030) {
               throw new IllegalStateException();
            }

            if (var3.field3755[0][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(
                  var1 * this.regionX * -631149707, this.regionX * -631149707 * (63 - var2), -631149707 * this.regionX, this.regionX * -631149707, var9
               );
               return;
            }
         }

         int var10 = method7054(this, var1, var2, var3, var5, (byte)95);
         if (-1 == var8) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               -631149707 * this.regionX * var1, -631149707 * this.regionX * (63 - var2), -631149707 * this.regionX, this.regionX * -631149707, var10
            );
         } else {
            var4.method7462(
               var1 * -631149707 * this.regionX,
               -631149707 * this.regionX * (63 - var2),
               var10,
               var9,
               this.regionX * -631149707,
               -631149707 * this.regionX,
               var3.field3755[0][var1][var2],
               var3.field3754[0][var1][var2],
               1970613875
            );
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "lc.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhk;B)I")
   @ObfuscatedName("bz")
   int method7090(SpritePixels var1, VerticalAlignment var2, byte var3) {
      try {
         switch (-1167722475 * var2.value) {
            case 0:
               return -var1.subHeight / 2;
            case 2:
               return 0;
            default:
               return -var1.subHeight;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.bz(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cv")
   void method7035(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (int var4 = 0; var4 < 64; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3, 824066474);
            this.method7051(var4, var5, this.worldMapData_0, var1, (short)382);
         }
      }

      for (int var6 = 0; var6 < 64; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            method7043(this, var6, var7, this.worldMapData_0, var1, var2, (byte)-22);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cr")
   void method7040(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (WorldMapData_1 var5 : this.worldMapData1List) {
         for (int var6 = var5.getChunkX((byte)63) * 8; var6 < var5.getChunkX((byte)100) * 8 + 8; var6++) {
            for (int var7 = var5.getChunkXLow(-112890962) * 8; var7 < var5.getChunkXLow(1487331121) * 8 + 8; var7++) {
               this.drawTileGround(var6, var7, var5, var1, var3, -129798591);
               this.method7051(var6, var7, var5, var1, (short)382);
            }
         }
      }

      for (WorldMapData_1 var9 : this.worldMapData1List) {
         for (int var10 = var9.getChunkX((byte)4) * 8; var10 < var9.getChunkX((byte)39) * 8 + 8; var10++) {
            for (int var11 = var9.getChunkXLow(1474090352) * 8; var11 < var9.getChunkXLow(-823674195) * 8 + 8; var11++) {
               method7043(this, var10, var11, var9, var1, var2, (byte)-84);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhk;)I")
   @ObfuscatedName("er")
   int method7091(SpritePixels var1, VerticalAlignment var2) {
      switch (-1167722475 * var2.value) {
         case 0:
            return -var1.subHeight / 2;
         case 2:
            return 0;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("ca")
   void method7041(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (WorldMapData_1 var5 : this.worldMapData1List) {
         for (int var6 = var5.getChunkX((byte)32) * 8; var6 < var5.getChunkX((byte)44) * 8 + 8; var6++) {
            for (int var7 = var5.getChunkXLow(-173554392) * 8; var7 < var5.getChunkXLow(-101890231) * 8 + 8; var7++) {
               this.drawTileGround(var6, var7, var5, var1, var3, 1999088950);
               this.method7051(var6, var7, var5, var1, (short)382);
            }
         }
      }

      for (WorldMapData_1 var9 : this.worldMapData1List) {
         for (int var10 = var9.getChunkX((byte)20) * 8; var10 < var9.getChunkX((byte)98) * 8 + 8; var10++) {
            for (int var11 = var9.getChunkXLow(584332320) * 8; var11 < var9.getChunkXLow(-526846066) * 8 + 8; var11++) {
               method7043(this, var10, var11, var9, var1, var2, (byte)-98);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/List;")
   @ObfuscatedName("bm")
   List icons(int var1) {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.icon0List);
         var2.addAll(this.iconMap.values());
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lc.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;[Lxm;)V")
   @ObfuscatedName("dd")
   void method7044(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method7062(var1, var2, var3, 1055655472);
      method7060(this, var1, var2, var3, var5, (byte)124);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lhi;II)V")
   @ObfuscatedName("nx")
   public static void method7077(WorldMapRegion var0, WorldMapElement var1, int var2, int var3) {
      if (var0 == null) {
         var0.method7012();
      }

      SpritePixels var4 = var1.getSpriteBool(false, -1300845933);
      if (var4 != null) {
         int var5 = var0.method7085(var4, var1.horizontalAlignment, (byte)99);
         int var6 = var0.method7090(var4, var1.verticalAlignment, (byte)4);
         var4.method12650(var5 + var2, var6 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;[Lxm;)V")
   @ObfuscatedName("dv")
   void method7045(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method7062(var1, var2, var3, 1055655472);
      method7060(this, var1, var2, var3, var5, (byte)118);
   }

   @ObfuscatedSignature(descriptor = "(Llc;IIIII)V")
   @ObfuscatedName("zr")
   public static void method7111(WorldMapRegion var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method7113(var1, var1, var1, var1, var1);
      } else {
         try {
            var3 %= 4;
            if (0 == var3) {
               if (var5 <= 1873809856) {
                  return;
               }

               Rasterizer2D.Rasterizer2D_drawVerticalLine(
                  var1 * var0.regionX * -631149707, var0.regionX * -631149707 * (63 - var2), var0.regionX * -631149707, var4
               );
            }

            if (1 == var3) {
               if (var5 <= 1873809856) {
                  throw new IllegalStateException();
               }

               Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                  var1 * -631149707 * var0.regionX, (63 - var2) * -631149707 * var0.regionX, var0.regionX * -631149707, var4
               );
            }

            if (2 == var3) {
               if (var5 <= 1873809856) {
                  throw new IllegalStateException();
               }

               Rasterizer2D.Rasterizer2D_drawVerticalLine(
                  -631149707 * var0.regionX * var1 + var0.regionX * -631149707 - 1, var0.regionX * -631149707 * (63 - var2), -631149707 * var0.regionX, var4
               );
            }

            if (var3 == 3) {
               if (var5 <= 1873809856) {
                  throw new IllegalStateException();
               }

               Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                  var0.regionX * -631149707 * var1, (63 - var2) * -631149707 * var0.regionX + var0.regionX * -631149707 - 1, var0.regionX * -631149707, var4
               );
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "lc.bp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("cy")
   void method7036(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (int var4 = 0; var4 < 64; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3, 1967976538);
            this.method7051(var4, var5, this.worldMapData_0, var1, (short)382);
         }
      }

      for (int var6 = 0; var6 < 64; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            method7043(this, var6, var7, this.worldMapData_0, var1, var2, (byte)-61);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhl;)I")
   @ObfuscatedName("eq")
   int method7087(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value * -747709277) {
         case 0:
            return -var1.subWidth / 2;
         case 1:
            return 0;
         default:
            return -var1.subWidth;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("gq")
   public static void method7037(WorldMapRegion var0, WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      if (var0 == null) {
         var0.getMapIcons();
      }

      for (int var4 = 0; var4 < 64; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            var0.drawTileGround(var4, var5, var0.worldMapData_0, var1, var3, 770186695);
            var0.method7051(var4, var5, var0.worldMapData_0, var1, (short)382);
         }
      }

      for (int var6 = 0; var6 < 64; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            method7043(var0, var6, var7, var0.worldMapData_0, var1, var2, (byte)-38);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhk;)I")
   @ObfuscatedName("ef")
   int method7092(SpritePixels var1, VerticalAlignment var2) {
      switch (-1167722475 * var2.value) {
         case 0:
            return -var1.subHeight / 2;
         case 2:
            return 0;
         default:
            return -var1.subHeight;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;Llu;)V")
   @ObfuscatedName("at")
   public static void method7049(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      if (var0 == null) {
         var0.method7114();
      }

      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && -1 == var7) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * -631149707 * var0.regionX,
            (63 - var2) * var0.regionX * -631149707,
            var0.regionX * -631149707,
            var0.regionX * -631149707,
            var0.regionY * 1935506723
         );
      }

      int var8 = 16711935;
      if (-1 != var7) {
         var8 = VerticalAlignment.method4594(var7, 1935506723 * var0.regionY, (byte)13);
      }

      if (var7 > -1 && var3.field3755[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * var0.regionX * -631149707, var0.regionX * -631149707 * (63 - var2), -631149707 * var0.regionX, var0.regionX * -631149707, var8
         );
      } else {
         int var9 = method7054(var0, var1, var2, var3, var5, (byte)-36);
         if (-1 == var7) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               -631149707 * var0.regionX * var1, -631149707 * var0.regionX * (63 - var2), -631149707 * var0.regionX, var0.regionX * -631149707, var9
            );
         } else {
            var4.method7462(
               var1 * -631149707 * var0.regionX,
               -631149707 * var0.regionX * (63 - var2),
               var9,
               var8,
               var0.regionX * -631149707,
               -631149707 * var0.regionX,
               var3.field3755[0][var1][var2],
               var3.field3754[0][var1][var2],
               -1406969921
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;[Lxm;)V")
   @ObfuscatedName("dj")
   void method7057(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < 2122458790 * var3.planes; var5++) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (null != var6 && 0 != var6.length) {
            WorldMapDecoration[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration * 774297171;
               boolean var10 = var11 >= 959302362 * WorldMapDecorationType.field4723.id && var11 <= -13030657 * WorldMapDecorationType.field4722.id;
               if (!var10) {
                  int var13 = 774297171 * var9.decoration;
                  boolean var12 = var13 == -1814583223 * WorldMapDecorationType.field4720.id;
                  if (!var12) {
                     continue;
                  }
               }

               ObjectComposition var14 = AsyncHttpResponse.getObjectDefinition(var9.objectDefinitionId * -2069954308, 2032825956);
               if (-1 != var14.mapSceneId * 93759001) {
                  int var15 = var9.rotation * -945438443 != 1 && 3 != var9.rotation * 1363852559 ? var14.sizeY * -352504863 : -1343992093 * var14.sizeX;
                  var4[1210674550 * var14.mapSceneId]
                     .method12433(
                        var1 * -1587235391 * this.regionX, 1785563670 * this.regionX * (64 - var15 - var2), this.regionX * 885962984, this.regionX * -330474120
                     );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;Lhi;I)Llv;")
   @ObfuscatedName("wc")
   public static WorldMapLabel method7098(WorldMapRegion var0, WorldMapElement var1, int var2) {
      if (var0 == null) {
         return var0.createMapLabel(var1, var2);
      } else {
         try {
            if (null != var1.menuTargetName) {
               if (var2 >= 854845213) {
                  throw new IllegalStateException();
               }

               if (null != var0.fonts) {
                  if (var2 >= 854845213) {
                     throw new IllegalStateException();
                  }

                  if (var0.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
                     int var4 = var1.textSize * 1000629255;
                     WorldMapLabelSize[] var5 = new WorldMapLabelSize[]{
                        WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small
                     };
                     WorldMapLabelSize[] var6 = var5;
                     int var7 = 0;

                     WorldMapLabelSize var3;
                     while (true) {
                        if (var7 >= var6.length) {
                           var3 = null;
                           break;
                        }

                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        WorldMapLabelSize var8 = var6[var7];
                        if (var8.field3734 * 1938465625 == var4) {
                           if (var2 >= 854845213) {
                              throw new IllegalStateException();
                           }

                           var3 = var8;
                           break;
                        }

                        var7++;
                     }

                     if (null == var3) {
                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }

                     Font var16 = (Font)var0.fonts.get(var3);
                     if (null == var16) {
                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }

                     var7 = var16.lineCount(var1.menuTargetName, 1000000);
                     String[] var18 = new String[var7];
                     var16.breakLines(var1.menuTargetName, null, var18);
                     int var9 = var16.ascent * var18.length / 2;
                     int var10 = 0;
                     String[] var11 = var18;

                     for (int var12 = 0; var12 < var11.length; var12++) {
                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        String var13 = var11[var12];
                        int var14 = var16.stringWidth(var13);
                        if (var14 > var10) {
                           if (var2 >= 854845213) {
                              throw new IllegalStateException();
                           }

                           var10 = var14;
                        }
                     }

                     return new WorldMapLabel(var1.menuTargetName, var10, var9, var3);
                  }

                  if (var2 >= 854845213) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "lc.bb(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;[Lxm;)V")
   @ObfuscatedName("da")
   void method7058(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < -1789868441 * var3.planes; var5++) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (null != var6 && 0 != var6.length) {
            WorldMapDecoration[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration * -770675871;
               boolean var10 = var11 >= 93422969 * WorldMapDecorationType.field4723.id && var11 <= 481084454 * WorldMapDecorationType.field4722.id;
               if (!var10) {
                  int var13 = 774297171 * var9.decoration;
                  boolean var12 = var13 == 783896376 * WorldMapDecorationType.field4720.id;
                  if (!var12) {
                     continue;
                  }
               }

               ObjectComposition var14 = AsyncHttpResponse.getObjectDefinition(var9.objectDefinitionId * 1508500333, 2021442421);
               if (-1 != var14.mapSceneId * 93759001) {
                  int var15 = var9.rotation * -945438443 != 1 && 3 != var9.rotation * -945438443 ? var14.sizeY * -352504863 : 1813358617 * var14.sizeX;
                  var4[93759001 * var14.mapSceneId]
                     .method12433(
                        var1 * 1369049206 * this.regionX, -631149707 * this.regionX * (64 - var15 - var2), this.regionX * -60168125, this.regionX * -1262299414
                     );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;[Lxm;)V")
   @ObfuscatedName("dl")
   void method7059(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < -1789868441 * var3.planes; var5++) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (null != var6 && 0 != var6.length) {
            WorldMapDecoration[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; var8++) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration * 774297171;
               boolean var10 = var11 >= -13030657 * WorldMapDecorationType.field4723.id && var11 <= -883637061 * WorldMapDecorationType.field4722.id;
               if (!var10) {
                  int var13 = 774297171 * var9.decoration;
                  boolean var12 = var13 == 955156526 * WorldMapDecorationType.field4720.id;
                  if (!var12) {
                     continue;
                  }
               }

               ObjectComposition var14 = AsyncHttpResponse.getObjectDefinition(var9.objectDefinitionId * 1272159550, 2102211949);
               if (-1 != var14.mapSceneId * 93759001) {
                  int var15 = var9.rotation * -945438443 != 1 && 3 != var9.rotation * 1103333738 ? var14.sizeY * -352504863 : 586457702 * var14.sizeX;
                  var4[93759001 * var14.mapSceneId]
                     .method12433(
                        var1 * -631149707 * this.regionX,
                        -259827299 * this.regionX * (-501707573 - var15 - var2),
                        this.regionX * -1262299414,
                        this.regionX * -1262299414
                     );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;)V")
   @ObfuscatedName("dr")
   void method7063(int var1, int var2, AbstractWorldMapData var3) {
      for (int var4 = 0; var4 < -1789868441 * var3.planes; var4++) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (null != var5 && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for (int var7 = 0; var7 < var6.length; var7++) {
               WorldMapDecoration var8 = var6[var7];
               int var10 = 774297171 * var8.decoration;
               boolean var9 = var10 >= -13030657 * WorldMapDecorationType.field4701.id && var10 <= -13030657 * WorldMapDecorationType.field4706.id
                  || var10 == WorldMapDecorationType.field4705.id * -13030657;
               if (var9) {
                  ObjectComposition var11 = AsyncHttpResponse.getObjectDefinition(var8.objectDefinitionId * 1508500333, 2040490539);
                  int var12 = 0 != var11.int1 * -1900812067 ? -3407872 : -3355444;
                  if (var8.decoration * 774297171 == WorldMapDecorationType.field4701.id * -13030657) {
                     method7111(this, var1, var2, -945438443 * var8.rotation, var12, 2142537037);
                  }

                  if (WorldMapDecorationType.field4703.id * -13030657 == var8.decoration * 774297171) {
                     method7111(this, var1, var2, var8.rotation * -945438443, -3355444, 1999152252);
                     method7111(this, var1, var2, -945438443 * var8.rotation + 1, var12, 2124078153);
                  }

                  if (-13030657 * WorldMapDecorationType.field4706.id == var8.decoration * 774297171) {
                     if (var8.rotation * -945438443 == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var1 * this.regionX * -631149707, -631149707 * this.regionX * (63 - var2), 1, var12);
                     }

                     if (1 == -945438443 * var8.rotation) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                           -631149707 * this.regionX + var1 * -631149707 * this.regionX - 1, (63 - var2) * -631149707 * this.regionX, 1, var12
                        );
                     }

                     if (-945438443 * var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                           var1 * -631149707 * this.regionX + this.regionX * -631149707 - 1,
                           -631149707 * this.regionX * (63 - var2) + -631149707 * this.regionX - 1,
                           1,
                           var12
                        );
                     }

                     if (3 == -945438443 * var8.rotation) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                           var1 * this.regionX * -631149707, this.regionX * -631149707 + (63 - var2) * -631149707 * this.regionX - 1, 1, var12
                        );
                     }
                  }

                  if (var8.decoration * 774297171 == -13030657 * WorldMapDecorationType.field4705.id) {
                     int var13 = -945438443 * var8.rotation % 2;
                     if (0 == var13) {
                        for (int var15 = 0; var15 < -631149707 * this.regionX; var15++) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                              var15 + -631149707 * this.regionX * var1, (64 - var2) * -631149707 * this.regionX - 1 - var15, 1, var12
                           );
                        }
                     } else {
                        for (int var14 = 0; var14 < -631149707 * this.regionX; var14++) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(
                              -631149707 * this.regionX * var1 + var14, -631149707 * this.regionX * (63 - var2) + var14, 1, var12
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;I)V")
   @ObfuscatedName("dx")
   void method7064(int var1, int var2, HashSet var3, int var4) {
      float var5 = var4 / 64.0F;
      float var6 = var5 / 2.0F;

      for (Entry var8 : this.iconMap.entrySet()) {
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)(var9.x * -1931160809 * var5 + var1 - var6);
         int var11 = (int)(var4 + var2 - -263036313 * var9.y * var5 - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && AbstractWorldMapIcon.method7521(var12, 1221872525)) {
            var12.screenX = 486465835 * var10;
            var12.screenY = 1808525725 * var11;
            WorldMapElement var13 = class463.WorldMapElement_get(var12.getElement(1086511268), (byte)0);
            if (!var3.contains(var13.getObjectId(-482015941))) {
               method7074(this, var12, var10, var11, var5, (byte)44);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("cz")
   void method7067(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.icon0List) {
         if (AbstractWorldMapIcon.method7521(var5, -463222102)) {
            WorldMapElement var6 = class463.WorldMapElement_get(var5.getElement(-868439392), (byte)0);
            if (null != var6 && var1.contains(var6.getObjectId(-2057893663))) {
               this.drawBackgroundCircle(var6, var5.screenX * 138734266, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("dm")
   void method7068(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.icon0List) {
         if (AbstractWorldMapIcon.method7521(var5, 1535240626)) {
            WorldMapElement var6 = class463.WorldMapElement_get(var5.getElement(-1708777881), (byte)0);
            if (null != var6 && var1.contains(var6.getObjectId(-1437064698))) {
               this.drawBackgroundCircle(var6, var5.screenX * 1992256035, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;IILlq;[Lxm;B)V")
   @ObfuscatedName("tt")
   public static void method7060(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4, byte var5) {
      if (var0 == null) {
         var0.method7061(var1, var1, var3, var4, var5);
      } else {
         try {
            for (int var6 = 0; var6 < -1789868441 * var3.planes; var6++) {
               WorldMapDecoration[] var7 = var3.decorations[var6][var1][var2];
               if (null != var7 && 0 != var7.length) {
                  WorldMapDecoration[] var8 = var7;

                  for (int var9 = 0; var9 < var8.length; var9++) {
                     WorldMapDecoration var10;
                     boolean var10000;
                     label97: {
                        var10 = var8[var9];
                        int var12 = var10.decoration * 774297171;
                        if (var12 >= -13030657 * WorldMapDecorationType.field4723.id) {
                           if (var5 <= 8) {
                              throw new IllegalStateException();
                           }

                           if (var12 <= -13030657 * WorldMapDecorationType.field4722.id) {
                              if (var5 <= 8) {
                                 throw new IllegalStateException();
                              }

                              var10000 = 1;
                              break label97;
                           }
                        }

                        var10000 = 0;
                     }

                     boolean var11 = (boolean)var10000;
                     if (!var11) {
                        if (var5 <= 8) {
                           throw new IllegalStateException();
                        }

                        int var14 = 774297171 * var10.decoration;
                        if (var14 == -13030657 * WorldMapDecorationType.field4720.id) {
                           if (var5 <= 8) {
                              return;
                           }

                           var10000 = (boolean)1;
                        } else {
                           var10000 = (boolean)0;
                        }

                        boolean var13 = var10000;
                        if (!var13) {
                           if (var5 <= 8) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }

                     ObjectComposition var16 = AsyncHttpResponse.getObjectDefinition(var10.objectDefinitionId * 1508500333, 2014984004);
                     if (-1 != var16.mapSceneId * 93759001) {
                        if (var5 <= 8) {
                           throw new IllegalStateException();
                        }

                        label83: {
                           if (var10.rotation * -945438443 != 1) {
                              if (3 != var10.rotation * -945438443) {
                                 var10000 = var16.sizeY * -352504863;
                                 break label83;
                              }

                              if (var5 <= 8) {
                                 throw new IllegalStateException();
                              }
                           }

                           var10000 = 1813358617 * var16.sizeX;
                        }

                        int var17 = var10000;
                        var4[93759001 * var16.mapSceneId]
                           .method12433(
                              var1 * -631149707 * var0.regionX,
                              -631149707 * var0.regionX * (64 - var17 - var2),
                              var0.regionX * -1262299414,
                              var0.regionX * -1262299414
                           );
                     }
                  }
               }
            }
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "lc.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("dp")
   void method7069(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.icon0List) {
         if (AbstractWorldMapIcon.method7521(var5, 1477512717)) {
            WorldMapElement var6 = class463.WorldMapElement_get(var5.getElement(-765799339), (byte)0);
            if (null != var6 && var1.contains(var6.getObjectId(-473420857))) {
               this.drawBackgroundCircle(var6, var5.screenX * -1481714301, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lmr;[Lxm;Llu;)V")
   @ObfuscatedName("lh")
   public static void method7042(WorldMapRegion var0, WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      for (WorldMapData_1 var5 : var0.worldMapData1List) {
         for (int var6 = var5.getChunkX((byte)99) * 8; var6 < var5.getChunkX((byte)118) * 8 + 8; var6++) {
            for (int var7 = var5.getChunkXLow(-1223209160) * 8; var7 < var5.getChunkXLow(-1729932835) * 8 + 8; var7++) {
               var0.drawTileGround(var6, var7, var5, var1, var3, -1943175801);
               var0.method7051(var6, var7, var5, var1, (short)382);
            }
         }
      }

      for (WorldMapData_1 var9 : var0.worldMapData1List) {
         for (int var10 = var9.getChunkX((byte)54) * 8; var10 < var9.getChunkX((byte)103) * 8 + 8; var10++) {
            for (int var11 = var9.getChunkXLow(-981046613) * 8; var11 < var9.getChunkXLow(1887713501) * 8 + 8; var11++) {
               method7043(var0, var10, var11, var9, var1, var2, (byte)-14);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("dq")
   void method7070(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.icon0List) {
         if (AbstractWorldMapIcon.method7521(var5, -1501979259)) {
            WorldMapElement var6 = class463.WorldMapElement_get(var5.getElement(90170295), (byte)0);
            if (null != var6 && var1.contains(var6.getObjectId(-1922180201))) {
               this.drawBackgroundCircle(var6, var5.screenX * -1481714301, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;IIII)V")
   @ObfuscatedName("dg")
   void method7073(WorldMapElement var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.getSpriteBool(false, -1431658397);
      if (var6 != null) {
         var6.method12650(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;III)V")
   @ObfuscatedName("bt")
   static void method6987(SpritePixels var0, int var1, int var2, int var3) {
      DemotingHashTable var4 = WorldMapRegion_cachedSprites;
      long var6 = var3 << 16 | var1 << 8 | var2;
      var4.put(var0, var6, 4 * var0.pixels.length);
   }

   @ObfuscatedSignature(descriptor = "(Lms;Lhi;IIF)V")
   @ObfuscatedName("dk")
   void method7080(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel((byte)127);
      if (null != var6) {
         if (var6.size.method7217(var5, 1921850268)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            AbstractFont.method10416(
               var7,
               var6.text,
               var3 - -1322204423 * var6.height / 2,
               var4,
               var6.height * -476769860,
               var6.width * -1856008111,
               -1849008243 | 318482084 * var2.field2218,
               0,
               1,
               0,
               var7.ascent / 2
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lms;Lhi;IIF)V")
   @ObfuscatedName("dn")
   void method7081(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel((byte)38);
      if (null != var6) {
         if (var6.size.method7217(var5, 1456866650)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            AbstractFont.method10416(
               var7,
               var6.text,
               var3 - -1322204423 * var6.height / 2,
               var4,
               var6.height * -1322204423,
               var6.width * -1989742749,
               0xFF000000 | -1733851579 * var2.field2218,
               0,
               1,
               0,
               var7.ascent / 2
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;II)V")
   @ObfuscatedName("du")
   void method7031(HashSet var1, int var2, int var3) {
      for (AbstractWorldMapIcon var5 : this.iconMap.values()) {
         if (AbstractWorldMapIcon.method7521(var5, -671665256)) {
            int var6 = var5.getElement(488192484);
            if (var1.contains(var6)) {
               WorldMapElement var7 = class463.WorldMapElement_get(var6, (byte)0);
               this.drawBackgroundCircle(var7, var5.screenX * -1481714301, 915727541 * var5.screenY, var2, var3, 1361532286);
            }
         }
      }

      this.method7066(var1, var2, var3, -761294231);
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhl;)I")
   @ObfuscatedName("es")
   int method7088(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value * -747709277) {
         case 0:
            return -var1.subWidth / 2;
         case 1:
            return 0;
         default:
            return -var1.subWidth;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;)Ljava/util/List;")
   @ObfuscatedName("yu")
   public static List method7107(WorldMapRegion var0) {
      if (var0 == null) {
         var0.method7110();
      }

      LinkedList var1 = new LinkedList();
      var1.addAll(var0.icon0List);
      var1.addAll(var0.iconMap.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;Lhk;)I")
   @ObfuscatedName("ek")
   int method7093(SpritePixels var1, VerticalAlignment var2) {
      switch (-1167722475 * var2.value) {
         case 0:
            return -var1.subHeight / 2;
         case 2:
            return 0;
         default:
            return -var1.subHeight;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;)Ljava/util/List;")
   @ObfuscatedName("vq")
   public static List method7108(WorldMapRegion var0) {
      if (var0 == null) {
         return var0.method7105();
      } else {
         LinkedList var1 = new LinkedList();
         var1.addAll(var0.icon0List);
         var1.addAll(var0.iconMap.values());
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llv;")
   @ObfuscatedName("em")
   WorldMapLabel method7096(int var1) {
      WorldMapElement var2 = class463.WorldMapElement_get(var1, (byte)0);
      return method7098(this, var2, -1252338480);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   void method7012() {
      for (AbstractWorldMapIcon var2 : this.iconMap.values()) {
         if (var2 instanceof WorldMapIcon_1) {
            ((WorldMapIcon_1)var2).init((byte)50);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;)Llv;")
   @ObfuscatedName("el")
   WorldMapLabel method7099(WorldMapElement var1) {
      if (null != var1.menuTargetName && null != this.fonts && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         int var3 = var1.textSize * 1000629255;
         WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{
            WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small
         };
         WorldMapLabelSize[] var5 = var4;
         int var6 = 0;

         WorldMapLabelSize var2;
         while (true) {
            if (var6 >= var5.length) {
               var2 = null;
               break;
            }

            WorldMapLabelSize var7 = var5[var6];
            if (var7.field3734 * 1938465625 == var3) {
               var2 = var7;
               break;
            }

            var6++;
         }

         if (null == var2) {
            return null;
         } else {
            Font var14 = (Font)this.fonts.get(var2);
            if (null == var14) {
               return null;
            } else {
               var6 = var14.lineCount(var1.menuTargetName, 1000000);
               String[] var16 = new String[var6];
               var14.breakLines(var1.menuTargetName, null, var16);
               int var8 = var14.ascent * var16.length / 2;
               int var9 = 0;
               String[] var10 = var16;

               for (int var11 = 0; var11 < var10.length; var11++) {
                  String var12 = var10[var11];
                  int var13 = var14.stringWidth(var12);
                  if (var13 > var9) {
                     var9 = var13;
                  }
               }

               return new WorldMapLabel(var1.menuTargetName, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Llu;)I")
   @ObfuscatedName("sf")
   public static int method7055(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      if (var0 == null) {
         var0.method7011();
      }

      return var3.floorUnderlayIds[0][var1][var2] == 0 ? 1935506723 * var0.regionY : var4.getTileColor(var1, var2, -1680664277);
   }

   @ObfuscatedSignature(descriptor = "(Lhi;)Llv;")
   @ObfuscatedName("ep")
   WorldMapLabel method7100(WorldMapElement var1) {
      if (null != var1.menuTargetName && null != this.fonts && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         int var3 = var1.textSize * 1000629255;
         WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{
            WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small
         };
         WorldMapLabelSize[] var5 = var4;
         int var6 = 0;

         WorldMapLabelSize var2;
         while (true) {
            if (var6 >= var5.length) {
               var2 = null;
               break;
            }

            WorldMapLabelSize var7 = var5[var6];
            if (var7.field3734 * 1938465625 == var3) {
               var2 = var7;
               break;
            }

            var6++;
         }

         if (null == var2) {
            return null;
         } else {
            Font var14 = (Font)this.fonts.get(var2);
            if (null == var14) {
               return null;
            } else {
               var6 = var14.lineCount(var1.menuTargetName, -463904892);
               String[] var16 = new String[var6];
               var14.breakLines(var1.menuTargetName, null, var16);
               int var8 = var14.ascent * var16.length / 2;
               int var9 = 0;
               String[] var10 = var16;

               for (int var11 = 0; var11 < var10.length; var11++) {
                  String var12 = var10[var11];
                  int var13 = var14.stringWidth(var12);
                  if (var13 > var9) {
                     var9 = var13;
                  }
               }

               return new WorldMapLabel(var1.menuTargetName, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;ILmr;[Lxm;Lqm;Lqm;D)V")
   @ObfuscatedName("cy")
   public static void method7026(
      WorldMapRegion var0, int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6
   ) {
      if (var0 == null) {
         var0.method7095(var1);
      }

      var0.regionX = 1581438778 * var1;
      if (null != var0.worldMapData_0 || !var0.worldMapData1List.isEmpty()) {
         int var9 = var0.backgroundColor * -659714721;
         int var10 = var0.pixelsPerTile * -704728225;
         DemotingHashTable var11 = WorldMapRegion_cachedSprites;
         long var12 = var1 << 16 | var9 << 8 | var10;
         SpritePixels var8 = (SpritePixels)var11.get(var12);
         if (null == var8) {
            if (Rasterizer3D.method5835() != var6) {
               Rasterizer3D.buildPalette(var6);
            }

            boolean var16 = true;
            boolean var17 = var16 & var0.loadGeography(var4, 1102852610);
            int var13;
            if (var0.worldMapData_0 != null) {
               var13 = 2080583947 * var0.worldMapData_0.groupId;
            } else {
               var13 = ((AbstractWorldMapData)var0.worldMapData1List.getFirst()).groupId * 459930038;
            }

            boolean var18 = var17 & var5.tryLoadGroup(var13, -1294204602);
            if (var18) {
               byte[] var19 = var5.takeFileFlat(var13, -215870377);
               WorldMapSprite var14 = WorldEntityCoord.method6245(var19, (byte)1);
               SpritePixels var15 = new SpritePixels(var0.regionX * -1738875584, 51732031 * var0.regionX);
               SpritePixels.method12620(var15);
               if (null != var0.worldMapData_0) {
                  var0.method7032(var2, var3, var14, (short)3803);
               } else {
                  var0.method7038(var2, var3, var14, -944429631);
               }

               IntProjection.method6177(var15, -1798059444 * var0.backgroundColor, -1974433223 * var0.pixelsPerTile, -631149707 * var0.regionX, 543047715);
               var0.method7016(1883676390);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Ljava/util/List;")
   @ObfuscatedName("et")
   List method7103(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var2 + var3) {
            for (AbstractWorldMapIcon var8 : this.iconMap.values()) {
               if (AbstractWorldMapIcon.method7521(var8, 1281659208) && var8.fitsScreen(var4, var5, 1357744144)) {
                  var6.add(var8);
               }
            }

            for (AbstractWorldMapIcon var10 : this.icon0List) {
               if (AbstractWorldMapIcon.method7521(var10, 1191294742) && var10.fitsScreen(var4, var5, 197495703)) {
                  var6.add(var10);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Ljava/util/List;")
   @ObfuscatedName("ex")
   List method7104(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var2 + var3) {
            for (AbstractWorldMapIcon var8 : this.iconMap.values()) {
               if (AbstractWorldMapIcon.method7521(var8, 1183019304) && var8.fitsScreen(var4, var5, -132864403)) {
                  var6.add(var8);
               }
            }

            for (AbstractWorldMapIcon var10 : this.icon0List) {
               if (AbstractWorldMapIcon.method7521(var10, 956831388) && var10.fitsScreen(var4, var5, 1549881599)) {
                  var6.add(var10);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V")
   @ObfuscatedName("am")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = var4 / 64.0F;
         float var7 = var6 / 2.0F;
         Iterator var8 = this.iconMap.entrySet().iterator();

         while (var8.hasNext()) {
            if (var5 <= -1220915920) {
               return;
            }

            Entry var9 = (Entry)var8.next();
            Coord var10 = (Coord)var9.getKey();
            int var11 = (int)(var10.x * -1931160809 * var6 + var1 - var7);
            int var12 = (int)(var4 + var2 - -263036313 * var10.y * var6 - var7);
            AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var9.getValue();
            if (var13 != null) {
               if (var5 <= -1220915920) {
                  throw new IllegalStateException();
               }

               if (AbstractWorldMapIcon.method7521(var13, 491613293)) {
                  if (var5 <= -1220915920) {
                     return;
                  }

                  var13.screenX = 486465835 * var11;
                  var13.screenY = 1808525725 * var12;
                  WorldMapElement var14 = class463.WorldMapElement_get(var13.getElement(1048141608), (byte)0);
                  if (!var3.contains(var14.getObjectId(-460977716))) {
                     if (var5 <= -1220915920) {
                        throw new IllegalStateException();
                     }

                     method7074(this, var13, var11, var12, var6, (byte)115);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lc.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/List;")
   @ObfuscatedName("eu")
   List method7109() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/List;")
   @ObfuscatedName("ev")
   List method7110() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eh")
   void method7112(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (0 == var3) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(
            var1 * this.regionX * 948179255, this.regionX * -631149707 * (854241987 - var2), this.regionX * -631149707, var4
         );
      }

      if (1 == var3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(
            var1 * -631149707 * this.regionX, (63 - var2) * -1979660354 * this.regionX, this.regionX * -631149707, var4
         );
      }

      if (2 == var3) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(
            -631149707 * this.regionX * var1 + this.regionX * 33658545 - 1, this.regionX * -631149707 * (-48072188 - var2), -787152888 * this.regionX, var4
         );
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(
            this.regionX * -631149707 * var1, (1165634194 - var2) * -631149707 * this.regionX + this.regionX * 477625790 - 1, this.regionX * -514667586, var4
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;Llu;)V")
   @ObfuscatedName("dc")
   void method7050(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && -1 == var7) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * -631149707 * this.regionX,
            (63 - var2) * this.regionX * -631149707,
            this.regionX * -631149707,
            this.regionX * -631149707,
            this.regionY * 1935506723
         );
      }

      int var8 = 16711935;
      if (-1 != var7) {
         var8 = VerticalAlignment.method4594(var7, 1935506723 * this.regionY, (byte)97);
      }

      if (var7 > -1 && var3.field3755[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(
            var1 * this.regionX * -631149707, this.regionX * -631149707 * (63 - var2), -631149707 * this.regionX, this.regionX * -631149707, var8
         );
      } else {
         int var9 = method7054(this, var1, var2, var3, var5, (byte)71);
         if (-1 == var7) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               -631149707 * this.regionX * var1, -631149707 * this.regionX * (63 - var2), -631149707 * this.regionX, this.regionX * -631149707, var9
            );
         } else {
            var4.method7462(
               var1 * -631149707 * this.regionX,
               -631149707 * this.regionX * (63 - var2),
               var9,
               var8,
               this.regionX * -631149707,
               -631149707 * this.regionX,
               var3.field3755[0][var1][var2],
               var3.field3754[0][var1][var2],
               107041805
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhv;")
   @ObfuscatedName("av")
   public static WorldEntityConfig method6991(int var0, byte var1) {
      try {
         WorldEntityConfig var2 = (WorldEntityConfig)class402.method8806(WorldEntityConfig.field2374, var0);
         if (var2 != null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = HttpAuthenticationHeader.field5852.getFile(72, var0, 1065001810);
            var2 = new WorldEntityConfig();
            var2.id = -1089946271 * var0;
            if (null != var3) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2.method4739(new Buffer(var3), -1035328937);
            }

            var2.method4748(-521677348);
            WorldEntityConfig.field2374.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("aj")
   public static int method6992(int var0, int var1, byte var2) {
      try {
         int var3 = var1 - var0 & 2047;
         if (var3 > 1024) {
            if (var2 <= 8) {
               throw new IllegalStateException();
            } else {
               return -(2048 - var3);
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lc.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lms;IIFB)V")
   @ObfuscatedName("aq")
   void method7075(AbstractWorldMapIcon var1, int var2, int var3, float var4, byte var5) {
      try {
         WorldMapElement var6 = class463.WorldMapElement_get(var1.getElement(-1709690705), (byte)0);
         method7076(this, var6, var2, var3, 2057130196);
         this.method7079(var1, var6, var2, var3, var4, -1166551005);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lc.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bp")
   void method7113(int var1, int var2, int var3, int var4, int var5) {
      try {
         var3 %= 4;
         if (0 == var3) {
            if (var5 <= 1873809856) {
               return;
            }

            Rasterizer2D.Rasterizer2D_drawHorizontalLine(
               var1 * this.pixelsPerTile * -631149707, this.pixelsPerTile * -631149707 * (63 - var2), this.backgroundColor * -631149707, var4
            );
         }

         if (1 == var3) {
            if (var5 <= 1873809856) {
               throw new IllegalStateException();
            }

            Rasterizer2D.method12558(var1 * -631149707 * this.regionX, (63 - var2) * -631149707 * this.regionX, this.backgroundColor * -631149707, var4);
         }

         if (2 == var3) {
            if (var5 <= 1873809856) {
               throw new IllegalStateException();
            }

            Rasterizer2D.Rasterizer2D_drawHorizontalLine(
               -631149707 * this.backgroundColor * var1 + this.pixelsPerTile * -631149707 - 1,
               this.regionX * -631149707 * (63 - var2),
               -631149707 * this.regionY,
               var4
            );
         }

         if (var3 == 3) {
            if (var5 <= 1873809856) {
               throw new IllegalStateException();
            }

            Rasterizer2D.method12557(
               this.regionX * -631149707 * var1, (63 - var2) * -631149707 * this.regionY + this.regionX * -631149707 - 1, this.regionY * -631149707, var4
            );
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lld;Ljava/util/List;)V")
   @ObfuscatedName("bh")
   void method7000(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2, (byte)59);
   }

   @ObfuscatedSignature(descriptor = "(Lhi;III)V")
   @ObfuscatedName("be")
   void method7078(WorldMapElement var1, int var2, int var3, int var4) {
      try {
         SpritePixels var5 = var1.getSpriteBool(false, 660677213);
         if (var5 != null) {
            if (var4 == 49018164) {
               return;
            }

            int var6 = this.method7085(var5, var1.horizontalAlignment, (byte)99);
            int var7 = this.method7090(var5, var1.verticalAlignment, (byte)4);
            var5.drawTransBgAt(var6 + var2, var7 + var3);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "lc.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Llu;B)I")
   @ObfuscatedName("ah")
   int method7056(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4, byte var5) {
      try {
         if (var3.floorOverlayIds[0][var1][var2] == 0) {
            if (var5 == 1) {
               throw new IllegalStateException();
            } else {
               return 1935506723 * this.pixelsPerTile;
            }
         } else {
            return var4.getTileColor(var1, var2, 1807549016);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lc.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;[Lxm;B)V")
   @ObfuscatedName("al")
   void method7061(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4, byte var5) {
      try {
         for (int var6 = 0; var6 < -1789868441 * var3.minPlane; var6++) {
            WorldMapDecoration[] var7 = var3.decorations[var6][var1][var2];
            if (null != var7 && 0 != var7.length) {
               WorldMapDecoration[] var8 = var7;

               for (int var9 = 0; var9 < var8.length; var9++) {
                  WorldMapDecoration var10;
                  boolean var10000;
                  label95: {
                     var10 = var8[var9];
                     int var12 = var10.objectDefinitionId * 774297171;
                     if (var12 >= -13030657 * WorldMapDecorationType.field4703.id) {
                        if (var5 <= 8) {
                           throw new IllegalStateException();
                        }

                        if (var12 <= -13030657 * WorldMapDecorationType.field4710.id) {
                           if (var5 <= 8) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                           break label95;
                        }
                     }

                     var10000 = 0;
                  }

                  boolean var11 = (boolean)var10000;
                  if (!var11) {
                     if (var5 <= 8) {
                        throw new IllegalStateException();
                     }

                     int var14 = 774297171 * var10.objectDefinitionId;
                     if (var14 == -13030657 * WorldMapDecorationType.field4708.id) {
                        if (var5 <= 8) {
                           return;
                        }

                        var10000 = (boolean)1;
                     } else {
                        var10000 = (boolean)0;
                     }

                     boolean var13 = var10000;
                     if (!var13) {
                        if (var5 <= 8) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  ObjectComposition var16 = AsyncHttpResponse.getObjectDefinition(var10.decoration * 1508500333, 2014984004);
                  if (-1 != var16.ambientSoundId * 93759001) {
                     if (var5 <= 8) {
                        throw new IllegalStateException();
                     }

                     label81: {
                        if (var10.rotation * -945438443 != 1) {
                           if (3 != var10.objectDefinitionId * -945438443) {
                              var10000 = var16.int2 * -352504863;
                              break label81;
                           }

                           if (var5 <= 8) {
                              throw new IllegalStateException();
                           }
                        }

                        var10000 = 1813358617 * var16.int7;
                     }

                     int var17 = var10000;
                     var4[93759001 * var16.int6]
                        .method12437(
                           var1 * -631149707 * this.backgroundColor,
                           -631149707 * this.regionX * (64 - var17 - var2),
                           this.pixelsPerTile * -1262299414,
                           this.pixelsPerTile * -1262299414
                        );
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lc.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhi;I)Llv;")
   @ObfuscatedName("bb")
   WorldMapLabel createMapLabel(WorldMapElement var1, int var2) {
      try {
         if (null != var1.name) {
            if (var2 >= 854845213) {
               throw new IllegalStateException();
            }

            if (null != this.fonts) {
               if (var2 >= 854845213) {
                  throw new IllegalStateException();
               }

               if (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_large) != null) {
                  int var4 = var1.category * 1000629255;
                  WorldMapLabelSize[] var5 = new WorldMapLabelSize[]{
                     WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_large
                  };
                  WorldMapLabelSize[] var6 = var5;
                  int var7 = 0;

                  WorldMapLabelSize var3;
                  while (true) {
                     if (var7 >= var6.length) {
                        var3 = null;
                        break;
                     }

                     if (var2 >= 854845213) {
                        throw new IllegalStateException();
                     }

                     WorldMapLabelSize var8 = var6[var7];
                     if (var8.field3734 * 1938465625 == var4) {
                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        var3 = var8;
                        break;
                     }

                     var7++;
                  }

                  if (null == var3) {
                     if (var2 >= 854845213) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  Font var16 = (Font)this.fonts.get(var3);
                  if (null == var16) {
                     if (var2 >= 854845213) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var7 = var16.method10398(var1.name, 1000000);
                  String[] var18 = new String[var7];
                  var16.method10390(var1.name, null, var18);
                  int var9 = var16.maxDescent * var18.length / 2;
                  int var10 = 0;
                  String[] var11 = var18;

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     if (var2 >= 854845213) {
                        throw new IllegalStateException();
                     }

                     String var13 = var11[var12];
                     int var14 = var16.getTextWidth(var13);
                     if (var14 > var10) {
                        if (var2 >= 854845213) {
                           throw new IllegalStateException();
                        }

                        var10 = var14;
                     }
                  }

                  return new WorldMapLabel(var1.menuTargetName, var10, var9, var3);
               }

               if (var2 >= 854845213) {
                  throw new IllegalStateException();
               }
            }
         }

         return null;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lc.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlq;Lmr;[Lxm;B)V")
   @ObfuscatedName("ab")
   void method7046(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5, byte var6) {
      try {
         this.method7062(var1, var2, var3, 1055655472);
         method7060(this, var1, var2, var3, var5, (byte)14);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lc.ab(" + ')');
      }
   }
}
